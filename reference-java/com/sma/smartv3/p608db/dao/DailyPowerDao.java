package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.DailyPower;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface DailyPowerDao {
    @tb1
    @Query("SELECT * FROM DailyPower WHERE mTime >= :start AND mTime < :end AND mValue >= 0 AND mValue<= 100 ORDER BY mTime DESC LIMIT 1")
    DailyPower getDailyPower(long j, long j2);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<DailyPower> list);

    @Update
    int update(@aa1 List<DailyPower> list);
}
