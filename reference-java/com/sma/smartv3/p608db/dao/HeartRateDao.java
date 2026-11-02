package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.HeartRate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nHeartRateDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateDao.kt\ncom/sma/smartv3/db/dao/HeartRateDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1869#2,2:50\n*S KotlinDebug\n*F\n+ 1 HeartRateDao.kt\ncom/sma/smartv3/db/dao/HeartRateDao\n*L\n39#1:50,2\n*E\n"})
public interface HeartRateDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<HeartRate> getTestHeartRates(@aa1 HeartRateDao heartRateDao, long j, long j2) {
            return HeartRateDao.super.getTestHeartRates(j, j2);
        }
    }

    @Query("SELECT * FROM HeartRate WHERE mTime >= :start AND mTime < :end AND mBpm >= 50 AND mBpm<= 220")
    @aa1
    List<HeartRate> getHeartRates(long j, long j2);

    @tb1
    @Query("SELECT * FROM HeartRate WHERE mBpm >= 50 AND mBpm<= 220 ORDER BY mId DESC LIMIT 1")
    HeartRate getLastHeartRate();

    @Query("SELECT * FROM HeartRate WHERE  mIsSync = 0  AND mTime > 0 AND mBpm >= 50 AND mBpm<= 220 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<HeartRate> getListASC();

    @aa1
    default List<HeartRate> getTestHeartRates(long j, long j2) {
        if (TestData.INSTANCE.getTestHeartRates().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String("hr"), new TypeToken<List<? extends HeartRate>>() { // from class: com.sma.smartv3.db.dao.HeartRateDao$getTestHeartRates$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((HeartRate) it.next()).setMTime(j);
                    j += (long) TimeConstants.HOUR;
                }
                TestData.INSTANCE.getTestHeartRates().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestHeartRates();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<HeartRate> list);

    @Update
    int update(@aa1 List<HeartRate> list);
}
