package com.sma.smartv3.model;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1OOiOO1i;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSportRecordData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1074:1\n1021#2,2:1075\n1021#2,2:1077\n1021#2,2:1079\n1563#2:1081\n1634#2,3:1082\n*S KotlinDebug\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n*L\n171#1:1075,2\n222#1:1077,2\n264#1:1079,2\n1025#1:1081\n1025#1:1082,3\n*E\n"})
public final class SportRecordDataKt {
    public static final int ACTIVITY = 0;
    public static final int PHONE_SPORT = 2;
    public static final int WORKOUT = 1;

    public static final void deleteSportRecord(@aa1 SportRecordData r9) {
        Intrinsics.X0O(r9, "sportRecordData");
        LogUtils.d(new Object[]{"delete " + r9});
        if (r9.getMSource() != 0) goto L10;
        ActivityDao r3 = MyDb.INSTANCE.getMDatabase().activityDao();
        List<Activity> r10 = r3.getWorkoutListDESC(r9.getMStartTime(), r9.getMEndTime(), r9.getMMode());
        List<Activity> r0 = r10;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        Activity r5 = (Activity) r1.next();
        r5.setMIsSync(0);
        r5.setMIsDelete(1);
        r4.add(Unit.OXO1);
        goto L6
    L8:
        r3.update(r10);
        return;
    L10:
        WorkoutDao r2 = MyDb.INSTANCE.getMDatabase().workoutDao();
        Workout r11 = r2.getWorkout(r9.getMStartTime(), r9.getMEndTime());
        r11.setMIsSync(0);
        r11.setMIsDelete(1);
        r2.update(r11);
    }

    @aa1
    public static final ArrayList<SportRecordData> getActivityWorkoutList(@aa1 List<Activity> r12) {
        Intrinsics.X0O(r12, "workoutActivity");
        ArrayList<SportRecordData> r0 = new ArrayList();
        Iterator<Activity> r13 = r12.iterator();
    L3:
        int r4 = -1;
        long r5 = 0;
        long r7 = 0;
    L5:
        if (r13.hasNext() == false) goto L25;
        Activity r9 = r13.next();
        if (r4 >= 0) goto L10;
        if (r9.getMState() != 4) goto L5;
    L10:
        int r11 = r9.getMState();
        if (r11 == 0) goto L16;
        if (r11 != 4) goto L21;
        r4 = r9.getMMode();
        r5 = r9.getMTime();
    L21:
        if (r4 <= 0) goto L5;
        if (r7 <= 0) goto L5;
        SportRecordData r10 = new SportRecordData();
        r10.setMStartTime(r7);
        r10.setMEndTime(r5);
        r10.setMMode(r4);
        r10.setMSource(0);
        r0.add(r10);
        goto L3
    L16:
        if (r9.getMMode() == r4) goto L18;
    L20:
        r4 = -1;
        goto L21
    L18:
        if (r5 <= r9.getMTime()) goto L20;
        r7 = r9.getMTime();
        goto L21
    L25:
        return r0;
    }

    public static final int getGpsState(@aa1 SportRecordData r1) {
        Intrinsics.X0O(r1, "sportRecordData");
        if (r1.getMIsLocationEmpty() == false) goto L6;
        return R.drawable.icon_no_gps;
    L6:
        return R.drawable.icon_gps;
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordList(int r9, int r10) {
        ArrayList<SportRecordData> r0 = new ArrayList();
        MyDb r1 = MyDb.INSTANCE;
        ActivityDao r2 = r1.getMDatabase().activityDao();
        WorkoutDao r3 = r1.getMDatabase().workoutDao();
        List<Activity> r4 = r2.getStateActivityList(0, r9, r10);
        if (r4.isEmpty() == true) goto L9;
        if (r9 != 0) goto L6;
        long r5 = new Date().getTime();
    L7:
        r0.addAll(getActivityWorkoutList(r2.getListDESC(((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r4)).getMTime(), r5)));
        goto L9
    L6:
        r5 = ((Activity) CollectionsKt___CollectionsKt.IIII0iI(r4)).getMTime();
    L9:
        if (r9 != 0) goto L11;
        int r11 = 0;
    L12:
        List<Workout> r12 = r3.getListDESC(r11, r10, 0);
        if (r12.isEmpty() == true) goto L23;
        Iterator<Workout> r13 = r12.iterator();
    L16:
        if (r13.hasNext() == false) goto L23;
        Workout r14 = r13.next();
        SportRecordData r6 = new SportRecordData();
        r6.setMStartTime(r14.getMStart());
        r6.setMEndTime(r14.getMEnd());
        r6.setMMode(r14.getMMode());
        if (r14.getMSource() != 1) goto L20;
        int r7 = 2;
    L21:
        r6.setMSource(r7);
        r6.setMWorkoutId(r14.getMId());
        r6.setMDistance(r14.getMDistance());
        r6.setMPace(r14.getMPace());
        r6.setMCalorie(r14.getMCalorie());
        r6.setMDuration(r14.getMDuration());
        r6.setMPlatform(r14.getMPlatform());
        r6.setMSpeed(r14.getMSpeed());
        r0.add(r6);
        goto L16
    L20:
        r7 = 1;
    L23:
        if (r0.size() <= 1) goto L25;
        XiX0OOXI0.XOXiX0(r0, new SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$1());
    L25:
        return r0;
    L11:
        r11 = r9 + 1;
        goto L12
    }

    public static /* synthetic */ ArrayList getSportRecordList$default(long r0, long r2, int r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = 0;
    L6:
        return getSportRecordList(r0, r2, r4);
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordListByMode(int r5, int r6, int r7) {
        ArrayList<SportRecordData> r0 = new ArrayList();
        WorkoutDao r1 = MyDb.INSTANCE.getMDatabase().workoutDao();
        if (r5 != 0) goto L5;
        int r8 = 0;
    L6:
        List<Workout> r9 = r1.getListDESCByMode(r8, r6, r7);
        if (r9.isEmpty() == true) goto L17;
        Iterator<Workout> r10 = r9.iterator();
    L10:
        if (r10.hasNext() == false) goto L17;
        Workout r11 = r10.next();
        SportRecordData r12 = new SportRecordData();
        r12.setMStartTime(r11.getMStart());
        r12.setMEndTime(r11.getMEnd());
        r12.setMMode(r11.getMMode());
        if (r11.getMSource() != 1) goto L14;
        int r2 = 2;
    L15:
        r12.setMSource(r2);
        r12.setMWorkoutId(r11.getMId());
        r12.setMDistance(r11.getMDistance());
        r12.setMPace(r11.getMPace());
        r12.setMCalorie(r11.getMCalorie());
        r12.setMDuration(r11.getMDuration());
        r12.setMPlatform(r11.getMPlatform());
        r0.add(r12);
        goto L10
    L14:
        r2 = 1;
    L17:
        if (r0.size() <= 1) goto L19;
        XiX0OOXI0.XOXiX0(r0, new SportRecordDataKt$getSportRecordListByMode$$inlined$sortByDescending$1());
    L19:
        return r0;
    L5:
        r8 = r5 + 1;
        goto L6
    }

    @aa1
    public static final String getSportStartTime(@aa1 SportRecordData r3) {
        Intrinsics.X0O(r3, "sportRecordData");
        String r4 = O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(r3.getMStartTime()));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        return r4;
    }

    public static final int getWorkoutImage(@aa1 Context r4, @aa1 SportRecordData r5) {
        Intrinsics.X0O(r4, "mContext");
        Intrinsics.X0O(r5, "sportRecordData");
        int r6 = r4.getResources().getIdentifier("ic_workout" + r5.getMMode(), "drawable", r4.getPackageName());     // Catch: Exception -> L7
        if (r6 != 0) goto L6;
        return R.drawable.ic_workout9;
    L6:
        return r6;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.ic_workout9;
    }

    public static final int getWorkoutName(@aa1 Context r6, @aa1 SportRecordData r7) {
        Intrinsics.X0O(r6, "mContext");
        Intrinsics.X0O(r7, "sportRecordData");
        int r3 = r6.getResources().getIdentifier(NotificationCompat.CATEGORY_WORKOUT + r7.getMMode(), TypedValues.Custom.S_STRING, r6.getPackageName());     // Catch: Exception -> L12
        if (r3 != 0) goto L7;
        return R.string.workout9;
    L7:
        if (q62.OXO1.Oii1I1I10() == false) goto L14;
        int r8 = r6.getResources().getIdentifier(NotificationCompat.CATEGORY_WORKOUT + r7.getMMode() + "_2", TypedValues.Custom.S_STRING, r6.getPackageName());     // Catch: Exception -> L12
        if (r8 == 0) goto L14;
        return r8;
    L14:
        return r3;
    L12:
        e = move-exception;
        e.printStackTrace();
        return R.string.workout9;
    }

    @aa1
    public static final SportRecordItemCommonData parseSportRecordItemCommonData(@aa1 Context r25, @aa1 AppUser r26, @aa1 SportRecordData r27) {
        Intrinsics.X0O(r25, "context");
        Intrinsics.X0O(r26, "userProfile");
        Intrinsics.X0O(r27, "sportRecordData");
        MyDb r2 = MyDb.INSTANCE;
        HeartRateDao r4 = r2.getMDatabase().heartRateDao();
        LocationDao r3 = r2.getMDatabase().locationDao();
        if (r27.getMSource() != 0) goto L5;
        RecordActivityData r5 = sportRecordActivity(r27.getMStartTime(), r27.getMEndTime(), r26.getUnit());
    L6:
        int r6 = 2;
        if (r5.getMAvgBpm() <= 0) goto L9;
    L14:
        String r7 = String.valueOf(r5.getMAvgBpm());
    L15:
        r27.setMIsLocationEmpty(sportRecordLocation(r3, r27.getMStartTime(), r27.getMEndTime()));
        int r11 = getGpsState(r27);
        int r8 = r27.getMMode();
        if (r8 != 12) goto L18;
    L30:
        List r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(r7, R.drawable.icon_sport_hr), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMStepTotal()), R.drawable.icon_step)});
    L32:
        if (q62.OXO1.OiXI1OiX0() == false) goto L35;
        r9 = CollectionsKt___CollectionsKt.IOI(r9, 1);
    L34:
        List r12 = r9;
        int r13 = r6;
        LogUtils.d(new Object[]{"sportRecordData " + r27});
        return new SportRecordItemCommonData(getSportStartTime(r27), getWorkoutImage(r25, r27), getWorkoutName(r25, r27), r11, r12, r13, "", r27.getMDistance(), r27.getMPace(), r27.getMCalorie(), r27.getMDuration(), r27.getMMode(), r27.getMPlatform(), 0.0f, r27.getMSpeed(), 8192, null);
    L35:
        r6 = 3;
        goto L34
    L18:
        if (r8 != 116) goto L20;
        r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(r7, R.drawable.icon_sport_hr), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMAvgStress()), R.drawable.icon_pressure_72)});
        goto L32
    L20:
        switch(r8) {
            case 8: goto L30;
            case 9: goto L28;
            case 10: goto L23;
            default: goto L21;
        };
    L21:
        r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(r7, R.drawable.icon_sport_hr), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMCalorieTotal()), R.drawable.icon_calories_72)});
        goto L32
    L28:
        r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(r7, R.drawable.icon_sport_hr), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMDistanceTotal()), R.drawable.icon_distance_72)});
        goto L32
    L23:
        if (BleCache.INSTANCE.getMAGpsType() == 0) goto L25;
    L27:
        r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(String.valueOf(r5.getMSpeed()), R.drawable.icon_speed), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMDistanceTotal()), R.drawable.icon_distance_72)});
        goto L32
    L25:
        if (q62.OXO1.XOXOIX0Oi() == true) goto L27;
        r9 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData[]{new SportRecordItemData(r7, R.drawable.icon_sport_hr), new SportRecordItemData(r5.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(r5.getMCalorieTotal()), R.drawable.icon_calories_72)});
        goto L32
    L9:
        if (r27.getMSource() == 2) goto L11;
    L13:
        r7 = sportRecordHeartRate(r4, r5.getMTimeList());
        goto L15
    L11:
        if (r5.getMAvgBpm() != 0) goto L13;
    L5:
        r5 = sportRecordWorkout(r27.getMStartTime(), r27.getMEndTime(), r26.getUnit());
        goto L6
    }

    @aa1
    public static final RecordActivityData sportRecordActivity(long r24, long r26, int r28) {
        List<Activity> r5 = MyDb.INSTANCE.getMDatabase().activityDao().getListDESC(r24, r26);
        ArrayList r6 = new ArrayList();
        int r7 = r5.size();
        int r8 = -1;
        long r9 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
    L3:
        if (r12 >= r7) goto L44;
        Activity r20 = r5.get(r12);
        if (r8 >= 0) goto L12;
        if (r20.getMState() == 4) goto L12;
        List<Activity> r21 = r5;
    L10:
        int r22 = r7;
    L43:
        r12 = r12 + 1;
        r5 = r21;
        r7 = r22;
    L12:
        if (oe5.O0Ii(r20.getMLocalTime(), "00:00:00", false, 2, null) == false) goto L14;
        r14 = r14 + r17;
        r15 = r15 + r18;
        r16 = r16 + r19;
    L14:
        int r0 = r16;
        r21 = r5;
        if (oe5.O0Ii(r20.getMLocalTime(), "23:59:00", false, 2, null) == false) goto L17;
        r17 = r20.getMStep();
        r18 = r20.getMCalorie();
        r19 = r20.getMDistance();
    L17:
        int r1 = r20.getMState();
        if (r1 == 0) goto L40;
        if (r1 == 2) goto L30;
        if (r1 == 3) goto L27;
        if (r1 == 4) goto L25;
    L24:
        r22 = r7;
    L39:
        r16 = r0;
        goto L43
    L25:
        LogUtils.d(new Object[]{"END " + r20.getMStep() + " " + r20.getMCalorie() + " " + r20.getMDistance()});
        int r2 = r20.getMMode();
        long r3 = r20.getMTime();
        r17 = r20.getMStep();
        r18 = r20.getMCalorie();
        r19 = r20.getMDistance();
        r6.add(new RecordTimeList(r20.getMTime(), r20.getMState()));
        r16 = r0;
        r8 = r2;
        r9 = r3;
        goto L10
    L27:
        if (r20.getMMode() != r8) goto L24;
        LogUtils.d(new Object[]{"RESUME " + r20.getMStep() + " " + r20.getMCalorie() + " " + r20.getMDistance() + " " + r14 + "  " + r15 + " " + r0});
        long r4 = r20.getMTime();
        r14 = r14 + (r17 - r20.getMStep());
        r15 = r15 + (r18 - r20.getMCalorie());
        r16 = r0 + (r19 - r20.getMDistance());
        r6.add(new RecordTimeList(r20.getMTime(), r20.getMState()));
        r9 = r4;
        r22 = r7;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        goto L43
    L30:
        if (r20.getMMode() != r8) goto L24;
        if (r9 <= r20.getMTime()) goto L24;
        int r10 = r20.getMStep();
        int r11 = r20.getMCalorie();
        int r23 = r20.getMDistance();
        StringBuilder r110 = new StringBuilder();
        r22 = r7;
        r110.append("PAUSE ");
        r110.append(r10);
        r110.append(" ");
        r110.append(r11);
        r110.append(" ");
        r110.append(r23);
        LogUtils.d(new Object[]{r110.toString()});
        r13 = r13 + ((int) (r9 - r20.getMTime()));
        r17 = r20.getMStep();
        r18 = r20.getMCalorie();
        r19 = r20.getMDistance();
        if (r6.size() == 1) goto L36;
    L38:
        r6.add(new RecordTimeList(r20.getMTime(), r20.getMState()));
        goto L39
    L36:
        if (((RecordTimeList) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMState() != 4) goto L38;
        r6.clear();
        goto L38
    L40:
        r22 = r7;
        if (r20.getMMode() != r8) goto L39;
        LogUtils.d(new Object[]{"BEGIN " + r20.getMStep() + " " + r20.getMCalorie() + " " + r20.getMDistance() + " " + r14 + " " + r15 + " " + r0});
        r14 = r14 + (r17 - r20.getMStep());
        r15 = r15 + (r18 - r20.getMCalorie());
        r16 = r0 + (r19 - r20.getMDistance());
        r6.add(new RecordTimeList(r20.getMTime(), r20.getMState()));
        goto L43
    L44:
        O1OOiOO1i.I11X11OX(r6);
        int r25 = (int) ((r26 - r24) - ((long) r13));
        int r27 = r25 / 1000;
        if (r14 >= 0) goto L47;
        r14 = 0;
    L47:
        if (r15 >= 0) goto L49;
        r15 = 0;
    L49:
        if (r16 >= 0) goto L51;
        int r29 = 0;
    L53:
        if (r13 >= 10000) goto L55;
        r13 = 0;
    L55:
        RecordActivityData r30 = new RecordActivityData();
        r30.setMStepTotal(r14);
        r30.setMCalorieTotal(r15 / 10000);
        int r31 = r29 / 10000;
        r30.setMDistanceTotal(cp5.XXI(r31, r28, false));
        r30.setMPauseTimeTotal(O0X11OiO.iXiX011(r13));
        r30.setMSportTimeStr(O0X11OiO.iXiX011(r25));
        r30.getMTimeList().addAll(r6);
        r30.setMSpeed(cp5.XO0X10iO(r31, r27, r28));
        int r111 = r14 * 60;
        if (r27 > 0) goto L58;
        int r112 = 1;
    L59:
        r30.setMSpm(r111 / r112);
        r30.setMPace(cp5.XXO(cp5.O10IXXX0X(r31, r28), r27));
        return r30;
    L58:
        r112 = r27;
        goto L59
    L51:
        r29 = r16;
        goto L53
    }

    @aa1
    public static final RecordDetailSpeedData sportRecordActivityDetailSpeed(@aa1 ArrayList<RecordTimeList> r22, int r23, int r24) {
        Intrinsics.X0O(r22, "mTimeList");
        ActivityDao r3 = MyDb.INSTANCE.getMDatabase().activityDao();
        ArrayList r2 = new ArrayList();
        LogUtils.i(new Object[]{"sportRecordActivityDetailSpeed " + r22.size()});
        int r10 = r22.size() + (-2);
        int r11 = 1000;
        float r4 = 0.0f;
        if (r10 < 0) goto L22;
        float r13 = 0.0f;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
    L5:
        int r6 = r14 + 1;
        List<Activity> r5 = r3.getWorkoutListDESC(r22.get(r14).getMTime(), r22.get(r6).getMTime(), r23);
        LogUtils.i(new Object[]{"sportRecordActivityDetailSpeed " + r5.size()});
        int r7 = r5.size();
        int r8 = 0;
    L6:
        if (r8 >= r7) goto L18;
        Activity r9 = r5.get(r8);
        if (r8 >= (r5.size() - 1)) goto L16;
        int r12 = r8 + 1;
        int r17 = r9.getMDistance() - r5.get(r12).getMDistance();
        long r18 = r9.getMTime() - r5.get(r12).getMTime();
        ActivityDao r19 = r3;
        List<Activity> r20 = r5;
        int r21 = Math.abs((int) (r18 / ((long) r11)));
        float r25 = cp5.XO0X10iO(r17 / 10000, r21, r24);
        if (r13 >= r25) goto L12;
        r13 = r25;
    L12:
        int r26 = r16 + r17;
        r15 = r15 + r21;
        float r27 = cp5.O10IXXX0X(r26 / 10000, r24);
        ActivityDao r110 = r19;
        if (r27 < 1.0d) goto L15;
        r2.add(Integer.valueOf(cp5.XXO(r27, r15)));
        r15 = 0;
        r16 = 0;
    L17:
        r8 = r8 + 1;
        r5 = r20;
        r3 = r110;
        r11 = 1000;
        goto L6
    L15:
        r16 = r26;
        goto L17
    L16:
        r110 = r3;
        r20 = r5;
        goto L17
    L18:
        ActivityDao r111 = r3;
        if (r14 == r10) goto L21;
        r14 = r6;
        r3 = r111;
        r11 = 1000;
        goto L5
    L21:
        r4 = r13;
        int r112 = r16;
    L23:
        if (r112 <= 0) goto L25;
        r2.add(Integer.valueOf(cp5.XXO(cp5.O10IXXX0X(r112 / 1000, r24), r15)));
    L25:
        LogUtils.i(new Object[]{"sportRecordActivityDetailSpeed " + r2.size()});
        RecordDetailSpeedData r0 = new RecordDetailSpeedData();
        r0.setMFastestSpeed(r4);
        r0.getMPaceList().addAll(r2);
        return r0;
    L22:
        r112 = 0;
        r15 = 0;
        goto L23
    }

    @aa1
    public static final String sportRecordHeartRate(@aa1 HeartRateDao r9, @aa1 ArrayList<RecordTimeList> r10) {
        Intrinsics.X0O(r9, "mHeartRateDao");
        Intrinsics.X0O(r10, "mTimeList");
        int r0 = r10.size() - 2;
        int r1 = 0;
        int r2 = 0;
        if (r0 < 0) goto L14;
        int r3 = 0;
    L5:
        int r6 = r1 + 1;
        Iterator<HeartRate> r4 = r9.getHeartRates(r10.get(r1).getMTime(), r10.get(r6).getMTime()).iterator();
    L7:
        if (r4.hasNext() == false) goto L11;
        HeartRate r5 = r4.next();
        if (r5.getMBpm() <= 0) goto L7;
        r2 = r2 + r5.getMBpm();
        r3 = r3 + 1;
        goto L7
    L11:
        if (r1 == r0) goto L13;
        r1 = r6;
        goto L5
    L13:
        r1 = r3;
    L14:
        if (r1 != 0) goto L18;
        return "0";
    L18:
        return String.valueOf(r2 / r1);
    }

    @aa1
    public static final RecordDetailHeartRateData sportRecordHeartRateDetail(@aa1 HeartRateDao r27, @aa1 ArrayList<RecordTimeList> r28) {
        HeartRateDao r0 = r27;
        ArrayList<RecordTimeList> r1 = r28;
        Intrinsics.X0O(r0, "mHeartRateDao");
        Intrinsics.X0O(r1, "mTimeList");
        ArrayList r2 = new ArrayList();
        int r3 = r1.size() - 2;
        long r5 = 0;
        if (r3 < 0) goto L40;
        long r7 = 0;
        long r9 = 0;
        long r11 = 0;
        long r13 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
    L5:
        long r21 = r5;
        int r6 = r15 + 1;
        long r23 = r7;
        List<HeartRate> r4 = r0.getHeartRates(r1.get(r15).getMTime(), r1.get(r6).getMTime());
        int r8 = r4.size();
        int r10 = r18;
        int r12 = 0;
    L6:
        if (r12 >= r8) goto L37;
        HeartRate r14 = r4.get(r12);
        if (r19 != 0) goto L10;
        r19 = r14.getMBpm();
    L10:
        int r20 = r19;
        if (r14.getMBpm() <= 0) goto L35;
        r2.add(r14);
        r16 = r16 + r14.getMBpm();
        if (r10 >= r14.getMBpm()) goto L16;
        r10 = r14.getMBpm();
    L16:
        if (r20 <= r14.getMBpm()) goto L18;
        r20 = r14.getMBpm();
    L18:
        r17 = r17 + 1;
        if (r12 >= (r4.size() - 1)) goto L34;
        long r110 = r4.get(r12 + 1).getMTime() - r14.getMTime();
        int r25 = r20;
        if (r14.getMBpm() < 140) goto L25;
        r21 = r21 + r110;
    L23:
        r19 = r25;
    L36:
        r12 = r12 + 1;
        goto L6
    L25:
        if (r14.getMBpm() < 114) goto L28;
        r23 = r23 + r110;
        goto L23
    L28:
        if (r14.getMBpm() < 90) goto L31;
        r9 = r9 + r110;
        goto L23
    L31:
        if (r14.getMBpm() < 80) goto L33;
        r11 = r11 + r110;
        goto L23
    L33:
        r13 = r13 + r110;
        goto L23
    L34:
        r25 = r20;
        goto L23
    L35:
        r19 = r20;
        goto L36
    L37:
        if (r15 == r3) goto L39;
        r0 = r27;
        r1 = r28;
        r18 = r10;
        r15 = r6;
        r5 = r21;
        r7 = r23;
        goto L5
    L39:
        int r22 = r10;
        int r24 = r19;
        r5 = r21;
    L41:
        if (r17 != 0) goto L43;
        int r26 = 0;
    L44:
        RecordDetailHeartRateData r29 = new RecordDetailHeartRateData();
        r29.setMAvgHR(r26);
        r29.setMMaxHR(r22);
        r29.setMMinHR(r24);
        r29.getMHeartRateList().addAll(r2);
        long r30 = 1000;
        long r31 = 60;
        r29.setMStrenuous((r5 / r30) / r31);
        r29.setMAnaerobic((r23 / r30) / r31);
        r29.setMAerobic((r9 / r30) / r31);
        r29.setMFatBurning((r11 / r30) / r31);
        r29.setMWarmUp((r13 / r30) / r31);
        return r29;
    L43:
        r26 = r16 / r17;
        goto L44
    L40:
        r9 = 0;
        r11 = 0;
        r13 = 0;
        r23 = 0;
        r22 = 0;
        r24 = 0;
        r16 = 0;
        r17 = 0;
        goto L41
    }

    public static final boolean sportRecordLocation(@aa1 LocationDao r1, long r2, long r4) {
        Intrinsics.X0O(r1, "mLocationDao");
        List<Location> r3 = r1.getLocation(r2, r4);
        if (r3.isEmpty() == false) goto L5;
        return true;
    L5:
        if (r3.size() < 2) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public static final RecordActivityData sportRecordWorkout(long r3, long r5, int r7) {
        Workout r4 = MyDb.INSTANCE.getMDatabase().workoutDao().getWorkout(r3, r5);
        ArrayList r6 = CollectionsKt__CollectionsKt.iIiiO(new RecordTimeList[]{new RecordTimeList(r4.getMStart(), 0), new RecordTimeList(r4.getMEnd(), 0)});
        int r8 = (int) ((r4.getMEnd() - r4.getMStart()) - ((long) (r4.getMDuration() * 1000)));
        if (r8 >= 10000) goto L5;
        r8 = 0;
    L5:
        RecordActivityData r9 = new RecordActivityData();
        r9.setMSportTimeStr(O0X11OiO.iXiX011(r4.getMDuration() * 1000));
        r9.setMPauseTimeTotal(O0X11OiO.iXiX011(r8));
        r9.getMTimeList().addAll(r6);
        r9.setMAltitude(r4.getMAltitude());
        r9.setMSpm(r4.getMSpm());
        r9.setMStepTotal(r4.getMStep());
        r9.setMDistanceTotal(cp5.X1ii(r4.getMDistance(), r7, false, 4, null));
        r9.setMCalorieTotal(r4.getMCalorie() / 1000);
        r9.setMSpeed(cp5.i11I(((double) r4.getMSpeed()) / 1000.0d, r7));
        r9.setMPace(r4.getMPace());
        r9.setMAvgBpm(r4.getMAvgBpm());
        r9.setMMaxBpm(r4.getMMaxBpm());
        r9.setMMinBpm(r4.getMMinBpm());
        r9.setMMaxSpm(r4.getMMaxSpm());
        r9.setMMinSpm(r4.getMMinSpm());
        r9.setMMaxPace(r4.getMMaxPace());
        r9.setMMinPace(r4.getMMinPace());
        r9.setMMinStress(r4.getMMinStress());
        r9.setMMaxStress(r4.getMMaxStress());
        r9.setMAvgStress(r4.getMAvgStress());
        r9.setMPlatform(r4.getMPlatform());
        r9.setMAvgSpeed(r4.getMAvgSpeed());
        return r9;
    }

    @aa1
    public static final RecordDetailSpeedData sportRecordWorkoutDetailSpeed(@aa1 ArrayList<RecordTimeList> r20, int r21, int r22, @aa1 ArrayList<CustomLatLng> r23) {
        Intrinsics.X0O(r20, "mTimeList");
        Intrinsics.X0O(r23, "locationList");
        LogUtils.d(new Object[]{"test mTimeList.size =  " + r20.size()});
        ArrayList r3 = new ArrayList();
        int r4 = r23.size();
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        float r10 = 0.0f;
    L4:
        if (r7 >= r4) goto L24;
        CustomLatLng r14 = r23.get(r7);
        Intrinsics.O10IXXX0X(r14, "get(...)");
        CustomLatLng r15 = r14;
        if (r7 >= (r23.size() - 1)) goto L22;
        int r6 = r7 + 1;
        int r5 = (int) DistanceUtil.getDistance(new LatLng(r15.getLatitude(), r15.getLongitude()), new LatLng(r23.get(r6).getLatitude(), r23.get(r6).getLongitude()));
        int r11 = Math.abs((int) ((r15.getTime() - r23.get(r6).getTime()) / ((long) 1000)));
        float r12 = cp5.XO0X10iO(r5, r11, r22);
        LogUtils.d(new Object[]{"test " + r10 + " " + r12 + "  " + r5 + " " + r11 + "  " + r23.get(r7)});
        if (r10 < r12) goto L10;
    L12:
        r8 = r8 + r5;
        r9 = r9 + r11;
        float r13 = cp5.O10IXXX0X(r8, r22);
        if (r13 < 1.0d) goto L22;
        LogUtils.d(new Object[]{" distanceToKmNumber " + r7 + " " + r13});
        r3.add(Integer.valueOf(cp5.XXO(r13, r9)));
        if (r13 <= 1.0f) goto L20;
        if (r7 != (r23.size() - 2)) goto L20;
        r3.add(Integer.valueOf(cp5.XXO(0.0f, r11)));
    L20:
        r8 = 0;
        r9 = 0;
        goto L22
    L10:
        if (r12 >= 150.0f) goto L12;
        r10 = r12;
    L22:
        r7 = r7 + 1;
        goto L4
    L24:
        if (r8 <= 0) goto L33;
        float r1 = cp5.O10IXXX0X(r8, r22);
        LogUtils.d(new Object[]{"last km " + r1 + " " + r9});
        if (r3.size() == 0) goto L28;
    L32:
        r3.add(Integer.valueOf(cp5.XXO(r1, r9)));
        goto L33
    L28:
        if (r20.isEmpty() == true) goto L32;
        if (r20.size() <= 1) goto L32;
        r3.add(Integer.valueOf(cp5.XXO(r1, (int) ((r20.get(1).getMTime() - r20.get(0).getMTime()) / ((long) 1000)))));
    L33:
        RecordDetailSpeedData r0 = new RecordDetailSpeedData();
        r0.setMFastestSpeed(r10);
        r0.getMPaceList().addAll(r3);
        return r0;
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordList(long r9, long r11, int r13) {
        ArrayList<SportRecordData> r0 = new ArrayList();
        MyDb r1 = MyDb.INSTANCE;
        ActivityDao r2 = r1.getMDatabase().activityDao();
        WorkoutDao r3 = r1.getMDatabase().workoutDao();
        r0.addAll(getActivityWorkoutList(r2.getListDESC(r9, r11)));
        if (r13 == 0) goto L5;
        List<Workout> r10 = r3.getListModeDESC(r9, r11, 116);
    L7:
        if (r10.isEmpty() == true) goto L17;
        Iterator<Workout> r12 = r10.iterator();
    L10:
        if (r12.hasNext() == false) goto L17;
        Workout r14 = r12.next();
        SportRecordData r15 = new SportRecordData();
        r15.setMStartTime(r14.getMStart());
        r15.setMEndTime(r14.getMEnd());
        r15.setMMode(r14.getMMode());
        if (r14.getMSource() != 1) goto L14;
        int r16 = 2;
    L15:
        r15.setMSource(r16);
        r15.setMWorkoutId(r14.getMId());
        r15.setMDistance(r14.getMDistance());
        r15.setMPace(r14.getMPace());
        r15.setMCalorie(r14.getMCalorie());
        r15.setMDuration(r14.getMDuration());
        r0.add(r15);
        goto L10
    L14:
        r16 = 1;
    L17:
        if (r0.size() <= 1) goto L19;
        XiX0OOXI0.XOXiX0(r0, new SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$2());
    L19:
        return r0;
    L5:
        r10 = r3.getListDESC(r9, r11, 0);
        goto L7
    }
}
