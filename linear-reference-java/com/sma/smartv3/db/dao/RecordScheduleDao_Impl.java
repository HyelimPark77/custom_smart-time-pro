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
import com.android.mltcode.paycertificationapi.af3;
import com.android.mltcode.paycertificationapi.bf3;
import com.android.mltcode.paycertificationapi.qe3;
import com.android.mltcode.paycertificationapi.re3;
import com.android.mltcode.paycertificationapi.se3;
import com.android.mltcode.paycertificationapi.te3;
import com.android.mltcode.paycertificationapi.ue3;
import com.android.mltcode.paycertificationapi.ve3;
import com.android.mltcode.paycertificationapi.we3;
import com.android.mltcode.paycertificationapi.xe3;
import com.android.mltcode.paycertificationapi.ye3;
import com.android.mltcode.paycertificationapi.ze3;
import com.sma.smartv3.db.entity.RecordSchedule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordScheduleDao_Impl implements RecordScheduleDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<RecordSchedule> __deleteAdapterOfRecordSchedule;
    private final EntityInsertAdapter<RecordSchedule> __insertAdapterOfRecordSchedule;
    private final EntityDeleteOrUpdateAdapter<RecordSchedule> __updateAdapterOfRecordSchedule;

    public RecordScheduleDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfRecordSchedule = new AnonymousClass1(this);
        this.__deleteAdapterOfRecordSchedule = new AnonymousClass2(this);
        this.__updateAdapterOfRecordSchedule = new AnonymousClass3(this);
    }

    public static /* synthetic */ List I0IIOi(SQLiteConnection r38) {
        SQLiteStatement r1 = r38.prepare("SELECT * FROM RecordSchedule ORDER BY mRemindTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r16 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r16;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ RecordSchedule I0iXXO(long r38, SQLiteConnection r40) {
        SQLiteStatement r1 = r40.prepare("SELECT * FROM RecordSchedule WHERE mId = ?");
        r1.mo3338bindLong(1, r38);     // Catch: Throwable -> L19
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L19
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L19
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L19
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L19
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L19
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L19
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L19
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L19
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L19
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L19
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L19
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L19
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L19
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L19
        RecordSchedule r16 = null;
        String r17 = null;
        if (r1.step() == false) goto L21;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L19
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L19
        if (r1.isNull(r3) == false) goto L8;
        String r22 = null;
    L10:
        if (r1.isNull(r4) == false) goto L12;
        String r23 = null;
    L14:
        if (r1.isNull(r5) == true) goto L17;
        r17 = r1.getText(r5);     // Catch: Throwable -> L19
    L17:
        r16 = new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14));     // Catch: Throwable -> L19
        goto L21
    L12:
        r23 = r1.getText(r4);     // Catch: Throwable -> L19
        goto L14
    L8:
        r22 = r1.getText(r3);     // Catch: Throwable -> L19
    L21:
        r1.close();
        return r16;
    L19:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List IO(int r38, SQLiteConnection r39) {
        SQLiteStatement r1 = r39.prepare("SELECT * FROM RecordSchedule WHERE mStatus = ? ORDER BY mRemindTime ASC");
        r1.mo3338bindLong(1, r38);     // Catch: Throwable -> L20
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r310 = r2;
        int r311 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r310;
        r3 = r311;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List IiI10X(SQLiteConnection r38) {
        SQLiteStatement r1 = r38.prepare("SELECT * FROM RecordSchedule WHERE mStatus = 0 AND mIsRemindEnabled = 1 AND date(mLastRemindTime / 1000, 'unixepoch') = date('now') ORDER BY mLastRemindTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r16 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r16;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List O00(long r38, SQLiteConnection r40) {
        SQLiteStatement r1 = r40.prepare("SELECT * FROM RecordSchedule WHERE mDeviceFileId = ?");
        r1.mo3338bindLong(1, r38);     // Catch: Throwable -> L20
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r310 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r310;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OIX0iXi(SQLiteConnection r38) {
        SQLiteStatement r1 = r38.prepare("SELECT * FROM RecordSchedule WHERE mStatus = 2 ORDER BY mLastRemindTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r16 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r16;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer OIi0(RecordScheduleDao_Impl r0, RecordSchedule r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfRecordSchedule.handle(r2, r1));
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r38) {
        SQLiteStatement r1 = r38.prepare("SELECT * FROM RecordSchedule WHERE mStatus = 1 ORDER BY mLastRemindTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r16 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r16;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r38) {
        SQLiteStatement r1 = r38.prepare("SELECT * FROM RecordSchedule WHERE mStatus = 0 ORDER BY mIsRemindEnabled DESC, mLastRemindTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L20
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L20
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L20
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTitle");     // Catch: Throwable -> L20
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L20
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRemindEnabled");     // Catch: Throwable -> L20
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRepeatType");     // Catch: Throwable -> L20
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRemindTime");     // Catch: Throwable -> L20
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLastRemindTime");     // Catch: Throwable -> L20
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L20
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalendarEventId");     // Catch: Throwable -> L20
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L20
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L20
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDeviceFileId");     // Catch: Throwable -> L20
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L20
    L4:
        if (r1.step() == false) goto L22;
        long r18 = r1.getLong(r0);     // Catch: Throwable -> L20
        long r20 = r1.getLong(r2);     // Catch: Throwable -> L20
        String r17 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r22 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r23 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
    L16:
        int r39 = r2;
        int r16 = r3;
        r15.add(new RecordSchedule(r18, r20, r22, r23, r17, (int) r1.getLong(r6), (int) r1.getLong(r7), r1.getLong(r8), r1.getLong(r9), (int) r1.getLong(r10), r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), r1.getLong(r14)));     // Catch: Throwable -> L20
        r2 = r39;
        r3 = r16;
        goto L4
    L17:
        r17 = r1.getText(r5);     // Catch: Throwable -> L20
        goto L16
    L13:
        r23 = r1.getText(r4);     // Catch: Throwable -> L20
        goto L15
    L9:
        r22 = r1.getText(r3);     // Catch: Throwable -> L20
        goto L11
    L22:
        r1.close();
        return r15;
    L20:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Long XO0O10(RecordScheduleDao_Impl r0, RecordSchedule r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfRecordSchedule.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Integer XOO0ii0(long r2, int r4, SQLiteConnection r5) {
        SQLiteStatement r0 = r5.prepare("DELETE FROM RecordSchedule WHERE mDeviceFileId = ? AND mStatus != ?");
        r0.mo3338bindLong(1, r2);     // Catch: Throwable -> L6
        r0.mo3338bindLong(2, r4);     // Catch: Throwable -> L6
        r0.step();     // Catch: Throwable -> L6
        Integer r3 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r5));     // Catch: Throwable -> L6
        r0.close();
        return r3;
    L6:
        th = move-exception;
        r0.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(RecordScheduleDao_Impl r0, RecordSchedule r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__deleteAdapterOfRecordSchedule.handle(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public int delete(final RecordSchedule schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new we3(this, schedule))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public int deleteUnoperatedByDeviceFileId(final long deviceFileId, final int keepStatus) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new re3(deviceFileId, keepStatus))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getAllSchedules() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new bf3());
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getCompletedSchedules() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new qe3());
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getExpiredSchedules() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new te3());
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getPlannedSchedules() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new xe3());
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public RecordSchedule getScheduleById(final long id) {
        return (RecordSchedule) DBUtil.performBlocking(this.__db, true, false, new af3(id));
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getSchedulesByDeviceFileId(final long deviceFileId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ze3(deviceFileId));
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getSchedulesByStatus(final int status) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ye3(status));
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public List<RecordSchedule> getTodySchedules() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ue3());
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public long insert(final RecordSchedule schedule) {
        schedule.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new ve3(this, schedule))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.RecordScheduleDao
    public int update(final RecordSchedule schedule) {
        schedule.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new se3(this, schedule))).intValue();
    }
}
