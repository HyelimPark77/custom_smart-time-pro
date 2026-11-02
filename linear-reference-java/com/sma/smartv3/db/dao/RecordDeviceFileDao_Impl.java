package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.cc3;
import com.android.mltcode.paycertificationapi.dc3;
import com.android.mltcode.paycertificationapi.ec3;
import com.android.mltcode.paycertificationapi.fc3;
import com.android.mltcode.paycertificationapi.gc3;
import com.android.mltcode.paycertificationapi.hc3;
import com.android.mltcode.paycertificationapi.ic3;
import com.android.mltcode.paycertificationapi.jc3;
import com.android.mltcode.paycertificationapi.kc3;
import com.android.mltcode.paycertificationapi.lc3;
import com.android.mltcode.paycertificationapi.mc3;
import com.sma.smartv3.db.entity.RecordDeviceFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDeviceFileDao_Impl implements RecordDeviceFileDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceFile> __deleteAdapterOfRecordDeviceFile;
    private final EntityInsertAdapter<RecordDeviceFile> __insertAdapterOfRecordDeviceFile;
    private final EntityDeleteOrUpdateAdapter<RecordDeviceFile> __updateAdapterOfRecordDeviceFile;

    public RecordDeviceFileDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfRecordDeviceFile = new AnonymousClass1(this);
        this.__deleteAdapterOfRecordDeviceFile = new AnonymousClass2(this);
        this.__updateAdapterOfRecordDeviceFile = new AnonymousClass3(this);
    }

    public static /* synthetic */ RecordDeviceFile I0IIOi(long r29, SQLiteConnection r31) {
        SQLiteStatement r1 = r31.prepare("SELECT * FROM RecordDeviceFile WHERE mId = ?");
        r1.mo3338bindLong(1, r29);     // Catch: Throwable -> L47
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L47
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L47
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L47
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L47
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L47
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L47
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L47
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L47
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L47
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L47
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L47
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L47
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L47
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L47
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L47
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L47
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L47
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L47
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L47
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L47
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L47
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L47
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L47
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L47
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L47
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L47
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L47
        RecordDeviceFile r26 = null;
        String r27 = null;
        if (r1.step() == false) goto L49;
        RecordDeviceFile r118 = new RecordDeviceFile();     // Catch: Throwable -> L47
        r118.setMId(r1.getLong(r0));     // Catch: Throwable -> L47
        r118.setMTime(r1.getLong(r2));     // Catch: Throwable -> L47
        if (r1.isNull(r3) == false) goto L8;
        String r20 = null;
    L9:
        r118.setMLocalTime(r20);     // Catch: Throwable -> L47
        if (r1.isNull(r4) == false) goto L12;
        String r21 = null;
    L13:
        r118.setMName(r21);     // Catch: Throwable -> L47
        if (r1.isNull(r5) == false) goto L16;
        String r22 = null;
    L17:
        r118.setMPath(r22);     // Catch: Throwable -> L47
        r118.setMSize(r1.getLong(r6));     // Catch: Throwable -> L47
        r118.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L47
        r118.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L47
        r118.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L47
        if (r1.isNull(r10) == false) goto L20;
        String r23 = null;
    L21:
        r118.setMThumbnail(r23);     // Catch: Throwable -> L47
        r118.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L47
        r118.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L47
        if (r1.isNull(r13) == false) goto L24;
        String r24 = null;
    L25:
        r118.setMContent(r24);     // Catch: Throwable -> L47
        r118.setMIsSync((int) r1.getLong(r14));     // Catch: Throwable -> L47
        r118.setMIsDelete((int) r1.getLong(r15));     // Catch: Throwable -> L47
        r118.setMProcessType((int) r1.getLong(r16));     // Catch: Throwable -> L47
        r118.setMProcessStatus((int) r1.getLong(r17));     // Catch: Throwable -> L47
        if (r1.isNull(r18) == false) goto L28;
        String r25 = null;
    L29:
        r118.setMProcessPath(r25);     // Catch: Throwable -> L47
        r118.setMIsRead((int) r1.getLong(r19));     // Catch: Throwable -> L47
        r118.setMIsConversion((int) r1.getLong(r110));     // Catch: Throwable -> L47
        r118.setMReservedTextType((int) r1.getLong(r111));     // Catch: Throwable -> L47
        if (r1.isNull(r112) == false) goto L32;
        String r28 = null;
    L33:
        r118.setMReservedText(r28);     // Catch: Throwable -> L47
        r118.setMIsSummaryReport((int) r1.getLong(r113));     // Catch: Throwable -> L47
        if (r1.isNull(r114) == false) goto L36;
        String r30 = null;
    L37:
        r118.setMSummaryReportText(r30);     // Catch: Throwable -> L47
        if (r1.isNull(r115) == false) goto L40;
        String r32 = null;
    L41:
        r118.setMFileName(r32);     // Catch: Throwable -> L47
        if (r1.isNull(r116) == true) goto L45;
        r27 = r1.getText(r116);     // Catch: Throwable -> L47
    L45:
        r118.setMTaskId(r27);     // Catch: Throwable -> L47
        r118.setMModel((int) r1.getLong(r117));     // Catch: Throwable -> L47
        r26 = r118;
        goto L49
    L40:
        r32 = r1.getText(r115);     // Catch: Throwable -> L47
        goto L41
    L36:
        r30 = r1.getText(r114);     // Catch: Throwable -> L47
        goto L37
    L32:
        r28 = r1.getText(r112);     // Catch: Throwable -> L47
        goto L33
    L28:
        r25 = r1.getText(r18);     // Catch: Throwable -> L47
        goto L29
    L24:
        r24 = r1.getText(r13);     // Catch: Throwable -> L47
        goto L25
    L20:
        r23 = r1.getText(r10);     // Catch: Throwable -> L47
        goto L21
    L16:
        r22 = r1.getText(r5);     // Catch: Throwable -> L47
        goto L17
    L12:
        r21 = r1.getText(r4);     // Catch: Throwable -> L47
        goto L13
    L8:
        r20 = r1.getText(r3);     // Catch: Throwable -> L47
    L49:
        r1.close();
        return r26;
    L47:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] IO(RecordDeviceFileDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfRecordDeviceFile.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Object IiI10X(RecordDeviceFileDao_Impl r0, List r1, SQLiteConnection r2) {
        r0.__deleteAdapterOfRecordDeviceFile.handleMultiple(r2, r1);
        return null;
    }

    public static /* synthetic */ List O00(SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 4 OR mFileType == 5 ORDER BY mTime DESC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L48
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L48
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L48
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L48
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L48
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L48
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L48
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        ArrayList r28 = r15;
        RecordDeviceFile r110 = new RecordDeviceFile();     // Catch: Throwable -> L48
        int r29 = r13;
        int r30 = r14;
        r110.setMId(r1.getLong(r0));     // Catch: Throwable -> L48
        r110.setMTime(r1.getLong(r2));     // Catch: Throwable -> L48
        if (r1.isNull(r3) == false) goto L9;
        String r111 = null;
    L10:
        r110.setMLocalTime(r111);     // Catch: Throwable -> L48
        if (r1.isNull(r4) == false) goto L13;
        String r112 = null;
    L14:
        r110.setMName(r112);     // Catch: Throwable -> L48
        if (r1.isNull(r5) == false) goto L17;
        String r113 = null;
    L18:
        r110.setMPath(r113);     // Catch: Throwable -> L48
        int r114 = r2;
        int r31 = r3;
        r110.setMSize(r1.getLong(r6));     // Catch: Throwable -> L48
        r110.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L48
        r110.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L48
        r110.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L48
        if (r1.isNull(r10) == false) goto L21;
        String r34 = null;
    L22:
        r110.setMThumbnail(r34);     // Catch: Throwable -> L48
        r110.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L48
        r110.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L48
        if (r1.isNull(r29) == false) goto L25;
        String r35 = null;
    L26:
        r110.setMContent(r35);     // Catch: Throwable -> L48
        r110.setMIsSync((int) r1.getLong(r30));     // Catch: Throwable -> L48
        int r115 = r33;
        r110.setMIsDelete((int) r1.getLong(r115));     // Catch: Throwable -> L48
        int r36 = r16;
        int r116 = r4;
        r110.setMProcessType((int) r1.getLong(r36));     // Catch: Throwable -> L48
        int r37 = r17;
        int r117 = r5;
        r110.setMProcessStatus((int) r1.getLong(r37));     // Catch: Throwable -> L48
        int r38 = r18;
        if (r1.isNull(r38) == false) goto L29;
        String r39 = null;
    L30:
        r110.setMProcessPath(r39);     // Catch: Throwable -> L48
        int r40 = r19;
        r110.setMIsRead((int) r1.getLong(r40));     // Catch: Throwable -> L48
        int r41 = r20;
        r110.setMIsConversion((int) r1.getLong(r41));     // Catch: Throwable -> L48
        int r42 = r21;
        r110.setMReservedTextType((int) r1.getLong(r42));     // Catch: Throwable -> L48
        int r43 = r22;
        if (r1.isNull(r43) == false) goto L33;
        String r44 = null;
    L34:
        r110.setMReservedText(r44);     // Catch: Throwable -> L48
        int r45 = r23;
        r110.setMIsSummaryReport((int) r1.getLong(r45));     // Catch: Throwable -> L48
        int r46 = r24;
        if (r1.isNull(r46) == false) goto L37;
        String r47 = null;
    L38:
        r110.setMSummaryReportText(r47);     // Catch: Throwable -> L48
        int r48 = r25;
        if (r1.isNull(r48) == false) goto L41;
        String r49 = null;
    L42:
        r110.setMFileName(r49);     // Catch: Throwable -> L48
        r26 = r26;
        if (r1.isNull(r26) == false) goto L45;
        String r50 = null;
    L46:
        r110.setMTaskId(r50);     // Catch: Throwable -> L48
        r24 = r46;
        int r51 = r27;
        r110.setMModel((int) r1.getLong(r51));     // Catch: Throwable -> L48
        r28.add(r110);     // Catch: Throwable -> L48
        r14 = r30;
        r33 = r115;
        r27 = r51;
        r0 = r0;
        r25 = r48;
        r22 = r43;
        r4 = r116;
        r16 = r36;
        r18 = r38;
        r20 = r41;
        r23 = r45;
        r5 = r117;
        r17 = r37;
        r19 = r40;
        r21 = r42;
        r15 = r28;
        r2 = r114;
        r13 = r29;
        r3 = r31;
        goto L4
    L45:
        r50 = r1.getText(r26);     // Catch: Throwable -> L48
        goto L46
    L41:
        r49 = r1.getText(r48);     // Catch: Throwable -> L48
        goto L42
    L37:
        r47 = r1.getText(r46);     // Catch: Throwable -> L48
        goto L38
    L33:
        r44 = r1.getText(r43);     // Catch: Throwable -> L48
        goto L34
    L29:
        r39 = r1.getText(r38);     // Catch: Throwable -> L48
        goto L30
    L25:
        r35 = r1.getText(r29);     // Catch: Throwable -> L48
        goto L26
    L21:
        r34 = r1.getText(r10);     // Catch: Throwable -> L48
        goto L22
    L17:
        r113 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L18
    L13:
        r112 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L14
    L9:
        r111 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L10
    L50:
        ArrayList r52 = r15;
        r1.close();
        return r52;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Object OIX0iXi(SQLiteConnection r1) {
        SQLiteStatement r2 = r1.prepare("DELETE FROM RecordDeviceFile");
        r2.step();     // Catch: Throwable -> L6
        r2.close();
        return null;
    L6:
        th = move-exception;
        r2.close();
        throw th;
    }

    public static /* synthetic */ List OIi0(String r31, SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("\n        SELECT * FROM RecordDeviceFile \n        WHERE LOWER(mName) LIKE '%.aac' \n        AND SUBSTR(mName, 1, LENGTH(mName) - 4) LIKE '%' || ? || '%' COLLATE NOCASE \n        ORDER BY mTime DESC\n        ");
        if (r31 != null) goto L7;
        r1.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L5
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L5
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L5
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L5
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L5
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L5
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L5
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L5
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L5
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L5
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L5
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L5
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L5
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L5
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L5
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L5
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L5
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L5
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L5
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L5
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L5
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L5
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L5
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L5
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L5
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L5
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L5
    L9:
        if (r1.step() == false) goto L53;
        ArrayList r27 = r15;
        RecordDeviceFile r110 = new RecordDeviceFile();     // Catch: Throwable -> L5
        int r28 = r13;
        int r29 = r14;
        r110.setMId(r1.getLong(r0));     // Catch: Throwable -> L5
        r110.setMTime(r1.getLong(r2));     // Catch: Throwable -> L5
        if (r1.isNull(r3) == false) goto L14;
        String r111 = null;
    L15:
        r110.setMLocalTime(r111);     // Catch: Throwable -> L5
        if (r1.isNull(r4) == false) goto L18;
        String r112 = null;
    L19:
        r110.setMName(r112);     // Catch: Throwable -> L5
        if (r1.isNull(r5) == false) goto L22;
        String r113 = null;
    L23:
        r110.setMPath(r113);     // Catch: Throwable -> L5
        int r114 = r2;
        int r30 = r3;
        r110.setMSize(r1.getLong(r6));     // Catch: Throwable -> L5
        r110.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L5
        r110.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L5
        r110.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L5
        if (r1.isNull(r10) == false) goto L26;
        String r35 = null;
    L27:
        r110.setMThumbnail(r35);     // Catch: Throwable -> L5
        r110.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L5
        r110.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L5
        if (r1.isNull(r28) == false) goto L30;
        String r36 = null;
    L31:
        r110.setMContent(r36);     // Catch: Throwable -> L5
        r110.setMIsSync((int) r1.getLong(r29));     // Catch: Throwable -> L5
        int r115 = r33;
        r110.setMIsDelete((int) r1.getLong(r115));     // Catch: Throwable -> L5
        int r37 = r34;
        int r38 = r4;
        r110.setMProcessType((int) r1.getLong(r37));     // Catch: Throwable -> L5
        int r39 = r16;
        int r116 = r5;
        r110.setMProcessStatus((int) r1.getLong(r39));     // Catch: Throwable -> L5
        int r40 = r17;
        if (r1.isNull(r40) == false) goto L34;
        String r41 = null;
    L35:
        r110.setMProcessPath(r41);     // Catch: Throwable -> L5
        int r42 = r18;
        r110.setMIsRead((int) r1.getLong(r42));     // Catch: Throwable -> L5
        int r43 = r19;
        r110.setMIsConversion((int) r1.getLong(r43));     // Catch: Throwable -> L5
        int r44 = r20;
        r110.setMReservedTextType((int) r1.getLong(r44));     // Catch: Throwable -> L5
        int r45 = r21;
        if (r1.isNull(r45) == false) goto L38;
        String r46 = null;
    L39:
        r110.setMReservedText(r46);     // Catch: Throwable -> L5
        int r47 = r22;
        r110.setMIsSummaryReport((int) r1.getLong(r47));     // Catch: Throwable -> L5
        int r48 = r23;
        if (r1.isNull(r48) == false) goto L42;
        String r49 = null;
    L43:
        r110.setMSummaryReportText(r49);     // Catch: Throwable -> L5
        int r50 = r24;
        if (r1.isNull(r50) == false) goto L46;
        String r51 = null;
    L47:
        r110.setMFileName(r51);     // Catch: Throwable -> L5
        r25 = r25;
        if (r1.isNull(r25) == false) goto L50;
        String r52 = null;
    L51:
        r110.setMTaskId(r52);     // Catch: Throwable -> L5
        r23 = r48;
        int r53 = r26;
        r110.setMModel((int) r1.getLong(r53));     // Catch: Throwable -> L5
        r27.add(r110);     // Catch: Throwable -> L5
        r14 = r29;
        r33 = r115;
        r4 = r38;
        r34 = r37;
        r17 = r40;
        r19 = r43;
        r21 = r45;
        r26 = r53;
        r0 = r0;
        r24 = r50;
        r22 = r47;
        r5 = r116;
        r16 = r39;
        r18 = r42;
        r20 = r44;
        r15 = r27;
        r2 = r114;
        r13 = r28;
        r3 = r30;
        goto L9
    L50:
        r52 = r1.getText(r25);     // Catch: Throwable -> L5
        goto L51
    L46:
        r51 = r1.getText(r50);     // Catch: Throwable -> L5
        goto L47
    L42:
        r49 = r1.getText(r48);     // Catch: Throwable -> L5
        goto L43
    L38:
        r46 = r1.getText(r45);     // Catch: Throwable -> L5
        goto L39
    L34:
        r41 = r1.getText(r40);     // Catch: Throwable -> L5
        goto L35
    L30:
        r36 = r1.getText(r28);     // Catch: Throwable -> L5
        goto L31
    L26:
        r35 = r1.getText(r10);     // Catch: Throwable -> L5
        goto L27
    L22:
        r113 = r1.getText(r5);     // Catch: Throwable -> L5
        goto L23
    L18:
        r112 = r1.getText(r4);     // Catch: Throwable -> L5
        goto L19
    L14:
        r111 = r1.getText(r3);     // Catch: Throwable -> L5
        goto L15
    L53:
        ArrayList r54 = r15;
        r1.close();
        return r54;
    L7:
        r1.mo3340bindText(1, r31);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Object OXO1(long r1, SQLiteConnection r3) {
        SQLiteStatement r4 = r3.prepare("DELETE FROM RecordDeviceFile WHERE mId = ?");
        r4.mo3338bindLong(1, r1);     // Catch: Throwable -> L6
        r4.step();     // Catch: Throwable -> L6
        r4.close();
        return null;
    L6:
        th = move-exception;
        r4.close();
        throw th;
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM RecordDeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L48
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L48
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L48
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L48
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L48
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L48
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L48
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        ArrayList r28 = r15;
        RecordDeviceFile r110 = new RecordDeviceFile();     // Catch: Throwable -> L48
        int r29 = r13;
        int r30 = r14;
        r110.setMId(r1.getLong(r0));     // Catch: Throwable -> L48
        r110.setMTime(r1.getLong(r2));     // Catch: Throwable -> L48
        if (r1.isNull(r3) == false) goto L9;
        String r111 = null;
    L10:
        r110.setMLocalTime(r111);     // Catch: Throwable -> L48
        if (r1.isNull(r4) == false) goto L13;
        String r112 = null;
    L14:
        r110.setMName(r112);     // Catch: Throwable -> L48
        if (r1.isNull(r5) == false) goto L17;
        String r113 = null;
    L18:
        r110.setMPath(r113);     // Catch: Throwable -> L48
        int r114 = r2;
        int r31 = r3;
        r110.setMSize(r1.getLong(r6));     // Catch: Throwable -> L48
        r110.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L48
        r110.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L48
        r110.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L48
        if (r1.isNull(r10) == false) goto L21;
        String r34 = null;
    L22:
        r110.setMThumbnail(r34);     // Catch: Throwable -> L48
        r110.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L48
        r110.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L48
        if (r1.isNull(r29) == false) goto L25;
        String r35 = null;
    L26:
        r110.setMContent(r35);     // Catch: Throwable -> L48
        r110.setMIsSync((int) r1.getLong(r30));     // Catch: Throwable -> L48
        int r115 = r33;
        r110.setMIsDelete((int) r1.getLong(r115));     // Catch: Throwable -> L48
        int r36 = r16;
        int r116 = r4;
        r110.setMProcessType((int) r1.getLong(r36));     // Catch: Throwable -> L48
        int r37 = r17;
        int r117 = r5;
        r110.setMProcessStatus((int) r1.getLong(r37));     // Catch: Throwable -> L48
        int r38 = r18;
        if (r1.isNull(r38) == false) goto L29;
        String r39 = null;
    L30:
        r110.setMProcessPath(r39);     // Catch: Throwable -> L48
        int r40 = r19;
        r110.setMIsRead((int) r1.getLong(r40));     // Catch: Throwable -> L48
        int r41 = r20;
        r110.setMIsConversion((int) r1.getLong(r41));     // Catch: Throwable -> L48
        int r42 = r21;
        r110.setMReservedTextType((int) r1.getLong(r42));     // Catch: Throwable -> L48
        int r43 = r22;
        if (r1.isNull(r43) == false) goto L33;
        String r44 = null;
    L34:
        r110.setMReservedText(r44);     // Catch: Throwable -> L48
        int r45 = r23;
        r110.setMIsSummaryReport((int) r1.getLong(r45));     // Catch: Throwable -> L48
        int r46 = r24;
        if (r1.isNull(r46) == false) goto L37;
        String r47 = null;
    L38:
        r110.setMSummaryReportText(r47);     // Catch: Throwable -> L48
        int r48 = r25;
        if (r1.isNull(r48) == false) goto L41;
        String r49 = null;
    L42:
        r110.setMFileName(r49);     // Catch: Throwable -> L48
        r26 = r26;
        if (r1.isNull(r26) == false) goto L45;
        String r50 = null;
    L46:
        r110.setMTaskId(r50);     // Catch: Throwable -> L48
        r24 = r46;
        int r51 = r27;
        r110.setMModel((int) r1.getLong(r51));     // Catch: Throwable -> L48
        r28.add(r110);     // Catch: Throwable -> L48
        r14 = r30;
        r33 = r115;
        r27 = r51;
        r0 = r0;
        r25 = r48;
        r22 = r43;
        r4 = r116;
        r16 = r36;
        r18 = r38;
        r20 = r41;
        r23 = r45;
        r5 = r117;
        r17 = r37;
        r19 = r40;
        r21 = r42;
        r15 = r28;
        r2 = r114;
        r13 = r29;
        r3 = r31;
        goto L4
    L45:
        r50 = r1.getText(r26);     // Catch: Throwable -> L48
        goto L46
    L41:
        r49 = r1.getText(r48);     // Catch: Throwable -> L48
        goto L42
    L37:
        r47 = r1.getText(r46);     // Catch: Throwable -> L48
        goto L38
    L33:
        r44 = r1.getText(r43);     // Catch: Throwable -> L48
        goto L34
    L29:
        r39 = r1.getText(r38);     // Catch: Throwable -> L48
        goto L30
    L25:
        r35 = r1.getText(r29);     // Catch: Throwable -> L48
        goto L26
    L21:
        r34 = r1.getText(r10);     // Catch: Throwable -> L48
        goto L22
    L17:
        r113 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L18
    L13:
        r112 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L14
    L9:
        r111 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L10
    L50:
        ArrayList r52 = r15;
        r1.close();
        return r52;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XO0O10(SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 5 ORDER BY mTime DESC");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L48
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L48
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L48
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L48
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L48
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L48
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L48
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        ArrayList r28 = r15;
        RecordDeviceFile r110 = new RecordDeviceFile();     // Catch: Throwable -> L48
        int r29 = r13;
        int r30 = r14;
        r110.setMId(r1.getLong(r0));     // Catch: Throwable -> L48
        r110.setMTime(r1.getLong(r2));     // Catch: Throwable -> L48
        if (r1.isNull(r3) == false) goto L9;
        String r111 = null;
    L10:
        r110.setMLocalTime(r111);     // Catch: Throwable -> L48
        if (r1.isNull(r4) == false) goto L13;
        String r112 = null;
    L14:
        r110.setMName(r112);     // Catch: Throwable -> L48
        if (r1.isNull(r5) == false) goto L17;
        String r113 = null;
    L18:
        r110.setMPath(r113);     // Catch: Throwable -> L48
        int r114 = r2;
        int r31 = r3;
        r110.setMSize(r1.getLong(r6));     // Catch: Throwable -> L48
        r110.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L48
        r110.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L48
        r110.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L48
        if (r1.isNull(r10) == false) goto L21;
        String r34 = null;
    L22:
        r110.setMThumbnail(r34);     // Catch: Throwable -> L48
        r110.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L48
        r110.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L48
        if (r1.isNull(r29) == false) goto L25;
        String r35 = null;
    L26:
        r110.setMContent(r35);     // Catch: Throwable -> L48
        r110.setMIsSync((int) r1.getLong(r30));     // Catch: Throwable -> L48
        int r115 = r33;
        r110.setMIsDelete((int) r1.getLong(r115));     // Catch: Throwable -> L48
        int r36 = r16;
        int r116 = r4;
        r110.setMProcessType((int) r1.getLong(r36));     // Catch: Throwable -> L48
        int r37 = r17;
        int r117 = r5;
        r110.setMProcessStatus((int) r1.getLong(r37));     // Catch: Throwable -> L48
        int r38 = r18;
        if (r1.isNull(r38) == false) goto L29;
        String r39 = null;
    L30:
        r110.setMProcessPath(r39);     // Catch: Throwable -> L48
        int r40 = r19;
        r110.setMIsRead((int) r1.getLong(r40));     // Catch: Throwable -> L48
        int r41 = r20;
        r110.setMIsConversion((int) r1.getLong(r41));     // Catch: Throwable -> L48
        int r42 = r21;
        r110.setMReservedTextType((int) r1.getLong(r42));     // Catch: Throwable -> L48
        int r43 = r22;
        if (r1.isNull(r43) == false) goto L33;
        String r44 = null;
    L34:
        r110.setMReservedText(r44);     // Catch: Throwable -> L48
        int r45 = r23;
        r110.setMIsSummaryReport((int) r1.getLong(r45));     // Catch: Throwable -> L48
        int r46 = r24;
        if (r1.isNull(r46) == false) goto L37;
        String r47 = null;
    L38:
        r110.setMSummaryReportText(r47);     // Catch: Throwable -> L48
        int r48 = r25;
        if (r1.isNull(r48) == false) goto L41;
        String r49 = null;
    L42:
        r110.setMFileName(r49);     // Catch: Throwable -> L48
        r26 = r26;
        if (r1.isNull(r26) == false) goto L45;
        String r50 = null;
    L46:
        r110.setMTaskId(r50);     // Catch: Throwable -> L48
        r24 = r46;
        int r51 = r27;
        r110.setMModel((int) r1.getLong(r51));     // Catch: Throwable -> L48
        r28.add(r110);     // Catch: Throwable -> L48
        r14 = r30;
        r33 = r115;
        r27 = r51;
        r0 = r0;
        r25 = r48;
        r22 = r43;
        r4 = r116;
        r16 = r36;
        r18 = r38;
        r20 = r41;
        r23 = r45;
        r5 = r117;
        r17 = r37;
        r19 = r40;
        r21 = r42;
        r15 = r28;
        r2 = r114;
        r13 = r29;
        r3 = r31;
        goto L4
    L45:
        r50 = r1.getText(r26);     // Catch: Throwable -> L48
        goto L46
    L41:
        r49 = r1.getText(r48);     // Catch: Throwable -> L48
        goto L42
    L37:
        r47 = r1.getText(r46);     // Catch: Throwable -> L48
        goto L38
    L33:
        r44 = r1.getText(r43);     // Catch: Throwable -> L48
        goto L34
    L29:
        r39 = r1.getText(r38);     // Catch: Throwable -> L48
        goto L30
    L25:
        r35 = r1.getText(r29);     // Catch: Throwable -> L48
        goto L26
    L21:
        r34 = r1.getText(r10);     // Catch: Throwable -> L48
        goto L22
    L17:
        r113 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L18
    L13:
        r112 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L14
    L9:
        r111 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L10
    L50:
        ArrayList r52 = r15;
        r1.close();
        return r52;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XOO0ii0(int r31, SQLiteConnection r32) {
        SQLiteStatement r1 = r32.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == ? ORDER BY mTime DESC");
        r1.mo3338bindLong(1, r31);     // Catch: Throwable -> L48
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L48
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L48
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L48
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mName");     // Catch: Throwable -> L48
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPath");     // Catch: Throwable -> L48
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSize");     // Catch: Throwable -> L48
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWidth");     // Catch: Throwable -> L48
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeight");     // Catch: Throwable -> L48
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L48
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mThumbnail");     // Catch: Throwable -> L48
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileType");     // Catch: Throwable -> L48
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsFavority");     // Catch: Throwable -> L48
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mContent");     // Catch: Throwable -> L48
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L48
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L48
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessType");     // Catch: Throwable -> L48
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessStatus");     // Catch: Throwable -> L48
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mProcessPath");     // Catch: Throwable -> L48
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsRead");     // Catch: Throwable -> L48
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsConversion");     // Catch: Throwable -> L48
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedTextType");     // Catch: Throwable -> L48
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mReservedText");     // Catch: Throwable -> L48
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSummaryReport");     // Catch: Throwable -> L48
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSummaryReportText");     // Catch: Throwable -> L48
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFileName");     // Catch: Throwable -> L48
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTaskId");     // Catch: Throwable -> L48
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mModel");     // Catch: Throwable -> L48
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L48
    L4:
        if (r1.step() == false) goto L50;
        ArrayList r27 = r15;
        RecordDeviceFile r110 = new RecordDeviceFile();     // Catch: Throwable -> L48
        int r28 = r13;
        int r29 = r14;
        r110.setMId(r1.getLong(r0));     // Catch: Throwable -> L48
        r110.setMTime(r1.getLong(r2));     // Catch: Throwable -> L48
        if (r1.isNull(r3) == false) goto L9;
        String r111 = null;
    L10:
        r110.setMLocalTime(r111);     // Catch: Throwable -> L48
        if (r1.isNull(r4) == false) goto L13;
        String r112 = null;
    L14:
        r110.setMName(r112);     // Catch: Throwable -> L48
        if (r1.isNull(r5) == false) goto L17;
        String r113 = null;
    L18:
        r110.setMPath(r113);     // Catch: Throwable -> L48
        int r114 = r2;
        int r30 = r3;
        r110.setMSize(r1.getLong(r6));     // Catch: Throwable -> L48
        r110.setMWidth((int) r1.getLong(r7));     // Catch: Throwable -> L48
        r110.setMHeight((int) r1.getLong(r8));     // Catch: Throwable -> L48
        r110.setMDuration(r1.getLong(r9));     // Catch: Throwable -> L48
        if (r1.isNull(r10) == false) goto L21;
        String r35 = null;
    L22:
        r110.setMThumbnail(r35);     // Catch: Throwable -> L48
        r110.setMFileType((int) r1.getLong(r11));     // Catch: Throwable -> L48
        r110.setMIsFavority((int) r1.getLong(r12));     // Catch: Throwable -> L48
        if (r1.isNull(r28) == false) goto L25;
        String r36 = null;
    L26:
        r110.setMContent(r36);     // Catch: Throwable -> L48
        r110.setMIsSync((int) r1.getLong(r29));     // Catch: Throwable -> L48
        int r115 = r33;
        r110.setMIsDelete((int) r1.getLong(r115));     // Catch: Throwable -> L48
        int r37 = r34;
        int r38 = r4;
        r110.setMProcessType((int) r1.getLong(r37));     // Catch: Throwable -> L48
        int r39 = r16;
        int r116 = r5;
        r110.setMProcessStatus((int) r1.getLong(r39));     // Catch: Throwable -> L48
        int r40 = r17;
        if (r1.isNull(r40) == false) goto L29;
        String r41 = null;
    L30:
        r110.setMProcessPath(r41);     // Catch: Throwable -> L48
        int r42 = r18;
        r110.setMIsRead((int) r1.getLong(r42));     // Catch: Throwable -> L48
        int r43 = r19;
        r110.setMIsConversion((int) r1.getLong(r43));     // Catch: Throwable -> L48
        int r44 = r20;
        r110.setMReservedTextType((int) r1.getLong(r44));     // Catch: Throwable -> L48
        int r45 = r21;
        if (r1.isNull(r45) == false) goto L33;
        String r46 = null;
    L34:
        r110.setMReservedText(r46);     // Catch: Throwable -> L48
        int r47 = r22;
        r110.setMIsSummaryReport((int) r1.getLong(r47));     // Catch: Throwable -> L48
        int r48 = r23;
        if (r1.isNull(r48) == false) goto L37;
        String r49 = null;
    L38:
        r110.setMSummaryReportText(r49);     // Catch: Throwable -> L48
        int r50 = r24;
        if (r1.isNull(r50) == false) goto L41;
        String r51 = null;
    L42:
        r110.setMFileName(r51);     // Catch: Throwable -> L48
        r25 = r25;
        if (r1.isNull(r25) == false) goto L45;
        String r52 = null;
    L46:
        r110.setMTaskId(r52);     // Catch: Throwable -> L48
        r23 = r48;
        int r53 = r26;
        r110.setMModel((int) r1.getLong(r53));     // Catch: Throwable -> L48
        r27.add(r110);     // Catch: Throwable -> L48
        r14 = r29;
        r33 = r115;
        r4 = r38;
        r34 = r37;
        r17 = r40;
        r19 = r43;
        r21 = r45;
        r26 = r53;
        r0 = r0;
        r24 = r50;
        r22 = r47;
        r5 = r116;
        r16 = r39;
        r18 = r42;
        r20 = r44;
        r15 = r27;
        r2 = r114;
        r13 = r28;
        r3 = r30;
        goto L4
    L45:
        r52 = r1.getText(r25);     // Catch: Throwable -> L48
        goto L46
    L41:
        r51 = r1.getText(r50);     // Catch: Throwable -> L48
        goto L42
    L37:
        r49 = r1.getText(r48);     // Catch: Throwable -> L48
        goto L38
    L33:
        r46 = r1.getText(r45);     // Catch: Throwable -> L48
        goto L34
    L29:
        r41 = r1.getText(r40);     // Catch: Throwable -> L48
        goto L30
    L25:
        r36 = r1.getText(r28);     // Catch: Throwable -> L48
        goto L26
    L21:
        r35 = r1.getText(r10);     // Catch: Throwable -> L48
        goto L22
    L17:
        r113 = r1.getText(r5);     // Catch: Throwable -> L48
        goto L18
    L13:
        r112 = r1.getText(r4);     // Catch: Throwable -> L48
        goto L14
    L9:
        r111 = r1.getText(r3);     // Catch: Throwable -> L48
        goto L10
    L50:
        ArrayList r54 = r15;
        r1.close();
        return r54;
    L48:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer iO(RecordDeviceFileDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfRecordDeviceFile.handleMultiple(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public void delete(final List<RecordDeviceFile> lists) {
        lists.getClass();
        DBUtil.performBlocking(this.__db, false, true, new kc3(this, lists));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public void deleteAll() {
        DBUtil.performBlocking(this.__db, false, true, new ic3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public void deleteById(final long id) {
        DBUtil.performBlocking(this.__db, false, true, new mc3(id));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getAlbumListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new lc3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public RecordDeviceFile getDeviceFiletById(final long id) {
        return (RecordDeviceFile) DBUtil.performBlocking(this.__db, true, false, new jc3(id));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getFavorityList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new cc3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new dc3());
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getListByType(final int fileType) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new hc3(fileType));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public long[] insert(final List<RecordDeviceFile> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new ec3(this, list));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> searchByNameIgnoreCase(final String keyword) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new gc3(keyword));
    }

    @Override // com.sma.smartv3.db.dao.RecordDeviceFileDao
    public int update(final List<RecordDeviceFile> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new fc3(this, lists))).intValue();
    }
}
