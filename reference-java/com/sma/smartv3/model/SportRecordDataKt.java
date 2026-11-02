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
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSportRecordData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1074:1\n1021#2,2:1075\n1021#2,2:1077\n1021#2,2:1079\n1563#2:1081\n1634#2,3:1082\n*S KotlinDebug\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n*L\n171#1:1075,2\n222#1:1077,2\n264#1:1079,2\n1025#1:1081\n1025#1:1082,3\n*E\n"})
public final class SportRecordDataKt {
    public static final int ACTIVITY = 0;
    public static final int PHONE_SPORT = 2;
    public static final int WORKOUT = 1;

    public static final void deleteSportRecord(@aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        LogUtils.m11128d("delete " + sportRecordData);
        if (sportRecordData.getMSource() != 0) {
            WorkoutDao workoutDao = MyDb.INSTANCE.getMDatabase().workoutDao();
            Workout workout = workoutDao.getWorkout(sportRecordData.getMStartTime(), sportRecordData.getMEndTime());
            workout.setMIsSync(0);
            workout.setMIsDelete(1);
            workoutDao.update(workout);
            return;
        }
        ActivityDao activityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        List<Activity> workoutListDESC = activityDao.getWorkoutListDESC(sportRecordData.getMStartTime(), sportRecordData.getMEndTime(), sportRecordData.getMMode());
        List<Activity> list = workoutListDESC;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (Activity activity : list) {
            activity.setMIsSync(0);
            activity.setMIsDelete(1);
            arrayList.add(Unit.OXO1);
        }
        activityDao.update(workoutListDESC);
    }

    @aa1
    public static final ArrayList<SportRecordData> getActivityWorkoutList(@aa1 List<Activity> workoutActivity) {
        Intrinsics.X0O(workoutActivity, "workoutActivity");
        ArrayList<SportRecordData> arrayList = new ArrayList<>();
        while (true) {
            int mMode = -1;
            long mTime = 0;
            long mTime2 = 0;
            for (Activity activity : workoutActivity) {
                if (mMode >= 0 || activity.getMState() == 4) {
                    int mState = activity.getMState();
                    if (mState != 0) {
                        if (mState == 4) {
                            mMode = activity.getMMode();
                            mTime = activity.getMTime();
                        }
                    } else if (activity.getMMode() != mMode || mTime <= activity.getMTime()) {
                        mMode = -1;
                    } else {
                        mTime2 = activity.getMTime();
                    }
                    if (mMode > 0 && mTime2 > 0) {
                        SportRecordData sportRecordData = new SportRecordData();
                        sportRecordData.setMStartTime(mTime2);
                        sportRecordData.setMEndTime(mTime);
                        sportRecordData.setMMode(mMode);
                        sportRecordData.setMSource(0);
                        arrayList.add(sportRecordData);
                    }
                }
            }
            return arrayList;
        }
    }

    public static final int getGpsState(@aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        return sportRecordData.getMIsLocationEmpty() ? R.drawable.icon_no_gps : R.drawable.icon_gps;
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordList(int i, int i2) {
        ArrayList<SportRecordData> arrayList = new ArrayList<>();
        MyDb myDb = MyDb.INSTANCE;
        ActivityDao activityDao = myDb.getMDatabase().activityDao();
        WorkoutDao workoutDao = myDb.getMDatabase().workoutDao();
        List<Activity> stateActivityList = activityDao.getStateActivityList(0, i, i2);
        if (!stateActivityList.isEmpty()) {
            arrayList.addAll(getActivityWorkoutList(activityDao.getListDESC(((Activity) CollectionsKt___CollectionsKt.Xi1XO00(stateActivityList)).getMTime(), i == 0 ? new Date().getTime() : ((Activity) CollectionsKt___CollectionsKt.IIII0iI(stateActivityList)).getMTime())));
        }
        List<Workout> listDESC = workoutDao.getListDESC(i == 0 ? 0 : i + 1, i2, 0);
        if (!listDESC.isEmpty()) {
            for (Workout workout : listDESC) {
                SportRecordData sportRecordData = new SportRecordData();
                sportRecordData.setMStartTime(workout.getMStart());
                sportRecordData.setMEndTime(workout.getMEnd());
                sportRecordData.setMMode(workout.getMMode());
                sportRecordData.setMSource(workout.getMSource() == 1 ? 2 : 1);
                sportRecordData.setMWorkoutId(workout.getMId());
                sportRecordData.setMDistance(workout.getMDistance());
                sportRecordData.setMPace(workout.getMPace());
                sportRecordData.setMCalorie(workout.getMCalorie());
                sportRecordData.setMDuration(workout.getMDuration());
                sportRecordData.setMPlatform(workout.getMPlatform());
                sportRecordData.setMSpeed(workout.getMSpeed());
                arrayList.add(sportRecordData);
            }
        }
        if (arrayList.size() > 1) {
            XiX0OOXI0.XOXiX0(arrayList, new Comparator() { // from class: com.sma.smartv3.model.SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(((SportRecordData) t2).getMStartTime()), Long.valueOf(((SportRecordData) t).getMStartTime()));
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList getSportRecordList$default(long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return getSportRecordList(j, j2, i);
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordListByMode(int i, int i2, int i3) {
        ArrayList<SportRecordData> arrayList = new ArrayList<>();
        List<Workout> listDESCByMode = MyDb.INSTANCE.getMDatabase().workoutDao().getListDESCByMode(i == 0 ? 0 : i + 1, i2, i3);
        if (!listDESCByMode.isEmpty()) {
            for (Workout workout : listDESCByMode) {
                SportRecordData sportRecordData = new SportRecordData();
                sportRecordData.setMStartTime(workout.getMStart());
                sportRecordData.setMEndTime(workout.getMEnd());
                sportRecordData.setMMode(workout.getMMode());
                sportRecordData.setMSource(workout.getMSource() == 1 ? 2 : 1);
                sportRecordData.setMWorkoutId(workout.getMId());
                sportRecordData.setMDistance(workout.getMDistance());
                sportRecordData.setMPace(workout.getMPace());
                sportRecordData.setMCalorie(workout.getMCalorie());
                sportRecordData.setMDuration(workout.getMDuration());
                sportRecordData.setMPlatform(workout.getMPlatform());
                arrayList.add(sportRecordData);
            }
        }
        if (arrayList.size() > 1) {
            XiX0OOXI0.XOXiX0(arrayList, new Comparator() { // from class: com.sma.smartv3.model.SportRecordDataKt$getSportRecordListByMode$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(((SportRecordData) t2).getMStartTime()), Long.valueOf(((SportRecordData) t).getMStartTime()));
                }
            });
        }
        return arrayList;
    }

    @aa1
    public static final String getSportStartTime(@aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        String str = O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(sportRecordData.getMStartTime()));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public static final int getWorkoutImage(@aa1 Context mContext, @aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(mContext, "mContext");
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        try {
            int identifier = mContext.getResources().getIdentifier("ic_workout" + sportRecordData.getMMode(), "drawable", mContext.getPackageName());
            return identifier == 0 ? R.drawable.ic_workout9 : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.ic_workout9;
        }
    }

    public static final int getWorkoutName(@aa1 Context mContext, @aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(mContext, "mContext");
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        try {
            int identifier = mContext.getResources().getIdentifier(NotificationCompat.CATEGORY_WORKOUT + sportRecordData.getMMode(), TypedValues.Custom.S_STRING, mContext.getPackageName());
            if (identifier == 0) {
                return R.string.workout9;
            }
            if (q62.OXO1.Oii1I1I10()) {
                int identifier2 = mContext.getResources().getIdentifier(NotificationCompat.CATEGORY_WORKOUT + sportRecordData.getMMode() + "_2", TypedValues.Custom.S_STRING, mContext.getPackageName());
                if (identifier2 != 0) {
                    return identifier2;
                }
            }
            return identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.string.workout9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0175  */
    @aa1
    public static final SportRecordItemCommonData parseSportRecordItemCommonData(@aa1 Context context, @aa1 AppUser userProfile, @aa1 SportRecordData sportRecordData) {
        List listIXiX011;
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(userProfile, "userProfile");
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        MyDb myDb = MyDb.INSTANCE;
        HeartRateDao heartRateDao = myDb.getMDatabase().heartRateDao();
        LocationDao locationDao = myDb.getMDatabase().locationDao();
        RecordActivityData recordActivityDataSportRecordActivity = sportRecordData.getMSource() == 0 ? sportRecordActivity(sportRecordData.getMStartTime(), sportRecordData.getMEndTime(), userProfile.getUnit()) : sportRecordWorkout(sportRecordData.getMStartTime(), sportRecordData.getMEndTime(), userProfile.getUnit());
        int i = 2;
        String strValueOf = (recordActivityDataSportRecordActivity.getMAvgBpm() > 0 || (sportRecordData.getMSource() == 2 && recordActivityDataSportRecordActivity.getMAvgBpm() == 0)) ? String.valueOf(recordActivityDataSportRecordActivity.getMAvgBpm()) : sportRecordHeartRate(heartRateDao, recordActivityDataSportRecordActivity.getMTimeList());
        sportRecordData.setMIsLocationEmpty(sportRecordLocation(locationDao, sportRecordData.getMStartTime(), sportRecordData.getMEndTime()));
        int gpsState = getGpsState(sportRecordData);
        int mMode = sportRecordData.getMMode();
        if (mMode == 12) {
            listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMStepTotal()), R.drawable.icon_step));
        } else if (mMode != 116) {
            switch (mMode) {
                case 8:
                    listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMStepTotal()), R.drawable.icon_step));
                    break;
                case 9:
                    listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMDistanceTotal()), R.drawable.icon_distance_72));
                    break;
                case 10:
                    listIXiX011 = (BleCache.INSTANCE.getMAGpsType() == 0 && !q62.OXO1.XOXOIX0Oi()) ? CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMCalorieTotal()), R.drawable.icon_calories_72)) : CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMSpeed()), R.drawable.icon_speed), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMDistanceTotal()), R.drawable.icon_distance_72));
                    break;
                default:
                    listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMCalorieTotal()), R.drawable.icon_calories_72));
                    break;
            }
        } else {
            listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(new SportRecordItemData(strValueOf, R.drawable.icon_sport_hr), new SportRecordItemData(recordActivityDataSportRecordActivity.getMSportTimeStr(), R.drawable.icon_time), new SportRecordItemData(String.valueOf(recordActivityDataSportRecordActivity.getMAvgStress()), R.drawable.icon_pressure_72));
        }
        if (q62.OXO1.OiXI1OiX0()) {
            listIXiX011 = CollectionsKt___CollectionsKt.IOI(listIXiX011, 1);
        } else {
            i = 3;
        }
        List list = listIXiX011;
        int i2 = i;
        LogUtils.m11128d("sportRecordData " + sportRecordData);
        return new SportRecordItemCommonData(getSportStartTime(sportRecordData), getWorkoutImage(context, sportRecordData), getWorkoutName(context, sportRecordData), gpsState, list, i2, "", sportRecordData.getMDistance(), sportRecordData.getMPace(), sportRecordData.getMCalorie(), sportRecordData.getMDuration(), sportRecordData.getMMode(), sportRecordData.getMPlatform(), 0.0f, sportRecordData.getMSpeed(), 8192, null);
    }

    @aa1
    public static final RecordActivityData sportRecordActivity(long j, long j2, int i) {
        List<Activity> list;
        int i2;
        List<Activity> listDESC = MyDb.INSTANCE.getMDatabase().activityDao().getListDESC(j, j2);
        ArrayList arrayList = new ArrayList();
        int size = listDESC.size();
        int i3 = -1;
        long j3 = 0;
        int i4 = 0;
        int mTime = 0;
        int mStep = 0;
        int mCalorie = 0;
        int mDistance = 0;
        int mStep2 = 0;
        int mCalorie2 = 0;
        int mDistance2 = 0;
        while (i4 < size) {
            Activity activity = listDESC.get(i4);
            if (i3 >= 0 || activity.getMState() == 4) {
                if (oe5.O0Ii(activity.getMLocalTime(), "00:00:00", false, 2, null)) {
                    mStep += mStep2;
                    mCalorie += mCalorie2;
                    mDistance += mDistance2;
                }
                int i5 = mDistance;
                list = listDESC;
                if (oe5.O0Ii(activity.getMLocalTime(), "23:59:00", false, 2, null)) {
                    mStep2 = activity.getMStep();
                    mCalorie2 = activity.getMCalorie();
                    mDistance2 = activity.getMDistance();
                }
                int mState = activity.getMState();
                if (mState != 0) {
                    if (mState == 2) {
                        if (activity.getMMode() == i3 && j3 > activity.getMTime()) {
                            int mStep3 = activity.getMStep();
                            int mCalorie3 = activity.getMCalorie();
                            int mDistance3 = activity.getMDistance();
                            StringBuilder sb = new StringBuilder();
                            i2 = size;
                            sb.append("PAUSE ");
                            sb.append(mStep3);
                            sb.append(" ");
                            sb.append(mCalorie3);
                            sb.append(" ");
                            sb.append(mDistance3);
                            LogUtils.m11128d(sb.toString());
                            mTime += (int) (j3 - activity.getMTime());
                            mStep2 = activity.getMStep();
                            mCalorie2 = activity.getMCalorie();
                            mDistance2 = activity.getMDistance();
                            if (arrayList.size() == 1 && ((RecordTimeList) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).getMState() == 4) {
                                arrayList.clear();
                            }
                            arrayList.add(new RecordTimeList(activity.getMTime(), activity.getMState()));
                        }
                        mDistance = i5;
                    } else if (mState != 3) {
                        if (mState == 4) {
                            LogUtils.m11128d("END " + activity.getMStep() + " " + activity.getMCalorie() + " " + activity.getMDistance());
                            int mMode = activity.getMMode();
                            long mTime2 = activity.getMTime();
                            mStep2 = activity.getMStep();
                            mCalorie2 = activity.getMCalorie();
                            mDistance2 = activity.getMDistance();
                            arrayList.add(new RecordTimeList(activity.getMTime(), activity.getMState()));
                            mDistance = i5;
                            i3 = mMode;
                            j3 = mTime2;
                        }
                    } else if (activity.getMMode() == i3) {
                        LogUtils.m11128d("RESUME " + activity.getMStep() + " " + activity.getMCalorie() + " " + activity.getMDistance() + " " + mStep + "  " + mCalorie + " " + i5);
                        long mTime3 = activity.getMTime();
                        mStep += mStep2 - activity.getMStep();
                        mCalorie += mCalorie2 - activity.getMCalorie();
                        mDistance = i5 + (mDistance2 - activity.getMDistance());
                        arrayList.add(new RecordTimeList(activity.getMTime(), activity.getMState()));
                        j3 = mTime3;
                        i2 = size;
                        mStep2 = 0;
                        mCalorie2 = 0;
                        mDistance2 = 0;
                    }
                    i2 = size;
                    mDistance = i5;
                } else {
                    i2 = size;
                    if (activity.getMMode() == i3) {
                        LogUtils.m11128d("BEGIN " + activity.getMStep() + " " + activity.getMCalorie() + " " + activity.getMDistance() + " " + mStep + " " + mCalorie + " " + i5);
                        mStep += mStep2 - activity.getMStep();
                        mCalorie += mCalorie2 - activity.getMCalorie();
                        mDistance = i5 + (mDistance2 - activity.getMDistance());
                        arrayList.add(new RecordTimeList(activity.getMTime(), activity.getMState()));
                    } else {
                        mDistance = i5;
                    }
                }
                i4++;
                listDESC = list;
                size = i2;
            } else {
                list = listDESC;
            }
            i2 = size;
            i4++;
            listDESC = list;
            size = i2;
        }
        O1OOiOO1i.I11X11OX(arrayList);
        int i6 = (int) ((j2 - j) - ((long) mTime));
        int i7 = i6 / 1000;
        if (mStep < 0) {
            mStep = 0;
        }
        if (mCalorie < 0) {
            mCalorie = 0;
        }
        int i8 = mDistance < 0 ? 0 : mDistance;
        if (mTime < 10000) {
            mTime = 0;
        }
        RecordActivityData recordActivityData = new RecordActivityData();
        recordActivityData.setMStepTotal(mStep);
        recordActivityData.setMCalorieTotal(mCalorie / 10000);
        int i9 = i8 / 10000;
        recordActivityData.setMDistanceTotal(cp5.XXI(i9, i, false));
        recordActivityData.setMPauseTimeTotal(O0X11OiO.iXiX011(mTime));
        recordActivityData.setMSportTimeStr(O0X11OiO.iXiX011(i6));
        recordActivityData.getMTimeList().addAll(arrayList);
        recordActivityData.setMSpeed(cp5.XO0X10iO(i9, i7, i));
        recordActivityData.setMSpm((mStep * 60) / (i7 <= 0 ? 1 : i7));
        recordActivityData.setMPace(cp5.XXO(cp5.O10IXXX0X(i9, i), i7));
        return recordActivityData;
    }

    @aa1
    public static final RecordDetailSpeedData sportRecordActivityDetailSpeed(@aa1 ArrayList<RecordTimeList> mTimeList, int i, int i2) {
        int i3;
        int i4;
        ActivityDao activityDao;
        List<Activity> list;
        Intrinsics.X0O(mTimeList, "mTimeList");
        ActivityDao activityDao2 = MyDb.INSTANCE.getMDatabase().activityDao();
        ArrayList arrayList = new ArrayList();
        LogUtils.m11130i("sportRecordActivityDetailSpeed " + mTimeList.size());
        int size = mTimeList.size() + (-2);
        int i5 = 1000;
        float f = 0.0f;
        if (size >= 0) {
            float f2 = 0.0f;
            int i6 = 0;
            i4 = 0;
            int i7 = 0;
            while (true) {
                int i8 = i6 + 1;
                List<Activity> workoutListDESC = activityDao2.getWorkoutListDESC(mTimeList.get(i6).getMTime(), mTimeList.get(i8).getMTime(), i);
                LogUtils.m11130i("sportRecordActivityDetailSpeed " + workoutListDESC.size());
                int size2 = workoutListDESC.size();
                int i9 = 0;
                while (i9 < size2) {
                    Activity activity = workoutListDESC.get(i9);
                    if (i9 < workoutListDESC.size() - 1) {
                        int i10 = i9 + 1;
                        int mDistance = activity.getMDistance() - workoutListDESC.get(i10).getMDistance();
                        long mTime = activity.getMTime() - workoutListDESC.get(i10).getMTime();
                        ActivityDao activityDao3 = activityDao2;
                        list = workoutListDESC;
                        int iAbs = Math.abs((int) (mTime / ((long) i5)));
                        float fXO0X10iO = cp5.XO0X10iO(mDistance / 10000, iAbs, i2);
                        if (f2 < fXO0X10iO) {
                            f2 = fXO0X10iO;
                        }
                        int i11 = i7 + mDistance;
                        i4 += iAbs;
                        float fO10IXXX0X = cp5.O10IXXX0X(i11 / 10000, i2);
                        activityDao = activityDao3;
                        if (fO10IXXX0X >= 1.0d) {
                            arrayList.add(Integer.valueOf(cp5.XXO(fO10IXXX0X, i4)));
                            i4 = 0;
                            i7 = 0;
                        } else {
                            i7 = i11;
                        }
                    } else {
                        activityDao = activityDao2;
                        list = workoutListDESC;
                    }
                    i9++;
                    workoutListDESC = list;
                    activityDao2 = activityDao;
                    i5 = 1000;
                }
                ActivityDao activityDao4 = activityDao2;
                if (i6 == size) {
                    break;
                }
                i6 = i8;
                activityDao2 = activityDao4;
                i5 = 1000;
            }
            f = f2;
            i3 = i7;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (i3 > 0) {
            arrayList.add(Integer.valueOf(cp5.XXO(cp5.O10IXXX0X(i3 / 1000, i2), i4)));
        }
        LogUtils.m11130i("sportRecordActivityDetailSpeed " + arrayList.size());
        RecordDetailSpeedData recordDetailSpeedData = new RecordDetailSpeedData();
        recordDetailSpeedData.setMFastestSpeed(f);
        recordDetailSpeedData.getMPaceList().addAll(arrayList);
        return recordDetailSpeedData;
    }

    @aa1
    public static final String sportRecordHeartRate(@aa1 HeartRateDao mHeartRateDao, @aa1 ArrayList<RecordTimeList> mTimeList) {
        Intrinsics.X0O(mHeartRateDao, "mHeartRateDao");
        Intrinsics.X0O(mTimeList, "mTimeList");
        int size = mTimeList.size() - 2;
        int i = 0;
        int mBpm = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                for (HeartRate heartRate : mHeartRateDao.getHeartRates(mTimeList.get(i).getMTime(), mTimeList.get(i3).getMTime())) {
                    if (heartRate.getMBpm() > 0) {
                        mBpm += heartRate.getMBpm();
                        i2++;
                    }
                }
                if (i == size) {
                    break;
                }
                i = i3;
            }
            i = i2;
        }
        return i == 0 ? "0" : String.valueOf(mBpm / i);
    }

    @aa1
    public static final RecordDetailHeartRateData sportRecordHeartRateDetail(@aa1 HeartRateDao heartRateDao, @aa1 ArrayList<RecordTimeList> arrayList) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2;
        int mBpm;
        int i3;
        long j5;
        int mBpm2;
        int i4;
        HeartRateDao mHeartRateDao = heartRateDao;
        ArrayList<RecordTimeList> mTimeList = arrayList;
        Intrinsics.X0O(mHeartRateDao, "mHeartRateDao");
        Intrinsics.X0O(mTimeList, "mTimeList");
        ArrayList arrayList2 = new ArrayList();
        int size = mTimeList.size() - 2;
        long j6 = 0;
        if (size >= 0) {
            long j7 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            int i5 = 0;
            mBpm = 0;
            i3 = 0;
            int i6 = 0;
            int mBpm3 = 0;
            while (true) {
                j5 = j6;
                int i7 = i5 + 1;
                j4 = j7;
                List<HeartRate> heartRates = mHeartRateDao.getHeartRates(mTimeList.get(i5).getMTime(), mTimeList.get(i7).getMTime());
                int size2 = heartRates.size();
                mBpm2 = i6;
                for (int i8 = 0; i8 < size2; i8++) {
                    HeartRate heartRate = heartRates.get(i8);
                    if (mBpm3 == 0) {
                        mBpm3 = heartRate.getMBpm();
                    }
                    int mBpm4 = mBpm3;
                    if (heartRate.getMBpm() > 0) {
                        arrayList2.add(heartRate);
                        mBpm += heartRate.getMBpm();
                        if (mBpm2 < heartRate.getMBpm()) {
                            mBpm2 = heartRate.getMBpm();
                        }
                        if (mBpm4 > heartRate.getMBpm()) {
                            mBpm4 = heartRate.getMBpm();
                        }
                        i3++;
                        if (i8 < heartRates.size() - 1) {
                            long mTime = heartRates.get(i8 + 1).getMTime() - heartRate.getMTime();
                            i4 = mBpm4;
                            if (heartRate.getMBpm() >= 140) {
                                j5 += mTime;
                            } else if (heartRate.getMBpm() >= 114) {
                                j4 += mTime;
                            } else if (heartRate.getMBpm() >= 90) {
                                j += mTime;
                            } else if (heartRate.getMBpm() >= 80) {
                                j2 += mTime;
                            } else {
                                j3 += mTime;
                            }
                        } else {
                            i4 = mBpm4;
                        }
                        mBpm3 = i4;
                    } else {
                        mBpm3 = mBpm4;
                    }
                }
                if (i5 == size) {
                    break;
                }
                mHeartRateDao = heartRateDao;
                mTimeList = arrayList;
                i6 = mBpm2;
                i5 = i7;
                j6 = j5;
                j7 = j4;
            }
            i = mBpm2;
            i2 = mBpm3;
            j6 = j5;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
            j4 = 0;
            i = 0;
            i2 = 0;
            mBpm = 0;
            i3 = 0;
        }
        int i9 = i3 == 0 ? 0 : mBpm / i3;
        RecordDetailHeartRateData recordDetailHeartRateData = new RecordDetailHeartRateData();
        recordDetailHeartRateData.setMAvgHR(i9);
        recordDetailHeartRateData.setMMaxHR(i);
        recordDetailHeartRateData.setMMinHR(i2);
        recordDetailHeartRateData.getMHeartRateList().addAll(arrayList2);
        long j8 = 1000;
        long j9 = 60;
        recordDetailHeartRateData.setMStrenuous((j6 / j8) / j9);
        recordDetailHeartRateData.setMAnaerobic((j4 / j8) / j9);
        recordDetailHeartRateData.setMAerobic((j / j8) / j9);
        recordDetailHeartRateData.setMFatBurning((j2 / j8) / j9);
        recordDetailHeartRateData.setMWarmUp((j3 / j8) / j9);
        return recordDetailHeartRateData;
    }

    public static final boolean sportRecordLocation(@aa1 LocationDao mLocationDao, long j, long j2) {
        Intrinsics.X0O(mLocationDao, "mLocationDao");
        List<Location> location = mLocationDao.getLocation(j, j2);
        return location.isEmpty() || location.size() < 2;
    }

    @aa1
    public static final RecordActivityData sportRecordWorkout(long j, long j2, int i) {
        Workout workout = MyDb.INSTANCE.getMDatabase().workoutDao().getWorkout(j, j2);
        ArrayList arrayListIIiiO = CollectionsKt__CollectionsKt.iIiiO(new RecordTimeList(workout.getMStart(), 0), new RecordTimeList(workout.getMEnd(), 0));
        int mEnd = (int) ((workout.getMEnd() - workout.getMStart()) - ((long) (workout.getMDuration() * 1000)));
        if (mEnd < 10000) {
            mEnd = 0;
        }
        RecordActivityData recordActivityData = new RecordActivityData();
        recordActivityData.setMSportTimeStr(O0X11OiO.iXiX011(workout.getMDuration() * 1000));
        recordActivityData.setMPauseTimeTotal(O0X11OiO.iXiX011(mEnd));
        recordActivityData.getMTimeList().addAll(arrayListIIiiO);
        recordActivityData.setMAltitude(workout.getMAltitude());
        recordActivityData.setMSpm(workout.getMSpm());
        recordActivityData.setMStepTotal(workout.getMStep());
        recordActivityData.setMDistanceTotal(cp5.X1ii(workout.getMDistance(), i, false, 4, null));
        recordActivityData.setMCalorieTotal(workout.getMCalorie() / 1000);
        recordActivityData.setMSpeed(cp5.i11I(((double) workout.getMSpeed()) / 1000.0d, i));
        recordActivityData.setMPace(workout.getMPace());
        recordActivityData.setMAvgBpm(workout.getMAvgBpm());
        recordActivityData.setMMaxBpm(workout.getMMaxBpm());
        recordActivityData.setMMinBpm(workout.getMMinBpm());
        recordActivityData.setMMaxSpm(workout.getMMaxSpm());
        recordActivityData.setMMinSpm(workout.getMMinSpm());
        recordActivityData.setMMaxPace(workout.getMMaxPace());
        recordActivityData.setMMinPace(workout.getMMinPace());
        recordActivityData.setMMinStress(workout.getMMinStress());
        recordActivityData.setMMaxStress(workout.getMMaxStress());
        recordActivityData.setMAvgStress(workout.getMAvgStress());
        recordActivityData.setMPlatform(workout.getMPlatform());
        recordActivityData.setMAvgSpeed(workout.getMAvgSpeed());
        return recordActivityData;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0135 A[PHI: r8 r9 r10
  0x0135: PHI (r8v2 int) = (r8v1 int), (r8v4 int) binds: [B:6:0x004e, B:13:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r9v2 int) = (r9v1 int), (r9v4 int) binds: [B:6:0x004e, B:13:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r10v2 float) = (r10v1 float), (r10v4 float) binds: [B:6:0x004e, B:13:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @aa1
    public static final RecordDetailSpeedData sportRecordWorkoutDetailSpeed(@aa1 ArrayList<RecordTimeList> mTimeList, int i, int i2, @aa1 ArrayList<CustomLatLng> locationList) {
        Intrinsics.X0O(mTimeList, "mTimeList");
        Intrinsics.X0O(locationList, "locationList");
        LogUtils.m11128d("test mTimeList.size =  " + mTimeList.size());
        ArrayList arrayList = new ArrayList();
        int size = locationList.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            CustomLatLng customLatLng = locationList.get(i5);
            Intrinsics.O10IXXX0X(customLatLng, "get(...)");
            CustomLatLng customLatLng2 = customLatLng;
            if (i5 < locationList.size() - 1) {
                int i6 = i5 + 1;
                int distance = (int) DistanceUtil.getDistance(new LatLng(customLatLng2.getLatitude(), customLatLng2.getLongitude()), new LatLng(locationList.get(i6).getLatitude(), locationList.get(i6).getLongitude()));
                int iAbs = Math.abs((int) ((customLatLng2.getTime() - locationList.get(i6).getTime()) / ((long) 1000)));
                float fXO0X10iO = cp5.XO0X10iO(distance, iAbs, i2);
                LogUtils.m11128d("test " + f + " " + fXO0X10iO + "  " + distance + " " + iAbs + "  " + locationList.get(i5));
                if (f < fXO0X10iO && fXO0X10iO < 150.0f) {
                    f = fXO0X10iO;
                }
                i3 += distance;
                i4 += iAbs;
                float fO10IXXX0X = cp5.O10IXXX0X(i3, i2);
                if (fO10IXXX0X >= 1.0d) {
                    LogUtils.m11128d(" distanceToKmNumber " + i5 + " " + fO10IXXX0X);
                    arrayList.add(Integer.valueOf(cp5.XXO(fO10IXXX0X, i4)));
                    if (fO10IXXX0X > 1.0f && i5 == locationList.size() - 2) {
                        arrayList.add(Integer.valueOf(cp5.XXO(0.0f, iAbs)));
                    }
                    i3 = 0;
                    i4 = 0;
                }
            }
        }
        if (i3 > 0) {
            float fO10IXXX0X2 = cp5.O10IXXX0X(i3, i2);
            LogUtils.m11128d("last km " + fO10IXXX0X2 + " " + i4);
            if (arrayList.size() != 0 || mTimeList.isEmpty() || mTimeList.size() <= 1) {
                arrayList.add(Integer.valueOf(cp5.XXO(fO10IXXX0X2, i4)));
            } else {
                arrayList.add(Integer.valueOf(cp5.XXO(fO10IXXX0X2, (int) ((mTimeList.get(1).getMTime() - mTimeList.get(0).getMTime()) / ((long) 1000)))));
            }
        }
        RecordDetailSpeedData recordDetailSpeedData = new RecordDetailSpeedData();
        recordDetailSpeedData.setMFastestSpeed(f);
        recordDetailSpeedData.getMPaceList().addAll(arrayList);
        return recordDetailSpeedData;
    }

    @aa1
    public static final ArrayList<SportRecordData> getSportRecordList(long j, long j2, int i) {
        List<Workout> listDESC;
        ArrayList<SportRecordData> arrayList = new ArrayList<>();
        MyDb myDb = MyDb.INSTANCE;
        ActivityDao activityDao = myDb.getMDatabase().activityDao();
        WorkoutDao workoutDao = myDb.getMDatabase().workoutDao();
        arrayList.addAll(getActivityWorkoutList(activityDao.getListDESC(j, j2)));
        if (i != 0) {
            listDESC = workoutDao.getListModeDESC(j, j2, 116);
        } else {
            listDESC = workoutDao.getListDESC(j, j2, 0);
        }
        if (!listDESC.isEmpty()) {
            for (Workout workout : listDESC) {
                SportRecordData sportRecordData = new SportRecordData();
                sportRecordData.setMStartTime(workout.getMStart());
                sportRecordData.setMEndTime(workout.getMEnd());
                sportRecordData.setMMode(workout.getMMode());
                sportRecordData.setMSource(workout.getMSource() == 1 ? 2 : 1);
                sportRecordData.setMWorkoutId(workout.getMId());
                sportRecordData.setMDistance(workout.getMDistance());
                sportRecordData.setMPace(workout.getMPace());
                sportRecordData.setMCalorie(workout.getMCalorie());
                sportRecordData.setMDuration(workout.getMDuration());
                arrayList.add(sportRecordData);
            }
        }
        if (arrayList.size() > 1) {
            XiX0OOXI0.XOXiX0(arrayList, new Comparator() { // from class: com.sma.smartv3.model.SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(((SportRecordData) t2).getMStartTime()), Long.valueOf(((SportRecordData) t).getMStartTime()));
                }
            });
        }
        return arrayList;
    }
}
