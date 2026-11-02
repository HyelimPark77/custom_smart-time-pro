package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGSensorSHSY extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 20;
    private int mActivityMode;
    private int mHr;
    private int mSleepParticularCase;
    private int mStep;
    private long mTime;

    /* JADX INFO: renamed from: mX */
    private short f55329mX;

    /* JADX INFO: renamed from: mY */
    private short f55330mY;

    /* JADX INFO: renamed from: mZ */
    private short f55331mZ;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGSensorSHSY() {
        this(0L, (short) 0, (short) 0, (short) 0, 0, 0, 0, 0, 255, null);
    }

    public static /* synthetic */ BleGSensorSHSY copy$default(BleGSensorSHSY bleGSensorSHSY, long j, short s, short s2, short s3, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = bleGSensorSHSY.mTime;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            s = bleGSensorSHSY.f55329mX;
        }
        short s4 = s;
        if ((i5 & 4) != 0) {
            s2 = bleGSensorSHSY.f55330mY;
        }
        short s5 = s2;
        if ((i5 & 8) != 0) {
            s3 = bleGSensorSHSY.f55331mZ;
        }
        return bleGSensorSHSY.copy(j2, s4, s5, s3, (i5 & 16) != 0 ? bleGSensorSHSY.mActivityMode : i, (i5 & 32) != 0 ? bleGSensorSHSY.mSleepParticularCase : i2, (i5 & 64) != 0 ? bleGSensorSHSY.mStep : i3, (i5 & 128) != 0 ? bleGSensorSHSY.mHr : i4);
    }

    public final long component1() {
        return this.mTime;
    }

    public final short component2() {
        return this.f55329mX;
    }

    public final short component3() {
        return this.f55330mY;
    }

    public final short component4() {
        return this.f55331mZ;
    }

    public final int component5() {
        return this.mActivityMode;
    }

    public final int component6() {
        return this.mSleepParticularCase;
    }

    public final int component7() {
        return this.mStep;
    }

    public final int component8() {
        return this.mHr;
    }

    @aa1
    public final BleGSensorSHSY copy(long j, short s, short s2, short s3, int i, int i2, int i3, int i4) {
        return new BleGSensorSHSY(j, s, s2, s3, i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55329mX = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55330mY = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55331mZ = readInt16(LITTLE_ENDIAN);
        this.mActivityMode = readInt8();
        this.mSleepParticularCase = readInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStep = readInt32(LITTLE_ENDIAN);
        this.mHr = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGSensorSHSY)) {
            return false;
        }
        BleGSensorSHSY bleGSensorSHSY = (BleGSensorSHSY) obj;
        return this.mTime == bleGSensorSHSY.mTime && this.f55329mX == bleGSensorSHSY.f55329mX && this.f55330mY == bleGSensorSHSY.f55330mY && this.f55331mZ == bleGSensorSHSY.f55331mZ && this.mActivityMode == bleGSensorSHSY.mActivityMode && this.mSleepParticularCase == bleGSensorSHSY.mSleepParticularCase && this.mStep == bleGSensorSHSY.mStep && this.mHr == bleGSensorSHSY.mHr;
    }

    public final int getMActivityMode() {
        return this.mActivityMode;
    }

    public final int getMHr() {
        return this.mHr;
    }

    public final int getMSleepParticularCase() {
        return this.mSleepParticularCase;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final short getMX() {
        return this.f55329mX;
    }

    public final short getMY() {
        return this.f55330mY;
    }

    public final short getMZ() {
        return this.f55331mZ;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.mTime) * 31) + Short.hashCode(this.f55329mX)) * 31) + Short.hashCode(this.f55330mY)) * 31) + Short.hashCode(this.f55331mZ)) * 31) + Integer.hashCode(this.mActivityMode)) * 31) + Integer.hashCode(this.mSleepParticularCase)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mHr);
    }

    public final void setMActivityMode(int i) {
        this.mActivityMode = i;
    }

    public final void setMHr(int i) {
        this.mHr = i;
    }

    public final void setMSleepParticularCase(int i) {
        this.mSleepParticularCase = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMX(short s) {
        this.f55329mX = s;
    }

    public final void setMY(short s) {
        this.f55330mY = s;
    }

    public final void setMZ(short s) {
        this.f55331mZ = s;
    }

    @aa1
    public String toString() {
        return "BleGSensorSHSY(mTime=" + this.mTime + ", mX=" + ((int) this.f55329mX) + ", mY=" + ((int) this.f55330mY) + ", mZ=" + ((int) this.f55331mZ) + ", mActivityMode=" + this.mActivityMode + ", mSleepParticularCase=" + this.mSleepParticularCase + ", mStep=" + this.mStep + ", mHr=" + this.mHr + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorSHSY(long j, short s, short s2, short s3, int i, int i2, int i3, int i4) {
        this.mTime = j;
        this.f55329mX = s;
        this.f55330mY = s2;
        this.f55331mZ = s3;
        this.mActivityMode = i;
        this.mSleepParticularCase = i2;
        this.mStep = i3;
        this.mHr = i4;
    }

    public /* synthetic */ BleGSensorSHSY(long j, short s, short s2, short s3, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? (short) 0 : s, (i5 & 4) != 0 ? (short) 0 : s2, (i5 & 8) != 0 ? (short) 0 : s3, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4);
    }
}
