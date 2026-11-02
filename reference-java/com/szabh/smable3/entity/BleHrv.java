package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrv extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mAvgValue;
    private int mTime;
    private int mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHrv() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleHrv copy$default(BleHrv bleHrv, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleHrv.mTime;
        }
        if ((i4 & 2) != 0) {
            i2 = bleHrv.mValue;
        }
        if ((i4 & 4) != 0) {
            i3 = bleHrv.mAvgValue;
        }
        return bleHrv.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mValue;
    }

    public final int component3() {
        return this.mAvgValue;
    }

    @aa1
    public final BleHrv copy(int i, int i2, int i3) {
        return new BleHrv(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mValue = readUInt8();
        this.mAvgValue = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHrv)) {
            return false;
        }
        BleHrv bleHrv = (BleHrv) obj;
        return this.mTime == bleHrv.mTime && this.mValue == bleHrv.mValue && this.mAvgValue == bleHrv.mAvgValue;
    }

    public final int getMAvgValue() {
        return this.mAvgValue;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mAvgValue);
    }

    public final void setMAvgValue(int i) {
        this.mAvgValue = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMValue(int i) {
        this.mValue = i;
    }

    @aa1
    public String toString() {
        return "BleHrv(mTime=" + this.mTime + ", mValue=" + this.mValue + ", mAvgValue=" + this.mAvgValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrv(int i, int i2, int i3) {
        this.mTime = i;
        this.mValue = i2;
        this.mAvgValue = i3;
    }

    public /* synthetic */ BleHrv(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
