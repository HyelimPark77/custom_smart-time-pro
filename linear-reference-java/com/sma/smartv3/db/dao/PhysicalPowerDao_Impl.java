package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.gv1;
import com.android.mltcode.paycertificationapi.hv1;
import com.android.mltcode.paycertificationapi.iv1;
import com.sma.smartv3.db.entity.PhysicalPower;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PhysicalPowerDao_Impl implements PhysicalPowerDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<PhysicalPower> __insertAdapterOfPhysicalPower;
    private final EntityDeleteOrUpdateAdapter<PhysicalPower> __updateAdapterOfPhysicalPower;

    public PhysicalPowerDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfPhysicalPower = new AnonymousClass1(this);
        this.__updateAdapterOfPhysicalPower = new AnonymousClass2(this);
    }

    public static /* synthetic */ List OXO1(long r11, long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM PhysicalPower WHERE mTime >= ? AND mTime < ? AND mValue >= 0 AND mValue<= 100");
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
        r1.add(new PhysicalPower(r5, r6, r8, (int) r16.getLong(r18), (int) r16.getLong(r0)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ long[] XIi00iiXO(PhysicalPowerDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfPhysicalPower.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(PhysicalPowerDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfPhysicalPower.handleMultiple(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.PhysicalPowerDao
    public List<PhysicalPower> getDailyPower(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iv1(start, end));
    }

    @Override // com.sma.smartv3.db.dao.PhysicalPowerDao
    public long[] insert(final List<PhysicalPower> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new gv1(this, list));
    }

    @Override // com.sma.smartv3.db.dao.PhysicalPowerDao
    public int update(final List<PhysicalPower> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new hv1(this, lists))).intValue();
    }
}
