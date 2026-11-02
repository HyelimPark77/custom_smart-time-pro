package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.SportDataDao_Impl;
import com.sma.smartv3.p608db.entity.SportData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class SportDataDao_Impl implements SportDataDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<SportData> __insertAdapterOfSportData = new EntityInsertAdapter<SportData>() { // from class: com.sma.smartv3.db.dao.SportDataDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `SportData` (`mId`,`mTime`,`mLocalTime`,`mStep`,`mDistance`,`mCalorie`,`mDuration`,`mSpm`,`mAltitude`,`mAirPressure`,`mPace`,`mSpeed`,`mMode`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final SportData entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMStep());
            statement.mo47599bindLong(5, entity.getMDistance());
            statement.mo47599bindLong(6, entity.getMCalorie());
            statement.mo47599bindLong(7, entity.getMDuration());
            statement.mo47599bindLong(8, entity.getMSpm());
            statement.mo47599bindLong(9, entity.getMAltitude());
            statement.mo47599bindLong(10, entity.getMAirPressure());
            statement.mo47599bindLong(11, entity.getMPace());
            statement.mo47599bindLong(12, entity.getMSpeed());
            statement.mo47599bindLong(13, entity.getMMode());
            statement.mo47599bindLong(14, entity.getMIsSync());
            statement.mo47599bindLong(15, entity.getMIsDelete());
        }
    };

    public SportDataDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List XIi00iiXO(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM SportData WHERE mTime >= ? AND mTime <= ? ORDER BY mTime ASC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.mo47599bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStep");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDistance");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCalorie");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpm");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAltitude");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAirPressure");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPace");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpeed");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMode");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                int i4 = columnIndexOrThrow4;
                int i5 = columnIndexOrThrow5;
                int i6 = columnIndexOrThrow15;
                arrayList2.add(new SportData((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(i), (int) sQLiteStatementPrepare.getLong(i6)));
                columnIndexOrThrow14 = i;
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow5 = i5;
                arrayList = arrayList2;
                columnIndexOrThrow3 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.p608db.dao.SportDataDao
    public List<SportData> getSportDataASC(final long startTime, final long endTime) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.hs4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDataDao_Impl.XIi00iiXO(startTime, endTime, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.SportDataDao
    public long[] insert(final List<SportData> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.is4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f8749IO.__insertAdapterOfSportData.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }
}
