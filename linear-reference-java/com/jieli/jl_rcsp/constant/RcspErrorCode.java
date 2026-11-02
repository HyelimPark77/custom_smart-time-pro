package com.jieli.jl_rcsp.constant;

import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CmdError;

/* JADX INFO: loaded from: classes17.dex */
public class RcspErrorCode {
    public static final int ERR_AUTH_DEVICE = 8195;
    public static final int ERR_CANCEL_OP = 4098;
    public static final int ERR_CMD_SEND = 12288;
    public static final int ERR_DATA_LOAD_COMPLETE = 16386;
    public static final int ERR_DEVICE_NOT_MATCH = 8193;
    public static final int ERR_DIR_TOO_DEEP = 16388;
    public static final int ERR_FILE_BROWSING = 16385;
    public static final int ERR_FILE_NOT_IN_STORAGE = 16390;
    public static final int ERR_INVALID_PARAMETER = 4097;
    public static final int ERR_IO_EXCEPTION = 16389;
    public static final int ERR_MISSING_FILE_DATA = 16387;
    public static final int ERR_NONE = 0;
    public static final int ERR_OPERATION_TIMEOUT = 4099;
    public static final int ERR_PARSE_DATA = 12289;
    public static final int ERR_REMOTE_NOT_CONNECT = 8192;
    public static final int ERR_RESPONSE_BAD_RESULT = 12293;
    public static final int ERR_RESPONSE_BAD_STATUS = 12292;
    public static final int ERR_RESPONSE_TIMEOUT = 12290;
    public static final int ERR_STORAGE_OFFLINE = 16384;
    public static final int ERR_SYSTEM_BUSY = 12291;
    public static final int ERR_USE_SYSTEM_API = 8194;

    public RcspErrorCode() {
    }

    public static BaseError buildJsonError(int r1, int r2, int r3, String r4) {
        CmdError r0 = new CmdError(r1, r2, r3);
        r0.setDesc(getErrorDesc(r2));
        r0.setSubDesc(r4);
        return new BaseError(r2, r0.toString());
    }

    public static String getErrorDesc(int r2) {
        if (r2 == 0) goto L49;
        switch(r2) {
            case 4097: goto L47;
            case 4098: goto L45;
            case 4099: goto L43;
            default: goto L4;
        };
    L4:
        switch(r2) {
            case 8192: goto L41;
            case 8193: goto L39;
            case 8194: goto L37;
            case 8195: goto L35;
            default: goto L5;
        };
    L5:
        switch(r2) {
            case 12288: goto L33;
            case 12289: goto L31;
            case 12290: goto L29;
            case 12291: goto L27;
            case 12292: goto L25;
            case 12293: goto L23;
            default: goto L6;
        };
    L6:
        switch(r2) {
            case 16384: goto L21;
            case 16385: goto L19;
            case 16386: goto L17;
            case 16387: goto L15;
            case 16388: goto L13;
            case 16389: goto L11;
            case 16390: goto L9;
            default: goto L8;
        };
    L9:
        return "File does not match storage";
    L11:
        return "IO Exception.";
    L13:
        return "Directory hierarchy is too deep.";
    L15:
        return "Missing file data.";
    L17:
        return "File data is loaded.";
    L19:
        return "File browsing.";
    L21:
        return "Storage offline.";
    L8:
        return "Unknown Code : " + r2;
    L23:
        return "Device returns a failure result.";
    L25:
        return "Device returns a failed state.";
    L27:
        return "System is busy.";
    L29:
        return "Waiting for a reply packet timed out.";
    L31:
        return "Failed to parse RCSP data.";
    L33:
        return "Command sending failed.";
    L35:
        return "Failed to auth device.";
    L37:
        return "Failed to use system reflection function.";
    L39:
        return "The device is not the same as the device in use.";
    L41:
        return "The remote device is not connected.";
    L43:
        return "Operation timeout.";
    L45:
        return "Cancel Operation.";
    L47:
        return "Invalid Parameter.";
    L49:
        return "Success";
    }
}
