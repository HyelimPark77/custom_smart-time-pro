package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBandKey extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mClick;
    private int mClickDouble;
    private int mClickTriple;
    private int mKey;

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

    public BleBandKey() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleBandKey copy$default(BleBandKey r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mClick;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mClickDouble;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mClickTriple;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mKey;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mClick;
    }

    public final int component2() {
        return this.mClickDouble;
    }

    public final int component3() {
        return this.mClickTriple;
    }

    public final int component4() {
        return this.mKey;
    }

    @aa1
    public final BleBandKey copy(int r2, int r3, int r4, int r5) {
        return new BleBandKey(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mClick = readInt8();
        this.mClickDouble = readInt8();
        this.mClickTriple = readInt8();
        this.mKey = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBandKey) == true) goto L8;
        return false;
    L8:
        BleBandKey r6 = (BleBandKey) r5;
        if (this.mClick == r6.mClick) goto L12;
        return false;
    L12:
        if (this.mClickDouble == r6.mClickDouble) goto L15;
        return false;
    L15:
        if (this.mClickTriple == r6.mClickTriple) goto L18;
        return false;
    L18:
        if (this.mKey == r6.mKey) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMClick() {
        return this.mClick;
    }

    public final int getMClickDouble() {
        return this.mClickDouble;
    }

    public final int getMClickTriple() {
        return this.mClickTriple;
    }

    public final int getMKey() {
        return this.mKey;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mClick) * 31) + Integer.hashCode(this.mClickDouble)) * 31) + Integer.hashCode(this.mClickTriple)) * 31) + Integer.hashCode(this.mKey);
    }

    public final void setMClick(int r1) {
        this.mClick = r1;
    }

    public final void setMClickDouble(int r1) {
        this.mClickDouble = r1;
    }

    public final void setMClickTriple(int r1) {
        this.mClickTriple = r1;
    }

    public final void setMKey(int r1) {
        this.mKey = r1;
    }

    @aa1
    public String toString() {
        return "BleBandKey(mClick=" + this.mClick + ", mClickDouble=" + this.mClickDouble + ", mClickTriple=" + this.mClickTriple + ", mKey=" + this.mKey + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBandKey(int r1, int r2, int r3, int r4) {
        this.mClick = r1;
        this.mClickDouble = r2;
        this.mClickTriple = r3;
        this.mKey = r4;
    }

    public /* synthetic */ BleBandKey(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
