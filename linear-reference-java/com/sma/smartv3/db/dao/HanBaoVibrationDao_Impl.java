package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import com.android.mltcode.paycertificationapi.i1XOI;
import com.android.mltcode.paycertificationapi.iX01i1;
import com.sma.smartv3.db.entity.HanBaoVibration;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class HanBaoVibrationDao_Impl implements HanBaoVibrationDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HanBaoVibration> __insertAdapterOfHanBaoVibration;
    private final EntityDeleteOrUpdateAdapter<HanBaoVibration> __updateAdapterOfHanBaoVibration;

    public HanBaoVibrationDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfHanBaoVibration = new AnonymousClass1(this);
        this.__updateAdapterOfHanBaoVibration = new AnonymousClass2(this);
    }

    public static /* synthetic */ long[] OXO1(HanBaoVibrationDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfHanBaoVibration.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Integer XIi00iiXO(HanBaoVibrationDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfHanBaoVibration.handleMultiple(r2, r1));
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.db.dao.HanBaoVibrationDao
    public long[] insert(final List<HanBaoVibration> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new iX01i1(this, list));
    }

    @Override // com.sma.smartv3.db.dao.HanBaoVibrationDao
    public int update(final List<HanBaoVibration> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new i1XOI(this, lists))).intValue();
    }
}
