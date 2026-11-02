package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.HeartRate;
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
        public static List<HeartRate> getTestHeartRates(@aa1 HeartRateDao r0, long r1, long r3) {
            return HeartRateDao.access$getTestHeartRates$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestHeartRates$jd(HeartRateDao r0, long r1, long r3) {
        return super.getTestHeartRates(r1, r3);
    }

    @Query("SELECT * FROM HeartRate WHERE mTime >= :start AND mTime < :end AND mBpm >= 50 AND mBpm<= 220")
    @aa1
    List<HeartRate> getHeartRates(long r1, long r3);

    @tb1
    @Query("SELECT * FROM HeartRate WHERE mBpm >= 50 AND mBpm<= 220 ORDER BY mId DESC LIMIT 1")
    HeartRate getLastHeartRate();

    @Query("SELECT * FROM HeartRate WHERE  mIsSync = 0  AND mTime > 0 AND mBpm >= 50 AND mBpm<= 220 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<HeartRate> getListASC();

    @aa1
    default List<HeartRate> getTestHeartRates(long r3, long r5) {
        if (TestData.INSTANCE.getTestHeartRates().isEmpty() == false) goto L10;
        Object r6 = new Gson().fromJson(ResourceUtils.readAssets2String("hr"), new HeartRateDao$getTestHeartRates$list$1().getType());     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r6, "fromJson(...)");     // Catch: Exception -> L11
        List r7 = (List) r6;     // Catch: Exception -> L11
        Iterator r8 = r7.iterator();     // Catch: Exception -> L11
    L6:
        if (r8.hasNext() == false) goto L8;
        ((HeartRate) r8.next()).setMTime(r3);     // Catch: Exception -> L11
        r3 = r3 + ((long) TimeConstants.HOUR);     // Catch: Exception -> L11
        goto L6
    L8:
        TestData.INSTANCE.getTestHeartRates().addAll(r7);     // Catch: Exception -> L11
    L10:
        return TestData.INSTANCE.getTestHeartRates();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<HeartRate> r1);

    @Update
    int update(@aa1 List<HeartRate> r1);
}
