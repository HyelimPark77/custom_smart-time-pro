package com.sma.smartv3.p610ui.p612me;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C2916sc;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.OIOO0X00O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.ironsource.C12181V2;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity;
import com.sma.smartv3.p610ui.device.OTAStatus;
import com.sma.smartv3.p610ui.p612me.DeveloperUpgradeJSmaActivity;
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
    private final String TAG = "DeveloperUpgradeJ";

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
    private final C18917iO mBtEventListener;

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
    private C3006uq mLoadingPopup;

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

    public enum FileType {
        FIRMWARE,
        UI_PACK,
        LANGUAGE_PACK,
        BRAND_PACK,
        FONT_PACK,
        OTA_PACK,
        DIAL_PACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<FileType> getEntries() {
            return $ENTRIES;
        }
    }

    public static final class O00 implements IUpgradeCallback {
        public O00() {
        }

        public static final void XIi00iiXO(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
            developerUpgradeJSmaActivity.upgradeDone();
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onCancelOTA");
            DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError p0) {
            Intrinsics.X0O(p0, "p0");
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onError -> status = " + DeveloperUpgradeJSmaActivity.this.mOTAStatus + ", error = " + p0);
            ToastUtils.showLong(p0.getMessage(), new Object[0]);
            DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String p0, boolean z) {
            Intrinsics.X0O(p0, "p0");
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onNeedReconnect : " + p0 + ", " + z);
            DeveloperUpgradeJSmaActivity.this.isUseDfuAddress = true;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int i, float f) {
            if (i != 0) {
                DeveloperUpgradeJSmaActivity.this.mOTAStatus = OTAStatus.UPGRADEING;
                DeveloperUpgradeJSmaActivity.this.getProgressButton().setProgress(Math.round(f) / 100.0f);
            } else {
                DeveloperUpgradeJSmaActivity.this.mOTAStatus = OTAStatus.UPGRADE_CHECKING;
                ProgressButton progressButton = DeveloperUpgradeJSmaActivity.this.getProgressButton();
                String string = DeveloperUpgradeJSmaActivity.this.getString(R.string.check_file);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                progressButton.XIi00iiXO(string, Math.round(f) / 100.0f);
            }
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onStartOTA");
            DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onStopOTA upgrade done. " + ((System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.this.startTime) / ((long) 1000)) + "s");
            DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_STOP);
            DeveloperUpgradeJSmaActivity.this.getProgressButton().setProgress(1.0f);
            if (DeveloperUpgradeJSmaActivity.this.mStepsIndex >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeJSmaActivity.this.mSteps)) {
                TextView tvStep = DeveloperUpgradeJSmaActivity.this.getTvStep();
                final DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity = DeveloperUpgradeJSmaActivity.this;
                tvStep.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXO1X1O
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeJSmaActivity.O00.XIi00iiXO(developerUpgradeJSmaActivity);
                    }
                }, 4000L);
            } else {
                DeveloperUpgradeJSmaActivity.this.getProgressButton().setProgress(0.0f);
                DeveloperUpgradeJSmaActivity.this.mStepsIndex++;
                DeveloperUpgradeJSmaActivity.this.getTvStep().postDelayed(DeveloperUpgradeJSmaActivity.this.upgradeRunnable, 4000L);
            }
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;
        public static final /* synthetic */ int[] XIi00iiXO;

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
            try {
                iArr[FileType.BRAND_PACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FileType.OTA_PACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FileType.DIAL_PACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            OXO1 = iArr;
            int[] iArr2 = new int[OTAStatus.values().length];
            try {
                iArr2[OTAStatus.UPGRADE_SCANNING_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OTAStatus.UPGRADE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OTAStatus.UPGRADE_PREPARE_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            XIi00iiXO = iArr2;
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
                try {
                    iArr[FileType.DIAL_PACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FileType.BRAND_PACK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FileType.OTA_PACK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                OXO1 = iArr;
            }
        }

        public XIi00iiXO() {
        }

        public static final void IiI10X(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
            FileType fileType = (FileType) developerUpgradeJSmaActivity.mSteps.get(developerUpgradeJSmaActivity.mStepsIndex);
            i1O0OXO1O.OXO1.OXO1(developerUpgradeJSmaActivity.TAG + " onSessionStateChange " + fileType);
            switch (OXO1.OXO1[fileType.ordinal()]) {
                case 1:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.UI_FILE;
                    File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion = developerUpgradeJSmaActivity.mLatestUi;
                    Intrinsics.XXI(firmwareVersion);
                    BaseBleConnector.sendStream$default(bleConnector, bleKey, new File(fileI0iXXO, firmwareVersion.getFileName()), 0, 4, (Object) null);
                    break;
                case 2:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector2 = BleConnector.INSTANCE;
                    BleKey bleKey2 = BleKey.LANGUAGE_FILE;
                    File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion2 = developerUpgradeJSmaActivity.mLatestLanguage;
                    Intrinsics.XXI(firmwareVersion2);
                    BaseBleConnector.sendStream$default(bleConnector2, bleKey2, new File(fileI0iXXO2, firmwareVersion2.getFileName()), 0, 4, (Object) null);
                    break;
                case 3:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector3 = BleConnector.INSTANCE;
                    BleKey bleKey3 = BleKey.FONT_FILE;
                    File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion3 = developerUpgradeJSmaActivity.mLatestFont;
                    Intrinsics.XXI(firmwareVersion3);
                    BaseBleConnector.sendStream$default(bleConnector3, bleKey3, new File(fileI0iXXO3, firmwareVersion3.getFileName()), 0, 4, (Object) null);
                    break;
                case 4:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector4 = BleConnector.INSTANCE;
                    BleKey bleKey4 = BleKey.FAT_BIN_FILE;
                    File fileI0iXXO4 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion4 = developerUpgradeJSmaActivity.mLatestDial;
                    Intrinsics.XXI(firmwareVersion4);
                    BaseBleConnector.sendStream$default(bleConnector4, bleKey4, new File(fileI0iXXO4, firmwareVersion4.getFileName()), 0, 4, (Object) null);
                    break;
                case 5:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector5 = BleConnector.INSTANCE;
                    BleKey bleKey5 = BleKey.BRAND_INFO_FILE;
                    File fileI0iXXO5 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion5 = developerUpgradeJSmaActivity.mLatestBrand;
                    Intrinsics.XXI(firmwareVersion5);
                    BaseBleConnector.sendStream$default(bleConnector5, bleKey5, new File(fileI0iXXO5, firmwareVersion5.getFileName()), 0, 4, (Object) null);
                    break;
                case 6:
                    ProgressButton.O00(developerUpgradeJSmaActivity.getProgressButton(), R.string.Parsing, false, 2, null);
                    BleConnector bleConnector6 = BleConnector.INSTANCE;
                    BleKey bleKey6 = BleKey.OTA_FILE;
                    File fileI0iXXO6 = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion6 = developerUpgradeJSmaActivity.mLatestFirmware;
                    Intrinsics.XXI(firmwareVersion6);
                    BaseBleConnector.sendStream$default(bleConnector6, bleKey6, new File(fileI0iXXO6, firmwareVersion6.getFileName()), 0, 4, (Object) null);
                    break;
            }
        }

        public static final void O00(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
            C3006uq c3006uq = developerUpgradeJSmaActivity.mLoadingPopup;
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
            i1O0OXO1O.OXO1.OXO1(developerUpgradeJSmaActivity.TAG + " force exit");
            developerUpgradeJSmaActivity.upgradeExit();
        }

        public static final void XO0O10(final DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
            i1O0OXO1O.OXO1.OXO1(developerUpgradeJSmaActivity.TAG + " SESSION CREATE");
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.SESSION;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            Random.Default r0 = Random.Default;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag, r0.nextInt(), null, false, false, 56, null);
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag2, r0.nextInt(), null, false, false, 56, null);
            if (developerUpgradeJSmaActivity.isStartShutdown) {
                BaseBleConnector.sendInt8$default(bleConnector, BleKey.SHUTDOWN, bleKeyFlag2, 0, false, false, 24, null);
                new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1O0iX1X
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperUpgradeJSmaActivity.XIi00iiXO.O00(developerUpgradeJSmaActivity);
                    }
                }, 3000L);
            }
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
                C3006uq c3006uq = DeveloperUpgradeJSmaActivity.this.mLoadingPopup;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " shutdown success");
                DeveloperUpgradeJSmaActivity.this.upgradeExit();
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.UI_FILE || bleKey == BleKey.LANGUAGE_FILE || bleKey == BleKey.OTA_FILE) {
                DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                ProgressButton.O00(DeveloperUpgradeJSmaActivity.this.getProgressButton(), R.string.starting, false, 2, null);
                DeveloperUpgradeJSmaActivity.this.getTvStep().postDelayed(DeveloperUpgradeJSmaActivity.this.upgradeRunnable, 8000L);
            } else if (bleKey == BleKey.SESSION) {
                BleConnector bleConnector = BleConnector.INSTANCE;
                String str = DeveloperUpgradeJSmaActivity.this.deviceAddress;
                Intrinsics.O10IXXX0X(str, "access$getDeviceAddress$p(...)");
                bleConnector.setAddress(str).connect(true);
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
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onDeviceConnected " + DeveloperUpgradeJSmaActivity.this.isStartShutdown + " BUFFER_MAX_SIZE: " + BleStreamPacket.Companion.getBUFFER_MAX_SIZE());
            Handler handler = new Handler();
            final DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity = DeveloperUpgradeJSmaActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO1XX1X
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeJSmaActivity.XIi00iiXO.XO0O10(developerUpgradeJSmaActivity);
                }
            }, 5000L);
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
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = DeveloperUpgradeJSmaActivity.this.TAG;
            BleStreamPacket.Companion companion = BleStreamPacket.Companion;
            i1o0oxo1o.OXO1(str + " onSessionStateChange BUFFER_MAX_SIZE: " + companion.getBUFFER_MAX_SIZE());
            if (!z) {
                DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                companion.setBUFFER_MAX_SIZE(480L);
                return;
            }
            companion.setBUFFER_MAX_SIZE(a01.OXO1.XIi00iiXO().getLong(b01.IO0II0i, 1018L));
            i1o0oxo1o.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onSessionStateChange BUFFER_MAX_SIZE: " + companion.getBUFFER_MAX_SIZE() + ", step:" + DeveloperUpgradeJSmaActivity.this.mSteps.get(DeveloperUpgradeJSmaActivity.this.mStepsIndex));
            DeveloperUpgradeJSmaActivity.this.startTime = System.currentTimeMillis();
            DeveloperUpgradeJSmaActivity.this.getTvStep().setVisibility(0);
            ProgressButton.O00(DeveloperUpgradeJSmaActivity.this.getProgressButton(), R.string.starting, false, 2, null);
            TextView tvStep = DeveloperUpgradeJSmaActivity.this.getTvStep();
            DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity = DeveloperUpgradeJSmaActivity.this;
            tvStep.setText(developerUpgradeJSmaActivity.getString(R.string.upgrade_steps_d_d, Integer.valueOf(developerUpgradeJSmaActivity.mStepsIndex + 1), Integer.valueOf(DeveloperUpgradeJSmaActivity.this.mSteps.size())));
            Handler handler = new Handler();
            final DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity2 = DeveloperUpgradeJSmaActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi1i1
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeJSmaActivity.XIi00iiXO.IiI10X(developerUpgradeJSmaActivity2);
                }
            }, 1000L);
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
                DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                ProgressButton.O00(DeveloperUpgradeJSmaActivity.this.getProgressButton(), R.string.starting, false, 2, null);
                DeveloperUpgradeJSmaActivity.this.getTvStep().removeCallbacks(DeveloperUpgradeJSmaActivity.this.upgradeRunnable);
                DeveloperUpgradeJSmaActivity.this.getTvStep().postDelayed(DeveloperUpgradeJSmaActivity.this.upgradeRunnable, 8000L);
                return;
            }
            if (System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.this.time1 > 1000) {
                DeveloperUpgradeJSmaActivity.this.time1 = System.currentTimeMillis();
                DeveloperUpgradeJSmaActivity.this.getTvSpeed().setText(new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(((double) (i3 - DeveloperUpgradeJSmaActivity.this.lastPackageSize)) / 1024.0d) + " KB/s");
                DeveloperUpgradeJSmaActivity.this.lastPackageSize = i3;
            }
            DeveloperUpgradeJSmaActivity.this.getProgressButton().setProgressDecimalPlaces(i3 / i2);
            if (i2 == i3) {
                i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " onStreamProgress " + bleKey + " done. " + ((System.currentTimeMillis() - DeveloperUpgradeJSmaActivity.this.startTime) / ((long) 1000)) + "s");
                if (DeveloperUpgradeJSmaActivity.this.mStepsIndex >= CollectionsKt__CollectionsKt.X11iII1O1(DeveloperUpgradeJSmaActivity.this.mSteps)) {
                    DeveloperUpgradeJSmaActivity.this.upgradeDone();
                    return;
                }
                DeveloperUpgradeJSmaActivity.this.getProgressButton().setProgress(0.0f);
                if (DeveloperUpgradeJSmaActivity.this.mSteps.get(DeveloperUpgradeJSmaActivity.this.mStepsIndex) != FileType.OTA_PACK) {
                    DeveloperUpgradeJSmaActivity.this.getTvStep().postDelayed(DeveloperUpgradeJSmaActivity.this.upgradeRunnable, 5000L);
                }
                DeveloperUpgradeJSmaActivity.this.mStepsIndex++;
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

    public static final class XO0O10 extends BtEventCallback {
        public XO0O10() {
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
        public void onConnection(BluetoothDevice device, int i) {
            Intrinsics.X0O(device, "device");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = DeveloperUpgradeJSmaActivity.this.TAG;
            OTAStatus oTAStatus = DeveloperUpgradeJSmaActivity.this.mOTAStatus;
            OTAManager oTAManager = DeveloperUpgradeJSmaActivity.this.mOTAManager;
            Intrinsics.XXI(oTAManager);
            i1o0oxo1o.OXO1(str + " ota onConnection -> mOTAStatus = " + oTAStatus + ", " + device + " ,status = " + i + " ,isOTA = " + oTAManager.isOTA());
            OTAManager oTAManager2 = DeveloperUpgradeJSmaActivity.this.mOTAManager;
            Intrinsics.XXI(oTAManager2);
            if (oTAManager2.isOTA()) {
                return;
            }
            if (i == 0) {
                i1o0oxo1o.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " ota onConnection -> device disconnected");
                if (DeveloperUpgradeJSmaActivity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                    DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity = DeveloperUpgradeJSmaActivity.this;
            if (developerUpgradeJSmaActivity.canOTA(developerUpgradeJSmaActivity.mOTAStatus)) {
                DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity2 = DeveloperUpgradeJSmaActivity.this;
                File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion = DeveloperUpgradeJSmaActivity.this.mLatestFirmware;
                Intrinsics.XXI(firmwareVersion);
                String absolutePath = new File(fileI0iXXO, firmwareVersion.getFileName()).getAbsolutePath();
                Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                developerUpgradeJSmaActivity2.startOTA(absolutePath);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity$iO */
    public static final class C18917iO extends BluetoothEventListener {
        public C18917iO() {
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean z) {
            i1O0OXO1O.OXO1.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " bt onAdapterStatus " + z);
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice device, int i) {
            Intrinsics.X0O(device, "device");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = DeveloperUpgradeJSmaActivity.this.TAG;
            OTAStatus oTAStatus = DeveloperUpgradeJSmaActivity.this.mOTAStatus;
            OTAManager oTAManager = DeveloperUpgradeJSmaActivity.this.mOTAManager;
            i1o0oxo1o.OXO1(str + " bt onConnection -> mOTAStatus = " + oTAStatus + ", " + device + " ,status = " + i + " ,isOTA = " + (oTAManager != null ? Boolean.valueOf(oTAManager.isOTA()) : null));
            if (i == 0) {
                i1o0oxo1o.OXO1(DeveloperUpgradeJSmaActivity.this.TAG + " bt onConnection -> device disconnected");
                if (DeveloperUpgradeJSmaActivity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                    DeveloperUpgradeJSmaActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
                }
            }
        }
    }

    public DeveloperUpgradeJSmaActivity() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsXIi00iiXO = a01Var.XIi00iiXO();
        Object oioo0x00o = new OIOO0X00O(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(OIOO0X00O.class.getName()), (Class<Object>) OIOO0X00O.class);
        this.alreadyUpdateDeviceList = (OIOO0X00O) (objFromJson != null ? objFromJson : oioo0x00o);
        String deviceAddress = a01Var.XIi00iiXO().getString(b01.XXX11i);
        this.deviceAddress = deviceAddress;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        String str = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(Long.parseLong(oe5.IXO0OOi(deviceAddress, CertificateUtil.DELIMITER, "", false, 4, null), kotlin.text.OXO1.OXO1(16)) + 1)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.deviceOTAAddress = CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(str, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
        this.isAutoShutdown = a01Var.XIi00iiXO().getBoolean(b01.f5633X1, false);
        this.isSupportOTAFile = a01Var.XIi00iiXO().getBoolean(b01.IXOIIIO, false);
        this.isRepairMode = -1;
        this.mOTAStatus = OTAStatus.NONE;
        this.upgradeRunnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.i00XI11i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7282IO.upgrade();
            }
        };
        this.mBtEventListener = new C18917iO();
        this.mOTAEventCallback = new XO0O10();
        this.mBleHandleCallback = new XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ExtraPackVersions extraPackVersions = (ExtraPackVersions) new Gson().fromJson(a01Var.XIi00iiXO().getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        this.mLatestExtraPacks = extraPackVersions;
        this.mLatestUi = extraPackVersions != null ? extraPackVersions.getUiPackVersion() : null;
        this.mLatestLanguage = extraPackVersions != null ? extraPackVersions.getLanguagePackVersion() : null;
        this.mLatestBrand = extraPackVersions != null ? extraPackVersions.getBrandPackVersion() : null;
        this.mLatestFont = extraPackVersions != null ? extraPackVersions.getFontPackVersion() : null;
        this.mLatestDial = extraPackVersions != null ? extraPackVersions.getDialPackVersion() : null;
        BleCache bleCache = BleCache.INSTANCE;
        this.mCurrentFirmware = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mCurrentUi = BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, null, null, 6, null);
        this.mCurrentLanguage = ((BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null)).getMVersion();
        this.mSteps = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOTA(OTAStatus oTAStatus) {
        return (isOTAError(oTAStatus) || oTAStatus == OTAStatus.UPGRADE_STOP) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDownload() {
        if (this.mDownloaded == this.mSteps.size()) {
            ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
            upgrade();
        }
    }

    private final void connectDevice(String str) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " connectDevice: " + str);
        BluetoothHelper bluetoothHelper = this.mBluetoothHelper;
        if (bluetoothHelper != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            bluetoothHelper.connectDevice(defaultAdapter != null ? defaultAdapter.getRemoteDevice(str) : null);
        }
    }

    private final void destroyOTA() {
        OTAManager oTAManager = this.mOTAManager;
        if (oTAManager != null) {
            oTAManager.unregisterBluetoothCallback(this.mOTAEventCallback);
        }
        OTAManager oTAManager2 = this.mOTAManager;
        if (oTAManager2 != null) {
            oTAManager2.release();
        }
        this.mOTAManager = null;
        BluetoothHelper bluetoothHelper = this.mBluetoothHelper;
        if (bluetoothHelper != null) {
            bluetoothHelper.removeBluetoothEventListener(this.mBtEventListener);
        }
        BluetoothHelper bluetoothHelper2 = this.mBluetoothHelper;
        if (bluetoothHelper2 != null) {
            bluetoothHelper2.destroy();
        }
        this.mBluetoothHelper = null;
    }

    private final void initOTA() {
        BluetoothHelper bluetoothHelper = BluetoothHelper.getInstance(Utils.getApp());
        this.mBluetoothHelper = bluetoothHelper;
        if (bluetoothHelper != null) {
            bluetoothHelper.addBluetoothEventListener(this.mBtEventListener);
        }
        OTAManager oTAManager = new OTAManager(this);
        this.mOTAManager = oTAManager;
        oTAManager.registerBluetoothCallback(this.mOTAEventCallback);
    }

    private final boolean isOTAError(OTAStatus oTAStatus) {
        int i = OXO1.XIi00iiXO[oTAStatus.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUpgradeStatus(OTAStatus oTAStatus) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " updateUpgradeStatus status = " + oTAStatus + ", autoRetryCount = " + this.autoRetryCount);
        this.mOTAStatus = oTAStatus;
        if (!isOTAError(oTAStatus)) {
            setMStarted(true);
            return;
        }
        int i = this.autoRetryCount;
        if (i >= 1) {
            this.autoRetryCount = 0;
            setMStarted(false);
            ProgressButton.O00(getProgressButton(), R.string.firmware_upgrading_failed, false, 2, null);
            finish();
            return;
        }
        i1o0oxo1o.OXO1(this.TAG + " wait to retry Upgrade -> autoRetryCount = " + i);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iI10i1IX
            @Override // java.lang.Runnable
            public final void run() {
                DeveloperUpgradeJSmaActivity.updateUpgradeStatus$lambda$0(this.f7813IO);
            }
        }, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUpgradeStatus$lambda$0(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        developerUpgradeJSmaActivity.autoRetryCount++;
        if (developerUpgradeJSmaActivity.isOTAError(developerUpgradeJSmaActivity.mOTAStatus)) {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(developerUpgradeJSmaActivity.TAG + " retry Upgrade -> autoRetryCount = " + developerUpgradeJSmaActivity.autoRetryCount);
            developerUpgradeJSmaActivity.destroyOTA();
            developerUpgradeJSmaActivity.initOTA();
            if (developerUpgradeJSmaActivity.isUseDfuAddress) {
                i1o0oxo1o.OXO1(developerUpgradeJSmaActivity.TAG + " upgrade -> use dfuAddress");
                developerUpgradeJSmaActivity.connectDevice(developerUpgradeJSmaActivity.deviceOTAAddress);
            } else {
                i1o0oxo1o.OXO1(developerUpgradeJSmaActivity.TAG + " upgrade -> use bleAddress");
                String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
                Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
                developerUpgradeJSmaActivity.connectDevice(deviceAddress);
            }
            developerUpgradeJSmaActivity.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgrade() {
        this.startTime = System.currentTimeMillis();
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())));
        switch (OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()]) {
            case 1:
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("FIRMWARE");
                destroyOTA();
                initOTA();
                if (this.isUseDfuAddress) {
                    i1o0oxo1o.OXO1(this.TAG + " upgrade -> use dfuAddress");
                    connectDevice(this.deviceOTAAddress);
                } else {
                    i1o0oxo1o.OXO1(this.TAG + " upgrade -> use bleAddress");
                    String deviceAddress = this.deviceAddress;
                    Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
                    connectDevice(deviceAddress);
                }
                updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
                return;
            case 2:
                i1O0OXO1O.OXO1.OXO1("UI_PACK");
                jlDestory();
                BleConnector bleConnector = BleConnector.INSTANCE;
                if (!bleConnector.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O111OiI
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$0(this.f2668IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey = BleKey.UI_FILE;
                File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion = this.mLatestUi;
                Intrinsics.XXI(firmwareVersion);
                BaseBleConnector.sendStream$default(bleConnector, bleKey, new File(fileI0iXXO, firmwareVersion.getFileName()), 0, 4, (Object) null);
                return;
            case 3:
                i1O0OXO1O.OXO1.OXO1("LANGUAGE_PACK");
                jlDestory();
                BleConnector bleConnector2 = BleConnector.INSTANCE;
                if (!bleConnector2.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I001OO0X
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$1(this.f1012IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey2 = BleKey.LANGUAGE_FILE;
                File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion2 = this.mLatestLanguage;
                Intrinsics.XXI(firmwareVersion2);
                BaseBleConnector.sendStream$default(bleConnector2, bleKey2, new File(fileI0iXXO2, firmwareVersion2.getFileName()), 0, 4, (Object) null);
                return;
            case 4:
                i1O0OXO1O.OXO1.OXO1("FONT_PACK");
                jlDestory();
                BleConnector bleConnector3 = BleConnector.INSTANCE;
                if (!bleConnector3.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I0Ii1XOO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$2(this.f1135IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey3 = BleKey.FONT_FILE;
                File fileI0iXXO3 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion3 = this.mLatestFont;
                Intrinsics.XXI(firmwareVersion3);
                BaseBleConnector.sendStream$default(bleConnector3, bleKey3, new File(fileI0iXXO3, firmwareVersion3.getFileName()), 0, 4, (Object) null);
                return;
            case 5:
                i1O0OXO1O.OXO1.OXO1("BRAND_PACK");
                jlDestory();
                BleConnector bleConnector4 = BleConnector.INSTANCE;
                if (!bleConnector4.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXOO
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$3(this.f3510IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey4 = BleKey.BRAND_INFO_FILE;
                File fileI0iXXO4 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion4 = this.mLatestBrand;
                Intrinsics.XXI(firmwareVersion4);
                BaseBleConnector.sendStream$default(bleConnector4, bleKey4, new File(fileI0iXXO4, firmwareVersion4.getFileName()), 0, 4, (Object) null);
                return;
            case 6:
                i1O0OXO1O.OXO1.OXO1("OTA_PACK");
                jlDestory();
                BleConnector bleConnector5 = BleConnector.INSTANCE;
                if (!bleConnector5.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I1O01X1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$4(this.f1405IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey5 = BleKey.OTA_FILE;
                File fileI0iXXO5 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion5 = this.mLatestFirmware;
                Intrinsics.XXI(firmwareVersion5);
                BaseBleConnector.sendStream$default(bleConnector5, bleKey5, new File(fileI0iXXO5, firmwareVersion5.getFileName()), 0, 4, (Object) null);
                return;
            case 7:
                i1O0OXO1O.OXO1.OXO1("DIAL_PACK");
                jlDestory();
                BleConnector bleConnector6 = BleConnector.INSTANCE;
                if (!bleConnector6.isAvailable()) {
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOIIXI0II
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperUpgradeJSmaActivity.upgrade$lambda$5(this.f8068IO);
                        }
                    }, 4000L);
                    return;
                }
                BleKey bleKey6 = BleKey.FAT_BIN_FILE;
                File fileI0iXXO6 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion6 = this.mLatestDial;
                Intrinsics.XXI(firmwareVersion6);
                BaseBleConnector.sendStream$default(bleConnector6, bleKey6, new File(fileI0iXXO6, firmwareVersion6.getFileName()), 0, 4, (Object) null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$0(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$1(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$2(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$3(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$4(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgrade$lambda$5(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgradeDone() {
        if (this.isRepairMode == 1) {
            finish();
            return;
        }
        if (!this.isAutoShutdown) {
            upgradeExit();
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " start shutdown");
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMContext());
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.II0i1O0X
            @Override // java.lang.Runnable
            public final void run() {
                DeveloperUpgradeJSmaActivity.upgradeDone$lambda$0(this.f1533IO);
            }
        }, C12181V2.f30291h);
        this.isStartShutdown = true;
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isAvailable()) {
            BaseBleConnector.sendInt8$default(bleConnector, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OII1XX1
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperUpgradeJSmaActivity.upgradeDone$lambda$1(this.f2957IO);
                }
            }, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgradeDone$lambda$0(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        C3006uq c3006uq = developerUpgradeJSmaActivity.mLoadingPopup;
        if (c3006uq == null || !c3006uq.isShowing()) {
            return;
        }
        C3006uq c3006uq2 = developerUpgradeJSmaActivity.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.dismiss();
        }
        i1O0OXO1O.OXO1.OXO1(developerUpgradeJSmaActivity.TAG + " shutdown time out force exit!");
        developerUpgradeJSmaActivity.upgradeExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgradeDone$lambda$1(DeveloperUpgradeJSmaActivity developerUpgradeJSmaActivity) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        String deviceAddress = developerUpgradeJSmaActivity.deviceAddress;
        Intrinsics.O10IXXX0X(deviceAddress, "deviceAddress");
        bleConnector.setAddress(deviceAddress).connect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upgradeExit() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " ota => upgradeExit");
        this.alreadyUpdateDeviceList.XO0O10().add(this.deviceAddress);
        a01.OXO1.XIi00iiXO().put(OIOO0X00O.class.getName(), new Gson().toJson(this.alreadyUpdateDeviceList));
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.isRepairMode = getMArg1();
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.addHandleCallback(this.mBleHandleCallback);
        bleConnector.setNeedBind(false);
        C2916sc.XIi00iiXO(this);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String version;
        String version2;
        String version3;
        String version4;
        String version5;
        super.initView();
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion == null && this.mLatestUi == null && this.mLatestLanguage == null && this.mLatestBrand == null && this.mLatestFont == null && this.mLatestDial == null) {
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
            FirmwareVersion firmwareVersion4 = this.mLatestBrand;
            if (firmwareVersion4 == null || (version4 = firmwareVersion4.getVersion()) == null) {
                version4 = "0.0.0";
            }
            String strIXO0OOi5 = oe5.IXO0OOi(version4, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            FirmwareVersion firmwareVersion5 = this.mLatestFont;
            String strIXO0OOi6 = oe5.IXO0OOi((firmwareVersion5 == null || (version5 = firmwareVersion5.getVersion()) == null) ? "000" : version5, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvLatest().setText(getString(R.string.v_s, version + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi3 + strIXO0OOi4 + strIXO0OOi5 + strIXO0OOi6));
            String strIXO0OOi7 = oe5.IXO0OOi(this.mCurrentUi, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            String strIXO0OOi8 = oe5.IXO0OOi(this.mCurrentLanguage, FileUtils.FILE_EXTENSION_SEPARATOR, "", false, 4, null);
            getTvCurrent().setText(getString(R.string.v_s, this.mCurrentFirmware + FileUtils.FILE_EXTENSION_SEPARATOR + strIXO0OOi7 + strIXO0OOi8));
            if (this.mLatestFirmware != null) {
                if (this.isSupportOTAFile) {
                    this.mSteps.add(FileType.OTA_PACK);
                } else {
                    this.mSteps.add(FileType.FIRMWARE);
                }
            }
            if (this.isRepairMode != 1) {
                if (this.mLatestLanguage != null) {
                    this.mSteps.add(FileType.LANGUAGE_PACK);
                }
                if (this.mLatestUi != null) {
                    this.mSteps.add(FileType.UI_PACK);
                }
                if (this.mLatestFont != null) {
                    this.mSteps.add(FileType.FONT_PACK);
                }
                if (this.mLatestDial != null) {
                    this.mSteps.add(FileType.DIAL_PACK);
                }
                if (this.mLatestBrand != null) {
                    this.mSteps.add(FileType.BRAND_PACK);
                }
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
        getTvInfo().setText("Jsma " + this.deviceAddress + ", Mode:" + this.isRepairMode + ", " + this.isSupportOTAFile);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " ota => deviceAddress:" + this.deviceAddress + " deviceOTAAddress:" + this.deviceOTAAddress + ", mSteps:" + this.mSteps);
        onBottomClick(getTvStep());
    }

    public final void jlDestory() {
        destroyOTA();
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        BleConnector.INSTANCE.unbind();
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) {
            upgrade();
            return;
        }
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion2 = this.mLatestUi;
        if (firmwareVersion2 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion2.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestUi.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.2
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion3 = this.mLatestLanguage;
        if (firmwareVersion3 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion3.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestLanguage.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.3
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion4 = this.mLatestBrand;
        if (firmwareVersion4 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion4.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestBrand.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.4
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion5 = this.mLatestFont;
        if (firmwareVersion5 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion5.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestFont.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.5
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
        FirmwareVersion firmwareVersion6 = this.mLatestDial;
        if (firmwareVersion6 != null) {
            NetWorkUtils.INSTANCE.download(firmwareVersion6.getFileUrl(), uz0.XXI(sz0.OXO1), this.mLatestDial.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.me.DeveloperUpgradeJSmaActivity.onBottomClick.6
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    DeveloperUpgradeJSmaActivity.this.mDownloaded++;
                    DeveloperUpgradeJSmaActivity.this.checkDownload();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    DeveloperUpgradeJSmaActivity.this.mDownloaded = 0;
                    DeveloperUpgradeJSmaActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.removeHandleCallback(this.mBleHandleCallback);
        if (!this.mSteps.isEmpty() && this.mStepsIndex == CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) {
            BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.UI_FILE, null, 2, null);
            bleConnector.closeConnection(true);
        }
        bleConnector.setNeedBind(true);
        jlDestory();
        super.onDestroy();
    }

    public final void startOTA(@aa1 String filePath) {
        BluetoothOTAConfigure bluetoothOption;
        Intrinsics.X0O(filePath, "filePath");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA :: " + filePath);
        OTAManager oTAManager = this.mOTAManager;
        if (oTAManager != null && (bluetoothOption = oTAManager.getBluetoothOption()) != null) {
            bluetoothOption.setFirmwareFilePath(filePath);
        }
        OTAManager oTAManager2 = this.mOTAManager;
        if (oTAManager2 != null) {
            oTAManager2.startOTA(new O00());
        }
    }
}
