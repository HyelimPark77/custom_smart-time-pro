package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface BloodGlucoseDao {
    @Query("SELECT * FROM BloodGlucose WHERE mTime > 0 ORDER BY mTime DESC LIMIT 1")
    @aa1
    List<BloodGlucose> getLastData();

    @Query("SELECT * FROM BloodGlucose WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<BloodGlucose> getListASC();

    @Query("SELECT * FROM BloodGlucose WHERE mTime >= :start AND mTime < :end ORDER BY mTime DESC")
    @aa1
    List<BloodGlucose> getListDesc(long j, long j2);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodGlucose> list);

    @Update
    int update(@aa1 List<BloodGlucose> list);
}
