package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface ActivityDao {
    @tb1
    @Query("SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mStep >= 0 AND mCalorie > 0 AND mStep < 1000000 ORDER BY mTime DESC LIMIT 1")
    Activity getActivity(long j, long j2);

    @tb1
    @Query("SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mMode = :mode AND mState = 0 ORDER BY mTime DESC LIMIT 1")
    Activity getBeginItem(long j, long j2, int i);

    @tb1
    @Query("SELECT * FROM activity WHERE mTime = :end AND mMode = :mode AND mState = 4")
    Activity getEndItem(long j, int i);

    @tb1
    @Query("SELECT * FROM Activity WHERE  mIsSync = 1 AND mTime > 0  ORDER BY mTime DESC LIMIT 1")
    Activity getLastSyncItem();

    @Query("SELECT * FROM Activity WHERE  mIsSync = 0 AND mTime > 0  ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<Activity> getListASC();

    @Query("SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mCalorie >= 0 AND mStep <1000000 AND mDistance > 0 ORDER BY mTime ASC")
    @aa1
    List<Activity> getListASC(long j, long j2);

    @Query("SELECT * FROM activity WHERE mTime >= :start AND mTime <= :end  AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC")
    @aa1
    List<Activity> getListDESC(long j, long j2);

    @tb1
    @Query("SELECT * FROM Activity WHERE  mId > :id AND mTime > 0  ORDER BY mId ASC LIMIT 1")
    Activity getNextItemByID(int i);

    @tb1
    @Query("SELECT * FROM Activity WHERE  mId < :id AND mTime > 0  ORDER BY mId DESC LIMIT 1")
    Activity getPreviousItemByID(int i);

    @Query("SELECT * FROM Activity WHERE mState = :state AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Activity> getStateActivityList(int i, int i2, int i3);

    @Query("SELECT * FROM activity WHERE mTime >= :start AND mTime <= :end AND mMode = :mode ORDER BY mTime DESC")
    @aa1
    List<Activity> getWorkoutListDESC(long j, long j2, int i);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<Activity> list);

    @Update
    int update(@aa1 List<Activity> list);
}
