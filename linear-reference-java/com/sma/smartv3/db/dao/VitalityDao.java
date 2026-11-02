package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.Vitality;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface VitalityDao {
    @Query("SELECT * FROM Vitality WHERE mAllVitality >= 50 AND mAllVitality<= 220 ORDER BY mTime DESC LIMIT 1")
    @aa1
    Vitality getLastVitality();

    @Query("SELECT * FROM Vitality WHERE  mIsSync = 0  AND mTime > 0 AND mAllVitality >= 50 AND mAllVitality<= 220 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Vitality> getListASC();

    @Query("SELECT * FROM Vitality WHERE mTime >= :start AND mTime < :end AND mAllVitality >= 50 AND mAllVitality<= 220")
    @aa1
    List<Vitality> getVitalityList(long r1, long r3);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Vitality> r1);

    @Update
    int update(@aa1 List<Vitality> r1);
}
