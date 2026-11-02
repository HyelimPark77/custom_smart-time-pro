package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWorkout4Segmentation extends BleReadable {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static ByteOrder mByteOrder;

    @aa1
    private List<Integer> mDistanceList;

    @aa1
    private List<Integer> mDurationList;
    private int mEnd;
    private int mLength;
    private int mMode;
    private int mReserve;
    private int mSize;
    private int mStart;

    @aa1
    private List<Integer> mValueList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final ByteOrder getMByteOrder() {
            return BleWorkout4Segmentation.access$getMByteOrder$cp();
        }

        public final void setMByteOrder(@aa1 ByteOrder r2) {
            Intrinsics.X0O(r2, "<set-?>");
            BleWorkout4Segmentation.access$setMByteOrder$cp(r2);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        mByteOrder = r0;
    }

    public BleWorkout4Segmentation() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        List r7 = null;
        List r8 = null;
        List r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static final /* synthetic */ ByteOrder access$getMByteOrder$cp() {
        return mByteOrder;
    }

    public static final /* synthetic */ void access$setMByteOrder$cp(ByteOrder r0) {
        mByteOrder = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWorkout4Segmentation copy$default(BleWorkout4Segmentation r0, int r1, int r2, int r3, int r4, int r5, int r6, List r7, List r8, List r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mStart;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mEnd;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mLength;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mSize;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mMode;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mReserve;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mDistanceList;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mDurationList;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mValueList;
    L29:
        List r12 = r8;
        List r13 = r9;
        int r14 = r6;
        List r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component3() {
        return this.mLength;
    }

    public final int component4() {
        return this.mSize;
    }

    public final int component5() {
        return this.mMode;
    }

    public final int component6() {
        return this.mReserve;
    }

    @aa1
    public final List<Integer> component7() {
        return this.mDistanceList;
    }

    @aa1
    public final List<Integer> component8() {
        return this.mDurationList;
    }

    @aa1
    public final List<Integer> component9() {
        return this.mValueList;
    }

    @aa1
    public final BleWorkout4Segmentation copy(int r12, int r13, int r14, int r15, int r16, int r17, @aa1 List<Integer> r18, @aa1 List<Integer> r19, @aa1 List<Integer> r20) {
        Intrinsics.X0O(r18, "mDistanceList");
        Intrinsics.X0O(r19, "mDurationList");
        Intrinsics.X0O(r20, "mValueList");
        return new BleWorkout4Segmentation(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = readInt32(mByteOrder);
        this.mEnd = readInt32(mByteOrder);
        this.mLength = readInt16(mByteOrder);
        this.mSize = readUInt8();
        this.mMode = readUInt8();
        this.mReserve = readInt32(mByteOrder);
        this.mDistanceList.clear();
        this.mDurationList.clear();
        this.mValueList.clear();
        int r0 = this.mSize;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        this.mDurationList.add(Integer.valueOf(readInt32(mByteOrder)));
        this.mDistanceList.add(Integer.valueOf(readInt32(mByteOrder)));
        int r2 = this.mMode;
        if (r2 != 166) goto L7;
    L10:
        this.mValueList.add(Integer.valueOf((int) (readFloat(mByteOrder) * 100)));
    L11:
        r1 = r1 + 1;
        goto L3
    L7:
        if (r2 == 10) goto L10;
        this.mValueList.add(Integer.valueOf(readInt32(mByteOrder)));
        goto L11
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorkout4Segmentation) == true) goto L8;
        return false;
    L8:
        BleWorkout4Segmentation r6 = (BleWorkout4Segmentation) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mEnd == r6.mEnd) goto L15;
        return false;
    L15:
        if (this.mLength == r6.mLength) goto L18;
        return false;
    L18:
        if (this.mSize == r6.mSize) goto L21;
        return false;
    L21:
        if (this.mMode == r6.mMode) goto L24;
        return false;
    L24:
        if (this.mReserve == r6.mReserve) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mDistanceList, r6.mDistanceList) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mDurationList, r6.mDurationList) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mValueList, r6.mValueList) == true) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final List<Integer> getMDistanceList() {
        return this.mDistanceList;
    }

    @aa1
    public final List<Integer> getMDurationList() {
        return this.mDurationList;
    }

    public final int getMEnd() {
        return this.mEnd;
    }

    public final int getMLength() {
        return this.mLength;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMReserve() {
        return this.mReserve;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public final int getMStart() {
        return this.mStart;
    }

    @aa1
    public final List<Integer> getMValueList() {
        return this.mValueList;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mLength)) * 31) + Integer.hashCode(this.mSize)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mReserve)) * 31) + this.mDistanceList.hashCode()) * 31) + this.mDurationList.hashCode()) * 31) + this.mValueList.hashCode();
    }

    public final void setMDistanceList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDistanceList = r2;
    }

    public final void setMDurationList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDurationList = r2;
    }

    public final void setMEnd(int r1) {
        this.mEnd = r1;
    }

    public final void setMLength(int r1) {
        this.mLength = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMReserve(int r1) {
        this.mReserve = r1;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMValueList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mValueList = r2;
    }

    @aa1
    public String toString() {
        return "BleWorkout4Segmentation(mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mLength=" + this.mLength + ", mSize=" + this.mSize + ", mMode=" + this.mMode + ", mReserve=" + this.mReserve + ", mDistanceList=" + this.mDistanceList + ", mDurationList=" + this.mDurationList + ", mValueList=" + this.mValueList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWorkout4Segmentation(int r2, int r3, int r4, int r5, int r6, int r7, @aa1 List<Integer> r8, @aa1 List<Integer> r9, @aa1 List<Integer> r10) {
        Intrinsics.X0O(r8, "mDistanceList");
        Intrinsics.X0O(r9, "mDurationList");
        Intrinsics.X0O(r10, "mValueList");
        this.mStart = r2;
        this.mEnd = r3;
        this.mLength = r4;
        this.mSize = r5;
        this.mMode = r6;
        this.mReserve = r7;
        this.mDistanceList = r8;
        this.mDurationList = r9;
        this.mValueList = r10;
    }

    public /* synthetic */ BleWorkout4Segmentation(int r2, int r3, int r4, int r5, int r6, int r7, List r8, List r9, List r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
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
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = new ArrayList();
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = new ArrayList();
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = new ArrayList();
    L29:
        List r13 = r10;
        List r14 = r9;
        List r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
    }
}
