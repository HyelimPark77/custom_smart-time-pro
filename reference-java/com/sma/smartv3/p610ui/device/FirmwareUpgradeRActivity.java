package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeRActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareUpgradeRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,270:1\n15#2:271\n15#2:272\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeRActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRActivity\n*L\n94#1:271\n95#1:272\n*E\n"})
public final class FirmwareUpgradeRActivity extends BaseFirmwareUpgradeActivity {

    @aa1
    private final String mCurrentFirmware;

    @aa1
    private final String mCurrentLanguage;

    @aa1
    private final String mCurrentUi;

    @aa1
    private final DfuConfig mDfuConfig;
    private int mDownloaded;

    @tb1
    private final ExtraPackVersions mLatestExtraPacks;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @tb1
    private final FirmwareVersion mLatestLanguage;

    @tb1
    private final FirmwareVersion mLatestUi;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;

    @aa1
    private final Lazy mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIO10iO1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareUpgradeRActivity.mDfuHelper_delegate$lambda$0(this.f2988IO);
        }
    });

    @aa1
    private final XIi00iiXO mDfuCallback = new XIi00iiXO();

    public enum FileType {
        FIRMWARE,
        UI_PACK,
        LANGUAGE_PACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<FileType> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[FileType.values().length];
            try {
                iArr[FileType.FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileType.UI_PACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileType.LANGUAGE_PACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO extends DfuAdapter.DfuHelperCallback {
        public XIi00iiXO() {
        }

        public static final void I0IIOi(FirmwareUpgradeRActivity firmwareUpgradeRActivity) {
            firmwareUpgradeRActivity.upgrade();
        }

        /* JADX INFO: renamed from: IO */
        public static final void m38376IO(int i, FirmwareUpgradeRActivity firmwareUpgradeRActivity) {
            if (i == 258) {
                firmwareUpgradeRActivity.upgrade();
            } else {
                if (i != 4097) {
                    return;
                }
                firmwareUpgradeRActivity.setMStarted(false);
                ProgressButton.IiI10X(firmwareUpgradeRActivity.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
            }
        }

        public static final void IiI10X(FirmwareUpgradeRActivity firmwareUpgradeRActivity) {
            ProgressButton.IiI10X(firmwareUpgradeRActivity.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
        }

        public static final void OIi0(FirmwareUpgradeRActivity firmwareUpgradeRActivity, DfuProgressInfo dfuProgressInfo) {
            firmwareUpgradeRActivity.getProgressButton().setProgress(dfuProgressInfo.getProgress() / 100.0f);
        }

        public static final void XOO0ii0(int i, final FirmwareUpgradeRActivity firmwareUpgradeRActivity) {
            if (i == 258) {
                if (firmwareUpgradeRActivity.mStepsIndex >= CollectionsKt__CollectionsKt.X11iII1O1(firmwareUpgradeRActivity.mSteps)) {
                    firmwareUpgradeRActivity.finish();
                    return;
                }
                firmwareUpgradeRActivity.getProgressButton().setProgress(0.0f);
                firmwareUpgradeRActivity.mStepsIndex++;
                firmwareUpgradeRActivity.getTvStep().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi1OOOI0X
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirmwareUpgradeRActivity.XIi00iiXO.I0IIOi(firmwareUpgradeRActivity);
                    }
                }, 2000L);
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i, int i2) {
            LogUtils.m11129e("FirmwareUpgradeRActivity onError: type=" + i + ", code" + i2);
            FirmwareUpgradeRActivity.this.setMStarted(false);
            ToastUtils.showLong(R.string.firmware_upgrading_failed_and_retry);
            final FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
            firmwareUpgradeRActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXX1i
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeRActivity.XIi00iiXO.IiI10X(firmwareUpgradeRActivity);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(final int i, Throughput throughput) {
            final FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
            firmwareUpgradeRActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1XXX0X1i
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeRActivity.XIi00iiXO.XOO0ii0(i, firmwareUpgradeRActivity);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(final DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            final FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
            firmwareUpgradeRActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0X0Oii0
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeRActivity.XIi00iiXO.OIi0(firmwareUpgradeRActivity, progressInfo);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(final int i) {
            final FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
            firmwareUpgradeRActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OOIO0ii
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeRActivity.XIi00iiXO.m38376IO(i, firmwareUpgradeRActivity);
                }
            });
        }
    }

    public FirmwareUpgradeRActivity() {
        DfuConfig dfuConfig = new DfuConfig();
        BleCache bleCache = BleCache.INSTANCE;
        dfuConfig.setAddress(bleCache.getMDfuAddress());
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        dfuConfig.setVersionCheckEnabled(false);
        this.mDfuConfig = dfuConfig;
        a01 a01Var = a01.OXO1;
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions extraPackVersions = (ExtraPackVersions) new Gson().fromJson(a01Var.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = extraPackVersions;
        this.mLatestUi = extraPackVersions != null ? extraPackVersions.getUiPackVersion() : null;
        this.mLatestLanguage = extraPackVersions != null ? extraPackVersions.getLanguagePackVersion() : null;
        this.mCurrentFirmware = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDownload() {
        if (this.mDownloaded == this.mSteps.size()) {
            ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
            getMDfuHelper().initialize(this.mDfuCallback);
        }
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) this.mDfuHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FirmwareUpgradeRActivity firmwareUpgradeRActivity) {
        return GattDfuAdapter.getInstance(firmwareUpgradeRActivity.getMContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())));
        int i = OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()];
        if (i == 1) {
            DfuConfig dfuConfig = this.mDfuConfig;
            dfuConfig.setOtaWorkMode(0);
            File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion firmwareVersion = this.mLatestFirmware;
            Intrinsics.XXI(firmwareVersion);
            dfuConfig.setFilePath(new File(fileI0iXXO, firmwareVersion.getFileName()).getAbsolutePath());
            GattDfuAdapter mDfuHelper = getMDfuHelper();
            if (mDfuHelper != null) {
                mDfuHelper.startOtaProcess(dfuConfig);
                return;
            }
            return;
        }
        if (i == 2) {
            DfuConfig dfuConfig2 = this.mDfuConfig;
            dfuConfig2.setOtaWorkMode(16);
            File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion firmwareVersion2 = this.mLatestUi;
            Intrinsics.XXI(firmwareVersion2);
            dfuConfig2.setFilePath(new File(fileI0iXXO2, firmwareVersion2.getFileName()).getAbsolutePath());
            GattDfuAdapter mDfuHelper2 = getMDfuHelper();
            if (mDfuHelper2 != null) {
                mDfuHelper2.startOtaProcess(dfuConfig2);
                return;
            }
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        DfuConfig dfuConfig3 = this.mDfuConfig;
        dfuConfig3.setOtaWorkMode(16);
        File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion firmwareVersion3 = this.mLatestLanguage;
        Intrinsics.XXI(firmwareVersion3);
        dfuConfig3.setFilePath(new File(fileI0iXXO3, firmwareVersion3.getFileName()).getAbsolutePath());
        GattDfuAdapter mDfuHelper3 = getMDfuHelper();
        if (mDfuHelper3 != null) {
            mDfuHelper3.startOtaProcess(dfuConfig3);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String version;
        String version2;
        String version3;
        super.initView();
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion == null && this.mLatestUi == null && this.mLatestLanguage == null) {
            String str = this.mCurrentFirmware;
            String strIXO0OOi = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            String strIXO0OOi2 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvLatest().setText(getString(R.string.v_s, str + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi + strIXO0OOi2));
            ViewParent parent = getTvCurrent().getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
            getProgressButton().setVisibility(8);
            return;
        }
        if (firmwareVersion == null || (version = firmwareVersion.getVersion()) == null) {
            version = this.mCurrentFirmware;
        }
        FirmwareVersion firmwareVersion2 = this.mLatestUi;
        if (firmwareVersion2 == null || (version2 = firmwareVersion2.getVersion()) == null) {
            version2 = this.mCurrentUi;
        }
        String strIXO0OOi3 = oe5.IXO0OOi(version2, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion firmwareVersion3 = this.mLatestLanguage;
        if (firmwareVersion3 == null || (version3 = firmwareVersion3.getVersion()) == null) {
            version3 = this.mCurrentLanguage;
        }
        String strIXO0OOi4 = oe5.IXO0OOi(version3, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, version + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi3 + strIXO0OOi4));
        String strIXO0OOi5 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String strIXO0OOi6 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvCurrent().setText(getString(R.string.v_s, this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi5 + strIXO0OOi6));
        if (this.mLatestFirmware != null) {
            this.mSteps.add(FileType.FIRMWARE);
        }
        if (this.mLatestLanguage != null) {
            this.mSteps.add(FileType.LANGUAGE_PACK);
        }
        if (this.mLatestUi != null) {
            this.mSteps.add(FileType.UI_PACK);
        }
        getTvStep().setVisibility(0);
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) {
            upgrade();
            return;
        }
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareUpgradeRActivity.onBottomClick.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    FirmwareUpgradeRActivity.this.mDownloaded++;
                    FirmwareUpgradeRActivity.this.checkDownload();
                    FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
                    BaseFirmwareUpgradeActivity.uploadDownloadInfo$default(firmwareUpgradeRActivity, firmwareUpgradeRActivity.mLatestFirmware.getFileUrl(), FirmwareUpgradeRActivity.this.mLatestFirmware.getFileName(), 0, 4, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FirmwareUpgradeRActivity.this.mDownloaded = 0;
                    FirmwareUpgradeRActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion2 = this.mLatestUi;
        if (firmwareVersion2 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion2.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestUi.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareUpgradeRActivity.onBottomClick.2
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    FirmwareUpgradeRActivity.this.mDownloaded++;
                    FirmwareUpgradeRActivity.this.checkDownload();
                    FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
                    BaseFirmwareUpgradeActivity.uploadDownloadInfo$default(firmwareUpgradeRActivity, firmwareUpgradeRActivity.mLatestUi.getFileUrl(), FirmwareUpgradeRActivity.this.mLatestUi.getFileName(), 0, 4, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FirmwareUpgradeRActivity.this.mDownloaded = 0;
                    FirmwareUpgradeRActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion3 = this.mLatestLanguage;
        if (firmwareVersion3 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion3.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestLanguage.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareUpgradeRActivity.onBottomClick.3
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    FirmwareUpgradeRActivity.this.mDownloaded++;
                    FirmwareUpgradeRActivity.this.checkDownload();
                    FirmwareUpgradeRActivity firmwareUpgradeRActivity = FirmwareUpgradeRActivity.this;
                    BaseFirmwareUpgradeActivity.uploadDownloadInfo$default(firmwareUpgradeRActivity, firmwareUpgradeRActivity.mLatestLanguage.getFileUrl(), FirmwareUpgradeRActivity.this.mLatestLanguage.getFileName(), 0, 4, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FirmwareUpgradeRActivity.this.mDownloaded = 0;
                    FirmwareUpgradeRActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.abort();
            mDfuHelper.close();
        }
        super.onDestroy();
    }
}
