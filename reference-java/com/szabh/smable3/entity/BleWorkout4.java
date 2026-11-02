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
    public static final Companion Companion = new Companion(null);
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

        public enum DataType {
            WORKOUT_DATA_KEY_NONE,
            WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER,
            WORKOUT_DATA_KEY_ID,
            WORKOUT_DATA_KEY_MODE,
            WORKOUT_DATA_KEY_FLAG,
            WORKOUT_DATA_KEY_WITH_GPS,
            WORKOUT_DATA_KEY_SYNC_FLAG,
            WORKOUT_DATA_KEY_START,
            WORKOUT_DATA_KEY_DURATION,
            WORKOUT_DATA_KEY_PAUSED_DURATION,
            WORKOUT_DATA_KEY_BPM_CURRENT,
            WORKOUT_DATA_KEY_BPM_MIN,
            WORKOUT_DATA_KEY_BPM_MAX,
            WORKOUT_DATA_KEY_BPM_COUNT,
            WORKOUT_DATA_KEY_BPM_TOTAL,
            WORKOUT_DATA_KEY_STEPS,
            WORKOUT_DATA_KEY_DISTANCE,
            WORKOUT_DATA_KEY_CALORIE,
            WORKOUT_DATA_KEY_ALTITUDE_CURRENT,
            WORKOUT_DATA_KEY_ALTITUDE_MIN,
            WORKOUT_DATA_KEY_ALTITUDE_MAX,
            WORKOUT_DATA_KEY_ALTITUDE_ASCEND,
            WORKOUT_DATA_KEY_ALTITUDE_DESCEND,
            WORKOUT_DATA_KEY_ALTITUDE_COUNT,
            WORKOUT_DATA_KEY_ALTITUDE_TOTAL,
            WORKOUT_DATA_KEY_AIR_PRESSURE,
            WORKOUT_DATA_KEY_SPEED,
            WORKOUT_DATA_KEY_SATELLITE_COUNT,
            WORKOUT_DATA_KEY_SPM_AVG,
            WORKOUT_DATA_KEY_SPM_MAX,
            WORKOUT_DATA_KEY_SPM_MIN,
            WORKOUT_DATA_KEY_PACE_AVG,
            WORKOUT_DATA_KEY_PACE_FASTEST,
            WORKOUT_DATA_KEY_PACE_SLOWEST,
            WORKOUT_DATA_KEY_STRESS_CURRENT,
            WORKOUT_DATA_KEY_STRESS_MIN,
            WORKOUT_DATA_KEY_STRESS_MAX,
            WORKOUT_DATA_KEY_STRESS_COUNT,
            WORKOUT_DATA_KEY_STRESS_TOTAL,
            WORKOUT_DATA_KEY_SPEED_MAX,
            WORKOUT_DATA_KEY_SPEED_MIN,
            WORKOUT_DATA_KEY_BARO_DATA,
            WORKOUT_DATA_KEY_PACE,
            WORKOUT_DATA_KEY_PACE_MAX,
            WORKOUT_DATA_KEY_PACE_MIN,
            WORKOUT_DATA_KEY_SPEED_AVG,
            WORKOUT_DATA_KEY_STAMINA,
            WORKOUT_DATA_KEY_AEROBIC,
            WORKOUT_DATA_KEY_ANAEROBIC,
            WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT,
            WORKOUT_DATA_KEY_GOMORE_SWIM_TYPE,
            WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT,
            WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE,
            WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK,
            WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT,
            WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT,
            WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT,
            WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT,
            WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT,
            WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT,
            WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT,
            WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT,
            WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT,
            WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING,
            WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING,
            WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE,
            WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT,
            WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE,
            WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX,
            WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE,
            WORKOUT_DATA_KEY_GOMORE_RUN_STEP_LEN,
            WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION,
            WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT,
            WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE,
            WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX,
            WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS,
            WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME,
            WORKOUT_DATA_KEY_VO2MAX,
            WORKOUT_DATA_KEY_PERSONAL_ZONE,
            WORKOUT_DATA_KEY_RECOVERY_TIME,
            WORKOUT_DATA_KEY_TRAINING_LOAD,
            WORKOUT_DATA_KEY_TRAINING_STATUS,
            WORKOUT_DATA_KEY_FITNESS_AGE,
            WORKOUT_DATA_KEY_KCAL_OUT,
            WORKOUT_DATA_KEY_MET_OUT,
            WORKOUT_DATA_KEY_FAT_OUT,
            WORKOUT_DATA_KEY_CARBO_OUT,
            WORKOUT_DATA_KEY_LEVEL_OUT,
            WORKOUT_DATA_KEY_TE_AEROBIC,
            WORKOUT_DATA_KEY_TE_ANAEROBIC,
            WORKOUT_DATA_KEY_CNT_LAP,
            WORKOUT_DATA_KEY_SWOLF,
            WORKOUT_DATA_KEY_CYCLING_INDEX_FTP,
            WORKOUT_DATA_KEY_METS_OUT_STATIC,
            WORKOUT_DATA_KEY_TL_TREND,
            WORKOUT_DATA_KEY_STROKE_CNT,
            WORKOUT_DATA_KEY_FRONTCRAWL_PERC,
            WORKOUT_DATA_KEY_BREASTSTROKE_PERC,
            WORKOUT_DATA_KEY_BACKSTROKE_PERC,
            WORKOUT_DATA_KEY_BUTTERFLY_PERC,
            WORKOUT_DATA_KEY_PATH_POINTS,
            WORKOUT_DATA_KEY_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_HR_PATH_POINTS,
            WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_PACE_PATH_POINTS,
            WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_POWER_PATH_POINTS,
            WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS,
            WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_SPEED_PATH_POINTS,
            WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO,
            WORKOUT_DATA_KEY_TRANSITION_DURATION,
            WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR,
            WORKOUT_DATA_KEY_LACTATE_PACE,
            WORKOUT_DATA_KEY_BEST_RUN_TIME,
            CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME,
            CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME,
            CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE,
            CD_WORKOUT_DATA_KEY_TIME_STATUS,
            CD_WORKOUT_DATA_KEY_TARGET_DISTANCE,
            CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE,
            CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE,
            CD_WORKOUT_DATA_KEY_DISTANCE_STATUS,
            CD_WORKOUT_DATA_KEY_TARGET_PACE,
            CD_WORKOUT_DATA_KEY_ACTUAL_PACE,
            CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE,
            CD_WORKOUT_DATA_KEY_PACE_STATUS,
            CD_WORKOUT_DATA_KEY_TARGET_SPEED,
            CD_WORKOUT_DATA_KEY_ACTUAL_SPEED,
            CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE,
            CD_WORKOUT_DATA_KEY_SPEED_STATUS,
            CD_WORKOUT_DATA_KEY_ANIM_COORDINATE,
            CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID,
            CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN,
            CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT,
            CD_WORKOUT_DATA_KEY_WEEK_TREND,
            CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT,
            CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS,
            CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO,
            CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS,
            CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO,
            CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS,
            CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE,
            CD_WORKOUT_DATA_KEY_PATH_POINTS_WIDTH,
            CD_WORKOUT_DATA_KEY_PATH_POINTS_HEIGHT,
            CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS,
            CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO,
            CD_WORKOUT_DATA_KEY_PERIPHERAL_STATUS,
            CD_WORKOUT_DATA_KEY_POOL_LENGTH,
            CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1,
            CD_WORKOUT_DATA_KEY_MAX;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

            @aa1
            public static EnumEntries<DataType> getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final ByteOrder getMByteOrder() {
            return BleWorkout4.mByteOrder;
        }

        public final void setMByteOrder(@aa1 ByteOrder byteOrder) {
            Intrinsics.X0O(byteOrder, "<set-?>");
            BleWorkout4.mByteOrder = byteOrder;
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
        public static final Companion Companion = new Companion(null);
        public static final int FLAG_AI_COACH_ASSESS = 8;
        public static final int FLAG_AI_COACH_SPORT = 16;
        public static final int FLAG_LACTATE_THRESHOLD = 1;
        public static final int FLAG_NONE = 0;
        public static final int FLAG_PILOT = 4;
        public static final int FLAG_VO2MAX = 2;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    static {
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        mByteOrder = LITTLE_ENDIAN;
    }

    public BleWorkout4() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, null, 0, 0, 0, 0, null, null, 0.0f, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, 0, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, null, 0, -1, -1, -1, -1, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWorkout4 copy$default(BleWorkout4 bleWorkout4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i38, int i39, int i40, int i41, float f9, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, float f10, float f11, int i52, int[] iArr, int i53, int i54, int i55, int i56, float[] fArr, int[] iArr2, float f12, int i57, int i58, List list, int i59, int i60, List list2, int i61, int i62, List list3, int i63, int i64, List list4, int i65, int i66, List list5, int i67, int i68, List list6, int i69, int i70, List list7, int i71, float f13, float f14, float f15, float f16, float f17, int i72, int i73, List list8, int i74, List list9, int i75, List list10, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, float f18, float f19, int i88, int i89, float f20, float[] fArr2, float[] fArr3, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, float f21, float f22, int[] iArr3, int i110, int i111, int i112, int i113, int i114, int i115, Object obj) {
        int i116 = (i111 & 1) != 0 ? bleWorkout4.mStart : i;
        int i117 = (i111 & 2) != 0 ? bleWorkout4.mEnd : i2;
        int i118 = (i111 & 4) != 0 ? bleWorkout4.mSize : i3;
        int i119 = (i111 & 8) != 0 ? bleWorkout4.mChildNumber : i4;
        int i120 = (i111 & 16) != 0 ? bleWorkout4.mMode : i5;
        int i121 = (i111 & 32) != 0 ? bleWorkout4.mDuration : i6;
        int i122 = (i111 & 64) != 0 ? bleWorkout4.mPausedDuration : i7;
        int i123 = (i111 & 128) != 0 ? bleWorkout4.mCurBpm : i8;
        int i124 = (i111 & 256) != 0 ? bleWorkout4.mAvgBpm : i9;
        int i125 = (i111 & 512) != 0 ? bleWorkout4.mMaxBpm : i10;
        int i126 = i116;
        int i127 = (i111 & 1024) != 0 ? bleWorkout4.mMinBpm : i11;
        int i128 = (i111 & 2048) != 0 ? bleWorkout4.mCountBpm : i12;
        int i129 = (i111 & 4096) != 0 ? bleWorkout4.mTotalBpm : i13;
        int i130 = (i111 & 8192) != 0 ? bleWorkout4.mStep : i14;
        int i131 = (i111 & 16384) != 0 ? bleWorkout4.mDistance : i15;
        int i132 = (i111 & 32768) != 0 ? bleWorkout4.mCalorie : i16;
        int i133 = (i111 & 65536) != 0 ? bleWorkout4.mAltitude : i17;
        int i134 = (i111 & 131072) != 0 ? bleWorkout4.mMaxAltitude : i18;
        int i135 = (i111 & 262144) != 0 ? bleWorkout4.mMinAltitude : i19;
        int i136 = (i111 & 524288) != 0 ? bleWorkout4.mAscendAltitude : i20;
        int i137 = (i111 & 1048576) != 0 ? bleWorkout4.mDescendAltitude : i21;
        int i138 = (i111 & 2097152) != 0 ? bleWorkout4.mCountAltitude : i22;
        int i139 = (i111 & 4194304) != 0 ? bleWorkout4.mTotalAltitude : i23;
        int i140 = (i111 & 8388608) != 0 ? bleWorkout4.mAirPressure : i24;
        float f23 = (i111 & 16777216) != 0 ? bleWorkout4.mSpeed : f;
        int i141 = (i111 & 33554432) != 0 ? bleWorkout4.mCountSatellite : i25;
        int i142 = (i111 & 67108864) != 0 ? bleWorkout4.mSpm : i26;
        int i143 = (i111 & 134217728) != 0 ? bleWorkout4.mMaxSpm : i27;
        int i144 = (i111 & 268435456) != 0 ? bleWorkout4.mMinSpm : i28;
        int i145 = (i111 & 536870912) != 0 ? bleWorkout4.mPace : i29;
        int i146 = (i111 & 1073741824) != 0 ? bleWorkout4.mMaxPace : i30;
        int i147 = (i111 & Integer.MIN_VALUE) != 0 ? bleWorkout4.mMinPace : i31;
        int i148 = (i112 & 1) != 0 ? bleWorkout4.mCurStress : i32;
        int i149 = (i112 & 2) != 0 ? bleWorkout4.mAvgStress : i33;
        int i150 = (i112 & 4) != 0 ? bleWorkout4.mMinStress : i34;
        int i151 = (i112 & 8) != 0 ? bleWorkout4.mMaxStress : i35;
        int i152 = (i112 & 16) != 0 ? bleWorkout4.mCountStress : i36;
        int i153 = (i112 & 32) != 0 ? bleWorkout4.mTotalStress : i37;
        float f24 = (i112 & 64) != 0 ? bleWorkout4.mMaxSpeed : f2;
        float f25 = (i112 & 128) != 0 ? bleWorkout4.mMinSpeed : f3;
        float f26 = (i112 & 256) != 0 ? bleWorkout4.mAvgSpeed : f4;
        float f27 = (i112 & 512) != 0 ? bleWorkout4.mStamina : f5;
        float f28 = (i112 & 1024) != 0 ? bleWorkout4.mAerobic : f6;
        float f29 = (i112 & 2048) != 0 ? bleWorkout4.mAnaerobic : f7;
        float f30 = (i112 & 4096) != 0 ? bleWorkout4.mMetTotal : f8;
        int i154 = (i112 & 8192) != 0 ? bleWorkout4.mRecoveryTime : i38;
        int i155 = (i112 & 16384) != 0 ? bleWorkout4.mTrainingLoad : i39;
        int i156 = (i112 & 32768) != 0 ? bleWorkout4.mMaxVO2 : i40;
        int i157 = (i112 & 65536) != 0 ? bleWorkout4.mCnt : i41;
        float f31 = (i112 & 131072) != 0 ? bleWorkout4.mCadence : f9;
        int i158 = (i112 & 262144) != 0 ? bleWorkout4.mMaxCadence : i42;
        int i159 = (i112 & 524288) != 0 ? bleWorkout4.mSwimType : i43;
        int i160 = (i112 & 1048576) != 0 ? bleWorkout4.mCntFore : i44;
        int i161 = (i112 & 2097152) != 0 ? bleWorkout4.mCntBack : i45;
        int i162 = (i112 & 4194304) != 0 ? bleWorkout4.mBackSwingTime : i46;
        int i163 = (i112 & 8388608) != 0 ? bleWorkout4.mDownSwingTime : i47;
        int i164 = (i112 & 16777216) != 0 ? bleWorkout4.mDribbleTime : i48;
        int i165 = (i112 & 33554432) != 0 ? bleWorkout4.mTripCount : i49;
        int i166 = (i112 & 67108864) != 0 ? bleWorkout4.mSessionCount : i50;
        int i167 = (i112 & 134217728) != 0 ? bleWorkout4.mStaBalance : i51;
        float f32 = (i112 & 268435456) != 0 ? bleWorkout4.mStepLen : f10;
        float f33 = (i112 & 536870912) != 0 ? bleWorkout4.mVerticalOscillation : f11;
        int i168 = (i112 & 1073741824) != 0 ? bleWorkout4.mRunPowerWatt : i52;
        int[] iArr4 = (i112 & Integer.MIN_VALUE) != 0 ? bleWorkout4.mBpmZoneCount : iArr;
        int i169 = i168;
        int i170 = (i113 & 1) != 0 ? bleWorkout4.mLactateThresholdHr : i53;
        int i171 = (i113 & 2) != 0 ? bleWorkout4.mLactateThresholdPace : i54;
        int i172 = (i113 & 4) != 0 ? bleWorkout4.mTrainingStatus : i55;
        int i173 = (i113 & 8) != 0 ? bleWorkout4.mFitnessAge : i56;
        float[] fArr4 = (i113 & 16) != 0 ? bleWorkout4.mFitnessLevel : fArr;
        int[] iArr5 = (i113 & 32) != 0 ? bleWorkout4.mBestRunTime : iArr2;
        float f34 = (i113 & 64) != 0 ? bleWorkout4.mTlTrend : f12;
        int i174 = (i113 & 128) != 0 ? bleWorkout4.mPathCount : i57;
        int i175 = (i113 & 256) != 0 ? bleWorkout4.mPathSampleInterval : i58;
        List list11 = (i113 & 512) != 0 ? bleWorkout4.mPathPoints : list;
        int i176 = (i113 & 1024) != 0 ? bleWorkout4.mHrPathCount : i59;
        int i177 = (i113 & 2048) != 0 ? bleWorkout4.mHrPathSampleInterval : i60;
        List list12 = (i113 & 4096) != 0 ? bleWorkout4.mHrPathPoints : list2;
        int i178 = (i113 & 8192) != 0 ? bleWorkout4.mPacePathCount : i61;
        int i179 = (i113 & 16384) != 0 ? bleWorkout4.mPacePathSampleInterval : i62;
        List list13 = (i113 & 32768) != 0 ? bleWorkout4.mPacePathPoints : list3;
        int i180 = (i113 & 65536) != 0 ? bleWorkout4.mSpeedPathCount : i63;
        int i181 = (i113 & 131072) != 0 ? bleWorkout4.mSpeedPathSampleInterval : i64;
        List list14 = (i113 & 262144) != 0 ? bleWorkout4.mSpeedPathPoints : list4;
        int i182 = (i113 & 524288) != 0 ? bleWorkout4.mCadencePathCount : i65;
        int i183 = (i113 & 1048576) != 0 ? bleWorkout4.mCadencePathSampleInterval : i66;
        List list15 = (i113 & 2097152) != 0 ? bleWorkout4.mCadencePathPoints : list5;
        int i184 = (i113 & 4194304) != 0 ? bleWorkout4.mAltitudePathCount : i67;
        int i185 = (i113 & 8388608) != 0 ? bleWorkout4.mAltitudePathSampleInterval : i68;
        List list16 = (i113 & 16777216) != 0 ? bleWorkout4.mAltitudePathPoints : list6;
        int i186 = (i113 & 33554432) != 0 ? bleWorkout4.mRecoveryHrCount : i69;
        int i187 = (i113 & 67108864) != 0 ? bleWorkout4.mRecoveryHrSampleInterval : i70;
        List list17 = (i113 & 134217728) != 0 ? bleWorkout4.mRecoveryHrPoints : list7;
        int i188 = (i113 & 268435456) != 0 ? bleWorkout4.mSwimPoolLength : i71;
        float f35 = (i113 & 536870912) != 0 ? bleWorkout4.realTimeAerobic : f13;
        float f36 = (i113 & 1073741824) != 0 ? bleWorkout4.realTimeAnaerobic : f14;
        return bleWorkout4.copy(i126, i117, i118, i119, i120, i121, i122, i123, i124, i125, i127, i128, i129, i130, i131, i132, i133, i134, i135, i136, i137, i138, i139, i140, f23, i141, i142, i143, i144, i145, i146, i147, i148, i149, i150, i151, i152, i153, f24, f25, f26, f27, f28, f29, f30, i154, i155, i156, i157, f31, i158, i159, i160, i161, i162, i163, i164, i165, i166, i167, f32, f33, i169, iArr4, i170, i171, i172, i173, fArr4, iArr5, f34, i174, i175, list11, i176, i177, list12, i178, i179, list13, i180, i181, list14, i182, i183, list15, i184, i185, list16, i186, i187, list17, i188, f35, f36, (i113 & Integer.MIN_VALUE) != 0 ? bleWorkout4.mCalorieTotal : f15, (i114 & 1) != 0 ? bleWorkout4.mFatTotal : f16, (i114 & 2) != 0 ? bleWorkout4.mCarboTotal : f17, (i114 & 4) != 0 ? bleWorkout4.mPowerCount : i72, (i114 & 8) != 0 ? bleWorkout4.mPowerInterval : i73, (i114 & 16) != 0 ? bleWorkout4.mPowerPoints : list8, (i114 & 32) != 0 ? bleWorkout4.mSpmPathPointsCount : i74, (i114 & 64) != 0 ? bleWorkout4.mSpmPathPointsPoints : list9, (i114 & 128) != 0 ? bleWorkout4.mStepLenCount : i75, (i114 & 256) != 0 ? bleWorkout4.mStepLenPoints : list10, (i114 & 512) != 0 ? bleWorkout4.mNavigatorTargetTime : i76, (i114 & 1024) != 0 ? bleWorkout4.mNavigatorActualTime : i77, (i114 & 2048) != 0 ? bleWorkout4.mNavigatorDifferenceTime : i78, (i114 & 4096) != 0 ? bleWorkout4.mNavigatorStatusTime : i79, (i114 & 8192) != 0 ? bleWorkout4.mNavigatorTargetDistance : i80, (i114 & 16384) != 0 ? bleWorkout4.mNavigatorActualDistance : i81, (i114 & 32768) != 0 ? bleWorkout4.mNavigatorDifferenceDistance : i82, (i114 & 65536) != 0 ? bleWorkout4.mNavigatorStatusDistance : i83, (i114 & 131072) != 0 ? bleWorkout4.mNavigatorTargetPace : i84, (i114 & 262144) != 0 ? bleWorkout4.mNavigatorActualPace : i85, (i114 & 524288) != 0 ? bleWorkout4.mNavigatorDifferencePace : i86, (i114 & 1048576) != 0 ? bleWorkout4.mNavigatorStatusPace : i87, (i114 & 2097152) != 0 ? bleWorkout4.mNavigatorTargetSpeed : f18, (i114 & 4194304) != 0 ? bleWorkout4.mNavigatorActualSpeed : f19, (i114 & 8388608) != 0 ? bleWorkout4.mNavigatorDifferenceSpeed : i88, (i114 & 16777216) != 0 ? bleWorkout4.mNavigatorStatusSpeed : i89, (i114 & 33554432) != 0 ? bleWorkout4.mMaxOxygenPower : f20, (i114 & 67108864) != 0 ? bleWorkout4.mTrendWeek : fArr2, (i114 & 134217728) != 0 ? bleWorkout4.mCyclingIndex : fArr3, (i114 & 268435456) != 0 ? bleWorkout4.mSwimSwolf : i90, (i114 & 536870912) != 0 ? bleWorkout4.mCntLap : i91, (i114 & 1073741824) != 0 ? bleWorkout4.mFrontCrawlPerc : i92, (i114 & Integer.MIN_VALUE) != 0 ? bleWorkout4.mBreaststrokePerc : i93, (i115 & 1) != 0 ? bleWorkout4.mBackstrokePerc : i94, (i115 & 2) != 0 ? bleWorkout4.mButterflyPerc : i95, (i115 & 4) != 0 ? bleWorkout4.mEllipticalSteps : i96, (i115 & 8) != 0 ? bleWorkout4.mWorkoutFlag : i97, (i115 & 16) != 0 ? bleWorkout4.mChildSwimStartTime : i98, (i115 & 32) != 0 ? bleWorkout4.mChildSwimDuration : i99, (i115 & 64) != 0 ? bleWorkout4.mChildSwimDistance : i100, (i115 & 128) != 0 ? bleWorkout4.mChildCyclingStartTime : i101, (i115 & 256) != 0 ? bleWorkout4.mChildCyclingDuration : i102, (i115 & 512) != 0 ? bleWorkout4.mChildCyclingDistance : i103, (i115 & 1024) != 0 ? bleWorkout4.mChildRunStartTime : i104, (i115 & 2048) != 0 ? bleWorkout4.mChildRunDuration : i105, (i115 & 4096) != 0 ? bleWorkout4.mChildRunDistance : i106, (i115 & 8192) != 0 ? bleWorkout4.mChildSwimMode : i107, (i115 & 16384) != 0 ? bleWorkout4.mChildCyclingMode : i108, (i115 & 32768) != 0 ? bleWorkout4.mChildRunMode : i109, (i115 & 65536) != 0 ? bleWorkout4.mRunLactateAvg : f21, (i115 & 131072) != 0 ? bleWorkout4.mCyclingLactateAvg : f22, (i115 & 262144) != 0 ? bleWorkout4.mPersonalZone : iArr3, (i115 & 524288) != 0 ? bleWorkout4.mAICoachSportID : i110);
    }

    private final int readDynamicIntData(int i, boolean z) {
        if (i == 1) {
            return z ? readUInt8() : readInt8();
        }
        if (i == 2) {
            return z ? readUInt16(mByteOrder) : readInt16(mByteOrder);
        }
        if (i == 4) {
            return readInt32(mByteOrder);
        }
        readBytes(i);
        return 0;
    }

    public static /* synthetic */ int readDynamicIntData$default(BleWorkout4 bleWorkout4, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return bleWorkout4.readDynamicIntData(i, z);
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
    public final BleWorkout4 copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i38, int i39, int i40, int i41, float f9, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, float f10, float f11, int i52, @aa1 int[] mBpmZoneCount, int i53, int i54, int i55, int i56, @aa1 float[] mFitnessLevel, @aa1 int[] mBestRunTime, float f12, int i57, int i58, @aa1 List<float[]> mPathPoints, int i59, int i60, @aa1 List<Integer> mHrPathPoints, int i61, int i62, @aa1 List<Integer> mPacePathPoints, int i63, int i64, @aa1 List<Integer> mSpeedPathPoints, int i65, int i66, @aa1 List<Integer> mCadencePathPoints, int i67, int i68, @aa1 List<Integer> mAltitudePathPoints, int i69, int i70, @aa1 List<Integer> mRecoveryHrPoints, int i71, float f13, float f14, float f15, float f16, float f17, int i72, int i73, @aa1 List<Integer> mPowerPoints, int i74, @aa1 List<Integer> mSpmPathPointsPoints, int i75, @aa1 List<Float> mStepLenPoints, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, float f18, float f19, int i88, int i89, float f20, @aa1 float[] mTrendWeek, @aa1 float[] mCyclingIndex, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, float f21, float f22, @aa1 int[] mPersonalZone, int i110) {
        Intrinsics.X0O(mBpmZoneCount, "mBpmZoneCount");
        Intrinsics.X0O(mFitnessLevel, "mFitnessLevel");
        Intrinsics.X0O(mBestRunTime, "mBestRunTime");
        Intrinsics.X0O(mPathPoints, "mPathPoints");
        Intrinsics.X0O(mHrPathPoints, "mHrPathPoints");
        Intrinsics.X0O(mPacePathPoints, "mPacePathPoints");
        Intrinsics.X0O(mSpeedPathPoints, "mSpeedPathPoints");
        Intrinsics.X0O(mCadencePathPoints, "mCadencePathPoints");
        Intrinsics.X0O(mAltitudePathPoints, "mAltitudePathPoints");
        Intrinsics.X0O(mRecoveryHrPoints, "mRecoveryHrPoints");
        Intrinsics.X0O(mPowerPoints, "mPowerPoints");
        Intrinsics.X0O(mSpmPathPointsPoints, "mSpmPathPointsPoints");
        Intrinsics.X0O(mStepLenPoints, "mStepLenPoints");
        Intrinsics.X0O(mTrendWeek, "mTrendWeek");
        Intrinsics.X0O(mCyclingIndex, "mCyclingIndex");
        Intrinsics.X0O(mPersonalZone, "mPersonalZone");
        return new BleWorkout4(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, f, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, f2, f3, f4, f5, f6, f7, f8, i38, i39, i40, i41, f9, i42, i43, i44, i45, i46, i47, i48, i49, i50, i51, f10, f11, i52, mBpmZoneCount, i53, i54, i55, i56, mFitnessLevel, mBestRunTime, f12, i57, i58, mPathPoints, i59, i60, mHrPathPoints, i61, i62, mPacePathPoints, i63, i64, mSpeedPathPoints, i65, i66, mCadencePathPoints, i67, i68, mAltitudePathPoints, i69, i70, mRecoveryHrPoints, i71, f13, f14, f15, f16, f17, i72, i73, mPowerPoints, i74, mSpmPathPointsPoints, i75, mStepLenPoints, i76, i77, i78, i79, i80, i81, i82, i83, i84, i85, i86, i87, f18, f19, i88, i89, f20, mTrendWeek, mCyclingIndex, i90, i91, i92, i93, i94, i95, i96, i97, i98, i99, i100, i101, i102, i103, i104, i105, i106, i107, i108, i109, f21, f22, mPersonalZone, i110);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        int uInt16;
        super.decode();
        this.mStart = readInt32(mByteOrder);
        this.mDuration = readInt32(mByteOrder) / 1000;
        this.mSize = readUInt16(mByteOrder);
        this.mChildNumber = readInt8();
        this.mMode = readUInt8();
        char uInt17 = readUInt16(mByteOrder);
        i1O0OXO1O.OXO1.OXO1("workout4 type = " + ((int) uInt17));
        do {
            char uInt18 = readUInt16(mByteOrder);
            i1O0OXO1O.OXO1.OXO1("workout4 len = " + ((int) uInt18));
            if (uInt18 != 0) {
                if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PAUSED_DURATION.ordinal()) {
                    this.mPausedDuration = readInt32(mByteOrder);
                    Unit unit = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BPM_CURRENT.ordinal()) {
                    this.mCurBpm = readUInt8();
                    Unit unit2 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BPM_MIN.ordinal()) {
                    this.mMinBpm = readUInt8();
                    Unit unit3 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BPM_MAX.ordinal()) {
                    this.mMaxBpm = readUInt8();
                    Unit unit4 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BPM_COUNT.ordinal()) {
                    int int32 = readInt32(mByteOrder);
                    this.mCountBpm = int32;
                    int i = this.mTotalBpm;
                    if (i != 0) {
                        this.mAvgBpm = i / int32;
                    }
                    Unit unit5 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BPM_TOTAL.ordinal()) {
                    int int33 = readInt32(mByteOrder);
                    this.mTotalBpm = int33;
                    int i2 = this.mCountBpm;
                    if (i2 != 0) {
                        this.mAvgBpm = int33 / i2;
                    }
                    Unit unit6 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STEPS.ordinal()) {
                    this.mStep = readInt32(mByteOrder);
                    Unit unit7 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_DISTANCE.ordinal()) {
                    this.mDistance = readInt32(mByteOrder);
                    Unit unit8 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_CALORIE.ordinal()) {
                    this.mCalorie = readInt32(mByteOrder);
                    Unit unit9 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_CURRENT.ordinal()) {
                    this.mAltitude = readInt16(mByteOrder);
                    Unit unit10 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_MIN.ordinal()) {
                    this.mMinAltitude = readInt16(mByteOrder);
                    Unit unit11 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_MAX.ordinal()) {
                    this.mMaxAltitude = readInt16(mByteOrder);
                    Unit unit12 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_ASCEND.ordinal()) {
                    this.mAscendAltitude = readInt16(mByteOrder);
                    Unit unit13 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_DESCEND.ordinal()) {
                    this.mDescendAltitude = readInt16(mByteOrder);
                    Unit unit14 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_COUNT.ordinal()) {
                    this.mCountAltitude = readInt32(mByteOrder);
                    Unit unit15 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_TOTAL.ordinal()) {
                    this.mTotalAltitude = readInt32(mByteOrder);
                    Unit unit16 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_AIR_PRESSURE.ordinal()) {
                    this.mAirPressure = readInt16(mByteOrder);
                    Unit unit17 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED.ordinal()) {
                    this.mSpeed = readFloat(mByteOrder);
                    Unit unit18 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SATELLITE_COUNT.ordinal()) {
                    this.mCountSatellite = readInt32(mByteOrder);
                    Unit unit19 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPM_AVG.ordinal()) {
                    this.mSpm = readUInt16(mByteOrder);
                    Unit unit20 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPM_MAX.ordinal()) {
                    this.mMaxSpm = readUInt16(mByteOrder);
                    Unit unit21 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPM_MIN.ordinal()) {
                    this.mMinSpm = readUInt16(mByteOrder);
                    Unit unit22 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PACE_AVG.ordinal()) {
                    this.mPace = readInt32(mByteOrder);
                    Unit unit23 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PACE_FASTEST.ordinal()) {
                    this.mMinPace = readInt32(mByteOrder);
                    Unit unit24 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PACE_SLOWEST.ordinal()) {
                    this.mMaxPace = readInt32(mByteOrder);
                    Unit unit25 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STRESS_CURRENT.ordinal()) {
                    this.mCurStress = readUInt8();
                    Unit unit26 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STRESS_MIN.ordinal()) {
                    this.mMinStress = readUInt8();
                    Unit unit27 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STRESS_MAX.ordinal()) {
                    this.mMaxStress = readUInt8();
                    Unit unit28 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STRESS_COUNT.ordinal()) {
                    int int34 = readInt32(mByteOrder);
                    this.mCountStress = int34;
                    int i3 = this.mTotalStress;
                    if (i3 != 0) {
                        this.mAvgStress = i3 / int34;
                    }
                    Unit unit29 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STRESS_TOTAL.ordinal()) {
                    int int35 = readInt32(mByteOrder);
                    this.mTotalStress = int35;
                    int i4 = this.mCountStress;
                    if (i4 != 0) {
                        this.mAvgStress = int35 / i4;
                    }
                    Unit unit30 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED_MAX.ordinal()) {
                    this.mMaxSpeed = readFloat(mByteOrder);
                    Unit unit31 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED_MIN.ordinal()) {
                    this.mMinSpeed = readFloat(mByteOrder);
                    Unit unit32 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED_AVG.ordinal()) {
                    this.mAvgSpeed = readFloat(mByteOrder);
                    Unit unit33 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STAMINA.ordinal()) {
                    this.mStamina = readFloat(mByteOrder);
                    Unit unit34 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_TE_AEROBIC.ordinal()) {
                    this.mAerobic = readFloat(mByteOrder);
                    Unit unit35 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_TE_ANAEROBIC.ordinal()) {
                    this.mAnaerobic = readFloat(mByteOrder);
                    Unit unit36 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_TRAINING_LOAD.ordinal()) {
                    this.mTrainingLoad = readUInt16(mByteOrder);
                    Unit unit37 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_VO2MAX.ordinal()) {
                    this.mMaxVO2 = readInt16(mByteOrder);
                    Unit unit38 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_RECOVERY_TIME.ordinal()) {
                    if (uInt18 == 2) {
                        uInt16 = readUInt16(mByteOrder);
                    } else if (uInt18 != 4) {
                        readBytes(uInt18);
                        uInt16 = 0;
                    } else {
                        uInt16 = (int) readUInt32(mByteOrder);
                    }
                    this.mRecoveryTime = uInt16;
                    Unit unit39 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT.ordinal() || uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT.ordinal()) {
                    this.mCnt = readDynamicIntData$default(this, uInt18, false, 2, null);
                    i1O0OXO1O.OXO1.OXO1("workout4  type = " + ((int) uInt17) + " , mCnt = " + this.mCnt);
                    Unit unit40 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE.ordinal()) {
                    this.mSwimType = readUInt8();
                    Unit unit41 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE.ordinal()) {
                    this.mCntFore = readUInt16(mByteOrder);
                    Unit unit42 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK.ordinal()) {
                    this.mCntBack = readUInt16(mByteOrder);
                    Unit unit43 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING.ordinal()) {
                    this.mBackSwingTime = (int) readUInt32(mByteOrder);
                    Unit unit44 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING.ordinal()) {
                    this.mDownSwingTime = (int) readUInt32(mByteOrder);
                    Unit unit45 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE.ordinal()) {
                    this.mCadence = readFloat(mByteOrder);
                    Unit unit46 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX.ordinal()) {
                    this.mMaxCadence = (int) (readFloat(mByteOrder) * 1000);
                    Unit unit47 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME.ordinal()) {
                    this.mDribbleTime = readDynamicIntData$default(this, uInt18, false, 2, null);
                    Unit unit48 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT.ordinal() || uInt17 == Companion.DataType.WORKOUT_DATA_KEY_STROKE_CNT.ordinal()) {
                    this.mTripCount = readUInt16(mByteOrder);
                    Unit unit49 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT.ordinal()) {
                    this.mSessionCount = readUInt16(mByteOrder);
                    Unit unit50 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE.ordinal()) {
                    this.mStaBalance = readUInt16(mByteOrder);
                    Unit unit51 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN.ordinal()) {
                    this.mStepLen = readFloat(mByteOrder);
                    Unit unit52 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION.ordinal()) {
                    this.mVerticalOscillation = readFloat(mByteOrder);
                    Unit unit53 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT.ordinal()) {
                    this.mRunPowerWatt = readUInt16(mByteOrder);
                    Unit unit54 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT.ordinal()) {
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.mBpmZoneCount[i5] = readUInt16(mByteOrder);
                    }
                    Unit unit55 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR.ordinal()) {
                    this.mLactateThresholdHr = readUInt8();
                    Unit unit56 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_LACTATE_PACE.ordinal()) {
                    this.mLactateThresholdPace = readInt32(mByteOrder);
                    Unit unit57 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_TRAINING_STATUS.ordinal()) {
                    this.mTrainingStatus = readUInt8();
                    Unit unit58 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_FITNESS_AGE.ordinal()) {
                    this.mFitnessAge = readUInt8();
                    Unit unit59 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_LEVEL_OUT.ordinal()) {
                    for (int i6 = 0; i6 < 9; i6++) {
                        this.mFitnessLevel[i6] = readFloat(mByteOrder);
                    }
                    Unit unit60 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PATH_POINTS.ordinal()) {
                    List<float[]> arrayList = new ArrayList<>();
                    int i7 = uInt18 / '\b';
                    for (int i8 = 0; i8 < i7; i8++) {
                        arrayList.add(new float[]{readFloat(mByteOrder), readFloat(mByteOrder)});
                    }
                    int i9 = this.mPathCount;
                    if (i9 != 0) {
                        arrayList = CollectionsKt___CollectionsKt.IO0OOi(arrayList, i9);
                    }
                    this.mPathPoints = arrayList;
                    Unit unit61 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PATH_POINTS_INFO.ordinal()) {
                    this.mPathCount = readInt32(mByteOrder);
                    int size = this.mPathPoints.size();
                    int i10 = this.mPathCount;
                    if (size > i10) {
                        this.mPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPathPoints, i10);
                    }
                    this.mPathSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_HR_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < uInt18; i11++) {
                        arrayList2.add(Integer.valueOf(readUInt8()));
                    }
                    int i12 = this.mHrPathCount;
                    if (i12 != 0) {
                        arrayList2 = CollectionsKt___CollectionsKt.IO0OOi(arrayList2, i12);
                    }
                    this.mHrPathPoints = arrayList2;
                    Unit unit62 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO.ordinal()) {
                    this.mHrPathCount = readInt32(mByteOrder);
                    if (this.mHrPathPoints.size() > this.mHrPathCount) {
                        this.mHrPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mHrPathPoints, this.mPathCount);
                    }
                    this.mHrPathSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PACE_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList3 = new ArrayList<>();
                    int i13 = uInt18 / 4;
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList3.add(Integer.valueOf(readInt32(mByteOrder)));
                    }
                    int i15 = this.mPacePathCount;
                    if (i15 != 0) {
                        arrayList3 = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, i15);
                    }
                    this.mPacePathPoints = arrayList3;
                    Unit unit63 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO.ordinal()) {
                    this.mPacePathCount = readInt32(mByteOrder);
                    int size2 = this.mPacePathPoints.size();
                    int i16 = this.mPacePathCount;
                    if (size2 > i16) {
                        this.mPacePathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPacePathPoints, i16);
                    }
                    this.mPacePathSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList4 = new ArrayList<>();
                    int i17 = uInt18 / 4;
                    for (int i18 = 0; i18 < i17; i18++) {
                        arrayList4.add(Integer.valueOf((int) readFloat(mByteOrder)));
                    }
                    int i19 = this.mSpeedPathCount;
                    if (i19 != 0) {
                        arrayList4 = CollectionsKt___CollectionsKt.IO0OOi(arrayList4, i19);
                    }
                    this.mSpeedPathPoints = arrayList4;
                    Unit unit64 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO.ordinal()) {
                    this.mSpeedPathCount = readInt32(mByteOrder);
                    int size3 = this.mSpeedPathPoints.size();
                    int i20 = this.mSpeedPathCount;
                    if (size3 > i20) {
                        this.mSpeedPathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mSpeedPathPoints, i20);
                    }
                    this.mSpeedPathSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_POWER_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList5 = new ArrayList<>();
                    int i21 = uInt18 / 2;
                    for (int i22 = 0; i22 < i21; i22++) {
                        arrayList5.add(Integer.valueOf(readInt16(mByteOrder)));
                    }
                    int i23 = this.mPowerCount;
                    if (i23 != 0) {
                        arrayList5 = CollectionsKt___CollectionsKt.IO0OOi(arrayList5, i23);
                    }
                    this.mPowerPoints = arrayList5;
                    if (!arrayList5.isEmpty()) {
                        Iterator it = CollectionsKt___CollectionsKt.OO0Oi10(this.mPowerPoints).iterator();
                        int i24 = 0;
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            i24 += iIntValue;
                        }
                        this.mRunLactateAvg = i24 / this.mPowerPoints.size();
                    }
                    Unit unit65 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO.ordinal()) {
                    this.mPowerCount = readInt32(mByteOrder);
                    int size4 = this.mPowerPoints.size();
                    int i25 = this.mPowerCount;
                    if (size4 > i25) {
                        this.mPowerPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mPowerPoints, i25);
                    }
                    this.mPowerInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList6 = new ArrayList<>();
                    int i26 = uInt18 / 2;
                    for (int i27 = 0; i27 < i26; i27++) {
                        arrayList6.add(Integer.valueOf(readInt16(mByteOrder)));
                    }
                    int i28 = this.mSpmPathPointsCount;
                    if (i28 != 0) {
                        arrayList6 = CollectionsKt___CollectionsKt.IO0OOi(arrayList6, i28);
                    }
                    this.mSpmPathPointsPoints = arrayList6;
                    Unit unit66 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO.ordinal()) {
                    this.mSpmPathPointsCount = readInt32(mByteOrder);
                    int size5 = this.mSpmPathPointsPoints.size();
                    int i29 = this.mSpmPathPointsCount;
                    if (size5 > i29) {
                        this.mSpmPathPointsPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mSpmPathPointsPoints, i29);
                    }
                    readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS.ordinal()) {
                    List<Float> arrayList7 = new ArrayList<>();
                    int i30 = uInt18 / 4;
                    for (int i31 = 0; i31 < i30; i31++) {
                        arrayList7.add(Float.valueOf(readFloat(mByteOrder)));
                    }
                    int i32 = this.mStepLenCount;
                    if (i32 != 0) {
                        arrayList7 = CollectionsKt___CollectionsKt.IO0OOi(arrayList7, i32);
                    }
                    this.mStepLenPoints = arrayList7;
                    Unit unit67 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO.ordinal()) {
                    this.mStepLenCount = readInt32(mByteOrder);
                    int size6 = this.mStepLenPoints.size();
                    int i33 = this.mStepLenCount;
                    if (size6 > i33) {
                        this.mStepLenPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mStepLenPoints, i33);
                    }
                    readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS.ordinal()) {
                    List<Integer> arrayList8 = new ArrayList<>();
                    int i34 = uInt18 / 2;
                    for (int i35 = 0; i35 < i34; i35++) {
                        arrayList8.add(Integer.valueOf(readInt16(mByteOrder)));
                    }
                    int i36 = this.mAltitudePathCount;
                    if (i36 != 0) {
                        arrayList8 = CollectionsKt___CollectionsKt.IO0OOi(arrayList8, i36);
                    }
                    this.mAltitudePathPoints = arrayList8;
                    Unit unit68 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO.ordinal()) {
                    this.mAltitudePathCount = readInt32(mByteOrder);
                    int size7 = this.mAltitudePathPoints.size();
                    int i37 = this.mAltitudePathCount;
                    if (size7 > i37) {
                        this.mAltitudePathPoints = CollectionsKt___CollectionsKt.IO0OOi(this.mAltitudePathPoints, i37);
                    }
                    this.mAltitudePathSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS.ordinal()) {
                    ArrayList arrayList9 = new ArrayList();
                    for (int i38 = 0; i38 < uInt18; i38++) {
                        arrayList9.add(Integer.valueOf(readUInt8()));
                    }
                    this.mRecoveryHrPoints = arrayList9;
                    Unit unit69 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO.ordinal()) {
                    this.mRecoveryHrCount = readInt32(mByteOrder);
                    this.mRecoveryHrSampleInterval = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_POOL_LENGTH.ordinal()) {
                    this.mSwimPoolLength = readUInt8();
                    Unit unit70 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1.ordinal()) {
                    for (int i39 = 0; i39 < 7; i39++) {
                        this.mPersonalZone[i39] = readDynamicIntData$default(this, 2, false, 2, null);
                    }
                    Unit unit71 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BEST_RUN_TIME.ordinal()) {
                    for (int i40 = 0; i40 < 5; i40++) {
                        char uInt19 = readUInt16(mByteOrder);
                        if (uInt19 == 65535) {
                            uInt19 = 0;
                        }
                        this.mBestRunTime[i40] = uInt19;
                    }
                    Unit unit72 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_TL_TREND.ordinal()) {
                    this.mTlTrend = readFloat(mByteOrder);
                    Unit unit73 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_AEROBIC.ordinal()) {
                    this.realTimeAerobic = readFloat(mByteOrder);
                    Unit unit74 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_ANAEROBIC.ordinal()) {
                    this.realTimeAnaerobic = readFloat(mByteOrder);
                    Unit unit75 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_KCAL_OUT.ordinal()) {
                    this.mCalorieTotal = readFloat(mByteOrder);
                    Unit unit76 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_FAT_OUT.ordinal()) {
                    this.mFatTotal = readFloat(mByteOrder);
                    Unit unit77 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_CARBO_OUT.ordinal()) {
                    this.mCarboTotal = readFloat(mByteOrder);
                    Unit unit78 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME.ordinal()) {
                    this.mNavigatorTargetTime = readInt32(mByteOrder);
                    Unit unit79 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME.ordinal()) {
                    this.mNavigatorActualTime = readInt32(mByteOrder);
                    Unit unit80 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE.ordinal()) {
                    this.mNavigatorDifferenceTime = readInt32(mByteOrder);
                    Unit unit81 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TIME_STATUS.ordinal()) {
                    this.mNavigatorStatusTime = readUInt8();
                    Unit unit82 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_DISTANCE.ordinal()) {
                    this.mNavigatorTargetDistance = readInt32(mByteOrder);
                    Unit unit83 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE.ordinal()) {
                    this.mNavigatorActualDistance = readInt32(mByteOrder);
                    Unit unit84 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE.ordinal()) {
                    this.mNavigatorDifferenceDistance = readInt32(mByteOrder);
                    Unit unit85 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_DISTANCE_STATUS.ordinal()) {
                    this.mNavigatorStatusDistance = readUInt8();
                    Unit unit86 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_PACE.ordinal()) {
                    this.mNavigatorTargetPace = readInt32(mByteOrder);
                    Unit unit87 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_PACE.ordinal()) {
                    this.mNavigatorActualPace = readInt32(mByteOrder);
                    Unit unit88 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE.ordinal()) {
                    this.mNavigatorDifferencePace = readInt32(mByteOrder);
                    Unit unit89 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_PACE_STATUS.ordinal()) {
                    this.mNavigatorStatusPace = readUInt8();
                    Unit unit90 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_TARGET_SPEED.ordinal()) {
                    this.mNavigatorTargetSpeed = readFloat(mByteOrder);
                    Unit unit91 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_ACTUAL_SPEED.ordinal()) {
                    this.mNavigatorActualSpeed = readFloat(mByteOrder);
                    Unit unit92 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE.ordinal()) {
                    this.mNavigatorDifferenceSpeed = readInt32(mByteOrder);
                    Unit unit93 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_SPEED_STATUS.ordinal()) {
                    this.mNavigatorStatusSpeed = readUInt8();
                    Unit unit94 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_WEEK_TREND.ordinal()) {
                    for (int i41 = 0; i41 < 7; i41++) {
                        this.mTrendWeek[i41] = readFloat(mByteOrder);
                    }
                    Unit unit95 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_CYCLING_INDEX_FTP.ordinal()) {
                    for (int i42 = 0; i42 < 2; i42++) {
                        this.mCyclingIndex[i42] = readFloat(mByteOrder);
                    }
                    float[] fArr = this.mCyclingIndex;
                    if (!(fArr.length == 0)) {
                        float f = fArr[0];
                        if (f != -1.0f) {
                            this.mCyclingLactateAvg = f;
                        }
                    }
                    Unit unit96 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_CNT_LAP.ordinal()) {
                    this.mCntLap = readUInt8();
                    Unit unit97 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_FRONTCRAWL_PERC.ordinal()) {
                    this.mFrontCrawlPerc = readUInt8();
                    Unit unit98 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BREASTSTROKE_PERC.ordinal()) {
                    this.mBreaststrokePerc = readUInt8();
                    Unit unit99 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BACKSTROKE_PERC.ordinal()) {
                    this.mBackstrokePerc = readUInt8();
                    Unit unit100 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_BUTTERFLY_PERC.ordinal()) {
                    this.mButterflyPerc = readUInt8();
                    Unit unit101 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_METS_OUT_STATIC.ordinal()) {
                    float[] fArr2 = new float[5];
                    for (int i43 = 0; i43 < 5; i43++) {
                        fArr2[i43] = readFloat(mByteOrder);
                    }
                    this.mMetTotal = 0.0f;
                    for (int i44 = 0; i44 < 5; i44++) {
                        this.mMetTotal += fArr2[i44];
                    }
                    Unit unit102 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SWOLF.ordinal()) {
                    this.mSwimSwolf = readInt16(mByteOrder);
                    Unit unit103 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS.ordinal()) {
                    this.mEllipticalSteps = readInt32(mByteOrder);
                    Unit unit104 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER.ordinal()) {
                    int int36 = readInt32(mByteOrder);
                    int int37 = readInt32(mByteOrder);
                    readInt32(mByteOrder);
                    int int38 = readInt32(mByteOrder);
                    char uInt8 = readUInt8();
                    i1O0OXO1O.OXO1.OXO1("workout4 子项目 mode = " + ((int) uInt8) + " , startTime = " + int36 + " , duration = " + int37 + ", distance = " + int38);
                    if (uInt8 == '\t') {
                        this.mChildRunStartTime = int36;
                        this.mChildRunDuration = int37;
                        this.mChildRunDistance = int38;
                        this.mChildRunMode = uInt8;
                    } else if (uInt8 == '\n') {
                        this.mChildCyclingStartTime = int36;
                        this.mChildCyclingDuration = int37;
                        this.mChildCyclingDistance = int38;
                        this.mChildCyclingMode = uInt8;
                    } else if (uInt8 == 163) {
                        this.mChildSwimStartTime = int36;
                        this.mChildSwimDuration = int37;
                        this.mChildSwimDistance = int38;
                        this.mChildSwimMode = uInt8;
                    }
                    readInt8();
                    readInt16(mByteOrder);
                } else if (uInt17 == Companion.DataType.WORKOUT_DATA_KEY_FLAG.ordinal()) {
                    this.mWorkoutFlag = readInt8();
                    Unit unit105 = Unit.OXO1;
                } else if (uInt17 == Companion.DataType.CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID.ordinal()) {
                    this.mAICoachSportID = readInt8();
                    Unit unit106 = Unit.OXO1;
                } else {
                    readBytes(uInt18);
                    Unit unit107 = Unit.OXO1;
                }
            }
            uInt17 = readUInt16(mByteOrder);
            i1O0OXO1O.OXO1.OXO1("workout4 type = " + ((int) uInt17));
        } while (uInt17 > 0);
        this.mEnd = this.mStart + this.mDuration + (this.mPausedDuration / 1000);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWorkout4)) {
            return false;
        }
        BleWorkout4 bleWorkout4 = (BleWorkout4) obj;
        return this.mStart == bleWorkout4.mStart && this.mEnd == bleWorkout4.mEnd && this.mSize == bleWorkout4.mSize && this.mChildNumber == bleWorkout4.mChildNumber && this.mMode == bleWorkout4.mMode && this.mDuration == bleWorkout4.mDuration && this.mPausedDuration == bleWorkout4.mPausedDuration && this.mCurBpm == bleWorkout4.mCurBpm && this.mAvgBpm == bleWorkout4.mAvgBpm && this.mMaxBpm == bleWorkout4.mMaxBpm && this.mMinBpm == bleWorkout4.mMinBpm && this.mCountBpm == bleWorkout4.mCountBpm && this.mTotalBpm == bleWorkout4.mTotalBpm && this.mStep == bleWorkout4.mStep && this.mDistance == bleWorkout4.mDistance && this.mCalorie == bleWorkout4.mCalorie && this.mAltitude == bleWorkout4.mAltitude && this.mMaxAltitude == bleWorkout4.mMaxAltitude && this.mMinAltitude == bleWorkout4.mMinAltitude && this.mAscendAltitude == bleWorkout4.mAscendAltitude && this.mDescendAltitude == bleWorkout4.mDescendAltitude && this.mCountAltitude == bleWorkout4.mCountAltitude && this.mTotalAltitude == bleWorkout4.mTotalAltitude && this.mAirPressure == bleWorkout4.mAirPressure && Float.compare(this.mSpeed, bleWorkout4.mSpeed) == 0 && this.mCountSatellite == bleWorkout4.mCountSatellite && this.mSpm == bleWorkout4.mSpm && this.mMaxSpm == bleWorkout4.mMaxSpm && this.mMinSpm == bleWorkout4.mMinSpm && this.mPace == bleWorkout4.mPace && this.mMaxPace == bleWorkout4.mMaxPace && this.mMinPace == bleWorkout4.mMinPace && this.mCurStress == bleWorkout4.mCurStress && this.mAvgStress == bleWorkout4.mAvgStress && this.mMinStress == bleWorkout4.mMinStress && this.mMaxStress == bleWorkout4.mMaxStress && this.mCountStress == bleWorkout4.mCountStress && this.mTotalStress == bleWorkout4.mTotalStress && Float.compare(this.mMaxSpeed, bleWorkout4.mMaxSpeed) == 0 && Float.compare(this.mMinSpeed, bleWorkout4.mMinSpeed) == 0 && Float.compare(this.mAvgSpeed, bleWorkout4.mAvgSpeed) == 0 && Float.compare(this.mStamina, bleWorkout4.mStamina) == 0 && Float.compare(this.mAerobic, bleWorkout4.mAerobic) == 0 && Float.compare(this.mAnaerobic, bleWorkout4.mAnaerobic) == 0 && Float.compare(this.mMetTotal, bleWorkout4.mMetTotal) == 0 && this.mRecoveryTime == bleWorkout4.mRecoveryTime && this.mTrainingLoad == bleWorkout4.mTrainingLoad && this.mMaxVO2 == bleWorkout4.mMaxVO2 && this.mCnt == bleWorkout4.mCnt && Float.compare(this.mCadence, bleWorkout4.mCadence) == 0 && this.mMaxCadence == bleWorkout4.mMaxCadence && this.mSwimType == bleWorkout4.mSwimType && this.mCntFore == bleWorkout4.mCntFore && this.mCntBack == bleWorkout4.mCntBack && this.mBackSwingTime == bleWorkout4.mBackSwingTime && this.mDownSwingTime == bleWorkout4.mDownSwingTime && this.mDribbleTime == bleWorkout4.mDribbleTime && this.mTripCount == bleWorkout4.mTripCount && this.mSessionCount == bleWorkout4.mSessionCount && this.mStaBalance == bleWorkout4.mStaBalance && Float.compare(this.mStepLen, bleWorkout4.mStepLen) == 0 && Float.compare(this.mVerticalOscillation, bleWorkout4.mVerticalOscillation) == 0 && this.mRunPowerWatt == bleWorkout4.mRunPowerWatt && Intrinsics.XOO0ii0(this.mBpmZoneCount, bleWorkout4.mBpmZoneCount) && this.mLactateThresholdHr == bleWorkout4.mLactateThresholdHr && this.mLactateThresholdPace == bleWorkout4.mLactateThresholdPace && this.mTrainingStatus == bleWorkout4.mTrainingStatus && this.mFitnessAge == bleWorkout4.mFitnessAge && Intrinsics.XOO0ii0(this.mFitnessLevel, bleWorkout4.mFitnessLevel) && Intrinsics.XOO0ii0(this.mBestRunTime, bleWorkout4.mBestRunTime) && Float.compare(this.mTlTrend, bleWorkout4.mTlTrend) == 0 && this.mPathCount == bleWorkout4.mPathCount && this.mPathSampleInterval == bleWorkout4.mPathSampleInterval && Intrinsics.XOO0ii0(this.mPathPoints, bleWorkout4.mPathPoints) && this.mHrPathCount == bleWorkout4.mHrPathCount && this.mHrPathSampleInterval == bleWorkout4.mHrPathSampleInterval && Intrinsics.XOO0ii0(this.mHrPathPoints, bleWorkout4.mHrPathPoints) && this.mPacePathCount == bleWorkout4.mPacePathCount && this.mPacePathSampleInterval == bleWorkout4.mPacePathSampleInterval && Intrinsics.XOO0ii0(this.mPacePathPoints, bleWorkout4.mPacePathPoints) && this.mSpeedPathCount == bleWorkout4.mSpeedPathCount && this.mSpeedPathSampleInterval == bleWorkout4.mSpeedPathSampleInterval && Intrinsics.XOO0ii0(this.mSpeedPathPoints, bleWorkout4.mSpeedPathPoints) && this.mCadencePathCount == bleWorkout4.mCadencePathCount && this.mCadencePathSampleInterval == bleWorkout4.mCadencePathSampleInterval && Intrinsics.XOO0ii0(this.mCadencePathPoints, bleWorkout4.mCadencePathPoints) && this.mAltitudePathCount == bleWorkout4.mAltitudePathCount && this.mAltitudePathSampleInterval == bleWorkout4.mAltitudePathSampleInterval && Intrinsics.XOO0ii0(this.mAltitudePathPoints, bleWorkout4.mAltitudePathPoints) && this.mRecoveryHrCount == bleWorkout4.mRecoveryHrCount && this.mRecoveryHrSampleInterval == bleWorkout4.mRecoveryHrSampleInterval && Intrinsics.XOO0ii0(this.mRecoveryHrPoints, bleWorkout4.mRecoveryHrPoints) && this.mSwimPoolLength == bleWorkout4.mSwimPoolLength && Float.compare(this.realTimeAerobic, bleWorkout4.realTimeAerobic) == 0 && Float.compare(this.realTimeAnaerobic, bleWorkout4.realTimeAnaerobic) == 0 && Float.compare(this.mCalorieTotal, bleWorkout4.mCalorieTotal) == 0 && Float.compare(this.mFatTotal, bleWorkout4.mFatTotal) == 0 && Float.compare(this.mCarboTotal, bleWorkout4.mCarboTotal) == 0 && this.mPowerCount == bleWorkout4.mPowerCount && this.mPowerInterval == bleWorkout4.mPowerInterval && Intrinsics.XOO0ii0(this.mPowerPoints, bleWorkout4.mPowerPoints) && this.mSpmPathPointsCount == bleWorkout4.mSpmPathPointsCount && Intrinsics.XOO0ii0(this.mSpmPathPointsPoints, bleWorkout4.mSpmPathPointsPoints) && this.mStepLenCount == bleWorkout4.mStepLenCount && Intrinsics.XOO0ii0(this.mStepLenPoints, bleWorkout4.mStepLenPoints) && this.mNavigatorTargetTime == bleWorkout4.mNavigatorTargetTime && this.mNavigatorActualTime == bleWorkout4.mNavigatorActualTime && this.mNavigatorDifferenceTime == bleWorkout4.mNavigatorDifferenceTime && this.mNavigatorStatusTime == bleWorkout4.mNavigatorStatusTime && this.mNavigatorTargetDistance == bleWorkout4.mNavigatorTargetDistance && this.mNavigatorActualDistance == bleWorkout4.mNavigatorActualDistance && this.mNavigatorDifferenceDistance == bleWorkout4.mNavigatorDifferenceDistance && this.mNavigatorStatusDistance == bleWorkout4.mNavigatorStatusDistance && this.mNavigatorTargetPace == bleWorkout4.mNavigatorTargetPace && this.mNavigatorActualPace == bleWorkout4.mNavigatorActualPace && this.mNavigatorDifferencePace == bleWorkout4.mNavigatorDifferencePace && this.mNavigatorStatusPace == bleWorkout4.mNavigatorStatusPace && Float.compare(this.mNavigatorTargetSpeed, bleWorkout4.mNavigatorTargetSpeed) == 0 && Float.compare(this.mNavigatorActualSpeed, bleWorkout4.mNavigatorActualSpeed) == 0 && this.mNavigatorDifferenceSpeed == bleWorkout4.mNavigatorDifferenceSpeed && this.mNavigatorStatusSpeed == bleWorkout4.mNavigatorStatusSpeed && Float.compare(this.mMaxOxygenPower, bleWorkout4.mMaxOxygenPower) == 0 && Intrinsics.XOO0ii0(this.mTrendWeek, bleWorkout4.mTrendWeek) && Intrinsics.XOO0ii0(this.mCyclingIndex, bleWorkout4.mCyclingIndex) && this.mSwimSwolf == bleWorkout4.mSwimSwolf && this.mCntLap == bleWorkout4.mCntLap && this.mFrontCrawlPerc == bleWorkout4.mFrontCrawlPerc && this.mBreaststrokePerc == bleWorkout4.mBreaststrokePerc && this.mBackstrokePerc == bleWorkout4.mBackstrokePerc && this.mButterflyPerc == bleWorkout4.mButterflyPerc && this.mEllipticalSteps == bleWorkout4.mEllipticalSteps && this.mWorkoutFlag == bleWorkout4.mWorkoutFlag && this.mChildSwimStartTime == bleWorkout4.mChildSwimStartTime && this.mChildSwimDuration == bleWorkout4.mChildSwimDuration && this.mChildSwimDistance == bleWorkout4.mChildSwimDistance && this.mChildCyclingStartTime == bleWorkout4.mChildCyclingStartTime && this.mChildCyclingDuration == bleWorkout4.mChildCyclingDuration && this.mChildCyclingDistance == bleWorkout4.mChildCyclingDistance && this.mChildRunStartTime == bleWorkout4.mChildRunStartTime && this.mChildRunDuration == bleWorkout4.mChildRunDuration && this.mChildRunDistance == bleWorkout4.mChildRunDistance && this.mChildSwimMode == bleWorkout4.mChildSwimMode && this.mChildCyclingMode == bleWorkout4.mChildCyclingMode && this.mChildRunMode == bleWorkout4.mChildRunMode && Float.compare(this.mRunLactateAvg, bleWorkout4.mRunLactateAvg) == 0 && Float.compare(this.mCyclingLactateAvg, bleWorkout4.mCyclingLactateAvg) == 0 && Intrinsics.XOO0ii0(this.mPersonalZone, bleWorkout4.mPersonalZone) && this.mAICoachSportID == bleWorkout4.mAICoachSportID;
    }

    @aa1
    public final String floatArrayListToString(@aa1 List<float[]> list) {
        Intrinsics.X0O(list, "list");
        List<float[]> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        String string = "";
        for (float[] fArr : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String string2 = Arrays.toString(fArr);
            Intrinsics.O10IXXX0X(string2, "toString(...)");
            sb.append(string2);
            string = sb.toString();
            arrayList.add(Unit.OXO1);
        }
        return string;
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

    public final void setMAICoachSportID(int i) {
        this.mAICoachSportID = i;
    }

    public final void setMAerobic(float f) {
        this.mAerobic = f;
    }

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMAltitudePathCount(int i) {
        this.mAltitudePathCount = i;
    }

    public final void setMAltitudePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAltitudePathPoints = list;
    }

    public final void setMAltitudePathSampleInterval(int i) {
        this.mAltitudePathSampleInterval = i;
    }

    public final void setMAnaerobic(float f) {
        this.mAnaerobic = f;
    }

    public final void setMAscendAltitude(int i) {
        this.mAscendAltitude = i;
    }

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public final void setMAvgStress(int i) {
        this.mAvgStress = i;
    }

    public final void setMBackSwingTime(int i) {
        this.mBackSwingTime = i;
    }

    public final void setMBackstrokePerc(int i) {
        this.mBackstrokePerc = i;
    }

    public final void setMBestRunTime(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mBestRunTime = iArr;
    }

    public final void setMBpmZoneCount(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mBpmZoneCount = iArr;
    }

    public final void setMBreaststrokePerc(int i) {
        this.mBreaststrokePerc = i;
    }

    public final void setMButterflyPerc(int i) {
        this.mButterflyPerc = i;
    }

    public final void setMCadence(float f) {
        this.mCadence = f;
    }

    public final void setMCadencePathCount(int i) {
        this.mCadencePathCount = i;
    }

    public final void setMCadencePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCadencePathPoints = list;
    }

    public final void setMCadencePathSampleInterval(int i) {
        this.mCadencePathSampleInterval = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMCalorieTotal(float f) {
        this.mCalorieTotal = f;
    }

    public final void setMCarboTotal(float f) {
        this.mCarboTotal = f;
    }

    public final void setMChildCyclingDistance(int i) {
        this.mChildCyclingDistance = i;
    }

    public final void setMChildCyclingDuration(int i) {
        this.mChildCyclingDuration = i;
    }

    public final void setMChildCyclingMode(int i) {
        this.mChildCyclingMode = i;
    }

    public final void setMChildCyclingStartTime(int i) {
        this.mChildCyclingStartTime = i;
    }

    public final void setMChildNumber(int i) {
        this.mChildNumber = i;
    }

    public final void setMChildRunDistance(int i) {
        this.mChildRunDistance = i;
    }

    public final void setMChildRunDuration(int i) {
        this.mChildRunDuration = i;
    }

    public final void setMChildRunMode(int i) {
        this.mChildRunMode = i;
    }

    public final void setMChildRunStartTime(int i) {
        this.mChildRunStartTime = i;
    }

    public final void setMChildSwimDistance(int i) {
        this.mChildSwimDistance = i;
    }

    public final void setMChildSwimDuration(int i) {
        this.mChildSwimDuration = i;
    }

    public final void setMChildSwimMode(int i) {
        this.mChildSwimMode = i;
    }

    public final void setMChildSwimStartTime(int i) {
        this.mChildSwimStartTime = i;
    }

    public final void setMCnt(int i) {
        this.mCnt = i;
    }

    public final void setMCntBack(int i) {
        this.mCntBack = i;
    }

    public final void setMCntFore(int i) {
        this.mCntFore = i;
    }

    public final void setMCntLap(int i) {
        this.mCntLap = i;
    }

    public final void setMCountAltitude(int i) {
        this.mCountAltitude = i;
    }

    public final void setMCountBpm(int i) {
        this.mCountBpm = i;
    }

    public final void setMCountSatellite(int i) {
        this.mCountSatellite = i;
    }

    public final void setMCountStress(int i) {
        this.mCountStress = i;
    }

    public final void setMCurBpm(int i) {
        this.mCurBpm = i;
    }

    public final void setMCurStress(int i) {
        this.mCurStress = i;
    }

    public final void setMCyclingLactateAvg(float f) {
        this.mCyclingLactateAvg = f;
    }

    public final void setMDescendAltitude(int i) {
        this.mDescendAltitude = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDownSwingTime(int i) {
        this.mDownSwingTime = i;
    }

    public final void setMDribbleTime(int i) {
        this.mDribbleTime = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMEllipticalSteps(int i) {
        this.mEllipticalSteps = i;
    }

    public final void setMEnd(int i) {
        this.mEnd = i;
    }

    public final void setMFatTotal(float f) {
        this.mFatTotal = f;
    }

    public final void setMFitnessAge(int i) {
        this.mFitnessAge = i;
    }

    public final void setMFitnessLevel(@aa1 float[] fArr) {
        Intrinsics.X0O(fArr, "<set-?>");
        this.mFitnessLevel = fArr;
    }

    public final void setMFrontCrawlPerc(int i) {
        this.mFrontCrawlPerc = i;
    }

    public final void setMHrPathCount(int i) {
        this.mHrPathCount = i;
    }

    public final void setMHrPathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHrPathPoints = list;
    }

    public final void setMHrPathSampleInterval(int i) {
        this.mHrPathSampleInterval = i;
    }

    public final void setMLactateThresholdHr(int i) {
        this.mLactateThresholdHr = i;
    }

    public final void setMLactateThresholdPace(int i) {
        this.mLactateThresholdPace = i;
    }

    public final void setMMaxAltitude(int i) {
        this.mMaxAltitude = i;
    }

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMMaxCadence(int i) {
        this.mMaxCadence = i;
    }

    public final void setMMaxOxygenPower(float f) {
        this.mMaxOxygenPower = f;
    }

    public final void setMMaxPace(int i) {
        this.mMaxPace = i;
    }

    public final void setMMaxSpeed(float f) {
        this.mMaxSpeed = f;
    }

    public final void setMMaxSpm(int i) {
        this.mMaxSpm = i;
    }

    public final void setMMaxStress(int i) {
        this.mMaxStress = i;
    }

    public final void setMMaxVO2(int i) {
        this.mMaxVO2 = i;
    }

    public final void setMMetTotal(float f) {
        this.mMetTotal = f;
    }

    public final void setMMinAltitude(int i) {
        this.mMinAltitude = i;
    }

    public final void setMMinBpm(int i) {
        this.mMinBpm = i;
    }

    public final void setMMinPace(int i) {
        this.mMinPace = i;
    }

    public final void setMMinSpeed(float f) {
        this.mMinSpeed = f;
    }

    public final void setMMinSpm(int i) {
        this.mMinSpm = i;
    }

    public final void setMMinStress(int i) {
        this.mMinStress = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMNavigatorActualDistance(int i) {
        this.mNavigatorActualDistance = i;
    }

    public final void setMNavigatorActualPace(int i) {
        this.mNavigatorActualPace = i;
    }

    public final void setMNavigatorActualSpeed(float f) {
        this.mNavigatorActualSpeed = f;
    }

    public final void setMNavigatorActualTime(int i) {
        this.mNavigatorActualTime = i;
    }

    public final void setMNavigatorDifferenceDistance(int i) {
        this.mNavigatorDifferenceDistance = i;
    }

    public final void setMNavigatorDifferencePace(int i) {
        this.mNavigatorDifferencePace = i;
    }

    public final void setMNavigatorDifferenceSpeed(int i) {
        this.mNavigatorDifferenceSpeed = i;
    }

    public final void setMNavigatorDifferenceTime(int i) {
        this.mNavigatorDifferenceTime = i;
    }

    public final void setMNavigatorStatusDistance(int i) {
        this.mNavigatorStatusDistance = i;
    }

    public final void setMNavigatorStatusPace(int i) {
        this.mNavigatorStatusPace = i;
    }

    public final void setMNavigatorStatusSpeed(int i) {
        this.mNavigatorStatusSpeed = i;
    }

    public final void setMNavigatorStatusTime(int i) {
        this.mNavigatorStatusTime = i;
    }

    public final void setMNavigatorTargetDistance(int i) {
        this.mNavigatorTargetDistance = i;
    }

    public final void setMNavigatorTargetPace(int i) {
        this.mNavigatorTargetPace = i;
    }

    public final void setMNavigatorTargetSpeed(float f) {
        this.mNavigatorTargetSpeed = f;
    }

    public final void setMNavigatorTargetTime(int i) {
        this.mNavigatorTargetTime = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPacePathCount(int i) {
        this.mPacePathCount = i;
    }

    public final void setMPacePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPacePathPoints = list;
    }

    public final void setMPacePathSampleInterval(int i) {
        this.mPacePathSampleInterval = i;
    }

    public final void setMPathCount(int i) {
        this.mPathCount = i;
    }

    public final void setMPathPoints(@aa1 List<float[]> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPathPoints = list;
    }

    public final void setMPathSampleInterval(int i) {
        this.mPathSampleInterval = i;
    }

    public final void setMPausedDuration(int i) {
        this.mPausedDuration = i;
    }

    public final void setMPersonalZone(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mPersonalZone = iArr;
    }

    public final void setMPowerCount(int i) {
        this.mPowerCount = i;
    }

    public final void setMPowerInterval(int i) {
        this.mPowerInterval = i;
    }

    public final void setMPowerPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPowerPoints = list;
    }

    public final void setMRecoveryHrCount(int i) {
        this.mRecoveryHrCount = i;
    }

    public final void setMRecoveryHrPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRecoveryHrPoints = list;
    }

    public final void setMRecoveryHrSampleInterval(int i) {
        this.mRecoveryHrSampleInterval = i;
    }

    public final void setMRecoveryTime(int i) {
        this.mRecoveryTime = i;
    }

    public final void setMRunLactateAvg(float f) {
        this.mRunLactateAvg = f;
    }

    public final void setMRunPowerWatt(int i) {
        this.mRunPowerWatt = i;
    }

    public final void setMSessionCount(int i) {
        this.mSessionCount = i;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    public final void setMSpeed(float f) {
        this.mSpeed = f;
    }

    public final void setMSpeedPathCount(int i) {
        this.mSpeedPathCount = i;
    }

    public final void setMSpeedPathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSpeedPathPoints = list;
    }

    public final void setMSpeedPathSampleInterval(int i) {
        this.mSpeedPathSampleInterval = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMSpmPathPointsCount(int i) {
        this.mSpmPathPointsCount = i;
    }

    public final void setMSpmPathPointsPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSpmPathPointsPoints = list;
    }

    public final void setMStaBalance(int i) {
        this.mStaBalance = i;
    }

    public final void setMStamina(float f) {
        this.mStamina = f;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMStepLen(float f) {
        this.mStepLen = f;
    }

    public final void setMStepLenCount(int i) {
        this.mStepLenCount = i;
    }

    public final void setMStepLenPoints(@aa1 List<Float> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mStepLenPoints = list;
    }

    public final void setMSwimPoolLength(int i) {
        this.mSwimPoolLength = i;
    }

    public final void setMSwimSwolf(int i) {
        this.mSwimSwolf = i;
    }

    public final void setMSwimType(int i) {
        this.mSwimType = i;
    }

    public final void setMTlTrend(float f) {
        this.mTlTrend = f;
    }

    public final void setMTotalAltitude(int i) {
        this.mTotalAltitude = i;
    }

    public final void setMTotalBpm(int i) {
        this.mTotalBpm = i;
    }

    public final void setMTotalStress(int i) {
        this.mTotalStress = i;
    }

    public final void setMTrainingLoad(int i) {
        this.mTrainingLoad = i;
    }

    public final void setMTrainingStatus(int i) {
        this.mTrainingStatus = i;
    }

    public final void setMTripCount(int i) {
        this.mTripCount = i;
    }

    public final void setMVerticalOscillation(float f) {
        this.mVerticalOscillation = f;
    }

    public final void setMWorkoutFlag(int i) {
        this.mWorkoutFlag = i;
    }

    public final void setRealTimeAerobic(float f) {
        this.realTimeAerobic = f;
    }

    public final void setRealTimeAnaerobic(float f) {
        this.realTimeAnaerobic = f;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleWorkout4(mStart=");
        sb.append(this.mStart);
        sb.append(",  mEnd=");
        sb.append(this.mEnd);
        sb.append(", mDuration=");
        sb.append(this.mDuration);
        sb.append(", mAltitude=");
        sb.append(this.mAltitude);
        sb.append(", mAirPressure=");
        sb.append(this.mAirPressure);
        sb.append(", mSpm=");
        sb.append(this.mSpm);
        sb.append(", mMode=");
        sb.append(this.mMode);
        sb.append(", mStep=");
        sb.append(this.mStep);
        sb.append(",mDistance=");
        sb.append(this.mDistance);
        sb.append(", mCalorie=");
        sb.append(this.mCalorie);
        sb.append(", mSpeed=");
        sb.append(this.mSpeed);
        sb.append(", mPace=");
        sb.append(this.mPace);
        sb.append(", mAvgBpm=");
        sb.append(this.mAvgBpm);
        sb.append(", mMaxBpm=");
        sb.append(this.mMaxBpm);
        sb.append(", mMinBpm=");
        sb.append(this.mMinBpm);
        sb.append(", mMaxSpm=");
        sb.append(this.mMaxSpm);
        sb.append(", mMinSpm=");
        sb.append(this.mMinSpm);
        sb.append(", mMaxPace=");
        sb.append(this.mMaxPace);
        sb.append("  mMinPace=");
        sb.append(this.mMinPace);
        sb.append(", mMaxAltitude=");
        sb.append(this.mMaxAltitude);
        sb.append(", mMinAltitude=");
        sb.append(this.mMinAltitude);
        sb.append(", mMinStress=");
        sb.append(this.mMinStress);
        sb.append(", mMaxStress=");
        sb.append(this.mMaxStress);
        sb.append(", mAvgStress=");
        sb.append(this.mAvgStress);
        sb.append(", mMaxSpeed=");
        sb.append(this.mMaxSpeed);
        sb.append(", mMinSpeed=");
        sb.append(this.mMinSpeed);
        sb.append(" , mMetTotal=");
        sb.append(this.mMetTotal);
        sb.append(", mAerobic=");
        sb.append(this.mAerobic);
        sb.append(", mAnaerobic=");
        sb.append(this.mAnaerobic);
        sb.append(", mStamina=");
        sb.append(this.mStamina);
        sb.append(", mAvgSpeed=");
        sb.append(this.mAvgSpeed);
        sb.append(", mCadence=");
        sb.append(this.mCadence);
        sb.append(", mMaxCadence=");
        sb.append(this.mMaxCadence);
        sb.append(", mCnt=");
        sb.append(this.mCnt);
        sb.append(" mBpmZoneCount=");
        String string = Arrays.toString(this.mBpmZoneCount);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        sb.append(string);
        sb.append(", mPersonalZone=");
        String string2 = Arrays.toString(this.mPersonalZone);
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        sb.append(string2);
        sb.append(", mLactateThresholdPace=");
        sb.append(this.mLactateThresholdPace);
        sb.append(", mRecoveryTime=");
        sb.append(this.mRecoveryTime);
        sb.append(", mTrainingLoad=");
        sb.append(this.mTrainingLoad);
        sb.append(", mMaxVO2=");
        sb.append(this.mMaxVO2);
        sb.append(", mLactateThresholdHr=");
        sb.append(this.mLactateThresholdHr);
        sb.append(", mWorkoutFlag=");
        sb.append(this.mWorkoutFlag);
        sb.append(",mPathCount=");
        sb.append(this.mPathCount);
        sb.append(", mPathSampleInterval=");
        sb.append(this.mPathSampleInterval);
        sb.append(", mPathPoints=");
        sb.append(floatArrayListToString(this.mPathPoints));
        sb.append(", mHrPathCount=");
        sb.append(this.mHrPathCount);
        sb.append(", mHrPathSampleInterval=");
        sb.append(this.mHrPathSampleInterval);
        sb.append(", mHrPathPoints=");
        sb.append(this.mHrPathPoints);
        sb.append(" mPacePathCount=");
        sb.append(this.mPacePathCount);
        sb.append(", mPacePathSampleInterval=");
        sb.append(this.mPacePathSampleInterval);
        sb.append(", mPacePathPoints=");
        sb.append(this.mPacePathPoints);
        sb.append(" mSpeedPathCount=");
        sb.append(this.mSpeedPathCount);
        sb.append(", mSpeedPathSampleInterval=");
        sb.append(this.mSpeedPathSampleInterval);
        sb.append(", mSpeedPathPoints=");
        sb.append(this.mSpeedPathPoints);
        sb.append("  mCadencePathCount=");
        sb.append(this.mCadencePathCount);
        sb.append(", mCadencePathSampleInterval=");
        sb.append(this.mCadencePathSampleInterval);
        sb.append(",mCadencePathPoints=");
        sb.append(this.mCadencePathPoints);
        sb.append(", mAltitudePathCount=");
        sb.append(this.mAltitudePathCount);
        sb.append(", mAltitudePathSampleInterval=");
        sb.append(this.mAltitudePathSampleInterval);
        sb.append(",mAltitudePathPoints=");
        sb.append(this.mAltitudePathPoints);
        sb.append("， realTimeAerobic=");
        sb.append(this.realTimeAerobic);
        sb.append(", realTimeAnaerobic=");
        sb.append(this.realTimeAnaerobic);
        sb.append(", mCalorieTotal=");
        sb.append(this.mCalorieTotal);
        sb.append("mFatTotal=");
        sb.append(this.mFatTotal);
        sb.append(",mCarboTotal=");
        sb.append(this.mCarboTotal);
        sb.append(",mPowerCount=");
        sb.append(this.mPowerCount);
        sb.append(",mPowerInterval=");
        sb.append(this.mPowerInterval);
        sb.append(",mPowerPoints=");
        sb.append(this.mPowerPoints);
        sb.append("mNavigatorTargetTime=");
        sb.append(this.mNavigatorTargetTime);
        sb.append(", mNavigatorActualTime=");
        sb.append(this.mNavigatorActualTime);
        sb.append(", mNavigatorDifferenceTime=");
        sb.append(this.mNavigatorDifferenceTime);
        sb.append("mNavigatorStatusTime=");
        sb.append(this.mNavigatorStatusTime);
        sb.append(", mNavigatorTargetDistance=");
        sb.append(this.mNavigatorTargetDistance);
        sb.append(", mNavigatorActualDistance=");
        sb.append(this.mNavigatorActualDistance);
        sb.append("mNavigatorDifferenceDistance=");
        sb.append(this.mNavigatorDifferenceDistance);
        sb.append(", mNavigatorStatusDistance=");
        sb.append(this.mNavigatorStatusDistance);
        sb.append(", mNavigatorTargetPace=");
        sb.append(this.mNavigatorTargetPace);
        sb.append("mNavigatorActualPace=");
        sb.append(this.mNavigatorActualPace);
        sb.append(", mNavigatorDifferencePace=");
        sb.append(this.mNavigatorDifferencePace);
        sb.append(", mNavigatorStatusPace=");
        sb.append(this.mNavigatorStatusPace);
        sb.append("mNavigatorTargetSpeed=");
        sb.append(this.mNavigatorTargetSpeed);
        sb.append(", mNavigatorActualSpeed=");
        sb.append(this.mNavigatorActualSpeed);
        sb.append(", mNavigatorDifferenceSpeed=");
        sb.append(this.mNavigatorDifferenceSpeed);
        sb.append("mNavigatorStatusSpeed=");
        sb.append(this.mNavigatorStatusSpeed);
        sb.append(", mMaxOxygenPower=");
        sb.append(this.mMaxOxygenPower);
        sb.append(", mCyclingIndex = ");
        sb.append(this.mCyclingIndex);
        sb.append(",mTrendWeek = ");
        sb.append(this.mTrendWeek);
        sb.append(", mSwimSwolf =");
        sb.append(this.mSwimSwolf);
        sb.append(", mCntLap = ");
        sb.append(this.mCntLap);
        sb.append(", mFrontCrawlPerc=");
        sb.append(this.mFrontCrawlPerc);
        sb.append(",mBreaststrokePerc = ");
        sb.append(this.mBreaststrokePerc);
        sb.append(", mButterflyPerc=");
        sb.append(this.mButterflyPerc);
        sb.append(", mEllipticalSteps=");
        sb.append(this.mEllipticalSteps);
        sb.append(",mChildSwimStartTime=");
        sb.append(this.mChildSwimStartTime);
        sb.append(",mChildSwimDuration=");
        sb.append(this.mChildSwimDuration);
        sb.append(",mChildSwimDistance=");
        sb.append(this.mChildSwimDistance);
        sb.append(",mChildCyclingStartTime=");
        sb.append(this.mChildCyclingStartTime);
        sb.append(",mChildCyclingDuration=");
        sb.append(this.mChildCyclingDuration);
        sb.append(",mChildCyclingDistance=");
        sb.append(this.mChildCyclingDistance);
        sb.append(",mChildRunStartTime=");
        sb.append(this.mChildRunStartTime);
        sb.append(",mChildRunDuration=");
        sb.append(this.mChildRunDuration);
        sb.append(",mChildRunDistance=");
        sb.append(this.mChildRunDistance);
        sb.append(",mChildSwimMode=");
        sb.append(this.mChildSwimMode);
        sb.append(",mChildCyclingMode=");
        sb.append(this.mChildCyclingMode);
        sb.append(",mChildRunMode=");
        sb.append(this.mChildRunMode);
        return sb.toString();
    }

    public BleWorkout4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i38, int i39, int i40, int i41, float f9, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, float f10, float f11, int i52, @aa1 int[] mBpmZoneCount, int i53, int i54, int i55, int i56, @aa1 float[] mFitnessLevel, @aa1 int[] mBestRunTime, float f12, int i57, int i58, @aa1 List<float[]> mPathPoints, int i59, int i60, @aa1 List<Integer> mHrPathPoints, int i61, int i62, @aa1 List<Integer> mPacePathPoints, int i63, int i64, @aa1 List<Integer> mSpeedPathPoints, int i65, int i66, @aa1 List<Integer> mCadencePathPoints, int i67, int i68, @aa1 List<Integer> mAltitudePathPoints, int i69, int i70, @aa1 List<Integer> mRecoveryHrPoints, int i71, float f13, float f14, float f15, float f16, float f17, int i72, int i73, @aa1 List<Integer> mPowerPoints, int i74, @aa1 List<Integer> mSpmPathPointsPoints, int i75, @aa1 List<Float> mStepLenPoints, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, float f18, float f19, int i88, int i89, float f20, @aa1 float[] mTrendWeek, @aa1 float[] mCyclingIndex, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, float f21, float f22, @aa1 int[] mPersonalZone, int i110) {
        Intrinsics.X0O(mBpmZoneCount, "mBpmZoneCount");
        Intrinsics.X0O(mFitnessLevel, "mFitnessLevel");
        Intrinsics.X0O(mBestRunTime, "mBestRunTime");
        Intrinsics.X0O(mPathPoints, "mPathPoints");
        Intrinsics.X0O(mHrPathPoints, "mHrPathPoints");
        Intrinsics.X0O(mPacePathPoints, "mPacePathPoints");
        Intrinsics.X0O(mSpeedPathPoints, "mSpeedPathPoints");
        Intrinsics.X0O(mCadencePathPoints, "mCadencePathPoints");
        Intrinsics.X0O(mAltitudePathPoints, "mAltitudePathPoints");
        Intrinsics.X0O(mRecoveryHrPoints, "mRecoveryHrPoints");
        Intrinsics.X0O(mPowerPoints, "mPowerPoints");
        Intrinsics.X0O(mSpmPathPointsPoints, "mSpmPathPointsPoints");
        Intrinsics.X0O(mStepLenPoints, "mStepLenPoints");
        Intrinsics.X0O(mTrendWeek, "mTrendWeek");
        Intrinsics.X0O(mCyclingIndex, "mCyclingIndex");
        Intrinsics.X0O(mPersonalZone, "mPersonalZone");
        this.mStart = i;
        this.mEnd = i2;
        this.mSize = i3;
        this.mChildNumber = i4;
        this.mMode = i5;
        this.mDuration = i6;
        this.mPausedDuration = i7;
        this.mCurBpm = i8;
        this.mAvgBpm = i9;
        this.mMaxBpm = i10;
        this.mMinBpm = i11;
        this.mCountBpm = i12;
        this.mTotalBpm = i13;
        this.mStep = i14;
        this.mDistance = i15;
        this.mCalorie = i16;
        this.mAltitude = i17;
        this.mMaxAltitude = i18;
        this.mMinAltitude = i19;
        this.mAscendAltitude = i20;
        this.mDescendAltitude = i21;
        this.mCountAltitude = i22;
        this.mTotalAltitude = i23;
        this.mAirPressure = i24;
        this.mSpeed = f;
        this.mCountSatellite = i25;
        this.mSpm = i26;
        this.mMaxSpm = i27;
        this.mMinSpm = i28;
        this.mPace = i29;
        this.mMaxPace = i30;
        this.mMinPace = i31;
        this.mCurStress = i32;
        this.mAvgStress = i33;
        this.mMinStress = i34;
        this.mMaxStress = i35;
        this.mCountStress = i36;
        this.mTotalStress = i37;
        this.mMaxSpeed = f2;
        this.mMinSpeed = f3;
        this.mAvgSpeed = f4;
        this.mStamina = f5;
        this.mAerobic = f6;
        this.mAnaerobic = f7;
        this.mMetTotal = f8;
        this.mRecoveryTime = i38;
        this.mTrainingLoad = i39;
        this.mMaxVO2 = i40;
        this.mCnt = i41;
        this.mCadence = f9;
        this.mMaxCadence = i42;
        this.mSwimType = i43;
        this.mCntFore = i44;
        this.mCntBack = i45;
        this.mBackSwingTime = i46;
        this.mDownSwingTime = i47;
        this.mDribbleTime = i48;
        this.mTripCount = i49;
        this.mSessionCount = i50;
        this.mStaBalance = i51;
        this.mStepLen = f10;
        this.mVerticalOscillation = f11;
        this.mRunPowerWatt = i52;
        this.mBpmZoneCount = mBpmZoneCount;
        this.mLactateThresholdHr = i53;
        this.mLactateThresholdPace = i54;
        this.mTrainingStatus = i55;
        this.mFitnessAge = i56;
        this.mFitnessLevel = mFitnessLevel;
        this.mBestRunTime = mBestRunTime;
        this.mTlTrend = f12;
        this.mPathCount = i57;
        this.mPathSampleInterval = i58;
        this.mPathPoints = mPathPoints;
        this.mHrPathCount = i59;
        this.mHrPathSampleInterval = i60;
        this.mHrPathPoints = mHrPathPoints;
        this.mPacePathCount = i61;
        this.mPacePathSampleInterval = i62;
        this.mPacePathPoints = mPacePathPoints;
        this.mSpeedPathCount = i63;
        this.mSpeedPathSampleInterval = i64;
        this.mSpeedPathPoints = mSpeedPathPoints;
        this.mCadencePathCount = i65;
        this.mCadencePathSampleInterval = i66;
        this.mCadencePathPoints = mCadencePathPoints;
        this.mAltitudePathCount = i67;
        this.mAltitudePathSampleInterval = i68;
        this.mAltitudePathPoints = mAltitudePathPoints;
        this.mRecoveryHrCount = i69;
        this.mRecoveryHrSampleInterval = i70;
        this.mRecoveryHrPoints = mRecoveryHrPoints;
        this.mSwimPoolLength = i71;
        this.realTimeAerobic = f13;
        this.realTimeAnaerobic = f14;
        this.mCalorieTotal = f15;
        this.mFatTotal = f16;
        this.mCarboTotal = f17;
        this.mPowerCount = i72;
        this.mPowerInterval = i73;
        this.mPowerPoints = mPowerPoints;
        this.mSpmPathPointsCount = i74;
        this.mSpmPathPointsPoints = mSpmPathPointsPoints;
        this.mStepLenCount = i75;
        this.mStepLenPoints = mStepLenPoints;
        this.mNavigatorTargetTime = i76;
        this.mNavigatorActualTime = i77;
        this.mNavigatorDifferenceTime = i78;
        this.mNavigatorStatusTime = i79;
        this.mNavigatorTargetDistance = i80;
        this.mNavigatorActualDistance = i81;
        this.mNavigatorDifferenceDistance = i82;
        this.mNavigatorStatusDistance = i83;
        this.mNavigatorTargetPace = i84;
        this.mNavigatorActualPace = i85;
        this.mNavigatorDifferencePace = i86;
        this.mNavigatorStatusPace = i87;
        this.mNavigatorTargetSpeed = f18;
        this.mNavigatorActualSpeed = f19;
        this.mNavigatorDifferenceSpeed = i88;
        this.mNavigatorStatusSpeed = i89;
        this.mMaxOxygenPower = f20;
        this.mTrendWeek = mTrendWeek;
        this.mCyclingIndex = mCyclingIndex;
        this.mSwimSwolf = i90;
        this.mCntLap = i91;
        this.mFrontCrawlPerc = i92;
        this.mBreaststrokePerc = i93;
        this.mBackstrokePerc = i94;
        this.mButterflyPerc = i95;
        this.mEllipticalSteps = i96;
        this.mWorkoutFlag = i97;
        this.mChildSwimStartTime = i98;
        this.mChildSwimDuration = i99;
        this.mChildSwimDistance = i100;
        this.mChildCyclingStartTime = i101;
        this.mChildCyclingDuration = i102;
        this.mChildCyclingDistance = i103;
        this.mChildRunStartTime = i104;
        this.mChildRunDuration = i105;
        this.mChildRunDistance = i106;
        this.mChildSwimMode = i107;
        this.mChildCyclingMode = i108;
        this.mChildRunMode = i109;
        this.mRunLactateAvg = f21;
        this.mCyclingLactateAvg = f22;
        this.mPersonalZone = mPersonalZone;
        this.mAICoachSportID = i110;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleWorkout4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i38, int i39, int i40, int i41, float f9, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, float f10, float f11, int i52, int[] iArr, int i53, int i54, int i55, int i56, float[] fArr, int[] iArr2, float f12, int i57, int i58, List list, int i59, int i60, List list2, int i61, int i62, List list3, int i63, int i64, List list4, int i65, int i66, List list5, int i67, int i68, List list6, int i69, int i70, List list7, int i71, float f13, float f14, float f15, float f16, float f17, int i72, int i73, List list8, int i74, List list9, int i75, List list10, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, float f18, float f19, int i88, int i89, float f20, float[] fArr2, float[] fArr3, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, float f21, float f22, int[] iArr3, int i110, int i111, int i112, int i113, int i114, int i115, DefaultConstructorMarker defaultConstructorMarker) {
        int i116 = (i111 & 1) != 0 ? 0 : i;
        int i117 = (i111 & 2) != 0 ? 0 : i2;
        int i118 = (i111 & 4) != 0 ? 0 : i3;
        int i119 = (i111 & 8) != 0 ? 0 : i4;
        int i120 = (i111 & 16) != 0 ? 0 : i5;
        int i121 = (i111 & 32) != 0 ? 0 : i6;
        int i122 = (i111 & 64) != 0 ? 0 : i7;
        int i123 = (i111 & 128) != 0 ? 0 : i8;
        int i124 = (i111 & 256) != 0 ? 0 : i9;
        int i125 = (i111 & 512) != 0 ? 0 : i10;
        int i126 = (i111 & 1024) != 0 ? 0 : i11;
        int i127 = i116;
        int i128 = (i111 & 2048) != 0 ? 0 : i12;
        int i129 = (i111 & 4096) != 0 ? 0 : i13;
        int i130 = (i111 & 8192) != 0 ? 0 : i14;
        int i131 = (i111 & 16384) != 0 ? 0 : i15;
        int i132 = (i111 & 32768) != 0 ? 0 : i16;
        int i133 = (i111 & 65536) != 0 ? 0 : i17;
        int i134 = (i111 & 131072) != 0 ? 0 : i18;
        int i135 = (i111 & 262144) != 0 ? 0 : i19;
        int i136 = (i111 & 524288) != 0 ? 0 : i20;
        int i137 = (i111 & 1048576) != 0 ? 0 : i21;
        int i138 = (i111 & 2097152) != 0 ? 0 : i22;
        int i139 = (i111 & 4194304) != 0 ? 0 : i23;
        int i140 = (i111 & 8388608) != 0 ? 0 : i24;
        float f23 = (i111 & 16777216) != 0 ? 0.0f : f;
        int i141 = (i111 & 33554432) != 0 ? 0 : i25;
        int i142 = (i111 & 67108864) != 0 ? 0 : i26;
        int i143 = (i111 & 134217728) != 0 ? 0 : i27;
        int i144 = (i111 & 268435456) != 0 ? 0 : i28;
        int i145 = (i111 & 536870912) != 0 ? 0 : i29;
        int i146 = (i111 & 1073741824) != 0 ? 0 : i30;
        int i147 = (i111 & Integer.MIN_VALUE) != 0 ? 0 : i31;
        int i148 = (i112 & 1) != 0 ? 0 : i32;
        int i149 = (i112 & 2) != 0 ? 0 : i33;
        int i150 = (i112 & 4) != 0 ? 0 : i34;
        int i151 = (i112 & 8) != 0 ? 0 : i35;
        int i152 = (i112 & 16) != 0 ? 0 : i36;
        int i153 = (i112 & 32) != 0 ? 0 : i37;
        float f24 = (i112 & 64) != 0 ? 0.0f : f2;
        int i154 = i147;
        float f25 = (i112 & 128) != 0 ? 0.0f : f3;
        float f26 = (i112 & 256) != 0 ? 0.0f : f4;
        float f27 = (i112 & 512) != 0 ? 0.0f : f5;
        float f28 = (i112 & 1024) != 0 ? 0.0f : f6;
        float f29 = (i112 & 2048) != 0 ? 0.0f : f7;
        float f30 = (i112 & 4096) != 0 ? 0.0f : f8;
        int i155 = (i112 & 8192) != 0 ? 0 : i38;
        int i156 = (i112 & 16384) != 0 ? 0 : i39;
        int i157 = (i112 & 32768) != 0 ? 0 : i40;
        int i158 = (i112 & 65536) != 0 ? 0 : i41;
        float f31 = (i112 & 131072) != 0 ? 0.0f : f9;
        int i159 = (i112 & 262144) != 0 ? 0 : i42;
        int i160 = (i112 & 524288) != 0 ? 0 : i43;
        int i161 = (i112 & 1048576) != 0 ? 0 : i44;
        int i162 = (i112 & 2097152) != 0 ? 0 : i45;
        int i163 = (i112 & 4194304) != 0 ? 0 : i46;
        int i164 = (i112 & 8388608) != 0 ? 0 : i47;
        int i165 = (i112 & 16777216) != 0 ? 0 : i48;
        int i166 = (i112 & 33554432) != 0 ? 0 : i49;
        int i167 = (i112 & 67108864) != 0 ? 0 : i50;
        int i168 = (i112 & 134217728) != 0 ? 0 : i51;
        float f32 = (i112 & 268435456) != 0 ? 0.0f : f10;
        float f33 = (i112 & 536870912) != 0 ? 0.0f : f11;
        int i169 = (i112 & 1073741824) != 0 ? 0 : i52;
        int[] iArr4 = (i112 & Integer.MIN_VALUE) != 0 ? new int[5] : iArr;
        int i170 = (i113 & 1) != 0 ? 0 : i53;
        int i171 = (i113 & 2) != 0 ? 0 : i54;
        int i172 = (i113 & 4) != 0 ? 0 : i55;
        int i173 = (i113 & 8) != 0 ? 0 : i56;
        int i174 = i156;
        float[] fArr4 = (i113 & 16) != 0 ? new float[9] : fArr;
        int[] iArr5 = (i113 & 32) != 0 ? new int[5] : iArr2;
        float f34 = (i113 & 64) != 0 ? 0.0f : f12;
        int[] iArr6 = iArr5;
        int i175 = (i113 & 128) != 0 ? 0 : i57;
        int i176 = (i113 & 256) != 0 ? 0 : i58;
        List arrayList = (i113 & 512) != 0 ? new ArrayList() : list;
        int i177 = (i113 & 1024) != 0 ? 0 : i59;
        int i178 = (i113 & 2048) != 0 ? 0 : i60;
        List arrayList2 = (i113 & 4096) != 0 ? new ArrayList() : list2;
        int i179 = (i113 & 8192) != 0 ? 0 : i61;
        int i180 = (i113 & 16384) != 0 ? 0 : i62;
        List arrayList3 = (i113 & 32768) != 0 ? new ArrayList() : list3;
        int i181 = (i113 & 65536) != 0 ? 0 : i63;
        int i182 = (i113 & 131072) != 0 ? 0 : i64;
        List arrayList4 = (i113 & 262144) != 0 ? new ArrayList() : list4;
        int i183 = (i113 & 524288) != 0 ? 0 : i65;
        int i184 = (i113 & 1048576) != 0 ? 0 : i66;
        List arrayList5 = (i113 & 2097152) != 0 ? new ArrayList() : list5;
        int i185 = (i113 & 4194304) != 0 ? 0 : i67;
        int i186 = (i113 & 8388608) != 0 ? 0 : i68;
        List arrayList6 = (i113 & 16777216) != 0 ? new ArrayList() : list6;
        int i187 = (i113 & 33554432) != 0 ? 0 : i69;
        int i188 = (i113 & 67108864) != 0 ? 0 : i70;
        List arrayList7 = (i113 & 134217728) != 0 ? new ArrayList() : list7;
        int i189 = (i113 & 268435456) != 0 ? 0 : i71;
        float f35 = (i113 & 536870912) != 0 ? 0.0f : f13;
        float f36 = (i113 & 1073741824) != 0 ? 0.0f : f14;
        float f37 = (i113 & Integer.MIN_VALUE) != 0 ? 0.0f : f15;
        float f38 = (i114 & 1) != 0 ? 0.0f : f16;
        float f39 = (i114 & 2) != 0 ? 0.0f : f17;
        int i190 = (i114 & 4) != 0 ? 0 : i72;
        int i191 = (i114 & 8) != 0 ? 0 : i73;
        List arrayList8 = (i114 & 16) != 0 ? new ArrayList() : list8;
        int i192 = (i114 & 32) != 0 ? 0 : i74;
        List arrayList9 = (i114 & 64) != 0 ? new ArrayList() : list9;
        int i193 = i180;
        int i194 = (i114 & 128) != 0 ? 0 : i75;
        List arrayList10 = (i114 & 256) != 0 ? new ArrayList() : list10;
        int i195 = (i114 & 512) != 0 ? 0 : i76;
        int i196 = (i114 & 1024) != 0 ? 0 : i77;
        int i197 = (i114 & 2048) != 0 ? 0 : i78;
        int i198 = (i114 & 4096) != 0 ? -1 : i79;
        int i199 = (i114 & 8192) != 0 ? 0 : i80;
        int i200 = (i114 & 16384) != 0 ? 0 : i81;
        int i201 = (i114 & 32768) != 0 ? 0 : i82;
        int i202 = (i114 & 65536) != 0 ? -1 : i83;
        int i203 = (i114 & 131072) != 0 ? 0 : i84;
        int i204 = (i114 & 262144) != 0 ? 0 : i85;
        int i205 = (i114 & 524288) != 0 ? 0 : i86;
        int i206 = (i114 & 1048576) != 0 ? -1 : i87;
        float f40 = (i114 & 2097152) != 0 ? 0.0f : f18;
        float f41 = (i114 & 4194304) != 0 ? 0.0f : f19;
        int i207 = (i114 & 8388608) != 0 ? 0 : i88;
        int i208 = (i114 & 16777216) != 0 ? -1 : i89;
        float f42 = (i114 & 33554432) != 0 ? 0.0f : f20;
        int i209 = i200;
        float[] fArr5 = (i114 & 67108864) != 0 ? new float[7] : fArr2;
        float[] fArr6 = (i114 & 134217728) != 0 ? new float[2] : fArr3;
        this(i127, i117, i118, i119, i120, i121, i122, i123, i124, i125, i126, i128, i129, i130, i131, i132, i133, i134, i135, i136, i137, i138, i139, i140, f23, i141, i142, i143, i144, i145, i146, i154, i148, i149, i150, i151, i152, i153, f24, f25, f26, f27, f28, f29, f30, i155, i174, i157, i158, f31, i159, i160, i161, i162, i163, i164, i165, i166, i167, i168, f32, f33, i169, iArr4, i170, i171, i172, i173, fArr4, iArr6, f34, i175, i176, arrayList, i177, i178, arrayList2, i179, i193, arrayList3, i181, i182, arrayList4, i183, i184, arrayList5, i185, i186, arrayList6, i187, i188, arrayList7, i189, f35, f36, f37, f38, f39, i190, i191, arrayList8, i192, arrayList9, i194, arrayList10, i195, i196, i197, i198, i199, i209, i201, i202, i203, i204, i205, i206, f40, f41, i207, i208, f42, fArr5, fArr6, (i114 & 268435456) != 0 ? 0 : i90, (i114 & 536870912) != 0 ? 0 : i91, (i114 & 1073741824) != 0 ? 0 : i92, (i114 & Integer.MIN_VALUE) != 0 ? 0 : i93, (i115 & 1) != 0 ? 0 : i94, (i115 & 2) != 0 ? 0 : i95, (i115 & 4) != 0 ? 0 : i96, (i115 & 8) != 0 ? 0 : i97, (i115 & 16) != 0 ? 0 : i98, (i115 & 32) != 0 ? 0 : i99, (i115 & 64) != 0 ? 0 : i100, (i115 & 128) != 0 ? 0 : i101, (i115 & 256) != 0 ? 0 : i102, (i115 & 512) != 0 ? 0 : i103, (i115 & 1024) != 0 ? 0 : i104, (i115 & 2048) != 0 ? 0 : i105, (i115 & 4096) != 0 ? 0 : i106, (i115 & 8192) != 0 ? 0 : i107, (i115 & 16384) != 0 ? 0 : i108, (i115 & 32768) != 0 ? 0 : i109, (i115 & 65536) != 0 ? 0.0f : f21, (i115 & 131072) == 0 ? f22 : 0.0f, (i115 & 262144) != 0 ? new int[7] : iArr3, (i115 & 524288) != 0 ? -1 : i110);
    }
}
