package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.LanguageRepairRActivity;
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
@SourceDebugExtension({"SMAP\nLanguageRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,155:1\n18#2,2:156\n15#2:158\n27#2,2:159\n*S KotlinDebug\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n*L\n85#1:156,2\n85#1:158\n148#1:159,2\n*E\n"})
public final class LanguageRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final ExtraPackageData mLanguageData;

    @aa1
    private final Lazy mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageRepairRActivity.mDfuHelper_delegate$lambda$0(this.f10151IO);
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
            LanguageRepairRActivity.this.setMStarted(false);
            LanguageRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i, Throughput throughput) {
            LogUtils.m11128d("onProcessStateChanged " + i + " " + LanguageRepairRActivity.this.mLanguageData.getType());
            if (i == 258) {
                a01.OXO1.XIi00iiXO().put(b01.i010I, LanguageRepairRActivity.this.mLanguageData.getType());
                LanguageRepairRActivity.this.finish();
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            LanguageRepairRActivity.this.getDfuProgress().setProgress(progressInfo.getProgress() / 100.0f);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i) {
            LogUtils.m11128d("onStateChanged " + i);
            if (i == 258) {
                LanguageRepairRActivity.this.setMStarted(true);
                LanguageRepairRActivity.this.getTvTip().setText(R.string.downloading);
                LanguageRepairRActivity.this.downloadLanguagePage();
            } else {
                if (i != 4097) {
                    return;
                }
                LanguageRepairRActivity.this.setMStarted(false);
                LanguageRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
            }
        }
    }

    public LanguageRepairRActivity() {
        DfuConfig dfuConfig = new DfuConfig();
        dfuConfig.setAddress(BleCache.INSTANCE.getMDfuAddress());
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        this.mDfuConfig = dfuConfig;
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(ExtraPackageData.class.getName()), (Class<Object>) ExtraPackageData.class);
        this.mLanguageData = (ExtraPackageData) (objFromJson == null ? ExtraPackageData.class.newInstance() : objFromJson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadLanguagePage() {
        NetWorkUtils.INSTANCE.download(this.mLanguageData.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLanguageData.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.LanguageRepairRActivity.downloadLanguagePage.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                LanguageRepairRActivity.this.upgrade();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LanguageRepairRActivity.this.setMStarted(false);
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
    public static final void initView$lambda$0(LanguageRepairRActivity languageRepairRActivity, View view) {
        if (languageRepairRActivity.getMStarted()) {
            return;
        }
        languageRepairRActivity.upgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(LanguageRepairRActivity languageRepairRActivity) {
        return GattDfuAdapter.getInstance(languageRepairRActivity.getMContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        setMStarted(true);
        LogUtils.m11128d("upgrade");
        getTvTip().setText(R.string.starting);
        DfuConfig dfuConfig = this.mDfuConfig;
        dfuConfig.setOtaWorkMode(16);
        dfuConfig.setFilePath(new File(uz0.I0iXXO(sz0.OXO1), this.mLanguageData.getFileName()).getAbsolutePath());
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
        ((TextView) findViewById(R.id.abh_title_center)).setText(getMArg1());
        getTvName().setText(getMArg0());
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(this.mLanguageData.getFileSize()));
        getTvTip().setText(R.string.preparing);
        getTvTip().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.nj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageRepairRActivity.initView$lambda$0(this.f9947IO, view);
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
