package com.bestmafen.baseble.data;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class BleByteArray {

    @aa1
    private transient ByteOrder mByteOrder;

    @tb1
    private transient byte[] mBytes;

    @aa1
    private final transient int[] mPositions;

    /* JADX WARN: Multi-variable type inference failed */
    public BleByteArray() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final int bitsLeft() {
        byte[] bArr = this.mBytes;
        if (bArr == null) {
            return 0;
        }
        Intrinsics.XXI(bArr);
        return (bArr.length * 8) - bitsOffset();
    }

    public final int bitsOffset() {
        int[] iArr = this.mPositions;
        return (iArr[0] * 8) + iArr[1];
    }

    @aa1
    public final ByteOrder getMByteOrder() {
        return this.mByteOrder;
    }

    @tb1
    public final byte[] getMBytes() {
        return this.mBytes;
    }

    @aa1
    public final int[] getMPositions() {
        return this.mPositions;
    }

    public final boolean outOfRange(int i) {
        int iBitsOffset;
        if (this.mBytes != null && (iBitsOffset = bitsOffset() + i) >= 0) {
            byte[] bArr = this.mBytes;
            Intrinsics.XXI(bArr);
            if (iBitsOffset <= bArr.length * 8) {
                return false;
            }
        }
        return true;
    }

    public final void resetOffset() {
        Arrays.fill(this.mPositions, 0);
    }

    public final void setMByteOrder(@aa1 ByteOrder byteOrder) {
        Intrinsics.X0O(byteOrder, "<set-?>");
        this.mByteOrder = byteOrder;
    }

    public final void setMBytes(@tb1 byte[] bArr) {
        this.mBytes = bArr;
    }

    public final void skip(int i) {
        int iBitsOffset = bitsOffset() + i;
        if (iBitsOffset < 0) {
            iBitsOffset = 0;
        }
        int[] iArr = this.mPositions;
        iArr[0] = iBitsOffset / 8;
        iArr[1] = iBitsOffset % 8;
    }

    public BleByteArray(@tb1 byte[] bArr, @aa1 ByteOrder mByteOrder) {
        Intrinsics.X0O(mByteOrder, "mByteOrder");
        this.mBytes = bArr;
        this.mByteOrder = mByteOrder;
        this.mPositions = new int[2];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleByteArray(byte[] bArr, ByteOrder BIG_ENDIAN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        bArr = (i & 1) != 0 ? null : bArr;
        if ((i & 2) != 0) {
            BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
            Intrinsics.O10IXXX0X(BIG_ENDIAN, "BIG_ENDIAN");
        }
        this(bArr, BIG_ENDIAN);
    }
}
