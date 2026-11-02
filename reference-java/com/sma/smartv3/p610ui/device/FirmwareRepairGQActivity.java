package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Observer;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfu;
import com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback;
import com.google.gson.Gson;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareRepairGQActivity;
import com.sma.smartv3.pro.R;
import com.szabh.androiddfu.goodix.DfuConnection;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairGQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n15#2:121\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n*L\n31#1:121\n*E\n"})
public final class FirmwareRepairGQActivity extends BaseFirmwareRepairActivity implements Observer<Object>, FastDfuProgressCallback {

    @aa1
    private final Lazy mDevice$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0OOI01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairGQActivity.mDevice_delegate$lambda$0();
        }
    });

    @tb1
    private final FirmwareVersion mLatest = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[DfuConnection.ConnState.values().length];
            try {
                iArr[DfuConnection.ConnState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DfuConnection.ConnState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    private final BluetoothDevice getMDevice() {
        return (BluetoothDevice) this.mDevice$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BluetoothDevice mDevice_delegate$lambda$0() {
        return BluetoothAdapter.getDefaultAdapter().getRemoteDevice(BleCache.INSTANCE.getMDfuAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        LogUtils.m11128d("start upgrade");
        setMStarted(true);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X0OOOIi0I
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                FirmwareRepairGQActivity.upgrade$lambda$0(this.f3995IO);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$0(FirmwareRepairGQActivity firmwareRepairGQActivity) throws IOException {
        LogUtils.m11128d("start OTA");
        File file = new File(uz0.XXI(sz0.OXO1));
        FirmwareVersion firmwareVersion = firmwareRepairGQActivity.mLatest;
        Intrinsics.XXI(firmwareVersion);
        FileInputStream fileInputStream = new FileInputStream(new File(file, firmwareVersion.getFileName()));
        FastDfu fastDfu = new FastDfu();
        fastDfu.setListener(firmwareRepairGQActivity);
        fastDfu.startDfu(firmwareRepairGQActivity, firmwareRepairGQActivity.getMDevice(), fileInputStream);
        fileInputStream.close();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (this.mLatest == null) {
            ToastUtils.showLong(R.string.not_found_repair_version);
            finish();
        } else {
            setMStarted(true);
            getTvName().setText(this.mLatest.getFileName());
            getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mLatest.getFileSize()));
            NetWorkUtils.INSTANCE.download(this.mLatest.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatest.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairGQActivity.initView.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    FirmwareRepairGQActivity.this.upgrade();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FirmwareRepairGQActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(@aa1 Object connState) {
        Intrinsics.X0O(connState, "connState");
        if (connState instanceof DfuConnection.ConnState) {
            int i = OXO1.OXO1[((DfuConnection.ConnState) connState).ordinal()];
            if (i == 1) {
                setMStarted(false);
                getTvTip().setText(R.string.firmware_upgrading_failed);
            } else {
                if (i == 2) {
                    LogUtils.m11128d("DfuConnection.ConnState.READY");
                    return;
                }
                LogUtils.m11128d("DfuConnection.ConnState " + connState);
            }
        }
    }

    @Override // com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuComplete() {
        ToastUtils.showLong(R.string.repair_successful);
        finish();
    }

    @Override // com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuErase(int i) {
        getTvTip().setText(R.string.cache_cleaning);
    }

    @Override // com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuError(int i, @tb1 String str, @tb1 Error error) {
        setMStarted(false);
        getTvTip().setText(R.string.firmware_upgrading_failed);
    }

    @Override // com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuProgress(int i) {
        getTvTip().setText(R.string.firmware_repair_repairing_tip);
        getDfuProgress().setProgress(i / 100.0f);
    }

    @Override // com.goodix.ble.p595gr.toolbox.app.libfastdfu.FastDfuProgressCallback
    public void onDfuStart() {
        getTvTip().setText(R.string.starting);
    }
}
