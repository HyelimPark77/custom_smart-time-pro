package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao_Impl;
import com.sma.smartv3.p608db.entity.RecordDeviceManage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDeviceFileManageDao_Impl implements RecordDeviceFileManageDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<RecordDeviceManage> __insertAdapterOfRecordDeviceManage = new EntityInsertAdapter<RecordDeviceManage>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileManageDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `RecordDeviceManage` (`mId`,`mTime`,`mLocalTime`,`mFileName`,`mName`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceManage entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMFileName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMFileName());
            }
            if (entity.getMName() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMName());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceManage> __deleteAdapterOfRecordDeviceManage = new EntityDeleteOrUpdateAdapter<RecordDeviceManage>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileManageDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `RecordDeviceManage` WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceManage entity) {
            statement.mo47599bindLong(1, entity.getMId());
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceManage> __updateAdapterOfRecordDeviceManage = new EntityDeleteOrUpdateAdapter<RecordDeviceManage>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileManageDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `RecordDeviceManage` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mFileName` = ?,`mName` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceManage entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMFileName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMFileName());
            }
            if (entity.getMName() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMName());
            }
            statement.mo47599bindLong(6, entity.getMId());
        }
    };

    public RecordDeviceFileManageDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ Object I0IIOi(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceManage WHERE mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List O00(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceManage WHERE REPLACE(LOWER(mName), '.aac', '') LIKE '%' || LOWER(?) || '%' ORDER BY mTime DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new RecordDeviceManage(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List OIi0(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceManage WHERE mFileName == ? ORDER BY mTime DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new RecordDeviceManage(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Object OXO1(RecordDeviceFileManageDao_Impl recordDeviceFileManageDao_Impl, List list, SQLiteConnection sQLiteConnection) {
        recordDeviceFileManageDao_Impl.__deleteAdapterOfRecordDeviceManage.handleMultiple(sQLiteConnection, list);
        return null;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceManage ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new RecordDeviceManage(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object XO0O10(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceManage");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ RecordDeviceManage m38184iO(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceManage WHERE mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            RecordDeviceManage recordDeviceManage = null;
            if (sQLiteStatementPrepare.step()) {
                recordDeviceManage = new RecordDeviceManage(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
            }
            return recordDeviceManage;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public void delete(final List<RecordDeviceManage> lists) {
        lists.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.vc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.OXO1(this.f11696IO, lists, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public void deleteAll() {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.oc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.XO0O10((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public void deleteById(final long id) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.sc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.I0IIOi(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public RecordDeviceManage getDeviceFiletById(final long id) {
        return (RecordDeviceManage) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.rc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.m38184iO(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> getListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.pc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.XIi00iiXO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> getListByType(final String fileName) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.tc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.OIi0(fileName, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public long[] insert(final List<RecordDeviceManage> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.qc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f10579IO.__insertAdapterOfRecordDeviceManage.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> searchByNameIgnoreCase(final String keyword) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.uc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileManageDao_Impl.O00(keyword, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao
    public int update(final List<RecordDeviceManage> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.nc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f9907IO.__updateAdapterOfRecordDeviceManage.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
