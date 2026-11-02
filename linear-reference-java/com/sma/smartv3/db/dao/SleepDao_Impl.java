package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.jm4;
import com.android.mltcode.paycertificationapi.km4;
import com.android.mltcode.paycertificationapi.lm4;
import com.android.mltcode.paycertificationapi.mm4;
import com.android.mltcode.paycertificationapi.nm4;
import com.sma.smartv3.db.entity.Sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SleepDao_Impl implements SleepDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Sleep> __insertAdapterOfSleep;
    private final EntityDeleteOrUpdateAdapter<Sleep> __updateAdapterOfSleep;

    public SleepDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfSleep = new AnonymousClass1(this);
        this.__updateAdapterOfSleep = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r23) {
        SQLiteStatement r1 = r23.prepare("SELECT * FROM Sleep WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSoft");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStrong");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAlgorithmType");     // Catch: Throwable -> L13
        ArrayList r9 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r13 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r14 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r10 = null;
    L9:
        String r16 = r10;
        int r24 = r2;
        int r22 = r3;
        r9.add(new Sleep(r13, r14, r16, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8)));     // Catch: Throwable -> L13
        r2 = r24;
        r3 = r22;
        goto L4
    L10:
        r10 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r9;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OXO1(long r22, long r24, SQLiteConnection r26) {
        SQLiteStatement r1 = r26.prepare("SELECT * FROM Sleep WHERE mTime >= ? AND mTime < ? ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r22);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r24);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSoft");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStrong");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAlgorithmType");     // Catch: Throwable -> L13
        ArrayList r9 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r13 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r14 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r10 = null;
    L9:
        String r16 = r10;
        int r23 = r2;
        int r25 = r3;
        r9.add(new Sleep(r13, r14, r16, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8)));     // Catch: Throwable -> L13
        r2 = r23;
        r3 = r25;
        goto L4
    L10:
        r10 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r9;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer XIi00iiXO(SleepDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfSleep.handleMultiple(r2, r1));
    }

    public static /* synthetic */ Object XO0O10(long r1, long r3, SQLiteConnection r5) {
        SQLiteStatement r6 = r5.prepare("DELETE FROM Sleep WHERE mTime >= ? AND mTime < ?");
        r6.mo3338bindLong(1, r1);     // Catch: Throwable -> L6
        r6.mo3338bindLong(2, r3);     // Catch: Throwable -> L6
        r6.step();     // Catch: Throwable -> L6
        r6.close();
        return null;
    L6:
        th = move-exception;
        r6.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ long[] iO(SleepDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfSleep.insertAndReturnIdsArray(r2, r1);
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public void deleteSleeps(final long start, final long end) {
        DBUtil.performBlocking(this.__db, false, true, new jm4(start, end));
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public List<Sleep> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new nm4());
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public List<Sleep> getSleeps(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new km4(start, end));
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public List<Sleep> getTestSleeps(final long start, final long end) {
        return SleepDao.DefaultImpls.getTestSleeps(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public long[] insert(final List<Sleep> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new mm4(this, list));
    }

    @Override // com.sma.smartv3.db.dao.SleepDao
    public int update(final List<Sleep> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new lm4(this, lists))).intValue();
    }
}
