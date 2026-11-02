package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.UiRepairRActivity;
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
@SourceDebugExtension({"SMAP\nUiRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiRepairRActivity.kt\ncom/sma/smartv3/ui/device/UiRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,154:1\n18#2,2:155\n15#2:157\n27#2,2:158\n*S KotlinDebug\n*F\n+ 1 UiRepairRActivity.kt\ncom/sma/smartv3/ui/device/UiRepairRActivity\n*L\n84#1:155,2\n84#1:157\n147#1:158,2\n*E\n"})
public final class UiRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final ExtraPackageData mUiData;

    @aa1
    private final Lazy mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n56
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UiRepairRActivity.mDfuHelper_delegate$lambda$0(this.f9853IO);
        }
    });

    @aa1
    private final OXO1 mDfuCallback = new OXO1();

    public static final class OXO1 extends DfuAdapter.DfuHelperCallback {
        public OXO1() {
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i, int i2) {
            LogUtils.m11129e("FirmwareUpgradeRActivity onError: type=" + i + ", code" + i2);
            UiRepairRActivity.this.setMStarted(false);
            UiRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i, Throughput throughput) {
            LogUtils.m11128d("onProcessStateChanged " + i);
            if (i == 258) {
                ToastUtils.showLong(R.string.repair_successful);
                UiRepairRActivity.this.finish();
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            UiRepairRActivity.this.getDfuProgress().setProgress(progressInfo.getProgress() / 100.0f);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i) {
            LogUtils.m11128d("onStateChanged " + i);
            if (i == 258) {
                UiRepairRActivity.this.setMStarted(true);
                UiRepairRActivity.this.getTvTip().setText(R.string.downloading);
                UiRepairRActivity.this.downloadLanguagePage();
            } else {
                if (i != 4097) {
                    return;
                }
                UiRepairRActivity.this.setMStarted(false);
                UiRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
            }
        }
    }

    public UiRepairRActivity() {
        DfuConfig dfuConfig = new DfuConfig();
        dfuConfig.setAddress(BleCache.INSTANCE.getMDfuAddress());
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        this.mDfuConfig = dfuConfig;
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(ExtraPackageData.class.getName()), (Class<Object>) ExtraPackageData.class);
        this.mUiData = (ExtraPackageData) (objFromJson == null ? ExtraPackageData.class.newInstance() : objFromJson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadLanguagePage() {
        NetWorkUtils.INSTANCE.download(this.mUiData.getFileUrl(), uz0.XXI(sz0.OXO1), this.mUiData.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.UiRepairRActivity.downloadLanguagePage.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                UiRepairRActivity.this.upgrade();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                UiRepairRActivity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) this.mDfuHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(UiRepairRActivity uiRepairRActivity, View view) {
        if (uiRepairRActivity.getMStarted()) {
            return;
        }
        uiRepairRActivity.upgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(UiRepairRActivity uiRepairRActivity) {
        return GattDfuAdapter.getInstance(uiRepairRActivity.getMContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        setMStarted(true);
        LogUtils.m11128d("upgrade");
        getTvTip().setText(R.string.starting);
        DfuConfig dfuConfig = this.mDfuConfig;
        dfuConfig.setOtaWorkMode(16);
        dfuConfig.setFilePath(new File(uz0.I0iXXO(sz0.OXO1), this.mUiData.getFileName()).getAbsolutePath());
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.startOtaProcess(dfuConfig);
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        setMStarted(false);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ui_repair);
        getTvName().setText(this.mUiData.getVersion());
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mUiData.getFileSize()));
        getTvTip().setText(R.string.preparing);
        getTvTip().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.o56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiRepairRActivity.initView$lambda$0(this.f10078IO, view);
            }
        });
        getMDfuHelper().initialize(this.mDfuCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        a01.OXO1.XO0O10().remove(ExtraPackageData.class.getName());
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
