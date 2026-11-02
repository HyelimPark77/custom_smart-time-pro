package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I1I010i00;
import com.android.mltcode.paycertificationapi.I1iX0;
import com.android.mltcode.paycertificationapi.IOO1i11X;
import com.android.mltcode.paycertificationapi.IiOXII;
import com.android.mltcode.paycertificationapi.IiXi0i1OX;
import com.android.mltcode.paycertificationapi.IiXi100;
import com.android.mltcode.paycertificationapi.IiiOO10;
import com.android.mltcode.paycertificationapi.OO1OI00XI;
import com.android.mltcode.paycertificationapi.OiX0IO;
import com.android.mltcode.paycertificationapi.X1iOI;
import com.android.mltcode.paycertificationapi.XII1iO;
import com.android.mltcode.paycertificationapi.XiIO01O0;
import com.android.mltcode.paycertificationapi.i1IXiiX;
import com.android.mltcode.paycertificationapi.iX10X;
import com.sma.smartv3.db.entity.RecordDeviceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceInfoDao_Impl implements DeviceInfoDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceInfo> __deleteAdapterOfRecordDeviceInfo;
    private final EntityInsertAdapter<RecordDeviceInfo> __insertAdapterOfRecordDeviceInfo;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceInfo> __updateAdapterOfRecordDeviceInfo;

    public DeviceInfoDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfRecordDeviceInfo = new AnonymousClass1(this);
        this.__deleteAdapterOfRecordDeviceInfo = new AnonymousClass2(this);
        this.__updateAdapterOfRecordDeviceInfo = new AnonymousClass3(this);
    }

    public static /* synthetic */ Boolean I0IIOi(SQLiteConnection r4) {
        SQLiteStatement r5 = r4.prepare("SELECT EXISTS(SELECT 1 FROM RecordDeviceInfo LIMIT 1)");
        boolean r1 = false;
        if (r5.step() == true) goto L6;
    L10:
        Boolean r0 = Boolean.valueOf(r1);     // Catch: Throwable -> L8
        r5.close();
        return r0;
    L6:
        if (((int) r5.getLong(0)) == 0) goto L10;
        r1 = true;
    L8:
        th = move-exception;
        r5.close();
        throw th;
    }

    public static /* synthetic */ Integer I0iXXO(SQLiteConnection r1) {
        SQLiteStatement r0 = r1.prepare("UPDATE RecordDeviceInfo SET isActive = 0");
        r0.step();     // Catch: Throwable -> L6
        Integer r2 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r1));     // Catch: Throwable -> L6
        r0.close();
        return r2;
    L6:
        th = move-exception;
        r0.close();
        throw th;
    }

    public static /* synthetic */ Integer IO(DeviceInfoDao_Impl r0, RecordDeviceInfo r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__deleteAdapterOfRecordDeviceInfo.handle(r2, r1));
    }

    public static /* synthetic */ Long IiI10X(DeviceInfoDao_Impl r0, RecordDeviceInfo r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfRecordDeviceInfo.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Integer O00(SQLiteConnection r2) {
        SQLiteStatement r3 = r2.prepare("SELECT COUNT(*) FROM RecordDeviceInfo");
        int r1 = 0;
        if (r3.step() == false) goto L8;
        r1 = (int) r3.getLong(0);     // Catch: Throwable -> L6
    L8:
        Integer r0 = Integer.valueOf(r1);     // Catch: Throwable -> L6
        r3.close();
        return r0;
    L6:
        th = move-exception;
        r3.close();
        throw th;
    }

    public static /* synthetic */ RecordDeviceInfo OIX0iXi(String r31, SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM RecordDeviceInfo WHERE mMac = ?");
        boolean r2 = true;
        if (r31 != null) goto L7;
        r1.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L5
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L5
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMac");     // Catch: Throwable -> L5
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L5
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVersion");     // Catch: Throwable -> L5
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBattery");     // Catch: Throwable -> L5
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTotalStorage");     // Catch: Throwable -> L5
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvailableStorage");     // Catch: Throwable -> L5
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isActive");     // Catch: Throwable -> L5
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVoltage");     // Catch: Throwable -> L5
        RecordDeviceInfo r14 = null;
        String r15 = null;
        if (r1.step() == false) goto L32;
        long r16 = r1.getLong(r0);     // Catch: Throwable -> L5
        long r18 = r1.getLong(r3);     // Catch: Throwable -> L5
        if (r1.isNull(r4) == false) goto L13;
        String r20 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r21 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r22 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
    L24:
        String r23 = r15;
        int r13 = (int) r1.getLong(r8);     // Catch: Throwable -> L5
        long r25 = r1.getLong(r9);     // Catch: Throwable -> L5
        long r27 = r1.getLong(r10);     // Catch: Throwable -> L5
        if (((int) r1.getLong(r11)) != 0) goto L30;
        r2 = false;
    L30:
        r14 = new RecordDeviceInfo(r16, r18, r20, r21, r22, r23, r13, r25, r27, r2, (int) r1.getLong(r12));     // Catch: Throwable -> L5
        goto L32
    L25:
        r15 = r1.getText(r7);     // Catch: Throwable -> L5
        goto L24
    L21:
        r22 = r1.getText(r6);     // Catch: Throwable -> L5
        goto L23
    L17:
        r21 = r1.getText(r5);     // Catch: Throwable -> L5
        goto L19
    L13:
        r20 = r1.getText(r4);     // Catch: Throwable -> L5
    L32:
        r1.close();
        return r14;
    L7:
        r1.mo3340bindText(1, r31);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer OIi0(SQLiteConnection r1) {
        SQLiteStatement r0 = r1.prepare("DELETE FROM RecordDeviceInfo");
        r0.step();     // Catch: Throwable -> L6
        Integer r2 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r1));     // Catch: Throwable -> L6
        r0.close();
        return r2;
    L6:
        th = move-exception;
        r0.close();
        throw th;
    }

    public static /* synthetic */ Integer OXO1(DeviceInfoDao_Impl r0, RecordDeviceInfo r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfRecordDeviceInfo.handle(r2, r1));
    }

    public static /* synthetic */ Integer X1ii(String r2, SQLiteConnection r3) {
        SQLiteStatement r0 = r3.prepare("UPDATE RecordDeviceInfo SET isActive = 1 WHERE mMac = ?");
        if (r2 != null) goto L7;
        r0.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        r0.step();     // Catch: Throwable -> L5
        Integer r4 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r3));     // Catch: Throwable -> L5
        r0.close();
        return r4;
    L7:
        r0.mo3340bindText(1, r2);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r0.close();
        throw th;
    }

    public static /* synthetic */ Unit XIi00iiXO(DeviceInfoDao_Impl r0, String r1, SQLiteConnection r2) {
        super.setActiveDevice(r1);
        return Unit.OXO1;
    }

    public static /* synthetic */ Integer XO0O10(String r2, SQLiteConnection r3) {
        SQLiteStatement r0 = r3.prepare("DELETE FROM RecordDeviceInfo WHERE mMac = ?");
        if (r2 != null) goto L7;
        r0.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        r0.step();     // Catch: Throwable -> L5
        Integer r4 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r3));     // Catch: Throwable -> L5
        r0.close();
        return r4;
    L7:
        r0.mo3340bindText(1, r2);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r0.close();
        throw th;
    }

    public static /* synthetic */ RecordDeviceInfo XOO0ii0(SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM RecordDeviceInfo ORDER BY isActive DESC, mId ASC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L28
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L28
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L28
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMac");     // Catch: Throwable -> L28
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L28
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVersion");     // Catch: Throwable -> L28
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBattery");     // Catch: Throwable -> L28
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTotalStorage");     // Catch: Throwable -> L28
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvailableStorage");     // Catch: Throwable -> L28
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isActive");     // Catch: Throwable -> L28
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVoltage");     // Catch: Throwable -> L28
        RecordDeviceInfo r13 = null;
        String r14 = null;
        if (r1.step() == false) goto L30;
        long r15 = r1.getLong(r0);     // Catch: Throwable -> L28
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L28
        if (r1.isNull(r3) == false) goto L8;
        String r19 = null;
    L10:
        if (r1.isNull(r4) == false) goto L12;
        String r20 = null;
    L14:
        if (r1.isNull(r5) == false) goto L16;
        String r21 = null;
    L18:
        if (r1.isNull(r6) == false) goto L20;
    L19:
        String r22 = r14;
        int r12 = (int) r1.getLong(r7);     // Catch: Throwable -> L28
        long r24 = r1.getLong(r8);     // Catch: Throwable -> L28
        long r26 = r1.getLong(r9);     // Catch: Throwable -> L28
        if (((int) r1.getLong(r10)) == 0) goto L25;
        boolean r16 = true;
    L26:
        r13 = new RecordDeviceInfo(r15, r17, r19, r20, r21, r22, r12, r24, r26, r16, (int) r1.getLong(r11));     // Catch: Throwable -> L28
        goto L30
    L25:
        r16 = false;
        goto L26
    L20:
        r14 = r1.getText(r6);     // Catch: Throwable -> L28
        goto L19
    L16:
        r21 = r1.getText(r5);     // Catch: Throwable -> L28
        goto L18
    L12:
        r20 = r1.getText(r4);     // Catch: Throwable -> L28
        goto L14
    L8:
        r19 = r1.getText(r3);     // Catch: Throwable -> L28
    L30:
        r1.close();
        return r13;
    L28:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XXI(SQLiteConnection r31) {
        SQLiteStatement r1 = r31.prepare("SELECT * FROM RecordDeviceInfo");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L29
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L29
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L29
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMac");     // Catch: Throwable -> L29
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L29
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVersion");     // Catch: Throwable -> L29
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBattery");     // Catch: Throwable -> L29
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTotalStorage");     // Catch: Throwable -> L29
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvailableStorage");     // Catch: Throwable -> L29
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isActive");     // Catch: Throwable -> L29
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mVoltage");     // Catch: Throwable -> L29
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L29
    L4:
        if (r1.step() == false) goto L31;
        long r15 = r1.getLong(r0);     // Catch: Throwable -> L29
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L29
        String r14 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r19 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r20 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r21 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
    L20:
        String r22 = r14;
        int r13 = (int) r1.getLong(r7);     // Catch: Throwable -> L29
        long r24 = r1.getLong(r8);     // Catch: Throwable -> L29
        long r26 = r1.getLong(r9);     // Catch: Throwable -> L29
        int r32 = r2;
        int r30 = r3;
        if (((int) r1.getLong(r10)) == 0) goto L26;
        boolean r16 = true;
    L27:
        r12.add(new RecordDeviceInfo(r15, r17, r19, r20, r21, r22, r13, r24, r26, r16, (int) r1.getLong(r11)));     // Catch: Throwable -> L29
        r2 = r32;
        r3 = r30;
        goto L4
    L26:
        r16 = false;
        goto L27
    L21:
        r14 = r1.getText(r6);     // Catch: Throwable -> L29
        goto L20
    L17:
        r21 = r1.getText(r5);     // Catch: Throwable -> L29
        goto L19
    L13:
        r20 = r1.getText(r4);     // Catch: Throwable -> L29
        goto L15
    L9:
        r19 = r1.getText(r3);     // Catch: Throwable -> L29
        goto L11
    L31:
        r1.close();
        return r12;
    L29:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ long[] iO(DeviceInfoDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfRecordDeviceInfo.insertAndReturnIdsArray(r2, r1);
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int clearActiveStatus() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new iX10X())).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int delete(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new IiOXII(this, deviceInfo))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int deleteAll() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new XII1iO())).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int deleteByMac(final String mac) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new IiiOO10(mac))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public RecordDeviceInfo getActiveDevice() {
        return (RecordDeviceInfo) DBUtil.performBlocking(this.__db, true, false, new IOO1i11X());
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public List<RecordDeviceInfo> getAllDevices() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new X1iOI());
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public RecordDeviceInfo getDeviceByMac(final String mac) {
        return (RecordDeviceInfo) DBUtil.performBlocking(this.__db, true, false, new OiX0IO(mac));
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int getDeviceCount() {
        return ((Integer) DBUtil.performBlocking(this.__db, true, false, new I1I010i00())).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public boolean hasDevices() {
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new XiIO01O0())).booleanValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public long insertOrUpdate(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new IiXi100(this, deviceInfo))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public long[] insertOrUpdateList(final List<RecordDeviceInfo> deviceInfos) {
        deviceInfos.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new i1IXiiX(this, deviceInfos));
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public void setActiveDevice(final String mac) {
        DBUtil.performBlocking(this.__db, false, true, new I1iX0(this, mac));
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int setDeviceActive(final String mac) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new IiXi0i1OX(mac))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.DeviceInfoDao
    public int update(final RecordDeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new OO1OI00XI(this, deviceInfo))).intValue();
    }
}
