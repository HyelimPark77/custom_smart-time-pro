package com.sma.smartv3.ui.device;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.IO0III;
import com.android.mltcode.paycertificationapi.IXXiI0;
import com.android.mltcode.paycertificationapi.IXi1iX1I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiXOI0I;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.DfuProgress;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
public abstract class BaseFirmwareRepairActivity extends BaseActivity {

    @aa1
    private final Lazy dfuProgress$delegate;
    private boolean mStarted;

    @aa1
    private final Lazy tvName$delegate;

    @aa1
    private final Lazy tvSize$delegate;

    @aa1
    private final Lazy tvTip$delegate;

    public BaseFirmwareRepairActivity() {
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new IO0III(this));
        this.tvName$delegate = LazyKt__LazyJVMKt.iO(new IXXiI0(this));
        this.tvSize$delegate = LazyKt__LazyJVMKt.iO(new IXi1iX1I(this));
        this.dfuProgress$delegate = LazyKt__LazyJVMKt.iO(new iiXOI0I(this));
    }

    public static /* synthetic */ TextView I0iXXO(BaseFirmwareRepairActivity r0) {
        return tvSize_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(BaseFirmwareRepairActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(BaseFirmwareRepairActivity r0) {
        return tvName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DfuProgress XXI(BaseFirmwareRepairActivity r0) {
        return dfuProgress_delegate$lambda$0(r0);
    }

    private static final DfuProgress dfuProgress_delegate$lambda$0(BaseFirmwareRepairActivity r1) {
        return (DfuProgress) r1.findViewById(R.id.dfu_progress);
    }

    private static final TextView tvName_delegate$lambda$0(BaseFirmwareRepairActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_name);
    }

    private static final TextView tvSize_delegate$lambda$0(BaseFirmwareRepairActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_size);
    }

    private static final TextView tvTip_delegate$lambda$0(BaseFirmwareRepairActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    @aa1
    public final DfuProgress getDfuProgress() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (DfuProgress) r0;
    }

    public final boolean getMStarted() {
        return this.mStarted;
    }

    @aa1
    public final TextView getTvName() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvSize() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvTip() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        BleInitializer.IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
    }

    public boolean isNeedLaunch() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_firmware_repair;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleInitializer.IO.i1iII1i1(false);
        if (isNeedLaunch() == false) goto L5;
        BleConnector.INSTANCE.launch();
    L5:
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mStarted == true) goto L6;
        finish();
        return;
    }

    public final void setMStarted(boolean r1) {
        this.mStarted = r1;
        if (r1 == false) goto L6;
        disableOrientation();
        return;
    }
}
