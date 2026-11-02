package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGSensorRaw extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;
    private short mX;
    private short mY;
    private short mZ;

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

    public BleGSensorRaw() {
        short r1 = 0;
        short r2 = 0;
        short r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleGSensorRaw copy$default(BleGSensorRaw r0, short r1, short r2, short r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mX;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mY;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mZ;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final short component1() {
        return this.mX;
    }

    public final short component2() {
        return this.mY;
    }

    public final short component3() {
        return this.mZ;
    }

    @aa1
    public final BleGSensorRaw copy(short r2, short r3, short r4) {
        return new BleGSensorRaw(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mX = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mY = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mZ = readInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGSensorRaw) == true) goto L8;
        return false;
    L8:
        BleGSensorRaw r6 = (BleGSensorRaw) r5;
        if (this.mX == r6.mX) goto L12;
        return false;
    L12:
        if (this.mY == r6.mY) goto L15;
        return false;
    L15:
        if (this.mZ == r6.mZ) goto L17;
        return false;
    L17:
        return true;
    }

    public final short getMX() {
        return this.mX;
    }

    public final short getMY() {
        return this.mY;
    }

    public final short getMZ() {
        return this.mZ;
    }

    public int hashCode() {
        return (((Short.hashCode(this.mX) * 31) + Short.hashCode(this.mY)) * 31) + Short.hashCode(this.mZ);
    }

    public final void setMX(short r1) {
        this.mX = r1;
    }

    public final void setMY(short r1) {
        this.mY = r1;
    }

    public final void setMZ(short r1) {
        this.mZ = r1;
    }

    @aa1
    public String toString() {
        return "BleGSensorRaw(mX=" + this.mX + ", mY=" + this.mY + ", mZ=" + this.mZ + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorRaw(short r1, short r2, short r3) {
        this.mX = r1;
        this.mY = r2;
        this.mZ = r3;
    }

    public /* synthetic */ BleGSensorRaw(short r2, short r3, short r4, int r5, DefaultConstructorMarker r6) {
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
