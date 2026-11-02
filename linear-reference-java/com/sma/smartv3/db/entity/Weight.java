package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X01O1XO0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.TimeUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({ListDoubleConverter.class})
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Weight implements Serializable {

    @ColumnInfo
    private double mAgeOfBody;

    @aa1
    @ColumnInfo
    private List<Double> mAgeOfBodyRange;

    @ColumnInfo
    private double mBmi;

    @aa1
    @ColumnInfo
    private List<Double> mBmiRange;

    @aa1
    @ColumnInfo
    private List<Double> mBmiWHORange;

    @ColumnInfo
    private double mBmr;

    @aa1
    @ColumnInfo
    private List<Double> mBmrRange;

    @ColumnInfo
    private double mBodyShape;

    @ColumnInfo
    private double mDesirableWeight;

    @ColumnInfo
    private double mFatFreeBodyWeight;

    @ColumnInfo
    private double mFatToControl;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private double mIdealWeight;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsMeasure;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private double mLevelOfVisceralFat;

    @aa1
    @ColumnInfo
    private List<Double> mLevelOfVisceralFatRange;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private double mMuscleToControl;

    @ColumnInfo
    private double mRatioOfFat;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfFatRange;

    @ColumnInfo
    private double mRatioOfMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfMuscleRange;

    @ColumnInfo
    private double mRatioOfProtein;

    @ColumnInfo
    private int mRatioOfProteinLevel;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfProteinRange;

    @ColumnInfo
    private double mRatioOfSkeletalMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfSkeletalMuscleRange;

    @ColumnInfo
    private double mRatioOfSubcutaneousFat;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfSubcutaneousFatRange;

    @ColumnInfo
    private double mRatioOfWater;

    @ColumnInfo
    private int mRatioOfWaterLevel;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfWaterRange;

    @ColumnInfo
    private double mScore;

    @ColumnInfo
    private double mStateOfNutrition;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private float mWeight;

    @ColumnInfo
    private double mWeightOfBone;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfBoneRange;

    @ColumnInfo
    private double mWeightOfFat;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfFatRange;

    @ColumnInfo
    private double mWeightOfMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfMuscleRange;

    @ColumnInfo
    private double mWeightOfProtein;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfProteinRange;

    @ColumnInfo
    private double mWeightOfSkeletalMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfSkeletalMuscleRange;

    @ColumnInfo
    private double mWeightOfWater;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfWaterRange;

    @aa1
    @ColumnInfo
    private List<Double> mWeightRange;

    @ColumnInfo
    private double mWeightToControl;

    @aa1
    @ColumnInfo
    private List<Double> mWeightWHORange;

    public Weight() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        float r5 = 0.0f;
        int r6 = 0;
        int r7 = 0;
        double r8 = 0.0d;
        double r10 = 0.0d;
        double r12 = 0.0d;
        double r14 = 0.0d;
        double r16 = 0.0d;
        double r18 = 0.0d;
        double r20 = 0.0d;
        double r22 = 0.0d;
        double r24 = 0.0d;
        List r26 = null;
        List r27 = null;
        List r28 = null;
        double r29 = 0.0d;
        List r31 = null;
        double r32 = 0.0d;
        double r34 = 0.0d;
        double r36 = 0.0d;
        double r38 = 0.0d;
        double r40 = 0.0d;
        List r42 = null;
        double r43 = 0.0d;
        List r45 = null;
        double r46 = 0.0d;
        List r48 = null;
        List r49 = null;
        double r50 = 0.0d;
        List r52 = null;
        double r53 = 0.0d;
        List r55 = null;
        List r56 = null;
        double r57 = 0.0d;
        double r59 = 0.0d;
        List r61 = null;
        List r62 = null;
        List r63 = null;
        double r64 = 0.0d;
        List r66 = null;
        double r67 = 0.0d;
        List r69 = null;
        double r70 = 0.0d;
        List r72 = null;
        List r73 = null;
        double r74 = 0.0d;
        List r76 = null;
        int r77 = 0;
        int r78 = 0;
        int r79 = 0;
        int r80 = -1;
        this(r1, r2, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r27, r28, r29, r31, r32, r34, r36, r38, r40, r42, r43, r45, r46, r48, r49, r50, r52, r53, r55, r56, r57, r59, r61, r62, r63, r64, r66, r67, r69, r70, r72, r73, r74, r76, r77, r78, r79, r80, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Weight copy$default(Weight r24, int r25, long r26, String r28, float r29, int r30, int r31, double r32, double r34, double r36, double r38, double r40, double r42, double r44, double r46, double r48, List r50, List r51, List r52, double r53, List r55, double r56, double r58, double r60, double r62, double r64, List r66, double r67, List r69, double r70, List r72, List r73, double r74, List r76, double r77, List r79, List r80, double r81, double r83, List r85, List r86, List r87, double r88, List r90, double r91, List r93, double r94, List r96, List r97, double r98, List r100, int r101, int r102, int r103, int r104, int r105, Object r106) {
        if ((r104 & 1) == 0) goto L5;
        int r3 = r24.mId;
    L7:
        if ((r104 & 2) == 0) goto L9;
        long r4 = r24.mTime;
    L11:
        if ((r104 & 4) == 0) goto L13;
        String r6 = r24.mLocalTime;
    L15:
        if ((r104 & 8) == 0) goto L17;
        float r7 = r24.mWeight;
    L19:
        if ((r104 & 16) == 0) goto L21;
        int r8 = r24.mIsSync;
    L23:
        if ((r104 & 32) == 0) goto L25;
        int r9 = r24.mIsMeasure;
    L27:
        if ((r104 & 64) == 0) goto L29;
        double r10 = r24.mBmi;
    L31:
        if ((r104 & 128) == 0) goto L33;
        double r12 = r24.mRatioOfFat;
    L35:
        if ((r104 & 256) == 0) goto L37;
        double r14 = r24.mWeightOfMuscle;
    L38:
        int r27 = r3;
        long r16 = r4;
        if ((r104 & 512) == 0) goto L41;
        double r5 = r24.mWeightOfFat;
    L42:
        double r210 = r5;
        if ((r104 & 1024) == 0) goto L45;
        double r11 = r24.mRatioOfProtein;
    L46:
        double r211 = r11;
        if ((r104 & 2048) == 0) goto L49;
        double r13 = r24.mRatioOfWater;
    L50:
        double r33 = r13;
        if ((r104 & 4096) == 0) goto L53;
        double r15 = r24.mStateOfNutrition;
    L54:
        double r35 = r15;
        if ((r104 & 8192) == 0) goto L57;
        double r17 = r24.mIdealWeight;
    L58:
        double r37 = r17;
        if ((r104 & 16384) == 0) goto L61;
        double r18 = r24.mAgeOfBody;
    L63:
        if ((r104 & 32768) == 0) goto L65;
        List r19 = r24.mAgeOfBodyRange;
    L67:
        if ((r104 & 65536) == 0) goto L69;
        List r1 = r24.mBmiRange;
    L70:
        List r39 = r1;
        if ((r104 & 131072) == 0) goto L73;
        List r2 = r24.mBmiWHORange;
    L74:
        double r310 = r18;
        if ((r104 & 262144) == 0) goto L77;
        double r20 = r24.mBmr;
    L78:
        List r41 = r2;
        if ((r104 & 524288) == 0) goto L81;
        List r21 = r24.mBmrRange;
    L82:
        double r43 = r20;
        if ((r104 & 1048576) == 0) goto L85;
        double r22 = r24.mBodyShape;
    L86:
        double r45 = r22;
        if ((r104 & 2097152) == 0) goto L89;
        double r23 = r24.mDesirableWeight;
    L90:
        double r47 = r23;
        if ((r104 & 4194304) == 0) goto L93;
        double r49 = r24.mFatFreeBodyWeight;
    L94:
        double r410 = r49;
        if ((r104 & 8388608) == 0) goto L97;
        double r54 = r24.mFatToControl;
    L98:
        double r411 = r54;
        if ((r104 & 16777216) == 0) goto L101;
        double r57 = r24.mLevelOfVisceralFat;
    L102:
        List r59 = r21;
        if ((r104 & 33554432) == 0) goto L105;
        List r61 = r24.mLevelOfVisceralFatRange;
    L106:
        double r510 = r57;
        if ((r104 & 67108864) == 0) goto L109;
        double r63 = r24.mMuscleToControl;
    L110:
        List r511 = r61;
        if ((r104 & 134217728) == 0) goto L113;
        List r65 = r24.mRatioOfFatRange;
    L114:
        double r512 = r63;
        if ((r104 & 268435456) == 0) goto L117;
        double r68 = r24.mRatioOfMuscle;
    L118:
        List r513 = r65;
        if ((r104 & 536870912) == 0) goto L121;
        List r71 = r24.mRatioOfMuscleRange;
    L122:
        List r514 = r71;
        if ((r104 & 1073741824) == 0) goto L125;
        List r75 = r24.mRatioOfProteinRange;
    L126:
        double r515 = r68;
        if ((r104 & Integer.MIN_VALUE) == 0) goto L129;
        double r78 = r24.mRatioOfSkeletalMuscle;
    L130:
        List r610 = r75;
        if ((r105 & 1) == 0) goto L133;
        List r82 = r24.mRatioOfSkeletalMuscleRange;
    L134:
        double r611 = r78;
        if ((r105 & 2) == 0) goto L137;
        double r84 = r24.mRatioOfSubcutaneousFat;
    L138:
        List r612 = r82;
        if ((r105 & 4) == 0) goto L141;
        List r89 = r24.mRatioOfSubcutaneousFatRange;
    L142:
        List r613 = r89;
        if ((r105 & 8) == 0) goto L145;
        List r92 = r24.mRatioOfWaterRange;
    L146:
        double r614 = r84;
        if ((r105 & 16) == 0) goto L149;
        double r95 = r24.mScore;
    L150:
        double r615 = r95;
        if ((r105 & 32) == 0) goto L153;
        double r99 = r24.mWeightOfBone;
    L154:
        List r710 = r92;
        if ((r105 & 64) == 0) goto L157;
        List r107 = r24.mWeightOfBoneRange;
    L158:
        List r711 = r107;
        if ((r105 & 128) == 0) goto L161;
        List r108 = r24.mWeightOfFatRange;
    L162:
        List r712 = r108;
        if ((r105 & 256) == 0) goto L165;
        List r109 = r24.mWeightOfMuscleRange;
    L166:
        List r713 = r109;
        double r714 = r99;
        if ((r105 & 512) == 0) goto L169;
        double r110 = r24.mWeightOfProtein;
    L171:
        if ((r105 & 1024) == 0) goto L173;
        List r111 = r24.mWeightOfProteinRange;
    L174:
        List r715 = r111;
        double r716 = r110;
        if ((r105 & 2048) == 0) goto L177;
        double r112 = r24.mWeightOfSkeletalMuscle;
    L179:
        if ((r105 & 4096) == 0) goto L181;
        List r113 = r24.mWeightOfSkeletalMuscleRange;
    L182:
        List r717 = r113;
        double r810 = r112;
        if ((r105 & 8192) == 0) goto L185;
        double r114 = r24.mWeightOfWater;
    L187:
        if ((r105 & 16384) == 0) goto L189;
        List r115 = r24.mWeightOfWaterRange;
    L190:
        List r311 = r115;
        if ((r105 & 32768) == 0) goto L193;
        List r116 = r24.mWeightRange;
    L194:
        List r811 = r116;
        if ((r105 & 65536) == 0) goto L197;
        double r117 = r24.mWeightToControl;
    L198:
        double r812 = r117;
        if ((r105 & 131072) == 0) goto L201;
        List r118 = r24.mWeightWHORange;
    L203:
        if ((r105 & 262144) == 0) goto L205;
        int r119 = r24.mIsDelete;
    L206:
        List r813 = r118;
        if ((r105 & 524288) == 0) goto L209;
        int r120 = r24.mRatioOfProteinLevel;
    L211:
        if ((r105 & 1048576) == 0) goto L214;
        int r814 = r120;
        int r1010 = r814;
        int r1011 = r24.mRatioOfWaterLevel;
    L216:
        return r24.copy(r27, r16, r6, r7, r8, r9, r10, r12, r14, r210, r211, r33, r35, r37, r310, r19, r39, r41, r43, r59, r45, r47, r410, r411, r510, r511, r512, r513, r515, r514, r610, r611, r612, r614, r613, r710, r615, r714, r711, r712, r713, r716, r715, r810, r717, r114, r311, r811, r812, r813, r119, r1010, r1011);
    L214:
        r1011 = r103;
        r1010 = r120;
        goto L216
    L209:
        r120 = r102;
        goto L211
    L205:
        r119 = r101;
        goto L206
    L201:
        r118 = r100;
        goto L203
    L197:
        r117 = r98;
        goto L198
    L193:
        r116 = r97;
        goto L194
    L189:
        r115 = r96;
        goto L190
    L185:
        r114 = r94;
        goto L187
    L181:
        r113 = r93;
        goto L182
    L177:
        r112 = r91;
        goto L179
    L173:
        r111 = r90;
        goto L174
    L169:
        r110 = r88;
        goto L171
    L165:
        r109 = r87;
        goto L166
    L161:
        r108 = r86;
        goto L162
    L157:
        r107 = r85;
        goto L158
    L153:
        r99 = r83;
        goto L154
    L149:
        r95 = r81;
        goto L150
    L145:
        r92 = r80;
        goto L146
    L141:
        r89 = r79;
        goto L142
    L137:
        r84 = r77;
        goto L138
    L133:
        r82 = r76;
        goto L134
    L129:
        r78 = r74;
        goto L130
    L125:
        r75 = r73;
        goto L126
    L121:
        r71 = r72;
        goto L122
    L117:
        r68 = r70;
        goto L118
    L113:
        r65 = r69;
        goto L114
    L109:
        r63 = r67;
        goto L110
    L105:
        r61 = r66;
        goto L106
    L101:
        r57 = r64;
        goto L102
    L97:
        r54 = r62;
        goto L98
    L93:
        r49 = r60;
        goto L94
    L89:
        r23 = r58;
        goto L90
    L85:
        r22 = r56;
        goto L86
    L81:
        r21 = r55;
        goto L82
    L77:
        r20 = r53;
        goto L78
    L73:
        r2 = r52;
        goto L74
    L69:
        r1 = r51;
        goto L70
    L65:
        r19 = r50;
        goto L67
    L61:
        r18 = r48;
        goto L63
    L57:
        r17 = r46;
        goto L58
    L53:
        r15 = r44;
        goto L54
    L49:
        r13 = r42;
        goto L50
    L45:
        r11 = r40;
        goto L46
    L41:
        r5 = r38;
        goto L42
    L37:
        r14 = r36;
        goto L38
    L33:
        r12 = r34;
        goto L35
    L29:
        r10 = r32;
        goto L31
    L25:
        r9 = r31;
        goto L27
    L21:
        r8 = r30;
        goto L23
    L17:
        r7 = r29;
        goto L19
    L13:
        r6 = r28;
        goto L15
    L9:
        r4 = r26;
        goto L11
    L5:
        r3 = r25;
        goto L7
    }

    public final int component1() {
        return this.mId;
    }

    public final double component10() {
        return this.mWeightOfFat;
    }

    public final double component11() {
        return this.mRatioOfProtein;
    }

    public final double component12() {
        return this.mRatioOfWater;
    }

    public final double component13() {
        return this.mStateOfNutrition;
    }

    public final double component14() {
        return this.mIdealWeight;
    }

    public final double component15() {
        return this.mAgeOfBody;
    }

    @aa1
    public final List<Double> component16() {
        return this.mAgeOfBodyRange;
    }

    @aa1
    public final List<Double> component17() {
        return this.mBmiRange;
    }

    @aa1
    public final List<Double> component18() {
        return this.mBmiWHORange;
    }

    public final double component19() {
        return this.mBmr;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final List<Double> component20() {
        return this.mBmrRange;
    }

    public final double component21() {
        return this.mBodyShape;
    }

    public final double component22() {
        return this.mDesirableWeight;
    }

    public final double component23() {
        return this.mFatFreeBodyWeight;
    }

    public final double component24() {
        return this.mFatToControl;
    }

    public final double component25() {
        return this.mLevelOfVisceralFat;
    }

    @aa1
    public final List<Double> component26() {
        return this.mLevelOfVisceralFatRange;
    }

    public final double component27() {
        return this.mMuscleToControl;
    }

    @aa1
    public final List<Double> component28() {
        return this.mRatioOfFatRange;
    }

    public final double component29() {
        return this.mRatioOfMuscle;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    @aa1
    public final List<Double> component30() {
        return this.mRatioOfMuscleRange;
    }

    @aa1
    public final List<Double> component31() {
        return this.mRatioOfProteinRange;
    }

    public final double component32() {
        return this.mRatioOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> component33() {
        return this.mRatioOfSkeletalMuscleRange;
    }

    public final double component34() {
        return this.mRatioOfSubcutaneousFat;
    }

    @aa1
    public final List<Double> component35() {
        return this.mRatioOfSubcutaneousFatRange;
    }

    @aa1
    public final List<Double> component36() {
        return this.mRatioOfWaterRange;
    }

    public final double component37() {
        return this.mScore;
    }

    public final double component38() {
        return this.mWeightOfBone;
    }

    @aa1
    public final List<Double> component39() {
        return this.mWeightOfBoneRange;
    }

    public final float component4() {
        return this.mWeight;
    }

    @aa1
    public final List<Double> component40() {
        return this.mWeightOfFatRange;
    }

    @aa1
    public final List<Double> component41() {
        return this.mWeightOfMuscleRange;
    }

    public final double component42() {
        return this.mWeightOfProtein;
    }

    @aa1
    public final List<Double> component43() {
        return this.mWeightOfProteinRange;
    }

    public final double component44() {
        return this.mWeightOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> component45() {
        return this.mWeightOfSkeletalMuscleRange;
    }

    public final double component46() {
        return this.mWeightOfWater;
    }

    @aa1
    public final List<Double> component47() {
        return this.mWeightOfWaterRange;
    }

    @aa1
    public final List<Double> component48() {
        return this.mWeightRange;
    }

    public final double component49() {
        return this.mWeightToControl;
    }

    public final int component5() {
        return this.mIsSync;
    }

    @aa1
    public final List<Double> component50() {
        return this.mWeightWHORange;
    }

    public final int component51() {
        return this.mIsDelete;
    }

    public final int component52() {
        return this.mRatioOfProteinLevel;
    }

    public final int component53() {
        return this.mRatioOfWaterLevel;
    }

    public final int component6() {
        return this.mIsMeasure;
    }

    public final double component7() {
        return this.mBmi;
    }

    public final double component8() {
        return this.mRatioOfFat;
    }

    public final double component9() {
        return this.mWeightOfMuscle;
    }

    @aa1
    public final Weight copy(int r82, long r83, @aa1 String r85, float r86, int r87, int r88, double r89, double r91, double r93, double r95, double r97, double r99, double r101, double r103, double r105, @aa1 List<Double> r107, @aa1 List<Double> r108, @aa1 List<Double> r109, double r110, @aa1 List<Double> r112, double r113, double r115, double r117, double r119, double r121, @aa1 List<Double> r123, double r124, @aa1 List<Double> r126, double r127, @aa1 List<Double> r129, @aa1 List<Double> r130, double r131, @aa1 List<Double> r133, double r134, @aa1 List<Double> r136, @aa1 List<Double> r137, double r138, double r140, @aa1 List<Double> r142, @aa1 List<Double> r143, @aa1 List<Double> r144, double r145, @aa1 List<Double> r147, double r148, @aa1 List<Double> r150, double r151, @aa1 List<Double> r153, @aa1 List<Double> r154, double r155, @aa1 List<Double> r157, int r158, int r159, int r160) {
        Intrinsics.X0O(r85, "mLocalTime");
        Intrinsics.X0O(r107, "mAgeOfBodyRange");
        Intrinsics.X0O(r108, "mBmiRange");
        Intrinsics.X0O(r109, "mBmiWHORange");
        Intrinsics.X0O(r112, "mBmrRange");
        Intrinsics.X0O(r123, "mLevelOfVisceralFatRange");
        Intrinsics.X0O(r126, "mRatioOfFatRange");
        Intrinsics.X0O(r129, "mRatioOfMuscleRange");
        Intrinsics.X0O(r130, "mRatioOfProteinRange");
        Intrinsics.X0O(r133, "mRatioOfSkeletalMuscleRange");
        Intrinsics.X0O(r136, "mRatioOfSubcutaneousFatRange");
        Intrinsics.X0O(r137, "mRatioOfWaterRange");
        Intrinsics.X0O(r142, "mWeightOfBoneRange");
        Intrinsics.X0O(r143, "mWeightOfFatRange");
        Intrinsics.X0O(r144, "mWeightOfMuscleRange");
        Intrinsics.X0O(r147, "mWeightOfProteinRange");
        Intrinsics.X0O(r150, "mWeightOfSkeletalMuscleRange");
        Intrinsics.X0O(r153, "mWeightOfWaterRange");
        Intrinsics.X0O(r154, "mWeightRange");
        Intrinsics.X0O(r157, "mWeightWHORange");
        return new Weight(r82, r83, r85, r86, r87, r88, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r108, r109, r110, r112, r113, r115, r117, r119, r121, r123, r124, r126, r127, r129, r130, r131, r133, r134, r136, r137, r138, r140, r142, r143, r144, r145, r147, r148, r150, r151, r153, r154, r155, r157, r158, r159, r160);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Weight) == true) goto L8;
        return false;
    L8:
        Weight r9 = (Weight) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.mWeight, r9.mWeight) == 0) goto L21;
        return false;
    L21:
        if (this.mIsSync == r9.mIsSync) goto L24;
        return false;
    L24:
        if (this.mIsMeasure == r9.mIsMeasure) goto L27;
        return false;
    L27:
        if (Double.compare(this.mBmi, r9.mBmi) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.mRatioOfFat, r9.mRatioOfFat) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.mWeightOfMuscle, r9.mWeightOfMuscle) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.mWeightOfFat, r9.mWeightOfFat) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.mRatioOfProtein, r9.mRatioOfProtein) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.mRatioOfWater, r9.mRatioOfWater) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.mStateOfNutrition, r9.mStateOfNutrition) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.mIdealWeight, r9.mIdealWeight) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.mAgeOfBody, r9.mAgeOfBody) == 0) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.mAgeOfBodyRange, r9.mAgeOfBodyRange) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.mBmiRange, r9.mBmiRange) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mBmiWHORange, r9.mBmiWHORange) == true) goto L63;
        return false;
    L63:
        if (Double.compare(this.mBmr, r9.mBmr) == 0) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.mBmrRange, r9.mBmrRange) == true) goto L69;
        return false;
    L69:
        if (Double.compare(this.mBodyShape, r9.mBodyShape) == 0) goto L72;
        return false;
    L72:
        if (Double.compare(this.mDesirableWeight, r9.mDesirableWeight) == 0) goto L75;
        return false;
    L75:
        if (Double.compare(this.mFatFreeBodyWeight, r9.mFatFreeBodyWeight) == 0) goto L78;
        return false;
    L78:
        if (Double.compare(this.mFatToControl, r9.mFatToControl) == 0) goto L81;
        return false;
    L81:
        if (Double.compare(this.mLevelOfVisceralFat, r9.mLevelOfVisceralFat) == 0) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.mLevelOfVisceralFatRange, r9.mLevelOfVisceralFatRange) == true) goto L87;
        return false;
    L87:
        if (Double.compare(this.mMuscleToControl, r9.mMuscleToControl) == 0) goto L90;
        return false;
    L90:
        if (Intrinsics.XOO0ii0(this.mRatioOfFatRange, r9.mRatioOfFatRange) == true) goto L93;
        return false;
    L93:
        if (Double.compare(this.mRatioOfMuscle, r9.mRatioOfMuscle) == 0) goto L96;
        return false;
    L96:
        if (Intrinsics.XOO0ii0(this.mRatioOfMuscleRange, r9.mRatioOfMuscleRange) == true) goto L99;
        return false;
    L99:
        if (Intrinsics.XOO0ii0(this.mRatioOfProteinRange, r9.mRatioOfProteinRange) == true) goto L102;
        return false;
    L102:
        if (Double.compare(this.mRatioOfSkeletalMuscle, r9.mRatioOfSkeletalMuscle) == 0) goto L105;
        return false;
    L105:
        if (Intrinsics.XOO0ii0(this.mRatioOfSkeletalMuscleRange, r9.mRatioOfSkeletalMuscleRange) == true) goto L108;
        return false;
    L108:
        if (Double.compare(this.mRatioOfSubcutaneousFat, r9.mRatioOfSubcutaneousFat) == 0) goto L111;
        return false;
    L111:
        if (Intrinsics.XOO0ii0(this.mRatioOfSubcutaneousFatRange, r9.mRatioOfSubcutaneousFatRange) == true) goto L114;
        return false;
    L114:
        if (Intrinsics.XOO0ii0(this.mRatioOfWaterRange, r9.mRatioOfWaterRange) == true) goto L117;
        return false;
    L117:
        if (Double.compare(this.mScore, r9.mScore) == 0) goto L120;
        return false;
    L120:
        if (Double.compare(this.mWeightOfBone, r9.mWeightOfBone) == 0) goto L123;
        return false;
    L123:
        if (Intrinsics.XOO0ii0(this.mWeightOfBoneRange, r9.mWeightOfBoneRange) == true) goto L126;
        return false;
    L126:
        if (Intrinsics.XOO0ii0(this.mWeightOfFatRange, r9.mWeightOfFatRange) == true) goto L129;
        return false;
    L129:
        if (Intrinsics.XOO0ii0(this.mWeightOfMuscleRange, r9.mWeightOfMuscleRange) == true) goto L132;
        return false;
    L132:
        if (Double.compare(this.mWeightOfProtein, r9.mWeightOfProtein) == 0) goto L135;
        return false;
    L135:
        if (Intrinsics.XOO0ii0(this.mWeightOfProteinRange, r9.mWeightOfProteinRange) == true) goto L138;
        return false;
    L138:
        if (Double.compare(this.mWeightOfSkeletalMuscle, r9.mWeightOfSkeletalMuscle) == 0) goto L141;
        return false;
    L141:
        if (Intrinsics.XOO0ii0(this.mWeightOfSkeletalMuscleRange, r9.mWeightOfSkeletalMuscleRange) == true) goto L144;
        return false;
    L144:
        if (Double.compare(this.mWeightOfWater, r9.mWeightOfWater) == 0) goto L147;
        return false;
    L147:
        if (Intrinsics.XOO0ii0(this.mWeightOfWaterRange, r9.mWeightOfWaterRange) == true) goto L150;
        return false;
    L150:
        if (Intrinsics.XOO0ii0(this.mWeightRange, r9.mWeightRange) == true) goto L153;
        return false;
    L153:
        if (Double.compare(this.mWeightToControl, r9.mWeightToControl) == 0) goto L156;
        return false;
    L156:
        if (Intrinsics.XOO0ii0(this.mWeightWHORange, r9.mWeightWHORange) == true) goto L159;
        return false;
    L159:
        if (this.mIsDelete == r9.mIsDelete) goto L162;
        return false;
    L162:
        if (this.mRatioOfProteinLevel == r9.mRatioOfProteinLevel) goto L165;
        return false;
    L165:
        if (this.mRatioOfWaterLevel == r9.mRatioOfWaterLevel) goto L167;
        return false;
    L167:
        return true;
    }

    public final double getMAgeOfBody() {
        return this.mAgeOfBody;
    }

    @aa1
    public final List<Double> getMAgeOfBodyRange() {
        return this.mAgeOfBodyRange;
    }

    public final double getMBmi() {
        return this.mBmi;
    }

    @aa1
    public final List<Double> getMBmiRange() {
        return this.mBmiRange;
    }

    @aa1
    public final List<Double> getMBmiWHORange() {
        return this.mBmiWHORange;
    }

    public final double getMBmr() {
        return this.mBmr;
    }

    @aa1
    public final List<Double> getMBmrRange() {
        return this.mBmrRange;
    }

    public final double getMBodyShape() {
        return this.mBodyShape;
    }

    public final double getMDesirableWeight() {
        return this.mDesirableWeight;
    }

    public final double getMFatFreeBodyWeight() {
        return this.mFatFreeBodyWeight;
    }

    public final double getMFatToControl() {
        return this.mFatToControl;
    }

    public final int getMId() {
        return this.mId;
    }

    public final double getMIdealWeight() {
        return this.mIdealWeight;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsMeasure() {
        return this.mIsMeasure;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final double getMLevelOfVisceralFat() {
        return this.mLevelOfVisceralFat;
    }

    @aa1
    public final List<Double> getMLevelOfVisceralFatRange() {
        return this.mLevelOfVisceralFatRange;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final double getMMuscleToControl() {
        return this.mMuscleToControl;
    }

    public final double getMRatioOfFat() {
        return this.mRatioOfFat;
    }

    @aa1
    public final List<Double> getMRatioOfFatRange() {
        return this.mRatioOfFatRange;
    }

    public final double getMRatioOfMuscle() {
        return this.mRatioOfMuscle;
    }

    @aa1
    public final List<Double> getMRatioOfMuscleRange() {
        return this.mRatioOfMuscleRange;
    }

    public final double getMRatioOfProtein() {
        return this.mRatioOfProtein;
    }

    public final int getMRatioOfProteinLevel() {
        return this.mRatioOfProteinLevel;
    }

    @aa1
    public final List<Double> getMRatioOfProteinRange() {
        return this.mRatioOfProteinRange;
    }

    public final double getMRatioOfSkeletalMuscle() {
        return this.mRatioOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> getMRatioOfSkeletalMuscleRange() {
        return this.mRatioOfSkeletalMuscleRange;
    }

    public final double getMRatioOfSubcutaneousFat() {
        return this.mRatioOfSubcutaneousFat;
    }

    @aa1
    public final List<Double> getMRatioOfSubcutaneousFatRange() {
        return this.mRatioOfSubcutaneousFatRange;
    }

    public final double getMRatioOfWater() {
        return this.mRatioOfWater;
    }

    public final int getMRatioOfWaterLevel() {
        return this.mRatioOfWaterLevel;
    }

    @aa1
    public final List<Double> getMRatioOfWaterRange() {
        return this.mRatioOfWaterRange;
    }

    public final double getMScore() {
        return this.mScore;
    }

    public final double getMStateOfNutrition() {
        return this.mStateOfNutrition;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final float getMWeight() {
        return this.mWeight;
    }

    public final double getMWeightOfBone() {
        return this.mWeightOfBone;
    }

    @aa1
    public final List<Double> getMWeightOfBoneRange() {
        return this.mWeightOfBoneRange;
    }

    public final double getMWeightOfFat() {
        return this.mWeightOfFat;
    }

    @aa1
    public final List<Double> getMWeightOfFatRange() {
        return this.mWeightOfFatRange;
    }

    public final double getMWeightOfMuscle() {
        return this.mWeightOfMuscle;
    }

    @aa1
    public final List<Double> getMWeightOfMuscleRange() {
        return this.mWeightOfMuscleRange;
    }

    public final double getMWeightOfProtein() {
        return this.mWeightOfProtein;
    }

    @aa1
    public final List<Double> getMWeightOfProteinRange() {
        return this.mWeightOfProteinRange;
    }

    public final double getMWeightOfSkeletalMuscle() {
        return this.mWeightOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> getMWeightOfSkeletalMuscleRange() {
        return this.mWeightOfSkeletalMuscleRange;
    }

    public final double getMWeightOfWater() {
        return this.mWeightOfWater;
    }

    @aa1
    public final List<Double> getMWeightOfWaterRange() {
        return this.mWeightOfWaterRange;
    }

    @aa1
    public final List<Double> getMWeightRange() {
        return this.mWeightRange;
    }

    public final double getMWeightToControl() {
        return this.mWeightToControl;
    }

    @aa1
    public final List<Double> getMWeightWHORange() {
        return this.mWeightWHORange;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Float.hashCode(this.mWeight)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsMeasure)) * 31) + Double.hashCode(this.mBmi)) * 31) + Double.hashCode(this.mRatioOfFat)) * 31) + Double.hashCode(this.mWeightOfMuscle)) * 31) + Double.hashCode(this.mWeightOfFat)) * 31) + Double.hashCode(this.mRatioOfProtein)) * 31) + Double.hashCode(this.mRatioOfWater)) * 31) + Double.hashCode(this.mStateOfNutrition)) * 31) + Double.hashCode(this.mIdealWeight)) * 31) + Double.hashCode(this.mAgeOfBody)) * 31) + this.mAgeOfBodyRange.hashCode()) * 31) + this.mBmiRange.hashCode()) * 31) + this.mBmiWHORange.hashCode()) * 31) + Double.hashCode(this.mBmr)) * 31) + this.mBmrRange.hashCode()) * 31) + Double.hashCode(this.mBodyShape)) * 31) + Double.hashCode(this.mDesirableWeight)) * 31) + Double.hashCode(this.mFatFreeBodyWeight)) * 31) + Double.hashCode(this.mFatToControl)) * 31) + Double.hashCode(this.mLevelOfVisceralFat)) * 31) + this.mLevelOfVisceralFatRange.hashCode()) * 31) + Double.hashCode(this.mMuscleToControl)) * 31) + this.mRatioOfFatRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfMuscle)) * 31) + this.mRatioOfMuscleRange.hashCode()) * 31) + this.mRatioOfProteinRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfSkeletalMuscle)) * 31) + this.mRatioOfSkeletalMuscleRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfSubcutaneousFat)) * 31) + this.mRatioOfSubcutaneousFatRange.hashCode()) * 31) + this.mRatioOfWaterRange.hashCode()) * 31) + Double.hashCode(this.mScore)) * 31) + Double.hashCode(this.mWeightOfBone)) * 31) + this.mWeightOfBoneRange.hashCode()) * 31) + this.mWeightOfFatRange.hashCode()) * 31) + this.mWeightOfMuscleRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfProtein)) * 31) + this.mWeightOfProteinRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfSkeletalMuscle)) * 31) + this.mWeightOfSkeletalMuscleRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfWater)) * 31) + this.mWeightOfWaterRange.hashCode()) * 31) + this.mWeightRange.hashCode()) * 31) + Double.hashCode(this.mWeightToControl)) * 31) + this.mWeightWHORange.hashCode()) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Integer.hashCode(this.mRatioOfProteinLevel)) * 31) + Integer.hashCode(this.mRatioOfWaterLevel);
    }

    public final void setBodyFatScale(@aa1 X01O1XO0i r4) {
        Intrinsics.X0O(r4, "bodyFatScale");
        long r0 = System.currentTimeMillis();
        this.mTime = r0;
        String r1 = TimeUtils.millis2String(r0, O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r1, "millis2String(...)");
        this.mLocalTime = r1;
        this.mWeight = (float) r4.XOO0ii0().iiII();
        this.mIsMeasure = 1;
        this.mBmi = r4.XOO0ii0().XO0X10iO();
        this.mRatioOfFat = r4.XOO0ii0().IX1XiI();
        this.mWeightOfMuscle = r4.XOO0ii0().iOX();
        this.mWeightOfFat = r4.XOO0ii0().O101();
        this.mRatioOfProtein = r4.XOO0ii0().Xi1i0XOX0();
        this.mRatioOfWater = r4.XOO0ii0().iIi1();
        this.mStateOfNutrition = r4.XOO0ii0().X1OI();
        this.mIdealWeight = r4.XOO0ii0().XOXiX0();
        this.mAgeOfBody = r4.XOO0ii0().i0X000X0O();
        this.mAgeOfBodyRange = r4.XOO0ii0().i11I();
        this.mBmiRange = r4.XOO0ii0().Ii0X0X();
        this.mBmiWHORange = r4.XOO0ii0().XXiIiX10();
        this.mBmr = r4.XOO0ii0().X00Xi1X();
        this.mBmrRange = r4.XOO0ii0().X1();
        this.mBodyShape = r4.XOO0ii0().IXOIIIO();
        this.mDesirableWeight = r4.XOO0ii0().IO0II0i();
        this.mFatFreeBodyWeight = r4.XOO0ii0().IXI();
        this.mFatToControl = r4.XOO0ii0().IiiXiI0I();
        this.mLevelOfVisceralFat = r4.XOO0ii0().XOO0XOOii();
        this.mLevelOfVisceralFatRange = r4.XOO0ii0().iiIOiX();
        this.mMuscleToControl = r4.XOO0ii0().Oi();
        this.mRatioOfFatRange = r4.XOO0ii0().XXiO0i();
        this.mRatioOfMuscle = r4.XOO0ii0().iXi();
        this.mRatioOfMuscleRange = r4.XOO0ii0().O0O();
        this.mRatioOfProteinRange = r4.XOO0ii0().iii0();
        this.mRatioOfSkeletalMuscle = r4.XOO0ii0().Xii11I();
        this.mRatioOfSkeletalMuscleRange = r4.XOO0ii0().X0iO();
        this.mRatioOfSubcutaneousFat = r4.XOO0ii0().X00O0();
        this.mRatioOfSubcutaneousFatRange = r4.XOO0ii0().X111IO();
        this.mRatioOfWaterRange = r4.XOO0ii0().i100IXOX();
        this.mScore = r4.XOO0ii0().iI0I();
        this.mWeightOfBone = r4.XOO0ii0().I0();
        this.mWeightOfBoneRange = r4.XOO0ii0().iIi0();
        this.mWeightOfFatRange = r4.XOO0ii0().IXiOXO();
        this.mWeightOfMuscleRange = r4.XOO0ii0().XXI0XOIX();
        this.mWeightOfProtein = r4.XOO0ii0().XIIO11I();
        this.mWeightOfProteinRange = r4.XOO0ii0().XXOXi();
        this.mWeightOfSkeletalMuscle = r4.XOO0ii0().I0XXi0X();
        this.mWeightOfSkeletalMuscleRange = r4.XOO0ii0().IOi1O0();
        this.mWeightOfWater = r4.XOO0ii0().O1();
        this.mWeightOfWaterRange = r4.XOO0ii0().O1iXiI();
        this.mWeightRange = r4.XOO0ii0().IX0iIX();
        this.mWeightToControl = r4.XOO0ii0().OXi001();
        this.mWeightWHORange = r4.XOO0ii0().I0IIOI();
    }

    public final void setMAgeOfBody(double r1) {
        this.mAgeOfBody = r1;
    }

    public final void setMAgeOfBodyRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAgeOfBodyRange = r2;
    }

    public final void setMBmi(double r1) {
        this.mBmi = r1;
    }

    public final void setMBmiRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBmiRange = r2;
    }

    public final void setMBmiWHORange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBmiWHORange = r2;
    }

    public final void setMBmr(double r1) {
        this.mBmr = r1;
    }

    public final void setMBmrRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBmrRange = r2;
    }

    public final void setMBodyShape(double r1) {
        this.mBodyShape = r1;
    }

    public final void setMDesirableWeight(double r1) {
        this.mDesirableWeight = r1;
    }

    public final void setMFatFreeBodyWeight(double r1) {
        this.mFatFreeBodyWeight = r1;
    }

    public final void setMFatToControl(double r1) {
        this.mFatToControl = r1;
    }

    public final void setMIdealWeight(double r1) {
        this.mIdealWeight = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsMeasure(int r1) {
        this.mIsMeasure = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLevelOfVisceralFat(double r1) {
        this.mLevelOfVisceralFat = r1;
    }

    public final void setMLevelOfVisceralFatRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLevelOfVisceralFatRange = r2;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMMuscleToControl(double r1) {
        this.mMuscleToControl = r1;
    }

    public final void setMRatioOfFat(double r1) {
        this.mRatioOfFat = r1;
    }

    public final void setMRatioOfFatRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfFatRange = r2;
    }

    public final void setMRatioOfMuscle(double r1) {
        this.mRatioOfMuscle = r1;
    }

    public final void setMRatioOfMuscleRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfMuscleRange = r2;
    }

    public final void setMRatioOfProtein(double r1) {
        this.mRatioOfProtein = r1;
    }

    public final void setMRatioOfProteinLevel(int r1) {
        this.mRatioOfProteinLevel = r1;
    }

    public final void setMRatioOfProteinRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfProteinRange = r2;
    }

    public final void setMRatioOfSkeletalMuscle(double r1) {
        this.mRatioOfSkeletalMuscle = r1;
    }

    public final void setMRatioOfSkeletalMuscleRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfSkeletalMuscleRange = r2;
    }

    public final void setMRatioOfSubcutaneousFat(double r1) {
        this.mRatioOfSubcutaneousFat = r1;
    }

    public final void setMRatioOfSubcutaneousFatRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfSubcutaneousFatRange = r2;
    }

    public final void setMRatioOfWater(double r1) {
        this.mRatioOfWater = r1;
    }

    public final void setMRatioOfWaterLevel(int r1) {
        this.mRatioOfWaterLevel = r1;
    }

    public final void setMRatioOfWaterRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRatioOfWaterRange = r2;
    }

    public final void setMScore(double r1) {
        this.mScore = r1;
    }

    public final void setMStateOfNutrition(double r1) {
        this.mStateOfNutrition = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMWeight(float r1) {
        this.mWeight = r1;
    }

    public final void setMWeightOfBone(double r1) {
        this.mWeightOfBone = r1;
    }

    public final void setMWeightOfBoneRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfBoneRange = r2;
    }

    public final void setMWeightOfFat(double r1) {
        this.mWeightOfFat = r1;
    }

    public final void setMWeightOfFatRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfFatRange = r2;
    }

    public final void setMWeightOfMuscle(double r1) {
        this.mWeightOfMuscle = r1;
    }

    public final void setMWeightOfMuscleRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfMuscleRange = r2;
    }

    public final void setMWeightOfProtein(double r1) {
        this.mWeightOfProtein = r1;
    }

    public final void setMWeightOfProteinRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfProteinRange = r2;
    }

    public final void setMWeightOfSkeletalMuscle(double r1) {
        this.mWeightOfSkeletalMuscle = r1;
    }

    public final void setMWeightOfSkeletalMuscleRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfSkeletalMuscleRange = r2;
    }

    public final void setMWeightOfWater(double r1) {
        this.mWeightOfWater = r1;
    }

    public final void setMWeightOfWaterRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightOfWaterRange = r2;
    }

    public final void setMWeightRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightRange = r2;
    }

    public final void setMWeightToControl(double r1) {
        this.mWeightToControl = r1;
    }

    public final void setMWeightWHORange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightWHORange = r2;
    }

    @aa1
    public String toString() {
        return "Weight(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mWeight=" + this.mWeight + ", mIsSync=" + this.mIsSync + ", mIsMeasure=" + this.mIsMeasure + ", mBmi=" + this.mBmi + ", mRatioOfFat=" + this.mRatioOfFat + ", mWeightOfMuscle=" + this.mWeightOfMuscle + ", mWeightOfFat=" + this.mWeightOfFat + ", mRatioOfProtein=" + this.mRatioOfProtein + ", mRatioOfWater=" + this.mRatioOfWater + ", mStateOfNutrition=" + this.mStateOfNutrition + ", mIdealWeight=" + this.mIdealWeight + ", mAgeOfBody=" + this.mAgeOfBody + ", mAgeOfBodyRange=" + this.mAgeOfBodyRange + ", mBmiRange=" + this.mBmiRange + ", mBmiWHORange=" + this.mBmiWHORange + ", mBmr=" + this.mBmr + ", mBmrRange=" + this.mBmrRange + ", mBodyShape=" + this.mBodyShape + ", mDesirableWeight=" + this.mDesirableWeight + ", mFatFreeBodyWeight=" + this.mFatFreeBodyWeight + ", mFatToControl=" + this.mFatToControl + ", mLevelOfVisceralFat=" + this.mLevelOfVisceralFat + ", mLevelOfVisceralFatRange=" + this.mLevelOfVisceralFatRange + ", mMuscleToControl=" + this.mMuscleToControl + ", mRatioOfFatRange=" + this.mRatioOfFatRange + ", mRatioOfMuscle=" + this.mRatioOfMuscle + ", mRatioOfMuscleRange=" + this.mRatioOfMuscleRange + ", mRatioOfProteinRange=" + this.mRatioOfProteinRange + ", mRatioOfSkeletalMuscle=" + this.mRatioOfSkeletalMuscle + ", mRatioOfSkeletalMuscleRange=" + this.mRatioOfSkeletalMuscleRange + ", mRatioOfSubcutaneousFat=" + this.mRatioOfSubcutaneousFat + ", mRatioOfSubcutaneousFatRange=" + this.mRatioOfSubcutaneousFatRange + ", mRatioOfWaterRange=" + this.mRatioOfWaterRange + ", mScore=" + this.mScore + ", mWeightOfBone=" + this.mWeightOfBone + ", mWeightOfBoneRange=" + this.mWeightOfBoneRange + ", mWeightOfFatRange=" + this.mWeightOfFatRange + ", mWeightOfMuscleRange=" + this.mWeightOfMuscleRange + ", mWeightOfProtein=" + this.mWeightOfProtein + ", mWeightOfProteinRange=" + this.mWeightOfProteinRange + ", mWeightOfSkeletalMuscle=" + this.mWeightOfSkeletalMuscle + ", mWeightOfSkeletalMuscleRange=" + this.mWeightOfSkeletalMuscleRange + ", mWeightOfWater=" + this.mWeightOfWater + ", mWeightOfWaterRange=" + this.mWeightOfWaterRange + ", mWeightRange=" + this.mWeightRange + ", mWeightToControl=" + this.mWeightToControl + ", mWeightWHORange=" + this.mWeightWHORange + ", mIsDelete=" + this.mIsDelete + ", mRatioOfProteinLevel=" + this.mRatioOfProteinLevel + ", mRatioOfWaterLevel=" + this.mRatioOfWaterLevel + I000IiI1O.iO.iO;
    }

    public Weight(int r17, long r18, @aa1 String r20, float r21, int r22, int r23, double r24, double r26, double r28, double r30, double r32, double r34, double r36, double r38, double r40, @aa1 List<Double> r42, @aa1 List<Double> r43, @aa1 List<Double> r44, double r45, @aa1 List<Double> r47, double r48, double r50, double r52, double r54, double r56, @aa1 List<Double> r58, double r59, @aa1 List<Double> r61, double r62, @aa1 List<Double> r64, @aa1 List<Double> r65, double r66, @aa1 List<Double> r68, double r69, @aa1 List<Double> r71, @aa1 List<Double> r72, double r73, double r75, @aa1 List<Double> r77, @aa1 List<Double> r78, @aa1 List<Double> r79, double r80, @aa1 List<Double> r82, double r83, @aa1 List<Double> r85, double r86, @aa1 List<Double> r88, @aa1 List<Double> r89, double r90, @aa1 List<Double> r92, int r93, int r94, int r95) {
        Intrinsics.X0O(r20, "mLocalTime");
        Intrinsics.X0O(r42, "mAgeOfBodyRange");
        Intrinsics.X0O(r43, "mBmiRange");
        Intrinsics.X0O(r44, "mBmiWHORange");
        Intrinsics.X0O(r47, "mBmrRange");
        Intrinsics.X0O(r58, "mLevelOfVisceralFatRange");
        Intrinsics.X0O(r61, "mRatioOfFatRange");
        Intrinsics.X0O(r64, "mRatioOfMuscleRange");
        Intrinsics.X0O(r65, "mRatioOfProteinRange");
        Intrinsics.X0O(r68, "mRatioOfSkeletalMuscleRange");
        Intrinsics.X0O(r71, "mRatioOfSubcutaneousFatRange");
        Intrinsics.X0O(r72, "mRatioOfWaterRange");
        Intrinsics.X0O(r77, "mWeightOfBoneRange");
        Intrinsics.X0O(r78, "mWeightOfFatRange");
        Intrinsics.X0O(r79, "mWeightOfMuscleRange");
        Intrinsics.X0O(r82, "mWeightOfProteinRange");
        Intrinsics.X0O(r85, "mWeightOfSkeletalMuscleRange");
        Intrinsics.X0O(r88, "mWeightOfWaterRange");
        Intrinsics.X0O(r89, "mWeightRange");
        Intrinsics.X0O(r92, "mWeightWHORange");
        this.mId = r17;
        this.mTime = r18;
        this.mLocalTime = r20;
        this.mWeight = r21;
        this.mIsSync = r22;
        this.mIsMeasure = r23;
        this.mBmi = r24;
        this.mRatioOfFat = r26;
        this.mWeightOfMuscle = r28;
        this.mWeightOfFat = r30;
        this.mRatioOfProtein = r32;
        this.mRatioOfWater = r34;
        this.mStateOfNutrition = r36;
        this.mIdealWeight = r38;
        this.mAgeOfBody = r40;
        this.mAgeOfBodyRange = r42;
        this.mBmiRange = r43;
        this.mBmiWHORange = r44;
        this.mBmr = r45;
        this.mBmrRange = r47;
        this.mBodyShape = r48;
        this.mDesirableWeight = r50;
        this.mFatFreeBodyWeight = r52;
        this.mFatToControl = r54;
        this.mLevelOfVisceralFat = r56;
        this.mLevelOfVisceralFatRange = r58;
        this.mMuscleToControl = r59;
        this.mRatioOfFatRange = r61;
        this.mRatioOfMuscle = r62;
        this.mRatioOfMuscleRange = r64;
        this.mRatioOfProteinRange = r65;
        this.mRatioOfSkeletalMuscle = r66;
        this.mRatioOfSkeletalMuscleRange = r68;
        this.mRatioOfSubcutaneousFat = r69;
        this.mRatioOfSubcutaneousFatRange = r71;
        this.mRatioOfWaterRange = r72;
        this.mScore = r73;
        this.mWeightOfBone = r75;
        this.mWeightOfBoneRange = r77;
        this.mWeightOfFatRange = r78;
        this.mWeightOfMuscleRange = r79;
        this.mWeightOfProtein = r80;
        this.mWeightOfProteinRange = r82;
        this.mWeightOfSkeletalMuscle = r83;
        this.mWeightOfSkeletalMuscleRange = r85;
        this.mWeightOfWater = r86;
        this.mWeightOfWaterRange = r88;
        this.mWeightRange = r89;
        this.mWeightToControl = r90;
        this.mWeightWHORange = r92;
        this.mIsDelete = r93;
        this.mRatioOfProteinLevel = r94;
        this.mRatioOfWaterLevel = r95;
    }

    public /* synthetic */ Weight(int r78, long r79, String r81, float r82, int r83, int r84, double r85, double r87, double r89, double r91, double r93, double r95, double r97, double r99, double r101, List r103, List r104, List r105, double r106, List r108, double r109, double r111, double r113, double r115, double r117, List r119, double r120, List r122, double r123, List r125, List r126, double r127, List r129, double r130, List r132, List r133, double r134, double r136, List r138, List r139, List r140, double r141, List r143, double r144, List r146, double r147, List r149, List r150, double r151, List r153, int r154, int r155, int r156, int r157, int r158, DefaultConstructorMarker r159) {
        if ((r157 & 1) == 0) goto L5;
        int r2 = 0;
    L7:
        if ((r157 & 2) == 0) goto L9;
        long r4 = 0;
    L11:
        if ((r157 & 4) == 0) goto L13;
        String r6 = "";
    L15:
        if ((r157 & 8) == 0) goto L17;
        float r7 = 0.0f;
    L19:
        if ((r157 & 16) == 0) goto L21;
        int r8 = 0;
    L23:
        if ((r157 & 32) == 0) goto L25;
        int r9 = 0;
    L27:
        if ((r157 & 64) == 0) goto L29;
        double r13 = 0.0d;
    L31:
        if ((r157 & 128) == 0) goto L33;
        double r15 = 0.0d;
    L35:
        if ((r157 & 256) == 0) goto L37;
        double r17 = 0.0d;
    L39:
        if ((r157 & 512) == 0) goto L41;
        double r19 = 0.0d;
    L43:
        if ((r157 & 1024) == 0) goto L45;
        double r21 = 0.0d;
    L47:
        if ((r157 & 2048) == 0) goto L49;
        double r23 = 0.0d;
    L51:
        if ((r157 & 4096) == 0) goto L53;
        double r25 = 0.0d;
    L55:
        if ((r157 & 8192) == 0) goto L57;
        double r27 = 0.0d;
    L59:
        if ((r157 & 16384) == 0) goto L61;
        double r29 = 0.0d;
    L63:
        if ((r157 & 32768) == 0) goto L65;
        List r31 = CollectionsKt__CollectionsKt.iI();
    L67:
        if ((r157 & 65536) == 0) goto L69;
        List r33 = CollectionsKt__CollectionsKt.iI();
    L71:
        if ((r157 & 131072) == 0) goto L73;
        List r35 = CollectionsKt__CollectionsKt.iI();
    L75:
        if ((r157 & 262144) == 0) goto L77;
        double r37 = 0.0d;
    L79:
        if ((r157 & 524288) == 0) goto L81;
        List r40 = CollectionsKt__CollectionsKt.iI();
    L83:
        if ((r157 & 1048576) == 0) goto L85;
        double r41 = 0.0d;
    L87:
        if ((r157 & 2097152) == 0) goto L89;
        double r43 = 0.0d;
    L91:
        if ((r157 & 4194304) == 0) goto L93;
        double r45 = 0.0d;
    L95:
        if ((r157 & 8388608) == 0) goto L97;
        double r47 = 0.0d;
    L99:
        if ((r157 & 16777216) == 0) goto L101;
        double r49 = 0.0d;
    L103:
        if ((r157 & 33554432) == 0) goto L105;
        List r51 = CollectionsKt__CollectionsKt.iI();
    L107:
        if ((r157 & 67108864) == 0) goto L109;
        double r52 = 0.0d;
    L111:
        if ((r157 & 134217728) == 0) goto L113;
        List r54 = CollectionsKt__CollectionsKt.iI();
    L115:
        if ((r157 & 268435456) == 0) goto L117;
        double r55 = 0.0d;
    L119:
        if ((r157 & 536870912) == 0) goto L121;
        List r57 = CollectionsKt__CollectionsKt.iI();
    L123:
        if ((r157 & 1073741824) == 0) goto L125;
        List r58 = CollectionsKt__CollectionsKt.iI();
    L127:
        if ((r157 & Integer.MIN_VALUE) == 0) goto L129;
        double r59 = 0.0d;
    L131:
        if ((r158 & 1) == 0) goto L133;
        List r0 = CollectionsKt__CollectionsKt.iI();
    L135:
        if ((r158 & 2) == 0) goto L137;
        double r61 = 0.0d;
    L139:
        if ((r158 & 4) == 0) goto L141;
        List r63 = CollectionsKt__CollectionsKt.iI();
    L143:
        if ((r158 & 8) == 0) goto L145;
        List r64 = CollectionsKt__CollectionsKt.iI();
    L147:
        if ((r158 & 16) == 0) goto L149;
        double r65 = 0.0d;
    L151:
        if ((r158 & 32) == 0) goto L153;
        double r67 = 0.0d;
    L155:
        if ((r158 & 64) == 0) goto L157;
        List r69 = CollectionsKt__CollectionsKt.iI();
    L159:
        if ((r158 & 128) == 0) goto L161;
        List r3 = CollectionsKt__CollectionsKt.iI();
    L163:
        if ((r158 & 256) == 0) goto L165;
        List r10 = CollectionsKt__CollectionsKt.iI();
    L167:
        if ((r158 & 512) == 0) goto L169;
        double r11 = 0.0d;
    L170:
        List r86 = r0;
        if ((r158 & 1024) == 0) goto L173;
        List r1 = CollectionsKt__CollectionsKt.iI();
    L174:
        List r88 = r1;
        if ((r158 & 2048) == 0) goto L177;
        double r70 = 0.0d;
    L179:
        if ((r158 & 4096) == 0) goto L181;
        List r5 = CollectionsKt__CollectionsKt.iI();
    L182:
        List r810 = r5;
        if ((r158 & 8192) == 0) goto L185;
        double r72 = 0.0d;
    L187:
        if ((r158 & 16384) == 0) goto L189;
        List r12 = CollectionsKt__CollectionsKt.iI();
    L191:
        if ((r158 & 32768) == 0) goto L193;
        List r74 = CollectionsKt__CollectionsKt.iI();
    L195:
        if ((r158 & 65536) == 0) goto L197;
        double r75 = 0.0d;
    L199:
        if ((r158 & 131072) == 0) goto L201;
        List r32 = CollectionsKt__CollectionsKt.iI();
    L203:
        if ((r158 & 262144) == 0) goto L205;
        int r34 = 0;
    L207:
        if ((r158 & 524288) == 0) goto L209;
        int r36 = 0;
    L211:
        if ((r158 & 1048576) == 0) goto L214;
        int r1510 = 0;
    L215:
        this(r2, r4, r6, r7, r8, r9, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r40, r41, r43, r45, r47, r49, r51, r52, r54, r55, r57, r58, r59, r86, r61, r63, r64, r65, r67, r69, r3, r10, r11, r88, r70, r810, r72, r12, r74, r75, r32, r34, r36, r1510);
        return;
    L214:
        r1510 = r156;
        goto L215
    L209:
        r36 = r155;
        goto L211
    L205:
        r34 = r154;
        goto L207
    L201:
        r32 = r153;
        goto L203
    L197:
        r75 = r151;
        goto L199
    L193:
        r74 = r150;
        goto L195
    L189:
        r12 = r149;
        goto L191
    L185:
        r72 = r147;
        goto L187
    L181:
        r5 = r146;
        goto L182
    L177:
        r70 = r144;
        goto L179
    L173:
        r1 = r143;
        goto L174
    L169:
        r11 = r141;
        goto L170
    L165:
        r10 = r140;
        goto L167
    L161:
        r3 = r139;
        goto L163
    L157:
        r69 = r138;
        goto L159
    L153:
        r67 = r136;
        goto L155
    L149:
        r65 = r134;
        goto L151
    L145:
        r64 = r133;
        goto L147
    L141:
        r63 = r132;
        goto L143
    L137:
        r61 = r130;
        goto L139
    L133:
        r0 = r129;
        goto L135
    L129:
        r59 = r127;
        goto L131
    L125:
        r58 = r126;
        goto L127
    L121:
        r57 = r125;
        goto L123
    L117:
        r55 = r123;
        goto L119
    L113:
        r54 = r122;
        goto L115
    L109:
        r52 = r120;
        goto L111
    L105:
        r51 = r119;
        goto L107
    L101:
        r49 = r117;
        goto L103
    L97:
        r47 = r115;
        goto L99
    L93:
        r45 = r113;
        goto L95
    L89:
        r43 = r111;
        goto L91
    L85:
        r41 = r109;
        goto L87
    L81:
        r40 = r108;
        goto L83
    L77:
        r37 = r106;
        goto L79
    L73:
        r35 = r105;
        goto L75
    L69:
        r33 = r104;
        goto L71
    L65:
        r31 = r103;
        goto L67
    L61:
        r29 = r101;
        goto L63
    L57:
        r27 = r99;
        goto L59
    L53:
        r25 = r97;
        goto L55
    L49:
        r23 = r95;
        goto L51
    L45:
        r21 = r93;
        goto L47
    L41:
        r19 = r91;
        goto L43
    L37:
        r17 = r89;
        goto L39
    L33:
        r15 = r87;
        goto L35
    L29:
        r13 = r85;
        goto L31
    L25:
        r9 = r84;
        goto L27
    L21:
        r8 = r83;
        goto L23
    L17:
        r7 = r82;
        goto L19
    L13:
        r6 = r81;
        goto L15
    L9:
        r4 = r79;
        goto L11
    L5:
        r2 = r78;
        goto L7
    }
}
