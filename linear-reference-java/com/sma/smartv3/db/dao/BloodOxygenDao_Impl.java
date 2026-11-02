package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I0110;
import com.android.mltcode.paycertificationapi.OI0iI00i;
import com.android.mltcode.paycertificationapi.XO10;
import com.android.mltcode.paycertificationapi.i0IOXOIi;
import com.android.mltcode.paycertificationapi.iX0iIiX;
import com.sma.smartv3.db.entity.BloodOxygen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodOxygenDao_Impl implements BloodOxygenDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BloodOxygen> __insertAdapterOfBloodOxygen;
    private final EntityDeleteOrUpdateAdapter<BloodOxygen> __updateAdapterOfBloodOxygen;

    public BloodOxygenDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfBloodOxygen = new AnonymousClass1(this);
        this.__updateAdapterOfBloodOxygen = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM BloodOxygen WHERE  mIsSync = 0  AND mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mTime ASC LIMIT 150");
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
        r5.add(new BloodOxygen(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ Integer OXO1(BloodOxygenDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfBloodOxygen.handleMultiple(r2, r1));
    }

    public static /* synthetic */ BloodOxygen XIi00iiXO(SQLiteConnection r17) {
        SQLiteStatement r1 = r17.prepare("SELECT * FROM BloodOxygen WHERE mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        BloodOxygen r7 = null;
        String r8 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r14 = r8;
        r7 = new BloodOxygen(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5));     // Catch: Throwable -> L11
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

    public static /* synthetic */ long[] XO0O10(BloodOxygenDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfBloodOxygen.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM BloodOxygen WHERE mTime >= ? AND mTime < ? AND mValue >= 10 AND mValue<= 150");
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
        r1.add(new BloodOxygen(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    @Override // com.sma.smartv3.db.dao.BloodOxygenDao
    public List<BloodOxygen> getBloodOxygen(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iX0iIiX(start, end));
    }

    @Override // com.sma.smartv3.db.dao.BloodOxygenDao
    public BloodOxygen getLastBloodOxygen() {
        return (BloodOxygen) DBUtil.performBlocking(this.__db, true, false, new i0IOXOIi());
    }

    @Override // com.sma.smartv3.db.dao.BloodOxygenDao
    public List<BloodOxygen> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new XO10());
    }

    @Override // com.sma.smartv3.db.dao.BloodOxygenDao
    public long[] insert(final List<BloodOxygen> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new I0110(this, list));
    }

    @Override // com.sma.smartv3.db.dao.BloodOxygenDao
    public int update(final List<BloodOxygen> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new OI0iI00i(this, lists))).intValue();
    }
}
