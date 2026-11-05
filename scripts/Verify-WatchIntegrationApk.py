"""Check baseline core preservation, with an explicit app-version-guard DEX input."""
import argparse
import hashlib
import json
from pathlib import Path
from zipfile import ZipFile

parser = argparse.ArgumentParser()
parser.add_argument('--baseline', required=True)
parser.add_argument('--apk', required=True)
parser.add_argument('--report', required=True)
parser.add_argument('--version-guard-dex', help='Explicit rebuilt classes19.dex for the extension identity guard')
args = parser.parse_args()
root = Path(__file__).resolve().parent.parent
expected = json.loads((root / 'analysis/watch-coach-0.6.0-verification.json').read_text(encoding='utf-8'))['sha256']
digest = lambda content: hashlib.sha256(content).hexdigest()
assert digest(Path(args.baseline).read_bytes()) == expected, 'Baseline must be the verified 0.6.0 APK'
with ZipFile(args.baseline) as baseline, ZipFile(args.apk) as apk:
    excluded = {'classes20.dex'} | ({'classes19.dex'} if args.version_guard_dex else set())
    core = lambda z: sorted(n for n in z.namelist() if (n.endswith('.dex') and n not in excluded) or (n.startswith('lib/') and n.endswith('.so')))
    names = core(baseline)
    assert names == core(apk), 'Core DEX or native library inventory changed'
    for name in names:
        assert digest(baseline.read(name)) == digest(apk.read(name)), f'Unexpected core change: {name}'
    if args.version_guard_dex:
        assert digest(apk.read('classes19.dex')) == digest(Path(args.version_guard_dex).read_bytes()), 'Version guard DEX differs from explicit build input'
    assert digest(apk.read('classes20.dex')) == digest((root / 'patches/base/classes20.dex').read_bytes()), 'Mind Island DEX differs from compiled source'
    for source in (root / 'patches/base/assets/mind-island').rglob('*'):
        if source.is_file():
            entry = 'assets/mind-island/' + source.relative_to(root / 'patches/base/assets/mind-island').as_posix()
            assert apk.read(entry) == source.read_bytes(), f'Unexpected asset: {entry}'
report = {'apk': Path(args.apk).name, 'sha256': digest(Path(args.apk).read_bytes()),
          'baseline_sha256': expected, 'unchanged_core_entries': len(names),
          'mind_island_dex_matches_source': True, 'mind_island_assets_match_source': True,
          'version_guard_dex_matches_input': bool(args.version_guard_dex),
          'scope': 'Static APK check only; device voice, persistence and Bluetooth testing remain separate.'}
destination = Path(args.report)
destination.parent.mkdir(parents=True, exist_ok=True)
destination.write_text(json.dumps(report, ensure_ascii=False, indent=2) + '\n', encoding='utf-8')
print('APK core preservation and Mind Island source correspondence passed:', len(names), 'core entries')
