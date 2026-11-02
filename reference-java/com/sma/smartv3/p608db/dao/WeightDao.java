package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.Weight;
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
        public static List<Weight> getTestWeights(@aa1 WeightDao weightDao, long j, long j2) {
            return WeightDao.super.getTestWeights(j, j2);
        }
    }

    @Query("DELETE FROM Weight WHERE mTime = :mTime")
    void delete(long j);

    @Query("SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Weight> getListASC();

    @aa1
    default List<Weight> getTestWeights(long j, long j2) {
        if (TestData.INSTANCE.getTestWeights().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String("weight"), new TypeToken<List<? extends Weight>>() { // from class: com.sma.smartv3.db.dao.WeightDao$getTestWeights$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Weight) it.next()).setMTime(j);
                    j += TimeUnit.DAYS.toMillis(1L);
                }
                TestData.INSTANCE.getTestWeights().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestWeights();
    }

    @Query("SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC")
    @aa1
    List<Weight> getWeights();

    @Query("SELECT * FROM Weight WHERE mTime >= :start AND mTime < :end AND mIsDelete != 1 ORDER BY mTime ASC")
    @aa1
    List<Weight> getWeightsASC(long j, long j2);

    @Query("SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Weight> getWeightsDESC(int i, int i2);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Weight> list);

    @Update
    int update(@aa1 List<Weight> list);
}
