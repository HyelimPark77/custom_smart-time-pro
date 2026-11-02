package com.sma.smartv3.ui.me;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.XIIiiXi;
import com.android.mltcode.paycertificationapi.XOOIii0I;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OI0;
import com.blankj.utilcode.util.ThreadUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.component.BleConnector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperUpgradeSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ DeveloperUpgradeSActivity OXO1;

    public DeveloperUpgradeSActivity$localBroadcastReceiver$2$1(DeveloperUpgradeSActivity r1) {
        this.OXO1 = r1;
    }

    public static final void IiI10X(DeveloperUpgradeSActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = DeveloperUpgradeSActivity.access$getDeviceAddress$p(r2);
        Intrinsics.O10IXXX0X(r3, "access$getDeviceAddress$p(...)");
        r0.setAddress(r3).connect(true);
    }

    public static final void O00(int r5, final DeveloperUpgradeSActivity r6) {
        if (r5 == 0) goto L5;
        DeveloperUpgradeSActivity.access$getTvTip(r6).setText(r6.getString(R.string.firmware_upgrading_failed) + "  error=" + r5);
        ProgressButton.O00(DeveloperUpgradeSActivity.access$getProgressButton(r6), R.string.firmware_upgrading_failed, false, 2, null);
    L9:
        DeveloperUpgradeSActivity.access$setMStarted(r6, false);
        return;
    L5:
        if (DeveloperUpgradeSActivity.access$isAutoShutdown$p(r6) == false) goto L7;
        DeveloperUpgradeSActivity.access$getMHandler$p(r6).postDelayed(new XIIiiXi(r6), 2000);
        goto L9
    L7:
        DeveloperUpgradeSActivity.access$upgradeExit(r6);
        goto L9
    }

    public static /* synthetic */ void OXO1(DeveloperUpgradeSActivity r0, int r1) {
        XO0O10(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(DeveloperUpgradeSActivity r0) {
        IiI10X(r0);
    }

    public static final void XO0O10(DeveloperUpgradeSActivity r2, int r3) {
        DeveloperUpgradeSActivity.access$getTvTip(r2).setText(r2.getString(R.string.starting));
        DeveloperUpgradeSActivity.access$getProgressButton(r2).setProgress(r3 / 100.0f);
    }

    public static /* synthetic */ void iO(int r0, DeveloperUpgradeSActivity r1) {
        O00(r0, r1);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r4, Intent r5) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, SDKConstants.PARAM_INTENT);
        String r6 = r5.getAction();
        if (r6 == null) goto L28;
        int r0 = r6.hashCode();
        if (r0 == (-1936294892)) goto L24;
        if (r0 == 888644493) goto L17;
        if (r0 == 1761809728) goto L12;
        return;
    L12:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_LOG) == false) goto L31;
        String r7 = r5.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE);
        i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeSActivity.access$getTAG$p(this.OXO1) + " DFU LOG - " + r7);
        return;
    L31:
        return;
    L17:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_STATE) == false) goto L32;
        int r8 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, 0);
        final int r9 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, 0);
        i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeSActivity.access$getTAG$p(this.OXO1) + " BROADCAST_DFU_STATE result : dfuState=" + r8 + "  dfuStateResult = " + r9);
        if (r8 != 100) goto L29;
        final DeveloperUpgradeSActivity r10 = this.OXO1;
        ThreadUtils.runOnUiThread(new XOOIii0I(r9, r10));
        return;
    L29:
        return;
    L32:
        return;
    L24:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_PROGRESS) == false) goto L33;
        final int r11 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, 0);
        r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS_TYPE, 0);
        i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeSActivity.access$getTAG$p(this.OXO1) + " progress - " + r11);
        final DeveloperUpgradeSActivity r12 = this.OXO1;
        ThreadUtils.runOnUiThread(new i1OI0(r12, r11));
        return;
    L33:
        return;
    }
}
