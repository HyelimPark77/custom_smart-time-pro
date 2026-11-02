package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.MatchRecordDao_Impl;
import com.sma.smartv3.p608db.entity.MatchLog;
import com.sma.smartv3.p608db.entity.MatchPeriod;
import com.sma.smartv3.p608db.entity.MatchRecord;
import com.sma.smartv3.p608db.entity.MatchRecordConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class MatchRecordDao_Impl implements MatchRecordDao {
    private final RoomDatabase __db;
    private final MatchRecordConverter __matchRecordConverter = new MatchRecordConverter();
    private final EntityInsertAdapter<MatchRecord> __insertAdapterOfMatchRecord = new EntityInsertAdapter<MatchRecord>() { // from class: com.sma.smartv3.db.dao.MatchRecordDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `MatchRecord` (`mId`,`mStart`,`mLocalTime`,`mType`,`mPeriodListSize`,`mLogListSize`,`mIsSync`,`mIsDelete`,`mSource`,`mIsStopWatchData`,`mStopWatchList`,`mTeamInfo`,`mWeather`,`mHomeTeamScore`,`mGuestTeamScore`,`mMode`,`mMinBpm`,`mAirPressure`,`mPace`,`mMaxPace`,`mMinPace`,`mSpm`,`mMaxSpm`,`mMinSpm`,`mAltitude`,`mMaxAltitude`,`mMinAltitude`,`p_mId`,`p_mMatchRecordId`,`p_mDuration`,`p_mDistance`,`p_mStep`,`p_mCalorie`,`p_mSpeed`,`p_mAvgBpm`,`p_mMaxBpm`,`p_mMaxSpeed`,`p_mIsSync`,`p_mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final MatchRecord entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMStart());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMType());
            statement.mo47599bindLong(5, entity.getMPeriodListSize());
            statement.mo47599bindLong(6, entity.getMLogListSize());
            statement.mo47599bindLong(7, entity.getMIsSync());
            statement.mo47599bindLong(8, entity.getMIsDelete());
            statement.mo47599bindLong(9, entity.getMSource());
            statement.mo47599bindLong(10, entity.getMIsStopWatchData());
            String strStopWatchListToString = MatchRecordDao_Impl.this.__matchRecordConverter.stopWatchListToString(entity.getMStopWatchList());
            if (strStopWatchListToString == null) {
                statement.mo47600bindNull(11);
            } else {
                statement.mo47601bindText(11, strStopWatchListToString);
            }
            String strTeamInfoToString = MatchRecordDao_Impl.this.__matchRecordConverter.teamInfoToString(entity.getMTeamInfo());
            if (strTeamInfoToString == null) {
                statement.mo47600bindNull(12);
            } else {
                statement.mo47601bindText(12, strTeamInfoToString);
            }
            String strWeatherToString = MatchRecordDao_Impl.this.__matchRecordConverter.weatherToString(entity.getMWeather());
            if (strWeatherToString == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, strWeatherToString);
            }
            statement.mo47599bindLong(14, entity.getMHomeTeamScore());
            statement.mo47599bindLong(15, entity.getMGuestTeamScore());
            statement.mo47599bindLong(16, entity.getMMode());
            statement.mo47599bindLong(17, entity.getMMinBpm());
            statement.mo47599bindLong(18, entity.getMAirPressure());
            statement.mo47599bindLong(19, entity.getMPace());
            statement.mo47599bindLong(20, entity.getMMaxPace());
            statement.mo47599bindLong(21, entity.getMMinPace());
            statement.mo47599bindLong(22, entity.getMSpm());
            statement.mo47599bindLong(23, entity.getMMaxSpm());
            statement.mo47599bindLong(24, entity.getMMinSpm());
            statement.mo47599bindLong(25, entity.getMAltitude());
            statement.mo47599bindLong(26, entity.getMMaxAltitude());
            statement.mo47599bindLong(27, entity.getMMinAltitude());
            MatchPeriod mPeriod = entity.getMPeriod();
            statement.mo47599bindLong(28, mPeriod.getMId());
            statement.mo47599bindLong(29, mPeriod.getMMatchRecordId());
            statement.mo47599bindLong(30, mPeriod.getMDuration());
            statement.mo47599bindLong(31, mPeriod.getMDistance());
            statement.mo47599bindLong(32, mPeriod.getMStep());
            statement.mo47599bindLong(33, mPeriod.getMCalorie());
            statement.mo47599bindLong(34, mPeriod.getMSpeed());
            statement.mo47599bindLong(35, mPeriod.getMAvgBpm());
            statement.mo47599bindLong(36, mPeriod.getMMaxBpm());
            statement.mo47599bindLong(37, mPeriod.getMMaxSpeed());
            statement.mo47599bindLong(38, mPeriod.getMIsSync());
            statement.mo47599bindLong(39, mPeriod.getMIsDelete());
        }
    };
    private final EntityInsertAdapter<MatchPeriod> __insertAdapterOfMatchPeriod = new EntityInsertAdapter<MatchPeriod>() { // from class: com.sma.smartv3.db.dao.MatchRecordDao_Impl.2
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `MatchPeriod` (`mId`,`mMatchRecordId`,`mDuration`,`mDistance`,`mStep`,`mCalorie`,`mSpeed`,`mAvgBpm`,`mMaxBpm`,`mMaxSpeed`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final MatchPeriod entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMMatchRecordId());
            statement.mo47599bindLong(3, entity.getMDuration());
            statement.mo47599bindLong(4, entity.getMDistance());
            statement.mo47599bindLong(5, entity.getMStep());
            statement.mo47599bindLong(6, entity.getMCalorie());
            statement.mo47599bindLong(7, entity.getMSpeed());
            statement.mo47599bindLong(8, entity.getMAvgBpm());
            statement.mo47599bindLong(9, entity.getMMaxBpm());
            statement.mo47599bindLong(10, entity.getMMaxSpeed());
            statement.mo47599bindLong(11, entity.getMIsSync());
            statement.mo47599bindLong(12, entity.getMIsDelete());
        }
    };
    private final EntityInsertAdapter<MatchLog> __insertAdapterOfMatchLog = new EntityInsertAdapter<MatchLog>() { // from class: com.sma.smartv3.db.dao.MatchRecordDao_Impl.3
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `MatchLog` (`mId`,`mMatchRecordId`,`mTime`,`mCountingTime`,`mPeriodTime`,`mPeriodNumber`,`mType`,`mCount`,`mCancelType`,`mTeam`,`mPlayer`,`mOtherType`,`mStopWatchTotal`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final MatchLog entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMMatchRecordId());
            statement.mo47599bindLong(3, entity.getMTime());
            statement.mo47599bindLong(4, entity.getMCountingTime());
            statement.mo47599bindLong(5, entity.getMPeriodTime());
            statement.mo47599bindLong(6, entity.getMPeriodNumber());
            statement.mo47599bindLong(7, entity.getMType());
            statement.mo47599bindLong(8, entity.getMCount());
            statement.mo47599bindLong(9, entity.getMCancelType());
            statement.mo47599bindLong(10, entity.getMTeam());
            statement.mo47599bindLong(11, entity.getMPlayer());
            statement.mo47599bindLong(12, entity.getMOtherType());
            statement.mo47599bindLong(13, entity.getMStopWatchTotal());
            statement.mo47599bindLong(14, entity.getMIsSync());
            statement.mo47599bindLong(15, entity.getMIsDelete());
        }
    };
    private final EntityDeleteOrUpdateAdapter<MatchRecord> __updateAdapterOfMatchRecord = new EntityDeleteOrUpdateAdapter<MatchRecord>() { // from class: com.sma.smartv3.db.dao.MatchRecordDao_Impl.4
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `MatchRecord` SET `mId` = ?,`mStart` = ?,`mLocalTime` = ?,`mType` = ?,`mPeriodListSize` = ?,`mLogListSize` = ?,`mIsSync` = ?,`mIsDelete` = ?,`mSource` = ?,`mIsStopWatchData` = ?,`mStopWatchList` = ?,`mTeamInfo` = ?,`mWeather` = ?,`mHomeTeamScore` = ?,`mGuestTeamScore` = ?,`mMode` = ?,`mMinBpm` = ?,`mAirPressure` = ?,`mPace` = ?,`mMaxPace` = ?,`mMinPace` = ?,`mSpm` = ?,`mMaxSpm` = ?,`mMinSpm` = ?,`mAltitude` = ?,`mMaxAltitude` = ?,`mMinAltitude` = ?,`p_mId` = ?,`p_mMatchRecordId` = ?,`p_mDuration` = ?,`p_mDistance` = ?,`p_mStep` = ?,`p_mCalorie` = ?,`p_mSpeed` = ?,`p_mAvgBpm` = ?,`p_mMaxBpm` = ?,`p_mMaxSpeed` = ?,`p_mIsSync` = ?,`p_mIsDelete` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final MatchRecord entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMStart());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMType());
            statement.mo47599bindLong(5, entity.getMPeriodListSize());
            statement.mo47599bindLong(6, entity.getMLogListSize());
            statement.mo47599bindLong(7, entity.getMIsSync());
            statement.mo47599bindLong(8, entity.getMIsDelete());
            statement.mo47599bindLong(9, entity.getMSource());
            statement.mo47599bindLong(10, entity.getMIsStopWatchData());
            String strStopWatchListToString = MatchRecordDao_Impl.this.__matchRecordConverter.stopWatchListToString(entity.getMStopWatchList());
            if (strStopWatchListToString == null) {
                statement.mo47600bindNull(11);
            } else {
                statement.mo47601bindText(11, strStopWatchListToString);
            }
            String strTeamInfoToString = MatchRecordDao_Impl.this.__matchRecordConverter.teamInfoToString(entity.getMTeamInfo());
            if (strTeamInfoToString == null) {
                statement.mo47600bindNull(12);
            } else {
                statement.mo47601bindText(12, strTeamInfoToString);
            }
            String strWeatherToString = MatchRecordDao_Impl.this.__matchRecordConverter.weatherToString(entity.getMWeather());
            if (strWeatherToString == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, strWeatherToString);
            }
            statement.mo47599bindLong(14, entity.getMHomeTeamScore());
            statement.mo47599bindLong(15, entity.getMGuestTeamScore());
            statement.mo47599bindLong(16, entity.getMMode());
            statement.mo47599bindLong(17, entity.getMMinBpm());
            statement.mo47599bindLong(18, entity.getMAirPressure());
            statement.mo47599bindLong(19, entity.getMPace());
            statement.mo47599bindLong(20, entity.getMMaxPace());
            statement.mo47599bindLong(21, entity.getMMinPace());
            statement.mo47599bindLong(22, entity.getMSpm());
            statement.mo47599bindLong(23, entity.getMMaxSpm());
            statement.mo47599bindLong(24, entity.getMMinSpm());
            statement.mo47599bindLong(25, entity.getMAltitude());
            statement.mo47599bindLong(26, entity.getMMaxAltitude());
            statement.mo47599bindLong(27, entity.getMMinAltitude());
            MatchPeriod mPeriod = entity.getMPeriod();
            statement.mo47599bindLong(28, mPeriod.getMId());
            statement.mo47599bindLong(29, mPeriod.getMMatchRecordId());
            statement.mo47599bindLong(30, mPeriod.getMDuration());
            statement.mo47599bindLong(31, mPeriod.getMDistance());
            statement.mo47599bindLong(32, mPeriod.getMStep());
            statement.mo47599bindLong(33, mPeriod.getMCalorie());
            statement.mo47599bindLong(34, mPeriod.getMSpeed());
            statement.mo47599bindLong(35, mPeriod.getMAvgBpm());
            statement.mo47599bindLong(36, mPeriod.getMMaxBpm());
            statement.mo47599bindLong(37, mPeriod.getMMaxSpeed());
            statement.mo47599bindLong(38, mPeriod.getMIsSync());
            statement.mo47599bindLong(39, mPeriod.getMIsDelete());
            statement.mo47599bindLong(40, entity.getMId());
        }
    };

    public MatchRecordDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ Object I0iXXO(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MatchRecord WHERE mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ List m38178IO(MatchRecordDao_Impl matchRecordDao_Impl, int i, SQLiteConnection sQLiteConnection) {
        matchRecordDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStart");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPeriodListSize");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLogListSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSource");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsStopWatchData");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStopWatchList");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTeamInfo");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeather");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHomeTeamScore");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mGuestTeamScore");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMode");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinBpm");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAirPressure");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPace");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxPace");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinPace");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpm");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxSpm");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinSpm");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAltitude");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxAltitude");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinAltitude");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mId");
            int i2 = columnIndexOrThrow13;
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMatchRecordId");
            int i3 = columnIndexOrThrow12;
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDuration");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDistance");
            int i4 = columnIndexOrThrow11;
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mStep");
            int i5 = columnIndexOrThrow10;
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mCalorie");
            int i6 = columnIndexOrThrow9;
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mSpeed");
            int i7 = columnIndexOrThrow8;
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mAvgBpm");
            int i8 = columnIndexOrThrow7;
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxBpm");
            int i9 = columnIndexOrThrow6;
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxSpeed");
            int i10 = columnIndexOrThrow5;
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsSync");
            int i11 = columnIndexOrThrow4;
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsDelete");
            int i12 = columnIndexOrThrow3;
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i13 = columnIndexOrThrow2;
                ArrayList arrayList2 = arrayList;
                MatchPeriod matchPeriod = new MatchPeriod((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow37), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow38), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow39));
                MatchRecord matchRecord = new MatchRecord();
                int i14 = columnIndexOrThrow39;
                int i15 = columnIndexOrThrow38;
                matchRecord.setMId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                int i16 = columnIndexOrThrow37;
                matchRecord.setMStart(sQLiteStatementPrepare.getLong(i13));
                int i17 = i12;
                matchRecord.setMLocalTime(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                int i18 = i11;
                matchRecord.setMType((int) sQLiteStatementPrepare.getLong(i18));
                int i19 = i10;
                matchRecord.setMPeriodListSize((int) sQLiteStatementPrepare.getLong(i19));
                int i20 = i9;
                int i21 = columnIndexOrThrow36;
                matchRecord.setMLogListSize((int) sQLiteStatementPrepare.getLong(i20));
                int i22 = i8;
                matchRecord.setMIsSync((int) sQLiteStatementPrepare.getLong(i22));
                int i23 = i7;
                matchRecord.setMIsDelete((int) sQLiteStatementPrepare.getLong(i23));
                int i24 = i6;
                matchRecord.setMSource((int) sQLiteStatementPrepare.getLong(i24));
                int i25 = i5;
                matchRecord.setMIsStopWatchData((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = i4;
                int i27 = columnIndexOrThrow31;
                int i28 = columnIndexOrThrow;
                matchRecord.setMStopWatchList(matchRecordDao_Impl.__matchRecordConverter.stringToStopWatchList(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26)));
                int i29 = i3;
                i3 = i29;
                matchRecord.setMTeamInfo(matchRecordDao_Impl.__matchRecordConverter.stringToTeamInfo(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29)));
                int i30 = i2;
                i2 = i30;
                matchRecord.setMWeather(matchRecordDao_Impl.__matchRecordConverter.stringToWeather(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30)));
                int i31 = columnIndexOrThrow14;
                matchRecord.setMHomeTeamScore((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow15;
                matchRecord.setMGuestTeamScore((int) sQLiteStatementPrepare.getLong(i32));
                int i33 = columnIndexOrThrow16;
                matchRecord.setMMode((int) sQLiteStatementPrepare.getLong(i33));
                columnIndexOrThrow15 = i32;
                columnIndexOrThrow16 = i33;
                int i34 = columnIndexOrThrow17;
                matchRecord.setMMinBpm((int) sQLiteStatementPrepare.getLong(i34));
                columnIndexOrThrow17 = i34;
                int i35 = columnIndexOrThrow18;
                matchRecord.setMAirPressure((int) sQLiteStatementPrepare.getLong(i35));
                int i36 = columnIndexOrThrow19;
                matchRecord.setMPace((int) sQLiteStatementPrepare.getLong(i36));
                columnIndexOrThrow18 = i35;
                columnIndexOrThrow19 = i36;
                int i37 = columnIndexOrThrow20;
                matchRecord.setMMaxPace((int) sQLiteStatementPrepare.getLong(i37));
                columnIndexOrThrow20 = i37;
                int i38 = columnIndexOrThrow21;
                matchRecord.setMMinPace((int) sQLiteStatementPrepare.getLong(i38));
                int i39 = columnIndexOrThrow22;
                matchRecord.setMSpm((int) sQLiteStatementPrepare.getLong(i39));
                columnIndexOrThrow21 = i38;
                columnIndexOrThrow22 = i39;
                int i40 = columnIndexOrThrow23;
                matchRecord.setMMaxSpm((int) sQLiteStatementPrepare.getLong(i40));
                columnIndexOrThrow23 = i40;
                int i41 = columnIndexOrThrow24;
                matchRecord.setMMinSpm((int) sQLiteStatementPrepare.getLong(i41));
                int i42 = columnIndexOrThrow25;
                matchRecord.setMAltitude((int) sQLiteStatementPrepare.getLong(i42));
                columnIndexOrThrow24 = i41;
                columnIndexOrThrow25 = i42;
                int i43 = columnIndexOrThrow26;
                matchRecord.setMMaxAltitude((int) sQLiteStatementPrepare.getLong(i43));
                columnIndexOrThrow26 = i43;
                int i44 = columnIndexOrThrow27;
                matchRecord.setMMinAltitude((int) sQLiteStatementPrepare.getLong(i44));
                matchRecord.setMPeriod(matchPeriod);
                arrayList2.add(matchRecord);
                arrayList = arrayList2;
                columnIndexOrThrow27 = i44;
                columnIndexOrThrow31 = i27;
                columnIndexOrThrow36 = i21;
                columnIndexOrThrow2 = i13;
                i4 = i26;
                columnIndexOrThrow37 = i16;
                columnIndexOrThrow38 = i15;
                columnIndexOrThrow39 = i14;
                i12 = i17;
                i9 = i20;
                i11 = i18;
                i10 = i19;
                i8 = i22;
                i7 = i23;
                columnIndexOrThrow14 = i31;
                i6 = i24;
                columnIndexOrThrow = i28;
                i5 = i25;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object OIX0iXi(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MatchPeriod WHERE mMatchRecordId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List OIi0(MatchRecordDao_Impl matchRecordDao_Impl, int i, int i2, SQLiteConnection sQLiteConnection) {
        matchRecordDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT ?, ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            sQLiteStatementPrepare.mo47599bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStart");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPeriodListSize");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLogListSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSource");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsStopWatchData");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStopWatchList");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTeamInfo");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeather");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHomeTeamScore");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mGuestTeamScore");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMode");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinBpm");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAirPressure");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPace");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxPace");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinPace");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpm");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxSpm");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinSpm");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAltitude");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxAltitude");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinAltitude");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mId");
            int i3 = columnIndexOrThrow13;
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMatchRecordId");
            int i4 = columnIndexOrThrow12;
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDuration");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDistance");
            int i5 = columnIndexOrThrow11;
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mStep");
            int i6 = columnIndexOrThrow10;
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mCalorie");
            int i7 = columnIndexOrThrow9;
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mSpeed");
            int i8 = columnIndexOrThrow8;
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mAvgBpm");
            int i9 = columnIndexOrThrow7;
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxBpm");
            int i10 = columnIndexOrThrow6;
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxSpeed");
            int i11 = columnIndexOrThrow5;
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsSync");
            int i12 = columnIndexOrThrow4;
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsDelete");
            int i13 = columnIndexOrThrow3;
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i14 = columnIndexOrThrow2;
                ArrayList arrayList2 = arrayList;
                MatchPeriod matchPeriod = new MatchPeriod((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow37), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow38), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow39));
                MatchRecord matchRecord = new MatchRecord();
                int i15 = columnIndexOrThrow39;
                int i16 = columnIndexOrThrow38;
                matchRecord.setMId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                int i17 = columnIndexOrThrow37;
                matchRecord.setMStart(sQLiteStatementPrepare.getLong(i14));
                int i18 = i13;
                matchRecord.setMLocalTime(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18));
                int i19 = i12;
                matchRecord.setMType((int) sQLiteStatementPrepare.getLong(i19));
                int i20 = i11;
                matchRecord.setMPeriodListSize((int) sQLiteStatementPrepare.getLong(i20));
                int i21 = i10;
                int i22 = columnIndexOrThrow36;
                matchRecord.setMLogListSize((int) sQLiteStatementPrepare.getLong(i21));
                int i23 = i9;
                matchRecord.setMIsSync((int) sQLiteStatementPrepare.getLong(i23));
                int i24 = i8;
                matchRecord.setMIsDelete((int) sQLiteStatementPrepare.getLong(i24));
                int i25 = i7;
                matchRecord.setMSource((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = i6;
                matchRecord.setMIsStopWatchData((int) sQLiteStatementPrepare.getLong(i26));
                int i27 = i5;
                int i28 = columnIndexOrThrow31;
                int i29 = columnIndexOrThrow;
                matchRecord.setMStopWatchList(matchRecordDao_Impl.__matchRecordConverter.stringToStopWatchList(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27)));
                int i30 = i4;
                i4 = i30;
                matchRecord.setMTeamInfo(matchRecordDao_Impl.__matchRecordConverter.stringToTeamInfo(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30)));
                int i31 = i3;
                i3 = i31;
                matchRecord.setMWeather(matchRecordDao_Impl.__matchRecordConverter.stringToWeather(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31)));
                int i32 = columnIndexOrThrow14;
                matchRecord.setMHomeTeamScore((int) sQLiteStatementPrepare.getLong(i32));
                int i33 = columnIndexOrThrow15;
                matchRecord.setMGuestTeamScore((int) sQLiteStatementPrepare.getLong(i33));
                int i34 = columnIndexOrThrow16;
                matchRecord.setMMode((int) sQLiteStatementPrepare.getLong(i34));
                columnIndexOrThrow15 = i33;
                columnIndexOrThrow16 = i34;
                int i35 = columnIndexOrThrow17;
                matchRecord.setMMinBpm((int) sQLiteStatementPrepare.getLong(i35));
                columnIndexOrThrow17 = i35;
                int i36 = columnIndexOrThrow18;
                matchRecord.setMAirPressure((int) sQLiteStatementPrepare.getLong(i36));
                int i37 = columnIndexOrThrow19;
                matchRecord.setMPace((int) sQLiteStatementPrepare.getLong(i37));
                columnIndexOrThrow18 = i36;
                columnIndexOrThrow19 = i37;
                int i38 = columnIndexOrThrow20;
                matchRecord.setMMaxPace((int) sQLiteStatementPrepare.getLong(i38));
                columnIndexOrThrow20 = i38;
                int i39 = columnIndexOrThrow21;
                matchRecord.setMMinPace((int) sQLiteStatementPrepare.getLong(i39));
                int i40 = columnIndexOrThrow22;
                matchRecord.setMSpm((int) sQLiteStatementPrepare.getLong(i40));
                columnIndexOrThrow21 = i39;
                columnIndexOrThrow22 = i40;
                int i41 = columnIndexOrThrow23;
                matchRecord.setMMaxSpm((int) sQLiteStatementPrepare.getLong(i41));
                columnIndexOrThrow23 = i41;
                int i42 = columnIndexOrThrow24;
                matchRecord.setMMinSpm((int) sQLiteStatementPrepare.getLong(i42));
                int i43 = columnIndexOrThrow25;
                matchRecord.setMAltitude((int) sQLiteStatementPrepare.getLong(i43));
                columnIndexOrThrow24 = i42;
                columnIndexOrThrow25 = i43;
                int i44 = columnIndexOrThrow26;
                matchRecord.setMMaxAltitude((int) sQLiteStatementPrepare.getLong(i44));
                columnIndexOrThrow26 = i44;
                int i45 = columnIndexOrThrow27;
                matchRecord.setMMinAltitude((int) sQLiteStatementPrepare.getLong(i45));
                matchRecord.setMPeriod(matchPeriod);
                arrayList2.add(matchRecord);
                arrayList = arrayList2;
                columnIndexOrThrow27 = i45;
                columnIndexOrThrow31 = i28;
                columnIndexOrThrow36 = i22;
                columnIndexOrThrow2 = i14;
                i5 = i27;
                columnIndexOrThrow37 = i17;
                columnIndexOrThrow38 = i16;
                columnIndexOrThrow39 = i15;
                i13 = i18;
                i10 = i21;
                i12 = i19;
                i11 = i20;
                i9 = i23;
                i8 = i24;
                columnIndexOrThrow14 = i32;
                i7 = i25;
                columnIndexOrThrow = i29;
                i6 = i26;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object OXO1(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MatchLog WHERE mMatchRecordId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XIi00iiXO(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MatchLog WHERE mMatchRecordId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMatchRecordId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCountingTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPeriodTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPeriodNumber");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCount");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCancelType");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTeam");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPlayer");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mOtherType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStopWatchTotal");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                int i5 = columnIndexOrThrow4;
                int i6 = columnIndexOrThrow5;
                int i7 = columnIndexOrThrow15;
                arrayList2.add(new MatchLog((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(i2), (int) sQLiteStatementPrepare.getLong(i7)));
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow5 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow3 = i4;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List XOO0ii0(MatchRecordDao_Impl matchRecordDao_Impl, SQLiteConnection sQLiteConnection) {
        matchRecordDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MatchRecord WHERE mIsDelete != 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStart");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPeriodListSize");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLogListSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSource");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsStopWatchData");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStopWatchList");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTeamInfo");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeather");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHomeTeamScore");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mGuestTeamScore");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMode");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinBpm");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAirPressure");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPace");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxPace");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinPace");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpm");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxSpm");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinSpm");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAltitude");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxAltitude");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMinAltitude");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mId");
            int i = columnIndexOrThrow13;
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMatchRecordId");
            int i2 = columnIndexOrThrow12;
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDuration");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mDistance");
            int i3 = columnIndexOrThrow11;
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mStep");
            int i4 = columnIndexOrThrow10;
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mCalorie");
            int i5 = columnIndexOrThrow9;
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mSpeed");
            int i6 = columnIndexOrThrow8;
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mAvgBpm");
            int i7 = columnIndexOrThrow7;
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxBpm");
            int i8 = columnIndexOrThrow6;
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mMaxSpeed");
            int i9 = columnIndexOrThrow5;
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsSync");
            int i10 = columnIndexOrThrow4;
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "p_mIsDelete");
            int i11 = columnIndexOrThrow3;
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i12 = columnIndexOrThrow2;
                ArrayList arrayList2 = arrayList;
                MatchPeriod matchPeriod = new MatchPeriod((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow36), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow37), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow38), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow39));
                MatchRecord matchRecord = new MatchRecord();
                int i13 = columnIndexOrThrow39;
                int i14 = columnIndexOrThrow38;
                matchRecord.setMId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                int i15 = columnIndexOrThrow37;
                matchRecord.setMStart(sQLiteStatementPrepare.getLong(i12));
                int i16 = i11;
                matchRecord.setMLocalTime(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = i10;
                matchRecord.setMType((int) sQLiteStatementPrepare.getLong(i17));
                int i18 = i9;
                matchRecord.setMPeriodListSize((int) sQLiteStatementPrepare.getLong(i18));
                int i19 = i8;
                int i20 = columnIndexOrThrow36;
                matchRecord.setMLogListSize((int) sQLiteStatementPrepare.getLong(i19));
                int i21 = i7;
                matchRecord.setMIsSync((int) sQLiteStatementPrepare.getLong(i21));
                int i22 = i6;
                matchRecord.setMIsDelete((int) sQLiteStatementPrepare.getLong(i22));
                int i23 = i5;
                matchRecord.setMSource((int) sQLiteStatementPrepare.getLong(i23));
                int i24 = i4;
                matchRecord.setMIsStopWatchData((int) sQLiteStatementPrepare.getLong(i24));
                int i25 = i3;
                int i26 = columnIndexOrThrow31;
                int i27 = columnIndexOrThrow;
                matchRecord.setMStopWatchList(matchRecordDao_Impl.__matchRecordConverter.stringToStopWatchList(sQLiteStatementPrepare.isNull(i25) ? null : sQLiteStatementPrepare.getText(i25)));
                int i28 = i2;
                i2 = i28;
                matchRecord.setMTeamInfo(matchRecordDao_Impl.__matchRecordConverter.stringToTeamInfo(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28)));
                int i29 = i;
                i = i29;
                matchRecord.setMWeather(matchRecordDao_Impl.__matchRecordConverter.stringToWeather(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29)));
                int i30 = columnIndexOrThrow14;
                matchRecord.setMHomeTeamScore((int) sQLiteStatementPrepare.getLong(i30));
                int i31 = columnIndexOrThrow15;
                matchRecord.setMGuestTeamScore((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow16;
                matchRecord.setMMode((int) sQLiteStatementPrepare.getLong(i32));
                columnIndexOrThrow16 = i32;
                int i33 = columnIndexOrThrow17;
                matchRecord.setMMinBpm((int) sQLiteStatementPrepare.getLong(i33));
                columnIndexOrThrow17 = i33;
                int i34 = columnIndexOrThrow18;
                matchRecord.setMAirPressure((int) sQLiteStatementPrepare.getLong(i34));
                int i35 = columnIndexOrThrow19;
                matchRecord.setMPace((int) sQLiteStatementPrepare.getLong(i35));
                columnIndexOrThrow19 = i35;
                int i36 = columnIndexOrThrow20;
                matchRecord.setMMaxPace((int) sQLiteStatementPrepare.getLong(i36));
                columnIndexOrThrow20 = i36;
                int i37 = columnIndexOrThrow21;
                matchRecord.setMMinPace((int) sQLiteStatementPrepare.getLong(i37));
                int i38 = columnIndexOrThrow22;
                matchRecord.setMSpm((int) sQLiteStatementPrepare.getLong(i38));
                columnIndexOrThrow22 = i38;
                int i39 = columnIndexOrThrow23;
                matchRecord.setMMaxSpm((int) sQLiteStatementPrepare.getLong(i39));
                columnIndexOrThrow23 = i39;
                int i40 = columnIndexOrThrow24;
                matchRecord.setMMinSpm((int) sQLiteStatementPrepare.getLong(i40));
                int i41 = columnIndexOrThrow25;
                matchRecord.setMAltitude((int) sQLiteStatementPrepare.getLong(i41));
                columnIndexOrThrow25 = i41;
                int i42 = columnIndexOrThrow26;
                matchRecord.setMMaxAltitude((int) sQLiteStatementPrepare.getLong(i42));
                columnIndexOrThrow26 = i42;
                int i43 = columnIndexOrThrow27;
                matchRecord.setMMinAltitude((int) sQLiteStatementPrepare.getLong(i43));
                matchRecord.setMPeriod(matchPeriod);
                arrayList2.add(matchRecord);
                arrayList = arrayList2;
                columnIndexOrThrow27 = i43;
                columnIndexOrThrow31 = i26;
                columnIndexOrThrow2 = i12;
                i3 = i25;
                columnIndexOrThrow37 = i15;
                columnIndexOrThrow38 = i14;
                columnIndexOrThrow39 = i13;
                i11 = i16;
                i10 = i17;
                i9 = i18;
                i5 = i23;
                i4 = i24;
                columnIndexOrThrow15 = i31;
                columnIndexOrThrow18 = i34;
                columnIndexOrThrow21 = i37;
                columnIndexOrThrow24 = i40;
                columnIndexOrThrow36 = i20;
                i8 = i19;
                i7 = i21;
                i6 = i22;
                columnIndexOrThrow14 = i30;
                columnIndexOrThrow = i27;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ List m38179iO(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MatchPeriod WHERE mMatchRecordId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMatchRecordId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDistance");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStep");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCalorie");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSpeed");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAvgBpm");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxBpm");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMaxSpeed");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                arrayList.add(new MatchPeriod((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)));
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i3;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public void _deleteMatchLogById(final int matchRecordId) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.h50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.OXO1(matchRecordId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public void _deleteMatchPeriodById(final int matchRecordId) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.q50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.OIX0iXi(matchRecordId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public void _deleteMatchRecordById(final int id) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.s50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.I0iXXO(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchLog> _getMatchLogById(final int matchRecordId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.p50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.XIi00iiXO(matchRecordId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchPeriod> _getMatchPeriodsById(final int matchRecordId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.l50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.m38179iO(matchRecordId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchRecord> _getMatchRecords(final int startIndex, final int endIndex) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.o50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.OIi0(this.f10074IO, startIndex, endIndex, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public long[] _insertMatchLog(final List<MatchLog> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.m50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f9627IO.__insertAdapterOfMatchLog.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public long[] _insertMatchPeriod(final List<MatchPeriod> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.r50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f10749IO.__insertAdapterOfMatchPeriod.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public long _insertMatchRecord(final MatchRecord matchRecord) {
        matchRecord.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.j50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f8880IO.__insertAdapterOfMatchRecord.insertAndReturnId((SQLiteConnection) obj, matchRecord));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public void delete(final int id) {
        MatchRecordDao.DefaultImpls.delete(this, id);
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchRecord> getList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.k50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.XOO0ii0(this.f9107IO, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchRecord> getListBySource(final int source) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.n50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MatchRecordDao_Impl.m38178IO(this.f9851IO, source, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public List<MatchRecord> getMatchRecords(final int startIndex, final int endIndex) {
        return MatchRecordDao.DefaultImpls.getMatchRecords(this, startIndex, endIndex);
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public void insert(final List<MatchRecord> list) {
        MatchRecordDao.DefaultImpls.insert(this, list);
    }

    @Override // com.sma.smartv3.p608db.dao.MatchRecordDao
    public int update(final List<MatchRecord> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f7753IO.__updateAdapterOfMatchRecord.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
