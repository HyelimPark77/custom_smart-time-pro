package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTrainingStatus extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mRecoveryDegree;
    private int mRecoveryTime;
    private int mStatusPeriod;
    private int mTrainingLoad;

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

    public BleTrainingStatus() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleTrainingStatus copy$default(BleTrainingStatus r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mStatusPeriod;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mTrainingLoad;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mRecoveryTime;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mRecoveryDegree;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mStatusPeriod;
    }

    public final int component2() {
        return this.mTrainingLoad;
    }

    public final int component3() {
        return this.mRecoveryTime;
    }

    public final int component4() {
        return this.mRecoveryDegree;
    }

    @aa1
    public final BleTrainingStatus copy(int r2, int r3, int r4, int r5) {
        return new BleTrainingStatus(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStatusPeriod = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTrainingLoad = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRecoveryTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRecoveryDegree = readInt16(r0);
        BleReadable.readInt24$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTrainingStatus) == true) goto L8;
        return false;
    L8:
        BleTrainingStatus r6 = (BleTrainingStatus) r5;
        if (this.mStatusPeriod == r6.mStatusPeriod) goto L12;
        return false;
    L12:
        if (this.mTrainingLoad == r6.mTrainingLoad) goto L15;
        return false;
    L15:
        if (this.mRecoveryTime == r6.mRecoveryTime) goto L18;
        return false;
    L18:
        if (this.mRecoveryDegree == r6.mRecoveryDegree) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMRecoveryDegree() {
        return this.mRecoveryDegree;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final int getMStatusPeriod() {
        return this.mStatusPeriod;
    }

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mStatusPeriod) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mRecoveryDegree);
    }

    public final void setMRecoveryDegree(int r1) {
        this.mRecoveryDegree = r1;
    }

    public final void setMRecoveryTime(int r1) {
        this.mRecoveryTime = r1;
    }

    public final void setMStatusPeriod(int r1) {
        this.mStatusPeriod = r1;
    }

    public final void setMTrainingLoad(int r1) {
        this.mTrainingLoad = r1;
    }

    @aa1
    public String toString() {
        return "BleTrainingStatus(mStatusPeriod=" + this.mStatusPeriod + ", mTrainingLoad=" + this.mTrainingLoad + ", mRecoveryTime=" + this.mRecoveryTime + ", mRecoveryDegree=" + this.mRecoveryDegree + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTrainingStatus(int r1, int r2, int r3, int r4) {
        this.mStatusPeriod = r1;
        this.mTrainingLoad = r2;
        this.mRecoveryTime = r3;
        this.mRecoveryDegree = r4;
    }

    public /* synthetic */ BleTrainingStatus(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
