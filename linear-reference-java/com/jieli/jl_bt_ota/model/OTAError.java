package com.jieli.jl_bt_ota.model;

import android.text.TextUtils;
import com.jieli.jl_bt_ota.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public class OTAError {
    public OTAError() {
    }

    public static BaseError buildError(int r1) {
        return buildError(r1, getErrorDesc(r1));
    }

    public static String getErrorDesc(int r1) {
        if (r1 != 12295) goto L5;
        return "Command waiting for the device to reply timed out.";
    L5:
        if (r1 != 12296) goto L7;
        return "Device returned the failed result.";
    L7:
        if (r1 != 12298) goto L9;
        return "Device returned an error result.";
    L9:
        if (r1 == 12299) goto L94;
        if (r1 != 0) goto L12;
        return "Success.";
    L12:
        if (r1 != 4097) goto L14;
        return "Parameter error.";
    L14:
        if (r1 != 4099) goto L16;
        return "Bluetooth is close.";
    L16:
        if (r1 != 4114) goto L18;
        return "Bluetooth device is disconnected.";
    L18:
        if (r1 != 8194) goto L20;
        return "Searching for a Device Exception.";
    L20:
        if (r1 == 20481) goto L82;
        switch(r1) {
            case 12290: goto L80;
            case 12291: goto L78;
            case 12292: goto L76;
            case 12293: goto L74;
            default: goto L22;
        };
    L22:
        switch(r1) {
            case 16385: goto L72;
            case 16386: goto L70;
            case 16387: goto L68;
            case 16388: goto L66;
            case 16389: goto L64;
            case 16390: goto L62;
            case 16391: goto L60;
            case 16392: goto L58;
            case 16393: goto L56;
            case 16394: goto L54;
            case 16395: goto L52;
            case 16396: goto L50;
            case 16397: goto L48;
            case 16398: goto L46;
            case 16399: goto L44;
            case 16400: goto L42;
            case 16401: goto L40;
            case 16402: goto L38;
            case 16403: goto L36;
            case 16404: goto L34;
            default: goto L23;
        };
    L23:
        switch(r1) {
            case 20484: goto L32;
            case 20485: goto L30;
            case 20486: goto L28;
            case 20487: goto L26;
            default: goto L24;
        };
    L24:
        return "Unknown Error";
    L26:
        return "SDK is destroying.";
    L28:
        return "I/O exception.";
    L30:
        return "No upgrade data found.";
    L32:
        return "Not found file.";
    L34:
        return "Device is in device dual mode.";
    L36:
        return "Device is being upgraded.";
    L38:
        return "Failed to reconnect the device.";
    L40:
        return "Reconnecting to the device timed out.";
    L42:
        return "Unknown error code.";
    L44:
        return "Same upgrade file.";
    L46:
        return "The headphones are not in the charging bin.";
    L48:
        return "The TWS is not connected.";
    L50:
        return "File version is the same as the device version.";
    L52:
        return "Command processing timeout.";
    L54:
        return "Flash IO exception.";
    L56:
        return "Data length error.";
    L58:
        return "OTA is in progress.";
    L60:
        return "The type of the upgrade file is incorrect.";
    L62:
        return "Key of the upgrade file does not match.";
    L64:
        return "Data verification failure.";
    L66:
        return "Data offset error.";
    L68:
        return "Corrupted upgrade file.";
    L70:
        return "Device is in low charge.";
    L72:
        return "Update failed.";
    L74:
        return "Failed to parse data.";
    L76:
        return "Abnormal data format.";
    L78:
        return "System is busy.";
    L80:
        return "Failed to send data.";
    L82:
        return "Device authentication fails.";
    L94:
        return "Waiting command timeout.";
    }

    public static BaseError buildError(int r1, String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L6;
        r2 = getErrorDesc(r1);
    L6:
        return buildError(r1, 0, r2);
    }

    public static BaseError buildError(int r2, int r3, String r4) {
        return new BaseError(r3, r2, new ErrorMsg(r2, getErrorDesc(r2), r3, r4).toString());
    }
}
