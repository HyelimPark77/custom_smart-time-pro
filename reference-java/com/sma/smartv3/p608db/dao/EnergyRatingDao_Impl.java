package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.EnergyRatingDao_Impl;
import com.sma.smartv3.p608db.entity.EnergyRating;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class EnergyRatingDao_Impl implements EnergyRatingDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<EnergyRating> __insertAdapterOfEnergyRating = new EntityInsertAdapter<EnergyRating>() { // from class: com.sma.smartv3.db.dao.EnergyRatingDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `EnergyRating` (`mId`,`mTime`,`mLocalTime`,`mScore`,`mGear`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final EnergyRating entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMScore());
            statement.mo47599bindLong(5, entity.getMGear());
            statement.mo47599bindLong(6, entity.getMIsSync());
        }
    };
    private final EntityDeleteOrUpdateAdapter<EnergyRating> __updateAdapterOfEnergyRating = new EntityDeleteOrUpdateAdapter<EnergyRating>() { // from class: com.sma.smartv3.db.dao.EnergyRatingDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `EnergyRating` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mScore` = ?,`mGear` = ?,`mIsSync` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final EnergyRating entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMScore());
            statement.mo47599bindLong(5, entity.getMGear());
            statement.mo47599bindLong(6, entity.getMIsSync());
            statement.mo47599bindLong(7, entity.getMId());
        }
    };

    public EnergyRatingDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM EnergyRating WHERE  mIsSync = 0  AND mTime > 0 AND mScore > 0 ORDER BY mTime ASC LIMIT 150");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mGear");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new EnergyRating((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XIi00iiXO(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM EnergyRating WHERE mTime >= ? AND mTime < ? AND mScore > 0 ORDER BY mTime ASC LIMIT 150");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.mo47599bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mGear");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new EnergyRating((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
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

    @Override // com.sma.smartv3.p608db.dao.EnergyRatingDao
    public List<EnergyRating> getEnergyRating(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXO0iXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EnergyRatingDao_Impl.XIi00iiXO(start, end, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.EnergyRatingDao
    public List<EnergyRating> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXX11i0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EnergyRatingDao_Impl.OXO1((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.EnergyRatingDao
    public long[] insert(final List<EnergyRating> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0OIXIOIi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f7393IO.__insertAdapterOfEnergyRating.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.EnergyRatingDao
    public int update(final List<EnergyRating> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.OiIX1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f3722IO.__updateAdapterOfEnergyRating.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
