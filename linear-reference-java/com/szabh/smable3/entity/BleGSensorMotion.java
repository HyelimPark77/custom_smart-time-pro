package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGSensorMotion extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    private short mMotion;

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

    public BleGSensorMotion() {
        short r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleGSensorMotion copy$default(BleGSensorMotion r0, short r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mMotion;
    L6:
        return r0.copy(r1);
    }

    public final short component1() {
        return this.mMotion;
    }

    @aa1
    public final BleGSensorMotion copy(short r2) {
        return new BleGSensorMotion(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMotion = readInt16(r0);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleGSensorMotion) == true) goto L9;
        return false;
    L9:
        if (this.mMotion == ((BleGSensorMotion) r4).mMotion) goto L11;
        return false;
    L11:
        return true;
    }

    public final short getMMotion() {
        return this.mMotion;
    }

    public int hashCode() {
        return Short.hashCode(this.mMotion);
    }

    public final void setMMotion(short r1) {
        this.mMotion = r1;
    }

    @aa1
    public String toString() {
        return "BleGSensorMotion(mMotion=" + this.mMotion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorMotion(short r1) {
        this.mMotion = r1;
    }

    public /* synthetic */ BleGSensorMotion(short r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
