package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleWorkout4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1405:1\n1#2:1406\n13840#3,2:1407\n1563#4:1409\n1634#4,3:1410\n*S KotlinDebug\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n*L\n1019#1:1407,2\n1166#1:1409\n1166#1:1410,3\n*E\n"})
public final class BleWorkout4 extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int WORKOUT_MAX_POINT = 128;

    @aa1
    private static ByteOrder mByteOrder;
    private int mAICoachSportID;
    private float mAerobic;
    private int mAirPressure;
    private int mAltitude;
    private int mAltitudePathCount;

    @aa1
    private List<Integer> mAltitudePathPoints;
    private int mAltitudePathSampleInterval;
    private float mAnaerobic;
    private int mAscendAltitude;
    private int mAvgBpm;
    private float mAvgSpeed;
    private int mAvgStress;
    private int mBackSwingTime;
    private int mBackstrokePerc;

    @aa1
    private int[] mBestRunTime;

    @aa1
    private int[] mBpmZoneCount;
    private int mBreaststrokePerc;
    private int mButterflyPerc;
    private float mCadence;
    private int mCadencePathCount;

    @aa1
    private List<Integer> mCadencePathPoints;
    private int mCadencePathSampleInterval;
    private int mCalorie;
    private float mCalorieTotal;
    private float mCarboTotal;
    private int mChildCyclingDistance;
    private int mChildCyclingDuration;
    private int mChildCyclingMode;
    private int mChildCyclingStartTime;
    private int mChildNumber;
    private int mChildRunDistance;
    private int mChildRunDuration;
    private int mChildRunMode;
    private int mChildRunStartTime;
    private int mChildSwimDistance;
    private int mChildSwimDuration;
    private int mChildSwimMode;
    private int mChildSwimStartTime;
    private int mCnt;
    private int mCntBack;
    private int mCntFore;
    private int mCntLap;
    private int mCountAltitude;
    private int mCountBpm;
    private int mCountSatellite;
    private int mCountStress;
    private int mCurBpm;
    private int mCurStress;

    @aa1
    private final float[] mCyclingIndex;
    private float mCyclingLactateAvg;
    private int mDescendAltitude;
    private int mDistance;
    private int mDownSwingTime;
    private int mDribbleTime;
    private int mDuration;
    private int mEllipticalSteps;
    private int mEnd;
    private float mFatTotal;
    private int mFitnessAge;

    @aa1
    private float[] mFitnessLevel;
    private int mFrontCrawlPerc;
    private int mHrPathCount;

    @aa1
    private List<Integer> mHrPathPoints;
    private int mHrPathSampleInterval;
    private int mLactateThresholdHr;
    private int mLactateThresholdPace;
    private int mMaxAltitude;
    private int mMaxBpm;
    private int mMaxCadence;
    private float mMaxOxygenPower;
    private int mMaxPace;
    private float mMaxSpeed;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMaxVO2;
    private float mMetTotal;
    private int mMinAltitude;
    private int mMinBpm;
    private int mMinPace;
    private float mMinSpeed;
    private int mMinSpm;
    private int mMinStress;
    private int mMode;
    private int mNavigatorActualDistance;
    private int mNavigatorActualPace;
    private float mNavigatorActualSpeed;
    private int mNavigatorActualTime;
    private int mNavigatorDifferenceDistance;
    private int mNavigatorDifferencePace;
    private int mNavigatorDifferenceSpeed;
    private int mNavigatorDifferenceTime;
    private int mNavigatorStatusDistance;
    private int mNavigatorStatusPace;
    private int mNavigatorStatusSpeed;
    private int mNavigatorStatusTime;
    private int mNavigatorTargetDistance;
    private int mNavigatorTargetPace;
    private float mNavigatorTargetSpeed;
    private int mNavigatorTargetTime;
    private int mPace;
    private int mPacePathCount;

    @aa1
    private List<Integer> mPacePathPoints;
    private int mPacePathSampleInterval;
    private int mPathCount;

    @aa1
    private List<float[]> mPathPoints;
    private int mPathSampleInterval;
    private int mPausedDuration;

    @aa1
    private int[] mPersonalZone;
    private int mPowerCount;
    private int mPowerInterval;

    @aa1
    private List<Integer> mPowerPoints;
    private int mRecoveryHrCount;

    @aa1
    private List<Integer> mRecoveryHrPoints;
    private int mRecoveryHrSampleInterval;
    private int mRecoveryTime;
    private float mRunLactateAvg;
    private int mRunPowerWatt;
    private int mSessionCount;
    private int mSize;
    private float mSpeed;
    private int mSpeedPathCount;

    @aa1
    private List<Integer> mSpeedPathPoints;
    private int mSpeedPathSampleInterval;
    private int mSpm;
    private int mSpmPathPointsCount;

    @aa1
    private List<Integer> mSpmPathPointsPoints;
    private int mStaBalance;
    private float mStamina;
    private int mStart;
    private int mStep;
    private float mStepLen;
    private int mStepLenCount;

    @aa1
    private List<Float> mStepLenPoints;
    private int mSwimPoolLength;
    private int mSwimSwolf;
    private int mSwimType;
    private float mTlTrend;
    private int mTotalAltitude;
    private int mTotalBpm;
    private int mTotalStress;
    private int mTrainingLoad;
    private int mTrainingStatus;

    @aa1
    private final float[] mTrendWeek;
    private int mTripCount;
    private float mVerticalOscillation;
    private int mWorkoutFlag;
    private float realTimeAerobic;
    private float realTimeAnaerobic;

    public static final class Companion {

        public static final enum DataType extends Enum<DataType> {
            private static final /* synthetic */ EnumEntries $ENTRIES = null;
            private static final /* synthetic */ DataType[] $VALUES = null;
            public static final DataType CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_ACTUAL_PACE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_ACTUAL_SPEED = null;
            public static final DataType CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID = null;
            public static final DataType CD_WORKOUT_DATA_KEY_ANIM_COORDINATE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT = null;
            public static final DataType CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_DISTANCE_STATUS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT = null;
            public static final DataType CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN = null;
            public static final DataType CD_WORKOUT_DATA_KEY_MAX = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PACE_STATUS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PATH_POINTS_HEIGHT = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PATH_POINTS_WIDTH = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PERIPHERAL_STATUS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1 = null;
            public static final DataType CD_WORKOUT_DATA_KEY_POOL_LENGTH = null;
            public static final DataType CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO = null;
            public static final DataType CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_SPEED_STATUS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO = null;
            public static final DataType CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TARGET_DISTANCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TARGET_PACE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TARGET_SPEED = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TIME_STATUS = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME = null;
            public static final DataType CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME = null;
            public static final DataType CD_WORKOUT_DATA_KEY_WEEK_TREND = null;
            public static final DataType WORKOUT_DATA_KEY_AEROBIC = null;
            public static final DataType WORKOUT_DATA_KEY_AIR_PRESSURE = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_ASCEND = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_CURRENT = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_DESCEND = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_ALTITUDE_TOTAL = null;
            public static final DataType WORKOUT_DATA_KEY_ANAEROBIC = null;
            public static final DataType WORKOUT_DATA_KEY_BACKSTROKE_PERC = null;
            public static final DataType WORKOUT_DATA_KEY_BARO_DATA = null;
            public static final DataType WORKOUT_DATA_KEY_BEST_RUN_TIME = null;
            public static final DataType WORKOUT_DATA_KEY_BPM_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_BPM_CURRENT = null;
            public static final DataType WORKOUT_DATA_KEY_BPM_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_BPM_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_BPM_TOTAL = null;
            public static final DataType WORKOUT_DATA_KEY_BREASTSTROKE_PERC = null;
            public static final DataType WORKOUT_DATA_KEY_BUTTERFLY_PERC = null;
            public static final DataType WORKOUT_DATA_KEY_CALORIE = null;
            public static final DataType WORKOUT_DATA_KEY_CARBO_OUT = null;
            public static final DataType WORKOUT_DATA_KEY_CNT_LAP = null;
            public static final DataType WORKOUT_DATA_KEY_CYCLING_INDEX_FTP = null;
            public static final DataType WORKOUT_DATA_KEY_DISTANCE = null;
            public static final DataType WORKOUT_DATA_KEY_DURATION = null;
            public static final DataType WORKOUT_DATA_KEY_FAT_OUT = null;
            public static final DataType WORKOUT_DATA_KEY_FITNESS_AGE = null;
            public static final DataType WORKOUT_DATA_KEY_FLAG = null;
            public static final DataType WORKOUT_DATA_KEY_FRONTCRAWL_PERC = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_RUN_STEP_LEN = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_SWIM_TYPE = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_HR_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_ID = null;
            public static final DataType WORKOUT_DATA_KEY_KCAL_OUT = null;
            public static final DataType WORKOUT_DATA_KEY_LACTATE_PACE = null;
            public static final DataType WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR = null;
            public static final DataType WORKOUT_DATA_KEY_LEVEL_OUT = null;
            public static final DataType WORKOUT_DATA_KEY_METS_OUT_STATIC = null;
            public static final DataType WORKOUT_DATA_KEY_MET_OUT = null;
            public static final DataType WORKOUT_DATA_KEY_MODE = null;
            public static final DataType WORKOUT_DATA_KEY_NONE = null;
            public static final DataType WORKOUT_DATA_KEY_PACE = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_AVG = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_FASTEST = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_PACE_SLOWEST = null;
            public static final DataType WORKOUT_DATA_KEY_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_PAUSED_DURATION = null;
            public static final DataType WORKOUT_DATA_KEY_PERSONAL_ZONE = null;
            public static final DataType WORKOUT_DATA_KEY_POWER_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_RECOVERY_TIME = null;
            public static final DataType WORKOUT_DATA_KEY_SATELLITE_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED_AVG = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED_PATH_POINTS = null;
            public static final DataType WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO = null;
            public static final DataType WORKOUT_DATA_KEY_SPM_AVG = null;
            public static final DataType WORKOUT_DATA_KEY_SPM_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_SPM_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_STAMINA = null;
            public static final DataType WORKOUT_DATA_KEY_START = null;
            public static final DataType WORKOUT_DATA_KEY_STEPS = null;
            public static final DataType WORKOUT_DATA_KEY_STRESS_COUNT = null;
            public static final DataType WORKOUT_DATA_KEY_STRESS_CURRENT = null;
            public static final DataType WORKOUT_DATA_KEY_STRESS_MAX = null;
            public static final DataType WORKOUT_DATA_KEY_STRESS_MIN = null;
            public static final DataType WORKOUT_DATA_KEY_STRESS_TOTAL = null;
            public static final DataType WORKOUT_DATA_KEY_STROKE_CNT = null;
            public static final DataType WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER = null;
            public static final DataType WORKOUT_DATA_KEY_SWOLF = null;
            public static final DataType WORKOUT_DATA_KEY_SYNC_FLAG = null;
            public static final DataType WORKOUT_DATA_KEY_TE_AEROBIC = null;
            public static final DataType WORKOUT_DATA_KEY_TE_ANAEROBIC = null;
            public static final DataType WORKOUT_DATA_KEY_TL_TREND = null;
            public static final DataType WORKOUT_DATA_KEY_TRAINING_LOAD = null;
            public static final DataType WORKOUT_DATA_KEY_TRAINING_STATUS = null;
            public static final DataType WORKOUT_DATA_KEY_TRANSITION_DURATION = null;
            public static final DataType WORKOUT_DATA_KEY_VO2MAX = null;
            public static final DataType WORKOUT_DATA_KEY_WITH_GPS = null;

            private static final /* synthetic */ DataType[] $values() {
                return new DataType[]{WORKOUT_DATA_KEY_NONE, WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER, WORKOUT_DATA_KEY_ID, WORKOUT_DATA_KEY_MODE, WORKOUT_DATA_KEY_FLAG, WORKOUT_DATA_KEY_WITH_GPS, WORKOUT_DATA_KEY_SYNC_FLAG, WORKOUT_DATA_KEY_START, WORKOUT_DATA_KEY_DURATION, WORKOUT_DATA_KEY_PAUSED_DURATION, WORKOUT_DATA_KEY_BPM_CURRENT, WORKOUT_DATA_KEY_BPM_MIN, WORKOUT_DATA_KEY_BPM_MAX, WORKOUT_DATA_KEY_BPM_COUNT, WORKOUT_DATA_KEY_BPM_TOTAL, WORKOUT_DATA_KEY_STEPS, WORKOUT_DATA_KEY_DISTANCE, WORKOUT_DATA_KEY_CALORIE, WORKOUT_DATA_KEY_ALTITUDE_CURRENT, WORKOUT_DATA_KEY_ALTITUDE_MIN, WORKOUT_DATA_KEY_ALTITUDE_MAX, WORKOUT_DATA_KEY_ALTITUDE_ASCEND, WORKOUT_DATA_KEY_ALTITUDE_DESCEND, WORKOUT_DATA_KEY_ALTITUDE_COUNT, WORKOUT_DATA_KEY_ALTITUDE_TOTAL, WORKOUT_DATA_KEY_AIR_PRESSURE, WORKOUT_DATA_KEY_SPEED, WORKOUT_DATA_KEY_SATELLITE_COUNT, WORKOUT_DATA_KEY_SPM_AVG, WORKOUT_DATA_KEY_SPM_MAX, WORKOUT_DATA_KEY_SPM_MIN, WORKOUT_DATA_KEY_PACE_AVG, WORKOUT_DATA_KEY_PACE_FASTEST, WORKOUT_DATA_KEY_PACE_SLOWEST, WORKOUT_DATA_KEY_STRESS_CURRENT, WORKOUT_DATA_KEY_STRESS_MIN, WORKOUT_DATA_KEY_STRESS_MAX, WORKOUT_DATA_KEY_STRESS_COUNT, WORKOUT_DATA_KEY_STRESS_TOTAL, WORKOUT_DATA_KEY_SPEED_MAX, WORKOUT_DATA_KEY_SPEED_MIN, WORKOUT_DATA_KEY_BARO_DATA, WORKOUT_DATA_KEY_PACE, WORKOUT_DATA_KEY_PACE_MAX, WORKOUT_DATA_KEY_PACE_MIN, WORKOUT_DATA_KEY_SPEED_AVG, WORKOUT_DATA_KEY_STAMINA, WORKOUT_DATA_KEY_AEROBIC, WORKOUT_DATA_KEY_ANAEROBIC, WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT, WORKOUT_DATA_KEY_GOMORE_SWIM_TYPE, WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT, WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE, WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK, WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT, WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT, WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT, WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT, WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT, WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT, WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT, WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT, WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT, WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING, WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING, WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE, WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT, WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE, WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX, WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE, WORKOUT_DATA_KEY_GOMORE_RUN_STEP_LEN, WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION, WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT, WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE, WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX, WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS, WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME, WORKOUT_DATA_KEY_VO2MAX, WORKOUT_DATA_KEY_PERSONAL_ZONE, WORKOUT_DATA_KEY_RECOVERY_TIME, WORKOUT_DATA_KEY_TRAINING_LOAD, WORKOUT_DATA_KEY_TRAINING_STATUS, WORKOUT_DATA_KEY_FITNESS_AGE, WORKOUT_DATA_KEY_KCAL_OUT, WORKOUT_DATA_KEY_MET_OUT, WORKOUT_DATA_KEY_FAT_OUT, WORKOUT_DATA_KEY_CARBO_OUT, WORKOUT_DATA_KEY_LEVEL_OUT, WORKOUT_DATA_KEY_TE_AEROBIC, WORKOUT_DATA_KEY_TE_ANAEROBIC, WORKOUT_DATA_KEY_CNT_LAP, WORKOUT_DATA_KEY_SWOLF, WORKOUT_DATA_KEY_CYCLING_INDEX_FTP, WORKOUT_DATA_KEY_METS_OUT_STATIC, WORKOUT_DATA_KEY_TL_TREND, WORKOUT_DATA_KEY_STROKE_CNT, WORKOUT_DATA_KEY_FRONTCRAWL_PERC, WORKOUT_DATA_KEY_BREASTSTROKE_PERC, WORKOUT_DATA_KEY_BACKSTROKE_PERC, WORKOUT_DATA_KEY_BUTTERFLY_PERC, WORKOUT_DATA_KEY_PATH_POINTS, WORKOUT_DATA_KEY_PATH_POINTS_INFO, WORKOUT_DATA_KEY_HR_PATH_POINTS, WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO, WORKOUT_DATA_KEY_PACE_PATH_POINTS, WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO, WORKOUT_DATA_KEY_POWER_PATH_POINTS, WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO, WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS, WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO, WORKOUT_DATA_KEY_SPEED_PATH_POINTS, WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO, WORKOUT_DATA_KEY_TRANSITION_DURATION, WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR, WORKOUT_DATA_KEY_LACTATE_PACE, WORKOUT_DATA_KEY_BEST_RUN_TIME, CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME, CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME, CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE, CD_WORKOUT_DATA_KEY_TIME_STATUS, CD_WORKOUT_DATA_KEY_TARGET_DISTANCE, CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE, CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE, CD_WORKOUT_DATA_KEY_DISTANCE_STATUS, CD_WORKOUT_DATA_KEY_TARGET_PACE, CD_WORKOUT_DATA_KEY_ACTUAL_PACE, CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE, CD_WORKOUT_DATA_KEY_PACE_STATUS, CD_WORKOUT_DATA_KEY_TARGET_SPEED, CD_WORKOUT_DATA_KEY_ACTUAL_SPEED, CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE, CD_WORKOUT_DATA_KEY_SPEED_STATUS, CD_WORKOUT_DATA_KEY_ANIM_COORDINATE, CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID, CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN, CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT, CD_WORKOUT_DATA_KEY_WEEK_TREND, CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT, CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS, CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO, CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS, CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO, CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS, CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE, CD_WORKOUT_DATA_KEY_PATH_POINTS_WIDTH, CD_WORKOUT_DATA_KEY_PATH_POINTS_HEIGHT, CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS, CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO, CD_WORKOUT_DATA_KEY_PERIPHERAL_STATUS, CD_WORKOUT_DATA_KEY_POOL_LENGTH, CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1, CD_WORKOUT_DATA_KEY_MAX};
            }

            static {
                WORKOUT_DATA_KEY_NONE = new DataType("WORKOUT_DATA_KEY_NONE", 0);
                WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER = new DataType("WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER", 1);
                WORKOUT_DATA_KEY_ID = new DataType("WORKOUT_DATA_KEY_ID", 2);
                WORKOUT_DATA_KEY_MODE = new DataType("WORKOUT_DATA_KEY_MODE", 3);
                WORKOUT_DATA_KEY_FLAG = new DataType("WORKOUT_DATA_KEY_FLAG", 4);
                WORKOUT_DATA_KEY_WITH_GPS = new DataType("WORKOUT_DATA_KEY_WITH_GPS", 5);
                WORKOUT_DATA_KEY_SYNC_FLAG = new DataType("WORKOUT_DATA_KEY_SYNC_FLAG", 6);
                WORKOUT_DATA_KEY_START = new DataType("WORKOUT_DATA_KEY_START", 7);
                WORKOUT_DATA_KEY_DURATION = new DataType("WORKOUT_DATA_KEY_DURATION", 8);
                WORKOUT_DATA_KEY_PAUSED_DURATION = new DataType("WORKOUT_DATA_KEY_PAUSED_DURATION", 9);
                WORKOUT_DATA_KEY_BPM_CURRENT = new DataType("WORKOUT_DATA_KEY_BPM_CURRENT", 10);
                WORKOUT_DATA_KEY_BPM_MIN = new DataType("WORKOUT_DATA_KEY_BPM_MIN", 11);
                WORKOUT_DATA_KEY_BPM_MAX = new DataType("WORKOUT_DATA_KEY_BPM_MAX", 12);
                WORKOUT_DATA_KEY_BPM_COUNT = new DataType("WORKOUT_DATA_KEY_BPM_COUNT", 13);
                WORKOUT_DATA_KEY_BPM_TOTAL = new DataType("WORKOUT_DATA_KEY_BPM_TOTAL", 14);
                WORKOUT_DATA_KEY_STEPS = new DataType("WORKOUT_DATA_KEY_STEPS", 15);
                WORKOUT_DATA_KEY_DISTANCE = new DataType("WORKOUT_DATA_KEY_DISTANCE", 16);
                WORKOUT_DATA_KEY_CALORIE = new DataType("WORKOUT_DATA_KEY_CALORIE", 17);
                WORKOUT_DATA_KEY_ALTITUDE_CURRENT = new DataType("WORKOUT_DATA_KEY_ALTITUDE_CURRENT", 18);
                WORKOUT_DATA_KEY_ALTITUDE_MIN = new DataType("WORKOUT_DATA_KEY_ALTITUDE_MIN", 19);
                WORKOUT_DATA_KEY_ALTITUDE_MAX = new DataType("WORKOUT_DATA_KEY_ALTITUDE_MAX", 20);
                WORKOUT_DATA_KEY_ALTITUDE_ASCEND = new DataType("WORKOUT_DATA_KEY_ALTITUDE_ASCEND", 21);
                WORKOUT_DATA_KEY_ALTITUDE_DESCEND = new DataType("WORKOUT_DATA_KEY_ALTITUDE_DESCEND", 22);
                WORKOUT_DATA_KEY_ALTITUDE_COUNT = new DataType("WORKOUT_DATA_KEY_ALTITUDE_COUNT", 23);
                WORKOUT_DATA_KEY_ALTITUDE_TOTAL = new DataType("WORKOUT_DATA_KEY_ALTITUDE_TOTAL", 24);
                WORKOUT_DATA_KEY_AIR_PRESSURE = new DataType("WORKOUT_DATA_KEY_AIR_PRESSURE", 25);
                WORKOUT_DATA_KEY_SPEED = new DataType("WORKOUT_DATA_KEY_SPEED", 26);
                WORKOUT_DATA_KEY_SATELLITE_COUNT = new DataType("WORKOUT_DATA_KEY_SATELLITE_COUNT", 27);
                WORKOUT_DATA_KEY_SPM_AVG = new DataType("WORKOUT_DATA_KEY_SPM_AVG", 28);
                WORKOUT_DATA_KEY_SPM_MAX = new DataType("WORKOUT_DATA_KEY_SPM_MAX", 29);
                WORKOUT_DATA_KEY_SPM_MIN = new DataType("WORKOUT_DATA_KEY_SPM_MIN", 30);
                WORKOUT_DATA_KEY_PACE_AVG = new DataType("WORKOUT_DATA_KEY_PACE_AVG", 31);
                WORKOUT_DATA_KEY_PACE_FASTEST = new DataType("WORKOUT_DATA_KEY_PACE_FASTEST", 32);
                WORKOUT_DATA_KEY_PACE_SLOWEST = new DataType("WORKOUT_DATA_KEY_PACE_SLOWEST", 33);
                WORKOUT_DATA_KEY_STRESS_CURRENT = new DataType("WORKOUT_DATA_KEY_STRESS_CURRENT", 34);
                WORKOUT_DATA_KEY_STRESS_MIN = new DataType("WORKOUT_DATA_KEY_STRESS_MIN", 35);
                WORKOUT_DATA_KEY_STRESS_MAX = new DataType("WORKOUT_DATA_KEY_STRESS_MAX", 36);
                WORKOUT_DATA_KEY_STRESS_COUNT = new DataType("WORKOUT_DATA_KEY_STRESS_COUNT", 37);
                WORKOUT_DATA_KEY_STRESS_TOTAL = new DataType("WORKOUT_DATA_KEY_STRESS_TOTAL", 38);
                WORKOUT_DATA_KEY_SPEED_MAX = new DataType("WORKOUT_DATA_KEY_SPEED_MAX", 39);
                WORKOUT_DATA_KEY_SPEED_MIN = new DataType("WORKOUT_DATA_KEY_SPEED_MIN", 40);
                WORKOUT_DATA_KEY_BARO_DATA = new DataType("WORKOUT_DATA_KEY_BARO_DATA", 41);
                WORKOUT_DATA_KEY_PACE = new DataType("WORKOUT_DATA_KEY_PACE", 42);
                WORKOUT_DATA_KEY_PACE_MAX = new DataType("WORKOUT_DATA_KEY_PACE_MAX", 43);
                WORKOUT_DATA_KEY_PACE_MIN = new DataType("WORKOUT_DATA_KEY_PACE_MIN", 44);
                WORKOUT_DATA_KEY_SPEED_AVG = new DataType("WORKOUT_DATA_KEY_SPEED_AVG", 45);
                WORKOUT_DATA_KEY_STAMINA = new DataType("WORKOUT_DATA_KEY_STAMINA", 46);
                WORKOUT_DATA_KEY_AEROBIC = new DataType("WORKOUT_DATA_KEY_AEROBIC", 47);
                WORKOUT_DATA_KEY_ANAEROBIC = new DataType("WORKOUT_DATA_KEY_ANAEROBIC", 48);
                WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT", 49);
                WORKOUT_DATA_KEY_GOMORE_SWIM_TYPE = new DataType("WORKOUT_DATA_KEY_GOMORE_SWIM_TYPE", 50);
                WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT", 51);
                WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE = new DataType("WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE", 52);
                WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK = new DataType("WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK", 53);
                WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT", 54);
                WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT", 55);
                WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT", 56);
                WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT", 57);
                WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT", 58);
                WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT", 59);
                WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT", 60);
                WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT", 61);
                WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT", 62);
                WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING = new DataType("WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING", 63);
                WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING = new DataType("WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING", 64);
                WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE = new DataType("WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE", 65);
                WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT = new DataType("WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT", 66);
                WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE = new DataType("WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE", 67);
                WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX = new DataType("WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX", 68);
                WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE = new DataType("WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE", 69);
                WORKOUT_DATA_KEY_GOMORE_RUN_STEP_LEN = new DataType("WORKOUT_DATA_KEY_GOMORE_RUN_STEP_LEN", 70);
                WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION = new DataType("WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION", 71);
                WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT = new DataType("WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT", 72);
                WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE = new DataType("WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE", 73);
                WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX = new DataType("WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX", 74);
                WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS = new DataType("WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS", 75);
                WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME = new DataType("WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME", 76);
                WORKOUT_DATA_KEY_VO2MAX = new DataType("WORKOUT_DATA_KEY_VO2MAX", 77);
                WORKOUT_DATA_KEY_PERSONAL_ZONE = new DataType("WORKOUT_DATA_KEY_PERSONAL_ZONE", 78);
                WORKOUT_DATA_KEY_RECOVERY_TIME = new DataType("WORKOUT_DATA_KEY_RECOVERY_TIME", 79);
                WORKOUT_DATA_KEY_TRAINING_LOAD = new DataType("WORKOUT_DATA_KEY_TRAINING_LOAD", 80);
                WORKOUT_DATA_KEY_TRAINING_STATUS = new DataType("WORKOUT_DATA_KEY_TRAINING_STATUS", 81);
                WORKOUT_DATA_KEY_FITNESS_AGE = new DataType("WORKOUT_DATA_KEY_FITNESS_AGE", 82);
                WORKOUT_DATA_KEY_KCAL_OUT = new DataType("WORKOUT_DATA_KEY_KCAL_OUT", 83);
                WORKOUT_DATA_KEY_MET_OUT = new DataType("WORKOUT_DATA_KEY_MET_OUT", 84);
                WORKOUT_DATA_KEY_FAT_OUT = new DataType("WORKOUT_DATA_KEY_FAT_OUT", 85);
                WORKOUT_DATA_KEY_CARBO_OUT = new DataType("WORKOUT_DATA_KEY_CARBO_OUT", 86);
                WORKOUT_DATA_KEY_LEVEL_OUT = new DataType("WORKOUT_DATA_KEY_LEVEL_OUT", 87);
                WORKOUT_DATA_KEY_TE_AEROBIC = new DataType("WORKOUT_DATA_KEY_TE_AEROBIC", 88);
                WORKOUT_DATA_KEY_TE_ANAEROBIC = new DataType("WORKOUT_DATA_KEY_TE_ANAEROBIC", 89);
                WORKOUT_DATA_KEY_CNT_LAP = new DataType("WORKOUT_DATA_KEY_CNT_LAP", 90);
                WORKOUT_DATA_KEY_SWOLF = new DataType("WORKOUT_DATA_KEY_SWOLF", 91);
                WORKOUT_DATA_KEY_CYCLING_INDEX_FTP = new DataType("WORKOUT_DATA_KEY_CYCLING_INDEX_FTP", 92);
                WORKOUT_DATA_KEY_METS_OUT_STATIC = new DataType("WORKOUT_DATA_KEY_METS_OUT_STATIC", 93);
                WORKOUT_DATA_KEY_TL_TREND = new DataType("WORKOUT_DATA_KEY_TL_TREND", 94);
                WORKOUT_DATA_KEY_STROKE_CNT = new DataType("WORKOUT_DATA_KEY_STROKE_CNT", 95);
                WORKOUT_DATA_KEY_FRONTCRAWL_PERC = new DataType("WORKOUT_DATA_KEY_FRONTCRAWL_PERC", 96);
                WORKOUT_DATA_KEY_BREASTSTROKE_PERC = new DataType("WORKOUT_DATA_KEY_BREASTSTROKE_PERC", 97);
                WORKOUT_DATA_KEY_BACKSTROKE_PERC = new DataType("WORKOUT_DATA_KEY_BACKSTROKE_PERC", 98);
                WORKOUT_DATA_KEY_BUTTERFLY_PERC = new DataType("WORKOUT_DATA_KEY_BUTTERFLY_PERC", 99);
                WORKOUT_DATA_KEY_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_PATH_POINTS", 100);
                WORKOUT_DATA_KEY_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_PATH_POINTS_INFO", 101);
                WORKOUT_DATA_KEY_HR_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_HR_PATH_POINTS", 102);
                WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO", 103);
                WORKOUT_DATA_KEY_PACE_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_PACE_PATH_POINTS", 104);
                WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO", 105);
                WORKOUT_DATA_KEY_POWER_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_POWER_PATH_POINTS", 106);
                WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO", 107);
                WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS", 108);
                WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO", 109);
                WORKOUT_DATA_KEY_SPEED_PATH_POINTS = new DataType("WORKOUT_DATA_KEY_SPEED_PATH_POINTS", 110);
                WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO = new DataType("WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO", 111);
                WORKOUT_DATA_KEY_TRANSITION_DURATION = new DataType("WORKOUT_DATA_KEY_TRANSITION_DURATION", 112);
                WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR = new DataType("WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR", 113);
                WORKOUT_DATA_KEY_LACTATE_PACE = new DataType("WORKOUT_DATA_KEY_LACTATE_PACE", 114);
                WORKOUT_DATA_KEY_BEST_RUN_TIME = new DataType("WORKOUT_DATA_KEY_BEST_RUN_TIME", 115);
                CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME = new DataType("CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME", 116);
                CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME = new DataType("CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME", 117);
                CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE = new DataType("CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE", 118);
                CD_WORKOUT_DATA_KEY_TIME_STATUS = new DataType("CD_WORKOUT_DATA_KEY_TIME_STATUS", 119);
                CD_WORKOUT_DATA_KEY_TARGET_DISTANCE = new DataType("CD_WORKOUT_DATA_KEY_TARGET_DISTANCE", 120);
                CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE = new DataType("CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE", 121);
                CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE = new DataType("CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE", 122);
                CD_WORKOUT_DATA_KEY_DISTANCE_STATUS = new DataType("CD_WORKOUT_DATA_KEY_DISTANCE_STATUS", 123);
                CD_WORKOUT_DATA_KEY_TARGET_PACE = new DataType("CD_WORKOUT_DATA_KEY_TARGET_PACE", 124);
                CD_WORKOUT_DATA_KEY_ACTUAL_PACE = new DataType("CD_WORKOUT_DATA_KEY_ACTUAL_PACE", 125);
                CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE = new DataType("CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE", 126);
                CD_WORKOUT_DATA_KEY_PACE_STATUS = new DataType("CD_WORKOUT_DATA_KEY_PACE_STATUS", 127);
                CD_WORKOUT_DATA_KEY_TARGET_SPEED = new DataType("CD_WORKOUT_DATA_KEY_TARGET_SPEED", 128);
                CD_WORKOUT_DATA_KEY_ACTUAL_SPEED = new DataType("CD_WORKOUT_DATA_KEY_ACTUAL_SPEED", 129);
                CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE = new DataType("CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE", 130);
                CD_WORKOUT_DATA_KEY_SPEED_STATUS = new DataType("CD_WORKOUT_DATA_KEY_SPEED_STATUS", 131);
                CD_WORKOUT_DATA_KEY_ANIM_COORDINATE = new DataType("CD_WORKOUT_DATA_KEY_ANIM_COORDINATE", 132);
                CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID = new DataType("CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID", 133);
                CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN = new DataType("CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN", 134);
                CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT = new DataType("CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT", 135);
                CD_WORKOUT_DATA_KEY_WEEK_TREND = new DataType("CD_WORKOUT_DATA_KEY_WEEK_TREND", 136);
                CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT = new DataType("CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT", 137);
                CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS = new DataType("CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS", 138);
                CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO = new DataType("CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO", 139);
                CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS = new DataType("CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS", 140);
                CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO = new DataType("CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO", 141);
                CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS = new DataType("CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS", 142);
                CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE = new DataType("CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE", 143);
                CD_WORKOUT_DATA_KEY_PATH_POINTS_WIDTH = new DataType("CD_WORKOUT_DATA_KEY_PATH_POINTS_WIDTH", 144);
                CD_WORKOUT_DATA_KEY_PATH_POINTS_HEIGHT = new DataType("CD_WORKOUT_DATA_KEY_PATH_POINTS_HEIGHT", 145);
                CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS = new DataType("CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS", 146);
                CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO = new DataType("CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO", 147);
                CD_WORKOUT_DATA_KEY_PERIPHERAL_STATUS = new DataType("CD_WORKOUT_DATA_KEY_PERIPHERAL_STATUS", 148);
                CD_WORKOUT_DATA_KEY_POOL_LENGTH = new DataType("CD_WORKOUT_DATA_KEY_POOL_LENGTH", 149);
                CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1 = new DataType("CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1", 150);
                CD_WORKOUT_DATA_KEY_MAX = new DataType("CD_WORKOUT_DATA_KEY_MAX", 151);
                DataType[] r0 = $values();
                $VALUES = r0;
                $ENTRIES = EnumEntriesKt.iO(r0);
            }

            private DataType(String r1, int r2) {
                super(r1, r2);
            }

            @aa1
            public static EnumEntries<DataType> getEntries() {
                return $ENTRIES;
            }

            public static DataType valueOf(String r1) {
                return (DataType) Enum.valueOf(DataType.class, r1);
            }

            public static DataType[] values() {
                return (DataType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final ByteOrder getMByteOrder() {
            return BleWorkout4.access$getMByteOrder$cp();
        }

        public final void setMByteOrder(@aa1 ByteOrder r2) {
            Intrinsics.X0O(r2, "<set-?>");
            BleWorkout4.access$setMByteOrder$cp(r2);
        }

        private Companion() {
        }
    }

    public static final class WorkoutFlag {
        public static final int AI_COACH_TYPE_GRADUAL_RUN = 5;
        public static final int AI_COACH_TYPE_INTERVAL_RUN = 3;
        public static final int AI_COACH_TYPE_LONG_RUN = 1;
        public static final int AI_COACH_TYPE_PROGRESSION = 2;
        public static final int AI_COACH_TYPE_RELAXED = 0;
        public static final int AI_COACH_TYPE_STEADY_RUN = 4;

        @aa1
        public static final Companion Companion = null;
        public static final int FLAG_AI_COACH_ASSESS = 8;
        public static final int FLAG_AI_COACH_SPORT = 16;
        public static final int FLAG_LACTATE_THRESHOLD = 1;
        public static final int FLAG_NONE = 0;
        public static final int FLAG_PILOT = 4;
        public static final int FLAG_VO2MAX = 2;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Companion = new Companion(null);
        }

        public WorkoutFlag() {
        }
    }

    static {
        Companion = new Companion(null);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        mByteOrder = r0;
    }

    public BleWorkout4() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        float r25 = 0.0f;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        float r39 = 0.0f;
        float r40 = 0.0f;
        float r41 = 0.0f;
        float r42 = 0.0f;
        float r43 = 0.0f;
        float r44 = 0.0f;
        float r45 = 0.0f;
        int r46 = 0;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        float r50 = 0.0f;
        int r51 = 0;
        int r52 = 0;
        int r53 = 0;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int r57 = 0;
        int r58 = 0;
        int r59 = 0;
        int r60 = 0;
        float r61 = 0.0f;
        float r62 = 0.0f;
        int r63 = 0;
        int[] r64 = null;
        int r65 = 0;
        int r66 = 0;
        int r67 = 0;
        int r68 = 0;
        float[] r69 = null;
        int[] r70 = null;
        float r71 = 0.0f;
        int r72 = 0;
        int r73 = 0;
        List r74 = null;
        int r75 = 0;
        int r76 = 0;
        List r77 = null;
        int r78 = 0;
        int r79 = 0;
        List r80 = null;
        int r81 = 0;
        int r82 = 0;
        List r83 = null;
        int r84 = 0;
        int r85 = 0;
        List r86 = null;
        int r87 = 0;
        int r88 = 0;
        List r89 = null;
        int r90 = 0;
        int r91 = 0;
        List r92 = null;
        int r93 = 0;
        float r94 = 0.0f;
        float r95 = 0.0f;
        float r96 = 0.0f;
        float r97 = 0.0f;
        float r98 = 0.0f;
        int r99 = 0;
        int r100 = 0;
        List r101 = null;
        int r102 = 0;
        List r103 = null;
        int r104 = 0;
        List r105 = null;
        int r106 = 0;
        int r107 = 0;
        int r108 = 0;
        int r109 = 0;
        int r110 = 0;
        int r111 = 0;
        int r112 = 0;
        int r113 = 0;
        int r114 = 0;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        float r118 = 0.0f;
        float r119 = 0.0f;
        int r120 = 0;
        int r121 = 0;
        float r122 = 0.0f;
        float[] r123 = null;
        float[] r124 = null;
        int r125 = 0;
        int r126 = 0;
        int r127 = 0;
        int r128 = 0;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        int r133 = 0;
        int r134 = 0;
        int r135 = 0;
        int r136 = 0;
        int r137 = 0;
        int r138 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        int r144 = 0;
        float r145 = 0.0f;
        float r146 = 0.0f;
        int[] r147 = null;
        int r148 = 0;
        int r149 = -1;
        int r150 = -1;
        int r151 = -1;
        int r152 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, 1048575, null);
    }

    public static final /* synthetic */ ByteOrder access$getMByteOrder$cp() {
        return mByteOrder;
    }

    public static final /* synthetic */ void access$setMByteOrder$cp(ByteOrder r0) {
        mByteOrder = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWorkout4 copy$default(BleWorkout4 r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, float r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, float r63, float r64, float r65, float r66, float r67, float r68, float r69, int r70, int r71, int r72, int r73, float r74, int r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, int r83, int r84, float r85, float r86, int r87, int[] r88, int r89, int r90, int r91, int r92, float[] r93, int[] r94, float r95, int r96, int r97, List r98, int r99, int r100, List r101, int r102, int r103, List r104, int r105, int r106, List r107, int r108, int r109, List r110, int r111, int r112, List r113, int r114, int r115, List r116, int r117, float r118, float r119, float r120, float r121, float r122, int r123, int r124, List r125, int r126, List r127, int r128, List r129, int r130, int r131, int r132, int r133, int r134, int r135, int r136, int r137, int r138, int r139, int r140, int r141, float r142, float r143, int r144, int r145, float r146, float[] r147, float[] r148, int r149, int r150, int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, int r163, int r164, int r165, int r166, int r167, int r168, float r169, float r170, int[] r171, int r172, int r173, int r174, int r175, int r176, int r177, Object r178) {
        if ((r173 & 1) == 0) goto L5;
        int r6 = r24.mStart;
    L7:
        if ((r173 & 2) == 0) goto L9;
        int r7 = r24.mEnd;
    L11:
        if ((r173 & 4) == 0) goto L13;
        int r8 = r24.mSize;
    L15:
        if ((r173 & 8) == 0) goto L17;
        int r9 = r24.mChildNumber;
    L19:
        if ((r173 & 16) == 0) goto L21;
        int r10 = r24.mMode;
    L23:
        if ((r173 & 32) == 0) goto L25;
        int r11 = r24.mDuration;
    L27:
        if ((r173 & 64) == 0) goto L29;
        int r12 = r24.mPausedDuration;
    L31:
        if ((r173 & 128) == 0) goto L33;
        int r13 = r24.mCurBpm;
    L35:
        if ((r173 & 256) == 0) goto L37;
        int r14 = r24.mAvgBpm;
    L39:
        if ((r173 & 512) == 0) goto L41;
        int r15 = r24.mMaxBpm;
    L42:
        int r210 = r6;
        if ((r173 & 1024) == 0) goto L45;
        int r16 = r24.mMinBpm;
    L46:
        int r211 = r16;
        if ((r173 & 2048) == 0) goto L49;
        int r17 = r24.mCountBpm;
    L50:
        int r212 = r17;
        if ((r173 & 4096) == 0) goto L53;
        int r18 = r24.mTotalBpm;
    L54:
        int r213 = r18;
        if ((r173 & 8192) == 0) goto L57;
        int r19 = r24.mStep;
    L58:
        int r214 = r19;
        if ((r173 & 16384) == 0) goto L61;
        int r20 = r24.mDistance;
    L63:
        if ((r173 & 32768) == 0) goto L65;
        int r1 = r24.mCalorie;
    L66:
        int r310 = r1;
        if ((r173 & 65536) == 0) goto L69;
        int r2 = r24.mAltitude;
    L70:
        int r311 = r2;
        if ((r173 & 131072) == 0) goto L73;
        int r3 = r24.mMaxAltitude;
    L74:
        int r312 = r3;
        if ((r173 & 262144) == 0) goto L77;
        int r4 = r24.mMinAltitude;
    L78:
        int r313 = r4;
        if ((r173 & 524288) == 0) goto L81;
        int r5 = r24.mAscendAltitude;
    L82:
        int r314 = r5;
        if ((r173 & 1048576) == 0) goto L85;
        int r21 = r24.mDescendAltitude;
    L86:
        int r315 = r21;
        if ((r173 & 2097152) == 0) goto L89;
        int r22 = r24.mCountAltitude;
    L90:
        int r316 = r22;
        if ((r173 & 4194304) == 0) goto L93;
        int r23 = r24.mTotalAltitude;
    L94:
        int r317 = r23;
        if ((r173 & 8388608) == 0) goto L97;
        int r179 = r24.mAirPressure;
    L98:
        int r318 = r179;
        if ((r173 & 16777216) == 0) goto L101;
        float r180 = r24.mSpeed;
    L102:
        float r319 = r180;
        if ((r173 & 33554432) == 0) goto L105;
        int r181 = r24.mCountSatellite;
    L106:
        int r410 = r181;
        if ((r173 & 67108864) == 0) goto L109;
        int r182 = r24.mSpm;
    L110:
        int r411 = r182;
        if ((r173 & 134217728) == 0) goto L113;
        int r183 = r24.mMaxSpm;
    L114:
        int r412 = r183;
        if ((r173 & 268435456) == 0) goto L117;
        int r184 = r24.mMinSpm;
    L118:
        int r413 = r184;
        if ((r173 & 536870912) == 0) goto L121;
        int r185 = r24.mPace;
    L122:
        int r414 = r185;
        if ((r173 & 1073741824) == 0) goto L125;
        int r186 = r24.mMaxPace;
    L126:
        int r415 = r186;
        if ((r173 & Integer.MIN_VALUE) == 0) goto L129;
        int r187 = r24.mMinPace;
    L130:
        int r416 = r187;
        if ((r174 & 1) == 0) goto L133;
        int r188 = r24.mCurStress;
    L134:
        int r417 = r188;
        if ((r174 & 2) == 0) goto L137;
        int r189 = r24.mAvgStress;
    L138:
        int r418 = r189;
        if ((r174 & 4) == 0) goto L141;
        int r190 = r24.mMinStress;
    L142:
        int r419 = r190;
        if ((r174 & 8) == 0) goto L145;
        int r191 = r24.mMaxStress;
    L146:
        int r510 = r191;
        if ((r174 & 16) == 0) goto L149;
        int r192 = r24.mCountStress;
    L150:
        int r511 = r192;
        if ((r174 & 32) == 0) goto L153;
        int r193 = r24.mTotalStress;
    L154:
        int r512 = r193;
        if ((r174 & 64) == 0) goto L157;
        float r194 = r24.mMaxSpeed;
    L158:
        float r513 = r194;
        if ((r174 & 128) == 0) goto L161;
        float r195 = r24.mMinSpeed;
    L162:
        float r514 = r195;
        if ((r174 & 256) == 0) goto L165;
        float r196 = r24.mAvgSpeed;
    L166:
        float r515 = r196;
        if ((r174 & 512) == 0) goto L169;
        float r197 = r24.mStamina;
    L170:
        float r516 = r197;
        if ((r174 & 1024) == 0) goto L173;
        float r198 = r24.mAerobic;
    L174:
        float r517 = r198;
        if ((r174 & 2048) == 0) goto L177;
        float r199 = r24.mAnaerobic;
    L178:
        float r518 = r199;
        if ((r174 & 4096) == 0) goto L181;
        float r200 = r24.mMetTotal;
    L182:
        float r519 = r200;
        if ((r174 & 8192) == 0) goto L185;
        int r201 = r24.mRecoveryTime;
    L186:
        int r610 = r201;
        if ((r174 & 16384) == 0) goto L189;
        int r202 = r24.mTrainingLoad;
    L190:
        int r611 = r202;
        if ((r174 & 32768) == 0) goto L193;
        int r203 = r24.mMaxVO2;
    L194:
        int r612 = r203;
        if ((r174 & 65536) == 0) goto L197;
        int r204 = r24.mCnt;
    L198:
        int r613 = r204;
        if ((r174 & 131072) == 0) goto L201;
        float r205 = r24.mCadence;
    L202:
        float r614 = r205;
        if ((r174 & 262144) == 0) goto L205;
        int r206 = r24.mMaxCadence;
    L206:
        int r615 = r206;
        if ((r174 & 524288) == 0) goto L209;
        int r207 = r24.mSwimType;
    L210:
        int r616 = r207;
        if ((r174 & 1048576) == 0) goto L213;
        int r208 = r24.mCntFore;
    L214:
        int r617 = r208;
        if ((r174 & 2097152) == 0) goto L217;
        int r209 = r24.mCntBack;
    L218:
        int r618 = r209;
        if ((r174 & 4194304) == 0) goto L221;
        int r215 = r24.mBackSwingTime;
    L222:
        int r619 = r215;
        if ((r174 & 8388608) == 0) goto L225;
        int r216 = r24.mDownSwingTime;
    L226:
        int r710 = r216;
        if ((r174 & 16777216) == 0) goto L229;
        int r217 = r24.mDribbleTime;
    L230:
        int r711 = r217;
        if ((r174 & 33554432) == 0) goto L233;
        int r218 = r24.mTripCount;
    L234:
        int r712 = r218;
        if ((r174 & 67108864) == 0) goto L237;
        int r219 = r24.mSessionCount;
    L238:
        int r713 = r219;
        if ((r174 & 134217728) == 0) goto L241;
        int r220 = r24.mStaBalance;
    L242:
        int r714 = r220;
        if ((r174 & 268435456) == 0) goto L245;
        float r221 = r24.mStepLen;
    L246:
        float r715 = r221;
        if ((r174 & 536870912) == 0) goto L249;
        float r222 = r24.mVerticalOscillation;
    L250:
        float r716 = r222;
        if ((r174 & 1073741824) == 0) goto L253;
        int r223 = r24.mRunPowerWatt;
    L255:
        if ((r174 & Integer.MIN_VALUE) == 0) goto L257;
        int[] r224 = r24.mBpmZoneCount;
    L258:
        int r717 = r223;
        if ((r175 & 1) == 0) goto L261;
        int r225 = r24.mLactateThresholdHr;
    L262:
        int r718 = r225;
        if ((r175 & 2) == 0) goto L265;
        int r226 = r24.mLactateThresholdPace;
    L266:
        int r719 = r226;
        if ((r175 & 4) == 0) goto L269;
        int r227 = r24.mTrainingStatus;
    L270:
        int r810 = r227;
        if ((r175 & 8) == 0) goto L273;
        int r228 = r24.mFitnessAge;
    L274:
        int r811 = r228;
        if ((r175 & 16) == 0) goto L277;
        float[] r229 = r24.mFitnessLevel;
    L278:
        float[] r812 = r229;
        if ((r175 & 32) == 0) goto L281;
        int[] r230 = r24.mBestRunTime;
    L282:
        int[] r813 = r230;
        if ((r175 & 64) == 0) goto L285;
        float r231 = r24.mTlTrend;
    L286:
        float r814 = r231;
        if ((r175 & 128) == 0) goto L289;
        int r232 = r24.mPathCount;
    L290:
        int r815 = r232;
        if ((r175 & 256) == 0) goto L293;
        int r233 = r24.mPathSampleInterval;
    L294:
        int r816 = r233;
        if ((r175 & 512) == 0) goto L297;
        List r234 = r24.mPathPoints;
    L298:
        List r817 = r234;
        if ((r175 & 1024) == 0) goto L301;
        int r235 = r24.mHrPathCount;
    L302:
        int r818 = r235;
        if ((r175 & 2048) == 0) goto L305;
        int r236 = r24.mHrPathSampleInterval;
    L306:
        int r819 = r236;
        if ((r175 & 4096) == 0) goto L309;
        List r237 = r24.mHrPathPoints;
    L310:
        List r910 = r237;
        if ((r175 & 8192) == 0) goto L313;
        int r238 = r24.mPacePathCount;
    L314:
        int r911 = r238;
        if ((r175 & 16384) == 0) goto L317;
        int r239 = r24.mPacePathSampleInterval;
    L318:
        int r912 = r239;
        if ((r175 & 32768) == 0) goto L321;
        List r240 = r24.mPacePathPoints;
    L322:
        List r913 = r240;
        if ((r175 & 65536) == 0) goto L325;
        int r241 = r24.mSpeedPathCount;
    L326:
        int r914 = r241;
        if ((r175 & 131072) == 0) goto L329;
        int r242 = r24.mSpeedPathSampleInterval;
    L330:
        int r915 = r242;
        if ((r175 & 262144) == 0) goto L333;
        List r243 = r24.mSpeedPathPoints;
    L334:
        List r916 = r243;
        if ((r175 & 524288) == 0) goto L337;
        int r244 = r24.mCadencePathCount;
    L338:
        int r917 = r244;
        if ((r175 & 1048576) == 0) goto L341;
        int r245 = r24.mCadencePathSampleInterval;
    L342:
        int r918 = r245;
        if ((r175 & 2097152) == 0) goto L345;
        List r246 = r24.mCadencePathPoints;
    L346:
        List r919 = r246;
        if ((r175 & 4194304) == 0) goto L349;
        int r247 = r24.mAltitudePathCount;
    L350:
        int r1010 = r247;
        if ((r175 & 8388608) == 0) goto L353;
        int r248 = r24.mAltitudePathSampleInterval;
    L354:
        int r1011 = r248;
        if ((r175 & 16777216) == 0) goto L357;
        List r249 = r24.mAltitudePathPoints;
    L358:
        List r1012 = r249;
        if ((r175 & 33554432) == 0) goto L361;
        int r250 = r24.mRecoveryHrCount;
    L362:
        int r1013 = r250;
        if ((r175 & 67108864) == 0) goto L365;
        int r251 = r24.mRecoveryHrSampleInterval;
    L366:
        int r1014 = r251;
        if ((r175 & 134217728) == 0) goto L369;
        List r252 = r24.mRecoveryHrPoints;
    L370:
        List r1015 = r252;
        if ((r175 & 268435456) == 0) goto L373;
        int r253 = r24.mSwimPoolLength;
    L374:
        int r1016 = r253;
        if ((r175 & 536870912) == 0) goto L377;
        float r254 = r24.realTimeAerobic;
    L378:
        float r1017 = r254;
        if ((r175 & 1073741824) == 0) goto L381;
        float r255 = r24.realTimeAnaerobic;
    L383:
        if ((r175 & Integer.MIN_VALUE) == 0) goto L385;
        float r256 = r24.mCalorieTotal;
    L386:
        float r1018 = r255;
        if ((r176 & 1) == 0) goto L389;
        float r257 = r24.mFatTotal;
    L390:
        float r1019 = r257;
        if ((r176 & 2) == 0) goto L393;
        float r258 = r24.mCarboTotal;
    L394:
        float r1110 = r258;
        if ((r176 & 4) == 0) goto L397;
        int r259 = r24.mPowerCount;
    L398:
        int r1111 = r259;
        if ((r176 & 8) == 0) goto L401;
        int r260 = r24.mPowerInterval;
    L402:
        int r1112 = r260;
        if ((r176 & 16) == 0) goto L405;
        List r261 = r24.mPowerPoints;
    L406:
        List r1113 = r261;
        if ((r176 & 32) == 0) goto L409;
        int r262 = r24.mSpmPathPointsCount;
    L410:
        int r1114 = r262;
        if ((r176 & 64) == 0) goto L413;
        List r263 = r24.mSpmPathPointsPoints;
    L414:
        List r1115 = r263;
        if ((r176 & 128) == 0) goto L417;
        int r264 = r24.mStepLenCount;
    L418:
        int r1116 = r264;
        if ((r176 & 256) == 0) goto L421;
        List r265 = r24.mStepLenPoints;
    L422:
        List r1117 = r265;
        if ((r176 & 512) == 0) goto L425;
        int r266 = r24.mNavigatorTargetTime;
    L426:
        int r1118 = r266;
        if ((r176 & 1024) == 0) goto L429;
        int r267 = r24.mNavigatorActualTime;
    L430:
        int r1119 = r267;
        if ((r176 & 2048) == 0) goto L433;
        int r268 = r24.mNavigatorDifferenceTime;
    L434:
        int r1210 = r268;
        if ((r176 & 4096) == 0) goto L437;
        int r269 = r24.mNavigatorStatusTime;
    L438:
        int r1211 = r269;
        if ((r176 & 8192) == 0) goto L441;
        int r270 = r24.mNavigatorTargetDistance;
    L442:
        int r1212 = r270;
        if ((r176 & 16384) == 0) goto L445;
        int r271 = r24.mNavigatorActualDistance;
    L446:
        int r1213 = r271;
        if ((r176 & 32768) == 0) goto L449;
        int r272 = r24.mNavigatorDifferenceDistance;
    L450:
        int r1214 = r272;
        if ((r176 & 65536) == 0) goto L453;
        int r273 = r24.mNavigatorStatusDistance;
    L454:
        int r1215 = r273;
        if ((r176 & 131072) == 0) goto L457;
        int r274 = r24.mNavigatorTargetPace;
    L458:
        int r1216 = r274;
        if ((r176 & 262144) == 0) goto L461;
        int r275 = r24.mNavigatorActualPace;
    L462:
        int r1217 = r275;
        if ((r176 & 524288) == 0) goto L465;
        int r276 = r24.mNavigatorDifferencePace;
    L466:
        int r1218 = r276;
        if ((r176 & 1048576) == 0) goto L469;
        int r277 = r24.mNavigatorStatusPace;
    L470:
        int r1219 = r277;
        if ((r176 & 2097152) == 0) goto L473;
        float r278 = r24.mNavigatorTargetSpeed;
    L474:
        float r1310 = r278;
        if ((r176 & 4194304) == 0) goto L477;
        float r279 = r24.mNavigatorActualSpeed;
    L478:
        float r1311 = r279;
        if ((r176 & 8388608) == 0) goto L481;
        int r280 = r24.mNavigatorDifferenceSpeed;
    L482:
        int r1312 = r280;
        if ((r176 & 16777216) == 0) goto L485;
        int r281 = r24.mNavigatorStatusSpeed;
    L486:
        int r1313 = r281;
        if ((r176 & 33554432) == 0) goto L489;
        float r282 = r24.mMaxOxygenPower;
    L490:
        float r1314 = r282;
        if ((r176 & 67108864) == 0) goto L493;
        float[] r283 = r24.mTrendWeek;
    L494:
        float[] r1315 = r283;
        if ((r176 & 134217728) == 0) goto L497;
        float[] r284 = r24.mCyclingIndex;
    L498:
        float[] r1316 = r284;
        if ((r176 & 268435456) == 0) goto L501;
        int r285 = r24.mSwimSwolf;
    L502:
        int r1317 = r285;
        if ((r176 & 536870912) == 0) goto L505;
        int r286 = r24.mCntLap;
    L506:
        int r1318 = r286;
        if ((r176 & 1073741824) == 0) goto L509;
        int r287 = r24.mFrontCrawlPerc;
    L511:
        if ((r176 & Integer.MIN_VALUE) == 0) goto L513;
        int r288 = r24.mBreaststrokePerc;
    L514:
        int r1319 = r287;
        if ((r177 & 1) == 0) goto L517;
        int r289 = r24.mBackstrokePerc;
    L518:
        int r1410 = r289;
        if ((r177 & 2) == 0) goto L521;
        int r290 = r24.mButterflyPerc;
    L522:
        int r1411 = r290;
        if ((r177 & 4) == 0) goto L525;
        int r291 = r24.mEllipticalSteps;
    L526:
        int r1412 = r291;
        if ((r177 & 8) == 0) goto L529;
        int r292 = r24.mWorkoutFlag;
    L530:
        int r1413 = r292;
        if ((r177 & 16) == 0) goto L533;
        int r293 = r24.mChildSwimStartTime;
    L534:
        int r1414 = r293;
        if ((r177 & 32) == 0) goto L537;
        int r294 = r24.mChildSwimDuration;
    L538:
        int r1415 = r294;
        if ((r177 & 64) == 0) goto L541;
        int r295 = r24.mChildSwimDistance;
    L542:
        int r1416 = r295;
        if ((r177 & 128) == 0) goto L545;
        int r296 = r24.mChildCyclingStartTime;
    L546:
        int r1417 = r296;
        if ((r177 & 256) == 0) goto L549;
        int r297 = r24.mChildCyclingDuration;
    L550:
        int r1418 = r297;
        if ((r177 & 512) == 0) goto L553;
        int r298 = r24.mChildCyclingDistance;
    L554:
        int r1419 = r298;
        if ((r177 & 1024) == 0) goto L557;
        int r299 = r24.mChildRunStartTime;
    L558:
        int r1510 = r299;
        if ((r177 & 2048) == 0) goto L561;
        int r300 = r24.mChildRunDuration;
    L562:
        int r1511 = r300;
        if ((r177 & 4096) == 0) goto L565;
        int r301 = r24.mChildRunDistance;
    L566:
        int r1512 = r301;
        if ((r177 & 8192) == 0) goto L569;
        int r302 = r24.mChildSwimMode;
    L570:
        int r1513 = r302;
        if ((r177 & 16384) == 0) goto L573;
        int r303 = r24.mChildCyclingMode;
    L574:
        int r1514 = r303;
        if ((r177 & 32768) == 0) goto L577;
        int r304 = r24.mChildRunMode;
    L578:
        int r1515 = r304;
        if ((r177 & 65536) == 0) goto L581;
        float r305 = r24.mRunLactateAvg;
    L582:
        float r1516 = r305;
        if ((r177 & 131072) == 0) goto L585;
        float r306 = r24.mCyclingLactateAvg;
    L586:
        float r1517 = r306;
        if ((r177 & 262144) == 0) goto L589;
        int[] r307 = r24.mPersonalZone;
    L591:
        if ((r177 & 524288) == 0) goto L594;
        int r1710 = r24.mAICoachSportID;
    L596:
        return r24.copy(r210, r7, r8, r9, r10, r11, r12, r13, r14, r15, r211, r212, r213, r214, r20, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r410, r411, r412, r413, r414, r415, r416, r417, r418, r419, r510, r511, r512, r513, r514, r515, r516, r517, r518, r519, r610, r611, r612, r613, r614, r615, r616, r617, r618, r619, r710, r711, r712, r713, r714, r715, r716, r717, r224, r718, r719, r810, r811, r812, r813, r814, r815, r816, r817, r818, r819, r910, r911, r912, r913, r914, r915, r916, r917, r918, r919, r1010, r1011, r1012, r1013, r1014, r1015, r1016, r1017, r1018, r256, r1019, r1110, r1111, r1112, r1113, r1114, r1115, r1116, r1117, r1118, r1119, r1210, r1211, r1212, r1213, r1214, r1215, r1216, r1217, r1218, r1219, r1310, r1311, r1312, r1313, r1314, r1315, r1316, r1317, r1318, r1319, r288, r1410, r1411, r1412, r1413, r1414, r1415, r1416, r1417, r1418, r1419, r1510, r1511, r1512, r1513, r1514, r1515, r1516, r1517, r307, r1710);
    L594:
        r1710 = r172;
        goto L596
    L589:
        r307 = r171;
        goto L591
    L585:
        r306 = r170;
        goto L586
    L581:
        r305 = r169;
        goto L582
    L577:
        r304 = r168;
        goto L578
    L573:
        r303 = r167;
        goto L574
    L569:
        r302 = r166;
        goto L570
    L565:
        r301 = r165;
        goto L566
    L561:
        r300 = r164;
        goto L562
    L557:
        r299 = r163;
        goto L558
    L553:
        r298 = r162;
        goto L554
    L549:
        r297 = r161;
        goto L550
    L545:
        r296 = r160;
        goto L546
    L541:
        r295 = r159;
        goto L542
    L537:
        r294 = r158;
        goto L538
    L533:
        r293 = r157;
        goto L534
    L529:
        r292 = r156;
        goto L530
    L525:
        r291 = r155;
        goto L526
    L521:
        r290 = r154;
        goto L522
    L517:
        r289 = r153;
        goto L518
    L513:
        r288 = r152;
        goto L514
    L509:
        r287 = r151;
        goto L511
    L505:
        r286 = r150;
        goto L506
    L501:
        r285 = r149;
        goto L502
    L497:
        r284 = r148;
        goto L498
    L493:
        r283 = r147;
        goto L494
    L489:
        r282 = r146;
        goto L490
    L485:
        r281 = r145;
        goto L486
    L481:
        r280 = r144;
        goto L482
    L477:
        r279 = r143;
        goto L478
    L473:
        r278 = r142;
        goto L474
    L469:
        r277 = r141;
        goto L470
    L465:
        r276 = r140;
        goto L466
    L461:
        r275 = r139;
        goto L462
    L457:
        r274 = r138;
        goto L458
    L453:
        r273 = r137;
        goto L454
    L449:
        r272 = r136;
        goto L450
    L445:
        r271 = r135;
        goto L446
    L441:
        r270 = r134;
        goto L442
    L437:
        r269 = r133;
        goto L438
    L433:
        r268 = r132;
        goto L434
    L429:
        r267 = r131;
        goto L430
    L425:
        r266 = r130;
        goto L426
    L421:
        r265 = r129;
        goto L422
    L417:
        r264 = r128;
        goto L418
    L413:
        r263 = r127;
        goto L414
    L409:
        r262 = r126;
        goto L410
    L405:
        r261 = r125;
        goto L406
    L401:
        r260 = r124;
        goto L402
    L397:
        r259 = r123;
        goto L398
    L393:
        r258 = r122;
        goto L394
    L389:
        r257 = r121;
        goto L390
    L385:
        r256 = r120;
        goto L386
    L381:
        r255 = r119;
        goto L383
    L377:
        r254 = r118;
        goto L378
    L373:
        r253 = r117;
        goto L374
    L369:
        r252 = r116;
        goto L370
    L365:
        r251 = r115;
        goto L366
    L361:
        r250 = r114;
        goto L362
    L357:
        r249 = r113;
        goto L358
    L353:
        r248 = r112;
        goto L354
    L349:
        r247 = r111;
        goto L350
    L345:
        r246 = r110;
        goto L346
    L341:
        r245 = r109;
        goto L342
    L337:
        r244 = r108;
        goto L338
    L333:
        r243 = r107;
        goto L334
    L329:
        r242 = r106;
        goto L330
    L325:
        r241 = r105;
        goto L326
    L321:
        r240 = r104;
        goto L322
    L317:
        r239 = r103;
        goto L318
    L313:
        r238 = r102;
        goto L314
    L309:
        r237 = r101;
        goto L310
    L305:
        r236 = r100;
        goto L306
    L301:
        r235 = r99;
        goto L302
    L297:
        r234 = r98;
        goto L298
    L293:
        r233 = r97;
        goto L294
    L289:
        r232 = r96;
        goto L290
    L285:
        r231 = r95;
        goto L286
    L281:
        r230 = r94;
        goto L282
    L277:
        r229 = r93;
        goto L278
    L273:
        r228 = r92;
        goto L274
    L269:
        r227 = r91;
        goto L270
    L265:
        r226 = r90;
        goto L266
    L261:
        r225 = r89;
        goto L262
    L257:
        r224 = r88;
        goto L258
    L253:
        r223 = r87;
        goto L255
    L249:
        r222 = r86;
        goto L250
    L245:
        r221 = r85;
        goto L246
    L241:
        r220 = r84;
        goto L242
    L237:
        r219 = r83;
        goto L238
    L233:
        r218 = r82;
        goto L234
    L229:
        r217 = r81;
        goto L230
    L225:
        r216 = r80;
        goto L226
    L221:
        r215 = r79;
        goto L222
    L217:
        r209 = r78;
        goto L218
    L213:
        r208 = r77;
        goto L214
    L209:
        r207 = r76;
        goto L210
    L205:
        r206 = r75;
        goto L206
    L201:
        r205 = r74;
        goto L202
    L197:
        r204 = r73;
        goto L198
    L193:
        r203 = r72;
        goto L194
    L189:
        r202 = r71;
        goto L190
    L185:
        r201 = r70;
        goto L186
    L181:
        r200 = r69;
        goto L182
    L177:
        r199 = r68;
        goto L178
    L173:
        r198 = r67;
        goto L174
    L169:
        r197 = r66;
        goto L170
    L165:
        r196 = r65;
        goto L166
    L161:
        r195 = r64;
        goto L162
    L157:
        r194 = r63;
        goto L158
    L153:
        r193 = r62;
        goto L154
    L149:
        r192 = r61;
        goto L150
    L145:
        r191 = r60;
        goto L146
    L141:
        r190 = r59;
        goto L142
    L137:
        r189 = r58;
        goto L138
    L133:
        r188 = r57;
        goto L134
    L129:
        r187 = r56;
        goto L130
    L125:
        r186 = r55;
        goto L126
    L121:
        r185 = r54;
        goto L122
    L117:
        r184 = r53;
        goto L118
    L113:
        r183 = r52;
        goto L114
    L109:
        r182 = r51;
        goto L110
    L105:
        r181 = r50;
        goto L106
    L101:
        r180 = r49;
        goto L102
    L97:
        r179 = r48;
        goto L98
    L93:
        r23 = r47;
        goto L94
    L89:
        r22 = r46;
        goto L90
    L85:
        r21 = r45;
        goto L86
    L81:
        r5 = r44;
        goto L82
    L77:
        r4 = r43;
        goto L78
    L73:
        r3 = r42;
        goto L74
    L69:
        r2 = r41;
        goto L70
    L65:
        r1 = r40;
        goto L66
    L61:
        r20 = r39;
        goto L63
    L57:
        r19 = r38;
        goto L58
    L53:
        r18 = r37;
        goto L54
    L49:
        r17 = r36;
        goto L50
    L45:
        r16 = r35;
        goto L46
    L41:
        r15 = r34;
        goto L42
    L37:
        r14 = r33;
        goto L39
    L33:
        r13 = r32;
        goto L35
    L29:
        r12 = r31;
        goto L31
    L25:
        r11 = r30;
        goto L27
    L21:
        r10 = r29;
        goto L23
    L17:
        r9 = r28;
        goto L19
    L13:
        r8 = r27;
        goto L15
    L9:
        r7 = r26;
        goto L11
    L5:
        r6 = r25;
        goto L7
    }

    private final int readDynamicIntData(int r2, boolean r3) {
        if (r2 != 1) goto L5;
        if (r3 == false) goto L21;
        return readUInt8();
    L21:
        return readInt8();
    L5:
        if (r2 != 2) goto L7;
        if (r3 == false) goto L16;
        return readUInt16(mByteOrder);
    L16:
        return readInt16(mByteOrder);
    L7:
        if (r2 == 4) goto L11;
        readBytes(r2);
        return 0;
    L11:
        return readInt32(mByteOrder);
    }

    public static /* synthetic */ int readDynamicIntData$default(BleWorkout4 r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return r0.readDynamicIntData(r1, r2);
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component10() {
        return this.mMaxBpm;
    }

    public final int component100() {
        return this.mPowerInterval;
    }

    @aa1
    public final List<Integer> component101() {
        return this.mPowerPoints;
    }

    public final int component102() {
        return this.mSpmPathPointsCount;
    }

    @aa1
    public final List<Integer> component103() {
        return this.mSpmPathPointsPoints;
    }

    public final int component104() {
        return this.mStepLenCount;
    }

    @aa1
    public final List<Float> component105() {
        return this.mStepLenPoints;
    }

    public final int component106() {
        return this.mNavigatorTargetTime;
    }

    public final int component107() {
        return this.mNavigatorActualTime;
    }

    public final int component108() {
        return this.mNavigatorDifferenceTime;
    }

    public final int component109() {
        return this.mNavigatorStatusTime;
    }

    public final int component11() {
        return this.mMinBpm;
    }

    public final int component110() {
        return this.mNavigatorTargetDistance;
    }

    public final int component111() {
        return this.mNavigatorActualDistance;
    }

    public final int component112() {
        return this.mNavigatorDifferenceDistance;
    }

    public final int component113() {
        return this.mNavigatorStatusDistance;
    }

    public final int component114() {
        return this.mNavigatorTargetPace;
    }

    public final int component115() {
        return this.mNavigatorActualPace;
    }

    public final int component116() {
        return this.mNavigatorDifferencePace;
    }

    public final int component117() {
        return this.mNavigatorStatusPace;
    }

    public final float component118() {
        return this.mNavigatorTargetSpeed;
    }

    public final float component119() {
        return this.mNavigatorActualSpeed;
    }

    public final int component12() {
        return this.mCountBpm;
    }

    public final int component120() {
        return this.mNavigatorDifferenceSpeed;
    }

    public final int component121() {
        return this.mNavigatorStatusSpeed;
    }

    public final float component122() {
        return this.mMaxOxygenPower;
    }

    @aa1
    public final float[] component123() {
        return this.mTrendWeek;
    }

    @aa1
    public final float[] component124() {
        return this.mCyclingIndex;
    }

    public final int component125() {
        return this.mSwimSwolf;
    }

    public final int component126() {
        return this.mCntLap;
    }

    public final int component127() {
        return this.mFrontCrawlPerc;
    }

    public final int component128() {
        return this.mBreaststrokePerc;
    }

    public final int component129() {
        return this.mBackstrokePerc;
    }

    public final int component13() {
        return this.mTotalBpm;
    }

    public final int component130() {
        return this.mButterflyPerc;
    }

    public final int component131() {
        return this.mEllipticalSteps;
    }

    public final int component132() {
        return this.mWorkoutFlag;
    }

    public final int component133() {
        return this.mChildSwimStartTime;
    }

    public final int component134() {
        return this.mChildSwimDuration;
    }

    public final int component135() {
        return this.mChildSwimDistance;
    }

    public final int component136() {
        return this.mChildCyclingStartTime;
    }

    public final int component137() {
        return this.mChildCyclingDuration;
    }

    public final int component138() {
        return this.mChildCyclingDistance;
    }

    public final int component139() {
        return this.mChildRunStartTime;
    }

    public final int component14() {
        return this.mStep;
    }

    public final int component140() {
        return this.mChildRunDuration;
    }

    public final int component141() {
        return this.mChildRunDistance;
    }

    public final int component142() {
        return this.mChildSwimMode;
    }

    public final int component143() {
        return this.mChildCyclingMode;
    }

    public final int component144() {
        return this.mChildRunMode;
    }

    public final float component145() {
        return this.mRunLactateAvg;
    }

    public final float component146() {
        return this.mCyclingLactateAvg;
    }

    @aa1
    public final int[] component147() {
        return this.mPersonalZone;
    }

    public final int component148() {
        return this.mAICoachSportID;
    }

    public final int component15() {
        return this.mDistance;
    }

    public final int component16() {
        return this.mCalorie;
    }

    public final int component17() {
        return this.mAltitude;
    }

    public final int component18() {
        return this.mMaxAltitude;
    }

    public final int component19() {
        return this.mMinAltitude;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component20() {
        return this.mAscendAltitude;
    }

    public final int component21() {
        return this.mDescendAltitude;
    }

    public final int component22() {
        return this.mCountAltitude;
    }

    public final int component23() {
        return this.mTotalAltitude;
    }

    public final int component24() {
        return this.mAirPressure;
    }

    public final float component25() {
        return this.mSpeed;
    }

    public final int component26() {
        return this.mCountSatellite;
    }

    public final int component27() {
        return this.mSpm;
    }

    public final int component28() {
        return this.mMaxSpm;
    }

    public final int component29() {
        return this.mMinSpm;
    }

    public final int component3() {
        return this.mSize;
    }

    public final int component30() {
        return this.mPace;
    }

    public final int component31() {
        return this.mMaxPace;
    }

    public final int component32() {
        return this.mMinPace;
    }

    public final int component33() {
        return this.mCurStress;
    }

    public final int component34() {
        return this.mAvgStress;
    }

    public final int component35() {
        return this.mMinStress;
    }

    public final int component36() {
        return this.mMaxStress;
    }

    public final int component37() {
        return this.mCountStress;
    }

    public final int component38() {
        return this.mTotalStress;
    }

    public final float component39() {
        return this.mMaxSpeed;
    }

    public final int component4() {
        return this.mChildNumber;
    }

    public final float component40() {
        return this.mMinSpeed;
    }

    public final float component41() {
        return this.mAvgSpeed;
    }

    public final float component42() {
        return this.mStamina;
    }

    public final float component43() {
        return this.mAerobic;
    }

    public final float component44() {
        return this.mAnaerobic;
    }

    public final float component45() {
        return this.mMetTotal;
    }

    public final int component46() {
        return this.mRecoveryTime;
    }

    public final int component47() {
        return this.mTrainingLoad;
    }

    public final int component48() {
        return this.mMaxVO2;
    }

    public final int component49() {
        return this.mCnt;
    }

    public final int component5() {
        return this.mMode;
    }

    public final float component50() {
        return this.mCadence;
    }

    public final int component51() {
        return this.mMaxCadence;
    }

    public final int component52() {
        return this.mSwimType;
    }

    public final int component53() {
        return this.mCntFore;
    }

    public final int component54() {
        return this.mCntBack;
    }

    public final int component55() {
        return this.mBackSwingTime;
    }

    public final int component56() {
        return this.mDownSwingTime;
    }

    public final int component57() {
        return this.mDribbleTime;
    }

    public final int component58() {
        return this.mTripCount;
    }

    public final int component59() {
        return this.mSessionCount;
    }

    public final int component6() {
        return this.mDuration;
    }

    public final int component60() {
        return this.mStaBalance;
    }

    public final float component61() {
        return this.mStepLen;
    }

    public final float component62() {
        return this.mVerticalOscillation;
    }

    public final int component63() {
        return this.mRunPowerWatt;
    }

    @aa1
    public final int[] component64() {
        return this.mBpmZoneCount;
    }

    public final int component65() {
        return this.mLactateThresholdHr;
    }

    public final int component66() {
        return this.mLactateThresholdPace;
    }

    public final int component67() {
        return this.mTrainingStatus;
    }

    public final int component68() {
        return this.mFitnessAge;
    }

    @aa1
    public final float[] component69() {
        return this.mFitnessLevel;
    }

    public final int component7() {
        return this.mPausedDuration;
    }

    @aa1
    public final int[] component70() {
        return this.mBestRunTime;
    }

    public final float component71() {
        return this.mTlTrend;
    }

    public final int component72() {
        return this.mPathCount;
    }

    public final int component73() {
        return this.mPathSampleInterval;
    }

    @aa1
    public final List<float[]> component74() {
        return this.mPathPoints;
    }

    public final int component75() {
        return this.mHrPathCount;
    }

    public final int component76() {
        return this.mHrPathSampleInterval;
    }

    @aa1
    public final List<Integer> component77() {
        return this.mHrPathPoints;
    }

    public final int component78() {
        return this.mPacePathCount;
    }

    public final int component79() {
        return this.mPacePathSampleInterval;
    }

    public final int component8() {
        return this.mCurBpm;
    }

    @aa1
    public final List<Integer> component80() {
        return this.mPacePathPoints;
    }

    public final int component81() {
        return this.mSpeedPathCount;
    }

    public final int component82() {
        return this.mSpeedPathSampleInterval;
    }

    @aa1
    public final List<Integer> component83() {
        return this.mSpeedPathPoints;
    }

    public final int component84() {
        return this.mCadencePathCount;
    }

    public final int component85() {
        return this.mCadencePathSampleInterval;
    }

    @aa1
    public final List<Integer> component86() {
        return this.mCadencePathPoints;
    }

    public final int component87() {
        return this.mAltitudePathCount;
    }

    public final int component88() {
        return this.mAltitudePathSampleInterval;
    }

    @aa1
    public final List<Integer> component89() {
        return this.mAltitudePathPoints;
    }

    public final int component9() {
        return this.mAvgBpm;
    }

    public final int component90() {
        return this.mRecoveryHrCount;
    }

    public final int component91() {
        return this.mRecoveryHrSampleInterval;
    }

    @aa1
    public final List<Integer> component92() {
        return this.mRecoveryHrPoints;
    }

    public final int component93() {
        return this.mSwimPoolLength;
    }

    public final float component94() {
        return this.realTimeAerobic;
    }

    public final float component95() {
        return this.realTimeAnaerobic;
    }

    public final float component96() {
        return this.mCalorieTotal;
    }

    public final float component97() {
        return this.mFatTotal;
    }

    public final float component98() {
        return this.mCarboTotal;
    }

    public final int component99() {
        return this.mPowerCount;
    }

    @aa1
    public final BleWorkout4 copy(int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, int r163, int r164, int r165, int r166, int r167, int r168, int r169, int r170, int r171, int r172, int r173, int r174, float r175, int r176, int r177, int r178, int r179, int r180, int r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, float r189, float r190, float r191, float r192, float r193, float r194, float r195, int r196, int r197, int r198, int r199, float r200, int r201, int r202, int r203, int r204, int r205, int r206, int r207, int r208, int r209, int r210, float r211, float r212, int r213, @aa1 int[] r214, int r215, int r216, int r217, int r218, @aa1 float[] r219, @aa1 int[] r220, float r221, int r222, int r223, @aa1 List<float[]> r224, int r225, int r226, @aa1 List<Integer> r227, int r228, int r229, @aa1 List<Integer> r230, int r231, int r232, @aa1 List<Integer> r233, int r234, int r235, @aa1 List<Integer> r236, int r237, int r238, @aa1 List<Integer> r239, int r240, int r241, @aa1 List<Integer> r242, int r243, float r244, float r245, float r246, float r247, float r248, int r249, int r250, @aa1 List<Integer> r251, int r252, @aa1 List<Integer> r253, int r254, @aa1 List<Float> r255, int r256, int r257, int r258, int r259, int r260, int r261, int r262, int r263, int r264, int r265, int r266, int r267, float r268, float r269, int r270, int r271, float r272, @aa1 float[] r273, @aa1 float[] r274, int r275, int r276, int r277, int r278, int r279, int r280, int r281, int r282, int r283, int r284, int r285, int r286, int r287, int r288, int r289, int r290, int r291, int r292, int r293, int r294, float r295, float r296, @aa1 int[] r297, int r298) {
        Intrinsics.X0O(r214, "mBpmZoneCount");
        Intrinsics.X0O(r219, "mFitnessLevel");
        Intrinsics.X0O(r220, "mBestRunTime");
        Intrinsics.X0O(r224, "mPathPoints");
        Intrinsics.X0O(r227, "mHrPathPoints");
        Intrinsics.X0O(r230, "mPacePathPoints");
        Intrinsics.X0O(r233, "mSpeedPathPoints");
        Intrinsics.X0O(r236, "mCadencePathPoints");
        Intrinsics.X0O(r239, "mAltitudePathPoints");
        Intrinsics.X0O(r242, "mRecoveryHrPoints");
        Intrinsics.X0O(r251, "mPowerPoints");
        Intrinsics.X0O(r253, "mSpmPathPointsPoints");
        Intrinsics.X0O(r255, "mStepLenPoints");
        Intrinsics.X0O(r273, "mTrendWeek");
        Intrinsics.X0O(r274, "mCyclingIndex");
        Intrinsics.X0O(r297, "mPersonalZone");
        return new BleWorkout4(r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r261, r262, r263, r264, r265, r266, r267, r268, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r293, r294, r295, r296, r297, r298);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = readInt32(mByteOrder);
        this.mDuration = readInt32(mByteOrder) / 1000;
        this.mSize = readUInt16(mByteOrder);
        this.mChildNumber = readInt8();
        this.mMode = readUInt8();
        char r4 = readUInt16(mByteOrder);
        i1O0OXO1O.OXO1.OXO1("workout4 type = " + r4);
    L3:
        char r6 = readUInt16(mByteOrder);
        i1O0OXO1O.OXO1.OXO1("workout4 len = " + r6);
        if (r6 != 0) goto L6;
    L537:
        r4 = readUInt16(mByteOrder);
        i1O0OXO1O.OXO1.OXO1("workout4 type = " + r4);
        if (r4 > 0) goto L3;
        this.mEnd = (this.mStart + this.mDuration) + (this.mPausedDuration / 1000);
        return;
    L6:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PAUSED_DURATION.ordinal()) goto L9;
        this.mPausedDuration = readInt32(mByteOrder);
        Unit r5 = Unit.OXO1;
        goto L537
    L9:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BPM_CURRENT.ordinal()) goto L12;
        this.mCurBpm = readUInt8();
        Unit r7 = Unit.OXO1;
        goto L537
    L12:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BPM_MIN.ordinal()) goto L15;
        this.mMinBpm = readUInt8();
        Unit r8 = Unit.OXO1;
        goto L537
    L15:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BPM_MAX.ordinal()) goto L18;
        this.mMaxBpm = readUInt8();
        Unit r9 = Unit.OXO1;
        goto L537
    L18:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BPM_COUNT.ordinal()) goto L24;
        int r10 = readInt32(mByteOrder);
        this.mCountBpm = r10;
        int r11 = this.mTotalBpm;
        if (r11 == 0) goto L22;
        this.mAvgBpm = r11 / r10;
    L22:
        Unit r12 = Unit.OXO1;
        goto L537
    L24:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BPM_TOTAL.ordinal()) goto L30;
        int r13 = readInt32(mByteOrder);
        this.mTotalBpm = r13;
        int r14 = this.mCountBpm;
        if (r14 == 0) goto L28;
        this.mAvgBpm = r13 / r14;
    L28:
        Unit r15 = Unit.OXO1;
        goto L537
    L30:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STEPS.ordinal()) goto L33;
        this.mStep = readInt32(mByteOrder);
        Unit r16 = Unit.OXO1;
        goto L537
    L33:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_DISTANCE.ordinal()) goto L36;
        this.mDistance = readInt32(mByteOrder);
        Unit r17 = Unit.OXO1;
        goto L537
    L36:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_CALORIE.ordinal()) goto L39;
        this.mCalorie = readInt32(mByteOrder);
        Unit r18 = Unit.OXO1;
        goto L537
    L39:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_CURRENT.ordinal()) goto L42;
        this.mAltitude = readInt16(mByteOrder);
        Unit r19 = Unit.OXO1;
        goto L537
    L42:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_MIN.ordinal()) goto L45;
        this.mMinAltitude = readInt16(mByteOrder);
        Unit r20 = Unit.OXO1;
        goto L537
    L45:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_MAX.ordinal()) goto L48;
        this.mMaxAltitude = readInt16(mByteOrder);
        Unit r21 = Unit.OXO1;
        goto L537
    L48:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_ASCEND.ordinal()) goto L51;
        this.mAscendAltitude = readInt16(mByteOrder);
        Unit r22 = Unit.OXO1;
        goto L537
    L51:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_DESCEND.ordinal()) goto L54;
        this.mDescendAltitude = readInt16(mByteOrder);
        Unit r23 = Unit.OXO1;
        goto L537
    L54:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_COUNT.ordinal()) goto L57;
        this.mCountAltitude = readInt32(mByteOrder);
        Unit r24 = Unit.OXO1;
        goto L537
    L57:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_TOTAL.ordinal()) goto L60;
        this.mTotalAltitude = readInt32(mByteOrder);
        Unit r25 = Unit.OXO1;
        goto L537
    L60:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_AIR_PRESSURE.ordinal()) goto L63;
        this.mAirPressure = readInt16(mByteOrder);
        Unit r26 = Unit.OXO1;
        goto L537
    L63:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED.ordinal()) goto L66;
        this.mSpeed = readFloat(mByteOrder);
        Unit r27 = Unit.OXO1;
        goto L537
    L66:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SATELLITE_COUNT.ordinal()) goto L69;
        this.mCountSatellite = readInt32(mByteOrder);
        Unit r28 = Unit.OXO1;
        goto L537
    L69:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPM_AVG.ordinal()) goto L72;
        this.mSpm = readUInt16(mByteOrder);
        Unit r29 = Unit.OXO1;
        goto L537
    L72:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPM_MAX.ordinal()) goto L75;
        this.mMaxSpm = readUInt16(mByteOrder);
        Unit r30 = Unit.OXO1;
        goto L537
    L75:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPM_MIN.ordinal()) goto L78;
        this.mMinSpm = readUInt16(mByteOrder);
        Unit r31 = Unit.OXO1;
        goto L537
    L78:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PACE_AVG.ordinal()) goto L81;
        this.mPace = readInt32(mByteOrder);
        Unit r32 = Unit.OXO1;
        goto L537
    L81:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PACE_FASTEST.ordinal()) goto L84;
        this.mMinPace = readInt32(mByteOrder);
        Unit r33 = Unit.OXO1;
        goto L537
    L84:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PACE_SLOWEST.ordinal()) goto L87;
        this.mMaxPace = readInt32(mByteOrder);
        Unit r34 = Unit.OXO1;
        goto L537
    L87:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STRESS_CURRENT.ordinal()) goto L90;
        this.mCurStress = readUInt8();
        Unit r35 = Unit.OXO1;
        goto L537
    L90:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STRESS_MIN.ordinal()) goto L93;
        this.mMinStress = readUInt8();
        Unit r36 = Unit.OXO1;
        goto L537
    L93:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STRESS_MAX.ordinal()) goto L96;
        this.mMaxStress = readUInt8();
        Unit r37 = Unit.OXO1;
        goto L537
    L96:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STRESS_COUNT.ordinal()) goto L102;
        int r38 = readInt32(mByteOrder);
        this.mCountStress = r38;
        int r39 = this.mTotalStress;
        if (r39 == 0) goto L100;
        this.mAvgStress = r39 / r38;
    L100:
        Unit r40 = Unit.OXO1;
        goto L537
    L102:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STRESS_TOTAL.ordinal()) goto L108;
        int r41 = readInt32(mByteOrder);
        this.mTotalStress = r41;
        int r42 = this.mCountStress;
        if (r42 == 0) goto L106;
        this.mAvgStress = r41 / r42;
    L106:
        Unit r43 = Unit.OXO1;
        goto L537
    L108:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED_MAX.ordinal()) goto L111;
        this.mMaxSpeed = readFloat(mByteOrder);
        Unit r44 = Unit.OXO1;
        goto L537
    L111:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED_MIN.ordinal()) goto L114;
        this.mMinSpeed = readFloat(mByteOrder);
        Unit r45 = Unit.OXO1;
        goto L537
    L114:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED_AVG.ordinal()) goto L117;
        this.mAvgSpeed = readFloat(mByteOrder);
        Unit r46 = Unit.OXO1;
        goto L537
    L117:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_STAMINA.ordinal()) goto L120;
        this.mStamina = readFloat(mByteOrder);
        Unit r47 = Unit.OXO1;
        goto L537
    L120:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_TE_AEROBIC.ordinal()) goto L123;
        this.mAerobic = readFloat(mByteOrder);
        Unit r48 = Unit.OXO1;
        goto L537
    L123:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_TE_ANAEROBIC.ordinal()) goto L126;
        this.mAnaerobic = readFloat(mByteOrder);
        Unit r49 = Unit.OXO1;
        goto L537
    L126:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_TRAINING_LOAD.ordinal()) goto L129;
        this.mTrainingLoad = readUInt16(mByteOrder);
        Unit r50 = Unit.OXO1;
        goto L537
    L129:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_VO2MAX.ordinal()) goto L132;
        this.mMaxVO2 = readInt16(mByteOrder);
        Unit r51 = Unit.OXO1;
        goto L537
    L132:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_RECOVERY_TIME.ordinal()) goto L140;
        if (r6 == 2) goto L137;
        if (r6 == 4) goto L136;
        readBytes(r6);
        int r52 = 0;
    L138:
        this.mRecoveryTime = r52;
        Unit r53 = Unit.OXO1;
        goto L537
    L136:
        r52 = (int) readUInt32(mByteOrder);
        goto L138
    L137:
        r52 = readUInt16(mByteOrder);
        goto L138
    L140:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT.ordinal()) goto L142;
    L536:
        this.mCnt = readDynamicIntData$default(this, r6, false, 2, null);
        i1O0OXO1O.OXO1.OXO1("workout4  type = " + r4 + " , mCnt = " + this.mCnt);
        Unit r54 = Unit.OXO1;
        goto L537
    L142:
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS.ordinal()) goto L536;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT.ordinal()) goto L536;
        if (r4 == Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT.ordinal()) goto L536;
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE.ordinal()) goto L168;
        this.mSwimType = readUInt8();
        Unit r55 = Unit.OXO1;
        goto L537
    L168:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE.ordinal()) goto L171;
        this.mCntFore = readUInt16(mByteOrder);
        Unit r56 = Unit.OXO1;
        goto L537
    L171:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK.ordinal()) goto L174;
        this.mCntBack = readUInt16(mByteOrder);
        Unit r57 = Unit.OXO1;
        goto L537
    L174:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING.ordinal()) goto L177;
        this.mBackSwingTime = (int) readUInt32(mByteOrder);
        Unit r58 = Unit.OXO1;
        goto L537
    L177:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING.ordinal()) goto L180;
        this.mDownSwingTime = (int) readUInt32(mByteOrder);
        Unit r59 = Unit.OXO1;
        goto L537
    L180:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE.ordinal()) goto L182;
    L535:
        this.mCadence = readFloat(mByteOrder);
        Unit r60 = Unit.OXO1;
        goto L537
    L182:
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE.ordinal()) goto L535;
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE.ordinal()) goto L535;
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX.ordinal()) goto L189;
    L534:
        this.mMaxCadence = (int) (readFloat(mByteOrder) * 1000);
        Unit r61 = Unit.OXO1;
        goto L537
    L189:
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX.ordinal()) goto L534;
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME.ordinal()) goto L195;
        this.mDribbleTime = readDynamicIntData$default(this, r6, false, 2, null);
        Unit r62 = Unit.OXO1;
        goto L537
    L195:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT.ordinal()) goto L197;
    L533:
        this.mTripCount = readUInt16(mByteOrder);
        Unit r63 = Unit.OXO1;
        goto L537
    L197:
        if (r4 == Companion.DataType.WORKOUT_DATA_KEY_STROKE_CNT.ordinal()) goto L533;
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT.ordinal()) goto L203;
        this.mSessionCount = readUInt16(mByteOrder);
        Unit r64 = Unit.OXO1;
        goto L537
    L203:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE.ordinal()) goto L206;
        this.mStaBalance = readUInt16(mByteOrder);
        Unit r65 = Unit.OXO1;
        goto L537
    L206:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN.ordinal()) goto L209;
        this.mStepLen = readFloat(mByteOrder);
        Unit r66 = Unit.OXO1;
        goto L537
    L209:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION.ordinal()) goto L212;
        this.mVerticalOscillation = readFloat(mByteOrder);
        Unit r67 = Unit.OXO1;
        goto L537
    L212:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT.ordinal()) goto L215;
        this.mRunPowerWatt = readUInt16(mByteOrder);
        Unit r68 = Unit.OXO1;
        goto L537
    L215:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT.ordinal()) goto L221;
        int r69 = 0;
    L217:
        if (r69 >= 5) goto L219;
        this.mBpmZoneCount[r69] = readUInt16(mByteOrder);
        r69 = r69 + 1;
        goto L217
    L219:
        Unit r70 = Unit.OXO1;
        goto L537
    L221:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR.ordinal()) goto L224;
        this.mLactateThresholdHr = readUInt8();
        Unit r71 = Unit.OXO1;
        goto L537
    L224:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_LACTATE_PACE.ordinal()) goto L227;
        this.mLactateThresholdPace = readInt32(mByteOrder);
        Unit r72 = Unit.OXO1;
        goto L537
    L227:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_TRAINING_STATUS.ordinal()) goto L230;
        this.mTrainingStatus = readUInt8();
        Unit r73 = Unit.OXO1;
        goto L537
    L230:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_FITNESS_AGE.ordinal()) goto L233;
        this.mFitnessAge = readUInt8();
        Unit r74 = Unit.OXO1;
        goto L537
    L233:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_LEVEL_OUT.ordinal()) goto L239;
        int r75 = 0;
    L235:
        if (r75 >= 9) goto L237;
        this.mFitnessLevel[r75] = readFloat(mByteOrder);
        r75 = r75 + 1;
        goto L235
    L237:
        Unit r76 = Unit.OXO1;
        goto L537
    L239:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PATH_POINTS.ordinal()) goto L248;
        List<float[]> r77 = new ArrayList();
        int r78 = r6 / '\b';
        int r79 = 0;
    L241:
        if (r79 >= r78) goto L243;
        r77.add(new float[]{readFloat(mByteOrder), readFloat(mByteOrder)});
        r79 = r79 + 1;
        goto L241
    L243:
        int r80 = this.mPathCount;
        if (r80 == 0) goto L246;
        r77 = CollectionsKt___CollectionsKt.IO0OOi(r77, r80);
    L246:
        this.mPathPoints = r77;
        Unit r81 = Unit.OXO1;
        goto L537
    L248:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PATH_POINTS_INFO.ordinal()) goto L254;
        this.mPathCount = readInt32(mByteOrder);
        int r82 = this.mPathPoints.size();
        int r83 = this.mPathCount;
        if (r82 <= r83) goto L252;
        this.mPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPathPoints, r83);
    L252:
        this.mPathSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L254:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_HR_PATH_POINTS.ordinal()) goto L263;
        List<Integer> r84 = new ArrayList();
        int r85 = 0;
    L256:
        if (r85 >= r6) goto L258;
        r84.add(Integer.valueOf(readUInt8()));
        r85 = r85 + 1;
        goto L256
    L258:
        int r86 = this.mHrPathCount;
        if (r86 == 0) goto L261;
        r84 = CollectionsKt___CollectionsKt.IO0OOi(r84, r86);
    L261:
        this.mHrPathPoints = r84;
        Unit r87 = Unit.OXO1;
        goto L537
    L263:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO.ordinal()) goto L269;
        this.mHrPathCount = readInt32(mByteOrder);
        if (this.mHrPathPoints.size() <= this.mHrPathCount) goto L267;
        this.mHrPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mHrPathPoints, this.mPathCount);
    L267:
        this.mHrPathSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L269:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PACE_PATH_POINTS.ordinal()) goto L278;
        List<Integer> r88 = new ArrayList();
        int r89 = r6 / 4;
        int r90 = 0;
    L271:
        if (r90 >= r89) goto L273;
        r88.add(Integer.valueOf(readInt32(mByteOrder)));
        r90 = r90 + 1;
        goto L271
    L273:
        int r91 = this.mPacePathCount;
        if (r91 == 0) goto L276;
        r88 = CollectionsKt___CollectionsKt.IO0OOi(r88, r91);
    L276:
        this.mPacePathPoints = r88;
        Unit r92 = Unit.OXO1;
        goto L537
    L278:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO.ordinal()) goto L284;
        this.mPacePathCount = readInt32(mByteOrder);
        int r93 = this.mPacePathPoints.size();
        int r94 = this.mPacePathCount;
        if (r93 <= r94) goto L282;
        this.mPacePathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPacePathPoints, r94);
    L282:
        this.mPacePathSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L284:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED_PATH_POINTS.ordinal()) goto L293;
        List<Integer> r95 = new ArrayList();
        int r96 = r6 / 4;
        int r97 = 0;
    L286:
        if (r97 >= r96) goto L288;
        r95.add(Integer.valueOf((int) readFloat(mByteOrder)));
        r97 = r97 + 1;
        goto L286
    L288:
        int r98 = this.mSpeedPathCount;
        if (r98 == 0) goto L291;
        r95 = CollectionsKt___CollectionsKt.IO0OOi(r95, r98);
    L291:
        this.mSpeedPathPoints = r95;
        Unit r99 = Unit.OXO1;
        goto L537
    L293:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO.ordinal()) goto L299;
        this.mSpeedPathCount = readInt32(mByteOrder);
        int r100 = this.mSpeedPathPoints.size();
        int r101 = this.mSpeedPathCount;
        if (r100 <= r101) goto L297;
        this.mSpeedPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mSpeedPathPoints, r101);
    L297:
        this.mSpeedPathSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L299:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_POWER_PATH_POINTS.ordinal()) goto L319;
        List<Integer> r102 = new ArrayList();
        int r103 = r6 / 2;
        int r104 = 0;
    L301:
        if (r104 >= r103) goto L303;
        r102.add(Integer.valueOf(readInt16(mByteOrder)));
        r104 = r104 + 1;
        goto L301
    L303:
        int r105 = this.mPowerCount;
        if (r105 == 0) goto L306;
        r102 = CollectionsKt___CollectionsKt.IO0OOi(r102, r105);
    L306:
        this.mPowerPoints = r102;
        if (r102.isEmpty() == true) goto L317;
        Iterator r106 = CollectionsKt___CollectionsKt.OO0Oi10(this.mPowerPoints).iterator();
        int r107 = 0;
    L310:
        if (r106.hasNext() == false) goto L316;
        int r108 = ((Number) r106.next()).intValue();
        if (r108 != (-1)) goto L315;
        r108 = 0;
    L315:
        r107 = r107 + r108;
        goto L310
    L316:
        this.mRunLactateAvg = r107 / this.mPowerPoints.size();
    L317:
        Unit r109 = Unit.OXO1;
        goto L537
    L319:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO.ordinal()) goto L325;
        this.mPowerCount = readInt32(mByteOrder);
        int r110 = this.mPowerPoints.size();
        int r111 = this.mPowerCount;
        if (r110 <= r111) goto L323;
        this.mPowerPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPowerPoints, r111);
    L323:
        this.mPowerInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L325:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS.ordinal()) goto L334;
        List<Integer> r112 = new ArrayList();
        int r113 = r6 / 2;
        int r114 = 0;
    L327:
        if (r114 >= r113) goto L329;
        r112.add(Integer.valueOf(readInt16(mByteOrder)));
        r114 = r114 + 1;
        goto L327
    L329:
        int r115 = this.mSpmPathPointsCount;
        if (r115 == 0) goto L332;
        r112 = CollectionsKt___CollectionsKt.IO0OOi(r112, r115);
    L332:
        this.mSpmPathPointsPoints = r112;
        Unit r116 = Unit.OXO1;
        goto L537
    L334:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO.ordinal()) goto L340;
        this.mSpmPathPointsCount = readInt32(mByteOrder);
        int r117 = this.mSpmPathPointsPoints.size();
        int r118 = this.mSpmPathPointsCount;
        if (r117 <= r118) goto L338;
        this.mSpmPathPointsPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mSpmPathPointsPoints, r118);
    L338:
        readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L340:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS.ordinal()) goto L349;
        List<Float> r119 = new ArrayList();
        int r120 = r6 / 4;
        int r121 = 0;
    L342:
        if (r121 >= r120) goto L344;
        r119.add(Float.valueOf(readFloat(mByteOrder)));
        r121 = r121 + 1;
        goto L342
    L344:
        int r122 = this.mStepLenCount;
        if (r122 == 0) goto L347;
        r119 = CollectionsKt___CollectionsKt.IO0OOi(r119, r122);
    L347:
        this.mStepLenPoints = r119;
        Unit r123 = Unit.OXO1;
        goto L537
    L349:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO.ordinal()) goto L355;
        this.mStepLenCount = readInt32(mByteOrder);
        int r124 = this.mStepLenPoints.size();
        int r125 = this.mStepLenCount;
        if (r124 <= r125) goto L353;
        this.mStepLenPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mStepLenPoints, r125);
    L353:
        readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L355:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS.ordinal()) goto L364;
        List<Integer> r126 = new ArrayList();
        int r127 = r6 / 2;
        int r128 = 0;
    L357:
        if (r128 >= r127) goto L359;
        r126.add(Integer.valueOf(readInt16(mByteOrder)));
        r128 = r128 + 1;
        goto L357
    L359:
        int r129 = this.mAltitudePathCount;
        if (r129 == 0) goto L362;
        r126 = CollectionsKt___CollectionsKt.IO0OOi(r126, r129);
    L362:
        this.mAltitudePathPoints = r126;
        Unit r130 = Unit.OXO1;
        goto L537
    L364:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO.ordinal()) goto L370;
        this.mAltitudePathCount = readInt32(mByteOrder);
        int r131 = this.mAltitudePathPoints.size();
        int r132 = this.mAltitudePathCount;
        if (r131 <= r132) goto L368;
        this.mAltitudePathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mAltitudePathPoints, r132);
    L368:
        this.mAltitudePathSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L370:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS.ordinal()) goto L376;
        ArrayList r133 = new ArrayList();
        int r134 = 0;
    L372:
        if (r134 >= r6) goto L374;
        r133.add(Integer.valueOf(readUInt8()));
        r134 = r134 + 1;
        goto L372
    L374:
        this.mRecoveryHrPoints = r133;
        Unit r135 = Unit.OXO1;
        goto L537
    L376:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO.ordinal()) goto L379;
        this.mRecoveryHrCount = readInt32(mByteOrder);
        this.mRecoveryHrSampleInterval = readInt32(mByteOrder);
        readInt32(mByteOrder);
        goto L537
    L379:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_POOL_LENGTH.ordinal()) goto L382;
        this.mSwimPoolLength = readUInt8();
        Unit r136 = Unit.OXO1;
        goto L537
    L382:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1.ordinal()) goto L388;
        int r137 = 0;
    L384:
        if (r137 >= 7) goto L386;
        this.mPersonalZone[r137] = readDynamicIntData$default(this, 2, false, 2, null);
        r137 = r137 + 1;
        goto L384
    L386:
        Unit r138 = Unit.OXO1;
        goto L537
    L388:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BEST_RUN_TIME.ordinal()) goto L397;
        int r139 = 0;
    L390:
        if (r139 >= 5) goto L395;
        char r140 = readUInt16(mByteOrder);
        if (r140 != 65535) goto L394;
        r140 = 0;
    L394:
        this.mBestRunTime[r139] = r140;
        r139 = r139 + 1;
        goto L390
    L395:
        Unit r141 = Unit.OXO1;
        goto L537
    L397:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_TL_TREND.ordinal()) goto L400;
        this.mTlTrend = readFloat(mByteOrder);
        Unit r142 = Unit.OXO1;
        goto L537
    L400:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_AEROBIC.ordinal()) goto L403;
        this.realTimeAerobic = readFloat(mByteOrder);
        Unit r143 = Unit.OXO1;
        goto L537
    L403:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_ANAEROBIC.ordinal()) goto L406;
        this.realTimeAnaerobic = readFloat(mByteOrder);
        Unit r144 = Unit.OXO1;
        goto L537
    L406:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_KCAL_OUT.ordinal()) goto L409;
        this.mCalorieTotal = readFloat(mByteOrder);
        Unit r145 = Unit.OXO1;
        goto L537
    L409:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_FAT_OUT.ordinal()) goto L412;
        this.mFatTotal = readFloat(mByteOrder);
        Unit r146 = Unit.OXO1;
        goto L537
    L412:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_CARBO_OUT.ordinal()) goto L415;
        this.mCarboTotal = readFloat(mByteOrder);
        Unit r147 = Unit.OXO1;
        goto L537
    L415:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME.ordinal()) goto L418;
        this.mNavigatorTargetTime = readInt32(mByteOrder);
        Unit r148 = Unit.OXO1;
        goto L537
    L418:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME.ordinal()) goto L421;
        this.mNavigatorActualTime = readInt32(mByteOrder);
        Unit r149 = Unit.OXO1;
        goto L537
    L421:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE.ordinal()) goto L424;
        this.mNavigatorDifferenceTime = readInt32(mByteOrder);
        Unit r150 = Unit.OXO1;
        goto L537
    L424:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TIME_STATUS.ordinal()) goto L427;
        this.mNavigatorStatusTime = readUInt8();
        Unit r151 = Unit.OXO1;
        goto L537
    L427:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_DISTANCE.ordinal()) goto L430;
        this.mNavigatorTargetDistance = readInt32(mByteOrder);
        Unit r152 = Unit.OXO1;
        goto L537
    L430:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE.ordinal()) goto L433;
        this.mNavigatorActualDistance = readInt32(mByteOrder);
        Unit r153 = Unit.OXO1;
        goto L537
    L433:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE.ordinal()) goto L436;
        this.mNavigatorDifferenceDistance = readInt32(mByteOrder);
        Unit r154 = Unit.OXO1;
        goto L537
    L436:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_DISTANCE_STATUS.ordinal()) goto L439;
        this.mNavigatorStatusDistance = readUInt8();
        Unit r155 = Unit.OXO1;
        goto L537
    L439:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_PACE.ordinal()) goto L442;
        this.mNavigatorTargetPace = readInt32(mByteOrder);
        Unit r156 = Unit.OXO1;
        goto L537
    L442:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_PACE.ordinal()) goto L445;
        this.mNavigatorActualPace = readInt32(mByteOrder);
        Unit r157 = Unit.OXO1;
        goto L537
    L445:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE.ordinal()) goto L448;
        this.mNavigatorDifferencePace = readInt32(mByteOrder);
        Unit r158 = Unit.OXO1;
        goto L537
    L448:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_PACE_STATUS.ordinal()) goto L451;
        this.mNavigatorStatusPace = readUInt8();
        Unit r159 = Unit.OXO1;
        goto L537
    L451:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_SPEED.ordinal()) goto L454;
        this.mNavigatorTargetSpeed = readFloat(mByteOrder);
        Unit r160 = Unit.OXO1;
        goto L537
    L454:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_SPEED.ordinal()) goto L457;
        this.mNavigatorActualSpeed = readFloat(mByteOrder);
        Unit r161 = Unit.OXO1;
        goto L537
    L457:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE.ordinal()) goto L460;
        this.mNavigatorDifferenceSpeed = readInt32(mByteOrder);
        Unit r162 = Unit.OXO1;
        goto L537
    L460:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_SPEED_STATUS.ordinal()) goto L463;
        this.mNavigatorStatusSpeed = readUInt8();
        Unit r163 = Unit.OXO1;
        goto L537
    L463:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_WEEK_TREND.ordinal()) goto L469;
        int r164 = 0;
    L465:
        if (r164 >= 7) goto L467;
        this.mTrendWeek[r164] = readFloat(mByteOrder);
        r164 = r164 + 1;
        goto L465
    L467:
        Unit r165 = Unit.OXO1;
        goto L537
    L469:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_CYCLING_INDEX_FTP.ordinal()) goto L484;
        int r166 = 0;
    L471:
        if (r166 >= 2) goto L473;
        this.mCyclingIndex[r166] = readFloat(mByteOrder);
        r166 = r166 + 1;
        goto L471
    L473:
        float[] r167 = this.mCyclingIndex;
        if (r167.length != 0) goto L476;
        boolean r168 = true;
    L477:
        if (r168 == true) goto L482;
        float r169 = r167[0];
        if (r169 == (-1.0f)) goto L482;
        this.mCyclingLactateAvg = r169;
    L482:
        Unit r170 = Unit.OXO1;
        goto L537
    L476:
        r168 = false;
        goto L477
    L484:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_CNT_LAP.ordinal()) goto L487;
        this.mCntLap = readUInt8();
        Unit r171 = Unit.OXO1;
        goto L537
    L487:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_FRONTCRAWL_PERC.ordinal()) goto L490;
        this.mFrontCrawlPerc = readUInt8();
        Unit r172 = Unit.OXO1;
        goto L537
    L490:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BREASTSTROKE_PERC.ordinal()) goto L493;
        this.mBreaststrokePerc = readUInt8();
        Unit r173 = Unit.OXO1;
        goto L537
    L493:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BACKSTROKE_PERC.ordinal()) goto L496;
        this.mBackstrokePerc = readUInt8();
        Unit r174 = Unit.OXO1;
        goto L537
    L496:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_BUTTERFLY_PERC.ordinal()) goto L499;
        this.mButterflyPerc = readUInt8();
        Unit r175 = Unit.OXO1;
        goto L537
    L499:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_METS_OUT_STATIC.ordinal()) goto L508;
        float[] r176 = new float[5];
        int r177 = 0;
    L501:
        if (r177 >= 5) goto L503;
        r176[r177] = readFloat(mByteOrder);
        r177 = r177 + 1;
        goto L501
    L503:
        this.mMetTotal = 0.0f;
        int r178 = 0;
    L504:
        if (r178 >= 5) goto L506;
        this.mMetTotal += r176[r178];
        r178 = r178 + 1;
        goto L504
    L506:
        Unit r179 = Unit.OXO1;
        goto L537
    L508:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SWOLF.ordinal()) goto L511;
        this.mSwimSwolf = readInt16(mByteOrder);
        Unit r180 = Unit.OXO1;
        goto L537
    L511:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS.ordinal()) goto L514;
        this.mEllipticalSteps = readInt32(mByteOrder);
        Unit r181 = Unit.OXO1;
        goto L537
    L514:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER.ordinal()) goto L527;
        int r182 = readInt32(mByteOrder);
        int r183 = readInt32(mByteOrder);
        readInt32(mByteOrder);
        int r184 = readInt32(mByteOrder);
        char r185 = readUInt8();
        i1O0OXO1O.OXO1.OXO1("workout4 子项目 mode = " + r185 + " , startTime = " + r182 + " , duration = " + r183 + ", distance = " + r184);
        if (r185 != '\t') goto L518;
        this.mChildRunStartTime = r182;
        this.mChildRunDuration = r183;
        this.mChildRunDistance = r184;
        this.mChildRunMode = r185;
    L525:
        readInt8();
        readInt16(mByteOrder);
        goto L537
    L518:
        if (r185 != '\n') goto L520;
        this.mChildCyclingStartTime = r182;
        this.mChildCyclingDuration = r183;
        this.mChildCyclingDistance = r184;
        this.mChildCyclingMode = r185;
        goto L525
    L520:
        if (r185 != 163) goto L525;
        this.mChildSwimStartTime = r182;
        this.mChildSwimDuration = r183;
        this.mChildSwimDistance = r184;
        this.mChildSwimMode = r185;
        goto L525
    L527:
        if (r4 != Companion.DataType.WORKOUT_DATA_KEY_FLAG.ordinal()) goto L530;
        this.mWorkoutFlag = readInt8();
        Unit r186 = Unit.OXO1;
        goto L537
    L530:
        if (r4 != Companion.DataType.CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID.ordinal()) goto L532;
        this.mAICoachSportID = readInt8();
        Unit r187 = Unit.OXO1;
        goto L537
    L532:
        readBytes(r6);
        Unit r188 = Unit.OXO1;
        goto L537
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorkout4) == true) goto L8;
        return false;
    L8:
        BleWorkout4 r6 = (BleWorkout4) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mEnd == r6.mEnd) goto L15;
        return false;
    L15:
        if (this.mSize == r6.mSize) goto L18;
        return false;
    L18:
        if (this.mChildNumber == r6.mChildNumber) goto L21;
        return false;
    L21:
        if (this.mMode == r6.mMode) goto L24;
        return false;
    L24:
        if (this.mDuration == r6.mDuration) goto L27;
        return false;
    L27:
        if (this.mPausedDuration == r6.mPausedDuration) goto L30;
        return false;
    L30:
        if (this.mCurBpm == r6.mCurBpm) goto L33;
        return false;
    L33:
        if (this.mAvgBpm == r6.mAvgBpm) goto L36;
        return false;
    L36:
        if (this.mMaxBpm == r6.mMaxBpm) goto L39;
        return false;
    L39:
        if (this.mMinBpm == r6.mMinBpm) goto L42;
        return false;
    L42:
        if (this.mCountBpm == r6.mCountBpm) goto L45;
        return false;
    L45:
        if (this.mTotalBpm == r6.mTotalBpm) goto L48;
        return false;
    L48:
        if (this.mStep == r6.mStep) goto L51;
        return false;
    L51:
        if (this.mDistance == r6.mDistance) goto L54;
        return false;
    L54:
        if (this.mCalorie == r6.mCalorie) goto L57;
        return false;
    L57:
        if (this.mAltitude == r6.mAltitude) goto L60;
        return false;
    L60:
        if (this.mMaxAltitude == r6.mMaxAltitude) goto L63;
        return false;
    L63:
        if (this.mMinAltitude == r6.mMinAltitude) goto L66;
        return false;
    L66:
        if (this.mAscendAltitude == r6.mAscendAltitude) goto L69;
        return false;
    L69:
        if (this.mDescendAltitude == r6.mDescendAltitude) goto L72;
        return false;
    L72:
        if (this.mCountAltitude == r6.mCountAltitude) goto L75;
        return false;
    L75:
        if (this.mTotalAltitude == r6.mTotalAltitude) goto L78;
        return false;
    L78:
        if (this.mAirPressure == r6.mAirPressure) goto L81;
        return false;
    L81:
        if (Float.compare(this.mSpeed, r6.mSpeed) == 0) goto L84;
        return false;
    L84:
        if (this.mCountSatellite == r6.mCountSatellite) goto L87;
        return false;
    L87:
        if (this.mSpm == r6.mSpm) goto L90;
        return false;
    L90:
        if (this.mMaxSpm == r6.mMaxSpm) goto L93;
        return false;
    L93:
        if (this.mMinSpm == r6.mMinSpm) goto L96;
        return false;
    L96:
        if (this.mPace == r6.mPace) goto L99;
        return false;
    L99:
        if (this.mMaxPace == r6.mMaxPace) goto L102;
        return false;
    L102:
        if (this.mMinPace == r6.mMinPace) goto L105;
        return false;
    L105:
        if (this.mCurStress == r6.mCurStress) goto L108;
        return false;
    L108:
        if (this.mAvgStress == r6.mAvgStress) goto L111;
        return false;
    L111:
        if (this.mMinStress == r6.mMinStress) goto L114;
        return false;
    L114:
        if (this.mMaxStress == r6.mMaxStress) goto L117;
        return false;
    L117:
        if (this.mCountStress == r6.mCountStress) goto L120;
        return false;
    L120:
        if (this.mTotalStress == r6.mTotalStress) goto L123;
        return false;
    L123:
        if (Float.compare(this.mMaxSpeed, r6.mMaxSpeed) == 0) goto L126;
        return false;
    L126:
        if (Float.compare(this.mMinSpeed, r6.mMinSpeed) == 0) goto L129;
        return false;
    L129:
        if (Float.compare(this.mAvgSpeed, r6.mAvgSpeed) == 0) goto L132;
        return false;
    L132:
        if (Float.compare(this.mStamina, r6.mStamina) == 0) goto L135;
        return false;
    L135:
        if (Float.compare(this.mAerobic, r6.mAerobic) == 0) goto L138;
        return false;
    L138:
        if (Float.compare(this.mAnaerobic, r6.mAnaerobic) == 0) goto L141;
        return false;
    L141:
        if (Float.compare(this.mMetTotal, r6.mMetTotal) == 0) goto L144;
        return false;
    L144:
        if (this.mRecoveryTime == r6.mRecoveryTime) goto L147;
        return false;
    L147:
        if (this.mTrainingLoad == r6.mTrainingLoad) goto L150;
        return false;
    L150:
        if (this.mMaxVO2 == r6.mMaxVO2) goto L153;
        return false;
    L153:
        if (this.mCnt == r6.mCnt) goto L156;
        return false;
    L156:
        if (Float.compare(this.mCadence, r6.mCadence) == 0) goto L159;
        return false;
    L159:
        if (this.mMaxCadence == r6.mMaxCadence) goto L162;
        return false;
    L162:
        if (this.mSwimType == r6.mSwimType) goto L165;
        return false;
    L165:
        if (this.mCntFore == r6.mCntFore) goto L168;
        return false;
    L168:
        if (this.mCntBack == r6.mCntBack) goto L171;
        return false;
    L171:
        if (this.mBackSwingTime == r6.mBackSwingTime) goto L174;
        return false;
    L174:
        if (this.mDownSwingTime == r6.mDownSwingTime) goto L177;
        return false;
    L177:
        if (this.mDribbleTime == r6.mDribbleTime) goto L180;
        return false;
    L180:
        if (this.mTripCount == r6.mTripCount) goto L183;
        return false;
    L183:
        if (this.mSessionCount == r6.mSessionCount) goto L186;
        return false;
    L186:
        if (this.mStaBalance == r6.mStaBalance) goto L189;
        return false;
    L189:
        if (Float.compare(this.mStepLen, r6.mStepLen) == 0) goto L192;
        return false;
    L192:
        if (Float.compare(this.mVerticalOscillation, r6.mVerticalOscillation) == 0) goto L195;
        return false;
    L195:
        if (this.mRunPowerWatt == r6.mRunPowerWatt) goto L198;
        return false;
    L198:
        if (Intrinsics.XOO0ii0(this.mBpmZoneCount, r6.mBpmZoneCount) == true) goto L201;
        return false;
    L201:
        if (this.mLactateThresholdHr == r6.mLactateThresholdHr) goto L204;
        return false;
    L204:
        if (this.mLactateThresholdPace == r6.mLactateThresholdPace) goto L207;
        return false;
    L207:
        if (this.mTrainingStatus == r6.mTrainingStatus) goto L210;
        return false;
    L210:
        if (this.mFitnessAge == r6.mFitnessAge) goto L213;
        return false;
    L213:
        if (Intrinsics.XOO0ii0(this.mFitnessLevel, r6.mFitnessLevel) == true) goto L216;
        return false;
    L216:
        if (Intrinsics.XOO0ii0(this.mBestRunTime, r6.mBestRunTime) == true) goto L219;
        return false;
    L219:
        if (Float.compare(this.mTlTrend, r6.mTlTrend) == 0) goto L222;
        return false;
    L222:
        if (this.mPathCount == r6.mPathCount) goto L225;
        return false;
    L225:
        if (this.mPathSampleInterval == r6.mPathSampleInterval) goto L228;
        return false;
    L228:
        if (Intrinsics.XOO0ii0(this.mPathPoints, r6.mPathPoints) == true) goto L231;
        return false;
    L231:
        if (this.mHrPathCount == r6.mHrPathCount) goto L234;
        return false;
    L234:
        if (this.mHrPathSampleInterval == r6.mHrPathSampleInterval) goto L237;
        return false;
    L237:
        if (Intrinsics.XOO0ii0(this.mHrPathPoints, r6.mHrPathPoints) == true) goto L240;
        return false;
    L240:
        if (this.mPacePathCount == r6.mPacePathCount) goto L243;
        return false;
    L243:
        if (this.mPacePathSampleInterval == r6.mPacePathSampleInterval) goto L246;
        return false;
    L246:
        if (Intrinsics.XOO0ii0(this.mPacePathPoints, r6.mPacePathPoints) == true) goto L249;
        return false;
    L249:
        if (this.mSpeedPathCount == r6.mSpeedPathCount) goto L252;
        return false;
    L252:
        if (this.mSpeedPathSampleInterval == r6.mSpeedPathSampleInterval) goto L255;
        return false;
    L255:
        if (Intrinsics.XOO0ii0(this.mSpeedPathPoints, r6.mSpeedPathPoints) == true) goto L258;
        return false;
    L258:
        if (this.mCadencePathCount == r6.mCadencePathCount) goto L261;
        return false;
    L261:
        if (this.mCadencePathSampleInterval == r6.mCadencePathSampleInterval) goto L264;
        return false;
    L264:
        if (Intrinsics.XOO0ii0(this.mCadencePathPoints, r6.mCadencePathPoints) == true) goto L267;
        return false;
    L267:
        if (this.mAltitudePathCount == r6.mAltitudePathCount) goto L270;
        return false;
    L270:
        if (this.mAltitudePathSampleInterval == r6.mAltitudePathSampleInterval) goto L273;
        return false;
    L273:
        if (Intrinsics.XOO0ii0(this.mAltitudePathPoints, r6.mAltitudePathPoints) == true) goto L276;
        return false;
    L276:
        if (this.mRecoveryHrCount == r6.mRecoveryHrCount) goto L279;
        return false;
    L279:
        if (this.mRecoveryHrSampleInterval == r6.mRecoveryHrSampleInterval) goto L282;
        return false;
    L282:
        if (Intrinsics.XOO0ii0(this.mRecoveryHrPoints, r6.mRecoveryHrPoints) == true) goto L285;
        return false;
    L285:
        if (this.mSwimPoolLength == r6.mSwimPoolLength) goto L288;
        return false;
    L288:
        if (Float.compare(this.realTimeAerobic, r6.realTimeAerobic) == 0) goto L291;
        return false;
    L291:
        if (Float.compare(this.realTimeAnaerobic, r6.realTimeAnaerobic) == 0) goto L294;
        return false;
    L294:
        if (Float.compare(this.mCalorieTotal, r6.mCalorieTotal) == 0) goto L297;
        return false;
    L297:
        if (Float.compare(this.mFatTotal, r6.mFatTotal) == 0) goto L300;
        return false;
    L300:
        if (Float.compare(this.mCarboTotal, r6.mCarboTotal) == 0) goto L303;
        return false;
    L303:
        if (this.mPowerCount == r6.mPowerCount) goto L306;
        return false;
    L306:
        if (this.mPowerInterval == r6.mPowerInterval) goto L309;
        return false;
    L309:
        if (Intrinsics.XOO0ii0(this.mPowerPoints, r6.mPowerPoints) == true) goto L312;
        return false;
    L312:
        if (this.mSpmPathPointsCount == r6.mSpmPathPointsCount) goto L315;
        return false;
    L315:
        if (Intrinsics.XOO0ii0(this.mSpmPathPointsPoints, r6.mSpmPathPointsPoints) == true) goto L318;
        return false;
    L318:
        if (this.mStepLenCount == r6.mStepLenCount) goto L321;
        return false;
    L321:
        if (Intrinsics.XOO0ii0(this.mStepLenPoints, r6.mStepLenPoints) == true) goto L324;
        return false;
    L324:
        if (this.mNavigatorTargetTime == r6.mNavigatorTargetTime) goto L327;
        return false;
    L327:
        if (this.mNavigatorActualTime == r6.mNavigatorActualTime) goto L330;
        return false;
    L330:
        if (this.mNavigatorDifferenceTime == r6.mNavigatorDifferenceTime) goto L333;
        return false;
    L333:
        if (this.mNavigatorStatusTime == r6.mNavigatorStatusTime) goto L336;
        return false;
    L336:
        if (this.mNavigatorTargetDistance == r6.mNavigatorTargetDistance) goto L339;
        return false;
    L339:
        if (this.mNavigatorActualDistance == r6.mNavigatorActualDistance) goto L342;
        return false;
    L342:
        if (this.mNavigatorDifferenceDistance == r6.mNavigatorDifferenceDistance) goto L345;
        return false;
    L345:
        if (this.mNavigatorStatusDistance == r6.mNavigatorStatusDistance) goto L348;
        return false;
    L348:
        if (this.mNavigatorTargetPace == r6.mNavigatorTargetPace) goto L351;
        return false;
    L351:
        if (this.mNavigatorActualPace == r6.mNavigatorActualPace) goto L354;
        return false;
    L354:
        if (this.mNavigatorDifferencePace == r6.mNavigatorDifferencePace) goto L357;
        return false;
    L357:
        if (this.mNavigatorStatusPace == r6.mNavigatorStatusPace) goto L360;
        return false;
    L360:
        if (Float.compare(this.mNavigatorTargetSpeed, r6.mNavigatorTargetSpeed) == 0) goto L363;
        return false;
    L363:
        if (Float.compare(this.mNavigatorActualSpeed, r6.mNavigatorActualSpeed) == 0) goto L366;
        return false;
    L366:
        if (this.mNavigatorDifferenceSpeed == r6.mNavigatorDifferenceSpeed) goto L369;
        return false;
    L369:
        if (this.mNavigatorStatusSpeed == r6.mNavigatorStatusSpeed) goto L372;
        return false;
    L372:
        if (Float.compare(this.mMaxOxygenPower, r6.mMaxOxygenPower) == 0) goto L375;
        return false;
    L375:
        if (Intrinsics.XOO0ii0(this.mTrendWeek, r6.mTrendWeek) == true) goto L378;
        return false;
    L378:
        if (Intrinsics.XOO0ii0(this.mCyclingIndex, r6.mCyclingIndex) == true) goto L381;
        return false;
    L381:
        if (this.mSwimSwolf == r6.mSwimSwolf) goto L384;
        return false;
    L384:
        if (this.mCntLap == r6.mCntLap) goto L387;
        return false;
    L387:
        if (this.mFrontCrawlPerc == r6.mFrontCrawlPerc) goto L390;
        return false;
    L390:
        if (this.mBreaststrokePerc == r6.mBreaststrokePerc) goto L393;
        return false;
    L393:
        if (this.mBackstrokePerc == r6.mBackstrokePerc) goto L396;
        return false;
    L396:
        if (this.mButterflyPerc == r6.mButterflyPerc) goto L399;
        return false;
    L399:
        if (this.mEllipticalSteps == r6.mEllipticalSteps) goto L402;
        return false;
    L402:
        if (this.mWorkoutFlag == r6.mWorkoutFlag) goto L405;
        return false;
    L405:
        if (this.mChildSwimStartTime == r6.mChildSwimStartTime) goto L408;
        return false;
    L408:
        if (this.mChildSwimDuration == r6.mChildSwimDuration) goto L411;
        return false;
    L411:
        if (this.mChildSwimDistance == r6.mChildSwimDistance) goto L414;
        return false;
    L414:
        if (this.mChildCyclingStartTime == r6.mChildCyclingStartTime) goto L417;
        return false;
    L417:
        if (this.mChildCyclingDuration == r6.mChildCyclingDuration) goto L420;
        return false;
    L420:
        if (this.mChildCyclingDistance == r6.mChildCyclingDistance) goto L423;
        return false;
    L423:
        if (this.mChildRunStartTime == r6.mChildRunStartTime) goto L426;
        return false;
    L426:
        if (this.mChildRunDuration == r6.mChildRunDuration) goto L429;
        return false;
    L429:
        if (this.mChildRunDistance == r6.mChildRunDistance) goto L432;
        return false;
    L432:
        if (this.mChildSwimMode == r6.mChildSwimMode) goto L435;
        return false;
    L435:
        if (this.mChildCyclingMode == r6.mChildCyclingMode) goto L438;
        return false;
    L438:
        if (this.mChildRunMode == r6.mChildRunMode) goto L441;
        return false;
    L441:
        if (Float.compare(this.mRunLactateAvg, r6.mRunLactateAvg) == 0) goto L444;
        return false;
    L444:
        if (Float.compare(this.mCyclingLactateAvg, r6.mCyclingLactateAvg) == 0) goto L447;
        return false;
    L447:
        if (Intrinsics.XOO0ii0(this.mPersonalZone, r6.mPersonalZone) == true) goto L450;
        return false;
    L450:
        if (this.mAICoachSportID == r6.mAICoachSportID) goto L452;
        return false;
    L452:
        return true;
    }

    @aa1
    public final String floatArrayListToString(@aa1 List<float[]> r5) {
        Intrinsics.X0O(r5, "list");
        List<float[]> r6 = r5;
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r7 = r6.iterator();
        String r1 = "";
    L4:
        if (r7.hasNext() == false) goto L6;
        float[] r2 = (float[]) r7.next();
        StringBuilder r3 = new StringBuilder();
        r3.append(r1);
        String r4 = Arrays.toString(r2);
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        r3.append(r4);
        r1 = r3.toString();
        r0.add(Unit.OXO1);
        goto L4
    L6:
        return r1;
    }

    public final int getMAICoachSportID() {
        return this.mAICoachSportID;
    }

    public final float getMAerobic() {
        return this.mAerobic;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAltitudePathCount() {
        return this.mAltitudePathCount;
    }

    @aa1
    public final List<Integer> getMAltitudePathPoints() {
        return this.mAltitudePathPoints;
    }

    public final int getMAltitudePathSampleInterval() {
        return this.mAltitudePathSampleInterval;
    }

    public final float getMAnaerobic() {
        return this.mAnaerobic;
    }

    public final int getMAscendAltitude() {
        return this.mAscendAltitude;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    public final int getMBackSwingTime() {
        return this.mBackSwingTime;
    }

    public final int getMBackstrokePerc() {
        return this.mBackstrokePerc;
    }

    @aa1
    public final int[] getMBestRunTime() {
        return this.mBestRunTime;
    }

    @aa1
    public final int[] getMBpmZoneCount() {
        return this.mBpmZoneCount;
    }

    public final int getMBreaststrokePerc() {
        return this.mBreaststrokePerc;
    }

    public final int getMButterflyPerc() {
        return this.mButterflyPerc;
    }

    public final float getMCadence() {
        return this.mCadence;
    }

    public final int getMCadencePathCount() {
        return this.mCadencePathCount;
    }

    @aa1
    public final List<Integer> getMCadencePathPoints() {
        return this.mCadencePathPoints;
    }

    public final int getMCadencePathSampleInterval() {
        return this.mCadencePathSampleInterval;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final float getMCalorieTotal() {
        return this.mCalorieTotal;
    }

    public final float getMCarboTotal() {
        return this.mCarboTotal;
    }

    public final int getMChildCyclingDistance() {
        return this.mChildCyclingDistance;
    }

    public final int getMChildCyclingDuration() {
        return this.mChildCyclingDuration;
    }

    public final int getMChildCyclingMode() {
        return this.mChildCyclingMode;
    }

    public final int getMChildCyclingStartTime() {
        return this.mChildCyclingStartTime;
    }

    public final int getMChildNumber() {
        return this.mChildNumber;
    }

    public final int getMChildRunDistance() {
        return this.mChildRunDistance;
    }

    public final int getMChildRunDuration() {
        return this.mChildRunDuration;
    }

    public final int getMChildRunMode() {
        return this.mChildRunMode;
    }

    public final int getMChildRunStartTime() {
        return this.mChildRunStartTime;
    }

    public final int getMChildSwimDistance() {
        return this.mChildSwimDistance;
    }

    public final int getMChildSwimDuration() {
        return this.mChildSwimDuration;
    }

    public final int getMChildSwimMode() {
        return this.mChildSwimMode;
    }

    public final int getMChildSwimStartTime() {
        return this.mChildSwimStartTime;
    }

    public final int getMCnt() {
        return this.mCnt;
    }

    public final int getMCntBack() {
        return this.mCntBack;
    }

    public final int getMCntFore() {
        return this.mCntFore;
    }

    public final int getMCntLap() {
        return this.mCntLap;
    }

    public final int getMCountAltitude() {
        return this.mCountAltitude;
    }

    public final int getMCountBpm() {
        return this.mCountBpm;
    }

    public final int getMCountSatellite() {
        return this.mCountSatellite;
    }

    public final int getMCountStress() {
        return this.mCountStress;
    }

    public final int getMCurBpm() {
        return this.mCurBpm;
    }

    public final int getMCurStress() {
        return this.mCurStress;
    }

    @aa1
    public final float[] getMCyclingIndex() {
        return this.mCyclingIndex;
    }

    public final float getMCyclingLactateAvg() {
        return this.mCyclingLactateAvg;
    }

    public final int getMDescendAltitude() {
        return this.mDescendAltitude;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDownSwingTime() {
        return this.mDownSwingTime;
    }

    public final int getMDribbleTime() {
        return this.mDribbleTime;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMEllipticalSteps() {
        return this.mEllipticalSteps;
    }

    public final int getMEnd() {
        return this.mEnd;
    }

    public final float getMFatTotal() {
        return this.mFatTotal;
    }

    public final int getMFitnessAge() {
        return this.mFitnessAge;
    }

    @aa1
    public final float[] getMFitnessLevel() {
        return this.mFitnessLevel;
    }

    public final int getMFrontCrawlPerc() {
        return this.mFrontCrawlPerc;
    }

    public final int getMHrPathCount() {
        return this.mHrPathCount;
    }

    @aa1
    public final List<Integer> getMHrPathPoints() {
        return this.mHrPathPoints;
    }

    public final int getMHrPathSampleInterval() {
        return this.mHrPathSampleInterval;
    }

    public final int getMLactateThresholdHr() {
        return this.mLactateThresholdHr;
    }

    public final int getMLactateThresholdPace() {
        return this.mLactateThresholdPace;
    }

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxCadence() {
        return this.mMaxCadence;
    }

    public final float getMMaxOxygenPower() {
        return this.mMaxOxygenPower;
    }

    public final int getMMaxPace() {
        return this.mMaxPace;
    }

    public final float getMMaxSpeed() {
        return this.mMaxSpeed;
    }

    public final int getMMaxSpm() {
        return this.mMaxSpm;
    }

    public final int getMMaxStress() {
        return this.mMaxStress;
    }

    public final int getMMaxVO2() {
        return this.mMaxVO2;
    }

    public final float getMMetTotal() {
        return this.mMetTotal;
    }

    public final int getMMinAltitude() {
        return this.mMinAltitude;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
    }

    public final int getMMinPace() {
        return this.mMinPace;
    }

    public final float getMMinSpeed() {
        return this.mMinSpeed;
    }

    public final int getMMinSpm() {
        return this.mMinSpm;
    }

    public final int getMMinStress() {
        return this.mMinStress;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMNavigatorActualDistance() {
        return this.mNavigatorActualDistance;
    }

    public final int getMNavigatorActualPace() {
        return this.mNavigatorActualPace;
    }

    public final float getMNavigatorActualSpeed() {
        return this.mNavigatorActualSpeed;
    }

    public final int getMNavigatorActualTime() {
        return this.mNavigatorActualTime;
    }

    public final int getMNavigatorDifferenceDistance() {
        return this.mNavigatorDifferenceDistance;
    }

    public final int getMNavigatorDifferencePace() {
        return this.mNavigatorDifferencePace;
    }

    public final int getMNavigatorDifferenceSpeed() {
        return this.mNavigatorDifferenceSpeed;
    }

    public final int getMNavigatorDifferenceTime() {
        return this.mNavigatorDifferenceTime;
    }

    public final int getMNavigatorStatusDistance() {
        return this.mNavigatorStatusDistance;
    }

    public final int getMNavigatorStatusPace() {
        return this.mNavigatorStatusPace;
    }

    public final int getMNavigatorStatusSpeed() {
        return this.mNavigatorStatusSpeed;
    }

    public final int getMNavigatorStatusTime() {
        return this.mNavigatorStatusTime;
    }

    public final int getMNavigatorTargetDistance() {
        return this.mNavigatorTargetDistance;
    }

    public final int getMNavigatorTargetPace() {
        return this.mNavigatorTargetPace;
    }

    public final float getMNavigatorTargetSpeed() {
        return this.mNavigatorTargetSpeed;
    }

    public final int getMNavigatorTargetTime() {
        return this.mNavigatorTargetTime;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMPacePathCount() {
        return this.mPacePathCount;
    }

    @aa1
    public final List<Integer> getMPacePathPoints() {
        return this.mPacePathPoints;
    }

    public final int getMPacePathSampleInterval() {
        return this.mPacePathSampleInterval;
    }

    public final int getMPathCount() {
        return this.mPathCount;
    }

    @aa1
    public final List<float[]> getMPathPoints() {
        return this.mPathPoints;
    }

    public final int getMPathSampleInterval() {
        return this.mPathSampleInterval;
    }

    public final int getMPausedDuration() {
        return this.mPausedDuration;
    }

    @aa1
    public final int[] getMPersonalZone() {
        return this.mPersonalZone;
    }

    public final int getMPowerCount() {
        return this.mPowerCount;
    }

    public final int getMPowerInterval() {
        return this.mPowerInterval;
    }

    @aa1
    public final List<Integer> getMPowerPoints() {
        return this.mPowerPoints;
    }

    public final int getMRecoveryHrCount() {
        return this.mRecoveryHrCount;
    }

    @aa1
    public final List<Integer> getMRecoveryHrPoints() {
        return this.mRecoveryHrPoints;
    }

    public final int getMRecoveryHrSampleInterval() {
        return this.mRecoveryHrSampleInterval;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final float getMRunLactateAvg() {
        return this.mRunLactateAvg;
    }

    public final int getMRunPowerWatt() {
        return this.mRunPowerWatt;
    }

    public final int getMSessionCount() {
        return this.mSessionCount;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public final float getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpeedPathCount() {
        return this.mSpeedPathCount;
    }

    @aa1
    public final List<Integer> getMSpeedPathPoints() {
        return this.mSpeedPathPoints;
    }

    public final int getMSpeedPathSampleInterval() {
        return this.mSpeedPathSampleInterval;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMSpmPathPointsCount() {
        return this.mSpmPathPointsCount;
    }

    @aa1
    public final List<Integer> getMSpmPathPointsPoints() {
        return this.mSpmPathPointsPoints;
    }

    public final int getMStaBalance() {
        return this.mStaBalance;
    }

    public final float getMStamina() {
        return this.mStamina;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final float getMStepLen() {
        return this.mStepLen;
    }

    public final int getMStepLenCount() {
        return this.mStepLenCount;
    }

    @aa1
    public final List<Float> getMStepLenPoints() {
        return this.mStepLenPoints;
    }

    public final int getMSwimPoolLength() {
        return this.mSwimPoolLength;
    }

    public final int getMSwimSwolf() {
        return this.mSwimSwolf;
    }

    public final int getMSwimType() {
        return this.mSwimType;
    }

    public final float getMTlTrend() {
        return this.mTlTrend;
    }

    public final int getMTotalAltitude() {
        return this.mTotalAltitude;
    }

    public final int getMTotalBpm() {
        return this.mTotalBpm;
    }

    public final int getMTotalStress() {
        return this.mTotalStress;
    }

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public final int getMTrainingStatus() {
        return this.mTrainingStatus;
    }

    @aa1
    public final float[] getMTrendWeek() {
        return this.mTrendWeek;
    }

    public final int getMTripCount() {
        return this.mTripCount;
    }

    public final float getMVerticalOscillation() {
        return this.mVerticalOscillation;
    }

    public final int getMWorkoutFlag() {
        return this.mWorkoutFlag;
    }

    public final float getRealTimeAerobic() {
        return this.realTimeAerobic;
    }

    public final float getRealTimeAnaerobic() {
        return this.realTimeAnaerobic;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mSize)) * 31) + Integer.hashCode(this.mChildNumber)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mPausedDuration)) * 31) + Integer.hashCode(this.mCurBpm)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mCountBpm)) * 31) + Integer.hashCode(this.mTotalBpm)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mAscendAltitude)) * 31) + Integer.hashCode(this.mDescendAltitude)) * 31) + Integer.hashCode(this.mCountAltitude)) * 31) + Integer.hashCode(this.mTotalAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Float.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mCountSatellite)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mCurStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mCountStress)) * 31) + Integer.hashCode(this.mTotalStress)) * 31) + Float.hashCode(this.mMaxSpeed)) * 31) + Float.hashCode(this.mMinSpeed)) * 31) + Float.hashCode(this.mAvgSpeed)) * 31) + Float.hashCode(this.mStamina)) * 31) + Float.hashCode(this.mAerobic)) * 31) + Float.hashCode(this.mAnaerobic)) * 31) + Float.hashCode(this.mMetTotal)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mMaxVO2)) * 31) + Integer.hashCode(this.mCnt)) * 31) + Float.hashCode(this.mCadence)) * 31) + Integer.hashCode(this.mMaxCadence)) * 31) + Integer.hashCode(this.mSwimType)) * 31) + Integer.hashCode(this.mCntFore)) * 31) + Integer.hashCode(this.mCntBack)) * 31) + Integer.hashCode(this.mBackSwingTime)) * 31) + Integer.hashCode(this.mDownSwingTime)) * 31) + Integer.hashCode(this.mDribbleTime)) * 31) + Integer.hashCode(this.mTripCount)) * 31) + Integer.hashCode(this.mSessionCount)) * 31) + Integer.hashCode(this.mStaBalance)) * 31) + Float.hashCode(this.mStepLen)) * 31) + Float.hashCode(this.mVerticalOscillation)) * 31) + Integer.hashCode(this.mRunPowerWatt)) * 31) + Arrays.hashCode(this.mBpmZoneCount)) * 31) + Integer.hashCode(this.mLactateThresholdHr)) * 31) + Integer.hashCode(this.mLactateThresholdPace)) * 31) + Integer.hashCode(this.mTrainingStatus)) * 31) + Integer.hashCode(this.mFitnessAge)) * 31) + Arrays.hashCode(this.mFitnessLevel)) * 31) + Arrays.hashCode(this.mBestRunTime)) * 31) + Float.hashCode(this.mTlTrend)) * 31) + Integer.hashCode(this.mPathCount)) * 31) + Integer.hashCode(this.mPathSampleInterval)) * 31) + this.mPathPoints.hashCode()) * 31) + Integer.hashCode(this.mHrPathCount)) * 31) + Integer.hashCode(this.mHrPathSampleInterval)) * 31) + this.mHrPathPoints.hashCode()) * 31) + Integer.hashCode(this.mPacePathCount)) * 31) + Integer.hashCode(this.mPacePathSampleInterval)) * 31) + this.mPacePathPoints.hashCode()) * 31) + Integer.hashCode(this.mSpeedPathCount)) * 31) + Integer.hashCode(this.mSpeedPathSampleInterval)) * 31) + this.mSpeedPathPoints.hashCode()) * 31) + Integer.hashCode(this.mCadencePathCount)) * 31) + Integer.hashCode(this.mCadencePathSampleInterval)) * 31) + this.mCadencePathPoints.hashCode()) * 31) + Integer.hashCode(this.mAltitudePathCount)) * 31) + Integer.hashCode(this.mAltitudePathSampleInterval)) * 31) + this.mAltitudePathPoints.hashCode()) * 31) + Integer.hashCode(this.mRecoveryHrCount)) * 31) + Integer.hashCode(this.mRecoveryHrSampleInterval)) * 31) + this.mRecoveryHrPoints.hashCode()) * 31) + Integer.hashCode(this.mSwimPoolLength)) * 31) + Float.hashCode(this.realTimeAerobic)) * 31) + Float.hashCode(this.realTimeAnaerobic)) * 31) + Float.hashCode(this.mCalorieTotal)) * 31) + Float.hashCode(this.mFatTotal)) * 31) + Float.hashCode(this.mCarboTotal)) * 31) + Integer.hashCode(this.mPowerCount)) * 31) + Integer.hashCode(this.mPowerInterval)) * 31) + this.mPowerPoints.hashCode()) * 31) + Integer.hashCode(this.mSpmPathPointsCount)) * 31) + this.mSpmPathPointsPoints.hashCode()) * 31) + Integer.hashCode(this.mStepLenCount)) * 31) + this.mStepLenPoints.hashCode()) * 31) + Integer.hashCode(this.mNavigatorTargetTime)) * 31) + Integer.hashCode(this.mNavigatorActualTime)) * 31) + Integer.hashCode(this.mNavigatorDifferenceTime)) * 31) + Integer.hashCode(this.mNavigatorStatusTime)) * 31) + Integer.hashCode(this.mNavigatorTargetDistance)) * 31) + Integer.hashCode(this.mNavigatorActualDistance)) * 31) + Integer.hashCode(this.mNavigatorDifferenceDistance)) * 31) + Integer.hashCode(this.mNavigatorStatusDistance)) * 31) + Integer.hashCode(this.mNavigatorTargetPace)) * 31) + Integer.hashCode(this.mNavigatorActualPace)) * 31) + Integer.hashCode(this.mNavigatorDifferencePace)) * 31) + Integer.hashCode(this.mNavigatorStatusPace)) * 31) + Float.hashCode(this.mNavigatorTargetSpeed)) * 31) + Float.hashCode(this.mNavigatorActualSpeed)) * 31) + Integer.hashCode(this.mNavigatorDifferenceSpeed)) * 31) + Integer.hashCode(this.mNavigatorStatusSpeed)) * 31) + Float.hashCode(this.mMaxOxygenPower)) * 31) + Arrays.hashCode(this.mTrendWeek)) * 31) + Arrays.hashCode(this.mCyclingIndex)) * 31) + Integer.hashCode(this.mSwimSwolf)) * 31) + Integer.hashCode(this.mCntLap)) * 31) + Integer.hashCode(this.mFrontCrawlPerc)) * 31) + Integer.hashCode(this.mBreaststrokePerc)) * 31) + Integer.hashCode(this.mBackstrokePerc)) * 31) + Integer.hashCode(this.mButterflyPerc)) * 31) + Integer.hashCode(this.mEllipticalSteps)) * 31) + Integer.hashCode(this.mWorkoutFlag)) * 31) + Integer.hashCode(this.mChildSwimStartTime)) * 31) + Integer.hashCode(this.mChildSwimDuration)) * 31) + Integer.hashCode(this.mChildSwimDistance)) * 31) + Integer.hashCode(this.mChildCyclingStartTime)) * 31) + Integer.hashCode(this.mChildCyclingDuration)) * 31) + Integer.hashCode(this.mChildCyclingDistance)) * 31) + Integer.hashCode(this.mChildRunStartTime)) * 31) + Integer.hashCode(this.mChildRunDuration)) * 31) + Integer.hashCode(this.mChildRunDistance)) * 31) + Integer.hashCode(this.mChildSwimMode)) * 31) + Integer.hashCode(this.mChildCyclingMode)) * 31) + Integer.hashCode(this.mChildRunMode)) * 31) + Float.hashCode(this.mRunLactateAvg)) * 31) + Float.hashCode(this.mCyclingLactateAvg)) * 31) + Arrays.hashCode(this.mPersonalZone)) * 31) + Integer.hashCode(this.mAICoachSportID);
    }

    public final void setMAICoachSportID(int r1) {
        this.mAICoachSportID = r1;
    }

    public final void setMAerobic(float r1) {
        this.mAerobic = r1;
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMAltitudePathCount(int r1) {
        this.mAltitudePathCount = r1;
    }

    public final void setMAltitudePathPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAltitudePathPoints = r2;
    }

    public final void setMAltitudePathSampleInterval(int r1) {
        this.mAltitudePathSampleInterval = r1;
    }

    public final void setMAnaerobic(float r1) {
        this.mAnaerobic = r1;
    }

    public final void setMAscendAltitude(int r1) {
        this.mAscendAltitude = r1;
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMAvgSpeed(float r1) {
        this.mAvgSpeed = r1;
    }

    public final void setMAvgStress(int r1) {
        this.mAvgStress = r1;
    }

    public final void setMBackSwingTime(int r1) {
        this.mBackSwingTime = r1;
    }

    public final void setMBackstrokePerc(int r1) {
        this.mBackstrokePerc = r1;
    }

    public final void setMBestRunTime(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBestRunTime = r2;
    }

    public final void setMBpmZoneCount(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBpmZoneCount = r2;
    }

    public final void setMBreaststrokePerc(int r1) {
        this.mBreaststrokePerc = r1;
    }

    public final void setMButterflyPerc(int r1) {
        this.mButterflyPerc = r1;
    }

    public final void setMCadence(float r1) {
        this.mCadence = r1;
    }

    public final void setMCadencePathCount(int r1) {
        this.mCadencePathCount = r1;
    }

    public final void setMCadencePathPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCadencePathPoints = r2;
    }

    public final void setMCadencePathSampleInterval(int r1) {
        this.mCadencePathSampleInterval = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMCalorieTotal(float r1) {
        this.mCalorieTotal = r1;
    }

    public final void setMCarboTotal(float r1) {
        this.mCarboTotal = r1;
    }

    public final void setMChildCyclingDistance(int r1) {
        this.mChildCyclingDistance = r1;
    }

    public final void setMChildCyclingDuration(int r1) {
        this.mChildCyclingDuration = r1;
    }

    public final void setMChildCyclingMode(int r1) {
        this.mChildCyclingMode = r1;
    }

    public final void setMChildCyclingStartTime(int r1) {
        this.mChildCyclingStartTime = r1;
    }

    public final void setMChildNumber(int r1) {
        this.mChildNumber = r1;
    }

    public final void setMChildRunDistance(int r1) {
        this.mChildRunDistance = r1;
    }

    public final void setMChildRunDuration(int r1) {
        this.mChildRunDuration = r1;
    }

    public final void setMChildRunMode(int r1) {
        this.mChildRunMode = r1;
    }

    public final void setMChildRunStartTime(int r1) {
        this.mChildRunStartTime = r1;
    }

    public final void setMChildSwimDistance(int r1) {
        this.mChildSwimDistance = r1;
    }

    public final void setMChildSwimDuration(int r1) {
        this.mChildSwimDuration = r1;
    }

    public final void setMChildSwimMode(int r1) {
        this.mChildSwimMode = r1;
    }

    public final void setMChildSwimStartTime(int r1) {
        this.mChildSwimStartTime = r1;
    }

    public final void setMCnt(int r1) {
        this.mCnt = r1;
    }

    public final void setMCntBack(int r1) {
        this.mCntBack = r1;
    }

    public final void setMCntFore(int r1) {
        this.mCntFore = r1;
    }

    public final void setMCntLap(int r1) {
        this.mCntLap = r1;
    }

    public final void setMCountAltitude(int r1) {
        this.mCountAltitude = r1;
    }

    public final void setMCountBpm(int r1) {
        this.mCountBpm = r1;
    }

    public final void setMCountSatellite(int r1) {
        this.mCountSatellite = r1;
    }

    public final void setMCountStress(int r1) {
        this.mCountStress = r1;
    }

    public final void setMCurBpm(int r1) {
        this.mCurBpm = r1;
    }

    public final void setMCurStress(int r1) {
        this.mCurStress = r1;
    }

    public final void setMCyclingLactateAvg(float r1) {
        this.mCyclingLactateAvg = r1;
    }

    public final void setMDescendAltitude(int r1) {
        this.mDescendAltitude = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDownSwingTime(int r1) {
        this.mDownSwingTime = r1;
    }

    public final void setMDribbleTime(int r1) {
        this.mDribbleTime = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMEllipticalSteps(int r1) {
        this.mEllipticalSteps = r1;
    }

    public final void setMEnd(int r1) {
        this.mEnd = r1;
    }

    public final void setMFatTotal(float r1) {
        this.mFatTotal = r1;
    }

    public final void setMFitnessAge(int r1) {
        this.mFitnessAge = r1;
    }

    public final void setMFitnessLevel(@aa1 float[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFitnessLevel = r2;
    }

    public final void setMFrontCrawlPerc(int r1) {
        this.mFrontCrawlPerc = r1;
    }

    public final void setMHrPathCount(int r1) {
        this.mHrPathCount = r1;
    }

    public final void setMHrPathPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHrPathPoints = r2;
    }

    public final void setMHrPathSampleInterval(int r1) {
        this.mHrPathSampleInterval = r1;
    }

    public final void setMLactateThresholdHr(int r1) {
        this.mLactateThresholdHr = r1;
    }

    public final void setMLactateThresholdPace(int r1) {
        this.mLactateThresholdPace = r1;
    }

    public final void setMMaxAltitude(int r1) {
        this.mMaxAltitude = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMaxCadence(int r1) {
        this.mMaxCadence = r1;
    }

    public final void setMMaxOxygenPower(float r1) {
        this.mMaxOxygenPower = r1;
    }

    public final void setMMaxPace(int r1) {
        this.mMaxPace = r1;
    }

    public final void setMMaxSpeed(float r1) {
        this.mMaxSpeed = r1;
    }

    public final void setMMaxSpm(int r1) {
        this.mMaxSpm = r1;
    }

    public final void setMMaxStress(int r1) {
        this.mMaxStress = r1;
    }

    public final void setMMaxVO2(int r1) {
        this.mMaxVO2 = r1;
    }

    public final void setMMetTotal(float r1) {
        this.mMetTotal = r1;
    }

    public final void setMMinAltitude(int r1) {
        this.mMinAltitude = r1;
    }

    public final void setMMinBpm(int r1) {
        this.mMinBpm = r1;
    }

    public final void setMMinPace(int r1) {
        this.mMinPace = r1;
    }

    public final void setMMinSpeed(float r1) {
        this.mMinSpeed = r1;
    }

    public final void setMMinSpm(int r1) {
        this.mMinSpm = r1;
    }

    public final void setMMinStress(int r1) {
        this.mMinStress = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMNavigatorActualDistance(int r1) {
        this.mNavigatorActualDistance = r1;
    }

    public final void setMNavigatorActualPace(int r1) {
        this.mNavigatorActualPace = r1;
    }

    public final void setMNavigatorActualSpeed(float r1) {
        this.mNavigatorActualSpeed = r1;
    }

    public final void setMNavigatorActualTime(int r1) {
        this.mNavigatorActualTime = r1;
    }

    public final void setMNavigatorDifferenceDistance(int r1) {
        this.mNavigatorDifferenceDistance = r1;
    }

    public final void setMNavigatorDifferencePace(int r1) {
        this.mNavigatorDifferencePace = r1;
    }

    public final void setMNavigatorDifferenceSpeed(int r1) {
        this.mNavigatorDifferenceSpeed = r1;
    }

    public final void setMNavigatorDifferenceTime(int r1) {
        this.mNavigatorDifferenceTime = r1;
    }

    public final void setMNavigatorStatusDistance(int r1) {
        this.mNavigatorStatusDistance = r1;
    }

    public final void setMNavigatorStatusPace(int r1) {
        this.mNavigatorStatusPace = r1;
    }

    public final void setMNavigatorStatusSpeed(int r1) {
        this.mNavigatorStatusSpeed = r1;
    }

    public final void setMNavigatorStatusTime(int r1) {
        this.mNavigatorStatusTime = r1;
    }

    public final void setMNavigatorTargetDistance(int r1) {
        this.mNavigatorTargetDistance = r1;
    }

    public final void setMNavigatorTargetPace(int r1) {
        this.mNavigatorTargetPace = r1;
    }

    public final void setMNavigatorTargetSpeed(float r1) {
        this.mNavigatorTargetSpeed = r1;
    }

    public final void setMNavigatorTargetTime(int r1) {
        this.mNavigatorTargetTime = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPacePathCount(int r1) {
        this.mPacePathCount = r1;
    }

    public final void setMPacePathPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPacePathPoints = r2;
    }

    public final void setMPacePathSampleInterval(int r1) {
        this.mPacePathSampleInterval = r1;
    }

    public final void setMPathCount(int r1) {
        this.mPathCount = r1;
    }

    public final void setMPathPoints(@aa1 List<float[]> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPathPoints = r2;
    }

    public final void setMPathSampleInterval(int r1) {
        this.mPathSampleInterval = r1;
    }

    public final void setMPausedDuration(int r1) {
        this.mPausedDuration = r1;
    }

    public final void setMPersonalZone(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPersonalZone = r2;
    }

    public final void setMPowerCount(int r1) {
        this.mPowerCount = r1;
    }

    public final void setMPowerInterval(int r1) {
        this.mPowerInterval = r1;
    }

    public final void setMPowerPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPowerPoints = r2;
    }

    public final void setMRecoveryHrCount(int r1) {
        this.mRecoveryHrCount = r1;
    }

    public final void setMRecoveryHrPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecoveryHrPoints = r2;
    }

    public final void setMRecoveryHrSampleInterval(int r1) {
        this.mRecoveryHrSampleInterval = r1;
    }

    public final void setMRecoveryTime(int r1) {
        this.mRecoveryTime = r1;
    }

    public final void setMRunLactateAvg(float r1) {
        this.mRunLactateAvg = r1;
    }

    public final void setMRunPowerWatt(int r1) {
        this.mRunPowerWatt = r1;
    }

    public final void setMSessionCount(int r1) {
        this.mSessionCount = r1;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    public final void setMSpeed(float r1) {
        this.mSpeed = r1;
    }

    public final void setMSpeedPathCount(int r1) {
        this.mSpeedPathCount = r1;
    }

    public final void setMSpeedPathPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSpeedPathPoints = r2;
    }

    public final void setMSpeedPathSampleInterval(int r1) {
        this.mSpeedPathSampleInterval = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMSpmPathPointsCount(int r1) {
        this.mSpmPathPointsCount = r1;
    }

    public final void setMSpmPathPointsPoints(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSpmPathPointsPoints = r2;
    }

    public final void setMStaBalance(int r1) {
        this.mStaBalance = r1;
    }

    public final void setMStamina(float r1) {
        this.mStamina = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMStepLen(float r1) {
        this.mStepLen = r1;
    }

    public final void setMStepLenCount(int r1) {
        this.mStepLenCount = r1;
    }

    public final void setMStepLenPoints(@aa1 List<Float> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStepLenPoints = r2;
    }

    public final void setMSwimPoolLength(int r1) {
        this.mSwimPoolLength = r1;
    }

    public final void setMSwimSwolf(int r1) {
        this.mSwimSwolf = r1;
    }

    public final void setMSwimType(int r1) {
        this.mSwimType = r1;
    }

    public final void setMTlTrend(float r1) {
        this.mTlTrend = r1;
    }

    public final void setMTotalAltitude(int r1) {
        this.mTotalAltitude = r1;
    }

    public final void setMTotalBpm(int r1) {
        this.mTotalBpm = r1;
    }

    public final void setMTotalStress(int r1) {
        this.mTotalStress = r1;
    }

    public final void setMTrainingLoad(int r1) {
        this.mTrainingLoad = r1;
    }

    public final void setMTrainingStatus(int r1) {
        this.mTrainingStatus = r1;
    }

    public final void setMTripCount(int r1) {
        this.mTripCount = r1;
    }

    public final void setMVerticalOscillation(float r1) {
        this.mVerticalOscillation = r1;
    }

    public final void setMWorkoutFlag(int r1) {
        this.mWorkoutFlag = r1;
    }

    public final void setRealTimeAerobic(float r1) {
        this.realTimeAerobic = r1;
    }

    public final void setRealTimeAnaerobic(float r1) {
        this.realTimeAnaerobic = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleWorkout4(mStart=");
        r0.append(this.mStart);
        r0.append(",  mEnd=");
        r0.append(this.mEnd);
        r0.append(", mDuration=");
        r0.append(this.mDuration);
        r0.append(", mAltitude=");
        r0.append(this.mAltitude);
        r0.append(", mAirPressure=");
        r0.append(this.mAirPressure);
        r0.append(", mSpm=");
        r0.append(this.mSpm);
        r0.append(", mMode=");
        r0.append(this.mMode);
        r0.append(", mStep=");
        r0.append(this.mStep);
        r0.append(",mDistance=");
        r0.append(this.mDistance);
        r0.append(", mCalorie=");
        r0.append(this.mCalorie);
        r0.append(", mSpeed=");
        r0.append(this.mSpeed);
        r0.append(", mPace=");
        r0.append(this.mPace);
        r0.append(", mAvgBpm=");
        r0.append(this.mAvgBpm);
        r0.append(", mMaxBpm=");
        r0.append(this.mMaxBpm);
        r0.append(", mMinBpm=");
        r0.append(this.mMinBpm);
        r0.append(", mMaxSpm=");
        r0.append(this.mMaxSpm);
        r0.append(", mMinSpm=");
        r0.append(this.mMinSpm);
        r0.append(", mMaxPace=");
        r0.append(this.mMaxPace);
        r0.append("  mMinPace=");
        r0.append(this.mMinPace);
        r0.append(", mMaxAltitude=");
        r0.append(this.mMaxAltitude);
        r0.append(", mMinAltitude=");
        r0.append(this.mMinAltitude);
        r0.append(", mMinStress=");
        r0.append(this.mMinStress);
        r0.append(", mMaxStress=");
        r0.append(this.mMaxStress);
        r0.append(", mAvgStress=");
        r0.append(this.mAvgStress);
        r0.append(", mMaxSpeed=");
        r0.append(this.mMaxSpeed);
        r0.append(", mMinSpeed=");
        r0.append(this.mMinSpeed);
        r0.append(" , mMetTotal=");
        r0.append(this.mMetTotal);
        r0.append(", mAerobic=");
        r0.append(this.mAerobic);
        r0.append(", mAnaerobic=");
        r0.append(this.mAnaerobic);
        r0.append(", mStamina=");
        r0.append(this.mStamina);
        r0.append(", mAvgSpeed=");
        r0.append(this.mAvgSpeed);
        r0.append(", mCadence=");
        r0.append(this.mCadence);
        r0.append(", mMaxCadence=");
        r0.append(this.mMaxCadence);
        r0.append(", mCnt=");
        r0.append(this.mCnt);
        r0.append(" mBpmZoneCount=");
        String r1 = Arrays.toString(this.mBpmZoneCount);
        Intrinsics.O10IXXX0X(r1, "toString(...)");
        r0.append(r1);
        r0.append(", mPersonalZone=");
        String r2 = Arrays.toString(this.mPersonalZone);
        Intrinsics.O10IXXX0X(r2, "toString(...)");
        r0.append(r2);
        r0.append(", mLactateThresholdPace=");
        r0.append(this.mLactateThresholdPace);
        r0.append(", mRecoveryTime=");
        r0.append(this.mRecoveryTime);
        r0.append(", mTrainingLoad=");
        r0.append(this.mTrainingLoad);
        r0.append(", mMaxVO2=");
        r0.append(this.mMaxVO2);
        r0.append(", mLactateThresholdHr=");
        r0.append(this.mLactateThresholdHr);
        r0.append(", mWorkoutFlag=");
        r0.append(this.mWorkoutFlag);
        r0.append(",mPathCount=");
        r0.append(this.mPathCount);
        r0.append(", mPathSampleInterval=");
        r0.append(this.mPathSampleInterval);
        r0.append(", mPathPoints=");
        r0.append(floatArrayListToString(this.mPathPoints));
        r0.append(", mHrPathCount=");
        r0.append(this.mHrPathCount);
        r0.append(", mHrPathSampleInterval=");
        r0.append(this.mHrPathSampleInterval);
        r0.append(", mHrPathPoints=");
        r0.append(this.mHrPathPoints);
        r0.append(" mPacePathCount=");
        r0.append(this.mPacePathCount);
        r0.append(", mPacePathSampleInterval=");
        r0.append(this.mPacePathSampleInterval);
        r0.append(", mPacePathPoints=");
        r0.append(this.mPacePathPoints);
        r0.append(" mSpeedPathCount=");
        r0.append(this.mSpeedPathCount);
        r0.append(", mSpeedPathSampleInterval=");
        r0.append(this.mSpeedPathSampleInterval);
        r0.append(", mSpeedPathPoints=");
        r0.append(this.mSpeedPathPoints);
        r0.append("  mCadencePathCount=");
        r0.append(this.mCadencePathCount);
        r0.append(", mCadencePathSampleInterval=");
        r0.append(this.mCadencePathSampleInterval);
        r0.append(",mCadencePathPoints=");
        r0.append(this.mCadencePathPoints);
        r0.append(", mAltitudePathCount=");
        r0.append(this.mAltitudePathCount);
        r0.append(", mAltitudePathSampleInterval=");
        r0.append(this.mAltitudePathSampleInterval);
        r0.append(",mAltitudePathPoints=");
        r0.append(this.mAltitudePathPoints);
        r0.append("， realTimeAerobic=");
        r0.append(this.realTimeAerobic);
        r0.append(", realTimeAnaerobic=");
        r0.append(this.realTimeAnaerobic);
        r0.append(", mCalorieTotal=");
        r0.append(this.mCalorieTotal);
        r0.append("mFatTotal=");
        r0.append(this.mFatTotal);
        r0.append(",mCarboTotal=");
        r0.append(this.mCarboTotal);
        r0.append(",mPowerCount=");
        r0.append(this.mPowerCount);
        r0.append(",mPowerInterval=");
        r0.append(this.mPowerInterval);
        r0.append(",mPowerPoints=");
        r0.append(this.mPowerPoints);
        r0.append("mNavigatorTargetTime=");
        r0.append(this.mNavigatorTargetTime);
        r0.append(", mNavigatorActualTime=");
        r0.append(this.mNavigatorActualTime);
        r0.append(", mNavigatorDifferenceTime=");
        r0.append(this.mNavigatorDifferenceTime);
        r0.append("mNavigatorStatusTime=");
        r0.append(this.mNavigatorStatusTime);
        r0.append(", mNavigatorTargetDistance=");
        r0.append(this.mNavigatorTargetDistance);
        r0.append(", mNavigatorActualDistance=");
        r0.append(this.mNavigatorActualDistance);
        r0.append("mNavigatorDifferenceDistance=");
        r0.append(this.mNavigatorDifferenceDistance);
        r0.append(", mNavigatorStatusDistance=");
        r0.append(this.mNavigatorStatusDistance);
        r0.append(", mNavigatorTargetPace=");
        r0.append(this.mNavigatorTargetPace);
        r0.append("mNavigatorActualPace=");
        r0.append(this.mNavigatorActualPace);
        r0.append(", mNavigatorDifferencePace=");
        r0.append(this.mNavigatorDifferencePace);
        r0.append(", mNavigatorStatusPace=");
        r0.append(this.mNavigatorStatusPace);
        r0.append("mNavigatorTargetSpeed=");
        r0.append(this.mNavigatorTargetSpeed);
        r0.append(", mNavigatorActualSpeed=");
        r0.append(this.mNavigatorActualSpeed);
        r0.append(", mNavigatorDifferenceSpeed=");
        r0.append(this.mNavigatorDifferenceSpeed);
        r0.append("mNavigatorStatusSpeed=");
        r0.append(this.mNavigatorStatusSpeed);
        r0.append(", mMaxOxygenPower=");
        r0.append(this.mMaxOxygenPower);
        r0.append(", mCyclingIndex = ");
        r0.append(this.mCyclingIndex);
        r0.append(",mTrendWeek = ");
        r0.append(this.mTrendWeek);
        r0.append(", mSwimSwolf =");
        r0.append(this.mSwimSwolf);
        r0.append(", mCntLap = ");
        r0.append(this.mCntLap);
        r0.append(", mFrontCrawlPerc=");
        r0.append(this.mFrontCrawlPerc);
        r0.append(",mBreaststrokePerc = ");
        r0.append(this.mBreaststrokePerc);
        r0.append(", mButterflyPerc=");
        r0.append(this.mButterflyPerc);
        r0.append(", mEllipticalSteps=");
        r0.append(this.mEllipticalSteps);
        r0.append(",mChildSwimStartTime=");
        r0.append(this.mChildSwimStartTime);
        r0.append(",mChildSwimDuration=");
        r0.append(this.mChildSwimDuration);
        r0.append(",mChildSwimDistance=");
        r0.append(this.mChildSwimDistance);
        r0.append(",mChildCyclingStartTime=");
        r0.append(this.mChildCyclingStartTime);
        r0.append(",mChildCyclingDuration=");
        r0.append(this.mChildCyclingDuration);
        r0.append(",mChildCyclingDistance=");
        r0.append(this.mChildCyclingDistance);
        r0.append(",mChildRunStartTime=");
        r0.append(this.mChildRunStartTime);
        r0.append(",mChildRunDuration=");
        r0.append(this.mChildRunDuration);
        r0.append(",mChildRunDistance=");
        r0.append(this.mChildRunDistance);
        r0.append(",mChildSwimMode=");
        r0.append(this.mChildSwimMode);
        r0.append(",mChildCyclingMode=");
        r0.append(this.mChildCyclingMode);
        r0.append(",mChildRunMode=");
        r0.append(this.mChildRunMode);
        return r0.toString();
    }

    public BleWorkout4(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, int r62, int r63, int r64, int r65, float r66, int r67, int r68, int r69, int r70, int r71, int r72, int r73, int r74, int r75, int r76, float r77, float r78, int r79, @aa1 int[] r80, int r81, int r82, int r83, int r84, @aa1 float[] r85, @aa1 int[] r86, float r87, int r88, int r89, @aa1 List<float[]> r90, int r91, int r92, @aa1 List<Integer> r93, int r94, int r95, @aa1 List<Integer> r96, int r97, int r98, @aa1 List<Integer> r99, int r100, int r101, @aa1 List<Integer> r102, int r103, int r104, @aa1 List<Integer> r105, int r106, int r107, @aa1 List<Integer> r108, int r109, float r110, float r111, float r112, float r113, float r114, int r115, int r116, @aa1 List<Integer> r117, int r118, @aa1 List<Integer> r119, int r120, @aa1 List<Float> r121, int r122, int r123, int r124, int r125, int r126, int r127, int r128, int r129, int r130, int r131, int r132, int r133, float r134, float r135, int r136, int r137, float r138, @aa1 float[] r139, @aa1 float[] r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, int r149, int r150, int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, float r161, float r162, @aa1 int[] r163, int r164) {
        Intrinsics.X0O(r80, "mBpmZoneCount");
        Intrinsics.X0O(r85, "mFitnessLevel");
        Intrinsics.X0O(r86, "mBestRunTime");
        Intrinsics.X0O(r90, "mPathPoints");
        Intrinsics.X0O(r93, "mHrPathPoints");
        Intrinsics.X0O(r96, "mPacePathPoints");
        Intrinsics.X0O(r99, "mSpeedPathPoints");
        Intrinsics.X0O(r102, "mCadencePathPoints");
        Intrinsics.X0O(r105, "mAltitudePathPoints");
        Intrinsics.X0O(r108, "mRecoveryHrPoints");
        Intrinsics.X0O(r117, "mPowerPoints");
        Intrinsics.X0O(r119, "mSpmPathPointsPoints");
        Intrinsics.X0O(r121, "mStepLenPoints");
        Intrinsics.X0O(r139, "mTrendWeek");
        Intrinsics.X0O(r140, "mCyclingIndex");
        Intrinsics.X0O(r163, "mPersonalZone");
        this.mStart = r17;
        this.mEnd = r18;
        this.mSize = r19;
        this.mChildNumber = r20;
        this.mMode = r21;
        this.mDuration = r22;
        this.mPausedDuration = r23;
        this.mCurBpm = r24;
        this.mAvgBpm = r25;
        this.mMaxBpm = r26;
        this.mMinBpm = r27;
        this.mCountBpm = r28;
        this.mTotalBpm = r29;
        this.mStep = r30;
        this.mDistance = r31;
        this.mCalorie = r32;
        this.mAltitude = r33;
        this.mMaxAltitude = r34;
        this.mMinAltitude = r35;
        this.mAscendAltitude = r36;
        this.mDescendAltitude = r37;
        this.mCountAltitude = r38;
        this.mTotalAltitude = r39;
        this.mAirPressure = r40;
        this.mSpeed = r41;
        this.mCountSatellite = r42;
        this.mSpm = r43;
        this.mMaxSpm = r44;
        this.mMinSpm = r45;
        this.mPace = r46;
        this.mMaxPace = r47;
        this.mMinPace = r48;
        this.mCurStress = r49;
        this.mAvgStress = r50;
        this.mMinStress = r51;
        this.mMaxStress = r52;
        this.mCountStress = r53;
        this.mTotalStress = r54;
        this.mMaxSpeed = r55;
        this.mMinSpeed = r56;
        this.mAvgSpeed = r57;
        this.mStamina = r58;
        this.mAerobic = r59;
        this.mAnaerobic = r60;
        this.mMetTotal = r61;
        this.mRecoveryTime = r62;
        this.mTrainingLoad = r63;
        this.mMaxVO2 = r64;
        this.mCnt = r65;
        this.mCadence = r66;
        this.mMaxCadence = r67;
        this.mSwimType = r68;
        this.mCntFore = r69;
        this.mCntBack = r70;
        this.mBackSwingTime = r71;
        this.mDownSwingTime = r72;
        this.mDribbleTime = r73;
        this.mTripCount = r74;
        this.mSessionCount = r75;
        this.mStaBalance = r76;
        this.mStepLen = r77;
        this.mVerticalOscillation = r78;
        this.mRunPowerWatt = r79;
        this.mBpmZoneCount = r80;
        this.mLactateThresholdHr = r81;
        this.mLactateThresholdPace = r82;
        this.mTrainingStatus = r83;
        this.mFitnessAge = r84;
        this.mFitnessLevel = r85;
        this.mBestRunTime = r86;
        this.mTlTrend = r87;
        this.mPathCount = r88;
        this.mPathSampleInterval = r89;
        this.mPathPoints = r90;
        this.mHrPathCount = r91;
        this.mHrPathSampleInterval = r92;
        this.mHrPathPoints = r93;
        this.mPacePathCount = r94;
        this.mPacePathSampleInterval = r95;
        this.mPacePathPoints = r96;
        this.mSpeedPathCount = r97;
        this.mSpeedPathSampleInterval = r98;
        this.mSpeedPathPoints = r99;
        this.mCadencePathCount = r100;
        this.mCadencePathSampleInterval = r101;
        this.mCadencePathPoints = r102;
        this.mAltitudePathCount = r103;
        this.mAltitudePathSampleInterval = r104;
        this.mAltitudePathPoints = r105;
        this.mRecoveryHrCount = r106;
        this.mRecoveryHrSampleInterval = r107;
        this.mRecoveryHrPoints = r108;
        this.mSwimPoolLength = r109;
        this.realTimeAerobic = r110;
        this.realTimeAnaerobic = r111;
        this.mCalorieTotal = r112;
        this.mFatTotal = r113;
        this.mCarboTotal = r114;
        this.mPowerCount = r115;
        this.mPowerInterval = r116;
        this.mPowerPoints = r117;
        this.mSpmPathPointsCount = r118;
        this.mSpmPathPointsPoints = r119;
        this.mStepLenCount = r120;
        this.mStepLenPoints = r121;
        this.mNavigatorTargetTime = r122;
        this.mNavigatorActualTime = r123;
        this.mNavigatorDifferenceTime = r124;
        this.mNavigatorStatusTime = r125;
        this.mNavigatorTargetDistance = r126;
        this.mNavigatorActualDistance = r127;
        this.mNavigatorDifferenceDistance = r128;
        this.mNavigatorStatusDistance = r129;
        this.mNavigatorTargetPace = r130;
        this.mNavigatorActualPace = r131;
        this.mNavigatorDifferencePace = r132;
        this.mNavigatorStatusPace = r133;
        this.mNavigatorTargetSpeed = r134;
        this.mNavigatorActualSpeed = r135;
        this.mNavigatorDifferenceSpeed = r136;
        this.mNavigatorStatusSpeed = r137;
        this.mMaxOxygenPower = r138;
        this.mTrendWeek = r139;
        this.mCyclingIndex = r140;
        this.mSwimSwolf = r141;
        this.mCntLap = r142;
        this.mFrontCrawlPerc = r143;
        this.mBreaststrokePerc = r144;
        this.mBackstrokePerc = r145;
        this.mButterflyPerc = r146;
        this.mEllipticalSteps = r147;
        this.mWorkoutFlag = r148;
        this.mChildSwimStartTime = r149;
        this.mChildSwimDuration = r150;
        this.mChildSwimDistance = r151;
        this.mChildCyclingStartTime = r152;
        this.mChildCyclingDuration = r153;
        this.mChildCyclingDistance = r154;
        this.mChildRunStartTime = r155;
        this.mChildRunDuration = r156;
        this.mChildRunDistance = r157;
        this.mChildSwimMode = r158;
        this.mChildCyclingMode = r159;
        this.mChildRunMode = r160;
        this.mRunLactateAvg = r161;
        this.mCyclingLactateAvg = r162;
        this.mPersonalZone = r163;
        this.mAICoachSportID = r164;
    }

    public /* synthetic */ BleWorkout4(int r111, int r112, int r113, int r114, int r115, int r116, int r117, int r118, int r119, int r120, int r121, int r122, int r123, int r124, int r125, int r126, int r127, int r128, int r129, int r130, int r131, int r132, int r133, int r134, float r135, int r136, int r137, int r138, int r139, int r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, float r149, float r150, float r151, float r152, float r153, float r154, float r155, int r156, int r157, int r158, int r159, float r160, int r161, int r162, int r163, int r164, int r165, int r166, int r167, int r168, int r169, int r170, float r171, float r172, int r173, int[] r174, int r175, int r176, int r177, int r178, float[] r179, int[] r180, float r181, int r182, int r183, List r184, int r185, int r186, List r187, int r188, int r189, List r190, int r191, int r192, List r193, int r194, int r195, List r196, int r197, int r198, List r199, int r200, int r201, List r202, int r203, float r204, float r205, float r206, float r207, float r208, int r209, int r210, List r211, int r212, List r213, int r214, List r215, int r216, int r217, int r218, int r219, int r220, int r221, int r222, int r223, int r224, int r225, int r226, int r227, float r228, float r229, int r230, int r231, float r232, float[] r233, float[] r234, int r235, int r236, int r237, int r238, int r239, int r240, int r241, int r242, int r243, int r244, int r245, int r246, int r247, int r248, int r249, int r250, int r251, int r252, int r253, int r254, float r255, float r256, int[] r257, int r258, int r259, int r260, int r261, int r262, int r263, DefaultConstructorMarker r264) {
        if ((r259 & 1) == 0) goto L5;
        int r5 = 0;
    L7:
        if ((r259 & 2) == 0) goto L9;
        int r7 = 0;
    L11:
        if ((r259 & 4) == 0) goto L13;
        int r8 = 0;
    L15:
        if ((r259 & 8) == 0) goto L17;
        int r9 = 0;
    L19:
        if ((r259 & 16) == 0) goto L21;
        int r10 = 0;
    L23:
        if ((r259 & 32) == 0) goto L25;
        int r11 = 0;
    L27:
        if ((r259 & 64) == 0) goto L29;
        int r12 = 0;
    L31:
        if ((r259 & 128) == 0) goto L33;
        int r13 = 0;
    L35:
        if ((r259 & 256) == 0) goto L37;
        int r14 = 0;
    L39:
        if ((r259 & 512) == 0) goto L41;
        int r15 = 0;
    L43:
        if ((r259 & 1024) == 0) goto L45;
        int r6 = 0;
    L46:
        int r1110 = r5;
        if ((r259 & 2048) == 0) goto L49;
        int r16 = 0;
    L50:
        int r1111 = r16;
        if ((r259 & 4096) == 0) goto L53;
        int r17 = 0;
    L54:
        int r1112 = r17;
        if ((r259 & 8192) == 0) goto L57;
        int r18 = 0;
    L58:
        int r1113 = r18;
        if ((r259 & 16384) == 0) goto L61;
        int r19 = 0;
    L63:
        if ((r259 & 32768) == 0) goto L65;
        int r110 = 0;
    L67:
        if ((r259 & 65536) == 0) goto L69;
        int r1100 = 0;
    L71:
        if ((r259 & 131072) == 0) goto L73;
        int r21 = 0;
    L75:
        if ((r259 & 262144) == 0) goto L77;
        int r23 = 0;
    L79:
        if ((r259 & 524288) == 0) goto L81;
        int r25 = 0;
    L83:
        if ((r259 & 1048576) == 0) goto L85;
        int r26 = 0;
    L87:
        if ((r259 & 2097152) == 0) goto L89;
        int r27 = 0;
    L91:
        if ((r259 & 4194304) == 0) goto L93;
        int r28 = 0;
    L95:
        if ((r259 & 8388608) == 0) goto L97;
        int r29 = 0;
    L98:
        float r31 = 0.0f;
        if ((r259 & 16777216) == 0) goto L101;
        float r30 = 0.0f;
    L103:
        if ((r259 & 33554432) == 0) goto L105;
        int r32 = 0;
    L107:
        if ((r259 & 67108864) == 0) goto L109;
        int r33 = 0;
    L111:
        if ((r259 & 134217728) == 0) goto L113;
        int r34 = 0;
    L115:
        if ((r259 & 268435456) == 0) goto L117;
        int r35 = 0;
    L119:
        if ((r259 & 536870912) == 0) goto L121;
        int r36 = 0;
    L123:
        if ((r259 & 1073741824) == 0) goto L125;
        int r37 = 0;
    L127:
        if ((r259 & Integer.MIN_VALUE) == 0) goto L129;
        int r0 = 0;
    L131:
        if ((r260 & 1) == 0) goto L133;
        int r38 = 0;
    L135:
        if ((r260 & 2) == 0) goto L137;
        int r39 = 0;
    L139:
        if ((r260 & 4) == 0) goto L141;
        int r40 = 0;
    L143:
        if ((r260 & 8) == 0) goto L145;
        int r41 = 0;
    L147:
        if ((r260 & 16) == 0) goto L149;
        int r42 = 0;
    L151:
        if ((r260 & 32) == 0) goto L153;
        int r43 = 0;
    L155:
        if ((r260 & 64) == 0) goto L157;
        float r44 = 0.0f;
    L158:
        int r1114 = r0;
        if ((r260 & 128) == 0) goto L161;
        float r1 = 0.0f;
    L162:
        float r1115 = r1;
        if ((r260 & 256) == 0) goto L165;
        float r2 = 0.0f;
    L166:
        float r1116 = r2;
        if ((r260 & 512) == 0) goto L169;
        float r3 = 0.0f;
    L170:
        float r1117 = r3;
        if ((r260 & 1024) == 0) goto L173;
        float r4 = 0.0f;
    L174:
        float r1118 = r4;
        if ((r260 & 2048) == 0) goto L177;
        float r20 = 0.0f;
    L178:
        float r1210 = r20;
        if ((r260 & 4096) == 0) goto L181;
        float r22 = 0.0f;
    L182:
        float r1211 = r22;
        if ((r260 & 8192) == 0) goto L185;
        int r24 = 0;
    L186:
        int r1212 = r24;
        if ((r260 & 16384) == 0) goto L189;
        int r45 = 0;
    L191:
        if ((r260 & 32768) == 0) goto L193;
        int r46 = 0;
    L195:
        if ((r260 & 65536) == 0) goto L197;
        int r47 = 0;
    L199:
        if ((r260 & 131072) == 0) goto L201;
        float r48 = 0.0f;
    L203:
        if ((r260 & 262144) == 0) goto L205;
        int r49 = 0;
    L207:
        if ((r260 & 524288) == 0) goto L209;
        int r410 = 0;
    L211:
        if ((r260 & 1048576) == 0) goto L213;
        int r50 = 0;
    L215:
        if ((r260 & 2097152) == 0) goto L217;
        int r51 = 0;
    L219:
        if ((r260 & 4194304) == 0) goto L221;
        int r52 = 0;
    L223:
        if ((r260 & 8388608) == 0) goto L225;
        int r53 = 0;
    L227:
        if ((r260 & 16777216) == 0) goto L229;
        int r54 = 0;
    L231:
        if ((r260 & 33554432) == 0) goto L233;
        int r55 = 0;
    L235:
        if ((r260 & 67108864) == 0) goto L237;
        int r56 = 0;
    L239:
        if ((r260 & 134217728) == 0) goto L241;
        int r57 = 0;
    L243:
        if ((r260 & 268435456) == 0) goto L245;
        float r58 = 0.0f;
    L247:
        if ((r260 & 536870912) == 0) goto L249;
        float r59 = 0.0f;
    L251:
        if ((r260 & 1073741824) == 0) goto L253;
        int r60 = 0;
    L255:
        if ((r260 & Integer.MIN_VALUE) == 0) goto L257;
        int[] r61 = new int[5];
    L259:
        if ((r261 & 1) == 0) goto L261;
        int r62 = 0;
    L263:
        if ((r261 & 2) == 0) goto L265;
        int r63 = 0;
    L267:
        if ((r261 & 4) == 0) goto L269;
        int r64 = 0;
    L271:
        if ((r261 & 8) == 0) goto L273;
        int r65 = 0;
    L274:
        int r1213 = r45;
        if ((r261 & 16) == 0) goto L277;
        float[] r66 = new float[9];
    L278:
        float[] r1214 = r66;
        if ((r261 & 32) == 0) goto L281;
        int[] r67 = new int[5];
    L283:
        if ((r261 & 64) == 0) goto L285;
        float r68 = 0.0f;
    L286:
        int[] r1215 = r67;
        if ((r261 & 128) == 0) goto L289;
        int r69 = 0;
    L290:
        int r1216 = r69;
        if ((r261 & 256) == 0) goto L293;
        int r70 = 0;
    L294:
        int r1217 = r70;
        if ((r261 & 512) == 0) goto L297;
        List r71 = new ArrayList();
    L298:
        List r1218 = r71;
        if ((r261 & 1024) == 0) goto L301;
        int r72 = 0;
    L302:
        int r1219 = r72;
        if ((r261 & 2048) == 0) goto L305;
        int r73 = 0;
    L306:
        int r1310 = r73;
        if ((r261 & 4096) == 0) goto L309;
        List r74 = new ArrayList();
    L310:
        List r1311 = r74;
        if ((r261 & 8192) == 0) goto L313;
        int r75 = 0;
    L314:
        int r1312 = r75;
        if ((r261 & 16384) == 0) goto L317;
        int r76 = 0;
    L319:
        if ((r261 & 32768) == 0) goto L321;
        List r610 = new ArrayList();
    L323:
        if ((r261 & 65536) == 0) goto L325;
        int r611 = 0;
    L327:
        if ((r261 & 131072) == 0) goto L329;
        int r612 = 0;
    L331:
        if ((r261 & 262144) == 0) goto L333;
        List r613 = new ArrayList();
    L335:
        if ((r261 & 524288) == 0) goto L337;
        int r77 = 0;
    L339:
        if ((r261 & 1048576) == 0) goto L341;
        int r78 = 0;
    L343:
        if ((r261 & 2097152) == 0) goto L345;
        List r79 = new ArrayList();
    L347:
        if ((r261 & 4194304) == 0) goto L349;
        int r710 = 0;
    L351:
        if ((r261 & 8388608) == 0) goto L353;
        int r711 = 0;
    L355:
        if ((r261 & 16777216) == 0) goto L357;
        List r712 = new ArrayList();
    L359:
        if ((r261 & 33554432) == 0) goto L361;
        int r713 = 0;
    L363:
        if ((r261 & 67108864) == 0) goto L365;
        int r714 = 0;
    L367:
        if ((r261 & 134217728) == 0) goto L369;
        List r715 = new ArrayList();
    L371:
        if ((r261 & 268435456) == 0) goto L373;
        int r716 = 0;
    L375:
        if ((r261 & 536870912) == 0) goto L377;
        float r80 = 0.0f;
    L379:
        if ((r261 & 1073741824) == 0) goto L381;
        float r81 = 0.0f;
    L383:
        if ((r261 & Integer.MIN_VALUE) == 0) goto L385;
        float r82 = 0.0f;
    L387:
        if ((r262 & 1) == 0) goto L389;
        float r83 = 0.0f;
    L391:
        if ((r262 & 2) == 0) goto L393;
        float r84 = 0.0f;
    L395:
        if ((r262 & 4) == 0) goto L397;
        int r85 = 0;
    L399:
        if ((r262 & 8) == 0) goto L401;
        int r86 = 0;
    L403:
        if ((r262 & 16) == 0) goto L405;
        List r87 = new ArrayList();
    L407:
        if ((r262 & 32) == 0) goto L409;
        int r88 = 0;
    L411:
        if ((r262 & 64) == 0) goto L413;
        List r89 = new ArrayList();
    L414:
        int r1313 = r76;
        if ((r262 & 128) == 0) goto L417;
        int r90 = 0;
    L418:
        int r1314 = r90;
        if ((r262 & 256) == 0) goto L421;
        List r91 = new ArrayList();
    L422:
        List r1315 = r91;
        if ((r262 & 512) == 0) goto L425;
        int r92 = 0;
    L426:
        int r1316 = r92;
        if ((r262 & 1024) == 0) goto L429;
        int r93 = 0;
    L430:
        int r1317 = r93;
        if ((r262 & 2048) == 0) goto L433;
        int r94 = 0;
    L434:
        int r1318 = r94;
        if ((r262 & 4096) == 0) goto L437;
        int r95 = -1;
    L438:
        int r1319 = r95;
        if ((r262 & 8192) == 0) goto L441;
        int r96 = 0;
    L442:
        int r1410 = r96;
        if ((r262 & 16384) == 0) goto L445;
        int r97 = 0;
    L447:
        if ((r262 & 32768) == 0) goto L449;
        int r810 = 0;
    L451:
        if ((r262 & 65536) == 0) goto L453;
        int r98 = -1;
    L455:
        if ((r262 & 131072) == 0) goto L457;
        int r99 = 0;
    L459:
        if ((r262 & 262144) == 0) goto L461;
        int r910 = 0;
    L463:
        if ((r262 & 524288) == 0) goto L465;
        int r911 = 0;
    L467:
        if ((r262 & 1048576) == 0) goto L469;
        int r912 = -1;
    L471:
        if ((r262 & 2097152) == 0) goto L473;
        float r913 = 0.0f;
    L475:
        if ((r262 & 4194304) == 0) goto L477;
        float r914 = 0.0f;
    L479:
        if ((r262 & 8388608) == 0) goto L481;
        int r915 = 0;
    L483:
        if ((r262 & 16777216) == 0) goto L485;
        int r916 = -1;
    L487:
        if ((r262 & 33554432) == 0) goto L489;
        float r917 = 0.0f;
    L490:
        int r1411 = r97;
        if ((r262 & 67108864) == 0) goto L493;
        float[] r100 = new float[7];
    L494:
        float[] r1412 = r100;
        if ((r262 & 134217728) == 0) goto L497;
        float[] r101 = new float[2];
    L499:
        if ((r262 & 268435456) == 0) goto L501;
        int r102 = 0;
    L503:
        if ((r262 & 536870912) == 0) goto L505;
        int r103 = 0;
    L507:
        if ((r262 & 1073741824) == 0) goto L509;
        int r104 = 0;
    L511:
        if ((r262 & Integer.MIN_VALUE) == 0) goto L513;
        int r105 = 0;
    L515:
        if ((r263 & 1) == 0) goto L517;
        int r106 = 0;
    L519:
        if ((r263 & 2) == 0) goto L521;
        int r107 = 0;
    L523:
        if ((r263 & 4) == 0) goto L525;
        int r108 = 0;
    L527:
        if ((r263 & 8) == 0) goto L529;
        int r109 = 0;
    L531:
        if ((r263 & 16) == 0) goto L533;
        int r1010 = 0;
    L535:
        if ((r263 & 32) == 0) goto L537;
        int r1011 = 0;
    L539:
        if ((r263 & 64) == 0) goto L541;
        int r1012 = 0;
    L542:
        float[] r1413 = r101;
        if ((r263 & 128) == 0) goto L545;
        int r265 = 0;
    L546:
        int r1414 = r265;
        if ((r263 & 256) == 0) goto L549;
        int r266 = 0;
    L550:
        int r1415 = r266;
        if ((r263 & 512) == 0) goto L553;
        int r267 = 0;
    L554:
        int r1416 = r267;
        if ((r263 & 1024) == 0) goto L557;
        int r268 = 0;
    L558:
        int r1417 = r268;
        if ((r263 & 2048) == 0) goto L561;
        int r269 = 0;
    L562:
        int r1418 = r269;
        if ((r263 & 4096) == 0) goto L565;
        int r270 = 0;
    L566:
        int r1419 = r270;
        if ((r263 & 8192) == 0) goto L569;
        int r271 = 0;
    L570:
        int r1510 = r271;
        if ((r263 & 16384) == 0) goto L573;
        int r272 = 0;
    L575:
        if ((r263 & 32768) == 0) goto L577;
        int r1101 = 0;
    L579:
        if ((r263 & 65536) == 0) goto L581;
        float r1102 = 0.0f;
    L583:
        if ((r263 & 131072) != 0) goto L586;
        r31 = r256;
    L586:
        int r1511 = r272;
        if ((r263 & 262144) == 0) goto L589;
        int[] r273 = new int[7];
    L591:
        if ((r263 & 524288) == 0) goto L594;
        int r2510 = -1;
    L595:
        this(r1110, r7, r8, r9, r10, r11, r12, r13, r14, r15, r6, r1111, r1112, r1113, r19, r110, r1100, r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r1114, r38, r39, r40, r41, r42, r43, r44, r1115, r1116, r1117, r1118, r1210, r1211, r1212, r1213, r46, r47, r48, r49, r410, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r1214, r1215, r68, r1216, r1217, r1218, r1219, r1310, r1311, r1312, r1313, r610, r611, r612, r613, r77, r78, r79, r710, r711, r712, r713, r714, r715, r716, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r1314, r1315, r1316, r1317, r1318, r1319, r1410, r1411, r810, r98, r99, r910, r911, r912, r913, r914, r915, r916, r917, r1412, r1413, r102, r103, r104, r105, r106, r107, r108, r109, r1010, r1011, r1012, r1414, r1415, r1416, r1417, r1418, r1419, r1510, r1511, r1101, r1102, r31, r273, r2510);
        return;
    L594:
        r2510 = r258;
        goto L595
    L589:
        r273 = r257;
        goto L591
    L581:
        r1102 = r255;
        goto L583
    L577:
        r1101 = r254;
        goto L579
    L573:
        r272 = r253;
        goto L575
    L569:
        r271 = r252;
        goto L570
    L565:
        r270 = r251;
        goto L566
    L561:
        r269 = r250;
        goto L562
    L557:
        r268 = r249;
        goto L558
    L553:
        r267 = r248;
        goto L554
    L549:
        r266 = r247;
        goto L550
    L545:
        r265 = r246;
        goto L546
    L541:
        r1012 = r245;
        goto L542
    L537:
        r1011 = r244;
        goto L539
    L533:
        r1010 = r243;
        goto L535
    L529:
        r109 = r242;
        goto L531
    L525:
        r108 = r241;
        goto L527
    L521:
        r107 = r240;
        goto L523
    L517:
        r106 = r239;
        goto L519
    L513:
        r105 = r238;
        goto L515
    L509:
        r104 = r237;
        goto L511
    L505:
        r103 = r236;
        goto L507
    L501:
        r102 = r235;
        goto L503
    L497:
        r101 = r234;
        goto L499
    L493:
        r100 = r233;
        goto L494
    L489:
        r917 = r232;
        goto L490
    L485:
        r916 = r231;
        goto L487
    L481:
        r915 = r230;
        goto L483
    L477:
        r914 = r229;
        goto L479
    L473:
        r913 = r228;
        goto L475
    L469:
        r912 = r227;
        goto L471
    L465:
        r911 = r226;
        goto L467
    L461:
        r910 = r225;
        goto L463
    L457:
        r99 = r224;
        goto L459
    L453:
        r98 = r223;
        goto L455
    L449:
        r810 = r222;
        goto L451
    L445:
        r97 = r221;
        goto L447
    L441:
        r96 = r220;
        goto L442
    L437:
        r95 = r219;
        goto L438
    L433:
        r94 = r218;
        goto L434
    L429:
        r93 = r217;
        goto L430
    L425:
        r92 = r216;
        goto L426
    L421:
        r91 = r215;
        goto L422
    L417:
        r90 = r214;
        goto L418
    L413:
        r89 = r213;
        goto L414
    L409:
        r88 = r212;
        goto L411
    L405:
        r87 = r211;
        goto L407
    L401:
        r86 = r210;
        goto L403
    L397:
        r85 = r209;
        goto L399
    L393:
        r84 = r208;
        goto L395
    L389:
        r83 = r207;
        goto L391
    L385:
        r82 = r206;
        goto L387
    L381:
        r81 = r205;
        goto L383
    L377:
        r80 = r204;
        goto L379
    L373:
        r716 = r203;
        goto L375
    L369:
        r715 = r202;
        goto L371
    L365:
        r714 = r201;
        goto L367
    L361:
        r713 = r200;
        goto L363
    L357:
        r712 = r199;
        goto L359
    L353:
        r711 = r198;
        goto L355
    L349:
        r710 = r197;
        goto L351
    L345:
        r79 = r196;
        goto L347
    L341:
        r78 = r195;
        goto L343
    L337:
        r77 = r194;
        goto L339
    L333:
        r613 = r193;
        goto L335
    L329:
        r612 = r192;
        goto L331
    L325:
        r611 = r191;
        goto L327
    L321:
        r610 = r190;
        goto L323
    L317:
        r76 = r189;
        goto L319
    L313:
        r75 = r188;
        goto L314
    L309:
        r74 = r187;
        goto L310
    L305:
        r73 = r186;
        goto L306
    L301:
        r72 = r185;
        goto L302
    L297:
        r71 = r184;
        goto L298
    L293:
        r70 = r183;
        goto L294
    L289:
        r69 = r182;
        goto L290
    L285:
        r68 = r181;
        goto L286
    L281:
        r67 = r180;
        goto L283
    L277:
        r66 = r179;
        goto L278
    L273:
        r65 = r178;
        goto L274
    L269:
        r64 = r177;
        goto L271
    L265:
        r63 = r176;
        goto L267
    L261:
        r62 = r175;
        goto L263
    L257:
        r61 = r174;
        goto L259
    L253:
        r60 = r173;
        goto L255
    L249:
        r59 = r172;
        goto L251
    L245:
        r58 = r171;
        goto L247
    L241:
        r57 = r170;
        goto L243
    L237:
        r56 = r169;
        goto L239
    L233:
        r55 = r168;
        goto L235
    L229:
        r54 = r167;
        goto L231
    L225:
        r53 = r166;
        goto L227
    L221:
        r52 = r165;
        goto L223
    L217:
        r51 = r164;
        goto L219
    L213:
        r50 = r163;
        goto L215
    L209:
        r410 = r162;
        goto L211
    L205:
        r49 = r161;
        goto L207
    L201:
        r48 = r160;
        goto L203
    L197:
        r47 = r159;
        goto L199
    L193:
        r46 = r158;
        goto L195
    L189:
        r45 = r157;
        goto L191
    L185:
        r24 = r156;
        goto L186
    L181:
        r22 = r155;
        goto L182
    L177:
        r20 = r154;
        goto L178
    L173:
        r4 = r153;
        goto L174
    L169:
        r3 = r152;
        goto L170
    L165:
        r2 = r151;
        goto L166
    L161:
        r1 = r150;
        goto L162
    L157:
        r44 = r149;
        goto L158
    L153:
        r43 = r148;
        goto L155
    L149:
        r42 = r147;
        goto L151
    L145:
        r41 = r146;
        goto L147
    L141:
        r40 = r145;
        goto L143
    L137:
        r39 = r144;
        goto L139
    L133:
        r38 = r143;
        goto L135
    L129:
        r0 = r142;
        goto L131
    L125:
        r37 = r141;
        goto L127
    L121:
        r36 = r140;
        goto L123
    L117:
        r35 = r139;
        goto L119
    L113:
        r34 = r138;
        goto L115
    L109:
        r33 = r137;
        goto L111
    L105:
        r32 = r136;
        goto L107
    L101:
        r30 = r135;
        goto L103
    L97:
        r29 = r134;
        goto L98
    L93:
        r28 = r133;
        goto L95
    L89:
        r27 = r132;
        goto L91
    L85:
        r26 = r131;
        goto L87
    L81:
        r25 = r130;
        goto L83
    L77:
        r23 = r129;
        goto L79
    L73:
        r21 = r128;
        goto L75
    L69:
        r1100 = r127;
        goto L71
    L65:
        r110 = r126;
        goto L67
    L61:
        r19 = r125;
        goto L63
    L57:
        r18 = r124;
        goto L58
    L53:
        r17 = r123;
        goto L54
    L49:
        r16 = r122;
        goto L50
    L45:
        r6 = r121;
        goto L46
    L41:
        r15 = r120;
        goto L43
    L37:
        r14 = r119;
        goto L39
    L33:
        r13 = r118;
        goto L35
    L29:
        r12 = r117;
        goto L31
    L25:
        r11 = r116;
        goto L27
    L21:
        r10 = r115;
        goto L23
    L17:
        r9 = r114;
        goto L19
    L13:
        r8 = r113;
        goto L15
    L9:
        r7 = r112;
        goto L11
    L5:
        r5 = r111;
        goto L7
    }
}
