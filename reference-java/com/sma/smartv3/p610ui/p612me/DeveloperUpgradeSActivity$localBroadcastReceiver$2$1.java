package com.sma.smartv3.p610ui.p612me;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.ThreadUtils;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.p610ui.p612me.DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.component.BleConnector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperUpgradeSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ DeveloperUpgradeSActivity OXO1;

    public DeveloperUpgradeSActivity$localBroadcastReceiver$2$1(DeveloperUpgradeSActivity developerUpgradeSActivity) {
        this.OXO1 = developerUpgradeSActivity;
    }

    public static final void IiI10X(DeveloperUpgradeSActivity developerUpgradeSActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String str = developerUpgradeSActivity.deviceAddress;
        Intrinsics.O10IXXX0X(str, "access$getDeviceAddress$p(...)");
        bleConnector.setAddress(str).connect(true);
    }

    public static final void O00(int i, final DeveloperUpgradeSActivity developerUpgradeSActivity) {
        if (i != 0) {
            developerUpgradeSActivity.getTvTip().setText(developerUpgradeSActivity.getString(R.string.firmware_upgrading_failed) + "  error=" + i);
            ProgressButton.O00(developerUpgradeSActivity.getProgressButton(), R.string.firmware_upgrading_failed, false, 2, null);
        } else if (developerUpgradeSActivity.isAutoShutdown) {
            developerUpgradeSActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XIIiiXi
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeSActivity$localBroadcastReceiver$2$1.IiI10X(developerUpgradeSActivity);
                }
            }, 2000L);
        } else {
            developerUpgradeSActivity.upgradeExit();
        }
        developerUpgradeSActivity.setMStarted(false);
    }

    public static final void XO0O10(DeveloperUpgradeSActivity developerUpgradeSActivity, int i) {
        developerUpgradeSActivity.getTvTip().setText(developerUpgradeSActivity.getString(R.string.starting));
        developerUpgradeSActivity.getProgressButton().setProgress(i / 100.0f);
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
                    i1O0OXO1O.OXO1.OXO1(this.OXO1.TAG + " progress - " + intExtra);
                    final DeveloperUpgradeSActivity developerUpgradeSActivity = this.OXO1;
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1OI0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeSActivity$localBroadcastReceiver$2$1.XO0O10(developerUpgradeSActivity, intExtra);
                        }
                    });
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
                if (intExtra2 == 100) {
                    final DeveloperUpgradeSActivity developerUpgradeSActivity2 = this.OXO1;
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOOIii0I
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeSActivity$localBroadcastReceiver$2$1.O00(intExtra3, developerUpgradeSActivity2);
                        }
                    });
                }
            }
        }
    }
}
