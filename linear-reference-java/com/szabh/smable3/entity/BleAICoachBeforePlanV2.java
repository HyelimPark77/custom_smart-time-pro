package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.O1OOiOO1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n*L\n41#1:328,4\n*E\n"})
public final class BleAICoachBeforePlanV2 extends BleReadable {
    public static final int AI_COACH_PLAN_TRAINING = 4;
    public static final int CHECKSUM_LENGTH = 128;

    @aa1
    public static final Companion Companion = null;
    public static final int DELETE_AI_COACH_PLAN = 3;
    public static final int GET_AI_COACH_PLAN = 1;
    public static final int GET_AI_COACH_PLAN_SUM = 0;
    public static final int LEAVE_AI_COACH_PLAN = 2;
    private int mCoachType;

    @aa1
    private String mCurrentChecksum;

    @aa1
    private String mLastChecksum;
    private long mPlanStartTime;

    @aa1
    private List<Integer> mPlanTime;
    private int mPlanWeekNum;
    private int mSource;
    private int mVo2Max;

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

    public BleAICoachBeforePlanV2() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        List r6 = null;
        int r7 = 0;
        long r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachBeforePlanV2 copy$default(BleAICoachBeforePlanV2 r0, String r1, String r2, int r3, int r4, int r5, List r6, int r7, long r8, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mCurrentChecksum;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mLastChecksum;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mSource;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mCoachType;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mVo2Max;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mPlanTime;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mPlanWeekNum;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r8 = r0.mPlanStartTime;
    L26:
        long r12 = r8;
        List r9 = r6;
        int r13 = r7;
        int r14 = r4;
        int r15 = r5;
        int r16 = r3;
        String r17 = r1;
        return r0.copy(r17, r2, r16, r14, r15, r9, r13, r12);
    }

    @aa1
    public final String component1() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final String component2() {
        return this.mLastChecksum;
    }

    public final int component3() {
        return this.mSource;
    }

    public final int component4() {
        return this.mCoachType;
    }

    public final int component5() {
        return this.mVo2Max;
    }

    @aa1
    public final List<Integer> component6() {
        return this.mPlanTime;
    }

    public final int component7() {
        return this.mPlanWeekNum;
    }

    public final long component8() {
        return this.mPlanStartTime;
    }

    @aa1
    public final BleAICoachBeforePlanV2 copy(@aa1 String r12, @aa1 String r13, int r14, int r15, int r16, @aa1 List<Integer> r17, int r18, long r19) {
        Intrinsics.X0O(r12, "mCurrentChecksum");
        Intrinsics.X0O(r13, "mLastChecksum");
        Intrinsics.X0O(r17, "mPlanTime");
        return new BleAICoachBeforePlanV2(r12, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        this.mLastChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        this.mSource = readInt8();
        this.mCoachType = readInt8();
        this.mVo2Max = readInt8();
        this.mPlanTime.clear();
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= 8) goto L6;
        r0.add(Integer.valueOf(readIntN(1)));
        r1 = r1 + 1;
        goto L4
    L6:
        O1OOiOO1i.I11X11OX(r0);
        this.mPlanTime.addAll(r0);
        this.mPlanWeekNum = readInt8();
        BleTime.Companion r2 = BleTime.Companion;
        BleReadable r3 = (BleReadable) BleTime.class.newInstance();
        r3.setMBytes(readBytes(6));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mPlanStartTime = r2.timeInMillis((BleTime) r3);
        readBytes(8);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleAICoachBeforePlanV2) == true) goto L8;
        return false;
    L8:
        BleAICoachBeforePlanV2 r9 = (BleAICoachBeforePlanV2) r8;
        if (Intrinsics.XOO0ii0(this.mCurrentChecksum, r9.mCurrentChecksum) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mLastChecksum, r9.mLastChecksum) == true) goto L15;
        return false;
    L15:
        if (this.mSource == r9.mSource) goto L18;
        return false;
    L18:
        if (this.mCoachType == r9.mCoachType) goto L21;
        return false;
    L21:
        if (this.mVo2Max == r9.mVo2Max) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mPlanTime, r9.mPlanTime) == true) goto L27;
        return false;
    L27:
        if (this.mPlanWeekNum == r9.mPlanWeekNum) goto L30;
        return false;
    L30:
        if (this.mPlanStartTime == r9.mPlanStartTime) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMCoachType() {
        return this.mCoachType;
    }

    @aa1
    public final String getMCurrentChecksum() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final String getMLastChecksum() {
        return this.mLastChecksum;
    }

    public final long getMPlanStartTime() {
        return this.mPlanStartTime;
    }

    @aa1
    public final List<Integer> getMPlanTime() {
        return this.mPlanTime;
    }

    public final int getMPlanWeekNum() {
        return this.mPlanWeekNum;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMVo2Max() {
        return this.mVo2Max;
    }

    public int hashCode() {
        return (((((((((((((this.mCurrentChecksum.hashCode() * 31) + this.mLastChecksum.hashCode()) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mCoachType)) * 31) + Integer.hashCode(this.mVo2Max)) * 31) + this.mPlanTime.hashCode()) * 31) + Integer.hashCode(this.mPlanWeekNum)) * 31) + Long.hashCode(this.mPlanStartTime);
    }

    public final void setMCoachType(int r1) {
        this.mCoachType = r1;
    }

    public final void setMCurrentChecksum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCurrentChecksum = r2;
    }

    public final void setMLastChecksum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLastChecksum = r2;
    }

    public final void setMPlanStartTime(long r1) {
        this.mPlanStartTime = r1;
    }

    public final void setMPlanTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlanTime = r2;
    }

    public final void setMPlanWeekNum(int r1) {
        this.mPlanWeekNum = r1;
    }

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMVo2Max(int r1) {
        this.mVo2Max = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachPlan(mCurrentChecksum=" + this.mCurrentChecksum + ", mLastChecksum=" + this.mLastChecksum + " , mSource = " + this.mSource + " , mCoachType = " + this.mCoachType + ", mVo2Max = " + this.mVo2Max + " , mPlanTime = " + this.mPlanTime + " , mPlanWeekNum = " + this.mPlanWeekNum + " , mPlanStartTime = " + this.mPlanStartTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachBeforePlanV2(@aa1 String r2, @aa1 String r3, int r4, int r5, int r6, @aa1 List<Integer> r7, int r8, long r9) {
        Intrinsics.X0O(r2, "mCurrentChecksum");
        Intrinsics.X0O(r3, "mLastChecksum");
        Intrinsics.X0O(r7, "mPlanTime");
        this.mCurrentChecksum = r2;
        this.mLastChecksum = r3;
        this.mSource = r4;
        this.mCoachType = r5;
        this.mVo2Max = r6;
        this.mPlanTime = r7;
        this.mPlanWeekNum = r8;
        this.mPlanStartTime = r9;
    }

    public /* synthetic */ BleAICoachBeforePlanV2(String r2, String r3, int r4, int r5, int r6, List r7, int r8, long r9, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "-999";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = new ArrayList();
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L26;
        r9 = 0;
    L26:
        long r13 = r9;
        List r10 = r7;
        int r14 = r8;
        int r15 = r6;
        int r16 = r4;
        String r17 = r2;
        this(r17, r3, r16, r5, r15, r10, r14, r13);
    }
}
