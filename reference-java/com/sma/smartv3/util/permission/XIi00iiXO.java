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
    public static final XIi00iiXO OXO1 = new XIi00iiXO();
    public static final int XIi00iiXO = 201;

    @JvmStatic
    public static final boolean XIi00iiXO(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: iO */
    public static final void m38862iO(@aa1 Activity activity, @aa1 wg1 onPermissionResult) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(onPermissionResult, "onPermissionResult");
        PermissionFragment.f54938IO.XIi00iiXO(activity, PermissionFragment.PermissionType.BATTERY_OPTIMIZATIONS, onPermissionResult);
    }

    public final void OXO1(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        try {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + fragment.getContext().getPackageName()));
            fragment.startActivityForResult(intent, 201);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void XO0O10(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        OXO1(fragment);
    }
}
