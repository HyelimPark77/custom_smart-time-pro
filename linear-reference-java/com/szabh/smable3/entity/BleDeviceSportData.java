package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceSportData extends BleReadable implements Serializable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 64;
    private int mAltitude;
    private int mBpm;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMode;
    private int mPace;
    private int mRiseAltitude;
    private int mSpeed;
    private int mSpm;
    private int mStep;

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

    public BleDeviceSportData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ BleDeviceSportData copy$default(BleDeviceSportData r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mDuration;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mBpm;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mSpm;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mStep;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mDistance;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mCalorie;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mSpeed;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mPace;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mAltitude;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mRiseAltitude;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mMode;
    L35:
        int r14 = r10;
        int r15 = r11;
        int r16 = r8;
        int r17 = r9;
        int r18 = r6;
        int r19 = r7;
        int r20 = r4;
        int r21 = r5;
        int r22 = r3;
        int r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mDuration;
    }

    public final int component10() {
        return this.mRiseAltitude;
    }

    public final int component11() {
        return this.mMode;
    }

    public final int component2() {
        return this.mBpm;
    }

    public final int component3() {
        return this.mSpm;
    }

    public final int component4() {
        return this.mStep;
    }

    public final int component5() {
        return this.mDistance;
    }

    public final int component6() {
        return this.mCalorie;
    }

    public final int component7() {
        return this.mSpeed;
    }

    public final int component8() {
        return this.mPace;
    }

    public final int component9() {
        return this.mAltitude;
    }

    @aa1
    public final BleDeviceSportData copy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        return new BleDeviceSportData(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDuration = readUInt16(r0);
        this.mBpm = readUInt8();
        this.mSpm = readUInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStep = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDistance = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCalorie = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSpeed = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPace = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAltitude = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRiseAltitude = readInt16(r0);
        this.mMode = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceSportData) == true) goto L8;
        return false;
    L8:
        BleDeviceSportData r6 = (BleDeviceSportData) r5;
        if (this.mDuration == r6.mDuration) goto L12;
        return false;
    L12:
        if (this.mBpm == r6.mBpm) goto L15;
        return false;
    L15:
        if (this.mSpm == r6.mSpm) goto L18;
        return false;
    L18:
        if (this.mStep == r6.mStep) goto L21;
        return false;
    L21:
        if (this.mDistance == r6.mDistance) goto L24;
        return false;
    L24:
        if (this.mCalorie == r6.mCalorie) goto L27;
        return false;
    L27:
        if (this.mSpeed == r6.mSpeed) goto L30;
        return false;
    L30:
        if (this.mPace == r6.mPace) goto L33;
        return false;
    L33:
        if (this.mAltitude == r6.mAltitude) goto L36;
        return false;
    L36:
        if (this.mRiseAltitude == r6.mRiseAltitude) goto L39;
        return false;
    L39:
        if (this.mMode == r6.mMode) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMBpm() {
        return this.mBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMRiseAltitude() {
        return this.mRiseAltitude;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mDuration) * 31) + Integer.hashCode(this.mBpm)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mRiseAltitude)) * 31) + Integer.hashCode(this.mMode);
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMBpm(int r1) {
        this.mBpm = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMRiseAltitude(int r1) {
        this.mRiseAltitude = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    @aa1
    public String toString() {
        return "BleDeviceSportData(mDuration=" + this.mDuration + ", mBpm=" + this.mBpm + ", mSpm=" + this.mSpm + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAltitude=" + this.mAltitude + ", mRiseAltitude=" + this.mRiseAltitude + ", mMode=" + this.mMode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceSportData(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        this.mDuration = r1;
        this.mBpm = r2;
        this.mSpm = r3;
        this.mStep = r4;
        this.mDistance = r5;
        this.mCalorie = r6;
        this.mSpeed = r7;
        this.mPace = r8;
        this.mAltitude = r9;
        this.mRiseAltitude = r10;
        this.mMode = r11;
    }

    public /* synthetic */ BleDeviceSportData(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        int r15 = 0;
    L35:
        int r16 = r11;
        int r17 = r10;
        int r18 = r9;
        int r19 = r8;
        int r20 = r7;
        int r21 = r6;
        int r22 = r5;
        int r23 = r4;
        this(r2, r3, r23, r22, r21, r20, r19, r18, r17, r16, r15);
        return;
    L36:
        r15 = r12;
        goto L35
    }
}
