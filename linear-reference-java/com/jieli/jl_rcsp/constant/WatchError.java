package com.jieli.jl_rcsp.constant;

/* JADX INFO: loaded from: classes17.dex */
public class WatchError extends RcspErrorCode {
    public static final int ERR_CRC_CHECK = 12544;
    public static final int ERR_DATA_OVER_LIMIT = 16899;
    public static final int ERR_DEVICE_IN_CALLING = 12545;
    public static final int ERR_FAT_BEGIN = 16667;
    public static final int ERR_FAT_DENIED = 16647;
    public static final int ERR_FAT_DISK = 16641;
    public static final int ERR_FAT_END = 16668;
    public static final int ERR_FAT_EXIST = 16648;
    public static final int ERR_FAT_INIT = 16642;
    public static final int ERR_FAT_INVALID_DRIVE = 16651;
    public static final int ERR_FAT_INVALID_NAME = 16646;
    public static final int ERR_FAT_INVALID_OBJECT = 16649;
    public static final int ERR_FAT_INVALID_PARAMETER = 16659;
    public static final int ERR_FAT_JNI_INIT = 16662;
    public static final int ERR_FAT_LOCKED = 16656;
    public static final int ERR_FAT_MKFS_ABORTED = 16654;
    public static final int ERR_FAT_NOT_ENABLED = 16652;
    public static final int ERR_FAT_NOT_ENOUGH_CORE = 16657;
    public static final int ERR_FAT_NOT_READY = 16643;
    public static final int ERR_FAT_NO_FILE = 16644;
    public static final int ERR_FAT_NO_FILESYSTEM = 16653;
    public static final int ERR_FAT_NO_PATH = 16645;
    public static final int ERR_FAT_READ = 16664;
    public static final int ERR_FAT_SYNC = 16665;
    public static final int ERR_FAT_TIMEOUT = 16655;
    public static final int ERR_FAT_TOO_BIG = 16660;
    public static final int ERR_FAT_TOO_MANY_OPEN_FILES = 16658;
    public static final int ERR_FAT_WRITE = 16663;
    public static final int ERR_FAT_WRITE_PROTECTED = 16650;
    public static final int ERR_FUNC_NOT_SUPPORT = 4353;
    public static final int ERR_IN_PROGRESS = 4352;
    public static final int ERR_NETWORK_OTA_FAILED = 20481;
    public static final int ERR_NETWORK_OTA_TIMEOUT = 20482;
    public static final int ERR_NETWORK_OTA_UNKNOWN = 20480;
    public static final int ERR_NETWORK_OTA_WAITING_COMMAND_TIMEOUT = 20483;
    public static final int ERR_OP_NOT_ALLOW = 12546;
    public static final int ERR_RENAME_FILE = 16898;
    public static final int ERR_SPACE_TO_UPDATE = 16897;
    public static final int ERR_VERSION_NOT_MATCH = 16896;

    public WatchError() {
    }

    public static int fatfsToWatchErr(int r0) {
        switch(r0) {
            case 0: goto L56;
            case 1: goto L54;
            case 2: goto L52;
            case 3: goto L50;
            case 4: goto L48;
            case 5: goto L46;
            case 6: goto L44;
            case 7: goto L42;
            case 8: goto L40;
            case 9: goto L38;
            case 10: goto L36;
            case 11: goto L34;
            case 12: goto L32;
            case 13: goto L30;
            case 14: goto L28;
            case 15: goto L26;
            case 16: goto L24;
            case 17: goto L22;
            case 18: goto L20;
            case 19: goto L18;
            case 20: goto L16;
            case 21: goto L3;
            case 22: goto L14;
            case 23: goto L12;
            case 24: goto L10;
            case 25: goto L8;
            case 26: goto L3;
            case 27: goto L6;
            case 28: goto L4;
            default: goto L3;
        };
    L3:
        return r0;
    L4:
        return ERR_FAT_END;
    L6:
        return ERR_FAT_BEGIN;
    L8:
        return ERR_FAT_SYNC;
    L10:
        return ERR_FAT_READ;
    L12:
        return ERR_FAT_WRITE;
    L14:
        return ERR_FAT_JNI_INIT;
    L16:
        return ERR_FAT_TOO_BIG;
    L18:
        return ERR_FAT_INVALID_PARAMETER;
    L20:
        return ERR_FAT_TOO_MANY_OPEN_FILES;
    L22:
        return ERR_FAT_NOT_ENOUGH_CORE;
    L24:
        return ERR_FAT_LOCKED;
    L26:
        return ERR_FAT_TIMEOUT;
    L28:
        return ERR_FAT_MKFS_ABORTED;
    L30:
        return ERR_FAT_NO_FILESYSTEM;
    L32:
        return ERR_FAT_NOT_ENABLED;
    L34:
        return ERR_FAT_INVALID_DRIVE;
    L36:
        return ERR_FAT_WRITE_PROTECTED;
    L38:
        return ERR_FAT_INVALID_OBJECT;
    L40:
        return ERR_FAT_EXIST;
    L42:
        return ERR_FAT_DENIED;
    L44:
        return ERR_FAT_INVALID_NAME;
    L46:
        return ERR_FAT_NO_PATH;
    L48:
        return ERR_FAT_NO_FILE;
    L50:
        return ERR_FAT_NOT_READY;
    L52:
        return ERR_FAT_INIT;
    L54:
        return ERR_FAT_DISK;
    L56:
        return 0;
    }

    public static String getErrorDesc(int r2) {
        if (r2 != 0) goto L4;
        return "Success";
    L4:
        if (r2 != 4097) goto L6;
        return "Invalid Parameter.";
    L6:
        if (r2 != 4098) goto L8;
        return "Cancel Operation.";
    L8:
        if (r2 != 4352) goto L10;
        return "Task is in progress.";
    L10:
        if (r2 != 4353) goto L12;
        return "Feature not supported.";
    L12:
        if (r2 != 16667) goto L14;
        return "Process start error.";
    L14:
        if (r2 == 16668) goto L126;
        switch(r2) {
            case 0: goto L140;
            case 16641: goto L124;
            case 16642: goto L122;
            case 16643: goto L120;
            case 16644: goto L118;
            case 16645: goto L116;
            case 16646: goto L114;
            case 16647: goto L112;
            case 16648: goto L110;
            case 16649: goto L108;
            case 16650: goto L106;
            case 16651: goto L104;
            case 16652: goto L102;
            case 16653: goto L100;
            case 16654: goto L98;
            case 16655: goto L96;
            case 16656: goto L94;
            case 16657: goto L92;
            case 16658: goto L90;
            case 16659: goto L88;
            case 16660: goto L86;
            case 20480: goto L84;
            case 20481: goto L82;
            case 20482: goto L80;
            case 20483: goto L78;
            default: goto L16;
        };
    L16:
        switch(r2) {
            case 8192: goto L76;
            case 8193: goto L74;
            case 8194: goto L72;
            case 8195: goto L70;
            default: goto L17;
        };
    L17:
        switch(r2) {
            case 12288: goto L68;
            case 12289: goto L66;
            case 12290: goto L64;
            case 12291: goto L62;
            case 12292: goto L60;
            case 12293: goto L58;
            default: goto L18;
        };
    L18:
        switch(r2) {
            case 12544: goto L56;
            case 12545: goto L54;
            case 12546: goto L52;
            default: goto L19;
        };
    L19:
        switch(r2) {
            case 16384: goto L50;
            case 16385: goto L48;
            case 16386: goto L46;
            case 16387: goto L44;
            case 16388: goto L42;
            case 16389: goto L40;
            default: goto L20;
        };
    L20:
        switch(r2) {
            case 16662: goto L38;
            case 16663: goto L36;
            case 16664: goto L34;
            case 16665: goto L32;
            default: goto L21;
        };
    L21:
        switch(r2) {
            case 16896: goto L30;
            case 16897: goto L28;
            case 16898: goto L26;
            case 16899: goto L24;
            default: goto L23;
        };
    L24:
        return "The data sent exceeds the limit.";
    L26:
        return "Failed to rename the file.";
    L28:
        return "Insufficient space to update multiple files.";
    L30:
        return "File information does not match.";
    L23:
        return "Unknown Code : " + r2;
    L32:
        return "Sync data error.";
    L34:
        return "Read data failed.";
    L36:
        return "Write data failed.";
    L38:
        return "Watch system has not been initialized.";
    L40:
        return "IO Exception.";
    L42:
        return "Directory hierarchy is too deep.";
    L44:
        return "Missing file data.";
    L46:
        return "File data is loaded.";
    L48:
        return "File browsing.";
    L50:
        return "Storage offline.";
    L52:
        return "The operation is not allowed.";
    L54:
        return "The device is in calling.";
    L56:
        return "CRC is error.";
    L58:
        return "Device returns a failure result.";
    L60:
        return "Device returns a failed state.";
    L62:
        return "System is busy.";
    L64:
        return "Waiting for a reply packet timed out.";
    L66:
        return "Failed to parse RCSP data.";
    L68:
        return "Command sending failed.";
    L70:
        return "Failed to auth device.";
    L72:
        return "Failed to use system reflection function.";
    L74:
        return "The device is not the same as the device in use.";
    L76:
        return "The remote device is not connected.";
    L78:
        return "Network module timeout waiting for upgrade command.";
    L80:
        return "Network module upgrade timeout.";
    L82:
        return "Network module upgrade failed.";
    L84:
        return "Undefined upgrade error code.";
    L86:
        return "Image size to big, do not to support big size image.";
    L88:
        return "Given parameter is invalid";
    L90:
        return "Number of open files > FF_FS_LOCK.";
    L92:
        return "LFN working buffer could not be allocated.";
    L94:
        return "The operation is rejected according to the file sharing policy.";
    L96:
        return "Could not get a grant to access the volume within defined period.";
    L98:
        return "The f_mkfs() aborted due to any problem.";
    L100:
        return "There is no valid FAT volume.";
    L102:
        return "The volume has no work area.";
    L104:
        return "The logical drive number is invalid.";
    L106:
        return "The physical drive is write protected.";
    L108:
        return "The file/directory object is invalid.";
    L110:
        return "Access denied due to prohibited access.";
    L112:
        return "Access denied due to prohibited access or directory full.";
    L114:
        return "The path name format is invalid.";
    L116:
        return "Could not find the path.";
    L118:
        return "Could not find the file.";
    L120:
        return "The physical drive cannot work.";
    L122:
        return "Assertion failed.";
    L124:
        return "A hard error occurred in the low level disk I/O layer.";
    L140:
        return "Success";
    L126:
        return "Process end error.";
    }
}
