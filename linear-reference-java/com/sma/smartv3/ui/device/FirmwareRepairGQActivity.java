package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Observer;
import com.android.mltcode.paycertificationapi.OI0OOI01;
import com.android.mltcode.paycertificationapi.X0OOOIi0I;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfu;
import com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback;
import com.google.gson.Gson;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.szabh.androiddfu.goodix.DfuConnection;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairGQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n15#2:121\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n*L\n31#1:121\n*E\n"})
public final class FirmwareRepairGQActivity extends BaseFirmwareRepairActivity implements Observer<Object>, FastDfuProgressCallback {

    @aa1
    private final Lazy mDevice$delegate;

    @tb1
    private final FirmwareVersion mLatest;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[DfuConnection.ConnState.values().length];
            r0[DfuConnection.ConnState.DISCONNECTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[DfuConnection.ConnState.READY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    public FirmwareRepairGQActivity() {
        this.mDevice$delegate = LazyKt__LazyJVMKt.iO(new OI0OOI01());
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        this.mLatest = (FirmwareVersion) new Gson().fromJson(r0.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
    }

    public static /* synthetic */ BluetoothDevice O10IXXX0X() {
        return mDevice_delegate$lambda$0();
    }

    public static /* synthetic */ void X0O(FirmwareRepairGQActivity r0) {
        upgrade$lambda$0(r0);
    }

    public static final /* synthetic */ void access$upgrade(FirmwareRepairGQActivity r0) {
        r0.upgrade();
    }

    private final BluetoothDevice getMDevice() {
        return (BluetoothDevice) getValue();
    }

    private static final BluetoothDevice mDevice_delegate$lambda$0() {
        return BluetoothAdapter.getDefaultAdapter().getRemoteDevice(BleCache.INSTANCE.getMDfuAddress());
    }

    private final void upgrade() {
        LogUtils.d(new Object[]{"start upgrade"});
        setMStarted(true);
        new Handler().postDelayed(new X0OOOIi0I(this), 1000);
    }

    private static final void upgrade$lambda$0(FirmwareRepairGQActivity r4) {
        LogUtils.d(new Object[]{"start OTA"});
        File r0 = new File(uz0.XXI(sz0.OXO1));
        FirmwareVersion r3 = r4.mLatest;
        Intrinsics.XXI(r3);
        FileInputStream r1 = new FileInputStream(new File(r0, r3.getFileName()));
        FastDfu r2 = new FastDfu();
        r2.setListener(r4);
        r2.startDfu(r4, r4.getMDevice(), r1);
        r1.close();
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (this.mLatest != null) goto L6;
        ToastUtils.showLong(R.string.not_found_repair_version);
        finish();
        return;
    L6:
        setMStarted(true);
        getTvName().setText(this.mLatest.getFileName());
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mLatest.getFileSize()));
        NetWorkUtils.INSTANCE.download(this.mLatest.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatest.getFileName(), new AnonymousClass1(this));
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "connState");
        if ((r3 instanceof DfuConnection.ConnState) == false) goto L14;
        int r0 = OXO1.OXO1[((DfuConnection.ConnState) r3).ordinal()];
        if (r0 != 1) goto L7;
        setMStarted(false);
        getTvTip().setText(R.string.firmware_upgrading_failed);
        return;
    L7:
        if (r0 == 2) goto L10;
        LogUtils.d(new Object[]{"DfuConnection.ConnState " + r3});
        return;
    L10:
        LogUtils.d(new Object[]{"DfuConnection.ConnState.READY"});
        return;
    }

    @Override // com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuComplete() {
        ToastUtils.showLong(R.string.repair_successful);
        finish();
    }

    @Override // com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuErase(int r2) {
        getTvTip().setText(R.string.cache_cleaning);
    }

    @Override // com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuError(int r1, @tb1 String r2, @tb1 Error r3) {
        setMStarted(false);
        getTvTip().setText(R.string.firmware_upgrading_failed);
    }

    @Override // com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuProgress(int r3) {
        getTvTip().setText(R.string.firmware_repair_repairing_tip);
        getDfuProgress().setProgress(r3 / 100.0f);
    }

    @Override // com.goodix.ble.gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuStart() {
        getTvTip().setText(R.string.starting);
    }
}
