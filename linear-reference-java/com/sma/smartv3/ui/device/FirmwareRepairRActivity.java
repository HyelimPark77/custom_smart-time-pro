package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OOI110O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n15#2:154\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity\n*L\n37#1:154\n*E\n"})
public final class FirmwareRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final OXO1 mDfuCallback;

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final Lazy mDfuHelper$delegate;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @SourceDebugExtension({"SMAP\nFirmwareRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity$mDfuCallback$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n27#2,2:154\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairRActivity$mDfuCallback$1\n*L\n65#1:154,2\n*E\n"})
    public static final class OXO1 extends DfuAdapter.DfuHelperCallback {
        public final /* synthetic */ FirmwareRepairRActivity OXO1;

        public OXO1(FirmwareRepairRActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int r3, int r4) {
            LogUtils.e(new Object[]{"FirmwareUpgradeRActivity onError: type=" + r3 + ", code" + r4});
            this.OXO1.setMStarted(false);
            this.OXO1.getTvTip().setText(R.string.firmware_upgrading_failed);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int r2, Throughput r3) {
            LogUtils.d(new Object[]{"onProcessStateChanged " + r2});
            if (r2 != 258) goto L6;
            ToastUtils.showLong(R.string.repair_successful);
            a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            this.OXO1.finish();
            return;
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo r3) {
            Intrinsics.X0O(r3, "progressInfo");
            this.OXO1.getDfuProgress().setProgress(r3.getProgress() / 100.0f);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int r3) {
            LogUtils.d(new Object[]{"onStateChanged " + r3});
            if (r3 != 258) goto L5;
            this.OXO1.setMStarted(true);
            FirmwareRepairRActivity.access$upgrade(this.OXO1);
            return;
        L5:
            if (r3 == 4097) goto L7;
            return;
        L7:
            this.OXO1.setMStarted(false);
            this.OXO1.getTvTip().setText(R.string.firmware_upgrading_failed);
        }
    }

    public FirmwareRepairRActivity() {
        this.mDfuHelper$delegate = LazyKt__LazyJVMKt.iO(new OOI110O(this));
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r0.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mDfuCallback = new OXO1(this);
        DfuConfig r1 = new DfuConfig();
        r1.setAddress(BleCache.INSTANCE.getMDfuAddress());
        r1.setAutomaticActiveEnabled(true);
        r1.setFileLocation(0);
        this.mDfuConfig = r1;
    }

    public static /* synthetic */ GattDfuAdapter O10IXXX0X(FirmwareRepairRActivity r0) {
        return mDfuHelper_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ OXO1 access$getMDfuCallback$p(FirmwareRepairRActivity r0) {
        return r0.mDfuCallback;
    }

    public static final /* synthetic */ GattDfuAdapter access$getMDfuHelper(FirmwareRepairRActivity r0) {
        return r0.getMDfuHelper();
    }

    public static final /* synthetic */ void access$upgrade(FirmwareRepairRActivity r0) {
        r0.upgrade();
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) getValue();
    }

    private static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FirmwareRepairRActivity r0) {
        return GattDfuAdapter.getInstance(r0.getMContext());
    }

    private final void upgrade() {
        setMStarted(true);
        LogUtils.d(new Object[]{"upgrade"});
        getTvTip().setText(R.string.starting);
        DfuConfig r1 = this.mDfuConfig;
        r1.setAddress(BleCache.INSTANCE.getMDfuAddress());
        r1.setOtaWorkMode(0);
        r1.setAutomaticActiveEnabled(true);
        r1.setVersionCheckEnabled(false);
        File r3 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r4 = this.mLatestFirmware;
        Intrinsics.XXI(r4);
        r1.setFilePath(new File(r3, r4.getFileName()).getAbsolutePath());
        r1.setFileLocation(0);
        getMDfuHelper().startOtaProcess(r1);
        getTvSize().setText(FileUtils.getSize(getFilePath()));
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        setMStarted(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
        TextView r0 = getTvName();
        FirmwareVersion r1 = this.mLatestFirmware;
        Integer r2 = null;
        if (r1 == null) goto L5;
        String r3 = r1.getFileName();
    L6:
        r0.setText(r3);
        FirmwareVersion r4 = this.mLatestFirmware;
        if (r4 == null) goto L9;
        r2 = Integer.valueOf(r4.getFileSize());
    L9:
        if (r2 == null) goto L11;
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mLatestFirmware.getFileSize()));
    L11:
        getTvTip().setText(R.string.downloading);
        NetWorkUtils r5 = NetWorkUtils.INSTANCE;
        FirmwareVersion r6 = this.mLatestFirmware;
        Intrinsics.XXI(r6);
        r5.download(r6.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new AnonymousClass1(this));
        return;
    L5:
        r3 = null;
        goto L6
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GattDfuAdapter r0 = getMDfuHelper();
        if (r0 == null) goto L5;
        r0.abort();
        r0.close();
    L5:
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted() == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }
}
