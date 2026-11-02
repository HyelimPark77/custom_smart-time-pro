package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.II1XiXO;
import com.android.mltcode.paycertificationapi.OI1OOIX0;
import com.android.mltcode.paycertificationapi.OiIOIXOO0;
import com.android.mltcode.paycertificationapi.iiXiI1OXI;
import com.android.mltcode.paycertificationapi.iiiiXIiO;
import com.sma.smartv3.db.entity.BloodPressure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodPressureDao_Impl implements BloodPressureDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BloodPressure> __insertAdapterOfBloodPressure;
    private final EntityDeleteOrUpdateAdapter<BloodPressure> __updateAdapterOfBloodPressure;

    public BloodPressureDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfBloodPressure = new AnonymousClass1(this);
        this.__updateAdapterOfBloodPressure = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(long r18, long r20, SQLiteConnection r22) {
        SQLiteStatement r1 = r22.prepare("SELECT * FROM BloodPressure WHERE mTime >= ? AND mTime < ? AND mSystolic <200 AND mDiastolic >=60 ");
        r1.mo3338bindLong(1, r18);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r20);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSystolic");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDiastolic");     // Catch: Throwable -> L13
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
        r7.add(new BloodPressure(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ Integer OXO1(BloodPressureDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfBloodPressure.handleMultiple(r2, r1));
    }

    public static /* synthetic */ long[] XIi00iiXO(BloodPressureDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfBloodPressure.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XO0O10(SQLiteConnection r18) {
        SQLiteStatement r1 = r18.prepare("SELECT * FROM BloodPressure WHERE  mIsSync = 0 AND mTime > 0 AND mSystolic <200 AND mDiastolic >=60 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSystolic");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDiastolic");     // Catch: Throwable -> L13
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
        r7.add(new BloodPressure(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ BloodPressure iO(SQLiteConnection r19) {
        SQLiteStatement r1 = r19.prepare("SELECT * FROM BloodPressure WHERE mSystolic <200 AND mDiastolic >=60 ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSystolic");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDiastolic");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        BloodPressure r8 = null;
        String r9 = null;
        if (r1.step() == false) goto L13;
        int r12 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r13 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r15 = r9;
        r8 = new BloodPressure(r12, r13, r15, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6));     // Catch: Throwable -> L11
        goto L13
    L8:
        r9 = r1.getText(r3);     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r8;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public List<BloodPressure> getBloodPressures(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iiXiI1OXI(start, end));
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public BloodPressure getLastBloodPressure() {
        return (BloodPressure) DBUtil.performBlocking(this.__db, true, false, new OiIOIXOO0());
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public List<BloodPressure> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new II1XiXO());
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public List<BloodPressure> getTestBloodPressures(final long start, final long end) {
        return BloodPressureDao.DefaultImpls.getTestBloodPressures(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public long[] insert(final List<BloodPressure> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new OI1OOIX0(this, list));
    }

    @Override // com.sma.smartv3.db.dao.BloodPressureDao
    public int update(final List<BloodPressure> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new iiiiXIiO(this, lists))).intValue();
    }
}
