package com.sma.smartv3.biz.voice;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.ke5;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xp5;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.androidnetworking.interfaces.UploadProgressListener;
import com.baidu.p559ai.speech.realtime.full.connection.Runner;
import com.baidu.p559ai.speech.realtime.full.download.Result;
import com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.dcs.DcsToken;
import com.sma.smartv3.biz.p605ai.AIBase;
import com.sma.smartv3.biz.p605ai.AIError;
import com.sma.smartv3.biz.p605ai.SSE;
import com.sma.smartv3.biz.p605ai.completion.chat.ChatCompletionResult;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.GetDcsToken;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.ai_note.AiNoteUtil;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
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
import com.szabh.smable3.entity.Languages;
import com.szabh.smable3.entity.MusicCommand;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.ToLongFunction;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,2515:1\n1869#2,2:2516\n1563#2:2522\n1634#2,2:2523\n1636#2:2526\n1563#2:2534\n1634#2,2:2535\n1636#2:2538\n1869#2,2:2541\n1#3:2518\n39#4,3:2519\n42#4:2525\n44#4,2:2527\n31#4,2:2529\n39#4,3:2531\n42#4:2537\n44#4,2:2539\n31#4,2:2543\n18#4,2:2578\n15#4:2580\n176#5,11:2545\n196#5:2564\n183#5,4:2565\n196#5:2577\n252#6,7:2556\n270#6:2563\n252#6,7:2569\n270#6:2576\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n*L\n508#1:2516,2\n681#1:2522\n681#1:2523,2\n681#1:2526\n1388#1:2534\n1388#1:2535,2\n1388#1:2538\n1391#1:2541,2\n681#1:2519,3\n681#1:2525\n681#1:2527,2\n685#1:2529,2\n1388#1:2531,3\n1388#1:2537\n1388#1:2539,2\n1396#1:2543,2\n1664#1:2578,2\n1664#1:2580\n1603#1:2545,11\n1603#1:2564\n1637#1:2565,4\n1637#1:2577\n1603#1:2556,7\n1603#1:2563\n1637#1:2569,7\n1637#1:2576\n*E\n"})
public final class VoiceManager {

    @aa1
    private static final String TAG = "AIManager VoiceManager";

    @aa1
    private static final String TAG_OPENAICHATCOMPLETION = "openAiChatCompletion";
    private static boolean isActivityData;
    private static boolean isAiTaskRunning;
    private static boolean isEndInOperation;
    private static volatile boolean isRealTimeRunning;
    private static boolean isReceiveRecordPacket;
    private static boolean isSendResults;
    private static boolean isSpeechRecRunning;
    private static Application mApp;

    @tb1
    private static ThreadUtils.SimpleTask<Void> mDuserTask;

    @tb1
    private static Runner mFullRunner;

    @tb1
    private static PipedInputStream mInputStream;

    @tb1
    private static Function3<? super Integer, ? super Integer, ? super Integer, Boolean> mListener;

    @tb1
    private static ThreadUtils.SimpleTask<Void> mOpenAiTask;

    @tb1
    private static OpusManager mOpusManager;

    @tb1
    private static PipedOutputStream mOutputStream;
    private static int mVoiceMode;
    private static boolean resetCallBack;

    @aa1
    public static final VoiceManager INSTANCE = new VoiceManager();

    @aa1
    private static final File mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");

    @aa1
    private static String mSavePcmTime = "";

    @aa1
    private static final File mPcmFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.pcm");

    @aa1
    private static final File mWavFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.wav");
    private static int mLanguage = -1;
    private static int mToLanguage = -1;
    private static int mAIMode = -1;
    private static int mVoiceType = -1;

    @aa1
    private static final VoiceManager$mBleHandleCallback$1 mBleHandleCallback = new BleHandleCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager$mBleHandleCallback$1
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
        public void onReceiveRecordPacket(BleRecordPacket recordPacket) throws Throwable {
            Function3<Integer, Integer, Integer, Boolean> mListener2;
            Intrinsics.X0O(recordPacket, "recordPacket");
            if (recordPacket.getMMode() == 5) {
                DcsTtsPlayer.INSTANCE.replayMusic();
                return;
            }
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            voiceManager.setMVoiceMode(recordPacket.getMMode());
            voiceManager.setRecordBluetooth(voiceManager.isSupportEarPhoneVoiceTranslation() || voiceManager.isSupportEarPhoneVoiceAIChat());
            if (recordPacket.getMStatus() == 0) {
                VoiceManager.mAIMode = -1;
                if (i72.OXO1.I0IIOI()) {
                    int mAIMode2 = recordPacket.getMAIMode();
                    if (mAIMode2 == 0) {
                        VoiceManager.mAIMode = 0;
                    } else if (mAIMode2 == 1) {
                        VoiceManager.mAIMode = 1;
                    } else if (mAIMode2 == 2) {
                        VoiceManager.mAIMode = 2;
                    } else if (mAIMode2 == 3) {
                        VoiceManager.mAIMode = 3;
                    }
                }
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager , mAIMode = " + VoiceManager.mAIMode + " ");
            }
            int mStatus = recordPacket.getMStatus();
            voiceManager.setReceiveRecordPacket(mStatus == 0 || mStatus == 1);
            if (voiceManager.getMListener() != null && (mListener2 = voiceManager.getMListener()) != null) {
                mListener2.invoke(Integer.valueOf(recordPacket.getMMode()), Integer.valueOf(recordPacket.getMStatus()), Integer.valueOf(recordPacket.getMEarDirection()));
            }
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("AIManager VoiceManager mode:" + recordPacket.getMMode() + " status:" + recordPacket.getMStatus());
            if (recordPacket.getMMode() == 6 || recordPacket.getMMode() == 7) {
                AiNoteUtil.OXO1.iOO1ii1(recordPacket);
                return;
            }
            i1o0oxo1o.OXO1("AIManager VoiceManager RecordPacket:" + recordPacket);
            voiceManager.getAiTranslationType(recordPacket);
            VoiceManager.postEvent$default(voiceManager, I01XX0.X111IO, null, 2, null);
            q62 q62Var = q62.OXO1;
            if (q62Var.X11I()) {
                if (a01.OXO1.OXO1().getBoolean(b01.iIXX0i, false)) {
                    return;
                }
                voiceManager.toMicrosoftIdentify(recordPacket);
                return;
            }
            if (q62Var.XOX() && q62Var.iX0iiiXi() && voiceManager.isSupportDevicePhoneVoiceAIChat() && !voiceManager.isVoiceAIIdentify()) {
                voiceManager.toWebSocketRecordPacket(recordPacket);
                return;
            }
            if (q62Var.Xi1XO00() && voiceManager.getMVoiceMode() == 10) {
                voiceManager.toWebSocketRecordPacket(recordPacket);
                return;
            }
            if (q62Var.XOX() || VoiceManager.mAIMode == 0 || VoiceManager.mAIMode == 1 || VoiceManager.mAIMode == 3) {
                voiceManager.newReceiveRecordPacket(recordPacket);
            } else {
                voiceManager.oldReceiveRecordPacket(recordPacket);
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
            if (z) {
                return;
            }
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            if (voiceManager.isSpeechRecRunning()) {
                voiceManager.setSpeechRecRunning(false);
            }
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
    private static String microsoftLanguage = "zh-CN";

    @aa1
    private static String microsoftTtsName = "zh-CN-XiaoxiaoNeural";

    @aa1
    private static String microsoftTtsLanguage = "zh-CN";
    private static boolean isRecordBluetooth = true;

    @aa1
    private static String mContentResult = "";

    @aa1
    private static final MicrosoftSDKManage.InterfaceC19048iO microsoftCallBack = new MicrosoftSDKManage.InterfaceC19048iO() { // from class: com.sma.smartv3.biz.voice.VoiceManager$microsoftCallBack$1
        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(int i, String str) throws Throwable {
            Intrinsics.X0O(str, "str");
            if (i == 1 && str.length() > 0) {
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                if (!voiceManager.isSpeechRecRunning()) {
                    voiceManager.sendTranslationResultInput(str);
                }
            }
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            VoiceManager voiceManager2 = VoiceManager.INSTANCE;
            i1o0oxo1o.OXO1("AIManager VoiceManager microsoftCallBack stopAudioStreamInput onIdentifyResults -> status = " + i + "  isSpeechRecRunning = " + voiceManager2.isSpeechRecRunning());
            if (i == 2 && str.length() > 0) {
                voiceManager2.setSendResults(false);
                voiceManager2.setMContentResult(str);
            }
            if (q62.OiO0IOX(q62.OXO1, null, 1, null) && i == 2) {
                voiceManager2.setSpeechRecRunning(false);
            }
            if (i == 2 && str.length() > 0 && !voiceManager2.isSpeechRecRunning()) {
                voiceManager2.setSendResults(true);
                voiceManager2.sendContentResult(str);
            }
            if (i == 2 && str.length() == 0 && !voiceManager2.isSpeechRecRunning()) {
                voiceManager2.setSendResults(true);
                DcsTtsPlayer.INSTANCE.stop();
                voiceManager2.sendTranslationResultInput(UtilsKt.XXO(R.string.request_error));
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int i, String str, String str2) {
            super.onIdentifyResultsDetectedLanguage(i, str, str2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onStartTransmission ");
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            voiceManager.setSendResults(false);
            voiceManager.setMContentResult("");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() throws Throwable {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            i1o0oxo1o.OXO1("AIManager VoiceManager microsoftCallBack onStopTransmission -> mContentResult = " + voiceManager.getMContentResult() + " isSendResults = " + voiceManager.isSendResults() + " isSpeechRecRunning = " + voiceManager.isSpeechRecRunning());
            if (voiceManager.isSendResults()) {
                return;
            }
            voiceManager.setSpeechRecRunning(false);
            i1o0oxo1o.OXO1("AIManager VoiceManager microsoftCallBack onStopTransmission -> mContentResult = " + voiceManager.getMContentResult() + "  isSpeechRecRunning = " + voiceManager.isSpeechRecRunning());
            if (voiceManager.getMContentResult().length() > 0) {
                voiceManager.sendContentResult(voiceManager.getMContentResult());
            } else {
                DcsTtsPlayer.INSTANCE.stop();
                voiceManager.sendTranslationResultInput(UtilsKt.XXO(R.string.request_error));
            }
        }
    };

    @aa1
    private static final RecordingManager.OnRecordingCallback recordingCallBack = new RecordingManager.OnRecordingCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager$recordingCallBack$1
        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(final AITranslation aITranslation) {
            String text;
            String string;
            if (aITranslation == null || (text = aITranslation.getText()) == null || (string = StringsKt__StringsKt.iX1X1(text).toString()) == null || string.length() <= 0) {
                VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), "");
                ToastUtils.showLong(R.string.speech_recognition_error);
                return;
            }
            if (aITranslation.getStatus() == 2) {
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                if (voiceManager.isVoiceAIIdentify()) {
                    voiceManager.sendTranslationResultInput(aITranslation.getText());
                    return;
                }
                if (!voiceManager.isSupportAIVoiceWatchface()) {
                    if (!voiceManager.isSupportEarPhoneVoiceTranslation() && !voiceManager.isSupportAIVoiceTranslation()) {
                        voiceManager.aISparkChainManagerHandleResponse(aITranslation);
                        return;
                    }
                    Languages languages = Languages.INSTANCE;
                    String aISparkTargetLang = languages.formatAISparkTargetLang(voiceManager.getMLanguage(), Languages.DEFAULT_LANGUAGE_ZH);
                    final String aISparkTargetLang2 = languages.formatAISparkTargetLang(voiceManager.getMToLanguage(), Languages.DEFAULT_LANGUAGE);
                    if (Intrinsics.XOO0ii0(aISparkTargetLang, "cn") || Intrinsics.XOO0ii0(aISparkTargetLang2, "cn")) {
                        VoiceManager.translateITS$default(voiceManager, aITranslation.getText(), aISparkTargetLang, aISparkTargetLang2, null, 8, null);
                        return;
                    } else {
                        AISparkChainManager.OXO1.IX1XiI(aITranslation.getText(), aISparkTargetLang, "cn", new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$recordingCallBack$1$onRecordResult$2
                            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                            public void handleError(String error) {
                                Intrinsics.X0O(error, "error");
                                VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.voice_assistant_common_error), UtilsKt.XXO(R.string.failed_in_translation));
                            }

                            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                            public void handleResponse(String str) {
                                if (str == null || str.length() <= 0) {
                                    VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.voice_assistant_common_error), UtilsKt.XXO(R.string.failed_in_translation));
                                } else {
                                    VoiceManager.INSTANCE.translateITS(aITranslation.getText(), "cn", aISparkTargetLang2, str);
                                }
                            }
                        });
                        return;
                    }
                }
                voiceManager.sendTranslationResultInput(aITranslation.getText());
                String language = Locale.getDefault().getLanguage();
                if (Intrinsics.XOO0ii0(language, "in")) {
                    language = "id";
                }
                if (Intrinsics.XOO0ii0(language, Languages.DEFAULT_LANGUAGE_ZH) || Intrinsics.XOO0ii0("cn", language)) {
                    AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, aITranslation.getText(), null, 0, 6, null);
                    return;
                }
                AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                String text2 = aITranslation.getText();
                O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$recordingCallBack$1$onRecordResult$1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.generate_failed), "");
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleResponse(String str) {
                        if (str == null || str.length() <= 0) {
                            VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.generate_failed), "");
                        } else {
                            AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, str, null, 0, 6, null);
                        }
                    }
                };
                Intrinsics.XXI(language);
                aISparkChainManager.IX1XiI(text2, language, "cn", o1XIiIO);
            }
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String error) {
            Intrinsics.X0O(error, "error");
            ToastUtils.showLong(R.string.speech_recognition_error);
            VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), UtilsKt.XXO(R.string.failed_in_translation));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech aISpeech) {
            super.onRecordResultLanguage(aISpeech);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
        }
    };
    private static final long FIRST_IDENTIFY_TIME = 2000;
    private static final long SECOND_IDENTIFY_TIME = 1000;
    private static final long CONVENTIONAL_IDENTIFY_TIME = 100;
    private static long microsoftTime = 2000;

    @aa1
    private static final O1XIiIO<AIAnswer> mAISparkChainManagerCallback = new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$mAISparkChainManagerCallback$1
        private int index;
        private long lastSendTime = System.currentTimeMillis();

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            VoiceManager.isAiTaskRunning = false;
            voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_common_error));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004f  */
        /* JADX WARN: Code duplicated, block: B:14:0x005b  */
        /* JADX WARN: Instruction removed from duplicated block: B:14:0x005b, please report this as an issue */
        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(AIAnswer aIAnswer) {
            String text;
            Collection collectionM39402iI;
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mAISparkChainManagerCallback handleResponse -> " + aIAnswer);
            if (aIAnswer != null) {
                int i = this.index + 1;
                this.index = i;
                if (i == 1 || aIAnswer.getEnded() == 1) {
                    text = aIAnswer.getText();
                    if (q62.OXO1.OXOI0XII()) {
                        text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                    }
                    String str = text;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    voiceManager.senAudioTextToDevice(new BleVoice(1, 0, voiceManager.getMVoiceMode(), null, jCurrentTimeMillis, str, 10, null));
                    BleConnector.INSTANCE.setDisableStreamLog(true);
                    this.lastSendTime = System.currentTimeMillis();
                } else {
                    byte[] bytes = aIAnswer.getText().getBytes(Charsets.XIi00iiXO);
                    Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                    if (bytes.length < BleVoice.Companion.getCONTENT_MAX_LENGTH() && System.currentTimeMillis() - this.lastSendTime > 500) {
                        text = aIAnswer.getText();
                        if (q62.OXO1.OXOI0XII()) {
                            text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                        }
                        String str2 = text;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                        voiceManager2.senAudioTextToDevice(new BleVoice(1, 0, voiceManager2.getMVoiceMode(), null, jCurrentTimeMillis2, str2, 10, null));
                        BleConnector.INSTANCE.setDisableStreamLog(true);
                        this.lastSendTime = System.currentTimeMillis();
                    }
                }
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
                    if (aIAnswer.getEnded() == 1) {
                        voiceMessage.setMStatus(0);
                        VoiceManager voiceManager3 = VoiceManager.INSTANCE;
                        VoiceManager.isAiTaskRunning = false;
                    }
                    voiceMessage.setMContent(aIAnswer.getText());
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                }
            }
        }
    };

    private VoiceManager() {
    }

    public static /* synthetic */ void AIChat$default(VoiceManager voiceManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "tag";
        }
        voiceManager.AIChat(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aiTranscriptionsAudio$default(VoiceManager voiceManager, File file, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        voiceManager.aiTranscriptionsAudio(file, o1XIiIO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aiTranscriptionsAudio$lambda$0(long j, long j2) {
    }

    private final void aiTranscriptionsAudioFile(File file) {
        aiTranscriptionsAudio(file, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.aiTranscriptionsAudioFile.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                Collection collectionM39402iI;
                if (str != null) {
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    voiceManager.setSpeechRecRunning(false);
                    voiceManager.sendMsg(str);
                    if (voiceManager.isVoiceAIIdentify()) {
                        return;
                    }
                    if (voiceManager.isSupportAIVoiceWatchface()) {
                        AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, str, null, 0, 6, null);
                        return;
                    }
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
                    VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                    VoiceManager.postEvent$default(voiceManager2, I01XX0.X111IO, null, 2, null);
                    listOO0Oi10.add(new VoiceMessage(0, null, 1, str, null, 0, 0, 115, null));
                    listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManager.mAIMode, 19, null));
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    VoiceManager.postEvent$default(voiceManager2, I01XX0.X00O0, null, 2, null);
                    voiceManager2.AIChat(str, "aiTranscriptionsAudioFile");
                }
            }
        });
    }

    public static /* synthetic */ void checkBaiduAuth$default(VoiceManager voiceManager, Activity activity, View view, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        if ((i & 2) != 0) {
            view = null;
        }
        voiceManager.checkBaiduAuth(activity, view, function1);
    }

    private final void deleteFiles() {
        FileUtils.delete(mOpusFile);
        FileUtils.delete(mPcmFile);
        FileUtils.delete(mWavFile);
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.O10IXXX0X(str, "format(...)");
        mSavePcmTime = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newReceiveRecordPacket$lambda$0(boolean z) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm error " + z);
        if (z) {
            VoiceManager voiceManager = INSTANCE;
            if (!voiceManager.isSupportAIVoiceTranslation() || mLanguage == -1 || mToLanguage == -1) {
                voiceManager.pcmToWav();
            } else {
                voiceManager.sendAISparkChainTranslation();
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oldOpenAiChatCompletion() {
        openAiTranscriptionsAudio(mWavFile, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.oldOpenAiChatCompletion.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                if (StringsKt__StringsKt.iIi011O(error, "invalid_request_error", false, 2, null)) {
                    VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.invalid_api_key_tip));
                } else {
                    VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.openai_request_error));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                Collection collectionM39402iI;
                if (str != null) {
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    voiceManager.setSpeechRecRunning(false);
                    voiceManager.sendMsg(str);
                    if (voiceManager.isVoiceAIIdentify()) {
                        return;
                    }
                    if (voiceManager.isSupportAIVoiceWatchface()) {
                        AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, str, null, 0, 6, null);
                        return;
                    }
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
                    VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                    VoiceManager.postEvent$default(voiceManager2, I01XX0.X111IO, null, 2, null);
                    listOO0Oi10.add(new VoiceMessage(0, null, 1, str, null, 0, 0, 115, null));
                    listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManager.mAIMode, 19, null));
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    VoiceManager.postEvent$default(voiceManager2, I01XX0.X00O0, null, 2, null);
                    voiceManager2.openAiChatCompletion(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oldReceiveRecordPacketSC$lambda$0(boolean z) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm  " + z);
        if (z) {
            VoiceManager voiceManager = INSTANCE;
            if (!voiceManager.isSupportAIVoiceTranslation() || mLanguage == -1 || mToLanguage == -1) {
                q62 q62Var = q62.OXO1;
                if (q62Var.OIXOOi()) {
                    voiceManager.sendAISparkChainIdentify();
                } else if (q62Var.IiX1ii()) {
                    voiceManager.recognition();
                } else {
                    new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), mWavFile.getPath());
                    voiceManager.oldOpenAiChatCompletion();
                }
            } else {
                voiceManager.sendAISparkChainTranslation();
            }
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openAiCheck$default(VoiceManager voiceManager, String str, O1XIiIO o1XIiIO, Activity activity, View view, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        if ((i & 4) != 0) {
            activity = null;
        }
        if ((i & 8) != 0) {
            view = null;
        }
        voiceManager.openAiCheck(str, o1XIiIO, activity, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openAiTranscriptionsAudio$default(VoiceManager voiceManager, File file, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        voiceManager.openAiTranscriptionsAudio(file, o1XIiIO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openAiTranscriptionsAudio$lambda$0(long j, long j2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pcmToWav() {
        gq1 gq1Var = new gq1(16000, 16, 2);
        String path = mPcmFile.getPath();
        File file = mWavFile;
        gq1Var.OXO1(path, file.getPath());
        INSTANCE.aiTranscriptionsAudioFile(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollCheckStop() {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.sma.smartv3.biz.voice.VoiceManager$pollCheckStop$timerTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (VoiceManager.mFullRunner != null) {
                    Runner runner = VoiceManager.mFullRunner;
                    Intrinsics.XXI(runner);
                    if (runner.isClosed()) {
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        VoiceManager.isRealTimeRunning = false;
                    }
                }
                if (VoiceManager.isRealTimeRunning) {
                    return;
                }
                cancel();
                timer.cancel();
                VoiceManager.INSTANCE.stopRealTime();
            }
        }, 500L, 500L);
    }

    public static /* synthetic */ void postEvent$default(VoiceManager voiceManager, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = new Object();
        }
        voiceManager.postEvent(str, obj);
    }

    private final void savePcmFile() {
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.xi6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return VoiceManager.savePcmFile$lambda$0();
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savePcmFile$lambda$0() throws InterruptedException {
        if (mSavePcmTime.length() > 0) {
            Thread.sleep(2000L);
            File file = new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm");
            if (!file.exists()) {
                FileUtils.createOrExistsDir(file);
            }
            FileUtils.copy(mPcmFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + mSavePcmTime + ".pcm"));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                final Function1 function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.yi6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Long.valueOf(((File) obj).lastModified());
                    }
                };
                Comparator comparatorComparingLong = Comparator.comparingLong(new ToLongFunction() { // from class: com.android.mltcode.paycertificationapi.zi6
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return VoiceManager.savePcmFile$lambda$0$1(function1, obj);
                    }
                });
                Intrinsics.O10IXXX0X(comparatorComparingLong, "comparingLong(...)");
                ArraysKt___ArraysJvmKt.O1I(fileArrListFiles, comparatorComparingLong);
                if (fileArrListFiles.length > 10) {
                    ((File) ArraysKt___ArraysKt.IO0(fileArrListFiles)).delete();
                }
            }
            mSavePcmTime = "";
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long savePcmFile$lambda$0$1(Function1 function1, Object obj) {
        return ((Number) function1.invoke2(obj)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendContentResult(String str) throws Throwable {
        String str2;
        if (StringsKt__StringsKt.iX1X1(str).toString().length() == 0) {
            sendTranslationResultInput(UtilsKt.XXO(R.string.speech_recognition_error));
            return;
        }
        if (isVoiceAIIdentify()) {
            sendTranslationResultInput(str);
            return;
        }
        synchronized (str) {
            try {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager  sendContentResult  str");
                VoiceManager voiceManager = INSTANCE;
                voiceManager.sendTranslationResultInput(str);
                try {
                    if (voiceManager.isSupportAIVoiceWatchface()) {
                        str2 = str;
                        AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, str2, null, mAIMode, 2, null);
                    } else {
                        str2 = str;
                        if (voiceManager.isSupportEarPhoneVoiceTranslation() || voiceManager.isSupportAIVoiceTranslation()) {
                            String microsoftTargetLang = Languages.INSTANCE.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
                            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
                            xIi00iiXO.OXO1().IXI();
                            xIi00iiXO.OXO1().m38826OI(str2, microsoftTargetLang, new Function1() { // from class: com.android.mltcode.paycertificationapi.dj6
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return VoiceManager.sendContentResult$lambda$0$0((String) obj);
                                }
                            });
                        } else {
                            voiceManager.toAIChatManagerHandleResponse(str2);
                        }
                    }
                    Unit unit = Unit.OXO1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendContentResult$lambda$0$0(String it) {
        Intrinsics.X0O(it, "it");
        DcsTtsPlayer.INSTANCE.stop();
        INSTANCE.sendTranslationResultOutput(it);
        MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(it, microsoftTtsName);
        mContentResult = "";
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendError(String str) {
        isSpeechRecRunning = false;
        sendMsg(str);
    }

    public static /* synthetic */ void sendError$default(VoiceManager voiceManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Utils.getApp().getString(R.string.request_error);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        voiceManager.sendError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMsg(String str) {
        int i = 0;
        int i2 = 0;
        BleVoice.BleDeviceEmotion bleDeviceEmotion = null;
        senAudioTextToDevice(new BleVoice(i, i2, mVoiceMode, bleDeviceEmotion, System.currentTimeMillis(), str, 10, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRealTime(byte[] bArr) {
        try {
            PipedOutputStream pipedOutputStream = mOutputStream;
            if (pipedOutputStream != null) {
                pipedOutputStream.write(bArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void setLanguageType$default(VoiceManager voiceManager, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        voiceManager.setLanguageType(str, str2);
    }

    private final void startRealTime() {
        if (isRealTimeRunning) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> startRealTime");
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.startRealTime.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r1) {
            }

            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() throws IOException {
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                VoiceManager.isRealTimeRunning = true;
                VoiceManager.mInputStream = new PipedInputStream();
                VoiceManager.mOutputStream = new PipedOutputStream(VoiceManager.mInputStream);
                VoiceManager.mFullRunner = new Runner(VoiceManager.mInputStream, 2);
                Runner runner = VoiceManager.mFullRunner;
                if (runner != null) {
                    runner.run(new SimpleDownloader() { // from class: com.sma.smartv3.biz.voice.VoiceManager$startRealTime$1$doInBackground$1
                        @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                        public void onFailure(String reason) {
                            Intrinsics.X0O(reason, "reason");
                            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onFailure -> " + reason);
                            ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error) + "\n" + reason, new Object[0]);
                            VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                        }

                        @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                        public void onMessage(Result result) {
                            Collection collectionM39402iI;
                            Intrinsics.X0O(result, "result");
                            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onMessage -> " + result.getOrignalJsonStr());
                            VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                            voiceManager2.setSpeechRecRunning(true);
                            if (result.isError() || !result.isFin()) {
                                return;
                            }
                            String result2 = result.getResult();
                            if (TextUtils.isEmpty(result2)) {
                                voiceManager2.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                                return;
                            }
                            if (voiceManager2.isVoiceAIIdentify()) {
                                Intrinsics.XXI(result2);
                                voiceManager2.sendMsg(result2);
                                return;
                            }
                            if (voiceManager2.isSupportAIVoiceWatchface()) {
                                Intrinsics.XXI(result2);
                                voiceManager2.sendMsg(result2);
                                AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, result2, null, 0, 6, null);
                                return;
                            }
                            Application application = null;
                            if (VoiceManager.isAiTaskRunning) {
                                Application application2 = VoiceManager.mApp;
                                if (application2 == null) {
                                    Intrinsics.XXO("mApp");
                                } else {
                                    application = application2;
                                }
                                String string = application.getString(R.string.task_running_wait_tip);
                                Intrinsics.O10IXXX0X(string, "getString(...)");
                                voiceManager2.sendError(string);
                                return;
                            }
                            voiceManager2.setSpeechRecRunning(false);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Intrinsics.XXI(result2);
                            voiceManager2.senAudioTextToDevice(new BleVoice(0, 0, voiceManager2.getMVoiceMode(), null, jCurrentTimeMillis, result2, 10, null));
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
                            VoiceManager voiceManager3 = VoiceManager.INSTANCE;
                            VoiceManager.postEvent$default(voiceManager3, I01XX0.X111IO, null, 2, null);
                            listOO0Oi10.add(new VoiceMessage(0, null, 1, result2, null, 0, 0, 115, null));
                            listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManager.mAIMode, 19, null));
                            a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                            VoiceManager.postEvent$default(voiceManager3, I01XX0.X00O0, null, 2, null);
                            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onMessage -> start query: " + result2);
                            voiceManager3.voiceQuery(result2);
                        }
                    });
                }
                voiceManager.pollCheckStop();
                return null;
            }
        });
    }

    public static /* synthetic */ void startTransfer$default(VoiceManager voiceManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        voiceManager.startTransfer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stopRealTime() {
        try {
            PipedInputStream pipedInputStream = mInputStream;
            if (pipedInputStream != null) {
                pipedInputStream.close();
            }
            PipedOutputStream pipedOutputStream = mOutputStream;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mInputStream = null;
            mOutputStream = null;
            mFullRunner = null;
            isRealTimeRunning = false;
        }
    }

    private final void toAIChatManagerHandleResponse(String str) {
        Collection collectionM39402iI;
        int i;
        if (isVoiceAIIdentify()) {
            sendMsg(str);
            return;
        }
        if (isSupportAIVoiceWatchface()) {
            AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, str, null, 0, 6, null);
            return;
        }
        sendMsg(str);
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
        VoiceManager voiceManager = INSTANCE;
        postEvent$default(voiceManager, I01XX0.X111IO, null, 2, null);
        listOO0Oi10.add(new VoiceMessage(0, null, 1, str, null, 0, 0, 115, null));
        listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, mAIMode, 19, null));
        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
        postEvent$default(voiceManager, I01XX0.X00O0, null, 2, null);
        if (i72.OXO1.I0IIOI() && (i = mAIMode) >= 0 && i <= 3) {
            if (i == 2) {
                q62 q62Var = q62.OXO1;
                if (q62Var.OIXOOi()) {
                    AISparkChainManager.OXO1.iXiiiO(str, mAISparkChainManagerCallback, q62Var.iXOII(), true);
                    return;
                }
            }
            AIChat(str, "toAIChatManagerHandleResponse");
            return;
        }
        q62 q62Var2 = q62.OXO1;
        if (q62Var2.OIXOOi()) {
            AISparkChainManager.OXO1.iXiiiO(str, mAISparkChainManagerCallback, q62Var2.iXOII(), true);
            return;
        }
        if (q62Var2.XOX()) {
            AIChat(str, "toAIChatManagerHandleResponse isUseAIService");
        } else if (q62Var2.IiX1ii()) {
            voiceQuery(str);
        } else {
            openAiChatCompletion(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void translateITS(final String str, String str2, final String str3, String str4) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager  translateITS leftLang = " + str2 + " , rightLang = " + str3);
        AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
        if (str4.length() == 0) {
            str4 = str;
        }
        aISparkChainManager.IX1XiI(str4, str2, str3, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.translateITS.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                VoiceManager.INSTANCE.sendTranslationResult(str, UtilsKt.XXO(R.string.voice_assistant_common_error));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str5) {
                if (str5 == null || str5.length() <= 0) {
                    VoiceManager.INSTANCE.sendTranslationResult(str, UtilsKt.XXO(R.string.voice_assistant_common_error));
                    return;
                }
                VoiceManager.INSTANCE.sendTranslationResult(str, str5);
                DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                dcsTtsPlayer.initSegmentation();
                DcsTtsPlayer.play$default(dcsTtsPlayer, str5, true, false, null, LanguageTranslationKt.getTranslationLanguageTtsName(str3), "translateITS", 12, null);
            }
        });
    }

    public static /* synthetic */ void translateITS$default(VoiceManager voiceManager, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "cn";
        }
        if ((i & 4) != 0) {
            str3 = Languages.DEFAULT_LANGUAGE;
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        voiceManager.translateITS(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceQuery$lambda$0(String str, boolean z) {
        if (z) {
            INSTANCE.duserStreamChat(str);
        }
        return Unit.OXO1;
    }

    public final void AIChat(@aa1 final String query, @aa1 String tag) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(tag, "tag");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager AIChat " + tag + i1iXIO.XO0O10 + query);
        isAiTaskRunning = true;
        AIManager.OXO1.iIXi1iiXI(new AIQuestion(AIFunctionType.AI, query, null, null, false, false, 60, null), new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.AIChat.1
            private int index;
            private long lastSendTime = System.currentTimeMillis();

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
            
                if (r7.equals("5003") == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
            
                if (r7.equals("5002") == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
            
                if (r7.equals("5001") == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
            
                if (r7.equals("4006") == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
            
                r1.postEvent(com.android.mltcode.paycertificationapi.b01.II1, r7);
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("AIManager VoiceManager AIChat -> error:" + error + ", index:" + this.index);
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                VoiceManager.isAiTaskRunning = false;
                if (StringsKt__StringsKt.iIi011O(error, "200", false, 2, null) || oe5.m2764O0(error, "java.net.SocketException", false, 2, null)) {
                    i1o0oxo1o.OXO1("AIManager VoiceManager AIChat -> error:, index:" + this.index);
                    return;
                }
                ToastUtils.showLong(error, new Object[0]);
                i1o0oxo1o.OXO1("AIManager VoiceManager AIChat ->  error: 11 " + error);
                switch (error.hashCode()) {
                    case 1537218:
                        if (error.equals("2004")) {
                            ToastUtils.showLong(R.string.login_user_info_error);
                        }
                        voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                        break;
                    case 1596802:
                        break;
                    case 1626588:
                        break;
                    case 1626589:
                        break;
                    case 1626590:
                        break;
                    case 3392903:
                        if (error.equals("null")) {
                            voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_common_error));
                        }
                        voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                        break;
                    default:
                        voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                        break;
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0059  */
            /* JADX WARN: Code duplicated, block: B:14:0x0065  */
            /* JADX WARN: Instruction removed from duplicated block: B:14:0x0065, please report this as an issue */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(AIAnswer aIAnswer) {
                String text;
                Collection collectionM39402iI;
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager AIChat handleResponse -> " + query + " " + aIAnswer);
                if (aIAnswer != null) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i == 1 || aIAnswer.getEnded() == 1) {
                        text = aIAnswer.getText();
                        if (q62.OXO1.OXOI0XII()) {
                            text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                        }
                        String str = text;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        voiceManager.senAudioTextToDevice(new BleVoice(1, 0, voiceManager.getMVoiceMode(), null, jCurrentTimeMillis, str, 10, null));
                        BleConnector.INSTANCE.setDisableStreamLog(true);
                        this.lastSendTime = System.currentTimeMillis();
                    } else {
                        byte[] bytes = aIAnswer.getText().getBytes(Charsets.XIi00iiXO);
                        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                        if (bytes.length < BleVoice.Companion.getCONTENT_MAX_LENGTH() && System.currentTimeMillis() - this.lastSendTime > 120) {
                            text = aIAnswer.getText();
                            if (q62.OXO1.OXOI0XII()) {
                                text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                            }
                            String str2 = text;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                            voiceManager2.senAudioTextToDevice(new BleVoice(1, 0, voiceManager2.getMVoiceMode(), null, jCurrentTimeMillis2, str2, 10, null));
                            BleConnector.INSTANCE.setDisableStreamLog(true);
                            this.lastSendTime = System.currentTimeMillis();
                        }
                    }
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
                        if (aIAnswer.getEnded() == 1) {
                            voiceMessage.setMStatus(0);
                            VoiceManager voiceManager3 = VoiceManager.INSTANCE;
                            VoiceManager.isAiTaskRunning = false;
                        }
                        voiceMessage.setMContent(aIAnswer.getText());
                        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                        VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                    }
                }
            }
        }, true, false, q62.OXO1.iXOII(), mAIMode);
    }

    public final void aISparkChainManagerHandleResponse(@tb1 AITranslation aITranslation) {
        if (aITranslation != null) {
            toAIChatManagerHandleResponse(aITranslation.getText());
            return;
        }
        Application application = mApp;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        String string = application.getString(R.string.request_error);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        sendError(string);
    }

    public final void aiTranscriptionsAudio(@aa1 File file, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(file, "file");
        String strXiOIii1 = AIManager.OXO1.XiOIii1(mAIMode);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String baseUrl = netWorkUtils.getBaseUrl(GetAIAudioToText.URL_V2);
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        String language = UtilsKt.IiiXiI0I(app) ? Languages.DEFAULT_LANGUAGE_ZH : Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager aiTranscriptionsAudio -> " + file + "  toLang = " + language + " , model = " + strXiOIii1);
        AndroidNetworking.upload(baseUrl).addHeaders(netWorkUtils.getHeadersMap()).addQueryParameter("model", strXiOIii1).addQueryParameter("toLang", language).addMultipartFile("audioFile", file).setTag((Object) "aiTranscriptionsAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.wi6
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
                VoiceManager.aiTranscriptionsAudio$lambda$0(j, j2);
            }
        }).getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.voice.VoiceManager.aiTranscriptionsAudio.2
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                AIError aIError;
                Intrinsics.X0O(anError, "anError");
                AIBase aIBase = (AIBase) anError.getErrorAsObject(AIBase.class);
                if (aIBase == null || (aIError = aIBase.getError()) == null) {
                    aIError = new AIError(String.valueOf(anError.getMessage()), null, null, null, 14, null);
                }
                i1O0OXO1O.OXO1.OXO1("onError -> " + anError.getErrorBody() + ", " + aIError);
                AIManager.OXO1.O1O(aIError);
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(aIError.getMessage());
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager aiTranscriptionsAudio onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        String string = jSONObject.getString("data");
                        if (string != null) {
                            O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                            if (string.length() > 0) {
                                if (o1XIiIO2 != null) {
                                    o1XIiIO2.handleResponse(string);
                                }
                            } else {
                                ToastUtils.showLong(R.string.speech_recognition_error);
                                if (o1XIiIO2 != null) {
                                    o1XIiIO2.handleError(UtilsKt.XXO(R.string.speech_recognition_error));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        AIError aIError = new AIError(UtilsKt.XXO(R.string.voice_assistant_common_error), null, null, null, 14, null);
                        AIManager.OXO1.O1O(aIError);
                        O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                        if (o1XIiIO3 != null) {
                            o1XIiIO3.handleError(aIError.getMessage());
                        }
                    }
                }
            }
        });
    }

    public final void checkBaiduAuth(@tb1 final Activity activity, @tb1 View view, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String url = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> dcsTokenBody = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> o1XIiIO = new O1XIiIO<DcsToken>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.checkBaiduAuth.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken onError -> " + error);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(DcsToken dcsToken) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken handleResponse -> " + dcsToken);
                if (dcsToken != null) {
                    dcsToken.setTimestamp(System.currentTimeMillis());
                    a01.OXO1.IiI10X().put(DcsToken.class.getName(), new Gson().toJson(dcsToken));
                    callback.invoke2(Boolean.TRUE);
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, dcsTokenBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        final O1XIiIO<Response<DcsToken>> o1XIiIO2 = new O1XIiIO<Response<DcsToken>>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$checkBaiduAuth$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<DcsToken> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) dcsTokenBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, DcsToken.class), new ParsedRequestListener<Response<DcsToken>>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$checkBaiduAuth$$inlined$post$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<DcsToken> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
    }

    public final void destroy() {
        stop();
        BleConnector.INSTANCE.removeHandleCallback(mBleHandleCallback);
        OpusManager opusManager = mOpusManager;
        if (opusManager != null) {
            opusManager.release();
        }
        mOpusManager = null;
    }

    public final void duserStreamChat(@aa1 String query) {
        Intrinsics.X0O(query, "query");
        isAiTaskRunning = true;
        AIManager aIManager = AIManager.OXO1;
        aIManager.i0X000X0O(true);
        aIManager.X00XIX1(new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.duserStreamChat.1
            private int index;
            private long lastSendTime = System.currentTimeMillis();

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("AIManager VoiceManager duserStreamChat -> error:" + error);
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                VoiceManager.isAiTaskRunning = false;
                if (StringsKt__StringsKt.iIi011O(error, "200", false, 2, null)) {
                    i1o0oxo1o.OXO1("AIManager VoiceManager duserStreamChat -> error:异常中断, index:" + this.index);
                    return;
                }
                ToastUtils.showLong(error, new Object[0]);
                if (Intrinsics.XOO0ii0(error, "null")) {
                    voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_common_error));
                } else {
                    voiceManager.sendError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0039  */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(AIAnswer aIAnswer) {
                Collection collectionM39402iI;
                if (aIAnswer != null) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i == 1 || aIAnswer.getEnded() == 1) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String text = aIAnswer.getText();
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        voiceManager.senAudioTextToDevice(new BleVoice(1, 0, voiceManager.getMVoiceMode(), null, jCurrentTimeMillis, text, 10, null));
                        BleConnector.INSTANCE.setDisableStreamLog(true);
                        this.lastSendTime = System.currentTimeMillis();
                    } else {
                        byte[] bytes = aIAnswer.getText().getBytes(Charsets.XIi00iiXO);
                        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                        if (bytes.length < BleVoice.Companion.getCONTENT_MAX_LENGTH() && System.currentTimeMillis() - this.lastSendTime > 500) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String text2 = aIAnswer.getText();
                            VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                            voiceManager2.senAudioTextToDevice(new BleVoice(1, 0, voiceManager2.getMVoiceMode(), null, jCurrentTimeMillis2, text2, 10, null));
                            BleConnector.INSTANCE.setDisableStreamLog(true);
                            this.lastSendTime = System.currentTimeMillis();
                        }
                    }
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
                        if (aIAnswer.getEnded() == 1) {
                            voiceMessage.setMStatus(0);
                            VoiceManager voiceManager3 = VoiceManager.INSTANCE;
                            VoiceManager.isAiTaskRunning = false;
                        }
                        voiceMessage.setMContent(aIAnswer.getText());
                        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                        VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                    }
                }
            }
        });
        q62 q62Var = q62.OXO1;
        if (q62Var.OIXOOi()) {
            AISparkChainManager.OXO1.iXiiiO(query, mAISparkChainManagerCallback, q62Var.iXOII(), true);
        } else {
            aIManager.I0IIOi(query, AIFunctionType.AI, 2, q62Var.iXOII());
        }
    }

    public final void endTransfer() {
        savePcmFile();
    }

    public final void getAiTranslationType(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        if ((isSupportAIVoiceTranslation() || isSupportEarPhoneVoiceTranslation()) && recordPacket.getMStatus() == 0) {
            mLanguage = recordPacket.getMLanguage();
            mToLanguage = recordPacket.getMToLanguage();
        }
    }

    public final long getCONVENTIONAL_IDENTIFY_TIME() {
        return CONVENTIONAL_IDENTIFY_TIME;
    }

    public final long getFIRST_IDENTIFY_TIME() {
        return FIRST_IDENTIFY_TIME;
    }

    @aa1
    public final O1XIiIO<AIAnswer> getMAISparkChainManagerCallback() {
        return mAISparkChainManagerCallback;
    }

    @aa1
    public final String getMContentResult() {
        return mContentResult;
    }

    public final int getMLanguage() {
        return mLanguage;
    }

    @tb1
    public final Function3<Integer, Integer, Integer, Boolean> getMListener() {
        return mListener;
    }

    @aa1
    public final File getMOpusFile() {
        return mOpusFile;
    }

    @aa1
    public final File getMPcmFile() {
        return mPcmFile;
    }

    @aa1
    public final String getMSavePcmTime() {
        return mSavePcmTime;
    }

    public final int getMToLanguage() {
        return mToLanguage;
    }

    public final int getMVoiceMode() {
        return mVoiceMode;
    }

    public final int getMVoiceType() {
        return mVoiceType;
    }

    @aa1
    public final File getMWavFile() {
        return mWavFile;
    }

    @aa1
    public final MicrosoftSDKManage.InterfaceC19048iO getMicrosoftCallBack() {
        return microsoftCallBack;
    }

    @aa1
    public final String getMicrosoftLanguage() {
        return microsoftLanguage;
    }

    public final long getMicrosoftTime() {
        return microsoftTime;
    }

    @aa1
    public final String getMicrosoftTtsLanguage() {
        return microsoftTtsLanguage;
    }

    @aa1
    public final String getMicrosoftTtsName() {
        return microsoftTtsName;
    }

    @aa1
    public final RecordingManager.OnRecordingCallback getRecordingCallBack() {
        return recordingCallBack;
    }

    public final boolean getResetCallBack() {
        return resetCallBack;
    }

    public final long getSECOND_IDENTIFY_TIME() {
        return SECOND_IDENTIFY_TIME;
    }

    public final void goOnTransfer(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        isSpeechRecRunning = true;
        FileIOUtils.writeFileFromBytesByStream(mOpusFile, recordPacket.getMPacket(), true);
    }

    public final void init(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> init");
        O11XO1X.XO0O10().X1ii(this);
        mApp = app;
        BleConnector.INSTANCE.addHandleCallback(mBleHandleCallback);
        if (mOpusManager == null) {
            try {
                mOpusManager = new OpusManager();
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> opus init error！！！");
            }
        }
        RecordingManager.Companion companion = RecordingManager.Companion;
        companion.getInstance().init(app);
        companion.getInstance().registerSCOReceiver(app);
        companion.getInstance().setRecordingCallback(recordingCallBack);
        String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (strXiOIii1.length() > 0) {
            MicrosoftSDKManage.O1O.OXO1().iI0I(strXiOIii1);
        }
        if (q62.OXO1.iX0iiiXi()) {
            WebSocketManager.INSTANCE.init(app, false);
        }
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
        xIi00iiXO.OXO1().iIi1(microsoftCallBack, TAG);
        microsoftTime = FIRST_IDENTIFY_TIME;
    }

    public final void initV2(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        mApp = app;
    }

    public final boolean isActivityData() {
        return isActivityData;
    }

    public final boolean isEndInOperation() {
        return isEndInOperation;
    }

    public final boolean isExpired() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(DcsToken.class.getName()), (Class<Object>) DcsToken.class);
        if (objFromJson == null) {
            objFromJson = DcsToken.class.newInstance();
        }
        DcsToken dcsToken = (DcsToken) objFromJson;
        return System.currentTimeMillis() - dcsToken.getTimestamp() > ((long) dcsToken.getExpires_in());
    }

    public final boolean isReceiveRecordPacket() {
        return isReceiveRecordPacket;
    }

    public final boolean isRecordBluetooth() {
        return isRecordBluetooth;
    }

    public final boolean isSendResults() {
        return isSendResults;
    }

    public final boolean isSpeechRecRunning() {
        return isSpeechRecRunning;
    }

    public final boolean isSupportAIVoiceTranslation() {
        return mVoiceMode == 2;
    }

    public final boolean isSupportAIVoiceWatchface() {
        return mVoiceMode == 1 && q62.OXO1.OiXXXi10();
    }

    public final boolean isSupportDevicePhoneVoiceAIChat() {
        return mVoiceMode == 0;
    }

    public final boolean isSupportEarPhoneVoiceAIChat() {
        return mVoiceMode == 3;
    }

    public final boolean isSupportEarPhoneVoiceTranslation() {
        return mVoiceMode == 4;
    }

    public final boolean isTaskRunning() {
        i1O0OXO1O.OXO1.OXO1("isTaskRunning -> " + isAiTaskRunning + ", " + isSpeechRecRunning + I000IiI1O.C2156iO.XO0O10 + isReceiveRecordPacket);
        return isAiTaskRunning || isSpeechRecRunning || isReceiveRecordPacket;
    }

    public final boolean isVoiceAIIdentify() {
        return mVoiceMode == 6;
    }

    public final void newReceiveRecordPacket(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        int mStatus = recordPacket.getMStatus();
        if (mStatus != 0) {
            if (mStatus == 1) {
                goOnTransfer(recordPacket);
                return;
            }
            if (mStatus == 2) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                BleCache bleCache = BleCache.INSTANCE;
                i1o0oxo1o.OXO1("AIManager VoiceManager BleRecordPacket newReceiveRecordPacket END BleCache.mPlatform = " + bleCache.getMPlatform());
                if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                    RecordingManager.Companion.getInstance().stopRecording();
                    endTransfer();
                    return;
                }
                File file = mOpusFile;
                if (!FileUtils.isFileExists(file)) {
                    i1o0oxo1o.OXO1("AIManager VoiceManager mOpusManager ->  FileUtils.isFileExists  false ");
                    return;
                }
                stop();
                if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
                    OpusManager opusManager = mOpusManager;
                    if (opusManager != null) {
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                        String absolutePath2 = mPcmFile.getAbsolutePath();
                        Intrinsics.O10IXXX0X(absolutePath2, "getAbsolutePath(...)");
                        opusManager.decodeStream(absolutePath, absolutePath2, new Function1() { // from class: com.android.mltcode.paycertificationapi.cj6
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return VoiceManager.newReceiveRecordPacket$lambda$0(((Boolean) obj).booleanValue());
                            }
                        });
                    }
                } else {
                    OpusManager opusManager2 = mOpusManager;
                    if (opusManager2 != null) {
                        String path = file.getPath();
                        Intrinsics.O10IXXX0X(path, "getPath(...)");
                        String path2 = mPcmFile.getPath();
                        Intrinsics.O10IXXX0X(path2, "getPath(...)");
                        opusManager2.decodeFile(path, path2, new OpusManager.OnStateCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.newReceiveRecordPacket.1
                            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                            public void onComplete(String outFilePath) {
                                Intrinsics.X0O(outFilePath, "outFilePath");
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onComplete: " + outFilePath);
                                VoiceManager voiceManager = VoiceManager.INSTANCE;
                                if (!voiceManager.isSupportAIVoiceTranslation() || voiceManager.getMLanguage() == -1 || voiceManager.getMToLanguage() == -1) {
                                    voiceManager.pcmToWav();
                                } else {
                                    voiceManager.sendAISparkChainTranslation();
                                }
                            }

                            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                            public void onError(int i, String message) {
                                Intrinsics.X0O(message, "message");
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onError: code = " + i + ", message = " + message);
                                VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                            }

                            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                            public void onStart() {
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onStart");
                            }
                        });
                    }
                }
                endTransfer();
                return;
            }
            if (mStatus != 3) {
                return;
            }
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket newReceiveRecordPacket START");
        startTransfer(recordPacket.getMStatus());
    }

    public final void oldReceiveRecordPacket(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
            oldReceiveRecordPacketSC(recordPacket);
        } else {
            oldReceiveRecordPacketJL(recordPacket);
        }
    }

    public final void oldReceiveRecordPacketJL(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        q62 q62Var = q62.OXO1;
        if (q62Var.OIXOOi() || mAIMode == 2) {
            int mStatus = recordPacket.getMStatus();
            if (mStatus == 0) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL , isSupportSparkChainAI = " + q62Var.OIXOOi());
                if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                    startTransfer(recordPacket.getMStatus());
                    return;
                }
                stop();
                DcsTtsPlayer.INSTANCE.deleteReplayMusic();
                RecordingManager.startRealTimeASR$default(RecordingManager.Companion.getInstance(), null, 1, null);
                OpusManager opusManager = mOpusManager;
                if (opusManager != null) {
                    opusManager.stopDecodeStream();
                }
                OpusManager opusManager2 = mOpusManager;
                if (opusManager2 != null) {
                    opusManager2.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.oldReceiveRecordPacketJL.1
                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onComplete(String p0) {
                            Intrinsics.X0O(p0, "p0");
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                        public void onDecodeStream(byte[] p0) {
                            Intrinsics.X0O(p0, "p0");
                            RecordingManager.realTimeASRing$default(RecordingManager.Companion.getInstance(), p0, 0, p0.length, 2, null);
                            FileIOUtils.writeFileFromBytesByStream(VoiceManager.INSTANCE.getMPcmFile(), p0, true);
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onError(int i, String p1) {
                            Intrinsics.X0O(p1, "p1");
                            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startDecodeStream -> onError: " + i + ", " + p1);
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onStart() {
                        }
                    });
                    return;
                }
                return;
            }
            if (mStatus == 1) {
                if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                    goOnTransfer(recordPacket);
                    return;
                }
                isSpeechRecRunning = true;
                OpusManager opusManager3 = mOpusManager;
                if (opusManager3 != null) {
                    opusManager3.writeAudioStream(recordPacket.getMPacket());
                    return;
                }
                return;
            }
            if (mStatus != 2) {
                if (mStatus != 3) {
                    return;
                }
                stop();
                OpusManager opusManager4 = mOpusManager;
                if (opusManager4 != null) {
                    opusManager4.stopDecodeStream();
                    return;
                }
                return;
            }
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END ,  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform() + "  isSupportSparkChainAI = " + q62Var.OIXOOi());
            if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                RecordingManager.Companion.getInstance().stopRecording();
            } else {
                isSpeechRecRunning = false;
                RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
            }
            endTransfer();
            return;
        }
        if (!q62Var.IiX1ii()) {
            int mStatus2 = recordPacket.getMStatus();
            if (mStatus2 != 0) {
                if (mStatus2 == 1) {
                    goOnTransfer(recordPacket);
                    return;
                }
                if (mStatus2 == 2) {
                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  end  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
                    if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                        RecordingManager.Companion.getInstance().stopRecording();
                        endTransfer();
                        return;
                    }
                    File file = mOpusFile;
                    if (FileUtils.isFileExists(file)) {
                        stop();
                        OpusManager opusManager5 = mOpusManager;
                        if (opusManager5 != null) {
                            String path = file.getPath();
                            Intrinsics.O10IXXX0X(path, "getPath(...)");
                            String path2 = mPcmFile.getPath();
                            Intrinsics.O10IXXX0X(path2, "getPath(...)");
                            opusManager5.decodeFile(path, path2, new OpusManager.OnStateCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.oldReceiveRecordPacketJL.3
                                @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                                public void onComplete(String outFilePath) {
                                    Intrinsics.X0O(outFilePath, "outFilePath");
                                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onComplete: " + outFilePath);
                                    gq1 gq1Var = new gq1(16000, 16, 2);
                                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                                    gq1Var.OXO1(voiceManager.getMPcmFile().getPath(), voiceManager.getMWavFile().getPath());
                                    voiceManager.oldOpenAiChatCompletion();
                                }

                                @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                                public void onError(int i, String message) {
                                    Intrinsics.X0O(message, "message");
                                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onError: code = " + i + ", message = " + message);
                                    VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                                }

                                @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                                public void onStart() {
                                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> onStart");
                                }
                            });
                        }
                        endTransfer();
                        return;
                    }
                    return;
                }
                if (mStatus2 != 3) {
                    return;
                }
            }
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  START");
            startTransfer(recordPacket.getMStatus());
            return;
        }
        int mStatus3 = recordPacket.getMStatus();
        if (mStatus3 == 0) {
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL ");
            stopRealTime();
            stop();
            startRealTime();
            OpusManager opusManager6 = mOpusManager;
            if (opusManager6 != null) {
                opusManager6.stopDecodeStream();
            }
            OpusManager opusManager7 = mOpusManager;
            if (opusManager7 != null) {
                opusManager7.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.oldReceiveRecordPacketJL.2
                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onComplete(String p0) {
                        Intrinsics.X0O(p0, "p0");
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                    public void onDecodeStream(byte[] p0) {
                        Intrinsics.X0O(p0, "p0");
                        VoiceManager.INSTANCE.sendRealTime(p0);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onError(int i, String p1) {
                        Intrinsics.X0O(p1, "p1");
                        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startDecodeStream -> onError: " + i + ", " + p1);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onStart() {
                    }
                });
                return;
            }
            return;
        }
        if (mStatus3 == 1) {
            isSpeechRecRunning = true;
            OpusManager opusManager8 = mOpusManager;
            if (opusManager8 != null) {
                opusManager8.writeAudioStream(recordPacket.getMPacket());
                return;
            }
            return;
        }
        if (mStatus3 != 2) {
            if (mStatus3 != 3) {
                return;
            }
            stopRealTime();
            stop();
            OpusManager opusManager9 = mOpusManager;
            if (opusManager9 != null) {
                opusManager9.stopDecodeStream();
                return;
            }
            return;
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
        isSpeechRecRunning = false;
        if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
            RecordingManager.Companion.getInstance().stopRecording();
        } else {
            OpusManager opusManager10 = mOpusManager;
            if (opusManager10 != null) {
                opusManager10.stopDecodeStream();
            }
        }
        endTransfer();
    }

    public final void oldReceiveRecordPacketSC(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        int mStatus = recordPacket.getMStatus();
        if (mStatus == 0) {
            if ((q62.OXO1.OIXOOi() || mAIMode == 2) && recordPacket.getMStatus() == 0 && recordPacket.getMMode() < 3) {
                isEndInOperation = true;
                RecordingManager.startRealTimeASR$default(RecordingManager.Companion.getInstance(), null, 1, null);
                OpusManager opusManager = mOpusManager;
                if (opusManager != null) {
                    opusManager.stopDecodeStream();
                }
                OpusManager opusManager2 = mOpusManager;
                if (opusManager2 != null) {
                    opusManager2.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.oldReceiveRecordPacketSC.1
                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onComplete(String p0) {
                            Intrinsics.X0O(p0, "p0");
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                        public void onDecodeStream(byte[] p0) {
                            Intrinsics.X0O(p0, "p0");
                            VoiceManager voiceManager = VoiceManager.INSTANCE;
                            if (voiceManager.isEndInOperation()) {
                                RecordingManager.realTimeASRing$default(RecordingManager.Companion.getInstance(), p0, 0, p0.length, 2, null);
                                FileIOUtils.writeFileFromBytesByStream(voiceManager.getMPcmFile(), p0, true);
                            }
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onError(int i, String p1) {
                            Intrinsics.X0O(p1, "p1");
                        }

                        @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                        public void onStart() {
                        }
                    });
                }
            }
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC START");
            startTransfer(recordPacket.getMStatus());
            return;
        }
        if (mStatus == 1) {
            if (isEndInOperation) {
                if ((!q62.OXO1.OIXOOi() && mAIMode != 2) || recordPacket.getMMode() >= 3) {
                    goOnTransfer(recordPacket);
                    return;
                }
                OpusManager opusManager3 = mOpusManager;
                if (opusManager3 != null) {
                    opusManager3.writeAudioStream(recordPacket.getMPacket());
                    return;
                }
                return;
            }
            return;
        }
        if (mStatus != 2) {
            if (mStatus != 3) {
                return;
            }
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC Suspend 发3退出");
            return;
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC END --> BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
        stop();
        isEndInOperation = false;
        if ((q62.OXO1.OIXOOi() || mAIMode == 2) && recordPacket.getMMode() < 3) {
            RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
            endTransfer();
            return;
        }
        if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
            RecordingManager.Companion.getInstance().stopRecording();
            endTransfer();
            return;
        }
        File file = mOpusFile;
        if (FileUtils.isFileExists(file)) {
            OpusManager opusManager4 = mOpusManager;
            if (opusManager4 != null) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                String absolutePath2 = mPcmFile.getAbsolutePath();
                Intrinsics.O10IXXX0X(absolutePath2, "getAbsolutePath(...)");
                opusManager4.decodeStream(absolutePath, absolutePath2, new Function1() { // from class: com.android.mltcode.paycertificationapi.aj6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return VoiceManager.oldReceiveRecordPacketSC$lambda$0(((Boolean) obj).booleanValue());
                    }
                });
            }
            endTransfer();
        }
    }

    @sf5(tag = I01XX0.i100IXOX)
    public final void onStopVoice(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onStopVoice");
        stop();
    }

    @sf5(tag = I01XX0.iIi1)
    public final void onVoiceQuery(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onVoiceQuery -> app: " + text);
        mVoiceMode = 0;
        stop();
        sendMsg(text);
        voiceQuery(text);
    }

    @Deprecated(message = "这种需要aikey直连openai的方式后面要废弃")
    public final void openAiChatCompletion(@aa1 final String query) {
        Intrinsics.X0O(query, "query");
        ThreadUtils.SimpleTask<Void> simpleTask = new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.openAiChatCompletion.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r1) {
            }

            /* JADX WARN: Code duplicated, block: B:97:0x03bb  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v5 */
            /* JADX WARN: Type inference failed for: r13v6, types: [int] */
            /* JADX WARN: Type inference failed for: r13v7, types: [int] */
            /* JADX WARN: Type inference failed for: r13v8 */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v2, types: [int] */
            /* JADX WARN: Type inference failed for: r15v4 */
            /* JADX WARN: Type inference failed for: r3v16, types: [com.sma.smartv3.biz.voice.VoiceMessage] */
            /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r9v1 */
            /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r9v9 */
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() {
                int i;
                Collection collectionM39402iI;
                Collection collectionM39402iI2;
                int i2;
                AIError aIError;
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                int i3 = 1;
                VoiceManager.isAiTaskRunning = true;
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("AIManager VoiceManager openAiChatCompletion -> " + query);
                ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(AIManager.XXI).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
                AIManager aIManager = AIManager.OXO1;
                byte[] bytes = AIManager.OiIIX101O(aIManager, query, false, 150, 2, null).getBytes(Charsets.XIi00iiXO);
                Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                ANResponse aNResponseExecuteForOkHttpResponse = postRequestBuilderAddHeaders.addByteBody(bytes).setPriority(Priority.LOW).setTag((Object) "openAiChatCompletion").build().executeForOkHttpResponse();
                ?? r9 = 0;
                Object obj = null;
                try {
                    okhttp3.Response okHttpResponse = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    Integer numValueOf = okHttpResponse != null ? Integer.valueOf(okHttpResponse.code()) : null;
                    okhttp3.Response okHttpResponse2 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    ResponseBody responseBodyBody = okHttpResponse2 != null ? okHttpResponse2.body() : null;
                    try {
                        if (numValueOf != null && numValueOf.intValue() == 200) {
                            BufferedReader bufferedReader = new BufferedReader(responseBodyBody != null ? responseBodyBody.charStream() : null);
                            String line = bufferedReader.readLine();
                            StringBuilder sb = new StringBuilder();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            SSE sse = null;
                            while (line != null) {
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiChatCompletion -> " + line);
                                if (oe5.m2764O0(line, "data:", r9, 2, obj)) {
                                    ?? Substring = line.substring(5);
                                    Intrinsics.O10IXXX0X(Substring, "substring(...)");
                                    int length = Substring.length() - i3;
                                    ?? r13 = r9;
                                    int i4 = r13 == true ? 1 : 0;
                                    while (r13 <= length) {
                                        ?? r5 = Intrinsics.iIiiO(Substring.charAt(i4 == 0 ? r13 : length), 32) <= 0 ? i3 : r9;
                                        if (i4 == 0) {
                                            if (r5 == 0) {
                                                i4 = i3;
                                            } else {
                                                r13++;
                                            }
                                        } else {
                                            if (r5 == 0) {
                                                break;
                                            }
                                            length--;
                                        }
                                    }
                                    sse = new SSE(Substring.subSequence(r13, length + 1).toString());
                                } else {
                                    i = R.string.openai_request_error;
                                    if (Intrinsics.XOO0ii0(line, "") && sse != null) {
                                        if (sse.isDone()) {
                                            VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                            String string = sb.toString();
                                            Intrinsics.O10IXXX0X(string, "toString(...)");
                                            voiceManager2.senAudioTextToDevice(new BleVoice(1, 0, voiceManager2.getMVoiceMode(), null, jCurrentTimeMillis2, string, 10, null));
                                            DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                                            String string2 = sb.toString();
                                            Intrinsics.O10IXXX0X(string2, "toString(...)");
                                            DcsTtsPlayer.play$default(dcsTtsPlayer, string2, false, false, null, null, "openAiChatCompletion", 30, null);
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
                                            ?? r3 = (VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi10);
                                            if (r3.getMStatus() == i3) {
                                                r3.setMStatus(r9);
                                                String string3 = sb.toString();
                                                Intrinsics.O10IXXX0X(string3, "toString(...)");
                                                r3.setMContent(string3);
                                                a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                                                VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                                            }
                                            VoiceManager voiceManager3 = VoiceManager.INSTANCE;
                                            VoiceManager.isAiTaskRunning = r9;
                                            break;
                                        }
                                        sb.append(((ChatCompletionResult) new Gson().fromJson(sse.getData(), ChatCompletionResult.class)).getChoices().get(r9).getDelta().getContent());
                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                        String string4 = sb.toString();
                                        Intrinsics.O10IXXX0X(string4, "toString(...)");
                                        VoiceManager voiceManager4 = VoiceManager.INSTANCE;
                                        BleVoice bleVoice = new BleVoice(1, 0, voiceManager4.getMVoiceMode(), null, jCurrentTimeMillis3, string4, 10, null);
                                        String string5 = sb.toString();
                                        Intrinsics.O10IXXX0X(string5, "toString(...)");
                                        byte[] bytes2 = string5.getBytes(Charsets.XIi00iiXO);
                                        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
                                        if (bytes2.length < BleVoice.Companion.getCONTENT_MAX_LENGTH() && System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                                            voiceManager4.senAudioTextToDevice(bleVoice);
                                        }
                                        try {
                                            JsonArray asJsonArray2 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
                                            Intrinsics.XXI(asJsonArray2);
                                            collectionM39402iI2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray2, 10));
                                            Iterator<JsonElement> it2 = asJsonArray2.iterator();
                                            while (it2.hasNext()) {
                                                collectionM39402iI2.add(new Gson().fromJson(it2.next(), VoiceMessage.class));
                                            }
                                        } catch (Exception unused2) {
                                            collectionM39402iI2 = CollectionsKt__CollectionsKt.m39402iI();
                                        }
                                        List listOO0Oi11 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI2);
                                        VoiceMessage voiceMessage = (VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi11);
                                        i2 = 1;
                                        if (voiceMessage.getMStatus() == 1) {
                                            String string6 = sb.toString();
                                            Intrinsics.O10IXXX0X(string6, "toString(...)");
                                            voiceMessage.setMContent(string6);
                                            a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi11));
                                            VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                                        }
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                        sse = null;
                                        e = e;
                                        e.printStackTrace();
                                        if (!(e instanceof InterruptedIOException)) {
                                            ToastUtils.showLong(e.getMessage(), new Object[0]);
                                            VoiceManager.INSTANCE.sendError(UtilsKt.XXO(i));
                                        }
                                        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiChatCompletion -> error:" + e.getMessage());
                                    }
                                    line = bufferedReader.readLine();
                                    i3 = i2;
                                    r9 = 0;
                                    obj = null;
                                }
                                i2 = i3;
                                line = bufferedReader.readLine();
                                i3 = i2;
                                r9 = 0;
                                obj = null;
                            }
                        } else {
                            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                            if (!TextUtils.isEmpty(strString)) {
                                Intrinsics.XXI(strString);
                                AIBase aIBase = (AIBase) UtilsKt.iOOX010X(strString, AIBase.class);
                                if (aIBase == null || (aIError = aIBase.getError()) == null) {
                                    aIError = new AIError(String.valueOf(numValueOf), null, null, null, 14, null);
                                }
                                aIManager.O1O(aIError);
                            }
                            i1o0oxo1o.OXO1("AIManager VoiceManager openAiChatCompletion -> code:" + numValueOf + ", error:" + strString);
                            voiceManager.sendError(UtilsKt.XXO(R.string.openai_request_error));
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (!(e instanceof InterruptedIOException)) {
                            ToastUtils.showLong(e.getMessage(), new Object[0]);
                            VoiceManager.INSTANCE.sendError(UtilsKt.XXO(i));
                        }
                        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiChatCompletion -> error:" + e.getMessage());
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = R.string.openai_request_error;
                }
                VoiceManager voiceManager5 = VoiceManager.INSTANCE;
                VoiceManager.isAiTaskRunning = false;
                return null;
            }
        };
        mOpenAiTask = simpleTask;
        ThreadUtils.executeByIo(simpleTask);
    }

    public final void openAiCheck(@aa1 String aikey, @tb1 final O1XIiIO<String> o1XIiIO, @tb1 Activity activity, @tb1 View view) {
        Intrinsics.X0O(aikey, "aikey");
        final C3006uq c3006uq = null;
        if (view != null && activity != null) {
            c3006uq = new C3006uq(activity);
            c3006uq.I1XOi1(view);
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiCheck");
        ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(AIManager.XXI).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + aikey);
        byte[] bytes = AIManager.OiIIX101O(AIManager.OXO1, "hello", false, 0, 4, null).getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddHeaders.addByteBody(bytes).setPriority(Priority.LOW).setTag((Object) "openAiChatCompletion").build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.voice.VoiceManager.openAiCheck.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                AIError aIError;
                Intrinsics.X0O(anError, "anError");
                C3006uq c3006uq2 = c3006uq;
                if (c3006uq2 != null) {
                    c3006uq2.dismiss();
                }
                AIBase aIBase = (AIBase) anError.getErrorAsObject(AIBase.class);
                if (aIBase == null || (aIError = aIBase.getError()) == null) {
                    aIError = new AIError(String.valueOf(anError.getMessage()), null, null, null, 14, null);
                }
                i1O0OXO1O.OXO1.OXO1("onError -> " + anError.getErrorBody() + ", " + aIError);
                AIManager.OXO1.O1O(aIError);
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(aIError.getMessage());
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject result) {
                Intrinsics.X0O(result, "result");
                C3006uq c3006uq2 = c3006uq;
                if (c3006uq2 != null) {
                    c3006uq2.dismiss();
                }
                i1O0OXO1O.OXO1.OXO1("onResponse -> " + result);
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleResponse(result.toString());
                }
            }
        });
    }

    public final void openAiTranscriptionsAudio(@aa1 File file, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(file, "file");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiTranscriptionsAudio -> " + file);
        String strIIiiO = q62.OXO1.iIiiO();
        if (strIIiiO == null || StringsKt__StringsKt.i0XI0(strIIiiO)) {
            if (o1XIiIO != null) {
                o1XIiIO.handleError("invalid_request_error");
            }
        } else {
            AndroidNetworking.upload("https://api.openai.com/v1/audio/transcriptions").addHeaders("Authorization", "Bearer " + strIIiiO).addMultipartParameter("model", "whisper-1").addMultipartFile("file", file).setTag((Object) "openAiTranscriptionsAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.ej6
                @Override // com.androidnetworking.interfaces.UploadProgressListener
                public final void onProgress(long j, long j2) {
                    VoiceManager.openAiTranscriptionsAudio$lambda$0(j, j2);
                }
            }).getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.voice.VoiceManager.openAiTranscriptionsAudio.2
                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onError(ANError anError) {
                    AIError aIError;
                    Intrinsics.X0O(anError, "anError");
                    AIBase aIBase = (AIBase) anError.getErrorAsObject(AIBase.class);
                    if (aIBase == null || (aIError = aIBase.getError()) == null) {
                        aIError = new AIError(String.valueOf(anError.getMessage()), null, null, null, 14, null);
                    }
                    i1O0OXO1O.OXO1.OXO1("onError -> " + anError.getErrorBody() + ", " + aIError);
                    AIManager.OXO1.O1O(aIError);
                    O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleError(aIError.getMessage());
                    }
                }

                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onResponse(JSONObject jSONObject) {
                    String string;
                    O1XIiIO<String> o1XIiIO2;
                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiTranscriptionsAudio onResponse -> " + jSONObject);
                    if (jSONObject == null || (string = jSONObject.getString("text")) == null || (o1XIiIO2 = o1XIiIO) == null) {
                        return;
                    }
                    o1XIiIO2.handleResponse(string);
                }
            });
        }
    }

    public final void postEvent(@aa1 String tag, @aa1 Object data) {
        Intrinsics.X0O(tag, "tag");
        Intrinsics.X0O(data, "data");
        O11XO1X.XO0O10().OIX0iXi(data, tag);
    }

    public final void recognition() {
        if (q62.OXO1.OIXOOi()) {
            sendAISparkChainIdentify();
        } else {
            ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.recognition.1
                @Override // com.blankj.utilcode.util.ThreadUtils.Task
                public void onSuccess(Void r1) {
                }

                @Override // com.blankj.utilcode.util.ThreadUtils.Task
                public Void doInBackground() {
                    try {
                        new Runner(new FileInputStream(VoiceManager.INSTANCE.getMPcmFile()), 1).run(new SimpleDownloader() { // from class: com.sma.smartv3.biz.voice.VoiceManager$recognition$1$doInBackground$1
                            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                            public void onFailure(String str) {
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onFailure -> " + str);
                                ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error) + "\n" + str, new Object[0]);
                                VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                            }

                            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                            public void onMessage(Result result) {
                                Collection collectionM39402iI;
                                Intrinsics.X0O(result, "result");
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onMessage -> " + result.getOrignalJsonStr());
                                VoiceManager voiceManager = VoiceManager.INSTANCE;
                                voiceManager.setSpeechRecRunning(true);
                                if (result.isError() || !result.isFin()) {
                                    return;
                                }
                                String result2 = result.getResult();
                                if (TextUtils.isEmpty(result2)) {
                                    voiceManager.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                                    return;
                                }
                                if (voiceManager.isVoiceAIIdentify()) {
                                    Intrinsics.XXI(result2);
                                    voiceManager.sendMsg(result2);
                                    return;
                                }
                                if (voiceManager.isSupportAIVoiceWatchface()) {
                                    Intrinsics.XXI(result2);
                                    voiceManager.sendMsg(result2);
                                    AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, result2, null, 0, 6, null);
                                    return;
                                }
                                Application application = null;
                                if (VoiceManager.isAiTaskRunning) {
                                    Application application2 = VoiceManager.mApp;
                                    if (application2 == null) {
                                        Intrinsics.XXO("mApp");
                                    } else {
                                        application = application2;
                                    }
                                    String string = application.getString(R.string.task_running_wait_tip);
                                    Intrinsics.O10IXXX0X(string, "getString(...)");
                                    voiceManager.sendError(string);
                                    return;
                                }
                                voiceManager.setSpeechRecRunning(false);
                                Intrinsics.XXI(result2);
                                voiceManager.sendMsg(result2);
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
                                VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                                VoiceManager.postEvent$default(voiceManager2, I01XX0.X111IO, null, 2, null);
                                listOO0Oi10.add(new VoiceMessage(0, null, 1, result2, null, 0, 0, 115, null));
                                listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManager.mAIMode, 19, null));
                                a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                                VoiceManager.postEvent$default(voiceManager2, I01XX0.X00O0, null, 2, null);
                                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onMessage -> start query: " + result2);
                                voiceManager2.voiceQuery(result2);
                            }
                        });
                    } catch (IOException e) {
                        i1O0OXO1O.OXO1.XIi00iiXO("AIManager VoiceManager IOException e = " + e + " ");
                        ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error) + "\n" + e, new Object[0]);
                        VoiceManager.INSTANCE.sendError(UtilsKt.XXO(R.string.speech_recognition_error));
                    }
                    VoiceManager.INSTANCE.pollCheckStop();
                    return null;
                }
            });
        }
    }

    public final void refreshToken(@aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String url = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> dcsTokenBody = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> o1XIiIO = new O1XIiIO<DcsToken>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.refreshToken.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken onError -> " + error);
                q62 q62Var = q62.OXO1;
                if (q62Var.IOI0i0I()) {
                    VoiceManager.INSTANCE.sendError("请先到App上激活" + q62Var.m2887XI());
                } else {
                    VoiceManager.INSTANCE.sendError(error);
                    ToastUtils.showLong(error, new Object[0]);
                }
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(DcsToken dcsToken) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken handleResponse -> " + dcsToken);
                if (dcsToken != null) {
                    dcsToken.setTimestamp(System.currentTimeMillis());
                    a01.OXO1.IiI10X().put(DcsToken.class.getName(), new Gson().toJson(dcsToken));
                    callback.invoke2(Boolean.TRUE);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, dcsTokenBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        final O1XIiIO<Response<DcsToken>> o1XIiIO2 = new O1XIiIO<Response<DcsToken>>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$refreshToken$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<DcsToken> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) dcsTokenBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, DcsToken.class), new ParsedRequestListener<Response<DcsToken>>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$refreshToken$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<DcsToken> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
    }

    public final void resetPlayStatus() {
        Collection collectionM39402iI;
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
        List<VoiceMessage> listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        for (VoiceMessage voiceMessage : listOO0Oi10) {
            if (voiceMessage.getMType() == 3) {
                voiceMessage.setMStatus(0);
            }
        }
        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
        postEvent$default(INSTANCE, I01XX0.X00O0, null, 2, null);
    }

    public final void senAudioTextToDevice(@aa1 BleVoice voice) {
        Intrinsics.X0O(voice, "voice");
        if (q62.OXO1.I0OX()) {
            return;
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, voice, false, false, 24, null);
    }

    public final void sendAISparkChainIdentify() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav");
        new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), mWavFile.getPath());
        i1o0oxo1o.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav");
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.sendAISparkChainIdentify.2
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager sendAISparkChainIdentify  doInBackground");
                AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                String path = VoiceManager.INSTANCE.getMPcmFile().getPath();
                Intrinsics.O10IXXX0X(path, "getPath(...)");
                aISparkChainManager.X100O(path, new O1XIiIO<AITranslation>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$sendAISparkChainIdentify$2$doInBackground$1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), UtilsKt.XXO(R.string.failed_in_translation));
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleResponse(AITranslation aITranslation) {
                        VoiceManager.INSTANCE.aISparkChainManagerHandleResponse(aITranslation);
                    }
                });
                return null;
            }

            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r2) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav  onSuccess");
            }
        });
    }

    public final void sendAISparkChainTranslation() {
        if (q62.OXO1.OIXOOi() && mAIMode == 2) {
            ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.VoiceManager.sendAISparkChainTranslation.1
                @Override // com.blankj.utilcode.util.ThreadUtils.Task
                public void onSuccess(Void r1) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
                @Override // com.blankj.utilcode.util.ThreadUtils.Task
                public Void doInBackground() {
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    Languages languages = Languages.INSTANCE;
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    String aISparkTargetLang$default = Languages.formatAISparkTargetLang$default(languages, voiceManager.getMLanguage(), null, 2, null);
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = Languages.formatAISparkTargetLang$default(languages, voiceManager.getMToLanguage(), null, 2, null);
                    if (!Intrinsics.XOO0ii0(aISparkTargetLang$default, "cn") && !Intrinsics.XOO0ii0(objectRef.element, "cn")) {
                        objectRef.element = "cn";
                        booleanRef.element = true;
                    }
                    i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                    i1o0oxo1o.OXO1("AIManager VoiceManager sendAISparkChainTranslation  language = " + aISparkTargetLang$default + "  toLanguage = " + objectRef.element + "  needTransit = " + booleanRef.element);
                    new gq1(16000, 16, 2).OXO1(voiceManager.getMPcmFile().getPath(), voiceManager.getMWavFile().getPath());
                    i1o0oxo1o.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav  ");
                    AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                    String path = voiceManager.getMPcmFile().getPath();
                    Intrinsics.O10IXXX0X(path, "getPath(...)");
                    aISparkChainManager.iiiO(path, aISparkTargetLang$default, (String) objectRef.element, new O1XIiIO<AITranslation>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$sendAISparkChainTranslation$1$doInBackground$2
                        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                        public void handleError(String error) {
                            Intrinsics.X0O(error, "error");
                            VoiceManager.INSTANCE.sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), UtilsKt.XXO(R.string.failed_in_translation));
                        }

                        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                        public void handleResponse(final AITranslation aITranslation) {
                            if (aITranslation != null) {
                                if (!booleanRef.element) {
                                    VoiceManager.INSTANCE.sendTranslationResult(aITranslation.getText(), aITranslation.getDst());
                                    DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                                    dcsTtsPlayer.initSegmentation();
                                    DcsTtsPlayer.play$default(dcsTtsPlayer, aITranslation.getDst(), true, false, null, LanguageTranslationKt.getTranslationLanguageTtsName(objectRef.element), "sendAISparkChainTranslation2", 12, null);
                                    return;
                                }
                                AISparkChainManager aISparkChainManager2 = AISparkChainManager.OXO1;
                                String dst = aITranslation.getDst();
                                String aISparkTargetLang$default2 = Languages.formatAISparkTargetLang$default(Languages.INSTANCE, VoiceManager.INSTANCE.getMToLanguage(), null, 2, null);
                                final Ref.ObjectRef<String> objectRef2 = objectRef;
                                AISparkChainManager.XXiO0i(aISparkChainManager2, dst, null, aISparkTargetLang$default2, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1
                                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                                    public void handleError(String error) {
                                        Intrinsics.X0O(error, "error");
                                        VoiceManager.INSTANCE.sendTranslationResult(aITranslation.getText(), UtilsKt.XXO(R.string.failed_in_translation));
                                    }

                                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                                    public void handleResponse(String str) {
                                        if (str == null || str.length() <= 0) {
                                            VoiceManager.INSTANCE.sendTranslationResult(aITranslation.getText(), UtilsKt.XXO(R.string.failed_in_translation));
                                            return;
                                        }
                                        VoiceManager.INSTANCE.sendTranslationResult(aITranslation.getText(), str);
                                        DcsTtsPlayer dcsTtsPlayer2 = DcsTtsPlayer.INSTANCE;
                                        dcsTtsPlayer2.initSegmentation();
                                        DcsTtsPlayer.play$default(dcsTtsPlayer2, str, true, false, null, LanguageTranslationKt.getTranslationLanguageTtsName(objectRef2.element), "sendAISparkChainTranslation", 12, null);
                                    }
                                }, 2, null);
                            }
                        }
                    });
                    return null;
                }
            });
            return;
        }
        ToastUtils.showLong("Unauthorized", new Object[0]);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        BleCache bleCache = BleCache.INSTANCE;
        i1o0oxo1o.XIi00iiXO("AIManager VoiceManager  translation It does not support sparkAIService, need to configure the current device , " + bleCache.getMBleName() + "  " + bleCache.getMFirmwareFlag() + "  " + bleCache.getMBleAddress() + " ");
        sendTranslationResult("不支持翻译", "Unauthorized");
    }

    public final void sendTranslationResult(@aa1 String inputText, @aa1 String outputText) {
        Intrinsics.X0O(inputText, "inputText");
        Intrinsics.X0O(outputText, "outputText");
        sendTranslationResultInput(inputText);
        sendTranslationResultOutput(outputText);
    }

    public final void sendTranslationResultInput(@aa1 String inputText) {
        Intrinsics.X0O(inputText, "inputText");
        int i = 0;
        int i2 = 0;
        BleVoice.BleDeviceEmotion bleDeviceEmotion = null;
        senAudioTextToDevice(new BleVoice(i, i2, mVoiceMode, bleDeviceEmotion, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(inputText).toString(), 10, null));
    }

    public final void sendTranslationResultOutput(@aa1 String outputText) {
        Intrinsics.X0O(outputText, "outputText");
        int i = 1;
        int i2 = 0;
        BleVoice.BleDeviceEmotion bleDeviceEmotion = null;
        senAudioTextToDevice(new BleVoice(i, i2, mVoiceMode, bleDeviceEmotion, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(outputText).toString(), 10, null));
    }

    public final void setAIMode(int i) {
        mAIMode = i;
    }

    public final void setActivityData(boolean z) {
        isActivityData = z;
    }

    public final void setEndInOperation(boolean z) {
        isEndInOperation = z;
    }

    public final void setLanguageType(@aa1 String language, @aa1 String mTtsName) {
        Object next;
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(mTtsName, "mTtsName");
        if (!Intrinsics.XOO0ii0(language, "") || !Intrinsics.XOO0ii0(mTtsName, "")) {
            microsoftLanguage = language;
            microsoftTtsName = mTtsName;
            return;
        }
        Object obj = null;
        if (!isSupportEarPhoneVoiceTranslation() && !isSupportAIVoiceTranslation()) {
            Application application = mApp;
            if (application == null) {
                Intrinsics.XXO("mApp");
                application = null;
            }
            String language2 = application.getResources().getConfiguration().locale.getLanguage();
            if (Intrinsics.XOO0ii0(language2, Languages.DEFAULT_LANGUAGE_ZH)) {
                microsoftLanguage = "zh-CN";
                microsoftTtsName = "zh-CN-XiaoxiaoNeural";
                return;
            }
            for (Object obj2 : LanguageTranslationKt.getTranslationLanguageList()) {
                if (Intrinsics.XOO0ii0(((LanguageTranslationData) obj2).getRtasrLanguage(), language2)) {
                    obj = obj2;
                    break;
                }
            }
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) obj;
            if (languageTranslationData != null) {
                microsoftLanguage = languageTranslationData.getAsrLanguage();
                microsoftTtsName = languageTranslationData.getTtsViuceName();
                return;
            } else {
                microsoftLanguage = "en-US";
                microsoftTtsName = "en-US-AvaMultilingualNeural";
                return;
            }
        }
        Languages languages = Languages.INSTANCE;
        String microsoftTargetLang = languages.formatMicrosoftTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        String microsoftTargetLang2 = languages.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        Iterator<T> it = LanguageTranslationKt.getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), microsoftTargetLang));
        LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) next;
        for (Object obj3 : LanguageTranslationKt.getTranslationLanguageList()) {
            if (Intrinsics.XOO0ii0(((LanguageTranslationData) obj3).getRtasrLanguage(), microsoftTargetLang2)) {
                obj = obj3;
                break;
            }
        }
        LanguageTranslationData languageTranslationData3 = (LanguageTranslationData) obj;
        if (languageTranslationData2 != null) {
            microsoftLanguage = languageTranslationData2.getAsrLanguage();
        }
        if (languageTranslationData3 != null) {
            microsoftTtsName = languageTranslationData3.getTtsViuceName();
            microsoftTtsLanguage = languageTranslationData3.getAsrLanguage();
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager formatMicrosoftTargetLang language = " + microsoftTargetLang + " , translationLanguage = " + (languageTranslationData2 == null));
    }

    public final void setMContentResult(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mContentResult = str;
    }

    public final void setMLanguage(int i) {
        mLanguage = i;
    }

    public final void setMListener(@tb1 Function3<? super Integer, ? super Integer, ? super Integer, Boolean> function3) {
        mListener = function3;
    }

    public final void setMSavePcmTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mSavePcmTime = str;
    }

    public final void setMToLanguage(int i) {
        mToLanguage = i;
    }

    public final void setMVoiceMode(int i) {
        mVoiceMode = i;
    }

    public final void setMVoiceType(int i) {
        mVoiceType = i;
    }

    public final void setMicrosoftCallback() {
        setRecordingCallback();
        MicrosoftSDKManage.O1O.OXO1().iIi1(microsoftCallBack, TAG);
    }

    public final void setMicrosoftLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        microsoftLanguage = str;
    }

    public final void setMicrosoftTime(long j) {
        microsoftTime = j;
    }

    public final void setMicrosoftTtsLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        microsoftTtsLanguage = str;
    }

    public final void setMicrosoftTtsName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        microsoftTtsName = str;
    }

    public final void setReceiveRecordPacket(boolean z) {
        isReceiveRecordPacket = z;
    }

    public final void setRecordBluetooth(boolean z) {
        isRecordBluetooth = z;
    }

    public final void setRecordingCallback() {
        RecordingManager.Companion.getInstance().setRecordingCallback(recordingCallBack);
    }

    public final void setResetCallBack(boolean z) {
        resetCallBack = z;
    }

    public final void setSendResults(boolean z) {
        isSendResults = z;
    }

    public final void setSpeechRecRunning(boolean z) {
        isSpeechRecRunning = z;
    }

    public final void startRecord() {
        RecordingManager.Companion.getInstance().startRecord();
    }

    public final void startTransfer(int i) {
        if (i == 0) {
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startTransfer delete  File  start = " + i);
            deleteFiles();
        }
        stop();
        if (i == 0) {
            if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                VoiceService.f50915I1.m38117iO();
                voiceRecord();
            } else {
                OpusManager opusManager = mOpusManager;
                if (opusManager != null) {
                    opusManager.stopDecodeStream();
                }
            }
        }
        if (q62.OXO1.OIXOOi()) {
            AISparkChainManager.OXO1.Ii0i(false);
        }
    }

    public final void stop() {
        ThreadUtils.SimpleTask<Void> simpleTask;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> stop");
        isAiTaskRunning = false;
        isSpeechRecRunning = false;
        ThreadUtils.SimpleTask<Void> simpleTask2 = mOpenAiTask;
        if (simpleTask2 != null) {
            ThreadUtils.cancel(simpleTask2);
        }
        if (!Intrinsics.XOO0ii0(BleCache.INSTANCE.getMFirmwareFlag(), "BLACK_SHARK_S1_PRO") && (simpleTask = mDuserTask) != null) {
            ThreadUtils.cancel(simpleTask);
        }
        AISparkChainManager.OXO1.iOI();
        DcsTtsPlayer.INSTANCE.stop();
        AIWatchFaceManager.OXO1.OII();
        AIManager.OXO1.XO0X10iO();
        resetPlayStatus();
    }

    public final void stopRecording() {
        RecordingManager.Companion.getInstance().stopRecording();
    }

    public final void toMicrosoftIdentify(@aa1 BleRecordPacket recordPacket) throws Throwable {
        Intrinsics.X0O(recordPacket, "recordPacket");
        int mStatus = recordPacket.getMStatus();
        if (mStatus != 0) {
            if (mStatus == 1) {
                OpusManager opusManager = mOpusManager;
                if (opusManager != null) {
                    opusManager.writeAudioStream(recordPacket.getMPacket());
                    return;
                }
                return;
            }
            if (mStatus != 2) {
                if (mStatus != 3) {
                    return;
                }
                mVoiceType = recordPacket.getMStatus();
                stop();
                OpusManager opusManager2 = mOpusManager;
                if (opusManager2 != null) {
                    opusManager2.stopDecodeStream();
                }
                MicrosoftSDKManage.O1O.OXO1().X1IX();
                return;
            }
            if (mVoiceType == 0) {
                mVoiceType = recordPacket.getMStatus();
                isSpeechRecRunning = false;
                OpusManager opusManager3 = mOpusManager;
                if (opusManager3 != null) {
                    opusManager3.stopDecodeStream();
                }
                if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                    MicrosoftSDKManage.O1O.OXO1().XOIO11O();
                } else {
                    MicrosoftSDKManage.O1O.OXO1().m38829Xi();
                }
                endTransfer();
                if (isActivityData || mContentResult.length() <= 0) {
                    return;
                }
                isSendResults = true;
                sendContentResult(mContentResult);
                return;
            }
            return;
        }
        if (mVoiceType != 0) {
            mVoiceType = recordPacket.getMStatus();
            if (isSpeechRecRunning) {
                i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager toMicrosoftIdentify isSpeechRecRunning = " + isSpeechRecRunning);
                RecordingManager.Companion companion = RecordingManager.Companion;
                if (companion.getInstance().isRecording() && q62.OiO0IOX(q62.OXO1, null, 1, null)) {
                    companion.getInstance().playTip();
                    return;
                }
                return;
            }
            stop();
            DcsTtsPlayer.INSTANCE.deleteReplayMusic();
            OpusManager opusManager4 = mOpusManager;
            if (opusManager4 != null) {
                opusManager4.stopDecodeStream();
            }
            isSpeechRecRunning = true;
            if (!isActivityData) {
                setLanguageType$default(this, null, null, 3, null);
            }
            if (isSupportEarPhoneVoiceAIChat() || isSupportEarPhoneVoiceTranslation()) {
                MicrosoftSDKManage.O1O.OXO1().iIX0i(microsoftLanguage, true, microsoftTtsName, microsoftTtsLanguage, !isActivityData);
                return;
            }
            MicrosoftSDKManage.O1O.OXO1().iIX0i(microsoftLanguage, false, microsoftTtsName, microsoftTtsLanguage, false);
            OpusManager opusManager5 = mOpusManager;
            if (opusManager5 != null) {
                opusManager5.stopDecodeStream();
            }
            OpusManager opusManager6 = mOpusManager;
            if (opusManager6 != null) {
                opusManager6.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.toMicrosoftIdentify.1
                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onComplete(String p0) {
                        Intrinsics.X0O(p0, "p0");
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                    public void onDecodeStream(byte[] p0) {
                        Intrinsics.X0O(p0, "p0");
                        MicrosoftSDKManage.O1O.OXO1().m38828Oi(p0);
                        FileIOUtils.writeFileFromBytesByStream(VoiceManager.INSTANCE.getMPcmFile(), p0, true);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onError(int i, String p1) {
                        Intrinsics.X0O(p1, "p1");
                        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startDecodeStream -> onError: " + i + ", " + p1);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onStart() {
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.sma.smartv3.model.AIAnswer] */
    public final void toWebSocketRecordPacket(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        int mStatus = recordPacket.getMStatus();
        if (mStatus == 0) {
            isSpeechRecRunning = true;
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket START");
            deleteFiles();
            OpusManager opusManager = mOpusManager;
            if (opusManager != null) {
                opusManager.stopDecodeStream();
            }
            OpusManager opusManager2 = mOpusManager;
            if (opusManager2 != null) {
                opusManager2.startDecodeStream(new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.toWebSocketRecordPacket.1
                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onComplete(String p0) {
                        Intrinsics.X0O(p0, "p0");
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
                    public void onDecodeStream(byte[] p0) {
                        Intrinsics.X0O(p0, "p0");
                        FileIOUtils.writeFileFromBytesByStream(VoiceManager.INSTANCE.getMPcmFile(), p0, true);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onError(int i, String p1) {
                        Intrinsics.X0O(p1, "p1");
                        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startDecodeStream -> onError: " + i + ", " + p1);
                    }

                    @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
                    public void onStart() {
                    }
                });
            }
            final StringBuilder sb = new StringBuilder();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new AIAnswer(AIFunctionType.AI, null, 0, null, null, 26, null);
            WebSocketManager webSocketManager = WebSocketManager.INSTANCE;
            webSocketManager.sendStartListenMessage(false);
            webSocketManager.setMOnCallback(new WebSocketManager.OnCallback() { // from class: com.sma.smartv3.biz.voice.VoiceManager.toWebSocketRecordPacket.2
                private int index;
                private long lastSendTime = System.currentTimeMillis();

                private final void handMessage(AIAnswer aIAnswer) {
                    Collection collectionM39402iI;
                    i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager AIChat handleResponse -> " + aIAnswer);
                    if (aIAnswer != null) {
                        int i = this.index + 1;
                        this.index = i;
                        if (i != 1 && aIAnswer.getEnded() != 1) {
                            byte[] bytes = aIAnswer.getText().getBytes(Charsets.XIi00iiXO);
                            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                            if (bytes.length >= BleVoice.Companion.getCONTENT_MAX_LENGTH() || System.currentTimeMillis() - this.lastSendTime <= 600) {
                                return;
                            }
                        }
                        String text = aIAnswer.getText();
                        if (q62.OXO1.OXOI0XII()) {
                            text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                        }
                        String str = text;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        voiceManager.senAudioTextToDevice(new BleVoice(1, 0, voiceManager.getMVoiceMode(), null, jCurrentTimeMillis, str, 10, null));
                        BleConnector.INSTANCE.setDisableStreamLog(true);
                        this.lastSendTime = System.currentTimeMillis();
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
                            if (aIAnswer.getEnded() == 1) {
                                voiceMessage.setMStatus(0);
                                VoiceManager voiceManager2 = VoiceManager.INSTANCE;
                                VoiceManager.isAiTaskRunning = false;
                            }
                            voiceMessage.setMContent(aIAnswer.getText());
                            a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                            VoiceManager.postEvent$default(VoiceManager.INSTANCE, I01XX0.X00O0, null, 2, null);
                        }
                    }
                }

                @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
                public void onEmotion(String emotion) {
                    Intrinsics.X0O(emotion, "emotion");
                    if (q62.OXO1.Xi1XO00()) {
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        int i = 2;
                        int i2 = 0;
                        voiceManager.senAudioTextToDevice(new BleVoice(i, i2, voiceManager.getMVoiceMode(), xp5.XO0O10(emotion), System.currentTimeMillis(), null, 34, null));
                    }
                }

                @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
                public void onSttText(String text, boolean z) {
                    Collection collectionM39402iI;
                    Intrinsics.X0O(text, "text");
                    LogUtils.m11128d("AIManager VoiceManager onSttText  text = " + text + " , isFinal = " + z + "  ");
                    VoiceManager.INSTANCE.sendTranslationResultInput(text);
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
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    VoiceManager.postEvent$default(voiceManager, I01XX0.X111IO, null, 2, null);
                    listOO0Oi10.add(new VoiceMessage(0, null, 1, text, null, 0, 0, 115, null));
                    listOO0Oi10.add(new VoiceMessage(0, null, 2, "", null, 1, VoiceManager.mAIMode, 19, null));
                    a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
                    VoiceManager.postEvent$default(voiceManager, I01XX0.X00O0, null, 2, null);
                }

                @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
                public void onTtsStart() {
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.RECORD_PACKET;
                    BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                    BleRecordPacket bleRecordPacket = new BleRecordPacket(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, C2263bm.OXO1, null);
                    bleRecordPacket.setMStatus(6);
                    Unit unit = Unit.OXO1;
                    BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleRecordPacket, false, false, 24, null);
                }

                @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
                public void onTtsStop() {
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.RECORD_PACKET;
                    BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                    BleRecordPacket bleRecordPacket = new BleRecordPacket(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, C2263bm.OXO1, null);
                    bleRecordPacket.setMStatus(7);
                    Unit unit = Unit.OXO1;
                    BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleRecordPacket, false, false, 24, null);
                }

                /* JADX WARN: Type inference failed for: r0v10, types: [T, com.sma.smartv3.model.AIAnswer] */
                @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
                public void onTtsText(String text, boolean z) {
                    String string;
                    Intrinsics.X0O(text, "text");
                    LogUtils.m11128d("AIManager VoiceManager onTtsText  text = " + text + " , isFinal = " + z + "  ");
                    sb.append(text);
                    objectRef.element.setEnded(OiOX0i.m1037iO(z));
                    AIAnswer aIAnswer = objectRef.element;
                    if (z) {
                        string = sb.toString();
                        Intrinsics.XXI(string);
                    } else {
                        string = ((Object) sb) + APSSharedUtil.TRUNCATE_SEPARATOR;
                    }
                    aIAnswer.setText(string);
                    handMessage(objectRef.element);
                    if (z) {
                        objectRef.element = new AIAnswer(AIFunctionType.AI, null, 0, null, null, 26, null);
                        ke5.XO0X10iO(sb);
                        this.index = 0;
                    }
                }
            });
            return;
        }
        if (mStatus == 1) {
            Iterator it = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(recordPacket.getMPacket()), 40).iterator();
            while (it.hasNext()) {
                WebSocketManager.INSTANCE.sendAudioStreamWithBuffer(CollectionsKt___CollectionsKt.XX0X0((List) it.next()));
            }
            return;
        }
        if (mStatus != 2) {
            if (mStatus != 3) {
                return;
            }
            i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket SUSPEND");
            isSpeechRecRunning = false;
            OpusManager opusManager3 = mOpusManager;
            if (opusManager3 != null) {
                opusManager3.stopDecodeStream();
            }
            WebSocketManager webSocketManager2 = WebSocketManager.INSTANCE;
            webSocketManager2.sendAbortMessage();
            webSocketManager2.sendStopListenMessage();
            return;
        }
        if (!isSpeechRecRunning) {
            i1O0OXO1O.OXO1.XIi00iiXO("AIManager VoiceManager BleRecordPacket webSocketRecordPacket END isSpeechRecRunning = " + isSpeechRecRunning);
            return;
        }
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket END");
        isSpeechRecRunning = false;
        endTransfer();
        OpusManager opusManager4 = mOpusManager;
        if (opusManager4 != null) {
            opusManager4.stopDecodeStream();
        }
        WebSocketManager.INSTANCE.sendStopListenMessage();
    }

    public final void voiceQuery(@aa1 final String query) {
        int i;
        Intrinsics.X0O(query, "query");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager voiceQuery -> " + query);
        if (isVoiceAIIdentify()) {
            sendMsg(query);
            return;
        }
        if (i72.OXO1.I0IIOI() && (i = mAIMode) >= 0 && i <= 3) {
            if (i == 2) {
                q62 q62Var = q62.OXO1;
                if (q62Var.OIXOOi()) {
                    AISparkChainManager.OXO1.iXiiiO(query, mAISparkChainManagerCallback, q62Var.iXOII(), true);
                    return;
                }
            }
            AIChat(query, "voiceQuery");
            return;
        }
        q62 q62Var2 = q62.OXO1;
        if (q62Var2.OIXOOi()) {
            AISparkChainManager.OXO1.iXiiiO(query, mAISparkChainManagerCallback, q62Var2.iXOII(), true);
            return;
        }
        if (q62Var2.XOX()) {
            AIChat(query, "voiceQuery isUseAIService");
            return;
        }
        if (q62Var2.IiX1ii()) {
            if (isExpired()) {
                refreshToken(new Function1() { // from class: com.android.mltcode.paycertificationapi.bj6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return VoiceManager.voiceQuery$lambda$0(query, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            } else {
                duserStreamChat(query);
                return;
            }
        }
        if (TextUtils.isEmpty(q62Var2.iIiiO())) {
            ToastUtils.showLong(R.string.no_ai_key);
        } else {
            openAiChatCompletion(query);
        }
    }

    public final void voiceRecord() {
        AISparkChainManager.OXO1.O0O0X0iOi();
        DcsTtsPlayer.INSTANCE.stop();
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), recordingCallBack, false, resetCallBack, TAG, 2, null);
    }
}
