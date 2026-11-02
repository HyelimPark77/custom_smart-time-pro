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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 20;
    private int mActivityMode;
    private int mHr;
    private int mSleepParticularCase;
    private int mStep;
    private long mTime;
    private short mX;
    private short mY;
    private short mZ;

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

    public BleGSensorSHSY() {
        long r1 = 0;
        short r3 = 0;
        short r4 = 0;
        short r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r3, r4, r5, r6, r7, r8, r9, 255, null);
    }

    public static /* synthetic */ BleGSensorSHSY copy$default(BleGSensorSHSY r10, long r11, short r13, short r14, short r15, int r16, int r17, int r18, int r19, int r20, Object r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = r10.mTime;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        r13 = r10.mX;
    L8:
        short r3 = r13;
        if ((r20 & 4) == 0) goto L11;
        r14 = r10.mY;
    L11:
        short r4 = r14;
        if ((r20 & 8) == 0) goto L14;
        r15 = r10.mZ;
    L14:
        short r5 = r15;
        if ((r20 & 16) == 0) goto L17;
        int r6 = r10.mActivityMode;
    L19:
        if ((r20 & 32) == 0) goto L21;
        int r7 = r10.mSleepParticularCase;
    L23:
        if ((r20 & 64) == 0) goto L25;
        int r8 = r10.mStep;
    L27:
        if ((r20 & 128) == 0) goto L30;
        int r9 = r10.mHr;
    L32:
        return r10.copy(r1, r3, r4, r5, r6, r7, r8, r9);
    L30:
        r9 = r19;
        goto L32
    L25:
        r8 = r18;
        goto L27
    L21:
        r7 = r17;
        goto L23
    L17:
        r6 = r16;
        goto L19
    }

    public final long component1() {
        return this.mTime;
    }

    public final short component2() {
        return this.mX;
    }

    public final short component3() {
        return this.mY;
    }

    public final short component4() {
        return this.mZ;
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
    public final BleGSensorSHSY copy(long r11, short r13, short r14, short r15, int r16, int r17, int r18, int r19) {
        return new BleGSensorSHSY(r11, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mX = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mY = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mZ = readInt16(r0);
        this.mActivityMode = readInt8();
        this.mSleepParticularCase = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStep = readInt32(r0);
        this.mHr = readInt8();
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleGSensorSHSY) == true) goto L8;
        return false;
    L8:
        BleGSensorSHSY r9 = (BleGSensorSHSY) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mX == r9.mX) goto L15;
        return false;
    L15:
        if (this.mY == r9.mY) goto L18;
        return false;
    L18:
        if (this.mZ == r9.mZ) goto L21;
        return false;
    L21:
        if (this.mActivityMode == r9.mActivityMode) goto L24;
        return false;
    L24:
        if (this.mSleepParticularCase == r9.mSleepParticularCase) goto L27;
        return false;
    L27:
        if (this.mStep == r9.mStep) goto L30;
        return false;
    L30:
        if (this.mHr == r9.mHr) goto L32;
        return false;
    L32:
        return true;
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
        return this.mX;
    }

    public final short getMY() {
        return this.mY;
    }

    public final short getMZ() {
        return this.mZ;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.mTime) * 31) + Short.hashCode(this.mX)) * 31) + Short.hashCode(this.mY)) * 31) + Short.hashCode(this.mZ)) * 31) + Integer.hashCode(this.mActivityMode)) * 31) + Integer.hashCode(this.mSleepParticularCase)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mHr);
    }

    public final void setMActivityMode(int r1) {
        this.mActivityMode = r1;
    }

    public final void setMHr(int r1) {
        this.mHr = r1;
    }

    public final void setMSleepParticularCase(int r1) {
        this.mSleepParticularCase = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMX(short r1) {
        this.mX = r1;
    }

    public final void setMY(short r1) {
        this.mY = r1;
    }

    public final void setMZ(short r1) {
        this.mZ = r1;
    }

    @aa1
    public String toString() {
        return "BleGSensorSHSY(mTime=" + this.mTime + ", mX=" + this.mX + ", mY=" + this.mY + ", mZ=" + this.mZ + ", mActivityMode=" + this.mActivityMode + ", mSleepParticularCase=" + this.mSleepParticularCase + ", mStep=" + this.mStep + ", mHr=" + this.mHr + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorSHSY(long r1, short r3, short r4, short r5, int r6, int r7, int r8, int r9) {
        this.mTime = r1;
        this.mX = r3;
        this.mY = r4;
        this.mZ = r5;
        this.mActivityMode = r6;
        this.mSleepParticularCase = r7;
        this.mStep = r8;
        this.mHr = r9;
    }

    public /* synthetic */ BleGSensorSHSY(long r11, short r13, short r14, short r15, int r16, int r17, int r18, int r19, int r20, DefaultConstructorMarker r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = 0;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        short r3 = 0;
    L10:
        if ((r20 & 4) == 0) goto L12;
        short r4 = 0;
    L14:
        if ((r20 & 8) == 0) goto L16;
        short r5 = 0;
    L18:
        if ((r20 & 16) == 0) goto L20;
        int r6 = 0;
    L22:
        if ((r20 & 32) == 0) goto L24;
        int r7 = 0;
    L26:
        if ((r20 & 64) == 0) goto L28;
        int r8 = 0;
    L30:
        if ((r20 & 128) == 0) goto L33;
        int r9 = 0;
    L34:
        this(r1, r3, r4, r5, r6, r7, r8, r9);
        return;
    L33:
        r9 = r19;
        goto L34
    L28:
        r8 = r18;
        goto L30
    L24:
        r7 = r17;
        goto L26
    L20:
        r6 = r16;
        goto L22
    L16:
        r5 = r15;
        goto L18
    L12:
        r4 = r14;
        goto L14
    L8:
        r3 = r13;
        goto L10
    }
}
