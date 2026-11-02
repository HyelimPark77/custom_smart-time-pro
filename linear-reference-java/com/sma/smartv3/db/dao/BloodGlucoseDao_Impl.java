package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I0iO011;
import com.android.mltcode.paycertificationapi.IIIiI1;
import com.android.mltcode.paycertificationapi.O0XXi0X;
import com.android.mltcode.paycertificationapi.XOiIXO0X;
import com.android.mltcode.paycertificationapi.XXXI1XI11;
import com.sma.smartv3.db.entity.BloodGlucose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucoseDao_Impl implements BloodGlucoseDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BloodGlucose> __insertAdapterOfBloodGlucose;
    private final EntityDeleteOrUpdateAdapter<BloodGlucose> __updateAdapterOfBloodGlucose;

    public BloodGlucoseDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfBloodGlucose = new AnonymousClass1(this);
        this.__updateAdapterOfBloodGlucose = new AnonymousClass2(this);
    }

    public static /* synthetic */ Integer O00(BloodGlucoseDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfBloodGlucose.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM BloodGlucose WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
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
        r5.add(new BloodGlucose(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ List XIi00iiXO(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM BloodGlucose WHERE mTime >= ? AND mTime < ? ORDER BY mTime DESC");
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
        r1.add(new BloodGlucose(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ long[] XO0O10(BloodGlucoseDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfBloodGlucose.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM BloodGlucose WHERE mTime > 0 ORDER BY mTime DESC LIMIT 1");
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
        r5.add(new BloodGlucose(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    @Override // com.sma.smartv3.db.dao.BloodGlucoseDao
    public List<BloodGlucose> getLastData() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new I0iO011());
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucoseDao
    public List<BloodGlucose> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new O0XXi0X());
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucoseDao
    public List<BloodGlucose> getListDesc(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new XXXI1XI11(start, end));
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucoseDao
    public long[] insert(final List<BloodGlucose> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new IIIiI1(this, list));
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucoseDao
    public int update(final List<BloodGlucose> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new XOiIXO0X(this, lists))).intValue();
    }
}
