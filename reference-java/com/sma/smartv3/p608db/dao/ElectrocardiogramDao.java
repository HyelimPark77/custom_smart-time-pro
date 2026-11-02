package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nElectrocardiogramDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1869#2,2:45\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n*L\n34#1:45,2\n*E\n"})
public interface ElectrocardiogramDao {

    public static final class DefaultImpls {
        @aa1
        @Deprecated
        public static List<Electrocardiogram> getTestElectrocardiograms(@aa1 ElectrocardiogramDao electrocardiogramDao, long j, long j2) {
            return ElectrocardiogramDao.super.getTestElectrocardiograms(j, j2);
        }
    }

    @Query("SELECT * FROM Electrocardiogram WHERE mTime >= :start AND mTime < :end AND mValue >= 50 AND mValue <= 220")
    @aa1
    List<Electrocardiogram> getElectrocardiograms(long j, long j2);

    @tb1
    @Query("SELECT * FROM Electrocardiogram ORDER BY mId DESC LIMIT 1")
    Electrocardiogram getLastElectrocardiogram();

    @aa1
    default List<Electrocardiogram> getTestElectrocardiograms(long j, long j2) {
        if (TestData.INSTANCE.getTestElectrocardiograms().isEmpty()) {
            try {
                Object objFromJson = new Gson().fromJson(ResourceUtils.readAssets2String(q62.XiI1iO1i), new TypeToken<List<? extends Electrocardiogram>>() { // from class: com.sma.smartv3.db.dao.ElectrocardiogramDao$getTestElectrocardiograms$list$1
                }.getType());
                Intrinsics.O10IXXX0X(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Electrocardiogram) it.next()).setMTime(j);
                    j += (long) TimeConstants.HOUR;
                }
                TestData.INSTANCE.getTestElectrocardiograms().addAll(list);
            } catch (Exception unused) {
            }
        }
        return TestData.INSTANCE.getTestElectrocardiograms();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Electrocardiogram> list);
}
