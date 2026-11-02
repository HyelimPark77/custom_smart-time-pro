package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I0001;
import com.android.mltcode.paycertificationapi.IXXi1IX;
import com.android.mltcode.paycertificationapi.XiiO;
import com.sma.smartv3.db.entity.AlipayBindInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class AlipayBindInfoDao_Impl implements AlipayBindInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AlipayBindInfo> __insertAdapterOfAlipayBindInfo;
    private final EntityDeleteOrUpdateAdapter<AlipayBindInfo> __updateAdapterOfAlipayBindInfo;

    public AlipayBindInfoDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfAlipayBindInfo = new AnonymousClass1(this);
        this.__updateAdapterOfAlipayBindInfo = new AnonymousClass2(this);
    }

    public static /* synthetic */ Integer OXO1(AlipayBindInfoDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfAlipayBindInfo.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r26) {
        SQLiteStatement r1 = r26.prepare("SELECT * FROM AlipayBindInfo WHERE  mIsSync = 0  AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L32
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L32
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L32
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBleName");     // Catch: Throwable -> L32
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFirmwareFlag");     // Catch: Throwable -> L32
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMacAddress");     // Catch: Throwable -> L32
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFirmwareVersion");     // Catch: Throwable -> L32
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAppVersion");     // Catch: Throwable -> L32
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mResult");     // Catch: Throwable -> L32
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L32
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L32
    L4:
        if (r1.step() == false) goto L34;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L32
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L32
        String r13 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r18 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r19 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r20 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r21 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
        String r22 = null;
    L27:
        if (r1.isNull(r8) == true) goto L30;
        r13 = r1.getText(r8);     // Catch: Throwable -> L32
    L30:
        r11.add(new AlipayBindInfo(r15, r16, r18, r19, r20, r21, r22, r13, (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L32
        goto L4
    L25:
        r22 = r1.getText(r7);     // Catch: Throwable -> L32
        goto L27
    L21:
        r21 = r1.getText(r6);     // Catch: Throwable -> L32
        goto L23
    L17:
        r20 = r1.getText(r5);     // Catch: Throwable -> L32
        goto L19
    L13:
        r19 = r1.getText(r4);     // Catch: Throwable -> L32
        goto L15
    L9:
        r18 = r1.getText(r3);     // Catch: Throwable -> L32
        goto L11
    L34:
        r1.close();
        return r11;
    L32:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ long[] iO(AlipayBindInfoDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfAlipayBindInfo.insertAndReturnIdsArray(r2, r1);
    }

    @Override // com.sma.smartv3.db.dao.AlipayBindInfoDao
    public List<AlipayBindInfo> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new XiiO());
    }

    @Override // com.sma.smartv3.db.dao.AlipayBindInfoDao
    public long[] insert(final List<AlipayBindInfo> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new IXXi1IX(this, list));
    }

    @Override // com.sma.smartv3.db.dao.AlipayBindInfoDao
    public int update(final List<AlipayBindInfo> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new I0001(this, lists))).intValue();
    }
}
