package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGKeySet extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int TYPE_PHOTO = 0;
    public static final int TYPE_RECORD = 2;
    public static final int TYPE_VIDEO = 1;
    private int mClick;
    private int mClickDouble;
    private int mClickTriple;

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

    public BleSGKeySet() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleSGKeySet copy$default(BleSGKeySet r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mClick;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mClickDouble;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mClickTriple;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mClick;
    }

    public final int component2() {
        return this.mClickDouble;
    }

    public final int component3() {
        return this.mClickTriple;
    }

    @aa1
    public final BleSGKeySet copy(int r2, int r3, int r4) {
        return new BleSGKeySet(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mClick = readInt8();
        this.mClickDouble = readInt8();
        this.mClickTriple = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mClick);
        writeInt8(this.mClickDouble);
        writeInt8(this.mClickTriple);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSGKeySet) == true) goto L8;
        return false;
    L8:
        BleSGKeySet r6 = (BleSGKeySet) r5;
        if (this.mClick == r6.mClick) goto L12;
        return false;
    L12:
        if (this.mClickDouble == r6.mClickDouble) goto L15;
        return false;
    L15:
        if (this.mClickTriple == r6.mClickTriple) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMClick() {
        return this.mClick;
    }

    public final int getMClickDouble() {
        return this.mClickDouble;
    }

    public final int getMClickTriple() {
        return this.mClickTriple;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mClick) * 31) + Integer.hashCode(this.mClickDouble)) * 31) + Integer.hashCode(this.mClickTriple);
    }

    public final void setMClick(int r1) {
        this.mClick = r1;
    }

    public final void setMClickDouble(int r1) {
        this.mClickDouble = r1;
    }

    public final void setMClickTriple(int r1) {
        this.mClickTriple = r1;
    }

    @aa1
    public String toString() {
        return "BleSGKeySet(mClick=" + this.mClick + ", mClickDouble=" + this.mClickDouble + ", mClickTriple=" + this.mClickTriple + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGKeySet(int r1, int r2, int r3) {
        this.mClick = r1;
        this.mClickDouble = r2;
        this.mClickTriple = r3;
    }

    public /* synthetic */ BleSGKeySet(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
