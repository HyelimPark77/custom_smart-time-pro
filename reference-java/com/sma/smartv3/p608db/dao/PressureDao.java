package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.Pressure;
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
        public static List<Pressure> getTestPressures(@aa1 PressureDao pressureDao, long j, long j2) {
            return PressureDao.super.getTestPressures(j, j2);
        }
    }

    @Query("SELECT * FROM Pressure WHERE mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mId DESC LIMIT 1")
    @aa1
    List<Pressure> getLastData();

    @Query("SELECT * FROM Pressure WHERE  mIsSync = 0  AND mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Pressure> getListASC();

    @Query("SELECT * FROM Pressure WHERE mTime >= :start AND mTime < :end AND mValue > 0 AND mValue <= 100")
    @aa1
    List<Pressure> getPressures(long j, long j2);

    @aa1
    default List<Pressure> getTestPressures(long j, long j2) {
        if (TestData.INSTANCE.getTestPressures().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String(q62.IIII0II), new TypeToken<List<? extends Pressure>>() { // from class: com.sma.smartv3.db.dao.PressureDao$getTestPressures$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Pressure) it.next()).setMTime(j);
                    j += (long) TimeConstants.HOUR;
                }
                TestData.INSTANCE.getTestPressures().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestPressures();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Pressure> list);

    @Update
    int update(@aa1 List<Pressure> list);
}
