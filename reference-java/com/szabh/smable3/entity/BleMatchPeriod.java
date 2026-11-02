package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchPeriod extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 12;
    private int mAvgBpm;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMaxBpm;
    private int mSpeed;
    private int mStep;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchPeriod() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleMatchPeriod copy$default(BleMatchPeriod bleMatchPeriod, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleMatchPeriod.mDuration;
        }
        if ((i8 & 2) != 0) {
            i2 = bleMatchPeriod.mDistance;
        }
        if ((i8 & 4) != 0) {
            i3 = bleMatchPeriod.mStep;
        }
        if ((i8 & 8) != 0) {
            i4 = bleMatchPeriod.mCalorie;
        }
        if ((i8 & 16) != 0) {
            i5 = bleMatchPeriod.mSpeed;
        }
        if ((i8 & 32) != 0) {
            i6 = bleMatchPeriod.mAvgBpm;
        }
        if ((i8 & 64) != 0) {
            i7 = bleMatchPeriod.mMaxBpm;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleMatchPeriod.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mDuration;
    }

    public final int component2() {
        return this.mDistance;
    }

    public final int component3() {
        return this.mStep;
    }

    public final int component4() {
        return this.mCalorie;
    }

    public final int component5() {
        return this.mSpeed;
    }

    public final int component6() {
        return this.mAvgBpm;
    }

    public final int component7() {
        return this.mMaxBpm;
    }

    @aa1
    public final BleMatchPeriod copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleMatchPeriod(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDuration = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDistance = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStep = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCalorie = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSpeed = readUInt16(LITTLE_ENDIAN);
        this.mAvgBpm = readUInt8();
        this.mMaxBpm = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchPeriod)) {
            return false;
        }
        BleMatchPeriod bleMatchPeriod = (BleMatchPeriod) obj;
        return this.mDuration == bleMatchPeriod.mDuration && this.mDistance == bleMatchPeriod.mDistance && this.mStep == bleMatchPeriod.mStep && this.mCalorie == bleMatchPeriod.mCalorie && this.mSpeed == bleMatchPeriod.mSpeed && this.mAvgBpm == bleMatchPeriod.mAvgBpm && this.mMaxBpm == bleMatchPeriod.mMaxBpm;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mDuration) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm);
    }

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    @aa1
    public String toString() {
        return "BleMatchPeriod(mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mDuration = i;
        this.mDistance = i2;
        this.mStep = i3;
        this.mCalorie = i4;
        this.mSpeed = i5;
        this.mAvgBpm = i6;
        this.mMaxBpm = i7;
    }

    public /* synthetic */ BleMatchPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
