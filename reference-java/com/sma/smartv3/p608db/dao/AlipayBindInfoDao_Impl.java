package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.AlipayBindInfoDao_Impl;
import com.sma.smartv3.p608db.entity.AlipayBindInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class AlipayBindInfoDao_Impl implements AlipayBindInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AlipayBindInfo> __insertAdapterOfAlipayBindInfo = new EntityInsertAdapter<AlipayBindInfo>() { // from class: com.sma.smartv3.db.dao.AlipayBindInfoDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `AlipayBindInfo` (`mId`,`mTime`,`mLocalTime`,`mBleName`,`mFirmwareFlag`,`mMacAddress`,`mFirmwareVersion`,`mAppVersion`,`mResult`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AlipayBindInfo entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMBleName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMBleName());
            }
            if (entity.getMFirmwareFlag() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMFirmwareFlag());
            }
            if (entity.getMMacAddress() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMMacAddress());
            }
            if (entity.getMFirmwareVersion() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMFirmwareVersion());
            }
            if (entity.getMAppVersion() == null) {
                statement.mo47600bindNull(8);
            } else {
                statement.mo47601bindText(8, entity.getMAppVersion());
            }
            statement.mo47599bindLong(9, entity.getMResult());
            statement.mo47599bindLong(10, entity.getMIsSync());
        }
    };
    private final EntityDeleteOrUpdateAdapter<AlipayBindInfo> __updateAdapterOfAlipayBindInfo = new EntityDeleteOrUpdateAdapter<AlipayBindInfo>() { // from class: com.sma.smartv3.db.dao.AlipayBindInfoDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `AlipayBindInfo` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mBleName` = ?,`mFirmwareFlag` = ?,`mMacAddress` = ?,`mFirmwareVersion` = ?,`mAppVersion` = ?,`mResult` = ?,`mIsSync` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AlipayBindInfo entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMBleName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMBleName());
            }
            if (entity.getMFirmwareFlag() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMFirmwareFlag());
            }
            if (entity.getMMacAddress() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMMacAddress());
            }
            if (entity.getMFirmwareVersion() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMFirmwareVersion());
            }
            if (entity.getMAppVersion() == null) {
                statement.mo47600bindNull(8);
            } else {
                statement.mo47601bindText(8, entity.getMAppVersion());
            }
            statement.mo47599bindLong(9, entity.getMResult());
            statement.mo47599bindLong(10, entity.getMIsSync());
            statement.mo47599bindLong(11, entity.getMId());
        }
    };

    public AlipayBindInfoDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM AlipayBindInfo WHERE  mIsSync = 0  AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBleName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFirmwareFlag");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMacAddress");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFirmwareVersion");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAppVersion");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mResult");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new AlipayBindInfo((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
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

    @Override // com.sma.smartv3.p608db.dao.AlipayBindInfoDao
    public List<AlipayBindInfo> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayBindInfoDao_Impl.XIi00iiXO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AlipayBindInfoDao
    public long[] insert(final List<AlipayBindInfo> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXXi1IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f2119IO.__insertAdapterOfAlipayBindInfo.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AlipayBindInfoDao
    public int update(final List<AlipayBindInfo> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0001
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f1005IO.__updateAdapterOfAlipayBindInfo.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
