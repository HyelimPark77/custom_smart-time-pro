package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.IOOOX;
import com.android.mltcode.paycertificationapi.O1OIiXi0;
import com.android.mltcode.paycertificationapi.X1011iX;
import com.android.mltcode.paycertificationapi.XOX0X0i;
import com.android.mltcode.paycertificationapi.i1OXX0;
import com.sma.smartv3.db.entity.HeartRate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class HeartRateDao_Impl implements HeartRateDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HeartRate> __insertAdapterOfHeartRate;
    private final EntityDeleteOrUpdateAdapter<HeartRate> __updateAdapterOfHeartRate;

    public HeartRateDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfHeartRate = new AnonymousClass1(this);
        this.__updateAdapterOfHeartRate = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM HeartRate WHERE mTime >= ? AND mTime < ? AND mBpm >= 50 AND mBpm<= 220");
        r16.mo3338bindLong(1, r11);     // Catch: Throwable -> L13
        r16.mo3338bindLong(2, r13);     // Catch: Throwable -> L13
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mBpm");     // Catch: Throwable -> L13
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
        r1.add(new HeartRate(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ HeartRate OXO1(SQLiteConnection r17) {
        SQLiteStatement r1 = r17.prepare("SELECT * FROM HeartRate WHERE mBpm >= 50 AND mBpm<= 220 ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBpm");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        HeartRate r7 = null;
        String r8 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r14 = r8;
        r7 = new HeartRate(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5));     // Catch: Throwable -> L11
        goto L13
    L8:
        r8 = r1.getText(r3);     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r7;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] XIi00iiXO(HeartRateDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfHeartRate.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Integer XO0O10(HeartRateDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfHeartRate.handleMultiple(r2, r1));
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM HeartRate WHERE  mIsSync = 0  AND mTime > 0 AND mBpm >= 50 AND mBpm<= 220 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mBpm");     // Catch: Throwable -> L13
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
        r5.add(new HeartRate(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public List<HeartRate> getHeartRates(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new IOOOX(start, end));
    }

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public HeartRate getLastHeartRate() {
        return (HeartRate) DBUtil.performBlocking(this.__db, true, false, new i1OXX0());
    }

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public List<HeartRate> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new XOX0X0i());
    }

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public List<HeartRate> getTestHeartRates(final long start, final long end) {
        return HeartRateDao.DefaultImpls.getTestHeartRates(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public long[] insert(final List<HeartRate> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new O1OIiXi0(this, list));
    }

    @Override // com.sma.smartv3.db.dao.HeartRateDao
    public int update(final List<HeartRate> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new X1011iX(this, lists))).intValue();
    }
}
