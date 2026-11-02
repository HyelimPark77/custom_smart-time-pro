package com.sma.smartv3.p610ui.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeSActivity$localBroadcastReceiver$2$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FirmwareUpgradeSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ FirmwareUpgradeSActivity OXO1;

    public FirmwareUpgradeSActivity$localBroadcastReceiver$2$1(FirmwareUpgradeSActivity firmwareUpgradeSActivity) {
        this.OXO1 = firmwareUpgradeSActivity;
    }

    public static final void XO0O10(int i, FirmwareUpgradeSActivity firmwareUpgradeSActivity) {
        if (i == 0) {
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
            ToastUtils.showLong(R.string.upgrade_successful);
            firmwareUpgradeSActivity.finish();
            if (firmwareUpgradeSActivity.isAutoUpdate()) {
                I01XX0.OXO1(I01XX0.Xi1i0XOX0, "done");
            }
            BaseFirmwareUpgradeActivity.uploadOtaRecord$default(firmwareUpgradeSActivity, "0", null, null, null, null, 30, null);
        } else if (i != 63) {
            firmwareUpgradeSActivity.getTvTip().setText(firmwareUpgradeSActivity.getString(R.string.firmware_upgrading_failed) + "  error=" + i);
            ProgressButton.O00(firmwareUpgradeSActivity.getProgressButton(), R.string.firmware_upgrading_failed, false, 2, null);
            if (firmwareUpgradeSActivity.isAutoUpdate()) {
                firmwareUpgradeSActivity.finish();
                I01XX0.OXO1(I01XX0.Xi1i0XOX0, Integer.valueOf(i));
            }
            BaseFirmwareUpgradeActivity.uploadOtaRecord$default(firmwareUpgradeSActivity, "-1", "dfuStateResult = " + i, null, null, null, 28, null);
        } else {
            firmwareUpgradeSActivity.getTvTip().setText(firmwareUpgradeSActivity.getString(R.string.firmware_upgrading_failed));
            String string = firmwareUpgradeSActivity.getString(R.string.request_bluetooth_permission_denied_tip);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            ToastUtils.showLong(string, new Object[0]);
            if (firmwareUpgradeSActivity.isAutoUpdate()) {
                firmwareUpgradeSActivity.finish();
                I01XX0.OXO1(I01XX0.Xi1i0XOX0, string);
            }
            BaseFirmwareUpgradeActivity.uploadOtaRecord$default(firmwareUpgradeSActivity, "-1", "dfuStateResult = " + i, null, null, null, 28, null);
        }
        firmwareUpgradeSActivity.setMStarted(false);
    }

    /* JADX INFO: renamed from: iO */
    public static final void m38381iO(FirmwareUpgradeSActivity firmwareUpgradeSActivity, int i) {
        firmwareUpgradeSActivity.getTvTip().setText(firmwareUpgradeSActivity.getString(R.string.starting));
        firmwareUpgradeSActivity.getProgressButton().setProgress(i / 100.0f);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1936294892) {
                if (action.equals(SifliDFUService.BROADCAST_DFU_PROGRESS)) {
                    final int intExtra = intent.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, 0);
                    intent.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS_TYPE, 0);
                    if (intExtra != this.OXO1.lastProgress) {
                        i1O0OXO1O.OXO1.OXO1(this.OXO1.TAG + " progress - " + intExtra);
                        this.OXO1.lastProgress = intExtra;
                        final FirmwareUpgradeSActivity firmwareUpgradeSActivity = this.OXO1;
                        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.II01XX
                            @Override // java.lang.Runnable
                            public final void run() {
                                FirmwareUpgradeSActivity$localBroadcastReceiver$2$1.m38381iO(firmwareUpgradeSActivity, intExtra);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode != 888644493) {
                if (iHashCode == 1761809728 && action.equals(SifliDFUService.BROADCAST_DFU_LOG)) {
                    String stringExtra = intent.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE);
                    i1O0OXO1O.OXO1.OXO1(this.OXO1.TAG + " DFU LOG - " + stringExtra);
                    return;
                }
                return;
            }
            if (action.equals(SifliDFUService.BROADCAST_DFU_STATE)) {
                int intExtra2 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, 0);
                final int intExtra3 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, 0);
                i1O0OXO1O.OXO1.OXO1(this.OXO1.TAG + " BROADCAST_DFU_STATE result : dfuState=" + intExtra2 + "  dfuStateResult = " + intExtra3);
                if (intExtra2 == 7) {
                    a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
                } else {
                    if (intExtra2 != 100) {
                        return;
                    }
                    final FirmwareUpgradeSActivity firmwareUpgradeSActivity2 = this.OXO1;
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XI1i0X
                        @Override // java.lang.Runnable
                        public final void run() {
                            FirmwareUpgradeSActivity$localBroadcastReceiver$2$1.XO0O10(intExtra3, firmwareUpgradeSActivity2);
                        }
                    });
                }
            }
        }
    }
}
