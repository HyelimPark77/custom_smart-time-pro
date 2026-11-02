package com.jieli.watchtesttool.util;

import android.content.Context;
import com.android.mltcode.paycertificationapi.bm6;
import com.android.mltcode.paycertificationapi.cm6;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class WLog extends JL_Log {
    public WLog() {
    }

    public static void configureLog(Context r1, boolean r2, boolean r3) {
        JL_Log.setTagPrefix("watch_test");
        JL_Log.configureLog(r1, r2, r3);
        com.jieli.bluetooth_connect.util.JL_Log.setLog(r2);
        com.jieli.jl_bt_ota.util.JL_Log.setLog(r2);
        if (r3 == false) goto L6;
        com.jieli.bluetooth_connect.util.JL_Log.setLogOutput(new bm6());
        com.jieli.jl_bt_ota.util.JL_Log.setLogOutput(new cm6());
        return;
    L6:
        com.jieli.bluetooth_connect.util.JL_Log.setLogOutput(null);
        com.jieli.jl_bt_ota.util.JL_Log.setLogOutput(null);
    }
}
