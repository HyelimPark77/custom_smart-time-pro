package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrvBaseLine extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    private int mMaximumBaseline;
    private int mMinimumBaseline;

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

    public BleHrvBaseLine() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleHrvBaseLine copy$default(BleHrvBaseLine r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMinimumBaseline;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mMaximumBaseline;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mMinimumBaseline;
    }

    public final int component2() {
        return this.mMaximumBaseline;
    }

    @aa1
    public final BleHrvBaseLine copy(int r2, int r3) {
        return new BleHrvBaseLine(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMinimumBaseline = readUInt8();
        this.mMaximumBaseline = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHrvBaseLine) == true) goto L8;
        return false;
    L8:
        BleHrvBaseLine r6 = (BleHrvBaseLine) r5;
        if (this.mMinimumBaseline == r6.mMinimumBaseline) goto L12;
        return false;
    L12:
        if (this.mMaximumBaseline == r6.mMaximumBaseline) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMMaximumBaseline() {
        return this.mMaximumBaseline;
    }

    public final int getMMinimumBaseline() {
        return this.mMinimumBaseline;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMinimumBaseline) * 31) + Integer.hashCode(this.mMaximumBaseline);
    }

    public final void setMMaximumBaseline(int r1) {
        this.mMaximumBaseline = r1;
    }

    public final void setMMinimumBaseline(int r1) {
        this.mMinimumBaseline = r1;
    }

    @aa1
    public String toString() {
        return "BleHrvBaseLine(mMinimumBaseline=" + this.mMinimumBaseline + ", mMaximumBaseline=" + this.mMaximumBaseline + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrvBaseLine(int r1, int r2) {
        this.mMinimumBaseline = r1;
        this.mMaximumBaseline = r2;
    }

    public /* synthetic */ BleHrvBaseLine(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
