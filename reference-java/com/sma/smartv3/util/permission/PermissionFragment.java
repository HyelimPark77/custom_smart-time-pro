package com.sma.smartv3.util.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wg1;
import com.blankj.utilcode.util.RomUtils;
import com.sma.smartv3.util.permission.PermissionFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionFragment extends Fragment {

    @tb1
    public static wg1 iX1O1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final OXO1 f54938IO = new OXO1(null);

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static PermissionType f54937I1 = PermissionType.AUTO_RUN;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final PermissionType OXO1() {
            return PermissionFragment.f54937I1;
        }

        public final void XIi00iiXO(@aa1 Activity activity, @aa1 PermissionType permissionType, @aa1 wg1 onPermissionResult) {
            Intrinsics.X0O(activity, "activity");
            Intrinsics.X0O(permissionType, "permissionType");
            Intrinsics.X0O(onPermissionResult, "onPermissionResult");
            PermissionFragment.f54938IO.m38861iO(permissionType);
            PermissionFragment.iX1O1 = onPermissionResult;
            activity.getFragmentManager().beginTransaction().add(new PermissionFragment(), activity.getLocalClassName()).commitAllowingStateLoss();
        }

        /* JADX INFO: renamed from: iO */
        public final void m38861iO(@aa1 PermissionType permissionType) {
            Intrinsics.X0O(permissionType, "<set-?>");
            PermissionFragment.f54937I1 = permissionType;
        }

        public OXO1() {
        }
    }

    public enum PermissionType {
        AUTO_RUN,
        BATTERY_OPTIMIZATIONS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<PermissionType> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PermissionType.values().length];
            try {
                iArr[PermissionType.AUTO_RUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionType.BATTERY_OPTIMIZATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public static final void IiI10X(int i, PermissionFragment permissionFragment) {
        if (i == 101) {
            permissionFragment.O00(false);
        } else {
            if (i != 201) {
                return;
            }
            Activity activity = permissionFragment.getActivity();
            Intrinsics.O10IXXX0X(activity, "getActivity(...)");
            permissionFragment.O00(com.sma.smartv3.util.permission.XIi00iiXO.XIi00iiXO(activity));
        }
    }

    public final void O00(boolean z) {
        wg1 wg1Var = iX1O1;
        if (wg1Var != null) {
            wg1Var.OXO1(z);
        }
        if (RomUtils.isSamsung() || RomUtils.isOppo()) {
            return;
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@tb1 Bundle bundle) {
        super.onActivityCreated(bundle);
        int i = XIi00iiXO.OXO1[f54937I1.ordinal()];
        if (i == 1) {
            com.sma.smartv3.util.permission.OXO1.OXO1.m38858IO(this);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            com.sma.smartv3.util.permission.XIi00iiXO.OXO1.XO0O10(this);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(final int i, int i2, @tb1 Intent intent) {
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.nq1
            @Override // java.lang.Runnable
            public final void run() {
                PermissionFragment.IiI10X(i, this);
            }
        }, 500L);
    }
}
