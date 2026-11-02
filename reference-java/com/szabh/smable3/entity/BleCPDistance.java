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
    public static final Companion Companion = new Companion(null);
    private int mCPState;
    private int mDistance;
    private int mMeState;
    private long mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPDistance() {
        this(0, 0, 0L, 0, 15, null);
    }

    public static /* synthetic */ BleCPDistance copy$default(BleCPDistance bleCPDistance, int i, int i2, long j, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleCPDistance.mMeState;
        }
        if ((i4 & 2) != 0) {
            i2 = bleCPDistance.mCPState;
        }
        if ((i4 & 4) != 0) {
            j = bleCPDistance.mTime;
        }
        if ((i4 & 8) != 0) {
            i3 = bleCPDistance.mDistance;
        }
        int i5 = i3;
        return bleCPDistance.copy(i, i2, j, i5);
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
    public final BleCPDistance copy(int i, int i2, long j, int i3) {
        return new BleCPDistance(i, i2, j, i3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMeState);
        writeInt8(this.mCPState);
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        int i = this.mDistance;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPDistance)) {
            return false;
        }
        BleCPDistance bleCPDistance = (BleCPDistance) obj;
        return this.mMeState == bleCPDistance.mMeState && this.mCPState == bleCPDistance.mCPState && this.mTime == bleCPDistance.mTime && this.mDistance == bleCPDistance.mDistance;
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

    public final void setMCPState(int i) {
        this.mCPState = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMMeState(int i) {
        this.mMeState = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BleCPDistance(mMeState=" + this.mMeState + ", mCPState=" + this.mCPState + ", mTime=" + this.mTime + ", mDistance=" + this.mDistance + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPDistance(int i, int i2, long j, int i3) {
        this.mMeState = i;
        this.mCPState = i2;
        this.mTime = j;
        this.mDistance = i3;
    }

    public /* synthetic */ BleCPDistance(int i, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? 0 : i3);
    }
}
