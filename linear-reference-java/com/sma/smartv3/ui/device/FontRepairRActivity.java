package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.IXIO0XI;
import com.android.mltcode.paycertificationapi.OI1iIi0i;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.XX11iOI00;
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
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFontRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n18#2,2:154\n15#2:156\n*S KotlinDebug\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n*L\n85#1:154,2\n85#1:156\n*E\n"})
public final class FontRepairRActivity extends BaseFirmwareRepairActivity {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private static final String FIRMWARE_FONT_DIR = "firmware_font";

    @aa1
    private final XIi00iiXO mDfuCallback;

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final Lazy mDfuHelper$delegate;

    @aa1
    private final ExtraPackageData mLanguageData;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends DfuAdapter.DfuHelperCallback {
        public final /* synthetic */ FontRepairRActivity OXO1;

        public XIi00iiXO(FontRepairRActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int r3, int r4) {
            LogUtils.e(new Object[]{"FirmwareUpgradeRActivity onError: type=" + r3 + ", code" + r4});
            this.OXO1.setMStarted(false);
            this.OXO1.getTvTip().setText(OOX00.OXO1.O00());
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int r2, Throughput r3) {
            LogUtils.d(new Object[]{"onProcessStateChanged " + r2});
            if (r2 != 258) goto L6;
            a01.OXO1.XIi00iiXO().put(b01.i010I, FontRepairRActivity.access$getMLanguageData$p(this.OXO1).getType());
            ToastUtils.showLong(R.string.repair_successful);
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
            this.OXO1.getTvTip().setText(R.string.downloading);
            FontRepairRActivity.access$initCacheFile(this.OXO1);
            return;
        L5:
            if (r3 == 4097) goto L7;
            return;
        L7:
            this.OXO1.setMStarted(false);
            this.OXO1.getTvTip().setText(OOX00.OXO1.O00());
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public FontRepairRActivity() {
        this.mDfuHelper$delegate = LazyKt__LazyJVMKt.iO(new OI1iIi0i(this));
        this.mDfuCallback = new XIi00iiXO(this);
        DfuConfig r0 = new DfuConfig();
        r0.setAddress(BleCache.INSTANCE.getMDfuAddress());
        r0.setAutomaticActiveEnabled(true);
        r0.setFileLocation(0);
        this.mDfuConfig = r0;
        SPUtils r1 = a01.OXO1.XO0O10();
        Object r2 = new Gson().fromJson(r1.getString(ExtraPackageData.class.getName()), ExtraPackageData.class);
        if (r2 != null) goto L5;
        r2 = ExtraPackageData.class.newInstance();
    L5:
        this.mLanguageData = (ExtraPackageData) r2;
    }

    public static /* synthetic */ void I1XOi1(FontRepairRActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ GattDfuAdapter O10IXXX0X(FontRepairRActivity r0) {
        return mDfuHelper_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(FontRepairRActivity r0, double r1) {
        initCacheFile$lambda$0(r0, r1);
    }

    public static final /* synthetic */ ExtraPackageData access$getMLanguageData$p(FontRepairRActivity r0) {
        return r0.mLanguageData;
    }

    public static final /* synthetic */ void access$initCacheFile(FontRepairRActivity r0) {
        r0.initCacheFile();
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) getValue();
    }

    private final void initCacheFile() {
        File r1 = uz0.I0iXXO(sz0.OXO1);
        q62 r2 = q62.OXO1;
        FileIOUtils.writeFileFromIS(new File(r1, r2.IO0iXO0O()), getAssets().open("firmware_font/" + r2.IO0iXO0O()), false, new IXIO0XI(this));
    }

    private static final void initCacheFile$lambda$0(FontRepairRActivity r2, double r3) {
        if (r3 != 1.0d) goto L6;
        r2.upgrade();
        return;
    }

    private static final void initView$lambda$0(FontRepairRActivity r0, View r1) {
        if (r0.getMStarted() == true) goto L6;
        r0.upgrade();
        return;
    }

    private static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FontRepairRActivity r0) {
        return GattDfuAdapter.getInstance(r0.getMContext());
    }

    private final void upgrade() {
        setMStarted(true);
        LogUtils.d(new Object[]{"upgrade"});
        getTvTip().setText(R.string.starting);
        DfuConfig r0 = this.mDfuConfig;
        r0.setOtaWorkMode(16);
        r0.setFilePath(new File(uz0.I0iXXO(sz0.OXO1), q62.OXO1.IO0iXO0O()).getAbsolutePath());
        GattDfuAdapter r1 = getMDfuHelper();
        if (r1 == null) goto L6;
        r1.startOtaProcess(r0);
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        setMStarted(false);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.font_repair);
        getTvName().setText("한국어");
        getTvSize().setText(ConvertUtils.byte2FitMemorySize(getAssets().open("firmware_font/" + q62.OXO1.IO0iXO0O()).available()));
        getTvTip().setText(R.string.preparing);
        getTvTip().setOnClickListener(new XX11iOI00(this));
        getMDfuHelper().initialize(this.mDfuCallback);
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
