package com.sma.smartv3.util.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.wg1;
import com.blankj.utilcode.util.RomUtils;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OXO1 {

    @aa1
    public static final OXO1 OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "AUTO_RUN";
    public static final int iO = 101;

    static {
        OXO1 = new OXO1();
    }

    public OXO1() {
    }

    @JvmStatic
    public static final void OIi0(@aa1 Activity r2, @aa1 wg1 r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "onPermissionResult");
        PermissionFragment.IO.XIi00iiXO(r2, PermissionFragment.PermissionType.AUTO_RUN, r3);
    }

    @JvmStatic
    public static final boolean XOO0ii0(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return false;
    }

    public final void I0IIOi(@aa1 Fragment r5) {
        Intrinsics.X0O(r5, "fragment");
        Intent r0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri r1 = Uri.fromParts("package", r5.getActivity().getPackageName(), null);
        Intrinsics.O10IXXX0X(r1, "fromParts(...)");
        r0.setData(r1);
        r5.startActivityForResult(r0, 101);
    }

    public final void IO(@aa1 Fragment r2) {
        Intrinsics.X0O(r2, "fragment");
        if (RomUtils.isHuawei() == false) goto L7;
        OXO1(r2);
        return;
    L7:
        if (RomUtils.isXiaomi() == false) goto L11;
        IiI10X(r2);
        return;
    L11:
        if (RomUtils.isSamsung() == false) goto L15;
        XO0O10(r2);
        return;
    L15:
        if (RomUtils.isMeizu() == false) goto L19;
        XIi00iiXO(r2);
        return;
    L19:
        if (RomUtils.isVivo() == false) goto L23;
        O00(r2);
        return;
    L23:
        if (RomUtils.isOppo() == false) goto L26;
        iO(r2);
        return;
    L26:
        I0IIOi(r2);
    }

    public final void IiI10X(@aa1 Fragment r5) {
        Intrinsics.X0O(r5, "fragment");
        I0IIOi(r5);     // Catch: Exception -> L5
        return;
    L5:
        Intent r0 = new Intent();
        r0.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));     // Catch: Exception -> L8
        r5.startActivityForResult(r0, 101);     // Catch: Exception -> L8
        return;
    }

    public final void O00(@aa1 Fragment r3) {
        Intrinsics.X0O(r3, "fragment");
        Intent r0 = new Intent();
        r0.setComponent(ComponentName.unflattenFromString("com.vivo.permissionmanager/.activity.PurviewTabActivity"));     // Catch: Exception -> L5
        r3.startActivityForResult(r0, 101);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        I0IIOi(r3);
    }

    public final void OXO1(@aa1 Fragment r4) {
        Intrinsics.X0O(r4, "fragment");
        int r0 = Build.VERSION.SDK_INT;
        Intent r1 = new Intent();     // Catch: Exception -> L9
        if (r0 < 28) goto L6;
        ComponentName r2 = ComponentName.unflattenFromString("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity");     // Catch: Exception -> L9
    L7:
        r1.setComponent(r2);     // Catch: Exception -> L9
        r4.startActivityForResult(r1, 101);     // Catch: Exception -> L9
        return;
    L6:
        r2 = ComponentName.unflattenFromString("com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity");     // Catch: Exception -> L9
    L9:
        I0IIOi(r4);
    }

    public final void XIi00iiXO(@aa1 Fragment r4) {
        Intrinsics.X0O(r4, "fragment");
        Intent r0 = new Intent();
        r0.setComponent(ComponentName.unflattenFromString("com.meizu.safe/.permission.SmartBGActivity"));     // Catch: Exception -> L5
        r4.startActivityForResult(r0, 101);     // Catch: Exception -> L5
        return;
    L5:
        r0.setComponent(ComponentName.unflattenFromString("com.meizu.safe/.permission.PermissionMainActivity"));     // Catch: Exception -> L7
        r4.startActivityForResult(r0, 101);     // Catch: Exception -> L7
        return;
    L7:
        I0IIOi(r4);
    }

    public final void XO0O10(@aa1 Fragment r4) {
        Intrinsics.X0O(r4, "fragment");
        Intent r0 = new Intent();
        r0.setComponent(ComponentName.unflattenFromString("com.samsung.android.sm/.app.dashboard.SmartManagerDashBoardActivity"));     // Catch: Exception -> L5
        r4.startActivityForResult(r0, 101);     // Catch: Exception -> L5
        return;
    L5:
        r0.setComponent(ComponentName.unflattenFromString("com.samsung.android.sm_cn/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity"));     // Catch: Exception -> L7
        r4.startActivityForResult(r0, 101);     // Catch: Exception -> L7
        return;
    L7:
        I0IIOi(r4);
    }

    public final void iO(@aa1 Fragment r6) {
        Intrinsics.X0O(r6, "fragment");
        Intent r0 = new Intent();
        r0.setClassName("com.oppo.safe", "com.oppo.safe.SecureSafeMainActivity");     // Catch: Throwable -> L5
        r6.startActivityForResult(r0, 101);     // Catch: Throwable -> L5
        return;
    L5:
        r0.setComponent(ComponentName.unflattenFromString("com.coloros.safecenter/.startupapp.StartupAppListActivity"));     // Catch: Exception -> L7
        r6.startActivityForResult(r0, 101);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
        Intent r1 = new Intent();     // Catch: Exception -> L11
        r1.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.SecureSafeMainActivity"));     // Catch: Exception -> L11
        r6.startActivityForResult(r1, 101);     // Catch: Exception -> L11
        return;
    L11:
        I0IIOi(r6);
    }
}
