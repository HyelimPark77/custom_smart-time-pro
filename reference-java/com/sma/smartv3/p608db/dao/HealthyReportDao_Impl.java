package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.HealthyReportDao_Impl;
import com.sma.smartv3.p608db.entity.HealthyReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class HealthyReportDao_Impl implements HealthyReportDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HealthyReport> __insertAdapterOfHealthyReport = new EntityInsertAdapter<HealthyReport>() { // from class: com.sma.smartv3.db.dao.HealthyReportDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `HealthyReport` (`mId`,`mUserGender`,`mUserWeight`,`mUserHeight`,`mTime`,`mLocalTime`,`mAbnormalNumber`,`mHeartRateTime`,`mHeartRateValue`,`mHeartRateAIRecords`,`mBloodPressureTime`,`mSystolicValue`,`mDiastolicValue`,`mBloodPressureAIRecords`,`mBloodOxygenTime`,`mBloodOxygenValue`,`mBloodOxygenAIRecords`,`mSleepTime`,`mSleepDeepLengthTime`,`mSleepPiecemealTime`,`mSleepAIRecords`,`mPressureTime`,`mPressureValue`,`mPressureAIRecords`,`mBloodGlucose2Time`,`mBloodGlucose2Value`,`mBloodGlucose2AIRecords`,`mWeightTime`,`mWeightValue`,`mWeightAIRecords`,`mWeekSportsTime`,`mWeekSportsNumber`,`mWeekSportsAllTime`,`mWeekSportsAIRecords`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HealthyReport entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMUserGender());
            statement.mo47598bindDouble(3, entity.getMUserWeight());
            statement.mo47598bindDouble(4, entity.getMUserHeight());
            statement.mo47599bindLong(5, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMLocalTime());
            }
            statement.mo47599bindLong(7, entity.getMAbnormalNumber());
            statement.mo47599bindLong(8, entity.getMHeartRateTime());
            statement.mo47599bindLong(9, entity.getMHeartRateValue());
            if (entity.getMHeartRateAIRecords() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMHeartRateAIRecords());
            }
            statement.mo47599bindLong(11, entity.getMBloodPressureTime());
            statement.mo47599bindLong(12, entity.getMSystolicValue());
            statement.mo47599bindLong(13, entity.getMDiastolicValue());
            if (entity.getMBloodPressureAIRecords() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMBloodPressureAIRecords());
            }
            statement.mo47599bindLong(15, entity.getMBloodOxygenTime());
            statement.mo47599bindLong(16, entity.getMBloodOxygenValue());
            if (entity.getMBloodOxygenAIRecords() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getMBloodOxygenAIRecords());
            }
            statement.mo47599bindLong(18, entity.getMSleepTime());
            statement.mo47598bindDouble(19, entity.getMSleepDeepLengthTime());
            statement.mo47598bindDouble(20, entity.getMSleepPiecemealTime());
            if (entity.getMSleepAIRecords() == null) {
                statement.mo47600bindNull(21);
            } else {
                statement.mo47601bindText(21, entity.getMSleepAIRecords());
            }
            statement.mo47599bindLong(22, entity.getMPressureTime());
            statement.mo47599bindLong(23, entity.getMPressureValue());
            if (entity.getMPressureAIRecords() == null) {
                statement.mo47600bindNull(24);
            } else {
                statement.mo47601bindText(24, entity.getMPressureAIRecords());
            }
            statement.mo47599bindLong(25, entity.getMBloodGlucose2Time());
            statement.mo47598bindDouble(26, entity.getMBloodGlucose2Value());
            if (entity.getMBloodGlucose2AIRecords() == null) {
                statement.mo47600bindNull(27);
            } else {
                statement.mo47601bindText(27, entity.getMBloodGlucose2AIRecords());
            }
            statement.mo47599bindLong(28, entity.getMWeightTime());
            statement.mo47598bindDouble(29, entity.getMWeightValue());
            if (entity.getMWeightAIRecords() == null) {
                statement.mo47600bindNull(30);
            } else {
                statement.mo47601bindText(30, entity.getMWeightAIRecords());
            }
            statement.mo47599bindLong(31, entity.getMWeekSportsTime());
            statement.mo47599bindLong(32, entity.getMWeekSportsNumber());
            statement.mo47599bindLong(33, entity.getMWeekSportsAllTime());
            if (entity.getMWeekSportsAIRecords() == null) {
                statement.mo47600bindNull(34);
            } else {
                statement.mo47601bindText(34, entity.getMWeekSportsAIRecords());
            }
            statement.mo47599bindLong(35, entity.getMIsSync());
        }
    };
    private final EntityInsertAdapter<HealthyReport> __insertAdapterOfHealthyReport_1 = new EntityInsertAdapter<HealthyReport>() { // from class: com.sma.smartv3.db.dao.HealthyReportDao_Impl.2
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `HealthyReport` (`mId`,`mUserGender`,`mUserWeight`,`mUserHeight`,`mTime`,`mLocalTime`,`mAbnormalNumber`,`mHeartRateTime`,`mHeartRateValue`,`mHeartRateAIRecords`,`mBloodPressureTime`,`mSystolicValue`,`mDiastolicValue`,`mBloodPressureAIRecords`,`mBloodOxygenTime`,`mBloodOxygenValue`,`mBloodOxygenAIRecords`,`mSleepTime`,`mSleepDeepLengthTime`,`mSleepPiecemealTime`,`mSleepAIRecords`,`mPressureTime`,`mPressureValue`,`mPressureAIRecords`,`mBloodGlucose2Time`,`mBloodGlucose2Value`,`mBloodGlucose2AIRecords`,`mWeightTime`,`mWeightValue`,`mWeightAIRecords`,`mWeekSportsTime`,`mWeekSportsNumber`,`mWeekSportsAllTime`,`mWeekSportsAIRecords`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HealthyReport entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMUserGender());
            statement.mo47598bindDouble(3, entity.getMUserWeight());
            statement.mo47598bindDouble(4, entity.getMUserHeight());
            statement.mo47599bindLong(5, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMLocalTime());
            }
            statement.mo47599bindLong(7, entity.getMAbnormalNumber());
            statement.mo47599bindLong(8, entity.getMHeartRateTime());
            statement.mo47599bindLong(9, entity.getMHeartRateValue());
            if (entity.getMHeartRateAIRecords() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMHeartRateAIRecords());
            }
            statement.mo47599bindLong(11, entity.getMBloodPressureTime());
            statement.mo47599bindLong(12, entity.getMSystolicValue());
            statement.mo47599bindLong(13, entity.getMDiastolicValue());
            if (entity.getMBloodPressureAIRecords() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMBloodPressureAIRecords());
            }
            statement.mo47599bindLong(15, entity.getMBloodOxygenTime());
            statement.mo47599bindLong(16, entity.getMBloodOxygenValue());
            if (entity.getMBloodOxygenAIRecords() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getMBloodOxygenAIRecords());
            }
            statement.mo47599bindLong(18, entity.getMSleepTime());
            statement.mo47598bindDouble(19, entity.getMSleepDeepLengthTime());
            statement.mo47598bindDouble(20, entity.getMSleepPiecemealTime());
            if (entity.getMSleepAIRecords() == null) {
                statement.mo47600bindNull(21);
            } else {
                statement.mo47601bindText(21, entity.getMSleepAIRecords());
            }
            statement.mo47599bindLong(22, entity.getMPressureTime());
            statement.mo47599bindLong(23, entity.getMPressureValue());
            if (entity.getMPressureAIRecords() == null) {
                statement.mo47600bindNull(24);
            } else {
                statement.mo47601bindText(24, entity.getMPressureAIRecords());
            }
            statement.mo47599bindLong(25, entity.getMBloodGlucose2Time());
            statement.mo47598bindDouble(26, entity.getMBloodGlucose2Value());
            if (entity.getMBloodGlucose2AIRecords() == null) {
                statement.mo47600bindNull(27);
            } else {
                statement.mo47601bindText(27, entity.getMBloodGlucose2AIRecords());
            }
            statement.mo47599bindLong(28, entity.getMWeightTime());
            statement.mo47598bindDouble(29, entity.getMWeightValue());
            if (entity.getMWeightAIRecords() == null) {
                statement.mo47600bindNull(30);
            } else {
                statement.mo47601bindText(30, entity.getMWeightAIRecords());
            }
            statement.mo47599bindLong(31, entity.getMWeekSportsTime());
            statement.mo47599bindLong(32, entity.getMWeekSportsNumber());
            statement.mo47599bindLong(33, entity.getMWeekSportsAllTime());
            if (entity.getMWeekSportsAIRecords() == null) {
                statement.mo47600bindNull(34);
            } else {
                statement.mo47601bindText(34, entity.getMWeekSportsAIRecords());
            }
            statement.mo47599bindLong(35, entity.getMIsSync());
        }
    };
    private final EntityDeleteOrUpdateAdapter<HealthyReport> __updateAdapterOfHealthyReport = new EntityDeleteOrUpdateAdapter<HealthyReport>() { // from class: com.sma.smartv3.db.dao.HealthyReportDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `HealthyReport` SET `mId` = ?,`mUserGender` = ?,`mUserWeight` = ?,`mUserHeight` = ?,`mTime` = ?,`mLocalTime` = ?,`mAbnormalNumber` = ?,`mHeartRateTime` = ?,`mHeartRateValue` = ?,`mHeartRateAIRecords` = ?,`mBloodPressureTime` = ?,`mSystolicValue` = ?,`mDiastolicValue` = ?,`mBloodPressureAIRecords` = ?,`mBloodOxygenTime` = ?,`mBloodOxygenValue` = ?,`mBloodOxygenAIRecords` = ?,`mSleepTime` = ?,`mSleepDeepLengthTime` = ?,`mSleepPiecemealTime` = ?,`mSleepAIRecords` = ?,`mPressureTime` = ?,`mPressureValue` = ?,`mPressureAIRecords` = ?,`mBloodGlucose2Time` = ?,`mBloodGlucose2Value` = ?,`mBloodGlucose2AIRecords` = ?,`mWeightTime` = ?,`mWeightValue` = ?,`mWeightAIRecords` = ?,`mWeekSportsTime` = ?,`mWeekSportsNumber` = ?,`mWeekSportsAllTime` = ?,`mWeekSportsAIRecords` = ?,`mIsSync` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HealthyReport entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMUserGender());
            statement.mo47598bindDouble(3, entity.getMUserWeight());
            statement.mo47598bindDouble(4, entity.getMUserHeight());
            statement.mo47599bindLong(5, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMLocalTime());
            }
            statement.mo47599bindLong(7, entity.getMAbnormalNumber());
            statement.mo47599bindLong(8, entity.getMHeartRateTime());
            statement.mo47599bindLong(9, entity.getMHeartRateValue());
            if (entity.getMHeartRateAIRecords() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMHeartRateAIRecords());
            }
            statement.mo47599bindLong(11, entity.getMBloodPressureTime());
            statement.mo47599bindLong(12, entity.getMSystolicValue());
            statement.mo47599bindLong(13, entity.getMDiastolicValue());
            if (entity.getMBloodPressureAIRecords() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMBloodPressureAIRecords());
            }
            statement.mo47599bindLong(15, entity.getMBloodOxygenTime());
            statement.mo47599bindLong(16, entity.getMBloodOxygenValue());
            if (entity.getMBloodOxygenAIRecords() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getMBloodOxygenAIRecords());
            }
            statement.mo47599bindLong(18, entity.getMSleepTime());
            statement.mo47598bindDouble(19, entity.getMSleepDeepLengthTime());
            statement.mo47598bindDouble(20, entity.getMSleepPiecemealTime());
            if (entity.getMSleepAIRecords() == null) {
                statement.mo47600bindNull(21);
            } else {
                statement.mo47601bindText(21, entity.getMSleepAIRecords());
            }
            statement.mo47599bindLong(22, entity.getMPressureTime());
            statement.mo47599bindLong(23, entity.getMPressureValue());
            if (entity.getMPressureAIRecords() == null) {
                statement.mo47600bindNull(24);
            } else {
                statement.mo47601bindText(24, entity.getMPressureAIRecords());
            }
            statement.mo47599bindLong(25, entity.getMBloodGlucose2Time());
            statement.mo47598bindDouble(26, entity.getMBloodGlucose2Value());
            if (entity.getMBloodGlucose2AIRecords() == null) {
                statement.mo47600bindNull(27);
            } else {
                statement.mo47601bindText(27, entity.getMBloodGlucose2AIRecords());
            }
            statement.mo47599bindLong(28, entity.getMWeightTime());
            statement.mo47598bindDouble(29, entity.getMWeightValue());
            if (entity.getMWeightAIRecords() == null) {
                statement.mo47600bindNull(30);
            } else {
                statement.mo47601bindText(30, entity.getMWeightAIRecords());
            }
            statement.mo47599bindLong(31, entity.getMWeekSportsTime());
            statement.mo47599bindLong(32, entity.getMWeekSportsNumber());
            statement.mo47599bindLong(33, entity.getMWeekSportsAllTime());
            if (entity.getMWeekSportsAIRecords() == null) {
                statement.mo47600bindNull(34);
            } else {
                statement.mo47601bindText(34, entity.getMWeekSportsAIRecords());
            }
            statement.mo47599bindLong(35, entity.getMIsSync());
            statement.mo47599bindLong(36, entity.getMId());
        }
    };

    public HealthyReportDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM healthyReport WHERE  mTime > 0  ORDER BY mTime ASC LIMIT 150");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserGender");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserWeight");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserHeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAbnormalNumber");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateAIRecords");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodPressureTime");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSystolicValue");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDiastolicValue");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodPressureAIRecords");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenTime");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenValue");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenAIRecords");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepDeepLengthTime");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepPiecemealTime");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepAIRecords");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureTime");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureValue");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureAIRecords");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2Time");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2Value");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2AIRecords");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightTime");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightValue");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightAIRecords");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsTime");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsNumber");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsAllTime");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsAIRecords");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                float f2 = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i2);
                }
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow15);
                int i11 = columnIndexOrThrow15;
                int i12 = columnIndexOrThrow16;
                int i13 = (int) sQLiteStatementPrepare.getLong(i12);
                int i14 = columnIndexOrThrow17;
                String text4 = sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14);
                int i15 = columnIndexOrThrow18;
                long j5 = sQLiteStatementPrepare.getLong(i15);
                columnIndexOrThrow18 = i15;
                int i16 = columnIndexOrThrow19;
                float f3 = (float) sQLiteStatementPrepare.getDouble(i16);
                int i17 = columnIndexOrThrow5;
                int i18 = columnIndexOrThrow20;
                int i19 = columnIndexOrThrow4;
                float f4 = (float) sQLiteStatementPrepare.getDouble(i18);
                int i20 = columnIndexOrThrow21;
                String text5 = sQLiteStatementPrepare.isNull(i20) ? null : sQLiteStatementPrepare.getText(i20);
                int i21 = columnIndexOrThrow22;
                long j6 = sQLiteStatementPrepare.getLong(i21);
                columnIndexOrThrow22 = i21;
                int i22 = columnIndexOrThrow23;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow24;
                String text6 = sQLiteStatementPrepare.isNull(i24) ? null : sQLiteStatementPrepare.getText(i24);
                int i25 = columnIndexOrThrow25;
                long j7 = sQLiteStatementPrepare.getLong(i25);
                columnIndexOrThrow25 = i25;
                int i26 = columnIndexOrThrow26;
                float f5 = (float) sQLiteStatementPrepare.getDouble(i26);
                int i27 = columnIndexOrThrow27;
                String text7 = sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27);
                int i28 = columnIndexOrThrow28;
                long j8 = sQLiteStatementPrepare.getLong(i28);
                columnIndexOrThrow28 = i28;
                int i29 = columnIndexOrThrow29;
                float f6 = (float) sQLiteStatementPrepare.getDouble(i29);
                int i30 = columnIndexOrThrow30;
                String text8 = sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30);
                int i31 = columnIndexOrThrow31;
                long j9 = sQLiteStatementPrepare.getLong(i31);
                columnIndexOrThrow31 = i31;
                int i32 = columnIndexOrThrow32;
                int i33 = (int) sQLiteStatementPrepare.getLong(i32);
                int i34 = columnIndexOrThrow33;
                int i35 = columnIndexOrThrow34;
                int i36 = columnIndexOrThrow35;
                arrayList2.add(new HealthyReport(i3, i4, f, f2, j, text2, i7, j2, i8, text3, j3, i9, i10, text, j4, i13, text4, j5, f3, f4, text5, j6, i23, text6, j7, f5, text7, j8, f6, text8, j9, i33, (int) sQLiteStatementPrepare.getLong(i34), sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35), (int) sQLiteStatementPrepare.getLong(i36)));
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow16 = i12;
                columnIndexOrThrow17 = i14;
                columnIndexOrThrow4 = i19;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow26 = i26;
                columnIndexOrThrow27 = i27;
                columnIndexOrThrow29 = i29;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow21 = i20;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow33 = i34;
                columnIndexOrThrow35 = i36;
                arrayList = arrayList2;
                columnIndexOrThrow34 = i35;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow5 = i17;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = i11;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ HealthyReport XO0O10(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM healthyReport WHERE  mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserGender");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserWeight");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserHeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAbnormalNumber");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeartRateAIRecords");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodPressureTime");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSystolicValue");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDiastolicValue");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodPressureAIRecords");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenTime");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenValue");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodOxygenAIRecords");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepDeepLengthTime");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepPiecemealTime");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSleepAIRecords");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureTime");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureValue");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPressureAIRecords");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2Time");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2Value");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBloodGlucose2AIRecords");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightTime");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightValue");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightAIRecords");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsTime");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsNumber");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsAllTime");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeekSportsAIRecords");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            HealthyReport healthyReport = null;
            if (sQLiteStatementPrepare.step()) {
                healthyReport = new HealthyReport((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.getLong(columnIndexOrThrow15), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.getLong(columnIndexOrThrow18), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow19), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow20), sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21), sQLiteStatementPrepare.getLong(columnIndexOrThrow22), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), sQLiteStatementPrepare.getLong(columnIndexOrThrow25), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow26), sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27), sQLiteStatementPrepare.getLong(columnIndexOrThrow28), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow29), sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30), sQLiteStatementPrepare.getLong(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33), sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35));
            }
            return healthyReport;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.p608db.dao.HealthyReportDao
    public HealthyReport getHealthyReport(final long id) {
        return (HealthyReport) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X11iIii00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthyReportDao_Impl.XO0O10(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.HealthyReportDao
    public List<HealthyReport> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iOOXXI1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthyReportDao_Impl.OXO1((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.HealthyReportDao
    public long[] insert(final List<HealthyReport> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXXXXXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f8410IO.__insertAdapterOfHealthyReport.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.HealthyReportDao
    public int update(final List<HealthyReport> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.O00OO1iO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f2374IO.__updateAdapterOfHealthyReport.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.HealthyReportDao
    public long insert(final HealthyReport mHealthyReport) {
        mHealthyReport.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1IOXOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f2711IO.__insertAdapterOfHealthyReport_1.insertAndReturnId((SQLiteConnection) obj, mHealthyReport));
            }
        })).longValue();
    }
}
