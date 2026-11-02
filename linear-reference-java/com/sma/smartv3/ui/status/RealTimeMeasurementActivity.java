package com.sma.smartv3.ui.status;

import android.bluetooth.BluetoothDevice;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah2;
import com.android.mltcode.paycertificationapi.bh2;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.og2;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.pg2;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qg2;
import com.android.mltcode.paycertificationapi.rg2;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sg2;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tg2;
import com.android.mltcode.paycertificationapi.ug2;
import com.android.mltcode.paycertificationapi.vg2;
import com.android.mltcode.paycertificationapi.wg2;
import com.android.mltcode.paycertificationapi.xg2;
import com.android.mltcode.paycertificationapi.yg2;
import com.android.mltcode.paycertificationapi.zg2;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
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
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRealTimeMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,621:1\n19#2:622\n15#2:623\n19#2:624\n15#2:625\n*S KotlinDebug\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n*L\n250#1:622\n250#1:623\n349#1:624\n349#1:625\n*E\n"})
public final class RealTimeMeasurementActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int TYPE_BLOOD_OXYGEN = 2;
    public static final int TYPE_BLOOD_PRESSURE = 1;
    public static final int TYPE_HEARTRATE = 0;
    public static final int TYPE_HRV = 5;
    public static final int TYPE_PRESSURE = 3;
    public static final int TYPE_TEMPERATURE = 4;
    private final long MAX_TIME_OUT;
    private final long MEASUREMENT_COMPLETE_TIME;

    @aa1
    private final Lazy btnBottom$delegate;
    private boolean flag;
    private boolean isShowPopup;

    @aa1
    private final Lazy ivIcMeasurement$delegate;

    @aa1
    private final Lazy llMeasurement$delegate;

    @aa1
    private final XIi00iiXO mBleHandleCallback;

    @aa1
    private final BloodOxygenDao mBloodOxygenDao;

    @aa1
    private final BloodPressureDao mBloodPressureDao;
    private int mCurMeasureType;

    @aa1
    private final Handler mHandler;

    @aa1
    private final HeartRateDao mHeartRateDao;

    @aa1
    private final HrvDao mHrvDao;
    private int mLastBpm;

    @tb1
    private go0 mLeavePromptPopup;

    @tb1
    private go0 mMeasurementCompletePopup;

    @aa1
    private final iO mMeasurementCompleteRunnable;

    @aa1
    private final PressureDao mPressureDao;
    private long mStartTime;

    @aa1
    private final TemperatureDao mTemperatureDao;

    @aa1
    private final Runnable mTimeoutDetectRunnable;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvInfo$delegate;

    @aa1
    private final Lazy tvUnit$delegate;

    @aa1
    private final Lazy tvValue$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ RealTimeMeasurementActivity IO;

        public XIi00iiXO(RealTimeMeasurementActivity r1) {
            this.IO = r1;
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
        public /* bridge */ void onCommandSendTimeout(BleKey r1, BleKeyFlag r2) {
            super.onCommandSendTimeout(r1, r2);
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
        public void onRealTimeMeasurement(BleRealTimeMeasurement r12) {
            Intrinsics.X0O(r12, "realTimeMeasurement");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.IiI10X("measurement mState" + r12.getMState());
            if (r12.getMState() != 1) goto L12;
            if ((System.currentTimeMillis() - RealTimeMeasurementActivity.access$getMStartTime$p(this.IO)) < 1000) goto L47;
            r0.IiI10X("measurement failed");
            if (RealTimeMeasurementActivity.access$isShowPopup$p(this.IO) == false) goto L43;
            RealTimeMeasurementActivity.access$showMessureFailedPopup(this.IO);
            return;
        L43:
            return;
        L47:
            return;
        L12:
            if (r12.getMState() != 0) goto L38;
            if (r12.getMHRSwitch() != 1) goto L18;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.HEART_RATE, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L18:
            if (r12.getMBPSwitch() != 1) goto L22;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.BLOOD_PRESSURE, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L22:
            if (r12.getMBOSwitch() != 1) goto L26;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.BLOOD_OXYGEN, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L26:
            if (r12.getMTemperature() != 1) goto L30;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.TEMPERATURE, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L30:
            if (r12.getMStressSwitch() != 1) goto L34;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.PRESSURE, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L34:
            if (r12.getMHrvSwitch() != 1) goto L44;
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.HRV, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        L44:
            return;
        L38:
            if (r12.getMState() != 3) goto L45;
            ToastUtils.showLong(R.string.not_wearing_tip);
            if (RealTimeMeasurementActivity.access$isShowPopup$p(this.IO) == false) goto L46;
            RealTimeMeasurementActivity.access$showMessureFailedPopup(this.IO);
            return;
        L46:
            return;
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
        public /* bridge */ void onSessionStateChange(boolean r1) {
            super.onSessionStateChange(r1);
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
        public /* bridge */ void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            super.onStreamProgress(r1, r2, r3, r4, r5);
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
        public void onUpdateHeartRate(BleHeartRate r4) {
            Intrinsics.X0O(r4, "heartRate");
            if (RealTimeMeasurementActivity.access$getMCurMeasureType$p(this.IO) != 0) goto L10;
            RealTimeMeasurementActivity.access$setMLastBpm$p(this.IO, r4.getMBpm());
            RealTimeMeasurementActivity.access$getTvValue(this.IO).setText(UtilsKt.iXiiiO(RealTimeMeasurementActivity.access$getMLastBpm$p(this.IO)));
            RealTimeMeasurementActivity.access$getMHandler$p(this.IO).removeCallbacks(RealTimeMeasurementActivity.access$getMTimeoutDetectRunnable$p(this.IO));
            RealTimeMeasurementActivity.access$getMHandler$p(this.IO).postDelayed(RealTimeMeasurementActivity.access$getMTimeoutDetectRunnable$p(this.IO), RealTimeMeasurementActivity.access$getMAX_TIME_OUT$p(this.IO));
            RealTimeMeasurementActivity.access$getBtnBottom(this.IO).setVisibility(0);
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            if (RealTimeMeasurementActivity.access$getFlag$p(this.IO) == true) goto L7;
            return;
        L7:
            if (q62.OXO1.X0100I() == false) goto L12;
            RealTimeMeasurementActivity.access$setFlag$p(this.IO, false);
            RealTimeMeasurementActivity.access$getMHandler$p(this.IO).postDelayed(RealTimeMeasurementActivity.access$getMMeasurementCompleteRunnable$p(this.IO), RealTimeMeasurementActivity.access$getMEASUREMENT_COMPLETE_TIME$p(this.IO));
            return;
        L12:
            return;
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

    public static final class iO implements Runnable {
        public final /* synthetic */ RealTimeMeasurementActivity IO;

        public iO(RealTimeMeasurementActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i1O0OXO1O.OXO1.OXO1("measure MeasurementComplete");
            RealTimeMeasurementActivity.access$onMeasurementComplete(this.IO);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.status.RealTimeMeasurementActivity$sendHeartRate$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.status.RealTimeMeasurementActivity$sendHeartRate$1", f = "RealTimeMeasurementActivity.kt", i = {}, l = {152, 154}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
            return new AnonymousClass1(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r13) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L10;
            if (r1 == 1) goto L9;
            if (r1 != 2) goto L8;
            ResultKt.X1ii(r13);
        L16:
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ResultKt.X1ii(r13);
        L13:
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.HEART_RATE, BleKeyFlag.READ, null, false, false, 28, null);
            this.label = 2;
            if (DelayKt.XIi00iiXO(500, this) != r0) goto L16;
        L15:
            return r0;
        L10:
            ResultKt.X1ii(r13);
            this.label = 1;
            if (DelayKt.XIi00iiXO(50, this) != r0) goto L13;
            goto L13
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.status.RealTimeMeasurementActivity$showMeasurementCompletePopup$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.status.RealTimeMeasurementActivity$showMeasurementCompletePopup$2", f = "RealTimeMeasurementActivity.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RealTimeMeasurementActivity this$0;

        public AnonymousClass2(RealTimeMeasurementActivity r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass2(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            go0 r5 = RealTimeMeasurementActivity.access$getMMeasurementCompletePopup$p(this.this$0);
            if (r5 == null) goto L15;
            r5.dismiss();
        L15:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(3000, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public RealTimeMeasurementActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new wg2(this));
        this.llMeasurement$delegate = LazyKt__LazyJVMKt.iO(new xg2(this));
        this.ivIcMeasurement$delegate = LazyKt__LazyJVMKt.iO(new yg2(this));
        this.tvValue$delegate = LazyKt__LazyJVMKt.iO(new zg2(this));
        this.tvUnit$delegate = LazyKt__LazyJVMKt.iO(new ah2(this));
        this.tvInfo$delegate = LazyKt__LazyJVMKt.iO(new bh2(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new pg2(this));
        MyDb r0 = MyDb.INSTANCE;
        this.mHeartRateDao = r0.getMDatabase().heartRateDao();
        this.mBloodPressureDao = r0.getMDatabase().bloodPressureDao();
        this.mBloodOxygenDao = r0.getMDatabase().bloodOxygenDao();
        this.mTemperatureDao = r0.getMDatabase().temperatureDao();
        this.mPressureDao = r0.getMDatabase().pressureDao();
        this.mHrvDao = r0.getMDatabase().hrvDao();
        this.flag = true;
        this.isShowPopup = true;
        if (q62.OXO1.X0100I() == false) goto L5;
        long r1 = ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
    L6:
        this.MAX_TIME_OUT = r1;
        this.MEASUREMENT_COMPLETE_TIME = 40000;
        this.mHandler = new Handler();
        this.mTimeoutDetectRunnable = new qg2(this);
        this.mMeasurementCompleteRunnable = new iO(this);
        this.mBleHandleCallback = new XIi00iiXO(this);
        return;
    L5:
        r1 = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        goto L6
    }

    public static /* synthetic */ ImageView I0iXXO(RealTimeMeasurementActivity r0) {
        return ivIcMeasurement_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1() {
        return showMeasurementCompletePopup$lambda$0$0();
    }

    public static /* synthetic */ PFMedium IIX1OXO(RealTimeMeasurementActivity r0) {
        return tvValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup O10IXXX0X(RealTimeMeasurementActivity r0) {
        return llMeasurement_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(RealTimeMeasurementActivity r0) {
        return tvInfo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(RealTimeMeasurementActivity r0) {
        return tvUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OiIIX101O(RealTimeMeasurementActivity r0) {
        return showMeasureHintPopup$lambda$1$1(r0);
    }

    public static /* synthetic */ View X0O(RealTimeMeasurementActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X1ii(RealTimeMeasurementActivity r0) {
        return showMessureFailedPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ View XX0(RealTimeMeasurementActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(RealTimeMeasurementActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(RealTimeMeasurementActivity r0) {
        return showMessureFailedPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ void XiOIii1(RealTimeMeasurementActivity r0) {
        mTimeoutDetectRunnable$lambda$0(r0);
    }

    public static final /* synthetic */ View access$getBtnBottom(RealTimeMeasurementActivity r0) {
        return r0.getBtnBottom();
    }

    public static final /* synthetic */ boolean access$getFlag$p(RealTimeMeasurementActivity r0) {
        return r0.flag;
    }

    public static final /* synthetic */ long access$getMAX_TIME_OUT$p(RealTimeMeasurementActivity r2) {
        return r2.MAX_TIME_OUT;
    }

    public static final /* synthetic */ int access$getMCurMeasureType$p(RealTimeMeasurementActivity r0) {
        return r0.mCurMeasureType;
    }

    public static final /* synthetic */ long access$getMEASUREMENT_COMPLETE_TIME$p(RealTimeMeasurementActivity r2) {
        return r2.MEASUREMENT_COMPLETE_TIME;
    }

    public static final /* synthetic */ Handler access$getMHandler$p(RealTimeMeasurementActivity r0) {
        return r0.mHandler;
    }

    public static final /* synthetic */ int access$getMLastBpm$p(RealTimeMeasurementActivity r0) {
        return r0.mLastBpm;
    }

    public static final /* synthetic */ go0 access$getMMeasurementCompletePopup$p(RealTimeMeasurementActivity r0) {
        return r0.mMeasurementCompletePopup;
    }

    public static final /* synthetic */ iO access$getMMeasurementCompleteRunnable$p(RealTimeMeasurementActivity r0) {
        return r0.mMeasurementCompleteRunnable;
    }

    public static final /* synthetic */ long access$getMStartTime$p(RealTimeMeasurementActivity r2) {
        return r2.mStartTime;
    }

    public static final /* synthetic */ Runnable access$getMTimeoutDetectRunnable$p(RealTimeMeasurementActivity r0) {
        return r0.mTimeoutDetectRunnable;
    }

    public static final /* synthetic */ PFMedium access$getTvValue(RealTimeMeasurementActivity r0) {
        return r0.getTvValue();
    }

    public static final /* synthetic */ boolean access$isShowPopup$p(RealTimeMeasurementActivity r0) {
        return r0.isShowPopup;
    }

    public static final /* synthetic */ void access$onMeasurementComplete(RealTimeMeasurementActivity r0) {
        r0.onMeasurementComplete();
    }

    public static final /* synthetic */ void access$setFlag$p(RealTimeMeasurementActivity r0, boolean r1) {
        r0.flag = r1;
    }

    public static final /* synthetic */ void access$setMLastBpm$p(RealTimeMeasurementActivity r0, int r1) {
        r0.mLastBpm = r1;
    }

    public static final /* synthetic */ void access$showMessureFailedPopup(RealTimeMeasurementActivity r0) {
        r0.showMessureFailedPopup();
    }

    private static final View btnBottom_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final ImageView getIvIcMeasurement() {
        return (ImageView) getValue();
    }

    private final ViewGroup getLlMeasurement() {
        return (ViewGroup) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final TextView getTvInfo() {
        return (TextView) getValue();
    }

    private final TextView getTvUnit() {
        return (TextView) getValue();
    }

    private final PFMedium getTvValue() {
        return (PFMedium) getValue();
    }

    public static /* synthetic */ boolean iIiiO(RealTimeMeasurementActivity r0) {
        return showMeasureHintPopup$lambda$1$0(r0);
    }

    private static final void initView$lambda$0(RealTimeMeasurementActivity r0) {
        r0.measurementStart();
    }

    private final boolean isMeasuring() {
        return Intrinsics.XOO0ii0(getTvInfo().getText().toString(), getString(R.string.measuring));
    }

    private static final ImageView ivIcMeasurement_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_ic_measurement);
    }

    private static final ViewGroup llMeasurement_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.ll_measurement);
    }

    private static final void mTimeoutDetectRunnable$lambda$0(RealTimeMeasurementActivity r2) {
        if (r2.isMeasuring() == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("measure timeout detect");
        r2.showMessureFailedPopup();
        return;
    }

    private final void measurementEnd() {
        Drawable r0 = getIvIcMeasurement().getDrawable();
        if ((r0 instanceof GifDrawable) == false) goto L5;
        ((GifDrawable) r0).stop();
    L5:
        getBtnBottom().setVisibility(0);
        this.mHandler.removeCallbacks(this.mTimeoutDetectRunnable);
    }

    private final void measurementStart() {
        this.mLastBpm = 0;
        Drawable r1 = getIvIcMeasurement().getDrawable();
        if ((r1 instanceof GifDrawable) == false) goto L5;
        ((GifDrawable) r1).start();
    L5:
        this.mHandler.removeCallbacks(this.mMeasurementCompleteRunnable);
        this.flag = true;
        getTvInfo().setText(R.string.measuring);
        getTvValue().setText(R.string.data_none);
        int r2 = this.mCurMeasureType;
        if (r2 == 0) goto L21;
        if (r2 != 1) goto L9;
        BleRealTimeMeasurement r14 = new BleRealTimeMeasurement(0, 0, 1, 0, 0, 0, 2, 59, null);
    L22:
        this.mStartTime = System.currentTimeMillis();
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.REALTIME_MEASUREMENT, BleKeyFlag.UPDATE, r14, false, false, 24, null);
        getBtnBottom().setVisibility(4);
        this.mHandler.postDelayed(this.mTimeoutDetectRunnable, this.MAX_TIME_OUT);
        return;
    L9:
        if (r2 != 2) goto L11;
        r14 = new BleRealTimeMeasurement(0, 1, 0, 0, 0, 0, 2, 61, null);
        goto L22
    L11:
        if (r2 == 3) goto L18;
        if (r2 != 4) goto L14;
        r14 = new BleRealTimeMeasurement(0, 0, 0, 0, 1, 0, 2, 47, null);
        goto L22
    L14:
        if (r2 == 5) goto L16;
        r14 = new BleRealTimeMeasurement(0, 0, 0, 0, 0, 0, 0, 127, null);
        goto L22
    L16:
        r14 = new BleRealTimeMeasurement(0, 0, 0, 0, 0, 1, 2, 31, null);
        goto L22
    L18:
        r14 = new BleRealTimeMeasurement(0, 0, 0, 1, 0, 0, 2, 55, null);
        goto L22
    L21:
        r14 = new BleRealTimeMeasurement(1, 0, 0, 0, 0, 0, 2, 62, null);
        goto L22
    }

    private final void onFinish() {
        if (isMeasuring() == true) goto L5;
    L8:
        sendHeartRate();
        finish();
        return;
    L5:
        if (this.mLastBpm != 0) goto L8;
        showMeasureHintPopup();
    }

    private final void onMeasurementComplete() {
        getTvInfo().setText(R.string.measured);
        getBtnBottom().setVisibility(0);
        this.isShowPopup = false;
        Drawable r0 = getIvIcMeasurement().getDrawable();
        if ((r0 instanceof GifDrawable) == false) goto L5;
        ((GifDrawable) r0).stop();
    L5:
        sendHeartRate();
        showMeasurementCompletePopup();
    }

    private static final View rootView_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void sendHeartRate() {
        q62 r0 = q62.OXO1;
        if (r0.X0100I() == false) goto L5;
    L8:
        BleRealTimeMeasurement r1 = new BleRealTimeMeasurement(1, 0, 0, 0, 0, 0, 1, 62, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.REALTIME_MEASUREMENT, BleKeyFlag.UPDATE, r1, false, false, 24, null);
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
        return;
    L5:
        if (r0.I0i1OXiI() == true) goto L8;
    }

    private final void showMeasureHintPopup() {
        go0 r0 = this.mLeavePromptPopup;
        int r1 = 0;
        if (r0 != null) goto L5;
        this.mLeavePromptPopup = new go0(this, r1, 2, null);
    L9:
        go0 r2 = this.mLeavePromptPopup;
        if (r2 == null) goto L13;
        r2.O1O(R.string.measure_hint);
        r2.iX(Integer.valueOf(R.string.in_measurement));
        r2.I0iXXO(false);
        r2.iX1O1(Integer.valueOf(R.string.leave), new og2(this));
        r2.X1IX(R.string.continue_text, new tg2(this));
        r2.IIX1OXO();
        return;
    L13:
        return;
    L5:
        if (r0 == null) goto L9;
        if (this.isShowPopup == false) goto L9;
        r0.dismiss();
        goto L9
    }

    private static final boolean showMeasureHintPopup$lambda$1$0(RealTimeMeasurementActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean showMeasureHintPopup$lambda$1$1(RealTimeMeasurementActivity r1) {
        if (r1.isMeasuring() == true) goto L7;
        r1.measurementStart();
        return true;
    L7:
        return true;
    }

    private final void showMeasurementCompletePopup() {
        if (this.mMeasurementCompletePopup != null) goto L5;
        go0 r0 = new go0(getMContext(), R.layout.pop_measurement_complete);
        String r2 = getString(R.string.measured);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.iI(r2);
        go0.X11iII1O1(r0, null, null, 2, null);
        r0.i010I().setVisibility(8);
        r0.X1IX(R.string.confirm, new vg2());
        this.mMeasurementCompletePopup = r0;
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r0.XiOIO(r3);
    L5:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(this, null), 3, null);
        go0 r1 = this.mLeavePromptPopup;
        if (r1 == null) goto L9;
        r1.dismiss();
        return;
    }

    private static final boolean showMeasurementCompletePopup$lambda$0$0() {
        return true;
    }

    private final void showMessureFailedPopup() {
        getTvInfo().setText(R.string.measure_failed);
        int r4 = 0;
        go0 r0 = new go0(this, r4, 2, null);
        r0.O1O(R.string.measure_failed);
        r0.iX(Integer.valueOf(R.string.measurement_tip));
        r0.I0iXXO(false);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new rg2(this));
        r0.X1IX(R.string.measure_retry, new sg2(this));
        r0.IIX1OXO();
        getTvValue().setText(R.string.data_none);
        measurementEnd();
    }

    private static final boolean showMessureFailedPopup$lambda$0$0(RealTimeMeasurementActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean showMessureFailedPopup$lambda$0$1(RealTimeMeasurementActivity r0) {
        r0.measurementStart();
        return true;
    }

    private static final TextView tvInfo_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_info);
    }

    private static final TextView tvUnit_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_unit);
    }

    private static final PFMedium tvValue_delegate$lambda$0(RealTimeMeasurementActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_value);
    }

    @tb1
    public final go0 getMLeavePromptPopup() {
        return this.mLeavePromptPopup;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        this.mCurMeasureType = getMArg1();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        int r1 = this.mCurMeasureType;
        if (r1 != 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_hr);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_hr);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_hr));
        getTvUnit().setText(R.string.bpm);
        Glide.with(this).load(Integer.valueOf(R.raw.icon_measurement_hr)).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(getIvIcMeasurement());
    L37:
        this.mStartTime = System.currentTimeMillis();
        new Handler().postDelayed(new ug2(this), 500);
        return;
    L5:
        if (r1 != 1) goto L7;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_bp);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_bp);
        getIvIcMeasurement().setImageResource(R.drawable.icon_measurement_bp);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_bp));
        getTvUnit().setText(R.string.mmhg);
        goto L37
    L7:
        if (r1 != 2) goto L9;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_bog);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_bog);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_bog));
        getTvUnit().setText(R.string.percent);
        Glide.with(this).load(Integer.valueOf(R.raw.icon_measurement_bog)).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(getIvIcMeasurement());
        goto L37
    L9:
        if (r1 != 3) goto L11;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_pressure);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_pressure);
        getIvIcMeasurement().setImageResource(R.drawable.icon_measurement_pressure);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_bp));
        getTvUnit().setText("");
        goto L37
    L11:
        if (r1 != 4) goto L13;
        TextView r2 = (TextView) findViewById(R.id.abh_title_center);
        q62 r3 = q62.OXO1;
        if (r3.XI1OX0IO() == false) goto L19;
        int r6 = R.string.body_temperature_detection;
    L20:
        r2.setText(r6);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_bp);
        ImageView r4 = getIvIcMeasurement();
        if (r3.XI1OX0IO() == false) goto L23;
        int r5 = R.drawable.icon_skin_temperature2;
    L24:
        r4.setImageResource(r5);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_bp));
        TextView r7 = getTvUnit();
        SPUtils r8 = a01.OXO1.IiI10X();
        Object r9 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r10 = new Gson().fromJson(r8.getString(AppUser.class.getName()), AppUser.class);
        if (r10 == null) goto L29;
        r9 = r10;
    L29:
        if (cp5.II1Xi0(((AppUser) r9).getUnit()) != 1) goto L31;
        int r11 = R.string.fahrenheit;
    L32:
        r7.setText(r11);
        goto L37
    L31:
        r11 = R.string.degree_centigrade;
        goto L32
    L23:
        r5 = R.drawable.icon_temperature;
        goto L24
    L19:
        r6 = R.string.temp_monitoring;
        goto L20
    L13:
        if (r1 != 5) goto L37;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_hrv);
        getLlMeasurement().setBackgroundResource(R.drawable.bg_measurement_hrv);
        getIvIcMeasurement().setImageResource(R.drawable.icon_measurement_hrv);
        getTvValue().setTextColor(gk4.iO(getMContext(), R.color.measurement_text_color_bp));
        getTvUnit().setText(R.string.hvr_ms);
        goto L37
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_realtime_measurement;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodOxygenChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        BloodOxygen r3 = this.mBloodOxygenDao.getLastBloodOxygen();
        if (r3 == null) goto L6;
        getTvValue().setText(String.valueOf(r3.getMValue()));
        return;
    }

    @sf5(tag = I01XX0.iO)
    public final void onBloodPressureChanged(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        BloodPressure r5 = this.mBloodPressureDao.getLastBloodPressure();
        if (r5 == null) goto L6;
        getTvValue().setText(r5.getMSystolic() + "/" + r5.getMDiastolic());
        return;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        sendHeartRate();
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacks(this.mTimeoutDetectRunnable);
        BleConnector r3 = BleConnector.INSTANCE;
        r3.removeHandleCallback(this.mBleHandleCallback);
        this.mHandler.removeCallbacks(this.mMeasurementCompleteRunnable);
        int r1 = this.mCurMeasureType;
        if (r1 != 0) goto L5;
        BleRealTimeMeasurement r6 = new BleRealTimeMeasurement(1, 0, 0, 0, 0, 0, 1, 62, null);
    L21:
        BaseBleConnector.sendObject$default(r3, BleKey.REALTIME_MEASUREMENT, BleKeyFlag.UPDATE, r6, false, false, 24, null);
        return;
    L5:
        if (r1 != 1) goto L7;
        r6 = new BleRealTimeMeasurement(0, 0, 1, 0, 0, 0, 1, 59, null);
        goto L21
    L7:
        if (r1 != 2) goto L9;
        r6 = new BleRealTimeMeasurement(0, 1, 0, 0, 0, 0, 1, 61, null);
        goto L21
    L9:
        if (r1 != 3) goto L11;
        r6 = new BleRealTimeMeasurement(0, 0, 0, 1, 0, 0, 1, 55, null);
        goto L21
    L11:
        if (r1 != 4) goto L13;
        r6 = new BleRealTimeMeasurement(0, 0, 0, 0, 1, 0, 1, 47, null);
        goto L21
    L13:
        if (r1 == 5) goto L15;
        r6 = new BleRealTimeMeasurement(0, 0, 0, 0, 0, 0, 0, 127, null);
        goto L21
    L15:
        r6 = new BleRealTimeMeasurement(0, 0, 0, 0, 0, 1, 1, 31, null);
        goto L21
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        q62 r3 = q62.OXO1;
        if (r3.X0100I() == false) goto L5;
        return;
    L5:
        if (r3.I0i1OXiI() == true) goto L11;
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        HeartRate r4 = this.mHeartRateDao.getLastHeartRate();
        if (r4 == null) goto L12;
        this.mLastBpm = r4.getMBpm();
        getTvValue().setText(UtilsKt.iXiiiO(this.mLastBpm));
        return;
    L12:
        return;
    }

    @sf5(tag = I01XX0.OIi0)
    public final void onHrvChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        List<Hrv> r3 = this.mHrvDao.getLastData();
        if (r3 == null) goto L6;
        getTvValue().setText(String.valueOf(((Hrv) CollectionsKt___CollectionsKt.IIII0iI(r3)).getMValue()));
        return;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (r2 != 4) goto L7;
        onFinish();
        return false;
    L7:
        return super.onKeyDown(r2, r3);
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        List<Pressure> r3 = this.mPressureDao.getLastData();
        if (r3 == null) goto L6;
        getTvValue().setText(String.valueOf(((Pressure) CollectionsKt___CollectionsKt.IIII0iI(r3)).getMValue()));
        return;
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object r35) {
        Intrinsics.X0O(r35, "data");
        measurementEnd();
        getTvInfo().setText(R.string.measured);
        showMeasurementCompletePopup();
        List<Temperature> r1 = this.mTemperatureDao.getLastData();
        if (r1 == null) goto L14;
        PFMedium r2 = getTvValue();
        float r3 = ((Temperature) CollectionsKt___CollectionsKt.IIII0iI(r1)).getMTemperature() / 10.0f;
        SPUtils r4 = a01.OXO1.IiI10X();
        Object r5 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r6 = new Gson().fromJson(r4.getString(AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L8;
        r5 = r6;
    L8:
        int r7 = cp5.II1Xi0(((AppUser) r5).getUnit());
        boolean r8 = true;
        if (r7 == 1) goto L12;
        r8 = false;
    L12:
        r2.setText(String.valueOf(cp5.i010I(r3, r8)));
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onFinish();
    }

    public final void setMLeavePromptPopup(@tb1 go0 r1) {
        this.mLeavePromptPopup = r1;
    }
}
