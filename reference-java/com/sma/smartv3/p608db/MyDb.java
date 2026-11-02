package com.sma.smartv3.p608db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.p556db.SupportSQLiteDatabase;
import com.android.mltcode.paycertificationapi.aa1;
import com.ironsource.C12616d4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MyDb {

    @aa1
    public static final MyDb INSTANCE = new MyDb();
    public static AppDatabase mDatabase;

    private MyDb() {
    }

    @aa1
    public final AppDatabase getMDatabase() {
        AppDatabase appDatabase = mDatabase;
        if (appDatabase != null) {
            return appDatabase;
        }
        Intrinsics.XXO("mDatabase");
        return null;
    }

    public final void init(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        setMDatabase((AppDatabase) Room.databaseBuilder(context, AppDatabase.class, "db[" + context.getPackageName() + C12616d4.j.f34442e).addMigrations(new Migration() { // from class: com.sma.smartv3.db.MyDb.init.1
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Location ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.2
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Location ADD COLUMN mIsBaiDuSync INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Activity ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE BloodPressure ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE HeartRate ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Sleep ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mIsSync INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.3
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE Workout(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mStart INTEGER NOT NULL,mEnd INTEGER NOT NULL,mLocalTime Text NOT NULL,mDuration INTEGER NOT NULL,mAltitude INTEGER NOT NULL,mAirPressure INTEGER NOT NULL,mSpm INTEGER NOT NULL,mMode INTEGER NOT NULL,mStep INTEGER NOT NULL,mDistance INTEGER NOT NULL,mCalorie INTEGER NOT NULL,mSpeed INTEGER NOT NULL,mPace INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.4
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Location ADD COLUMN mSource INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.5
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE Temperature(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mTemperature REAL NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Temperature_mTime ON Temperature(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.6
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("DROP TABLE Temperature");
                database.execSQL("CREATE TABLE Temperature(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mTemperature INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Temperature_mTime ON Temperature(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.7
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE WorkoutIndex(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mFrom INTEGER NOT NULL,mEndTime INTEGER NOT NULL,mMode INTEGER NOT NULL,mSyncStatus INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_WorkoutIndex_mEndTime ON WorkoutIndex(mEndTime)");
                database.execSQL("CREATE  INDEX index_WorkoutIndex_mSyncStatus ON WorkoutIndex(mSyncStatus)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.8
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE BloodOxygen(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_BloodOxygen_mTime ON BloodOxygen(mTime)");
                database.execSQL("CREATE TABLE Hrv(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Hrv_mTime ON Hrv(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.9
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("DROP TABLE Hrv");
                database.execSQL("CREATE TABLE Hrv(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mAvgValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Hrv_mTime ON Hrv(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.10
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Activity ADD COLUMN mIsDelete INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mIsDelete INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.11
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mIsMeasure INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBmi REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfFat REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfMuscle REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfFat REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfProtein REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfProteinLevel INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfWater REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfWaterLevel INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mStateOfNutrition REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mIdealWeight REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mAgeOfBody REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mIsDelete INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.12
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Sleep ADD COLUMN mAlgorithmType INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.13
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mAgeOfBodyRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBmiRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBmiWHORange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBmr REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBmrRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mBodyShape REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mDesirableWeight REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mFatFreeBodyWeight REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mFatToControl REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mLevelOfVisceralFat REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mLevelOfVisceralFatRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mMuscleToControl REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfFatRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfMuscle REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfMuscleRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfProteinRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfSkeletalMuscle REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfSkeletalMuscleRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfSubcutaneousFat REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfSubcutaneousFatRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mRatioOfWaterRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mScore REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfBone REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfBoneRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfFatRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfMuscleRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfProtein REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfProteinRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfSkeletalMuscle REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfSkeletalMuscleRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfWater REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightOfWaterRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightRange Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightToControl REAL NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Weight ADD COLUMN mWeightWHORange Text NOT NULL DEFAULT ''");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.14
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE Pressure(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Pressure_mTime ON Pressure(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.15
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAvgBpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxBpm INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.16
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinBpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxSpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinSpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinPace INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.17
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE MatchLog(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mMatchRecordId INTEGER NOT NULL,mTime INTEGER NOT NULL,mPeriodTime INTEGER NOT NULL,mPeriodNumber INTEGER NOT NULL,mType INTEGER NOT NULL,mCount INTEGER NOT NULL,mCancelType INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)");
                database.execSQL("CREATE TABLE MatchPeriod(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mMatchRecordId INTEGER NOT NULL,mDuration INTEGER NOT NULL,mDistance INTEGER NOT NULL,mStep INTEGER NOT NULL,mCalorie INTEGER NOT NULL,mSpeed INTEGER NOT NULL,mAvgBpm INTEGER NOT NULL,mMaxBpm INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)");
                database.execSQL("CREATE TABLE MatchRecord(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mStart INTEGER NOT NULL,mLocalTime Text NOT NULL,mType INTEGER NOT NULL,mPeriodListSize INTEGER NOT NULL,mLogListSize INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL,p_mId INTEGER NOT NULL,p_mMatchRecordId INTEGER NOT NULL,p_mDuration INTEGER NOT NULL,p_mDistance INTEGER NOT NULL,p_mStep INTEGER NOT NULL,p_mCalorie INTEGER NOT NULL,p_mSpeed INTEGER NOT NULL,p_mAvgBpm INTEGER NOT NULL,p_mMaxBpm INTEGER NOT NULL,p_mIsSync INTEGER NOT NULL,p_mIsDelete INTEGER NOT NULL)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.18
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSource INTEGER NOT NULL DEFAULT 0");
                database.execSQL("CREATE TABLE SportData(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mStep INTEGER NOT NULL,mDistance INTEGER NOT NULL,mCalorie INTEGER NOT NULL,mDuration INTEGER NOT NULL,mSpm INTEGER NOT NULL,mAltitude INTEGER NOT NULL,mAirPressure INTEGER NOT NULL,mPace INTEGER NOT NULL,mSpeed INTEGER NOT NULL,mMode INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.19
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE BloodGlucose(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_BloodGlucose_mTime ON BloodGlucose(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.20
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxAltitude INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinAltitude INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.21
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE MatchLog ADD COLUMN mTeam INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchLog ADD COLUMN mPlayer INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchLog ADD COLUMN mOtherType INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchPeriod ADD COLUMN mMaxSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN p_mMaxSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mIsStopWatchData INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mSource INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mStopWatchList Text DEFAULT ''");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mTeamInfo Text DEFAULT ''");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mWeather Text DEFAULT ''");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mHomeTeamScore INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mGuestTeamScore INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.22
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE MatchLog ADD COLUMN mStopWatchTotal INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.23
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMode INTEGER NOT NULL DEFAULT 0");
                database.execSQL("CREATE UNIQUE INDEX index_MatchRecord_mStart ON MatchRecord(mStart)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.24
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinStress INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxStress INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAvgStress INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.25
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE AlipayBindInfo(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mBleName Text NOT NULL,mFirmwareFlag Text NOT NULL,mMacAddress Text NOT NULL,mFirmwareVersion Text NOT NULL,mAppVersion Text NOT NULL,mResult INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_AlipayBindInfo_mTime ON AlipayBindInfo(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.26
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMinBpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mAirPressure INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMaxPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMinPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mSpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMaxSpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMinSpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mAltitude INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMaxAltitude INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE MatchRecord ADD COLUMN mMinAltitude INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.27
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFeel INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPrototype Text NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFirmwareFlag Text NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBleName Text NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.28
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE AIRecords(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mAIFuncType INTEGER NOT NULL,mType INTEGER NOT NULL,mContent Text NOT NULL,mExtraInfo Text NOT NULL,mStatus INTEGER NOT NULL,mIsDelete INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.29
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE Electrocardiogram(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_Electrocardiogram_mTime ON Electrocardiogram(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.30
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMinSpeed INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.31
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRestDuration INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.32
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE BloodGlucose2(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mMeasurementId Text NOT NULL,mUserId Text NOT NULL,mStartTime Text NOT NULL,mEndTime Text NOT NULL,mModelNo Text NOT NULL,mLowerBound REAL NOT NULL DEFAULT 0,mUpperBound REAL NOT NULL DEFAULT 0,mFasting INTEGER NOT NULL,mWithin2hrsMeal INTEGER NOT NULL,mCompletedProgress INTEGER NOT NULL,mCurrentLevel INTEGER NOT NULL,mRiskCode Text NOT NULL,mInsights Text NOT NULL,mTips Text NOT NULL,mLocaleInsights Text NOT NULL,mLocaleTips Text NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_BloodGlucose2_mMeasurementId ON BloodGlucose2(mMeasurementId)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.33
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mType INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMetTotal INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAerobic FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAnaerobic FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mStamina INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAvgSpeed FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCadence INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxCadence INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCnt INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBpmZoneCount Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPersonalZone Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mLactateThresholdPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRecoveryTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mTrainingLoad INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxVO2 INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mLactateThresholdHr INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAlgorithmMarking INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mPathPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mHrPathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mHrPathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mHrPathPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPacePathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPacePathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mPacePathPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSpeedPathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSpeedPathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mSpeedPathPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCadencePathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCadencePathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mCadencePathPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAltitudePathCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAltitudePathSampleInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE workout ADD COLUMN mAltitudePathPoints Text DEFAULT ''");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.34
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mAITitle Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mTranslateLanguage Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mTranslateToLanguage Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mLocation Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mAudioPath Text NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN mAudioDuration INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.35
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE HanBaoVibration(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mVibration INTEGER NOT NULL,mBOValue INTEGER NOT NULL,mIsSnore INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_HanBaoVibration_mTime ON HanBaoVibration(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.36
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE HealthyReport(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mUserGender INTEGER NOT NULL,mUserWeight FLOAT NOT NULL,mUserHeight FLOAT NOT NULL,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mAbnormalNumber INTEGER NOT NULL,mHeartRateTime INTEGER NOT NULL,mHeartRateValue INTEGER NOT NULL,mHeartRateAIRecords Text NOT NULL,mBloodPressureTime INTEGER NOT NULL,mSystolicValue INTEGER NOT NULL,mDiastolicValue INTEGER NOT NULL,mBloodPressureAIRecords Text NOT NULL,mBloodOxygenTime INTEGER NOT NULL,mBloodOxygenValue INTEGER NOT NULL,mBloodOxygenAIRecords Text NOT NULL,mSleepTime INTEGER NOT NULL,mSleepDeepLengthTime FLOAT NOT NULL,mSleepPiecemealTime FLOAT NOT NULL,mSleepAIRecords Text NOT NULL,mPressureTime INTEGER NOT NULL,mPressureValue INTEGER NOT NULL,mPressureAIRecords Text NOT NULL,mBloodGlucose2Time INTEGER NOT NULL,mBloodGlucose2Value FLOAT NOT NULL,mBloodGlucose2AIRecords Text NOT NULL,mWeightTime INTEGER NOT NULL,mWeightValue FLOAT NOT NULL,mWeightAIRecords Text NOT NULL,mWeekSportsTime INTEGER NOT NULL,mWeekSportsNumber INTEGER NOT NULL,mWeekSportsAllTime INTEGER NOT NULL,mWeekSportsAIRecords Text NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_HealthyReport_mTime ON HealthyReport(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.37
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPlatform Text NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.38
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAGpsType INTEGER NOT NULL DEFAULT 99");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.39
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE DailyPower(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mValue INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                database.execSQL("CREATE UNIQUE INDEX index_DailyPower_mTime ON DailyPower(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.40
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE AIRecords ADD COLUMN ttsVoiceName Text NOT NULL DEFAULT ''");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.41
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS `TranslateSessionEntity` (\n    `sessionId` TEXT NOT NULL,\n    `audioPath` TEXT NOT NULL,\n    `duration` REAL NOT NULL,\n    `createTime` INTEGER NOT NULL,\n     PRIMARY KEY(`sessionId`) ) ");
                db.execSQL(" CREATE TABLE IF NOT EXISTS `TranslateEntity` (\n     `requestId` TEXT NOT NULL,\n      `text` TEXT NOT NULL,\n     `translate` TEXT NOT NULL,\n       `sessionId` TEXT NOT NULL,\n         `duration` REAL NOT NULL,\n         `isUpLoaded` INTEGER NOT NULL,\n        `audioPath` TEXT NOT NULL,\n       `fromLanguage` TEXT NOT NULL,\n        `toLanguage` TEXT NOT NULL,\n       `createTime` INTEGER NOT NULL,\n        PRIMARY KEY(`requestId`),\nFOREIGN KEY(`sessionId`) REFERENCES `TranslateSessionEntity`(`sessionId`) ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_TranslateEntity_sessionId` \n ON `TranslateEntity` (`sessionId`)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.42
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS 'Vitality' (\n   'mId' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   'mTime' INTEGER NOT NULL UNIQUE,\n   'mLocalTime' TEXT NOT NULL,\n   'mAllVitality'  INTEGER NOT NULL,\n   'mLowIntensityTime' INTEGER NOT NULL,\n   'mLowIntensityValue' INTEGER NOT NULL,\n   'mMediumIntensityTime' INTEGER NOT NULL,\n   'mMediumIntensityValue' INTEGER NOT NULL,\n   'mHighIntensityTime' INTEGER NOT NULL,\n   'mHighIntensityValue' INTEGER NOT NULL,\n   'mIsSync' INTEGER NOT NULL DEFAULT 0\n)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Vitality_mTime` \n ON `Vitality` (`mTime`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS 'RespiratoryRate' (\n    'mId' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    'mTime' INTEGER NOT NULL UNIQUE,\n     'mLocalTime' TEXT NOT NULL,\n     'mValue' INTEGER NOT NULL,\n     'mIsSync' INTEGER NOT NULL\n)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_RespiratoryRate_mTime` \n ON `RespiratoryRate` (`mTime`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS 'PhysicalPower' (\n    'mId' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    'mTime' INTEGER NOT NULL UNIQUE,\n     'mLocalTime' TEXT NOT NULL,\n     'mValue' INTEGER NOT NULL,\n     'mIsSync' INTEGER NOT NULL\n)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_PhysicalPower_mTime` \n ON `PhysicalPower` (`mTime`)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.43
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("ALTER TABLE TranslateSessionEntity ADD COLUMN isDelete INTEGER NOT NULL DEFAULT 0");
                db.execSQL("ALTER TABLE TranslateEntity ADD COLUMN showType INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.44
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE ChatVoiceAssistantMessage (\n     id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n     data TEXT NOT NULL DEFAULT '',\n     type TEXT NOT NULL DEFAULT 'THIRD_PARTY_AI_ASSISTANT',\n     aiMode TEXT NOT NULL,\n     ended INTEGER NOT NULL DEFAULT 0,\n     showType TEXT NOT NULL DEFAULT 'FROM'\n )");
                db.execSQL("CREATE INDEX index_ChatVoiceAssistantMessage_type\n  ON ChatVoiceAssistantMessage (type)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.45
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("ALTER TABLE MatchLog ADD COLUMN mCountingTime INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.46
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("ALTER TABLE Workout ADD COLUMN mGoalDistance INTEGER NOT NULL DEFAULT 0");
                db.execSQL("ALTER TABLE Workout ADD COLUMN mGoalTime INTEGER NOT NULL DEFAULT 0");
                db.execSQL("ALTER TABLE Workout ADD COLUMN mGoalCalorie INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.47
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE EnergyRating(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mScore INTEGER NOT NULL,mGear INTEGER NOT NULL,mIsSync INTEGER NOT NULL)");
                db.execSQL("CREATE UNIQUE INDEX index_EnergyRating_mTime ON EnergyRating(mTime)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.48
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPausedDuration INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCurBpm INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAscendAltitude INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mDescendAltitude INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCurStress INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSwimType INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCntFore INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCntBack INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBackSwingTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mDownSwingTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mDribbleTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mTripCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSessionCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mVerticalOscillation INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRunPowerWatt INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mStepLen FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mTrainingStatus INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFitnessAge INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBestRunTime Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFitnessLevel Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mTlTrend FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCalorieTotal INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPowerCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPowerInterval INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mPowerPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN realTimeAerobic FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN realTimeAnaerobic FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFatTotal FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCarboTotal FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorTargetTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorActualTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorDifferenceTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorStatusTime INTEGER NOT NULL DEFAULT -1");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorTargetDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorActualDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorDifferenceDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorStatusDistance INTEGER NOT NULL DEFAULT -1");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorTargetPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorActualPace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorDifferencePace INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorStatusPace INTEGER NOT NULL DEFAULT -1");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorTargetSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorActualSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorDifferenceSpeed INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorStatusSpeed INTEGER NOT NULL DEFAULT -1");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mMaxOxygenPower FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mTrendWeek Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCyclingIndex Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mStaBalance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSwimSwolf INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCntLap INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFrontCrawlPerc INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBreaststrokePerc INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mBackstrokePerc INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mButterflyPerc INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSpmPathPointsCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSpmPathPointsPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mStepLenCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mStepLenPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorTargetSpeedV2 FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mNavigatorActualSpeedV2 FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mEllipticalSteps INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildSwimStartTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildSwimDuration INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildSwimDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildCyclingStartTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildCyclingDuration INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildCyclingDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildRunStartTime INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildRunDuration INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildRunDistance INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildNumber INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildSwimMode INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildCyclingMode INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mChildRunMode INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRunLactateAvg FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mCyclingLactateAvg FLOAT NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mFlag INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRecoveryHrCount INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mRecoveryHrPoints Text DEFAULT ''");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mSwimPoolLength INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mDeviceId Text DEFAULT ''");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.49
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS `RecordDeviceFile` (\n    `mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `mTime` INTEGER NOT NULL, \n    `mLocalTime` TEXT NOT NULL, \n    `mName` TEXT NOT NULL, \n    `mPath` TEXT NOT NULL, \n    `mSize` INTEGER NOT NULL, \n    `mWidth` INTEGER NOT NULL, \n    `mHeight` INTEGER NOT NULL, \n    `mDuration` INTEGER NOT NULL, \n    `mThumbnail` TEXT NOT NULL, \n    `mFileType` INTEGER NOT NULL, \n    `mIsFavority` INTEGER NOT NULL, \n    `mContent` TEXT NOT NULL, \n    `mIsSync` INTEGER NOT NULL, \n    `mIsDelete` INTEGER NOT NULL, \n    `mProcessType` INTEGER NOT NULL, \n    `mProcessStatus` INTEGER NOT NULL, \n    `mProcessPath` TEXT NOT NULL, \n    `mIsRead` INTEGER NOT NULL, \n    `mIsConversion` INTEGER NOT NULL, \n    `mReservedTextType` INTEGER NOT NULL, \n    `mReservedText` TEXT NOT NULL, \n    `mIsSummaryReport` INTEGER NOT NULL, \n    `mSummaryReportText` TEXT NOT NULL\n)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceFile_mTime` ON `RecordDeviceFile` (`mTime`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `RecordDeviceInfo` (\n    `mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `mTime` INTEGER NOT NULL, \n    `mLocalTime` TEXT NOT NULL, \n    `mMac` TEXT NOT NULL, \n    `mName` TEXT NOT NULL, \n    `mVersion` TEXT NOT NULL, \n    `mBattery` INTEGER NOT NULL, \n    `mTotalStorage` INTEGER NOT NULL, \n    `mAvailableStorage` INTEGER NOT NULL, \n    `isActive` INTEGER NOT NULL\n)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceInfo_mMac` ON `RecordDeviceInfo` (`mMac`)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.50
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db) {
                Intrinsics.X0O(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS `RecordDeviceManage` (\n    `mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `mTime` INTEGER NOT NULL, \n    `mLocalTime` TEXT NOT NULL, \n    `mName` TEXT NOT NULL, \n    `mFileName` TEXT NOT NULL                 \n)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.51
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE RecordDeviceFile ADD COLUMN mFileName TEXT NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE RecordDeviceFile ADD COLUMN mTaskId TEXT NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE RecordDeviceInfo ADD COLUMN mVoltage INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.52
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE RecordDeviceFile ADD COLUMN mModel INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.53
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE Workout ADD COLUMN mAICoachSportID INTEGER NOT NULL DEFAULT 0");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.54
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("CREATE TABLE RecordSchedule(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mTitle Text NOT NULL,mContent Text NOT NULL,mIsRemindEnabled INTEGER NOT NULL,mRepeatType INTEGER NOT NULL,mRemindTime INTEGER NOT NULL,mLastRemindTime INTEGER NOT NULL,mStatus INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL,mCalendarEventId INTEGER NOT NULL)");
            }
        }, new Migration() { // from class: com.sma.smartv3.db.MyDb.init.55
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase database) {
                Intrinsics.X0O(database, "database");
                database.execSQL("ALTER TABLE RecordSchedule ADD COLUMN mDeviceFileId INTEGER NOT NULL DEFAULT 0");
            }
        }).allowMainThreadQueries().build());
    }

    public final void setMDatabase(@aa1 AppDatabase appDatabase) {
        Intrinsics.X0O(appDatabase, "<set-?>");
        mDatabase = appDatabase;
    }
}
