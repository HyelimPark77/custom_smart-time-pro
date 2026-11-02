package com.sma.smartv3.util.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.wg1;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class XIi00iiXO {

    @aa1
    public static final XIi00iiXO OXO1 = null;
    public static final int XIi00iiXO = 201;

    static {
        OXO1 = new XIi00iiXO();
    }

    public XIi00iiXO() {
    }

    @JvmStatic
    public static final boolean XIi00iiXO(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        PowerManager r0 = (PowerManager) r1.getSystemService("power");
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.isIgnoringBatteryOptimizations(r1.getPackageName());
    }

    @JvmStatic
    public static final void iO(@aa1 Activity r2, @aa1 wg1 r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "onPermissionResult");
        PermissionFragment.IO.XIi00iiXO(r2, PermissionFragment.PermissionType.BATTERY_OPTIMIZATIONS, r3);
    }

    public final void OXO1(@aa1 Fragment r5) {
        Intrinsics.X0O(r5, "fragment");
        Intent r0 = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");     // Catch: Exception -> L5
        r0.setData(Uri.parse("package:" + r5.getContext().getPackageName()));     // Catch: Exception -> L5
        r5.startActivityForResult(r0, 201);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    public final void XO0O10(@aa1 Fragment r2) {
        Intrinsics.X0O(r2, "fragment");
        OXO1(r2);
    }
}
