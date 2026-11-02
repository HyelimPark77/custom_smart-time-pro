package com.sma.smartv3.biz.fitness_site.hyky;

import android.content.Context;
import androidx.compose.p554ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.rc2;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.biz.fitness_site.hyky.HykyUtils;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.SportDataDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,606:1\n1878#2,3:607\n1573#2:610\n1604#2,4:611\n1869#2,2:615\n1573#2:617\n1604#2,4:618\n1869#2,2:622\n1573#2:624\n1604#2,4:625\n1869#2:629\n1869#2,2:630\n1870#2:632\n*S KotlinDebug\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n*L\n155#1:607,3\n192#1:610\n192#1:611,4\n350#1:615,2\n360#1:617\n360#1:618,4\n432#1:622,2\n443#1:624\n443#1:625,4\n497#1:629\n518#1:630,2\n497#1:632\n*E\n"})
public final class HykyUtils {

    @aa1
    public static final HykyUtils INSTANCE = new HykyUtils();

    @aa1
    private static final Lazy mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1X11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyUtils.mLocationDao_delegate$lambda$0();
        }
    });

    @aa1
    private static final Lazy mHeartRateDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XIIXII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyUtils.mHeartRateDao_delegate$lambda$0();
        }
    });

    @aa1
    private static final Lazy mSportDataDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0iIX10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyUtils.mSportDataDao_delegate$lambda$0();
        }
    });

    @aa1
    private static final Lazy mActivityDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1X0OiOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyUtils.mActivityDao_delegate$lambda$0();
        }
    });

    private HykyUtils() {
    }

    private final float getAvg(float f, float f2, float f3) {
        float f4 = f > 0.0f ? f : 0.0f;
        if (rc2.I0IIOi(1.0f, f).contains(Float.valueOf(f3))) {
            return f3;
        }
        return (f2 <= 0.0f || f >= f2) ? f4 : f2;
    }

    public static /* synthetic */ String getDeviceID$default(HykyUtils hykyUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hykyUtils.getDeviceMac(false);
        }
        return hykyUtils.getDeviceID(str);
    }

    public static /* synthetic */ String getDeviceMac$default(HykyUtils hykyUtils, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return hykyUtils.getDeviceMac(z);
    }

    private final ActivityDao getMActivityDao() {
        return (ActivityDao) mActivityDao$delegate.getValue();
    }

    private final HeartRateDao getMHeartRateDao() {
        return (HeartRateDao) mHeartRateDao$delegate.getValue();
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) mLocationDao$delegate.getValue();
    }

    private final SportDataDao getMSportDataDao() {
        return (SportDataDao) mSportDataDao$delegate.getValue();
    }

    private final float getRandom(float f, float f2) {
        if (f2 != 0.0f && f != 0.0f && f2 < 10000.0f) {
            float f3 = (f2 + f) / 2;
            float f4 = (f2 - f) / 3;
            try {
                float f5 = 1;
                return Random.Default.nextInt((int) ((f3 - f4) - f5), (int) (f3 + f4 + f5));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0.0f;
    }

    private final List<SportData> getSportDataList(Workout workout, List<Location> list, List<Activity> list2) {
        ArrayList arrayList = new ArrayList();
        Object objIIII0iI = !list2.isEmpty() ? CollectionsKt___CollectionsKt.IIII0iI(list2) : null;
        long mStart = workout.getMStart();
        long j = 60000;
        long jXO0O10 = ProgressionUtilKt.XO0O10(mStart, workout.getMEnd() + j, 60000L);
        if (mStart <= jXO0O10) {
            int i = 0;
            while (true) {
                for (Activity activity : list2) {
                    long j2 = 1 + mStart;
                    long j3 = mStart + j;
                    long mTime = activity.getMTime();
                    if (j2 > mTime || mTime > j3) {
                        mStart = mStart;
                        jXO0O10 = jXO0O10;
                    } else {
                        if (i != 0) {
                            int mStep = activity.getMStep();
                            Intrinsics.XXI(objIIII0iI);
                            Activity activity2 = (Activity) objIIII0iI;
                            int mStep2 = mStep - activity2.getMStep();
                            int mTime2 = ((int) (activity.getMTime() - activity2.getMTime())) / 1000;
                            int mDistance = (activity.getMDistance() - activity2.getMDistance()) / 10000;
                            SportData sportData = new SportData(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
                            sportData.setMStep(mStep2);
                            sportData.setMTime(mStart);
                            sportData.setMDistance(mDistance);
                            String strMillis2String = TimeUtils.millis2String(activity.getMTime(), O0X11OiO.XO0O10());
                            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                            sportData.setMLocalTime(strMillis2String);
                            sportData.setMDuration(mTime2);
                            o65 o65Var = o65.OXO1;
                            sportData.setMSpm(o65Var.m2748IO(sportData.getMStep(), sportData.getMDuration()));
                            sportData.setMPace(o65Var.XIi00iiXO(sportData.getMDuration(), sportData.getMDistance()));
                            sportData.setMSpeed(o65Var.m2749iO(sportData.getMDistance(), sportData.getMDuration()));
                            arrayList.add(sportData);
                            for (Location location : list) {
                                long mTime3 = location.getMTime();
                                if (j2 <= mTime3 && mTime3 <= j3) {
                                    sportData.setMAltitude(location.getMAltitude());
                                }
                            }
                        }
                        i++;
                        objIIII0iI = activity;
                    }
                    mStart = mStart;
                    jXO0O10 = jXO0O10;
                }
                long j4 = mStart;
                long j5 = jXO0O10;
                if (j4 == j5) {
                    break;
                }
                mStart = 60000 + j4;
                jXO0O10 = j5;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityDao mActivityDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportDataDao mSportDataDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    @aa1
    public final List<Integer> analyseSleepToStatus(@aa1 List<BleSleep> analyseSleep) {
        int i;
        Intrinsics.X0O(analyseSleep, "analyseSleep");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < analyseSleep.size() - 1) {
            BleSleep bleSleep = analyseSleep.get(i2);
            int mTime = i2 == 0 ? bleSleep.getMTime() / 60 : (bleSleep.getMTime() / 60) + 1;
            i2++;
            int mTime2 = analyseSleep.get(i2).getMTime() / 60;
            if (mTime <= mTime2) {
                while (true) {
                    int mMode = bleSleep.getMMode();
                    if (mMode != 1) {
                        i = 2;
                        if (mMode != 2) {
                            i = (mMode == 3 || mMode != 9) ? 0 : 1;
                        }
                    } else {
                        i = 4;
                    }
                    arrayList.add(Integer.valueOf(i));
                    if (mTime != mTime2) {
                        mTime++;
                    }
                }
            }
        }
        return arrayList;
    }

    @aa1
    public final String dateFormatToHyky(@aa1 String date) {
        Intrinsics.X0O(date, "date");
        return oe5.IXO0OOi(date, "/", HelpFormatter.DEFAULT_OPT_PREFIX, false, 4, null);
    }

    @tb1
    public final GetSNCodeHYKY.Response getDeviceCode() {
        return HykyManager.Companion.getInstance().getMDeviceCode();
    }

    @tb1
    public final String getDeviceID(@aa1 String deviceMac) {
        Intrinsics.X0O(deviceMac, "deviceMac");
        if (deviceMac.length() == 0) {
            return null;
        }
        return "HEALTH-592044-" + deviceMac;
    }

    @aa1
    public final String getDeviceMac(boolean z) {
        return z ? BleCache.INSTANCE.getMBleAddress() : oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
    }

    @tb1
    public final UploadSportDataHYKY.SportData getHrData(@aa1 Workout workout, @aa1 UploadSportDataHYKY.SportData sportData) {
        Intrinsics.X0O(workout, "workout");
        Intrinsics.X0O(sportData, "sportData");
        ArrayList arrayList = new ArrayList();
        try {
            List<HeartRate> heartRates = getMHeartRateDao().getHeartRates(workout.getMStart(), workout.getMEnd());
            o65 o65Var = o65.OXO1;
            long jOIX0iXi = o65Var.OIX0iXi(workout.getMStart());
            long jOIX0iXi2 = ((long) 60000) + o65Var.OIX0iXi(workout.getMEnd());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jXO0O10 = ProgressionUtilKt.XO0O10(jOIX0iXi, jOIX0iXi2, 60000L);
            if (jOIX0iXi <= jXO0O10) {
                while (true) {
                    linkedHashMap.put(Long.valueOf(jOIX0iXi), new nr0(0, 0, null, 4, null));
                    if (jOIX0iXi == jXO0O10) {
                        break;
                    }
                    jOIX0iXi += 60000;
                }
            }
            int i = 0;
            int i2 = 0;
            for (Object obj : heartRates) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                HeartRate heartRate = (HeartRate) obj;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    nr0 nr0Var = (nr0) entry.getValue();
                    if (o65.OXO1.OIX0iXi(heartRate.getMTime()) <= jLongValue) {
                        nr0Var.OIX0iXi(nr0Var.I0IIOi() + heartRate.getMBpm());
                        nr0Var.OIi0(nr0Var.IiI10X() + 1);
                        break;
                    }
                }
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            int i4 = 100;
            float f = 0.0f;
            int i5 = 0;
            while (it.hasNext()) {
                nr0 nr0Var2 = (nr0) ((Map.Entry) it.next()).getValue();
                if (nr0Var2.IiI10X() != 0 && nr0Var2.I0IIOi() != 0) {
                    try {
                        int avg = (int) getAvg(nr0Var2.I0IIOi() / nr0Var2.IiI10X(), workout.getMMinBpm(), workout.getMMaxBpm());
                        arrayList2.add(new Entry(f, avg));
                        if (i5 < avg) {
                            i5 = avg;
                        }
                        if (1 <= avg && avg < i4) {
                            i4 = avg;
                        }
                    } catch (Exception unused) {
                    }
                }
                f += 1.0f;
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList2, 10));
            for (Object obj2 : arrayList2) {
                int i6 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                arrayList3.add(new UploadSportDataHYKY.C15478Hr(i * 60, (int) ((Entry) obj2).O00()));
                i = i6;
            }
            arrayList.addAll(arrayList3);
        } catch (Exception unused2) {
        }
        sportData.setSportDataType(2);
        sportData.setSportOverView(null);
        sportData.setHrList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return sportData;
    }

    @tb1
    public final UploadSportDataHYKY.SportData getLocationData(@aa1 Workout workout, @aa1 UploadSportDataHYKY.SportData sportData) {
        Intrinsics.X0O(workout, "workout");
        Intrinsics.X0O(sportData, "sportData");
        ArrayList arrayList = new ArrayList();
        try {
            List<Location> location = getMLocationDao().getLocation(workout.getMStart(), workout.getMEnd());
            o65 o65Var = o65.OXO1;
            long jOIX0iXi = o65Var.OIX0iXi(workout.getMStart());
            long jOIX0iXi2 = ((long) 60000) + o65Var.OIX0iXi(workout.getMEnd());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jXO0O10 = ProgressionUtilKt.XO0O10(jOIX0iXi, jOIX0iXi2, 60000L);
            if (jOIX0iXi <= jXO0O10) {
                while (true) {
                    linkedHashMap.put(Long.valueOf(jOIX0iXi), new nr0(0, 0, null, 4, null));
                    if (jOIX0iXi == jXO0O10) {
                        break;
                    }
                    jOIX0iXi += 60000;
                }
            }
            for (Location location2 : location) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    nr0 nr0Var = (nr0) entry.getValue();
                    if (o65.OXO1.OIX0iXi(location2.getMTime()) <= jLongValue) {
                        nr0Var.OIX0iXi(nr0Var.I0IIOi() + location2.getMAltitude());
                        nr0Var.OIi0(nr0Var.IiI10X() + 1);
                        nr0Var.m2726IO(location2.getMLongitude() + I000IiI1O.C2156iO.XO0O10 + location2.getMLatitude() + I000IiI1O.C2156iO.XO0O10);
                        break;
                    }
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            int i = 0;
            float f = 0.0f;
            int i2 = 0;
            while (it.hasNext()) {
                nr0 nr0Var2 = (nr0) ((Map.Entry) it.next()).getValue();
                if (nr0Var2.IiI10X() != 0 && nr0Var2.I0IIOi() != 0) {
                    int iI0IIOi = nr0Var2.I0IIOi() / nr0Var2.IiI10X();
                    Object objXOO0ii0 = nr0Var2.XOO0ii0();
                    StringBuilder sb = new StringBuilder();
                    sb.append(objXOO0ii0);
                    sb.append(iI0IIOi);
                    arrayList.add(new UploadSportDataHYKY.Pos((int) (60 * f), sb.toString()));
                    if (i < iI0IIOi) {
                        i = iI0IIOi;
                    }
                    if (i2 == 0 || i2 > iI0IIOi) {
                        i2 = iI0IIOi;
                    }
                }
                f += 1.0f;
            }
        } catch (Exception unused) {
        }
        sportData.setSportDataType(3);
        sportData.setSportOverView(null);
        sportData.setPosType("BD09");
        sportData.setPosList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return sportData;
    }

    @tb1
    public final UploadSportDataHYKY.SportData getPaceData(@aa1 Workout workout, @aa1 UploadSportDataHYKY.SportData sportData) {
        Intrinsics.X0O(workout, "workout");
        Intrinsics.X0O(sportData, "sportData");
        ArrayList arrayList = new ArrayList();
        try {
            List<SportData> sportDataASC = getMSportDataDao().getSportDataASC(workout.getMStart(), workout.getMEnd());
            List<Location> location = getMLocationDao().getLocation(workout.getMStart(), workout.getMEnd());
            int i = 0;
            if (!location.isEmpty() && workout.getMMode() == 10) {
                sportDataASC = cp5.OII(location, 0, 2, null);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            o65 o65Var = o65.OXO1;
            long jOIX0iXi = o65Var.OIX0iXi(workout.getMStart());
            long jXO0O10 = ProgressionUtilKt.XO0O10(jOIX0iXi, ((long) 60000) + o65Var.OIX0iXi(workout.getMEnd()), 60000L);
            if (jOIX0iXi <= jXO0O10) {
                while (true) {
                    linkedHashMap.put(Long.valueOf(jOIX0iXi), new nr0(0, 0, null, 4, null));
                    if (jOIX0iXi == jXO0O10) {
                        break;
                    }
                    jOIX0iXi += 60000;
                }
            }
            float mMaxPace = workout.getMMaxPace();
            float mMinPace = workout.getMMinPace();
            ArrayList<Entry> arrayList2 = new ArrayList();
            float f = 0.0f;
            if (1.0f > mMaxPace || mMaxPace > 3000.0f) {
                mMaxPace = 0.0f;
            }
            if (1.0f > mMinPace || mMinPace > 3000.0f) {
                mMinPace = 0.0f;
            }
            boolean z = mMaxPace == 0.0f;
            boolean z2 = mMinPace == 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                float avg = getAvg(i < sportDataASC.size() + (-1) ? sportDataASC.get(i).getMPace() : f, mMinPace, mMaxPace);
                if (avg == f3 || avg == mMinPace || avg == mMaxPace) {
                    float random = getRandom(mMinPace, mMaxPace);
                    if (random != f) {
                        avg = random;
                    }
                }
                arrayList2.add(new Entry(f2, avg));
                f2 += 1.0f;
                i++;
                f = f;
                f3 = avg;
            }
            float f4 = f;
            if (z2) {
                mMinPace = 100.0f;
            }
            for (Entry entry2 : arrayList2) {
                if (z && entry2.O00() > mMaxPace) {
                    mMaxPace = entry2.O00();
                }
                if (z2 && entry2.O00() < mMinPace && entry2.O00() > f4) {
                    mMinPace = entry2.O00();
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList2, 10));
            int i2 = 0;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                arrayList3.add(new UploadSportDataHYKY.Pace(i2, (int) ((Entry) obj).O00()));
                i2 = i3;
            }
            arrayList.addAll(arrayList3);
        } catch (Exception unused) {
        }
        sportData.setSportDataType(5);
        sportData.setSportOverView(null);
        sportData.setPaceList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return sportData;
    }

    @aa1
    public final UploadSportDataHYKY.SportData getSportOverView(@aa1 Workout workout, @aa1 UploadSportDataHYKY.SportData sportData) {
        Intrinsics.X0O(workout, "workout");
        Intrinsics.X0O(sportData, "sportData");
        int mMode = workout.getMMode();
        if (mMode == 7) {
            sportData.setSportType(UploadSportDataHYKY.SportType.RUNNING.getValue());
            UploadSportDataHYKY.SportOverView sportOverView = sportData.getSportOverView();
            if (sportOverView != null) {
                sportOverView.setStepCount(Integer.valueOf(workout.getMStep()));
                sportOverView.setStepFreq(Integer.valueOf(workout.getMSpm()));
            }
        } else {
            if (mMode == 26) {
                sportData.setSportType(UploadSportDataHYKY.SportType.SKIPPING_ROPE.getValue());
                sportData.getSportOverView();
                return sportData;
            }
            switch (mMode) {
                case 10:
                    sportData.setSportType(UploadSportDataHYKY.SportType.CYCLING.getValue());
                    sportData.getSportOverView();
                    return sportData;
                case 11:
                    sportData.setSportType(UploadSportDataHYKY.SportType.SWIM.getValue());
                    sportData.getSportOverView();
                    return sportData;
                case 12:
                    sportData.setSportType(UploadSportDataHYKY.SportType.WALK.getValue());
                    UploadSportDataHYKY.SportOverView sportOverView2 = sportData.getSportOverView();
                    if (sportOverView2 != null) {
                        sportOverView2.setStepCount(Integer.valueOf(workout.getMStep()));
                        sportOverView2.setStepFreq(Integer.valueOf(workout.getMSpm()));
                        return sportData;
                    }
                    break;
                case 13:
                    sportData.setSportType(UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue());
                    sportData.getSportOverView();
                    return sportData;
                default:
                    sportData.setSportType(UploadSportDataHYKY.SportType.OTHER.getValue());
                    UploadSportDataHYKY.SportOverView sportOverView3 = sportData.getSportOverView();
                    if (sportOverView3 != null) {
                        Context applicationContext = Utils.getApp().getApplicationContext();
                        Intrinsics.O10IXXX0X(applicationContext, "getApplicationContext(...)");
                        SportRecordData sportRecordData = new SportRecordData();
                        sportRecordData.setMMode(workout.getMMode());
                        Unit unit = Unit.OXO1;
                        sportOverView3.setSportName(UtilsKt.XXO(SportRecordDataKt.getWorkoutName(applicationContext, sportRecordData)));
                        return sportData;
                    }
                    break;
            }
        }
        return sportData;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    @tb1
    public final UploadSportDataHYKY.SportData getStepFreqData(@aa1 Workout workout, @aa1 UploadSportDataHYKY.SportData sportData) {
        Intrinsics.X0O(workout, "workout");
        Intrinsics.X0O(sportData, "sportData");
        ArrayList arrayList = new ArrayList();
        try {
            List<SportData> sportDataASC = getMSportDataDao().getSportDataASC(workout.getMStart(), workout.getMEnd());
            if (sportDataASC.isEmpty()) {
                sportDataASC = getSportDataList(workout, getMLocationDao().getLocation(workout.getMStart(), workout.getMEnd()), getMActivityDao().getListASC(workout.getMStart(), workout.getMEnd()));
            }
            o65 o65Var = o65.OXO1;
            long jOIX0iXi = o65Var.OIX0iXi(workout.getMStart());
            long jOIX0iXi2 = ((long) 60000) + o65Var.OIX0iXi(workout.getMEnd());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jXO0O10 = ProgressionUtilKt.XO0O10(jOIX0iXi, jOIX0iXi2, 60000L);
            if (jOIX0iXi <= jXO0O10) {
                while (true) {
                    linkedHashMap.put(Long.valueOf(jOIX0iXi), new nr0(0, 0, null, 4, null));
                    if (jOIX0iXi == jXO0O10) {
                        break;
                    }
                    jOIX0iXi += 60000;
                }
            }
            float mMaxSpm = workout.getMMaxSpm();
            float mMinSpm = workout.getMMinSpm();
            ArrayList<Entry> arrayList2 = new ArrayList();
            float f = 0.0f;
            if (1.0f > mMaxSpm || mMaxSpm > 1000.0f) {
                mMaxSpm = 0.0f;
            }
            if (1.0f > mMinSpm || mMinSpm > 1000.0f) {
                mMinSpm = 0.0f;
            }
            int i = 0;
            boolean z = mMaxSpm == 0.0f;
            boolean z2 = mMinSpm == 0.0f;
            float f2 = 0.0f;
            float random = 0.0f;
            int i2 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                float f3 = f;
                float avg = getAvg(i2 < sportDataASC.size() + (-1) ? sportDataASC.get(i2).getMStep() : f3, mMinSpm, mMaxSpm);
                if (avg == random || avg == mMinSpm || avg == mMaxSpm) {
                    random = getRandom(mMinSpm, mMaxSpm);
                    if (random == f3) {
                        random = avg;
                    }
                } else {
                    random = avg;
                }
                arrayList2.add(new Entry(f2, random));
                f2 += 1.0f;
                i2++;
                f = f3;
            }
            float f4 = f;
            if (z2) {
                mMinSpm = 100.0f;
            }
            for (Entry entry2 : arrayList2) {
                entry2.O00();
                if (z && entry2.O00() > mMaxSpm) {
                    mMaxSpm = entry2.O00();
                }
                if (z2 && entry2.O00() < mMinSpm && entry2.O00() > f4) {
                    mMinSpm = entry2.O00();
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList2, 10));
            for (Object obj : arrayList2) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                arrayList3.add(new UploadSportDataHYKY.StepFreq(i * 60, (int) ((Entry) obj).O00()));
                i = i3;
            }
            arrayList.addAll(arrayList3);
        } catch (Exception unused) {
        }
        sportData.setSportDataType(4);
        sportData.setSportOverView(null);
        sportData.setStepFreqList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return sportData;
    }
}
