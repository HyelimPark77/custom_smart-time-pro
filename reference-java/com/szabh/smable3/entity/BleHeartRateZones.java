package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHeartRateZones extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 20;
    private int mAerobicTime;
    private int mAnaerobicTime;
    private int mFatBurning;
    private int mLimitTime;
    private int mWarmUpTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHeartRateZones() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleHeartRateZones copy$default(BleHeartRateZones bleHeartRateZones, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleHeartRateZones.mWarmUpTime;
        }
        if ((i6 & 2) != 0) {
            i2 = bleHeartRateZones.mFatBurning;
        }
        if ((i6 & 4) != 0) {
            i3 = bleHeartRateZones.mAerobicTime;
        }
        if ((i6 & 8) != 0) {
            i4 = bleHeartRateZones.mAnaerobicTime;
        }
        if ((i6 & 16) != 0) {
            i5 = bleHeartRateZones.mLimitTime;
        }
        int i7 = i5;
        int i8 = i3;
        return bleHeartRateZones.copy(i, i2, i8, i4, i7);
    }

    public final int component1() {
        return this.mWarmUpTime;
    }

    public final int component2() {
        return this.mFatBurning;
    }

    public final int component3() {
        return this.mAerobicTime;
    }

    public final int component4() {
        return this.mAnaerobicTime;
    }

    public final int component5() {
        return this.mLimitTime;
    }

    @aa1
    public final BleHeartRateZones copy(int i, int i2, int i3, int i4, int i5) {
        return new BleHeartRateZones(i, i2, i3, i4, i5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mWarmUpTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mFatBurning = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAerobicTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAnaerobicTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLimitTime = readInt32(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHeartRateZones)) {
            return false;
        }
        BleHeartRateZones bleHeartRateZones = (BleHeartRateZones) obj;
        return this.mWarmUpTime == bleHeartRateZones.mWarmUpTime && this.mFatBurning == bleHeartRateZones.mFatBurning && this.mAerobicTime == bleHeartRateZones.mAerobicTime && this.mAnaerobicTime == bleHeartRateZones.mAnaerobicTime && this.mLimitTime == bleHeartRateZones.mLimitTime;
    }

    public final int getMAerobicTime() {
        return this.mAerobicTime;
    }

    public final int getMAnaerobicTime() {
        return this.mAnaerobicTime;
    }

    public final int getMFatBurning() {
        return this.mFatBurning;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 20;
    }

    public final int getMLimitTime() {
        return this.mLimitTime;
    }

    public final int getMWarmUpTime() {
        return this.mWarmUpTime;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mWarmUpTime) * 31) + Integer.hashCode(this.mFatBurning)) * 31) + Integer.hashCode(this.mAerobicTime)) * 31) + Integer.hashCode(this.mAnaerobicTime)) * 31) + Integer.hashCode(this.mLimitTime);
    }

    public final void setMAerobicTime(int i) {
        this.mAerobicTime = i;
    }

    public final void setMAnaerobicTime(int i) {
        this.mAnaerobicTime = i;
    }

    public final void setMFatBurning(int i) {
        this.mFatBurning = i;
    }

    public final void setMLimitTime(int i) {
        this.mLimitTime = i;
    }

    public final void setMWarmUpTime(int i) {
        this.mWarmUpTime = i;
    }

    @aa1
    public String toString() {
        return "BleEarphoneKey(mWarmUpTime=" + this.mWarmUpTime + ", mFatBurning=" + this.mFatBurning + ", mAerobicTime=" + this.mAerobicTime + ", mAnaerobicTime=" + this.mAnaerobicTime + ", mLimitTime=" + this.mLimitTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHeartRateZones(int i, int i2, int i3, int i4, int i5) {
        this.mWarmUpTime = i;
        this.mFatBurning = i2;
        this.mAerobicTime = i3;
        this.mAnaerobicTime = i4;
        this.mLimitTime = i5;
    }

    public /* synthetic */ BleHeartRateZones(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
