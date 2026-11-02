package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.BloodGlucose2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nBloodGlucose2Dao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,44:1\n1491#2:45\n1516#2,3:46\n1519#2,3:56\n1491#2:63\n1516#2,3:64\n1519#2,3:74\n382#3,7:49\n382#3,7:67\n126#4:59\n153#4,3:60\n126#4:77\n153#4,3:78\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n*L\n30#1:45\n30#1:46,3\n30#1:56,3\n36#1:63\n36#1:64,3\n36#1:74,3\n30#1:49,7\n36#1:67,7\n31#1:59\n31#1:60,3\n37#1:77\n37#1:78,3\n*E\n"})
public interface BloodGlucose2Dao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<BloodGlucose2> getListForDay(@aa1 BloodGlucose2Dao r0) {
            return BloodGlucose2Dao.access$getListForDay$jd(r0);
        }

        @aa1
        @Deprecated
        public static List<BloodGlucose2> getTodayList(@aa1 BloodGlucose2Dao r0) {
            return BloodGlucose2Dao.access$getTodayList$jd(r0);
        }

        @aa1
        @Deprecated
        public static List<BloodGlucose2> getListForDay(@aa1 BloodGlucose2Dao r0, long r1, long r3) {
            return BloodGlucose2Dao.access$getListForDay$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getListForDay$jd(BloodGlucose2Dao r0) {
        return super.getListForDay();
    }

    static /* synthetic */ List access$getTodayList$jd(BloodGlucose2Dao r0) {
        return super.getTodayList();
    }

    @Query("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC")
    @aa1
    List<BloodGlucose2> getList();

    @Query("SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC")
    @aa1
    List<BloodGlucose2> getList(long r1, long r3);

    @Query("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC")
    @aa1
    List<BloodGlucose2> getListDESC();

    @Query("SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC")
    @aa1
    List<BloodGlucose2> getListDESC(long r1, long r3);

    @aa1
    default List<BloodGlucose2> getListForDay() {
        List<BloodGlucose2> r0 = getList();
        LinkedHashMap r1 = new LinkedHashMap();
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        Object r3 = r2.next();
        String r4 = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) r3).getMTime()));
        Object r5 = r1.get(r4);
        if (r5 != null) goto L8;
        r5 = new ArrayList();
        r1.put(r4, r5);
    L8:
        ((List) r5).add(r3);
        goto L4
    L9:
        ArrayList r6 = new ArrayList(r1.size());
        Iterator r7 = r1.entrySet().iterator();
    L11:
        if (r7.hasNext() == false) goto L13;
        r6.add((BloodGlucose2) CollectionsKt___CollectionsKt.IIII0iI((List) ((Map.Entry) r7.next()).getValue()));
        goto L11
    L13:
        return r6;
    }

    @aa1
    default List<BloodGlucose2> getTodayList() {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r0, "getInstance(...)");
        long r1 = O0X11OiO.XiOIii1(r0);
        return getList(r1, TimeUnit.DAYS.toMillis(1) + r1);
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodGlucose2> r1);

    static /* synthetic */ List access$getListForDay$jd(BloodGlucose2Dao r0, long r1, long r3) {
        return super.getListForDay(r1, r3);
    }

    @aa1
    default List<BloodGlucose2> getListForDay(long r4, long r6) {
        List<BloodGlucose2> r5 = getList(r4, r6);
        LinkedHashMap r7 = new LinkedHashMap();
        Iterator<T> r8 = r5.iterator();
    L4:
        if (r8.hasNext() == false) goto L9;
        Object r9 = r8.next();
        String r10 = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) r9).getMTime()));
        Object r0 = r7.get(r10);
        if (r0 != null) goto L8;
        r0 = new ArrayList();
        r7.put(r10, r0);
    L8:
        ((List) r0).add(r9);
        goto L4
    L9:
        ArrayList r11 = new ArrayList(r7.size());
        Iterator r12 = r7.entrySet().iterator();
    L11:
        if (r12.hasNext() == false) goto L13;
        r11.add((BloodGlucose2) CollectionsKt___CollectionsKt.IIII0iI((List) ((Map.Entry) r12.next()).getValue()));
        goto L11
    L13:
        return r11;
    }
}
