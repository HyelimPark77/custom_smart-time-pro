package com.sma.smartv3.biz.fitness_site.strava;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.mltcode.paycertificationapi.OIO11II1;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.os0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.ServerProtocol;
import com.garmin.fit.Fit;
import com.garmin.fit.O001I;
import com.garmin.fit.SubSport;
import com.garmin.fit.XiOIii1;
import com.garmin.fit.Xii11I;
import com.garmin.fit.iXiX011;
import com.garmin.fit.iiII;
import com.google.gson.Gson;
import com.sma.smartv3.biz.fitness_site.strava.StravaManager;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.LocationData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,667:1\n15#2:668\n18#2,2:669\n15#2:671\n15#2:672\n18#2,2:673\n15#2:675\n11#2,2:676\n18#2,2:678\n15#2:680\n18#2,2:692\n15#2:694\n1563#3:681\n1634#3,3:682\n1869#3:685\n1870#3:687\n1869#3,2:688\n1869#3,2:690\n1#4:686\n29#5:695\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n*L\n65#1:668\n70#1:669,2\n70#1:671\n103#1:672\n135#1:673,2\n135#1:675\n152#1:676,2\n291#1:678,2\n291#1:680\n606#1:692,2\n606#1:694\n412#1:681\n412#1:682,3\n465#1:685\n465#1:687\n532#1:688,2\n542#1:690,2\n644#1:695\n*E\n"})
public final class StravaManager {

    @aa1
    private static final String CREATE_ACTIVITY = "https://www.strava.com/api/v3/activities";

    @aa1
    private static final String CREATE_UPLOAD = "https://www.strava.com/api/v3/uploads";
    private static final double EARTH_RADIUS = 6371000.0d;

    @aa1
    public static final StravaManager INSTANCE = new StravaManager();
    private static final int STATUS_CODE_UNAUTHORIZED = 401;

    @aa1
    private static final String TAG = "StravaManager";

    @aa1
    public static final String URL_AUTHORIZE = "https://www.strava.com/oauth/mobile/authorize";

    @aa1
    public static final String URL_CALLBACK = "http://localhost/auth/callback";

    @aa1
    private static final String URL_DEAUTHORIZE = "https://www.strava.com/oauth/deauthorize";

    @aa1
    private static final String URL_GET_TOKEN = "https://www.strava.com/oauth/token";

    private StravaManager() {
    }

    private final double calculateDistance(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double radians3 = Math.toRadians(d3);
        double radians4 = Math.toRadians(d4) - radians2;
        double d5 = 2;
        double d6 = (radians3 - radians) / d5;
        double d7 = radians4 / d5;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(radians) * Math.cos(radians3) * Math.sin(d7) * Math.sin(d7));
        return d5 * Math.atan2(Math.sqrt(dSin), Math.sqrt(((double) 1) - dSin)) * 6371000.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivity$default(StravaManager stravaManager, WorkoutIndex workoutIndex, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        stravaManager.createActivity(workoutIndex, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivityFitHeartRate$default(StravaManager stravaManager, WorkoutIndex workoutIndex, Function1 function1, StravaWorkout stravaWorkout, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        stravaManager.createActivityFitHeartRate(workoutIndex, function1, stravaWorkout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deauthorizeStrava$default(StravaManager stravaManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        stravaManager.deauthorizeStrava(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleStravaAppIntent$lambda$0$0(Function1 function1, boolean z) {
        function1.invoke2(Boolean.valueOf(z));
        return Unit.OXO1;
    }

    private final void updateWorkoutIndexStravaSynced(WorkoutIndex workoutIndex) {
        WorkoutIndexDao workoutIndexDao = MyDb.INSTANCE.getMDatabase().workoutIndexDao();
        workoutIndex.setMSyncStatus(workoutIndex.getMSyncStatus() | 1);
        workoutIndexDao.update(workoutIndex);
    }

    @aa1
    public final Pair<Double, Double> bd09ToWgs84(double d, double d2) {
        double d3 = d2 - 0.0065d;
        double d4 = d - 0.006d;
        double dSqrt = Math.sqrt((d3 * d3) + (d4 * d4)) - (Math.sin(d4 * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d4, d3) - (Math.cos(d3 * 52.35987755982988d) * 3.0E-6d);
        return new Pair<>(Double.valueOf(Math.sin(dAtan2) * dSqrt), Double.valueOf(dSqrt * Math.cos(dAtan2)));
    }

    @aa1
    public final Pair<Integer, Integer> convertToInteger(double d, double d2) {
        return new Pair<>(Integer.valueOf((int) Math.round(d * 1.1930464705555556E7d)), Integer.valueOf((int) Math.round(d2 * 1.1930464705555556E7d)));
    }

    public final void createActivity(@aa1 WorkoutIndex workoutIndex, @tb1 Function1<? super Boolean, Unit> function1) {
        boolean zCreateUpload;
        Intrinsics.X0O(workoutIndex, "workoutIndex");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("StravaManager createActivity workoutIndex -> " + workoutIndex);
        if ((workoutIndex.getMSyncStatus() & 1) <= 0) {
            StravaWorkout stravaWorkoutXO0O10 = XXI0Xi.XO0O10(workoutIndex);
            if (stravaWorkoutXO0O10 == null) {
                updateWorkoutIndexStravaSynced(workoutIndex);
                if (function1 != null) {
                    function1.invoke2(Boolean.TRUE);
                }
            } else {
                i1o0oxo1o.OXO1("StravaManager createActivity stravaWorkout -> " + stravaWorkoutXO0O10);
                try {
                    try {
                        if (i72.OXO1.iiX0i1IX()) {
                            createActivityFitHeartRate(workoutIndex, function1, stravaWorkoutXO0O10);
                            return;
                        }
                        List<Location> location = MyDb.INSTANCE.getMDatabase().locationDao().getLocation(stravaWorkoutXO0O10.getMStart(), stravaWorkoutXO0O10.getMEnd());
                        if (location.isEmpty() || location.size() < 2) {
                            zCreateUpload = false;
                        } else {
                            LocationData locationData = LocationData.INSTANCE;
                            locationData.getSmoothLocationListAlgorithm(LocationData.getFinalLocationList$default(locationData, location, true, false, 4, null), stravaWorkoutXO0O10.getMMode());
                            String strValueOf = String.valueOf(workoutIndex.getMEndTime());
                            File file = new File(uz0.iOO1ii1(sz0.OXO1), strValueOf);
                            ArrayList<CustomLatLng> finalLocationList$default = LocationData.getFinalLocationList$default(locationData, location, true, false, 4, null);
                            long mStart = stravaWorkoutXO0O10.getMStart();
                            String string = Utils.getApp().getString(R.string.app_name);
                            Intrinsics.O10IXXX0X(string, "getString(...)");
                            FileIOUtils.writeFileFromString(file, locationData.getGpxFileString(finalLocationList$default, mStart, string, stravaWorkoutXO0O10.getMName()));
                            zCreateUpload = INSTANCE.createUpload(strValueOf, stravaWorkoutXO0O10.getMName(), file, uz0.X0i1O);
                        }
                        if (!zCreateUpload) {
                            int mDistance = (stravaWorkoutXO0O10.getMDistance() / 10) * 10;
                            ANRequest.PostRequestBuilder postRequestBuilderPost = AndroidNetworking.post(CREATE_ACTIVITY);
                            Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), (Class<Object>) StravaToken.class);
                            if (objFromJson == null) {
                                objFromJson = StravaToken.class.newInstance();
                            }
                            ANResponse aNResponseExecuteForJSONObject = postRequestBuilderPost.addBodyParameter("access_token", ((StravaToken) objFromJson).getAccess_token()).addBodyParameter("name", stravaWorkoutXO0O10.getMName()).addBodyParameter("type", stravaWorkoutXO0O10.getMType()).addBodyParameter("start_date_local", stravaWorkoutXO0O10.getMStartTime()).addBodyParameter("elapsed_time", String.valueOf(stravaWorkoutXO0O10.getMElapsedTime())).addBodyParameter(os0.OII, String.valueOf(mDistance)).setTag((Object) "StravaManager createActivity").setPriority(Priority.HIGH).build().executeForJSONObject();
                            i1o0oxo1o.OXO1("StravaManager createActivity -> response.error:" + aNResponseExecuteForJSONObject.getError() + " response.result:" + aNResponseExecuteForJSONObject.getResult());
                        }
                        updateWorkoutIndexStravaSynced(workoutIndex);
                        if (function1 != null) {
                            function1.invoke2(Boolean.TRUE);
                        }
                    } catch (Exception e) {
                        e = e;
                        i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                        e.printStackTrace();
                        i1o0oxo1o2.OXO1("StravaManager createActivity -> exception : " + Unit.OXO1);
                        if (function1 != null) {
                            function1.invoke2(Boolean.FALSE);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } else if (function1 != null) {
            function1.invoke2(Boolean.TRUE);
        }
    }

    public final void createActivityFitHeartRate(@aa1 WorkoutIndex workoutIndex, @tb1 Function1<? super Boolean, Unit> function1, @aa1 StravaWorkout stravaWorkout) {
        Pair<Integer, Integer> pairConvertToInteger;
        short mBpm;
        Object next;
        Object next2;
        Location location;
        Intrinsics.X0O(workoutIndex, "workoutIndex");
        Intrinsics.X0O(stravaWorkout, "stravaWorkout");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("StravaManager createActivityFitHeartRate");
        String str = workoutIndex.getMEndTime() + ".fit";
        File file = new File(uz0.IXXOO(sz0.OXO1), str);
        iXiX011 ixix011 = new iXiX011(file, Fit.ProtocolVersion.V2_0);
        O001I o001i = new O001I();
        o001i.m15058II(com.garmin.fit.File.ACTIVITY);
        o001i.iO11i(1);
        o001i.OI1IiOO1i(1);
        o001i.iX0iii0(123456789L);
        o001i.X11("FIT Cookbook");
        long j = 1000;
        o001i.XOOI0O(new OIO11II1(stravaWorkout.getMStart() / j));
        ixix011.IiI10X(o001i);
        XiOIii1 xiOIii1 = new XiOIii1();
        xiOIii1.iO11i((short) 0);
        xiOIii1.m15109XI(111L);
        ixix011.IiI10X(xiOIii1);
        iiII iiii = new iiII();
        iiii.IiiO11(0);
        iiii.ii1(0);
        iiii.XOiO0OX0(1);
        iiii.iO1iI(new OIO11II1((stravaWorkout.getMStart() - 631065600000L) / j));
        iiii.IIII01Ii(Float.valueOf(stravaWorkout.getMElapsedTime()));
        iiii.iXIiO(Float.valueOf(stravaWorkout.getMDistance()));
        iiii.iXO(Integer.valueOf(stravaWorkout.getMCalorie() / 1000));
        iiii.OIii(Short.valueOf((short) stravaWorkout.getMAvgBpm()));
        iiii.OOO(Short.valueOf((short) stravaWorkout.getMMaxBpm()));
        iiii.X1iOII0(Short.valueOf((short) stravaWorkout.getMMinBpm()));
        iiii.I1OX001(StravaWorkout.Companion.getTypeByActivityModeType(stravaWorkout.getMMode()));
        iiii.ii0Iii1i(SubSport.GENERIC);
        ixix011.IiI10X(iiii);
        MyDb myDb = MyDb.INSTANCE;
        List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(myDb.getMDatabase().locationDao().getLocation(stravaWorkout.getMStart(), stravaWorkout.getMEnd()));
        List<HeartRate> heartRates = myDb.getMDatabase().heartRateDao().getHeartRates(stravaWorkout.getMStart(), stravaWorkout.getMEnd());
        List<Activity> listDESC = myDb.getMDatabase().activityDao().getListDESC(stravaWorkout.getMStart(), stravaWorkout.getMEnd());
        i1o0oxo1o.OXO1("StravaManager createActivityFitHeartRate  stravaWorkout = " + stravaWorkout + " ,  mElapsedTime = " + stravaWorkout.getMElapsedTime() + " , locationList = " + listOO0Oi10.size() + ", heartRateList = " + heartRates.size() + "  , activityList = " + listDESC.size());
        if (!listOO0Oi10.isEmpty() && listOO0Oi10.size() >= 2) {
            long mTime = ((Location) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi10)).getMTime() - ((Location) CollectionsKt___CollectionsKt.IIII0iI(listOO0Oi10)).getMTime();
            List<Location> list = listOO0Oi10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Location location2 = null;
            Location location3 = null;
            float f = 0.0f;
            float f2 = 0.0f;
            for (Location location4 : list) {
                if (location2 == null) {
                    location3 = location4;
                } else {
                    double dCalculateDistance = INSTANCE.calculateDistance(location2.getMLatitude(), location2.getMLongitude(), location4.getMLatitude(), location4.getMLongitude());
                    if (dCalculateDistance > 0.0d) {
                        f2 = (float) dCalculateDistance;
                        f += f2;
                    } else {
                        location2 = location3;
                    }
                    location3 = location2;
                }
                arrayList.add(Unit.OXO1);
                location2 = location4;
                list = list;
            }
            List list2 = list;
            i1O0OXO1O.OXO1.OXO1("StravaManager  addLocationStart saveDistance = " + f2 + " ,  sum = " + f);
            float mDistance = ((float) stravaWorkout.getMDistance()) - f;
            float f3 = mDistance / f2;
            float mElapsedTime = (((float) stravaWorkout.getMElapsedTime()) - ((float) (mTime / j))) / f3;
            Location location5 = (Location) CollectionsKt___CollectionsKt.Xi1XO00(listOO0Oi10);
            if (mDistance > 0.0f) {
                int i = (int) f3;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    int i3 = i;
                    float f4 = mElapsedTime;
                    long mTime2 = location5.getMTime() + ((long) ((int) (1000 * mElapsedTime)));
                    location5.setMTime(mTime2);
                    boolean z2 = !z;
                    if (z) {
                        location = location3;
                        listOO0Oi10.add(location5);
                    } else {
                        Intrinsics.XXI(location3);
                        location = location3;
                        location.setMTime(mTime2);
                        listOO0Oi10.add(location);
                    }
                    i2++;
                    z = z2;
                    location3 = location;
                    i = i3;
                    mElapsedTime = f4;
                }
            }
            i1O0OXO1O.OXO1.OXO1("StravaManager  addLocationEnd locationList = " + listOO0Oi10.size() + " , mDistanceSum = " + stravaWorkout.getMDistance());
            Iterator it = list2.iterator();
            Location location6 = null;
            float fCalculateDistance = 0.0f;
            short s = 0;
            while (it.hasNext()) {
                Location location7 = (Location) it.next();
                Xii11I xii11I = new Xii11I();
                Iterator it2 = it;
                short s2 = s;
                xii11I.OXO1(new OIO11II1(location7.getMTime() / j));
                if (a01.OXO1.OXO1().getBoolean(b01.XiOIO, false)) {
                    StravaManager stravaManager = INSTANCE;
                    Pair<Double, Double> pairBd09ToWgs84 = stravaManager.bd09ToWgs84(location7.getMLatitude(), location7.getMLongitude());
                    pairConvertToInteger = stravaManager.convertToInteger(pairBd09ToWgs84.component1().doubleValue(), pairBd09ToWgs84.component2().doubleValue());
                } else {
                    pairConvertToInteger = INSTANCE.convertToInteger(location7.getMLatitude(), location7.getMLongitude());
                }
                int iIntValue = pairConvertToInteger.component1().intValue();
                int iIntValue2 = pairConvertToInteger.component2().intValue();
                xii11I.X0XI11I(Integer.valueOf(iIntValue));
                xii11I.O1I(Integer.valueOf(iIntValue2));
                if (location7.getMAltitude() != 0) {
                    xii11I.OXOI0XII(Float.valueOf(location7.getMAltitude()));
                }
                if (i72.OXO1.OXXO0O1X()) {
                    Iterator<T> it3 = heartRates.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((HeartRate) next2).getMTime() < location7.getMTime());
                    HeartRate heartRate = (HeartRate) next2;
                    mBpm = heartRate != null ? (byte) heartRate.getMBpm() : s2;
                    if (!heartRates.isEmpty() && mBpm > 0) {
                        xii11I.I0i(Short.valueOf(mBpm));
                    }
                } else {
                    mBpm = s2;
                }
                if (location6 != null) {
                    fCalculateDistance += (float) INSTANCE.calculateDistance(location6.getMLatitude(), location6.getMLongitude(), location7.getMLatitude(), location7.getMLongitude());
                    xii11I.i0I1i0Xi(Float.valueOf(fCalculateDistance));
                    xii11I.OXOI0XII(Float.valueOf(location7.getMAltitude()));
                }
                Iterator<T> it4 = listDESC.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((Activity) next).getMTime() < location7.getMTime());
                Activity activity = (Activity) next;
                if (activity != null) {
                    xii11I.Xi1XO00(Integer.valueOf((byte) (activity.getMCalorie() / 1000)));
                }
                ixix011.IiI10X(xii11I);
                s = mBpm;
                location6 = location7;
                it = it2;
            }
        } else if (!heartRates.isEmpty()) {
            for (HeartRate heartRate2 : heartRates) {
                Xii11I xii11I2 = new Xii11I();
                xii11I2.OXO1(new OIO11II1(heartRate2.getMTime() / j));
                if (i72.OXO1.OXXO0O1X()) {
                    xii11I2.I0i(Short.valueOf((byte) heartRate2.getMBpm()));
                }
                ixix011.IiI10X(xii11I2);
            }
        } else if (!listDESC.isEmpty()) {
            for (Activity activity2 : listDESC) {
                Xii11I xii11I3 = new Xii11I();
                xii11I3.OXO1(new OIO11II1(activity2.getMTime() / j));
                xii11I3.i0I1i0Xi(Float.valueOf((byte) activity2.getMDistance()));
                xii11I3.Xi1XO00(Integer.valueOf((byte) (activity2.getMCalorie() / 1000)));
                ixix011.IiI10X(xii11I3);
            }
        }
        i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
        i1o0oxo1o2.OXO1("StravaManager createActivityFitHeartRate  createFile");
        ixix011.XIi00iiXO();
        i1o0oxo1o2.OXO1("StravaManager createActivityFitHeartRate  createFile  isUploadFit = " + createUpload(str, stravaWorkout.getMName(), file, uz0.iIXi1iiXI) + " ");
        updateWorkoutIndexStravaSynced(workoutIndex);
        if (function1 != null) {
            function1.invoke2(Boolean.TRUE);
        }
    }

    public final boolean createUpload(@aa1 String externalId, @aa1 String name, @aa1 File file, @aa1 String data_type) {
        Intrinsics.X0O(externalId, "externalId");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(data_type, "data_type");
        try {
            ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(CREATE_UPLOAD);
            Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), (Class<Object>) StravaToken.class);
            if (objFromJson == null) {
                objFromJson = StravaToken.class.newInstance();
            }
            ANResponse aNResponseExecuteForJSONObject = multiPartBuilderUpload.addMultipartParameter("access_token", ((StravaToken) objFromJson).getAccess_token()).addMultipartParameter("name", name).addMultipartParameter("data_type", data_type).addMultipartParameter("external_id", externalId).addMultipartFile("file", file).setTag((Object) "StravaManager createUpload").setPriority(Priority.HIGH).build().executeForJSONObject();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("StravaManager createUpload -> " + externalId + " response.error:" + aNResponseExecuteForJSONObject.getError() + " , response.result:" + aNResponseExecuteForJSONObject.getResult());
            if (aNResponseExecuteForJSONObject.getResult() == null) {
                return false;
            }
            i1o0oxo1o.OXO1("StravaManager createUpload -> file = " + file.getAbsolutePath() + " ");
            return true;
        } catch (Exception e) {
            i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
            e.printStackTrace();
            i1o0oxo1o2.OXO1("StravaManager createUpload -> exception : " + Unit.OXO1);
            return false;
        }
    }

    public final void deauthorizeStrava(@tb1 final Function1<? super Boolean, Unit> function1) {
        StravaToken stravaToken = (StravaToken) new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), StravaToken.class);
        if (stravaToken == null || stravaToken.getAccess_token().length() == 0) {
            return;
        }
        AndroidNetworking.post(URL_DEAUTHORIZE).addBodyParameter("access_token", stravaToken.getAccess_token()).setTag((Object) "StravaManager deauthorizeStrava").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.fitness_site.strava.StravaManager.deauthorizeStrava.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                Intrinsics.X0O(anError, "anError");
                if (anError.getErrorCode() == 401) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                    }
                    a01.OXO1.IiI10X().remove(StravaToken.class.getName());
                    return;
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject response) {
                Intrinsics.X0O(response, "response");
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
                a01.OXO1.IiI10X().remove(StravaToken.class.getName());
            }
        });
    }

    public final void getToken(@aa1 Context context, @aa1 String code, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", context.getString(R.string.strava_client_id)).addBodyParameter("client_secret", context.getString(R.string.strava_client_secret)).addBodyParameter("code", code).setTag((Object) "StravaManager getToken").setPriority(Priority.HIGH).build().getAsObject(StravaToken.class, new ParsedRequestListener<StravaToken>() { // from class: com.sma.smartv3.biz.fitness_site.strava.StravaManager.getToken.1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError anError) {
                Intrinsics.X0O(anError, "anError");
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(StravaToken response) {
                Intrinsics.X0O(response, "response");
                a01.OXO1.IiI10X().put(StravaToken.class.getName(), new Gson().toJson(response));
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    public final void handleStravaAppIntent(@aa1 Context context, @aa1 Intent intent, @aa1 final Function1<? super Boolean, Unit> callback) {
        String queryParameter;
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(intent, "intent");
        Intrinsics.X0O(callback, "callback");
        i1O0OXO1O.OXO1.OXO1("StravaManager handleStravaAppIntent -> data: " + intent.getData());
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter("code")) == null) {
            return;
        }
        INSTANCE.getToken(context, queryParameter, new Function1() { // from class: com.android.mltcode.paycertificationapi.ob5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StravaManager.handleStravaAppIntent$lambda$0$0(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final boolean isEnabled() {
        return new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), StravaToken.class) != null;
    }

    public final boolean isExpired() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), (Class<Object>) StravaToken.class);
        if (objFromJson == null) {
            objFromJson = StravaToken.class.newInstance();
        }
        return System.currentTimeMillis() > (((StravaToken) objFromJson).getExpires_at() * 1000) - TimeUnit.MINUTES.toMillis(5L);
    }

    public final boolean refreshToken(@aa1 Context context) throws IllegalAccessException, InstantiationException {
        StravaToken stravaToken;
        Intrinsics.X0O(context, "context");
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), (Class<Object>) StravaToken.class);
        if (objFromJson == null) {
            objFromJson = StravaToken.class.newInstance();
        }
        try {
            Object result = AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", context.getString(R.string.strava_client_id)).addBodyParameter("client_secret", context.getString(R.string.strava_client_secret)).addBodyParameter("grant_type", cd1.f5954IO).addBodyParameter(cd1.f5954IO, ((StravaToken) objFromJson).getRefresh_token()).setTag((Object) "StravaManager refreshToken").setPriority(Priority.HIGH).build().executeForObject(StravaToken.class).getResult();
            Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.strava.StravaToken");
            stravaToken = (StravaToken) result;
        } catch (Exception unused) {
            stravaToken = null;
        }
        if (stravaToken == null) {
            return false;
        }
        a01.OXO1.IiI10X().put(StravaToken.class.getName(), new Gson().toJson(stravaToken));
        return true;
    }

    public final void toStravaAppAuthorize(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        Uri uriBuild = Uri.parse(URL_AUTHORIZE).buildUpon().appendQueryParameter("client_id", context.getString(R.string.strava_client_id)).appendQueryParameter("redirect_uri", "strava://localhost/" + AppUtils.getAppPackageName() + "/callback").appendQueryParameter(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code").appendQueryParameter("approval_prompt", "auto").appendQueryParameter("scope", "activity:write").build();
        i1O0OXO1O.OXO1.OXO1("StravaManager toStravaAppAuthorize -> data: " + uriBuild);
        context.startActivity(new Intent("android.intent.action.VIEW", uriBuild));
    }
}
