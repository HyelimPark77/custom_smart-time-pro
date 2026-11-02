package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.BloodOxygen;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface BloodOxygenDao {
    @Query("SELECT * FROM BloodOxygen WHERE mTime >= :start AND mTime < :end AND mValue >= 10 AND mValue<= 150")
    @aa1
    List<BloodOxygen> getBloodOxygen(long r1, long r3);

    @tb1
    @Query("SELECT * FROM BloodOxygen WHERE mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mId DESC LIMIT 1")
    BloodOxygen getLastBloodOxygen();

    @Query("SELECT * FROM BloodOxygen WHERE  mIsSync = 0  AND mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<BloodOxygen> getListASC();

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<BloodOxygen> r1);

    @Update
    int update(@aa1 List<BloodOxygen> r1);
}
