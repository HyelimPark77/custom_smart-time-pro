package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.hs4;
import com.android.mltcode.paycertificationapi.is4;
import com.sma.smartv3.db.entity.SportData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SportDataDao_Impl implements SportDataDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<SportData> __insertAdapterOfSportData;

    public SportDataDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfSportData = new AnonymousClass1(this);
    }

    public static /* synthetic */ long[] OXO1(SportDataDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfSportData.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XIi00iiXO(long r33, long r35, SQLiteConnection r37) {
        SQLiteStatement r1 = r37.prepare("SELECT * FROM SportData WHERE mTime >= ? AND mTime <= ? ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r33);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r35);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpm");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAirPressure");     // Catch: Throwable -> L13
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPace");     // Catch: Throwable -> L13
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpeed");     // Catch: Throwable -> L13
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r36 = r14;
        ArrayList r38 = r15;
        int r16 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r18 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r17 = null;
    L9:
        int r39 = r2;
        int r310 = r3;
        String r20 = r17;
        int r311 = r4;
        int r19 = r5;
        int r21 = r34;
        r38.add(new SportData(r16, r18, r20, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), (int) r1.getLong(r36), (int) r1.getLong(r21)));     // Catch: Throwable -> L13
        r14 = r36;
        r4 = r311;
        r2 = r39;
        r34 = r21;
        r5 = r19;
        r15 = r38;
        r3 = r310;
        goto L4
    L10:
        r17 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        ArrayList r22 = r15;
        r1.close();
        return r22;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.db.dao.SportDataDao
    public List<SportData> getSportDataASC(final long startTime, final long endTime) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new hs4(startTime, endTime));
    }

    @Override // com.sma.smartv3.db.dao.SportDataDao
    public long[] insert(final List<SportData> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new is4(this, list));
    }
}
