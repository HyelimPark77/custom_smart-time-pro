package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachBeforePlan extends BleReadable {
    public static final int CHECKSUM_LENGTH = 128;

    @aa1
    public static final Companion Companion = null;

    @aa1
    private String mCurrentChecksum;
    private int mCurrentChecksumLength;
    private int mDayMET;

    @aa1
    private float[] mExerciseMET;
    private int mIsFirst;

    @aa1
    private String mLastChecksum;
    private int mLastChecksumLength;

    @aa1
    private float[] mRoutineMET;

    @aa1
    private float[] mWeekExerciseMET;

    @aa1
    private float[] mWeekRoutineMET;

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

    public BleAICoachBeforePlan() {
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        int r4 = 0;
        float[] r5 = null;
        float[] r6 = null;
        int r7 = 0;
        int r8 = 0;
        float[] r9 = null;
        float[] r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ BleAICoachBeforePlan copy$default(BleAICoachBeforePlan r0, String r1, int r2, String r3, int r4, float[] r5, float[] r6, int r7, int r8, float[] r9, float[] r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mCurrentChecksum;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mCurrentChecksumLength;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mLastChecksum;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mLastChecksumLength;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mRoutineMET;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mExerciseMET;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mDayMET;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mIsFirst;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mWeekRoutineMET;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mWeekExerciseMET;
    L32:
        float[] r13 = r9;
        float[] r14 = r10;
        int r15 = r7;
        int r16 = r8;
        float[] r17 = r5;
        float[] r18 = r6;
        String r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @aa1
    public final String component1() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final float[] component10() {
        return this.mWeekExerciseMET;
    }

    public final int component2() {
        return this.mCurrentChecksumLength;
    }

    @aa1
    public final String component3() {
        return this.mLastChecksum;
    }

    public final int component4() {
        return this.mLastChecksumLength;
    }

    @aa1
    public final float[] component5() {
        return this.mRoutineMET;
    }

    @aa1
    public final float[] component6() {
        return this.mExerciseMET;
    }

    public final int component7() {
        return this.mDayMET;
    }

    public final int component8() {
        return this.mIsFirst;
    }

    @aa1
    public final float[] component9() {
        return this.mWeekRoutineMET;
    }

    @aa1
    public final BleAICoachBeforePlan copy(@aa1 String r13, int r14, @aa1 String r15, int r16, @aa1 float[] r17, @aa1 float[] r18, int r19, int r20, @aa1 float[] r21, @aa1 float[] r22) {
        Intrinsics.X0O(r13, "mCurrentChecksum");
        Intrinsics.X0O(r15, "mLastChecksum");
        Intrinsics.X0O(r17, "mRoutineMET");
        Intrinsics.X0O(r18, "mExerciseMET");
        Intrinsics.X0O(r21, "mWeekRoutineMET");
        Intrinsics.X0O(r22, "mWeekExerciseMET");
        return new BleAICoachBeforePlan(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        ByteOrder r3 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r3, "LITTLE_ENDIAN");
        this.mCurrentChecksumLength = readInt32(r3);
        this.mLastChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        Intrinsics.O10IXXX0X(r3, "LITTLE_ENDIAN");
        this.mLastChecksumLength = readInt32(r3);
        int r0 = this.mRoutineMET.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        float[] r4 = this.mRoutineMET;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        r4[r2] = readFloat(r5);
        r2 = r2 + 1;
        goto L3
    L5:
        int r6 = this.mExerciseMET.length;
        int r7 = 0;
    L6:
        if (r7 >= r6) goto L8;
        float[] r8 = this.mExerciseMET;
        ByteOrder r9 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        r8[r7] = readFloat(r9);
        r7 = r7 + 1;
        goto L6
    L8:
        ByteOrder r10 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r10, "LITTLE_ENDIAN");
        this.mDayMET = readInt32(r10);
        Intrinsics.O10IXXX0X(r10, "LITTLE_ENDIAN");
        this.mIsFirst = readInt32(r10);
        int r11 = this.mWeekRoutineMET.length;
        int r12 = 0;
    L9:
        if (r12 >= r11) goto L11;
        float[] r13 = this.mWeekRoutineMET;
        ByteOrder r14 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        r13[r12] = readFloat(r14);
        r12 = r12 + 1;
        goto L9
    L11:
        int r15 = this.mWeekExerciseMET.length;
    L12:
        if (r1 >= r15) goto L14;
        float[] r16 = this.mWeekExerciseMET;
        ByteOrder r17 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r17, "LITTLE_ENDIAN");
        r16[r1] = readFloat(r17);
        r1 = r1 + 1;
        goto L12
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachBeforePlan) == true) goto L8;
        return false;
    L8:
        BleAICoachBeforePlan r6 = (BleAICoachBeforePlan) r5;
        if (Intrinsics.XOO0ii0(this.mCurrentChecksum, r6.mCurrentChecksum) == true) goto L12;
        return false;
    L12:
        if (this.mCurrentChecksumLength == r6.mCurrentChecksumLength) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLastChecksum, r6.mLastChecksum) == true) goto L18;
        return false;
    L18:
        if (this.mLastChecksumLength == r6.mLastChecksumLength) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mRoutineMET, r6.mRoutineMET) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mExerciseMET, r6.mExerciseMET) == true) goto L27;
        return false;
    L27:
        if (this.mDayMET == r6.mDayMET) goto L30;
        return false;
    L30:
        if (this.mIsFirst == r6.mIsFirst) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mWeekRoutineMET, r6.mWeekRoutineMET) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mWeekExerciseMET, r6.mWeekExerciseMET) == true) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getMCurrentChecksum() {
        return this.mCurrentChecksum;
    }

    public final int getMCurrentChecksumLength() {
        return this.mCurrentChecksumLength;
    }

    public final int getMDayMET() {
        return this.mDayMET;
    }

    @aa1
    public final float[] getMExerciseMET() {
        return this.mExerciseMET;
    }

    public final int getMIsFirst() {
        return this.mIsFirst;
    }

    @aa1
    public final String getMLastChecksum() {
        return this.mLastChecksum;
    }

    public final int getMLastChecksumLength() {
        return this.mLastChecksumLength;
    }

    @aa1
    public final float[] getMRoutineMET() {
        return this.mRoutineMET;
    }

    @aa1
    public final float[] getMWeekExerciseMET() {
        return this.mWeekExerciseMET;
    }

    @aa1
    public final float[] getMWeekRoutineMET() {
        return this.mWeekRoutineMET;
    }

    public int hashCode() {
        return (((((((((((((((((this.mCurrentChecksum.hashCode() * 31) + Integer.hashCode(this.mCurrentChecksumLength)) * 31) + this.mLastChecksum.hashCode()) * 31) + Integer.hashCode(this.mLastChecksumLength)) * 31) + Arrays.hashCode(this.mRoutineMET)) * 31) + Arrays.hashCode(this.mExerciseMET)) * 31) + Integer.hashCode(this.mDayMET)) * 31) + Integer.hashCode(this.mIsFirst)) * 31) + Arrays.hashCode(this.mWeekRoutineMET)) * 31) + Arrays.hashCode(this.mWeekExerciseMET);
    }

    public final void setMCurrentChecksum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCurrentChecksum = r2;
    }

    public final void setMCurrentChecksumLength(int r1) {
        this.mCurrentChecksumLength = r1;
    }

    public final void setMDayMET(int r1) {
        this.mDayMET = r1;
    }

    public final void setMExerciseMET(@aa1 float[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExerciseMET = r2;
    }

    public final void setMIsFirst(int r1) {
        this.mIsFirst = r1;
    }

    public final void setMLastChecksum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLastChecksum = r2;
    }

    public final void setMLastChecksumLength(int r1) {
        this.mLastChecksumLength = r1;
    }

    public final void setMRoutineMET(@aa1 float[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRoutineMET = r2;
    }

    public final void setMWeekExerciseMET(@aa1 float[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeekExerciseMET = r2;
    }

    public final void setMWeekRoutineMET(@aa1 float[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeekRoutineMET = r2;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleAICoachPlan(mCurrentChecksum=");
        r0.append(this.mCurrentChecksum);
        r0.append(", mCurrentChecksumLength=");
        r0.append(this.mCurrentChecksumLength);
        r0.append(", mLastChecksum=");
        r0.append(this.mLastChecksum);
        r0.append(", mLastChecksumLength=");
        r0.append(this.mLastChecksumLength);
        r0.append(", mRoutineMET=");
        String r1 = Arrays.toString(this.mRoutineMET);
        Intrinsics.O10IXXX0X(r1, "toString(...)");
        r0.append(r1);
        r0.append(", mExerciseMET=");
        String r2 = Arrays.toString(this.mExerciseMET);
        Intrinsics.O10IXXX0X(r2, "toString(...)");
        r0.append(r2);
        r0.append(", mDayMET=");
        r0.append(this.mDayMET);
        r0.append(", mIsFirst=");
        r0.append(this.mIsFirst);
        r0.append(", mWeekRoutineMET=");
        String r3 = Arrays.toString(this.mWeekRoutineMET);
        Intrinsics.O10IXXX0X(r3, "toString(...)");
        r0.append(r3);
        r0.append(", mWeekExerciseMET=");
        String r4 = Arrays.toString(this.mWeekExerciseMET);
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        r0.append(r4);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleAICoachBeforePlan(@aa1 String r2, int r3, @aa1 String r4, int r5, @aa1 float[] r6, @aa1 float[] r7, int r8, int r9, @aa1 float[] r10, @aa1 float[] r11) {
        Intrinsics.X0O(r2, "mCurrentChecksum");
        Intrinsics.X0O(r4, "mLastChecksum");
        Intrinsics.X0O(r6, "mRoutineMET");
        Intrinsics.X0O(r7, "mExerciseMET");
        Intrinsics.X0O(r10, "mWeekRoutineMET");
        Intrinsics.X0O(r11, "mWeekExerciseMET");
        this.mCurrentChecksum = r2;
        this.mCurrentChecksumLength = r3;
        this.mLastChecksum = r4;
        this.mLastChecksumLength = r5;
        this.mRoutineMET = r6;
        this.mExerciseMET = r7;
        this.mDayMET = r8;
        this.mIsFirst = r9;
        this.mWeekRoutineMET = r10;
        this.mWeekExerciseMET = r11;
    }

    public /* synthetic */ BleAICoachBeforePlan(String r17, int r18, String r19, int r20, float[] r21, float[] r22, int r23, int r24, float[] r25, float[] r26, int r27, DefaultConstructorMarker r28) {
        if ((r27 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r27 & 2) == 0) goto L9;
        int r2 = 0;
    L11:
        if ((r27 & 4) == 0) goto L13;
        String r4 = "-999";
    L15:
        if ((r27 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r27 & 16) == 0) goto L21;
        float[] r6 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    L23:
        if ((r27 & 32) == 0) goto L25;
        float[] r13 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    L27:
        if ((r27 & 64) == 0) goto L29;
        int r14 = 3;
    L31:
        if ((r27 & 128) == 0) goto L33;
        int r15 = 0;
    L35:
        if ((r27 & 256) == 0) goto L37;
        float[] r3 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    L39:
        if ((r27 & 512) == 0) goto L42;
        float[] r29 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    L43:
        this(r1, r2, r4, r5, r6, r13, r14, r15, r3, r29);
        return;
    L42:
        r29 = r26;
        goto L43
    L37:
        r3 = r25;
        goto L39
    L33:
        r15 = r24;
        goto L35
    L29:
        r14 = r23;
        goto L31
    L25:
        r13 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r2 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
