package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
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
        public static List<BloodGlucose2> getListForDay(@aa1 BloodGlucose2Dao bloodGlucose2Dao) {
            return BloodGlucose2Dao.super.getListForDay();
        }

        @aa1
        @Deprecated
        public static List<BloodGlucose2> getTodayList(@aa1 BloodGlucose2Dao bloodGlucose2Dao) {
            return BloodGlucose2Dao.super.getTodayList();
        }

        @aa1
        @Deprecated
        public static List<BloodGlucose2> getListForDay(@aa1 BloodGlucose2Dao bloodGlucose2Dao, long j, long j2) {
            return BloodGlucose2Dao.super.getListForDay(j, j2);
        }
    }

    @Query("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC")
    @aa1
    List<BloodGlucose2> getList();

    @Query("SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC")
    @aa1
    List<BloodGlucose2> getList(long j, long j2);

    @Query("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC")
    @aa1
    List<BloodGlucose2> getListDESC();

    @Query("SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC")
    @aa1
    List<BloodGlucose2> getListDESC(long j, long j2);

    @aa1
    default List<BloodGlucose2> getListForDay() {
        List<BloodGlucose2> list = getList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) obj).getMTime()));
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((BloodGlucose2) CollectionsKt___CollectionsKt.IIII0iI((List) ((Map.Entry) it.next()).getValue()));
        }
        return arrayList2;
    }

    @aa1
    default List<BloodGlucose2> getTodayList() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long jXiOIii1 = O0X11OiO.XiOIii1(calendar);
        return getList(jXiOIii1, TimeUnit.DAYS.toMillis(1L) + jXiOIii1);
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodGlucose2> list);

    @aa1
    default List<BloodGlucose2> getListForDay(long j, long j2) {
        List<BloodGlucose2> list = getList(j, j2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) obj).getMTime()));
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((BloodGlucose2) CollectionsKt___CollectionsKt.IIII0iI((List) ((Map.Entry) it.next()).getValue()));
        }
        return arrayList2;
    }
}
