package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStewingData extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 13;
    private long mDuration;
    private float mEndVoltage;
    private float mStartVoltage;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleStewingData() {
        this(0, 0.0f, 0.0f, 0L, 15, null);
    }

    public static /* synthetic */ BleStewingData copy$default(BleStewingData bleStewingData, int i, float f, float f2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleStewingData.mType;
        }
        if ((i2 & 2) != 0) {
            f = bleStewingData.mStartVoltage;
        }
        if ((i2 & 4) != 0) {
            f2 = bleStewingData.mEndVoltage;
        }
        if ((i2 & 8) != 0) {
            j = bleStewingData.mDuration;
        }
        float f3 = f2;
        return bleStewingData.copy(i, f, f3, j);
    }

    public final int component1() {
        return this.mType;
    }

    public final float component2() {
        return this.mStartVoltage;
    }

    public final float component3() {
        return this.mEndVoltage;
    }

    public final long component4() {
        return this.mDuration;
    }

    @aa1
    public final BleStewingData copy(int i, float f, float f2, long j) {
        return new BleStewingData(i, f, f2, j);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mStartVoltage = BleReadable.readUInt32$default(this, null, 1, null) / 10000.0f;
        this.mEndVoltage = BleReadable.readUInt32$default(this, null, 1, null) / 10000.0f;
        this.mDuration = BleReadable.readUInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleStewingData)) {
            return false;
        }
        BleStewingData bleStewingData = (BleStewingData) obj;
        return this.mType == bleStewingData.mType && Float.compare(this.mStartVoltage, bleStewingData.mStartVoltage) == 0 && Float.compare(this.mEndVoltage, bleStewingData.mEndVoltage) == 0 && this.mDuration == bleStewingData.mDuration;
    }

    public final long getMDuration() {
        return this.mDuration;
    }

    public final float getMEndVoltage() {
        return this.mEndVoltage;
    }

    public final float getMStartVoltage() {
        return this.mStartVoltage;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Float.hashCode(this.mStartVoltage)) * 31) + Float.hashCode(this.mEndVoltage)) * 31) + Long.hashCode(this.mDuration);
    }

    public final void setMDuration(long j) {
        this.mDuration = j;
    }

    public final void setMEndVoltage(float f) {
        this.mEndVoltage = f;
    }

    public final void setMStartVoltage(float f) {
        this.mStartVoltage = f;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleStewingData(mType=" + this.mType + ", mStartVoltage=" + this.mStartVoltage + ", mEndVoltage=" + this.mEndVoltage + ", mDuration=" + this.mDuration + "s)";
    }

    public BleStewingData(int i, float f, float f2, long j) {
        this.mType = i;
        this.mStartVoltage = f;
        this.mEndVoltage = f2;
        this.mDuration = j;
    }

    public /* synthetic */ BleStewingData(int i, float f, float f2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0L : j);
    }
}
