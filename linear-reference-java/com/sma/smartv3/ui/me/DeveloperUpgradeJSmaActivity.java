package com.sma.smartv3.ui.me;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I001OO0X;
import com.android.mltcode.paycertificationapi.I0Ii1XOO0;
import com.android.mltcode.paycertificationapi.I1O01X1;
import com.android.mltcode.paycertificationapi.II0i1O0X;
import com.android.mltcode.paycertificationapi.O111OiI;
import com.android.mltcode.paycertificationapi.OII1XX1;
import com.android.mltcode.paycertificationapi.OIOO0X00O;
import com.android.mltcode.paycertificationapi.OO1XX1X;
import com.android.mltcode.paycertificationapi.OXO1X1O;
import com.android.mltcode.paycertificationapi.OXOO;
import com.android.mltcode.paycertificationapi.Oi1i1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00XI11i;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1O0iX1X;
import com.android.mltcode.paycertificationapi.iI10i1IX;
import com.android.mltcode.paycertificationapi.iOIIXI0II;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.ironsource.V2;
import com.ironsource.Y5;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity;
import com.sma.smartv3.ui.device.OTAStatus;
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
import com.szabh.smable3.entity.BleStreamPacket;
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
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperUpgradeJSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,792:1\n19#2:793\n15#2:794\n15#2:795\n15#2:796\n19#2:797\n15#2:798\n11#2,2:799\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n*L\n60#1:793\n60#1:794\n270#1:795\n271#1:796\n338#1:797\n338#1:798\n785#1:799,2\n*E\n"})
public final class DeveloperUpgradeJSmaActivity extends BaseFirmwareUpgradeActivity {

    @aa1
    private final String TAG;

    @aa1
    private final OIOO0X00O alreadyUpdateDeviceList;
    private int autoRetryCount;
    private final String deviceAddress;

    @aa1
    private final String deviceOTAAddress;
    private boolean isAutoShutdown;
    private int isRepairMode;
    private boolean isStartShutdown;
    private boolean isSupportOTAFile;
    private boolean isUseDfuAddress;
    private int lastPackageSize;

    @aa1
    private XIi00iiXO mBleHandleCallback;

    @tb1
    private BluetoothHelper mBluetoothHelper;

    @aa1
    private final iO mBtEventListener;

    @aa1
    private final String mCurrentFirmware;

    @aa1
    private final String mCurrentLanguage;

    @aa1
    private final String mCurrentUi;
    private int mDownloaded;

    @tb1
    private final FirmwareVersion mLatestBrand;

    @tb1
    private final FirmwareVersion mLatestDial;

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

    @aa1
    private final BtEventCallback mOTAEventCallback;

    @tb1
    private OTAManager mOTAManager;

    @aa1
    private OTAStatus mOTAStatus;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;
    private long startTime;
    private long time1;

    @aa1
    private Runnable upgradeRunnable;

    public static final enum FileType extends Enum<FileType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ FileType[] $VALUES = null;
        public static final FileType BRAND_PACK = null;
        public static final FileType DIAL_PACK = null;
        public static final FileType FIRMWARE = null;
        public static final FileType FONT_PACK = null;
        public static final FileType LANGUAGE_PACK = null;
        public static final FileType OTA_PACK = null;
        public static final FileType UI_PACK = null;

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{FIRMWARE, UI_PACK, LANGUAGE_PACK, BRAND_PACK, FONT_PACK, OTA_PACK, DIAL_PACK};
        }

        static {
            FIRMWARE = new FileType("FIRMWARE", 0);
            UI_PACK = new FileType("UI_PACK", 1);
            LANGUAGE_PACK = new FileType("LANGUAGE_PACK", 2);
            BRAND_PACK = new FileType("BRAND_PACK", 3);
            FONT_PACK = new FileType("FONT_PACK", 4);
            OTA_PACK = new FileType("OTA_PACK", 5);
            DIAL_PACK = new FileType("DIAL_PACK", 6);
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

    public static final class O00 implements IUpgradeCallback {
        public final /* synthetic */ DeveloperUpgradeJSmaActivity OXO1;

        public O00(DeveloperUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(DeveloperUpgradeJSmaActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(DeveloperUpgradeJSmaActivity r0) {
            DeveloperUpgradeJSmaActivity.access$upgradeDone(r0);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " onCancelOTA");
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError r5) {
            Intrinsics.X0O(r5, "p0");
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " onError -> status = " + DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) + ", error = " + r5);
            ToastUtils.showLong(r5.getMessage(), new Object[0]);
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String r4, boolean r5) {
            Intrinsics.X0O(r4, "p0");
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " onNeedReconnect : " + r4 + ", " + r5);
            DeveloperUpgradeJSmaActivity.access$setUseDfuAddress$p(this.OXO1, true);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int r4, float r5) {
            if (r4 != 0) goto L6;
            DeveloperUpgradeJSmaActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADE_CHECKING);
            ProgressButton r6 = DeveloperUpgradeJSmaActivity.access$getProgressButton(this.OXO1);
            String r1 = this.OXO1.getString(R.string.check_file);
            Intrinsics.O10IXXX0X(r1, "getString(...)");
            r6.XIi00iiXO(r1, Math.round(r5) / 100.0f);
            return;
        L6:
            DeveloperUpgradeJSmaActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADEING);
            DeveloperUpgradeJSmaActivity.access$getProgressButton(this.OXO1).setProgress(Math.round(r5) / 100.0f);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " onStartOTA");
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " onStopOTA upgrade done. " + ((System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.access$getStartTime$p(this.OXO1)) / ((long) 1000)) + "s");
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_STOP);
            DeveloperUpgradeJSmaActivity.access$getProgressButton(this.OXO1).setProgress(1.0f);
            if (DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeJSmaActivity.access$getMSteps$p(this.OXO1))) goto L6;
            DeveloperUpgradeJSmaActivity.access$getProgressButton(this.OXO1).setProgress(0.0f);
            DeveloperUpgradeJSmaActivity.access$setMStepsIndex$p(this.OXO1, DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) + 1);
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.OXO1).postDelayed(DeveloperUpgradeJSmaActivity.access$getUpgradeRunnable$p(this.OXO1), 4000);
            return;
        L6:
            TextView r0 = DeveloperUpgradeJSmaActivity.access$getTvStep(this.OXO1);
            final DeveloperUpgradeJSmaActivity r1 = this.OXO1;
            r0.postDelayed(new OXO1X1O(r1), 4000);
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;
        public static final /* synthetic */ int[] XIi00iiXO = null;

        static {
            int[] r0 = new int[FileType.values().length];
            r0[FileType.FIRMWARE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L18
        L32:
            r0[FileType.UI_PACK.ordinal()] = 2;     // Catch: NoSuchFieldError -> L19
        L46:
            r0[FileType.LANGUAGE_PACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L20
        L34:
            r0[FileType.FONT_PACK.ordinal()] = 4;     // Catch: NoSuchFieldError -> L21
        L36:
            r0[FileType.BRAND_PACK.ordinal()] = 5;     // Catch: NoSuchFieldError -> L22
        L28:
            r0[FileType.OTA_PACK.ordinal()] = 6;     // Catch: NoSuchFieldError -> L23
        L38:
            r0[FileType.DIAL_PACK.ordinal()] = 7;     // Catch: NoSuchFieldError -> L24
        L12:
            OXO1 = r0;
            int[] r1 = new int[OTAStatus.values().length];
            r1[OTAStatus.UPGRADE_SCANNING_TIMEOUT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L25
        L30:
            r1[OTAStatus.UPGRADE_FAILED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L26
        L40:
            r1[OTAStatus.UPGRADE_PREPARE_FAILED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L27
        L16:
            XIi00iiXO = r1;
        }
    }

    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ DeveloperUpgradeJSmaActivity IO;

        public static final /* synthetic */ class OXO1 {
            public static final /* synthetic */ int[] OXO1 = null;

            static {
                int[] r0 = new int[FileType.values().length];
                r0[FileType.UI_PACK.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
            L19:
                r0[FileType.LANGUAGE_PACK.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
            L27:
                r0[FileType.FONT_PACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
            L21:
                r0[FileType.DIAL_PACK.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
            L23:
                r0[FileType.BRAND_PACK.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
            L17:
                r0[FileType.OTA_PACK.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
            L9:
                OXO1 = r0;
            }
        }

        public XIi00iiXO(DeveloperUpgradeJSmaActivity r1) {
            this.IO = r1;
        }

        public static final void IiI10X(DeveloperUpgradeJSmaActivity r11) {
            FileType r0 = (FileType) DeveloperUpgradeJSmaActivity.access$getMSteps$p(r11).get(DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(r11));
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(r11) + " onSessionStateChange " + r0);
            switch(OXO1.OXO1[r0.ordinal()]) {
                case 1: goto L15;
                case 2: goto L13;
                case 3: goto L11;
                case 4: goto L9;
                case 5: goto L7;
                case 6: goto L5;
                default: goto L4;
            };
        L4:
            return;
        L5:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r5 = BleConnector.INSTANCE;
            BleKey r6 = BleKey.OTA_FILE;
            File r1 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r12 = DeveloperUpgradeJSmaActivity.access$getMLatestFirmware$p(r11);
            Intrinsics.XXI(r12);
            BaseBleConnector.sendStream$default(r5, r6, new File(r1, r12.getFileName()), 0, 4, null);
            return;
        L7:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r7 = BleConnector.INSTANCE;
            BleKey r8 = BleKey.BRAND_INFO_FILE;
            File r2 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r13 = DeveloperUpgradeJSmaActivity.access$getMLatestBrand$p(r11);
            Intrinsics.XXI(r13);
            BaseBleConnector.sendStream$default(r7, r8, new File(r2, r13.getFileName()), 0, 4, null);
            return;
        L9:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r9 = BleConnector.INSTANCE;
            BleKey r10 = BleKey.FAT_BIN_FILE;
            File r3 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r14 = DeveloperUpgradeJSmaActivity.access$getMLatestDial$p(r11);
            Intrinsics.XXI(r14);
            BaseBleConnector.sendStream$default(r9, r10, new File(r3, r14.getFileName()), 0, 4, null);
            return;
        L11:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r15 = BleConnector.INSTANCE;
            BleKey r16 = BleKey.FONT_FILE;
            File r4 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r17 = DeveloperUpgradeJSmaActivity.access$getMLatestFont$p(r11);
            Intrinsics.XXI(r17);
            BaseBleConnector.sendStream$default(r15, r16, new File(r4, r17.getFileName()), 0, 4, null);
            return;
        L13:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r18 = BleConnector.INSTANCE;
            BleKey r19 = BleKey.LANGUAGE_FILE;
            File r20 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r110 = DeveloperUpgradeJSmaActivity.access$getMLatestLanguage$p(r11);
            Intrinsics.XXI(r110);
            BaseBleConnector.sendStream$default(r18, r19, new File(r20, r110.getFileName()), 0, 4, null);
            return;
        L15:
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(r11), R.string.Parsing, false, 2, null);
            BleConnector r21 = BleConnector.INSTANCE;
            BleKey r22 = BleKey.UI_FILE;
            File r23 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r111 = DeveloperUpgradeJSmaActivity.access$getMLatestUi$p(r11);
            Intrinsics.XXI(r111);
            BaseBleConnector.sendStream$default(r21, r22, new File(r23, r111.getFileName()), 0, 4, null);
        }

        public static final void O00(DeveloperUpgradeJSmaActivity r3) {
            uq r0 = DeveloperUpgradeJSmaActivity.access$getMLoadingPopup$p(r3);
            if (r0 == null) goto L5;
            r0.dismiss();
        L5:
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(r3) + " force exit");
            DeveloperUpgradeJSmaActivity.access$upgradeExit(r3);
        }

        public static /* synthetic */ void OXO1(DeveloperUpgradeJSmaActivity r0) {
            O00(r0);
        }

        public static /* synthetic */ void XIi00iiXO(DeveloperUpgradeJSmaActivity r0) {
            XO0O10(r0);
        }

        public static final void XO0O10(final DeveloperUpgradeJSmaActivity r11) {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(r11) + " SESSION CREATE");
            BleConnector r2 = BleConnector.INSTANCE;
            BleKey r3 = BleKey.SESSION;
            BleKeyFlag r4 = BleKeyFlag.CREATE;
            Random.Default r0 = Random.Default;
            BaseBleConnector.sendInt32$default(r2, r3, r4, r0.nextInt(), null, false, false, 56, null);
            BleKeyFlag r5 = BleKeyFlag.UPDATE;
            BaseBleConnector.sendInt32$default(r2, r3, r5, r0.nextInt(), null, false, false, 56, null);
            if (DeveloperUpgradeJSmaActivity.access$isStartShutdown$p(r11) == false) goto L6;
            BaseBleConnector.sendInt8$default(r2, BleKey.SHUTDOWN, r5, 0, false, false, 24, null);
            new Handler().postDelayed(new i1O0iX1X(r11), 3000);
            return;
        }

        public static /* synthetic */ void iO(DeveloperUpgradeJSmaActivity r0) {
            IiI10X(r0);
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
            uq r4 = DeveloperUpgradeJSmaActivity.access$getMLoadingPopup$p(this.IO);
            if (r4 == null) goto L7;
            r4.dismiss();
        L7:
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.IO) + " shutdown success");
            DeveloperUpgradeJSmaActivity.access$upgradeExit(this.IO);
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey r4, BleKeyFlag r5) {
            Intrinsics.X0O(r4, "bleKey");
            Intrinsics.X0O(r5, "bleKeyFlag");
            if (r4 != BleKey.UI_FILE) goto L5;
        L13:
            DeveloperUpgradeJSmaActivity.access$setMStarted(this.IO, false);
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(this.IO), R.string.starting, false, 2, null);
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO).postDelayed(DeveloperUpgradeJSmaActivity.access$getUpgradeRunnable$p(this.IO), 8000);
            return;
        L5:
            if (r4 == BleKey.LANGUAGE_FILE) goto L13;
            if (r4 == BleKey.OTA_FILE) goto L13;
            if (r4 != BleKey.SESSION) goto L15;
            BleConnector r6 = BleConnector.INSTANCE;
            String r7 = DeveloperUpgradeJSmaActivity.access$getDeviceAddress$p(this.IO);
            Intrinsics.O10IXXX0X(r7, "access$getDeviceAddress$p(...)");
            r6.setAddress(r7).connect(true);
            return;
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
        public void onDeviceConnected(BluetoothDevice r6) {
            Intrinsics.X0O(r6, "device");
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.IO) + " onDeviceConnected " + DeveloperUpgradeJSmaActivity.access$isStartShutdown$p(this.IO) + " BUFFER_MAX_SIZE: " + BleStreamPacket.Companion.getBUFFER_MAX_SIZE());
            Handler r7 = new Handler();
            final DeveloperUpgradeJSmaActivity r0 = this.IO;
            r7.postDelayed(new OO1XX1X(r0), 5000);
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
        public void onSessionStateChange(boolean r8) {
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = DeveloperUpgradeJSmaActivity.access$getTAG$p(this.IO);
            BleStreamPacket.Companion r2 = BleStreamPacket.Companion;
            r0.OXO1(r1 + " onSessionStateChange BUFFER_MAX_SIZE: " + r2.getBUFFER_MAX_SIZE());
            if (r8 == true) goto L6;
            DeveloperUpgradeJSmaActivity.access$setMStarted(this.IO, false);
            r2.setBUFFER_MAX_SIZE(480);
            return;
        L6:
            r2.setBUFFER_MAX_SIZE(a01.OXO1.XIi00iiXO().getLong(b01.IO0II0i, 1018));
            r0.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.IO) + " onSessionStateChange BUFFER_MAX_SIZE: " + r2.getBUFFER_MAX_SIZE() + ", step:" + DeveloperUpgradeJSmaActivity.access$getMSteps$p(this.IO).get(DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO)));
            DeveloperUpgradeJSmaActivity.access$setStartTime$p(this.IO, System.currentTimeMillis());
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO).setVisibility(0);
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(this.IO), R.string.starting, false, 2, null);
            TextView r9 = DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO);
            DeveloperUpgradeJSmaActivity r3 = this.IO;
            r9.setText(r3.getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(r3) + 1), Integer.valueOf(DeveloperUpgradeJSmaActivity.access$getMSteps$p(this.IO).size())}));
            Handler r10 = new Handler();
            final DeveloperUpgradeJSmaActivity r4 = this.IO;
            r10.postDelayed(new Oi1i1(r4), 1000);
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
            DeveloperUpgradeJSmaActivity.access$setMStarted(this.IO, false);
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.access$getProgressButton(this.IO), R.string.starting, false, 2, null);
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO).removeCallbacks(DeveloperUpgradeJSmaActivity.access$getUpgradeRunnable$p(this.IO));
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO).postDelayed(DeveloperUpgradeJSmaActivity.access$getUpgradeRunnable$p(this.IO), 8000);
            return;
        L5:
            if ((System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.access$getTime1$p(this.IO)) <= 1000) goto L7;
            DeveloperUpgradeJSmaActivity.access$setTime1$p(this.IO, System.currentTimeMillis());
            DeveloperUpgradeJSmaActivity.access$getTvSpeed(this.IO).setText(new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(((double) (r8 - DeveloperUpgradeJSmaActivity.access$getLastPackageSize$p(this.IO))) / 1024.0d) + " KB/s");
            DeveloperUpgradeJSmaActivity.access$setLastPackageSize$p(this.IO, r8);
        L7:
            DeveloperUpgradeJSmaActivity.access$getProgressButton(this.IO).setProgressDecimalPlaces(r8 / r7);
            if (r7 != r8) goto L20;
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.IO) + " onStreamProgress " + r9 + " done. " + ((System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.access$getStartTime$p(this.IO)) / ((long) 1000)) + "s");
            if (DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO) >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeJSmaActivity.access$getMSteps$p(this.IO))) goto L16;
            DeveloperUpgradeJSmaActivity.access$getProgressButton(this.IO).setProgress(0.0f);
            if (DeveloperUpgradeJSmaActivity.access$getMSteps$p(this.IO).get(DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO)) == FileType.OTA_PACK) goto L14;
            DeveloperUpgradeJSmaActivity.access$getTvStep(this.IO).postDelayed(DeveloperUpgradeJSmaActivity.access$getUpgradeRunnable$p(this.IO), 5000);
        L14:
            DeveloperUpgradeJSmaActivity.access$setMStepsIndex$p(this.IO, DeveloperUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO) + 1);
            return;
        L16:
            DeveloperUpgradeJSmaActivity.access$upgradeDone(this.IO);
            return;
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

    public static final class XO0O10 extends BtEventCallback {
        public final /* synthetic */ DeveloperUpgradeJSmaActivity OXO1;

        public XO0O10(DeveloperUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
        public void onConnection(BluetoothDevice r6, int r7) {
            Intrinsics.X0O(r6, "device");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1);
            OTAStatus r2 = DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r3 = DeveloperUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            Intrinsics.XXI(r3);
            r0.OXO1(r1 + " ota onConnection -> mOTAStatus = " + r2 + ", " + r6 + " ,status = " + r7 + " ,isOTA = " + r3.isOTA());
            OTAManager r8 = DeveloperUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            Intrinsics.XXI(r8);
            if (r8.isOTA() == true) goto L16;
            if (r7 != 0) goto L6;
            r0.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota onConnection -> device disconnected");
            if (DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L18;
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L18:
            return;
        L6:
            if (r7 != 1) goto L19;
            DeveloperUpgradeJSmaActivity r9 = this.OXO1;
            if (DeveloperUpgradeJSmaActivity.access$canOTA(r9, DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(r9)) == false) goto L17;
            DeveloperUpgradeJSmaActivity r10 = this.OXO1;
            File r4 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r5 = DeveloperUpgradeJSmaActivity.access$getMLatestFirmware$p(this.OXO1);
            Intrinsics.XXI(r5);
            String r11 = new File(r4, r5.getFileName()).getAbsolutePath();
            Intrinsics.O10IXXX0X(r11, "getAbsolutePath(...)");
            r10.startOTA(r11);
            return;
        L17:
            return;
        L19:
            return;
        }
    }

    public static final class iO extends BluetoothEventListener {
        public final /* synthetic */ DeveloperUpgradeJSmaActivity OXO1;

        public iO(DeveloperUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean r4) {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onAdapterStatus " + r4);
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice r6, int r7) {
            Intrinsics.X0O(r6, "device");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1);
            OTAStatus r2 = DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r3 = DeveloperUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            if (r3 == null) goto L5;
            Boolean r4 = Boolean.valueOf(r3.isOTA());
        L6:
            r0.OXO1(r1 + " bt onConnection -> mOTAStatus = " + r2 + ", " + r6 + " ,status = " + r7 + " ,isOTA = " + r4);
            if (r7 != 0) goto L12;
            r0.OXO1(DeveloperUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onConnection -> device disconnected");
            if (DeveloperUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L13;
            DeveloperUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L13:
            return;
        L12:
            return;
        L5:
            r4 = null;
            goto L6
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeveloperUpgradeJSmaActivity() {
        this.TAG = "DeveloperUpgradeJ";
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
        StringCompanionObject r6 = StringCompanionObject.OXO1;
        Intrinsics.O10IXXX0X(r5, "deviceAddress");
        String r7 = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(Long.parseLong(oe5.IXO0OOi(r5, CertificateUtil.DELIMITER, "", false, 4, null), kotlin.text.OXO1.OXO1(16)) + 1)}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        this.deviceOTAAddress = CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(r7, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
        this.isAutoShutdown = r0.XIi00iiXO().getBoolean(b01.X1, false);
        this.isSupportOTAFile = r0.XIi00iiXO().getBoolean(b01.IXOIIIO, false);
        this.isRepairMode = -1;
        this.mOTAStatus = OTAStatus.NONE;
        this.upgradeRunnable = new i00XI11i(this);
        this.mBtEventListener = new iO(this);
        this.mOTAEventCallback = new XO0O10(this);
        this.mBleHandleCallback = new XIi00iiXO(this);
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r0.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions r8 = (ExtraPackVersions) new Gson().fromJson(r0.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = r8;
        if (r8 == null) goto L9;
        FirmwareVersion r9 = r8.getUiPackVersion();
    L10:
        this.mLatestUi = r9;
        if (r8 == null) goto L13;
        FirmwareVersion r10 = r8.getLanguagePackVersion();
    L14:
        this.mLatestLanguage = r10;
        if (r8 == null) goto L17;
        FirmwareVersion r11 = r8.getBrandPackVersion();
    L18:
        this.mLatestBrand = r11;
        if (r8 == null) goto L21;
        FirmwareVersion r12 = r8.getFontPackVersion();
    L22:
        this.mLatestFont = r12;
        if (r8 == null) goto L25;
        r3 = r8.getDialPackVersion();
    L25:
        this.mLatestDial = r3;
        BleCache r13 = BleCache.INSTANCE;
        this.mCurrentFirmware = BaseBleCache.getString$default(r13, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(r13, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(r13, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
        return;
    L21:
        r12 = null;
        goto L22
    L17:
        r11 = null;
        goto L18
    L13:
        r10 = null;
        goto L14
    L9:
        r9 = null;
        goto L10
    }

    public static /* synthetic */ void I1(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$4(r0);
    }

    public static /* synthetic */ void II1Xi0(DeveloperUpgradeJSmaActivity r0) {
        upgradeRunnable$lambda$0(r0);
    }

    public static /* synthetic */ void OII(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$0(r0);
    }

    public static /* synthetic */ void OX(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$1(r0);
    }

    public static /* synthetic */ void OiIIX101O(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$3(r0);
    }

    public static /* synthetic */ void X01IiOiIi(DeveloperUpgradeJSmaActivity r0) {
        updateUpgradeStatus$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$2(r0);
    }

    public static /* synthetic */ void XiOIii1(DeveloperUpgradeJSmaActivity r0) {
        upgradeDone$lambda$0(r0);
    }

    public static final /* synthetic */ boolean access$canOTA(DeveloperUpgradeJSmaActivity r0, OTAStatus r1) {
        return r0.canOTA(r1);
    }

    public static final /* synthetic */ void access$checkDownload(DeveloperUpgradeJSmaActivity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ String access$getDeviceAddress$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.deviceAddress;
    }

    public static final /* synthetic */ int access$getLastPackageSize$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.lastPackageSize;
    }

    public static final /* synthetic */ int access$getMDownloaded$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestBrand$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestBrand;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestDial$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestDial;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFirmware$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestFirmware;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFont$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestFont;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestLanguage$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestLanguage;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestUi$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLatestUi;
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ OTAManager access$getMOTAManager$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mOTAManager;
    }

    public static final /* synthetic */ OTAStatus access$getMOTAStatus$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mOTAStatus;
    }

    public static final /* synthetic */ List access$getMSteps$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mSteps;
    }

    public static final /* synthetic */ int access$getMStepsIndex$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.mStepsIndex;
    }

    public static final /* synthetic */ ProgressButton access$getProgressButton(DeveloperUpgradeJSmaActivity r0) {
        return r0.getProgressButton();
    }

    public static final /* synthetic */ long access$getStartTime$p(DeveloperUpgradeJSmaActivity r2) {
        return r2.startTime;
    }

    public static final /* synthetic */ String access$getTAG$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ long access$getTime1$p(DeveloperUpgradeJSmaActivity r2) {
        return r2.time1;
    }

    public static final /* synthetic */ TextView access$getTvSpeed(DeveloperUpgradeJSmaActivity r0) {
        return r0.getTvSpeed();
    }

    public static final /* synthetic */ TextView access$getTvStep(DeveloperUpgradeJSmaActivity r0) {
        return r0.getTvStep();
    }

    public static final /* synthetic */ Runnable access$getUpgradeRunnable$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.upgradeRunnable;
    }

    public static final /* synthetic */ boolean access$isStartShutdown$p(DeveloperUpgradeJSmaActivity r0) {
        return r0.isStartShutdown;
    }

    public static final /* synthetic */ void access$setLastPackageSize$p(DeveloperUpgradeJSmaActivity r0, int r1) {
        r0.lastPackageSize = r1;
    }

    public static final /* synthetic */ void access$setMDownloaded$p(DeveloperUpgradeJSmaActivity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$setMOTAStatus$p(DeveloperUpgradeJSmaActivity r0, OTAStatus r1) {
        r0.mOTAStatus = r1;
    }

    public static final /* synthetic */ void access$setMStarted(DeveloperUpgradeJSmaActivity r0, boolean r1) {
        r0.setMStarted(r1);
    }

    public static final /* synthetic */ void access$setMStepsIndex$p(DeveloperUpgradeJSmaActivity r0, int r1) {
        r0.mStepsIndex = r1;
    }

    public static final /* synthetic */ void access$setStartTime$p(DeveloperUpgradeJSmaActivity r0, long r1) {
        r0.startTime = r1;
    }

    public static final /* synthetic */ void access$setTime1$p(DeveloperUpgradeJSmaActivity r0, long r1) {
        r0.time1 = r1;
    }

    public static final /* synthetic */ void access$setUseDfuAddress$p(DeveloperUpgradeJSmaActivity r0, boolean r1) {
        r0.isUseDfuAddress = r1;
    }

    public static final /* synthetic */ void access$updateUpgradeStatus(DeveloperUpgradeJSmaActivity r0, OTAStatus r1) {
        r0.updateUpgradeStatus(r1);
    }

    public static final /* synthetic */ void access$upgradeDone(DeveloperUpgradeJSmaActivity r0) {
        r0.upgradeDone();
    }

    public static final /* synthetic */ void access$upgradeExit(DeveloperUpgradeJSmaActivity r0) {
        r0.upgradeExit();
    }

    private final boolean canOTA(OTAStatus r2) {
        if (isOTAError(r2) == false) goto L5;
        return false;
    L5:
        if (r2 == OTAStatus.UPGRADE_STOP) goto L10;
        return true;
    L10:
        return false;
    }

    private final void checkDownload() {
        if (this.mDownloaded != this.mSteps.size()) goto L6;
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        upgrade();
        return;
    }

    private final void connectDevice(String r4) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " connectDevice: " + r4);
        BluetoothHelper r0 = this.mBluetoothHelper;
        if (r0 == null) goto L10;
        BluetoothAdapter r1 = BluetoothAdapter.getDefaultAdapter();
        if (r1 == null) goto L7;
        BluetoothDevice r5 = r1.getRemoteDevice(r4);
    L8:
        r0.connectDevice(r5);
        return;
    L7:
        r5 = null;
        goto L8
    }

    private final void destroyOTA() {
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L5;
        r0.unregisterBluetoothCallback(this.mOTAEventCallback);
    L5:
        OTAManager r1 = this.mOTAManager;
        if (r1 == null) goto L8;
        r1.release();
    L8:
        this.mOTAManager = null;
        BluetoothHelper r2 = this.mBluetoothHelper;
        if (r2 == null) goto L11;
        r2.removeBluetoothEventListener(this.mBtEventListener);
    L11:
        BluetoothHelper r3 = this.mBluetoothHelper;
        if (r3 == null) goto L14;
        r3.destroy();
    L14:
        this.mBluetoothHelper = null;
    }

    public static /* synthetic */ void i010I(DeveloperUpgradeJSmaActivity r0) {
        upgradeDone$lambda$1(r0);
    }

    public static /* synthetic */ void iOOX010X(DeveloperUpgradeJSmaActivity r0) {
        upgrade$lambda$5(r0);
    }

    private final void initOTA() {
        BluetoothHelper r0 = BluetoothHelper.getInstance(Utils.getApp());
        this.mBluetoothHelper = r0;
        if (r0 == null) goto L5;
        r0.addBluetoothEventListener(this.mBtEventListener);
    L5:
        OTAManager r1 = new OTAManager(this);
        this.mOTAManager = r1;
        r1.registerBluetoothCallback(this.mOTAEventCallback);
    }

    private final boolean isOTAError(OTAStatus r3) {
        int r4 = OXO1.XIi00iiXO[r3.ordinal()];
        if (r4 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r4 == 2) goto L10;
        if (r4 == 3) goto L10;
        return false;
    }

    private final void updateUpgradeStatus(OTAStatus r5) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " updateUpgradeStatus status = " + r5 + ", autoRetryCount = " + this.autoRetryCount);
        this.mOTAStatus = r5;
        if (isOTAError(r5) == false) goto L10;
        int r6 = this.autoRetryCount;
        if (r6 >= 1) goto L8;
        r0.OXO1(this.TAG + " wait to retry Upgrade -> autoRetryCount = " + r6);
        new Handler().postDelayed(new iI10i1IX(this), 5000);
        return;
    L8:
        this.autoRetryCount = 0;
        setMStarted(false);
        ProgressButton.O00(getProgressButton(), R.string.firmware_upgrading_failed, false, 2, null);
        finish();
        return;
    L10:
        setMStarted(true);
    }

    private static final void updateUpgradeStatus$lambda$0(DeveloperUpgradeJSmaActivity r4) {
        r4.autoRetryCount++;
        if (r4.isOTAError(r4.mOTAStatus) == false) goto L10;
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(r4.TAG + " retry Upgrade -> autoRetryCount = " + r4.autoRetryCount);
        r4.destroyOTA();
        r4.initOTA();
        if (r4.isUseDfuAddress == false) goto L7;
        r0.OXO1(r4.TAG + " upgrade -> use dfuAddress");
        r4.connectDevice(r4.deviceOTAAddress);
    L8:
        r4.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        return;
    L7:
        r0.OXO1(r4.TAG + " upgrade -> use bleAddress");
        String r1 = r4.deviceAddress;
        Intrinsics.O10IXXX0X(r1, "deviceAddress");
        r4.connectDevice(r1);
        goto L8
    }

    private final void upgrade() {
        this.startTime = System.currentTimeMillis();
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())}));
        switch(OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()]) {
            case 1: goto L42;
            case 2: goto L36;
            case 3: goto L30;
            case 4: goto L24;
            case 5: goto L18;
            case 6: goto L12;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        i1O0OXO1O.OXO1.OXO1("DIAL_PACK");
        jlDestory();
        BleConnector r4 = BleConnector.INSTANCE;
        if (r4.isAvailable() == false) goto L10;
        BleKey r5 = BleKey.FAT_BIN_FILE;
        File r0 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r1 = this.mLatestDial;
        Intrinsics.XXI(r1);
        BaseBleConnector.sendStream$default(r4, r5, new File(r0, r1.getFileName()), 0, 4, null);
        return;
    L10:
        new Handler().postDelayed(new iOIIXI0II(this), 4000);
        return;
    L12:
        i1O0OXO1O.OXO1.OXO1("OTA_PACK");
        jlDestory();
        BleConnector r6 = BleConnector.INSTANCE;
        if (r6.isAvailable() == false) goto L16;
        BleKey r7 = BleKey.OTA_FILE;
        File r2 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r3 = this.mLatestFirmware;
        Intrinsics.XXI(r3);
        BaseBleConnector.sendStream$default(r6, r7, new File(r2, r3.getFileName()), 0, 4, null);
        return;
    L16:
        new Handler().postDelayed(new I1O01X1(this), 4000);
        return;
    L18:
        i1O0OXO1O.OXO1.OXO1("BRAND_PACK");
        jlDestory();
        BleConnector r8 = BleConnector.INSTANCE;
        if (r8.isAvailable() == false) goto L22;
        BleKey r9 = BleKey.BRAND_INFO_FILE;
        File r10 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r11 = this.mLatestBrand;
        Intrinsics.XXI(r11);
        BaseBleConnector.sendStream$default(r8, r9, new File(r10, r11.getFileName()), 0, 4, null);
        return;
    L22:
        new Handler().postDelayed(new OXOO(this), 4000);
        return;
    L24:
        i1O0OXO1O.OXO1.OXO1("FONT_PACK");
        jlDestory();
        BleConnector r12 = BleConnector.INSTANCE;
        if (r12.isAvailable() == false) goto L28;
        BleKey r13 = BleKey.FONT_FILE;
        File r14 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r15 = this.mLatestFont;
        Intrinsics.XXI(r15);
        BaseBleConnector.sendStream$default(r12, r13, new File(r14, r15.getFileName()), 0, 4, null);
        return;
    L28:
        new Handler().postDelayed(new I0Ii1XOO0(this), 4000);
        return;
    L30:
        i1O0OXO1O.OXO1.OXO1("LANGUAGE_PACK");
        jlDestory();
        BleConnector r16 = BleConnector.INSTANCE;
        if (r16.isAvailable() == false) goto L34;
        BleKey r17 = BleKey.LANGUAGE_FILE;
        File r18 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r19 = this.mLatestLanguage;
        Intrinsics.XXI(r19);
        BaseBleConnector.sendStream$default(r16, r17, new File(r18, r19.getFileName()), 0, 4, null);
        return;
    L34:
        new Handler().postDelayed(new I001OO0X(this), 4000);
        return;
    L36:
        i1O0OXO1O.OXO1.OXO1("UI_PACK");
        jlDestory();
        BleConnector r20 = BleConnector.INSTANCE;
        if (r20.isAvailable() == false) goto L40;
        BleKey r21 = BleKey.UI_FILE;
        File r22 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r23 = this.mLatestUi;
        Intrinsics.XXI(r23);
        BaseBleConnector.sendStream$default(r20, r21, new File(r22, r23.getFileName()), 0, 4, null);
        return;
    L40:
        new Handler().postDelayed(new O111OiI(this), 4000);
        return;
    L42:
        i1O0OXO1O r24 = i1O0OXO1O.OXO1;
        r24.OXO1("FIRMWARE");
        destroyOTA();
        initOTA();
        if (this.isUseDfuAddress == false) goto L45;
        r24.OXO1(this.TAG + " upgrade -> use dfuAddress");
        connectDevice(this.deviceOTAAddress);
    L46:
        updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        return;
    L45:
        r24.OXO1(this.TAG + " upgrade -> use bleAddress");
        String r25 = this.deviceAddress;
        Intrinsics.O10IXXX0X(r25, "deviceAddress");
        connectDevice(r25);
        goto L46
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final void upgrade$lambda$0(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$1(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$2(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$3(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$4(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private static final void upgrade$lambda$5(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private final void upgradeDone() {
        if (this.isRepairMode != 1) goto L7;
        finish();
        return;
    L7:
        if (this.isAutoShutdown == false) goto L20;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " start shutdown");
        if (this.mLoadingPopup != null) goto L11;
        this.mLoadingPopup = new uq(getMContext());
    L11:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L14;
        r0.IIX1OXO();
    L14:
        new Handler().postDelayed(new II0i1O0X(this), V2.h);
        this.isStartShutdown = true;
        BleConnector r5 = BleConnector.INSTANCE;
        if (r5.isAvailable() == false) goto L18;
        BaseBleConnector.sendInt8$default(r5, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return;
    L18:
        new Handler().postDelayed(new OII1XX1(this), 10000);
        return;
    L20:
        upgradeExit();
    }

    private static final void upgradeDone$lambda$0(DeveloperUpgradeJSmaActivity r3) {
        uq r0 = r3.mLoadingPopup;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isShowing() != true) goto L12;
        uq r1 = r3.mLoadingPopup;
        if (r1 == null) goto L9;
        r1.dismiss();
    L9:
        i1O0OXO1O.OXO1.OXO1(r3.TAG + " shutdown time out force exit!");
        r3.upgradeExit();
        return;
    }

    private static final void upgradeDone$lambda$1(DeveloperUpgradeJSmaActivity r2) {
        BleConnector r0 = BleConnector.INSTANCE;
        String r3 = r2.deviceAddress;
        Intrinsics.O10IXXX0X(r3, "deviceAddress");
        r0.setAddress(r3).connect(true);
    }

    private final void upgradeExit() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " ota => upgradeExit");
        XO0O10().add(this.deviceAddress);
        a01.OXO1.XIi00iiXO().put(OIOO0X00O.class.getName(), new Gson().toJson(this.alreadyUpdateDeviceList));
        finish();
    }

    private static final void upgradeRunnable$lambda$0(DeveloperUpgradeJSmaActivity r0) {
        r0.upgrade();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        this.isRepairMode = getMArg1();
        BleConnector r3 = BleConnector.INSTANCE;
        r3.addHandleCallback(this.mBleHandleCallback);
        r3.setNeedBind(false);
        sc.XIi00iiXO(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        FirmwareVersion r1 = this.mLatestFirmware;
        int r3 = 1;
        if (r1 == null) goto L5;
    L15:
        if (r1 == null) goto L18;
        String r2 = r1.getVersion();
        if (r2 == null) goto L18;
    L19:
        FirmwareVersion r7 = this.mLatestUi;
        if (r7 == null) goto L25;
        String r8 = r7.getVersion();
        if (r8 == null) goto L25;
    L26:
        String r9 = oe5.IXO0OOi(r8, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r10 = this.mLatestLanguage;
        if (r10 == null) goto L32;
        String r11 = r10.getVersion();
        if (r11 == null) goto L32;
    L33:
        String r12 = oe5.IXO0OOi(r11, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r13 = this.mLatestBrand;
        if (r13 == null) goto L39;
        String r14 = r13.getVersion();
        if (r14 == null) goto L39;
    L40:
        String r15 = oe5.IXO0OOi(r14, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r16 = this.mLatestFont;
        if (r16 == null) goto L46;
        String r17 = r16.getVersion();
        if (r17 == null) goto L46;
        String r18 = r17;
    L47:
        String r4 = oe5.IXO0OOi(r18, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r2 + FileUtils.FILE_EXTENSION_SEPARATOR + r9 + r12 + r15 + r4}));
        String r5 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r6 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + r5 + r6}));
        if (this.mLatestFirmware == null) goto L54;
        if (this.isSupportOTAFile == false) goto L52;
        this.mSteps.add(FileType.OTA_PACK);
        goto L54
    L52:
        this.mSteps.add(FileType.FIRMWARE);
    L54:
        if (this.isRepairMode != 1) goto L56;
    L70:
        getTvStep().setVisibility(0);
    L71:
        getDevInfo().setVisibility(0);
        TextView r19 = getTvAlreadyOta();
        SPUtils r20 = a01.OXO1.XIi00iiXO();
        Object r21 = new OIOO0X00O(null, r3, 0 == true ? 1 : 0);
        Object r22 = new Gson().fromJson(r20.getString(OIOO0X00O.class.getName()), OIOO0X00O.class);
        if (r22 == null) goto L75;
        r21 = r22;
    L75:
        r19.setText(String.valueOf(((OIOO0X00O) r21).XO0O10().size()));
        getTvInfo().setText("Jsma " + this.deviceAddress + ", Mode:" + this.isRepairMode + ", " + this.isSupportOTAFile);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " ota => deviceAddress:" + this.deviceAddress + " deviceOTAAddress:" + this.deviceOTAAddress + ", mSteps:" + this.mSteps);
        onBottomClick(getTvStep());
        return;
    L56:
        if (this.mLatestLanguage == null) goto L59;
        this.mSteps.add(FileType.LANGUAGE_PACK);
    L59:
        if (this.mLatestUi == null) goto L62;
        this.mSteps.add(FileType.UI_PACK);
    L62:
        if (this.mLatestFont == null) goto L65;
        this.mSteps.add(FileType.FONT_PACK);
    L65:
        if (this.mLatestDial == null) goto L68;
        this.mSteps.add(FileType.DIAL_PACK);
    L68:
        if (this.mLatestBrand == null) goto L70;
        this.mSteps.add(FileType.BRAND_PACK);
    L46:
        r18 = "000";
    L39:
        r14 = "0.0.0";
    L32:
        r11 = this.mCurrentLanguage;
    L25:
        r8 = this.mCurrentUi;
    L18:
        r2 = this.mCurrentFirmware;
        goto L19
    L5:
        if (this.mLatestUi != null) goto L15;
        if (this.mLatestLanguage != null) goto L15;
        if (this.mLatestBrand != null) goto L15;
        if (this.mLatestFont != null) goto L15;
        if (this.mLatestDial != null) goto L15;
        String r23 = this.mCurrentFirmware;
        String r24 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r25 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r23 + FileUtils.FILE_EXTENSION_SEPARATOR + r24 + r25 + "000"}));
        ViewParent r26 = getTvCurrent().getParent();
        Intrinsics.X1ii(r26, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r26).setVisibility(8);
        getProgressButton().setVisibility(8);
        goto L71
    }

    public final void jlDestory() {
        destroyOTA();
    }

    public final void onBottomClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        BleConnector.INSTANCE.unbind();
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) goto L23;
        FirmwareVersion r6 = this.mLatestFirmware;
        if (r6 == null) goto L7;
        NetWorkUtils.INSTANCE.download(r6.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new AnonymousClass1(this));
    L7:
        FirmwareVersion r7 = this.mLatestUi;
        if (r7 == null) goto L10;
        NetWorkUtils.INSTANCE.download(r7.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestUi.getFileName(), new AnonymousClass2(this));
    L10:
        FirmwareVersion r8 = this.mLatestLanguage;
        if (r8 == null) goto L13;
        NetWorkUtils.INSTANCE.download(r8.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestLanguage.getFileName(), new AnonymousClass3(this));
    L13:
        FirmwareVersion r9 = this.mLatestBrand;
        if (r9 == null) goto L16;
        NetWorkUtils.INSTANCE.download(r9.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestBrand.getFileName(), new AnonymousClass4(this));
    L16:
        FirmwareVersion r10 = this.mLatestFont;
        if (r10 == null) goto L19;
        NetWorkUtils.INSTANCE.download(r10.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFont.getFileName(), new AnonymousClass5(this));
    L19:
        FirmwareVersion r11 = this.mLatestDial;
        if (r11 == null) goto L25;
        NetWorkUtils.INSTANCE.download(r11.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestDial.getFileName(), new AnonymousClass6(this));
        return;
    L25:
        return;
    L23:
        upgrade();
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.removeHandleCallback(this.mBleHandleCallback);
        if (this.mSteps.isEmpty() == false) goto L5;
    L7:
        r0.setNeedBind(true);
        jlDestory();
        super.onDestroy();
        return;
    L5:
        if (this.mStepsIndex != CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) goto L7;
        BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.UI_FILE, null, 2, null);
        r0.closeConnection(true);
        goto L7
    }

    public final void startOTA(@aa1 String r4) {
        Intrinsics.X0O(r4, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA :: " + r4);
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L7;
        BluetoothOTAConfigure r1 = r0.getBluetoothOption();
        if (r1 == null) goto L7;
        r1.setFirmwareFilePath(r4);
    L7:
        OTAManager r5 = this.mOTAManager;
        if (r5 == null) goto L11;
        r5.startOTA(new O00(this));
        return;
    }
}
