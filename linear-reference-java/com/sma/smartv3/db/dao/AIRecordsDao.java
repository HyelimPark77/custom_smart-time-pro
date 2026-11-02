package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.AIRecords;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface AIRecordsDao {
    @Query("SELECT * FROM airecords WHERE  mId = :id")
    @aa1
    AIRecords getAIRecord(long r1);

    @Query("SELECT * FROM airecords WHERE  mIsSync = 0  ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<AIRecords> getListASC();

    @Query("SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1  ORDER BY mTime ASC")
    @aa1
    List<AIRecords> getListASC(int r1);

    @Query("SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1 ORDER BY mTime DESC")
    @aa1
    List<AIRecords> getListDESC(int r1);

    @Insert
    long insert(@aa1 AIRecords r1);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<AIRecords> r1);

    @Update
    int update(@aa1 AIRecords r1);

    @Update
    int update(@aa1 List<AIRecords> r1);
}
