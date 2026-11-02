package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEnergyRating extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mScore;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleEnergyRating() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleEnergyRating copy$default(BleEnergyRating bleEnergyRating, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleEnergyRating.mTime;
        }
        if ((i3 & 2) != 0) {
            i2 = bleEnergyRating.mScore;
        }
        return bleEnergyRating.copy(i, i2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mScore;
    }

    @aa1
    public final BleEnergyRating copy(int i, int i2) {
        return new BleEnergyRating(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mScore = readUInt8();
        readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEnergyRating)) {
            return false;
        }
        BleEnergyRating bleEnergyRating = (BleEnergyRating) obj;
        return this.mTime == bleEnergyRating.mTime && this.mScore == bleEnergyRating.mScore;
    }

    public final int getMScore() {
        return this.mScore;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mScore);
    }

    public final void setMScore(int i) {
        this.mScore = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleEnergyRating(mTime=" + this.mTime + ", mScore=" + this.mScore + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEnergyRating(int i, int i2) {
        this.mTime = i;
        this.mScore = i2;
    }

    public /* synthetic */ BleEnergyRating(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
