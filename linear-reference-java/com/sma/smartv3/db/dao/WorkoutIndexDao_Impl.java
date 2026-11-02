package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.x57;
import com.android.mltcode.paycertificationapi.y57;
import com.android.mltcode.paycertificationapi.z57;
import com.sma.smartv3.db.entity.WorkoutIndex;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class WorkoutIndexDao_Impl implements WorkoutIndexDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkoutIndex> __insertAdapterOfWorkoutIndex;
    private final EntityDeleteOrUpdateAdapter<WorkoutIndex> __updateAdapterOfWorkoutIndex;

    public WorkoutIndexDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfWorkoutIndex = new AnonymousClass1(this);
        this.__updateAdapterOfWorkoutIndex = new AnonymousClass2(this);
    }

    public static /* synthetic */ Long OXO1(WorkoutIndexDao_Impl r0, WorkoutIndex r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfWorkoutIndex.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Object XIi00iiXO(WorkoutIndexDao_Impl r0, WorkoutIndex r1, SQLiteConnection r2) {
        r0.__updateAdapterOfWorkoutIndex.handle(r2, r1);
        return null;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ WorkoutIndex iO(SQLiteConnection r14) {
        SQLiteStatement r15 = r14.prepare("SELECT * FROM WorkoutIndex WHERE mSyncStatus != 1 LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "mId");     // Catch: Throwable -> L7
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "mFrom");     // Catch: Throwable -> L7
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "mEndTime");     // Catch: Throwable -> L7
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "mMode");     // Catch: Throwable -> L7
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "mSyncStatus");     // Catch: Throwable -> L7
        if (r15.step() == false) goto L9;
        WorkoutIndex r7 = new WorkoutIndex((int) r15.getLong(r0), (int) r15.getLong(r1), r15.getLong(r2), (int) r15.getLong(r3), (int) r15.getLong(r4));     // Catch: Throwable -> L7
    L10:
        r15.close();
        return r7;
    L9:
        r7 = null;
    L7:
        th = move-exception;
        r15.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.WorkoutIndexDao
    public WorkoutIndex getNotSynced() {
        return (WorkoutIndex) DBUtil.performBlocking(this.__db, true, false, new z57());
    }

    @Override // com.sma.smartv3.db.dao.WorkoutIndexDao
    public long insert(final WorkoutIndex workoutIndex) {
        workoutIndex.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new x57(this, workoutIndex))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.WorkoutIndexDao
    public void update(final WorkoutIndex workoutIndex) {
        workoutIndex.getClass();
        DBUtil.performBlocking(this.__db, false, true, new y57(this, workoutIndex));
    }
}
