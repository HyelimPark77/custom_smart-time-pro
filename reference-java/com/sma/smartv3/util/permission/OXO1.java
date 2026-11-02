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
    public static final OXO1 OXO1 = new OXO1();

    @aa1
    public static final String XIi00iiXO = "AUTO_RUN";

    /* JADX INFO: renamed from: iO */
    public static final int f54936iO = 101;

    @JvmStatic
    public static final void OIi0(@aa1 Activity activity, @aa1 wg1 onPermissionResult) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(onPermissionResult, "onPermissionResult");
        PermissionFragment.f54938IO.XIi00iiXO(activity, PermissionFragment.PermissionType.AUTO_RUN, onPermissionResult);
    }

    @JvmStatic
    public static final boolean XOO0ii0(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return false;
    }

    public final void I0IIOi(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri uriFromParts = Uri.fromParts("package", fragment.getActivity().getPackageName(), null);
        Intrinsics.O10IXXX0X(uriFromParts, "fromParts(...)");
        intent.setData(uriFromParts);
        fragment.startActivityForResult(intent, 101);
    }

    /* JADX INFO: renamed from: IO */
    public final void m38858IO(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        if (RomUtils.isHuawei()) {
            OXO1(fragment);
            return;
        }
        if (RomUtils.isXiaomi()) {
            IiI10X(fragment);
            return;
        }
        if (RomUtils.isSamsung()) {
            XO0O10(fragment);
            return;
        }
        if (RomUtils.isMeizu()) {
            XIi00iiXO(fragment);
            return;
        }
        if (RomUtils.isVivo()) {
            O00(fragment);
        } else if (RomUtils.isOppo()) {
            m38859iO(fragment);
        } else {
            I0IIOi(fragment);
        }
    }

    public final void IiI10X(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        try {
            I0IIOi(fragment);
        } catch (Exception unused) {
            Intent intent = new Intent();
            try {
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
                fragment.startActivityForResult(intent, 101);
            } catch (Exception unused2) {
            }
        }
    }

    public final void O00(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        Intent intent = new Intent();
        try {
            intent.setComponent(ComponentName.unflattenFromString("com.vivo.permissionmanager/.activity.PurviewTabActivity"));
            fragment.startActivityForResult(intent, 101);
        } catch (Exception e) {
            e.printStackTrace();
            I0IIOi(fragment);
        }
    }

    public final void OXO1(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        int i = Build.VERSION.SDK_INT;
        try {
            Intent intent = new Intent();
            intent.setComponent(i >= 28 ? ComponentName.unflattenFromString("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity") : ComponentName.unflattenFromString("com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity"));
            fragment.startActivityForResult(intent, 101);
        } catch (Exception unused) {
            I0IIOi(fragment);
        }
    }

    public final void XIi00iiXO(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        Intent intent = new Intent();
        try {
            try {
                intent.setComponent(ComponentName.unflattenFromString("com.meizu.safe/.permission.SmartBGActivity"));
                fragment.startActivityForResult(intent, 101);
            } catch (Exception unused) {
                intent.setComponent(ComponentName.unflattenFromString("com.meizu.safe/.permission.PermissionMainActivity"));
                fragment.startActivityForResult(intent, 101);
            }
        } catch (Exception unused2) {
            I0IIOi(fragment);
        }
    }

    public final void XO0O10(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        Intent intent = new Intent();
        try {
            try {
                intent.setComponent(ComponentName.unflattenFromString("com.samsung.android.sm/.app.dashboard.SmartManagerDashBoardActivity"));
                fragment.startActivityForResult(intent, 101);
            } catch (Exception unused) {
                intent.setComponent(ComponentName.unflattenFromString("com.samsung.android.sm_cn/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity"));
                fragment.startActivityForResult(intent, 101);
            }
        } catch (Exception unused2) {
            I0IIOi(fragment);
        }
    }

    /* JADX INFO: renamed from: iO */
    public final void m38859iO(@aa1 Fragment fragment) {
        Intrinsics.X0O(fragment, "fragment");
        Intent intent = new Intent();
        try {
            try {
                intent.setClassName("com.oppo.safe", "com.oppo.safe.SecureSafeMainActivity");
                fragment.startActivityForResult(intent, 101);
            } catch (Throwable unused) {
                intent.setComponent(ComponentName.unflattenFromString("com.coloros.safecenter/.startupapp.StartupAppListActivity"));
                fragment.startActivityForResult(intent, 101);
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.SecureSafeMainActivity"));
                fragment.startActivityForResult(intent2, 101);
            } catch (Exception unused2) {
                I0IIOi(fragment);
            }
        }
    }
}
