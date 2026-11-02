package com.jieli.bluetooth_connect.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
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

    public HistoryRecordDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfHistoryRecord = new AnonymousClass1(this, __db);
        this.__deletionAdapterOfHistoryRecord = new AnonymousClass2(this, __db);
        this.__updateAdapterOfHistoryRecord = new AnonymousClass3(this, __db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void addHistoryRecord(final HistoryRecord historyRecord) {
        assertNotSuspendingTransaction();
        beginTransaction();
        insert(historyRecord);     // Catch: Throwable -> L6
        setTransactionSuccessful();     // Catch: Throwable -> L6
        endTransaction();
        return;
    L6:
        th = move-exception;
        endTransaction();
        throw th;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public HistoryRecord getHistoryRecord(final String devAddress) {
        RoomSQLiteQuery r2 = RoomSQLiteQuery.acquire("SELECT * FROM HistoryRecord WHERE address LIKE ? OR mapped_address LIKE ? OR update_address LIKE ? ORDER BY online_time DESC LIMIT 1", 3);
        if (devAddress != null) goto L5;
        r2.bindNull(1);
    L7:
        if (devAddress != null) goto L9;
        r2.bindNull(2);
    L10:
        if (devAddress != null) goto L12;
        r2.bindNull(3);
    L13:
        assertNotSuspendingTransaction();
        beginTransaction();
        Cursor r3 = DBUtil.query(this.__db, r2, false, null);     // Catch: Throwable -> L46
        int r0 = CursorUtil.getColumnIndexOrThrow(r3, "id");     // Catch: Throwable -> L50
        int r5 = CursorUtil.getColumnIndexOrThrow(r3, "name");     // Catch: Throwable -> L50
        int r6 = CursorUtil.getColumnIndexOrThrow(r3, "address");     // Catch: Throwable -> L50
        int r7 = CursorUtil.getColumnIndexOrThrow(r3, "mapped_address");     // Catch: Throwable -> L50
        int r8 = CursorUtil.getColumnIndexOrThrow(r3, "dev_type");     // Catch: Throwable -> L50
        int r9 = CursorUtil.getColumnIndexOrThrow(r3, "connect_type");     // Catch: Throwable -> L50
        int r10 = CursorUtil.getColumnIndexOrThrow(r3, "sdk_flag");     // Catch: Throwable -> L50
        int r11 = CursorUtil.getColumnIndexOrThrow(r3, "vid");     // Catch: Throwable -> L50
        int r12 = CursorUtil.getColumnIndexOrThrow(r3, "uid");     // Catch: Throwable -> L50
        int r13 = CursorUtil.getColumnIndexOrThrow(r3, "pid");     // Catch: Throwable -> L50
        int r14 = CursorUtil.getColumnIndexOrThrow(r3, "left_dev_lat");     // Catch: Throwable -> L50
        int r15 = CursorUtil.getColumnIndexOrThrow(r3, "left_dev_lon");     // Catch: Throwable -> L50
        int r4 = CursorUtil.getColumnIndexOrThrow(r3, "left_dev_update_time");     // Catch: Throwable -> L50
        RoomSQLiteQuery r16 = r2;
        int r17 = CursorUtil.getColumnIndexOrThrow(r3, "right_dev_lat");     // Catch: Throwable -> L48
        int r1 = CursorUtil.getColumnIndexOrThrow(r3, "right_dev_lon");     // Catch: Throwable -> L39
        int r18 = CursorUtil.getColumnIndexOrThrow(r3, "right_dev_update_time");     // Catch: Throwable -> L39
        int r19 = CursorUtil.getColumnIndexOrThrow(r3, "online_time");     // Catch: Throwable -> L39
        int r20 = CursorUtil.getColumnIndexOrThrow(r3, "update_address");     // Catch: Throwable -> L39
        if (r3.moveToFirst() == false) goto L41;
        HistoryRecord r21 = new HistoryRecord();     // Catch: Throwable -> L39
        r21.setId(r3.getInt(r0));     // Catch: Throwable -> L39
        if (r3.isNull(r5) == false) goto L23;
        String r22 = null;
    L24:
        r21.setName(r22);     // Catch: Throwable -> L39
        if (r3.isNull(r6) == false) goto L27;
        String r23 = null;
    L28:
        r21.setAddress(r23);     // Catch: Throwable -> L39
        if (r3.isNull(r7) == false) goto L31;
        String r24 = null;
    L32:
        r21.setMappedAddress(r24);     // Catch: Throwable -> L39
        r21.setDevType(r3.getInt(r8));     // Catch: Throwable -> L39
        r21.setConnectType(r3.getInt(r9));     // Catch: Throwable -> L39
        r21.setSdkFlag(r3.getInt(r10));     // Catch: Throwable -> L39
        r21.setVid(r3.getInt(r11));     // Catch: Throwable -> L39
        r21.setUid(r3.getInt(r12));     // Catch: Throwable -> L39
        r21.setPid(r3.getInt(r13));     // Catch: Throwable -> L39
        r21.setLeftDevLatitude(r3.getDouble(r14));     // Catch: Throwable -> L39
        r21.setLeftDevLongitude(r3.getDouble(r15));     // Catch: Throwable -> L39
        r21.setLeftDevUpdateTime(r3.getLong(r4));     // Catch: Throwable -> L39
        r21.setRightDevLatitude(r3.getDouble(r17));     // Catch: Throwable -> L39
        r21.setRightDevLongitude(r3.getDouble(r1));     // Catch: Throwable -> L39
        r21.setRightDevUpdateTime(r3.getLong(r18));     // Catch: Throwable -> L39
        r21.setOnlineTime(r3.getLong(r19));     // Catch: Throwable -> L39
        if (r3.isNull(r20) == false) goto L35;
        String r25 = null;
    L36:
        r21.setUpdateAddress(r25);     // Catch: Throwable -> L39
        HistoryRecord r26 = r21;
    L42:
        setTransactionSuccessful();     // Catch: Throwable -> L48
        r3.close();     // Catch: Throwable -> L46
        r16.release();     // Catch: Throwable -> L46
        endTransaction();
        return r26;
    L35:
        r25 = r3.getString(r20);     // Catch: Throwable -> L39
        goto L36
    L31:
        r24 = r3.getString(r7);     // Catch: Throwable -> L39
        goto L32
    L27:
        r23 = r3.getString(r6);     // Catch: Throwable -> L39
        goto L28
    L23:
        r22 = r3.getString(r5);     // Catch: Throwable -> L39
        goto L24
    L41:
        r26 = null;
    L39:
        th = th;
    L52:
        r3.close();     // Catch: Throwable -> L46
        r16.release();     // Catch: Throwable -> L46
        throw th;     // Catch: Throwable -> L46
    L48:
        th = th;
    L50:
        th = th;
        r16 = r2;
    L46:
        th = move-exception;
        endTransaction();
        throw th;
    L12:
        r2.bindString(3, devAddress);
        goto L13
    L9:
        r2.bindString(2, devAddress);
        goto L10
    L5:
        r2.bindString(1, devAddress);
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.room.RoomSQLiteQuery, androidx.sqlite.db.SupportSQLiteQuery] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public List<HistoryRecord> getHistoryRecordList() {
        HistoryRecordDao_Impl r3 = RoomSQLiteQuery.acquire("SELECT * FROM HistoryRecord ORDER BY online_time DESC", 0);
        assertNotSuspendingTransaction();
        beginTransaction();
        Cursor r2 = DBUtil.query(this.__db, r3, false, null);     // Catch: Throwable -> L45
        int r0 = CursorUtil.getColumnIndexOrThrow(r2, "id");     // Catch: Throwable -> L41
        int r5 = CursorUtil.getColumnIndexOrThrow(r2, "name");     // Catch: Throwable -> L41
        int r6 = CursorUtil.getColumnIndexOrThrow(r2, "address");     // Catch: Throwable -> L41
        int r7 = CursorUtil.getColumnIndexOrThrow(r2, "mapped_address");     // Catch: Throwable -> L41
        int r8 = CursorUtil.getColumnIndexOrThrow(r2, "dev_type");     // Catch: Throwable -> L41
        int r9 = CursorUtil.getColumnIndexOrThrow(r2, "connect_type");     // Catch: Throwable -> L41
        int r10 = CursorUtil.getColumnIndexOrThrow(r2, "sdk_flag");     // Catch: Throwable -> L41
        int r11 = CursorUtil.getColumnIndexOrThrow(r2, "vid");     // Catch: Throwable -> L41
        int r12 = CursorUtil.getColumnIndexOrThrow(r2, "uid");     // Catch: Throwable -> L41
        int r13 = CursorUtil.getColumnIndexOrThrow(r2, "pid");     // Catch: Throwable -> L41
        int r14 = CursorUtil.getColumnIndexOrThrow(r2, "left_dev_lat");     // Catch: Throwable -> L41
        int r15 = CursorUtil.getColumnIndexOrThrow(r2, "left_dev_lon");     // Catch: Throwable -> L41
        int r4 = CursorUtil.getColumnIndexOrThrow(r2, "left_dev_update_time");     // Catch: Throwable -> L41
        RoomSQLiteQuery r16 = r3;
        int r17 = CursorUtil.getColumnIndexOrThrow(r2, "right_dev_lat");     // Catch: Throwable -> L39
        int r18 = CursorUtil.getColumnIndexOrThrow(r2, "right_dev_lon");     // Catch: Throwable -> L28
        int r19 = CursorUtil.getColumnIndexOrThrow(r2, "right_dev_update_time");     // Catch: Throwable -> L28
        int r110 = CursorUtil.getColumnIndexOrThrow(r2, "online_time");     // Catch: Throwable -> L28
        int r20 = CursorUtil.getColumnIndexOrThrow(r2, "update_address");     // Catch: Throwable -> L28
        int r21 = r17;
        ArrayList r1 = new ArrayList(r2.getCount());     // Catch: Throwable -> L28
    L8:
        if (r2.moveToNext() == false) goto L49;
        HistoryRecord r22 = new HistoryRecord();     // Catch: Throwable -> L28
        ArrayList r23 = r1;
        r22.setId(r2.getInt(r0));     // Catch: Throwable -> L28
        if (r2.isNull(r5) == false) goto L13;
        String r24 = null;
    L14:
        r22.setName(r24);     // Catch: Throwable -> L28
        if (r2.isNull(r6) == false) goto L17;
        String r25 = null;
    L18:
        r22.setAddress(r25);     // Catch: Throwable -> L28
        if (r2.isNull(r7) == false) goto L21;
        String r26 = null;
    L22:
        r22.setMappedAddress(r26);     // Catch: Throwable -> L28
        r22.setDevType(r2.getInt(r8));     // Catch: Throwable -> L28
        r22.setConnectType(r2.getInt(r9));     // Catch: Throwable -> L28
        r22.setSdkFlag(r2.getInt(r10));     // Catch: Throwable -> L28
        r22.setVid(r2.getInt(r11));     // Catch: Throwable -> L28
        r22.setUid(r2.getInt(r12));     // Catch: Throwable -> L28
        r22.setPid(r2.getInt(r13));     // Catch: Throwable -> L28
        int r27 = r0;
        r22.setLeftDevLatitude(r2.getDouble(r14));     // Catch: Throwable -> L28
        r22.setLeftDevLongitude(r2.getDouble(r15));     // Catch: Throwable -> L28
        r22.setLeftDevUpdateTime(r2.getLong(r4));     // Catch: Throwable -> L28
        int r28 = r5;
        int r29 = r21;
        int r210 = r4;
        r22.setRightDevLatitude(r2.getDouble(r29));     // Catch: Throwable -> L28
        int r30 = r18;
        r22.setRightDevLongitude(r2.getDouble(r30));     // Catch: Throwable -> L28
        int r31 = r19;
        r22.setRightDevUpdateTime(r2.getLong(r31));     // Catch: Throwable -> L28
        int r32 = r110;
        r22.setOnlineTime(r2.getLong(r32));     // Catch: Throwable -> L28
        int r33 = r20;
        if (r2.isNull(r33) == false) goto L25;
        String r34 = null;
    L26:
        r22.setUpdateAddress(r34);     // Catch: Throwable -> L28
        r1 = r23;
        r1.add(r22);     // Catch: Throwable -> L28
        r110 = r32;
        r4 = r210;
        r21 = r29;
        r19 = r31;
        r5 = r28;
        r18 = r30;
        r20 = r33;
        r0 = r27;
        goto L8
    L25:
        r34 = r2.getString(r33);     // Catch: Throwable -> L28
        goto L26
    L21:
        r26 = r2.getString(r7);     // Catch: Throwable -> L28
        goto L22
    L17:
        r25 = r2.getString(r6);     // Catch: Throwable -> L28
        goto L18
    L13:
        r24 = r2.getString(r5);     // Catch: Throwable -> L28
        goto L14
    L49:
        setTransactionSuccessful();     // Catch: Throwable -> L37
        r2.close();     // Catch: Throwable -> L35
        r16.release();     // Catch: Throwable -> L35
        endTransaction();
        return r1;
    L37:
        th = th;
    L43:
        r2.close();     // Catch: Throwable -> L35
        r16.release();     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L28:
        th = th;
    L39:
        th = th;
    L41:
        th = th;
        r16 = r3;
    L45:
        th = th;
        r3 = this;
    L47:
        r3.__db.endTransaction();
        throw th;
    L35:
        th = th;
        goto L47
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void removeHistoryRecord(final HistoryRecord historyRecord) {
        assertNotSuspendingTransaction();
        beginTransaction();
        handle(historyRecord);     // Catch: Throwable -> L6
        setTransactionSuccessful();     // Catch: Throwable -> L6
        endTransaction();
        return;
    L6:
        th = move-exception;
        endTransaction();
        throw th;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void removeHistoryRecords(final List<HistoryRecord> list) {
        assertNotSuspendingTransaction();
        beginTransaction();
        handleMultiple(list);     // Catch: Throwable -> L6
        setTransactionSuccessful();     // Catch: Throwable -> L6
        endTransaction();
        return;
    L6:
        th = move-exception;
        endTransaction();
        throw th;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void updateHistoryRecord(final HistoryRecord record) {
        assertNotSuspendingTransaction();
        beginTransaction();
        handle(record);     // Catch: Throwable -> L6
        setTransactionSuccessful();     // Catch: Throwable -> L6
        endTransaction();
        return;
    L6:
        th = move-exception;
        endTransaction();
        throw th;
    }

    @Override // com.jieli.bluetooth_connect.data.dao.HistoryRecordDao
    public void updateHistoryRecords(final List<HistoryRecord> records) {
        assertNotSuspendingTransaction();
        beginTransaction();
        handleMultiple(records);     // Catch: Throwable -> L6
        setTransactionSuccessful();     // Catch: Throwable -> L6
        endTransaction();
        return;
    L6:
        th = move-exception;
        endTransaction();
        throw th;
    }
}
