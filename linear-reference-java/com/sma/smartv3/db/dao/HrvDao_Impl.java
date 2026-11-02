package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.IO0IX0i;
import com.android.mltcode.paycertificationapi.OIX1OOi;
import com.android.mltcode.paycertificationapi.X1XOX1iI;
import com.android.mltcode.paycertificationapi.X1i10Ii0;
import com.android.mltcode.paycertificationapi.i11XX0Ii0;
import com.sma.smartv3.db.entity.Hrv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class HrvDao_Impl implements HrvDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Hrv> __insertAdapterOfHrv;
    private final EntityDeleteOrUpdateAdapter<Hrv> __updateAdapterOfHrv;

    public HrvDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfHrv = new AnonymousClass1(this);
        this.__updateAdapterOfHrv = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r18) {
        SQLiteStatement r1 = r18.prepare("SELECT * FROM Hrv WHERE mTime > 0 AND mValue > 0  ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvgValue");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r7 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r8 = null;
    L9:
        String r14 = r8;
        r7.add(new Hrv(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r8 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r7;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer OXO1(HrvDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfHrv.handleMultiple(r2, r1));
    }

    public static /* synthetic */ long[] XIi00iiXO(HrvDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfHrv.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XO0O10(SQLiteConnection r18) {
        SQLiteStatement r1 = r18.prepare("SELECT * FROM Hrv WHERE  mIsSync = 0  AND mTime > 0 AND mValue > 0  ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvgValue");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r7 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r8 = null;
    L9:
        String r14 = r8;
        r7.add(new Hrv(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r8 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r7;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r18, long r20, SQLiteConnection r22) {
        SQLiteStatement r1 = r22.prepare("SELECT * FROM Hrv WHERE mTime >= ? AND mTime < ? AND mValue > 0 ");
        r1.mo3338bindLong(1, r18);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r20);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvgValue");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r7 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r8 = null;
    L9:
        String r14 = r8;
        r7.add(new Hrv(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
        goto L4
    L10:
        r8 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r7;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public List<Hrv> getHrv(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new i11XX0Ii0(start, end));
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public List<Hrv> getLastData() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OIX1OOi());
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public List<Hrv> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new X1i10Ii0());
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public List<Hrv> getTestHrv(final long start, final long end) {
        return HrvDao.DefaultImpls.getTestHrv(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public long[] insert(final List<Hrv> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new IO0IX0i(this, list));
    }

    @Override // com.sma.smartv3.db.dao.HrvDao
    public int update(final List<Hrv> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new X1XOX1iI(this, lists))).intValue();
    }
}
