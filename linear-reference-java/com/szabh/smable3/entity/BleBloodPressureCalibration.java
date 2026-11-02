package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBloodPressureCalibration extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    private int mDiastolic;
    private int mSystolic;

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

    public BleBloodPressureCalibration() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleBloodPressureCalibration copy$default(BleBloodPressureCalibration r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mSystolic;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mDiastolic;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mSystolic;
    }

    public final int component2() {
        return this.mDiastolic;
    }

    @aa1
    public final BleBloodPressureCalibration copy(int r2, int r3) {
        return new BleBloodPressureCalibration(r2, r3);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBloodPressureCalibration) == true) goto L8;
        return false;
    L8:
        BleBloodPressureCalibration r6 = (BleBloodPressureCalibration) r5;
        if (this.mSystolic == r6.mSystolic) goto L12;
        return false;
    L12:
        if (this.mDiastolic == r6.mDiastolic) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMDiastolic(int r1) {
        this.mDiastolic = r1;
    }

    public final void setMSystolic(int r1) {
        this.mSystolic = r1;
    }

    @aa1
    public String toString() {
        return "BleBloodPressureCalibration(mSystolic=" + this.mSystolic + ", mDiastolic=" + this.mDiastolic + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBloodPressureCalibration(int r1, int r2) {
        this.mSystolic = r1;
        this.mDiastolic = r2;
    }

    public /* synthetic */ BleBloodPressureCalibration(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
