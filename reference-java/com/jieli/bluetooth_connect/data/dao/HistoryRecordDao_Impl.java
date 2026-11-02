package com.jieli.bluetooth_connect.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p556db.SupportSQLiteStatement;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class HistoryRecordDao_Impl implements HistoryRecordDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<HistoryRecord> __deletionAdapterOfHistoryRecord;
    private final EntityInsertionAdapter<HistoryRecord> __insertionAdapterOfHistoryRecord;
    private final EntityDeletionOrUpdateAdapter<HistoryRecord> __updateAdapterOfHistoryRecord;

    public HistoryRecordDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfHistoryRecord = new EntityInsertionAdapter<HistoryRecord>(__db) { // from class: com.jieli.bluetooth_connect.data.dao.HistoryRecordDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR ABORT INTO `HistoryRecord` (`id`,`name`,`address`,`mapped_address`,`dev_type`,`connect_type`,`sdk_flag`,`vid`,`uid`,`pid`,`left_dev_lat`,`left_dev_lon`,`left_dev_update_time`,`right_dev_lat`,`right_dev_lon`,`right_dev_update_time`,`online_time`,`update_address`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, HistoryRecord value) {
                stmt.bindLong(1, value.getId());
                if (value.getName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getName());
                }
                if (value.getAddress() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getAddress());
                }
                if (value.getMappedAddress() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getMappedAddress());
                }
                stmt.bindLong(5, value.getDevType());
                stmt.bindLong(6, value.getConnectType());
                stmt.bindLong(7, value.getSdkFlag());
                stmt.bindLong(8, value.getVid());
                stmt.bindLong(9, value.getUid());
                stmt.bindLong(10, value.getPid());
                stmt.bindDouble(11, value.getLeftDevLatitude());
                stmt.bindDouble(12, value.getLeftDevLongitude());
                stmt.bindLong(13, value.getLeftDevUpdateTime());
                stmt.bindDouble(14, value.getRightDevLatitude());
                stmt.bindDouble(15, value.getRightDevLongitude());
                stmt.bindLong(16, value.getRightDevUpdateTime());
                stmt.bindLong(17, value.getOnlineTime());
                if (value.getUpdateAddress() == null) {
                    stmt.bindNull(18);
                } else {
                    stmt.bindString(18, value.getUpdateAddress());
                }
            }
        };
        this.__deletionAdapterOfHistoryRecord = new EntityDeletionOrUpdateAdapter<HistoryRecord>(__db) { // from class: com.jieli.bluetooth_connect.data.dao.HistoryRecordDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `HistoryRecord` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, HistoryRecord value) {
                stmt.bindLong(1, value.getId());
            }
        };
        this.__updateAdapterOfHistoryRecord = new EntityDeletionOrUpdateAdapter<HistoryRecord>(__db) { // from class: com.jieli.bluetooth_connect.data.dao.HistoryRecordDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `HistoryRecord` SET `id` = ?,`name` = ?,`address` = ?,`mapped_address` = ?,`dev_type` = ?,`connect_type` = ?,`sdk_flag` = ?,`vid` = ?,`uid` = ?,`pid` = ?,`left_dev_lat` = ?,`left_dev_lon` = ?,`left_dev_update_time` = ?,`right_dev_lat` = ?,`right_dev_lon` = ?,`right_dev_update_time` = ?,`online_time` = ?,`update_address` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, HistoryRecord value) {
                stmt.bindLong(1, value.getId());
                if (value.getName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getName());
                }
                if (value.getAddress() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getAddress());
                }
                if (value.getMappedAddress() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getMappedAddress());
                }
                stmt.bindLong(5, value.getDevType());
                stmt.bindLong(6, value.getConnectType());
                stmt.bindLong(7, value.getSdkFlag());
                stmt.bindLong(8, value.getVid());
                stmt.bindLong(9, value.getUid());
                stmt.bindLong(10, value.getPid());
                stmt.bindDouble(11, value.getLeftDevLatitude());
                stmt.bindDouble(12, value.getLeftDevLongitude());
                stmt.bindLong(13, value.getLeftDevUpdateTime());
                stmt.bindDouble(14, value.getRightDevLatitude());
                stmt.bindDouble(15, value.getRightDevLongitude());
                stmt.bindLong(16, value.getRightDevUpdateTime());
                stmt.bindLong(17, value.getOnlineTime());
                if (value.getUpdateAddress() == null) {
                    stmt.bindNull(18);
                } else {
                    stmt.bindString(18, value.getUpdateAddress());
                }
                stmt.bindLong(19, value.getId());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void addHistoryRecord(final HistoryRecord historyRecord) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfHistoryRecord.insert(historyRecord);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public HistoryRecord getHistoryRecord(final String devAddress) {
        RoomSQLiteQuery roomSQLiteQuery;
        HistoryRecord historyRecord;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HistoryRecord WHERE address LIKE ? OR mapped_address LIKE ? OR update_address LIKE ? ORDER BY online_time DESC LIMIT 1", 3);
        if (devAddress == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, devAddress);
        }
        if (devAddress == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, devAddress);
        }
        if (devAddress == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, devAddress);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "address");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapped_address");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dev_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "connect_type");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sdk_flag");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "vid");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_lat");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_lon");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_update_time");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_lat");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_lon");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_update_time");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online_time");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_address");
                        if (cursorQuery.moveToFirst()) {
                            HistoryRecord historyRecord2 = new HistoryRecord();
                            historyRecord2.setId(cursorQuery.getInt(columnIndexOrThrow));
                            historyRecord2.setName(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                            historyRecord2.setAddress(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                            historyRecord2.setMappedAddress(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                            historyRecord2.setDevType(cursorQuery.getInt(columnIndexOrThrow5));
                            historyRecord2.setConnectType(cursorQuery.getInt(columnIndexOrThrow6));
                            historyRecord2.setSdkFlag(cursorQuery.getInt(columnIndexOrThrow7));
                            historyRecord2.setVid(cursorQuery.getInt(columnIndexOrThrow8));
                            historyRecord2.setUid(cursorQuery.getInt(columnIndexOrThrow9));
                            historyRecord2.setPid(cursorQuery.getInt(columnIndexOrThrow10));
                            historyRecord2.setLeftDevLatitude(cursorQuery.getDouble(columnIndexOrThrow11));
                            historyRecord2.setLeftDevLongitude(cursorQuery.getDouble(columnIndexOrThrow12));
                            historyRecord2.setLeftDevUpdateTime(cursorQuery.getLong(columnIndexOrThrow13));
                            historyRecord2.setRightDevLatitude(cursorQuery.getDouble(columnIndexOrThrow14));
                            historyRecord2.setRightDevLongitude(cursorQuery.getDouble(columnIndexOrThrow15));
                            historyRecord2.setRightDevUpdateTime(cursorQuery.getLong(columnIndexOrThrow16));
                            historyRecord2.setOnlineTime(cursorQuery.getLong(columnIndexOrThrow17));
                            historyRecord2.setUpdateAddress(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                            historyRecord = historyRecord2;
                        } else {
                            historyRecord = null;
                        }
                        this.__db.setTransactionSuccessful();
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        this.__db.endTransaction();
                        return historyRecord;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                roomSQLiteQuery = roomSQLiteQueryAcquire;
            }
        } catch (Throwable th4) {
            this.__db.endTransaction();
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.room.RoomSQLiteQuery, androidx.sqlite.db.SupportSQLiteQuery] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public List<HistoryRecord> getHistoryRecordList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        HistoryRecordDao_Impl historyRecordDao_ImplAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HistoryRecord ORDER BY online_time DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            try {
                Cursor cursorQuery = DBUtil.query(this.__db, historyRecordDao_ImplAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "address");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapped_address");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dev_type");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "connect_type");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sdk_flag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "vid");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_lat");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_lon");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "left_dev_update_time");
                    roomSQLiteQuery = historyRecordDao_ImplAcquire;
                    try {
                        int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_lat");
                        try {
                            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_lon");
                            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "right_dev_update_time");
                            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online_time");
                            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_address");
                            int i = columnIndexOrThrow14;
                            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                            while (cursorQuery.moveToNext()) {
                                HistoryRecord historyRecord = new HistoryRecord();
                                ArrayList arrayList2 = arrayList;
                                historyRecord.setId(cursorQuery.getInt(columnIndexOrThrow));
                                historyRecord.setName(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                                historyRecord.setAddress(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                                historyRecord.setMappedAddress(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                                historyRecord.setDevType(cursorQuery.getInt(columnIndexOrThrow5));
                                historyRecord.setConnectType(cursorQuery.getInt(columnIndexOrThrow6));
                                historyRecord.setSdkFlag(cursorQuery.getInt(columnIndexOrThrow7));
                                historyRecord.setVid(cursorQuery.getInt(columnIndexOrThrow8));
                                historyRecord.setUid(cursorQuery.getInt(columnIndexOrThrow9));
                                historyRecord.setPid(cursorQuery.getInt(columnIndexOrThrow10));
                                int i2 = columnIndexOrThrow;
                                historyRecord.setLeftDevLatitude(cursorQuery.getDouble(columnIndexOrThrow11));
                                historyRecord.setLeftDevLongitude(cursorQuery.getDouble(columnIndexOrThrow12));
                                historyRecord.setLeftDevUpdateTime(cursorQuery.getLong(columnIndexOrThrow13));
                                int i3 = columnIndexOrThrow2;
                                int i4 = i;
                                int i5 = columnIndexOrThrow13;
                                historyRecord.setRightDevLatitude(cursorQuery.getDouble(i4));
                                int i6 = columnIndexOrThrow15;
                                historyRecord.setRightDevLongitude(cursorQuery.getDouble(i6));
                                int i7 = columnIndexOrThrow16;
                                historyRecord.setRightDevUpdateTime(cursorQuery.getLong(i7));
                                int i8 = columnIndexOrThrow17;
                                historyRecord.setOnlineTime(cursorQuery.getLong(i8));
                                int i9 = columnIndexOrThrow18;
                                historyRecord.setUpdateAddress(cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9));
                                arrayList = arrayList2;
                                arrayList.add(historyRecord);
                                columnIndexOrThrow17 = i8;
                                columnIndexOrThrow13 = i5;
                                i = i4;
                                columnIndexOrThrow16 = i7;
                                columnIndexOrThrow2 = i3;
                                columnIndexOrThrow15 = i6;
                                columnIndexOrThrow18 = i9;
                                columnIndexOrThrow = i2;
                            }
                            try {
                                this.__db.setTransactionSuccessful();
                                cursorQuery.close();
                                roomSQLiteQuery.release();
                                this.__db.endTransaction();
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                cursorQuery.close();
                                roomSQLiteQuery.release();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    roomSQLiteQuery = historyRecordDao_ImplAcquire;
                }
            } catch (Throwable th5) {
                th = th5;
                historyRecordDao_ImplAcquire = this;
                historyRecordDao_ImplAcquire.__db.endTransaction();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            historyRecordDao_ImplAcquire.__db.endTransaction();
            throw th;
        }
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void removeHistoryRecord(final HistoryRecord historyRecord) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfHistoryRecord.handle(historyRecord);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void removeHistoryRecords(final List<HistoryRecord> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfHistoryRecord.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void updateHistoryRecord(final HistoryRecord record) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfHistoryRecord.handle(record);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void updateHistoryRecords(final List<HistoryRecord> records) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfHistoryRecord.handleMultiple(records);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
