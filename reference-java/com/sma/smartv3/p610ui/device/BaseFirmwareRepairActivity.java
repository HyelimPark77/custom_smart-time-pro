package com.sma.smartv3.p610ui.device;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.DfuProgress;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
public abstract class BaseFirmwareRepairActivity extends BaseActivity {
    private boolean mStarted;

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0III
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareRepairActivity.tvTip_delegate$lambda$0(this.f1722IO);
        }
    });

    @aa1
    private final Lazy tvName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXXiI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareRepairActivity.tvName_delegate$lambda$0(this.f2120IO);
        }
    });

    @aa1
    private final Lazy tvSize$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXi1iX1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareRepairActivity.tvSize_delegate$lambda$0(this.f2135IO);
        }
    });

    @aa1
    private final Lazy dfuProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiXOI0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareRepairActivity.dfuProgress_delegate$lambda$0(this.f8642IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final DfuProgress dfuProgress_delegate$lambda$0(BaseFirmwareRepairActivity baseFirmwareRepairActivity) {
        return (DfuProgress) baseFirmwareRepairActivity.findViewById(R.id.dfu_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvName_delegate$lambda$0(BaseFirmwareRepairActivity baseFirmwareRepairActivity) {
        return (TextView) baseFirmwareRepairActivity.findViewById(R.id.tv_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSize_delegate$lambda$0(BaseFirmwareRepairActivity baseFirmwareRepairActivity) {
        return (TextView) baseFirmwareRepairActivity.findViewById(R.id.tv_size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTip_delegate$lambda$0(BaseFirmwareRepairActivity baseFirmwareRepairActivity) {
        return (TextView) baseFirmwareRepairActivity.findViewById(R.id.tv_tip);
    }

    @aa1
    public final DfuProgress getDfuProgress() {
        Object value = this.dfuProgress$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (DfuProgress) value;
    }

    public final boolean getMStarted() {
        return this.mStarted;
    }

    @aa1
    public final TextView getTvName() {
        Object value = this.tvName$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvSize() {
        Object value = this.tvSize$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvTip() {
        Object value = this.tvTip$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        BleInitializer.f51208IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
    }

    public boolean isNeedLaunch() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_firmware_repair;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleInitializer.f51208IO.i1iII1i1(false);
        if (isNeedLaunch()) {
            BleConnector.INSTANCE.launch();
        }
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mStarted) {
            return;
        }
        finish();
    }

    public final void setMStarted(boolean z) {
        this.mStarted = z;
        if (z) {
            disableOrientation();
        }
    }
}
