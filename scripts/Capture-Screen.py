"""Save an unedited PNG from an explicitly selected Android device/emulator."""
import argparse
import os
from pathlib import Path
import shutil
import struct
import subprocess

parser = argparse.ArgumentParser()
parser.add_argument('--serial', required=True, help='adb serial, e.g. emulator-5580')
parser.add_argument('--output', required=True, help='PNG destination')
parser.add_argument('--adb', default=shutil.which('adb'), help='adb executable path')
args = parser.parse_args()
adb = args.adb
if not adb:
    sdk = os.environ.get('ANDROID_HOME') or os.environ.get('ANDROID_SDK_ROOT')
    if sdk:
        adb = str(Path(sdk) / 'platform-tools' / ('adb.exe' if os.name == 'nt' else 'adb'))
if not adb:
    parser.error('Set ANDROID_HOME, add adb to PATH, or pass --adb.')
data = subprocess.check_output([adb, '-s', args.serial, 'exec-out', 'screencap', '-p'])
if not data.startswith(b'\x89PNG\r\n\x1a\n'):
    raise SystemExit('The device did not return a PNG.')
output = Path(args.output)
output.parent.mkdir(parents=True, exist_ok=True)
output.write_bytes(data)
width, height = struct.unpack('>II', data[16:24])
print(f'{output}: {width} x {height}; review visible personal data before publishing.')
