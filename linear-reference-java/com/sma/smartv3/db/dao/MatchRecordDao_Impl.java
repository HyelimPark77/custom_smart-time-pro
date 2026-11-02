package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.h50;
import com.android.mltcode.paycertificationapi.i50;
import com.android.mltcode.paycertificationapi.j50;
import com.android.mltcode.paycertificationapi.k50;
import com.android.mltcode.paycertificationapi.l50;
import com.android.mltcode.paycertificationapi.m50;
import com.android.mltcode.paycertificationapi.n50;
import com.android.mltcode.paycertificationapi.o50;
import com.android.mltcode.paycertificationapi.p50;
import com.android.mltcode.paycertificationapi.q50;
import com.android.mltcode.paycertificationapi.r50;
import com.android.mltcode.paycertificationapi.s50;
import com.sma.smartv3.db.entity.MatchLog;
import com.sma.smartv3.db.entity.MatchPeriod;
import com.sma.smartv3.db.entity.MatchRecord;
import com.sma.smartv3.db.entity.MatchRecordConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MatchRecordDao_Impl implements MatchRecordDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MatchLog> __insertAdapterOfMatchLog;
    private final EntityInsertAdapter<MatchPeriod> __insertAdapterOfMatchPeriod;
    private final EntityInsertAdapter<MatchRecord> __insertAdapterOfMatchRecord;
    private final MatchRecordConverter __matchRecordConverter;
    private final EntityDeleteOrUpdateAdapter<MatchRecord> __updateAdapterOfMatchRecord;

    public MatchRecordDao_Impl(@NonNull final RoomDatabase __db) {
        this.__matchRecordConverter = new MatchRecordConverter();
        this.__db = __db;
        this.__insertAdapterOfMatchRecord = new AnonymousClass1(this);
        this.__insertAdapterOfMatchPeriod = new AnonymousClass2(this);
        this.__insertAdapterOfMatchLog = new AnonymousClass3(this);
        this.__updateAdapterOfMatchRecord = new AnonymousClass4(this);
    }

    public static /* synthetic */ long[] I0IIOi(MatchRecordDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfMatchPeriod.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Object I0iXXO(int r3, SQLiteConnection r4) {
        SQLiteStatement r5 = r4.prepare("DELETE FROM MatchRecord WHERE mId = ?");
        r5.mo3338bindLong(1, r3);     // Catch: Throwable -> L6
        r5.step();     // Catch: Throwable -> L6
        r5.close();
        return null;
    L6:
        th = move-exception;
        r5.close();
        throw th;
    }

    public static /* synthetic */ List IO(MatchRecordDao_Impl r54, int r55, SQLiteConnection r56) {
        r54.getClass();
        SQLiteStatement r1 = r56.prepare("SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = ?");
        r1.mo3338bindLong(1, r55);     // Catch: Throwable -> L26
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L26
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStart");     // Catch: Throwable -> L26
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L26
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L26
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPeriodListSize");     // Catch: Throwable -> L26
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLogListSize");     // Catch: Throwable -> L26
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L26
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L26
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L26
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsStopWatchData");     // Catch: Throwable -> L26
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStopWatchList");     // Catch: Throwable -> L26
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTeamInfo");     // Catch: Throwable -> L26
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeather");     // Catch: Throwable -> L26
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHomeTeamScore");     // Catch: Throwable -> L26
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mGuestTeamScore");     // Catch: Throwable -> L26
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L26
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinBpm");     // Catch: Throwable -> L26
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAirPressure");     // Catch: Throwable -> L26
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPace");     // Catch: Throwable -> L26
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxPace");     // Catch: Throwable -> L26
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinPace");     // Catch: Throwable -> L26
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpm");     // Catch: Throwable -> L26
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxSpm");     // Catch: Throwable -> L26
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinSpm");     // Catch: Throwable -> L26
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L26
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxAltitude");     // Catch: Throwable -> L26
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinAltitude");     // Catch: Throwable -> L26
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mId");     // Catch: Throwable -> L26
        int r28 = r14;
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMatchRecordId");     // Catch: Throwable -> L26
        int r29 = r13;
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDuration");     // Catch: Throwable -> L26
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDistance");     // Catch: Throwable -> L26
        int r30 = r12;
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mStep");     // Catch: Throwable -> L26
        int r31 = r11;
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mCalorie");     // Catch: Throwable -> L26
        int r32 = r10;
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mSpeed");     // Catch: Throwable -> L26
        int r33 = r9;
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mAvgBpm");     // Catch: Throwable -> L26
        int r35 = r8;
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxBpm");     // Catch: Throwable -> L26
        int r37 = r7;
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxSpeed");     // Catch: Throwable -> L26
        int r39 = r6;
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsSync");     // Catch: Throwable -> L26
        int r310 = r5;
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsDelete");     // Catch: Throwable -> L26
        int r311 = r4;
        ArrayList r42 = new ArrayList();     // Catch: Throwable -> L26
    L4:
        if (r1.step() == false) goto L28;
        int r312 = r3;
        ArrayList r43 = r42;
        MatchPeriod r44 = new MatchPeriod((int) r1.getLong(r15), (int) r1.getLong(r110), (int) r1.getLong(r111), (int) r1.getLong(r0), (int) r1.getLong(r112), (int) r1.getLong(r113), (int) r1.getLong(r114), (int) r1.getLong(r34), (int) r1.getLong(r36), (int) r1.getLong(r38), (int) r1.getLong(r40), (int) r1.getLong(r41));     // Catch: Throwable -> L26
        MatchRecord r45 = new MatchRecord();     // Catch: Throwable -> L26
        int r46 = r41;
        int r47 = r40;
        r45.setMId((int) r1.getLong(r2));     // Catch: Throwable -> L26
        int r313 = r38;
        r45.setMStart(r1.getLong(r312));     // Catch: Throwable -> L26
        int r48 = r311;
        String r314 = null;
        if (r1.isNull(r48) == false) goto L9;
        String r49 = null;
    L10:
        r45.setMLocalTime(r49);     // Catch: Throwable -> L26
        int r50 = r310;
        r45.setMType((int) r1.getLong(r50));     // Catch: Throwable -> L26
        int r51 = r39;
        r45.setMPeriodListSize((int) r1.getLong(r51));     // Catch: Throwable -> L26
        int r52 = r37;
        int r315 = r36;
        r45.setMLogListSize((int) r1.getLong(r52));     // Catch: Throwable -> L26
        int r53 = r35;
        r45.setMIsSync((int) r1.getLong(r53));     // Catch: Throwable -> L26
        int r59 = r33;
        r45.setMIsDelete((int) r1.getLong(r59));     // Catch: Throwable -> L26
        int r60 = r32;
        r45.setMSource((int) r1.getLong(r60));     // Catch: Throwable -> L26
        int r61 = r31;
        r45.setMIsStopWatchData((int) r1.getLong(r61));     // Catch: Throwable -> L26
        int r62 = r30;
        if (r1.isNull(r62) == false) goto L14;
        String r63 = null;
    L13:
        int r316 = r0;
        int r410 = r2;
        r45.setMStopWatchList(r54.__matchRecordConverter.stringToStopWatchList(r63));     // Catch: Throwable -> L26
        int r64 = r29;
        if (r1.isNull(r64) == false) goto L19;
        String r65 = null;
    L18:
        r29 = r64;
        r45.setMTeamInfo(r54.__matchRecordConverter.stringToTeamInfo(r65));     // Catch: Throwable -> L26
        int r66 = r28;
        if (r1.isNull(r66) == false) goto L23;
    L22:
        r28 = r66;
        r45.setMWeather(r54.__matchRecordConverter.stringToWeather(r314));     // Catch: Throwable -> L26
        int r67 = r57;
        r45.setMHomeTeamScore((int) r1.getLong(r67));     // Catch: Throwable -> L26
        int r68 = r58;
        r45.setMGuestTeamScore((int) r1.getLong(r68));     // Catch: Throwable -> L26
        int r69 = r16;
        r45.setMMode((int) r1.getLong(r69));     // Catch: Throwable -> L26
        r58 = r68;
        r16 = r69;
        int r70 = r17;
        r45.setMMinBpm((int) r1.getLong(r70));     // Catch: Throwable -> L26
        r17 = r70;
        int r71 = r18;
        r45.setMAirPressure((int) r1.getLong(r71));     // Catch: Throwable -> L26
        int r72 = r19;
        r45.setMPace((int) r1.getLong(r72));     // Catch: Throwable -> L26
        r18 = r71;
        r19 = r72;
        int r73 = r20;
        r45.setMMaxPace((int) r1.getLong(r73));     // Catch: Throwable -> L26
        r20 = r73;
        int r74 = r21;
        r45.setMMinPace((int) r1.getLong(r74));     // Catch: Throwable -> L26
        int r75 = r22;
        r45.setMSpm((int) r1.getLong(r75));     // Catch: Throwable -> L26
        r21 = r74;
        r22 = r75;
        int r76 = r23;
        r45.setMMaxSpm((int) r1.getLong(r76));     // Catch: Throwable -> L26
        r23 = r76;
        int r77 = r24;
        r45.setMMinSpm((int) r1.getLong(r77));     // Catch: Throwable -> L26
        int r78 = r25;
        r45.setMAltitude((int) r1.getLong(r78));     // Catch: Throwable -> L26
        r24 = r77;
        r25 = r78;
        int r79 = r26;
        r45.setMMaxAltitude((int) r1.getLong(r79));     // Catch: Throwable -> L26
        r26 = r79;
        int r80 = r27;
        r45.setMMinAltitude((int) r1.getLong(r80));     // Catch: Throwable -> L26
        r45.setMPeriod(r44);     // Catch: Throwable -> L26
        r43.add(r45);     // Catch: Throwable -> L26
        r42 = r43;
        r27 = r80;
        r0 = r316;
        r36 = r315;
        r3 = r312;
        r30 = r62;
        r38 = r313;
        r40 = r47;
        r41 = r46;
        r311 = r48;
        r37 = r52;
        r310 = r50;
        r39 = r51;
        r35 = r53;
        r33 = r59;
        r57 = r67;
        r32 = r60;
        r2 = r410;
        r31 = r61;
        goto L4
    L23:
        r314 = r1.getText(r66);     // Catch: Throwable -> L26
        goto L22
    L19:
        r65 = r1.getText(r64);     // Catch: Throwable -> L26
        goto L18
    L14:
        r63 = r1.getText(r62);     // Catch: Throwable -> L26
        goto L13
    L9:
        r49 = r1.getText(r48);     // Catch: Throwable -> L26
        goto L10
    L28:
        ArrayList r81 = r42;
        r1.close();
        return r81;
    L26:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] IiI10X(MatchRecordDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfMatchLog.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ Long O00(MatchRecordDao_Impl r0, MatchRecord r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfMatchRecord.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Object OIX0iXi(int r3, SQLiteConnection r4) {
        SQLiteStatement r5 = r4.prepare("DELETE FROM MatchPeriod WHERE mMatchRecordId = ?");
        r5.mo3338bindLong(1, r3);     // Catch: Throwable -> L6
        r5.step();     // Catch: Throwable -> L6
        r5.close();
        return null;
    L6:
        th = move-exception;
        r5.close();
        throw th;
    }

    public static /* synthetic */ List OIi0(MatchRecordDao_Impl r53, int r54, int r55, SQLiteConnection r56) {
        r53.getClass();
        SQLiteStatement r1 = r56.prepare("SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT ?, ?");
        r1.mo3338bindLong(1, r54);     // Catch: Throwable -> L26
        r1.mo3338bindLong(2, r55);     // Catch: Throwable -> L26
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L26
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStart");     // Catch: Throwable -> L26
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L26
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L26
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPeriodListSize");     // Catch: Throwable -> L26
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLogListSize");     // Catch: Throwable -> L26
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L26
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L26
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L26
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsStopWatchData");     // Catch: Throwable -> L26
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStopWatchList");     // Catch: Throwable -> L26
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTeamInfo");     // Catch: Throwable -> L26
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeather");     // Catch: Throwable -> L26
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHomeTeamScore");     // Catch: Throwable -> L26
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mGuestTeamScore");     // Catch: Throwable -> L26
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L26
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinBpm");     // Catch: Throwable -> L26
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAirPressure");     // Catch: Throwable -> L26
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPace");     // Catch: Throwable -> L26
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxPace");     // Catch: Throwable -> L26
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinPace");     // Catch: Throwable -> L26
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpm");     // Catch: Throwable -> L26
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxSpm");     // Catch: Throwable -> L26
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinSpm");     // Catch: Throwable -> L26
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L26
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxAltitude");     // Catch: Throwable -> L26
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinAltitude");     // Catch: Throwable -> L26
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mId");     // Catch: Throwable -> L26
        int r27 = r14;
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMatchRecordId");     // Catch: Throwable -> L26
        int r28 = r13;
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDuration");     // Catch: Throwable -> L26
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDistance");     // Catch: Throwable -> L26
        int r29 = r12;
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mStep");     // Catch: Throwable -> L26
        int r30 = r11;
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mCalorie");     // Catch: Throwable -> L26
        int r31 = r10;
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mSpeed");     // Catch: Throwable -> L26
        int r32 = r9;
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mAvgBpm");     // Catch: Throwable -> L26
        int r34 = r8;
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxBpm");     // Catch: Throwable -> L26
        int r36 = r7;
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxSpeed");     // Catch: Throwable -> L26
        int r38 = r6;
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsSync");     // Catch: Throwable -> L26
        int r310 = r5;
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsDelete");     // Catch: Throwable -> L26
        int r311 = r4;
        ArrayList r41 = new ArrayList();     // Catch: Throwable -> L26
    L4:
        if (r1.step() == false) goto L28;
        int r312 = r3;
        ArrayList r313 = r41;
        MatchPeriod r42 = new MatchPeriod((int) r1.getLong(r15), (int) r1.getLong(r110), (int) r1.getLong(r111), (int) r1.getLong(r0), (int) r1.getLong(r112), (int) r1.getLong(r113), (int) r1.getLong(r114), (int) r1.getLong(r33), (int) r1.getLong(r35), (int) r1.getLong(r37), (int) r1.getLong(r39), (int) r1.getLong(r40));     // Catch: Throwable -> L26
        MatchRecord r43 = new MatchRecord();     // Catch: Throwable -> L26
        int r44 = r40;
        int r45 = r39;
        r43.setMId((int) r1.getLong(r2));     // Catch: Throwable -> L26
        int r314 = r37;
        r43.setMStart(r1.getLong(r312));     // Catch: Throwable -> L26
        int r46 = r311;
        String r315 = null;
        if (r1.isNull(r46) == false) goto L9;
        String r47 = null;
    L10:
        r43.setMLocalTime(r47);     // Catch: Throwable -> L26
        int r48 = r310;
        r43.setMType((int) r1.getLong(r48));     // Catch: Throwable -> L26
        int r49 = r38;
        r43.setMPeriodListSize((int) r1.getLong(r49));     // Catch: Throwable -> L26
        int r50 = r36;
        int r316 = r35;
        r43.setMLogListSize((int) r1.getLong(r50));     // Catch: Throwable -> L26
        int r51 = r34;
        r43.setMIsSync((int) r1.getLong(r51));     // Catch: Throwable -> L26
        int r52 = r32;
        r43.setMIsDelete((int) r1.getLong(r52));     // Catch: Throwable -> L26
        int r60 = r31;
        r43.setMSource((int) r1.getLong(r60));     // Catch: Throwable -> L26
        int r61 = r30;
        r43.setMIsStopWatchData((int) r1.getLong(r61));     // Catch: Throwable -> L26
        int r62 = r29;
        if (r1.isNull(r62) == false) goto L14;
        String r63 = null;
    L13:
        int r210 = r0;
        int r410 = r2;
        r43.setMStopWatchList(r53.__matchRecordConverter.stringToStopWatchList(r63));     // Catch: Throwable -> L26
        int r64 = r28;
        if (r1.isNull(r64) == false) goto L19;
        String r65 = null;
    L18:
        r28 = r64;
        r43.setMTeamInfo(r53.__matchRecordConverter.stringToTeamInfo(r65));     // Catch: Throwable -> L26
        int r66 = r27;
        if (r1.isNull(r66) == false) goto L23;
    L22:
        r27 = r66;
        r43.setMWeather(r53.__matchRecordConverter.stringToWeather(r315));     // Catch: Throwable -> L26
        int r67 = r57;
        r43.setMHomeTeamScore((int) r1.getLong(r67));     // Catch: Throwable -> L26
        int r68 = r58;
        r43.setMGuestTeamScore((int) r1.getLong(r68));     // Catch: Throwable -> L26
        int r69 = r59;
        r43.setMMode((int) r1.getLong(r69));     // Catch: Throwable -> L26
        r58 = r68;
        r59 = r69;
        int r70 = r16;
        r43.setMMinBpm((int) r1.getLong(r70));     // Catch: Throwable -> L26
        r16 = r70;
        int r71 = r17;
        r43.setMAirPressure((int) r1.getLong(r71));     // Catch: Throwable -> L26
        int r72 = r18;
        r43.setMPace((int) r1.getLong(r72));     // Catch: Throwable -> L26
        r17 = r71;
        r18 = r72;
        int r73 = r19;
        r43.setMMaxPace((int) r1.getLong(r73));     // Catch: Throwable -> L26
        r19 = r73;
        int r74 = r20;
        r43.setMMinPace((int) r1.getLong(r74));     // Catch: Throwable -> L26
        int r75 = r21;
        r43.setMSpm((int) r1.getLong(r75));     // Catch: Throwable -> L26
        r20 = r74;
        r21 = r75;
        int r76 = r22;
        r43.setMMaxSpm((int) r1.getLong(r76));     // Catch: Throwable -> L26
        r22 = r76;
        int r77 = r23;
        r43.setMMinSpm((int) r1.getLong(r77));     // Catch: Throwable -> L26
        int r78 = r24;
        r43.setMAltitude((int) r1.getLong(r78));     // Catch: Throwable -> L26
        r23 = r77;
        r24 = r78;
        int r79 = r25;
        r43.setMMaxAltitude((int) r1.getLong(r79));     // Catch: Throwable -> L26
        r25 = r79;
        int r80 = r26;
        r43.setMMinAltitude((int) r1.getLong(r80));     // Catch: Throwable -> L26
        r43.setMPeriod(r42);     // Catch: Throwable -> L26
        r313.add(r43);     // Catch: Throwable -> L26
        r41 = r313;
        r26 = r80;
        r0 = r210;
        r35 = r316;
        r3 = r312;
        r29 = r62;
        r37 = r314;
        r39 = r45;
        r40 = r44;
        r311 = r46;
        r36 = r50;
        r310 = r48;
        r38 = r49;
        r34 = r51;
        r32 = r52;
        r57 = r67;
        r31 = r60;
        r2 = r410;
        r30 = r61;
        goto L4
    L23:
        r315 = r1.getText(r66);     // Catch: Throwable -> L26
        goto L22
    L19:
        r65 = r1.getText(r64);     // Catch: Throwable -> L26
        goto L18
    L14:
        r63 = r1.getText(r62);     // Catch: Throwable -> L26
        goto L13
    L9:
        r47 = r1.getText(r46);     // Catch: Throwable -> L26
        goto L10
    L28:
        ArrayList r81 = r41;
        r1.close();
        return r81;
    L26:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Object OXO1(int r3, SQLiteConnection r4) {
        SQLiteStatement r5 = r4.prepare("DELETE FROM MatchLog WHERE mMatchRecordId = ?");
        r5.mo3338bindLong(1, r3);     // Catch: Throwable -> L6
        r5.step();     // Catch: Throwable -> L6
        r5.close();
        return null;
    L6:
        th = move-exception;
        r5.close();
        throw th;
    }

    public static /* synthetic */ List XIi00iiXO(int r35, SQLiteConnection r36) {
        SQLiteStatement r1 = r36.prepare("SELECT * FROM MatchLog WHERE mMatchRecordId = ?");
        r1.mo3338bindLong(1, r35);     // Catch: Throwable -> L8
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L8
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMatchRecordId");     // Catch: Throwable -> L8
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L8
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCountingTime");     // Catch: Throwable -> L8
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPeriodTime");     // Catch: Throwable -> L8
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPeriodNumber");     // Catch: Throwable -> L8
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L8
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCount");     // Catch: Throwable -> L8
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCancelType");     // Catch: Throwable -> L8
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTeam");     // Catch: Throwable -> L8
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPlayer");     // Catch: Throwable -> L8
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mOtherType");     // Catch: Throwable -> L8
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStopWatchTotal");     // Catch: Throwable -> L8
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L8
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L8
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L8
    L5:
        if (r1.step() == false) goto L10;
        int r38 = r14;
        ArrayList r16 = r15;
        int r17 = r2;
        int r33 = r3;
        int r39 = r4;
        int r34 = r5;
        int r18 = r37;
        r16.add(new MatchLog((int) r1.getLong(r0), (int) r1.getLong(r2), (int) r1.getLong(r3), (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11), (int) r1.getLong(r12), (int) r1.getLong(r13), (int) r1.getLong(r38), (int) r1.getLong(r18)));     // Catch: Throwable -> L8
        r14 = r38;
        r4 = r39;
        r37 = r18;
        r2 = r17;
        r5 = r34;
        r15 = r16;
        r3 = r33;
        goto L5
    L10:
        ArrayList r19 = r15;
        r1.close();
        return r19;
    L8:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Integer XO0O10(MatchRecordDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfMatchRecord.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List XOO0ii0(MatchRecordDao_Impl r55, SQLiteConnection r56) {
        r55.getClass();
        SQLiteStatement r1 = r56.prepare("SELECT * FROM MatchRecord WHERE mIsDelete != 1");
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L26
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStart");     // Catch: Throwable -> L26
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L26
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mType");     // Catch: Throwable -> L26
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPeriodListSize");     // Catch: Throwable -> L26
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLogListSize");     // Catch: Throwable -> L26
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L26
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L26
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSource");     // Catch: Throwable -> L26
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsStopWatchData");     // Catch: Throwable -> L26
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStopWatchList");     // Catch: Throwable -> L26
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTeamInfo");     // Catch: Throwable -> L26
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeather");     // Catch: Throwable -> L26
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHomeTeamScore");     // Catch: Throwable -> L26
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mGuestTeamScore");     // Catch: Throwable -> L26
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMode");     // Catch: Throwable -> L26
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinBpm");     // Catch: Throwable -> L26
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAirPressure");     // Catch: Throwable -> L26
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPace");     // Catch: Throwable -> L26
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxPace");     // Catch: Throwable -> L26
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinPace");     // Catch: Throwable -> L26
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpm");     // Catch: Throwable -> L26
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxSpm");     // Catch: Throwable -> L26
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinSpm");     // Catch: Throwable -> L26
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAltitude");     // Catch: Throwable -> L26
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxAltitude");     // Catch: Throwable -> L26
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMinAltitude");     // Catch: Throwable -> L26
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mId");     // Catch: Throwable -> L26
        int r29 = r14;
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMatchRecordId");     // Catch: Throwable -> L26
        int r30 = r13;
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDuration");     // Catch: Throwable -> L26
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mDistance");     // Catch: Throwable -> L26
        int r31 = r12;
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mStep");     // Catch: Throwable -> L26
        int r32 = r11;
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mCalorie");     // Catch: Throwable -> L26
        int r33 = r10;
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mSpeed");     // Catch: Throwable -> L26
        int r34 = r9;
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mAvgBpm");     // Catch: Throwable -> L26
        int r36 = r8;
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxBpm");     // Catch: Throwable -> L26
        int r38 = r7;
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mMaxSpeed");     // Catch: Throwable -> L26
        int r310 = r6;
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsSync");     // Catch: Throwable -> L26
        int r311 = r5;
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "p_mIsDelete");     // Catch: Throwable -> L26
        int r312 = r4;
        ArrayList r42 = new ArrayList();     // Catch: Throwable -> L26
    L4:
        if (r1.step() == false) goto L28;
        int r43 = r3;
        ArrayList r44 = r42;
        MatchPeriod r45 = new MatchPeriod((int) r1.getLong(r15), (int) r1.getLong(r110), (int) r1.getLong(r111), (int) r1.getLong(r0), (int) r1.getLong(r112), (int) r1.getLong(r113), (int) r1.getLong(r114), (int) r1.getLong(r35), (int) r1.getLong(r37), (int) r1.getLong(r39), (int) r1.getLong(r40), (int) r1.getLong(r41));     // Catch: Throwable -> L26
        MatchRecord r46 = new MatchRecord();     // Catch: Throwable -> L26
        int r47 = r41;
        int r48 = r40;
        r46.setMId((int) r1.getLong(r2));     // Catch: Throwable -> L26
        int r49 = r39;
        r46.setMStart(r1.getLong(r43));     // Catch: Throwable -> L26
        int r50 = r312;
        String r313 = null;
        if (r1.isNull(r50) == false) goto L9;
        String r51 = null;
    L10:
        r46.setMLocalTime(r51);     // Catch: Throwable -> L26
        int r52 = r311;
        r46.setMType((int) r1.getLong(r52));     // Catch: Throwable -> L26
        int r53 = r310;
        r46.setMPeriodListSize((int) r1.getLong(r53));     // Catch: Throwable -> L26
        int r54 = r38;
        int r314 = r37;
        r46.setMLogListSize((int) r1.getLong(r54));     // Catch: Throwable -> L26
        int r58 = r36;
        r46.setMIsSync((int) r1.getLong(r58));     // Catch: Throwable -> L26
        int r59 = r34;
        r46.setMIsDelete((int) r1.getLong(r59));     // Catch: Throwable -> L26
        int r60 = r33;
        r46.setMSource((int) r1.getLong(r60));     // Catch: Throwable -> L26
        int r61 = r32;
        r46.setMIsStopWatchData((int) r1.getLong(r61));     // Catch: Throwable -> L26
        int r62 = r31;
        if (r1.isNull(r62) == false) goto L14;
        String r63 = null;
    L13:
        int r315 = r0;
        int r410 = r2;
        r46.setMStopWatchList(r55.__matchRecordConverter.stringToStopWatchList(r63));     // Catch: Throwable -> L26
        int r64 = r30;
        if (r1.isNull(r64) == false) goto L19;
        String r65 = null;
    L18:
        r30 = r64;
        r46.setMTeamInfo(r55.__matchRecordConverter.stringToTeamInfo(r65));     // Catch: Throwable -> L26
        int r66 = r29;
        if (r1.isNull(r66) == false) goto L23;
    L22:
        r29 = r66;
        r46.setMWeather(r55.__matchRecordConverter.stringToWeather(r313));     // Catch: Throwable -> L26
        int r67 = r57;
        r46.setMHomeTeamScore((int) r1.getLong(r67));     // Catch: Throwable -> L26
        int r68 = r16;
        r46.setMGuestTeamScore((int) r1.getLong(r68));     // Catch: Throwable -> L26
        int r69 = r17;
        r46.setMMode((int) r1.getLong(r69));     // Catch: Throwable -> L26
        r17 = r69;
        int r70 = r18;
        r46.setMMinBpm((int) r1.getLong(r70));     // Catch: Throwable -> L26
        r18 = r70;
        int r71 = r19;
        r46.setMAirPressure((int) r1.getLong(r71));     // Catch: Throwable -> L26
        int r72 = r20;
        r46.setMPace((int) r1.getLong(r72));     // Catch: Throwable -> L26
        r20 = r72;
        int r73 = r21;
        r46.setMMaxPace((int) r1.getLong(r73));     // Catch: Throwable -> L26
        r21 = r73;
        int r74 = r22;
        r46.setMMinPace((int) r1.getLong(r74));     // Catch: Throwable -> L26
        int r75 = r23;
        r46.setMSpm((int) r1.getLong(r75));     // Catch: Throwable -> L26
        r23 = r75;
        int r76 = r24;
        r46.setMMaxSpm((int) r1.getLong(r76));     // Catch: Throwable -> L26
        r24 = r76;
        int r77 = r25;
        r46.setMMinSpm((int) r1.getLong(r77));     // Catch: Throwable -> L26
        int r78 = r26;
        r46.setMAltitude((int) r1.getLong(r78));     // Catch: Throwable -> L26
        r26 = r78;
        int r79 = r27;
        r46.setMMaxAltitude((int) r1.getLong(r79));     // Catch: Throwable -> L26
        r27 = r79;
        int r80 = r28;
        r46.setMMinAltitude((int) r1.getLong(r80));     // Catch: Throwable -> L26
        r46.setMPeriod(r45);     // Catch: Throwable -> L26
        r44.add(r46);     // Catch: Throwable -> L26
        r42 = r44;
        r28 = r80;
        r0 = r315;
        r3 = r43;
        r31 = r62;
        r39 = r49;
        r40 = r48;
        r41 = r47;
        r312 = r50;
        r311 = r52;
        r310 = r53;
        r33 = r60;
        r32 = r61;
        r16 = r68;
        r19 = r71;
        r22 = r74;
        r25 = r77;
        r37 = r314;
        r38 = r54;
        r36 = r58;
        r34 = r59;
        r57 = r67;
        r2 = r410;
        goto L4
    L23:
        r313 = r1.getText(r66);     // Catch: Throwable -> L26
        goto L22
    L19:
        r65 = r1.getText(r64);     // Catch: Throwable -> L26
        goto L18
    L14:
        r63 = r1.getText(r62);     // Catch: Throwable -> L26
        goto L13
    L9:
        r51 = r1.getText(r50);     // Catch: Throwable -> L26
        goto L10
    L28:
        ArrayList r81 = r42;
        r1.close();
        return r81;
    L26:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* bridge */ /* synthetic */ MatchRecordConverter XXI(MatchRecordDao_Impl r0) {
        return r0.__matchRecordConverter;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(int r29, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * FROM MatchPeriod WHERE mMatchRecordId = ?");
        r1.mo3338bindLong(1, r29);     // Catch: Throwable -> L8
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L8
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMatchRecordId");     // Catch: Throwable -> L8
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDuration");     // Catch: Throwable -> L8
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDistance");     // Catch: Throwable -> L8
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStep");     // Catch: Throwable -> L8
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mCalorie");     // Catch: Throwable -> L8
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSpeed");     // Catch: Throwable -> L8
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAvgBpm");     // Catch: Throwable -> L8
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxBpm");     // Catch: Throwable -> L8
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMaxSpeed");     // Catch: Throwable -> L8
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L8
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L8
        ArrayList r13 = new ArrayList();     // Catch: Throwable -> L8
    L5:
        if (r1.step() == false) goto L10;
        int r210 = r2;
        int r31 = r3;
        r13.add(new MatchPeriod((int) r1.getLong(r0), (int) r1.getLong(r2), (int) r1.getLong(r3), (int) r1.getLong(r4), (int) r1.getLong(r5), (int) r1.getLong(r6), (int) r1.getLong(r7), (int) r1.getLong(r8), (int) r1.getLong(r9), (int) r1.getLong(r10), (int) r1.getLong(r11), (int) r1.getLong(r12)));     // Catch: Throwable -> L8
        r2 = r210;
        r3 = r31;
        goto L5
    L10:
        r1.close();
        return r13;
    L8:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public void _deleteMatchLogById(final int matchRecordId) {
        DBUtil.performBlocking(this.__db, false, true, new h50(matchRecordId));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public void _deleteMatchPeriodById(final int matchRecordId) {
        DBUtil.performBlocking(this.__db, false, true, new q50(matchRecordId));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public void _deleteMatchRecordById(final int id) {
        DBUtil.performBlocking(this.__db, false, true, new s50(id));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchLog> _getMatchLogById(final int matchRecordId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new p50(matchRecordId));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchPeriod> _getMatchPeriodsById(final int matchRecordId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new l50(matchRecordId));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchRecord> _getMatchRecords(final int startIndex, final int endIndex) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new o50(this, startIndex, endIndex));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public long[] _insertMatchLog(final List<MatchLog> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new m50(this, list));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public long[] _insertMatchPeriod(final List<MatchPeriod> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new r50(this, list));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public long _insertMatchRecord(final MatchRecord matchRecord) {
        matchRecord.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new j50(this, matchRecord))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public void delete(final int id) {
        MatchRecordDao.DefaultImpls.delete(this, id);
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchRecord> getList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new k50(this));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchRecord> getListBySource(final int source) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new n50(this, source));
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public List<MatchRecord> getMatchRecords(final int startIndex, final int endIndex) {
        return MatchRecordDao.DefaultImpls.getMatchRecords(this, startIndex, endIndex);
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public void insert(final List<MatchRecord> list) {
        MatchRecordDao.DefaultImpls.insert(this, list);
    }

    @Override // com.sma.smartv3.db.dao.MatchRecordDao
    public int update(final List<MatchRecord> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new i50(this, lists))).intValue();
    }
}
