package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAirPressureCalibration extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mAirPressure;
    private int mAltitude;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleAirPressureCalibration() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleAirPressureCalibration copy$default(BleAirPressureCalibration bleAirPressureCalibration, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleAirPressureCalibration.mAirPressure;
        }
        if ((i3 & 2) != 0) {
            i2 = bleAirPressureCalibration.mAltitude;
        }
        return bleAirPressureCalibration.copy(i, i2);
    }

    public final int component1() {
        return this.mAirPressure;
    }

    public final int component2() {
        return this.mAltitude;
    }

    @aa1
    public final BleAirPressureCalibration copy(int i, int i2) {
        return new BleAirPressureCalibration(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mAirPressure, null, 2, null);
        BleWritable.writeInt16$default(this, this.mAltitude, null, 2, null);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAirPressureCalibration)) {
            return false;
        }
        BleAirPressureCalibration bleAirPressureCalibration = (BleAirPressureCalibration) obj;
        return this.mAirPressure == bleAirPressureCalibration.mAirPressure && this.mAltitude == bleAirPressureCalibration.mAltitude;
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

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    @aa1
    public String toString() {
        return "BleAirPressureCalibration(mAirPressure=" + this.mAirPressure + ", mAltitude=" + this.mAltitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAirPressureCalibration(int i, int i2) {
        this.mAirPressure = i;
        this.mAltitude = i2;
    }

    public /* synthetic */ BleAirPressureCalibration(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
