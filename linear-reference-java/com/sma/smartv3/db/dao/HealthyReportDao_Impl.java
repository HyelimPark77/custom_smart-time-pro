package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.O00OO1iO;
import com.android.mltcode.paycertificationapi.O1IOXOI;
import com.android.mltcode.paycertificationapi.X11iIii00;
import com.android.mltcode.paycertificationapi.iOOXXI1O;
import com.android.mltcode.paycertificationapi.iXXXXXI;
import com.sma.smartv3.db.entity.HealthyReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class HealthyReportDao_Impl implements HealthyReportDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HealthyReport> __insertAdapterOfHealthyReport;
    private final EntityInsertAdapter<HealthyReport> __insertAdapterOfHealthyReport_1;
    private final EntityDeleteOrUpdateAdapter<HealthyReport> __updateAdapterOfHealthyReport;

    public HealthyReportDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfHealthyReport = new AnonymousClass1(this);
        this.__insertAdapterOfHealthyReport_1 = new AnonymousClass2(this);
        this.__updateAdapterOfHealthyReport = new AnonymousClass3(this);
    }

    public static /* synthetic */ Integer O00(HealthyReportDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfHealthyReport.handleMultiple(r2, r1));
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r85) {
        SQLiteStatement r1 = r85.prepare("SELECT * FROM healthyReport WHERE  mTime > 0  ORDER BY mTime ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L50
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserGender");     // Catch: Throwable -> L50
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserWeight");     // Catch: Throwable -> L50
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserHeight");     // Catch: Throwable -> L50
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L50
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L50
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAbnormalNumber");     // Catch: Throwable -> L50
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateTime");     // Catch: Throwable -> L50
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateValue");     // Catch: Throwable -> L50
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateAIRecords");     // Catch: Throwable -> L50
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodPressureTime");     // Catch: Throwable -> L50
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSystolicValue");     // Catch: Throwable -> L50
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDiastolicValue");     // Catch: Throwable -> L50
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodPressureAIRecords");     // Catch: Throwable -> L50
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenTime");     // Catch: Throwable -> L50
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenValue");     // Catch: Throwable -> L50
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenAIRecords");     // Catch: Throwable -> L50
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepTime");     // Catch: Throwable -> L50
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepDeepLengthTime");     // Catch: Throwable -> L50
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepPiecemealTime");     // Catch: Throwable -> L50
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepAIRecords");     // Catch: Throwable -> L50
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureTime");     // Catch: Throwable -> L50
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureValue");     // Catch: Throwable -> L50
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureAIRecords");     // Catch: Throwable -> L50
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2Time");     // Catch: Throwable -> L50
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2Value");     // Catch: Throwable -> L50
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2AIRecords");     // Catch: Throwable -> L50
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightTime");     // Catch: Throwable -> L50
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightValue");     // Catch: Throwable -> L50
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightAIRecords");     // Catch: Throwable -> L50
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsTime");     // Catch: Throwable -> L50
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsNumber");     // Catch: Throwable -> L50
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsAllTime");     // Catch: Throwable -> L50
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsAIRecords");     // Catch: Throwable -> L50
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L50
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L50
    L4:
        if (r1.step() == false) goto L52;
        int r36 = r14;
        ArrayList r37 = r15;
        int r110 = (int) r1.getLong(r0);     // Catch: Throwable -> L50
        int r111 = (int) r1.getLong(r2);     // Catch: Throwable -> L50
        float r112 = (float) r1.getDouble(r3);     // Catch: Throwable -> L50
        int r113 = r2;
        int r83 = r3;
        float r38 = (float) r1.getDouble(r4);     // Catch: Throwable -> L50
        long r43 = r1.getLong(r5);     // Catch: Throwable -> L50
        String r39 = null;
        if (r1.isNull(r6) == false) goto L10;
        String r45 = null;
    L11:
        int r40 = (int) r1.getLong(r7);     // Catch: Throwable -> L50
        long r47 = r1.getLong(r8);     // Catch: Throwable -> L50
        int r41 = (int) r1.getLong(r9);     // Catch: Throwable -> L50
        if (r1.isNull(r10) == false) goto L14;
        String r50 = null;
    L15:
        long r51 = r1.getLong(r11);     // Catch: Throwable -> L50
        int r42 = (int) r1.getLong(r12);     // Catch: Throwable -> L50
        int r44 = (int) r1.getLong(r13);     // Catch: Throwable -> L50
        if (r1.isNull(r36) == false) goto L18;
        int r87 = r0;
        String r55 = null;
    L19:
        long r56 = r1.getLong(r86);     // Catch: Throwable -> L50
        int r310 = r86;
        int r46 = r16;
        int r48 = (int) r1.getLong(r46);     // Catch: Throwable -> L50
        int r49 = r17;
        if (r1.isNull(r49) == false) goto L23;
        String r59 = null;
    L22:
        int r52 = r18;
        long r60 = r1.getLong(r52);     // Catch: Throwable -> L50
        r18 = r52;
        int r53 = r19;
        float r54 = (float) r1.getDouble(r53);     // Catch: Throwable -> L50
        int r84 = r5;
        int r57 = r20;
        int r210 = r4;
        float r58 = (float) r1.getDouble(r57);     // Catch: Throwable -> L50
        int r61 = r21;
        if (r1.isNull(r61) == false) goto L28;
        String r64 = null;
    L27:
        int r62 = r22;
        long r65 = r1.getLong(r62);     // Catch: Throwable -> L50
        r22 = r62;
        int r63 = r23;
        int r66 = (int) r1.getLong(r63);     // Catch: Throwable -> L50
        int r67 = r24;
        if (r1.isNull(r67) == false) goto L33;
        String r68 = null;
    L32:
        int r69 = r25;
        long r610 = r1.getLong(r69);     // Catch: Throwable -> L50
        r25 = r69;
        int r70 = r26;
        float r71 = (float) r1.getDouble(r70);     // Catch: Throwable -> L50
        int r72 = r27;
        if (r1.isNull(r72) == false) goto L38;
        String r73 = null;
    L37:
        int r74 = r28;
        long r75 = r1.getLong(r74);     // Catch: Throwable -> L50
        r28 = r74;
        int r76 = r29;
        float r77 = (float) r1.getDouble(r76);     // Catch: Throwable -> L50
        int r78 = r30;
        if (r1.isNull(r78) == false) goto L43;
        String r79 = null;
    L42:
        int r80 = r31;
        long r710 = r1.getLong(r80);     // Catch: Throwable -> L50
        r31 = r80;
        int r81 = r32;
        int r82 = (int) r1.getLong(r81);     // Catch: Throwable -> L50
        int r88 = r33;
        int r89 = (int) r1.getLong(r88);     // Catch: Throwable -> L50
        int r90 = r34;
        if (r1.isNull(r90) == false) goto L47;
    L46:
        int r91 = r35;
        r37.add(new HealthyReport(r110, r111, r112, r38, r43, r45, r40, r47, r41, r50, r51, r42, r44, r55, r56, r48, r59, r60, r54, r58, r64, r65, r66, r68, r610, r71, r73, r75, r77, r79, r710, r82, r89, r39, (int) r1.getLong(r91)));     // Catch: Throwable -> L50
        r2 = r113;
        r14 = r36;
        r16 = r46;
        r17 = r49;
        r4 = r210;
        r19 = r53;
        r20 = r57;
        r23 = r63;
        r24 = r67;
        r26 = r70;
        r27 = r72;
        r29 = r76;
        r30 = r78;
        r21 = r61;
        r32 = r81;
        r33 = r88;
        r35 = r91;
        r15 = r37;
        r34 = r90;
        r3 = r83;
        r5 = r84;
        r0 = r87;
        r86 = r310;
        goto L4
    L47:
        r39 = r1.getText(r90);     // Catch: Throwable -> L50
        goto L46
    L43:
        r79 = r1.getText(r78);     // Catch: Throwable -> L50
        goto L42
    L38:
        r73 = r1.getText(r72);     // Catch: Throwable -> L50
        goto L37
    L33:
        r68 = r1.getText(r67);     // Catch: Throwable -> L50
        goto L32
    L28:
        r64 = r1.getText(r61);     // Catch: Throwable -> L50
        goto L27
    L23:
        r59 = r1.getText(r49);     // Catch: Throwable -> L50
        goto L22
    L18:
        r87 = r0;
        r55 = r1.getText(r36);     // Catch: Throwable -> L50
        goto L19
    L14:
        r50 = r1.getText(r10);     // Catch: Throwable -> L50
        goto L15
    L10:
        r45 = r1.getText(r6);     // Catch: Throwable -> L50
        goto L11
    L52:
        ArrayList r92 = r15;
        r1.close();
        return r92;
    L50:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ long[] XIi00iiXO(HealthyReportDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfHealthyReport.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ HealthyReport XO0O10(long r81, SQLiteConnection r83) {
        SQLiteStatement r1 = r83.prepare("SELECT * FROM healthyReport WHERE  mId = ?");
        r1.mo3338bindLong(1, r81);     // Catch: Throwable -> L49
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L49
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserGender");     // Catch: Throwable -> L49
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserWeight");     // Catch: Throwable -> L49
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mUserHeight");     // Catch: Throwable -> L49
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L49
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L49
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAbnormalNumber");     // Catch: Throwable -> L49
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateTime");     // Catch: Throwable -> L49
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateValue");     // Catch: Throwable -> L49
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mHeartRateAIRecords");     // Catch: Throwable -> L49
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodPressureTime");     // Catch: Throwable -> L49
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSystolicValue");     // Catch: Throwable -> L49
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDiastolicValue");     // Catch: Throwable -> L49
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodPressureAIRecords");     // Catch: Throwable -> L49
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenTime");     // Catch: Throwable -> L49
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenValue");     // Catch: Throwable -> L49
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodOxygenAIRecords");     // Catch: Throwable -> L49
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepTime");     // Catch: Throwable -> L49
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepDeepLengthTime");     // Catch: Throwable -> L49
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepPiecemealTime");     // Catch: Throwable -> L49
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mSleepAIRecords");     // Catch: Throwable -> L49
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureTime");     // Catch: Throwable -> L49
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureValue");     // Catch: Throwable -> L49
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mPressureAIRecords");     // Catch: Throwable -> L49
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2Time");     // Catch: Throwable -> L49
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2Value");     // Catch: Throwable -> L49
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBloodGlucose2AIRecords");     // Catch: Throwable -> L49
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightTime");     // Catch: Throwable -> L49
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightValue");     // Catch: Throwable -> L49
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightAIRecords");     // Catch: Throwable -> L49
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsTime");     // Catch: Throwable -> L49
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsNumber");     // Catch: Throwable -> L49
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsAllTime");     // Catch: Throwable -> L49
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeekSportsAIRecords");     // Catch: Throwable -> L49
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L49
        HealthyReport r34 = null;
        String r35 = null;
        if (r1.step() == false) goto L51;
        int r20 = (int) r1.getLong(r0);     // Catch: Throwable -> L49
        int r21 = (int) r1.getLong(r2);     // Catch: Throwable -> L49
        float r22 = (float) r1.getDouble(r3);     // Catch: Throwable -> L49
        float r23 = (float) r1.getDouble(r4);     // Catch: Throwable -> L49
        long r41 = r1.getLong(r5);     // Catch: Throwable -> L49
        if (r1.isNull(r6) == false) goto L8;
        String r43 = null;
    L9:
        int r24 = (int) r1.getLong(r7);     // Catch: Throwable -> L49
        long r45 = r1.getLong(r8);     // Catch: Throwable -> L49
        int r25 = (int) r1.getLong(r9);     // Catch: Throwable -> L49
        if (r1.isNull(r10) == false) goto L12;
        String r48 = null;
    L13:
        long r49 = r1.getLong(r11);     // Catch: Throwable -> L49
        int r26 = (int) r1.getLong(r12);     // Catch: Throwable -> L49
        int r27 = (int) r1.getLong(r13);     // Catch: Throwable -> L49
        if (r1.isNull(r14) == false) goto L17;
        String r53 = null;
    L18:
        long r54 = r1.getLong(r15);     // Catch: Throwable -> L49
        int r28 = (int) r1.getLong(r16);     // Catch: Throwable -> L49
        if (r1.isNull(r17) == false) goto L22;
        String r57 = null;
    L23:
        long r58 = r1.getLong(r18);     // Catch: Throwable -> L49
        float r126 = (float) r1.getDouble(r19);     // Catch: Throwable -> L49
        float r127 = (float) r1.getDouble(r110);     // Catch: Throwable -> L49
        if (r1.isNull(r111) == false) goto L27;
        String r62 = null;
    L28:
        long r63 = r1.getLong(r112);     // Catch: Throwable -> L49
        int r128 = (int) r1.getLong(r113);     // Catch: Throwable -> L49
        if (r1.isNull(r114) == false) goto L32;
        String r66 = null;
    L33:
        long r67 = r1.getLong(r115);     // Catch: Throwable -> L49
        float r129 = (float) r1.getDouble(r116);     // Catch: Throwable -> L49
        if (r1.isNull(r117) == false) goto L37;
        String r70 = null;
    L38:
        long r71 = r1.getLong(r118);     // Catch: Throwable -> L49
        float r130 = (float) r1.getDouble(r119);     // Catch: Throwable -> L49
        if (r1.isNull(r120) == false) goto L42;
        String r74 = null;
    L43:
        long r75 = r1.getLong(r121);     // Catch: Throwable -> L49
        int r29 = (int) r1.getLong(r122);     // Catch: Throwable -> L49
        int r30 = (int) r1.getLong(r123);     // Catch: Throwable -> L49
        if (r1.isNull(r124) == true) goto L47;
        r35 = r1.getText(r124);     // Catch: Throwable -> L49
    L47:
        r34 = new HealthyReport(r20, r21, r22, r23, r41, r43, r24, r45, r25, r48, r49, r26, r27, r53, r54, r28, r57, r58, r126, r127, r62, r63, r128, r66, r67, r129, r70, r71, r130, r74, r75, r29, r30, r35, (int) r1.getLong(r125));     // Catch: Throwable -> L49
        goto L51
    L42:
        r74 = r1.getText(r120);     // Catch: Throwable -> L49
        goto L43
    L37:
        r70 = r1.getText(r117);     // Catch: Throwable -> L49
        goto L38
    L32:
        r66 = r1.getText(r114);     // Catch: Throwable -> L49
        goto L33
    L27:
        r62 = r1.getText(r111);     // Catch: Throwable -> L49
        goto L28
    L22:
        r57 = r1.getText(r17);     // Catch: Throwable -> L49
        goto L23
    L17:
        r53 = r1.getText(r14);     // Catch: Throwable -> L49
        goto L18
    L12:
        r48 = r1.getText(r10);     // Catch: Throwable -> L49
        goto L13
    L8:
        r43 = r1.getText(r6);     // Catch: Throwable -> L49
    L51:
        r1.close();
        return r34;
    L49:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Long iO(HealthyReportDao_Impl r0, HealthyReport r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfHealthyReport_1.insertAndReturnId(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.HealthyReportDao
    public HealthyReport getHealthyReport(final long id) {
        return (HealthyReport) DBUtil.performBlocking(this.__db, true, false, new X11iIii00(id));
    }

    @Override // com.sma.smartv3.db.dao.HealthyReportDao
    public List<HealthyReport> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new iOOXXI1O());
    }

    @Override // com.sma.smartv3.db.dao.HealthyReportDao
    public long[] insert(final List<HealthyReport> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new iXXXXXI(this, list));
    }

    @Override // com.sma.smartv3.db.dao.HealthyReportDao
    public int update(final List<HealthyReport> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new O00OO1iO(this, lists))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.HealthyReportDao
    public long insert(final HealthyReport mHealthyReport) {
        mHealthyReport.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new O1IOXOI(this, mHealthyReport))).longValue();
    }
}
