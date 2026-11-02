package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Pressure;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nPressureDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureDao.kt\ncom/sma/smartv3/db/dao/PressureDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1869#2,2:51\n*S KotlinDebug\n*F\n+ 1 PressureDao.kt\ncom/sma/smartv3/db/dao/PressureDao\n*L\n40#1:51,2\n*E\n"})
public interface PressureDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<Pressure> getTestPressures(@aa1 PressureDao r0, long r1, long r3) {
            return PressureDao.access$getTestPressures$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestPressures$jd(PressureDao r0, long r1, long r3) {
        return super.getTestPressures(r1, r3);
    }

    @Query("SELECT * FROM Pressure WHERE mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mId DESC LIMIT 1")
    @aa1
    List<Pressure> getLastData();

    @Query("SELECT * FROM Pressure WHERE  mIsSync = 0  AND mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Pressure> getListASC();

    @Query("SELECT * FROM Pressure WHERE mTime >= :start AND mTime < :end AND mValue > 0 AND mValue <= 100")
    @aa1
    List<Pressure> getPressures(long r1, long r3);

    @aa1
    default List<Pressure> getTestPressures(long r3, long r5) {
        if (TestData.INSTANCE.getTestPressures().isEmpty() == false) goto L10;
        Object r6 = new Gson().fromJson(ResourceUtils.readAssets2String(q62.IIII0II), new PressureDao$getTestPressures$list$1().getType());     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r6, "fromJson(...)");     // Catch: Exception -> L11
        List r7 = (List) r6;     // Catch: Exception -> L11
        Iterator r8 = r7.iterator();     // Catch: Exception -> L11
    L6:
        if (r8.hasNext() == false) goto L8;
        ((Pressure) r8.next()).setMTime(r3);     // Catch: Exception -> L11
        r3 = r3 + ((long) TimeConstants.HOUR);     // Catch: Exception -> L11
        goto L6
    L8:
        TestData.INSTANCE.getTestPressures().addAll(r7);     // Catch: Exception -> L11
    L10:
        return TestData.INSTANCE.getTestPressures();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Pressure> r1);

    @Update
    int update(@aa1 List<Pressure> r1);
}
