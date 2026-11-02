package com.sma.smartv3.p610ui.p612me;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.OIOO0X00O;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
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
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperUpgradeRSmaActivity;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
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
    private final C18929iO mDfuCallback;

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
    private C3006uq mLoadingPopup;

    @tb1
    private OtaDeviceInfo mOtaDeviceInfo;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;
    private long time1;

    public enum FileType {
        FIRMWARE,
        UI_PACK,
        LANGUAGE_PACK,
        FONT_PACK;

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
            try {
                iArr[FileType.FONT_PACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements BleHandleCallback {

        public static final /* synthetic */ class OXO1 {
            public static final /* synthetic */ int[] OXO1;

            static {
                int[] iArr = new int[FileType.values().length];
                try {
                    iArr[FileType.UI_PACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileType.LANGUAGE_PACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FileType.FONT_PACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                OXO1 = iArr;
            }
        }

        public XIi00iiXO() {
        }

        public static final void I0IIOi(final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.SESSION;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag, r9.nextInt(), null, false, false, 56, null);
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag2, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt8$default(bleConnector, BleKey.SHUTDOWN, bleKeyFlag2, 0, false, false, 24, null);
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iXiOIOiI
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.XIi00iiXO.OIi0(developerUpgradeRSmaActivity);
                }
            }, 5000L);
        }

        public static final void I0iXXO(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            developerUpgradeRSmaActivity.upgrade();
        }

        /* JADX INFO: renamed from: IO */
        public static final void m38548IO(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.SESSION;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, BleKeyFlag.UPDATE, r9.nextInt(), null, false, false, 56, null);
            int i = OXO1.OXO1[((FileType) developerUpgradeRSmaActivity.mSteps.get(developerUpgradeRSmaActivity.mStepsIndex)).ordinal()];
            if (i == 1) {
                ProgressButton.O00(developerUpgradeRSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                BleKey bleKey2 = BleKey.UI_FILE;
                File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion = developerUpgradeRSmaActivity.mLatestUi;
                Intrinsics.XXI(firmwareVersion);
                BaseBleConnector.sendStream$default(bleConnector, bleKey2, new File(fileI0iXXO, firmwareVersion.getFileName()), 0, 4, (Object) null);
                return;
            }
            if (i == 2) {
                ProgressButton.O00(developerUpgradeRSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                BleKey bleKey3 = BleKey.LANGUAGE_FILE;
                File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion2 = developerUpgradeRSmaActivity.mLatestLanguage;
                Intrinsics.XXI(firmwareVersion2);
                BaseBleConnector.sendStream$default(bleConnector, bleKey3, new File(fileI0iXXO2, firmwareVersion2.getFileName()), 0, 4, (Object) null);
                return;
            }
            if (i != 3) {
                return;
            }
            ProgressButton.O00(developerUpgradeRSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
            BleKey bleKey4 = BleKey.FONT_FILE;
            File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion firmwareVersion3 = developerUpgradeRSmaActivity.mLatestFont;
            Intrinsics.XXI(firmwareVersion3);
            BaseBleConnector.sendStream$default(bleConnector, bleKey4, new File(fileI0iXXO3, firmwareVersion3.getFileName()), 0, 4, (Object) null);
        }

        public static final void OIX0iXi(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            developerUpgradeRSmaActivity.upgrade();
        }

        public static final void OIi0(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            C3006uq c3006uq = developerUpgradeRSmaActivity.mLoadingPopup;
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
            LogUtils.m11128d("force exit");
            developerUpgradeRSmaActivity.upgradeExit();
        }

        public static final void XOO0ii0(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            developerUpgradeRSmaActivity.upgrade();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int i) {
            super.onAICoachGeneratePlanUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand bleAICommand) {
            super.onAICommandUpdate(bleAICommand);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int i) {
            super.onActivityRecognitionUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm bleAlarm) {
            super.onAlarmAdd(bleAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int i) {
            super.onAlarmDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm bleAlarm) {
            super.onAlarmUpdate(bleAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp bleAppOp) {
            super.onAppOpUpdate(bleAppOp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean z) {
            super.onAppSportDataResponse(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo bleBWNaviInfo) {
            super.onBWNaviInfoUpdate(bleBWNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int i) {
            super.onBacklightUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey bleBandKey) {
            super.onBandKeyUpdate(bleBandKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore bleGolfScore) {
            super.onBleGolfScore(bleGolfScore);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData bleThirdPartyData) {
            super.onBleThirdPartyDataUpdate(bleThirdPartyData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo bleVideoCallInfo) {
            super.onBleVideoCallInfo(bleVideoCallInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat bleCPChat) {
            super.onCPChatUpdate(bleCPChat);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo bleCPGiftsInfo) {
            super.onCPGiftsInfoUpdate(bleCPGiftsInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener bleCPListener) {
            super.onCPListenerUpdate(bleCPListener);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou bleCPMissYou) {
            super.onCPMissYouUpdate(bleCPMissYou);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo bleCPTodo) {
            super.onCPTodoUpdate(bleCPTodo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int i) {
            super.onCaloriesGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean z, int i) {
            super.onCameraResponse(z, i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int i) {
            super.onCameraStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp bleChatApp) {
            super.onChatAppUpdate(bleChatApp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage bleChatMessage) {
            super.onChatMessageUpdate(bleChatMessage);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice bleChatVoice) {
            super.onChatVoiceUpdate(bleChatVoice);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay bleCheckInEveryDay) {
            super.onCheckInEveryDayUpdate(bleCheckInEveryDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int i) {
            super.onClassicBluetoothStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandReply(BleKey bleKey, BleKeyFlag bleKeyFlag, boolean z) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.SHUTDOWN) {
                C3006uq c3006uq = DeveloperUpgradeRSmaActivity.this.mLoadingPopup;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                LogUtils.m11128d("shutdown success");
                DeveloperUpgradeRSmaActivity.this.upgradeExit();
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.UI_FILE || bleKey == BleKey.LANGUAGE_FILE) {
                DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                ProgressButton.O00(DeveloperUpgradeRSmaActivity.this.getProgressButton(), R.string.starting, false, 2, null);
                TextView tvStep = DeveloperUpgradeRSmaActivity.this.getTvStep();
                final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
                tvStep.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXiIOOiI
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.XIi00iiXO.XOO0ii0(developerUpgradeRSmaActivity);
                    }
                }, 8000L);
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int i) {
            super.onContactUsStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int i) {
            super.onDeleteFileResponse(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onDeviceConnected(BluetoothDevice device) {
            Intrinsics.X0O(device, "device");
            LogUtils.m11128d("onDeviceConnected " + DeveloperUpgradeRSmaActivity.this.isStartShutdown);
            if (DeveloperUpgradeRSmaActivity.this.isStartShutdown) {
                Handler handler = new Handler();
                final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
                handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I11XIIIX
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.XIi00iiXO.I0IIOi(developerUpgradeRSmaActivity);
                    }
                }, 3000L);
            } else {
                Handler handler2 = new Handler();
                final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity2 = DeveloperUpgradeRSmaActivity.this;
                handler2.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X0OI1O
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.XIi00iiXO.m38548IO(developerUpgradeRSmaActivity2);
                    }
                }, 10000L);
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean z) {
            super.onDeviceConnecting(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile bleDeviceFile) {
            super.onDeviceFileUpdate(bleDeviceFile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int i) {
            super.onDeviceOpUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String str) {
            super.onDeviceRequestAGpsFile(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply bleSMSQuickReply) {
            super.onDeviceSMSQuickReply(bleSMSQuickReply);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData bleDeviceSportData) {
            super.onDeviceSportDataUpdate(bleDeviceSportData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int i) {
            super.onDistanceGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings bleDoubleScreenSettings) {
            super.onDoubleScreenSettingsUpdate(bleDoubleScreenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings bleDrinkWaterSettings) {
            super.onDrinkWaterUpdate(bleDrinkWaterSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings bleEarphoneAncSettings) {
            super.onEarphoneAncSettingsUpdate(bleEarphoneAncSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int i) {
            super.onEarphoneCallUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey bleEarphoneKey) {
            super.onEarphoneKeyUpdate(bleEarphoneKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
            super.onEarphoneSoundEffectsSettingsUpdate(bleEarphoneSoundEffectsSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState bleEarphoneState) {
            super.onEarphoneStateUpdate(bleEarphoneState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest bleFactoryTest) {
            super.onFactoryTestUpdate(bleFactoryTest);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int i) {
            super.onFallSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone bleFindEarphone) {
            super.onFindEarphoneUpdate(bleFindEarphone);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean z) {
            super.onFindPhone(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int i) {
            super.onFindWatchUpdate(i);
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
        public /* bridge */ void onFollowSystemLanguage(boolean z) {
            super.onFollowSystemLanguage(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl bleGameControl) {
            super.onGameControlUpdate(bleGameControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 bleGestureWake2) {
            super.onGestureWake2Update(bleGestureWake2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake bleGestureWake) {
            super.onGestureWakeUpdate(bleGestureWake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo bleGoogleNaviInfo) {
            super.onGoogleNaviInfoUpdate(bleGoogleNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int i) {
            super.onHIDState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int i) {
            super.onHIDValueChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings bleHrWarningSettings) {
            super.onHRWarningSet(bleHrWarningSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int i) {
            super.onHanBaoVibrationStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int i) {
            super.onHighAntiAssistChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int i) {
            super.onHourSystemUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings bleHydrationSettings) {
            super.onHydrationUpdate(bleHydrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException bleIPCException) {
            super.onIPCExceptionUpdate(bleIPCException);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState bleIPCOTAState) {
            super.onIPCOTAStateUpdate(bleIPCOTAState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState bleIPCState) {
            super.onIPCStateUpdate(bleIPCState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo bleIPCStoresInfo) {
            super.onIPCStoresInfoUpdate(bleIPCStoresInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo bleIPCWifiInfo) {
            super.onIPCWifiInfoUpdate(bleIPCWifiInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityCreate(boolean z, BleDeviceInfo bleDeviceInfo) {
            super.onIdentityCreate(z, bleDeviceInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean z) {
            super.onIdentityDelete(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean z) {
            super.onIdentityDeleteByDevice(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int i) {
            super.onIncomingCallRingUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int i) {
            super.onIncomingCallStatus(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap bleLoveTap) {
            super.onLoveTapUpdate(bleLoveTap);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int i) {
            super.onLoveTapUserDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser bleLoveTapUser) {
            super.onLoveTapUserUpdate(bleLoveTapUser);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement bleMeasurement) {
            super.onMeasurementUpdate(bleMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm bleMedicationAlarm) {
            super.onMedicationAlarmAdd(bleMedicationAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int i) {
            super.onMedicationAlarmDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm bleMedicationAlarm) {
            super.onMedicationAlarmUpdate(bleMedicationAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int i) {
            super.onMedicationReminderDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder bleMedicationReminder) {
            super.onMedicationReminderUpdate(bleMedicationReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder bleMeetingReminder) {
            super.onMeetingReminderAdd(bleMeetingReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int i) {
            super.onMeetingReminderDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder bleMeetingReminder) {
            super.onMeetingReminderUpdate(bleMeetingReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int i) {
            super.onMultiFileTransferReadFile(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int i) {
            super.onMultiFileTransferResponse(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo bleNaviInfo) {
            super.onNaviInfoUpdate(bleNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings bleNoDisturbSettings) {
            super.onNoDisturbUpdate(bleNoDisturbSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int i) {
            super.onNotificationLightScreenSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 bleNotificationSettings2) {
            super.onNotificationSettings2Update(bleNotificationSettings2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean z) {
            super.onOTA(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int i) {
            super.onPowerSaveModeState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int i) {
            super.onPowerSaveModeStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan bleAICoachBeforePlan) {
            super.onReadAICoachGenerateBeforeInfo(bleAICoachBeforePlan);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
            super.onReadAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan bleAICoachGeneratePlan) {
            super.onReadAICoachPlan(bleAICoachGeneratePlan);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2) {
            super.onReadAICoachPlanV2(bleAICoachGeneratePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> list) {
            super.onReadActivity(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail bleActivityDetail) {
            super.onReadActivityDetail(bleActivityDetail);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook bleAddressBook) {
            super.onReadAddressBook(bleAddressBook);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> list) {
            super.onReadAlarm(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> list) {
            super.onReadAlipayBindInfo(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings bleAlipaySettings) {
            super.onReadAlipaySettings(bleAlipaySettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String str) {
            super.onReadAppApiVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList bleAppInfoList) {
            super.onReadAppInfoList(bleAppInfoList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState bleAppSportState) {
            super.onReadAppSportState(bleAppSportState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> list) {
            super.onReadAvgHeartRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> list) {
            super.onReadBAC(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration bleBacCalibration, BleKeyFlag bleKeyFlag) {
            super.onReadBacCalibration(bleBacCalibration, bleKeyFlag);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int i) {
            super.onReadBacklight(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage bleBatteryUsage) {
            super.onReadBatteryUsage(bleBatteryUsage);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String str) {
            super.onReadBleAddress(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo bleGolfMapCacheInfo) {
            super.onReadBleGolfMapCacheInfo(bleGolfMapCacheInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch bleGolfSportSwitch) {
            super.onReadBleGolfSportSwitch(bleGolfSportSwitch);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo bleGolfWatchMapInfo) {
            super.onReadBleGolfWatchMapInfo(bleGolfWatchMapInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
            super.onReadBleGolfWatchVersionInfo(bleGolfWatchVersionInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> list) {
            super.onReadBleHrv(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> list) {
            super.onReadBleLogText(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> list) {
            super.onReadBloodGlucose(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings bleBloodOxyGenSettings) {
            super.onReadBloodOxyGenSettings(bleBloodOxyGenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> list) {
            super.onReadBloodOxygen(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> list) {
            super.onReadBloodPressure(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration bleBloodPressureCalibration) {
            super.onReadBloodPressureCalibration(bleBloodPressureCalibration);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> list) {
            super.onReadBodyStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo bleCPUserInfo) {
            super.onReadCPUserInfo(bleCPUserInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData bleCalibrationData) {
            super.onReadCalibrationData(bleCalibrationData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> list) {
            super.onReadCalorieIntake(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int i) {
            super.onReadCaloriesGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp bleChatApp) {
            super.onReadChatApp(bleChatApp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay bleCheckInEveryDay) {
            super.onReadCheckInEveryDay(bleCheckInEveryDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int i) {
            super.onReadClassicBluetoothState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds bleCoachingIds) {
            super.onReadCoachingIds(bleCoachingIds);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm bleCyWeeAlgorithm) {
            super.onReadCyWeeAlgorithm(bleCyWeeAlgorithm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> list) {
            super.onReadDailyPower(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int i) {
            super.onReadDateFormat(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile bleDeviceFile) {
            super.onReadDeviceFile(bleDeviceFile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 bleDeviceFile2) {
            super.onReadDeviceFileV2(bleDeviceFile2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo bleDeviceInfo) {
            super.onReadDeviceInfo(bleDeviceInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 bleDeviceInfo2) {
            super.onReadDeviceInfo2(bleDeviceInfo2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages bleDeviceLanguages) {
            super.onReadDeviceLanguages(bleDeviceLanguages);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages2(BleDeviceLanguages2 bleDeviceLanguages2) {
            super.onReadDeviceLanguages2(bleDeviceLanguages2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings) {
            super.onReadDeviceUniqueDataSettings(bleDeviceUniqueDataSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int i) {
            super.onReadDistanceGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings bleDoubleScreenSettings) {
            super.onReadDoubleScreenSettings(bleDoubleScreenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings bleDrinkWaterSettings) {
            super.onReadDrinkWater(bleDrinkWaterSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime bleECGRealtime) {
            super.onReadECGRealtime(bleECGRealtime);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings bleEarphoneAncSettings) {
            super.onReadEarphoneAncSettings(bleEarphoneAncSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int i) {
            super.onReadEarphoneCall(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo bleEarphoneInfo) {
            super.onReadEarphoneInfo(bleEarphoneInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey bleEarphoneKey) {
            super.onReadEarphoneKey(bleEarphoneKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower bleEarphonePower) {
            super.onReadEarphonePower(bleEarphonePower);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
            super.onReadEarphoneSoundEffectsSettings(bleEarphoneSoundEffectsSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState bleEarphoneState) {
            super.onReadEarphoneState(bleEarphoneState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> list) {
            super.onReadEcg(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings bleEcgSettings) {
            super.onReadEcgSettings(bleEcgSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> list) {
            super.onReadEnergyRating(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int i) {
            super.onReadFallSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList bleAppAudioBookList) {
            super.onReadFilePath(bleAppAudioBookList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFirmwareVersion(String str) {
            super.onReadFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> list) {
            super.onReadFoodBalance(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake bleGestureWake) {
            super.onReadGestureWake(bleGestureWake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 bleGestureWake2) {
            super.onReadGestureWake2(bleGestureWake2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly bleGirlCareMonthly) {
            super.onReadGirlCareMonthly(bleGirlCareMonthly);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings bleGirlCareSettings) {
            super.onReadGirlCareSettings(bleGirlCareSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings bleGoMoreSettings) {
            super.onReadGoMoreSettings(bleGoMoreSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore bleGolfWatchScore) {
            super.onReadGolfWatchScore(bleGolfWatchScore);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String str) {
            super.onReadGpsFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings bleHanBaoSettings) {
            super.onReadHanBaoSettings(bleHanBaoSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> list) {
            super.onReadHanBaoVibration(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> list) {
            super.onReadHeartRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones bleHeartRateZones) {
            super.onReadHeartRateZones(bleHeartRateZones);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int i) {
            super.onReadHourSystem(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings bleHrMonitoringSettings) {
            super.onReadHrMonitoringSettings(bleHrMonitoringSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int i) {
            super.onReadHrMonitoringSettingsV2(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine bleHrvBaseLine) {
            super.onReadHrvBaseLine(bleHrvBaseLine);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings bleHrvMonitoringSettings) {
            super.onReadHrvMonitoringSettings(bleHrvMonitoringSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings bleHydrationSettings) {
            super.onReadHydrationSettings(bleHydrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo bleIPCInfo) {
            super.onReadIPCInfo(bleIPCInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState bleIPCState) {
            super.onReadIPCState(bleIPCState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo bleIPCStoresInfo) {
            super.onReadIPCStoresInfo(bleIPCStoresInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String str) {
            super.onReadIPCVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int i) {
            super.onReadIncomingCallRing(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> list) {
            super.onReadLactateThreshold(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int i) {
            super.onReadLanguage(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion bleLanguagePackVersion) {
            super.onReadLanguagePackVersion(bleLanguagePackVersion);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> list) {
            super.onReadLocation(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> list) {
            super.onReadLoveTapUser(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> list) {
            super.onReadMatchRecord(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> list) {
            super.onReadMatchRecord2(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> list) {
            super.onReadMatchRecord3(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> list) {
            super.onReadMedicationAlarm(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> list) {
            super.onReadMedicationReminder(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> list) {
            super.onReadMeetingReminder(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> list) {
            super.onReadMindStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList bleMapFileList) {
            super.onReadMultiFileTransfer(bleMapFileList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String str) {
            super.onReadNetworkFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings bleNoDisturbSettings) {
            super.onReadNoDisturb(bleNoDisturbSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int i) {
            super.onReadNotificationLightScreenSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 bleNotificationSettings2) {
            super.onReadNotificationSettings2(bleNotificationSettings2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings bleOfflineAsrSettings) {
            super.onReadOfflineAsrSettings(bleOfflineAsrSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int i) {
            super.onReadOngoingDialogue(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo bleOptionalMapAuthInfo) {
            super.onReadOptionalMapAuthInfo(bleOptionalMapAuthInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus blePackageStatus) {
            super.onReadPackageStatus(blePackageStatus);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int i) {
            super.onReadPower(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 blePower2) {
            super.onReadPower2(blePower2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> list) {
            super.onReadPressure(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement blePressureTimingMeasurement) {
            super.onReadPressureTimingMeasurement(blePressureTimingMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings bleQiblaSettings) {
            super.onReadQiblaSettings(bleQiblaSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl bleRecordControl) {
            super.onReadRecordControl(bleRecordControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder bleRelaxReminder) {
            super.onReadRelaxReminder(bleRelaxReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> list) {
            super.onReadRespiratoryRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int i) {
            super.onReadRestingHeartRate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings bleRingVibrationSettings) {
            super.onReadRingVibrationSet(bleRingVibrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> list) {
            super.onReadRri(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo bleSDCardInfo) {
            super.onReadSDCardInfo(bleSDCardInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet bleSGCameraSet) {
            super.onReadSGCameraSet(bleSGCameraSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet bleSGKeySet) {
            super.onReadSGKeySet(bleSGKeySet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake bleSGKeywordAwake) {
            super.onReadSGKeywordAwake(bleSGKeywordAwake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet bleSGSet) {
            super.onReadSGSet(bleSGSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int i) {
            super.onReadSGSleepSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings bleSOSSettings) {
            super.onReadSOSSettings(bleSOSSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int i) {
            super.onReadScreenBrightnessSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings bleSedentarinessSettings) {
            super.onReadSedentariness(bleSedentarinessSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> list) {
            super.onReadSleep(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int i) {
            super.onReadSleepGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int i) {
            super.onReadSleepMonitoringMode(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality bleSleepQuality) {
            super.onReadSleepQuality(bleSleepQuality);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int i) {
            super.onReadSleepQualityScore(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] bArr) {
            super.onReadSleepRaw(bArr);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int i) {
            super.onReadSleepRespiratoryRate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int i) {
            super.onReadSleepRiskLevel(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int i) {
            super.onReadSleepSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> list) {
            super.onReadSosCallLog(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact bleSosContact) {
            super.onReadSosContact(bleSosContact);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int i) {
            super.onReadSportDurationGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
            super.onReadStandbyWatchFaceSet(bleStandbyWatchFaceSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int i) {
            super.onReadStepGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> list) {
            super.onReadStock(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> list) {
            super.onReadTemperature(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int i) {
            super.onReadTemperatureUnit(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> list) {
            super.onReadTrainingStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey bleTuyaKey) {
            super.onReadTuyaKey(bleTuyaKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String str) {
            super.onReadUiPackVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int i) {
            super.onReadUnit(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile bleUserProfile) {
            super.onReadUserProfile(bleUserProfile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> list) {
            super.onReadVitalityValue(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int i) {
            super.onReadVoiceControl(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId bleWatchFaceId) {
            super.onReadWatchFaceId(bleWatchFaceId);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex bleWatchFaceIndex) {
            super.onReadWatchFaceIndex(bleWatchFaceIndex);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize bleWatchFaceMaxSize) {
            super.onReadWatchFaceMaxSize(bleWatchFaceMaxSize);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int i) {
            super.onReadWatchFaceSwitch(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword bleSettingWatchPassword) {
            super.onReadWatchPassword(bleSettingWatchPassword);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int i) {
            super.onReadWearWayState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean z) {
            super.onReadWeatherRealTime(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings bleWechatPaySettings) {
            super.onReadWechatPaySettings(bleWechatPaySettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> list) {
            super.onReadWorkout(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> list) {
            super.onReadWorkout2(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> list) {
            super.onReadWorkout3(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> list) {
            super.onReadWorkout4(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation bleWorkout4Segmentation) {
            super.onReadWorkout4Segmentation(bleWorkout4Segmentation);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> list) {
            super.onReadWorldClock(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement bleRealTimeMeasurement) {
            super.onRealTimeMeasurement(bleRealTimeMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] bArr, boolean z) {
            super.onReceiveCmTrace(bArr, z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket bleReceiveFilePacket) {
            super.onReceiveFilePacket(bleReceiveFilePacket);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> list) {
            super.onReceiveGSensorMotion(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> list) {
            super.onReceiveGSensorRaw(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> list) {
            super.onReceiveGSensorSHSY(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> list) {
            super.onReceiveHRRaw(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga bleLocationGga) {
            super.onReceiveLocationGga(bleLocationGga);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> list) {
            super.onReceiveLocationGsv(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand musicCommand) {
            super.onReceiveMusicCommand(musicCommand);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> list) {
            super.onReceivePpgSHSY(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog bleRealtimeLog) {
            super.onReceiveRealtimeLog(bleRealtimeLog);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket bleRecordPacket) {
            super.onReceiveRecordPacket(bleRecordPacket);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl bleRecordControl) {
            super.onRecordControlUpdate(bleRecordControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int i) {
            super.onRequestLocation(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings bleRingVibrationSettings) {
            super.onRingVibrationSetUpdate(bleRingVibrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo bleSDCardInfo) {
            super.onSDCardInfoUpdate(bleSDCardInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest bleSGTest) {
            super.onSGTestUpdate(bleSGTest);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts bleSGTts) {
            super.onSGTtsUpdate(bleSGTts);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings bleSOSSettings) {
            super.onSOSSettingsUpdate(bleSOSSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int i) {
            super.onScreenBrightnessSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean z) {
            LogUtils.m11128d("onSessionStateChange");
            if (z) {
                return;
            }
            DeveloperUpgradeRSmaActivity.this.setMStarted(false);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify bleSleepNotify) {
            super.onSleepNotifyUpdate(bleSleepNotify);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact bleSosContact) {
            super.onSosContactUpdate(bleSosContact);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int i) {
            super.onSportEndNotifyUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
            super.onStandbyWatchFaceSetUpdate(bleStandbyWatchFaceSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int i) {
            super.onStepGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int i) {
            super.onStockDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onStreamProgress(boolean z, int i, int i2, int i3, BleKey bleKey) {
            Intrinsics.X0O(bleKey, "bleKey");
            if (!z) {
                DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                ProgressButton.O00(DeveloperUpgradeRSmaActivity.this.getProgressButton(), R.string.starting, false, 2, null);
                TextView tvStep = DeveloperUpgradeRSmaActivity.this.getTvStep();
                final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
                tvStep.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i0iiOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.XIi00iiXO.I0iXXO(developerUpgradeRSmaActivity);
                    }
                }, 8000L);
                return;
            }
            if (System.currentTimeMillis() - DeveloperUpgradeRSmaActivity.this.time1 > 1000) {
                DeveloperUpgradeRSmaActivity.this.time1 = System.currentTimeMillis();
                DeveloperUpgradeRSmaActivity.this.getTvSpeed().setText(new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(((double) (i3 - DeveloperUpgradeRSmaActivity.this.lastPackageSize)) / 1024.0d) + " KB/s");
                DeveloperUpgradeRSmaActivity.this.lastPackageSize = i3;
            }
            DeveloperUpgradeRSmaActivity.this.getProgressButton().setProgressDecimalPlaces(i3 / i2);
            if (i2 == i3) {
                if (DeveloperUpgradeRSmaActivity.this.mStepsIndex >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeRSmaActivity.this.mSteps)) {
                    DeveloperUpgradeRSmaActivity.this.upgradeDone();
                    return;
                }
                DeveloperUpgradeRSmaActivity.this.getProgressButton().setProgress(0.0f);
                DeveloperUpgradeRSmaActivity.this.mStepsIndex++;
                TextView tvStep2 = DeveloperUpgradeRSmaActivity.this.getTvStep();
                final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity2 = DeveloperUpgradeRSmaActivity.this;
                tvStep2.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOi110
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.XIi00iiXO.OIX0iXi(developerUpgradeRSmaActivity2);
                    }
                }, 4000L);
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int i, BleKey bleKey) {
            super.onSyncData(i, bleKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
            super.onUpdateAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay bleLeaveDay) {
            super.onUpdateAICoachLeaveDay(bleLeaveDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState bleAppSportState) {
            super.onUpdateAppSportState(bleAppSportState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC bleBAC) {
            super.onUpdateBAC(bleBAC);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure bleBloodPressure) {
            super.onUpdateBloodPressure(bleBloodPressure);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate bleHeartRate) {
            super.onUpdateHeartRate(bleHeartRate);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature bleTemperature) {
            super.onUpdateTemperature(bleTemperature);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean z) {
            super.onUpdateWatchFaceSwitch(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile bleUserProfile) {
            super.onUserProfileUpdate(bleUserProfile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int i) {
            super.onVibrationUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int i) {
            super.onVibrationUpdateV2(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean z) {
            super.onWatchFaceIdUpdate(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean z) {
            super.onWatchFaceIndexCreate(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex bleWatchFaceIndex) {
            super.onWatchFaceIndexUpdate(bleWatchFaceIndex);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword bleSettingWatchPassword) {
            super.onWatchPasswordUpdate(bleSettingWatchPassword);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int i) {
            super.onWearWayUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int i) {
            super.onWorldClockDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet bleXMLYBandSet) {
            super.onXMLYBandSetUpdate(bleXMLYBandSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte b) {
            super.onXModem(b);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean z) {
            super.onReadStock(z);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperUpgradeRSmaActivity$iO */
    public static final class C18929iO extends DfuAdapter.DfuHelperCallback {
        public C18929iO() {
        }

        public static final void I0IIOi(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            developerUpgradeRSmaActivity.upgrade();
        }

        /* JADX INFO: renamed from: IO */
        public static final void m38550IO(int i, DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            if (i == 258) {
                developerUpgradeRSmaActivity.upgrade();
                return;
            }
            if (i != 527) {
                if (i != 4097) {
                    return;
                }
                developerUpgradeRSmaActivity.setMStarted(false);
                ProgressButton.IiI10X(developerUpgradeRSmaActivity.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
                developerUpgradeRSmaActivity.onBottomClick(developerUpgradeRSmaActivity.getTvStep());
                return;
            }
            ProgressButton.O00(developerUpgradeRSmaActivity.getProgressButton(), R.string.preparing, false, 2, null);
            developerUpgradeRSmaActivity.setMOtaDeviceInfo(developerUpgradeRSmaActivity.getMDfuHelper().getOtaDeviceInfo());
            LogUtils.m11128d("onStateChanged -> mOtaDeviceInfo = " + developerUpgradeRSmaActivity.getMOtaDeviceInfo());
            developerUpgradeRSmaActivity.startOtaProcess();
        }

        public static final void IiI10X(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            ProgressButton.IiI10X(developerUpgradeRSmaActivity.getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
            developerUpgradeRSmaActivity.onBottomClick(developerUpgradeRSmaActivity.getTvStep());
        }

        public static final void OIi0(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity, DfuProgressInfo dfuProgressInfo) {
            developerUpgradeRSmaActivity.getProgressButton().setProgress(dfuProgressInfo.getProgress() / 100.0f);
        }

        public static final void XOO0ii0(int i, final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
            if (i == 258) {
                if (developerUpgradeRSmaActivity.mStepsIndex >= CollectionsKt__CollectionsKt.X11iII1O1(developerUpgradeRSmaActivity.mSteps)) {
                    developerUpgradeRSmaActivity.upgradeDone();
                    return;
                }
                developerUpgradeRSmaActivity.getProgressButton().setProgress(0.0f);
                developerUpgradeRSmaActivity.mStepsIndex++;
                developerUpgradeRSmaActivity.getTvStep().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X10X0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.C18929iO.I0IIOi(developerUpgradeRSmaActivity);
                    }
                }, 2000L);
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i, int i2) {
            LogUtils.m11129e("FirmwareUpgradeRSmaActivity onError: type=" + i + ", code" + i2);
            DeveloperUpgradeRSmaActivity.this.setMStarted(false);
            ToastUtils.showLong(R.string.firmware_upgrading_failed_and_retry);
            final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
            developerUpgradeRSmaActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XO00iXOOi
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.C18929iO.IiI10X(developerUpgradeRSmaActivity);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(final int i, Throughput throughput) {
            final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
            developerUpgradeRSmaActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iIX010II
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.C18929iO.XOO0ii0(i, developerUpgradeRSmaActivity);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(final DfuProgressInfo progressInfo) {
            Intrinsics.X0O(progressInfo, "progressInfo");
            final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
            developerUpgradeRSmaActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O001X
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.C18929iO.OIi0(developerUpgradeRSmaActivity, progressInfo);
                }
            });
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(final int i) {
            LogUtils.m11128d("onStateChanged -> state = " + i);
            final DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity = DeveloperUpgradeRSmaActivity.this;
            developerUpgradeRSmaActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OOIii10I1
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.C18929iO.m38550IO(i, developerUpgradeRSmaActivity);
                }
            });
        }
    }

    public DeveloperUpgradeRSmaActivity() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsXIi00iiXO = a01Var.XIi00iiXO();
        Object oioo0x00o = new OIOO0X00O(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(OIOO0X00O.class.getName()), (Class<Object>) OIOO0X00O.class);
        this.alreadyUpdateDeviceList = (OIOO0X00O) (objFromJson != null ? objFromJson : oioo0x00o);
        String string = a01Var.XIi00iiXO().getString(b01.XXX11i);
        this.deviceAddress = string;
        this.isAutoShutdown = a01Var.XIi00iiXO().getBoolean(b01.f5633X1, false);
        this.mDfuHelper$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1Oi11XIi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeveloperUpgradeRSmaActivity.mDfuHelper_delegate$lambda$0(this.f7643IO);
            }
        });
        this.mDfuCallback = new C18929iO();
        DfuConfig dfuConfig = new DfuConfig();
        dfuConfig.setAddress(string);
        dfuConfig.setAutomaticActiveEnabled(true);
        dfuConfig.setFileLocation(0);
        dfuConfig.setVersionCheckEnabled(false);
        this.mDfuConfig = dfuConfig;
        this.mBleHandleCallback = new XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions extraPackVersions = (ExtraPackVersions) new Gson().fromJson(a01Var.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = extraPackVersions;
        this.mLatestUi = extraPackVersions != null ? extraPackVersions.getUiPackVersion() : null;
        this.mLatestLanguage = extraPackVersions != null ? extraPackVersions.getLanguagePackVersion() : null;
        this.mLatestFont = extraPackVersions != null ? extraPackVersions.getFontPackVersion() : null;
        BleCache bleCache = BleCache.INSTANCE;
        this.mCurrentFirmware = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDownload() {
        if (this.mDownloaded == this.mSteps.size()) {
            LogUtils.m11128d("checkDownload");
            ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
            int i = OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()];
            if (i == 1) {
                getMDfuHelper().initialize(this.mDfuCallback);
                return;
            }
            if (i == 2) {
                BleConnector bleConnector = BleConnector.INSTANCE;
                if (bleConnector.isAvailable()) {
                    BleKey bleKey = BleKey.UI_FILE;
                    File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion = this.mLatestUi;
                    Intrinsics.XXI(firmwareVersion);
                    BaseBleConnector.sendStream$default(bleConnector, bleKey, new File(fileI0iXXO, firmwareVersion.getFileName()), 0, 4, (Object) null);
                    return;
                }
                GattDfuAdapter mDfuHelper = getMDfuHelper();
                if (mDfuHelper != null) {
                    mDfuHelper.abort();
                    mDfuHelper.close();
                }
                new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOIOX1i
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.checkDownload$lambda$1(this.f8076IO);
                    }
                }, 4000L);
                return;
            }
            if (i == 3) {
                BleConnector bleConnector2 = BleConnector.INSTANCE;
                if (bleConnector2.isAvailable()) {
                    BleKey bleKey2 = BleKey.LANGUAGE_FILE;
                    File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion2 = this.mLatestLanguage;
                    Intrinsics.XXI(firmwareVersion2);
                    BaseBleConnector.sendStream$default(bleConnector2, bleKey2, new File(fileI0iXXO2, firmwareVersion2.getFileName()), 0, 4, (Object) null);
                    return;
                }
                GattDfuAdapter mDfuHelper2 = getMDfuHelper();
                if (mDfuHelper2 != null) {
                    mDfuHelper2.abort();
                    mDfuHelper2.close();
                }
                new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OOXIOiO
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeRSmaActivity.checkDownload$lambda$3(this.f3325IO);
                    }
                }, 4000L);
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            BleConnector bleConnector3 = BleConnector.INSTANCE;
            if (bleConnector3.isAvailable()) {
                BleKey bleKey3 = BleKey.FONT_FILE;
                File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion3 = this.mLatestFont;
                Intrinsics.XXI(firmwareVersion3);
                BaseBleConnector.sendStream$default(bleConnector3, bleKey3, new File(fileI0iXXO3, firmwareVersion3.getFileName()), 0, 4, (Object) null);
                return;
            }
            GattDfuAdapter mDfuHelper3 = getMDfuHelper();
            if (mDfuHelper3 != null) {
                mDfuHelper3.abort();
                mDfuHelper3.close();
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXI1
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.checkDownload$lambda$5(this.f5021IO);
                }
            }, 4000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDownload$lambda$1(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDownload$lambda$3(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDownload$lambda$5(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GattDfuAdapter getMDfuHelper() {
        return (GattDfuAdapter) this.mDfuHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GattDfuAdapter mDfuHelper_delegate$lambda$0(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        return GattDfuAdapter.getInstance(developerUpgradeRSmaActivity.getMContext());
    }

    private final void otaConnect(String str) {
        getMDfuHelper().connectDevice(new ConnectParams.Builder().address(str).reconnectTimes(3).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOtaProcess() {
        DfuConfig dfuConfig = this.mDfuConfig;
        dfuConfig.setOtaWorkMode(0);
        File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        Intrinsics.XXI(firmwareVersion);
        dfuConfig.setFilePath(new File(fileI0iXXO, firmwareVersion.getFileName()).getAbsolutePath());
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.startOtaProcedure(dfuConfig, this.mOtaDeviceInfo, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        LogUtils.m11128d("upgrade");
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())));
        int i = OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()];
        if (i == 1) {
            String deviceAddress = this.deviceAddress;
            Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
            otaConnect(deviceAddress);
            return;
        }
        if (i == 2) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable()) {
                BleKey bleKey = BleKey.UI_FILE;
                File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion = this.mLatestUi;
                Intrinsics.XXI(firmwareVersion);
                BaseBleConnector.sendStream$default(bleConnector, bleKey, new File(fileI0iXXO, firmwareVersion.getFileName()), 0, 4, (Object) null);
                return;
            }
            GattDfuAdapter mDfuHelper = getMDfuHelper();
            if (mDfuHelper != null) {
                mDfuHelper.abort();
                mDfuHelper.close();
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXi01III
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.upgrade$lambda$1(this.f2122IO);
                }
            }, 4000L);
            return;
        }
        if (i == 3) {
            BleConnector bleConnector2 = BleConnector.INSTANCE;
            if (bleConnector2.isAvailable()) {
                BleKey bleKey2 = BleKey.LANGUAGE_FILE;
                File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion2 = this.mLatestLanguage;
                Intrinsics.XXI(firmwareVersion2);
                BaseBleConnector.sendStream$default(bleConnector2, bleKey2, new File(fileI0iXXO2, firmwareVersion2.getFileName()), 0, 4, (Object) null);
                return;
            }
            GattDfuAdapter mDfuHelper2 = getMDfuHelper();
            if (mDfuHelper2 != null) {
                mDfuHelper2.abort();
                mDfuHelper2.close();
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO010XXO
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeRSmaActivity.upgrade$lambda$3(this.f3119IO);
                }
            }, 4000L);
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        BleConnector bleConnector3 = BleConnector.INSTANCE;
        if (bleConnector3.isAvailable()) {
            BleKey bleKey3 = BleKey.FONT_FILE;
            File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion firmwareVersion3 = this.mLatestFont;
            Intrinsics.XXI(firmwareVersion3);
            BaseBleConnector.sendStream$default(bleConnector3, bleKey3, new File(fileI0iXXO3, firmwareVersion3.getFileName()), 0, 4, (Object) null);
            return;
        }
        GattDfuAdapter mDfuHelper3 = getMDfuHelper();
        if (mDfuHelper3 != null) {
            mDfuHelper3.abort();
            mDfuHelper3.close();
        }
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XX1IOII1X
            @Override // java.lang.Runnable
            public final void run() {
                DeveloperUpgradeRSmaActivity.upgrade$lambda$5(this.f4985IO);
            }
        }, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$1(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$3(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$5(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgradeDone() {
        if (!this.isAutoShutdown) {
            upgradeExit();
            return;
        }
        LogUtils.m11128d("start shutdown");
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMContext());
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        this.isStartShutdown = true;
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isAvailable()) {
            BaseBleConnector.sendInt8$default(bleConnector, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            return;
        }
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.abort();
            mDfuHelper.close();
        }
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1OiiOI10
            @Override // java.lang.Runnable
            public final void run() {
                DeveloperUpgradeRSmaActivity.upgradeDone$lambda$1(this.f2770IO);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgradeDone$lambda$1(DeveloperUpgradeRSmaActivity developerUpgradeRSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeRSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgradeExit() {
        this.alreadyUpdateDeviceList.XO0O10().add(this.deviceAddress);
        a01.OXO1.XIi00iiXO().put(OIOO0X00O.class.getName(), new Gson().toJson(this.alreadyUpdateDeviceList));
        finish();
    }

    @tb1
    public final OtaDeviceInfo getMOtaDeviceInfo() {
        return this.mOtaDeviceInfo;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.addHandleCallback(this.mBleHandleCallback);
        bleConnector.setNeedBind(false);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String version;
        String version2;
        String version3;
        String version4;
        super.initView();
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion == null && this.mLatestUi == null && this.mLatestLanguage == null && this.mLatestFont == null) {
            String str = this.mCurrentFirmware;
            String strIXO0OOi = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            String strIXO0OOi2 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvLatest().setText(getString(R.string.v_s, str + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi + strIXO0OOi2 + "000"));
            ViewParent parent = getTvCurrent().getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
            getProgressButton().setVisibility(8);
        } else {
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
            FirmwareVersion firmwareVersion4 = this.mLatestFont;
            String strIXO0OOi5 = oe5.IXO0OOi((firmwareVersion4 == null || (version4 = firmwareVersion4.getVersion()) == null) ? "000" : version4, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvLatest().setText(getString(R.string.v_s, version + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi3 + strIXO0OOi4 + strIXO0OOi5));
            String strIXO0OOi6 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            String strIXO0OOi7 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvCurrent().setText(getString(R.string.v_s, this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi6 + strIXO0OOi7));
            if (this.mLatestFirmware != null) {
                this.mSteps.add(FileType.FIRMWARE);
            }
            if (this.mLatestLanguage != null) {
                this.mSteps.add(FileType.LANGUAGE_PACK);
            }
            if (this.mLatestUi != null) {
                this.mSteps.add(FileType.UI_PACK);
            }
            if (this.mLatestFont != null) {
                this.mSteps.add(FileType.FONT_PACK);
            }
            getTvStep().setVisibility(0);
        }
        getDevInfo().setVisibility(0);
        TextView tvAlreadyOta = getTvAlreadyOta();
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        Object oioo0x00o = new OIOO0X00O(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(OIOO0X00O.class.getName()), (Class<Object>) OIOO0X00O.class);
        if (objFromJson != null) {
            oioo0x00o = objFromJson;
        }
        tvAlreadyOta.setText(String.valueOf(((OIOO0X00O) oioo0x00o).XO0O10().size()));
        getTvInfo().setText("R sma");
        onBottomClick(getTvStep());
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        BleConnector.INSTANCE.closeConnection(true);
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) {
            upgrade();
            return;
        }
        if (this.mLatestFirmware != null) {
            sz0 sz0Var = sz0.OXO1;
            if (new File(uz0.I0iXXO(sz0Var), this.mLatestFirmware.getFileName()).exists()) {
                this.mDownloaded++;
                checkDownload();
            } else {
                NetWorkUtils.INSTANCE.download(this.mLatestFirmware.getFileUrl(), uz0.XXI(sz0Var), this.mLatestFirmware.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeRSmaActivity.onBottomClick.1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        DeveloperUpgradeRSmaActivity.this.mDownloaded++;
                        DeveloperUpgradeRSmaActivity.this.checkDownload();
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        DeveloperUpgradeRSmaActivity.this.mDownloaded = 0;
                        DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                    }

                    @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                    public void handleProgress(int i) {
                    }
                });
            }
        }
        if (this.mLatestUi != null) {
            sz0 sz0Var2 = sz0.OXO1;
            if (new File(uz0.I0iXXO(sz0Var2), this.mLatestUi.getFileName()).exists()) {
                this.mDownloaded++;
                checkDownload();
            } else {
                NetWorkUtils.INSTANCE.download(this.mLatestUi.getFileUrl(), uz0.XXI(sz0Var2), this.mLatestUi.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeRSmaActivity.onBottomClick.2
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        DeveloperUpgradeRSmaActivity.this.mDownloaded++;
                        DeveloperUpgradeRSmaActivity.this.checkDownload();
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        DeveloperUpgradeRSmaActivity.this.mDownloaded = 0;
                        DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                    }

                    @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                    public void handleProgress(int i) {
                    }
                });
            }
        }
        if (this.mLatestLanguage != null) {
            sz0 sz0Var3 = sz0.OXO1;
            if (new File(uz0.I0iXXO(sz0Var3), this.mLatestLanguage.getFileName()).exists()) {
                this.mDownloaded++;
                checkDownload();
            } else {
                NetWorkUtils.INSTANCE.download(this.mLatestLanguage.getFileUrl(), uz0.XXI(sz0Var3), this.mLatestLanguage.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeRSmaActivity.onBottomClick.3
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        DeveloperUpgradeRSmaActivity.this.mDownloaded++;
                        DeveloperUpgradeRSmaActivity.this.checkDownload();
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        DeveloperUpgradeRSmaActivity.this.mDownloaded = 0;
                        DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                    }

                    @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                    public void handleProgress(int i) {
                    }
                });
            }
        }
        if (this.mLatestFont != null) {
            sz0 sz0Var4 = sz0.OXO1;
            if (!new File(uz0.I0iXXO(sz0Var4), this.mLatestFont.getFileName()).exists()) {
                NetWorkUtils.INSTANCE.download(this.mLatestFont.getFileUrl(), uz0.XXI(sz0Var4), this.mLatestFont.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeRSmaActivity.onBottomClick.4
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        DeveloperUpgradeRSmaActivity.this.mDownloaded++;
                        DeveloperUpgradeRSmaActivity.this.checkDownload();
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        DeveloperUpgradeRSmaActivity.this.mDownloaded = 0;
                        DeveloperUpgradeRSmaActivity.this.setMStarted(false);
                    }

                    @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                    public void handleProgress(int i) {
                    }
                });
            } else {
                this.mDownloaded++;
                checkDownload();
            }
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.removeHandleCallback(this.mBleHandleCallback);
        if (!this.mSteps.isEmpty() && this.mStepsIndex == CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) {
            BleCache bleCache = BleCache.INSTANCE;
            BaseBleCache.remove$default(bleCache, BleKey.UI_FILE, null, 2, null);
            BaseBleCache.remove$default(bleCache, BleKey.LANGUAGE_FILE, null, 2, null);
            BaseBleCache.remove$default(bleCache, BleKey.FONT_FILE, null, 2, null);
            bleConnector.closeConnection(true);
        }
        bleConnector.setNeedBind(true);
        GattDfuAdapter mDfuHelper = getMDfuHelper();
        if (mDfuHelper != null) {
            mDfuHelper.abort();
            mDfuHelper.close();
        }
        super.onDestroy();
    }

    public final void setMOtaDeviceInfo(@tb1 OtaDeviceInfo otaDeviceInfo) {
        this.mOtaDeviceInfo = otaDeviceInfo;
    }
}
