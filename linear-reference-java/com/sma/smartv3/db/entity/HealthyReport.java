package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class HealthyReport {

    @ColumnInfo
    private int mAbnormalNumber;

    @aa1
    @ColumnInfo
    private String mBloodGlucose2AIRecords;

    @ColumnInfo
    private long mBloodGlucose2Time;

    @ColumnInfo
    private float mBloodGlucose2Value;

    @aa1
    @ColumnInfo
    private String mBloodOxygenAIRecords;

    @ColumnInfo
    private long mBloodOxygenTime;

    @ColumnInfo
    private int mBloodOxygenValue;

    @aa1
    @ColumnInfo
    private String mBloodPressureAIRecords;

    @ColumnInfo
    private long mBloodPressureTime;

    @ColumnInfo
    private int mDiastolicValue;

    @aa1
    @ColumnInfo
    private String mHeartRateAIRecords;

    @ColumnInfo
    private long mHeartRateTime;

    @ColumnInfo
    private int mHeartRateValue;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @ColumnInfo
    private String mPressureAIRecords;

    @ColumnInfo
    private long mPressureTime;

    @ColumnInfo
    private int mPressureValue;

    @aa1
    @ColumnInfo
    private String mSleepAIRecords;

    @ColumnInfo
    private float mSleepDeepLengthTime;

    @ColumnInfo
    private float mSleepPiecemealTime;

    @ColumnInfo
    private long mSleepTime;

    @ColumnInfo
    private int mSystolicValue;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mUserGender;

    @ColumnInfo
    private float mUserHeight;

    @ColumnInfo
    private float mUserWeight;

    @aa1
    @ColumnInfo
    private String mWeekSportsAIRecords;

    @ColumnInfo
    private int mWeekSportsAllTime;

    @ColumnInfo
    private int mWeekSportsNumber;

    @ColumnInfo
    private long mWeekSportsTime;

    @aa1
    @ColumnInfo
    private String mWeightAIRecords;

    @ColumnInfo
    private long mWeightTime;

    @ColumnInfo
    private float mWeightValue;

    public HealthyReport() {
        int r1 = 0;
        int r2 = 0;
        float r3 = 0.0f;
        float r4 = 0.0f;
        long r5 = 0;
        String r7 = null;
        int r8 = 0;
        long r9 = 0;
        int r11 = 0;
        String r12 = null;
        long r13 = 0;
        int r15 = 0;
        int r16 = 0;
        String r17 = null;
        long r18 = 0;
        int r20 = 0;
        String r21 = null;
        long r22 = 0;
        float r24 = 0.0f;
        float r25 = 0.0f;
        String r26 = null;
        long r27 = 0;
        int r29 = 0;
        String r30 = null;
        long r31 = 0;
        float r33 = 0.0f;
        String r34 = null;
        long r35 = 0;
        float r37 = 0.0f;
        String r38 = null;
        long r39 = 0;
        int r41 = 0;
        int r42 = 0;
        String r43 = null;
        int r44 = 0;
        int r45 = -1;
        this(r1, r2, r3, r4, r5, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r33, r34, r35, r37, r38, r39, r41, r42, r43, r44, r45, 7, null);
    }

    public static /* synthetic */ HealthyReport copy$default(HealthyReport r17, int r18, int r19, float r20, float r21, long r22, String r24, int r25, long r26, int r28, String r29, long r30, int r32, int r33, String r34, long r35, int r37, String r38, long r39, float r41, float r42, String r43, long r44, int r46, String r47, long r48, float r50, String r51, long r52, float r54, String r55, long r56, int r58, int r59, String r60, int r61, int r62, int r63, Object r64) {
        if ((r62 & 1) == 0) goto L5;
        int r2 = r17.mId;
    L7:
        if ((r62 & 2) == 0) goto L9;
        int r3 = r17.mUserGender;
    L11:
        if ((r62 & 4) == 0) goto L13;
        float r4 = r17.mUserWeight;
    L15:
        if ((r62 & 8) == 0) goto L17;
        float r5 = r17.mUserHeight;
    L19:
        if ((r62 & 16) == 0) goto L21;
        long r6 = r17.mTime;
    L23:
        if ((r62 & 32) == 0) goto L25;
        String r8 = r17.mLocalTime;
    L27:
        if ((r62 & 64) == 0) goto L29;
        int r9 = r17.mAbnormalNumber;
    L31:
        if ((r62 & 128) == 0) goto L33;
        long r10 = r17.mHeartRateTime;
    L35:
        if ((r62 & 256) == 0) goto L37;
        int r12 = r17.mHeartRateValue;
    L39:
        if ((r62 & 512) == 0) goto L41;
        String r13 = r17.mHeartRateAIRecords;
    L43:
        if ((r62 & 1024) == 0) goto L45;
        long r14 = r17.mBloodPressureTime;
    L46:
        int r110 = r2;
        if ((r62 & 2048) == 0) goto L49;
        int r7 = r17.mSystolicValue;
    L50:
        int r111 = r7;
        if ((r62 & 4096) == 0) goto L53;
        int r11 = r17.mDiastolicValue;
    L54:
        int r23 = r11;
        if ((r62 & 8192) == 0) goto L57;
        String r15 = r17.mBloodPressureAIRecords;
    L58:
        String r27 = r15;
        if ((r62 & 16384) == 0) goto L61;
        long r1 = r17.mBloodOxygenTime;
    L62:
        long r210 = r1;
        if ((r62 & 32768) == 0) goto L65;
        int r16 = r17.mBloodOxygenValue;
    L67:
        if ((r62 & 65536) == 0) goto L69;
        String r31 = r17.mBloodOxygenAIRecords;
    L70:
        int r211 = r16;
        String r212 = r31;
        if ((r62 & 131072) == 0) goto L73;
        long r36 = r17.mSleepTime;
    L74:
        long r213 = r36;
        if ((r62 & 262144) == 0) goto L77;
        float r40 = r17.mSleepDeepLengthTime;
    L79:
        if ((r62 & 524288) == 0) goto L81;
        float r45 = r17.mSleepPiecemealTime;
    L82:
        float r214 = r40;
        if ((r62 & 1048576) == 0) goto L85;
        String r49 = r17.mSleepAIRecords;
    L86:
        String r310 = r49;
        float r215 = r45;
        if ((r62 & 2097152) == 0) goto L89;
        long r53 = r17.mPressureTime;
    L90:
        long r311 = r53;
        if ((r62 & 4194304) == 0) goto L93;
        int r57 = r17.mPressureValue;
    L95:
        if ((r62 & 8388608) == 0) goto L97;
        String r65 = r17.mPressureAIRecords;
    L98:
        int r312 = r57;
        String r313 = r65;
        if ((r62 & 16777216) == 0) goto L101;
        long r66 = r17.mBloodGlucose2Time;
    L102:
        long r314 = r66;
        if ((r62 & 33554432) == 0) goto L105;
        float r67 = r17.mBloodGlucose2Value;
    L107:
        if ((r62 & 67108864) == 0) goto L109;
        String r68 = r17.mBloodGlucose2AIRecords;
    L110:
        float r315 = r67;
        String r316 = r68;
        if ((r62 & 134217728) == 0) goto L113;
        long r69 = r17.mWeightTime;
    L114:
        long r317 = r69;
        if ((r62 & 268435456) == 0) goto L117;
        float r70 = r17.mWeightValue;
    L119:
        if ((r62 & 536870912) == 0) goto L121;
        String r71 = r17.mWeightAIRecords;
    L122:
        float r410 = r70;
        String r411 = r71;
        if ((r62 & 1073741824) == 0) goto L125;
        long r72 = r17.mWeekSportsTime;
    L126:
        long r412 = r72;
        if ((r62 & Integer.MIN_VALUE) == 0) goto L129;
        int r73 = r17.mWeekSportsNumber;
    L131:
        if ((r63 & 1) == 0) goto L133;
        int r74 = r17.mWeekSportsAllTime;
    L134:
        int r413 = r73;
        if ((r63 & 2) == 0) goto L137;
        String r75 = r17.mWeekSportsAIRecords;
    L139:
        if ((r63 & 4) == 0) goto L142;
        String r414 = r75;
        String r610 = r414;
        int r611 = r17.mIsSync;
    L144:
        return r17.copy(r110, r3, r4, r5, r6, r8, r9, r10, r12, r13, r14, r111, r23, r27, r210, r211, r212, r213, r214, r215, r310, r311, r312, r313, r314, r315, r316, r317, r410, r411, r412, r413, r74, r610, r611);
    L142:
        r611 = r61;
        r610 = r75;
        goto L144
    L137:
        r75 = r60;
        goto L139
    L133:
        r74 = r59;
        goto L134
    L129:
        r73 = r58;
        goto L131
    L125:
        r72 = r56;
        goto L126
    L121:
        r71 = r55;
        goto L122
    L117:
        r70 = r54;
        goto L119
    L113:
        r69 = r52;
        goto L114
    L109:
        r68 = r51;
        goto L110
    L105:
        r67 = r50;
        goto L107
    L101:
        r66 = r48;
        goto L102
    L97:
        r65 = r47;
        goto L98
    L93:
        r57 = r46;
        goto L95
    L89:
        r53 = r44;
        goto L90
    L85:
        r49 = r43;
        goto L86
    L81:
        r45 = r42;
        goto L82
    L77:
        r40 = r41;
        goto L79
    L73:
        r36 = r39;
        goto L74
    L69:
        r31 = r38;
        goto L70
    L65:
        r16 = r37;
        goto L67
    L61:
        r1 = r35;
        goto L62
    L57:
        r15 = r34;
        goto L58
    L53:
        r11 = r33;
        goto L54
    L49:
        r7 = r32;
        goto L50
    L45:
        r14 = r30;
        goto L46
    L41:
        r13 = r29;
        goto L43
    L37:
        r12 = r28;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component10() {
        return this.mHeartRateAIRecords;
    }

    public final long component11() {
        return this.mBloodPressureTime;
    }

    public final int component12() {
        return this.mSystolicValue;
    }

    public final int component13() {
        return this.mDiastolicValue;
    }

    @aa1
    public final String component14() {
        return this.mBloodPressureAIRecords;
    }

    public final long component15() {
        return this.mBloodOxygenTime;
    }

    public final int component16() {
        return this.mBloodOxygenValue;
    }

    @aa1
    public final String component17() {
        return this.mBloodOxygenAIRecords;
    }

    public final long component18() {
        return this.mSleepTime;
    }

    public final float component19() {
        return this.mSleepDeepLengthTime;
    }

    public final int component2() {
        return this.mUserGender;
    }

    public final float component20() {
        return this.mSleepPiecemealTime;
    }

    @aa1
    public final String component21() {
        return this.mSleepAIRecords;
    }

    public final long component22() {
        return this.mPressureTime;
    }

    public final int component23() {
        return this.mPressureValue;
    }

    @aa1
    public final String component24() {
        return this.mPressureAIRecords;
    }

    public final long component25() {
        return this.mBloodGlucose2Time;
    }

    public final float component26() {
        return this.mBloodGlucose2Value;
    }

    @aa1
    public final String component27() {
        return this.mBloodGlucose2AIRecords;
    }

    public final long component28() {
        return this.mWeightTime;
    }

    public final float component29() {
        return this.mWeightValue;
    }

    public final float component3() {
        return this.mUserWeight;
    }

    @aa1
    public final String component30() {
        return this.mWeightAIRecords;
    }

    public final long component31() {
        return this.mWeekSportsTime;
    }

    public final int component32() {
        return this.mWeekSportsNumber;
    }

    public final int component33() {
        return this.mWeekSportsAllTime;
    }

    @aa1
    public final String component34() {
        return this.mWeekSportsAIRecords;
    }

    public final int component35() {
        return this.mIsSync;
    }

    public final float component4() {
        return this.mUserHeight;
    }

    public final long component5() {
        return this.mTime;
    }

    @aa1
    public final String component6() {
        return this.mLocalTime;
    }

    public final int component7() {
        return this.mAbnormalNumber;
    }

    public final long component8() {
        return this.mHeartRateTime;
    }

    public final int component9() {
        return this.mHeartRateValue;
    }

    @aa1
    public final HealthyReport copy(int r47, int r48, float r49, float r50, long r51, @aa1 String r53, int r54, long r55, int r57, @aa1 String r58, long r59, int r61, int r62, @aa1 String r63, long r64, int r66, @aa1 String r67, long r68, float r70, float r71, @aa1 String r72, long r73, int r75, @aa1 String r76, long r77, float r79, @aa1 String r80, long r81, float r83, @aa1 String r84, long r85, int r87, int r88, @aa1 String r89, int r90) {
        Intrinsics.X0O(r53, "mLocalTime");
        Intrinsics.X0O(r58, "mHeartRateAIRecords");
        Intrinsics.X0O(r63, "mBloodPressureAIRecords");
        Intrinsics.X0O(r67, "mBloodOxygenAIRecords");
        Intrinsics.X0O(r72, "mSleepAIRecords");
        Intrinsics.X0O(r76, "mPressureAIRecords");
        Intrinsics.X0O(r80, "mBloodGlucose2AIRecords");
        Intrinsics.X0O(r84, "mWeightAIRecords");
        Intrinsics.X0O(r89, "mWeekSportsAIRecords");
        return new HealthyReport(r47, r48, r49, r50, r51, r53, r54, r55, r57, r58, r59, r61, r62, r63, r64, r66, r67, r68, r70, r71, r72, r73, r75, r76, r77, r79, r80, r81, r83, r84, r85, r87, r88, r89, r90);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof HealthyReport) == true) goto L8;
        return false;
    L8:
        HealthyReport r9 = (HealthyReport) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mUserGender == r9.mUserGender) goto L15;
        return false;
    L15:
        if (Float.compare(this.mUserWeight, r9.mUserWeight) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.mUserHeight, r9.mUserHeight) == 0) goto L21;
        return false;
    L21:
        if (this.mTime == r9.mTime) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L27;
        return false;
    L27:
        if (this.mAbnormalNumber == r9.mAbnormalNumber) goto L30;
        return false;
    L30:
        if (this.mHeartRateTime == r9.mHeartRateTime) goto L33;
        return false;
    L33:
        if (this.mHeartRateValue == r9.mHeartRateValue) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mHeartRateAIRecords, r9.mHeartRateAIRecords) == true) goto L39;
        return false;
    L39:
        if (this.mBloodPressureTime == r9.mBloodPressureTime) goto L42;
        return false;
    L42:
        if (this.mSystolicValue == r9.mSystolicValue) goto L45;
        return false;
    L45:
        if (this.mDiastolicValue == r9.mDiastolicValue) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mBloodPressureAIRecords, r9.mBloodPressureAIRecords) == true) goto L51;
        return false;
    L51:
        if (this.mBloodOxygenTime == r9.mBloodOxygenTime) goto L54;
        return false;
    L54:
        if (this.mBloodOxygenValue == r9.mBloodOxygenValue) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.mBloodOxygenAIRecords, r9.mBloodOxygenAIRecords) == true) goto L60;
        return false;
    L60:
        if (this.mSleepTime == r9.mSleepTime) goto L63;
        return false;
    L63:
        if (Float.compare(this.mSleepDeepLengthTime, r9.mSleepDeepLengthTime) == 0) goto L66;
        return false;
    L66:
        if (Float.compare(this.mSleepPiecemealTime, r9.mSleepPiecemealTime) == 0) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.mSleepAIRecords, r9.mSleepAIRecords) == true) goto L72;
        return false;
    L72:
        if (this.mPressureTime == r9.mPressureTime) goto L75;
        return false;
    L75:
        if (this.mPressureValue == r9.mPressureValue) goto L78;
        return false;
    L78:
        if (Intrinsics.XOO0ii0(this.mPressureAIRecords, r9.mPressureAIRecords) == true) goto L81;
        return false;
    L81:
        if (this.mBloodGlucose2Time == r9.mBloodGlucose2Time) goto L84;
        return false;
    L84:
        if (Float.compare(this.mBloodGlucose2Value, r9.mBloodGlucose2Value) == 0) goto L87;
        return false;
    L87:
        if (Intrinsics.XOO0ii0(this.mBloodGlucose2AIRecords, r9.mBloodGlucose2AIRecords) == true) goto L90;
        return false;
    L90:
        if (this.mWeightTime == r9.mWeightTime) goto L93;
        return false;
    L93:
        if (Float.compare(this.mWeightValue, r9.mWeightValue) == 0) goto L96;
        return false;
    L96:
        if (Intrinsics.XOO0ii0(this.mWeightAIRecords, r9.mWeightAIRecords) == true) goto L99;
        return false;
    L99:
        if (this.mWeekSportsTime == r9.mWeekSportsTime) goto L102;
        return false;
    L102:
        if (this.mWeekSportsNumber == r9.mWeekSportsNumber) goto L105;
        return false;
    L105:
        if (this.mWeekSportsAllTime == r9.mWeekSportsAllTime) goto L108;
        return false;
    L108:
        if (Intrinsics.XOO0ii0(this.mWeekSportsAIRecords, r9.mWeekSportsAIRecords) == true) goto L111;
        return false;
    L111:
        if (this.mIsSync == r9.mIsSync) goto L113;
        return false;
    L113:
        return true;
    }

    public final int getMAbnormalNumber() {
        return this.mAbnormalNumber;
    }

    @aa1
    public final String getMBloodGlucose2AIRecords() {
        return this.mBloodGlucose2AIRecords;
    }

    public final long getMBloodGlucose2Time() {
        return this.mBloodGlucose2Time;
    }

    public final float getMBloodGlucose2Value() {
        return this.mBloodGlucose2Value;
    }

    @aa1
    public final String getMBloodOxygenAIRecords() {
        return this.mBloodOxygenAIRecords;
    }

    public final long getMBloodOxygenTime() {
        return this.mBloodOxygenTime;
    }

    public final int getMBloodOxygenValue() {
        return this.mBloodOxygenValue;
    }

    @aa1
    public final String getMBloodPressureAIRecords() {
        return this.mBloodPressureAIRecords;
    }

    public final long getMBloodPressureTime() {
        return this.mBloodPressureTime;
    }

    public final int getMDiastolicValue() {
        return this.mDiastolicValue;
    }

    @aa1
    public final String getMHeartRateAIRecords() {
        return this.mHeartRateAIRecords;
    }

    public final long getMHeartRateTime() {
        return this.mHeartRateTime;
    }

    public final int getMHeartRateValue() {
        return this.mHeartRateValue;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final String getMPressureAIRecords() {
        return this.mPressureAIRecords;
    }

    public final long getMPressureTime() {
        return this.mPressureTime;
    }

    public final int getMPressureValue() {
        return this.mPressureValue;
    }

    @aa1
    public final String getMSleepAIRecords() {
        return this.mSleepAIRecords;
    }

    public final float getMSleepDeepLengthTime() {
        return this.mSleepDeepLengthTime;
    }

    public final float getMSleepPiecemealTime() {
        return this.mSleepPiecemealTime;
    }

    public final long getMSleepTime() {
        return this.mSleepTime;
    }

    public final int getMSystolicValue() {
        return this.mSystolicValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMUserGender() {
        return this.mUserGender;
    }

    public final float getMUserHeight() {
        return this.mUserHeight;
    }

    public final float getMUserWeight() {
        return this.mUserWeight;
    }

    @aa1
    public final String getMWeekSportsAIRecords() {
        return this.mWeekSportsAIRecords;
    }

    public final int getMWeekSportsAllTime() {
        return this.mWeekSportsAllTime;
    }

    public final int getMWeekSportsNumber() {
        return this.mWeekSportsNumber;
    }

    public final long getMWeekSportsTime() {
        return this.mWeekSportsTime;
    }

    @aa1
    public final String getMWeightAIRecords() {
        return this.mWeightAIRecords;
    }

    public final long getMWeightTime() {
        return this.mWeightTime;
    }

    public final float getMWeightValue() {
        return this.mWeightValue;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mUserGender)) * 31) + Float.hashCode(this.mUserWeight)) * 31) + Float.hashCode(this.mUserHeight)) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mAbnormalNumber)) * 31) + Long.hashCode(this.mHeartRateTime)) * 31) + Integer.hashCode(this.mHeartRateValue)) * 31) + this.mHeartRateAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodPressureTime)) * 31) + Integer.hashCode(this.mSystolicValue)) * 31) + Integer.hashCode(this.mDiastolicValue)) * 31) + this.mBloodPressureAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodOxygenTime)) * 31) + Integer.hashCode(this.mBloodOxygenValue)) * 31) + this.mBloodOxygenAIRecords.hashCode()) * 31) + Long.hashCode(this.mSleepTime)) * 31) + Float.hashCode(this.mSleepDeepLengthTime)) * 31) + Float.hashCode(this.mSleepPiecemealTime)) * 31) + this.mSleepAIRecords.hashCode()) * 31) + Long.hashCode(this.mPressureTime)) * 31) + Integer.hashCode(this.mPressureValue)) * 31) + this.mPressureAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodGlucose2Time)) * 31) + Float.hashCode(this.mBloodGlucose2Value)) * 31) + this.mBloodGlucose2AIRecords.hashCode()) * 31) + Long.hashCode(this.mWeightTime)) * 31) + Float.hashCode(this.mWeightValue)) * 31) + this.mWeightAIRecords.hashCode()) * 31) + Long.hashCode(this.mWeekSportsTime)) * 31) + Integer.hashCode(this.mWeekSportsNumber)) * 31) + Integer.hashCode(this.mWeekSportsAllTime)) * 31) + this.mWeekSportsAIRecords.hashCode()) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAbnormalNumber(int r1) {
        this.mAbnormalNumber = r1;
    }

    public final void setMBloodGlucose2AIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBloodGlucose2AIRecords = r2;
    }

    public final void setMBloodGlucose2Time(long r1) {
        this.mBloodGlucose2Time = r1;
    }

    public final void setMBloodGlucose2Value(float r1) {
        this.mBloodGlucose2Value = r1;
    }

    public final void setMBloodOxygenAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBloodOxygenAIRecords = r2;
    }

    public final void setMBloodOxygenTime(long r1) {
        this.mBloodOxygenTime = r1;
    }

    public final void setMBloodOxygenValue(int r1) {
        this.mBloodOxygenValue = r1;
    }

    public final void setMBloodPressureAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBloodPressureAIRecords = r2;
    }

    public final void setMBloodPressureTime(long r1) {
        this.mBloodPressureTime = r1;
    }

    public final void setMDiastolicValue(int r1) {
        this.mDiastolicValue = r1;
    }

    public final void setMHeartRateAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHeartRateAIRecords = r2;
    }

    public final void setMHeartRateTime(long r1) {
        this.mHeartRateTime = r1;
    }

    public final void setMHeartRateValue(int r1) {
        this.mHeartRateValue = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMPressureAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPressureAIRecords = r2;
    }

    public final void setMPressureTime(long r1) {
        this.mPressureTime = r1;
    }

    public final void setMPressureValue(int r1) {
        this.mPressureValue = r1;
    }

    public final void setMSleepAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSleepAIRecords = r2;
    }

    public final void setMSleepDeepLengthTime(float r1) {
        this.mSleepDeepLengthTime = r1;
    }

    public final void setMSleepPiecemealTime(float r1) {
        this.mSleepPiecemealTime = r1;
    }

    public final void setMSleepTime(long r1) {
        this.mSleepTime = r1;
    }

    public final void setMSystolicValue(int r1) {
        this.mSystolicValue = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMUserGender(int r1) {
        this.mUserGender = r1;
    }

    public final void setMUserHeight(float r1) {
        this.mUserHeight = r1;
    }

    public final void setMUserWeight(float r1) {
        this.mUserWeight = r1;
    }

    public final void setMWeekSportsAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeekSportsAIRecords = r2;
    }

    public final void setMWeekSportsAllTime(int r1) {
        this.mWeekSportsAllTime = r1;
    }

    public final void setMWeekSportsNumber(int r1) {
        this.mWeekSportsNumber = r1;
    }

    public final void setMWeekSportsTime(long r1) {
        this.mWeekSportsTime = r1;
    }

    public final void setMWeightAIRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeightAIRecords = r2;
    }

    public final void setMWeightTime(long r1) {
        this.mWeightTime = r1;
    }

    public final void setMWeightValue(float r1) {
        this.mWeightValue = r1;
    }

    @aa1
    public String toString() {
        return "HealthyReport(mId=" + this.mId + ", mUserGender=" + this.mUserGender + ", mUserWeight=" + this.mUserWeight + ", mUserHeight=" + this.mUserHeight + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAbnormalNumber=" + this.mAbnormalNumber + ", mHeartRateTime=" + this.mHeartRateTime + ", mHeartRateValue=" + this.mHeartRateValue + ", mHeartRateAIRecords=" + this.mHeartRateAIRecords + ", mBloodPressureTime=" + this.mBloodPressureTime + ", mSystolicValue=" + this.mSystolicValue + ", mDiastolicValue=" + this.mDiastolicValue + ", mBloodPressureAIRecords=" + this.mBloodPressureAIRecords + ", mBloodOxygenTime=" + this.mBloodOxygenTime + ", mBloodOxygenValue=" + this.mBloodOxygenValue + ", mBloodOxygenAIRecords=" + this.mBloodOxygenAIRecords + ", mSleepTime=" + this.mSleepTime + ", mSleepDeepLengthTime=" + this.mSleepDeepLengthTime + ", mSleepPiecemealTime=" + this.mSleepPiecemealTime + ", mSleepAIRecords=" + this.mSleepAIRecords + ", mPressureTime=" + this.mPressureTime + ", mPressureValue=" + this.mPressureValue + ", mPressureAIRecords=" + this.mPressureAIRecords + ", mBloodGlucose2Time=" + this.mBloodGlucose2Time + ", mBloodGlucose2Value=" + this.mBloodGlucose2Value + ", mBloodGlucose2AIRecords=" + this.mBloodGlucose2AIRecords + ", mWeightTime=" + this.mWeightTime + ", mWeightValue=" + this.mWeightValue + ", mWeightAIRecords=" + this.mWeightAIRecords + ", mWeekSportsTime=" + this.mWeekSportsTime + ", mWeekSportsNumber=" + this.mWeekSportsNumber + ", mWeekSportsAllTime=" + this.mWeekSportsAllTime + ", mWeekSportsAIRecords=" + this.mWeekSportsAIRecords + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public HealthyReport(int r11, int r12, float r13, float r14, long r15, @aa1 String r17, int r18, long r19, int r21, @aa1 String r22, long r23, int r25, int r26, @aa1 String r27, long r28, int r30, @aa1 String r31, long r32, float r34, float r35, @aa1 String r36, long r37, int r39, @aa1 String r40, long r41, float r43, @aa1 String r44, long r45, float r47, @aa1 String r48, long r49, int r51, int r52, @aa1 String r53, int r54) {
        Intrinsics.X0O(r17, "mLocalTime");
        Intrinsics.X0O(r22, "mHeartRateAIRecords");
        Intrinsics.X0O(r27, "mBloodPressureAIRecords");
        Intrinsics.X0O(r31, "mBloodOxygenAIRecords");
        Intrinsics.X0O(r36, "mSleepAIRecords");
        Intrinsics.X0O(r40, "mPressureAIRecords");
        Intrinsics.X0O(r44, "mBloodGlucose2AIRecords");
        Intrinsics.X0O(r48, "mWeightAIRecords");
        Intrinsics.X0O(r53, "mWeekSportsAIRecords");
        this.mId = r11;
        this.mUserGender = r12;
        this.mUserWeight = r13;
        this.mUserHeight = r14;
        this.mTime = r15;
        this.mLocalTime = r17;
        this.mAbnormalNumber = r18;
        this.mHeartRateTime = r19;
        this.mHeartRateValue = r21;
        this.mHeartRateAIRecords = r22;
        this.mBloodPressureTime = r23;
        this.mSystolicValue = r25;
        this.mDiastolicValue = r26;
        this.mBloodPressureAIRecords = r27;
        this.mBloodOxygenTime = r28;
        this.mBloodOxygenValue = r30;
        this.mBloodOxygenAIRecords = r31;
        this.mSleepTime = r32;
        this.mSleepDeepLengthTime = r34;
        this.mSleepPiecemealTime = r35;
        this.mSleepAIRecords = r36;
        this.mPressureTime = r37;
        this.mPressureValue = r39;
        this.mPressureAIRecords = r40;
        this.mBloodGlucose2Time = r41;
        this.mBloodGlucose2Value = r43;
        this.mBloodGlucose2AIRecords = r44;
        this.mWeightTime = r45;
        this.mWeightValue = r47;
        this.mWeightAIRecords = r48;
        this.mWeekSportsTime = r49;
        this.mWeekSportsNumber = r51;
        this.mWeekSportsAllTime = r52;
        this.mWeekSportsAIRecords = r53;
        this.mIsSync = r54;
    }

    public /* synthetic */ HealthyReport(int r42, int r43, float r44, float r45, long r46, String r48, int r49, long r50, int r52, String r53, long r54, int r56, int r57, String r58, long r59, int r61, String r62, long r63, float r65, float r66, String r67, long r68, int r70, String r71, long r72, float r74, String r75, long r76, float r78, String r79, long r80, int r82, int r83, String r84, int r85, int r86, int r87, DefaultConstructorMarker r88) {
        if ((r86 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r86 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r86 & 4) == 0) goto L13;
        float r4 = 170.0f;
    L15:
        if ((r86 & 8) == 0) goto L17;
        float r5 = 60.0f;
    L19:
        if ((r86 & 16) == 0) goto L21;
        long r9 = 0;
    L22:
        String r11 = "";
        if ((r86 & 32) == 0) goto L25;
        String r6 = "";
    L27:
        if ((r86 & 64) == 0) goto L29;
        int r12 = 0;
    L31:
        if ((r86 & 128) == 0) goto L33;
        long r13 = 0;
    L35:
        if ((r86 & 256) == 0) goto L37;
        int r15 = 0;
    L39:
        if ((r86 & 512) == 0) goto L41;
        String r2 = "";
    L43:
        if ((r86 & 1024) == 0) goto L45;
        long r7 = 0;
    L46:
        int r16 = r1;
        if ((r86 & 2048) == 0) goto L49;
        int r8 = 0;
    L50:
        int r47 = r8;
        if ((r86 & 4096) == 0) goto L53;
        int r10 = 0;
    L54:
        int r410 = r10;
        if ((r86 & 8192) == 0) goto L57;
        String r14 = "";
    L58:
        String r411 = r14;
        if ((r86 & 16384) == 0) goto L61;
        long r17 = 0;
    L63:
        if ((32768 & r86) == 0) goto L65;
        int r18 = 0;
    L67:
        if ((r86 & 65536) == 0) goto L69;
        String r19 = "";
    L71:
        if ((r86 & 131072) == 0) goto L73;
        long r20 = 0;
    L74:
        float r23 = 0.0f;
        if ((r86 & 262144) == 0) goto L77;
        float r22 = 0.0f;
    L79:
        if ((r86 & 524288) == 0) goto L81;
        float r24 = 0.0f;
    L83:
        if ((r86 & 1048576) == 0) goto L85;
        String r25 = "";
    L87:
        if ((r86 & 2097152) == 0) goto L89;
        long r26 = 0;
    L91:
        if ((r86 & 4194304) == 0) goto L93;
        int r28 = 0;
    L95:
        if ((r86 & 8388608) == 0) goto L97;
        String r29 = "";
    L99:
        if ((r86 & 16777216) == 0) goto L101;
        long r30 = 0;
    L103:
        if ((r86 & 33554432) == 0) goto L105;
        float r32 = 0.0f;
    L107:
        if ((r86 & 67108864) == 0) goto L109;
        String r33 = "";
    L111:
        if ((r86 & 134217728) == 0) goto L113;
        long r34 = 0;
    L115:
        if ((r86 & 268435456) != 0) goto L119;
        r23 = r78;
    L119:
        if ((r86 & 536870912) == 0) goto L121;
        String r36 = "";
    L123:
        if ((r86 & 1073741824) == 0) goto L125;
        long r37 = 0;
    L127:
        if ((r86 & Integer.MIN_VALUE) == 0) goto L129;
        int r0 = 0;
    L131:
        if ((r87 & 1) == 0) goto L133;
        int r39 = 0;
    L135:
        if ((r87 & 2) != 0) goto L139;
        r11 = r84;
    L139:
        if ((r87 & 4) == 0) goto L142;
        int r89 = 0;
    L143:
        this(r16, r3, r4, r5, r9, r6, r12, r13, r15, r2, r7, r47, r410, r411, r17, r18, r19, r20, r22, r24, r25, r26, r28, r29, r30, r32, r33, r34, r23, r36, r37, r0, r39, r11, r89);
        return;
    L142:
        r89 = r85;
        goto L143
    L133:
        r39 = r83;
        goto L135
    L129:
        r0 = r82;
        goto L131
    L125:
        r37 = r80;
        goto L127
    L121:
        r36 = r79;
        goto L123
    L113:
        r34 = r76;
        goto L115
    L109:
        r33 = r75;
        goto L111
    L105:
        r32 = r74;
        goto L107
    L101:
        r30 = r72;
        goto L103
    L97:
        r29 = r71;
        goto L99
    L93:
        r28 = r70;
        goto L95
    L89:
        r26 = r68;
        goto L91
    L85:
        r25 = r67;
        goto L87
    L81:
        r24 = r66;
        goto L83
    L77:
        r22 = r65;
        goto L79
    L73:
        r20 = r63;
        goto L74
    L69:
        r19 = r62;
        goto L71
    L65:
        r18 = r61;
        goto L67
    L61:
        r17 = r59;
        goto L63
    L57:
        r14 = r58;
        goto L58
    L53:
        r10 = r57;
        goto L54
    L49:
        r8 = r56;
        goto L50
    L45:
        r7 = r54;
        goto L46
    L41:
        r2 = r53;
        goto L43
    L37:
        r15 = r52;
        goto L39
    L33:
        r13 = r50;
        goto L35
    L29:
        r12 = r49;
        goto L31
    L25:
        r6 = r48;
        goto L27
    L21:
        r9 = r46;
        goto L22
    L17:
        r5 = r45;
        goto L19
    L13:
        r4 = r44;
        goto L15
    L9:
        r3 = r43;
        goto L11
    L5:
        r1 = r42;
        goto L7
    }
}
