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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 20;
    private int mAerobicTime;
    private int mAnaerobicTime;
    private int mFatBurning;
    private int mLimitTime;
    private int mWarmUpTime;

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

    public BleHeartRateZones() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleHeartRateZones copy$default(BleHeartRateZones r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mWarmUpTime;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mFatBurning;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mAerobicTime;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mAnaerobicTime;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mLimitTime;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
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
    public final BleHeartRateZones copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleHeartRateZones(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mWarmUpTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mFatBurning = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAerobicTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAnaerobicTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLimitTime = readInt32(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHeartRateZones) == true) goto L8;
        return false;
    L8:
        BleHeartRateZones r6 = (BleHeartRateZones) r5;
        if (this.mWarmUpTime == r6.mWarmUpTime) goto L12;
        return false;
    L12:
        if (this.mFatBurning == r6.mFatBurning) goto L15;
        return false;
    L15:
        if (this.mAerobicTime == r6.mAerobicTime) goto L18;
        return false;
    L18:
        if (this.mAnaerobicTime == r6.mAnaerobicTime) goto L21;
        return false;
    L21:
        if (this.mLimitTime == r6.mLimitTime) goto L23;
        return false;
    L23:
        return true;
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

    public final void setMAerobicTime(int r1) {
        this.mAerobicTime = r1;
    }

    public final void setMAnaerobicTime(int r1) {
        this.mAnaerobicTime = r1;
    }

    public final void setMFatBurning(int r1) {
        this.mFatBurning = r1;
    }

    public final void setMLimitTime(int r1) {
        this.mLimitTime = r1;
    }

    public final void setMWarmUpTime(int r1) {
        this.mWarmUpTime = r1;
    }

    @aa1
    public String toString() {
        return "BleEarphoneKey(mWarmUpTime=" + this.mWarmUpTime + ", mFatBurning=" + this.mFatBurning + ", mAerobicTime=" + this.mAerobicTime + ", mAnaerobicTime=" + this.mAnaerobicTime + ", mLimitTime=" + this.mLimitTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHeartRateZones(int r1, int r2, int r3, int r4, int r5) {
        this.mWarmUpTime = r1;
        this.mFatBurning = r2;
        this.mAerobicTime = r3;
        this.mAnaerobicTime = r4;
        this.mLimitTime = r5;
    }

    public /* synthetic */ BleHeartRateZones(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
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
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
