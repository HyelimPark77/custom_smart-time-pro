package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPDistance extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    private int mCPState;
    private int mDistance;
    private int mMeState;
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

    public BleCPDistance() {
        int r1 = 0;
        int r2 = 0;
        long r3 = 0;
        int r5 = 0;
        this(r1, r2, r3, r5, 15, null);
    }

    public static /* synthetic */ BleCPDistance copy$default(BleCPDistance r0, int r1, int r2, long r3, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mMeState;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mCPState;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mTime;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r0.mDistance;
    L14:
        int r8 = r5;
        long r9 = r3;
        return r0.copy(r1, r2, r9, r8);
    }

    public final int component1() {
        return this.mMeState;
    }

    public final int component2() {
        return this.mCPState;
    }

    public final long component3() {
        return this.mTime;
    }

    public final int component4() {
        return this.mDistance;
    }

    @aa1
    public final BleCPDistance copy(int r7, int r8, long r9, int r11) {
        return new BleCPDistance(r7, r8, r9, r11);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMeState);
        writeInt8(this.mCPState);
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        int r1 = this.mDistance;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r1, r2);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPDistance) == true) goto L8;
        return false;
    L8:
        BleCPDistance r9 = (BleCPDistance) r8;
        if (this.mMeState == r9.mMeState) goto L12;
        return false;
    L12:
        if (this.mCPState == r9.mCPState) goto L15;
        return false;
    L15:
        if (this.mTime == r9.mTime) goto L18;
        return false;
    L18:
        if (this.mDistance == r9.mDistance) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMCPState() {
        return this.mCPState;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 14;
    }

    public final int getMMeState() {
        return this.mMeState;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mMeState) * 31) + Integer.hashCode(this.mCPState)) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mDistance);
    }

    public final void setMCPState(int r1) {
        this.mCPState = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMMeState(int r1) {
        this.mMeState = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleCPDistance(mMeState=" + this.mMeState + ", mCPState=" + this.mCPState + ", mTime=" + this.mTime + ", mDistance=" + this.mDistance + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPDistance(int r1, int r2, long r3, int r5) {
        this.mMeState = r1;
        this.mCPState = r2;
        this.mTime = r3;
        this.mDistance = r5;
    }

    public /* synthetic */ BleCPDistance(int r2, int r3, long r4, int r6, int r7, DefaultConstructorMarker r8) {
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
        int r9 = 0;
    L14:
        long r5 = r4;
        this(r2, r3, r5, r9);
        return;
    L15:
        r9 = r6;
        goto L14
    }
}
