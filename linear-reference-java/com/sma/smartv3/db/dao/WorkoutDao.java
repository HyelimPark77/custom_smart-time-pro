package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.Workout;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface WorkoutDao {

    public static final class DefaultImpls {
        public static /* synthetic */ List getListDESC$default(WorkoutDao r0, int r1, int r2, int r3, int r4, Object r5) {
            return WorkoutDao.getListDESC$default(r0, r1, r2, r3, r4, r5);
        }

        public static /* synthetic */ List getListModeDESC$default(WorkoutDao r0, long r1, long r3, int r5, int r6, Object r7) {
            return WorkoutDao.getListModeDESC$default(r0, r1, r3, r5, r6, r7);
        }

        public static /* synthetic */ List getNavigatorListModeDESC$default(WorkoutDao r0, long r1, long r3, int r5, int r6, Object r7) {
            return WorkoutDao.getNavigatorListModeDESC$default(r0, r1, r3, r5, r6, r7);
        }

        public static /* synthetic */ List getListDESC$default(WorkoutDao r0, long r1, long r3, int r5, int r6, Object r7) {
            return WorkoutDao.getListDESC$default(r0, r1, r3, r5, r6, r7);
        }
    }

    static /* synthetic */ List getListDESC$default(WorkoutDao r0, int r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.getListDESC(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListDESC");
    }

    static /* synthetic */ List getListModeDESC$default(WorkoutDao r6, long r7, long r9, int r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 4) == 0) goto L7;
        r11 = 0;
    L7:
        return r6.getListModeDESC(r7, r9, r11);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListModeDESC");
    }

    static /* synthetic */ List getNavigatorListModeDESC$default(WorkoutDao r6, long r7, long r9, int r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 4) == 0) goto L7;
        r11 = 0;
    L7:
        return r6.getNavigatorListModeDESC(r7, r9, r11);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNavigatorListModeDESC");
    }

    @Query("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart DESC LIMIT 50")
    @aa1
    List<Workout> getDescList();

    @tb1
    @Query("SELECT * FROM Workout WHERE mEnd = :endTime AND mMode = :mode LIMIT 1")
    Workout getFitnessWorkout(long r1, int r3);

    @Query("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart ASC LIMIT 150")
    @aa1
    List<Workout> getList();

    @Query("SELECT * FROM Workout WHERE  mIsSync = 0 AND mStart > 0 ORDER BY mStart ASC LIMIT 150")
    @aa1
    List<Workout> getListASC();

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1  AND mDuration > 0 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListByMode(int r1);

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1 AND mSource = :source")
    @aa1
    List<Workout> getListByMode(int r1, int r2);

    @Query("SELECT * FROM Workout WHERE mStart > 0 AND mMode != 0 AND mMode != :filterMode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Workout> getListDESC(int r1, int r2, int r3);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode != :filterMode AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListDESC(long r1, long r3, int r5);

    @Query("SELECT * FROM Workout WHERE mStart > 0 AND mMode = :mode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<Workout> getListDESCByMode(int r1, int r2, int r3);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode == :filterMode AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getListModeDESC(long r1, long r3, int r5);

    @Query("SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1   AND mChildNumber != -1 AND mDuration > 0 AND mNavigatorActualDistance > 0 ORDER BY mStart DESC")
    @aa1
    List<Workout> getNavigatorListByMode(int r1);

    @Query("SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mChildNumber != -1  AND mMode == :filterMode  AND mNavigatorActualDistance > 0 AND mDuration > 0 AND mIsDelete !=1 ORDER BY mStart DESC")
    @aa1
    List<Workout> getNavigatorListModeDESC(long r1, long r3, int r5);

    @Query("SELECT * FROM Workout WHERE mStart = :startTime AND mEnd = :endTime")
    @aa1
    Workout getWorkout(long r1, long r3);

    @Query("SELECT * FROM Workout WHERE mId = :id")
    @aa1
    Workout getWorkoutById(int r1);

    @Insert
    @aa1
    long[] insert(@aa1 List<Workout> r1);

    @Update
    int update(@aa1 Workout r1);

    @Update
    int update(@aa1 List<Workout> r1);

    static /* synthetic */ List getListDESC$default(WorkoutDao r6, long r7, long r9, int r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 4) == 0) goto L7;
        r11 = 0;
    L7:
        return r6.getListDESC(r7, r9, r11);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListDESC");
    }
}
