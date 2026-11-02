package com.sma.smartv3.initializer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
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
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C2916sc;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.X01X0;
import com.android.mltcode.paycertificationapi.XOIIOO;
import com.android.mltcode.paycertificationapi.XOXO0X00I;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI0OiO;
import com.android.mltcode.paycertificationapi.iI10I11;
import com.android.mltcode.paycertificationapi.iOXOiI;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.ov0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu0;
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
import com.sma.smartv3.biz.p606wa.WAManager;
import com.sma.smartv3.biz.p607wx.WxManager;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.network.CyWeeRemark;
import com.sma.smartv3.network.DataBody;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.UploadServiceRequestBody;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.AlipayBindInfoDao;
import com.sma.smartv3.p608db.dao.BloodGlucoseDao;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.dao.DailyPowerDao;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao;
import com.sma.smartv3.p608db.dao.EnergyRatingDao;
import com.sma.smartv3.p608db.dao.HanBaoVibrationDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.HrvDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.MatchRecordDao;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.dao.RespiratoryRateDao;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.dao.VitalityDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.AlipayBindInfo;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.DailyPower;
import com.sma.smartv3.p608db.entity.EnergyRating;
import com.sma.smartv3.p608db.entity.HanBaoVibration;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.MatchPeriod;
import com.sma.smartv3.p608db.entity.MatchRecord;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p608db.entity.RespiratoryRate;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p608db.entity.Vitality;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.CloseableKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,2521:1\n1374#2:2522\n1460#2,5:2523\n1869#2,2:2529\n1563#2:2540\n1634#2,3:2541\n1#3:2528\n15#4:2531\n11#4,2:2532\n27#4,2:2534\n27#4,2:2536\n27#4,2:2538\n15#4:2544\n15#4:2545\n18#4,2:2546\n15#4:2548\n11#4,2:2549\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer\n*L\n1058#1:2522\n1058#1:2523,5\n1063#1:2529,2\n1983#1:2540\n1983#1:2541,3\n1125#1:2531\n1144#1:2532,2\n1579#1:2534,2\n1608#1:2536,2\n1612#1:2538,2\n2251#1:2544\n2270#1:2545\n2338#1:2546,2\n2338#1:2548\n2278#1:2549,2\n*E\n"})
public final class BleInitializer implements InterfaceC2909s5, BleHandleCallback {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static final String f51207I1 = "BleInitializer";
    public static boolean IO0II0i = false;
    public static boolean IO0iXO0O = false;

    @tb1
    public static MediaPlayer IX0IXOi = null;

    @aa1
    public static final long[] IX1XiI;
    public static boolean IXI = false;
    public static long IXOIIIO = 0;
    public static boolean Ii0X0X = false;
    public static boolean Ii0i = false;
    public static int IiiXiI0I = 0;

    @aa1
    public static final Lazy O0O;
    public static final Uri O0O0X0iOi;

    /* JADX INFO: renamed from: Oi */
    public static int f51210Oi = 0;
    public static long X00O0 = 0;
    public static boolean X00Xi1X = false;
    public static long X0iO = 0;

    /* JADX INFO: renamed from: X1 */
    public static boolean f51211X1 = false;
    public static boolean XO0X10iO = false;
    public static boolean XOIX = false;
    public static long XOO0XOOii = 0;

    @tb1
    public static BleNotification XOXiX0 = null;

    @aa1
    public static final XIi00iiXO XX00i10X;
    public static boolean XXiIiX10 = false;

    @aa1
    public static final Lazy XXiO0i;

    @tb1
    public static C2702ms Xi1i0XOX0 = null;

    @tb1
    public static File Xii11I = null;

    @aa1
    public static final Handler i11I;

    @aa1
    public static final C18582iO iOI;
    public static final int iX1O1 = 140;

    @aa1
    public static final Lazy iXi;
    public static double iiIOiX;

    @tb1
    public static C2702ms iii0;

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final BleInitializer f51208IO = new BleInitializer();

    @aa1
    public static final Lazy X11iII1O1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i111I0100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.X1i();
        }
    });

    @aa1
    public static final Lazy XXX11i = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i1X1ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.OI1IiOO1i();
        }
    });

    @aa1
    public static final Lazy X1IX = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIXO1IO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.OI1i1i();
        }
    });

    @aa1
    public static final Lazy X0i1O = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiOXiX1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.OXI0Xi();
        }
    });

    @aa1
    public static final Lazy iIXi1iiXI = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOOIOi0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.Oiii();
        }
    });

    @aa1
    public static final Lazy iXiX011 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOXI0IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.iX0iii0();
        }
    });

    @aa1
    public static final Lazy O001I = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.i0O();
        }
    });

    @aa1
    public static final Lazy XXO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i10iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.i0iIXiI();
        }
    });

    @aa1
    public static final Lazy iXiiiO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOOOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.iiX0i1IX();
        }
    });

    @aa1
    public static final Lazy Ii1iii0 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0IIII0OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.X11();
        }
    });

    @aa1
    public static final Lazy iiiO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXIii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.m38218II();
        }
    });

    @aa1
    public static final Lazy X11I = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0IOOIX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.XOOI0O();
        }
    });

    @aa1
    public static final Lazy X100O = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXXii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.I011X();
        }
    });

    @aa1
    public static final Lazy XX1Oi = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXXI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.II1();
        }
    });

    @aa1
    public static final Lazy OX110i = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0010I0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.m38225XI();
        }
    });

    /* JADX INFO: renamed from: OO */
    @aa1
    public static final Lazy f51209OO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.XOO0Xi();
        }
    });

    @aa1
    public static final Lazy XOX0O0 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1O1XIOIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.iIIIi();
        }
    });

    @aa1
    public static final Lazy iOiXi11II = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XIIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.iO11i();
        }
    });

    @aa1
    public static final Lazy X00XIX1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i01OIIi11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.XIIIO();
        }
    });

    @aa1
    public static final Lazy i0X000X0O = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXX1OO1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleInitializer.O1i0();
        }
    });

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodGlucose$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodGlucose$1\n*L\n1900#1:2522\n1900#1:2523,3\n*E\n"})
    public static final class I0IIOi extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51212I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleBloodGlucose> f51213IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I0IIOi(List<BleBloodGlucose> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51213IO = list;
            this.f51212I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodGlucoseDao bloodGlucoseDaoXi1i0XOX0 = BleInitializer.f51208IO.Xi1i0XOX0();
            List<BleBloodGlucose> list = this.f51213IO;
            long j = this.f51212I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BloodGlucose bloodGlucose = new BloodGlucose((BleBloodGlucose) it.next(), j);
                date.setTime(bloodGlucose.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                bloodGlucose.setMLocalTime(str);
                arrayList.add(bloodGlucose);
            }
            bloodGlucoseDaoXi1i0XOX0.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.X1ii, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadDailyPower$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadDailyPower$1\n*L\n2398#1:2522\n2398#1:2523,3\n*E\n"})
    public static final class I0iXXO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51214I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BlePhysicalPower> f51215IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I0iXXO(List<BlePhysicalPower> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51215IO = list;
            this.f51214I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            DailyPowerDao dailyPowerDaoX0iO = BleInitializer.f51208IO.X0iO();
            List<BlePhysicalPower> list = this.f51215IO;
            long j = this.f51214I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                DailyPower dailyPower = new DailyPower((BlePhysicalPower) it.next(), j);
                date.setTime(dailyPower.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                dailyPower.setMLocalTime(str);
                arrayList.add(dailyPower);
            }
            dailyPowerDaoX0iO.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.X0I1, null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.BleInitializer$I1 */
    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadVitalityValue$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadVitalityValue$1\n*L\n2483#1:2522\n2483#1:2523,3\n*E\n"})
    public static final class C18579I1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51216I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleVitality> f51217IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public C18579I1(List<BleVitality> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51217IO = list;
            this.f51216I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            VitalityDao vitalityDaoXXI0XOIX = BleInitializer.f51208IO.XXI0XOIX();
            List<BleVitality> list = this.f51217IO;
            long j = this.f51216I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Vitality vitality = new Vitality((BleVitality) it.next(), j);
                date.setTime(vitality.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                vitality.setMLocalTime(str);
                arrayList.add(vitality);
            }
            vitalityDaoXXI0XOIX.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.i1O11001, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadLocation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadLocation$1\n*L\n813#1:2522\n813#1:2523,3\n*E\n"})
    public static final class I1XOi1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51218I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleLocation> f51219IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public I1XOi1(List<BleLocation> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51219IO = list;
            this.f51218I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            LocationDao locationDaoX1OI = BleInitializer.f51208IO.X1OI();
            List<BleLocation> list = this.f51219IO;
            long j = this.f51218I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Location location = new Location((BleLocation) it.next(), j);
                date.setTime(location.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                location.setMLocalTime(str);
                arrayList.add(location);
            }
            locationDaoX1OI.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.OIX0iXi, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n*L\n1692#1:2522\n1692#1:2523,3\n*E\n"})
    public static final class II1Xi0 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51220I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleWorkout3> f51221IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public II1Xi0(List<BleWorkout3> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51221IO = list;
            this.f51220I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                BleInitializer.f51208IO.XXOXi().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao workoutDaoXIIO11I = BleInitializer.f51208IO.XIIO11I();
            List<BleWorkout3> list = this.f51221IO;
            long j = this.f51220I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Workout workout = new Workout((BleWorkout3) it.next(), j);
                date.setTime(workout.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                workout.setMLocalTime(str);
                BleCache bleCache = BleCache.INSTANCE;
                if (bleCache.getMBleName().length() > 0) {
                    workout.setMFirmwareFlag(bleCache.getMFirmwareFlag());
                    workout.setMPrototype(bleCache.getMPrototype());
                    workout.setMBleName(bleCache.getMBleName());
                    workout.setMPlatform(bleCache.getMPlatform());
                    workout.setMAGpsType(bleCache.getMAGpsType());
                }
                final WorkoutIndex workoutIndex = new WorkoutIndex(0, 2, workout.getMEnd(), workout.getMMode(), 0, 17, null);
                Application app = Utils.getApp();
                Intrinsics.O10IXXX0X(app, "getApp(...)");
                XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0ii0iI
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.II1Xi0.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                    }
                });
                arrayList.add(workout);
            }
            workoutDaoXIIO11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord$1\n*L\n1749#1:2522\n1749#1:2523,3\n*E\n"})
    public static final class IIX1OXO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51222I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleMatchRecord> f51223IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public IIX1OXO(List<BleMatchRecord> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51223IO = list;
            this.f51222I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao matchRecordDaoXii = BleInitializer.f51208IO.Xii();
            List<BleMatchRecord> list = this.f51223IO;
            long j = this.f51222I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MatchRecord matchRecord = new MatchRecord((BleMatchRecord) it.next(), j);
                date.setTime(matchRecord.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                matchRecord.setMLocalTime(str);
                arrayList.add(matchRecord);
            }
            matchRecordDaoXii.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n*L\n2155#1:2522,3\n*E\n"})
    public static final class IXXOO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ Calendar f51224I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleGSensorSHSY> f51225IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public IXXOO(List<BleGSensorSHSY> list, Calendar calendar, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
            this.f51225IO = list;
            this.f51224I1 = calendar;
            this.iX1O1 = simpleDateFormat;
            this.X11iII1O1 = simpleDateFormat2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws Throwable {
            String str = "%+.8f";
            try {
                List<BleGSensorSHSY> list = this.f51225IO;
                Calendar calendar = this.f51224I1;
                SimpleDateFormat simpleDateFormat = this.iX1O1;
                SimpleDateFormat simpleDateFormat2 = this.X11iII1O1;
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    BleGSensorSHSY bleGSensorSHSY = (BleGSensorSHSY) next;
                    long timeInMillis = calendar.getTimeInMillis() + bleGSensorSHSY.getMTime();
                    if (i == 0) {
                        BleInitializer bleInitializer = BleInitializer.f51208IO;
                        if (bleInitializer.XXiO0i() == 0) {
                            bleInitializer.I00(timeInMillis);
                        }
                    }
                    File fileX0i1O = uz0.X0i1O(sz0.OXO1);
                    String str2 = simpleDateFormat.format(Long.valueOf(BleInitializer.f51208IO.XXiO0i()));
                    String mBleAddress = BleCache.INSTANCE.getMBleAddress();
                    Iterator it2 = it;
                    StringBuilder sb = new StringBuilder();
                    Calendar calendar2 = calendar;
                    sb.append("gSensorSHSYs_");
                    sb.append(str2);
                    sb.append(IiXI1X1OO.O00);
                    sb.append(mBleAddress);
                    sb.append(".csv");
                    File file = new File(fileX0i1O, sb.toString());
                    if (!FileUtils.isFileExists(file)) {
                        FileUtils.createOrExistsFile(file);
                        FileIOUtils.writeFileFromString(file, "Timestamp,X,Y,Z,label,sleepParticularCase,steps,hr\n", false);
                    }
                    String str3 = simpleDateFormat2.format(new Date(timeInMillis));
                    String str4 = String.format(str, Arrays.copyOf(new Object[]{Float.valueOf(bleGSensorSHSY.getMX() / 1024.0f)}, 1));
                    Intrinsics.O10IXXX0X(str4, "format(...)");
                    String str5 = String.format(str, Arrays.copyOf(new Object[]{Float.valueOf(bleGSensorSHSY.getMY() / 1024.0f)}, 1));
                    Intrinsics.O10IXXX0X(str5, "format(...)");
                    String str6 = String.format(str, Arrays.copyOf(new Object[]{Float.valueOf(bleGSensorSHSY.getMZ() / 1024.0f)}, 1));
                    Intrinsics.O10IXXX0X(str6, "format(...)");
                    String strI01OOiI = q62.OXO1.i01OOiI(bleGSensorSHSY.getMActivityMode());
                    String str7 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(bleGSensorSHSY.getMSleepParticularCase())}, 1));
                    Intrinsics.O10IXXX0X(str7, "format(...)");
                    String str8 = str;
                    String str9 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(bleGSensorSHSY.getMStep())}, 1));
                    Intrinsics.O10IXXX0X(str9, "format(...)");
                    String str10 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(bleGSensorSHSY.getMHr())}, 1));
                    Intrinsics.O10IXXX0X(str10, "format(...)");
                    FileIOUtils.writeFileFromString(file, str3 + I000IiI1O.C2156iO.XO0O10 + str4 + I000IiI1O.C2156iO.XO0O10 + str5 + I000IiI1O.C2156iO.XO0O10 + str6 + I000IiI1O.C2156iO.XO0O10 + strI01OOiI + I000IiI1O.C2156iO.XO0O10 + str7 + I000IiI1O.C2156iO.XO0O10 + str9 + I000IiI1O.C2156iO.XO0O10 + str10 + "\n", true);
                    i = i2;
                    it = it2;
                    calendar = calendar2;
                    str = str8;
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n*L\n2021#1:2522\n2021#1:2523,3\n*E\n"})
    public static final class IiI10X extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51226I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleAlipayBindInfo> f51227IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public IiI10X(List<BleAlipayBindInfo> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51227IO = list;
            this.f51226I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            AlipayBindInfoDao alipayBindInfoDaoIXi = BleInitializer.f51208IO.iXi();
            List<BleAlipayBindInfo> list = this.f51227IO;
            long j = this.f51226I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AlipayBindInfo alipayBindInfo = new AlipayBindInfo((BleAlipayBindInfo) it.next(), j);
                date.setTime(alipayBindInfo.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                alipayBindInfo.setMLocalTime(str);
                BleCache bleCache = BleCache.INSTANCE;
                alipayBindInfo.setMBleName(bleCache.getMBleName());
                alipayBindInfo.setMFirmwareFlag(bleCache.getMFirmwareFlag());
                alipayBindInfo.setMFirmwareVersion(BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, "0.0.0", null, 4, null));
                alipayBindInfo.setMMacAddress(oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
                String appVersionName = AppUtils.getAppVersionName();
                Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
                alipayBindInfo.setMAppVersion(appVersionName);
                arrayList.add(alipayBindInfo);
            }
            alipayBindInfoDaoIXi.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.O10IXXX0X, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadActivity$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadActivity$1\n*L\n619#1:2522\n619#1:2523,3\n*E\n"})
    public static final class O00 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51228I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleActivity> f51229IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O00(List<BleActivity> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51229IO = list;
            this.f51228I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                BleInitializer.f51208IO.XXOXi().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            ActivityDao activityDaoIX0IXOi = BleInitializer.f51208IO.IX0IXOi();
            List<BleActivity> list = this.f51229IO;
            long j = this.f51228I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Activity activity = new Activity((BleActivity) it.next(), j);
                date.setTime(activity.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                activity.setMLocalTime(str);
                if (!q62.OXO1.iiiOOX10() && activity.getMState() == 4) {
                    final WorkoutIndex workoutIndex = new WorkoutIndex(0, 1, activity.getMTime(), activity.getMMode(), 0, 17, null);
                    Application app = Utils.getApp();
                    Intrinsics.O10IXXX0X(app, "getApp(...)");
                    XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.Iii0IiX0X
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return BleInitializer.O00.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                        }
                    });
                }
                arrayList.add(activity);
            }
            activityDaoIX0IXOi.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.OXO1, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHanBaoVibration$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHanBaoVibration$1\n*L\n2373#1:2522\n2373#1:2523,3\n*E\n"})
    public static final class O10IXXX0X extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51230I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleHanBaoVibration> f51231IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O10IXXX0X(List<BleHanBaoVibration> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51231IO = list;
            this.f51230I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HanBaoVibrationDao hanBaoVibrationDaoI100IXOX = BleInitializer.f51208IO.i100IXOX();
            List<BleHanBaoVibration> list = this.f51231IO;
            long j = this.f51230I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                HanBaoVibration hanBaoVibration = new HanBaoVibration((BleHanBaoVibration) it.next(), j);
                date.setTime(hanBaoVibration.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                hanBaoVibration.setMLocalTime(str);
                arrayList.add(hanBaoVibration);
            }
            hanBaoVibrationDaoI100IXOX.insert(arrayList);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateBloodPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateBloodPressure$1\n*L\n1872#1:2522\n1872#1:2523,3\n*E\n"})
    public static final class O1O extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51232I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ BleBloodPressure f51233IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public O1O(BleBloodPressure bleBloodPressure, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51233IO = bleBloodPressure;
            this.f51232I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodPressureDao bloodPressureDaoXii11I = BleInitializer.f51208IO.Xii11I();
            List listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.f51233IO);
            long j = this.f51232I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listIi1iii0, 10));
            Iterator it = listIi1iii0.iterator();
            while (it.hasNext()) {
                BloodPressure bloodPressure = new BloodPressure((BleBloodPressure) it.next(), j);
                date.setTime(bloodPressure.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                bloodPressure.setMLocalTime(str);
                arrayList.add(bloodPressure);
            }
            bloodPressureDaoXii11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.f1094iO, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n1869#2:2524\n1563#2:2525\n1634#2,3:2526\n1870#2:2529\n1563#2:2530\n1634#2,3:2531\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n*L\n699#1:2522,2\n712#1:2524\n721#1:2525\n721#1:2526,3\n712#1:2529\n730#1:2530\n730#1:2531,3\n*E\n"})
    public static final class OII extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51234I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleSleep> f51235IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ int XXX11i;
        public final /* synthetic */ Date iX1O1;

        public OII(List<BleSleep> list, long j, Date date, SimpleDateFormat simpleDateFormat, int i) {
            this.f51235IO = list;
            this.f51234I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
            this.XXX11i = i;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            for (BleSleep bleSleep : this.f51235IO) {
                i1O0OXO1O.OXO1.OXO1("onReadSleep -> " + bleSleep);
            }
            q62 q62Var = q62.OXO1;
            String str = "format(...)";
            if (q62Var.ii110() || q62Var.iXiii()) {
                try {
                    String str2 = O0X11OiO.OIX0iXi().format(new Date()) + ".json";
                    i1O0OXO1O.OXO1.OXO1(str2);
                    File fileXO0O10 = uz0.XO0O10(sz0.OXO1, str2);
                    String json = new Gson().toJson(this.f51235IO);
                    Intrinsics.O10IXXX0X(json, "toJson(...)");
                    iI0OiO.m2062IO(fileXO0O10, json, null, 2, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                List<List<BleSleep>> sleepAllDaySegments = BleSleep.Companion.getSleepAllDaySegments(this.f51235IO);
                long j = this.f51234I1;
                Date date = this.iX1O1;
                SimpleDateFormat simpleDateFormat = this.X11iII1O1;
                int i = this.XXX11i;
                Iterator<T> it = sleepAllDaySegments.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    if (list.size() > 1) {
                        BleInitializer.f51208IO.O101().deleteSleeps(((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(list)).getMLocalTime(), ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(list)).getMLocalTime());
                    }
                    SleepDao sleepDaoO101 = BleInitializer.f51208IO.O101();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Sleep sleep = new Sleep((BleSleep) it2.next(), j);
                        date.setTime(sleep.getMTime());
                        String str3 = simpleDateFormat.format(date);
                        Intrinsics.O10IXXX0X(str3, str);
                        sleep.setMLocalTime(str3);
                        sleep.setMAlgorithmType(i);
                        arrayList.add(sleep);
                    }
                    sleepDaoO101.insert(arrayList);
                    str = str;
                }
            } else {
                SleepDao sleepDaoO102 = BleInitializer.f51208IO.O101();
                List<BleSleep> list3 = this.f51235IO;
                long j2 = this.f51234I1;
                Date date2 = this.iX1O1;
                SimpleDateFormat simpleDateFormat2 = this.X11iII1O1;
                int i2 = this.XXX11i;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    Sleep sleep2 = new Sleep((BleSleep) it3.next(), j2);
                    date2.setTime(sleep2.getMTime());
                    String str4 = simpleDateFormat2.format(date2);
                    Intrinsics.O10IXXX0X(str4, "format(...)");
                    sleep2.setMLocalTime(str4);
                    sleep2.setMAlgorithmType(i2);
                    arrayList2.add(sleep2);
                }
                sleepDaoO102.insert(arrayList2);
            }
            I01XX0.XIi00iiXO(I01XX0.XO0O10, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodPressure$1\n*L\n676#1:2522\n676#1:2523,3\n*E\n"})
    public static final class OIX0iXi extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51236I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleBloodPressure> f51237IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OIX0iXi(List<BleBloodPressure> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51237IO = list;
            this.f51236I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodPressureDao bloodPressureDaoXii11I = BleInitializer.f51208IO.Xii11I();
            List<BleBloodPressure> list = this.f51237IO;
            long j = this.f51236I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BloodPressure bloodPressure = new BloodPressure((BleBloodPressure) it.next(), j);
                date.setTime(bloodPressure.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                bloodPressure.setMLocalTime(str);
                arrayList.add(bloodPressure);
            }
            bloodPressureDaoXii11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.f1094iO, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodOxygen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBloodOxygen$1\n*L\n859#1:2522\n859#1:2523,3\n*E\n"})
    public static final class OIi0 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51238I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleBloodOxygen> f51239IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OIi0(List<BleBloodOxygen> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51239IO = list;
            this.f51238I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BloodOxygenDao bloodOxygenDaoIii0 = BleInitializer.f51208IO.iii0();
            List<BleBloodOxygen> list = this.f51239IO;
            long j = this.f51238I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BloodOxygen bloodOxygen = new BloodOxygen((BleBloodOxygen) it.next(), j);
                date.setTime(bloodOxygen.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                bloodOxygen.setMLocalTime(str);
                arrayList.add(bloodOxygen);
            }
            bloodOxygenDaoIii0.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.I0IIOi, null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.BleInitializer$OX */
    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadTemperature$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadTemperature$1\n*L\n836#1:2522\n836#1:2523,3\n*E\n"})
    public static final class C18580OX extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51240I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleTemperature> f51241IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public C18580OX(List<BleTemperature> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51241IO = list;
            this.f51240I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            TemperatureDao temperatureDaoIXiOXO = BleInitializer.f51208IO.IXiOXO();
            List<BleTemperature> list = this.f51241IO;
            long j = this.f51240I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Temperature temperature = new Temperature((BleTemperature) it.next(), j);
                date.setTime(temperature.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                temperature.setMLocalTime(str);
                arrayList.add(temperature);
            }
            temperatureDaoIXiOXO.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.XOO0ii0, null, 2, null);
            return null;
        }
    }

    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ LogLevel f51242I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ String f51243IO;

        public OXO1(String str, LogLevel logLevel) {
            this.f51243IO = str;
            this.f51242I1 = logLevel;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            String strSubstring;
            if (!a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false)) {
                return null;
            }
            Date date = new Date();
            String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date) + ".txt";
            String str2 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(date);
            int iCeil = (int) Math.ceil(((double) this.f51243IO.length()) / ((double) 140));
            String str3 = this.f51243IO;
            LogLevel logLevel = this.f51242I1;
            for (int i = 0; i < iCeil; i++) {
                if (i == iCeil - 1) {
                    strSubstring = str3.substring(i * 140, str3.length());
                    Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                } else {
                    strSubstring = str3.substring(i * 140, (i + 1) * 140);
                    Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                }
                iI0OiO.m2062IO(uz0.OXO1(sz0.OXO1, str), str2 + " " + logLevel + " " + strSubstring + "\n", null, 2, null);
            }
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRespiratoryRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRespiratoryRate$1\n*L\n2505#1:2522\n2505#1:2523,3\n*E\n"})
    public static final class OiIIX101O extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51244I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleRespiratoryRate> f51245IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public OiIIX101O(List<BleRespiratoryRate> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51245IO = list;
            this.f51244I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            RespiratoryRateDao respiratoryRateDaoM38230I0 = BleInitializer.f51208IO.m38230I0();
            List<BleRespiratoryRate> list = this.f51245IO;
            long j = this.f51244I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                RespiratoryRate respiratoryRate = new RespiratoryRate((BleRespiratoryRate) it.next(), j);
                date.setTime(respiratoryRate.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                respiratoryRate.setMLocalTime(str);
                arrayList.add(respiratoryRate);
            }
            respiratoryRateDaoM38230I0.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.I11X11OX, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout2$1\n*L\n1636#1:2522\n1636#1:2523,3\n*E\n"})
    public static final class X01IiOiIi extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51246I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleWorkout2> f51247IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X01IiOiIi(List<BleWorkout2> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51247IO = list;
            this.f51246I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                BleInitializer.f51208IO.XXOXi().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao workoutDaoXIIO11I = BleInitializer.f51208IO.XIIO11I();
            List<BleWorkout2> list = this.f51247IO;
            long j = this.f51246I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Workout workout = new Workout((BleWorkout2) it.next(), j);
                date.setTime(workout.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                workout.setMLocalTime(str);
                BleCache bleCache = BleCache.INSTANCE;
                if (bleCache.getMBleName().length() > 0) {
                    workout.setMFirmwareFlag(bleCache.getMFirmwareFlag());
                    workout.setMPrototype(bleCache.getMPrototype());
                    workout.setMBleName(bleCache.getMBleName());
                    workout.setMPlatform(bleCache.getMPlatform());
                    workout.setMAGpsType(bleCache.getMAGpsType());
                }
                final WorkoutIndex workoutIndex = new WorkoutIndex(0, 2, workout.getMEnd(), workout.getMMode(), 0, 17, null);
                Application app = Utils.getApp();
                Intrinsics.O10IXXX0X(app, "getApp(...)");
                XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXOi0OX
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.X01IiOiIi.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                    }
                });
                arrayList.add(workout);
            }
            workoutDaoXIIO11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHeartRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadHeartRate$1\n*L\n654#1:2522\n654#1:2523,3\n*E\n"})
    public static final class X0O extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51248I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleHeartRate> f51249IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X0O(List<BleHeartRate> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51249IO = list;
            this.f51248I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HeartRateDao heartRateDaoII0I = BleInitializer.f51208IO.iI0I();
            List<BleHeartRate> list = this.f51249IO;
            long j = this.f51248I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                HeartRate heartRate = new HeartRate((BleHeartRate) it.next(), j);
                date.setTime(heartRate.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                heartRate.setMLocalTime(str);
                arrayList.add(heartRate);
            }
            heartRateDaoII0I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadEnergyRating$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadEnergyRating$1\n*L\n2421#1:2522\n2421#1:2523,3\n*E\n"})
    public static final class X1ii extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51250I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleEnergyRating> f51251IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public X1ii(List<BleEnergyRating> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51251IO = list;
            this.f51250I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            EnergyRatingDao energyRatingDaoIIi1 = BleInitializer.f51208IO.iIi1();
            List<BleEnergyRating> list = this.f51251IO;
            long j = this.f51250I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnergyRating energyRating = new EnergyRating((BleEnergyRating) it.next(), j);
                date.setTime(energyRating.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                energyRating.setMLocalTime(str);
                arrayList.add(energyRating);
            }
            energyRatingDaoIIi1.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.iIIIiIO0, null, 2, null);
            return null;
        }
    }

    public static final class XIi00iiXO extends PhoneStateListener {
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            boolean zIsAppForeground = AppUtils.isAppForeground();
            boolean zIsScreenLock = ScreenUtils.isScreenLock();
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            i1o0oxo1o.OXO1("BleInitializer PhoneStateListener onCallStateChanged -> isAppForeground:" + zIsAppForeground + " isScreenLock:" + zIsScreenLock + " state=" + bleInitializer.XX00i10X(i) + ", phoneNumber=" + str + ", " + BleInitializer.IiiXiI0I);
            q62 q62Var = q62.OXO1;
            if (q62Var.m2882OI()) {
                if (i == 0) {
                    bleInitializer.OXi001(1);
                    a01.OXO1.m1440iO().put(b01.f5636iI, false);
                    if (BleInitializer.IiiXiI0I == 1) {
                        if (!q62Var.i0iOi() || TextUtils.isEmpty(str)) {
                            if (str == null) {
                                str = "";
                            }
                            bleInitializer.XIO11I(str);
                        } else {
                            if (str == null) {
                                str = "";
                            }
                            bleInitializer.XOIO11O(str);
                        }
                    } else if (BleInitializer.IiiXiI0I == 2) {
                        bleInitializer.IX0iIX();
                    }
                    bleInitializer.OiXI1OiX0(null);
                } else if (i == 1) {
                    a01.OXO1.m1440iO().put(b01.f5636iI, true);
                    if (!q62Var.i0iOi() || TextUtils.isEmpty(str)) {
                        if (str == null) {
                            str = "";
                        }
                        bleInitializer.I0IIOI(str);
                    } else {
                        if (str == null) {
                            str = "";
                        }
                        bleInitializer.IOIi00(str);
                    }
                } else if (i == 2) {
                    bleInitializer.OXi001(0);
                    a01.OXO1.m1440iO().put(b01.f5636iI, false);
                    if (BleInitializer.IiiXiI0I == 1) {
                        bleInitializer.IX0iIX();
                    }
                    bleInitializer.OiXI1OiX0(null);
                }
                BleInitializer.IiiXiI0I = i;
            }
        }
    }

    public static final class XO0O10 implements IO0OI {
        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation location) {
            Intrinsics.X0O(location, "location");
            LogUtils.m11128d("agpsLocationClient onLocationChange longitude: " + location.IiI10X() + ", latitude: " + location.XO0O10() + ", altitude: " + location.OXO1());
            if (location.OXO1() == Double.MIN_VALUE) {
                return;
            }
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.i000X(new BleAgpsPrerequisite((float) location.IiI10X(), (float) location.XO0O10(), (int) location.OXO1()));
            bleInitializer.X00110X();
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String message) {
            Intrinsics.X0O(message, "message");
            LogUtils.m11128d("agpsLocationClient onError ");
            BleInitializer.f51208IO.X00110X();
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBleHrv$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadBleHrv$1\n*L\n882#1:2522\n882#1:2523,3\n*E\n"})
    public static final class XOO0ii0 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51252I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleHrv> f51253IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XOO0ii0(List<BleHrv> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51253IO = list;
            this.f51252I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HrvDao hrvDaoIIX0i = BleInitializer.f51208IO.iIX0i();
            List<BleHrv> list = this.f51253IO;
            long j = this.f51252I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Hrv hrv = new Hrv((BleHrv) it.next(), j);
                date.setTime(hrv.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                hrv.setMLocalTime(str);
                arrayList.add(hrv);
            }
            hrvDaoIIX0i.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.OIi0, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n*L\n1101#1:2522\n1101#1:2523,3\n*E\n"})
    public static final class XX0 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51254I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BlePressure> f51255IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XX0(List<BlePressure> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51255IO = list;
            this.f51254I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            PressureDao pressureDaoIiII = BleInitializer.f51208IO.iiII();
            List<BlePressure> list = this.f51255IO;
            long j = this.f51254I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pressure pressure = new Pressure((BlePressure) it.next(), j);
                date.setTime(pressure.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                pressure.setMLocalTime(str);
                arrayList.add(pressure);
            }
            pressureDaoIiII.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.XXI, null, 2, null);
            return null;
        }
    }

    public static final class XXI extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleEcg> f51256IO;

        public XXI(List<BleEcg> list) {
            this.f51256IO = list;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.X111IO().insert(X01X0.m1073iO(this.f51256IO, bleInitializer.X111IO().getLastElectrocardiogram()));
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateHeartRate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateHeartRate$1\n*L\n1828#1:2522\n1828#1:2523,3\n*E\n"})
    public static final class XXIIO1i11 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51257I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ BleHeartRate f51258IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XXIIO1i11(BleHeartRate bleHeartRate, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51258IO = bleHeartRate;
            this.f51257I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            HeartRateDao heartRateDaoII0I = BleInitializer.f51208IO.iI0I();
            List listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.f51258IO);
            long j = this.f51257I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listIi1iii0, 10));
            Iterator it = listIi1iii0.iterator();
            while (it.hasNext()) {
                HeartRate heartRate = new HeartRate((BleHeartRate) it.next(), j);
                date.setTime(heartRate.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                heartRate.setMLocalTime(str);
                arrayList.add(heartRate);
            }
            heartRateDaoII0I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.XIi00iiXO, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord2$1\n*L\n1771#1:2522\n1771#1:2523,3\n*E\n"})
    public static final class XiOIO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51259I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleMatchRecord2> f51260IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public XiOIO(List<BleMatchRecord2> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51260IO = list;
            this.f51259I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao matchRecordDaoXii = BleInitializer.f51208IO.Xii();
            List<BleMatchRecord2> list = this.f51260IO;
            long j = this.f51259I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MatchRecord matchRecord = new MatchRecord((BleMatchRecord2) it.next(), j);
                date.setTime(matchRecord.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                matchRecord.setMLocalTime(str);
                arrayList.add(matchRecord);
            }
            matchRecordDaoXii.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n*L\n2059#1:2522,2\n*E\n"})
    public static final class XiOIii1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ Date f51261I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleRri> f51262IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat XXX11i;
        public final /* synthetic */ long iX1O1;

        public XiOIii1(List<BleRri> list, Date date, long j, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
            this.f51262IO = list;
            this.f51261I1 = date;
            this.iX1O1 = j;
            this.X11iII1O1 = simpleDateFormat;
            this.XXX11i = simpleDateFormat2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws Throwable {
            try {
                List<BleRri> list = this.f51262IO;
                Date date = this.f51261I1;
                long j = this.iX1O1;
                SimpleDateFormat simpleDateFormat = this.X11iII1O1;
                SimpleDateFormat simpleDateFormat2 = this.XXX11i;
                for (BleRri bleRri : list) {
                    date.setTime(((((long) bleRri.getMTime()) * 1000) - j) + ((long) O0X11OiO.iXiX011));
                    File file = new File(uz0.XX1Oi(sz0.OXO1), "rri_" + simpleDateFormat.format(date) + ".csv");
                    if (!FileUtils.isFileExists(file)) {
                        FileUtils.createOrExistsFile(file);
                        FileIOUtils.writeFileFromString(file, "timestamp,date,rri0,rri1\n", false);
                    }
                    date.setTime((((long) bleRri.getMTime()) * 1000) - j);
                    FileIOUtils.writeFileFromString(file, bleRri.getMTime() + I000IiI1O.C2156iO.XO0O10 + simpleDateFormat2.format(date) + I000IiI1O.C2156iO.XO0O10 + bleRri.getMRRI() + I000IiI1O.C2156iO.XO0O10 + bleRri.getMRRI2() + "\n", true);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout4$1\n*L\n2445#1:2522\n2445#1:2523,3\n*E\n"})
    public static final class i010I extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51263I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleWorkout4> f51264IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public i010I(List<BleWorkout4> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51264IO = list;
            this.f51263I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                BleInitializer.f51208IO.XXOXi().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao workoutDaoXIIO11I = BleInitializer.f51208IO.XIIO11I();
            List<BleWorkout4> list = this.f51264IO;
            long j = this.f51263I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Workout workout = new Workout((BleWorkout4) it.next(), j);
                date.setTime(workout.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                workout.setMLocalTime(str);
                BleCache bleCache = BleCache.INSTANCE;
                if (bleCache.getMBleName().length() > 0) {
                    workout.setMFirmwareFlag(bleCache.getMFirmwareFlag());
                    workout.setMPrototype(bleCache.getMPrototype());
                    workout.setMBleName(bleCache.getMBleName());
                    workout.setMPlatform(bleCache.getMPlatform());
                    workout.setMAGpsType(bleCache.getMAGpsType());
                }
                final WorkoutIndex workoutIndex = new WorkoutIndex(0, 2, workout.getMEnd(), workout.getMMode(), 0, 17, null);
                Application app = Utils.getApp();
                Intrinsics.O10IXXX0X(app, "getApp(...)");
                XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi1iI10
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.i010I.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                    }
                });
                arrayList.add(workout);
            }
            workoutDaoXIIO11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.BleInitializer$iI */
    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateTemperature$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onUpdateTemperature$1\n*L\n1850#1:2522\n1850#1:2523,3\n*E\n"})
    public static final class C18581iI extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51265I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ BleTemperature f51266IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public C18581iI(BleTemperature bleTemperature, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51266IO = bleTemperature;
            this.f51265I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            TemperatureDao temperatureDaoIXiOXO = BleInitializer.f51208IO.IXiOXO();
            List listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.f51266IO);
            long j = this.f51265I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listIi1iii0, 10));
            Iterator it = listIi1iii0.iterator();
            while (it.hasNext()) {
                Temperature temperature = new Temperature((BleTemperature) it.next(), j);
                date.setTime(temperature.getMTime());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                temperature.setMLocalTime(str);
                arrayList.add(temperature);
            }
            temperatureDaoIXiOXO.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.XOO0ii0, null, 2, null);
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadMatchRecord3$1\n*L\n1793#1:2522\n1793#1:2523,3\n*E\n"})
    public static final class iIiiO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51267I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleMatchRecord3> f51268IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public iIiiO(List<BleMatchRecord3> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51268IO = list;
            this.f51267I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            MatchRecordDao matchRecordDaoXii = BleInitializer.f51208IO.Xii();
            List<BleMatchRecord3> list = this.f51268IO;
            long j = this.f51267I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MatchRecord matchRecord = new MatchRecord((BleMatchRecord3) it.next(), j);
                date.setTime(matchRecord.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                matchRecord.setMLocalTime(str);
                arrayList.add(matchRecord);
            }
            matchRecordDaoXii.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.iiIOiX, null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.BleInitializer$iO */
    public static final class C18582iO extends ContentObserver {
        public C18582iO(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            LogUtils.m11131v("BleInitializer SmsObserver onChange -> selfChange=" + z);
            super.onChange(z);
            q62 q62Var = q62.OXO1;
            if (q62Var.I0IIOI()) {
                a01 a01Var = a01.OXO1;
                if (a01Var.m1440iO().getBoolean(b01.f5637iO)) {
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    if (bleConnector.isAvailable()) {
                        String[] strArrXIi00iiXO = gb1.XIi00iiXO();
                        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrXIi00iiXO, strArrXIi00iiXO.length))) {
                            long j = a01Var.m1440iO().getLong(b01.I0iXXO, -1L);
                            Cursor cursorQuery = Utils.getApp().getContentResolver().query(BleInitializer.O0O0X0iOi, null, "read = 0 and type = 1 and _id > " + j, null, "_id desc");
                            if (cursorQuery != null) {
                                Cursor cursor = cursorQuery;
                                try {
                                    Cursor cursor2 = cursor;
                                    if (cursor2.moveToNext()) {
                                        a01Var.m1440iO().put(b01.I0iXXO, cursor2.getLong(cursor2.getColumnIndex("_id")));
                                        BleInitializer bleInitializer = BleInitializer.f51208IO;
                                        bleInitializer.IIO11(true);
                                        bleInitializer.I11iXOO(System.currentTimeMillis());
                                        String string = cursor2.getString(cursor2.getColumnIndex("address"));
                                        String string2 = cursor2.getString(cursor2.getColumnIndex("body"));
                                        if (!q62Var.i0iOi() || TextUtils.isEmpty(string)) {
                                            long time = new Date().getTime();
                                            Intrinsics.XXI(string);
                                            String strIOI = bleInitializer.iOI(string);
                                            Intrinsics.XXI(string2);
                                            BleNotification bleNotification = new BleNotification(127, time, "com.android.mms", strIOI, string2);
                                            i1O0OXO1O.OXO1.IiI10X("BleInitializer SmsObserver onChange -> notification=" + bleNotification);
                                            BaseBleConnector.sendObject$default(bleConnector, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification, false, false, 24, null);
                                        } else {
                                            long time2 = new Date().getTime();
                                            Intrinsics.XXI(string);
                                            String strIOI2 = bleInitializer.iOI(string);
                                            Intrinsics.XXI(string2);
                                            BleNotification2 bleNotification2 = new BleNotification2(127, time2, "com.android.mms", strIOI2, string, string2);
                                            i1O0OXO1O.OXO1.IiI10X("BleInitializer SmsObserver onChange -> notification2=" + bleNotification2);
                                            BaseBleConnector.sendObject$default(bleConnector, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, bleNotification2, false, false, 24, null);
                                        }
                                    }
                                    Unit unit = Unit.OXO1;
                                    CloseableKt.OXO1(cursor, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.OXO1(cursor, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n*L\n2210#1:2522,3\n*E\n"})
    public static final class iOO1ii1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ Calendar f51269I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BlePpgSHSY> f51270IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public iOO1ii1(List<BlePpgSHSY> list, Calendar calendar, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
            this.f51270IO = list;
            this.f51269I1 = calendar;
            this.iX1O1 = simpleDateFormat;
            this.X11iII1O1 = simpleDateFormat2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws Throwable {
            try {
                List<BlePpgSHSY> list = this.f51270IO;
                Calendar calendar = this.f51269I1;
                SimpleDateFormat simpleDateFormat = this.iX1O1;
                SimpleDateFormat simpleDateFormat2 = this.X11iII1O1;
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    BlePpgSHSY blePpgSHSY = (BlePpgSHSY) next;
                    long timeInMillis = calendar.getTimeInMillis() + blePpgSHSY.getMTime();
                    if (i == 0) {
                        BleInitializer bleInitializer = BleInitializer.f51208IO;
                        if (bleInitializer.IX1XiI() == 0) {
                            bleInitializer.I0OX(timeInMillis);
                        }
                    }
                    File fileX0i1O = uz0.X0i1O(sz0.OXO1);
                    String str = simpleDateFormat.format(Long.valueOf(BleInitializer.f51208IO.IX1XiI()));
                    String mBleAddress = BleCache.INSTANCE.getMBleAddress();
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = it;
                    sb.append("ppgSHSYs_");
                    sb.append(str);
                    sb.append(IiXI1X1OO.O00);
                    sb.append(mBleAddress);
                    sb.append(".csv");
                    File file = new File(fileX0i1O, sb.toString());
                    if (!FileUtils.isFileExists(file)) {
                        FileUtils.createOrExistsFile(file);
                        FileIOUtils.writeFileFromString(file, "Timestamp,PPGRaw,PPG\n", false);
                    }
                    String str2 = simpleDateFormat2.format(new Date(timeInMillis));
                    String str3 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(blePpgSHSY.getMPGGRaw())}, 1));
                    Intrinsics.O10IXXX0X(str3, "format(...)");
                    String str4 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(blePpgSHSY.getMPGG())}, 1));
                    Intrinsics.O10IXXX0X(str4, "format(...)");
                    FileIOUtils.writeFileFromString(file, str2 + I000IiI1O.C2156iO.XO0O10 + str3 + I000IiI1O.C2156iO.XO0O10 + str4 + "\n", true);
                    i = i2;
                    it = it2;
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout$1\n*L\n755#1:2522\n755#1:2523,3\n*E\n"})
    public static final class iOOX010X extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ long f51271I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleWorkout> f51272IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ Date iX1O1;

        public iOOX010X(List<BleWorkout> list, long j, Date date, SimpleDateFormat simpleDateFormat) {
            this.f51272IO = list;
            this.f51271I1 = j;
            this.iX1O1 = date;
            this.X11iII1O1 = simpleDateFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                BleInitializer.f51208IO.XXOXi().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WorkoutDao workoutDaoXIIO11I = BleInitializer.f51208IO.XIIO11I();
            List<BleWorkout> list = this.f51272IO;
            long j = this.f51271I1;
            Date date = this.iX1O1;
            SimpleDateFormat simpleDateFormat = this.X11iII1O1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Workout workout = new Workout((BleWorkout) it.next(), j);
                date.setTime(workout.getMStart());
                String str = simpleDateFormat.format(date);
                Intrinsics.O10IXXX0X(str, "format(...)");
                workout.setMLocalTime(str);
                BleCache bleCache = BleCache.INSTANCE;
                if (bleCache.getMBleName().length() > 0) {
                    workout.setMFirmwareFlag(bleCache.getMFirmwareFlag());
                    workout.setMPrototype(bleCache.getMPrototype());
                    workout.setMBleName(bleCache.getMBleName());
                    workout.setMPlatform(bleCache.getMPlatform());
                    workout.setMAGpsType(bleCache.getMAGpsType());
                }
                final WorkoutIndex workoutIndex = new WorkoutIndex(0, 2, workout.getMEnd(), workout.getMMode(), 0, 17, null);
                Application app = Utils.getApp();
                Intrinsics.O10IXXX0X(app, "getApp(...)");
                XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.OiXO1XOO0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.iOOX010X.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                    }
                });
                arrayList.add(workout);
            }
            workoutDaoXIIO11I.insert(arrayList);
            I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.BleInitializer$iX */
    @SourceDebugExtension({"SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorMotion$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorMotion$1\n*L\n2111#1:2522,2\n*E\n"})
    public static final class C18583iX extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ Date f51273I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ List<BleGSensorMotion> f51274IO;
        public final /* synthetic */ SimpleDateFormat X11iII1O1;
        public final /* synthetic */ SimpleDateFormat iX1O1;

        public C18583iX(List<BleGSensorMotion> list, Date date, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
            this.f51274IO = list;
            this.f51273I1 = date;
            this.iX1O1 = simpleDateFormat;
            this.X11iII1O1 = simpleDateFormat2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws Throwable {
            try {
                List<BleGSensorMotion> list = this.f51274IO;
                Date date = this.f51273I1;
                SimpleDateFormat simpleDateFormat = this.iX1O1;
                SimpleDateFormat simpleDateFormat2 = this.X11iII1O1;
                for (BleGSensorMotion bleGSensorMotion : list) {
                    date.setTime(System.currentTimeMillis());
                    File file = new File(uz0.X0i1O(sz0.OXO1), "gSensorMotions_" + simpleDateFormat.format(date) + ".csv");
                    if (!FileUtils.isFileExists(file)) {
                        FileUtils.createOrExistsFile(file);
                        FileIOUtils.writeFileFromString(file, "date,value\n", false);
                    }
                    if (bleGSensorMotion.getMMotion() > 42) {
                        FileIOUtils.writeFileFromString(file, simpleDateFormat2.format(date) + I000IiI1O.C2156iO.XO0O10 + ((int) bleGSensorMotion.getMMotion()) + "\n", true);
                    }
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    static {
        Handler handler = new Handler();
        i11I = handler;
        IiiXiI0I = -1;
        XX00i10X = new XIi00iiXO();
        O0O0X0iOi = Uri.parse("content://sms/");
        iOI = new C18582iO(handler);
        IX1XiI = new long[]{500, 500};
        XXiO0i = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1IX0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BleInitializer.OXii10I();
            }
        });
        iXi = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXXIIXO1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BleInitializer.IiiiOIIi0();
            }
        });
        O0O = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1O
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BleInitializer.IOX1();
            }
        });
    }

    public static final BloodGlucoseDao I011X() {
        return MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
    }

    public static final void I0i1OXiI(boolean z) {
        if (z) {
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
        }
        BleConnector.INSTANCE.unbind();
        f51208IO.XOXiX0();
    }

    /* JADX INFO: renamed from: II */
    public static final PressureDao m38218II() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    public static final AlipayBindInfoDao II1() {
        return MyDb.INSTANCE.getMDatabase().alipayBindInfoDao();
    }

    public static final Vibrator IOX1() {
        Object systemService = Utils.getApp().getSystemService("vibrator");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService;
    }

    /* JADX INFO: renamed from: IX */
    public static final Unit m38220IX(PermissionStatus status) {
        Intrinsics.X0O(status, "status");
        if (status == PermissionStatus.GRANTED) {
            C2702ms c2702ms = iii0;
            if (c2702ms != null) {
                c2702ms.IiI10X(R.string.get_your_location, false);
            }
        } else {
            LogUtils.m11131v("onRequestAgpsPrerequisite -> Location permission is not granted");
        }
        return Unit.OXO1;
    }

    public static final AssetFileDescriptor IiiiOIIi0() {
        return Utils.getApp().getAssets().openFd("find_phone.ogg");
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

    public static final Unit OIIOI(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            LogUtils.m11128d("hang up OK");
            Object systemService = Utils.getApp().getSystemService("telecom");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
            ((TelecomManager) systemService).endCall();
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ void OX0X1O10X(BleInitializer bleInitializer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        bleInitializer.O0Ii(z);
    }

    public static final SleepDao OXI0Xi() {
        return MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static final AudioManager OXii10I() {
        Object systemService = Utils.getApp().getSystemService("audio");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* JADX INFO: renamed from: Oi */
    public static /* synthetic */ String m38223Oi(BleInitializer bleInitializer, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "54";
        }
        return bleInitializer.iiIOiX(str, str2);
    }

    public static final boolean Oii1I1I10(MediaPlayer mediaPlayer, int i, int i2) {
        f51208IO.iOXiO1O1I();
        return false;
    }

    public static final WorkoutDao Oiii() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final void X10i() {
        BleConnector.INSTANCE.connectClassic();
    }

    public static final HrvDao X11() {
        return MyDb.INSTANCE.getMDatabase().hrvDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationDao X1OI() {
        return (LocationDao) iXiX011.getValue();
    }

    public static final ActivityDao X1i() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    /* JADX INFO: renamed from: XI */
    public static final ElectrocardiogramDao m38225XI() {
        return MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
    }

    public static final CharSequence XII01OO1I(BleLogText it) {
        Intrinsics.X0O(it, "it");
        return it.getMContent();
    }

    public static final VitalityDao XIIIO() {
        return MyDb.INSTANCE.getMDatabase().vitalityDao();
    }

    public static final HanBaoVibrationDao XOO0Xi() {
        return MyDb.INSTANCE.getMDatabase().hanBaoVibrationDao();
    }

    public static final MatchRecordDao XOOI0O() {
        return MyDb.INSTANCE.getMDatabase().matchRecordDao();
    }

    public static final Unit XOOXII(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            LogUtils.m11128d("hang up OK");
            TelecomManager telecomManager = (TelecomManager) Utils.getApp().getSystemService("telecom");
            if (telecomManager != null) {
                telecomManager.acceptRingingCall();
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: renamed from: Xi */
    public static final boolean m38226Xi(LogLevel level, String str, String msg) {
        Intrinsics.X0O(level, "level");
        Intrinsics.X0O(str, "<unused var>");
        Intrinsics.X0O(msg, "msg");
        ThreadUtils.executeBySingle(new OXO1(msg, level));
        return false;
    }

    public static final Unit i01OOiI(int i, PermissionStatus status) {
        Intrinsics.X0O(status, "status");
        if (status != PermissionStatus.GRANTED) {
            LogUtils.m11131v("onRequestLocation workout -> Location permission is not granted");
        } else if (i == 1) {
            XOO0XOOii = System.currentTimeMillis();
            iiIOiX = 0.0d;
            a01 a01Var = a01.OXO1;
            a01Var.OXO1().put(b01.iIiiO, "");
            a01Var.OXO1().put(b01.XiOIii1, true, true);
            f51208IO.I1OI();
        } else if (i == 2) {
            a01 a01Var2 = a01.OXO1;
            if (a01Var2.OXO1().getBoolean(b01.XX0, false)) {
                a01Var2.OXO1().put(b01.OiIIX101O, false, true);
            } else {
                f51208IO.I1OI();
            }
            a01Var2.OXO1().put(b01.XiOIii1, true, true);
        } else if (i == 3) {
            a01.OXO1.OXO1().put(b01.OiIIX101O, true, true);
        } else if (i != 4) {
            LogUtils.m11131v("Unknown workoutState");
        } else {
            a01 a01Var3 = a01.OXO1;
            a01Var3.OXO1().put(b01.iIiiO, "");
            a01Var3.OXO1().put(b01.OiIIX101O, true, true);
            IXI = false;
        }
        return Unit.OXO1;
    }

    public static final TemperatureDao i0O() {
        return MyDb.INSTANCE.getMDatabase().temperatureDao();
    }

    public static final WorkoutIndexDao i0iIXiI() {
        return MyDb.INSTANCE.getMDatabase().workoutIndexDao();
    }

    public static final DailyPowerDao iIIIi() {
        return MyDb.INSTANCE.getMDatabase().dailyPowerDao();
    }

    public static final Unit iIXX0i(BleCyWeeAlgorithm bleCyWeeAlgorithm, boolean z) {
        a01.OXO1.m1440iO().put(BleCyWeeAlgorithm.class.getName(), new Gson().toJson(bleCyWeeAlgorithm));
        return Unit.OXO1;
    }

    public static final EnergyRatingDao iO11i() {
        return MyDb.INSTANCE.getMDatabase().energyRating();
    }

    public static final LocationDao iX0iii0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    public static final Unit iXOiXII() throws InterruptedException {
        while (true) {
            a01 a01Var = a01.OXO1;
            if (!a01Var.OXO1().getBoolean(b01.XX0, true)) {
                return Unit.OXO1;
            }
            a01Var.OXO1().put(b01.OiIIX101O, true, true);
            Thread.sleep(60000L);
            if (a01Var.OXO1().getBoolean(b01.OiIIX101O, true)) {
                a01Var.OXO1().put(b01.XX0, false, true);
                C2702ms c2702ms = Xi1i0XOX0;
                if (c2702ms != null) {
                    c2702ms.I0IIOi();
                }
                Ii0i = false;
                IXI = false;
            }
        }
    }

    public static final BloodOxygenDao iiX0i1IX() {
        return MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
    }

    /* JADX INFO: renamed from: I0 */
    public final RespiratoryRateDao m38230I0() {
        return (RespiratoryRateDao) i0X000X0O.getValue();
    }

    public final void I00(long j) {
        X0iO = j;
    }

    public final void I0IIOI(String str) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("handleIncomingCall -> " + str);
        if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO)) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable()) {
                String[] strArrOXO1 = gb1.OXO1();
                if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                    String strIOI = iOI(str);
                    i1o0oxo1o.OXO1("BleInitializer handleIncomingCall -> Send title = " + strIOI + "  phoneNumber" + str);
                    if (TextUtils.isEmpty(strIOI) && (strIOI = ii0111XI()) == null) {
                        strIOI = "";
                    }
                    String str2 = (!TextUtils.isEmpty(strIOI) || TextUtils.isEmpty(str)) ? strIOI : str;
                    long time = new Date().getTime();
                    String string = Utils.getApp().getString(R.string.incoming_call);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    BleNotification bleNotification = new BleNotification(1, time, null, str2, string, 4, null);
                    i1o0oxo1o.OXO1("BleInitializer handleIncomingCall -> Send Notification = " + bleNotification);
                    BaseBleConnector.sendObject$default(bleConnector, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification, false, false, 24, null);
                }
            }
        }
    }

    public final void I0OX(long j) {
        X00O0 = j;
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

    public final void I11iXOO(long j) {
        IXOIIIO = j;
    }

    public final void I1Ii(boolean z) {
        X00Xi1X = z;
    }

    public final void I1OI() {
        if (!Ii0i) {
            I01XX0.XIi00iiXO(I01XX0.XOO0XOOii, null, 2, null);
        }
        Ii0i = true;
        IXI = true;
        a01.OXO1.OXO1().put(b01.XX0, true);
        C2702ms c2702ms = Xi1i0XOX0;
        if (c2702ms != null) {
            C2702ms.XOO0ii0(c2702ms, R.string.device_no_support_and_phone_get_location_desc, false, 2, null);
        }
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.iXI01X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BleInitializer.iXOiXII();
            }
        }, 31, null);
    }

    @SuppressLint({"WrongConstant"})
    public final void I1XII0X(final Application application) {
        I0iIi i0iIi = I0iIi.OXO1;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.sma.smartv3.initializer.BleInitializer$registerMyReceiver$1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1513032534:
                            if (action.equals("android.intent.action.TIME_TICK") && a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false)) {
                                MyNotificationListenerService.O001I.OXO1(application);
                                return;
                            }
                            return;
                        case -19011148:
                            if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.LANGUAGE, BleKeyFlag.UPDATE, Languages.languageToCode$default(Languages.INSTANCE, null, 0, 3, null), false, false, 24, null);
                                I01XX0.XIi00iiXO(I01XX0.OXO1, null, 2, null);
                                return;
                            }
                            return;
                        case 502473491:
                            if (!action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                                return;
                            }
                            break;
                        case 505380757:
                            if (!action.equals("android.intent.action.TIME_SET")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.TIME_ZONE;
                    BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                    BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, new BleTimeZone(), false, false, 24, null);
                    BaseBleConnector.sendObject$default(bleConnector, BleKey.TIME, bleKeyFlag, BleTime.Companion.local(), false, false, 24, null);
                    BaseBleConnector.sendInt8$default(bleConnector, BleKey.HOUR_SYSTEM, bleKeyFlag, !O0X11OiO.X11iII1O1() ? 1 : 0, false, false, 24, null);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        Unit unit = Unit.OXO1;
        i0iIi.OXO1(application, broadcastReceiver, intentFilter, 2);
    }

    public final void IIO11(boolean z) {
        f51211X1 = z;
    }

    public final synchronized void IIX(@aa1 Context context) {
        try {
            Intrinsics.X0O(context, "context");
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && !XOIX && PermissionUtils.isGranted("android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE")) {
                telephonyManager.listen(XX00i10X, 32);
                XOIX = true;
            }
            i1O0OXO1O.OXO1.IiI10X("setPhoneListener -> " + XOIX);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String IO0iXO0O(String str) {
        String strReplace = new Regex("[^0-9+]").replace(StringsKt__StringsKt.iX1X1(str).toString(), "");
        return (oe5.m2764O0(strReplace, "+54", false, 2, null) || oe5.m2764O0(strReplace, "54", false, 2, null)) ? iiIOiX(strReplace, "54") : str;
    }

    public final void IOI() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isAvailable()) {
            BleCache bleCache = BleCache.INSTANCE;
            if ((Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) && !q62.OXO1.I0OX()) {
                BleNotificationSettings bleNotificationSettings = new BleNotificationSettings();
                if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO, false)) {
                    bleNotificationSettings.enable("tel");
                } else {
                    bleNotificationSettings.disable("tel");
                }
                BaseBleConnector.sendObject$default(bleConnector, BleKey.NOTIFICATION_REMINDER, BleKeyFlag.UPDATE, bleNotificationSettings, false, false, 24, null);
            }
        }
    }

    public final void IOI0i0I(boolean z) {
        IXI = z;
    }

    public final void IOIi00(String str) {
        LogUtils.m11128d("handleIncomingCall2 -> " + str);
        if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO)) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable()) {
                String[] strArrOXO1 = gb1.OXO1();
                if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                    String strIOI = iOI(str);
                    if (TextUtils.isEmpty(strIOI) && (strIOI = ii0111XI()) == null) {
                        strIOI = "";
                    }
                    long time = new Date().getTime();
                    String string = Utils.getApp().getString(R.string.incoming_call);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    BleNotification2 bleNotification2 = new BleNotification2(1, time, null, strIOI, str, string, 4, null);
                    i1O0OXO1O.OXO1.IiI10X("BleInitializer handleIncomingCall2 -> Send Notification2 = " + bleNotification2);
                    BaseBleConnector.sendObject$default(bleConnector, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, bleNotification2, false, false, 24, null);
                }
            }
        }
    }

    public final long IOi1O0() {
        return IXOIIIO;
    }

    public final ActivityDao IX0IXOi() {
        return (ActivityDao) X11iII1O1.getValue();
    }

    public final void IX0iIX() {
        LogUtils.m11128d("handleEnd");
        if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO)) {
            BleNotification bleNotification = new BleNotification(1, 0L, null, null, null, 30, null);
            i1O0OXO1O.OXO1.IiI10X("BleInitializer handleEnd -> Send Notification = " + bleNotification);
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.DELETE, bleNotification, false, false, 24, null);
        }
    }

    public final long IX1XiI() {
        return X00O0;
    }

    public final void IXO0OOi() {
        iOXiO1O1I();
        try {
            AudioManager audioManagerO0O = O0O();
            audioManagerO0O.setStreamVolume(4, audioManagerO0O.getStreamMaxVolume(4), 0);
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setLooping(true);
            BleInitializer bleInitializer = f51208IO;
            mediaPlayer.setDataSource(bleInitializer.X00O0().getFileDescriptor(), bleInitializer.X00O0().getStartOffset(), bleInitializer.X00O0().getLength());
            mediaPlayer.setAudioStreamType(4);
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.android.mltcode.paycertificationapi.Ii1XiOX1
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return BleInitializer.Oii1I1I10(mediaPlayer2, i, i2);
                }
            });
            mediaPlayer.prepare();
            mediaPlayer.start();
            IX0IXOi = mediaPlayer;
            iOX().vibrate(IX1XiI, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final TemperatureDao IXiOXO() {
        return (TemperatureDao) O001I.getValue();
    }

    public final boolean IiXIIX1O1() {
        return XOIX;
    }

    @sf5(tag = I01XX0.X100O)
    public final void O0Ii(boolean z) {
        i1O0OXO1O.OXO1.OXO1("onUnbind");
        HykyManager.Companion.getInstance().bindDevice(false);
        if (z) {
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.IDENTITY, BleKeyFlag.DELETE, null, false, false, 28, null);
        } else {
            I01XX0.XIi00iiXO(I01XX0.O0O, null, 2, null);
        }
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            ov0.OXO1.I0IIOi(mDeviceInfo);
        }
        WebSocketManager.INSTANCE.unInitWsManager();
        q62 q62Var = q62.OXO1;
        final boolean z2 = q62Var.O0i0() || q62Var.IiO0();
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIXiOii
            @Override // java.lang.Runnable
            public final void run() {
                BleInitializer.I0i1OXiI(z2);
            }
        }, 2000L);
        WxManager.IX1XiI(WxManager.OXO1, null, 1, null);
        WAManager.OX110i(WAManager.OXO1, null, 1, null);
    }

    public final AudioManager O0O() {
        return (AudioManager) XXiO0i.getValue();
    }

    public final String O0O0X0iOi(String str) {
        String str2;
        if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            return cp5.OX110i(str);
        }
        try {
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            if (UtilsKt.IiiXiI0I(app) && str.length() == 5) {
                str2 = " = '" + str + "'";
            } else {
                str2 = " like '%" + str + "'";
            }
            i1O0OXO1O.OXO1.OXO1("getPN1 -> " + str2);
            Cursor cursorQuery = Utils.getApp().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data4"}, "data4" + str2, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    if (cursor2.moveToNext()) {
                        String string = cursor2.getString(cursor2.getColumnIndex("display_name"));
                        Intrinsics.O10IXXX0X(string, "getString(...)");
                        String strXX1Oi = cp5.XX1Oi(string);
                        CloseableKt.OXO1(cursor, null);
                        return strXX1Oi;
                    }
                    Unit unit = Unit.OXO1;
                    CloseableKt.OXO1(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(cursor, th);
                        throw th2;
                    }
                }
            }
            return cp5.OX110i(str);
        } catch (Exception e) {
            e.printStackTrace();
            return cp5.OX110i(str);
        }
    }

    public final void O0i() {
        ContentResolver contentResolver = Utils.getApp().getContentResolver();
        C18582iO c18582iO = iOI;
        contentResolver.unregisterContentObserver(c18582iO);
        String[] strArrXIi00iiXO = gb1.XIi00iiXO();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrXIi00iiXO, strArrXIi00iiXO.length))) {
            Utils.getApp().getContentResolver().registerContentObserver(O0O0X0iOi, true, c18582iO);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final long m38231O1() {
        return XOO0XOOii;
    }

    public final SleepDao O101() {
        return (SleepDao) X0i1O.getValue();
    }

    public final double O1iXiI() {
        return iiIOiX;
    }

    /* JADX INFO: renamed from: OI */
    public final boolean m38232OI() {
        return Ii0X0X;
    }

    public final void OX0(int i) {
        f51210Oi = i;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2909s5
    public void OXO1(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        O11XO1X.XO0O10().X1ii(this);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.XIi00iiXO("BleInitializer(smartv3).init() -> BleConnector hash: " + System.identityHashCode(BleConnector.INSTANCE));
        i1o0oxo1o.O00(new Function3() { // from class: com.android.mltcode.paycertificationapi.XO0I0O
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(BleInitializer.m38226Xi((LogLevel) obj, (String) obj2, (String) obj3));
            }
        });
        new BleConnector.Builder(app).supportNordicOta(true).supportRealtekDfu(true).supportMtkOta(true).build().addHandleCallback(this);
        I1XII0X(app);
        IIX(app);
        O0i();
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            C2916sc.XIi00iiXO(app);
        }
        iOXOiI.OXO1.XOO0ii0(app);
        AIWatchFaceManager.OXO1.X1ii(app);
        WxManager.OXO1.m38155Oi(app);
        WAManager.OXO1.Ii1iii0(app);
    }

    public final void OXOO0X0i(boolean z) {
        Ii0i = z;
    }

    public final void OXXO0O1X(long j) {
        XOO0XOOii = j;
    }

    public final void OXi001(int i) {
        if (q62.OXO1.OI1i1i()) {
            i1O0OXO1O.OXO1.OXO1("handleInComingCall value=" + i);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.INCOMING_CALL, BleKeyFlag.UPDATE, i, false, false, 24, null);
        }
    }

    @sf5(tag = b01.XiOIO)
    public final void Oi1(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (BleConnector.INSTANCE.isBound()) {
            LogUtils.m11131v("BleInitializer onLocationWhere");
            Xi1i0XOX0 = C2743ns.XO0O10();
            iii0 = C2743ns.XIi00iiXO(new XO0O10(), false, 2, null);
        }
    }

    public final void OiO0IOX(boolean z) {
        IO0iXO0O = z;
    }

    public final void OiXI1OiX0(@tb1 BleNotification bleNotification) {
        XOXiX0 = bleNotification;
    }

    public final void X00110X() {
        C2702ms c2702ms = iii0;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    public final AssetFileDescriptor X00O0() {
        return (AssetFileDescriptor) iXi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0I1(@aa1 List<Workout> workouts) {
        Intrinsics.X0O(workouts, "workouts");
        i1O0OXO1O.OXO1.OXO1("insert2MatchRecord -> " + workouts.size());
        MatchRecordDao matchRecordDaoXii = Xii();
        List<Workout> list = workouts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (Workout workout : list) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            MatchRecord matchRecord = new MatchRecord(0, 0L, null, i, i2, i3, null, i4, i5, null, null, i6, i7, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, C2229at.f5560IO, null);
            matchRecord.setMSource(1);
            matchRecord.setMMode(workout.getMMode());
            matchRecord.setMStart(workout.getMStart());
            matchRecord.setMLocalTime(workout.getMLocalTime());
            MatchPeriod matchPeriod = new MatchPeriod(0, 0, i, i2, i3, 0, i4, i5, 0, 0, i6, i7, bo0.f5772iO, 0 == true ? 1 : 0);
            matchPeriod.setMDuration(workout.getMDuration());
            matchPeriod.setMDistance(workout.getMDistance() / 10);
            matchPeriod.setMStep(workout.getMStep());
            matchPeriod.setMCalorie(workout.getMCalorie() / 1000);
            matchPeriod.setMSpeed(workout.getMSpeed() / 100);
            matchPeriod.setMAvgBpm(workout.getMAvgBpm());
            matchPeriod.setMMaxBpm(workout.getMMaxBpm());
            matchRecord.setMPeriod(matchPeriod);
            matchRecord.setMMinBpm(workout.getMMinBpm());
            matchRecord.setMAirPressure(workout.getMAirPressure());
            matchRecord.setMPace(workout.getMPace());
            matchRecord.setMMaxPace(workout.getMMaxPace());
            matchRecord.setMMinPace(workout.getMMinPace());
            matchRecord.setMSpm(workout.getMSpm());
            matchRecord.setMMaxSpm(workout.getMMaxSpm());
            matchRecord.setMMinSpm(workout.getMMinSpm());
            matchRecord.setMAltitude(workout.getMAltitude());
            matchRecord.setMMaxAltitude(workout.getMMaxAltitude());
            matchRecord.setMMinAltitude(workout.getMMinAltitude());
            arrayList.add(matchRecord);
        }
        matchRecordDaoXii.insert(arrayList);
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

    public final void XIO11I(String str) {
        LogUtils.m11128d("handleMissedCall -> " + str);
        if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO)) {
            IO0II0i = true;
            String strIOI = iOI(str);
            if (TextUtils.isEmpty(strIOI) && (strIOI = ii0111XI()) == null) {
                strIOI = "";
            }
            long time = new Date().getTime();
            String string = Utils.getApp().getString(R.string.missed_call);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            BleNotification bleNotification = new BleNotification(127, time, BleNotification.PACKAGE_MISSED_CALL, strIOI, string);
            i1O0OXO1O.OXO1.IiI10X("BleInitializer handleMissedCall -> Send Notification = " + bleNotification);
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification, false, false, 24, null);
        }
    }

    public final void XOIO11O(String str) {
        LogUtils.m11128d("handleMissedCall2 -> " + str);
        if (a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO)) {
            IO0II0i = true;
            String strIOI = iOI(str);
            if (TextUtils.isEmpty(strIOI) && (strIOI = ii0111XI()) == null) {
                strIOI = "";
            }
            long time = new Date().getTime();
            String string = Utils.getApp().getString(R.string.missed_call);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            BleNotification2 bleNotification2 = new BleNotification2(127, time, BleNotification.PACKAGE_MISSED_CALL, strIOI, str, string);
            i1O0OXO1O.OXO1.IiI10X("BleInitializer handleMissedCall2 -> Send Notification2 = " + bleNotification2);
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION2, BleKeyFlag.UPDATE, bleNotification2, false, false, 24, null);
        }
    }

    public final void XOIX() {
        i72 i72Var = i72.OXO1;
        BleCache bleCache = BleCache.INSTANCE;
        i72Var.IXi01O(Intrinsics.XOO0ii0(bleCache.getMFirmwareFlag(), q62.IIIO1i) ? DateTimeFormat.ddMMyyyy : i72Var.OII());
        LogUtils.m11128d("changeDateFormat => " + i72Var.XiOIO());
        BaseBleCache.putInt$default(bleCache, BleKey.DATE_FORMAT, i72Var.XiOIO().getType(), null, 4, null);
        I01XX0.XIi00iiXO(I01XX0.IX0IXOi, null, 2, null);
    }

    public final void XOO0XOOii() {
        i1O0OXO1O.OXO1.OXO1("configConnect");
        if (q62.OXO1.X0100I()) {
            BleConnector.INSTANCE.setScanMode(ScanMode.LOW_LATENCY);
            return;
        }
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.setScanMode(ScanMode.BALANCED);
        bleConnector.setScanMaxDuration(12);
        bleConnector.setForceConnectDirectly(false);
    }

    public final boolean XOXOIX0Oi() {
        return IO0II0i;
    }

    public final void XOXiX0() {
        a01 a01Var = a01.OXO1;
        a01Var.XIi00iiXO().remove(DeviceConfigInfo.class.getName());
        if (i72.OXO1.XIO11I()) {
            I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
        }
        a01Var.XIi00iiXO().clear();
        BleCache bleCache = BleCache.INSTANCE;
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST3, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.IDENTITY, null, 2, null);
        bleCache.remove(BleKey.COACHING, BleKeyFlag.READ);
        BaseBleCache.remove$default(bleCache, BleKey.GAME_SET, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.POWER_SAVE_MODE, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.GAME_TIME_REMINDER, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.FIRMWARE_VERSION, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.UI_PACK_VERSION, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.CALORIES_GOAL, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.DISTANCE_GOAL, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.TOUCH_SET, null, 2, null);
        I01XX0.XIi00iiXO(I01XX0.f1084IO, null, 2, null);
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
        FileUtils.delete(uz0.IiI10X(sz0.OXO1));
        a01Var.IiI10X().put(b01.iOOX010X, true);
        a01Var.IiI10X().remove(DcsToken.class.getName());
        XOIX();
        a01Var.IiI10X().put(b01.I1XOi1, "");
        a01Var.m1440iO().remove(GetSNCodeHYKY.Response.class.getName());
    }

    public final void XX00XX(boolean z) {
        IO0II0i = z;
    }

    public final String XX00i10X(int i) {
        if (i == 0) {
            return "IDLE";
        }
        if (i != 1) {
            return i != 2 ? "UNKNOWN" : "OFFHOOK";
        }
        return "RINGING";
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

    public final void i000X(final BleAgpsPrerequisite bleAgpsPrerequisite) {
        if (q62.OXO1.IIXXi1()) {
            NetWorkUtils.INSTANCE.findAltitudeByLocation(bleAgpsPrerequisite.getMLongitude(), bleAgpsPrerequisite.getMLatitude(), new O1XIiIO<Integer>() { // from class: com.sma.smartv3.initializer.BleInitializer$sendAGPSData$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Integer num) {
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.AGPS_PREREQUISITE;
                    BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                    BleAgpsPrerequisite bleAgpsPrerequisite2 = bleAgpsPrerequisite;
                    Intrinsics.XXI(num);
                    bleAgpsPrerequisite2.setMAltitude(num.intValue());
                    Unit unit = Unit.OXO1;
                    BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleAgpsPrerequisite2, false, false, 24, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, bleAgpsPrerequisite, false, false, 24, null);
                }
            });
        } else {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, bleAgpsPrerequisite, false, false, 24, null);
        }
    }

    public final void i0101i(boolean z) {
        XXiIiX10 = z;
    }

    public final boolean i0X1iIO() {
        return X00Xi1X;
    }

    public final HanBaoVibrationDao i100IXOX() {
        return (HanBaoVibrationDao) f51209OO.getValue();
    }

    public final boolean i1O11001() {
        return IXI;
    }

    public final void i1iII1i1(boolean z) {
        Ii0X0X = z;
    }

    public final HeartRateDao iI0I() {
        return (HeartRateDao) XXX11i.getValue();
    }

    public final boolean iIIIiIO0() {
        return f51211X1;
    }

    public final HrvDao iIX0i() {
        return (HrvDao) Ii1iii0.getValue();
    }

    public final int iIi0() {
        return f51210Oi;
    }

    public final EnergyRatingDao iIi1() {
        return (EnergyRatingDao) iOiXi11II.getValue();
    }

    public final String iOI(String str) {
        String strIO0iXO0O = IO0iXO0O(str);
        if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            return cp5.OX110i(strIO0iXO0O);
        }
        try {
            Cursor cursorQuery = Utils.getApp().getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(strIO0iXO0O)), null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    if (cursor2.moveToNext()) {
                        String string = cursor2.getString(cursor2.getColumnIndex("display_name"));
                        Intrinsics.O10IXXX0X(string, "getString(...)");
                        String strXX1Oi = cp5.XX1Oi(string);
                        CloseableKt.OXO1(cursor, null);
                        return strXX1Oi;
                    }
                    Unit unit = Unit.OXO1;
                    CloseableKt.OXO1(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(cursor, th);
                        throw th2;
                    }
                }
            }
            return O0O0X0iOi(strIO0iXO0O);
        } catch (Exception e) {
            e.printStackTrace();
            return cp5.OX110i(strIO0iXO0O);
        }
    }

    public final Vibrator iOX() {
        return (Vibrator) O0O.getValue();
    }

    public final void iOXiO1O1I() {
        MediaPlayer mediaPlayer = IX0IXOi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            IX0IXOi = null;
        }
        iOX().cancel();
    }

    public final void iX00X1X(double d) {
        iiIOiX = d;
    }

    public final boolean iX01() {
        return XXiIiX10;
    }

    public final void iXOII(boolean z) {
        XOIX = z;
    }

    public final AlipayBindInfoDao iXi() {
        return (AlipayBindInfoDao) XX1Oi.getValue();
    }

    public final void ii00OXXO(boolean z) {
        XO0X10iO = z;
    }

    @tb1
    public final String ii0111XI() {
        BleNotification bleNotification = XOXiX0;
        String strValueOf = null;
        if (Intrinsics.XOO0ii0(bleNotification != null ? bleNotification.getMPackage() : null, BleNotification.GOOGLE_DUO)) {
            BleNotification bleNotification2 = XOXiX0;
            strValueOf = String.valueOf(bleNotification2 != null ? bleNotification2.getMTitle() : null);
        }
        i1O0OXO1O.OXO1.OXO1("tryGetNameByNotification name -> " + strValueOf);
        return strValueOf;
    }

    public final PressureDao iiII() {
        return (PressureDao) iiiO.getValue();
    }

    public final String iiIOiX(String str, String str2) {
        String str3 = qu0.O00;
        String strIiIiIiX = StringsKt__StringsKt.IiIiIiX(str, qu0.O00);
        int length = str2.length();
        if (strIiIiIiX.length() <= length) {
            return str;
        }
        String strSubstring = strIiIiIiX.substring(length);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        if (oe5.m2764O0(strSubstring, "9", false, 2, null) || strSubstring.length() <= 0 || oe5.m2764O0(strSubstring, "0", false, 2, null) || strSubstring.length() > 9) {
            return str;
        }
        if (!oe5.m2764O0(str, qu0.O00, false, 2, null)) {
            str3 = "";
        }
        return str3 + str2 + "9" + strSubstring;
    }

    public final BloodOxygenDao iii0() {
        return (BloodOxygenDao) iXiiiO.getValue();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICoachGeneratePlanUpdate(int i) {
        super.onAICoachGeneratePlanUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICommandUpdate(@aa1 BleAICommand bleAICommand) {
        super.onAICommandUpdate(bleAICommand);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onActivityRecognitionUpdate(int i) {
        super.onActivityRecognitionUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmAdd(@aa1 BleAlarm bleAlarm) {
        super.onAlarmAdd(bleAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmDelete(int i) {
        super.onAlarmDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmUpdate(@aa1 BleAlarm bleAlarm) {
        super.onAlarmUpdate(bleAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppOpUpdate(@aa1 BleAppOp bleAppOp) {
        super.onAppOpUpdate(bleAppOp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppSportDataResponse(boolean z) {
        super.onAppSportDataResponse(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo bleBWNaviInfo) {
        super.onBWNaviInfoUpdate(bleBWNaviInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBacklightUpdate(int i) {
        super.onBacklightUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBandKeyUpdate(@aa1 BleBandKey bleBandKey) {
        super.onBandKeyUpdate(bleBandKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleGolfScore(@aa1 BleGolfScore bleGolfScore) {
        super.onBleGolfScore(bleGolfScore);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData bleThirdPartyData) {
        super.onBleThirdPartyDataUpdate(bleThirdPartyData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleVideoCallInfo(@aa1 BleVideoCallInfo bleVideoCallInfo) {
        super.onBleVideoCallInfo(bleVideoCallInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPChatUpdate(@aa1 BleCPChat bleCPChat) {
        super.onCPChatUpdate(bleCPChat);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo bleCPGiftsInfo) {
        super.onCPGiftsInfoUpdate(bleCPGiftsInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPListenerUpdate(@aa1 BleCPListener bleCPListener) {
        super.onCPListenerUpdate(bleCPListener);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPMissYouUpdate(@aa1 BleCPMissYou bleCPMissYou) {
        super.onCPMissYouUpdate(bleCPMissYou);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPTodoUpdate(@aa1 BleCPTodo bleCPTodo) {
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
    public /* bridge */ void onChatAppUpdate(@aa1 BleChatApp bleChatApp) {
        super.onChatAppUpdate(bleChatApp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatMessageUpdate(@aa1 BleChatMessage bleChatMessage) {
        super.onChatMessageUpdate(bleChatMessage);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatVoiceUpdate(@aa1 BleChatVoice bleChatVoice) {
        super.onChatVoiceUpdate(bleChatVoice);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay bleCheckInEveryDay) {
        super.onCheckInEveryDayUpdate(bleCheckInEveryDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onClassicBluetoothStateChange(int i) {
        if (i == 3) {
            i11I.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iXIiOiIOi
                @Override // java.lang.Runnable
                public final void run() {
                    BleInitializer.X10i();
                }
            }, 3000L);
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandReply(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, boolean z) {
        super.onCommandReply(bleKey, bleKeyFlag, z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onCommandSendTimeout(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
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
    public /* bridge */ void onDeviceConnected(@aa1 BluetoothDevice bluetoothDevice) {
        super.onDeviceConnected(bluetoothDevice);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnecting(boolean z) {
        super.onDeviceConnecting(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceFileUpdate(@aa1 BleDeviceFile deviceFile) throws Throwable {
        Intrinsics.X0O(deviceFile, "deviceFile");
        Date date = new Date();
        date.setTime((((long) (deviceFile.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis())));
        File file = new File(uz0.XiOIO(sz0.OXO1), O0X11OiO.IO0iXO0O().format(date) + com.tenmeter.smlibrary.utils.FileUtils.FILE_EXTENSION_SEPARATOR + deviceFile.getMFileFormat());
        if (deviceFile.getMFileSize() != 0) {
            FileIOUtils.writeFileFromBytesByStream(file, deviceFile.getMFileContent(), true);
        }
        if (deviceFile.getMFileSize() == deviceFile.getMOffsetValue() + deviceFile.getMFileContent().length && deviceFile.getMFileFormat() == 3) {
            byte[] file2BytesByChannel = FileIOUtils.readFile2BytesByChannel(file);
            if (file2BytesByChannel.length > 4) {
                Intrinsics.XXI(file2BytesByChannel);
                ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
                int i = ByteArrayExtKt.getInt(file2BytesByChannel, 0, 2, LITTLE_ENDIAN);
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
                int i2 = ByteArrayExtKt.getInt(file2BytesByChannel, 2, 2, LITTLE_ENDIAN);
                LogUtils.m11128d("onDeviceFileUpdate -> " + i + ", " + i2);
                byte[] bArrI0IIOI = ArraysKt___ArraysJvmKt.I0IIOI(file2BytesByChannel, 4, file2BytesByChannel.length);
                ArraysKt___ArraysKt.OOOI(bArrI0IIOI);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArrI0IIOI));
                ImageUtils.save(ImageUtils.rotate(bitmapCreateBitmap, 180, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f), file.getPath() + ".png", Bitmap.CompressFormat.PNG);
                ToastUtils.showLong("图片保存成功!", new Object[0]);
            }
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceOpUpdate(int i) {
        super.onDeviceOpUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceRequestAGpsFile(@aa1 String url) {
        Intrinsics.X0O(url, "url");
        AGPSInitializer.m38211I1(AGPSInitializer.f51206IO, false, null, 2, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply smsQuickReply) {
        Object next;
        Intrinsics.X0O(smsQuickReply, "smsQuickReply");
        String mPhone = smsQuickReply.getMPhone();
        Iterator it = BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleSMSQuickReplyContent.class, null, 4, null).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BleSMSQuickReplyContent) next).getMId() != smsQuickReply.getMId());
        BleSMSQuickReplyContent bleSMSQuickReplyContent = (BleSMSQuickReplyContent) next;
        String mContent = bleSMSQuickReplyContent != null ? bleSMSQuickReplyContent.getMContent() : null;
        if (TextUtils.isEmpty(mPhone) || TextUtils.isEmpty(mContent)) {
            return;
        }
        LogUtils.m11128d("sms -> p:" + mPhone + " , c:" + mContent);
        int defaultSmsSubscriptionId = SmsManager.getDefaultSmsSubscriptionId();
        StringBuilder sb = new StringBuilder();
        sb.append("Default subId ");
        sb.append(defaultSmsSubscriptionId);
        LogUtils.m11128d(sb.toString());
        SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(defaultSmsSubscriptionId);
        ArrayList<String> arrayListDivideMessage = smsManagerForSubscriptionId.divideMessage(mContent);
        Intrinsics.O10IXXX0X(arrayListDivideMessage, "divideMessage(...)");
        Iterator<String> it2 = arrayListDivideMessage.iterator();
        while (it2.hasNext()) {
            smsManagerForSubscriptionId.sendTextMessage(mPhone, null, it2.next(), null, null);
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSportDataUpdate(@aa1 BleDeviceSportData bleDeviceSportData) {
        super.onDeviceSportDataUpdate(bleDeviceSportData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDistanceGoalUpdate(int i) {
        super.onDistanceGoalUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings bleDoubleScreenSettings) {
        super.onDoubleScreenSettingsUpdate(bleDoubleScreenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings bleDrinkWaterSettings) {
        super.onDrinkWaterUpdate(bleDrinkWaterSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings bleEarphoneAncSettings) {
        super.onEarphoneAncSettingsUpdate(bleEarphoneAncSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneCallUpdate(int i) {
        super.onEarphoneCallUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneKeyUpdate(@aa1 BleEarphoneKey bleEarphoneKey) {
        super.onEarphoneKeyUpdate(bleEarphoneKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
        super.onEarphoneSoundEffectsSettingsUpdate(bleEarphoneSoundEffectsSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneStateUpdate(@aa1 BleEarphoneState bleEarphoneState) {
        super.onEarphoneStateUpdate(bleEarphoneState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFactoryTestUpdate(@aa1 BleFactoryTest bleFactoryTest) {
        super.onFactoryTestUpdate(bleFactoryTest);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFallSetUpdate(int i) {
        super.onFallSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFindEarphoneUpdate(@aa1 BleFindEarphone bleFindEarphone) {
        super.onFindEarphoneUpdate(bleFindEarphone);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onFindPhone(boolean z) {
        if (!z) {
            iOXiO1O1I();
            return;
        }
        if (q62.OXO1.XIOX1()) {
            I01XX0.XIi00iiXO(I01XX0.i0X000X0O, null, 2, null);
        }
        IXO0OOi();
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
    public void onFollowSystemLanguage(boolean z) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsXIi00iiXO = a01Var.XIi00iiXO();
        Languages languages = Languages.INSTANCE;
        sPUtilsXIi00iiXO.put(b01.i010I, Languages.languageToCode$default(languages, null, 0, 3, null));
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.LANGUAGE, BleKeyFlag.UPDATE, a01Var.XIi00iiXO().getInt(b01.i010I, Languages.languageToCode$default(languages, null, 0, 3, null)), false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGameControlUpdate(@aa1 BleGameControl bleGameControl) {
        super.onGameControlUpdate(bleGameControl);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWake2Update(@aa1 BleGestureWake2 bleGestureWake2) {
        super.onGestureWake2Update(bleGestureWake2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWakeUpdate(@aa1 BleGestureWake bleGestureWake) {
        super.onGestureWakeUpdate(bleGestureWake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo bleGoogleNaviInfo) {
        super.onGoogleNaviInfoUpdate(bleGoogleNaviInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onHIDState(int i) {
        super.onHIDState(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onHIDValueChange(int i) {
        MyNotificationListenerService.OXO1 oxo1 = MyNotificationListenerService.O001I;
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        oxo1.OXO1(app);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onHRWarningSet(@aa1 BleHrWarningSettings bleHrWarningSettings) {
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
    public /* bridge */ void onHydrationUpdate(@aa1 BleHydrationSettings bleHydrationSettings) {
        super.onHydrationUpdate(bleHydrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCExceptionUpdate(@aa1 BleIPCException bleIPCException) {
        super.onIPCExceptionUpdate(bleIPCException);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCOTAStateUpdate(@aa1 BleIPCOTAState bleIPCOTAState) {
        super.onIPCOTAStateUpdate(bleIPCOTAState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStateUpdate(@aa1 BleIPCState bleIPCState) {
        super.onIPCStateUpdate(bleIPCState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo bleIPCStoresInfo) {
        super.onIPCStoresInfoUpdate(bleIPCStoresInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo bleIPCWifiInfo) {
        super.onIPCWifiInfoUpdate(bleIPCWifiInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onIdentityCreate(boolean z, @tb1 BleDeviceInfo bleDeviceInfo) {
        if (z) {
            XOIIOO.X0i1O.XIi00iiXO();
            DeviceInfoChecker.O10IXXX0X(DeviceInfoChecker.OXO1, null, null, 3, null);
            ov0.OXO1.OXO1(bleDeviceInfo);
            a01.OXO1.IiI10X().put(b01.O101, q62.OXO1.XiXIX());
            I01XX0.XIi00iiXO(b01.XiOIO, null, 2, null);
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIdentityDelete(boolean z) {
        super.onIdentityDelete(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onIdentityDeleteByDevice(boolean z) {
        if (Ii0X0X) {
            return;
        }
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isBound()) {
            i1O0OXO1O.OXO1.OXO1("onIdentityDeleteByDevice onUnbind");
            bleConnector.closeConnection(true);
            O0Ii(false);
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIncomingCallRingUpdate(int i) {
        super.onIncomingCallRingUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    @SuppressLint({"MissingPermission"})
    public void onIncomingCallStatus(int i) {
        if (i == 0) {
            try {
                PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE");
                Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
                ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OI1i0i0X
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.XOOXII((PermissionStatus) obj);
                    }
                }, 3, null);
                Unit unit = Unit.OXO1;
                return;
            } catch (Exception e) {
                e.printStackTrace();
                Unit unit2 = Unit.OXO1;
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            PermissionUtils permissionUtilsPermission2 = PermissionUtils.permission("PHONE");
            Intrinsics.O10IXXX0X(permissionUtilsPermission2, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission2, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXiiIX0i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BleInitializer.OIIOI((PermissionStatus) obj);
                }
            }, 3, null);
            return;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.telephony.ITelephony");
            Class<?> cls2 = cls.getClasses()[0];
            Class<?> cls3 = Class.forName("android.os.ServiceManager");
            Class<?> cls4 = Class.forName("android.os.ServiceManagerNative");
            Method method = cls3.getMethod("getService", String.class);
            Method method2 = cls4.getMethod("asInterface", IBinder.class);
            Binder binder = new Binder();
            binder.attachInterface(null, "fake");
            Object objInvoke = method.invoke(method2.invoke(null, binder), "phone");
            Intrinsics.X1ii(objInvoke, "null cannot be cast to non-null type android.os.IBinder");
            cls.getMethod("endCall", new Class[0]).invoke(cls2.getMethod("asInterface", IBinder.class).invoke(null, (IBinder) objInvoke), new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            LogUtils.m11128d("hang up error " + Unit.OXO1);
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUpdate(@aa1 BleLoveTap bleLoveTap) {
        super.onLoveTapUpdate(bleLoveTap);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserDelete(int i) {
        super.onLoveTapUserDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserUpdate(@aa1 BleLoveTapUser bleLoveTapUser) {
        super.onLoveTapUserUpdate(bleLoveTapUser);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeasurementUpdate(@aa1 BleMeasurement bleMeasurement) {
        super.onMeasurementUpdate(bleMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmAdd(@aa1 BleMedicationAlarm bleMedicationAlarm) {
        super.onMedicationAlarmAdd(bleMedicationAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmDelete(int i) {
        super.onMedicationAlarmDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm bleMedicationAlarm) {
        super.onMedicationAlarmUpdate(bleMedicationAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderDelete(int i) {
        super.onMedicationReminderDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderUpdate(@aa1 BleMedicationReminder bleMedicationReminder) {
        super.onMedicationReminderUpdate(bleMedicationReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderAdd(@aa1 BleMeetingReminder bleMeetingReminder) {
        super.onMeetingReminderAdd(bleMeetingReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderDelete(int i) {
        super.onMeetingReminderDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderUpdate(@aa1 BleMeetingReminder bleMeetingReminder) {
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
    public /* bridge */ void onNaviInfoUpdate(@aa1 BleNaviInfo bleNaviInfo) {
        super.onNaviInfoUpdate(bleNaviInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNoDisturbUpdate(@aa1 BleNoDisturbSettings bleNoDisturbSettings) {
        super.onNoDisturbUpdate(bleNoDisturbSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationLightScreenSetUpdate(int i) {
        super.onNotificationLightScreenSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationSettings2Update(@aa1 BleNotificationSettings2 bleNotificationSettings2) {
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
    public void onQiblaSettingsUpdate() throws IllegalAccessException, InstantiationException {
        BleCache bleCache = BleCache.INSTANCE;
        BleKey bleKey = BleKey.QIBLA_SET;
        BleQiblaSettings bleQiblaSettings = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(bleCache, bleKey, BleQiblaSettings.class, null, null, 12, null);
        CustomLocation customLocationXXIIO1i11 = UtilsKt.XXIIO1i11();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long jXiOIii1 = O0X11OiO.XiOIii1(calendar);
        bleQiblaSettings.setMStartTime((int) (System.currentTimeMillis() / ((long) 1000)));
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        if (objFromJson == null) {
            objFromJson = PrayerTimeSettings.class.newInstance();
        }
        bleQiblaSettings.setMPrayerTimes(PrayerTimesKt.toBlePrayerTimes(PrayerTimesKt.getPrayerTimeMap((PrayerTimeSettings) objFromJson, customLocationXXIIO1i11.XO0O10(), customLocationXXIIO1i11.IiI10X(), jXiOIii1, (16 & 16) != 0 ? 31 : 0)));
        XOXO0X00I xoxo0x00iO10IXXX0X = O0X11OiO.O10IXXX0X(jXiOIii1, 0, 2, null);
        bleQiblaSettings.setMHijriYear(xoxo0x00iO10IXXX0X.I0IIOi());
        bleQiblaSettings.setMHijriMonth(xoxo0x00iO10IXXX0X.XOO0ii0());
        bleQiblaSettings.setMHijriDay(xoxo0x00iO10IXXX0X.IiI10X());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, bleKey, BleKeyFlag.UPDATE, bleQiblaSettings, false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan bleAICoachBeforePlan) {
        super.onReadAICoachGenerateBeforeInfo(bleAICoachBeforePlan);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
        super.onReadAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan bleAICoachGeneratePlan) {
        super.onReadAICoachPlan(bleAICoachGeneratePlan);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2) {
        super.onReadAICoachPlanV2(bleAICoachGeneratePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadActivity(@aa1 List<BleActivity> activities) {
        Intrinsics.X0O(activities, "activities");
        ThreadUtils.executeByIo(new O00(activities, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivityDetail(@aa1 BleActivityDetail bleActivityDetail) {
        super.onReadActivityDetail(bleActivityDetail);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAddressBook(@aa1 BleAddressBook bleAddressBook) {
        super.onReadAddressBook(bleAddressBook);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlarm(@aa1 List<BleAlarm> list) {
        super.onReadAlarm(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> alipayBindInfos) {
        Intrinsics.X0O(alipayBindInfos, "alipayBindInfos");
        LogUtils.m11128d(alipayBindInfos);
        ThreadUtils.executeByIo(new IiI10X(alipayBindInfos, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipaySettings(@aa1 BleAlipaySettings bleAlipaySettings) {
        super.onReadAlipaySettings(bleAlipaySettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppApiVersion(@aa1 String str) {
        super.onReadAppApiVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppInfoList(@aa1 BleAppInfoList bleAppInfoList) {
        super.onReadAppInfoList(bleAppInfoList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppSportState(@aa1 BleAppSportState bleAppSportState) {
        super.onReadAppSportState(bleAppSportState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> list) {
        super.onReadAvgHeartRate(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBAC(@aa1 List<BleBAC> list) {
        super.onReadBAC(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacCalibration(@aa1 BleBacCalibration bleBacCalibration, @aa1 BleKeyFlag bleKeyFlag) {
        super.onReadBacCalibration(bleBacCalibration, bleKeyFlag);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacklight(int i) {
        super.onReadBacklight(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBatteryUsage(@aa1 BleBatteryUsage bleBatteryUsage) {
        super.onReadBatteryUsage(bleBatteryUsage);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleAddress(@aa1 String str) {
        super.onReadBleAddress(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo bleGolfMapCacheInfo) {
        super.onReadBleGolfMapCacheInfo(bleGolfMapCacheInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch bleGolfSportSwitch) {
        super.onReadBleGolfSportSwitch(bleGolfSportSwitch);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo bleGolfWatchMapInfo) {
        super.onReadBleGolfWatchMapInfo(bleGolfWatchMapInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
        super.onReadBleGolfWatchVersionInfo(bleGolfWatchVersionInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBleHrv(@aa1 List<BleHrv> hrv) {
        Intrinsics.X0O(hrv, "hrv");
        LogUtils.m11128d(hrv);
        ThreadUtils.executeByIo(new XOO0ii0(hrv, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBleLogText(@aa1 List<BleLogText> logs) {
        Intrinsics.X0O(logs, "logs");
        if (logs.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = logs.iterator();
            while (it.hasNext()) {
                OIXO1IIOO.XOO0XOOii(arrayList, ((BleLogText) it.next()).coMotionRecords());
            }
            if (arrayList.isEmpty()) {
                iI0OiO.m2062IO(uz0.m3192iO(sz0.OXO1, O0X11OiO.O00().format(new Date()) + ".txt"), CollectionsKt___CollectionsKt.XOiXXOO(logs, "\n", null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OX1XXi
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleInitializer.XII01OO1I((BleLogText) obj);
                    }
                }, 30, null), null, 2, null);
                return;
            }
            File file = new File(uz0.X0i1O(sz0.OXO1), "cm_logs");
            if (file.mkdirs() || file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, O0X11OiO.O00().format(new Date()) + ".bin"), true);
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        fileOutputStream.write((byte[]) it2.next());
                    }
                    Unit unit = Unit.OXO1;
                    CloseableKt.OXO1(fileOutputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(fileOutputStream, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodGlucose(@aa1 List<BleBloodGlucose> bloodGlucoses) {
        Intrinsics.X0O(bloodGlucoses, "bloodGlucoses");
        LogUtils.m11128d(bloodGlucoses);
        ThreadUtils.executeByIo(new I0IIOi(bloodGlucoses, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings bleBloodOxyGenSettings) {
        super.onReadBloodOxyGenSettings(bleBloodOxyGenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodOxygen(@aa1 List<BleBloodOxygen> bloodOxygen) {
        Intrinsics.X0O(bloodOxygen, "bloodOxygen");
        LogUtils.m11128d(bloodOxygen);
        ThreadUtils.executeByIo(new OIi0(bloodOxygen, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadBloodPressure(@aa1 List<BleBloodPressure> bloodPressures) {
        Intrinsics.X0O(bloodPressures, "bloodPressures");
        ThreadUtils.executeByIo(new OIX0iXi(bloodPressures, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration bleBloodPressureCalibration) {
        super.onReadBloodPressureCalibration(bleBloodPressureCalibration);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBodyStatus(@aa1 List<BleBodyStatus> list) {
        super.onReadBodyStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCPUserInfo(@aa1 BleCPUserInfo bleCPUserInfo) {
        super.onReadCPUserInfo(bleCPUserInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalibrationData(@aa1 BleCalibrationData bleCalibrationData) {
        super.onReadCalibrationData(bleCalibrationData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalorieIntake(@aa1 List<BleCalorieIntake> list) {
        super.onReadCalorieIntake(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCaloriesGoal(int i) {
        super.onReadCaloriesGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadChatApp(@aa1 BleChatApp bleChatApp) {
        super.onReadChatApp(bleChatApp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay bleCheckInEveryDay) {
        super.onReadCheckInEveryDay(bleCheckInEveryDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadClassicBluetoothState(int i) {
        super.onReadClassicBluetoothState(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCoachingIds(@aa1 BleCoachingIds bleCoachingIds) {
        super.onReadCoachingIds(bleCoachingIds);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadCyWeeAlgorithm(@aa1 final BleCyWeeAlgorithm bleCyWeeAlgorithm) {
        Intrinsics.X0O(bleCyWeeAlgorithm, "bleCyWeeAlgorithm");
        UploadServiceRequestBody uploadServiceRequestBodyOIi0 = iI10I11.OXO1.OIi0(15);
        if (uploadServiceRequestBodyOIi0.getData().isEmpty()) {
            i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> CyWee data null");
            return;
        }
        BleCyWeeAlgorithm bleCyWeeAlgorithm2 = (BleCyWeeAlgorithm) new Gson().fromJson(a01.OXO1.m1440iO().getString(BleCyWeeAlgorithm.class.getName()), BleCyWeeAlgorithm.class);
        if (bleCyWeeAlgorithm2 != null && Intrinsics.XOO0ii0(bleCyWeeAlgorithm2.getMUUID(), bleCyWeeAlgorithm.getMUUID()) && bleCyWeeAlgorithm2.getMType() == bleCyWeeAlgorithm.getMType()) {
            i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> cache = bleCyWeeAlgorithm");
            return;
        }
        DataBody dataBody = (DataBody) CollectionsKt___CollectionsKt.IIII0iI(uploadServiceRequestBodyOIi0.getData());
        String json = GsonUtils.toJson(new CyWeeRemark(bleCyWeeAlgorithm.getMUUID(), bleCyWeeAlgorithm.getMType()));
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        dataBody.setRemark(json);
        String json2 = GsonUtils.toJson(uploadServiceRequestBodyOIi0);
        i1O0OXO1O.OXO1.OXO1("onReadCyWeeAlgorithm -> " + json2 + " - CyWee");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(json2);
        netWorkUtils.postRequest(json2, new Function1() { // from class: com.android.mltcode.paycertificationapi.O00IO0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleInitializer.iIXX0i(bleCyWeeAlgorithm, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadDailyPower(@aa1 List<BlePhysicalPower> powers) {
        Intrinsics.X0O(powers, "powers");
        ThreadUtils.executeByIo(new I0iXXO(powers, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDateFormat(int i) {
        super.onReadDateFormat(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFile(@aa1 BleDeviceFile bleDeviceFile) {
        super.onReadDeviceFile(bleDeviceFile);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFileV2(@aa1 BleDeviceFile2 bleDeviceFile2) {
        super.onReadDeviceFileV2(bleDeviceFile2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo(@aa1 BleDeviceInfo bleDeviceInfo) {
        super.onReadDeviceInfo(bleDeviceInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo2(@aa1 BleDeviceInfo2 bleDeviceInfo2) {
        super.onReadDeviceInfo2(bleDeviceInfo2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages(@aa1 BleDeviceLanguages bleDeviceLanguages) {
        super.onReadDeviceLanguages(bleDeviceLanguages);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 bleDeviceLanguages2) {
        super.onReadDeviceLanguages2(bleDeviceLanguages2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings) {
        super.onReadDeviceUniqueDataSettings(bleDeviceUniqueDataSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDistanceGoal(int i) {
        super.onReadDistanceGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings bleDoubleScreenSettings) {
        super.onReadDoubleScreenSettings(bleDoubleScreenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDrinkWater(@aa1 BleDrinkWaterSettings bleDrinkWaterSettings) {
        super.onReadDrinkWater(bleDrinkWaterSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadECGRealtime(@aa1 BleECGRealtime bleECGRealtime) {
        super.onReadECGRealtime(bleECGRealtime);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings bleEarphoneAncSettings) {
        super.onReadEarphoneAncSettings(bleEarphoneAncSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneCall(int i) {
        super.onReadEarphoneCall(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneInfo(@aa1 BleEarphoneInfo bleEarphoneInfo) {
        super.onReadEarphoneInfo(bleEarphoneInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneKey(@aa1 BleEarphoneKey bleEarphoneKey) {
        super.onReadEarphoneKey(bleEarphoneKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphonePower(@aa1 BleEarphonePower bleEarphonePower) {
        super.onReadEarphonePower(bleEarphonePower);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
        super.onReadEarphoneSoundEffectsSettings(bleEarphoneSoundEffectsSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEarphoneState(@aa1 BleEarphoneState earphoneState) {
        Intrinsics.X0O(earphoneState, "earphoneState");
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEcg(@aa1 List<BleEcg> ecgs) {
        Intrinsics.X0O(ecgs, "ecgs");
        ThreadUtils.executeByIo(new XXI(ecgs));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcgSettings(@aa1 BleEcgSettings bleEcgSettings) {
        super.onReadEcgSettings(bleEcgSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadEnergyRating(@aa1 List<BleEnergyRating> energyRating) {
        Intrinsics.X0O(energyRating, "energyRating");
        ThreadUtils.executeByIo(new X1ii(energyRating, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFallSet(int i) {
        super.onReadFallSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFilePath(@aa1 BleAppAudioBookList bleAppAudioBookList) {
        super.onReadFilePath(bleAppAudioBookList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadFirmwareVersion(@aa1 String version) {
        Intrinsics.X0O(version, "version");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String strM38844OX = UtilsKt.m38844OX();
        hr1 hr1Var = hr1.OXO1;
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        i1o0oxo1o.OXO1("info:\n" + strM38844OX + "\n" + hr1Var.m1929OO(app));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFoodBalance(@aa1 List<BleFoodBalance> list) {
        super.onReadFoodBalance(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake(@aa1 BleGestureWake bleGestureWake) {
        super.onReadGestureWake(bleGestureWake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake2(@aa1 BleGestureWake2 bleGestureWake2) {
        super.onReadGestureWake2(bleGestureWake2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly bleGirlCareMonthly) {
        super.onReadGirlCareMonthly(bleGirlCareMonthly);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareSettings(@aa1 BleGirlCareSettings bleGirlCareSettings) {
        super.onReadGirlCareSettings(bleGirlCareSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadGoMoreSettings(@aa1 BleGoMoreSettings goMoreSettings) {
        Intrinsics.X0O(goMoreSettings, "goMoreSettings");
        if (BleConnector.INSTANCE.isNeedBind()) {
            goMoreSettings.setMType(q62.OXO1.XiOIO(goMoreSettings.getMType()));
            BleGoMoreSettings bleGoMoreSettings = (BleGoMoreSettings) new Gson().fromJson(a01.OXO1.m1440iO().getString(BleGoMoreSettings.class.getName()), BleGoMoreSettings.class);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("cache -> " + bleGoMoreSettings);
            if (TextUtils.isEmpty(goMoreSettings.getMKey())) {
                DeviceInfoChecker.OXO1.XiOIO(goMoreSettings.getMUuid(), goMoreSettings.getMType(), goMoreSettings.getMClientId());
                return;
            }
            i1o0oxo1o.OXO1("getGoMoreAuthKey -> " + goMoreSettings.getMType() + " - GoMore activated!");
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGolfWatchScore(@aa1 BleGolfWatchScore bleGolfWatchScore) {
        super.onReadGolfWatchScore(bleGolfWatchScore);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGpsFirmwareVersion(@aa1 String str) {
        super.onReadGpsFirmwareVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoSettings(@aa1 BleHanBaoSettings bleHanBaoSettings) {
        super.onReadHanBaoSettings(bleHanBaoSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> hanBaoVibrations) {
        Intrinsics.X0O(hanBaoVibrations, "hanBaoVibrations");
        ThreadUtils.executeByIo(new O10IXXX0X(hanBaoVibrations, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadHeartRate(@aa1 List<BleHeartRate> heartRates) {
        Intrinsics.X0O(heartRates, "heartRates");
        ThreadUtils.executeByIo(new X0O(heartRates, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRateZones(@aa1 BleHeartRateZones bleHeartRateZones) {
        super.onReadHeartRateZones(bleHeartRateZones);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHourSystem(int i) {
        super.onReadHourSystem(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings bleHrMonitoringSettings) {
        super.onReadHrMonitoringSettings(bleHrMonitoringSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettingsV2(int i) {
        super.onReadHrMonitoringSettingsV2(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvBaseLine(@aa1 BleHrvBaseLine bleHrvBaseLine) {
        super.onReadHrvBaseLine(bleHrvBaseLine);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings bleHrvMonitoringSettings) {
        super.onReadHrvMonitoringSettings(bleHrvMonitoringSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHydrationSettings(@aa1 BleHydrationSettings bleHydrationSettings) {
        super.onReadHydrationSettings(bleHydrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCInfo(@aa1 BleIPCInfo bleIPCInfo) {
        super.onReadIPCInfo(bleIPCInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCState(@aa1 BleIPCState bleIPCState) {
        super.onReadIPCState(bleIPCState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo bleIPCStoresInfo) {
        super.onReadIPCStoresInfo(bleIPCStoresInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCVersion(@aa1 String str) {
        super.onReadIPCVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIncomingCallRing(int i) {
        super.onReadIncomingCallRing(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLactateThreshold(@aa1 List<BleLactateThreshold> list) {
        super.onReadLactateThreshold(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguage(int i) {
        super.onReadLanguage(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion bleLanguagePackVersion) {
        super.onReadLanguagePackVersion(bleLanguagePackVersion);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadLocation(@aa1 List<BleLocation> locations) {
        Intrinsics.X0O(locations, "locations");
        ThreadUtils.executeByIo(new I1XOi1(locations, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLoveTapUser(@aa1 List<BleLoveTapUser> list) {
        super.onReadLoveTapUser(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord(@aa1 List<BleMatchRecord> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
        ThreadUtils.executeByIo(new IIX1OXO(matchRecords, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord2(@aa1 List<BleMatchRecord2> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
        ThreadUtils.executeByIo(new XiOIO(matchRecords, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadMatchRecord3(@aa1 List<BleMatchRecord3> matchRecords) {
        Intrinsics.X0O(matchRecords, "matchRecords");
        ThreadUtils.executeByIo(new iIiiO(matchRecords, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> list) {
        super.onReadMedicationAlarm(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationReminder(@aa1 List<BleMedicationReminder> list) {
        super.onReadMedicationReminder(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMeetingReminder(@aa1 List<BleMeetingReminder> list) {
        super.onReadMeetingReminder(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMindStatus(@aa1 List<BleMindStatus> list) {
        super.onReadMindStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMtkOtaMeta() {
        super.onReadMtkOtaMeta();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMultiFileTransfer(@aa1 BleMapFileList bleMapFileList) {
        super.onReadMultiFileTransfer(bleMapFileList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNetworkFirmwareVersion(@aa1 String str) {
        super.onReadNetworkFirmwareVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNoDisturb(@aa1 BleNoDisturbSettings bleNoDisturbSettings) {
        super.onReadNoDisturb(bleNoDisturbSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationLightScreenSet(int i) {
        super.onReadNotificationLightScreenSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationSettings2(@aa1 BleNotificationSettings2 bleNotificationSettings2) {
        super.onReadNotificationSettings2(bleNotificationSettings2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings bleOfflineAsrSettings) {
        super.onReadOfflineAsrSettings(bleOfflineAsrSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOngoingDialogue(int i) {
        super.onReadOngoingDialogue(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo optionalMapAuthInfo) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(optionalMapAuthInfo, "optionalMapAuthInfo");
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isNeedBind()) {
            a01 a01Var = a01.OXO1;
            BleOptionalMapAuthInfo bleOptionalMapAuthInfo = (BleOptionalMapAuthInfo) new Gson().fromJson(a01Var.m1440iO().getString(BleOptionalMapAuthInfo.class.getName()), BleOptionalMapAuthInfo.class);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("onReadOptionalMapAuthInfo cache -> " + bleOptionalMapAuthInfo);
            if (TextUtils.isEmpty(optionalMapAuthInfo.getMKey())) {
                if (!Intrinsics.XOO0ii0(optionalMapAuthInfo.getMUuid(), bleOptionalMapAuthInfo != null ? bleOptionalMapAuthInfo.getMUuid() : null) || bleOptionalMapAuthInfo.getMKey().length() <= 0) {
                    OffLineMapManagerKt.O00(optionalMapAuthInfo.getMUuid(), null, 2, null);
                    return;
                } else {
                    BaseBleConnector.sendObject$default(bleConnector, BleKey.OPTIONAL_MAP_AUTH_INFO, BleKeyFlag.UPDATE, bleOptionalMapAuthInfo, false, false, 24, null);
                    return;
                }
            }
            if (optionalMapAuthInfo.getMUuid().length() > 0 && optionalMapAuthInfo.getMKey().length() > 0) {
                a01Var.m1440iO().put(BleOptionalMapAuthInfo.class.getName(), new Gson().toJson(optionalMapAuthInfo));
            }
            i1o0oxo1o.OXO1("getGoMoreAuthKey -> " + optionalMapAuthInfo.getMUuid() + " - GoMore activated! - " + optionalMapAuthInfo.getMKey());
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadPackageStatus(@aa1 BlePackageStatus packageStatus) {
        Intrinsics.X0O(packageStatus, "packageStatus");
        I01XX0.OXO1(I01XX0.X00XIX1, packageStatus);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower(int i) {
        super.onReadPower(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower2(@aa1 BlePower2 blePower2) {
        super.onReadPower2(blePower2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadPressure(@aa1 List<BlePressure> pressures) {
        Intrinsics.X0O(pressures, "pressures");
        ThreadUtils.executeByIo(new XX0(pressures, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement blePressureTimingMeasurement) {
        super.onReadPressureTimingMeasurement(blePressureTimingMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadQiblaSettings(@aa1 BleQiblaSettings bleQiblaSettings) {
        super.onReadQiblaSettings(bleQiblaSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRecordControl(@aa1 BleRecordControl bleRecordControl) {
        super.onReadRecordControl(bleRecordControl);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRelaxReminder(@aa1 BleRelaxReminder bleRelaxReminder) {
        super.onReadRelaxReminder(bleRelaxReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> rate) {
        Intrinsics.X0O(rate, "rate");
        ThreadUtils.executeByIo(new OiIIX101O(rate, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRestingHeartRate(int i) {
        super.onReadRestingHeartRate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRingVibrationSet(@aa1 BleRingVibrationSettings bleRingVibrationSettings) {
        super.onReadRingVibrationSet(bleRingVibrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadRri(@aa1 List<BleRri> rris) {
        Intrinsics.X0O(rris, "rris");
        ThreadUtils.executeByIo(new XiOIii1(rris, new Date(), TimeZone.getDefault().getOffset(System.currentTimeMillis()), O0X11OiO.O00(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSDCardInfo(@aa1 BleSDCardInfo bleSDCardInfo) {
        super.onReadSDCardInfo(bleSDCardInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGCameraSet(@aa1 BleSGCameraSet bleSGCameraSet) {
        super.onReadSGCameraSet(bleSGCameraSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeySet(@aa1 BleSGKeySet bleSGKeySet) {
        super.onReadSGKeySet(bleSGKeySet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake bleSGKeywordAwake) {
        super.onReadSGKeywordAwake(bleSGKeywordAwake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSet(@aa1 BleSGSet bleSGSet) {
        super.onReadSGSet(bleSGSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSleepSet(int i) {
        super.onReadSGSleepSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSOSSettings(@aa1 BleSOSSettings bleSOSSettings) {
        super.onReadSOSSettings(bleSOSSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadScreenBrightnessSet(int i) {
        super.onReadScreenBrightnessSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSedentariness(@aa1 BleSedentarinessSettings bleSedentarinessSettings) {
        super.onReadSedentariness(bleSedentarinessSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleep(@aa1 List<BleSleep> sleeps) {
        Intrinsics.X0O(sleeps, "sleeps");
        ThreadUtils.executeByIo(new OII(sleeps, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10(), BleCache.INSTANCE.getMSleepAlgorithmType()));
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
    public /* bridge */ void onReadSleepQuality(@aa1 BleSleepQuality bleSleepQuality) {
        super.onReadSleepQuality(bleSleepQuality);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleepQualityScore(int i) {
        I01XX0.XIi00iiXO(I01XX0.f1092Xi, null, 2, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadSleepRaw(@aa1 byte[] sleepRawData) {
        Intrinsics.X0O(sleepRawData, "sleepRawData");
        try {
            iI0OiO.m2062IO(uz0.XO0O10(sz0.OXO1, O0X11OiO.OIX0iXi().format(new Date()) + ".txt"), ByteArrayExtKt.getMHexString(sleepRawData), null, 2, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    public /* bridge */ void onReadSosCallLog(@aa1 List<BleSosCallLog> list) {
        super.onReadSosCallLog(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSosContact(@aa1 BleSosContact bleSosContact) {
        super.onReadSosContact(bleSosContact);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSportDurationGoal(int i) {
        super.onReadSportDurationGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
        super.onReadStandbyWatchFaceSet(bleStandbyWatchFaceSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStepGoal(int i) {
        super.onReadStepGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(@aa1 List<BleStock> list) {
        super.onReadStock(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadTemperature(@aa1 List<BleTemperature> temperatures) {
        Intrinsics.X0O(temperatures, "temperatures");
        LogUtils.m11128d(temperatures);
        ThreadUtils.executeByIo(new C18580OX(temperatures, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperatureUnit(int i) {
        super.onReadTemperatureUnit(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTrainingStatus(@aa1 List<BleTrainingStatus> list) {
        super.onReadTrainingStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTuyaKey(@aa1 BleTuyaKey bleTuyaKey) {
        super.onReadTuyaKey(bleTuyaKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUiPackVersion(@aa1 String str) {
        super.onReadUiPackVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUnit(int i) {
        super.onReadUnit(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUserProfile(@aa1 BleUserProfile bleUserProfile) {
        super.onReadUserProfile(bleUserProfile);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadVitalityValue(@aa1 List<BleVitality> vitalityValue) {
        Intrinsics.X0O(vitalityValue, "vitalityValue");
        ThreadUtils.executeByIo(new C18579I1(vitalityValue, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVoiceControl(int i) {
        super.onReadVoiceControl(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceId(@aa1 BleWatchFaceId bleWatchFaceId) {
        super.onReadWatchFaceId(bleWatchFaceId);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex bleWatchFaceIndex) {
        super.onReadWatchFaceIndex(bleWatchFaceIndex);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize bleWatchFaceMaxSize) {
        super.onReadWatchFaceMaxSize(bleWatchFaceMaxSize);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceSwitch(int i) {
        super.onReadWatchFaceSwitch(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchPassword(@aa1 BleSettingWatchPassword bleSettingWatchPassword) {
        super.onReadWatchPassword(bleSettingWatchPassword);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWearWayState(int i) {
        super.onReadWearWayState(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWeatherRealTime(boolean z) {
        BleCache bleCache = BleCache.INSTANCE;
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST3, null, 2, null);
        WeatherInitializer.f51281IO.XX0();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWechatPaySettings(@aa1 BleWechatPaySettings bleWechatPaySettings) {
        super.onReadWechatPaySettings(bleWechatPaySettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout(@aa1 List<BleWorkout> workouts) {
        Intrinsics.X0O(workouts, "workouts");
        LogUtils.m11130i("onReadWorkout " + BleCache.INSTANCE + ".mPlatform");
        ThreadUtils.executeByIo(new iOOX010X(workouts, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout2(@aa1 List<BleWorkout2> workouts) {
        Intrinsics.X0O(workouts, "workouts");
        ThreadUtils.executeByIo(new X01IiOiIi(workouts, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout3(@aa1 List<BleWorkout3> workouts) {
        Intrinsics.X0O(workouts, "workouts");
        LogUtils.m11130i("onReadWorkout3 " + BleCache.INSTANCE + ".mPlatform");
        ThreadUtils.executeByIo(new II1Xi0(workouts, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadWorkout4(@aa1 List<BleWorkout4> workouts) {
        Intrinsics.X0O(workouts, "workouts");
        LogUtils.m11130i("onReadWorkout4 " + BleCache.INSTANCE + ".mPlatform");
        ThreadUtils.executeByIo(new i010I(workouts, (long) TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation bleWorkout4Segmentation) {
        super.onReadWorkout4Segmentation(bleWorkout4Segmentation);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorldClock(@aa1 List<BleWorldClock> list) {
        super.onReadWorldClock(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement bleRealTimeMeasurement) {
        super.onRealTimeMeasurement(bleRealTimeMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveCmTrace(@aa1 byte[] data, boolean z) {
        File file;
        Intrinsics.X0O(data, "data");
        try {
            if (z) {
                File file2 = new File(uz0.X0i1O(sz0.OXO1), "cm_data");
                if (!file2.mkdirs() && !file2.exists()) {
                    return;
                }
                file = new File(file2, new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date()) + ".bin");
            } else {
                file = Xii11I;
                if (file == null) {
                    i1O0OXO1O.OXO1.XIi00iiXO("saveCmTrace ignored data without header, bytes=" + data.length);
                    return;
                }
                Intrinsics.XXI(file);
            }
            if (z) {
                i1O0OXO1O.OXO1.OXO1("saveCmTrace started file=" + file.getPath());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, !z);
            try {
                fileOutputStream.write(data);
                Unit unit = Unit.OXO1;
                CloseableKt.OXO1(fileOutputStream, null);
                Xii11I = file;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.OXO1(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO("saveCmTrace failed: " + e.getMessage());
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveFilePacket(@aa1 BleReceiveFilePacket bleReceiveFilePacket) {
        super.onReceiveFilePacket(bleReceiveFilePacket);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> gSensorMotions) {
        Intrinsics.X0O(gSensorMotions, "gSensorMotions");
        ThreadUtils.executeByIo(new C18583iX(gSensorMotions, new Date(), O0X11OiO.O00(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> list) {
        super.onReceiveGSensorRaw(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> gSensorSHSYs) {
        Intrinsics.X0O(gSensorSHSYs, "gSensorSHSYs");
        SimpleDateFormat simpleDateFormatIO0iXO0O = O0X11OiO.IO0iXO0O();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.iIiiO(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.XX0(calendar, 0);
        ThreadUtils.executeByIo(new IXXOO(gSensorSHSYs, calendar, simpleDateFormatIO0iXO0O, simpleDateFormat));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveHRRaw(@aa1 List<BleHRRaw> list) {
        super.onReceiveHRRaw(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGga(@aa1 BleLocationGga bleLocationGga) {
        super.onReceiveLocationGga(bleLocationGga);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGsv(@aa1 List<BleLocationGsv> list) {
        super.onReceiveLocationGsv(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveMusicCommand(@aa1 MusicCommand musicCommand) {
        Intrinsics.X0O(musicCommand, "musicCommand");
        MyNotificationListenerService.OXO1 oxo1 = MyNotificationListenerService.O001I;
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        oxo1.OXO1(app);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> ppgSHSYs) {
        Intrinsics.X0O(ppgSHSYs, "ppgSHSYs");
        SimpleDateFormat simpleDateFormatIO0iXO0O = O0X11OiO.IO0iXO0O();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.iIiiO(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.XX0(calendar, 0);
        ThreadUtils.executeByIo(new iOO1ii1(ppgSHSYs, calendar, simpleDateFormatIO0iXO0O, simpleDateFormat));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveRealtimeLog(@aa1 BleRealtimeLog realtimeLog) {
        Intrinsics.X0O(realtimeLog, "realtimeLog");
        try {
            if (StringsKt__StringsKt.iIi011O(realtimeLog.getMContent(), "csv-1", false, 2, null)) {
                iI0OiO.m2062IO(uz0.m3192iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + "-1.csv"), oe5.IXO0OOi(realtimeLog.getMContent(), "    csv-1", "", false, 4, null), null, 2, null);
                return;
            }
            if (!StringsKt__StringsKt.iIi011O(realtimeLog.getMContent(), "csv-2", false, 2, null)) {
                iI0OiO.m2062IO(uz0.m3192iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + ".txt"), realtimeLog.getMContent(), null, 2, null);
                return;
            }
            iI0OiO.m2062IO(uz0.m3192iO(sz0.OXO1, O0X11OiO.I0IIOi().format(new Date()) + "-2.csv"), oe5.IXO0OOi(realtimeLog.getMContent(), "    csv-2", "", false, 4, null), null, 2, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRecordPacket(@aa1 BleRecordPacket bleRecordPacket) {
        super.onReceiveRecordPacket(bleRecordPacket);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRecordControlUpdate(@aa1 BleRecordControl bleRecordControl) {
        super.onRecordControlUpdate(bleRecordControl);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onRequestAgpsPrerequisite() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi1i0II0I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleInitializer.m38220IX((PermissionStatus) obj);
            }
        }, 3, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onRequestLocation(final int i) {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1IOX1O1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleInitializer.i01OOiI(i, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings bleRingVibrationSettings) {
        super.onRingVibrationSetUpdate(bleRingVibrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSDCardInfoUpdate(@aa1 BleSDCardInfo bleSDCardInfo) {
        super.onSDCardInfoUpdate(bleSDCardInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTestUpdate(@aa1 BleSGTest bleSGTest) {
        super.onSGTestUpdate(bleSGTest);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTtsUpdate(@aa1 BleSGTts bleSGTts) {
        super.onSGTtsUpdate(bleSGTts);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSOSSettingsUpdate(@aa1 BleSOSSettings bleSOSSettings) {
        super.onSOSSettingsUpdate(bleSOSSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onScreenBrightnessSetUpdate(int i) {
        super.onScreenBrightnessSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onSessionStateChange(boolean z) {
        if (!z || Ii0X0X) {
            iOXiO1O1I();
            return;
        }
        f51210Oi = 0;
        OOiOOO1OI.OXO1.XXIIO1i11();
        XOO0XOOii();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSleepNotifyUpdate(@aa1 BleSleepNotify bleSleepNotify) {
        super.onSleepNotifyUpdate(bleSleepNotify);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSosContactUpdate(@aa1 BleSosContact bleSosContact) {
        super.onSosContactUpdate(bleSosContact);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSportEndNotifyUpdate(int i) {
        super.onSportEndNotifyUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
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
    public /* bridge */ void onStreamProgress(boolean z, int i, int i2, int i3, @aa1 BleKey bleKey) {
        super.onStreamProgress(z, i, i2, i3, bleKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSyncData(int i, @aa1 BleKey bleKey) {
        super.onSyncData(i, bleKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onTimeUpdate() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        BleKey bleKey = BleKey.TIME_ZONE;
        BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
        BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, new BleTimeZone(), false, false, 24, null);
        BaseBleConnector.sendObject$default(bleConnector, BleKey.TIME, bleKeyFlag, BleTime.Companion.local(), false, false, 24, null);
        BleKey bleKey2 = BleKey.HOUR_SYSTEM;
        BaseBleConnector.sendInt8$default(bleConnector, bleKey2, bleKeyFlag, BaseBleCache.getInt$default(BleCache.INSTANCE, bleKey2, !O0X11OiO.X11iII1O1() ? 1 : 0, null, 4, null), false, false, 24, null);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
        super.onUpdateAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay bleLeaveDay) {
        super.onUpdateAICoachLeaveDay(bleLeaveDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAppSportState(@aa1 BleAppSportState bleAppSportState) {
        super.onUpdateAppSportState(bleAppSportState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBAC(@aa1 BleBAC bleBAC) {
        super.onUpdateBAC(bleBAC);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateBloodPressure(@aa1 BleBloodPressure bloodPressure) {
        Intrinsics.X0O(bloodPressure, "bloodPressure");
        ThreadUtils.executeByIo(new O1O(bloodPressure, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateHeartRate(@aa1 BleHeartRate heartRate) {
        Intrinsics.X0O(heartRate, "heartRate");
        if (heartRate.getMType() == 1) {
            return;
        }
        ThreadUtils.executeByIo(new XXIIO1i11(heartRate, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onUpdateTemperature(@aa1 BleTemperature temperature) {
        Intrinsics.X0O(temperature, "temperature");
        ThreadUtils.executeByIo(new C18581iI(temperature, TimeZone.getDefault().getOffset(System.currentTimeMillis()), new Date(), O0X11OiO.XO0O10()));
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateWatchFaceSwitch(boolean z) {
        super.onUpdateWatchFaceSwitch(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUserProfileUpdate(@aa1 BleUserProfile bleUserProfile) {
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
    public /* bridge */ void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex bleWatchFaceIndex) {
        super.onWatchFaceIndexUpdate(bleWatchFaceIndex);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword bleSettingWatchPassword) {
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
    public /* bridge */ void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet bleXMLYBandSet) {
        super.onXMLYBandSetUpdate(bleXMLYBandSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onXModem(byte b) {
        super.onXModem(b);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReadStock(boolean z) {
        a01.OXO1.XIi00iiXO().remove(b01.iiiO);
        StockInitializer.f51276IO.XOO0ii0();
    }
}
