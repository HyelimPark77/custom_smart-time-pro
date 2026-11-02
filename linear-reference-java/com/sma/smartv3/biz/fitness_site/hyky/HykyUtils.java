package com.sma.smartv3.biz.fitness_site.hyky;

import android.content.Context;
import androidx.compose.ui.layout.LayoutKt;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0XIIXII;
import com.android.mltcode.paycertificationapi.O1X11I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1X0OiOX;
import com.android.mltcode.paycertificationapi.ii0iIX10;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.SportDataDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.network.GetSNCodeHYKY;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,606:1\n1878#2,3:607\n1573#2:610\n1604#2,4:611\n1869#2,2:615\n1573#2:617\n1604#2,4:618\n1869#2,2:622\n1573#2:624\n1604#2,4:625\n1869#2:629\n1869#2,2:630\n1870#2:632\n*S KotlinDebug\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n*L\n155#1:607,3\n192#1:610\n192#1:611,4\n350#1:615,2\n360#1:617\n360#1:618,4\n432#1:622,2\n443#1:624\n443#1:625,4\n497#1:629\n518#1:630,2\n497#1:632\n*E\n"})
public final class HykyUtils {

    @aa1
    public static final HykyUtils INSTANCE = null;

    @aa1
    private static final Lazy mActivityDao$delegate = null;

    @aa1
    private static final Lazy mHeartRateDao$delegate = null;

    @aa1
    private static final Lazy mLocationDao$delegate = null;

    @aa1
    private static final Lazy mSportDataDao$delegate = null;

    static {
        INSTANCE = new HykyUtils();
        mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new O1X11I());
        mHeartRateDao$delegate = LazyKt__LazyJVMKt.iO(new O0XIIXII());
        mSportDataDao$delegate = LazyKt__LazyJVMKt.iO(new ii0iIX10());
        mActivityDao$delegate = LazyKt__LazyJVMKt.iO(new i1X0OiOX());
    }

    private HykyUtils() {
    }

    public static /* synthetic */ LocationDao OXO1() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ ActivityDao XIi00iiXO() {
        return mActivityDao_delegate$lambda$0();
    }

    public static /* synthetic */ SportDataDao XO0O10() {
        return mSportDataDao_delegate$lambda$0();
    }

    private final float getAvg(float r5, float r6, float r7) {
        if (r5 <= 0.0f) goto L5;
        float r1 = r5;
    L7:
        if (rc2.I0IIOi(1.0f, r5).contains(Float.valueOf(r7)) == false) goto L10;
        return r7;
    L10:
        if (r6 > 0.0f) goto L12;
    L14:
        return r1;
    L12:
        if (r5 >= r6) goto L14;
        return r6;
    L5:
        r1 = 0.0f;
        goto L7
    }

    public static /* synthetic */ String getDeviceID$default(HykyUtils r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.getDeviceMac(false);
    L6:
        return r0.getDeviceID(r1);
    }

    public static /* synthetic */ String getDeviceMac$default(HykyUtils r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return r0.getDeviceMac(r1);
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

    private final float getRandom(float r5, float r6) {
        if (r6 != 0.0f) goto L6;
    L16:
        return 0.0f;
    L6:
        if (r5 == 0.0f) goto L16;
        if (r6 >= 10000.0f) goto L16;
        float r1 = (r6 + r5) / 2;
        float r7 = (r6 - r5) / 3;
        float r3 = 1;
        return Random.Default.nextInt((int) ((r1 - r7) - r3), (int) ((r1 + r7) + r3));
    L14:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }

    private final List<SportData> getSportDataList(Workout r42, List<Location> r43, List<Activity> r44) {
        ArrayList r0 = new ArrayList();
        if (r44.isEmpty() == true) goto L5;
        Object r1 = CollectionsKt___CollectionsKt.IIII0iI(r44);
    L6:
        long r2 = r42.getMStart();
        long r8 = 60000;
        long r4 = ProgressionUtilKt.XO0O10(r2, r42.getMEnd() + r8, 60000);
        if (r2 > r4) goto L32;
        int r6 = 0;
    L9:
        Iterator<T> r7 = r44.iterator();
    L11:
        if (r7.hasNext() == false) goto L29;
        Activity r10 = (Activity) r7.next();
        long r11 = 1 + r2;
        long r13 = r2 + r8;
        long r15 = r10.getMTime();
        if (r11 <= r15) goto L15;
    L27:
        r2 = r2;
        r4 = r4;
    L28:
        r2 = r2;
        r4 = r4;
        goto L11
    L15:
        if (r15 > r13) goto L27;
        if (r6 == 0) goto L26;
        int r16 = r10.getMStep();
        Intrinsics.XXI(r1);
        Activity r3 = (Activity) r1;
        int r17 = r16 - r3.getMStep();
        int r5 = ((int) (r10.getMTime() - r3.getMTime())) / 1000;
        int r9 = (r10.getMDistance() - r3.getMDistance()) / 10000;
        SportData r22 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
        r22.setMStep(r17);
        r22.setMTime(r2);
        r22.setMDistance(r9);
        String r12 = TimeUtils.millis2String(r10.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r12, "millis2String(...)");
        r22.setMLocalTime(r12);
        r22.setMDuration(r5);
        o65 r14 = o65.OXO1;
        r22.setMSpm(r14.IO(r22.getMStep(), r22.getMDuration()));
        r22.setMPace(r14.XIi00iiXO(r22.getMDuration(), r22.getMDistance()));
        r22.setMSpeed(r14.iO(r22.getMDistance(), r22.getMDuration()));
        r0.add(r22);
        Iterator<T> r18 = r43.iterator();
    L19:
        if (r18.hasNext() == false) goto L26;
        Location r19 = (Location) r18.next();
        long r20 = r19.getMTime();
        if (r11 > r20) goto L19;
        if (r20 > r13) goto L19;
        r22.setMAltitude(r19.getMAltitude());
    L26:
        r6 = r6 + 1;
        r1 = r10;
        goto L28
    L29:
        long r110 = r2;
        long r21 = r4;
        if (r110 == r21) goto L32;
        r2 = 60000 + r110;
        r4 = r21;
    L32:
        return r0;
    L5:
        r1 = null;
        goto L6
    }

    public static /* synthetic */ HeartRateDao iO() {
        return mHeartRateDao_delegate$lambda$0();
    }

    private static final ActivityDao mActivityDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    private static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final SportDataDao mSportDataDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    @aa1
    public final List<Integer> analyseSleepToStatus(@aa1 List<BleSleep> r10) {
        Intrinsics.X0O(r10, "analyseSleep");
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= (r10.size() - 1)) goto L25;
        BleSleep r3 = r10.get(r2);
        if (r2 != 0) goto L8;
        int r5 = r3.getMTime() / 60;
    L9:
        r2 = r2 + 1;
        int r6 = r10.get(r2).getMTime() / 60;
        if (r5 > r6) goto L4;
    L11:
        int r7 = r3.getMMode();
        if (r7 == 1) goto L21;
        int r8 = 2;
        if (r7 != 2) goto L16;
    L22:
        r0.add(Integer.valueOf(r8));
        if (r5 == r6) goto L4;
        r5 = r5 + 1;
        goto L11
    L16:
        if (r7 != 3) goto L18;
    L19:
        r8 = 0;
        goto L22
    L18:
        if (r7 != 9) goto L19;
        r8 = 1;
        goto L22
    L21:
        r8 = 4;
        goto L22
    L8:
        r5 = (r3.getMTime() / 60) + 1;
        goto L9
    L25:
        return r0;
    }

    @aa1
    public final String dateFormatToHyky(@aa1 String r8) {
        Intrinsics.X0O(r8, "date");
        return oe5.IXO0OOi(r8, "/", HelpFormatter.DEFAULT_OPT_PREFIX, false, 4, null);
    }

    @tb1
    public final GetSNCodeHYKY.Response getDeviceCode() {
        return HykyManager.Companion.getInstance().getMDeviceCode();
    }

    @tb1
    public final String getDeviceID(@aa1 String r3) {
        Intrinsics.X0O(r3, "deviceMac");
        if (r3.length() != 0) goto L7;
        return null;
    L7:
        return "HEALTH-592044-" + r3;
    }

    @aa1
    public final String getDeviceMac(boolean r7) {
        if (r7 == false) goto L6;
        return BleCache.INSTANCE.getMBleAddress();
    L6:
        return oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
    }

    @tb1
    public final UploadSportDataHYKY.SportData getHrData(@aa1 Workout r17, @aa1 UploadSportDataHYKY.SportData r18) {
        Intrinsics.X0O(r17, NotificationCompat.CATEGORY_WORKOUT);
        Intrinsics.X0O(r18, "sportData");
        ArrayList r1 = new ArrayList();
        List<HeartRate> r3 = getMHeartRateDao().getHeartRates(r17.getMStart(), r17.getMEnd());     // Catch: Exception -> L8
        o65 r4 = o65.OXO1;     // Catch: Exception -> L8
        long r7 = r4.OIX0iXi(r17.getMStart());     // Catch: Exception -> L8
        long r9 = 60000 + r4.OIX0iXi(r17.getMEnd());     // Catch: Exception -> L8
        LinkedHashMap r5 = new LinkedHashMap();     // Catch: Exception -> L8
        long r6 = ProgressionUtilKt.XO0O10(r7, r9, 60000);     // Catch: Exception -> L8
        if (r7 > r6) goto L9;
    L5:
        r5.put(Long.valueOf(r7), new nr0(0, 0, null, 4, null));     // Catch: Exception -> L8
        if (r7 == r6) goto L9;
        r7 = r7 + 60000;     // Catch: Exception -> L8
    L9:
        Iterator<T> r8 = r3.iterator();     // Catch: Exception -> L8
        int r10 = 0;
        int r11 = 0;
    L11:
        if (r8.hasNext() == false) goto L22;
        Object r12 = r8.next();     // Catch: Exception -> L8
        int r13 = r11 + 1;     // Catch: Exception -> L8
        if (r11 >= 0) goto L15;
        CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L8
    L15:
        HeartRate r14 = (HeartRate) r12;     // Catch: Exception -> L8
        Iterator r15 = r5.entrySet().iterator();     // Catch: Exception -> L8
    L17:
        if (r15.hasNext() == false) goto L21;
        Map.Entry r16 = (Map.Entry) r15.next();     // Catch: Exception -> L8
        long r19 = ((Number) r16.getKey()).longValue();     // Catch: Exception -> L8
        nr0 r110 = (nr0) r16.getValue();     // Catch: Exception -> L8
        if (o65.OXO1.OIX0iXi(r14.getMTime()) > r19) goto L17;
        r110.OIX0iXi(r110.I0IIOi() + r14.getMBpm());     // Catch: Exception -> L8
        r110.OIi0(r110.IiI10X() + 1);     // Catch: Exception -> L8
    L21:
        r11 = r13;
        goto L11
    L22:
        ArrayList r20 = new ArrayList();     // Catch: Exception -> L8
        Iterator r21 = r5.entrySet().iterator();     // Catch: Exception -> L8
        int r22 = 100;
        float r23 = 0.0f;
        int r24 = 0;
    L23:
        if (r21.hasNext() == false) goto L39;
        nr0 r111 = (nr0) ((Map.Entry) r21.next()).getValue();     // Catch: Exception -> L8
        if (r111.IiI10X() == 0) goto L37;
        if (r111.I0IIOi() == 0) goto L37;
        int r112 = (int) getAvg(r111.I0IIOi() / r111.IiI10X(), r17.getMMinBpm(), r17.getMMaxBpm());     // Catch: Exception -> L51
        r20.add(new Entry(r23, r112));     // Catch: Exception -> L51
        if (r24 >= r112) goto L34;
        r24 = r112;
    L34:
        if (1 > r112) goto L37;
        if (r112 >= r22) goto L37;
        r22 = r112;
    L37:
        r23 = r23 + 1.0f;     // Catch: Exception -> L51
        goto L23
    L39:
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r20, 10));     // Catch: Exception -> L51
        Iterator r25 = r20.iterator();     // Catch: Exception -> L51
    L41:
        if (r25.hasNext() == false) goto L46;
        Object r26 = r25.next();     // Catch: Exception -> L51
        int r27 = r10 + 1;     // Catch: Exception -> L51
        if (r10 >= 0) goto L45;
        CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L51
    L45:
        r2.add(new UploadSportDataHYKY.Hr(r10 * 60, (int) ((Entry) r26).O00()));     // Catch: Exception -> L51
        r10 = r27;
        goto L41
    L46:
        r1.addAll(r2);     // Catch: Exception -> L51
    L47:
        r18.setSportDataType(2);
        r18.setSportOverView(null);
        r18.setHrList(r1);
        if (r1.isEmpty() == false) goto L50;
        return null;
    L50:
        return r18;
    }

    @tb1
    public final UploadSportDataHYKY.SportData getLocationData(@aa1 Workout r17, @aa1 UploadSportDataHYKY.SportData r18) {
        Intrinsics.X0O(r17, NotificationCompat.CATEGORY_WORKOUT);
        Intrinsics.X0O(r18, "sportData");
        ArrayList r2 = new ArrayList();
        List<Location> r4 = getMLocationDao().getLocation(r17.getMStart(), r17.getMEnd());     // Catch: Exception -> L35
        o65 r5 = o65.OXO1;     // Catch: Exception -> L35
        long r8 = r5.OIX0iXi(r17.getMStart());     // Catch: Exception -> L35
        long r10 = 60000 + r5.OIX0iXi(r17.getMEnd());     // Catch: Exception -> L35
        LinkedHashMap r3 = new LinkedHashMap();     // Catch: Exception -> L35
        long r6 = ProgressionUtilKt.XO0O10(r8, r10, 60000);     // Catch: Exception -> L35
        if (r8 > r6) goto L8;
    L5:
        r3.put(Long.valueOf(r8), new nr0(0, 0, null, 4, null));     // Catch: Exception -> L35
        if (r8 == r6) goto L8;
        r8 = r8 + 60000;     // Catch: Exception -> L35
    L8:
        Iterator<Location> r7 = r4.iterator();     // Catch: Exception -> L35
    L10:
        if (r7.hasNext() == false) goto L17;
        Location r9 = r7.next();     // Catch: Exception -> L35
        Iterator r11 = r3.entrySet().iterator();     // Catch: Exception -> L35
    L13:
        if (r11.hasNext() == false) goto L10;
        Map.Entry r12 = (Map.Entry) r11.next();     // Catch: Exception -> L35
        long r13 = ((Number) r12.getKey()).longValue();     // Catch: Exception -> L35
        nr0 r14 = (nr0) r12.getValue();     // Catch: Exception -> L35
        if (o65.OXO1.OIX0iXi(r9.getMTime()) > r13) goto L13;
        r14.OIX0iXi(r14.I0IIOi() + r9.getMAltitude());     // Catch: Exception -> L35
        r14.OIi0(r14.IiI10X() + 1);     // Catch: Exception -> L35
        r14.IO(r9.getMLongitude() + I000IiI1O.iO.XO0O10 + r9.getMLatitude() + I000IiI1O.iO.XO0O10);     // Catch: Exception -> L35
        goto L10
    L17:
        Iterator r1 = r3.entrySet().iterator();     // Catch: Exception -> L35
        int r15 = 0;
        float r16 = 0.0f;
        int r19 = 0;
    L18:
        if (r1.hasNext() == false) goto L31;
        nr0 r20 = (nr0) ((Map.Entry) r1.next()).getValue();     // Catch: Exception -> L35
        if (r20.IiI10X() == 0) goto L30;
        if (r20.I0IIOi() == 0) goto L30;
        int r21 = r20.I0IIOi() / r20.IiI10X();     // Catch: Exception -> L35
        Object r22 = r20.XOO0ii0();     // Catch: Exception -> L35
        StringBuilder r110 = new StringBuilder();     // Catch: Exception -> L35
        r110.append(r22);     // Catch: Exception -> L35
        r110.append(r21);     // Catch: Exception -> L35
        r2.add(new UploadSportDataHYKY.Pos((int) (60 * r16), r110.toString()));     // Catch: Exception -> L35
        if (r15 >= r21) goto L27;
        r15 = r21;
    L27:
        if (r19 == 0) goto L29;
        if (r19 <= r21) goto L30;
    L29:
        r19 = r21;
    L30:
        r16 = r16 + 1.0f;
    L31:
        r18.setSportDataType(3);
        r18.setSportOverView(null);
        r18.setPosType("BD09");
        r18.setPosList(r2);
        if (r2.isEmpty() == false) goto L34;
        return null;
    L34:
        return r18;
    }

    @tb1
    public final UploadSportDataHYKY.SportData getPaceData(@aa1 Workout r21, @aa1 UploadSportDataHYKY.SportData r22) {
        Intrinsics.X0O(r21, NotificationCompat.CATEGORY_WORKOUT);
        Intrinsics.X0O(r22, "sportData");
        ArrayList r2 = new ArrayList();
        List<SportData> r5 = getMSportDataDao().getSportDataASC(r21.getMStart(), r21.getMEnd());     // Catch: Exception -> L82
        List<Location> r6 = getMLocationDao().getLocation(r21.getMStart(), r21.getMEnd());     // Catch: Exception -> L82
        int r9 = 0;
        if (r6.isEmpty() == false) goto L6;
    L8:
        LinkedHashMap r7 = new LinkedHashMap();     // Catch: Exception -> L82
        o65 r8 = o65.OXO1;     // Catch: Exception -> L82
        long r12 = r8.OIX0iXi(r21.getMStart());     // Catch: Exception -> L82
        long r10 = ProgressionUtilKt.XO0O10(r12, 60000 + r8.OIX0iXi(r21.getMEnd()), 60000);     // Catch: Exception -> L82
        if (r12 > r10) goto L13;
    L10:
        r7.put(Long.valueOf(r12), new nr0(0, 0, null, 4, null));     // Catch: Exception -> L82
        if (r12 == r10) goto L13;
        r12 = r12 + 60000;     // Catch: Exception -> L82
    L13:
        float r11 = r21.getMMaxPace();     // Catch: Exception -> L82
        float r3 = r21.getMMinPace();     // Catch: Exception -> L82
        ArrayList r13 = new ArrayList();     // Catch: Exception -> L82
        float r14 = 0.0f;
        if (1.0f <= r11) goto L16;
    L18:
        r11 = 0.0f;
    L20:
        if (1.0f <= r3) goto L22;
    L24:
        r3 = 0.0f;
    L26:
        if (r11 != 0.0f) goto L28;
        boolean r15 = true;
    L30:
        if (r3 != 0.0f) goto L32;
        boolean r16 = true;
    L33:
        Iterator r17 = r7.entrySet().iterator();     // Catch: Exception -> L82
        float r18 = 0.0f;
        float r19 = 0.0f;
    L35:
        if (r17.hasNext() == false) goto L53;
        Map.Entry r110 = (Map.Entry) r17.next();     // Catch: Exception -> L82
        if (r9 >= (r5.size() - 1)) goto L39;
        float r111 = r5.get(r9).getMPace();     // Catch: Exception -> L82
    L40:
        float r112 = getAvg(r111, r3, r11);     // Catch: Exception -> L82
        if (r112 != r19) goto L44;
    L48:
        float r113 = getRandom(r3, r11);     // Catch: Exception -> L82
        if (r113 == r14) goto L52;
        r112 = r113;
    L52:
        r13.add(new Entry(r18, r112));     // Catch: Exception -> L82
        r18 = r18 + 1.0f;     // Catch: Exception -> L82
        r9 = r9 + 1;     // Catch: Exception -> L82
        r14 = r14;
        r19 = r112;
        goto L35
    L44:
        if (r112 == r3) goto L48;
        if (r112 != r11) goto L52;
    L39:
        r111 = r14;
        goto L40
    L53:
        float r114 = r14;
        if (r16 == false) goto L56;
        r3 = 100.0f;
    L56:
        Iterator r20 = r13.iterator();     // Catch: Exception -> L82
    L58:
        if (r20.hasNext() == false) goto L70;
        Entry r23 = (Entry) r20.next();     // Catch: Exception -> L82
        if (r15 == true) goto L62;
    L64:
        if (r16 == false) goto L58;
        if (r23.O00() >= r3) goto L58;
        if (r23.O00() <= r114) goto L58;
        r3 = r23.O00();     // Catch: Exception -> L82
        goto L58
    L62:
        if (r23.O00() <= r11) goto L64;
        r11 = r23.O00();     // Catch: Exception -> L82
        goto L64
    L70:
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r13, 10));     // Catch: Exception -> L82
        Iterator r24 = r13.iterator();     // Catch: Exception -> L82
        int r25 = 0;
    L72:
        if (r24.hasNext() == false) goto L77;
        Object r26 = r24.next();     // Catch: Exception -> L82
        int r27 = r25 + 1;     // Catch: Exception -> L82
        if (r25 >= 0) goto L76;
        CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L82
    L76:
        r4.add(new UploadSportDataHYKY.Pace(r25, (int) ((Entry) r26).O00()));     // Catch: Exception -> L82
        r25 = r27;
        goto L72
    L77:
        r2.addAll(r4);     // Catch: Exception -> L82
        goto L78
    L32:
        r16 = false;
        goto L33
    L28:
        r15 = false;
        goto L30
    L22:
        if (r3 > 3000.0f) goto L24;
    L16:
        if (r11 > 3000.0f) goto L18;
    L6:
        if (r21.getMMode() != 10) goto L8;
        r5 = cp5.OII(r6, 0, 2, null);     // Catch: Exception -> L82
    L78:
        r22.setSportDataType(5);
        r22.setSportOverView(null);
        r22.setPaceList(r2);
        if (r2.isEmpty() == false) goto L81;
        return null;
    L81:
        return r22;
    }

    @aa1
    public final UploadSportDataHYKY.SportData getSportOverView(@aa1 Workout r4, @aa1 UploadSportDataHYKY.SportData r5) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_WORKOUT);
        Intrinsics.X0O(r5, "sportData");
        int r0 = r4.getMMode();
        if (r0 != 7) goto L5;
        r5.setSportType(UploadSportDataHYKY.SportType.RUNNING.getValue());
        UploadSportDataHYKY.SportOverView r1 = r5.getSportOverView();
        if (r1 == null) goto L26;
        r1.setStepCount(Integer.valueOf(r4.getMStep()));
        r1.setStepFreq(Integer.valueOf(r4.getMSpm()));
    L26:
        return r5;
    L5:
        if (r0 == 26) goto L21;
        switch(r0) {
            case 10: goto L19;
            case 11: goto L17;
            case 12: goto L13;
            case 13: goto L11;
            default: goto L7;
        };
    L7:
        r5.setSportType(UploadSportDataHYKY.SportType.OTHER.getValue());
        UploadSportDataHYKY.SportOverView r2 = r5.getSportOverView();
        if (r2 == null) goto L26;
        Context r3 = Utils.getApp().getApplicationContext();
        Intrinsics.O10IXXX0X(r3, "getApplicationContext(...)");
        SportRecordData r6 = new SportRecordData();
        r6.setMMode(r4.getMMode());
        Unit r7 = Unit.OXO1;
        r2.setSportName(UtilsKt.XXO(SportRecordDataKt.getWorkoutName(r3, r6)));
        return r5;
    L11:
        r5.setSportType(UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue());
        r5.getSportOverView();
        return r5;
    L13:
        r5.setSportType(UploadSportDataHYKY.SportType.WALK.getValue());
        UploadSportDataHYKY.SportOverView r8 = r5.getSportOverView();
        if (r8 == null) goto L26;
        r8.setStepCount(Integer.valueOf(r4.getMStep()));
        r8.setStepFreq(Integer.valueOf(r4.getMSpm()));
        return r5;
    L17:
        r5.setSportType(UploadSportDataHYKY.SportType.SWIM.getValue());
        r5.getSportOverView();
        return r5;
    L19:
        r5.setSportType(UploadSportDataHYKY.SportType.CYCLING.getValue());
        r5.getSportOverView();
        return r5;
    L21:
        r5.setSportType(UploadSportDataHYKY.SportType.SKIPPING_ROPE.getValue());
        r5.getSportOverView();
        return r5;
    }

    @tb1
    public final UploadSportDataHYKY.SportData getStepFreqData(@aa1 Workout r19, @aa1 UploadSportDataHYKY.SportData r20) {
        Intrinsics.X0O(r19, NotificationCompat.CATEGORY_WORKOUT);
        Intrinsics.X0O(r20, "sportData");
        ArrayList r3 = new ArrayList();
        List<SportData> r4 = getMSportDataDao().getSportDataASC(r19.getMStart(), r19.getMEnd());     // Catch: Exception -> L79
        if (r4.isEmpty() == false) goto L6;
        r4 = getSportDataList(r19, getMLocationDao().getLocation(r19.getMStart(), r19.getMEnd()), getMActivityDao().getListASC(r19.getMStart(), r19.getMEnd()));     // Catch: Exception -> L79
    L6:
        o65 r5 = o65.OXO1;     // Catch: Exception -> L79
        long r8 = r5.OIX0iXi(r19.getMStart());     // Catch: Exception -> L79
        long r10 = 60000 + r5.OIX0iXi(r19.getMEnd());     // Catch: Exception -> L79
        LinkedHashMap r6 = new LinkedHashMap();     // Catch: Exception -> L79
        long r7 = ProgressionUtilKt.XO0O10(r8, r10, 60000);     // Catch: Exception -> L79
        if (r8 > r7) goto L11;
    L8:
        r6.put(Long.valueOf(r8), new nr0(0, 0, null, 4, null));     // Catch: Exception -> L79
        if (r8 == r7) goto L11;
        r8 = r8 + 60000;     // Catch: Exception -> L79
    L11:
        float r9 = r19.getMMaxSpm();     // Catch: Exception -> L79
        float r1 = r19.getMMinSpm();     // Catch: Exception -> L79
        ArrayList r11 = new ArrayList();     // Catch: Exception -> L79
        float r12 = 0.0f;
        if (1.0f <= r9) goto L14;
    L16:
        r9 = 0.0f;
    L18:
        if (1.0f <= r1) goto L20;
    L22:
        r1 = 0.0f;
    L23:
        int r13 = 0;
        if (r9 != 0.0f) goto L26;
        boolean r14 = true;
    L28:
        if (r1 != 0.0f) goto L30;
        boolean r15 = true;
    L31:
        Iterator r16 = r6.entrySet().iterator();     // Catch: Exception -> L79
        float r17 = 0.0f;
        float r18 = 0.0f;
        int r110 = 0;
    L33:
        if (r16.hasNext() == false) goto L50;
        Map.Entry r111 = (Map.Entry) r16.next();     // Catch: Exception -> L79
        float r112 = r12;
        if (r110 >= (r4.size() - 1)) goto L37;
        float r113 = r4.get(r110).getMStep();     // Catch: Exception -> L79
    L38:
        float r114 = getAvg(r113, r1, r9);     // Catch: Exception -> L79
        if (r114 != r18) goto L42;
    L46:
        r18 = getRandom(r1, r9);     // Catch: Exception -> L79
        if (r18 != r112) goto L49;
    L48:
        r18 = r114;
    L49:
        r11.add(new Entry(r17, r18));     // Catch: Exception -> L79
        r17 = r17 + 1.0f;     // Catch: Exception -> L79
        r110 = r110 + 1;     // Catch: Exception -> L79
        r12 = r112;
        goto L33
    L42:
        if (r114 == r1) goto L46;
        if (r114 != r9) goto L48;
    L37:
        r113 = r112;
        goto L38
    L50:
        float r115 = r12;
        if (r15 == false) goto L53;
        r1 = 100.0f;
    L53:
        Iterator r21 = r11.iterator();     // Catch: Exception -> L79
    L55:
        if (r21.hasNext() == false) goto L67;
        Entry r22 = (Entry) r21.next();     // Catch: Exception -> L79
        r22.O00();     // Catch: Exception -> L79
        if (r14 == true) goto L59;
    L61:
        if (r15 == false) goto L55;
        if (r22.O00() >= r1) goto L55;
        if (r22.O00() <= r115) goto L55;
        r1 = r22.O00();     // Catch: Exception -> L79
        goto L55
    L59:
        if (r22.O00() <= r9) goto L61;
        r9 = r22.O00();     // Catch: Exception -> L79
        goto L61
    L67:
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r11, 10));     // Catch: Exception -> L79
        Iterator r23 = r11.iterator();     // Catch: Exception -> L79
    L69:
        if (r23.hasNext() == false) goto L74;
        Object r24 = r23.next();     // Catch: Exception -> L79
        int r25 = r13 + 1;     // Catch: Exception -> L79
        if (r13 >= 0) goto L73;
        CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L79
    L73:
        r2.add(new UploadSportDataHYKY.StepFreq(r13 * 60, (int) ((Entry) r24).O00()));     // Catch: Exception -> L79
        r13 = r25;
        goto L69
    L74:
        r3.addAll(r2);     // Catch: Exception -> L79
        goto L75
    L30:
        r15 = false;
        goto L31
    L26:
        r14 = false;
        goto L28
    L20:
        if (r1 > 1000.0f) goto L22;
    L14:
        if (r9 > 1000.0f) goto L16;
    L75:
        r20.setSportDataType(4);
        r20.setSportOverView(null);
        r20.setStepFreqList(r3);
        if (r3.isEmpty() == false) goto L78;
        return null;
    L78:
        return r20;
    }
}
