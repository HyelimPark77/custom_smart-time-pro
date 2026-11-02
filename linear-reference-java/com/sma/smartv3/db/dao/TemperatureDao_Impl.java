package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.hn5;
import com.android.mltcode.paycertificationapi.in5;
import com.android.mltcode.paycertificationapi.jn5;
import com.android.mltcode.paycertificationapi.kn5;
import com.android.mltcode.paycertificationapi.ln5;
import com.sma.smartv3.db.entity.Temperature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class TemperatureDao_Impl implements TemperatureDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Temperature> __insertAdapterOfTemperature;
    private final EntityDeleteOrUpdateAdapter<Temperature> __updateAdapterOfTemperature;

    public TemperatureDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfTemperature = new AnonymousClass1(this);
        this.__updateAdapterOfTemperature = new AnonymousClass2(this);
    }

    public static /* synthetic */ Integer O00(TemperatureDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfTemperature.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Temperature WHERE mTime > 0 ORDER BY mId DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTemperature");     // Catch: Throwable -> L13
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
        r5.add(new Temperature(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ long[] XIi00iiXO(TemperatureDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfTemperature.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XO0O10(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Temperature WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTemperature");     // Catch: Throwable -> L13
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
        r5.add(new Temperature(r9, r10, r12, (int) r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L13
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

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM Temperature WHERE mTime >= ? AND mTime < ? ORDER BY mTime DESC");
        r16.mo3338bindLong(1, r11);     // Catch: Throwable -> L13
        r16.mo3338bindLong(2, r13);     // Catch: Throwable -> L13
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L13
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L13
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L13
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTemperature");     // Catch: Throwable -> L13
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
        r1.add(new Temperature(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    @Override // com.sma.smartv3.db.dao.TemperatureDao
    public List<Temperature> getLastData() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new kn5());
    }

    @Override // com.sma.smartv3.db.dao.TemperatureDao
    public List<Temperature> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new jn5());
    }

    @Override // com.sma.smartv3.db.dao.TemperatureDao
    public List<Temperature> getListDesc(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new hn5(start, end));
    }

    @Override // com.sma.smartv3.db.dao.TemperatureDao
    public long[] insert(final List<Temperature> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new in5(this, list));
    }

    @Override // com.sma.smartv3.db.dao.TemperatureDao
    public int update(final List<Temperature> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new ln5(this, lists))).intValue();
    }
}
