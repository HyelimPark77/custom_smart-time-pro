package com.sma.smartv3.p610ui.sport;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.p554ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIOIXX1;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.sma.smartv3.location.C18593iO;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.SportDataDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import com.sma.smartv3.pro.R;
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
import com.szabh.smable3.entity.BleAppSportData;
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
import com.szabh.smable3.entity.BleCyWeeAlgorithmGpsData;
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
import com.szabh.smable3.entity.BleLocationReply;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManager.kt\ncom/sma/smartv3/ui/sport/SportManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n19#2:775\n15#2:776\n19#2:783\n15#2:784\n1869#3,2:777\n1869#3,2:779\n1869#3,2:781\n*S KotlinDebug\n*F\n+ 1 SportManager.kt\ncom/sma/smartv3/ui/sport/SportManager\n*L\n375#1:775\n375#1:776\n101#1:783\n101#1:784\n488#1:777,2\n501#1:779,2\n752#1:781,2\n*E\n"})
public final class XO0O10 {
    public static StepsManager I0IIOi = null;
    public static int I0iXXO = 0;

    /* JADX INFO: renamed from: I1 */
    public static int f54780I1 = 0;

    @tb1
    public static C2702ms II1Xi0 = null;

    @aa1
    public static AppUser IIX1OXO = null;

    /* JADX INFO: renamed from: IO */
    public static long f54781IO = 0;
    public static boolean IXXOO = false;

    @aa1
    public static final String O00 = "SportManager";
    public static double O10IXXX0X;

    @aa1
    public static final RunnableC22050XO0O10 O1O;

    @aa1
    public static List<Location> OII;
    public static long OIX0iXi;

    /* JADX INFO: renamed from: OX */
    @aa1
    public static List<SportData> f54782OX;

    @aa1
    public static final Lazy OiIIX101O;
    public static int X01IiOiIi;
    public static int X0O;
    public static int X1ii;
    public static final int XIi00iiXO = 0;

    @aa1
    public static final Lazy XX0;
    public static int XXI;

    @aa1
    public static final Lazy XiOIO;

    @aa1
    public static List<BleHeartRate> XiOIii1;
    public static boolean i010I;

    @aa1
    public static final Lazy iIiiO;

    @aa1
    public static final Lazy iOO1ii1;
    public static int iOOX010X;

    /* JADX INFO: renamed from: iX */
    public static boolean f54784iX;

    @aa1
    public static final XO0O10 OXO1 = new XO0O10();

    /* JADX INFO: renamed from: iO */
    public static final int f54783iO = 1;
    public static final int XO0O10 = 2;

    @aa1
    public static final Lazy IiI10X = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o05
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return com.sma.smartv3.p610ui.sport.XO0O10.XO0X10iO();
        }
    });

    @aa1
    public static final Handler XOO0ii0 = new Handler(Looper.getMainLooper());
    public static int OIi0 = 4;

    @aa1
    public static SportData I1XOi1 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);

    public static final class O00 implements IO0OI {
        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation loc) {
            Intrinsics.X0O(loc, "loc");
            Date date = new Date();
            long time = date.getTime();
            String str = O0X11OiO.XO0O10().format(date);
            Intrinsics.O10IXXX0X(str, "format(...)");
            XO0O10 xo0o10 = XO0O10.OXO1;
            Location location = new Location(0, time, str, xo0o10.X0i1O().getMMode(), mc0.iIi1(loc.OXO1()), (float) loc.IiI10X(), (float) loc.XO0O10(), loc.XOO0ii0(), 0, 0, 768, null);
            C18593iO.m38250iO(C18593iO.OXO1, loc, null, 2, null);
            if (xo0o10.X11iII1O1().isEmpty()) {
                location.setMActivityMode(0);
                xo0o10.XX0(location);
            } else {
                Location location2 = (Location) CollectionsKt___CollectionsKt.Xi1XO00(xo0o10.X11iII1O1());
                double distance = DistanceUtil.getDistance(new LatLng(location2.getMLatitude(), location2.getMLongitude()), new LatLng(loc.XO0O10(), loc.IiI10X()));
                if (distance < 1.0d) {
                    i1O0OXO1O.OXO1.OXO1("SportManager onLocationChange -> too short tmpDistance=" + distance);
                    return;
                }
                XO0O10.X1ii += (int) distance;
                int iO001I = xo0o10.O001I();
                if (iO001I == 1) {
                    xo0o10.XX0(location);
                } else if (iO001I == 2) {
                    if (((Location) CollectionsKt___CollectionsKt.Xi1XO00(xo0o10.X11iII1O1())).getMActivityMode() != 3) {
                        location.setMActivityMode(3);
                    }
                    xo0o10.XX0(location);
                } else if (iO001I == 3) {
                    location.setMActivityMode(2);
                    xo0o10.XX0(location);
                }
            }
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable() && q62.OXO1.I10Oi0()) {
                BaseBleConnector.sendObject$default(bleConnector, BleKey.SAI_WEI_SPORT_LOCATION, BleKeyFlag.UPDATE, new BleCyWeeAlgorithmGpsData((float) loc.IiI10X(), (float) loc.XO0O10(), mc0.iIi1(loc.OXO1()), loc.XIi00iiXO(), loc.I0IIOi(), loc.m38247iO(), loc.m38246IO()), false, false, 24, null);
                return;
            }
            if (xo0o10.XOX0O0()) {
                MyDb.INSTANCE.getMDatabase().locationDao().insert(CollectionsKt__CollectionsKt.iIiiO(location));
                xo0o10.O0O0X0iOi(loc);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String message) {
            Intrinsics.X0O(message, "message");
            i1O0OXO1O.OXO1.OXO1("SportManager gps error: " + message);
        }
    }

    public interface OXO1 {

        /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.XO0O10$OXO1$OXO1 */
        public static final class C22049OXO1 {
            @Deprecated
            public static void O00(@aa1 OXO1 oxo1, @aa1 BleAppSportState sportState) {
                Intrinsics.X0O(sportState, "sportState");
                OXO1.super.XO0O10(sportState);
            }

            @Deprecated
            public static void OXO1(@aa1 OXO1 oxo1, boolean z) {
                OXO1.super.O00(z);
            }

            @Deprecated
            public static void XIi00iiXO(@aa1 OXO1 oxo1, int i) {
                OXO1.super.mo38603iO(i);
            }

            @Deprecated
            public static void XO0O10(@aa1 OXO1 oxo1, @aa1 SportData sportData) {
                Intrinsics.X0O(sportData, "sportData");
                OXO1.super.mo38602IO(sportData);
            }

            @Deprecated
            /* JADX INFO: renamed from: iO */
            public static void m38661iO(@aa1 OXO1 oxo1, @aa1 Location location) {
                Intrinsics.X0O(location, "location");
                OXO1.super.OIi0(location);
            }
        }

        /* JADX INFO: renamed from: IO */
        default void mo38602IO(@aa1 SportData sportData) {
            Intrinsics.X0O(sportData, "sportData");
        }

        default void O00(boolean z) {
        }

        default void OIi0(@aa1 Location location) {
            Intrinsics.X0O(location, "location");
        }

        default void XO0O10(@aa1 BleAppSportState sportState) {
            Intrinsics.X0O(sportState, "sportState");
        }

        /* JADX INFO: renamed from: iO */
        default void mo38603iO(int i) {
        }
    }

    public static final class XIi00iiXO implements StepsManager.OXO1 {
        @Override // com.sma.smartv3.ui.sport.StepsManager.OXO1
        public void OXO1(int i) {
            XO0O10 xo0o10 = XO0O10.OXO1;
            xo0o10.X0i1O().setMStep(i);
            xo0o10.IXI();
            if (xo0o10.X11iII1O1().isEmpty() || xo0o10.X11iII1O1().size() < 2) {
                xo0o10.X0i1O().setMDistance(o65.OXO1.OIi0(XO0O10.IIX1OXO.getHeight(), xo0o10.X0i1O().getMStep()));
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.XO0O10$XO0O10 */
    public static final class RunnableC22050XO0O10 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            XO0O10.XOO0ii0.postDelayed(this, 1000L);
            XO0O10.OXO1.iIX0i();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.XO0O10$iO */
    public static final class C18965iO implements BleHandleCallback {
        public static final Unit IiI10X(BleAppSportState bleAppSportState, OXO1 it) {
            Intrinsics.X0O(it, "it");
            it.XO0O10(bleAppSportState);
            return Unit.OXO1;
        }

        public static final Unit O00(boolean z, OXO1 it) {
            Intrinsics.X0O(it, "it");
            it.O00(z);
            return Unit.OXO1;
        }

        public static final Unit XO0O10(OXO1 it) {
            Intrinsics.X0O(it, "it");
            it.mo38602IO(XO0O10.OXO1.X0i1O());
            return Unit.OXO1;
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
        public void onDeviceSportDataUpdate(BleDeviceSportData deviceSportData) {
            Intrinsics.X0O(deviceSportData, "deviceSportData");
            if (q62.OXO1.XO11XXOi()) {
                XO0O10 xo0o10 = XO0O10.OXO1;
                xo0o10.X0i1O().setMTime(System.currentTimeMillis());
                SportData sportDataX0i1O = xo0o10.X0i1O();
                String strMillis2String = TimeUtils.millis2String(xo0o10.X0i1O().getMTime(), O0X11OiO.XO0O10());
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                sportDataX0i1O.setMLocalTime(strMillis2String);
                xo0o10.X0i1O().setMDuration(deviceSportData.getMDuration());
                xo0o10.X0i1O().setMSpm(deviceSportData.getMSpm());
                xo0o10.X0i1O().setMPace(deviceSportData.getMPace());
                xo0o10.X0i1O().setMSpeed(deviceSportData.getMSpeed());
                xo0o10.X0i1O().setMCalorie(deviceSportData.getMCalorie() / 1000);
                xo0o10.X0i1O().setMStep(deviceSportData.getMStep());
                xo0o10.X0i1O().setMDistance(deviceSportData.getMDistance());
                xo0o10.IX0IXOi(deviceSportData.getMBpm());
                xo0o10.m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.y05
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return com.sma.smartv3.p610ui.sport.XO0O10.C18965iO.XO0O10((com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
                    }
                });
                xo0o10.X11I();
            }
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
        public void onSessionStateChange(final boolean z) {
            XO0O10.OXO1.m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.x05
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return com.sma.smartv3.p610ui.sport.XO0O10.C18965iO.O00(z, (com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
                }
            });
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
        public void onUpdateAppSportState(final BleAppSportState appSportState) {
            Intrinsics.X0O(appSportState, "appSportState");
            XO0O10 xo0o10 = XO0O10.OXO1;
            xo0o10.Xii11I(appSportState.getMState());
            int mState = appSportState.getMState();
            if (mState == 1) {
                XO0O10.i100IXOX(xo0o10, appSportState.getMMode(), false, 0, 0, 0, 28, null);
            } else if (mState == 2) {
                xo0o10.iiIOiX(false);
            } else if (mState == 3) {
                xo0o10.XOIX(false);
            } else if (mState == 4) {
                xo0o10.iOOX010X(false);
            }
            xo0o10.m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.w05
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return com.sma.smartv3.p610ui.sport.XO0O10.C18965iO.IiI10X(appSportState, (com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
                }
            });
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
        public void onUpdateHeartRate(BleHeartRate heartRate) {
            Intrinsics.X0O(heartRate, "heartRate");
            if (heartRate.getMType() == 1) {
                return;
            }
            XO0O10 xo0o10 = XO0O10.OXO1;
            xo0o10.IX0IXOi(heartRate.getMBpm());
            xo0o10.XXIIO1i11().add(heartRate);
            if (q62.OXO1.X0OXOI()) {
                OIOIXX1.OXO1.XO0O10(heartRate);
            }
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

    static {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        IIX1OXO = (AppUser) appUser;
        XiOIO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return com.sma.smartv3.p610ui.sport.XO0O10.XXiIiX10();
            }
        });
        iIiiO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return com.sma.smartv3.p610ui.sport.XO0O10.i11I();
            }
        });
        XX0 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return com.sma.smartv3.p610ui.sport.XO0O10.X00Xi1X();
            }
        });
        OiIIX101O = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return com.sma.smartv3.p610ui.sport.XO0O10.Ii0X0X();
            }
        });
        XiOIii1 = new ArrayList();
        OII = new ArrayList();
        f54782OX = new ArrayList();
        f54784iX = true;
        iOO1ii1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return com.sma.smartv3.p610ui.sport.XO0O10.i0X000X0O();
            }
        });
        O1O = new RunnableC22050XO0O10();
    }

    public static final void IXOIIIO(Function1 function1) {
        for (OXO1 oxo1 : OXO1.X1IX()) {
            Intrinsics.XXI(oxo1);
            function1.invoke2(oxo1);
        }
    }

    public static final SportDataDao Ii0X0X() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    /* JADX INFO: renamed from: OX */
    public static /* synthetic */ boolean m38653OX(XO0O10 xo0o10, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = I1XOi1.getMMode() == 97;
        }
        return xo0o10.OII(z);
    }

    /* JADX INFO: renamed from: Oi */
    public static /* synthetic */ void m38654Oi(XO0O10 xo0o10, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        xo0o10.iiIOiX(z);
    }

    public static final Unit OiIIX101O(Location location, OXO1 it) {
        Intrinsics.X0O(it, "it");
        it.OIi0(location);
        return Unit.OXO1;
    }

    public static final WorkoutIndexDao X00Xi1X() {
        return MyDb.INSTANCE.getMDatabase().workoutIndexDao();
    }

    public static /* synthetic */ void X01IiOiIi(XO0O10 xo0o10, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        xo0o10.iOOX010X(z);
    }

    public static final Unit X100O(Ref.IntRef intRef, OXO1 it) {
        Intrinsics.X0O(it, "it");
        it.mo38603iO(intRef.element);
        return Unit.OXO1;
    }

    public static final Unit X1OI(OXO1 it) {
        Intrinsics.X0O(it, "it");
        it.mo38602IO(I1XOi1);
        return Unit.OXO1;
    }

    public static final CopyOnWriteArrayList XO0X10iO() {
        return new CopyOnWriteArrayList();
    }

    public static /* synthetic */ void XOXiX0(XO0O10 xo0o10, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        xo0o10.XOIX(z);
    }

    public static final Unit XX00i10X(WorkoutIndex workoutIndex, boolean z) {
        if (!z) {
            OXO1.Ii1iii0().insert(workoutIndex);
        }
        return Unit.OXO1;
    }

    public static final WorkoutDao XXiIiX10() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final C18965iO i0X000X0O() {
        return new C18965iO();
    }

    public static /* synthetic */ void i100IXOX(XO0O10 xo0o10, int i, boolean z, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z = true;
        }
        xo0o10.iIi1(i, z, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    public static final LocationDao i11I() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m38656I1() {
        i1O0OXO1O.OXO1.OXO1("SportManager destroy");
        StepsManager stepsManager = null;
        if (iOiXi11II()) {
            XOXiX0(this, false, 1, null);
        }
        if (OIi0 != 4) {
            X01IiOiIi(this, false, 1, null);
        }
        StepsManager stepsManager2 = I0IIOi;
        if (stepsManager2 == null) {
            Intrinsics.XXO("mStepsManager");
        } else {
            stepsManager = stepsManager2;
        }
        stepsManager.O10IXXX0X();
        BleConnector.INSTANCE.removeHandleCallback(iOO1ii1());
    }

    public final float II1Xi0() {
        return o65.OXO1.XO0O10(I1XOi1.getMDistance(), I1XOi1.getMDuration());
    }

    public final void IO0II0i() {
        int iI100IXOX = mc0.i100IXOX(OIOIXX1.OXO1.OXO1(I1XOi1.getMMode(), IIX1OXO.getWeight(), IIX1OXO.getGender(), O0X11OiO.OXO1(IIX1OXO.getBirthday())));
        if (iI100IXOX > 0) {
            I1XOi1.setMCalorie(iI100IXOX);
        }
    }

    public final void IO0iXO0O() {
        q62 q62Var = q62.OXO1;
        if (q62Var.XO11XXOi()) {
            return;
        }
        if (I1XOi1.getMDuration() % 60 != 0) {
            List<SportData> list = f54782OX;
            SportData sportData = I1XOi1;
            list.add(sportData.copy((LayoutKt.LargeDimension & 1) != 0 ? sportData.mId : 0, (LayoutKt.LargeDimension & 2) != 0 ? sportData.mTime : 0L, (LayoutKt.LargeDimension & 4) != 0 ? sportData.mLocalTime : null, (LayoutKt.LargeDimension & 8) != 0 ? sportData.mStep : 0, (LayoutKt.LargeDimension & 16) != 0 ? sportData.mDistance : 0, (LayoutKt.LargeDimension & 32) != 0 ? sportData.mCalorie : 0, (LayoutKt.LargeDimension & 64) != 0 ? sportData.mDuration : 0, (LayoutKt.LargeDimension & 128) != 0 ? sportData.mSpm : 0, (LayoutKt.LargeDimension & 256) != 0 ? sportData.mAltitude : 0, (LayoutKt.LargeDimension & 512) != 0 ? sportData.mAirPressure : 0, (LayoutKt.LargeDimension & 1024) != 0 ? sportData.mPace : 0, (LayoutKt.LargeDimension & 2048) != 0 ? sportData.mSpeed : 0, (LayoutKt.LargeDimension & 4096) != 0 ? sportData.mMode : 0, (LayoutKt.LargeDimension & 8192) != 0 ? sportData.mIsSync : 0, (LayoutKt.LargeDimension & 16384) != 0 ? sportData.mIsDelete : 0));
        }
        iX1O1().insert(OII);
        iIXi1iiXI().insert(f54782OX);
        if (q62Var.XOIO0()) {
            return;
        }
        WorkoutDao workoutDaoIXiiiO = iXiiiO();
        Workout workout = new Workout(0, 0L, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -1, -1, -1, -1, Integer.MAX_VALUE, null);
        workout.setMSource(1);
        workout.setMStart(f54781IO);
        workout.setMEnd(OIX0iXi);
        String strMillis2String = TimeUtils.millis2String(workout.getMStart(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
        workout.setMLocalTime(strMillis2String);
        workout.setMDuration(I1XOi1.getMDuration());
        workout.setMAltitude(I1XOi1.getMAltitude());
        workout.setMAirPressure(I1XOi1.getMAirPressure());
        workout.setMSpm(I1XOi1.getMSpm());
        workout.setMMode(I1XOi1.getMMode());
        workout.setMStep(I1XOi1.getMStep());
        workout.setMDistance(I1XOi1.getMDistance());
        workout.setMCalorie(I1XOi1.getMCalorie() * 1000);
        workout.setMSpeed(I1XOi1.getMSpeed() * 1000);
        workout.setMPace(I1XOi1.getMPace());
        for (BleHeartRate bleHeartRate : XiOIii1) {
            workout.setMAvgBpm(workout.getMAvgBpm() + bleHeartRate.getMBpm());
            if (bleHeartRate.getMBpm() > workout.getMMaxBpm()) {
                workout.setMMaxBpm(bleHeartRate.getMBpm());
            }
            if (bleHeartRate.getMBpm() < workout.getMMinBpm()) {
                workout.setMMinBpm(bleHeartRate.getMBpm());
            }
        }
        if (!XiOIii1.isEmpty()) {
            workout.setMAvgBpm(workout.getMAvgBpm() / XiOIii1.size());
        }
        for (SportData sportData2 : f54782OX) {
            if (sportData2.getMSpm() > workout.getMMaxSpm()) {
                workout.setMMaxSpm(sportData2.getMSpm());
            }
            if (sportData2.getMSpm() < workout.getMMinSpm()) {
                workout.setMMinSpm(sportData2.getMSpm());
            }
            if (sportData2.getMPace() > workout.getMMaxPace()) {
                workout.setMMaxPace(sportData2.getMPace());
            }
            if (sportData2.getMPace() < workout.getMMinPace()) {
                workout.setMMinPace(sportData2.getMPace());
            }
        }
        workout.setMGoalDistance(f54780I1);
        workout.setMGoalTime(iOOX010X);
        workout.setMGoalCalorie(X01IiOiIi);
        Unit unit = Unit.OXO1;
        final WorkoutIndex workoutIndex = new WorkoutIndex(0, 2, workout.getMEnd(), workout.getMMode(), 0, 17, null);
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.v05
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return com.sma.smartv3.p610ui.sport.XO0O10.XX00i10X(workoutIndex, ((Boolean) obj).booleanValue());
            }
        });
        long j = workoutDaoIXiiiO.insert(CollectionsKt__CollectionsKt.Ii1iii0(workout))[0];
        I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
        I01XX0.OXO1(I01XX0.f1089Oi, Integer.valueOf((int) j));
        i1O0OXO1O.OXO1.OXO1("SportManager save " + j);
    }

    public final void IX0IXOi(int i) {
        X0O = i;
    }

    public final void IX1XiI(long j) {
        OIX0iXi = j;
    }

    public final void IXI() {
        if ((!q62.OXO1.X0OXOI() || a15.m1445iO(I1XOi1.getMMode())) && I1XOi1.getMMode() != 10) {
            I1XOi1.setMCalorie(o65.OXO1.I0IIOi(IIX1OXO.getGender(), IIX1OXO.getWeight(), I1XOi1.getMStep()));
        }
    }

    public final int IXXOO() {
        return f54783iO;
    }

    @sf5(tag = b01.XiOIO)
    public final void Ii0i(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onLocationWhere");
        II1Xi0 = C2743ns.XIi00iiXO(new O00(), false, 2, null);
    }

    public final WorkoutIndexDao Ii1iii0() {
        return (WorkoutIndexDao) XX0.getValue();
    }

    public final void IiiXiI0I() {
        if (q62.OXO1.X0OXOI() && !a15.m1445iO(I1XOi1.getMMode())) {
            IO0II0i();
        } else if (I1XOi1.getMMode() == 10) {
            I1XOi1.setMCalorie(o65.OXO1.OXO1(IIX1OXO.getWeight(), I1XOi1.getMDistance()));
        }
    }

    public final int O001I() {
        return OIi0;
    }

    public final void O0O(double d) {
        O10IXXX0X = d;
    }

    public final void O0O0X0iOi(@aa1 CustomLocation location) {
        Intrinsics.X0O(location, "location");
        if (BleCache.INSTANCE.getMAGpsType() == 0 && I1XOi1.getMDuration() % 20 == 0) {
            int iIIi1 = mc0.iIi1(location.OXO1());
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.REQUEST_LOCATION, BleKeyFlag.CREATE, new BleLocationReply(location.I0IIOi(), Float.parseFloat(cp5.X1IX(X1ii / 1000.0f, false, 2, null)), iIIi1), false, false, 24, null);
            i1O0OXO1O.OXO1.OXO1("SportManager sendLocation -> mSpeed=" + location.I0IIOi() + ", mTotalDistance=" + X1ii + ", altitude=" + iIIi1);
        }
    }

    public final long O1O() {
        return OIX0iXi;
    }

    public final boolean OII(boolean z) {
        i1O0OXO1O.OXO1.OXO1("canSave " + I1XOi1.getMDuration() + "  " + I1XOi1.getMStep() + "  " + I1XOi1.getMCalorie());
        if (I1XOi1.getMDuration() < 120) {
            return false;
        }
        if (z) {
            return true;
        }
        if (q62.OXO1.O1XXXX(I1XOi1.getMMode())) {
            return I1XOi1.getMStep() >= 100;
        }
        return I1XOi1.getMCalorie() >= 4;
    }

    /* JADX INFO: renamed from: OO */
    public final boolean m38657OO() {
        return IXXOO;
    }

    public final boolean OX110i() {
        return i010I;
    }

    public final void X00O0(boolean z) {
        IXXOO = z;
    }

    public final boolean X00XIX1() {
        return f54784iX;
    }

    @aa1
    public final SportData X0i1O() {
        return I1XOi1;
    }

    public final void X0iO(long j) {
        f54781IO = j;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38658X1(final Function1<? super OXO1, Unit> function1) {
        XOO0ii0.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.l05
            @Override // java.lang.Runnable
            public final void run() {
                com.sma.smartv3.p610ui.sport.XO0O10.IXOIIIO(function1);
            }
        });
    }

    public final void X111IO(boolean z) {
        f54784iX = z;
    }

    public final void X11I() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        if (f54780I1 != 0 && I1XOi1.getMDistance() >= f54780I1) {
            intRef.element = XIi00iiXO;
        }
        if (iOOX010X != 0 && I1XOi1.getMDuration() >= iOOX010X) {
            intRef.element = f54783iO;
        }
        if (X01IiOiIi != 0 && I1XOi1.getMCalorie() >= X01IiOiIi) {
            intRef.element = XO0O10;
        }
        if (intRef.element == -1 || i010I) {
            return;
        }
        i010I = true;
        m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.m05
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return com.sma.smartv3.p610ui.sport.XO0O10.X100O(intRef, (com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
            }
        });
    }

    @aa1
    public final List<Location> X11iII1O1() {
        return OII;
    }

    public final CopyOnWriteArrayList<OXO1> X1IX() {
        return (CopyOnWriteArrayList) IiI10X.getValue();
    }

    public final void XOIX(boolean z) {
        i1O0OXO1O.OXO1.OXO1("SportManager pause " + z + " ");
        OIi0 = 3;
        StepsManager stepsManager = I0IIOi;
        if (stepsManager == null) {
            Intrinsics.XXO("mStepsManager");
            stepsManager = null;
        }
        stepsManager.I1XOi1();
        iI0I(z);
    }

    public final void XOO0XOOii(@aa1 OXO1 onSportListener) {
        Intrinsics.X0O(onSportListener, "onSportListener");
        X1IX().remove(onSportListener);
    }

    public final boolean XOX0O0() {
        return BleCache.INSTANCE.getMAGpsType() == 0 && q62.OXO1.XO11XXOi();
    }

    public final void XX0(@aa1 final Location location) {
        Intrinsics.X0O(location, "location");
        if (!q62.OXO1.XO11XXOi()) {
            if (OII.isEmpty()) {
                I1XOi1.setMDistance(0);
            } else if (location.getMActivityMode() != 2) {
                double dIiI10X = O10IXXX0X + o65.OXO1.IiI10X((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII), location);
                O10IXXX0X = dIiI10X;
                I1XOi1.setMDistance((int) dIiI10X);
            } else if (location.getMActivityMode() != ((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII)).getMActivityMode()) {
                double dIiI10X2 = O10IXXX0X + o65.OXO1.IiI10X((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII), location);
                O10IXXX0X = dIiI10X2;
                I1XOi1.setMDistance((int) dIiI10X2);
            }
            I1XOi1.setMAltitude(location.getMAltitude());
        }
        i1O0OXO1O.OXO1.OXO1("SportManager addLocation -> " + location);
        OII.add(location);
        m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.u05
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return com.sma.smartv3.p610ui.sport.XO0O10.OiIIX101O(location, (com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
            }
        });
    }

    public final void XX1Oi(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        i1O0OXO1O.OXO1.OXO1("SportManager init");
        I0IIOi = new StepsManager(app, new XIi00iiXO());
        try {
            BleConnector.INSTANCE.removeHandleCallback(iOO1ii1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        BleConnector.INSTANCE.addHandleCallback(iOO1ii1());
        Ii0i(new Object());
    }

    @aa1
    public final List<BleHeartRate> XXIIO1i11() {
        return XiOIii1;
    }

    public final long XXO() {
        return f54781IO;
    }

    public final double XXX11i() {
        return O10IXXX0X;
    }

    public final void XXiO0i(@aa1 List<BleHeartRate> list) {
        Intrinsics.X0O(list, "<set-?>");
        XiOIii1 = list;
    }

    public final void Xi1i0XOX0(@aa1 SportData sportData) {
        Intrinsics.X0O(sportData, "<set-?>");
        I1XOi1 = sportData;
    }

    public final void XiOIii1(@aa1 OXO1 onSportListener) {
        Intrinsics.X0O(onSportListener, "onSportListener");
        X1IX().add(onSportListener);
    }

    public final void Xii11I(int i) {
        OIi0 = i;
    }

    public final int i010I() {
        return XO0O10;
    }

    /* JADX INFO: renamed from: iI */
    public final int m38659iI() {
        return X0O;
    }

    public final void iI0I(boolean z) {
        if (z) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable() && q62.OXO1.O0i0()) {
                BaseBleConnector.sendObject$default(bleConnector, BleKey.APP_SPORT_STATE, BleKeyFlag.UPDATE, new BleAppSportState(I1XOi1.getMMode(), OIi0), false, false, 24, null);
            }
        }
    }

    public final void iIX0i() {
        I0iXXO++;
        if (OIi0 == 3) {
            XXI++;
        }
        if (iOiXi11II()) {
            I1XOi1.setMTime(System.currentTimeMillis());
            SportData sportData = I1XOi1;
            String strMillis2String = TimeUtils.millis2String(sportData.getMTime(), O0X11OiO.XO0O10());
            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
            sportData.setMLocalTime(strMillis2String);
            I1XOi1.setMDuration(I0iXXO - XXI);
            SportData sportData2 = I1XOi1;
            o65 o65Var = o65.OXO1;
            sportData2.setMSpm(o65Var.m2748IO(I1XOi1.getMStep(), I1XOi1.getMDuration()));
            SportData sportData3 = I1XOi1;
            sportData3.setMPace(o65Var.XIi00iiXO(sportData3.getMDuration(), I1XOi1.getMDistance()));
            I1XOi1.setMSpeed(i72.OXO1.XXI0XOIX() ? (int) II1Xi0() : o65Var.m2749iO(I1XOi1.getMDistance(), I1XOi1.getMDuration()));
            IiiXiI0I();
            m38658X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.n05
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return com.sma.smartv3.p610ui.sport.XO0O10.X1OI((com.sma.smartv3.ui.sport.XO0O10.OXO1) obj);
                }
            });
            if (I1XOi1.getMDuration() % 60 == 0) {
                List<SportData> list = f54782OX;
                SportData sportData4 = I1XOi1;
                list.add(sportData4.copy((LayoutKt.LargeDimension & 1) != 0 ? sportData4.mId : 0, (LayoutKt.LargeDimension & 2) != 0 ? sportData4.mTime : 0L, (LayoutKt.LargeDimension & 4) != 0 ? sportData4.mLocalTime : null, (LayoutKt.LargeDimension & 8) != 0 ? sportData4.mStep : 0, (LayoutKt.LargeDimension & 16) != 0 ? sportData4.mDistance : 0, (LayoutKt.LargeDimension & 32) != 0 ? sportData4.mCalorie : 0, (LayoutKt.LargeDimension & 64) != 0 ? sportData4.mDuration : 0, (LayoutKt.LargeDimension & 128) != 0 ? sportData4.mSpm : 0, (LayoutKt.LargeDimension & 256) != 0 ? sportData4.mAltitude : 0, (LayoutKt.LargeDimension & 512) != 0 ? sportData4.mAirPressure : 0, (LayoutKt.LargeDimension & 1024) != 0 ? sportData4.mPace : 0, (LayoutKt.LargeDimension & 2048) != 0 ? sportData4.mSpeed : 0, (LayoutKt.LargeDimension & 4096) != 0 ? sportData4.mMode : 0, (LayoutKt.LargeDimension & 8192) != 0 ? sportData4.mIsSync : 0, (LayoutKt.LargeDimension & 16384) != 0 ? sportData4.mIsDelete : 0));
            }
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isAvailable() && q62.OXO1.O0i0()) {
                BaseBleConnector.sendObject$default(bleConnector, BleKey.APP_SPORT_DATA, BleKeyFlag.UPDATE, new BleAppSportData(I1XOi1.getMStep(), I1XOi1.getMDistance(), I1XOi1.getMMode() == 97 ? 0 : I1XOi1.getMCalorie(), I1XOi1.getMDuration(), I1XOi1.getMSpm(), I1XOi1.getMAltitude(), I1XOi1.getMAirPressure(), I1XOi1.getMPace(), I1XOi1.getMSpeed(), I1XOi1.getMMode(), 0, 1024, null), false, false, 24, null);
            }
            X11I();
        }
        LogUtils.m11128d("SportManager sportData -> isSupportAppSport = " + q62.OXO1.O0i0() + "  BleConnector.isAvailable() = " + BleConnector.INSTANCE.isAvailable() + " state:" + OIi0 + ", t:" + ((System.currentTimeMillis() - f54781IO) / ((long) 1000)) + ", mTotalTime:" + I0iXXO + ", mPauseTime:" + XXI + ", " + I1XOi1 + " ");
    }

    public final SportDataDao iIXi1iiXI() {
        return (SportDataDao) OiIIX101O.getValue();
    }

    public final void iIi1(int i, boolean z, int i2, int i3, int i4) {
        C2702ms c2702ms;
        i1O0OXO1O.OXO1.OXO1("SportManager start " + i + " " + z + " " + i2 + " " + i3 + " " + i4 + " " + f54784iX);
        if (iOiXi11II()) {
            return;
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        IIX1OXO = (AppUser) appUser;
        OII.clear();
        XiOIii1.clear();
        f54782OX.clear();
        C18593iO.OXO1.XO0O10(0.0f);
        O10IXXX0X = 0.0d;
        I0iXXO = 0;
        XXI = 0;
        OIOIXX1.OXO1.O00();
        f54780I1 = i2;
        iOOX010X = i3;
        X01IiOiIi = i4;
        I1XOi1 = new SportData(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, i, 0, 0, 28671, null);
        OIi0 = 1;
        f54781IO = System.currentTimeMillis();
        OIX0iXi = System.currentTimeMillis();
        i010I = false;
        X1ii = 0;
        X0O = 0;
        iI0I(z);
        q62 q62Var = q62.OXO1;
        if (q62Var.XIXO0iiO(I1XOi1.getMMode()) && (c2702ms = II1Xi0) != null) {
            c2702ms.IiI10X(R.string.get_your_location, false);
        }
        if (q62Var.XO11XXOi()) {
            return;
        }
        Handler handler = XOO0ii0;
        RunnableC22050XO0O10 runnableC22050XO0O10 = O1O;
        handler.removeCallbacks(runnableC22050XO0O10);
        handler.postDelayed(runnableC22050XO0O10, 1000L);
        StepsManager stepsManager = I0IIOi;
        if (stepsManager == null) {
            Intrinsics.XXO("mStepsManager");
            stepsManager = null;
        }
        stepsManager.XiOIO();
    }

    public final void iOI(boolean z) {
        i010I = z;
    }

    public final C18965iO iOO1ii1() {
        return (C18965iO) iOO1ii1.getValue();
    }

    public final void iOOX010X(boolean z) {
        C2702ms c2702ms;
        i1O0OXO1O.OXO1.OXO1("SportManager end " + z + " ");
        OIi0 = 4;
        StepsManager stepsManager = I0IIOi;
        if (stepsManager == null) {
            Intrinsics.XXO("mStepsManager");
            stepsManager = null;
        }
        stepsManager.X0O();
        OIX0iXi = System.currentTimeMillis();
        XOO0ii0.removeCallbacks(O1O);
        iI0I(z);
        if (q62.OXO1.XIXO0iiO(I1XOi1.getMMode()) && (c2702ms = II1Xi0) != null) {
            c2702ms.I0IIOi();
        }
        if (OII.isEmpty() || OII.size() <= 1) {
            return;
        }
        ((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII)).setMActivityMode(4);
    }

    public final boolean iOiXi11II() {
        int i = OIi0;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: iX */
    public final int m38660iX() {
        return XIi00iiXO;
    }

    public final LocationDao iX1O1() {
        return (LocationDao) iIiiO.getValue();
    }

    public final void iXi(@aa1 List<Location> list) {
        Intrinsics.X0O(list, "<set-?>");
        OII = list;
    }

    @aa1
    public final List<SportData> iXiX011() {
        return f54782OX;
    }

    public final WorkoutDao iXiiiO() {
        return (WorkoutDao) XiOIO.getValue();
    }

    public final void iiIOiX(boolean z) {
        i1O0OXO1O.OXO1.OXO1("SportManager resume " + z + " ");
        OIi0 = 2;
        StepsManager stepsManager = I0IIOi;
        if (stepsManager == null) {
            Intrinsics.XXO("mStepsManager");
            stepsManager = null;
        }
        stepsManager.IIX1OXO();
        iI0I(z);
    }

    public final void iii0(@aa1 List<SportData> list) {
        Intrinsics.X0O(list, "<set-?>");
        f54782OX = list;
    }

    public final float iiiO() {
        return C18593iO.OXO1.OXO1();
    }
}
