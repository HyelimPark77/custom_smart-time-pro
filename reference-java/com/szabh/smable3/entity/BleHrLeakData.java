package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrLeakData extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mMaxLedCur;
    private int mPreValue;
    private int mPsValue;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHrLeakData() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleHrLeakData copy$default(BleHrLeakData bleHrLeakData, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleHrLeakData.mType;
        }
        if ((i5 & 2) != 0) {
            i2 = bleHrLeakData.mPsValue;
        }
        if ((i5 & 4) != 0) {
            i3 = bleHrLeakData.mPreValue;
        }
        if ((i5 & 8) != 0) {
            i4 = bleHrLeakData.mMaxLedCur;
        }
        return bleHrLeakData.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mPsValue;
    }

    public final int component3() {
        return this.mPreValue;
    }

    public final int component4() {
        return this.mMaxLedCur;
    }

    @aa1
    public final BleHrLeakData copy(int i, int i2, int i3, int i4) {
        return new BleHrLeakData(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mPsValue = readUInt8();
        this.mPreValue = readUInt8();
        this.mMaxLedCur = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHrLeakData)) {
            return false;
        }
        BleHrLeakData bleHrLeakData = (BleHrLeakData) obj;
        return this.mType == bleHrLeakData.mType && this.mPsValue == bleHrLeakData.mPsValue && this.mPreValue == bleHrLeakData.mPreValue && this.mMaxLedCur == bleHrLeakData.mMaxLedCur;
    }

    public final int getMMaxLedCur() {
        return this.mMaxLedCur;
    }

    public final int getMPreValue() {
        return this.mPreValue;
    }

    public final int getMPsValue() {
        return this.mPsValue;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mPsValue)) * 31) + Integer.hashCode(this.mPreValue)) * 31) + Integer.hashCode(this.mMaxLedCur);
    }

    public final void setMMaxLedCur(int i) {
        this.mMaxLedCur = i;
    }

    public final void setMPreValue(int i) {
        this.mPreValue = i;
    }

    public final void setMPsValue(int i) {
        this.mPsValue = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleHrLeakData(mType=" + this.mType + ", mPsValue=" + this.mPsValue + ", mPreValue=" + this.mPreValue + ", mMaxLedCur=" + this.mMaxLedCur + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrLeakData(int i, int i2, int i3, int i4) {
        this.mType = i;
        this.mPsValue = i2;
        this.mPreValue = i3;
        this.mMaxLedCur = i4;
    }

    public /* synthetic */ BleHrLeakData(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
