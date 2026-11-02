package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ni;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleWorkout3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1563#2:229\n1634#2,3:230\n*S KotlinDebug\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n*L\n217#1:229\n217#1:230,3\n*E\n"})
public final class BleWorkout3 extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2048;
    public static final int WORKOUT_MAX_POINT = 32;
    private float mAerobic;
    private int mAirPressure;
    private int mAlgorithmMarking;
    private int mAltitude;
    private int mAltitudePathCount;

    @aa1
    private List<Integer> mAltitudePathPoints;
    private int mAltitudePathSampleInterval;
    private float mAnaerobic;
    private int mAvgBpm;
    private float mAvgSpeed;
    private int mAvgStress;

    @aa1
    private int[] mBpmZoneCount;
    private int mCadence;
    private int mCadencePathCount;

    @aa1
    private List<Integer> mCadencePathPoints;
    private int mCadencePathSampleInterval;
    private int mCalorie;
    private int mCnt;
    private int mDistance;
    private int mDuration;
    private int mEnd;
    private int mHrPathCount;

    @aa1
    private List<Integer> mHrPathPoints;
    private int mHrPathSampleInterval;
    private int mLactateThresholdHr;
    private int mLactateThresholdPace;
    private int mMaxAltitude;
    private int mMaxBpm;
    private int mMaxCadence;
    private int mMaxPace;
    private int mMaxSpeed;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMaxVO2;
    private int mMetTotal;
    private int mMinAltitude;
    private int mMinBpm;
    private int mMinPace;
    private int mMinSpeed;
    private int mMinSpm;
    private int mMinStress;
    private int mMode;
    private int mPace;
    private int mPacePathCount;

    @aa1
    private List<Integer> mPacePathPoints;
    private int mPacePathSampleInterval;
    private int mPathCount;

    @aa1
    private List<float[]> mPathPoints;
    private int mPathSampleInterval;

    @aa1
    private int[] mPersonalZone;
    private int mRecoveryTime;
    private int mSpeed;
    private int mSpeedPathCount;

    @aa1
    private List<Integer> mSpeedPathPoints;
    private int mSpeedPathSampleInterval;
    private int mSpm;
    private int mStamina;
    private int mStart;
    private int mStep;
    private int mTrainingLoad;

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

    public BleWorkout3() {
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
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        float r28 = 0.0f;
        float r29 = 0.0f;
        int r30 = 0;
        float r31 = 0.0f;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int[] r35 = null;
        int[] r36 = null;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        int r40 = 0;
        int r41 = 0;
        int r42 = 0;
        int r43 = 0;
        int r44 = 0;
        List r45 = null;
        int r46 = 0;
        int r47 = 0;
        List r48 = null;
        int r49 = 0;
        int r50 = 0;
        List r51 = null;
        int r52 = 0;
        int r53 = 0;
        List r54 = null;
        int r55 = 0;
        int r56 = 0;
        List r57 = null;
        int r58 = 0;
        int r59 = 0;
        List r60 = null;
        int r61 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, ni.iOOX010X, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWorkout3 copy$default(BleWorkout3 r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, float r52, float r53, int r54, float r55, int r56, int r57, int r58, int[] r59, int[] r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, List r69, int r70, int r71, List r72, int r73, int r74, List r75, int r76, int r77, List r78, int r79, int r80, List r81, int r82, int r83, List r84, int r85, int r86, Object r87) {
        if ((r85 & 1) == 0) goto L5;
        int r3 = r24.mStart;
    L7:
        if ((r85 & 2) == 0) goto L9;
        int r4 = r24.mEnd;
    L11:
        if ((r85 & 4) == 0) goto L13;
        int r5 = r24.mDuration;
    L15:
        if ((r85 & 8) == 0) goto L17;
        int r6 = r24.mAltitude;
    L19:
        if ((r85 & 16) == 0) goto L21;
        int r7 = r24.mAirPressure;
    L23:
        if ((r85 & 32) == 0) goto L25;
        int r8 = r24.mSpm;
    L27:
        if ((r85 & 64) == 0) goto L29;
        int r9 = r24.mMode;
    L31:
        if ((r85 & 128) == 0) goto L33;
        int r10 = r24.mStep;
    L35:
        if ((r85 & 256) == 0) goto L37;
        int r11 = r24.mDistance;
    L39:
        if ((r85 & 512) == 0) goto L41;
        int r12 = r24.mCalorie;
    L43:
        if ((r85 & 1024) == 0) goto L45;
        int r13 = r24.mSpeed;
    L47:
        if ((r85 & 2048) == 0) goto L49;
        int r14 = r24.mPace;
    L51:
        if ((r85 & 4096) == 0) goto L53;
        int r15 = r24.mAvgBpm;
    L54:
        int r210 = r3;
        if ((r85 & 8192) == 0) goto L57;
        int r16 = r24.mMaxBpm;
    L58:
        int r211 = r16;
        if ((r85 & 16384) == 0) goto L61;
        int r17 = r24.mMinBpm;
    L63:
        if ((r85 & 32768) == 0) goto L65;
        int r1 = r24.mMaxSpm;
    L66:
        int r212 = r1;
        if ((r85 & 65536) == 0) goto L69;
        int r2 = r24.mMinSpm;
    L70:
        int r213 = r2;
        if ((r85 & 131072) == 0) goto L73;
        int r18 = r24.mMaxPace;
    L74:
        int r214 = r18;
        if ((r85 & 262144) == 0) goto L77;
        int r19 = r24.mMinPace;
    L78:
        int r310 = r19;
        if ((r85 & 524288) == 0) goto L81;
        int r20 = r24.mMaxAltitude;
    L82:
        int r311 = r20;
        if ((r85 & 1048576) == 0) goto L85;
        int r21 = r24.mMinAltitude;
    L86:
        int r312 = r21;
        if ((r85 & 2097152) == 0) goto L89;
        int r22 = r24.mMinStress;
    L90:
        int r313 = r22;
        if ((r85 & 4194304) == 0) goto L93;
        int r23 = r24.mMaxStress;
    L94:
        int r314 = r23;
        if ((r85 & 8388608) == 0) goto L97;
        int r88 = r24.mAvgStress;
    L98:
        int r315 = r88;
        if ((r85 & 16777216) == 0) goto L101;
        int r89 = r24.mMaxSpeed;
    L102:
        int r316 = r89;
        if ((r85 & 33554432) == 0) goto L105;
        int r90 = r24.mMinSpeed;
    L106:
        int r317 = r90;
        if ((r85 & 67108864) == 0) goto L109;
        int r91 = r24.mMetTotal;
    L110:
        int r318 = r91;
        if ((r85 & 134217728) == 0) goto L113;
        float r92 = r24.mAerobic;
    L114:
        float r319 = r92;
        if ((r85 & 268435456) == 0) goto L117;
        float r93 = r24.mAnaerobic;
    L118:
        float r410 = r93;
        if ((r85 & 536870912) == 0) goto L121;
        int r94 = r24.mStamina;
    L122:
        int r411 = r94;
        if ((r85 & 1073741824) == 0) goto L125;
        float r95 = r24.mAvgSpeed;
    L126:
        float r412 = r95;
        if ((r85 & Integer.MIN_VALUE) == 0) goto L129;
        int r96 = r24.mCadence;
    L130:
        int r413 = r96;
        if ((r86 & 1) == 0) goto L133;
        int r97 = r24.mMaxCadence;
    L134:
        int r414 = r97;
        if ((r86 & 2) == 0) goto L137;
        int r98 = r24.mCnt;
    L138:
        int r415 = r98;
        if ((r86 & 4) == 0) goto L141;
        int[] r99 = r24.mBpmZoneCount;
    L142:
        int[] r416 = r99;
        if ((r86 & 8) == 0) goto L145;
        int[] r100 = r24.mPersonalZone;
    L146:
        int[] r417 = r100;
        if ((r86 & 16) == 0) goto L149;
        int r101 = r24.mLactateThresholdPace;
    L150:
        int r418 = r101;
        if ((r86 & 32) == 0) goto L153;
        int r102 = r24.mRecoveryTime;
    L154:
        int r419 = r102;
        if ((r86 & 64) == 0) goto L157;
        int r103 = r24.mTrainingLoad;
    L158:
        int r510 = r103;
        if ((r86 & 128) == 0) goto L161;
        int r104 = r24.mMaxVO2;
    L162:
        int r511 = r104;
        if ((r86 & 256) == 0) goto L165;
        int r105 = r24.mLactateThresholdHr;
    L166:
        int r512 = r105;
        if ((r86 & 512) == 0) goto L169;
        int r106 = r24.mAlgorithmMarking;
    L170:
        int r513 = r106;
        if ((r86 & 1024) == 0) goto L173;
        int r107 = r24.mPathCount;
    L174:
        int r514 = r107;
        if ((r86 & 2048) == 0) goto L177;
        int r108 = r24.mPathSampleInterval;
    L178:
        int r515 = r108;
        if ((r86 & 4096) == 0) goto L181;
        List r109 = r24.mPathPoints;
    L182:
        List r516 = r109;
        if ((r86 & 8192) == 0) goto L185;
        int r110 = r24.mHrPathCount;
    L186:
        int r517 = r110;
        if ((r86 & 16384) == 0) goto L189;
        int r111 = r24.mHrPathSampleInterval;
    L190:
        int r518 = r111;
        if ((r86 & 32768) == 0) goto L193;
        List r112 = r24.mHrPathPoints;
    L194:
        List r519 = r112;
        if ((r86 & 65536) == 0) goto L197;
        int r113 = r24.mPacePathCount;
    L198:
        int r610 = r113;
        if ((r86 & 131072) == 0) goto L201;
        int r114 = r24.mPacePathSampleInterval;
    L202:
        int r611 = r114;
        if ((r86 & 262144) == 0) goto L205;
        List r115 = r24.mPacePathPoints;
    L206:
        List r612 = r115;
        if ((r86 & 524288) == 0) goto L209;
        int r116 = r24.mSpeedPathCount;
    L210:
        int r613 = r116;
        if ((r86 & 1048576) == 0) goto L213;
        int r117 = r24.mSpeedPathSampleInterval;
    L214:
        int r614 = r117;
        if ((r86 & 2097152) == 0) goto L217;
        List r118 = r24.mSpeedPathPoints;
    L218:
        List r615 = r118;
        if ((r86 & 4194304) == 0) goto L221;
        int r119 = r24.mCadencePathCount;
    L222:
        int r616 = r119;
        if ((r86 & 8388608) == 0) goto L225;
        int r120 = r24.mCadencePathSampleInterval;
    L226:
        int r617 = r120;
        if ((r86 & 16777216) == 0) goto L229;
        List r121 = r24.mCadencePathPoints;
    L230:
        List r618 = r121;
        if ((r86 & 33554432) == 0) goto L233;
        int r122 = r24.mAltitudePathCount;
    L234:
        int r619 = r122;
        if ((r86 & 67108864) == 0) goto L237;
        int r123 = r24.mAltitudePathSampleInterval;
    L239:
        if ((r86 & 134217728) == 0) goto L242;
        List r810 = r24.mAltitudePathPoints;
    L244:
        return r24.copy(r210, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r211, r17, r212, r213, r214, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r410, r411, r412, r413, r414, r415, r416, r417, r418, r419, r510, r511, r512, r513, r514, r515, r516, r517, r518, r519, r610, r611, r612, r613, r614, r615, r616, r617, r618, r619, r123, r810);
    L242:
        r810 = r84;
        goto L244
    L237:
        r123 = r83;
        goto L239
    L233:
        r122 = r82;
        goto L234
    L229:
        r121 = r81;
        goto L230
    L225:
        r120 = r80;
        goto L226
    L221:
        r119 = r79;
        goto L222
    L217:
        r118 = r78;
        goto L218
    L213:
        r117 = r77;
        goto L214
    L209:
        r116 = r76;
        goto L210
    L205:
        r115 = r75;
        goto L206
    L201:
        r114 = r74;
        goto L202
    L197:
        r113 = r73;
        goto L198
    L193:
        r112 = r72;
        goto L194
    L189:
        r111 = r71;
        goto L190
    L185:
        r110 = r70;
        goto L186
    L181:
        r109 = r69;
        goto L182
    L177:
        r108 = r68;
        goto L178
    L173:
        r107 = r67;
        goto L174
    L169:
        r106 = r66;
        goto L170
    L165:
        r105 = r65;
        goto L166
    L161:
        r104 = r64;
        goto L162
    L157:
        r103 = r63;
        goto L158
    L153:
        r102 = r62;
        goto L154
    L149:
        r101 = r61;
        goto L150
    L145:
        r100 = r60;
        goto L146
    L141:
        r99 = r59;
        goto L142
    L137:
        r98 = r58;
        goto L138
    L133:
        r97 = r57;
        goto L134
    L129:
        r96 = r56;
        goto L130
    L125:
        r95 = r55;
        goto L126
    L121:
        r94 = r54;
        goto L122
    L117:
        r93 = r53;
        goto L118
    L113:
        r92 = r52;
        goto L114
    L109:
        r91 = r51;
        goto L110
    L105:
        r90 = r50;
        goto L106
    L101:
        r89 = r49;
        goto L102
    L97:
        r88 = r48;
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
        r20 = r44;
        goto L82
    L77:
        r19 = r43;
        goto L78
    L73:
        r18 = r42;
        goto L74
    L69:
        r2 = r41;
        goto L70
    L65:
        r1 = r40;
        goto L66
    L61:
        r17 = r39;
        goto L63
    L57:
        r16 = r38;
        goto L58
    L53:
        r15 = r37;
        goto L54
    L49:
        r14 = r36;
        goto L51
    L45:
        r13 = r35;
        goto L47
    L41:
        r12 = r34;
        goto L43
    L37:
        r11 = r33;
        goto L39
    L33:
        r10 = r32;
        goto L35
    L29:
        r9 = r31;
        goto L31
    L25:
        r8 = r30;
        goto L27
    L21:
        r7 = r29;
        goto L23
    L17:
        r6 = r28;
        goto L19
    L13:
        r5 = r27;
        goto L15
    L9:
        r4 = r26;
        goto L11
    L5:
        r3 = r25;
        goto L7
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component10() {
        return this.mCalorie;
    }

    public final int component11() {
        return this.mSpeed;
    }

    public final int component12() {
        return this.mPace;
    }

    public final int component13() {
        return this.mAvgBpm;
    }

    public final int component14() {
        return this.mMaxBpm;
    }

    public final int component15() {
        return this.mMinBpm;
    }

    public final int component16() {
        return this.mMaxSpm;
    }

    public final int component17() {
        return this.mMinSpm;
    }

    public final int component18() {
        return this.mMaxPace;
    }

    public final int component19() {
        return this.mMinPace;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component20() {
        return this.mMaxAltitude;
    }

    public final int component21() {
        return this.mMinAltitude;
    }

    public final int component22() {
        return this.mMinStress;
    }

    public final int component23() {
        return this.mMaxStress;
    }

    public final int component24() {
        return this.mAvgStress;
    }

    public final int component25() {
        return this.mMaxSpeed;
    }

    public final int component26() {
        return this.mMinSpeed;
    }

    public final int component27() {
        return this.mMetTotal;
    }

    public final float component28() {
        return this.mAerobic;
    }

    public final float component29() {
        return this.mAnaerobic;
    }

    public final int component3() {
        return this.mDuration;
    }

    public final int component30() {
        return this.mStamina;
    }

    public final float component31() {
        return this.mAvgSpeed;
    }

    public final int component32() {
        return this.mCadence;
    }

    public final int component33() {
        return this.mMaxCadence;
    }

    public final int component34() {
        return this.mCnt;
    }

    @aa1
    public final int[] component35() {
        return this.mBpmZoneCount;
    }

    @aa1
    public final int[] component36() {
        return this.mPersonalZone;
    }

    public final int component37() {
        return this.mLactateThresholdPace;
    }

    public final int component38() {
        return this.mRecoveryTime;
    }

    public final int component39() {
        return this.mTrainingLoad;
    }

    public final int component4() {
        return this.mAltitude;
    }

    public final int component40() {
        return this.mMaxVO2;
    }

    public final int component41() {
        return this.mLactateThresholdHr;
    }

    public final int component42() {
        return this.mAlgorithmMarking;
    }

    public final int component43() {
        return this.mPathCount;
    }

    public final int component44() {
        return this.mPathSampleInterval;
    }

    @aa1
    public final List<float[]> component45() {
        return this.mPathPoints;
    }

    public final int component46() {
        return this.mHrPathCount;
    }

    public final int component47() {
        return this.mHrPathSampleInterval;
    }

    @aa1
    public final List<Integer> component48() {
        return this.mHrPathPoints;
    }

    public final int component49() {
        return this.mPacePathCount;
    }

    public final int component5() {
        return this.mAirPressure;
    }

    public final int component50() {
        return this.mPacePathSampleInterval;
    }

    @aa1
    public final List<Integer> component51() {
        return this.mPacePathPoints;
    }

    public final int component52() {
        return this.mSpeedPathCount;
    }

    public final int component53() {
        return this.mSpeedPathSampleInterval;
    }

    @aa1
    public final List<Integer> component54() {
        return this.mSpeedPathPoints;
    }

    public final int component55() {
        return this.mCadencePathCount;
    }

    public final int component56() {
        return this.mCadencePathSampleInterval;
    }

    @aa1
    public final List<Integer> component57() {
        return this.mCadencePathPoints;
    }

    public final int component58() {
        return this.mAltitudePathCount;
    }

    public final int component59() {
        return this.mAltitudePathSampleInterval;
    }

    public final int component6() {
        return this.mSpm;
    }

    @aa1
    public final List<Integer> component60() {
        return this.mAltitudePathPoints;
    }

    public final int component7() {
        return this.mMode;
    }

    public final int component8() {
        return this.mStep;
    }

    public final int component9() {
        return this.mDistance;
    }

    @aa1
    public final BleWorkout3 copy(int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, int r71, int r72, int r73, int r74, int r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, int r86, int r87, int r88, int r89, float r90, float r91, int r92, float r93, int r94, int r95, int r96, @aa1 int[] r97, @aa1 int[] r98, int r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, @aa1 List<float[]> r107, int r108, int r109, @aa1 List<Integer> r110, int r111, int r112, @aa1 List<Integer> r113, int r114, int r115, @aa1 List<Integer> r116, int r117, int r118, @aa1 List<Integer> r119, int r120, int r121, @aa1 List<Integer> r122) {
        Intrinsics.X0O(r97, "mBpmZoneCount");
        Intrinsics.X0O(r98, "mPersonalZone");
        Intrinsics.X0O(r107, "mPathPoints");
        Intrinsics.X0O(r110, "mHrPathPoints");
        Intrinsics.X0O(r113, "mPacePathPoints");
        Intrinsics.X0O(r116, "mSpeedPathPoints");
        Intrinsics.X0O(r119, "mCadencePathPoints");
        Intrinsics.X0O(r122, "mAltitudePathPoints");
        return new BleWorkout3(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = BleReadable.readInt32$default(this, null, 1, null);
        this.mEnd = BleReadable.readInt32$default(this, null, 1, null);
        this.mDuration = BleReadable.readUInt16$default(this, null, 1, null);
        this.mAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mAirPressure = BleReadable.readUInt16$default(this, null, 1, null);
        this.mSpm = readUInt8();
        this.mMode = readUInt8();
        this.mStep = BleReadable.readInt32$default(this, null, 1, null);
        this.mDistance = BleReadable.readInt32$default(this, null, 1, null);
        this.mCalorie = BleReadable.readInt32$default(this, null, 1, null);
        this.mSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mAvgBpm = readUInt8();
        this.mMaxBpm = readUInt8();
        this.mMinBpm = readUInt8();
        readInt8();
        this.mMaxSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMaxPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMaxAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinStress = readUInt8();
        this.mMaxStress = readUInt8();
        this.mAvgStress = readUInt8();
        this.mMaxSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinSpeed = BleReadable.readInt32$default(this, null, 1, null);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMetTotal = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAerobic = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAnaerobic = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStamina = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAvgSpeed = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCadence = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMaxCadence = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCnt = readInt32(r0);
        int r1 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 5) goto L6;
        int[] r4 = this.mBpmZoneCount;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        r4[r3] = readUInt16(r5);
        r3 = r3 + 1;
        goto L4
    L6:
        int r6 = 0;
    L7:
        if (r6 >= 5) goto L9;
        int[] r7 = this.mPersonalZone;
        ByteOrder r8 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r8, "LITTLE_ENDIAN");
        r7[r6] = readUInt16(r8);
        r6 = r6 + 1;
        goto L7
    L9:
        ByteOrder r9 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mLactateThresholdPace = readInt32(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mRecoveryTime = readInt32(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mTrainingLoad = readUInt16(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mMaxVO2 = readUInt16(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mLactateThresholdHr = readInt32(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mAlgorithmMarking = readUInt16(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mPathCount = readInt32(r9);
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        this.mPathSampleInterval = readInt32(r9);
        ArrayList r10 = new ArrayList();
        int r11 = 0;
    L11:
        if (r11 >= 32) goto L13;
        ByteOrder r12 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r12, "LITTLE_ENDIAN");
        float r13 = readFloat(r12);
        Intrinsics.O10IXXX0X(r12, "LITTLE_ENDIAN");
        r10.add(new float[]{r13, readFloat(r12)});
        r11 = r11 + 1;
        goto L11
    L13:
        this.mPathPoints = CollectionsKt___CollectionsKt.IO0OOi(r10, this.mPathCount);
        ByteOrder r14 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        this.mHrPathCount = readInt32(r14);
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        this.mHrPathSampleInterval = readInt32(r14);
        ArrayList r15 = new ArrayList();
        int r16 = 0;
    L14:
        if (r16 >= 32) goto L16;
        ByteOrder r17 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r17, "LITTLE_ENDIAN");
        r15.add(Integer.valueOf(readInt32(r17)));
        r16 = r16 + 1;
        goto L14
    L16:
        this.mHrPathPoints = CollectionsKt___CollectionsKt.IO0OOi(r15, this.mHrPathCount);
        ByteOrder r18 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r18, "LITTLE_ENDIAN");
        this.mPacePathCount = readInt32(r18);
        Intrinsics.O10IXXX0X(r18, "LITTLE_ENDIAN");
        this.mPacePathSampleInterval = readInt32(r18);
        ArrayList r19 = new ArrayList();
        int r20 = 0;
    L17:
        if (r20 >= 32) goto L19;
        ByteOrder r21 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r21, "LITTLE_ENDIAN");
        r19.add(Integer.valueOf(readInt32(r21)));
        r20 = r20 + 1;
        goto L17
    L19:
        this.mPacePathPoints = CollectionsKt___CollectionsKt.IO0OOi(r19, this.mPacePathCount);
        ByteOrder r22 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r22, "LITTLE_ENDIAN");
        this.mSpeedPathCount = readInt32(r22);
        Intrinsics.O10IXXX0X(r22, "LITTLE_ENDIAN");
        this.mSpeedPathSampleInterval = readInt32(r22);
        ArrayList r23 = new ArrayList();
        int r24 = 0;
    L20:
        if (r24 >= 32) goto L22;
        ByteOrder r25 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r25, "LITTLE_ENDIAN");
        r23.add(Integer.valueOf(readInt32(r25)));
        r24 = r24 + 1;
        goto L20
    L22:
        this.mSpeedPathPoints = CollectionsKt___CollectionsKt.IO0OOi(r23, this.mSpeedPathCount);
        ByteOrder r26 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r26, "LITTLE_ENDIAN");
        this.mCadencePathCount = readInt32(r26);
        Intrinsics.O10IXXX0X(r26, "LITTLE_ENDIAN");
        this.mCadencePathSampleInterval = readInt32(r26);
        ArrayList r27 = new ArrayList();
        int r28 = 0;
    L23:
        if (r28 >= 32) goto L25;
        ByteOrder r29 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r29, "LITTLE_ENDIAN");
        r27.add(Integer.valueOf(readInt32(r29)));
        r28 = r28 + 1;
        goto L23
    L25:
        this.mCadencePathPoints = CollectionsKt___CollectionsKt.IO0OOi(r27, this.mCadencePathCount);
        ByteOrder r30 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r30, "LITTLE_ENDIAN");
        this.mAltitudePathCount = readInt32(r30);
        Intrinsics.O10IXXX0X(r30, "LITTLE_ENDIAN");
        this.mAltitudePathSampleInterval = readInt32(r30);
        ArrayList r31 = new ArrayList();
    L26:
        if (r1 >= 32) goto L28;
        ByteOrder r32 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r32, "LITTLE_ENDIAN");
        r31.add(Integer.valueOf(readInt32(r32)));
        r1 = r1 + 1;
        goto L26
    L28:
        this.mAltitudePathPoints = CollectionsKt___CollectionsKt.IO0OOi(r31, this.mAltitudePathCount);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorkout3) == true) goto L8;
        return false;
    L8:
        BleWorkout3 r6 = (BleWorkout3) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mEnd == r6.mEnd) goto L15;
        return false;
    L15:
        if (this.mDuration == r6.mDuration) goto L18;
        return false;
    L18:
        if (this.mAltitude == r6.mAltitude) goto L21;
        return false;
    L21:
        if (this.mAirPressure == r6.mAirPressure) goto L24;
        return false;
    L24:
        if (this.mSpm == r6.mSpm) goto L27;
        return false;
    L27:
        if (this.mMode == r6.mMode) goto L30;
        return false;
    L30:
        if (this.mStep == r6.mStep) goto L33;
        return false;
    L33:
        if (this.mDistance == r6.mDistance) goto L36;
        return false;
    L36:
        if (this.mCalorie == r6.mCalorie) goto L39;
        return false;
    L39:
        if (this.mSpeed == r6.mSpeed) goto L42;
        return false;
    L42:
        if (this.mPace == r6.mPace) goto L45;
        return false;
    L45:
        if (this.mAvgBpm == r6.mAvgBpm) goto L48;
        return false;
    L48:
        if (this.mMaxBpm == r6.mMaxBpm) goto L51;
        return false;
    L51:
        if (this.mMinBpm == r6.mMinBpm) goto L54;
        return false;
    L54:
        if (this.mMaxSpm == r6.mMaxSpm) goto L57;
        return false;
    L57:
        if (this.mMinSpm == r6.mMinSpm) goto L60;
        return false;
    L60:
        if (this.mMaxPace == r6.mMaxPace) goto L63;
        return false;
    L63:
        if (this.mMinPace == r6.mMinPace) goto L66;
        return false;
    L66:
        if (this.mMaxAltitude == r6.mMaxAltitude) goto L69;
        return false;
    L69:
        if (this.mMinAltitude == r6.mMinAltitude) goto L72;
        return false;
    L72:
        if (this.mMinStress == r6.mMinStress) goto L75;
        return false;
    L75:
        if (this.mMaxStress == r6.mMaxStress) goto L78;
        return false;
    L78:
        if (this.mAvgStress == r6.mAvgStress) goto L81;
        return false;
    L81:
        if (this.mMaxSpeed == r6.mMaxSpeed) goto L84;
        return false;
    L84:
        if (this.mMinSpeed == r6.mMinSpeed) goto L87;
        return false;
    L87:
        if (this.mMetTotal == r6.mMetTotal) goto L90;
        return false;
    L90:
        if (Float.compare(this.mAerobic, r6.mAerobic) == 0) goto L93;
        return false;
    L93:
        if (Float.compare(this.mAnaerobic, r6.mAnaerobic) == 0) goto L96;
        return false;
    L96:
        if (this.mStamina == r6.mStamina) goto L99;
        return false;
    L99:
        if (Float.compare(this.mAvgSpeed, r6.mAvgSpeed) == 0) goto L102;
        return false;
    L102:
        if (this.mCadence == r6.mCadence) goto L105;
        return false;
    L105:
        if (this.mMaxCadence == r6.mMaxCadence) goto L108;
        return false;
    L108:
        if (this.mCnt == r6.mCnt) goto L111;
        return false;
    L111:
        if (Intrinsics.XOO0ii0(this.mBpmZoneCount, r6.mBpmZoneCount) == true) goto L114;
        return false;
    L114:
        if (Intrinsics.XOO0ii0(this.mPersonalZone, r6.mPersonalZone) == true) goto L117;
        return false;
    L117:
        if (this.mLactateThresholdPace == r6.mLactateThresholdPace) goto L120;
        return false;
    L120:
        if (this.mRecoveryTime == r6.mRecoveryTime) goto L123;
        return false;
    L123:
        if (this.mTrainingLoad == r6.mTrainingLoad) goto L126;
        return false;
    L126:
        if (this.mMaxVO2 == r6.mMaxVO2) goto L129;
        return false;
    L129:
        if (this.mLactateThresholdHr == r6.mLactateThresholdHr) goto L132;
        return false;
    L132:
        if (this.mAlgorithmMarking == r6.mAlgorithmMarking) goto L135;
        return false;
    L135:
        if (this.mPathCount == r6.mPathCount) goto L138;
        return false;
    L138:
        if (this.mPathSampleInterval == r6.mPathSampleInterval) goto L141;
        return false;
    L141:
        if (Intrinsics.XOO0ii0(this.mPathPoints, r6.mPathPoints) == true) goto L144;
        return false;
    L144:
        if (this.mHrPathCount == r6.mHrPathCount) goto L147;
        return false;
    L147:
        if (this.mHrPathSampleInterval == r6.mHrPathSampleInterval) goto L150;
        return false;
    L150:
        if (Intrinsics.XOO0ii0(this.mHrPathPoints, r6.mHrPathPoints) == true) goto L153;
        return false;
    L153:
        if (this.mPacePathCount == r6.mPacePathCount) goto L156;
        return false;
    L156:
        if (this.mPacePathSampleInterval == r6.mPacePathSampleInterval) goto L159;
        return false;
    L159:
        if (Intrinsics.XOO0ii0(this.mPacePathPoints, r6.mPacePathPoints) == true) goto L162;
        return false;
    L162:
        if (this.mSpeedPathCount == r6.mSpeedPathCount) goto L165;
        return false;
    L165:
        if (this.mSpeedPathSampleInterval == r6.mSpeedPathSampleInterval) goto L168;
        return false;
    L168:
        if (Intrinsics.XOO0ii0(this.mSpeedPathPoints, r6.mSpeedPathPoints) == true) goto L171;
        return false;
    L171:
        if (this.mCadencePathCount == r6.mCadencePathCount) goto L174;
        return false;
    L174:
        if (this.mCadencePathSampleInterval == r6.mCadencePathSampleInterval) goto L177;
        return false;
    L177:
        if (Intrinsics.XOO0ii0(this.mCadencePathPoints, r6.mCadencePathPoints) == true) goto L180;
        return false;
    L180:
        if (this.mAltitudePathCount == r6.mAltitudePathCount) goto L183;
        return false;
    L183:
        if (this.mAltitudePathSampleInterval == r6.mAltitudePathSampleInterval) goto L186;
        return false;
    L186:
        if (Intrinsics.XOO0ii0(this.mAltitudePathPoints, r6.mAltitudePathPoints) == true) goto L188;
        return false;
    L188:
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

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    @aa1
    public final int[] getMBpmZoneCount() {
        return this.mBpmZoneCount;
    }

    public final int getMCadence() {
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

    public final int getMCnt() {
        return this.mCnt;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMEnd() {
        return this.mEnd;
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

    @aa1
    public final int[] getMPersonalZone() {
        return this.mPersonalZone;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final int getMSpeed() {
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

    public final int getMStamina() {
        return this.mStamina;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mMinSpeed)) * 31) + Integer.hashCode(this.mMetTotal)) * 31) + Float.hashCode(this.mAerobic)) * 31) + Float.hashCode(this.mAnaerobic)) * 31) + Integer.hashCode(this.mStamina)) * 31) + Float.hashCode(this.mAvgSpeed)) * 31) + Integer.hashCode(this.mCadence)) * 31) + Integer.hashCode(this.mMaxCadence)) * 31) + Integer.hashCode(this.mCnt)) * 31) + Arrays.hashCode(this.mBpmZoneCount)) * 31) + Arrays.hashCode(this.mPersonalZone)) * 31) + Integer.hashCode(this.mLactateThresholdPace)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mMaxVO2)) * 31) + Integer.hashCode(this.mLactateThresholdHr)) * 31) + Integer.hashCode(this.mAlgorithmMarking)) * 31) + Integer.hashCode(this.mPathCount)) * 31) + Integer.hashCode(this.mPathSampleInterval)) * 31) + this.mPathPoints.hashCode()) * 31) + Integer.hashCode(this.mHrPathCount)) * 31) + Integer.hashCode(this.mHrPathSampleInterval)) * 31) + this.mHrPathPoints.hashCode()) * 31) + Integer.hashCode(this.mPacePathCount)) * 31) + Integer.hashCode(this.mPacePathSampleInterval)) * 31) + this.mPacePathPoints.hashCode()) * 31) + Integer.hashCode(this.mSpeedPathCount)) * 31) + Integer.hashCode(this.mSpeedPathSampleInterval)) * 31) + this.mSpeedPathPoints.hashCode()) * 31) + Integer.hashCode(this.mCadencePathCount)) * 31) + Integer.hashCode(this.mCadencePathSampleInterval)) * 31) + this.mCadencePathPoints.hashCode()) * 31) + Integer.hashCode(this.mAltitudePathCount)) * 31) + Integer.hashCode(this.mAltitudePathSampleInterval)) * 31) + this.mAltitudePathPoints.hashCode();
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

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMAvgSpeed(float r1) {
        this.mAvgSpeed = r1;
    }

    public final void setMAvgStress(int r1) {
        this.mAvgStress = r1;
    }

    public final void setMBpmZoneCount(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBpmZoneCount = r2;
    }

    public final void setMCadence(int r1) {
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

    public final void setMCnt(int r1) {
        this.mCnt = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMEnd(int r1) {
        this.mEnd = r1;
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

    public final void setMPersonalZone(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPersonalZone = r2;
    }

    public final void setMRecoveryTime(int r1) {
        this.mRecoveryTime = r1;
    }

    public final void setMSpeed(int r1) {
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

    public final void setMStamina(int r1) {
        this.mStamina = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMTrainingLoad(int r1) {
        this.mTrainingLoad = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleWorkout3(mStart=");
        r0.append(this.mStart);
        r0.append(", mEnd=");
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
        r0.append(this.mDuration);
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
        r0.append(", mAlgorithmMarking=");
        r0.append(this.mAlgorithmMarking);
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
        return r0.toString();
    }

    public BleWorkout3(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, float r37, float r38, int r39, float r40, int r41, int r42, int r43, @aa1 int[] r44, @aa1 int[] r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, @aa1 List<float[]> r54, int r55, int r56, @aa1 List<Integer> r57, int r58, int r59, @aa1 List<Integer> r60, int r61, int r62, @aa1 List<Integer> r63, int r64, int r65, @aa1 List<Integer> r66, int r67, int r68, @aa1 List<Integer> r69) {
        Intrinsics.X0O(r44, "mBpmZoneCount");
        Intrinsics.X0O(r45, "mPersonalZone");
        Intrinsics.X0O(r54, "mPathPoints");
        Intrinsics.X0O(r57, "mHrPathPoints");
        Intrinsics.X0O(r60, "mPacePathPoints");
        Intrinsics.X0O(r63, "mSpeedPathPoints");
        Intrinsics.X0O(r66, "mCadencePathPoints");
        Intrinsics.X0O(r69, "mAltitudePathPoints");
        this.mStart = r10;
        this.mEnd = r11;
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
        this.mMaxSpeed = r34;
        this.mMinSpeed = r35;
        this.mMetTotal = r36;
        this.mAerobic = r37;
        this.mAnaerobic = r38;
        this.mStamina = r39;
        this.mAvgSpeed = r40;
        this.mCadence = r41;
        this.mMaxCadence = r42;
        this.mCnt = r43;
        this.mBpmZoneCount = r44;
        this.mPersonalZone = r45;
        this.mLactateThresholdPace = r46;
        this.mRecoveryTime = r47;
        this.mTrainingLoad = r48;
        this.mMaxVO2 = r49;
        this.mLactateThresholdHr = r50;
        this.mAlgorithmMarking = r51;
        this.mPathCount = r52;
        this.mPathSampleInterval = r53;
        this.mPathPoints = r54;
        this.mHrPathCount = r55;
        this.mHrPathSampleInterval = r56;
        this.mHrPathPoints = r57;
        this.mPacePathCount = r58;
        this.mPacePathSampleInterval = r59;
        this.mPacePathPoints = r60;
        this.mSpeedPathCount = r61;
        this.mSpeedPathSampleInterval = r62;
        this.mSpeedPathPoints = r63;
        this.mCadencePathCount = r64;
        this.mCadencePathSampleInterval = r65;
        this.mCadencePathPoints = r66;
        this.mAltitudePathCount = r67;
        this.mAltitudePathSampleInterval = r68;
        this.mAltitudePathPoints = r69;
    }

    public /* synthetic */ BleWorkout3(int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, int r71, int r72, int r73, int r74, int r75, int r76, int r77, float r78, float r79, int r80, float r81, int r82, int r83, int r84, int[] r85, int[] r86, int r87, int r88, int r89, int r90, int r91, int r92, int r93, int r94, List r95, int r96, int r97, List r98, int r99, int r100, List r101, int r102, int r103, List r104, int r105, int r106, List r107, int r108, int r109, List r110, int r111, int r112, DefaultConstructorMarker r113) {
        if ((r111 & 1) == 0) goto L5;
        int r2 = 0;
    L7:
        if ((r111 & 2) == 0) goto L9;
        int r4 = 0;
    L11:
        if ((r111 & 4) == 0) goto L13;
        int r5 = 0;
    L15:
        if ((r111 & 8) == 0) goto L17;
        int r6 = 0;
    L19:
        if ((r111 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r111 & 32) == 0) goto L25;
        int r8 = 0;
    L27:
        if ((r111 & 64) == 0) goto L29;
        int r9 = 0;
    L31:
        if ((r111 & 128) == 0) goto L33;
        int r10 = 0;
    L35:
        if ((r111 & 256) == 0) goto L37;
        int r11 = 0;
    L39:
        if ((r111 & 512) == 0) goto L41;
        int r12 = 0;
    L43:
        if ((r111 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r111 & 2048) == 0) goto L49;
        int r14 = 0;
    L51:
        if ((r111 & 4096) == 0) goto L53;
        int r15 = 0;
    L55:
        if ((r111 & 8192) == 0) goto L57;
        int r3 = 0;
    L58:
        int r510 = r2;
        if ((r111 & 16384) == 0) goto L61;
        int r16 = 0;
    L63:
        if ((r111 & 32768) == 0) goto L65;
        int r17 = 0;
    L67:
        if ((r111 & 65536) == 0) goto L69;
        int r19 = 0;
    L71:
        if ((r111 & 131072) == 0) goto L73;
        int r21 = 0;
    L75:
        if ((r111 & 262144) == 0) goto L77;
        int r23 = 0;
    L79:
        if ((r111 & 524288) == 0) goto L81;
        int r25 = 0;
    L83:
        if ((r111 & 1048576) == 0) goto L85;
        int r26 = 0;
    L87:
        if ((r111 & 2097152) == 0) goto L89;
        int r27 = 0;
    L91:
        if ((r111 & 4194304) == 0) goto L93;
        int r28 = 0;
    L95:
        if ((r111 & 8388608) == 0) goto L97;
        int r29 = 0;
    L99:
        if ((r111 & 16777216) == 0) goto L101;
        int r30 = 0;
    L103:
        if ((r111 & 33554432) == 0) goto L105;
        int r31 = 0;
    L107:
        if ((r111 & 67108864) == 0) goto L109;
        int r32 = 0;
    L110:
        float r34 = 0.0f;
        if ((r111 & 134217728) == 0) goto L113;
        float r33 = 0.0f;
    L115:
        if ((r111 & 268435456) == 0) goto L117;
        float r35 = 0.0f;
    L119:
        if ((r111 & 536870912) == 0) goto L121;
        int r36 = 0;
    L123:
        if ((r111 & 1073741824) != 0) goto L127;
        r34 = r81;
    L127:
        if ((r111 & Integer.MIN_VALUE) == 0) goto L129;
        int r0 = 0;
    L131:
        if ((r112 & 1) == 0) goto L133;
        int r37 = 0;
    L135:
        if ((r112 & 2) == 0) goto L137;
        int r38 = 0;
    L138:
        int r511 = r0;
        if ((r112 & 4) == 0) goto L141;
        int[] r1 = new int[5];
    L142:
        int[] r512 = r1;
        if ((r112 & 8) == 0) goto L145;
        int[] r18 = new int[5];
    L147:
        if ((r112 & 16) == 0) goto L149;
        int r39 = 0;
    L151:
        if ((r112 & 32) == 0) goto L153;
        int r40 = 0;
    L155:
        if ((r112 & 64) == 0) goto L157;
        int r41 = 0;
    L158:
        int[] r513 = r18;
        if ((r112 & 128) == 0) goto L161;
        int r20 = 0;
    L162:
        int r514 = r20;
        if ((r112 & 256) == 0) goto L165;
        int r22 = 0;
    L166:
        int r515 = r22;
        if ((r112 & 512) == 0) goto L169;
        int r24 = 0;
    L170:
        int r516 = r24;
        if ((r112 & 1024) == 0) goto L173;
        int r42 = 0;
    L174:
        int r517 = r42;
        if ((r112 & 2048) == 0) goto L177;
        int r43 = 0;
    L178:
        int r518 = r43;
        if ((r112 & 4096) == 0) goto L181;
        List r44 = new ArrayList();
    L182:
        List r610 = r44;
        if ((r112 & 8192) == 0) goto L185;
        int r45 = 0;
    L186:
        int r611 = r45;
        if ((r112 & 16384) == 0) goto L189;
        int r46 = 0;
    L191:
        if ((r112 & 32768) == 0) goto L193;
        List r114 = new ArrayList();
    L195:
        if ((r112 & 65536) == 0) goto L197;
        int r115 = 0;
    L199:
        if ((r112 & 131072) == 0) goto L201;
        int r210 = 0;
    L203:
        if ((r112 & 262144) == 0) goto L205;
        List r211 = new ArrayList();
    L207:
        if ((r112 & 524288) == 0) goto L209;
        int r212 = 0;
    L211:
        if ((r112 & 1048576) == 0) goto L213;
        int r47 = 0;
    L215:
        if ((r112 & 2097152) == 0) goto L217;
        List r48 = new ArrayList();
    L219:
        if ((r112 & 4194304) == 0) goto L221;
        int r49 = 0;
    L223:
        if ((r112 & 8388608) == 0) goto L225;
        int r410 = 0;
    L227:
        if ((r112 & 16777216) == 0) goto L229;
        List r411 = new ArrayList();
    L231:
        if ((r112 & 33554432) == 0) goto L233;
        int r412 = 0;
    L235:
        if ((r112 & 67108864) == 0) goto L237;
        int r413 = 0;
    L239:
        if ((r112 & 134217728) == 0) goto L242;
        List r116 = new ArrayList();
    L243:
        this(r510, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r3, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r34, r511, r37, r38, r512, r513, r39, r40, r41, r514, r515, r516, r517, r518, r610, r611, r46, r114, r115, r210, r211, r212, r47, r48, r49, r410, r411, r412, r413, r116);
        return;
    L242:
        r116 = r110;
        goto L243
    L237:
        r413 = r109;
        goto L239
    L233:
        r412 = r108;
        goto L235
    L229:
        r411 = r107;
        goto L231
    L225:
        r410 = r106;
        goto L227
    L221:
        r49 = r105;
        goto L223
    L217:
        r48 = r104;
        goto L219
    L213:
        r47 = r103;
        goto L215
    L209:
        r212 = r102;
        goto L211
    L205:
        r211 = r101;
        goto L207
    L201:
        r210 = r100;
        goto L203
    L197:
        r115 = r99;
        goto L199
    L193:
        r114 = r98;
        goto L195
    L189:
        r46 = r97;
        goto L191
    L185:
        r45 = r96;
        goto L186
    L181:
        r44 = r95;
        goto L182
    L177:
        r43 = r94;
        goto L178
    L173:
        r42 = r93;
        goto L174
    L169:
        r24 = r92;
        goto L170
    L165:
        r22 = r91;
        goto L166
    L161:
        r20 = r90;
        goto L162
    L157:
        r41 = r89;
        goto L158
    L153:
        r40 = r88;
        goto L155
    L149:
        r39 = r87;
        goto L151
    L145:
        r18 = r86;
        goto L147
    L141:
        r1 = r85;
        goto L142
    L137:
        r38 = r84;
        goto L138
    L133:
        r37 = r83;
        goto L135
    L129:
        r0 = r82;
        goto L131
    L121:
        r36 = r80;
        goto L123
    L117:
        r35 = r79;
        goto L119
    L113:
        r33 = r78;
        goto L115
    L109:
        r32 = r77;
        goto L110
    L105:
        r31 = r76;
        goto L107
    L101:
        r30 = r75;
        goto L103
    L97:
        r29 = r74;
        goto L99
    L93:
        r28 = r73;
        goto L95
    L89:
        r27 = r72;
        goto L91
    L85:
        r26 = r71;
        goto L87
    L81:
        r25 = r70;
        goto L83
    L77:
        r23 = r69;
        goto L79
    L73:
        r21 = r68;
        goto L75
    L69:
        r19 = r67;
        goto L71
    L65:
        r17 = r66;
        goto L67
    L61:
        r16 = r65;
        goto L63
    L57:
        r3 = r64;
        goto L58
    L53:
        r15 = r63;
        goto L55
    L49:
        r14 = r62;
        goto L51
    L45:
        r13 = r61;
        goto L47
    L41:
        r12 = r60;
        goto L43
    L37:
        r11 = r59;
        goto L39
    L33:
        r10 = r58;
        goto L35
    L29:
        r9 = r57;
        goto L31
    L25:
        r8 = r56;
        goto L27
    L21:
        r7 = r55;
        goto L23
    L17:
        r6 = r54;
        goto L19
    L13:
        r5 = r53;
        goto L15
    L9:
        r4 = r52;
        goto L11
    L5:
        r2 = r51;
        goto L7
    }
}
