package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.Schedule;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface ScheduleDao {
    @Delete
    int delete(@aa1 Schedule r1);

    @tb1
    @Query("SELECT * FROM schedule WHERE mId=:id")
    Schedule get(int r1);

    @Query("SELECT * FROM schedule")
    @aa1
    List<Schedule> getAll();

    @Insert
    long insert(@aa1 Schedule r1);

    @Update
    int update(@aa1 Schedule... r1);
}
