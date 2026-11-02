package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLocationReply extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    private int mAltitude;
    private float mSpeed;
    private float mTotalDistance;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleLocationReply() {
        this(0.0f, 0.0f, 0, 7, null);
    }

    public static /* synthetic */ BleLocationReply copy$default(BleLocationReply bleLocationReply, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = bleLocationReply.mSpeed;
        }
        if ((i2 & 2) != 0) {
            f2 = bleLocationReply.mTotalDistance;
        }
        if ((i2 & 4) != 0) {
            i = bleLocationReply.mAltitude;
        }
        return bleLocationReply.copy(f, f2, i);
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
    public final BleLocationReply copy(float f, float f2, int i) {
        return new BleLocationReply(f, f2, i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeFloat$default(this, this.mSpeed, null, 2, null);
        BleWritable.writeFloat$default(this, this.mTotalDistance, null, 2, null);
        BleWritable.writeInt16$default(this, this.mAltitude, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLocationReply)) {
            return false;
        }
        BleLocationReply bleLocationReply = (BleLocationReply) obj;
        return Float.compare(this.mSpeed, bleLocationReply.mSpeed) == 0 && Float.compare(this.mTotalDistance, bleLocationReply.mTotalDistance) == 0 && this.mAltitude == bleLocationReply.mAltitude;
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

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMSpeed(float f) {
        this.mSpeed = f;
    }

    public final void setMTotalDistance(float f) {
        this.mTotalDistance = f;
    }

    @aa1
    public String toString() {
        return "BleLocationReply(mSpeed=" + this.mSpeed + ", mTotalDistance=" + this.mTotalDistance + ", mAltitude=" + this.mAltitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationReply(float f, float f2, int i) {
        this.mSpeed = f;
        this.mTotalDistance = f2;
        this.mAltitude = i;
    }

    public /* synthetic */ BleLocationReply(float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
    }
}
