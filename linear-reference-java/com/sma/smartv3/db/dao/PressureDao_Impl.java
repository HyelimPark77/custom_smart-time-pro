package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.v32;
import com.android.mltcode.paycertificationapi.w32;
import com.android.mltcode.paycertificationapi.x32;
import com.android.mltcode.paycertificationapi.y32;
import com.android.mltcode.paycertificationapi.z32;
import com.sma.smartv3.db.entity.Pressure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PressureDao_Impl implements PressureDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Pressure> __insertAdapterOfPressure;
    private final EntityDeleteOrUpdateAdapter<Pressure> __updateAdapterOfPressure;

    public PressureDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfPressure = new AnonymousClass1(this);
        this.__updateAdapterOfPressure = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Pressure WHERE mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mValue");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r5 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r16.step() == false) goto L15;
        int r9 = (int) r16.getLong(r0);     // Catch: Throwable -> L13
        long r10 = r16.getLong(r1);     // Catch: Throwable -> L13
        if (r16.isNull(r2) == false) goto L10;
        String r6 = null;
    L9:
        String r12 = r6;
        r5.add(new Pressure(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r6 = r16.getText(r2);     // Catch: Throwable -> L13
        goto L9
    L15:
        r16.close();
        return r5;
    L13:
        th = move-exception;
        r16.close();
        throw th;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Pressure WHERE  mIsSync = 0  AND mTime > 0 AND mValue > 0 AND mValue <= 100 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mValue");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r5 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r16.step() == false) goto L15;
        int r9 = (int) r16.getLong(r0);     // Catch: Throwable -> L13
        long r10 = r16.getLong(r1);     // Catch: Throwable -> L13
        if (r16.isNull(r2) == false) goto L10;
        String r6 = null;
    L9:
        String r12 = r6;
        r5.add(new Pressure(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r6 = r16.getText(r2);     // Catch: Throwable -> L13
        goto L9
    L15:
        r16.close();
        return r5;
    L13:
        th = move-exception;
        r16.close();
        throw th;
    }

    public static /* synthetic */ long[] XIi00iiXO(PressureDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfPressure.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Integer XO0O10(PressureDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfPressure.handleMultiple(r2, r1));
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Pressure WHERE mTime >= ? AND mTime < ? AND mValue > 0 AND mValue <= 100");
        r16.mo3338bindLong(1, r11);     // Catch: Throwable -> L13
        r16.mo3338bindLong(2, r13);     // Catch: Throwable -> L13
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mValue");     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r16.step() == false) goto L15;
        int r5 = (int) r16.getLong(r12);     // Catch: Throwable -> L13
        long r6 = r16.getLong(r14);     // Catch: Throwable -> L13
        if (r16.isNull(r17) == false) goto L10;
        String r2 = null;
    L9:
        String r8 = r2;
        r1.add(new Pressure(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r2 = r16.getText(r17);     // Catch: Throwable -> L13
        goto L9
    L15:
        r16.close();
        return r1;
    L13:
        th = move-exception;
        r16.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public List<Pressure> getLastData() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new x32());
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public List<Pressure> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new v32());
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public List<Pressure> getPressures(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new z32(start, end));
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public List<Pressure> getTestPressures(final long start, final long end) {
        return PressureDao.DefaultImpls.getTestPressures(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public long[] insert(final List<Pressure> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new w32(this, list));
    }

    @Override // com.sma.smartv3.db.dao.PressureDao
    public int update(final List<Pressure> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new y32(this, lists))).intValue();
    }
}
