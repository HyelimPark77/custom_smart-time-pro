package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ResourceUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Electrocardiogram;
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
        public static List<Electrocardiogram> getTestElectrocardiograms(@aa1 ElectrocardiogramDao r0, long r1, long r3) {
            return ElectrocardiogramDao.access$getTestElectrocardiograms$jd(r0, r1, r3);
        }
    }

    static /* synthetic */ List access$getTestElectrocardiograms$jd(ElectrocardiogramDao r0, long r1, long r3) {
        return super.getTestElectrocardiograms(r1, r3);
    }

    @Query("SELECT * FROM Electrocardiogram WHERE mTime >= :start AND mTime < :end AND mValue >= 50 AND mValue <= 220")
    @aa1
    List<Electrocardiogram> getElectrocardiograms(long r1, long r3);

    @tb1
    @Query("SELECT * FROM Electrocardiogram ORDER BY mId DESC LIMIT 1")
    Electrocardiogram getLastElectrocardiogram();

    @aa1
    default List<Electrocardiogram> getTestElectrocardiograms(long r3, long r5) {
        if (TestData.INSTANCE.getTestElectrocardiograms().isEmpty() == false) goto L10;
        Object r6 = new Gson().fromJson(ResourceUtils.readAssets2String(q62.XiI1iO1i), new ElectrocardiogramDao$getTestElectrocardiograms$list$1().getType());     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r6, "fromJson(...)");     // Catch: Exception -> L11
        List r7 = (List) r6;     // Catch: Exception -> L11
        Iterator r8 = r7.iterator();     // Catch: Exception -> L11
    L6:
        if (r8.hasNext() == false) goto L8;
        ((Electrocardiogram) r8.next()).setMTime(r3);     // Catch: Exception -> L11
        r3 = r3 + ((long) TimeConstants.HOUR);     // Catch: Exception -> L11
        goto L6
    L8:
        TestData.INSTANCE.getTestElectrocardiograms().addAll(r7);     // Catch: Exception -> L11
    L10:
        return TestData.INSTANCE.getTestElectrocardiograms();
    }

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Electrocardiogram> r1);
}
