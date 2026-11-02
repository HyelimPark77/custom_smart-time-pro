package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHanBaoVibration extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mBOValue;
    private int mIsSnore;
    private int mTime;
    private int mVibration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHanBaoVibration() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleHanBaoVibration copy$default(BleHanBaoVibration bleHanBaoVibration, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleHanBaoVibration.mTime;
        }
        if ((i5 & 2) != 0) {
            i2 = bleHanBaoVibration.mVibration;
        }
        if ((i5 & 4) != 0) {
            i3 = bleHanBaoVibration.mBOValue;
        }
        if ((i5 & 8) != 0) {
            i4 = bleHanBaoVibration.mIsSnore;
        }
        return bleHanBaoVibration.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mVibration;
    }

    public final int component3() {
        return this.mBOValue;
    }

    public final int component4() {
        return this.mIsSnore;
    }

    @aa1
    public final BleHanBaoVibration copy(int i, int i2, int i3, int i4) {
        return new BleHanBaoVibration(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = (int) BleReadable.readUInt32$default(this, null, 1, null);
        this.mVibration = readUInt8();
        this.mBOValue = readUInt8();
        this.mIsSnore = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHanBaoVibration)) {
            return false;
        }
        BleHanBaoVibration bleHanBaoVibration = (BleHanBaoVibration) obj;
        return this.mTime == bleHanBaoVibration.mTime && this.mVibration == bleHanBaoVibration.mVibration && this.mBOValue == bleHanBaoVibration.mBOValue && this.mIsSnore == bleHanBaoVibration.mIsSnore;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMIsSnore() {
        return this.mIsSnore;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mBOValue)) * 31) + Integer.hashCode(this.mIsSnore);
    }

    public final void setMBOValue(int i) {
        this.mBOValue = i;
    }

    public final void setMIsSnore(int i) {
        this.mIsSnore = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleHanBaoVibration(mTime=" + this.mTime + ", mVibration=" + this.mVibration + ", mBOValue=" + this.mBOValue + ", mIsSnore=" + this.mIsSnore + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHanBaoVibration(int i, int i2, int i3, int i4) {
        this.mTime = i;
        this.mVibration = i2;
        this.mBOValue = i3;
        this.mIsSnore = i4;
    }

    public /* synthetic */ BleHanBaoVibration(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
