package com.jieli.jl_audio_decode.constant;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class ErrorCode {
    public static final int ERR_ALLOC_FAIL = -7;
    public static final int ERR_BAD_ARGS = -1;
    public static final int ERR_BUFFER_TOO_SMALL = -2;
    public static final int ERR_ENC_FAILURE = -129;
    public static final int ERR_FILE_NOT_EXIST = -1002;
    public static final int ERR_INTERNAL_ERROR = -3;
    public static final int ERR_INVALID_PACKET = -4;
    public static final int ERR_INVALID_STATE = -6;
    public static final int ERR_IN_PROCESS = -1003;
    public static final int ERR_IO_EXCEPTION = -2000;
    public static final int ERR_NONE = 0;
    public static final int ERR_NONE_INIT = -1000;
    public static final int ERR_NOT_SUPPORT_FUNCTION = -1001;
    public static final int ERR_OPEN_FILE = -130;
    public static final int ERR_OP_FAIL = -1004;
    public static final int ERR_OUTPUT_EXCEPTION = -128;
    public static final int ERR_UNIMPLEMENTED = -5;

    public ErrorCode() {
    }

    public static String getErrorMsg(int r2) {
        if (r2 == (-2000)) goto L41;
        switch(r2) {
            case -1004: goto L39;
            case -1003: goto L37;
            case -1002: goto L35;
            case -1001: goto L33;
            case -1000: goto L31;
            default: goto L5;
        };
    L5:
        switch(r2) {
            case -130: goto L29;
            case -129: goto L27;
            case -128: goto L25;
            default: goto L6;
        };
    L6:
        switch(r2) {
            case -7: goto L23;
            case -6: goto L21;
            case -5: goto L19;
            case -4: goto L17;
            case -3: goto L15;
            case -2: goto L13;
            case -1: goto L11;
            case 0: goto L9;
            default: goto L8;
        };
    L9:
        return "Success";
    L11:
        return "Invalid Argument";
    L13:
        return "Buffer too small";
    L15:
        return UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
    L17:
        return "Corrupted stream";
    L19:
        return "Request not implemented";
    L21:
        return "Invalid state";
    L23:
        return "Memory allocation failed";
    L8:
        return String.format(Locale.ENGLISH, "Unknown Error(%d)", new Object[]{Integer.valueOf(r2)});
    L25:
        return "Abnormal output data";
    L27:
        return "Encoding failed";
    L29:
        return "Failed to open file.";
    L31:
        return "Not initialized";
    L33:
        return "Function not supported";
    L35:
        return "File does not exist";
    L37:
        return "Operation in progress";
    L39:
        return "Operation Failed";
    L41:
        return "IO exception";
    }
}
