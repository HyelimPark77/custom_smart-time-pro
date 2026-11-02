package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.android.gms.common.util.GmsVersion;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.BloodPressure;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nBloodPressureDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDao.kt\ncom/sma/smartv3/db/dao/BloodPressureDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1869#2,2:46\n*S KotlinDebug\n*F\n+ 1 BloodPressureDao.kt\ncom/sma/smartv3/db/dao/BloodPressureDao\n*L\n36#1:46,2\n*E\n"})
public interface BloodPressureDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<BloodPressure> getTestBloodPressures(@aa1 BloodPressureDao r0, long r1, long r3) {
            return BloodPressureDao.access$getTestBloodPressures$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestBloodPressures$jd(BloodPressureDao r0, long r1, long r3) {
        return super.getTestBloodPressures(r1, r3);
    }

    @Query("SELECT * FROM BloodPressure WHERE mTime >= :start AND mTime < :end AND mSystolic <200 AND mDiastolic >=60 ")
    @aa1
    List<BloodPressure> getBloodPressures(long r1, long r3);

    @tb1
    @Query("SELECT * FROM BloodPressure WHERE mSystolic <200 AND mDiastolic >=60 ORDER BY mId DESC LIMIT 1")
    BloodPressure getLastBloodPressure();

    @Query("SELECT * FROM BloodPressure WHERE  mIsSync = 0 AND mTime > 0 AND mSystolic <200 AND mDiastolic >=60 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<BloodPressure> getListASC();

    @aa1
    default List<BloodPressure> getTestBloodPressures(long r3, long r5) {
        if (TestData.INSTANCE.getTestBloodPressures().isEmpty() == false) goto L10;
        Object r6 = new Gson().fromJson(ResourceUtils.readAssets2String("bp"), new BloodPressureDao$getTestBloodPressures$list$1().getType());     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r6, "fromJson(...)");     // Catch: Exception -> L11
        List r7 = (List) r6;     // Catch: Exception -> L11
        Iterator r8 = r7.iterator();     // Catch: Exception -> L11
    L6:
        if (r8.hasNext() == false) goto L8;
        ((BloodPressure) r8.next()).setMTime(r3);     // Catch: Exception -> L11
        r3 = r3 + ((long) GmsVersion.VERSION_PARMESAN);     // Catch: Exception -> L11
        goto L6
    L8:
        TestData.INSTANCE.getTestBloodPressures().addAll(r7);     // Catch: Exception -> L11
    L10:
        return TestData.INSTANCE.getTestBloodPressures();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodPressure> r1);

    @Update
    int update(@aa1 List<BloodPressure> r1);
}
