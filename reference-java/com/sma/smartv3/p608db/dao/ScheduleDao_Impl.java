package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.ScheduleDao_Impl;
import com.sma.smartv3.p608db.entity.Schedule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class ScheduleDao_Impl implements ScheduleDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Schedule> __insertAdapterOfSchedule = new EntityInsertAdapter<Schedule>() { // from class: com.sma.smartv3.db.dao.ScheduleDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `Schedule` (`mId`,`mScheduleId`,`mYear`,`mMonth`,`mDay`,`mHour`,`mMinute`,`mAdvance`,`mTitle`,`mContent`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final Schedule entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMScheduleId());
            statement.mo47599bindLong(3, entity.getMYear());
            statement.mo47599bindLong(4, entity.getMMonth());
            statement.mo47599bindLong(5, entity.getMDay());
            statement.mo47599bindLong(6, entity.getMHour());
            statement.mo47599bindLong(7, entity.getMMinute());
            statement.mo47599bindLong(8, entity.getMAdvance());
            if (entity.getMTitle() == null) {
                statement.mo47600bindNull(9);
            } else {
                statement.mo47601bindText(9, entity.getMTitle());
            }
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMContent());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<Schedule> __deleteAdapterOfSchedule = new EntityDeleteOrUpdateAdapter<Schedule>() { // from class: com.sma.smartv3.db.dao.ScheduleDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `Schedule` WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final Schedule entity) {
            statement.mo47599bindLong(1, entity.getMId());
        }
    };
    private final EntityDeleteOrUpdateAdapter<Schedule> __updateAdapterOfSchedule = new EntityDeleteOrUpdateAdapter<Schedule>() { // from class: com.sma.smartv3.db.dao.ScheduleDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `Schedule` SET `mId` = ?,`mScheduleId` = ?,`mYear` = ?,`mMonth` = ?,`mDay` = ?,`mHour` = ?,`mMinute` = ?,`mAdvance` = ?,`mTitle` = ?,`mContent` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final Schedule entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMScheduleId());
            statement.mo47599bindLong(3, entity.getMYear());
            statement.mo47599bindLong(4, entity.getMMonth());
            statement.mo47599bindLong(5, entity.getMDay());
            statement.mo47599bindLong(6, entity.getMHour());
            statement.mo47599bindLong(7, entity.getMMinute());
            statement.mo47599bindLong(8, entity.getMAdvance());
            if (entity.getMTitle() == null) {
                statement.mo47600bindNull(9);
            } else {
                statement.mo47601bindText(9, entity.getMTitle());
            }
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMContent());
            }
            statement.mo47599bindLong(11, entity.getMId());
        }
    };

    public ScheduleDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM schedule");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScheduleId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mYear");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMonth");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDay");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHour");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinute");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAdvance");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTitle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                arrayList.add(new Schedule((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Schedule XO0O10(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM schedule WHERE mId=?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScheduleId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mYear");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMonth");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDay");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHour");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinute");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAdvance");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTitle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            Schedule schedule = null;
            if (sQLiteStatementPrepare.step()) {
                schedule = new Schedule((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
            }
            return schedule;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.p608db.dao.ScheduleDao
    public int delete(final Schedule schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.vu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f11815IO.__deleteAdapterOfSchedule.handle((SQLiteConnection) obj, schedule));
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.ScheduleDao
    public Schedule get(final int id) {
        return (Schedule) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.yu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScheduleDao_Impl.XO0O10(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.ScheduleDao
    public List<Schedule> getAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.zu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScheduleDao_Impl.XIi00iiXO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.ScheduleDao
    public long insert(final Schedule schedule) {
        schedule.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.xu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f12238IO.__insertAdapterOfSchedule.insertAndReturnId((SQLiteConnection) obj, schedule));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.ScheduleDao
    public int update(final Schedule... schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.wu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f12038IO.__updateAdapterOfSchedule.handleMultiple((SQLiteConnection) obj, schedule));
            }
        })).intValue();
    }
}
