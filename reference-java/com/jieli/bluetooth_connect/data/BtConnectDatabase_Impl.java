package com.jieli.bluetooth_connect.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p556db.SupportSQLiteDatabase;
import androidx.sqlite.p556db.SupportSQLiteOpenHelper;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class BtConnectDatabase_Impl extends BtConnectDatabase {
    private volatile HistoryRecordDao _historyRecordDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `HistoryRecord`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "HistoryRecord");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) { // from class: com.jieli.bluetooth_connect.data.BtConnectDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `address` TEXT NOT NULL, `mapped_address` TEXT, `dev_type` INTEGER NOT NULL, `connect_type` INTEGER NOT NULL, `sdk_flag` INTEGER NOT NULL, `vid` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `pid` INTEGER NOT NULL, `left_dev_lat` REAL NOT NULL, `left_dev_lon` REAL NOT NULL, `left_dev_update_time` INTEGER NOT NULL, `right_dev_lat` REAL NOT NULL, `right_dev_lon` REAL NOT NULL, `right_dev_update_time` INTEGER NOT NULL, `online_time` INTEGER NOT NULL, `update_address` TEXT)");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '37c904c212639270e9bf47ab0db1554c')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `HistoryRecord`");
                if (((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                ((RoomDatabase) BtConnectDatabase_Impl.this).mDatabase = _db;
                BtConnectDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) BtConnectDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase _db) {
                DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
                HashMap map = new HashMap(18);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
                map.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, 1));
                map.put("mapped_address", new TableInfo.Column("mapped_address", "TEXT", false, 0, null, 1));
                map.put("dev_type", new TableInfo.Column("dev_type", "INTEGER", true, 0, null, 1));
                map.put("connect_type", new TableInfo.Column("connect_type", "INTEGER", true, 0, null, 1));
                map.put("sdk_flag", new TableInfo.Column("sdk_flag", "INTEGER", true, 0, null, 1));
                map.put("vid", new TableInfo.Column("vid", "INTEGER", true, 0, null, 1));
                map.put("uid", new TableInfo.Column("uid", "INTEGER", true, 0, null, 1));
                map.put("pid", new TableInfo.Column("pid", "INTEGER", true, 0, null, 1));
                map.put("left_dev_lat", new TableInfo.Column("left_dev_lat", "REAL", true, 0, null, 1));
                map.put("left_dev_lon", new TableInfo.Column("left_dev_lon", "REAL", true, 0, null, 1));
                map.put("left_dev_update_time", new TableInfo.Column("left_dev_update_time", "INTEGER", true, 0, null, 1));
                map.put("right_dev_lat", new TableInfo.Column("right_dev_lat", "REAL", true, 0, null, 1));
                map.put("right_dev_lon", new TableInfo.Column("right_dev_lon", "REAL", true, 0, null, 1));
                map.put("right_dev_update_time", new TableInfo.Column("right_dev_update_time", "INTEGER", true, 0, null, 1));
                map.put("online_time", new TableInfo.Column("online_time", "INTEGER", true, 0, null, 1));
                map.put("update_address", new TableInfo.Column("update_address", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("HistoryRecord", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(_db, "HistoryRecord");
                if (tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "HistoryRecord(com.jieli.bluetooth_connect.bean.history.HistoryRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
        }, "37c904c212639270e9bf47ab0db1554c", "9eb7cb727e7ddaae57f54c68f427f12d")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(HistoryRecordDao.class, HistoryRecordDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.jieli.bluetooth_connect.data.BtConnectDatabase
    public HistoryRecordDao historyRecordDao() {
        HistoryRecordDao historyRecordDao;
        if (this._historyRecordDao != null) {
            return this._historyRecordDao;
        }
        synchronized (this) {
            try {
                if (this._historyRecordDao == null) {
                    this._historyRecordDao = new HistoryRecordDao_Impl(this);
                }
                historyRecordDao = this._historyRecordDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return historyRecordDao;
    }
}
