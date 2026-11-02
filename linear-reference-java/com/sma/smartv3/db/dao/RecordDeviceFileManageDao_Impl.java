package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.nc3;
import com.android.mltcode.paycertificationapi.oc3;
import com.android.mltcode.paycertificationapi.pc3;
import com.android.mltcode.paycertificationapi.qc3;
import com.android.mltcode.paycertificationapi.rc3;
import com.android.mltcode.paycertificationapi.sc3;
import com.android.mltcode.paycertificationapi.tc3;
import com.android.mltcode.paycertificationapi.uc3;
import com.android.mltcode.paycertificationapi.vc3;
import com.sma.smartv3.db.entity.RecordDeviceManage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDeviceFileManageDao_Impl implements RecordDeviceFileManageDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceManage> __deleteAdapterOfRecordDeviceManage;
    private final EntityInsertAdapter<RecordDeviceManage> __insertAdapterOfRecordDeviceManage;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceManage> __updateAdapterOfRecordDeviceManage;

    public RecordDeviceFileManageDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfRecordDeviceManage = new AnonymousClass1(this);
        this.__deleteAdapterOfRecordDeviceManage = new AnonymousClass2(this);
        this.__updateAdapterOfRecordDeviceManage = new AnonymousClass3(this);
    }

    public static /* synthetic */ Object I0IIOi(long r1, SQLiteConnection r3) {
        SQLiteStatement r4 = r3.prepare("DELETE FROM RecordDeviceManage WHERE mId = ?");
        r4.mo3338bindLong(1, r1);     // Catch: Throwable -> L6
        r4.step();     // Catch: Throwable -> L6
        r4.close();
        return null;
    L6:
        th = move-exception;
        r4.close();
        throw th;
    }

    public static /* synthetic */ long[] IiI10X(RecordDeviceFileManageDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfRecordDeviceManage.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List O00(String r14, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM RecordDeviceManage WHERE REPLACE(LOWER(mName), '.aac', '') LIKE '%' || LOWER(?) || '%' ORDER BY mTime DESC");
        if (r14 != null) goto L7;
        r16.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L5
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L5
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L5
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mFileName");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mName");     // Catch: Throwable -> L5
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L5
    L9:
        if (r16.step() == false) goto L25;
        long r7 = r16.getLong(r17);     // Catch: Throwable -> L5
        long r9 = r16.getLong(r0);     // Catch: Throwable -> L5
        String r6 = null;
        if (r16.isNull(r1) == false) goto L14;
        String r11 = null;
    L16:
        if (r16.isNull(r2) == false) goto L18;
        String r12 = null;
    L20:
        if (r16.isNull(r3) == true) goto L23;
        r6 = r16.getText(r3);     // Catch: Throwable -> L5
    L23:
        r4.add(new RecordDeviceManage(r7, r9, r11, r12, r6));     // Catch: Throwable -> L5
        goto L9
    L18:
        r12 = r16.getText(r2);     // Catch: Throwable -> L5
        goto L20
    L14:
        r11 = r16.getText(r1);     // Catch: Throwable -> L5
        goto L16
    L25:
        r16.close();
        return r4;
    L7:
        r16.mo3340bindText(1, r14);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r16.close();
        throw th;
    }

    public static /* synthetic */ List OIi0(String r14, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM RecordDeviceManage WHERE mFileName == ? ORDER BY mTime DESC");
        if (r14 != null) goto L7;
        r16.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L5
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L5
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L5
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mFileName");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mName");     // Catch: Throwable -> L5
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L5
    L9:
        if (r16.step() == false) goto L25;
        long r7 = r16.getLong(r17);     // Catch: Throwable -> L5
        long r9 = r16.getLong(r0);     // Catch: Throwable -> L5
        String r6 = null;
        if (r16.isNull(r1) == false) goto L14;
        String r11 = null;
    L16:
        if (r16.isNull(r2) == false) goto L18;
        String r12 = null;
    L20:
        if (r16.isNull(r3) == true) goto L23;
        r6 = r16.getText(r3);     // Catch: Throwable -> L5
    L23:
        r4.add(new RecordDeviceManage(r7, r9, r11, r12, r6));     // Catch: Throwable -> L5
        goto L9
    L18:
        r12 = r16.getText(r2);     // Catch: Throwable -> L5
        goto L20
    L14:
        r11 = r16.getText(r1);     // Catch: Throwable -> L5
        goto L16
    L25:
        r16.close();
        return r4;
    L7:
        r16.mo3340bindText(1, r14);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r16.close();
        throw th;
    }

    public static /* synthetic */ Object OXO1(RecordDeviceFileManageDao_Impl r0, List r1, SQLiteConnection r2) {
        r0.__deleteAdapterOfRecordDeviceManage.handleMultiple(r2, r1);
        return null;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM RecordDeviceManage ");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L20
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mFileName");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mName");     // Catch: Throwable -> L20
        ArrayList r5 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r16.step() == false) goto L22;
        long r8 = r16.getLong(r0);     // Catch: Throwable -> L20
        long r10 = r16.getLong(r1);     // Catch: Throwable -> L20
        String r7 = null;
        if (r16.isNull(r2) == false) goto L9;
        String r12 = null;
    L11:
        if (r16.isNull(r3) == false) goto L13;
        String r13 = null;
    L15:
        if (r16.isNull(r4) == true) goto L18;
        r7 = r16.getText(r4);     // Catch: Throwable -> L20
    L18:
        r5.add(new RecordDeviceManage(r8, r10, r12, r13, r7));     // Catch: Throwable -> L20
        goto L4
    L13:
        r13 = r16.getText(r3);     // Catch: Throwable -> L20
        goto L15
    L9:
        r12 = r16.getText(r2);     // Catch: Throwable -> L20
        goto L11
    L22:
        r16.close();
        return r5;
    L20:
        th = move-exception;
        r16.close();
        throw th;
    }

    public static /* synthetic */ Object XO0O10(SQLiteConnection r1) {
        SQLiteStatement r2 = r1.prepare("DELETE FROM RecordDeviceManage");
        r2.step();     // Catch: Throwable -> L6
        r2.close();
        return null;
    L6:
        th = move-exception;
        r2.close();
        throw th;
    }

    public static /* synthetic */ Integer XOO0ii0(RecordDeviceFileManageDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfRecordDeviceManage.handleMultiple(r2, r1));
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ RecordDeviceManage iO(long r13, SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("SELECT * FROM RecordDeviceManage WHERE mId = ?");
        r16.mo3338bindLong(1, r13);     // Catch: Throwable -> L19
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mId");     // Catch: Throwable -> L19
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mTime");     // Catch: Throwable -> L19
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mLocalTime");     // Catch: Throwable -> L19
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mFileName");     // Catch: Throwable -> L19
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "mName");     // Catch: Throwable -> L19
        RecordDeviceManage r4 = null;
        String r5 = null;
        if (r16.step() == false) goto L21;
        long r6 = r16.getLong(r14);     // Catch: Throwable -> L19
        long r8 = r16.getLong(r17);     // Catch: Throwable -> L19
        if (r16.isNull(r0) == false) goto L8;
        String r10 = null;
    L10:
        if (r16.isNull(r1) == false) goto L12;
        String r11 = null;
    L14:
        if (r16.isNull(r2) == true) goto L17;
        r5 = r16.getText(r2);     // Catch: Throwable -> L19
    L17:
        r4 = new RecordDeviceManage(r6, r8, r10, r11, r5);     // Catch: Throwable -> L19
        goto L21
    L12:
        r11 = r16.getText(r1);     // Catch: Throwable -> L19
        goto L14
    L8:
        r10 = r16.getText(r0);     // Catch: Throwable -> L19
    L21:
        r16.close();
        return r4;
    L19:
        th = move-exception;
        r16.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public void delete(final List<RecordDeviceManage> lists) {
        lists.getClass();
        DBUtil.performBlocking(this.__db, false, true, new vc3(this, lists));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public void deleteAll() {
        DBUtil.performBlocking(this.__db, false, true, new oc3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public void deleteById(final long id) {
        DBUtil.performBlocking(this.__db, false, true, new sc3(id));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public RecordDeviceManage getDeviceFiletById(final long id) {
        return (RecordDeviceManage) DBUtil.performBlocking(this.__db, true, false, new rc3(id));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> getListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new pc3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> getListByType(final String fileName) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new tc3(fileName));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public long[] insert(final List<RecordDeviceManage> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new qc3(this, list));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public List<RecordDeviceManage> searchByNameIgnoreCase(final String keyword) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new uc3(keyword));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileManageDao
    public int update(final List<RecordDeviceManage> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new nc3(this, lists))).intValue();
    }
}
