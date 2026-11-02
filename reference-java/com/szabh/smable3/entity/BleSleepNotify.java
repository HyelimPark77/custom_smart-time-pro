package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSleepNotify extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 5;
    private int mBedtimeMusicControl;
    private int mNotify;
    private int mSleepReadiness;
    private int mState;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSleepNotify() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleSleepNotify copy$default(BleSleepNotify bleSleepNotify, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleSleepNotify.mState;
        }
        if ((i5 & 2) != 0) {
            i2 = bleSleepNotify.mNotify;
        }
        if ((i5 & 4) != 0) {
            i3 = bleSleepNotify.mSleepReadiness;
        }
        if ((i5 & 8) != 0) {
            i4 = bleSleepNotify.mBedtimeMusicControl;
        }
        return bleSleepNotify.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mNotify;
    }

    public final int component3() {
        return this.mSleepReadiness;
    }

    public final int component4() {
        return this.mBedtimeMusicControl;
    }

    @aa1
    public final BleSleepNotify copy(int i, int i2, int i3, int i4) {
        return new BleSleepNotify(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
        this.mNotify = readInt8();
        this.mSleepReadiness = readInt8();
        this.mBedtimeMusicControl = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeInt8(this.mNotify);
        writeInt8(this.mSleepReadiness);
        writeInt8(this.mBedtimeMusicControl);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSleepNotify)) {
            return false;
        }
        BleSleepNotify bleSleepNotify = (BleSleepNotify) obj;
        return this.mState == bleSleepNotify.mState && this.mNotify == bleSleepNotify.mNotify && this.mSleepReadiness == bleSleepNotify.mSleepReadiness && this.mBedtimeMusicControl == bleSleepNotify.mBedtimeMusicControl;
    }

    public final int getMBedtimeMusicControl() {
        return this.mBedtimeMusicControl;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 5;
    }

    public final int getMNotify() {
        return this.mNotify;
    }

    public final int getMSleepReadiness() {
        return this.mSleepReadiness;
    }

    public final int getMState() {
        return this.mState;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.mNotify)) * 31) + Integer.hashCode(this.mSleepReadiness)) * 31) + Integer.hashCode(this.mBedtimeMusicControl);
    }

    public final void setMBedtimeMusicControl(int i) {
        this.mBedtimeMusicControl = i;
    }

    public final void setMNotify(int i) {
        this.mNotify = i;
    }

    public final void setMSleepReadiness(int i) {
        this.mSleepReadiness = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    @aa1
    public String toString() {
        return "BleSleepNotify(mState=" + this.mState + ", mNotify=" + this.mNotify + ", mSleepReadiness=" + this.mSleepReadiness + ", mBedtimeMusicControl=" + this.mBedtimeMusicControl + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSleepNotify(int i, int i2, int i3, int i4) {
        this.mState = i;
        this.mNotify = i2;
        this.mSleepReadiness = i3;
        this.mBedtimeMusicControl = i4;
    }

    public /* synthetic */ BleSleepNotify(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
