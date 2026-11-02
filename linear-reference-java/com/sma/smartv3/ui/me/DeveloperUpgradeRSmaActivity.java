package com.sma.smartv3.ui.me;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I11XIIIX;
import com.android.mltcode.paycertificationapi.IXi01III;
import com.android.mltcode.paycertificationapi.O001X;
import com.android.mltcode.paycertificationapi.O1OiiOI10;
import com.android.mltcode.paycertificationapi.OIOO0X00O;
import com.android.mltcode.paycertificationapi.OO010XXO;
import com.android.mltcode.paycertificationapi.OOIii10I1;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOXIOiO;
import com.android.mltcode.paycertificationapi.OXiIOOiI;
import com.android.mltcode.paycertificationapi.X0OI1O;
import com.android.mltcode.paycertificationapi.X10X0;
import com.android.mltcode.paycertificationapi.XO00iXOOi;
import com.android.mltcode.paycertificationapi.XX1IOII1X;
import com.android.mltcode.paycertificationapi.XXI1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i0iiOOO;
import com.android.mltcode.paycertificationapi.i1Oi11XIi;
import com.android.mltcode.paycertificationapi.iIX010II;
import com.android.mltcode.paycertificationapi.iOIOX1i;
import com.android.mltcode.paycertificationapi.iOi110;
import com.android.mltcode.paycertificationapi.iXiOIOiI;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.Throughput;
import com.realsil.sdk.dfu.utils.ConnectParams;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.component.BleHandleCallback;
import com.szabh.smable3.entity.BleAICoachBeforePlan;
import com.szabh.smable3.entity.BleAICoachBeforePlanV2;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import com.szabh.smable3.entity.BleAICoachGeneratePlanV2;
import com.szabh.smable3.entity.BleAICommand;
import com.szabh.smable3.entity.BleActivity;
import com.szabh.smable3.entity.BleActivityDetail;
import com.szabh.smable3.entity.BleAddressBook;
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleAlipayBindInfo;
import com.szabh.smable3.entity.BleAlipaySettings;
import com.szabh.smable3.entity.BleAppAudioBookList;
import com.szabh.smable3.entity.BleAppInfoList;
import com.szabh.smable3.entity.BleAppOp;
import com.szabh.smable3.entity.BleAppSportState;
import com.szabh.smable3.entity.BleAvgHeartRate;
import com.szabh.smable3.entity.BleBAC;
import com.szabh.smable3.entity.BleBWNaviInfo;
import com.szabh.smable3.entity.BleBacCalibration;
import com.szabh.smable3.entity.BleBandKey;
import com.szabh.smable3.entity.BleBatteryUsage;
import com.szabh.smable3.entity.BleBloodGlucose;
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
import com.szabh.smable3.entity.BleBloodOxygen;
import com.szabh.smable3.entity.BleBloodPressure;
import com.szabh.smable3.entity.BleBloodPressureCalibration;
import com.szabh.smable3.entity.BleBodyStatus;
import com.szabh.smable3.entity.BleCPChat;
import com.szabh.smable3.entity.BleCPGiftsInfo;
import com.szabh.smable3.entity.BleCPListener;
import com.szabh.smable3.entity.BleCPMissYou;
import com.szabh.smable3.entity.BleCPTodo;
import com.szabh.smable3.entity.BleCPUserInfo;
import com.szabh.smable3.entity.BleCalibrationData;
import com.szabh.smable3.entity.BleCalorieIntake;
import com.szabh.smable3.entity.BleChatApp;
import com.szabh.smable3.entity.BleChatMessage;
import com.szabh.smable3.entity.BleChatVoice;
import com.szabh.smable3.entity.BleCheckInEveryDay;
import com.szabh.smable3.entity.BleCoachingIds;
import com.szabh.smable3.entity.BleCyWeeAlgorithm;
import com.szabh.smable3.entity.BleDeviceFile;
import com.szabh.smable3.entity.BleDeviceFile2;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleDeviceInfo2;
import com.szabh.smable3.entity.BleDeviceLanguages;
import com.szabh.smable3.entity.BleDeviceLanguages2;
import com.szabh.smable3.entity.BleDeviceSportData;
import com.szabh.smable3.entity.BleDeviceUniqueDataSettings;
import com.szabh.smable3.entity.BleDoubleScreenSettings;
import com.szabh.smable3.entity.BleDrinkWaterSettings;
import com.szabh.smable3.entity.BleECGRealtime;
import com.szabh.smable3.entity.BleEarphoneAncSettings;
import com.szabh.smable3.entity.BleEarphoneInfo;
import com.szabh.smable3.entity.BleEarphoneKey;
import com.szabh.smable3.entity.BleEarphonePower;
import com.szabh.smable3.entity.BleEarphoneSoundEffectsSettings;
import com.szabh.smable3.entity.BleEarphoneState;
import com.szabh.smable3.entity.BleEcg;
import com.szabh.smable3.entity.BleEcgSettings;
import com.szabh.smable3.entity.BleEnergyRating;
import com.szabh.smable3.entity.BleFactoryTest;
import com.szabh.smable3.entity.BleFindEarphone;
import com.szabh.smable3.entity.BleFoodBalance;
import com.szabh.smable3.entity.BleGSensorMotion;
import com.szabh.smable3.entity.BleGSensorRaw;
import com.szabh.smable3.entity.BleGSensorSHSY;
import com.szabh.smable3.entity.BleGameControl;
import com.szabh.smable3.entity.BleGestureWake;
import com.szabh.smable3.entity.BleGestureWake2;
import com.szabh.smable3.entity.BleGirlCareMonthly;
import com.szabh.smable3.entity.BleGirlCareSettings;
import com.szabh.smable3.entity.BleGoMoreSettings;
import com.szabh.smable3.entity.BleGolfMapCacheInfo;
import com.szabh.smable3.entity.BleGolfScore;
import com.szabh.smable3.entity.BleGolfSportSwitch;
import com.szabh.smable3.entity.BleGolfWatchMapInfo;
import com.szabh.smable3.entity.BleGolfWatchScore;
import com.szabh.smable3.entity.BleGolfWatchVersionInfo;
import com.szabh.smable3.entity.BleGoogleNaviInfo;
import com.szabh.smable3.entity.BleHRRaw;
import com.szabh.smable3.entity.BleHanBaoSettings;
import com.szabh.smable3.entity.BleHanBaoVibration;
import com.szabh.smable3.entity.BleHeartRate;
import com.szabh.smable3.entity.BleHeartRateZones;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import com.szabh.smable3.entity.BleHrv;
import com.szabh.smable3.entity.BleHrvBaseLine;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
import com.szabh.smable3.entity.BleHydrationSettings;
import com.szabh.smable3.entity.BleIPCException;
import com.szabh.smable3.entity.BleIPCInfo;
import com.szabh.smable3.entity.BleIPCOTAState;
import com.szabh.smable3.entity.BleIPCState;
import com.szabh.smable3.entity.BleIPCStoresInfo;
import com.szabh.smable3.entity.BleIPCWifiInfo;
import com.szabh.smable3.entity.BleLactateThreshold;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import com.szabh.smable3.entity.BleLeaveDay;
import com.szabh.smable3.entity.BleLocation;
import com.szabh.smable3.entity.BleLocationGga;
import com.szabh.smable3.entity.BleLocationGsv;
import com.szabh.smable3.entity.BleLogText;
import com.szabh.smable3.entity.BleLoveTap;
import com.szabh.smable3.entity.BleLoveTapUser;
import com.szabh.smable3.entity.BleMapFileList;
import com.szabh.smable3.entity.BleMatchRecord;
import com.szabh.smable3.entity.BleMatchRecord2;
import com.szabh.smable3.entity.BleMatchRecord3;
import com.szabh.smable3.entity.BleMeasurement;
import com.szabh.smable3.entity.BleMedicationAlarm;
import com.szabh.smable3.entity.BleMedicationReminder;
import com.szabh.smable3.entity.BleMeetingReminder;
import com.szabh.smable3.entity.BleMindStatus;
import com.szabh.smable3.entity.BleNaviInfo;
import com.szabh.smable3.entity.BleNoDisturbSettings;
import com.szabh.smable3.entity.BleNotificationSettings2;
import com.szabh.smable3.entity.BleOfflineAsrSettings;
import com.szabh.smable3.entity.BleOptionalMapAuthInfo;
import com.szabh.smable3.entity.BlePackageStatus;
import com.szabh.smable3.entity.BlePhysicalPower;
import com.szabh.smable3.entity.BlePower2;
import com.szabh.smable3.entity.BlePpgSHSY;
import com.szabh.smable3.entity.BlePressure;
import com.szabh.smable3.entity.BlePressureTimingMeasurement;
import com.szabh.smable3.entity.BleQiblaSettings;
import com.szabh.smable3.entity.BleRealTimeMeasurement;
import com.szabh.smable3.entity.BleRealtimeLog;
import com.szabh.smable3.entity.BleReceiveFilePacket;
import com.szabh.smable3.entity.BleRecordControl;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleRelaxReminder;
import com.szabh.smable3.entity.BleRespiratoryRate;
import com.szabh.smable3.entity.BleRingVibrationSettings;
import com.szabh.smable3.entity.BleRri;
import com.szabh.smable3.entity.BleSDCardInfo;
import com.szabh.smable3.entity.BleSGCameraSet;
import com.szabh.smable3.entity.BleSGKeySet;
import com.szabh.smable3.entity.BleSGKeywordAwake;
import com.szabh.smable3.entity.BleSGSet;
import com.szabh.smable3.entity.BleSGTest;
import com.szabh.smable3.entity.BleSGTts;
import com.szabh.smable3.entity.BleSMSQuickReply;
import com.szabh.smable3.entity.BleSOSSettings;
import com.szabh.smable3.entity.BleSedentarinessSettings;
import com.szabh.smable3.entity.BleSettingWatchPassword;
import com.szabh.smable3.entity.BleSleep;
import com.szabh.smable3.entity.BleSleepNotify;
import com.szabh.smable3.entity.BleSleepQuality;
import com.szabh.smable3.entity.BleSosCallLog;
import com.szabh.smable3.entity.BleSosContact;
import com.szabh.smable3.entity.BleStandbyWatchFaceSet;
import com.szabh.smable3.entity.BleStock;
import com.szabh.smable3.entity.BleTemperature;
import com.szabh.smable3.entity.BleThirdPartyData;
import com.szabh.smable3.entity.BleTrainingStatus;
import com.szabh.smable3.entity.BleTuyaKey;
import com.szabh.smable3.entity.BleUserProfile;
import com.szabh.smable3.entity.BleVideoCallInfo;
import com.szabh.smable3.entity.BleVitality;
import com.szabh.smable3.entity.BleWatchFaceId;
import com.szabh.smable3.entity.BleWatchFaceIndex;
import com.szabh.smable3.entity.BleWatchFaceMaxSize;
import com.szabh.smable3.entity.BleWechatPaySettings;
import com.szabh.smable3.entity.BleWorkout;
import com.szabh.smable3.entity.BleWorkout2;
import com.szabh.smable3.entity.BleWorkout3;
import com.szabh.smable3.entity.BleWorkout4;
import com.szabh.smable3.entity.BleWorkout4Segmentation;
import com.szabh.smable3.entity.BleWorldClock;
import com.szabh.smable3.entity.BleXMLYBandSet;
import com.szabh.smable3.entity.MusicCommand;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperUpgradeRSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,611:1\n19#2:612\n15#2:613\n15#2:614\n15#2:615\n19#2:616\n15#2:617\n11#2,2:618\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n*L\n53#1:612\n53#1:613\n243#1:614\n244#1:615\n298#1:616\n298#1:617\n604#1:618,2\n*E\n"})
public final class DeveloperUpgradeRSmaActivity extends BaseFirmwareUpgradeActivity {

    @aa1
    private final OIOO0X00O alreadyUpdateDeviceList;
    private final String deviceAddress;
    private boolean isAutoShutdown;
    private boolean isStartShutdown;
    private int lastPackageSize;

    @aa1
    private XIi00iiXO mBleHandleCallback;

    @aa1
    private final String mCurrentFirmware;

    @aa1
    private final String mCurrentLanguage;

    @aa1
    private final String mCurrentUi;

    @aa1
    private final iO mDfuCallback;

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
    private final FirmwareVersion mLatestFont;

    @tb1
    private final FirmwareVersion mLatestLanguage;

    @tb1
    private final FirmwareVersion mLatestUi;

    @tb1
    private uq mLoadingPopup;

    @tb1
    private OtaDeviceInfo mOtaDeviceInfo;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;
    private long time1;

    public static final enum FileType extends Enum<FileType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ FileType[] $VALUES = null;
        public static final FileType FIRMWARE = null;
        public static final FileType FONT_PACK = null;
        public static final FileType LANGUAGE_PACK = null;
        public static final FileType UI_PACK = null;

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{FIRMWARE, UI_PACK, LANGUAGE_PACK, FONT_PACK};
        }

        static {
            FIRMWARE = new FileType("FIRMWARE", 0);
            UI_PACK = new FileType("UI_PACK", 1);
            LANGUAGE_PACK = new FileType("LANGUAGE_PACK", 2);
            FONT_PACK = new FileType("FONT_PACK", 3);
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
            r0[FileType.FIRMWARE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r0[FileType.UI_PACK.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r0[FileType.LANGUAGE_PACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r0[FileType.FONT_PACK.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ DeveloperUpgradeRSmaActivity IO;

        public static final /* synthetic */ class OXO1 {
            public static final /* synthetic */ int[] OXO1 = null;

            static {
                int[] r0 = new int[FileType.values().length];
                r0[FileType.UI_PACK.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
            L11:
                r0[FileType.LANGUAGE_PACK.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
            L15:
                r0[FileType.FONT_PACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
            L6:
                OXO1 = r0;
            }
        }

        public XIi00iiXO(DeveloperUpgradeRSmaActivity r1) {
            this.IO = r1;
        }

        public static final void I0IIOi(final DeveloperUpgradeRSmaActivity r10) {
            BleConnector r0 = BleConnector.INSTANCE;
            BleKey r1 = BleKey.SESSION;
            BleKeyFlag r2 = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(r0, r1, r2, r9.nextInt(), null, false, false, 56, null);
            BleKeyFlag r3 = BleKeyFlag.UPDATE;
            BaseBleConnector.sendInt32$default(r0, r1, r3, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt8$default(r0, BleKey.SHUTDOWN, r3, 0, false, false, 24, null);
            new Handler().postDelayed(new iXiOIOiI(r10), 5000);
        }

        public static final void I0iXXO(DeveloperUpgradeRSmaActivity r0) {
            DeveloperUpgradeRSmaActivity.access$upgrade(r0);
        }

        public static final void IO(DeveloperUpgradeRSmaActivity r10) {
            BleConnector r0 = BleConnector.INSTANCE;
            BleKey r1 = BleKey.SESSION;
            BleKeyFlag r2 = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(r0, r1, r2, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(r0, r1, BleKeyFlag.UPDATE, r9.nextInt(), null, false, false, 56, null);
            FileType r3 = (FileType) DeveloperUpgradeRSmaActivity.access$getMSteps$p(r10).get(DeveloperUpgradeRSmaActivity.access$getMStepsIndex$p(r10));
            int r4 = OXO1.OXO1[r3.ordinal()];
            if (r4 == 1) goto L12;
            if (r4 != 2) goto L6;
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(r10), R.string.Parsing, false, 2, null);
            BleKey r5 = BleKey.LANGUAGE_FILE;
            File r6 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r11 = DeveloperUpgradeRSmaActivity.access$getMLatestLanguage$p(r10);
            Intrinsics.XXI(r11);
            BaseBleConnector.sendStream$default(r0, r5, new File(r6, r11.getFileName()), 0, 4, null);
            return;
        L6:
            if (r4 == 3) goto L8;
            return;
        L8:
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(r10), R.string.Parsing, false, 2, null);
            BleKey r7 = BleKey.FONT_FILE;
            File r8 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r12 = DeveloperUpgradeRSmaActivity.access$getMLatestFont$p(r10);
            Intrinsics.XXI(r12);
            BaseBleConnector.sendStream$default(r0, r7, new File(r8, r12.getFileName()), 0, 4, null);
            return;
        L12:
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(r10), R.string.Parsing, false, 2, null);
            BleKey r13 = BleKey.UI_FILE;
            File r14 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r15 = DeveloperUpgradeRSmaActivity.access$getMLatestUi$p(r10);
            Intrinsics.XXI(r15);
            BaseBleConnector.sendStream$default(r0, r13, new File(r14, r15.getFileName()), 0, 4, null);
        }

        public static /* synthetic */ void IiI10X(DeveloperUpgradeRSmaActivity r0) {
            I0IIOi(r0);
        }

        public static /* synthetic */ void O00(DeveloperUpgradeRSmaActivity r0) {
            I0iXXO(r0);
        }

        public static final void OIX0iXi(DeveloperUpgradeRSmaActivity r0) {
            DeveloperUpgradeRSmaActivity.access$upgrade(r0);
        }

        public static final void OIi0(DeveloperUpgradeRSmaActivity r1) {
            uq r0 = DeveloperUpgradeRSmaActivity.access$getMLoadingPopup$p(r1);
            if (r0 == null) goto L5;
            r0.dismiss();
        L5:
            LogUtils.d(new Object[]{"force exit"});
            DeveloperUpgradeRSmaActivity.access$upgradeExit(r1);
        }

        public static /* synthetic */ void OXO1(DeveloperUpgradeRSmaActivity r0) {
            OIi0(r0);
        }

        public static /* synthetic */ void XIi00iiXO(DeveloperUpgradeRSmaActivity r0) {
            OIX0iXi(r0);
        }

        public static /* synthetic */ void XO0O10(DeveloperUpgradeRSmaActivity r0) {
            IO(r0);
        }

        public static final void XOO0ii0(DeveloperUpgradeRSmaActivity r0) {
            DeveloperUpgradeRSmaActivity.access$upgrade(r0);
        }

        public static /* synthetic */ void iO(DeveloperUpgradeRSmaActivity r0) {
            XOO0ii0(r0);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
            super.onAICoachGeneratePlanUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand r1) {
            super.onAICommandUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int r1) {
            super.onActivityRecognitionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm r1) {
            super.onAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int r1) {
            super.onAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm r1) {
            super.onAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp r1) {
            super.onAppOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean r1) {
            super.onAppSportDataResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo r1) {
            super.onBWNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int r1) {
            super.onBacklightUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey r1) {
            super.onBandKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore r1) {
            super.onBleGolfScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData r1) {
            super.onBleThirdPartyDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo r1) {
            super.onBleVideoCallInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat r1) {
            super.onCPChatUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo r1) {
            super.onCPGiftsInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener r1) {
            super.onCPListenerUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou r1) {
            super.onCPMissYouUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo r1) {
            super.onCPTodoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int r1) {
            super.onCaloriesGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean r1, int r2) {
            super.onCameraResponse(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int r1) {
            super.onCameraStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp r1) {
            super.onChatAppUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage r1) {
            super.onChatMessageUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice r1) {
            super.onChatVoiceUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay r1) {
            super.onCheckInEveryDayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int r1) {
            super.onClassicBluetoothStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandReply(BleKey r1, BleKeyFlag r2, boolean r3) {
            Intrinsics.X0O(r1, "bleKey");
            Intrinsics.X0O(r2, "bleKeyFlag");
            if (r1 != BleKey.SHUTDOWN) goto L9;
            uq r4 = DeveloperUpgradeRSmaActivity.access$getMLoadingPopup$p(this.IO);
            if (r4 == null) goto L7;
            r4.dismiss();
        L7:
            LogUtils.d(new Object[]{"shutdown success"});
            DeveloperUpgradeRSmaActivity.access$upgradeExit(this.IO);
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey r4, BleKeyFlag r5) {
            Intrinsics.X0O(r4, "bleKey");
            Intrinsics.X0O(r5, "bleKeyFlag");
            if (r4 != BleKey.UI_FILE) goto L5;
        L8:
            DeveloperUpgradeRSmaActivity.access$setMStarted(this.IO, false);
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(this.IO), R.string.starting, false, 2, null);
            TextView r6 = DeveloperUpgradeRSmaActivity.access$getTvStep(this.IO);
            final DeveloperUpgradeRSmaActivity r7 = this.IO;
            r6.postDelayed(new OXiIOOiI(r7), 8000);
            return;
        L5:
            if (r4 == BleKey.LANGUAGE_FILE) goto L8;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int r1) {
            super.onContactUsStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int r1) {
            super.onDeleteFileResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onDeviceConnected(BluetoothDevice r5) {
            Intrinsics.X0O(r5, "device");
            LogUtils.d(new Object[]{"onDeviceConnected " + DeveloperUpgradeRSmaActivity.access$isStartShutdown$p(this.IO)});
            if (DeveloperUpgradeRSmaActivity.access$isStartShutdown$p(this.IO) == false) goto L6;
            Handler r6 = new Handler();
            final DeveloperUpgradeRSmaActivity r0 = this.IO;
            r6.postDelayed(new I11XIIIX(r0), 3000);
            return;
        L6:
            Handler r7 = new Handler();
            final DeveloperUpgradeRSmaActivity r1 = this.IO;
            r7.postDelayed(new X0OI1O(r1), 10000);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean r1) {
            super.onDeviceConnecting(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile r1) {
            super.onDeviceFileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int r1) {
            super.onDeviceOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String r1) {
            super.onDeviceRequestAGpsFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply r1) {
            super.onDeviceSMSQuickReply(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData r1) {
            super.onDeviceSportDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int r1) {
            super.onDistanceGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings r1) {
            super.onDoubleScreenSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings r1) {
            super.onDrinkWaterUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings r1) {
            super.onEarphoneAncSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int r1) {
            super.onEarphoneCallUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey r1) {
            super.onEarphoneKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings r1) {
            super.onEarphoneSoundEffectsSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState r1) {
            super.onEarphoneStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest r1) {
            super.onFactoryTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int r1) {
            super.onFallSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone r1) {
            super.onFindEarphoneUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean r1) {
            super.onFindPhone(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int r1) {
            super.onFindWatchUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemDateFormat() {
            super.onFollowSystemDateFormat();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemHour() {
            super.onFollowSystemHour();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemLanguage(boolean r1) {
            super.onFollowSystemLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl r1) {
            super.onGameControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 r1) {
            super.onGestureWake2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake r1) {
            super.onGestureWakeUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo r1) {
            super.onGoogleNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int r1) {
            super.onHIDState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int r1) {
            super.onHIDValueChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings r1) {
            super.onHRWarningSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int r1) {
            super.onHanBaoVibrationStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int r1) {
            super.onHighAntiAssistChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int r1) {
            super.onHourSystemUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings r1) {
            super.onHydrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException r1) {
            super.onIPCExceptionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState r1) {
            super.onIPCOTAStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState r1) {
            super.onIPCStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo r1) {
            super.onIPCStoresInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo r1) {
            super.onIPCWifiInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityCreate(boolean r1, BleDeviceInfo r2) {
            super.onIdentityCreate(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean r1) {
            super.onIdentityDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean r1) {
            super.onIdentityDeleteByDevice(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int r1) {
            super.onIncomingCallRingUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int r1) {
            super.onIncomingCallStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap r1) {
            super.onLoveTapUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int r1) {
            super.onLoveTapUserDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser r1) {
            super.onLoveTapUserUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement r1) {
            super.onMeasurementUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm r1) {
            super.onMedicationAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int r1) {
            super.onMedicationAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm r1) {
            super.onMedicationAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int r1) {
            super.onMedicationReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder r1) {
            super.onMedicationReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder r1) {
            super.onMeetingReminderAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int r1) {
            super.onMeetingReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder r1) {
            super.onMeetingReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int r1) {
            super.onMultiFileTransferReadFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int r1) {
            super.onMultiFileTransferResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo r1) {
            super.onNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings r1) {
            super.onNoDisturbUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
            super.onNotificationLightScreenSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 r1) {
            super.onNotificationSettings2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean r1) {
            super.onOTA(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int r1) {
            super.onPowerSaveModeState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int r1) {
            super.onPowerSaveModeStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan r1) {
            super.onReadAICoachGenerateBeforeInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onReadAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan r1) {
            super.onReadAICoachPlan(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 r1) {
            super.onReadAICoachPlanV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> r1) {
            super.onReadActivity(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail r1) {
            super.onReadActivityDetail(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook r1) {
            super.onReadAddressBook(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> r1) {
            super.onReadAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> r1) {
            super.onReadAlipayBindInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings r1) {
            super.onReadAlipaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String r1) {
            super.onReadAppApiVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList r1) {
            super.onReadAppInfoList(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState r1) {
            super.onReadAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> r1) {
            super.onReadAvgHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> r1) {
            super.onReadBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration r1, BleKeyFlag r2) {
            super.onReadBacCalibration(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int r1) {
            super.onReadBacklight(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage r1) {
            super.onReadBatteryUsage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String r1) {
            super.onReadBleAddress(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo r1) {
            super.onReadBleGolfMapCacheInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch r1) {
            super.onReadBleGolfSportSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo r1) {
            super.onReadBleGolfWatchMapInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo r1) {
            super.onReadBleGolfWatchVersionInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> r1) {
            super.onReadBleHrv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> r1) {
            super.onReadBleLogText(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> r1) {
            super.onReadBloodGlucose(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings r1) {
            super.onReadBloodOxyGenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> r1) {
            super.onReadBloodOxygen(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> r1) {
            super.onReadBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration r1) {
            super.onReadBloodPressureCalibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> r1) {
            super.onReadBodyStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo r1) {
            super.onReadCPUserInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData r1) {
            super.onReadCalibrationData(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> r1) {
            super.onReadCalorieIntake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int r1) {
            super.onReadCaloriesGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp r1) {
            super.onReadChatApp(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay r1) {
            super.onReadCheckInEveryDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int r1) {
            super.onReadClassicBluetoothState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds r1) {
            super.onReadCoachingIds(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm r1) {
            super.onReadCyWeeAlgorithm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> r1) {
            super.onReadDailyPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int r1) {
            super.onReadDateFormat(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile r1) {
            super.onReadDeviceFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 r1) {
            super.onReadDeviceFileV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo r1) {
            super.onReadDeviceInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 r1) {
            super.onReadDeviceInfo2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages r1) {
            super.onReadDeviceLanguages(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages2(BleDeviceLanguages2 r1) {
            super.onReadDeviceLanguages2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings r1) {
            super.onReadDeviceUniqueDataSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int r1) {
            super.onReadDistanceGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings r1) {
            super.onReadDoubleScreenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings r1) {
            super.onReadDrinkWater(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime r1) {
            super.onReadECGRealtime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings r1) {
            super.onReadEarphoneAncSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int r1) {
            super.onReadEarphoneCall(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo r1) {
            super.onReadEarphoneInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey r1) {
            super.onReadEarphoneKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower r1) {
            super.onReadEarphonePower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings r1) {
            super.onReadEarphoneSoundEffectsSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState r1) {
            super.onReadEarphoneState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> r1) {
            super.onReadEcg(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings r1) {
            super.onReadEcgSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> r1) {
            super.onReadEnergyRating(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int r1) {
            super.onReadFallSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList r1) {
            super.onReadFilePath(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFirmwareVersion(String r1) {
            super.onReadFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> r1) {
            super.onReadFoodBalance(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake r1) {
            super.onReadGestureWake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 r1) {
            super.onReadGestureWake2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly r1) {
            super.onReadGirlCareMonthly(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings r1) {
            super.onReadGirlCareSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings r1) {
            super.onReadGoMoreSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore r1) {
            super.onReadGolfWatchScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String r1) {
            super.onReadGpsFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings r1) {
            super.onReadHanBaoSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> r1) {
            super.onReadHanBaoVibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> r1) {
            super.onReadHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones r1) {
            super.onReadHeartRateZones(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int r1) {
            super.onReadHourSystem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings r1) {
            super.onReadHrMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
            super.onReadHrMonitoringSettingsV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine r1) {
            super.onReadHrvBaseLine(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings r1) {
            super.onReadHrvMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings r1) {
            super.onReadHydrationSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo r1) {
            super.onReadIPCInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState r1) {
            super.onReadIPCState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo r1) {
            super.onReadIPCStoresInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String r1) {
            super.onReadIPCVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int r1) {
            super.onReadIncomingCallRing(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> r1) {
            super.onReadLactateThreshold(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int r1) {
            super.onReadLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion r1) {
            super.onReadLanguagePackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> r1) {
            super.onReadLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> r1) {
            super.onReadLoveTapUser(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> r1) {
            super.onReadMatchRecord(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> r1) {
            super.onReadMatchRecord2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> r1) {
            super.onReadMatchRecord3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> r1) {
            super.onReadMedicationAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> r1) {
            super.onReadMedicationReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> r1) {
            super.onReadMeetingReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> r1) {
            super.onReadMindStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList r1) {
            super.onReadMultiFileTransfer(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String r1) {
            super.onReadNetworkFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings r1) {
            super.onReadNoDisturb(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
            super.onReadNotificationLightScreenSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 r1) {
            super.onReadNotificationSettings2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings r1) {
            super.onReadOfflineAsrSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int r1) {
            super.onReadOngoingDialogue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo r1) {
            super.onReadOptionalMapAuthInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus r1) {
            super.onReadPackageStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int r1) {
            super.onReadPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 r1) {
            super.onReadPower2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> r1) {
            super.onReadPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement r1) {
            super.onReadPressureTimingMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings r1) {
            super.onReadQiblaSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl r1) {
            super.onReadRecordControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder r1) {
            super.onReadRelaxReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> r1) {
            super.onReadRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int r1) {
            super.onReadRestingHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings r1) {
            super.onReadRingVibrationSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> r1) {
            super.onReadRri(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo r1) {
            super.onReadSDCardInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet r1) {
            super.onReadSGCameraSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet r1) {
            super.onReadSGKeySet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake r1) {
            super.onReadSGKeywordAwake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet r1) {
            super.onReadSGSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int r1) {
            super.onReadSGSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings r1) {
            super.onReadSOSSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int r1) {
            super.onReadScreenBrightnessSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings r1) {
            super.onReadSedentariness(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> r1) {
            super.onReadSleep(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int r1) {
            super.onReadSleepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int r1) {
            super.onReadSleepMonitoringMode(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality r1) {
            super.onReadSleepQuality(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int r1) {
            super.onReadSleepQualityScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] r1) {
            super.onReadSleepRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int r1) {
            super.onReadSleepRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int r1) {
            super.onReadSleepRiskLevel(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int r1) {
            super.onReadSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> r1) {
            super.onReadSosCallLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact r1) {
            super.onReadSosContact(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int r1) {
            super.onReadSportDurationGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet r1) {
            super.onReadStandbyWatchFaceSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int r1) {
            super.onReadStepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> r1) {
            super.onReadStock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> r1) {
            super.onReadTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int r1) {
            super.onReadTemperatureUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> r1) {
            super.onReadTrainingStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey r1) {
            super.onReadTuyaKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String r1) {
            super.onReadUiPackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int r1) {
            super.onReadUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile r1) {
            super.onReadUserProfile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> r1) {
            super.onReadVitalityValue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int r1) {
            super.onReadVoiceControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId r1) {
            super.onReadWatchFaceId(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex r1) {
            super.onReadWatchFaceIndex(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize r1) {
            super.onReadWatchFaceMaxSize(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int r1) {
            super.onReadWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword r1) {
            super.onReadWatchPassword(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int r1) {
            super.onReadWearWayState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean r1) {
            super.onReadWeatherRealTime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings r1) {
            super.onReadWechatPaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> r1) {
            super.onReadWorkout(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> r1) {
            super.onReadWorkout2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> r1) {
            super.onReadWorkout3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> r1) {
            super.onReadWorkout4(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation r1) {
            super.onReadWorkout4Segmentation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> r1) {
            super.onReadWorldClock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement r1) {
            super.onRealTimeMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] r1, boolean r2) {
            super.onReceiveCmTrace(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket r1) {
            super.onReceiveFilePacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> r1) {
            super.onReceiveGSensorMotion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> r1) {
            super.onReceiveGSensorRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> r1) {
            super.onReceiveGSensorSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> r1) {
            super.onReceiveHRRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga r1) {
            super.onReceiveLocationGga(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> r1) {
            super.onReceiveLocationGsv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand r1) {
            super.onReceiveMusicCommand(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> r1) {
            super.onReceivePpgSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog r1) {
            super.onReceiveRealtimeLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket r1) {
            super.onReceiveRecordPacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl r1) {
            super.onRecordControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int r1) {
            super.onRequestLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings r1) {
            super.onRingVibrationSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo r1) {
            super.onSDCardInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest r1) {
            super.onSGTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts r1) {
            super.onSGTtsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings r1) {
            super.onSOSSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
            super.onScreenBrightnessSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean r2) {
            LogUtils.d(new Object[]{"onSessionStateChange"});
            if (r2 == true) goto L6;
            DeveloperUpgradeRSmaActivity.access$setMStarted(this.IO, false);
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify r1) {
            super.onSleepNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact r1) {
            super.onSosContactUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int r1) {
            super.onSportEndNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet r1) {
            super.onStandbyWatchFaceSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int r1) {
            super.onStepGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int r1) {
            super.onStockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onStreamProgress(boolean r5, int r6, int r7, int r8, BleKey r9) {
            Intrinsics.X0O(r9, "bleKey");
            if (r5 == true) goto L5;
            DeveloperUpgradeRSmaActivity.access$setMStarted(this.IO, false);
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(this.IO), R.string.starting, false, 2, null);
            TextView r10 = DeveloperUpgradeRSmaActivity.access$getTvStep(this.IO);
            final DeveloperUpgradeRSmaActivity r11 = this.IO;
            r10.postDelayed(new i0iiOOO(r11), 8000);
            return;
        L5:
            if ((System.currentTimeMillis() - DeveloperUpgradeRSmaActivity.access$getTime1$p(this.IO)) <= 1000) goto L7;
            DeveloperUpgradeRSmaActivity.access$setTime1$p(this.IO, System.currentTimeMillis());
            DeveloperUpgradeRSmaActivity.access$getTvSpeed(this.IO).setText(new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(((double) (r8 - DeveloperUpgradeRSmaActivity.access$getLastPackageSize$p(this.IO))) / 1024.0d) + " KB/s");
            DeveloperUpgradeRSmaActivity.access$setLastPackageSize$p(this.IO, r8);
        L7:
            DeveloperUpgradeRSmaActivity.access$getProgressButton(this.IO).setProgressDecimalPlaces(r8 / r7);
            if (r7 == r8) goto L10;
            return;
        L10:
            if (DeveloperUpgradeRSmaActivity.access$getMStepsIndex$p(this.IO) >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeRSmaActivity.access$getMSteps$p(this.IO))) goto L13;
            DeveloperUpgradeRSmaActivity.access$getProgressButton(this.IO).setProgress(0.0f);
            DeveloperUpgradeRSmaActivity.access$setMStepsIndex$p(this.IO, DeveloperUpgradeRSmaActivity.access$getMStepsIndex$p(this.IO) + 1);
            TextView r12 = DeveloperUpgradeRSmaActivity.access$getTvStep(this.IO);
            final DeveloperUpgradeRSmaActivity r13 = this.IO;
            r12.postDelayed(new iOi110(r13), 4000);
            return;
        L13:
            DeveloperUpgradeRSmaActivity.access$upgradeDone(this.IO);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int r1, BleKey r2) {
            super.onSyncData(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onUpdateAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay r1) {
            super.onUpdateAICoachLeaveDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState r1) {
            super.onUpdateAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC r1) {
            super.onUpdateBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure r1) {
            super.onUpdateBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate r1) {
            super.onUpdateHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature r1) {
            super.onUpdateTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
            super.onUpdateWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile r1) {
            super.onUserProfileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int r1) {
            super.onVibrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int r1) {
            super.onVibrationUpdateV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean r1) {
            super.onWatchFaceIdUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean r1) {
            super.onWatchFaceIndexCreate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex r1) {
            super.onWatchFaceIndexUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword r1) {
            super.onWatchPasswordUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int r1) {
            super.onWearWayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int r1) {
            super.onWorldClockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet r1) {
            super.onXMLYBandSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte r1) {
            super.onXModem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean r1) {
            super.onReadStock(r1);
        }
    }

    public static final class iO extends DfuAdapter.DfuHelperCallback {
        public final /* synthetic */ DeveloperUpgradeRSmaActivity OXO1;

        public iO(DeveloperUpgradeRSmaActivity r1) {
            this.OXO1 = r1;
        }

        public static final void I0IIOi(DeveloperUpgradeRSmaActivity r0) {
            DeveloperUpgradeRSmaActivity.access$upgrade(r0);
        }

        public static final void IO(int r4, DeveloperUpgradeRSmaActivity r5) {
            if (r4 != 258) goto L5;
            DeveloperUpgradeRSmaActivity.access$upgrade(r5);
            return;
        L5:
            if (r4 != 527) goto L7;
            ProgressButton.O00(DeveloperUpgradeRSmaActivity.access$getProgressButton(r5), R.string.preparing, false, 2, null);
            r5.setMOtaDeviceInfo(DeveloperUpgradeRSmaActivity.access$getMDfuHelper(r5).getOtaDeviceInfo());
            LogUtils.d(new Object[]{"onStateChanged -> mOtaDeviceInfo = " + r5.getMOtaDeviceInfo()});
            DeveloperUpgradeRSmaActivity.access$startOtaProcess(r5);
            return;
        L7:
            if (r4 == 4097) goto L9;
            return;
        L9:
            DeveloperUpgradeRSmaActivity.access$setMStarted(r5, false);
            ProgressButton.IiI10X(DeveloperUpgradeRSmaActivity.access$getProgressButton(r5), OOX00.OXO1.O00(), false, 2, null);
            r5.onBottomClick(DeveloperUpgradeRSmaActivity.access$getTvStep(r5));
        }

        public static final void IiI10X(DeveloperUpgradeRSmaActivity r5) {
            ProgressButton.IiI10X(DeveloperUpgradeRSmaActivity.access$getProgressButton(r5), OOX00.OXO1.O00(), false, 2, null);
            r5.onBottomClick(DeveloperUpgradeRSmaActivity.access$getTvStep(r5));
        }

        public static /* synthetic */ void O00(DeveloperUpgradeRSmaActivity r0) {
            IiI10X(r0);
        }

        public static final void OIi0(DeveloperUpgradeRSmaActivity r1, DfuProgressInfo r2) {
            DeveloperUpgradeRSmaActivity.access$getProgressButton(r1).setProgress(r2.getProgress() / 100.0f);
        }

        public static /* synthetic */ void OXO1(DeveloperUpgradeRSmaActivity r0, DfuProgressInfo r1) {
            OIi0(r0, r1);
        }

        public static /* synthetic */ void XIi00iiXO(int r0, DeveloperUpgradeRSmaActivity r1) {
            XOO0ii0(r0, r1);
        }

        public static /* synthetic */ void XO0O10(DeveloperUpgradeRSmaActivity r0) {
            I0IIOi(r0);
        }

        public static final void XOO0ii0(int r3, final DeveloperUpgradeRSmaActivity r4) {
            if (r3 == 258) goto L5;
            return;
        L5:
            if (DeveloperUpgradeRSmaActivity.access$getMStepsIndex$p(r4) >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeRSmaActivity.access$getMSteps$p(r4))) goto L8;
            DeveloperUpgradeRSmaActivity.access$getProgressButton(r4).setProgress(0.0f);
            DeveloperUpgradeRSmaActivity.access$setMStepsIndex$p(r4, DeveloperUpgradeRSmaActivity.access$getMStepsIndex$p(r4) + 1);
            DeveloperUpgradeRSmaActivity.access$getTvStep(r4).postDelayed(new X10X0(r4), 2000);
            return;
        L8:
            DeveloperUpgradeRSmaActivity.access$upgradeDone(r4);
        }

        public static /* synthetic */ void iO(int r0, DeveloperUpgradeRSmaActivity r1) {
            IO(r0, r1);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int r3, int r4) {
            LogUtils.e(new Object[]{"FirmwareUpgradeRSmaActivity onError: type=" + r3 + ", code" + r4});
            DeveloperUpgradeRSmaActivity.access$setMStarted(this.OXO1, false);
            ToastUtils.showLong(R.string.firmware_upgrading_failed_and_retry);
            final DeveloperUpgradeRSmaActivity r5 = this.OXO1;
            r5.runOnUiThread(new XO00iXOOi(r5));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(final int r2, Throughput r3) {
            final DeveloperUpgradeRSmaActivity r4 = this.OXO1;
            r4.runOnUiThread(new iIX010II(r2, r4));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(final DfuProgressInfo r3) {
            Intrinsics.X0O(r3, "progressInfo");
            final DeveloperUpgradeRSmaActivity r0 = this.OXO1;
            r0.runOnUiThread(new O001X(r0, r3));
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(final int r3) {
            LogUtils.d(new Object[]{"onStateChanged -> state = " + r3});
            final DeveloperUpgradeRSmaActivity r0 = this.OXO1;
            r0.runOnUiThread(new OOIii10I1(r3, r0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeveloperUpgradeRSmaActivity() {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XIi00iiXO();
        FirmwareVersion r3 = null;
        Object r2 = new OIOO0X00O(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        Object r4 = new Gson().fromJson(r1.getString(OIOO0X00O.class.getName()), OIOO0X00O.class);
        if (r4 == null) goto L6;
        r2 = r4;
    L6:
        this.alreadyUpdateDeviceList = (OIOO0X00O) r2;
        String r5 = r0.XIi00iiXO().getString(b01.XXX11i);
        this.deviceAddress = r5;
        this.isAutoShutdown = r0.XIi00iiXO().getBoolean(b01.X1, false);
        this.mDfuHelper$delegate = LazyKt__LazyJVMKt.iO(new i1Oi11XIi(this));
        this.mDfuCallback = new iO(this);
        DfuConfig r6 = new DfuConfig();
        r6.setAddress(r5);
        r6.setAutomaticActiveEnabled(true);
        r6.setFileLocation(0);
        r6.setVersionCheckEnabled(false);
        this.mDfuConfig = r6;
        this.mBleHandleCallback = new XIi00iiXO(this);
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r0.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions r7 = (ExtraPackVersions) new Gson().fromJson(r0.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = r7;
        if (r7 == null) goto L9;
        FirmwareVersion r8 = r7.getUiPackVersion();
    L10:
        this.mLatestUi = r8;
        if (r7 == null) goto L13;
        FirmwareVersion r9 = r7.getLanguagePackVersion();
    L14:
        this.mLatestLanguage = r9;
        if (r7 == null) goto L17;
        r3 = r7.getFontPackVersion();
    L17:
        this.mLatestFont = r3;
        BleCache r10 = BleCache.INSTANCE;
        this.mCurrentFirmware = BaseBleCache.getString$default(r10, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(r10, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(r10, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
        return;
    L13:
        r9 = null;
        goto L14
    L9:
        r8 = null;
        goto L10
    }

    public static /* synthetic */ void I1(DeveloperUpgradeRSmaActivity r0) {
        upgrade$lambda$5(r0);
    }

    public static /* synthetic */ void OII(DeveloperUpgradeRSmaActivity r0) {
        checkDownload$lambda$3(r0);
    }

    public static /* synthetic */ void OX(DeveloperUpgradeRSmaActivity r0) {
        upgrade$lambda$3(r0);
    }

    public static /* synthetic */ void OiIIX101O(DeveloperUpgradeRSmaActivity r0) {
        upgradeDone$lambda$1(r0);
    }

    public static /* synthetic */ void X01IiOiIi(DeveloperUpgradeRSmaActivity r0) {
        upgrade$lambda$1(r0);
    }

    public static /* synthetic */ void XX0(DeveloperUpgradeRSmaActivity r0) {
        checkDownload$lambda$5(r0);
    }

    public static /* synthetic */ GattDfuAdapter XiOIii1(DeveloperUpgradeRSmaActivity r0) {
        return mDfuHelper_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$checkDownload(DeveloperUpgradeRSmaActivity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ int access$getLastPackageSize$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.lastPackageSize;
    }

    public static final /* synthetic */ GattDfuAdapter access$getMDfuHelper(DeveloperUpgradeRSmaActivity r0) {
        return r0.getMDfuHelper();
    }

    public static final /* synthetic */ int access$getMDownloaded$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFont$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mLatestFont;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestLanguage$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mLatestLanguage;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestUi$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mLatestUi;
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ List access$getMSteps$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mSteps;
    }

    public static final /* synthetic */ int access$getMStepsIndex$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.mStepsIndex;
    }

    public static final /* synthetic */ ProgressButton access$getProgressButton(DeveloperUpgradeRSmaActivity r0) {
        return r0.getProgressButton();
    }

    public static final /* synthetic */ long access$getTime1$p(DeveloperUpgradeRSmaActivity r2) {
        return r2.time1;
    }

    public static final /* synthetic */ TextView access$getTvSpeed(DeveloperUpgradeRSmaActivity r0) {
        return r0.getTvSpeed();
    }

    public static final /* synthetic */ TextView access$getTvStep(DeveloperUpgradeRSmaActivity r0) {
        return r0.getTvStep();
    }

    public static final /* synthetic */ boolean access$isStartShutdown$p(DeveloperUpgradeRSmaActivity r0) {
        return r0.isStartShutdown;
    }

    public static final /* synthetic */ void access$setLastPackageSize$p(DeveloperUpgradeRSmaActivity r0, int r1) {
        r0.lastPackageSize = r1;
    }

    public static final /* synthetic */ void access$setMDownloaded$p(DeveloperUpgradeRSmaActivity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$setMStarted(DeveloperUpgradeRSmaActivity r0, boolean r1) {
        r0.setMStarted(r1);
    }

    public static final /* synthetic */ void access$setMStepsIndex$p(DeveloperUpgradeRSmaActivity r0, int r1) {
        r0.mStepsIndex = r1;
    }

    public static final /* synthetic */ void access$setTime1$p(DeveloperUpgradeRSmaActivity r0, long r1) {
        r0.time1 = r1;
    }

    public static final /* synthetic */ void access$startOtaProcess(DeveloperUpgradeRSmaActivity r0) {
        r0.startOtaProcess();
    }

    public static final /* synthetic */ void access$upgrade(DeveloperUpgradeRSmaActivity r0) {
        r0.upgrade();
    }

    public static final /* synthetic */ void access$upgradeDone(DeveloperUpgradeRSmaActivity r0) {
        r0.upgradeDone();
    }

    public static final /* synthetic */ void access$upgradeExit(DeveloperUpgradeRSmaActivity r0) {
        r0.upgradeExit();
    }

    private final void checkDownload() {
        if (this.mDownloaded != this.mSteps.size()) goto L43;
        LogUtils.d(new Object[]{"checkDownload"});
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        FileType r0 = this.mSteps.get(this.mStepsIndex);
        int r1 = OXO1.OXO1[r0.ordinal()];
        if (r1 != 1) goto L7;
        getMDfuHelper().initialize(this.mDfuCallback);
        return;
    L7:
        if (r1 != 2) goto L9;
        BleConnector r4 = BleConnector.INSTANCE;
        if (r4.isAvailable() == false) goto L36;
        BleKey r5 = BleKey.UI_FILE;
        File r2 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r3 = this.mLatestUi;
        Intrinsics.XXI(r3);
        BaseBleConnector.sendStream$default(r4, r5, new File(r2, r3.getFileName()), 0, 4, null);
        return;
    L36:
        GattDfuAdapter r6 = getMDfuHelper();
        if (r6 == null) goto L39;
        r6.abort();
        r6.close();
    L39:
        new Handler().postDelayed(new iOIOX1i(this), 4000);
        return;
    L9:
        if (r1 != 3) goto L11;
        BleConnector r7 = BleConnector.INSTANCE;
        if (r7.isAvailable() == false) goto L27;
        BleKey r8 = BleKey.LANGUAGE_FILE;
        File r9 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r10 = this.mLatestLanguage;
        Intrinsics.XXI(r10);
        BaseBleConnector.sendStream$default(r7, r8, new File(r9, r10.getFileName()), 0, 4, null);
        return;
    L27:
        GattDfuAdapter r11 = getMDfuHelper();
        if (r11 == null) goto L30;
        r11.abort();
        r11.close();
    L30:
        new Handler().postDelayed(new OOXIOiO(this), 4000);
        return;
    L11:
        if (r1 != 4) goto L22;
        BleConnector r12 = BleConnector.INSTANCE;
        if (r12.isAvailable() == false) goto L16;
        BleKey r13 = BleKey.FONT_FILE;
        File r14 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r15 = this.mLatestFont;
        Intrinsics.XXI(r15);
        BaseBleConnector.sendStream$default(r12, r13, new File(r14, r15.getFileName()), 0, 4, null);
        return;
    L16:
        GattDfuAdapter r16 = getMDfuHelper();
        if (r16 == null) goto L19;
        r16.abort();
        r16.close();
    L19:
        new Handler().postDelayed(new XXI1(this), 4000);
        return;
    L22:
        throw new NoWhenBranchMatchedException();
    }

    private static final void checkDownload$lambda$1(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void checkDownload$lambda$3(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void checkDownload$lambda$5(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) getValue();
    }

    public static /* synthetic */ void iOOX010X(DeveloperUpgradeRSmaActivity r0) {
        checkDownload$lambda$1(r0);
    }

    private static final GattDfuAdapter mDfuHelper_delegate$lambda$0(DeveloperUpgradeRSmaActivity r0) {
        return GattDfuAdapter.getInstance(r0.getMContext());
    }

    private final void otaConnect(String r2) {
        ConnectParams.Builder r3 = new ConnectParams.Builder().address(r2).reconnectTimes(3);
        getMDfuHelper().connectDevice(r3.build());
    }

    private final void startOtaProcess() {
        DfuConfig r0 = this.mDfuConfig;
        r0.setOtaWorkMode(0);
        File r2 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r3 = this.mLatestFirmware;
        Intrinsics.XXI(r3);
        r0.setFilePath(new File(r2, r3.getFileName()).getAbsolutePath());
        GattDfuAdapter r1 = getMDfuHelper();
        if (r1 == null) goto L6;
        r1.startOtaProcedure(r0, this.mOtaDeviceInfo, true);
        return;
    }

    private final void upgrade() {
        LogUtils.d(new Object[]{"upgrade"});
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())}));
        FileType r0 = this.mSteps.get(this.mStepsIndex);
        int r1 = OXO1.OXO1[r0.ordinal()];
        if (r1 != 1) goto L5;
        String r2 = this.deviceAddress;
        Intrinsics.O10IXXX0X(r2, "deviceAddress");
        otaConnect(r2);
        return;
    L5:
        if (r1 != 2) goto L7;
        BleConnector r4 = BleConnector.INSTANCE;
        if (r4.isAvailable() == false) goto L34;
        BleKey r5 = BleKey.UI_FILE;
        File r3 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r6 = this.mLatestUi;
        Intrinsics.XXI(r6);
        BaseBleConnector.sendStream$default(r4, r5, new File(r3, r6.getFileName()), 0, 4, null);
        return;
    L34:
        GattDfuAdapter r7 = getMDfuHelper();
        if (r7 == null) goto L37;
        r7.abort();
        r7.close();
    L37:
        new Handler().postDelayed(new IXi01III(this), 4000);
        return;
    L7:
        if (r1 != 3) goto L9;
        BleConnector r8 = BleConnector.INSTANCE;
        if (r8.isAvailable() == false) goto L25;
        BleKey r9 = BleKey.LANGUAGE_FILE;
        File r10 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r11 = this.mLatestLanguage;
        Intrinsics.XXI(r11);
        BaseBleConnector.sendStream$default(r8, r9, new File(r10, r11.getFileName()), 0, 4, null);
        return;
    L25:
        GattDfuAdapter r12 = getMDfuHelper();
        if (r12 == null) goto L28;
        r12.abort();
        r12.close();
    L28:
        new Handler().postDelayed(new OO010XXO(this), 4000);
        return;
    L9:
        if (r1 != 4) goto L20;
        BleConnector r13 = BleConnector.INSTANCE;
        if (r13.isAvailable() == false) goto L14;
        BleKey r14 = BleKey.FONT_FILE;
        File r15 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r16 = this.mLatestFont;
        Intrinsics.XXI(r16);
        BaseBleConnector.sendStream$default(r13, r14, new File(r15, r16.getFileName()), 0, 4, null);
        return;
    L14:
        GattDfuAdapter r17 = getMDfuHelper();
        if (r17 == null) goto L17;
        r17.abort();
        r17.close();
    L17:
        new Handler().postDelayed(new XX1IOII1X(this), 4000);
        return;
    L20:
        throw new NoWhenBranchMatchedException();
    }

    private static final void upgrade$lambda$1(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$3(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$5(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private final void upgradeDone() {
        if (this.isAutoShutdown == false) goto L19;
        LogUtils.d(new Object[]{"start shutdown"});
        if (this.mLoadingPopup != null) goto L7;
        this.mLoadingPopup = new uq(getMContext());
    L7:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L10;
        r0.IIX1OXO();
    L10:
        this.isStartShutdown = true;
        BleConnector r1 = BleConnector.INSTANCE;
        if (r1.isAvailable() == false) goto L14;
        BaseBleConnector.sendInt8$default(r1, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return;
    L14:
        GattDfuAdapter r2 = getMDfuHelper();
        if (r2 == null) goto L17;
        r2.abort();
        r2.close();
    L17:
        new Handler().postDelayed(new O1OiiOI10(this), 10000);
        return;
    L19:
        upgradeExit();
    }

    private static final void upgradeDone$lambda$1(DeveloperUpgradeRSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private final void upgradeExit() {
        XO0O10().add(this.deviceAddress);
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        OIOO0X00O r1 = this.alreadyUpdateDeviceList;
        r0.put(OIOO0X00O.class.getName(), new Gson().toJson(r1));
        finish();
    }

    @tb1
    public final OtaDeviceInfo getMOtaDeviceInfo() {
        return this.mOtaDeviceInfo;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector r3 = BleConnector.INSTANCE;
        r3.addHandleCallback(this.mBleHandleCallback);
        r3.setNeedBind(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 == null) goto L5;
    L11:
        if (r0 == null) goto L14;
        String r1 = r0.getVersion();
        if (r1 == null) goto L14;
    L15:
        FirmwareVersion r5 = this.mLatestUi;
        if (r5 == null) goto L21;
        String r6 = r5.getVersion();
        if (r6 == null) goto L21;
    L22:
        String r7 = oe5.IXO0OOi(r6, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r8 = this.mLatestLanguage;
        if (r8 == null) goto L28;
        String r9 = r8.getVersion();
        if (r9 == null) goto L28;
    L29:
        String r10 = oe5.IXO0OOi(r9, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r11 = this.mLatestFont;
        if (r11 == null) goto L35;
        String r12 = r11.getVersion();
        if (r12 == null) goto L35;
        String r13 = r12;
    L36:
        String r2 = oe5.IXO0OOi(r13, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r1 + FileUtils.FILE_EXTENSION_SEPARATOR + r7 + r10 + r2}));
        String r3 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r4 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + r3 + r4}));
        if (this.mLatestFirmware == null) goto L40;
        this.mSteps.add(FileType.FIRMWARE);
    L40:
        if (this.mLatestLanguage == null) goto L43;
        this.mSteps.add(FileType.LANGUAGE_PACK);
    L43:
        if (this.mLatestUi == null) goto L46;
        this.mSteps.add(FileType.UI_PACK);
    L46:
        if (this.mLatestFont == null) goto L48;
        this.mSteps.add(FileType.FONT_PACK);
    L48:
        getTvStep().setVisibility(0);
    L49:
        getDevInfo().setVisibility(0);
        TextView r14 = getTvAlreadyOta();
        SPUtils r15 = a01.OXO1.XIi00iiXO();
        Object r16 = new OIOO0X00O(null, 1, 0 == true ? 1 : 0);
        Object r17 = new Gson().fromJson(r15.getString(OIOO0X00O.class.getName()), OIOO0X00O.class);
        if (r17 == null) goto L53;
        r16 = r17;
    L53:
        r14.setText(String.valueOf(((OIOO0X00O) r16).XO0O10().size()));
        getTvInfo().setText("R sma");
        onBottomClick(getTvStep());
        return;
    L35:
        r13 = "000";
    L28:
        r9 = this.mCurrentLanguage;
    L21:
        r6 = this.mCurrentUi;
    L14:
        r1 = this.mCurrentFirmware;
        goto L15
    L5:
        if (this.mLatestUi != null) goto L11;
        if (this.mLatestLanguage != null) goto L11;
        if (this.mLatestFont != null) goto L11;
        String r18 = this.mCurrentFirmware;
        String r19 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r20 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r18 + FileUtils.FILE_EXTENSION_SEPARATOR + r19 + r20 + "000"}));
        ViewParent r21 = getTvCurrent().getParent();
        Intrinsics.X1ii(r21, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r21).setVisibility(8);
        getProgressButton().setVisibility(8);
        goto L49
    }

    public final void onBottomClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        BleConnector.INSTANCE.closeConnection(true);
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex == 0) goto L5;
        upgrade();
        return;
    L5:
        if (this.mLatestFirmware == null) goto L11;
        sz0 r1 = sz0.OXO1;
        if (new File(uz0.I0iXXO(r1), this.mLatestFirmware.getFileName()).exists() == false) goto L9;
        this.mDownloaded++;
        checkDownload();
        goto L11
    L9:
        NetWorkUtils.INSTANCE.download(this.mLatestFirmware.getFileUrl(), uz0.XXI(r1), this.mLatestFirmware.getFileName(), new AnonymousClass1(this));
    L11:
        if (this.mLatestUi == null) goto L17;
        sz0 r2 = sz0.OXO1;
        if (new File(uz0.I0iXXO(r2), this.mLatestUi.getFileName()).exists() == false) goto L15;
        this.mDownloaded++;
        checkDownload();
        goto L17
    L15:
        NetWorkUtils.INSTANCE.download(this.mLatestUi.getFileUrl(), uz0.XXI(r2), this.mLatestUi.getFileName(), new AnonymousClass2(this));
    L17:
        if (this.mLatestLanguage == null) goto L23;
        sz0 r3 = sz0.OXO1;
        if (new File(uz0.I0iXXO(r3), this.mLatestLanguage.getFileName()).exists() == false) goto L21;
        this.mDownloaded++;
        checkDownload();
        goto L23
    L21:
        NetWorkUtils.INSTANCE.download(this.mLatestLanguage.getFileUrl(), uz0.XXI(r3), this.mLatestLanguage.getFileName(), new AnonymousClass3(this));
    L23:
        if (this.mLatestFont == null) goto L32;
        sz0 r4 = sz0.OXO1;
        if (new File(uz0.I0iXXO(r4), this.mLatestFont.getFileName()).exists() == false) goto L28;
        this.mDownloaded++;
        checkDownload();
        return;
    L28:
        NetWorkUtils.INSTANCE.download(this.mLatestFont.getFileUrl(), uz0.XXI(r4), this.mLatestFont.getFileName(), new AnonymousClass4(this));
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.removeHandleCallback(this.mBleHandleCallback);
        if (this.mSteps.isEmpty() == false) goto L5;
    L7:
        r0.setNeedBind(true);
        GattDfuAdapter r1 = getMDfuHelper();
        if (r1 == null) goto L10;
        r1.abort();
        r1.close();
    L10:
        super.onDestroy();
        return;
    L5:
        if (this.mStepsIndex != CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) goto L7;
        BleCache r2 = BleCache.INSTANCE;
        BaseBleCache.remove$default(r2, BleKey.UI_FILE, null, 2, null);
        BaseBleCache.remove$default(r2, BleKey.LANGUAGE_FILE, null, 2, null);
        BaseBleCache.remove$default(r2, BleKey.FONT_FILE, null, 2, null);
        r0.closeConnection(true);
        goto L7
    }

    public final void setMOtaDeviceInfo(@tb1 OtaDeviceInfo r1) {
        this.mOtaDeviceInfo = r1;
    }
}
