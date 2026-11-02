package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao_Impl;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class WorkoutIndexDao_Impl implements WorkoutIndexDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkoutIndex> __insertAdapterOfWorkoutIndex = new EntityInsertAdapter<WorkoutIndex>() { // from class: com.sma.smartv3.db.dao.WorkoutIndexDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkoutIndex` (`mId`,`mFrom`,`mEndTime`,`mMode`,`mSyncStatus`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final WorkoutIndex entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMFrom());
            statement.mo47599bindLong(3, entity.getMEndTime());
            statement.mo47599bindLong(4, entity.getMMode());
            statement.mo47599bindLong(5, entity.getMSyncStatus());
        }
    };
    private final EntityDeleteOrUpdateAdapter<WorkoutIndex> __updateAdapterOfWorkoutIndex = new EntityDeleteOrUpdateAdapter<WorkoutIndex>() { // from class: com.sma.smartv3.db.dao.WorkoutIndexDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `WorkoutIndex` SET `mId` = ?,`mFrom` = ?,`mEndTime` = ?,`mMode` = ?,`mSyncStatus` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final WorkoutIndex entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMFrom());
            statement.mo47599bindLong(3, entity.getMEndTime());
            statement.mo47599bindLong(4, entity.getMMode());
            statement.mo47599bindLong(5, entity.getMSyncStatus());
            statement.mo47599bindLong(6, entity.getMId());
        }
    };

    public WorkoutIndexDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ Object XIi00iiXO(WorkoutIndexDao_Impl workoutIndexDao_Impl, WorkoutIndex workoutIndex, SQLiteConnection sQLiteConnection) {
        workoutIndexDao_Impl.__updateAdapterOfWorkoutIndex.handle(sQLiteConnection, workoutIndex);
        return null;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ WorkoutIndex m38198iO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WorkoutIndex WHERE mSyncStatus != 1 LIMIT 1");
        try {
            return sQLiteStatementPrepare.step() ? new WorkoutIndex((int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFrom")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mEndTime")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMode")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSyncStatus"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.WorkoutIndexDao
    public WorkoutIndex getNotSynced() {
        return (WorkoutIndex) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.z57
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorkoutIndexDao_Impl.m38198iO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WorkoutIndexDao
    public long insert(final WorkoutIndex workoutIndex) {
        workoutIndex.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.x57
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f12112IO.__insertAdapterOfWorkoutIndex.insertAndReturnId((SQLiteConnection) obj, workoutIndex));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.WorkoutIndexDao
    public void update(final WorkoutIndex workoutIndex) {
        workoutIndex.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.y57
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorkoutIndexDao_Impl.XIi00iiXO(this.f12317IO, workoutIndex, (SQLiteConnection) obj);
            }
        });
    }
}
