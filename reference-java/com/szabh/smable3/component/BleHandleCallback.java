package com.szabh.smable3.component;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

/* JADX INFO: loaded from: classes3.dex */
public interface BleHandleCallback {

    public static final class DefaultImpls {
        @Deprecated
        public static void onAICoachGeneratePlanUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onAICoachGeneratePlanUpdate(i);
        }

        @Deprecated
        public static void onAICommandUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICommand command) {
            Intrinsics.X0O(command, "command");
            BleHandleCallback.super.onAICommandUpdate(command);
        }

        @Deprecated
        public static void onActivityRecognitionUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onActivityRecognitionUpdate(i);
        }

        @Deprecated
        public static void onAlarmAdd(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAlarm alarm) {
            Intrinsics.X0O(alarm, "alarm");
            BleHandleCallback.super.onAlarmAdd(alarm);
        }

        @Deprecated
        public static void onAlarmDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onAlarmDelete(i);
        }

        @Deprecated
        public static void onAlarmUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAlarm alarm) {
            Intrinsics.X0O(alarm, "alarm");
            BleHandleCallback.super.onAlarmUpdate(alarm);
        }

        @Deprecated
        public static void onAppOpUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAppOp appOp) {
            Intrinsics.X0O(appOp, "appOp");
            BleHandleCallback.super.onAppOpUpdate(appOp);
        }

        @Deprecated
        public static void onAppSportDataResponse(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onAppSportDataResponse(z);
        }

        @Deprecated
        public static void onBWNaviInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBWNaviInfo naviInfo) {
            Intrinsics.X0O(naviInfo, "naviInfo");
            BleHandleCallback.super.onBWNaviInfoUpdate(naviInfo);
        }

        @Deprecated
        public static void onBacklightUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onBacklightUpdate(i);
        }

        @Deprecated
        public static void onBandKeyUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBandKey key) {
            Intrinsics.X0O(key, "key");
            BleHandleCallback.super.onBandKeyUpdate(key);
        }

        @Deprecated
        public static void onBleGolfScore(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfScore info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onBleGolfScore(info);
        }

        @Deprecated
        public static void onBleThirdPartyDataUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleThirdPartyData thirdPartyData) {
            Intrinsics.X0O(thirdPartyData, "thirdPartyData");
            BleHandleCallback.super.onBleThirdPartyDataUpdate(thirdPartyData);
        }

        @Deprecated
        public static void onBleVideoCallInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleVideoCallInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onBleVideoCallInfo(info);
        }

        @Deprecated
        public static void onCPChatUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPChat chat) {
            Intrinsics.X0O(chat, "chat");
            BleHandleCallback.super.onCPChatUpdate(chat);
        }

        @Deprecated
        public static void onCPGiftsInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPGiftsInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onCPGiftsInfoUpdate(info);
        }

        @Deprecated
        public static void onCPListenerUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPListener listener) {
            Intrinsics.X0O(listener, "listener");
            BleHandleCallback.super.onCPListenerUpdate(listener);
        }

        @Deprecated
        public static void onCPMissYouUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPMissYou you) {
            Intrinsics.X0O(you, "you");
            BleHandleCallback.super.onCPMissYouUpdate(you);
        }

        @Deprecated
        public static void onCPTodoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPTodo todo) {
            Intrinsics.X0O(todo, "todo");
            BleHandleCallback.super.onCPTodoUpdate(todo);
        }

        @Deprecated
        public static void onCaloriesGoalUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onCaloriesGoalUpdate(i);
        }

        @Deprecated
        public static void onCameraResponse(@aa1 BleHandleCallback bleHandleCallback, boolean z, int i) {
            BleHandleCallback.super.onCameraResponse(z, i);
        }

        @Deprecated
        public static void onCameraStateChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onCameraStateChange(i);
        }

        @Deprecated
        public static void onChatAppUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleChatApp app) {
            Intrinsics.X0O(app, "app");
            BleHandleCallback.super.onChatAppUpdate(app);
        }

        @Deprecated
        public static void onChatMessageUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleChatMessage message) {
            Intrinsics.X0O(message, "message");
            BleHandleCallback.super.onChatMessageUpdate(message);
        }

        @Deprecated
        public static void onChatVoiceUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleChatVoice voice) {
            Intrinsics.X0O(voice, "voice");
            BleHandleCallback.super.onChatVoiceUpdate(voice);
        }

        @Deprecated
        public static void onCheckInEveryDayUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCheckInEveryDay everyDay) {
            Intrinsics.X0O(everyDay, "everyDay");
            BleHandleCallback.super.onCheckInEveryDayUpdate(everyDay);
        }

        @Deprecated
        public static void onClassicBluetoothStateChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onClassicBluetoothStateChange(i);
        }

        @Deprecated
        public static void onCommandReply(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, boolean z) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            BleHandleCallback.super.onCommandReply(bleKey, bleKeyFlag, z);
        }

        @Deprecated
        public static void onCommandSendTimeout(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            BleHandleCallback.super.onCommandSendTimeout(bleKey, bleKeyFlag);
        }

        @Deprecated
        public static void onContactUsStateChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onContactUsStateChange(i);
        }

        @Deprecated
        public static void onDeleteAICoachPlan(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onDeleteAICoachPlan();
        }

        @Deprecated
        public static void onDeleteFileResponse(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onDeleteFileResponse(i);
        }

        @Deprecated
        public static void onDeviceConnected(@aa1 BleHandleCallback bleHandleCallback, @aa1 BluetoothDevice device) {
            Intrinsics.X0O(device, "device");
            BleHandleCallback.super.onDeviceConnected(device);
        }

        @Deprecated
        public static void onDeviceConnecting(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onDeviceConnecting(z);
        }

        @Deprecated
        public static void onDeviceFileUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceFile deviceFile) {
            Intrinsics.X0O(deviceFile, "deviceFile");
            BleHandleCallback.super.onDeviceFileUpdate(deviceFile);
        }

        @Deprecated
        public static void onDeviceOpUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onDeviceOpUpdate(i);
        }

        @Deprecated
        public static void onDeviceRequestAGpsFile(@aa1 BleHandleCallback bleHandleCallback, @aa1 String url) {
            Intrinsics.X0O(url, "url");
            BleHandleCallback.super.onDeviceRequestAGpsFile(url);
        }

        @Deprecated
        public static void onDeviceSMSQuickReply(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSMSQuickReply smsQuickReply) {
            Intrinsics.X0O(smsQuickReply, "smsQuickReply");
            BleHandleCallback.super.onDeviceSMSQuickReply(smsQuickReply);
        }

        @Deprecated
        public static void onDeviceSportDataUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceSportData deviceSportData) {
            Intrinsics.X0O(deviceSportData, "deviceSportData");
            BleHandleCallback.super.onDeviceSportDataUpdate(deviceSportData);
        }

        @Deprecated
        public static void onDistanceGoalUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onDistanceGoalUpdate(i);
        }

        @Deprecated
        public static void onDoubleScreenSettingsUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDoubleScreenSettings doubleScreenSettings) {
            Intrinsics.X0O(doubleScreenSettings, "doubleScreenSettings");
            BleHandleCallback.super.onDoubleScreenSettingsUpdate(doubleScreenSettings);
        }

        @Deprecated
        public static void onDrinkWaterUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDrinkWaterSettings settings) {
            Intrinsics.X0O(settings, "settings");
            BleHandleCallback.super.onDrinkWaterUpdate(settings);
        }

        @Deprecated
        public static void onEarphoneAncSettingsUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneAncSettings earphoneAncSettings) {
            Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
            BleHandleCallback.super.onEarphoneAncSettingsUpdate(earphoneAncSettings);
        }

        @Deprecated
        public static void onEarphoneCallUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onEarphoneCallUpdate(i);
        }

        @Deprecated
        public static void onEarphoneKeyUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneKey earphoneKey) {
            Intrinsics.X0O(earphoneKey, "earphoneKey");
            BleHandleCallback.super.onEarphoneKeyUpdate(earphoneKey);
        }

        @Deprecated
        public static void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneSoundEffectsSettings earphoneSoundEffectsSettings) {
            Intrinsics.X0O(earphoneSoundEffectsSettings, "earphoneSoundEffectsSettings");
            BleHandleCallback.super.onEarphoneSoundEffectsSettingsUpdate(earphoneSoundEffectsSettings);
        }

        @Deprecated
        public static void onEarphoneStateUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneState earphoneState) {
            Intrinsics.X0O(earphoneState, "earphoneState");
            BleHandleCallback.super.onEarphoneStateUpdate(earphoneState);
        }

        @Deprecated
        public static void onFactoryTestUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleFactoryTest factoryTest) {
            Intrinsics.X0O(factoryTest, "factoryTest");
            BleHandleCallback.super.onFactoryTestUpdate(factoryTest);
        }

        @Deprecated
        public static void onFallSetUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onFallSetUpdate(i);
        }

        @Deprecated
        public static void onFindEarphoneUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleFindEarphone findEarphone) {
            Intrinsics.X0O(findEarphone, "findEarphone");
            BleHandleCallback.super.onFindEarphoneUpdate(findEarphone);
        }

        @Deprecated
        public static void onFindPhone(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onFindPhone(z);
        }

        @Deprecated
        public static void onFindWatchUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onFindWatchUpdate(i);
        }

        @Deprecated
        public static void onFollowSystemDateFormat(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onFollowSystemDateFormat();
        }

        @Deprecated
        public static void onFollowSystemHour(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onFollowSystemHour();
        }

        @Deprecated
        public static void onFollowSystemLanguage(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onFollowSystemLanguage(z);
        }

        @Deprecated
        public static void onGameControlUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGameControl gameControl) {
            Intrinsics.X0O(gameControl, "gameControl");
            BleHandleCallback.super.onGameControlUpdate(gameControl);
        }

        @Deprecated
        public static void onGestureWake2Update(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGestureWake2 gestureWake2) {
            Intrinsics.X0O(gestureWake2, "gestureWake2");
            BleHandleCallback.super.onGestureWake2Update(gestureWake2);
        }

        @Deprecated
        public static void onGestureWakeUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGestureWake gestureWake) {
            Intrinsics.X0O(gestureWake, "gestureWake");
            BleHandleCallback.super.onGestureWakeUpdate(gestureWake);
        }

        @Deprecated
        public static void onGoogleNaviInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGoogleNaviInfo naviInfo) {
            Intrinsics.X0O(naviInfo, "naviInfo");
            BleHandleCallback.super.onGoogleNaviInfoUpdate(naviInfo);
        }

        @Deprecated
        public static void onHIDState(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onHIDState(i);
        }

        @Deprecated
        public static void onHIDValueChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onHIDValueChange(i);
        }

        @Deprecated
        public static void onHRWarningSet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHrWarningSettings set) {
            Intrinsics.X0O(set, "set");
            BleHandleCallback.super.onHRWarningSet(set);
        }

        @Deprecated
        public static void onHanBaoVibrationStateChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onHanBaoVibrationStateChange(i);
        }

        @Deprecated
        public static void onHighAntiAssistChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onHighAntiAssistChange(i);
        }

        @Deprecated
        public static void onHourSystemUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onHourSystemUpdate(i);
        }

        @Deprecated
        public static void onHydrationUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHydrationSettings settings) {
            Intrinsics.X0O(settings, "settings");
            BleHandleCallback.super.onHydrationUpdate(settings);
        }

        @Deprecated
        public static void onIPCExceptionUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCException exception) {
            Intrinsics.X0O(exception, "exception");
            BleHandleCallback.super.onIPCExceptionUpdate(exception);
        }

        @Deprecated
        public static void onIPCOTAStateUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCOTAState state) {
            Intrinsics.X0O(state, "state");
            BleHandleCallback.super.onIPCOTAStateUpdate(state);
        }

        @Deprecated
        public static void onIPCStateUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCState state) {
            Intrinsics.X0O(state, "state");
            BleHandleCallback.super.onIPCStateUpdate(state);
        }

        @Deprecated
        public static void onIPCStoresInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCStoresInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onIPCStoresInfoUpdate(info);
        }

        @Deprecated
        public static void onIPCWifiInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCWifiInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onIPCWifiInfoUpdate(info);
        }

        @Deprecated
        public static void onIdentityCreate(@aa1 BleHandleCallback bleHandleCallback, boolean z, @tb1 BleDeviceInfo bleDeviceInfo) {
            BleHandleCallback.super.onIdentityCreate(z, bleDeviceInfo);
        }

        @Deprecated
        public static void onIdentityDelete(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onIdentityDelete(z);
        }

        @Deprecated
        public static void onIdentityDeleteByDevice(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onIdentityDeleteByDevice(z);
        }

        @Deprecated
        public static void onIncomingCallRingUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onIncomingCallRingUpdate(i);
        }

        @Deprecated
        public static void onIncomingCallStatus(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onIncomingCallStatus(i);
        }

        @Deprecated
        public static void onLoveTapUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleLoveTap loveTap) {
            Intrinsics.X0O(loveTap, "loveTap");
            BleHandleCallback.super.onLoveTapUpdate(loveTap);
        }

        @Deprecated
        public static void onLoveTapUserDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onLoveTapUserDelete(i);
        }

        @Deprecated
        public static void onLoveTapUserUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleLoveTapUser loveTapUser) {
            Intrinsics.X0O(loveTapUser, "loveTapUser");
            BleHandleCallback.super.onLoveTapUserUpdate(loveTapUser);
        }

        @Deprecated
        public static void onMeasurementUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMeasurement measurement) {
            Intrinsics.X0O(measurement, "measurement");
            BleHandleCallback.super.onMeasurementUpdate(measurement);
        }

        @Deprecated
        public static void onMedicationAlarmAdd(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMedicationAlarm medicationAlarm) {
            Intrinsics.X0O(medicationAlarm, "medicationAlarm");
            BleHandleCallback.super.onMedicationAlarmAdd(medicationAlarm);
        }

        @Deprecated
        public static void onMedicationAlarmDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onMedicationAlarmDelete(i);
        }

        @Deprecated
        public static void onMedicationAlarmUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMedicationAlarm medicationAlarm) {
            Intrinsics.X0O(medicationAlarm, "medicationAlarm");
            BleHandleCallback.super.onMedicationAlarmUpdate(medicationAlarm);
        }

        @Deprecated
        public static void onMedicationReminderDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onMedicationReminderDelete(i);
        }

        @Deprecated
        public static void onMedicationReminderUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMedicationReminder medicationReminder) {
            Intrinsics.X0O(medicationReminder, "medicationReminder");
            BleHandleCallback.super.onMedicationReminderUpdate(medicationReminder);
        }

        @Deprecated
        public static void onMeetingReminderAdd(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMeetingReminder meetingReminder) {
            Intrinsics.X0O(meetingReminder, "meetingReminder");
            BleHandleCallback.super.onMeetingReminderAdd(meetingReminder);
        }

        @Deprecated
        public static void onMeetingReminderDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onMeetingReminderDelete(i);
        }

        @Deprecated
        public static void onMeetingReminderUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMeetingReminder meetingReminder) {
            Intrinsics.X0O(meetingReminder, "meetingReminder");
            BleHandleCallback.super.onMeetingReminderUpdate(meetingReminder);
        }

        @Deprecated
        public static void onMultiFileTransferReadFile(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onMultiFileTransferReadFile(i);
        }

        @Deprecated
        public static void onMultiFileTransferResponse(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onMultiFileTransferResponse(i);
        }

        @Deprecated
        public static void onNaviInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleNaviInfo naviInfo) {
            Intrinsics.X0O(naviInfo, "naviInfo");
            BleHandleCallback.super.onNaviInfoUpdate(naviInfo);
        }

        @Deprecated
        public static void onNoDisturbUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleNoDisturbSettings noDisturbSettings) {
            Intrinsics.X0O(noDisturbSettings, "noDisturbSettings");
            BleHandleCallback.super.onNoDisturbUpdate(noDisturbSettings);
        }

        @Deprecated
        public static void onNotificationLightScreenSetUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onNotificationLightScreenSetUpdate(i);
        }

        @Deprecated
        public static void onNotificationSettings2Update(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleNotificationSettings2 notificationSettings2) {
            Intrinsics.X0O(notificationSettings2, "notificationSettings2");
            BleHandleCallback.super.onNotificationSettings2Update(notificationSettings2);
        }

        @Deprecated
        public static void onOTA(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onOTA(z);
        }

        @Deprecated
        public static void onPowerSaveModeState(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onPowerSaveModeState(i);
        }

        @Deprecated
        public static void onPowerSaveModeStateChange(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onPowerSaveModeStateChange(i);
        }

        @Deprecated
        public static void onQiblaSettingsUpdate(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onQiblaSettingsUpdate();
        }

        @Deprecated
        public static void onReadAICoachGenerateBeforeInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICoachBeforePlan info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadAICoachGenerateBeforeInfo(info);
        }

        @Deprecated
        public static void onReadAICoachGenerateBeforeInfoV2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICoachBeforePlanV2 info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadAICoachGenerateBeforeInfoV2(info);
        }

        @Deprecated
        public static void onReadAICoachPlan(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICoachGeneratePlan plan) {
            Intrinsics.X0O(plan, "plan");
            BleHandleCallback.super.onReadAICoachPlan(plan);
        }

        @Deprecated
        public static void onReadAICoachPlanV2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICoachGeneratePlanV2 plan) {
            Intrinsics.X0O(plan, "plan");
            BleHandleCallback.super.onReadAICoachPlanV2(plan);
        }

        @Deprecated
        public static void onReadActivity(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleActivity> activities) {
            Intrinsics.X0O(activities, "activities");
            BleHandleCallback.super.onReadActivity(activities);
        }

        @Deprecated
        public static void onReadActivityDetail(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleActivityDetail activityDetail) {
            Intrinsics.X0O(activityDetail, "activityDetail");
            BleHandleCallback.super.onReadActivityDetail(activityDetail);
        }

        @Deprecated
        public static void onReadAddressBook(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAddressBook info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadAddressBook(info);
        }

        @Deprecated
        public static void onReadAlarm(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleAlarm> alarms) {
            Intrinsics.X0O(alarms, "alarms");
            BleHandleCallback.super.onReadAlarm(alarms);
        }

        @Deprecated
        public static void onReadAlipayBindInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleAlipayBindInfo> alipayBindInfos) {
            Intrinsics.X0O(alipayBindInfos, "alipayBindInfos");
            BleHandleCallback.super.onReadAlipayBindInfo(alipayBindInfos);
        }

        @Deprecated
        public static void onReadAlipaySettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAlipaySettings alipaySettings) {
            Intrinsics.X0O(alipaySettings, "alipaySettings");
            BleHandleCallback.super.onReadAlipaySettings(alipaySettings);
        }

        @Deprecated
        public static void onReadAppApiVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadAppApiVersion(version);
        }

        @Deprecated
        public static void onReadAppInfoList(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAppInfoList appInfoList) {
            Intrinsics.X0O(appInfoList, "appInfoList");
            BleHandleCallback.super.onReadAppInfoList(appInfoList);
        }

        @Deprecated
        public static void onReadAppSportState(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAppSportState appSportState) {
            Intrinsics.X0O(appSportState, "appSportState");
            BleHandleCallback.super.onReadAppSportState(appSportState);
        }

        @Deprecated
        public static void onReadAvgHeartRate(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleAvgHeartRate> heartRates) {
            Intrinsics.X0O(heartRates, "heartRates");
            BleHandleCallback.super.onReadAvgHeartRate(heartRates);
        }

        @Deprecated
        public static void onReadBAC(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleBAC> bacs) {
            Intrinsics.X0O(bacs, "bacs");
            BleHandleCallback.super.onReadBAC(bacs);
        }

        @Deprecated
        public static void onReadBacCalibration(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBacCalibration bac, @aa1 BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bac, "bac");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            BleHandleCallback.super.onReadBacCalibration(bac, bleKeyFlag);
        }

        @Deprecated
        public static void onReadBacklight(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadBacklight(i);
        }

        @Deprecated
        public static void onReadBatteryUsage(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBatteryUsage batteryUsage) {
            Intrinsics.X0O(batteryUsage, "batteryUsage");
            BleHandleCallback.super.onReadBatteryUsage(batteryUsage);
        }

        @Deprecated
        public static void onReadBleAddress(@aa1 BleHandleCallback bleHandleCallback, @aa1 String address) {
            Intrinsics.X0O(address, "address");
            BleHandleCallback.super.onReadBleAddress(address);
        }

        @Deprecated
        public static void onReadBleGolfMapCacheInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfMapCacheInfo bleGolfMapCacheInfo) {
            Intrinsics.X0O(bleGolfMapCacheInfo, "bleGolfMapCacheInfo");
            BleHandleCallback.super.onReadBleGolfMapCacheInfo(bleGolfMapCacheInfo);
        }

        @Deprecated
        public static void onReadBleGolfSportSwitch(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfSportSwitch bleGolfSportSwitch) {
            Intrinsics.X0O(bleGolfSportSwitch, "bleGolfSportSwitch");
            BleHandleCallback.super.onReadBleGolfSportSwitch(bleGolfSportSwitch);
        }

        @Deprecated
        public static void onReadBleGolfWatchMapInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfWatchMapInfo bleGolfWatchMapInfo) {
            Intrinsics.X0O(bleGolfWatchMapInfo, "bleGolfWatchMapInfo");
            BleHandleCallback.super.onReadBleGolfWatchMapInfo(bleGolfWatchMapInfo);
        }

        @Deprecated
        public static void onReadBleGolfWatchVersionInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
            Intrinsics.X0O(bleGolfWatchVersionInfo, "bleGolfWatchVersionInfo");
            BleHandleCallback.super.onReadBleGolfWatchVersionInfo(bleGolfWatchVersionInfo);
        }

        @Deprecated
        public static void onReadBleHrv(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleHrv> hrv) {
            Intrinsics.X0O(hrv, "hrv");
            BleHandleCallback.super.onReadBleHrv(hrv);
        }

        @Deprecated
        public static void onReadBleLogText(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleLogText> logs) {
            Intrinsics.X0O(logs, "logs");
            BleHandleCallback.super.onReadBleLogText(logs);
        }

        @Deprecated
        public static void onReadBloodGlucose(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleBloodGlucose> bloodGlucoses) {
            Intrinsics.X0O(bloodGlucoses, "bloodGlucoses");
            BleHandleCallback.super.onReadBloodGlucose(bloodGlucoses);
        }

        @Deprecated
        public static void onReadBloodOxyGenSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBloodOxyGenSettings bloodOxyGenSettings) {
            Intrinsics.X0O(bloodOxyGenSettings, "bloodOxyGenSettings");
            BleHandleCallback.super.onReadBloodOxyGenSettings(bloodOxyGenSettings);
        }

        @Deprecated
        public static void onReadBloodOxygen(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleBloodOxygen> bloodOxygen) {
            Intrinsics.X0O(bloodOxygen, "bloodOxygen");
            BleHandleCallback.super.onReadBloodOxygen(bloodOxygen);
        }

        @Deprecated
        public static void onReadBloodPressure(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleBloodPressure> bloodPressures) {
            Intrinsics.X0O(bloodPressures, "bloodPressures");
            BleHandleCallback.super.onReadBloodPressure(bloodPressures);
        }

        @Deprecated
        public static void onReadBloodPressureCalibration(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBloodPressureCalibration bloodPressureCalibration) {
            Intrinsics.X0O(bloodPressureCalibration, "bloodPressureCalibration");
            BleHandleCallback.super.onReadBloodPressureCalibration(bloodPressureCalibration);
        }

        @Deprecated
        public static void onReadBodyStatus(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleBodyStatus> bodyData) {
            Intrinsics.X0O(bodyData, "bodyData");
            BleHandleCallback.super.onReadBodyStatus(bodyData);
        }

        @Deprecated
        public static void onReadCPUserInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCPUserInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadCPUserInfo(info);
        }

        @Deprecated
        public static void onReadCalibrationData(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCalibrationData calibrationData) {
            Intrinsics.X0O(calibrationData, "calibrationData");
            BleHandleCallback.super.onReadCalibrationData(calibrationData);
        }

        @Deprecated
        public static void onReadCalorieIntake(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleCalorieIntake> calorieIntakes) {
            Intrinsics.X0O(calorieIntakes, "calorieIntakes");
            BleHandleCallback.super.onReadCalorieIntake(calorieIntakes);
        }

        @Deprecated
        public static void onReadCaloriesGoal(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadCaloriesGoal(i);
        }

        @Deprecated
        public static void onReadChatApp(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleChatApp app) {
            Intrinsics.X0O(app, "app");
            BleHandleCallback.super.onReadChatApp(app);
        }

        @Deprecated
        public static void onReadCheckInEveryDay(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCheckInEveryDay everyDay) {
            Intrinsics.X0O(everyDay, "everyDay");
            BleHandleCallback.super.onReadCheckInEveryDay(everyDay);
        }

        @Deprecated
        public static void onReadClassicBluetoothState(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadClassicBluetoothState(i);
        }

        @Deprecated
        public static void onReadCoachingIds(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCoachingIds bleCoachingIds) {
            Intrinsics.X0O(bleCoachingIds, "bleCoachingIds");
            BleHandleCallback.super.onReadCoachingIds(bleCoachingIds);
        }

        @Deprecated
        public static void onReadCyWeeAlgorithm(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleCyWeeAlgorithm bleCyWeeAlgorithm) {
            Intrinsics.X0O(bleCyWeeAlgorithm, "bleCyWeeAlgorithm");
            BleHandleCallback.super.onReadCyWeeAlgorithm(bleCyWeeAlgorithm);
        }

        @Deprecated
        public static void onReadDailyPower(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BlePhysicalPower> powers) {
            Intrinsics.X0O(powers, "powers");
            BleHandleCallback.super.onReadDailyPower(powers);
        }

        @Deprecated
        public static void onReadDateFormat(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadDateFormat(i);
        }

        @Deprecated
        public static void onReadDeviceFile(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceFile deviceFile) {
            Intrinsics.X0O(deviceFile, "deviceFile");
            BleHandleCallback.super.onReadDeviceFile(deviceFile);
        }

        @Deprecated
        public static void onReadDeviceFileV2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceFile2 deviceFile) {
            Intrinsics.X0O(deviceFile, "deviceFile");
            BleHandleCallback.super.onReadDeviceFileV2(deviceFile);
        }

        @Deprecated
        public static void onReadDeviceInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceInfo deviceInfo) {
            Intrinsics.X0O(deviceInfo, "deviceInfo");
            BleHandleCallback.super.onReadDeviceInfo(deviceInfo);
        }

        @Deprecated
        public static void onReadDeviceInfo2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceInfo2 deviceInfo) {
            Intrinsics.X0O(deviceInfo, "deviceInfo");
            BleHandleCallback.super.onReadDeviceInfo2(deviceInfo);
        }

        @Deprecated
        public static void onReadDeviceLanguages(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceLanguages deviceLanguages) {
            Intrinsics.X0O(deviceLanguages, "deviceLanguages");
            BleHandleCallback.super.onReadDeviceLanguages(deviceLanguages);
        }

        @Deprecated
        public static void onReadDeviceLanguages2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceLanguages2 deviceLanguages) {
            Intrinsics.X0O(deviceLanguages, "deviceLanguages");
            BleHandleCallback.super.onReadDeviceLanguages2(deviceLanguages);
        }

        @Deprecated
        public static void onReadDeviceUniqueDataSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDeviceUniqueDataSettings deviceUniqueDataSettings) {
            Intrinsics.X0O(deviceUniqueDataSettings, "deviceUniqueDataSettings");
            BleHandleCallback.super.onReadDeviceUniqueDataSettings(deviceUniqueDataSettings);
        }

        @Deprecated
        public static void onReadDistanceGoal(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadDistanceGoal(i);
        }

        @Deprecated
        public static void onReadDoubleScreenSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDoubleScreenSettings doubleScreenSettings) {
            Intrinsics.X0O(doubleScreenSettings, "doubleScreenSettings");
            BleHandleCallback.super.onReadDoubleScreenSettings(doubleScreenSettings);
        }

        @Deprecated
        public static void onReadDrinkWater(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleDrinkWaterSettings drinkWaterSettings) {
            Intrinsics.X0O(drinkWaterSettings, "drinkWaterSettings");
            BleHandleCallback.super.onReadDrinkWater(drinkWaterSettings);
        }

        @Deprecated
        public static void onReadECGRealtime(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleECGRealtime ecgRealtime) {
            Intrinsics.X0O(ecgRealtime, "ecgRealtime");
            BleHandleCallback.super.onReadECGRealtime(ecgRealtime);
        }

        @Deprecated
        public static void onReadEarphoneAncSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneAncSettings earphoneAncSettings) {
            Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
            BleHandleCallback.super.onReadEarphoneAncSettings(earphoneAncSettings);
        }

        @Deprecated
        public static void onReadEarphoneCall(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadEarphoneCall(i);
        }

        @Deprecated
        public static void onReadEarphoneInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneInfo earphoneInfo) {
            Intrinsics.X0O(earphoneInfo, "earphoneInfo");
            BleHandleCallback.super.onReadEarphoneInfo(earphoneInfo);
        }

        @Deprecated
        public static void onReadEarphoneKey(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneKey earphoneKey) {
            Intrinsics.X0O(earphoneKey, "earphoneKey");
            BleHandleCallback.super.onReadEarphoneKey(earphoneKey);
        }

        @Deprecated
        public static void onReadEarphonePower(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphonePower earphonePower) {
            Intrinsics.X0O(earphonePower, "earphonePower");
            BleHandleCallback.super.onReadEarphonePower(earphonePower);
        }

        @Deprecated
        public static void onReadEarphoneSoundEffectsSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneSoundEffectsSettings earphoneSoundEffectsSettings) {
            Intrinsics.X0O(earphoneSoundEffectsSettings, "earphoneSoundEffectsSettings");
            BleHandleCallback.super.onReadEarphoneSoundEffectsSettings(earphoneSoundEffectsSettings);
        }

        @Deprecated
        public static void onReadEarphoneState(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEarphoneState earphoneState) {
            Intrinsics.X0O(earphoneState, "earphoneState");
            BleHandleCallback.super.onReadEarphoneState(earphoneState);
        }

        @Deprecated
        public static void onReadEcg(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleEcg> ecgs) {
            Intrinsics.X0O(ecgs, "ecgs");
            BleHandleCallback.super.onReadEcg(ecgs);
        }

        @Deprecated
        public static void onReadEcgSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleEcgSettings ecgSettings) {
            Intrinsics.X0O(ecgSettings, "ecgSettings");
            BleHandleCallback.super.onReadEcgSettings(ecgSettings);
        }

        @Deprecated
        public static void onReadEnergyRating(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleEnergyRating> energyRating) {
            Intrinsics.X0O(energyRating, "energyRating");
            BleHandleCallback.super.onReadEnergyRating(energyRating);
        }

        @Deprecated
        public static void onReadFallSet(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadFallSet(i);
        }

        @Deprecated
        public static void onReadFilePath(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAppAudioBookList filePath) {
            Intrinsics.X0O(filePath, "filePath");
            BleHandleCallback.super.onReadFilePath(filePath);
        }

        @Deprecated
        public static void onReadFirmwareVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadFirmwareVersion(version);
        }

        @Deprecated
        public static void onReadFoodBalance(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleFoodBalance> foodBalances) {
            Intrinsics.X0O(foodBalances, "foodBalances");
            BleHandleCallback.super.onReadFoodBalance(foodBalances);
        }

        @Deprecated
        public static void onReadGestureWake(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGestureWake gestureWake) {
            Intrinsics.X0O(gestureWake, "gestureWake");
            BleHandleCallback.super.onReadGestureWake(gestureWake);
        }

        @Deprecated
        public static void onReadGestureWake2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGestureWake2 gestureWake2) {
            Intrinsics.X0O(gestureWake2, "gestureWake2");
            BleHandleCallback.super.onReadGestureWake2(gestureWake2);
        }

        @Deprecated
        public static void onReadGirlCareMonthly(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGirlCareMonthly girlCareMonthly) {
            Intrinsics.X0O(girlCareMonthly, "girlCareMonthly");
            BleHandleCallback.super.onReadGirlCareMonthly(girlCareMonthly);
        }

        @Deprecated
        public static void onReadGirlCareSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGirlCareSettings girlCareSettings) {
            Intrinsics.X0O(girlCareSettings, "girlCareSettings");
            BleHandleCallback.super.onReadGirlCareSettings(girlCareSettings);
        }

        @Deprecated
        public static void onReadGoMoreSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGoMoreSettings goMoreSettings) {
            Intrinsics.X0O(goMoreSettings, "goMoreSettings");
            BleHandleCallback.super.onReadGoMoreSettings(goMoreSettings);
        }

        @Deprecated
        public static void onReadGolfWatchScore(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleGolfWatchScore watchScore) {
            Intrinsics.X0O(watchScore, "watchScore");
            BleHandleCallback.super.onReadGolfWatchScore(watchScore);
        }

        @Deprecated
        public static void onReadGpsFirmwareVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadGpsFirmwareVersion(version);
        }

        @Deprecated
        public static void onReadHanBaoSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHanBaoSettings hanBaoSettings) {
            Intrinsics.X0O(hanBaoSettings, "hanBaoSettings");
            BleHandleCallback.super.onReadHanBaoSettings(hanBaoSettings);
        }

        @Deprecated
        public static void onReadHanBaoVibration(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleHanBaoVibration> hanBaoVibrations) {
            Intrinsics.X0O(hanBaoVibrations, "hanBaoVibrations");
            BleHandleCallback.super.onReadHanBaoVibration(hanBaoVibrations);
        }

        @Deprecated
        public static void onReadHeartRate(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleHeartRate> heartRates) {
            Intrinsics.X0O(heartRates, "heartRates");
            BleHandleCallback.super.onReadHeartRate(heartRates);
        }

        @Deprecated
        public static void onReadHeartRateZones(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHeartRateZones bmp) {
            Intrinsics.X0O(bmp, "bmp");
            BleHandleCallback.super.onReadHeartRateZones(bmp);
        }

        @Deprecated
        public static void onReadHourSystem(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadHourSystem(i);
        }

        @Deprecated
        public static void onReadHrMonitoringSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHrMonitoringSettings hrMonitoringSettings) {
            Intrinsics.X0O(hrMonitoringSettings, "hrMonitoringSettings");
            BleHandleCallback.super.onReadHrMonitoringSettings(hrMonitoringSettings);
        }

        @Deprecated
        public static void onReadHrMonitoringSettingsV2(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadHrMonitoringSettingsV2(i);
        }

        @Deprecated
        public static void onReadHrvBaseLine(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHrvBaseLine mBleHrvBaseLine) {
            Intrinsics.X0O(mBleHrvBaseLine, "mBleHrvBaseLine");
            BleHandleCallback.super.onReadHrvBaseLine(mBleHrvBaseLine);
        }

        @Deprecated
        public static void onReadHrvMonitoringSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHrvMonitoringSettings hrvMonitoringSettings) {
            Intrinsics.X0O(hrvMonitoringSettings, "hrvMonitoringSettings");
            BleHandleCallback.super.onReadHrvMonitoringSettings(hrvMonitoringSettings);
        }

        @Deprecated
        public static void onReadHydrationSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHydrationSettings hydrationSettings) {
            Intrinsics.X0O(hydrationSettings, "hydrationSettings");
            BleHandleCallback.super.onReadHydrationSettings(hydrationSettings);
        }

        @Deprecated
        public static void onReadIPCInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadIPCInfo(info);
        }

        @Deprecated
        public static void onReadIPCState(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCState state) {
            Intrinsics.X0O(state, "state");
            BleHandleCallback.super.onReadIPCState(state);
        }

        @Deprecated
        public static void onReadIPCStoresInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleIPCStoresInfo info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadIPCStoresInfo(info);
        }

        @Deprecated
        public static void onReadIPCVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadIPCVersion(version);
        }

        @Deprecated
        public static void onReadIncomingCallRing(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadIncomingCallRing(i);
        }

        @Deprecated
        public static void onReadLactateThreshold(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleLactateThreshold> lactateThreshold) {
            Intrinsics.X0O(lactateThreshold, "lactateThreshold");
            BleHandleCallback.super.onReadLactateThreshold(lactateThreshold);
        }

        @Deprecated
        public static void onReadLanguage(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadLanguage(i);
        }

        @Deprecated
        public static void onReadLanguagePackVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleLanguagePackVersion version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadLanguagePackVersion(version);
        }

        @Deprecated
        public static void onReadLocation(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleLocation> locations) {
            Intrinsics.X0O(locations, "locations");
            BleHandleCallback.super.onReadLocation(locations);
        }

        @Deprecated
        public static void onReadLoveTapUser(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleLoveTapUser> loveTapUsers) {
            Intrinsics.X0O(loveTapUsers, "loveTapUsers");
            BleHandleCallback.super.onReadLoveTapUser(loveTapUsers);
        }

        @Deprecated
        public static void onReadMatchRecord(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMatchRecord> matchRecords) {
            Intrinsics.X0O(matchRecords, "matchRecords");
            BleHandleCallback.super.onReadMatchRecord(matchRecords);
        }

        @Deprecated
        public static void onReadMatchRecord2(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMatchRecord2> matchRecords) {
            Intrinsics.X0O(matchRecords, "matchRecords");
            BleHandleCallback.super.onReadMatchRecord2(matchRecords);
        }

        @Deprecated
        public static void onReadMatchRecord3(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMatchRecord3> matchRecords) {
            Intrinsics.X0O(matchRecords, "matchRecords");
            BleHandleCallback.super.onReadMatchRecord3(matchRecords);
        }

        @Deprecated
        public static void onReadMedicationAlarm(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMedicationAlarm> medicationAlarm) {
            Intrinsics.X0O(medicationAlarm, "medicationAlarm");
            BleHandleCallback.super.onReadMedicationAlarm(medicationAlarm);
        }

        @Deprecated
        public static void onReadMedicationReminder(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMedicationReminder> medicationReminders) {
            Intrinsics.X0O(medicationReminders, "medicationReminders");
            BleHandleCallback.super.onReadMedicationReminder(medicationReminders);
        }

        @Deprecated
        public static void onReadMeetingReminder(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMeetingReminder> meetingReminders) {
            Intrinsics.X0O(meetingReminders, "meetingReminders");
            BleHandleCallback.super.onReadMeetingReminder(meetingReminders);
        }

        @Deprecated
        public static void onReadMindStatus(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleMindStatus> feelingData) {
            Intrinsics.X0O(feelingData, "feelingData");
            BleHandleCallback.super.onReadMindStatus(feelingData);
        }

        @Deprecated
        public static void onReadMtkOtaMeta(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onReadMtkOtaMeta();
        }

        @Deprecated
        public static void onReadMultiFileTransfer(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleMapFileList info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onReadMultiFileTransfer(info);
        }

        @Deprecated
        public static void onReadNetworkFirmwareVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadNetworkFirmwareVersion(version);
        }

        @Deprecated
        public static void onReadNoDisturb(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleNoDisturbSettings noDisturbSettings) {
            Intrinsics.X0O(noDisturbSettings, "noDisturbSettings");
            BleHandleCallback.super.onReadNoDisturb(noDisturbSettings);
        }

        @Deprecated
        public static void onReadNotificationLightScreenSet(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadNotificationLightScreenSet(i);
        }

        @Deprecated
        public static void onReadNotificationSettings2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleNotificationSettings2 notificationSettings2) {
            Intrinsics.X0O(notificationSettings2, "notificationSettings2");
            BleHandleCallback.super.onReadNotificationSettings2(notificationSettings2);
        }

        @Deprecated
        public static void onReadOfflineAsrSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleOfflineAsrSettings settings) {
            Intrinsics.X0O(settings, "settings");
            BleHandleCallback.super.onReadOfflineAsrSettings(settings);
        }

        @Deprecated
        public static void onReadOngoingDialogue(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadOngoingDialogue(i);
        }

        @Deprecated
        public static void onReadOptionalMapAuthInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleOptionalMapAuthInfo optionalMapAuthInfo) {
            Intrinsics.X0O(optionalMapAuthInfo, "optionalMapAuthInfo");
            BleHandleCallback.super.onReadOptionalMapAuthInfo(optionalMapAuthInfo);
        }

        @Deprecated
        public static void onReadPackageStatus(@aa1 BleHandleCallback bleHandleCallback, @aa1 BlePackageStatus packageStatus) {
            Intrinsics.X0O(packageStatus, "packageStatus");
            BleHandleCallback.super.onReadPackageStatus(packageStatus);
        }

        @Deprecated
        public static void onReadPower(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadPower(i);
        }

        @Deprecated
        public static void onReadPower2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BlePower2 power) {
            Intrinsics.X0O(power, "power");
            BleHandleCallback.super.onReadPower2(power);
        }

        @Deprecated
        public static void onReadPressure(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BlePressure> pressures) {
            Intrinsics.X0O(pressures, "pressures");
            BleHandleCallback.super.onReadPressure(pressures);
        }

        @Deprecated
        public static void onReadPressureTimingMeasurement(@aa1 BleHandleCallback bleHandleCallback, @aa1 BlePressureTimingMeasurement pressureTimingMeasurement) {
            Intrinsics.X0O(pressureTimingMeasurement, "pressureTimingMeasurement");
            BleHandleCallback.super.onReadPressureTimingMeasurement(pressureTimingMeasurement);
        }

        @Deprecated
        public static void onReadQiblaSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleQiblaSettings qiblaSettings) {
            Intrinsics.X0O(qiblaSettings, "qiblaSettings");
            BleHandleCallback.super.onReadQiblaSettings(qiblaSettings);
        }

        @Deprecated
        public static void onReadRecordControl(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRecordControl control) {
            Intrinsics.X0O(control, "control");
            BleHandleCallback.super.onReadRecordControl(control);
        }

        @Deprecated
        public static void onReadRelaxReminder(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRelaxReminder reminder) {
            Intrinsics.X0O(reminder, "reminder");
            BleHandleCallback.super.onReadRelaxReminder(reminder);
        }

        @Deprecated
        public static void onReadRespiratoryRate(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleRespiratoryRate> rate) {
            Intrinsics.X0O(rate, "rate");
            BleHandleCallback.super.onReadRespiratoryRate(rate);
        }

        @Deprecated
        public static void onReadRestingHeartRate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadRestingHeartRate(i);
        }

        @Deprecated
        public static void onReadRingVibrationSet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRingVibrationSettings ringVibrationSettings) {
            Intrinsics.X0O(ringVibrationSettings, "ringVibrationSettings");
            BleHandleCallback.super.onReadRingVibrationSet(ringVibrationSettings);
        }

        @Deprecated
        public static void onReadRri(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleRri> rris) {
            Intrinsics.X0O(rris, "rris");
            BleHandleCallback.super.onReadRri(rris);
        }

        @Deprecated
        public static void onReadSDCardInfo(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSDCardInfo sdCardInfo) {
            Intrinsics.X0O(sdCardInfo, "sdCardInfo");
            BleHandleCallback.super.onReadSDCardInfo(sdCardInfo);
        }

        @Deprecated
        public static void onReadSGCameraSet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGCameraSet cameraSet) {
            Intrinsics.X0O(cameraSet, "cameraSet");
            BleHandleCallback.super.onReadSGCameraSet(cameraSet);
        }

        @Deprecated
        public static void onReadSGKeySet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGKeySet set) {
            Intrinsics.X0O(set, "set");
            BleHandleCallback.super.onReadSGKeySet(set);
        }

        @Deprecated
        public static void onReadSGKeywordAwake(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGKeywordAwake keyword) {
            Intrinsics.X0O(keyword, "keyword");
            BleHandleCallback.super.onReadSGKeywordAwake(keyword);
        }

        @Deprecated
        public static void onReadSGSet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGSet set) {
            Intrinsics.X0O(set, "set");
            BleHandleCallback.super.onReadSGSet(set);
        }

        @Deprecated
        public static void onReadSGSleepSet(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSGSleepSet(i);
        }

        @Deprecated
        public static void onReadSOSSettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSOSSettings sosSettings) {
            Intrinsics.X0O(sosSettings, "sosSettings");
            BleHandleCallback.super.onReadSOSSettings(sosSettings);
        }

        @Deprecated
        public static void onReadScreenBrightnessSet(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadScreenBrightnessSet(i);
        }

        @Deprecated
        public static void onReadSedentariness(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSedentarinessSettings sedentarinessSettings) {
            Intrinsics.X0O(sedentarinessSettings, "sedentarinessSettings");
            BleHandleCallback.super.onReadSedentariness(sedentarinessSettings);
        }

        @Deprecated
        public static void onReadSleep(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleSleep> sleeps) {
            Intrinsics.X0O(sleeps, "sleeps");
            BleHandleCallback.super.onReadSleep(sleeps);
        }

        @Deprecated
        public static void onReadSleepGoal(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepGoal(i);
        }

        @Deprecated
        public static void onReadSleepMonitoringMode(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepMonitoringMode(i);
        }

        @Deprecated
        public static void onReadSleepQuality(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSleepQuality sleepQuality) {
            Intrinsics.X0O(sleepQuality, "sleepQuality");
            BleHandleCallback.super.onReadSleepQuality(sleepQuality);
        }

        @Deprecated
        public static void onReadSleepQualityScore(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepQualityScore(i);
        }

        @Deprecated
        public static void onReadSleepRaw(@aa1 BleHandleCallback bleHandleCallback, @aa1 byte[] sleepRawData) {
            Intrinsics.X0O(sleepRawData, "sleepRawData");
            BleHandleCallback.super.onReadSleepRaw(sleepRawData);
        }

        @Deprecated
        public static void onReadSleepRespiratoryRate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepRespiratoryRate(i);
        }

        @Deprecated
        public static void onReadSleepRiskLevel(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepRiskLevel(i);
        }

        @Deprecated
        public static void onReadSleepSet(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSleepSet(i);
        }

        @Deprecated
        public static void onReadSosCallLog(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleSosCallLog> callLogs) {
            Intrinsics.X0O(callLogs, "callLogs");
            BleHandleCallback.super.onReadSosCallLog(callLogs);
        }

        @Deprecated
        public static void onReadSosContact(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSosContact sosContact) {
            Intrinsics.X0O(sosContact, "sosContact");
            BleHandleCallback.super.onReadSosContact(sosContact);
        }

        @Deprecated
        public static void onReadSportDurationGoal(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadSportDurationGoal(i);
        }

        @Deprecated
        public static void onReadStandbyWatchFaceSet(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleStandbyWatchFaceSet standbyWatchFaceSet) {
            Intrinsics.X0O(standbyWatchFaceSet, "standbyWatchFaceSet");
            BleHandleCallback.super.onReadStandbyWatchFaceSet(standbyWatchFaceSet);
        }

        @Deprecated
        public static void onReadStepGoal(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadStepGoal(i);
        }

        @Deprecated
        public static void onReadStock(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleStock> stocks) {
            Intrinsics.X0O(stocks, "stocks");
            BleHandleCallback.super.onReadStock(stocks);
        }

        @Deprecated
        public static void onReadTemperature(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleTemperature> temperatures) {
            Intrinsics.X0O(temperatures, "temperatures");
            BleHandleCallback.super.onReadTemperature(temperatures);
        }

        @Deprecated
        public static void onReadTemperatureUnit(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadTemperatureUnit(i);
        }

        @Deprecated
        public static void onReadTrainingStatus(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleTrainingStatus> status) {
            Intrinsics.X0O(status, "status");
            BleHandleCallback.super.onReadTrainingStatus(status);
        }

        @Deprecated
        public static void onReadTuyaKey(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleTuyaKey tuyaKey) {
            Intrinsics.X0O(tuyaKey, "tuyaKey");
            BleHandleCallback.super.onReadTuyaKey(tuyaKey);
        }

        @Deprecated
        public static void onReadUiPackVersion(@aa1 BleHandleCallback bleHandleCallback, @aa1 String version) {
            Intrinsics.X0O(version, "version");
            BleHandleCallback.super.onReadUiPackVersion(version);
        }

        @Deprecated
        public static void onReadUnit(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadUnit(i);
        }

        @Deprecated
        public static void onReadUserProfile(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleUserProfile userProfile) {
            Intrinsics.X0O(userProfile, "userProfile");
            BleHandleCallback.super.onReadUserProfile(userProfile);
        }

        @Deprecated
        public static void onReadVitalityValue(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleVitality> vitalityValue) {
            Intrinsics.X0O(vitalityValue, "vitalityValue");
            BleHandleCallback.super.onReadVitalityValue(vitalityValue);
        }

        @Deprecated
        public static void onReadVoiceControl(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadVoiceControl(i);
        }

        @Deprecated
        public static void onReadWatchFaceId(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWatchFaceId watchFaceId) {
            Intrinsics.X0O(watchFaceId, "watchFaceId");
            BleHandleCallback.super.onReadWatchFaceId(watchFaceId);
        }

        @Deprecated
        public static void onReadWatchFaceIndex(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWatchFaceIndex watchfaceIndex) {
            Intrinsics.X0O(watchfaceIndex, "watchfaceIndex");
            BleHandleCallback.super.onReadWatchFaceIndex(watchfaceIndex);
        }

        @Deprecated
        public static void onReadWatchFaceMaxSize(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWatchFaceMaxSize sizeInfo) {
            Intrinsics.X0O(sizeInfo, "sizeInfo");
            BleHandleCallback.super.onReadWatchFaceMaxSize(sizeInfo);
        }

        @Deprecated
        public static void onReadWatchFaceSwitch(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadWatchFaceSwitch(i);
        }

        @Deprecated
        public static void onReadWatchPassword(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSettingWatchPassword watchPassword) {
            Intrinsics.X0O(watchPassword, "watchPassword");
            BleHandleCallback.super.onReadWatchPassword(watchPassword);
        }

        @Deprecated
        public static void onReadWearWayState(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onReadWearWayState(i);
        }

        @Deprecated
        public static void onReadWeatherRealTime(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onReadWeatherRealTime(z);
        }

        @Deprecated
        public static void onReadWechatPaySettings(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWechatPaySettings wechatPaySetting) {
            Intrinsics.X0O(wechatPaySetting, "wechatPaySetting");
            BleHandleCallback.super.onReadWechatPaySettings(wechatPaySetting);
        }

        @Deprecated
        public static void onReadWorkout(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleWorkout> workouts) {
            Intrinsics.X0O(workouts, "workouts");
            BleHandleCallback.super.onReadWorkout(workouts);
        }

        @Deprecated
        public static void onReadWorkout2(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleWorkout2> workouts) {
            Intrinsics.X0O(workouts, "workouts");
            BleHandleCallback.super.onReadWorkout2(workouts);
        }

        @Deprecated
        public static void onReadWorkout3(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleWorkout3> workouts) {
            Intrinsics.X0O(workouts, "workouts");
            BleHandleCallback.super.onReadWorkout3(workouts);
        }

        @Deprecated
        public static void onReadWorkout4(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleWorkout4> workouts) {
            Intrinsics.X0O(workouts, "workouts");
            BleHandleCallback.super.onReadWorkout4(workouts);
        }

        @Deprecated
        public static void onReadWorkout4Segmentation(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWorkout4Segmentation mBleWorkout4Segmentation) {
            Intrinsics.X0O(mBleWorkout4Segmentation, "mBleWorkout4Segmentation");
            BleHandleCallback.super.onReadWorkout4Segmentation(mBleWorkout4Segmentation);
        }

        @Deprecated
        public static void onReadWorldClock(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleWorldClock> clocks) {
            Intrinsics.X0O(clocks, "clocks");
            BleHandleCallback.super.onReadWorldClock(clocks);
        }

        @Deprecated
        public static void onRealTimeMeasurement(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRealTimeMeasurement realTimeMeasurement) {
            Intrinsics.X0O(realTimeMeasurement, "realTimeMeasurement");
            BleHandleCallback.super.onRealTimeMeasurement(realTimeMeasurement);
        }

        @Deprecated
        public static void onReceiveCmTrace(@aa1 BleHandleCallback bleHandleCallback, @aa1 byte[] data, boolean z) {
            Intrinsics.X0O(data, "data");
            BleHandleCallback.super.onReceiveCmTrace(data, z);
        }

        @Deprecated
        public static void onReceiveFilePacket(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleReceiveFilePacket filePacket) {
            Intrinsics.X0O(filePacket, "filePacket");
            BleHandleCallback.super.onReceiveFilePacket(filePacket);
        }

        @Deprecated
        public static void onReceiveGSensorMotion(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleGSensorMotion> gSensorMotions) {
            Intrinsics.X0O(gSensorMotions, "gSensorMotions");
            BleHandleCallback.super.onReceiveGSensorMotion(gSensorMotions);
        }

        @Deprecated
        public static void onReceiveGSensorRaw(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleGSensorRaw> gSensorRaws) {
            Intrinsics.X0O(gSensorRaws, "gSensorRaws");
            BleHandleCallback.super.onReceiveGSensorRaw(gSensorRaws);
        }

        @Deprecated
        public static void onReceiveGSensorSHSY(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleGSensorSHSY> gSensorSHSYs) {
            Intrinsics.X0O(gSensorSHSYs, "gSensorSHSYs");
            BleHandleCallback.super.onReceiveGSensorSHSY(gSensorSHSYs);
        }

        @Deprecated
        public static void onReceiveHRRaw(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleHRRaw> hrRaw) {
            Intrinsics.X0O(hrRaw, "hrRaw");
            BleHandleCallback.super.onReceiveHRRaw(hrRaw);
        }

        @Deprecated
        public static void onReceiveLocationGga(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleLocationGga locationGga) {
            Intrinsics.X0O(locationGga, "locationGga");
            BleHandleCallback.super.onReceiveLocationGga(locationGga);
        }

        @Deprecated
        public static void onReceiveLocationGsv(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BleLocationGsv> locationGsv) {
            Intrinsics.X0O(locationGsv, "locationGsv");
            BleHandleCallback.super.onReceiveLocationGsv(locationGsv);
        }

        @Deprecated
        public static void onReceiveMusicCommand(@aa1 BleHandleCallback bleHandleCallback, @aa1 MusicCommand musicCommand) {
            Intrinsics.X0O(musicCommand, "musicCommand");
            BleHandleCallback.super.onReceiveMusicCommand(musicCommand);
        }

        @Deprecated
        public static void onReceivePpgSHSY(@aa1 BleHandleCallback bleHandleCallback, @aa1 List<BlePpgSHSY> ppgSHSYs) {
            Intrinsics.X0O(ppgSHSYs, "ppgSHSYs");
            BleHandleCallback.super.onReceivePpgSHSY(ppgSHSYs);
        }

        @Deprecated
        public static void onReceiveRealtimeLog(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRealtimeLog realtimeLog) {
            Intrinsics.X0O(realtimeLog, "realtimeLog");
            BleHandleCallback.super.onReceiveRealtimeLog(realtimeLog);
        }

        @Deprecated
        public static void onReceiveRecordPacket(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRecordPacket recordPacket) {
            Intrinsics.X0O(recordPacket, "recordPacket");
            BleHandleCallback.super.onReceiveRecordPacket(recordPacket);
        }

        @Deprecated
        public static void onRecordControlUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRecordControl control) {
            Intrinsics.X0O(control, "control");
            BleHandleCallback.super.onRecordControlUpdate(control);
        }

        @Deprecated
        public static void onRequestAgpsPrerequisite(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onRequestAgpsPrerequisite();
        }

        @Deprecated
        public static void onRequestLocation(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onRequestLocation(i);
        }

        @Deprecated
        public static void onRingVibrationSetUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleRingVibrationSettings ringVibrationSettings) {
            Intrinsics.X0O(ringVibrationSettings, "ringVibrationSettings");
            BleHandleCallback.super.onRingVibrationSetUpdate(ringVibrationSettings);
        }

        @Deprecated
        public static void onSDCardInfoUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSDCardInfo sdCardInfo) {
            Intrinsics.X0O(sdCardInfo, "sdCardInfo");
            BleHandleCallback.super.onSDCardInfoUpdate(sdCardInfo);
        }

        @Deprecated
        public static void onSGTestUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGTest test) {
            Intrinsics.X0O(test, "test");
            BleHandleCallback.super.onSGTestUpdate(test);
        }

        @Deprecated
        public static void onSGTtsUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSGTts tts) {
            Intrinsics.X0O(tts, "tts");
            BleHandleCallback.super.onSGTtsUpdate(tts);
        }

        @Deprecated
        public static void onSOSSettingsUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSOSSettings sosSettings) {
            Intrinsics.X0O(sosSettings, "sosSettings");
            BleHandleCallback.super.onSOSSettingsUpdate(sosSettings);
        }

        @Deprecated
        public static void onScreenBrightnessSetUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onScreenBrightnessSetUpdate(i);
        }

        @Deprecated
        public static void onSessionStateChange(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onSessionStateChange(z);
        }

        @Deprecated
        public static void onSleepNotifyUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSleepNotify sleepNotify) {
            Intrinsics.X0O(sleepNotify, "sleepNotify");
            BleHandleCallback.super.onSleepNotifyUpdate(sleepNotify);
        }

        @Deprecated
        public static void onSosContactUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSosContact sosContact) {
            Intrinsics.X0O(sosContact, "sosContact");
            BleHandleCallback.super.onSosContactUpdate(sosContact);
        }

        @Deprecated
        public static void onSportEndNotifyUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onSportEndNotifyUpdate(i);
        }

        @Deprecated
        public static void onStandbyWatchFaceSetUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleStandbyWatchFaceSet standbyWatchFaceSet) {
            Intrinsics.X0O(standbyWatchFaceSet, "standbyWatchFaceSet");
            BleHandleCallback.super.onStandbyWatchFaceSetUpdate(standbyWatchFaceSet);
        }

        @Deprecated
        public static void onStepGoalUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onStepGoalUpdate(i);
        }

        @Deprecated
        public static void onStockDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onStockDelete(i);
        }

        @Deprecated
        public static void onStreamProgress(@aa1 BleHandleCallback bleHandleCallback, boolean z, int i, int i2, int i3, @aa1 BleKey bleKey) {
            Intrinsics.X0O(bleKey, "bleKey");
            BleHandleCallback.super.onStreamProgress(z, i, i2, i3, bleKey);
        }

        @Deprecated
        public static void onSyncData(@aa1 BleHandleCallback bleHandleCallback, int i, @aa1 BleKey bleKey) {
            Intrinsics.X0O(bleKey, "bleKey");
            BleHandleCallback.super.onSyncData(i, bleKey);
        }

        @Deprecated
        public static void onTimeUpdate(@aa1 BleHandleCallback bleHandleCallback) {
            BleHandleCallback.super.onTimeUpdate();
        }

        @Deprecated
        public static void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAICoachBeforePlanV2 info) {
            Intrinsics.X0O(info, "info");
            BleHandleCallback.super.onUpdateAICoachGenerateBeforeInfoV2(info);
        }

        @Deprecated
        public static void onUpdateAICoachLeaveDay(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleLeaveDay plan) {
            Intrinsics.X0O(plan, "plan");
            BleHandleCallback.super.onUpdateAICoachLeaveDay(plan);
        }

        @Deprecated
        public static void onUpdateAppSportState(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleAppSportState appSportState) {
            Intrinsics.X0O(appSportState, "appSportState");
            BleHandleCallback.super.onUpdateAppSportState(appSportState);
        }

        @Deprecated
        public static void onUpdateBAC(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBAC bac) {
            Intrinsics.X0O(bac, "bac");
            BleHandleCallback.super.onUpdateBAC(bac);
        }

        @Deprecated
        public static void onUpdateBloodPressure(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleBloodPressure bloodPressure) {
            Intrinsics.X0O(bloodPressure, "bloodPressure");
            BleHandleCallback.super.onUpdateBloodPressure(bloodPressure);
        }

        @Deprecated
        public static void onUpdateHeartRate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleHeartRate heartRate) {
            Intrinsics.X0O(heartRate, "heartRate");
            BleHandleCallback.super.onUpdateHeartRate(heartRate);
        }

        @Deprecated
        public static void onUpdateTemperature(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleTemperature temperature) {
            Intrinsics.X0O(temperature, "temperature");
            BleHandleCallback.super.onUpdateTemperature(temperature);
        }

        @Deprecated
        public static void onUpdateWatchFaceSwitch(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onUpdateWatchFaceSwitch(z);
        }

        @Deprecated
        public static void onUserProfileUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleUserProfile profile) {
            Intrinsics.X0O(profile, "profile");
            BleHandleCallback.super.onUserProfileUpdate(profile);
        }

        @Deprecated
        public static void onVibrationUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onVibrationUpdate(i);
        }

        @Deprecated
        public static void onVibrationUpdateV2(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onVibrationUpdateV2(i);
        }

        @Deprecated
        public static void onWatchFaceIdUpdate(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onWatchFaceIdUpdate(z);
        }

        @Deprecated
        public static void onWatchFaceIndexCreate(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onWatchFaceIndexCreate(z);
        }

        @Deprecated
        public static void onWatchFaceIndexUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleWatchFaceIndex watchfaceIndex) {
            Intrinsics.X0O(watchfaceIndex, "watchfaceIndex");
            BleHandleCallback.super.onWatchFaceIndexUpdate(watchfaceIndex);
        }

        @Deprecated
        public static void onWatchPasswordUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleSettingWatchPassword watchPassword) {
            Intrinsics.X0O(watchPassword, "watchPassword");
            BleHandleCallback.super.onWatchPasswordUpdate(watchPassword);
        }

        @Deprecated
        public static void onWearWayUpdate(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onWearWayUpdate(i);
        }

        @Deprecated
        public static void onWorldClockDelete(@aa1 BleHandleCallback bleHandleCallback, int i) {
            BleHandleCallback.super.onWorldClockDelete(i);
        }

        @Deprecated
        public static void onXMLYBandSetUpdate(@aa1 BleHandleCallback bleHandleCallback, @aa1 BleXMLYBandSet data) {
            Intrinsics.X0O(data, "data");
            BleHandleCallback.super.onXMLYBandSetUpdate(data);
        }

        @Deprecated
        public static void onXModem(@aa1 BleHandleCallback bleHandleCallback, byte b) {
            BleHandleCallback.super.onXModem(b);
        }

        @Deprecated
        public static void onReadStock(@aa1 BleHandleCallback bleHandleCallback, boolean z) {
            BleHandleCallback.super.onReadStock(z);
        }
    }

    static /* synthetic */ void onIdentityCreate$default(BleHandleCallback bleHandleCallback, boolean z, BleDeviceInfo bleDeviceInfo, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onIdentityCreate");
        }
        if ((i & 2) != 0) {
            bleDeviceInfo = null;
        }
        bleHandleCallback.onIdentityCreate(z, bleDeviceInfo);
    }

    static /* synthetic */ void onStreamProgress$default(BleHandleCallback bleHandleCallback, boolean z, int i, int i2, int i3, BleKey bleKey, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStreamProgress");
        }
        if ((i4 & 16) != 0) {
            bleKey = BleKey.NONE;
        }
        bleHandleCallback.onStreamProgress(z, i, i2, i3, bleKey);
    }

    default void onAICoachGeneratePlanUpdate(int i) {
    }

    default void onAICommandUpdate(@aa1 BleAICommand command) {
        Intrinsics.X0O(command, "command");
    }

    default void onActivityRecognitionUpdate(int i) {
    }

    default void onAlarmAdd(@aa1 BleAlarm alarm) {
        Intrinsics.X0O(alarm, "alarm");
    }

    default void onAlarmDelete(int i) {
    }

    default void onAlarmUpdate(@aa1 BleAlarm alarm) {
        Intrinsics.X0O(alarm, "alarm");
    }

    default void onAppOpUpdate(@aa1 BleAppOp appOp) {
        Intrinsics.X0O(appOp, "appOp");
    }

    default void onAppSportDataResponse(boolean z) {
    }

    default void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo naviInfo) {
        Intrinsics.X0O(naviInfo, "naviInfo");
    }

    default void onBacklightUpdate(int i) {
    }

    default void onBandKeyUpdate(@aa1 BleBandKey key) {
        Intrinsics.X0O(key, "key");
    }

    default void onBleGolfScore(@aa1 BleGolfScore info) {
        Intrinsics.X0O(info, "info");
    }

    default void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData thirdPartyData) {
        Intrinsics.X0O(thirdPartyData, "thirdPartyData");
    }

    default void onBleVideoCallInfo(@aa1 BleVideoCallInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onCPChatUpdate(@aa1 BleCPChat chat) {
        Intrinsics.X0O(chat, "chat");
    }

    default void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onCPListenerUpdate(@aa1 BleCPListener listener) {
        Intrinsics.X0O(listener, "listener");
    }

    default void onCPMissYouUpdate(@aa1 BleCPMissYou you) {
        Intrinsics.X0O(you, "you");
    }

    default void onCPTodoUpdate(@aa1 BleCPTodo todo) {
        Intrinsics.X0O(todo, "todo");
    }

    default void onCaloriesGoalUpdate(int i) {
    }

    default void onCameraResponse(boolean z, int i) {
    }

    default void onCameraStateChange(int i) {
    }

    default void onChatAppUpdate(@aa1 BleChatApp app) {
        Intrinsics.X0O(app, "app");
    }

    default void onChatMessageUpdate(@aa1 BleChatMessage message) {
        Intrinsics.X0O(message, "message");
    }

    default void onChatVoiceUpdate(@aa1 BleChatVoice voice) {
        Intrinsics.X0O(voice, "voice");
    }

    default void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay everyDay) {
        Intrinsics.X0O(everyDay, "everyDay");
    }

    default void onClassicBluetoothStateChange(int i) {
    }

    default void onCommandReply(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, boolean z) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
    }

    default void onCommandSendTimeout(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
    }

    default void onContactUsStateChange(int i) {
    }

    default void onDeleteAICoachPlan() {
    }

    default void onDeleteFileResponse(int i) {
    }

    default void onDeviceConnected(@aa1 BluetoothDevice device) {
        Intrinsics.X0O(device, "device");
    }

    default void onDeviceConnecting(boolean z) {
    }

    default void onDeviceFileUpdate(@aa1 BleDeviceFile deviceFile) {
        Intrinsics.X0O(deviceFile, "deviceFile");
    }

    default void onDeviceOpUpdate(int i) {
    }

    default void onDeviceRequestAGpsFile(@aa1 String url) {
        Intrinsics.X0O(url, "url");
    }

    default void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply smsQuickReply) {
        Intrinsics.X0O(smsQuickReply, "smsQuickReply");
    }

    default void onDeviceSportDataUpdate(@aa1 BleDeviceSportData deviceSportData) {
        Intrinsics.X0O(deviceSportData, "deviceSportData");
    }

    default void onDistanceGoalUpdate(int i) {
    }

    default void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings doubleScreenSettings) {
        Intrinsics.X0O(doubleScreenSettings, "doubleScreenSettings");
    }

    default void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings settings) {
        Intrinsics.X0O(settings, "settings");
    }

    default void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings earphoneAncSettings) {
        Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
    }

    default void onEarphoneCallUpdate(int i) {
    }

    default void onEarphoneKeyUpdate(@aa1 BleEarphoneKey earphoneKey) {
        Intrinsics.X0O(earphoneKey, "earphoneKey");
    }

    default void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings earphoneSoundEffectsSettings) {
        Intrinsics.X0O(earphoneSoundEffectsSettings, "earphoneSoundEffectsSettings");
    }

    default void onEarphoneStateUpdate(@aa1 BleEarphoneState earphoneState) {
        Intrinsics.X0O(earphoneState, "earphoneState");
    }

    default void onFactoryTestUpdate(@aa1 BleFactoryTest factoryTest) {
        Intrinsics.X0O(factoryTest, "factoryTest");
    }

    default void onFallSetUpdate(int i) {
    }

    default void onFindEarphoneUpdate(@aa1 BleFindEarphone findEarphone) {
        Intrinsics.X0O(findEarphone, "findEarphone");
    }

    default void onFindPhone(boolean z) {
    }

    default void onFindWatchUpdate(int i) {
    }

    default void onFollowSystemDateFormat() {
    }

    default void onFollowSystemHour() {
    }

    default void onFollowSystemLanguage(boolean z) {
    }

    default void onGameControlUpdate(@aa1 BleGameControl gameControl) {
        Intrinsics.X0O(gameControl, "gameControl");
    }

    default void onGestureWake2Update(@aa1 BleGestureWake2 gestureWake2) {
        Intrinsics.X0O(gestureWake2, "gestureWake2");
    }

    default void onGestureWakeUpdate(@aa1 BleGestureWake gestureWake) {
        Intrinsics.X0O(gestureWake, "gestureWake");
    }

    default void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo naviInfo) {
        Intrinsics.X0O(naviInfo, "naviInfo");
    }

    default void onHIDState(int i) {
    }

    default void onHIDValueChange(int i) {
    }

    default void onHRWarningSet(@aa1 BleHrWarningSettings set) {
        Intrinsics.X0O(set, "set");
    }

    default void onHanBaoVibrationStateChange(int i) {
    }

    default void onHighAntiAssistChange(int i) {
    }

    default void onHourSystemUpdate(int i) {
    }

    default void onHydrationUpdate(@aa1 BleHydrationSettings settings) {
        Intrinsics.X0O(settings, "settings");
    }

    default void onIPCExceptionUpdate(@aa1 BleIPCException exception) {
        Intrinsics.X0O(exception, "exception");
    }

    default void onIPCOTAStateUpdate(@aa1 BleIPCOTAState state) {
        Intrinsics.X0O(state, "state");
    }

    default void onIPCStateUpdate(@aa1 BleIPCState state) {
        Intrinsics.X0O(state, "state");
    }

    default void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onIdentityCreate(boolean z, @tb1 BleDeviceInfo bleDeviceInfo) {
    }

    default void onIdentityDelete(boolean z) {
    }

    default void onIdentityDeleteByDevice(boolean z) {
    }

    default void onIncomingCallRingUpdate(int i) {
    }

    default void onIncomingCallStatus(int i) {
    }

    default void onLoveTapUpdate(@aa1 BleLoveTap loveTap) {
        Intrinsics.X0O(loveTap, "loveTap");
    }

    default void onLoveTapUserDelete(int i) {
    }

    default void onLoveTapUserUpdate(@aa1 BleLoveTapUser loveTapUser) {
        Intrinsics.X0O(loveTapUser, "loveTapUser");
    }

    default void onMeasurementUpdate(@aa1 BleMeasurement measurement) {
        Intrinsics.X0O(measurement, "measurement");
    }

    default void onMedicationAlarmAdd(@aa1 BleMedicationAlarm medicationAlarm) {
        Intrinsics.X0O(medicationAlarm, "medicationAlarm");
    }

    default void onMedicationAlarmDelete(int i) {
    }

    default void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm medicationAlarm) {
        Intrinsics.X0O(medicationAlarm, "medicationAlarm");
    }

    default void onMedicationReminderDelete(int i) {
    }

    default void onMedicationReminderUpdate(@aa1 BleMedicationReminder medicationReminder) {
        Intrinsics.X0O(medicationReminder, "medicationReminder");
    }

    default void onMeetingReminderAdd(@aa1 BleMeetingReminder meetingReminder) {
        Intrinsics.X0O(meetingReminder, "meetingReminder");
    }

    default void onMeetingReminderDelete(int i) {
    }

    default void onMeetingReminderUpdate(@aa1 BleMeetingReminder meetingReminder) {
        Intrinsics.X0O(meetingReminder, "meetingReminder");
    }

    default void onMultiFileTransferReadFile(int i) {
    }

    default void onMultiFileTransferResponse(int i) {
    }

    default void onNaviInfoUpdate(@aa1 BleNaviInfo naviInfo) {
        Intrinsics.X0O(naviInfo, "naviInfo");
    }

    default void onNoDisturbUpdate(@aa1 BleNoDisturbSettings noDisturbSettings) {
        Intrinsics.X0O(noDisturbSettings, "noDisturbSettings");
    }

    default void onNotificationLightScreenSetUpdate(int i) {
    }

    default void onNotificationSettings2Update(@aa1 BleNotificationSettings2 notificationSettings2) {
        Intrinsics.X0O(notificationSettings2, "notificationSettings2");
    }

    default void onOTA(boolean z) {
    }

    default void onPowerSaveModeState(int i) {
    }

    default void onPowerSaveModeStateChange(int i) {
    }

    default void onQiblaSettingsUpdate() {
    }

    default void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan plan) {
        Intrinsics.X0O(plan, "plan");
    }

    default void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 plan) {
        Intrinsics.X0O(plan, "plan");
    }

    default void onReadActivity(@aa1 List<BleActivity> activities) {
        Intrinsics.X0O(activities, "activities");
    }

    default void onReadActivityDetail(@aa1 BleActivityDetail activityDetail) {
        Intrinsics.X0O(activityDetail, "activityDetail");
    }

    default void onReadAddressBook(@aa1 BleAddressBook info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadAlarm(@aa1 List<BleAlarm> alarms) {
        Intrinsics.X0O(alarms, "alarms");
    }

    default void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> alipayBindInfos) {
        Intrinsics.X0O(alipayBindInfos, "alipayBindInfos");
    }

    default void onReadAlipaySettings(@aa1 BleAlipaySettings alipaySettings) {
        Intrinsics.X0O(alipaySettings, "alipaySettings");
    }

    default void onReadAppApiVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadAppInfoList(@aa1 BleAppInfoList appInfoList) {
        Intrinsics.X0O(appInfoList, "appInfoList");
    }

    default void onReadAppSportState(@aa1 BleAppSportState appSportState) {
        Intrinsics.X0O(appSportState, "appSportState");
    }

    default void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> heartRates) {
        Intrinsics.X0O(heartRates, "heartRates");
    }

    default void onReadBAC(@aa1 List<BleBAC> bacs) {
        Intrinsics.X0O(bacs, "bacs");
    }

    default void onReadBacCalibration(@aa1 BleBacCalibration bac, @aa1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bac, "bac");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
    }

    default void onReadBacklight(int i) {
    }

    default void onReadBatteryUsage(@aa1 BleBatteryUsage batteryUsage) {
        Intrinsics.X0O(batteryUsage, "batteryUsage");
    }

    default void onReadBleAddress(@aa1 String address) {
        Intrinsics.X0O(address, "address");
    }

    default void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo bleGolfMapCacheInfo) {
        Intrinsics.X0O(bleGolfMapCacheInfo, "bleGolfMapCacheInfo");
    }

    default void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch bleGolfSportSwitch) {
        Intrinsics.X0O(bleGolfSportSwitch, "bleGolfSportSwitch");
    }

    default void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo bleGolfWatchMapInfo) {
        Intrinsics.X0O(bleGolfWatchMapInfo, "bleGolfWatchMapInfo");
    }

    default void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
        Intrinsics.X0O(bleGolfWatchVersionInfo, "bleGolfWatchVersionInfo");
    }

    default void onReadBleHrv(@aa1 List<BleHrv> hrv) {
        Intrinsics.X0O(hrv, "hrv");
    }

    default void onReadBleLogText(@aa1 List<BleLogText> logs) {
        Intrinsics.X0O(logs, "logs");
    }

    default void onReadBloodGlucose(@aa1 List<BleBloodGlucose> bloodGlucoses) {
        Intrinsics.X0O(bloodGlucoses, "bloodGlucoses");
    }

    default void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings bloodOxyGenSettings) {
        Intrinsics.X0O(bloodOxyGenSettings, "bloodOxyGenSettings");
    }

    default void onReadBloodOxygen(@aa1 List<BleBloodOxygen> bloodOxygen) {
        Intrinsics.X0O(bloodOxygen, "bloodOxygen");
    }

    default void onReadBloodPressure(@aa1 List<BleBloodPressure> bloodPressures) {
        Intrinsics.X0O(bloodPressures, "bloodPressures");
    }

    default void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration bloodPressureCalibration) {
        Intrinsics.X0O(bloodPressureCalibration, "bloodPressureCalibration");
    }

    default void onReadBodyStatus(@aa1 List<BleBodyStatus> bodyData) {
        Intrinsics.X0O(bodyData, "bodyData");
    }

    default void onReadCPUserInfo(@aa1 BleCPUserInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadCalibrationData(@aa1 BleCalibrationData calibrationData) {
        Intrinsics.X0O(calibrationData, "calibrationData");
    }

    default void onReadCalorieIntake(@aa1 List<BleCalorieIntake> calorieIntakes) {
        Intrinsics.X0O(calorieIntakes, "calorieIntakes");
    }

    default void onReadCaloriesGoal(int i) {
    }

    default void onReadChatApp(@aa1 BleChatApp app) {
        Intrinsics.X0O(app, "app");
    }

    default void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay everyDay) {
        Intrinsics.X0O(everyDay, "everyDay");
    }

    default void onReadClassicBluetoothState(int i) {
    }

    default void onReadCoachingIds(@aa1 BleCoachingIds bleCoachingIds) {
        Intrinsics.X0O(bleCoachingIds, "bleCoachingIds");
    }

    default void onReadCyWeeAlgorithm(@aa1 BleCyWeeAlgorithm bleCyWeeAlgorithm) {
        Intrinsics.X0O(bleCyWeeAlgorithm, "bleCyWeeAlgorithm");
    }

    default void onReadDailyPower(@aa1 List<BlePhysicalPower> powers) {
        Intrinsics.X0O(powers, "powers");
    }

    default void onReadDateFormat(int i) {
    }

    default void onReadDeviceFile(@aa1 BleDeviceFile deviceFile) {
        Intrinsics.X0O(deviceFile, "deviceFile");
    }

    default void onReadDeviceFileV2(@aa1 BleDeviceFile2 deviceFile) {
        Intrinsics.X0O(deviceFile, "deviceFile");
    }

    default void onReadDeviceInfo(@aa1 BleDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
    }

    default void onReadDeviceInfo2(@aa1 BleDeviceInfo2 deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
    }

    default void onReadDeviceLanguages(@aa1 BleDeviceLanguages deviceLanguages) {
        Intrinsics.X0O(deviceLanguages, "deviceLanguages");
    }

    default void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 deviceLanguages) {
        Intrinsics.X0O(deviceLanguages, "deviceLanguages");
    }

    default void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings deviceUniqueDataSettings) {
        Intrinsics.X0O(deviceUniqueDataSettings, "deviceUniqueDataSettings");
    }

    default void onReadDistanceGoal(int i) {
    }

    default void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings doubleScreenSettings) {
        Intrinsics.X0O(doubleScreenSettings, "doubleScreenSettings");
    }

    default void onReadDrinkWater(@aa1 BleDrinkWaterSettings drinkWaterSettings) {
        Intrinsics.X0O(drinkWaterSettings, "drinkWaterSettings");
    }

    default void onReadECGRealtime(@aa1 BleECGRealtime ecgRealtime) {
        Intrinsics.X0O(ecgRealtime, "ecgRealtime");
    }

    default void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings earphoneAncSettings) {
        Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
    }

    default void onReadEarphoneCall(int i) {
    }

    default void onReadEarphoneInfo(@aa1 BleEarphoneInfo earphoneInfo) {
        Intrinsics.X0O(earphoneInfo, "earphoneInfo");
    }

    default void onReadEarphoneKey(@aa1 BleEarphoneKey earphoneKey) {
        Intrinsics.X0O(earphoneKey, "earphoneKey");
    }

    default void onReadEarphonePower(@aa1 BleEarphonePower earphonePower) {
        Intrinsics.X0O(earphonePower, "earphonePower");
    }

    default void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings earphoneSoundEffectsSettings) {
        Intrinsics.X0O(earphoneSoundEffectsSettings, "earphoneSoundEffectsSettings");
    }

    default void onReadEarphoneState(@aa1 BleEarphoneState earphoneState) {
        Intrinsics.X0O(earphoneState, "earphoneState");
    }

    default void onReadEcg(@aa1 List<BleEcg> ecgs) {
        Intrinsics.X0O(ecgs, "ecgs");
    }

    default void onReadEcgSettings(@aa1 BleEcgSettings ecgSettings) {
        Intrinsics.X0O(ecgSettings, "ecgSettings");
    }

    default void onReadEnergyRating(@aa1 List<BleEnergyRating> energyRating) {
        Intrinsics.X0O(energyRating, "energyRating");
    }

    default void onReadFallSet(int i) {
    }

    default void onReadFilePath(@aa1 BleAppAudioBookList filePath) {
        Intrinsics.X0O(filePath, "filePath");
    }

    default void onReadFirmwareVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadFoodBalance(@aa1 List<BleFoodBalance> foodBalances) {
        Intrinsics.X0O(foodBalances, "foodBalances");
    }

    default void onReadGestureWake(@aa1 BleGestureWake gestureWake) {
        Intrinsics.X0O(gestureWake, "gestureWake");
    }

    default void onReadGestureWake2(@aa1 BleGestureWake2 gestureWake2) {
        Intrinsics.X0O(gestureWake2, "gestureWake2");
    }

    default void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly girlCareMonthly) {
        Intrinsics.X0O(girlCareMonthly, "girlCareMonthly");
    }

    default void onReadGirlCareSettings(@aa1 BleGirlCareSettings girlCareSettings) {
        Intrinsics.X0O(girlCareSettings, "girlCareSettings");
    }

    default void onReadGoMoreSettings(@aa1 BleGoMoreSettings goMoreSettings) {
        Intrinsics.X0O(goMoreSettings, "goMoreSettings");
    }

    default void onReadGolfWatchScore(@aa1 BleGolfWatchScore watchScore) {
        Intrinsics.X0O(watchScore, "watchScore");
    }

    default void onReadGpsFirmwareVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadHanBaoSettings(@aa1 BleHanBaoSettings hanBaoSettings) {
        Intrinsics.X0O(hanBaoSettings, "hanBaoSettings");
    }

    default void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> hanBaoVibrations) {
        Intrinsics.X0O(hanBaoVibrations, "hanBaoVibrations");
    }

    default void onReadHeartRate(@aa1 List<BleHeartRate> heartRates) {
        Intrinsics.X0O(heartRates, "heartRates");
    }

    default void onReadHeartRateZones(@aa1 BleHeartRateZones bmp) {
        Intrinsics.X0O(bmp, "bmp");
    }

    default void onReadHourSystem(int i) {
    }

    default void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings hrMonitoringSettings) {
        Intrinsics.X0O(hrMonitoringSettings, "hrMonitoringSettings");
    }

    default void onReadHrMonitoringSettingsV2(int i) {
    }

    default void onReadHrvBaseLine(@aa1 BleHrvBaseLine mBleHrvBaseLine) {
        Intrinsics.X0O(mBleHrvBaseLine, "mBleHrvBaseLine");
    }

    default void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings hrvMonitoringSettings) {
        Intrinsics.X0O(hrvMonitoringSettings, "hrvMonitoringSettings");
    }

    default void onReadHydrationSettings(@aa1 BleHydrationSettings hydrationSettings) {
        Intrinsics.X0O(hydrationSettings, "hydrationSettings");
    }

    default void onReadIPCInfo(@aa1 BleIPCInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadIPCState(@aa1 BleIPCState state) {
        Intrinsics.X0O(state, "state");
    }

    default void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadIPCVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadIncomingCallRing(int i) {
    }

    default void onReadLactateThreshold(@aa1 List<BleLactateThreshold> lactateThreshold) {
        Intrinsics.X0O(lactateThreshold, "lactateThreshold");
    }

    default void onReadLanguage(int i) {
    }

    default void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadLocation(@aa1 List<BleLocation> locations) {
        Intrinsics.X0O(locations, "locations");
    }

    default void onReadLoveTapUser(@aa1 List<BleLoveTapUser> loveTapUsers) {
        Intrinsics.X0O(loveTapUsers, "loveTapUsers");
    }

    default void onReadMatchRecord(@aa1 List<BleMatchRecord> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
    }

    default void onReadMatchRecord2(@aa1 List<BleMatchRecord2> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
    }

    default void onReadMatchRecord3(@aa1 List<BleMatchRecord3> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
    }

    default void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> medicationAlarm) {
        Intrinsics.X0O(medicationAlarm, "medicationAlarm");
    }

    default void onReadMedicationReminder(@aa1 List<BleMedicationReminder> medicationReminders) {
        Intrinsics.X0O(medicationReminders, "medicationReminders");
    }

    default void onReadMeetingReminder(@aa1 List<BleMeetingReminder> meetingReminders) {
        Intrinsics.X0O(meetingReminders, "meetingReminders");
    }

    default void onReadMindStatus(@aa1 List<BleMindStatus> feelingData) {
        Intrinsics.X0O(feelingData, "feelingData");
    }

    default void onReadMtkOtaMeta() {
    }

    default void onReadMultiFileTransfer(@aa1 BleMapFileList info) {
        Intrinsics.X0O(info, "info");
    }

    default void onReadNetworkFirmwareVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadNoDisturb(@aa1 BleNoDisturbSettings noDisturbSettings) {
        Intrinsics.X0O(noDisturbSettings, "noDisturbSettings");
    }

    default void onReadNotificationLightScreenSet(int i) {
    }

    default void onReadNotificationSettings2(@aa1 BleNotificationSettings2 notificationSettings2) {
        Intrinsics.X0O(notificationSettings2, "notificationSettings2");
    }

    default void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings settings) {
        Intrinsics.X0O(settings, "settings");
    }

    default void onReadOngoingDialogue(int i) {
    }

    default void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo optionalMapAuthInfo) {
        Intrinsics.X0O(optionalMapAuthInfo, "optionalMapAuthInfo");
    }

    default void onReadPackageStatus(@aa1 BlePackageStatus packageStatus) {
        Intrinsics.X0O(packageStatus, "packageStatus");
    }

    default void onReadPower(int i) {
    }

    default void onReadPower2(@aa1 BlePower2 power) {
        Intrinsics.X0O(power, "power");
    }

    default void onReadPressure(@aa1 List<BlePressure> pressures) {
        Intrinsics.X0O(pressures, "pressures");
    }

    default void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement pressureTimingMeasurement) {
        Intrinsics.X0O(pressureTimingMeasurement, "pressureTimingMeasurement");
    }

    default void onReadQiblaSettings(@aa1 BleQiblaSettings qiblaSettings) {
        Intrinsics.X0O(qiblaSettings, "qiblaSettings");
    }

    default void onReadRecordControl(@aa1 BleRecordControl control) {
        Intrinsics.X0O(control, "control");
    }

    default void onReadRelaxReminder(@aa1 BleRelaxReminder reminder) {
        Intrinsics.X0O(reminder, "reminder");
    }

    default void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> rate) {
        Intrinsics.X0O(rate, "rate");
    }

    default void onReadRestingHeartRate(int i) {
    }

    default void onReadRingVibrationSet(@aa1 BleRingVibrationSettings ringVibrationSettings) {
        Intrinsics.X0O(ringVibrationSettings, "ringVibrationSettings");
    }

    default void onReadRri(@aa1 List<BleRri> rris) {
        Intrinsics.X0O(rris, "rris");
    }

    default void onReadSDCardInfo(@aa1 BleSDCardInfo sdCardInfo) {
        Intrinsics.X0O(sdCardInfo, "sdCardInfo");
    }

    default void onReadSGCameraSet(@aa1 BleSGCameraSet cameraSet) {
        Intrinsics.X0O(cameraSet, "cameraSet");
    }

    default void onReadSGKeySet(@aa1 BleSGKeySet set) {
        Intrinsics.X0O(set, "set");
    }

    default void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake keyword) {
        Intrinsics.X0O(keyword, "keyword");
    }

    default void onReadSGSet(@aa1 BleSGSet set) {
        Intrinsics.X0O(set, "set");
    }

    default void onReadSGSleepSet(int i) {
    }

    default void onReadSOSSettings(@aa1 BleSOSSettings sosSettings) {
        Intrinsics.X0O(sosSettings, "sosSettings");
    }

    default void onReadScreenBrightnessSet(int i) {
    }

    default void onReadSedentariness(@aa1 BleSedentarinessSettings sedentarinessSettings) {
        Intrinsics.X0O(sedentarinessSettings, "sedentarinessSettings");
    }

    default void onReadSleep(@aa1 List<BleSleep> sleeps) {
        Intrinsics.X0O(sleeps, "sleeps");
    }

    default void onReadSleepGoal(int i) {
    }

    default void onReadSleepMonitoringMode(int i) {
    }

    default void onReadSleepQuality(@aa1 BleSleepQuality sleepQuality) {
        Intrinsics.X0O(sleepQuality, "sleepQuality");
    }

    default void onReadSleepQualityScore(int i) {
    }

    default void onReadSleepRaw(@aa1 byte[] sleepRawData) {
        Intrinsics.X0O(sleepRawData, "sleepRawData");
    }

    default void onReadSleepRespiratoryRate(int i) {
    }

    default void onReadSleepRiskLevel(int i) {
    }

    default void onReadSleepSet(int i) {
    }

    default void onReadSosCallLog(@aa1 List<BleSosCallLog> callLogs) {
        Intrinsics.X0O(callLogs, "callLogs");
    }

    default void onReadSosContact(@aa1 BleSosContact sosContact) {
        Intrinsics.X0O(sosContact, "sosContact");
    }

    default void onReadSportDurationGoal(int i) {
    }

    default void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet standbyWatchFaceSet) {
        Intrinsics.X0O(standbyWatchFaceSet, "standbyWatchFaceSet");
    }

    default void onReadStepGoal(int i) {
    }

    default void onReadStock(@aa1 List<BleStock> stocks) {
        Intrinsics.X0O(stocks, "stocks");
    }

    default void onReadTemperature(@aa1 List<BleTemperature> temperatures) {
        Intrinsics.X0O(temperatures, "temperatures");
    }

    default void onReadTemperatureUnit(int i) {
    }

    default void onReadTrainingStatus(@aa1 List<BleTrainingStatus> status) {
        Intrinsics.X0O(status, "status");
    }

    default void onReadTuyaKey(@aa1 BleTuyaKey tuyaKey) {
        Intrinsics.X0O(tuyaKey, "tuyaKey");
    }

    default void onReadUiPackVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
    }

    default void onReadUnit(int i) {
    }

    default void onReadUserProfile(@aa1 BleUserProfile userProfile) {
        Intrinsics.X0O(userProfile, "userProfile");
    }

    default void onReadVitalityValue(@aa1 List<BleVitality> vitalityValue) {
        Intrinsics.X0O(vitalityValue, "vitalityValue");
    }

    default void onReadVoiceControl(int i) {
    }

    default void onReadWatchFaceId(@aa1 BleWatchFaceId watchFaceId) {
        Intrinsics.X0O(watchFaceId, "watchFaceId");
    }

    default void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex watchfaceIndex) {
        Intrinsics.X0O(watchfaceIndex, "watchfaceIndex");
    }

    default void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize sizeInfo) {
        Intrinsics.X0O(sizeInfo, "sizeInfo");
    }

    default void onReadWatchFaceSwitch(int i) {
    }

    default void onReadWatchPassword(@aa1 BleSettingWatchPassword watchPassword) {
        Intrinsics.X0O(watchPassword, "watchPassword");
    }

    default void onReadWearWayState(int i) {
    }

    default void onReadWeatherRealTime(boolean z) {
    }

    default void onReadWechatPaySettings(@aa1 BleWechatPaySettings wechatPaySetting) {
        Intrinsics.X0O(wechatPaySetting, "wechatPaySetting");
    }

    default void onReadWorkout(@aa1 List<BleWorkout> workouts) {
        Intrinsics.X0O(workouts, "workouts");
    }

    default void onReadWorkout2(@aa1 List<BleWorkout2> workouts) {
        Intrinsics.X0O(workouts, "workouts");
    }

    default void onReadWorkout3(@aa1 List<BleWorkout3> workouts) {
        Intrinsics.X0O(workouts, "workouts");
    }

    default void onReadWorkout4(@aa1 List<BleWorkout4> workouts) {
        Intrinsics.X0O(workouts, "workouts");
    }

    default void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation mBleWorkout4Segmentation) {
        Intrinsics.X0O(mBleWorkout4Segmentation, "mBleWorkout4Segmentation");
    }

    default void onReadWorldClock(@aa1 List<BleWorldClock> clocks) {
        Intrinsics.X0O(clocks, "clocks");
    }

    default void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement realTimeMeasurement) {
        Intrinsics.X0O(realTimeMeasurement, "realTimeMeasurement");
    }

    default void onReceiveCmTrace(@aa1 byte[] data, boolean z) {
        Intrinsics.X0O(data, "data");
    }

    default void onReceiveFilePacket(@aa1 BleReceiveFilePacket filePacket) {
        Intrinsics.X0O(filePacket, "filePacket");
    }

    default void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> gSensorMotions) {
        Intrinsics.X0O(gSensorMotions, "gSensorMotions");
    }

    default void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> gSensorRaws) {
        Intrinsics.X0O(gSensorRaws, "gSensorRaws");
    }

    default void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> gSensorSHSYs) {
        Intrinsics.X0O(gSensorSHSYs, "gSensorSHSYs");
    }

    default void onReceiveHRRaw(@aa1 List<BleHRRaw> hrRaw) {
        Intrinsics.X0O(hrRaw, "hrRaw");
    }

    default void onReceiveLocationGga(@aa1 BleLocationGga locationGga) {
        Intrinsics.X0O(locationGga, "locationGga");
    }

    default void onReceiveLocationGsv(@aa1 List<BleLocationGsv> locationGsv) {
        Intrinsics.X0O(locationGsv, "locationGsv");
    }

    default void onReceiveMusicCommand(@aa1 MusicCommand musicCommand) {
        Intrinsics.X0O(musicCommand, "musicCommand");
    }

    default void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> ppgSHSYs) {
        Intrinsics.X0O(ppgSHSYs, "ppgSHSYs");
    }

    default void onReceiveRealtimeLog(@aa1 BleRealtimeLog realtimeLog) {
        Intrinsics.X0O(realtimeLog, "realtimeLog");
    }

    default void onReceiveRecordPacket(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
    }

    default void onRecordControlUpdate(@aa1 BleRecordControl control) {
        Intrinsics.X0O(control, "control");
    }

    default void onRequestAgpsPrerequisite() {
    }

    default void onRequestLocation(int i) {
    }

    default void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings ringVibrationSettings) {
        Intrinsics.X0O(ringVibrationSettings, "ringVibrationSettings");
    }

    default void onSDCardInfoUpdate(@aa1 BleSDCardInfo sdCardInfo) {
        Intrinsics.X0O(sdCardInfo, "sdCardInfo");
    }

    default void onSGTestUpdate(@aa1 BleSGTest test) {
        Intrinsics.X0O(test, "test");
    }

    default void onSGTtsUpdate(@aa1 BleSGTts tts) {
        Intrinsics.X0O(tts, "tts");
    }

    default void onSOSSettingsUpdate(@aa1 BleSOSSettings sosSettings) {
        Intrinsics.X0O(sosSettings, "sosSettings");
    }

    default void onScreenBrightnessSetUpdate(int i) {
    }

    default void onSessionStateChange(boolean z) {
    }

    default void onSleepNotifyUpdate(@aa1 BleSleepNotify sleepNotify) {
        Intrinsics.X0O(sleepNotify, "sleepNotify");
    }

    default void onSosContactUpdate(@aa1 BleSosContact sosContact) {
        Intrinsics.X0O(sosContact, "sosContact");
    }

    default void onSportEndNotifyUpdate(int i) {
    }

    default void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet standbyWatchFaceSet) {
        Intrinsics.X0O(standbyWatchFaceSet, "standbyWatchFaceSet");
    }

    default void onStepGoalUpdate(int i) {
    }

    default void onStockDelete(int i) {
    }

    default void onStreamProgress(boolean z, int i, int i2, int i3, @aa1 BleKey bleKey) {
        Intrinsics.X0O(bleKey, "bleKey");
    }

    default void onSyncData(int i, @aa1 BleKey bleKey) {
        Intrinsics.X0O(bleKey, "bleKey");
    }

    default void onTimeUpdate() {
    }

    default void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 info) {
        Intrinsics.X0O(info, "info");
    }

    default void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay plan) {
        Intrinsics.X0O(plan, "plan");
    }

    default void onUpdateAppSportState(@aa1 BleAppSportState appSportState) {
        Intrinsics.X0O(appSportState, "appSportState");
    }

    default void onUpdateBAC(@aa1 BleBAC bac) {
        Intrinsics.X0O(bac, "bac");
    }

    default void onUpdateBloodPressure(@aa1 BleBloodPressure bloodPressure) {
        Intrinsics.X0O(bloodPressure, "bloodPressure");
    }

    default void onUpdateHeartRate(@aa1 BleHeartRate heartRate) {
        Intrinsics.X0O(heartRate, "heartRate");
    }

    default void onUpdateTemperature(@aa1 BleTemperature temperature) {
        Intrinsics.X0O(temperature, "temperature");
    }

    default void onUpdateWatchFaceSwitch(boolean z) {
    }

    default void onUserProfileUpdate(@aa1 BleUserProfile profile) {
        Intrinsics.X0O(profile, "profile");
    }

    default void onVibrationUpdate(int i) {
    }

    default void onVibrationUpdateV2(int i) {
    }

    default void onWatchFaceIdUpdate(boolean z) {
    }

    default void onWatchFaceIndexCreate(boolean z) {
    }

    default void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex watchfaceIndex) {
        Intrinsics.X0O(watchfaceIndex, "watchfaceIndex");
    }

    default void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword watchPassword) {
        Intrinsics.X0O(watchPassword, "watchPassword");
    }

    default void onWearWayUpdate(int i) {
    }

    default void onWorldClockDelete(int i) {
    }

    default void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet data) {
        Intrinsics.X0O(data, "data");
    }

    default void onXModem(byte b) {
    }

    default void onReadStock(boolean z) {
    }
}
