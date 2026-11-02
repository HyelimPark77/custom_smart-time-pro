package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLocation extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mActivityMode;
    private int mAltitude;
    private float mLatitude;
    private float mLongitude;
    private int mTime;

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

    public BleLocation() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        float r4 = 0.0f;
        float r5 = 0.0f;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleLocation copy$default(BleLocation r0, int r1, int r2, int r3, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mActivityMode;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mAltitude;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mLongitude;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mLatitude;
    L17:
        float r8 = r4;
        float r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mActivityMode;
    }

    public final int component3() {
        return this.mAltitude;
    }

    public final float component4() {
        return this.mLongitude;
    }

    public final float component5() {
        return this.mLatitude;
    }

    @aa1
    public final BleLocation copy(int r7, int r8, int r9, float r10, float r11) {
        return new BleLocation(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mActivityMode = readUInt8();
        skip(8);
        this.mAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mLongitude = BleReadable.readFloat$default(this, null, 1, null);
        this.mLatitude = BleReadable.readFloat$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLocation) == true) goto L8;
        return false;
    L8:
        BleLocation r6 = (BleLocation) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mActivityMode == r6.mActivityMode) goto L15;
        return false;
    L15:
        if (this.mAltitude == r6.mAltitude) goto L18;
        return false;
    L18:
        if (Float.compare(this.mLongitude, r6.mLongitude) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.mLatitude, r6.mLatitude) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMActivityMode() {
        return this.mActivityMode;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mActivityMode)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Float.hashCode(this.mLongitude)) * 31) + Float.hashCode(this.mLatitude);
    }

    public final void setMActivityMode(int r1) {
        this.mActivityMode = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMLatitude(float r1) {
        this.mLatitude = r1;
    }

    public final void setMLongitude(float r1) {
        this.mLongitude = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleLocation(mTime=" + this.mTime + ", mActivityMode=" + this.mActivityMode + ", mAltitude=" + this.mAltitude + ", mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocation(int r1, int r2, int r3, float r4, float r5) {
        this.mTime = r1;
        this.mActivityMode = r2;
        this.mAltitude = r3;
        this.mLongitude = r4;
        this.mLatitude = r5;
    }

    public /* synthetic */ BleLocation(int r2, int r3, int r4, float r5, float r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0.0f;
    L15:
        if ((r7 & 16) == 0) goto L18;
        float r9 = 0.0f;
    L17:
        float r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
