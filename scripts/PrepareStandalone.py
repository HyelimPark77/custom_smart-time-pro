# -*- coding: utf-8 -*-
"""Merge this package's three decoded APKs into an ARM64 standalone build input.
Run Rebuild.ps1 first so base-unsigned.apk contains the latest Smali changes.
Existing standalone/ is not overwritten; pass a new path as the first argument.
"""
import os, shutil, sys, zipfile, json
import xml.etree.ElementTree as ET

os.chdir(os.path.dirname(os.path.abspath(__file__)))
dest = sys.argv[1] if len(sys.argv) > 1 else 'standalone'
if os.path.exists(dest):
    raise SystemExit('Output already exists; use a new destination: ' + dest)
base = 'editable/base'
def ignore(path, names):
    return [n for n in names if n.startswith('smali') or n in ['build', 'dist', 'original']]
shutil.copytree(base, dest, ignore=ignore)
with zipfile.ZipFile('builds/base-unsigned.apk') as z:
    for name in z.namelist():
        if name.endswith('.dex'):
            target = os.path.join(dest, *name.split('/'))
            os.makedirs(os.path.dirname(target), exist_ok=True)
            with open(target, 'wb') as f: f.write(z.read(name))
shutil.copytree('editable/arm64/lib', dest + '/lib')
pubpath = dest + '/res/values/public.xml'
tree = ET.parse(pubpath)
public = tree.getroot()
by_id = {x.get('id'): x for x in public}
renames = {}
added = 0
for item in ET.parse('editable/xxhdpi/res/values/public.xml').getroot():
    old = by_id.get(item.get('id'))
    if old is not None:
        if old.get('name') != item.get('name'):
            renames[item.get('name')] = old.get('name')
    else:
        public.append(item); added += 1
tree.write(pubpath, encoding='utf-8', xml_declaration=True)
for path, dirs, files in os.walk('editable/xxhdpi/res'):
    for name in files:
        source = os.path.join(path, name)
        rel = os.path.relpath(source, 'editable/xxhdpi/res')
        if rel.replace('\\', '/') in ['values/public.xml', 'values/attrs.xml']:
            continue
        target = os.path.join(dest, 'res', rel)
        if os.path.exists(target):
            if open(source, 'rb').read() == open(target, 'rb').read(): continue
            raise RuntimeError('Resource conflict: ' + rel)
        os.makedirs(os.path.dirname(target), exist_ok=True)
        if name.endswith('.xml'):
            text = open(source, encoding='utf-8').read()
            for raw, alias in renames.items(): text = text.replace(raw, alias)
            with open(target, 'w', encoding='utf-8') as f: f.write(text)
        else: shutil.copy2(source, target)
android = '{http://schemas.android.com/apk/res/android}'
ET.register_namespace('android', android[1:-1])
mp = dest + '/AndroidManifest.xml'
mt = ET.parse(mp); root = mt.getroot()
for key in ['requiredSplitTypes', 'splitTypes']:
    root.attrib.pop(android + key, None)
app = root.find('application')
removed = []
for item in list(app):
    if item.tag == 'meta-data' and item.get(android + 'name') in [
        'com.android.vending.splits.required', 'com.android.vending.splits',
        'com.android.vending.derived.apk.id']:
        removed.append(item.get(android + 'name'));app.remove(item)
mt.write(mp, encoding='utf-8', xml_declaration=True)
with open('inventory/standalone_merge.json', 'w', encoding='utf-8') as f:
    json.dump({'output': dest, 'new_public_ids': added, 'split_attribute_aliases': renames,
               'removed_metadata': removed, 'native_abi': 'arm64-v8a',
               'note': 'Base rebuilt DEX reused; no protocol or account behavior changed.'}, f, ensure_ascii=False, indent=2)
print('Standalone input prepared:', dest, 'new resource IDs:', added)
