package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHeartRate extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;
    private int mBpm;
    private int mTime;
    private int mType;

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

    public BleHeartRate() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleHeartRate copy$default(BleHeartRate r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mBpm;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mType;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mBpm;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final BleHeartRate copy(int r2, int r3, int r4) {
        return new BleHeartRate(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mBpm = readUInt8();
        this.mType = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHeartRate) == true) goto L8;
        return false;
    L8:
        BleHeartRate r6 = (BleHeartRate) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mBpm == r6.mBpm) goto L15;
        return false;
    L15:
        if (this.mType == r6.mType) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMBpm() {
        return this.mBpm;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mBpm)) * 31) + Integer.hashCode(this.mType);
    }

    public final void setMBpm(int r1) {
        this.mBpm = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleHeartRate(mTime=" + this.mTime + ", mBpm=" + this.mBpm + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHeartRate(int r1, int r2, int r3) {
        this.mTime = r1;
        this.mBpm = r2;
        this.mType = r3;
    }

    public /* synthetic */ BleHeartRate(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
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
