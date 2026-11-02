package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I110X00;
import com.android.mltcode.paycertificationapi.I1I0I1;
import com.android.mltcode.paycertificationapi.I1OIi1101;
import com.android.mltcode.paycertificationapi.I1iOOXi;
import com.android.mltcode.paycertificationapi.II1XiIO01;
import com.android.mltcode.paycertificationapi.Ii0I01;
import com.android.mltcode.paycertificationapi.O0Xi0OX1;
import com.android.mltcode.paycertificationapi.O1IIiIIO;
import com.android.mltcode.paycertificationapi.O1IO0IOIO;
import com.android.mltcode.paycertificationapi.OOIXI1;
import com.android.mltcode.paycertificationapi.OX011;
import com.android.mltcode.paycertificationapi.Oi01III;
import com.android.mltcode.paycertificationapi.OiXO0Xi1;
import com.android.mltcode.paycertificationapi.X0II0iI;
import com.android.mltcode.paycertificationapi.X0IOOX11;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0OX1X;
import com.android.mltcode.paycertificationapi.X0iXXi;
import com.android.mltcode.paycertificationapi.X10O1;
import com.android.mltcode.paycertificationapi.X1IO0;
import com.android.mltcode.paycertificationapi.XIO1ii11I;
import com.android.mltcode.paycertificationapi.XO0i0I0;
import com.android.mltcode.paycertificationapi.XOiiXii;
import com.android.mltcode.paycertificationapi.XX0X;
import com.android.mltcode.paycertificationapi.XiI1iII;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i0XI111;
import com.android.mltcode.paycertificationapi.i0XiX0;
import com.android.mltcode.paycertificationapi.i10I1IOX;
import com.android.mltcode.paycertificationapi.i1IXX1Oi0;
import com.android.mltcode.paycertificationapi.iO00I01;
import com.android.mltcode.paycertificationapi.iO0iXO0XO;
import com.android.mltcode.paycertificationapi.iX11;
import com.android.mltcode.paycertificationapi.iXOIiOO1;
import com.android.mltcode.paycertificationapi.iXiX00XX;
import com.android.mltcode.paycertificationapi.ii0IiIO11;
import com.android.mltcode.paycertificationapi.iiOi0IIi;
import com.android.mltcode.paycertificationapi.iiX0OIX;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
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
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class EarphoneKeySettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeaderLeftClick$delegate;

    @aa1
    private final Lazy itemHeaderLeftDoubleClick$delegate;

    @aa1
    private final Lazy itemHeaderLeftLongClick$delegate;

    @aa1
    private final Lazy itemHeaderLeftTripleClick$delegate;

    @aa1
    private final Lazy itemHeaderRightClick$delegate;

    @aa1
    private final Lazy itemHeaderRightDoubleClick$delegate;

    @aa1
    private final Lazy itemHeaderRightLongClick$delegate;

    @aa1
    private final Lazy itemHeaderRightTripleClick$delegate;

    @aa1
    private final Lazy itemLeftClick$delegate;

    @aa1
    private final Lazy itemLeftDoubleClick$delegate;

    @aa1
    private final Lazy itemLeftLongClick$delegate;

    @aa1
    private final Lazy itemLeftTripleClick$delegate;

    @aa1
    private final Lazy itemRightClick$delegate;

    @aa1
    private final Lazy itemRightDoubleClick$delegate;

    @aa1
    private final Lazy itemRightLongClick$delegate;

    @aa1
    private final Lazy itemRightTripleClick$delegate;

    @aa1
    private final Lazy leftPanel$delegate;

    @aa1
    private final OXO1 mBleHandleCallback;

    @aa1
    private BleEarphoneKey mSettings;

    @aa1
    private final Lazy rightPanel$delegate;

    public static final class OXO1 implements BleHandleCallback {
        public final /* synthetic */ EarphoneKeySettingsActivity IO;

        public OXO1(EarphoneKeySettingsActivity r1) {
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
        public void onEarphoneKeyUpdate(BleEarphoneKey r2) {
            Intrinsics.X0O(r2, "earphoneKey");
            EarphoneKeySettingsActivity.access$setMSettings$p(this.IO, r2);
            EarphoneKeySettingsActivity.access$updateUI(this.IO);
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
        public void onReadEarphoneKey(BleEarphoneKey r2) {
            Intrinsics.X0O(r2, "earphoneKey");
            EarphoneKeySettingsActivity.access$setMSettings$p(this.IO, r2);
            EarphoneKeySettingsActivity.access$updateUI(this.IO);
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

    public EarphoneKeySettingsActivity() {
        this.leftPanel$delegate = LazyKt__LazyJVMKt.iO(new XIO1ii11I(this));
        this.itemHeaderLeftClick$delegate = LazyKt__LazyJVMKt.iO(new iiX0OIX(this));
        this.itemLeftClick$delegate = LazyKt__LazyJVMKt.iO(new Oi01III(this));
        this.itemHeaderLeftDoubleClick$delegate = LazyKt__LazyJVMKt.iO(new I1I0I1(this));
        this.itemLeftDoubleClick$delegate = LazyKt__LazyJVMKt.iO(new OiXO0Xi1(this));
        this.itemHeaderLeftTripleClick$delegate = LazyKt__LazyJVMKt.iO(new i10I1IOX(this));
        this.itemLeftTripleClick$delegate = LazyKt__LazyJVMKt.iO(new X0OX1X(this));
        this.itemHeaderLeftLongClick$delegate = LazyKt__LazyJVMKt.iO(new X0iXXi(this));
        this.itemLeftLongClick$delegate = LazyKt__LazyJVMKt.iO(new XOiiXii(this));
        this.rightPanel$delegate = LazyKt__LazyJVMKt.iO(new I1OIi1101(this));
        this.itemHeaderRightClick$delegate = LazyKt__LazyJVMKt.iO(new iiOi0IIi(this));
        this.itemRightClick$delegate = LazyKt__LazyJVMKt.iO(new OOIXI1(this));
        this.itemHeaderRightDoubleClick$delegate = LazyKt__LazyJVMKt.iO(new X10O1(this));
        this.itemRightDoubleClick$delegate = LazyKt__LazyJVMKt.iO(new I110X00(this));
        this.itemHeaderRightTripleClick$delegate = LazyKt__LazyJVMKt.iO(new X1IO0(this));
        this.itemRightTripleClick$delegate = LazyKt__LazyJVMKt.iO(new iXOIiOO1(this));
        this.itemHeaderRightLongClick$delegate = LazyKt__LazyJVMKt.iO(new X0II0iI(this));
        this.itemRightLongClick$delegate = LazyKt__LazyJVMKt.iO(new O0Xi0OX1(this));
        this.mSettings = (BleEarphoneKey) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_KEY, BleEarphoneKey.class, null, null, 12, null);
        this.mBleHandleCallback = new OXO1(this);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(EarphoneKeySettingsActivity r0) {
        return itemRightTripleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$4$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$3$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader II1Xi0(EarphoneKeySettingsActivity r0) {
        return itemHeaderLeftTripleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(EarphoneKeySettingsActivity r0) {
        return itemLeftClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IXXOO(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ Unit O001I(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$6$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem O10IXXX0X(EarphoneKeySettingsActivity r0) {
        return itemLeftLongClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O1O(View r0, EarphoneKeySettingsActivity r1, int r2) {
        return onShowKeysPopup$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OII(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OIX0iXi(View r0, EarphoneKeySettingsActivity r1, int r2, BleConnector r3) {
        return onShowKeysPopup$lambda$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ AbhSettingsHeader OX(EarphoneKeySettingsActivity r0) {
        return itemHeaderLeftLongClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$6$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$2$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem X0i1O(EarphoneKeySettingsActivity r0) {
        return itemRightClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X11iII1O1(EarphoneKeySettingsActivity r0) {
        return itemLeftTripleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X1IX(EarphoneKeySettingsActivity r0) {
        return itemRightDoubleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ View XX0(EarphoneKeySettingsActivity r0) {
        return leftPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsHeader XXIIO1i11(EarphoneKeySettingsActivity r0) {
        return itemHeaderLeftClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XXO(EarphoneKeySettingsActivity r0) {
        return itemHeaderLeftDoubleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XXX11i(EarphoneKeySettingsActivity r0) {
        return itemHeaderRightClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XiOIO(EarphoneKeySettingsActivity r0) {
        return itemHeaderRightTripleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIii1(EarphoneKeySettingsActivity r0) {
        return rightPanel_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$setMSettings$p(EarphoneKeySettingsActivity r0, BleEarphoneKey r1) {
        r0.mSettings = r1;
    }

    public static final /* synthetic */ void access$updateUI(EarphoneKeySettingsActivity r0) {
        r0.updateUI();
    }

    private final AbhSettingsHeader getItemHeaderLeftClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderLeftDoubleClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderLeftLongClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderLeftTripleClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderRightClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderRightDoubleClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderRightLongClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderRightTripleClick() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemLeftClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemLeftDoubleClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemLeftLongClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemLeftTripleClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRightClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRightDoubleClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRightLongClick() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRightTripleClick() {
        return (AbhSettingsItem) getValue();
    }

    private final String getKeyName(int r2) {
        switch(r2) {
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L14;
            case 8: goto L12;
            case 9: goto L10;
            case 10: goto L8;
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        String r3 = getString(R.string.earphone_key_none);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        return r3;
    L6:
        String r4 = getString(R.string.earphone_key_turn_off_translation);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        return r4;
    L8:
        String r5 = getString(R.string.earphone_key_turn_on_translation);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        return r5;
    L10:
        String r6 = getString(R.string.earphone_key_turn_off_ai);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        return r6;
    L12:
        String r7 = getString(R.string.earphone_key_turn_on_ai);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        return r7;
    L14:
        String r8 = getString(R.string.earphone_key_voice_assistant);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        return r8;
    L16:
        String r9 = getString(R.string.earphone_key_vol_down);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        return r9;
    L18:
        String r10 = getString(R.string.earphone_key_vol_up);
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        return r10;
    L20:
        String r11 = getString(R.string.earphone_key_switch_env);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        return r11;
    L22:
        String r12 = getString(R.string.earphone_key_play_pause);
        Intrinsics.O10IXXX0X(r12, "getString(...)");
        return r12;
    L24:
        String r13 = getString(R.string.earphone_key_next);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        return r13;
    L26:
        String r14 = getString(R.string.earphone_key_pre);
        Intrinsics.O10IXXX0X(r14, "getString(...)");
        return r14;
    }

    private final View getLeftPanel() {
        return (View) getValue();
    }

    private final View getRightPanel() {
        return (View) getValue();
    }

    public static /* synthetic */ Unit i010I(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$7$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem iI(EarphoneKeySettingsActivity r0) {
        return itemRightLongClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIXi1iiXI(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader iIiiO(EarphoneKeySettingsActivity r0) {
        return itemHeaderRightLongClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOO1ii1(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$5$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iOOX010X(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$7$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iX(EarphoneKeySettingsActivity r0, boolean r1, BleConnector r2) {
        return updateUI$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader iX1O1(EarphoneKeySettingsActivity r0) {
        return itemHeaderRightDoubleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem iXiX011(EarphoneKeySettingsActivity r0) {
        return itemLeftDoubleClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iXiiiO(EarphoneKeySettingsActivity r0, boolean r1) {
        return updateUI$lambda$5$0(r0, r1);
    }

    private final int indexToKey(int r13) {
        if (this.mSettings.getMType() != 1) goto L13;
        switch(r13) {
            case 1: goto L11;
            case 2: goto L10;
            case 3: goto L9;
            case 4: goto L8;
            case 5: goto L7;
            case 6: goto L6;
            default: goto L5;
        };
    L5:
        return 0;
    L6:
        return 7;
    L7:
        return 6;
    L8:
        return 5;
    L9:
        return 3;
    L10:
        return 2;
    L11:
        return 1;
    L13:
        if (this.mSettings.getMType() != 2) goto L27;
        switch(r13) {
            case 1: goto L25;
            case 2: goto L24;
            case 3: goto L23;
            case 4: goto L22;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L19;
            case 8: goto L18;
            case 9: goto L17;
            case 10: goto L16;
            default: goto L15;
        };
    L15:
        return 0;
    L16:
        return 11;
    L17:
        return 10;
    L18:
        return 9;
    L19:
        return 8;
    L20:
        return 7;
    L21:
        return 6;
    L22:
        return 5;
    L23:
        return 3;
    L24:
        return 2;
    L25:
        return 1;
    L27:
        if (this.mSettings.getMType() != 3) goto L42;
        switch(r13) {
            case 1: goto L41;
            case 2: goto L40;
            case 3: goto L39;
            case 4: goto L37;
            case 5: goto L36;
            case 6: goto L35;
            case 7: goto L34;
            case 8: goto L33;
            case 9: goto L32;
            case 10: goto L31;
            case 11: goto L30;
            default: goto L29;
        };
    L29:
        return 0;
    L30:
        return 11;
    L31:
        return 10;
    L32:
        return 9;
    L33:
        return 8;
    L34:
        return 7;
    L35:
        return 6;
    L36:
        return 5;
    L37:
        return 4;
    L39:
        return 3;
    L40:
        return 2;
    L41:
        return 1;
    L42:
        return r13;
    }

    private static final AbhSettingsHeader itemHeaderLeftClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_left_click);
    }

    private static final AbhSettingsHeader itemHeaderLeftDoubleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_left_double_click);
    }

    private static final AbhSettingsHeader itemHeaderLeftLongClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_left_long_click);
    }

    private static final AbhSettingsHeader itemHeaderLeftTripleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_left_triple_click);
    }

    private static final AbhSettingsHeader itemHeaderRightClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_right_click);
    }

    private static final AbhSettingsHeader itemHeaderRightDoubleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_right_double_click);
    }

    private static final AbhSettingsHeader itemHeaderRightLongClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_right_long_click);
    }

    private static final AbhSettingsHeader itemHeaderRightTripleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_right_triple_click);
    }

    private static final AbhSettingsItem itemLeftClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_left_click);
    }

    private static final AbhSettingsItem itemLeftDoubleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_left_double_click);
    }

    private static final AbhSettingsItem itemLeftLongClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_left_long_click);
    }

    private static final AbhSettingsItem itemLeftTripleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_left_triple_click);
    }

    private static final AbhSettingsItem itemRightClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_right_click);
    }

    private static final AbhSettingsItem itemRightDoubleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_right_double_click);
    }

    private static final AbhSettingsItem itemRightLongClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_right_long_click);
    }

    private static final AbhSettingsItem itemRightTripleClick_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_right_triple_click);
    }

    private final int keyToIndex(int r13) {
        if (this.mSettings.getMType() != 1) goto L18;
        if (r13 == 1) goto L16;
        if (r13 == 2) goto L15;
        if (r13 == 3) goto L14;
        if (r13 == 5) goto L13;
        if (r13 == 6) goto L12;
        if (r13 == 7) goto L11;
        return 0;
    L11:
        return 6;
    L12:
        return 5;
    L13:
        return 4;
    L14:
        return 3;
    L15:
        return 2;
    L16:
        return 1;
    L18:
        if (this.mSettings.getMType() != 2) goto L32;
        switch(r13) {
            case 1: goto L30;
            case 2: goto L29;
            case 3: goto L28;
            case 4: goto L20;
            case 5: goto L27;
            case 6: goto L26;
            case 7: goto L25;
            case 8: goto L24;
            case 9: goto L23;
            case 10: goto L22;
            case 11: goto L21;
            default: goto L20;
        };
    L20:
        return 0;
    L21:
        return 10;
    L22:
        return 9;
    L23:
        return 8;
    L24:
        return 7;
    L25:
        return 6;
    L26:
        return 5;
    L27:
        return 4;
    L28:
        return 3;
    L29:
        return 2;
    L30:
        return 1;
    L32:
        if (this.mSettings.getMType() != 3) goto L47;
        switch(r13) {
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L43;
            case 5: goto L42;
            case 6: goto L41;
            case 7: goto L40;
            case 8: goto L39;
            case 9: goto L38;
            case 10: goto L37;
            case 11: goto L35;
            default: goto L34;
        };
    L34:
        return 0;
    L35:
        return 11;
    L37:
        return 10;
    L38:
        return 9;
    L39:
        return 8;
    L40:
        return 7;
    L41:
        return 6;
    L42:
        return 5;
    L43:
        return 4;
    L44:
        return 3;
    L45:
        return 2;
    L46:
        return 1;
    L47:
        return r13;
    }

    private static final View leftPanel_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return r1.findViewById(R.id.ll_left_panel);
    }

    private static final boolean onShowKeysPopup$lambda$0$0(final View r1, final EarphoneKeySettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new i0XiX0(r1, r2, r3), 1, null);
    }

    private static final Unit onShowKeysPopup$lambda$0$0$0(View r8, EarphoneKeySettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        int r12 = r8.getId();
        switch(r12) {
            case 2131363252: goto L13;
            case 2131363253: goto L12;
            case 2131363254: goto L11;
            case 2131363255: goto L10;
            default: goto L4;
        };
    L4:
        switch(r12) {
            case 2131363287: goto L9;
            case 2131363288: goto L8;
            case 2131363289: goto L7;
            case 2131363290: goto L6;
            default: goto L14;
        };
    L6:
        r9.mSettings.setMRightTripleClick(r9.indexToKey(r10));
        goto L14
    L7:
        r9.mSettings.setMRightLongClick(r9.indexToKey(r10));
        goto L14
    L8:
        r9.mSettings.setMRightDoubleClick(r9.indexToKey(r10));
        goto L14
    L9:
        r9.mSettings.setMRightClick(r9.indexToKey(r10));
    L14:
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.initView();
        return Unit.OXO1;
    L10:
        r9.mSettings.setMLeftTripleClick(r9.indexToKey(r10));
        goto L14
    L11:
        r9.mSettings.setMLeftLongClick(r9.indexToKey(r10));
        goto L14
    L12:
        r9.mSettings.setMLeftDoubleClick(r9.indexToKey(r10));
        goto L14
    L13:
        r9.mSettings.setMLeftClick(r9.indexToKey(r10));
        goto L14
    }

    private static final View rightPanel_delegate$lambda$0(EarphoneKeySettingsActivity r1) {
        return r1.findViewById(R.id.ll_right_panel);
    }

    private final void updateUI() {
        AbhSettingsHeader r0 = getItemHeaderLeftClick();
        r0.setMListener(null);
        boolean r3 = false;
        if (this.mSettings.getMLeftClick() <= 0) goto L5;
        boolean r2 = true;
    L6:
        r0.setChecked(r2);
        r0.setMListener(new I1iOOXi(this));
        getItemLeftClick().setMLeftText(getKeyName(this.mSettings.getMLeftClick()));
        AbhSettingsHeader r1 = getItemHeaderLeftDoubleClick();
        r1.setMListener(null);
        if (this.mSettings.getMLeftDoubleClick() <= 0) goto L9;
        boolean r4 = true;
    L10:
        r1.setChecked(r4);
        r1.setMListener(new O1IO0IOIO(this));
        getItemLeftDoubleClick().setMLeftText(getKeyName(this.mSettings.getMLeftDoubleClick()));
        AbhSettingsHeader r5 = getItemHeaderLeftTripleClick();
        r5.setMListener(null);
        if (this.mSettings.getMLeftTripleClick() <= 0) goto L13;
        boolean r6 = true;
    L14:
        r5.setChecked(r6);
        r5.setMListener(new i0XI111(this));
        getItemLeftTripleClick().setMLeftText(getKeyName(this.mSettings.getMLeftTripleClick()));
        AbhSettingsHeader r7 = getItemHeaderLeftLongClick();
        r7.setMListener(null);
        if (this.mSettings.getMLeftLongClick() <= 0) goto L17;
        boolean r8 = true;
    L18:
        r7.setChecked(r8);
        r7.setMListener(new XO0i0I0(this));
        getItemLeftLongClick().setMLeftText(getKeyName(this.mSettings.getMLeftLongClick()));
        AbhSettingsHeader r9 = getItemHeaderRightClick();
        r9.setMListener(null);
        if (this.mSettings.getMRightClick() <= 0) goto L21;
        boolean r10 = true;
    L22:
        r9.setChecked(r10);
        r9.setMListener(new O1IIiIIO(this));
        getItemRightClick().setMLeftText(getKeyName(this.mSettings.getMRightClick()));
        AbhSettingsHeader r11 = getItemHeaderRightDoubleClick();
        r11.setMListener(null);
        if (this.mSettings.getMRightDoubleClick() <= 0) goto L25;
        boolean r12 = true;
    L26:
        r11.setChecked(r12);
        r11.setMListener(new XX0X(this));
        getItemRightDoubleClick().setMLeftText(getKeyName(this.mSettings.getMRightDoubleClick()));
        AbhSettingsHeader r13 = getItemHeaderRightTripleClick();
        r13.setMListener(null);
        if (this.mSettings.getMRightTripleClick() <= 0) goto L29;
        boolean r14 = true;
    L30:
        r13.setChecked(r14);
        r13.setMListener(new ii0IiIO11(this));
        getItemRightTripleClick().setMLeftText(getKeyName(this.mSettings.getMRightTripleClick()));
        AbhSettingsHeader r15 = getItemHeaderRightLongClick();
        r15.setMListener(null);
        if (this.mSettings.getMRightLongClick() <= 0) goto L33;
        r3 = true;
    L33:
        r15.setChecked(r3);
        r15.setMListener(new Ii0I01(this));
        getItemRightLongClick().setMLeftText(getKeyName(this.mSettings.getMRightLongClick()));
        return;
    L29:
        r14 = false;
        goto L30
    L25:
        r12 = false;
        goto L26
    L21:
        r10 = false;
        goto L22
    L17:
        r8 = false;
        goto L18
    L13:
        r6 = false;
        goto L14
    L9:
        r4 = false;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    private static final Unit updateUI$lambda$0$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new II1XiIO01(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderLeftClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$0$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMLeftClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$1$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new X0IOOX11(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderLeftDoubleClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$1$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMLeftDoubleClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$2$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new i1IXX1Oi0(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderLeftTripleClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$2$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMLeftTripleClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$3$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new XiI1iII(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderLeftLongClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$3$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMLeftLongClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$4$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new iXiX00XX(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderRightClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$4$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMRightClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$5$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new OX011(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderRightDoubleClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$5$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMRightDoubleClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$6$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new iO00I01(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderRightTripleClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$6$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMRightTripleClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$7$0(final EarphoneKeySettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new iX11(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderRightLongClick().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit updateUI$lambda$7$0$0(EarphoneKeySettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mSettings.setMRightLongClick(r10 ? 1 : 0);
        BaseBleConnector.sendObject$default(r11, BleKey.EARPHONE_KEY, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r9) {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.addHandleCallback(this.mBleHandleCallback);
        BaseBleConnector.sendData$default(r0, BleKey.EARPHONE_KEY, BleKeyFlag.READ, null, false, false, 28, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() != 1) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.earphone_right_key);
        getLeftPanel().setVisibility(8);
        getRightPanel().setVisibility(0);
    L6:
        updateUI();
        return;
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.earphone_left_key);
        getLeftPanel().setVisibility(0);
        getRightPanel().setVisibility(8);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_earphone_key_settings;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    public final void onShowKeysPopup(@aa1 final View r8) {
        Intrinsics.X0O(r8, "view");
        int r0 = this.mSettings.getMType();
        if (r0 != 1) goto L5;
        int r1 = R.array.earphone_key_list_1;
    L13:
        int r4 = 0;
        dj4 r2 = new dj4(this, r1, r4, 4, null);
        int r3 = r8.getId();
        switch(r3) {
            case 2131363252: goto L24;
            case 2131363253: goto L23;
            case 2131363254: goto L22;
            case 2131363255: goto L21;
            default: goto L15;
        };
    L15:
        switch(r3) {
            case 2131363287: goto L20;
            case 2131363288: goto L19;
            case 2131363289: goto L18;
            case 2131363290: goto L17;
            default: goto L25;
        };
    L17:
        r2.iX(R.string.triple_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMRightTripleClick()));
        goto L25
    L18:
        r2.iX(R.string.long_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMRightLongClick()));
        goto L25
    L19:
        r2.iX(R.string.double_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMRightDoubleClick()));
        goto L25
    L20:
        r2.iX(R.string.click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMRightClick()));
    L25:
        r2.i010I(new iO0iXO0XO(r8, this));
        r2.IIX1OXO();
        return;
    L21:
        r2.iX(R.string.triple_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMLeftTripleClick()));
        goto L25
    L22:
        r2.iX(R.string.long_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMLeftLongClick()));
        goto L25
    L23:
        r2.iX(R.string.double_click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMLeftDoubleClick()));
        goto L25
    L24:
        r2.iX(R.string.click_effects);
        r2.II1Xi0(keyToIndex(this.mSettings.getMLeftClick()));
        goto L25
    L5:
        if (r0 != 2) goto L7;
        r1 = R.array.earphone_key_list_2;
        goto L13
    L7:
        if (r0 == 3) goto L10;
        r1 = R.array.earphone_key_list_0;
        goto L13
    L10:
        r1 = R.array.earphone_key_list_3;
        goto L13
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
