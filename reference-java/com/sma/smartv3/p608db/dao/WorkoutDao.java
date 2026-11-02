package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.Workout;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface WorkoutDao {

    public static final class DefaultImpls {
    }

    static /* synthetic */ List getListDESC$default(WorkoutDao workoutDao, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListDESC");
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return workoutDao.getListDESC(i, i2, i3);
    }

    static /* synthetic */ List getListModeDESC$default(WorkoutDao workoutDao, long j, long j2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListModeDESC");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return workoutDao.getListModeDESC(j, j2, i);
    }

    static /* synthetic */ List getNavigatorListModeDESC$default(WorkoutDao workoutDao, long j, long j2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNavigatorListModeDESC");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return workoutDao.getNavigatorListModeDESC(j, j2, i);
    }

    @Query("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart DESC LIMIT 50")
    @aa1
    List<Workout> getDescList();

    @tb1
    @Query("SELECT * FROM Workout WHERE mEnd = :endTime AND mMode = :mode LIMIT 1")
    Workout getFitnessWorkout(long j, int i);

    @Query("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart ASC LIMIT 150")
    @aa1
    List<Workout> getList();

    @Query("SELECT * FROM Workout WHERE  mIsSync = 0 AND mStart > 0 ORDER BY mStart ASC LIMIT 150")
    @aa1
    List<Workout> getListASC();

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1  AND mDuration > 0 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListByMode(int i);

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1 AND mSource = :source")
    @aa1
    List<Workout> getListByMode(int i, int i2);

    @Query("SELECT * FROM Workout WHERE mStart > 0 AND mMode != 0 AND mMode != :filterMode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Workout> getListDESC(int i, int i2, int i3);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode != :filterMode AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListDESC(long j, long j2, int i);

    @Query("SELECT * FROM Workout WHERE mStart > 0 AND mMode = :mode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Workout> getListDESCByMode(int i, int i2, int i3);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode == :filterMode AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListModeDESC(long j, long j2, int i);

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1   AND mChildNumber != -1 AND mDuration > 0 AND mNavigatorActualDistance > 0 ORDER BY mStart DESC")
    @aa1
    List<Workout> getNavigatorListByMode(int i);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mChildNumber != -1  AND mMode == :filterMode  AND mNavigatorActualDistance > 0 AND mDuration > 0 AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getNavigatorListModeDESC(long j, long j2, int i);

    @Query("SELECT * FROM Workout WHERE mStart = :startTime AND mEnd = :endTime")
    @aa1
    Workout getWorkout(long j, long j2);

    @Query("SELECT * FROM Workout WHERE mId = :id")
    @aa1
    Workout getWorkoutById(int i);

    @Insert
    @aa1
    long[] insert(@aa1 List<Workout> list);

    @Update
    int update(@aa1 Workout workout);

    @Update
    int update(@aa1 List<Workout> list);

    static /* synthetic */ List getListDESC$default(WorkoutDao workoutDao, long j, long j2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListDESC");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return workoutDao.getListDESC(j, j2, i);
    }
}
