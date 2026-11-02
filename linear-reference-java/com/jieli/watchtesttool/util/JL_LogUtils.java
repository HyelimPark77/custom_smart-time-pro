package com.jieli.watchtesttool.util;

import android.content.Context;
import com.jieli.jl_bt_ota.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class JL_LogUtils {
    private static boolean isEnable = false;

    static {
    }

    public JL_LogUtils() {
    }

    public static void disableLog(Context r1) {
        isEnable = false;
        JL_Log.setLog(false);
        JL_Log.setIsSaveLogFile(r1, false);
        com.jieli.bluetooth_connect.util.JL_Log.setLog(false);
        com.jieli.bluetooth_connect.util.JL_Log.setLogOutput(null);
    }

    public static void enableLog(Context r1) {
        if (isEnable == true) goto L6;
        isEnable = true;
        JL_Log.setLog(true);
        JL_Log.setIsSaveLogFile(r1, true);
        com.jieli.bluetooth_connect.util.JL_Log.setLog(true);
        com.jieli.bluetooth_connect.util.JL_Log.setLogOutput(new AnonymousClass1());
        return;
    }
}
