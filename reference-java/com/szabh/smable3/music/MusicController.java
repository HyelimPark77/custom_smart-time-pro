package com.szabh.smable3.music;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
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
import com.szabh.smable3.entity.BleMusicControl;
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
import com.szabh.smable3.entity.MusicAttr;
import com.szabh.smable3.entity.MusicCommand;
import com.szabh.smable3.entity.MusicEntity;
import com.szabh.smable3.music.MusicController;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMusicController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1563#2:523\n1634#2,3:524\n1869#2,2:528\n1563#2:530\n1634#2,3:531\n1563#2:534\n1634#2,3:535\n1#3:527\n*S KotlinDebug\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n*L\n211#1:523\n211#1:524,3\n280#1:528,2\n387#1:530\n387#1:531,3\n81#1:534\n81#1:535,3\n*E\n"})
public final class MusicController extends MusicControllerCompat {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    public static final String LOG_HEADER = "MusicController";

    @tb1
    private MediaController curMedia;
    private boolean isOldMusicControl;

    @tb1
    private MediaControllerCompat mActiveMediaController;
    private long mLastVolumeTime;

    @tb1
    private MediaSessionManager mMediaSessionManager;
    private ComponentName mNotificationListener;
    private long tempTime;
    private int mLastVolume = -1;

    @aa1
    private final MusicController$mCallback$1 mCallback = new MediaControllerCompat.Callback() { // from class: com.szabh.smable3.music.MusicController$mCallback$1
        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            this.this$0.updateMetadata(mediaMetadataCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            this.this$0.updatePlaybackState(playbackStateCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            i1O0OXO1O.OXO1.XO0O10("MusicController onSessionDestroyed");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            i1O0OXO1O.OXO1.XO0O10("MusicController onSessionEvent -> event:" + str + ", extras:" + bundle);
        }
    };

    @aa1
    private final MediaSessionManager.OnActiveSessionsChangedListener mOnActiveSessionsChangedListener = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: com.android.mltcode.paycertificationapi.gw0
        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public final void onActiveSessionsChanged(List list) {
            MusicController.mOnActiveSessionsChangedListener$lambda$0(this.OXO1, list);
        }
    };

    @aa1
    private final MusicController$mBleHandleCallback$1 mBleHandleCallback = new BleHandleCallback() { // from class: com.szabh.smable3.music.MusicController$mBleHandleCallback$1

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MusicCommand.values().length];
                try {
                    iArr[MusicCommand.PLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MusicCommand.PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MusicCommand.TOGGLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MusicCommand.NEXT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MusicCommand.PRE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MusicCommand.VOLUME_UP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MusicCommand.VOLUME_DOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MusicCommand.UNKNOWN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
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
        public void onHIDValueChange(int i) {
            List<MediaController> activeSessions;
            PlaybackStateCompat playbackState;
            if (i == 0 || i == 1 || i == 2) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                StringBuilder sb = new StringBuilder();
                sb.append("MusicController onHIDValueChange ");
                sb.append(i);
                sb.append(" , current activeMediaController = ");
                MediaControllerCompat mediaControllerCompat = this.this$0.mActiveMediaController;
                ArrayList arrayList = null;
                sb.append(mediaControllerCompat != null ? mediaControllerCompat.getPackageName() : null);
                sb.append(" playbackState=");
                MediaControllerCompat mediaControllerCompat2 = this.this$0.mActiveMediaController;
                sb.append((mediaControllerCompat2 == null || (playbackState = mediaControllerCompat2.getPlaybackState()) == null) ? null : Integer.valueOf(playbackState.getState()));
                i1o0oxo1o.XO0O10(sb.toString());
                MediaSessionManager mediaSessionManager = this.this$0.mMediaSessionManager;
                if (mediaSessionManager != null) {
                    ComponentName componentName = this.this$0.mNotificationListener;
                    if (componentName == null) {
                        Intrinsics.XXO("mNotificationListener");
                        componentName = null;
                    }
                    activeSessions = mediaSessionManager.getActiveSessions(componentName);
                } else {
                    activeSessions = null;
                }
                MusicController musicController = this.this$0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MusicController onHIDValueChange activeMediaControllers -> ");
                if (activeSessions != null) {
                    List<MediaController> list = activeSessions;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                    for (MediaController mediaController : list) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(mediaController.getPackageName());
                        sb3.append(" playbackState=");
                        PlaybackState playbackState2 = mediaController.getPlaybackState();
                        sb3.append(playbackState2 != null ? Integer.valueOf(playbackState2.getState()) : null);
                        arrayList2.add(sb3.toString());
                    }
                    arrayList = arrayList2;
                }
                sb2.append(arrayList);
                i1o0oxo1o.XO0O10(sb2.toString());
                musicController.autoSwitchActiveController(activeSessions, true);
            }
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
        public void onReceiveMusicCommand(MusicCommand musicCommand) {
            boolean z;
            List<MediaController> activeSessions;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z2;
            PlaybackStateCompat playbackState;
            PlaybackStateCompat playbackState2;
            boolean z3;
            Intrinsics.X0O(musicCommand, "musicCommand");
            int i = WhenMappings.$EnumSwitchMapping$0[musicCommand.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                MediaControllerCompat mediaControllerCompat = this.this$0.mActiveMediaController;
                z = (mediaControllerCompat == null || (playbackState2 = mediaControllerCompat.getPlaybackState()) == null || 3 != playbackState2.getState()) ? false : true;
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                StringBuilder sb = new StringBuilder();
                sb.append("MusicController onReceiveMusicCommand ");
                sb.append(musicCommand);
                sb.append(" , isPlay = ");
                sb.append(z);
                sb.append(" , current activeMediaController = ");
                MediaControllerCompat mediaControllerCompat2 = this.this$0.mActiveMediaController;
                sb.append(mediaControllerCompat2 != null ? mediaControllerCompat2.getPackageName() : null);
                sb.append(" playbackState=");
                MediaControllerCompat mediaControllerCompat3 = this.this$0.mActiveMediaController;
                sb.append((mediaControllerCompat3 == null || (playbackState = mediaControllerCompat3.getPlaybackState()) == null) ? null : Integer.valueOf(playbackState.getState()));
                i1o0oxo1o.XO0O10(sb.toString());
                MediaSessionManager mediaSessionManager = this.this$0.mMediaSessionManager;
                if (mediaSessionManager != null) {
                    ComponentName componentName = this.this$0.mNotificationListener;
                    if (componentName == null) {
                        Intrinsics.XXO("mNotificationListener");
                        componentName = null;
                    }
                    activeSessions = mediaSessionManager.getActiveSessions(componentName);
                } else {
                    activeSessions = null;
                }
                MusicController musicController = this.this$0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MusicController onReceiveMusicCommand activeMediaControllers -> ");
                if (activeSessions != null) {
                    List<MediaController> list = activeSessions;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                    for (MediaController mediaController : list) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(mediaController.getPackageName());
                        sb3.append(" playbackState=");
                        PlaybackState playbackState3 = mediaController.getPlaybackState();
                        sb3.append(playbackState3 != null ? Integer.valueOf(playbackState3.getState()) : null);
                        sb3.append(' ');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    arrayList = null;
                }
                sb2.append(arrayList);
                i1o0oxo1o.XO0O10(sb2.toString());
                if (activeSessions != null) {
                    Iterator<MediaController> it = activeSessions.iterator();
                    while (it.hasNext()) {
                        PlaybackState playbackState4 = it.next().getPlaybackState();
                        if ((playbackState4 != null ? Integer.valueOf(playbackState4.getState()) : null) == null) {
                            it.remove();
                        }
                    }
                }
                i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("MusicController onReceiveMusicCommand activeMediaControllers -> ");
                if (activeSessions != null) {
                    List<MediaController> list2 = activeSessions;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    for (MediaController mediaController2 : list2) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(mediaController2.getPackageName());
                        sb5.append(" playbackState=");
                        PlaybackState playbackState5 = mediaController2.getPlaybackState();
                        sb5.append(playbackState5 != null ? Integer.valueOf(playbackState5.getState()) : null);
                        sb5.append(' ');
                        arrayList3.add(sb5.toString());
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                sb4.append(arrayList2);
                i1o0oxo1o2.XO0O10(sb4.toString());
                z2 = true;
                musicController.autoSwitchActiveController(activeSessions, true);
            } else {
                z2 = true;
                z = false;
            }
            if (this.this$0.mActiveMediaController == null) {
                AudioManager mAudioManager = this.this$0.getMAudioManager();
                if (mAudioManager == null || mAudioManager.isMusicActive() != z2) {
                    z3 = false;
                } else {
                    this.this$0.setOldMusicControl(z2);
                    z3 = true;
                }
                i1O0OXO1O.OXO1.OXO1("MusicController oldMusicControl = " + this.this$0.isOldMusicControl() + " , playing = " + z3 + "  ");
                int i2 = WhenMappings.$EnumSwitchMapping$0[musicCommand.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    if (this.this$0.isOldMusicControl()) {
                        String strValueOf = String.valueOf((int) (z3 ? com.szabh.smable3.entity.PlaybackState.PAUSED : com.szabh.smable3.entity.PlaybackState.PLAYING).getMState());
                        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
                        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                        Intrinsics.O10IXXX0X(str, "format(...)");
                        List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(strValueOf, str, ",0");
                        BleConnector bleConnector = BleConnector.INSTANCE;
                        bleConnector.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, (List<String>) listIXiX011));
                        bleConnector.updateMusic(new BleMusicControl(MusicEntity.TRACK, MusicAttr.TRACK_TITLE, "Music"));
                    }
                } else if ((i2 == 4 || i2 == 5) && this.this$0.isOldMusicControl()) {
                    String strValueOf2 = String.valueOf((int) com.szabh.smable3.entity.PlaybackState.PLAYING.getMState());
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
                    String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                    Intrinsics.O10IXXX0X(str2, "format(...)");
                    List listIXiX012 = CollectionsKt__CollectionsKt.iXiX011(strValueOf2, str2, ",0");
                    BleConnector bleConnector2 = BleConnector.INSTANCE;
                    bleConnector2.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, (List<String>) listIXiX012));
                    bleConnector2.updateMusic(new BleMusicControl(MusicEntity.TRACK, MusicAttr.TRACK_TITLE, "Music"));
                }
                z = z3;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[musicCommand.ordinal()]) {
                case 1:
                    this.this$0.sendMediaKeyEvent(126);
                    return;
                case 2:
                    this.this$0.sendMediaKeyEvent(127);
                    return;
                case 3:
                    MusicController musicController2 = this.this$0;
                    if (z) {
                        musicController2.sendMediaKeyEvent(127);
                        return;
                    } else {
                        musicController2.sendMediaKeyEvent(126);
                        return;
                    }
                case 4:
                    this.this$0.sendMediaKeyEvent(87);
                    return;
                case 5:
                    this.this$0.sendMediaKeyEvent(88);
                    return;
                case 6:
                    AudioManager mAudioManager2 = this.this$0.getMAudioManager();
                    if (mAudioManager2 != null) {
                        mAudioManager2.adjustStreamVolume(3, 1, 5);
                        return;
                    }
                    return;
                case 7:
                    AudioManager mAudioManager3 = this.this$0.getMAudioManager();
                    if (mAudioManager3 != null) {
                        mAudioManager3.adjustStreamVolume(3, -1, 5);
                        return;
                    }
                    return;
                case 8:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
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
        public /* bridge */ void onSessionStateChange(boolean z) {
            super.onSessionStateChange(z);
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
    private List<String> lastStateContents = new ArrayList();

    @aa1
    private String lastArtist = "";

    @aa1
    private String lastAlbum = "";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getState(PlaybackStateCompat playbackStateCompat) {
            if (playbackStateCompat == null) {
                return "null";
            }
            int state = playbackStateCompat.getState();
            if (state == 1) {
                return "STATE_STOPPED";
            }
            if (state == 2) {
                return "STATE_PAUSED";
            }
            if (state == 3) {
                return "STATE_PLAYING";
            }
            if (state != 4) {
                return state != 5 ? "OTHER" : "STATE_REWINDING";
            }
            return "STATE_FAST_FORWARDING";
        }

        private Companion() {
        }
    }

    private final void assignActiveController(MediaController mediaController) {
        PlaybackStateCompat playbackState;
        try {
            releaseActiveController();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            StringBuilder sb = new StringBuilder();
            sb.append("MusicController assignActiveController -> ");
            sb.append(mediaController != null ? mediaController.getPackageName() : null);
            i1o0oxo1o.XO0O10(sb.toString());
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(getMContext(), MediaSessionCompat.Token.fromToken(mediaController != null ? mediaController.getSessionToken() : null));
            this.mActiveMediaController = mediaControllerCompat;
            mediaControllerCompat.registerCallback(this.mCallback);
            MediaControllerCompat mediaControllerCompat2 = this.mActiveMediaController;
            if ((mediaControllerCompat2 != null ? mediaControllerCompat2.getPlaybackState() : null) == null) {
                MediaControllerCompat mediaControllerCompat3 = this.mActiveMediaController;
                if (((mediaControllerCompat3 == null || (playbackState = mediaControllerCompat3.getPlaybackState()) == null) ? null : Integer.valueOf(playbackState.getState())) == null) {
                    return;
                }
            }
            MediaControllerCompat mediaControllerCompat4 = this.mActiveMediaController;
            updatePlaybackState(mediaControllerCompat4 != null ? mediaControllerCompat4.getPlaybackState() : null);
            MediaControllerCompat mediaControllerCompat5 = this.mActiveMediaController;
            updateMetadata(mediaControllerCompat5 != null ? mediaControllerCompat5.getMetadata() : null);
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.XO0O10("MusicController assignActiveController -> error:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoSwitchActiveController(List<MediaController> list, boolean z) {
        Object next;
        Object next2;
        Object next3;
        PlaybackStateCompat playbackState;
        if (list == null || list.isEmpty()) {
            if (z) {
                releaseActiveController();
            }
            this.curMedia = null;
            if (!this.isOldMusicControl) {
                String strValueOf = String.valueOf((int) com.szabh.smable3.entity.PlaybackState.PAUSED.getMState());
                StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                Intrinsics.O10IXXX0X(str, "format(...)");
                List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(strValueOf, str, ",0");
                BleConnector bleConnector = BleConnector.INSTANCE;
                bleConnector.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, (List<String>) listIXiX011));
                MusicEntity musicEntity = MusicEntity.TRACK;
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_ARTIST, " "));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_ALBUM, " "));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_TITLE, " "));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_DURATION, "0"));
            }
            this.mLastVolume = -1;
            return;
        }
        List<MediaController> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PlaybackState playbackState2 = ((MediaController) next).getPlaybackState();
            if (playbackState2 != null && playbackState2.getState() == 3) {
                break;
            }
        }
        MediaController mediaController = (MediaController) next;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            PlaybackState playbackState3 = ((MediaController) next2).getPlaybackState();
            if (playbackState3 != null && playbackState3.getState() == 2) {
                break;
            }
        }
        MediaController mediaController2 = (MediaController) next2;
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            PlaybackState playbackState4 = ((MediaController) next3).getPlaybackState();
            if (playbackState4 != null && playbackState4.getState() == 1) {
                break;
            }
        }
        MediaController mediaController3 = (MediaController) next3;
        if (mediaController == null) {
            mediaController = mediaController2 == null ? mediaController3 == null ? list.get(0) : mediaController3 : mediaController2;
        }
        this.curMedia = mediaController;
        this.isOldMusicControl = false;
        MediaControllerCompat mediaControllerCompat = this.mActiveMediaController;
        String packageName = mediaControllerCompat != null ? mediaControllerCompat.getPackageName() : null;
        MediaController mediaController4 = this.curMedia;
        if (!Intrinsics.XOO0ii0(packageName, mediaController4 != null ? mediaController4.getPackageName() : null)) {
            assignActiveController(this.curMedia);
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = this.mActiveMediaController;
        if (mediaControllerCompat2 == null || (playbackState = mediaControllerCompat2.getPlaybackState()) == null || playbackState.getState() != 3) {
            for (MediaController mediaController5 : list2) {
                PlaybackState playbackState5 = mediaController5.getPlaybackState();
                if (playbackState5 != null && playbackState5.getState() == 3) {
                    assignActiveController(mediaController5);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void autoSwitchActiveController$default(MusicController musicController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        musicController.autoSwitchActiveController(list, z);
    }

    private final ComponentName getNotificationListener(Context context) {
        if (!(context instanceof NotificationListenerService)) {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            ServiceInfo serviceInfo = null;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo2 : serviceInfoArr) {
                    if (Intrinsics.XOO0ii0(serviceInfo2.permission, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                        serviceInfo = serviceInfo2;
                        break;
                    }
                }
            }
            if (serviceInfo != null) {
                i1O0OXO1O.OXO1.OXO1("NotificationListener -> " + serviceInfo.name);
                return new ComponentName(context, serviceInfo.name);
            }
        }
        return new ComponentName(context, context.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mOnActiveSessionsChangedListener$lambda$0(MusicController musicController, List list) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("MusicController onActiveSessionsChanged -> ");
        ArrayList arrayList = null;
        if (list != null) {
            List<MediaController> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            for (MediaController mediaController : list2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(mediaController.getPackageName());
                sb2.append(" playbackState=");
                PlaybackState playbackState = mediaController.getPlaybackState();
                sb2.append(playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
                arrayList2.add(sb2.toString());
            }
            arrayList = arrayList2;
        }
        sb.append(arrayList);
        i1o0oxo1o.XO0O10(sb.toString());
        musicController.autoSwitchActiveController(list, true);
    }

    private final void releaseActiveController() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("MusicController releaseActiveController -> ");
        MediaControllerCompat mediaControllerCompat = this.mActiveMediaController;
        sb.append(mediaControllerCompat != null ? mediaControllerCompat.getPackageName() : null);
        i1o0oxo1o.XO0O10(sb.toString());
        if (this.mActiveMediaController != null) {
            String strValueOf = String.valueOf((int) com.szabh.smable3.entity.PlaybackState.PAUSED.getMState());
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, (List<String>) CollectionsKt__CollectionsKt.iXiX011(strValueOf, str, ",0")));
            MediaControllerCompat mediaControllerCompat2 = this.mActiveMediaController;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.unregisterCallback(this.mCallback);
            }
            this.mActiveMediaController = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMediaKeyEvent(int i) {
        MediaControllerCompat.TransportControls transportControls;
        MediaControllerCompat.TransportControls transportControls2;
        MediaControllerCompat.TransportControls transportControls3;
        MediaControllerCompat.TransportControls transportControls4;
        MediaControllerCompat mediaControllerCompat = this.mActiveMediaController;
        if (mediaControllerCompat == null || this.curMedia == null) {
            AudioManager mAudioManager = getMAudioManager();
            if (mAudioManager != null) {
                mAudioManager.dispatchMediaKeyEvent(new KeyEvent(0, i));
            }
            AudioManager mAudioManager2 = getMAudioManager();
            if (mAudioManager2 != null) {
                mAudioManager2.dispatchMediaKeyEvent(new KeyEvent(1, i));
                return;
            }
            return;
        }
        if (mediaControllerCompat != null) {
            if (mediaControllerCompat != null) {
                if ((mediaControllerCompat != null ? mediaControllerCompat.getTransportControls() : null) != null) {
                    if (i == 87) {
                        MediaControllerCompat mediaControllerCompat2 = this.mActiveMediaController;
                        if (mediaControllerCompat2 == null || (transportControls = mediaControllerCompat2.getTransportControls()) == null) {
                            return;
                        }
                        transportControls.skipToNext();
                        return;
                    }
                    if (i == 88) {
                        MediaControllerCompat mediaControllerCompat3 = this.mActiveMediaController;
                        if (mediaControllerCompat3 == null || (transportControls2 = mediaControllerCompat3.getTransportControls()) == null) {
                            return;
                        }
                        transportControls2.skipToPrevious();
                        return;
                    }
                    if (i == 126) {
                        MediaControllerCompat mediaControllerCompat4 = this.mActiveMediaController;
                        if (mediaControllerCompat4 == null || (transportControls3 = mediaControllerCompat4.getTransportControls()) == null) {
                            return;
                        }
                        transportControls3.play();
                        return;
                    }
                    if (i != 127) {
                        mediaControllerCompat.dispatchMediaButtonEvent(new KeyEvent(0, i));
                        mediaControllerCompat.dispatchMediaButtonEvent(new KeyEvent(1, i));
                        return;
                    }
                    MediaControllerCompat mediaControllerCompat5 = this.mActiveMediaController;
                    if (mediaControllerCompat5 == null || (transportControls4 = mediaControllerCompat5.getTransportControls()) == null) {
                        return;
                    }
                    transportControls4.pause();
                    return;
                }
            }
            mediaControllerCompat.dispatchMediaButtonEvent(new KeyEvent(0, i));
            mediaControllerCompat.dispatchMediaButtonEvent(new KeyEvent(1, i));
        }
    }

    private final void updateMusic(String str, String str2, String str3, String str4) {
        if (StringsKt__StringsKt.iX1X1(this.lastArtist).toString().length() == 0) {
            this.lastArtist = str;
        }
        if (StringsKt__StringsKt.iX1X1(this.lastAlbum).toString().length() == 0) {
            this.lastAlbum = str2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(this.lastArtist).toString(), StringsKt__StringsKt.iX1X1(str).toString()) && Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(this.lastAlbum).toString(), StringsKt__StringsKt.iX1X1(str2).toString())) {
            if (jCurrentTimeMillis - this.tempTime > 30000) {
                this.tempTime = jCurrentTimeMillis;
                BleConnector bleConnector = BleConnector.INSTANCE;
                MusicEntity musicEntity = MusicEntity.TRACK;
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_ARTIST, str));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_ALBUM, str2));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_TITLE, str3));
                bleConnector.updateMusic(new BleMusicControl(musicEntity, MusicAttr.TRACK_DURATION, str4));
                return;
            }
            return;
        }
        this.lastArtist = str;
        this.lastAlbum = str2;
        this.tempTime = jCurrentTimeMillis;
        BleConnector bleConnector2 = BleConnector.INSTANCE;
        MusicEntity musicEntity2 = MusicEntity.TRACK;
        bleConnector2.updateMusic(new BleMusicControl(musicEntity2, MusicAttr.TRACK_ARTIST, str));
        bleConnector2.updateMusic(new BleMusicControl(musicEntity2, MusicAttr.TRACK_ALBUM, str2));
        bleConnector2.updateMusic(new BleMusicControl(musicEntity2, MusicAttr.TRACK_TITLE, str3));
        bleConnector2.updateMusic(new BleMusicControl(musicEntity2, MusicAttr.TRACK_DURATION, str4));
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void exit() {
        i1O0OXO1O.OXO1.XO0O10("MusicController exit");
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        releaseActiveController();
        super.exit();
    }

    @tb1
    public final MediaController getCurMedia() {
        return this.curMedia;
    }

    public final boolean isOldMusicControl() {
        return this.isOldMusicControl;
    }

    @aa1
    public final String keepTwoDecimal(float f) {
        if (Math.abs(f) > Float.MAX_VALUE) {
            return "0.00";
        }
        String str = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(new BigDecimal(String.valueOf(f)));
        Intrinsics.XXI(str);
        return str;
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void launch(@aa1 Context context) {
        List<MediaController> activeSessions;
        ArrayList arrayList;
        Intrinsics.X0O(context, "context");
        super.launch(context);
        try {
            this.mNotificationListener = getNotificationListener(context);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            StringBuilder sb = new StringBuilder();
            sb.append("MusicController launch notificationListener -> ");
            ComponentName componentName = this.mNotificationListener;
            ComponentName componentName2 = null;
            if (componentName == null) {
                Intrinsics.XXO("mNotificationListener");
                componentName = null;
            }
            sb.append(componentName);
            i1o0oxo1o.XO0O10(sb.toString());
            Object systemService = context.getSystemService("media_session");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
            MediaSessionManager mediaSessionManager = (MediaSessionManager) systemService;
            this.mMediaSessionManager = mediaSessionManager;
            if (mediaSessionManager != null) {
                ComponentName componentName3 = this.mNotificationListener;
                if (componentName3 == null) {
                    Intrinsics.XXO("mNotificationListener");
                    componentName3 = null;
                }
                activeSessions = mediaSessionManager.getActiveSessions(componentName3);
            } else {
                activeSessions = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MusicController launch activeMediaControllers -> ");
            if (activeSessions != null) {
                List<MediaController> list = activeSessions;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                for (MediaController mediaController : list) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(mediaController.getPackageName());
                    sb3.append(" playbackState=");
                    PlaybackState playbackState = mediaController.getPlaybackState();
                    sb3.append(playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
                    arrayList.add(sb3.toString());
                }
            } else {
                arrayList = null;
            }
            sb2.append(arrayList);
            i1o0oxo1o.XO0O10(sb2.toString());
            autoSwitchActiveController$default(this, activeSessions, false, 2, null);
            MediaSessionManager mediaSessionManager2 = this.mMediaSessionManager;
            if (mediaSessionManager2 != null) {
                MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener = this.mOnActiveSessionsChangedListener;
                ComponentName componentName4 = this.mNotificationListener;
                if (componentName4 == null) {
                    Intrinsics.XXO("mNotificationListener");
                } else {
                    componentName2 = componentName4;
                }
                mediaSessionManager2.addOnActiveSessionsChangedListener(onActiveSessionsChangedListener, componentName2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.XIi00iiXO("MusicController launch notificationListener error -> " + e.getMessage());
        }
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    public final void setCurMedia(@tb1 MediaController mediaController) {
        this.curMedia = mediaController;
    }

    public final void setOldMusicControl(boolean z) {
        this.isOldMusicControl = z;
    }

    public final void updateMetadata(@tb1 MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        String string = mediaMetadataCompat.getString("android.media.metadata.ARTIST");
        if (string == null) {
            string = " ";
        }
        String string2 = mediaMetadataCompat.getString("android.media.metadata.ALBUM");
        if (string2 == null) {
            string2 = " ";
        }
        String string3 = mediaMetadataCompat.getString("android.media.metadata.TITLE");
        String str = string3 != null ? string3 : " ";
        String strValueOf = String.valueOf(mediaMetadataCompat.getLong("android.media.metadata.DURATION") / ((long) 1000));
        i1O0OXO1O.OXO1.XO0O10("MusicController updateMetadata -> METADATA_KEY_ARTIST=" + string + " , METADATA_KEY_ALBUM=" + string2 + ", METADATA_KEY_TITLE=" + str + ", METADATA_KEY_DURATION=" + strValueOf + " ,  lastArtist=" + this.lastArtist + ", lastAlbum=" + this.lastAlbum);
        updateMusic(string, string2, str, strValueOf);
        if (this.mLastVolume == -1) {
            updateVolume();
        }
    }

    public final void updatePlaybackState(@tb1 PlaybackStateCompat playbackStateCompat) {
        byte mState;
        List<MediaController> activeSessions;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.XO0O10("MusicController updatePlaybackState -> state=" + Companion.getState(playbackStateCompat) + ' ' + playbackStateCompat);
        if (playbackStateCompat == null) {
            return;
        }
        int state = playbackStateCompat.getState();
        if (state == 1 || state == 2) {
            mState = com.szabh.smable3.entity.PlaybackState.PAUSED.getMState();
        } else if (state == 3) {
            mState = com.szabh.smable3.entity.PlaybackState.PLAYING.getMState();
        } else if (state != 4) {
            mState = state != 5 ? com.szabh.smable3.entity.PlaybackState.UNKNOWN.getMState() : com.szabh.smable3.entity.PlaybackState.REWINDING.getMState();
        } else {
            mState = com.szabh.smable3.entity.PlaybackState.FAST_FORWARDING.getMState();
        }
        if (mState != com.szabh.smable3.entity.PlaybackState.UNKNOWN.getMState()) {
            String strValueOf = String.valueOf((int) mState);
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(playbackStateCompat.getPlaybackSpeed())}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            StringBuilder sb = new StringBuilder();
            sb.append(',');
            sb.append(playbackStateCompat.getPosition() / ((long) 1000));
            List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(strValueOf, str, sb.toString());
            i1o0oxo1o.XO0O10("MusicController updatePlaybackState -> contents=" + listIXiX011);
            if (!Intrinsics.XOO0ii0(this.lastStateContents, listIXiX011)) {
                this.lastStateContents.clear();
                this.lastStateContents.addAll(listIXiX011);
                BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, (List<String>) listIXiX011));
            }
            if (this.mLastVolume == -1) {
                updateVolume();
            }
        }
        if (mState != com.szabh.smable3.entity.PlaybackState.PAUSED.getMState() || getMContext() == null) {
            return;
        }
        MediaSessionManager mediaSessionManager = this.mMediaSessionManager;
        ArrayList arrayList = null;
        if (mediaSessionManager != null) {
            ComponentName componentName = this.mNotificationListener;
            if (componentName == null) {
                Intrinsics.XXO("mNotificationListener");
                componentName = null;
            }
            activeSessions = mediaSessionManager.getActiveSessions(componentName);
        } else {
            activeSessions = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MusicController updatePlaybackState activeMediaControllers -> ");
        if (activeSessions != null) {
            List<MediaController> list = activeSessions;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            for (MediaController mediaController : list) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(mediaController.getPackageName());
                sb3.append(" playbackState=");
                PlaybackState playbackState = mediaController.getPlaybackState();
                sb3.append(playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
                arrayList2.add(sb3.toString());
            }
            arrayList = arrayList2;
        }
        sb2.append(arrayList);
        i1o0oxo1o.XO0O10(sb2.toString());
        autoSwitchActiveController(activeSessions, true);
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void updateVolume() {
        int streamVolume = getStreamVolume(3);
        int streamMaxVolume = getStreamMaxVolume(3);
        if (System.currentTimeMillis() - this.mLastVolumeTime > 150 || ((streamVolume == 0 || streamVolume == streamMaxVolume) && streamVolume != this.mLastVolume)) {
            this.mLastVolumeTime = System.currentTimeMillis();
            String strKeepTwoDecimal = keepTwoDecimal(streamVolume / streamMaxVolume);
            if (BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_VOLUME, strKeepTwoDecimal))) {
                i1O0OXO1O.OXO1.OXO1("updateVolume -> mLastVolume=" + this.mLastVolume + " , curVolume=" + streamVolume + " , value=" + strKeepTwoDecimal);
                this.mLastVolume = streamVolume;
            }
        }
    }
}
