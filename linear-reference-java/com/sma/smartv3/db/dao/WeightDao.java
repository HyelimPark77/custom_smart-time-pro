package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Weight;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nWeightDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n*L\n43#1:53,2\n*E\n"})
public interface WeightDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<Weight> getTestWeights(@aa1 WeightDao r0, long r1, long r3) {
            return WeightDao.access$getTestWeights$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestWeights$jd(WeightDao r0, long r1, long r3) {
        return super.getTestWeights(r1, r3);
    }

    @Query("DELETE FROM Weight WHERE mTime = :mTime")
    void delete(long r1);

    @Query("SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Weight> getListASC();

    @aa1
    default List<Weight> getTestWeights(long r4, long r6) {
        if (TestData.INSTANCE.getTestWeights().isEmpty() == false) goto L10;
        Object r7 = new Gson().fromJson(ResourceUtils.readAssets2String("weight"), new WeightDao$getTestWeights$list$1().getType());     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r7, "fromJson(...)");     // Catch: Exception -> L11
        List r8 = (List) r7;     // Catch: Exception -> L11
        Iterator r9 = r8.iterator();     // Catch: Exception -> L11
    L6:
        if (r9.hasNext() == false) goto L8;
        ((Weight) r9.next()).setMTime(r4);     // Catch: Exception -> L11
        r4 = r4 + TimeUnit.DAYS.toMillis(1);     // Catch: Exception -> L11
        goto L6
    L8:
        TestData.INSTANCE.getTestWeights().addAll(r8);     // Catch: Exception -> L11
    L10:
        return TestData.INSTANCE.getTestWeights();
    }

    @Query("SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC")
    @aa1
    List<Weight> getWeights();

    @Query("SELECT * FROM Weight WHERE mTime >= :start AND mTime < :end AND mIsDelete != 1 ORDER BY mTime ASC")
    @aa1
    List<Weight> getWeightsASC(long r1, long r3);

    @Query("SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Weight> getWeightsDESC(int r1, int r2);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Weight> r1);

    @Update
    int update(@aa1 List<Weight> r1);
}
