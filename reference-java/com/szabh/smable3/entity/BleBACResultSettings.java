package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBACResultSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int LEVE_BLACK = 0;
    public static final int LEVE_BLUE = 3;
    public static final int LEVE_CYAN_BLUE = 7;
    public static final int LEVE_GREEN = 2;
    public static final int LEVE_PURPLE = 6;
    public static final int LEVE_RED = 1;
    public static final int LEVE_WHITE = 4;
    public static final int LEVE_YELLOW = 5;
    private int mDuration;
    private int mHigh;
    private int mLow;
    private int mNormal;
    private int mVibrate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleBACResultSettings() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleBACResultSettings copy$default(BleBACResultSettings bleBACResultSettings, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleBACResultSettings.mLow;
        }
        if ((i6 & 2) != 0) {
            i2 = bleBACResultSettings.mHigh;
        }
        if ((i6 & 4) != 0) {
            i3 = bleBACResultSettings.mNormal;
        }
        if ((i6 & 8) != 0) {
            i4 = bleBACResultSettings.mDuration;
        }
        if ((i6 & 16) != 0) {
            i5 = bleBACResultSettings.mVibrate;
        }
        int i7 = i5;
        int i8 = i3;
        return bleBACResultSettings.copy(i, i2, i8, i4, i7);
    }

    public final int component1() {
        return this.mLow;
    }

    public final int component2() {
        return this.mHigh;
    }

    public final int component3() {
        return this.mNormal;
    }

    public final int component4() {
        return this.mDuration;
    }

    public final int component5() {
        return this.mVibrate;
    }

    @aa1
    public final BleBACResultSettings copy(int i, int i2, int i3, int i4, int i5) {
        return new BleBACResultSettings(i, i2, i3, i4, i5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mLow);
        writeInt8(this.mHigh);
        writeInt8(this.mNormal);
        writeInt8(this.mDuration);
        writeInt8(this.mVibrate);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBACResultSettings)) {
            return false;
        }
        BleBACResultSettings bleBACResultSettings = (BleBACResultSettings) obj;
        return this.mLow == bleBACResultSettings.mLow && this.mHigh == bleBACResultSettings.mHigh && this.mNormal == bleBACResultSettings.mNormal && this.mDuration == bleBACResultSettings.mDuration && this.mVibrate == bleBACResultSettings.mVibrate;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMHigh() {
        return this.mHigh;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMLow() {
        return this.mLow;
    }

    public final int getMNormal() {
        return this.mNormal;
    }

    public final int getMVibrate() {
        return this.mVibrate;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mLow) * 31) + Integer.hashCode(this.mHigh)) * 31) + Integer.hashCode(this.mNormal)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mVibrate);
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMHigh(int i) {
        this.mHigh = i;
    }

    public final void setMLow(int i) {
        this.mLow = i;
    }

    public final void setMNormal(int i) {
        this.mNormal = i;
    }

    public final void setMVibrate(int i) {
        this.mVibrate = i;
    }

    @aa1
    public String toString() {
        return "BleBACResultSettings(mLow=" + this.mLow + ", mHigh=" + this.mHigh + ", mNormal=" + this.mNormal + ", mDuration=" + this.mDuration + ", mVibrate=" + this.mVibrate + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBACResultSettings(int i, int i2, int i3, int i4, int i5) {
        this.mLow = i;
        this.mHigh = i2;
        this.mNormal = i3;
        this.mDuration = i4;
        this.mVibrate = i5;
    }

    public /* synthetic */ BleBACResultSettings(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
