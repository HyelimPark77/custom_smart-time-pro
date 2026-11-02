package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BlePpgSHSY extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mPGG;
    private long mPGGRaw;
    private long mTime;

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

    public BlePpgSHSY() {
        long r1 = 0;
        long r3 = 0;
        int r5 = 0;
        this(r1, r3, r5, 7, null);
    }

    public static /* synthetic */ BlePpgSHSY copy$default(BlePpgSHSY r6, long r7, long r9, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = r6.mTime;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        r9 = r6.mPGGRaw;
    L8:
        long r3 = r9;
        if ((r12 & 4) == 0) goto L12;
        r11 = r6.mPGG;
    L12:
        return r6.copy(r1, r3, r11);
    }

    public final long component1() {
        return this.mTime;
    }

    public final long component2() {
        return this.mPGGRaw;
    }

    public final int component3() {
        return this.mPGG;
    }

    @aa1
    public final BlePpgSHSY copy(long r7, long r9, int r11) {
        return new BlePpgSHSY(r7, r9, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPGGRaw = readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPGG = readInt32(r0);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BlePpgSHSY) == true) goto L8;
        return false;
    L8:
        BlePpgSHSY r9 = (BlePpgSHSY) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mPGGRaw == r9.mPGGRaw) goto L15;
        return false;
    L15:
        if (this.mPGG == r9.mPGG) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMPGG() {
        return this.mPGG;
    }

    public final long getMPGGRaw() {
        return this.mPGGRaw;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.mTime) * 31) + Long.hashCode(this.mPGGRaw)) * 31) + Integer.hashCode(this.mPGG);
    }

    public final void setMPGG(int r1) {
        this.mPGG = r1;
    }

    public final void setMPGGRaw(long r1) {
        this.mPGGRaw = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BlePpgSHSY(mTime=" + this.mTime + ", mPGGRaw=" + this.mPGGRaw + ", mPGG=" + this.mPGG + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePpgSHSY(long r1, long r3, int r5) {
        this.mTime = r1;
        this.mPGGRaw = r3;
        this.mPGG = r5;
    }

    public /* synthetic */ BlePpgSHSY(long r3, long r5, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r8 & 4) == 0) goto L11;
        r7 = 0;
    L11:
        long r4 = r3;
        this(r4, r5, r7);
    }
}
