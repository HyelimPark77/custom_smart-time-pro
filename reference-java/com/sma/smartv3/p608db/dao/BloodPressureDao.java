package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.android.gms.common.util.GmsVersion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.BloodPressure;
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
        public static List<BloodPressure> getTestBloodPressures(@aa1 BloodPressureDao bloodPressureDao, long j, long j2) {
            return BloodPressureDao.super.getTestBloodPressures(j, j2);
        }
    }

    @Query("SELECT * FROM BloodPressure WHERE mTime >= :start AND mTime < :end AND mSystolic <200 AND mDiastolic >=60 ")
    @aa1
    List<BloodPressure> getBloodPressures(long j, long j2);

    @tb1
    @Query("SELECT * FROM BloodPressure WHERE mSystolic <200 AND mDiastolic >=60 ORDER BY mId DESC LIMIT 1")
    BloodPressure getLastBloodPressure();

    @Query("SELECT * FROM BloodPressure WHERE  mIsSync = 0 AND mTime > 0 AND mSystolic <200 AND mDiastolic >=60 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<BloodPressure> getListASC();

    @aa1
    default List<BloodPressure> getTestBloodPressures(long j, long j2) {
        if (TestData.INSTANCE.getTestBloodPressures().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String("bp"), new TypeToken<List<? extends BloodPressure>>() { // from class: com.sma.smartv3.db.dao.BloodPressureDao$getTestBloodPressures$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((BloodPressure) it.next()).setMTime(j);
                    j += (long) GmsVersion.VERSION_PARMESAN;
                }
                TestData.INSTANCE.getTestBloodPressures().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestBloodPressures();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodPressure> list);

    @Update
    int update(@aa1 List<BloodPressure> list);
}
