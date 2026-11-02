package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCalibrationHrData extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mBioDiffValue;
    private int mBioMaxValue;

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

    public BleCalibrationHrData() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleCalibrationHrData copy$default(BleCalibrationHrData r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mBioMaxValue;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mBioDiffValue;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mBioMaxValue;
    }

    public final int component2() {
        return this.mBioDiffValue;
    }

    @aa1
    public final BleCalibrationHrData copy(int r2, int r3) {
        return new BleCalibrationHrData(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mBioMaxValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioDiffValue = BleReadable.readUInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt16$default(this, this.mBioMaxValue, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBioDiffValue, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCalibrationHrData) == true) goto L8;
        return false;
    L8:
        BleCalibrationHrData r6 = (BleCalibrationHrData) r5;
        if (this.mBioMaxValue == r6.mBioMaxValue) goto L12;
        return false;
    L12:
        if (this.mBioDiffValue == r6.mBioDiffValue) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMBioDiffValue() {
        return this.mBioDiffValue;
    }

    public final int getMBioMaxValue() {
        return this.mBioMaxValue;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mBioMaxValue) * 31) + Integer.hashCode(this.mBioDiffValue);
    }

    public final void setMBioDiffValue(int r1) {
        this.mBioDiffValue = r1;
    }

    public final void setMBioMaxValue(int r1) {
        this.mBioMaxValue = r1;
    }

    @aa1
    public String toString() {
        return "BleCalibrationHrData(mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCalibrationHrData(int r1, int r2) {
        this.mBioMaxValue = r1;
        this.mBioDiffValue = r2;
    }

    public /* synthetic */ BleCalibrationHrData(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
