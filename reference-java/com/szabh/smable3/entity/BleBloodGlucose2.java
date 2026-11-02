package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBloodGlucose2 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mMax;
    private int mMin;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleBloodGlucose2() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleBloodGlucose2 copy$default(BleBloodGlucose2 bleBloodGlucose2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleBloodGlucose2.mTime;
        }
        if ((i4 & 2) != 0) {
            i2 = bleBloodGlucose2.mMin;
        }
        if ((i4 & 4) != 0) {
            i3 = bleBloodGlucose2.mMax;
        }
        return bleBloodGlucose2.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMin;
    }

    public final int component3() {
        return this.mMax;
    }

    @aa1
    public final BleBloodGlucose2 copy(int i, int i2, int i3) {
        return new BleBloodGlucose2(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMin = BleReadable.readInt16$default(this, null, 1, null);
        this.mMax = BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBloodGlucose2)) {
            return false;
        }
        BleBloodGlucose2 bleBloodGlucose2 = (BleBloodGlucose2) obj;
        return this.mTime == bleBloodGlucose2.mTime && this.mMin == bleBloodGlucose2.mMin && this.mMax == bleBloodGlucose2.mMax;
    }

    public final int getMMax() {
        return this.mMax;
    }

    public final int getMMin() {
        return this.mMin;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMin)) * 31) + Integer.hashCode(this.mMax);
    }

    public final void setMMax(int i) {
        this.mMax = i;
    }

    public final void setMMin(int i) {
        this.mMin = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleBloodGlucose2(mTime=" + this.mTime + ", mMin=" + this.mMin + ", mMax=" + this.mMax + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBloodGlucose2(int i, int i2, int i3) {
        this.mTime = i;
        this.mMin = i2;
        this.mMax = i3;
    }

    public /* synthetic */ BleBloodGlucose2(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
