package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTemperature extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mTemperature;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleTemperature() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleTemperature copy$default(BleTemperature bleTemperature, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleTemperature.mTime;
        }
        if ((i3 & 2) != 0) {
            i2 = bleTemperature.mTemperature;
        }
        return bleTemperature.copy(i, i2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mTemperature;
    }

    @aa1
    public final BleTemperature copy(int i, int i2) {
        return new BleTemperature(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mTemperature = BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTemperature)) {
            return false;
        }
        BleTemperature bleTemperature = (BleTemperature) obj;
        return this.mTime == bleTemperature.mTime && this.mTemperature == bleTemperature.mTemperature;
    }

    public final int getMTemperature() {
        return this.mTemperature;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mTemperature);
    }

    public final void setMTemperature(int i) {
        this.mTemperature = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleTemperature(mTime=" + this.mTime + ", mTemperature=" + this.mTemperature + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTemperature(int i, int i2) {
        this.mTime = i;
        this.mTemperature = i2;
    }

    public /* synthetic */ BleTemperature(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
