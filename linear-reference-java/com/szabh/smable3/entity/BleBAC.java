package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBAC extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mColor;
    private int mTime;
    private int mValue;

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

    public BleBAC() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleBAC copy$default(BleBAC r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mValue;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mColor;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mValue;
    }

    public final int component3() {
        return this.mColor;
    }

    @aa1
    public final BleBAC copy(int r2, int r3, int r4) {
        return new BleBAC(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mValue = BleReadable.readInt32$default(this, null, 1, null);
        this.mColor = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBAC) == true) goto L8;
        return false;
    L8:
        BleBAC r6 = (BleBAC) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mValue == r6.mValue) goto L15;
        return false;
    L15:
        if (this.mColor == r6.mColor) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMColor() {
        return this.mColor;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mColor);
    }

    public final void setMColor(int r1) {
        this.mColor = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMValue(int r1) {
        this.mValue = r1;
    }

    @aa1
    public String toString() {
        return "BleBAC(mTime=" + this.mTime + ", mValue=" + this.mValue + ", mColor=" + this.mColor + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBAC(int r1, int r2, int r3) {
        this.mTime = r1;
        this.mValue = r2;
        this.mColor = r3;
    }

    public /* synthetic */ BleBAC(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
