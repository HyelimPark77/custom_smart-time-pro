package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRingVibrationSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mRing;
    private int mVibration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleRingVibrationSettings() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleRingVibrationSettings copy$default(BleRingVibrationSettings bleRingVibrationSettings, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleRingVibrationSettings.mVibration;
        }
        if ((i3 & 2) != 0) {
            i2 = bleRingVibrationSettings.mRing;
        }
        return bleRingVibrationSettings.copy(i, i2);
    }

    public final int component1() {
        return this.mVibration;
    }

    public final int component2() {
        return this.mRing;
    }

    @aa1
    public final BleRingVibrationSettings copy(int i, int i2) {
        return new BleRingVibrationSettings(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mVibration = readInt8();
        this.mRing = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mVibration);
        writeInt8(this.mRing);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleRingVibrationSettings)) {
            return false;
        }
        BleRingVibrationSettings bleRingVibrationSettings = (BleRingVibrationSettings) obj;
        return this.mVibration == bleRingVibrationSettings.mVibration && this.mRing == bleRingVibrationSettings.mRing;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMRing() {
        return this.mRing;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mVibration) * 31) + Integer.hashCode(this.mRing);
    }

    public final void setMRing(int i) {
        this.mRing = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleRingVibrationSettings(mVibration=" + this.mVibration + ", mRing=" + this.mRing + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRingVibrationSettings(int i, int i2) {
        this.mVibration = i;
        this.mRing = i2;
    }

    public /* synthetic */ BleRingVibrationSettings(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
