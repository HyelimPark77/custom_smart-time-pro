package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.EnergyRating;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface EnergyRatingDao {
    @Query("SELECT * FROM EnergyRating WHERE mTime >= :start AND mTime < :end AND mScore > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<EnergyRating> getEnergyRating(long r1, long r3);

    @Query("SELECT * FROM EnergyRating WHERE  mIsSync = 0  AND mTime > 0 AND mScore > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<EnergyRating> getListASC();

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<EnergyRating> r1);

    @Update
    int update(@aa1 List<EnergyRating> r1);
}
