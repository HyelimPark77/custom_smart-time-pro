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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 12;
    private int mRecoveryDegree;
    private int mRecoveryTime;
    private int mStatusPeriod;
    private int mTrainingLoad;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleTrainingStatus() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleTrainingStatus copy$default(BleTrainingStatus bleTrainingStatus, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleTrainingStatus.mStatusPeriod;
        }
        if ((i5 & 2) != 0) {
            i2 = bleTrainingStatus.mTrainingLoad;
        }
        if ((i5 & 4) != 0) {
            i3 = bleTrainingStatus.mRecoveryTime;
        }
        if ((i5 & 8) != 0) {
            i4 = bleTrainingStatus.mRecoveryDegree;
        }
        return bleTrainingStatus.copy(i, i2, i3, i4);
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
    public final BleTrainingStatus copy(int i, int i2, int i3, int i4) {
        return new BleTrainingStatus(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStatusPeriod = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTrainingLoad = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRecoveryTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRecoveryDegree = readInt16(LITTLE_ENDIAN);
        BleReadable.readInt24$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTrainingStatus)) {
            return false;
        }
        BleTrainingStatus bleTrainingStatus = (BleTrainingStatus) obj;
        return this.mStatusPeriod == bleTrainingStatus.mStatusPeriod && this.mTrainingLoad == bleTrainingStatus.mTrainingLoad && this.mRecoveryTime == bleTrainingStatus.mRecoveryTime && this.mRecoveryDegree == bleTrainingStatus.mRecoveryDegree;
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

    public final void setMRecoveryDegree(int i) {
        this.mRecoveryDegree = i;
    }

    public final void setMRecoveryTime(int i) {
        this.mRecoveryTime = i;
    }

    public final void setMStatusPeriod(int i) {
        this.mStatusPeriod = i;
    }

    public final void setMTrainingLoad(int i) {
        this.mTrainingLoad = i;
    }

    @aa1
    public String toString() {
        return "BleTrainingStatus(mStatusPeriod=" + this.mStatusPeriod + ", mTrainingLoad=" + this.mTrainingLoad + ", mRecoveryTime=" + this.mRecoveryTime + ", mRecoveryDegree=" + this.mRecoveryDegree + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTrainingStatus(int i, int i2, int i3, int i4) {
        this.mStatusPeriod = i;
        this.mTrainingLoad = i2;
        this.mRecoveryTime = i3;
        this.mRecoveryDegree = i4;
    }

    public /* synthetic */ BleTrainingStatus(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
