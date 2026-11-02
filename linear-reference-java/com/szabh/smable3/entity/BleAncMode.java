package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAncMode extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mLeftCurVal;
    private int mLeftMax;
    private int mRightCurVal;
    private int mRightMax;

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

    public BleAncMode() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleAncMode copy$default(BleAncMode r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mLeftMax;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mRightMax;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mLeftCurVal;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mRightCurVal;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mLeftMax;
    }

    public final int component2() {
        return this.mRightMax;
    }

    public final int component3() {
        return this.mLeftCurVal;
    }

    public final int component4() {
        return this.mRightCurVal;
    }

    @aa1
    public final BleAncMode copy(int r2, int r3, int r4, int r5) {
        return new BleAncMode(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLeftMax = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRightMax = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLeftCurVal = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRightCurVal = readUInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mLeftMax;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mRightMax;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        int r3 = this.mLeftCurVal;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
        int r4 = this.mRightCurVal;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r4, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAncMode) == true) goto L8;
        return false;
    L8:
        BleAncMode r6 = (BleAncMode) r5;
        if (this.mLeftMax == r6.mLeftMax) goto L12;
        return false;
    L12:
        if (this.mRightMax == r6.mRightMax) goto L15;
        return false;
    L15:
        if (this.mLeftCurVal == r6.mLeftCurVal) goto L18;
        return false;
    L18:
        if (this.mRightCurVal == r6.mRightCurVal) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMLeftCurVal() {
        return this.mLeftCurVal;
    }

    public final int getMLeftMax() {
        return this.mLeftMax;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMRightCurVal() {
        return this.mRightCurVal;
    }

    public final int getMRightMax() {
        return this.mRightMax;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mLeftMax) * 31) + Integer.hashCode(this.mRightMax)) * 31) + Integer.hashCode(this.mLeftCurVal)) * 31) + Integer.hashCode(this.mRightCurVal);
    }

    public final void setMLeftCurVal(int r1) {
        this.mLeftCurVal = r1;
    }

    public final void setMLeftMax(int r1) {
        this.mLeftMax = r1;
    }

    public final void setMRightCurVal(int r1) {
        this.mRightCurVal = r1;
    }

    public final void setMRightMax(int r1) {
        this.mRightMax = r1;
    }

    @aa1
    public String toString() {
        return "BleAncMode(mLeftMax=" + this.mLeftMax + ", mRightMax=" + this.mRightMax + ", mLeftCurVal=" + this.mLeftCurVal + ", mRightCurVal=" + this.mRightCurVal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAncMode(int r1, int r2, int r3, int r4) {
        this.mLeftMax = r1;
        this.mRightMax = r2;
        this.mLeftCurVal = r3;
        this.mRightCurVal = r4;
    }

    public /* synthetic */ BleAncMode(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
