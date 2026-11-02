package com.sma.smartv3.ui.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XiXiii1i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1Xii1O;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,243:1\n27#2,2:244\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n*L\n90#1:244,2\n*E\n"})
public final class FirmwareRepairSActivity$localBroadcastReceiver$2$1 extends BroadcastReceiver {
    public final /* synthetic */ FirmwareRepairSActivity OXO1;

    public FirmwareRepairSActivity$localBroadcastReceiver$2$1(FirmwareRepairSActivity r1) {
        this.OXO1 = r1;
    }

    public static /* synthetic */ void OXO1(FirmwareRepairSActivity r0, int r1) {
        iO(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(int r0, FirmwareRepairSActivity r1) {
        XO0O10(r0, r1);
    }

    public static final void XO0O10(int r4, FirmwareRepairSActivity r5) {
        if (r4 != 0) goto L5;
        a01 r6 = a01.OXO1;
        r6.XIi00iiXO().put(b01.IiI10X, false);
        ToastUtils.showLong(R.string.upgrade_successful);
        r6.XIi00iiXO().remove(FirmwareVersion.class.getName());
        I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
        r5.finish();
    L9:
        r5.setMStarted(false);
        return;
    L5:
        if (r4 == 63) goto L7;
        r5.getTvTip().setText(r5.getString(R.string.firmware_upgrading_failed) + "  error=" + r4);
        goto L9
    L7:
        r5.getTvTip().setText(r5.getString(R.string.firmware_upgrading_failed));
        ToastUtils.showLong(r5.getString(R.string.request_bluetooth_permission_denied_tip), new Object[0]);
        goto L9
    }

    public static final void iO(FirmwareRepairSActivity r2, int r3) {
        r2.getTvTip().setText(r2.getString(R.string.starting));
        r2.getDfuProgress().setProgress(r3 / 100.0f);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r4, Intent r5) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, SDKConstants.PARAM_INTENT);
        String r6 = r5.getAction();
        if (r6 == null) goto L33;
        int r0 = r6.hashCode();
        if (r0 == (-1936294892)) goto L29;
        if (r0 == 888644493) goto L17;
        if (r0 == 1761809728) goto L12;
        return;
    L12:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_LOG) == false) goto L35;
        String r7 = r5.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE);
        i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.access$getTAG$p(this.OXO1) + " DFU LOG - " + r7);
        return;
    L35:
        return;
    L17:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_STATE) == false) goto L36;
        int r8 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, 0);
        final int r9 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, 0);
        i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.access$getTAG$p(this.OXO1) + "  BROADCAST_DFU_STATE  result : dfuState=" + r8 + "  dfuStateResult = " + r9);
        if (r8 != 7) goto L22;
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
        return;
    L22:
        if (r8 != 100) goto L37;
        final FirmwareRepairSActivity r10 = this.OXO1;
        ThreadUtils.runOnUiThread(new XiXiii1i(r9, r10));
        return;
    L37:
        return;
    L36:
        return;
    L29:
        if (r6.equals(SifliDFUService.BROADCAST_DFU_PROGRESS) == false) goto L38;
        final int r11 = r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, 0);
        r5.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS_TYPE, 0);
        i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.access$getTAG$p(this.OXO1) + " progress - " + r11);
        final FirmwareRepairSActivity r12 = this.OXO1;
        ThreadUtils.runOnUiThread(new i1Xii1O(r12, r11));
        return;
    L38:
        return;
    }
}
