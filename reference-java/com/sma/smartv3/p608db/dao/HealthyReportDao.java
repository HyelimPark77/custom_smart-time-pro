package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.HealthyReport;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface HealthyReportDao {
    @Query("SELECT * FROM healthyReport WHERE  mId = :id")
    @aa1
    HealthyReport getHealthyReport(long j);

    @Query("SELECT * FROM healthyReport WHERE  mTime > 0  ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<HealthyReport> getListASC();

    @Insert
    long insert(@aa1 HealthyReport healthyReport);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<HealthyReport> list);

    @Update
    int update(@aa1 List<HealthyReport> list);
}
