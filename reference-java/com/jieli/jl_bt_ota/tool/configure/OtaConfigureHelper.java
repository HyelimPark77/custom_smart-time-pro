package com.jieli.jl_bt_ota.tool.configure;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class OtaConfigureHelper {

    /* JADX INFO: renamed from: b */
    private static final String f37678b = "ota_cfg.sp";

    /* JADX INFO: renamed from: c */
    private static final String f37679c = "address";

    /* JADX INFO: renamed from: a */
    @NonNull
    private final SharedPreferences f37680a;

    public OtaConfigureHelper(@NonNull Context context) {
        this.f37680a = context.getSharedPreferences(f37678b, 0);
    }

    /* JADX INFO: renamed from: a */
    private String m27147a(int i, int i2, int i3, int i4) {
        return "address_" + i + IiXI1X1OO.O00 + i2 + IiXI1X1OO.O00 + i3 + IiXI1X1OO.O00 + i4;
    }

    public String getAddress(int i, int i2, int i3, int i4) {
        return this.f37680a.getString(m27147a(i, i2, i3, i4), "");
    }

    public void removeAddress(int i, int i2) {
        SharedPreferences.Editor editorEdit = this.f37680a.edit();
        editorEdit.remove(m27147a(i, i2, 0, 0));
        editorEdit.remove(m27147a(i, i2, 0, 1));
        editorEdit.remove(m27147a(i, i2, 1, 0));
        editorEdit.apply();
    }

    public void saveAddress(int i, int i2, int i3, int i4, String str) {
        if (CHexConver.checkBluetoothAddress(str)) {
            this.f37680a.edit().putString(m27147a(i, i2, i3, i4), str).apply();
        }
    }
}
