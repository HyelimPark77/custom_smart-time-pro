package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.WorkoutIndex;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface WorkoutIndexDao {
    @tb1
    @Query("SELECT * FROM WorkoutIndex WHERE mSyncStatus != 1 LIMIT 1")
    WorkoutIndex getNotSynced();

    @Insert(onConflict = 5)
    long insert(@aa1 WorkoutIndex workoutIndex);

    @Update
    void update(@aa1 WorkoutIndex workoutIndex);
}
