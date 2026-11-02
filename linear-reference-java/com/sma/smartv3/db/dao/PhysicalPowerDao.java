package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.PhysicalPower;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface PhysicalPowerDao {
    @Query("SELECT * FROM PhysicalPower WHERE mTime >= :start AND mTime < :end AND mValue >= 0 AND mValue<= 100")
    @aa1
    List<PhysicalPower> getDailyPower(long r1, long r3);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<PhysicalPower> r1);

    @Update
    int update(@aa1 List<PhysicalPower> r1);
}
