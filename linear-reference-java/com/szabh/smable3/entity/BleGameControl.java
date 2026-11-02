package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGameControl extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    public static final int STATE_CLOSE_GSENSOR = 6;
    public static final int STATE_END = 4;
    public static final int STATE_GOING = 1;
    public static final int STATE_OPEN_GSENSOR = 5;
    public static final int STATE_PAUSE = 3;
    public static final int STATE_RESUME = 2;
    public static final int STATE_START = 0;
    private int mState;
    private int mX;
    private int mY;
    private int mZ;

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

    public BleGameControl() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleGameControl copy$default(BleGameControl r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mX;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mY;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mZ;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mX;
    }

    public final int component3() {
        return this.mY;
    }

    public final int component4() {
        return this.mZ;
    }

    @aa1
    public final BleGameControl copy(int r2, int r3, int r4, int r5) {
        return new BleGameControl(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
        readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mX = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mY = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mZ = readInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeInt8(0);
        int r0 = this.mX;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mY;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        int r3 = this.mZ;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGameControl) == true) goto L8;
        return false;
    L8:
        BleGameControl r6 = (BleGameControl) r5;
        if (this.mState == r6.mState) goto L12;
        return false;
    L12:
        if (this.mX == r6.mX) goto L15;
        return false;
    L15:
        if (this.mY == r6.mY) goto L18;
        return false;
    L18:
        if (this.mZ == r6.mZ) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMX() {
        return this.mX;
    }

    public final int getMY() {
        return this.mY;
    }

    public final int getMZ() {
        return this.mZ;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.mX)) * 31) + Integer.hashCode(this.mY)) * 31) + Integer.hashCode(this.mZ);
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMX(int r1) {
        this.mX = r1;
    }

    public final void setMY(int r1) {
        this.mY = r1;
    }

    public final void setMZ(int r1) {
        this.mZ = r1;
    }

    @aa1
    public String toString() {
        return "BleGameControl(mState=" + this.mState + ", mX=" + this.mX + ", mY=" + this.mY + ", mZ=" + this.mZ + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGameControl(int r1, int r2, int r3, int r4) {
        this.mState = r1;
        this.mX = r2;
        this.mY = r3;
        this.mZ = r4;
    }

    public /* synthetic */ BleGameControl(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
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
