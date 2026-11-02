package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.OX0010O;
import com.android.mltcode.paycertificationapi.XXiO1000;
import com.android.mltcode.paycertificationapi.iIO0XIiI0;
import com.sma.smartv3.db.entity.Electrocardiogram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ElectrocardiogramDao_Impl implements ElectrocardiogramDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Electrocardiogram> __insertAdapterOfElectrocardiogram;

    public ElectrocardiogramDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfElectrocardiogram = new AnonymousClass1(this);
    }

    public static /* synthetic */ List OXO1(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Electrocardiogram WHERE mTime >= ? AND mTime < ? AND mValue >= 50 AND mValue <= 220");
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
        r1.add(new Electrocardiogram(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ Electrocardiogram XIi00iiXO(SQLiteConnection r17) {
        SQLiteStatement r1 = r17.prepare("SELECT * FROM Electrocardiogram ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        Electrocardiogram r7 = null;
        String r8 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r14 = r8;
        r7 = new Electrocardiogram(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5));     // Catch: Throwable -> L11
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

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ long[] iO(ElectrocardiogramDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfElectrocardiogram.insertAndReturnIdsArray(r2, r1);
    }

    @Override // com.sma.smartv3.db.dao.ElectrocardiogramDao
    public List<Electrocardiogram> getElectrocardiograms(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OX0010O(start, end));
    }

    @Override // com.sma.smartv3.db.dao.ElectrocardiogramDao
    public Electrocardiogram getLastElectrocardiogram() {
        return (Electrocardiogram) DBUtil.performBlocking(this.__db, true, false, new iIO0XIiI0());
    }

    @Override // com.sma.smartv3.db.dao.ElectrocardiogramDao
    public List<Electrocardiogram> getTestElectrocardiograms(final long start, final long end) {
        return ElectrocardiogramDao.DefaultImpls.getTestElectrocardiograms(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.ElectrocardiogramDao
    public long[] insert(final List<Electrocardiogram> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new XXiO1000(this, list));
    }
}
