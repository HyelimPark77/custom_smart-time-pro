package com.jieli.jl_bt_ota.constant;

import com.android.mltcode.paycertificationapi.I000IiI1O;

/* JADX INFO: loaded from: classes17.dex */
public class GattError {
    public static final int GATT_CONN_CANCEL = 256;
    public static final int GATT_CONN_FAIL_ESTABLISH = 62;
    public static final int GATT_CONN_L2C_FAILURE = 1;
    public static final int GATT_CONN_LMP_TIMEOUT = 34;
    public static final int GATT_CONN_TERMINATE_LOCAL_HOST = 22;
    public static final int GATT_CONN_TERMINATE_PEER_USER = 19;
    public static final int GATT_CONN_TIMEOUT = 8;
    public static final int GATT_ERROR = 133;
    public static final int GATT_SUCCESS = 0;

    public GattError() {
    }

    public static String parseConnectionError(int r2) {
        if (r2 != 0) goto L4;
        return "SUCCESS";
    L4:
        if (r2 != 1) goto L6;
        return "GATT CONN L2C FAILURE";
    L6:
        if (r2 != 8) goto L8;
        return "GATT CONN TIMEOUT";
    L8:
        if (r2 != 19) goto L10;
        return "GATT CONN TERMINATE PEER USER";
    L10:
        if (r2 != 22) goto L12;
        return "GATT CONN TERMINATE LOCAL HOST";
    L12:
        if (r2 != 34) goto L14;
        return "GATT CONN LMP TIMEOUT";
    L14:
        if (r2 != 62) goto L16;
        return "GATT CONN FAIL ESTABLISH";
    L16:
        if (r2 != 133) goto L18;
        return "GATT ERROR";
    L18:
        if (r2 != 256) goto L20;
        return "GATT CONN CANCEL ";
    L20:
        return "UNKNOWN (" + r2 + I000IiI1O.iO.iO;
    }
}
