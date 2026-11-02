package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.mltcode.paycertificationapi.IXX1i;
import com.android.mltcode.paycertificationapi.O0X0Oii0;
import com.android.mltcode.paycertificationapi.OIO10iO1X;
import com.android.mltcode.paycertificationapi.OOIO0ii;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.Oi1OOOI0X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1XXX0X1i;
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
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
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
    private final XIi00iiXO mDfuCallback;

    @aa1
    private final DfuConfig mDfuConfig;

    @aa1
    private final Lazy mDfuHelper$delegate;
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

    public static final enum FileType extends Enum<FileType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ FileType[] $VALUES = null;
        public static final FileType FIRMWARE = null;
        public static final FileType LANGUAGE_PACK = null;
        public static final FileType UI_PACK = null;

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{FIRMWARE, UI_PACK, LANGUAGE_PACK};
        }

        static {
            FIRMWARE = new FileType("FIRMWARE", 0);
            UI_PACK = new FileType("UI_PACK", 1);
            LANGUAGE_PACK = new FileType("LANGUAGE_PACK", 2);
            FileType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private FileType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<FileType> getEntries() {
            return $ENTRIES;
        }

        public static FileType valueOf(String r1) {
            return (FileType) Enum.valueOf(FileType.class, r1);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[FileType.values().length];
            r0[FileType.FIRMWARE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r0[FileType.UI_PACK.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r0[FileType.LANGUAGE_PACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO extends DfuAdapter.DfuHelperCallback {
        public final /* synthetic */ FirmwareUpgradeRActivity OXO1;

        public XIi00iiXO(FirmwareUpgradeRActivity r1) {
            this.OXO1 = r1;
        }

        public static final void I0IIOi(FirmwareUpgradeRActivity r0) {
            FirmwareUpgradeRActivity.access$upgrade(r0);
        }

        public static final void IO(int r3, FirmwareUpgradeRActivity r4) {
            if (r3 != 258) goto L5;
            FirmwareUpgradeRActivity.access$upgrade(r4);
            return;
        L5:
            if (r3 == 4097) goto L7;
            return;
        L7:
            r4.setMStarted(false);
            ProgressButton.IiI10X(r4.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
        }

        public static final void IiI10X(FirmwareUpgradeRActivity r4) {
            ProgressButton.IiI10X(r4.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
        }

        public static /* synthetic */ void O00(int r0, FirmwareUpgradeRActivity r1) {
            IO(r0, r1);
        }

        public static final void OIi0(FirmwareUpgradeRActivity r1, DfuProgressInfo r2) {
            r1.getProgressButton().setProgress(r2.getProgress() / 100.0f);
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeRActivity r0, DfuProgressInfo r1) {
            OIi0(r0, r1);
        }

        public static /* synthetic */ void XIi00iiXO(int r0, FirmwareUpgradeRActivity r1) {
            XOO0ii0(r0, r1);
        }

        public static /* synthetic */ void XO0O10(FirmwareUpgradeRActivity r0) {
            IiI10X(r0);
        }

        public static final void XOO0ii0(int r3, final FirmwareUpgradeRActivity r4) {
            if (r3 == 258) goto L5;
            return;
        L5:
            if (FirmwareUpgradeRActivity.access$getMStepsIndex$p(r4) >= CollectionsKt__CollectionsKt.X11iII1O1(FirmwareUpgradeRActivity.access$getMSteps$p(r4))) goto L8;
            r4.getProgressButton().setProgress(0.0f);
            FirmwareUpgradeRActivity.access$setMStepsIndex$p(r4, FirmwareUpgradeRActivity.access$getMStepsIndex$p(r4) + 1);
            r4.getTvStep().postDelayed(new Oi1OOOI0X(r4), 2000);
            return;
        L8:
            r4.finish();
        }

        public static /* synthetic */ void iO(FirmwareUpgradeRActivity r0) {
            I0IIOi(r0);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int r3, int r4) {
            LogUtils.e(new Object[]{"FirmwareUpgradeRActivity onError: type=" + r3 + ", code" + r4});
            this.OXO1.setMStarted(false);
            ToastUtils.showLong(R.string.firmware_upgrading_failed_and_retry);
            final FirmwareUpgradeRActivity r5 = this.OXO1;
            r5.runOnUiThread(new IXX1i(r5));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(final int r2, Throughput r3) {
            final FirmwareUpgradeRActivity r4 = this.OXO1;
            r4.runOnUiThread(new i1XXX0X1i(r2, r4));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(final DfuProgressInfo r3) {
            Intrinsics.X0O(r3, "progressInfo");
            final FirmwareUpgradeRActivity r0 = this.OXO1;
            r0.runOnUiThread(new O0X0Oii0(r0, r3));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(final int r3) {
            final FirmwareUpgradeRActivity r0 = this.OXO1;
            r0.runOnUiThread(new OOIO0ii(r3, r0));
        }
    }

    public FirmwareUpgradeRActivity() {
        this.mDfuHelper$delegate = LazyKt__LazyJVMKt.iO(new OIO10iO1X(this));
        this.mDfuCallback = new XIi00iiXO(this);
        DfuConfig r0 = new DfuConfig();
        BleCache r1 = BleCache.INSTANCE;
        r0.setAddress(r1.getMDfuAddress());
        r0.setAutomaticActiveEnabled(true);
        r0.setFileLocation(0);
        r0.setVersionCheckEnabled(false);
        this.mDfuConfig = r0;
        a01 r2 = a01.OXO1;
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r2.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions r3 = (ExtraPackVersions) new Gson().fromJson(r2.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = r3;
        FirmwareVersion r4 = null;
        if (r3 == null) goto L5;
        FirmwareVersion r5 = r3.getUiPackVersion();
    L6:
        this.mLatestUi = r5;
        if (r3 == null) goto L9;
        r4 = r3.getLanguagePackVersion();
    L9:
        this.mLatestLanguage = r4;
        this.mCurrentFirmware = BaseBleCache.getString$default(r1, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(r1, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(r1, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
        return;
    L5:
        r5 = null;
        goto L6
    }

    public static /* synthetic */ GattDfuAdapter XX0(FirmwareUpgradeRActivity r0) {
        return mDfuHelper_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$checkDownload(FirmwareUpgradeRActivity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ int access$getMDownloaded$p(FirmwareUpgradeRActivity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFirmware$p(FirmwareUpgradeRActivity r0) {
        return r0.mLatestFirmware;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestLanguage$p(FirmwareUpgradeRActivity r0) {
        return r0.mLatestLanguage;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestUi$p(FirmwareUpgradeRActivity r0) {
        return r0.mLatestUi;
    }

    public static final /* synthetic */ List access$getMSteps$p(FirmwareUpgradeRActivity r0) {
        return r0.mSteps;
    }

    public static final /* synthetic */ int access$getMStepsIndex$p(FirmwareUpgradeRActivity r0) {
        return r0.mStepsIndex;
    }

    public static final /* synthetic */ void access$setMDownloaded$p(FirmwareUpgradeRActivity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$setMStepsIndex$p(FirmwareUpgradeRActivity r0, int r1) {
        r0.mStepsIndex = r1;
    }

    public static final /* synthetic */ void access$upgrade(FirmwareUpgradeRActivity r0) {
        r0.upgrade();
    }

    private final void checkDownload() {
        if (this.mDownloaded != this.mSteps.size()) goto L6;
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        getMDfuHelper().initialize(this.mDfuCallback);
        return;
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) getValue();
    }

    private static final GattDfuAdapter mDfuHelper_delegate$lambda$0(FirmwareUpgradeRActivity r0) {
        return GattDfuAdapter.getInstance(r0.getMContext());
    }

    private final void upgrade() {
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())}));
        FileType r0 = this.mSteps.get(this.mStepsIndex);
        int r1 = OXO1.OXO1[r0.ordinal()];
        if (r1 != 1) goto L5;
        DfuConfig r2 = this.mDfuConfig;
        r2.setOtaWorkMode(0);
        File r3 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r4 = this.mLatestFirmware;
        Intrinsics.XXI(r4);
        r2.setFilePath(new File(r3, r4.getFileName()).getAbsolutePath());
        GattDfuAdapter r5 = getMDfuHelper();
        if (r5 == null) goto L24;
        r5.startOtaProcess(r2);
        return;
    L24:
        return;
    L5:
        if (r1 != 2) goto L7;
        DfuConfig r6 = this.mDfuConfig;
        r6.setOtaWorkMode(16);
        File r7 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r8 = this.mLatestUi;
        Intrinsics.XXI(r8);
        r6.setFilePath(new File(r7, r8.getFileName()).getAbsolutePath());
        GattDfuAdapter r9 = getMDfuHelper();
        if (r9 == null) goto L23;
        r9.startOtaProcess(r6);
        return;
    L23:
        return;
    L7:
        if (r1 != 3) goto L13;
        DfuConfig r10 = this.mDfuConfig;
        r10.setOtaWorkMode(16);
        File r11 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r12 = this.mLatestLanguage;
        Intrinsics.XXI(r12);
        r10.setFilePath(new File(r11, r12.getFileName()).getAbsolutePath());
        GattDfuAdapter r13 = getMDfuHelper();
        if (r13 == null) goto L22;
        r13.startOtaProcess(r10);
        return;
    L22:
        return;
    L13:
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.closeConnection(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 == null) goto L5;
    L10:
        if (r0 == null) goto L13;
        String r1 = r0.getVersion();
        if (r1 == null) goto L13;
    L14:
        FirmwareVersion r3 = this.mLatestUi;
        if (r3 == null) goto L20;
        String r4 = r3.getVersion();
        if (r4 == null) goto L20;
    L21:
        String r5 = oe5.IXO0OOi(r4, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r6 = this.mLatestLanguage;
        if (r6 == null) goto L27;
        String r7 = r6.getVersion();
        if (r7 == null) goto L27;
    L28:
        String r8 = oe5.IXO0OOi(r7, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r1 + FileUtils.FILE_EXTENSION_SEPARATOR + r5 + r8}));
        String r2 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r9 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + r2 + r9}));
        if (this.mLatestFirmware == null) goto L32;
        this.mSteps.add(FileType.FIRMWARE);
    L32:
        if (this.mLatestLanguage == null) goto L35;
        this.mSteps.add(FileType.LANGUAGE_PACK);
    L35:
        if (this.mLatestUi == null) goto L37;
        this.mSteps.add(FileType.UI_PACK);
    L37:
        getTvStep().setVisibility(0);
        return;
    L27:
        r7 = this.mCurrentLanguage;
    L20:
        r4 = this.mCurrentUi;
    L13:
        r1 = this.mCurrentFirmware;
        goto L14
    L5:
        if (this.mLatestUi != null) goto L10;
        if (this.mLatestLanguage != null) goto L10;
        String r10 = this.mCurrentFirmware;
        String r11 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r12 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r10 + FileUtils.FILE_EXTENSION_SEPARATOR + r11 + r12}));
        ViewParent r13 = getTvCurrent().getParent();
        Intrinsics.X1ii(r13, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r13).setVisibility(8);
        getProgressButton().setVisibility(8);
    }

    public final void onBottomClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) goto L14;
        FirmwareVersion r6 = this.mLatestFirmware;
        if (r6 == null) goto L7;
        NetWorkUtils.INSTANCE.download(r6.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new AnonymousClass1(this));
    L7:
        FirmwareVersion r7 = this.mLatestUi;
        if (r7 == null) goto L10;
        NetWorkUtils.INSTANCE.download(r7.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestUi.getFileName(), new AnonymousClass2(this));
    L10:
        FirmwareVersion r8 = this.mLatestLanguage;
        if (r8 == null) goto L16;
        NetWorkUtils.INSTANCE.download(r8.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestLanguage.getFileName(), new AnonymousClass3(this));
        return;
    L16:
        return;
    L14:
        upgrade();
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GattDfuAdapter r0 = getMDfuHelper();
        if (r0 == null) goto L5;
        r0.abort();
        r0.close();
    L5:
        super.onDestroy();
    }
}
