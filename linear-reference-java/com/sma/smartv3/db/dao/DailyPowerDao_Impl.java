package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I10O0i;
import com.android.mltcode.paycertificationapi.IOOXX1;
import com.android.mltcode.paycertificationapi.IX1OX1OX;
import com.sma.smartv3.db.entity.DailyPower;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class DailyPowerDao_Impl implements DailyPowerDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<DailyPower> __insertAdapterOfDailyPower;
    private final EntityDeleteOrUpdateAdapter<DailyPower> __updateAdapterOfDailyPower;

    public DailyPowerDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfDailyPower = new AnonymousClass1(this);
        this.__updateAdapterOfDailyPower = new AnonymousClass2(this);
    }

    public static /* synthetic */ DailyPower OXO1(long r17, long r19, SQLiteConnection r21) {
        SQLiteStatement r1 = r21.prepare("SELECT * FROM DailyPower WHERE mTime >= ? AND mTime < ? AND mValue >= 0 AND mValue<= 100 ORDER BY mTime DESC LIMIT 1");
        r1.mo3338bindLong(1, r17);     // Catch: Throwable -> L11
        r1.mo3338bindLong(2, r19);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mValue");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        DailyPower r7 = null;
        String r8 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r12 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r14 = r8;
        r7 = new DailyPower(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5));     // Catch: Throwable -> L11
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

    public static /* synthetic */ long[] XIi00iiXO(DailyPowerDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfDailyPower.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(DailyPowerDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfDailyPower.handleMultiple(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.DailyPowerDao
    public DailyPower getDailyPower(final long start, final long end) {
        return (DailyPower) DBUtil.performBlocking(this.__db, true, false, new I10O0i(start, end));
    }

    @Override // com.sma.smartv3.db.dao.DailyPowerDao
    public long[] insert(final List<DailyPower> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new IX1OX1OX(this, list));
    }

    @Override // com.sma.smartv3.db.dao.DailyPowerDao
    public int update(final List<DailyPower> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new IOOXX1(this, lists))).intValue();
    }
}
