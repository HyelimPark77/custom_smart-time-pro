package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.O00OXOXO;
import com.android.mltcode.paycertificationapi.O11i0i11;
import com.android.mltcode.paycertificationapi.OIXIiX111;
import com.android.mltcode.paycertificationapi.OOI1i0;
import com.android.mltcode.paycertificationapi.OOX;
import com.android.mltcode.paycertificationapi.Oi1OIX1;
import com.android.mltcode.paycertificationapi.X0O1XO;
import com.android.mltcode.paycertificationapi.XOIO0;
import com.android.mltcode.paycertificationapi.XiO000;
import com.android.mltcode.paycertificationapi.XiX0I0;
import com.android.mltcode.paycertificationapi.i1I1X0OX1;
import com.android.mltcode.paycertificationapi.iI0OIOO;
import com.android.mltcode.paycertificationapi.iiOOI;
import com.sma.smartv3.db.entity.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDao_Impl implements ActivityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Activity> __insertAdapterOfActivity;
    private final EntityDeleteOrUpdateAdapter<Activity> __updateAdapterOfActivity;

    public ActivityDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfActivity = new AnonymousClass1(this);
        this.__updateAdapterOfActivity = new AnonymousClass2(this);
    }

    public static /* synthetic */ List I0IIOi(long r26, long r28, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM activity WHERE mTime >= ? AND mTime < ? AND mCalorie >= 0 AND mStep <1000000 AND mDistance > 0 ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r28);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r27 = r2;
        int r29 = r3;
        r11.add(new Activity(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r27;
        r3 = r29;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Activity I0iXXO(int r27, SQLiteConnection r28) {
        SQLiteStatement r1 = r28.prepare("SELECT * FROM Activity WHERE  mId > ? AND mTime > 0  ORDER BY mId ASC LIMIT 1");
        r1.mo3338bindLong(1, r27);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == true) goto L9;
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L9:
        r12 = new Activity(r11, r17, r13, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List IO(long r26, long r28, int r30, SQLiteConnection r31) {
        SQLiteStatement r1 = r31.prepare("SELECT * FROM activity WHERE mTime >= ? AND mTime <= ? AND mMode = ? ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r28);     // Catch: Throwable -> L13
        r1.mo3338bindLong(3, r30);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L11:
        int r27 = r2;
        int r29 = r3;
        r11.add(new Activity(r15, r16, r12, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r27;
        r3 = r29;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L11
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer IiI10X(ActivityDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfActivity.handleMultiple(r2, r1));
    }

    public static /* synthetic */ Activity O00(long r27, int r29, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM activity WHERE mTime = ? AND mMode = ? AND mState = 4");
        r1.mo3338bindLong(1, r27);     // Catch: Throwable -> L11
        r1.mo3338bindLong(2, r29);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == true) goto L9;
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L9:
        r12 = new Activity(r11, r17, r13, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OIX0iXi(int r26, int r27, int r28, SQLiteConnection r29) {
        SQLiteStatement r1 = r29.prepare("SELECT * FROM Activity WHERE mState = ? AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC LIMIT ?, ?");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r27);     // Catch: Throwable -> L13
        r1.mo3338bindLong(3, r28);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L11:
        int r210 = r2;
        int r211 = r3;
        r11.add(new Activity(r15, r16, r12, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r210;
        r3 = r211;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L11
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Activity OIi0(SQLiteConnection r27) {
        SQLiteStatement r1 = r27.prepare("SELECT * FROM Activity WHERE  mIsSync = 1 AND mTime > 0  ORDER BY mTime DESC LIMIT 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r19 = r13;
        r12 = new Activity(r11, r17, r19, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
        goto L13
    L8:
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OXO1(long r26, long r28, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM activity WHERE mTime >= ? AND mTime <= ?  AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r26);     // Catch: Throwable -> L13
        r1.mo3338bindLong(2, r28);     // Catch: Throwable -> L13
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r27 = r2;
        int r29 = r3;
        r11.add(new Activity(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r27;
        r3 = r29;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Activity XIi00iiXO(long r27, long r29, int r31, SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM activity WHERE mTime >= ? AND mTime < ? AND mMode = ? AND mState = 0 ORDER BY mTime DESC LIMIT 1");
        r1.mo3338bindLong(1, r27);     // Catch: Throwable -> L11
        r1.mo3338bindLong(2, r29);     // Catch: Throwable -> L11
        r1.mo3338bindLong(3, r31);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == true) goto L9;
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L9:
        r12 = new Activity(r11, r17, r13, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] XO0O10(ActivityDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfActivity.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XOO0ii0(SQLiteConnection r27) {
        SQLiteStatement r1 = r27.prepare("SELECT * FROM Activity WHERE  mIsSync = 0 AND mTime > 0  ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L13
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L13
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L13
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L13
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L13
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L13
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L13
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L13
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L13
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L13
        ArrayList r11 = new ArrayList();     // Catch: Throwable -> L13
    L4:
        if (r1.step() == false) goto L15;
        int r15 = (int) r1.getLong(r0);     // Catch: Throwable -> L13
        long r16 = r1.getLong(r2);     // Catch: Throwable -> L13
        if (r1.isNull(r3) == false) goto L10;
        String r12 = null;
    L9:
        String r18 = r12;
        int r28 = r2;
        int r26 = r3;
        r11.add(new Activity(r15, r16, r18, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10)));     // Catch: Throwable -> L13
        r2 = r28;
        r3 = r26;
        goto L4
    L10:
        r12 = r1.getText(r3);     // Catch: Throwable -> L13
        goto L9
    L15:
        r1.close();
        return r11;
    L13:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Activity XXI(int r27, SQLiteConnection r28) {
        SQLiteStatement r1 = r28.prepare("SELECT * FROM Activity WHERE  mId < ? AND mTime > 0  ORDER BY mId DESC LIMIT 1");
        r1.mo3338bindLong(1, r27);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == true) goto L9;
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L9:
        r12 = new Activity(r11, r17, r13, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Activity iO(long r27, long r29, SQLiteConnection r31) {
        SQLiteStatement r1 = r31.prepare("SELECT * FROM activity WHERE mTime >= ? AND mTime < ? AND mStep >= 0 AND mCalorie > 0 AND mStep < 1000000 ORDER BY mTime DESC LIMIT 1");
        r1.mo3338bindLong(1, r27);     // Catch: Throwable -> L11
        r1.mo3338bindLong(2, r29);     // Catch: Throwable -> L11
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L11
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L11
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L11
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L11
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mState");     // Catch: Throwable -> L11
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L11
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L11
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L11
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L11
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L11
        Activity r12 = null;
        String r13 = null;
        if (r1.step() == false) goto L13;
        int r11 = (int) r1.getLong(r0);     // Catch: Throwable -> L11
        long r17 = r1.getLong(r2);     // Catch: Throwable -> L11
        if (r1.isNull(r3) == false) goto L8;
    L7:
        String r19 = r13;
        r12 = new Activity(r11, r17, r19, (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10));     // Catch: Throwable -> L11
        goto L13
    L8:
        r13 = r1.getText(r3);     // Catch: Throwable -> L11
    L13:
        r1.close();
        return r12;
    L11:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getActivity(final long start, final long end) {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new O00OXOXO(start, end));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getBeginItem(final long start, final long end, final int mode) {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new OIXIiX111(start, end, mode));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getEndItem(final long end, final int mode) {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new OOX(end, mode));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getLastSyncItem() {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new XOIO0());
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public List<Activity> getListASC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iI0OIOO(start, end));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public List<Activity> getListDESC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Oi1OIX1(start, end));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getNextItemByID(final int id) {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new iiOOI(id));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public Activity getPreviousItemByID(final int id) {
        return (Activity) DBUtil.performBlocking(this.__db, true, false, new OOI1i0(id));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public List<Activity> getStateActivityList(final int state, final int startIndex, final int endIndex) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new i1I1X0OX1(state, startIndex, endIndex));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public List<Activity> getWorkoutListDESC(final long start, final long end, final int mode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new O11i0i11(start, end, mode));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public long[] insert(final List<Activity> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new XiO000(this, list));
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public int update(final List<Activity> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new XiX0I0(this, lists))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.ActivityDao
    public List<Activity> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new X0O1XO());
    }
}
