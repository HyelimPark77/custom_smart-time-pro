package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Sleep;
import java.util.Iterator;
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
        public static List<Sleep> getTestSleeps(@aa1 SleepDao r0, long r1, long r3) {
            return SleepDao.access$getTestSleeps$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestSleeps$jd(SleepDao r0, long r1, long r3) {
        return super.getTestSleeps(r1, r3);
    }

    @Query("DELETE FROM Sleep WHERE mTime >= :start AND mTime < :end")
    void deleteSleeps(long r1, long r3);

    @Query("SELECT * FROM Sleep WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Sleep> getListASC();

    @Query("SELECT * FROM Sleep WHERE mTime >= :start AND mTime < :end ORDER BY mTime ASC")
    @aa1
    List<Sleep> getSleeps(long r1, long r3);

    @aa1
    default List<Sleep> getTestSleeps(long r10, long r12) {
        if (TestData.INSTANCE.getTestSleeps().isEmpty() == false) goto L20;
        Object r0 = new Gson().fromJson(ResourceUtils.readAssets2String("sleep"), new SleepDao$getTestSleeps$list$1().getType());     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r0, "fromJson(...)");     // Catch: Exception -> L21
        List r1 = (List) r0;     // Catch: Exception -> L21
        long r11 = r10 + ((long) 36000000);     // Catch: Exception -> L21
        long r13 = r12 - ((long) 18000000);     // Catch: Exception -> L21
        Iterator r2 = r1.iterator();     // Catch: Exception -> L21
        int r3 = 0;
        long r4 = r11;
    L6:
        if (r2.hasNext() == false) goto L18;
        Object r5 = r2.next();     // Catch: Exception -> L21
        int r6 = r3 + 1;     // Catch: Exception -> L21
        if (r3 >= 0) goto L10;
        CollectionsKt__CollectionsKt.XOX0O0();     // Catch: Exception -> L21
    L10:
        Sleep r7 = (Sleep) r5;     // Catch: Exception -> L21
        if (r3 != 0) goto L14;
        r7.setMTime(r11 - ((long) 300000));     // Catch: Exception -> L21
    L17:
        r3 = r6;
        goto L6
    L14:
        if (r3 != (r1.size() - 1)) goto L16;
        r7.setMTime(((long) 300000) + r13);     // Catch: Exception -> L21
        goto L17
    L16:
        r7.setMTime(r4);     // Catch: Exception -> L21
        r4 = r4 + ((long) 600000);     // Catch: Exception -> L21
        goto L17
    L18:
        TestData.INSTANCE.getTestSleeps().addAll(r1);     // Catch: Exception -> L21
    L20:
        return TestData.INSTANCE.getTestSleeps();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Sleep> r1);

    @Update
    int update(@aa1 List<Sleep> r1);
}
