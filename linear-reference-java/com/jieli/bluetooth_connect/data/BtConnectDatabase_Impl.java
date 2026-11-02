package com.jieli.bluetooth_connect.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao_Impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class BtConnectDatabase_Impl extends BtConnectDatabase {
    private volatile HistoryRecordDao _historyRecordDao;

    public BtConnectDatabase_Impl() {
    }

    public static /* synthetic */ List access$000(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$100(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$1000(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$200(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$300(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$400(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$500(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ SupportSQLiteDatabase access$602(BtConnectDatabase_Impl r0, SupportSQLiteDatabase r1) {
        r0.mDatabase = r1;
        return r1;
    }

    public static /* synthetic */ void access$700(BtConnectDatabase_Impl r0, SupportSQLiteDatabase r1) {
        r0.internalInitInvalidationTracker(r1);
    }

    public static /* synthetic */ List access$800(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    public static /* synthetic */ List access$900(BtConnectDatabase_Impl r0) {
        return r0.mCallbacks;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase r2 = super.getOpenHelper().getWritableDatabase();
        super.beginTransaction();     // Catch: Throwable -> L8
        r2.execSQL("DELETE FROM `HistoryRecord`");     // Catch: Throwable -> L8
        super.setTransactionSuccessful();     // Catch: Throwable -> L8
        super.endTransaction();
        r2.query("PRAGMA wal_checkpoint(FULL)").close();
        if (r2.inTransaction() == true) goto L15;
        r2.execSQL("VACUUM");
        return;
    L15:
        return;
    L8:
        th = move-exception;
        super.endTransaction();
        r2.query("PRAGMA wal_checkpoint(FULL)").close();
        if (r2.inTransaction() == true) goto L12;
        r2.execSQL("VACUUM");
    L12:
        throw th;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"HistoryRecord"});
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        final int r2 = 3;
        RoomOpenHelper r0 = new RoomOpenHelper(configuration, new AnonymousClass1(this, r2), "37c904c212639270e9bf47ab0db1554c", "9eb7cb727e7ddaae57f54c68f427f12d");
        SupportSQLiteOpenHelper.Configuration r1 = SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(r0).build();
        return configuration.sqliteOpenHelperFactory.create(r1);
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap r0 = new HashMap();
        r0.put(HistoryRecordDao.class, HistoryRecordDao_Impl.getRequiredConverters());
        return r0;
    }

    @Override // com.jieli.bluetooth_connect.data.BtConnectDatabase
    public HistoryRecordDao historyRecordDao() {
        if (this._historyRecordDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._historyRecordDao != null) goto L12;
        this._historyRecordDao = new HistoryRecordDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        HistoryRecordDao r0 = this._historyRecordDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._historyRecordDao;
    }
}
