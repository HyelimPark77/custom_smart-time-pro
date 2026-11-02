package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.p610ui.device.FontRepairRActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFontRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n18#2,2:154\n15#2:156\n*S KotlinDebug\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n*L\n85#1:154,2\n85#1:156\n*E\n"})
public final class FontRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final String FIRMWARE_FONT_DIR = "firmware_font";

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final ExtraPackageData mLanguageData;

    @aa1
    private final Lazy mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI1iIi0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FontRepairRActivity.mDfuHelper_delegate$lambda$0(this.f2939IO);
        }
    });

    @aa1
    private final XIi00iiXO mDfuCallback = new XIi00iiXO();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends DfuAdapter.DfuHelperCallback {
        public XIi00iiXO() {
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i, int i2) {
            LogUtils.m11129e("FirmwareUpgradeRActivity onError: type=" + i + ", code" + i2);
            FontRepairRActivity.this.setMStarted(false);
            FontRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i, Throughput throughput) {
            LogUtils.m11128d("onProcessStateChanged " + i);
            if (i == 258) {
                a01.OXO1.XIi00iiXO().put(b01.i010I, FontRepairRActivity.this.mLanguageData.getType());
                ToastUtils.showLong(R.string.repair_successful);
                FontRepairRActivity.this.finish();
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            FontRepairRActivity.this.getDfuProgress().setProgress(progressInfo.getProgress() / 100.0f);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i) throws Throwable {
            LogUtils.m11128d("onStateChanged " + i);
            if (i == 258) {
                FontRepairRActivity.this.setMStarted(true);
                FontRepairRActivity.this.getTvTip().setText(R.string.downloading);
                FontRepairRActivity.this.initCacheFile();
            } else {
                if (i != 4097) {
                    return;
                }
                FontRepairRActivity.this.setMStarted(false);
                FontRepairRActivity.this.getTvTip().setText(OOX00.OXO1.O00());
            }
        }
    }

    public FontRepairRActivity() {
        DfuConfig dfuConfig = new DfuConfig();
        dfuConfig.setAddress(BleCache.INSTANCE.getMDfuAddress());
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        this.mDfuConfig = dfuConfig;
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(ExtraPackageData.class.getName()), (Class<Object>) ExtraPackageData.class);
        this.mLanguageData = (ExtraPackageData) (objFromJson == null ? ExtraPackageData.class.newInstance() : objFromJson);
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) this.mDfuHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCacheFile() throws Throwable {
        File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
        q62 q62Var = q62.OXO1;
        FileIOUtils.writeFileFromIS(new File(fileI0iXXO, q62Var.IO0iXO0O()), getAssets().open("firmware_font/" + q62Var.IO0iXO0O()), false, new FileIOUtils.OnProgressUpdateListener() { // from class: com.android.mltcode.paycertificationapi.IXIO0XI
            @Override // com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener
            public final void onProgressUpdate(double d) {
                FontRepairRActivity.initCacheFile$lambda$0(this.OXO1, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCacheFile$lambda$0(FontRepairRActivity fontRepairRActivity, double d) {
        if (d == 1.0d) {
            fontRepairRActivity.upgrade();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(FontRepairRActivity fontRepairRActivity, View view) {
        if (fontRepairRActivity.getMStarted()) {
            return;
        }
        fontRepairRActivity.upgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FontRepairRActivity fontRepairRActivity) {
        return GattDfuAdapter.getInstance(fontRepairRActivity.getMContext());
    }

    private final void upgrade() {
        setMStarted(true);
        LogUtils.m11128d("upgrade");
        getTvTip().setText(R.string.starting);
        DfuConfig dfuConfig = this.mDfuConfig;
        dfuConfig.setOtaWorkMode(16);
        dfuConfig.setFilePath(new File(uz0.I0iXXO(sz0.OXO1), q62.OXO1.IO0iXO0O()).getAbsolutePath());
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
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.font_repair);
        getTvName().setText("한국어");
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(getAssets().open("firmware_font/" + q62.OXO1.IO0iXO0O()).available()));
        getTvTip().setText(R.string.preparing);
        getTvTip().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XX11iOI00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontRepairRActivity.initView$lambda$0(this.f4981IO, view);
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
