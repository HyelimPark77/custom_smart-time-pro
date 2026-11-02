package com.sma.smartv3.initializer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telecom.TelecomManager;
import android.telephony.PhoneStateListener;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I0010I0i;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0XIIX;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.I0ii0iI;
import com.android.mltcode.paycertificationapi.IIXiOii;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.IOXIii0;
import com.android.mltcode.paycertificationapi.IOXXI1;
import com.android.mltcode.paycertificationapi.IOiOXiX1I;
import com.android.mltcode.paycertificationapi.IXOi0OX;
import com.android.mltcode.paycertificationapi.IXXIIXO1;
import com.android.mltcode.paycertificationapi.IXXii;
import com.android.mltcode.paycertificationapi.Ii1XiOX1;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.Iii0IiX0X;
import com.android.mltcode.paycertificationapi.O00IO0i;
import com.android.mltcode.paycertificationapi.O0IOOIX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1IX0;
import com.android.mltcode.paycertificationapi.OI1i0i0X;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.OO1O;
import com.android.mltcode.paycertificationapi.OOOIOi0O;
import com.android.mltcode.paycertificationapi.OOOOO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.OX1XXi;
import com.android.mltcode.paycertificationapi.OXIiX1OO;
import com.android.mltcode.paycertificationapi.OXX1OO1I;
import com.android.mltcode.paycertificationapi.OXiiIX0i;
import com.android.mltcode.paycertificationapi.OiXO1XOO0;
import com.android.mltcode.paycertificationapi.X01X0;
import com.android.mltcode.paycertificationapi.X0IIII0OI;
import com.android.mltcode.paycertificationapi.X1i10iX;
import com.android.mltcode.paycertificationapi.X1i1X1ii;
import com.android.mltcode.paycertificationapi.XIiIi;
import com.android.mltcode.paycertificationapi.XO0I0O;
import com.android.mltcode.paycertificationapi.XOIIOO;
import com.android.mltcode.paycertificationapi.XOIXO1IO1;
import com.android.mltcode.paycertificationapi.XOOXI0IX;
import com.android.mltcode.paycertificationapi.XOXO0X00I;
import com.android.mltcode.paycertificationapi.XX1X0;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.Xi1i0II0I;
import com.android.mltcode.paycertificationapi.Xi1iI10;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i01OIIi11;
import com.android.mltcode.paycertificationapi.i111I0100;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1O1XIOIi;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI0OiO;
import com.android.mltcode.paycertificationapi.iI10I11;
import com.android.mltcode.paycertificationapi.iO1IOX1O1;
import com.android.mltcode.paycertificationapi.iOXOiI;
import com.android.mltcode.paycertificationapi.iXI01X;
import com.android.mltcode.paycertificationapi.iXIiOiIOi;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.ov0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.s5;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.bestmafen.baseble.scanner.ScanMode;
import com.bestmafen.baseble.util.LogLevel;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.dcs.DcsToken;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.biz.voice.ai.WebSocketManager;
import com.sma.smartv3.biz.wa.WAManager;
import com.sma.smartv3.biz.wx.WxManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.AlipayBindInfoDao;
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.DailyPowerDao;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.dao.HanBaoVibrationDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.MatchRecordDao;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.RespiratoryRateDao;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.dao.VitalityDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.AlipayBindInfo;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.DailyPower;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.db.entity.HanBaoVibration;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.MatchPeriod;
import com.sma.smartv3.db.entity.MatchRecord;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.RespiratoryRate;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.Vitality;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.db.entity.WorkoutIndex;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.network.CyWeeRemark;
import com.sma.smartv3.network.DataBody;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.UploadServiceRequestBody;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.util.OffLineMapManagerKt;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.component.BleHandleCallback;
import com.szabh.smable3.entity.BleAICoachBeforePlan;
import com.szabh.smable3.entity.BleAICoachBeforePlanV2;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import com.szabh.smable3.entity.BleAICoachGeneratePlanV2;
import com.szabh.smable3.entity.BleAICommand;
import com.szabh.smable3.entity.BleActivity;
import com.szabh.smable3.entity.BleActivityDetail;
import com.szabh.smable3.entity.BleAddressBook;
import com.szabh.smable3.entity.BleAgpsPrerequisite;
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
import com.szabh.smable3.entity.BleNotification;
import com.szabh.smable3.entity.BleNotification2;
import com.szabh.smable3.entity.BleNotificationSettings;
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
import com.szabh.smable3.entity.BleSMSQuickReplyContent;
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
import com.szabh.smable3.entity.BleTime;
import com.szabh.smable3.entity.BleTimeZone;
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
import com.szabh.smable3.entity.Languages;
import com.szabh.smable3.entity.MusicCommand;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,2521:1\n1374#2:2522\n1460#2,5:2523\n1869#2,2:2529\n1563#2:2540\n1634#2,3:2541\n1#3:2528\n15#4:2531\n11#4,2:2532\n27#4,2:2534\n27#4,2:2536\n27#4,2:2538\n15#4:2544\n15#4:2545\n18#4,2:2546\n15#4:2548\n11#4,2:2549\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer\n*L\n1058#1:2522\n1058#1:2523,5\n1063#1:2529,2\n1983#1:2540\n1983#1:2541,3\n1125#1:2531\n1144#1:2532,2\n1579#1:2534,2\n1608#1:2536,2\n1612#1:2538,2\n2251#1:2544\n2270#1:2545\n2338#1:2546,2\n2338#1:2548\n2278#1:2549,2\n*E\n"})
public final class BleInitializer implements s5, BleHandleCallback {

    @aa1
    public static final String I1 = "BleInitializer";

    @aa1
    public static final BleInitializer IO = null;
    public static boolean IO0II0i = false;
    public static boolean IO0iXO0O = false;

    @tb1
    public static MediaPlayer IX0IXOi = null;

    @aa1
    public static final long[] IX1XiI = null;
    public static boolean IXI = false;
    public static long IXOIIIO = 0;
    public static boolean Ii0X0X = false;
    public static boolean Ii0i = false;

    @aa1
    public static final Lazy Ii1iii0 = null;
    public static int IiiXiI0I = 0;

    @aa1
    public static final Lazy O001I = null;

    @aa1
    public static final Lazy O0O = null;
    public static final Uri O0O0X0iOi = null;

    @aa1
    public static final Lazy OO = null;

    @aa1
    public static final Lazy OX110i = null;
    public static int Oi = 0;
    public static long X00O0 = 0;

    @aa1
    public static final Lazy X00XIX1 = null;
    public static boolean X00Xi1X = false;

    @aa1
    public static final Lazy X0i1O = null;
    public static long X0iO = 0;
    public static boolean X1 = false;

    @aa1
    public static final Lazy X100O = null;

    @aa1
    public static final Lazy X11I = null;

    @aa1
    public static final Lazy X11iII1O1 = null;

    @aa1
    public static final Lazy X1IX = null;
    public static boolean XO0X10iO = false;
    public static boolean XOIX = false;
    public static long XOO0XOOii = 0;

    @aa1
    public static final Lazy XOX0O0 = null;

    @tb1
    public static BleNotification XOXiX0 = null;

    @aa1
    public static final XIi00iiXO XX00i10X = null;

    @aa1
    public static final Lazy XX1Oi = null;

    @aa1
    public static final Lazy XXO = null;

    @aa1
    public static final Lazy XXX11i = null;
    public static boolean XXiIiX10 = false;

    @aa1
    public static final Lazy XXiO0i = null;

    @tb1
    public static ms Xi1i0XOX0 = null;

    @tb1
    public static File Xii11I = null;

    @aa1
    public static final Lazy i0X000X0O = null;

    @aa1
    public static final Handler i11I = null;

    @aa1
    public static final Lazy iIXi1iiXI = null;

    @aa1
    public static final iO iOI = null;

    @aa1
    public static final Lazy iOiXi11II = null;
    public static final int iX1O1 = 140;

    @aa1
    public static final Lazy iXi = null;

    @aa1
    public static final Lazy iXiX011 = null;

    @aa1
    public static final Lazy iXiiiO = null;
    public static double iiIOiX;

    @tb1
    public static ms iii0;

    @aa1
    public static final Lazy iiiO = null;

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodGlucose$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodGlucose$1\n*L\n1900#1:2522\n1900#1:2523,3\n*E\n"})
    public static final class I0IIOi extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleBloodGlucose> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I0IIOi(List<BleBloodGlucose> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodGlucoseDao r0 = BleInitializer.X1IX(BleInitializer.IO);
            List<BleBloodGlucose> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            BloodGlucose r8 = new BloodGlucose((BleBloodGlucose) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.X1ii, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadDailyPower$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadDailyPower$1\n*L\n2398#1:2522\n2398#1:2523,3\n*E\n"})
    public static final class I0iXXO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BlePhysicalPower> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I0iXXO(List<BlePhysicalPower> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            DailyPowerDao r0 = BleInitializer.iXiX011(BleInitializer.IO);
            List<BlePhysicalPower> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            DailyPower r8 = new DailyPower((BlePhysicalPower) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.X0I1, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadVitalityValue$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadVitalityValue$1\n*L\n2483#1:2522\n2483#1:2523,3\n*E\n"})
    public static final class I1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleVitality> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I1(List<BleVitality> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            VitalityDao r0 = BleInitializer.X00XIX1(BleInitializer.IO);
            List<BleVitality> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Vitality r8 = new Vitality((BleVitality) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.i1O11001, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadLocation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadLocation$1\n*L\n813#1:2522\n813#1:2523,3\n*E\n"})
    public static final class I1XOi1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleLocation> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I1XOi1(List<BleLocation> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            LocationDao r0 = BleInitializer.X11I(BleInitializer.IO);
            List<BleLocation> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Location r8 = new Location((BleLocation) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.OIX0iXi, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n*L\n1692#1:2522\n1692#1:2523,3\n*E\n"})
    public static final class II1Xi0 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleWorkout3> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public II1Xi0(List<BleWorkout3> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        private static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            BleInitializer.i11I(BleInitializer.IO).insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao r1 = BleInitializer.i0X000X0O(BleInitializer.IO);
            List<BleWorkout3> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L9;
            Workout r9 = new Workout((BleWorkout3) r4.next(), r3);
            r5.setTime(r9.getMStart());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            BleCache r10 = BleCache.INSTANCE;
            if (r10.getMBleName().length() <= 0) goto L8;
            r9.setMFirmwareFlag(r10.getMFirmwareFlag());
            r9.setMPrototype(r10.getMPrototype());
            r9.setMBleName(r10.getMBleName());
            r9.setMPlatform(r10.getMPlatform());
            r9.setMAGpsType(r10.getMAGpsType());
        L8:
            int r15 = r9.getMMode();
            final WorkoutIndex r11 = new WorkoutIndex(0, 2, r9.getMEnd(), r15, 0, 17, null);
            Application r12 = Utils.getApp();
            Intrinsics.O10IXXX0X(r12, "getApp(...)");
            XXI0Xi.XOO0ii0(r12, r11, new I0ii0iI(r11));
            r7.add(r9);
            goto L4
        L9:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord$1\n*L\n1749#1:2522\n1749#1:2523,3\n*E\n"})
    public static final class IIX1OXO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleMatchRecord> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public IIX1OXO(List<BleMatchRecord> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao r0 = BleInitializer.X100O(BleInitializer.IO);
            List<BleMatchRecord> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            MatchRecord r8 = new MatchRecord((BleMatchRecord) r3.next(), r2);
            r4.setTime(r8.getMStart());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n*L\n2155#1:2522,3\n*E\n"})
    public static final class IXXOO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ Calendar I1;
        public final /* synthetic */ List<BleGSensorSHSY> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public IXXOO(List<BleGSensorSHSY> r1, Calendar r2, SimpleDateFormat r3, SimpleDateFormat r4) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
            this.X11iII1O1 = r4;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            String r2 = "%+.8f";
            List<BleGSensorSHSY> r5 = this.IO;     // Catch: Exception -> L9
            Calendar r6 = this.I1;     // Catch: Exception -> L9
            SimpleDateFormat r7 = this.iX1O1;     // Catch: Exception -> L9
            SimpleDateFormat r8 = this.X11iII1O1;     // Catch: Exception -> L9
            Iterator r9 = r5.iterator();     // Catch: Exception -> L9
            int r10 = 0;
        L4:
            if (r9.hasNext() == false) goto L28;
            Object r11 = r9.next();     // Catch: Exception -> L9
            int r12 = r10 + 1;     // Catch: Exception -> L9
            if (r10 >= 0) goto L11;
            CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L9
        L11:
            BleGSensorSHSY r13 = (BleGSensorSHSY) r11;     // Catch: Exception -> L9
            long r14 = r6.getTimeInMillis() + r13.getMTime();     // Catch: Exception -> L9
            if (r10 != 0) goto L16;
            BleInitializer r15 = BleInitializer.IO;     // Catch: Exception -> L9
            if (r15.XXiO0i() != 0) goto L16;
            r15.I00(r14);     // Catch: Exception -> L9
        L16:
            File r16 = uz0.X0i1O(sz0.OXO1);     // Catch: Exception -> L9
            String r17 = r7.format(Long.valueOf(BleInitializer.IO.XXiO0i()));     // Catch: Exception -> L9
            String r1 = BleCache.INSTANCE.getMBleAddress();     // Catch: Exception -> L9
            Iterator r18 = r9;
            StringBuilder r19 = new StringBuilder();     // Catch: Exception -> L9
            Calendar r110 = r6;
            r19.append("gSensorSHSYs_");     // Catch: Exception -> L9
            r19.append(r17);     // Catch: Exception -> L9
            r19.append(IiXI1X1OO.O00);     // Catch: Exception -> L9
            r19.append(r1);     // Catch: Exception -> L9
            r19.append(".csv");     // Catch: Exception -> L9
            File r111 = new File(r16, r19.toString());     // Catch: Exception -> L9
            if (FileUtils.isFileExists(r111) == true) goto L20;
            FileUtils.createOrExistsFile(r111);     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r111, "Timestamp,X,Y,Z,label,sleepParticularCase,steps,hr\n", false);     // Catch: Exception -> L9
        L20:
            String r3 = r8.format(new Date(r14));     // Catch: Exception -> L9
            String r20 = String.format(r2, Arrays.copyOf(new Object[]{Float.valueOf(r13.getMX() / 1024.0f)}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r20, "format(...)");     // Catch: Exception -> L9
            String r112 = String.format(r2, Arrays.copyOf(new Object[]{Float.valueOf(r13.getMY() / 1024.0f)}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r112, "format(...)");     // Catch: Exception -> L9
            String r21 = String.format(r2, Arrays.copyOf(new Object[]{Float.valueOf(r13.getMZ() / 1024.0f)}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r21, "format(...)");     // Catch: Exception -> L9
            String r22 = q62.OXO1.i01OOiI(r13.getMActivityMode());     // Catch: Exception -> L9
            String r113 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r13.getMSleepParticularCase())}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r113, "format(...)");     // Catch: Exception -> L9
            String r23 = r2;
            String r4 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r13.getMStep())}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r4, "format(...)");     // Catch: Exception -> L9
            String r114 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r13.getMHr())}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r114, "format(...)");     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r111, r3 + I000IiI1O.iO.XO0O10 + r20 + I000IiI1O.iO.XO0O10 + r112 + I000IiI1O.iO.XO0O10 + r21 + I000IiI1O.iO.XO0O10 + r22 + I000IiI1O.iO.XO0O10 + r113 + I000IiI1O.iO.XO0O10 + r4 + I000IiI1O.iO.XO0O10 + r114 + "\n", true);     // Catch: Exception -> L9
            r10 = r12;
            r9 = r18;
            r6 = r110;
            r2 = r23;
            goto L4
        L28:
            return null;
        L9:
            e = move-exception;
            e.printStackTrace();
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n*L\n2021#1:2522\n2021#1:2523,3\n*E\n"})
    public static final class IiI10X extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleAlipayBindInfo> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public IiI10X(List<BleAlipayBindInfo> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            AlipayBindInfoDao r1 = BleInitializer.XXX11i(BleInitializer.IO);
            List<BleAlipayBindInfo> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L6;
            AlipayBindInfo r9 = new AlipayBindInfo((BleAlipayBindInfo) r4.next(), r3);
            r5.setTime(r9.getMTime());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            BleCache r11 = BleCache.INSTANCE;
            r9.setMBleName(r11.getMBleName());
            r9.setMFirmwareFlag(r11.getMFirmwareFlag());
            r9.setMFirmwareVersion(BaseBleCache.getString$default(r11, BleKey.FIRMWARE_VERSION, "0.0.0", null, 4, null));
            r9.setMMacAddress(oe5.IXO0OOi(r11.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
            String r10 = AppUtils.getAppVersionName();
            Intrinsics.O10IXXX0X(r10, "getAppVersionName(...)");
            r9.setMAppVersion(r10);
            r7.add(r9);
            goto L4
        L6:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.O10IXXX0X, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadActivity$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadActivity$1\n*L\n619#1:2522\n619#1:2523,3\n*E\n"})
    public static final class O00 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleActivity> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O00(List<BleActivity> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            BleInitializer.i11I(BleInitializer.IO).insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            ActivityDao r1 = BleInitializer.X11iII1O1(BleInitializer.IO);
            List<BleActivity> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L11;
            Activity r9 = new Activity((BleActivity) r4.next(), r3);
            r5.setTime(r9.getMTime());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            if (q62.OXO1.iiiOOX10() == true) goto L10;
            if (r9.getMState() != 4) goto L10;
            int r16 = r9.getMMode();
            final WorkoutIndex r11 = new WorkoutIndex(0, 1, r9.getMTime(), r16, 0, 17, null);
            Application r10 = Utils.getApp();
            Intrinsics.O10IXXX0X(r10, "getApp(...)");
            XXI0Xi.XOO0ii0(r10, r11, new Iii0IiX0X(r11));
        L10:
            r7.add(r9);
            goto L4
        L11:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.OXO1, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHanBaoVibration$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHanBaoVibration$1\n*L\n2373#1:2522\n2373#1:2523,3\n*E\n"})
    public static final class O10IXXX0X extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleHanBaoVibration> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O10IXXX0X(List<BleHanBaoVibration> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HanBaoVibrationDao r0 = BleInitializer.iXiiiO(BleInitializer.IO);
            List<BleHanBaoVibration> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            HanBaoVibration r8 = new HanBaoVibration((BleHanBaoVibration) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateBloodPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateBloodPressure$1\n*L\n1872#1:2522\n1872#1:2523,3\n*E\n"})
    public static final class O1O extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ BleBloodPressure IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O1O(BleBloodPressure r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodPressureDao r0 = BleInitializer.iIXi1iiXI(BleInitializer.IO);
            List r1 = CollectionsKt__CollectionsKt.Ii1iii0(new BleBloodPressure[]{this.IO});
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            BloodPressure r8 = new BloodPressure((BleBloodPressure) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iO, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n1869#2:2524\n1563#2:2525\n1634#2,3:2526\n1870#2:2529\n1563#2:2530\n1634#2,3:2531\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n*L\n699#1:2522,2\n712#1:2524\n721#1:2525\n721#1:2526,3\n712#1:2529\n730#1:2530\n730#1:2531,3\n*E\n"})
    public static final class OII extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleSleep> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ int XXX11i;
        public final /* synthetic */ Date iX1O1;

        public OII(List<BleSleep> r1, long r2, Date r4, SimpleDateFormat r5, int r6) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
            this.XXX11i = r6;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            Iterator<T> r0 = this.IO.iterator();
        L4:
            if (r0.hasNext() == false) goto L6;
            BleSleep r2 = (BleSleep) r0.next();
            i1O0OXO1O.OXO1.OXO1("onReadSleep -> " + r2);
            goto L4
        L6:
            q62 r1 = q62.OXO1;
            String r4 = "format(...)";
            if (r1.ii110() == false) goto L9;
        L34:
            String r3 = O0X11OiO.OIX0iXi().format(new Date()) + ".json";     // Catch: Exception -> L18
            i1O0OXO1O.OXO1.OXO1(r3);     // Catch: Exception -> L18
            File r5 = uz0.XO0O10(sz0.OXO1, r3);     // Catch: Exception -> L18
            String r6 = new Gson().toJson(this.IO);     // Catch: Exception -> L18
            Intrinsics.O10IXXX0X(r6, "toJson(...)");     // Catch: Exception -> L18
            iI0OiO.IO(r5, r6, null, 2, null);     // Catch: Exception -> L18
        L20:
            List<List<BleSleep>> r7 = BleSleep.Companion.getSleepAllDaySegments(this.IO);
            long r8 = this.I1;
            Date r9 = this.iX1O1;
            SimpleDateFormat r10 = this.X11iII1O1;
            int r11 = this.XXX11i;
            Iterator<T> r12 = r7.iterator();
        L22:
            if (r12.hasNext() == false) goto L32;
            List r13 = (List) r12.next();
            if (r13.size() <= 1) goto L27;
            BleInitializer.XOX0O0(BleInitializer.IO).deleteSleeps(((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r13)).getMLocalTime(), ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r13)).getMLocalTime());
        L27:
            SleepDao r14 = BleInitializer.XOX0O0(BleInitializer.IO);
            List r15 = r13;
            ArrayList r16 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r15, 10));
            Iterator r17 = r15.iterator();
        L29:
            if (r17.hasNext() == false) goto L31;
            Sleep r18 = new Sleep((BleSleep) r17.next(), r8);
            r9.setTime(r18.getMTime());
            String r19 = r10.format(r9);
            Intrinsics.O10IXXX0X(r19, r4);
            r18.setMLocalTime(r19);
            r18.setMAlgorithmType(r11);
            r16.add(r18);
            goto L29
        L31:
            r14.insert(r16);
            r4 = r4;
        L32:
            I01XX0.XIi00iiXO(I01XX0.XO0O10, null, 2, null);
            return null;
        L18:
            e = move-exception;
            e.printStackTrace();
            goto L20
        L9:
            if (r1.iXiii() == true) goto L34;
            SleepDao r20 = BleInitializer.XOX0O0(BleInitializer.IO);
            List<BleSleep> r21 = this.IO;
            long r22 = this.I1;
            Date r23 = this.iX1O1;
            SimpleDateFormat r110 = this.X11iII1O1;
            int r111 = this.XXX11i;
            ArrayList r112 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r21, 10));
            Iterator<T> r24 = r21.iterator();
        L13:
            if (r24.hasNext() == false) goto L15;
            Sleep r113 = new Sleep((BleSleep) r24.next(), r22);
            r23.setTime(r113.getMTime());
            String r25 = r110.format(r23);
            Intrinsics.O10IXXX0X(r25, "format(...)");
            r113.setMLocalTime(r25);
            r113.setMAlgorithmType(r111);
            r112.add(r113);
            goto L13
        L15:
            r20.insert(r112);
            goto L32
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodPressure$1\n*L\n676#1:2522\n676#1:2523,3\n*E\n"})
    public static final class OIX0iXi extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleBloodPressure> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OIX0iXi(List<BleBloodPressure> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodPressureDao r0 = BleInitializer.iIXi1iiXI(BleInitializer.IO);
            List<BleBloodPressure> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            BloodPressure r8 = new BloodPressure((BleBloodPressure) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iO, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodOxygen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodOxygen$1\n*L\n859#1:2522\n859#1:2523,3\n*E\n"})
    public static final class OIi0 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleBloodOxygen> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OIi0(List<BleBloodOxygen> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodOxygenDao r0 = BleInitializer.X0i1O(BleInitializer.IO);
            List<BleBloodOxygen> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            BloodOxygen r8 = new BloodOxygen((BleBloodOxygen) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.I0IIOi, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadTemperature$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadTemperature$1\n*L\n836#1:2522\n836#1:2523,3\n*E\n"})
    public static final class OX extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleTemperature> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OX(List<BleTemperature> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            TemperatureDao r0 = BleInitializer.iOiXi11II(BleInitializer.IO);
            List<BleTemperature> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Temperature r8 = new Temperature((BleTemperature) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.XOO0ii0, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ LogLevel I1;
        public final /* synthetic */ String IO;

        public OXO1(String r1, LogLevel r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            int r2 = 0;
            if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false) == true) goto L5;
            return null;
        L5:
            Date r0 = new Date();
            String r3 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(r0) + ".txt";
            String r1 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(r0);
            int r4 = (int) Math.ceil(((double) this.IO.length()) / ((double) 140));
            String r5 = this.IO;
            LogLevel r7 = this.I1;
        L6:
            if (r2 >= r4) goto L12;
            if (r2 != (r4 - 1)) goto L10;
            String r8 = r5.substring(r2 * 140, r5.length());
            Intrinsics.O10IXXX0X(r8, "substring(...)");
        L11:
            iI0OiO.IO(uz0.OXO1(sz0.OXO1, r3), r1 + " " + r7 + " " + r8 + "\n", null, 2, null);
            r2 = r2 + 1;
            goto L6
        L10:
            r8 = r5.substring(r2 * 140, (r2 + 1) * 140);
            Intrinsics.O10IXXX0X(r8, "substring(...)");
            goto L11
        L12:
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRespiratoryRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRespiratoryRate$1\n*L\n2505#1:2522\n2505#1:2523,3\n*E\n"})
    public static final class OiIIX101O extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleRespiratoryRate> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OiIIX101O(List<BleRespiratoryRate> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            RespiratoryRateDao r0 = BleInitializer.OO(BleInitializer.IO);
            List<BleRespiratoryRate> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            RespiratoryRate r8 = new RespiratoryRate((BleRespiratoryRate) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.I11X11OX, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout2$1\n*L\n1636#1:2522\n1636#1:2523,3\n*E\n"})
    public static final class X01IiOiIi extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleWorkout2> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X01IiOiIi(List<BleWorkout2> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        private static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            BleInitializer.i11I(BleInitializer.IO).insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao r1 = BleInitializer.i0X000X0O(BleInitializer.IO);
            List<BleWorkout2> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L9;
            Workout r9 = new Workout((BleWorkout2) r4.next(), r3);
            r5.setTime(r9.getMStart());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            BleCache r10 = BleCache.INSTANCE;
            if (r10.getMBleName().length() <= 0) goto L8;
            r9.setMFirmwareFlag(r10.getMFirmwareFlag());
            r9.setMPrototype(r10.getMPrototype());
            r9.setMBleName(r10.getMBleName());
            r9.setMPlatform(r10.getMPlatform());
            r9.setMAGpsType(r10.getMAGpsType());
        L8:
            int r15 = r9.getMMode();
            final WorkoutIndex r11 = new WorkoutIndex(0, 2, r9.getMEnd(), r15, 0, 17, null);
            Application r12 = Utils.getApp();
            Intrinsics.O10IXXX0X(r12, "getApp(...)");
            XXI0Xi.XOO0ii0(r12, r11, new IXOi0OX(r11));
            r7.add(r9);
            goto L4
        L9:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHeartRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHeartRate$1\n*L\n654#1:2522\n654#1:2523,3\n*E\n"})
    public static final class X0O extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleHeartRate> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X0O(List<BleHeartRate> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HeartRateDao r0 = BleInitializer.Ii1iii0(BleInitializer.IO);
            List<BleHeartRate> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            HeartRate r8 = new HeartRate((BleHeartRate) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadEnergyRating$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadEnergyRating$1\n*L\n2421#1:2522\n2421#1:2523,3\n*E\n"})
    public static final class X1ii extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleEnergyRating> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X1ii(List<BleEnergyRating> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            EnergyRatingDao r0 = BleInitializer.XXO(BleInitializer.IO);
            List<BleEnergyRating> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            EnergyRating r8 = new EnergyRating((BleEnergyRating) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iIIIiIO0, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public static final class XIi00iiXO extends PhoneStateListener {
        public XIi00iiXO() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int r10, String r11) {
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            boolean r1 = AppUtils.isAppForeground();
            boolean r2 = ScreenUtils.isScreenLock();
            BleInitializer r3 = BleInitializer.IO;
            r0.OXO1("BleInitializer PhoneStateListener onCallStateChanged -> isAppForeground:" + r1 + " isScreenLock:" + r2 + " state=" + BleInitializer.iI(r3, r10) + ", phoneNumber=" + r11 + ", " + BleInitializer.XX1Oi());
            q62 r4 = q62.OXO1;
            if (r4.OI() == true) goto L6;
            return;
        L6:
            if (r10 == 0) goto L24;
            if (r10 == 1) goto L14;
            if (r10 != 2) goto L40;
            BleInitializer.XXiIiX10(r3, 0);
            a01.OXO1.iO().put(b01.iI, false);
            if (BleInitializer.XX1Oi() != 1) goto L13;
            BleInitializer.Ii0X0X(r3);
        L13:
            r3.OiXI1OiX0(null);
        L40:
            BleInitializer.IXI(r10);
            return;
        L14:
            a01.OXO1.iO().put(b01.iI, true);
            if (r4.i0iOi() == true) goto L17;
        L21:
            if (r11 != null) goto L23;
            r11 = "";
        L23:
            BleInitializer.X00Xi1X(r3, r11);
            goto L40
        L17:
            if (TextUtils.isEmpty(r11) == true) goto L21;
            if (r11 != null) goto L20;
            r11 = "";
        L20:
            BleInitializer.X1(r3, r11);
            goto L40
        L24:
            BleInitializer.XXiIiX10(r3, 1);
            a01.OXO1.iO().put(b01.iI, false);
            if (BleInitializer.XX1Oi() != 1) goto L37;
            if (r4.i0iOi() == true) goto L29;
        L33:
            if (r11 != null) goto L35;
            r11 = "";
        L35:
            BleInitializer.IXOIIIO(r3, r11);
        L39:
            r3.OiXI1OiX0(null);
            goto L40
        L29:
            if (TextUtils.isEmpty(r11) == true) goto L33;
            if (r11 != null) goto L32;
            r11 = "";
        L32:
            BleInitializer.IO0II0i(r3, r11);
            goto L39
        L37:
            if (BleInitializer.XX1Oi() != 2) goto L39;
            BleInitializer.Ii0X0X(r3);
            goto L39
        }
    }

    public static final class XO0O10 implements IO0OI {
        public XO0O10() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation r9) {
            Intrinsics.X0O(r9, "location");
            LogUtils.d(new Object[]{"agpsLocationClient onLocationChange longitude: " + r9.IiI10X() + ", latitude: " + r9.XO0O10() + ", altitude: " + r9.OXO1()});
            if (r9.OXO1() != Double.MIN_VALUE) goto L5;
            return;
        L5:
            BleInitializer r0 = BleInitializer.IO;
            BleInitializer.Ii0i(r0, new BleAgpsPrerequisite((float) r9.IiI10X(), (float) r9.XO0O10(), (int) r9.OXO1()));
            BleInitializer.IiiXiI0I(r0);
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String r2) {
            Intrinsics.X0O(r2, "message");
            LogUtils.d(new Object[]{"agpsLocationClient onError "});
            BleInitializer.IiiXiI0I(BleInitializer.IO);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBleHrv$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBleHrv$1\n*L\n882#1:2522\n882#1:2523,3\n*E\n"})
    public static final class XOO0ii0 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleHrv> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XOO0ii0(List<BleHrv> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HrvDao r0 = BleInitializer.iiiO(BleInitializer.IO);
            List<BleHrv> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Hrv r8 = new Hrv((BleHrv) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.OIi0, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n*L\n1101#1:2522\n1101#1:2523,3\n*E\n"})
    public static final class XX0 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BlePressure> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XX0(List<BlePressure> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            PressureDao r0 = BleInitializer.OX110i(BleInitializer.IO);
            List<BlePressure> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Pressure r8 = new Pressure((BlePressure) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.XXI, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public static final class XXI extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ List<BleEcg> IO;

        public XXI(List<BleEcg> r1) {
            this.IO = r1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BleInitializer r0 = BleInitializer.IO;
            Electrocardiogram r1 = BleInitializer.O001I(r0).getLastElectrocardiogram();
            BleInitializer.O001I(r0).insert(X01X0.iO(this.IO, r1));
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateHeartRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateHeartRate$1\n*L\n1828#1:2522\n1828#1:2523,3\n*E\n"})
    public static final class XXIIO1i11 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ BleHeartRate IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XXIIO1i11(BleHeartRate r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HeartRateDao r0 = BleInitializer.Ii1iii0(BleInitializer.IO);
            List r1 = CollectionsKt__CollectionsKt.Ii1iii0(new BleHeartRate[]{this.IO});
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            HeartRate r8 = new HeartRate((BleHeartRate) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord2$1\n*L\n1771#1:2522\n1771#1:2523,3\n*E\n"})
    public static final class XiOIO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleMatchRecord2> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XiOIO(List<BleMatchRecord2> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao r0 = BleInitializer.X100O(BleInitializer.IO);
            List<BleMatchRecord2> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            MatchRecord r8 = new MatchRecord((BleMatchRecord2) r3.next(), r2);
            r4.setTime(r8.getMStart());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n*L\n2059#1:2522,2\n*E\n"})
    public static final class XiOIii1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ Date I1;
        public final /* synthetic */ List<BleRri> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat XXX11i;
        public final /* synthetic */ long iX1O1;

        public XiOIii1(List<BleRri> r1, Date r2, long r3, SimpleDateFormat r5, SimpleDateFormat r6) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
            this.X11iII1O1 = r5;
            this.XXX11i = r6;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            List<BleRri> r1 = this.IO;     // Catch: Exception -> L9
            Date r2 = this.I1;     // Catch: Exception -> L9
            long r3 = this.iX1O1;     // Catch: Exception -> L9
            SimpleDateFormat r5 = this.X11iII1O1;     // Catch: Exception -> L9
            SimpleDateFormat r6 = this.XXX11i;     // Catch: Exception -> L9
            Iterator<T> r4 = r1.iterator();     // Catch: Exception -> L9
        L4:
            if (r4.hasNext() == false) goto L21;
            BleRri r7 = (BleRri) r4.next();     // Catch: Exception -> L9
            r2.setTime(((((long) r7.getMTime()) * 1000) - r3) + ((long) O0X11OiO.iXiX011));     // Catch: Exception -> L9
            File r8 = new File(uz0.XX1Oi(sz0.OXO1), "rri_" + r5.format(r2) + ".csv");     // Catch: Exception -> L9
            if (FileUtils.isFileExists(r8) == true) goto L11;
            FileUtils.createOrExistsFile(r8);     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r8, "timestamp,date,rri0,rri1\n", false);     // Catch: Exception -> L9
        L11:
            r2.setTime((((long) r7.getMTime()) * 1000) - r3);     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r8, r7.getMTime() + I000IiI1O.iO.XO0O10 + r6.format(r2) + I000IiI1O.iO.XO0O10 + r7.getMRRI() + I000IiI1O.iO.XO0O10 + r7.getMRRI2() + "\n", true);     // Catch: Exception -> L9
            goto L4
        L21:
            return null;
        L9:
            e = move-exception;
            e.printStackTrace();
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout4$1\n*L\n2445#1:2522\n2445#1:2523,3\n*E\n"})
    public static final class i010I extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleWorkout4> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public i010I(List<BleWorkout4> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        private static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            BleInitializer.i11I(BleInitializer.IO).insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao r1 = BleInitializer.i0X000X0O(BleInitializer.IO);
            List<BleWorkout4> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L9;
            Workout r9 = new Workout((BleWorkout4) r4.next(), r3);
            r5.setTime(r9.getMStart());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            BleCache r10 = BleCache.INSTANCE;
            if (r10.getMBleName().length() <= 0) goto L8;
            r9.setMFirmwareFlag(r10.getMFirmwareFlag());
            r9.setMPrototype(r10.getMPrototype());
            r9.setMBleName(r10.getMBleName());
            r9.setMPlatform(r10.getMPlatform());
            r9.setMAGpsType(r10.getMAGpsType());
        L8:
            int r15 = r9.getMMode();
            final WorkoutIndex r11 = new WorkoutIndex(0, 2, r9.getMEnd(), r15, 0, 17, null);
            Application r12 = Utils.getApp();
            Intrinsics.O10IXXX0X(r12, "getApp(...)");
            XXI0Xi.XOO0ii0(r12, r11, new Xi1iI10(r11));
            r7.add(r9);
            goto L4
        L9:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateTemperature$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateTemperature$1\n*L\n1850#1:2522\n1850#1:2523,3\n*E\n"})
    public static final class iI extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ BleTemperature IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public iI(BleTemperature r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            TemperatureDao r0 = BleInitializer.iOiXi11II(BleInitializer.IO);
            List r1 = CollectionsKt__CollectionsKt.Ii1iii0(new BleTemperature[]{this.IO});
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            Temperature r8 = new Temperature((BleTemperature) r3.next(), r2);
            r4.setTime(r8.getMTime());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.XOO0ii0, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord3$1\n*L\n1793#1:2522\n1793#1:2523,3\n*E\n"})
    public static final class iIiiO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleMatchRecord3> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public iIiiO(List<BleMatchRecord3> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao r0 = BleInitializer.X100O(BleInitializer.IO);
            List<BleMatchRecord3> r1 = this.IO;
            long r2 = this.I1;
            Date r4 = this.iX1O1;
            SimpleDateFormat r5 = this.X11iII1O1;
            ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            MatchRecord r8 = new MatchRecord((BleMatchRecord3) r3.next(), r2);
            r4.setTime(r8.getMStart());
            String r7 = r5.format(r4);
            Intrinsics.O10IXXX0X(r7, "format(...)");
            r8.setMLocalTime(r7);
            r6.add(r8);
            goto L4
        L6:
            r0.insert(r6);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public static final class iO extends ContentObserver {
        public iO(Handler r1) {
            super(r1);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r21) {
            LogUtils.v(new Object[]{"BleInitializer SmsObserver onChange -> selfChange=" + r21});
            super.onChange(r21);
            q62 r0 = q62.OXO1;
            if (r0.I0IIOI() == false) goto L39;
            a01 r1 = a01.OXO1;
            if (r1.iO().getBoolean(b01.iO) == false) goto L40;
            BleConnector r3 = BleConnector.INSTANCE;
            if (r3.isAvailable() == false) goto L41;
            String[] r2 = gb1.XIi00iiXO();
            if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r2, r2.length)) == false) goto L42;
            long r4 = r1.iO().getLong(b01.I0iXXO, -1);
            Cursor r5 = Utils.getApp().getContentResolver().query(BleInitializer.XO0X10iO(), null, "read = 0 and type = 1 and _id > " + r4, null, "_id desc");
            if (r5 == null) goto L34;
            Cursor r6 = r5;
            Cursor r7 = r6;     // Catch: Throwable -> L24
            if (r7.moveToNext() == false) goto L27;
            r1.iO().put(b01.I0iXXO, r7.getLong(r7.getColumnIndex("_id")));     // Catch: Throwable -> L24
            BleInitializer r8 = BleInitializer.IO;     // Catch: Throwable -> L24
            r8.IIO11(true);     // Catch: Throwable -> L24
            r8.I11iXOO(System.currentTimeMillis());     // Catch: Throwable -> L24
            String r12 = r7.getString(r7.getColumnIndex("address"));     // Catch: Throwable -> L24
            String r19 = r7.getString(r7.getColumnIndex("body"));     // Catch: Throwable -> L24
            if (r0.i0iOi() == true) goto L22;
        L26:
            long r15 = new Date().getTime();     // Catch: Throwable -> L24
            Intrinsics.XXI(r12);     // Catch: Throwable -> L24
            String r18 = BleInitializer.iX1O1(r8, r12);     // Catch: Throwable -> L24
            Intrinsics.XXI(r19);     // Catch: Throwable -> L24
            BleNotification r9 = new BleNotification(127, r15, "com.android.mms", r18, r19);     // Catch: Throwable -> L24
            i1O0OXO1O.OXO1.IiI10X("BleInitializer SmsObserver onChange -> notification=" + r9);     // Catch: Throwable -> L24
            BaseBleConnector.sendObject$default(r3, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r9, false, false, 24, null);     // Catch: Throwable -> L24
            goto L27
        L22:
            if (TextUtils.isEmpty(r12) == true) goto L26;
            long r10 = new Date().getTime();     // Catch: Throwable -> L24
            Intrinsics.XXI(r12);     // Catch: Throwable -> L24
            String r11 = BleInitializer.iX1O1(r8, r12);     // Catch: Throwable -> L24
            Intrinsics.XXI(r19);     // Catch: Throwable -> L24
            BleNotification2 r13 = new BleNotification2(127, r10, "com.android.mms", r11, r12, r19);     // Catch: Throwable -> L24
            i1O0OXO1O.OXO1.IiI10X("BleInitializer SmsObserver onChange -> notification2=" + r13);     // Catch: Throwable -> L24
            BaseBleConnector.sendObject$default(r3, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, r13, false, false, 24, null);     // Catch: Throwable -> L24
        L27:
            Unit r14 = Unit.OXO1;     // Catch: Throwable -> L24
            CloseableKt.OXO1(r6, null);
            return;
        L24:
            th = move-exception;
            throw th;     // Catch: Throwable -> L31
        L31:
            th = move-exception;
            CloseableKt.OXO1(r6, th);
            throw th;
        L34:
            return;
        L42:
            return;
        L41:
            return;
        L40:
            return;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n*L\n2210#1:2522,3\n*E\n"})
    public static final class iOO1ii1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ Calendar I1;
        public final /* synthetic */ List<BlePpgSHSY> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public iOO1ii1(List<BlePpgSHSY> r1, Calendar r2, SimpleDateFormat r3, SimpleDateFormat r4) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
            this.X11iII1O1 = r4;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            List<BlePpgSHSY> r4 = this.IO;     // Catch: Exception -> L9
            Calendar r5 = this.I1;     // Catch: Exception -> L9
            SimpleDateFormat r6 = this.iX1O1;     // Catch: Exception -> L9
            SimpleDateFormat r7 = this.X11iII1O1;     // Catch: Exception -> L9
            Iterator r8 = r4.iterator();     // Catch: Exception -> L9
            int r9 = 0;
        L4:
            if (r8.hasNext() == false) goto L28;
            Object r10 = r8.next();     // Catch: Exception -> L9
            int r11 = r9 + 1;     // Catch: Exception -> L9
            if (r9 >= 0) goto L11;
            CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L9
        L11:
            BlePpgSHSY r12 = (BlePpgSHSY) r10;     // Catch: Exception -> L9
            long r13 = r5.getTimeInMillis() + r12.getMTime();     // Catch: Exception -> L9
            if (r9 != 0) goto L16;
            BleInitializer r14 = BleInitializer.IO;     // Catch: Exception -> L9
            if (r14.IX1XiI() != 0) goto L16;
            r14.I0OX(r13);     // Catch: Exception -> L9
        L16:
            File r15 = uz0.X0i1O(sz0.OXO1);     // Catch: Exception -> L9
            String r16 = r6.format(Long.valueOf(BleInitializer.IO.IX1XiI()));     // Catch: Exception -> L9
            String r17 = BleCache.INSTANCE.getMBleAddress();     // Catch: Exception -> L9
            StringBuilder r1 = new StringBuilder();     // Catch: Exception -> L9
            Iterator r18 = r8;
            r1.append("ppgSHSYs_");     // Catch: Exception -> L9
            r1.append(r16);     // Catch: Exception -> L9
            r1.append(IiXI1X1OO.O00);     // Catch: Exception -> L9
            r1.append(r17);     // Catch: Exception -> L9
            r1.append(".csv");     // Catch: Exception -> L9
            File r19 = new File(r15, r1.toString());     // Catch: Exception -> L9
            if (FileUtils.isFileExists(r19) == true) goto L20;
            FileUtils.createOrExistsFile(r19);     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r19, "Timestamp,PPGRaw,PPG\n", false);     // Catch: Exception -> L9
        L20:
            String r2 = r7.format(new Date(r13));     // Catch: Exception -> L9
            String r20 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(r12.getMPGGRaw())}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r20, "format(...)");     // Catch: Exception -> L9
            String r110 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r12.getMPGG())}, 1));     // Catch: Exception -> L9
            Intrinsics.O10IXXX0X(r110, "format(...)");     // Catch: Exception -> L9
            FileIOUtils.writeFileFromString(r19, r2 + I000IiI1O.iO.XO0O10 + r20 + I000IiI1O.iO.XO0O10 + r110 + "\n", true);     // Catch: Exception -> L9
            r9 = r11;
            r8 = r18;
            goto L4
        L28:
            return null;
        L9:
            e = move-exception;
            e.printStackTrace();
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout$1\n*L\n755#1:2522\n755#1:2523,3\n*E\n"})
    public static final class iOOX010X extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ long I1;
        public final /* synthetic */ List<BleWorkout> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public iOOX010X(List<BleWorkout> r1, long r2, Date r4, SimpleDateFormat r5) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r4;
            this.X11iII1O1 = r5;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        private static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            BleInitializer.i11I(BleInitializer.IO).insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao r1 = BleInitializer.i0X000X0O(BleInitializer.IO);
            List<BleWorkout> r2 = this.IO;
            long r3 = this.I1;
            Date r5 = this.iX1O1;
            SimpleDateFormat r6 = this.X11iII1O1;
            ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
            Iterator<T> r4 = r2.iterator();
        L4:
            if (r4.hasNext() == false) goto L9;
            Workout r9 = new Workout((BleWorkout) r4.next(), r3);
            r5.setTime(r9.getMStart());
            String r8 = r6.format(r5);
            Intrinsics.O10IXXX0X(r8, "format(...)");
            r9.setMLocalTime(r8);
            BleCache r10 = BleCache.INSTANCE;
            if (r10.getMBleName().length() <= 0) goto L8;
            r9.setMFirmwareFlag(r10.getMFirmwareFlag());
            r9.setMPrototype(r10.getMPrototype());
            r9.setMBleName(r10.getMBleName());
            r9.setMPlatform(r10.getMPlatform());
            r9.setMAGpsType(r10.getMAGpsType());
        L8:
            int r15 = r9.getMMode();
            final WorkoutIndex r11 = new WorkoutIndex(0, 2, r9.getMEnd(), r15, 0, 17, null);
            Application r12 = Utils.getApp();
            Intrinsics.O10IXXX0X(r12, "getApp(...)");
            XXI0Xi.XOO0ii0(r12, r11, new OiXO1XOO0(r11));
            r7.add(r9);
            goto L4
        L9:
            r1.insert(r7);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorMotion$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorMotion$1\n*L\n2111#1:2522,2\n*E\n"})
    public static final class iX extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ Date I1;
        public final /* synthetic */ List<BleGSensorMotion> IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public iX(List<BleGSensorMotion> r1, Date r2, SimpleDateFormat r3, SimpleDateFormat r4) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
            this.X11iII1O1 = r4;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            List<BleGSensorMotion> r0 = this.IO;     // Catch: Exception -> L8
            Date r1 = this.I1;     // Catch: Exception -> L8
            SimpleDateFormat r2 = this.iX1O1;     // Catch: Exception -> L8
            SimpleDateFormat r3 = this.X11iII1O1;     // Catch: Exception -> L8
            Iterator<T> r4 = r0.iterator();     // Catch: Exception -> L8
        L3:
            if (r4.hasNext() == false) goto L24;
            BleGSensorMotion r5 = (BleGSensorMotion) r4.next();     // Catch: Exception -> L8
            r1.setTime(System.currentTimeMillis());     // Catch: Exception -> L8
            File r6 = new File(uz0.X0i1O(sz0.OXO1), "gSensorMotions_" + r2.format(r1) + ".csv");     // Catch: Exception -> L8
            if (FileUtils.isFileExists(r6) == true) goto L11;
            FileUtils.createOrExistsFile(r6);     // Catch: Exception -> L8
            FileIOUtils.writeFileFromString(r6, "date,value\n", false);     // Catch: Exception -> L8
        L11:
            if (r5.getMMotion() <= 42) goto L3;
            FileIOUtils.writeFileFromString(r6, r3.format(r1) + I000IiI1O.iO.XO0O10 + r5.getMMotion() + "\n", true);     // Catch: Exception -> L8
            goto L3
        L24:
            return null;
        L8:
            e = move-exception;
            e.printStackTrace();
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    static {
        IO = new BleInitializer();
        X11iII1O1 = LazyKt__LazyJVMKt.iO(new i111I0100());
        XXX11i = LazyKt__LazyJVMKt.iO(new X1i1X1ii());
        X1IX = LazyKt__LazyJVMKt.iO(new XOIXO1IO1());
        X0i1O = LazyKt__LazyJVMKt.iO(new IOiOXiX1I());
        iIXi1iiXI = LazyKt__LazyJVMKt.iO(new OOOIOi0O());
        iXiX011 = LazyKt__LazyJVMKt.iO(new XOOXI0IX());
        O001I = LazyKt__LazyJVMKt.iO(new XX1X0());
        XXO = LazyKt__LazyJVMKt.iO(new X1i10iX());
        iXiiiO = LazyKt__LazyJVMKt.iO(new OOOOO());
        Ii1iii0 = LazyKt__LazyJVMKt.iO(new X0IIII0OI());
        iiiO = LazyKt__LazyJVMKt.iO(new IOXIii0());
        X11I = LazyKt__LazyJVMKt.iO(new O0IOOIX0());
        X100O = LazyKt__LazyJVMKt.iO(new IXXii());
        XX1Oi = LazyKt__LazyJVMKt.iO(new IOXXI1());
        OX110i = LazyKt__LazyJVMKt.iO(new I0010I0i());
        OO = LazyKt__LazyJVMKt.iO(new XIiIi());
        XOX0O0 = LazyKt__LazyJVMKt.iO(new i1O1XIOIi());
        iOiXi11II = LazyKt__LazyJVMKt.iO(new I0XIIX());
        X00XIX1 = LazyKt__LazyJVMKt.iO(new i01OIIi11());
        i0X000X0O = LazyKt__LazyJVMKt.iO(new OXX1OO1I());
        Handler r0 = new Handler();
        i11I = r0;
        IiiXiI0I = -1;
        XX00i10X = new XIi00iiXO();
        O0O0X0iOi = Uri.parse("content://sms/");
        iOI = new iO(r0);
        IX1XiI = new long[]{500, 500};
        XXiO0i = LazyKt__LazyJVMKt.iO(new O1IX0());
        iXi = LazyKt__LazyJVMKt.iO(new IXXIIXO1());
        O0O = LazyKt__LazyJVMKt.iO(new OO1O());
    }

    public BleInitializer() {
    }

    public static final BloodGlucoseDao I011X() {
        return MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
    }

    public static /* synthetic */ PressureDao I0IIOi() {
        return II();
    }

    public static final void I0i1OXiI(boolean r2) {
        if (r2 == false) goto L4;
        I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
    L4:
        BleConnector.INSTANCE.unbind();
        IO.XOXiX0();
    }

    public static /* synthetic */ HrvDao I0iXXO() {
        return X11();
    }

    public static /* synthetic */ BloodPressureDao I1() {
        return OI1i1i();
    }

    public static /* synthetic */ ElectrocardiogramDao I1XOi1() {
        return XI();
    }

    public static final PressureDao II() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    public static final AlipayBindInfoDao II1() {
        return MyDb.INSTANCE.getMDatabase().alipayBindInfoDao();
    }

    public static /* synthetic */ Unit II1Xi0(PermissionStatus r0) {
        return IX(r0);
    }

    public static /* synthetic */ ActivityDao IIX1OXO() {
        return X1i();
    }

    public static /* synthetic */ Unit IO(PermissionStatus r0) {
        return OIIOI(r0);
    }

    public static final /* synthetic */ void IO0II0i(BleInitializer r0, String r1) {
        r0.XOIO11O(r1);
    }

    public static final Vibrator IOX1() {
        Object r0 = Utils.getApp().getSystemService("vibrator");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) r0;
    }

    public static final Unit IX(PermissionStatus r2) {
        Intrinsics.X0O(r2, "status");
        if (r2 != PermissionStatus.GRANTED) goto L7;
        ms r3 = iii0;
        if (r3 == null) goto L9;
        r3.IiI10X(R.string.get_your_location, false);
    L9:
        return Unit.OXO1;
    L7:
        LogUtils.v(new Object[]{"onRequestAgpsPrerequisite -> Location permission is not granted"});
        goto L9
    }

    public static final /* synthetic */ void IXI(int r0) {
        IiiXiI0I = r0;
    }

    public static final /* synthetic */ void IXOIIIO(BleInitializer r0, String r1) {
        r0.XIO11I(r1);
    }

    public static /* synthetic */ CharSequence IXXOO(BleLogText r0) {
        return XII01OO1I(r0);
    }

    public static final /* synthetic */ void Ii0X0X(BleInitializer r0) {
        r0.IX0iIX();
    }

    public static final /* synthetic */ void Ii0i(BleInitializer r0, BleAgpsPrerequisite r1) {
        r0.i000X(r1);
    }

    public static final /* synthetic */ HeartRateDao Ii1iii0(BleInitializer r0) {
        return r0.iI0I();
    }

    public static /* synthetic */ WorkoutIndexDao IiI10X() {
        return i0iIXiI();
    }

    public static final /* synthetic */ void IiiXiI0I(BleInitializer r0) {
        r0.X00110X();
    }

    public static final AssetFileDescriptor IiiiOIIi0() {
        return Utils.getApp().getAssets().openFd("find_phone.ogg");
    }

    public static /* synthetic */ HeartRateDao O00() {
        return OI1IiOO1i();
    }

    public static final /* synthetic */ ElectrocardiogramDao O001I(BleInitializer r0) {
        return r0.X111IO();
    }

    public static /* synthetic */ DailyPowerDao O10IXXX0X() {
        return iIIIi();
    }

    public static /* synthetic */ Vibrator O1O() {
        return IOX1();
    }

    public static final RespiratoryRateDao O1i0() {
        return MyDb.INSTANCE.getMDatabase().respiratoryRateDao();
    }

    public static final HeartRateDao OI1IiOO1i() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    public static final BloodPressureDao OI1i1i() {
        return MyDb.INSTANCE.getMDatabase().bloodPressureDao();
    }

    public static /* synthetic */ Unit OII(PermissionStatus r0) {
        return XOOXII(r0);
    }

    public static final Unit OIIOI(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        if (r1 != PermissionStatus.GRANTED) goto L6;
        LogUtils.d(new Object[]{"hang up OK"});
        Object r2 = Utils.getApp().getSystemService("telecom");
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.telecom.TelecomManager");
        OXIiX1OO.OXO1((TelecomManager) r2);
    L6:
        return Unit.OXO1;
    }

    public static /* synthetic */ AlipayBindInfoDao OIX0iXi() {
        return II1();
    }

    public static /* synthetic */ MatchRecordDao OIi0() {
        return XOOI0O();
    }

    public static final /* synthetic */ RespiratoryRateDao OO(BleInitializer r0) {
        return r0.I0();
    }

    public static /* synthetic */ Unit OX(int r0, PermissionStatus r1) {
        return i01OOiI(r0, r1);
    }

    public static /* synthetic */ void OX0X1O10X(BleInitializer r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.O0Ii(r1);
    }

    public static final /* synthetic */ PressureDao OX110i(BleInitializer r0) {
        return r0.iiII();
    }

    public static final SleepDao OXI0Xi() {
        return MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static final AudioManager OXii10I() {
        Object r0 = Utils.getApp().getSystemService("audio");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) r0;
    }

    public static /* synthetic */ String Oi(BleInitializer r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = "54";
    L6:
        return r0.iiIOiX(r1, r2);
    }

    public static /* synthetic */ EnergyRatingDao OiIIX101O() {
        return iO11i();
    }

    public static final boolean Oii1I1I10(MediaPlayer r0, int r1, int r2) {
        IO.iOXiO1O1I();
        return false;
    }

    public static final WorkoutDao Oiii() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final /* synthetic */ VitalityDao X00XIX1(BleInitializer r0) {
        return r0.XXI0XOIX();
    }

    public static final /* synthetic */ void X00Xi1X(BleInitializer r0, String r1) {
        r0.I0IIOI(r1);
    }

    public static /* synthetic */ HanBaoVibrationDao X01IiOiIi() {
        return XOO0Xi();
    }

    public static /* synthetic */ TemperatureDao X0O() {
        return i0O();
    }

    public static final /* synthetic */ BloodOxygenDao X0i1O(BleInitializer r0) {
        return r0.iii0();
    }

    public static final /* synthetic */ void X1(BleInitializer r0, String r1) {
        r0.IOIi00(r1);
    }

    public static final /* synthetic */ MatchRecordDao X100O(BleInitializer r0) {
        return r0.Xii();
    }

    public static final void X10i() {
        BleConnector.INSTANCE.connectClassic();
    }

    public static final HrvDao X11() {
        return MyDb.INSTANCE.getMDatabase().hrvDao();
    }

    public static final /* synthetic */ LocationDao X11I(BleInitializer r0) {
        return r0.X1OI();
    }

    public static final /* synthetic */ ActivityDao X11iII1O1(BleInitializer r0) {
        return r0.IX0IXOi();
    }

    public static final /* synthetic */ BloodGlucoseDao X1IX(BleInitializer r0) {
        return r0.Xi1i0XOX0();
    }

    private final LocationDao X1OI() {
        return (LocationDao) iXiX011.getValue();
    }

    public static final ActivityDao X1i() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    public static /* synthetic */ AudioManager X1ii() {
        return OXii10I();
    }

    public static final ElectrocardiogramDao XI() {
        return MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
    }

    public static final CharSequence XII01OO1I(BleLogText r1) {
        Intrinsics.X0O(r1, "it");
        return r1.getMContent();
    }

    public static final VitalityDao XIIIO() {
        return MyDb.INSTANCE.getMDatabase().vitalityDao();
    }

    public static /* synthetic */ SleepDao XIi00iiXO() {
        return OXI0Xi();
    }

    public static /* synthetic */ Unit XO0O10(BleCyWeeAlgorithm r0, boolean r1) {
        return iIXX0i(r0, r1);
    }

    public static final /* synthetic */ Uri XO0X10iO() {
        return O0O0X0iOi;
    }

    public static final HanBaoVibrationDao XOO0Xi() {
        return MyDb.INSTANCE.getMDatabase().hanBaoVibrationDao();
    }

    public static /* synthetic */ RespiratoryRateDao XOO0ii0() {
        return O1i0();
    }

    public static final MatchRecordDao XOOI0O() {
        return MyDb.INSTANCE.getMDatabase().matchRecordDao();
    }

    public static final Unit XOOXII(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        if (r1 != PermissionStatus.GRANTED) goto L8;
        LogUtils.d(new Object[]{"hang up OK"});
        TelecomManager r2 = (TelecomManager) Utils.getApp().getSystemService("telecom");
        if (r2 == null) goto L8;
        r2.acceptRingingCall();
    L8:
        return Unit.OXO1;
    }

    public static final /* synthetic */ SleepDao XOX0O0(BleInitializer r0) {
        return r0.O101();
    }

    public static /* synthetic */ Unit XX0() {
        return iXOiXII();
    }

    public static final /* synthetic */ int XX1Oi() {
        return IiiXiI0I;
    }

    public static /* synthetic */ boolean XXI(MediaPlayer r0, int r1, int r2) {
        return Oii1I1I10(r0, r1, r2);
    }

    public static /* synthetic */ boolean XXIIO1i11(LogLevel r0, String r1, String r2) {
        return Xi(r0, r1, r2);
    }

    public static final /* synthetic */ EnergyRatingDao XXO(BleInitializer r0) {
        return r0.iIi1();
    }

    public static final /* synthetic */ AlipayBindInfoDao XXX11i(BleInitializer r0) {
        return r0.iXi();
    }

    public static final /* synthetic */ void XXiIiX10(BleInitializer r0, int r1) {
        r0.OXi001(r1);
    }

    public static final boolean Xi(LogLevel r1, String r2, String r3) {
        Intrinsics.X0O(r1, "level");
        Intrinsics.X0O(r2, "<unused var>");
        Intrinsics.X0O(r3, "msg");
        ThreadUtils.executeBySingle(new OXO1(r3, r1));
        return false;
    }

    public static /* synthetic */ VitalityDao XiOIO() {
        return XIIIO();
    }

    public static /* synthetic */ BloodGlucoseDao XiOIii1() {
        return I011X();
    }

    public static /* synthetic */ void i010I() {
        X10i();
    }

    public static final Unit i01OOiI(int r6, PermissionStatus r7) {
        Intrinsics.X0O(r7, "status");
        if (r7 == PermissionStatus.GRANTED) goto L5;
        LogUtils.v(new Object[]{"onRequestLocation workout -> Location permission is not granted"});
    L23:
        return Unit.OXO1;
    L5:
        if (r6 != 1) goto L7;
        XOO0XOOii = System.currentTimeMillis();
        iiIOiX = 0.0d;
        a01 r8 = a01.OXO1;
        r8.OXO1().put(b01.iIiiO, "");
        r8.OXO1().put(b01.XiOIii1, true, true);
        IO.I1OI();
        goto L23
    L7:
        if (r6 != 2) goto L9;
        a01 r9 = a01.OXO1;
        if (r9.OXO1().getBoolean(b01.XX0, false) == false) goto L18;
        r9.OXO1().put(b01.OiIIX101O, false, true);
    L19:
        r9.OXO1().put(b01.XiOIii1, true, true);
        goto L23
    L18:
        IO.I1OI();
        goto L19
    L9:
        if (r6 != 3) goto L11;
        a01.OXO1.OXO1().put(b01.OiIIX101O, true, true);
        goto L23
    L11:
        if (r6 == 4) goto L13;
        LogUtils.v(new Object[]{"Unknown workoutState"});
        goto L23
    L13:
        a01 r10 = a01.OXO1;
        r10.OXO1().put(b01.iIiiO, "");
        r10.OXO1().put(b01.OiIIX101O, true, true);
        IXI = false;
        goto L23
    }

    public static final TemperatureDao i0O() {
        return MyDb.INSTANCE.getMDatabase().temperatureDao();
    }

    public static final /* synthetic */ WorkoutDao i0X000X0O(BleInitializer r0) {
        return r0.XIIO11I();
    }

    public static final WorkoutIndexDao i0iIXiI() {
        return MyDb.INSTANCE.getMDatabase().workoutIndexDao();
    }

    public static final /* synthetic */ WorkoutIndexDao i11I(BleInitializer r0) {
        return r0.XXOXi();
    }

    public static final /* synthetic */ String iI(BleInitializer r0, int r1) {
        return r0.XX00i10X(r1);
    }

    public static final DailyPowerDao iIIIi() {
        return MyDb.INSTANCE.getMDatabase().dailyPowerDao();
    }

    public static final Unit iIXX0i(BleCyWeeAlgorithm r2, boolean r3) {
        a01.OXO1.iO().put(BleCyWeeAlgorithm.class.getName(), new Gson().toJson(r2));
        return Unit.OXO1;
    }

    public static final /* synthetic */ BloodPressureDao iIXi1iiXI(BleInitializer r0) {
        return r0.Xii11I();
    }

    public static /* synthetic */ WorkoutDao iIiiO() {
        return Oiii();
    }

    public static /* synthetic */ AssetFileDescriptor iO() {
        return IiiiOIIi0();
    }

    public static final EnergyRatingDao iO11i() {
        return MyDb.INSTANCE.getMDatabase().energyRating();
    }

    public static /* synthetic */ void iOO1ii1(boolean r0) {
        I0i1OXiI(r0);
    }

    public static /* synthetic */ BloodOxygenDao iOOX010X() {
        return iiX0i1IX();
    }

    public static final /* synthetic */ TemperatureDao iOiXi11II(BleInitializer r0) {
        return r0.IXiOXO();
    }

    public static /* synthetic */ LocationDao iX() {
        return iX0iii0();
    }

    public static final LocationDao iX0iii0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    public static final /* synthetic */ String iX1O1(BleInitializer r0, String r1) {
        return r0.iOI(r1);
    }

    public static final Unit iXOiXII() {
    L2:
        a01 r0 = a01.OXO1;
        if (r0.OXO1().getBoolean(b01.XX0, true) == false) goto L11;
        r0.OXO1().put(b01.OiIIX101O, true, true);
        Thread.sleep(60000);
        if (r0.OXO1().getBoolean(b01.OiIIX101O, true) == false) goto L2;
        r0.OXO1().put(b01.XX0, false, true);
        ms r1 = Xi1i0XOX0;
        if (r1 == null) goto L9;
        r1.I0IIOi();
    L9:
        Ii0i = false;
        IXI = false;
        goto L2
    L11:
        return Unit.OXO1;
    }

    public static final /* synthetic */ DailyPowerDao iXiX011(BleInitializer r0) {
        return r0.X0iO();
    }

    public static final /* synthetic */ HanBaoVibrationDao iXiiiO(BleInitializer r0) {
        return r0.i100IXOX();
    }

    public static final BloodOxygenDao iiX0i1IX() {
        return MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
    }

    public static final /* synthetic */ HrvDao iiiO(BleInitializer r0) {
        return r0.iIX0i();
    }

    public final RespiratoryRateDao I0() {
        return (RespiratoryRateDao) i0X000X0O.getValue();
    }

    public final void I00(long r1) {
        X0iO = r1;
    }

    public final void I0IIOI(String r14) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("handleIncomingCall -> " + r14);
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO) == false) goto L24;
        BleConnector r2 = BleConnector.INSTANCE;
        if (r2.isAvailable() == false) goto L25;
        String[] r1 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r1, r1.length)) == true) goto L11;
        return;
    L11:
        String r3 = iOI(r14);
        r0.OXO1("BleInitializer handleIncomingCall -> Send title = " + r3 + "  phoneNumber" + r14);
        if (TextUtils.isEmpty(r3) == false) goto L17;
        r3 = ii0111XI();
        if (r3 != null) goto L17;
        r3 = "";
    L17:
        if (TextUtils.isEmpty(r3) == true) goto L19;
    L21:
        String r9 = r3;
    L22:
        long r6 = new Date().getTime();
        String r10 = Utils.getApp().getString(R.string.incoming_call);
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        BleNotification r4 = new BleNotification(1, r6, null, r9, r10, 4, null);
        r0.OXO1("BleInitializer handleIncomingCall -> Send Notification = " + r4);
        BaseBleConnector.sendObject$default(r2, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r4, false, false, 24, null);
        return;
    L19:
        if (TextUtils.isEmpty(r14) == true) goto L21;
        r9 = r14;
        goto L22
    L25:
        return;
    }

    public final void I0OX(long r1) {
        X00O0 = r1;
    }

    @tb1
    public final BleNotification I0XXi0X() {
        return XOXiX0;
    }

    public final boolean I0i0() {
        return IO0iXO0O;
    }

    public final boolean I0iOXO() {
        return XO0X10iO;
    }

    public final boolean I11X11OX() {
        return Ii0i;
    }

    public final void I11iXOO(long r1) {
        IXOIIIO = r1;
    }

    public final void I1Ii(boolean r1) {
        X00Xi1X = r1;
    }

    public final void I1OI() {
        if (Ii0i == true) goto L5;
        I01XX0.XIi00iiXO(I01XX0.XOO0XOOii, null, 2, null);
    L5:
        Ii0i = true;
        IXI = true;
        a01.OXO1.OXO1().put(b01.XX0, true);
        ms r0 = Xi1i0XOX0;
        if (r0 == null) goto L8;
        ms.XOO0ii0(r0, R.string.device_no_support_and_phone_get_location_desc, false, 2, null);
    L8:
        ThreadsKt.iO(false, false, null, null, 0, new iXI01X(), 31, null);
    }

    @SuppressLint({"WrongConstant"})
    public final void I1XII0X(final Application r5) {
        I0iIi r0 = I0iIi.OXO1;
        BroadcastReceiver r1 = new BleInitializer$registerMyReceiver$1(r5);
        IntentFilter r2 = new IntentFilter();
        r2.addAction("android.intent.action.LOCALE_CHANGED");
        r2.addAction("android.intent.action.TIME_SET");
        r2.addAction("android.intent.action.TIMEZONE_CHANGED");
        r2.addAction("android.intent.action.TIME_TICK");
        Unit r3 = Unit.OXO1;
        r0.OXO1(r5, r1, r2, 2);
    }

    public final void IIO11(boolean r1) {
        X1 = r1;
    }

    public final synchronized void IIX(@aa1 Context r4) {
        monitor-enter(this);
        Intrinsics.X0O(r4, "context");     // Catch: Throwable -> L6
        Object r5 = r4.getSystemService("phone");     // Catch: Throwable -> L6
        if ((r5 instanceof TelephonyManager) == false) goto L8;
        TelephonyManager r6 = (TelephonyManager) r5;     // Catch: Throwable -> L6
    L9:
        if (r6 != null) goto L11;
    L15:
        i1O0OXO1O.OXO1.IiI10X("setPhoneListener -> " + XOIX);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L11:
        if (XOIX == true) goto L15;
        if (PermissionUtils.isGranted(new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"}) == false) goto L15;
        r6.listen(XX00i10X, 32);     // Catch: Throwable -> L6
        XOIX = true;     // Catch: Throwable -> L6
        goto L15
    L8:
        r6 = null;
    L6:
        th = move-exception;
        throw th;
    }

    public final String IO0iXO0O(String r7) {
        String r0 = StringsKt__StringsKt.iX1X1(r7).toString();
        String r1 = new Regex("[^0-9+]").replace(r0, "");
        if (oe5.O0(r1, "+54", false, 2, null) == true) goto L9;
        if (oe5.O0(r1, "54", false, 2, null) == true) goto L9;
        return r7;
    L9:
        return iiIOiX(r1, "54");
    }

    public final void IOI() {
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isAvailable() == false) goto L18;
        BleCache r1 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == true) goto L11;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L11;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L11;
        return;
    L11:
        if (q62.OXO1.I0OX() == true) goto L20;
        BleNotificationSettings r3 = new BleNotificationSettings();
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO, false) == false) goto L15;
        r3.enable("tel");
    L16:
        BaseBleConnector.sendObject$default(r0, BleKey.NOTIFICATION_REMINDER, BleKeyFlag.UPDATE, r3, false, false, 24, null);
        return;
    L15:
        r3.disable("tel");
        goto L16
    L20:
        return;
    }

    public final void IOI0i0I(boolean r1) {
        IXI = r1;
    }

    public final void IOIi00(String r13) {
        LogUtils.d(new Object[]{"handleIncomingCall2 -> " + r13});
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO) == false) goto L18;
        BleConnector r1 = BleConnector.INSTANCE;
        if (r1.isAvailable() == false) goto L19;
        String[] r0 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r0, r0.length)) == true) goto L11;
        return;
    L11:
        String r2 = iOI(r13);
        if (TextUtils.isEmpty(r2) == false) goto L16;
        r2 = ii0111XI();
        if (r2 != null) goto L16;
        r2 = "";
    L16:
        long r4 = new Date().getTime();
        String r9 = Utils.getApp().getString(R.string.incoming_call);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        int r3 = 1;
        String r6 = null;
        BleNotification2 r5 = new BleNotification2(r3, r4, r6, r2, r13, r9, 4, null);
        i1O0OXO1O.OXO1.IiI10X("BleInitializer handleIncomingCall2 -> Send Notification2 = " + r5);
        BaseBleConnector.sendObject$default(r1, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, r5, false, false, 24, null);
        return;
    L19:
        return;
    }

    public final long IOi1O0() {
        return IXOIIIO;
    }

    public final ActivityDao IX0IXOi() {
        return (ActivityDao) X11iII1O1.getValue();
    }

    public final void IX0iIX() {
        LogUtils.d(new Object[]{"handleEnd"});
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO) == true) goto L5;
        return;
    L5:
        BleNotification r1 = new BleNotification(1, 0, null, null, null, 30, null);
        i1O0OXO1O.OXO1.IiI10X("BleInitializer handleEnd -> Send Notification = " + r1);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.DELETE, r1, false, false, 24, null);
    }

    public final long IX1XiI() {
        return X00O0;
    }

    public final void IXO0OOi() {
        iOXiO1O1I();
        AudioManager r0 = O0O();     // Catch: Exception -> L5
        r0.setStreamVolume(4, r0.getStreamMaxVolume(4), 0);     // Catch: Exception -> L5
        MediaPlayer r4 = new MediaPlayer();     // Catch: Exception -> L5
        r4.setLooping(true);     // Catch: Exception -> L5
        BleInitializer r1 = IO;     // Catch: Exception -> L5
        r4.setDataSource(r1.X00O0().getFileDescriptor(), r1.X00O0().getStartOffset(), r1.X00O0().getLength());     // Catch: Exception -> L5
        r4.setAudioStreamType(4);     // Catch: Exception -> L5
        r4.setOnErrorListener(new Ii1XiOX1());     // Catch: Exception -> L5
        r4.prepare();     // Catch: Exception -> L5
        r4.start();     // Catch: Exception -> L5
        IX0IXOi = r4;     // Catch: Exception -> L5
        iOX().vibrate(IX1XiI, 0);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    public final TemperatureDao IXiOXO() {
        return (TemperatureDao) O001I.getValue();
    }

    public final boolean IiXIIX1O1() {
        return XOIX;
    }

    @sf5(tag = I01XX0.X100O)
    public final void O0Ii(boolean r11) {
        i1O0OXO1O.OXO1.OXO1("onUnbind");
        final boolean r1 = false;
        HykyManager.Companion.getInstance().bindDevice(false);
        if (r11 == false) goto L5;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.IDENTITY, BleKeyFlag.DELETE, null, false, false, 28, null);
    L6:
        BleDeviceInfo r12 = BleCache.INSTANCE.getMDeviceInfo();
        if (r12 == null) goto L9;
        ov0.OXO1.I0IIOi(r12);
    L9:
        WebSocketManager.INSTANCE.unInitWsManager();
        q62 r13 = q62.OXO1;
        if (r13.O0i0() == false) goto L12;
    L13:
        r1 = true;
    L14:
        new Handler().postDelayed(new IIXiOii(r1), 2000);
        WxManager.IX1XiI(WxManager.OXO1, null, 1, null);
        WAManager.OX110i(WAManager.OXO1, null, 1, null);
        return;
    L12:
        if (r13.IiO0() == false) goto L14;
    L5:
        I01XX0.XIi00iiXO(I01XX0.O0O, null, 2, null);
        goto L6
    }

    public final AudioManager O0O() {
        return (AudioManager) XXiO0i.getValue();
    }

    public final String O0O0X0iOi(String r11) {
        if (PermissionUtils.isGranted(new String[]{"android.permission.READ_CONTACTS"}) == false) goto L5;
        Application r2 = Utils.getApp();     // Catch: Exception -> L12
        Intrinsics.O10IXXX0X(r2, "getApp(...)");     // Catch: Exception -> L12
        if (UtilsKt.IiiXiI0I(r2) == true) goto L10;
    L14:
        String r3 = " like '%" + r11 + "'";     // Catch: Exception -> L12
    L15:
        i1O0OXO1O.OXO1.OXO1("getPN1 -> " + r3);     // Catch: Exception -> L12
        Cursor r0 = Utils.getApp().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data4"}, "data4" + r3, null, null);     // Catch: Exception -> L12
        if (r0 == null) goto L33;
        Cursor r4 = r0;     // Catch: Exception -> L12
        Cursor r1 = r4;     // Catch: Throwable -> L23
        if (r1.moveToNext() == false) goto L25;
        String r5 = r1.getString(r1.getColumnIndex("display_name"));     // Catch: Throwable -> L23
        Intrinsics.O10IXXX0X(r5, "getString(...)");     // Catch: Throwable -> L23
        String r6 = cp5.XX1Oi(r5);     // Catch: Throwable -> L23
        CloseableKt.OXO1(r4, null);     // Catch: Exception -> L12
        return r6;
    L25:
        Unit r7 = Unit.OXO1;     // Catch: Throwable -> L23
        CloseableKt.OXO1(r4, null);     // Catch: Exception -> L12
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        CloseableKt.OXO1(r4, th);     // Catch: Exception -> L12
        throw th;     // Catch: Exception -> L12
    L33:
        return cp5.OX110i(r11);
    L10:
        if (r11.length() != 5) goto L14;
        r3 = " = '" + r11 + "'";     // Catch: Exception -> L12
    L12:
        e = move-exception;
        e.printStackTrace();
        return cp5.OX110i(r11);
    L5:
        return cp5.OX110i(r11);
    }

    public final void O0i() {
        ContentResolver r0 = Utils.getApp().getContentResolver();
        iO r1 = iOI;
        r0.unregisterContentObserver(r1);
        String[] r2 = gb1.XIi00iiXO();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r2, r2.length)) == false) goto L6;
        Utils.getApp().getContentResolver().registerContentObserver(O0O0X0iOi, true, r1);
        return;
    }

    public final long O1() {
        return XOO0XOOii;
    }

    public final SleepDao O101() {
        return (SleepDao) X0i1O.getValue();
    }

    public final double O1iXiI() {
        return iiIOiX;
    }

    public final boolean OI() {
        return Ii0X0X;
    }

    public final void OX0(int r1) {
        Oi = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.s5
    public void OXO1(@aa1 Application r5) {
        Intrinsics.X0O(r5, "app");
        O11XO1X.XO0O10().X1ii(this);
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.XIi00iiXO("BleInitializer(smartv3).init() -> BleConnector hash: " + System.identityHashCode(BleConnector.INSTANCE));
        r0.O00(new XO0I0O());
        new BleConnector.Builder(r5).supportNordicOta(true).supportRealtekDfu(true).supportMtkOta(true).build().addHandleCallback(this);
        I1XII0X(r5);
        IIX(r5);
        O0i();
        BleCache r1 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L8:
        sc.XIi00iiXO(r5);
    L9:
        iOXOiI.OXO1.XOO0ii0(r5);
        AIWatchFaceManager.OXO1.X1ii(r5);
        WxManager.OXO1.Oi(r5);
        WAManager.OXO1.Ii1iii0(r5);
        return;
    L5:
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L8;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == false) goto L9;
        goto L8
    }

    public final void OXOO0X0i(boolean r1) {
        Ii0i = r1;
    }

    public final void OXXO0O1X(long r1) {
        XOO0XOOii = r1;
    }

    public final void OXi001(int r11) {
        if (q62.OXO1.OI1i1i() == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("handleInComingCall value=" + r11);
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.INCOMING_CALL, BleKeyFlag.UPDATE, r11, false, false, 24, null);
        return;
    }

    @sf5(tag = b01.XiOIO)
    public final void Oi1(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        if (BleConnector.INSTANCE.isBound() == false) goto L6;
        LogUtils.v(new Object[]{"BleInitializer onLocationWhere"});
        Xi1i0XOX0 = ns.XO0O10();
        iii0 = ns.XIi00iiXO(new XO0O10(), false, 2, null);
        return;
    }

    public final void OiO0IOX(boolean r1) {
        IO0iXO0O = r1;
    }

    public final void OiXI1OiX0(@tb1 BleNotification r1) {
        XOXiX0 = r1;
    }

    public final void X00110X() {
        ms r0 = iii0;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    public final AssetFileDescriptor X00O0() {
        return (AssetFileDescriptor) iXi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0I1(@aa1 List<Workout> r40) {
        Intrinsics.X0O(r40, "workouts");
        i1O0OXO1O.OXO1.OXO1("insert2MatchRecord -> " + r40.size());
        MatchRecordDao r1 = Xii();
        List<Workout> r0 = r40;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r3 = r0.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        Workout r4 = (Workout) r3.next();
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r14 = 0;
        int r15 = 0;
        int r18 = 0;
        int r19 = 0;
        MatchRecord r5 = new MatchRecord(0, 0, null, r10, r11, r12, null, r14, r15, null, null, r18, r19, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, at.IO, null);
        r5.setMSource(1);
        r5.setMMode(r4.getMMode());
        r5.setMStart(r4.getMStart());
        r5.setMLocalTime(r4.getMLocalTime());
        MatchPeriod r7 = new MatchPeriod(0, 0, r10, r11, r12, 0, r14, r15, 0, 0, r18, r19, bo0.iO, 0 == true ? 1 : 0);
        r7.setMDuration(r4.getMDuration());
        r7.setMDistance(r4.getMDistance() / 10);
        r7.setMStep(r4.getMStep());
        r7.setMCalorie(r4.getMCalorie() / 1000);
        r7.setMSpeed(r4.getMSpeed() / 100);
        r7.setMAvgBpm(r4.getMAvgBpm());
        r7.setMMaxBpm(r4.getMMaxBpm());
        r5.setMPeriod(r7);
        r5.setMMinBpm(r4.getMMinBpm());
        r5.setMAirPressure(r4.getMAirPressure());
        r5.setMPace(r4.getMPace());
        r5.setMMaxPace(r4.getMMaxPace());
        r5.setMMinPace(r4.getMMinPace());
        r5.setMSpm(r4.getMSpm());
        r5.setMMaxSpm(r4.getMMaxSpm());
        r5.setMMinSpm(r4.getMMinSpm());
        r5.setMAltitude(r4.getMAltitude());
        r5.setMMaxAltitude(r4.getMMaxAltitude());
        r5.setMMinAltitude(r4.getMMinAltitude());
        r2.add(r5);
        goto L4
    L6:
        r1.insert(r2);
    }

    public final DailyPowerDao X0iO() {
        return (DailyPowerDao) XOX0O0.getValue();
    }

    public final ElectrocardiogramDao X111IO() {
        return (ElectrocardiogramDao) OX110i.getValue();
    }

    public final WorkoutDao XIIO11I() {
        return (WorkoutDao) iIXi1iiXI.getValue();
    }

    public final void XIO11I(String r15) {
        LogUtils.d(new Object[]{"handleMissedCall -> " + r15});
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO) == true) goto L5;
        return;
    L5:
        IO0II0i = true;
        String r16 = iOI(r15);
        if (TextUtils.isEmpty(r16) == false) goto L10;
        r16 = ii0111XI();
        if (r16 != null) goto L10;
        r16 = "";
    L10:
        long r2 = new Date().getTime();
        String r6 = Utils.getApp().getString(R.string.missed_call);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        BleNotification r0 = new BleNotification(127, r2, BleNotification.PACKAGE_MISSED_CALL, r16, r6);
        i1O0OXO1O.OXO1.IiI10X("BleInitializer handleMissedCall -> Send Notification = " + r0);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r0, false, false, 24, null);
    }

    public final void XOIO11O(String r17) {
        LogUtils.d(new Object[]{"handleMissedCall2 -> " + r17});
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO) == true) goto L5;
        return;
    L5:
        IO0II0i = true;
        String r0 = iOI(r17);
        if (TextUtils.isEmpty(r0) == false) goto L10;
        r0 = ii0111XI();
        if (r0 != null) goto L10;
        r0 = "";
    L10:
        long r4 = new Date().getTime();
        String r9 = Utils.getApp().getString(R.string.missed_call);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        BleNotification2 r2 = new BleNotification2(127, r4, BleNotification.PACKAGE_MISSED_CALL, r0, r17, r9);
        i1O0OXO1O.OXO1.IiI10X("BleInitializer handleMissedCall2 -> Send Notification2 = " + r2);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, r2, false, false, 24, null);
    }

    public final void XOIX() {
        i72 r0 = i72.OXO1;
        BleCache r1 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r1.getMFirmwareFlag(), q62.IIIO1i) == false) goto L5;
        DateTimeFormat r2 = DateTimeFormat.ddMMyyyy;
    L6:
        r0.IXi01O(r2);
        LogUtils.d(new Object[]{"changeDateFormat => " + r0.XiOIO()});
        BaseBleCache.putInt$default(r1, BleKey.DATE_FORMAT, r0.XiOIO().getType(), null, 4, null);
        I01XX0.XIi00iiXO(I01XX0.IX0IXOi, null, 2, null);
        return;
    L5:
        r2 = r0.OII();
        goto L6
    }

    public final void XOO0XOOii() {
        i1O0OXO1O.OXO1.OXO1("configConnect");
        if (q62.OXO1.X0100I() == false) goto L6;
        BleConnector.INSTANCE.setScanMode(ScanMode.LOW_LATENCY);
        return;
    L6:
        BleConnector r0 = BleConnector.INSTANCE;
        r0.setScanMode(ScanMode.BALANCED);
        r0.setScanMaxDuration(12);
        r0.setForceConnectDirectly(false);
    }

    public final boolean XOXOIX0Oi() {
        return IO0II0i;
    }

    public final void XOXiX0() {
        a01 r0 = a01.OXO1;
        r0.XIi00iiXO().remove(DeviceConfigInfo.class.getName());
        if (i72.OXO1.XIO11I() == false) goto L5;
        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
    L5:
        r0.XIi00iiXO().clear();
        BleCache r1 = BleCache.INSTANCE;
        BaseBleCache.remove$default(r1, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.WEATHER_FORECAST3, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.IDENTITY, null, 2, null);
        r1.remove(BleKey.COACHING, BleKeyFlag.READ);
        BaseBleCache.remove$default(r1, BleKey.GAME_SET, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.POWER_SAVE_MODE, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.GAME_TIME_REMINDER, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.FIRMWARE_VERSION, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.UI_PACK_VERSION, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.CALORIES_GOAL, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.DISTANCE_GOAL, null, 2, null);
        BaseBleCache.remove$default(r1, BleKey.TOUCH_SET, null, 2, null);
        I01XX0.XIi00iiXO(I01XX0.IO, null, 2, null);
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
        FileUtils.delete(uz0.IiI10X(sz0.OXO1));
        r0.IiI10X().put(b01.iOOX010X, true);
        r0.IiI10X().remove(DcsToken.class.getName());
        XOIX();
        r0.IiI10X().put(b01.I1XOi1, "");
        r0.iO().remove(GetSNCodeHYKY.Response.class.getName());
    }

    public final void XX00XX(boolean r1) {
        IO0II0i = r1;
    }

    public final String XX00i10X(int r2) {
        if (r2 != 0) goto L4;
        return "IDLE";
    L4:
        if (r2 != 1) goto L6;
        return "RINGING";
    L6:
        if (r2 == 2) goto L9;
        return "UNKNOWN";
    L9:
        return "OFFHOOK";
    }

    public final VitalityDao XXI0XOIX() {
        return (VitalityDao) X00XIX1.getValue();
    }

    public final WorkoutIndexDao XXOXi() {
        return (WorkoutIndexDao) XXO.getValue();
    }

    public final long XXiO0i() {
        return X0iO;
    }

    public final BloodGlucoseDao Xi1i0XOX0() {
        return (BloodGlucoseDao) X100O.getValue();
    }

    public final MatchRecordDao Xii() {
        return (MatchRecordDao) X11I.getValue();
    }

    public final BloodPressureDao Xii11I() {
        return (BloodPressureDao) X1IX.getValue();
    }

    public final void i000X(final BleAgpsPrerequisite r10) {
        if (q62.OXO1.IIXXi1() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    L6:
        NetWorkUtils.INSTANCE.findAltitudeByLocation(r10.getMLongitude(), r10.getMLatitude(), new BleInitializer$sendAGPSData$1(r10));
    }

    public final void i0101i(boolean r1) {
        XXiIiX10 = r1;
    }

    public final boolean i0X1iIO() {
        return X00Xi1X;
    }

    public final HanBaoVibrationDao i100IXOX() {
        return (HanBaoVibrationDao) OO.getValue();
    }

    public final boolean i1O11001() {
        return IXI;
    }

    public final void i1iII1i1(boolean r1) {
        Ii0X0X = r1;
    }

    public final HeartRateDao iI0I() {
        return (HeartRateDao) XXX11i.getValue();
    }

    public final boolean iIIIiIO0() {
        return X1;
    }

    public final HrvDao iIX0i() {
        return (HrvDao) Ii1iii0.getValue();
    }

    public final int iIi0() {
        return Oi;
    }

    public final EnergyRatingDao iIi1() {
        return (EnergyRatingDao) iOiXi11II.getValue();
    }

    public final String iOI(String r8) {
        String r9 = IO0iXO0O(r8);
        if (PermissionUtils.isGranted(new String[]{"android.permission.READ_CONTACTS"}) == false) goto L5;
        Cursor r0 = Utils.getApp().getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(r9)), null, null, null, null);     // Catch: Exception -> L14
        if (r0 == null) goto L26;
        Cursor r1 = r0;     // Catch: Exception -> L14
        Cursor r2 = r1;     // Catch: Throwable -> L16
        if (r2.moveToNext() == false) goto L18;
        String r3 = r2.getString(r2.getColumnIndex("display_name"));     // Catch: Throwable -> L16
        Intrinsics.O10IXXX0X(r3, "getString(...)");     // Catch: Throwable -> L16
        String r4 = cp5.XX1Oi(r3);     // Catch: Throwable -> L16
        CloseableKt.OXO1(r1, null);     // Catch: Exception -> L14
        return r4;
    L18:
        Unit r5 = Unit.OXO1;     // Catch: Throwable -> L16
        CloseableKt.OXO1(r1, null);     // Catch: Exception -> L14
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        CloseableKt.OXO1(r1, th);     // Catch: Exception -> L14
        throw th;     // Catch: Exception -> L14
    L26:
        return O0O0X0iOi(r9);
    L14:
        e = move-exception;
        e.printStackTrace();
        return cp5.OX110i(r9);
    L5:
        return cp5.OX110i(r9);
    }

    public final Vibrator iOX() {
        return (Vibrator) O0O.getValue();
    }

    public final void iOXiO1O1I() {
        MediaPlayer r0 = IX0IXOi;
        if (r0 == null) goto L5;
        r0.stop();
        r0.release();
        IX0IXOi = null;
    L5:
        iOX().cancel();
    }

    public final void iX00X1X(double r1) {
        iiIOiX = r1;
    }

    public final boolean iX01() {
        return XXiIiX10;
    }

    public final void iXOII(boolean r1) {
        XOIX = r1;
    }

    public final AlipayBindInfoDao iXi() {
        return (AlipayBindInfoDao) XX1Oi.getValue();
    }

    public final void ii00OXXO(boolean r1) {
        XO0X10iO = r1;
    }

    @tb1
    public final String ii0111XI() {
        BleNotification r0 = XOXiX0;
        String r1 = null;
        if (r0 == null) goto L5;
        String r2 = r0.getMPackage();
    L7:
        if (Intrinsics.XOO0ii0(r2, BleNotification.GOOGLE_DUO) == false) goto L12;
        BleNotification r3 = XOXiX0;
        if (r3 == null) goto L11;
        r1 = r3.getMTitle();
    L11:
        r1 = String.valueOf(r1);
    L12:
        i1O0OXO1O.OXO1.OXO1("tryGetNameByNotification name -> " + r1);
        return r1;
    L5:
        r2 = null;
        goto L7
    }

    public final PressureDao iiII() {
        return (PressureDao) iiiO.getValue();
    }

    public final String iiIOiX(String r9, String r10) {
        String r0 = qu0.O00;
        String r1 = StringsKt__StringsKt.IiIiIiX(r9, qu0.O00);
        int r2 = r10.length();
        if (r1.length() <= r2) goto L19;
        String r3 = r1.substring(r2);
        Intrinsics.O10IXXX0X(r3, "substring(...)");
        if (oe5.O0(r3, "9", false, 2, null) == false) goto L8;
        return r9;
    L8:
        if (r3.length() > 0) goto L10;
        return r9;
    L10:
        if (oe5.O0(r3, "0", false, 2, null) == false) goto L12;
        return r9;
    L12:
        if (r3.length() <= 9) goto L14;
        return r9;
    L14:
        if (oe5.O0(r9, qu0.O00, false, 2, null) == true) goto L18;
        r0 = "";
    L18:
        return r0 + r10 + "9" + r3;
    L19:
        return r9;
    }

    public final BloodOxygenDao iii0() {
        return (BloodOxygenDao) iXiiiO.getValue();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
        super.onAICoachGeneratePlanUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICommandUpdate(@aa1 BleAICommand r1) {
        super.onAICommandUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onActivityRecognitionUpdate(int r1) {
        super.onActivityRecognitionUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmAdd(@aa1 BleAlarm r1) {
        super.onAlarmAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmDelete(int r1) {
        super.onAlarmDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmUpdate(@aa1 BleAlarm r1) {
        super.onAlarmUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppOpUpdate(@aa1 BleAppOp r1) {
        super.onAppOpUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppSportDataResponse(boolean r1) {
        super.onAppSportDataResponse(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo r1) {
        super.onBWNaviInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBacklightUpdate(int r1) {
        super.onBacklightUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBandKeyUpdate(@aa1 BleBandKey r1) {
        super.onBandKeyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleGolfScore(@aa1 BleGolfScore r1) {
        super.onBleGolfScore(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData r1) {
        super.onBleThirdPartyDataUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleVideoCallInfo(@aa1 BleVideoCallInfo r1) {
        super.onBleVideoCallInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPChatUpdate(@aa1 BleCPChat r1) {
        super.onCPChatUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo r1) {
        super.onCPGiftsInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPListenerUpdate(@aa1 BleCPListener r1) {
        super.onCPListenerUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPMissYouUpdate(@aa1 BleCPMissYou r1) {
        super.onCPMissYouUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPTodoUpdate(@aa1 BleCPTodo r1) {
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
    public /* bridge */ void onChatAppUpdate(@aa1 BleChatApp r1) {
        super.onChatAppUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatMessageUpdate(@aa1 BleChatMessage r1) {
        super.onChatMessageUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatVoiceUpdate(@aa1 BleChatVoice r1) {
        super.onChatVoiceUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay r1) {
        super.onCheckInEveryDayUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onClassicBluetoothStateChange(int r4) {
        if (r4 != 3) goto L6;
        i11I.postDelayed(new iXIiOiIOi(), 3000);
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandReply(@aa1 BleKey r1, @aa1 BleKeyFlag r2, boolean r3) {
        super.onCommandReply(r1, r2, r3);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onCommandSendTimeout(@aa1 BleKey r2, @aa1 BleKeyFlag r3) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "bleKeyFlag");
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
    public /* bridge */ void onDeviceConnected(@aa1 BluetoothDevice r1) {
        super.onDeviceConnected(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnecting(boolean r1) {
        super.onDeviceConnecting(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceFileUpdate(@aa1 BleDeviceFile r8) {
        Intrinsics.X0O(r8, "deviceFile");
        Date r0 = new Date();
        r0.setTime((((long) (r8.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - TimeZone.getDefault().getOffset(System.currentTimeMillis()));
        File r1 = new File(uz0.XiOIO(sz0.OXO1), O0X11OiO.IO0iXO0O().format(r0) + com.tenmeter.smlibrary.utils.FileUtils.FILE_EXTENSION_SEPARATOR + r8.getMFileFormat());
        if (r8.getMFileSize() == 0) goto L6;
        FileIOUtils.writeFileFromBytesByStream(r1, r8.getMFileContent(), true);
    L6:
        if (r8.getMFileSize() == (r8.getMOffsetValue() + r8.getMFileContent().length)) goto L8;
        return;
    L8:
        if (r8.getMFileFormat() != 3) goto L14;
        byte[] r9 = FileIOUtils.readFile2BytesByChannel(r1);
        if (r9.length <= 4) goto L15;
        Intrinsics.XXI(r9);
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        int r6 = ByteArrayExtKt.getInt(r9, 0, 2, r2);
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        int r3 = ByteArrayExtKt.getInt(r9, 2, 2, r2);
        LogUtils.d(new Object[]{"onDeviceFileUpdate -> " + r6 + ", " + r3});
        byte[] r10 = ArraysKt___ArraysJvmKt.I0IIOI(r9, 4, r9.length);
        ArraysKt___ArraysKt.OOOI(r10);
        Bitmap r4 = Bitmap.createBitmap(r6, r3, Bitmap.Config.RGB_565);
        Intrinsics.O10IXXX0X(r4, "createBitmap(...)");
        r4.copyPixelsFromBuffer(ByteBuffer.wrap(r10));
        ImageUtils.save(ImageUtils.rotate(r4, 180, r4.getWidth() / 2.0f, r4.getHeight() / 2.0f), r1.getPath() + ".png", Bitmap.CompressFormat.PNG);
        ToastUtils.showLong("图片保存成功!", new Object[0]);
        return;
    L15:
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceOpUpdate(int r1) {
        super.onDeviceOpUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceRequestAGpsFile(@aa1 String r4) {
        Intrinsics.X0O(r4, "url");
        AGPSInitializer.I1(AGPSInitializer.IO, false, null, 2, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply r10) {
        Intrinsics.X0O(r10, "smsQuickReply");
        String r2 = r10.getMPhone();
        Iterator r0 = BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleSMSQuickReplyContent.class, null, 4, null).iterator();
    L3:
        String r3 = null;
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (((BleSMSQuickReplyContent) r1).getMId() != r10.getMId()) goto L3;
    L9:
        BleSMSQuickReplyContent r4 = (BleSMSQuickReplyContent) r1;
        if (r4 == null) goto L13;
        r3 = r4.getMContent();
    L13:
        if (TextUtils.isEmpty(r2) == false) goto L15;
        return;
    L15:
        if (TextUtils.isEmpty(r3) == true) goto L25;
        LogUtils.d(new Object[]{"sms -> p:" + r2 + " , c:" + r3});
        int r11 = SmsManager.getDefaultSmsSubscriptionId();
        StringBuilder r5 = new StringBuilder();
        r5.append("Default subId ");
        r5.append(r11);
        LogUtils.d(new Object[]{r5.toString()});
        SmsManager r6 = SmsManager.getSmsManagerForSubscriptionId(r11);
        ArrayList<String> r12 = r6.divideMessage(r3);
        Intrinsics.O10IXXX0X(r12, "divideMessage(...)");
        Iterator<String> r13 = r12.iterator();
    L18:
        if (r13.hasNext() == false) goto L26;
        r6.sendTextMessage(r2, null, r13.next(), null, null);
        goto L18
    L26:
        return;
    L25:
        return;
    L8:
        r1 = null;
        goto L9
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSportDataUpdate(@aa1 BleDeviceSportData r1) {
        super.onDeviceSportDataUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDistanceGoalUpdate(int r1) {
        super.onDistanceGoalUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings r1) {
        super.onDoubleScreenSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings r1) {
        super.onDrinkWaterUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings r1) {
        super.onEarphoneAncSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneCallUpdate(int r1) {
        super.onEarphoneCallUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneKeyUpdate(@aa1 BleEarphoneKey r1) {
        super.onEarphoneKeyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings r1) {
        super.onEarphoneSoundEffectsSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneStateUpdate(@aa1 BleEarphoneState r1) {
        super.onEarphoneStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFactoryTestUpdate(@aa1 BleFactoryTest r1) {
        super.onFactoryTestUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFallSetUpdate(int r1) {
        super.onFallSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFindEarphoneUpdate(@aa1 BleFindEarphone r1) {
        super.onFindEarphoneUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onFindPhone(boolean r3) {
        if (r3 == true) goto L4;
        iOXiO1O1I();
        return;
    L4:
        if (q62.OXO1.XIOX1() == false) goto L6;
        I01XX0.XIi00iiXO(I01XX0.i0X000X0O, null, 2, null);
    L6:
        IXO0OOi();
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
    public void onFollowSystemLanguage(boolean r17) {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XIi00iiXO();
        Languages r2 = Languages.INSTANCE;
        r1.put(b01.i010I, Languages.languageToCode$default(r2, null, 0, 3, null));
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.LANGUAGE, BleKeyFlag.UPDATE, r0.XIi00iiXO().getInt(b01.i010I, Languages.languageToCode$default(r2, null, 0, 3, null)), false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGameControlUpdate(@aa1 BleGameControl r1) {
        super.onGameControlUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWake2Update(@aa1 BleGestureWake2 r1) {
        super.onGestureWake2Update(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWakeUpdate(@aa1 BleGestureWake r1) {
        super.onGestureWakeUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo r1) {
        super.onGoogleNaviInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onHIDState(int r1) {
        super.onHIDState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onHIDValueChange(int r3) {
        MyNotificationListenerService.OXO1 r4 = MyNotificationListenerService.O001I;
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        r4.OXO1(r0);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onHRWarningSet(@aa1 BleHrWarningSettings r1) {
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
    public /* bridge */ void onHydrationUpdate(@aa1 BleHydrationSettings r1) {
        super.onHydrationUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCExceptionUpdate(@aa1 BleIPCException r1) {
        super.onIPCExceptionUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCOTAStateUpdate(@aa1 BleIPCOTAState r1) {
        super.onIPCOTAStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStateUpdate(@aa1 BleIPCState r1) {
        super.onIPCStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo r1) {
        super.onIPCStoresInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo r1) {
        super.onIPCWifiInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onIdentityCreate(boolean r3, @tb1 BleDeviceInfo r4) {
        if (r3 == false) goto L5;
        XOIIOO.X0i1O.XIi00iiXO();
        DeviceInfoChecker.O10IXXX0X(DeviceInfoChecker.OXO1, null, null, 3, null);
        ov0.OXO1.OXO1(r4);
        a01.OXO1.IiI10X().put(b01.O101, q62.OXO1.XiXIX());
        I01XX0.XIi00iiXO(b01.XiOIO, null, 2, null);
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIdentityDelete(boolean r1) {
        super.onIdentityDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onIdentityDeleteByDevice(boolean r3) {
        if (Ii0X0X == true) goto L8;
        BleConnector r4 = BleConnector.INSTANCE;
        if (r4.isBound() == false) goto L9;
        i1O0OXO1O.OXO1.OXO1("onIdentityDeleteByDevice onUnbind");
        r4.closeConnection(true);
        O0Ii(false);
        return;
    L9:
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIncomingCallRingUpdate(int r1) {
        super.onIncomingCallRingUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    @SuppressLint({"MissingPermission"})
    public void onIncomingCallStatus(int r10) {
        if (r10 != 0) goto L9;
        PermissionUtils r3 = PermissionUtils.permission(new String[]{"PHONE"});     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r3, "permission(...)");     // Catch: Exception -> L6
        ds1.iO(r3, null, null, new OI1i0i0X(), 3, null);     // Catch: Exception -> L6
        Unit r11 = Unit.OXO1;     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        Unit r12 = Unit.OXO1;
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L19;
        PermissionUtils r4 = PermissionUtils.permission(new String[]{"PHONE"});
        Intrinsics.O10IXXX0X(r4, "permission(...)");
        ds1.iO(r4, null, null, new OXiiIX0i(), 3, null);
        return;
    L19:
        Class<?> r13 = Class.forName("com.android.internal.telephony.ITelephony");     // Catch: Exception -> L12
        Class<?> r2 = r13.getClasses()[0];     // Catch: Exception -> L12
        Class<?> r5 = Class.forName("android.os.ServiceManager");     // Catch: Exception -> L12
        Class<?> r6 = Class.forName("android.os.ServiceManagerNative");     // Catch: Exception -> L12
        Method r7 = r5.getMethod("getService", new Class[]{String.class});     // Catch: Exception -> L12
        Method r8 = r6.getMethod("asInterface", new Class[]{IBinder.class});     // Catch: Exception -> L12
        Binder r9 = new Binder();     // Catch: Exception -> L12
        r9.attachInterface(null, "fake");     // Catch: Exception -> L12
        Object r14 = r7.invoke(r8.invoke(null, new Object[]{r9}), new Object[]{"phone"});     // Catch: Exception -> L12
        Intrinsics.X1ii(r14, "null cannot be cast to non-null type android.os.IBinder");     // Catch: Exception -> L12
        r13.getMethod("endCall", new Class[0]).invoke(r2.getMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{(IBinder) r14}), new Object[0]);     // Catch: Exception -> L12
        return;
    L12:
        e = move-exception;
        e.printStackTrace();
        LogUtils.d(new Object[]{"hang up error " + Unit.OXO1});
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUpdate(@aa1 BleLoveTap r1) {
        super.onLoveTapUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserDelete(int r1) {
        super.onLoveTapUserDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserUpdate(@aa1 BleLoveTapUser r1) {
        super.onLoveTapUserUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeasurementUpdate(@aa1 BleMeasurement r1) {
        super.onMeasurementUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmAdd(@aa1 BleMedicationAlarm r1) {
        super.onMedicationAlarmAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmDelete(int r1) {
        super.onMedicationAlarmDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm r1) {
        super.onMedicationAlarmUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderDelete(int r1) {
        super.onMedicationReminderDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderUpdate(@aa1 BleMedicationReminder r1) {
        super.onMedicationReminderUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderAdd(@aa1 BleMeetingReminder r1) {
        super.onMeetingReminderAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderDelete(int r1) {
        super.onMeetingReminderDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderUpdate(@aa1 BleMeetingReminder r1) {
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
    public /* bridge */ void onNaviInfoUpdate(@aa1 BleNaviInfo r1) {
        super.onNaviInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNoDisturbUpdate(@aa1 BleNoDisturbSettings r1) {
        super.onNoDisturbUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
        super.onNotificationLightScreenSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationSettings2Update(@aa1 BleNotificationSettings2 r1) {
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
    public void onQiblaSettingsUpdate() {
        BleCache r0 = BleCache.INSTANCE;
        BleKey r1 = BleKey.QIBLA_SET;
        BleQiblaSettings r4 = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(r0, r1, BleQiblaSettings.class, null, null, 12, null);
        CustomLocation r2 = UtilsKt.XXIIO1i11();
        Calendar r3 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r3, "getInstance(...)");
        long r10 = O0X11OiO.XiOIii1(r3);
        r4.setMStartTime((int) (System.currentTimeMillis() / ((long) 1000)));
        SPUtils r5 = a01.OXO1.OXO1();
        Object r6 = new Gson().fromJson(r5.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r6 != null) goto L5;
        r6 = PrayerTimeSettings.class.newInstance();
    L5:
        r4.setMPrayerTimes(PrayerTimesKt.toBlePrayerTimes(PrayerTimesKt.getPrayerTimeMap$default((PrayerTimeSettings) r6, r2.XO0O10(), r2.IiI10X(), r10, 0, 16, null)));
        XOXO0X00I r7 = O0X11OiO.O10IXXX0X(r10, 0, 2, null);
        r4.setMHijriYear(r7.I0IIOi());
        r4.setMHijriMonth(r7.XOO0ii0());
        r4.setMHijriDay(r7.IiI10X());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, r1, BleKeyFlag.UPDATE, r4, false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan r1) {
        super.onReadAICoachGenerateBeforeInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r1) {
        super.onReadAICoachGenerateBeforeInfoV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan r1) {
        super.onReadAICoachPlan(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 r1) {
        super.onReadAICoachPlanV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadActivity(@aa1 List<BleActivity> r8) {
        Intrinsics.X0O(r8, "activities");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new O00(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivityDetail(@aa1 BleActivityDetail r1) {
        super.onReadActivityDetail(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAddressBook(@aa1 BleAddressBook r1) {
        super.onReadAddressBook(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlarm(@aa1 List<BleAlarm> r1) {
        super.onReadAlarm(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> r8) {
        Intrinsics.X0O(r8, "alipayBindInfos");
        LogUtils.d(new Object[]{r8});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new IiI10X(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipaySettings(@aa1 BleAlipaySettings r1) {
        super.onReadAlipaySettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppApiVersion(@aa1 String r1) {
        super.onReadAppApiVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppInfoList(@aa1 BleAppInfoList r1) {
        super.onReadAppInfoList(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppSportState(@aa1 BleAppSportState r1) {
        super.onReadAppSportState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> r1) {
        super.onReadAvgHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBAC(@aa1 List<BleBAC> r1) {
        super.onReadBAC(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacCalibration(@aa1 BleBacCalibration r1, @aa1 BleKeyFlag r2) {
        super.onReadBacCalibration(r1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacklight(int r1) {
        super.onReadBacklight(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBatteryUsage(@aa1 BleBatteryUsage r1) {
        super.onReadBatteryUsage(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleAddress(@aa1 String r1) {
        super.onReadBleAddress(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo r1) {
        super.onReadBleGolfMapCacheInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch r1) {
        super.onReadBleGolfSportSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo r1) {
        super.onReadBleGolfWatchMapInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo r1) {
        super.onReadBleGolfWatchVersionInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBleHrv(@aa1 List<BleHrv> r8) {
        Intrinsics.X0O(r8, q62.XOX1);
        LogUtils.d(new Object[]{r8});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new XOO0ii0(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBleLogText(@aa1 List<BleLogText> r13) {
        Intrinsics.X0O(r13, uz0.OXO1);
        if (r13.isEmpty() == true) goto L44;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L9
        Iterator<T> r0 = r13.iterator();     // Catch: Exception -> L9
    L7:
        if (r0.hasNext() == false) goto L12;
        OIXO1IIOO.XOO0XOOii(r1, ((BleLogText) r0.next()).coMotionRecords());     // Catch: Exception -> L9
        goto L7
    L12:
        if (r1.isEmpty() == true) goto L32;
        File r14 = new File(uz0.X0i1O(sz0.OXO1), "cm_logs");     // Catch: Exception -> L9
        if (r14.mkdirs() == false) goto L16;
    L18:
        FileOutputStream r15 = new FileOutputStream(new File(r14, O0X11OiO.O00().format(new Date()) + ".bin"), true);     // Catch: Exception -> L9
        Iterator r2 = r1.iterator();     // Catch: Throwable -> L23
    L21:
        if (r2.hasNext() == false) goto L25;
        r15.write((byte[]) r2.next());     // Catch: Throwable -> L23
        goto L21
    L25:
        Unit r3 = Unit.OXO1;     // Catch: Throwable -> L23
        CloseableKt.OXO1(r15, null);     // Catch: Exception -> L9
        return;
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        CloseableKt.OXO1(r15, th);     // Catch: Exception -> L9
        throw th;     // Catch: Exception -> L9
    L16:
        if (r14.exists() == true) goto L18;
        return;
    L32:
        iI0OiO.IO(uz0.iO(sz0.OXO1, O0X11OiO.O00().format(new Date()) + ".txt"), CollectionsKt___CollectionsKt.XOiXXOO(r13, "\n", null, null, 0, null, new OX1XXi(), 30, null), null, 2, null);     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodGlucose(@aa1 List<BleBloodGlucose> r8) {
        Intrinsics.X0O(r8, "bloodGlucoses");
        LogUtils.d(new Object[]{r8});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new I0IIOi(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings r1) {
        super.onReadBloodOxyGenSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodOxygen(@aa1 List<BleBloodOxygen> r8) {
        Intrinsics.X0O(r8, "bloodOxygen");
        LogUtils.d(new Object[]{r8});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new OIi0(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodPressure(@aa1 List<BleBloodPressure> r8) {
        Intrinsics.X0O(r8, "bloodPressures");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new OIX0iXi(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration r1) {
        super.onReadBloodPressureCalibration(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBodyStatus(@aa1 List<BleBodyStatus> r1) {
        super.onReadBodyStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCPUserInfo(@aa1 BleCPUserInfo r1) {
        super.onReadCPUserInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalibrationData(@aa1 BleCalibrationData r1) {
        super.onReadCalibrationData(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalorieIntake(@aa1 List<BleCalorieIntake> r1) {
        super.onReadCalorieIntake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCaloriesGoal(int r1) {
        super.onReadCaloriesGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadChatApp(@aa1 BleChatApp r1) {
        super.onReadChatApp(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay r1) {
        super.onReadCheckInEveryDay(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadClassicBluetoothState(int r1) {
        super.onReadClassicBluetoothState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCoachingIds(@aa1 BleCoachingIds r1) {
        super.onReadCoachingIds(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadCyWeeAlgorithm(@aa1 final BleCyWeeAlgorithm r6) {
        Intrinsics.X0O(r6, "bleCyWeeAlgorithm");
        UploadServiceRequestBody r0 = iI10I11.OXO1.OIi0(15);
        if (r0.getData().isEmpty() == true) goto L14;
        BleCyWeeAlgorithm r1 = (BleCyWeeAlgorithm) new Gson().fromJson(a01.OXO1.iO().getString(BleCyWeeAlgorithm.class.getName()), BleCyWeeAlgorithm.class);
        if (r1 != null) goto L7;
    L12:
        DataBody r2 = (DataBody) CollectionsKt___CollectionsKt.IIII0iI(r0.getData());
        String r3 = GsonUtils.toJson(new CyWeeRemark(r6.getMUUID(), r6.getMType()));
        Intrinsics.O10IXXX0X(r3, "toJson(...)");
        r2.setRemark(r3);
        String r4 = GsonUtils.toJson(r0);
        i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> " + r4 + " - CyWee");
        NetWorkUtils r5 = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(r4);
        r5.postRequest(r4, new O00IO0i(r6));
        return;
    L7:
        if (Intrinsics.XOO0ii0(r1.getMUUID(), r6.getMUUID()) == false) goto L12;
        if (r1.getMType() != r6.getMType()) goto L12;
        i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> cache = bleCyWeeAlgorithm");
        return;
    L14:
        i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> CyWee data null");
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadDailyPower(@aa1 List<BlePhysicalPower> r8) {
        Intrinsics.X0O(r8, "powers");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new I0iXXO(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDateFormat(int r1) {
        super.onReadDateFormat(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFile(@aa1 BleDeviceFile r1) {
        super.onReadDeviceFile(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFileV2(@aa1 BleDeviceFile2 r1) {
        super.onReadDeviceFileV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo(@aa1 BleDeviceInfo r1) {
        super.onReadDeviceInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo2(@aa1 BleDeviceInfo2 r1) {
        super.onReadDeviceInfo2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages(@aa1 BleDeviceLanguages r1) {
        super.onReadDeviceLanguages(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 r1) {
        super.onReadDeviceLanguages2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings r1) {
        super.onReadDeviceUniqueDataSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDistanceGoal(int r1) {
        super.onReadDistanceGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings r1) {
        super.onReadDoubleScreenSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDrinkWater(@aa1 BleDrinkWaterSettings r1) {
        super.onReadDrinkWater(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadECGRealtime(@aa1 BleECGRealtime r1) {
        super.onReadECGRealtime(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings r1) {
        super.onReadEarphoneAncSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneCall(int r1) {
        super.onReadEarphoneCall(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneInfo(@aa1 BleEarphoneInfo r1) {
        super.onReadEarphoneInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneKey(@aa1 BleEarphoneKey r1) {
        super.onReadEarphoneKey(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphonePower(@aa1 BleEarphonePower r1) {
        super.onReadEarphonePower(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings r1) {
        super.onReadEarphoneSoundEffectsSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEarphoneState(@aa1 BleEarphoneState r2) {
        Intrinsics.X0O(r2, "earphoneState");
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEcg(@aa1 List<BleEcg> r2) {
        Intrinsics.X0O(r2, "ecgs");
        ThreadUtils.executeByIo(new XXI(r2));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcgSettings(@aa1 BleEcgSettings r1) {
        super.onReadEcgSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEnergyRating(@aa1 List<BleEnergyRating> r8) {
        Intrinsics.X0O(r8, "energyRating");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new X1ii(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFallSet(int r1) {
        super.onReadFallSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFilePath(@aa1 BleAppAudioBookList r1) {
        super.onReadFilePath(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadFirmwareVersion(@aa1 String r5) {
        Intrinsics.X0O(r5, "version");
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        String r0 = UtilsKt.OX();
        hr1 r1 = hr1.OXO1;
        Application r2 = Utils.getApp();
        Intrinsics.O10IXXX0X(r2, "getApp(...)");
        r6.OXO1("info:\n" + r0 + "\n" + r1.OO(r2));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFoodBalance(@aa1 List<BleFoodBalance> r1) {
        super.onReadFoodBalance(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake(@aa1 BleGestureWake r1) {
        super.onReadGestureWake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake2(@aa1 BleGestureWake2 r1) {
        super.onReadGestureWake2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly r1) {
        super.onReadGirlCareMonthly(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareSettings(@aa1 BleGirlCareSettings r1) {
        super.onReadGirlCareSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadGoMoreSettings(@aa1 BleGoMoreSettings r5) {
        Intrinsics.X0O(r5, "goMoreSettings");
        if (BleConnector.INSTANCE.isNeedBind() == true) goto L5;
        return;
    L5:
        r5.setMType(q62.OXO1.XiOIO(r5.getMType()));
        BleGoMoreSettings r0 = (BleGoMoreSettings) new Gson().fromJson(a01.OXO1.iO().getString(BleGoMoreSettings.class.getName()), BleGoMoreSettings.class);
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        r1.OXO1("cache -> " + r0);
        if (TextUtils.isEmpty(r5.getMKey()) == false) goto L9;
        DeviceInfoChecker.OXO1.XiOIO(r5.getMUuid(), r5.getMType(), r5.getMClientId());
        return;
    L9:
        r1.OXO1("getGoMoreAuthKey -> " + r5.getMType() + " - GoMore activated!");
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGolfWatchScore(@aa1 BleGolfWatchScore r1) {
        super.onReadGolfWatchScore(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGpsFirmwareVersion(@aa1 String r1) {
        super.onReadGpsFirmwareVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoSettings(@aa1 BleHanBaoSettings r1) {
        super.onReadHanBaoSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> r8) {
        Intrinsics.X0O(r8, "hanBaoVibrations");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new O10IXXX0X(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadHeartRate(@aa1 List<BleHeartRate> r8) {
        Intrinsics.X0O(r8, "heartRates");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new X0O(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRateZones(@aa1 BleHeartRateZones r1) {
        super.onReadHeartRateZones(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHourSystem(int r1) {
        super.onReadHourSystem(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings r1) {
        super.onReadHrMonitoringSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
        super.onReadHrMonitoringSettingsV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvBaseLine(@aa1 BleHrvBaseLine r1) {
        super.onReadHrvBaseLine(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings r1) {
        super.onReadHrvMonitoringSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHydrationSettings(@aa1 BleHydrationSettings r1) {
        super.onReadHydrationSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCInfo(@aa1 BleIPCInfo r1) {
        super.onReadIPCInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCState(@aa1 BleIPCState r1) {
        super.onReadIPCState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo r1) {
        super.onReadIPCStoresInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCVersion(@aa1 String r1) {
        super.onReadIPCVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIncomingCallRing(int r1) {
        super.onReadIncomingCallRing(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLactateThreshold(@aa1 List<BleLactateThreshold> r1) {
        super.onReadLactateThreshold(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguage(int r1) {
        super.onReadLanguage(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion r1) {
        super.onReadLanguagePackVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadLocation(@aa1 List<BleLocation> r8) {
        Intrinsics.X0O(r8, "locations");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new I1XOi1(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLoveTapUser(@aa1 List<BleLoveTapUser> r1) {
        super.onReadLoveTapUser(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord(@aa1 List<BleMatchRecord> r8) {
        Intrinsics.X0O(r8, "matchRecords");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new IIX1OXO(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord2(@aa1 List<BleMatchRecord2> r8) {
        Intrinsics.X0O(r8, "matchRecords");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new XiOIO(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord3(@aa1 List<BleMatchRecord3> r8) {
        Intrinsics.X0O(r8, "matchRecords");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new iIiiO(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> r1) {
        super.onReadMedicationAlarm(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationReminder(@aa1 List<BleMedicationReminder> r1) {
        super.onReadMedicationReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMeetingReminder(@aa1 List<BleMeetingReminder> r1) {
        super.onReadMeetingReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMindStatus(@aa1 List<BleMindStatus> r1) {
        super.onReadMindStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMtkOtaMeta() {
        super.onReadMtkOtaMeta();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMultiFileTransfer(@aa1 BleMapFileList r1) {
        super.onReadMultiFileTransfer(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNetworkFirmwareVersion(@aa1 String r1) {
        super.onReadNetworkFirmwareVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNoDisturb(@aa1 BleNoDisturbSettings r1) {
        super.onReadNoDisturb(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
        super.onReadNotificationLightScreenSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationSettings2(@aa1 BleNotificationSettings2 r1) {
        super.onReadNotificationSettings2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings r1) {
        super.onReadOfflineAsrSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOngoingDialogue(int r1) {
        super.onReadOngoingDialogue(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo r10) {
        Intrinsics.X0O(r10, "optionalMapAuthInfo");
        BleConnector r1 = BleConnector.INSTANCE;
        if (r1.isNeedBind() == true) goto L5;
        return;
    L5:
        a01 r0 = a01.OXO1;
        BleOptionalMapAuthInfo r2 = (BleOptionalMapAuthInfo) new Gson().fromJson(r0.iO().getString(BleOptionalMapAuthInfo.class.getName()), BleOptionalMapAuthInfo.class);
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        r3.OXO1("onReadOptionalMapAuthInfo cache -> " + r2);
        if (TextUtils.isEmpty(r10.getMKey()) == false) goto L20;
        String r4 = r10.getMUuid();
        if (r2 == null) goto L10;
        String r5 = r2.getMUuid();
    L12:
        if (Intrinsics.XOO0ii0(r4, r5) == true) goto L14;
    L17:
        OffLineMapManagerKt.O00(r10.getMUuid(), null, 2, null);
        return;
    L14:
        if (r2.getMKey().length() <= 0) goto L17;
        BaseBleConnector.sendObject$default(r1, BleKey.OPTIONAL_MAP_AUTH_INFO, BleKeyFlag.UPDATE, r2, false, false, 24, null);
        return;
    L10:
        r5 = null;
        goto L12
    L20:
        if (r10.getMUuid().length() > 0) goto L22;
    L24:
        r3.OXO1("getGoMoreAuthKey -> " + r10.getMUuid() + " - GoMore activated! - " + r10.getMKey());
        return;
    L22:
        if (r10.getMKey().length() <= 0) goto L24;
        r0.iO().put(BleOptionalMapAuthInfo.class.getName(), new Gson().toJson(r10));
        goto L24
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadPackageStatus(@aa1 BlePackageStatus r2) {
        Intrinsics.X0O(r2, "packageStatus");
        I01XX0.OXO1(I01XX0.X00XIX1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower(int r1) {
        super.onReadPower(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower2(@aa1 BlePower2 r1) {
        super.onReadPower2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadPressure(@aa1 List<BlePressure> r8) {
        Intrinsics.X0O(r8, "pressures");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new XX0(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement r1) {
        super.onReadPressureTimingMeasurement(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadQiblaSettings(@aa1 BleQiblaSettings r1) {
        super.onReadQiblaSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRecordControl(@aa1 BleRecordControl r1) {
        super.onReadRecordControl(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRelaxReminder(@aa1 BleRelaxReminder r1) {
        super.onReadRelaxReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> r8) {
        Intrinsics.X0O(r8, "rate");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new OiIIX101O(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRestingHeartRate(int r1) {
        super.onReadRestingHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRingVibrationSet(@aa1 BleRingVibrationSettings r1) {
        super.onReadRingVibrationSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadRri(@aa1 List<BleRri> r9) {
        Intrinsics.X0O(r9, "rris");
        ThreadUtils.executeByIo(new XiOIii1(r9, new Date(), TimeZone.getDefault().getOffset(System.currentTimeMillis()), O0X11OiO.O00(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSDCardInfo(@aa1 BleSDCardInfo r1) {
        super.onReadSDCardInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGCameraSet(@aa1 BleSGCameraSet r1) {
        super.onReadSGCameraSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeySet(@aa1 BleSGKeySet r1) {
        super.onReadSGKeySet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake r1) {
        super.onReadSGKeywordAwake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSet(@aa1 BleSGSet r1) {
        super.onReadSGSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSleepSet(int r1) {
        super.onReadSGSleepSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSOSSettings(@aa1 BleSOSSettings r1) {
        super.onReadSOSSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadScreenBrightnessSet(int r1) {
        super.onReadScreenBrightnessSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSedentariness(@aa1 BleSedentarinessSettings r1) {
        super.onReadSedentariness(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleep(@aa1 List<BleSleep> r9) {
        Intrinsics.X0O(r9, "sleeps");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new OII(r9, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6, BleCache.INSTANCE.getMSleepAlgorithmType()));
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
    public /* bridge */ void onReadSleepQuality(@aa1 BleSleepQuality r1) {
        super.onReadSleepQuality(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleepQualityScore(int r3) {
        I01XX0.XIi00iiXO(I01XX0.Xi, null, 2, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleepRaw(@aa1 byte[] r4) {
        Intrinsics.X0O(r4, "sleepRawData");
        iI0OiO.IO(uz0.XO0O10(sz0.OXO1, O0X11OiO.OIX0iXi().format(new Date()) + ".txt"), ByteArrayExtKt.getMHexString(r4), null, 2, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
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
    public /* bridge */ void onReadSosCallLog(@aa1 List<BleSosCallLog> r1) {
        super.onReadSosCallLog(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSosContact(@aa1 BleSosContact r1) {
        super.onReadSosContact(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSportDurationGoal(int r1) {
        super.onReadSportDurationGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet r1) {
        super.onReadStandbyWatchFaceSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStepGoal(int r1) {
        super.onReadStepGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(@aa1 List<BleStock> r1) {
        super.onReadStock(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadTemperature(@aa1 List<BleTemperature> r8) {
        Intrinsics.X0O(r8, "temperatures");
        LogUtils.d(new Object[]{r8});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new OX(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperatureUnit(int r1) {
        super.onReadTemperatureUnit(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTrainingStatus(@aa1 List<BleTrainingStatus> r1) {
        super.onReadTrainingStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTuyaKey(@aa1 BleTuyaKey r1) {
        super.onReadTuyaKey(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUiPackVersion(@aa1 String r1) {
        super.onReadUiPackVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUnit(int r1) {
        super.onReadUnit(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUserProfile(@aa1 BleUserProfile r1) {
        super.onReadUserProfile(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadVitalityValue(@aa1 List<BleVitality> r8) {
        Intrinsics.X0O(r8, "vitalityValue");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new I1(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVoiceControl(int r1) {
        super.onReadVoiceControl(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceId(@aa1 BleWatchFaceId r1) {
        super.onReadWatchFaceId(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex r1) {
        super.onReadWatchFaceIndex(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize r1) {
        super.onReadWatchFaceMaxSize(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceSwitch(int r1) {
        super.onReadWatchFaceSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchPassword(@aa1 BleSettingWatchPassword r1) {
        super.onReadWatchPassword(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWearWayState(int r1) {
        super.onReadWearWayState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWeatherRealTime(boolean r4) {
        BleCache r5 = BleCache.INSTANCE;
        BaseBleCache.remove$default(r5, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(r5, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(r5, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(r5, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(r5, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(r5, BleKey.WEATHER_FORECAST3, null, 2, null);
        WeatherInitializer.IO.XX0();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWechatPaySettings(@aa1 BleWechatPaySettings r1) {
        super.onReadWechatPaySettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout(@aa1 List<BleWorkout> r8) {
        Intrinsics.X0O(r8, "workouts");
        LogUtils.i(new Object[]{"onReadWorkout " + BleCache.INSTANCE + ".mPlatform"});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new iOOX010X(r8, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout2(@aa1 List<BleWorkout2> r8) {
        Intrinsics.X0O(r8, "workouts");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new X01IiOiIi(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout3(@aa1 List<BleWorkout3> r8) {
        Intrinsics.X0O(r8, "workouts");
        LogUtils.i(new Object[]{"onReadWorkout3 " + BleCache.INSTANCE + ".mPlatform"});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new II1Xi0(r8, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout4(@aa1 List<BleWorkout4> r8) {
        Intrinsics.X0O(r8, "workouts");
        LogUtils.i(new Object[]{"onReadWorkout4 " + BleCache.INSTANCE + ".mPlatform"});
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new i010I(r8, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation r1) {
        super.onReadWorkout4Segmentation(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorldClock(@aa1 List<BleWorldClock> r1) {
        super.onReadWorldClock(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement r1) {
        super.onRealTimeMeasurement(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveCmTrace(@aa1 byte[] r6, boolean r7) {
        Intrinsics.X0O(r6, "data");
        if (r7 == false) goto L12;
        File r0 = new File(uz0.X0i1O(sz0.OXO1), "cm_data");     // Catch: Exception -> L9
        if (r0.mkdirs() == false) goto L7;
    L11:
        File r1 = new File(r0, new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date()) + ".bin");     // Catch: Exception -> L9
    L15:
        if (r7 == false) goto L17;
        i1O0OXO1O.OXO1.OXO1("saveCmTrace started file=" + r1.getPath());     // Catch: Exception -> L9
    L17:
        FileOutputStream r2 = new FileOutputStream(r1, !r7);     // Catch: Exception -> L9
        r2.write(r6);     // Catch: Throwable -> L22
        Unit r8 = Unit.OXO1;     // Catch: Throwable -> L22
    L20:
        CloseableKt.OXO1(r2, null);     // Catch: Exception -> L9
        Xii11I = r1;     // Catch: Exception -> L9
        return;
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        CloseableKt.OXO1(r2, th);     // Catch: Exception -> L9
        throw th;     // Catch: Exception -> L9
    L7:
        if (r0.exists() == true) goto L11;
        return;
    L12:
        r1 = Xii11I;     // Catch: Exception -> L9
        if (r1 == null) goto L27;
        Intrinsics.XXI(r1);     // Catch: Exception -> L9
        goto L15
    L27:
        i1O0OXO1O.OXO1.XIi00iiXO("saveCmTrace ignored data without header, bytes=" + r6.length);     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO("saveCmTrace failed: " + e.getMessage());
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveFilePacket(@aa1 BleReceiveFilePacket r1) {
        super.onReceiveFilePacket(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> r5) {
        Intrinsics.X0O(r5, "gSensorMotions");
        SimpleDateFormat r0 = O0X11OiO.O00();
        SimpleDateFormat r1 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new iX(r5, new Date(), r0, r1));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> r1) {
        super.onReceiveGSensorRaw(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> r5) {
        Intrinsics.X0O(r5, "gSensorSHSYs");
        SimpleDateFormat r0 = O0X11OiO.IO0iXO0O();
        SimpleDateFormat r1 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        Calendar r2 = Calendar.getInstance();
        Intrinsics.XXI(r2);
        OIi1iX.iIiiO(r2, 0);
        OIi1iX.OiIIX101O(r2, 0);
        OIi1iX.I1(r2, 0);
        OIi1iX.XX0(r2, 0);
        ThreadUtils.executeByIo(new IXXOO(r5, r2, r0, r1));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveHRRaw(@aa1 List<BleHRRaw> r1) {
        super.onReceiveHRRaw(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGga(@aa1 BleLocationGga r1) {
        super.onReceiveLocationGga(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGsv(@aa1 List<BleLocationGsv> r1) {
        super.onReceiveLocationGsv(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveMusicCommand(@aa1 MusicCommand r3) {
        Intrinsics.X0O(r3, "musicCommand");
        MyNotificationListenerService.OXO1 r4 = MyNotificationListenerService.O001I;
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        r4.OXO1(r0);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> r5) {
        Intrinsics.X0O(r5, "ppgSHSYs");
        SimpleDateFormat r0 = O0X11OiO.IO0iXO0O();
        SimpleDateFormat r1 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        Calendar r2 = Calendar.getInstance();
        Intrinsics.XXI(r2);
        OIi1iX.iIiiO(r2, 0);
        OIi1iX.OiIIX101O(r2, 0);
        OIi1iX.I1(r2, 0);
        OIi1iX.XX0(r2, 0);
        ThreadUtils.executeByIo(new iOO1ii1(r5, r2, r0, r1));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveRealtimeLog(@aa1 BleRealtimeLog r12) {
        Intrinsics.X0O(r12, "realtimeLog");
    L7:
        e = move-exception;
        e.printStackTrace();
        return;
    L4:
        if (StringsKt__StringsKt.iIi011O(r12.getMContent(), "csv-1", false, 2, null) == false) goto L10;
        iI0OiO.IO(uz0.iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + "-1.csv"), oe5.IXO0OOi(r12.getMContent(), "    csv-1", "", false, 4, null), null, 2, null);     // Catch: Exception -> L7
        return;
    L10:
        if (StringsKt__StringsKt.iIi011O(r12.getMContent(), "csv-2", false, 2, null) == false) goto L13;
        iI0OiO.IO(uz0.iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + "-2.csv"), oe5.IXO0OOi(r12.getMContent(), "    csv-2", "", false, 4, null), null, 2, null);     // Catch: Exception -> L7
        return;
    L13:
        iI0OiO.IO(uz0.iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + ".txt"), r12.getMContent(), null, 2, null);     // Catch: Exception -> L7
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRecordPacket(@aa1 BleRecordPacket r1) {
        super.onReceiveRecordPacket(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRecordControlUpdate(@aa1 BleRecordControl r1) {
        super.onRecordControlUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onRequestAgpsPrerequisite() {
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new Xi1i0II0I(), 3, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onRequestLocation(final int r8) {
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new iO1IOX1O1(r8), 3, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings r1) {
        super.onRingVibrationSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSDCardInfoUpdate(@aa1 BleSDCardInfo r1) {
        super.onSDCardInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTestUpdate(@aa1 BleSGTest r1) {
        super.onSGTestUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTtsUpdate(@aa1 BleSGTts r1) {
        super.onSGTtsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSOSSettingsUpdate(@aa1 BleSOSSettings r1) {
        super.onSOSSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
        super.onScreenBrightnessSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onSessionStateChange(boolean r1) {
        if (r1 == true) goto L4;
    L7:
        iOXiO1O1I();
        return;
    L4:
        if (Ii0X0X == true) goto L7;
        Oi = 0;
        OOiOOO1OI.OXO1.XXIIO1i11();
        XOO0XOOii();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSleepNotifyUpdate(@aa1 BleSleepNotify r1) {
        super.onSleepNotifyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSosContactUpdate(@aa1 BleSosContact r1) {
        super.onSosContactUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSportEndNotifyUpdate(int r1) {
        super.onSportEndNotifyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet r1) {
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
    public /* bridge */ void onStreamProgress(boolean r1, int r2, int r3, int r4, @aa1 BleKey r5) {
        super.onStreamProgress(r1, r2, r3, r4, r5);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSyncData(int r1, @aa1 BleKey r2) {
        super.onSyncData(r1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onTimeUpdate() {
        BleConnector r0 = BleConnector.INSTANCE;
        BleKey r1 = BleKey.TIME_ZONE;
        BleKeyFlag r2 = BleKeyFlag.UPDATE;
        BaseBleConnector.sendObject$default(r0, r1, r2, new BleTimeZone(), false, false, 24, null);
        BaseBleConnector.sendObject$default(r0, BleKey.TIME, r2, BleTime.Companion.local(), false, false, 24, null);
        BleKey r3 = BleKey.HOUR_SYSTEM;
        BaseBleConnector.sendInt8$default(r0, r3, r2, BaseBleCache.getInt$default(BleCache.INSTANCE, r3, !O0X11OiO.X11iII1O1() ? 1 : 0, null, 4, null), false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r1) {
        super.onUpdateAICoachGenerateBeforeInfoV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay r1) {
        super.onUpdateAICoachLeaveDay(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAppSportState(@aa1 BleAppSportState r1) {
        super.onUpdateAppSportState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBAC(@aa1 BleBAC r1) {
        super.onUpdateBAC(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateBloodPressure(@aa1 BleBloodPressure r8) {
        Intrinsics.X0O(r8, "bloodPressure");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new O1O(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateHeartRate(@aa1 BleHeartRate r9) {
        Intrinsics.X0O(r9, "heartRate");
        if (r9.getMType() != 1) goto L5;
        return;
    L5:
        SimpleDateFormat r7 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new XXIIO1i11(r9, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r7));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateTemperature(@aa1 BleTemperature r8) {
        Intrinsics.X0O(r8, "temperature");
        SimpleDateFormat r6 = O0X11OiO.XO0O10();
        ThreadUtils.executeByIo(new iI(r8, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), r6));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
        super.onUpdateWatchFaceSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUserProfileUpdate(@aa1 BleUserProfile r1) {
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
    public /* bridge */ void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex r1) {
        super.onWatchFaceIndexUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword r1) {
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
    public /* bridge */ void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet r1) {
        super.onXMLYBandSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onXModem(byte r1) {
        super.onXModem(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadStock(boolean r2) {
        a01.OXO1.XIi00iiXO().remove(b01.iiiO);
        StockInitializer.IO.XOO0ii0();
    }
}
