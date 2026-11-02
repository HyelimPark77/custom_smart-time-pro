package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.SportData;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface SportDataDao {
    @Query("SELECT * FROM SportData WHERE mTime >= :startTime AND mTime <= :endTime ORDER BY mTime ASC")
    @aa1
    List<SportData> getSportDataASC(long j, long j2);

    @Insert
    @aa1
    long[] insert(@aa1 List<SportData> list);
}
