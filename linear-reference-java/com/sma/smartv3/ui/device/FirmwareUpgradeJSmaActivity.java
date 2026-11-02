package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0O01O0i;
import com.android.mltcode.paycertificationapi.I0XIOX;
import com.android.mltcode.paycertificationapi.I0i0i0Ii;
import com.android.mltcode.paycertificationapi.IOiO1IIIi;
import com.android.mltcode.paycertificationapi.IXXiiO100;
import com.android.mltcode.paycertificationapi.O1I11Ii;
import com.android.mltcode.paycertificationapi.O1XXXIO;
import com.android.mltcode.paycertificationapi.OIOI1ii0X;
import com.android.mltcode.paycertificationapi.OO0iO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.X0IiO00;
import com.android.mltcode.paycertificationapi.XXXiX;
import com.android.mltcode.paycertificationapi.XiiIiI01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i01i0X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.ironsource.Y5;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_rcsp.impl.NetworkOpImpl;
import com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback;
import com.jieli.jl_rcsp.model.network.OTAParam;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.jieli.watchtesttool.tool.watch.WatchManager;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareUpgradeJSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,826:1\n15#2:827\n15#2:828\n1#3:829\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity\n*L\n225#1:827\n226#1:828\n*E\n"})
public final class FirmwareUpgradeJSmaActivity extends BaseFirmwareUpgradeActivity {

    @aa1
    private final String TAG;
    private boolean isReconnect;
    private boolean isUpgradeDoneOTAFile;
    private boolean isUseDfuAddress;

    @aa1
    private XIi00iiXO mBleHandleCallback;

    @tb1
    private BluetoothHelper mBluetoothHelper;

    @aa1
    private final iO mBtEventListener;

    @aa1
    private final String mCurrentFirmware;

    @aa1
    private final String mCurrentGps;

    @aa1
    private final String mCurrentLanguage;

    @aa1
    private final String mCurrentNetwork;

    @aa1
    private final String mCurrentUi;
    private int mDownloaded;

    @tb1
    private final ExtraPackVersions mLatestExtraPacks;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @tb1
    private final FirmwareVersion mLatestFont;

    @tb1
    private FirmwareVersion mLatestGpsFirmware;

    @tb1
    private final FirmwareVersion mLatestLanguage;

    @tb1
    private FirmwareVersion mLatestNetworkFirmware;

    @tb1
    private final FirmwareVersion mLatestUi;

    @tb1
    private NetworkOpImpl mNetworkOp;

    @aa1
    private final BtEventCallback mOTAEventCallback;

    @tb1
    private OTAManager mOTAManager;

    @aa1
    private OTAStatus mOTAStatus;

    @tb1
    private go0 mOtaFailedPopup;
    private int mReconnectCount;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;

    @tb1
    private WatchManager mWatchManager;

    public static final enum FileType extends Enum<FileType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ FileType[] $VALUES = null;
        public static final FileType FIRMWARE = null;
        public static final FileType FONT_PACK = null;
        public static final FileType GPS_FIRMWARE = null;
        public static final FileType LANGUAGE_PACK = null;
        public static final FileType NETWORK_FIRMWARE = null;
        public static final FileType OTA_PACK = null;
        public static final FileType UI_PACK = null;

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{FIRMWARE, UI_PACK, LANGUAGE_PACK, FONT_PACK, OTA_PACK, GPS_FIRMWARE, NETWORK_FIRMWARE};
        }

        static {
            FIRMWARE = new FileType("FIRMWARE", 0);
            UI_PACK = new FileType("UI_PACK", 1);
            LANGUAGE_PACK = new FileType("LANGUAGE_PACK", 2);
            FONT_PACK = new FileType("FONT_PACK", 3);
            OTA_PACK = new FileType("OTA_PACK", 4);
            GPS_FIRMWARE = new FileType("GPS_FIRMWARE", 5);
            NETWORK_FIRMWARE = new FileType("NETWORK_FIRMWARE", 6);
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

    public static final class IiI10X implements IUpgradeCallback {
        public final /* synthetic */ FirmwareUpgradeJSmaActivity OXO1;

        public IiI10X(FirmwareUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeJSmaActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(FirmwareUpgradeJSmaActivity r0) {
            FirmwareUpgradeJSmaActivity.access$upgrade(r0);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota cancel");
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED, "ota cancel");
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError r7) {
            Intrinsics.X0O(r7, "p0");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota onError -> status = " + FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) + ", error = " + r7);
            ToastUtils.showLong(r7.getMessage(), new Object[0]);
            FirmwareUpgradeJSmaActivity r0 = this.OXO1;
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(r0, OTAStatus.UPGRADE_FAILED, "status = " + FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(r0) + ", error = " + r7);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String r4, boolean r5) {
            Intrinsics.X0O(r4, "addr");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota onNeedReconnect -> " + r4 + ", " + r5);
            FirmwareUpgradeJSmaActivity.access$setUseDfuAddress$p(this.OXO1, true);
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int r4, float r5) {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota p -> " + r4 + ", " + r5);
            if (r4 != 0) goto L6;
            FirmwareUpgradeJSmaActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADE_CHECKING);
            ProgressButton r6 = this.OXO1.getProgressButton();
            String r1 = this.OXO1.getString(R.string.check_file);
            Intrinsics.O10IXXX0X(r1, "getString(...)");
            r6.XIi00iiXO(r1, Math.round(r5) / 100.0f);
            return;
        L6:
            FirmwareUpgradeJSmaActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADEING);
            this.OXO1.getProgressButton().setProgress(Math.round(r5) / 100.0f);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota start");
            this.OXO1.setUpgradeDoneOTAFile(false);
            FirmwareUpgradeJSmaActivity.updateUpgradeStatus$default(this.OXO1, OTAStatus.UPGRADE_START, null, 2, null);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota stop! upgrade is ok");
            FirmwareUpgradeJSmaActivity.updateUpgradeStatus$default(this.OXO1, OTAStatus.UPGRADE_STOP, null, 2, null);
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
            this.OXO1.getProgressButton().setProgress(1.0f);
            if (FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) >= CollectionsKt__CollectionsKt.X11iII1O1(FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.OXO1))) goto L6;
            this.OXO1.getProgressButton().setProgress(0.0f);
            FirmwareUpgradeJSmaActivity.access$setMStepsIndex$p(this.OXO1, FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) + 1);
            TextView r0 = this.OXO1.getTvStep();
            final FirmwareUpgradeJSmaActivity r1 = this.OXO1;
            r0.postDelayed(new I0O01O0i(r1), 2000);
            return;
        L6:
            this.OXO1.upgradeDone();
        }
    }

    public static final class O00 implements OnNetworkOTACallback {
        public final /* synthetic */ FirmwareUpgradeJSmaActivity OXO1;

        public O00(FirmwareUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeJSmaActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(FirmwareUpgradeJSmaActivity r0) {
            FirmwareUpgradeJSmaActivity.access$upgrade(r0);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback
        public void onCancel() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " NetworkOTA onCancel");
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED, "NetworkOTA onCancel");
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback
        public void onError(int r6, String r7) {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " NetworkOTA onError -> error = " + r6 + ", " + r7);
            ToastUtils.showLong(r7, new Object[0]);
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED, "error = " + r6 + ", " + r7);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback
        public void onProgress(int r4) {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " NetworkOTA p -> " + r4);
            FirmwareUpgradeJSmaActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADEING);
            this.OXO1.getProgressButton().setProgress(((float) r4) / 100.0f);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback
        public void onStart() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " NetworkOTA start");
            FirmwareUpgradeJSmaActivity.updateUpgradeStatus$default(this.OXO1, OTAStatus.UPGRADE_START, null, 2, null);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback
        public void onStop() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " NetworkOTA onStop upgrade ok");
            FirmwareUpgradeJSmaActivity.updateUpgradeStatus$default(this.OXO1, OTAStatus.UPGRADE_STOP, null, 2, null);
            this.OXO1.setMStarted(true);
            this.OXO1.getProgressButton().setProgress(1.0f);
            if (FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) >= CollectionsKt__CollectionsKt.X11iII1O1(FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.OXO1))) goto L6;
            this.OXO1.getProgressButton().setProgress(0.0f);
            FirmwareUpgradeJSmaActivity.access$setMStepsIndex$p(this.OXO1, FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1) + 1);
            TextView r0 = this.OXO1.getTvStep();
            final FirmwareUpgradeJSmaActivity r1 = this.OXO1;
            r0.postDelayed(new O1I11Ii(r1), 3000);
            return;
        L6:
            this.OXO1.upgradeDone();
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
            r0[FileType.OTA_PACK.ordinal()] = 5;     // Catch: NoSuchFieldError -> L22
        L28:
            r0[FileType.GPS_FIRMWARE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L23
        L38:
            r0[FileType.NETWORK_FIRMWARE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L24
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
        public final /* synthetic */ FirmwareUpgradeJSmaActivity IO;

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
                r0[FileType.OTA_PACK.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
            L23:
                r0[FileType.GPS_FIRMWARE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
            L17:
                r0[FileType.NETWORK_FIRMWARE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
            L9:
                OXO1 = r0;
            }
        }

        public XIi00iiXO(FirmwareUpgradeJSmaActivity r1) {
            this.IO = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeJSmaActivity r0) {
            XO0O10(r0);
        }

        public static /* synthetic */ void XIi00iiXO(FirmwareUpgradeJSmaActivity r0) {
            iO(r0);
        }

        public static final void XO0O10(FirmwareUpgradeJSmaActivity r0) {
            FirmwareUpgradeJSmaActivity.access$upgrade(r0);
        }

        public static final void iO(FirmwareUpgradeJSmaActivity r6) {
            BleConnector r0 = BleConnector.INSTANCE;
            BleKey r1 = BleKey.UI_FILE;
            File r3 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r7 = FirmwareUpgradeJSmaActivity.access$getMLatestUi$p(r6);
            Intrinsics.XXI(r7);
            BaseBleConnector.sendStream$default(r0, r1, new File(r3, r7.getFileName()), 0, 4, null);
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
        public /* bridge */ void onCommandReply(BleKey r1, BleKeyFlag r2, boolean r3) {
            super.onCommandReply(r1, r2, r3);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey r4, BleKeyFlag r5) {
            Intrinsics.X0O(r4, "bleKey");
            Intrinsics.X0O(r5, "bleKeyFlag");
            if (r4 != BleKey.UI_FILE) goto L5;
        L12:
            this.IO.setMStarted(false);
            ProgressButton.IiI10X(this.IO.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
            return;
        L5:
            if (r4 == BleKey.LANGUAGE_FILE) goto L12;
            if (r4 == BleKey.OTA_FILE) goto L12;
            if (r4 == BleKey.GPS_FIRMWARE_VERSION) goto L12;
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
        public /* bridge */ void onDeviceConnected(BluetoothDevice r1) {
            super.onDeviceConnected(r1);
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
        public void onSessionStateChange(boolean r11) {
            if (r11 == false) goto L18;
            FileType r12 = (FileType) FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.IO).get(FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO));
            switch(OXO1.OXO1[r12.ordinal()]) {
                case 1: goto L16;
                case 2: goto L14;
                case 3: goto L12;
                case 4: goto L10;
                case 5: goto L8;
                case 6: goto L6;
                default: goto L19;
            };
        L6:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            FirmwareUpgradeJSmaActivity.access$connectDevice(this.IO, BleCache.INSTANCE.getMBleAddress());
            return;
        L8:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            BleConnector r4 = BleConnector.INSTANCE;
            BleKey r5 = BleKey.GPS_FIRMWARE_FILE;
            File r13 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r0 = FirmwareUpgradeJSmaActivity.access$getMLatestGpsFirmware$p(this.IO);
            Intrinsics.XXI(r0);
            BaseBleConnector.sendStream$default(r4, r5, new File(r13, r0.getFileName()), 0, 4, null);
            return;
        L10:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            BleConnector r6 = BleConnector.INSTANCE;
            BleKey r7 = BleKey.OTA_FILE;
            File r14 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r1 = FirmwareUpgradeJSmaActivity.access$getMLatestFirmware$p(this.IO);
            Intrinsics.XXI(r1);
            BaseBleConnector.sendStream$default(r6, r7, new File(r14, r1.getFileName()), 0, 4, null);
            return;
        L12:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            BleConnector r8 = BleConnector.INSTANCE;
            BleKey r9 = BleKey.FONT_FILE;
            File r15 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r2 = FirmwareUpgradeJSmaActivity.access$getMLatestFont$p(this.IO);
            Intrinsics.XXI(r2);
            BaseBleConnector.sendStream$default(r8, r9, new File(r15, r2.getFileName()), 0, 4, null);
            return;
        L14:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            BleConnector r10 = BleConnector.INSTANCE;
            BleKey r16 = BleKey.LANGUAGE_FILE;
            File r17 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r3 = FirmwareUpgradeJSmaActivity.access$getMLatestLanguage$p(this.IO);
            Intrinsics.XXI(r3);
            BaseBleConnector.sendStream$default(r10, r16, new File(r17, r3.getFileName()), 0, 4, null);
            return;
        L16:
            ProgressButton.O00(this.IO.getProgressButton(), R.string.Parsing, false, 2, null);
            Handler r18 = new Handler();
            final FirmwareUpgradeJSmaActivity r19 = this.IO;
            r18.postDelayed(new OO0iO(r19), 12000);
            return;
        L19:
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
        public void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            Intrinsics.X0O(r5, "bleKey");
            if (r1 == false) goto L12;
            this.IO.getProgressButton().setProgressDecimalPlaces(r4 / r3);
            if (r3 == r4) goto L7;
            return;
        L7:
            if (FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO) >= CollectionsKt__CollectionsKt.X11iII1O1(FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.IO))) goto L10;
            this.IO.getProgressButton().setProgress(0.0f);
            FirmwareUpgradeJSmaActivity.access$setMStepsIndex$p(this.IO, FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.IO) + 1);
            TextView r6 = this.IO.getTvStep();
            final FirmwareUpgradeJSmaActivity r7 = this.IO;
            r6.postDelayed(new OIOI1ii0X(r7), 2000);
            return;
        L10:
            this.IO.upgradeDone();
            return;
        L12:
            this.IO.setMStarted(false);
            if (this.IO.isUpgradeDoneOTAFile() == true) goto L17;
            ProgressButton.IiI10X(this.IO.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
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
        public final /* synthetic */ FirmwareUpgradeJSmaActivity OXO1;

        public XO0O10(FirmwareUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
        public void onConnection(BluetoothDevice r7, int r8) {
            Intrinsics.X0O(r7, "device");
            if (r8 != 1) goto L5;
            this.OXO1.setReconnect(false);
            this.OXO1.setMReconnectCount(-1);
        L11:
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r2 = FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1);
            OTAStatus r3 = FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r4 = FirmwareUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            if (r4 == null) goto L14;
            Boolean r5 = Boolean.valueOf(r4.isOTA());
        L15:
            r0.XIi00iiXO(r2 + " ota onConnection -> mOTAStatus = " + r3 + ", " + r7 + " ,status = " + r8 + " ,isOTA = " + r5);
            if (FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.OXO1).get(FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1)) != FileType.FIRMWARE) goto L30;
            OTAManager r9 = FirmwareUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            Intrinsics.XXI(r9);
            if (r9.isOTA() == true) goto L31;
            if (r8 == 0) goto L26;
            if (r8 != 1) goto L34;
            FirmwareUpgradeJSmaActivity r10 = this.OXO1;
            if (FirmwareUpgradeJSmaActivity.access$canOTA(r10, FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(r10)) == false) goto L32;
            FirmwareUpgradeJSmaActivity r11 = this.OXO1;
            File r1 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r6 = FirmwareUpgradeJSmaActivity.access$getMLatestFirmware$p(this.OXO1);
            Intrinsics.XXI(r6);
            String r12 = new File(r1, r6.getFileName()).getAbsolutePath();
            Intrinsics.O10IXXX0X(r12, "getAbsolutePath(...)");
            r11.startOTA(r12);
            return;
        L32:
            return;
        L34:
            return;
        L26:
            r0.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " ota onConnection -> device disconnected");
            if (FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L33;
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED, "device disconnected");
            return;
        L33:
            return;
        L31:
            return;
        L30:
            return;
        L14:
            r5 = null;
            goto L15
        L5:
            if (r8 != 3) goto L11;
            if (this.OXO1.getMReconnectCount() == (-1)) goto L11;
            this.OXO1.setReconnect(true);
            goto L11
        }
    }

    public static final class iO extends BluetoothEventListener {
        public final /* synthetic */ FirmwareUpgradeJSmaActivity OXO1;

        public iO(FirmwareUpgradeJSmaActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeJSmaActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(FirmwareUpgradeJSmaActivity r3) {
            File r1 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r2 = FirmwareUpgradeJSmaActivity.access$getMLatestNetworkFirmware$p(r3);
            Intrinsics.XXI(r2);
            String r0 = new File(r1, r2.getFileName()).getAbsolutePath();
            Intrinsics.O10IXXX0X(r0, "getAbsolutePath(...)");
            r3.startNetworkOTA(r0);
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean r3) {
            LogUtils.d(new Object[]{FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onAdapterStatus -> " + r3});
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice r7, int r8) {
            Intrinsics.X0O(r7, "device");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1);
            OTAStatus r2 = FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r3 = FirmwareUpgradeJSmaActivity.access$getMOTAManager$p(this.OXO1);
            Boolean r4 = null;
            if (r3 == null) goto L5;
            Boolean r5 = Boolean.valueOf(r3.isOTA());
        L6:
            NetworkOpImpl r6 = FirmwareUpgradeJSmaActivity.access$getMNetworkOp$p(this.OXO1);
            if (r6 == null) goto L9;
            r4 = Boolean.valueOf(r6.isNetworkOTA());
        L9:
            r0.OXO1(r1 + " bt onConnection -> mOTAStatus = " + r2 + ", " + r7 + ", status = " + r8 + ", isOTA = " + r5 + ",  isNetworkOTA = " + r4);
            if (FirmwareUpgradeJSmaActivity.access$getMSteps$p(this.OXO1).get(FirmwareUpgradeJSmaActivity.access$getMStepsIndex$p(this.OXO1)) != FileType.NETWORK_FIRMWARE) goto L25;
            if (r8 != 0) goto L13;
            r0.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onConnection -> network device disconnected");
            if (FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L32;
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED, "network device disconnected");
            return;
        L32:
            return;
        L13:
            if (r8 != 2) goto L35;
            r0.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onConnection -> network device connected");
            NetworkOpImpl r9 = FirmwareUpgradeJSmaActivity.access$getMNetworkOp$p(this.OXO1);
            if (r9 != null) goto L18;
            return;
        L18:
            if (r9.isNetworkOTA() == true) goto L31;
            Handler r10 = new Handler();
            final FirmwareUpgradeJSmaActivity r11 = this.OXO1;
            r10.postDelayed(new XiiIiI01O(r11), 1000);
            return;
        L31:
            return;
        L35:
            return;
        L25:
            if (r8 != 0) goto L33;
            r0.OXO1(FirmwareUpgradeJSmaActivity.access$getTAG$p(this.OXO1) + " bt onConnection -> ota device disconnected");
            if (FirmwareUpgradeJSmaActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L34;
            FirmwareUpgradeJSmaActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED, "ota device disconnected");
            return;
        L34:
            return;
        L33:
            return;
        L5:
            r5 = null;
            goto L6
        }
    }

    public FirmwareUpgradeJSmaActivity() {
        this.TAG = "UpgradeJ";
        this.mOTAStatus = OTAStatus.NONE;
        this.mBtEventListener = new iO(this);
        this.mOTAEventCallback = new XO0O10(this);
        this.mBleHandleCallback = new XIi00iiXO(this);
        a01 r0 = a01.OXO1;
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r0.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions r1 = (ExtraPackVersions) new Gson().fromJson(r0.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = r1;
        FirmwareVersion r2 = null;
        if (r1 == null) goto L5;
        FirmwareVersion r3 = r1.getUiPackVersion();
    L6:
        this.mLatestUi = r3;
        if (r1 == null) goto L9;
        FirmwareVersion r4 = r1.getLanguagePackVersion();
    L10:
        this.mLatestLanguage = r4;
        if (r1 == null) goto L13;
        FirmwareVersion r5 = r1.getFontPackVersion();
    L14:
        this.mLatestFont = r5;
        if (r1 == null) goto L17;
        FirmwareVersion r6 = r1.getGpsFirmwareVersion();
    L18:
        this.mLatestGpsFirmware = r6;
        if (r1 == null) goto L21;
        r2 = r1.getNetworkFirmwareVersion();
    L21:
        this.mLatestNetworkFirmware = r2;
        BleCache r7 = BleCache.INSTANCE;
        this.mCurrentFirmware = BaseBleCache.getString$default(r7, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(r7, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(r7, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mCurrentGps = BaseBleCache.getString$default(r7, BleKey.GPS_FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentNetwork = BaseBleCache.getString$default(r7, BleKey.NETWORK_FIRMWARE_VERSION, null, null, 6, null);
        this.mSteps = new ArrayList();
        return;
    L17:
        r6 = null;
        goto L18
    L13:
        r5 = null;
        goto L14
    L9:
        r4 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    public static /* synthetic */ void I1() {
        upgrade$lambda$3();
    }

    public static /* synthetic */ void OII(FirmwareUpgradeJSmaActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ void OX() {
        upgrade$lambda$4();
    }

    public static /* synthetic */ void OiIIX101O(FirmwareUpgradeJSmaActivity r0) {
        updateUpgradeStatus$lambda$0(r0);
    }

    public static /* synthetic */ void X01IiOiIi() {
        upgrade$lambda$2();
    }

    public static /* synthetic */ void XX0() {
        upgrade$lambda$0();
    }

    public static /* synthetic */ void XiOIii1() {
        upgrade$lambda$1();
    }

    public static final /* synthetic */ boolean access$canOTA(FirmwareUpgradeJSmaActivity r0, OTAStatus r1) {
        return r0.canOTA(r1);
    }

    public static final /* synthetic */ void access$checkDownload(FirmwareUpgradeJSmaActivity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ void access$connectDevice(FirmwareUpgradeJSmaActivity r0, String r1) {
        r0.connectDevice(r1);
    }

    public static final /* synthetic */ int access$getMDownloaded$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFirmware$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestFirmware;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFont$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestFont;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestGpsFirmware$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestGpsFirmware;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestLanguage$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestLanguage;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestNetworkFirmware$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestNetworkFirmware;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestUi$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mLatestUi;
    }

    public static final /* synthetic */ NetworkOpImpl access$getMNetworkOp$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mNetworkOp;
    }

    public static final /* synthetic */ OTAManager access$getMOTAManager$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mOTAManager;
    }

    public static final /* synthetic */ OTAStatus access$getMOTAStatus$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mOTAStatus;
    }

    public static final /* synthetic */ List access$getMSteps$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mSteps;
    }

    public static final /* synthetic */ int access$getMStepsIndex$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.mStepsIndex;
    }

    public static final /* synthetic */ String access$getTAG$p(FirmwareUpgradeJSmaActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setMDownloaded$p(FirmwareUpgradeJSmaActivity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$setMOTAStatus$p(FirmwareUpgradeJSmaActivity r0, OTAStatus r1) {
        r0.mOTAStatus = r1;
    }

    public static final /* synthetic */ void access$setMStepsIndex$p(FirmwareUpgradeJSmaActivity r0, int r1) {
        r0.mStepsIndex = r1;
    }

    public static final /* synthetic */ void access$setUseDfuAddress$p(FirmwareUpgradeJSmaActivity r0, boolean r1) {
        r0.isUseDfuAddress = r1;
    }

    public static final /* synthetic */ void access$updateUpgradeStatus(FirmwareUpgradeJSmaActivity r0, OTAStatus r1, String r2) {
        r0.updateUpgradeStatus(r1, r2);
    }

    public static final /* synthetic */ void access$upgrade(FirmwareUpgradeJSmaActivity r0) {
        r0.upgrade();
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
        LogUtils.d(new Object[]{"checkDownload done start upgrade"});
        upgrade();
        return;
    }

    private final void connectDevice(String r4) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " connectDevice -> " + r4);
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
        WatchManager r0 = this.mWatchManager;
        if (r0 == null) goto L5;
        r0.release();
    L5:
        this.mWatchManager = null;
        OTAManager r1 = this.mOTAManager;
        if (r1 == null) goto L8;
        r1.unregisterBluetoothCallback(this.mOTAEventCallback);
    L8:
        OTAManager r2 = this.mOTAManager;
        if (r2 == null) goto L11;
        r2.release();
    L11:
        this.mOTAManager = null;
        NetworkOpImpl r3 = this.mNetworkOp;
        if (r3 == null) goto L14;
        r3.destroy();
    L14:
        this.mNetworkOp = null;
        BluetoothHelper r4 = this.mBluetoothHelper;
        if (r4 == null) goto L17;
        r4.removeBluetoothEventListener(this.mBtEventListener);
    L17:
        BluetoothHelper r5 = this.mBluetoothHelper;
        if (r5 == null) goto L20;
        r5.destroy();
    L20:
        this.mBluetoothHelper = null;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " destroyOTA");
    }

    public static /* synthetic */ boolean iOOX010X(FirmwareUpgradeJSmaActivity r0) {
        return showOtaFailedPopup$lambda$0$0(r0);
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
        WatchManager r2 = WatchManager.getInstance(Utils.getApp());
        this.mWatchManager = r2;
        this.mNetworkOp = NetworkOpImpl.instance(r2);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initOTA");
    }

    private static final void initView$lambda$0(FirmwareUpgradeJSmaActivity r1) {
        r1.onBottomClick(r1.getTvTip());
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

    private final void showOtaFailedPopup() {
        if (this.mOtaFailedPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.firmware_upgrading_failed_and_retry);
        go0.X11iII1O1(r0, null, null, 2, null);
        r0.X1IX(R.string.confirm, new I0i0i0Ii(this));
        this.mOtaFailedPopup = r0;
    L5:
        go0 r1 = this.mOtaFailedPopup;
        if (r1 != null) goto L8;
    L10:
        go0 r2 = this.mOtaFailedPopup;
        if (r2 == null) goto L14;
        r2.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r1.isShowing() != true) goto L10;
    }

    private static final boolean showOtaFailedPopup$lambda$0$0(FirmwareUpgradeJSmaActivity r1) {
        r1.onBottomClick(r1.getTvTip());
        return true;
    }

    private final void updateUpgradeStatus(OTAStatus r12, String r13) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " updateUpgradeStatus status -> " + r12);
        this.mOTAStatus = r12;
        if (isOTAError(r12) == false) goto L19;
        setMStarted(false);
        if (this.isReconnect == true) goto L8;
        ProgressButton.IiI10X(getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
    L8:
        if (isAutoUpdate() == false) goto L11;
        upgradeFailed(r13);
    L17:
        BaseFirmwareUpgradeActivity.uploadOtaRecord$default(this, "-1", r13, null, null, null, 28, null);
        return;
    L11:
        if (this.isReconnect == false) goto L16;
        r0.XIi00iiXO(this.TAG + " updateUpgradeStatus , isReconnect count = " + this.mReconnectCount);
        int r14 = this.mReconnectCount + 1;
        this.mReconnectCount = r14;
        if (r14 <= 5) goto L15;
        showOtaFailedPopup();
        goto L17
    L15:
        new Handler(Looper.getMainLooper()).postDelayed(new X0IiO00(this), 2000);
        goto L17
    L16:
        showOtaFailedPopup();
        goto L17
    L19:
        setMStarted(true);
    }

    public static /* synthetic */ void updateUpgradeStatus$default(FirmwareUpgradeJSmaActivity r0, OTAStatus r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "";
    L5:
        r0.updateUpgradeStatus(r1, r2);
    }

    private static final void updateUpgradeStatus$lambda$0(FirmwareUpgradeJSmaActivity r1) {
        r1.onBottomClick(r1.getTvTip());
    }

    private final void upgrade() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " upgrade " + this.mSteps.get(this.mStepsIndex));
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())}));
        switch(OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()]) {
            case 1: goto L41;
            case 2: goto L35;
            case 3: goto L29;
            case 4: goto L23;
            case 5: goto L17;
            case 6: goto L11;
            case 7: goto L7;
            default: goto L5;
        };
    L11:
        jlDestory();
        r0.OXO1(this.TAG + " gps_firmware");
        BleConnector r4 = BleConnector.INSTANCE;
        if (r4.isAvailable() == false) goto L15;
        BleKey r5 = BleKey.GPS_FIRMWARE_FILE;
        File r1 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r2 = this.mLatestGpsFirmware;
        Intrinsics.XXI(r2);
        BaseBleConnector.sendStream$default(r4, r5, new File(r1, r2.getFileName()), 0, 4, null);
        return;
    L15:
        new Handler().postDelayed(new i01i0X(), 4000);
        return;
    L17:
        jlDestory();
        r0.OXO1(this.TAG + " ota_pack");
        BleConnector r6 = BleConnector.INSTANCE;
        if (r6.isAvailable() == false) goto L21;
        BleKey r7 = BleKey.OTA_FILE;
        File r3 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r8 = this.mLatestFirmware;
        Intrinsics.XXI(r8);
        BaseBleConnector.sendStream$default(r6, r7, new File(r3, r8.getFileName()), 0, 4, null);
        return;
    L21:
        new Handler().postDelayed(new XXXiX(), 4000);
        return;
    L23:
        jlDestory();
        r0.OXO1(this.TAG + " font_pack");
        BleConnector r9 = BleConnector.INSTANCE;
        if (r9.isAvailable() == false) goto L27;
        BleKey r10 = BleKey.FONT_FILE;
        File r11 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r12 = this.mLatestFont;
        Intrinsics.XXI(r12);
        BaseBleConnector.sendStream$default(r9, r10, new File(r11, r12.getFileName()), 0, 4, null);
        return;
    L27:
        new Handler().postDelayed(new IXXiiO100(), 4000);
        return;
    L29:
        jlDestory();
        r0.OXO1(this.TAG + " language_file");
        BleConnector r13 = BleConnector.INSTANCE;
        if (r13.isAvailable() == false) goto L33;
        BleKey r14 = BleKey.LANGUAGE_FILE;
        File r15 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r16 = this.mLatestLanguage;
        Intrinsics.XXI(r16);
        BaseBleConnector.sendStream$default(r13, r14, new File(r15, r16.getFileName()), 0, 4, null);
        return;
    L33:
        new Handler().postDelayed(new IOiO1IIIi(), 4000);
        return;
    L35:
        jlDestory();
        r0.OXO1(this.TAG + " ui_file");
        BleConnector r17 = BleConnector.INSTANCE;
        if (r17.isAvailable() == false) goto L39;
        BleKey r18 = BleKey.UI_FILE;
        File r19 = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion r20 = this.mLatestUi;
        Intrinsics.XXI(r20);
        BaseBleConnector.sendStream$default(r17, r18, new File(r19, r20.getFileName()), 0, 4, null);
        return;
    L39:
        new Handler().postDelayed(new O1XXXIO(), 4000);
        return;
    L41:
        r0.OXO1(this.TAG + " firmware");
        destroyOTA();
        initOTA();
        if (this.isUseDfuAddress == false) goto L44;
        r0.OXO1(this.TAG + " upgrade -> use dfuAddress");
        connectDevice(BleCache.INSTANCE.getMDfuAddress());
    L45:
        updateUpgradeStatus$default(this, OTAStatus.UPGRADE_PREPARE, null, 2, null);
        return;
    L44:
        r0.OXO1(this.TAG + " upgrade -> use bleAddress");
        connectDevice(BleCache.INSTANCE.getMBleAddress());
        goto L45
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if (this.mNetworkOp != null) goto L9;
        initOTA();
    L9:
        r0.OXO1(this.TAG + " network_firmware");
        updateUpgradeStatus$default(this, OTAStatus.UPGRADE_PREPARE, null, 2, null);
        connectDevice(BleCache.INSTANCE.getMBleAddress());
    }

    private static final void upgrade$lambda$0() {
        BleConnector.INSTANCE.launch();
    }

    private static final void upgrade$lambda$1() {
        BleConnector.INSTANCE.launch();
    }

    private static final void upgrade$lambda$2() {
        BleConnector.INSTANCE.launch();
    }

    private static final void upgrade$lambda$3() {
        BleConnector.INSTANCE.launch();
    }

    private static final void upgrade$lambda$4() {
        BleConnector.INSTANCE.launch();
    }

    private final void upgradeFailed(String r2) {
        finish();
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, r2);
    }

    public final int getMReconnectCount() {
        return this.mReconnectCount;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        sc.XIi00iiXO(this);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        r0.OXO1(this.TAG + " Firmware -> " + this.mLatestFirmware);
        r0.OXO1(this.TAG + " ExtraPacks -> " + this.mLatestExtraPacks);
        FirmwareVersion r1 = this.mLatestFirmware;
        if (r1 == null) goto L5;
    L16:
        if (r1 == null) goto L19;
        String r2 = r1.getVersion();
        if (r2 == null) goto L19;
    L20:
        FirmwareVersion r4 = this.mLatestUi;
        if (r4 == null) goto L26;
        String r5 = r4.getVersion();
        if (r5 == null) goto L26;
    L27:
        String r6 = oe5.IXO0OOi(r5, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r7 = this.mLatestLanguage;
        if (r7 == null) goto L33;
        String r8 = r7.getVersion();
        if (r8 == null) goto L33;
    L34:
        String r9 = oe5.IXO0OOi(r8, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r10 = this.mLatestGpsFirmware;
        if (r10 == null) goto L40;
        String r11 = r10.getVersion();
        if (r11 == null) goto L40;
    L41:
        String r12 = oe5.IXO0OOi(r11, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        FirmwareVersion r13 = this.mLatestNetworkFirmware;
        if (r13 == null) goto L47;
        String r14 = r13.getVersion();
        if (r14 == null) goto L47;
    L48:
        String r15 = oe5.IXO0OOi(r14, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r2 + FileUtils.FILE_EXTENSION_SEPARATOR + r6 + r9 + r12 + r15}));
        String r16 = this.TAG;
        CharSequence r17 = getTvLatest().getText();
        StringBuilder r18 = new StringBuilder();
        r18.append(r16);
        r18.append(" latest -> ");
        r18.append(r17);
        r0.OXO1(r18.toString());
        String r19 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r20 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r21 = oe5.IXO0OOi(this.mCurrentGps, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r22 = oe5.IXO0OOi(this.mCurrentNetwork, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + r19 + r20 + r21 + r22}));
        String r3 = this.TAG;
        CharSequence r23 = getTvCurrent().getText();
        StringBuilder r24 = new StringBuilder();
        r24.append(r3);
        r24.append(" current -> ");
        r24.append(r23);
        r0.OXO1(r24.toString());
        setMCurrentVersion(this.mCurrentFirmware);
        setMTargetVersion(r2);
        if (this.mLatestFirmware == null) goto L55;
        if (q62.OXO1.iiOOI() == false) goto L53;
        this.mSteps.add(FileType.OTA_PACK);
        goto L55
    L53:
        this.mSteps.add(FileType.FIRMWARE);
    L55:
        if (this.mLatestLanguage == null) goto L58;
        this.mSteps.add(FileType.LANGUAGE_PACK);
    L58:
        if (this.mLatestUi == null) goto L61;
        this.mSteps.add(FileType.UI_PACK);
    L61:
        if (this.mLatestFont == null) goto L64;
        this.mSteps.add(FileType.FONT_PACK);
    L64:
        if (this.mLatestGpsFirmware == null) goto L67;
        this.mSteps.add(FileType.GPS_FIRMWARE);
    L67:
        if (this.mLatestNetworkFirmware == null) goto L69;
        this.mSteps.add(FileType.NETWORK_FIRMWARE);
    L69:
        getTvStep().setVisibility(0);
        getTvTip().setText(R.string.jl_firmware_upgrade_tip);
        if (isAutoUpdate() == false) goto L72;
        new Handler().postDelayed(new I0XIOX(this), 500);
    L72:
        FirmwareVersion r25 = this.mLatestFirmware;
        if (r25 == null) goto L83;
        String r26 = r25.getUpdateDesc();
        if (r26 != null) goto L77;
        return;
    L77:
        if (StringsKt__StringsKt.i0XI0(r26) == false) goto L80;
        r26 = null;
    L80:
        if (r26 == null) goto L85;
        getTvUpdateDesc().setText(r26);
        return;
    L85:
        return;
    L83:
        return;
    L47:
        r14 = this.mCurrentNetwork;
    L40:
        r11 = this.mCurrentGps;
    L33:
        r8 = this.mCurrentLanguage;
    L26:
        r5 = this.mCurrentUi;
    L19:
        r2 = this.mCurrentFirmware;
        goto L20
    L5:
        if (this.mLatestUi != null) goto L16;
        if (this.mLatestLanguage != null) goto L16;
        if (this.mLatestFont != null) goto L16;
        if (this.mLatestGpsFirmware != null) goto L16;
        if (this.mLatestNetworkFirmware != null) goto L16;
        String r27 = this.mCurrentFirmware;
        String r28 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r29 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        String r30 = oe5.IXO0OOi(this.mCurrentGps, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
        getTvLatest().setText(getString(R.string.v_s, new Object[]{r27 + FileUtils.FILE_EXTENSION_SEPARATOR + r28 + r29 + r30}));
        ViewParent r31 = getTvCurrent().getParent();
        Intrinsics.X1ii(r31, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r31).setVisibility(8);
        getProgressButton().setVisibility(8);
    }

    public final boolean isReconnect() {
        return this.isReconnect;
    }

    public final boolean isUpgradeDoneOTAFile() {
        return this.isUpgradeDoneOTAFile;
    }

    public final void jlDestory() {
        destroyOTA();
    }

    public final void onBottomClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L7;
        ToastUtils.showLong("Bluetooth is off!", new Object[0]);
        return;
    L7:
        if (q62.OXO1.iiOOI() == true) goto L9;
        BleConnector.INSTANCE.closeConnection(true);
    L9:
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex == 0) goto L12;
        upgrade();
        return;
    L12:
        if (this.mLatestFirmware == null) goto L17;
        File r7 = new File(uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName());
        if (com.blankj.utilcode.util.FileUtils.isFileExists(r7) == false) goto L16;
        this.mDownloaded++;
        checkDownload();
        goto L17
    L16:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download firmware");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = this.mLatestFirmware.getFileUrl();
        String r2 = r7.getParent();
        Intrinsics.O10IXXX0X(r2, "getParent(...)");
        String r8 = r7.getName();
        Intrinsics.O10IXXX0X(r8, "getName(...)");
        r0.download(r1, r2, r8, new AnonymousClass1(this));
    L17:
        FirmwareVersion r9 = this.mLatestUi;
        if (r9 == null) goto L20;
        NetWorkUtils.INSTANCE.download(r9.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestUi.getFileName(), new AnonymousClass2(this));
    L20:
        FirmwareVersion r10 = this.mLatestLanguage;
        if (r10 == null) goto L23;
        NetWorkUtils.INSTANCE.download(r10.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestLanguage.getFileName(), new AnonymousClass3(this));
    L23:
        FirmwareVersion r11 = this.mLatestFont;
        if (r11 == null) goto L26;
        NetWorkUtils.INSTANCE.download(r11.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFont.getFileName(), new AnonymousClass4(this));
    L26:
        FirmwareVersion r12 = this.mLatestGpsFirmware;
        if (r12 == null) goto L29;
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(r12);
        String r13 = r12.getFileUrl();
        String r4 = uz0.XXI(sz0.OXO1);
        FirmwareVersion r5 = this.mLatestGpsFirmware;
        Intrinsics.XXI(r5);
        r3.download(r13, r4, r5.getFileName(), new AnonymousClass5(this));
    L29:
        FirmwareVersion r14 = this.mLatestNetworkFirmware;
        if (r14 == null) goto L35;
        NetWorkUtils r15 = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(r14);
        String r16 = r14.getFileUrl();
        String r17 = uz0.XXI(sz0.OXO1);
        FirmwareVersion r18 = this.mLatestNetworkFirmware;
        Intrinsics.XXI(r18);
        r15.download(r16, r17, r18.getFileName(), new AnonymousClass6(this));
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.removeHandleCallback(this.mBleHandleCallback);
        if (this.mSteps.isEmpty() == false) goto L5;
    L7:
        jlDestory();
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false) == false) goto L10;
        I01XX0.XIi00iiXO(b01.IiI10X, null, 2, null);
    L10:
        super.onDestroy();
        return;
    L5:
        if (this.mStepsIndex != CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) goto L7;
        BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.UI_FILE, null, 2, null);
        r0.closeConnection(true);
        goto L7
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        go0 r0 = this.mOtaFailedPopup;
        if (r0 == null) goto L8;
        if (r0.isShowing() != true) goto L8;
        return;
    L8:
        if (getMStarted() == false) goto L10;
    L13:
        super.onHandleBackPressed();
        return;
    L10:
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X) == false) goto L13;
        showOtaFailedPopup();
    }

    public final void setMReconnectCount(int r1) {
        this.mReconnectCount = r1;
    }

    public final void setReconnect(boolean r1) {
        this.isReconnect = r1;
    }

    public final void setUpgradeDoneOTAFile(boolean r1) {
        this.isUpgradeDoneOTAFile = r1;
    }

    public final void startNetworkOTA(@aa1 String r4) {
        Intrinsics.X0O(r4, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startNetworkOTA -> " + r4);
        NetworkOpImpl r0 = this.mNetworkOp;
        if (r0 == null) goto L6;
        WatchManager r1 = this.mWatchManager;
        Intrinsics.XXI(r1);
        r0.startNetworkOTA(r1.getConnectedDevice(), new OTAParam(r4), new O00(this));
        return;
    }

    public final void startOTA(@aa1 String r4) {
        Intrinsics.X0O(r4, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA -> " + r4);
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L7;
        BluetoothOTAConfigure r1 = r0.getBluetoothOption();
        if (r1 == null) goto L7;
        r1.setFirmwareFilePath(r4);
    L7:
        OTAManager r5 = this.mOTAManager;
        if (r5 == null) goto L11;
        r5.startOTA(new IiI10X(this));
        return;
    }

    public final void upgradeDone() {
        if (q62.OXO1.iiOOI() == false) goto L5;
        this.isUpgradeDoneOTAFile = true;
        ToastUtils.showLong(R.string.support_dual_backup_upgrade_successful);
    L6:
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 == null) goto L9;
        updateDeviceInfo(r0.getVersion());
    L9:
        BaseFirmwareUpgradeActivity.uploadOtaRecord$default(this, "0", null, null, null, null, 30, null);
        finish();
        FirmwareVersion r1 = this.mLatestFirmware;
        if (r1 != null) goto L12;
    L14:
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "done");
        return;
    L12:
        if (r1.getFlag() != 2) goto L14;
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        I01XX0.XIi00iiXO(I01XX0.O0O, null, 2, null);
        goto L14
    L5:
        ToastUtils.showLong(R.string.upgrade_successful);
        goto L6
    }
}
