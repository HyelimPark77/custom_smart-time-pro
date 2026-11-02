package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSleepQuality extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;
    private int mDeep;
    private int mLight;
    private int mTotal;

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

    public BleSleepQuality() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleSleepQuality copy$default(BleSleepQuality r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mLight;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mDeep;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mTotal;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mLight;
    }

    public final int component2() {
        return this.mDeep;
    }

    public final int component3() {
        return this.mTotal;
    }

    @aa1
    public final BleSleepQuality copy(int r2, int r3, int r4) {
        return new BleSleepQuality(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLight = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDeep = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTotal = readUInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mLight;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mDeep;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        int r3 = this.mTotal;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSleepQuality) == true) goto L8;
        return false;
    L8:
        BleSleepQuality r6 = (BleSleepQuality) r5;
        if (this.mLight == r6.mLight) goto L12;
        return false;
    L12:
        if (this.mDeep == r6.mDeep) goto L15;
        return false;
    L15:
        if (this.mTotal == r6.mTotal) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMDeep() {
        return this.mDeep;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 6;
    }

    public final int getMLight() {
        return this.mLight;
    }

    public final int getMTotal() {
        return this.mTotal;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mLight) * 31) + Integer.hashCode(this.mDeep)) * 31) + Integer.hashCode(this.mTotal);
    }

    public final void setMDeep(int r1) {
        this.mDeep = r1;
    }

    public final void setMLight(int r1) {
        this.mLight = r1;
    }

    public final void setMTotal(int r1) {
        this.mTotal = r1;
    }

    @aa1
    public String toString() {
        return "BleSleepQuality(mLight=" + this.mLight + ", mDeep=" + this.mDeep + ", mTotal=" + this.mTotal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSleepQuality(int r1, int r2, int r3) {
        this.mLight = r1;
        this.mDeep = r2;
        this.mTotal = r3;
    }

    public /* synthetic */ BleSleepQuality(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
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
