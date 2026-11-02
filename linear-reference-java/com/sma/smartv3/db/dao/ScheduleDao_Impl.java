package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.vu3;
import com.android.mltcode.paycertificationapi.wu3;
import com.android.mltcode.paycertificationapi.xu3;
import com.android.mltcode.paycertificationapi.yu3;
import com.android.mltcode.paycertificationapi.zu3;
import com.sma.smartv3.db.entity.Schedule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ScheduleDao_Impl implements ScheduleDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<Schedule> __deleteAdapterOfSchedule;
    private final EntityInsertAdapter<Schedule> __insertAdapterOfSchedule;
    private final EntityDeleteOrUpdateAdapter<Schedule> __updateAdapterOfSchedule;

    public ScheduleDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfSchedule = new AnonymousClass1(this);
        this.__deleteAdapterOfSchedule = new AnonymousClass2(this);
        this.__updateAdapterOfSchedule = new AnonymousClass3(this);
    }

    public static /* synthetic */ Integer O00(ScheduleDao_Impl r0, Schedule[] r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfSchedule.handleMultiple(r2, r1));
    }

    public static /* synthetic */ Long OXO1(ScheduleDao_Impl r0, Schedule r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfSchedule.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r26) {
        SQLiteStatement r1 = r26.prepare("SELECT * FROM schedule");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L16
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScheduleId");     // Catch: Throwable -> L16
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mYear");     // Catch: Throwable -> L16
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMonth");     // Catch: Throwable -> L16
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDay");     // Catch: Throwable -> L16
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHour");     // Catch: Throwable -> L16
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinute");     // Catch: Throwable -> L16
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAdvance");     // Catch: Throwable -> L16
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L16
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L16
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L16
    L4:
        if (r1.step() == false) goto L18;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L16
        int r12 = (int) r1.getLong(r2);     // Catch: Throwable -> L16
        int r13 = (int) r1.getLong(r3);     // Catch: Throwable -> L16
        int r27 = r2;
        int r25 = r3;
        int r14 = (int) r1.getLong(r4);     // Catch: Throwable -> L16
        int r16 = (int) r1.getLong(r5);     // Catch: Throwable -> L16
        int r17 = (int) r1.getLong(r6);     // Catch: Throwable -> L16
        int r18 = (int) r1.getLong(r7);     // Catch: Throwable -> L16
        int r19 = (int) r1.getLong(r8);     // Catch: Throwable -> L16
        String r110 = null;
        if (r1.isNull(r9) == false) goto L9;
        String r23 = null;
    L11:
        if (r1.isNull(r10) == true) goto L14;
        r110 = r1.getText(r10);     // Catch: Throwable -> L16
    L14:
        r11.add(new Schedule(r15, r12, r13, r14, r16, r17, r18, r19, r23, r110));     // Catch: Throwable -> L16
        r2 = r27;
        r3 = r25;
        goto L4
    L9:
        r23 = r1.getText(r9);     // Catch: Throwable -> L16
        goto L11
    L18:
        r1.close();
        return r11;
    L16:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Schedule XO0O10(int r26, SQLiteConnection r27) {
        SQLiteStatement r1 = r27.prepare("SELECT * FROM schedule WHERE mId=?");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L15
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L15
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScheduleId");     // Catch: Throwable -> L15
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mYear");     // Catch: Throwable -> L15
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMonth");     // Catch: Throwable -> L15
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDay");     // Catch: Throwable -> L15
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHour");     // Catch: Throwable -> L15
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinute");     // Catch: Throwable -> L15
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAdvance");     // Catch: Throwable -> L15
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L15
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L15
        Schedule r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L17;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L15
        int r14 = (int) r1.getLong(r2);     // Catch: Throwable -> L15
        int r15 = (int) r1.getLong(r3);     // Catch: Throwable -> L15
        int r16 = (int) r1.getLong(r4);     // Catch: Throwable -> L15
        int r17 = (int) r1.getLong(r5);     // Catch: Throwable -> L15
        int r18 = (int) r1.getLong(r6);     // Catch: Throwable -> L15
        int r19 = (int) r1.getLong(r7);     // Catch: Throwable -> L15
        int r20 = (int) r1.getLong(r8);     // Catch: Throwable -> L15
        if (r1.isNull(r9) == false) goto L8;
        String r24 = null;
    L10:
        if (r1.isNull(r10) == true) goto L13;
        r13 = r1.getText(r10);     // Catch: Throwable -> L15
    L13:
        r12 = new Schedule(r11, r14, r15, r16, r17, r18, r19, r20, r24, r13);     // Catch: Throwable -> L15
        goto L17
    L8:
        r24 = r1.getText(r9);     // Catch: Throwable -> L15
    L17:
        r1.close();
        return r12;
    L15:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(ScheduleDao_Impl r0, Schedule r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__deleteAdapterOfSchedule.handle(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.ScheduleDao
    public int delete(final Schedule schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new vu3(this, schedule))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.ScheduleDao
    public Schedule get(final int id) {
        return (Schedule) DBUtil.performBlocking(this.__db, true, false, new yu3(id));
    }

    @Override // com.sma.smartv3.db.dao.ScheduleDao
    public List<Schedule> getAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new zu3());
    }

    @Override // com.sma.smartv3.db.dao.ScheduleDao
    public long insert(final Schedule schedule) {
        schedule.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new xu3(this, schedule))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.ScheduleDao
    public int update(final Schedule... schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new wu3(this, schedule))).intValue();
    }
}
