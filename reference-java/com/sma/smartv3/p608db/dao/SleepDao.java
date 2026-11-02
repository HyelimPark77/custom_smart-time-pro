package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.Sleep;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nSleepDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1878#2,3:58\n*S KotlinDebug\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n*L\n38#1:58,3\n*E\n"})
public interface SleepDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<Sleep> getTestSleeps(@aa1 SleepDao sleepDao, long j, long j2) {
            return SleepDao.super.getTestSleeps(j, j2);
        }
    }

    @Query("DELETE FROM Sleep WHERE mTime >= :start AND mTime < :end")
    void deleteSleeps(long j, long j2);

    @Query("SELECT * FROM Sleep WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Sleep> getListASC();

    @Query("SELECT * FROM Sleep WHERE mTime >= :start AND mTime < :end ORDER BY mTime ASC")
    @aa1
    List<Sleep> getSleeps(long j, long j2);

    @aa1
    default List<Sleep> getTestSleeps(long j, long j2) {
        if (TestData.INSTANCE.getTestSleeps().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String("sleep"), new TypeToken<List<? extends Sleep>>() { // from class: com.sma.smartv3.db.dao.SleepDao$getTestSleeps$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                long j3 = j + ((long) 36000000);
                long j4 = j2 - ((long) 18000000);
                int i = 0;
                long j5 = j3;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    Sleep sleep = (Sleep) obj;
                    if (i == 0) {
                        sleep.setMTime(j3 - ((long) 300000));
                    } else if (i == list.size() - 1) {
                        sleep.setMTime(((long) 300000) + j4);
                    } else {
                        sleep.setMTime(j5);
                        j5 += (long) 600000;
                    }
                    i = i2;
                }
                TestData.INSTANCE.getTestSleeps().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestSleeps();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Sleep> list);

    @Update
    int update(@aa1 List<Sleep> list);
}
