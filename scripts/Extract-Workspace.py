"""Extract the pinned workspace with Windows long-path support; never replace one."""
from pathlib import Path, PurePosixPath
import os
import sys
import zipfile

archive, destination = sys.argv[1:]
destination = os.path.abspath(destination)
if os.name == 'nt' and not destination.startswith('\\\\?\\'):
    destination = '\\\\?\\' + destination
root = Path(destination) / 'SMART_TIME_PRO_customization'
if root.exists():
    raise SystemExit('Workspace already exists; extraction cancelled.')
with zipfile.ZipFile(archive) as source:
    for entry in source.infolist():
        name = entry.filename.replace('\\', '/')
        parts = PurePosixPath(name).parts
        if not parts or parts[0] != 'SMART_TIME_PRO_customization' or '..' in parts or ':' in parts[0]:
            raise SystemExit('Unexpected workspace archive path: ' + name)
    source.extractall(destination)
print('Workspace extracted:', str(root))
