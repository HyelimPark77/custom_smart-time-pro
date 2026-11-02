package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBloodPressureCalibration extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mDiastolic;
    private int mSystolic;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleBloodPressureCalibration() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleBloodPressureCalibration copy$default(BleBloodPressureCalibration bleBloodPressureCalibration, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleBloodPressureCalibration.mSystolic;
        }
        if ((i3 & 2) != 0) {
            i2 = bleBloodPressureCalibration.mDiastolic;
        }
        return bleBloodPressureCalibration.copy(i, i2);
    }

    public final int component1() {
        return this.mSystolic;
    }

    public final int component2() {
        return this.mDiastolic;
    }

    @aa1
    public final BleBloodPressureCalibration copy(int i, int i2) {
        return new BleBloodPressureCalibration(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mSystolic = readUInt8();
        this.mDiastolic = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mSystolic);
        writeInt8(this.mDiastolic);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBloodPressureCalibration)) {
            return false;
        }
        BleBloodPressureCalibration bleBloodPressureCalibration = (BleBloodPressureCalibration) obj;
        return this.mSystolic == bleBloodPressureCalibration.mSystolic && this.mDiastolic == bleBloodPressureCalibration.mDiastolic;
    }

    public final int getMDiastolic() {
        return this.mDiastolic;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getMSystolic() {
        return this.mSystolic;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mSystolic) * 31) + Integer.hashCode(this.mDiastolic);
    }

    public final void setMDiastolic(int i) {
        this.mDiastolic = i;
    }

    public final void setMSystolic(int i) {
        this.mSystolic = i;
    }

    @aa1
    public String toString() {
        return "BleBloodPressureCalibration(mSystolic=" + this.mSystolic + ", mDiastolic=" + this.mDiastolic + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBloodPressureCalibration(int i, int i2) {
        this.mSystolic = i;
        this.mDiastolic = i2;
    }

    public /* synthetic */ BleBloodPressureCalibration(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
