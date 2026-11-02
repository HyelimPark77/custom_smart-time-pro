package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.IOX1;
import com.android.mltcode.paycertificationapi.O1i0;
import com.android.mltcode.paycertificationapi.OXI0Xi;
import com.android.mltcode.paycertificationapi.Oiii;
import com.android.mltcode.paycertificationapi.XIIIO;
import com.android.mltcode.paycertificationapi.XOOI0O;
import com.android.mltcode.paycertificationapi.i0O;
import com.android.mltcode.paycertificationapi.iX0iii0;
import com.sma.smartv3.db.entity.AIRecords;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class AIRecordsDao_Impl implements AIRecordsDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AIRecords> __insertAdapterOfAIRecords;
    private final EntityInsertAdapter<AIRecords> __insertAdapterOfAIRecords_1;
    private final EntityDeleteOrUpdateAdapter<AIRecords> __updateAdapterOfAIRecords;

    public AIRecordsDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfAIRecords = new AnonymousClass1(this);
        this.__insertAdapterOfAIRecords_1 = new AnonymousClass2(this);
        this.__updateAdapterOfAIRecords = new AnonymousClass3(this);
    }

    public static /* synthetic */ long[] I0IIOi(AIRecordsDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfAIRecords.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Integer IiI10X(AIRecordsDao_Impl r0, AIRecords r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfAIRecords.handle(r2, r1));
    }

    public static /* synthetic */ List O00(int r39, SQLiteConnection r40) {
        SQLiteStatement r1 = r40.prepare("SELECT * FROM airecords WHERE mAIFuncType = ? AND mIsDelete !=1 ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r39);     // Catch: Throwable -> L47
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L47
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L47
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L47
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAIFuncType");     // Catch: Throwable -> L47
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L47
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L47
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mExtraInfo");     // Catch: Throwable -> L47
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L47
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L47
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L47
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAITitle");     // Catch: Throwable -> L47
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateLanguage");     // Catch: Throwable -> L47
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateToLanguage");     // Catch: Throwable -> L47
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocation");     // Catch: Throwable -> L47
        int r310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioPath");     // Catch: Throwable -> L47
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioDuration");     // Catch: Throwable -> L47
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "ttsVoiceName");     // Catch: Throwable -> L47
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L47
    L4:
        if (r1.step() == false) goto L49;
        int r17 = r14;
        ArrayList r18 = r15;
        int r19 = (int) r1.getLong(r0);     // Catch: Throwable -> L47
        long r21 = r1.getLong(r2);     // Catch: Throwable -> L47
        String r110 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r23 = null;
    L10:
        int r20 = (int) r1.getLong(r4);     // Catch: Throwable -> L47
        int r22 = (int) r1.getLong(r5);     // Catch: Throwable -> L47
        if (r1.isNull(r6) == false) goto L13;
        String r26 = null;
    L15:
        if (r1.isNull(r7) == false) goto L18;
        String r27 = null;
    L19:
        int r24 = (int) r1.getLong(r8);     // Catch: Throwable -> L47
        int r25 = (int) r1.getLong(r9);     // Catch: Throwable -> L47
        int r28 = (int) r1.getLong(r10);     // Catch: Throwable -> L47
        if (r1.isNull(r11) == false) goto L22;
        String r31 = null;
    L24:
        if (r1.isNull(r12) == false) goto L26;
        String r32 = null;
    L28:
        if (r1.isNull(r13) == false) goto L31;
        String r33 = null;
    L33:
        if (r1.isNull(r17) == false) goto L35;
        int r311 = r0;
        String r34 = null;
    L37:
        if (r1.isNull(r310) == false) goto L40;
        String r35 = null;
    L39:
        int r29 = r41;
        int r30 = (int) r1.getLong(r29);     // Catch: Throwable -> L47
        int r36 = r16;
        if (r1.isNull(r36) == true) goto L45;
        r110 = r1.getText(r36);     // Catch: Throwable -> L47
    L45:
        r18.add(new AIRecords(r19, r21, r23, r20, r22, r26, r27, r24, r25, r28, r31, r32, r33, r34, r35, r30, r110));     // Catch: Throwable -> L47
        r16 = r36;
        r2 = r2;
        r3 = r3;
        r15 = r18;
        r14 = r17;
        r41 = r29;
        r0 = r311;
        r310 = r310;
        goto L4
    L40:
        r35 = r1.getText(r310);     // Catch: Throwable -> L47
        goto L39
    L35:
        r311 = r0;
        r34 = r1.getText(r17);     // Catch: Throwable -> L47
        goto L37
    L31:
        r33 = r1.getText(r13);     // Catch: Throwable -> L47
        goto L33
    L26:
        r32 = r1.getText(r12);     // Catch: Throwable -> L47
        goto L28
    L22:
        r31 = r1.getText(r11);     // Catch: Throwable -> L47
        goto L24
    L18:
        r27 = r1.getText(r7);     // Catch: Throwable -> L47
        goto L19
    L13:
        r26 = r1.getText(r6);     // Catch: Throwable -> L47
        goto L15
    L9:
        r23 = r1.getText(r3);     // Catch: Throwable -> L47
        goto L10
    L49:
        ArrayList r111 = r15;
        r1.close();
        return r111;
    L47:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r40) {
        SQLiteStatement r1 = r40.prepare("SELECT * FROM airecords WHERE  mIsSync = 0  ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L47
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L47
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L47
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAIFuncType");     // Catch: Throwable -> L47
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L47
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L47
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mExtraInfo");     // Catch: Throwable -> L47
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L47
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L47
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L47
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAITitle");     // Catch: Throwable -> L47
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateLanguage");     // Catch: Throwable -> L47
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateToLanguage");     // Catch: Throwable -> L47
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocation");     // Catch: Throwable -> L47
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioPath");     // Catch: Throwable -> L47
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioDuration");     // Catch: Throwable -> L47
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "ttsVoiceName");     // Catch: Throwable -> L47
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L47
    L4:
        if (r1.step() == false) goto L49;
        int r18 = r14;
        ArrayList r19 = r15;
        int r110 = (int) r1.getLong(r0);     // Catch: Throwable -> L47
        long r22 = r1.getLong(r2);     // Catch: Throwable -> L47
        String r20 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r24 = null;
    L10:
        int r21 = (int) r1.getLong(r4);     // Catch: Throwable -> L47
        int r23 = (int) r1.getLong(r5);     // Catch: Throwable -> L47
        if (r1.isNull(r6) == false) goto L13;
        String r27 = null;
    L15:
        if (r1.isNull(r7) == false) goto L18;
        String r28 = null;
    L19:
        int r25 = (int) r1.getLong(r8);     // Catch: Throwable -> L47
        int r26 = (int) r1.getLong(r9);     // Catch: Throwable -> L47
        int r29 = (int) r1.getLong(r10);     // Catch: Throwable -> L47
        if (r1.isNull(r11) == false) goto L22;
        String r32 = null;
    L24:
        if (r1.isNull(r12) == false) goto L26;
        String r33 = null;
    L28:
        if (r1.isNull(r13) == false) goto L31;
        String r34 = null;
    L33:
        if (r1.isNull(r18) == false) goto L35;
        int r42 = r0;
        String r35 = null;
    L37:
        if (r1.isNull(r41) == false) goto L40;
        int r30 = r16;
        String r36 = null;
    L41:
        int r31 = (int) r1.getLong(r30);     // Catch: Throwable -> L47
        int r37 = r17;
        if (r1.isNull(r37) == true) goto L45;
        r20 = r1.getText(r37);     // Catch: Throwable -> L47
    L45:
        r19.add(new AIRecords(r110, r22, r24, r21, r23, r27, r28, r25, r26, r29, r32, r33, r34, r35, r36, r31, r20));     // Catch: Throwable -> L47
        int r38 = r30;
        r0 = r42;
        r41 = r41;
        r16 = r38;
        r17 = r37;
        r2 = r2;
        r3 = r3;
        r15 = r19;
        r14 = r18;
        goto L4
    L40:
        r30 = r16;
        r36 = r1.getText(r41);     // Catch: Throwable -> L47
        goto L41
    L35:
        r42 = r0;
        r35 = r1.getText(r18);     // Catch: Throwable -> L47
        goto L37
    L31:
        r34 = r1.getText(r13);     // Catch: Throwable -> L47
        goto L33
    L26:
        r33 = r1.getText(r12);     // Catch: Throwable -> L47
        goto L28
    L22:
        r32 = r1.getText(r11);     // Catch: Throwable -> L47
        goto L24
    L18:
        r28 = r1.getText(r7);     // Catch: Throwable -> L47
        goto L19
    L13:
        r27 = r1.getText(r6);     // Catch: Throwable -> L47
        goto L15
    L9:
        r24 = r1.getText(r3);     // Catch: Throwable -> L47
        goto L10
    L49:
        ArrayList r111 = r15;
        r1.close();
        return r111;
    L47:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Long XIi00iiXO(AIRecordsDao_Impl r0, AIRecords r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfAIRecords_1.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Integer XO0O10(AIRecordsDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfAIRecords.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List XOO0ii0(int r39, SQLiteConnection r40) {
        SQLiteStatement r1 = r40.prepare("SELECT * FROM airecords WHERE mAIFuncType = ? AND mIsDelete !=1  ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r39);     // Catch: Throwable -> L47
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L47
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L47
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L47
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAIFuncType");     // Catch: Throwable -> L47
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L47
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L47
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mExtraInfo");     // Catch: Throwable -> L47
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L47
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L47
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L47
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAITitle");     // Catch: Throwable -> L47
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateLanguage");     // Catch: Throwable -> L47
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateToLanguage");     // Catch: Throwable -> L47
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocation");     // Catch: Throwable -> L47
        int r310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioPath");     // Catch: Throwable -> L47
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioDuration");     // Catch: Throwable -> L47
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "ttsVoiceName");     // Catch: Throwable -> L47
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L47
    L4:
        if (r1.step() == false) goto L49;
        int r17 = r14;
        ArrayList r18 = r15;
        int r19 = (int) r1.getLong(r0);     // Catch: Throwable -> L47
        long r21 = r1.getLong(r2);     // Catch: Throwable -> L47
        String r110 = null;
        if (r1.isNull(r3) == false) goto L9;
        String r23 = null;
    L10:
        int r20 = (int) r1.getLong(r4);     // Catch: Throwable -> L47
        int r22 = (int) r1.getLong(r5);     // Catch: Throwable -> L47
        if (r1.isNull(r6) == false) goto L13;
        String r26 = null;
    L15:
        if (r1.isNull(r7) == false) goto L18;
        String r27 = null;
    L19:
        int r24 = (int) r1.getLong(r8);     // Catch: Throwable -> L47
        int r25 = (int) r1.getLong(r9);     // Catch: Throwable -> L47
        int r28 = (int) r1.getLong(r10);     // Catch: Throwable -> L47
        if (r1.isNull(r11) == false) goto L22;
        String r31 = null;
    L24:
        if (r1.isNull(r12) == false) goto L26;
        String r32 = null;
    L28:
        if (r1.isNull(r13) == false) goto L31;
        String r33 = null;
    L33:
        if (r1.isNull(r17) == false) goto L35;
        int r311 = r0;
        String r34 = null;
    L37:
        if (r1.isNull(r310) == false) goto L40;
        String r35 = null;
    L39:
        int r29 = r41;
        int r30 = (int) r1.getLong(r29);     // Catch: Throwable -> L47
        int r36 = r16;
        if (r1.isNull(r36) == true) goto L45;
        r110 = r1.getText(r36);     // Catch: Throwable -> L47
    L45:
        r18.add(new AIRecords(r19, r21, r23, r20, r22, r26, r27, r24, r25, r28, r31, r32, r33, r34, r35, r30, r110));     // Catch: Throwable -> L47
        r16 = r36;
        r2 = r2;
        r3 = r3;
        r15 = r18;
        r14 = r17;
        r41 = r29;
        r0 = r311;
        r310 = r310;
        goto L4
    L40:
        r35 = r1.getText(r310);     // Catch: Throwable -> L47
        goto L39
    L35:
        r311 = r0;
        r34 = r1.getText(r17);     // Catch: Throwable -> L47
        goto L37
    L31:
        r33 = r1.getText(r13);     // Catch: Throwable -> L47
        goto L33
    L26:
        r32 = r1.getText(r12);     // Catch: Throwable -> L47
        goto L28
    L22:
        r31 = r1.getText(r11);     // Catch: Throwable -> L47
        goto L24
    L18:
        r27 = r1.getText(r7);     // Catch: Throwable -> L47
        goto L19
    L13:
        r26 = r1.getText(r6);     // Catch: Throwable -> L47
        goto L15
    L9:
        r23 = r1.getText(r3);     // Catch: Throwable -> L47
        goto L10
    L49:
        ArrayList r111 = r15;
        r1.close();
        return r111;
    L47:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ AIRecords iO(long r37, SQLiteConnection r39) {
        SQLiteStatement r1 = r39.prepare("SELECT * FROM airecords WHERE  mId = ?");
        r1.mo3338bindLong(1, r37);     // Catch: Throwable -> L46
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L46
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L46
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L46
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAIFuncType");     // Catch: Throwable -> L46
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L46
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L46
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mExtraInfo");     // Catch: Throwable -> L46
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStatus");     // Catch: Throwable -> L46
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L46
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L46
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAITitle");     // Catch: Throwable -> L46
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateLanguage");     // Catch: Throwable -> L46
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTranslateToLanguage");     // Catch: Throwable -> L46
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocation");     // Catch: Throwable -> L46
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioPath");     // Catch: Throwable -> L46
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAudioDuration");     // Catch: Throwable -> L46
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "ttsVoiceName");     // Catch: Throwable -> L46
        AIRecords r18 = null;
        String r19 = null;
        if (r1.step() == false) goto L48;
        int r20 = (int) r1.getLong(r0);     // Catch: Throwable -> L46
        long r21 = r1.getLong(r2);     // Catch: Throwable -> L46
        if (r1.isNull(r3) == false) goto L8;
        String r22 = null;
    L9:
        int r23 = (int) r1.getLong(r4);     // Catch: Throwable -> L46
        int r24 = (int) r1.getLong(r5);     // Catch: Throwable -> L46
        if (r1.isNull(r6) == false) goto L12;
        String r25 = null;
    L14:
        if (r1.isNull(r7) == false) goto L16;
        String r26 = null;
    L17:
        int r27 = (int) r1.getLong(r8);     // Catch: Throwable -> L46
        int r28 = (int) r1.getLong(r9);     // Catch: Throwable -> L46
        int r29 = (int) r1.getLong(r10);     // Catch: Throwable -> L46
        if (r1.isNull(r11) == false) goto L20;
        String r30 = null;
    L22:
        if (r1.isNull(r12) == false) goto L24;
        String r31 = null;
    L26:
        if (r1.isNull(r13) == false) goto L29;
        String r32 = null;
    L31:
        if (r1.isNull(r14) == false) goto L34;
        String r33 = null;
    L36:
        if (r1.isNull(r15) == false) goto L39;
        String r34 = null;
    L40:
        int r35 = (int) r1.getLong(r16);     // Catch: Throwable -> L46
        if (r1.isNull(r17) == true) goto L44;
        r19 = r1.getText(r17);     // Catch: Throwable -> L46
    L44:
        r18 = new AIRecords(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r19);     // Catch: Throwable -> L46
        goto L48
    L39:
        r34 = r1.getText(r15);     // Catch: Throwable -> L46
        goto L40
    L34:
        r33 = r1.getText(r14);     // Catch: Throwable -> L46
        goto L36
    L29:
        r32 = r1.getText(r13);     // Catch: Throwable -> L46
        goto L31
    L24:
        r31 = r1.getText(r12);     // Catch: Throwable -> L46
        goto L26
    L20:
        r30 = r1.getText(r11);     // Catch: Throwable -> L46
        goto L22
    L16:
        r26 = r1.getText(r7);     // Catch: Throwable -> L46
        goto L17
    L12:
        r25 = r1.getText(r6);     // Catch: Throwable -> L46
        goto L14
    L8:
        r22 = r1.getText(r3);     // Catch: Throwable -> L46
    L48:
        r1.close();
        return r18;
    L46:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public AIRecords getAIRecord(final long id) {
        return (AIRecords) DBUtil.performBlocking(this.__db, true, false, new O1i0(id));
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public List<AIRecords> getListASC(final int type) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new IOX1(type));
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public List<AIRecords> getListDESC(final int type) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Oiii(type));
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public long[] insert(final List<AIRecords> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new iX0iii0(this, list));
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public int update(final List<AIRecords> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new XOOI0O(this, lists))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public List<AIRecords> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OXI0Xi());
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public long insert(final AIRecords mAIRecords) {
        mAIRecords.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new XIIIO(this, mAIRecords))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.AIRecordsDao
    public int update(final AIRecords aiRecords) {
        aiRecords.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new i0O(this, aiRecords))).intValue();
    }
}
