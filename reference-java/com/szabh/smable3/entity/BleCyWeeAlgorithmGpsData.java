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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 50;
    private int mAltitude;
    private float mCourse;
    private float mHorizontalAccuracy;
    private float mLatitude;
    private float mLongitude;
    private float mSpeed;
    private float mVerticalAccuracy;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCyWeeAlgorithmGpsData() {
        this(0.0f, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
    }

    public static /* synthetic */ BleCyWeeAlgorithmGpsData copy$default(BleCyWeeAlgorithmGpsData bleCyWeeAlgorithmGpsData, float f, float f2, int i, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = bleCyWeeAlgorithmGpsData.mLongitude;
        }
        if ((i2 & 2) != 0) {
            f2 = bleCyWeeAlgorithmGpsData.mLatitude;
        }
        if ((i2 & 4) != 0) {
            i = bleCyWeeAlgorithmGpsData.mAltitude;
        }
        if ((i2 & 8) != 0) {
            f3 = bleCyWeeAlgorithmGpsData.mCourse;
        }
        if ((i2 & 16) != 0) {
            f4 = bleCyWeeAlgorithmGpsData.mSpeed;
        }
        if ((i2 & 32) != 0) {
            f5 = bleCyWeeAlgorithmGpsData.mHorizontalAccuracy;
        }
        if ((i2 & 64) != 0) {
            f6 = bleCyWeeAlgorithmGpsData.mVerticalAccuracy;
        }
        float f7 = f5;
        float f8 = f6;
        float f9 = f4;
        int i3 = i;
        return bleCyWeeAlgorithmGpsData.copy(f, f2, i3, f3, f9, f7, f8);
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
    public final BleCyWeeAlgorithmGpsData copy(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        return new BleCyWeeAlgorithmGpsData(f, f2, i, f3, f4, f5, f6);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLongitude = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLatitude = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAltitude = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourse = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSpeed = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mHorizontalAccuracy = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVerticalAccuracy = readFloat(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        float f = this.mLongitude;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        float f2 = this.mLatitude;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN);
        int i = this.mAltitude;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        float f3 = this.mCourse;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f3, LITTLE_ENDIAN);
        float f4 = this.mSpeed;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f4, LITTLE_ENDIAN);
        float f5 = this.mHorizontalAccuracy;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f5, LITTLE_ENDIAN);
        float f6 = this.mVerticalAccuracy;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f6, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCyWeeAlgorithmGpsData)) {
            return false;
        }
        BleCyWeeAlgorithmGpsData bleCyWeeAlgorithmGpsData = (BleCyWeeAlgorithmGpsData) obj;
        return Float.compare(this.mLongitude, bleCyWeeAlgorithmGpsData.mLongitude) == 0 && Float.compare(this.mLatitude, bleCyWeeAlgorithmGpsData.mLatitude) == 0 && this.mAltitude == bleCyWeeAlgorithmGpsData.mAltitude && Float.compare(this.mCourse, bleCyWeeAlgorithmGpsData.mCourse) == 0 && Float.compare(this.mSpeed, bleCyWeeAlgorithmGpsData.mSpeed) == 0 && Float.compare(this.mHorizontalAccuracy, bleCyWeeAlgorithmGpsData.mHorizontalAccuracy) == 0 && Float.compare(this.mVerticalAccuracy, bleCyWeeAlgorithmGpsData.mVerticalAccuracy) == 0;
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

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMCourse(float f) {
        this.mCourse = f;
    }

    public final void setMHorizontalAccuracy(float f) {
        this.mHorizontalAccuracy = f;
    }

    public final void setMLatitude(float f) {
        this.mLatitude = f;
    }

    public final void setMLongitude(float f) {
        this.mLongitude = f;
    }

    public final void setMSpeed(float f) {
        this.mSpeed = f;
    }

    public final void setMVerticalAccuracy(float f) {
        this.mVerticalAccuracy = f;
    }

    @aa1
    public String toString() {
        return "BleCyWeeAlgorithmGpsData(mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mAltitude=" + this.mAltitude + ", mCourse=" + this.mCourse + ", mSpeed=" + this.mSpeed + ", mHorizontalAccuracy=" + this.mHorizontalAccuracy + ", mVerticalAccuracy=" + this.mVerticalAccuracy + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCyWeeAlgorithmGpsData(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        this.mLongitude = f;
        this.mLatitude = f2;
        this.mAltitude = i;
        this.mCourse = f3;
        this.mSpeed = f4;
        this.mHorizontalAccuracy = f5;
        this.mVerticalAccuracy = f6;
    }

    public /* synthetic */ BleCyWeeAlgorithmGpsData(float f, float f2, int i, float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) != 0 ? 0.0f : f4, (i2 & 32) != 0 ? 0.0f : f5, (i2 & 64) != 0 ? 0.0f : f6);
    }
}
