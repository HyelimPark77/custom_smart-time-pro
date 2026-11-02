package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.RespiratoryRate;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface RespiratoryRateDao {
    @tb1
    @Query("SELECT * FROM RespiratoryRate WHERE mValue >= 0 AND mValue<= 220 ORDER BY mTime DESC LIMIT 1")
    RespiratoryRate getLastRespiratoryRate();

    @Query("SELECT * FROM RespiratoryRate WHERE  mIsSync = 0  AND mTime > 0 AND mValue >= 0 AND mValue<= 220 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<RespiratoryRate> getListASC();

    @Query("SELECT * FROM RespiratoryRate WHERE mTime >= :start AND mTime < :end AND mValue >= 0 AND mValue<= 220")
    @aa1
    List<RespiratoryRate> getRespiratoryRates(long j, long j2);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<RespiratoryRate> list);

    @Update
    int update(@aa1 List<RespiratoryRate> list);
}
