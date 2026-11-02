package com.jieli.jl_bt_ota.constant;

import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class StateCode {

    @Deprecated
    public static final int CONNECTION_CONNECTED = 4;
    public static final int CONNECTION_CONNECTING = 3;
    public static final int CONNECTION_DISCONNECT = 0;
    public static final int CONNECTION_FAILED = 2;
    public static final int CONNECTION_OK = 1;
    public static final int RESULT_CAN_UPDATE = 0;
    public static final int RESULT_DEVICE_IN_DOUBLE_CONNECTION = 7;
    public static final int RESULT_DEVICE_LOW_VOLTAGE_EQUIPMENT = 1;
    public static final int RESULT_FAIL = 1;
    public static final int RESULT_FIRMWARE_INFO_ERROR = 2;
    public static final int RESULT_FIRMWARE_VERSION_NO_CHANGE = 3;
    public static final int RESULT_HEADSET_NOT_IN_CHARGING_BIN = 5;
    public static final int RESULT_OK = 0;
    public static final int RESULT_OTA_IN_PROGRESS = 6;
    public static final int RESULT_TWS_NOT_CONNECT = 4;
    public static final int STATUS_ALL_DATA_CRC_ERROR = 6;
    public static final int STATUS_BUSY = 3;
    public static final int STATUS_CRC_ERROR = 5;
    public static final int STATUS_FAIL = 1;
    public static final int STATUS_NO_RESOURCE = 4;
    public static final int STATUS_PARAMETER_ERROR = 7;
    public static final int STATUS_RESPONSE_DATA_OVER_LIMIT = 8;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_UNKNOWN_CMD = 2;
    public static final int UPGRADE_RESULT_CMD_TIMEOUT = 8;
    public static final int UPGRADE_RESULT_COMPLETE = 0;
    public static final int UPGRADE_RESULT_DATA_CHECK_ERROR = 1;
    public static final int UPGRADE_RESULT_DOWNLOAD_BOOT_LOADER_SUCCESS = 128;
    public static final int UPGRADE_RESULT_ENCRYPTED_KEY_NOT_MATCH = 3;
    public static final int UPGRADE_RESULT_ERROR_LENGTH = 6;
    public static final int UPGRADE_RESULT_FAIL = 2;
    public static final int UPGRADE_RESULT_FLASH_READ = 7;
    public static final int UPGRADE_RESULT_NEED_UPDATE_RESOURCE = 254;
    public static final int UPGRADE_RESULT_SAME_FILE = 9;
    public static final int UPGRADE_RESULT_UPGRADE_FILE_ERROR = 4;
    public static final int UPGRADE_RESULT_UPGRADE_TYPE_ERROR = 5;

    public StateCode() {
    }

    public static String printConnectionState(int r2) {
        if (r2 != 0) goto L4;
        return "CONNECTION_DISCONNECT(0)";
    L4:
        if (r2 != 1) goto L6;
        return "CONNECTION_OK(1)";
    L6:
        if (r2 != 2) goto L8;
        return "CONNECTION_FAILED(2)";
    L8:
        if (r2 != 3) goto L10;
        return "CONNECTION_CONNECTING(3)";
    L10:
        if (r2 != 4) goto L12;
        return "CONNECTION_CONNECTED(4)";
    L12:
        return String.format(Locale.ENGLISH, "UNKNOWN STATE(%d)", new Object[]{Integer.valueOf(r2)});
    }

    public static String printStatusCode(int r2) {
        switch(r2) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            case 8: goto L5;
            default: goto L4;
        };
    L5:
        return "STATUS_RESPONSE_DATA_OVER_LIMIT(8)";
    L7:
        return "STATUS_PARAMETER_ERROR(7)";
    L9:
        return "STATUS_ALL_DATA_CRC_ERROR(6)";
    L11:
        return "STATUS_CRC_ERROR(5)";
    L13:
        return "STATUS_NO_RESOURCE(4)";
    L15:
        return "STATUS_BUSY(3)";
    L17:
        return "STATUS_UNKNOWN_COMMAND(2)";
    L19:
        return "STATUS_FAIL(1)";
    L21:
        return "STATUS_SUCCESS(0)";
    L4:
        return "UNKNOWN STATUS : " + r2;
    }
}
