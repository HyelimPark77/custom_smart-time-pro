package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.IiiiX01IX;
import com.android.mltcode.paycertificationapi.OO0X0OXO;
import com.android.mltcode.paycertificationapi.OOI1IIIiI;
import com.android.mltcode.paycertificationapi.XO1iI1;
import com.android.mltcode.paycertificationapi.iI1Xi;
import com.sma.smartv3.db.entity.BloodGlucose2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucose2Dao_Impl implements BloodGlucose2Dao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BloodGlucose2> __insertAdapterOfBloodGlucose2;

    public BloodGlucose2Dao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfBloodGlucose2 = new AnonymousClass1(this);
    }

    public static /* synthetic */ List O00(SQLiteConnection r49) {
        SQLiteStatement r1 = r49.prepare("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMeasurementId");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserId");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStartTime");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mEndTime");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModelNo");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowerBound");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUpperBound");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFasting");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWithin2hrsMeal");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCompletedProgress");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCurrentLevel");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRiskCode");     // Catch: Throwable -> L48
        int r410 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mInsights");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTips");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleInsights");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleTips");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        int r21 = r14;
        ArrayList r22 = r15;
        int r110 = (int) r1.getLong(r0);     // Catch: Throwable -> L48
        long r25 = r1.getLong(r2);     // Catch: Throwable -> L48
        String r23 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r27 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r28 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r29 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r30 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
        String r31 = null;
    L26:
        double r32 = r1.getDouble(r8);     // Catch: Throwable -> L48
        double r34 = r1.getDouble(r9);     // Catch: Throwable -> L48
        int r111 = r2;
        int r47 = r3;
        int r24 = (int) r1.getLong(r10);     // Catch: Throwable -> L48
        int r26 = (int) r1.getLong(r11);     // Catch: Throwable -> L48
        int r33 = (int) r1.getLong(r12);     // Catch: Throwable -> L48
        int r35 = (int) r1.getLong(r13);     // Catch: Throwable -> L48
        if (r1.isNull(r21) == false) goto L29;
        int r411 = r0;
        String r40 = null;
    L31:
        if (r1.isNull(r410) == false) goto L33;
        int r36 = r16;
        String r41 = null;
    L35:
        if (r1.isNull(r36) == false) goto L37;
        int r37 = r17;
        String r42 = null;
    L39:
        if (r1.isNull(r37) == false) goto L41;
        int r38 = r18;
        String r43 = null;
    L43:
        if (r1.isNull(r38) == false) goto L45;
    L44:
        int r210 = r19;
        int r112 = r38;
        int r48 = r5;
        int r39 = r20;
        int r211 = r4;
        r22.add(new BloodGlucose2(r110, r25, r27, r28, r29, r30, r31, r32, r34, r24, r26, r33, r35, r40, r41, r42, r43, r23, (int) r1.getLong(r210), (int) r1.getLong(r39)));     // Catch: Throwable -> L48
        r0 = r411;
        r410 = r410;
        r16 = r36;
        r17 = r37;
        r18 = r112;
        r19 = r210;
        r2 = r111;
        r14 = r21;
        r5 = r48;
        r15 = r22;
        r4 = r211;
        r20 = r39;
        r3 = r47;
        goto L4
    L45:
        r23 = r1.getText(r38);     // Catch: Throwable -> L48
        goto L44
    L41:
        String r212 = r1.getText(r37);     // Catch: Throwable -> L48
        r38 = r18;
        r43 = r212;
        goto L43
    L37:
        String r213 = r1.getText(r36);     // Catch: Throwable -> L48
        r37 = r17;
        r42 = r213;
        goto L39
    L33:
        r36 = r16;
        r41 = r1.getText(r410);     // Catch: Throwable -> L48
        goto L35
    L29:
        r411 = r0;
        r40 = r1.getText(r21);     // Catch: Throwable -> L48
        goto L31
    L25:
        r31 = r1.getText(r7);     // Catch: Throwable -> L48
        goto L26
    L21:
        r30 = r1.getText(r6);     // Catch: Throwable -> L48
        goto L23
    L17:
        r29 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L19
    L13:
        r28 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L15
    L9:
        r27 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L11
    L50:
        ArrayList r44 = r15;
        r1.close();
        return r44;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] OXO1(BloodGlucose2Dao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfBloodGlucose2.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r49) {
        SQLiteStatement r1 = r49.prepare("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMeasurementId");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserId");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStartTime");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mEndTime");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModelNo");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowerBound");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUpperBound");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFasting");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWithin2hrsMeal");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCompletedProgress");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCurrentLevel");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRiskCode");     // Catch: Throwable -> L48
        int r410 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mInsights");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTips");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleInsights");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleTips");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        int r21 = r14;
        ArrayList r22 = r15;
        int r110 = (int) r1.getLong(r0);     // Catch: Throwable -> L48
        long r25 = r1.getLong(r2);     // Catch: Throwable -> L48
        String r23 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r27 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r28 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r29 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r30 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
        String r31 = null;
    L26:
        double r32 = r1.getDouble(r8);     // Catch: Throwable -> L48
        double r34 = r1.getDouble(r9);     // Catch: Throwable -> L48
        int r111 = r2;
        int r47 = r3;
        int r24 = (int) r1.getLong(r10);     // Catch: Throwable -> L48
        int r26 = (int) r1.getLong(r11);     // Catch: Throwable -> L48
        int r33 = (int) r1.getLong(r12);     // Catch: Throwable -> L48
        int r35 = (int) r1.getLong(r13);     // Catch: Throwable -> L48
        if (r1.isNull(r21) == false) goto L29;
        int r411 = r0;
        String r40 = null;
    L31:
        if (r1.isNull(r410) == false) goto L33;
        int r36 = r16;
        String r41 = null;
    L35:
        if (r1.isNull(r36) == false) goto L37;
        int r37 = r17;
        String r42 = null;
    L39:
        if (r1.isNull(r37) == false) goto L41;
        int r38 = r18;
        String r43 = null;
    L43:
        if (r1.isNull(r38) == false) goto L45;
    L44:
        int r210 = r19;
        int r112 = r38;
        int r48 = r5;
        int r39 = r20;
        int r211 = r4;
        r22.add(new BloodGlucose2(r110, r25, r27, r28, r29, r30, r31, r32, r34, r24, r26, r33, r35, r40, r41, r42, r43, r23, (int) r1.getLong(r210), (int) r1.getLong(r39)));     // Catch: Throwable -> L48
        r0 = r411;
        r410 = r410;
        r16 = r36;
        r17 = r37;
        r18 = r112;
        r19 = r210;
        r2 = r111;
        r14 = r21;
        r5 = r48;
        r15 = r22;
        r4 = r211;
        r20 = r39;
        r3 = r47;
        goto L4
    L45:
        r23 = r1.getText(r38);     // Catch: Throwable -> L48
        goto L44
    L41:
        String r212 = r1.getText(r37);     // Catch: Throwable -> L48
        r38 = r18;
        r43 = r212;
        goto L43
    L37:
        String r213 = r1.getText(r36);     // Catch: Throwable -> L48
        r37 = r17;
        r42 = r213;
        goto L39
    L33:
        r36 = r16;
        r41 = r1.getText(r410);     // Catch: Throwable -> L48
        goto L35
    L29:
        r411 = r0;
        r40 = r1.getText(r21);     // Catch: Throwable -> L48
        goto L31
    L25:
        r31 = r1.getText(r7);     // Catch: Throwable -> L48
        goto L26
    L21:
        r30 = r1.getText(r6);     // Catch: Throwable -> L48
        goto L23
    L17:
        r29 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L19
    L13:
        r28 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L15
    L9:
        r27 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L11
    L50:
        ArrayList r44 = r15;
        r1.close();
        return r44;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XO0O10(long r45, long r47, SQLiteConnection r49) {
        SQLiteStatement r1 = r49.prepare("SELECT * FROM BloodGlucose2 WHERE mTime >= ? AND mTime < ? AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r45);     // Catch: Throwable -> L51
        r1.mo3338bindLong(2, r47);     // Catch: Throwable -> L51
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L51
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L51
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMeasurementId");     // Catch: Throwable -> L51
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserId");     // Catch: Throwable -> L51
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStartTime");     // Catch: Throwable -> L51
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mEndTime");     // Catch: Throwable -> L51
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModelNo");     // Catch: Throwable -> L51
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowerBound");     // Catch: Throwable -> L51
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUpperBound");     // Catch: Throwable -> L51
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFasting");     // Catch: Throwable -> L51
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWithin2hrsMeal");     // Catch: Throwable -> L51
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCompletedProgress");     // Catch: Throwable -> L51
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCurrentLevel");     // Catch: Throwable -> L51
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRiskCode");     // Catch: Throwable -> L51
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mInsights");     // Catch: Throwable -> L51
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTips");     // Catch: Throwable -> L51
        int r410 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleInsights");     // Catch: Throwable -> L51
        int r411 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleTips");     // Catch: Throwable -> L51
        int r412 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L51
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L51
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L51
    L4:
        if (r1.step() == false) goto L53;
        int r17 = r14;
        ArrayList r18 = r15;
        int r19 = (int) r1.getLong(r0);     // Catch: Throwable -> L51
        long r21 = r1.getLong(r2);     // Catch: Throwable -> L51
        String r110 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r23 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r24 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r25 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r26 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
        String r27 = null;
    L26:
        double r28 = r1.getDouble(r8);     // Catch: Throwable -> L51
        double r30 = r1.getDouble(r9);     // Catch: Throwable -> L51
        int r111 = r2;
        int r43 = r3;
        int r20 = (int) r1.getLong(r10);     // Catch: Throwable -> L51
        int r22 = (int) r1.getLong(r11);     // Catch: Throwable -> L51
        int r29 = (int) r1.getLong(r12);     // Catch: Throwable -> L51
        int r31 = (int) r1.getLong(r13);     // Catch: Throwable -> L51
        if (r1.isNull(r17) == false) goto L29;
        int r413 = r0;
        String r36 = null;
    L31:
        if (r1.isNull(r46) == false) goto L34;
        String r37 = null;
    L33:
        int r112 = r46;
        int r32 = r48;
        if (r1.isNull(r32) == false) goto L39;
        String r38 = null;
    L38:
        r48 = r32;
        int r33 = r410;
        if (r1.isNull(r33) == false) goto L44;
        String r39 = null;
    L43:
        r410 = r33;
        int r34 = r411;
        if (r1.isNull(r34) == false) goto L48;
    L47:
        r411 = r34;
        int r35 = r412;
        int r44 = r5;
        int r40 = r16;
        int r113 = r4;
        r18.add(new BloodGlucose2(r19, r21, r23, r24, r25, r26, r27, r28, r30, r20, r22, r29, r31, r36, r37, r38, r39, r110, (int) r1.getLong(r35), (int) r1.getLong(r40)));     // Catch: Throwable -> L51
        r14 = r17;
        r412 = r35;
        r2 = r111;
        r5 = r44;
        r0 = r413;
        r15 = r18;
        r4 = r113;
        r46 = r112;
        r16 = r40;
        r3 = r43;
        goto L4
    L48:
        r110 = r1.getText(r34);     // Catch: Throwable -> L51
        goto L47
    L44:
        r39 = r1.getText(r33);     // Catch: Throwable -> L51
        goto L43
    L39:
        r38 = r1.getText(r32);     // Catch: Throwable -> L51
        goto L38
    L34:
        r37 = r1.getText(r46);     // Catch: Throwable -> L51
        goto L33
    L29:
        r413 = r0;
        r36 = r1.getText(r17);     // Catch: Throwable -> L51
        goto L31
    L25:
        r27 = r1.getText(r7);     // Catch: Throwable -> L51
        goto L26
    L21:
        r26 = r1.getText(r6);     // Catch: Throwable -> L51
        goto L23
    L17:
        r25 = r1.getText(r5);     // Catch: Throwable -> L51
        goto L19
    L13:
        r24 = r1.getText(r4);     // Catch: Throwable -> L51
        goto L15
    L9:
        r23 = r1.getText(r3);     // Catch: Throwable -> L51
        goto L11
    L53:
        ArrayList r41 = r15;
        r1.close();
        return r41;
    L51:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(long r45, long r47, SQLiteConnection r49) {
        SQLiteStatement r1 = r49.prepare("SELECT * FROM BloodGlucose2 WHERE mTime >= ? AND mTime < ? AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r45);     // Catch: Throwable -> L51
        r1.mo3338bindLong(2, r47);     // Catch: Throwable -> L51
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L51
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L51
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMeasurementId");     // Catch: Throwable -> L51
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserId");     // Catch: Throwable -> L51
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStartTime");     // Catch: Throwable -> L51
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mEndTime");     // Catch: Throwable -> L51
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModelNo");     // Catch: Throwable -> L51
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLowerBound");     // Catch: Throwable -> L51
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUpperBound");     // Catch: Throwable -> L51
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFasting");     // Catch: Throwable -> L51
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWithin2hrsMeal");     // Catch: Throwable -> L51
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCompletedProgress");     // Catch: Throwable -> L51
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCurrentLevel");     // Catch: Throwable -> L51
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRiskCode");     // Catch: Throwable -> L51
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mInsights");     // Catch: Throwable -> L51
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTips");     // Catch: Throwable -> L51
        int r410 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleInsights");     // Catch: Throwable -> L51
        int r411 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocaleTips");     // Catch: Throwable -> L51
        int r412 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L51
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L51
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L51
    L4:
        if (r1.step() == false) goto L53;
        int r17 = r14;
        ArrayList r18 = r15;
        int r19 = (int) r1.getLong(r0);     // Catch: Throwable -> L51
        long r21 = r1.getLong(r2);     // Catch: Throwable -> L51
        String r110 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r23 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r24 = null;
    L15:
        if (r1.isNull(r5) == false) goto L17;
        String r25 = null;
    L19:
        if (r1.isNull(r6) == false) goto L21;
        String r26 = null;
    L23:
        if (r1.isNull(r7) == false) goto L25;
        String r27 = null;
    L26:
        double r28 = r1.getDouble(r8);     // Catch: Throwable -> L51
        double r30 = r1.getDouble(r9);     // Catch: Throwable -> L51
        int r111 = r2;
        int r43 = r3;
        int r20 = (int) r1.getLong(r10);     // Catch: Throwable -> L51
        int r22 = (int) r1.getLong(r11);     // Catch: Throwable -> L51
        int r29 = (int) r1.getLong(r12);     // Catch: Throwable -> L51
        int r31 = (int) r1.getLong(r13);     // Catch: Throwable -> L51
        if (r1.isNull(r17) == false) goto L29;
        int r413 = r0;
        String r36 = null;
    L31:
        if (r1.isNull(r46) == false) goto L34;
        String r37 = null;
    L33:
        int r112 = r46;
        int r32 = r48;
        if (r1.isNull(r32) == false) goto L39;
        String r38 = null;
    L38:
        r48 = r32;
        int r33 = r410;
        if (r1.isNull(r33) == false) goto L44;
        String r39 = null;
    L43:
        r410 = r33;
        int r34 = r411;
        if (r1.isNull(r34) == false) goto L48;
    L47:
        r411 = r34;
        int r35 = r412;
        int r44 = r5;
        int r40 = r16;
        int r113 = r4;
        r18.add(new BloodGlucose2(r19, r21, r23, r24, r25, r26, r27, r28, r30, r20, r22, r29, r31, r36, r37, r38, r39, r110, (int) r1.getLong(r35), (int) r1.getLong(r40)));     // Catch: Throwable -> L51
        r14 = r17;
        r412 = r35;
        r2 = r111;
        r5 = r44;
        r0 = r413;
        r15 = r18;
        r4 = r113;
        r46 = r112;
        r16 = r40;
        r3 = r43;
        goto L4
    L48:
        r110 = r1.getText(r34);     // Catch: Throwable -> L51
        goto L47
    L44:
        r39 = r1.getText(r33);     // Catch: Throwable -> L51
        goto L43
    L39:
        r38 = r1.getText(r32);     // Catch: Throwable -> L51
        goto L38
    L34:
        r37 = r1.getText(r46);     // Catch: Throwable -> L51
        goto L33
    L29:
        r413 = r0;
        r36 = r1.getText(r17);     // Catch: Throwable -> L51
        goto L31
    L25:
        r27 = r1.getText(r7);     // Catch: Throwable -> L51
        goto L26
    L21:
        r26 = r1.getText(r6);     // Catch: Throwable -> L51
        goto L23
    L17:
        r25 = r1.getText(r5);     // Catch: Throwable -> L51
        goto L19
    L13:
        r24 = r1.getText(r4);     // Catch: Throwable -> L51
        goto L15
    L9:
        r23 = r1.getText(r3);     // Catch: Throwable -> L51
        goto L11
    L53:
        ArrayList r41 = r15;
        r1.close();
        return r41;
    L51:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iI1Xi());
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListDESC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OOI1IIIiI());
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListForDay() {
        return BloodGlucose2Dao.DefaultImpls.getListForDay(this);
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getTodayList() {
        return BloodGlucose2Dao.DefaultImpls.getTodayList(this);
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public long[] insert(final List<BloodGlucose2> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new XO1iI1(this, list));
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getList(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OO0X0OXO(start, end));
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListDESC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new IiiiX01IX(start, end));
    }

    @Override // com.sma.smartv3.db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListForDay(final long start, final long end) {
        return BloodGlucose2Dao.DefaultImpls.getListForDay(this, start, end);
    }
}
