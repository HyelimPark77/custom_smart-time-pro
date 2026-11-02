package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLocationReply extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mAltitude;
    private float mSpeed;
    private float mTotalDistance;

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

    public BleLocationReply() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleLocationReply copy$default(BleLocationReply r0, float r1, float r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mSpeed;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mTotalDistance;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mAltitude;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final float component1() {
        return this.mSpeed;
    }

    public final float component2() {
        return this.mTotalDistance;
    }

    public final int component3() {
        return this.mAltitude;
    }

    @aa1
    public final BleLocationReply copy(float r2, float r3, int r4) {
        return new BleLocationReply(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeFloat$default(this, this.mSpeed, null, 2, null);
        BleWritable.writeFloat$default(this, this.mTotalDistance, null, 2, null);
        BleWritable.writeInt16$default(this, this.mAltitude, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLocationReply) == true) goto L8;
        return false;
    L8:
        BleLocationReply r6 = (BleLocationReply) r5;
        if (Float.compare(this.mSpeed, r6.mSpeed) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.mTotalDistance, r6.mTotalDistance) == 0) goto L15;
        return false;
    L15:
        if (this.mAltitude == r6.mAltitude) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final float getMSpeed() {
        return this.mSpeed;
    }

    public final float getMTotalDistance() {
        return this.mTotalDistance;
    }

    public int hashCode() {
        return (((Float.hashCode(this.mSpeed) * 31) + Float.hashCode(this.mTotalDistance)) * 31) + Integer.hashCode(this.mAltitude);
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMSpeed(float r1) {
        this.mSpeed = r1;
    }

    public final void setMTotalDistance(float r1) {
        this.mTotalDistance = r1;
    }

    @aa1
    public String toString() {
        return "BleLocationReply(mSpeed=" + this.mSpeed + ", mTotalDistance=" + this.mTotalDistance + ", mAltitude=" + this.mAltitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationReply(float r1, float r2, int r3) {
        this.mSpeed = r1;
        this.mTotalDistance = r2;
        this.mAltitude = r3;
    }

    public /* synthetic */ BleLocationReply(float r2, float r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
