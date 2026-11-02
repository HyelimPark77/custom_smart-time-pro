package com.jieli.jl_bt_ota.tool.configure;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class OtaConfigureHelper {
    private static final String b = "ota_cfg.sp";
    private static final String c = "address";

    @NonNull
    private final SharedPreferences a;

    public OtaConfigureHelper(@NonNull Context r3) {
        this.a = r3.getSharedPreferences(b, 0);
    }

    private String a(int r3, int r4, int r5, int r6) {
        return "address_" + r3 + IiXI1X1OO.O00 + r4 + IiXI1X1OO.O00 + r5 + IiXI1X1OO.O00 + r6;
    }

    public String getAddress(int r2, int r3, int r4, int r5) {
        return this.a.getString(a(r2, r3, r4, r5), "");
    }

    public void removeAddress(int r5, int r6) {
        SharedPreferences.Editor r0 = this.a.edit();
        r0.remove(a(r5, r6, 0, 0));
        r0.remove(a(r5, r6, 0, 1));
        r0.remove(a(r5, r6, 1, 0));
        r0.apply();
    }

    public void saveAddress(int r2, int r3, int r4, int r5, String r6) {
        if (CHexConver.checkBluetoothAddress(r6) == true) goto L5;
        return;
    L5:
        this.a.edit().putString(a(r2, r3, r4, r5), r6).apply();
    }
}
