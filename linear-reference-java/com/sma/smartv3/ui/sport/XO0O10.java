package com.sma.smartv3.ui.sport;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.layout.LayoutKt;
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
import com.android.mltcode.paycertificationapi.l05;
import com.android.mltcode.paycertificationapi.m05;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.n05;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.o05;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.p05;
import com.android.mltcode.paycertificationapi.q05;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r05;
import com.android.mltcode.paycertificationapi.s05;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t05;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u05;
import com.android.mltcode.paycertificationapi.v05;
import com.android.mltcode.paycertificationapi.w05;
import com.android.mltcode.paycertificationapi.x05;
import com.android.mltcode.paycertificationapi.y05;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.SportDataDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.db.entity.WorkoutIndex;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManager.kt\ncom/sma/smartv3/ui/sport/SportManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n19#2:775\n15#2:776\n19#2:783\n15#2:784\n1869#3,2:777\n1869#3,2:779\n1869#3,2:781\n*S KotlinDebug\n*F\n+ 1 SportManager.kt\ncom/sma/smartv3/ui/sport/SportManager\n*L\n375#1:775\n375#1:776\n101#1:783\n101#1:784\n488#1:777,2\n501#1:779,2\n752#1:781,2\n*E\n"})
public final class XO0O10 {
    public static StepsManager I0IIOi = null;
    public static int I0iXXO = 0;
    public static int I1 = 0;

    @aa1
    public static SportData I1XOi1 = null;

    @tb1
    public static ms II1Xi0 = null;

    @aa1
    public static AppUser IIX1OXO = null;
    public static long IO = 0;
    public static boolean IXXOO = false;

    @aa1
    public static final Lazy IiI10X = null;

    @aa1
    public static final String O00 = "SportManager";
    public static double O10IXXX0X;

    @aa1
    public static final RunnableC0574XO0O10 O1O = null;

    @aa1
    public static List<Location> OII;
    public static long OIX0iXi;
    public static int OIi0;

    @aa1
    public static List<SportData> OX;

    @aa1
    public static final XO0O10 OXO1 = null;

    @aa1
    public static final Lazy OiIIX101O = null;
    public static int X01IiOiIi;
    public static int X0O;
    public static int X1ii;
    public static final int XIi00iiXO = 0;
    public static final int XO0O10 = 0;

    @aa1
    public static final Handler XOO0ii0 = null;

    @aa1
    public static final Lazy XX0 = null;
    public static int XXI;

    @aa1
    public static final Lazy XiOIO = null;

    @aa1
    public static List<BleHeartRate> XiOIii1;
    public static boolean i010I;

    @aa1
    public static final Lazy iIiiO = null;
    public static final int iO = 0;

    @aa1
    public static final Lazy iOO1ii1 = null;
    public static int iOOX010X;
    public static boolean iX;

    public static final class O00 implements IO0OI {
        public O00() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation r17) {
            Intrinsics.X0O(r17, "loc");
            Date r1 = new Date();
            long r4 = r1.getTime();
            String r6 = O0X11OiO.XO0O10().format(r1);
            Intrinsics.O10IXXX0X(r6, "format(...)");
            XO0O10 r2 = XO0O10.OXO1;
            Location r3 = new Location(0, r4, r6, r2.X0i1O().getMMode(), mc0.iIi1(r17.OXO1()), (float) r17.IiI10X(), (float) r17.XO0O10(), r17.XOO0ii0(), 0, 0, 768, null);
            com.sma.smartv3.location.iO.iO(com.sma.smartv3.location.iO.OXO1, r17, null, 2, null);
            if (r2.X11iII1O1().isEmpty() == false) goto L5;
            r3.setMActivityMode(0);
            r2.XX0(r3);
        L21:
            BleConnector r5 = BleConnector.INSTANCE;
            if (r5.isAvailable() == false) goto L28;
            if (q62.OXO1.I10Oi0() == false) goto L28;
            BaseBleConnector.sendObject$default(r5, BleKey.SAI_WEI_SPORT_LOCATION, BleKeyFlag.UPDATE, new BleCyWeeAlgorithmGpsData((float) r17.IiI10X(), (float) r17.XO0O10(), mc0.iIi1(r17.OXO1()), r17.XIi00iiXO(), r17.I0IIOi(), r17.iO(), r17.IO()), false, false, 24, null);
            return;
        L28:
            if (XO0O10.X0O(r2) == false) goto L31;
            MyDb.INSTANCE.getMDatabase().locationDao().insert(CollectionsKt__CollectionsKt.iIiiO(new Location[]{r3}));
            r2.O0O0X0iOi(r17);
            return;
        L31:
            return;
        L5:
            Location r7 = (Location) CollectionsKt___CollectionsKt.Xi1XO00(r2.X11iII1O1());
            double r8 = DistanceUtil.getDistance(new LatLng(r7.getMLatitude(), r7.getMLongitude()), new LatLng(r17.XO0O10(), r17.IiI10X()));
            if (r8 >= 1.0d) goto L9;
            i1O0OXO1O.OXO1.OXO1("SportManager onLocationChange -> too short tmpDistance=" + r8);
            return;
        L9:
            XO0O10.XiOIO(XO0O10.XXI() + ((int) r8));
            int r9 = r2.O001I();
            if (r9 != 1) goto L12;
            r2.XX0(r3);
            goto L21
        L12:
            if (r9 == 2) goto L17;
            if (r9 != 3) goto L21;
            r3.setMActivityMode(2);
            r2.XX0(r3);
            goto L21
        L17:
            if (((Location) CollectionsKt___CollectionsKt.Xi1XO00(r2.X11iII1O1())).getMActivityMode() == 3) goto L19;
            r3.setMActivityMode(3);
        L19:
            r2.XX0(r3);
            goto L21
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String r4) {
            Intrinsics.X0O(r4, "message");
            i1O0OXO1O.OXO1.OXO1("SportManager gps error: " + r4);
        }
    }

    public interface OXO1 {

        /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.XO0O10$OXO1$OXO1, reason: collision with other inner class name */
        public static final class C0573OXO1 {
            @Deprecated
            public static void O00(@aa1 OXO1 r1, @aa1 BleAppSportState r2) {
                Intrinsics.X0O(r2, "sportState");
                OXO1.OXO1(r1, r2);
            }

            @Deprecated
            public static void OXO1(@aa1 OXO1 r0, boolean r1) {
                OXO1.XOO0ii0(r0, r1);
            }

            @Deprecated
            public static void XIi00iiXO(@aa1 OXO1 r0, int r1) {
                OXO1.I0IIOi(r0, r1);
            }

            @Deprecated
            public static void XO0O10(@aa1 OXO1 r1, @aa1 SportData r2) {
                Intrinsics.X0O(r2, "sportData");
                OXO1.IiI10X(r1, r2);
            }

            @Deprecated
            public static void iO(@aa1 OXO1 r1, @aa1 Location r2) {
                Intrinsics.X0O(r2, "location");
                OXO1.XIi00iiXO(r1, r2);
            }
        }

        static /* synthetic */ void I0IIOi(OXO1 r0, int r1) {
            super.iO(r1);
        }

        static /* synthetic */ void IiI10X(OXO1 r0, SportData r1) {
            super.IO(r1);
        }

        static /* synthetic */ void OXO1(OXO1 r0, BleAppSportState r1) {
            super.XO0O10(r1);
        }

        static /* synthetic */ void XIi00iiXO(OXO1 r0, Location r1) {
            super.OIi0(r1);
        }

        static /* synthetic */ void XOO0ii0(OXO1 r0, boolean r1) {
            super.O00(r1);
        }

        default void IO(@aa1 SportData r2) {
            Intrinsics.X0O(r2, "sportData");
        }

        default void O00(boolean r1) {
        }

        default void OIi0(@aa1 Location r2) {
            Intrinsics.X0O(r2, "location");
        }

        default void XO0O10(@aa1 BleAppSportState r2) {
            Intrinsics.X0O(r2, "sportState");
        }

        default void iO(int r1) {
        }
    }

    public static final class XIi00iiXO implements StepsManager.OXO1 {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.ui.sport.StepsManager.OXO1
        public void OXO1(int r4) {
            XO0O10 r0 = XO0O10.OXO1;
            r0.X0i1O().setMStep(r4);
            XO0O10.IIX1OXO(r0);
            if (r0.X11iII1O1().isEmpty() == false) goto L5;
        L8:
            r0.X0i1O().setMDistance(o65.OXO1.OIi0(XO0O10.X1ii().getHeight(), r0.X0i1O().getMStep()));
            return;
        L5:
            if (r0.X11iII1O1().size() < 2) goto L8;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.XO0O10$XO0O10, reason: collision with other inner class name */
    public static final class RunnableC0574XO0O10 implements Runnable {
        public RunnableC0574XO0O10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XO0O10.I0iXXO().postDelayed(this, 1000);
            XO0O10.iIiiO(XO0O10.OXO1);
        }
    }

    public static final class iO implements BleHandleCallback {
        public iO() {
        }

        public static final Unit IiI10X(BleAppSportState r1, OXO1 r2) {
            Intrinsics.X0O(r2, "it");
            r2.XO0O10(r1);
            return Unit.OXO1;
        }

        public static final Unit O00(boolean r1, OXO1 r2) {
            Intrinsics.X0O(r2, "it");
            r2.O00(r1);
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit OXO1(boolean r0, OXO1 r1) {
            return O00(r0, r1);
        }

        public static /* synthetic */ Unit XIi00iiXO(OXO1 r0) {
            return XO0O10(r0);
        }

        public static final Unit XO0O10(OXO1 r1) {
            Intrinsics.X0O(r1, "it");
            r1.IO(XO0O10.OXO1.X0i1O());
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit iO(BleAppSportState r0, OXO1 r1) {
            return IiI10X(r0, r1);
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
        public void onDeviceSportDataUpdate(BleDeviceSportData r6) {
            Intrinsics.X0O(r6, "deviceSportData");
            if (q62.OXO1.XO11XXOi() == true) goto L5;
            return;
        L5:
            XO0O10 r0 = XO0O10.OXO1;
            r0.X0i1O().setMTime(System.currentTimeMillis());
            SportData r1 = r0.X0i1O();
            String r2 = TimeUtils.millis2String(r0.X0i1O().getMTime(), O0X11OiO.XO0O10());
            Intrinsics.O10IXXX0X(r2, "millis2String(...)");
            r1.setMLocalTime(r2);
            r0.X0i1O().setMDuration(r6.getMDuration());
            r0.X0i1O().setMSpm(r6.getMSpm());
            r0.X0i1O().setMPace(r6.getMPace());
            r0.X0i1O().setMSpeed(r6.getMSpeed());
            r0.X0i1O().setMCalorie(r6.getMCalorie() / 1000);
            r0.X0i1O().setMStep(r6.getMStep());
            r0.X0i1O().setMDistance(r6.getMDistance());
            r0.IX0IXOi(r6.getMBpm());
            XO0O10.I1XOi1(r0, new y05());
            XO0O10.O10IXXX0X(r0);
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
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey r1) {
            super.onEarphoneKeyUpdate(r1);
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
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey r1) {
            super.onReadEarphoneKey(r1);
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
        public void onSessionStateChange(final boolean r3) {
            XO0O10.I1XOi1(XO0O10.OXO1, new x05(r3));
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
        public void onUpdateAppSportState(final BleAppSportState r10) {
            Intrinsics.X0O(r10, "appSportState");
            XO0O10 r1 = XO0O10.OXO1;
            r1.Xii11I(r10.getMState());
            int r0 = r10.getMState();
            if (r0 != 1) goto L5;
            XO0O10.i100IXOX(r1, r10.getMMode(), false, 0, 0, 0, 28, null);
        L15:
            XO0O10.I1XOi1(r1, new w05(r10));
            return;
        L5:
            if (r0 != 2) goto L7;
            r1.iiIOiX(false);
            goto L15
        L7:
            if (r0 != 3) goto L9;
            r1.XOIX(false);
            goto L15
        L9:
            if (r0 != 4) goto L15;
            r1.iOOX010X(false);
            goto L15
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
        public void onUpdateHeartRate(BleHeartRate r3) {
            Intrinsics.X0O(r3, "heartRate");
            if (r3.getMType() == 1) goto L10;
            XO0O10 r0 = XO0O10.OXO1;
            r0.IX0IXOi(r3.getMBpm());
            r0.XXIIO1i11().add(r3);
            if (q62.OXO1.X0OXOI() == false) goto L9;
            OIOIXX1.OXO1.XO0O10(r3);
            return;
        L9:
            return;
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

    static {
        OXO1 = new XO0O10();
        iO = 1;
        XO0O10 = 2;
        IiI10X = LazyKt__LazyJVMKt.iO(new o05());
        XOO0ii0 = new Handler(Looper.getMainLooper());
        OIi0 = 4;
        I1XOi1 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        IIX1OXO = (AppUser) r2;
        XiOIO = LazyKt__LazyJVMKt.iO(new p05());
        iIiiO = LazyKt__LazyJVMKt.iO(new q05());
        XX0 = LazyKt__LazyJVMKt.iO(new r05());
        OiIIX101O = LazyKt__LazyJVMKt.iO(new s05());
        XiOIii1 = new ArrayList();
        OII = new ArrayList();
        OX = new ArrayList();
        iX = true;
        iOO1ii1 = LazyKt__LazyJVMKt.iO(new t05());
        O1O = new RunnableC0574XO0O10();
    }

    public XO0O10() {
    }

    public static /* synthetic */ WorkoutDao I0IIOi() {
        return XXiIiX10();
    }

    public static final /* synthetic */ Handler I0iXXO() {
        return XOO0ii0;
    }

    public static final /* synthetic */ void I1XOi1(XO0O10 r0, Function1 r1) {
        r0.X1(r1);
    }

    public static final /* synthetic */ void IIX1OXO(XO0O10 r0) {
        r0.IXI();
    }

    public static /* synthetic */ Unit IO(WorkoutIndex r0, boolean r1) {
        return XX00i10X(r0, r1);
    }

    public static final void IXOIIIO(Function1 r2) {
        Iterator<T> r0 = OXO1.X1IX().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        OXO1 r1 = (OXO1) r0.next();
        Intrinsics.XXI(r1);
        r2.invoke(r1);
        goto L4
    }

    public static final SportDataDao Ii0X0X() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    public static /* synthetic */ CopyOnWriteArrayList IiI10X() {
        return XO0X10iO();
    }

    public static /* synthetic */ SportDataDao O00() {
        return Ii0X0X();
    }

    public static final /* synthetic */ void O10IXXX0X(XO0O10 r0) {
        r0.X11I();
    }

    public static /* synthetic */ Unit OIX0iXi(Ref.IntRef r0, OXO1 r1) {
        return X100O(r0, r1);
    }

    public static /* synthetic */ void OIi0(Function1 r0) {
        IXOIIIO(r0);
    }

    public static /* synthetic */ boolean OX(XO0O10 r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L9;
        if (I1XOi1.getMMode() != 97) goto L7;
        r1 = true;
        goto L9
    L7:
        r1 = false;
    L9:
        return r0.OII(r1);
    }

    public static /* synthetic */ LocationDao OXO1() {
        return i11I();
    }

    public static /* synthetic */ void Oi(XO0O10 r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.iiIOiX(r1);
    }

    public static final Unit OiIIX101O(Location r1, OXO1 r2) {
        Intrinsics.X0O(r2, "it");
        r2.OIi0(r1);
        return Unit.OXO1;
    }

    public static final WorkoutIndexDao X00Xi1X() {
        return MyDb.INSTANCE.getMDatabase().workoutIndexDao();
    }

    public static /* synthetic */ void X01IiOiIi(XO0O10 r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.iOOX010X(r1);
    }

    public static final /* synthetic */ boolean X0O(XO0O10 r0) {
        return r0.XOX0O0();
    }

    public static final Unit X100O(Ref.IntRef r1, OXO1 r2) {
        Intrinsics.X0O(r2, "it");
        r2.iO(r1.element);
        return Unit.OXO1;
    }

    public static final Unit X1OI(OXO1 r1) {
        Intrinsics.X0O(r1, "it");
        r1.IO(I1XOi1);
        return Unit.OXO1;
    }

    public static final /* synthetic */ AppUser X1ii() {
        return IIX1OXO;
    }

    public static /* synthetic */ Unit XIi00iiXO(Location r0, OXO1 r1) {
        return OiIIX101O(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(OXO1 r0) {
        return X1OI(r0);
    }

    public static final CopyOnWriteArrayList XO0X10iO() {
        return new CopyOnWriteArrayList();
    }

    public static /* synthetic */ WorkoutIndexDao XOO0ii0() {
        return X00Xi1X();
    }

    public static /* synthetic */ void XOXiX0(XO0O10 r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.XOIX(r1);
    }

    public static final Unit XX00i10X(WorkoutIndex r0, boolean r1) {
        if (r1 == true) goto L5;
        OXO1.Ii1iii0().insert(r0);
    L5:
        return Unit.OXO1;
    }

    public static final /* synthetic */ int XXI() {
        return X1ii;
    }

    public static final WorkoutDao XXiIiX10() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final /* synthetic */ void XiOIO(int r0) {
        X1ii = r0;
    }

    public static final iO i0X000X0O() {
        return new iO();
    }

    public static /* synthetic */ void i100IXOX(XO0O10 r6, int r7, boolean r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        r8 = true;
    L5:
        boolean r2 = r8;
        if ((r12 & 4) == 0) goto L8;
        int r3 = 0;
    L10:
        if ((r12 & 8) == 0) goto L12;
        int r4 = 0;
    L14:
        if ((r12 & 16) == 0) goto L17;
        int r5 = 0;
    L18:
        r6.iIi1(r7, r2, r3, r4, r5);
        return;
    L17:
        r5 = r11;
        goto L18
    L12:
        r4 = r10;
        goto L14
    L8:
        r3 = r9;
        goto L10
    }

    public static final LocationDao i11I() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    public static final /* synthetic */ void iIiiO(XO0O10 r0) {
        r0.iIX0i();
    }

    public static /* synthetic */ iO iO() {
        return i0X000X0O();
    }

    public final void I1() {
        i1O0OXO1O.OXO1.OXO1("SportManager destroy");
        StepsManager r3 = null;
        if (iOiXi11II() == false) goto L6;
        XOXiX0(this, false, 1, null);
    L6:
        if (OIi0 == 4) goto L8;
        X01IiOiIi(this, false, 1, null);
    L8:
        StepsManager r0 = I0IIOi;
        if (r0 != null) goto L11;
        Intrinsics.XXO("mStepsManager");
    L12:
        r3.O10IXXX0X();
        BleConnector.INSTANCE.removeHandleCallback(iOO1ii1());
        return;
    L11:
        r3 = r0;
        goto L12
    }

    public final float II1Xi0() {
        return o65.OXO1.XO0O10(I1XOi1.getMDistance(), I1XOi1.getMDuration());
    }

    public final void IO0II0i() {
        int r0 = mc0.i100IXOX(OIOIXX1.OXO1.OXO1(I1XOi1.getMMode(), IIX1OXO.getWeight(), IIX1OXO.getGender(), O0X11OiO.OXO1(IIX1OXO.getBirthday())));
        if (r0 <= 0) goto L6;
        I1XOi1.setMCalorie(r0);
        return;
    }

    public final void IO0iXO0O() {
        q62 r0 = q62.OXO1;
        if (r0.XO11XXOi() == false) goto L5;
        return;
    L5:
        if ((I1XOi1.getMDuration() % 60) == 0) goto L7;
        OX.add(SportData.copy$default(I1XOi1, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null));
    L7:
        iX1O1().insert(OII);
        iIXi1iiXI().insert(OX);
        if (r0.XOIO0() == true) goto L49;
        WorkoutDao r1 = iXiiiO();
        Workout r2 = new Workout(0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -1, -1, -1, -1, Integer.MAX_VALUE, null);
        r2.setMSource(1);
        r2.setMStart(IO);
        r2.setMEnd(OIX0iXi);
        String r3 = TimeUtils.millis2String(r2.getMStart(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r3, "millis2String(...)");
        r2.setMLocalTime(r3);
        r2.setMDuration(I1XOi1.getMDuration());
        r2.setMAltitude(I1XOi1.getMAltitude());
        r2.setMAirPressure(I1XOi1.getMAirPressure());
        r2.setMSpm(I1XOi1.getMSpm());
        r2.setMMode(I1XOi1.getMMode());
        r2.setMStep(I1XOi1.getMStep());
        r2.setMDistance(I1XOi1.getMDistance());
        r2.setMCalorie(I1XOi1.getMCalorie() * 1000);
        r2.setMSpeed(I1XOi1.getMSpeed() * 1000);
        r2.setMPace(I1XOi1.getMPace());
        Iterator<T> r4 = XiOIii1.iterator();
    L11:
        if (r4.hasNext() == false) goto L19;
        BleHeartRate r5 = (BleHeartRate) r4.next();
        r2.setMAvgBpm(r2.getMAvgBpm() + r5.getMBpm());
        if (r5.getMBpm() <= r2.getMMaxBpm()) goto L16;
        r2.setMMaxBpm(r5.getMBpm());
    L16:
        if (r5.getMBpm() >= r2.getMMinBpm()) goto L11;
        r2.setMMinBpm(r5.getMBpm());
        goto L11
    L19:
        if (XiOIii1.isEmpty() == true) goto L21;
        r2.setMAvgBpm(r2.getMAvgBpm() / XiOIii1.size());
    L21:
        Iterator<T> r6 = OX.iterator();
    L23:
        if (r6.hasNext() == false) goto L36;
        SportData r7 = (SportData) r6.next();
        if (r7.getMSpm() <= r2.getMMaxSpm()) goto L28;
        r2.setMMaxSpm(r7.getMSpm());
    L28:
        if (r7.getMSpm() >= r2.getMMinSpm()) goto L31;
        r2.setMMinSpm(r7.getMSpm());
    L31:
        if (r7.getMPace() <= r2.getMMaxPace()) goto L34;
        r2.setMMaxPace(r7.getMPace());
    L34:
        if (r7.getMPace() >= r2.getMMinPace()) goto L23;
        r2.setMMinPace(r7.getMPace());
        goto L23
    L36:
        r2.setMGoalDistance(I1);
        r2.setMGoalTime(iOOX010X);
        r2.setMGoalCalorie(X01IiOiIi);
        Unit r8 = Unit.OXO1;
        final WorkoutIndex r9 = new WorkoutIndex(0, 2, r2.getMEnd(), r2.getMMode(), 0, 17, null);
        Application r10 = Utils.getApp();
        Intrinsics.O10IXXX0X(r10, "getApp(...)");
        XXI0Xi.XOO0ii0(r10, r9, new v05(r9));
        long r11 = r1.insert(CollectionsKt__CollectionsKt.Ii1iii0(new Workout[]{r2}))[0];
        I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
        I01XX0.OXO1(I01XX0.Oi, Integer.valueOf((int) r11));
        i1O0OXO1O.OXO1.OXO1("SportManager save " + r11);
        return;
    }

    public final void IX0IXOi(int r1) {
        X0O = r1;
    }

    public final void IX1XiI(long r1) {
        OIX0iXi = r1;
    }

    public final void IXI() {
        if (q62.OXO1.X0OXOI() == false) goto L7;
        if (a15.iO(I1XOi1.getMMode()) == true) goto L7;
        return;
    L7:
        if (I1XOi1.getMMode() == 10) goto L11;
        I1XOi1.setMCalorie(o65.OXO1.I0IIOi(IIX1OXO.getGender(), IIX1OXO.getWeight(), I1XOi1.getMStep()));
        return;
    }

    public final int IXXOO() {
        return iO;
    }

    @sf5(tag = b01.XiOIO)
    public final void Ii0i(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1("onLocationWhere");
        II1Xi0 = ns.XIi00iiXO(new O00(), false, 2, null);
    }

    public final WorkoutIndexDao Ii1iii0() {
        return (WorkoutIndexDao) XX0.getValue();
    }

    public final void IiiXiI0I() {
        if (q62.OXO1.X0OXOI() == false) goto L9;
        if (a15.iO(I1XOi1.getMMode()) == true) goto L9;
        IO0II0i();
        return;
    L9:
        if (I1XOi1.getMMode() != 10) goto L12;
        I1XOi1.setMCalorie(o65.OXO1.OXO1(IIX1OXO.getWeight(), I1XOi1.getMDistance()));
        return;
    }

    public final int O001I() {
        return OIi0;
    }

    public final void O0O(double r1) {
        O10IXXX0X = r1;
    }

    public final void O0O0X0iOi(@aa1 CustomLocation r11) {
        Intrinsics.X0O(r11, "location");
        if (BleCache.INSTANCE.getMAGpsType() == 0) goto L5;
        return;
    L5:
        if ((I1XOi1.getMDuration() % 20) != 0) goto L9;
        int r0 = mc0.iIi1(r11.OXO1());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.REQUEST_LOCATION, BleKeyFlag.CREATE, new BleLocationReply(r11.I0IIOi(), Float.parseFloat(cp5.X1IX(X1ii / 1000.0f, false, 2, null)), r0), false, false, 24, null);
        i1O0OXO1O.OXO1.OXO1("SportManager sendLocation -> mSpeed=" + r11.I0IIOi() + ", mTotalDistance=" + X1ii + ", altitude=" + r0);
        return;
    }

    public final long O1O() {
        return OIX0iXi;
    }

    public final boolean OII(boolean r7) {
        i1O0OXO1O.OXO1.OXO1("canSave " + I1XOi1.getMDuration() + "  " + I1XOi1.getMStep() + "  " + I1XOi1.getMCalorie());
        if (I1XOi1.getMDuration() >= 120) goto L5;
        return false;
    L5:
        if (r7 == false) goto L7;
        return true;
    L7:
        if (q62.OXO1.O1XXXX(I1XOi1.getMMode()) == false) goto L12;
        if (I1XOi1.getMStep() >= 100) goto L16;
        return false;
    L16:
        return true;
    L12:
        if (I1XOi1.getMCalorie() >= 4) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean OO() {
        return IXXOO;
    }

    public final boolean OX110i() {
        return i010I;
    }

    public final void X00O0(boolean r1) {
        IXXOO = r1;
    }

    public final boolean X00XIX1() {
        return iX;
    }

    @aa1
    public final SportData X0i1O() {
        return I1XOi1;
    }

    public final void X0iO(long r1) {
        IO = r1;
    }

    public final void X1(final Function1<? super OXO1, Unit> r3) {
        XOO0ii0.post(new l05(r3));
    }

    public final void X111IO(boolean r1) {
        iX = r1;
    }

    public final void X11I() {
        final Ref.IntRef r0 = new Ref.IntRef();
        r0.element = -1;
        if (I1 == 0) goto L8;
        if (I1XOi1.getMDistance() < I1) goto L8;
        r0.element = XIi00iiXO;
    L8:
        if (iOOX010X == 0) goto L13;
        if (I1XOi1.getMDuration() < iOOX010X) goto L13;
        r0.element = iO;
    L13:
        if (X01IiOiIi == 0) goto L18;
        if (I1XOi1.getMCalorie() < X01IiOiIi) goto L18;
        r0.element = XO0O10;
    L18:
        if (r0.element != (-1)) goto L20;
        return;
    L20:
        if (i010I == true) goto L24;
        i010I = true;
        X1(new m05(r0));
        return;
    }

    @aa1
    public final List<Location> X11iII1O1() {
        return OII;
    }

    public final CopyOnWriteArrayList<OXO1> X1IX() {
        return (CopyOnWriteArrayList) IiI10X.getValue();
    }

    public final void XOIX(boolean r4) {
        i1O0OXO1O.OXO1.OXO1("SportManager pause " + r4 + " ");
        OIi0 = 3;
        StepsManager r0 = I0IIOi;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mStepsManager");
        r0 = null;
    L5:
        r0.I1XOi1();
        iI0I(r4);
    }

    public final void XOO0XOOii(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, "onSportListener");
        X1IX().remove(r2);
    }

    public final boolean XOX0O0() {
        if (BleCache.INSTANCE.getMAGpsType() == 0) goto L5;
        return false;
    L5:
        if (q62.OXO1.XO11XXOi() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void XX0(@aa1 final Location r5) {
        Intrinsics.X0O(r5, "location");
        if (q62.OXO1.XO11XXOi() == false) goto L5;
    L14:
        i1O0OXO1O.OXO1.OXO1("SportManager addLocation -> " + r5);
        OII.add(r5);
        X1(new u05(r5));
        return;
    L5:
        if (OII.isEmpty() == false) goto L7;
        I1XOi1.setMDistance(0);
    L13:
        I1XOi1.setMAltitude(r5.getMAltitude());
        goto L14
    L7:
        if (r5.getMActivityMode() == 2) goto L9;
        double r0 = O10IXXX0X + o65.OXO1.IiI10X((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII), r5);
        O10IXXX0X = r0;
        I1XOi1.setMDistance((int) r0);
        goto L13
    L9:
        if (r5.getMActivityMode() == ((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII)).getMActivityMode()) goto L13;
        double r1 = O10IXXX0X + o65.OXO1.IiI10X((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII), r5);
        O10IXXX0X = r1;
        I1XOi1.setMDistance((int) r1);
        goto L13
    }

    public final void XX1Oi(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        i1O0OXO1O.OXO1.OXO1("SportManager init");
        I0IIOi = new StepsManager(r3, new XIi00iiXO());
        BleConnector.INSTANCE.removeHandleCallback(iOO1ii1());     // Catch: Exception -> L5
    L7:
        BleConnector.INSTANCE.addHandleCallback(iOO1ii1());
        Ii0i(new Object());
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }

    @aa1
    public final List<BleHeartRate> XXIIO1i11() {
        return XiOIii1;
    }

    public final long XXO() {
        return IO;
    }

    public final double XXX11i() {
        return O10IXXX0X;
    }

    public final void XXiO0i(@aa1 List<BleHeartRate> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        XiOIii1 = r2;
    }

    public final void Xi1i0XOX0(@aa1 SportData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        I1XOi1 = r2;
    }

    public final void XiOIii1(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, "onSportListener");
        X1IX().add(r2);
    }

    public final void Xii11I(int r1) {
        OIi0 = r1;
    }

    public final int i010I() {
        return XO0O10;
    }

    public final int iI() {
        return X0O;
    }

    public final void iI0I(boolean r9) {
        if (r9 == false) goto L9;
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isAvailable() == true) goto L6;
        return;
    L6:
        if (q62.OXO1.O0i0() == false) goto L11;
        BaseBleConnector.sendObject$default(r0, BleKey.APP_SPORT_STATE, BleKeyFlag.UPDATE, new BleAppSportState(I1XOi1.getMMode(), OIi0), false, false, 24, null);
        return;
    L11:
        return;
    }

    public final void iIX0i() {
        I0iXXO++;
        if (OIi0 != 3) goto L6;
        XXI++;
    L6:
        if (iOiXi11II() == false) goto L26;
        I1XOi1.setMTime(System.currentTimeMillis());
        SportData r0 = I1XOi1;
        String r1 = TimeUtils.millis2String(r0.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r1, "millis2String(...)");
        r0.setMLocalTime(r1);
        I1XOi1.setMDuration(I0iXXO - XXI);
        SportData r2 = I1XOi1;
        o65 r3 = o65.OXO1;
        r2.setMSpm(r3.IO(I1XOi1.getMStep(), I1XOi1.getMDuration()));
        SportData r4 = I1XOi1;
        r4.setMPace(r3.XIi00iiXO(r4.getMDuration(), I1XOi1.getMDistance()));
        SportData r5 = I1XOi1;
        if (i72.OXO1.XXI0XOIX() == false) goto L10;
        int r6 = (int) II1Xi0();
    L11:
        r5.setMSpeed(r6);
        IiiXiI0I();
        X1(new n05());
        if ((I1XOi1.getMDuration() % 60) != 0) goto L14;
        OX.add(SportData.copy$default(I1XOi1, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null));
    L14:
        BleConnector r7 = BleConnector.INSTANCE;
        if (r7.isAvailable() == true) goto L17;
    L24:
        X11I();
        goto L26
    L17:
        if (q62.OXO1.O0i0() == false) goto L24;
        BleKey r8 = BleKey.APP_SPORT_DATA;
        BleKeyFlag r9 = BleKeyFlag.UPDATE;
        int r10 = I1XOi1.getMStep();
        int r11 = I1XOi1.getMDistance();
        if (I1XOi1.getMMode() != 97) goto L22;
        int r12 = 0;
    L23:
        BaseBleConnector.sendObject$default(r7, r8, r9, new BleAppSportData(r10, r11, r12, I1XOi1.getMDuration(), I1XOi1.getMSpm(), I1XOi1.getMAltitude(), I1XOi1.getMAirPressure(), I1XOi1.getMPace(), I1XOi1.getMSpeed(), I1XOi1.getMMode(), 0, 1024, null), false, false, 24, null);
        goto L24
    L22:
        r12 = I1XOi1.getMCalorie();
        goto L23
    L10:
        r6 = r3.iO(I1XOi1.getMDistance(), I1XOi1.getMDuration());
    L26:
        LogUtils.d(new Object[]{"SportManager sportData -> isSupportAppSport = " + q62.OXO1.O0i0() + "  BleConnector.isAvailable() = " + BleConnector.INSTANCE.isAvailable() + " state:" + OIi0 + ", t:" + ((System.currentTimeMillis() - IO) / ((long) 1000)) + ", mTotalTime:" + I0iXXO + ", mPauseTime:" + XXI + ", " + I1XOi1 + " "});
    }

    public final SportDataDao iIXi1iiXI() {
        return (SportDataDao) OiIIX101O.getValue();
    }

    public final void iIi1(int r39, boolean r40, int r41, int r42, int r43) {
        i1O0OXO1O.OXO1.OXO1("SportManager start " + r39 + " " + r40 + " " + r41 + " " + r42 + " " + r43 + " " + iX);
        if (iOiXi11II() == true) goto L21;
        SPUtils r4 = a01.OXO1.IiI10X();
        Object r8 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r5 = new Gson().fromJson(r4.getString(AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L9;
        r8 = r5;
    L9:
        IIX1OXO = (AppUser) r8;
        OII.clear();
        XiOIii1.clear();
        OX.clear();
        com.sma.smartv3.location.iO.OXO1.XO0O10(0.0f);
        O10IXXX0X = 0.0d;
        I0iXXO = 0;
        XXI = 0;
        OIOIXX1.OXO1.O00();
        I1 = r41;
        iOOX010X = r42;
        X01IiOiIi = r43;
        I1XOi1 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, r39, 0, 0, 28671, null);
        OIi0 = 1;
        IO = System.currentTimeMillis();
        OIX0iXi = System.currentTimeMillis();
        i010I = false;
        X1ii = 0;
        X0O = 0;
        iI0I(r40);
        q62 r0 = q62.OXO1;
        if (r0.XIXO0iiO(I1XOi1.getMMode()) == false) goto L15;
        ms r2 = II1Xi0;
        if (r2 == null) goto L15;
        r2.IiI10X(R.string.get_your_location, false);
    L15:
        if (r0.XO11XXOi() == true) goto L22;
        Handler r1 = XOO0ii0;
        RunnableC0574XO0O10 r3 = O1O;
        r1.removeCallbacks(r3);
        r1.postDelayed(r3, 1000);
        StepsManager r6 = I0IIOi;
        if (r6 != null) goto L19;
        Intrinsics.XXO("mStepsManager");
        r6 = null;
    L19:
        r6.XiOIO();
        return;
    L22:
        return;
    }

    public final void iOI(boolean r1) {
        i010I = r1;
    }

    public final iO iOO1ii1() {
        return (iO) iOO1ii1.getValue();
    }

    public final void iOOX010X(boolean r4) {
        i1O0OXO1O.OXO1.OXO1("SportManager end " + r4 + " ");
        OIi0 = 4;
        StepsManager r1 = I0IIOi;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mStepsManager");
        r1 = null;
    L5:
        r1.X0O();
        OIX0iXi = System.currentTimeMillis();
        XOO0ii0.removeCallbacks(O1O);
        iI0I(r4);
        if (q62.OXO1.XIXO0iiO(I1XOi1.getMMode()) == false) goto L11;
        ms r5 = II1Xi0;
        if (r5 == null) goto L11;
        r5.I0IIOi();
    L11:
        if (OII.isEmpty() == false) goto L13;
        return;
    L13:
        if (OII.size() <= 1) goto L17;
        ((Location) CollectionsKt___CollectionsKt.Xi1XO00(OII)).setMActivityMode(4);
        return;
    }

    public final boolean iOiXi11II() {
        int r0 = OIi0;
        if (r0 != 1) goto L5;
    L9:
        return true;
    L5:
        if (r0 == 2) goto L9;
        return false;
    }

    public final int iX() {
        return XIi00iiXO;
    }

    public final LocationDao iX1O1() {
        return (LocationDao) iIiiO.getValue();
    }

    public final void iXi(@aa1 List<Location> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        OII = r2;
    }

    @aa1
    public final List<SportData> iXiX011() {
        return OX;
    }

    public final WorkoutDao iXiiiO() {
        return (WorkoutDao) XiOIO.getValue();
    }

    public final void iiIOiX(boolean r4) {
        i1O0OXO1O.OXO1.OXO1("SportManager resume " + r4 + " ");
        OIi0 = 2;
        StepsManager r0 = I0IIOi;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mStepsManager");
        r0 = null;
    L5:
        r0.IIX1OXO();
        iI0I(r4);
    }

    public final void iii0(@aa1 List<SportData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        OX = r2;
    }

    public final float iiiO() {
        return com.sma.smartv3.location.iO.OXO1.OXO1();
    }
}
