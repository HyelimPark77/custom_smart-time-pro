package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.Temperature;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface TemperatureDao {
    @Query("SELECT * FROM Temperature WHERE mTime > 0 ORDER BY mId DESC LIMIT 1")
    @aa1
    List<Temperature> getLastData();

    @Query("SELECT * FROM Temperature WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Temperature> getListASC();

    @Query("SELECT * FROM Temperature WHERE mTime >= :start AND mTime < :end ORDER BY mTime DESC")
    @aa1
    List<Temperature> getListDesc(long r1, long r3);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Temperature> r1);

    @Update
    int update(@aa1 List<Temperature> r1);
}
