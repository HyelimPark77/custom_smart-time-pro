package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.RecordSchedule;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface RecordScheduleDao {
    @Delete
    int delete(@aa1 RecordSchedule r1);

    @Query("DELETE FROM RecordSchedule WHERE mDeviceFileId = :deviceFileId AND mStatus != :keepStatus")
    int deleteUnoperatedByDeviceFileId(long r1, int r3);

    @Query("SELECT * FROM RecordSchedule ORDER BY mRemindTime ASC")
    @aa1
    List<RecordSchedule> getAllSchedules();

    @Query("SELECT * FROM RecordSchedule WHERE mStatus = 2 ORDER BY mLastRemindTime ASC")
    @aa1
    List<RecordSchedule> getCompletedSchedules();

    @Query("SELECT * FROM RecordSchedule WHERE mStatus = 1 ORDER BY mLastRemindTime ASC")
    @aa1
    List<RecordSchedule> getExpiredSchedules();

    @Query("SELECT * FROM RecordSchedule WHERE mStatus = 0 ORDER BY mIsRemindEnabled DESC, mLastRemindTime ASC")
    @aa1
    List<RecordSchedule> getPlannedSchedules();

    @tb1
    @Query("SELECT * FROM RecordSchedule WHERE mId = :id")
    RecordSchedule getScheduleById(long r1);

    @Query("SELECT * FROM RecordSchedule WHERE mDeviceFileId = :deviceFileId")
    @aa1
    List<RecordSchedule> getSchedulesByDeviceFileId(long r1);

    @Query("SELECT * FROM RecordSchedule WHERE mStatus = :status ORDER BY mRemindTime ASC")
    @aa1
    List<RecordSchedule> getSchedulesByStatus(int r1);

    @Query("SELECT * FROM RecordSchedule WHERE mStatus = 0 AND mIsRemindEnabled = 1 AND date(mLastRemindTime / 1000, 'unixepoch') = date('now') ORDER BY mLastRemindTime ASC")
    @aa1
    List<RecordSchedule> getTodySchedules();

    @Insert(onConflict = 1)
    long insert(@aa1 RecordSchedule r1);

    @Update
    int update(@aa1 RecordSchedule r1);
}
