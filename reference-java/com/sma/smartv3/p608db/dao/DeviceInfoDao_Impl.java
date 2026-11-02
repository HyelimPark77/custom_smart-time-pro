package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.DeviceInfoDao_Impl;
import com.sma.smartv3.p608db.entity.RecordDeviceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceInfoDao_Impl implements DeviceInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<RecordDeviceInfo> __insertAdapterOfRecordDeviceInfo = new EntityInsertAdapter<RecordDeviceInfo>() { // from class: com.sma.smartv3.db.dao.DeviceInfoDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `RecordDeviceInfo` (`mId`,`mTime`,`mLocalTime`,`mMac`,`mName`,`mVersion`,`mBattery`,`mTotalStorage`,`mAvailableStorage`,`isActive`,`mVoltage`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull RecordDeviceInfo recordDeviceInfo) {
            sQLiteStatement.mo47599bindLong(1, recordDeviceInfo.getMId());
            sQLiteStatement.mo47599bindLong(2, recordDeviceInfo.getMTime());
            if (recordDeviceInfo.getMLocalTime() == null) {
                sQLiteStatement.mo47600bindNull(3);
            } else {
                sQLiteStatement.mo47601bindText(3, recordDeviceInfo.getMLocalTime());
            }
            if (recordDeviceInfo.getMMac() == null) {
                sQLiteStatement.mo47600bindNull(4);
            } else {
                sQLiteStatement.mo47601bindText(4, recordDeviceInfo.getMMac());
            }
            if (recordDeviceInfo.getMName() == null) {
                sQLiteStatement.mo47600bindNull(5);
            } else {
                sQLiteStatement.mo47601bindText(5, recordDeviceInfo.getMName());
            }
            if (recordDeviceInfo.getMVersion() == null) {
                sQLiteStatement.mo47600bindNull(6);
            } else {
                sQLiteStatement.mo47601bindText(6, recordDeviceInfo.getMVersion());
            }
            sQLiteStatement.mo47599bindLong(7, recordDeviceInfo.getMBattery());
            sQLiteStatement.mo47599bindLong(8, recordDeviceInfo.getMTotalStorage());
            sQLiteStatement.mo47599bindLong(9, recordDeviceInfo.getMAvailableStorage());
            sQLiteStatement.mo47599bindLong(10, recordDeviceInfo.isActive() ? 1L : 0L);
            sQLiteStatement.mo47599bindLong(11, recordDeviceInfo.getMVoltage());
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceInfo> __deleteAdapterOfRecordDeviceInfo = new EntityDeleteOrUpdateAdapter<RecordDeviceInfo>() { // from class: com.sma.smartv3.db.dao.DeviceInfoDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `RecordDeviceInfo` WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceInfo entity) {
            statement.mo47599bindLong(1, entity.getMId());
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceInfo> __updateAdapterOfRecordDeviceInfo = new EntityDeleteOrUpdateAdapter<RecordDeviceInfo>() { // from class: com.sma.smartv3.db.dao.DeviceInfoDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `RecordDeviceInfo` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mMac` = ?,`mName` = ?,`mVersion` = ?,`mBattery` = ?,`mTotalStorage` = ?,`mAvailableStorage` = ?,`isActive` = ?,`mVoltage` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull RecordDeviceInfo recordDeviceInfo) {
            sQLiteStatement.mo47599bindLong(1, recordDeviceInfo.getMId());
            sQLiteStatement.mo47599bindLong(2, recordDeviceInfo.getMTime());
            if (recordDeviceInfo.getMLocalTime() == null) {
                sQLiteStatement.mo47600bindNull(3);
            } else {
                sQLiteStatement.mo47601bindText(3, recordDeviceInfo.getMLocalTime());
            }
            if (recordDeviceInfo.getMMac() == null) {
                sQLiteStatement.mo47600bindNull(4);
            } else {
                sQLiteStatement.mo47601bindText(4, recordDeviceInfo.getMMac());
            }
            if (recordDeviceInfo.getMName() == null) {
                sQLiteStatement.mo47600bindNull(5);
            } else {
                sQLiteStatement.mo47601bindText(5, recordDeviceInfo.getMName());
            }
            if (recordDeviceInfo.getMVersion() == null) {
                sQLiteStatement.mo47600bindNull(6);
            } else {
                sQLiteStatement.mo47601bindText(6, recordDeviceInfo.getMVersion());
            }
            sQLiteStatement.mo47599bindLong(7, recordDeviceInfo.getMBattery());
            sQLiteStatement.mo47599bindLong(8, recordDeviceInfo.getMTotalStorage());
            sQLiteStatement.mo47599bindLong(9, recordDeviceInfo.getMAvailableStorage());
            sQLiteStatement.mo47599bindLong(10, recordDeviceInfo.isActive() ? 1L : 0L);
            sQLiteStatement.mo47599bindLong(11, recordDeviceInfo.getMVoltage());
            sQLiteStatement.mo47599bindLong(12, recordDeviceInfo.getMId());
        }
    };

    public DeviceInfoDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ Boolean I0IIOi(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM RecordDeviceInfo LIMIT 1)");
        try {
            boolean z = false;
            if (sQLiteStatementPrepare.step() && ((int) sQLiteStatementPrepare.getLong(0)) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer I0iXXO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE RecordDeviceInfo SET isActive = 0");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer O00(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT COUNT(*) FROM RecordDeviceInfo");
        try {
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ RecordDeviceInfo OIX0iXi(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceInfo WHERE mMac = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMac");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVersion");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBattery");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTotalStorage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAvailableStorage");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isActive");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVoltage");
            RecordDeviceInfo recordDeviceInfo = null;
            if (sQLiteStatementPrepare.step()) {
                recordDeviceInfo = new RecordDeviceInfo(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
            }
            sQLiteStatementPrepare.close();
            return recordDeviceInfo;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Integer OIi0(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceInfo");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer X1ii(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE RecordDeviceInfo SET isActive = 1 WHERE mMac = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
            sQLiteStatementPrepare.close();
            return numValueOf;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Unit XIi00iiXO(DeviceInfoDao_Impl deviceInfoDao_Impl, String str, SQLiteConnection sQLiteConnection) {
        super.setActiveDevice(str);
        return Unit.OXO1;
    }

    public static /* synthetic */ Integer XO0O10(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceInfo WHERE mMac = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
            sQLiteStatementPrepare.close();
            return numValueOf;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ RecordDeviceInfo XOO0ii0(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceInfo ORDER BY isActive DESC, mId ASC LIMIT 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMac");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVersion");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBattery");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTotalStorage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAvailableStorage");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isActive");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVoltage");
            RecordDeviceInfo recordDeviceInfo = null;
            if (sQLiteStatementPrepare.step()) {
                recordDeviceInfo = new RecordDeviceInfo(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
            }
            return recordDeviceInfo;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XXI(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceInfo");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMac");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVersion");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBattery");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTotalStorage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAvailableStorage");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isActive");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mVoltage");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                arrayList.add(new RecordDeviceInfo(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
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

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int clearActiveStatus() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX10X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.I0iXXO((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int delete(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiOXII
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f2272IO.__deleteAdapterOfRecordDeviceInfo.handle((SQLiteConnection) obj, deviceInfo));
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int deleteAll() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.XII1iO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.OIi0((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int deleteByMac(final String mac) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiiOO10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.XO0O10(mac, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public RecordDeviceInfo getActiveDevice() {
        return (RecordDeviceInfo) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOO1i11X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.XOO0ii0((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public List<RecordDeviceInfo> getAllDevices() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1iOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.XXI((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public RecordDeviceInfo getDeviceByMac(final String mac) {
        return (RecordDeviceInfo) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OiX0IO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.OIX0iXi(mac, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int getDeviceCount() {
        return ((Integer) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1I010i00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.O00((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public boolean hasDevices() {
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiIO01O0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.I0IIOi((SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public long insertOrUpdate(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiXi100
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f2307IO.__insertAdapterOfRecordDeviceInfo.insertAndReturnId((SQLiteConnection) obj, deviceInfo));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public long[] insertOrUpdateList(final List<RecordDeviceInfo> deviceInfos) {
        deviceInfos.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1IXiiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f7590IO.__insertAdapterOfRecordDeviceInfo.insertAndReturnIdsArray((SQLiteConnection) obj, deviceInfos);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public void setActiveDevice(final String mac) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1iX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.XIi00iiXO(this.f1499IO, mac, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int setDeviceActive(final String mac) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiXi0i1OX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoDao_Impl.X1ii(mac, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.DeviceInfoDao
    public int update(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.OO1OI00XI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f3183IO.__updateAdapterOfRecordDeviceInfo.handle((SQLiteConnection) obj, deviceInfo));
            }
        })).intValue();
    }
}
