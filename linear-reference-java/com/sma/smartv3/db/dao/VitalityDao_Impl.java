package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.ai6;
import com.android.mltcode.paycertificationapi.bi6;
import com.android.mltcode.paycertificationapi.ci6;
import com.android.mltcode.paycertificationapi.di6;
import com.android.mltcode.paycertificationapi.ei6;
import com.sma.smartv3.db.entity.Vitality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class VitalityDao_Impl implements VitalityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Vitality> __insertAdapterOfVitality;
    private final EntityDeleteOrUpdateAdapter<Vitality> __updateAdapterOfVitality;

    public VitalityDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfVitality = new AnonymousClass1(this);
        this.__updateAdapterOfVitality = new AnonymousClass2(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r29) {
        SQLiteStatement r1 = r29.prepare("SELECT * FROM Vitality WHERE  mIsSync = 0  AND mTime > 0 AND mAllVitality >= 50 AND mAllVitality<= 220 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAllVitality");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityTime");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityValue");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityTime");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityValue");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityTime");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityValue");     // Catch: Throwable -> L13
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r13 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r14 = null;
    L9:
        String r19 = r14;
        int r210 = r2;
        int r28 = r3;
        r12.add(new Vitality(r13, r17, r19, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11)));     // Catch: Throwable -> L13
        r2 = r210;
        r3 = r28;
        goto L4
    L10:
        r14 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r12;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Vitality OXO1(SQLiteConnection r29) {
        SQLiteStatement r1 = r29.prepare("SELECT * FROM Vitality WHERE mAllVitality >= 50 AND mAllVitality<= 220 ORDER BY mTime DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAllVitality");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityTime");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityValue");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityTime");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityValue");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityTime");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityValue");     // Catch: Throwable -> L11
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        Vitality r13 = null;
        String r14 = null;
        if (r1.step() == false) goto L13;
        int r12 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r18 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r20 = r14;
        r13 = new Vitality(r12, r18, r20, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11));     // Catch: Throwable -> L11
        goto L13
    L8:
        r14 = r1.getText(r3);     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r13;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer XIi00iiXO(VitalityDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfVitality.handleMultiple(r2, r1));
    }

    public static /* synthetic */ long[] XO0O10(VitalityDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfVitality.insertAndReturnIdsArray(r2, r1);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r28, long r30, SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM Vitality WHERE mTime >= ? AND mTime < ? AND mAllVitality >= 50 AND mAllVitality<= 220");
        r1.mo3338bindLong(1, r28);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r30);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAllVitality");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityTime");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowIntensityValue");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityTime");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMediumIntensityValue");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityTime");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHighIntensityValue");     // Catch: Throwable -> L13
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r13 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r14 = null;
    L9:
        String r19 = r14;
        int r29 = r2;
        int r210 = r3;
        r12.add(new Vitality(r13, r17, r19, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11)));     // Catch: Throwable -> L13
        r2 = r29;
        r3 = r210;
        goto L4
    L10:
        r14 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r12;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.VitalityDao
    public Vitality getLastVitality() {
        return (Vitality) DBUtil.performBlocking(this.__db, true, false, new ei6());
    }

    @Override // com.sma.smartv3.db.dao.VitalityDao
    public List<Vitality> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new bi6());
    }

    @Override // com.sma.smartv3.db.dao.VitalityDao
    public List<Vitality> getVitalityList(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new di6(start, end));
    }

    @Override // com.sma.smartv3.db.dao.VitalityDao
    public long[] insert(final List<Vitality> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new ci6(this, list));
    }

    @Override // com.sma.smartv3.db.dao.VitalityDao
    public int update(final List<Vitality> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new ai6(this, lists))).intValue();
    }
}
