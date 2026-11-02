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
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n19#2:475\n15#2:476\n1869#3,2:477\n1011#3,2:479\n1878#3,3:481\n1878#3,3:484\n*S KotlinDebug\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n*L\n60#1:475\n60#1:476\n73#1:477,2\n168#1:479,2\n392#1:481,3\n436#1:484,3\n*E\n"})
public final class TodayHealthyDataKt {
    private static final void addDeepLengthData(int i, List<Sleep> list, List<TodayData> list2, int i2, Function1<? super Integer, Unit> function1, SleepAllDayData sleepAllDayData) {
        int i3 = 0;
        if (i == 0) {
            function1.invoke2(0);
            return;
        }
        int i4 = 0;
        long mTime = 0;
        long mTime2 = 0;
        for (Object obj : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Sleep sleep = (Sleep) obj;
            if (sleep.getMMode() == 17 && mTime2 == 0) {
                mTime2 = sleep.getMTime();
                i4 = i3;
            } else if (sleep.getMMode() == 34 && mTime2 != 0 && mTime == 0) {
                if (i4 + 1 != i3) {
                    mTime = sleep.getMTime();
                } else {
                    mTime2 = 0;
                }
            }
            i3 = i5;
        }
        int i6 = i2 + i;
        list2.add(new TodayData(mTime, UtilsKt.XXO(R.string.night_sleep), "", (i6 / 60) + UtilsKt.XXO(R.string.f54354h) + (i6 % 60) + UtilsKt.XXO(R.string.h_m), 0, "sleep", 0, null, i2, 0.0f, 720, null));
        function1.invoke2(Integer.valueOf(sleepAllDayData.getTotal()));
    }

    public static final void addHealthyDataBloodOxy(@aa1 List<TodayData> list, int i, long j, @aa1 String mExtraInfo) {
        String strXXO;
        int i2;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        if (i >= 92) {
            strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
            i2 = 2;
        } else {
            strXXO = UtilsKt.XXO(R.string.data_lower);
            i2 = 1;
        }
        String str = strXXO;
        int i3 = i2;
        list.add(new TodayData(j, UtilsKt.XXO(R.string.blood_oxygen), i + "%", str, i3, q62.IiOIO1OX, 0, mExtraInfo, i, 0.0f, 576, null));
    }

    public static /* synthetic */ void addHealthyDataBloodOxy$default(List list, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        addHealthyDataBloodOxy(list, i, j, str);
    }

    public static final void addHealthyDataBloodPressure(@aa1 List<TodayData> list, int i, int i2, long j, @aa1 String mExtraInfo) {
        String strXXO;
        int i3;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        if (i >= 130) {
            strXXO = UtilsKt.XXO(R.string.lightness_high);
            i3 = 3;
        } else if (i >= 90) {
            strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
            i3 = 2;
        } else {
            strXXO = UtilsKt.XXO(R.string.data_lower);
            i3 = 1;
        }
        String str = strXXO;
        int i4 = i3;
        list.add(new TodayData(j, UtilsKt.XXO(R.string.blood_oxygen), UtilsKt.XXO(R.string.systolic_pressure) + CertificateUtil.DELIMITER + i + "\n" + UtilsKt.XXO(R.string.diastolic_pressure) + CertificateUtil.DELIMITER + i2, str, i4, q62.OXOXXiI, 0, mExtraInfo, i, i2, 64, null));
    }

    public static /* synthetic */ void addHealthyDataBloodPressure$default(List list, int i, int i2, long j, String str, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            str = "";
        }
        addHealthyDataBloodPressure(list, i, i2, j, str);
    }

    public static final void addHealthyDataHeart(@aa1 List<TodayData> list, int i, long j, @aa1 String mExtraInfo) {
        String strXXO;
        int i2;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        if (i >= 0 && i < 61) {
            strXXO = UtilsKt.XXO(R.string.data_lower);
            i2 = 1;
        } else if (61 > i || i >= 101) {
            strXXO = UtilsKt.XXO(R.string.data_high);
            i2 = 3;
        } else {
            strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
            i2 = 2;
        }
        String str = strXXO;
        int i3 = i2;
        list.add(new TodayData(j, UtilsKt.XXO(R.string.heart_rate), i + UtilsKt.XXO(R.string.bpm), str, i3, "heart_rate", 0, mExtraInfo, i, 0.0f, 576, null));
    }

    public static /* synthetic */ void addHealthyDataHeart$default(List list, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        addHealthyDataHeart(list, i, j, str);
    }

    public static final void addHealthyDataPressure(@aa1 List<TodayData> list, int i, long j, @aa1 String mExtraInfo) {
        int i2;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        String strXXO = UtilsKt.XXO(R.string.pressure_level_overstress);
        if (i < 25) {
            strXXO = UtilsKt.XXO(R.string.pressure_level_relax);
            i2 = 2;
        } else if (i < 50) {
            strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
            i2 = 1;
        } else if (i < 75) {
            strXXO = UtilsKt.XXO(R.string.pressure_level_moderate_stress);
            i2 = 0;
        } else {
            i2 = 3;
        }
        list.add(new TodayData(j, UtilsKt.XXO(R.string.pressure), String.valueOf(i), strXXO, i2, q62.IIII0II, 0, mExtraInfo, i, 0.0f, 576, null));
    }

    public static /* synthetic */ void addHealthyDataPressure$default(List list, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        addHealthyDataPressure(list, i, j, str);
    }

    private static final void addPiecemealData(int i, List<Sleep> list, List<TodayData> list2) {
        if (!q62.OXO1.IXi01O() || i == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        long mTime = 0;
        long mTime2 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Sleep sleep = (Sleep) obj;
            if (sleep.getMMode() == 17 && mTime == 0) {
                mTime = sleep.getMTime();
                i3 = i2;
            } else if (sleep.getMMode() == 34 && mTime != 0) {
                mTime2 = sleep.getMTime();
            } else if (i3 + 1 == i2 && mTime2 == 0) {
                mTime = 0;
            }
            i2 = i4;
        }
        addPiecemealTime(mTime, mTime2, list2, i);
    }

    private static final void addPiecemealTime(long j, long j2, List<TodayData> list, int i) {
        if (j == 0 || j2 == 0) {
            return;
        }
        list.add(new TodayData(j2, UtilsKt.XXO(R.string.piecemeal), "", (i / 60) + UtilsKt.XXO(R.string.f54354h) + (i % 60) + UtilsKt.XXO(R.string.h_m), 0, "sleep", 0, null, i, j, 208, null));
    }

    private static final void addWorkList(Workout workout, List<TodayData> list, AppUser appUser) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.X0XI11I(q62Var, workout.getMMode(), false, 2, null)) {
            str = cp5.X1ii(workout.getMDistance(), appUser.getUnit(), false, 4, null) + UtilsKt.XXO(cp5.XX0(appUser.getUnit())) + " " + (workout.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal);
        } else {
            str = (workout.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal);
        }
        list.add(new TodayData(workout.getMEnd(), q62Var.i01OOiI(workout.getMMode()), str, O0X11OiO.iXiX011(workout.getMDuration() * 1000), 0, "sportRecord", workout.getMId(), null, 0.0f, 0.0f, 896, null));
    }

    public static final void getBloodOxyDataHeart(@aa1 List<BloodOxygen> bloodOxygenList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(bloodOxygenList, "bloodOxygenList");
        Intrinsics.X0O(list, "list");
        if (bloodOxygenList.isEmpty()) {
            return;
        }
        BloodOxygen bloodOxygen = (BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(bloodOxygenList);
        addHealthyDataBloodOxy$default(list, bloodOxygen.getMValue(), bloodOxygen.getMTime(), null, 8, null);
    }

    public static final void getBloodPressureDataHeart(@aa1 List<BloodPressure> bloodPressureList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(bloodPressureList, "bloodPressureList");
        Intrinsics.X0O(list, "list");
        if (bloodPressureList.isEmpty()) {
            return;
        }
        BloodPressure bloodPressure = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(bloodPressureList);
        addHealthyDataBloodPressure$default(list, bloodPressure.getMSystolic(), bloodPressure.getMDiastolic(), bloodPressure.getMTime(), null, 16, null);
    }

    public static final void getHealthyDataHeart(@aa1 List<HeartRate> heartList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(heartList, "heartList");
        Intrinsics.X0O(list, "list");
        if (heartList.isEmpty()) {
            return;
        }
        HeartRate heartRate = (HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(heartList);
        addHealthyDataHeart$default(list, heartRate.getMBpm(), heartRate.getMTime(), null, 8, null);
    }

    public static final void getHealthyDataPressure(@aa1 List<Pressure> pressureList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(pressureList, "pressureList");
        Intrinsics.X0O(list, "list");
        if (pressureList.isEmpty()) {
            return;
        }
        Pressure pressure = (Pressure) CollectionsKt___CollectionsKt.Xi1XO00(pressureList);
        addHealthyDataPressure$default(list, pressure.getMValue(), pressure.getMTime(), null, 8, null);
    }

    @aa1
    public static final List<TodayData> getItemHealthyData(boolean z, @aa1 Function1<? super Integer, Unit> callback) {
        String strXXO;
        int i;
        Intrinsics.X0O(callback, "callback");
        ArrayList arrayList = new ArrayList();
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        MyDb myDb = MyDb.INSTANCE;
        getHealthyDataHeart(myDb.getMDatabase().heartRateDao().getHeartRates(jArrIOOX010X[0], jArrIOOX010X[1]), arrayList);
        getBloodOxyDataHeart(myDb.getMDatabase().bloodOxygenDao().getBloodOxygen(jArrIOOX010X[0], jArrIOOX010X[1]), arrayList);
        List listDESC$default = WorkoutDao.getListDESC$default(myDb.getMDatabase().workoutDao(), jArrIOOX010X[0], jArrIOOX010X[1], 0, 4, (Object) null);
        if (!listDESC$default.isEmpty()) {
            Iterator it = listDESC$default.iterator();
            while (it.hasNext()) {
                addWorkList((Workout) it.next(), arrayList, appUser2);
            }
        }
        MyDb myDb2 = MyDb.INSTANCE;
        getHealthyDataPressure(myDb2.getMDatabase().pressureDao().getPressures(jArrIOOX010X[0], jArrIOOX010X[1]), arrayList);
        getSleepList(myDb2.getMDatabase().sleepDao().getSleeps(jArrIOOX010X[0] - ((long) 28800000), jArrIOOX010X[1]), arrayList, jArrIOOX010X[0], callback);
        List<Hrv> hrv = myDb2.getMDatabase().hrvDao().getHrv(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (!hrv.isEmpty()) {
            Hrv hrv2 = (Hrv) CollectionsKt___CollectionsKt.Xi1XO00(hrv);
            arrayList.add(new TodayData(hrv2.getMTime(), UtilsKt.XXO(R.string.hrv), hrv2.getMValue() + UtilsKt.XXO(R.string.f54362ms), null, 0, q62.XOX1, 0, null, hrv2.getMValue(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
        }
        List<BloodPressure> bloodPressures = myDb2.getMDatabase().bloodPressureDao().getBloodPressures(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (!bloodPressures.isEmpty()) {
            BloodPressure bloodPressure = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(bloodPressures);
            if (bloodPressure.getMSystolic() >= 140 || bloodPressure.getMDiastolic() >= 90) {
                strXXO = UtilsKt.XXO(R.string.data_high);
                i = 3;
            } else if (bloodPressure.getMSystolic() >= 90 || bloodPressure.getMDiastolic() >= 60) {
                strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
                i = 2;
            } else {
                strXXO = UtilsKt.XXO(R.string.data_lower);
                i = 1;
            }
            arrayList.add(new TodayData(bloodPressure.getMTime(), UtilsKt.XXO(R.string.blood_pressure), bloodPressure.getMSystolic() + "/" + bloodPressure.getMDiastolic(), strXXO, i, q62.OXOXXiI, 0, null, bloodPressure.getMSystolic(), bloodPressure.getMDiastolic(), 192, null));
        }
        List<Temperature> listDesc = myDb2.getMDatabase().temperatureDao().getListDesc(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (!listDesc.isEmpty()) {
            Temperature temperature = (Temperature) CollectionsKt___CollectionsKt.Xi1XO00(listDesc);
            arrayList.add(new TodayData(temperature.getMTime(), UtilsKt.XXO(R.string.temperature), String.valueOf(cp5.i010I(temperature.getMTemperature() / 10.0f, cp5.II1Xi0(appUser2.getUnit()) == 1)), null, 0, "temperature", 0, null, temperature.getMTemperature(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
        }
        List<BloodGlucose> listDesc2 = myDb2.getMDatabase().bloodGlucoseDao().getListDesc(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (!listDesc2.isEmpty()) {
            BloodGlucose bloodGlucose = (BloodGlucose) CollectionsKt___CollectionsKt.Xi1XO00(listDesc2);
            arrayList.add(new TodayData(bloodGlucose.getMTime(), UtilsKt.XXO(R.string.blood_glucose), String.valueOf(bloodGlucose.getMValue()), null, 0, q62.Oi0X, 0, null, bloodGlucose.getMValue(), 0.0f, PtStep.EVT_JUDGE_UPDATED, null));
        }
        if (arrayList.size() > 1) {
            XiX0OOXI0.XOXiX0(arrayList, new Comparator() { // from class: com.sma.smartv3.model.TodayHealthyDataKt$getItemHealthyData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(-((TodayData) t).getTime()), Long.valueOf(-((TodayData) t2).getTime()));
                }
            });
        }
        return (z || arrayList.size() <= 3) ? arrayList : CollectionsKt___CollectionsKt.OO0Oi10(CollectionsKt___CollectionsKt.IO0OOi(arrayList, 3));
    }

    public static /* synthetic */ List getItemHealthyData$default(boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getItemHealthyData(z, function1);
    }

    private static final void getSleepList(List<Sleep> list, List<TodayData> list2, long j, Function1<? super Integer, Unit> function1) {
        if (list.isEmpty()) {
            return;
        }
        SleepAllDayData sleepAllDayDataFilterData = SleepAllDayDataParse.INSTANCE.filterData(list, 100.0f, null, j);
        addPiecemealData(sleepAllDayDataFilterData.getStatus().get(8), list, list2);
        addDeepLengthData(sleepAllDayDataFilterData.getTotal(), list, list2, 0, function1, sleepAllDayDataFilterData);
    }

    public static /* synthetic */ void getSleepList$default(List list, List list2, long j, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        getSleepList(list, list2, j, function1);
    }
}
