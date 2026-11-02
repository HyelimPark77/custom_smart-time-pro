package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleLocationGga.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,38:1\n222#2,4:39\n*S KotlinDebug\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n*L\n21#1:39,4\n*E\n"})
public final class BleLocationGga extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 64;
    private float altitude;
    private float mHorizontalDilutionPrecision;
    private float mLatitude;
    private float mLongitude;

    @aa1
    private BleLocationUTC mTime;
    private int positioningQuality;
    private int satelliteCount;

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

    public BleLocationGga() {
        BleLocationUTC r1 = null;
        float r2 = 0.0f;
        float r3 = 0.0f;
        int r4 = 0;
        int r5 = 0;
        float r6 = 0.0f;
        float r7 = 0.0f;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleLocationGga copy$default(BleLocationGga r0, BleLocationUTC r1, float r2, float r3, int r4, int r5, float r6, float r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mLatitude;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mLongitude;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.positioningQuality;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.satelliteCount;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mHorizontalDilutionPrecision;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.altitude;
    L23:
        float r10 = r6;
        float r11 = r7;
        int r12 = r4;
        int r13 = r5;
        float r14 = r3;
        BleLocationUTC r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    @aa1
    public final BleLocationUTC component1() {
        return this.mTime;
    }

    public final float component2() {
        return this.mLatitude;
    }

    public final float component3() {
        return this.mLongitude;
    }

    public final int component4() {
        return this.positioningQuality;
    }

    public final int component5() {
        return this.satelliteCount;
    }

    public final float component6() {
        return this.mHorizontalDilutionPrecision;
    }

    public final float component7() {
        return this.altitude;
    }

    @aa1
    public final BleLocationGga copy(@aa1 BleLocationUTC r10, float r11, float r12, int r13, int r14, float r15, float r16) {
        Intrinsics.X0O(r10, "mTime");
        return new BleLocationGga(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable r0 = (BleReadable) BleLocationUTC.class.newInstance();
        r0.setMBytes(readBytes(8));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mTime = (BleLocationUTC) r0;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mLatitude = readFloat(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mLongitude = readFloat(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.positioningQuality = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.satelliteCount = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mHorizontalDilutionPrecision = readFloat(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.altitude = readFloat(r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLocationGga) == true) goto L8;
        return false;
    L8:
        BleLocationGga r6 = (BleLocationGga) r5;
        if (Intrinsics.XOO0ii0(this.mTime, r6.mTime) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.mLatitude, r6.mLatitude) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.mLongitude, r6.mLongitude) == 0) goto L18;
        return false;
    L18:
        if (this.positioningQuality == r6.positioningQuality) goto L21;
        return false;
    L21:
        if (this.satelliteCount == r6.satelliteCount) goto L24;
        return false;
    L24:
        if (Float.compare(this.mHorizontalDilutionPrecision, r6.mHorizontalDilutionPrecision) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.altitude, r6.altitude) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final float getAltitude() {
        return this.altitude;
    }

    public final float getMHorizontalDilutionPrecision() {
        return this.mHorizontalDilutionPrecision;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    @aa1
    public final BleLocationUTC getMTime() {
        return this.mTime;
    }

    public final int getPositioningQuality() {
        return this.positioningQuality;
    }

    public final int getSatelliteCount() {
        return this.satelliteCount;
    }

    public int hashCode() {
        return (((((((((((this.mTime.hashCode() * 31) + Float.hashCode(this.mLatitude)) * 31) + Float.hashCode(this.mLongitude)) * 31) + Integer.hashCode(this.positioningQuality)) * 31) + Integer.hashCode(this.satelliteCount)) * 31) + Float.hashCode(this.mHorizontalDilutionPrecision)) * 31) + Float.hashCode(this.altitude);
    }

    public final void setAltitude(float r1) {
        this.altitude = r1;
    }

    public final void setMHorizontalDilutionPrecision(float r1) {
        this.mHorizontalDilutionPrecision = r1;
    }

    public final void setMLatitude(float r1) {
        this.mLatitude = r1;
    }

    public final void setMLongitude(float r1) {
        this.mLongitude = r1;
    }

    public final void setMTime(@aa1 BleLocationUTC r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTime = r2;
    }

    public final void setPositioningQuality(int r1) {
        this.positioningQuality = r1;
    }

    public final void setSatelliteCount(int r1) {
        this.satelliteCount = r1;
    }

    @aa1
    public String toString() {
        return "BleLocationGga(mTime=" + this.mTime + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", positioningQuality=" + this.positioningQuality + ", satelliteCount=" + this.satelliteCount + ", mHorizontalDilutionPrecision=" + this.mHorizontalDilutionPrecision + ", altitude=" + this.altitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationGga(@aa1 BleLocationUTC r2, float r3, float r4, int r5, int r6, float r7, float r8) {
        Intrinsics.X0O(r2, "mTime");
        this.mTime = r2;
        this.mLatitude = r3;
        this.mLongitude = r4;
        this.positioningQuality = r5;
        this.satelliteCount = r6;
        this.mHorizontalDilutionPrecision = r7;
        this.altitude = r8;
    }

    public /* synthetic */ BleLocationGga(BleLocationUTC r9, float r10, float r11, int r12, int r13, float r14, float r15, int r16, DefaultConstructorMarker r17) {
        if ((r16 & 1) == 0) goto L6;
        r9 = new BleLocationUTC(0, 0, 0, 0, 15, null);
    L6:
        if ((r16 & 2) == 0) goto L9;
        r10 = 0.0f;
    L9:
        if ((r16 & 4) == 0) goto L12;
        r11 = 0.0f;
    L12:
        if ((r16 & 8) == 0) goto L15;
        r12 = 0;
    L15:
        if ((r16 & 16) == 0) goto L18;
        r13 = 0;
    L18:
        if ((r16 & 32) == 0) goto L21;
        r14 = 0.0f;
    L21:
        if ((r16 & 64) == 0) goto L24;
        float r18 = 0.0f;
    L23:
        float r19 = r14;
        int r110 = r13;
        int r111 = r12;
        float r112 = r11;
        this(r9, r10, r112, r111, r110, r19, r18);
        return;
    L24:
        r18 = r15;
        goto L23
    }
}
