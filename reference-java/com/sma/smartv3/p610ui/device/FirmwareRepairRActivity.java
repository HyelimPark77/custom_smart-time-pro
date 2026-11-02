package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareRepairRActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n15#2:154\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity\n*L\n37#1:154\n*E\n"})
public final class FirmwareRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final Lazy mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOI110O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairRActivity.mDfuHelper_delegate$lambda$0(this.f3210IO);
        }
    });

    @tb1
    private final FirmwareVersion mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);

    @aa1
    private final OXO1 mDfuCallback = new OXO1();

    @SourceDebugExtension({"SMAP\nFirmwareRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity$mDfuCallback$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n27#2,2:154\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity$mDfuCallback$1\n*L\n65#1:154,2\n*E\n"})
    public static final class OXO1 extends DfuAdapter.DfuHelperCallback {
        public OXO1() {
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i, int i2) {
            LogUtils.m11129e("FirmwareUpgradeRActivity onError: type=" + i + ", code" + i2);
            FirmwareRepairRActivity.this.setMStarted(false);
            FirmwareRepairRActivity.this.getTvTip().setText(R.string.firmware_upgrading_failed);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i, Throughput throughput) {
            LogUtils.m11128d("onProcessStateChanged " + i);
            if (i == 258) {
                ToastUtils.showLong(R.string.repair_successful);
                a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
                I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
                FirmwareRepairRActivity.this.finish();
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            FirmwareRepairRActivity.this.getDfuProgress().setProgress(progressInfo.getProgress() / 100.0f);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i) {
            LogUtils.m11128d("onStateChanged " + i);
            if (i == 258) {
                FirmwareRepairRActivity.this.setMStarted(true);
                FirmwareRepairRActivity.this.upgrade();
            } else {
                if (i != 4097) {
                    return;
                }
                FirmwareRepairRActivity.this.setMStarted(false);
                FirmwareRepairRActivity.this.getTvTip().setText(R.string.firmware_upgrading_failed);
            }
        }
    }

    public FirmwareRepairRActivity() {
        DfuConfig dfuConfig = new DfuConfig();
        dfuConfig.setAddress(BleCache.INSTANCE.getMDfuAddress());
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        this.mDfuConfig = dfuConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) this.mDfuHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FirmwareRepairRActivity firmwareRepairRActivity) {
        return GattDfuAdapter.getInstance(firmwareRepairRActivity.getMContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        setMStarted(true);
        LogUtils.m11128d("upgrade");
        getTvTip().setText(R.string.starting);
        DfuConfig dfuConfig = this.mDfuConfig;
        dfuConfig.setAddress(BleCache.INSTANCE.getMDfuAddress());
        dfuConfig.setOtaWorkMode(0);
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setVersionCheckEnabled(false);
        File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        Intrinsics.XXI(firmwareVersion);
        dfuConfig.setFilePath(new File(fileI0iXXO, firmwareVersion.getFileName()).getAbsolutePath());
        dfuConfig.setFileLocation(0);
        getMDfuHelper().startOtaProcess(dfuConfig);
        getTvSize().setText(FileUtils.getSize(this.mDfuConfig.getFilePath()));
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        setMStarted(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
        TextView tvName = getTvName();
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        tvName.setText(firmwareVersion != null ? firmwareVersion.getFileName() : null);
        FirmwareVersion firmwareVersion2 = this.mLatestFirmware;
        if ((firmwareVersion2 != null ? Integer.valueOf(firmwareVersion2.getFileSize()) : null) != null) {
            getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mLatestFirmware.getFileSize()));
        }
        getTvTip().setText(R.string.downloading);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        FirmwareVersion firmwareVersion3 = this.mLatestFirmware;
        Intrinsics.XXI(firmwareVersion3);
        netWorkUtils.download(firmwareVersion3.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairRActivity.initView.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                FirmwareRepairRActivity.this.getMDfuHelper().initialize(FirmwareRepairRActivity.this.mDfuCallback);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                FirmwareRepairRActivity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.abort();
            mDfuHelper.close();
        }
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted()) {
            return;
        }
        super.onHandleBackPressed();
    }
}
