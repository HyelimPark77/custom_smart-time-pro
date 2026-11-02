package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.f57;
import com.android.mltcode.paycertificationapi.g57;
import com.android.mltcode.paycertificationapi.h57;
import com.android.mltcode.paycertificationapi.i57;
import com.android.mltcode.paycertificationapi.j57;
import com.android.mltcode.paycertificationapi.k57;
import com.android.mltcode.paycertificationapi.l57;
import com.android.mltcode.paycertificationapi.m57;
import com.android.mltcode.paycertificationapi.n57;
import com.android.mltcode.paycertificationapi.o57;
import com.android.mltcode.paycertificationapi.p57;
import com.android.mltcode.paycertificationapi.q57;
import com.android.mltcode.paycertificationapi.r57;
import com.android.mltcode.paycertificationapi.s57;
import com.android.mltcode.paycertificationapi.t57;
import com.android.mltcode.paycertificationapi.u57;
import com.android.mltcode.paycertificationapi.v57;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.db.entity.WorkoutConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class WorkoutDao_Impl implements WorkoutDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Workout> __insertAdapterOfWorkout;
    private final EntityDeleteOrUpdateAdapter<Workout> __updateAdapterOfWorkout;
    private final WorkoutConverter __workoutConverter;

    public WorkoutDao_Impl(@NonNull final RoomDatabase __db) {
        this.__workoutConverter = new WorkoutConverter();
        this.__db = __db;
        this.__insertAdapterOfWorkout = new AnonymousClass1(this);
        this.__updateAdapterOfWorkout = new AnonymousClass2(this);
    }

    public static /* synthetic */ List I0IIOi(WorkoutDao_Impl r0, int r1, SQLiteConnection r2) {
        return r0.lambda$getNavigatorListByMode$12(r1, r2);
    }

    public static /* synthetic */ List I0iXXO(WorkoutDao_Impl r0, long r1, long r3, int r5, SQLiteConnection r6) {
        return r0.lambda$getListDESC$7(r1, r3, r5, r6);
    }

    public static /* synthetic */ Integer I1XOi1(WorkoutDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfWorkout.handleMultiple(r2, r1));
    }

    public static /* bridge */ /* synthetic */ WorkoutConverter IIX1OXO(WorkoutDao_Impl r0) {
        return r0.__workoutConverter;
    }

    public static /* synthetic */ Workout IO(WorkoutDao_Impl r0, long r1, long r3, SQLiteConnection r5) {
        return r0.lambda$getWorkout$13(r1, r3, r5);
    }

    public static /* synthetic */ List IiI10X(WorkoutDao_Impl r0, int r1, SQLiteConnection r2) {
        return r0.lambda$getListByMode$9(r1, r2);
    }

    public static /* synthetic */ Workout O00(WorkoutDao_Impl r0, int r1, SQLiteConnection r2) {
        return r0.lambda$getWorkoutById$15(r1, r2);
    }

    public static /* synthetic */ Workout O10IXXX0X(WorkoutDao_Impl r0, long r1, int r3, SQLiteConnection r4) {
        return r0.lambda$getFitnessWorkout$14(r1, r3, r4);
    }

    public static /* synthetic */ List OIX0iXi(WorkoutDao_Impl r0, int r1, int r2, int r3, SQLiteConnection r4) {
        return r0.lambda$getListDESCByMode$16(r1, r2, r3, r4);
    }

    public static /* synthetic */ List OIi0(WorkoutDao_Impl r0, SQLiteConnection r1) {
        return r0.lambda$getList$3(r1);
    }

    public static /* synthetic */ List OXO1(WorkoutDao_Impl r0, SQLiteConnection r1) {
        return r0.lambda$getDescList$4(r1);
    }

    public static /* synthetic */ List X0O(WorkoutDao_Impl r0, int r1, int r2, int r3, SQLiteConnection r4) {
        return r0.lambda$getListDESC$6(r1, r2, r3, r4);
    }

    public static /* synthetic */ List X1ii(WorkoutDao_Impl r0, long r1, long r3, int r5, SQLiteConnection r6) {
        return r0.lambda$getNavigatorListModeDESC$11(r1, r3, r5, r6);
    }

    public static /* synthetic */ Integer XIi00iiXO(WorkoutDao_Impl r0, Workout r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfWorkout.handle(r2, r1));
    }

    public static /* synthetic */ long[] XO0O10(WorkoutDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfWorkout.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XOO0ii0(WorkoutDao_Impl r0, int r1, int r2, SQLiteConnection r3) {
        return r0.lambda$getListByMode$10(r1, r2, r3);
    }

    public static /* synthetic */ List XXI(WorkoutDao_Impl r0, long r1, long r3, int r5, SQLiteConnection r6) {
        return r0.lambda$getListModeDESC$8(r1, r3, r5, r6);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(WorkoutDao_Impl r0, SQLiteConnection r1) {
        return r0.lambda$getListASC$5(r1);
    }

    private /* synthetic */ List lambda$getDescList$4(SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart DESC LIMIT 50");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r160 = r14;
        int r161 = r15;
        int r162 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r164 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r166 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r168 = null;
    L10:
        int r163 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r173 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r328 = r6;
        int r1610 = r5;
        int r174 = (int) r2.getLong(r160);     // Catch: Throwable -> L115
        int r175 = (int) r2.getLong(r161);     // Catch: Throwable -> L115
        int r176 = r338;
        int r177 = (int) r2.getLong(r176);     // Catch: Throwable -> L115
        int r178 = r16;
        int r179 = (int) r2.getLong(r178);     // Catch: Throwable -> L115
        int r180 = r17;
        int r181 = (int) r2.getLong(r180);     // Catch: Throwable -> L115
        int r182 = r18;
        int r183 = (int) r2.getLong(r182);     // Catch: Throwable -> L115
        int r184 = r19;
        int r185 = (int) r2.getLong(r184);     // Catch: Throwable -> L115
        int r186 = r20;
        int r187 = (int) r2.getLong(r186);     // Catch: Throwable -> L115
        int r188 = r21;
        int r189 = (int) r2.getLong(r188);     // Catch: Throwable -> L115
        int r190 = r22;
        int r191 = (int) r2.getLong(r190);     // Catch: Throwable -> L115
        int r192 = r23;
        int r193 = (int) r2.getLong(r192);     // Catch: Throwable -> L115
        int r194 = r24;
        int r195 = (int) r2.getLong(r194);     // Catch: Throwable -> L115
        int r196 = r25;
        int r197 = (int) r2.getLong(r196);     // Catch: Throwable -> L115
        int r198 = r26;
        int r199 = (int) r2.getLong(r198);     // Catch: Throwable -> L115
        int r200 = r27;
        int r201 = (int) r2.getLong(r200);     // Catch: Throwable -> L115
        int r202 = r28;
        int r203 = (int) r2.getLong(r202);     // Catch: Throwable -> L115
        int r204 = r29;
        int r205 = (int) r2.getLong(r204);     // Catch: Throwable -> L115
        int r206 = r30;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        r31 = r31;
        if (r2.isNull(r31) == false) goto L14;
        String r1910 = null;
    L13:
        int r208 = r32;
        if (r2.isNull(r208) == false) goto L19;
        String r1911 = null;
    L18:
        r32 = r208;
        int r209 = r33;
        if (r2.isNull(r209) == false) goto L24;
        String r1912 = null;
    L23:
        r33 = r209;
        r34 = r34;
        if (r2.isNull(r34) == false) goto L28;
        String r1913 = null;
    L29:
        int r210 = (int) r2.getLong(r35);     // Catch: Throwable -> L115
        r35 = r35;
        int r211 = r36;
        int r212 = (int) r2.getLong(r211);     // Catch: Throwable -> L115
        int r213 = r37;
        int r214 = (int) r2.getLong(r213);     // Catch: Throwable -> L115
        int r215 = r38;
        int r216 = (int) r2.getLong(r215);     // Catch: Throwable -> L115
        int r217 = r39;
        int r218 = (int) r2.getLong(r217);     // Catch: Throwable -> L115
        int r219 = r40;
        int r220 = (int) r2.getLong(r219);     // Catch: Throwable -> L115
        int r221 = r41;
        float r222 = (float) r2.getDouble(r221);     // Catch: Throwable -> L115
        int r223 = r42;
        float r224 = (float) r2.getDouble(r223);     // Catch: Throwable -> L115
        int r225 = r43;
        int r226 = (int) r2.getLong(r225);     // Catch: Throwable -> L115
        int r227 = r44;
        float r228 = (float) r2.getDouble(r227);     // Catch: Throwable -> L115
        int r229 = r45;
        int r230 = (int) r2.getLong(r229);     // Catch: Throwable -> L115
        int r231 = r46;
        int r232 = (int) r2.getLong(r231);     // Catch: Throwable -> L115
        int r233 = r47;
        int r234 = (int) r2.getLong(r233);     // Catch: Throwable -> L115
        int r235 = r48;
        if (r2.isNull(r235) == false) goto L33;
        String r236 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r236);     // Catch: Throwable -> L115
        int r237 = r49;
        if (r2.isNull(r237) == false) goto L38;
        String r238 = null;
    L37:
        r49 = r237;
        int[] r2111 = this.__workoutConverter.toIntArray(r238);     // Catch: Throwable -> L115
        int r239 = r50;
        int r240 = (int) r2.getLong(r239);     // Catch: Throwable -> L115
        int r329 = r8;
        int r241 = r51;
        int r510 = r7;
        int r242 = (int) r2.getLong(r241);     // Catch: Throwable -> L115
        int r243 = r52;
        int r244 = (int) r2.getLong(r243);     // Catch: Throwable -> L115
        int r245 = r53;
        int r246 = (int) r2.getLong(r245);     // Catch: Throwable -> L115
        int r247 = r54;
        int r248 = (int) r2.getLong(r247);     // Catch: Throwable -> L115
        int r249 = r55;
        int r250 = (int) r2.getLong(r249);     // Catch: Throwable -> L115
        int r251 = r56;
        int r252 = (int) r2.getLong(r251);     // Catch: Throwable -> L115
        int r253 = r57;
        int r254 = (int) r2.getLong(r253);     // Catch: Throwable -> L115
        int r255 = r58;
        if (r2.isNull(r255) == false) goto L43;
        String r256 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r256);     // Catch: Throwable -> L115
        int r257 = r59;
        int r258 = (int) r2.getLong(r257);     // Catch: Throwable -> L115
        int r259 = r60;
        int r260 = (int) r2.getLong(r259);     // Catch: Throwable -> L115
        int r261 = r61;
        if (r2.isNull(r261) == false) goto L48;
        String r262 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r262);     // Catch: Throwable -> L115
        r60 = r259;
        int r263 = r62;
        int r264 = (int) r2.getLong(r263);     // Catch: Throwable -> L115
        int r265 = r63;
        int r266 = (int) r2.getLong(r265);     // Catch: Throwable -> L115
        int r267 = r64;
        if (r2.isNull(r267) == false) goto L53;
        String r268 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r268);     // Catch: Throwable -> L115
        r63 = r265;
        int r269 = r65;
        int r270 = (int) r2.getLong(r269);     // Catch: Throwable -> L115
        int r271 = r66;
        int r272 = (int) r2.getLong(r271);     // Catch: Throwable -> L115
        int r273 = r67;
        if (r2.isNull(r273) == false) goto L58;
        String r274 = null;
    L59:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r274);     // Catch: Throwable -> L115
        r66 = r271;
        int r275 = r68;
        int r276 = (int) r2.getLong(r275);     // Catch: Throwable -> L115
        int r277 = r69;
        int r278 = (int) r2.getLong(r277);     // Catch: Throwable -> L115
        int r279 = r70;
        if (r2.isNull(r279) == false) goto L63;
        String r280 = null;
    L64:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r280);     // Catch: Throwable -> L115
        r69 = r277;
        int r281 = r71;
        int r282 = (int) r2.getLong(r281);     // Catch: Throwable -> L115
        int r283 = r72;
        int r284 = (int) r2.getLong(r283);     // Catch: Throwable -> L115
        int r285 = r73;
        if (r2.isNull(r285) == false) goto L68;
        String r286 = null;
    L69:
        List<Integer> r2312 = this.__workoutConverter.stringToStopWatchList(r286);     // Catch: Throwable -> L115
        r72 = r283;
        int r287 = r74;
        int r288 = (int) r2.getLong(r287);     // Catch: Throwable -> L115
        int r289 = r75;
        int r290 = (int) r2.getLong(r289);     // Catch: Throwable -> L115
        r75 = r289;
        int r291 = r76;
        int r292 = (int) r2.getLong(r291);     // Catch: Throwable -> L115
        r76 = r291;
        int r293 = r77;
        int r294 = (int) r2.getLong(r293);     // Catch: Throwable -> L115
        r77 = r293;
        int r295 = r78;
        int r296 = (int) r2.getLong(r295);     // Catch: Throwable -> L115
        r78 = r295;
        int r297 = r79;
        int r298 = (int) r2.getLong(r297);     // Catch: Throwable -> L115
        r79 = r297;
        int r299 = r80;
        int r300 = (int) r2.getLong(r299);     // Catch: Throwable -> L115
        r80 = r299;
        int r301 = r81;
        int r302 = (int) r2.getLong(r301);     // Catch: Throwable -> L115
        r81 = r301;
        int r303 = r82;
        int r304 = (int) r2.getLong(r303);     // Catch: Throwable -> L115
        r82 = r303;
        int r305 = r83;
        int r306 = (int) r2.getLong(r305);     // Catch: Throwable -> L115
        r83 = r305;
        int r307 = r84;
        int r308 = (int) r2.getLong(r307);     // Catch: Throwable -> L115
        r84 = r307;
        int r309 = r85;
        int r310 = (int) r2.getLong(r309);     // Catch: Throwable -> L115
        r85 = r309;
        int r311 = r86;
        int r312 = (int) r2.getLong(r311);     // Catch: Throwable -> L115
        r86 = r311;
        int r313 = r87;
        int r314 = (int) r2.getLong(r313);     // Catch: Throwable -> L115
        r87 = r313;
        int r315 = r88;
        int r316 = (int) r2.getLong(r315);     // Catch: Throwable -> L115
        r88 = r315;
        int r317 = r89;
        int r318 = (int) r2.getLong(r317);     // Catch: Throwable -> L115
        r89 = r317;
        int r319 = r90;
        int r320 = (int) r2.getLong(r319);     // Catch: Throwable -> L115
        r90 = r319;
        int r321 = r91;
        int r322 = (int) r2.getLong(r321);     // Catch: Throwable -> L115
        r91 = r321;
        int r323 = r92;
        float r324 = (float) r2.getDouble(r323);     // Catch: Throwable -> L115
        r92 = r323;
        int r325 = r93;
        int r326 = (int) r2.getLong(r325);     // Catch: Throwable -> L115
        r93 = r325;
        int r327 = r94;
        int r330 = (int) r2.getLong(r327);     // Catch: Throwable -> L115
        r94 = r327;
        int r331 = r95;
        float r332 = (float) r2.getDouble(r331);     // Catch: Throwable -> L115
        int r333 = r96;
        if (r2.isNull(r333) == false) goto L73;
        String r334 = null;
    L74:
        int[] r335 = this.__workoutConverter.toIntArray(r334);     // Catch: Throwable -> L115
        int r336 = r97;
        if (r2.isNull(r336) == false) goto L78;
        String r339 = null;
    L77:
        r97 = r336;
        float[] r340 = this.__workoutConverter.toFloatArray(r339);     // Catch: Throwable -> L115
        r95 = r331;
        int r341 = r98;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r98 = r341;
        int r343 = r99;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r100;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r101;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r102;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r102 = r350;
        int r352 = r103;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r104;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r105;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r106;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r107;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r108;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r109;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r110;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r111;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r112;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r113;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r114;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r115;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r116;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r117;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r118;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r119;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r120;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r121;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r122;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r123;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r124;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r125;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r126;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r126 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r127;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r127 = r402;
        int r404 = r128;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r129;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r130;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r410 = r131;
        int r411 = (int) r2.getLong(r410);     // Catch: Throwable -> L115
        int r412 = r132;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r133;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r134;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r135;
        if (r2.isNull(r418) == false) goto L98;
        String r419 = null;
    L99:
        List<Integer> r420 = this.__workoutConverter.stringToStopWatchList(r419);     // Catch: Throwable -> L115
        r135 = r418;
        int r421 = r136;
        int r422 = (int) r2.getLong(r421);     // Catch: Throwable -> L115
        int r423 = r137;
        if (r2.isNull(r423) == false) goto L103;
        String r424 = null;
    L102:
        r136 = r421;
        List<Float> r425 = this.__workoutConverter.stringToFloatWatch(r424);     // Catch: Throwable -> L115
        r137 = r423;
        int r426 = r138;
        int r427 = (int) r2.getLong(r426);     // Catch: Throwable -> L115
        int r428 = r139;
        long r1310 = r2.getLong(r428);     // Catch: Throwable -> L115
        int r429 = r140;
        int r430 = (int) r2.getLong(r429);     // Catch: Throwable -> L115
        int r431 = r141;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r142;
        long r1611 = r2.getLong(r433);     // Catch: Throwable -> L115
        int r434 = r143;
        int r435 = (int) r2.getLong(r434);     // Catch: Throwable -> L115
        int r436 = r144;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r145;
        String r1410 = null;
        long r1411 = r2.getLong(r438);     // Catch: Throwable -> L115
        int r439 = r146;
        int r440 = (int) r2.getLong(r439);     // Catch: Throwable -> L115
        int r441 = r147;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r148;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r149;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r150;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r151;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r152;
        float r452 = (float) r2.getDouble(r451);     // Catch: Throwable -> L115
        int r453 = r153;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r154;
        int r456 = (int) r2.getLong(r455);     // Catch: Throwable -> L115
        int r457 = r155;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r156;
        if (r2.isNull(r459) == false) goto L108;
        String r460 = null;
    L109:
        List<Integer> r461 = this.__workoutConverter.stringToStopWatchList(r460);     // Catch: Throwable -> L115
        int r462 = r157;
        int r463 = (int) r2.getLong(r462);     // Catch: Throwable -> L115
        int r464 = r158;
        if (r2.isNull(r464) == false) goto L112;
    L111:
        r158 = r464;
        r157 = r462;
        int r465 = r159;
        r1.add(new Workout(r162, r164, r166, r168, r163, r165, r167, r169, r170, r171, r172, r173, r174, r175, r177, r179, r181, r183, r185, r187, r189, r191, r193, r195, r197, r199, r201, r203, r205, r207, r1910, r1911, r1912, r1913, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228, r230, r232, r234, r2110, r2111, r240, r242, r244, r246, r248, r250, r252, r254, r2210, r258, r260, r2211, r264, r266, r2212, r270, r272, r2310, r276, r278, r2311, r282, r284, r2312, r288, r290, r292, r294, r296, r298, r300, r302, r304, r306, r308, r310, r312, r314, r316, r318, r320, r322, r324, r326, r330, r332, r335, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r411, r413, r415, r417, r420, r422, r425, r427, r1310, r430, r432, r1611, r435, r437, r1411, r440, r442, r444, r446, r448, r450, r452, r454, r456, r458, r461, r463, r1410, (int) r2.getLong(r465)));     // Catch: Throwable -> L115
        r159 = r465;
        r156 = r459;
        r3 = r3;
        r7 = r510;
        r51 = r241;
        r52 = r243;
        r53 = r245;
        r54 = r247;
        r55 = r249;
        r56 = r251;
        r57 = r253;
        r58 = r255;
        r59 = r257;
        r61 = r261;
        r62 = r263;
        r64 = r267;
        r65 = r269;
        r67 = r273;
        r68 = r275;
        r70 = r279;
        r71 = r281;
        r73 = r285;
        r74 = r287;
        r96 = r333;
        r99 = r343;
        r100 = r345;
        r101 = r347;
        r103 = r352;
        r104 = r354;
        r105 = r356;
        r106 = r358;
        r107 = r360;
        r108 = r362;
        r109 = r364;
        r110 = r366;
        r111 = r368;
        r112 = r370;
        r113 = r372;
        r114 = r374;
        r115 = r376;
        r116 = r378;
        r117 = r380;
        r118 = r382;
        r119 = r384;
        r120 = r386;
        r121 = r388;
        r122 = r390;
        r123 = r392;
        r124 = r394;
        r125 = r396;
        r128 = r404;
        r129 = r406;
        r130 = r408;
        r131 = r410;
        r132 = r412;
        r133 = r414;
        r138 = r426;
        r134 = r416;
        r142 = r433;
        r144 = r436;
        r145 = r438;
        r147 = r441;
        r148 = r443;
        r149 = r445;
        r150 = r447;
        r151 = r449;
        r152 = r451;
        r153 = r453;
        r154 = r455;
        r5 = r1610;
        r14 = r160;
        r4 = r4;
        r8 = r329;
        r139 = r428;
        r140 = r429;
        r141 = r431;
        r143 = r434;
        r146 = r439;
        r15 = r161;
        r155 = r457;
        r338 = r176;
        r16 = r178;
        r17 = r180;
        r18 = r182;
        r19 = r184;
        r20 = r186;
        r21 = r188;
        r22 = r190;
        r23 = r192;
        r24 = r194;
        r25 = r196;
        r26 = r198;
        r27 = r200;
        r28 = r202;
        r29 = r204;
        r30 = r206;
        r36 = r211;
        r37 = r213;
        r38 = r215;
        r39 = r217;
        r40 = r219;
        r41 = r221;
        r42 = r223;
        r43 = r225;
        r44 = r227;
        r45 = r229;
        r46 = r231;
        r47 = r233;
        r48 = r235;
        r6 = r328;
        r50 = r239;
        goto L4
    L112:
        r1410 = r2.getText(r464);     // Catch: Throwable -> L115
        goto L111
    L108:
        r460 = r2.getText(r459);     // Catch: Throwable -> L115
        goto L109
    L103:
        r424 = r2.getText(r423);     // Catch: Throwable -> L115
        goto L102
    L98:
        r419 = r2.getText(r418);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r339 = r2.getText(r336);     // Catch: Throwable -> L115
        goto L77
    L73:
        r334 = r2.getText(r333);     // Catch: Throwable -> L115
        goto L74
    L68:
        r286 = r2.getText(r285);     // Catch: Throwable -> L115
        goto L69
    L63:
        r280 = r2.getText(r279);     // Catch: Throwable -> L115
        goto L64
    L58:
        r274 = r2.getText(r273);     // Catch: Throwable -> L115
        goto L59
    L53:
        r268 = r2.getText(r267);     // Catch: Throwable -> L115
        goto L54
    L48:
        r262 = r2.getText(r261);     // Catch: Throwable -> L115
        goto L49
    L43:
        r256 = r2.getText(r255);     // Catch: Throwable -> L115
        goto L44
    L38:
        r238 = r2.getText(r237);     // Catch: Throwable -> L115
        goto L37
    L33:
        r236 = r2.getText(r235);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r34);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r209);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r208);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r31);     // Catch: Throwable -> L115
        goto L13
    L9:
        r168 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ Workout lambda$getFitnessWorkout$14(long r325, int r327, SQLiteConnection r328) {
        SQLiteStatement r2 = r328.prepare("SELECT * FROM Workout WHERE mEnd = ? AND mMode = ? LIMIT 1");
        r2.mo3338bindLong(1, r325);     // Catch: Throwable -> L117
        r2.mo3338bindLong(2, r327);     // Catch: Throwable -> L117
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L117
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L117
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L117
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L117
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L117
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L117
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L117
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L117
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L117
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L117
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L117
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L117
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L117
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L117
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L117
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L117
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L117
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L117
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L117
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L117
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L117
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L117
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L117
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L117
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L117
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L117
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L117
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L117
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L117
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L117
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L117
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L117
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L117
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L117
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L117
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L117
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L117
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L117
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L117
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L117
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L117
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L117
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L117
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L117
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L117
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L117
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L117
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L117
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L117
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L117
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L117
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L117
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L117
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L117
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L117
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L117
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L117
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L117
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L117
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L117
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L117
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L117
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L117
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L117
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L117
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L117
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L117
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L117
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L117
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L117
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L117
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L117
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L117
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L117
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L117
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L117
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L117
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L117
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L117
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L117
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L117
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L117
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L117
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L117
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L117
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L117
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L117
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L117
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L117
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L117
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L117
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L117
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L117
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L117
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L117
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L117
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L117
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L117
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L117
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L117
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L117
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L117
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L117
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L117
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L117
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L117
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L117
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L117
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L117
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L117
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L117
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L117
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L117
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L117
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L117
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L117
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L117
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L117
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L117
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L117
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L117
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L117
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L117
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L117
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L117
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L117
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L117
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L117
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L117
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L117
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L117
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L117
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L117
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L117
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L117
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L117
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L117
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L117
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L117
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L117
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L117
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L117
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L117
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L117
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L117
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L117
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L117
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L117
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L117
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L117
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L117
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L117
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L117
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L117
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L117
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L117
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L117
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L117
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L117
        Workout r1510 = null;
        String r1511 = null;
        if (r2.step() == false) goto L120;
        int r160 = (int) r2.getLong(r0);     // Catch: Throwable -> L117
        long r161 = r2.getLong(r3);     // Catch: Throwable -> L117
        long r163 = r2.getLong(r4);     // Catch: Throwable -> L117
        if (r2.isNull(r5) == false) goto L8;
        String r165 = null;
    L9:
        int r162 = (int) r2.getLong(r6);     // Catch: Throwable -> L117
        int r164 = (int) r2.getLong(r7);     // Catch: Throwable -> L117
        int r166 = (int) r2.getLong(r8);     // Catch: Throwable -> L117
        int r167 = (int) r2.getLong(r9);     // Catch: Throwable -> L117
        int r168 = (int) r2.getLong(r10);     // Catch: Throwable -> L117
        int r169 = (int) r2.getLong(r11);     // Catch: Throwable -> L117
        int r170 = (int) r2.getLong(r12);     // Catch: Throwable -> L117
        int r171 = (int) r2.getLong(r13);     // Catch: Throwable -> L117
        int r172 = (int) r2.getLong(r14);     // Catch: Throwable -> L117
        int r173 = (int) r2.getLong(r15);     // Catch: Throwable -> L117
        int r174 = (int) r2.getLong(r1);     // Catch: Throwable -> L117
        int r175 = (int) r2.getLong(r16);     // Catch: Throwable -> L117
        int r176 = (int) r2.getLong(r17);     // Catch: Throwable -> L117
        int r177 = (int) r2.getLong(r18);     // Catch: Throwable -> L117
        int r178 = (int) r2.getLong(r19);     // Catch: Throwable -> L117
        int r179 = (int) r2.getLong(r20);     // Catch: Throwable -> L117
        int r180 = (int) r2.getLong(r21);     // Catch: Throwable -> L117
        int r181 = (int) r2.getLong(r22);     // Catch: Throwable -> L117
        int r182 = (int) r2.getLong(r23);     // Catch: Throwable -> L117
        int r183 = (int) r2.getLong(r24);     // Catch: Throwable -> L117
        int r184 = (int) r2.getLong(r25);     // Catch: Throwable -> L117
        int r185 = (int) r2.getLong(r26);     // Catch: Throwable -> L117
        int r186 = (int) r2.getLong(r27);     // Catch: Throwable -> L117
        int r187 = (int) r2.getLong(r28);     // Catch: Throwable -> L117
        int r188 = (int) r2.getLong(r29);     // Catch: Throwable -> L117
        int r189 = (int) r2.getLong(r30);     // Catch: Throwable -> L117
        if (r2.isNull(r31) == false) goto L13;
        String r192 = null;
    L15:
        if (r2.isNull(r32) == false) goto L18;
        String r193 = null;
    L20:
        if (r2.isNull(r33) == false) goto L23;
        String r194 = null;
    L25:
        if (r2.isNull(r34) == false) goto L28;
        String r195 = null;
    L29:
        int r190 = (int) r2.getLong(r35);     // Catch: Throwable -> L117
        int r191 = (int) r2.getLong(r36);     // Catch: Throwable -> L117
        int r196 = (int) r2.getLong(r37);     // Catch: Throwable -> L117
        int r197 = (int) r2.getLong(r38);     // Catch: Throwable -> L117
        int r198 = (int) r2.getLong(r39);     // Catch: Throwable -> L117
        int r199 = (int) r2.getLong(r40);     // Catch: Throwable -> L117
        float r200 = (float) r2.getDouble(r41);     // Catch: Throwable -> L117
        float r201 = (float) r2.getDouble(r42);     // Catch: Throwable -> L117
        int r202 = (int) r2.getLong(r43);     // Catch: Throwable -> L117
        float r203 = (float) r2.getDouble(r44);     // Catch: Throwable -> L117
        int r204 = (int) r2.getLong(r45);     // Catch: Throwable -> L117
        int r205 = (int) r2.getLong(r46);     // Catch: Throwable -> L117
        int r206 = (int) r2.getLong(r47);     // Catch: Throwable -> L117
        if (r2.isNull(r48) == false) goto L33;
        String r207 = null;
    L124:
        int[] r209 = this.__workoutConverter.toIntArray(r207);     // Catch: Throwable -> L115
        if (r2.isNull(r49) == false) goto L38;
        String r208 = null;
    L39:
        int[] r210 = this.__workoutConverter.toIntArray(r208);     // Catch: Throwable -> L115
        int r211 = (int) r2.getLong(r50);     // Catch: Throwable -> L115
        int r212 = (int) r2.getLong(r51);     // Catch: Throwable -> L115
        int r213 = (int) r2.getLong(r52);     // Catch: Throwable -> L115
        int r214 = (int) r2.getLong(r53);     // Catch: Throwable -> L115
        int r215 = (int) r2.getLong(r54);     // Catch: Throwable -> L115
        int r216 = (int) r2.getLong(r55);     // Catch: Throwable -> L115
        int r217 = (int) r2.getLong(r56);     // Catch: Throwable -> L115
        int r218 = (int) r2.getLong(r57);     // Catch: Throwable -> L115
        if (r2.isNull(r58) == false) goto L43;
        String r219 = null;
    L44:
        List<float[]> r2110 = this.__workoutConverter.floatArrayToWatchList(r219);     // Catch: Throwable -> L115
        int r220 = (int) r2.getLong(r59);     // Catch: Throwable -> L115
        int r221 = (int) r2.getLong(r60);     // Catch: Throwable -> L115
        if (r2.isNull(r61) == false) goto L48;
        String r222 = null;
    L49:
        List<Integer> r223 = this.__workoutConverter.stringToStopWatchList(r222);     // Catch: Throwable -> L115
        int r224 = (int) r2.getLong(r62);     // Catch: Throwable -> L115
        int r225 = (int) r2.getLong(r63);     // Catch: Throwable -> L115
        if (r2.isNull(r64) == false) goto L53;
        String r226 = null;
    L54:
        List<Integer> r227 = this.__workoutConverter.stringToStopWatchList(r226);     // Catch: Throwable -> L115
        int r228 = (int) r2.getLong(r65);     // Catch: Throwable -> L115
        int r229 = (int) r2.getLong(r66);     // Catch: Throwable -> L115
        if (r2.isNull(r67) == false) goto L58;
        String r230 = null;
    L59:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r230);     // Catch: Throwable -> L115
        int r231 = (int) r2.getLong(r68);     // Catch: Throwable -> L115
        int r232 = (int) r2.getLong(r69);     // Catch: Throwable -> L115
        if (r2.isNull(r70) == false) goto L63;
        String r233 = null;
    L64:
        List<Integer> r234 = this.__workoutConverter.stringToStopWatchList(r233);     // Catch: Throwable -> L115
        int r235 = (int) r2.getLong(r71);     // Catch: Throwable -> L115
        int r236 = (int) r2.getLong(r72);     // Catch: Throwable -> L115
        if (r2.isNull(r73) == false) goto L68;
        String r237 = null;
    L69:
        List<Integer> r238 = this.__workoutConverter.stringToStopWatchList(r237);     // Catch: Throwable -> L115
        int r239 = (int) r2.getLong(r74);     // Catch: Throwable -> L115
        int r240 = (int) r2.getLong(r75);     // Catch: Throwable -> L115
        int r241 = (int) r2.getLong(r76);     // Catch: Throwable -> L115
        int r242 = (int) r2.getLong(r77);     // Catch: Throwable -> L115
        int r243 = (int) r2.getLong(r78);     // Catch: Throwable -> L115
        int r244 = (int) r2.getLong(r79);     // Catch: Throwable -> L115
        int r245 = (int) r2.getLong(r80);     // Catch: Throwable -> L115
        int r246 = (int) r2.getLong(r81);     // Catch: Throwable -> L115
        int r247 = (int) r2.getLong(r82);     // Catch: Throwable -> L115
        int r248 = (int) r2.getLong(r83);     // Catch: Throwable -> L115
        int r249 = (int) r2.getLong(r84);     // Catch: Throwable -> L115
        int r250 = (int) r2.getLong(r85);     // Catch: Throwable -> L115
        int r251 = (int) r2.getLong(r86);     // Catch: Throwable -> L115
        int r252 = (int) r2.getLong(r87);     // Catch: Throwable -> L115
        int r253 = (int) r2.getLong(r88);     // Catch: Throwable -> L115
        int r254 = (int) r2.getLong(r89);     // Catch: Throwable -> L115
        int r255 = (int) r2.getLong(r90);     // Catch: Throwable -> L115
        int r256 = (int) r2.getLong(r91);     // Catch: Throwable -> L115
        float r257 = (float) r2.getDouble(r92);     // Catch: Throwable -> L115
        int r258 = (int) r2.getLong(r93);     // Catch: Throwable -> L115
        int r259 = (int) r2.getLong(r94);     // Catch: Throwable -> L115
        float r260 = (float) r2.getDouble(r95);     // Catch: Throwable -> L115
        if (r2.isNull(r96) == false) goto L73;
        String r261 = null;
    L74:
        int[] r262 = this.__workoutConverter.toIntArray(r261);     // Catch: Throwable -> L115
        if (r2.isNull(r97) == false) goto L78;
        String r263 = null;
    L79:
        float[] r264 = this.__workoutConverter.toFloatArray(r263);     // Catch: Throwable -> L115
        int r265 = (int) r2.getLong(r98);     // Catch: Throwable -> L115
        int r266 = (int) r2.getLong(r99);     // Catch: Throwable -> L115
        int r267 = (int) r2.getLong(r100);     // Catch: Throwable -> L115
        if (r2.isNull(r101) == false) goto L83;
        String r268 = null;
    L84:
        List<Integer> r269 = this.__workoutConverter.stringToStopWatchList(r268);     // Catch: Throwable -> L115
        float r270 = (float) r2.getDouble(r102);     // Catch: Throwable -> L115
        float r271 = (float) r2.getDouble(r103);     // Catch: Throwable -> L115
        float r272 = (float) r2.getDouble(r104);     // Catch: Throwable -> L115
        float r273 = (float) r2.getDouble(r105);     // Catch: Throwable -> L115
        int r274 = (int) r2.getLong(r106);     // Catch: Throwable -> L115
        int r275 = (int) r2.getLong(r107);     // Catch: Throwable -> L115
        int r276 = (int) r2.getLong(r108);     // Catch: Throwable -> L115
        int r277 = (int) r2.getLong(r109);     // Catch: Throwable -> L115
        int r278 = (int) r2.getLong(r110);     // Catch: Throwable -> L115
        int r279 = (int) r2.getLong(r111);     // Catch: Throwable -> L115
        int r280 = (int) r2.getLong(r112);     // Catch: Throwable -> L115
        int r281 = (int) r2.getLong(r113);     // Catch: Throwable -> L115
        int r282 = (int) r2.getLong(r114);     // Catch: Throwable -> L115
        int r283 = (int) r2.getLong(r115);     // Catch: Throwable -> L115
        int r284 = (int) r2.getLong(r116);     // Catch: Throwable -> L115
        int r285 = (int) r2.getLong(r117);     // Catch: Throwable -> L115
        float r286 = (float) r2.getDouble(r118);     // Catch: Throwable -> L115
        float r287 = (float) r2.getDouble(r119);     // Catch: Throwable -> L115
        int r288 = (int) r2.getLong(r120);     // Catch: Throwable -> L115
        int r289 = (int) r2.getLong(r121);     // Catch: Throwable -> L115
        int r290 = (int) r2.getLong(r122);     // Catch: Throwable -> L115
        int r291 = (int) r2.getLong(r123);     // Catch: Throwable -> L115
        float r292 = (float) r2.getDouble(r124);     // Catch: Throwable -> L115
        if (r2.isNull(r125) == false) goto L88;
        String r293 = null;
    L89:
        float[] r294 = this.__workoutConverter.toFloatArray(r293);     // Catch: Throwable -> L115
        if (r2.isNull(r126) == false) goto L93;
        String r295 = null;
    L94:
        float[] r296 = this.__workoutConverter.toFloatArray(r295);     // Catch: Throwable -> L115
        int r297 = (int) r2.getLong(r127);     // Catch: Throwable -> L115
        int r298 = (int) r2.getLong(r128);     // Catch: Throwable -> L115
        int r299 = (int) r2.getLong(r129);     // Catch: Throwable -> L115
        int r300 = (int) r2.getLong(r130);     // Catch: Throwable -> L115
        int r301 = (int) r2.getLong(r131);     // Catch: Throwable -> L115
        int r302 = (int) r2.getLong(r132);     // Catch: Throwable -> L115
        int r303 = (int) r2.getLong(r133);     // Catch: Throwable -> L115
        int r304 = (int) r2.getLong(r134);     // Catch: Throwable -> L115
        if (r2.isNull(r135) == false) goto L98;
        String r305 = null;
    L99:
        List<Integer> r306 = this.__workoutConverter.stringToStopWatchList(r305);     // Catch: Throwable -> L115
        int r307 = (int) r2.getLong(r136);     // Catch: Throwable -> L115
        if (r2.isNull(r137) == false) goto L103;
        String r308 = null;
    L104:
        List<Float> r309 = this.__workoutConverter.stringToFloatWatch(r308);     // Catch: Throwable -> L115
        int r310 = (int) r2.getLong(r138);     // Catch: Throwable -> L115
        long r1100 = r2.getLong(r139);     // Catch: Throwable -> L115
        int r311 = (int) r2.getLong(r140);     // Catch: Throwable -> L115
        int r312 = (int) r2.getLong(r141);     // Catch: Throwable -> L115
        long r1101 = r2.getLong(r142);     // Catch: Throwable -> L115
        int r313 = (int) r2.getLong(r143);     // Catch: Throwable -> L115
        int r314 = (int) r2.getLong(r144);     // Catch: Throwable -> L115
        long r2100 = r2.getLong(r145);     // Catch: Throwable -> L115
        int r315 = (int) r2.getLong(r146);     // Catch: Throwable -> L115
        int r316 = (int) r2.getLong(r147);     // Catch: Throwable -> L115
        int r317 = (int) r2.getLong(r148);     // Catch: Throwable -> L115
        int r318 = (int) r2.getLong(r149);     // Catch: Throwable -> L115
        int r319 = (int) r2.getLong(r150);     // Catch: Throwable -> L115
        int r320 = (int) r2.getLong(r151);     // Catch: Throwable -> L115
        float r321 = (float) r2.getDouble(r152);     // Catch: Throwable -> L115
        float r322 = (float) r2.getDouble(r153);     // Catch: Throwable -> L115
        int r323 = (int) r2.getLong(r154);     // Catch: Throwable -> L115
        int r324 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        if (r2.isNull(r156) == false) goto L108;
        String r326 = null;
    L109:
        List<Integer> r329 = this.__workoutConverter.stringToStopWatchList(r326);     // Catch: Throwable -> L115
        int r330 = (int) r2.getLong(r157);     // Catch: Throwable -> L115
        if (r2.isNull(r158) == true) goto L113;
        r1511 = r2.getText(r158);     // Catch: Throwable -> L115
    L113:
        r1510 = new Workout(r160, r161, r163, r165, r162, r164, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r192, r193, r194, r195, r190, r191, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r2110, r220, r221, r223, r224, r225, r227, r228, r229, r2210, r231, r232, r234, r235, r236, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r262, r264, r265, r266, r267, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r294, r296, r297, r298, r299, r300, r301, r302, r303, r304, r306, r307, r309, r310, r1100, r311, r312, r1101, r313, r314, r2100, r315, r316, r317, r318, r319, r320, r321, r322, r323, r324, r329, r330, r1511, (int) r2.getLong(r159));     // Catch: Throwable -> L115
        goto L120
    L108:
        r326 = r2.getText(r156);     // Catch: Throwable -> L115
        goto L109
    L103:
        r308 = r2.getText(r137);     // Catch: Throwable -> L115
        goto L104
    L98:
        r305 = r2.getText(r135);     // Catch: Throwable -> L115
        goto L99
    L93:
        r295 = r2.getText(r126);     // Catch: Throwable -> L115
        goto L94
    L88:
        r293 = r2.getText(r125);     // Catch: Throwable -> L115
        goto L89
    L83:
        r268 = r2.getText(r101);     // Catch: Throwable -> L115
        goto L84
    L78:
        r263 = r2.getText(r97);     // Catch: Throwable -> L115
        goto L79
    L73:
        r261 = r2.getText(r96);     // Catch: Throwable -> L115
        goto L74
    L68:
        r237 = r2.getText(r73);     // Catch: Throwable -> L115
        goto L69
    L63:
        r233 = r2.getText(r70);     // Catch: Throwable -> L115
        goto L64
    L58:
        r230 = r2.getText(r67);     // Catch: Throwable -> L115
        goto L59
    L53:
        r226 = r2.getText(r64);     // Catch: Throwable -> L115
        goto L54
    L48:
        r222 = r2.getText(r61);     // Catch: Throwable -> L115
        goto L49
    L43:
        r219 = r2.getText(r58);     // Catch: Throwable -> L115
        goto L44
    L38:
        r208 = r2.getText(r49);     // Catch: Throwable -> L115
    L115:
        th = th;
    L122:
        r2.close();
        throw th;
    L33:
        r207 = r2.getText(r48);     // Catch: Throwable -> L117
        goto L124
    L28:
        r195 = r2.getText(r34);     // Catch: Throwable -> L117
        goto L29
    L23:
        r194 = r2.getText(r33);     // Catch: Throwable -> L117
        goto L25
    L18:
        r193 = r2.getText(r32);     // Catch: Throwable -> L117
        goto L20
    L13:
        r192 = r2.getText(r31);     // Catch: Throwable -> L117
        goto L15
    L8:
        r165 = r2.getText(r5);     // Catch: Throwable -> L117
    L120:
        r2.close();
        return r1510;
    L117:
        th = th;
        goto L122
    }

    private /* synthetic */ List lambda$getList$3(SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r160 = r14;
        int r161 = r15;
        int r162 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r164 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r166 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r168 = null;
    L10:
        int r163 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r173 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r328 = r6;
        int r1610 = r5;
        int r174 = (int) r2.getLong(r160);     // Catch: Throwable -> L115
        int r175 = (int) r2.getLong(r161);     // Catch: Throwable -> L115
        int r176 = r338;
        int r177 = (int) r2.getLong(r176);     // Catch: Throwable -> L115
        int r178 = r16;
        int r179 = (int) r2.getLong(r178);     // Catch: Throwable -> L115
        int r180 = r17;
        int r181 = (int) r2.getLong(r180);     // Catch: Throwable -> L115
        int r182 = r18;
        int r183 = (int) r2.getLong(r182);     // Catch: Throwable -> L115
        int r184 = r19;
        int r185 = (int) r2.getLong(r184);     // Catch: Throwable -> L115
        int r186 = r20;
        int r187 = (int) r2.getLong(r186);     // Catch: Throwable -> L115
        int r188 = r21;
        int r189 = (int) r2.getLong(r188);     // Catch: Throwable -> L115
        int r190 = r22;
        int r191 = (int) r2.getLong(r190);     // Catch: Throwable -> L115
        int r192 = r23;
        int r193 = (int) r2.getLong(r192);     // Catch: Throwable -> L115
        int r194 = r24;
        int r195 = (int) r2.getLong(r194);     // Catch: Throwable -> L115
        int r196 = r25;
        int r197 = (int) r2.getLong(r196);     // Catch: Throwable -> L115
        int r198 = r26;
        int r199 = (int) r2.getLong(r198);     // Catch: Throwable -> L115
        int r200 = r27;
        int r201 = (int) r2.getLong(r200);     // Catch: Throwable -> L115
        int r202 = r28;
        int r203 = (int) r2.getLong(r202);     // Catch: Throwable -> L115
        int r204 = r29;
        int r205 = (int) r2.getLong(r204);     // Catch: Throwable -> L115
        int r206 = r30;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        r31 = r31;
        if (r2.isNull(r31) == false) goto L14;
        String r1910 = null;
    L13:
        int r208 = r32;
        if (r2.isNull(r208) == false) goto L19;
        String r1911 = null;
    L18:
        r32 = r208;
        int r209 = r33;
        if (r2.isNull(r209) == false) goto L24;
        String r1912 = null;
    L23:
        r33 = r209;
        r34 = r34;
        if (r2.isNull(r34) == false) goto L28;
        String r1913 = null;
    L29:
        int r210 = (int) r2.getLong(r35);     // Catch: Throwable -> L115
        r35 = r35;
        int r211 = r36;
        int r212 = (int) r2.getLong(r211);     // Catch: Throwable -> L115
        int r213 = r37;
        int r214 = (int) r2.getLong(r213);     // Catch: Throwable -> L115
        int r215 = r38;
        int r216 = (int) r2.getLong(r215);     // Catch: Throwable -> L115
        int r217 = r39;
        int r218 = (int) r2.getLong(r217);     // Catch: Throwable -> L115
        int r219 = r40;
        int r220 = (int) r2.getLong(r219);     // Catch: Throwable -> L115
        int r221 = r41;
        float r222 = (float) r2.getDouble(r221);     // Catch: Throwable -> L115
        int r223 = r42;
        float r224 = (float) r2.getDouble(r223);     // Catch: Throwable -> L115
        int r225 = r43;
        int r226 = (int) r2.getLong(r225);     // Catch: Throwable -> L115
        int r227 = r44;
        float r228 = (float) r2.getDouble(r227);     // Catch: Throwable -> L115
        int r229 = r45;
        int r230 = (int) r2.getLong(r229);     // Catch: Throwable -> L115
        int r231 = r46;
        int r232 = (int) r2.getLong(r231);     // Catch: Throwable -> L115
        int r233 = r47;
        int r234 = (int) r2.getLong(r233);     // Catch: Throwable -> L115
        int r235 = r48;
        if (r2.isNull(r235) == false) goto L33;
        String r236 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r236);     // Catch: Throwable -> L115
        int r237 = r49;
        if (r2.isNull(r237) == false) goto L38;
        String r238 = null;
    L37:
        r49 = r237;
        int[] r2111 = this.__workoutConverter.toIntArray(r238);     // Catch: Throwable -> L115
        int r239 = r50;
        int r240 = (int) r2.getLong(r239);     // Catch: Throwable -> L115
        int r329 = r8;
        int r241 = r51;
        int r510 = r7;
        int r242 = (int) r2.getLong(r241);     // Catch: Throwable -> L115
        int r243 = r52;
        int r244 = (int) r2.getLong(r243);     // Catch: Throwable -> L115
        int r245 = r53;
        int r246 = (int) r2.getLong(r245);     // Catch: Throwable -> L115
        int r247 = r54;
        int r248 = (int) r2.getLong(r247);     // Catch: Throwable -> L115
        int r249 = r55;
        int r250 = (int) r2.getLong(r249);     // Catch: Throwable -> L115
        int r251 = r56;
        int r252 = (int) r2.getLong(r251);     // Catch: Throwable -> L115
        int r253 = r57;
        int r254 = (int) r2.getLong(r253);     // Catch: Throwable -> L115
        int r255 = r58;
        if (r2.isNull(r255) == false) goto L43;
        String r256 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r256);     // Catch: Throwable -> L115
        int r257 = r59;
        int r258 = (int) r2.getLong(r257);     // Catch: Throwable -> L115
        int r259 = r60;
        int r260 = (int) r2.getLong(r259);     // Catch: Throwable -> L115
        int r261 = r61;
        if (r2.isNull(r261) == false) goto L48;
        String r262 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r262);     // Catch: Throwable -> L115
        r60 = r259;
        int r263 = r62;
        int r264 = (int) r2.getLong(r263);     // Catch: Throwable -> L115
        int r265 = r63;
        int r266 = (int) r2.getLong(r265);     // Catch: Throwable -> L115
        int r267 = r64;
        if (r2.isNull(r267) == false) goto L53;
        String r268 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r268);     // Catch: Throwable -> L115
        r63 = r265;
        int r269 = r65;
        int r270 = (int) r2.getLong(r269);     // Catch: Throwable -> L115
        int r271 = r66;
        int r272 = (int) r2.getLong(r271);     // Catch: Throwable -> L115
        int r273 = r67;
        if (r2.isNull(r273) == false) goto L58;
        String r274 = null;
    L59:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r274);     // Catch: Throwable -> L115
        r66 = r271;
        int r275 = r68;
        int r276 = (int) r2.getLong(r275);     // Catch: Throwable -> L115
        int r277 = r69;
        int r278 = (int) r2.getLong(r277);     // Catch: Throwable -> L115
        int r279 = r70;
        if (r2.isNull(r279) == false) goto L63;
        String r280 = null;
    L64:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r280);     // Catch: Throwable -> L115
        r69 = r277;
        int r281 = r71;
        int r282 = (int) r2.getLong(r281);     // Catch: Throwable -> L115
        int r283 = r72;
        int r284 = (int) r2.getLong(r283);     // Catch: Throwable -> L115
        int r285 = r73;
        if (r2.isNull(r285) == false) goto L68;
        String r286 = null;
    L69:
        List<Integer> r2312 = this.__workoutConverter.stringToStopWatchList(r286);     // Catch: Throwable -> L115
        r72 = r283;
        int r287 = r74;
        int r288 = (int) r2.getLong(r287);     // Catch: Throwable -> L115
        int r289 = r75;
        int r290 = (int) r2.getLong(r289);     // Catch: Throwable -> L115
        r75 = r289;
        int r291 = r76;
        int r292 = (int) r2.getLong(r291);     // Catch: Throwable -> L115
        r76 = r291;
        int r293 = r77;
        int r294 = (int) r2.getLong(r293);     // Catch: Throwable -> L115
        r77 = r293;
        int r295 = r78;
        int r296 = (int) r2.getLong(r295);     // Catch: Throwable -> L115
        r78 = r295;
        int r297 = r79;
        int r298 = (int) r2.getLong(r297);     // Catch: Throwable -> L115
        r79 = r297;
        int r299 = r80;
        int r300 = (int) r2.getLong(r299);     // Catch: Throwable -> L115
        r80 = r299;
        int r301 = r81;
        int r302 = (int) r2.getLong(r301);     // Catch: Throwable -> L115
        r81 = r301;
        int r303 = r82;
        int r304 = (int) r2.getLong(r303);     // Catch: Throwable -> L115
        r82 = r303;
        int r305 = r83;
        int r306 = (int) r2.getLong(r305);     // Catch: Throwable -> L115
        r83 = r305;
        int r307 = r84;
        int r308 = (int) r2.getLong(r307);     // Catch: Throwable -> L115
        r84 = r307;
        int r309 = r85;
        int r310 = (int) r2.getLong(r309);     // Catch: Throwable -> L115
        r85 = r309;
        int r311 = r86;
        int r312 = (int) r2.getLong(r311);     // Catch: Throwable -> L115
        r86 = r311;
        int r313 = r87;
        int r314 = (int) r2.getLong(r313);     // Catch: Throwable -> L115
        r87 = r313;
        int r315 = r88;
        int r316 = (int) r2.getLong(r315);     // Catch: Throwable -> L115
        r88 = r315;
        int r317 = r89;
        int r318 = (int) r2.getLong(r317);     // Catch: Throwable -> L115
        r89 = r317;
        int r319 = r90;
        int r320 = (int) r2.getLong(r319);     // Catch: Throwable -> L115
        r90 = r319;
        int r321 = r91;
        int r322 = (int) r2.getLong(r321);     // Catch: Throwable -> L115
        r91 = r321;
        int r323 = r92;
        float r324 = (float) r2.getDouble(r323);     // Catch: Throwable -> L115
        r92 = r323;
        int r325 = r93;
        int r326 = (int) r2.getLong(r325);     // Catch: Throwable -> L115
        r93 = r325;
        int r327 = r94;
        int r330 = (int) r2.getLong(r327);     // Catch: Throwable -> L115
        r94 = r327;
        int r331 = r95;
        float r332 = (float) r2.getDouble(r331);     // Catch: Throwable -> L115
        int r333 = r96;
        if (r2.isNull(r333) == false) goto L73;
        String r334 = null;
    L74:
        int[] r335 = this.__workoutConverter.toIntArray(r334);     // Catch: Throwable -> L115
        int r336 = r97;
        if (r2.isNull(r336) == false) goto L78;
        String r339 = null;
    L77:
        r97 = r336;
        float[] r340 = this.__workoutConverter.toFloatArray(r339);     // Catch: Throwable -> L115
        r95 = r331;
        int r341 = r98;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r98 = r341;
        int r343 = r99;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r100;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r101;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r102;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r102 = r350;
        int r352 = r103;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r104;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r105;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r106;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r107;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r108;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r109;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r110;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r111;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r112;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r113;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r114;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r115;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r116;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r117;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r118;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r119;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r120;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r121;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r122;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r123;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r124;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r125;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r126;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r126 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r127;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r127 = r402;
        int r404 = r128;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r129;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r130;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r410 = r131;
        int r411 = (int) r2.getLong(r410);     // Catch: Throwable -> L115
        int r412 = r132;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r133;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r134;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r135;
        if (r2.isNull(r418) == false) goto L98;
        String r419 = null;
    L99:
        List<Integer> r420 = this.__workoutConverter.stringToStopWatchList(r419);     // Catch: Throwable -> L115
        r135 = r418;
        int r421 = r136;
        int r422 = (int) r2.getLong(r421);     // Catch: Throwable -> L115
        int r423 = r137;
        if (r2.isNull(r423) == false) goto L103;
        String r424 = null;
    L102:
        r136 = r421;
        List<Float> r425 = this.__workoutConverter.stringToFloatWatch(r424);     // Catch: Throwable -> L115
        r137 = r423;
        int r426 = r138;
        int r427 = (int) r2.getLong(r426);     // Catch: Throwable -> L115
        int r428 = r139;
        long r1310 = r2.getLong(r428);     // Catch: Throwable -> L115
        int r429 = r140;
        int r430 = (int) r2.getLong(r429);     // Catch: Throwable -> L115
        int r431 = r141;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r142;
        long r1611 = r2.getLong(r433);     // Catch: Throwable -> L115
        int r434 = r143;
        int r435 = (int) r2.getLong(r434);     // Catch: Throwable -> L115
        int r436 = r144;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r145;
        String r1410 = null;
        long r1411 = r2.getLong(r438);     // Catch: Throwable -> L115
        int r439 = r146;
        int r440 = (int) r2.getLong(r439);     // Catch: Throwable -> L115
        int r441 = r147;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r148;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r149;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r150;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r151;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r152;
        float r452 = (float) r2.getDouble(r451);     // Catch: Throwable -> L115
        int r453 = r153;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r154;
        int r456 = (int) r2.getLong(r455);     // Catch: Throwable -> L115
        int r457 = r155;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r156;
        if (r2.isNull(r459) == false) goto L108;
        String r460 = null;
    L109:
        List<Integer> r461 = this.__workoutConverter.stringToStopWatchList(r460);     // Catch: Throwable -> L115
        int r462 = r157;
        int r463 = (int) r2.getLong(r462);     // Catch: Throwable -> L115
        int r464 = r158;
        if (r2.isNull(r464) == false) goto L112;
    L111:
        r158 = r464;
        r157 = r462;
        int r465 = r159;
        r1.add(new Workout(r162, r164, r166, r168, r163, r165, r167, r169, r170, r171, r172, r173, r174, r175, r177, r179, r181, r183, r185, r187, r189, r191, r193, r195, r197, r199, r201, r203, r205, r207, r1910, r1911, r1912, r1913, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228, r230, r232, r234, r2110, r2111, r240, r242, r244, r246, r248, r250, r252, r254, r2210, r258, r260, r2211, r264, r266, r2212, r270, r272, r2310, r276, r278, r2311, r282, r284, r2312, r288, r290, r292, r294, r296, r298, r300, r302, r304, r306, r308, r310, r312, r314, r316, r318, r320, r322, r324, r326, r330, r332, r335, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r411, r413, r415, r417, r420, r422, r425, r427, r1310, r430, r432, r1611, r435, r437, r1411, r440, r442, r444, r446, r448, r450, r452, r454, r456, r458, r461, r463, r1410, (int) r2.getLong(r465)));     // Catch: Throwable -> L115
        r159 = r465;
        r156 = r459;
        r3 = r3;
        r7 = r510;
        r51 = r241;
        r52 = r243;
        r53 = r245;
        r54 = r247;
        r55 = r249;
        r56 = r251;
        r57 = r253;
        r58 = r255;
        r59 = r257;
        r61 = r261;
        r62 = r263;
        r64 = r267;
        r65 = r269;
        r67 = r273;
        r68 = r275;
        r70 = r279;
        r71 = r281;
        r73 = r285;
        r74 = r287;
        r96 = r333;
        r99 = r343;
        r100 = r345;
        r101 = r347;
        r103 = r352;
        r104 = r354;
        r105 = r356;
        r106 = r358;
        r107 = r360;
        r108 = r362;
        r109 = r364;
        r110 = r366;
        r111 = r368;
        r112 = r370;
        r113 = r372;
        r114 = r374;
        r115 = r376;
        r116 = r378;
        r117 = r380;
        r118 = r382;
        r119 = r384;
        r120 = r386;
        r121 = r388;
        r122 = r390;
        r123 = r392;
        r124 = r394;
        r125 = r396;
        r128 = r404;
        r129 = r406;
        r130 = r408;
        r131 = r410;
        r132 = r412;
        r133 = r414;
        r138 = r426;
        r134 = r416;
        r142 = r433;
        r144 = r436;
        r145 = r438;
        r147 = r441;
        r148 = r443;
        r149 = r445;
        r150 = r447;
        r151 = r449;
        r152 = r451;
        r153 = r453;
        r154 = r455;
        r5 = r1610;
        r14 = r160;
        r4 = r4;
        r8 = r329;
        r139 = r428;
        r140 = r429;
        r141 = r431;
        r143 = r434;
        r146 = r439;
        r15 = r161;
        r155 = r457;
        r338 = r176;
        r16 = r178;
        r17 = r180;
        r18 = r182;
        r19 = r184;
        r20 = r186;
        r21 = r188;
        r22 = r190;
        r23 = r192;
        r24 = r194;
        r25 = r196;
        r26 = r198;
        r27 = r200;
        r28 = r202;
        r29 = r204;
        r30 = r206;
        r36 = r211;
        r37 = r213;
        r38 = r215;
        r39 = r217;
        r40 = r219;
        r41 = r221;
        r42 = r223;
        r43 = r225;
        r44 = r227;
        r45 = r229;
        r46 = r231;
        r47 = r233;
        r48 = r235;
        r6 = r328;
        r50 = r239;
        goto L4
    L112:
        r1410 = r2.getText(r464);     // Catch: Throwable -> L115
        goto L111
    L108:
        r460 = r2.getText(r459);     // Catch: Throwable -> L115
        goto L109
    L103:
        r424 = r2.getText(r423);     // Catch: Throwable -> L115
        goto L102
    L98:
        r419 = r2.getText(r418);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r339 = r2.getText(r336);     // Catch: Throwable -> L115
        goto L77
    L73:
        r334 = r2.getText(r333);     // Catch: Throwable -> L115
        goto L74
    L68:
        r286 = r2.getText(r285);     // Catch: Throwable -> L115
        goto L69
    L63:
        r280 = r2.getText(r279);     // Catch: Throwable -> L115
        goto L64
    L58:
        r274 = r2.getText(r273);     // Catch: Throwable -> L115
        goto L59
    L53:
        r268 = r2.getText(r267);     // Catch: Throwable -> L115
        goto L54
    L48:
        r262 = r2.getText(r261);     // Catch: Throwable -> L115
        goto L49
    L43:
        r256 = r2.getText(r255);     // Catch: Throwable -> L115
        goto L44
    L38:
        r238 = r2.getText(r237);     // Catch: Throwable -> L115
        goto L37
    L33:
        r236 = r2.getText(r235);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r34);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r209);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r208);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r31);     // Catch: Throwable -> L115
        goto L13
    L9:
        r168 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListASC$5(SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE  mIsSync = 0 AND mStart > 0 ORDER BY mStart ASC LIMIT 150");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r160 = r14;
        int r161 = r15;
        int r162 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r164 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r166 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r168 = null;
    L10:
        int r163 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r173 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r328 = r6;
        int r1610 = r5;
        int r174 = (int) r2.getLong(r160);     // Catch: Throwable -> L115
        int r175 = (int) r2.getLong(r161);     // Catch: Throwable -> L115
        int r176 = r338;
        int r177 = (int) r2.getLong(r176);     // Catch: Throwable -> L115
        int r178 = r16;
        int r179 = (int) r2.getLong(r178);     // Catch: Throwable -> L115
        int r180 = r17;
        int r181 = (int) r2.getLong(r180);     // Catch: Throwable -> L115
        int r182 = r18;
        int r183 = (int) r2.getLong(r182);     // Catch: Throwable -> L115
        int r184 = r19;
        int r185 = (int) r2.getLong(r184);     // Catch: Throwable -> L115
        int r186 = r20;
        int r187 = (int) r2.getLong(r186);     // Catch: Throwable -> L115
        int r188 = r21;
        int r189 = (int) r2.getLong(r188);     // Catch: Throwable -> L115
        int r190 = r22;
        int r191 = (int) r2.getLong(r190);     // Catch: Throwable -> L115
        int r192 = r23;
        int r193 = (int) r2.getLong(r192);     // Catch: Throwable -> L115
        int r194 = r24;
        int r195 = (int) r2.getLong(r194);     // Catch: Throwable -> L115
        int r196 = r25;
        int r197 = (int) r2.getLong(r196);     // Catch: Throwable -> L115
        int r198 = r26;
        int r199 = (int) r2.getLong(r198);     // Catch: Throwable -> L115
        int r200 = r27;
        int r201 = (int) r2.getLong(r200);     // Catch: Throwable -> L115
        int r202 = r28;
        int r203 = (int) r2.getLong(r202);     // Catch: Throwable -> L115
        int r204 = r29;
        int r205 = (int) r2.getLong(r204);     // Catch: Throwable -> L115
        int r206 = r30;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        r31 = r31;
        if (r2.isNull(r31) == false) goto L14;
        String r1910 = null;
    L13:
        int r208 = r32;
        if (r2.isNull(r208) == false) goto L19;
        String r1911 = null;
    L18:
        r32 = r208;
        int r209 = r33;
        if (r2.isNull(r209) == false) goto L24;
        String r1912 = null;
    L23:
        r33 = r209;
        r34 = r34;
        if (r2.isNull(r34) == false) goto L28;
        String r1913 = null;
    L29:
        int r210 = (int) r2.getLong(r35);     // Catch: Throwable -> L115
        r35 = r35;
        int r211 = r36;
        int r212 = (int) r2.getLong(r211);     // Catch: Throwable -> L115
        int r213 = r37;
        int r214 = (int) r2.getLong(r213);     // Catch: Throwable -> L115
        int r215 = r38;
        int r216 = (int) r2.getLong(r215);     // Catch: Throwable -> L115
        int r217 = r39;
        int r218 = (int) r2.getLong(r217);     // Catch: Throwable -> L115
        int r219 = r40;
        int r220 = (int) r2.getLong(r219);     // Catch: Throwable -> L115
        int r221 = r41;
        float r222 = (float) r2.getDouble(r221);     // Catch: Throwable -> L115
        int r223 = r42;
        float r224 = (float) r2.getDouble(r223);     // Catch: Throwable -> L115
        int r225 = r43;
        int r226 = (int) r2.getLong(r225);     // Catch: Throwable -> L115
        int r227 = r44;
        float r228 = (float) r2.getDouble(r227);     // Catch: Throwable -> L115
        int r229 = r45;
        int r230 = (int) r2.getLong(r229);     // Catch: Throwable -> L115
        int r231 = r46;
        int r232 = (int) r2.getLong(r231);     // Catch: Throwable -> L115
        int r233 = r47;
        int r234 = (int) r2.getLong(r233);     // Catch: Throwable -> L115
        int r235 = r48;
        if (r2.isNull(r235) == false) goto L33;
        String r236 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r236);     // Catch: Throwable -> L115
        int r237 = r49;
        if (r2.isNull(r237) == false) goto L38;
        String r238 = null;
    L37:
        r49 = r237;
        int[] r2111 = this.__workoutConverter.toIntArray(r238);     // Catch: Throwable -> L115
        int r239 = r50;
        int r240 = (int) r2.getLong(r239);     // Catch: Throwable -> L115
        int r329 = r8;
        int r241 = r51;
        int r510 = r7;
        int r242 = (int) r2.getLong(r241);     // Catch: Throwable -> L115
        int r243 = r52;
        int r244 = (int) r2.getLong(r243);     // Catch: Throwable -> L115
        int r245 = r53;
        int r246 = (int) r2.getLong(r245);     // Catch: Throwable -> L115
        int r247 = r54;
        int r248 = (int) r2.getLong(r247);     // Catch: Throwable -> L115
        int r249 = r55;
        int r250 = (int) r2.getLong(r249);     // Catch: Throwable -> L115
        int r251 = r56;
        int r252 = (int) r2.getLong(r251);     // Catch: Throwable -> L115
        int r253 = r57;
        int r254 = (int) r2.getLong(r253);     // Catch: Throwable -> L115
        int r255 = r58;
        if (r2.isNull(r255) == false) goto L43;
        String r256 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r256);     // Catch: Throwable -> L115
        int r257 = r59;
        int r258 = (int) r2.getLong(r257);     // Catch: Throwable -> L115
        int r259 = r60;
        int r260 = (int) r2.getLong(r259);     // Catch: Throwable -> L115
        int r261 = r61;
        if (r2.isNull(r261) == false) goto L48;
        String r262 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r262);     // Catch: Throwable -> L115
        r60 = r259;
        int r263 = r62;
        int r264 = (int) r2.getLong(r263);     // Catch: Throwable -> L115
        int r265 = r63;
        int r266 = (int) r2.getLong(r265);     // Catch: Throwable -> L115
        int r267 = r64;
        if (r2.isNull(r267) == false) goto L53;
        String r268 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r268);     // Catch: Throwable -> L115
        r63 = r265;
        int r269 = r65;
        int r270 = (int) r2.getLong(r269);     // Catch: Throwable -> L115
        int r271 = r66;
        int r272 = (int) r2.getLong(r271);     // Catch: Throwable -> L115
        int r273 = r67;
        if (r2.isNull(r273) == false) goto L58;
        String r274 = null;
    L59:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r274);     // Catch: Throwable -> L115
        r66 = r271;
        int r275 = r68;
        int r276 = (int) r2.getLong(r275);     // Catch: Throwable -> L115
        int r277 = r69;
        int r278 = (int) r2.getLong(r277);     // Catch: Throwable -> L115
        int r279 = r70;
        if (r2.isNull(r279) == false) goto L63;
        String r280 = null;
    L64:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r280);     // Catch: Throwable -> L115
        r69 = r277;
        int r281 = r71;
        int r282 = (int) r2.getLong(r281);     // Catch: Throwable -> L115
        int r283 = r72;
        int r284 = (int) r2.getLong(r283);     // Catch: Throwable -> L115
        int r285 = r73;
        if (r2.isNull(r285) == false) goto L68;
        String r286 = null;
    L69:
        List<Integer> r2312 = this.__workoutConverter.stringToStopWatchList(r286);     // Catch: Throwable -> L115
        r72 = r283;
        int r287 = r74;
        int r288 = (int) r2.getLong(r287);     // Catch: Throwable -> L115
        int r289 = r75;
        int r290 = (int) r2.getLong(r289);     // Catch: Throwable -> L115
        r75 = r289;
        int r291 = r76;
        int r292 = (int) r2.getLong(r291);     // Catch: Throwable -> L115
        r76 = r291;
        int r293 = r77;
        int r294 = (int) r2.getLong(r293);     // Catch: Throwable -> L115
        r77 = r293;
        int r295 = r78;
        int r296 = (int) r2.getLong(r295);     // Catch: Throwable -> L115
        r78 = r295;
        int r297 = r79;
        int r298 = (int) r2.getLong(r297);     // Catch: Throwable -> L115
        r79 = r297;
        int r299 = r80;
        int r300 = (int) r2.getLong(r299);     // Catch: Throwable -> L115
        r80 = r299;
        int r301 = r81;
        int r302 = (int) r2.getLong(r301);     // Catch: Throwable -> L115
        r81 = r301;
        int r303 = r82;
        int r304 = (int) r2.getLong(r303);     // Catch: Throwable -> L115
        r82 = r303;
        int r305 = r83;
        int r306 = (int) r2.getLong(r305);     // Catch: Throwable -> L115
        r83 = r305;
        int r307 = r84;
        int r308 = (int) r2.getLong(r307);     // Catch: Throwable -> L115
        r84 = r307;
        int r309 = r85;
        int r310 = (int) r2.getLong(r309);     // Catch: Throwable -> L115
        r85 = r309;
        int r311 = r86;
        int r312 = (int) r2.getLong(r311);     // Catch: Throwable -> L115
        r86 = r311;
        int r313 = r87;
        int r314 = (int) r2.getLong(r313);     // Catch: Throwable -> L115
        r87 = r313;
        int r315 = r88;
        int r316 = (int) r2.getLong(r315);     // Catch: Throwable -> L115
        r88 = r315;
        int r317 = r89;
        int r318 = (int) r2.getLong(r317);     // Catch: Throwable -> L115
        r89 = r317;
        int r319 = r90;
        int r320 = (int) r2.getLong(r319);     // Catch: Throwable -> L115
        r90 = r319;
        int r321 = r91;
        int r322 = (int) r2.getLong(r321);     // Catch: Throwable -> L115
        r91 = r321;
        int r323 = r92;
        float r324 = (float) r2.getDouble(r323);     // Catch: Throwable -> L115
        r92 = r323;
        int r325 = r93;
        int r326 = (int) r2.getLong(r325);     // Catch: Throwable -> L115
        r93 = r325;
        int r327 = r94;
        int r330 = (int) r2.getLong(r327);     // Catch: Throwable -> L115
        r94 = r327;
        int r331 = r95;
        float r332 = (float) r2.getDouble(r331);     // Catch: Throwable -> L115
        int r333 = r96;
        if (r2.isNull(r333) == false) goto L73;
        String r334 = null;
    L74:
        int[] r335 = this.__workoutConverter.toIntArray(r334);     // Catch: Throwable -> L115
        int r336 = r97;
        if (r2.isNull(r336) == false) goto L78;
        String r339 = null;
    L77:
        r97 = r336;
        float[] r340 = this.__workoutConverter.toFloatArray(r339);     // Catch: Throwable -> L115
        r95 = r331;
        int r341 = r98;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r98 = r341;
        int r343 = r99;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r100;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r101;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r102;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r102 = r350;
        int r352 = r103;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r104;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r105;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r106;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r107;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r108;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r109;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r110;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r111;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r112;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r113;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r114;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r115;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r116;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r117;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r118;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r119;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r120;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r121;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r122;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r123;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r124;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r125;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r126;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r126 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r127;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r127 = r402;
        int r404 = r128;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r129;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r130;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r410 = r131;
        int r411 = (int) r2.getLong(r410);     // Catch: Throwable -> L115
        int r412 = r132;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r133;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r134;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r135;
        if (r2.isNull(r418) == false) goto L98;
        String r419 = null;
    L99:
        List<Integer> r420 = this.__workoutConverter.stringToStopWatchList(r419);     // Catch: Throwable -> L115
        r135 = r418;
        int r421 = r136;
        int r422 = (int) r2.getLong(r421);     // Catch: Throwable -> L115
        int r423 = r137;
        if (r2.isNull(r423) == false) goto L103;
        String r424 = null;
    L102:
        r136 = r421;
        List<Float> r425 = this.__workoutConverter.stringToFloatWatch(r424);     // Catch: Throwable -> L115
        r137 = r423;
        int r426 = r138;
        int r427 = (int) r2.getLong(r426);     // Catch: Throwable -> L115
        int r428 = r139;
        long r1310 = r2.getLong(r428);     // Catch: Throwable -> L115
        int r429 = r140;
        int r430 = (int) r2.getLong(r429);     // Catch: Throwable -> L115
        int r431 = r141;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r142;
        long r1611 = r2.getLong(r433);     // Catch: Throwable -> L115
        int r434 = r143;
        int r435 = (int) r2.getLong(r434);     // Catch: Throwable -> L115
        int r436 = r144;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r145;
        String r1410 = null;
        long r1411 = r2.getLong(r438);     // Catch: Throwable -> L115
        int r439 = r146;
        int r440 = (int) r2.getLong(r439);     // Catch: Throwable -> L115
        int r441 = r147;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r148;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r149;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r150;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r151;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r152;
        float r452 = (float) r2.getDouble(r451);     // Catch: Throwable -> L115
        int r453 = r153;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r154;
        int r456 = (int) r2.getLong(r455);     // Catch: Throwable -> L115
        int r457 = r155;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r156;
        if (r2.isNull(r459) == false) goto L108;
        String r460 = null;
    L109:
        List<Integer> r461 = this.__workoutConverter.stringToStopWatchList(r460);     // Catch: Throwable -> L115
        int r462 = r157;
        int r463 = (int) r2.getLong(r462);     // Catch: Throwable -> L115
        int r464 = r158;
        if (r2.isNull(r464) == false) goto L112;
    L111:
        r158 = r464;
        r157 = r462;
        int r465 = r159;
        r1.add(new Workout(r162, r164, r166, r168, r163, r165, r167, r169, r170, r171, r172, r173, r174, r175, r177, r179, r181, r183, r185, r187, r189, r191, r193, r195, r197, r199, r201, r203, r205, r207, r1910, r1911, r1912, r1913, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228, r230, r232, r234, r2110, r2111, r240, r242, r244, r246, r248, r250, r252, r254, r2210, r258, r260, r2211, r264, r266, r2212, r270, r272, r2310, r276, r278, r2311, r282, r284, r2312, r288, r290, r292, r294, r296, r298, r300, r302, r304, r306, r308, r310, r312, r314, r316, r318, r320, r322, r324, r326, r330, r332, r335, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r411, r413, r415, r417, r420, r422, r425, r427, r1310, r430, r432, r1611, r435, r437, r1411, r440, r442, r444, r446, r448, r450, r452, r454, r456, r458, r461, r463, r1410, (int) r2.getLong(r465)));     // Catch: Throwable -> L115
        r159 = r465;
        r156 = r459;
        r3 = r3;
        r7 = r510;
        r51 = r241;
        r52 = r243;
        r53 = r245;
        r54 = r247;
        r55 = r249;
        r56 = r251;
        r57 = r253;
        r58 = r255;
        r59 = r257;
        r61 = r261;
        r62 = r263;
        r64 = r267;
        r65 = r269;
        r67 = r273;
        r68 = r275;
        r70 = r279;
        r71 = r281;
        r73 = r285;
        r74 = r287;
        r96 = r333;
        r99 = r343;
        r100 = r345;
        r101 = r347;
        r103 = r352;
        r104 = r354;
        r105 = r356;
        r106 = r358;
        r107 = r360;
        r108 = r362;
        r109 = r364;
        r110 = r366;
        r111 = r368;
        r112 = r370;
        r113 = r372;
        r114 = r374;
        r115 = r376;
        r116 = r378;
        r117 = r380;
        r118 = r382;
        r119 = r384;
        r120 = r386;
        r121 = r388;
        r122 = r390;
        r123 = r392;
        r124 = r394;
        r125 = r396;
        r128 = r404;
        r129 = r406;
        r130 = r408;
        r131 = r410;
        r132 = r412;
        r133 = r414;
        r138 = r426;
        r134 = r416;
        r142 = r433;
        r144 = r436;
        r145 = r438;
        r147 = r441;
        r148 = r443;
        r149 = r445;
        r150 = r447;
        r151 = r449;
        r152 = r451;
        r153 = r453;
        r154 = r455;
        r5 = r1610;
        r14 = r160;
        r4 = r4;
        r8 = r329;
        r139 = r428;
        r140 = r429;
        r141 = r431;
        r143 = r434;
        r146 = r439;
        r15 = r161;
        r155 = r457;
        r338 = r176;
        r16 = r178;
        r17 = r180;
        r18 = r182;
        r19 = r184;
        r20 = r186;
        r21 = r188;
        r22 = r190;
        r23 = r192;
        r24 = r194;
        r25 = r196;
        r26 = r198;
        r27 = r200;
        r28 = r202;
        r29 = r204;
        r30 = r206;
        r36 = r211;
        r37 = r213;
        r38 = r215;
        r39 = r217;
        r40 = r219;
        r41 = r221;
        r42 = r223;
        r43 = r225;
        r44 = r227;
        r45 = r229;
        r46 = r231;
        r47 = r233;
        r48 = r235;
        r6 = r328;
        r50 = r239;
        goto L4
    L112:
        r1410 = r2.getText(r464);     // Catch: Throwable -> L115
        goto L111
    L108:
        r460 = r2.getText(r459);     // Catch: Throwable -> L115
        goto L109
    L103:
        r424 = r2.getText(r423);     // Catch: Throwable -> L115
        goto L102
    L98:
        r419 = r2.getText(r418);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r339 = r2.getText(r336);     // Catch: Throwable -> L115
        goto L77
    L73:
        r334 = r2.getText(r333);     // Catch: Throwable -> L115
        goto L74
    L68:
        r286 = r2.getText(r285);     // Catch: Throwable -> L115
        goto L69
    L63:
        r280 = r2.getText(r279);     // Catch: Throwable -> L115
        goto L64
    L58:
        r274 = r2.getText(r273);     // Catch: Throwable -> L115
        goto L59
    L53:
        r268 = r2.getText(r267);     // Catch: Throwable -> L115
        goto L54
    L48:
        r262 = r2.getText(r261);     // Catch: Throwable -> L115
        goto L49
    L43:
        r256 = r2.getText(r255);     // Catch: Throwable -> L115
        goto L44
    L38:
        r238 = r2.getText(r237);     // Catch: Throwable -> L115
        goto L37
    L33:
        r236 = r2.getText(r235);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r34);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r209);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r208);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r31);     // Catch: Throwable -> L115
        goto L13
    L9:
        r168 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListByMode$10(int r335, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mMode = ? AND mIsDelete != 1 AND mSource = ?");
        r2.mo3338bindLong(1, r335);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r158 = r14;
        int r159 = r15;
        int r160 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r162 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r164 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r166 = null;
    L10:
        int r161 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r163 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r326 = r6;
        int r1510 = r5;
        int r172 = (int) r2.getLong(r158);     // Catch: Throwable -> L115
        int r173 = (int) r2.getLong(r159);     // Catch: Throwable -> L115
        int r174 = r338;
        int r175 = (int) r2.getLong(r174);     // Catch: Throwable -> L115
        int r176 = r339;
        int r177 = (int) r2.getLong(r176);     // Catch: Throwable -> L115
        int r178 = r3310;
        int r179 = (int) r2.getLong(r178);     // Catch: Throwable -> L115
        int r180 = r16;
        int r181 = (int) r2.getLong(r180);     // Catch: Throwable -> L115
        int r182 = r17;
        int r183 = (int) r2.getLong(r182);     // Catch: Throwable -> L115
        int r184 = r18;
        int r185 = (int) r2.getLong(r184);     // Catch: Throwable -> L115
        int r186 = r19;
        int r187 = (int) r2.getLong(r186);     // Catch: Throwable -> L115
        int r188 = r20;
        int r189 = (int) r2.getLong(r188);     // Catch: Throwable -> L115
        int r190 = r21;
        int r191 = (int) r2.getLong(r190);     // Catch: Throwable -> L115
        int r192 = r22;
        int r193 = (int) r2.getLong(r192);     // Catch: Throwable -> L115
        int r194 = r23;
        int r195 = (int) r2.getLong(r194);     // Catch: Throwable -> L115
        int r196 = r24;
        int r197 = (int) r2.getLong(r196);     // Catch: Throwable -> L115
        int r198 = r25;
        int r199 = (int) r2.getLong(r198);     // Catch: Throwable -> L115
        int r200 = r26;
        int r201 = (int) r2.getLong(r200);     // Catch: Throwable -> L115
        int r202 = r27;
        int r203 = (int) r2.getLong(r202);     // Catch: Throwable -> L115
        int r204 = r28;
        int r205 = (int) r2.getLong(r204);     // Catch: Throwable -> L115
        r29 = r29;
        if (r2.isNull(r29) == false) goto L14;
        String r1910 = null;
    L13:
        int r206 = r30;
        if (r2.isNull(r206) == false) goto L19;
        String r1911 = null;
    L18:
        r30 = r206;
        int r207 = r31;
        if (r2.isNull(r207) == false) goto L24;
        String r1912 = null;
    L23:
        r31 = r207;
        r32 = r32;
        if (r2.isNull(r32) == false) goto L28;
        String r1913 = null;
    L29:
        int r208 = (int) r2.getLong(r33);     // Catch: Throwable -> L115
        r33 = r33;
        int r209 = r34;
        int r210 = (int) r2.getLong(r209);     // Catch: Throwable -> L115
        int r211 = r35;
        int r212 = (int) r2.getLong(r211);     // Catch: Throwable -> L115
        int r213 = r36;
        int r214 = (int) r2.getLong(r213);     // Catch: Throwable -> L115
        int r215 = r37;
        int r216 = (int) r2.getLong(r215);     // Catch: Throwable -> L115
        int r217 = r38;
        int r218 = (int) r2.getLong(r217);     // Catch: Throwable -> L115
        int r219 = r39;
        float r220 = (float) r2.getDouble(r219);     // Catch: Throwable -> L115
        int r221 = r40;
        float r222 = (float) r2.getDouble(r221);     // Catch: Throwable -> L115
        int r223 = r41;
        int r224 = (int) r2.getLong(r223);     // Catch: Throwable -> L115
        int r225 = r42;
        float r226 = (float) r2.getDouble(r225);     // Catch: Throwable -> L115
        int r227 = r43;
        int r228 = (int) r2.getLong(r227);     // Catch: Throwable -> L115
        int r229 = r44;
        int r230 = (int) r2.getLong(r229);     // Catch: Throwable -> L115
        int r231 = r45;
        int r232 = (int) r2.getLong(r231);     // Catch: Throwable -> L115
        int r233 = r46;
        if (r2.isNull(r233) == false) goto L33;
        String r234 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r234);     // Catch: Throwable -> L115
        int r235 = r47;
        if (r2.isNull(r235) == false) goto L38;
        String r236 = null;
    L37:
        r47 = r235;
        int[] r2111 = this.__workoutConverter.toIntArray(r236);     // Catch: Throwable -> L115
        int r237 = r48;
        int r238 = (int) r2.getLong(r237);     // Catch: Throwable -> L115
        int r327 = r8;
        int r239 = r49;
        int r410 = r7;
        int r240 = (int) r2.getLong(r239);     // Catch: Throwable -> L115
        int r241 = r50;
        int r242 = (int) r2.getLong(r241);     // Catch: Throwable -> L115
        int r243 = r51;
        int r244 = (int) r2.getLong(r243);     // Catch: Throwable -> L115
        int r245 = r52;
        int r246 = (int) r2.getLong(r245);     // Catch: Throwable -> L115
        int r247 = r53;
        int r248 = (int) r2.getLong(r247);     // Catch: Throwable -> L115
        int r249 = r54;
        int r250 = (int) r2.getLong(r249);     // Catch: Throwable -> L115
        int r251 = r55;
        int r252 = (int) r2.getLong(r251);     // Catch: Throwable -> L115
        int r253 = r56;
        if (r2.isNull(r253) == false) goto L43;
        String r254 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r254);     // Catch: Throwable -> L115
        int r255 = r57;
        int r256 = (int) r2.getLong(r255);     // Catch: Throwable -> L115
        int r257 = r58;
        int r258 = (int) r2.getLong(r257);     // Catch: Throwable -> L115
        int r259 = r59;
        if (r2.isNull(r259) == false) goto L48;
        String r260 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r260);     // Catch: Throwable -> L115
        r58 = r257;
        int r261 = r60;
        int r262 = (int) r2.getLong(r261);     // Catch: Throwable -> L115
        int r263 = r61;
        int r264 = (int) r2.getLong(r263);     // Catch: Throwable -> L115
        int r265 = r62;
        if (r2.isNull(r265) == false) goto L53;
        String r266 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r266);     // Catch: Throwable -> L115
        r61 = r263;
        int r267 = r63;
        int r268 = (int) r2.getLong(r267);     // Catch: Throwable -> L115
        int r269 = r64;
        int r270 = (int) r2.getLong(r269);     // Catch: Throwable -> L115
        int r271 = r65;
        if (r2.isNull(r271) == false) goto L58;
        String r272 = null;
    L59:
        List<Integer> r2213 = this.__workoutConverter.stringToStopWatchList(r272);     // Catch: Throwable -> L115
        r64 = r269;
        int r273 = r66;
        int r274 = (int) r2.getLong(r273);     // Catch: Throwable -> L115
        int r275 = r67;
        int r276 = (int) r2.getLong(r275);     // Catch: Throwable -> L115
        int r277 = r68;
        if (r2.isNull(r277) == false) goto L63;
        String r278 = null;
    L64:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r278);     // Catch: Throwable -> L115
        r67 = r275;
        int r279 = r69;
        int r280 = (int) r2.getLong(r279);     // Catch: Throwable -> L115
        int r281 = r70;
        int r282 = (int) r2.getLong(r281);     // Catch: Throwable -> L115
        int r283 = r71;
        if (r2.isNull(r283) == false) goto L68;
        String r284 = null;
    L69:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r284);     // Catch: Throwable -> L115
        r70 = r281;
        int r285 = r72;
        int r286 = (int) r2.getLong(r285);     // Catch: Throwable -> L115
        int r287 = r73;
        int r288 = (int) r2.getLong(r287);     // Catch: Throwable -> L115
        r73 = r287;
        int r289 = r74;
        int r290 = (int) r2.getLong(r289);     // Catch: Throwable -> L115
        r74 = r289;
        int r291 = r75;
        int r292 = (int) r2.getLong(r291);     // Catch: Throwable -> L115
        r75 = r291;
        int r293 = r76;
        int r294 = (int) r2.getLong(r293);     // Catch: Throwable -> L115
        r76 = r293;
        int r295 = r77;
        int r296 = (int) r2.getLong(r295);     // Catch: Throwable -> L115
        r77 = r295;
        int r297 = r78;
        int r298 = (int) r2.getLong(r297);     // Catch: Throwable -> L115
        r78 = r297;
        int r299 = r79;
        int r300 = (int) r2.getLong(r299);     // Catch: Throwable -> L115
        r79 = r299;
        int r301 = r80;
        int r302 = (int) r2.getLong(r301);     // Catch: Throwable -> L115
        r80 = r301;
        int r303 = r81;
        int r304 = (int) r2.getLong(r303);     // Catch: Throwable -> L115
        r81 = r303;
        int r305 = r82;
        int r306 = (int) r2.getLong(r305);     // Catch: Throwable -> L115
        r82 = r305;
        int r307 = r83;
        int r308 = (int) r2.getLong(r307);     // Catch: Throwable -> L115
        r83 = r307;
        int r309 = r84;
        int r310 = (int) r2.getLong(r309);     // Catch: Throwable -> L115
        r84 = r309;
        int r311 = r85;
        int r312 = (int) r2.getLong(r311);     // Catch: Throwable -> L115
        r85 = r311;
        int r313 = r86;
        int r314 = (int) r2.getLong(r313);     // Catch: Throwable -> L115
        r86 = r313;
        int r315 = r87;
        int r316 = (int) r2.getLong(r315);     // Catch: Throwable -> L115
        r87 = r315;
        int r317 = r88;
        int r318 = (int) r2.getLong(r317);     // Catch: Throwable -> L115
        r88 = r317;
        int r319 = r89;
        int r320 = (int) r2.getLong(r319);     // Catch: Throwable -> L115
        r89 = r319;
        int r321 = r90;
        float r322 = (float) r2.getDouble(r321);     // Catch: Throwable -> L115
        r90 = r321;
        int r323 = r91;
        int r324 = (int) r2.getLong(r323);     // Catch: Throwable -> L115
        r91 = r323;
        int r325 = r92;
        int r328 = (int) r2.getLong(r325);     // Catch: Throwable -> L115
        r92 = r325;
        int r329 = r93;
        float r330 = (float) r2.getDouble(r329);     // Catch: Throwable -> L115
        int r331 = r94;
        if (r2.isNull(r331) == false) goto L73;
        String r332 = null;
    L74:
        int[] r333 = this.__workoutConverter.toIntArray(r332);     // Catch: Throwable -> L115
        int r334 = r95;
        if (r2.isNull(r334) == false) goto L78;
        String r340 = null;
    L77:
        r95 = r334;
        float[] r341 = this.__workoutConverter.toFloatArray(r340);     // Catch: Throwable -> L115
        r93 = r329;
        int r342 = r96;
        int r343 = (int) r2.getLong(r342);     // Catch: Throwable -> L115
        r96 = r342;
        int r344 = r97;
        int r345 = (int) r2.getLong(r344);     // Catch: Throwable -> L115
        int r346 = r98;
        int r347 = (int) r2.getLong(r346);     // Catch: Throwable -> L115
        int r348 = r99;
        if (r2.isNull(r348) == false) goto L83;
        String r349 = null;
    L84:
        List<Integer> r350 = this.__workoutConverter.stringToStopWatchList(r349);     // Catch: Throwable -> L115
        int r351 = r100;
        float r352 = (float) r2.getDouble(r351);     // Catch: Throwable -> L115
        r100 = r351;
        int r353 = r101;
        float r354 = (float) r2.getDouble(r353);     // Catch: Throwable -> L115
        int r355 = r102;
        float r356 = (float) r2.getDouble(r355);     // Catch: Throwable -> L115
        int r357 = r103;
        float r358 = (float) r2.getDouble(r357);     // Catch: Throwable -> L115
        int r359 = r104;
        int r360 = (int) r2.getLong(r359);     // Catch: Throwable -> L115
        int r361 = r105;
        int r362 = (int) r2.getLong(r361);     // Catch: Throwable -> L115
        int r363 = r106;
        int r364 = (int) r2.getLong(r363);     // Catch: Throwable -> L115
        int r365 = r107;
        int r366 = (int) r2.getLong(r365);     // Catch: Throwable -> L115
        int r367 = r108;
        int r368 = (int) r2.getLong(r367);     // Catch: Throwable -> L115
        int r369 = r109;
        int r370 = (int) r2.getLong(r369);     // Catch: Throwable -> L115
        int r371 = r110;
        int r372 = (int) r2.getLong(r371);     // Catch: Throwable -> L115
        int r373 = r111;
        int r374 = (int) r2.getLong(r373);     // Catch: Throwable -> L115
        int r375 = r112;
        int r376 = (int) r2.getLong(r375);     // Catch: Throwable -> L115
        int r377 = r113;
        int r378 = (int) r2.getLong(r377);     // Catch: Throwable -> L115
        int r379 = r114;
        int r380 = (int) r2.getLong(r379);     // Catch: Throwable -> L115
        int r381 = r115;
        int r382 = (int) r2.getLong(r381);     // Catch: Throwable -> L115
        int r383 = r116;
        float r384 = (float) r2.getDouble(r383);     // Catch: Throwable -> L115
        int r385 = r117;
        float r386 = (float) r2.getDouble(r385);     // Catch: Throwable -> L115
        int r387 = r118;
        int r388 = (int) r2.getLong(r387);     // Catch: Throwable -> L115
        int r389 = r119;
        int r390 = (int) r2.getLong(r389);     // Catch: Throwable -> L115
        int r391 = r120;
        int r392 = (int) r2.getLong(r391);     // Catch: Throwable -> L115
        int r393 = r121;
        int r394 = (int) r2.getLong(r393);     // Catch: Throwable -> L115
        int r395 = r122;
        float r396 = (float) r2.getDouble(r395);     // Catch: Throwable -> L115
        int r397 = r123;
        if (r2.isNull(r397) == false) goto L88;
        String r398 = null;
    L89:
        float[] r399 = this.__workoutConverter.toFloatArray(r398);     // Catch: Throwable -> L115
        int r400 = r124;
        if (r2.isNull(r400) == false) goto L93;
        String r401 = null;
    L92:
        r124 = r400;
        float[] r402 = this.__workoutConverter.toFloatArray(r401);     // Catch: Throwable -> L115
        int r403 = r125;
        int r404 = (int) r2.getLong(r403);     // Catch: Throwable -> L115
        r125 = r403;
        int r405 = r126;
        int r406 = (int) r2.getLong(r405);     // Catch: Throwable -> L115
        int r407 = r127;
        int r408 = (int) r2.getLong(r407);     // Catch: Throwable -> L115
        int r409 = r128;
        int r411 = (int) r2.getLong(r409);     // Catch: Throwable -> L115
        int r412 = r129;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r130;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r131;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r132;
        int r419 = (int) r2.getLong(r418);     // Catch: Throwable -> L115
        int r420 = r133;
        if (r2.isNull(r420) == false) goto L98;
        String r421 = null;
    L99:
        List<Integer> r422 = this.__workoutConverter.stringToStopWatchList(r421);     // Catch: Throwable -> L115
        r133 = r420;
        int r423 = r134;
        int r424 = (int) r2.getLong(r423);     // Catch: Throwable -> L115
        int r425 = r135;
        if (r2.isNull(r425) == false) goto L103;
        String r426 = null;
    L102:
        r134 = r423;
        List<Float> r427 = this.__workoutConverter.stringToFloatWatch(r426);     // Catch: Throwable -> L115
        r135 = r425;
        int r428 = r136;
        int r429 = (int) r2.getLong(r428);     // Catch: Throwable -> L115
        int r430 = r137;
        long r1310 = r2.getLong(r430);     // Catch: Throwable -> L115
        int r431 = r138;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r139;
        int r434 = (int) r2.getLong(r433);     // Catch: Throwable -> L115
        int r435 = r140;
        long r1610 = r2.getLong(r435);     // Catch: Throwable -> L115
        int r436 = r141;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r142;
        int r439 = (int) r2.getLong(r438);     // Catch: Throwable -> L115
        int r440 = r143;
        String r1410 = null;
        long r1411 = r2.getLong(r440);     // Catch: Throwable -> L115
        int r441 = r144;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r145;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r146;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r147;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r148;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r149;
        int r452 = (int) r2.getLong(r451);     // Catch: Throwable -> L115
        int r453 = r150;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r151;
        float r456 = (float) r2.getDouble(r455);     // Catch: Throwable -> L115
        int r457 = r152;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r153;
        int r460 = (int) r2.getLong(r459);     // Catch: Throwable -> L115
        int r461 = r154;
        if (r2.isNull(r461) == false) goto L108;
        String r462 = null;
    L109:
        List<Integer> r463 = this.__workoutConverter.stringToStopWatchList(r462);     // Catch: Throwable -> L115
        int r464 = r155;
        int r465 = (int) r2.getLong(r464);     // Catch: Throwable -> L115
        int r466 = r156;
        if (r2.isNull(r466) == false) goto L112;
    L111:
        r156 = r466;
        r155 = r464;
        int r467 = r157;
        r1.add(new Workout(r160, r162, r164, r166, r161, r163, r165, r167, r168, r169, r170, r171, r172, r173, r175, r177, r179, r181, r183, r185, r187, r189, r191, r193, r195, r197, r199, r201, r203, r205, r1910, r1911, r1912, r1913, r208, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228, r230, r232, r2110, r2111, r238, r240, r242, r244, r246, r248, r250, r252, r2210, r256, r258, r2211, r262, r264, r2212, r268, r270, r2213, r274, r276, r2310, r280, r282, r2311, r286, r288, r290, r292, r294, r296, r298, r300, r302, r304, r306, r308, r310, r312, r314, r316, r318, r320, r322, r324, r328, r330, r333, r341, r343, r345, r347, r350, r352, r354, r356, r358, r360, r362, r364, r366, r368, r370, r372, r374, r376, r378, r380, r382, r384, r386, r388, r390, r392, r394, r396, r399, r402, r404, r406, r408, r411, r413, r415, r417, r419, r422, r424, r427, r429, r1310, r432, r434, r1610, r437, r439, r1411, r442, r444, r446, r448, r450, r452, r454, r456, r458, r460, r463, r465, r1410, (int) r2.getLong(r467)));     // Catch: Throwable -> L115
        r157 = r467;
        r154 = r461;
        r3 = r3;
        r7 = r410;
        r49 = r239;
        r50 = r241;
        r51 = r243;
        r52 = r245;
        r53 = r247;
        r54 = r249;
        r55 = r251;
        r56 = r253;
        r57 = r255;
        r59 = r259;
        r60 = r261;
        r62 = r265;
        r63 = r267;
        r65 = r271;
        r66 = r273;
        r68 = r277;
        r69 = r279;
        r71 = r283;
        r72 = r285;
        r94 = r331;
        r97 = r344;
        r98 = r346;
        r99 = r348;
        r101 = r353;
        r102 = r355;
        r103 = r357;
        r104 = r359;
        r105 = r361;
        r106 = r363;
        r107 = r365;
        r108 = r367;
        r109 = r369;
        r110 = r371;
        r111 = r373;
        r112 = r375;
        r113 = r377;
        r114 = r379;
        r115 = r381;
        r116 = r383;
        r117 = r385;
        r118 = r387;
        r119 = r389;
        r120 = r391;
        r121 = r393;
        r122 = r395;
        r123 = r397;
        r126 = r405;
        r127 = r407;
        r128 = r409;
        r129 = r412;
        r130 = r414;
        r131 = r416;
        r136 = r428;
        r132 = r418;
        r140 = r435;
        r142 = r438;
        r143 = r440;
        r145 = r443;
        r146 = r445;
        r147 = r447;
        r148 = r449;
        r149 = r451;
        r150 = r453;
        r151 = r455;
        r152 = r457;
        r5 = r1510;
        r14 = r158;
        r4 = r4;
        r8 = r327;
        r137 = r430;
        r138 = r431;
        r139 = r433;
        r141 = r436;
        r144 = r441;
        r15 = r159;
        r338 = r174;
        r339 = r176;
        r153 = r459;
        r3310 = r178;
        r16 = r180;
        r17 = r182;
        r18 = r184;
        r19 = r186;
        r20 = r188;
        r21 = r190;
        r22 = r192;
        r23 = r194;
        r24 = r196;
        r25 = r198;
        r26 = r200;
        r27 = r202;
        r28 = r204;
        r34 = r209;
        r35 = r211;
        r36 = r213;
        r37 = r215;
        r38 = r217;
        r39 = r219;
        r40 = r221;
        r41 = r223;
        r42 = r225;
        r43 = r227;
        r44 = r229;
        r45 = r231;
        r46 = r233;
        r6 = r326;
        r48 = r237;
        goto L4
    L112:
        r1410 = r2.getText(r466);     // Catch: Throwable -> L115
        goto L111
    L108:
        r462 = r2.getText(r461);     // Catch: Throwable -> L115
        goto L109
    L103:
        r426 = r2.getText(r425);     // Catch: Throwable -> L115
        goto L102
    L98:
        r421 = r2.getText(r420);     // Catch: Throwable -> L115
        goto L99
    L93:
        r401 = r2.getText(r400);     // Catch: Throwable -> L115
        goto L92
    L88:
        r398 = r2.getText(r397);     // Catch: Throwable -> L115
        goto L89
    L83:
        r349 = r2.getText(r348);     // Catch: Throwable -> L115
        goto L84
    L78:
        r340 = r2.getText(r334);     // Catch: Throwable -> L115
        goto L77
    L73:
        r332 = r2.getText(r331);     // Catch: Throwable -> L115
        goto L74
    L68:
        r284 = r2.getText(r283);     // Catch: Throwable -> L115
        goto L69
    L63:
        r278 = r2.getText(r277);     // Catch: Throwable -> L115
        goto L64
    L58:
        r272 = r2.getText(r271);     // Catch: Throwable -> L115
        goto L59
    L53:
        r266 = r2.getText(r265);     // Catch: Throwable -> L115
        goto L54
    L48:
        r260 = r2.getText(r259);     // Catch: Throwable -> L115
        goto L49
    L43:
        r254 = r2.getText(r253);     // Catch: Throwable -> L115
        goto L44
    L38:
        r236 = r2.getText(r235);     // Catch: Throwable -> L115
        goto L37
    L33:
        r234 = r2.getText(r233);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r32);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r207);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r206);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r29);     // Catch: Throwable -> L115
        goto L13
    L9:
        r166 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListByMode$9(int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mMode = ? AND mIsDelete != 1  AND mDuration > 0 ORDER BY mStart DESC");
        r2.mo3338bindLong(1, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r159 = r14;
        int r160 = r15;
        int r161 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r163 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r165 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r167 = null;
    L10:
        int r162 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r327 = r6;
        int r1510 = r5;
        int r173 = (int) r2.getLong(r159);     // Catch: Throwable -> L115
        int r174 = (int) r2.getLong(r160);     // Catch: Throwable -> L115
        int r175 = r338;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r339;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r16;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r17;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r18;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r19;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r20;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r21;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r22;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r23;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r24;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r25;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r26;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r27;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        int r203 = r28;
        int r204 = (int) r2.getLong(r203);     // Catch: Throwable -> L115
        int r205 = r29;
        int r206 = (int) r2.getLong(r205);     // Catch: Throwable -> L115
        r30 = r30;
        if (r2.isNull(r30) == false) goto L14;
        String r1910 = null;
    L13:
        int r207 = r31;
        if (r2.isNull(r207) == false) goto L19;
        String r1911 = null;
    L18:
        r31 = r207;
        int r208 = r32;
        if (r2.isNull(r208) == false) goto L24;
        String r1912 = null;
    L23:
        r32 = r208;
        r33 = r33;
        if (r2.isNull(r33) == false) goto L28;
        String r1913 = null;
    L29:
        int r209 = (int) r2.getLong(r34);     // Catch: Throwable -> L115
        r34 = r34;
        int r210 = r35;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r36;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r37;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r38;
        int r217 = (int) r2.getLong(r216);     // Catch: Throwable -> L115
        int r218 = r39;
        int r219 = (int) r2.getLong(r218);     // Catch: Throwable -> L115
        int r220 = r40;
        float r221 = (float) r2.getDouble(r220);     // Catch: Throwable -> L115
        int r222 = r41;
        float r223 = (float) r2.getDouble(r222);     // Catch: Throwable -> L115
        int r224 = r42;
        int r225 = (int) r2.getLong(r224);     // Catch: Throwable -> L115
        int r226 = r43;
        float r227 = (float) r2.getDouble(r226);     // Catch: Throwable -> L115
        int r228 = r44;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r45;
        int r231 = (int) r2.getLong(r230);     // Catch: Throwable -> L115
        int r232 = r46;
        int r233 = (int) r2.getLong(r232);     // Catch: Throwable -> L115
        int r234 = r47;
        if (r2.isNull(r234) == false) goto L33;
        String r235 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r235);     // Catch: Throwable -> L115
        int r236 = r48;
        if (r2.isNull(r236) == false) goto L38;
        String r237 = null;
    L37:
        r48 = r236;
        int[] r2111 = this.__workoutConverter.toIntArray(r237);     // Catch: Throwable -> L115
        int r238 = r49;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r328 = r8;
        int r240 = r50;
        int r510 = r7;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r51;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r52;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r53;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r54;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r55;
        int r251 = (int) r2.getLong(r250);     // Catch: Throwable -> L115
        int r252 = r56;
        int r253 = (int) r2.getLong(r252);     // Catch: Throwable -> L115
        int r254 = r57;
        if (r2.isNull(r254) == false) goto L43;
        String r255 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r255);     // Catch: Throwable -> L115
        int r256 = r58;
        int r257 = (int) r2.getLong(r256);     // Catch: Throwable -> L115
        int r258 = r59;
        int r259 = (int) r2.getLong(r258);     // Catch: Throwable -> L115
        int r260 = r60;
        if (r2.isNull(r260) == false) goto L48;
        String r261 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r261);     // Catch: Throwable -> L115
        r59 = r258;
        int r262 = r61;
        int r263 = (int) r2.getLong(r262);     // Catch: Throwable -> L115
        int r264 = r62;
        int r265 = (int) r2.getLong(r264);     // Catch: Throwable -> L115
        int r266 = r63;
        if (r2.isNull(r266) == false) goto L53;
        String r267 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r267);     // Catch: Throwable -> L115
        r62 = r264;
        int r268 = r64;
        int r269 = (int) r2.getLong(r268);     // Catch: Throwable -> L115
        int r270 = r65;
        int r271 = (int) r2.getLong(r270);     // Catch: Throwable -> L115
        int r272 = r66;
        if (r2.isNull(r272) == false) goto L58;
        String r273 = null;
    L59:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r273);     // Catch: Throwable -> L115
        r65 = r270;
        int r274 = r67;
        int r275 = (int) r2.getLong(r274);     // Catch: Throwable -> L115
        int r276 = r68;
        int r277 = (int) r2.getLong(r276);     // Catch: Throwable -> L115
        int r278 = r69;
        if (r2.isNull(r278) == false) goto L63;
        String r279 = null;
    L64:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r279);     // Catch: Throwable -> L115
        r68 = r276;
        int r280 = r70;
        int r281 = (int) r2.getLong(r280);     // Catch: Throwable -> L115
        int r282 = r71;
        int r283 = (int) r2.getLong(r282);     // Catch: Throwable -> L115
        int r284 = r72;
        if (r2.isNull(r284) == false) goto L68;
        String r285 = null;
    L69:
        List<Integer> r2312 = this.__workoutConverter.stringToStopWatchList(r285);     // Catch: Throwable -> L115
        r71 = r282;
        int r286 = r73;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        int r288 = r74;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r74 = r288;
        int r290 = r75;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r75 = r290;
        int r292 = r76;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r76 = r292;
        int r294 = r77;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r77 = r294;
        int r296 = r78;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r78 = r296;
        int r298 = r79;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r79 = r298;
        int r300 = r80;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r80 = r300;
        int r302 = r81;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r81 = r302;
        int r304 = r82;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r82 = r304;
        int r306 = r83;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r83 = r306;
        int r308 = r84;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r84 = r308;
        int r310 = r85;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r85 = r310;
        int r312 = r86;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r86 = r312;
        int r314 = r87;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r87 = r314;
        int r316 = r88;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r88 = r316;
        int r318 = r89;
        int r319 = (int) r2.getLong(r318);     // Catch: Throwable -> L115
        r89 = r318;
        int r320 = r90;
        int r321 = (int) r2.getLong(r320);     // Catch: Throwable -> L115
        r90 = r320;
        int r322 = r91;
        float r323 = (float) r2.getDouble(r322);     // Catch: Throwable -> L115
        r91 = r322;
        int r324 = r92;
        int r325 = (int) r2.getLong(r324);     // Catch: Throwable -> L115
        r92 = r324;
        int r326 = r93;
        int r329 = (int) r2.getLong(r326);     // Catch: Throwable -> L115
        r93 = r326;
        int r330 = r94;
        float r331 = (float) r2.getDouble(r330);     // Catch: Throwable -> L115
        int r332 = r95;
        if (r2.isNull(r332) == false) goto L73;
        String r333 = null;
    L74:
        int[] r334 = this.__workoutConverter.toIntArray(r333);     // Catch: Throwable -> L115
        int r335 = r96;
        if (r2.isNull(r335) == false) goto L78;
        String r340 = null;
    L77:
        r96 = r335;
        float[] r341 = this.__workoutConverter.toFloatArray(r340);     // Catch: Throwable -> L115
        r94 = r330;
        int r342 = r97;
        int r343 = (int) r2.getLong(r342);     // Catch: Throwable -> L115
        r97 = r342;
        int r344 = r98;
        int r345 = (int) r2.getLong(r344);     // Catch: Throwable -> L115
        int r346 = r99;
        int r347 = (int) r2.getLong(r346);     // Catch: Throwable -> L115
        int r348 = r100;
        if (r2.isNull(r348) == false) goto L83;
        String r349 = null;
    L84:
        List<Integer> r350 = this.__workoutConverter.stringToStopWatchList(r349);     // Catch: Throwable -> L115
        int r351 = r101;
        float r352 = (float) r2.getDouble(r351);     // Catch: Throwable -> L115
        r101 = r351;
        int r353 = r102;
        float r354 = (float) r2.getDouble(r353);     // Catch: Throwable -> L115
        int r355 = r103;
        float r356 = (float) r2.getDouble(r355);     // Catch: Throwable -> L115
        int r357 = r104;
        float r358 = (float) r2.getDouble(r357);     // Catch: Throwable -> L115
        int r359 = r105;
        int r360 = (int) r2.getLong(r359);     // Catch: Throwable -> L115
        int r361 = r106;
        int r362 = (int) r2.getLong(r361);     // Catch: Throwable -> L115
        int r363 = r107;
        int r364 = (int) r2.getLong(r363);     // Catch: Throwable -> L115
        int r365 = r108;
        int r366 = (int) r2.getLong(r365);     // Catch: Throwable -> L115
        int r367 = r109;
        int r368 = (int) r2.getLong(r367);     // Catch: Throwable -> L115
        int r369 = r110;
        int r370 = (int) r2.getLong(r369);     // Catch: Throwable -> L115
        int r371 = r111;
        int r372 = (int) r2.getLong(r371);     // Catch: Throwable -> L115
        int r373 = r112;
        int r374 = (int) r2.getLong(r373);     // Catch: Throwable -> L115
        int r375 = r113;
        int r376 = (int) r2.getLong(r375);     // Catch: Throwable -> L115
        int r377 = r114;
        int r378 = (int) r2.getLong(r377);     // Catch: Throwable -> L115
        int r379 = r115;
        int r380 = (int) r2.getLong(r379);     // Catch: Throwable -> L115
        int r381 = r116;
        int r382 = (int) r2.getLong(r381);     // Catch: Throwable -> L115
        int r383 = r117;
        float r384 = (float) r2.getDouble(r383);     // Catch: Throwable -> L115
        int r385 = r118;
        float r386 = (float) r2.getDouble(r385);     // Catch: Throwable -> L115
        int r387 = r119;
        int r388 = (int) r2.getLong(r387);     // Catch: Throwable -> L115
        int r389 = r120;
        int r390 = (int) r2.getLong(r389);     // Catch: Throwable -> L115
        int r391 = r121;
        int r392 = (int) r2.getLong(r391);     // Catch: Throwable -> L115
        int r393 = r122;
        int r394 = (int) r2.getLong(r393);     // Catch: Throwable -> L115
        int r395 = r123;
        float r396 = (float) r2.getDouble(r395);     // Catch: Throwable -> L115
        int r397 = r124;
        if (r2.isNull(r397) == false) goto L88;
        String r398 = null;
    L89:
        float[] r399 = this.__workoutConverter.toFloatArray(r398);     // Catch: Throwable -> L115
        int r400 = r125;
        if (r2.isNull(r400) == false) goto L93;
        String r401 = null;
    L92:
        r125 = r400;
        float[] r402 = this.__workoutConverter.toFloatArray(r401);     // Catch: Throwable -> L115
        int r403 = r126;
        int r404 = (int) r2.getLong(r403);     // Catch: Throwable -> L115
        r126 = r403;
        int r405 = r127;
        int r406 = (int) r2.getLong(r405);     // Catch: Throwable -> L115
        int r407 = r128;
        int r408 = (int) r2.getLong(r407);     // Catch: Throwable -> L115
        int r409 = r129;
        int r410 = (int) r2.getLong(r409);     // Catch: Throwable -> L115
        int r411 = r130;
        int r412 = (int) r2.getLong(r411);     // Catch: Throwable -> L115
        int r413 = r131;
        int r414 = (int) r2.getLong(r413);     // Catch: Throwable -> L115
        int r415 = r132;
        int r416 = (int) r2.getLong(r415);     // Catch: Throwable -> L115
        int r417 = r133;
        int r418 = (int) r2.getLong(r417);     // Catch: Throwable -> L115
        int r419 = r134;
        if (r2.isNull(r419) == false) goto L98;
        String r420 = null;
    L99:
        List<Integer> r421 = this.__workoutConverter.stringToStopWatchList(r420);     // Catch: Throwable -> L115
        r134 = r419;
        int r422 = r135;
        int r423 = (int) r2.getLong(r422);     // Catch: Throwable -> L115
        int r424 = r136;
        if (r2.isNull(r424) == false) goto L103;
        String r425 = null;
    L102:
        r135 = r422;
        List<Float> r426 = this.__workoutConverter.stringToFloatWatch(r425);     // Catch: Throwable -> L115
        r136 = r424;
        int r427 = r137;
        int r428 = (int) r2.getLong(r427);     // Catch: Throwable -> L115
        int r429 = r138;
        long r1310 = r2.getLong(r429);     // Catch: Throwable -> L115
        int r430 = r139;
        int r431 = (int) r2.getLong(r430);     // Catch: Throwable -> L115
        int r432 = r140;
        int r433 = (int) r2.getLong(r432);     // Catch: Throwable -> L115
        int r434 = r141;
        long r1610 = r2.getLong(r434);     // Catch: Throwable -> L115
        int r435 = r142;
        int r436 = (int) r2.getLong(r435);     // Catch: Throwable -> L115
        int r437 = r143;
        int r438 = (int) r2.getLong(r437);     // Catch: Throwable -> L115
        int r439 = r144;
        String r1410 = null;
        long r1411 = r2.getLong(r439);     // Catch: Throwable -> L115
        int r440 = r145;
        int r441 = (int) r2.getLong(r440);     // Catch: Throwable -> L115
        int r442 = r146;
        int r443 = (int) r2.getLong(r442);     // Catch: Throwable -> L115
        int r444 = r147;
        int r445 = (int) r2.getLong(r444);     // Catch: Throwable -> L115
        int r446 = r148;
        int r447 = (int) r2.getLong(r446);     // Catch: Throwable -> L115
        int r448 = r149;
        int r449 = (int) r2.getLong(r448);     // Catch: Throwable -> L115
        int r450 = r150;
        int r451 = (int) r2.getLong(r450);     // Catch: Throwable -> L115
        int r452 = r151;
        float r453 = (float) r2.getDouble(r452);     // Catch: Throwable -> L115
        int r454 = r152;
        float r455 = (float) r2.getDouble(r454);     // Catch: Throwable -> L115
        int r456 = r153;
        int r457 = (int) r2.getLong(r456);     // Catch: Throwable -> L115
        int r458 = r154;
        int r459 = (int) r2.getLong(r458);     // Catch: Throwable -> L115
        int r460 = r155;
        if (r2.isNull(r460) == false) goto L108;
        String r461 = null;
    L109:
        List<Integer> r462 = this.__workoutConverter.stringToStopWatchList(r461);     // Catch: Throwable -> L115
        int r463 = r156;
        int r464 = (int) r2.getLong(r463);     // Catch: Throwable -> L115
        int r465 = r157;
        if (r2.isNull(r465) == false) goto L112;
    L111:
        r157 = r465;
        r156 = r463;
        int r466 = r158;
        r1.add(new Workout(r161, r163, r165, r167, r162, r164, r166, r168, r169, r170, r171, r172, r173, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r1910, r1911, r1912, r1913, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r231, r233, r2110, r2111, r239, r241, r243, r245, r247, r249, r251, r253, r2210, r257, r259, r2211, r263, r265, r2212, r269, r271, r2310, r275, r277, r2311, r281, r283, r2312, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r323, r325, r329, r331, r334, r341, r343, r345, r347, r350, r352, r354, r356, r358, r360, r362, r364, r366, r368, r370, r372, r374, r376, r378, r380, r382, r384, r386, r388, r390, r392, r394, r396, r399, r402, r404, r406, r408, r410, r412, r414, r416, r418, r421, r423, r426, r428, r1310, r431, r433, r1610, r436, r438, r1411, r441, r443, r445, r447, r449, r451, r453, r455, r457, r459, r462, r464, r1410, (int) r2.getLong(r466)));     // Catch: Throwable -> L115
        r158 = r466;
        r155 = r460;
        r3 = r3;
        r7 = r510;
        r50 = r240;
        r51 = r242;
        r52 = r244;
        r53 = r246;
        r54 = r248;
        r55 = r250;
        r56 = r252;
        r57 = r254;
        r58 = r256;
        r60 = r260;
        r61 = r262;
        r63 = r266;
        r64 = r268;
        r66 = r272;
        r67 = r274;
        r69 = r278;
        r70 = r280;
        r72 = r284;
        r73 = r286;
        r95 = r332;
        r98 = r344;
        r99 = r346;
        r100 = r348;
        r102 = r353;
        r103 = r355;
        r104 = r357;
        r105 = r359;
        r106 = r361;
        r107 = r363;
        r108 = r365;
        r109 = r367;
        r110 = r369;
        r111 = r371;
        r112 = r373;
        r113 = r375;
        r114 = r377;
        r115 = r379;
        r116 = r381;
        r117 = r383;
        r118 = r385;
        r119 = r387;
        r120 = r389;
        r121 = r391;
        r122 = r393;
        r123 = r395;
        r124 = r397;
        r127 = r405;
        r128 = r407;
        r129 = r409;
        r130 = r411;
        r131 = r413;
        r132 = r415;
        r137 = r427;
        r133 = r417;
        r141 = r434;
        r143 = r437;
        r144 = r439;
        r146 = r442;
        r147 = r444;
        r148 = r446;
        r149 = r448;
        r150 = r450;
        r151 = r452;
        r152 = r454;
        r153 = r456;
        r5 = r1510;
        r14 = r159;
        r4 = r4;
        r8 = r328;
        r138 = r429;
        r139 = r430;
        r140 = r432;
        r142 = r435;
        r145 = r440;
        r15 = r160;
        r338 = r175;
        r154 = r458;
        r339 = r177;
        r16 = r179;
        r17 = r181;
        r18 = r183;
        r19 = r185;
        r20 = r187;
        r21 = r189;
        r22 = r191;
        r23 = r193;
        r24 = r195;
        r25 = r197;
        r26 = r199;
        r27 = r201;
        r28 = r203;
        r29 = r205;
        r35 = r210;
        r36 = r212;
        r37 = r214;
        r38 = r216;
        r39 = r218;
        r40 = r220;
        r41 = r222;
        r42 = r224;
        r43 = r226;
        r44 = r228;
        r45 = r230;
        r46 = r232;
        r47 = r234;
        r6 = r327;
        r49 = r238;
        goto L4
    L112:
        r1410 = r2.getText(r465);     // Catch: Throwable -> L115
        goto L111
    L108:
        r461 = r2.getText(r460);     // Catch: Throwable -> L115
        goto L109
    L103:
        r425 = r2.getText(r424);     // Catch: Throwable -> L115
        goto L102
    L98:
        r420 = r2.getText(r419);     // Catch: Throwable -> L115
        goto L99
    L93:
        r401 = r2.getText(r400);     // Catch: Throwable -> L115
        goto L92
    L88:
        r398 = r2.getText(r397);     // Catch: Throwable -> L115
        goto L89
    L83:
        r349 = r2.getText(r348);     // Catch: Throwable -> L115
        goto L84
    L78:
        r340 = r2.getText(r335);     // Catch: Throwable -> L115
        goto L77
    L73:
        r333 = r2.getText(r332);     // Catch: Throwable -> L115
        goto L74
    L68:
        r285 = r2.getText(r284);     // Catch: Throwable -> L115
        goto L69
    L63:
        r279 = r2.getText(r278);     // Catch: Throwable -> L115
        goto L64
    L58:
        r273 = r2.getText(r272);     // Catch: Throwable -> L115
        goto L59
    L53:
        r267 = r2.getText(r266);     // Catch: Throwable -> L115
        goto L54
    L48:
        r261 = r2.getText(r260);     // Catch: Throwable -> L115
        goto L49
    L43:
        r255 = r2.getText(r254);     // Catch: Throwable -> L115
        goto L44
    L38:
        r237 = r2.getText(r236);     // Catch: Throwable -> L115
        goto L37
    L33:
        r235 = r2.getText(r234);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r33);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r208);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r207);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r30);     // Catch: Throwable -> L115
        goto L13
    L9:
        r167 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListDESC$6(int r334, int r335, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mStart > 0 AND mMode != 0 AND mMode != ? AND mIsDelete != 1 ORDER BY mStart DESC LIMIT ?, ?");
        r2.mo3338bindLong(1, r334);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r335);     // Catch: Throwable -> L115
        r2.mo3338bindLong(3, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r3311 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r157 = r14;
        int r158 = r15;
        int r159 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r161 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r163 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r165 = null;
    L10:
        int r160 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r162 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r325 = r6;
        int r1510 = r5;
        int r171 = (int) r2.getLong(r157);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r158);     // Catch: Throwable -> L115
        int r173 = r338;
        int r174 = (int) r2.getLong(r173);     // Catch: Throwable -> L115
        int r175 = r339;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r3310;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r3311;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r16;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r17;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r18;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r19;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r20;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r21;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r22;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r23;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r24;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r25;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r26;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        int r203 = r27;
        int r204 = (int) r2.getLong(r203);     // Catch: Throwable -> L115
        r28 = r28;
        if (r2.isNull(r28) == false) goto L14;
        String r1910 = null;
    L13:
        int r205 = r29;
        if (r2.isNull(r205) == false) goto L19;
        String r1911 = null;
    L18:
        r29 = r205;
        int r206 = r30;
        if (r2.isNull(r206) == false) goto L24;
        String r1912 = null;
    L23:
        r30 = r206;
        r31 = r31;
        if (r2.isNull(r31) == false) goto L28;
        String r1913 = null;
    L29:
        int r207 = (int) r2.getLong(r32);     // Catch: Throwable -> L115
        r32 = r32;
        int r208 = r33;
        int r209 = (int) r2.getLong(r208);     // Catch: Throwable -> L115
        int r210 = r34;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r35;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r36;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r37;
        int r217 = (int) r2.getLong(r216);     // Catch: Throwable -> L115
        int r218 = r38;
        float r219 = (float) r2.getDouble(r218);     // Catch: Throwable -> L115
        int r220 = r39;
        float r221 = (float) r2.getDouble(r220);     // Catch: Throwable -> L115
        int r222 = r40;
        int r223 = (int) r2.getLong(r222);     // Catch: Throwable -> L115
        int r224 = r41;
        float r225 = (float) r2.getDouble(r224);     // Catch: Throwable -> L115
        int r226 = r42;
        int r227 = (int) r2.getLong(r226);     // Catch: Throwable -> L115
        int r228 = r43;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r44;
        int r231 = (int) r2.getLong(r230);     // Catch: Throwable -> L115
        int r232 = r45;
        if (r2.isNull(r232) == false) goto L33;
        String r233 = null;
    L34:
        int[] r2010 = this.__workoutConverter.toIntArray(r233);     // Catch: Throwable -> L115
        int r234 = r46;
        if (r2.isNull(r234) == false) goto L38;
        String r235 = null;
    L37:
        r46 = r234;
        int[] r2110 = this.__workoutConverter.toIntArray(r235);     // Catch: Throwable -> L115
        int r236 = r47;
        int r237 = (int) r2.getLong(r236);     // Catch: Throwable -> L115
        int r326 = r8;
        int r238 = r48;
        int r410 = r7;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r240 = r49;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r50;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r51;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r52;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r53;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r54;
        int r251 = (int) r2.getLong(r250);     // Catch: Throwable -> L115
        int r252 = r55;
        if (r2.isNull(r252) == false) goto L43;
        String r253 = null;
    L44:
        List<float[]> r2111 = this.__workoutConverter.floatArrayToWatchList(r253);     // Catch: Throwable -> L115
        int r254 = r56;
        int r255 = (int) r2.getLong(r254);     // Catch: Throwable -> L115
        int r256 = r57;
        int r257 = (int) r2.getLong(r256);     // Catch: Throwable -> L115
        int r258 = r58;
        if (r2.isNull(r258) == false) goto L48;
        String r259 = null;
    L49:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r259);     // Catch: Throwable -> L115
        r57 = r256;
        int r260 = r59;
        int r261 = (int) r2.getLong(r260);     // Catch: Throwable -> L115
        int r262 = r60;
        int r263 = (int) r2.getLong(r262);     // Catch: Throwable -> L115
        int r264 = r61;
        if (r2.isNull(r264) == false) goto L53;
        String r265 = null;
    L54:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r265);     // Catch: Throwable -> L115
        r60 = r262;
        int r266 = r62;
        int r267 = (int) r2.getLong(r266);     // Catch: Throwable -> L115
        int r268 = r63;
        int r269 = (int) r2.getLong(r268);     // Catch: Throwable -> L115
        int r270 = r64;
        if (r2.isNull(r270) == false) goto L58;
        String r271 = null;
    L59:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r271);     // Catch: Throwable -> L115
        r63 = r268;
        int r272 = r65;
        int r273 = (int) r2.getLong(r272);     // Catch: Throwable -> L115
        int r274 = r66;
        int r275 = (int) r2.getLong(r274);     // Catch: Throwable -> L115
        int r276 = r67;
        if (r2.isNull(r276) == false) goto L63;
        String r277 = null;
    L64:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r277);     // Catch: Throwable -> L115
        r66 = r274;
        int r278 = r68;
        int r279 = (int) r2.getLong(r278);     // Catch: Throwable -> L115
        int r280 = r69;
        int r281 = (int) r2.getLong(r280);     // Catch: Throwable -> L115
        int r282 = r70;
        if (r2.isNull(r282) == false) goto L68;
        String r283 = null;
    L69:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r283);     // Catch: Throwable -> L115
        r69 = r280;
        int r284 = r71;
        int r285 = (int) r2.getLong(r284);     // Catch: Throwable -> L115
        int r286 = r72;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        r72 = r286;
        int r288 = r73;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r73 = r288;
        int r290 = r74;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r74 = r290;
        int r292 = r75;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r75 = r292;
        int r294 = r76;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r76 = r294;
        int r296 = r77;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r77 = r296;
        int r298 = r78;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r78 = r298;
        int r300 = r79;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r79 = r300;
        int r302 = r80;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r80 = r302;
        int r304 = r81;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r81 = r304;
        int r306 = r82;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r82 = r306;
        int r308 = r83;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r83 = r308;
        int r310 = r84;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r84 = r310;
        int r312 = r85;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r85 = r312;
        int r314 = r86;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r86 = r314;
        int r316 = r87;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r87 = r316;
        int r318 = r88;
        int r319 = (int) r2.getLong(r318);     // Catch: Throwable -> L115
        r88 = r318;
        int r320 = r89;
        float r321 = (float) r2.getDouble(r320);     // Catch: Throwable -> L115
        r89 = r320;
        int r322 = r90;
        int r323 = (int) r2.getLong(r322);     // Catch: Throwable -> L115
        r90 = r322;
        int r324 = r91;
        int r327 = (int) r2.getLong(r324);     // Catch: Throwable -> L115
        r91 = r324;
        int r328 = r92;
        float r329 = (float) r2.getDouble(r328);     // Catch: Throwable -> L115
        int r330 = r93;
        if (r2.isNull(r330) == false) goto L73;
        String r331 = null;
    L74:
        int[] r332 = this.__workoutConverter.toIntArray(r331);     // Catch: Throwable -> L115
        int r333 = r94;
        if (r2.isNull(r333) == false) goto L78;
        String r340 = null;
    L77:
        r94 = r333;
        float[] r341 = this.__workoutConverter.toFloatArray(r340);     // Catch: Throwable -> L115
        r92 = r328;
        int r342 = r95;
        int r343 = (int) r2.getLong(r342);     // Catch: Throwable -> L115
        r95 = r342;
        int r344 = r96;
        int r345 = (int) r2.getLong(r344);     // Catch: Throwable -> L115
        int r346 = r97;
        int r347 = (int) r2.getLong(r346);     // Catch: Throwable -> L115
        int r348 = r98;
        if (r2.isNull(r348) == false) goto L83;
        String r349 = null;
    L84:
        List<Integer> r350 = this.__workoutConverter.stringToStopWatchList(r349);     // Catch: Throwable -> L115
        int r351 = r99;
        float r352 = (float) r2.getDouble(r351);     // Catch: Throwable -> L115
        r99 = r351;
        int r353 = r100;
        float r354 = (float) r2.getDouble(r353);     // Catch: Throwable -> L115
        int r355 = r101;
        float r356 = (float) r2.getDouble(r355);     // Catch: Throwable -> L115
        int r357 = r102;
        float r358 = (float) r2.getDouble(r357);     // Catch: Throwable -> L115
        int r359 = r103;
        int r360 = (int) r2.getLong(r359);     // Catch: Throwable -> L115
        int r361 = r104;
        int r362 = (int) r2.getLong(r361);     // Catch: Throwable -> L115
        int r363 = r105;
        int r364 = (int) r2.getLong(r363);     // Catch: Throwable -> L115
        int r365 = r106;
        int r366 = (int) r2.getLong(r365);     // Catch: Throwable -> L115
        int r367 = r107;
        int r368 = (int) r2.getLong(r367);     // Catch: Throwable -> L115
        int r369 = r108;
        int r370 = (int) r2.getLong(r369);     // Catch: Throwable -> L115
        int r371 = r109;
        int r372 = (int) r2.getLong(r371);     // Catch: Throwable -> L115
        int r373 = r110;
        int r374 = (int) r2.getLong(r373);     // Catch: Throwable -> L115
        int r375 = r111;
        int r376 = (int) r2.getLong(r375);     // Catch: Throwable -> L115
        int r377 = r112;
        int r378 = (int) r2.getLong(r377);     // Catch: Throwable -> L115
        int r379 = r113;
        int r380 = (int) r2.getLong(r379);     // Catch: Throwable -> L115
        int r381 = r114;
        int r382 = (int) r2.getLong(r381);     // Catch: Throwable -> L115
        int r383 = r115;
        float r384 = (float) r2.getDouble(r383);     // Catch: Throwable -> L115
        int r385 = r116;
        float r386 = (float) r2.getDouble(r385);     // Catch: Throwable -> L115
        int r387 = r117;
        int r388 = (int) r2.getLong(r387);     // Catch: Throwable -> L115
        int r389 = r118;
        int r390 = (int) r2.getLong(r389);     // Catch: Throwable -> L115
        int r391 = r119;
        int r392 = (int) r2.getLong(r391);     // Catch: Throwable -> L115
        int r393 = r120;
        int r394 = (int) r2.getLong(r393);     // Catch: Throwable -> L115
        int r395 = r121;
        float r396 = (float) r2.getDouble(r395);     // Catch: Throwable -> L115
        int r397 = r122;
        if (r2.isNull(r397) == false) goto L88;
        String r398 = null;
    L89:
        float[] r399 = this.__workoutConverter.toFloatArray(r398);     // Catch: Throwable -> L115
        int r400 = r123;
        if (r2.isNull(r400) == false) goto L93;
        String r401 = null;
    L92:
        r123 = r400;
        float[] r402 = this.__workoutConverter.toFloatArray(r401);     // Catch: Throwable -> L115
        int r403 = r124;
        int r404 = (int) r2.getLong(r403);     // Catch: Throwable -> L115
        r124 = r403;
        int r405 = r125;
        int r406 = (int) r2.getLong(r405);     // Catch: Throwable -> L115
        int r407 = r126;
        int r408 = (int) r2.getLong(r407);     // Catch: Throwable -> L115
        int r409 = r127;
        int r411 = (int) r2.getLong(r409);     // Catch: Throwable -> L115
        int r412 = r128;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r129;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r130;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r131;
        int r419 = (int) r2.getLong(r418);     // Catch: Throwable -> L115
        int r420 = r132;
        if (r2.isNull(r420) == false) goto L98;
        String r421 = null;
    L99:
        List<Integer> r422 = this.__workoutConverter.stringToStopWatchList(r421);     // Catch: Throwable -> L115
        r132 = r420;
        int r423 = r133;
        int r424 = (int) r2.getLong(r423);     // Catch: Throwable -> L115
        int r425 = r134;
        if (r2.isNull(r425) == false) goto L103;
        String r426 = null;
    L102:
        r133 = r423;
        List<Float> r427 = this.__workoutConverter.stringToFloatWatch(r426);     // Catch: Throwable -> L115
        r134 = r425;
        int r428 = r135;
        int r429 = (int) r2.getLong(r428);     // Catch: Throwable -> L115
        int r430 = r136;
        long r1310 = r2.getLong(r430);     // Catch: Throwable -> L115
        int r431 = r137;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r138;
        int r434 = (int) r2.getLong(r433);     // Catch: Throwable -> L115
        int r435 = r139;
        long r1511 = r2.getLong(r435);     // Catch: Throwable -> L115
        int r436 = r140;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r141;
        int r439 = (int) r2.getLong(r438);     // Catch: Throwable -> L115
        int r440 = r142;
        String r1410 = null;
        long r1311 = r2.getLong(r440);     // Catch: Throwable -> L115
        int r441 = r143;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r144;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r145;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r146;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r147;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r148;
        int r452 = (int) r2.getLong(r451);     // Catch: Throwable -> L115
        int r453 = r149;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r150;
        float r456 = (float) r2.getDouble(r455);     // Catch: Throwable -> L115
        int r457 = r151;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r152;
        int r460 = (int) r2.getLong(r459);     // Catch: Throwable -> L115
        int r461 = r153;
        if (r2.isNull(r461) == false) goto L108;
        String r462 = null;
    L109:
        List<Integer> r463 = this.__workoutConverter.stringToStopWatchList(r462);     // Catch: Throwable -> L115
        int r464 = r154;
        int r465 = (int) r2.getLong(r464);     // Catch: Throwable -> L115
        int r466 = r155;
        if (r2.isNull(r466) == false) goto L112;
    L111:
        r155 = r466;
        r154 = r464;
        int r467 = r156;
        r1.add(new Workout(r159, r161, r163, r165, r160, r162, r164, r166, r167, r168, r169, r170, r171, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r1910, r1911, r1912, r1913, r207, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r231, r2010, r2110, r237, r239, r241, r243, r245, r247, r249, r251, r2111, r255, r257, r2210, r261, r263, r2211, r267, r269, r2212, r273, r275, r2310, r279, r281, r2311, r285, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r323, r327, r329, r332, r341, r343, r345, r347, r350, r352, r354, r356, r358, r360, r362, r364, r366, r368, r370, r372, r374, r376, r378, r380, r382, r384, r386, r388, r390, r392, r394, r396, r399, r402, r404, r406, r408, r411, r413, r415, r417, r419, r422, r424, r427, r429, r1310, r432, r434, r1511, r437, r439, r1311, r442, r444, r446, r448, r450, r452, r454, r456, r458, r460, r463, r465, r1410, (int) r2.getLong(r467)));     // Catch: Throwable -> L115
        r156 = r467;
        r153 = r461;
        r3 = r3;
        r7 = r410;
        r48 = r238;
        r49 = r240;
        r50 = r242;
        r51 = r244;
        r52 = r246;
        r53 = r248;
        r54 = r250;
        r55 = r252;
        r56 = r254;
        r58 = r258;
        r59 = r260;
        r61 = r264;
        r62 = r266;
        r64 = r270;
        r65 = r272;
        r67 = r276;
        r68 = r278;
        r70 = r282;
        r71 = r284;
        r93 = r330;
        r96 = r344;
        r97 = r346;
        r98 = r348;
        r100 = r353;
        r101 = r355;
        r102 = r357;
        r103 = r359;
        r104 = r361;
        r105 = r363;
        r106 = r365;
        r107 = r367;
        r108 = r369;
        r109 = r371;
        r110 = r373;
        r111 = r375;
        r112 = r377;
        r113 = r379;
        r114 = r381;
        r115 = r383;
        r116 = r385;
        r117 = r387;
        r118 = r389;
        r119 = r391;
        r120 = r393;
        r121 = r395;
        r122 = r397;
        r125 = r405;
        r126 = r407;
        r127 = r409;
        r128 = r412;
        r129 = r414;
        r130 = r416;
        r135 = r428;
        r131 = r418;
        r139 = r435;
        r141 = r438;
        r142 = r440;
        r144 = r443;
        r145 = r445;
        r146 = r447;
        r147 = r449;
        r148 = r451;
        r149 = r453;
        r150 = r455;
        r151 = r457;
        r5 = r1510;
        r14 = r157;
        r4 = r4;
        r8 = r326;
        r136 = r430;
        r137 = r431;
        r138 = r433;
        r140 = r436;
        r143 = r441;
        r15 = r158;
        r338 = r173;
        r339 = r175;
        r3310 = r177;
        r152 = r459;
        r3311 = r179;
        r16 = r181;
        r17 = r183;
        r18 = r185;
        r19 = r187;
        r20 = r189;
        r21 = r191;
        r22 = r193;
        r23 = r195;
        r24 = r197;
        r25 = r199;
        r26 = r201;
        r27 = r203;
        r33 = r208;
        r34 = r210;
        r35 = r212;
        r36 = r214;
        r37 = r216;
        r38 = r218;
        r39 = r220;
        r40 = r222;
        r41 = r224;
        r42 = r226;
        r43 = r228;
        r44 = r230;
        r45 = r232;
        r6 = r325;
        r47 = r236;
        goto L4
    L112:
        r1410 = r2.getText(r466);     // Catch: Throwable -> L115
        goto L111
    L108:
        r462 = r2.getText(r461);     // Catch: Throwable -> L115
        goto L109
    L103:
        r426 = r2.getText(r425);     // Catch: Throwable -> L115
        goto L102
    L98:
        r421 = r2.getText(r420);     // Catch: Throwable -> L115
        goto L99
    L93:
        r401 = r2.getText(r400);     // Catch: Throwable -> L115
        goto L92
    L88:
        r398 = r2.getText(r397);     // Catch: Throwable -> L115
        goto L89
    L83:
        r349 = r2.getText(r348);     // Catch: Throwable -> L115
        goto L84
    L78:
        r340 = r2.getText(r333);     // Catch: Throwable -> L115
        goto L77
    L73:
        r331 = r2.getText(r330);     // Catch: Throwable -> L115
        goto L74
    L68:
        r283 = r2.getText(r282);     // Catch: Throwable -> L115
        goto L69
    L63:
        r277 = r2.getText(r276);     // Catch: Throwable -> L115
        goto L64
    L58:
        r271 = r2.getText(r270);     // Catch: Throwable -> L115
        goto L59
    L53:
        r265 = r2.getText(r264);     // Catch: Throwable -> L115
        goto L54
    L48:
        r259 = r2.getText(r258);     // Catch: Throwable -> L115
        goto L49
    L43:
        r253 = r2.getText(r252);     // Catch: Throwable -> L115
        goto L44
    L38:
        r235 = r2.getText(r234);     // Catch: Throwable -> L115
        goto L37
    L33:
        r233 = r2.getText(r232);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r31);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r206);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r205);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r28);     // Catch: Throwable -> L115
        goto L13
    L9:
        r165 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListDESC$7(long r332, long r334, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mStart >= ? AND mEnd <= ?  AND mMode != ? AND mIsDelete !=1 ORDER BY mStart DESC");
        r2.mo3338bindLong(1, r332);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r334);     // Catch: Throwable -> L115
        r2.mo3338bindLong(3, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r333 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r335 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r3311 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r155 = r14;
        int r156 = r15;
        int r157 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r159 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r161 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r163 = null;
    L10:
        int r158 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r160 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r162 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r323 = r6;
        int r1510 = r5;
        int r169 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r156);     // Catch: Throwable -> L115
        int r171 = r333;
        int r172 = (int) r2.getLong(r171);     // Catch: Throwable -> L115
        int r173 = r335;
        int r174 = (int) r2.getLong(r173);     // Catch: Throwable -> L115
        int r175 = r338;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r339;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r3310;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r3311;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r16;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r17;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r18;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r19;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r20;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r21;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r22;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r23;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r24;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r25;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        r26 = r26;
        if (r2.isNull(r26) == false) goto L14;
        String r1910 = null;
    L13:
        int r203 = r27;
        if (r2.isNull(r203) == false) goto L19;
        String r1911 = null;
    L18:
        r27 = r203;
        int r204 = r28;
        if (r2.isNull(r204) == false) goto L24;
        String r1912 = null;
    L23:
        r28 = r204;
        r29 = r29;
        if (r2.isNull(r29) == false) goto L28;
        String r1913 = null;
    L29:
        int r205 = (int) r2.getLong(r30);     // Catch: Throwable -> L115
        r30 = r30;
        int r206 = r31;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        int r208 = r32;
        int r209 = (int) r2.getLong(r208);     // Catch: Throwable -> L115
        int r210 = r33;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r34;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r35;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r36;
        float r217 = (float) r2.getDouble(r216);     // Catch: Throwable -> L115
        int r218 = r37;
        float r219 = (float) r2.getDouble(r218);     // Catch: Throwable -> L115
        int r220 = r38;
        int r221 = (int) r2.getLong(r220);     // Catch: Throwable -> L115
        int r222 = r39;
        float r223 = (float) r2.getDouble(r222);     // Catch: Throwable -> L115
        int r224 = r40;
        int r225 = (int) r2.getLong(r224);     // Catch: Throwable -> L115
        int r226 = r41;
        int r227 = (int) r2.getLong(r226);     // Catch: Throwable -> L115
        int r228 = r42;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r43;
        if (r2.isNull(r230) == false) goto L33;
        String r231 = null;
    L34:
        int[] r2010 = this.__workoutConverter.toIntArray(r231);     // Catch: Throwable -> L115
        int r232 = r44;
        if (r2.isNull(r232) == false) goto L38;
        String r233 = null;
    L37:
        r44 = r232;
        int[] r2011 = this.__workoutConverter.toIntArray(r233);     // Catch: Throwable -> L115
        int r234 = r45;
        int r235 = (int) r2.getLong(r234);     // Catch: Throwable -> L115
        int r324 = r8;
        int r236 = r46;
        int r410 = r7;
        int r237 = (int) r2.getLong(r236);     // Catch: Throwable -> L115
        int r238 = r47;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r240 = r48;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r49;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r50;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r51;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r52;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r53;
        if (r2.isNull(r250) == false) goto L43;
        String r251 = null;
    L44:
        List<float[]> r2110 = this.__workoutConverter.floatArrayToWatchList(r251);     // Catch: Throwable -> L115
        int r252 = r54;
        int r253 = (int) r2.getLong(r252);     // Catch: Throwable -> L115
        int r254 = r55;
        int r255 = (int) r2.getLong(r254);     // Catch: Throwable -> L115
        int r256 = r56;
        if (r2.isNull(r256) == false) goto L48;
        String r257 = null;
    L49:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r257);     // Catch: Throwable -> L115
        r55 = r254;
        int r258 = r57;
        int r259 = (int) r2.getLong(r258);     // Catch: Throwable -> L115
        int r260 = r58;
        int r261 = (int) r2.getLong(r260);     // Catch: Throwable -> L115
        int r262 = r59;
        if (r2.isNull(r262) == false) goto L53;
        String r263 = null;
    L54:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r263);     // Catch: Throwable -> L115
        r58 = r260;
        int r264 = r60;
        int r265 = (int) r2.getLong(r264);     // Catch: Throwable -> L115
        int r266 = r61;
        int r267 = (int) r2.getLong(r266);     // Catch: Throwable -> L115
        int r268 = r62;
        if (r2.isNull(r268) == false) goto L58;
        String r269 = null;
    L59:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r269);     // Catch: Throwable -> L115
        r61 = r266;
        int r270 = r63;
        int r271 = (int) r2.getLong(r270);     // Catch: Throwable -> L115
        int r272 = r64;
        int r273 = (int) r2.getLong(r272);     // Catch: Throwable -> L115
        int r274 = r65;
        if (r2.isNull(r274) == false) goto L63;
        String r275 = null;
    L64:
        List<Integer> r2213 = this.__workoutConverter.stringToStopWatchList(r275);     // Catch: Throwable -> L115
        r64 = r272;
        int r276 = r66;
        int r277 = (int) r2.getLong(r276);     // Catch: Throwable -> L115
        int r278 = r67;
        int r279 = (int) r2.getLong(r278);     // Catch: Throwable -> L115
        int r280 = r68;
        if (r2.isNull(r280) == false) goto L68;
        String r281 = null;
    L69:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r281);     // Catch: Throwable -> L115
        r67 = r278;
        int r282 = r69;
        int r283 = (int) r2.getLong(r282);     // Catch: Throwable -> L115
        int r284 = r70;
        int r285 = (int) r2.getLong(r284);     // Catch: Throwable -> L115
        r70 = r284;
        int r286 = r71;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        r71 = r286;
        int r288 = r72;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r72 = r288;
        int r290 = r73;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r73 = r290;
        int r292 = r74;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r74 = r292;
        int r294 = r75;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r75 = r294;
        int r296 = r76;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r76 = r296;
        int r298 = r77;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r77 = r298;
        int r300 = r78;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r78 = r300;
        int r302 = r79;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r79 = r302;
        int r304 = r80;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r80 = r304;
        int r306 = r81;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r81 = r306;
        int r308 = r82;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r82 = r308;
        int r310 = r83;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r83 = r310;
        int r312 = r84;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r84 = r312;
        int r314 = r85;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r85 = r314;
        int r316 = r86;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r86 = r316;
        int r318 = r87;
        float r319 = (float) r2.getDouble(r318);     // Catch: Throwable -> L115
        r87 = r318;
        int r320 = r88;
        int r321 = (int) r2.getLong(r320);     // Catch: Throwable -> L115
        r88 = r320;
        int r322 = r89;
        int r325 = (int) r2.getLong(r322);     // Catch: Throwable -> L115
        r89 = r322;
        int r326 = r90;
        float r327 = (float) r2.getDouble(r326);     // Catch: Throwable -> L115
        int r328 = r91;
        if (r2.isNull(r328) == false) goto L73;
        String r329 = null;
    L74:
        int[] r2510 = this.__workoutConverter.toIntArray(r329);     // Catch: Throwable -> L115
        int r330 = r92;
        if (r2.isNull(r330) == false) goto L78;
        String r331 = null;
    L77:
        r92 = r330;
        float[] r340 = this.__workoutConverter.toFloatArray(r331);     // Catch: Throwable -> L115
        r90 = r326;
        int r341 = r93;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r93 = r341;
        int r343 = r94;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r95;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r96;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r97;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r97 = r350;
        int r352 = r98;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r99;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r100;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r101;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r102;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r103;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r104;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r105;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r106;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r107;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r108;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r109;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r110;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r111;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r112;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r113;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r114;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r115;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r116;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r117;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r118;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r119;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r120;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r121;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r121 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r122;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r122 = r402;
        int r404 = r123;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r124;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r125;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r411 = r126;
        int r412 = (int) r2.getLong(r411);     // Catch: Throwable -> L115
        int r413 = r127;
        int r414 = (int) r2.getLong(r413);     // Catch: Throwable -> L115
        int r415 = r128;
        int r416 = (int) r2.getLong(r415);     // Catch: Throwable -> L115
        int r417 = r129;
        int r418 = (int) r2.getLong(r417);     // Catch: Throwable -> L115
        int r419 = r130;
        if (r2.isNull(r419) == false) goto L98;
        String r420 = null;
    L99:
        List<Integer> r421 = this.__workoutConverter.stringToStopWatchList(r420);     // Catch: Throwable -> L115
        r130 = r419;
        int r422 = r131;
        int r423 = (int) r2.getLong(r422);     // Catch: Throwable -> L115
        int r424 = r132;
        if (r2.isNull(r424) == false) goto L103;
        String r425 = null;
    L102:
        r131 = r422;
        List<Float> r426 = this.__workoutConverter.stringToFloatWatch(r425);     // Catch: Throwable -> L115
        r132 = r424;
        int r427 = r133;
        int r428 = (int) r2.getLong(r427);     // Catch: Throwable -> L115
        int r429 = r134;
        long r1310 = r2.getLong(r429);     // Catch: Throwable -> L115
        int r430 = r135;
        int r431 = (int) r2.getLong(r430);     // Catch: Throwable -> L115
        int r432 = r136;
        int r433 = (int) r2.getLong(r432);     // Catch: Throwable -> L115
        int r434 = r137;
        long r1511 = r2.getLong(r434);     // Catch: Throwable -> L115
        int r435 = r138;
        int r436 = (int) r2.getLong(r435);     // Catch: Throwable -> L115
        int r437 = r139;
        int r438 = (int) r2.getLong(r437);     // Catch: Throwable -> L115
        int r439 = r140;
        String r1410 = null;
        long r1311 = r2.getLong(r439);     // Catch: Throwable -> L115
        int r440 = r141;
        int r441 = (int) r2.getLong(r440);     // Catch: Throwable -> L115
        int r442 = r142;
        int r443 = (int) r2.getLong(r442);     // Catch: Throwable -> L115
        int r444 = r143;
        int r445 = (int) r2.getLong(r444);     // Catch: Throwable -> L115
        int r446 = r144;
        int r447 = (int) r2.getLong(r446);     // Catch: Throwable -> L115
        int r448 = r145;
        int r449 = (int) r2.getLong(r448);     // Catch: Throwable -> L115
        int r450 = r146;
        int r451 = (int) r2.getLong(r450);     // Catch: Throwable -> L115
        int r452 = r147;
        float r453 = (float) r2.getDouble(r452);     // Catch: Throwable -> L115
        int r454 = r148;
        float r455 = (float) r2.getDouble(r454);     // Catch: Throwable -> L115
        int r456 = r149;
        int r457 = (int) r2.getLong(r456);     // Catch: Throwable -> L115
        int r458 = r150;
        int r459 = (int) r2.getLong(r458);     // Catch: Throwable -> L115
        int r460 = r151;
        if (r2.isNull(r460) == false) goto L108;
        String r461 = null;
    L109:
        List<Integer> r462 = this.__workoutConverter.stringToStopWatchList(r461);     // Catch: Throwable -> L115
        int r463 = r152;
        int r464 = (int) r2.getLong(r463);     // Catch: Throwable -> L115
        int r465 = r153;
        if (r2.isNull(r465) == false) goto L112;
    L111:
        r153 = r465;
        r152 = r463;
        int r466 = r154;
        r1.add(new Workout(r157, r159, r161, r163, r158, r160, r162, r164, r165, r166, r167, r168, r169, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r1910, r1911, r1912, r1913, r205, r207, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r2010, r2011, r235, r237, r239, r241, r243, r245, r247, r249, r2110, r253, r255, r2210, r259, r261, r2211, r265, r267, r2212, r271, r273, r2213, r277, r279, r2310, r283, r285, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r325, r327, r2510, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r412, r414, r416, r418, r421, r423, r426, r428, r1310, r431, r433, r1511, r436, r438, r1311, r441, r443, r445, r447, r449, r451, r453, r455, r457, r459, r462, r464, r1410, (int) r2.getLong(r466)));     // Catch: Throwable -> L115
        r154 = r466;
        r151 = r460;
        r3 = r3;
        r7 = r410;
        r46 = r236;
        r47 = r238;
        r48 = r240;
        r49 = r242;
        r50 = r244;
        r51 = r246;
        r52 = r248;
        r53 = r250;
        r54 = r252;
        r56 = r256;
        r57 = r258;
        r59 = r262;
        r60 = r264;
        r62 = r268;
        r63 = r270;
        r65 = r274;
        r66 = r276;
        r68 = r280;
        r69 = r282;
        r91 = r328;
        r94 = r343;
        r95 = r345;
        r96 = r347;
        r98 = r352;
        r99 = r354;
        r100 = r356;
        r101 = r358;
        r102 = r360;
        r103 = r362;
        r104 = r364;
        r105 = r366;
        r106 = r368;
        r107 = r370;
        r108 = r372;
        r109 = r374;
        r110 = r376;
        r111 = r378;
        r112 = r380;
        r113 = r382;
        r114 = r384;
        r115 = r386;
        r116 = r388;
        r117 = r390;
        r118 = r392;
        r119 = r394;
        r120 = r396;
        r123 = r404;
        r124 = r406;
        r125 = r408;
        r126 = r411;
        r127 = r413;
        r128 = r415;
        r133 = r427;
        r129 = r417;
        r137 = r434;
        r139 = r437;
        r140 = r439;
        r142 = r442;
        r143 = r444;
        r144 = r446;
        r145 = r448;
        r146 = r450;
        r147 = r452;
        r148 = r454;
        r149 = r456;
        r5 = r1510;
        r14 = r155;
        r4 = r4;
        r8 = r324;
        r134 = r429;
        r135 = r430;
        r136 = r432;
        r138 = r435;
        r141 = r440;
        r15 = r156;
        r333 = r171;
        r335 = r173;
        r338 = r175;
        r339 = r177;
        r3310 = r179;
        r150 = r458;
        r3311 = r181;
        r16 = r183;
        r17 = r185;
        r18 = r187;
        r19 = r189;
        r20 = r191;
        r21 = r193;
        r22 = r195;
        r23 = r197;
        r24 = r199;
        r25 = r201;
        r31 = r206;
        r32 = r208;
        r33 = r210;
        r34 = r212;
        r35 = r214;
        r36 = r216;
        r37 = r218;
        r38 = r220;
        r39 = r222;
        r40 = r224;
        r41 = r226;
        r42 = r228;
        r43 = r230;
        r6 = r323;
        r45 = r234;
        goto L4
    L112:
        r1410 = r2.getText(r465);     // Catch: Throwable -> L115
        goto L111
    L108:
        r461 = r2.getText(r460);     // Catch: Throwable -> L115
        goto L109
    L103:
        r425 = r2.getText(r424);     // Catch: Throwable -> L115
        goto L102
    L98:
        r420 = r2.getText(r419);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r331 = r2.getText(r330);     // Catch: Throwable -> L115
        goto L77
    L73:
        r329 = r2.getText(r328);     // Catch: Throwable -> L115
        goto L74
    L68:
        r281 = r2.getText(r280);     // Catch: Throwable -> L115
        goto L69
    L63:
        r275 = r2.getText(r274);     // Catch: Throwable -> L115
        goto L64
    L58:
        r269 = r2.getText(r268);     // Catch: Throwable -> L115
        goto L59
    L53:
        r263 = r2.getText(r262);     // Catch: Throwable -> L115
        goto L54
    L48:
        r257 = r2.getText(r256);     // Catch: Throwable -> L115
        goto L49
    L43:
        r251 = r2.getText(r250);     // Catch: Throwable -> L115
        goto L44
    L38:
        r233 = r2.getText(r232);     // Catch: Throwable -> L115
        goto L37
    L33:
        r231 = r2.getText(r230);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r29);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r204);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r203);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r26);     // Catch: Throwable -> L115
        goto L13
    L9:
        r163 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListDESCByMode$16(int r334, int r335, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mStart > 0 AND mMode = ? AND mIsDelete != 1 ORDER BY mStart DESC LIMIT ?, ?");
        r2.mo3338bindLong(1, r334);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r335);     // Catch: Throwable -> L115
        r2.mo3338bindLong(3, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r3311 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r157 = r14;
        int r158 = r15;
        int r159 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r161 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r163 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r165 = null;
    L10:
        int r160 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r162 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r325 = r6;
        int r1510 = r5;
        int r171 = (int) r2.getLong(r157);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r158);     // Catch: Throwable -> L115
        int r173 = r338;
        int r174 = (int) r2.getLong(r173);     // Catch: Throwable -> L115
        int r175 = r339;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r3310;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r3311;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r16;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r17;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r18;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r19;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r20;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r21;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r22;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r23;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r24;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r25;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r26;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        int r203 = r27;
        int r204 = (int) r2.getLong(r203);     // Catch: Throwable -> L115
        r28 = r28;
        if (r2.isNull(r28) == false) goto L14;
        String r1910 = null;
    L13:
        int r205 = r29;
        if (r2.isNull(r205) == false) goto L19;
        String r1911 = null;
    L18:
        r29 = r205;
        int r206 = r30;
        if (r2.isNull(r206) == false) goto L24;
        String r1912 = null;
    L23:
        r30 = r206;
        r31 = r31;
        if (r2.isNull(r31) == false) goto L28;
        String r1913 = null;
    L29:
        int r207 = (int) r2.getLong(r32);     // Catch: Throwable -> L115
        r32 = r32;
        int r208 = r33;
        int r209 = (int) r2.getLong(r208);     // Catch: Throwable -> L115
        int r210 = r34;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r35;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r36;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r37;
        int r217 = (int) r2.getLong(r216);     // Catch: Throwable -> L115
        int r218 = r38;
        float r219 = (float) r2.getDouble(r218);     // Catch: Throwable -> L115
        int r220 = r39;
        float r221 = (float) r2.getDouble(r220);     // Catch: Throwable -> L115
        int r222 = r40;
        int r223 = (int) r2.getLong(r222);     // Catch: Throwable -> L115
        int r224 = r41;
        float r225 = (float) r2.getDouble(r224);     // Catch: Throwable -> L115
        int r226 = r42;
        int r227 = (int) r2.getLong(r226);     // Catch: Throwable -> L115
        int r228 = r43;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r44;
        int r231 = (int) r2.getLong(r230);     // Catch: Throwable -> L115
        int r232 = r45;
        if (r2.isNull(r232) == false) goto L33;
        String r233 = null;
    L34:
        int[] r2010 = this.__workoutConverter.toIntArray(r233);     // Catch: Throwable -> L115
        int r234 = r46;
        if (r2.isNull(r234) == false) goto L38;
        String r235 = null;
    L37:
        r46 = r234;
        int[] r2110 = this.__workoutConverter.toIntArray(r235);     // Catch: Throwable -> L115
        int r236 = r47;
        int r237 = (int) r2.getLong(r236);     // Catch: Throwable -> L115
        int r326 = r8;
        int r238 = r48;
        int r410 = r7;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r240 = r49;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r50;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r51;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r52;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r53;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r54;
        int r251 = (int) r2.getLong(r250);     // Catch: Throwable -> L115
        int r252 = r55;
        if (r2.isNull(r252) == false) goto L43;
        String r253 = null;
    L44:
        List<float[]> r2111 = this.__workoutConverter.floatArrayToWatchList(r253);     // Catch: Throwable -> L115
        int r254 = r56;
        int r255 = (int) r2.getLong(r254);     // Catch: Throwable -> L115
        int r256 = r57;
        int r257 = (int) r2.getLong(r256);     // Catch: Throwable -> L115
        int r258 = r58;
        if (r2.isNull(r258) == false) goto L48;
        String r259 = null;
    L49:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r259);     // Catch: Throwable -> L115
        r57 = r256;
        int r260 = r59;
        int r261 = (int) r2.getLong(r260);     // Catch: Throwable -> L115
        int r262 = r60;
        int r263 = (int) r2.getLong(r262);     // Catch: Throwable -> L115
        int r264 = r61;
        if (r2.isNull(r264) == false) goto L53;
        String r265 = null;
    L54:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r265);     // Catch: Throwable -> L115
        r60 = r262;
        int r266 = r62;
        int r267 = (int) r2.getLong(r266);     // Catch: Throwable -> L115
        int r268 = r63;
        int r269 = (int) r2.getLong(r268);     // Catch: Throwable -> L115
        int r270 = r64;
        if (r2.isNull(r270) == false) goto L58;
        String r271 = null;
    L59:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r271);     // Catch: Throwable -> L115
        r63 = r268;
        int r272 = r65;
        int r273 = (int) r2.getLong(r272);     // Catch: Throwable -> L115
        int r274 = r66;
        int r275 = (int) r2.getLong(r274);     // Catch: Throwable -> L115
        int r276 = r67;
        if (r2.isNull(r276) == false) goto L63;
        String r277 = null;
    L64:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r277);     // Catch: Throwable -> L115
        r66 = r274;
        int r278 = r68;
        int r279 = (int) r2.getLong(r278);     // Catch: Throwable -> L115
        int r280 = r69;
        int r281 = (int) r2.getLong(r280);     // Catch: Throwable -> L115
        int r282 = r70;
        if (r2.isNull(r282) == false) goto L68;
        String r283 = null;
    L69:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r283);     // Catch: Throwable -> L115
        r69 = r280;
        int r284 = r71;
        int r285 = (int) r2.getLong(r284);     // Catch: Throwable -> L115
        int r286 = r72;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        r72 = r286;
        int r288 = r73;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r73 = r288;
        int r290 = r74;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r74 = r290;
        int r292 = r75;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r75 = r292;
        int r294 = r76;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r76 = r294;
        int r296 = r77;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r77 = r296;
        int r298 = r78;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r78 = r298;
        int r300 = r79;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r79 = r300;
        int r302 = r80;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r80 = r302;
        int r304 = r81;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r81 = r304;
        int r306 = r82;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r82 = r306;
        int r308 = r83;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r83 = r308;
        int r310 = r84;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r84 = r310;
        int r312 = r85;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r85 = r312;
        int r314 = r86;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r86 = r314;
        int r316 = r87;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r87 = r316;
        int r318 = r88;
        int r319 = (int) r2.getLong(r318);     // Catch: Throwable -> L115
        r88 = r318;
        int r320 = r89;
        float r321 = (float) r2.getDouble(r320);     // Catch: Throwable -> L115
        r89 = r320;
        int r322 = r90;
        int r323 = (int) r2.getLong(r322);     // Catch: Throwable -> L115
        r90 = r322;
        int r324 = r91;
        int r327 = (int) r2.getLong(r324);     // Catch: Throwable -> L115
        r91 = r324;
        int r328 = r92;
        float r329 = (float) r2.getDouble(r328);     // Catch: Throwable -> L115
        int r330 = r93;
        if (r2.isNull(r330) == false) goto L73;
        String r331 = null;
    L74:
        int[] r332 = this.__workoutConverter.toIntArray(r331);     // Catch: Throwable -> L115
        int r333 = r94;
        if (r2.isNull(r333) == false) goto L78;
        String r340 = null;
    L77:
        r94 = r333;
        float[] r341 = this.__workoutConverter.toFloatArray(r340);     // Catch: Throwable -> L115
        r92 = r328;
        int r342 = r95;
        int r343 = (int) r2.getLong(r342);     // Catch: Throwable -> L115
        r95 = r342;
        int r344 = r96;
        int r345 = (int) r2.getLong(r344);     // Catch: Throwable -> L115
        int r346 = r97;
        int r347 = (int) r2.getLong(r346);     // Catch: Throwable -> L115
        int r348 = r98;
        if (r2.isNull(r348) == false) goto L83;
        String r349 = null;
    L84:
        List<Integer> r350 = this.__workoutConverter.stringToStopWatchList(r349);     // Catch: Throwable -> L115
        int r351 = r99;
        float r352 = (float) r2.getDouble(r351);     // Catch: Throwable -> L115
        r99 = r351;
        int r353 = r100;
        float r354 = (float) r2.getDouble(r353);     // Catch: Throwable -> L115
        int r355 = r101;
        float r356 = (float) r2.getDouble(r355);     // Catch: Throwable -> L115
        int r357 = r102;
        float r358 = (float) r2.getDouble(r357);     // Catch: Throwable -> L115
        int r359 = r103;
        int r360 = (int) r2.getLong(r359);     // Catch: Throwable -> L115
        int r361 = r104;
        int r362 = (int) r2.getLong(r361);     // Catch: Throwable -> L115
        int r363 = r105;
        int r364 = (int) r2.getLong(r363);     // Catch: Throwable -> L115
        int r365 = r106;
        int r366 = (int) r2.getLong(r365);     // Catch: Throwable -> L115
        int r367 = r107;
        int r368 = (int) r2.getLong(r367);     // Catch: Throwable -> L115
        int r369 = r108;
        int r370 = (int) r2.getLong(r369);     // Catch: Throwable -> L115
        int r371 = r109;
        int r372 = (int) r2.getLong(r371);     // Catch: Throwable -> L115
        int r373 = r110;
        int r374 = (int) r2.getLong(r373);     // Catch: Throwable -> L115
        int r375 = r111;
        int r376 = (int) r2.getLong(r375);     // Catch: Throwable -> L115
        int r377 = r112;
        int r378 = (int) r2.getLong(r377);     // Catch: Throwable -> L115
        int r379 = r113;
        int r380 = (int) r2.getLong(r379);     // Catch: Throwable -> L115
        int r381 = r114;
        int r382 = (int) r2.getLong(r381);     // Catch: Throwable -> L115
        int r383 = r115;
        float r384 = (float) r2.getDouble(r383);     // Catch: Throwable -> L115
        int r385 = r116;
        float r386 = (float) r2.getDouble(r385);     // Catch: Throwable -> L115
        int r387 = r117;
        int r388 = (int) r2.getLong(r387);     // Catch: Throwable -> L115
        int r389 = r118;
        int r390 = (int) r2.getLong(r389);     // Catch: Throwable -> L115
        int r391 = r119;
        int r392 = (int) r2.getLong(r391);     // Catch: Throwable -> L115
        int r393 = r120;
        int r394 = (int) r2.getLong(r393);     // Catch: Throwable -> L115
        int r395 = r121;
        float r396 = (float) r2.getDouble(r395);     // Catch: Throwable -> L115
        int r397 = r122;
        if (r2.isNull(r397) == false) goto L88;
        String r398 = null;
    L89:
        float[] r399 = this.__workoutConverter.toFloatArray(r398);     // Catch: Throwable -> L115
        int r400 = r123;
        if (r2.isNull(r400) == false) goto L93;
        String r401 = null;
    L92:
        r123 = r400;
        float[] r402 = this.__workoutConverter.toFloatArray(r401);     // Catch: Throwable -> L115
        int r403 = r124;
        int r404 = (int) r2.getLong(r403);     // Catch: Throwable -> L115
        r124 = r403;
        int r405 = r125;
        int r406 = (int) r2.getLong(r405);     // Catch: Throwable -> L115
        int r407 = r126;
        int r408 = (int) r2.getLong(r407);     // Catch: Throwable -> L115
        int r409 = r127;
        int r411 = (int) r2.getLong(r409);     // Catch: Throwable -> L115
        int r412 = r128;
        int r413 = (int) r2.getLong(r412);     // Catch: Throwable -> L115
        int r414 = r129;
        int r415 = (int) r2.getLong(r414);     // Catch: Throwable -> L115
        int r416 = r130;
        int r417 = (int) r2.getLong(r416);     // Catch: Throwable -> L115
        int r418 = r131;
        int r419 = (int) r2.getLong(r418);     // Catch: Throwable -> L115
        int r420 = r132;
        if (r2.isNull(r420) == false) goto L98;
        String r421 = null;
    L99:
        List<Integer> r422 = this.__workoutConverter.stringToStopWatchList(r421);     // Catch: Throwable -> L115
        r132 = r420;
        int r423 = r133;
        int r424 = (int) r2.getLong(r423);     // Catch: Throwable -> L115
        int r425 = r134;
        if (r2.isNull(r425) == false) goto L103;
        String r426 = null;
    L102:
        r133 = r423;
        List<Float> r427 = this.__workoutConverter.stringToFloatWatch(r426);     // Catch: Throwable -> L115
        r134 = r425;
        int r428 = r135;
        int r429 = (int) r2.getLong(r428);     // Catch: Throwable -> L115
        int r430 = r136;
        long r1310 = r2.getLong(r430);     // Catch: Throwable -> L115
        int r431 = r137;
        int r432 = (int) r2.getLong(r431);     // Catch: Throwable -> L115
        int r433 = r138;
        int r434 = (int) r2.getLong(r433);     // Catch: Throwable -> L115
        int r435 = r139;
        long r1511 = r2.getLong(r435);     // Catch: Throwable -> L115
        int r436 = r140;
        int r437 = (int) r2.getLong(r436);     // Catch: Throwable -> L115
        int r438 = r141;
        int r439 = (int) r2.getLong(r438);     // Catch: Throwable -> L115
        int r440 = r142;
        String r1410 = null;
        long r1311 = r2.getLong(r440);     // Catch: Throwable -> L115
        int r441 = r143;
        int r442 = (int) r2.getLong(r441);     // Catch: Throwable -> L115
        int r443 = r144;
        int r444 = (int) r2.getLong(r443);     // Catch: Throwable -> L115
        int r445 = r145;
        int r446 = (int) r2.getLong(r445);     // Catch: Throwable -> L115
        int r447 = r146;
        int r448 = (int) r2.getLong(r447);     // Catch: Throwable -> L115
        int r449 = r147;
        int r450 = (int) r2.getLong(r449);     // Catch: Throwable -> L115
        int r451 = r148;
        int r452 = (int) r2.getLong(r451);     // Catch: Throwable -> L115
        int r453 = r149;
        float r454 = (float) r2.getDouble(r453);     // Catch: Throwable -> L115
        int r455 = r150;
        float r456 = (float) r2.getDouble(r455);     // Catch: Throwable -> L115
        int r457 = r151;
        int r458 = (int) r2.getLong(r457);     // Catch: Throwable -> L115
        int r459 = r152;
        int r460 = (int) r2.getLong(r459);     // Catch: Throwable -> L115
        int r461 = r153;
        if (r2.isNull(r461) == false) goto L108;
        String r462 = null;
    L109:
        List<Integer> r463 = this.__workoutConverter.stringToStopWatchList(r462);     // Catch: Throwable -> L115
        int r464 = r154;
        int r465 = (int) r2.getLong(r464);     // Catch: Throwable -> L115
        int r466 = r155;
        if (r2.isNull(r466) == false) goto L112;
    L111:
        r155 = r466;
        r154 = r464;
        int r467 = r156;
        r1.add(new Workout(r159, r161, r163, r165, r160, r162, r164, r166, r167, r168, r169, r170, r171, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r1910, r1911, r1912, r1913, r207, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r231, r2010, r2110, r237, r239, r241, r243, r245, r247, r249, r251, r2111, r255, r257, r2210, r261, r263, r2211, r267, r269, r2212, r273, r275, r2310, r279, r281, r2311, r285, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r323, r327, r329, r332, r341, r343, r345, r347, r350, r352, r354, r356, r358, r360, r362, r364, r366, r368, r370, r372, r374, r376, r378, r380, r382, r384, r386, r388, r390, r392, r394, r396, r399, r402, r404, r406, r408, r411, r413, r415, r417, r419, r422, r424, r427, r429, r1310, r432, r434, r1511, r437, r439, r1311, r442, r444, r446, r448, r450, r452, r454, r456, r458, r460, r463, r465, r1410, (int) r2.getLong(r467)));     // Catch: Throwable -> L115
        r156 = r467;
        r153 = r461;
        r3 = r3;
        r7 = r410;
        r48 = r238;
        r49 = r240;
        r50 = r242;
        r51 = r244;
        r52 = r246;
        r53 = r248;
        r54 = r250;
        r55 = r252;
        r56 = r254;
        r58 = r258;
        r59 = r260;
        r61 = r264;
        r62 = r266;
        r64 = r270;
        r65 = r272;
        r67 = r276;
        r68 = r278;
        r70 = r282;
        r71 = r284;
        r93 = r330;
        r96 = r344;
        r97 = r346;
        r98 = r348;
        r100 = r353;
        r101 = r355;
        r102 = r357;
        r103 = r359;
        r104 = r361;
        r105 = r363;
        r106 = r365;
        r107 = r367;
        r108 = r369;
        r109 = r371;
        r110 = r373;
        r111 = r375;
        r112 = r377;
        r113 = r379;
        r114 = r381;
        r115 = r383;
        r116 = r385;
        r117 = r387;
        r118 = r389;
        r119 = r391;
        r120 = r393;
        r121 = r395;
        r122 = r397;
        r125 = r405;
        r126 = r407;
        r127 = r409;
        r128 = r412;
        r129 = r414;
        r130 = r416;
        r135 = r428;
        r131 = r418;
        r139 = r435;
        r141 = r438;
        r142 = r440;
        r144 = r443;
        r145 = r445;
        r146 = r447;
        r147 = r449;
        r148 = r451;
        r149 = r453;
        r150 = r455;
        r151 = r457;
        r5 = r1510;
        r14 = r157;
        r4 = r4;
        r8 = r326;
        r136 = r430;
        r137 = r431;
        r138 = r433;
        r140 = r436;
        r143 = r441;
        r15 = r158;
        r338 = r173;
        r339 = r175;
        r3310 = r177;
        r152 = r459;
        r3311 = r179;
        r16 = r181;
        r17 = r183;
        r18 = r185;
        r19 = r187;
        r20 = r189;
        r21 = r191;
        r22 = r193;
        r23 = r195;
        r24 = r197;
        r25 = r199;
        r26 = r201;
        r27 = r203;
        r33 = r208;
        r34 = r210;
        r35 = r212;
        r36 = r214;
        r37 = r216;
        r38 = r218;
        r39 = r220;
        r40 = r222;
        r41 = r224;
        r42 = r226;
        r43 = r228;
        r44 = r230;
        r45 = r232;
        r6 = r325;
        r47 = r236;
        goto L4
    L112:
        r1410 = r2.getText(r466);     // Catch: Throwable -> L115
        goto L111
    L108:
        r462 = r2.getText(r461);     // Catch: Throwable -> L115
        goto L109
    L103:
        r426 = r2.getText(r425);     // Catch: Throwable -> L115
        goto L102
    L98:
        r421 = r2.getText(r420);     // Catch: Throwable -> L115
        goto L99
    L93:
        r401 = r2.getText(r400);     // Catch: Throwable -> L115
        goto L92
    L88:
        r398 = r2.getText(r397);     // Catch: Throwable -> L115
        goto L89
    L83:
        r349 = r2.getText(r348);     // Catch: Throwable -> L115
        goto L84
    L78:
        r340 = r2.getText(r333);     // Catch: Throwable -> L115
        goto L77
    L73:
        r331 = r2.getText(r330);     // Catch: Throwable -> L115
        goto L74
    L68:
        r283 = r2.getText(r282);     // Catch: Throwable -> L115
        goto L69
    L63:
        r277 = r2.getText(r276);     // Catch: Throwable -> L115
        goto L64
    L58:
        r271 = r2.getText(r270);     // Catch: Throwable -> L115
        goto L59
    L53:
        r265 = r2.getText(r264);     // Catch: Throwable -> L115
        goto L54
    L48:
        r259 = r2.getText(r258);     // Catch: Throwable -> L115
        goto L49
    L43:
        r253 = r2.getText(r252);     // Catch: Throwable -> L115
        goto L44
    L38:
        r235 = r2.getText(r234);     // Catch: Throwable -> L115
        goto L37
    L33:
        r233 = r2.getText(r232);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r31);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r206);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r205);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r28);     // Catch: Throwable -> L115
        goto L13
    L9:
        r165 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getListModeDESC$8(long r332, long r334, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mStart >= ? AND mEnd <= ?  AND mMode == ? AND mIsDelete !=1 ORDER BY mStart DESC");
        r2.mo3338bindLong(1, r332);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r334);     // Catch: Throwable -> L115
        r2.mo3338bindLong(3, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r333 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r335 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r3311 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r155 = r14;
        int r156 = r15;
        int r157 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r159 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r161 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r163 = null;
    L10:
        int r158 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r160 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r162 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r323 = r6;
        int r1510 = r5;
        int r169 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r156);     // Catch: Throwable -> L115
        int r171 = r333;
        int r172 = (int) r2.getLong(r171);     // Catch: Throwable -> L115
        int r173 = r335;
        int r174 = (int) r2.getLong(r173);     // Catch: Throwable -> L115
        int r175 = r338;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r339;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r3310;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r3311;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r16;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r17;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r18;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r19;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r20;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r21;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r22;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r23;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r24;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r25;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        r26 = r26;
        if (r2.isNull(r26) == false) goto L14;
        String r1910 = null;
    L13:
        int r203 = r27;
        if (r2.isNull(r203) == false) goto L19;
        String r1911 = null;
    L18:
        r27 = r203;
        int r204 = r28;
        if (r2.isNull(r204) == false) goto L24;
        String r1912 = null;
    L23:
        r28 = r204;
        r29 = r29;
        if (r2.isNull(r29) == false) goto L28;
        String r1913 = null;
    L29:
        int r205 = (int) r2.getLong(r30);     // Catch: Throwable -> L115
        r30 = r30;
        int r206 = r31;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        int r208 = r32;
        int r209 = (int) r2.getLong(r208);     // Catch: Throwable -> L115
        int r210 = r33;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r34;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r35;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r36;
        float r217 = (float) r2.getDouble(r216);     // Catch: Throwable -> L115
        int r218 = r37;
        float r219 = (float) r2.getDouble(r218);     // Catch: Throwable -> L115
        int r220 = r38;
        int r221 = (int) r2.getLong(r220);     // Catch: Throwable -> L115
        int r222 = r39;
        float r223 = (float) r2.getDouble(r222);     // Catch: Throwable -> L115
        int r224 = r40;
        int r225 = (int) r2.getLong(r224);     // Catch: Throwable -> L115
        int r226 = r41;
        int r227 = (int) r2.getLong(r226);     // Catch: Throwable -> L115
        int r228 = r42;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r43;
        if (r2.isNull(r230) == false) goto L33;
        String r231 = null;
    L34:
        int[] r2010 = this.__workoutConverter.toIntArray(r231);     // Catch: Throwable -> L115
        int r232 = r44;
        if (r2.isNull(r232) == false) goto L38;
        String r233 = null;
    L37:
        r44 = r232;
        int[] r2011 = this.__workoutConverter.toIntArray(r233);     // Catch: Throwable -> L115
        int r234 = r45;
        int r235 = (int) r2.getLong(r234);     // Catch: Throwable -> L115
        int r324 = r8;
        int r236 = r46;
        int r410 = r7;
        int r237 = (int) r2.getLong(r236);     // Catch: Throwable -> L115
        int r238 = r47;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r240 = r48;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r49;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r50;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r51;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r52;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r53;
        if (r2.isNull(r250) == false) goto L43;
        String r251 = null;
    L44:
        List<float[]> r2110 = this.__workoutConverter.floatArrayToWatchList(r251);     // Catch: Throwable -> L115
        int r252 = r54;
        int r253 = (int) r2.getLong(r252);     // Catch: Throwable -> L115
        int r254 = r55;
        int r255 = (int) r2.getLong(r254);     // Catch: Throwable -> L115
        int r256 = r56;
        if (r2.isNull(r256) == false) goto L48;
        String r257 = null;
    L49:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r257);     // Catch: Throwable -> L115
        r55 = r254;
        int r258 = r57;
        int r259 = (int) r2.getLong(r258);     // Catch: Throwable -> L115
        int r260 = r58;
        int r261 = (int) r2.getLong(r260);     // Catch: Throwable -> L115
        int r262 = r59;
        if (r2.isNull(r262) == false) goto L53;
        String r263 = null;
    L54:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r263);     // Catch: Throwable -> L115
        r58 = r260;
        int r264 = r60;
        int r265 = (int) r2.getLong(r264);     // Catch: Throwable -> L115
        int r266 = r61;
        int r267 = (int) r2.getLong(r266);     // Catch: Throwable -> L115
        int r268 = r62;
        if (r2.isNull(r268) == false) goto L58;
        String r269 = null;
    L59:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r269);     // Catch: Throwable -> L115
        r61 = r266;
        int r270 = r63;
        int r271 = (int) r2.getLong(r270);     // Catch: Throwable -> L115
        int r272 = r64;
        int r273 = (int) r2.getLong(r272);     // Catch: Throwable -> L115
        int r274 = r65;
        if (r2.isNull(r274) == false) goto L63;
        String r275 = null;
    L64:
        List<Integer> r2213 = this.__workoutConverter.stringToStopWatchList(r275);     // Catch: Throwable -> L115
        r64 = r272;
        int r276 = r66;
        int r277 = (int) r2.getLong(r276);     // Catch: Throwable -> L115
        int r278 = r67;
        int r279 = (int) r2.getLong(r278);     // Catch: Throwable -> L115
        int r280 = r68;
        if (r2.isNull(r280) == false) goto L68;
        String r281 = null;
    L69:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r281);     // Catch: Throwable -> L115
        r67 = r278;
        int r282 = r69;
        int r283 = (int) r2.getLong(r282);     // Catch: Throwable -> L115
        int r284 = r70;
        int r285 = (int) r2.getLong(r284);     // Catch: Throwable -> L115
        r70 = r284;
        int r286 = r71;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        r71 = r286;
        int r288 = r72;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r72 = r288;
        int r290 = r73;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r73 = r290;
        int r292 = r74;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r74 = r292;
        int r294 = r75;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r75 = r294;
        int r296 = r76;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r76 = r296;
        int r298 = r77;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r77 = r298;
        int r300 = r78;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r78 = r300;
        int r302 = r79;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r79 = r302;
        int r304 = r80;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r80 = r304;
        int r306 = r81;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r81 = r306;
        int r308 = r82;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r82 = r308;
        int r310 = r83;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r83 = r310;
        int r312 = r84;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r84 = r312;
        int r314 = r85;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r85 = r314;
        int r316 = r86;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r86 = r316;
        int r318 = r87;
        float r319 = (float) r2.getDouble(r318);     // Catch: Throwable -> L115
        r87 = r318;
        int r320 = r88;
        int r321 = (int) r2.getLong(r320);     // Catch: Throwable -> L115
        r88 = r320;
        int r322 = r89;
        int r325 = (int) r2.getLong(r322);     // Catch: Throwable -> L115
        r89 = r322;
        int r326 = r90;
        float r327 = (float) r2.getDouble(r326);     // Catch: Throwable -> L115
        int r328 = r91;
        if (r2.isNull(r328) == false) goto L73;
        String r329 = null;
    L74:
        int[] r2510 = this.__workoutConverter.toIntArray(r329);     // Catch: Throwable -> L115
        int r330 = r92;
        if (r2.isNull(r330) == false) goto L78;
        String r331 = null;
    L77:
        r92 = r330;
        float[] r340 = this.__workoutConverter.toFloatArray(r331);     // Catch: Throwable -> L115
        r90 = r326;
        int r341 = r93;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r93 = r341;
        int r343 = r94;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r95;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r96;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r97;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r97 = r350;
        int r352 = r98;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r99;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r100;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r101;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r102;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r103;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r104;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r105;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r106;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r107;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r108;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r109;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r110;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r111;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r112;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r113;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r114;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r115;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r116;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r117;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r118;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r119;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r120;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r121;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r121 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r122;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r122 = r402;
        int r404 = r123;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r124;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r125;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r411 = r126;
        int r412 = (int) r2.getLong(r411);     // Catch: Throwable -> L115
        int r413 = r127;
        int r414 = (int) r2.getLong(r413);     // Catch: Throwable -> L115
        int r415 = r128;
        int r416 = (int) r2.getLong(r415);     // Catch: Throwable -> L115
        int r417 = r129;
        int r418 = (int) r2.getLong(r417);     // Catch: Throwable -> L115
        int r419 = r130;
        if (r2.isNull(r419) == false) goto L98;
        String r420 = null;
    L99:
        List<Integer> r421 = this.__workoutConverter.stringToStopWatchList(r420);     // Catch: Throwable -> L115
        r130 = r419;
        int r422 = r131;
        int r423 = (int) r2.getLong(r422);     // Catch: Throwable -> L115
        int r424 = r132;
        if (r2.isNull(r424) == false) goto L103;
        String r425 = null;
    L102:
        r131 = r422;
        List<Float> r426 = this.__workoutConverter.stringToFloatWatch(r425);     // Catch: Throwable -> L115
        r132 = r424;
        int r427 = r133;
        int r428 = (int) r2.getLong(r427);     // Catch: Throwable -> L115
        int r429 = r134;
        long r1310 = r2.getLong(r429);     // Catch: Throwable -> L115
        int r430 = r135;
        int r431 = (int) r2.getLong(r430);     // Catch: Throwable -> L115
        int r432 = r136;
        int r433 = (int) r2.getLong(r432);     // Catch: Throwable -> L115
        int r434 = r137;
        long r1511 = r2.getLong(r434);     // Catch: Throwable -> L115
        int r435 = r138;
        int r436 = (int) r2.getLong(r435);     // Catch: Throwable -> L115
        int r437 = r139;
        int r438 = (int) r2.getLong(r437);     // Catch: Throwable -> L115
        int r439 = r140;
        String r1410 = null;
        long r1311 = r2.getLong(r439);     // Catch: Throwable -> L115
        int r440 = r141;
        int r441 = (int) r2.getLong(r440);     // Catch: Throwable -> L115
        int r442 = r142;
        int r443 = (int) r2.getLong(r442);     // Catch: Throwable -> L115
        int r444 = r143;
        int r445 = (int) r2.getLong(r444);     // Catch: Throwable -> L115
        int r446 = r144;
        int r447 = (int) r2.getLong(r446);     // Catch: Throwable -> L115
        int r448 = r145;
        int r449 = (int) r2.getLong(r448);     // Catch: Throwable -> L115
        int r450 = r146;
        int r451 = (int) r2.getLong(r450);     // Catch: Throwable -> L115
        int r452 = r147;
        float r453 = (float) r2.getDouble(r452);     // Catch: Throwable -> L115
        int r454 = r148;
        float r455 = (float) r2.getDouble(r454);     // Catch: Throwable -> L115
        int r456 = r149;
        int r457 = (int) r2.getLong(r456);     // Catch: Throwable -> L115
        int r458 = r150;
        int r459 = (int) r2.getLong(r458);     // Catch: Throwable -> L115
        int r460 = r151;
        if (r2.isNull(r460) == false) goto L108;
        String r461 = null;
    L109:
        List<Integer> r462 = this.__workoutConverter.stringToStopWatchList(r461);     // Catch: Throwable -> L115
        int r463 = r152;
        int r464 = (int) r2.getLong(r463);     // Catch: Throwable -> L115
        int r465 = r153;
        if (r2.isNull(r465) == false) goto L112;
    L111:
        r153 = r465;
        r152 = r463;
        int r466 = r154;
        r1.add(new Workout(r157, r159, r161, r163, r158, r160, r162, r164, r165, r166, r167, r168, r169, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r1910, r1911, r1912, r1913, r205, r207, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r2010, r2011, r235, r237, r239, r241, r243, r245, r247, r249, r2110, r253, r255, r2210, r259, r261, r2211, r265, r267, r2212, r271, r273, r2213, r277, r279, r2310, r283, r285, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r325, r327, r2510, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r412, r414, r416, r418, r421, r423, r426, r428, r1310, r431, r433, r1511, r436, r438, r1311, r441, r443, r445, r447, r449, r451, r453, r455, r457, r459, r462, r464, r1410, (int) r2.getLong(r466)));     // Catch: Throwable -> L115
        r154 = r466;
        r151 = r460;
        r3 = r3;
        r7 = r410;
        r46 = r236;
        r47 = r238;
        r48 = r240;
        r49 = r242;
        r50 = r244;
        r51 = r246;
        r52 = r248;
        r53 = r250;
        r54 = r252;
        r56 = r256;
        r57 = r258;
        r59 = r262;
        r60 = r264;
        r62 = r268;
        r63 = r270;
        r65 = r274;
        r66 = r276;
        r68 = r280;
        r69 = r282;
        r91 = r328;
        r94 = r343;
        r95 = r345;
        r96 = r347;
        r98 = r352;
        r99 = r354;
        r100 = r356;
        r101 = r358;
        r102 = r360;
        r103 = r362;
        r104 = r364;
        r105 = r366;
        r106 = r368;
        r107 = r370;
        r108 = r372;
        r109 = r374;
        r110 = r376;
        r111 = r378;
        r112 = r380;
        r113 = r382;
        r114 = r384;
        r115 = r386;
        r116 = r388;
        r117 = r390;
        r118 = r392;
        r119 = r394;
        r120 = r396;
        r123 = r404;
        r124 = r406;
        r125 = r408;
        r126 = r411;
        r127 = r413;
        r128 = r415;
        r133 = r427;
        r129 = r417;
        r137 = r434;
        r139 = r437;
        r140 = r439;
        r142 = r442;
        r143 = r444;
        r144 = r446;
        r145 = r448;
        r146 = r450;
        r147 = r452;
        r148 = r454;
        r149 = r456;
        r5 = r1510;
        r14 = r155;
        r4 = r4;
        r8 = r324;
        r134 = r429;
        r135 = r430;
        r136 = r432;
        r138 = r435;
        r141 = r440;
        r15 = r156;
        r333 = r171;
        r335 = r173;
        r338 = r175;
        r339 = r177;
        r3310 = r179;
        r150 = r458;
        r3311 = r181;
        r16 = r183;
        r17 = r185;
        r18 = r187;
        r19 = r189;
        r20 = r191;
        r21 = r193;
        r22 = r195;
        r23 = r197;
        r24 = r199;
        r25 = r201;
        r31 = r206;
        r32 = r208;
        r33 = r210;
        r34 = r212;
        r35 = r214;
        r36 = r216;
        r37 = r218;
        r38 = r220;
        r39 = r222;
        r40 = r224;
        r41 = r226;
        r42 = r228;
        r43 = r230;
        r6 = r323;
        r45 = r234;
        goto L4
    L112:
        r1410 = r2.getText(r465);     // Catch: Throwable -> L115
        goto L111
    L108:
        r461 = r2.getText(r460);     // Catch: Throwable -> L115
        goto L109
    L103:
        r425 = r2.getText(r424);     // Catch: Throwable -> L115
        goto L102
    L98:
        r420 = r2.getText(r419);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r331 = r2.getText(r330);     // Catch: Throwable -> L115
        goto L77
    L73:
        r329 = r2.getText(r328);     // Catch: Throwable -> L115
        goto L74
    L68:
        r281 = r2.getText(r280);     // Catch: Throwable -> L115
        goto L69
    L63:
        r275 = r2.getText(r274);     // Catch: Throwable -> L115
        goto L64
    L58:
        r269 = r2.getText(r268);     // Catch: Throwable -> L115
        goto L59
    L53:
        r263 = r2.getText(r262);     // Catch: Throwable -> L115
        goto L54
    L48:
        r257 = r2.getText(r256);     // Catch: Throwable -> L115
        goto L49
    L43:
        r251 = r2.getText(r250);     // Catch: Throwable -> L115
        goto L44
    L38:
        r233 = r2.getText(r232);     // Catch: Throwable -> L115
        goto L37
    L33:
        r231 = r2.getText(r230);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r29);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r204);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r203);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r26);     // Catch: Throwable -> L115
        goto L13
    L9:
        r163 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getNavigatorListByMode$12(int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mMode = ? AND mIsDelete != 1   AND mChildNumber != -1 AND mDuration > 0 AND mNavigatorActualDistance > 0 ORDER BY mStart DESC");
        r2.mo3338bindLong(1, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r159 = r14;
        int r160 = r15;
        int r161 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r163 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r165 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r167 = null;
    L10:
        int r162 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r169 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r171 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r172 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r327 = r6;
        int r1510 = r5;
        int r173 = (int) r2.getLong(r159);     // Catch: Throwable -> L115
        int r174 = (int) r2.getLong(r160);     // Catch: Throwable -> L115
        int r175 = r338;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r339;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r16;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r17;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r18;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r19;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r20;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r21;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r22;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r23;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r24;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r25;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r26;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r27;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        int r203 = r28;
        int r204 = (int) r2.getLong(r203);     // Catch: Throwable -> L115
        int r205 = r29;
        int r206 = (int) r2.getLong(r205);     // Catch: Throwable -> L115
        r30 = r30;
        if (r2.isNull(r30) == false) goto L14;
        String r1910 = null;
    L13:
        int r207 = r31;
        if (r2.isNull(r207) == false) goto L19;
        String r1911 = null;
    L18:
        r31 = r207;
        int r208 = r32;
        if (r2.isNull(r208) == false) goto L24;
        String r1912 = null;
    L23:
        r32 = r208;
        r33 = r33;
        if (r2.isNull(r33) == false) goto L28;
        String r1913 = null;
    L29:
        int r209 = (int) r2.getLong(r34);     // Catch: Throwable -> L115
        r34 = r34;
        int r210 = r35;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r36;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r37;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r38;
        int r217 = (int) r2.getLong(r216);     // Catch: Throwable -> L115
        int r218 = r39;
        int r219 = (int) r2.getLong(r218);     // Catch: Throwable -> L115
        int r220 = r40;
        float r221 = (float) r2.getDouble(r220);     // Catch: Throwable -> L115
        int r222 = r41;
        float r223 = (float) r2.getDouble(r222);     // Catch: Throwable -> L115
        int r224 = r42;
        int r225 = (int) r2.getLong(r224);     // Catch: Throwable -> L115
        int r226 = r43;
        float r227 = (float) r2.getDouble(r226);     // Catch: Throwable -> L115
        int r228 = r44;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r45;
        int r231 = (int) r2.getLong(r230);     // Catch: Throwable -> L115
        int r232 = r46;
        int r233 = (int) r2.getLong(r232);     // Catch: Throwable -> L115
        int r234 = r47;
        if (r2.isNull(r234) == false) goto L33;
        String r235 = null;
    L34:
        int[] r2110 = this.__workoutConverter.toIntArray(r235);     // Catch: Throwable -> L115
        int r236 = r48;
        if (r2.isNull(r236) == false) goto L38;
        String r237 = null;
    L37:
        r48 = r236;
        int[] r2111 = this.__workoutConverter.toIntArray(r237);     // Catch: Throwable -> L115
        int r238 = r49;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r328 = r8;
        int r240 = r50;
        int r510 = r7;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r51;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r52;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r53;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r54;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r55;
        int r251 = (int) r2.getLong(r250);     // Catch: Throwable -> L115
        int r252 = r56;
        int r253 = (int) r2.getLong(r252);     // Catch: Throwable -> L115
        int r254 = r57;
        if (r2.isNull(r254) == false) goto L43;
        String r255 = null;
    L44:
        List<float[]> r2210 = this.__workoutConverter.floatArrayToWatchList(r255);     // Catch: Throwable -> L115
        int r256 = r58;
        int r257 = (int) r2.getLong(r256);     // Catch: Throwable -> L115
        int r258 = r59;
        int r259 = (int) r2.getLong(r258);     // Catch: Throwable -> L115
        int r260 = r60;
        if (r2.isNull(r260) == false) goto L48;
        String r261 = null;
    L49:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r261);     // Catch: Throwable -> L115
        r59 = r258;
        int r262 = r61;
        int r263 = (int) r2.getLong(r262);     // Catch: Throwable -> L115
        int r264 = r62;
        int r265 = (int) r2.getLong(r264);     // Catch: Throwable -> L115
        int r266 = r63;
        if (r2.isNull(r266) == false) goto L53;
        String r267 = null;
    L54:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r267);     // Catch: Throwable -> L115
        r62 = r264;
        int r268 = r64;
        int r269 = (int) r2.getLong(r268);     // Catch: Throwable -> L115
        int r270 = r65;
        int r271 = (int) r2.getLong(r270);     // Catch: Throwable -> L115
        int r272 = r66;
        if (r2.isNull(r272) == false) goto L58;
        String r273 = null;
    L59:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r273);     // Catch: Throwable -> L115
        r65 = r270;
        int r274 = r67;
        int r275 = (int) r2.getLong(r274);     // Catch: Throwable -> L115
        int r276 = r68;
        int r277 = (int) r2.getLong(r276);     // Catch: Throwable -> L115
        int r278 = r69;
        if (r2.isNull(r278) == false) goto L63;
        String r279 = null;
    L64:
        List<Integer> r2311 = this.__workoutConverter.stringToStopWatchList(r279);     // Catch: Throwable -> L115
        r68 = r276;
        int r280 = r70;
        int r281 = (int) r2.getLong(r280);     // Catch: Throwable -> L115
        int r282 = r71;
        int r283 = (int) r2.getLong(r282);     // Catch: Throwable -> L115
        int r284 = r72;
        if (r2.isNull(r284) == false) goto L68;
        String r285 = null;
    L69:
        List<Integer> r2312 = this.__workoutConverter.stringToStopWatchList(r285);     // Catch: Throwable -> L115
        r71 = r282;
        int r286 = r73;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        int r288 = r74;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r74 = r288;
        int r290 = r75;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r75 = r290;
        int r292 = r76;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r76 = r292;
        int r294 = r77;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r77 = r294;
        int r296 = r78;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r78 = r296;
        int r298 = r79;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r79 = r298;
        int r300 = r80;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r80 = r300;
        int r302 = r81;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r81 = r302;
        int r304 = r82;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r82 = r304;
        int r306 = r83;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r83 = r306;
        int r308 = r84;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r84 = r308;
        int r310 = r85;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r85 = r310;
        int r312 = r86;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r86 = r312;
        int r314 = r87;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r87 = r314;
        int r316 = r88;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r88 = r316;
        int r318 = r89;
        int r319 = (int) r2.getLong(r318);     // Catch: Throwable -> L115
        r89 = r318;
        int r320 = r90;
        int r321 = (int) r2.getLong(r320);     // Catch: Throwable -> L115
        r90 = r320;
        int r322 = r91;
        float r323 = (float) r2.getDouble(r322);     // Catch: Throwable -> L115
        r91 = r322;
        int r324 = r92;
        int r325 = (int) r2.getLong(r324);     // Catch: Throwable -> L115
        r92 = r324;
        int r326 = r93;
        int r329 = (int) r2.getLong(r326);     // Catch: Throwable -> L115
        r93 = r326;
        int r330 = r94;
        float r331 = (float) r2.getDouble(r330);     // Catch: Throwable -> L115
        int r332 = r95;
        if (r2.isNull(r332) == false) goto L73;
        String r333 = null;
    L74:
        int[] r334 = this.__workoutConverter.toIntArray(r333);     // Catch: Throwable -> L115
        int r335 = r96;
        if (r2.isNull(r335) == false) goto L78;
        String r340 = null;
    L77:
        r96 = r335;
        float[] r341 = this.__workoutConverter.toFloatArray(r340);     // Catch: Throwable -> L115
        r94 = r330;
        int r342 = r97;
        int r343 = (int) r2.getLong(r342);     // Catch: Throwable -> L115
        r97 = r342;
        int r344 = r98;
        int r345 = (int) r2.getLong(r344);     // Catch: Throwable -> L115
        int r346 = r99;
        int r347 = (int) r2.getLong(r346);     // Catch: Throwable -> L115
        int r348 = r100;
        if (r2.isNull(r348) == false) goto L83;
        String r349 = null;
    L84:
        List<Integer> r350 = this.__workoutConverter.stringToStopWatchList(r349);     // Catch: Throwable -> L115
        int r351 = r101;
        float r352 = (float) r2.getDouble(r351);     // Catch: Throwable -> L115
        r101 = r351;
        int r353 = r102;
        float r354 = (float) r2.getDouble(r353);     // Catch: Throwable -> L115
        int r355 = r103;
        float r356 = (float) r2.getDouble(r355);     // Catch: Throwable -> L115
        int r357 = r104;
        float r358 = (float) r2.getDouble(r357);     // Catch: Throwable -> L115
        int r359 = r105;
        int r360 = (int) r2.getLong(r359);     // Catch: Throwable -> L115
        int r361 = r106;
        int r362 = (int) r2.getLong(r361);     // Catch: Throwable -> L115
        int r363 = r107;
        int r364 = (int) r2.getLong(r363);     // Catch: Throwable -> L115
        int r365 = r108;
        int r366 = (int) r2.getLong(r365);     // Catch: Throwable -> L115
        int r367 = r109;
        int r368 = (int) r2.getLong(r367);     // Catch: Throwable -> L115
        int r369 = r110;
        int r370 = (int) r2.getLong(r369);     // Catch: Throwable -> L115
        int r371 = r111;
        int r372 = (int) r2.getLong(r371);     // Catch: Throwable -> L115
        int r373 = r112;
        int r374 = (int) r2.getLong(r373);     // Catch: Throwable -> L115
        int r375 = r113;
        int r376 = (int) r2.getLong(r375);     // Catch: Throwable -> L115
        int r377 = r114;
        int r378 = (int) r2.getLong(r377);     // Catch: Throwable -> L115
        int r379 = r115;
        int r380 = (int) r2.getLong(r379);     // Catch: Throwable -> L115
        int r381 = r116;
        int r382 = (int) r2.getLong(r381);     // Catch: Throwable -> L115
        int r383 = r117;
        float r384 = (float) r2.getDouble(r383);     // Catch: Throwable -> L115
        int r385 = r118;
        float r386 = (float) r2.getDouble(r385);     // Catch: Throwable -> L115
        int r387 = r119;
        int r388 = (int) r2.getLong(r387);     // Catch: Throwable -> L115
        int r389 = r120;
        int r390 = (int) r2.getLong(r389);     // Catch: Throwable -> L115
        int r391 = r121;
        int r392 = (int) r2.getLong(r391);     // Catch: Throwable -> L115
        int r393 = r122;
        int r394 = (int) r2.getLong(r393);     // Catch: Throwable -> L115
        int r395 = r123;
        float r396 = (float) r2.getDouble(r395);     // Catch: Throwable -> L115
        int r397 = r124;
        if (r2.isNull(r397) == false) goto L88;
        String r398 = null;
    L89:
        float[] r399 = this.__workoutConverter.toFloatArray(r398);     // Catch: Throwable -> L115
        int r400 = r125;
        if (r2.isNull(r400) == false) goto L93;
        String r401 = null;
    L92:
        r125 = r400;
        float[] r402 = this.__workoutConverter.toFloatArray(r401);     // Catch: Throwable -> L115
        int r403 = r126;
        int r404 = (int) r2.getLong(r403);     // Catch: Throwable -> L115
        r126 = r403;
        int r405 = r127;
        int r406 = (int) r2.getLong(r405);     // Catch: Throwable -> L115
        int r407 = r128;
        int r408 = (int) r2.getLong(r407);     // Catch: Throwable -> L115
        int r409 = r129;
        int r410 = (int) r2.getLong(r409);     // Catch: Throwable -> L115
        int r411 = r130;
        int r412 = (int) r2.getLong(r411);     // Catch: Throwable -> L115
        int r413 = r131;
        int r414 = (int) r2.getLong(r413);     // Catch: Throwable -> L115
        int r415 = r132;
        int r416 = (int) r2.getLong(r415);     // Catch: Throwable -> L115
        int r417 = r133;
        int r418 = (int) r2.getLong(r417);     // Catch: Throwable -> L115
        int r419 = r134;
        if (r2.isNull(r419) == false) goto L98;
        String r420 = null;
    L99:
        List<Integer> r421 = this.__workoutConverter.stringToStopWatchList(r420);     // Catch: Throwable -> L115
        r134 = r419;
        int r422 = r135;
        int r423 = (int) r2.getLong(r422);     // Catch: Throwable -> L115
        int r424 = r136;
        if (r2.isNull(r424) == false) goto L103;
        String r425 = null;
    L102:
        r135 = r422;
        List<Float> r426 = this.__workoutConverter.stringToFloatWatch(r425);     // Catch: Throwable -> L115
        r136 = r424;
        int r427 = r137;
        int r428 = (int) r2.getLong(r427);     // Catch: Throwable -> L115
        int r429 = r138;
        long r1310 = r2.getLong(r429);     // Catch: Throwable -> L115
        int r430 = r139;
        int r431 = (int) r2.getLong(r430);     // Catch: Throwable -> L115
        int r432 = r140;
        int r433 = (int) r2.getLong(r432);     // Catch: Throwable -> L115
        int r434 = r141;
        long r1610 = r2.getLong(r434);     // Catch: Throwable -> L115
        int r435 = r142;
        int r436 = (int) r2.getLong(r435);     // Catch: Throwable -> L115
        int r437 = r143;
        int r438 = (int) r2.getLong(r437);     // Catch: Throwable -> L115
        int r439 = r144;
        String r1410 = null;
        long r1411 = r2.getLong(r439);     // Catch: Throwable -> L115
        int r440 = r145;
        int r441 = (int) r2.getLong(r440);     // Catch: Throwable -> L115
        int r442 = r146;
        int r443 = (int) r2.getLong(r442);     // Catch: Throwable -> L115
        int r444 = r147;
        int r445 = (int) r2.getLong(r444);     // Catch: Throwable -> L115
        int r446 = r148;
        int r447 = (int) r2.getLong(r446);     // Catch: Throwable -> L115
        int r448 = r149;
        int r449 = (int) r2.getLong(r448);     // Catch: Throwable -> L115
        int r450 = r150;
        int r451 = (int) r2.getLong(r450);     // Catch: Throwable -> L115
        int r452 = r151;
        float r453 = (float) r2.getDouble(r452);     // Catch: Throwable -> L115
        int r454 = r152;
        float r455 = (float) r2.getDouble(r454);     // Catch: Throwable -> L115
        int r456 = r153;
        int r457 = (int) r2.getLong(r456);     // Catch: Throwable -> L115
        int r458 = r154;
        int r459 = (int) r2.getLong(r458);     // Catch: Throwable -> L115
        int r460 = r155;
        if (r2.isNull(r460) == false) goto L108;
        String r461 = null;
    L109:
        List<Integer> r462 = this.__workoutConverter.stringToStopWatchList(r461);     // Catch: Throwable -> L115
        int r463 = r156;
        int r464 = (int) r2.getLong(r463);     // Catch: Throwable -> L115
        int r465 = r157;
        if (r2.isNull(r465) == false) goto L112;
    L111:
        r157 = r465;
        r156 = r463;
        int r466 = r158;
        r1.add(new Workout(r161, r163, r165, r167, r162, r164, r166, r168, r169, r170, r171, r172, r173, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r1910, r1911, r1912, r1913, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r231, r233, r2110, r2111, r239, r241, r243, r245, r247, r249, r251, r253, r2210, r257, r259, r2211, r263, r265, r2212, r269, r271, r2310, r275, r277, r2311, r281, r283, r2312, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r323, r325, r329, r331, r334, r341, r343, r345, r347, r350, r352, r354, r356, r358, r360, r362, r364, r366, r368, r370, r372, r374, r376, r378, r380, r382, r384, r386, r388, r390, r392, r394, r396, r399, r402, r404, r406, r408, r410, r412, r414, r416, r418, r421, r423, r426, r428, r1310, r431, r433, r1610, r436, r438, r1411, r441, r443, r445, r447, r449, r451, r453, r455, r457, r459, r462, r464, r1410, (int) r2.getLong(r466)));     // Catch: Throwable -> L115
        r158 = r466;
        r155 = r460;
        r3 = r3;
        r7 = r510;
        r50 = r240;
        r51 = r242;
        r52 = r244;
        r53 = r246;
        r54 = r248;
        r55 = r250;
        r56 = r252;
        r57 = r254;
        r58 = r256;
        r60 = r260;
        r61 = r262;
        r63 = r266;
        r64 = r268;
        r66 = r272;
        r67 = r274;
        r69 = r278;
        r70 = r280;
        r72 = r284;
        r73 = r286;
        r95 = r332;
        r98 = r344;
        r99 = r346;
        r100 = r348;
        r102 = r353;
        r103 = r355;
        r104 = r357;
        r105 = r359;
        r106 = r361;
        r107 = r363;
        r108 = r365;
        r109 = r367;
        r110 = r369;
        r111 = r371;
        r112 = r373;
        r113 = r375;
        r114 = r377;
        r115 = r379;
        r116 = r381;
        r117 = r383;
        r118 = r385;
        r119 = r387;
        r120 = r389;
        r121 = r391;
        r122 = r393;
        r123 = r395;
        r124 = r397;
        r127 = r405;
        r128 = r407;
        r129 = r409;
        r130 = r411;
        r131 = r413;
        r132 = r415;
        r137 = r427;
        r133 = r417;
        r141 = r434;
        r143 = r437;
        r144 = r439;
        r146 = r442;
        r147 = r444;
        r148 = r446;
        r149 = r448;
        r150 = r450;
        r151 = r452;
        r152 = r454;
        r153 = r456;
        r5 = r1510;
        r14 = r159;
        r4 = r4;
        r8 = r328;
        r138 = r429;
        r139 = r430;
        r140 = r432;
        r142 = r435;
        r145 = r440;
        r15 = r160;
        r338 = r175;
        r154 = r458;
        r339 = r177;
        r16 = r179;
        r17 = r181;
        r18 = r183;
        r19 = r185;
        r20 = r187;
        r21 = r189;
        r22 = r191;
        r23 = r193;
        r24 = r195;
        r25 = r197;
        r26 = r199;
        r27 = r201;
        r28 = r203;
        r29 = r205;
        r35 = r210;
        r36 = r212;
        r37 = r214;
        r38 = r216;
        r39 = r218;
        r40 = r220;
        r41 = r222;
        r42 = r224;
        r43 = r226;
        r44 = r228;
        r45 = r230;
        r46 = r232;
        r47 = r234;
        r6 = r327;
        r49 = r238;
        goto L4
    L112:
        r1410 = r2.getText(r465);     // Catch: Throwable -> L115
        goto L111
    L108:
        r461 = r2.getText(r460);     // Catch: Throwable -> L115
        goto L109
    L103:
        r425 = r2.getText(r424);     // Catch: Throwable -> L115
        goto L102
    L98:
        r420 = r2.getText(r419);     // Catch: Throwable -> L115
        goto L99
    L93:
        r401 = r2.getText(r400);     // Catch: Throwable -> L115
        goto L92
    L88:
        r398 = r2.getText(r397);     // Catch: Throwable -> L115
        goto L89
    L83:
        r349 = r2.getText(r348);     // Catch: Throwable -> L115
        goto L84
    L78:
        r340 = r2.getText(r335);     // Catch: Throwable -> L115
        goto L77
    L73:
        r333 = r2.getText(r332);     // Catch: Throwable -> L115
        goto L74
    L68:
        r285 = r2.getText(r284);     // Catch: Throwable -> L115
        goto L69
    L63:
        r279 = r2.getText(r278);     // Catch: Throwable -> L115
        goto L64
    L58:
        r273 = r2.getText(r272);     // Catch: Throwable -> L115
        goto L59
    L53:
        r267 = r2.getText(r266);     // Catch: Throwable -> L115
        goto L54
    L48:
        r261 = r2.getText(r260);     // Catch: Throwable -> L115
        goto L49
    L43:
        r255 = r2.getText(r254);     // Catch: Throwable -> L115
        goto L44
    L38:
        r237 = r2.getText(r236);     // Catch: Throwable -> L115
        goto L37
    L33:
        r235 = r2.getText(r234);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r33);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r208);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r207);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r30);     // Catch: Throwable -> L115
        goto L13
    L9:
        r167 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ List lambda$getNavigatorListModeDESC$11(long r332, long r334, int r336, SQLiteConnection r337) {
        SQLiteStatement r2 = r337.prepare("SELECT * FROM Workout WHERE mStart >= ? AND mEnd <= ?  AND mChildNumber != -1  AND mMode == ?  AND mNavigatorActualDistance > 0 AND mDuration > 0 AND mIsDelete !=1 ORDER BY mStart DESC");
        r2.mo3338bindLong(1, r332);     // Catch: Throwable -> L115
        r2.mo3338bindLong(2, r334);     // Catch: Throwable -> L115
        r2.mo3338bindLong(3, r336);     // Catch: Throwable -> L115
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L115
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L115
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L115
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L115
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L115
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L115
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L115
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L115
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L115
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L115
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L115
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L115
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L115
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L115
        int r333 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L115
        int r335 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L115
        int r338 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L115
        int r339 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L115
        int r3310 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L115
        int r3311 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L115
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L115
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L115
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L115
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L115
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L115
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L115
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L115
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L115
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L115
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L115
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L115
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L115
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L115
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L115
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L115
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L115
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L115
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L115
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L115
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L115
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L115
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L115
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L115
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L115
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L115
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L115
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L115
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L115
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L115
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L115
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L115
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L115
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L115
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L115
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L115
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L115
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L115
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L115
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L115
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L115
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L115
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L115
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L115
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L115
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L115
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L115
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L115
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L115
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L115
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L115
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L115
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L115
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L115
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L115
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L115
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L115
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L115
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L115
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L115
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L115
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L115
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L115
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L115
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L115
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L115
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L115
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L115
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L115
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L115
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L115
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L115
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L115
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L115
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L115
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L115
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L115
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L115
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L115
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L115
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L115
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L115
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L115
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L115
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L115
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L115
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L115
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L115
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L115
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L115
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L115
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L115
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L115
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L115
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L115
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L115
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L115
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L115
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L115
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L115
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L115
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L115
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L115
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L115
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L115
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L115
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L115
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L115
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L115
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L115
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L115
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L115
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L115
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L115
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L115
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L115
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L115
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L115
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L115
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L115
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L115
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L115
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L115
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L115
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L115
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L115
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L115
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L115
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L115
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L115
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L115
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L115
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L115
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L115
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L115
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L115
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L115
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L115
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L115
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L115
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L115
    L4:
        if (r2.step() == false) goto L117;
        int r155 = r14;
        int r156 = r15;
        int r157 = (int) r2.getLong(r0);     // Catch: Throwable -> L115
        long r159 = r2.getLong(r3);     // Catch: Throwable -> L115
        long r161 = r2.getLong(r4);     // Catch: Throwable -> L115
        if (r2.isNull(r5) == false) goto L9;
        String r163 = null;
    L10:
        int r158 = (int) r2.getLong(r6);     // Catch: Throwable -> L115
        int r160 = (int) r2.getLong(r7);     // Catch: Throwable -> L115
        int r162 = (int) r2.getLong(r8);     // Catch: Throwable -> L115
        int r164 = (int) r2.getLong(r9);     // Catch: Throwable -> L115
        int r165 = (int) r2.getLong(r10);     // Catch: Throwable -> L115
        int r166 = (int) r2.getLong(r11);     // Catch: Throwable -> L115
        int r167 = (int) r2.getLong(r12);     // Catch: Throwable -> L115
        int r168 = (int) r2.getLong(r13);     // Catch: Throwable -> L115
        int r323 = r6;
        int r1510 = r5;
        int r169 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        int r170 = (int) r2.getLong(r156);     // Catch: Throwable -> L115
        int r171 = r333;
        int r172 = (int) r2.getLong(r171);     // Catch: Throwable -> L115
        int r173 = r335;
        int r174 = (int) r2.getLong(r173);     // Catch: Throwable -> L115
        int r175 = r338;
        int r176 = (int) r2.getLong(r175);     // Catch: Throwable -> L115
        int r177 = r339;
        int r178 = (int) r2.getLong(r177);     // Catch: Throwable -> L115
        int r179 = r3310;
        int r180 = (int) r2.getLong(r179);     // Catch: Throwable -> L115
        int r181 = r3311;
        int r182 = (int) r2.getLong(r181);     // Catch: Throwable -> L115
        int r183 = r16;
        int r184 = (int) r2.getLong(r183);     // Catch: Throwable -> L115
        int r185 = r17;
        int r186 = (int) r2.getLong(r185);     // Catch: Throwable -> L115
        int r187 = r18;
        int r188 = (int) r2.getLong(r187);     // Catch: Throwable -> L115
        int r189 = r19;
        int r190 = (int) r2.getLong(r189);     // Catch: Throwable -> L115
        int r191 = r20;
        int r192 = (int) r2.getLong(r191);     // Catch: Throwable -> L115
        int r193 = r21;
        int r194 = (int) r2.getLong(r193);     // Catch: Throwable -> L115
        int r195 = r22;
        int r196 = (int) r2.getLong(r195);     // Catch: Throwable -> L115
        int r197 = r23;
        int r198 = (int) r2.getLong(r197);     // Catch: Throwable -> L115
        int r199 = r24;
        int r200 = (int) r2.getLong(r199);     // Catch: Throwable -> L115
        int r201 = r25;
        int r202 = (int) r2.getLong(r201);     // Catch: Throwable -> L115
        r26 = r26;
        if (r2.isNull(r26) == false) goto L14;
        String r1910 = null;
    L13:
        int r203 = r27;
        if (r2.isNull(r203) == false) goto L19;
        String r1911 = null;
    L18:
        r27 = r203;
        int r204 = r28;
        if (r2.isNull(r204) == false) goto L24;
        String r1912 = null;
    L23:
        r28 = r204;
        r29 = r29;
        if (r2.isNull(r29) == false) goto L28;
        String r1913 = null;
    L29:
        int r205 = (int) r2.getLong(r30);     // Catch: Throwable -> L115
        r30 = r30;
        int r206 = r31;
        int r207 = (int) r2.getLong(r206);     // Catch: Throwable -> L115
        int r208 = r32;
        int r209 = (int) r2.getLong(r208);     // Catch: Throwable -> L115
        int r210 = r33;
        int r211 = (int) r2.getLong(r210);     // Catch: Throwable -> L115
        int r212 = r34;
        int r213 = (int) r2.getLong(r212);     // Catch: Throwable -> L115
        int r214 = r35;
        int r215 = (int) r2.getLong(r214);     // Catch: Throwable -> L115
        int r216 = r36;
        float r217 = (float) r2.getDouble(r216);     // Catch: Throwable -> L115
        int r218 = r37;
        float r219 = (float) r2.getDouble(r218);     // Catch: Throwable -> L115
        int r220 = r38;
        int r221 = (int) r2.getLong(r220);     // Catch: Throwable -> L115
        int r222 = r39;
        float r223 = (float) r2.getDouble(r222);     // Catch: Throwable -> L115
        int r224 = r40;
        int r225 = (int) r2.getLong(r224);     // Catch: Throwable -> L115
        int r226 = r41;
        int r227 = (int) r2.getLong(r226);     // Catch: Throwable -> L115
        int r228 = r42;
        int r229 = (int) r2.getLong(r228);     // Catch: Throwable -> L115
        int r230 = r43;
        if (r2.isNull(r230) == false) goto L33;
        String r231 = null;
    L34:
        int[] r2010 = this.__workoutConverter.toIntArray(r231);     // Catch: Throwable -> L115
        int r232 = r44;
        if (r2.isNull(r232) == false) goto L38;
        String r233 = null;
    L37:
        r44 = r232;
        int[] r2011 = this.__workoutConverter.toIntArray(r233);     // Catch: Throwable -> L115
        int r234 = r45;
        int r235 = (int) r2.getLong(r234);     // Catch: Throwable -> L115
        int r324 = r8;
        int r236 = r46;
        int r410 = r7;
        int r237 = (int) r2.getLong(r236);     // Catch: Throwable -> L115
        int r238 = r47;
        int r239 = (int) r2.getLong(r238);     // Catch: Throwable -> L115
        int r240 = r48;
        int r241 = (int) r2.getLong(r240);     // Catch: Throwable -> L115
        int r242 = r49;
        int r243 = (int) r2.getLong(r242);     // Catch: Throwable -> L115
        int r244 = r50;
        int r245 = (int) r2.getLong(r244);     // Catch: Throwable -> L115
        int r246 = r51;
        int r247 = (int) r2.getLong(r246);     // Catch: Throwable -> L115
        int r248 = r52;
        int r249 = (int) r2.getLong(r248);     // Catch: Throwable -> L115
        int r250 = r53;
        if (r2.isNull(r250) == false) goto L43;
        String r251 = null;
    L44:
        List<float[]> r2110 = this.__workoutConverter.floatArrayToWatchList(r251);     // Catch: Throwable -> L115
        int r252 = r54;
        int r253 = (int) r2.getLong(r252);     // Catch: Throwable -> L115
        int r254 = r55;
        int r255 = (int) r2.getLong(r254);     // Catch: Throwable -> L115
        int r256 = r56;
        if (r2.isNull(r256) == false) goto L48;
        String r257 = null;
    L49:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r257);     // Catch: Throwable -> L115
        r55 = r254;
        int r258 = r57;
        int r259 = (int) r2.getLong(r258);     // Catch: Throwable -> L115
        int r260 = r58;
        int r261 = (int) r2.getLong(r260);     // Catch: Throwable -> L115
        int r262 = r59;
        if (r2.isNull(r262) == false) goto L53;
        String r263 = null;
    L54:
        List<Integer> r2211 = this.__workoutConverter.stringToStopWatchList(r263);     // Catch: Throwable -> L115
        r58 = r260;
        int r264 = r60;
        int r265 = (int) r2.getLong(r264);     // Catch: Throwable -> L115
        int r266 = r61;
        int r267 = (int) r2.getLong(r266);     // Catch: Throwable -> L115
        int r268 = r62;
        if (r2.isNull(r268) == false) goto L58;
        String r269 = null;
    L59:
        List<Integer> r2212 = this.__workoutConverter.stringToStopWatchList(r269);     // Catch: Throwable -> L115
        r61 = r266;
        int r270 = r63;
        int r271 = (int) r2.getLong(r270);     // Catch: Throwable -> L115
        int r272 = r64;
        int r273 = (int) r2.getLong(r272);     // Catch: Throwable -> L115
        int r274 = r65;
        if (r2.isNull(r274) == false) goto L63;
        String r275 = null;
    L64:
        List<Integer> r2213 = this.__workoutConverter.stringToStopWatchList(r275);     // Catch: Throwable -> L115
        r64 = r272;
        int r276 = r66;
        int r277 = (int) r2.getLong(r276);     // Catch: Throwable -> L115
        int r278 = r67;
        int r279 = (int) r2.getLong(r278);     // Catch: Throwable -> L115
        int r280 = r68;
        if (r2.isNull(r280) == false) goto L68;
        String r281 = null;
    L69:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r281);     // Catch: Throwable -> L115
        r67 = r278;
        int r282 = r69;
        int r283 = (int) r2.getLong(r282);     // Catch: Throwable -> L115
        int r284 = r70;
        int r285 = (int) r2.getLong(r284);     // Catch: Throwable -> L115
        r70 = r284;
        int r286 = r71;
        int r287 = (int) r2.getLong(r286);     // Catch: Throwable -> L115
        r71 = r286;
        int r288 = r72;
        int r289 = (int) r2.getLong(r288);     // Catch: Throwable -> L115
        r72 = r288;
        int r290 = r73;
        int r291 = (int) r2.getLong(r290);     // Catch: Throwable -> L115
        r73 = r290;
        int r292 = r74;
        int r293 = (int) r2.getLong(r292);     // Catch: Throwable -> L115
        r74 = r292;
        int r294 = r75;
        int r295 = (int) r2.getLong(r294);     // Catch: Throwable -> L115
        r75 = r294;
        int r296 = r76;
        int r297 = (int) r2.getLong(r296);     // Catch: Throwable -> L115
        r76 = r296;
        int r298 = r77;
        int r299 = (int) r2.getLong(r298);     // Catch: Throwable -> L115
        r77 = r298;
        int r300 = r78;
        int r301 = (int) r2.getLong(r300);     // Catch: Throwable -> L115
        r78 = r300;
        int r302 = r79;
        int r303 = (int) r2.getLong(r302);     // Catch: Throwable -> L115
        r79 = r302;
        int r304 = r80;
        int r305 = (int) r2.getLong(r304);     // Catch: Throwable -> L115
        r80 = r304;
        int r306 = r81;
        int r307 = (int) r2.getLong(r306);     // Catch: Throwable -> L115
        r81 = r306;
        int r308 = r82;
        int r309 = (int) r2.getLong(r308);     // Catch: Throwable -> L115
        r82 = r308;
        int r310 = r83;
        int r311 = (int) r2.getLong(r310);     // Catch: Throwable -> L115
        r83 = r310;
        int r312 = r84;
        int r313 = (int) r2.getLong(r312);     // Catch: Throwable -> L115
        r84 = r312;
        int r314 = r85;
        int r315 = (int) r2.getLong(r314);     // Catch: Throwable -> L115
        r85 = r314;
        int r316 = r86;
        int r317 = (int) r2.getLong(r316);     // Catch: Throwable -> L115
        r86 = r316;
        int r318 = r87;
        float r319 = (float) r2.getDouble(r318);     // Catch: Throwable -> L115
        r87 = r318;
        int r320 = r88;
        int r321 = (int) r2.getLong(r320);     // Catch: Throwable -> L115
        r88 = r320;
        int r322 = r89;
        int r325 = (int) r2.getLong(r322);     // Catch: Throwable -> L115
        r89 = r322;
        int r326 = r90;
        float r327 = (float) r2.getDouble(r326);     // Catch: Throwable -> L115
        int r328 = r91;
        if (r2.isNull(r328) == false) goto L73;
        String r329 = null;
    L74:
        int[] r2510 = this.__workoutConverter.toIntArray(r329);     // Catch: Throwable -> L115
        int r330 = r92;
        if (r2.isNull(r330) == false) goto L78;
        String r331 = null;
    L77:
        r92 = r330;
        float[] r340 = this.__workoutConverter.toFloatArray(r331);     // Catch: Throwable -> L115
        r90 = r326;
        int r341 = r93;
        int r342 = (int) r2.getLong(r341);     // Catch: Throwable -> L115
        r93 = r341;
        int r343 = r94;
        int r344 = (int) r2.getLong(r343);     // Catch: Throwable -> L115
        int r345 = r95;
        int r346 = (int) r2.getLong(r345);     // Catch: Throwable -> L115
        int r347 = r96;
        if (r2.isNull(r347) == false) goto L83;
        String r348 = null;
    L84:
        List<Integer> r349 = this.__workoutConverter.stringToStopWatchList(r348);     // Catch: Throwable -> L115
        int r350 = r97;
        float r351 = (float) r2.getDouble(r350);     // Catch: Throwable -> L115
        r97 = r350;
        int r352 = r98;
        float r353 = (float) r2.getDouble(r352);     // Catch: Throwable -> L115
        int r354 = r99;
        float r355 = (float) r2.getDouble(r354);     // Catch: Throwable -> L115
        int r356 = r100;
        float r357 = (float) r2.getDouble(r356);     // Catch: Throwable -> L115
        int r358 = r101;
        int r359 = (int) r2.getLong(r358);     // Catch: Throwable -> L115
        int r360 = r102;
        int r361 = (int) r2.getLong(r360);     // Catch: Throwable -> L115
        int r362 = r103;
        int r363 = (int) r2.getLong(r362);     // Catch: Throwable -> L115
        int r364 = r104;
        int r365 = (int) r2.getLong(r364);     // Catch: Throwable -> L115
        int r366 = r105;
        int r367 = (int) r2.getLong(r366);     // Catch: Throwable -> L115
        int r368 = r106;
        int r369 = (int) r2.getLong(r368);     // Catch: Throwable -> L115
        int r370 = r107;
        int r371 = (int) r2.getLong(r370);     // Catch: Throwable -> L115
        int r372 = r108;
        int r373 = (int) r2.getLong(r372);     // Catch: Throwable -> L115
        int r374 = r109;
        int r375 = (int) r2.getLong(r374);     // Catch: Throwable -> L115
        int r376 = r110;
        int r377 = (int) r2.getLong(r376);     // Catch: Throwable -> L115
        int r378 = r111;
        int r379 = (int) r2.getLong(r378);     // Catch: Throwable -> L115
        int r380 = r112;
        int r381 = (int) r2.getLong(r380);     // Catch: Throwable -> L115
        int r382 = r113;
        float r383 = (float) r2.getDouble(r382);     // Catch: Throwable -> L115
        int r384 = r114;
        float r385 = (float) r2.getDouble(r384);     // Catch: Throwable -> L115
        int r386 = r115;
        int r387 = (int) r2.getLong(r386);     // Catch: Throwable -> L115
        int r388 = r116;
        int r389 = (int) r2.getLong(r388);     // Catch: Throwable -> L115
        int r390 = r117;
        int r391 = (int) r2.getLong(r390);     // Catch: Throwable -> L115
        int r392 = r118;
        int r393 = (int) r2.getLong(r392);     // Catch: Throwable -> L115
        int r394 = r119;
        float r395 = (float) r2.getDouble(r394);     // Catch: Throwable -> L115
        int r396 = r120;
        if (r2.isNull(r396) == false) goto L88;
        String r397 = null;
    L89:
        float[] r398 = this.__workoutConverter.toFloatArray(r397);     // Catch: Throwable -> L115
        int r399 = r121;
        if (r2.isNull(r399) == false) goto L93;
        String r400 = null;
    L92:
        r121 = r399;
        float[] r401 = this.__workoutConverter.toFloatArray(r400);     // Catch: Throwable -> L115
        int r402 = r122;
        int r403 = (int) r2.getLong(r402);     // Catch: Throwable -> L115
        r122 = r402;
        int r404 = r123;
        int r405 = (int) r2.getLong(r404);     // Catch: Throwable -> L115
        int r406 = r124;
        int r407 = (int) r2.getLong(r406);     // Catch: Throwable -> L115
        int r408 = r125;
        int r409 = (int) r2.getLong(r408);     // Catch: Throwable -> L115
        int r411 = r126;
        int r412 = (int) r2.getLong(r411);     // Catch: Throwable -> L115
        int r413 = r127;
        int r414 = (int) r2.getLong(r413);     // Catch: Throwable -> L115
        int r415 = r128;
        int r416 = (int) r2.getLong(r415);     // Catch: Throwable -> L115
        int r417 = r129;
        int r418 = (int) r2.getLong(r417);     // Catch: Throwable -> L115
        int r419 = r130;
        if (r2.isNull(r419) == false) goto L98;
        String r420 = null;
    L99:
        List<Integer> r421 = this.__workoutConverter.stringToStopWatchList(r420);     // Catch: Throwable -> L115
        r130 = r419;
        int r422 = r131;
        int r423 = (int) r2.getLong(r422);     // Catch: Throwable -> L115
        int r424 = r132;
        if (r2.isNull(r424) == false) goto L103;
        String r425 = null;
    L102:
        r131 = r422;
        List<Float> r426 = this.__workoutConverter.stringToFloatWatch(r425);     // Catch: Throwable -> L115
        r132 = r424;
        int r427 = r133;
        int r428 = (int) r2.getLong(r427);     // Catch: Throwable -> L115
        int r429 = r134;
        long r1310 = r2.getLong(r429);     // Catch: Throwable -> L115
        int r430 = r135;
        int r431 = (int) r2.getLong(r430);     // Catch: Throwable -> L115
        int r432 = r136;
        int r433 = (int) r2.getLong(r432);     // Catch: Throwable -> L115
        int r434 = r137;
        long r1511 = r2.getLong(r434);     // Catch: Throwable -> L115
        int r435 = r138;
        int r436 = (int) r2.getLong(r435);     // Catch: Throwable -> L115
        int r437 = r139;
        int r438 = (int) r2.getLong(r437);     // Catch: Throwable -> L115
        int r439 = r140;
        String r1410 = null;
        long r1311 = r2.getLong(r439);     // Catch: Throwable -> L115
        int r440 = r141;
        int r441 = (int) r2.getLong(r440);     // Catch: Throwable -> L115
        int r442 = r142;
        int r443 = (int) r2.getLong(r442);     // Catch: Throwable -> L115
        int r444 = r143;
        int r445 = (int) r2.getLong(r444);     // Catch: Throwable -> L115
        int r446 = r144;
        int r447 = (int) r2.getLong(r446);     // Catch: Throwable -> L115
        int r448 = r145;
        int r449 = (int) r2.getLong(r448);     // Catch: Throwable -> L115
        int r450 = r146;
        int r451 = (int) r2.getLong(r450);     // Catch: Throwable -> L115
        int r452 = r147;
        float r453 = (float) r2.getDouble(r452);     // Catch: Throwable -> L115
        int r454 = r148;
        float r455 = (float) r2.getDouble(r454);     // Catch: Throwable -> L115
        int r456 = r149;
        int r457 = (int) r2.getLong(r456);     // Catch: Throwable -> L115
        int r458 = r150;
        int r459 = (int) r2.getLong(r458);     // Catch: Throwable -> L115
        int r460 = r151;
        if (r2.isNull(r460) == false) goto L108;
        String r461 = null;
    L109:
        List<Integer> r462 = this.__workoutConverter.stringToStopWatchList(r461);     // Catch: Throwable -> L115
        int r463 = r152;
        int r464 = (int) r2.getLong(r463);     // Catch: Throwable -> L115
        int r465 = r153;
        if (r2.isNull(r465) == false) goto L112;
    L111:
        r153 = r465;
        r152 = r463;
        int r466 = r154;
        r1.add(new Workout(r157, r159, r161, r163, r158, r160, r162, r164, r165, r166, r167, r168, r169, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r1910, r1911, r1912, r1913, r205, r207, r209, r211, r213, r215, r217, r219, r221, r223, r225, r227, r229, r2010, r2011, r235, r237, r239, r241, r243, r245, r247, r249, r2110, r253, r255, r2210, r259, r261, r2211, r265, r267, r2212, r271, r273, r2213, r277, r279, r2310, r283, r285, r287, r289, r291, r293, r295, r297, r299, r301, r303, r305, r307, r309, r311, r313, r315, r317, r319, r321, r325, r327, r2510, r340, r342, r344, r346, r349, r351, r353, r355, r357, r359, r361, r363, r365, r367, r369, r371, r373, r375, r377, r379, r381, r383, r385, r387, r389, r391, r393, r395, r398, r401, r403, r405, r407, r409, r412, r414, r416, r418, r421, r423, r426, r428, r1310, r431, r433, r1511, r436, r438, r1311, r441, r443, r445, r447, r449, r451, r453, r455, r457, r459, r462, r464, r1410, (int) r2.getLong(r466)));     // Catch: Throwable -> L115
        r154 = r466;
        r151 = r460;
        r3 = r3;
        r7 = r410;
        r46 = r236;
        r47 = r238;
        r48 = r240;
        r49 = r242;
        r50 = r244;
        r51 = r246;
        r52 = r248;
        r53 = r250;
        r54 = r252;
        r56 = r256;
        r57 = r258;
        r59 = r262;
        r60 = r264;
        r62 = r268;
        r63 = r270;
        r65 = r274;
        r66 = r276;
        r68 = r280;
        r69 = r282;
        r91 = r328;
        r94 = r343;
        r95 = r345;
        r96 = r347;
        r98 = r352;
        r99 = r354;
        r100 = r356;
        r101 = r358;
        r102 = r360;
        r103 = r362;
        r104 = r364;
        r105 = r366;
        r106 = r368;
        r107 = r370;
        r108 = r372;
        r109 = r374;
        r110 = r376;
        r111 = r378;
        r112 = r380;
        r113 = r382;
        r114 = r384;
        r115 = r386;
        r116 = r388;
        r117 = r390;
        r118 = r392;
        r119 = r394;
        r120 = r396;
        r123 = r404;
        r124 = r406;
        r125 = r408;
        r126 = r411;
        r127 = r413;
        r128 = r415;
        r133 = r427;
        r129 = r417;
        r137 = r434;
        r139 = r437;
        r140 = r439;
        r142 = r442;
        r143 = r444;
        r144 = r446;
        r145 = r448;
        r146 = r450;
        r147 = r452;
        r148 = r454;
        r149 = r456;
        r5 = r1510;
        r14 = r155;
        r4 = r4;
        r8 = r324;
        r134 = r429;
        r135 = r430;
        r136 = r432;
        r138 = r435;
        r141 = r440;
        r15 = r156;
        r333 = r171;
        r335 = r173;
        r338 = r175;
        r339 = r177;
        r3310 = r179;
        r150 = r458;
        r3311 = r181;
        r16 = r183;
        r17 = r185;
        r18 = r187;
        r19 = r189;
        r20 = r191;
        r21 = r193;
        r22 = r195;
        r23 = r197;
        r24 = r199;
        r25 = r201;
        r31 = r206;
        r32 = r208;
        r33 = r210;
        r34 = r212;
        r35 = r214;
        r36 = r216;
        r37 = r218;
        r38 = r220;
        r39 = r222;
        r40 = r224;
        r41 = r226;
        r42 = r228;
        r43 = r230;
        r6 = r323;
        r45 = r234;
        goto L4
    L112:
        r1410 = r2.getText(r465);     // Catch: Throwable -> L115
        goto L111
    L108:
        r461 = r2.getText(r460);     // Catch: Throwable -> L115
        goto L109
    L103:
        r425 = r2.getText(r424);     // Catch: Throwable -> L115
        goto L102
    L98:
        r420 = r2.getText(r419);     // Catch: Throwable -> L115
        goto L99
    L93:
        r400 = r2.getText(r399);     // Catch: Throwable -> L115
        goto L92
    L88:
        r397 = r2.getText(r396);     // Catch: Throwable -> L115
        goto L89
    L83:
        r348 = r2.getText(r347);     // Catch: Throwable -> L115
        goto L84
    L78:
        r331 = r2.getText(r330);     // Catch: Throwable -> L115
        goto L77
    L73:
        r329 = r2.getText(r328);     // Catch: Throwable -> L115
        goto L74
    L68:
        r281 = r2.getText(r280);     // Catch: Throwable -> L115
        goto L69
    L63:
        r275 = r2.getText(r274);     // Catch: Throwable -> L115
        goto L64
    L58:
        r269 = r2.getText(r268);     // Catch: Throwable -> L115
        goto L59
    L53:
        r263 = r2.getText(r262);     // Catch: Throwable -> L115
        goto L54
    L48:
        r257 = r2.getText(r256);     // Catch: Throwable -> L115
        goto L49
    L43:
        r251 = r2.getText(r250);     // Catch: Throwable -> L115
        goto L44
    L38:
        r233 = r2.getText(r232);     // Catch: Throwable -> L115
        goto L37
    L33:
        r231 = r2.getText(r230);     // Catch: Throwable -> L115
        goto L34
    L28:
        r1913 = r2.getText(r29);     // Catch: Throwable -> L115
        goto L29
    L24:
        r1912 = r2.getText(r204);     // Catch: Throwable -> L115
        goto L23
    L19:
        r1911 = r2.getText(r203);     // Catch: Throwable -> L115
        goto L18
    L14:
        r1910 = r2.getText(r26);     // Catch: Throwable -> L115
        goto L13
    L9:
        r163 = r2.getText(r5);     // Catch: Throwable -> L115
        goto L10
    L117:
        r2.close();
        return r1;
    L115:
        th = move-exception;
        r2.close();
        throw th;
    }

    private /* synthetic */ Workout lambda$getWorkout$13(long r324, long r326, SQLiteConnection r328) {
        SQLiteStatement r2 = r328.prepare("SELECT * FROM Workout WHERE mStart = ? AND mEnd = ?");
        r2.mo3338bindLong(1, r324);     // Catch: Throwable -> L117
        r2.mo3338bindLong(2, r326);     // Catch: Throwable -> L117
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L117
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L117
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L117
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L117
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L117
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L117
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L117
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L117
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L117
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L117
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L117
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L117
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L117
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L117
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L117
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L117
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L117
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L117
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L117
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L117
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L117
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L117
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L117
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L117
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L117
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L117
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L117
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L117
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L117
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L117
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L117
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L117
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L117
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L117
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L117
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L117
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L117
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L117
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L117
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L117
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L117
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L117
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L117
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L117
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L117
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L117
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L117
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L117
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L117
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L117
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L117
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L117
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L117
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L117
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L117
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L117
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L117
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L117
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L117
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L117
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L117
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L117
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L117
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L117
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L117
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L117
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L117
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L117
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L117
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L117
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L117
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L117
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L117
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L117
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L117
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L117
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L117
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L117
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L117
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L117
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L117
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L117
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L117
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L117
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L117
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L117
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L117
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L117
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L117
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L117
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L117
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L117
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L117
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L117
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L117
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L117
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L117
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L117
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L117
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L117
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L117
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L117
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L117
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L117
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L117
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L117
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L117
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L117
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L117
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L117
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L117
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L117
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L117
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L117
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L117
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L117
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L117
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L117
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L117
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L117
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L117
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L117
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L117
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L117
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L117
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L117
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L117
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L117
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L117
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L117
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L117
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L117
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L117
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L117
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L117
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L117
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L117
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L117
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L117
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L117
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L117
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L117
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L117
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L117
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L117
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L117
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L117
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L117
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L117
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L117
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L117
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L117
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L117
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L117
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L117
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L117
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L117
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L117
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L117
        Workout r1510 = null;
        String r1511 = null;
        if (r2.step() == false) goto L120;
        int r160 = (int) r2.getLong(r0);     // Catch: Throwable -> L117
        long r161 = r2.getLong(r3);     // Catch: Throwable -> L117
        long r162 = r2.getLong(r4);     // Catch: Throwable -> L117
        if (r2.isNull(r5) == false) goto L8;
        String r164 = null;
    L9:
        int r163 = (int) r2.getLong(r6);     // Catch: Throwable -> L117
        int r165 = (int) r2.getLong(r7);     // Catch: Throwable -> L117
        int r166 = (int) r2.getLong(r8);     // Catch: Throwable -> L117
        int r167 = (int) r2.getLong(r9);     // Catch: Throwable -> L117
        int r168 = (int) r2.getLong(r10);     // Catch: Throwable -> L117
        int r169 = (int) r2.getLong(r11);     // Catch: Throwable -> L117
        int r170 = (int) r2.getLong(r12);     // Catch: Throwable -> L117
        int r171 = (int) r2.getLong(r13);     // Catch: Throwable -> L117
        int r172 = (int) r2.getLong(r14);     // Catch: Throwable -> L117
        int r173 = (int) r2.getLong(r15);     // Catch: Throwable -> L117
        int r174 = (int) r2.getLong(r1);     // Catch: Throwable -> L117
        int r175 = (int) r2.getLong(r16);     // Catch: Throwable -> L117
        int r176 = (int) r2.getLong(r17);     // Catch: Throwable -> L117
        int r177 = (int) r2.getLong(r18);     // Catch: Throwable -> L117
        int r178 = (int) r2.getLong(r19);     // Catch: Throwable -> L117
        int r179 = (int) r2.getLong(r20);     // Catch: Throwable -> L117
        int r180 = (int) r2.getLong(r21);     // Catch: Throwable -> L117
        int r181 = (int) r2.getLong(r22);     // Catch: Throwable -> L117
        int r182 = (int) r2.getLong(r23);     // Catch: Throwable -> L117
        int r183 = (int) r2.getLong(r24);     // Catch: Throwable -> L117
        int r184 = (int) r2.getLong(r25);     // Catch: Throwable -> L117
        int r185 = (int) r2.getLong(r26);     // Catch: Throwable -> L117
        int r186 = (int) r2.getLong(r27);     // Catch: Throwable -> L117
        int r187 = (int) r2.getLong(r28);     // Catch: Throwable -> L117
        int r188 = (int) r2.getLong(r29);     // Catch: Throwable -> L117
        int r189 = (int) r2.getLong(r30);     // Catch: Throwable -> L117
        if (r2.isNull(r31) == false) goto L13;
        String r191 = null;
    L15:
        if (r2.isNull(r32) == false) goto L18;
        String r192 = null;
    L20:
        if (r2.isNull(r33) == false) goto L23;
        String r193 = null;
    L25:
        if (r2.isNull(r34) == false) goto L28;
        String r194 = null;
    L29:
        int r190 = (int) r2.getLong(r35);     // Catch: Throwable -> L117
        int r195 = (int) r2.getLong(r36);     // Catch: Throwable -> L117
        int r196 = (int) r2.getLong(r37);     // Catch: Throwable -> L117
        int r197 = (int) r2.getLong(r38);     // Catch: Throwable -> L117
        int r198 = (int) r2.getLong(r39);     // Catch: Throwable -> L117
        int r199 = (int) r2.getLong(r40);     // Catch: Throwable -> L117
        float r200 = (float) r2.getDouble(r41);     // Catch: Throwable -> L117
        float r201 = (float) r2.getDouble(r42);     // Catch: Throwable -> L117
        int r202 = (int) r2.getLong(r43);     // Catch: Throwable -> L117
        float r203 = (float) r2.getDouble(r44);     // Catch: Throwable -> L117
        int r204 = (int) r2.getLong(r45);     // Catch: Throwable -> L117
        int r205 = (int) r2.getLong(r46);     // Catch: Throwable -> L117
        int r206 = (int) r2.getLong(r47);     // Catch: Throwable -> L117
        if (r2.isNull(r48) == false) goto L33;
        String r207 = null;
    L126:
        int[] r208 = this.__workoutConverter.toIntArray(r207);     // Catch: Throwable -> L115
        if (r2.isNull(r49) == false) goto L38;
        String r209 = null;
    L39:
        int[] r2010 = this.__workoutConverter.toIntArray(r209);     // Catch: Throwable -> L115
        int r210 = (int) r2.getLong(r50);     // Catch: Throwable -> L115
        int r211 = (int) r2.getLong(r51);     // Catch: Throwable -> L115
        int r212 = (int) r2.getLong(r52);     // Catch: Throwable -> L115
        int r213 = (int) r2.getLong(r53);     // Catch: Throwable -> L115
        int r214 = (int) r2.getLong(r54);     // Catch: Throwable -> L115
        int r215 = (int) r2.getLong(r55);     // Catch: Throwable -> L115
        int r216 = (int) r2.getLong(r56);     // Catch: Throwable -> L115
        int r217 = (int) r2.getLong(r57);     // Catch: Throwable -> L115
        if (r2.isNull(r58) == false) goto L43;
        String r218 = null;
    L44:
        List<float[]> r219 = this.__workoutConverter.floatArrayToWatchList(r218);     // Catch: Throwable -> L115
        int r220 = (int) r2.getLong(r59);     // Catch: Throwable -> L115
        int r221 = (int) r2.getLong(r60);     // Catch: Throwable -> L115
        if (r2.isNull(r61) == false) goto L48;
        String r222 = null;
    L49:
        List<Integer> r223 = this.__workoutConverter.stringToStopWatchList(r222);     // Catch: Throwable -> L115
        int r224 = (int) r2.getLong(r62);     // Catch: Throwable -> L115
        int r225 = (int) r2.getLong(r63);     // Catch: Throwable -> L115
        if (r2.isNull(r64) == false) goto L53;
        String r226 = null;
    L54:
        List<Integer> r227 = this.__workoutConverter.stringToStopWatchList(r226);     // Catch: Throwable -> L115
        int r228 = (int) r2.getLong(r65);     // Catch: Throwable -> L115
        int r229 = (int) r2.getLong(r66);     // Catch: Throwable -> L115
        if (r2.isNull(r67) == false) goto L58;
        String r230 = null;
    L59:
        List<Integer> r2210 = this.__workoutConverter.stringToStopWatchList(r230);     // Catch: Throwable -> L115
        int r231 = (int) r2.getLong(r68);     // Catch: Throwable -> L115
        int r232 = (int) r2.getLong(r69);     // Catch: Throwable -> L115
        if (r2.isNull(r70) == false) goto L63;
        String r233 = null;
    L64:
        List<Integer> r234 = this.__workoutConverter.stringToStopWatchList(r233);     // Catch: Throwable -> L115
        int r235 = (int) r2.getLong(r71);     // Catch: Throwable -> L115
        int r236 = (int) r2.getLong(r72);     // Catch: Throwable -> L115
        if (r2.isNull(r73) == false) goto L68;
        String r237 = null;
    L69:
        List<Integer> r238 = this.__workoutConverter.stringToStopWatchList(r237);     // Catch: Throwable -> L115
        int r239 = (int) r2.getLong(r74);     // Catch: Throwable -> L115
        int r240 = (int) r2.getLong(r75);     // Catch: Throwable -> L115
        int r241 = (int) r2.getLong(r76);     // Catch: Throwable -> L115
        int r242 = (int) r2.getLong(r77);     // Catch: Throwable -> L115
        int r243 = (int) r2.getLong(r78);     // Catch: Throwable -> L115
        int r244 = (int) r2.getLong(r79);     // Catch: Throwable -> L115
        int r245 = (int) r2.getLong(r80);     // Catch: Throwable -> L115
        int r246 = (int) r2.getLong(r81);     // Catch: Throwable -> L115
        int r247 = (int) r2.getLong(r82);     // Catch: Throwable -> L115
        int r248 = (int) r2.getLong(r83);     // Catch: Throwable -> L115
        int r249 = (int) r2.getLong(r84);     // Catch: Throwable -> L115
        int r250 = (int) r2.getLong(r85);     // Catch: Throwable -> L115
        int r251 = (int) r2.getLong(r86);     // Catch: Throwable -> L115
        int r252 = (int) r2.getLong(r87);     // Catch: Throwable -> L115
        int r253 = (int) r2.getLong(r88);     // Catch: Throwable -> L115
        int r254 = (int) r2.getLong(r89);     // Catch: Throwable -> L115
        int r255 = (int) r2.getLong(r90);     // Catch: Throwable -> L115
        int r256 = (int) r2.getLong(r91);     // Catch: Throwable -> L115
        float r257 = (float) r2.getDouble(r92);     // Catch: Throwable -> L115
        int r258 = (int) r2.getLong(r93);     // Catch: Throwable -> L115
        int r259 = (int) r2.getLong(r94);     // Catch: Throwable -> L115
        float r260 = (float) r2.getDouble(r95);     // Catch: Throwable -> L115
        if (r2.isNull(r96) == false) goto L73;
        String r261 = null;
    L74:
        int[] r262 = this.__workoutConverter.toIntArray(r261);     // Catch: Throwable -> L115
        if (r2.isNull(r97) == false) goto L78;
        String r263 = null;
    L79:
        float[] r264 = this.__workoutConverter.toFloatArray(r263);     // Catch: Throwable -> L115
        int r265 = (int) r2.getLong(r98);     // Catch: Throwable -> L115
        int r266 = (int) r2.getLong(r99);     // Catch: Throwable -> L115
        int r267 = (int) r2.getLong(r100);     // Catch: Throwable -> L115
        if (r2.isNull(r101) == false) goto L83;
        String r268 = null;
    L84:
        List<Integer> r269 = this.__workoutConverter.stringToStopWatchList(r268);     // Catch: Throwable -> L115
        float r270 = (float) r2.getDouble(r102);     // Catch: Throwable -> L115
        float r271 = (float) r2.getDouble(r103);     // Catch: Throwable -> L115
        float r272 = (float) r2.getDouble(r104);     // Catch: Throwable -> L115
        float r273 = (float) r2.getDouble(r105);     // Catch: Throwable -> L115
        int r274 = (int) r2.getLong(r106);     // Catch: Throwable -> L115
        int r275 = (int) r2.getLong(r107);     // Catch: Throwable -> L115
        int r276 = (int) r2.getLong(r108);     // Catch: Throwable -> L115
        int r277 = (int) r2.getLong(r109);     // Catch: Throwable -> L115
        int r278 = (int) r2.getLong(r110);     // Catch: Throwable -> L115
        int r279 = (int) r2.getLong(r111);     // Catch: Throwable -> L115
        int r280 = (int) r2.getLong(r112);     // Catch: Throwable -> L115
        int r281 = (int) r2.getLong(r113);     // Catch: Throwable -> L115
        int r282 = (int) r2.getLong(r114);     // Catch: Throwable -> L115
        int r283 = (int) r2.getLong(r115);     // Catch: Throwable -> L115
        int r284 = (int) r2.getLong(r116);     // Catch: Throwable -> L115
        int r285 = (int) r2.getLong(r117);     // Catch: Throwable -> L115
        float r286 = (float) r2.getDouble(r118);     // Catch: Throwable -> L115
        float r287 = (float) r2.getDouble(r119);     // Catch: Throwable -> L115
        int r288 = (int) r2.getLong(r120);     // Catch: Throwable -> L115
        int r289 = (int) r2.getLong(r121);     // Catch: Throwable -> L115
        int r290 = (int) r2.getLong(r122);     // Catch: Throwable -> L115
        int r291 = (int) r2.getLong(r123);     // Catch: Throwable -> L115
        float r292 = (float) r2.getDouble(r124);     // Catch: Throwable -> L115
        if (r2.isNull(r125) == false) goto L88;
        String r293 = null;
    L89:
        float[] r294 = this.__workoutConverter.toFloatArray(r293);     // Catch: Throwable -> L115
        if (r2.isNull(r126) == false) goto L93;
        String r295 = null;
    L94:
        float[] r296 = this.__workoutConverter.toFloatArray(r295);     // Catch: Throwable -> L115
        int r297 = (int) r2.getLong(r127);     // Catch: Throwable -> L115
        int r298 = (int) r2.getLong(r128);     // Catch: Throwable -> L115
        int r299 = (int) r2.getLong(r129);     // Catch: Throwable -> L115
        int r300 = (int) r2.getLong(r130);     // Catch: Throwable -> L115
        int r301 = (int) r2.getLong(r131);     // Catch: Throwable -> L115
        int r302 = (int) r2.getLong(r132);     // Catch: Throwable -> L115
        int r303 = (int) r2.getLong(r133);     // Catch: Throwable -> L115
        int r304 = (int) r2.getLong(r134);     // Catch: Throwable -> L115
        if (r2.isNull(r135) == false) goto L98;
        String r305 = null;
    L99:
        List<Integer> r306 = this.__workoutConverter.stringToStopWatchList(r305);     // Catch: Throwable -> L115
        int r307 = (int) r2.getLong(r136);     // Catch: Throwable -> L115
        if (r2.isNull(r137) == false) goto L103;
        String r308 = null;
    L104:
        List<Float> r309 = this.__workoutConverter.stringToFloatWatch(r308);     // Catch: Throwable -> L115
        int r310 = (int) r2.getLong(r138);     // Catch: Throwable -> L115
        long r1100 = r2.getLong(r139);     // Catch: Throwable -> L115
        int r311 = (int) r2.getLong(r140);     // Catch: Throwable -> L115
        int r312 = (int) r2.getLong(r141);     // Catch: Throwable -> L115
        long r1101 = r2.getLong(r142);     // Catch: Throwable -> L115
        int r313 = (int) r2.getLong(r143);     // Catch: Throwable -> L115
        int r314 = (int) r2.getLong(r144);     // Catch: Throwable -> L115
        long r2100 = r2.getLong(r145);     // Catch: Throwable -> L115
        int r315 = (int) r2.getLong(r146);     // Catch: Throwable -> L115
        int r316 = (int) r2.getLong(r147);     // Catch: Throwable -> L115
        int r317 = (int) r2.getLong(r148);     // Catch: Throwable -> L115
        int r318 = (int) r2.getLong(r149);     // Catch: Throwable -> L115
        int r319 = (int) r2.getLong(r150);     // Catch: Throwable -> L115
        int r320 = (int) r2.getLong(r151);     // Catch: Throwable -> L115
        float r321 = (float) r2.getDouble(r152);     // Catch: Throwable -> L115
        float r322 = (float) r2.getDouble(r153);     // Catch: Throwable -> L115
        int r323 = (int) r2.getLong(r154);     // Catch: Throwable -> L115
        int r325 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        if (r2.isNull(r156) == false) goto L108;
        String r327 = null;
    L109:
        List<Integer> r329 = this.__workoutConverter.stringToStopWatchList(r327);     // Catch: Throwable -> L115
        int r330 = (int) r2.getLong(r157);     // Catch: Throwable -> L115
        if (r2.isNull(r158) == true) goto L113;
        r1511 = r2.getText(r158);     // Catch: Throwable -> L115
    L113:
        r1510 = new Workout(r160, r161, r162, r164, r163, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r191, r192, r193, r194, r190, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r208, r2010, r210, r211, r212, r213, r214, r215, r216, r217, r219, r220, r221, r223, r224, r225, r227, r228, r229, r2210, r231, r232, r234, r235, r236, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r262, r264, r265, r266, r267, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r294, r296, r297, r298, r299, r300, r301, r302, r303, r304, r306, r307, r309, r310, r1100, r311, r312, r1101, r313, r314, r2100, r315, r316, r317, r318, r319, r320, r321, r322, r323, r325, r329, r330, r1511, (int) r2.getLong(r159));     // Catch: Throwable -> L115
        goto L120
    L108:
        r327 = r2.getText(r156);     // Catch: Throwable -> L115
        goto L109
    L103:
        r308 = r2.getText(r137);     // Catch: Throwable -> L115
        goto L104
    L98:
        r305 = r2.getText(r135);     // Catch: Throwable -> L115
        goto L99
    L93:
        r295 = r2.getText(r126);     // Catch: Throwable -> L115
        goto L94
    L88:
        r293 = r2.getText(r125);     // Catch: Throwable -> L115
        goto L89
    L83:
        r268 = r2.getText(r101);     // Catch: Throwable -> L115
        goto L84
    L78:
        r263 = r2.getText(r97);     // Catch: Throwable -> L115
        goto L79
    L73:
        r261 = r2.getText(r96);     // Catch: Throwable -> L115
        goto L74
    L68:
        r237 = r2.getText(r73);     // Catch: Throwable -> L115
        goto L69
    L63:
        r233 = r2.getText(r70);     // Catch: Throwable -> L115
        goto L64
    L58:
        r230 = r2.getText(r67);     // Catch: Throwable -> L115
        goto L59
    L53:
        r226 = r2.getText(r64);     // Catch: Throwable -> L115
        goto L54
    L48:
        r222 = r2.getText(r61);     // Catch: Throwable -> L115
        goto L49
    L43:
        r218 = r2.getText(r58);     // Catch: Throwable -> L115
        goto L44
    L38:
        r209 = r2.getText(r49);     // Catch: Throwable -> L115
    L115:
        th = th;
    L122:
        r2.close();
        throw th;
    L33:
        r207 = r2.getText(r48);     // Catch: Throwable -> L117
        goto L126
    L28:
        r194 = r2.getText(r34);     // Catch: Throwable -> L117
        goto L29
    L23:
        r193 = r2.getText(r33);     // Catch: Throwable -> L117
        goto L25
    L18:
        r192 = r2.getText(r32);     // Catch: Throwable -> L117
        goto L20
    L13:
        r191 = r2.getText(r31);     // Catch: Throwable -> L117
        goto L15
    L8:
        r164 = r2.getText(r5);     // Catch: Throwable -> L117
    L120:
        r2.close();
        return r1510;
    L117:
        th = th;
        goto L122
    }

    private /* synthetic */ Workout lambda$getWorkoutById$15(int r327, SQLiteConnection r328) {
        SQLiteStatement r2 = r328.prepare("SELECT * FROM Workout WHERE mId = ?");
        r2.mo3338bindLong(1, r327);     // Catch: Throwable -> L117
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mId");     // Catch: Throwable -> L117
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStart");     // Catch: Throwable -> L117
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEnd");     // Catch: Throwable -> L117
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLocalTime");     // Catch: Throwable -> L117
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDuration");     // Catch: Throwable -> L117
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitude");     // Catch: Throwable -> L117
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAirPressure");     // Catch: Throwable -> L117
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpm");     // Catch: Throwable -> L117
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMode");     // Catch: Throwable -> L117
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStep");     // Catch: Throwable -> L117
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDistance");     // Catch: Throwable -> L117
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorie");     // Catch: Throwable -> L117
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeed");     // Catch: Throwable -> L117
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPace");     // Catch: Throwable -> L117
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgBpm");     // Catch: Throwable -> L117
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxBpm");     // Catch: Throwable -> L117
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinBpm");     // Catch: Throwable -> L117
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpm");     // Catch: Throwable -> L117
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpm");     // Catch: Throwable -> L117
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxPace");     // Catch: Throwable -> L117
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinPace");     // Catch: Throwable -> L117
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxAltitude");     // Catch: Throwable -> L117
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinAltitude");     // Catch: Throwable -> L117
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinStress");     // Catch: Throwable -> L117
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxStress");     // Catch: Throwable -> L117
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgStress");     // Catch: Throwable -> L117
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSource");     // Catch: Throwable -> L117
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsSync");     // Catch: Throwable -> L117
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mIsDelete");     // Catch: Throwable -> L117
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFeel");     // Catch: Throwable -> L117
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPrototype");     // Catch: Throwable -> L117
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFirmwareFlag");     // Catch: Throwable -> L117
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBleName");     // Catch: Throwable -> L117
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPlatform");     // Catch: Throwable -> L117
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxSpeed");     // Catch: Throwable -> L117
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMinSpeed");     // Catch: Throwable -> L117
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRestDuration");     // Catch: Throwable -> L117
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAGpsType");     // Catch: Throwable -> L117
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mType");     // Catch: Throwable -> L117
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMetTotal");     // Catch: Throwable -> L117
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAerobic");     // Catch: Throwable -> L117
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAnaerobic");     // Catch: Throwable -> L117
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStamina");     // Catch: Throwable -> L117
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAvgSpeed");     // Catch: Throwable -> L117
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadence");     // Catch: Throwable -> L117
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxCadence");     // Catch: Throwable -> L117
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCnt");     // Catch: Throwable -> L117
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBpmZoneCount");     // Catch: Throwable -> L117
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPersonalZone");     // Catch: Throwable -> L117
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdPace");     // Catch: Throwable -> L117
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryTime");     // Catch: Throwable -> L117
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingLoad");     // Catch: Throwable -> L117
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxVO2");     // Catch: Throwable -> L117
        int r54 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mLactateThresholdHr");     // Catch: Throwable -> L117
        int r55 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAlgorithmMarking");     // Catch: Throwable -> L117
        int r56 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathCount");     // Catch: Throwable -> L117
        int r57 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathSampleInterval");     // Catch: Throwable -> L117
        int r58 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPathPoints");     // Catch: Throwable -> L117
        int r59 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathCount");     // Catch: Throwable -> L117
        int r60 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathSampleInterval");     // Catch: Throwable -> L117
        int r61 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mHrPathPoints");     // Catch: Throwable -> L117
        int r62 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathCount");     // Catch: Throwable -> L117
        int r63 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathSampleInterval");     // Catch: Throwable -> L117
        int r64 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPacePathPoints");     // Catch: Throwable -> L117
        int r65 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathCount");     // Catch: Throwable -> L117
        int r66 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathSampleInterval");     // Catch: Throwable -> L117
        int r67 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpeedPathPoints");     // Catch: Throwable -> L117
        int r68 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathCount");     // Catch: Throwable -> L117
        int r69 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathSampleInterval");     // Catch: Throwable -> L117
        int r70 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCadencePathPoints");     // Catch: Throwable -> L117
        int r71 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathCount");     // Catch: Throwable -> L117
        int r72 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathSampleInterval");     // Catch: Throwable -> L117
        int r73 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAltitudePathPoints");     // Catch: Throwable -> L117
        int r74 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalDistance");     // Catch: Throwable -> L117
        int r75 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalTime");     // Catch: Throwable -> L117
        int r76 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mGoalCalorie");     // Catch: Throwable -> L117
        int r77 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPausedDuration");     // Catch: Throwable -> L117
        int r78 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurBpm");     // Catch: Throwable -> L117
        int r79 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAscendAltitude");     // Catch: Throwable -> L117
        int r80 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDescendAltitude");     // Catch: Throwable -> L117
        int r81 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCurStress");     // Catch: Throwable -> L117
        int r82 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimType");     // Catch: Throwable -> L117
        int r83 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntFore");     // Catch: Throwable -> L117
        int r84 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntBack");     // Catch: Throwable -> L117
        int r85 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackSwingTime");     // Catch: Throwable -> L117
        int r86 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDownSwingTime");     // Catch: Throwable -> L117
        int r87 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDribbleTime");     // Catch: Throwable -> L117
        int r88 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTripCount");     // Catch: Throwable -> L117
        int r89 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSessionCount");     // Catch: Throwable -> L117
        int r90 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mVerticalOscillation");     // Catch: Throwable -> L117
        int r91 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunPowerWatt");     // Catch: Throwable -> L117
        int r92 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLen");     // Catch: Throwable -> L117
        int r93 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrainingStatus");     // Catch: Throwable -> L117
        int r94 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessAge");     // Catch: Throwable -> L117
        int r95 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTlTrend");     // Catch: Throwable -> L117
        int r96 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBestRunTime");     // Catch: Throwable -> L117
        int r97 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFitnessLevel");     // Catch: Throwable -> L117
        int r98 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCalorieTotal");     // Catch: Throwable -> L117
        int r99 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerCount");     // Catch: Throwable -> L117
        int r100 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerInterval");     // Catch: Throwable -> L117
        int r101 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mPowerPoints");     // Catch: Throwable -> L117
        int r102 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAerobic");     // Catch: Throwable -> L117
        int r103 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "realTimeAnaerobic");     // Catch: Throwable -> L117
        int r104 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFatTotal");     // Catch: Throwable -> L117
        int r105 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCarboTotal");     // Catch: Throwable -> L117
        int r106 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetTime");     // Catch: Throwable -> L117
        int r107 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualTime");     // Catch: Throwable -> L117
        int r108 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceTime");     // Catch: Throwable -> L117
        int r109 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusTime");     // Catch: Throwable -> L117
        int r110 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetDistance");     // Catch: Throwable -> L117
        int r111 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualDistance");     // Catch: Throwable -> L117
        int r112 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceDistance");     // Catch: Throwable -> L117
        int r113 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusDistance");     // Catch: Throwable -> L117
        int r114 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetPace");     // Catch: Throwable -> L117
        int r115 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualPace");     // Catch: Throwable -> L117
        int r116 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferencePace");     // Catch: Throwable -> L117
        int r117 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusPace");     // Catch: Throwable -> L117
        int r118 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeedV2");     // Catch: Throwable -> L117
        int r119 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeedV2");     // Catch: Throwable -> L117
        int r120 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorTargetSpeed");     // Catch: Throwable -> L117
        int r121 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorActualSpeed");     // Catch: Throwable -> L117
        int r122 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorDifferenceSpeed");     // Catch: Throwable -> L117
        int r123 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mNavigatorStatusSpeed");     // Catch: Throwable -> L117
        int r124 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mMaxOxygenPower");     // Catch: Throwable -> L117
        int r125 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mTrendWeek");     // Catch: Throwable -> L117
        int r126 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingIndex");     // Catch: Throwable -> L117
        int r127 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStaBalance");     // Catch: Throwable -> L117
        int r128 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimSwolf");     // Catch: Throwable -> L117
        int r129 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCntLap");     // Catch: Throwable -> L117
        int r130 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFrontCrawlPerc");     // Catch: Throwable -> L117
        int r131 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBreaststrokePerc");     // Catch: Throwable -> L117
        int r132 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mBackstrokePerc");     // Catch: Throwable -> L117
        int r133 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mButterflyPerc");     // Catch: Throwable -> L117
        int r134 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsCount");     // Catch: Throwable -> L117
        int r135 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSpmPathPointsPoints");     // Catch: Throwable -> L117
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenCount");     // Catch: Throwable -> L117
        int r137 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mStepLenPoints");     // Catch: Throwable -> L117
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mEllipticalSteps");     // Catch: Throwable -> L117
        int r139 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimStartTime");     // Catch: Throwable -> L117
        int r140 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDuration");     // Catch: Throwable -> L117
        int r141 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimDistance");     // Catch: Throwable -> L117
        int r142 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingStartTime");     // Catch: Throwable -> L117
        int r143 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDuration");     // Catch: Throwable -> L117
        int r144 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingDistance");     // Catch: Throwable -> L117
        int r145 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunStartTime");     // Catch: Throwable -> L117
        int r146 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDuration");     // Catch: Throwable -> L117
        int r147 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunDistance");     // Catch: Throwable -> L117
        int r148 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildSwimMode");     // Catch: Throwable -> L117
        int r149 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildCyclingMode");     // Catch: Throwable -> L117
        int r150 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildRunMode");     // Catch: Throwable -> L117
        int r151 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mChildNumber");     // Catch: Throwable -> L117
        int r152 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRunLactateAvg");     // Catch: Throwable -> L117
        int r153 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mCyclingLactateAvg");     // Catch: Throwable -> L117
        int r154 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mFlag");     // Catch: Throwable -> L117
        int r155 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrCount");     // Catch: Throwable -> L117
        int r156 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mRecoveryHrPoints");     // Catch: Throwable -> L117
        int r157 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mSwimPoolLength");     // Catch: Throwable -> L117
        int r158 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mDeviceId");     // Catch: Throwable -> L117
        int r159 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "mAICoachSportID");     // Catch: Throwable -> L117
        Workout r1510 = null;
        String r1511 = null;
        if (r2.step() == false) goto L120;
        int r160 = (int) r2.getLong(r0);     // Catch: Throwable -> L117
        long r163 = r2.getLong(r3);     // Catch: Throwable -> L117
        long r165 = r2.getLong(r4);     // Catch: Throwable -> L117
        if (r2.isNull(r5) == false) goto L8;
        String r167 = null;
    L9:
        int r161 = (int) r2.getLong(r6);     // Catch: Throwable -> L117
        int r162 = (int) r2.getLong(r7);     // Catch: Throwable -> L117
        int r164 = (int) r2.getLong(r8);     // Catch: Throwable -> L117
        int r166 = (int) r2.getLong(r9);     // Catch: Throwable -> L117
        int r168 = (int) r2.getLong(r10);     // Catch: Throwable -> L117
        int r169 = (int) r2.getLong(r11);     // Catch: Throwable -> L117
        int r170 = (int) r2.getLong(r12);     // Catch: Throwable -> L117
        int r171 = (int) r2.getLong(r13);     // Catch: Throwable -> L117
        int r172 = (int) r2.getLong(r14);     // Catch: Throwable -> L117
        int r173 = (int) r2.getLong(r15);     // Catch: Throwable -> L117
        int r174 = (int) r2.getLong(r1);     // Catch: Throwable -> L117
        int r175 = (int) r2.getLong(r16);     // Catch: Throwable -> L117
        int r176 = (int) r2.getLong(r17);     // Catch: Throwable -> L117
        int r177 = (int) r2.getLong(r18);     // Catch: Throwable -> L117
        int r178 = (int) r2.getLong(r19);     // Catch: Throwable -> L117
        int r179 = (int) r2.getLong(r20);     // Catch: Throwable -> L117
        int r180 = (int) r2.getLong(r21);     // Catch: Throwable -> L117
        int r181 = (int) r2.getLong(r22);     // Catch: Throwable -> L117
        int r182 = (int) r2.getLong(r23);     // Catch: Throwable -> L117
        int r183 = (int) r2.getLong(r24);     // Catch: Throwable -> L117
        int r184 = (int) r2.getLong(r25);     // Catch: Throwable -> L117
        int r185 = (int) r2.getLong(r26);     // Catch: Throwable -> L117
        int r186 = (int) r2.getLong(r27);     // Catch: Throwable -> L117
        int r187 = (int) r2.getLong(r28);     // Catch: Throwable -> L117
        int r188 = (int) r2.getLong(r29);     // Catch: Throwable -> L117
        int r189 = (int) r2.getLong(r30);     // Catch: Throwable -> L117
        if (r2.isNull(r31) == false) goto L13;
        String r194 = null;
    L15:
        if (r2.isNull(r32) == false) goto L18;
        String r195 = null;
    L20:
        if (r2.isNull(r33) == false) goto L23;
        String r196 = null;
    L25:
        if (r2.isNull(r34) == false) goto L28;
        String r197 = null;
    L29:
        int r190 = (int) r2.getLong(r35);     // Catch: Throwable -> L117
        int r191 = (int) r2.getLong(r36);     // Catch: Throwable -> L117
        int r192 = (int) r2.getLong(r37);     // Catch: Throwable -> L117
        int r193 = (int) r2.getLong(r38);     // Catch: Throwable -> L117
        int r198 = (int) r2.getLong(r39);     // Catch: Throwable -> L117
        int r199 = (int) r2.getLong(r40);     // Catch: Throwable -> L117
        float r200 = (float) r2.getDouble(r41);     // Catch: Throwable -> L117
        float r201 = (float) r2.getDouble(r42);     // Catch: Throwable -> L117
        int r202 = (int) r2.getLong(r43);     // Catch: Throwable -> L117
        float r203 = (float) r2.getDouble(r44);     // Catch: Throwable -> L117
        int r204 = (int) r2.getLong(r45);     // Catch: Throwable -> L117
        int r205 = (int) r2.getLong(r46);     // Catch: Throwable -> L117
        int r206 = (int) r2.getLong(r47);     // Catch: Throwable -> L117
        if (r2.isNull(r48) == false) goto L33;
        String r207 = null;
    L124:
        int[] r211 = this.__workoutConverter.toIntArray(r207);     // Catch: Throwable -> L115
        if (r2.isNull(r49) == false) goto L38;
        String r208 = null;
    L39:
        int[] r212 = this.__workoutConverter.toIntArray(r208);     // Catch: Throwable -> L115
        int r209 = (int) r2.getLong(r50);     // Catch: Throwable -> L115
        int r210 = (int) r2.getLong(r51);     // Catch: Throwable -> L115
        int r213 = (int) r2.getLong(r52);     // Catch: Throwable -> L115
        int r214 = (int) r2.getLong(r53);     // Catch: Throwable -> L115
        int r215 = (int) r2.getLong(r54);     // Catch: Throwable -> L115
        int r216 = (int) r2.getLong(r55);     // Catch: Throwable -> L115
        int r217 = (int) r2.getLong(r56);     // Catch: Throwable -> L115
        int r218 = (int) r2.getLong(r57);     // Catch: Throwable -> L115
        if (r2.isNull(r58) == false) goto L43;
        String r219 = null;
    L44:
        List<float[]> r221 = this.__workoutConverter.floatArrayToWatchList(r219);     // Catch: Throwable -> L115
        int r220 = (int) r2.getLong(r59);     // Catch: Throwable -> L115
        int r222 = (int) r2.getLong(r60);     // Catch: Throwable -> L115
        if (r2.isNull(r61) == false) goto L48;
        String r223 = null;
    L49:
        List<Integer> r224 = this.__workoutConverter.stringToStopWatchList(r223);     // Catch: Throwable -> L115
        int r225 = (int) r2.getLong(r62);     // Catch: Throwable -> L115
        int r226 = (int) r2.getLong(r63);     // Catch: Throwable -> L115
        if (r2.isNull(r64) == false) goto L53;
        String r227 = null;
    L54:
        List<Integer> r228 = this.__workoutConverter.stringToStopWatchList(r227);     // Catch: Throwable -> L115
        int r229 = (int) r2.getLong(r65);     // Catch: Throwable -> L115
        int r230 = (int) r2.getLong(r66);     // Catch: Throwable -> L115
        if (r2.isNull(r67) == false) goto L58;
        String r231 = null;
    L59:
        List<Integer> r232 = this.__workoutConverter.stringToStopWatchList(r231);     // Catch: Throwable -> L115
        int r233 = (int) r2.getLong(r68);     // Catch: Throwable -> L115
        int r234 = (int) r2.getLong(r69);     // Catch: Throwable -> L115
        if (r2.isNull(r70) == false) goto L63;
        String r235 = null;
    L64:
        List<Integer> r236 = this.__workoutConverter.stringToStopWatchList(r235);     // Catch: Throwable -> L115
        int r237 = (int) r2.getLong(r71);     // Catch: Throwable -> L115
        int r238 = (int) r2.getLong(r72);     // Catch: Throwable -> L115
        if (r2.isNull(r73) == false) goto L68;
        String r239 = null;
    L69:
        List<Integer> r2310 = this.__workoutConverter.stringToStopWatchList(r239);     // Catch: Throwable -> L115
        int r240 = (int) r2.getLong(r74);     // Catch: Throwable -> L115
        int r241 = (int) r2.getLong(r75);     // Catch: Throwable -> L115
        int r242 = (int) r2.getLong(r76);     // Catch: Throwable -> L115
        int r243 = (int) r2.getLong(r77);     // Catch: Throwable -> L115
        int r244 = (int) r2.getLong(r78);     // Catch: Throwable -> L115
        int r245 = (int) r2.getLong(r79);     // Catch: Throwable -> L115
        int r246 = (int) r2.getLong(r80);     // Catch: Throwable -> L115
        int r247 = (int) r2.getLong(r81);     // Catch: Throwable -> L115
        int r248 = (int) r2.getLong(r82);     // Catch: Throwable -> L115
        int r249 = (int) r2.getLong(r83);     // Catch: Throwable -> L115
        int r250 = (int) r2.getLong(r84);     // Catch: Throwable -> L115
        int r251 = (int) r2.getLong(r85);     // Catch: Throwable -> L115
        int r252 = (int) r2.getLong(r86);     // Catch: Throwable -> L115
        int r253 = (int) r2.getLong(r87);     // Catch: Throwable -> L115
        int r254 = (int) r2.getLong(r88);     // Catch: Throwable -> L115
        int r255 = (int) r2.getLong(r89);     // Catch: Throwable -> L115
        int r256 = (int) r2.getLong(r90);     // Catch: Throwable -> L115
        int r257 = (int) r2.getLong(r91);     // Catch: Throwable -> L115
        float r258 = (float) r2.getDouble(r92);     // Catch: Throwable -> L115
        int r259 = (int) r2.getLong(r93);     // Catch: Throwable -> L115
        int r260 = (int) r2.getLong(r94);     // Catch: Throwable -> L115
        float r261 = (float) r2.getDouble(r95);     // Catch: Throwable -> L115
        if (r2.isNull(r96) == false) goto L73;
        String r262 = null;
    L74:
        int[] r263 = this.__workoutConverter.toIntArray(r262);     // Catch: Throwable -> L115
        if (r2.isNull(r97) == false) goto L78;
        String r264 = null;
    L79:
        float[] r265 = this.__workoutConverter.toFloatArray(r264);     // Catch: Throwable -> L115
        int r266 = (int) r2.getLong(r98);     // Catch: Throwable -> L115
        int r267 = (int) r2.getLong(r99);     // Catch: Throwable -> L115
        int r268 = (int) r2.getLong(r100);     // Catch: Throwable -> L115
        if (r2.isNull(r101) == false) goto L83;
        String r269 = null;
    L84:
        List<Integer> r270 = this.__workoutConverter.stringToStopWatchList(r269);     // Catch: Throwable -> L115
        float r271 = (float) r2.getDouble(r102);     // Catch: Throwable -> L115
        float r272 = (float) r2.getDouble(r103);     // Catch: Throwable -> L115
        float r273 = (float) r2.getDouble(r104);     // Catch: Throwable -> L115
        float r274 = (float) r2.getDouble(r105);     // Catch: Throwable -> L115
        int r275 = (int) r2.getLong(r106);     // Catch: Throwable -> L115
        int r276 = (int) r2.getLong(r107);     // Catch: Throwable -> L115
        int r277 = (int) r2.getLong(r108);     // Catch: Throwable -> L115
        int r278 = (int) r2.getLong(r109);     // Catch: Throwable -> L115
        int r279 = (int) r2.getLong(r110);     // Catch: Throwable -> L115
        int r280 = (int) r2.getLong(r111);     // Catch: Throwable -> L115
        int r281 = (int) r2.getLong(r112);     // Catch: Throwable -> L115
        int r282 = (int) r2.getLong(r113);     // Catch: Throwable -> L115
        int r283 = (int) r2.getLong(r114);     // Catch: Throwable -> L115
        int r284 = (int) r2.getLong(r115);     // Catch: Throwable -> L115
        int r285 = (int) r2.getLong(r116);     // Catch: Throwable -> L115
        int r286 = (int) r2.getLong(r117);     // Catch: Throwable -> L115
        float r287 = (float) r2.getDouble(r118);     // Catch: Throwable -> L115
        float r288 = (float) r2.getDouble(r119);     // Catch: Throwable -> L115
        int r289 = (int) r2.getLong(r120);     // Catch: Throwable -> L115
        int r290 = (int) r2.getLong(r121);     // Catch: Throwable -> L115
        int r291 = (int) r2.getLong(r122);     // Catch: Throwable -> L115
        int r292 = (int) r2.getLong(r123);     // Catch: Throwable -> L115
        float r293 = (float) r2.getDouble(r124);     // Catch: Throwable -> L115
        if (r2.isNull(r125) == false) goto L88;
        String r294 = null;
    L89:
        float[] r295 = this.__workoutConverter.toFloatArray(r294);     // Catch: Throwable -> L115
        if (r2.isNull(r126) == false) goto L93;
        String r296 = null;
    L94:
        float[] r297 = this.__workoutConverter.toFloatArray(r296);     // Catch: Throwable -> L115
        int r298 = (int) r2.getLong(r127);     // Catch: Throwable -> L115
        int r299 = (int) r2.getLong(r128);     // Catch: Throwable -> L115
        int r300 = (int) r2.getLong(r129);     // Catch: Throwable -> L115
        int r301 = (int) r2.getLong(r130);     // Catch: Throwable -> L115
        int r302 = (int) r2.getLong(r131);     // Catch: Throwable -> L115
        int r303 = (int) r2.getLong(r132);     // Catch: Throwable -> L115
        int r304 = (int) r2.getLong(r133);     // Catch: Throwable -> L115
        int r305 = (int) r2.getLong(r134);     // Catch: Throwable -> L115
        if (r2.isNull(r135) == false) goto L98;
        String r306 = null;
    L99:
        List<Integer> r307 = this.__workoutConverter.stringToStopWatchList(r306);     // Catch: Throwable -> L115
        int r308 = (int) r2.getLong(r136);     // Catch: Throwable -> L115
        if (r2.isNull(r137) == false) goto L103;
        String r309 = null;
    L104:
        List<Float> r310 = this.__workoutConverter.stringToFloatWatch(r309);     // Catch: Throwable -> L115
        int r311 = (int) r2.getLong(r138);     // Catch: Throwable -> L115
        long r1100 = r2.getLong(r139);     // Catch: Throwable -> L115
        int r312 = (int) r2.getLong(r140);     // Catch: Throwable -> L115
        int r313 = (int) r2.getLong(r141);     // Catch: Throwable -> L115
        long r1101 = r2.getLong(r142);     // Catch: Throwable -> L115
        int r314 = (int) r2.getLong(r143);     // Catch: Throwable -> L115
        int r315 = (int) r2.getLong(r144);     // Catch: Throwable -> L115
        long r2100 = r2.getLong(r145);     // Catch: Throwable -> L115
        int r316 = (int) r2.getLong(r146);     // Catch: Throwable -> L115
        int r317 = (int) r2.getLong(r147);     // Catch: Throwable -> L115
        int r318 = (int) r2.getLong(r148);     // Catch: Throwable -> L115
        int r319 = (int) r2.getLong(r149);     // Catch: Throwable -> L115
        int r320 = (int) r2.getLong(r150);     // Catch: Throwable -> L115
        int r321 = (int) r2.getLong(r151);     // Catch: Throwable -> L115
        float r322 = (float) r2.getDouble(r152);     // Catch: Throwable -> L115
        float r323 = (float) r2.getDouble(r153);     // Catch: Throwable -> L115
        int r324 = (int) r2.getLong(r154);     // Catch: Throwable -> L115
        int r325 = (int) r2.getLong(r155);     // Catch: Throwable -> L115
        if (r2.isNull(r156) == false) goto L108;
        String r326 = null;
    L109:
        List<Integer> r329 = this.__workoutConverter.stringToStopWatchList(r326);     // Catch: Throwable -> L115
        int r330 = (int) r2.getLong(r157);     // Catch: Throwable -> L115
        if (r2.isNull(r158) == true) goto L113;
        r1511 = r2.getText(r158);     // Catch: Throwable -> L115
    L113:
        r1510 = new Workout(r160, r163, r165, r167, r161, r162, r164, r166, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r194, r195, r196, r197, r190, r191, r192, r193, r198, r199, r200, r201, r202, r203, r204, r205, r206, r211, r212, r209, r210, r213, r214, r215, r216, r217, r218, r221, r220, r222, r224, r225, r226, r228, r229, r230, r232, r233, r234, r236, r237, r238, r2310, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r261, r263, r265, r266, r267, r268, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r293, r295, r297, r298, r299, r300, r301, r302, r303, r304, r305, r307, r308, r310, r311, r1100, r312, r313, r1101, r314, r315, r2100, r316, r317, r318, r319, r320, r321, r322, r323, r324, r325, r329, r330, r1511, (int) r2.getLong(r159));     // Catch: Throwable -> L115
        goto L120
    L108:
        r326 = r2.getText(r156);     // Catch: Throwable -> L115
        goto L109
    L103:
        r309 = r2.getText(r137);     // Catch: Throwable -> L115
        goto L104
    L98:
        r306 = r2.getText(r135);     // Catch: Throwable -> L115
        goto L99
    L93:
        r296 = r2.getText(r126);     // Catch: Throwable -> L115
        goto L94
    L88:
        r294 = r2.getText(r125);     // Catch: Throwable -> L115
        goto L89
    L83:
        r269 = r2.getText(r101);     // Catch: Throwable -> L115
        goto L84
    L78:
        r264 = r2.getText(r97);     // Catch: Throwable -> L115
        goto L79
    L73:
        r262 = r2.getText(r96);     // Catch: Throwable -> L115
        goto L74
    L68:
        r239 = r2.getText(r73);     // Catch: Throwable -> L115
        goto L69
    L63:
        r235 = r2.getText(r70);     // Catch: Throwable -> L115
        goto L64
    L58:
        r231 = r2.getText(r67);     // Catch: Throwable -> L115
        goto L59
    L53:
        r227 = r2.getText(r64);     // Catch: Throwable -> L115
        goto L54
    L48:
        r223 = r2.getText(r61);     // Catch: Throwable -> L115
        goto L49
    L43:
        r219 = r2.getText(r58);     // Catch: Throwable -> L115
        goto L44
    L38:
        r208 = r2.getText(r49);     // Catch: Throwable -> L115
    L115:
        th = th;
    L122:
        r2.close();
        throw th;
    L33:
        r207 = r2.getText(r48);     // Catch: Throwable -> L117
        goto L124
    L28:
        r197 = r2.getText(r34);     // Catch: Throwable -> L117
        goto L29
    L23:
        r196 = r2.getText(r33);     // Catch: Throwable -> L117
        goto L25
    L18:
        r195 = r2.getText(r32);     // Catch: Throwable -> L117
        goto L20
    L13:
        r194 = r2.getText(r31);     // Catch: Throwable -> L117
        goto L15
    L8:
        r167 = r2.getText(r5);     // Catch: Throwable -> L117
    L120:
        r2.close();
        return r1510;
    L117:
        th = th;
        goto L122
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getDescList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new m57(this));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public Workout getFitnessWorkout(final long endTime, final int mode) {
        return (Workout) DBUtil.performBlocking(this.__db, true, false, new i57(this, endTime, mode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new h57(this));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new l57(this));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListByMode(final int mode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new f57(this, mode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListDESC(final int startIndex, final int endIndex, final int filterMode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new v57(this, filterMode, startIndex, endIndex));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListDESCByMode(final int startIndex, final int endIndex, final int mode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new q57(this, mode, startIndex, endIndex));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListModeDESC(final long startTime, final long endTime, final int filterMode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new p57(this, startTime, endTime, filterMode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getNavigatorListByMode(final int mode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new k57(this, mode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getNavigatorListModeDESC(final long startTime, final long endTime, final int filterMode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new o57(this, startTime, endTime, filterMode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public Workout getWorkout(final long startTime, final long endTime) {
        return (Workout) DBUtil.performBlocking(this.__db, true, false, new n57(this, startTime, endTime));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public Workout getWorkoutById(final int id) {
        return (Workout) DBUtil.performBlocking(this.__db, true, false, new u57(this, id));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public long[] insert(final List<Workout> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new r57(this, list));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public int update(final List<Workout> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new g57(this, lists))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListByMode(final int mode, final int source) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new s57(this, mode, source));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public List<Workout> getListDESC(final long startTime, final long endTime, final int filterMode) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new j57(this, startTime, endTime, filterMode));
    }

    @Override // com.sma.smartv3.db.dao.WorkoutDao
    public int update(final Workout workout) {
        workout.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new t57(this, workout))).intValue();
    }
}
