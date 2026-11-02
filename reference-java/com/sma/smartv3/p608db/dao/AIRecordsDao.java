package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.AIRecords;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface AIRecordsDao {
    @Query("SELECT * FROM airecords WHERE  mId = :id")
    @aa1
    AIRecords getAIRecord(long j);

    @Query("SELECT * FROM airecords WHERE  mIsSync = 0  ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<AIRecords> getListASC();

    @Query("SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1  ORDER BY mTime ASC")
    @aa1
    List<AIRecords> getListASC(int i);

    @Query("SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1 ORDER BY mTime DESC")
    @aa1
    List<AIRecords> getListDESC(int i);

    @Insert
    long insert(@aa1 AIRecords aIRecords);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<AIRecords> list);

    @Update
    int update(@aa1 AIRecords aIRecords);

    @Update
    int update(@aa1 List<AIRecords> list);
}
