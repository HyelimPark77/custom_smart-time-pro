"""Read-only ELF page-alignment audit; ZIP alignment is a separate SDK check."""
import argparse
import json
import struct
import zipfile

p = argparse.ArgumentParser()
p.add_argument('apk')
p.add_argument('--output', required=True)
args = p.parse_args()
rows = []
with zipfile.ZipFile(args.apk) as z:
    for item in z.infolist():
        if not item.filename.endswith('.so'):
            continue
        data = z.read(item)
        if data[:4] != b'\x7fELF' or data[4:6] != b'\x02\x01':
            rows.append({'library': item.filename, 'status': 'unsupported ELF format; not checked'})
            continue
        phoff = struct.unpack_from('<Q', data, 32)[0]
        entry_size, count = struct.unpack_from('<HH', data, 54)
        loads = []
        for i in range(count):
            kind, flags, offset, vaddr, paddr, file_size, mem_size, alignment = struct.unpack_from('<IIQQQQQQ', data, phoff + i * entry_size)
            if kind == 1:
                loads.append({'align': alignment, 'offset': offset, 'vaddr': vaddr,
                              'congruent_16k': (vaddr - offset) % 16384 == 0})
        rows.append({'library': item.filename, 'compressed': item.compress_type != 0,
                     'load_segments': loads,
                     'elf_alignment_16k': bool(loads) and all(x['align'] >= 16384 and x['congruent_16k'] for x in loads)})
with open(args.output, 'w', encoding='utf-8') as f:
    json.dump(rows, f, indent=2)
print('Native libraries:', len(rows), '| 16KB ELF alignment passes:', sum(x.get('elf_alignment_16k', False) for x in rows))
