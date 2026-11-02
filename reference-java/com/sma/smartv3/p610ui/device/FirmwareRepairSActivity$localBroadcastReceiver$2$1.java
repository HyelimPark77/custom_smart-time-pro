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
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.p610ui.device.FirmwareRepairSActivity$localBroadcastReceiver$2$1;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,243:1\n27#2,2:244\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n*L\n90#1:244,2\n*E\n"})
public final class FirmwareRepairSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ FirmwareRepairSActivity OXO1;

    public FirmwareRepairSActivity$localBroadcastReceiver$2$1(FirmwareRepairSActivity firmwareRepairSActivity) {
        this.OXO1 = firmwareRepairSActivity;
    }

    public static final void XO0O10(int i, FirmwareRepairSActivity firmwareRepairSActivity) {
        if (i == 0) {
            a01 a01Var = a01.OXO1;
            a01Var.XIi00iiXO().put(b01.IiI10X, false);
            ToastUtils.showLong(R.string.upgrade_successful);
            a01Var.XIi00iiXO().remove(FirmwareVersion.class.getName());
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            firmwareRepairSActivity.finish();
        } else if (i != 63) {
            firmwareRepairSActivity.getTvTip().setText(firmwareRepairSActivity.getString(R.string.firmware_upgrading_failed) + "  error=" + i);
        } else {
            firmwareRepairSActivity.getTvTip().setText(firmwareRepairSActivity.getString(R.string.firmware_upgrading_failed));
            ToastUtils.showLong(firmwareRepairSActivity.getString(R.string.request_bluetooth_permission_denied_tip), new Object[0]);
        }
        firmwareRepairSActivity.setMStarted(false);
    }

    /* JADX INFO: renamed from: iO */
    public static final void m38368iO(FirmwareRepairSActivity firmwareRepairSActivity, int i) {
        firmwareRepairSActivity.getTvTip().setText(firmwareRepairSActivity.getString(R.string.starting));
        firmwareRepairSActivity.getDfuProgress().setProgress(i / 100.0f);
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
                    final FirmwareRepairSActivity firmwareRepairSActivity = this.OXO1;
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1Xii1O
                        @Override // java.lang.Runnable
                        public final void run() {
                            FirmwareRepairSActivity$localBroadcastReceiver$2$1.m38368iO(firmwareRepairSActivity, intExtra);
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
                i1O0OXO1O.OXO1.OXO1(this.OXO1.TAG + "  BROADCAST_DFU_STATE  result : dfuState=" + intExtra2 + "  dfuStateResult = " + intExtra3);
                if (intExtra2 == 7) {
                    a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
                } else {
                    if (intExtra2 != 100) {
                        return;
                    }
                    final FirmwareRepairSActivity firmwareRepairSActivity2 = this.OXO1;
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XiXiii1i
                        @Override // java.lang.Runnable
                        public final void run() {
                            FirmwareRepairSActivity$localBroadcastReceiver$2$1.XO0O10(intExtra3, firmwareRepairSActivity2);
                        }
                    });
                }
            }
        }
    }
}
