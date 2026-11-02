package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.os;
import com.android.mltcode.paycertificationapi.ps;
import com.android.mltcode.paycertificationapi.qs;
import com.android.mltcode.paycertificationapi.rs;
import com.android.mltcode.paycertificationapi.ss;
import com.android.mltcode.paycertificationapi.ts;
import com.sma.smartv3.db.entity.Location;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationDao_Impl implements LocationDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Location> __insertAdapterOfLocation;
    private final EntityDeleteOrUpdateAdapter<Location> __updateAdapterOfLocation;

    public LocationDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfLocation = new AnonymousClass1(this);
        this.__updateAdapterOfLocation = new AnonymousClass2(this);
    }

    public static /* synthetic */ List IiI10X(SQLiteConnection r27) {
        SQLiteStatement r1 = r27.prepare("SELECT * FROM Location WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mActivityMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLongitude");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLatitude");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsBaiDuSync");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r28 = r2;
        int r26 = r3;
        r11.add(new Location(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (float) r1.getDouble(r6), (float) r1.getDouble(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r28;
        r3 = r26;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List O00(long r26, long r28, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM Location WHERE mTime >= ? AND mTime <= ? ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r28);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mActivityMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLongitude");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLatitude");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsBaiDuSync");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r27 = r2;
        int r29 = r3;
        r11.add(new Location(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (float) r1.getDouble(r6), (float) r1.getDouble(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r27;
        r3 = r29;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OXO1(long r26, long r28, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM Location WHERE mTime >= ? AND mTime <= ? ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r28);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mActivityMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLongitude");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLatitude");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsBaiDuSync");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r27 = r2;
        int r29 = r3;
        r11.add(new Location(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (float) r1.getDouble(r6), (float) r1.getDouble(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r27;
        r3 = r29;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r27) {
        SQLiteStatement r1 = r27.prepare("SELECT * FROM Location WHERE mIsBaiDuSync = 0");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mActivityMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLongitude");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLatitude");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsBaiDuSync");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r28 = r2;
        int r26 = r3;
        r11.add(new Location(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (float) r1.getDouble(r6), (float) r1.getDouble(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r28;
        r3 = r26;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] XO0O10(LocationDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfLocation.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(LocationDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfLocation.handleMultiple(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public List<Location> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ts());
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public List<Location> getLocation(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ss(start, end));
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public List<Location> getLocationDESC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new qs(start, end));
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public List<Location> getNoBaiDuSyncList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ps());
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public long[] insert(final List<Location> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new rs(this, list));
    }

    @Override // com.sma.smartv3.db.dao.LocationDao
    public int update(final List<Location> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new os(this, lists))).intValue();
    }
}
