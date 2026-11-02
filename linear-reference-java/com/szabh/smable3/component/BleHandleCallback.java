package com.szabh.smable3.component;

import android.bluetooth.BluetoothDevice;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Y5;
import com.ironsource.sdk.controller.f;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
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
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.paho.android.service.MqttServiceConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface BleHandleCallback {

    public static final class DefaultImpls {
        @Deprecated
        public static void onAICoachGeneratePlanUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onAICoachGeneratePlanUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onAICommandUpdate(@aa1 BleHandleCallback r1, @aa1 BleAICommand r2) {
            Intrinsics.X0O(r2, f.b.g);
            BleHandleCallback.access$onAICommandUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onActivityRecognitionUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onActivityRecognitionUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onAlarmAdd(@aa1 BleHandleCallback r1, @aa1 BleAlarm r2) {
            Intrinsics.X0O(r2, NotificationCompat.CATEGORY_ALARM);
            BleHandleCallback.access$onAlarmAdd$jd(r1, r2);
        }

        @Deprecated
        public static void onAlarmDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onAlarmDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onAlarmUpdate(@aa1 BleHandleCallback r1, @aa1 BleAlarm r2) {
            Intrinsics.X0O(r2, NotificationCompat.CATEGORY_ALARM);
            BleHandleCallback.access$onAlarmUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onAppOpUpdate(@aa1 BleHandleCallback r1, @aa1 BleAppOp r2) {
            Intrinsics.X0O(r2, "appOp");
            BleHandleCallback.access$onAppOpUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onAppSportDataResponse(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onAppSportDataResponse$jd(r0, r1);
        }

        @Deprecated
        public static void onBWNaviInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleBWNaviInfo r2) {
            Intrinsics.X0O(r2, "naviInfo");
            BleHandleCallback.access$onBWNaviInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onBacklightUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onBacklightUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onBandKeyUpdate(@aa1 BleHandleCallback r1, @aa1 BleBandKey r2) {
            Intrinsics.X0O(r2, "key");
            BleHandleCallback.access$onBandKeyUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onBleGolfScore(@aa1 BleHandleCallback r1, @aa1 BleGolfScore r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onBleGolfScore$jd(r1, r2);
        }

        @Deprecated
        public static void onBleThirdPartyDataUpdate(@aa1 BleHandleCallback r1, @aa1 BleThirdPartyData r2) {
            Intrinsics.X0O(r2, "thirdPartyData");
            BleHandleCallback.access$onBleThirdPartyDataUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onBleVideoCallInfo(@aa1 BleHandleCallback r1, @aa1 BleVideoCallInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onBleVideoCallInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onCPChatUpdate(@aa1 BleHandleCallback r1, @aa1 BleCPChat r2) {
            Intrinsics.X0O(r2, "chat");
            BleHandleCallback.access$onCPChatUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCPGiftsInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleCPGiftsInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onCPGiftsInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCPListenerUpdate(@aa1 BleHandleCallback r1, @aa1 BleCPListener r2) {
            Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            BleHandleCallback.access$onCPListenerUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCPMissYouUpdate(@aa1 BleHandleCallback r1, @aa1 BleCPMissYou r2) {
            Intrinsics.X0O(r2, "you");
            BleHandleCallback.access$onCPMissYouUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCPTodoUpdate(@aa1 BleHandleCallback r1, @aa1 BleCPTodo r2) {
            Intrinsics.X0O(r2, "todo");
            BleHandleCallback.access$onCPTodoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCaloriesGoalUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onCaloriesGoalUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onCameraResponse(@aa1 BleHandleCallback r0, boolean r1, int r2) {
            BleHandleCallback.access$onCameraResponse$jd(r0, r1, r2);
        }

        @Deprecated
        public static void onCameraStateChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onCameraStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onChatAppUpdate(@aa1 BleHandleCallback r1, @aa1 BleChatApp r2) {
            Intrinsics.X0O(r2, "app");
            BleHandleCallback.access$onChatAppUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onChatMessageUpdate(@aa1 BleHandleCallback r1, @aa1 BleChatMessage r2) {
            Intrinsics.X0O(r2, "message");
            BleHandleCallback.access$onChatMessageUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onChatVoiceUpdate(@aa1 BleHandleCallback r1, @aa1 BleChatVoice r2) {
            Intrinsics.X0O(r2, "voice");
            BleHandleCallback.access$onChatVoiceUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onCheckInEveryDayUpdate(@aa1 BleHandleCallback r1, @aa1 BleCheckInEveryDay r2) {
            Intrinsics.X0O(r2, "everyDay");
            BleHandleCallback.access$onCheckInEveryDayUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onClassicBluetoothStateChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onClassicBluetoothStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onCommandReply(@aa1 BleHandleCallback r1, @aa1 BleKey r2, @aa1 BleKeyFlag r3, boolean r4) {
            Intrinsics.X0O(r2, "bleKey");
            Intrinsics.X0O(r3, "bleKeyFlag");
            BleHandleCallback.access$onCommandReply$jd(r1, r2, r3, r4);
        }

        @Deprecated
        public static void onCommandSendTimeout(@aa1 BleHandleCallback r1, @aa1 BleKey r2, @aa1 BleKeyFlag r3) {
            Intrinsics.X0O(r2, "bleKey");
            Intrinsics.X0O(r3, "bleKeyFlag");
            BleHandleCallback.access$onCommandSendTimeout$jd(r1, r2, r3);
        }

        @Deprecated
        public static void onContactUsStateChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onContactUsStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onDeleteAICoachPlan(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onDeleteAICoachPlan$jd(r0);
        }

        @Deprecated
        public static void onDeleteFileResponse(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onDeleteFileResponse$jd(r0, r1);
        }

        @Deprecated
        public static void onDeviceConnected(@aa1 BleHandleCallback r1, @aa1 BluetoothDevice r2) {
            Intrinsics.X0O(r2, "device");
            BleHandleCallback.access$onDeviceConnected$jd(r1, r2);
        }

        @Deprecated
        public static void onDeviceConnecting(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onDeviceConnecting$jd(r0, r1);
        }

        @Deprecated
        public static void onDeviceFileUpdate(@aa1 BleHandleCallback r1, @aa1 BleDeviceFile r2) {
            Intrinsics.X0O(r2, "deviceFile");
            BleHandleCallback.access$onDeviceFileUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onDeviceOpUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onDeviceOpUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onDeviceRequestAGpsFile(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "url");
            BleHandleCallback.access$onDeviceRequestAGpsFile$jd(r1, r2);
        }

        @Deprecated
        public static void onDeviceSMSQuickReply(@aa1 BleHandleCallback r1, @aa1 BleSMSQuickReply r2) {
            Intrinsics.X0O(r2, "smsQuickReply");
            BleHandleCallback.access$onDeviceSMSQuickReply$jd(r1, r2);
        }

        @Deprecated
        public static void onDeviceSportDataUpdate(@aa1 BleHandleCallback r1, @aa1 BleDeviceSportData r2) {
            Intrinsics.X0O(r2, "deviceSportData");
            BleHandleCallback.access$onDeviceSportDataUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onDistanceGoalUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onDistanceGoalUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onDoubleScreenSettingsUpdate(@aa1 BleHandleCallback r1, @aa1 BleDoubleScreenSettings r2) {
            Intrinsics.X0O(r2, "doubleScreenSettings");
            BleHandleCallback.access$onDoubleScreenSettingsUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onDrinkWaterUpdate(@aa1 BleHandleCallback r1, @aa1 BleDrinkWaterSettings r2) {
            Intrinsics.X0O(r2, "settings");
            BleHandleCallback.access$onDrinkWaterUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onEarphoneAncSettingsUpdate(@aa1 BleHandleCallback r1, @aa1 BleEarphoneAncSettings r2) {
            Intrinsics.X0O(r2, "earphoneAncSettings");
            BleHandleCallback.access$onEarphoneAncSettingsUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onEarphoneCallUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onEarphoneCallUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onEarphoneKeyUpdate(@aa1 BleHandleCallback r1, @aa1 BleEarphoneKey r2) {
            Intrinsics.X0O(r2, "earphoneKey");
            BleHandleCallback.access$onEarphoneKeyUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleHandleCallback r1, @aa1 BleEarphoneSoundEffectsSettings r2) {
            Intrinsics.X0O(r2, "earphoneSoundEffectsSettings");
            BleHandleCallback.access$onEarphoneSoundEffectsSettingsUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onEarphoneStateUpdate(@aa1 BleHandleCallback r1, @aa1 BleEarphoneState r2) {
            Intrinsics.X0O(r2, "earphoneState");
            BleHandleCallback.access$onEarphoneStateUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onFactoryTestUpdate(@aa1 BleHandleCallback r1, @aa1 BleFactoryTest r2) {
            Intrinsics.X0O(r2, "factoryTest");
            BleHandleCallback.access$onFactoryTestUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onFallSetUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onFallSetUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onFindEarphoneUpdate(@aa1 BleHandleCallback r1, @aa1 BleFindEarphone r2) {
            Intrinsics.X0O(r2, "findEarphone");
            BleHandleCallback.access$onFindEarphoneUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onFindPhone(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onFindPhone$jd(r0, r1);
        }

        @Deprecated
        public static void onFindWatchUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onFindWatchUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onFollowSystemDateFormat(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onFollowSystemDateFormat$jd(r0);
        }

        @Deprecated
        public static void onFollowSystemHour(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onFollowSystemHour$jd(r0);
        }

        @Deprecated
        public static void onFollowSystemLanguage(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onFollowSystemLanguage$jd(r0, r1);
        }

        @Deprecated
        public static void onGameControlUpdate(@aa1 BleHandleCallback r1, @aa1 BleGameControl r2) {
            Intrinsics.X0O(r2, "gameControl");
            BleHandleCallback.access$onGameControlUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onGestureWake2Update(@aa1 BleHandleCallback r1, @aa1 BleGestureWake2 r2) {
            Intrinsics.X0O(r2, "gestureWake2");
            BleHandleCallback.access$onGestureWake2Update$jd(r1, r2);
        }

        @Deprecated
        public static void onGestureWakeUpdate(@aa1 BleHandleCallback r1, @aa1 BleGestureWake r2) {
            Intrinsics.X0O(r2, "gestureWake");
            BleHandleCallback.access$onGestureWakeUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onGoogleNaviInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleGoogleNaviInfo r2) {
            Intrinsics.X0O(r2, "naviInfo");
            BleHandleCallback.access$onGoogleNaviInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onHIDState(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onHIDState$jd(r0, r1);
        }

        @Deprecated
        public static void onHIDValueChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onHIDValueChange$jd(r0, r1);
        }

        @Deprecated
        public static void onHRWarningSet(@aa1 BleHandleCallback r1, @aa1 BleHrWarningSettings r2) {
            Intrinsics.X0O(r2, "set");
            BleHandleCallback.access$onHRWarningSet$jd(r1, r2);
        }

        @Deprecated
        public static void onHanBaoVibrationStateChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onHanBaoVibrationStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onHighAntiAssistChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onHighAntiAssistChange$jd(r0, r1);
        }

        @Deprecated
        public static void onHourSystemUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onHourSystemUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onHydrationUpdate(@aa1 BleHandleCallback r1, @aa1 BleHydrationSettings r2) {
            Intrinsics.X0O(r2, "settings");
            BleHandleCallback.access$onHydrationUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIPCExceptionUpdate(@aa1 BleHandleCallback r1, @aa1 BleIPCException r2) {
            Intrinsics.X0O(r2, MqttServiceConstants.TRACE_EXCEPTION);
            BleHandleCallback.access$onIPCExceptionUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIPCOTAStateUpdate(@aa1 BleHandleCallback r1, @aa1 BleIPCOTAState r2) {
            Intrinsics.X0O(r2, "state");
            BleHandleCallback.access$onIPCOTAStateUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIPCStateUpdate(@aa1 BleHandleCallback r1, @aa1 BleIPCState r2) {
            Intrinsics.X0O(r2, "state");
            BleHandleCallback.access$onIPCStateUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIPCStoresInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleIPCStoresInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onIPCStoresInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIPCWifiInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleIPCWifiInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onIPCWifiInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onIdentityCreate(@aa1 BleHandleCallback r0, boolean r1, @tb1 BleDeviceInfo r2) {
            BleHandleCallback.access$onIdentityCreate$jd(r0, r1, r2);
        }

        public static /* synthetic */ void onIdentityCreate$default(BleHandleCallback r0, boolean r1, BleDeviceInfo r2, int r3, Object r4) {
            BleHandleCallback.onIdentityCreate$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static void onIdentityDelete(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onIdentityDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onIdentityDeleteByDevice(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onIdentityDeleteByDevice$jd(r0, r1);
        }

        @Deprecated
        public static void onIncomingCallRingUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onIncomingCallRingUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onIncomingCallStatus(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onIncomingCallStatus$jd(r0, r1);
        }

        @Deprecated
        public static void onLoveTapUpdate(@aa1 BleHandleCallback r1, @aa1 BleLoveTap r2) {
            Intrinsics.X0O(r2, "loveTap");
            BleHandleCallback.access$onLoveTapUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onLoveTapUserDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onLoveTapUserDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onLoveTapUserUpdate(@aa1 BleHandleCallback r1, @aa1 BleLoveTapUser r2) {
            Intrinsics.X0O(r2, "loveTapUser");
            BleHandleCallback.access$onLoveTapUserUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onMeasurementUpdate(@aa1 BleHandleCallback r1, @aa1 BleMeasurement r2) {
            Intrinsics.X0O(r2, "measurement");
            BleHandleCallback.access$onMeasurementUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onMedicationAlarmAdd(@aa1 BleHandleCallback r1, @aa1 BleMedicationAlarm r2) {
            Intrinsics.X0O(r2, "medicationAlarm");
            BleHandleCallback.access$onMedicationAlarmAdd$jd(r1, r2);
        }

        @Deprecated
        public static void onMedicationAlarmDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onMedicationAlarmDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onMedicationAlarmUpdate(@aa1 BleHandleCallback r1, @aa1 BleMedicationAlarm r2) {
            Intrinsics.X0O(r2, "medicationAlarm");
            BleHandleCallback.access$onMedicationAlarmUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onMedicationReminderDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onMedicationReminderDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onMedicationReminderUpdate(@aa1 BleHandleCallback r1, @aa1 BleMedicationReminder r2) {
            Intrinsics.X0O(r2, "medicationReminder");
            BleHandleCallback.access$onMedicationReminderUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onMeetingReminderAdd(@aa1 BleHandleCallback r1, @aa1 BleMeetingReminder r2) {
            Intrinsics.X0O(r2, "meetingReminder");
            BleHandleCallback.access$onMeetingReminderAdd$jd(r1, r2);
        }

        @Deprecated
        public static void onMeetingReminderDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onMeetingReminderDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onMeetingReminderUpdate(@aa1 BleHandleCallback r1, @aa1 BleMeetingReminder r2) {
            Intrinsics.X0O(r2, "meetingReminder");
            BleHandleCallback.access$onMeetingReminderUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onMultiFileTransferReadFile(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onMultiFileTransferReadFile$jd(r0, r1);
        }

        @Deprecated
        public static void onMultiFileTransferResponse(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onMultiFileTransferResponse$jd(r0, r1);
        }

        @Deprecated
        public static void onNaviInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleNaviInfo r2) {
            Intrinsics.X0O(r2, "naviInfo");
            BleHandleCallback.access$onNaviInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onNoDisturbUpdate(@aa1 BleHandleCallback r1, @aa1 BleNoDisturbSettings r2) {
            Intrinsics.X0O(r2, "noDisturbSettings");
            BleHandleCallback.access$onNoDisturbUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onNotificationLightScreenSetUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onNotificationLightScreenSetUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onNotificationSettings2Update(@aa1 BleHandleCallback r1, @aa1 BleNotificationSettings2 r2) {
            Intrinsics.X0O(r2, "notificationSettings2");
            BleHandleCallback.access$onNotificationSettings2Update$jd(r1, r2);
        }

        @Deprecated
        public static void onOTA(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onOTA$jd(r0, r1);
        }

        @Deprecated
        public static void onPowerSaveModeState(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onPowerSaveModeState$jd(r0, r1);
        }

        @Deprecated
        public static void onPowerSaveModeStateChange(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onPowerSaveModeStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onQiblaSettingsUpdate(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onQiblaSettingsUpdate$jd(r0);
        }

        @Deprecated
        public static void onReadAICoachGenerateBeforeInfo(@aa1 BleHandleCallback r1, @aa1 BleAICoachBeforePlan r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadAICoachGenerateBeforeInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAICoachGenerateBeforeInfoV2(@aa1 BleHandleCallback r1, @aa1 BleAICoachBeforePlanV2 r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadAICoachGenerateBeforeInfoV2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAICoachPlan(@aa1 BleHandleCallback r1, @aa1 BleAICoachGeneratePlan r2) {
            Intrinsics.X0O(r2, "plan");
            BleHandleCallback.access$onReadAICoachPlan$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAICoachPlanV2(@aa1 BleHandleCallback r1, @aa1 BleAICoachGeneratePlanV2 r2) {
            Intrinsics.X0O(r2, "plan");
            BleHandleCallback.access$onReadAICoachPlanV2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadActivity(@aa1 BleHandleCallback r1, @aa1 List<BleActivity> r2) {
            Intrinsics.X0O(r2, "activities");
            BleHandleCallback.access$onReadActivity$jd(r1, r2);
        }

        @Deprecated
        public static void onReadActivityDetail(@aa1 BleHandleCallback r1, @aa1 BleActivityDetail r2) {
            Intrinsics.X0O(r2, "activityDetail");
            BleHandleCallback.access$onReadActivityDetail$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAddressBook(@aa1 BleHandleCallback r1, @aa1 BleAddressBook r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadAddressBook$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAlarm(@aa1 BleHandleCallback r1, @aa1 List<BleAlarm> r2) {
            Intrinsics.X0O(r2, "alarms");
            BleHandleCallback.access$onReadAlarm$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAlipayBindInfo(@aa1 BleHandleCallback r1, @aa1 List<BleAlipayBindInfo> r2) {
            Intrinsics.X0O(r2, "alipayBindInfos");
            BleHandleCallback.access$onReadAlipayBindInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAlipaySettings(@aa1 BleHandleCallback r1, @aa1 BleAlipaySettings r2) {
            Intrinsics.X0O(r2, "alipaySettings");
            BleHandleCallback.access$onReadAlipaySettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAppApiVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadAppApiVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAppInfoList(@aa1 BleHandleCallback r1, @aa1 BleAppInfoList r2) {
            Intrinsics.X0O(r2, "appInfoList");
            BleHandleCallback.access$onReadAppInfoList$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAppSportState(@aa1 BleHandleCallback r1, @aa1 BleAppSportState r2) {
            Intrinsics.X0O(r2, "appSportState");
            BleHandleCallback.access$onReadAppSportState$jd(r1, r2);
        }

        @Deprecated
        public static void onReadAvgHeartRate(@aa1 BleHandleCallback r1, @aa1 List<BleAvgHeartRate> r2) {
            Intrinsics.X0O(r2, "heartRates");
            BleHandleCallback.access$onReadAvgHeartRate$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBAC(@aa1 BleHandleCallback r1, @aa1 List<BleBAC> r2) {
            Intrinsics.X0O(r2, "bacs");
            BleHandleCallback.access$onReadBAC$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBacCalibration(@aa1 BleHandleCallback r1, @aa1 BleBacCalibration r2, @aa1 BleKeyFlag r3) {
            Intrinsics.X0O(r2, "bac");
            Intrinsics.X0O(r3, "bleKeyFlag");
            BleHandleCallback.access$onReadBacCalibration$jd(r1, r2, r3);
        }

        @Deprecated
        public static void onReadBacklight(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadBacklight$jd(r0, r1);
        }

        @Deprecated
        public static void onReadBatteryUsage(@aa1 BleHandleCallback r1, @aa1 BleBatteryUsage r2) {
            Intrinsics.X0O(r2, "batteryUsage");
            BleHandleCallback.access$onReadBatteryUsage$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleAddress(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "address");
            BleHandleCallback.access$onReadBleAddress$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleGolfMapCacheInfo(@aa1 BleHandleCallback r1, @aa1 BleGolfMapCacheInfo r2) {
            Intrinsics.X0O(r2, "bleGolfMapCacheInfo");
            BleHandleCallback.access$onReadBleGolfMapCacheInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleGolfSportSwitch(@aa1 BleHandleCallback r1, @aa1 BleGolfSportSwitch r2) {
            Intrinsics.X0O(r2, "bleGolfSportSwitch");
            BleHandleCallback.access$onReadBleGolfSportSwitch$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleGolfWatchMapInfo(@aa1 BleHandleCallback r1, @aa1 BleGolfWatchMapInfo r2) {
            Intrinsics.X0O(r2, "bleGolfWatchMapInfo");
            BleHandleCallback.access$onReadBleGolfWatchMapInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleGolfWatchVersionInfo(@aa1 BleHandleCallback r1, @aa1 BleGolfWatchVersionInfo r2) {
            Intrinsics.X0O(r2, "bleGolfWatchVersionInfo");
            BleHandleCallback.access$onReadBleGolfWatchVersionInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleHrv(@aa1 BleHandleCallback r1, @aa1 List<BleHrv> r2) {
            Intrinsics.X0O(r2, q62.XOX1);
            BleHandleCallback.access$onReadBleHrv$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBleLogText(@aa1 BleHandleCallback r1, @aa1 List<BleLogText> r2) {
            Intrinsics.X0O(r2, uz0.OXO1);
            BleHandleCallback.access$onReadBleLogText$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBloodGlucose(@aa1 BleHandleCallback r1, @aa1 List<BleBloodGlucose> r2) {
            Intrinsics.X0O(r2, "bloodGlucoses");
            BleHandleCallback.access$onReadBloodGlucose$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBloodOxyGenSettings(@aa1 BleHandleCallback r1, @aa1 BleBloodOxyGenSettings r2) {
            Intrinsics.X0O(r2, "bloodOxyGenSettings");
            BleHandleCallback.access$onReadBloodOxyGenSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBloodOxygen(@aa1 BleHandleCallback r1, @aa1 List<BleBloodOxygen> r2) {
            Intrinsics.X0O(r2, "bloodOxygen");
            BleHandleCallback.access$onReadBloodOxygen$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBloodPressure(@aa1 BleHandleCallback r1, @aa1 List<BleBloodPressure> r2) {
            Intrinsics.X0O(r2, "bloodPressures");
            BleHandleCallback.access$onReadBloodPressure$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBloodPressureCalibration(@aa1 BleHandleCallback r1, @aa1 BleBloodPressureCalibration r2) {
            Intrinsics.X0O(r2, "bloodPressureCalibration");
            BleHandleCallback.access$onReadBloodPressureCalibration$jd(r1, r2);
        }

        @Deprecated
        public static void onReadBodyStatus(@aa1 BleHandleCallback r1, @aa1 List<BleBodyStatus> r2) {
            Intrinsics.X0O(r2, "bodyData");
            BleHandleCallback.access$onReadBodyStatus$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCPUserInfo(@aa1 BleHandleCallback r1, @aa1 BleCPUserInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadCPUserInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCalibrationData(@aa1 BleHandleCallback r1, @aa1 BleCalibrationData r2) {
            Intrinsics.X0O(r2, "calibrationData");
            BleHandleCallback.access$onReadCalibrationData$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCalorieIntake(@aa1 BleHandleCallback r1, @aa1 List<BleCalorieIntake> r2) {
            Intrinsics.X0O(r2, "calorieIntakes");
            BleHandleCallback.access$onReadCalorieIntake$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCaloriesGoal(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadCaloriesGoal$jd(r0, r1);
        }

        @Deprecated
        public static void onReadChatApp(@aa1 BleHandleCallback r1, @aa1 BleChatApp r2) {
            Intrinsics.X0O(r2, "app");
            BleHandleCallback.access$onReadChatApp$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCheckInEveryDay(@aa1 BleHandleCallback r1, @aa1 BleCheckInEveryDay r2) {
            Intrinsics.X0O(r2, "everyDay");
            BleHandleCallback.access$onReadCheckInEveryDay$jd(r1, r2);
        }

        @Deprecated
        public static void onReadClassicBluetoothState(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadClassicBluetoothState$jd(r0, r1);
        }

        @Deprecated
        public static void onReadCoachingIds(@aa1 BleHandleCallback r1, @aa1 BleCoachingIds r2) {
            Intrinsics.X0O(r2, "bleCoachingIds");
            BleHandleCallback.access$onReadCoachingIds$jd(r1, r2);
        }

        @Deprecated
        public static void onReadCyWeeAlgorithm(@aa1 BleHandleCallback r1, @aa1 BleCyWeeAlgorithm r2) {
            Intrinsics.X0O(r2, "bleCyWeeAlgorithm");
            BleHandleCallback.access$onReadCyWeeAlgorithm$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDailyPower(@aa1 BleHandleCallback r1, @aa1 List<BlePhysicalPower> r2) {
            Intrinsics.X0O(r2, "powers");
            BleHandleCallback.access$onReadDailyPower$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDateFormat(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadDateFormat$jd(r0, r1);
        }

        @Deprecated
        public static void onReadDeviceFile(@aa1 BleHandleCallback r1, @aa1 BleDeviceFile r2) {
            Intrinsics.X0O(r2, "deviceFile");
            BleHandleCallback.access$onReadDeviceFile$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceFileV2(@aa1 BleHandleCallback r1, @aa1 BleDeviceFile2 r2) {
            Intrinsics.X0O(r2, "deviceFile");
            BleHandleCallback.access$onReadDeviceFileV2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceInfo(@aa1 BleHandleCallback r1, @aa1 BleDeviceInfo r2) {
            Intrinsics.X0O(r2, "deviceInfo");
            BleHandleCallback.access$onReadDeviceInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceInfo2(@aa1 BleHandleCallback r1, @aa1 BleDeviceInfo2 r2) {
            Intrinsics.X0O(r2, "deviceInfo");
            BleHandleCallback.access$onReadDeviceInfo2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceLanguages(@aa1 BleHandleCallback r1, @aa1 BleDeviceLanguages r2) {
            Intrinsics.X0O(r2, "deviceLanguages");
            BleHandleCallback.access$onReadDeviceLanguages$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceLanguages2(@aa1 BleHandleCallback r1, @aa1 BleDeviceLanguages2 r2) {
            Intrinsics.X0O(r2, "deviceLanguages");
            BleHandleCallback.access$onReadDeviceLanguages2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDeviceUniqueDataSettings(@aa1 BleHandleCallback r1, @aa1 BleDeviceUniqueDataSettings r2) {
            Intrinsics.X0O(r2, "deviceUniqueDataSettings");
            BleHandleCallback.access$onReadDeviceUniqueDataSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDistanceGoal(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadDistanceGoal$jd(r0, r1);
        }

        @Deprecated
        public static void onReadDoubleScreenSettings(@aa1 BleHandleCallback r1, @aa1 BleDoubleScreenSettings r2) {
            Intrinsics.X0O(r2, "doubleScreenSettings");
            BleHandleCallback.access$onReadDoubleScreenSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadDrinkWater(@aa1 BleHandleCallback r1, @aa1 BleDrinkWaterSettings r2) {
            Intrinsics.X0O(r2, "drinkWaterSettings");
            BleHandleCallback.access$onReadDrinkWater$jd(r1, r2);
        }

        @Deprecated
        public static void onReadECGRealtime(@aa1 BleHandleCallback r1, @aa1 BleECGRealtime r2) {
            Intrinsics.X0O(r2, "ecgRealtime");
            BleHandleCallback.access$onReadECGRealtime$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphoneAncSettings(@aa1 BleHandleCallback r1, @aa1 BleEarphoneAncSettings r2) {
            Intrinsics.X0O(r2, "earphoneAncSettings");
            BleHandleCallback.access$onReadEarphoneAncSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphoneCall(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadEarphoneCall$jd(r0, r1);
        }

        @Deprecated
        public static void onReadEarphoneInfo(@aa1 BleHandleCallback r1, @aa1 BleEarphoneInfo r2) {
            Intrinsics.X0O(r2, "earphoneInfo");
            BleHandleCallback.access$onReadEarphoneInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphoneKey(@aa1 BleHandleCallback r1, @aa1 BleEarphoneKey r2) {
            Intrinsics.X0O(r2, "earphoneKey");
            BleHandleCallback.access$onReadEarphoneKey$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphonePower(@aa1 BleHandleCallback r1, @aa1 BleEarphonePower r2) {
            Intrinsics.X0O(r2, "earphonePower");
            BleHandleCallback.access$onReadEarphonePower$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphoneSoundEffectsSettings(@aa1 BleHandleCallback r1, @aa1 BleEarphoneSoundEffectsSettings r2) {
            Intrinsics.X0O(r2, "earphoneSoundEffectsSettings");
            BleHandleCallback.access$onReadEarphoneSoundEffectsSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEarphoneState(@aa1 BleHandleCallback r1, @aa1 BleEarphoneState r2) {
            Intrinsics.X0O(r2, "earphoneState");
            BleHandleCallback.access$onReadEarphoneState$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEcg(@aa1 BleHandleCallback r1, @aa1 List<BleEcg> r2) {
            Intrinsics.X0O(r2, "ecgs");
            BleHandleCallback.access$onReadEcg$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEcgSettings(@aa1 BleHandleCallback r1, @aa1 BleEcgSettings r2) {
            Intrinsics.X0O(r2, "ecgSettings");
            BleHandleCallback.access$onReadEcgSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadEnergyRating(@aa1 BleHandleCallback r1, @aa1 List<BleEnergyRating> r2) {
            Intrinsics.X0O(r2, "energyRating");
            BleHandleCallback.access$onReadEnergyRating$jd(r1, r2);
        }

        @Deprecated
        public static void onReadFallSet(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadFallSet$jd(r0, r1);
        }

        @Deprecated
        public static void onReadFilePath(@aa1 BleHandleCallback r1, @aa1 BleAppAudioBookList r2) {
            Intrinsics.X0O(r2, Y5.c.c);
            BleHandleCallback.access$onReadFilePath$jd(r1, r2);
        }

        @Deprecated
        public static void onReadFirmwareVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadFirmwareVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadFoodBalance(@aa1 BleHandleCallback r1, @aa1 List<BleFoodBalance> r2) {
            Intrinsics.X0O(r2, "foodBalances");
            BleHandleCallback.access$onReadFoodBalance$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGestureWake(@aa1 BleHandleCallback r1, @aa1 BleGestureWake r2) {
            Intrinsics.X0O(r2, "gestureWake");
            BleHandleCallback.access$onReadGestureWake$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGestureWake2(@aa1 BleHandleCallback r1, @aa1 BleGestureWake2 r2) {
            Intrinsics.X0O(r2, "gestureWake2");
            BleHandleCallback.access$onReadGestureWake2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGirlCareMonthly(@aa1 BleHandleCallback r1, @aa1 BleGirlCareMonthly r2) {
            Intrinsics.X0O(r2, "girlCareMonthly");
            BleHandleCallback.access$onReadGirlCareMonthly$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGirlCareSettings(@aa1 BleHandleCallback r1, @aa1 BleGirlCareSettings r2) {
            Intrinsics.X0O(r2, "girlCareSettings");
            BleHandleCallback.access$onReadGirlCareSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGoMoreSettings(@aa1 BleHandleCallback r1, @aa1 BleGoMoreSettings r2) {
            Intrinsics.X0O(r2, "goMoreSettings");
            BleHandleCallback.access$onReadGoMoreSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGolfWatchScore(@aa1 BleHandleCallback r1, @aa1 BleGolfWatchScore r2) {
            Intrinsics.X0O(r2, "watchScore");
            BleHandleCallback.access$onReadGolfWatchScore$jd(r1, r2);
        }

        @Deprecated
        public static void onReadGpsFirmwareVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadGpsFirmwareVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHanBaoSettings(@aa1 BleHandleCallback r1, @aa1 BleHanBaoSettings r2) {
            Intrinsics.X0O(r2, "hanBaoSettings");
            BleHandleCallback.access$onReadHanBaoSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHanBaoVibration(@aa1 BleHandleCallback r1, @aa1 List<BleHanBaoVibration> r2) {
            Intrinsics.X0O(r2, "hanBaoVibrations");
            BleHandleCallback.access$onReadHanBaoVibration$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHeartRate(@aa1 BleHandleCallback r1, @aa1 List<BleHeartRate> r2) {
            Intrinsics.X0O(r2, "heartRates");
            BleHandleCallback.access$onReadHeartRate$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHeartRateZones(@aa1 BleHandleCallback r1, @aa1 BleHeartRateZones r2) {
            Intrinsics.X0O(r2, "bmp");
            BleHandleCallback.access$onReadHeartRateZones$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHourSystem(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadHourSystem$jd(r0, r1);
        }

        @Deprecated
        public static void onReadHrMonitoringSettings(@aa1 BleHandleCallback r1, @aa1 BleHrMonitoringSettings r2) {
            Intrinsics.X0O(r2, "hrMonitoringSettings");
            BleHandleCallback.access$onReadHrMonitoringSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHrMonitoringSettingsV2(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadHrMonitoringSettingsV2$jd(r0, r1);
        }

        @Deprecated
        public static void onReadHrvBaseLine(@aa1 BleHandleCallback r1, @aa1 BleHrvBaseLine r2) {
            Intrinsics.X0O(r2, "mBleHrvBaseLine");
            BleHandleCallback.access$onReadHrvBaseLine$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHrvMonitoringSettings(@aa1 BleHandleCallback r1, @aa1 BleHrvMonitoringSettings r2) {
            Intrinsics.X0O(r2, "hrvMonitoringSettings");
            BleHandleCallback.access$onReadHrvMonitoringSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadHydrationSettings(@aa1 BleHandleCallback r1, @aa1 BleHydrationSettings r2) {
            Intrinsics.X0O(r2, "hydrationSettings");
            BleHandleCallback.access$onReadHydrationSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadIPCInfo(@aa1 BleHandleCallback r1, @aa1 BleIPCInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadIPCInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadIPCState(@aa1 BleHandleCallback r1, @aa1 BleIPCState r2) {
            Intrinsics.X0O(r2, "state");
            BleHandleCallback.access$onReadIPCState$jd(r1, r2);
        }

        @Deprecated
        public static void onReadIPCStoresInfo(@aa1 BleHandleCallback r1, @aa1 BleIPCStoresInfo r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadIPCStoresInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadIPCVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadIPCVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadIncomingCallRing(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadIncomingCallRing$jd(r0, r1);
        }

        @Deprecated
        public static void onReadLactateThreshold(@aa1 BleHandleCallback r1, @aa1 List<BleLactateThreshold> r2) {
            Intrinsics.X0O(r2, "lactateThreshold");
            BleHandleCallback.access$onReadLactateThreshold$jd(r1, r2);
        }

        @Deprecated
        public static void onReadLanguage(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadLanguage$jd(r0, r1);
        }

        @Deprecated
        public static void onReadLanguagePackVersion(@aa1 BleHandleCallback r1, @aa1 BleLanguagePackVersion r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadLanguagePackVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadLocation(@aa1 BleHandleCallback r1, @aa1 List<BleLocation> r2) {
            Intrinsics.X0O(r2, "locations");
            BleHandleCallback.access$onReadLocation$jd(r1, r2);
        }

        @Deprecated
        public static void onReadLoveTapUser(@aa1 BleHandleCallback r1, @aa1 List<BleLoveTapUser> r2) {
            Intrinsics.X0O(r2, "loveTapUsers");
            BleHandleCallback.access$onReadLoveTapUser$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMatchRecord(@aa1 BleHandleCallback r1, @aa1 List<BleMatchRecord> r2) {
            Intrinsics.X0O(r2, "matchRecords");
            BleHandleCallback.access$onReadMatchRecord$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMatchRecord2(@aa1 BleHandleCallback r1, @aa1 List<BleMatchRecord2> r2) {
            Intrinsics.X0O(r2, "matchRecords");
            BleHandleCallback.access$onReadMatchRecord2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMatchRecord3(@aa1 BleHandleCallback r1, @aa1 List<BleMatchRecord3> r2) {
            Intrinsics.X0O(r2, "matchRecords");
            BleHandleCallback.access$onReadMatchRecord3$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMedicationAlarm(@aa1 BleHandleCallback r1, @aa1 List<BleMedicationAlarm> r2) {
            Intrinsics.X0O(r2, "medicationAlarm");
            BleHandleCallback.access$onReadMedicationAlarm$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMedicationReminder(@aa1 BleHandleCallback r1, @aa1 List<BleMedicationReminder> r2) {
            Intrinsics.X0O(r2, "medicationReminders");
            BleHandleCallback.access$onReadMedicationReminder$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMeetingReminder(@aa1 BleHandleCallback r1, @aa1 List<BleMeetingReminder> r2) {
            Intrinsics.X0O(r2, "meetingReminders");
            BleHandleCallback.access$onReadMeetingReminder$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMindStatus(@aa1 BleHandleCallback r1, @aa1 List<BleMindStatus> r2) {
            Intrinsics.X0O(r2, "feelingData");
            BleHandleCallback.access$onReadMindStatus$jd(r1, r2);
        }

        @Deprecated
        public static void onReadMtkOtaMeta(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onReadMtkOtaMeta$jd(r0);
        }

        @Deprecated
        public static void onReadMultiFileTransfer(@aa1 BleHandleCallback r1, @aa1 BleMapFileList r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onReadMultiFileTransfer$jd(r1, r2);
        }

        @Deprecated
        public static void onReadNetworkFirmwareVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadNetworkFirmwareVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadNoDisturb(@aa1 BleHandleCallback r1, @aa1 BleNoDisturbSettings r2) {
            Intrinsics.X0O(r2, "noDisturbSettings");
            BleHandleCallback.access$onReadNoDisturb$jd(r1, r2);
        }

        @Deprecated
        public static void onReadNotificationLightScreenSet(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadNotificationLightScreenSet$jd(r0, r1);
        }

        @Deprecated
        public static void onReadNotificationSettings2(@aa1 BleHandleCallback r1, @aa1 BleNotificationSettings2 r2) {
            Intrinsics.X0O(r2, "notificationSettings2");
            BleHandleCallback.access$onReadNotificationSettings2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadOfflineAsrSettings(@aa1 BleHandleCallback r1, @aa1 BleOfflineAsrSettings r2) {
            Intrinsics.X0O(r2, "settings");
            BleHandleCallback.access$onReadOfflineAsrSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadOngoingDialogue(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadOngoingDialogue$jd(r0, r1);
        }

        @Deprecated
        public static void onReadOptionalMapAuthInfo(@aa1 BleHandleCallback r1, @aa1 BleOptionalMapAuthInfo r2) {
            Intrinsics.X0O(r2, "optionalMapAuthInfo");
            BleHandleCallback.access$onReadOptionalMapAuthInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadPackageStatus(@aa1 BleHandleCallback r1, @aa1 BlePackageStatus r2) {
            Intrinsics.X0O(r2, "packageStatus");
            BleHandleCallback.access$onReadPackageStatus$jd(r1, r2);
        }

        @Deprecated
        public static void onReadPower(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadPower$jd(r0, r1);
        }

        @Deprecated
        public static void onReadPower2(@aa1 BleHandleCallback r1, @aa1 BlePower2 r2) {
            Intrinsics.X0O(r2, "power");
            BleHandleCallback.access$onReadPower2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadPressure(@aa1 BleHandleCallback r1, @aa1 List<BlePressure> r2) {
            Intrinsics.X0O(r2, "pressures");
            BleHandleCallback.access$onReadPressure$jd(r1, r2);
        }

        @Deprecated
        public static void onReadPressureTimingMeasurement(@aa1 BleHandleCallback r1, @aa1 BlePressureTimingMeasurement r2) {
            Intrinsics.X0O(r2, "pressureTimingMeasurement");
            BleHandleCallback.access$onReadPressureTimingMeasurement$jd(r1, r2);
        }

        @Deprecated
        public static void onReadQiblaSettings(@aa1 BleHandleCallback r1, @aa1 BleQiblaSettings r2) {
            Intrinsics.X0O(r2, "qiblaSettings");
            BleHandleCallback.access$onReadQiblaSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadRecordControl(@aa1 BleHandleCallback r1, @aa1 BleRecordControl r2) {
            Intrinsics.X0O(r2, "control");
            BleHandleCallback.access$onReadRecordControl$jd(r1, r2);
        }

        @Deprecated
        public static void onReadRelaxReminder(@aa1 BleHandleCallback r1, @aa1 BleRelaxReminder r2) {
            Intrinsics.X0O(r2, NotificationCompat.CATEGORY_REMINDER);
            BleHandleCallback.access$onReadRelaxReminder$jd(r1, r2);
        }

        @Deprecated
        public static void onReadRespiratoryRate(@aa1 BleHandleCallback r1, @aa1 List<BleRespiratoryRate> r2) {
            Intrinsics.X0O(r2, "rate");
            BleHandleCallback.access$onReadRespiratoryRate$jd(r1, r2);
        }

        @Deprecated
        public static void onReadRestingHeartRate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadRestingHeartRate$jd(r0, r1);
        }

        @Deprecated
        public static void onReadRingVibrationSet(@aa1 BleHandleCallback r1, @aa1 BleRingVibrationSettings r2) {
            Intrinsics.X0O(r2, "ringVibrationSettings");
            BleHandleCallback.access$onReadRingVibrationSet$jd(r1, r2);
        }

        @Deprecated
        public static void onReadRri(@aa1 BleHandleCallback r1, @aa1 List<BleRri> r2) {
            Intrinsics.X0O(r2, "rris");
            BleHandleCallback.access$onReadRri$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSDCardInfo(@aa1 BleHandleCallback r1, @aa1 BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            BleHandleCallback.access$onReadSDCardInfo$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSGCameraSet(@aa1 BleHandleCallback r1, @aa1 BleSGCameraSet r2) {
            Intrinsics.X0O(r2, "cameraSet");
            BleHandleCallback.access$onReadSGCameraSet$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSGKeySet(@aa1 BleHandleCallback r1, @aa1 BleSGKeySet r2) {
            Intrinsics.X0O(r2, "set");
            BleHandleCallback.access$onReadSGKeySet$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSGKeywordAwake(@aa1 BleHandleCallback r1, @aa1 BleSGKeywordAwake r2) {
            Intrinsics.X0O(r2, "keyword");
            BleHandleCallback.access$onReadSGKeywordAwake$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSGSet(@aa1 BleHandleCallback r1, @aa1 BleSGSet r2) {
            Intrinsics.X0O(r2, "set");
            BleHandleCallback.access$onReadSGSet$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSGSleepSet(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSGSleepSet$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSOSSettings(@aa1 BleHandleCallback r1, @aa1 BleSOSSettings r2) {
            Intrinsics.X0O(r2, "sosSettings");
            BleHandleCallback.access$onReadSOSSettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadScreenBrightnessSet(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadScreenBrightnessSet$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSedentariness(@aa1 BleHandleCallback r1, @aa1 BleSedentarinessSettings r2) {
            Intrinsics.X0O(r2, "sedentarinessSettings");
            BleHandleCallback.access$onReadSedentariness$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSleep(@aa1 BleHandleCallback r1, @aa1 List<BleSleep> r2) {
            Intrinsics.X0O(r2, "sleeps");
            BleHandleCallback.access$onReadSleep$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSleepGoal(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepGoal$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSleepMonitoringMode(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepMonitoringMode$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSleepQuality(@aa1 BleHandleCallback r1, @aa1 BleSleepQuality r2) {
            Intrinsics.X0O(r2, "sleepQuality");
            BleHandleCallback.access$onReadSleepQuality$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSleepQualityScore(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepQualityScore$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSleepRaw(@aa1 BleHandleCallback r1, @aa1 byte[] r2) {
            Intrinsics.X0O(r2, "sleepRawData");
            BleHandleCallback.access$onReadSleepRaw$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSleepRespiratoryRate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepRespiratoryRate$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSleepRiskLevel(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepRiskLevel$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSleepSet(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSleepSet$jd(r0, r1);
        }

        @Deprecated
        public static void onReadSosCallLog(@aa1 BleHandleCallback r1, @aa1 List<BleSosCallLog> r2) {
            Intrinsics.X0O(r2, "callLogs");
            BleHandleCallback.access$onReadSosCallLog$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSosContact(@aa1 BleHandleCallback r1, @aa1 BleSosContact r2) {
            Intrinsics.X0O(r2, "sosContact");
            BleHandleCallback.access$onReadSosContact$jd(r1, r2);
        }

        @Deprecated
        public static void onReadSportDurationGoal(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadSportDurationGoal$jd(r0, r1);
        }

        @Deprecated
        public static void onReadStandbyWatchFaceSet(@aa1 BleHandleCallback r1, @aa1 BleStandbyWatchFaceSet r2) {
            Intrinsics.X0O(r2, "standbyWatchFaceSet");
            BleHandleCallback.access$onReadStandbyWatchFaceSet$jd(r1, r2);
        }

        @Deprecated
        public static void onReadStepGoal(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadStepGoal$jd(r0, r1);
        }

        @Deprecated
        public static void onReadStock(@aa1 BleHandleCallback r1, @aa1 List<BleStock> r2) {
            Intrinsics.X0O(r2, "stocks");
            BleHandleCallback.access$onReadStock$jd(r1, r2);
        }

        @Deprecated
        public static void onReadTemperature(@aa1 BleHandleCallback r1, @aa1 List<BleTemperature> r2) {
            Intrinsics.X0O(r2, "temperatures");
            BleHandleCallback.access$onReadTemperature$jd(r1, r2);
        }

        @Deprecated
        public static void onReadTemperatureUnit(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadTemperatureUnit$jd(r0, r1);
        }

        @Deprecated
        public static void onReadTrainingStatus(@aa1 BleHandleCallback r1, @aa1 List<BleTrainingStatus> r2) {
            Intrinsics.X0O(r2, "status");
            BleHandleCallback.access$onReadTrainingStatus$jd(r1, r2);
        }

        @Deprecated
        public static void onReadTuyaKey(@aa1 BleHandleCallback r1, @aa1 BleTuyaKey r2) {
            Intrinsics.X0O(r2, "tuyaKey");
            BleHandleCallback.access$onReadTuyaKey$jd(r1, r2);
        }

        @Deprecated
        public static void onReadUiPackVersion(@aa1 BleHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "version");
            BleHandleCallback.access$onReadUiPackVersion$jd(r1, r2);
        }

        @Deprecated
        public static void onReadUnit(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadUnit$jd(r0, r1);
        }

        @Deprecated
        public static void onReadUserProfile(@aa1 BleHandleCallback r1, @aa1 BleUserProfile r2) {
            Intrinsics.X0O(r2, "userProfile");
            BleHandleCallback.access$onReadUserProfile$jd(r1, r2);
        }

        @Deprecated
        public static void onReadVitalityValue(@aa1 BleHandleCallback r1, @aa1 List<BleVitality> r2) {
            Intrinsics.X0O(r2, "vitalityValue");
            BleHandleCallback.access$onReadVitalityValue$jd(r1, r2);
        }

        @Deprecated
        public static void onReadVoiceControl(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadVoiceControl$jd(r0, r1);
        }

        @Deprecated
        public static void onReadWatchFaceId(@aa1 BleHandleCallback r1, @aa1 BleWatchFaceId r2) {
            Intrinsics.X0O(r2, "watchFaceId");
            BleHandleCallback.access$onReadWatchFaceId$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWatchFaceIndex(@aa1 BleHandleCallback r1, @aa1 BleWatchFaceIndex r2) {
            Intrinsics.X0O(r2, "watchfaceIndex");
            BleHandleCallback.access$onReadWatchFaceIndex$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWatchFaceMaxSize(@aa1 BleHandleCallback r1, @aa1 BleWatchFaceMaxSize r2) {
            Intrinsics.X0O(r2, "sizeInfo");
            BleHandleCallback.access$onReadWatchFaceMaxSize$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWatchFaceSwitch(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadWatchFaceSwitch$jd(r0, r1);
        }

        @Deprecated
        public static void onReadWatchPassword(@aa1 BleHandleCallback r1, @aa1 BleSettingWatchPassword r2) {
            Intrinsics.X0O(r2, "watchPassword");
            BleHandleCallback.access$onReadWatchPassword$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWearWayState(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onReadWearWayState$jd(r0, r1);
        }

        @Deprecated
        public static void onReadWeatherRealTime(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onReadWeatherRealTime$jd(r0, r1);
        }

        @Deprecated
        public static void onReadWechatPaySettings(@aa1 BleHandleCallback r1, @aa1 BleWechatPaySettings r2) {
            Intrinsics.X0O(r2, "wechatPaySetting");
            BleHandleCallback.access$onReadWechatPaySettings$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorkout(@aa1 BleHandleCallback r1, @aa1 List<BleWorkout> r2) {
            Intrinsics.X0O(r2, "workouts");
            BleHandleCallback.access$onReadWorkout$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorkout2(@aa1 BleHandleCallback r1, @aa1 List<BleWorkout2> r2) {
            Intrinsics.X0O(r2, "workouts");
            BleHandleCallback.access$onReadWorkout2$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorkout3(@aa1 BleHandleCallback r1, @aa1 List<BleWorkout3> r2) {
            Intrinsics.X0O(r2, "workouts");
            BleHandleCallback.access$onReadWorkout3$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorkout4(@aa1 BleHandleCallback r1, @aa1 List<BleWorkout4> r2) {
            Intrinsics.X0O(r2, "workouts");
            BleHandleCallback.access$onReadWorkout4$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorkout4Segmentation(@aa1 BleHandleCallback r1, @aa1 BleWorkout4Segmentation r2) {
            Intrinsics.X0O(r2, "mBleWorkout4Segmentation");
            BleHandleCallback.access$onReadWorkout4Segmentation$jd(r1, r2);
        }

        @Deprecated
        public static void onReadWorldClock(@aa1 BleHandleCallback r1, @aa1 List<BleWorldClock> r2) {
            Intrinsics.X0O(r2, "clocks");
            BleHandleCallback.access$onReadWorldClock$jd(r1, r2);
        }

        @Deprecated
        public static void onRealTimeMeasurement(@aa1 BleHandleCallback r1, @aa1 BleRealTimeMeasurement r2) {
            Intrinsics.X0O(r2, "realTimeMeasurement");
            BleHandleCallback.access$onRealTimeMeasurement$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveCmTrace(@aa1 BleHandleCallback r1, @aa1 byte[] r2, boolean r3) {
            Intrinsics.X0O(r2, "data");
            BleHandleCallback.access$onReceiveCmTrace$jd(r1, r2, r3);
        }

        @Deprecated
        public static void onReceiveFilePacket(@aa1 BleHandleCallback r1, @aa1 BleReceiveFilePacket r2) {
            Intrinsics.X0O(r2, "filePacket");
            BleHandleCallback.access$onReceiveFilePacket$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveGSensorMotion(@aa1 BleHandleCallback r1, @aa1 List<BleGSensorMotion> r2) {
            Intrinsics.X0O(r2, "gSensorMotions");
            BleHandleCallback.access$onReceiveGSensorMotion$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveGSensorRaw(@aa1 BleHandleCallback r1, @aa1 List<BleGSensorRaw> r2) {
            Intrinsics.X0O(r2, "gSensorRaws");
            BleHandleCallback.access$onReceiveGSensorRaw$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveGSensorSHSY(@aa1 BleHandleCallback r1, @aa1 List<BleGSensorSHSY> r2) {
            Intrinsics.X0O(r2, "gSensorSHSYs");
            BleHandleCallback.access$onReceiveGSensorSHSY$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveHRRaw(@aa1 BleHandleCallback r1, @aa1 List<BleHRRaw> r2) {
            Intrinsics.X0O(r2, "hrRaw");
            BleHandleCallback.access$onReceiveHRRaw$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveLocationGga(@aa1 BleHandleCallback r1, @aa1 BleLocationGga r2) {
            Intrinsics.X0O(r2, "locationGga");
            BleHandleCallback.access$onReceiveLocationGga$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveLocationGsv(@aa1 BleHandleCallback r1, @aa1 List<BleLocationGsv> r2) {
            Intrinsics.X0O(r2, "locationGsv");
            BleHandleCallback.access$onReceiveLocationGsv$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveMusicCommand(@aa1 BleHandleCallback r1, @aa1 MusicCommand r2) {
            Intrinsics.X0O(r2, "musicCommand");
            BleHandleCallback.access$onReceiveMusicCommand$jd(r1, r2);
        }

        @Deprecated
        public static void onReceivePpgSHSY(@aa1 BleHandleCallback r1, @aa1 List<BlePpgSHSY> r2) {
            Intrinsics.X0O(r2, "ppgSHSYs");
            BleHandleCallback.access$onReceivePpgSHSY$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveRealtimeLog(@aa1 BleHandleCallback r1, @aa1 BleRealtimeLog r2) {
            Intrinsics.X0O(r2, "realtimeLog");
            BleHandleCallback.access$onReceiveRealtimeLog$jd(r1, r2);
        }

        @Deprecated
        public static void onReceiveRecordPacket(@aa1 BleHandleCallback r1, @aa1 BleRecordPacket r2) {
            Intrinsics.X0O(r2, "recordPacket");
            BleHandleCallback.access$onReceiveRecordPacket$jd(r1, r2);
        }

        @Deprecated
        public static void onRecordControlUpdate(@aa1 BleHandleCallback r1, @aa1 BleRecordControl r2) {
            Intrinsics.X0O(r2, "control");
            BleHandleCallback.access$onRecordControlUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onRequestAgpsPrerequisite(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onRequestAgpsPrerequisite$jd(r0);
        }

        @Deprecated
        public static void onRequestLocation(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onRequestLocation$jd(r0, r1);
        }

        @Deprecated
        public static void onRingVibrationSetUpdate(@aa1 BleHandleCallback r1, @aa1 BleRingVibrationSettings r2) {
            Intrinsics.X0O(r2, "ringVibrationSettings");
            BleHandleCallback.access$onRingVibrationSetUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSDCardInfoUpdate(@aa1 BleHandleCallback r1, @aa1 BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            BleHandleCallback.access$onSDCardInfoUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSGTestUpdate(@aa1 BleHandleCallback r1, @aa1 BleSGTest r2) {
            Intrinsics.X0O(r2, "test");
            BleHandleCallback.access$onSGTestUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSGTtsUpdate(@aa1 BleHandleCallback r1, @aa1 BleSGTts r2) {
            Intrinsics.X0O(r2, "tts");
            BleHandleCallback.access$onSGTtsUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSOSSettingsUpdate(@aa1 BleHandleCallback r1, @aa1 BleSOSSettings r2) {
            Intrinsics.X0O(r2, "sosSettings");
            BleHandleCallback.access$onSOSSettingsUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onScreenBrightnessSetUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onScreenBrightnessSetUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onSessionStateChange(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onSessionStateChange$jd(r0, r1);
        }

        @Deprecated
        public static void onSleepNotifyUpdate(@aa1 BleHandleCallback r1, @aa1 BleSleepNotify r2) {
            Intrinsics.X0O(r2, "sleepNotify");
            BleHandleCallback.access$onSleepNotifyUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSosContactUpdate(@aa1 BleHandleCallback r1, @aa1 BleSosContact r2) {
            Intrinsics.X0O(r2, "sosContact");
            BleHandleCallback.access$onSosContactUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onSportEndNotifyUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onSportEndNotifyUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onStandbyWatchFaceSetUpdate(@aa1 BleHandleCallback r1, @aa1 BleStandbyWatchFaceSet r2) {
            Intrinsics.X0O(r2, "standbyWatchFaceSet");
            BleHandleCallback.access$onStandbyWatchFaceSetUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onStepGoalUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onStepGoalUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onStockDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onStockDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onStreamProgress(@aa1 BleHandleCallback r1, boolean r2, int r3, int r4, int r5, @aa1 BleKey r6) {
            Intrinsics.X0O(r6, "bleKey");
            BleHandleCallback.access$onStreamProgress$jd(r1, r2, r3, r4, r5, r6);
        }

        public static /* synthetic */ void onStreamProgress$default(BleHandleCallback r0, boolean r1, int r2, int r3, int r4, BleKey r5, int r6, Object r7) {
            BleHandleCallback.onStreamProgress$default(r0, r1, r2, r3, r4, r5, r6, r7);
        }

        @Deprecated
        public static void onSyncData(@aa1 BleHandleCallback r1, int r2, @aa1 BleKey r3) {
            Intrinsics.X0O(r3, "bleKey");
            BleHandleCallback.access$onSyncData$jd(r1, r2, r3);
        }

        @Deprecated
        public static void onTimeUpdate(@aa1 BleHandleCallback r0) {
            BleHandleCallback.access$onTimeUpdate$jd(r0);
        }

        @Deprecated
        public static void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleHandleCallback r1, @aa1 BleAICoachBeforePlanV2 r2) {
            Intrinsics.X0O(r2, "info");
            BleHandleCallback.access$onUpdateAICoachGenerateBeforeInfoV2$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateAICoachLeaveDay(@aa1 BleHandleCallback r1, @aa1 BleLeaveDay r2) {
            Intrinsics.X0O(r2, "plan");
            BleHandleCallback.access$onUpdateAICoachLeaveDay$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateAppSportState(@aa1 BleHandleCallback r1, @aa1 BleAppSportState r2) {
            Intrinsics.X0O(r2, "appSportState");
            BleHandleCallback.access$onUpdateAppSportState$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateBAC(@aa1 BleHandleCallback r1, @aa1 BleBAC r2) {
            Intrinsics.X0O(r2, "bac");
            BleHandleCallback.access$onUpdateBAC$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateBloodPressure(@aa1 BleHandleCallback r1, @aa1 BleBloodPressure r2) {
            Intrinsics.X0O(r2, "bloodPressure");
            BleHandleCallback.access$onUpdateBloodPressure$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateHeartRate(@aa1 BleHandleCallback r1, @aa1 BleHeartRate r2) {
            Intrinsics.X0O(r2, "heartRate");
            BleHandleCallback.access$onUpdateHeartRate$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateTemperature(@aa1 BleHandleCallback r1, @aa1 BleTemperature r2) {
            Intrinsics.X0O(r2, "temperature");
            BleHandleCallback.access$onUpdateTemperature$jd(r1, r2);
        }

        @Deprecated
        public static void onUpdateWatchFaceSwitch(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onUpdateWatchFaceSwitch$jd(r0, r1);
        }

        @Deprecated
        public static void onUserProfileUpdate(@aa1 BleHandleCallback r1, @aa1 BleUserProfile r2) {
            Intrinsics.X0O(r2, Scopes.PROFILE);
            BleHandleCallback.access$onUserProfileUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onVibrationUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onVibrationUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onVibrationUpdateV2(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onVibrationUpdateV2$jd(r0, r1);
        }

        @Deprecated
        public static void onWatchFaceIdUpdate(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onWatchFaceIdUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onWatchFaceIndexCreate(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onWatchFaceIndexCreate$jd(r0, r1);
        }

        @Deprecated
        public static void onWatchFaceIndexUpdate(@aa1 BleHandleCallback r1, @aa1 BleWatchFaceIndex r2) {
            Intrinsics.X0O(r2, "watchfaceIndex");
            BleHandleCallback.access$onWatchFaceIndexUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onWatchPasswordUpdate(@aa1 BleHandleCallback r1, @aa1 BleSettingWatchPassword r2) {
            Intrinsics.X0O(r2, "watchPassword");
            BleHandleCallback.access$onWatchPasswordUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onWearWayUpdate(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onWearWayUpdate$jd(r0, r1);
        }

        @Deprecated
        public static void onWorldClockDelete(@aa1 BleHandleCallback r0, int r1) {
            BleHandleCallback.access$onWorldClockDelete$jd(r0, r1);
        }

        @Deprecated
        public static void onXMLYBandSetUpdate(@aa1 BleHandleCallback r1, @aa1 BleXMLYBandSet r2) {
            Intrinsics.X0O(r2, "data");
            BleHandleCallback.access$onXMLYBandSetUpdate$jd(r1, r2);
        }

        @Deprecated
        public static void onXModem(@aa1 BleHandleCallback r0, byte r1) {
            BleHandleCallback.access$onXModem$jd(r0, r1);
        }

        @Deprecated
        public static void onReadStock(@aa1 BleHandleCallback r0, boolean r1) {
            BleHandleCallback.access$onReadStock$jd(r0, r1);
        }
    }

    static /* synthetic */ void access$onAICoachGeneratePlanUpdate$jd(BleHandleCallback r0, int r1) {
        super.onAICoachGeneratePlanUpdate(r1);
    }

    static /* synthetic */ void access$onAICommandUpdate$jd(BleHandleCallback r0, BleAICommand r1) {
        super.onAICommandUpdate(r1);
    }

    static /* synthetic */ void access$onActivityRecognitionUpdate$jd(BleHandleCallback r0, int r1) {
        super.onActivityRecognitionUpdate(r1);
    }

    static /* synthetic */ void access$onAlarmAdd$jd(BleHandleCallback r0, BleAlarm r1) {
        super.onAlarmAdd(r1);
    }

    static /* synthetic */ void access$onAlarmDelete$jd(BleHandleCallback r0, int r1) {
        super.onAlarmDelete(r1);
    }

    static /* synthetic */ void access$onAlarmUpdate$jd(BleHandleCallback r0, BleAlarm r1) {
        super.onAlarmUpdate(r1);
    }

    static /* synthetic */ void access$onAppOpUpdate$jd(BleHandleCallback r0, BleAppOp r1) {
        super.onAppOpUpdate(r1);
    }

    static /* synthetic */ void access$onAppSportDataResponse$jd(BleHandleCallback r0, boolean r1) {
        super.onAppSportDataResponse(r1);
    }

    static /* synthetic */ void access$onBWNaviInfoUpdate$jd(BleHandleCallback r0, BleBWNaviInfo r1) {
        super.onBWNaviInfoUpdate(r1);
    }

    static /* synthetic */ void access$onBacklightUpdate$jd(BleHandleCallback r0, int r1) {
        super.onBacklightUpdate(r1);
    }

    static /* synthetic */ void access$onBandKeyUpdate$jd(BleHandleCallback r0, BleBandKey r1) {
        super.onBandKeyUpdate(r1);
    }

    static /* synthetic */ void access$onBleGolfScore$jd(BleHandleCallback r0, BleGolfScore r1) {
        super.onBleGolfScore(r1);
    }

    static /* synthetic */ void access$onBleThirdPartyDataUpdate$jd(BleHandleCallback r0, BleThirdPartyData r1) {
        super.onBleThirdPartyDataUpdate(r1);
    }

    static /* synthetic */ void access$onBleVideoCallInfo$jd(BleHandleCallback r0, BleVideoCallInfo r1) {
        super.onBleVideoCallInfo(r1);
    }

    static /* synthetic */ void access$onCPChatUpdate$jd(BleHandleCallback r0, BleCPChat r1) {
        super.onCPChatUpdate(r1);
    }

    static /* synthetic */ void access$onCPGiftsInfoUpdate$jd(BleHandleCallback r0, BleCPGiftsInfo r1) {
        super.onCPGiftsInfoUpdate(r1);
    }

    static /* synthetic */ void access$onCPListenerUpdate$jd(BleHandleCallback r0, BleCPListener r1) {
        super.onCPListenerUpdate(r1);
    }

    static /* synthetic */ void access$onCPMissYouUpdate$jd(BleHandleCallback r0, BleCPMissYou r1) {
        super.onCPMissYouUpdate(r1);
    }

    static /* synthetic */ void access$onCPTodoUpdate$jd(BleHandleCallback r0, BleCPTodo r1) {
        super.onCPTodoUpdate(r1);
    }

    static /* synthetic */ void access$onCaloriesGoalUpdate$jd(BleHandleCallback r0, int r1) {
        super.onCaloriesGoalUpdate(r1);
    }

    static /* synthetic */ void access$onCameraResponse$jd(BleHandleCallback r0, boolean r1, int r2) {
        super.onCameraResponse(r1, r2);
    }

    static /* synthetic */ void access$onCameraStateChange$jd(BleHandleCallback r0, int r1) {
        super.onCameraStateChange(r1);
    }

    static /* synthetic */ void access$onChatAppUpdate$jd(BleHandleCallback r0, BleChatApp r1) {
        super.onChatAppUpdate(r1);
    }

    static /* synthetic */ void access$onChatMessageUpdate$jd(BleHandleCallback r0, BleChatMessage r1) {
        super.onChatMessageUpdate(r1);
    }

    static /* synthetic */ void access$onChatVoiceUpdate$jd(BleHandleCallback r0, BleChatVoice r1) {
        super.onChatVoiceUpdate(r1);
    }

    static /* synthetic */ void access$onCheckInEveryDayUpdate$jd(BleHandleCallback r0, BleCheckInEveryDay r1) {
        super.onCheckInEveryDayUpdate(r1);
    }

    static /* synthetic */ void access$onClassicBluetoothStateChange$jd(BleHandleCallback r0, int r1) {
        super.onClassicBluetoothStateChange(r1);
    }

    static /* synthetic */ void access$onCommandReply$jd(BleHandleCallback r0, BleKey r1, BleKeyFlag r2, boolean r3) {
        super.onCommandReply(r1, r2, r3);
    }

    static /* synthetic */ void access$onCommandSendTimeout$jd(BleHandleCallback r0, BleKey r1, BleKeyFlag r2) {
        super.onCommandSendTimeout(r1, r2);
    }

    static /* synthetic */ void access$onContactUsStateChange$jd(BleHandleCallback r0, int r1) {
        super.onContactUsStateChange(r1);
    }

    static /* synthetic */ void access$onDeleteAICoachPlan$jd(BleHandleCallback r0) {
        super.onDeleteAICoachPlan();
    }

    static /* synthetic */ void access$onDeleteFileResponse$jd(BleHandleCallback r0, int r1) {
        super.onDeleteFileResponse(r1);
    }

    static /* synthetic */ void access$onDeviceConnected$jd(BleHandleCallback r0, BluetoothDevice r1) {
        super.onDeviceConnected(r1);
    }

    static /* synthetic */ void access$onDeviceConnecting$jd(BleHandleCallback r0, boolean r1) {
        super.onDeviceConnecting(r1);
    }

    static /* synthetic */ void access$onDeviceFileUpdate$jd(BleHandleCallback r0, BleDeviceFile r1) {
        super.onDeviceFileUpdate(r1);
    }

    static /* synthetic */ void access$onDeviceOpUpdate$jd(BleHandleCallback r0, int r1) {
        super.onDeviceOpUpdate(r1);
    }

    static /* synthetic */ void access$onDeviceRequestAGpsFile$jd(BleHandleCallback r0, String r1) {
        super.onDeviceRequestAGpsFile(r1);
    }

    static /* synthetic */ void access$onDeviceSMSQuickReply$jd(BleHandleCallback r0, BleSMSQuickReply r1) {
        super.onDeviceSMSQuickReply(r1);
    }

    static /* synthetic */ void access$onDeviceSportDataUpdate$jd(BleHandleCallback r0, BleDeviceSportData r1) {
        super.onDeviceSportDataUpdate(r1);
    }

    static /* synthetic */ void access$onDistanceGoalUpdate$jd(BleHandleCallback r0, int r1) {
        super.onDistanceGoalUpdate(r1);
    }

    static /* synthetic */ void access$onDoubleScreenSettingsUpdate$jd(BleHandleCallback r0, BleDoubleScreenSettings r1) {
        super.onDoubleScreenSettingsUpdate(r1);
    }

    static /* synthetic */ void access$onDrinkWaterUpdate$jd(BleHandleCallback r0, BleDrinkWaterSettings r1) {
        super.onDrinkWaterUpdate(r1);
    }

    static /* synthetic */ void access$onEarphoneAncSettingsUpdate$jd(BleHandleCallback r0, BleEarphoneAncSettings r1) {
        super.onEarphoneAncSettingsUpdate(r1);
    }

    static /* synthetic */ void access$onEarphoneCallUpdate$jd(BleHandleCallback r0, int r1) {
        super.onEarphoneCallUpdate(r1);
    }

    static /* synthetic */ void access$onEarphoneKeyUpdate$jd(BleHandleCallback r0, BleEarphoneKey r1) {
        super.onEarphoneKeyUpdate(r1);
    }

    static /* synthetic */ void access$onEarphoneSoundEffectsSettingsUpdate$jd(BleHandleCallback r0, BleEarphoneSoundEffectsSettings r1) {
        super.onEarphoneSoundEffectsSettingsUpdate(r1);
    }

    static /* synthetic */ void access$onEarphoneStateUpdate$jd(BleHandleCallback r0, BleEarphoneState r1) {
        super.onEarphoneStateUpdate(r1);
    }

    static /* synthetic */ void access$onFactoryTestUpdate$jd(BleHandleCallback r0, BleFactoryTest r1) {
        super.onFactoryTestUpdate(r1);
    }

    static /* synthetic */ void access$onFallSetUpdate$jd(BleHandleCallback r0, int r1) {
        super.onFallSetUpdate(r1);
    }

    static /* synthetic */ void access$onFindEarphoneUpdate$jd(BleHandleCallback r0, BleFindEarphone r1) {
        super.onFindEarphoneUpdate(r1);
    }

    static /* synthetic */ void access$onFindPhone$jd(BleHandleCallback r0, boolean r1) {
        super.onFindPhone(r1);
    }

    static /* synthetic */ void access$onFindWatchUpdate$jd(BleHandleCallback r0, int r1) {
        super.onFindWatchUpdate(r1);
    }

    static /* synthetic */ void access$onFollowSystemDateFormat$jd(BleHandleCallback r0) {
        super.onFollowSystemDateFormat();
    }

    static /* synthetic */ void access$onFollowSystemHour$jd(BleHandleCallback r0) {
        super.onFollowSystemHour();
    }

    static /* synthetic */ void access$onFollowSystemLanguage$jd(BleHandleCallback r0, boolean r1) {
        super.onFollowSystemLanguage(r1);
    }

    static /* synthetic */ void access$onGameControlUpdate$jd(BleHandleCallback r0, BleGameControl r1) {
        super.onGameControlUpdate(r1);
    }

    static /* synthetic */ void access$onGestureWake2Update$jd(BleHandleCallback r0, BleGestureWake2 r1) {
        super.onGestureWake2Update(r1);
    }

    static /* synthetic */ void access$onGestureWakeUpdate$jd(BleHandleCallback r0, BleGestureWake r1) {
        super.onGestureWakeUpdate(r1);
    }

    static /* synthetic */ void access$onGoogleNaviInfoUpdate$jd(BleHandleCallback r0, BleGoogleNaviInfo r1) {
        super.onGoogleNaviInfoUpdate(r1);
    }

    static /* synthetic */ void access$onHIDState$jd(BleHandleCallback r0, int r1) {
        super.onHIDState(r1);
    }

    static /* synthetic */ void access$onHIDValueChange$jd(BleHandleCallback r0, int r1) {
        super.onHIDValueChange(r1);
    }

    static /* synthetic */ void access$onHRWarningSet$jd(BleHandleCallback r0, BleHrWarningSettings r1) {
        super.onHRWarningSet(r1);
    }

    static /* synthetic */ void access$onHanBaoVibrationStateChange$jd(BleHandleCallback r0, int r1) {
        super.onHanBaoVibrationStateChange(r1);
    }

    static /* synthetic */ void access$onHighAntiAssistChange$jd(BleHandleCallback r0, int r1) {
        super.onHighAntiAssistChange(r1);
    }

    static /* synthetic */ void access$onHourSystemUpdate$jd(BleHandleCallback r0, int r1) {
        super.onHourSystemUpdate(r1);
    }

    static /* synthetic */ void access$onHydrationUpdate$jd(BleHandleCallback r0, BleHydrationSettings r1) {
        super.onHydrationUpdate(r1);
    }

    static /* synthetic */ void access$onIPCExceptionUpdate$jd(BleHandleCallback r0, BleIPCException r1) {
        super.onIPCExceptionUpdate(r1);
    }

    static /* synthetic */ void access$onIPCOTAStateUpdate$jd(BleHandleCallback r0, BleIPCOTAState r1) {
        super.onIPCOTAStateUpdate(r1);
    }

    static /* synthetic */ void access$onIPCStateUpdate$jd(BleHandleCallback r0, BleIPCState r1) {
        super.onIPCStateUpdate(r1);
    }

    static /* synthetic */ void access$onIPCStoresInfoUpdate$jd(BleHandleCallback r0, BleIPCStoresInfo r1) {
        super.onIPCStoresInfoUpdate(r1);
    }

    static /* synthetic */ void access$onIPCWifiInfoUpdate$jd(BleHandleCallback r0, BleIPCWifiInfo r1) {
        super.onIPCWifiInfoUpdate(r1);
    }

    static /* synthetic */ void access$onIdentityCreate$jd(BleHandleCallback r0, boolean r1, BleDeviceInfo r2) {
        super.onIdentityCreate(r1, r2);
    }

    static /* synthetic */ void access$onIdentityDelete$jd(BleHandleCallback r0, boolean r1) {
        super.onIdentityDelete(r1);
    }

    static /* synthetic */ void access$onIdentityDeleteByDevice$jd(BleHandleCallback r0, boolean r1) {
        super.onIdentityDeleteByDevice(r1);
    }

    static /* synthetic */ void access$onIncomingCallRingUpdate$jd(BleHandleCallback r0, int r1) {
        super.onIncomingCallRingUpdate(r1);
    }

    static /* synthetic */ void access$onIncomingCallStatus$jd(BleHandleCallback r0, int r1) {
        super.onIncomingCallStatus(r1);
    }

    static /* synthetic */ void access$onLoveTapUpdate$jd(BleHandleCallback r0, BleLoveTap r1) {
        super.onLoveTapUpdate(r1);
    }

    static /* synthetic */ void access$onLoveTapUserDelete$jd(BleHandleCallback r0, int r1) {
        super.onLoveTapUserDelete(r1);
    }

    static /* synthetic */ void access$onLoveTapUserUpdate$jd(BleHandleCallback r0, BleLoveTapUser r1) {
        super.onLoveTapUserUpdate(r1);
    }

    static /* synthetic */ void access$onMeasurementUpdate$jd(BleHandleCallback r0, BleMeasurement r1) {
        super.onMeasurementUpdate(r1);
    }

    static /* synthetic */ void access$onMedicationAlarmAdd$jd(BleHandleCallback r0, BleMedicationAlarm r1) {
        super.onMedicationAlarmAdd(r1);
    }

    static /* synthetic */ void access$onMedicationAlarmDelete$jd(BleHandleCallback r0, int r1) {
        super.onMedicationAlarmDelete(r1);
    }

    static /* synthetic */ void access$onMedicationAlarmUpdate$jd(BleHandleCallback r0, BleMedicationAlarm r1) {
        super.onMedicationAlarmUpdate(r1);
    }

    static /* synthetic */ void access$onMedicationReminderDelete$jd(BleHandleCallback r0, int r1) {
        super.onMedicationReminderDelete(r1);
    }

    static /* synthetic */ void access$onMedicationReminderUpdate$jd(BleHandleCallback r0, BleMedicationReminder r1) {
        super.onMedicationReminderUpdate(r1);
    }

    static /* synthetic */ void access$onMeetingReminderAdd$jd(BleHandleCallback r0, BleMeetingReminder r1) {
        super.onMeetingReminderAdd(r1);
    }

    static /* synthetic */ void access$onMeetingReminderDelete$jd(BleHandleCallback r0, int r1) {
        super.onMeetingReminderDelete(r1);
    }

    static /* synthetic */ void access$onMeetingReminderUpdate$jd(BleHandleCallback r0, BleMeetingReminder r1) {
        super.onMeetingReminderUpdate(r1);
    }

    static /* synthetic */ void access$onMultiFileTransferReadFile$jd(BleHandleCallback r0, int r1) {
        super.onMultiFileTransferReadFile(r1);
    }

    static /* synthetic */ void access$onMultiFileTransferResponse$jd(BleHandleCallback r0, int r1) {
        super.onMultiFileTransferResponse(r1);
    }

    static /* synthetic */ void access$onNaviInfoUpdate$jd(BleHandleCallback r0, BleNaviInfo r1) {
        super.onNaviInfoUpdate(r1);
    }

    static /* synthetic */ void access$onNoDisturbUpdate$jd(BleHandleCallback r0, BleNoDisturbSettings r1) {
        super.onNoDisturbUpdate(r1);
    }

    static /* synthetic */ void access$onNotificationLightScreenSetUpdate$jd(BleHandleCallback r0, int r1) {
        super.onNotificationLightScreenSetUpdate(r1);
    }

    static /* synthetic */ void access$onNotificationSettings2Update$jd(BleHandleCallback r0, BleNotificationSettings2 r1) {
        super.onNotificationSettings2Update(r1);
    }

    static /* synthetic */ void access$onOTA$jd(BleHandleCallback r0, boolean r1) {
        super.onOTA(r1);
    }

    static /* synthetic */ void access$onPowerSaveModeState$jd(BleHandleCallback r0, int r1) {
        super.onPowerSaveModeState(r1);
    }

    static /* synthetic */ void access$onPowerSaveModeStateChange$jd(BleHandleCallback r0, int r1) {
        super.onPowerSaveModeStateChange(r1);
    }

    static /* synthetic */ void access$onQiblaSettingsUpdate$jd(BleHandleCallback r0) {
        super.onQiblaSettingsUpdate();
    }

    static /* synthetic */ void access$onReadAICoachGenerateBeforeInfo$jd(BleHandleCallback r0, BleAICoachBeforePlan r1) {
        super.onReadAICoachGenerateBeforeInfo(r1);
    }

    static /* synthetic */ void access$onReadAICoachGenerateBeforeInfoV2$jd(BleHandleCallback r0, BleAICoachBeforePlanV2 r1) {
        super.onReadAICoachGenerateBeforeInfoV2(r1);
    }

    static /* synthetic */ void access$onReadAICoachPlan$jd(BleHandleCallback r0, BleAICoachGeneratePlan r1) {
        super.onReadAICoachPlan(r1);
    }

    static /* synthetic */ void access$onReadAICoachPlanV2$jd(BleHandleCallback r0, BleAICoachGeneratePlanV2 r1) {
        super.onReadAICoachPlanV2(r1);
    }

    static /* synthetic */ void access$onReadActivity$jd(BleHandleCallback r0, List r1) {
        super.onReadActivity(r1);
    }

    static /* synthetic */ void access$onReadActivityDetail$jd(BleHandleCallback r0, BleActivityDetail r1) {
        super.onReadActivityDetail(r1);
    }

    static /* synthetic */ void access$onReadAddressBook$jd(BleHandleCallback r0, BleAddressBook r1) {
        super.onReadAddressBook(r1);
    }

    static /* synthetic */ void access$onReadAlarm$jd(BleHandleCallback r0, List r1) {
        super.onReadAlarm(r1);
    }

    static /* synthetic */ void access$onReadAlipayBindInfo$jd(BleHandleCallback r0, List r1) {
        super.onReadAlipayBindInfo(r1);
    }

    static /* synthetic */ void access$onReadAlipaySettings$jd(BleHandleCallback r0, BleAlipaySettings r1) {
        super.onReadAlipaySettings(r1);
    }

    static /* synthetic */ void access$onReadAppApiVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadAppApiVersion(r1);
    }

    static /* synthetic */ void access$onReadAppInfoList$jd(BleHandleCallback r0, BleAppInfoList r1) {
        super.onReadAppInfoList(r1);
    }

    static /* synthetic */ void access$onReadAppSportState$jd(BleHandleCallback r0, BleAppSportState r1) {
        super.onReadAppSportState(r1);
    }

    static /* synthetic */ void access$onReadAvgHeartRate$jd(BleHandleCallback r0, List r1) {
        super.onReadAvgHeartRate(r1);
    }

    static /* synthetic */ void access$onReadBAC$jd(BleHandleCallback r0, List r1) {
        super.onReadBAC(r1);
    }

    static /* synthetic */ void access$onReadBacCalibration$jd(BleHandleCallback r0, BleBacCalibration r1, BleKeyFlag r2) {
        super.onReadBacCalibration(r1, r2);
    }

    static /* synthetic */ void access$onReadBacklight$jd(BleHandleCallback r0, int r1) {
        super.onReadBacklight(r1);
    }

    static /* synthetic */ void access$onReadBatteryUsage$jd(BleHandleCallback r0, BleBatteryUsage r1) {
        super.onReadBatteryUsage(r1);
    }

    static /* synthetic */ void access$onReadBleAddress$jd(BleHandleCallback r0, String r1) {
        super.onReadBleAddress(r1);
    }

    static /* synthetic */ void access$onReadBleGolfMapCacheInfo$jd(BleHandleCallback r0, BleGolfMapCacheInfo r1) {
        super.onReadBleGolfMapCacheInfo(r1);
    }

    static /* synthetic */ void access$onReadBleGolfSportSwitch$jd(BleHandleCallback r0, BleGolfSportSwitch r1) {
        super.onReadBleGolfSportSwitch(r1);
    }

    static /* synthetic */ void access$onReadBleGolfWatchMapInfo$jd(BleHandleCallback r0, BleGolfWatchMapInfo r1) {
        super.onReadBleGolfWatchMapInfo(r1);
    }

    static /* synthetic */ void access$onReadBleGolfWatchVersionInfo$jd(BleHandleCallback r0, BleGolfWatchVersionInfo r1) {
        super.onReadBleGolfWatchVersionInfo(r1);
    }

    static /* synthetic */ void access$onReadBleHrv$jd(BleHandleCallback r0, List r1) {
        super.onReadBleHrv(r1);
    }

    static /* synthetic */ void access$onReadBleLogText$jd(BleHandleCallback r0, List r1) {
        super.onReadBleLogText(r1);
    }

    static /* synthetic */ void access$onReadBloodGlucose$jd(BleHandleCallback r0, List r1) {
        super.onReadBloodGlucose(r1);
    }

    static /* synthetic */ void access$onReadBloodOxyGenSettings$jd(BleHandleCallback r0, BleBloodOxyGenSettings r1) {
        super.onReadBloodOxyGenSettings(r1);
    }

    static /* synthetic */ void access$onReadBloodOxygen$jd(BleHandleCallback r0, List r1) {
        super.onReadBloodOxygen(r1);
    }

    static /* synthetic */ void access$onReadBloodPressure$jd(BleHandleCallback r0, List r1) {
        super.onReadBloodPressure(r1);
    }

    static /* synthetic */ void access$onReadBloodPressureCalibration$jd(BleHandleCallback r0, BleBloodPressureCalibration r1) {
        super.onReadBloodPressureCalibration(r1);
    }

    static /* synthetic */ void access$onReadBodyStatus$jd(BleHandleCallback r0, List r1) {
        super.onReadBodyStatus(r1);
    }

    static /* synthetic */ void access$onReadCPUserInfo$jd(BleHandleCallback r0, BleCPUserInfo r1) {
        super.onReadCPUserInfo(r1);
    }

    static /* synthetic */ void access$onReadCalibrationData$jd(BleHandleCallback r0, BleCalibrationData r1) {
        super.onReadCalibrationData(r1);
    }

    static /* synthetic */ void access$onReadCalorieIntake$jd(BleHandleCallback r0, List r1) {
        super.onReadCalorieIntake(r1);
    }

    static /* synthetic */ void access$onReadCaloriesGoal$jd(BleHandleCallback r0, int r1) {
        super.onReadCaloriesGoal(r1);
    }

    static /* synthetic */ void access$onReadChatApp$jd(BleHandleCallback r0, BleChatApp r1) {
        super.onReadChatApp(r1);
    }

    static /* synthetic */ void access$onReadCheckInEveryDay$jd(BleHandleCallback r0, BleCheckInEveryDay r1) {
        super.onReadCheckInEveryDay(r1);
    }

    static /* synthetic */ void access$onReadClassicBluetoothState$jd(BleHandleCallback r0, int r1) {
        super.onReadClassicBluetoothState(r1);
    }

    static /* synthetic */ void access$onReadCoachingIds$jd(BleHandleCallback r0, BleCoachingIds r1) {
        super.onReadCoachingIds(r1);
    }

    static /* synthetic */ void access$onReadCyWeeAlgorithm$jd(BleHandleCallback r0, BleCyWeeAlgorithm r1) {
        super.onReadCyWeeAlgorithm(r1);
    }

    static /* synthetic */ void access$onReadDailyPower$jd(BleHandleCallback r0, List r1) {
        super.onReadDailyPower(r1);
    }

    static /* synthetic */ void access$onReadDateFormat$jd(BleHandleCallback r0, int r1) {
        super.onReadDateFormat(r1);
    }

    static /* synthetic */ void access$onReadDeviceFile$jd(BleHandleCallback r0, BleDeviceFile r1) {
        super.onReadDeviceFile(r1);
    }

    static /* synthetic */ void access$onReadDeviceFileV2$jd(BleHandleCallback r0, BleDeviceFile2 r1) {
        super.onReadDeviceFileV2(r1);
    }

    static /* synthetic */ void access$onReadDeviceInfo$jd(BleHandleCallback r0, BleDeviceInfo r1) {
        super.onReadDeviceInfo(r1);
    }

    static /* synthetic */ void access$onReadDeviceInfo2$jd(BleHandleCallback r0, BleDeviceInfo2 r1) {
        super.onReadDeviceInfo2(r1);
    }

    static /* synthetic */ void access$onReadDeviceLanguages$jd(BleHandleCallback r0, BleDeviceLanguages r1) {
        super.onReadDeviceLanguages(r1);
    }

    static /* synthetic */ void access$onReadDeviceLanguages2$jd(BleHandleCallback r0, BleDeviceLanguages2 r1) {
        super.onReadDeviceLanguages2(r1);
    }

    static /* synthetic */ void access$onReadDeviceUniqueDataSettings$jd(BleHandleCallback r0, BleDeviceUniqueDataSettings r1) {
        super.onReadDeviceUniqueDataSettings(r1);
    }

    static /* synthetic */ void access$onReadDistanceGoal$jd(BleHandleCallback r0, int r1) {
        super.onReadDistanceGoal(r1);
    }

    static /* synthetic */ void access$onReadDoubleScreenSettings$jd(BleHandleCallback r0, BleDoubleScreenSettings r1) {
        super.onReadDoubleScreenSettings(r1);
    }

    static /* synthetic */ void access$onReadDrinkWater$jd(BleHandleCallback r0, BleDrinkWaterSettings r1) {
        super.onReadDrinkWater(r1);
    }

    static /* synthetic */ void access$onReadECGRealtime$jd(BleHandleCallback r0, BleECGRealtime r1) {
        super.onReadECGRealtime(r1);
    }

    static /* synthetic */ void access$onReadEarphoneAncSettings$jd(BleHandleCallback r0, BleEarphoneAncSettings r1) {
        super.onReadEarphoneAncSettings(r1);
    }

    static /* synthetic */ void access$onReadEarphoneCall$jd(BleHandleCallback r0, int r1) {
        super.onReadEarphoneCall(r1);
    }

    static /* synthetic */ void access$onReadEarphoneInfo$jd(BleHandleCallback r0, BleEarphoneInfo r1) {
        super.onReadEarphoneInfo(r1);
    }

    static /* synthetic */ void access$onReadEarphoneKey$jd(BleHandleCallback r0, BleEarphoneKey r1) {
        super.onReadEarphoneKey(r1);
    }

    static /* synthetic */ void access$onReadEarphonePower$jd(BleHandleCallback r0, BleEarphonePower r1) {
        super.onReadEarphonePower(r1);
    }

    static /* synthetic */ void access$onReadEarphoneSoundEffectsSettings$jd(BleHandleCallback r0, BleEarphoneSoundEffectsSettings r1) {
        super.onReadEarphoneSoundEffectsSettings(r1);
    }

    static /* synthetic */ void access$onReadEarphoneState$jd(BleHandleCallback r0, BleEarphoneState r1) {
        super.onReadEarphoneState(r1);
    }

    static /* synthetic */ void access$onReadEcg$jd(BleHandleCallback r0, List r1) {
        super.onReadEcg(r1);
    }

    static /* synthetic */ void access$onReadEcgSettings$jd(BleHandleCallback r0, BleEcgSettings r1) {
        super.onReadEcgSettings(r1);
    }

    static /* synthetic */ void access$onReadEnergyRating$jd(BleHandleCallback r0, List r1) {
        super.onReadEnergyRating(r1);
    }

    static /* synthetic */ void access$onReadFallSet$jd(BleHandleCallback r0, int r1) {
        super.onReadFallSet(r1);
    }

    static /* synthetic */ void access$onReadFilePath$jd(BleHandleCallback r0, BleAppAudioBookList r1) {
        super.onReadFilePath(r1);
    }

    static /* synthetic */ void access$onReadFirmwareVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadFirmwareVersion(r1);
    }

    static /* synthetic */ void access$onReadFoodBalance$jd(BleHandleCallback r0, List r1) {
        super.onReadFoodBalance(r1);
    }

    static /* synthetic */ void access$onReadGestureWake$jd(BleHandleCallback r0, BleGestureWake r1) {
        super.onReadGestureWake(r1);
    }

    static /* synthetic */ void access$onReadGestureWake2$jd(BleHandleCallback r0, BleGestureWake2 r1) {
        super.onReadGestureWake2(r1);
    }

    static /* synthetic */ void access$onReadGirlCareMonthly$jd(BleHandleCallback r0, BleGirlCareMonthly r1) {
        super.onReadGirlCareMonthly(r1);
    }

    static /* synthetic */ void access$onReadGirlCareSettings$jd(BleHandleCallback r0, BleGirlCareSettings r1) {
        super.onReadGirlCareSettings(r1);
    }

    static /* synthetic */ void access$onReadGoMoreSettings$jd(BleHandleCallback r0, BleGoMoreSettings r1) {
        super.onReadGoMoreSettings(r1);
    }

    static /* synthetic */ void access$onReadGolfWatchScore$jd(BleHandleCallback r0, BleGolfWatchScore r1) {
        super.onReadGolfWatchScore(r1);
    }

    static /* synthetic */ void access$onReadGpsFirmwareVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadGpsFirmwareVersion(r1);
    }

    static /* synthetic */ void access$onReadHanBaoSettings$jd(BleHandleCallback r0, BleHanBaoSettings r1) {
        super.onReadHanBaoSettings(r1);
    }

    static /* synthetic */ void access$onReadHanBaoVibration$jd(BleHandleCallback r0, List r1) {
        super.onReadHanBaoVibration(r1);
    }

    static /* synthetic */ void access$onReadHeartRate$jd(BleHandleCallback r0, List r1) {
        super.onReadHeartRate(r1);
    }

    static /* synthetic */ void access$onReadHeartRateZones$jd(BleHandleCallback r0, BleHeartRateZones r1) {
        super.onReadHeartRateZones(r1);
    }

    static /* synthetic */ void access$onReadHourSystem$jd(BleHandleCallback r0, int r1) {
        super.onReadHourSystem(r1);
    }

    static /* synthetic */ void access$onReadHrMonitoringSettings$jd(BleHandleCallback r0, BleHrMonitoringSettings r1) {
        super.onReadHrMonitoringSettings(r1);
    }

    static /* synthetic */ void access$onReadHrMonitoringSettingsV2$jd(BleHandleCallback r0, int r1) {
        super.onReadHrMonitoringSettingsV2(r1);
    }

    static /* synthetic */ void access$onReadHrvBaseLine$jd(BleHandleCallback r0, BleHrvBaseLine r1) {
        super.onReadHrvBaseLine(r1);
    }

    static /* synthetic */ void access$onReadHrvMonitoringSettings$jd(BleHandleCallback r0, BleHrvMonitoringSettings r1) {
        super.onReadHrvMonitoringSettings(r1);
    }

    static /* synthetic */ void access$onReadHydrationSettings$jd(BleHandleCallback r0, BleHydrationSettings r1) {
        super.onReadHydrationSettings(r1);
    }

    static /* synthetic */ void access$onReadIPCInfo$jd(BleHandleCallback r0, BleIPCInfo r1) {
        super.onReadIPCInfo(r1);
    }

    static /* synthetic */ void access$onReadIPCState$jd(BleHandleCallback r0, BleIPCState r1) {
        super.onReadIPCState(r1);
    }

    static /* synthetic */ void access$onReadIPCStoresInfo$jd(BleHandleCallback r0, BleIPCStoresInfo r1) {
        super.onReadIPCStoresInfo(r1);
    }

    static /* synthetic */ void access$onReadIPCVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadIPCVersion(r1);
    }

    static /* synthetic */ void access$onReadIncomingCallRing$jd(BleHandleCallback r0, int r1) {
        super.onReadIncomingCallRing(r1);
    }

    static /* synthetic */ void access$onReadLactateThreshold$jd(BleHandleCallback r0, List r1) {
        super.onReadLactateThreshold(r1);
    }

    static /* synthetic */ void access$onReadLanguage$jd(BleHandleCallback r0, int r1) {
        super.onReadLanguage(r1);
    }

    static /* synthetic */ void access$onReadLanguagePackVersion$jd(BleHandleCallback r0, BleLanguagePackVersion r1) {
        super.onReadLanguagePackVersion(r1);
    }

    static /* synthetic */ void access$onReadLocation$jd(BleHandleCallback r0, List r1) {
        super.onReadLocation(r1);
    }

    static /* synthetic */ void access$onReadLoveTapUser$jd(BleHandleCallback r0, List r1) {
        super.onReadLoveTapUser(r1);
    }

    static /* synthetic */ void access$onReadMatchRecord$jd(BleHandleCallback r0, List r1) {
        super.onReadMatchRecord(r1);
    }

    static /* synthetic */ void access$onReadMatchRecord2$jd(BleHandleCallback r0, List r1) {
        super.onReadMatchRecord2(r1);
    }

    static /* synthetic */ void access$onReadMatchRecord3$jd(BleHandleCallback r0, List r1) {
        super.onReadMatchRecord3(r1);
    }

    static /* synthetic */ void access$onReadMedicationAlarm$jd(BleHandleCallback r0, List r1) {
        super.onReadMedicationAlarm(r1);
    }

    static /* synthetic */ void access$onReadMedicationReminder$jd(BleHandleCallback r0, List r1) {
        super.onReadMedicationReminder(r1);
    }

    static /* synthetic */ void access$onReadMeetingReminder$jd(BleHandleCallback r0, List r1) {
        super.onReadMeetingReminder(r1);
    }

    static /* synthetic */ void access$onReadMindStatus$jd(BleHandleCallback r0, List r1) {
        super.onReadMindStatus(r1);
    }

    static /* synthetic */ void access$onReadMtkOtaMeta$jd(BleHandleCallback r0) {
        super.onReadMtkOtaMeta();
    }

    static /* synthetic */ void access$onReadMultiFileTransfer$jd(BleHandleCallback r0, BleMapFileList r1) {
        super.onReadMultiFileTransfer(r1);
    }

    static /* synthetic */ void access$onReadNetworkFirmwareVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadNetworkFirmwareVersion(r1);
    }

    static /* synthetic */ void access$onReadNoDisturb$jd(BleHandleCallback r0, BleNoDisturbSettings r1) {
        super.onReadNoDisturb(r1);
    }

    static /* synthetic */ void access$onReadNotificationLightScreenSet$jd(BleHandleCallback r0, int r1) {
        super.onReadNotificationLightScreenSet(r1);
    }

    static /* synthetic */ void access$onReadNotificationSettings2$jd(BleHandleCallback r0, BleNotificationSettings2 r1) {
        super.onReadNotificationSettings2(r1);
    }

    static /* synthetic */ void access$onReadOfflineAsrSettings$jd(BleHandleCallback r0, BleOfflineAsrSettings r1) {
        super.onReadOfflineAsrSettings(r1);
    }

    static /* synthetic */ void access$onReadOngoingDialogue$jd(BleHandleCallback r0, int r1) {
        super.onReadOngoingDialogue(r1);
    }

    static /* synthetic */ void access$onReadOptionalMapAuthInfo$jd(BleHandleCallback r0, BleOptionalMapAuthInfo r1) {
        super.onReadOptionalMapAuthInfo(r1);
    }

    static /* synthetic */ void access$onReadPackageStatus$jd(BleHandleCallback r0, BlePackageStatus r1) {
        super.onReadPackageStatus(r1);
    }

    static /* synthetic */ void access$onReadPower$jd(BleHandleCallback r0, int r1) {
        super.onReadPower(r1);
    }

    static /* synthetic */ void access$onReadPower2$jd(BleHandleCallback r0, BlePower2 r1) {
        super.onReadPower2(r1);
    }

    static /* synthetic */ void access$onReadPressure$jd(BleHandleCallback r0, List r1) {
        super.onReadPressure(r1);
    }

    static /* synthetic */ void access$onReadPressureTimingMeasurement$jd(BleHandleCallback r0, BlePressureTimingMeasurement r1) {
        super.onReadPressureTimingMeasurement(r1);
    }

    static /* synthetic */ void access$onReadQiblaSettings$jd(BleHandleCallback r0, BleQiblaSettings r1) {
        super.onReadQiblaSettings(r1);
    }

    static /* synthetic */ void access$onReadRecordControl$jd(BleHandleCallback r0, BleRecordControl r1) {
        super.onReadRecordControl(r1);
    }

    static /* synthetic */ void access$onReadRelaxReminder$jd(BleHandleCallback r0, BleRelaxReminder r1) {
        super.onReadRelaxReminder(r1);
    }

    static /* synthetic */ void access$onReadRespiratoryRate$jd(BleHandleCallback r0, List r1) {
        super.onReadRespiratoryRate(r1);
    }

    static /* synthetic */ void access$onReadRestingHeartRate$jd(BleHandleCallback r0, int r1) {
        super.onReadRestingHeartRate(r1);
    }

    static /* synthetic */ void access$onReadRingVibrationSet$jd(BleHandleCallback r0, BleRingVibrationSettings r1) {
        super.onReadRingVibrationSet(r1);
    }

    static /* synthetic */ void access$onReadRri$jd(BleHandleCallback r0, List r1) {
        super.onReadRri(r1);
    }

    static /* synthetic */ void access$onReadSDCardInfo$jd(BleHandleCallback r0, BleSDCardInfo r1) {
        super.onReadSDCardInfo(r1);
    }

    static /* synthetic */ void access$onReadSGCameraSet$jd(BleHandleCallback r0, BleSGCameraSet r1) {
        super.onReadSGCameraSet(r1);
    }

    static /* synthetic */ void access$onReadSGKeySet$jd(BleHandleCallback r0, BleSGKeySet r1) {
        super.onReadSGKeySet(r1);
    }

    static /* synthetic */ void access$onReadSGKeywordAwake$jd(BleHandleCallback r0, BleSGKeywordAwake r1) {
        super.onReadSGKeywordAwake(r1);
    }

    static /* synthetic */ void access$onReadSGSet$jd(BleHandleCallback r0, BleSGSet r1) {
        super.onReadSGSet(r1);
    }

    static /* synthetic */ void access$onReadSGSleepSet$jd(BleHandleCallback r0, int r1) {
        super.onReadSGSleepSet(r1);
    }

    static /* synthetic */ void access$onReadSOSSettings$jd(BleHandleCallback r0, BleSOSSettings r1) {
        super.onReadSOSSettings(r1);
    }

    static /* synthetic */ void access$onReadScreenBrightnessSet$jd(BleHandleCallback r0, int r1) {
        super.onReadScreenBrightnessSet(r1);
    }

    static /* synthetic */ void access$onReadSedentariness$jd(BleHandleCallback r0, BleSedentarinessSettings r1) {
        super.onReadSedentariness(r1);
    }

    static /* synthetic */ void access$onReadSleep$jd(BleHandleCallback r0, List r1) {
        super.onReadSleep(r1);
    }

    static /* synthetic */ void access$onReadSleepGoal$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepGoal(r1);
    }

    static /* synthetic */ void access$onReadSleepMonitoringMode$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepMonitoringMode(r1);
    }

    static /* synthetic */ void access$onReadSleepQuality$jd(BleHandleCallback r0, BleSleepQuality r1) {
        super.onReadSleepQuality(r1);
    }

    static /* synthetic */ void access$onReadSleepQualityScore$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepQualityScore(r1);
    }

    static /* synthetic */ void access$onReadSleepRaw$jd(BleHandleCallback r0, byte[] r1) {
        super.onReadSleepRaw(r1);
    }

    static /* synthetic */ void access$onReadSleepRespiratoryRate$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepRespiratoryRate(r1);
    }

    static /* synthetic */ void access$onReadSleepRiskLevel$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepRiskLevel(r1);
    }

    static /* synthetic */ void access$onReadSleepSet$jd(BleHandleCallback r0, int r1) {
        super.onReadSleepSet(r1);
    }

    static /* synthetic */ void access$onReadSosCallLog$jd(BleHandleCallback r0, List r1) {
        super.onReadSosCallLog(r1);
    }

    static /* synthetic */ void access$onReadSosContact$jd(BleHandleCallback r0, BleSosContact r1) {
        super.onReadSosContact(r1);
    }

    static /* synthetic */ void access$onReadSportDurationGoal$jd(BleHandleCallback r0, int r1) {
        super.onReadSportDurationGoal(r1);
    }

    static /* synthetic */ void access$onReadStandbyWatchFaceSet$jd(BleHandleCallback r0, BleStandbyWatchFaceSet r1) {
        super.onReadStandbyWatchFaceSet(r1);
    }

    static /* synthetic */ void access$onReadStepGoal$jd(BleHandleCallback r0, int r1) {
        super.onReadStepGoal(r1);
    }

    static /* synthetic */ void access$onReadStock$jd(BleHandleCallback r0, List r1) {
        super.onReadStock(r1);
    }

    static /* synthetic */ void access$onReadTemperature$jd(BleHandleCallback r0, List r1) {
        super.onReadTemperature(r1);
    }

    static /* synthetic */ void access$onReadTemperatureUnit$jd(BleHandleCallback r0, int r1) {
        super.onReadTemperatureUnit(r1);
    }

    static /* synthetic */ void access$onReadTrainingStatus$jd(BleHandleCallback r0, List r1) {
        super.onReadTrainingStatus(r1);
    }

    static /* synthetic */ void access$onReadTuyaKey$jd(BleHandleCallback r0, BleTuyaKey r1) {
        super.onReadTuyaKey(r1);
    }

    static /* synthetic */ void access$onReadUiPackVersion$jd(BleHandleCallback r0, String r1) {
        super.onReadUiPackVersion(r1);
    }

    static /* synthetic */ void access$onReadUnit$jd(BleHandleCallback r0, int r1) {
        super.onReadUnit(r1);
    }

    static /* synthetic */ void access$onReadUserProfile$jd(BleHandleCallback r0, BleUserProfile r1) {
        super.onReadUserProfile(r1);
    }

    static /* synthetic */ void access$onReadVitalityValue$jd(BleHandleCallback r0, List r1) {
        super.onReadVitalityValue(r1);
    }

    static /* synthetic */ void access$onReadVoiceControl$jd(BleHandleCallback r0, int r1) {
        super.onReadVoiceControl(r1);
    }

    static /* synthetic */ void access$onReadWatchFaceId$jd(BleHandleCallback r0, BleWatchFaceId r1) {
        super.onReadWatchFaceId(r1);
    }

    static /* synthetic */ void access$onReadWatchFaceIndex$jd(BleHandleCallback r0, BleWatchFaceIndex r1) {
        super.onReadWatchFaceIndex(r1);
    }

    static /* synthetic */ void access$onReadWatchFaceMaxSize$jd(BleHandleCallback r0, BleWatchFaceMaxSize r1) {
        super.onReadWatchFaceMaxSize(r1);
    }

    static /* synthetic */ void access$onReadWatchFaceSwitch$jd(BleHandleCallback r0, int r1) {
        super.onReadWatchFaceSwitch(r1);
    }

    static /* synthetic */ void access$onReadWatchPassword$jd(BleHandleCallback r0, BleSettingWatchPassword r1) {
        super.onReadWatchPassword(r1);
    }

    static /* synthetic */ void access$onReadWearWayState$jd(BleHandleCallback r0, int r1) {
        super.onReadWearWayState(r1);
    }

    static /* synthetic */ void access$onReadWeatherRealTime$jd(BleHandleCallback r0, boolean r1) {
        super.onReadWeatherRealTime(r1);
    }

    static /* synthetic */ void access$onReadWechatPaySettings$jd(BleHandleCallback r0, BleWechatPaySettings r1) {
        super.onReadWechatPaySettings(r1);
    }

    static /* synthetic */ void access$onReadWorkout$jd(BleHandleCallback r0, List r1) {
        super.onReadWorkout(r1);
    }

    static /* synthetic */ void access$onReadWorkout2$jd(BleHandleCallback r0, List r1) {
        super.onReadWorkout2(r1);
    }

    static /* synthetic */ void access$onReadWorkout3$jd(BleHandleCallback r0, List r1) {
        super.onReadWorkout3(r1);
    }

    static /* synthetic */ void access$onReadWorkout4$jd(BleHandleCallback r0, List r1) {
        super.onReadWorkout4(r1);
    }

    static /* synthetic */ void access$onReadWorkout4Segmentation$jd(BleHandleCallback r0, BleWorkout4Segmentation r1) {
        super.onReadWorkout4Segmentation(r1);
    }

    static /* synthetic */ void access$onReadWorldClock$jd(BleHandleCallback r0, List r1) {
        super.onReadWorldClock(r1);
    }

    static /* synthetic */ void access$onRealTimeMeasurement$jd(BleHandleCallback r0, BleRealTimeMeasurement r1) {
        super.onRealTimeMeasurement(r1);
    }

    static /* synthetic */ void access$onReceiveCmTrace$jd(BleHandleCallback r0, byte[] r1, boolean r2) {
        super.onReceiveCmTrace(r1, r2);
    }

    static /* synthetic */ void access$onReceiveFilePacket$jd(BleHandleCallback r0, BleReceiveFilePacket r1) {
        super.onReceiveFilePacket(r1);
    }

    static /* synthetic */ void access$onReceiveGSensorMotion$jd(BleHandleCallback r0, List r1) {
        super.onReceiveGSensorMotion(r1);
    }

    static /* synthetic */ void access$onReceiveGSensorRaw$jd(BleHandleCallback r0, List r1) {
        super.onReceiveGSensorRaw(r1);
    }

    static /* synthetic */ void access$onReceiveGSensorSHSY$jd(BleHandleCallback r0, List r1) {
        super.onReceiveGSensorSHSY(r1);
    }

    static /* synthetic */ void access$onReceiveHRRaw$jd(BleHandleCallback r0, List r1) {
        super.onReceiveHRRaw(r1);
    }

    static /* synthetic */ void access$onReceiveLocationGga$jd(BleHandleCallback r0, BleLocationGga r1) {
        super.onReceiveLocationGga(r1);
    }

    static /* synthetic */ void access$onReceiveLocationGsv$jd(BleHandleCallback r0, List r1) {
        super.onReceiveLocationGsv(r1);
    }

    static /* synthetic */ void access$onReceiveMusicCommand$jd(BleHandleCallback r0, MusicCommand r1) {
        super.onReceiveMusicCommand(r1);
    }

    static /* synthetic */ void access$onReceivePpgSHSY$jd(BleHandleCallback r0, List r1) {
        super.onReceivePpgSHSY(r1);
    }

    static /* synthetic */ void access$onReceiveRealtimeLog$jd(BleHandleCallback r0, BleRealtimeLog r1) {
        super.onReceiveRealtimeLog(r1);
    }

    static /* synthetic */ void access$onReceiveRecordPacket$jd(BleHandleCallback r0, BleRecordPacket r1) {
        super.onReceiveRecordPacket(r1);
    }

    static /* synthetic */ void access$onRecordControlUpdate$jd(BleHandleCallback r0, BleRecordControl r1) {
        super.onRecordControlUpdate(r1);
    }

    static /* synthetic */ void access$onRequestAgpsPrerequisite$jd(BleHandleCallback r0) {
        super.onRequestAgpsPrerequisite();
    }

    static /* synthetic */ void access$onRequestLocation$jd(BleHandleCallback r0, int r1) {
        super.onRequestLocation(r1);
    }

    static /* synthetic */ void access$onRingVibrationSetUpdate$jd(BleHandleCallback r0, BleRingVibrationSettings r1) {
        super.onRingVibrationSetUpdate(r1);
    }

    static /* synthetic */ void access$onSDCardInfoUpdate$jd(BleHandleCallback r0, BleSDCardInfo r1) {
        super.onSDCardInfoUpdate(r1);
    }

    static /* synthetic */ void access$onSGTestUpdate$jd(BleHandleCallback r0, BleSGTest r1) {
        super.onSGTestUpdate(r1);
    }

    static /* synthetic */ void access$onSGTtsUpdate$jd(BleHandleCallback r0, BleSGTts r1) {
        super.onSGTtsUpdate(r1);
    }

    static /* synthetic */ void access$onSOSSettingsUpdate$jd(BleHandleCallback r0, BleSOSSettings r1) {
        super.onSOSSettingsUpdate(r1);
    }

    static /* synthetic */ void access$onScreenBrightnessSetUpdate$jd(BleHandleCallback r0, int r1) {
        super.onScreenBrightnessSetUpdate(r1);
    }

    static /* synthetic */ void access$onSessionStateChange$jd(BleHandleCallback r0, boolean r1) {
        super.onSessionStateChange(r1);
    }

    static /* synthetic */ void access$onSleepNotifyUpdate$jd(BleHandleCallback r0, BleSleepNotify r1) {
        super.onSleepNotifyUpdate(r1);
    }

    static /* synthetic */ void access$onSosContactUpdate$jd(BleHandleCallback r0, BleSosContact r1) {
        super.onSosContactUpdate(r1);
    }

    static /* synthetic */ void access$onSportEndNotifyUpdate$jd(BleHandleCallback r0, int r1) {
        super.onSportEndNotifyUpdate(r1);
    }

    static /* synthetic */ void access$onStandbyWatchFaceSetUpdate$jd(BleHandleCallback r0, BleStandbyWatchFaceSet r1) {
        super.onStandbyWatchFaceSetUpdate(r1);
    }

    static /* synthetic */ void access$onStepGoalUpdate$jd(BleHandleCallback r0, int r1) {
        super.onStepGoalUpdate(r1);
    }

    static /* synthetic */ void access$onStockDelete$jd(BleHandleCallback r0, int r1) {
        super.onStockDelete(r1);
    }

    static /* synthetic */ void access$onStreamProgress$jd(BleHandleCallback r0, boolean r1, int r2, int r3, int r4, BleKey r5) {
        super.onStreamProgress(r1, r2, r3, r4, r5);
    }

    static /* synthetic */ void access$onSyncData$jd(BleHandleCallback r0, int r1, BleKey r2) {
        super.onSyncData(r1, r2);
    }

    static /* synthetic */ void access$onTimeUpdate$jd(BleHandleCallback r0) {
        super.onTimeUpdate();
    }

    static /* synthetic */ void access$onUpdateAICoachGenerateBeforeInfoV2$jd(BleHandleCallback r0, BleAICoachBeforePlanV2 r1) {
        super.onUpdateAICoachGenerateBeforeInfoV2(r1);
    }

    static /* synthetic */ void access$onUpdateAICoachLeaveDay$jd(BleHandleCallback r0, BleLeaveDay r1) {
        super.onUpdateAICoachLeaveDay(r1);
    }

    static /* synthetic */ void access$onUpdateAppSportState$jd(BleHandleCallback r0, BleAppSportState r1) {
        super.onUpdateAppSportState(r1);
    }

    static /* synthetic */ void access$onUpdateBAC$jd(BleHandleCallback r0, BleBAC r1) {
        super.onUpdateBAC(r1);
    }

    static /* synthetic */ void access$onUpdateBloodPressure$jd(BleHandleCallback r0, BleBloodPressure r1) {
        super.onUpdateBloodPressure(r1);
    }

    static /* synthetic */ void access$onUpdateHeartRate$jd(BleHandleCallback r0, BleHeartRate r1) {
        super.onUpdateHeartRate(r1);
    }

    static /* synthetic */ void access$onUpdateTemperature$jd(BleHandleCallback r0, BleTemperature r1) {
        super.onUpdateTemperature(r1);
    }

    static /* synthetic */ void access$onUpdateWatchFaceSwitch$jd(BleHandleCallback r0, boolean r1) {
        super.onUpdateWatchFaceSwitch(r1);
    }

    static /* synthetic */ void access$onUserProfileUpdate$jd(BleHandleCallback r0, BleUserProfile r1) {
        super.onUserProfileUpdate(r1);
    }

    static /* synthetic */ void access$onVibrationUpdate$jd(BleHandleCallback r0, int r1) {
        super.onVibrationUpdate(r1);
    }

    static /* synthetic */ void access$onVibrationUpdateV2$jd(BleHandleCallback r0, int r1) {
        super.onVibrationUpdateV2(r1);
    }

    static /* synthetic */ void access$onWatchFaceIdUpdate$jd(BleHandleCallback r0, boolean r1) {
        super.onWatchFaceIdUpdate(r1);
    }

    static /* synthetic */ void access$onWatchFaceIndexCreate$jd(BleHandleCallback r0, boolean r1) {
        super.onWatchFaceIndexCreate(r1);
    }

    static /* synthetic */ void access$onWatchFaceIndexUpdate$jd(BleHandleCallback r0, BleWatchFaceIndex r1) {
        super.onWatchFaceIndexUpdate(r1);
    }

    static /* synthetic */ void access$onWatchPasswordUpdate$jd(BleHandleCallback r0, BleSettingWatchPassword r1) {
        super.onWatchPasswordUpdate(r1);
    }

    static /* synthetic */ void access$onWearWayUpdate$jd(BleHandleCallback r0, int r1) {
        super.onWearWayUpdate(r1);
    }

    static /* synthetic */ void access$onWorldClockDelete$jd(BleHandleCallback r0, int r1) {
        super.onWorldClockDelete(r1);
    }

    static /* synthetic */ void access$onXMLYBandSetUpdate$jd(BleHandleCallback r0, BleXMLYBandSet r1) {
        super.onXMLYBandSetUpdate(r1);
    }

    static /* synthetic */ void access$onXModem$jd(BleHandleCallback r0, byte r1) {
        super.onXModem(r1);
    }

    static /* synthetic */ void onIdentityCreate$default(BleHandleCallback r0, boolean r1, BleDeviceInfo r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r0.onIdentityCreate(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onIdentityCreate");
    }

    static /* synthetic */ void onStreamProgress$default(BleHandleCallback r6, boolean r7, int r8, int r9, int r10, BleKey r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 16) == 0) goto L6;
        r11 = BleKey.NONE;
    L6:
        r6.onStreamProgress(r7, r8, r9, r10, r11);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStreamProgress");
    }

    default void onAICoachGeneratePlanUpdate(int r1) {
    }

    default void onAICommandUpdate(@aa1 BleAICommand r2) {
        Intrinsics.X0O(r2, f.b.g);
    }

    default void onActivityRecognitionUpdate(int r1) {
    }

    default void onAlarmAdd(@aa1 BleAlarm r2) {
        Intrinsics.X0O(r2, NotificationCompat.CATEGORY_ALARM);
    }

    default void onAlarmDelete(int r1) {
    }

    default void onAlarmUpdate(@aa1 BleAlarm r2) {
        Intrinsics.X0O(r2, NotificationCompat.CATEGORY_ALARM);
    }

    default void onAppOpUpdate(@aa1 BleAppOp r2) {
        Intrinsics.X0O(r2, "appOp");
    }

    default void onAppSportDataResponse(boolean r1) {
    }

    default void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo r2) {
        Intrinsics.X0O(r2, "naviInfo");
    }

    default void onBacklightUpdate(int r1) {
    }

    default void onBandKeyUpdate(@aa1 BleBandKey r2) {
        Intrinsics.X0O(r2, "key");
    }

    default void onBleGolfScore(@aa1 BleGolfScore r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData r2) {
        Intrinsics.X0O(r2, "thirdPartyData");
    }

    default void onBleVideoCallInfo(@aa1 BleVideoCallInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onCPChatUpdate(@aa1 BleCPChat r2) {
        Intrinsics.X0O(r2, "chat");
    }

    default void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onCPListenerUpdate(@aa1 BleCPListener r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    default void onCPMissYouUpdate(@aa1 BleCPMissYou r2) {
        Intrinsics.X0O(r2, "you");
    }

    default void onCPTodoUpdate(@aa1 BleCPTodo r2) {
        Intrinsics.X0O(r2, "todo");
    }

    default void onCaloriesGoalUpdate(int r1) {
    }

    default void onCameraResponse(boolean r1, int r2) {
    }

    default void onCameraStateChange(int r1) {
    }

    default void onChatAppUpdate(@aa1 BleChatApp r2) {
        Intrinsics.X0O(r2, "app");
    }

    default void onChatMessageUpdate(@aa1 BleChatMessage r2) {
        Intrinsics.X0O(r2, "message");
    }

    default void onChatVoiceUpdate(@aa1 BleChatVoice r2) {
        Intrinsics.X0O(r2, "voice");
    }

    default void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay r2) {
        Intrinsics.X0O(r2, "everyDay");
    }

    default void onClassicBluetoothStateChange(int r1) {
    }

    default void onCommandReply(@aa1 BleKey r1, @aa1 BleKeyFlag r2, boolean r3) {
        Intrinsics.X0O(r1, "bleKey");
        Intrinsics.X0O(r2, "bleKeyFlag");
    }

    default void onCommandSendTimeout(@aa1 BleKey r2, @aa1 BleKeyFlag r3) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "bleKeyFlag");
    }

    default void onContactUsStateChange(int r1) {
    }

    default void onDeleteAICoachPlan() {
    }

    default void onDeleteFileResponse(int r1) {
    }

    default void onDeviceConnected(@aa1 BluetoothDevice r2) {
        Intrinsics.X0O(r2, "device");
    }

    default void onDeviceConnecting(boolean r1) {
    }

    default void onDeviceFileUpdate(@aa1 BleDeviceFile r2) {
        Intrinsics.X0O(r2, "deviceFile");
    }

    default void onDeviceOpUpdate(int r1) {
    }

    default void onDeviceRequestAGpsFile(@aa1 String r2) {
        Intrinsics.X0O(r2, "url");
    }

    default void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply r2) {
        Intrinsics.X0O(r2, "smsQuickReply");
    }

    default void onDeviceSportDataUpdate(@aa1 BleDeviceSportData r2) {
        Intrinsics.X0O(r2, "deviceSportData");
    }

    default void onDistanceGoalUpdate(int r1) {
    }

    default void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings r2) {
        Intrinsics.X0O(r2, "doubleScreenSettings");
    }

    default void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings r2) {
        Intrinsics.X0O(r2, "settings");
    }

    default void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings r2) {
        Intrinsics.X0O(r2, "earphoneAncSettings");
    }

    default void onEarphoneCallUpdate(int r1) {
    }

    default void onEarphoneKeyUpdate(@aa1 BleEarphoneKey r2) {
        Intrinsics.X0O(r2, "earphoneKey");
    }

    default void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings r2) {
        Intrinsics.X0O(r2, "earphoneSoundEffectsSettings");
    }

    default void onEarphoneStateUpdate(@aa1 BleEarphoneState r2) {
        Intrinsics.X0O(r2, "earphoneState");
    }

    default void onFactoryTestUpdate(@aa1 BleFactoryTest r2) {
        Intrinsics.X0O(r2, "factoryTest");
    }

    default void onFallSetUpdate(int r1) {
    }

    default void onFindEarphoneUpdate(@aa1 BleFindEarphone r2) {
        Intrinsics.X0O(r2, "findEarphone");
    }

    default void onFindPhone(boolean r1) {
    }

    default void onFindWatchUpdate(int r1) {
    }

    default void onFollowSystemDateFormat() {
    }

    default void onFollowSystemHour() {
    }

    default void onFollowSystemLanguage(boolean r1) {
    }

    default void onGameControlUpdate(@aa1 BleGameControl r2) {
        Intrinsics.X0O(r2, "gameControl");
    }

    default void onGestureWake2Update(@aa1 BleGestureWake2 r2) {
        Intrinsics.X0O(r2, "gestureWake2");
    }

    default void onGestureWakeUpdate(@aa1 BleGestureWake r2) {
        Intrinsics.X0O(r2, "gestureWake");
    }

    default void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo r2) {
        Intrinsics.X0O(r2, "naviInfo");
    }

    default void onHIDState(int r1) {
    }

    default void onHIDValueChange(int r1) {
    }

    default void onHRWarningSet(@aa1 BleHrWarningSettings r2) {
        Intrinsics.X0O(r2, "set");
    }

    default void onHanBaoVibrationStateChange(int r1) {
    }

    default void onHighAntiAssistChange(int r1) {
    }

    default void onHourSystemUpdate(int r1) {
    }

    default void onHydrationUpdate(@aa1 BleHydrationSettings r2) {
        Intrinsics.X0O(r2, "settings");
    }

    default void onIPCExceptionUpdate(@aa1 BleIPCException r2) {
        Intrinsics.X0O(r2, MqttServiceConstants.TRACE_EXCEPTION);
    }

    default void onIPCOTAStateUpdate(@aa1 BleIPCOTAState r2) {
        Intrinsics.X0O(r2, "state");
    }

    default void onIPCStateUpdate(@aa1 BleIPCState r2) {
        Intrinsics.X0O(r2, "state");
    }

    default void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onIdentityCreate(boolean r1, @tb1 BleDeviceInfo r2) {
    }

    default void onIdentityDelete(boolean r1) {
    }

    default void onIdentityDeleteByDevice(boolean r1) {
    }

    default void onIncomingCallRingUpdate(int r1) {
    }

    default void onIncomingCallStatus(int r1) {
    }

    default void onLoveTapUpdate(@aa1 BleLoveTap r2) {
        Intrinsics.X0O(r2, "loveTap");
    }

    default void onLoveTapUserDelete(int r1) {
    }

    default void onLoveTapUserUpdate(@aa1 BleLoveTapUser r2) {
        Intrinsics.X0O(r2, "loveTapUser");
    }

    default void onMeasurementUpdate(@aa1 BleMeasurement r2) {
        Intrinsics.X0O(r2, "measurement");
    }

    default void onMedicationAlarmAdd(@aa1 BleMedicationAlarm r2) {
        Intrinsics.X0O(r2, "medicationAlarm");
    }

    default void onMedicationAlarmDelete(int r1) {
    }

    default void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm r2) {
        Intrinsics.X0O(r2, "medicationAlarm");
    }

    default void onMedicationReminderDelete(int r1) {
    }

    default void onMedicationReminderUpdate(@aa1 BleMedicationReminder r2) {
        Intrinsics.X0O(r2, "medicationReminder");
    }

    default void onMeetingReminderAdd(@aa1 BleMeetingReminder r2) {
        Intrinsics.X0O(r2, "meetingReminder");
    }

    default void onMeetingReminderDelete(int r1) {
    }

    default void onMeetingReminderUpdate(@aa1 BleMeetingReminder r2) {
        Intrinsics.X0O(r2, "meetingReminder");
    }

    default void onMultiFileTransferReadFile(int r1) {
    }

    default void onMultiFileTransferResponse(int r1) {
    }

    default void onNaviInfoUpdate(@aa1 BleNaviInfo r2) {
        Intrinsics.X0O(r2, "naviInfo");
    }

    default void onNoDisturbUpdate(@aa1 BleNoDisturbSettings r2) {
        Intrinsics.X0O(r2, "noDisturbSettings");
    }

    default void onNotificationLightScreenSetUpdate(int r1) {
    }

    default void onNotificationSettings2Update(@aa1 BleNotificationSettings2 r2) {
        Intrinsics.X0O(r2, "notificationSettings2");
    }

    default void onOTA(boolean r1) {
    }

    default void onPowerSaveModeState(int r1) {
    }

    default void onPowerSaveModeStateChange(int r1) {
    }

    default void onQiblaSettingsUpdate() {
    }

    default void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan r2) {
        Intrinsics.X0O(r2, "plan");
    }

    default void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 r2) {
        Intrinsics.X0O(r2, "plan");
    }

    default void onReadActivity(@aa1 List<BleActivity> r2) {
        Intrinsics.X0O(r2, "activities");
    }

    default void onReadActivityDetail(@aa1 BleActivityDetail r2) {
        Intrinsics.X0O(r2, "activityDetail");
    }

    default void onReadAddressBook(@aa1 BleAddressBook r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadAlarm(@aa1 List<BleAlarm> r2) {
        Intrinsics.X0O(r2, "alarms");
    }

    default void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> r2) {
        Intrinsics.X0O(r2, "alipayBindInfos");
    }

    default void onReadAlipaySettings(@aa1 BleAlipaySettings r2) {
        Intrinsics.X0O(r2, "alipaySettings");
    }

    default void onReadAppApiVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadAppInfoList(@aa1 BleAppInfoList r2) {
        Intrinsics.X0O(r2, "appInfoList");
    }

    default void onReadAppSportState(@aa1 BleAppSportState r2) {
        Intrinsics.X0O(r2, "appSportState");
    }

    default void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> r2) {
        Intrinsics.X0O(r2, "heartRates");
    }

    default void onReadBAC(@aa1 List<BleBAC> r2) {
        Intrinsics.X0O(r2, "bacs");
    }

    default void onReadBacCalibration(@aa1 BleBacCalibration r2, @aa1 BleKeyFlag r3) {
        Intrinsics.X0O(r2, "bac");
        Intrinsics.X0O(r3, "bleKeyFlag");
    }

    default void onReadBacklight(int r1) {
    }

    default void onReadBatteryUsage(@aa1 BleBatteryUsage r2) {
        Intrinsics.X0O(r2, "batteryUsage");
    }

    default void onReadBleAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
    }

    default void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo r2) {
        Intrinsics.X0O(r2, "bleGolfMapCacheInfo");
    }

    default void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch r2) {
        Intrinsics.X0O(r2, "bleGolfSportSwitch");
    }

    default void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo r2) {
        Intrinsics.X0O(r2, "bleGolfWatchMapInfo");
    }

    default void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo r2) {
        Intrinsics.X0O(r2, "bleGolfWatchVersionInfo");
    }

    default void onReadBleHrv(@aa1 List<BleHrv> r2) {
        Intrinsics.X0O(r2, q62.XOX1);
    }

    default void onReadBleLogText(@aa1 List<BleLogText> r2) {
        Intrinsics.X0O(r2, uz0.OXO1);
    }

    default void onReadBloodGlucose(@aa1 List<BleBloodGlucose> r2) {
        Intrinsics.X0O(r2, "bloodGlucoses");
    }

    default void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings r2) {
        Intrinsics.X0O(r2, "bloodOxyGenSettings");
    }

    default void onReadBloodOxygen(@aa1 List<BleBloodOxygen> r2) {
        Intrinsics.X0O(r2, "bloodOxygen");
    }

    default void onReadBloodPressure(@aa1 List<BleBloodPressure> r2) {
        Intrinsics.X0O(r2, "bloodPressures");
    }

    default void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration r2) {
        Intrinsics.X0O(r2, "bloodPressureCalibration");
    }

    default void onReadBodyStatus(@aa1 List<BleBodyStatus> r2) {
        Intrinsics.X0O(r2, "bodyData");
    }

    default void onReadCPUserInfo(@aa1 BleCPUserInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadCalibrationData(@aa1 BleCalibrationData r2) {
        Intrinsics.X0O(r2, "calibrationData");
    }

    default void onReadCalorieIntake(@aa1 List<BleCalorieIntake> r2) {
        Intrinsics.X0O(r2, "calorieIntakes");
    }

    default void onReadCaloriesGoal(int r1) {
    }

    default void onReadChatApp(@aa1 BleChatApp r2) {
        Intrinsics.X0O(r2, "app");
    }

    default void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay r2) {
        Intrinsics.X0O(r2, "everyDay");
    }

    default void onReadClassicBluetoothState(int r1) {
    }

    default void onReadCoachingIds(@aa1 BleCoachingIds r2) {
        Intrinsics.X0O(r2, "bleCoachingIds");
    }

    default void onReadCyWeeAlgorithm(@aa1 BleCyWeeAlgorithm r2) {
        Intrinsics.X0O(r2, "bleCyWeeAlgorithm");
    }

    default void onReadDailyPower(@aa1 List<BlePhysicalPower> r2) {
        Intrinsics.X0O(r2, "powers");
    }

    default void onReadDateFormat(int r1) {
    }

    default void onReadDeviceFile(@aa1 BleDeviceFile r2) {
        Intrinsics.X0O(r2, "deviceFile");
    }

    default void onReadDeviceFileV2(@aa1 BleDeviceFile2 r2) {
        Intrinsics.X0O(r2, "deviceFile");
    }

    default void onReadDeviceInfo(@aa1 BleDeviceInfo r2) {
        Intrinsics.X0O(r2, "deviceInfo");
    }

    default void onReadDeviceInfo2(@aa1 BleDeviceInfo2 r2) {
        Intrinsics.X0O(r2, "deviceInfo");
    }

    default void onReadDeviceLanguages(@aa1 BleDeviceLanguages r2) {
        Intrinsics.X0O(r2, "deviceLanguages");
    }

    default void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 r2) {
        Intrinsics.X0O(r2, "deviceLanguages");
    }

    default void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings r2) {
        Intrinsics.X0O(r2, "deviceUniqueDataSettings");
    }

    default void onReadDistanceGoal(int r1) {
    }

    default void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings r2) {
        Intrinsics.X0O(r2, "doubleScreenSettings");
    }

    default void onReadDrinkWater(@aa1 BleDrinkWaterSettings r2) {
        Intrinsics.X0O(r2, "drinkWaterSettings");
    }

    default void onReadECGRealtime(@aa1 BleECGRealtime r2) {
        Intrinsics.X0O(r2, "ecgRealtime");
    }

    default void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings r2) {
        Intrinsics.X0O(r2, "earphoneAncSettings");
    }

    default void onReadEarphoneCall(int r1) {
    }

    default void onReadEarphoneInfo(@aa1 BleEarphoneInfo r2) {
        Intrinsics.X0O(r2, "earphoneInfo");
    }

    default void onReadEarphoneKey(@aa1 BleEarphoneKey r2) {
        Intrinsics.X0O(r2, "earphoneKey");
    }

    default void onReadEarphonePower(@aa1 BleEarphonePower r2) {
        Intrinsics.X0O(r2, "earphonePower");
    }

    default void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings r2) {
        Intrinsics.X0O(r2, "earphoneSoundEffectsSettings");
    }

    default void onReadEarphoneState(@aa1 BleEarphoneState r2) {
        Intrinsics.X0O(r2, "earphoneState");
    }

    default void onReadEcg(@aa1 List<BleEcg> r2) {
        Intrinsics.X0O(r2, "ecgs");
    }

    default void onReadEcgSettings(@aa1 BleEcgSettings r2) {
        Intrinsics.X0O(r2, "ecgSettings");
    }

    default void onReadEnergyRating(@aa1 List<BleEnergyRating> r2) {
        Intrinsics.X0O(r2, "energyRating");
    }

    default void onReadFallSet(int r1) {
    }

    default void onReadFilePath(@aa1 BleAppAudioBookList r2) {
        Intrinsics.X0O(r2, Y5.c.c);
    }

    default void onReadFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadFoodBalance(@aa1 List<BleFoodBalance> r2) {
        Intrinsics.X0O(r2, "foodBalances");
    }

    default void onReadGestureWake(@aa1 BleGestureWake r2) {
        Intrinsics.X0O(r2, "gestureWake");
    }

    default void onReadGestureWake2(@aa1 BleGestureWake2 r2) {
        Intrinsics.X0O(r2, "gestureWake2");
    }

    default void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly r2) {
        Intrinsics.X0O(r2, "girlCareMonthly");
    }

    default void onReadGirlCareSettings(@aa1 BleGirlCareSettings r2) {
        Intrinsics.X0O(r2, "girlCareSettings");
    }

    default void onReadGoMoreSettings(@aa1 BleGoMoreSettings r2) {
        Intrinsics.X0O(r2, "goMoreSettings");
    }

    default void onReadGolfWatchScore(@aa1 BleGolfWatchScore r2) {
        Intrinsics.X0O(r2, "watchScore");
    }

    default void onReadGpsFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadHanBaoSettings(@aa1 BleHanBaoSettings r2) {
        Intrinsics.X0O(r2, "hanBaoSettings");
    }

    default void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> r2) {
        Intrinsics.X0O(r2, "hanBaoVibrations");
    }

    default void onReadHeartRate(@aa1 List<BleHeartRate> r2) {
        Intrinsics.X0O(r2, "heartRates");
    }

    default void onReadHeartRateZones(@aa1 BleHeartRateZones r2) {
        Intrinsics.X0O(r2, "bmp");
    }

    default void onReadHourSystem(int r1) {
    }

    default void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings r2) {
        Intrinsics.X0O(r2, "hrMonitoringSettings");
    }

    default void onReadHrMonitoringSettingsV2(int r1) {
    }

    default void onReadHrvBaseLine(@aa1 BleHrvBaseLine r2) {
        Intrinsics.X0O(r2, "mBleHrvBaseLine");
    }

    default void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings r2) {
        Intrinsics.X0O(r2, "hrvMonitoringSettings");
    }

    default void onReadHydrationSettings(@aa1 BleHydrationSettings r2) {
        Intrinsics.X0O(r2, "hydrationSettings");
    }

    default void onReadIPCInfo(@aa1 BleIPCInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadIPCState(@aa1 BleIPCState r2) {
        Intrinsics.X0O(r2, "state");
    }

    default void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadIPCVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadIncomingCallRing(int r1) {
    }

    default void onReadLactateThreshold(@aa1 List<BleLactateThreshold> r2) {
        Intrinsics.X0O(r2, "lactateThreshold");
    }

    default void onReadLanguage(int r1) {
    }

    default void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadLocation(@aa1 List<BleLocation> r2) {
        Intrinsics.X0O(r2, "locations");
    }

    default void onReadLoveTapUser(@aa1 List<BleLoveTapUser> r2) {
        Intrinsics.X0O(r2, "loveTapUsers");
    }

    default void onReadMatchRecord(@aa1 List<BleMatchRecord> r2) {
        Intrinsics.X0O(r2, "matchRecords");
    }

    default void onReadMatchRecord2(@aa1 List<BleMatchRecord2> r2) {
        Intrinsics.X0O(r2, "matchRecords");
    }

    default void onReadMatchRecord3(@aa1 List<BleMatchRecord3> r2) {
        Intrinsics.X0O(r2, "matchRecords");
    }

    default void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> r2) {
        Intrinsics.X0O(r2, "medicationAlarm");
    }

    default void onReadMedicationReminder(@aa1 List<BleMedicationReminder> r2) {
        Intrinsics.X0O(r2, "medicationReminders");
    }

    default void onReadMeetingReminder(@aa1 List<BleMeetingReminder> r2) {
        Intrinsics.X0O(r2, "meetingReminders");
    }

    default void onReadMindStatus(@aa1 List<BleMindStatus> r2) {
        Intrinsics.X0O(r2, "feelingData");
    }

    default void onReadMtkOtaMeta() {
    }

    default void onReadMultiFileTransfer(@aa1 BleMapFileList r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onReadNetworkFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadNoDisturb(@aa1 BleNoDisturbSettings r2) {
        Intrinsics.X0O(r2, "noDisturbSettings");
    }

    default void onReadNotificationLightScreenSet(int r1) {
    }

    default void onReadNotificationSettings2(@aa1 BleNotificationSettings2 r2) {
        Intrinsics.X0O(r2, "notificationSettings2");
    }

    default void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings r2) {
        Intrinsics.X0O(r2, "settings");
    }

    default void onReadOngoingDialogue(int r1) {
    }

    default void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo r2) {
        Intrinsics.X0O(r2, "optionalMapAuthInfo");
    }

    default void onReadPackageStatus(@aa1 BlePackageStatus r2) {
        Intrinsics.X0O(r2, "packageStatus");
    }

    default void onReadPower(int r1) {
    }

    default void onReadPower2(@aa1 BlePower2 r2) {
        Intrinsics.X0O(r2, "power");
    }

    default void onReadPressure(@aa1 List<BlePressure> r2) {
        Intrinsics.X0O(r2, "pressures");
    }

    default void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement r2) {
        Intrinsics.X0O(r2, "pressureTimingMeasurement");
    }

    default void onReadQiblaSettings(@aa1 BleQiblaSettings r2) {
        Intrinsics.X0O(r2, "qiblaSettings");
    }

    default void onReadRecordControl(@aa1 BleRecordControl r2) {
        Intrinsics.X0O(r2, "control");
    }

    default void onReadRelaxReminder(@aa1 BleRelaxReminder r2) {
        Intrinsics.X0O(r2, NotificationCompat.CATEGORY_REMINDER);
    }

    default void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> r2) {
        Intrinsics.X0O(r2, "rate");
    }

    default void onReadRestingHeartRate(int r1) {
    }

    default void onReadRingVibrationSet(@aa1 BleRingVibrationSettings r2) {
        Intrinsics.X0O(r2, "ringVibrationSettings");
    }

    default void onReadRri(@aa1 List<BleRri> r2) {
        Intrinsics.X0O(r2, "rris");
    }

    default void onReadSDCardInfo(@aa1 BleSDCardInfo r2) {
        Intrinsics.X0O(r2, "sdCardInfo");
    }

    default void onReadSGCameraSet(@aa1 BleSGCameraSet r2) {
        Intrinsics.X0O(r2, "cameraSet");
    }

    default void onReadSGKeySet(@aa1 BleSGKeySet r2) {
        Intrinsics.X0O(r2, "set");
    }

    default void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake r2) {
        Intrinsics.X0O(r2, "keyword");
    }

    default void onReadSGSet(@aa1 BleSGSet r2) {
        Intrinsics.X0O(r2, "set");
    }

    default void onReadSGSleepSet(int r1) {
    }

    default void onReadSOSSettings(@aa1 BleSOSSettings r2) {
        Intrinsics.X0O(r2, "sosSettings");
    }

    default void onReadScreenBrightnessSet(int r1) {
    }

    default void onReadSedentariness(@aa1 BleSedentarinessSettings r2) {
        Intrinsics.X0O(r2, "sedentarinessSettings");
    }

    default void onReadSleep(@aa1 List<BleSleep> r2) {
        Intrinsics.X0O(r2, "sleeps");
    }

    default void onReadSleepGoal(int r1) {
    }

    default void onReadSleepMonitoringMode(int r1) {
    }

    default void onReadSleepQuality(@aa1 BleSleepQuality r2) {
        Intrinsics.X0O(r2, "sleepQuality");
    }

    default void onReadSleepQualityScore(int r1) {
    }

    default void onReadSleepRaw(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "sleepRawData");
    }

    default void onReadSleepRespiratoryRate(int r1) {
    }

    default void onReadSleepRiskLevel(int r1) {
    }

    default void onReadSleepSet(int r1) {
    }

    default void onReadSosCallLog(@aa1 List<BleSosCallLog> r2) {
        Intrinsics.X0O(r2, "callLogs");
    }

    default void onReadSosContact(@aa1 BleSosContact r2) {
        Intrinsics.X0O(r2, "sosContact");
    }

    default void onReadSportDurationGoal(int r1) {
    }

    default void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet r2) {
        Intrinsics.X0O(r2, "standbyWatchFaceSet");
    }

    default void onReadStepGoal(int r1) {
    }

    default void onReadStock(@aa1 List<BleStock> r2) {
        Intrinsics.X0O(r2, "stocks");
    }

    default void onReadTemperature(@aa1 List<BleTemperature> r2) {
        Intrinsics.X0O(r2, "temperatures");
    }

    default void onReadTemperatureUnit(int r1) {
    }

    default void onReadTrainingStatus(@aa1 List<BleTrainingStatus> r2) {
        Intrinsics.X0O(r2, "status");
    }

    default void onReadTuyaKey(@aa1 BleTuyaKey r2) {
        Intrinsics.X0O(r2, "tuyaKey");
    }

    default void onReadUiPackVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "version");
    }

    default void onReadUnit(int r1) {
    }

    default void onReadUserProfile(@aa1 BleUserProfile r2) {
        Intrinsics.X0O(r2, "userProfile");
    }

    default void onReadVitalityValue(@aa1 List<BleVitality> r2) {
        Intrinsics.X0O(r2, "vitalityValue");
    }

    default void onReadVoiceControl(int r1) {
    }

    default void onReadWatchFaceId(@aa1 BleWatchFaceId r2) {
        Intrinsics.X0O(r2, "watchFaceId");
    }

    default void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex r2) {
        Intrinsics.X0O(r2, "watchfaceIndex");
    }

    default void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize r2) {
        Intrinsics.X0O(r2, "sizeInfo");
    }

    default void onReadWatchFaceSwitch(int r1) {
    }

    default void onReadWatchPassword(@aa1 BleSettingWatchPassword r2) {
        Intrinsics.X0O(r2, "watchPassword");
    }

    default void onReadWearWayState(int r1) {
    }

    default void onReadWeatherRealTime(boolean r1) {
    }

    default void onReadWechatPaySettings(@aa1 BleWechatPaySettings r2) {
        Intrinsics.X0O(r2, "wechatPaySetting");
    }

    default void onReadWorkout(@aa1 List<BleWorkout> r2) {
        Intrinsics.X0O(r2, "workouts");
    }

    default void onReadWorkout2(@aa1 List<BleWorkout2> r2) {
        Intrinsics.X0O(r2, "workouts");
    }

    default void onReadWorkout3(@aa1 List<BleWorkout3> r2) {
        Intrinsics.X0O(r2, "workouts");
    }

    default void onReadWorkout4(@aa1 List<BleWorkout4> r2) {
        Intrinsics.X0O(r2, "workouts");
    }

    default void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation r2) {
        Intrinsics.X0O(r2, "mBleWorkout4Segmentation");
    }

    default void onReadWorldClock(@aa1 List<BleWorldClock> r2) {
        Intrinsics.X0O(r2, "clocks");
    }

    default void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement r2) {
        Intrinsics.X0O(r2, "realTimeMeasurement");
    }

    default void onReceiveCmTrace(@aa1 byte[] r1, boolean r2) {
        Intrinsics.X0O(r1, "data");
    }

    default void onReceiveFilePacket(@aa1 BleReceiveFilePacket r2) {
        Intrinsics.X0O(r2, "filePacket");
    }

    default void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> r2) {
        Intrinsics.X0O(r2, "gSensorMotions");
    }

    default void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> r2) {
        Intrinsics.X0O(r2, "gSensorRaws");
    }

    default void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> r2) {
        Intrinsics.X0O(r2, "gSensorSHSYs");
    }

    default void onReceiveHRRaw(@aa1 List<BleHRRaw> r2) {
        Intrinsics.X0O(r2, "hrRaw");
    }

    default void onReceiveLocationGga(@aa1 BleLocationGga r2) {
        Intrinsics.X0O(r2, "locationGga");
    }

    default void onReceiveLocationGsv(@aa1 List<BleLocationGsv> r2) {
        Intrinsics.X0O(r2, "locationGsv");
    }

    default void onReceiveMusicCommand(@aa1 MusicCommand r2) {
        Intrinsics.X0O(r2, "musicCommand");
    }

    default void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> r2) {
        Intrinsics.X0O(r2, "ppgSHSYs");
    }

    default void onReceiveRealtimeLog(@aa1 BleRealtimeLog r2) {
        Intrinsics.X0O(r2, "realtimeLog");
    }

    default void onReceiveRecordPacket(@aa1 BleRecordPacket r2) {
        Intrinsics.X0O(r2, "recordPacket");
    }

    default void onRecordControlUpdate(@aa1 BleRecordControl r2) {
        Intrinsics.X0O(r2, "control");
    }

    default void onRequestAgpsPrerequisite() {
    }

    default void onRequestLocation(int r1) {
    }

    default void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings r2) {
        Intrinsics.X0O(r2, "ringVibrationSettings");
    }

    default void onSDCardInfoUpdate(@aa1 BleSDCardInfo r2) {
        Intrinsics.X0O(r2, "sdCardInfo");
    }

    default void onSGTestUpdate(@aa1 BleSGTest r2) {
        Intrinsics.X0O(r2, "test");
    }

    default void onSGTtsUpdate(@aa1 BleSGTts r2) {
        Intrinsics.X0O(r2, "tts");
    }

    default void onSOSSettingsUpdate(@aa1 BleSOSSettings r2) {
        Intrinsics.X0O(r2, "sosSettings");
    }

    default void onScreenBrightnessSetUpdate(int r1) {
    }

    default void onSessionStateChange(boolean r1) {
    }

    default void onSleepNotifyUpdate(@aa1 BleSleepNotify r2) {
        Intrinsics.X0O(r2, "sleepNotify");
    }

    default void onSosContactUpdate(@aa1 BleSosContact r2) {
        Intrinsics.X0O(r2, "sosContact");
    }

    default void onSportEndNotifyUpdate(int r1) {
    }

    default void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet r2) {
        Intrinsics.X0O(r2, "standbyWatchFaceSet");
    }

    default void onStepGoalUpdate(int r1) {
    }

    default void onStockDelete(int r1) {
    }

    default void onStreamProgress(boolean r1, int r2, int r3, int r4, @aa1 BleKey r5) {
        Intrinsics.X0O(r5, "bleKey");
    }

    default void onSyncData(int r1, @aa1 BleKey r2) {
        Intrinsics.X0O(r2, "bleKey");
    }

    default void onTimeUpdate() {
    }

    default void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r2) {
        Intrinsics.X0O(r2, "info");
    }

    default void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay r2) {
        Intrinsics.X0O(r2, "plan");
    }

    default void onUpdateAppSportState(@aa1 BleAppSportState r2) {
        Intrinsics.X0O(r2, "appSportState");
    }

    default void onUpdateBAC(@aa1 BleBAC r2) {
        Intrinsics.X0O(r2, "bac");
    }

    default void onUpdateBloodPressure(@aa1 BleBloodPressure r2) {
        Intrinsics.X0O(r2, "bloodPressure");
    }

    default void onUpdateHeartRate(@aa1 BleHeartRate r2) {
        Intrinsics.X0O(r2, "heartRate");
    }

    default void onUpdateTemperature(@aa1 BleTemperature r2) {
        Intrinsics.X0O(r2, "temperature");
    }

    default void onUpdateWatchFaceSwitch(boolean r1) {
    }

    default void onUserProfileUpdate(@aa1 BleUserProfile r2) {
        Intrinsics.X0O(r2, Scopes.PROFILE);
    }

    default void onVibrationUpdate(int r1) {
    }

    default void onVibrationUpdateV2(int r1) {
    }

    default void onWatchFaceIdUpdate(boolean r1) {
    }

    default void onWatchFaceIndexCreate(boolean r1) {
    }

    default void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex r2) {
        Intrinsics.X0O(r2, "watchfaceIndex");
    }

    default void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword r2) {
        Intrinsics.X0O(r2, "watchPassword");
    }

    default void onWearWayUpdate(int r1) {
    }

    default void onWorldClockDelete(int r1) {
    }

    default void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet r2) {
        Intrinsics.X0O(r2, "data");
    }

    default void onXModem(byte r1) {
    }

    static /* synthetic */ void access$onReadStock$jd(BleHandleCallback r0, boolean r1) {
        super.onReadStock(r1);
    }

    default void onReadStock(boolean r1) {
    }
}
