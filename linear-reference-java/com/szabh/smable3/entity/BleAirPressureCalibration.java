package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAirPressureCalibration extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mAirPressure;
    private int mAltitude;

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

    public BleAirPressureCalibration() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleAirPressureCalibration copy$default(BleAirPressureCalibration r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mAirPressure;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mAltitude;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mAirPressure;
    }

    public final int component2() {
        return this.mAltitude;
    }

    @aa1
    public final BleAirPressureCalibration copy(int r2, int r3) {
        return new BleAirPressureCalibration(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mAirPressure, null, 2, null);
        BleWritable.writeInt16$default(this, this.mAltitude, null, 2, null);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAirPressureCalibration) == true) goto L8;
        return false;
    L8:
        BleAirPressureCalibration r6 = (BleAirPressureCalibration) r5;
        if (this.mAirPressure == r6.mAirPressure) goto L12;
        return false;
    L12:
        if (this.mAltitude == r6.mAltitude) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mAirPressure) * 31) + Integer.hashCode(this.mAltitude);
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    @aa1
    public String toString() {
        return "BleAirPressureCalibration(mAirPressure=" + this.mAirPressure + ", mAltitude=" + this.mAltitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAirPressureCalibration(int r1, int r2) {
        this.mAirPressure = r1;
        this.mAltitude = r2;
    }

    public /* synthetic */ BleAirPressureCalibration(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
