package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRri extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mRRI;
    private int mRRI2;
    private int mTime;

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

    public BleRri() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleRri copy$default(BleRri r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mRRI;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mRRI2;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mRRI;
    }

    public final int component3() {
        return this.mRRI2;
    }

    @aa1
    public final BleRri copy(int r2, int r3, int r4) {
        return new BleRri(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRRI = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRRI2 = readInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRri) == true) goto L8;
        return false;
    L8:
        BleRri r6 = (BleRri) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mRRI == r6.mRRI) goto L15;
        return false;
    L15:
        if (this.mRRI2 == r6.mRRI2) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMRRI() {
        return this.mRRI;
    }

    public final int getMRRI2() {
        return this.mRRI2;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mRRI)) * 31) + Integer.hashCode(this.mRRI2);
    }

    public final void setMRRI(int r1) {
        this.mRRI = r1;
    }

    public final void setMRRI2(int r1) {
        this.mRRI2 = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleRri(mTime=" + this.mTime + ", mRRI=" + this.mRRI + ", mRRI2=" + this.mRRI2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRri(int r1, int r2, int r3) {
        this.mTime = r1;
        this.mRRI = r2;
        this.mRRI2 = r3;
    }

    public /* synthetic */ BleRri(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
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
