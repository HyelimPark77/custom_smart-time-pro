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

    public static String parseConnectionError(int i) {
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i == 133) {
            return "GATT ERROR";
        }
        if (i == 256) {
            return "GATT CONN CANCEL ";
        }
        return "UNKNOWN (" + i + I000IiI1O.C2156iO.f1007iO;
    }
}
