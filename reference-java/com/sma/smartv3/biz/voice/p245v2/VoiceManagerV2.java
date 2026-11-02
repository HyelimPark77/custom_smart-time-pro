package com.sma.smartv3.biz.voice.p245v2;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceMessage;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.biz.voice.p245v2.VoiceManagerV2;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.p610ui.ai_note.AiNoteUtil;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
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
import com.szabh.smable3.entity.BleVoice;
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
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nVoiceManagerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,797:1\n39#2,3:798\n42#2:804\n44#2,2:806\n31#2,2:808\n1563#3:801\n1634#3,2:802\n1636#3:805\n1869#3,2:810\n*S KotlinDebug\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n*L\n261#1:798,3\n261#1:804\n261#1:806,2\n267#1:808,2\n261#1:801\n261#1:802,2\n261#1:805\n748#1:810,2\n*E\n"})
public final class VoiceManagerV2 {

    @aa1
    private static final String TAG = "AIManagerV2 VoiceManagerV2";
    private static boolean isAloneCallback;
    private static boolean isSpeechRecRunning;
    private static Application mApp;

    @tb1
    private static OpusManager mOpusManager;
    private static int mVoiceMode;

    @aa1
    public static final VoiceManagerV2 INSTANCE = new VoiceManagerV2();

    @aa1
    private static String mSavePcmTime = "";
    private static final long FIRST_IDENTIFY_TIME = 2000;
    private static long microsoftTime = 2000;

    @aa1
    private static final File mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");
    private static int mAIMode = -1;

    @aa1
    private static final VoiceManagerV2$mBleHandleCallback$1 mBleHandleCallback = new BleHandleCallback() { // from class: com.sma.smartv3.biz.voice.v2.VoiceManagerV2$mBleHandleCallback$1
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
        public /* bridge */ void onCommandReply(BleKey bleKey, BleKeyFlag bleKeyFlag, boolean z) {
            super.onCommandReply(bleKey, bleKeyFlag, z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
            super.onCommandSendTimeout(bleKey, bleKeyFlag);
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
        public /* bridge */ void onDeviceConnected(BluetoothDevice bluetoothDevice) {
            super.onDeviceConnected(bluetoothDevice);
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
        public void onReceiveRecordPacket(BleRecordPacket recordPacket) {
            OpusManager opusManager;
            Intrinsics.X0O(recordPacket, "recordPacket");
            if (recordPacket.getMMode() == 6 || recordPacket.getMMode() == 7) {
                VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
                VoiceManagerV2.mVoiceMode = recordPacket.getMMode();
                AiNoteUtil.OXO1.iOO1ii1(recordPacket);
                return;
            }
            int mStatus = recordPacket.getMStatus();
            if (mStatus != 0) {
                if (mStatus == 1) {
                    FileIOUtils.writeFileFromBytesByStream(VoiceManagerV2.mOpusFile, recordPacket.getMPacket(), true);
                    q62 q62Var = q62.OXO1;
                    if (q62Var.XOX() && q62Var.iX0iiiXi()) {
                        VoiceManagerV2 voiceManagerV3 = VoiceManagerV2.INSTANCE;
                        if (voiceManagerV3.isSupportDevicePhoneVoiceAIChat() && !voiceManagerV3.isVoiceAIIdentify()) {
                            Iterator it = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(recordPacket.getMPacket()), 40).iterator();
                            while (it.hasNext()) {
                                AIIdentificationManager.INSTANCE.identificationProcess(CollectionsKt___CollectionsKt.XX0X0((List) it.next()));
                            }
                            return;
                        }
                    }
                    VoiceManagerV2 voiceManagerV4 = VoiceManagerV2.INSTANCE;
                    if (voiceManagerV4.isVoiceAiChatContext()) {
                        Iterator it2 = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(recordPacket.getMPacket()), 40).iterator();
                        while (it2.hasNext()) {
                            AIIdentificationManager.INSTANCE.identificationProcess(CollectionsKt___CollectionsKt.XX0X0((List) it2.next()));
                        }
                        return;
                    } else {
                        if (!voiceManagerV4.isSpeechRecRunning() || (opusManager = VoiceManagerV2.mOpusManager) == null) {
                            return;
                        }
                        opusManager.writeAudioStream(recordPacket.getMPacket());
                        return;
                    }
                }
                if (mStatus != 2) {
                    if (mStatus != 3) {
                        if (mStatus != 5) {
                            return;
                        }
                        DcsTtsPlayer.INSTANCE.replayMusic();
                        return;
                    }
                    VoiceManagerV2 voiceManagerV5 = VoiceManagerV2.INSTANCE;
                    voiceManagerV5.stop();
                    voiceManagerV5.changeOpusManager();
                    voiceManagerV5.setSpeechRecRunning(false);
                    if (q62.OXO1.iX0iiiXi()) {
                        WebSocketManager.INSTANCE.sendAbortMessage();
                        return;
                    }
                    return;
                }
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.XIi00iiXO("AIManagerV2 VoiceManagerV2 BleRecordPacket TRANSFER_STATUS_END mAIMode = " + VoiceManagerV2.mAIMode + " , mVoiceMode =  " + VoiceManagerV2.mVoiceMode);
                VoiceManagerV2 voiceManagerV6 = VoiceManagerV2.INSTANCE;
                voiceManagerV6.changeOpusManager();
                if (voiceManagerV6.isSpeechRecRunning()) {
                    voiceManagerV6.stop();
                    AIIdentificationManager.INSTANCE.identificationCompleted();
                    voiceManagerV6.setSpeechRecRunning(false);
                    return;
                } else {
                    i1o0oxo1o.XIi00iiXO("AIManagerV2 VoiceManagerV2 BleRecordPacket TRANSFER_STATUS_END isSpeechRecRunning = " + voiceManagerV6.isSpeechRecRunning());
                    return;
                }
            }
            VoiceManagerV2 voiceManagerV7 = VoiceManagerV2.INSTANCE;
            if (voiceManagerV7.isSpeechRecRunning()) {
                i1O0OXO1O.OXO1.XIi00iiXO("AIManagerV2 VoiceManagerV2 BleRecordPacket TRANSFER_STATUS_START isInputAudioSteam = " + voiceManagerV7.isSpeechRecRunning());
                return;
            }
            voiceManagerV7.deleteFiles();
            VoiceManagerV2.mAIMode = -1;
            if (i72.OXO1.I0IIOI()) {
                int mAIMode2 = recordPacket.getMAIMode();
                if (mAIMode2 == 0) {
                    VoiceManagerV2.mAIMode = 0;
                } else if (mAIMode2 == 1) {
                    VoiceManagerV2.mAIMode = 1;
                } else if (mAIMode2 == 2) {
                    VoiceManagerV2.mAIMode = 2;
                } else if (mAIMode2 == 3) {
                    VoiceManagerV2.mAIMode = 3;
                }
            }
            voiceManagerV7.setSpeechRecRunning(true);
            VoiceManagerV2.mVoiceMode = recordPacket.getMMode();
            i1O0OXO1O.OXO1.XIi00iiXO("AIManagerV2 VoiceManagerV2 BleRecordPacket TRANSFER_STATUS_START mAIMode = " + VoiceManagerV2.mAIMode + " , mVoiceMode =  " + VoiceManagerV2.mVoiceMode);
            if (voiceManagerV7.isTranslation()) {
                AITranslationManager.INSTANCE.setTranslationLanguage(recordPacket);
            }
            if (voiceManagerV7.isConductEarPhone()) {
                AIIdentificationManager.identificationBegins$default(AIIdentificationManager.INSTANCE, voiceManagerV7.isConductEarPhone(), VoiceManagerV2.identificationCallback, false, VoiceManagerV2.mAIMode, VoiceManagerV2.recordCallBack, 4, null);
                return;
            }
            AIIdentificationManager.identificationBegins$default(AIIdentificationManager.INSTANCE, voiceManagerV7.isConductEarPhone(), VoiceManagerV2.identificationCallback, false, VoiceManagerV2.mAIMode, VoiceManagerV2.recordCallBack, 4, null);
            q62 q62Var2 = q62.OXO1;
            if (q62Var2.XOX() && q62Var2.iX0iiiXi() && voiceManagerV7.isSupportDevicePhoneVoiceAIChat() && !voiceManagerV7.isVoiceAIIdentify()) {
                Iterator it3 = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(recordPacket.getMPacket()), 40).iterator();
                while (it3.hasNext()) {
                    AIIdentificationManager.INSTANCE.identificationProcess(CollectionsKt___CollectionsKt.XX0X0((List) it3.next()));
                }
            } else {
                if (voiceManagerV7.isVoiceAiChatContext()) {
                    Iterator it4 = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(recordPacket.getMPacket()), 40).iterator();
                    while (it4.hasNext()) {
                        AIIdentificationManager.INSTANCE.identificationProcess(CollectionsKt___CollectionsKt.XX0X0((List) it4.next()));
                    }
                    return;
                }
                OpusManager opusManager2 = VoiceManagerV2.mOpusManager;
                if (opusManager2 != null) {
                    opusManager2.stopDecodeStream();
                }
                OpusManager opusManager3 = VoiceManagerV2.mOpusManager;
                if (opusManager3 != null) {
                    opusManager3.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.v2.VoiceManagerV2$mBleHandleCallback$1$onReceiveRecordPacket$3
                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onComplete(String complete) {
                            Intrinsics.X0O(complete, "complete");
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                        public void onDecodeStream(byte[] bArr) {
                            Intrinsics.X0O(bArr, "byte");
                            AIIdentificationManager.INSTANCE.identificationProcess(bArr);
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onError(int i, String error) {
                            Intrinsics.X0O(error, "error");
                            i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 startDecodeStream -> onError: " + i + ", " + error);
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onStart() {
                        }
                    });
                }
            }
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
        public /* bridge */ void onStreamProgress(boolean z, int i, int i2, int i3, BleKey bleKey) {
            super.onStreamProgress(z, i, i2, i3, bleKey);
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
    };

    @aa1
    private static final VoiceManagerV2$identificationCallback$1 identificationCallback = new VoiceManagerV2$identificationCallback$1();

    @aa1
    private static final VoiceManagerV2$mAIModelCallback$1 mAIModelCallback = new VoiceManagerV2$mAIModelCallback$1();

    @aa1
    private static final VoiceManagerV2$recordCallBack$1 recordCallBack = new VoiceManagerV2$recordCallBack$1();

    @aa1
    private static final Lazy mVoiceHandleCallbacks$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hj6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceManagerV2.mVoiceHandleCallbacks_delegate$lambda$0();
        }
    });

    @aa1
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    private VoiceManagerV2() {
    }

    private final void addHandleCallback() {
        BleConnector.INSTANCE.addHandleCallback(mBleHandleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeOpusManager() {
        try {
            OpusManager opusManager = mOpusManager;
            if (opusManager != null) {
                opusManager.stopDecodeStream();
            }
            OpusManager opusManager2 = mOpusManager;
            if (opusManager2 != null) {
                opusManager2.release();
            }
            mOpusManager = null;
            mOpusManager = new OpusManager();
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> opus init error！！！");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFiles() {
        FileUtils.delete(mOpusFile);
        AIIdentificationManager.INSTANCE.deleteFile();
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.O10IXXX0X(str, "format(...)");
        mSavePcmTime = str;
    }

    private final CopyOnWriteArrayList<VoiceHandleCallback> getMVoiceHandleCallbacks() {
        return (CopyOnWriteArrayList) mVoiceHandleCallbacks$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArrayList mVoiceHandleCallbacks_delegate$lambda$0() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyCallback(Function1<? super VoiceHandleCallback, Unit> function1) {
        if (isAloneCallback) {
            onAloneNotifyVoiceHandlers(function1);
        } else {
            onAllNotifyVoiceHandlers(function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAIModelIdentificationError(String str, String str2) {
        Collection collectionM39402iI;
        sendTranslationResult(str, UtilsKt.XXO(R.string.voice_assistant_common_error));
        if (isSupportDevicePhoneVoiceAIChat()) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
            if (listOO0Oi10.isEmpty()) {
                return;
            }
            VoiceMessage voiceMessage = (VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi10);
            if (voiceMessage.getMStatus() == 1) {
                voiceMessage.setMStatus(0);
                voiceMessage.setMContent(UtilsKt.XXO(R.string.voice_assistant_common_error));
                a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                I01XX0.XIi00iiXO(I01XX0.X00O0, null, 2, null);
            }
        }
    }

    public static /* synthetic */ void onAIModelIdentificationError$default(VoiceManagerV2 voiceManagerV2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        voiceManagerV2.onAIModelIdentificationError(str, str2);
    }

    public static /* synthetic */ void onAIResultConsumption$default(VoiceManagerV2 voiceManagerV2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        voiceManagerV2.onAIResultConsumption(str, i);
    }

    private final void onAllNotifyVoiceHandlers(final Function1<? super VoiceHandleCallback, Unit> function1) {
        mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.fj6
            @Override // java.lang.Runnable
            public final void run() {
                VoiceManagerV2.onAllNotifyVoiceHandlers$lambda$0(function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAllNotifyVoiceHandlers$lambda$0(Function1 function1) {
        VoiceManagerV2 voiceManagerV2 = INSTANCE;
        if (voiceManagerV2.getMVoiceHandleCallbacks().isEmpty()) {
            return;
        }
        for (VoiceHandleCallback voiceHandleCallback : voiceManagerV2.getMVoiceHandleCallbacks()) {
            Intrinsics.XXI(voiceHandleCallback);
            function1.invoke2(voiceHandleCallback);
        }
    }

    private final void onAloneNotifyVoiceHandlers(final Function1<? super VoiceHandleCallback, Unit> function1) {
        mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gj6
            @Override // java.lang.Runnable
            public final void run() {
                VoiceManagerV2.onAloneNotifyVoiceHandlers$lambda$0(function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAloneNotifyVoiceHandlers$lambda$0(Function1 function1) {
        VoiceManagerV2 voiceManagerV2 = INSTANCE;
        if (voiceManagerV2.getMVoiceHandleCallbacks().isEmpty()) {
            return;
        }
        Object objXi1XO00 = CollectionsKt___CollectionsKt.Xi1XO00(voiceManagerV2.getMVoiceHandleCallbacks());
        Intrinsics.O10IXXX0X(objXi1XO00, "last(...)");
        function1.invoke2(objXi1XO00);
    }

    private final void removeHandleCallback() {
        BleConnector.INSTANCE.removeHandleCallback(mBleHandleCallback);
    }

    private final void senAudioTextToDevice(BleVoice bleVoice) {
        if (q62.OXO1.I0OX()) {
            return;
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, bleVoice, false, false, 24, null);
    }

    public static /* synthetic */ void sendError$default(VoiceManagerV2 voiceManagerV2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Utils.getApp().getString(R.string.request_error);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        voiceManagerV2.sendError(str);
    }

    public static /* synthetic */ void sendTranslationResult$default(VoiceManagerV2 voiceManagerV2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        voiceManagerV2.sendTranslationResult(str, str2);
    }

    private final void sendTranslationResultInput(String str) {
        senAudioTextToDevice(new BleVoice(0, 0, mVoiceMode, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(str).toString(), 10, null));
    }

    private final void startPhoneRecordingIdentification(int i) {
        mVoiceMode = i;
        AIIdentificationManager.identificationBegins$default(AIIdentificationManager.INSTANCE, true, identificationCallback, false, -1, recordCallBack, 4, null);
    }

    public final void addVoiceHandleCallback(@aa1 VoiceHandleCallback mVoiceHandleCallback) {
        Intrinsics.X0O(mVoiceHandleCallback, "mVoiceHandleCallback");
        if (isVoiceHandlerCallbackExist(mVoiceHandleCallback)) {
            return;
        }
        getMVoiceHandleCallbacks().add(mVoiceHandleCallback);
    }

    public final void destroy() {
        stop();
        removeHandleCallback();
        OpusManager opusManager = mOpusManager;
        if (opusManager != null) {
            opusManager.release();
        }
        mOpusManager = null;
    }

    @aa1
    public final AIModelManagerV2.OnAIModelCallback getAIModelCallback() {
        return mAIModelCallback;
    }

    @aa1
    public final String getMSavePcmTime() {
        return mSavePcmTime;
    }

    public final int getVoiceMode() {
        return mVoiceMode;
    }

    public final void init(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        mApp = app;
        AITranslationManager aITranslationManager = AITranslationManager.INSTANCE;
        Application application = mApp;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        aITranslationManager.init(application);
        addHandleCallback();
        if (mOpusManager == null) {
            try {
                mOpusManager = new OpusManager();
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> opus init error！！！");
            }
        }
        RecordingManager.Companion companion = RecordingManager.Companion;
        companion.getInstance().init(app);
        companion.getInstance().registerSCOReceiver(app);
        String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (strXiOIii1.length() > 0) {
            MicrosoftSDKManage.O1O.OXO1().iI0I(strXiOIii1);
        }
        if (q62.OXO1.iX0iiiXi()) {
            WebSocketManager.INSTANCE.init(app, false);
        }
        removeVoiceHandleCallbackAll();
        addVoiceHandleCallback(new VoiceHandleCallback() { // from class: com.sma.smartv3.biz.voice.v2.VoiceManagerV2.init.1
            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onAIModelAIModelError(String msg) {
                Intrinsics.X0O(msg, "msg");
                ToastUtils.showLong(msg, new Object[0]);
                VoiceManagerV2.INSTANCE.onAIModelIdentificationError(msg, "");
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onAIModelComplete(String text) {
                Collection collectionM39402iI;
                Intrinsics.X0O(text, "text");
                if (VoiceManagerV2.INSTANCE.isSupportDevicePhoneVoiceAIChat()) {
                    try {
                        JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
                        Intrinsics.XXI(asJsonArray);
                        collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                        Iterator<JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
                        }
                    } catch (Exception unused) {
                        collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
                    }
                    List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
                    VoiceMessage voiceMessage = (VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi10);
                    if (voiceMessage.getMStatus() == 1) {
                        voiceMessage.setMStatus(0);
                        voiceMessage.setMContent(text);
                        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                        I01XX0.XIi00iiXO(I01XX0.X00O0, null, 2, null);
                    }
                }
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onAIModelProcessComplete(String text) {
                Intrinsics.X0O(text, "text");
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onIdentificationComplete(String text) {
                Collection collectionM39402iI;
                Intrinsics.X0O(text, "text");
                if (VoiceManagerV2.INSTANCE.isSupportDevicePhoneVoiceAIChat()) {
                    try {
                        JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
                        Intrinsics.XXI(asJsonArray);
                        collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                        Iterator<JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
                        }
                    } catch (Exception unused) {
                        collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
                    }
                    List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
                    I01XX0.XIi00iiXO(I01XX0.X111IO, null, 2, null);
                    listOO0Oi10.add(new VoiceMessage(0, null, 1, text, null, 0, 0, 115, null));
                    listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManagerV2.mAIMode, 19, null));
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    I01XX0.XIi00iiXO(I01XX0.X00O0, null, 2, null);
                }
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onIdentificationEndSuccess() {
                super.onIdentificationEndSuccess();
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onIdentificationError(String msg) {
                Intrinsics.X0O(msg, "msg");
                VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, msg, null, 2, null);
                ToastUtils.showLong(msg, new Object[0]);
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onIdentificationProcessComplete(String str) {
                super.onIdentificationProcessComplete(str);
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onIdentificationStartSuccess() {
                super.onIdentificationStartSuccess();
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onRecordingBeforeRecording() {
                super.onRecordingBeforeRecording();
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onRecordingResult(AITranslation aITranslation) {
                Collection collectionM39402iI;
                String text;
                if (aITranslation != null && aITranslation.getStatus() == 2 && VoiceManagerV2.INSTANCE.isSupportDevicePhoneVoiceAIChat()) {
                    try {
                        JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
                        Intrinsics.XXI(asJsonArray);
                        collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                        Iterator<JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
                        }
                    } catch (Exception unused) {
                        collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
                    }
                    List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
                    I01XX0.XIi00iiXO(I01XX0.X111IO, null, 2, null);
                    if (aITranslation == null || (text = aITranslation.getText()) == null) {
                        text = "";
                    }
                    listOO0Oi10.add(new VoiceMessage(0, null, 1, text, null, 0, 0, 115, null));
                    listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManagerV2.mAIMode, 19, null));
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    I01XX0.XIi00iiXO(I01XX0.X00O0, null, 2, null);
                }
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public void onRecordingResultError(String error) {
                Intrinsics.X0O(error, "error");
                VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, error, null, 2, null);
                ToastUtils.showLong(error, new Object[0]);
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onRecordingStartRecording() {
                super.onRecordingStartRecording();
            }

            @Override // com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback
            public /* bridge */ void onRecordingStop() {
                super.onRecordingStop();
            }
        });
    }

    public final void initMicrosoftSDKManage() {
        MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
        xIi00iiXO.OXO1().OX110i();
        MicrosoftSDKManage microsoftSDKManageOXO1 = xIi00iiXO.OXO1();
        Application application = mApp;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        microsoftSDKManageOXO1.iiIOiX(application);
        xIi00iiXO.OXO1().iIi1(AIIdentificationManager.INSTANCE.getMicrosoftCallBack(), TAG);
        microsoftTime = FIRST_IDENTIFY_TIME;
    }

    public final boolean isConductEarPhone() {
        int i = mVoiceMode;
        return i == 3 || i == 4;
    }

    public final boolean isSpeechRecRunning() {
        return isSpeechRecRunning;
    }

    public final boolean isSupportAIWatchface() {
        return mVoiceMode == 1 && q62.OXO1.OiXXXi10();
    }

    public final boolean isSupportDevicePhoneVoiceAIChat() {
        return mVoiceMode == 0;
    }

    public final boolean isTranslation() {
        int i = mVoiceMode;
        return i == 2 || i == 4;
    }

    public final boolean isVoiceAIIdentify() {
        return mVoiceMode == 6;
    }

    public final boolean isVoiceAiChatContext() {
        return mVoiceMode == 10 && q62.OXO1.Xi1XO00();
    }

    public final boolean isVoiceHandlerCallbackExist(@aa1 VoiceHandleCallback mVoiceHandleCallback) {
        Intrinsics.X0O(mVoiceHandleCallback, "mVoiceHandleCallback");
        return getMVoiceHandleCallbacks().contains(mVoiceHandleCallback);
    }

    public final void onAIResultConsumption(@tb1 String str, int i) {
        if (str == null || str.length() <= 0) {
            sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), "");
            return;
        }
        if (i != -1) {
            mVoiceMode = i;
        }
        AIModelManagerV2.INSTANCE.textAIFunction(str, mAIModelCallback, mAIMode);
    }

    @sf5(tag = I01XX0.i100IXOX)
    public final void onStopVoice(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onStopVoice");
        stop();
    }

    public final void removeVoiceHandleCallback(@aa1 VoiceHandleCallback mVoiceHandleCallback) {
        Intrinsics.X0O(mVoiceHandleCallback, "mVoiceHandleCallback");
        if (isVoiceHandlerCallbackExist(mVoiceHandleCallback)) {
            getMVoiceHandleCallbacks().remove(mVoiceHandleCallback);
        }
    }

    public final void removeVoiceHandleCallbackAll() {
        getMVoiceHandleCallbacks().clear();
    }

    public final void sendError(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        isSpeechRecRunning = false;
        senAudioTextToDevice(new BleVoice(0, 0, mVoiceMode, null, System.currentTimeMillis(), text, 10, null));
    }

    public final void sendTranslationResult(@tb1 String str, @tb1 String str2) {
        if (str != null) {
            sendTranslationResultInput(str);
        }
        if (str2 != null) {
            sendTranslationResultOutput(str2);
        }
    }

    public final void sendTranslationResultOutput(@aa1 String outputText) {
        Intrinsics.X0O(outputText, "outputText");
        senAudioTextToDevice(new BleVoice(1, 0, mVoiceMode, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(outputText).toString(), 10, null));
    }

    public final void setAloneCallBack(boolean z) {
        isAloneCallback = z;
    }

    public final void setMSavePcmTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mSavePcmTime = str;
    }

    public final void setSpeechRecRunning(boolean z) {
        isSpeechRecRunning = z;
    }

    public final void stop() {
        RecordingManager.Companion.getInstance().stopRecording();
        MicrosoftSDKManage.O1O.OXO1().iX01();
        AISparkChainManager.OXO1.iOI();
        DcsTtsPlayer.INSTANCE.stop();
        AIWatchFaceManager.OXO1.OII();
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> AndroidNetworking.cancelAll stop ");
        AndroidNetworking.cancelAll();
        VoicePlayer.INSTANCE.stop();
    }
}
