package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.Location;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface LocationDao {
    @Query("SELECT * FROM Location WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Location> getListASC();

    @Query("SELECT * FROM Location WHERE mTime >= :start AND mTime <= :end ORDER BY mTime ASC")
    @aa1
    List<Location> getLocation(long j, long j2);

    @Query("SELECT * FROM Location WHERE mTime >= :start AND mTime <= :end ORDER BY mTime DESC")
    @aa1
    List<Location> getLocationDESC(long j, long j2);

    @Query("SELECT * FROM Location WHERE mIsBaiDuSync = 0")
    @aa1
    List<Location> getNoBaiDuSyncList();

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Location> list);

    @Update
    int update(@aa1 List<Location> list);
}
