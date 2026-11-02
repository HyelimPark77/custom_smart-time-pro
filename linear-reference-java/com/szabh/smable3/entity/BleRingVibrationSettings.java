package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRingVibrationSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mRing;
    private int mVibration;

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

    public BleRingVibrationSettings() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleRingVibrationSettings copy$default(BleRingVibrationSettings r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mVibration;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mRing;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mVibration;
    }

    public final int component2() {
        return this.mRing;
    }

    @aa1
    public final BleRingVibrationSettings copy(int r2, int r3) {
        return new BleRingVibrationSettings(r2, r3);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRingVibrationSettings) == true) goto L8;
        return false;
    L8:
        BleRingVibrationSettings r6 = (BleRingVibrationSettings) r5;
        if (this.mVibration == r6.mVibration) goto L12;
        return false;
    L12:
        if (this.mRing == r6.mRing) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMRing(int r1) {
        this.mRing = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleRingVibrationSettings(mVibration=" + this.mVibration + ", mRing=" + this.mRing + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRingVibrationSettings(int r1, int r2) {
        this.mVibration = r1;
        this.mRing = r2;
    }

    public /* synthetic */ BleRingVibrationSettings(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
