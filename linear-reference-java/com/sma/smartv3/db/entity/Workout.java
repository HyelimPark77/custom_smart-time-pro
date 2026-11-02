package com.sma.smartv3.db.entity;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import androidx.work.WorkInfo;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleWorkout;
import com.szabh.smable3.entity.BleWorkout2;
import com.szabh.smable3.entity.BleWorkout3;
import com.szabh.smable3.entity.BleWorkout4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({WorkoutConverter.class})
@Entity
public final class Workout implements Serializable {

    @ColumnInfo
    private int mAGpsType;

    @ColumnInfo
    private int mAICoachSportID;

    @ColumnInfo
    private float mAerobic;

    @ColumnInfo
    private int mAirPressure;

    @ColumnInfo
    private int mAlgorithmMarking;

    @ColumnInfo
    private int mAltitude;

    @ColumnInfo
    private int mAltitudePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mAltitudePathPoints;

    @ColumnInfo
    private int mAltitudePathSampleInterval;

    @ColumnInfo
    private float mAnaerobic;

    @ColumnInfo
    private int mAscendAltitude;

    @ColumnInfo
    private int mAvgBpm;

    @ColumnInfo
    private float mAvgSpeed;

    @ColumnInfo
    private int mAvgStress;

    @ColumnInfo
    private int mBackSwingTime;

    @ColumnInfo
    private int mBackstrokePerc;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mBestRunTime;

    @aa1
    @ColumnInfo
    private String mBleName;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mBpmZoneCount;

    @ColumnInfo
    private int mBreaststrokePerc;

    @ColumnInfo
    private int mButterflyPerc;

    @ColumnInfo
    private int mCadence;

    @ColumnInfo
    private int mCadencePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mCadencePathPoints;

    @ColumnInfo
    private int mCadencePathSampleInterval;

    @ColumnInfo
    private int mCalorie;

    @ColumnInfo
    private int mCalorieTotal;

    @ColumnInfo
    private float mCarboTotal;

    @ColumnInfo
    private int mChildCyclingDistance;

    @ColumnInfo
    private int mChildCyclingDuration;

    @ColumnInfo
    private int mChildCyclingMode;

    @ColumnInfo
    private long mChildCyclingStartTime;

    @ColumnInfo
    private int mChildNumber;

    @ColumnInfo
    private int mChildRunDistance;

    @ColumnInfo
    private int mChildRunDuration;

    @ColumnInfo
    private int mChildRunMode;

    @ColumnInfo
    private long mChildRunStartTime;

    @ColumnInfo
    private int mChildSwimDistance;

    @ColumnInfo
    private int mChildSwimDuration;

    @ColumnInfo
    private int mChildSwimMode;

    @ColumnInfo
    private long mChildSwimStartTime;

    @ColumnInfo
    private int mCnt;

    @ColumnInfo
    private int mCntBack;

    @ColumnInfo
    private int mCntFore;

    @ColumnInfo
    private int mCntLap;

    @ColumnInfo
    private int mCurBpm;

    @ColumnInfo
    private int mCurStress;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mCyclingIndex;

    @ColumnInfo
    private float mCyclingLactateAvg;

    @ColumnInfo
    private int mDescendAltitude;

    @tb1
    @ColumnInfo(defaultValue = "")
    private String mDeviceId;

    @ColumnInfo
    private int mDistance;

    @ColumnInfo
    private int mDownSwingTime;

    @ColumnInfo
    private int mDribbleTime;

    @ColumnInfo
    private int mDuration;

    @ColumnInfo
    private int mEllipticalSteps;

    @ColumnInfo
    private long mEnd;

    @ColumnInfo
    private float mFatTotal;

    @ColumnInfo
    private int mFeel;

    @aa1
    @ColumnInfo
    private String mFirmwareFlag;

    @ColumnInfo
    private int mFitnessAge;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mFitnessLevel;

    @ColumnInfo
    private int mFlag;

    @ColumnInfo
    private int mFrontCrawlPerc;

    @ColumnInfo
    private int mGoalCalorie;

    @ColumnInfo
    private int mGoalDistance;

    @ColumnInfo
    private int mGoalTime;

    @ColumnInfo
    private int mHrPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mHrPathPoints;

    @ColumnInfo
    private int mHrPathSampleInterval;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private int mLactateThresholdHr;

    @ColumnInfo
    private int mLactateThresholdPace;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMaxAltitude;

    @ColumnInfo
    private int mMaxBpm;

    @ColumnInfo
    private int mMaxCadence;

    @ColumnInfo
    private float mMaxOxygenPower;

    @ColumnInfo
    private int mMaxPace;

    @ColumnInfo
    private int mMaxSpeed;

    @ColumnInfo
    private int mMaxSpm;

    @ColumnInfo
    private int mMaxStress;

    @ColumnInfo
    private int mMaxVO2;

    @ColumnInfo
    private int mMetTotal;

    @ColumnInfo
    private int mMinAltitude;

    @ColumnInfo
    private int mMinBpm;

    @ColumnInfo
    private int mMinPace;

    @ColumnInfo
    private int mMinSpeed;

    @ColumnInfo
    private int mMinSpm;

    @ColumnInfo
    private int mMinStress;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mNavigatorActualDistance;

    @ColumnInfo
    private int mNavigatorActualPace;

    @ColumnInfo
    private int mNavigatorActualSpeed;

    @ColumnInfo
    private float mNavigatorActualSpeedV2;

    @ColumnInfo
    private int mNavigatorActualTime;

    @ColumnInfo
    private int mNavigatorDifferenceDistance;

    @ColumnInfo
    private int mNavigatorDifferencePace;

    @ColumnInfo
    private int mNavigatorDifferenceSpeed;

    @ColumnInfo
    private int mNavigatorDifferenceTime;

    @ColumnInfo
    private int mNavigatorStatusDistance;

    @ColumnInfo
    private int mNavigatorStatusPace;

    @ColumnInfo
    private int mNavigatorStatusSpeed;

    @ColumnInfo
    private int mNavigatorStatusTime;

    @ColumnInfo
    private int mNavigatorTargetDistance;

    @ColumnInfo
    private int mNavigatorTargetPace;

    @ColumnInfo
    private int mNavigatorTargetSpeed;

    @ColumnInfo
    private float mNavigatorTargetSpeedV2;

    @ColumnInfo
    private int mNavigatorTargetTime;

    @ColumnInfo
    private int mPace;

    @ColumnInfo
    private int mPacePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mPacePathPoints;

    @ColumnInfo
    private int mPacePathSampleInterval;

    @ColumnInfo
    private int mPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<float[]> mPathPoints;

    @ColumnInfo
    private int mPathSampleInterval;

    @ColumnInfo
    private int mPausedDuration;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mPersonalZone;

    @aa1
    @ColumnInfo
    private String mPlatform;

    @ColumnInfo
    private int mPowerCount;

    @ColumnInfo
    private int mPowerInterval;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mPowerPoints;

    @aa1
    @ColumnInfo
    private String mPrototype;

    @ColumnInfo
    private int mRecoveryHrCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mRecoveryHrPoints;

    @ColumnInfo
    private int mRecoveryTime;

    @ColumnInfo
    private int mRestDuration;

    @ColumnInfo
    private float mRunLactateAvg;

    @ColumnInfo
    private int mRunPowerWatt;

    @ColumnInfo
    private int mSessionCount;

    @ColumnInfo
    private int mSource;

    @ColumnInfo
    private int mSpeed;

    @ColumnInfo
    private int mSpeedPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mSpeedPathPoints;

    @ColumnInfo
    private int mSpeedPathSampleInterval;

    @ColumnInfo
    private int mSpm;

    @ColumnInfo
    private int mSpmPathPointsCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mSpmPathPointsPoints;

    @ColumnInfo
    private int mStaBalance;

    @ColumnInfo
    private int mStamina;

    @ColumnInfo
    private long mStart;

    @ColumnInfo
    private int mStep;

    @ColumnInfo
    private float mStepLen;

    @ColumnInfo
    private int mStepLenCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Float> mStepLenPoints;

    @ColumnInfo
    private int mSwimPoolLength;

    @ColumnInfo
    private int mSwimSwolf;

    @ColumnInfo
    private int mSwimType;

    @ColumnInfo
    private float mTlTrend;

    @ColumnInfo
    private int mTrainingLoad;

    @ColumnInfo
    private int mTrainingStatus;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mTrendWeek;

    @ColumnInfo
    private int mTripCount;

    @ColumnInfo
    private int mType;

    @ColumnInfo
    private int mVerticalOscillation;

    @ColumnInfo
    private float realTimeAerobic;

    @ColumnInfo
    private float realTimeAnaerobic;

    public Workout() {
        int r1 = 0;
        long r2 = 0;
        long r4 = 0;
        String r6 = null;
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
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        String r33 = null;
        String r34 = null;
        String r35 = null;
        String r36 = null;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        int r40 = 0;
        int r41 = 0;
        int r42 = 0;
        float r43 = 0.0f;
        float r44 = 0.0f;
        int r45 = 0;
        float r46 = 0.0f;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        int[] r50 = null;
        int[] r51 = null;
        int r52 = 0;
        int r53 = 0;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int r57 = 0;
        int r58 = 0;
        int r59 = 0;
        List r60 = null;
        int r61 = 0;
        int r62 = 0;
        List r63 = null;
        int r64 = 0;
        int r65 = 0;
        List r66 = null;
        int r67 = 0;
        int r68 = 0;
        List r69 = null;
        int r70 = 0;
        int r71 = 0;
        List r72 = null;
        int r73 = 0;
        int r74 = 0;
        List r75 = null;
        int r76 = 0;
        int r77 = 0;
        int r78 = 0;
        int r79 = 0;
        int r80 = 0;
        int r81 = 0;
        int r82 = 0;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        int r88 = 0;
        int r89 = 0;
        int r90 = 0;
        int r91 = 0;
        int r92 = 0;
        int r93 = 0;
        float r94 = 0.0f;
        int r95 = 0;
        int r96 = 0;
        float r97 = 0.0f;
        int[] r98 = null;
        float[] r99 = null;
        int r100 = 0;
        int r101 = 0;
        int r102 = 0;
        List r103 = null;
        float r104 = 0.0f;
        float r105 = 0.0f;
        float r106 = 0.0f;
        float r107 = 0.0f;
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
        int r118 = 0;
        int r119 = 0;
        float r120 = 0.0f;
        float r121 = 0.0f;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        float r126 = 0.0f;
        float[] r127 = null;
        float[] r128 = null;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        int r133 = 0;
        int r134 = 0;
        int r135 = 0;
        int r136 = 0;
        List r137 = null;
        int r138 = 0;
        List r139 = null;
        int r140 = 0;
        long r141 = 0;
        int r143 = 0;
        int r144 = 0;
        long r145 = 0;
        int r147 = 0;
        int r148 = 0;
        long r149 = 0;
        int r151 = 0;
        int r152 = 0;
        int r153 = 0;
        int r154 = 0;
        int r155 = 0;
        int r156 = 0;
        float r157 = 0.0f;
        float r158 = 0.0f;
        int r159 = 0;
        int r160 = 0;
        List r161 = null;
        int r162 = 0;
        String r163 = null;
        int r164 = 0;
        int r165 = -1;
        int r166 = -1;
        int r167 = -1;
        int r168 = -1;
        this(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r143, r144, r145, r147, r148, r149, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Workout copy$default(Workout r24, int r25, long r26, long r28, String r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, String r57, String r58, String r59, String r60, int r61, int r62, int r63, int r64, int r65, int r66, float r67, float r68, int r69, float r70, int r71, int r72, int r73, int[] r74, int[] r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, int r83, List r84, int r85, int r86, List r87, int r88, int r89, List r90, int r91, int r92, List r93, int r94, int r95, List r96, int r97, int r98, List r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, int r107, int r108, int r109, int r110, int r111, int r112, int r113, int r114, int r115, int r116, int r117, float r118, int r119, int r120, float r121, int[] r122, float[] r123, int r124, int r125, int r126, List r127, float r128, float r129, float r130, float r131, int r132, int r133, int r134, int r135, int r136, int r137, int r138, int r139, int r140, int r141, int r142, int r143, float r144, float r145, int r146, int r147, int r148, int r149, float r150, float[] r151, float[] r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, List r161, int r162, List r163, int r164, long r165, int r167, int r168, long r169, int r171, int r172, long r173, int r175, int r176, int r177, int r178, int r179, int r180, float r181, float r182, int r183, int r184, List r185, int r186, String r187, int r188, int r189, int r190, int r191, int r192, int r193, Object r194) {
        if ((r189 & 1) == 0) goto L5;
        int r6 = r24.mId;
    L7:
        if ((r189 & 2) == 0) goto L9;
        long r7 = r24.mStart;
    L11:
        if ((r189 & 4) == 0) goto L13;
        long r9 = r24.mEnd;
    L15:
        if ((r189 & 8) == 0) goto L17;
        String r11 = r24.mLocalTime;
    L19:
        if ((r189 & 16) == 0) goto L21;
        int r12 = r24.mDuration;
    L23:
        if ((r189 & 32) == 0) goto L25;
        int r13 = r24.mAltitude;
    L27:
        if ((r189 & 64) == 0) goto L29;
        int r14 = r24.mAirPressure;
    L31:
        if ((r189 & 128) == 0) goto L33;
        int r15 = r24.mSpm;
    L34:
        int r27 = r6;
        if ((r189 & 256) == 0) goto L37;
        int r8 = r24.mMode;
    L38:
        int r29 = r8;
        if ((r189 & 512) == 0) goto L41;
        int r10 = r24.mStep;
    L42:
        int r210 = r10;
        if ((r189 & 1024) == 0) goto L45;
        int r16 = r24.mDistance;
    L46:
        int r211 = r16;
        if ((r189 & 2048) == 0) goto L49;
        int r17 = r24.mCalorie;
    L50:
        int r212 = r17;
        if ((r189 & 4096) == 0) goto L53;
        int r18 = r24.mSpeed;
    L54:
        int r310 = r18;
        if ((r189 & 8192) == 0) goto L57;
        int r19 = r24.mPace;
    L58:
        int r311 = r19;
        if ((r189 & 16384) == 0) goto L61;
        int r20 = r24.mAvgBpm;
    L63:
        if ((r189 & 32768) == 0) goto L65;
        int r1 = r24.mMaxBpm;
    L66:
        int r312 = r1;
        if ((r189 & 65536) == 0) goto L69;
        int r2 = r24.mMinBpm;
    L70:
        int r313 = r2;
        if ((r189 & 131072) == 0) goto L73;
        int r3 = r24.mMaxSpm;
    L74:
        int r314 = r3;
        if ((r189 & 262144) == 0) goto L77;
        int r4 = r24.mMinSpm;
    L78:
        int r315 = r4;
        if ((r189 & 524288) == 0) goto L81;
        int r5 = r24.mMaxPace;
    L82:
        int r316 = r5;
        if ((r189 & 1048576) == 0) goto L85;
        int r21 = r24.mMinPace;
    L86:
        int r317 = r21;
        if ((r189 & 2097152) == 0) goto L89;
        int r22 = r24.mMaxAltitude;
    L90:
        int r318 = r22;
        if ((r189 & 4194304) == 0) goto L93;
        int r23 = r24.mMinAltitude;
    L94:
        int r319 = r23;
        if ((r189 & 8388608) == 0) goto L97;
        int r166 = r24.mMinStress;
    L98:
        int r410 = r166;
        if ((r189 & 16777216) == 0) goto L101;
        int r170 = r24.mMaxStress;
    L102:
        int r411 = r170;
        if ((r189 & 33554432) == 0) goto L105;
        int r174 = r24.mAvgStress;
    L106:
        int r412 = r174;
        if ((r189 & 67108864) == 0) goto L109;
        int r195 = r24.mSource;
    L110:
        int r413 = r195;
        if ((r189 & 134217728) == 0) goto L113;
        int r196 = r24.mIsSync;
    L114:
        int r414 = r196;
        if ((r189 & 268435456) == 0) goto L117;
        int r197 = r24.mIsDelete;
    L118:
        int r415 = r197;
        if ((r189 & 536870912) == 0) goto L121;
        int r198 = r24.mFeel;
    L122:
        int r416 = r198;
        if ((r189 & 1073741824) == 0) goto L125;
        String r199 = r24.mPrototype;
    L126:
        String r417 = r199;
        if ((r189 & Integer.MIN_VALUE) == 0) goto L129;
        String r200 = r24.mFirmwareFlag;
    L130:
        String r418 = r200;
        if ((r190 & 1) == 0) goto L133;
        String r201 = r24.mBleName;
    L134:
        String r419 = r201;
        if ((r190 & 2) == 0) goto L137;
        String r202 = r24.mPlatform;
    L138:
        String r510 = r202;
        if ((r190 & 4) == 0) goto L141;
        int r203 = r24.mMaxSpeed;
    L142:
        int r511 = r203;
        if ((r190 & 8) == 0) goto L145;
        int r204 = r24.mMinSpeed;
    L146:
        int r512 = r204;
        if ((r190 & 16) == 0) goto L149;
        int r205 = r24.mRestDuration;
    L150:
        int r513 = r205;
        if ((r190 & 32) == 0) goto L153;
        int r206 = r24.mAGpsType;
    L154:
        int r514 = r206;
        if ((r190 & 64) == 0) goto L157;
        int r207 = r24.mType;
    L158:
        int r515 = r207;
        if ((r190 & 128) == 0) goto L161;
        int r208 = r24.mMetTotal;
    L162:
        int r516 = r208;
        if ((r190 & 256) == 0) goto L165;
        float r209 = r24.mAerobic;
    L166:
        float r517 = r209;
        if ((r190 & 512) == 0) goto L169;
        float r213 = r24.mAnaerobic;
    L170:
        float r518 = r213;
        if ((r190 & 1024) == 0) goto L173;
        int r214 = r24.mStamina;
    L174:
        int r519 = r214;
        if ((r190 & 2048) == 0) goto L177;
        float r215 = r24.mAvgSpeed;
    L178:
        float r610 = r215;
        if ((r190 & 4096) == 0) goto L181;
        int r216 = r24.mCadence;
    L182:
        int r611 = r216;
        if ((r190 & 8192) == 0) goto L185;
        int r217 = r24.mMaxCadence;
    L186:
        int r612 = r217;
        if ((r190 & 16384) == 0) goto L189;
        int r218 = r24.mCnt;
    L190:
        int r613 = r218;
        if ((r190 & 32768) == 0) goto L193;
        int[] r219 = r24.mBpmZoneCount;
    L194:
        int[] r614 = r219;
        if ((r190 & 65536) == 0) goto L197;
        int[] r220 = r24.mPersonalZone;
    L198:
        int[] r615 = r220;
        if ((r190 & 131072) == 0) goto L201;
        int r221 = r24.mLactateThresholdPace;
    L202:
        int r616 = r221;
        if ((r190 & 262144) == 0) goto L205;
        int r222 = r24.mRecoveryTime;
    L206:
        int r617 = r222;
        if ((r190 & 524288) == 0) goto L209;
        int r223 = r24.mTrainingLoad;
    L210:
        int r618 = r223;
        if ((r190 & 1048576) == 0) goto L213;
        int r224 = r24.mMaxVO2;
    L214:
        int r619 = r224;
        if ((r190 & 2097152) == 0) goto L217;
        int r225 = r24.mLactateThresholdHr;
    L218:
        int r710 = r225;
        if ((r190 & 4194304) == 0) goto L221;
        int r226 = r24.mAlgorithmMarking;
    L222:
        int r711 = r226;
        if ((r190 & 8388608) == 0) goto L225;
        int r227 = r24.mPathCount;
    L226:
        int r712 = r227;
        if ((r190 & 16777216) == 0) goto L229;
        int r228 = r24.mPathSampleInterval;
    L230:
        int r713 = r228;
        if ((r190 & 33554432) == 0) goto L233;
        List r229 = r24.mPathPoints;
    L234:
        List r714 = r229;
        if ((r190 & 67108864) == 0) goto L237;
        int r230 = r24.mHrPathCount;
    L238:
        int r715 = r230;
        if ((r190 & 134217728) == 0) goto L241;
        int r231 = r24.mHrPathSampleInterval;
    L242:
        int r716 = r231;
        if ((r190 & 268435456) == 0) goto L245;
        List r232 = r24.mHrPathPoints;
    L246:
        List r717 = r232;
        if ((r190 & 536870912) == 0) goto L249;
        int r233 = r24.mPacePathCount;
    L250:
        int r718 = r233;
        if ((r190 & 1073741824) == 0) goto L253;
        int r234 = r24.mPacePathSampleInterval;
    L255:
        if ((r190 & Integer.MIN_VALUE) == 0) goto L257;
        List r235 = r24.mPacePathPoints;
    L258:
        int r719 = r234;
        if ((r191 & 1) == 0) goto L261;
        int r236 = r24.mSpeedPathCount;
    L262:
        int r810 = r236;
        if ((r191 & 2) == 0) goto L265;
        int r237 = r24.mSpeedPathSampleInterval;
    L266:
        int r811 = r237;
        if ((r191 & 4) == 0) goto L269;
        List r238 = r24.mSpeedPathPoints;
    L270:
        List r812 = r238;
        if ((r191 & 8) == 0) goto L273;
        int r239 = r24.mCadencePathCount;
    L274:
        int r813 = r239;
        if ((r191 & 16) == 0) goto L277;
        int r240 = r24.mCadencePathSampleInterval;
    L278:
        int r814 = r240;
        if ((r191 & 32) == 0) goto L281;
        List r241 = r24.mCadencePathPoints;
    L282:
        List r815 = r241;
        if ((r191 & 64) == 0) goto L285;
        int r242 = r24.mAltitudePathCount;
    L286:
        int r816 = r242;
        if ((r191 & 128) == 0) goto L289;
        int r243 = r24.mAltitudePathSampleInterval;
    L290:
        int r817 = r243;
        if ((r191 & 256) == 0) goto L293;
        List r244 = r24.mAltitudePathPoints;
    L294:
        List r818 = r244;
        if ((r191 & 512) == 0) goto L297;
        int r245 = r24.mGoalDistance;
    L298:
        int r819 = r245;
        if ((r191 & 1024) == 0) goto L301;
        int r246 = r24.mGoalTime;
    L302:
        int r910 = r246;
        if ((r191 & 2048) == 0) goto L305;
        int r247 = r24.mGoalCalorie;
    L306:
        int r911 = r247;
        if ((r191 & 4096) == 0) goto L309;
        int r248 = r24.mPausedDuration;
    L310:
        int r912 = r248;
        if ((r191 & 8192) == 0) goto L313;
        int r249 = r24.mCurBpm;
    L314:
        int r913 = r249;
        if ((r191 & 16384) == 0) goto L317;
        int r250 = r24.mAscendAltitude;
    L318:
        int r914 = r250;
        if ((r191 & 32768) == 0) goto L321;
        int r251 = r24.mDescendAltitude;
    L322:
        int r915 = r251;
        if ((r191 & 65536) == 0) goto L325;
        int r252 = r24.mCurStress;
    L326:
        int r916 = r252;
        if ((r191 & 131072) == 0) goto L329;
        int r253 = r24.mSwimType;
    L330:
        int r917 = r253;
        if ((r191 & 262144) == 0) goto L333;
        int r254 = r24.mCntFore;
    L334:
        int r918 = r254;
        if ((r191 & 524288) == 0) goto L337;
        int r255 = r24.mCntBack;
    L338:
        int r919 = r255;
        if ((r191 & 1048576) == 0) goto L341;
        int r256 = r24.mBackSwingTime;
    L342:
        int r1010 = r256;
        if ((r191 & 2097152) == 0) goto L345;
        int r257 = r24.mDownSwingTime;
    L346:
        int r1011 = r257;
        if ((r191 & 4194304) == 0) goto L349;
        int r258 = r24.mDribbleTime;
    L350:
        int r1012 = r258;
        if ((r191 & 8388608) == 0) goto L353;
        int r259 = r24.mTripCount;
    L354:
        int r1013 = r259;
        if ((r191 & 16777216) == 0) goto L357;
        int r260 = r24.mSessionCount;
    L358:
        int r1014 = r260;
        if ((r191 & 33554432) == 0) goto L361;
        int r261 = r24.mVerticalOscillation;
    L362:
        int r1015 = r261;
        if ((r191 & 67108864) == 0) goto L365;
        int r262 = r24.mRunPowerWatt;
    L366:
        int r1016 = r262;
        if ((r191 & 134217728) == 0) goto L369;
        float r263 = r24.mStepLen;
    L370:
        float r1017 = r263;
        if ((r191 & 268435456) == 0) goto L373;
        int r264 = r24.mTrainingStatus;
    L374:
        int r1018 = r264;
        if ((r191 & 536870912) == 0) goto L377;
        int r265 = r24.mFitnessAge;
    L378:
        int r1019 = r265;
        if ((r191 & 1073741824) == 0) goto L381;
        float r266 = r24.mTlTrend;
    L383:
        if ((r191 & Integer.MIN_VALUE) == 0) goto L385;
        int[] r267 = r24.mBestRunTime;
    L386:
        float r1110 = r266;
        if ((r192 & 1) == 0) goto L389;
        float[] r268 = r24.mFitnessLevel;
    L390:
        float[] r1111 = r268;
        if ((r192 & 2) == 0) goto L393;
        int r269 = r24.mCalorieTotal;
    L394:
        int r1112 = r269;
        if ((r192 & 4) == 0) goto L397;
        int r270 = r24.mPowerCount;
    L398:
        int r1113 = r270;
        if ((r192 & 8) == 0) goto L401;
        int r271 = r24.mPowerInterval;
    L402:
        int r1114 = r271;
        if ((r192 & 16) == 0) goto L405;
        List r272 = r24.mPowerPoints;
    L406:
        List r1115 = r272;
        if ((r192 & 32) == 0) goto L409;
        float r273 = r24.realTimeAerobic;
    L410:
        float r1116 = r273;
        if ((r192 & 64) == 0) goto L413;
        float r274 = r24.realTimeAnaerobic;
    L414:
        float r1117 = r274;
        if ((r192 & 128) == 0) goto L417;
        float r275 = r24.mFatTotal;
    L418:
        float r1118 = r275;
        if ((r192 & 256) == 0) goto L421;
        float r276 = r24.mCarboTotal;
    L422:
        float r1119 = r276;
        if ((r192 & 512) == 0) goto L425;
        int r277 = r24.mNavigatorTargetTime;
    L426:
        int r1210 = r277;
        if ((r192 & 1024) == 0) goto L429;
        int r278 = r24.mNavigatorActualTime;
    L430:
        int r1211 = r278;
        if ((r192 & 2048) == 0) goto L433;
        int r279 = r24.mNavigatorDifferenceTime;
    L434:
        int r1212 = r279;
        if ((r192 & 4096) == 0) goto L437;
        int r280 = r24.mNavigatorStatusTime;
    L438:
        int r1213 = r280;
        if ((r192 & 8192) == 0) goto L441;
        int r281 = r24.mNavigatorTargetDistance;
    L442:
        int r1214 = r281;
        if ((r192 & 16384) == 0) goto L445;
        int r282 = r24.mNavigatorActualDistance;
    L446:
        int r1215 = r282;
        if ((r192 & 32768) == 0) goto L449;
        int r283 = r24.mNavigatorDifferenceDistance;
    L450:
        int r1216 = r283;
        if ((r192 & 65536) == 0) goto L453;
        int r284 = r24.mNavigatorStatusDistance;
    L454:
        int r1217 = r284;
        if ((r192 & 131072) == 0) goto L457;
        int r285 = r24.mNavigatorTargetPace;
    L458:
        int r1218 = r285;
        if ((r192 & 262144) == 0) goto L461;
        int r286 = r24.mNavigatorActualPace;
    L462:
        int r1219 = r286;
        if ((r192 & 524288) == 0) goto L465;
        int r287 = r24.mNavigatorDifferencePace;
    L466:
        int r1310 = r287;
        if ((r192 & 1048576) == 0) goto L469;
        int r288 = r24.mNavigatorStatusPace;
    L470:
        int r1311 = r288;
        if ((r192 & 2097152) == 0) goto L473;
        float r289 = r24.mNavigatorTargetSpeedV2;
    L474:
        float r1312 = r289;
        if ((r192 & 4194304) == 0) goto L477;
        float r290 = r24.mNavigatorActualSpeedV2;
    L478:
        float r1313 = r290;
        if ((r192 & 8388608) == 0) goto L481;
        int r291 = r24.mNavigatorTargetSpeed;
    L482:
        int r1314 = r291;
        if ((r192 & 16777216) == 0) goto L485;
        int r292 = r24.mNavigatorActualSpeed;
    L486:
        int r1315 = r292;
        if ((r192 & 33554432) == 0) goto L489;
        int r293 = r24.mNavigatorDifferenceSpeed;
    L490:
        int r1316 = r293;
        if ((r192 & 67108864) == 0) goto L493;
        int r294 = r24.mNavigatorStatusSpeed;
    L494:
        int r1317 = r294;
        if ((r192 & 134217728) == 0) goto L497;
        float r295 = r24.mMaxOxygenPower;
    L498:
        float r1318 = r295;
        if ((r192 & 268435456) == 0) goto L501;
        float[] r296 = r24.mTrendWeek;
    L502:
        float[] r1319 = r296;
        if ((r192 & 536870912) == 0) goto L505;
        float[] r297 = r24.mCyclingIndex;
    L506:
        float[] r1410 = r297;
        if ((r192 & 1073741824) == 0) goto L509;
        int r298 = r24.mStaBalance;
    L511:
        if ((r192 & Integer.MIN_VALUE) == 0) goto L513;
        int r299 = r24.mSwimSwolf;
    L514:
        int r1411 = r298;
        if ((r193 & 1) == 0) goto L517;
        int r300 = r24.mCntLap;
    L518:
        int r1412 = r300;
        if ((r193 & 2) == 0) goto L521;
        int r301 = r24.mFrontCrawlPerc;
    L522:
        int r1413 = r301;
        if ((r193 & 4) == 0) goto L525;
        int r302 = r24.mBreaststrokePerc;
    L526:
        int r1414 = r302;
        if ((r193 & 8) == 0) goto L529;
        int r303 = r24.mBackstrokePerc;
    L530:
        int r1415 = r303;
        if ((r193 & 16) == 0) goto L533;
        int r304 = r24.mButterflyPerc;
    L534:
        int r1416 = r304;
        if ((r193 & 32) == 0) goto L537;
        int r305 = r24.mSpmPathPointsCount;
    L538:
        int r1417 = r305;
        if ((r193 & 64) == 0) goto L541;
        List r306 = r24.mSpmPathPointsPoints;
    L542:
        List r1418 = r306;
        if ((r193 & 128) == 0) goto L545;
        int r307 = r24.mStepLenCount;
    L546:
        int r1419 = r307;
        if ((r193 & 256) == 0) goto L549;
        List r308 = r24.mStepLenPoints;
    L550:
        List r1510 = r308;
        if ((r193 & 512) == 0) goto L553;
        int r309 = r24.mEllipticalSteps;
    L554:
        int r1511 = r309;
        List r1810 = r235;
        if ((r193 & 1024) == 0) goto L557;
        long r320 = r24.mChildSwimStartTime;
    L558:
        long r1512 = r320;
        if ((r193 & 2048) == 0) goto L561;
        int r321 = r24.mChildSwimDuration;
    L563:
        if ((r193 & 4096) == 0) goto L565;
        int r322 = r24.mChildSwimDistance;
    L566:
        int r1513 = r321;
        int r1514 = r322;
        if ((r193 & 8192) == 0) goto L569;
        long r323 = r24.mChildCyclingStartTime;
    L570:
        long r1515 = r323;
        if ((r193 & 16384) == 0) goto L573;
        int r324 = r24.mChildCyclingDuration;
    L575:
        if ((r193 & 32768) == 0) goto L577;
        int r325 = r24.mChildCyclingDistance;
    L578:
        int r1516 = r324;
        int r1517 = r325;
        if ((r193 & 65536) == 0) goto L581;
        long r326 = r24.mChildRunStartTime;
    L582:
        long r1610 = r326;
        if ((r193 & 131072) == 0) goto L585;
        int r327 = r24.mChildRunDuration;
    L587:
        if ((r193 & 262144) == 0) goto L589;
        int r328 = r24.mChildRunDistance;
    L590:
        int r1611 = r327;
        if ((r193 & 524288) == 0) goto L593;
        int r329 = r24.mChildSwimMode;
    L594:
        int r1612 = r329;
        if ((r193 & 1048576) == 0) goto L597;
        int r330 = r24.mChildCyclingMode;
    L598:
        int r1613 = r330;
        if ((r193 & 2097152) == 0) goto L601;
        int r331 = r24.mChildRunMode;
    L602:
        int r1614 = r331;
        if ((r193 & 4194304) == 0) goto L605;
        int r332 = r24.mChildNumber;
    L606:
        int r1615 = r332;
        if ((r193 & 8388608) == 0) goto L609;
        float r333 = r24.mRunLactateAvg;
    L610:
        float r1616 = r333;
        if ((r193 & 16777216) == 0) goto L613;
        float r334 = r24.mCyclingLactateAvg;
    L614:
        float r1617 = r334;
        if ((r193 & 33554432) == 0) goto L617;
        int r335 = r24.mFlag;
    L618:
        int r1618 = r335;
        if ((r193 & 67108864) == 0) goto L621;
        int r336 = r24.mRecoveryHrCount;
    L622:
        int r1710 = r336;
        if ((r193 & 134217728) == 0) goto L625;
        List r337 = r24.mRecoveryHrPoints;
    L626:
        List r1711 = r337;
        if ((r193 & 268435456) == 0) goto L629;
        int r338 = r24.mSwimPoolLength;
    L630:
        int r1712 = r338;
        if ((r193 & 536870912) == 0) goto L633;
        String r339 = r24.mDeviceId;
    L635:
        if ((r193 & 1073741824) == 0) goto L638;
        int r1811 = r24.mAICoachSportID;
    L640:
        return r24.copy(r27, r7, r9, r11, r12, r13, r14, r15, r29, r210, r211, r212, r310, r311, r20, r312, r313, r314, r315, r316, r317, r318, r319, r410, r411, r412, r413, r414, r415, r416, r417, r418, r419, r510, r511, r512, r513, r514, r515, r516, r517, r518, r519, r610, r611, r612, r613, r614, r615, r616, r617, r618, r619, r710, r711, r712, r713, r714, r715, r716, r717, r718, r719, r1810, r810, r811, r812, r813, r814, r815, r816, r817, r818, r819, r910, r911, r912, r913, r914, r915, r916, r917, r918, r919, r1010, r1011, r1012, r1013, r1014, r1015, r1016, r1017, r1018, r1019, r1110, r267, r1111, r1112, r1113, r1114, r1115, r1116, r1117, r1118, r1119, r1210, r1211, r1212, r1213, r1214, r1215, r1216, r1217, r1218, r1219, r1310, r1311, r1312, r1313, r1314, r1315, r1316, r1317, r1318, r1319, r1410, r1411, r299, r1412, r1413, r1414, r1415, r1416, r1417, r1418, r1419, r1510, r1511, r1512, r1513, r1514, r1515, r1516, r1517, r1610, r1611, r328, r1612, r1613, r1614, r1615, r1616, r1617, r1618, r1710, r1711, r1712, r339, r1811);
    L638:
        r1811 = r188;
        goto L640
    L633:
        r339 = r187;
        goto L635
    L629:
        r338 = r186;
        goto L630
    L625:
        r337 = r185;
        goto L626
    L621:
        r336 = r184;
        goto L622
    L617:
        r335 = r183;
        goto L618
    L613:
        r334 = r182;
        goto L614
    L609:
        r333 = r181;
        goto L610
    L605:
        r332 = r180;
        goto L606
    L601:
        r331 = r179;
        goto L602
    L597:
        r330 = r178;
        goto L598
    L593:
        r329 = r177;
        goto L594
    L589:
        r328 = r176;
        goto L590
    L585:
        r327 = r175;
        goto L587
    L581:
        r326 = r173;
        goto L582
    L577:
        r325 = r172;
        goto L578
    L573:
        r324 = r171;
        goto L575
    L569:
        r323 = r169;
        goto L570
    L565:
        r322 = r168;
        goto L566
    L561:
        r321 = r167;
        goto L563
    L557:
        r320 = r165;
        goto L558
    L553:
        r309 = r164;
        goto L554
    L549:
        r308 = r163;
        goto L550
    L545:
        r307 = r162;
        goto L546
    L541:
        r306 = r161;
        goto L542
    L537:
        r305 = r160;
        goto L538
    L533:
        r304 = r159;
        goto L534
    L529:
        r303 = r158;
        goto L530
    L525:
        r302 = r157;
        goto L526
    L521:
        r301 = r156;
        goto L522
    L517:
        r300 = r155;
        goto L518
    L513:
        r299 = r154;
        goto L514
    L509:
        r298 = r153;
        goto L511
    L505:
        r297 = r152;
        goto L506
    L501:
        r296 = r151;
        goto L502
    L497:
        r295 = r150;
        goto L498
    L493:
        r294 = r149;
        goto L494
    L489:
        r293 = r148;
        goto L490
    L485:
        r292 = r147;
        goto L486
    L481:
        r291 = r146;
        goto L482
    L477:
        r290 = r145;
        goto L478
    L473:
        r289 = r144;
        goto L474
    L469:
        r288 = r143;
        goto L470
    L465:
        r287 = r142;
        goto L466
    L461:
        r286 = r141;
        goto L462
    L457:
        r285 = r140;
        goto L458
    L453:
        r284 = r139;
        goto L454
    L449:
        r283 = r138;
        goto L450
    L445:
        r282 = r137;
        goto L446
    L441:
        r281 = r136;
        goto L442
    L437:
        r280 = r135;
        goto L438
    L433:
        r279 = r134;
        goto L434
    L429:
        r278 = r133;
        goto L430
    L425:
        r277 = r132;
        goto L426
    L421:
        r276 = r131;
        goto L422
    L417:
        r275 = r130;
        goto L418
    L413:
        r274 = r129;
        goto L414
    L409:
        r273 = r128;
        goto L410
    L405:
        r272 = r127;
        goto L406
    L401:
        r271 = r126;
        goto L402
    L397:
        r270 = r125;
        goto L398
    L393:
        r269 = r124;
        goto L394
    L389:
        r268 = r123;
        goto L390
    L385:
        r267 = r122;
        goto L386
    L381:
        r266 = r121;
        goto L383
    L377:
        r265 = r120;
        goto L378
    L373:
        r264 = r119;
        goto L374
    L369:
        r263 = r118;
        goto L370
    L365:
        r262 = r117;
        goto L366
    L361:
        r261 = r116;
        goto L362
    L357:
        r260 = r115;
        goto L358
    L353:
        r259 = r114;
        goto L354
    L349:
        r258 = r113;
        goto L350
    L345:
        r257 = r112;
        goto L346
    L341:
        r256 = r111;
        goto L342
    L337:
        r255 = r110;
        goto L338
    L333:
        r254 = r109;
        goto L334
    L329:
        r253 = r108;
        goto L330
    L325:
        r252 = r107;
        goto L326
    L321:
        r251 = r106;
        goto L322
    L317:
        r250 = r105;
        goto L318
    L313:
        r249 = r104;
        goto L314
    L309:
        r248 = r103;
        goto L310
    L305:
        r247 = r102;
        goto L306
    L301:
        r246 = r101;
        goto L302
    L297:
        r245 = r100;
        goto L298
    L293:
        r244 = r99;
        goto L294
    L289:
        r243 = r98;
        goto L290
    L285:
        r242 = r97;
        goto L286
    L281:
        r241 = r96;
        goto L282
    L277:
        r240 = r95;
        goto L278
    L273:
        r239 = r94;
        goto L274
    L269:
        r238 = r93;
        goto L270
    L265:
        r237 = r92;
        goto L266
    L261:
        r236 = r91;
        goto L262
    L257:
        r235 = r90;
        goto L258
    L253:
        r234 = r89;
        goto L255
    L249:
        r233 = r88;
        goto L250
    L245:
        r232 = r87;
        goto L246
    L241:
        r231 = r86;
        goto L242
    L237:
        r230 = r85;
        goto L238
    L233:
        r229 = r84;
        goto L234
    L229:
        r228 = r83;
        goto L230
    L225:
        r227 = r82;
        goto L226
    L221:
        r226 = r81;
        goto L222
    L217:
        r225 = r80;
        goto L218
    L213:
        r224 = r79;
        goto L214
    L209:
        r223 = r78;
        goto L210
    L205:
        r222 = r77;
        goto L206
    L201:
        r221 = r76;
        goto L202
    L197:
        r220 = r75;
        goto L198
    L193:
        r219 = r74;
        goto L194
    L189:
        r218 = r73;
        goto L190
    L185:
        r217 = r72;
        goto L186
    L181:
        r216 = r71;
        goto L182
    L177:
        r215 = r70;
        goto L178
    L173:
        r214 = r69;
        goto L174
    L169:
        r213 = r68;
        goto L170
    L165:
        r209 = r67;
        goto L166
    L161:
        r208 = r66;
        goto L162
    L157:
        r207 = r65;
        goto L158
    L153:
        r206 = r64;
        goto L154
    L149:
        r205 = r63;
        goto L150
    L145:
        r204 = r62;
        goto L146
    L141:
        r203 = r61;
        goto L142
    L137:
        r202 = r60;
        goto L138
    L133:
        r201 = r59;
        goto L134
    L129:
        r200 = r58;
        goto L130
    L125:
        r199 = r57;
        goto L126
    L121:
        r198 = r56;
        goto L122
    L117:
        r197 = r55;
        goto L118
    L113:
        r196 = r54;
        goto L114
    L109:
        r195 = r53;
        goto L110
    L105:
        r174 = r52;
        goto L106
    L101:
        r170 = r51;
        goto L102
    L97:
        r166 = r50;
        goto L98
    L93:
        r23 = r49;
        goto L94
    L89:
        r22 = r48;
        goto L90
    L85:
        r21 = r47;
        goto L86
    L81:
        r5 = r46;
        goto L82
    L77:
        r4 = r45;
        goto L78
    L73:
        r3 = r44;
        goto L74
    L69:
        r2 = r43;
        goto L70
    L65:
        r1 = r42;
        goto L66
    L61:
        r20 = r41;
        goto L63
    L57:
        r19 = r40;
        goto L58
    L53:
        r18 = r39;
        goto L54
    L49:
        r17 = r38;
        goto L50
    L45:
        r16 = r37;
        goto L46
    L41:
        r10 = r36;
        goto L42
    L37:
        r8 = r35;
        goto L38
    L33:
        r15 = r34;
        goto L34
    L29:
        r14 = r33;
        goto L31
    L25:
        r13 = r32;
        goto L27
    L21:
        r12 = r31;
        goto L23
    L17:
        r11 = r30;
        goto L19
    L13:
        r9 = r28;
        goto L15
    L9:
        r7 = r26;
        goto L11
    L5:
        r6 = r25;
        goto L7
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mStep;
    }

    public final int component100() {
        return this.mPowerInterval;
    }

    @tb1
    public final List<Integer> component101() {
        return this.mPowerPoints;
    }

    public final float component102() {
        return this.realTimeAerobic;
    }

    public final float component103() {
        return this.realTimeAnaerobic;
    }

    public final float component104() {
        return this.mFatTotal;
    }

    public final float component105() {
        return this.mCarboTotal;
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
        return this.mDistance;
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
        return this.mNavigatorTargetSpeedV2;
    }

    public final float component119() {
        return this.mNavigatorActualSpeedV2;
    }

    public final int component12() {
        return this.mCalorie;
    }

    public final int component120() {
        return this.mNavigatorTargetSpeed;
    }

    public final int component121() {
        return this.mNavigatorActualSpeed;
    }

    public final int component122() {
        return this.mNavigatorDifferenceSpeed;
    }

    public final int component123() {
        return this.mNavigatorStatusSpeed;
    }

    public final float component124() {
        return this.mMaxOxygenPower;
    }

    @tb1
    public final float[] component125() {
        return this.mTrendWeek;
    }

    @tb1
    public final float[] component126() {
        return this.mCyclingIndex;
    }

    public final int component127() {
        return this.mStaBalance;
    }

    public final int component128() {
        return this.mSwimSwolf;
    }

    public final int component129() {
        return this.mCntLap;
    }

    public final int component13() {
        return this.mSpeed;
    }

    public final int component130() {
        return this.mFrontCrawlPerc;
    }

    public final int component131() {
        return this.mBreaststrokePerc;
    }

    public final int component132() {
        return this.mBackstrokePerc;
    }

    public final int component133() {
        return this.mButterflyPerc;
    }

    public final int component134() {
        return this.mSpmPathPointsCount;
    }

    @tb1
    public final List<Integer> component135() {
        return this.mSpmPathPointsPoints;
    }

    public final int component136() {
        return this.mStepLenCount;
    }

    @tb1
    public final List<Float> component137() {
        return this.mStepLenPoints;
    }

    public final int component138() {
        return this.mEllipticalSteps;
    }

    public final long component139() {
        return this.mChildSwimStartTime;
    }

    public final int component14() {
        return this.mPace;
    }

    public final int component140() {
        return this.mChildSwimDuration;
    }

    public final int component141() {
        return this.mChildSwimDistance;
    }

    public final long component142() {
        return this.mChildCyclingStartTime;
    }

    public final int component143() {
        return this.mChildCyclingDuration;
    }

    public final int component144() {
        return this.mChildCyclingDistance;
    }

    public final long component145() {
        return this.mChildRunStartTime;
    }

    public final int component146() {
        return this.mChildRunDuration;
    }

    public final int component147() {
        return this.mChildRunDistance;
    }

    public final int component148() {
        return this.mChildSwimMode;
    }

    public final int component149() {
        return this.mChildCyclingMode;
    }

    public final int component15() {
        return this.mAvgBpm;
    }

    public final int component150() {
        return this.mChildRunMode;
    }

    public final int component151() {
        return this.mChildNumber;
    }

    public final float component152() {
        return this.mRunLactateAvg;
    }

    public final float component153() {
        return this.mCyclingLactateAvg;
    }

    public final int component154() {
        return this.mFlag;
    }

    public final int component155() {
        return this.mRecoveryHrCount;
    }

    @tb1
    public final List<Integer> component156() {
        return this.mRecoveryHrPoints;
    }

    public final int component157() {
        return this.mSwimPoolLength;
    }

    @tb1
    public final String component158() {
        return this.mDeviceId;
    }

    public final int component159() {
        return this.mAICoachSportID;
    }

    public final int component16() {
        return this.mMaxBpm;
    }

    public final int component17() {
        return this.mMinBpm;
    }

    public final int component18() {
        return this.mMaxSpm;
    }

    public final int component19() {
        return this.mMinSpm;
    }

    public final long component2() {
        return this.mStart;
    }

    public final int component20() {
        return this.mMaxPace;
    }

    public final int component21() {
        return this.mMinPace;
    }

    public final int component22() {
        return this.mMaxAltitude;
    }

    public final int component23() {
        return this.mMinAltitude;
    }

    public final int component24() {
        return this.mMinStress;
    }

    public final int component25() {
        return this.mMaxStress;
    }

    public final int component26() {
        return this.mAvgStress;
    }

    public final int component27() {
        return this.mSource;
    }

    public final int component28() {
        return this.mIsSync;
    }

    public final int component29() {
        return this.mIsDelete;
    }

    public final long component3() {
        return this.mEnd;
    }

    public final int component30() {
        return this.mFeel;
    }

    @aa1
    public final String component31() {
        return this.mPrototype;
    }

    @aa1
    public final String component32() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String component33() {
        return this.mBleName;
    }

    @aa1
    public final String component34() {
        return this.mPlatform;
    }

    public final int component35() {
        return this.mMaxSpeed;
    }

    public final int component36() {
        return this.mMinSpeed;
    }

    public final int component37() {
        return this.mRestDuration;
    }

    public final int component38() {
        return this.mAGpsType;
    }

    public final int component39() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mLocalTime;
    }

    public final int component40() {
        return this.mMetTotal;
    }

    public final float component41() {
        return this.mAerobic;
    }

    public final float component42() {
        return this.mAnaerobic;
    }

    public final int component43() {
        return this.mStamina;
    }

    public final float component44() {
        return this.mAvgSpeed;
    }

    public final int component45() {
        return this.mCadence;
    }

    public final int component46() {
        return this.mMaxCadence;
    }

    public final int component47() {
        return this.mCnt;
    }

    @tb1
    public final int[] component48() {
        return this.mBpmZoneCount;
    }

    @tb1
    public final int[] component49() {
        return this.mPersonalZone;
    }

    public final int component5() {
        return this.mDuration;
    }

    public final int component50() {
        return this.mLactateThresholdPace;
    }

    public final int component51() {
        return this.mRecoveryTime;
    }

    public final int component52() {
        return this.mTrainingLoad;
    }

    public final int component53() {
        return this.mMaxVO2;
    }

    public final int component54() {
        return this.mLactateThresholdHr;
    }

    public final int component55() {
        return this.mAlgorithmMarking;
    }

    public final int component56() {
        return this.mPathCount;
    }

    public final int component57() {
        return this.mPathSampleInterval;
    }

    @tb1
    public final List<float[]> component58() {
        return this.mPathPoints;
    }

    public final int component59() {
        return this.mHrPathCount;
    }

    public final int component6() {
        return this.mAltitude;
    }

    public final int component60() {
        return this.mHrPathSampleInterval;
    }

    @tb1
    public final List<Integer> component61() {
        return this.mHrPathPoints;
    }

    public final int component62() {
        return this.mPacePathCount;
    }

    public final int component63() {
        return this.mPacePathSampleInterval;
    }

    @tb1
    public final List<Integer> component64() {
        return this.mPacePathPoints;
    }

    public final int component65() {
        return this.mSpeedPathCount;
    }

    public final int component66() {
        return this.mSpeedPathSampleInterval;
    }

    @tb1
    public final List<Integer> component67() {
        return this.mSpeedPathPoints;
    }

    public final int component68() {
        return this.mCadencePathCount;
    }

    public final int component69() {
        return this.mCadencePathSampleInterval;
    }

    public final int component7() {
        return this.mAirPressure;
    }

    @tb1
    public final List<Integer> component70() {
        return this.mCadencePathPoints;
    }

    public final int component71() {
        return this.mAltitudePathCount;
    }

    public final int component72() {
        return this.mAltitudePathSampleInterval;
    }

    @tb1
    public final List<Integer> component73() {
        return this.mAltitudePathPoints;
    }

    public final int component74() {
        return this.mGoalDistance;
    }

    public final int component75() {
        return this.mGoalTime;
    }

    public final int component76() {
        return this.mGoalCalorie;
    }

    public final int component77() {
        return this.mPausedDuration;
    }

    public final int component78() {
        return this.mCurBpm;
    }

    public final int component79() {
        return this.mAscendAltitude;
    }

    public final int component8() {
        return this.mSpm;
    }

    public final int component80() {
        return this.mDescendAltitude;
    }

    public final int component81() {
        return this.mCurStress;
    }

    public final int component82() {
        return this.mSwimType;
    }

    public final int component83() {
        return this.mCntFore;
    }

    public final int component84() {
        return this.mCntBack;
    }

    public final int component85() {
        return this.mBackSwingTime;
    }

    public final int component86() {
        return this.mDownSwingTime;
    }

    public final int component87() {
        return this.mDribbleTime;
    }

    public final int component88() {
        return this.mTripCount;
    }

    public final int component89() {
        return this.mSessionCount;
    }

    public final int component9() {
        return this.mMode;
    }

    public final int component90() {
        return this.mVerticalOscillation;
    }

    public final int component91() {
        return this.mRunPowerWatt;
    }

    public final float component92() {
        return this.mStepLen;
    }

    public final int component93() {
        return this.mTrainingStatus;
    }

    public final int component94() {
        return this.mFitnessAge;
    }

    public final float component95() {
        return this.mTlTrend;
    }

    @tb1
    public final int[] component96() {
        return this.mBestRunTime;
    }

    @tb1
    public final float[] component97() {
        return this.mFitnessLevel;
    }

    public final int component98() {
        return this.mCalorieTotal;
    }

    public final int component99() {
        return this.mPowerCount;
    }

    @aa1
    public final Workout copy(int r167, long r168, long r170, @aa1 String r172, int r173, int r174, int r175, int r176, int r177, int r178, int r179, int r180, int r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, int r189, int r190, int r191, int r192, int r193, int r194, int r195, int r196, int r197, int r198, @aa1 String r199, @aa1 String r200, @aa1 String r201, @aa1 String r202, int r203, int r204, int r205, int r206, int r207, int r208, float r209, float r210, int r211, float r212, int r213, int r214, int r215, @tb1 int[] r216, @tb1 int[] r217, int r218, int r219, int r220, int r221, int r222, int r223, int r224, int r225, @tb1 List<float[]> r226, int r227, int r228, @tb1 List<Integer> r229, int r230, int r231, @tb1 List<Integer> r232, int r233, int r234, @tb1 List<Integer> r235, int r236, int r237, @tb1 List<Integer> r238, int r239, int r240, @tb1 List<Integer> r241, int r242, int r243, int r244, int r245, int r246, int r247, int r248, int r249, int r250, int r251, int r252, int r253, int r254, int r255, int r256, int r257, int r258, int r259, float r260, int r261, int r262, float r263, @tb1 int[] r264, @tb1 float[] r265, int r266, int r267, int r268, @tb1 List<Integer> r269, float r270, float r271, float r272, float r273, int r274, int r275, int r276, int r277, int r278, int r279, int r280, int r281, int r282, int r283, int r284, int r285, float r286, float r287, int r288, int r289, int r290, int r291, float r292, @tb1 float[] r293, @tb1 float[] r294, int r295, int r296, int r297, int r298, int r299, int r300, int r301, int r302, @tb1 List<Integer> r303, int r304, @tb1 List<Float> r305, int r306, long r307, int r309, int r310, long r311, int r313, int r314, long r315, int r317, int r318, int r319, int r320, int r321, int r322, float r323, float r324, int r325, int r326, @tb1 List<Integer> r327, int r328, @tb1 String r329, int r330) {
        Intrinsics.X0O(r172, "mLocalTime");
        Intrinsics.X0O(r199, "mPrototype");
        Intrinsics.X0O(r200, "mFirmwareFlag");
        Intrinsics.X0O(r201, "mBleName");
        Intrinsics.X0O(r202, "mPlatform");
        return new Workout(r167, r168, r170, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r261, r262, r263, r264, r265, r266, r267, r268, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r293, r294, r295, r296, r297, r298, r299, r300, r301, r302, r303, r304, r305, r306, r307, r309, r310, r311, r313, r314, r315, r317, r318, r319, r320, r321, r322, r323, r324, r325, r326, r327, r328, r329, r330);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Workout) == true) goto L8;
        return false;
    L8:
        Workout r9 = (Workout) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mStart == r9.mStart) goto L15;
        return false;
    L15:
        if (this.mEnd == r9.mEnd) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L21;
        return false;
    L21:
        if (this.mDuration == r9.mDuration) goto L24;
        return false;
    L24:
        if (this.mAltitude == r9.mAltitude) goto L27;
        return false;
    L27:
        if (this.mAirPressure == r9.mAirPressure) goto L30;
        return false;
    L30:
        if (this.mSpm == r9.mSpm) goto L33;
        return false;
    L33:
        if (this.mMode == r9.mMode) goto L36;
        return false;
    L36:
        if (this.mStep == r9.mStep) goto L39;
        return false;
    L39:
        if (this.mDistance == r9.mDistance) goto L42;
        return false;
    L42:
        if (this.mCalorie == r9.mCalorie) goto L45;
        return false;
    L45:
        if (this.mSpeed == r9.mSpeed) goto L48;
        return false;
    L48:
        if (this.mPace == r9.mPace) goto L51;
        return false;
    L51:
        if (this.mAvgBpm == r9.mAvgBpm) goto L54;
        return false;
    L54:
        if (this.mMaxBpm == r9.mMaxBpm) goto L57;
        return false;
    L57:
        if (this.mMinBpm == r9.mMinBpm) goto L60;
        return false;
    L60:
        if (this.mMaxSpm == r9.mMaxSpm) goto L63;
        return false;
    L63:
        if (this.mMinSpm == r9.mMinSpm) goto L66;
        return false;
    L66:
        if (this.mMaxPace == r9.mMaxPace) goto L69;
        return false;
    L69:
        if (this.mMinPace == r9.mMinPace) goto L72;
        return false;
    L72:
        if (this.mMaxAltitude == r9.mMaxAltitude) goto L75;
        return false;
    L75:
        if (this.mMinAltitude == r9.mMinAltitude) goto L78;
        return false;
    L78:
        if (this.mMinStress == r9.mMinStress) goto L81;
        return false;
    L81:
        if (this.mMaxStress == r9.mMaxStress) goto L84;
        return false;
    L84:
        if (this.mAvgStress == r9.mAvgStress) goto L87;
        return false;
    L87:
        if (this.mSource == r9.mSource) goto L90;
        return false;
    L90:
        if (this.mIsSync == r9.mIsSync) goto L93;
        return false;
    L93:
        if (this.mIsDelete == r9.mIsDelete) goto L96;
        return false;
    L96:
        if (this.mFeel == r9.mFeel) goto L99;
        return false;
    L99:
        if (Intrinsics.XOO0ii0(this.mPrototype, r9.mPrototype) == true) goto L102;
        return false;
    L102:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r9.mFirmwareFlag) == true) goto L105;
        return false;
    L105:
        if (Intrinsics.XOO0ii0(this.mBleName, r9.mBleName) == true) goto L108;
        return false;
    L108:
        if (Intrinsics.XOO0ii0(this.mPlatform, r9.mPlatform) == true) goto L111;
        return false;
    L111:
        if (this.mMaxSpeed == r9.mMaxSpeed) goto L114;
        return false;
    L114:
        if (this.mMinSpeed == r9.mMinSpeed) goto L117;
        return false;
    L117:
        if (this.mRestDuration == r9.mRestDuration) goto L120;
        return false;
    L120:
        if (this.mAGpsType == r9.mAGpsType) goto L123;
        return false;
    L123:
        if (this.mType == r9.mType) goto L126;
        return false;
    L126:
        if (this.mMetTotal == r9.mMetTotal) goto L129;
        return false;
    L129:
        if (Float.compare(this.mAerobic, r9.mAerobic) == 0) goto L132;
        return false;
    L132:
        if (Float.compare(this.mAnaerobic, r9.mAnaerobic) == 0) goto L135;
        return false;
    L135:
        if (this.mStamina == r9.mStamina) goto L138;
        return false;
    L138:
        if (Float.compare(this.mAvgSpeed, r9.mAvgSpeed) == 0) goto L141;
        return false;
    L141:
        if (this.mCadence == r9.mCadence) goto L144;
        return false;
    L144:
        if (this.mMaxCadence == r9.mMaxCadence) goto L147;
        return false;
    L147:
        if (this.mCnt == r9.mCnt) goto L150;
        return false;
    L150:
        if (Intrinsics.XOO0ii0(this.mBpmZoneCount, r9.mBpmZoneCount) == true) goto L153;
        return false;
    L153:
        if (Intrinsics.XOO0ii0(this.mPersonalZone, r9.mPersonalZone) == true) goto L156;
        return false;
    L156:
        if (this.mLactateThresholdPace == r9.mLactateThresholdPace) goto L159;
        return false;
    L159:
        if (this.mRecoveryTime == r9.mRecoveryTime) goto L162;
        return false;
    L162:
        if (this.mTrainingLoad == r9.mTrainingLoad) goto L165;
        return false;
    L165:
        if (this.mMaxVO2 == r9.mMaxVO2) goto L168;
        return false;
    L168:
        if (this.mLactateThresholdHr == r9.mLactateThresholdHr) goto L171;
        return false;
    L171:
        if (this.mAlgorithmMarking == r9.mAlgorithmMarking) goto L174;
        return false;
    L174:
        if (this.mPathCount == r9.mPathCount) goto L177;
        return false;
    L177:
        if (this.mPathSampleInterval == r9.mPathSampleInterval) goto L180;
        return false;
    L180:
        if (Intrinsics.XOO0ii0(this.mPathPoints, r9.mPathPoints) == true) goto L183;
        return false;
    L183:
        if (this.mHrPathCount == r9.mHrPathCount) goto L186;
        return false;
    L186:
        if (this.mHrPathSampleInterval == r9.mHrPathSampleInterval) goto L189;
        return false;
    L189:
        if (Intrinsics.XOO0ii0(this.mHrPathPoints, r9.mHrPathPoints) == true) goto L192;
        return false;
    L192:
        if (this.mPacePathCount == r9.mPacePathCount) goto L195;
        return false;
    L195:
        if (this.mPacePathSampleInterval == r9.mPacePathSampleInterval) goto L198;
        return false;
    L198:
        if (Intrinsics.XOO0ii0(this.mPacePathPoints, r9.mPacePathPoints) == true) goto L201;
        return false;
    L201:
        if (this.mSpeedPathCount == r9.mSpeedPathCount) goto L204;
        return false;
    L204:
        if (this.mSpeedPathSampleInterval == r9.mSpeedPathSampleInterval) goto L207;
        return false;
    L207:
        if (Intrinsics.XOO0ii0(this.mSpeedPathPoints, r9.mSpeedPathPoints) == true) goto L210;
        return false;
    L210:
        if (this.mCadencePathCount == r9.mCadencePathCount) goto L213;
        return false;
    L213:
        if (this.mCadencePathSampleInterval == r9.mCadencePathSampleInterval) goto L216;
        return false;
    L216:
        if (Intrinsics.XOO0ii0(this.mCadencePathPoints, r9.mCadencePathPoints) == true) goto L219;
        return false;
    L219:
        if (this.mAltitudePathCount == r9.mAltitudePathCount) goto L222;
        return false;
    L222:
        if (this.mAltitudePathSampleInterval == r9.mAltitudePathSampleInterval) goto L225;
        return false;
    L225:
        if (Intrinsics.XOO0ii0(this.mAltitudePathPoints, r9.mAltitudePathPoints) == true) goto L228;
        return false;
    L228:
        if (this.mGoalDistance == r9.mGoalDistance) goto L231;
        return false;
    L231:
        if (this.mGoalTime == r9.mGoalTime) goto L234;
        return false;
    L234:
        if (this.mGoalCalorie == r9.mGoalCalorie) goto L237;
        return false;
    L237:
        if (this.mPausedDuration == r9.mPausedDuration) goto L240;
        return false;
    L240:
        if (this.mCurBpm == r9.mCurBpm) goto L243;
        return false;
    L243:
        if (this.mAscendAltitude == r9.mAscendAltitude) goto L246;
        return false;
    L246:
        if (this.mDescendAltitude == r9.mDescendAltitude) goto L249;
        return false;
    L249:
        if (this.mCurStress == r9.mCurStress) goto L252;
        return false;
    L252:
        if (this.mSwimType == r9.mSwimType) goto L255;
        return false;
    L255:
        if (this.mCntFore == r9.mCntFore) goto L258;
        return false;
    L258:
        if (this.mCntBack == r9.mCntBack) goto L261;
        return false;
    L261:
        if (this.mBackSwingTime == r9.mBackSwingTime) goto L264;
        return false;
    L264:
        if (this.mDownSwingTime == r9.mDownSwingTime) goto L267;
        return false;
    L267:
        if (this.mDribbleTime == r9.mDribbleTime) goto L270;
        return false;
    L270:
        if (this.mTripCount == r9.mTripCount) goto L273;
        return false;
    L273:
        if (this.mSessionCount == r9.mSessionCount) goto L276;
        return false;
    L276:
        if (this.mVerticalOscillation == r9.mVerticalOscillation) goto L279;
        return false;
    L279:
        if (this.mRunPowerWatt == r9.mRunPowerWatt) goto L282;
        return false;
    L282:
        if (Float.compare(this.mStepLen, r9.mStepLen) == 0) goto L285;
        return false;
    L285:
        if (this.mTrainingStatus == r9.mTrainingStatus) goto L288;
        return false;
    L288:
        if (this.mFitnessAge == r9.mFitnessAge) goto L291;
        return false;
    L291:
        if (Float.compare(this.mTlTrend, r9.mTlTrend) == 0) goto L294;
        return false;
    L294:
        if (Intrinsics.XOO0ii0(this.mBestRunTime, r9.mBestRunTime) == true) goto L297;
        return false;
    L297:
        if (Intrinsics.XOO0ii0(this.mFitnessLevel, r9.mFitnessLevel) == true) goto L300;
        return false;
    L300:
        if (this.mCalorieTotal == r9.mCalorieTotal) goto L303;
        return false;
    L303:
        if (this.mPowerCount == r9.mPowerCount) goto L306;
        return false;
    L306:
        if (this.mPowerInterval == r9.mPowerInterval) goto L309;
        return false;
    L309:
        if (Intrinsics.XOO0ii0(this.mPowerPoints, r9.mPowerPoints) == true) goto L312;
        return false;
    L312:
        if (Float.compare(this.realTimeAerobic, r9.realTimeAerobic) == 0) goto L315;
        return false;
    L315:
        if (Float.compare(this.realTimeAnaerobic, r9.realTimeAnaerobic) == 0) goto L318;
        return false;
    L318:
        if (Float.compare(this.mFatTotal, r9.mFatTotal) == 0) goto L321;
        return false;
    L321:
        if (Float.compare(this.mCarboTotal, r9.mCarboTotal) == 0) goto L324;
        return false;
    L324:
        if (this.mNavigatorTargetTime == r9.mNavigatorTargetTime) goto L327;
        return false;
    L327:
        if (this.mNavigatorActualTime == r9.mNavigatorActualTime) goto L330;
        return false;
    L330:
        if (this.mNavigatorDifferenceTime == r9.mNavigatorDifferenceTime) goto L333;
        return false;
    L333:
        if (this.mNavigatorStatusTime == r9.mNavigatorStatusTime) goto L336;
        return false;
    L336:
        if (this.mNavigatorTargetDistance == r9.mNavigatorTargetDistance) goto L339;
        return false;
    L339:
        if (this.mNavigatorActualDistance == r9.mNavigatorActualDistance) goto L342;
        return false;
    L342:
        if (this.mNavigatorDifferenceDistance == r9.mNavigatorDifferenceDistance) goto L345;
        return false;
    L345:
        if (this.mNavigatorStatusDistance == r9.mNavigatorStatusDistance) goto L348;
        return false;
    L348:
        if (this.mNavigatorTargetPace == r9.mNavigatorTargetPace) goto L351;
        return false;
    L351:
        if (this.mNavigatorActualPace == r9.mNavigatorActualPace) goto L354;
        return false;
    L354:
        if (this.mNavigatorDifferencePace == r9.mNavigatorDifferencePace) goto L357;
        return false;
    L357:
        if (this.mNavigatorStatusPace == r9.mNavigatorStatusPace) goto L360;
        return false;
    L360:
        if (Float.compare(this.mNavigatorTargetSpeedV2, r9.mNavigatorTargetSpeedV2) == 0) goto L363;
        return false;
    L363:
        if (Float.compare(this.mNavigatorActualSpeedV2, r9.mNavigatorActualSpeedV2) == 0) goto L366;
        return false;
    L366:
        if (this.mNavigatorTargetSpeed == r9.mNavigatorTargetSpeed) goto L369;
        return false;
    L369:
        if (this.mNavigatorActualSpeed == r9.mNavigatorActualSpeed) goto L372;
        return false;
    L372:
        if (this.mNavigatorDifferenceSpeed == r9.mNavigatorDifferenceSpeed) goto L375;
        return false;
    L375:
        if (this.mNavigatorStatusSpeed == r9.mNavigatorStatusSpeed) goto L378;
        return false;
    L378:
        if (Float.compare(this.mMaxOxygenPower, r9.mMaxOxygenPower) == 0) goto L381;
        return false;
    L381:
        if (Intrinsics.XOO0ii0(this.mTrendWeek, r9.mTrendWeek) == true) goto L384;
        return false;
    L384:
        if (Intrinsics.XOO0ii0(this.mCyclingIndex, r9.mCyclingIndex) == true) goto L387;
        return false;
    L387:
        if (this.mStaBalance == r9.mStaBalance) goto L390;
        return false;
    L390:
        if (this.mSwimSwolf == r9.mSwimSwolf) goto L393;
        return false;
    L393:
        if (this.mCntLap == r9.mCntLap) goto L396;
        return false;
    L396:
        if (this.mFrontCrawlPerc == r9.mFrontCrawlPerc) goto L399;
        return false;
    L399:
        if (this.mBreaststrokePerc == r9.mBreaststrokePerc) goto L402;
        return false;
    L402:
        if (this.mBackstrokePerc == r9.mBackstrokePerc) goto L405;
        return false;
    L405:
        if (this.mButterflyPerc == r9.mButterflyPerc) goto L408;
        return false;
    L408:
        if (this.mSpmPathPointsCount == r9.mSpmPathPointsCount) goto L411;
        return false;
    L411:
        if (Intrinsics.XOO0ii0(this.mSpmPathPointsPoints, r9.mSpmPathPointsPoints) == true) goto L414;
        return false;
    L414:
        if (this.mStepLenCount == r9.mStepLenCount) goto L417;
        return false;
    L417:
        if (Intrinsics.XOO0ii0(this.mStepLenPoints, r9.mStepLenPoints) == true) goto L420;
        return false;
    L420:
        if (this.mEllipticalSteps == r9.mEllipticalSteps) goto L423;
        return false;
    L423:
        if (this.mChildSwimStartTime == r9.mChildSwimStartTime) goto L426;
        return false;
    L426:
        if (this.mChildSwimDuration == r9.mChildSwimDuration) goto L429;
        return false;
    L429:
        if (this.mChildSwimDistance == r9.mChildSwimDistance) goto L432;
        return false;
    L432:
        if (this.mChildCyclingStartTime == r9.mChildCyclingStartTime) goto L435;
        return false;
    L435:
        if (this.mChildCyclingDuration == r9.mChildCyclingDuration) goto L438;
        return false;
    L438:
        if (this.mChildCyclingDistance == r9.mChildCyclingDistance) goto L441;
        return false;
    L441:
        if (this.mChildRunStartTime == r9.mChildRunStartTime) goto L444;
        return false;
    L444:
        if (this.mChildRunDuration == r9.mChildRunDuration) goto L447;
        return false;
    L447:
        if (this.mChildRunDistance == r9.mChildRunDistance) goto L450;
        return false;
    L450:
        if (this.mChildSwimMode == r9.mChildSwimMode) goto L453;
        return false;
    L453:
        if (this.mChildCyclingMode == r9.mChildCyclingMode) goto L456;
        return false;
    L456:
        if (this.mChildRunMode == r9.mChildRunMode) goto L459;
        return false;
    L459:
        if (this.mChildNumber == r9.mChildNumber) goto L462;
        return false;
    L462:
        if (Float.compare(this.mRunLactateAvg, r9.mRunLactateAvg) == 0) goto L465;
        return false;
    L465:
        if (Float.compare(this.mCyclingLactateAvg, r9.mCyclingLactateAvg) == 0) goto L468;
        return false;
    L468:
        if (this.mFlag == r9.mFlag) goto L471;
        return false;
    L471:
        if (this.mRecoveryHrCount == r9.mRecoveryHrCount) goto L474;
        return false;
    L474:
        if (Intrinsics.XOO0ii0(this.mRecoveryHrPoints, r9.mRecoveryHrPoints) == true) goto L477;
        return false;
    L477:
        if (this.mSwimPoolLength == r9.mSwimPoolLength) goto L480;
        return false;
    L480:
        if (Intrinsics.XOO0ii0(this.mDeviceId, r9.mDeviceId) == true) goto L483;
        return false;
    L483:
        if (this.mAICoachSportID == r9.mAICoachSportID) goto L485;
        return false;
    L485:
        return true;
    }

    public final int getMAGpsType() {
        return this.mAGpsType;
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

    public final int getMAlgorithmMarking() {
        return this.mAlgorithmMarking;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAltitudePathCount() {
        return this.mAltitudePathCount;
    }

    @tb1
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

    @tb1
    public final int[] getMBestRunTime() {
        return this.mBestRunTime;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @tb1
    public final int[] getMBpmZoneCount() {
        return this.mBpmZoneCount;
    }

    public final int getMBreaststrokePerc() {
        return this.mBreaststrokePerc;
    }

    public final int getMButterflyPerc() {
        return this.mButterflyPerc;
    }

    public final int getMCadence() {
        return this.mCadence;
    }

    public final int getMCadencePathCount() {
        return this.mCadencePathCount;
    }

    @tb1
    public final List<Integer> getMCadencePathPoints() {
        return this.mCadencePathPoints;
    }

    public final int getMCadencePathSampleInterval() {
        return this.mCadencePathSampleInterval;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMCalorieTotal() {
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

    public final long getMChildCyclingStartTime() {
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

    public final long getMChildRunStartTime() {
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

    public final long getMChildSwimStartTime() {
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

    public final int getMCurBpm() {
        return this.mCurBpm;
    }

    public final int getMCurStress() {
        return this.mCurStress;
    }

    @tb1
    public final float[] getMCyclingIndex() {
        return this.mCyclingIndex;
    }

    public final float getMCyclingLactateAvg() {
        return this.mCyclingLactateAvg;
    }

    public final int getMDescendAltitude() {
        return this.mDescendAltitude;
    }

    @tb1
    public final String getMDeviceId() {
        return this.mDeviceId;
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

    public final long getMEnd() {
        return this.mEnd;
    }

    public final float getMFatTotal() {
        return this.mFatTotal;
    }

    public final int getMFeel() {
        return this.mFeel;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    public final int getMFitnessAge() {
        return this.mFitnessAge;
    }

    @tb1
    public final float[] getMFitnessLevel() {
        return this.mFitnessLevel;
    }

    public final int getMFlag() {
        return this.mFlag;
    }

    public final int getMFrontCrawlPerc() {
        return this.mFrontCrawlPerc;
    }

    public final int getMGoalCalorie() {
        return this.mGoalCalorie;
    }

    public final int getMGoalDistance() {
        return this.mGoalDistance;
    }

    public final int getMGoalTime() {
        return this.mGoalTime;
    }

    public final int getMHrPathCount() {
        return this.mHrPathCount;
    }

    @tb1
    public final List<Integer> getMHrPathPoints() {
        return this.mHrPathPoints;
    }

    public final int getMHrPathSampleInterval() {
        return this.mHrPathSampleInterval;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final int getMLactateThresholdHr() {
        return this.mLactateThresholdHr;
    }

    public final int getMLactateThresholdPace() {
        return this.mLactateThresholdPace;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
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

    public final int getMMaxSpeed() {
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

    public final int getMMetTotal() {
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

    public final int getMMinSpeed() {
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

    public final int getMNavigatorActualSpeed() {
        return this.mNavigatorActualSpeed;
    }

    public final float getMNavigatorActualSpeedV2() {
        return this.mNavigatorActualSpeedV2;
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

    public final int getMNavigatorTargetSpeed() {
        return this.mNavigatorTargetSpeed;
    }

    public final float getMNavigatorTargetSpeedV2() {
        return this.mNavigatorTargetSpeedV2;
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

    @tb1
    public final List<Integer> getMPacePathPoints() {
        return this.mPacePathPoints;
    }

    public final int getMPacePathSampleInterval() {
        return this.mPacePathSampleInterval;
    }

    public final int getMPathCount() {
        return this.mPathCount;
    }

    @tb1
    public final List<float[]> getMPathPoints() {
        return this.mPathPoints;
    }

    public final int getMPathSampleInterval() {
        return this.mPathSampleInterval;
    }

    public final int getMPausedDuration() {
        return this.mPausedDuration;
    }

    @tb1
    public final int[] getMPersonalZone() {
        return this.mPersonalZone;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    public final int getMPowerCount() {
        return this.mPowerCount;
    }

    public final int getMPowerInterval() {
        return this.mPowerInterval;
    }

    @tb1
    public final List<Integer> getMPowerPoints() {
        return this.mPowerPoints;
    }

    @aa1
    public final String getMPrototype() {
        return this.mPrototype;
    }

    public final int getMRecoveryHrCount() {
        return this.mRecoveryHrCount;
    }

    @tb1
    public final List<Integer> getMRecoveryHrPoints() {
        return this.mRecoveryHrPoints;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final int getMRestDuration() {
        return this.mRestDuration;
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

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpeedPathCount() {
        return this.mSpeedPathCount;
    }

    @tb1
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

    @tb1
    public final List<Integer> getMSpmPathPointsPoints() {
        return this.mSpmPathPointsPoints;
    }

    public final int getMStaBalance() {
        return this.mStaBalance;
    }

    public final int getMStamina() {
        return this.mStamina;
    }

    public final long getMStart() {
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

    @tb1
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

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public final int getMTrainingStatus() {
        return this.mTrainingStatus;
    }

    @tb1
    public final float[] getMTrendWeek() {
        return this.mTrendWeek;
    }

    public final int getMTripCount() {
        return this.mTripCount;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMVerticalOscillation() {
        return this.mVerticalOscillation;
    }

    public final float getRealTimeAerobic() {
        return this.realTimeAerobic;
    }

    public final float getRealTimeAnaerobic() {
        return this.realTimeAnaerobic;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mStart)) * 31) + Long.hashCode(this.mEnd)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Integer.hashCode(this.mFeel)) * 31) + this.mPrototype.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mBleName.hashCode()) * 31) + this.mPlatform.hashCode()) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mMinSpeed)) * 31) + Integer.hashCode(this.mRestDuration)) * 31) + Integer.hashCode(this.mAGpsType)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mMetTotal)) * 31) + Float.hashCode(this.mAerobic)) * 31) + Float.hashCode(this.mAnaerobic)) * 31) + Integer.hashCode(this.mStamina)) * 31) + Float.hashCode(this.mAvgSpeed)) * 31) + Integer.hashCode(this.mCadence)) * 31) + Integer.hashCode(this.mMaxCadence)) * 31) + Integer.hashCode(this.mCnt)) * 31;
        int[] r1 = this.mBpmZoneCount;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        int[] r5 = this.mPersonalZone;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (((((((((((((((((r4 + r6) * 31) + Integer.hashCode(this.mLactateThresholdPace)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mMaxVO2)) * 31) + Integer.hashCode(this.mLactateThresholdHr)) * 31) + Integer.hashCode(this.mAlgorithmMarking)) * 31) + Integer.hashCode(this.mPathCount)) * 31) + Integer.hashCode(this.mPathSampleInterval)) * 31;
        List<float[]> r8 = this.mPathPoints;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (((((r7 + r9) * 31) + Integer.hashCode(this.mHrPathCount)) * 31) + Integer.hashCode(this.mHrPathSampleInterval)) * 31;
        List<Integer> r11 = this.mHrPathPoints;
        if (r11 != null) goto L17;
        int r12 = 0;
    L18:
        int r13 = (((((r10 + r12) * 31) + Integer.hashCode(this.mPacePathCount)) * 31) + Integer.hashCode(this.mPacePathSampleInterval)) * 31;
        List<Integer> r14 = this.mPacePathPoints;
        if (r14 != null) goto L21;
        int r15 = 0;
    L22:
        int r16 = (((((r13 + r15) * 31) + Integer.hashCode(this.mSpeedPathCount)) * 31) + Integer.hashCode(this.mSpeedPathSampleInterval)) * 31;
        List<Integer> r17 = this.mSpeedPathPoints;
        if (r17 != null) goto L25;
        int r18 = 0;
    L26:
        int r19 = (((((r16 + r18) * 31) + Integer.hashCode(this.mCadencePathCount)) * 31) + Integer.hashCode(this.mCadencePathSampleInterval)) * 31;
        List<Integer> r20 = this.mCadencePathPoints;
        if (r20 != null) goto L29;
        int r21 = 0;
    L30:
        int r22 = (((((r19 + r21) * 31) + Integer.hashCode(this.mAltitudePathCount)) * 31) + Integer.hashCode(this.mAltitudePathSampleInterval)) * 31;
        List<Integer> r23 = this.mAltitudePathPoints;
        if (r23 != null) goto L33;
        int r24 = 0;
    L34:
        int r25 = (((((((((((((((((((((((((((((((((((((((((((((r22 + r24) * 31) + Integer.hashCode(this.mGoalDistance)) * 31) + Integer.hashCode(this.mGoalTime)) * 31) + Integer.hashCode(this.mGoalCalorie)) * 31) + Integer.hashCode(this.mPausedDuration)) * 31) + Integer.hashCode(this.mCurBpm)) * 31) + Integer.hashCode(this.mAscendAltitude)) * 31) + Integer.hashCode(this.mDescendAltitude)) * 31) + Integer.hashCode(this.mCurStress)) * 31) + Integer.hashCode(this.mSwimType)) * 31) + Integer.hashCode(this.mCntFore)) * 31) + Integer.hashCode(this.mCntBack)) * 31) + Integer.hashCode(this.mBackSwingTime)) * 31) + Integer.hashCode(this.mDownSwingTime)) * 31) + Integer.hashCode(this.mDribbleTime)) * 31) + Integer.hashCode(this.mTripCount)) * 31) + Integer.hashCode(this.mSessionCount)) * 31) + Integer.hashCode(this.mVerticalOscillation)) * 31) + Integer.hashCode(this.mRunPowerWatt)) * 31) + Float.hashCode(this.mStepLen)) * 31) + Integer.hashCode(this.mTrainingStatus)) * 31) + Integer.hashCode(this.mFitnessAge)) * 31) + Float.hashCode(this.mTlTrend)) * 31;
        int[] r26 = this.mBestRunTime;
        if (r26 != null) goto L37;
        int r27 = 0;
    L38:
        int r28 = (r25 + r27) * 31;
        float[] r29 = this.mFitnessLevel;
        if (r29 != null) goto L41;
        int r30 = 0;
    L42:
        int r31 = (((((((r28 + r30) * 31) + Integer.hashCode(this.mCalorieTotal)) * 31) + Integer.hashCode(this.mPowerCount)) * 31) + Integer.hashCode(this.mPowerInterval)) * 31;
        List<Integer> r32 = this.mPowerPoints;
        if (r32 != null) goto L45;
        int r33 = 0;
    L46:
        int r34 = (((((((((((((((((((((((((((((((((((((((((((((((r31 + r33) * 31) + Float.hashCode(this.realTimeAerobic)) * 31) + Float.hashCode(this.realTimeAnaerobic)) * 31) + Float.hashCode(this.mFatTotal)) * 31) + Float.hashCode(this.mCarboTotal)) * 31) + Integer.hashCode(this.mNavigatorTargetTime)) * 31) + Integer.hashCode(this.mNavigatorActualTime)) * 31) + Integer.hashCode(this.mNavigatorDifferenceTime)) * 31) + Integer.hashCode(this.mNavigatorStatusTime)) * 31) + Integer.hashCode(this.mNavigatorTargetDistance)) * 31) + Integer.hashCode(this.mNavigatorActualDistance)) * 31) + Integer.hashCode(this.mNavigatorDifferenceDistance)) * 31) + Integer.hashCode(this.mNavigatorStatusDistance)) * 31) + Integer.hashCode(this.mNavigatorTargetPace)) * 31) + Integer.hashCode(this.mNavigatorActualPace)) * 31) + Integer.hashCode(this.mNavigatorDifferencePace)) * 31) + Integer.hashCode(this.mNavigatorStatusPace)) * 31) + Float.hashCode(this.mNavigatorTargetSpeedV2)) * 31) + Float.hashCode(this.mNavigatorActualSpeedV2)) * 31) + Integer.hashCode(this.mNavigatorTargetSpeed)) * 31) + Integer.hashCode(this.mNavigatorActualSpeed)) * 31) + Integer.hashCode(this.mNavigatorDifferenceSpeed)) * 31) + Integer.hashCode(this.mNavigatorStatusSpeed)) * 31) + Float.hashCode(this.mMaxOxygenPower)) * 31;
        float[] r35 = this.mTrendWeek;
        if (r35 != null) goto L49;
        int r36 = 0;
    L50:
        int r37 = (r34 + r36) * 31;
        float[] r38 = this.mCyclingIndex;
        if (r38 != null) goto L53;
        int r39 = 0;
    L54:
        int r40 = (((((((((((((((((r37 + r39) * 31) + Integer.hashCode(this.mStaBalance)) * 31) + Integer.hashCode(this.mSwimSwolf)) * 31) + Integer.hashCode(this.mCntLap)) * 31) + Integer.hashCode(this.mFrontCrawlPerc)) * 31) + Integer.hashCode(this.mBreaststrokePerc)) * 31) + Integer.hashCode(this.mBackstrokePerc)) * 31) + Integer.hashCode(this.mButterflyPerc)) * 31) + Integer.hashCode(this.mSpmPathPointsCount)) * 31;
        List<Integer> r41 = this.mSpmPathPointsPoints;
        if (r41 != null) goto L57;
        int r42 = 0;
    L58:
        int r43 = (((r40 + r42) * 31) + Integer.hashCode(this.mStepLenCount)) * 31;
        List<Float> r44 = this.mStepLenPoints;
        if (r44 != null) goto L61;
        int r45 = 0;
    L62:
        int r46 = (((((((((((((((((((((((((((((((((((((r43 + r45) * 31) + Integer.hashCode(this.mEllipticalSteps)) * 31) + Long.hashCode(this.mChildSwimStartTime)) * 31) + Integer.hashCode(this.mChildSwimDuration)) * 31) + Integer.hashCode(this.mChildSwimDistance)) * 31) + Long.hashCode(this.mChildCyclingStartTime)) * 31) + Integer.hashCode(this.mChildCyclingDuration)) * 31) + Integer.hashCode(this.mChildCyclingDistance)) * 31) + Long.hashCode(this.mChildRunStartTime)) * 31) + Integer.hashCode(this.mChildRunDuration)) * 31) + Integer.hashCode(this.mChildRunDistance)) * 31) + Integer.hashCode(this.mChildSwimMode)) * 31) + Integer.hashCode(this.mChildCyclingMode)) * 31) + Integer.hashCode(this.mChildRunMode)) * 31) + Integer.hashCode(this.mChildNumber)) * 31) + Float.hashCode(this.mRunLactateAvg)) * 31) + Float.hashCode(this.mCyclingLactateAvg)) * 31) + Integer.hashCode(this.mFlag)) * 31) + Integer.hashCode(this.mRecoveryHrCount)) * 31;
        List<Integer> r47 = this.mRecoveryHrPoints;
        if (r47 != null) goto L65;
        int r48 = 0;
    L66:
        int r49 = (((r46 + r48) * 31) + Integer.hashCode(this.mSwimPoolLength)) * 31;
        String r50 = this.mDeviceId;
        if (r50 == null) goto L71;
        r2 = r50.hashCode();
    L71:
        return ((r49 + r2) * 31) + Integer.hashCode(this.mAICoachSportID);
    L65:
        r48 = r47.hashCode();
        goto L66
    L61:
        r45 = r44.hashCode();
        goto L62
    L57:
        r42 = r41.hashCode();
        goto L58
    L53:
        r39 = Arrays.hashCode(r38);
        goto L54
    L49:
        r36 = Arrays.hashCode(r35);
        goto L50
    L45:
        r33 = r32.hashCode();
        goto L46
    L41:
        r30 = Arrays.hashCode(r29);
        goto L42
    L37:
        r27 = Arrays.hashCode(r26);
        goto L38
    L33:
        r24 = r23.hashCode();
        goto L34
    L29:
        r21 = r20.hashCode();
        goto L30
    L25:
        r18 = r17.hashCode();
        goto L26
    L21:
        r15 = r14.hashCode();
        goto L22
    L17:
        r12 = r11.hashCode();
        goto L18
    L13:
        r9 = r8.hashCode();
        goto L14
    L9:
        r6 = Arrays.hashCode(r5);
        goto L10
    L5:
        r3 = Arrays.hashCode(r1);
        goto L6
    }

    public final void setMAGpsType(int r1) {
        this.mAGpsType = r1;
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

    public final void setMAlgorithmMarking(int r1) {
        this.mAlgorithmMarking = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMAltitudePathCount(int r1) {
        this.mAltitudePathCount = r1;
    }

    public final void setMAltitudePathPoints(@tb1 List<Integer> r1) {
        this.mAltitudePathPoints = r1;
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

    public final void setMBestRunTime(@tb1 int[] r1) {
        this.mBestRunTime = r1;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMBpmZoneCount(@tb1 int[] r1) {
        this.mBpmZoneCount = r1;
    }

    public final void setMBreaststrokePerc(int r1) {
        this.mBreaststrokePerc = r1;
    }

    public final void setMButterflyPerc(int r1) {
        this.mButterflyPerc = r1;
    }

    public final void setMCadence(int r1) {
        this.mCadence = r1;
    }

    public final void setMCadencePathCount(int r1) {
        this.mCadencePathCount = r1;
    }

    public final void setMCadencePathPoints(@tb1 List<Integer> r1) {
        this.mCadencePathPoints = r1;
    }

    public final void setMCadencePathSampleInterval(int r1) {
        this.mCadencePathSampleInterval = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMCalorieTotal(int r1) {
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

    public final void setMChildCyclingStartTime(long r1) {
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

    public final void setMChildRunStartTime(long r1) {
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

    public final void setMChildSwimStartTime(long r1) {
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

    public final void setMCurBpm(int r1) {
        this.mCurBpm = r1;
    }

    public final void setMCurStress(int r1) {
        this.mCurStress = r1;
    }

    public final void setMCyclingIndex(@tb1 float[] r1) {
        this.mCyclingIndex = r1;
    }

    public final void setMCyclingLactateAvg(float r1) {
        this.mCyclingLactateAvg = r1;
    }

    public final void setMDescendAltitude(int r1) {
        this.mDescendAltitude = r1;
    }

    public final void setMDeviceId(@tb1 String r1) {
        this.mDeviceId = r1;
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

    public final void setMEnd(long r1) {
        this.mEnd = r1;
    }

    public final void setMFatTotal(float r1) {
        this.mFatTotal = r1;
    }

    public final void setMFeel(int r1) {
        this.mFeel = r1;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMFitnessAge(int r1) {
        this.mFitnessAge = r1;
    }

    public final void setMFitnessLevel(@tb1 float[] r1) {
        this.mFitnessLevel = r1;
    }

    public final void setMFlag(int r1) {
        this.mFlag = r1;
    }

    public final void setMFrontCrawlPerc(int r1) {
        this.mFrontCrawlPerc = r1;
    }

    public final void setMGoalCalorie(int r1) {
        this.mGoalCalorie = r1;
    }

    public final void setMGoalDistance(int r1) {
        this.mGoalDistance = r1;
    }

    public final void setMGoalTime(int r1) {
        this.mGoalTime = r1;
    }

    public final void setMHrPathCount(int r1) {
        this.mHrPathCount = r1;
    }

    public final void setMHrPathPoints(@tb1 List<Integer> r1) {
        this.mHrPathPoints = r1;
    }

    public final void setMHrPathSampleInterval(int r1) {
        this.mHrPathSampleInterval = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLactateThresholdHr(int r1) {
        this.mLactateThresholdHr = r1;
    }

    public final void setMLactateThresholdPace(int r1) {
        this.mLactateThresholdPace = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
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

    public final void setMMaxSpeed(int r1) {
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

    public final void setMMetTotal(int r1) {
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

    public final void setMMinSpeed(int r1) {
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

    public final void setMNavigatorActualSpeed(int r1) {
        this.mNavigatorActualSpeed = r1;
    }

    public final void setMNavigatorActualSpeedV2(float r1) {
        this.mNavigatorActualSpeedV2 = r1;
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

    public final void setMNavigatorTargetSpeed(int r1) {
        this.mNavigatorTargetSpeed = r1;
    }

    public final void setMNavigatorTargetSpeedV2(float r1) {
        this.mNavigatorTargetSpeedV2 = r1;
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

    public final void setMPacePathPoints(@tb1 List<Integer> r1) {
        this.mPacePathPoints = r1;
    }

    public final void setMPacePathSampleInterval(int r1) {
        this.mPacePathSampleInterval = r1;
    }

    public final void setMPathCount(int r1) {
        this.mPathCount = r1;
    }

    public final void setMPathPoints(@tb1 List<float[]> r1) {
        this.mPathPoints = r1;
    }

    public final void setMPathSampleInterval(int r1) {
        this.mPathSampleInterval = r1;
    }

    public final void setMPausedDuration(int r1) {
        this.mPausedDuration = r1;
    }

    public final void setMPersonalZone(@tb1 int[] r1) {
        this.mPersonalZone = r1;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMPowerCount(int r1) {
        this.mPowerCount = r1;
    }

    public final void setMPowerInterval(int r1) {
        this.mPowerInterval = r1;
    }

    public final void setMPowerPoints(@tb1 List<Integer> r1) {
        this.mPowerPoints = r1;
    }

    public final void setMPrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPrototype = r2;
    }

    public final void setMRecoveryHrCount(int r1) {
        this.mRecoveryHrCount = r1;
    }

    public final void setMRecoveryHrPoints(@tb1 List<Integer> r1) {
        this.mRecoveryHrPoints = r1;
    }

    public final void setMRecoveryTime(int r1) {
        this.mRecoveryTime = r1;
    }

    public final void setMRestDuration(int r1) {
        this.mRestDuration = r1;
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

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMSpeedPathCount(int r1) {
        this.mSpeedPathCount = r1;
    }

    public final void setMSpeedPathPoints(@tb1 List<Integer> r1) {
        this.mSpeedPathPoints = r1;
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

    public final void setMSpmPathPointsPoints(@tb1 List<Integer> r1) {
        this.mSpmPathPointsPoints = r1;
    }

    public final void setMStaBalance(int r1) {
        this.mStaBalance = r1;
    }

    public final void setMStamina(int r1) {
        this.mStamina = r1;
    }

    public final void setMStart(long r1) {
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

    public final void setMStepLenPoints(@tb1 List<Float> r1) {
        this.mStepLenPoints = r1;
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

    public final void setMTrainingLoad(int r1) {
        this.mTrainingLoad = r1;
    }

    public final void setMTrainingStatus(int r1) {
        this.mTrainingStatus = r1;
    }

    public final void setMTrendWeek(@tb1 float[] r1) {
        this.mTrendWeek = r1;
    }

    public final void setMTripCount(int r1) {
        this.mTripCount = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMVerticalOscillation(int r1) {
        this.mVerticalOscillation = r1;
    }

    public final void setRealTimeAerobic(float r1) {
        this.realTimeAerobic = r1;
    }

    public final void setRealTimeAnaerobic(float r1) {
        this.realTimeAnaerobic = r1;
    }

    @aa1
    public String toString() {
        return "Workout(mId=" + this.mId + ", mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mLocalTime=" + this.mLocalTime + ", mDuration=" + this.mDuration + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mSpm=" + this.mSpm + ", mMode=" + this.mMode + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMinBpm=" + this.mMinBpm + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + ", mMinStress=" + this.mMinStress + ", mMaxStress=" + this.mMaxStress + ", mAvgStress=" + this.mAvgStress + ", mSource=" + this.mSource + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mFeel=" + this.mFeel + ", mPrototype=" + this.mPrototype + ", mFirmwareFlag=" + this.mFirmwareFlag + ", mBleName=" + this.mBleName + ", mPlatform=" + this.mPlatform + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinSpeed=" + this.mMinSpeed + ", mRestDuration=" + this.mRestDuration + ", mAGpsType=" + this.mAGpsType + ", mType=" + this.mType + ", mMetTotal=" + this.mMetTotal + ", mAerobic=" + this.mAerobic + ", mAnaerobic=" + this.mAnaerobic + ", mStamina=" + this.mStamina + ", mAvgSpeed=" + this.mAvgSpeed + ", mCadence=" + this.mCadence + ", mMaxCadence=" + this.mMaxCadence + ", mCnt=" + this.mCnt + ", mBpmZoneCount=" + Arrays.toString(this.mBpmZoneCount) + ", mPersonalZone=" + Arrays.toString(this.mPersonalZone) + ", mLactateThresholdPace=" + this.mLactateThresholdPace + ", mRecoveryTime=" + this.mRecoveryTime + ", mTrainingLoad=" + this.mTrainingLoad + ", mMaxVO2=" + this.mMaxVO2 + ", mLactateThresholdHr=" + this.mLactateThresholdHr + ", mAlgorithmMarking=" + this.mAlgorithmMarking + ", mPathCount=" + this.mPathCount + ", mPathSampleInterval=" + this.mPathSampleInterval + ", mPathPoints=" + this.mPathPoints + ", mHrPathCount=" + this.mHrPathCount + ", mHrPathSampleInterval=" + this.mHrPathSampleInterval + ", mHrPathPoints=" + this.mHrPathPoints + ", mPacePathCount=" + this.mPacePathCount + ", mPacePathSampleInterval=" + this.mPacePathSampleInterval + ", mPacePathPoints=" + this.mPacePathPoints + ", mSpeedPathCount=" + this.mSpeedPathCount + ", mSpeedPathSampleInterval=" + this.mSpeedPathSampleInterval + ", mSpeedPathPoints=" + this.mSpeedPathPoints + ", mCadencePathCount=" + this.mCadencePathCount + ", mCadencePathSampleInterval=" + this.mCadencePathSampleInterval + ", mCadencePathPoints=" + this.mCadencePathPoints + ", mAltitudePathCount=" + this.mAltitudePathCount + ", mAltitudePathSampleInterval=" + this.mAltitudePathSampleInterval + ", mAltitudePathPoints=" + this.mAltitudePathPoints + ", mGoalDistance=" + this.mGoalDistance + ", mGoalTime=" + this.mGoalTime + ", mGoalCalorie=" + this.mGoalCalorie + ", mPausedDuration=" + this.mPausedDuration + ", mCurBpm=" + this.mCurBpm + ", mAscendAltitude=" + this.mAscendAltitude + ", mDescendAltitude=" + this.mDescendAltitude + ", mCurStress=" + this.mCurStress + ", mSwimType=" + this.mSwimType + ", mCntFore=" + this.mCntFore + ", mCntBack=" + this.mCntBack + ", mBackSwingTime=" + this.mBackSwingTime + ", mDownSwingTime=" + this.mDownSwingTime + ", mDribbleTime=" + this.mDribbleTime + ", mTripCount=" + this.mTripCount + ", mSessionCount=" + this.mSessionCount + ", mVerticalOscillation=" + this.mVerticalOscillation + ", mRunPowerWatt=" + this.mRunPowerWatt + ", mStepLen=" + this.mStepLen + ", mTrainingStatus=" + this.mTrainingStatus + ", mFitnessAge=" + this.mFitnessAge + ", mTlTrend=" + this.mTlTrend + ", mBestRunTime=" + Arrays.toString(this.mBestRunTime) + ", mFitnessLevel=" + Arrays.toString(this.mFitnessLevel) + ", mCalorieTotal=" + this.mCalorieTotal + ", mPowerCount=" + this.mPowerCount + ", mPowerInterval=" + this.mPowerInterval + ", mPowerPoints=" + this.mPowerPoints + ", realTimeAerobic=" + this.realTimeAerobic + ", realTimeAnaerobic=" + this.realTimeAnaerobic + ", mFatTotal=" + this.mFatTotal + ", mCarboTotal=" + this.mCarboTotal + ", mNavigatorTargetTime=" + this.mNavigatorTargetTime + ", mNavigatorActualTime=" + this.mNavigatorActualTime + ", mNavigatorDifferenceTime=" + this.mNavigatorDifferenceTime + ", mNavigatorStatusTime=" + this.mNavigatorStatusTime + ", mNavigatorTargetDistance=" + this.mNavigatorTargetDistance + ", mNavigatorActualDistance=" + this.mNavigatorActualDistance + ", mNavigatorDifferenceDistance=" + this.mNavigatorDifferenceDistance + ", mNavigatorStatusDistance=" + this.mNavigatorStatusDistance + ", mNavigatorTargetPace=" + this.mNavigatorTargetPace + ", mNavigatorActualPace=" + this.mNavigatorActualPace + ", mNavigatorDifferencePace=" + this.mNavigatorDifferencePace + ", mNavigatorStatusPace=" + this.mNavigatorStatusPace + ", mNavigatorTargetSpeedV2=" + this.mNavigatorTargetSpeedV2 + ", mNavigatorActualSpeedV2=" + this.mNavigatorActualSpeedV2 + ", mNavigatorTargetSpeed=" + this.mNavigatorTargetSpeed + ", mNavigatorActualSpeed=" + this.mNavigatorActualSpeed + ", mNavigatorDifferenceSpeed=" + this.mNavigatorDifferenceSpeed + ", mNavigatorStatusSpeed=" + this.mNavigatorStatusSpeed + ", mMaxOxygenPower=" + this.mMaxOxygenPower + ", mTrendWeek=" + Arrays.toString(this.mTrendWeek) + ", mCyclingIndex=" + Arrays.toString(this.mCyclingIndex) + ", mStaBalance=" + this.mStaBalance + ", mSwimSwolf=" + this.mSwimSwolf + ", mCntLap=" + this.mCntLap + ", mFrontCrawlPerc=" + this.mFrontCrawlPerc + ", mBreaststrokePerc=" + this.mBreaststrokePerc + ", mBackstrokePerc=" + this.mBackstrokePerc + ", mButterflyPerc=" + this.mButterflyPerc + ", mSpmPathPointsCount=" + this.mSpmPathPointsCount + ", mSpmPathPointsPoints=" + this.mSpmPathPointsPoints + ", mStepLenCount=" + this.mStepLenCount + ", mStepLenPoints=" + this.mStepLenPoints + ", mEllipticalSteps=" + this.mEllipticalSteps + ", mChildSwimStartTime=" + this.mChildSwimStartTime + ", mChildSwimDuration=" + this.mChildSwimDuration + ", mChildSwimDistance=" + this.mChildSwimDistance + ", mChildCyclingStartTime=" + this.mChildCyclingStartTime + ", mChildCyclingDuration=" + this.mChildCyclingDuration + ", mChildCyclingDistance=" + this.mChildCyclingDistance + ", mChildRunStartTime=" + this.mChildRunStartTime + ", mChildRunDuration=" + this.mChildRunDuration + ", mChildRunDistance=" + this.mChildRunDistance + ", mChildSwimMode=" + this.mChildSwimMode + ", mChildCyclingMode=" + this.mChildCyclingMode + ", mChildRunMode=" + this.mChildRunMode + ", mChildNumber=" + this.mChildNumber + ", mRunLactateAvg=" + this.mRunLactateAvg + ", mCyclingLactateAvg=" + this.mCyclingLactateAvg + ", mFlag=" + this.mFlag + ", mRecoveryHrCount=" + this.mRecoveryHrCount + ", mRecoveryHrPoints=" + this.mRecoveryHrPoints + ", mSwimPoolLength=" + this.mSwimPoolLength + ", mDeviceId=" + this.mDeviceId + ", mAICoachSportID=" + this.mAICoachSportID + I000IiI1O.iO.iO;
    }

    public Workout(int r6, long r7, long r9, @aa1 String r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, @aa1 String r38, @aa1 String r39, @aa1 String r40, @aa1 String r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, float r49, int r50, float r51, int r52, int r53, int r54, @tb1 int[] r55, @tb1 int[] r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, @tb1 List<float[]> r65, int r66, int r67, @tb1 List<Integer> r68, int r69, int r70, @tb1 List<Integer> r71, int r72, int r73, @tb1 List<Integer> r74, int r75, int r76, @tb1 List<Integer> r77, int r78, int r79, @tb1 List<Integer> r80, int r81, int r82, int r83, int r84, int r85, int r86, int r87, int r88, int r89, int r90, int r91, int r92, int r93, int r94, int r95, int r96, int r97, int r98, float r99, int r100, int r101, float r102, @tb1 int[] r103, @tb1 float[] r104, int r105, int r106, int r107, @tb1 List<Integer> r108, float r109, float r110, float r111, float r112, int r113, int r114, int r115, int r116, int r117, int r118, int r119, int r120, int r121, int r122, int r123, int r124, float r125, float r126, int r127, int r128, int r129, int r130, float r131, @tb1 float[] r132, @tb1 float[] r133, int r134, int r135, int r136, int r137, int r138, int r139, int r140, int r141, @tb1 List<Integer> r142, int r143, @tb1 List<Float> r144, int r145, long r146, int r148, int r149, long r150, int r152, int r153, long r154, int r156, int r157, int r158, int r159, int r160, int r161, float r162, float r163, int r164, int r165, @tb1 List<Integer> r166, int r167, @tb1 String r168, int r169) {
        Intrinsics.X0O(r11, "mLocalTime");
        Intrinsics.X0O(r38, "mPrototype");
        Intrinsics.X0O(r39, "mFirmwareFlag");
        Intrinsics.X0O(r40, "mBleName");
        Intrinsics.X0O(r41, "mPlatform");
        this.mId = r6;
        this.mStart = r7;
        this.mEnd = r9;
        this.mLocalTime = r11;
        this.mDuration = r12;
        this.mAltitude = r13;
        this.mAirPressure = r14;
        this.mSpm = r15;
        this.mMode = r16;
        this.mStep = r17;
        this.mDistance = r18;
        this.mCalorie = r19;
        this.mSpeed = r20;
        this.mPace = r21;
        this.mAvgBpm = r22;
        this.mMaxBpm = r23;
        this.mMinBpm = r24;
        this.mMaxSpm = r25;
        this.mMinSpm = r26;
        this.mMaxPace = r27;
        this.mMinPace = r28;
        this.mMaxAltitude = r29;
        this.mMinAltitude = r30;
        this.mMinStress = r31;
        this.mMaxStress = r32;
        this.mAvgStress = r33;
        this.mSource = r34;
        this.mIsSync = r35;
        this.mIsDelete = r36;
        this.mFeel = r37;
        this.mPrototype = r38;
        this.mFirmwareFlag = r39;
        this.mBleName = r40;
        this.mPlatform = r41;
        this.mMaxSpeed = r42;
        this.mMinSpeed = r43;
        this.mRestDuration = r44;
        this.mAGpsType = r45;
        this.mType = r46;
        this.mMetTotal = r47;
        this.mAerobic = r48;
        this.mAnaerobic = r49;
        this.mStamina = r50;
        this.mAvgSpeed = r51;
        this.mCadence = r52;
        this.mMaxCadence = r53;
        this.mCnt = r54;
        this.mBpmZoneCount = r55;
        this.mPersonalZone = r56;
        this.mLactateThresholdPace = r57;
        this.mRecoveryTime = r58;
        this.mTrainingLoad = r59;
        this.mMaxVO2 = r60;
        this.mLactateThresholdHr = r61;
        this.mAlgorithmMarking = r62;
        this.mPathCount = r63;
        this.mPathSampleInterval = r64;
        this.mPathPoints = r65;
        this.mHrPathCount = r66;
        this.mHrPathSampleInterval = r67;
        this.mHrPathPoints = r68;
        this.mPacePathCount = r69;
        this.mPacePathSampleInterval = r70;
        this.mPacePathPoints = r71;
        this.mSpeedPathCount = r72;
        this.mSpeedPathSampleInterval = r73;
        this.mSpeedPathPoints = r74;
        this.mCadencePathCount = r75;
        this.mCadencePathSampleInterval = r76;
        this.mCadencePathPoints = r77;
        this.mAltitudePathCount = r78;
        this.mAltitudePathSampleInterval = r79;
        this.mAltitudePathPoints = r80;
        this.mGoalDistance = r81;
        this.mGoalTime = r82;
        this.mGoalCalorie = r83;
        this.mPausedDuration = r84;
        this.mCurBpm = r85;
        this.mAscendAltitude = r86;
        this.mDescendAltitude = r87;
        this.mCurStress = r88;
        this.mSwimType = r89;
        this.mCntFore = r90;
        this.mCntBack = r91;
        this.mBackSwingTime = r92;
        this.mDownSwingTime = r93;
        this.mDribbleTime = r94;
        this.mTripCount = r95;
        this.mSessionCount = r96;
        this.mVerticalOscillation = r97;
        this.mRunPowerWatt = r98;
        this.mStepLen = r99;
        this.mTrainingStatus = r100;
        this.mFitnessAge = r101;
        this.mTlTrend = r102;
        this.mBestRunTime = r103;
        this.mFitnessLevel = r104;
        this.mCalorieTotal = r105;
        this.mPowerCount = r106;
        this.mPowerInterval = r107;
        this.mPowerPoints = r108;
        this.realTimeAerobic = r109;
        this.realTimeAnaerobic = r110;
        this.mFatTotal = r111;
        this.mCarboTotal = r112;
        this.mNavigatorTargetTime = r113;
        this.mNavigatorActualTime = r114;
        this.mNavigatorDifferenceTime = r115;
        this.mNavigatorStatusTime = r116;
        this.mNavigatorTargetDistance = r117;
        this.mNavigatorActualDistance = r118;
        this.mNavigatorDifferenceDistance = r119;
        this.mNavigatorStatusDistance = r120;
        this.mNavigatorTargetPace = r121;
        this.mNavigatorActualPace = r122;
        this.mNavigatorDifferencePace = r123;
        this.mNavigatorStatusPace = r124;
        this.mNavigatorTargetSpeedV2 = r125;
        this.mNavigatorActualSpeedV2 = r126;
        this.mNavigatorTargetSpeed = r127;
        this.mNavigatorActualSpeed = r128;
        this.mNavigatorDifferenceSpeed = r129;
        this.mNavigatorStatusSpeed = r130;
        this.mMaxOxygenPower = r131;
        this.mTrendWeek = r132;
        this.mCyclingIndex = r133;
        this.mStaBalance = r134;
        this.mSwimSwolf = r135;
        this.mCntLap = r136;
        this.mFrontCrawlPerc = r137;
        this.mBreaststrokePerc = r138;
        this.mBackstrokePerc = r139;
        this.mButterflyPerc = r140;
        this.mSpmPathPointsCount = r141;
        this.mSpmPathPointsPoints = r142;
        this.mStepLenCount = r143;
        this.mStepLenPoints = r144;
        this.mEllipticalSteps = r145;
        this.mChildSwimStartTime = r146;
        this.mChildSwimDuration = r148;
        this.mChildSwimDistance = r149;
        this.mChildCyclingStartTime = r150;
        this.mChildCyclingDuration = r152;
        this.mChildCyclingDistance = r153;
        this.mChildRunStartTime = r154;
        this.mChildRunDuration = r156;
        this.mChildRunDistance = r157;
        this.mChildSwimMode = r158;
        this.mChildCyclingMode = r159;
        this.mChildRunMode = r160;
        this.mChildNumber = r161;
        this.mRunLactateAvg = r162;
        this.mCyclingLactateAvg = r163;
        this.mFlag = r164;
        this.mRecoveryHrCount = r165;
        this.mRecoveryHrPoints = r166;
        this.mSwimPoolLength = r167;
        this.mDeviceId = r168;
        this.mAICoachSportID = r169;
    }

    public /* synthetic */ Workout(int r131, long r132, long r134, String r136, int r137, int r138, int r139, int r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, int r149, int r150, int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, String r163, String r164, String r165, String r166, int r167, int r168, int r169, int r170, int r171, int r172, float r173, float r174, int r175, float r176, int r177, int r178, int r179, int[] r180, int[] r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, int r189, List r190, int r191, int r192, List r193, int r194, int r195, List r196, int r197, int r198, List r199, int r200, int r201, List r202, int r203, int r204, List r205, int r206, int r207, int r208, int r209, int r210, int r211, int r212, int r213, int r214, int r215, int r216, int r217, int r218, int r219, int r220, int r221, int r222, int r223, float r224, int r225, int r226, float r227, int[] r228, float[] r229, int r230, int r231, int r232, List r233, float r234, float r235, float r236, float r237, int r238, int r239, int r240, int r241, int r242, int r243, int r244, int r245, int r246, int r247, int r248, int r249, float r250, float r251, int r252, int r253, int r254, int r255, float r256, float[] r257, float[] r258, int r259, int r260, int r261, int r262, int r263, int r264, int r265, int r266, List r267, int r268, List r269, int r270, long r271, int r273, int r274, long r275, int r277, int r278, long r279, int r281, int r282, int r283, int r284, int r285, int r286, float r287, float r288, int r289, int r290, List r291, int r292, String r293, int r294, int r295, int r296, int r297, int r298, int r299, DefaultConstructorMarker r300) {
        if ((r295 & 1) == 0) goto L5;
        int r5 = 0;
    L7:
        if ((r295 & 2) == 0) goto L9;
        long r10 = 0;
    L11:
        if ((r295 & 4) == 0) goto L13;
        long r12 = 0;
    L14:
        String r14 = "";
        if ((r295 & 8) == 0) goto L17;
        String r7 = "";
    L19:
        if ((r295 & 16) == 0) goto L21;
        int r15 = 0;
    L23:
        if ((r295 & 32) == 0) goto L25;
        int r16 = 0;
    L27:
        if ((r295 & 64) == 0) goto L29;
        int r17 = 0;
    L31:
        if ((r295 & 128) == 0) goto L33;
        int r6 = 0;
    L35:
        if ((r295 & 256) == 0) goto L37;
        int r8 = 0;
    L39:
        if ((r295 & 512) == 0) goto L41;
        int r9 = 0;
    L42:
        int r133 = r5;
        if ((r295 & 1024) == 0) goto L45;
        int r11 = 0;
    L46:
        int r135 = r11;
        if ((r295 & 2048) == 0) goto L49;
        int r13 = 0;
    L50:
        int r1310 = r13;
        if ((r295 & 4096) == 0) goto L53;
        int r18 = 0;
    L54:
        int r1311 = r18;
        if ((r295 & 8192) == 0) goto L57;
        int r19 = 0;
    L58:
        int r1312 = r19;
        if ((r295 & 16384) == 0) goto L61;
        int r20 = 0;
    L63:
        if ((r295 & 32768) == 0) goto L65;
        int r21 = 0;
    L67:
        if ((r295 & 65536) == 0) goto L69;
        int r23 = 0;
    L71:
        if ((r295 & 131072) == 0) goto L73;
        int r24 = 0;
    L75:
        if ((r295 & 262144) == 0) goto L77;
        int r25 = 0;
    L79:
        if ((r295 & 524288) == 0) goto L81;
        int r26 = 0;
    L83:
        if ((r295 & 1048576) == 0) goto L85;
        int r27 = 0;
    L87:
        if ((r295 & 2097152) == 0) goto L89;
        int r28 = 0;
    L91:
        if ((r295 & 4194304) == 0) goto L93;
        int r29 = 0;
    L95:
        if ((r295 & 8388608) == 0) goto L97;
        int r30 = 0;
    L99:
        if ((r295 & 16777216) == 0) goto L101;
        int r31 = 0;
    L103:
        if ((r295 & 33554432) == 0) goto L105;
        int r32 = 0;
    L107:
        if ((r295 & 67108864) == 0) goto L109;
        int r33 = 0;
    L111:
        if ((r295 & 134217728) == 0) goto L113;
        int r34 = 0;
    L115:
        if ((r295 & 268435456) == 0) goto L117;
        int r35 = 0;
    L119:
        if ((r295 & 536870912) == 0) goto L121;
        int r36 = 0;
    L123:
        if ((r295 & 1073741824) == 0) goto L125;
        String r37 = "";
    L127:
        if ((r295 & Integer.MIN_VALUE) == 0) goto L129;
        String r0 = "";
    L131:
        if ((r296 & 1) == 0) goto L133;
        String r38 = "";
    L135:
        if ((r296 & 2) == 0) goto L137;
        String r39 = "";
    L139:
        if ((r296 & 4) == 0) goto L141;
        int r40 = 0;
    L143:
        if ((r296 & 8) == 0) goto L145;
        int r41 = 0;
    L147:
        if ((r296 & 16) == 0) goto L149;
        int r42 = 0;
    L151:
        if ((r296 & 32) == 0) goto L153;
        int r43 = 99;
    L155:
        if ((r296 & 64) == 0) goto L157;
        int r44 = 0;
    L158:
        String r1313 = r0;
        if ((r296 & 128) == 0) goto L161;
        int r1 = 0;
    L162:
        int r1314 = r1;
        float r45 = 0.0f;
        if ((r296 & 256) == 0) goto L165;
        float r2 = 0.0f;
    L166:
        float r1315 = r2;
        if ((r296 & 512) == 0) goto L169;
        float r3 = 0.0f;
    L170:
        float r1316 = r3;
        if ((r296 & 1024) == 0) goto L173;
        int r4 = 0;
    L174:
        int r1410 = r4;
        if ((r296 & 2048) == 0) goto L177;
        float r22 = 0.0f;
    L178:
        float r1411 = r22;
        if ((r296 & 4096) == 0) goto L181;
        int r46 = 0;
    L182:
        int r1412 = r46;
        if ((r296 & 8192) == 0) goto L185;
        int r47 = 0;
    L186:
        int r1413 = r47;
        if ((r296 & 16384) == 0) goto L189;
        int r48 = 0;
    L190:
        List r49 = null;
        if ((r296 & 32768) == 0) goto L193;
        int[] r410 = null;
    L195:
        if ((r296 & 65536) == 0) goto L197;
        int[] r411 = null;
    L199:
        if ((r296 & 131072) == 0) goto L201;
        int r412 = 0;
    L203:
        if ((r296 & 262144) == 0) goto L205;
        int r50 = 0;
    L207:
        if ((r296 & 524288) == 0) goto L209;
        int r51 = 0;
    L211:
        if ((r296 & 1048576) == 0) goto L213;
        int r52 = 0;
    L215:
        if ((r296 & 2097152) == 0) goto L217;
        int r53 = 0;
    L219:
        if ((r296 & 4194304) == 0) goto L221;
        int r54 = 0;
    L223:
        if ((r296 & 8388608) == 0) goto L225;
        int r55 = 0;
    L227:
        if ((r296 & 16777216) == 0) goto L229;
        int r56 = 0;
    L231:
        if ((r296 & 33554432) == 0) goto L233;
        List r57 = null;
    L235:
        if ((r296 & 67108864) == 0) goto L237;
        int r58 = 0;
    L239:
        if ((r296 & 134217728) == 0) goto L241;
        int r59 = 0;
    L243:
        if ((r296 & 268435456) == 0) goto L245;
        List r60 = null;
    L247:
        if ((r296 & 536870912) == 0) goto L249;
        int r61 = 0;
    L251:
        if ((r296 & 1073741824) == 0) goto L253;
        int r62 = 0;
    L255:
        if ((r296 & Integer.MIN_VALUE) == 0) goto L257;
        List r63 = null;
    L259:
        if ((r297 & 1) == 0) goto L261;
        int r64 = 0;
    L263:
        if ((r297 & 2) == 0) goto L265;
        int r65 = 0;
    L267:
        if ((r297 & 4) == 0) goto L269;
        List r66 = null;
    L271:
        if ((r297 & 8) == 0) goto L273;
        int r67 = 0;
    L275:
        if ((r297 & 16) == 0) goto L277;
        int r68 = 0;
    L279:
        if ((r297 & 32) == 0) goto L281;
        List r69 = null;
    L283:
        if ((r297 & 64) == 0) goto L285;
        int r610 = 0;
    L286:
        int r1414 = r48;
        if ((r297 & 128) == 0) goto L289;
        int r70 = 0;
    L290:
        int r1415 = r70;
        if ((r297 & 256) == 0) goto L293;
        List r71 = null;
    L294:
        List r1416 = r71;
        if ((r297 & 512) == 0) goto L297;
        int r72 = 0;
    L298:
        int r1417 = r72;
        if ((r297 & 1024) == 0) goto L301;
        int r73 = 0;
    L302:
        int r1418 = r73;
        if ((r297 & 2048) == 0) goto L305;
        int r74 = 0;
    L306:
        int r1419 = r74;
        if ((r297 & 4096) == 0) goto L309;
        int r75 = 0;
    L310:
        int r1510 = r75;
        if ((r297 & 8192) == 0) goto L313;
        int r76 = 0;
    L314:
        int r1511 = r76;
        if ((r297 & 16384) == 0) goto L317;
        int r77 = 0;
    L319:
        if ((r297 & 32768) == 0) goto L321;
        int r78 = 0;
    L323:
        if ((r297 & 65536) == 0) goto L325;
        int r79 = 0;
    L327:
        if ((r297 & 131072) == 0) goto L329;
        int r710 = 0;
    L331:
        if ((r297 & 262144) == 0) goto L333;
        int r711 = 0;
    L335:
        if ((r297 & 524288) == 0) goto L337;
        int r712 = 0;
    L339:
        if ((r297 & 1048576) == 0) goto L341;
        int r713 = 0;
    L343:
        if ((r297 & 2097152) == 0) goto L345;
        int r714 = 0;
    L347:
        if ((r297 & 4194304) == 0) goto L349;
        int r715 = 0;
    L351:
        if ((r297 & 8388608) == 0) goto L353;
        int r716 = 0;
    L355:
        if ((r297 & 16777216) == 0) goto L357;
        int r717 = 0;
    L359:
        if ((r297 & 33554432) == 0) goto L361;
        int r80 = 0;
    L363:
        if ((r297 & 67108864) == 0) goto L365;
        int r81 = 0;
    L367:
        if ((r297 & 134217728) == 0) goto L369;
        float r82 = 0.0f;
    L371:
        if ((r297 & 268435456) == 0) goto L373;
        int r83 = 0;
    L375:
        if ((r297 & 536870912) == 0) goto L377;
        int r84 = 0;
    L379:
        if ((r297 & 1073741824) == 0) goto L381;
        float r85 = 0.0f;
    L383:
        if ((r297 & Integer.MIN_VALUE) == 0) goto L385;
        int[] r86 = null;
    L387:
        if ((r298 & 1) == 0) goto L389;
        float[] r87 = null;
    L391:
        if ((r298 & 2) == 0) goto L393;
        int r88 = 0;
    L395:
        if ((r298 & 4) == 0) goto L397;
        int r89 = 0;
    L399:
        if ((r298 & 8) == 0) goto L401;
        int r810 = 0;
    L403:
        if ((r298 & 16) == 0) goto L405;
        List r90 = null;
    L407:
        if ((r298 & 32) == 0) goto L409;
        float r91 = 0.0f;
    L411:
        if ((r298 & 64) == 0) goto L413;
        float r92 = 0.0f;
    L414:
        int r1512 = r77;
        if ((r298 & 128) == 0) goto L417;
        float r93 = 0.0f;
    L418:
        float r1513 = r93;
        if ((r298 & 256) == 0) goto L421;
        float r94 = 0.0f;
    L422:
        float r1514 = r94;
        if ((r298 & 512) == 0) goto L425;
        int r95 = 0;
    L426:
        int r1515 = r95;
        if ((r298 & 1024) == 0) goto L429;
        int r96 = 0;
    L430:
        int r1516 = r96;
        if ((r298 & 2048) == 0) goto L433;
        int r97 = 0;
    L434:
        int r1517 = r97;
        if ((r298 & 4096) == 0) goto L437;
        int r98 = -1;
    L438:
        int r1518 = r98;
        if ((r298 & 8192) == 0) goto L441;
        int r99 = 0;
    L442:
        int r1519 = r99;
        if ((r298 & 16384) == 0) goto L445;
        int r100 = 0;
    L447:
        if ((r298 & 32768) == 0) goto L449;
        int r910 = 0;
    L451:
        if ((r298 & 65536) == 0) goto L453;
        int r911 = -1;
    L455:
        if ((r298 & 131072) == 0) goto L457;
        int r912 = 0;
    L459:
        if ((r298 & 262144) == 0) goto L461;
        int r913 = 0;
    L463:
        if ((r298 & 524288) == 0) goto L465;
        int r914 = 0;
    L467:
        if ((r298 & 1048576) == 0) goto L469;
        int r915 = -1;
    L471:
        if ((r298 & 2097152) == 0) goto L473;
        float r916 = 0.0f;
    L475:
        if ((r298 & 4194304) == 0) goto L477;
        float r101 = 0.0f;
    L479:
        if ((r298 & 8388608) == 0) goto L481;
        int r102 = 0;
    L483:
        if ((r298 & 16777216) == 0) goto L485;
        int r103 = 0;
    L487:
        if ((r298 & 33554432) == 0) goto L489;
        int r104 = 0;
    L491:
        if ((r298 & 67108864) == 0) goto L493;
        int r105 = -1;
    L495:
        if ((r298 & 134217728) == 0) goto L497;
        float r106 = 0.0f;
    L499:
        if ((r298 & 268435456) == 0) goto L501;
        float[] r107 = null;
    L503:
        if ((r298 & 536870912) == 0) goto L505;
        float[] r108 = null;
    L507:
        if ((r298 & 1073741824) == 0) goto L509;
        int r109 = 0;
    L511:
        if ((r298 & Integer.MIN_VALUE) == 0) goto L513;
        int r110 = 0;
    L515:
        if ((r299 & 1) == 0) goto L517;
        int r1010 = 0;
    L519:
        if ((r299 & 2) == 0) goto L521;
        int r111 = 0;
    L523:
        if ((r299 & 4) == 0) goto L525;
        int r112 = 0;
    L527:
        if ((r299 & 8) == 0) goto L529;
        int r113 = 0;
    L531:
        if ((r299 & 16) == 0) goto L533;
        int r114 = 0;
    L535:
        if ((r299 & 32) == 0) goto L537;
        int r115 = 0;
    L539:
        if ((r299 & 64) == 0) goto L541;
        List r116 = null;
    L542:
        int r1610 = r100;
        if ((r299 & 128) == 0) goto L545;
        int r117 = 0;
    L546:
        int r1611 = r117;
        if ((r299 & 256) == 0) goto L549;
        List r118 = null;
    L550:
        List r1612 = r118;
        if ((r299 & 512) == 0) goto L553;
        int r119 = 0;
    L554:
        int r1613 = r119;
        if ((r299 & 1024) == 0) goto L557;
        long r1110 = 0;
    L559:
        if ((r299 & 2048) == 0) goto L561;
        int r120 = 0;
    L562:
        int r1614 = r120;
        if ((r299 & 4096) == 0) goto L565;
        int r121 = 0;
    L566:
        int r1615 = r121;
        if ((r299 & 8192) == 0) goto L569;
        long r1111 = 0;
    L571:
        if ((r299 & 16384) == 0) goto L573;
        int r122 = 0;
    L575:
        if ((r299 & 32768) == 0) goto L577;
        int r272 = 0;
    L579:
        if ((r299 & 65536) == 0) goto L581;
        long r123 = 0;
    L583:
        if ((r299 & 131072) == 0) goto L585;
        int r276 = 0;
    L587:
        if ((r299 & 262144) == 0) goto L589;
        int r124 = 0;
    L591:
        if ((r299 & 524288) == 0) goto L593;
        int r125 = 0;
    L595:
        if ((r299 & 1048576) == 0) goto L597;
        int r126 = 0;
    L599:
        if ((r299 & 2097152) == 0) goto L601;
        int r127 = 0;
    L603:
        if ((r299 & 4194304) == 0) goto L605;
        int r128 = 0;
    L607:
        if ((r299 & 8388608) == 0) goto L609;
        float r129 = 0.0f;
    L611:
        if ((r299 & 16777216) != 0) goto L615;
        r45 = r288;
    L615:
        if ((r299 & 33554432) == 0) goto L617;
        int r1210 = 0;
    L619:
        if ((r299 & 67108864) == 0) goto L621;
        int r1211 = 0;
    L623:
        if ((r299 & 134217728) != 0) goto L627;
        r49 = r291;
    L627:
        if ((r299 & 268435456) == 0) goto L629;
        int r1212 = 0;
    L631:
        if ((r299 & 536870912) != 0) goto L635;
        r14 = r293;
    L635:
        if ((r299 & 1073741824) == 0) goto L638;
        int r2910 = -1;
    L639:
        this(r133, r10, r12, r7, r15, r16, r17, r6, r8, r9, r135, r1310, r1311, r1312, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r1313, r38, r39, r40, r41, r42, r43, r44, r1314, r1315, r1316, r1410, r1411, r1412, r1413, r1414, r410, r411, r412, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r610, r1415, r1416, r1417, r1418, r1419, r1510, r1511, r1512, r78, r79, r710, r711, r712, r713, r714, r715, r716, r717, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r810, r90, r91, r92, r1513, r1514, r1515, r1516, r1517, r1518, r1519, r1610, r910, r911, r912, r913, r914, r915, r916, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r1010, r111, r112, r113, r114, r115, r116, r1611, r1612, r1613, r1110, r1614, r1615, r1111, r122, r272, r123, r276, r124, r125, r126, r127, r128, r129, r45, r1210, r1211, r49, r1212, r14, r2910);
        return;
    L638:
        r2910 = r294;
        goto L639
    L629:
        r1212 = r292;
        goto L631
    L621:
        r1211 = r290;
        goto L623
    L617:
        r1210 = r289;
        goto L619
    L609:
        r129 = r287;
        goto L611
    L605:
        r128 = r286;
        goto L607
    L601:
        r127 = r285;
        goto L603
    L597:
        r126 = r284;
        goto L599
    L593:
        r125 = r283;
        goto L595
    L589:
        r124 = r282;
        goto L591
    L585:
        r276 = r281;
        goto L587
    L581:
        r123 = r279;
        goto L583
    L577:
        r272 = r278;
        goto L579
    L573:
        r122 = r277;
        goto L575
    L569:
        r1111 = r275;
        goto L571
    L565:
        r121 = r274;
        goto L566
    L561:
        r120 = r273;
        goto L562
    L557:
        r1110 = r271;
        goto L559
    L553:
        r119 = r270;
        goto L554
    L549:
        r118 = r269;
        goto L550
    L545:
        r117 = r268;
        goto L546
    L541:
        r116 = r267;
        goto L542
    L537:
        r115 = r266;
        goto L539
    L533:
        r114 = r265;
        goto L535
    L529:
        r113 = r264;
        goto L531
    L525:
        r112 = r263;
        goto L527
    L521:
        r111 = r262;
        goto L523
    L517:
        r1010 = r261;
        goto L519
    L513:
        r110 = r260;
        goto L515
    L509:
        r109 = r259;
        goto L511
    L505:
        r108 = r258;
        goto L507
    L501:
        r107 = r257;
        goto L503
    L497:
        r106 = r256;
        goto L499
    L493:
        r105 = r255;
        goto L495
    L489:
        r104 = r254;
        goto L491
    L485:
        r103 = r253;
        goto L487
    L481:
        r102 = r252;
        goto L483
    L477:
        r101 = r251;
        goto L479
    L473:
        r916 = r250;
        goto L475
    L469:
        r915 = r249;
        goto L471
    L465:
        r914 = r248;
        goto L467
    L461:
        r913 = r247;
        goto L463
    L457:
        r912 = r246;
        goto L459
    L453:
        r911 = r245;
        goto L455
    L449:
        r910 = r244;
        goto L451
    L445:
        r100 = r243;
        goto L447
    L441:
        r99 = r242;
        goto L442
    L437:
        r98 = r241;
        goto L438
    L433:
        r97 = r240;
        goto L434
    L429:
        r96 = r239;
        goto L430
    L425:
        r95 = r238;
        goto L426
    L421:
        r94 = r237;
        goto L422
    L417:
        r93 = r236;
        goto L418
    L413:
        r92 = r235;
        goto L414
    L409:
        r91 = r234;
        goto L411
    L405:
        r90 = r233;
        goto L407
    L401:
        r810 = r232;
        goto L403
    L397:
        r89 = r231;
        goto L399
    L393:
        r88 = r230;
        goto L395
    L389:
        r87 = r229;
        goto L391
    L385:
        r86 = r228;
        goto L387
    L381:
        r85 = r227;
        goto L383
    L377:
        r84 = r226;
        goto L379
    L373:
        r83 = r225;
        goto L375
    L369:
        r82 = r224;
        goto L371
    L365:
        r81 = r223;
        goto L367
    L361:
        r80 = r222;
        goto L363
    L357:
        r717 = r221;
        goto L359
    L353:
        r716 = r220;
        goto L355
    L349:
        r715 = r219;
        goto L351
    L345:
        r714 = r218;
        goto L347
    L341:
        r713 = r217;
        goto L343
    L337:
        r712 = r216;
        goto L339
    L333:
        r711 = r215;
        goto L335
    L329:
        r710 = r214;
        goto L331
    L325:
        r79 = r213;
        goto L327
    L321:
        r78 = r212;
        goto L323
    L317:
        r77 = r211;
        goto L319
    L313:
        r76 = r210;
        goto L314
    L309:
        r75 = r209;
        goto L310
    L305:
        r74 = r208;
        goto L306
    L301:
        r73 = r207;
        goto L302
    L297:
        r72 = r206;
        goto L298
    L293:
        r71 = r205;
        goto L294
    L289:
        r70 = r204;
        goto L290
    L285:
        r610 = r203;
        goto L286
    L281:
        r69 = r202;
        goto L283
    L277:
        r68 = r201;
        goto L279
    L273:
        r67 = r200;
        goto L275
    L269:
        r66 = r199;
        goto L271
    L265:
        r65 = r198;
        goto L267
    L261:
        r64 = r197;
        goto L263
    L257:
        r63 = r196;
        goto L259
    L253:
        r62 = r195;
        goto L255
    L249:
        r61 = r194;
        goto L251
    L245:
        r60 = r193;
        goto L247
    L241:
        r59 = r192;
        goto L243
    L237:
        r58 = r191;
        goto L239
    L233:
        r57 = r190;
        goto L235
    L229:
        r56 = r189;
        goto L231
    L225:
        r55 = r188;
        goto L227
    L221:
        r54 = r187;
        goto L223
    L217:
        r53 = r186;
        goto L219
    L213:
        r52 = r185;
        goto L215
    L209:
        r51 = r184;
        goto L211
    L205:
        r50 = r183;
        goto L207
    L201:
        r412 = r182;
        goto L203
    L197:
        r411 = r181;
        goto L199
    L193:
        r410 = r180;
        goto L195
    L189:
        r48 = r179;
        goto L190
    L185:
        r47 = r178;
        goto L186
    L181:
        r46 = r177;
        goto L182
    L177:
        r22 = r176;
        goto L178
    L173:
        r4 = r175;
        goto L174
    L169:
        r3 = r174;
        goto L170
    L165:
        r2 = r173;
        goto L166
    L161:
        r1 = r172;
        goto L162
    L157:
        r44 = r171;
        goto L158
    L153:
        r43 = r170;
        goto L155
    L149:
        r42 = r169;
        goto L151
    L145:
        r41 = r168;
        goto L147
    L141:
        r40 = r167;
        goto L143
    L137:
        r39 = r166;
        goto L139
    L133:
        r38 = r165;
        goto L135
    L129:
        r0 = r164;
        goto L131
    L125:
        r37 = r163;
        goto L127
    L121:
        r36 = r162;
        goto L123
    L117:
        r35 = r161;
        goto L119
    L113:
        r34 = r160;
        goto L115
    L109:
        r33 = r159;
        goto L111
    L105:
        r32 = r158;
        goto L107
    L101:
        r31 = r157;
        goto L103
    L97:
        r30 = r156;
        goto L99
    L93:
        r29 = r155;
        goto L95
    L89:
        r28 = r154;
        goto L91
    L85:
        r27 = r153;
        goto L87
    L81:
        r26 = r152;
        goto L83
    L77:
        r25 = r151;
        goto L79
    L73:
        r24 = r150;
        goto L75
    L69:
        r23 = r149;
        goto L71
    L65:
        r21 = r148;
        goto L67
    L61:
        r20 = r147;
        goto L63
    L57:
        r19 = r146;
        goto L58
    L53:
        r18 = r145;
        goto L54
    L49:
        r13 = r144;
        goto L50
    L45:
        r11 = r143;
        goto L46
    L41:
        r9 = r142;
        goto L42
    L37:
        r8 = r141;
        goto L39
    L33:
        r6 = r140;
        goto L35
    L29:
        r17 = r139;
        goto L31
    L25:
        r16 = r138;
        goto L27
    L21:
        r15 = r137;
        goto L23
    L17:
        r7 = r136;
        goto L19
    L13:
        r12 = r134;
        goto L14
    L9:
        r10 = r132;
        goto L11
    L5:
        r5 = r131;
        goto L7
    }

    public Workout(@aa1 BleWorkout r179, long r180) {
        Intrinsics.X0O(r179, "bleWorkout");
        int r8 = 0;
        String r13 = null;
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
        int r39 = 0;
        String r40 = null;
        String r41 = null;
        String r42 = null;
        String r43 = null;
        int r44 = 0;
        int r45 = 0;
        int r46 = 0;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        float r50 = 0.0f;
        float r51 = 0.0f;
        int r52 = 0;
        float r53 = 0.0f;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int[] r57 = null;
        int[] r58 = null;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
        int r62 = 0;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        List r67 = null;
        int r68 = 0;
        int r69 = 0;
        List r70 = null;
        int r71 = 0;
        int r72 = 0;
        List r73 = null;
        int r74 = 0;
        int r75 = 0;
        List r76 = null;
        int r77 = 0;
        int r78 = 0;
        List r79 = null;
        int r80 = 0;
        int r81 = 0;
        List r82 = null;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        int r88 = 0;
        int r89 = 0;
        int r90 = 0;
        int r91 = 0;
        int r92 = 0;
        int r93 = 0;
        int r94 = 0;
        int r95 = 0;
        int r96 = 0;
        int r97 = 0;
        int r98 = 0;
        int r99 = 0;
        int r100 = 0;
        float r101 = 0.0f;
        int r102 = 0;
        int r103 = 0;
        float r104 = 0.0f;
        int[] r105 = null;
        float[] r106 = null;
        int r107 = 0;
        int r108 = 0;
        int r109 = 0;
        List r110 = null;
        float r111 = 0.0f;
        float r112 = 0.0f;
        float r113 = 0.0f;
        float r114 = 0.0f;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        int r126 = 0;
        float r127 = 0.0f;
        float r128 = 0.0f;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        float r133 = 0.0f;
        float[] r134 = null;
        float[] r135 = null;
        int r136 = 0;
        int r137 = 0;
        int r138 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        List r144 = null;
        int r145 = 0;
        List r146 = null;
        int r147 = 0;
        long r148 = 0;
        int r150 = 0;
        int r151 = 0;
        long r152 = 0;
        int r154 = 0;
        int r155 = 0;
        long r156 = 0;
        int r158 = 0;
        int r159 = 0;
        int r160 = 0;
        int r161 = 0;
        int r162 = 0;
        int r163 = 0;
        float r164 = 0.0f;
        float r165 = 0.0f;
        int r166 = 0;
        int r167 = 0;
        List r168 = null;
        int r169 = 0;
        String r170 = null;
        int r171 = 0;
        int r172 = -65527;
        int r173 = -1;
        int r174 = -1;
        int r175 = -1;
        this(r8, (((long) (r179.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, (((long) (r179.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r13, r179.getMDuration(), r179.getMAltitude(), r179.getMAirPressure(), r179.getMSpm(), r179.getMMode(), r179.getMStep(), r179.getMDistance(), r179.getMCalorie(), r179.getMSpeed(), r179.getMPace(), r179.getMAvgBpm(), r179.getMMaxBpm(), r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r150, r151, r152, r154, r155, r156, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, Integer.MAX_VALUE, null);
    }

    public Workout(@aa1 BleWorkout2 r179, long r180) {
        Intrinsics.X0O(r179, "bleWorkout");
        int r8 = 0;
        String r13 = null;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        String r40 = null;
        String r41 = null;
        String r42 = null;
        String r43 = null;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        float r50 = 0.0f;
        float r51 = 0.0f;
        int r52 = 0;
        float r53 = 0.0f;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int[] r57 = null;
        int[] r58 = null;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
        int r62 = 0;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        List r67 = null;
        int r68 = 0;
        int r69 = 0;
        List r70 = null;
        int r71 = 0;
        int r72 = 0;
        List r73 = null;
        int r74 = 0;
        int r75 = 0;
        List r76 = null;
        int r77 = 0;
        int r78 = 0;
        List r79 = null;
        int r80 = 0;
        List r82 = null;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        int r88 = 0;
        int r89 = 0;
        int r90 = 0;
        int r91 = 0;
        int r92 = 0;
        int r93 = 0;
        int r94 = 0;
        int r95 = 0;
        int r96 = 0;
        int r97 = 0;
        int r98 = 0;
        int r99 = 0;
        int r100 = 0;
        float r101 = 0.0f;
        int r102 = 0;
        int r103 = 0;
        float r104 = 0.0f;
        int[] r105 = null;
        float[] r106 = null;
        int r107 = 0;
        int r108 = 0;
        int r109 = 0;
        List r110 = null;
        float r111 = 0.0f;
        float r112 = 0.0f;
        float r113 = 0.0f;
        float r114 = 0.0f;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        int r126 = 0;
        float r127 = 0.0f;
        float r128 = 0.0f;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        float r133 = 0.0f;
        float[] r134 = null;
        float[] r135 = null;
        int r136 = 0;
        int r137 = 0;
        int r138 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        List r144 = null;
        int r145 = 0;
        List r146 = null;
        int r147 = 0;
        long r148 = 0;
        int r150 = 0;
        int r151 = 0;
        long r152 = 0;
        int r154 = 0;
        int r155 = 0;
        long r156 = 0;
        int r158 = 0;
        int r159 = 0;
        int r160 = 0;
        int r161 = 0;
        int r162 = 0;
        int r163 = 0;
        float r164 = 0.0f;
        float r165 = 0.0f;
        int r166 = 0;
        int r167 = 0;
        List r168 = null;
        int r169 = 0;
        String r170 = null;
        int r171 = 0;
        int r172 = -67108855;
        int r173 = -29;
        int r174 = ErrorCode.ERR_ENC_FAILURE;
        int r175 = -1;
        this(r8, (((long) (r179.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, (((long) (r179.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r13, r179.getMDuration(), r179.getMAltitude(), r179.getMAirPressure(), r179.getMSpm(), r179.getMMode(), r179.getMStep(), r179.getMDistance(), r179.getMCalorie(), r179.getMSpeed(), r179.getMPace(), r179.getMAvgBpm(), r179.getMMaxBpm(), r179.getMMinBpm(), r179.getMMaxSpm(), r179.getMMinSpm(), r179.getMMaxPace(), r179.getMMinPace(), r179.getMMaxAltitude(), r179.getMMinAltitude(), r179.getMMinStress(), r179.getMMaxStress(), r179.getMAvgStress(), r36, r37, r38, r39, r40, r41, r42, r43, r179.getMMaxSpeed(), r179.getMMinSpeed(), r179.getMRestDuration(), r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r179.getMAltitudeclimb(), r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r150, r151, r152, r154, r155, r156, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, Integer.MAX_VALUE, null);
    }

    public Workout(@aa1 BleWorkout3 r179, long r180) {
        Intrinsics.X0O(r179, "bleWorkout");
        int r8 = 0;
        String r13 = null;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        String r40 = null;
        String r41 = null;
        String r42 = null;
        String r43 = null;
        int r46 = 0;
        int r47 = 0;
        int r48 = 1;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        int r88 = 0;
        int r89 = 0;
        int r90 = 0;
        int r91 = 0;
        int r92 = 0;
        int r93 = 0;
        int r94 = 0;
        int r95 = 0;
        int r96 = 0;
        int r97 = 0;
        int r98 = 0;
        int r99 = 0;
        int r100 = 0;
        float r101 = 0.0f;
        int r102 = 0;
        int r103 = 0;
        float r104 = 0.0f;
        int[] r105 = null;
        float[] r106 = null;
        int r107 = 0;
        int r108 = 0;
        int r109 = 0;
        List r110 = null;
        float r111 = 0.0f;
        float r112 = 0.0f;
        float r113 = 0.0f;
        float r114 = 0.0f;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        int r126 = 0;
        float r127 = 0.0f;
        float r128 = 0.0f;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        float r133 = 0.0f;
        float[] r134 = null;
        float[] r135 = null;
        int r136 = 0;
        int r137 = 0;
        int r138 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        List r144 = null;
        int r145 = 0;
        List r146 = null;
        int r147 = 0;
        long r148 = 0;
        int r150 = 0;
        int r151 = 0;
        long r152 = 0;
        int r154 = 0;
        int r155 = 0;
        long r156 = 0;
        int r158 = 0;
        int r159 = 0;
        int r160 = 0;
        int r161 = 0;
        int r162 = 0;
        int r163 = 0;
        float r164 = 0.0f;
        float r165 = 0.0f;
        int r166 = 0;
        int r167 = 0;
        List r168 = null;
        int r169 = 0;
        String r170 = null;
        int r171 = 0;
        int r172 = -67108855;
        int r173 = 51;
        int r174 = WorkInfo.STOP_REASON_UNKNOWN;
        int r175 = -1;
        this(r8, (((long) (r179.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, (((long) (r179.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r13, r179.getMDuration(), r179.getMAltitude(), r179.getMAirPressure(), r179.getMSpm(), r179.getMMode(), r179.getMStep(), r179.getMDistance(), r179.getMCalorie(), r179.getMSpeed(), r179.getMPace(), r179.getMAvgBpm(), r179.getMMaxBpm(), r179.getMMinBpm(), r179.getMMaxSpm(), r179.getMMinSpm(), r179.getMMaxPace(), r179.getMMinPace(), r179.getMMaxAltitude(), r179.getMMinAltitude(), r179.getMMinStress(), r179.getMMaxStress(), r179.getMAvgStress(), r36, r37, r38, r39, r40, r41, r42, r43, r179.getMMaxSpeed(), r179.getMMinSpeed(), r46, r47, r48, r179.getMMetTotal(), r179.getMAerobic(), r179.getMAnaerobic(), r179.getMStamina(), r179.getMAvgSpeed(), r179.getMCadence(), r179.getMMaxCadence(), r179.getMCnt(), r179.getMBpmZoneCount(), r179.getMPersonalZone(), r179.getMLactateThresholdPace(), r179.getMRecoveryTime(), r179.getMTrainingLoad(), r179.getMMaxVO2(), r179.getMLactateThresholdHr(), r179.getMAlgorithmMarking(), r179.getMPathCount(), r179.getMPathSampleInterval(), r179.getMPathPoints(), r179.getMHrPathCount(), r179.getMHrPathSampleInterval(), r179.getMHrPathPoints(), r179.getMPacePathCount(), r179.getMPacePathSampleInterval(), r179.getMPacePathPoints(), r179.getMSpeedPathCount(), r179.getMSpeedPathSampleInterval(), r179.getMSpeedPathPoints(), r179.getMCadencePathCount(), r179.getMCadencePathSampleInterval(), r179.getMCadencePathPoints(), r179.getMAltitudePathCount(), r179.getMAltitudePathSampleInterval(), r179.getMAltitudePathPoints(), r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r150, r151, r152, r154, r155, r156, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, Integer.MAX_VALUE, null);
    }

    public Workout(@aa1 BleWorkout4 r179, long r180) {
        Intrinsics.X0O(r179, "bleWorkout");
        long r9 = (((long) (r179.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r180;
        long r11 = (((long) (r179.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - r180;
        int r14 = r179.getMDuration();
        int r15 = r179.getMAltitude();
        int r16 = r179.getMAirPressure();
        int r17 = r179.getMSpm();
        int r18 = r179.getMMode();
        int r19 = r179.getMStep();
        int r20 = r179.getMDistance();
        int r21 = r179.getMCalorie();
        float r3 = 1000;
        int r0 = (int) (r179.getMSpeed() * r3);
        int r23 = r179.getMPace();
        int r24 = r179.getMAvgBpm();
        int r25 = r179.getMMaxBpm();
        int r26 = r179.getMMinBpm();
        int r27 = r179.getMMaxSpm();
        int r28 = r179.getMMinSpm();
        int r29 = r179.getMMaxPace();
        int r30 = r179.getMMinPace();
        int r31 = r179.getMMaxAltitude();
        int r32 = r179.getMMinAltitude();
        int r33 = r179.getMMinStress();
        int r34 = r179.getMMaxStress();
        int r35 = r179.getMAvgStress();
        int r4 = (int) r179.getMMaxSpeed();
        int r7 = (int) (r179.getMMinSpeed() * r3);
        float r53 = r179.getMAvgSpeed() * r3;
        int r8 = (int) r179.getMMetTotal();
        float r50 = r179.getMAerobic();
        float r51 = r179.getMAnaerobic();
        int r13 = (int) r179.getMStamina();
        int r2 = (int) (r179.getMCadence() * r3);
        int r55 = r179.getMMaxCadence();
        int r56 = r179.getMCnt();
        int[] r57 = r179.getMBpmZoneCount();
        int[] r58 = r179.getMPersonalZone();
        int r59 = r179.getMLactateThresholdPace();
        int r60 = r179.getMRecoveryTime();
        int r61 = r179.getMTrainingLoad();
        int r62 = r179.getMMaxVO2();
        int r63 = r179.getMLactateThresholdHr();
        int r65 = r179.getMPathCount();
        int r66 = r179.getMPathSampleInterval();
        List<float[]> r67 = r179.getMPathPoints();
        int r68 = r179.getMHrPathCount();
        int r69 = r179.getMHrPathSampleInterval();
        List<Integer> r70 = r179.getMHrPathPoints();
        int r71 = r179.getMPacePathCount();
        int r72 = r179.getMPacePathSampleInterval();
        List<Integer> r73 = r179.getMPacePathPoints();
        int r74 = r179.getMSpeedPathCount();
        int r75 = r179.getMSpeedPathSampleInterval();
        List<Integer> r76 = r179.getMSpeedPathPoints();
        int r77 = r179.getMCadencePathCount();
        int r78 = r179.getMCadencePathSampleInterval();
        List<Integer> r79 = r179.getMCadencePathPoints();
        int r80 = r179.getMAltitudePathCount();
        int r81 = r179.getMAltitudePathSampleInterval();
        List<Integer> r82 = r179.getMAltitudePathPoints();
        int r86 = r179.getMPausedDuration();
        int r87 = r179.getMCurBpm();
        int r88 = r179.getMAscendAltitude();
        int r89 = r179.getMDescendAltitude();
        int r90 = r179.getMCurStress();
        int r91 = r179.getMSwimType();
        int r92 = r179.getMCntFore();
        int r93 = r179.getMCntBack();
        int r94 = r179.getMBackSwingTime();
        int r95 = r179.getMDownSwingTime();
        int r96 = r179.getMDribbleTime();
        int r97 = r179.getMTripCount();
        int r98 = r179.getMSessionCount();
        int r5 = (int) (100 * r179.getMVerticalOscillation());
        int r100 = r179.getMRunPowerWatt();
        float r101 = r179.getMStepLen();
        int r102 = r179.getMTrainingStatus();
        int r103 = r179.getMFitnessAge();
        int[] r105 = r179.getMBestRunTime();
        float[] r106 = r179.getMFitnessLevel();
        float r104 = r179.getMTlTrend();
        int r6 = (int) (r179.getMCalorieTotal() * r3);
        int r108 = r179.getMPowerCount();
        int r109 = r179.getMPowerInterval();
        List<Integer> r110 = r179.getMPowerPoints();
        float r111 = r179.getRealTimeAerobic();
        float r112 = r179.getRealTimeAnaerobic();
        float r113 = r179.getMFatTotal();
        float r114 = r179.getMCarboTotal();
        int r115 = r179.getMNavigatorTargetTime();
        int r116 = r179.getMNavigatorActualTime();
        int r117 = r179.getMNavigatorDifferenceTime();
        int r118 = r179.getMNavigatorStatusTime();
        int r119 = r179.getMNavigatorTargetDistance();
        int r120 = r179.getMNavigatorActualDistance();
        int r121 = r179.getMNavigatorDifferenceDistance();
        int r122 = r179.getMNavigatorStatusDistance();
        int r123 = r179.getMNavigatorTargetPace();
        int r124 = r179.getMNavigatorActualPace();
        int r125 = r179.getMNavigatorDifferencePace();
        int r126 = r179.getMNavigatorStatusPace();
        float r127 = r179.getMNavigatorTargetSpeed();
        float r128 = r179.getMNavigatorActualSpeed();
        int r131 = r179.getMNavigatorDifferenceSpeed();
        int r132 = r179.getMNavigatorStatusSpeed();
        float r133 = r179.getMMaxOxygenPower();
        float[] r134 = r179.getMTrendWeek();
        float[] r135 = r179.getMCyclingIndex();
        int r136 = r179.getMStaBalance();
        int r143 = r179.getMSpmPathPointsCount();
        List<Integer> r144 = r179.getMSpmPathPointsPoints();
        int r145 = r179.getMStepLenCount();
        List<Float> r146 = r179.getMStepLenPoints();
        int r10 = 0;
        String r129 = null;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        String r40 = null;
        String r41 = null;
        String r42 = null;
        String r43 = null;
        int r46 = 0;
        int r47 = 0;
        int r48 = 4;
        int r64 = 0;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r1210 = 0;
        int r130 = 0;
        this(r10, r9, r11, r129, r14, r15, r16, r17, r18, r19, r20, r21, r0, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r4, r7, r46, r47, r48, r8, r50, r51, r13, r53, r2, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r5, r100, r101, r102, r103, r104, r105, r106, r6, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r1210, r130, r131, r132, r133, r134, r135, r136, r179.getMSwimSwolf(), r179.getMCntLap(), r179.getMFrontCrawlPerc(), r179.getMBreaststrokePerc(), r179.getMBackstrokePerc(), r179.getMButterflyPerc(), r143, r144, r145, r146, r179.getMEllipticalSteps(), (((long) (r179.getMChildSwimStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r179.getMChildSwimDuration(), r179.getMChildSwimDistance(), (((long) (r179.getMChildCyclingStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r179.getMChildCyclingDuration(), r179.getMChildCyclingDistance(), (((long) (r179.getMChildRunStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r180, r179.getMChildRunDuration(), r179.getMChildRunDistance(), r179.getMChildSwimMode(), r179.getMChildCyclingMode(), r179.getMChildRunMode(), r179.getMChildNumber(), r179.getMRunLactateAvg(), r179.getMCyclingLactateAvg(), r179.getMWorkoutFlag(), r179.getMRecoveryHrCount(), r179.getMRecoveryHrPoints(), r179.getMSwimPoolLength(), null, r179.getMAICoachSportID(), -67108855, 4194355, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, 25165824, 536870912, null);
    }
}
