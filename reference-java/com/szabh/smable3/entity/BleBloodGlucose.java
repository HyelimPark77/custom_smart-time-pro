package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBloodGlucose extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mTime;
    private int mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleBloodGlucose() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleBloodGlucose copy$default(BleBloodGlucose bleBloodGlucose, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleBloodGlucose.mTime;
        }
        if ((i3 & 2) != 0) {
            i2 = bleBloodGlucose.mValue;
        }
        return bleBloodGlucose.copy(i, i2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mValue;
    }

    @aa1
    public final BleBloodGlucose copy(int i, int i2) {
        return new BleBloodGlucose(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mValue = BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBloodGlucose)) {
            return false;
        }
        BleBloodGlucose bleBloodGlucose = (BleBloodGlucose) obj;
        return this.mTime == bleBloodGlucose.mTime && this.mValue == bleBloodGlucose.mValue;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mValue);
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMValue(int i) {
        this.mValue = i;
    }

    @aa1
    public String toString() {
        return "BleBloodGlucose(mTime=" + this.mTime + ", mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBloodGlucose(int i, int i2) {
        this.mTime = i;
        this.mValue = i2;
    }

    public /* synthetic */ BleBloodGlucose(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
