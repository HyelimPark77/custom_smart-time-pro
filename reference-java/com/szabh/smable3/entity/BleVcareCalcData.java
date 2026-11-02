package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVcareCalcData extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 5;
    private int mBioDiffValue;
    private int mBioMaxValue;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleVcareCalcData() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleVcareCalcData copy$default(BleVcareCalcData bleVcareCalcData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleVcareCalcData.mType;
        }
        if ((i4 & 2) != 0) {
            i2 = bleVcareCalcData.mBioMaxValue;
        }
        if ((i4 & 4) != 0) {
            i3 = bleVcareCalcData.mBioDiffValue;
        }
        return bleVcareCalcData.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mBioMaxValue;
    }

    public final int component3() {
        return this.mBioDiffValue;
    }

    @aa1
    public final BleVcareCalcData copy(int i, int i2, int i3) {
        return new BleVcareCalcData(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mBioMaxValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioDiffValue = BleReadable.readUInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleVcareCalcData)) {
            return false;
        }
        BleVcareCalcData bleVcareCalcData = (BleVcareCalcData) obj;
        return this.mType == bleVcareCalcData.mType && this.mBioMaxValue == bleVcareCalcData.mBioMaxValue && this.mBioDiffValue == bleVcareCalcData.mBioDiffValue;
    }

    public final int getMBioDiffValue() {
        return this.mBioDiffValue;
    }

    public final int getMBioMaxValue() {
        return this.mBioMaxValue;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mBioMaxValue)) * 31) + Integer.hashCode(this.mBioDiffValue);
    }

    public final void setMBioDiffValue(int i) {
        this.mBioDiffValue = i;
    }

    public final void setMBioMaxValue(int i) {
        this.mBioMaxValue = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleVcareCalcData(mType=" + this.mType + ", mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVcareCalcData(int i, int i2, int i3) {
        this.mType = i;
        this.mBioMaxValue = i2;
        this.mBioDiffValue = i3;
    }

    public /* synthetic */ BleVcareCalcData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
