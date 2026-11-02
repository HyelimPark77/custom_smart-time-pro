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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 12;
    private int mPGG;
    private long mPGGRaw;
    private long mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BlePpgSHSY() {
        this(0L, 0L, 0, 7, null);
    }

    public static /* synthetic */ BlePpgSHSY copy$default(BlePpgSHSY blePpgSHSY, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = blePpgSHSY.mTime;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = blePpgSHSY.mPGGRaw;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = blePpgSHSY.mPGG;
        }
        return blePpgSHSY.copy(j3, j4, i);
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
    public final BlePpgSHSY copy(long j, long j2, int i) {
        return new BlePpgSHSY(j, j2, i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPGGRaw = readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPGG = readInt32(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlePpgSHSY)) {
            return false;
        }
        BlePpgSHSY blePpgSHSY = (BlePpgSHSY) obj;
        return this.mTime == blePpgSHSY.mTime && this.mPGGRaw == blePpgSHSY.mPGGRaw && this.mPGG == blePpgSHSY.mPGG;
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

    public final void setMPGG(int i) {
        this.mPGG = i;
    }

    public final void setMPGGRaw(long j) {
        this.mPGGRaw = j;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BlePpgSHSY(mTime=" + this.mTime + ", mPGGRaw=" + this.mPGGRaw + ", mPGG=" + this.mPGG + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePpgSHSY(long j, long j2, int i) {
        this.mTime = j;
        this.mPGGRaw = j2;
        this.mPGG = i;
    }

    public /* synthetic */ BlePpgSHSY(long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0 : i);
    }
}
