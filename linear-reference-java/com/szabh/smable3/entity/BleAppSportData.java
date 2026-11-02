package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAppSportData extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 32;
    private int mAirPressure;
    private int mAltitude;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMode;
    private int mPace;
    private float mSpeed;
    private int mSpm;
    private int mStep;
    private int mUndefined;

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

    public BleAppSportData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        float r9 = 0.0f;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ BleAppSportData copy$default(BleAppSportData r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mStep;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mDistance;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mCalorie;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mDuration;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mSpm;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mAltitude;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mAirPressure;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mPace;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mSpeed;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mMode;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mUndefined;
    L35:
        int r14 = r10;
        int r15 = r11;
        int r16 = r8;
        float r17 = r9;
        int r18 = r6;
        int r19 = r7;
        int r20 = r4;
        int r21 = r5;
        int r22 = r3;
        int r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mStep;
    }

    public final int component10() {
        return this.mMode;
    }

    public final int component11() {
        return this.mUndefined;
    }

    public final int component2() {
        return this.mDistance;
    }

    public final int component3() {
        return this.mCalorie;
    }

    public final int component4() {
        return this.mDuration;
    }

    public final int component5() {
        return this.mSpm;
    }

    public final int component6() {
        return this.mAltitude;
    }

    public final int component7() {
        return this.mAirPressure;
    }

    public final int component8() {
        return this.mPace;
    }

    public final float component9() {
        return this.mSpeed;
    }

    @aa1
    public final BleAppSportData copy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, float r21, int r22, int r23) {
        return new BleAppSportData(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mStep;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        int r2 = this.mDistance;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r2, r1);
        int r3 = this.mCalorie;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r3, r1);
        int r4 = this.mDuration;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r4, r1);
        int r5 = this.mSpm;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r5, r1);
        int r6 = this.mAltitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r6, r1);
        int r7 = this.mAirPressure;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r7, r1);
        int r8 = this.mPace;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r8, r1);
        float r9 = this.mSpeed;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r9, r1);
        writeInt8(this.mMode);
        int r10 = this.mUndefined;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt24(r10, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppSportData) == true) goto L8;
        return false;
    L8:
        BleAppSportData r6 = (BleAppSportData) r5;
        if (this.mStep == r6.mStep) goto L12;
        return false;
    L12:
        if (this.mDistance == r6.mDistance) goto L15;
        return false;
    L15:
        if (this.mCalorie == r6.mCalorie) goto L18;
        return false;
    L18:
        if (this.mDuration == r6.mDuration) goto L21;
        return false;
    L21:
        if (this.mSpm == r6.mSpm) goto L24;
        return false;
    L24:
        if (this.mAltitude == r6.mAltitude) goto L27;
        return false;
    L27:
        if (this.mAirPressure == r6.mAirPressure) goto L30;
        return false;
    L30:
        if (this.mPace == r6.mPace) goto L33;
        return false;
    L33:
        if (Float.compare(this.mSpeed, r6.mSpeed) == 0) goto L36;
        return false;
    L36:
        if (this.mMode == r6.mMode) goto L39;
        return false;
    L39:
        if (this.mUndefined == r6.mUndefined) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
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

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 32;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final float getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMUndefined() {
        return this.mUndefined;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mStep) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mPace)) * 31) + Float.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mUndefined);
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
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

    public final void setMSpeed(float r1) {
        this.mSpeed = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMUndefined(int r1) {
        this.mUndefined = r1;
    }

    @aa1
    public String toString() {
        return "BleAppSportData(mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mDuration=" + this.mDuration + ", mSpm=" + this.mSpm + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mPace=" + this.mPace + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mUndefined=" + this.mUndefined + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppSportData(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, int r10, int r11) {
        this.mStep = r1;
        this.mDistance = r2;
        this.mCalorie = r3;
        this.mDuration = r4;
        this.mSpm = r5;
        this.mAltitude = r6;
        this.mAirPressure = r7;
        this.mPace = r8;
        this.mSpeed = r9;
        this.mMode = r10;
        this.mUndefined = r11;
    }

    public /* synthetic */ BleAppSportData(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, float r10, int r11, int r12, int r13, DefaultConstructorMarker r14) {
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
        r10 = 0.0f;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        int r15 = 0;
    L35:
        int r16 = r11;
        float r17 = r10;
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
