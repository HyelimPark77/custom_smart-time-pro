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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public final int bitsLeft() {
        byte[] r0 = this.mBytes;
        if (r0 != null) goto L6;
        return 0;
    L6:
        Intrinsics.XXI(r0);
        return (r0.length * 8) - bitsOffset();
    }

    public final int bitsOffset() {
        int[] r0 = this.mPositions;
        return (r0[0] * 8) + r0[1];
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

    public final boolean outOfRange(int r3) {
        if (this.mBytes != null) goto L5;
        return true;
    L5:
        int r0 = bitsOffset() + r3;
        if (r0 < 0) goto L12;
        byte[] r4 = this.mBytes;
        Intrinsics.XXI(r4);
        if (r0 > (r4.length * 8)) goto L12;
        return false;
    L12:
        return true;
    }

    public final void resetOffset() {
        Arrays.fill(this.mPositions, 0);
    }

    public final void setMByteOrder(@aa1 ByteOrder r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mByteOrder = r2;
    }

    public final void setMBytes(@tb1 byte[] r1) {
        this.mBytes = r1;
    }

    public final void skip(int r4) {
        int r0 = bitsOffset() + r4;
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        int[] r1 = this.mPositions;
        r1[0] = r0 / 8;
        r1[1] = r0 % 8;
    }

    public BleByteArray(@tb1 byte[] r2, @aa1 ByteOrder r3) {
        Intrinsics.X0O(r3, "mByteOrder");
        this.mBytes = r2;
        this.mByteOrder = r3;
        this.mPositions = new int[2];
    }

    public /* synthetic */ BleByteArray(byte[] r1, ByteOrder r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "BIG_ENDIAN");
    L8:
        this(r1, r2);
    }
}
