package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.ptmodel.PtStep;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n19#2:475\n15#2:476\n1869#3,2:477\n1011#3,2:479\n1878#3,3:481\n1878#3,3:484\n*S KotlinDebug\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n*L\n60#1:475\n60#1:476\n73#1:477,2\n168#1:479,2\n392#1:481,3\n436#1:484,3\n*E\n"})
public final class TodayHealthyDataKt {
    private static final void addDeepLengthData(int r21, List<Sleep> r22, List<TodayData> r23, int r24, Function1<? super Integer, Unit> r25, SleepAllDayData r26) {
        int r2 = 0;
        if (r21 == 0) goto L28;
        Iterator<T> r3 = r22.iterator();
        int r6 = 0;
        long r8 = 0;
        long r10 = 0;
    L6:
        if (r3.hasNext() == false) goto L26;
        Object r7 = r3.next();
        int r12 = r2 + 1;
        if (r2 >= 0) goto L10;
        CollectionsKt__CollectionsKt.XOX0O0();
    L10:
        Sleep r9 = (Sleep) r7;
        if (r9.getMMode() != 17) goto L16;
        if (r10 != 0) goto L16;
        r10 = r9.getMTime();
        r6 = r2;
    L25:
        r2 = r12;
    L16:
        if (r9.getMMode() != 34) goto L25;
        if (r10 == 0) goto L25;
        if (r8 != 0) goto L25;
        if ((r6 + 1) == r2) goto L24;
        r8 = r9.getMTime();
        goto L25
    L24:
        r10 = 0;
        goto L25
    L26:
        int r4 = r24 + r21;
        r23.add(new TodayData(r8, UtilsKt.XXO(R.string.night_sleep), "", (r4 / 60) + UtilsKt.XXO(R.string.h) + (r4 % 60) + UtilsKt.XXO(R.string.h_m), 0, "sleep", 0, null, r24, 0.0f, 720, null));
        r25.invoke(Integer.valueOf(r26.getTotal()));
        return;
    L28:
        r25.invoke(0);
    }

    public static final void addHealthyDataBloodOxy(@aa1 List<TodayData> r17, int r18, long r19, @aa1 String r21) {
        Intrinsics.X0O(r17, "list");
        Intrinsics.X0O(r21, "mExtraInfo");
        if (r18 < 92) goto L6;
        String r2 = UtilsKt.XXO(R.string.pressure_level_normal);
        int r3 = 2;
    L5:
        String r8 = r2;
        int r9 = r3;
        r17.add(new TodayData(r19, UtilsKt.XXO(R.string.blood_oxygen), r18 + "%", r8, r9, q62.IiOIO1OX, 0, r21, r18, 0.0f, 576, null));
        return;
    L6:
        r2 = UtilsKt.XXO(R.string.data_lower);
        r3 = 1;
        goto L5
    }

    public static /* synthetic */ void addHealthyDataBloodOxy$default(List r0, int r1, long r2, String r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = "";
    L5:
        addHealthyDataBloodOxy(r0, r1, r2, r4);
    }

    public static final void addHealthyDataBloodPressure(@aa1 List<TodayData> r18, int r19, int r20, long r21, @aa1 String r23) {
        Intrinsics.X0O(r18, "list");
        Intrinsics.X0O(r23, "mExtraInfo");
        if (r19 < 130) goto L7;
        String r3 = UtilsKt.XXO(R.string.lightness_high);
        int r4 = 3;
    L5:
        String r9 = r3;
        int r10 = r4;
        r18.add(new TodayData(r21, UtilsKt.XXO(R.string.blood_oxygen), UtilsKt.XXO(R.string.systolic_pressure) + CertificateUtil.DELIMITER + r19 + "\n" + UtilsKt.XXO(R.string.diastolic_pressure) + CertificateUtil.DELIMITER + r20, r9, r10, q62.OXOXXiI, 0, r23, r19, r20, 64, null));
        return;
    L7:
        if (r19 < 90) goto L9;
        r3 = UtilsKt.XXO(R.string.pressure_level_normal);
        r4 = 2;
        goto L5
    L9:
        r3 = UtilsKt.XXO(R.string.data_lower);
        r4 = 1;
        goto L5
    }

    public static /* synthetic */ void addHealthyDataBloodPressure$default(List r6, int r7, int r8, long r9, String r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L5;
        r11 = "";
    L5:
        addHealthyDataBloodPressure(r6, r7, r8, r9, r11);
    }

    public static final void addHealthyDataHeart(@aa1 List<TodayData> r17, int r18, long r19, @aa1 String r21) {
        Intrinsics.X0O(r17, "list");
        Intrinsics.X0O(r21, "mExtraInfo");
        if (r18 < 0) goto L7;
        if (r18 >= 61) goto L7;
        String r2 = UtilsKt.XXO(R.string.data_lower);
        int r3 = 1;
    L6:
        String r8 = r2;
        int r9 = r3;
        r17.add(new TodayData(r19, UtilsKt.XXO(R.string.heart_rate), r18 + UtilsKt.XXO(R.string.bpm), r8, r9, "heart_rate", 0, r21, r18, 0.0f, 576, null));
        return;
    L7:
        if (61 <= r18) goto L9;
    L11:
        r2 = UtilsKt.XXO(R.string.data_high);
        r3 = 3;
        goto L6
    L9:
        if (r18 >= 101) goto L11;
        r2 = UtilsKt.XXO(R.string.pressure_level_normal);
        r3 = 2;
        goto L6
    }

    public static /* synthetic */ void addHealthyDataHeart$default(List r0, int r1, long r2, String r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = "";
    L5:
        addHealthyDataHeart(r0, r1, r2, r4);
    }

    public static final void addHealthyDataPressure(@aa1 List<TodayData> r17, int r18, long r19, @aa1 String r21) {
        Intrinsics.X0O(r17, "list");
        Intrinsics.X0O(r21, "mExtraInfo");
        String r2 = UtilsKt.XXO(R.string.pressure_level_overstress);
        if (r18 >= 25) goto L7;
        r2 = UtilsKt.XXO(R.string.pressure_level_relax);
        int r3 = 2;
    L13:
        r17.add(new TodayData(r19, UtilsKt.XXO(R.string.pressure), String.valueOf(r18), r2, r3, q62.IIII0II, 0, r21, r18, 0.0f, 576, null));
        return;
    L7:
        if (r18 >= 50) goto L10;
        r2 = UtilsKt.XXO(R.string.pressure_level_normal);
        r3 = 1;
        goto L13
    L10:
        if (r18 >= 75) goto L12;
        r2 = UtilsKt.XXO(R.string.pressure_level_moderate_stress);
        r3 = 0;
        goto L13
    L12:
        r3 = 3;
        goto L13
    }

    public static /* synthetic */ void addHealthyDataPressure$default(List r0, int r1, long r2, String r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = "";
    L5:
        addHealthyDataPressure(r0, r1, r2, r4);
    }

    private static final void addPiecemealData(int r12, List<Sleep> r13, List<TodayData> r14) {
        if (q62.OXO1.IXi01O() == false) goto L35;
        if (r12 == 0) goto L36;
        Iterator<T> r15 = r13.iterator();
        int r0 = 0;
        int r3 = 0;
        long r4 = 0;
        long r6 = 0;
    L7:
        if (r15.hasNext() == false) goto L27;
        Object r8 = r15.next();
        int r9 = r0 + 1;
        if (r0 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        Sleep r10 = (Sleep) r8;
        if (r10.getMMode() != 17) goto L17;
        if (r4 != 0) goto L17;
        r4 = r10.getMTime();
        r3 = r0;
    L26:
        r0 = r9;
    L17:
        if (r10.getMMode() != 34) goto L22;
        if (r4 == 0) goto L22;
        r6 = r10.getMTime();
    L22:
        if ((r3 + 1) != r0) goto L26;
        if (r6 != 0) goto L26;
        r4 = 0;
        goto L26
    L27:
        addPiecemealTime(r4, r6, r14, r12);
        return;
    L36:
        return;
    }

    private static final void addPiecemealTime(long r18, long r20, List<TodayData> r22, int r23) {
        if (r18 != 0) goto L5;
        return;
    L5:
        if (r20 == 0) goto L9;
        r22.add(new TodayData(r20, UtilsKt.XXO(R.string.piecemeal), "", (r23 / 60) + UtilsKt.XXO(R.string.h) + (r23 % 60) + UtilsKt.XXO(R.string.h_m), 0, "sleep", 0, null, r23, r18, 208, null));
        return;
    }

    private static final void addWorkList(Workout r16, List<TodayData> r17, AppUser r18) {
        q62 r0 = q62.OXO1;
        if (q62.X0XI11I(r0, r16.getMMode(), false, 2, null) == false) goto L6;
        String r1 = cp5.X1ii(r16.getMDistance(), r18.getUnit(), false, 4, null) + UtilsKt.XXO(cp5.XX0(r18.getUnit())) + " " + (r16.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal);
    L5:
        String r6 = r1;
        r17.add(new TodayData(r16.getMEnd(), r0.i01OOiI(r16.getMMode()), r6, O0X11OiO.iXiX011(r16.getMDuration() * 1000), 0, "sportRecord", r16.getMId(), null, 0.0f, 0.0f, 896, null));
        return;
    L6:
        r1 = (r16.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal);
        goto L5
    }

    public static final void getBloodOxyDataHeart(@aa1 List<BloodOxygen> r7, @aa1 List<TodayData> r8) {
        Intrinsics.X0O(r7, "bloodOxygenList");
        Intrinsics.X0O(r8, "list");
        if (r7.isEmpty() == true) goto L6;
        BloodOxygen r9 = (BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(r7);
        addHealthyDataBloodOxy$default(r8, r9.getMValue(), r9.getMTime(), null, 8, null);
        return;
    }

    public static final void getBloodPressureDataHeart(@aa1 List<BloodPressure> r8, @aa1 List<TodayData> r9) {
        Intrinsics.X0O(r8, "bloodPressureList");
        Intrinsics.X0O(r9, "list");
        if (r8.isEmpty() == true) goto L6;
        BloodPressure r10 = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r8);
        addHealthyDataBloodPressure$default(r9, r10.getMSystolic(), r10.getMDiastolic(), r10.getMTime(), null, 16, null);
        return;
    }

    public static final void getHealthyDataHeart(@aa1 List<HeartRate> r7, @aa1 List<TodayData> r8) {
        Intrinsics.X0O(r7, "heartList");
        Intrinsics.X0O(r8, "list");
        if (r7.isEmpty() == true) goto L6;
        HeartRate r9 = (HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r7);
        addHealthyDataHeart$default(r8, r9.getMBpm(), r9.getMTime(), null, 8, null);
        return;
    }

    public static final void getHealthyDataPressure(@aa1 List<Pressure> r7, @aa1 List<TodayData> r8) {
        Intrinsics.X0O(r7, "pressureList");
        Intrinsics.X0O(r8, "list");
        if (r7.isEmpty() == true) goto L6;
        Pressure r9 = (Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r7);
        addHealthyDataPressure$default(r8, r9.getMValue(), r9.getMTime(), null, 8, null);
        return;
    }

    @aa1
    public static final List<TodayData> getItemHealthyData(boolean r36, @aa1 Function1<? super Integer, Unit> r37) {
        Intrinsics.X0O(r37, "callback");
        ArrayList r1 = new ArrayList();
        long[] r2 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SPUtils r3 = a01.OXO1.IiI10X();
        Object r6 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r6 = r4;
    L6:
        AppUser r7 = (AppUser) r6;
        MyDb r5 = MyDb.INSTANCE;
        getHealthyDataHeart(r5.getMDatabase().heartRateDao().getHeartRates(r2[0], r2[1]), r1);
        getBloodOxyDataHeart(r5.getMDatabase().bloodOxygenDao().getBloodOxygen(r2[0], r2[1]), r1);
        List r8 = WorkoutDao.getListDESC$default(r5.getMDatabase().workoutDao(), r2[0], r2[1], 0, 4, null);
        if (r8.isEmpty() == true) goto L12;
        Iterator r9 = r8.iterator();
    L10:
        if (r9.hasNext() == false) goto L12;
        addWorkList((Workout) r9.next(), r1, r7);
    L12:
        MyDb r10 = MyDb.INSTANCE;
        getHealthyDataPressure(r10.getMDatabase().pressureDao().getPressures(r2[0], r2[1]), r1);
        getSleepList(r10.getMDatabase().sleepDao().getSleeps(r2[0] - ((long) 28800000), r2[1]), r1, r2[0], r37);
        List<Hrv> r0 = r10.getMDatabase().hrvDao().getHrv(r2[0], r2[1]);
        if (r0.isEmpty() == true) goto L15;
        Hrv r11 = (Hrv) CollectionsKt___CollectionsKt.Xi1XO00(r0);
        r1.add(new TodayData(r11.getMTime(), UtilsKt.XXO(R.string.hrv), r11.getMValue() + UtilsKt.XXO(R.string.ms), null, 0, q62.XOX1, 0, null, r11.getMValue(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
    L15:
        List<BloodPressure> r12 = r10.getMDatabase().bloodPressureDao().getBloodPressures(r2[0], r2[1]);
        if (r12.isEmpty() == true) goto L31;
        BloodPressure r13 = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r12);
        if (r13.getMSystolic() < 140) goto L20;
    L29:
        String r15 = UtilsKt.XXO(R.string.data_high);
        int r16 = 3;
    L30:
        r1.add(new TodayData(r13.getMTime(), UtilsKt.XXO(R.string.blood_pressure), r13.getMSystolic() + "/" + r13.getMDiastolic(), r15, r16, q62.OXOXXiI, 0, null, r13.getMSystolic(), r13.getMDiastolic(), 192, null));
        goto L31
    L20:
        if (r13.getMDiastolic() >= 90) goto L29;
        if (r13.getMSystolic() < 90) goto L25;
    L28:
        r15 = UtilsKt.XXO(R.string.pressure_level_normal);
        r16 = 2;
        goto L30
    L25:
        if (r13.getMDiastolic() >= 60) goto L28;
        r15 = UtilsKt.XXO(R.string.data_lower);
        r16 = 1;
    L31:
        List<Temperature> r14 = r10.getMDatabase().temperatureDao().getListDesc(r2[0], r2[1]);
        if (r14.isEmpty() == true) goto L38;
        Temperature r17 = (Temperature) CollectionsKt___CollectionsKt.Xi1XO00(r14);
        float r18 = r17.getMTemperature() / 10.0f;
        if (cp5.II1Xi0(r7.getUnit()) != 1) goto L36;
        boolean r19 = true;
    L37:
        r1.add(new TodayData(r17.getMTime(), UtilsKt.XXO(R.string.temperature), String.valueOf(cp5.i010I(r18, r19)), null, 0, "temperature", 0, null, r17.getMTemperature(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
        goto L38
    L36:
        r19 = false;
    L38:
        List<BloodGlucose> r20 = r10.getMDatabase().bloodGlucoseDao().getListDesc(r2[0], r2[1]);
        if (r20.isEmpty() == true) goto L42;
        BloodGlucose r21 = (BloodGlucose) CollectionsKt___CollectionsKt.Xi1XO00(r20);
        r1.add(new TodayData(r21.getMTime(), UtilsKt.XXO(R.string.blood_glucose), String.valueOf(r21.getMValue()), null, 0, q62.Oi0X, 0, null, r21.getMValue(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
    L42:
        if (r1.size() <= 1) goto L44;
        XiX0OOXI0.XOXiX0(r1, new TodayHealthyDataKt$getItemHealthyData$$inlined$sortBy$1());
    L44:
        if (r36 == false) goto L46;
    L49:
        return r1;
    L46:
        if (r1.size() <= 3) goto L49;
        return CollectionsKt___CollectionsKt.OO0Oi10(CollectionsKt___CollectionsKt.IO0OOi(r1, 3));
    }

    public static /* synthetic */ List getItemHealthyData$default(boolean r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = false;
    L6:
        return getItemHealthyData(r0, r1);
    }

    private static final void getSleepList(List<Sleep> r11, List<TodayData> r12, long r13, Function1<? super Integer, Unit> r15) {
        if (r11.isEmpty() == true) goto L6;
        SleepAllDayData r10 = SleepAllDayDataParse.INSTANCE.filterData(r11, 100.0f, null, r13);
        addPiecemealData(r10.getStatus().get(8), r11, r12);
        addDeepLengthData(r10.getTotal(), r11, r12, 0, r15, r10);
        return;
    }

    public static /* synthetic */ void getSleepList$default(List r0, List r1, long r2, Function1 r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r2 = 0;
    L5:
        getSleepList(r0, r1, r2, r4);
    }
}
