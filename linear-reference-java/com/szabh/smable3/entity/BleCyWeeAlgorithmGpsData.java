package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCyWeeAlgorithmGpsData extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 50;
    private int mAltitude;
    private float mCourse;
    private float mHorizontalAccuracy;
    private float mLatitude;
    private float mLongitude;
    private float mSpeed;
    private float mVerticalAccuracy;

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

    public BleCyWeeAlgorithmGpsData() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        int r3 = 0;
        float r4 = 0.0f;
        float r5 = 0.0f;
        float r6 = 0.0f;
        float r7 = 0.0f;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleCyWeeAlgorithmGpsData copy$default(BleCyWeeAlgorithmGpsData r0, float r1, float r2, int r3, float r4, float r5, float r6, float r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mLongitude;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mLatitude;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mAltitude;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mCourse;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mSpeed;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mHorizontalAccuracy;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mVerticalAccuracy;
    L23:
        float r10 = r6;
        float r11 = r7;
        float r12 = r4;
        float r13 = r5;
        int r14 = r3;
        float r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final float component1() {
        return this.mLongitude;
    }

    public final float component2() {
        return this.mLatitude;
    }

    public final int component3() {
        return this.mAltitude;
    }

    public final float component4() {
        return this.mCourse;
    }

    public final float component5() {
        return this.mSpeed;
    }

    public final float component6() {
        return this.mHorizontalAccuracy;
    }

    public final float component7() {
        return this.mVerticalAccuracy;
    }

    @aa1
    public final BleCyWeeAlgorithmGpsData copy(float r9, float r10, int r11, float r12, float r13, float r14, float r15) {
        return new BleCyWeeAlgorithmGpsData(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLongitude = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLatitude = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAltitude = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourse = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSpeed = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mHorizontalAccuracy = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mVerticalAccuracy = readFloat(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        float r0 = this.mLongitude;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r0, r1);
        float r2 = this.mLatitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r2, r1);
        int r3 = this.mAltitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
        float r4 = this.mCourse;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r4, r1);
        float r5 = this.mSpeed;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r5, r1);
        float r6 = this.mHorizontalAccuracy;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r6, r1);
        float r7 = this.mVerticalAccuracy;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r7, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCyWeeAlgorithmGpsData) == true) goto L8;
        return false;
    L8:
        BleCyWeeAlgorithmGpsData r6 = (BleCyWeeAlgorithmGpsData) r5;
        if (Float.compare(this.mLongitude, r6.mLongitude) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.mLatitude, r6.mLatitude) == 0) goto L15;
        return false;
    L15:
        if (this.mAltitude == r6.mAltitude) goto L18;
        return false;
    L18:
        if (Float.compare(this.mCourse, r6.mCourse) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.mSpeed, r6.mSpeed) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.mHorizontalAccuracy, r6.mHorizontalAccuracy) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.mVerticalAccuracy, r6.mVerticalAccuracy) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final float getMCourse() {
        return this.mCourse;
    }

    public final float getMHorizontalAccuracy() {
        return this.mHorizontalAccuracy;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 50;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    public final float getMSpeed() {
        return this.mSpeed;
    }

    public final float getMVerticalAccuracy() {
        return this.mVerticalAccuracy;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.mLongitude) * 31) + Float.hashCode(this.mLatitude)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Float.hashCode(this.mCourse)) * 31) + Float.hashCode(this.mSpeed)) * 31) + Float.hashCode(this.mHorizontalAccuracy)) * 31) + Float.hashCode(this.mVerticalAccuracy);
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMCourse(float r1) {
        this.mCourse = r1;
    }

    public final void setMHorizontalAccuracy(float r1) {
        this.mHorizontalAccuracy = r1;
    }

    public final void setMLatitude(float r1) {
        this.mLatitude = r1;
    }

    public final void setMLongitude(float r1) {
        this.mLongitude = r1;
    }

    public final void setMSpeed(float r1) {
        this.mSpeed = r1;
    }

    public final void setMVerticalAccuracy(float r1) {
        this.mVerticalAccuracy = r1;
    }

    @aa1
    public String toString() {
        return "BleCyWeeAlgorithmGpsData(mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mAltitude=" + this.mAltitude + ", mCourse=" + this.mCourse + ", mSpeed=" + this.mSpeed + ", mHorizontalAccuracy=" + this.mHorizontalAccuracy + ", mVerticalAccuracy=" + this.mVerticalAccuracy + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCyWeeAlgorithmGpsData(float r1, float r2, int r3, float r4, float r5, float r6, float r7) {
        this.mLongitude = r1;
        this.mLatitude = r2;
        this.mAltitude = r3;
        this.mCourse = r4;
        this.mSpeed = r5;
        this.mHorizontalAccuracy = r6;
        this.mVerticalAccuracy = r7;
    }

    public /* synthetic */ BleCyWeeAlgorithmGpsData(float r2, float r3, int r4, float r5, float r6, float r7, float r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0.0f;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0.0f;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0.0f;
    L21:
        if ((r9 & 64) == 0) goto L24;
        float r11 = 0.0f;
    L23:
        float r12 = r7;
        float r13 = r6;
        float r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
