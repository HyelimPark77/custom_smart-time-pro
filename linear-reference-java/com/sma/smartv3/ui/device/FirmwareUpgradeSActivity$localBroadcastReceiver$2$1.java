package com.sma.smartv3.ui.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.II01XX;
import com.android.mltcode.paycertificationapi.XI1i0X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FirmwareUpgradeSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ FirmwareUpgradeSActivity OXO1;

    public FirmwareUpgradeSActivity$localBroadcastReceiver$2$1(FirmwareUpgradeSActivity r1) {
        this.OXO1 = r1;
    }

    public static /* synthetic */ void OXO1(int r0, FirmwareUpgradeSActivity r1) {
        XO0O10(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(FirmwareUpgradeSActivity r0, int r1) {
        iO(r0, r1);
    }

    public static final void XO0O10(int r9, FirmwareUpgradeSActivity r10) {
        if (r9 != 0) goto L5;
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
        ToastUtils.showLong(R.string.upgrade_successful);
        r10.finish();
        if (r10.isAutoUpdate() == false) goto L17;
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "done");
    L17:
        BaseFirmwareUpgradeActivity.uploadOtaRecord$default(r10, "0", null, null, null, null, 30, null);
    L18:
        r10.setMStarted(false);
        return;
    L5:
        if (r9 == 63) goto L10;
        r10.getTvTip().setText(r10.getString(R.string.firmware_upgrading_failed) + "  error=" + r9);
        ProgressButton.O00(r10.getProgressButton(), R.string.firmware_upgrading_failed, false, 2, null);
        if (r10.isAutoUpdate() == false) goto L9;
        r10.finish();
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, Integer.valueOf(r9));
    L9:
        BaseFirmwareUpgradeActivity.uploadOtaRecord$default(r10, "-1", "dfuStateResult = " + r9, null, null, null, 28, null);
        goto L18
    L10:
        r10.getTvTip().setText(r10.getString(R.string.firmware_upgrading_failed));
        String r3 = r10.getString(R.string.request_bluetooth_permission_denied_tip);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ToastUtils.showLong(r3, new Object[0]);
        if (r10.isAutoUpdate() == false) goto L13;
        r10.finish();
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, r3);
    L13:
        BaseFirmwareUpgradeActivity.uploadOtaRecord$default(r10, "-1", "dfuStateResult = " + r9, null, null, null, 28, null);
        goto L18
    }

    public static final void iO(FirmwareUpgradeSActivity r2, int r3) {
        r2.getTvTip().setText(r2.getString(R.string.starting));
        r2.getProgressButton().setProgress(r3 / 100.0f);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r4, Intent r5) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, SDKConstants.PARAM_INTENT);
        String r6 = r5.getAction();
        if (r6 == null) goto L35;
        int r0 = r6.hashCode();
        if (r0 == (-1936294892)) goto L29;
        if (r0 == 888644493) goto L17;
        if (r0 == 1761809728) goto L12;
        return;
    L12:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_LOG) == false) goto L38;
        String r7 = r5.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE);
        i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.access$getTAG$p(this.OXO1) + " DFU LOG - " + r7);
        return;
    L38:
        return;
    L17:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_STATE) == false) goto L39;
        int r8 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, 0);
        final int r9 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, 0);
        i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.access$getTAG$p(this.OXO1) + " BROADCAST_DFU_STATE result : dfuState=" + r8 + "  dfuStateResult = " + r9);
        if (r8 != 7) goto L22;
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
        return;
    L22:
        if (r8 != 100) goto L40;
        final FirmwareUpgradeSActivity r10 = this.OXO1;
        ThreadUtils.runOnUiThread(new XI1i0X(r9, r10));
        return;
    L40:
        return;
    L39:
        return;
    L29:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_PROGRESS) == false) goto L41;
        final int r11 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, 0);
        r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS_TYPE, 0);
        if (r11 == FirmwareUpgradeSActivity.access$getLastProgress$p(this.OXO1)) goto L36;
        i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.access$getTAG$p(this.OXO1) + " progress - " + r11);
        FirmwareUpgradeSActivity.access$setLastProgress$p(this.OXO1, r11);
        final FirmwareUpgradeSActivity r12 = this.OXO1;
        ThreadUtils.runOnUiThread(new II01XX(r12, r11));
        return;
    L36:
        return;
    L41:
        return;
    }
}
