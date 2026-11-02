package com.jieli.bluetooth_connect.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao;

/* JADX INFO: loaded from: classes17.dex */
@Database(entities = {HistoryRecord.class}, version = 3)
public abstract class BtConnectDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "bt_data.db";
    static final Migration MIGRATION_1_2 = null;
    static final Migration MIGRATION_2_3 = null;

    static {
        final int r1 = 1;
        final int r2 = 2;
        MIGRATION_1_2 = new AnonymousClass1(r1, r2);
        final int r3 = 3;
        MIGRATION_2_3 = new AnonymousClass2(r2, r3);
    }

    public BtConnectDatabase() {
    }

    public static BtConnectDatabase buildDatabase(Context context) {
        return (BtConnectDatabase) Room.databaseBuilder(context, BtConnectDatabase.class, DATABASE_NAME).allowMainThreadQueries().addMigrations(new Migration[]{MIGRATION_1_2, MIGRATION_2_3}).build();
    }

    public abstract HistoryRecordDao historyRecordDao();
}
