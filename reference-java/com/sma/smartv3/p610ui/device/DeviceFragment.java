package com.sma.smartv3.p610ui.device;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C3132y7;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.m04;
import com.android.mltcode.paycertificationapi.ml1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.ta2;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.QrcodeTypeInfo;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.otherdevice.charge.SoundEffectsSampleActivity;
import com.sma.smartv3.p610ui.ai_note.AiNoteActivity;
import com.sma.smartv3.p610ui.device.DeviceFragment;
import com.sma.smartv3.p610ui.device.guide.AppGuideActivity;
import com.sma.smartv3.p610ui.device.item.AGPSUpgradeItem;
import com.sma.smartv3.p610ui.device.item.AINoteItem;
import com.sma.smartv3.p610ui.device.item.ActivityRecognitionItem;
import com.sma.smartv3.p610ui.device.item.AlarmClockItem;
import com.sma.smartv3.p610ui.device.item.AlipaySetItem;
import com.sma.smartv3.p610ui.device.item.AntiLostItem;
import com.sma.smartv3.p610ui.device.item.AppStoreItem;
import com.sma.smartv3.p610ui.device.item.AudioBookLearnItem;
import com.sma.smartv3.p610ui.device.item.AuraVideoUseHelpItem;
import com.sma.smartv3.p610ui.device.item.BacklightItem;
import com.sma.smartv3.p610ui.device.item.BaseDeviceItem;
import com.sma.smartv3.p610ui.device.item.BloodOxyGenItem;
import com.sma.smartv3.p610ui.device.item.ClassicPairItem;
import com.sma.smartv3.p610ui.device.item.CustomLogoItem;
import com.sma.smartv3.p610ui.device.item.DateFormatItem;
import com.sma.smartv3.p610ui.device.item.DialItem;
import com.sma.smartv3.p610ui.device.item.DoubleClickScreenItem;
import com.sma.smartv3.p610ui.device.item.DrinkWaterItem;
import com.sma.smartv3.p610ui.device.item.EBookManagerItem;
import com.sma.smartv3.p610ui.device.item.EarphoneItem;
import com.sma.smartv3.p610ui.device.item.EcgMonitoringItem;
import com.sma.smartv3.p610ui.device.item.FallManagerItem;
import com.sma.smartv3.p610ui.device.item.FindWatchItem;
import com.sma.smartv3.p610ui.device.item.FirmwareItem;
import com.sma.smartv3.p610ui.device.item.GameSettingsItem;
import com.sma.smartv3.p610ui.device.item.GameStoreItem;
import com.sma.smartv3.p610ui.device.item.GameTimeSetItem;
import com.sma.smartv3.p610ui.device.item.GestureWake2Item;
import com.sma.smartv3.p610ui.device.item.GestureWakeItem;
import com.sma.smartv3.p610ui.device.item.HardWareAlipayItem;
import com.sma.smartv3.p610ui.device.item.HealthCareItem;
import com.sma.smartv3.p610ui.device.item.HrMonitoringItem;
import com.sma.smartv3.p610ui.device.item.HrvSetItem;
import com.sma.smartv3.p610ui.device.item.HydrationReminderItem;
import com.sma.smartv3.p610ui.device.item.IncomingCallItem;
import com.sma.smartv3.p610ui.device.item.IncomingCallRingItem;
import com.sma.smartv3.p610ui.device.item.IncomingCallRingVibrationItem;
import com.sma.smartv3.p610ui.device.item.InfoItem;
import com.sma.smartv3.p610ui.device.item.LanguageItem;
import com.sma.smartv3.p610ui.device.item.LanguageUpdateItem;
import com.sma.smartv3.p610ui.device.item.LearnCardItem;
import com.sma.smartv3.p610ui.device.item.MacQrcodeItem;
import com.sma.smartv3.p610ui.device.item.MeasureUnitItem;
import com.sma.smartv3.p610ui.device.item.MedicationAlarmItem;
import com.sma.smartv3.p610ui.device.item.MeetingReminderItem;
import com.sma.smartv3.p610ui.device.item.MemoryManagerItem;
import com.sma.smartv3.p610ui.device.item.MessagePushItem;
import com.sma.smartv3.p610ui.device.item.MusicControlItem;
import com.sma.smartv3.p610ui.device.item.MusicManagerItem;
import com.sma.smartv3.p610ui.device.item.MyCardCode2Item;
import com.sma.smartv3.p610ui.device.item.MyCardCodeItem;
import com.sma.smartv3.p610ui.device.item.NFCGuideItem;
import com.sma.smartv3.p610ui.device.item.NavigationItem;
import com.sma.smartv3.p610ui.device.item.NoDisturb2Item;
import com.sma.smartv3.p610ui.device.item.NoDisturbItem;
import com.sma.smartv3.p610ui.device.item.NotificationLightScreenItem;
import com.sma.smartv3.p610ui.device.item.NucleicAcidCodeItem;
import com.sma.smartv3.p610ui.device.item.OfflineMapsItem;
import com.sma.smartv3.p610ui.device.item.PowerSaveModeItem;
import com.sma.smartv3.p610ui.device.item.PressureItem;
import com.sma.smartv3.p610ui.device.item.QiblaItem;
import com.sma.smartv3.p610ui.device.item.ReceiptCode2Item;
import com.sma.smartv3.p610ui.device.item.ReceiptCodeItem;
import com.sma.smartv3.p610ui.device.item.RecordingItem;
import com.sma.smartv3.p610ui.device.item.RelaxReminderItem;
import com.sma.smartv3.p610ui.device.item.RemoteCameraItem;
import com.sma.smartv3.p610ui.device.item.ResetItem;
import com.sma.smartv3.p610ui.device.item.SMSQuickReplyItem;
import com.sma.smartv3.p610ui.device.item.SOSManagerItem;
import com.sma.smartv3.p610ui.device.item.ScheduleItem;
import com.sma.smartv3.p610ui.device.item.SedentarinessItem;
import com.sma.smartv3.p610ui.device.item.ShockItem;
import com.sma.smartv3.p610ui.device.item.ShockLevelItem;
import com.sma.smartv3.p610ui.device.item.ShockSettingsItem;
import com.sma.smartv3.p610ui.device.item.ShutdownItem;
import com.sma.smartv3.p610ui.device.item.SleepSetItem;
import com.sma.smartv3.p610ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.p610ui.device.item.StandbySetItem;
import com.sma.smartv3.p610ui.device.item.StandbyWatchFaceItem;
import com.sma.smartv3.p610ui.device.item.StockMarketItem;
import com.sma.smartv3.p610ui.device.item.SyncContactItem;
import com.sma.smartv3.p610ui.device.item.TempMonitoringItem;
import com.sma.smartv3.p610ui.device.item.TimeFormatItem;
import com.sma.smartv3.p610ui.device.item.TouchSetItem;
import com.sma.smartv3.p610ui.device.item.TranslationDialogueItem;
import com.sma.smartv3.p610ui.device.item.TranslationSimultaneousItem;
import com.sma.smartv3.p610ui.device.item.UnpairItem;
import com.sma.smartv3.p610ui.device.item.VoiceControlItem;
import com.sma.smartv3.p610ui.device.item.VoiceItem;
import com.sma.smartv3.p610ui.device.item.WashItem;
import com.sma.smartv3.p610ui.device.item.WatchPasswordItem;
import com.sma.smartv3.p610ui.device.item.WearWayItem;
import com.sma.smartv3.p610ui.device.item.WechatPaySetItem;
import com.sma.smartv3.p610ui.device.item.WechatVerificationItem;
import com.sma.smartv3.p610ui.device.item.WorldClockItem;
import com.sma.smartv3.p610ui.device.item.XmlyAudioItem;
import com.sma.smartv3.p610ui.login.LoginReminderActivity;
import com.sma.smartv3.p610ui.p612me.LanguageListActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.translate.SparkChainMultiDeviceActivity;
import com.sma.smartv3.p610ui.translate.SparkChainSimultaneousActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.util.UtilsKt;
import com.smart.xmlyaudiolibrary.XmlyAudioWebViewActivity;
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
import com.szabh.smable3.entity.BleDeviceOp;
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
import com.szabh.smable3.entity.BleGameTimeReminder;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n78#2,3:3237\n81#2,5:3241\n78#2,3:3246\n81#2,5:3250\n78#2,3:3255\n81#2,5:3259\n78#2,3:3264\n81#2,5:3268\n78#2,3:3273\n81#2,5:3277\n78#2,3:3282\n81#2,5:3286\n151#2,5:3291\n156#2,5:3297\n99#2,7:3302\n106#2,3:3310\n79#2,7:3313\n109#2:3320\n78#2,3:3321\n81#2,5:3325\n78#2,3:3330\n81#2,5:3334\n78#2,3:3339\n81#2,5:3343\n78#2,3:3348\n81#2,5:3352\n78#2,3:3357\n81#2,5:3361\n78#2,3:3366\n81#2,5:3370\n78#2,3:3375\n81#2,5:3379\n78#2,3:3384\n81#2,5:3388\n78#2,3:3393\n81#2,5:3397\n78#2,3:3402\n81#2,5:3406\n78#2,3:3411\n81#2,5:3415\n78#2,3:3420\n81#2,5:3424\n78#2,3:3429\n81#2,5:3433\n78#2,3:3438\n81#2,5:3442\n78#2,3:3447\n81#2,5:3451\n78#2,3:3456\n81#2,5:3460\n78#2,3:3465\n81#2,5:3469\n78#2,3:3474\n81#2,5:3478\n78#2,3:3483\n81#2,5:3487\n78#2,3:3492\n81#2,5:3496\n78#2,3:3501\n81#2,5:3505\n78#2,3:3510\n81#2,5:3514\n78#2,3:3519\n81#2,5:3523\n78#2,3:3528\n81#2,5:3532\n78#2,3:3537\n81#2,5:3541\n78#2,3:3546\n81#2,5:3550\n99#2,7:3555\n106#2,3:3563\n79#2,7:3566\n109#2:3573\n99#2,7:3574\n106#2,3:3582\n79#2,7:3585\n109#2:3592\n78#2,3:3593\n81#2,5:3597\n99#2,7:3602\n106#2,3:3610\n79#2,7:3613\n109#2:3620\n78#2,3:3621\n81#2,5:3625\n78#2,3:3630\n81#2,5:3634\n78#2,3:3639\n81#2,5:3643\n78#2,3:3648\n81#2,5:3652\n99#2,7:3657\n106#2,3:3665\n79#2,7:3668\n109#2:3675\n99#2,7:3676\n106#2,3:3684\n79#2,7:3687\n109#2:3694\n78#2,3:3695\n81#2,5:3699\n99#2,7:3704\n106#2,3:3712\n79#2,7:3715\n109#2:3722\n78#2,3:3723\n81#2,5:3727\n78#2,3:3732\n81#2,5:3736\n78#2,3:3741\n81#2,5:3745\n78#2,3:3750\n81#2,5:3754\n78#2,3:3759\n81#2,5:3763\n78#2,3:3770\n81#2,5:3774\n78#2,3:3779\n81#2,5:3783\n78#2,3:3788\n81#2,5:3792\n78#2,3:3797\n81#2,5:3801\n78#2,3:3806\n81#2,5:3810\n78#2,3:3815\n81#2,5:3819\n78#2,3:3824\n81#2,5:3828\n78#2,3:3833\n81#2,5:3837\n78#2,3:3842\n81#2,5:3846\n78#2,3:3851\n81#2,5:3855\n78#2,3:3860\n81#2,5:3864\n78#2,3:3869\n81#2,5:3873\n78#2,3:3878\n81#2,5:3882\n78#2,3:3887\n81#2,5:3891\n78#2,3:3896\n81#2,5:3900\n78#2,3:3905\n81#2,5:3909\n78#2,3:3914\n81#2,5:3918\n78#2,3:3923\n81#2,5:3927\n78#2,3:3932\n81#2,5:3936\n99#2,7:3941\n106#2,3:3949\n79#2,7:3952\n109#2:3959\n99#2,7:3960\n106#2,3:3968\n79#2,7:3971\n109#2:3978\n78#2,3:3979\n81#2,5:3983\n78#2,3:3988\n81#2,5:3992\n78#2,3:3997\n81#2,5:4001\n78#2,3:4006\n81#2,5:4010\n78#2,3:4015\n81#2,5:4019\n99#2,7:4024\n106#2,3:4032\n79#2,7:4035\n109#2:4042\n1#3:3229\n1#3:3240\n1#3:3249\n1#3:3258\n1#3:3267\n1#3:3276\n1#3:3285\n1#3:3296\n1#3:3309\n1#3:3324\n1#3:3333\n1#3:3342\n1#3:3351\n1#3:3360\n1#3:3369\n1#3:3378\n1#3:3387\n1#3:3396\n1#3:3405\n1#3:3414\n1#3:3423\n1#3:3432\n1#3:3441\n1#3:3450\n1#3:3459\n1#3:3468\n1#3:3477\n1#3:3486\n1#3:3495\n1#3:3504\n1#3:3513\n1#3:3522\n1#3:3531\n1#3:3540\n1#3:3549\n1#3:3562\n1#3:3581\n1#3:3596\n1#3:3609\n1#3:3624\n1#3:3633\n1#3:3642\n1#3:3651\n1#3:3664\n1#3:3683\n1#3:3698\n1#3:3711\n1#3:3726\n1#3:3735\n1#3:3744\n1#3:3753\n1#3:3762\n1#3:3773\n1#3:3782\n1#3:3791\n1#3:3800\n1#3:3809\n1#3:3818\n1#3:3827\n1#3:3836\n1#3:3845\n1#3:3854\n1#3:3863\n1#3:3872\n1#3:3881\n1#3:3890\n1#3:3899\n1#3:3908\n1#3:3917\n1#3:3926\n1#3:3935\n1#3:3948\n1#3:3967\n1#3:3982\n1#3:3991\n1#3:4000\n1#3:4009\n1#3:4018\n1#3:4031\n12970#4,2:3235\n19#5:3768\n15#5:3769\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n2614#1:3224,5\n2614#1:3230,5\n2914#1:3237,3\n2914#1:3241,5\n2918#1:3246,3\n2918#1:3250,5\n2920#1:3255,3\n2920#1:3259,5\n2922#1:3264,3\n2922#1:3268,5\n2923#1:3273,3\n2923#1:3277,5\n2930#1:3282,3\n2930#1:3286,5\n3137#1:3291,5\n3137#1:3297,5\n3148#1:3302,7\n3148#1:3310,3\n3148#1:3313,7\n3148#1:3320\n286#1:3321,3\n286#1:3325,5\n311#1:3330,3\n311#1:3334,5\n601#1:3339,3\n601#1:3343,5\n758#1:3348,3\n758#1:3352,5\n802#1:3357,3\n802#1:3361,5\n813#1:3366,3\n813#1:3370,5\n852#1:3375,3\n852#1:3379,5\n863#1:3384,3\n863#1:3388,5\n953#1:3393,3\n953#1:3397,5\n964#1:3402,3\n964#1:3406,5\n978#1:3411,3\n978#1:3415,5\n994#1:3420,3\n994#1:3424,5\n1005#1:3429,3\n1005#1:3433,5\n1016#1:3438,3\n1016#1:3442,5\n1086#1:3447,3\n1086#1:3451,5\n1097#1:3456,3\n1097#1:3460,5\n1108#1:3465,3\n1108#1:3469,5\n1119#1:3474,3\n1119#1:3478,5\n1130#1:3483,3\n1130#1:3487,5\n1179#1:3492,3\n1179#1:3496,5\n1407#1:3501,3\n1407#1:3505,5\n1418#1:3510,3\n1418#1:3514,5\n1429#1:3519,3\n1429#1:3523,5\n1440#1:3528,3\n1440#1:3532,5\n1451#1:3537,3\n1451#1:3541,5\n1462#1:3546,3\n1462#1:3550,5\n1474#1:3555,7\n1474#1:3563,3\n1474#1:3566,7\n1474#1:3573\n1487#1:3574,7\n1487#1:3582,3\n1487#1:3585,7\n1487#1:3592\n1501#1:3593,3\n1501#1:3597,5\n1522#1:3602,7\n1522#1:3610,3\n1522#1:3613,7\n1522#1:3620\n1537#1:3621,3\n1537#1:3625,5\n1616#1:3630,3\n1616#1:3634,5\n1618#1:3639,3\n1618#1:3643,5\n1691#1:3648,3\n1691#1:3652,5\n1702#1:3657,7\n1702#1:3665,3\n1702#1:3668,7\n1702#1:3675\n1721#1:3676,7\n1721#1:3684,3\n1721#1:3687,7\n1721#1:3694\n1732#1:3695,3\n1732#1:3699,5\n1743#1:3704,7\n1743#1:3712,3\n1743#1:3715,7\n1743#1:3722\n1754#1:3723,3\n1754#1:3727,5\n1766#1:3732,3\n1766#1:3736,5\n1779#1:3741,3\n1779#1:3745,5\n1792#1:3750,3\n1792#1:3754,5\n1805#1:3759,3\n1805#1:3763,5\n1873#1:3770,3\n1873#1:3774,5\n1875#1:3779,3\n1875#1:3783,5\n1887#1:3788,3\n1887#1:3792,5\n1927#1:3797,3\n1927#1:3801,5\n1930#1:3806,3\n1930#1:3810,5\n1921#1:3815,3\n1921#1:3819,5\n1923#1:3824,3\n1923#1:3828,5\n1943#1:3833,3\n1943#1:3837,5\n1956#1:3842,3\n1956#1:3846,5\n1969#1:3851,3\n1969#1:3855,5\n1982#1:3860,3\n1982#1:3864,5\n1995#1:3869,3\n1995#1:3873,5\n2007#1:3878,3\n2007#1:3882,5\n2046#1:3887,3\n2046#1:3891,5\n2062#1:3896,3\n2062#1:3900,5\n2103#1:3905,3\n2103#1:3909,5\n2111#1:3914,3\n2111#1:3918,5\n2122#1:3923,3\n2122#1:3927,5\n2133#1:3932,3\n2133#1:3936,5\n2144#1:3941,7\n2144#1:3949,3\n2144#1:3952,7\n2144#1:3959\n2155#1:3960,7\n2155#1:3968,3\n2155#1:3971,7\n2155#1:3978\n2167#1:3979,3\n2167#1:3983,5\n2179#1:3988,3\n2179#1:3992,5\n2192#1:3997,3\n2192#1:4001,5\n2205#1:4006,3\n2205#1:4010,5\n2217#1:4015,3\n2217#1:4019,5\n2894#1:4024,7\n2894#1:4032,3\n2894#1:4035,7\n2894#1:4042\n2614#1:3229\n2914#1:3240\n2918#1:3249\n2920#1:3258\n2922#1:3267\n2923#1:3276\n2930#1:3285\n3137#1:3296\n3148#1:3309\n286#1:3324\n311#1:3333\n601#1:3342\n758#1:3351\n802#1:3360\n813#1:3369\n852#1:3378\n863#1:3387\n953#1:3396\n964#1:3405\n978#1:3414\n994#1:3423\n1005#1:3432\n1016#1:3441\n1086#1:3450\n1097#1:3459\n1108#1:3468\n1119#1:3477\n1130#1:3486\n1179#1:3495\n1407#1:3504\n1418#1:3513\n1429#1:3522\n1440#1:3531\n1451#1:3540\n1462#1:3549\n1474#1:3562\n1487#1:3581\n1501#1:3596\n1522#1:3609\n1537#1:3624\n1616#1:3633\n1618#1:3642\n1691#1:3651\n1702#1:3664\n1721#1:3683\n1732#1:3698\n1743#1:3711\n1754#1:3726\n1766#1:3735\n1779#1:3744\n1792#1:3753\n1805#1:3762\n1873#1:3773\n1875#1:3782\n1887#1:3791\n1927#1:3800\n1930#1:3809\n1921#1:3818\n1923#1:3827\n1943#1:3836\n1956#1:3845\n1969#1:3854\n1982#1:3863\n1995#1:3872\n2007#1:3881\n2046#1:3890\n2062#1:3899\n2103#1:3908\n2111#1:3917\n2122#1:3926\n2133#1:3935\n2144#1:3948\n2155#1:3967\n2167#1:3982\n2179#1:3991\n2192#1:4000\n2205#1:4009\n2217#1:4018\n2894#1:4031\n2878#1:3235,2\n1867#1:3768\n1867#1:3769\n*E\n"})
public class DeviceFragment extends BaseDSLRecyclerFragment {
    public static final int CODE_ENABLE_BLUETOOTH = 5;
    public static final int CODE_GUIDE = 2;
    public static final int CODE_LOCATION_SERVER = 6;
    public static final int CODE_MULTI_DEVICE = 7;
    public static final int CODE_PAIR = 1;
    public static final int CODE_SELECT_IMAGE = 4;
    public static final int CODE_USE_GUIDE = 3;

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private boolean isBindDevice;
    private boolean isScanQrcode;
    private long lastClickTime;

    @tb1
    private c72 mAGpsPopup;

    @tb1
    private dj4 mAntiLostSetPopup;

    @tb1
    private dj4 mBacklightPopup;

    @tb1
    private C3132y7 mBacklightPopup2;

    @tb1
    private go0 mBindDeviceRemindPopup;

    @tb1
    private ml1 mConfirmPopup;

    @tb1
    private dj4 mDateFormatPopup;

    @tb1
    private dj4 mGameTimeSetPopup;

    @tb1
    private go0 mHIDPopup;

    @tb1
    private dj4 mIncomingCallPopup;

    @tb1
    private dj4 mIncomingCallRingtPopup;

    @tb1
    private dj4 mMacQrcodePopup;

    @tb1
    private jv0 mMultiRingVibrationPopup;

    @tb1
    private dj4 mNoDisturbPopup;

    @tb1
    private dj4 mNotificationLightScreenItem;

    @tb1
    private go0 mNotificationPopup;

    @tb1
    private go0 mOTAMessagePopup;

    @tb1
    private go0 mPermissionPopup;

    @tb1
    private dj4 mPowerSaveModeSetPopup;

    @tb1
    private dj4 mRingVibrationPopup;

    @tb1
    private m04 mSelectPairPopup;

    @tb1
    private ExtraPackageData[] mServerLanguageList;

    @tb1
    private dj4 mShockPopup;

    @tb1
    private dj4 mStandbySetPopup;

    @tb1
    private dj4 mTimeFormatPopup;

    @tb1
    private go0 mUnbindPopup;

    @tb1
    private dj4 mWearWayPopup;
    private List<DslAdapterItem> showList;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXiO11iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.rootView_delegate$lambda$0(this.f5145IO);
        }
    });
    private boolean isTipAppGuideActivity = true;

    @aa1
    private final Lazy infoItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i0XXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.infoItem_delegate$lambda$0(this.f4379IO);
        }
    });

    @aa1
    private final Lazy gameStoreItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiIOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.gameStoreItem_delegate$lambda$0(this.f4616IO);
        }
    });

    @aa1
    private final Lazy classicPairItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiIii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.classicPairItem_delegate$lambda$0(this.f2247IO);
        }
    });

    @aa1
    private final Lazy dialItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0Ii0IX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.dialItem_delegate$lambda$0(this.f2467IO);
        }
    });

    @aa1
    private final Lazy messagePushItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XI0O01O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.messagePushItem_delegate$lambda$0(this.f7425IO);
        }
    });

    @aa1
    private final Lazy antiLostItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.antiLostItem_delegate$lambda$0(this.f2749IO);
        }
    });

    @aa1
    private final Lazy hydrationReminderItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.hydrationReminderItem_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy meetingReminderItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiiXO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.meetingReminderItem_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy incomingCallItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XOXiOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.incomingCallItem_delegate$lambda$0(this.f2802IO);
        }
    });

    @aa1
    private final Lazy notificationLightScreenItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXIX0iI0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.notificationLightScreenItem_delegate$lambda$0(this.f2022IO);
        }
    });

    @aa1
    private final Lazy timeFormatItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOi0XOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.timeFormatItem_delegate$lambda$0(this.f1887IO);
        }
    });

    @aa1
    private final Lazy dateFormatItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0X1iiiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.dateFormatItem_delegate$lambda$0(this.f2550IO);
        }
    });

    @aa1
    private final Lazy wearWayItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0XIIOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.wearWayItem_delegate$lambda$0(this.f3147IO);
        }
    });

    @aa1
    private final Lazy incomingCallRingVibrationItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIXX0O11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.incomingCallRingVibrationItem_delegate$lambda$0(this.f1657IO);
        }
    });

    @aa1
    private final Lazy languageUpdateItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10iIX10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.languageUpdateItem_delegate$lambda$0(this.f4194IO);
        }
    });

    @aa1
    private final Lazy sleepSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0100iOOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.sleepSet_delegate$lambda$0(this.f3898IO);
        }
    });

    @aa1
    private final Lazy voiceControl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.voiceControl_delegate$lambda$0(this.f2792IO);
        }
    });

    @aa1
    private final Lazy noDisturbItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XIIXXOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.noDisturbItem_delegate$lambda$0(this.f2553IO);
        }
    });

    @aa1
    private final Lazy noDisturb2Item$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIiiII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.noDisturb2Item_delegate$lambda$0(this.f3104IO);
        }
    });

    @aa1
    private final Lazy doubleClickScreenItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXi1OO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.doubleClickScreenItem_delegate$lambda$0(this.f2308IO);
        }
    });

    @aa1
    private final Lazy incomingCallRingItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i001XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.incomingCallRingItem_delegate$lambda$0(this.f7264IO);
        }
    });

    @aa1
    private final Lazy alarmClockItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiX1100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.alarmClockItem_delegate$lambda$0(this.f2280IO);
        }
    });

    @aa1
    private final Lazy nfcGuideItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOIO0Oi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.nfcGuideItem_delegate$lambda$0(this.f2049IO);
        }
    });

    @aa1
    private final Lazy gameTimeSetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO1OO00OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.gameTimeSetItem_delegate$lambda$0(this.f1768IO);
        }
    });

    @aa1
    private final Lazy medicationAlarmItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXO0X10i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.medicationAlarmItem_delegate$lambda$0(this.f8341IO);
        }
    });

    @aa1
    private final Lazy sedentarinessItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii11Oi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.sedentarinessItem_delegate$lambda$0(this.f8546IO);
        }
    });

    @aa1
    private final Lazy findWatchItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0X1OiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.findWatchItem_delegate$lambda$0(this.f4027IO);
        }
    });

    @aa1
    private final Lazy drinkWaterItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii00XXOO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.drinkWaterItem_delegate$lambda$0(this.f2160IO);
        }
    });

    @aa1
    private final Lazy bloodOxyGenItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiXi0Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.bloodOxyGenItem_delegate$lambda$0(this.f3806IO);
        }
    });

    @aa1
    private final Lazy relaxReminderItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIII1OIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.relaxReminderItem_delegate$lambda$0(this.f7843IO);
        }
    });

    @aa1
    private final Lazy resetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0OXO0i00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.resetItem_delegate$lambda$0(this.f4004IO);
        }
    });

    @aa1
    private final Lazy shutdownItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIO11III
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.shutdownItem_delegate$lambda$0(this.f1614IO);
        }
    });

    @aa1
    private final Lazy pressureItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1X0OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.pressureItem_delegate$lambda$0(this.f1439IO);
        }
    });

    @aa1
    private final Lazy standbyWatchFaceItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.standbyWatchFaceItem_delegate$lambda$0(this.f4763IO);
        }
    });

    @aa1
    private final Lazy washItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i01I1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.washItem_delegate$lambda$0(this.f7300IO);
        }
    });

    @aa1
    private final Lazy gameSettingsItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1X00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.gameSettingsItem_delegate$lambda$0(this.f7657IO);
        }
    });

    @aa1
    private final Lazy measureUnitItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIiO0I1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.measureUnitItem_delegate$lambda$0(this.f3089IO);
        }
    });

    @aa1
    private final Lazy shockItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXiOIiIO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.shockItem_delegate$lambda$0(this.f3579IO);
        }
    });

    @aa1
    private final Lazy shockSettingsItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOIiIOiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.shockSettingsItem_delegate$lambda$0(this.f4810IO);
        }
    });

    @aa1
    private final Lazy shockLevelItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiOi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.shockLevelItem_delegate$lambda$0(this.f5317IO);
        }
    });

    @aa1
    private final Lazy backLightItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO00XXII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.backLightItem_delegate$lambda$0(this.f1709IO);
        }
    });

    @aa1
    private final Lazy gestureWakeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXX1OiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.gestureWakeItem_delegate$lambda$0(this.f5135IO);
        }
    });

    @aa1
    private final Lazy gestureWake2Item$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1i1X0111
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.gestureWake2Item_delegate$lambda$0(this.f2838IO);
        }
    });

    @aa1
    private final Lazy hrMonitoringItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10I000I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.hrMonitoringItem_delegate$lambda$0(this.f4138IO);
        }
    });

    @aa1
    private final Lazy ecgMonitoringItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXO0OOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.ecgMonitoringItem_delegate$lambda$0(this.f8149IO);
        }
    });

    @aa1
    private final Lazy tempMonitoringItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0O0IiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.tempMonitoringItem_delegate$lambda$0(this.f7993IO);
        }
    });

    @aa1
    private final Lazy girlCareItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1IiiOIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.girlCareItem_delegate$lambda$0(this.f7823IO);
        }
    });

    @aa1
    private final Lazy remoteCameraItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiOii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.remoteCameraItem_delegate$lambda$0(this.f1918IO);
        }
    });

    @aa1
    private final Lazy languageItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.languageItem_delegate$lambda$0(this.f1874IO);
        }
    });

    @aa1
    private final Lazy offlineMapsItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOI1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.offlineMapsItem_delegate$lambda$0(this.f5057IO);
        }
    });

    @aa1
    private final Lazy videoUseHelpItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiX1iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.videoUseHelpItem_delegate$lambda$0(this.f8633IO);
        }
    });

    @aa1
    private final Lazy touchSetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0XOXOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.touchSetItem_delegate$lambda$0(this.f3411IO);
        }
    });

    @aa1
    private final Lazy firmwareItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOi1Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.firmwareItem_delegate$lambda$0(this.f8127IO);
        }
    });

    @aa1
    private final Lazy aGPSUpgradeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.aGPSUpgradeItem_delegate$lambda$0(this.f3355IO);
        }
    });

    @aa1
    private final Lazy syncContactItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1XXO1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.syncContactItem_delegate$lambda$0(this.f4738IO);
        }
    });

    @aa1
    private final Lazy macQrcodeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIO0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.macQrcodeItem_delegate$lambda$0(this.f5260IO);
        }
    });

    @aa1
    private final Lazy standbySetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIX1i11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.standbySetItem_delegate$lambda$0(this.f3235IO);
        }
    });

    @aa1
    private final Lazy watchPasswordItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOX1XIOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.watchPasswordItem_delegate$lambda$0(this.f3319IO);
        }
    });

    @aa1
    private final Lazy nucleicAcidCodeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1iXiOO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.nucleicAcidCodeItem_delegate$lambda$0(this.f4492IO);
        }
    });

    @aa1
    private final Lazy myCardCodeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1XIIOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.myCardCodeItem_delegate$lambda$0(this.f3193IO);
        }
    });

    @aa1
    private final Lazy myCardCode2Item$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1XIXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.myCardCode2Item_delegate$lambda$0(this.f8042IO);
        }
    });

    @aa1
    private final Lazy receiptCodeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIX1O0X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.receiptCodeItem_delegate$lambda$0(this.f7902IO);
        }
    });

    @aa1
    private final Lazy receiptCode2Item$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIIO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.receiptCode2Item_delegate$lambda$0(this.f1584IO);
        }
    });

    @aa1
    private final Lazy alipaySetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiOOOXXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.alipaySetItem_delegate$lambda$0(this.f4621IO);
        }
    });

    @aa1
    private final Lazy wechatVerificationItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00IOX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.wechatVerificationItem_delegate$lambda$0(this.f1018IO);
        }
    });

    @aa1
    private final Lazy wechatPaySetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OiX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.wechatPaySetItem_delegate$lambda$0(this.f7653IO);
        }
    });

    @aa1
    private final Lazy logoFileItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIi10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.logoFileItem_delegate$lambda$0(this.f3073IO);
        }
    });

    @aa1
    private final Lazy unpairItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XXOiIII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.unpairItem_delegate$lambda$0(this.f2565IO);
        }
    });

    @aa1
    private final Lazy musicControlItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1X1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.musicControlItem_delegate$lambda$0(this.f5001IO);
        }
    });

    @aa1
    private final Lazy stockMarketItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXO00011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.stockMarketItem_delegate$lambda$0(this.f8148IO);
        }
    });

    @aa1
    private final Lazy worldClockItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1XIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.worldClockItem_delegate$lambda$0(this.f4340IO);
        }
    });

    @aa1
    private final Lazy navigationItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOIIX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.navigationItem_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy voiceItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.voiceItem_delegate$lambda$0(this.f4769IO);
        }
    });

    @aa1
    private final Lazy dialogueTranslation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii111
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.dialogueTranslation_delegate$lambda$0(this.f2198IO);
        }
    });

    @aa1
    private final Lazy simultaneousTranslation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1i01I0Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.simultaneousTranslation_delegate$lambda$0(this.f2828IO);
        }
    });

    @aa1
    private final Lazy aiNote$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01IiO10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.aiNote_delegate$lambda$0(this.f2409IO);
        }
    });

    @aa1
    private final Lazy musicManagerItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.musicManagerItem_delegate$lambda$0(this.f4777IO);
        }
    });

    @aa1
    private final Lazy ebookManagerItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiO1X0X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.ebookManagerItem_delegate$lambda$0(this.f2260IO);
        }
    });

    @aa1
    private final Lazy sosManagerItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXXI0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.sosManagerItem_delegate$lambda$0(this.f8397IO);
        }
    });

    @aa1
    private final Lazy fallManagerItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10O1II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.fallManagerItem_delegate$lambda$0(this.f2630IO);
        }
    });

    @aa1
    private final Lazy memoryManagerItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0i0I001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.memoryManagerItem_delegate$lambda$0(this.f2579IO);
        }
    });

    @aa1
    private final Lazy smsQuickReplyItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOI1I0OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.smsQuickReplyItem_delegate$lambda$0(this.f8113IO);
        }
    });

    @aa1
    private final Lazy powerSaveModeItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1X0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.powerSaveModeItem_delegate$lambda$0(this.f1440IO);
        }
    });

    @aa1
    private final Lazy scheduleItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.scheduleItem_delegate$lambda$0(this.f3111IO);
        }
    });

    @aa1
    private final Lazy recordingItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1XiI0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.recordingItem_delegate$lambda$0(this.f3199IO);
        }
    });

    @aa1
    private final Lazy hardWareAlipay$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0I1XOIX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.hardWareAlipay_delegate$lambda$0(this.f2442IO);
        }
    });

    @aa1
    private final Lazy appStoreItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OiXI00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.appStoreItem_delegate$lambda$0(this.f7654IO);
        }
    });

    @aa1
    private final Lazy audioBookLearnItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIOOX1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.audioBookLearnItem_delegate$lambda$0(this.f3014IO);
        }
    });

    @aa1
    private final Lazy learnCardItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX0O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.learnCardItem_delegate$lambda$0(this.f1942IO);
        }
    });

    @aa1
    private final Lazy qiblaItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOO1Ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.qiblaItem_delegate$lambda$0(this.f4816IO);
        }
    });

    @aa1
    private final Lazy earphoneItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX0100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.earphoneItem_delegate$lambda$0(this.f8216IO);
        }
    });

    @aa1
    private final Lazy activityRecognitionItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.activityRecognitionItem_delegate$lambda$0(this.f3120IO);
        }
    });

    @aa1
    private final Lazy hrvSetItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X000X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.hrvSetItem_delegate$lambda$0(this.f3853IO);
        }
    });

    @aa1
    private final Lazy xmlyAudioItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iIiOX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceFragment.xmlyAudioItem_delegate$lambda$0(this.f7480IO);
        }
    });

    @aa1
    private final I0IIOi mBleHandleCallback = new I0IIOi();

    @aa1
    private final XO0O10 bleHandleCallback = new XO0O10();

    public static final class I0IIOi implements BleHandleCallback {
        public I0IIOi() {
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
        public void onIdentityCreate(boolean z, BleDeviceInfo bleDeviceInfo) {
            if (DeviceFragment.this.isScanQrcode()) {
                if (z) {
                    OOiOOO1OI.OXO1.O1O();
                    return;
                }
                DeviceFragment.this.setScanQrcode(false);
                ml1 mConfirmPopup = DeviceFragment.this.getMConfirmPopup();
                if (mConfirmPopup != null) {
                    mConfirmPopup.dismiss();
                }
                BleConnector.INSTANCE.closeConnection(true);
            }
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
        public void onReadDeviceLanguages2(BleDeviceLanguages2 deviceLanguages) {
            Intrinsics.X0O(deviceLanguages, "deviceLanguages");
            DeviceFragment deviceFragment = DeviceFragment.this;
            deviceFragment.checkLanguageUpdate(deviceLanguages, deviceFragment.getMServerLanguageList());
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
        public void onReadFirmwareVersion(String version) {
            Intrinsics.X0O(version, "version");
            if (DeviceFragment.this.isScanQrcode()) {
                ml1 mConfirmPopup = DeviceFragment.this.getMConfirmPopup();
                if (mConfirmPopup != null) {
                    mConfirmPopup.dismiss();
                }
                a01.OXO1.IiI10X().put(b01.f5624I1, false);
                q62 q62Var = q62.OXO1;
                if (q62Var.I1Ii()) {
                    if (!i72.OXO1.I0iOXO()) {
                        BleConnector.INSTANCE.connectClassic();
                    }
                } else if (q62Var.III()) {
                    BleConnector.INSTANCE.connectHID();
                }
                DeviceFragment.this.bindDone();
            }
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
            if (!DeviceFragment.this.isScanQrcode() || z) {
                return;
            }
            DeviceFragment.this.setScanQrcode(false);
            ml1 mConfirmPopup = DeviceFragment.this.getMConfirmPopup();
            if (mConfirmPopup != null) {
                mConfirmPopup.dismiss();
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
    }

    public static final class I0iXXO implements O0Oiii<FirmwareVersion> {
        public final /* synthetic */ boolean OXO1;
        public final /* synthetic */ DeviceFragment XIi00iiXO;

        public I0iXXO(boolean z, DeviceFragment deviceFragment) {
            this.OXO1 = z;
            this.XIi00iiXO = deviceFragment;
        }

        public static final boolean IiI10X(final FirmwareVersion firmwareVersion, final DeviceFragment deviceFragment, final boolean z) {
            X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I10XXX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceFragment.I0iXXO.XOO0ii0(firmwareVersion, deviceFragment, z, (BleConnector) obj);
                }
            }, 1, null);
            return true;
        }

        public static final boolean O00(boolean z, DeviceFragment deviceFragment) {
            if (!z) {
                return true;
            }
            deviceFragment.threePopup(false);
            return true;
        }

        public static final Unit XOO0ii0(FirmwareVersion firmwareVersion, DeviceFragment deviceFragment, boolean z, BleConnector it) {
            Intrinsics.X0O(it, "it");
            if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) >= (firmwareVersion.getFlag() == 1 ? 20 : 50)) {
                deviceFragment.toFirmwareUpgrade();
            } else {
                ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
                if (z) {
                    deviceFragment.threePopup(false);
                }
            }
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final FirmwareVersion firmwareVersion) {
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            if (firmwareVersion == null) {
                DeviceInfoChecker.O00(DeviceInfoChecker.OXO1, this.XIi00iiXO.getMActivity(), false, 2, null);
                if (this.OXO1) {
                    this.XIi00iiXO.threePopup(false);
                    return;
                }
                return;
            }
            if (firmwareVersion.getFlag() == 3) {
                if (this.OXO1) {
                    this.XIi00iiXO.threePopup(false);
                    return;
                }
                return;
            }
            DeviceFragment deviceFragment = this.XIi00iiXO;
            go0 go0Var = new go0(this.XIi00iiXO.getMActivity(), 0, 2, null);
            final boolean z = this.OXO1;
            final DeviceFragment deviceFragment2 = this.XIi00iiXO;
            go0Var.O1O(R.string.new_version_remind);
            go0Var.I0iXXO(false);
            if (firmwareVersion.getFlag() == 1) {
                go0.X11iII1O1(go0Var, null, null, 2, null);
            } else {
                go0Var.iX1O1(Integer.valueOf(R.string.upgrade_later), new Function0() { // from class: com.android.mltcode.paycertificationapi.X1XX
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(DeviceFragment.I0iXXO.O00(z, deviceFragment2));
                    }
                });
            }
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XIX1i1O
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeviceFragment.I0iXXO.IiI10X(firmwareVersion, deviceFragment2, z));
                }
            });
            deviceFragment.setMOTAMessagePopup(go0Var);
            go0 mOTAMessagePopup = this.XIi00iiXO.getMOTAMessagePopup();
            if (mOTAMessagePopup != null) {
                mOTAMessagePopup.IIX1OXO();
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            DeviceInfoChecker.O00(DeviceInfoChecker.OXO1, this.XIi00iiXO.getMActivity(), false, 2, null);
            if (this.OXO1) {
                this.XIi00iiXO.threePopup(false);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3159#2,2:149\n*E\n"})
    public static final class IiI10X extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BleConnector.INSTANCE.closeConnection(true);
        }
    }

    public static final class O00 implements O0Oiii<FirmwareVersion> {
        public O00() {
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(FirmwareVersion firmwareVersion) {
            if (firmwareVersion != null) {
                DeviceFragment.this.toFirmwareUpgrade();
            } else {
                DeviceInfoChecker.OXO1.XO0O10(DeviceFragment.this.getMActivity(), true);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            DeviceInfoChecker.OXO1.XO0O10(DeviceFragment.this.getMActivity(), true);
        }
    }

    public static final class OIX0iXi implements O0Oiii<ExtraPackageData[]> {
        public OIX0iXi() {
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData[] extraPackageDataArr) {
            DeviceFragment.this.setMServerLanguageList(extraPackageDataArr);
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.DEVICE_LANGUAGES2, BleKeyFlag.READ, null, false, false, 28, null);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            DeviceFragment.this.fourPopup();
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n99#2,7:3224\n106#2,3:3232\n79#2,7:3235\n109#2:3242\n1#3:3231\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n*L\n2832#1:3224,7\n2832#1:3232,3\n2832#1:3235,7\n2832#1:3242\n2832#1:3231\n*E\n"})
    public static final class OIi0 implements O0Oiii<ExtraPackageData[]> {
        public OIi0() {
        }

        public static final boolean O00(DeviceFragment deviceFragment) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putInt("mArg1", R.string.watch_language_set);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) LanguageListActivity.class);
            intent.putExtras(bundle);
            deviceFragment.startActivity(intent);
            deviceFragment.fourPopup();
            return true;
        }

        public static final boolean XO0O10(DeviceFragment deviceFragment) {
            deviceFragment.fourPopup();
            return true;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: iO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData[] extraPackageDataArr) {
            if (extraPackageDataArr != null) {
                if (!(extraPackageDataArr.length == 0)) {
                    go0 go0Var = new go0(DeviceFragment.this.getMActivity(), 0, 2, null);
                    final DeviceFragment deviceFragment = DeviceFragment.this;
                    go0Var.O1O(R.string.watch_language_set);
                    go0Var.m1865iX(Integer.valueOf(R.string.language_set_remind));
                    go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXXI0i
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(DeviceFragment.OIi0.XO0O10(deviceFragment));
                        }
                    });
                    go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.iXIiI10
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(DeviceFragment.OIi0.O00(deviceFragment));
                        }
                    });
                    View rootView = DeviceFragment.this.getRootView();
                    Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                    go0Var.I1XOi1(rootView);
                    return;
                }
            }
            DeviceFragment.this.fourPopup();
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            DeviceFragment.this.fourPopup();
        }
    }

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n78#2,3:3224\n81#2,5:3228\n1#3:3227\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n*L\n1579#1:3224,3\n1579#1:3228,5\n1579#1:3227\n*E\n"})
    public static final class XIi00iiXO implements O0Oiii<ExtraPackageData> {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData extraPackageData) {
            DeviceFragment deviceFragment = DeviceFragment.this;
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) FirmwareUpgradeGPSActivity.class));
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            DeviceFragment.this.toSyncAGPS();
        }
    }

    public static final class XO0O10 implements BleHandleCallback {
        public XO0O10() {
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
        public void onStreamProgress(boolean z, int i, int i2, int i3, BleKey bleKey) {
            c72 mAGpsPopup;
            c72 mAGpsPopup2;
            Intrinsics.X0O(bleKey, "bleKey");
            if (z && i2 > 0 && (mAGpsPopup2 = DeviceFragment.this.getMAGpsPopup()) != null) {
                mAGpsPopup2.m1592OX((i3 * 100) / i2);
            }
            if ((!z || i2 == i3) && (mAGpsPopup = DeviceFragment.this.getMAGpsPopup()) != null && mAGpsPopup.isShowing()) {
                mAGpsPopup.dismiss();
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

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n1#3:3229\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n*L\n260#1:3224,5\n260#1:3230,5\n260#1:3229\n*E\n"})
    public static final class XOO0ii0 implements InfoItem.OXO1 {
        public XOO0ii0() {
        }

        @Override // com.sma.smartv3.ui.device.item.InfoItem.OXO1
        public void onClick(View v) {
            Intrinsics.X0O(v, "v");
            if (v.getId() == R.id.btn_multi_device) {
                DeviceFragment deviceFragment = DeviceFragment.this;
                FragmentActivity activity = deviceFragment.getActivity();
                Intrinsics.XXI(activity);
                deviceFragment.startActivityForResult(new Intent(activity, (Class<?>) MultiDeviceManagerActivity.class), 7);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DeviceFragment$iO */
    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3128#2,2:149\n*E\n"})
    public static final class C18690iO extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            I01XX0.XIi00iiXO(I01XX0.XXO, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AGPSUpgradeItem aGPSUpgradeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AGPSUpgradeItem aGPSUpgradeItem = new AGPSUpgradeItem();
        aGPSUpgradeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iOXi0IOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.aGPSUpgradeItem_delegate$lambda$0$0$0(this.f8170IO, (View) obj);
            }
        });
        return aGPSUpgradeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aGPSUpgradeItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi00OX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.aGPSUpgradeItem_delegate$lambda$0$0$0$0(this.f5182IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aGPSUpgradeItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (q62.OXO1.m2891i1()) {
            DeviceInfoChecker.OXO1.OIi0(deviceFragment.new XIi00iiXO(), deviceFragment.getMActivity(), deviceFragment.getRootView(), "A");
        } else {
            deviceFragment.toSyncAGPS();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityRecognitionItem activityRecognitionItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ActivityRecognitionItem activityRecognitionItem = new ActivityRecognitionItem();
        activityRecognitionItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i1i00I0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.activityRecognitionItem_delegate$lambda$0$0$0(this.f7702IO, (View) obj);
            }
        });
        return activityRecognitionItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit activityRecognitionItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOX0IOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.activityRecognitionItem_delegate$lambda$0$0$0$0(this.f4845IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit activityRecognitionItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ActivityRecognitionSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AINoteItem aiNote_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AINoteItem aINoteItem = new AINoteItem();
        aINoteItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXXXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.aiNote_delegate$lambda$0$0$0(this.f8411IO, (View) obj);
            }
        });
        return aINoteItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aiNote_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X01IX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.aiNote_delegate$lambda$0$0$0$0(this.f3920IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aiNote_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) AiNoteActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlarmClockItem alarmClockItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AlarmClockItem alarmClockItem = new AlarmClockItem();
        alarmClockItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXO1O0Xi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.alarmClockItem_delegate$lambda$0$0$0(this.f8345IO, (View) obj);
            }
        });
        return alarmClockItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alarmClockItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) AlarmsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlipaySetItem alipaySetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AlipaySetItem alipaySetItem = new AlipaySetItem();
        alipaySetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iI1iXOX0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.alipaySetItem_delegate$lambda$0$0$0(this.f7831IO, (View) obj);
            }
        });
        return alipaySetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alipaySetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0I1i1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.alipaySetItem_delegate$lambda$0$0$0$0(this.f7349IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alipaySetItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) AlipaySetActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AntiLostItem antiLostItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AntiLostItem antiLostItem = new AntiLostItem();
        antiLostItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIO00O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.antiLostItem_delegate$lambda$0$0$0(this.f4529IO, (View) obj);
            }
        });
        return antiLostItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit antiLostItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mAntiLostSetPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.anti_lost);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IOXiOXi
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.antiLostItem_delegate$lambda$0$0$0$0$0(this.f1884IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mAntiLostSetPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mAntiLostSetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.ANTI_LOST, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean antiLostItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOO0Oi0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.antiLostItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit antiLostItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.ANTI_LOST, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getAntiLostItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppStoreItem appStoreItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AppStoreItem appStoreItem = new AppStoreItem();
        appStoreItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXOX1X1OX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.appStoreItem_delegate$lambda$0$0$0(this.f5071IO, (View) obj);
            }
        });
        return appStoreItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appStoreItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) AppStoreActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioBookLearnItem audioBookLearnItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AudioBookLearnItem audioBookLearnItem = new AudioBookLearnItem();
        audioBookLearnItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOXiii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.audioBookLearnItem_delegate$lambda$0$0$0(this.f3356IO, (View) obj);
            }
        });
        return audioBookLearnItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit audioBookLearnItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) AudioBookLearnActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BacklightItem backLightItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        BacklightItem backlightItem = new BacklightItem();
        backlightItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i11O1II
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.backLightItem_delegate$lambda$0$0$0(this.f7543IO, (View) obj);
            }
        });
        return backlightItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    public static final Unit backLightItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        q62 q62Var = q62.OXO1;
        int i = 3;
        if (q62Var.IOIIIiO0I()) {
            int iXX0 = q62Var.XX0();
            if (deviceFragment.mBacklightPopup2 == null) {
                C3132y7 c3132y7 = new C3132y7(deviceFragment.getMActivity());
                c3132y7.i010I(R.string.backlight_remind);
                c3132y7.iOO1ii1(false);
                c3132y7.m3330iX(3, iXX0);
                c3132y7.IXXOO(R.string.second_abrv);
                c3132y7.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1iXIiXII
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceFragment.backLightItem_delegate$lambda$0$0$0$0$0(this.f4395IO, ((Integer) obj).intValue()));
                    }
                });
                deviceFragment.mBacklightPopup2 = c3132y7;
            }
            C3132y7 c3132y8 = deviceFragment.mBacklightPopup2;
            if (c3132y8 != null) {
                int int$default = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, 0, null, 6, null);
                c3132y8.O1O(int$default != 0 ? int$default : 5);
                View rootView = deviceFragment.getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                c3132y8.I1XOi1(rootView);
            }
        } else {
            if (deviceFragment.mBacklightPopup == null) {
                dj4 dj4Var = new dj4(deviceFragment.getMActivity(), q62Var.iIi0(), 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.backlight_remind);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1i1O1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceFragment.backLightItem_delegate$lambda$0$0$0$2$0(this.f4382IO, ((Integer) obj).intValue()));
                    }
                });
                deviceFragment.mBacklightPopup = dj4Var;
            }
            dj4 dj4Var2 = deviceFragment.mBacklightPopup;
            if (dj4Var2 != null) {
                int int$default2 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, 0, null, 6, null) + q62Var.X0i1O();
                int iX1IX = q62Var.X1IX();
                if (iX1IX != 0) {
                    if (iX1IX != 3) {
                        if (iX1IX != 8) {
                            if (iX1IX != 51015) {
                                if (iX1IX != 101520) {
                                    if (iX1IX != 581015) {
                                        if (iX1IX != 5101520) {
                                            if (iX1IX != 510152030) {
                                                if (int$default2 <= 5) {
                                                    i = 0;
                                                } else {
                                                    i = int$default2 - 5;
                                                }
                                            } else if (int$default2 == 5) {
                                                i = 0;
                                            } else if (int$default2 == 10) {
                                                i = 1;
                                            } else if (int$default2 == 15) {
                                                i = 2;
                                            } else if (int$default2 != 20) {
                                                i = 4;
                                            }
                                        } else if (int$default2 == 5) {
                                            i = 0;
                                        } else if (int$default2 == 10) {
                                            i = 1;
                                        } else if (int$default2 == 15) {
                                            i = 2;
                                        }
                                    } else if (int$default2 == 5) {
                                        i = 0;
                                    } else if (int$default2 == 8) {
                                        i = 1;
                                    } else if (int$default2 == 10) {
                                        i = 2;
                                    }
                                } else if (int$default2 == 10) {
                                    i = 0;
                                } else if (int$default2 != 15) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            } else if (int$default2 == 0) {
                                i = 0;
                            } else if (int$default2 == 5) {
                                i = 1;
                            } else if (int$default2 == 10) {
                                i = 2;
                            }
                        } else if (int$default2 <= 8) {
                            i = 0;
                        } else {
                            i = int$default2 - 8;
                        }
                    } else if (int$default2 == 5) {
                        i = 1;
                    } else if (int$default2 == 8) {
                        i = 2;
                    } else if (int$default2 != 10) {
                        i = 0;
                    }
                } else if (int$default2 == 0) {
                    i = 0;
                } else {
                    i = int$default2 - 4;
                }
                dj4Var2.II1Xi0(i);
                View rootView2 = deviceFragment.getRootView();
                Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
                dj4Var2.I1XOi1(rootView2);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean backLightItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XXI100101
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.backLightItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit backLightItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getBackLightItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean backLightItem_delegate$lambda$0$0$0$2$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIXiIXiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.backLightItem_delegate$lambda$0$0$0$2$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    public static final Unit backLightItem_delegate$lambda$0$0$0$2$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        q62 q62Var = q62.OXO1;
        int iX1IX = q62Var.X1IX();
        int i2 = 0;
        if (iX1IX != 0) {
            if (iX1IX != 3) {
                if (iX1IX == 8) {
                    i2 = i + 8;
                } else if (iX1IX != 51015) {
                    if (iX1IX != 101520) {
                        if (iX1IX != 581015) {
                            if (iX1IX != 5101520) {
                                if (iX1IX != 510152030) {
                                    i2 = i + 5;
                                } else if (i == 0) {
                                    i2 = 5;
                                } else if (i == 1) {
                                    i2 = 10;
                                } else if (i == 2) {
                                    i2 = 15;
                                } else if (i != 3) {
                                    i2 = 30;
                                } else {
                                    i2 = 20;
                                }
                            } else if (i == 0) {
                                i2 = 5;
                            } else if (i == 1) {
                                i2 = 10;
                            } else if (i != 2) {
                                i2 = 20;
                            } else {
                                i2 = 15;
                            }
                        } else if (i == 0) {
                            i2 = 5;
                        } else if (i == 1) {
                            i2 = 8;
                        } else if (i != 2) {
                            i2 = 15;
                        } else {
                            i2 = 10;
                        }
                    } else if (i == 0) {
                        i2 = 10;
                    } else if (i != 1) {
                        i2 = 20;
                    } else {
                        i2 = 15;
                    }
                } else if (i != 0) {
                    if (i == 1) {
                        i2 = 5;
                    } else if (i != 2) {
                        i2 = 15;
                    } else {
                        i2 = 10;
                    }
                }
            } else if (i == 0) {
                i2 = 3;
            } else if (i == 1) {
                i2 = 5;
            } else if (i != 2) {
                i2 = 10;
            } else {
                i2 = 8;
            }
        } else if (i != 0) {
            i2 = i + 4;
        }
        BaseBleConnector.sendInt8$default(it, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, i2 - q62Var.X0i1O(), false, false, 24, null);
        deviceFragment.getBackLightItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDone() {
        i1O0OXO1O.OXO1.OXO1("DeviceFragment bindDone");
        q62 q62Var = q62.OXO1;
        if (q62Var.O0i0() || q62Var.IiO0()) {
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
        }
        new Timer().schedule(new C18690iO(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloodOxyGenItem bloodOxyGenItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        BloodOxyGenItem bloodOxyGenItem = new BloodOxyGenItem();
        bloodOxyGenItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OO1X0II
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.bloodOxyGenItem_delegate$lambda$0$0$0(this.f3189IO, (View) obj);
            }
        });
        return bloodOxyGenItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bloodOxyGenItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) BloodOxyGenSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAppAvailable$lambda$0(final DeviceFragment deviceFragment, final String str) {
        Intrinsics.X0O(str, "str");
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X111XiIO
            @Override // java.lang.Runnable
            public final void run() {
                DeviceFragment.checkAppAvailable$lambda$0$0(this.f4219IO, str);
            }
        }, 2000L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAppAvailable$lambda$0$0(DeviceFragment deviceFragment, final String str) {
        go0 go0Var = new go0(deviceFragment.getMActivity(), 0, 2, null);
        go0Var.O1O(R.string.tip);
        go0Var.iOO1ii1(str);
        go0Var.I0iXXO(false);
        go0.X11iII1O1(go0Var, null, null, 2, null);
        go0Var.X1IX(R.string.copy_content, new Function0() { // from class: com.android.mltcode.paycertificationapi.X1iX1Ii
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.checkAppAvailable$lambda$0$0$0$0(str));
            }
        });
        View rootView = deviceFragment.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAppAvailable$lambda$0$0$0$0(String str) {
        ClipboardUtils.copyText(str);
        ToastUtils.showLong(R.string.copied);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLanguageUpdate(BleDeviceLanguages2 bleDeviceLanguages2, ExtraPackageData[] extraPackageDataArr) {
        boolean z;
        if (bleDeviceLanguages2.getMList().isEmpty() || extraPackageDataArr == null) {
            return;
        }
        int length = extraPackageDataArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (BleDeviceLanguages2.isUpgrade$default(bleDeviceLanguages2, extraPackageDataArr[i].getVersion(), 0, 2, null)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.mServerLanguageList = null;
        i1O0OXO1O.OXO1.OXO1("checkLanguageUpdate isShow = " + z);
        if (!z) {
            fourPopup();
            return;
        }
        go0 go0Var = new go0(getMActivity(), 0, 2, null);
        go0Var.O1O(R.string.language_update2__language_update);
        go0Var.m1865iX(Integer.valueOf(R.string.language_update2__tip_update));
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIIiO0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.checkLanguageUpdate$lambda$1$0(this.f4515IO));
            }
        });
        go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOI1X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.checkLanguageUpdate$lambda$1$1(this.f8061IO));
            }
        });
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkLanguageUpdate$lambda$1$0(DeviceFragment deviceFragment) {
        deviceFragment.fourPopup();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkLanguageUpdate$lambda$1$1(DeviceFragment deviceFragment) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) LanguageUpdateActivity2.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        deviceFragment.fourPopup();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkNotificationPermission$lambda$0$0$0(go0 go0Var) {
        MyNotificationListenerService.O001I.I0IIOi(go0Var.XO0O10());
        return true;
    }

    private final void checkVersionByClickFirmware() {
        DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, new O00(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassicPairItem classicPairItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ClassicPairItem classicPairItem = new ClassicPairItem();
        classicPairItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXIiOOO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.classicPairItem_delegate$lambda$0$0$0(this.f3476IO, (View) obj);
            }
        });
        return classicPairItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit classicPairItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ClassicPairActivity.class));
        return Unit.OXO1;
    }

    private final void conntectDevice(String str, String str2) {
        i1O0OXO1O.OXO1.OXO1("conntectDevice -> " + str + " , " + str2);
        q62 q62Var = q62.OXO1;
        if (q62Var.XXOXI0(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(getActivity(), (Class<?>) AutoBindActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        ml1 ml1Var = this.mConfirmPopup;
        if (ml1Var == null || !ml1Var.isShowing()) {
            BleConnector.INSTANCE.setAddress(str2).connect(true);
            final ml1 ml1Var2 = new ml1(getMActivity());
            ml1Var2.X01IiOiIi(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOIXXi
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DeviceFragment.conntectDevice$lambda$0$0(this.f8088IO, ml1Var2);
                }
            });
            if (!CollectionsKt___CollectionsKt.i01OOiI(q62Var.i0iIXiI(), str) || q62.OiO0IOX(q62Var, null, 1, null) || q62Var.X0100I() || q62Var.I0i1OXiI()) {
                ml1Var2.m2644OX().setImageResource(R.drawable.pair_loading);
                ml1Var2.m2644OX().setImageTintList(gk4.O00(ml1Var2.XO0O10(), R.color.text_color));
                ImageView imageViewM2644OX = ml1Var2.m2644OX();
                RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setDuration(1800L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                imageViewM2644OX.startAnimation(rotateAnimation);
            } else {
                ml1Var2.m2644OX().setImageResource(q62Var.XiOIii1(str));
            }
            this.mConfirmPopup = ml1Var2;
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            ml1Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conntectDevice$lambda$0$0(DeviceFragment deviceFragment, ml1 ml1Var) {
        deviceFragment.isScanQrcode = false;
        ml1Var.dismiss();
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.IDENTITY, BleKeyFlag.UPDATE, 16, false, false, 24, null);
        new Timer().schedule(new IiI10X(), 200L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateFormatItem dateFormatItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        DateFormatItem dateFormatItem = new DateFormatItem();
        dateFormatItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0iX1OXi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.dateFormatItem_delegate$lambda$0$0$0(this.f1276IO, (View) obj);
            }
        });
        return dateFormatItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dateFormatItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mDateFormatPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.date_format, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.date_format);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIXi11O
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.dateFormatItem_delegate$lambda$0$0$0$0$0(this.f4600IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mDateFormatPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mDateFormatPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.DATE_FORMAT, i72.OXO1.XiOIO().getType(), null, 4, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dateFormatItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oii1IiO00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.dateFormatItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dateFormatItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.DATE_FORMAT, BleKeyFlag.UPDATE, i, false, false, 24, null);
        i72.OXO1.IXi01O(DateTimeFormat.Companion.OXO1(i));
        I01XX0.XIi00iiXO(I01XX0.IX0IXOi, null, 2, null);
        deviceFragment.getDateFormatItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialItem dialItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        DialItem dialItem = new DialItem();
        dialItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OiiXIOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.dialItem_delegate$lambda$0$0$0(this.f3831IO, (View) obj);
            }
        });
        return dialItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dialItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I00X0X1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.dialItem_delegate$lambda$0$0$0$0(this.f1023IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dialItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        i72.OXO1.OOIX(deviceFragment.getMActivity());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TranslationDialogueItem dialogueTranslation_delegate$lambda$0(final DeviceFragment deviceFragment) {
        TranslationDialogueItem translationDialogueItem = new TranslationDialogueItem();
        translationDialogueItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0IX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.dialogueTranslation_delegate$lambda$0$0$0(this.f1128IO, (View) obj);
            }
        });
        return translationDialogueItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dialogueTranslation_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SparkChainMultiDeviceActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DoubleClickScreenItem doubleClickScreenItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        DoubleClickScreenItem doubleClickScreenItem = new DoubleClickScreenItem();
        doubleClickScreenItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1IiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.doubleClickScreenItem_delegate$lambda$0$0$0(this.f8282IO, (View) obj);
            }
        });
        return doubleClickScreenItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doubleClickScreenItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) DoubleClickSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrinkWaterItem drinkWaterItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        DrinkWaterItem drinkWaterItem = new DrinkWaterItem();
        drinkWaterItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i0X001O1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.drinkWaterItem_delegate$lambda$0$0$0(this.f7415IO, (View) obj);
            }
        });
        return drinkWaterItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drinkWaterItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) DrinkWaterSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarphoneItem earphoneItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        EarphoneItem earphoneItem = new EarphoneItem();
        earphoneItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1iO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.earphoneItem_delegate$lambda$0$0$0(this.f4391IO, (View) obj);
            }
        });
        return earphoneItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit earphoneItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.m1079iO(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0iIIXO00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.earphoneItem_delegate$lambda$0$0$0$0(this.f2587IO, (BleConnector) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit earphoneItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SoundEffectsSampleActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EBookManagerItem ebookManagerItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        EBookManagerItem eBookManagerItem = new EBookManagerItem();
        eBookManagerItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iiiii10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.ebookManagerItem_delegate$lambda$0$0$0(this.f8698IO, (View) obj);
            }
        });
        return eBookManagerItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ebookManagerItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XII1XX1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.ebookManagerItem_delegate$lambda$0$0$0$0(this.f4506IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ebookManagerItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) EBookManagerActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcgMonitoringItem ecgMonitoringItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        EcgMonitoringItem ecgMonitoringItem = new EcgMonitoringItem();
        ecgMonitoringItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OX1O0OX1X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.ecgMonitoringItem_delegate$lambda$0$0$0(this.f3436IO, (View) obj);
            }
        });
        return ecgMonitoringItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecgMonitoringItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) EcgMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FallManagerItem fallManagerItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        FallManagerItem fallManagerItem = new FallManagerItem();
        fallManagerItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i01ii1OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.fallManagerItem_delegate$lambda$0$0$0(this.f7319IO, (View) obj);
            }
        });
        return fallManagerItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fallManagerItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mAntiLostSetPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.fall_tips);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XX1O
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.fallManagerItem_delegate$lambda$0$0$0$0$0(this.f1233IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mAntiLostSetPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mAntiLostSetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.FALL_SET, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fallManagerItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0iX1IIiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.fallManagerItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fallManagerItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.FALL_SET, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getFallManagerItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FindWatchItem findWatchItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        FindWatchItem findWatchItem = new FindWatchItem();
        findWatchItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIX0OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.findWatchItem_delegate$lambda$0$0$0(this.f4577IO, (View) obj);
            }
        });
        return findWatchItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findWatchItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiOIOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.findWatchItem_delegate$lambda$0$0$0$0(this.f5299IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findWatchItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (q62.OXO1.XI1OX0IO()) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) FindWatchActivity.class));
        } else {
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FIND_WATCH, BleKeyFlag.UPDATE, 1, false, false, 24, null);
            ToastUtils.showLong(deviceFragment.getString(R.string.find_watch_on), new Object[0]);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirmwareItem firmwareItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        FirmwareItem firmwareItem = new FirmwareItem();
        firmwareItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi0IOIii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.firmwareItem_delegate$lambda$0$0$0(this.f5196IO, (View) obj);
            }
        });
        return firmwareItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firmwareItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOIXiI0Oi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.firmwareItem_delegate$lambda$0$0$0$0(this.f1809IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firmwareItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) < 50) {
            ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
        } else if (System.currentTimeMillis() - deviceFragment.lastClickTime >= 3000) {
            deviceFragment.checkVersionByClickFirmware();
            deviceFragment.lastClickTime = System.currentTimeMillis();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fourPopup() {
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ii100X00X
            @Override // java.lang.Runnable
            public final void run() {
                I01XX0.XIi00iiXO(I01XX0.IXI, null, 2, null);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameSettingsItem gameSettingsItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        GameSettingsItem gameSettingsItem = new GameSettingsItem();
        gameSettingsItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i11X00O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gameSettingsItem_delegate$lambda$0$0$0(this.f7549IO, (View) obj);
            }
        });
        return gameSettingsItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gameSettingsItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) GameSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameStoreItem gameStoreItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        GameStoreItem gameStoreItem = new GameStoreItem();
        gameStoreItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1OiO0I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gameStoreItem_delegate$lambda$0$0$0(this.f2769IO, (View) obj);
            }
        });
        return gameStoreItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gameStoreItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        i0O111 i0o111 = i0O111.OXO1;
        Application application = deviceFragment.getMActivity().getApplication();
        Intrinsics.O10IXXX0X(application, "getApplication(...)");
        i0o111.XX0(application);
        i0o111.II1Xi0(deviceFragment.getMActivity());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameTimeSetItem gameTimeSetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        GameTimeSetItem gameTimeSetItem = new GameTimeSetItem();
        gameTimeSetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iiXXIO0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gameTimeSetItem_delegate$lambda$0$0$0(this.f8651IO, (View) obj);
            }
        });
        return gameTimeSetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gameTimeSetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        String string;
        Intrinsics.X0O(it, "it");
        int mMinute = 7;
        if (deviceFragment.mGameTimeSetPopup == null) {
            Activity mActivity = deviceFragment.getMActivity();
            ArrayList arrayList = new ArrayList(8);
            int i = 0;
            while (i < 8) {
                if (i != 0) {
                    string = i != 7 ? deviceFragment.getMActivity().getString(R.string.d_minutes, Integer.valueOf(i * 10)) : deviceFragment.getMActivity().getString(R.string.d_minutes, 120);
                } else {
                    string = deviceFragment.getMActivity().getString(R.string.off_text);
                }
                Intrinsics.XXI(string);
                arrayList.add(string);
                i++;
            }
            dj4 dj4Var = new dj4(mActivity, arrayList, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.game_time_set);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0IOiXX1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.gameTimeSetItem_delegate$lambda$0$0$0$1$0(this.f2457IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mGameTimeSetPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mGameTimeSetPopup;
        if (dj4Var2 != null) {
            BleGameTimeReminder bleGameTimeReminder = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_TIME_REMINDER, BleGameTimeReminder.class, null, null, 12, null);
            if (bleGameTimeReminder.getMEnabled() == 0) {
                mMinute = 0;
            } else if (bleGameTimeReminder.getMMinute() != 120) {
                mMinute = bleGameTimeReminder.getMMinute() / 10;
            }
            dj4Var2.II1Xi0(mMinute);
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gameTimeSetItem_delegate$lambda$0$0$0$1$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0iO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gameTimeSetItem_delegate$lambda$0$0$0$1$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gameTimeSetItem_delegate$lambda$0$0$0$1$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleCache bleCache = BleCache.INSTANCE;
        BleKey bleKey = BleKey.GAME_TIME_REMINDER;
        BleGameTimeReminder bleGameTimeReminder = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(bleCache, bleKey, BleGameTimeReminder.class, null, null, 12, null);
        if (i == 0) {
            bleGameTimeReminder.setMEnabled(0);
        } else if (i != 7) {
            bleGameTimeReminder.setMEnabled(1);
            bleGameTimeReminder.setMMinute(i * 10);
        } else {
            bleGameTimeReminder.setMEnabled(1);
            bleGameTimeReminder.setMMinute(120);
        }
        BaseBleConnector.sendObject$default(it, bleKey, BleKeyFlag.UPDATE, bleGameTimeReminder, false, false, 24, null);
        deviceFragment.getGameTimeSetItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GestureWake2Item gestureWake2Item_delegate$lambda$0(final DeviceFragment deviceFragment) {
        GestureWake2Item gestureWake2Item = new GestureWake2Item();
        gestureWake2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOOIXXiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gestureWake2Item_delegate$lambda$0$0$0(this.f3260IO, (View) obj);
            }
        });
        return gestureWake2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gestureWake2Item_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) GestureWake2SettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GestureWakeItem gestureWakeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        GestureWakeItem gestureWakeItem = new GestureWakeItem();
        gestureWakeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X010X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.gestureWakeItem_delegate$lambda$0$0$0(this.f3907IO, (View) obj);
            }
        });
        return gestureWakeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gestureWakeItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) GestureWakeSettingsActivity.class));
        return Unit.OXO1;
    }

    @Deprecated(message = "已废弃")
    public static /* synthetic */ void getShockSettingsItem$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthCareItem girlCareItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        HealthCareItem healthCareItem = new HealthCareItem();
        healthCareItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOI0O1OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.girlCareItem_delegate$lambda$0$0$0(this.f3207IO, (View) obj);
            }
        });
        return healthCareItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit girlCareItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) HealthCareSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HardWareAlipayItem hardWareAlipay_delegate$lambda$0(final DeviceFragment deviceFragment) {
        HardWareAlipayItem hardWareAlipayItem = new HardWareAlipayItem();
        hardWareAlipayItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IOOI0ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.hardWareAlipay_delegate$lambda$0$0$0(this.f1834IO, (View) obj);
            }
        });
        return hardWareAlipayItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hardWareAlipay_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) HardWareAlipayActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrMonitoringItem hrMonitoringItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        HrMonitoringItem hrMonitoringItem = new HrMonitoringItem();
        hrMonitoringItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1O11
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.hrMonitoringItem_delegate$lambda$0$0$0(this.f4288IO, (View) obj);
            }
        });
        return hrMonitoringItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrMonitoringItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) HrMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrvSetItem hrvSetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        HrvSetItem hrvSetItem = new HrvSetItem();
        hrvSetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.hrvSetItem_delegate$lambda$0$0$0(this.f4813IO, (View) obj);
            }
        });
        return hrvSetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrvSetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1X1ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.hrvSetItem_delegate$lambda$0$0$0$0(this.f7665IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrvSetItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) HrvMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HydrationReminderItem hydrationReminderItem_delegate$lambda$0() {
        HydrationReminderItem hydrationReminderItem = new HydrationReminderItem();
        hydrationReminderItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXiOIOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.hydrationReminderItem_delegate$lambda$0$0$0((View) obj);
            }
        });
        return hydrationReminderItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hydrationReminderItem_delegate$lambda$0$0$0(View it) {
        Intrinsics.X0O(it, "it");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncomingCallItem incomingCallItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        IncomingCallItem incomingCallItem = new IncomingCallItem();
        incomingCallItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I010OOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.incomingCallItem_delegate$lambda$0$0$0(this.f1036IO, (View) obj);
            }
        });
        return incomingCallItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incomingCallItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.checkNotificationPermission()) {
            if (deviceFragment.mIncomingCallPopup == null) {
                final dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.incoming_call);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIi1iXI
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceFragment.incomingCallItem_delegate$lambda$0$0$0$0$0(this.f3084IO, dj4Var, ((Integer) obj).intValue()));
                    }
                });
                deviceFragment.mIncomingCallPopup = dj4Var;
            }
            dj4 dj4Var2 = deviceFragment.mIncomingCallPopup;
            if (dj4Var2 != null) {
                int i = 0;
                if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO, false)) {
                    String[] strArrOXO1 = gb1.OXO1();
                    if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                        i = 1;
                    }
                }
                dj4Var2.II1Xi0(i);
                View rootView = deviceFragment.getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                dj4Var2.I1XOi1(rootView);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean incomingCallItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final dj4 dj4Var, int i) {
        if (i == 1) {
            PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE", PermissionConstants.CONTACTS);
            Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIX1IiOii
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceFragment.incomingCallItem_delegate$lambda$0$0$0$0$0$0(dj4Var, deviceFragment, (PermissionStatus) obj);
                }
            }, 3, null);
        } else {
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, false);
            BleInitializer.f51208IO.IOI();
        }
        deviceFragment.getIncomingCallItem().initView();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incomingCallItem_delegate$lambda$0$0$0$0$0$0(dj4 dj4Var, DeviceFragment deviceFragment, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, true);
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.IOI();
            bleInitializer.IIX(dj4Var.XO0O10());
            deviceFragment.getIncomingCallItem().initView();
        } else {
            deviceFragment.noPermissionRemind();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncomingCallRingItem incomingCallRingItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        IncomingCallRingItem incomingCallRingItem = new IncomingCallRingItem();
        incomingCallRingItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IiXXii1I1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.incomingCallRingItem_delegate$lambda$0$0$0(this.f2304IO, (View) obj);
            }
        });
        return incomingCallRingItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incomingCallRingItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mIncomingCallRingtPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.incoming_call_ring);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XiOI01iXi
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.incomingCallRingItem_delegate$lambda$0$0$0$0$0(this.f5296IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mIncomingCallRingtPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mIncomingCallRingtPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.INCOMING_CALL_RING, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean incomingCallRingItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1iOIIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.incomingCallRingItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incomingCallRingItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.INCOMING_CALL_RING, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getIncomingCallRingItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncomingCallRingVibrationItem incomingCallRingVibrationItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        IncomingCallRingVibrationItem incomingCallRingVibrationItem = new IncomingCallRingVibrationItem();
        incomingCallRingVibrationItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iiOOiIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.incomingCallRingVibrationItem_delegate$lambda$0$0$0(this.f8613IO, (View) obj);
            }
        });
        return incomingCallRingVibrationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incomingCallRingVibrationItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (i72.OXO1.O0i()) {
            deviceFragment.singleChoiceIncomingCallRing();
        } else {
            deviceFragment.multiChoiceIncomingCallRing();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InfoItem infoItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        InfoItem infoItem = new InfoItem();
        infoItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XX00I0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.infoItem_delegate$lambda$0$0$0(this.f4925IO, (View) obj);
            }
        });
        infoItem.setOnClickListener(deviceFragment.new XOO0ii0());
        return infoItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit infoItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (!BleConnector.INSTANCE.isBound()) {
            if (i72.OXO1.Oiii()) {
                deviceFragment.showPairTypePop();
            } else {
                toAddDevice$default(deviceFragment, null, null, 3, null);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LanguageItem languageItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        LanguageItem languageItem = new LanguageItem();
        languageItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X000XIX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.languageItem_delegate$lambda$0$0$0(this.f3854IO, (View) obj);
            }
        });
        return languageItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit languageItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I10000X1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.languageItem_delegate$lambda$0$0$0$0(this.f1286IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit languageItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", R.string.watch_language_set);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) LanguageListActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LanguageUpdateItem languageUpdateItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        LanguageUpdateItem languageUpdateItem = new LanguageUpdateItem();
        languageUpdateItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iOiXOXXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.languageUpdateItem_delegate$lambda$0$0$0(this.f8201IO, (View) obj);
            }
        });
        return languageUpdateItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit languageUpdateItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OiXiiX0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.languageUpdateItem_delegate$lambda$0$0$0$0(this.f3810IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit languageUpdateItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) LanguageUpdateActivity2.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LearnCardItem learnCardItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        LearnCardItem learnCardItem = new LearnCardItem();
        learnCardItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XI1iI1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.learnCardItem_delegate$lambda$0$0$0(this.f4489IO, (View) obj);
            }
        });
        return learnCardItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit learnCardItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) AudioBookLearnActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomLogoItem logoFileItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        CustomLogoItem customLogoItem = new CustomLogoItem();
        customLogoItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O10ii0I1X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.logoFileItem_delegate$lambda$0$0$0(this.f2648IO, (View) obj);
            }
        });
        return customLogoItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logoFileItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIi0O100
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.logoFileItem_delegate$lambda$0$0$0$0(this.f4606IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logoFileItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) CustomLogoActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MacQrcodeItem macQrcodeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MacQrcodeItem macQrcodeItem = new MacQrcodeItem();
        macQrcodeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1iO1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.macQrcodeItem_delegate$lambda$0$0$0(this.f2845IO, (View) obj);
            }
        });
        return macQrcodeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit macQrcodeItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mMacQrcodePopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.mac_qrcodes, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.mac_qrcode);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.I11100
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.macQrcodeItem_delegate$lambda$0$0$0$0$0(this.f1341IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mMacQrcodePopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mMacQrcodePopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.MAC_QRCODE, 1, null, 4, null) - 1);
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean macQrcodeItem_delegate$lambda$0$0$0$0$0(DeviceFragment deviceFragment, int i) {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.MAC_QRCODE, BleKeyFlag.UPDATE, i + 1, false, false, 24, null);
        deviceFragment.getMacQrcodeItem().initView();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureUnitItem measureUnitItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MeasureUnitItem measureUnitItem = new MeasureUnitItem();
        measureUnitItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0Xi0XIOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.measureUnitItem_delegate$lambda$0$0$0(this.f1243IO, (View) obj);
            }
        });
        return measureUnitItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measureUnitItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) MeasureUnitSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MedicationAlarmItem medicationAlarmItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MedicationAlarmItem medicationAlarmItem = new MedicationAlarmItem();
        medicationAlarmItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O010Xi1I0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.medicationAlarmItem_delegate$lambda$0$0$0(this.f2397IO, (View) obj);
            }
        });
        return medicationAlarmItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit medicationAlarmItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) MedicationAlarmsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeetingReminderItem meetingReminderItem_delegate$lambda$0() {
        MeetingReminderItem meetingReminderItem = new MeetingReminderItem();
        meetingReminderItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IO0iXi10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.meetingReminderItem_delegate$lambda$0$0$0((View) obj);
            }
        });
        return meetingReminderItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit meetingReminderItem_delegate$lambda$0$0$0(View it) {
        Intrinsics.X0O(it, "it");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemoryManagerItem memoryManagerItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MemoryManagerItem memoryManagerItem = new MemoryManagerItem();
        memoryManagerItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IiiO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.memoryManagerItem_delegate$lambda$0$0$0(this.f2325IO, (View) obj);
            }
        });
        return memoryManagerItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit memoryManagerItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) MemoryManagerActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagePushItem messagePushItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MessagePushItem messagePushItem = new MessagePushItem();
        messagePushItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OiXII
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.messagePushItem_delegate$lambda$0$0$0(this.f3779IO, (View) obj);
            }
        });
        return messagePushItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit messagePushItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.checkNotificationPermission()) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) NotificationSettingsActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean multiChoiceIncomingCallRing$lambda$0$0(final DeviceFragment deviceFragment, final Set picked) {
        Intrinsics.X0O(picked, "picked");
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1IX00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.multiChoiceIncomingCallRing$lambda$0$0$0(picked, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit multiChoiceIncomingCallRing$lambda$0$0$0(Set set, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendObject$default(it, BleKey.RING_VIBRATION_SET, BleKeyFlag.UPDATE, new BleRingVibrationSettings(OiOX0i.m1037iO(set.contains(0)), OiOX0i.m1037iO(set.contains(1))), false, false, 24, null);
        deviceFragment.getIncomingCallRingVibrationItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicControlItem musicControlItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MusicControlItem musicControlItem = new MusicControlItem();
        musicControlItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XiiXi0XI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.musicControlItem_delegate$lambda$0$0$0(this.f5378IO, (View) obj);
            }
        });
        return musicControlItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit musicControlItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.getMHidState() == 0) {
            deviceFragment.showHIDPopup();
        }
        BaseBleConnector.sendData$default(bleConnector, BleKey.HID, BleKeyFlag.READ, null, false, false, 28, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicManagerItem musicManagerItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MusicManagerItem musicManagerItem = new MusicManagerItem();
        musicManagerItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIIXIOi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.musicManagerItem_delegate$lambda$0$0$0(this.f1591IO, (View) obj);
            }
        });
        return musicManagerItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit musicManagerItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oi11iiIX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.musicManagerItem_delegate$lambda$0$0$0$0(this.f3661IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit musicManagerItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) MusicManagerV2Activity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCardCode2Item myCardCode2Item_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MyCardCode2Item myCardCode2Item = new MyCardCode2Item();
        myCardCode2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0iX1II
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.myCardCode2Item_delegate$lambda$0$0$0(this.f1273IO, (View) obj);
            }
        });
        return myCardCode2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit myCardCode2Item_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) MyCardCodeActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCardCodeItem myCardCodeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        MyCardCodeItem myCardCodeItem = new MyCardCodeItem();
        myCardCodeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIIiXO0I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.myCardCodeItem_delegate$lambda$0$0$0(this.f2980IO, (View) obj);
            }
        });
        return myCardCodeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit myCardCodeItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) QrcodeTypeInfosActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationItem navigationItem_delegate$lambda$0() {
        NavigationItem navigationItem = new NavigationItem();
        navigationItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.ii1X00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.navigationItem_delegate$lambda$0$0$0((View) obj);
            }
        });
        return navigationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigationItem_delegate$lambda$0$0$0(View it) {
        Intrinsics.X0O(it, "it");
        I01XX0.XIi00iiXO(I01XX0.Xii11I, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NFCGuideItem nfcGuideItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        NFCGuideItem nFCGuideItem = new NFCGuideItem();
        nFCGuideItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IO0iI0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.nfcGuideItem_delegate$lambda$0$0$0(this.f1738IO, (View) obj);
            }
        });
        return nFCGuideItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nfcGuideItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) GuideNfcActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoDisturb2Item noDisturb2Item_delegate$lambda$0(final DeviceFragment deviceFragment) {
        NoDisturb2Item noDisturb2Item = new NoDisturb2Item();
        noDisturb2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXIXIO0I1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.noDisturb2Item_delegate$lambda$0$0$0(this.f3472IO, (View) obj);
            }
        });
        return noDisturb2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit noDisturb2Item_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) NoDisturbSettings2Activity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoDisturbItem noDisturbItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        NoDisturbItem noDisturbItem = new NoDisturbItem();
        noDisturbItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1iOO10X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.noDisturbItem_delegate$lambda$0$0$0(this.f2849IO, (View) obj);
            }
        });
        return noDisturbItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit noDisturbItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (q62.OXO1.m2894ii()) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) NoDisturbSettingsActivity.class));
        } else {
            if (deviceFragment.mNoDisturbPopup == null) {
                dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.do_not_disturb);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi1O00
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceFragment.noDisturbItem_delegate$lambda$0$0$0$0$0(this.f7951IO, ((Integer) obj).intValue()));
                    }
                });
                deviceFragment.mNoDisturbPopup = dj4Var;
            }
            dj4 dj4Var2 = deviceFragment.mNoDisturbPopup;
            if (dj4Var2 != null) {
                dj4Var2.II1Xi0(((BleNoDisturbSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.NO_DISTURB_RANGE, BleNoDisturbSettings.class, null, null, 12, null)).getMBleTimeRange1().getMEnabled());
                View rootView = deviceFragment.getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                dj4Var2.I1XOi1(rootView);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noDisturbItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOOiiOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.noDisturbItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit noDisturbItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleCache bleCache = BleCache.INSTANCE;
        BleKey bleKey = BleKey.NO_DISTURB_RANGE;
        BleNoDisturbSettings bleNoDisturbSettings = (BleNoDisturbSettings) BaseBleCache.getObjectNotNull$default(bleCache, bleKey, BleNoDisturbSettings.class, null, null, 12, null);
        bleNoDisturbSettings.getMBleTimeRange1().setMEnabled(i);
        BaseBleConnector.sendObject$default(it, bleKey, BleKeyFlag.UPDATE, bleNoDisturbSettings, false, false, 24, null);
        deviceFragment.getNoDisturbItem().initView();
        return Unit.OXO1;
    }

    private final void noPermissionRemind() {
        if (this.mPermissionPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(R.string.permission_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1iIXiO0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeviceFragment.noPermissionRemind$lambda$0$0());
                }
            });
            this.mPermissionPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noPermissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationLightScreenItem notificationLightScreenItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        NotificationLightScreenItem notificationLightScreenItem = new NotificationLightScreenItem();
        notificationLightScreenItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1X1iiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.notificationLightScreenItem_delegate$lambda$0$0$0(this.f8041IO, (View) obj);
            }
        });
        return notificationLightScreenItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit notificationLightScreenItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mNotificationLightScreenItem == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.notification_light_screen);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXXIII1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.notificationLightScreenItem_delegate$lambda$0$0$0$0$0(this.f5116IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mNotificationLightScreenItem = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mNotificationLightScreenItem;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.NOTIFICATION_LIGHT_SCREEN_SET, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean notificationLightScreenItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OiI011
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.notificationLightScreenItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit notificationLightScreenItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.NOTIFICATION_LIGHT_SCREEN_SET, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getNotificationLightScreenItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NucleicAcidCodeItem nucleicAcidCodeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        NucleicAcidCodeItem nucleicAcidCodeItem = new NucleicAcidCodeItem();
        nucleicAcidCodeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii1XIi0I1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.nucleicAcidCodeItem_delegate$lambda$0$0$0(this.f2217IO, (View) obj);
            }
        });
        return nucleicAcidCodeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nucleicAcidCodeItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        String string = deviceFragment.getString(R.string.nucleic_acid_code);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        QrcodeTypeInfo qrcodeTypeInfo = new QrcodeTypeInfo(0, 0, 0, string, 0L, 0, null, 112, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", qrcodeTypeInfo);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) QrcodeSyncActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfflineMapsItem offlineMapsItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        OfflineMapsItem offlineMapsItem = new OfflineMapsItem();
        offlineMapsItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXiX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.offlineMapsItem_delegate$lambda$0$0$0(this.f8452IO, (View) obj);
            }
        });
        return offlineMapsItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit offlineMapsItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOiIX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.offlineMapsItem_delegate$lambda$0$0$0$0(this.f4903IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit offlineMapsItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) OfflineMapsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResult$lambda$0(DeviceFragment deviceFragment) {
        deviceFragment.updatePairState(false);
        deviceFragment.twoPopup(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCodePairChange$lambda$0$0(DeviceFragment deviceFragment) {
        deviceFragment.twoPopup(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCodePairChange$lambda$1(DeviceFragment deviceFragment) {
        go0 go0Var;
        try {
            if (deviceFragment.getRootView() == null || (go0Var = deviceFragment.mBindDeviceRemindPopup) == null) {
                return;
            }
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
        } catch (Exception e) {
            deviceFragment.fourPopup();
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PowerSaveModeItem powerSaveModeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        PowerSaveModeItem powerSaveModeItem = new PowerSaveModeItem();
        powerSaveModeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XO1i0OIIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.powerSaveModeItem_delegate$lambda$0$0$0(this.f4739IO, (View) obj);
            }
        });
        return powerSaveModeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit powerSaveModeItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mPowerSaveModeSetPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.power_save_mode);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi111i1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.powerSaveModeItem_delegate$lambda$0$0$0$0$0(this.f5220IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mPowerSaveModeSetPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mPowerSaveModeSetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.POWER_SAVE_MODE, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean powerSaveModeItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.OXO1(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIiII1iX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.powerSaveModeItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit powerSaveModeItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.POWER_SAVE_MODE, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getPowerSaveModeItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PressureItem pressureItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        PressureItem pressureItem = new PressureItem();
        pressureItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i10010OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.pressureItem_delegate$lambda$0$0$0(this.f7498IO, (View) obj);
            }
        });
        return pressureItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pressureItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) PressureSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QiblaItem qiblaItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        QiblaItem qiblaItem = new QiblaItem();
        qiblaItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIXIO0X0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.qiblaItem_delegate$lambda$0$0$0(this.f1649IO, (View) obj);
            }
        });
        return qiblaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qiblaItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) QiblaSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReceiptCode2Item receiptCode2Item_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ReceiptCode2Item receiptCode2Item = new ReceiptCode2Item();
        receiptCode2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X111
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.receiptCode2Item_delegate$lambda$0$0$0(this.f4208IO, (View) obj);
            }
        });
        return receiptCode2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit receiptCode2Item_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ReceiptCodeActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReceiptCodeItem receiptCodeItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ReceiptCodeItem receiptCodeItem = new ReceiptCodeItem();
        receiptCodeItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii0OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.receiptCodeItem_delegate$lambda$0$0$0(this.f2176IO, (View) obj);
            }
        });
        return receiptCodeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit receiptCodeItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) QrcodeTypeInfosActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecordingItem recordingItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        RecordingItem recordingItem = new RecordingItem();
        recordingItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXXOi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.recordingItem_delegate$lambda$0$0$0(this.f5130IO, (View) obj);
            }
        });
        return recordingItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordingItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) RecordingListActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelaxReminderItem relaxReminderItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        RelaxReminderItem relaxReminderItem = new RelaxReminderItem();
        relaxReminderItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO11XIOOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.relaxReminderItem_delegate$lambda$0$0$0(this.f8024IO, (View) obj);
            }
        });
        return relaxReminderItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit relaxReminderItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) RelaxReminderSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteCameraItem remoteCameraItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        RemoteCameraItem remoteCameraItem = new RemoteCameraItem();
        remoteCameraItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1i10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.remoteCameraItem_delegate$lambda$0$0$0(this.f4380IO, (View) obj);
            }
        });
        return remoteCameraItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteCameraItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1Oi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.remoteCameraItem_delegate$lambda$0$0$0$0(this.f2765IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteCameraItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) CameraActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResetItem resetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ResetItem resetItem = new ResetItem();
        resetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iIX1X1X01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.resetItem_delegate$lambda$0$0$0(this.f7904IO, (View) obj);
            }
        });
        return resetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX000O00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.resetItem_delegate$lambda$0$0$0$0(this.f4924IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        go0 go0Var = new go0(deviceFragment.getMActivity(), 0, 2, null);
        go0Var.I0iXXO(false);
        go0Var.O1O(R.string.device_reset_title);
        go0Var.m1865iX(Integer.valueOf(R.string.device_reset_tip));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.X10I00
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.resetItem_delegate$lambda$0$0$0$0$0$0());
            }
        });
        go0Var.IIX1OXO();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resetItem_delegate$lambda$0$0$0$0$0$0() {
        if (q62.OXO1.Xi1Oi()) {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.DEVICE_OP, BleKeyFlag.UPDATE, new BleDeviceOp(2), false, false, 24, null);
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i11iOOI
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceFragment.resetItem_delegate$lambda$0$0$0$0$0$0$0();
                }
            }, 300L);
        } else {
            BleInitializer.OX0X1O10X(BleInitializer.f51208IO, false, 1, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetItem_delegate$lambda$0$0$0$0$0$0$0() {
        BleConnector.INSTANCE.closeConnection(true);
        BleInitializer.OX0X1O10X(BleInitializer.f51208IO, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(DeviceFragment deviceFragment) {
        return deviceFragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scanQrcode$lambda$0(DeviceFragment deviceFragment, String str) {
        if (str != null) {
            deviceFragment.doScanResult(str);
        } else {
            ToastUtils.showLong(R.string.qrcode_failed);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduleItem scheduleItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ScheduleItem scheduleItem = new ScheduleItem();
        scheduleItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XO0OiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.scheduleItem_delegate$lambda$0$0$0(this.f4676IO, (View) obj);
            }
        });
        return scheduleItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scheduleItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SchedulesActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SedentarinessItem sedentarinessItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        SedentarinessItem sedentarinessItem = new SedentarinessItem();
        sedentarinessItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X00IX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.sedentarinessItem_delegate$lambda$0$0$0(this.f3870IO, (View) obj);
            }
        });
        return sedentarinessItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sedentarinessItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SedentarinessSettingsActivity.class));
        return Unit.OXO1;
    }

    private final c72 setProgressBackCallBack(c72 c72Var) {
        if (c72Var != null) {
            return c72Var;
        }
        c72 c72Var2 = new c72(getMActivity(), 0, 2, null);
        c72Var2.X1ii(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiOXXOX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeviceFragment.setProgressBackCallBack$lambda$0$0(this.f2273IO);
            }
        });
        c72Var2.XXI(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOiOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeviceFragment.setProgressBackCallBack$lambda$0$1(this.f4842IO);
            }
        });
        return c72Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProgressBackCallBack$lambda$0$0(DeviceFragment deviceFragment) {
        BleConnector.INSTANCE.addHandleCallback(deviceFragment.bleHandleCallback);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProgressBackCallBack$lambda$0$1(DeviceFragment deviceFragment) {
        BleConnector.INSTANCE.removeHandleCallback(deviceFragment.bleHandleCallback);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShockItem shockItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ShockItem shockItem = new ShockItem();
        shockItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0IO1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shockItem_delegate$lambda$0$0$0(this.f2449IO, (View) obj);
            }
        });
        return shockItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shockItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mShockPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.vibration_times, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(q62.OXO1.Oi1());
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1Oi111X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.shockItem_delegate$lambda$0$0$0$0$0(this.f2767IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mShockPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mShockPopup;
        if (dj4Var2 != null) {
            int int$default = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VIBRATION, 0, null, 6, null);
            if (int$default > 3) {
                int$default = 3;
            }
            dj4Var2.II1Xi0(int$default);
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shockItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IO11X0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shockItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shockItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.VIBRATION, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getShockItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShockLevelItem shockLevelItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ShockLevelItem shockLevelItem = new ShockLevelItem();
        shockLevelItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXO00iI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shockLevelItem_delegate$lambda$0$0$0(this.f3481IO, (View) obj);
            }
        });
        return shockLevelItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shockLevelItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mShockPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.vibration_level, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(q62.OXO1.Oi1());
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1I0I0iO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.shockLevelItem_delegate$lambda$0$0$0$0$0(this.f2696IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mShockPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mShockPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VIBRATION_V2, 0, null, 6, null) == 2 ? 0 : 1);
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shockLevelItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOX1iXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shockLevelItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shockLevelItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.VIBRATION_V2, BleKeyFlag.UPDATE, i == 0 ? 2 : 1, false, false, 24, null);
        deviceFragment.getShockLevelItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShockSettingsItem shockSettingsItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ShockSettingsItem shockSettingsItem = new ShockSettingsItem();
        shockSettingsItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXOOOiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shockSettingsItem_delegate$lambda$0$0$0(this.f2068IO, (View) obj);
            }
        });
        return shockSettingsItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shockSettingsItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ShockSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeviceUnbindPopup$lambda$0$0() {
        return true;
    }

    private final void showHIDPopup() {
        go0 go0Var = this.mHIDPopup;
        if (go0Var == null || !go0Var.isShowing()) {
            if (this.mHIDPopup == null) {
                go0 go0Var2 = new go0(getMActivity(), 0, 2, null);
                go0Var2.O1O(R.string.hid_remind);
                go0Var2.I0iXXO(false);
                go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
                go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XXX0X1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(DeviceFragment.showHIDPopup$lambda$0$0());
                    }
                });
                this.mHIDPopup = go0Var2;
            }
            go0 go0Var3 = this.mHIDPopup;
            if (go0Var3 != null) {
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var3.I1XOi1(rootView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showHIDPopup$lambda$0$0() {
        BleConnector.INSTANCE.connectHID();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final DeviceFragment deviceFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        deviceFragment.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.X1iiiOOX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeviceFragment.showList$lambda$0$0(this.f4402IO, renderAdapter);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(DeviceFragment deviceFragment, DslAdapter dslAdapter) {
        List<DslAdapterItem> list = deviceFragment.showList;
        if (list == null) {
            Intrinsics.XXO("showList");
            list = null;
        }
        for (DslAdapterItem dslAdapterItem : list) {
            if (dslAdapterItem instanceof BaseDslItem) {
                try {
                    ((BaseDslItem) dslAdapterItem).initView();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        List<DslAdapterItem> list2 = deviceFragment.showList;
        if (list2 == null) {
            Intrinsics.XXO("showList");
            list2 = null;
        }
        Iterator<DslAdapterItem> it = list2.iterator();
        while (it.hasNext()) {
            DslAdapterExKt.IIX1OXO(dslAdapter, it.next(), null, 2, null);
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOO0i0X1X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.showList$lambda$0$0$0((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPairTypePop$lambda$0(DeviceFragment deviceFragment, boolean z) {
        if (z) {
            deviceFragment.showPairTypePop();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPairTypePop$lambda$1(DeviceFragment deviceFragment, boolean z) {
        if (z) {
            deviceFragment.showPairTypePop();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPairTypePop$lambda$2$0(final DeviceFragment deviceFragment, final m04 m04Var) {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.CAMERA);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = deviceFragment.getString(R.string.camera_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = deviceFragment.getString(R.string.camera_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXI0IIiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.showPairTypePop$lambda$2$0$0(this.f1992IO, m04Var, (PermissionStatus) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPairTypePop$lambda$2$0$0(DeviceFragment deviceFragment, m04 m04Var, PermissionStatus it) throws IOException {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            m04 m04Var2 = deviceFragment.mSelectPairPopup;
            if (m04Var2 != null) {
                m04Var2.dismiss();
            }
            deviceFragment.scanQrcode();
        } else if (it == PermissionStatus.DENIED_FOREVER) {
            go0 go0Var = new go0(m04Var.XO0O10(), 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.camera_explain_title);
            go0Var.m1865iX(Integer.valueOf(R.string.camera_explain_content));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iII000OI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeviceFragment.showPairTypePop$lambda$2$0$0$0$0());
                }
            });
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPairTypePop$lambda$2$0$0$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPairTypePop$lambda$2$1(DeviceFragment deviceFragment) {
        m04 m04Var = deviceFragment.mSelectPairPopup;
        if (m04Var != null) {
            m04Var.dismiss();
        }
        toAddDevice$default(deviceFragment, null, null, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShutdownItem shutdownItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        ShutdownItem shutdownItem = new ShutdownItem();
        shutdownItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OI1iXX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shutdownItem_delegate$lambda$0$0$0(this.f2940IO, (View) obj);
            }
        });
        return shutdownItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shutdownItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1iXOiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.shutdownItem_delegate$lambda$0$0$0$0(this.f7728IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shutdownItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        go0 go0Var = new go0(deviceFragment.getMActivity(), 0, 2, null);
        go0Var.I0iXXO(false);
        go0Var.O1O(R.string.device_shutdown_title);
        go0Var.m1865iX(Integer.valueOf(R.string.device_shutdown_tip));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1O100IO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.shutdownItem_delegate$lambda$0$0$0$0$0$0());
            }
        });
        go0Var.IIX1OXO();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shutdownItem_delegate$lambda$0$0$0$0$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TranslationSimultaneousItem simultaneousTranslation_delegate$lambda$0(final DeviceFragment deviceFragment) {
        TranslationSimultaneousItem translationSimultaneousItem = new TranslationSimultaneousItem();
        translationSimultaneousItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OX1ii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.simultaneousTranslation_delegate$lambda$0$0$0(this.f3449IO, (View) obj);
            }
        });
        return translationSimultaneousItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit simultaneousTranslation_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I100XO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.simultaneousTranslation_delegate$lambda$0$0$0$0(this.f1293IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit simultaneousTranslation_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SparkChainSimultaneousActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean singleChoiceIncomingCallRing$lambda$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii0OOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.singleChoiceIncomingCallRing$lambda$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit singleChoiceIncomingCallRing$lambda$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        int i2 = 1;
        int i3 = 0;
        if (i == 1) {
            i3 = 1;
            i2 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i2 = 0;
            } else {
                i3 = 1;
            }
        }
        BaseBleConnector.sendObject$default(it, BleKey.RING_VIBRATION_SET, BleKeyFlag.UPDATE, new BleRingVibrationSettings(i2, i3), false, false, 24, null);
        deviceFragment.getIncomingCallRingVibrationItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSetItem sleepSet_delegate$lambda$0(final DeviceFragment deviceFragment) {
        SleepSetItem sleepSetItem = new SleepSetItem();
        sleepSetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.II0iiIX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.sleepSet_delegate$lambda$0$0$0(this.f1537IO, (View) obj);
            }
        });
        return sleepSetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sleepSet_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiOOiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.sleepSet_delegate$lambda$0$0$0$0(this.f5308IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sleepSet_delegate$lambda$0$0$0$0(final DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.sleep_monitoring);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOXXiii01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceFragment.sleepSet_delegate$lambda$0$0$0$0$0$0(this.f3353IO, ((Integer) obj).intValue()));
            }
        });
        dj4Var.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.SLEEP_SET, 0, null, 6, null));
        dj4Var.IIX1OXO();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sleepSet_delegate$lambda$0$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1Iii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.sleepSet_delegate$lambda$0$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sleepSet_delegate$lambda$0$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.SLEEP_SET, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getSleepSet().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SMSQuickReplyItem smsQuickReplyItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        SMSQuickReplyItem sMSQuickReplyItem = new SMSQuickReplyItem();
        sMSQuickReplyItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XI1OIXiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.smsQuickReplyItem_delegate$lambda$0$0$0(this.f4476IO, (View) obj);
            }
        });
        return sMSQuickReplyItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit smsQuickReplyItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.SMS);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX0OiX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.smsQuickReplyItem_delegate$lambda$0$0$0$0(this.f4951IO, (PermissionStatus) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit smsQuickReplyItem_delegate$lambda$0$0$0$0(final DeviceFragment deviceFragment, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1X1XX0X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceFragment.smsQuickReplyItem_delegate$lambda$0$0$0$0$0(this.f2782IO, (BleConnector) obj);
                }
            }, 1, null);
        } else {
            deviceFragment.noPermissionRemind();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit smsQuickReplyItem_delegate$lambda$0$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SMSQuickReplyActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SOSManagerItem sosManagerItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        SOSManagerItem sOSManagerItem = new SOSManagerItem();
        sOSManagerItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XOiII
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.sosManagerItem_delegate$lambda$0$0$0(this.f1228IO, (View) obj);
            }
        });
        return sOSManagerItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sosManagerItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) SOSSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandbySetItem standbySetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        StandbySetItem standbySetItem = new StandbySetItem();
        standbySetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIIOi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.standbySetItem_delegate$lambda$0$0$0(this.f2978IO, (View) obj);
            }
        });
        return standbySetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit standbySetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mStandbySetPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.enable, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.standby_set);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1O1O101
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.standbySetItem_delegate$lambda$0$0$0$0$0(this.f2742IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mStandbySetPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mStandbySetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STANDBY_SET, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean standbySetItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O0iOiXOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.standbySetItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit standbySetItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.STANDBY_SET, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getStandbySetItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandbyWatchFaceItem standbyWatchFaceItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        StandbyWatchFaceItem standbyWatchFaceItem = new StandbyWatchFaceItem();
        standbyWatchFaceItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1O1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.standbyWatchFaceItem_delegate$lambda$0$0$0(this.f2741IO, (View) obj);
            }
        });
        return standbyWatchFaceItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit standbyWatchFaceItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) StandbyWatchFaceSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StockMarketItem stockMarketItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        StockMarketItem stockMarketItem = new StockMarketItem();
        stockMarketItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi1I1OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.stockMarketItem_delegate$lambda$0$0$0(this.f5222IO, (View) obj);
            }
        });
        return stockMarketItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stockMarketItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        if (!a01Var.IiI10X().getBoolean(b01.O001I, true) || appUser2.getIdentity().length() <= 0) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) LoginReminderActivity.class));
        } else {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) StockMarketActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SyncContactItem syncContactItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        SyncContactItem syncContactItem = new SyncContactItem();
        syncContactItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iI00OX1II
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.syncContactItem_delegate$lambda$0$0$0(this.f7787IO, (View) obj);
            }
        });
        return syncContactItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncContactItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.CONTACTS);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiX100
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.syncContactItem_delegate$lambda$0$0$0$0(this.f2279IO, (PermissionStatus) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncContactItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it != PermissionStatus.GRANTED) {
            deviceFragment.noPermissionRemind();
        } else if (q62.OXO1.I0i()) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ContactListV2Activity.class));
        } else {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) ContactListActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TempMonitoringItem tempMonitoringItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        TempMonitoringItem tempMonitoringItem = new TempMonitoringItem();
        tempMonitoringItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIOi00Ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.tempMonitoringItem_delegate$lambda$0$0$0(this.f4567IO, (View) obj);
            }
        });
        return tempMonitoringItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tempMonitoringItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) TempMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void threePopup(boolean z) {
        q62 q62Var = q62.OXO1;
        if (q62Var.IX0iIX() && q62Var.iO0iiOi()) {
            DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OIi0(), null, 2, null);
        } else if (q62Var.OOXiOO()) {
            DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OIX0iXi(), null, 2, null);
        } else {
            fourPopup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeFormatItem timeFormatItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        TimeFormatItem timeFormatItem = new TimeFormatItem();
        timeFormatItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOi0i11
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.timeFormatItem_delegate$lambda$0$0$0(this.f4832IO, (View) obj);
            }
        });
        return timeFormatItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timeFormatItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mTimeFormatPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.time_format, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.time_format);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.iOiOXX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.timeFormatItem_delegate$lambda$0$0$0$0$0(this.f8195IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mTimeFormatPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mTimeFormatPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.HOUR_SYSTEM, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean timeFormatItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIOi11
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.timeFormatItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timeFormatItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.HOUR_SYSTEM, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getTimeFormatItem().initView();
        return Unit.OXO1;
    }

    public static /* synthetic */ void toAddDevice$default(DeviceFragment deviceFragment, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAddDevice");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        deviceFragment.toAddDevice(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void toFirmwareUpgrade() {
        BleCache bleCache = BleCache.INSTANCE;
        String mPlatform = bleCache.getMPlatform();
        switch (mPlatform.hashCode()) {
            case 65152:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_ATS)) {
                    startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeATSActivity.class));
                    return;
                }
                break;
            case 76676:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_MTK)) {
                    startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeMActivity.class));
                    return;
                }
                break;
            case 2755709:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_ZKLX)) {
                    startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeZActivity.class));
                    return;
                }
                break;
            case 78896685:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_SIFLI)) {
                    startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeSActivity.class));
                    return;
                }
                break;
            case 2138586828:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_GOODIX)) {
                    if (Intrinsics.XOO0ii0(bleCache.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q)) {
                        DeviceInfoChecker.OXO1.IiI10X(getMActivity());
                        return;
                    } else {
                        startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeGActivity.class));
                        return;
                    }
                }
                break;
        }
        if (q62.OXO1.I0i0()) {
            DeviceInfoChecker.OXO1.IiI10X(getMActivity());
        } else {
            startActivity(new Intent(getActivity(), (Class<?>) FirmwareUpgradeNActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toSyncAGPS() {
        c72 progressBackCallBack = setProgressBackCallBack(this.mAGpsPopup);
        this.mAGpsPopup = progressBackCallBack;
        if (progressBackCallBack != null) {
            progressBackCallBack.m1591I1(R.string.downloading);
            progressBackCallBack.m1592OX(0);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            progressBackCallBack.I1XOi1(rootView);
        }
        AGPSInitializer.f51206IO.m38214OX(false, this.mAGpsPopup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TouchSetItem touchSetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        TouchSetItem touchSetItem = new TouchSetItem();
        touchSetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IX0i01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.touchSetItem_delegate$lambda$0$0$0(this.f1949IO, (View) obj);
            }
        });
        return touchSetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit touchSetItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) TouchSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnpairItem unpairItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        UnpairItem unpairItem = new UnpairItem();
        unpairItem.setMOnUnbindListener(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0i0O0iI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeviceFragment.unpairItem_delegate$lambda$0$0$0(this.f8531IO);
            }
        });
        return unpairItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unpairItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment) {
        go0 go0Var = new go0(deviceFragment.getMActivity(), 0, 2, null);
        q62 q62Var = q62.OXO1;
        if (q62Var.iii0() && a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false)) {
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.unbind_tip_by_update_failed);
            go0.X11iII1O1(go0Var, null, null, 2, null);
            go0Var.X1IX(R.string.firmware_repair, new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIiXXIO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeviceFragment.unpairItem_delegate$lambda$0$0$0$0$0());
                }
            });
        } else {
            go0Var.O1O(q62Var.X1iOII0() ? R.string.unbind_tip2 : R.string.unbind_tip);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOX0i0i
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeviceFragment.unpairItem_delegate$lambda$0$0$0$0$1(this.f4822IO));
                }
            });
        }
        deviceFragment.setMUnbindPopup(go0Var);
        go0 mUnbindPopup = deviceFragment.getMUnbindPopup();
        if (mUnbindPopup != null) {
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            mUnbindPopup.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unpairItem_delegate$lambda$0$0$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unpairItem_delegate$lambda$0$0$0$0$1(DeviceFragment deviceFragment) {
        deviceFragment.whenUnbind();
        return true;
    }

    public static /* synthetic */ void updatePairState$default(DeviceFragment deviceFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePairState");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        deviceFragment.updatePairState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuraVideoUseHelpItem videoUseHelpItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        AuraVideoUseHelpItem auraVideoUseHelpItem = new AuraVideoUseHelpItem();
        auraVideoUseHelpItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO0O1ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.videoUseHelpItem_delegate$lambda$0$0$0(this.f7994IO, (View) obj);
            }
        });
        return auraVideoUseHelpItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoUseHelpItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        String str;
        Intrinsics.X0O(it, "it");
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/courseList/?type=" + str);
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(deviceFragment.getActivity(), (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        deviceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceControlItem voiceControl_delegate$lambda$0(final DeviceFragment deviceFragment) {
        VoiceControlItem voiceControlItem = new VoiceControlItem();
        voiceControlItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOI1OXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.voiceControl_delegate$lambda$0$0$0(this.f3213IO, (View) obj);
            }
        });
        return voiceControlItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceControl_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.II1I1Oi0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.voiceControl_delegate$lambda$0$0$0$0(this.f1544IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceControl_delegate$lambda$0$0$0$0(final DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.sound_set, 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.sound);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XOO0Iii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceFragment.voiceControl_delegate$lambda$0$0$0$0$0$0(this.f4788IO, ((Integer) obj).intValue()));
            }
        });
        dj4Var.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VOICE_CONTROL, 0, null, 6, null));
        dj4Var.IIX1OXO();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean voiceControl_delegate$lambda$0$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.II1XiXI01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.voiceControl_delegate$lambda$0$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceControl_delegate$lambda$0$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.VOICE_CONTROL, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getVoiceControl().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceItem voiceItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        VoiceItem voiceItem = new VoiceItem();
        voiceItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi110
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.voiceItem_delegate$lambda$0$0$0(this.f5218IO, (View) obj);
            }
        });
        return voiceItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        q62 q62Var = q62.OXO1;
        if (!q62Var.IiX1ii() && !q62Var.OIXOOi() && TextUtils.isEmpty(q62Var.iIiiO()) && !q62Var.XOX()) {
            UtilsKt.XXiO0i(deviceFragment.getMActivity());
        } else if (q62Var.IOI0i0I()) {
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            if (voiceManager.isExpired()) {
                voiceManager.checkBaiduAuth(deviceFragment.getMActivity(), deviceFragment.getRootView(), new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1iX
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceFragment.voiceItem_delegate$lambda$0$0$0$0(this.f8052IO, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) VoiceActivity.class));
            }
        } else {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) VoiceActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, boolean z) {
        if (z) {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) VoiceActivity.class));
        } else {
            deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) VoiceSetActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WashItem washItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WashItem washItem = new WashItem();
        washItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.washItem_delegate$lambda$0$0$0(this.f3480IO, (View) obj);
            }
        });
        return washItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit washItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) WashSettingsActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchPasswordItem watchPasswordItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WatchPasswordItem watchPasswordItem = new WatchPasswordItem();
        watchPasswordItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.XOXOO0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.watchPasswordItem_delegate$lambda$0$0$0(this.f4868IO, (View) obj);
            }
        });
        return watchPasswordItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit watchPasswordItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) WatchPasswordActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearWayItem wearWayItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WearWayItem wearWayItem = new WearWayItem();
        wearWayItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXX111
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wearWayItem_delegate$lambda$0$0$0(this.f3538IO, (View) obj);
            }
        });
        return wearWayItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearWayItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (deviceFragment.mWearWayPopup == null) {
            dj4 dj4Var = new dj4(deviceFragment.getMActivity(), R.array.wear_way, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.wear_way);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IOI0OiXOI
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.wearWayItem_delegate$lambda$0$0$0$0$0(this.f1792IO, ((Integer) obj).intValue()));
                }
            });
            deviceFragment.mWearWayPopup = dj4Var;
        }
        dj4 dj4Var2 = deviceFragment.mWearWayPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.WEAR_WAY, 0, null, 6, null));
            View rootView = deviceFragment.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wearWayItem_delegate$lambda$0$0$0$0$0(final DeviceFragment deviceFragment, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1i1X1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wearWayItem_delegate$lambda$0$0$0$0$0$0(i, deviceFragment, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearWayItem_delegate$lambda$0$0$0$0$0$0(int i, DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.WEAR_WAY, BleKeyFlag.UPDATE, i, false, false, 24, null);
        deviceFragment.getWearWayItem().initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WechatPaySetItem wechatPaySetItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WechatPaySetItem wechatPaySetItem = new WechatPaySetItem();
        wechatPaySetItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0iOXiiIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wechatPaySetItem_delegate$lambda$0$0$0(this.f2599IO, (View) obj);
            }
        });
        return wechatPaySetItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wechatPaySetItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1OXXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wechatPaySetItem_delegate$lambda$0$0$0$0(this.f1428IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wechatPaySetItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) WeChatPayActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WechatVerificationItem wechatVerificationItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WechatVerificationItem wechatVerificationItem = new WechatVerificationItem();
        wechatVerificationItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXI0iXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wechatVerificationItem_delegate$lambda$0$0$0(this.f8312IO, (View) obj);
            }
        });
        return wechatVerificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wechatVerificationItem_delegate$lambda$0$0$0(final DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O0X0iI11O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.wechatVerificationItem_delegate$lambda$0$0$0$0(this.f2534IO, (BleConnector) obj);
            }
        }, 1, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wechatVerificationItem_delegate$lambda$0$0$0$0(DeviceFragment deviceFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) WechatVerificationActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorldClockItem worldClockItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        WorldClockItem worldClockItem = new WorldClockItem();
        worldClockItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXiiIi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.worldClockItem_delegate$lambda$0$0$0(this.f3608IO, (View) obj);
            }
        });
        return worldClockItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit worldClockItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) WorldClockActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XmlyAudioItem xmlyAudioItem_delegate$lambda$0(final DeviceFragment deviceFragment) {
        XmlyAudioItem xmlyAudioItem = new XmlyAudioItem();
        xmlyAudioItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I1XIXOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.xmlyAudioItem_delegate$lambda$0$0$0(this.f1453IO, (View) obj);
            }
        });
        return xmlyAudioItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xmlyAudioItem_delegate$lambda$0$0$0(DeviceFragment deviceFragment, View it) {
        Intrinsics.X0O(it, "it");
        deviceFragment.startActivity(new Intent(deviceFragment.getActivity(), (Class<?>) XmlyAudioWebViewActivity.class));
        return Unit.OXO1;
    }

    public final void checkAppAvailable() {
        DeviceInfoChecker.OXO1.XIi00iiXO(new Function1() { // from class: com.android.mltcode.paycertificationapi.I01X1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.checkAppAvailable$lambda$0(this.f1077IO, (String) obj);
            }
        });
    }

    @sf5(tag = I01XX0.f1090X1)
    public final void checkFirmware(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("checkFirmware -> update check");
        twoPopup(true);
        DeviceInfoChecker.OXO1.m38093I1();
    }

    public boolean checkNotificationPermission() {
        boolean zO00 = MyNotificationListenerService.O001I.O00(getMActivity());
        if (!zO00) {
            if (this.mNotificationPopup == null) {
                final go0 go0Var = new go0(getMActivity(), 0, 2, null);
                String string = getString(R.string.allow_notification_access, getString(R.string.app_name));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                go0Var.m1864iI(string);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0i1O0
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(DeviceFragment.checkNotificationPermission$lambda$0$0$0(go0Var));
                    }
                });
                this.mNotificationPopup = go0Var;
            }
            go0 go0Var2 = this.mNotificationPopup;
            if (go0Var2 != null) {
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView);
            }
        }
        return zO00;
    }

    public final void doScanResult(@aa1 String result) {
        Intrinsics.X0O(result, "result");
        try {
            Uri uri = Uri.parse(result);
            String queryParameter = uri.getQueryParameter("name");
            String queryParameter2 = uri.getQueryParameter("mac");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri.getQueryParameter("MAC");
            }
            i1O0OXO1O.OXO1.OXO1("doScanResult -> " + queryParameter + ", " + queryParameter2);
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2)) {
                Toast.makeText(getMActivity(), R.string.qrcode_failed, 1).show();
            } else {
                Intrinsics.XXI(queryParameter2);
                toAddDevice(queryParameter, queryParameter2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getMActivity(), R.string.qrcode_failed, 1).show();
        }
    }

    @aa1
    public final AGPSUpgradeItem getAGPSUpgradeItem() {
        return (AGPSUpgradeItem) this.aGPSUpgradeItem$delegate.getValue();
    }

    @aa1
    public final ActivityRecognitionItem getActivityRecognitionItem() {
        return (ActivityRecognitionItem) this.activityRecognitionItem$delegate.getValue();
    }

    @aa1
    public final AINoteItem getAiNote() {
        return (AINoteItem) this.aiNote$delegate.getValue();
    }

    @aa1
    public final AlarmClockItem getAlarmClockItem() {
        return (AlarmClockItem) this.alarmClockItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getAlipaySetItem() {
        return (BaseDeviceItem) this.alipaySetItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getAntiLostItem() {
        return (BaseDeviceItem) this.antiLostItem$delegate.getValue();
    }

    @aa1
    public final AppStoreItem getAppStoreItem() {
        return (AppStoreItem) this.appStoreItem$delegate.getValue();
    }

    @aa1
    public final AudioBookLearnItem getAudioBookLearnItem() {
        return (AudioBookLearnItem) this.audioBookLearnItem$delegate.getValue();
    }

    @aa1
    public List<DslAdapterItem> getBCItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem());
    }

    @aa1
    public final BaseDeviceItem getBackLightItem() {
        return (BaseDeviceItem) this.backLightItem$delegate.getValue();
    }

    @aa1
    public final BloodOxyGenItem getBloodOxyGenItem() {
        return (BloodOxyGenItem) this.bloodOxyGenItem$delegate.getValue();
    }

    @aa1
    public final ClassicPairItem getClassicPairItem() {
        return (ClassicPairItem) this.classicPairItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getDateFormatItem() {
        return (BaseDeviceItem) this.dateFormatItem$delegate.getValue();
    }

    @aa1
    public final DialItem getDialItem() {
        return (DialItem) this.dialItem$delegate.getValue();
    }

    @aa1
    public final TranslationDialogueItem getDialogueTranslation() {
        return (TranslationDialogueItem) this.dialogueTranslation$delegate.getValue();
    }

    @aa1
    public final DoubleClickScreenItem getDoubleClickScreenItem() {
        return (DoubleClickScreenItem) this.doubleClickScreenItem$delegate.getValue();
    }

    @aa1
    public final DrinkWaterItem getDrinkWaterItem() {
        return (DrinkWaterItem) this.drinkWaterItem$delegate.getValue();
    }

    @aa1
    public final EarphoneItem getEarphoneItem() {
        return (EarphoneItem) this.earphoneItem$delegate.getValue();
    }

    @aa1
    public final EBookManagerItem getEbookManagerItem() {
        return (EBookManagerItem) this.ebookManagerItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getEcgMonitoringItem() {
        return (BaseDeviceItem) this.ecgMonitoringItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getFallManagerItem() {
        return (BaseDeviceItem) this.fallManagerItem$delegate.getValue();
    }

    @aa1
    public final FindWatchItem getFindWatchItem() {
        return (FindWatchItem) this.findWatchItem$delegate.getValue();
    }

    @aa1
    public final FirmwareItem getFirmwareItem() {
        return (FirmwareItem) this.firmwareItem$delegate.getValue();
    }

    @aa1
    public final GameSettingsItem getGameSettingsItem() {
        return (GameSettingsItem) this.gameSettingsItem$delegate.getValue();
    }

    @aa1
    public final GameStoreItem getGameStoreItem() {
        return (GameStoreItem) this.gameStoreItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getGameTimeSetItem() {
        return (BaseDeviceItem) this.gameTimeSetItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getGestureWake2Item() {
        return (BaseDeviceItem) this.gestureWake2Item$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getGestureWakeItem() {
        return (BaseDeviceItem) this.gestureWakeItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getGirlCareItem() {
        return (BaseDeviceItem) this.girlCareItem$delegate.getValue();
    }

    @aa1
    public final HardWareAlipayItem getHardWareAlipay() {
        return (HardWareAlipayItem) this.hardWareAlipay$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getHrMonitoringItem() {
        return (BaseDeviceItem) this.hrMonitoringItem$delegate.getValue();
    }

    @aa1
    public final HrvSetItem getHrvSetItem() {
        return (HrvSetItem) this.hrvSetItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getHydrationReminderItem() {
        return (BaseDeviceItem) this.hydrationReminderItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallItem() {
        return (BaseDeviceItem) this.incomingCallItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallRingItem() {
        return (BaseDeviceItem) this.incomingCallRingItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallRingVibrationItem() {
        return (BaseDeviceItem) this.incomingCallRingVibrationItem$delegate.getValue();
    }

    @aa1
    public final InfoItem getInfoItem() {
        return (InfoItem) this.infoItem$delegate.getValue();
    }

    @aa1
    public List<DslAdapterItem> getItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(getInfoItem(), getEarphoneItem(), getGameStoreItem(), getClassicPairItem(), getQiblaItem(), getDialItem(), getMessagePushItem(), new SplitLine4DPItem(), getIncomingCallItem(), getAntiLostItem(), getNoDisturbItem(), getNoDisturb2Item(), getDoubleClickScreenItem(), getAlarmClockItem(), getGameTimeSetItem(), getMedicationAlarmItem(), getSedentarinessItem(), getDrinkWaterItem(), getBloodOxyGenItem(), getRelaxReminderItem(), getWashItem(), getMeasureUnitItem(), getDateFormatItem(), getTimeFormatItem(), getPressureItem(), getStandbyWatchFaceItem(), new SplitLine4DPItem(), getShockItem(), getShockSettingsItem(), getBackLightItem(), getGestureWakeItem(), getGestureWake2Item(), getWearWayItem(), getHrMonitoringItem(), getEcgMonitoringItem(), getTempMonitoringItem(), getMusicControlItem(), getAppStoreItem(), getAudioBookLearnItem(), getLearnCardItem(), getGameSettingsItem(), getFindWatchItem(), getSmsQuickReplyItem(), new SplitLine4DPItem(), getScheduleItem(), getRecordingItem(), getGirlCareItem(), getSosManagerItem(), getMemoryManagerItem(), getRemoteCameraItem(), getLanguageItem(), getTouchSetItem(), getFirmwareItem(), getAGPSUpgradeItem(), getSyncContactItem(), getMacQrcodeItem(), getStockMarketItem(), getWorldClockItem(), getLogoFileItem(), getWatchPasswordItem(), getPowerSaveModeItem(), getStandbySetItem(), getAlipaySetItem(), getWechatPaySetItem(), getHardWareAlipay(), getNavigationItem(), getVoiceItem(), getDialogueTranslation(), getSimultaneousTranslation(), getAiNote(), getMusicManagerItem(), getOfflineMapsItem(), getEbookManagerItem(), getIncomingCallRingItem(), getNfcGuideItem(), getNotificationLightScreenItem(), getIncomingCallRingVibrationItem(), getResetItem(), new SplitLine4DPItem(), getNucleicAcidCodeItem(), getWechatVerificationItem(), getMyCardCodeItem(), getMyCardCode2Item(), getReceiptCodeItem(), getReceiptCode2Item(), getLanguageUpdateItem(), getUnpairItem());
    }

    @aa1
    public final LanguageItem getLanguageItem() {
        return (LanguageItem) this.languageItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getLanguageUpdateItem() {
        return (BaseDeviceItem) this.languageUpdateItem$delegate.getValue();
    }

    @aa1
    public final LearnCardItem getLearnCardItem() {
        return (LearnCardItem) this.learnCardItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getLogoFileItem() {
        return (BaseDeviceItem) this.logoFileItem$delegate.getValue();
    }

    @tb1
    public final c72 getMAGpsPopup() {
        return this.mAGpsPopup;
    }

    @tb1
    public final ml1 getMConfirmPopup() {
        return this.mConfirmPopup;
    }

    @tb1
    public final go0 getMOTAMessagePopup() {
        return this.mOTAMessagePopup;
    }

    @tb1
    public final m04 getMSelectPairPopup() {
        return this.mSelectPairPopup;
    }

    @tb1
    public final ExtraPackageData[] getMServerLanguageList() {
        return this.mServerLanguageList;
    }

    @tb1
    public go0 getMUnbindPopup() {
        return this.mUnbindPopup;
    }

    @aa1
    public final BaseDeviceItem getMacQrcodeItem() {
        return (BaseDeviceItem) this.macQrcodeItem$delegate.getValue();
    }

    @aa1
    public final MeasureUnitItem getMeasureUnitItem() {
        return (MeasureUnitItem) this.measureUnitItem$delegate.getValue();
    }

    @aa1
    public final MedicationAlarmItem getMedicationAlarmItem() {
        return (MedicationAlarmItem) this.medicationAlarmItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getMeetingReminderItem() {
        return (BaseDeviceItem) this.meetingReminderItem$delegate.getValue();
    }

    @aa1
    public final MemoryManagerItem getMemoryManagerItem() {
        return (MemoryManagerItem) this.memoryManagerItem$delegate.getValue();
    }

    @aa1
    public final MessagePushItem getMessagePushItem() {
        return (MessagePushItem) this.messagePushItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getMusicControlItem() {
        return (BaseDeviceItem) this.musicControlItem$delegate.getValue();
    }

    @aa1
    public final MusicManagerItem getMusicManagerItem() {
        return (MusicManagerItem) this.musicManagerItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getMyCardCode2Item() {
        return (BaseDeviceItem) this.myCardCode2Item$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getMyCardCodeItem() {
        return (BaseDeviceItem) this.myCardCodeItem$delegate.getValue();
    }

    @aa1
    public final NavigationItem getNavigationItem() {
        return (NavigationItem) this.navigationItem$delegate.getValue();
    }

    @aa1
    public final NFCGuideItem getNfcGuideItem() {
        return (NFCGuideItem) this.nfcGuideItem$delegate.getValue();
    }

    @aa1
    public final NoDisturb2Item getNoDisturb2Item() {
        return (NoDisturb2Item) this.noDisturb2Item$delegate.getValue();
    }

    @aa1
    public final NoDisturbItem getNoDisturbItem() {
        return (NoDisturbItem) this.noDisturbItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getNotificationLightScreenItem() {
        return (BaseDeviceItem) this.notificationLightScreenItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getNucleicAcidCodeItem() {
        return (BaseDeviceItem) this.nucleicAcidCodeItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getOfflineMapsItem() {
        return (BaseDeviceItem) this.offlineMapsItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getPowerSaveModeItem() {
        return (BaseDeviceItem) this.powerSaveModeItem$delegate.getValue();
    }

    @aa1
    public final PressureItem getPressureItem() {
        return (PressureItem) this.pressureItem$delegate.getValue();
    }

    @aa1
    public final QiblaItem getQiblaItem() {
        return (QiblaItem) this.qiblaItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getReceiptCode2Item() {
        return (BaseDeviceItem) this.receiptCode2Item$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getReceiptCodeItem() {
        return (BaseDeviceItem) this.receiptCodeItem$delegate.getValue();
    }

    @aa1
    public final RecordingItem getRecordingItem() {
        return (RecordingItem) this.recordingItem$delegate.getValue();
    }

    @aa1
    public final RelaxReminderItem getRelaxReminderItem() {
        return (RelaxReminderItem) this.relaxReminderItem$delegate.getValue();
    }

    @aa1
    public final RemoteCameraItem getRemoteCameraItem() {
        return (RemoteCameraItem) this.remoteCameraItem$delegate.getValue();
    }

    @aa1
    public final ResetItem getResetItem() {
        return (ResetItem) this.resetItem$delegate.getValue();
    }

    @aa1
    public List<DslAdapterItem> getRingItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(getInfoItem(), new SplitLine4DPItem(), getGameStoreItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getTouchSetItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem());
    }

    public View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    @aa1
    public final ScheduleItem getScheduleItem() {
        return (ScheduleItem) this.scheduleItem$delegate.getValue();
    }

    @aa1
    public List<DslAdapterItem> getScreenlessBraceletItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), getHrvSetItem(), getTempMonitoringItem(), new SplitLine4DPItem(), getAlarmClockItem(), getShockLevelItem(), getActivityRecognitionItem(), getFindWatchItem(), getMeasureUnitItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem());
    }

    @aa1
    public final SedentarinessItem getSedentarinessItem() {
        return (SedentarinessItem) this.sedentarinessItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getShockItem() {
        return (BaseDeviceItem) this.shockItem$delegate.getValue();
    }

    @aa1
    public final ShockLevelItem getShockLevelItem() {
        return (ShockLevelItem) this.shockLevelItem$delegate.getValue();
    }

    @aa1
    public final ShockSettingsItem getShockSettingsItem() {
        return (ShockSettingsItem) this.shockSettingsItem$delegate.getValue();
    }

    @aa1
    public final ShutdownItem getShutdownItem() {
        return (ShutdownItem) this.shutdownItem$delegate.getValue();
    }

    @aa1
    public final TranslationSimultaneousItem getSimultaneousTranslation() {
        return (TranslationSimultaneousItem) this.simultaneousTranslation$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getSleepSet() {
        return (BaseDeviceItem) this.sleepSet$delegate.getValue();
    }

    @aa1
    public final SMSQuickReplyItem getSmsQuickReplyItem() {
        return (SMSQuickReplyItem) this.smsQuickReplyItem$delegate.getValue();
    }

    @aa1
    public final SOSManagerItem getSosManagerItem() {
        return (SOSManagerItem) this.sosManagerItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getStandbySetItem() {
        return (BaseDeviceItem) this.standbySetItem$delegate.getValue();
    }

    @aa1
    public final StandbyWatchFaceItem getStandbyWatchFaceItem() {
        return (StandbyWatchFaceItem) this.standbyWatchFaceItem$delegate.getValue();
    }

    @aa1
    public final StockMarketItem getStockMarketItem() {
        return (StockMarketItem) this.stockMarketItem$delegate.getValue();
    }

    @aa1
    public final SyncContactItem getSyncContactItem() {
        return (SyncContactItem) this.syncContactItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getTempMonitoringItem() {
        return (BaseDeviceItem) this.tempMonitoringItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getTimeFormatItem() {
        return (BaseDeviceItem) this.timeFormatItem$delegate.getValue();
    }

    @aa1
    public final TouchSetItem getTouchSetItem() {
        return (TouchSetItem) this.touchSetItem$delegate.getValue();
    }

    @aa1
    public final UnpairItem getUnpairItem() {
        return (UnpairItem) this.unpairItem$delegate.getValue();
    }

    @aa1
    public final AuraVideoUseHelpItem getVideoUseHelpItem() {
        return (AuraVideoUseHelpItem) this.videoUseHelpItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getVoiceControl() {
        return (BaseDeviceItem) this.voiceControl$delegate.getValue();
    }

    @aa1
    public final VoiceItem getVoiceItem() {
        return (VoiceItem) this.voiceItem$delegate.getValue();
    }

    @aa1
    public final WashItem getWashItem() {
        return (WashItem) this.washItem$delegate.getValue();
    }

    @aa1
    public final WatchPasswordItem getWatchPasswordItem() {
        return (WatchPasswordItem) this.watchPasswordItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getWearWayItem() {
        return (BaseDeviceItem) this.wearWayItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getWechatPaySetItem() {
        return (BaseDeviceItem) this.wechatPaySetItem$delegate.getValue();
    }

    @aa1
    public final BaseDeviceItem getWechatVerificationItem() {
        return (BaseDeviceItem) this.wechatVerificationItem$delegate.getValue();
    }

    @aa1
    public final WorldClockItem getWorldClockItem() {
        return (WorldClockItem) this.worldClockItem$delegate.getValue();
    }

    @aa1
    public final XmlyAudioItem getXmlyAudioItem() {
        return (XmlyAudioItem) this.xmlyAudioItem$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getRecyclerView().setItemViewCacheSize(200);
        getRecyclerView().setItemAnimator(null);
        a01 a01Var = a01.OXO1;
        if (a01Var.XO0O10().getBoolean(b01.iXiX011, false)) {
            a01Var.XO0O10().put(b01.iXiX011, false);
            if (!BleConnector.INSTANCE.isBound()) {
                toAddDevice$default(this, null, null, 3, null);
            }
        }
        checkAppAvailable();
    }

    public final boolean isBindDevice() {
        return this.isBindDevice;
    }

    @aa1
    public List<DslAdapterItem> isM100Items() {
        return CollectionsKt__CollectionsKt.Ii1iii0(getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getGestureWakeItem(), getGestureWake2Item(), getBackLightItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem());
    }

    public final boolean isScanQrcode() {
        return this.isScanQrcode;
    }

    public int layoutId() {
        return R.layout.fragment_rv;
    }

    public final void multiChoiceIncomingCallRing() {
        if (this.mMultiRingVibrationPopup == null) {
            jv0 jv0Var = new jv0(getMActivity(), R.array.ring_vibration);
            jv0Var.O1O(R.string.incoming_call_ring_vibration);
            jv0Var.iOO1ii1(new Function1() { // from class: com.android.mltcode.paycertificationapi.i01X111i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.multiChoiceIncomingCallRing$lambda$0$0(this.f7310IO, (Set) obj));
                }
            });
            this.mMultiRingVibrationPopup = jv0Var;
        }
        jv0 jv0Var2 = this.mMultiRingVibrationPopup;
        if (jv0Var2 != null) {
            BleRingVibrationSettings bleRingVibrationSettings = (BleRingVibrationSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RING_VIBRATION_SET, BleRingVibrationSettings.class, null, null, 12, null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (bleRingVibrationSettings.getMVibration() == 1) {
                linkedHashSet.add(0);
            }
            if (bleRingVibrationSettings.getMRing() == 1) {
                linkedHashSet.add(1);
            }
            jv0Var2.IXXOO(linkedHashSet);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            jv0Var2.I1XOi1(rootView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IllegalAccessException, InstantiationException {
        super.onActivityResult(i, i2, intent);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("device -> onActivityResult: " + i2 + ", " + i);
        if (i == 7 || (i == 2 && i2 == 0)) {
            this.isTipAppGuideActivity = i2 != -1;
            if (i72.OXO1.Ii0i()) {
                q62.OXO1.iI1XiXiII(getMActivity());
                return;
            }
        }
        if (i2 == -1) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (i72.OXO1.Ii0i()) {
                        q62.OXO1.iI1XiXiII(getMActivity());
                        return;
                    } else {
                        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iIX0iX
                            @Override // java.lang.Runnable
                            public final void run() {
                                DeviceFragment.onActivityResult$lambda$0(this.f7897IO);
                            }
                        }, 200L);
                        return;
                    }
                }
                if (i == 5) {
                    showPairTypePop();
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            this.isBindDevice = false;
            i1o0oxo1o.OXO1("device -> onActivityResult: onCodePairChange");
            onCodePairChange(new Object());
        }
    }

    @sf5(tag = I01XX0.XXO)
    public final void onCodePairChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onCodePairChange isScanQrcode=" + this.isScanQrcode);
        this.isScanQrcode = false;
        if (!i72.OXO1.I0iOXO()) {
            if (this.mBindDeviceRemindPopup == null) {
                go0 go0Var = new go0(getMActivity(), 0, 2, null);
                go0Var.O1O(R.string.use_reminder);
                go0Var.m1865iX(Integer.valueOf(R.string.android_bind_remind));
                go0Var.I0iXXO(false);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XO000OXI
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(DeviceFragment.onCodePairChange$lambda$0$0(this.f4646IO));
                    }
                });
                this.mBindDeviceRemindPopup = go0Var;
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IX00I
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceFragment.onCodePairChange$lambda$1(this.f1929IO);
                }
            }, 2000L);
        } else if (this.isTipAppGuideActivity) {
            LogUtils.m11130i("BaseAppGuideActivity toForResult 2");
            if (AppGuideActivity.Companion.XIi00iiXO()) {
                FragmentActivity activity = getActivity();
                Intrinsics.XXI(activity);
                Intent intent = new Intent(activity, (Class<?>) AppGuideActivity.class);
                intent.setFlags(603979776);
                startActivityForResult(intent, 2);
            }
        } else {
            this.isTipAppGuideActivity = true;
        }
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.DeviceFragment.onCodePairChange.3
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        });
        DeviceInfoChecker.OXO1.m38093I1();
        updatePairState$default(this, false, 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        showList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        i1O0OXO1O.OXO1.OXO1("test onMultiWindowModeChanged " + z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.lastClickTime = 0L;
    }

    @sf5(tag = I01XX0.XX1Oi)
    public final void onRebind(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        toAddDevice$default(this, null, null, 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.lastClickTime = 0L;
        if (this.isBindDevice) {
            this.isBindDevice = false;
            updatePairState$default(this, false, 1, null);
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void scanQrcode() throws IOException {
        ta2.OXO1.m3094IO(getMActivity(), false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1OX1XI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.scanQrcode$lambda$0(this.f7635IO, (String) obj);
            }
        });
    }

    public final void setBindDevice(boolean z) {
        this.isBindDevice = z;
    }

    public final void setMAGpsPopup(@tb1 c72 c72Var) {
        this.mAGpsPopup = c72Var;
    }

    public final void setMConfirmPopup(@tb1 ml1 ml1Var) {
        this.mConfirmPopup = ml1Var;
    }

    public final void setMOTAMessagePopup(@tb1 go0 go0Var) {
        this.mOTAMessagePopup = go0Var;
    }

    public final void setMSelectPairPopup(@tb1 m04 m04Var) {
        this.mSelectPairPopup = m04Var;
    }

    public final void setMServerLanguageList(@tb1 ExtraPackageData[] extraPackageDataArr) {
        this.mServerLanguageList = extraPackageDataArr;
    }

    public void setMUnbindPopup(@tb1 go0 go0Var) {
        this.mUnbindPopup = go0Var;
    }

    public final void setScanQrcode(boolean z) {
        this.isScanQrcode = z;
    }

    @sf5(tag = I01XX0.O0O)
    public final void showDeviceUnbindPopup(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("showDeviceUnbindPopup");
        go0 go0Var = new go0(getMActivity(), 0, 2, null);
        go0Var.I0iXXO(false);
        go0Var.O1O(R.string.device_unbind_tip);
        go0.X11iII1O1(go0Var, null, null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1O0Iii
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceFragment.showDeviceUnbindPopup$lambda$0$0());
            }
        });
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    public final void showList() {
        List<DslAdapterItem> listIsM100Items;
        q62 q62Var = q62.OXO1;
        if (q62Var.X0100I()) {
            listIsM100Items = getRingItems();
        } else if (q62Var.I0i1OXiI()) {
            listIsM100Items = getBCItems();
        } else if (q62Var.XI1OX0IO()) {
            listIsM100Items = getScreenlessBraceletItems();
        } else {
            listIsM100Items = q62Var.IIO11() ? isM100Items() : getItems();
        }
        this.showList = listIsM100Items;
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.i0IXiOXOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFragment.showList$lambda$0(this.f7371IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public void showPairTypePop() {
        if (!PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii00I10O0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceFragment.showPairTypePop$lambda$0(this.f2157IO, ((Boolean) obj).booleanValue());
                }
            }, 2, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            hr1 hr1Var = hr1.OXO1;
            if (!hr1Var.i11I(getMActivity())) {
                hr1Var.m1930OX(getMActivity(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOXO00Ii
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceFragment.showPairTypePop$lambda$1(this.f4825IO, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            try {
                X1OOO.XiOIO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 5, 0, 4, null);
                return;
            } catch (Exception e) {
                ToastUtils.showLong("Please turn on bluetooth", new Object[0]);
                i1O0OXO1O.OXO1.XIi00iiXO("requestEnableBluetooth -> " + e.getMessage());
                return;
            }
        }
        if (!UtilsKt.m38846X1()) {
            startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
            return;
        }
        if (this.mSelectPairPopup == null) {
            final m04 m04Var = new m04(getMActivity());
            m04Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1IOXIXX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DeviceFragment.showPairTypePop$lambda$2$0(this.f2709IO, m04Var);
                }
            });
            m04Var.m2587iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XXIIiO0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DeviceFragment.showPairTypePop$lambda$2$1(this.f1462IO);
                }
            });
            this.mSelectPairPopup = m04Var;
        }
        m04 m04Var2 = this.mSelectPairPopup;
        if (m04Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            m04Var2.I1XOi1(rootView);
        }
    }

    public final void singleChoiceIncomingCallRing() {
        if (this.mRingVibrationPopup == null) {
            dj4 dj4Var = new dj4(getMActivity(), R.array.ring_vibration_s, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.incoming_call_ring_vibration);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.i1iI1I1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceFragment.singleChoiceIncomingCallRing$lambda$0$0(this.f7718IO, ((Integer) obj).intValue()));
                }
            });
            this.mRingVibrationPopup = dj4Var;
        }
        dj4 dj4Var2 = this.mRingVibrationPopup;
        if (dj4Var2 != null) {
            BleRingVibrationSettings bleRingVibrationSettings = (BleRingVibrationSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RING_VIBRATION_SET, BleRingVibrationSettings.class, null, null, 12, null);
            int i = 1;
            if (bleRingVibrationSettings.getMVibration() == 1 && bleRingVibrationSettings.getMRing() == 1) {
                i = 3;
            } else if (bleRingVibrationSettings.getMVibration() == 1 && bleRingVibrationSettings.getMRing() == 0) {
                i = 2;
            } else if (bleRingVibrationSettings.getMVibration() != 0 || bleRingVibrationSettings.getMRing() != 1) {
                i = 0;
            }
            dj4Var2.II1Xi0(i);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void toAddDevice(@tb1 String str, @aa1 String mac) {
        Intrinsics.X0O(mac, "mac");
        if (!TextUtils.isEmpty(mac)) {
            this.isScanQrcode = true;
            conntectDevice(str, mac);
            return;
        }
        this.isScanQrcode = false;
        this.isBindDevice = true;
        FragmentActivity activity = getActivity();
        Intrinsics.XXI(activity);
        startActivityForResult(new Intent(activity, (Class<?>) AddDeviceActivity.class), 1);
    }

    public void twoPopup(boolean z) {
        go0 go0Var = this.mOTAMessagePopup;
        if (go0Var == null || go0Var == null || !go0Var.isShowing()) {
            DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, new I0iXXO(z, this), null, 2, null);
        }
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void updatePairState(boolean z) {
        i1O0OXO1O.OXO1.OXO1("updatePairState " + z);
        showList();
        this.mBacklightPopup = null;
    }

    public void whenUnbind() {
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
    }
}
