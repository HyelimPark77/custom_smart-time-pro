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
import com.sma.smartv3.p608db.entity.Hrv;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nHrvDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvDao.kt\ncom/sma/smartv3/db/dao/HrvDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1869#2,2:54\n*S KotlinDebug\n*F\n+ 1 HrvDao.kt\ncom/sma/smartv3/db/dao/HrvDao\n*L\n43#1:54,2\n*E\n"})
public interface HrvDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<Hrv> getTestHrv(@aa1 HrvDao hrvDao, long j, long j2) {
            return HrvDao.super.getTestHrv(j, j2);
        }
    }

    @Query("SELECT * FROM Hrv WHERE mTime >= :start AND mTime < :end AND mValue > 0 ")
    @aa1
    List<Hrv> getHrv(long j, long j2);

    @Query("SELECT * FROM Hrv WHERE mTime > 0 AND mValue > 0  ORDER BY mId DESC LIMIT 1")
    @aa1
    List<Hrv> getLastData();

    @Query("SELECT * FROM Hrv WHERE  mIsSync = 0  AND mTime > 0 AND mValue > 0  ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Hrv> getListASC();

    @aa1
    default List<Hrv> getTestHrv(long j, long j2) {
        if (TestData.INSTANCE.getTestHRVs().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String(q62.XOX1), new TypeToken<List<? extends Hrv>>() { // from class: com.sma.smartv3.db.dao.HrvDao$getTestHrv$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Hrv) it.next()).setMTime(j);
                    j += (long) TimeConstants.HOUR;
                }
                TestData.INSTANCE.getTestHRVs().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestHRVs();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Hrv> list);

    @Update
    int update(@aa1 List<Hrv> list);
}
