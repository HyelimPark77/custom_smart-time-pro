package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBACResultSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleBACResultSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleBACResultSettings copy$default(BleBACResultSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mLow;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mHigh;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mNormal;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mDuration;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mVibrate;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
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
    public final BleBACResultSettings copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleBACResultSettings(r7, r8, r9, r10, r11);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBACResultSettings) == true) goto L8;
        return false;
    L8:
        BleBACResultSettings r6 = (BleBACResultSettings) r5;
        if (this.mLow == r6.mLow) goto L12;
        return false;
    L12:
        if (this.mHigh == r6.mHigh) goto L15;
        return false;
    L15:
        if (this.mNormal == r6.mNormal) goto L18;
        return false;
    L18:
        if (this.mDuration == r6.mDuration) goto L21;
        return false;
    L21:
        if (this.mVibrate == r6.mVibrate) goto L23;
        return false;
    L23:
        return true;
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

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMHigh(int r1) {
        this.mHigh = r1;
    }

    public final void setMLow(int r1) {
        this.mLow = r1;
    }

    public final void setMNormal(int r1) {
        this.mNormal = r1;
    }

    public final void setMVibrate(int r1) {
        this.mVibrate = r1;
    }

    @aa1
    public String toString() {
        return "BleBACResultSettings(mLow=" + this.mLow + ", mHigh=" + this.mHigh + ", mNormal=" + this.mNormal + ", mDuration=" + this.mDuration + ", mVibrate=" + this.mVibrate + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBACResultSettings(int r1, int r2, int r3, int r4, int r5) {
        this.mLow = r1;
        this.mHigh = r2;
        this.mNormal = r3;
        this.mDuration = r4;
        this.mVibrate = r5;
    }

    public /* synthetic */ BleBACResultSettings(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
