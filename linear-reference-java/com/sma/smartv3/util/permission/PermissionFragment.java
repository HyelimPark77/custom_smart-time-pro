package com.sma.smartv3.util.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.nq1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wg1;
import com.blankj.utilcode.util.RomUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionFragment extends Fragment {

    @aa1
    public static PermissionType I1;

    @aa1
    public static final OXO1 IO = null;

    @tb1
    public static wg1 iX1O1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final PermissionType OXO1() {
            return PermissionFragment.XIi00iiXO();
        }

        public final void XIi00iiXO(@aa1 Activity r2, @aa1 PermissionType r3, @aa1 wg1 r4) {
            Intrinsics.X0O(r2, "activity");
            Intrinsics.X0O(r3, "permissionType");
            Intrinsics.X0O(r4, "onPermissionResult");
            PermissionFragment.IO.iO(r3);
            PermissionFragment.iO(r4);
            r2.getFragmentManager().beginTransaction().add(new PermissionFragment(), r2.getLocalClassName()).commitAllowingStateLoss();
        }

        public final void iO(@aa1 PermissionType r2) {
            Intrinsics.X0O(r2, "<set-?>");
            PermissionFragment.XO0O10(r2);
        }

        public OXO1() {
        }
    }

    public static final enum PermissionType extends Enum<PermissionType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ PermissionType[] $VALUES = null;
        public static final PermissionType AUTO_RUN = null;
        public static final PermissionType BATTERY_OPTIMIZATIONS = null;

        private static final /* synthetic */ PermissionType[] $values() {
            return new PermissionType[]{AUTO_RUN, BATTERY_OPTIMIZATIONS};
        }

        static {
            AUTO_RUN = new PermissionType(com.sma.smartv3.util.permission.OXO1.XIi00iiXO, 0);
            BATTERY_OPTIMIZATIONS = new PermissionType("BATTERY_OPTIMIZATIONS", 1);
            PermissionType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private PermissionType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<PermissionType> getEntries() {
            return $ENTRIES;
        }

        public static PermissionType valueOf(String r1) {
            return (PermissionType) Enum.valueOf(PermissionType.class, r1);
        }

        public static PermissionType[] values() {
            return (PermissionType[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PermissionType.values().length];
            r0[PermissionType.AUTO_RUN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[PermissionType.BATTERY_OPTIMIZATIONS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    static {
        IO = new OXO1(null);
        I1 = PermissionType.AUTO_RUN;
    }

    public PermissionFragment() {
    }

    public static final void IiI10X(int r1, PermissionFragment r2) {
        if (r1 != 101) goto L5;
        r2.O00(false);
        return;
    L5:
        if (r1 == 201) goto L7;
        return;
    L7:
        Activity r3 = r2.getActivity();
        Intrinsics.O10IXXX0X(r3, "getActivity(...)");
        r2.O00(com.sma.smartv3.util.permission.XIi00iiXO.XIi00iiXO(r3));
    }

    public static /* synthetic */ void OXO1(int r0, PermissionFragment r1) {
        IiI10X(r0, r1);
    }

    public static final /* synthetic */ PermissionType XIi00iiXO() {
        return I1;
    }

    public static final /* synthetic */ void XO0O10(PermissionType r0) {
        I1 = r0;
    }

    public static final /* synthetic */ void iO(wg1 r0) {
        iX1O1 = r0;
    }

    public final void O00(boolean r2) {
        wg1 r0 = iX1O1;
        if (r0 == null) goto L6;
        r0.OXO1(r2);
    L6:
        if (RomUtils.isSamsung() == false) goto L8;
        return;
    L8:
        if (RomUtils.isOppo() == true) goto L12;
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        return;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@tb1 Bundle r2) {
        super.onActivityCreated(r2);
        PermissionType r3 = I1;
        int r4 = XIi00iiXO.OXO1[r3.ordinal()];
        if (r4 != 1) goto L5;
        com.sma.smartv3.util.permission.OXO1.OXO1.IO(this);
        return;
    L5:
        if (r4 != 2) goto L9;
        com.sma.smartv3.util.permission.XIi00iiXO.OXO1.XO0O10(this);
        return;
    L9:
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.app.Fragment
    public void onActivityResult(final int r3, int r4, @tb1 Intent r5) {
        new Handler().postDelayed(new nq1(r3, this), 500);
    }
}
