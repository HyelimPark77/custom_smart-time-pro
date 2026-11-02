package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSleepNotify extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;
    private int mBedtimeMusicControl;
    private int mNotify;
    private int mSleepReadiness;
    private int mState;

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

    public BleSleepNotify() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleSleepNotify copy$default(BleSleepNotify r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mNotify;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mSleepReadiness;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mBedtimeMusicControl;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleSleepNotify copy(int r2, int r3, int r4, int r5) {
        return new BleSleepNotify(r2, r3, r4, r5);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSleepNotify) == true) goto L8;
        return false;
    L8:
        BleSleepNotify r6 = (BleSleepNotify) r5;
        if (this.mState == r6.mState) goto L12;
        return false;
    L12:
        if (this.mNotify == r6.mNotify) goto L15;
        return false;
    L15:
        if (this.mSleepReadiness == r6.mSleepReadiness) goto L18;
        return false;
    L18:
        if (this.mBedtimeMusicControl == r6.mBedtimeMusicControl) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMBedtimeMusicControl(int r1) {
        this.mBedtimeMusicControl = r1;
    }

    public final void setMNotify(int r1) {
        this.mNotify = r1;
    }

    public final void setMSleepReadiness(int r1) {
        this.mSleepReadiness = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    @aa1
    public String toString() {
        return "BleSleepNotify(mState=" + this.mState + ", mNotify=" + this.mNotify + ", mSleepReadiness=" + this.mSleepReadiness + ", mBedtimeMusicControl=" + this.mBedtimeMusicControl + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSleepNotify(int r1, int r2, int r3, int r4) {
        this.mState = r1;
        this.mNotify = r2;
        this.mSleepReadiness = r3;
        this.mBedtimeMusicControl = r4;
    }

    public /* synthetic */ BleSleepNotify(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
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
