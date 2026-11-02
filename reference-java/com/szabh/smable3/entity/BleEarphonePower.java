package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEarphonePower extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mLeftPower;
    private int mRightPower;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleEarphonePower() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleEarphonePower copy$default(BleEarphonePower bleEarphonePower, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleEarphonePower.mLeftPower;
        }
        if ((i3 & 2) != 0) {
            i2 = bleEarphonePower.mRightPower;
        }
        return bleEarphonePower.copy(i, i2);
    }

    public final int component1() {
        return this.mLeftPower;
    }

    public final int component2() {
        return this.mRightPower;
    }

    @aa1
    public final BleEarphonePower copy(int i, int i2) {
        return new BleEarphonePower(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mLeftPower = readInt8();
        this.mRightPower = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mLeftPower);
        writeInt8(this.mRightPower);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEarphonePower)) {
            return false;
        }
        BleEarphonePower bleEarphonePower = (BleEarphonePower) obj;
        return this.mLeftPower == bleEarphonePower.mLeftPower && this.mRightPower == bleEarphonePower.mRightPower;
    }

    public final int getMLeftPower() {
        return this.mLeftPower;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getMRightPower() {
        return this.mRightPower;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mLeftPower) * 31) + Integer.hashCode(this.mRightPower);
    }

    public final void setMLeftPower(int i) {
        this.mLeftPower = i;
    }

    public final void setMRightPower(int i) {
        this.mRightPower = i;
    }

    @aa1
    public String toString() {
        return "BleEarphonePower(mLeftPower=" + this.mLeftPower + ", mRightPower=" + this.mRightPower + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphonePower(int i, int i2) {
        this.mLeftPower = i;
        this.mRightPower = i2;
    }

    public /* synthetic */ BleEarphonePower(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
