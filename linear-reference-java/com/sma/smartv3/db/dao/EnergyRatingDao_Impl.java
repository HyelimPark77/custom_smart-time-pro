package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.OXO0iXO;
import com.android.mltcode.paycertificationapi.OXX11i0;
import com.android.mltcode.paycertificationapi.OiIX1O;
import com.android.mltcode.paycertificationapi.i0OIXIOIi;
import com.sma.smartv3.db.entity.EnergyRating;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class EnergyRatingDao_Impl implements EnergyRatingDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<EnergyRating> __insertAdapterOfEnergyRating;
    private final EntityDeleteOrUpdateAdapter<EnergyRating> __updateAdapterOfEnergyRating;

    public EnergyRatingDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfEnergyRating = new AnonymousClass1(this);
        this.__updateAdapterOfEnergyRating = new AnonymousClass2(this);
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r18) {
        SQLiteStatement r1 = r18.prepare("SELECT * FROM EnergyRating WHERE  mIsSync = 0  AND mTime > 0 AND mScore > 0 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mGear");     // Catch: Throwable -> L13
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
        r7.add(new EnergyRating(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ List XIi00iiXO(long r18, long r20, SQLiteConnection r22) {
        SQLiteStatement r1 = r22.prepare("SELECT * FROM EnergyRating WHERE mTime >= ? AND mTime < ? AND mScore > 0 ORDER BY mTime ASC LIMIT 150");
        r1.mo3338bindLong(1, r18);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r20);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mGear");     // Catch: Throwable -> L13
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
        r7.add(new EnergyRating(r11, r12, r14, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6)));     // Catch: Throwable -> L13
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

    public static /* synthetic */ Integer XO0O10(EnergyRatingDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfEnergyRating.handleMultiple(r2, r1));
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ long[] iO(EnergyRatingDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfEnergyRating.insertAndReturnIdsArray(r2, r1);
    }

    @Override // com.sma.smartv3.db.dao.EnergyRatingDao
    public List<EnergyRating> getEnergyRating(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OXO0iXO(start, end));
    }

    @Override // com.sma.smartv3.db.dao.EnergyRatingDao
    public List<EnergyRating> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OXX11i0());
    }

    @Override // com.sma.smartv3.db.dao.EnergyRatingDao
    public long[] insert(final List<EnergyRating> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new i0OIXIOIi(this, list));
    }

    @Override // com.sma.smartv3.db.dao.EnergyRatingDao
    public int update(final List<EnergyRating> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new OiIX1O(this, lists))).intValue();
    }
}
