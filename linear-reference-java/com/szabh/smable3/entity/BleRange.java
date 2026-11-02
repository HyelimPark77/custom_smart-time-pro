package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRange extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mEnd;
    private int mStart;

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

    public BleRange() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleRange copy$default(BleRange r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mStart;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mEnd;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component2() {
        return this.mEnd;
    }

    @aa1
    public final BleRange copy(int r2, int r3) {
        return new BleRange(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = BleReadable.readInt32$default(this, null, 1, null);
        this.mEnd = BleReadable.readInt32$default(this, null, 1, null);
        BleReadable.readInt32$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mStart, null, 2, null);
        BleWritable.writeInt32$default(this, this.mEnd, null, 2, null);
        BleWritable.writeInt32$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRange) == true) goto L8;
        return false;
    L8:
        BleRange r6 = (BleRange) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mEnd == r6.mEnd) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMEnd() {
        return this.mEnd;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd);
    }

    public final void setMEnd(int r1) {
        this.mEnd = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    @aa1
    public String toString() {
        return "BleRange(mStart=" + this.mStart + ", mEnd=" + this.mEnd + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRange(int r1, int r2) {
        this.mStart = r1;
        this.mEnd = r2;
    }

    public /* synthetic */ BleRange(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
