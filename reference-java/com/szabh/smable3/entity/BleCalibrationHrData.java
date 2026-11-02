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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mBioDiffValue;
    private int mBioMaxValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleCalibrationHrData() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleCalibrationHrData copy$default(BleCalibrationHrData bleCalibrationHrData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleCalibrationHrData.mBioMaxValue;
        }
        if ((i3 & 2) != 0) {
            i2 = bleCalibrationHrData.mBioDiffValue;
        }
        return bleCalibrationHrData.copy(i, i2);
    }

    public final int component1() {
        return this.mBioMaxValue;
    }

    public final int component2() {
        return this.mBioDiffValue;
    }

    @aa1
    public final BleCalibrationHrData copy(int i, int i2) {
        return new BleCalibrationHrData(i, i2);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCalibrationHrData)) {
            return false;
        }
        BleCalibrationHrData bleCalibrationHrData = (BleCalibrationHrData) obj;
        return this.mBioMaxValue == bleCalibrationHrData.mBioMaxValue && this.mBioDiffValue == bleCalibrationHrData.mBioDiffValue;
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

    public final void setMBioDiffValue(int i) {
        this.mBioDiffValue = i;
    }

    public final void setMBioMaxValue(int i) {
        this.mBioMaxValue = i;
    }

    @aa1
    public String toString() {
        return "BleCalibrationHrData(mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCalibrationHrData(int i, int i2) {
        this.mBioMaxValue = i;
        this.mBioDiffValue = i2;
    }

    public /* synthetic */ BleCalibrationHrData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
