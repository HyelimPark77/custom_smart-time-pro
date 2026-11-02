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
@Entity(indices = {@Index(unique = true, value = {"mMeasurementId"})})
public final class BloodGlucose2 {

    @ColumnInfo
    private int mCompletedProgress;

    @ColumnInfo
    private final int mCurrentLevel;

    @aa1
    @ColumnInfo
    private String mEndTime;

    @ColumnInfo
    private int mFasting;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @aa1
    @ColumnInfo
    private final String mInsights;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private final String mLocaleInsights;

    @aa1
    @ColumnInfo
    private final String mLocaleTips;

    @ColumnInfo
    private double mLowerBound;

    @aa1
    @ColumnInfo
    private String mMeasurementId;

    @aa1
    @ColumnInfo
    private String mModelNo;

    @aa1
    @ColumnInfo
    private final String mRiskCode;

    @aa1
    @ColumnInfo
    private String mStartTime;

    @ColumnInfo
    private long mTime;

    @aa1
    @ColumnInfo
    private final String mTips;

    @ColumnInfo
    private double mUpperBound;

    @aa1
    @ColumnInfo
    private String mUserId;

    @ColumnInfo
    private int mWithin2hrsMeal;

    public BloodGlucose2() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        double r9 = 0.0d;
        double r11 = 0.0d;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        int r22 = 0;
        int r23 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, 1048575, null);
    }

    public static /* synthetic */ BloodGlucose2 copy$default(BloodGlucose2 r17, int r18, long r19, String r21, String r22, String r23, String r24, String r25, double r26, double r28, int r30, int r31, int r32, int r33, String r34, String r35, String r36, String r37, String r38, int r39, int r40, int r41, Object r42) {
        if ((r41 & 1) == 0) goto L5;
        int r2 = r17.mId;
    L7:
        if ((r41 & 2) == 0) goto L9;
        long r3 = r17.mTime;
    L11:
        if ((r41 & 4) == 0) goto L13;
        String r5 = r17.mMeasurementId;
    L15:
        if ((r41 & 8) == 0) goto L17;
        String r6 = r17.mUserId;
    L19:
        if ((r41 & 16) == 0) goto L21;
        String r7 = r17.mStartTime;
    L23:
        if ((r41 & 32) == 0) goto L25;
        String r8 = r17.mEndTime;
    L27:
        if ((r41 & 64) == 0) goto L29;
        String r9 = r17.mModelNo;
    L31:
        if ((r41 & 128) == 0) goto L33;
        double r10 = r17.mLowerBound;
    L35:
        if ((r41 & 256) == 0) goto L37;
        double r12 = r17.mUpperBound;
    L39:
        if ((r41 & 512) == 0) goto L41;
        int r14 = r17.mFasting;
    L43:
        if ((r41 & 1024) == 0) goto L45;
        int r15 = r17.mWithin2hrsMeal;
    L46:
        int r110 = r2;
        if ((r41 & 2048) == 0) goto L49;
        int r4 = r17.mCompletedProgress;
    L50:
        int r111 = r4;
        if ((r41 & 4096) == 0) goto L53;
        int r11 = r17.mCurrentLevel;
    L54:
        int r20 = r11;
        if ((r41 & 8192) == 0) goto L57;
        String r13 = r17.mRiskCode;
    L58:
        String r27 = r13;
        if ((r41 & 16384) == 0) goto L61;
        String r16 = r17.mInsights;
    L63:
        if ((r41 & 32768) == 0) goto L65;
        String r1 = r17.mTips;
    L66:
        String r29 = r1;
        if ((r41 & 65536) == 0) goto L69;
        String r43 = r17.mLocaleInsights;
    L70:
        String r210 = r43;
        if ((r41 & 131072) == 0) goto L73;
        String r44 = r17.mLocaleTips;
    L74:
        String r211 = r44;
        if ((r41 & 262144) == 0) goto L77;
        int r45 = r17.mIsSync;
    L79:
        if ((r41 & 524288) == 0) goto L82;
        int r212 = r45;
        int r46 = r212;
        int r47 = r17.mIsDelete;
    L84:
        return r17.copy(r110, r3, r5, r6, r7, r8, r9, r10, r12, r14, r15, r111, r20, r27, r16, r29, r210, r211, r46, r47);
    L82:
        r47 = r40;
        r46 = r45;
        goto L84
    L77:
        r45 = r39;
        goto L79
    L73:
        r44 = r38;
        goto L74
    L69:
        r43 = r37;
        goto L70
    L65:
        r1 = r36;
        goto L66
    L61:
        r16 = r35;
        goto L63
    L57:
        r13 = r34;
        goto L58
    L53:
        r11 = r33;
        goto L54
    L49:
        r4 = r32;
        goto L50
    L45:
        r15 = r31;
        goto L46
    L41:
        r14 = r30;
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
        r7 = r23;
        goto L23
    L17:
        r6 = r22;
        goto L19
    L13:
        r5 = r21;
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

    public final int component10() {
        return this.mFasting;
    }

    public final int component11() {
        return this.mWithin2hrsMeal;
    }

    public final int component12() {
        return this.mCompletedProgress;
    }

    public final int component13() {
        return this.mCurrentLevel;
    }

    @aa1
    public final String component14() {
        return this.mRiskCode;
    }

    @aa1
    public final String component15() {
        return this.mInsights;
    }

    @aa1
    public final String component16() {
        return this.mTips;
    }

    @aa1
    public final String component17() {
        return this.mLocaleInsights;
    }

    @aa1
    public final String component18() {
        return this.mLocaleTips;
    }

    public final int component19() {
        return this.mIsSync;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component20() {
        return this.mIsDelete;
    }

    @aa1
    public final String component3() {
        return this.mMeasurementId;
    }

    @aa1
    public final String component4() {
        return this.mUserId;
    }

    @aa1
    public final String component5() {
        return this.mStartTime;
    }

    @aa1
    public final String component6() {
        return this.mEndTime;
    }

    @aa1
    public final String component7() {
        return this.mModelNo;
    }

    public final double component8() {
        return this.mLowerBound;
    }

    public final double component9() {
        return this.mUpperBound;
    }

    @aa1
    public final BloodGlucose2 copy(int r26, long r27, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, double r34, double r36, int r38, int r39, int r40, int r41, @aa1 String r42, @aa1 String r43, @aa1 String r44, @aa1 String r45, @aa1 String r46, int r47, int r48) {
        Intrinsics.X0O(r29, "mMeasurementId");
        Intrinsics.X0O(r30, "mUserId");
        Intrinsics.X0O(r31, "mStartTime");
        Intrinsics.X0O(r32, "mEndTime");
        Intrinsics.X0O(r33, "mModelNo");
        Intrinsics.X0O(r42, "mRiskCode");
        Intrinsics.X0O(r43, "mInsights");
        Intrinsics.X0O(r44, "mTips");
        Intrinsics.X0O(r45, "mLocaleInsights");
        Intrinsics.X0O(r46, "mLocaleTips");
        return new BloodGlucose2(r26, r27, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BloodGlucose2) == true) goto L8;
        return false;
    L8:
        BloodGlucose2 r9 = (BloodGlucose2) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mMeasurementId, r9.mMeasurementId) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mUserId, r9.mUserId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mStartTime, r9.mStartTime) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mEndTime, r9.mEndTime) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mModelNo, r9.mModelNo) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.mLowerBound, r9.mLowerBound) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.mUpperBound, r9.mUpperBound) == 0) goto L36;
        return false;
    L36:
        if (this.mFasting == r9.mFasting) goto L39;
        return false;
    L39:
        if (this.mWithin2hrsMeal == r9.mWithin2hrsMeal) goto L42;
        return false;
    L42:
        if (this.mCompletedProgress == r9.mCompletedProgress) goto L45;
        return false;
    L45:
        if (this.mCurrentLevel == r9.mCurrentLevel) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mRiskCode, r9.mRiskCode) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mInsights, r9.mInsights) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.mTips, r9.mTips) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.mLocaleInsights, r9.mLocaleInsights) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mLocaleTips, r9.mLocaleTips) == true) goto L63;
        return false;
    L63:
        if (this.mIsSync == r9.mIsSync) goto L66;
        return false;
    L66:
        if (this.mIsDelete == r9.mIsDelete) goto L68;
        return false;
    L68:
        return true;
    }

    public final int getMCompletedProgress() {
        return this.mCompletedProgress;
    }

    public final int getMCurrentLevel() {
        return this.mCurrentLevel;
    }

    @aa1
    public final String getMEndTime() {
        return this.mEndTime;
    }

    public final int getMFasting() {
        return this.mFasting;
    }

    public final int getMId() {
        return this.mId;
    }

    @aa1
    public final String getMInsights() {
        return this.mInsights;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocaleInsights() {
        return this.mLocaleInsights;
    }

    @aa1
    public final String getMLocaleTips() {
        return this.mLocaleTips;
    }

    public final double getMLowerBound() {
        return this.mLowerBound;
    }

    @aa1
    public final String getMMeasurementId() {
        return this.mMeasurementId;
    }

    @aa1
    public final String getMModelNo() {
        return this.mModelNo;
    }

    @aa1
    public final String getMRiskCode() {
        return this.mRiskCode;
    }

    @aa1
    public final String getMStartTime() {
        return this.mStartTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTips() {
        return this.mTips;
    }

    public final double getMUpperBound() {
        return this.mUpperBound;
    }

    @aa1
    public final String getMUserId() {
        return this.mUserId;
    }

    public final int getMWithin2hrsMeal() {
        return this.mWithin2hrsMeal;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mMeasurementId.hashCode()) * 31) + this.mUserId.hashCode()) * 31) + this.mStartTime.hashCode()) * 31) + this.mEndTime.hashCode()) * 31) + this.mModelNo.hashCode()) * 31) + Double.hashCode(this.mLowerBound)) * 31) + Double.hashCode(this.mUpperBound)) * 31) + Integer.hashCode(this.mFasting)) * 31) + Integer.hashCode(this.mWithin2hrsMeal)) * 31) + Integer.hashCode(this.mCompletedProgress)) * 31) + Integer.hashCode(this.mCurrentLevel)) * 31) + this.mRiskCode.hashCode()) * 31) + this.mInsights.hashCode()) * 31) + this.mTips.hashCode()) * 31) + this.mLocaleInsights.hashCode()) * 31) + this.mLocaleTips.hashCode()) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMCompletedProgress(int r1) {
        this.mCompletedProgress = r1;
    }

    public final void setMEndTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mEndTime = r2;
    }

    public final void setMFasting(int r1) {
        this.mFasting = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLowerBound(double r1) {
        this.mLowerBound = r1;
    }

    public final void setMMeasurementId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMeasurementId = r2;
    }

    public final void setMModelNo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mModelNo = r2;
    }

    public final void setMStartTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStartTime = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMUpperBound(double r1) {
        this.mUpperBound = r1;
    }

    public final void setMUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUserId = r2;
    }

    public final void setMWithin2hrsMeal(int r1) {
        this.mWithin2hrsMeal = r1;
    }

    @aa1
    public String toString() {
        return "BloodGlucose2(mId=" + this.mId + ", mTime=" + this.mTime + ", mMeasurementId=" + this.mMeasurementId + ", mUserId=" + this.mUserId + ", mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mModelNo=" + this.mModelNo + ", mLowerBound=" + this.mLowerBound + ", mUpperBound=" + this.mUpperBound + ", mFasting=" + this.mFasting + ", mWithin2hrsMeal=" + this.mWithin2hrsMeal + ", mCompletedProgress=" + this.mCompletedProgress + ", mCurrentLevel=" + this.mCurrentLevel + ", mRiskCode=" + this.mRiskCode + ", mInsights=" + this.mInsights + ", mTips=" + this.mTips + ", mLocaleInsights=" + this.mLocaleInsights + ", mLocaleTips=" + this.mLocaleTips + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.iO.iO;
    }

    public BloodGlucose2(int r11, long r12, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, double r19, double r21, int r23, int r24, int r25, int r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, int r32, int r33) {
        Intrinsics.X0O(r14, "mMeasurementId");
        Intrinsics.X0O(r15, "mUserId");
        Intrinsics.X0O(r16, "mStartTime");
        Intrinsics.X0O(r17, "mEndTime");
        Intrinsics.X0O(r18, "mModelNo");
        Intrinsics.X0O(r27, "mRiskCode");
        Intrinsics.X0O(r28, "mInsights");
        Intrinsics.X0O(r29, "mTips");
        Intrinsics.X0O(r30, "mLocaleInsights");
        Intrinsics.X0O(r31, "mLocaleTips");
        this.mId = r11;
        this.mTime = r12;
        this.mMeasurementId = r14;
        this.mUserId = r15;
        this.mStartTime = r16;
        this.mEndTime = r17;
        this.mModelNo = r18;
        this.mLowerBound = r19;
        this.mUpperBound = r21;
        this.mFasting = r23;
        this.mWithin2hrsMeal = r24;
        this.mCompletedProgress = r25;
        this.mCurrentLevel = r26;
        this.mRiskCode = r27;
        this.mInsights = r28;
        this.mTips = r29;
        this.mLocaleInsights = r30;
        this.mLocaleTips = r31;
        this.mIsSync = r32;
        this.mIsDelete = r33;
    }

    public /* synthetic */ BloodGlucose2(int r21, long r22, String r24, String r25, String r26, String r27, String r28, double r29, double r31, int r33, int r34, int r35, int r36, String r37, String r38, String r39, String r40, String r41, int r42, int r43, int r44, DefaultConstructorMarker r45) {
        if ((r44 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r44 & 2) == 0) goto L9;
        long r3 = 0;
    L10:
        String r6 = "";
        if ((r44 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r44 & 8) == 0) goto L17;
        String r7 = "";
    L19:
        if ((r44 & 16) == 0) goto L21;
        String r8 = "";
    L23:
        if ((r44 & 32) == 0) goto L25;
        String r9 = "";
    L27:
        if ((r44 & 64) == 0) goto L29;
        String r10 = "";
    L30:
        double r12 = 0.0d;
        if ((r44 & 128) == 0) goto L33;
        double r14 = 0.0d;
    L35:
        if ((r44 & 256) != 0) goto L39;
        r12 = r31;
    L39:
        if ((r44 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r44 & 1024) == 0) goto L45;
        int r2 = 0;
    L46:
        int r23 = r1;
        if ((r44 & 2048) == 0) goto L49;
        int r4 = 0;
    L50:
        int r210 = r4;
        if ((r44 & 4096) == 0) goto L53;
        int r13 = 0;
    L54:
        int r211 = r13;
        if ((r44 & 8192) == 0) goto L57;
        String r15 = "";
    L58:
        String r212 = r15;
        if ((r44 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r44 & 32768) == 0) goto L65;
        String r17 = "";
    L67:
        if ((r44 & 65536) == 0) goto L69;
        String r18 = "";
    L71:
        if ((r44 & 131072) != 0) goto L75;
        r6 = r41;
    L75:
        if ((r44 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r44 & 524288) == 0) goto L82;
        int r46 = 0;
    L83:
        this(r23, r3, r5, r7, r8, r9, r10, r14, r12, r11, r2, r210, r211, r212, r16, r17, r18, r6, r19, r46);
        return;
    L82:
        r46 = r43;
        goto L83
    L77:
        r19 = r42;
        goto L79
    L69:
        r18 = r40;
        goto L71
    L65:
        r17 = r39;
        goto L67
    L61:
        r16 = r38;
        goto L63
    L57:
        r15 = r37;
        goto L58
    L53:
        r13 = r36;
        goto L54
    L49:
        r4 = r35;
        goto L50
    L45:
        r2 = r34;
        goto L46
    L41:
        r11 = r33;
        goto L43
    L33:
        r14 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L30
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r5 = r24;
        goto L15
    L9:
        r3 = r22;
        goto L10
    L5:
        r1 = r21;
        goto L7
    }
}
