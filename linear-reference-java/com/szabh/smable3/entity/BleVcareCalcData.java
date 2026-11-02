package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVcareCalcData extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;
    private int mBioDiffValue;
    private int mBioMaxValue;
    private int mType;

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

    public BleVcareCalcData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleVcareCalcData copy$default(BleVcareCalcData r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mBioMaxValue;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mBioDiffValue;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleVcareCalcData copy(int r2, int r3, int r4) {
        return new BleVcareCalcData(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mBioMaxValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioDiffValue = BleReadable.readUInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleVcareCalcData) == true) goto L8;
        return false;
    L8:
        BleVcareCalcData r6 = (BleVcareCalcData) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mBioMaxValue == r6.mBioMaxValue) goto L15;
        return false;
    L15:
        if (this.mBioDiffValue == r6.mBioDiffValue) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMBioDiffValue(int r1) {
        this.mBioDiffValue = r1;
    }

    public final void setMBioMaxValue(int r1) {
        this.mBioMaxValue = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleVcareCalcData(mType=" + this.mType + ", mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVcareCalcData(int r1, int r2, int r3) {
        this.mType = r1;
        this.mBioMaxValue = r2;
        this.mBioDiffValue = r3;
    }

    public /* synthetic */ BleVcareCalcData(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
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
