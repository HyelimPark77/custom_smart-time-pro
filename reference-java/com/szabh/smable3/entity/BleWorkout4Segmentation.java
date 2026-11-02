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
    public static final Companion Companion = new Companion(null);

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final ByteOrder getMByteOrder() {
            return BleWorkout4Segmentation.mByteOrder;
        }

        public final void setMByteOrder(@aa1 ByteOrder byteOrder) {
            Intrinsics.X0O(byteOrder, "<set-?>");
            BleWorkout4Segmentation.mByteOrder = byteOrder;
        }

        private Companion() {
        }
    }

    static {
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        mByteOrder = LITTLE_ENDIAN;
    }

    public BleWorkout4Segmentation() {
        this(0, 0, 0, 0, 0, 0, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWorkout4Segmentation copy$default(BleWorkout4Segmentation bleWorkout4Segmentation, int i, int i2, int i3, int i4, int i5, int i6, List list, List list2, List list3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleWorkout4Segmentation.mStart;
        }
        if ((i7 & 2) != 0) {
            i2 = bleWorkout4Segmentation.mEnd;
        }
        if ((i7 & 4) != 0) {
            i3 = bleWorkout4Segmentation.mLength;
        }
        if ((i7 & 8) != 0) {
            i4 = bleWorkout4Segmentation.mSize;
        }
        if ((i7 & 16) != 0) {
            i5 = bleWorkout4Segmentation.mMode;
        }
        if ((i7 & 32) != 0) {
            i6 = bleWorkout4Segmentation.mReserve;
        }
        if ((i7 & 64) != 0) {
            list = bleWorkout4Segmentation.mDistanceList;
        }
        if ((i7 & 128) != 0) {
            list2 = bleWorkout4Segmentation.mDurationList;
        }
        if ((i7 & 256) != 0) {
            list3 = bleWorkout4Segmentation.mValueList;
        }
        List list4 = list2;
        List list5 = list3;
        int i8 = i6;
        List list6 = list;
        int i9 = i5;
        int i10 = i3;
        return bleWorkout4Segmentation.copy(i, i2, i10, i4, i9, i8, list6, list4, list5);
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
    public final BleWorkout4Segmentation copy(int i, int i2, int i3, int i4, int i5, int i6, @aa1 List<Integer> mDistanceList, @aa1 List<Integer> mDurationList, @aa1 List<Integer> mValueList) {
        Intrinsics.X0O(mDistanceList, "mDistanceList");
        Intrinsics.X0O(mDurationList, "mDurationList");
        Intrinsics.X0O(mValueList, "mValueList");
        return new BleWorkout4Segmentation(i, i2, i3, i4, i5, i6, mDistanceList, mDurationList, mValueList);
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
        int i = this.mSize;
        for (int i2 = 0; i2 < i; i2++) {
            this.mDurationList.add(Integer.valueOf(readInt32(mByteOrder)));
            this.mDistanceList.add(Integer.valueOf(readInt32(mByteOrder)));
            int i3 = this.mMode;
            if (i3 == 166 || i3 == 10) {
                this.mValueList.add(Integer.valueOf((int) (readFloat(mByteOrder) * 100)));
            } else {
                this.mValueList.add(Integer.valueOf(readInt32(mByteOrder)));
            }
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWorkout4Segmentation)) {
            return false;
        }
        BleWorkout4Segmentation bleWorkout4Segmentation = (BleWorkout4Segmentation) obj;
        return this.mStart == bleWorkout4Segmentation.mStart && this.mEnd == bleWorkout4Segmentation.mEnd && this.mLength == bleWorkout4Segmentation.mLength && this.mSize == bleWorkout4Segmentation.mSize && this.mMode == bleWorkout4Segmentation.mMode && this.mReserve == bleWorkout4Segmentation.mReserve && Intrinsics.XOO0ii0(this.mDistanceList, bleWorkout4Segmentation.mDistanceList) && Intrinsics.XOO0ii0(this.mDurationList, bleWorkout4Segmentation.mDurationList) && Intrinsics.XOO0ii0(this.mValueList, bleWorkout4Segmentation.mValueList);
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

    public final void setMDistanceList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mDistanceList = list;
    }

    public final void setMDurationList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mDurationList = list;
    }

    public final void setMEnd(int i) {
        this.mEnd = i;
    }

    public final void setMLength(int i) {
        this.mLength = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMReserve(int i) {
        this.mReserve = i;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMValueList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mValueList = list;
    }

    @aa1
    public String toString() {
        return "BleWorkout4Segmentation(mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mLength=" + this.mLength + ", mSize=" + this.mSize + ", mMode=" + this.mMode + ", mReserve=" + this.mReserve + ", mDistanceList=" + this.mDistanceList + ", mDurationList=" + this.mDurationList + ", mValueList=" + this.mValueList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWorkout4Segmentation(int i, int i2, int i3, int i4, int i5, int i6, @aa1 List<Integer> mDistanceList, @aa1 List<Integer> mDurationList, @aa1 List<Integer> mValueList) {
        Intrinsics.X0O(mDistanceList, "mDistanceList");
        Intrinsics.X0O(mDurationList, "mDurationList");
        Intrinsics.X0O(mValueList, "mValueList");
        this.mStart = i;
        this.mEnd = i2;
        this.mLength = i3;
        this.mSize = i4;
        this.mMode = i5;
        this.mReserve = i6;
        this.mDistanceList = mDistanceList;
        this.mDurationList = mDurationList;
        this.mValueList = mValueList;
    }

    public /* synthetic */ BleWorkout4Segmentation(int i, int i2, int i3, int i4, int i5, int i6, List list, List list2, List list3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? new ArrayList() : list, (i7 & 128) != 0 ? new ArrayList() : list2, (i7 & 256) != 0 ? new ArrayList() : list3);
    }
}
