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
import com.android.mltcode.paycertificationapi.ob5;
import com.android.mltcode.paycertificationapi.os0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.garmin.fit.Fit;
import com.garmin.fit.O001I;
import com.garmin.fit.SubSport;
import com.garmin.fit.XiOIii1;
import com.garmin.fit.Xii11I;
import com.garmin.fit.iXiX011;
import com.garmin.fit.iiII;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.WorkoutIndex;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.LocationData;
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

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,667:1\n15#2:668\n18#2,2:669\n15#2:671\n15#2:672\n18#2,2:673\n15#2:675\n11#2,2:676\n18#2,2:678\n15#2:680\n18#2,2:692\n15#2:694\n1563#3:681\n1634#3,3:682\n1869#3:685\n1870#3:687\n1869#3,2:688\n1869#3,2:690\n1#4:686\n29#5:695\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n*L\n65#1:668\n70#1:669,2\n70#1:671\n103#1:672\n135#1:673,2\n135#1:675\n152#1:676,2\n291#1:678,2\n291#1:680\n606#1:692,2\n606#1:694\n412#1:681\n412#1:682,3\n465#1:685\n465#1:687\n532#1:688,2\n542#1:690,2\n644#1:695\n*E\n"})
public final class StravaManager {

    @aa1
    private static final String CREATE_ACTIVITY = "https://www.strava.com/api/v3/activities";

    @aa1
    private static final String CREATE_UPLOAD = "https://www.strava.com/api/v3/uploads";
    private static final double EARTH_RADIUS = 6371000.0d;

    @aa1
    public static final StravaManager INSTANCE = null;
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

    static {
        INSTANCE = new StravaManager();
    }

    private StravaManager() {
    }

    public static /* synthetic */ Unit OXO1(Function1 r0, boolean r1) {
        return handleStravaAppIntent$lambda$0$0(r0, r1);
    }

    private final double calculateDistance(double r5, double r7, double r9, double r11) {
        double r6 = Math.toRadians(r5);
        double r8 = Math.toRadians(r7);
        double r10 = Math.toRadians(r9);
        double r12 = Math.toRadians(r11) - r8;
        double r13 = 2;
        double r0 = (r10 - r6) / r13;
        double r14 = r12 / r13;
        double r2 = (Math.sin(r0) * Math.sin(r0)) + (((Math.cos(r6) * Math.cos(r10)) * Math.sin(r14)) * Math.sin(r14));
        return (r13 * Math.atan2(Math.sqrt(r2), Math.sqrt(((double) 1) - r2))) * 6371000.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivity$default(StravaManager r0, WorkoutIndex r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.createActivity(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivityFitHeartRate$default(StravaManager r0, WorkoutIndex r1, Function1 r2, StravaWorkout r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.createActivityFitHeartRate(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deauthorizeStrava$default(StravaManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.deauthorizeStrava(r1);
    }

    private static final Unit handleStravaAppIntent$lambda$0$0(Function1 r0, boolean r1) {
        r0.invoke(Boolean.valueOf(r1));
        return Unit.OXO1;
    }

    private final void updateWorkoutIndexStravaSynced(WorkoutIndex r3) {
        WorkoutIndexDao r0 = MyDb.INSTANCE.getMDatabase().workoutIndexDao();
        r3.setMSyncStatus(r3.getMSyncStatus() | 1);
        r0.update(r3);
    }

    @aa1
    public final Pair<Double, Double> bd09ToWgs84(double r9, double r11) {
        double r12 = r11 - 0.0065d;
        double r10 = r9 - 0.006d;
        double r0 = Math.sqrt((r12 * r12) + (r10 * r10)) - (Math.sin(r10 * 52.35987755982988d) * 2.0E-5d);
        double r13 = Math.atan2(r10, r12) - (Math.cos(r12 * 52.35987755982988d) * 3.0E-6d);
        double r14 = Math.sin(r13) * r0;
        double r1 = r0 * Math.cos(r13);
        return new Pair(Double.valueOf(r14), Double.valueOf(r1));
    }

    @aa1
    public final Pair<Integer, Integer> convertToInteger(double r3, double r5) {
        int r4 = (int) Math.round(r3 * 1.1930464705555556E7d);
        int r6 = (int) Math.round(r5 * 1.1930464705555556E7d);
        return new Pair(Integer.valueOf(r4), Integer.valueOf(r6));
    }

    public final void createActivity(@aa1 WorkoutIndex r20, @tb1 Function1<? super Boolean, Unit> r21) {
        Intrinsics.X0O(r20, "workoutIndex");
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        r3.OXO1("StravaManager createActivity workoutIndex -> " + r20);
        if ((r20.getMSyncStatus() & 1) <= 0) goto L8;
        if (r21 == null) goto L46;
        r21.invoke(Boolean.TRUE);
        return;
    L46:
        return;
    L8:
        StravaWorkout r4 = XXI0Xi.XO0O10(r20);
        if (r4 != null) goto L14;
        updateWorkoutIndexStravaSynced(r20);
        if (r21 == null) goto L46;
        r21.invoke(Boolean.TRUE);
        return;
    L14:
        r3.OXO1("StravaManager createActivity stravaWorkout -> " + r4);
        if (i72.OXO1.iiX0i1IX() == true) goto L18;
        List<Location> r12 = MyDb.INSTANCE.getMDatabase().locationDao().getLocation(r4.getMStart(), r4.getMEnd());     // Catch: Exception -> L20
        if (r12.isEmpty() == false) goto L25;
    L27:
        boolean r6 = false;
    L28:
        if (r6 == true) goto L33;
        int r7 = (r4.getMDistance() / 10) * 10;     // Catch: Exception -> L20
        ANRequest.PostRequestBuilder r8 = AndroidNetworking.post(CREATE_ACTIVITY);     // Catch: Exception -> L20
        Object r9 = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), StravaToken.class);     // Catch: Exception -> L20
        if (r9 != null) goto L32;
        r9 = StravaToken.class.newInstance();     // Catch: Exception -> L20
    L32:
        ANResponse r2 = r8.addBodyParameter("access_token", ((StravaToken) r9).getAccess_token()).addBodyParameter("name", r4.getMName()).addBodyParameter("type", r4.getMType()).addBodyParameter("start_date_local", r4.getMStartTime()).addBodyParameter("elapsed_time", String.valueOf(r4.getMElapsedTime())).addBodyParameter(os0.OII, String.valueOf(r7)).setTag("StravaManager createActivity").setPriority(Priority.HIGH).build().executeForJSONObject();     // Catch: Exception -> L20
        r3.OXO1("StravaManager createActivity -> response.error:" + r2.getError() + " response.result:" + r2.getResult());     // Catch: Exception -> L20
    L33:
        updateWorkoutIndexStravaSynced(r20);     // Catch: Exception -> L20
        if (r21 == null) goto L47;
        r21.invoke(Boolean.TRUE);     // Catch: Exception -> L20
        return;
    L47:
        return;
    L25:
        if (r12.size() < 2) goto L27;
        LocationData r11 = LocationData.INSTANCE;     // Catch: Exception -> L20
        r11.getSmoothLocationListAlgorithm(LocationData.getFinalLocationList$default(r11, r12, true, false, 4, null), r4.getMMode());     // Catch: Exception -> L20
        String r10 = String.valueOf(r20.getMEndTime());     // Catch: Exception -> L20
        File r13 = new File(uz0.iOO1ii1(sz0.OXO1), r10);     // Catch: Exception -> L20
        ArrayList<CustomLatLng> r14 = LocationData.getFinalLocationList$default(r11, r12, true, false, 4, null);     // Catch: Exception -> L20
        long r15 = r4.getMStart();     // Catch: Exception -> L20
        String r16 = Utils.getApp().getString(R.string.app_name);     // Catch: Exception -> L20
        Intrinsics.O10IXXX0X(r16, "getString(...)");     // Catch: Exception -> L20
        FileIOUtils.writeFileFromString(r13, r11.getGpxFileString(r14, r15, r16, r4.getMName()));     // Catch: Exception -> L20
        r6 = INSTANCE.createUpload(r10, r4.getMName(), r13, uz0.X0i1O);     // Catch: Exception -> L20
        goto L28
    L18:
        createActivityFitHeartRate(r20, r21, r4);     // Catch: Exception -> L20
        return;
    L20:
        e = e;
    L39:
        i1O0OXO1O r5 = i1O0OXO1O.OXO1;
        e.printStackTrace();
        r5.OXO1("StravaManager createActivity -> exception : " + Unit.OXO1);
        if (r21 == null) goto L48;
        r21.invoke(Boolean.FALSE);
        return;
    L48:
        return;
    L37:
        e = e;
        goto L39
    }

    public final void createActivityFitHeartRate(@aa1 WorkoutIndex r36, @tb1 Function1<? super Boolean, Unit> r37, @aa1 StravaWorkout r38) {
        Intrinsics.X0O(r36, "workoutIndex");
        Intrinsics.X0O(r38, "stravaWorkout");
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        r2.OXO1("StravaManager createActivityFitHeartRate");
        String r4 = r36.getMEndTime() + ".fit";
        File r5 = new File(uz0.IXXOO(sz0.OXO1), r4);
        iXiX011 r6 = new iXiX011(r5, Fit.ProtocolVersion.V2_0);
        O001I r7 = new O001I();
        r7.II(com.garmin.fit.File.ACTIVITY);
        r7.iO11i(1);
        r7.OI1IiOO1i(1);
        r7.iX0iii0(123456789L);
        r7.X11("FIT Cookbook");
        long r13 = 1000;
        r7.XOOI0O(new OIO11II1(r38.getMStart() / r13));
        r6.IiI10X(r7);
        XiOIii1 r8 = new XiOIii1();
        r8.iO11i(0);
        r8.XI(111L);
        r6.IiI10X(r8);
        iiII r9 = new iiII();
        r9.IiiO11(0);
        r9.ii1(0);
        r9.XOiO0OX0(1);
        r9.iO1iI(new OIO11II1((r38.getMStart() - 631065600000L) / r13));
        r9.IIII01Ii(Float.valueOf(r38.getMElapsedTime()));
        r9.iXIiO(Float.valueOf(r38.getMDistance()));
        r9.iXO(Integer.valueOf(r38.getMCalorie() / 1000));
        r9.OIii(Short.valueOf((short) r38.getMAvgBpm()));
        r9.OOO(Short.valueOf((short) r38.getMMaxBpm()));
        r9.X1iOII0(Short.valueOf((short) r38.getMMinBpm()));
        r9.I1OX001(StravaWorkout.Companion.getTypeByActivityModeType(r38.getMMode()));
        r9.ii0Iii1i(SubSport.GENERIC);
        r6.IiI10X(r9);
        MyDb r10 = MyDb.INSTANCE;
        List r11 = CollectionsKt___CollectionsKt.OO0Oi10(r10.getMDatabase().locationDao().getLocation(r38.getMStart(), r38.getMEnd()));
        List<HeartRate> r12 = r10.getMDatabase().heartRateDao().getHeartRates(r38.getMStart(), r38.getMEnd());
        List<Activity> r14 = r10.getMDatabase().activityDao().getListDESC(r38.getMStart(), r38.getMEnd());
        r2.OXO1("StravaManager createActivityFitHeartRate  stravaWorkout = " + r38 + " ,  mElapsedTime = " + r38.getMElapsedTime() + " , locationList = " + r11.size() + ", heartRateList = " + r12.size() + "  , activityList = " + r14.size());
        if (r11.isEmpty() == true) goto L70;
        if (r11.size() < 2) goto L70;
        long r15 = ((Location) CollectionsKt___CollectionsKt.Xi1XO00(r11)).getMTime() - ((Location) CollectionsKt___CollectionsKt.IIII0iI(r11)).getMTime();
        List r3 = r11;
        ArrayList r16 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator r17 = r3.iterator();
        Location r22 = null;
        Location r23 = null;
        float r18 = 0.0f;
        float r19 = 0.0f;
    L8:
        if (r17.hasNext() == false) goto L18;
        Location r24 = (Location) r17.next();
        if (r22 != null) goto L12;
        r23 = r24;
    L17:
        r16.add(Unit.OXO1);
        r22 = r24;
        r3 = r3;
        goto L8
    L12:
        double r1 = INSTANCE.calculateDistance(r22.getMLatitude(), r22.getMLongitude(), r24.getMLatitude(), r24.getMLongitude());
        if (r1 <= 0.0d) goto L15;
        r19 = (float) r1;
        r18 = r18 + r19;
    L16:
        r23 = r22;
        goto L17
    L15:
        r22 = r23;
        goto L16
    L18:
        List r34 = r3;
        i1O0OXO1O.OXO1.OXO1("StravaManager  addLocationStart saveDistance = " + r19 + " ,  sum = " + r18);
        float r20 = ((float) r38.getMDistance()) - r18;
        float r21 = r20 / r19;
        float r25 = (((float) r38.getMElapsedTime()) - ((float) (r15 / r13))) / r21;
        Location r110 = (Location) CollectionsKt___CollectionsKt.Xi1XO00(r11);
        if (r20 <= 0.0f) goto L27;
        int r26 = (int) r21;
        int r27 = 0;
        boolean r111 = false;
    L21:
        if (r27 >= r26) goto L27;
        int r112 = r26;
        float r28 = r25;
        long r113 = r110.getMTime() + ((long) ((int) (1000 * r25)));
        r110.setMTime(r113);
        boolean r29 = !r111;
        if (r111 == true) goto L25;
        Intrinsics.XXI(r23);
        Location r30 = r23;
        r30.setMTime(r113);
        r11.add(r30);
    L26:
        r27 = r27 + 1;
        r111 = r29;
        r23 = r30;
        r26 = r112;
        r25 = r28;
        goto L21
    L25:
        r30 = r23;
        r11.add(r110);
    L27:
        i1O0OXO1O.OXO1.OXO1("StravaManager  addLocationEnd locationList = " + r11.size() + " , mDistanceSum = " + r38.getMDistance());
        Iterator r31 = r34.iterator();
        Location r32 = null;
        float r114 = 0.0f;
        short r33 = 0;
    L29:
        if (r31.hasNext() == false) goto L84;
        Location r35 = (Location) r31.next();
        Xii11I r115 = new Xii11I();
        Iterator r116 = r31;
        short r117 = r33;
        r115.OXO1(new OIO11II1(r35.getMTime() / r13));
        if (a01.OXO1.OXO1().getBoolean(b01.XiOIO, false) == false) goto L33;
        StravaManager r39 = INSTANCE;
        Pair<Double, Double> r40 = r39.bd09ToWgs84(r35.getMLatitude(), r35.getMLongitude());
        Pair<Integer, Integer> r41 = r39.convertToInteger(r40.component1().doubleValue(), r40.component2().doubleValue());
    L34:
        int r42 = r41.component1().intValue();
        int r43 = r41.component2().intValue();
        r115.X0XI11I(Integer.valueOf(r42));
        r115.O1I(Integer.valueOf(r43));
        if (r35.getMAltitude() == 0) goto L38;
        r115.OXOI0XII(Float.valueOf(r35.getMAltitude()));
    L38:
        if (i72.OXO1.OXXO0O1X() == false) goto L54;
        Iterator<T> r44 = r12.iterator();
    L41:
        if (r44.hasNext() == false) goto L45;
        Object r45 = r44.next();
        if (((HeartRate) r45).getMTime() < r35.getMTime()) goto L41;
    L46:
        HeartRate r46 = (HeartRate) r45;
        if (r46 == null) goto L49;
        short r47 = (byte) r46.getMBpm();
    L51:
        if (r12.isEmpty() == true) goto L55;
        if (r47 <= 0) goto L55;
        r115.I0i(Short.valueOf(r47));
    L55:
        if (r32 == null) goto L58;
        r114 = r114 + ((float) INSTANCE.calculateDistance(r32.getMLatitude(), r32.getMLongitude(), r35.getMLatitude(), r35.getMLongitude()));
        r115.i0I1i0Xi(Float.valueOf(r114));
        r115.OXOI0XII(Float.valueOf(r35.getMAltitude()));
    L58:
        Iterator<T> r48 = r14.iterator();
    L60:
        if (r48.hasNext() == false) goto L64;
        Object r49 = r48.next();
        if (((Activity) r49).getMTime() < r35.getMTime()) goto L60;
    L65:
        Activity r50 = (Activity) r49;
        if (r50 == null) goto L68;
        r115.Xi1XO00(Integer.valueOf((byte) (r50.getMCalorie() / 1000)));
    L68:
        r6.IiI10X(r115);
        r33 = r47;
        r32 = r35;
        r31 = r116;
        goto L29
    L64:
        r49 = null;
        goto L65
    L49:
        r47 = r117;
        goto L51
    L45:
        r45 = null;
        goto L46
    L54:
        r47 = r117;
        goto L55
    L33:
        r41 = INSTANCE.convertToInteger(r35.getMLatitude(), r35.getMLongitude());
    L84:
        i1O0OXO1O r51 = i1O0OXO1O.OXO1;
        r51.OXO1("StravaManager createActivityFitHeartRate  createFile");
        r6.XIi00iiXO();
        r51.OXO1("StravaManager createActivityFitHeartRate  createFile  isUploadFit = " + createUpload(r4, r38.getMName(), r5, uz0.iIXi1iiXI) + " ");
        updateWorkoutIndexStravaSynced(r36);
        if (r37 == null) goto L107;
        r37.invoke(Boolean.TRUE);
        return;
    L107:
        return;
    L70:
        if (r12.isEmpty() == true) goto L79;
        Iterator<T> r52 = r12.iterator();
    L73:
        if (r52.hasNext() == false) goto L84;
        HeartRate r53 = (HeartRate) r52.next();
        Xii11I r54 = new Xii11I();
        r54.OXO1(new OIO11II1(r53.getMTime() / r13));
        if (i72.OXO1.OXXO0O1X() == false) goto L77;
        r54.I0i(Short.valueOf((byte) r53.getMBpm()));
    L77:
        r6.IiI10X(r54);
        goto L73
    L79:
        if (r14.isEmpty() == true) goto L84;
        Iterator<T> r55 = r14.iterator();
    L82:
        if (r55.hasNext() == false) goto L84;
        Activity r56 = (Activity) r55.next();
        Xii11I r57 = new Xii11I();
        r57.OXO1(new OIO11II1(r56.getMTime() / r13));
        r57.i0I1i0Xi(Float.valueOf((byte) r56.getMDistance()));
        r57.Xi1XO00(Integer.valueOf((byte) (r56.getMCalorie() / 1000)));
        r6.IiI10X(r57);
        goto L82
    }

    public final boolean createUpload(@aa1 String r10, @aa1 String r11, @aa1 File r12, @aa1 String r13) {
        Intrinsics.X0O(r10, "externalId");
        Intrinsics.X0O(r11, "name");
        Intrinsics.X0O(r12, "file");
        Intrinsics.X0O(r13, "data_type");
        ANRequest.MultiPartBuilder r4 = AndroidNetworking.upload(CREATE_UPLOAD);     // Catch: Exception -> L6
        Object r6 = new Gson().fromJson(a01.OXO1.IiI10X().getString(StravaToken.class.getName()), StravaToken.class);     // Catch: Exception -> L6
        if (r6 != null) goto L8;
        r6 = StravaToken.class.newInstance();     // Catch: Exception -> L6
    L8:
        ANResponse r14 = r4.addMultipartParameter("access_token", ((StravaToken) r6).getAccess_token()).addMultipartParameter("name", r11).addMultipartParameter("data_type", r13).addMultipartParameter("external_id", r10).addMultipartFile("file", r12).setTag("StravaManager createUpload").setPriority(Priority.HIGH).build().executeForJSONObject();     // Catch: Exception -> L6
        i1O0OXO1O r15 = i1O0OXO1O.OXO1;     // Catch: Exception -> L6
        r15.OXO1("StravaManager createUpload -> " + r10 + " response.error:" + r14.getError() + " , response.result:" + r14.getResult());     // Catch: Exception -> L6
        if (r14.getResult() == null) goto L18;
        r15.OXO1("StravaManager createUpload -> file = " + r12.getAbsolutePath() + " ");     // Catch: Exception -> L6
        return true;
    L18:
        return false;
    L6:
        e = move-exception;
        i1O0OXO1O r16 = i1O0OXO1O.OXO1;
        e.printStackTrace();
        r16.OXO1("StravaManager createUpload -> exception : " + Unit.OXO1);
        return false;
    }

    public final void deauthorizeStrava(@tb1 final Function1<? super Boolean, Unit> r5) {
        SPUtils r0 = a01.OXO1.IiI10X();
        StravaToken r1 = (StravaToken) new Gson().fromJson(r0.getString(StravaToken.class.getName()), StravaToken.class);
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.getAccess_token().length() != 0) goto L7;
        return;
    L7:
        AndroidNetworking.post(URL_DEAUTHORIZE).addBodyParameter("access_token", r1.getAccess_token()).setTag("StravaManager deauthorizeStrava").setPriority(Priority.HIGH).build().getAsJSONObject(new AnonymousClass1(r5));
    }

    public final void getToken(@aa1 Context r5, @aa1 String r6, @aa1 final Function1<? super Boolean, Unit> r7) {
        Intrinsics.X0O(r5, "context");
        Intrinsics.X0O(r6, "code");
        Intrinsics.X0O(r7, "callback");
        AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", r5.getString(R.string.strava_client_id)).addBodyParameter("client_secret", r5.getString(R.string.strava_client_secret)).addBodyParameter("code", r6).setTag("StravaManager getToken").setPriority(Priority.HIGH).build().getAsObject(StravaToken.class, new C33931(r7));
    }

    public final void handleStravaAppIntent(@aa1 Context r5, @aa1 Intent r6, @aa1 final Function1<? super Boolean, Unit> r7) {
        Intrinsics.X0O(r5, "context");
        Intrinsics.X0O(r6, SDKConstants.PARAM_INTENT);
        Intrinsics.X0O(r7, "callback");
        i1O0OXO1O.OXO1.OXO1("StravaManager handleStravaAppIntent -> data: " + r6.getData());
        Uri r8 = r6.getData();
        if (r8 == null) goto L8;
        String r9 = r8.getQueryParameter("code");
        if (r9 == null) goto L9;
        INSTANCE.getToken(r5, r9, new ob5(r7));
        return;
    L9:
        return;
    }

    public final boolean isEnabled() {
        SPUtils r0 = a01.OXO1.IiI10X();
        if (new Gson().fromJson(r0.getString(StravaToken.class.getName()), StravaToken.class) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isExpired() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(StravaToken.class.getName()), StravaToken.class);
        if (r1 != null) goto L5;
        r1 = StravaToken.class.newInstance();
    L5:
        long r2 = (((StravaToken) r1).getExpires_at() * 1000) - TimeUnit.MINUTES.toMillis(5);
        if (System.currentTimeMillis() <= r2) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean refreshToken(@aa1 Context r7) {
        Intrinsics.X0O(r7, "context");
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(StravaToken.class.getName()), StravaToken.class);
        if (r2 != null) goto L5;
        r2 = StravaToken.class.newInstance();
    L5:
        StravaToken r3 = (StravaToken) r2;
        Object r8 = AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", r7.getString(R.string.strava_client_id)).addBodyParameter("client_secret", r7.getString(R.string.strava_client_secret)).addBodyParameter("grant_type", cd1.IO).addBodyParameter(cd1.IO, r3.getRefresh_token()).setTag("StravaManager refreshToken").setPriority(Priority.HIGH).build().executeForObject(StravaToken.class).getResult();     // Catch: Exception -> L8
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.strava.StravaToken");     // Catch: Exception -> L8
        StravaToken r9 = (StravaToken) r8;     // Catch: Exception -> L8
    L9:
        if (r9 == null) goto L11;
        a01.OXO1.IiI10X().put(StravaToken.class.getName(), new Gson().toJson(r9));
        return true;
    L11:
        return false;
    L8:
        r9 = null;
        goto L9
    }

    public final void toStravaAppAuthorize(@aa1 Context r5) {
        Intrinsics.X0O(r5, "context");
        Uri r0 = Uri.parse(URL_AUTHORIZE).buildUpon().appendQueryParameter("client_id", r5.getString(R.string.strava_client_id)).appendQueryParameter("redirect_uri", "strava://localhost/" + AppUtils.getAppPackageName() + "/callback").appendQueryParameter(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code").appendQueryParameter("approval_prompt", "auto").appendQueryParameter("scope", "activity:write").build();
        i1O0OXO1O.OXO1.OXO1("StravaManager toStravaAppAuthorize -> data: " + r0);
        r5.startActivity(new Intent("android.intent.action.VIEW", r0));
    }
}
