package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVibrationLightSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mLight;
    private int mLightDuration;
    private int mLightFreq;
    private int mLightType;
    private int mVibration;
    private int mVibrationDurationAndCount;
    private int mVibrationLongAndShort;

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

    public BleVibrationLightSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleVibrationLightSettings copy$default(BleVibrationLightSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mVibration;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mVibrationLongAndShort;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mVibrationDurationAndCount;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mLight;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mLightType;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mLightFreq;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mLightDuration;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mVibration;
    }

    public final int component2() {
        return this.mVibrationLongAndShort;
    }

    public final int component3() {
        return this.mVibrationDurationAndCount;
    }

    public final int component4() {
        return this.mLight;
    }

    public final int component5() {
        return this.mLightType;
    }

    public final int component6() {
        return this.mLightFreq;
    }

    public final int component7() {
        return this.mLightDuration;
    }

    @aa1
    public final BleVibrationLightSettings copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleVibrationLightSettings(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mVibration);
        writeInt8(this.mVibrationLongAndShort);
        int r0 = this.mVibrationDurationAndCount;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        writeInt8(this.mLight);
        writeInt8(this.mLightType);
        writeInt8(this.mLightFreq);
        int r2 = this.mLightDuration;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        BleWritable.writeBytes$default(this, new byte[3], null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleVibrationLightSettings) == true) goto L8;
        return false;
    L8:
        BleVibrationLightSettings r6 = (BleVibrationLightSettings) r5;
        if (this.mVibration == r6.mVibration) goto L12;
        return false;
    L12:
        if (this.mVibrationLongAndShort == r6.mVibrationLongAndShort) goto L15;
        return false;
    L15:
        if (this.mVibrationDurationAndCount == r6.mVibrationDurationAndCount) goto L18;
        return false;
    L18:
        if (this.mLight == r6.mLight) goto L21;
        return false;
    L21:
        if (this.mLightType == r6.mLightType) goto L24;
        return false;
    L24:
        if (this.mLightFreq == r6.mLightFreq) goto L27;
        return false;
    L27:
        if (this.mLightDuration == r6.mLightDuration) goto L29;
        return false;
    L29:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMLight() {
        return this.mLight;
    }

    public final int getMLightDuration() {
        return this.mLightDuration;
    }

    public final int getMLightFreq() {
        return this.mLightFreq;
    }

    public final int getMLightType() {
        return this.mLightType;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public final int getMVibrationDurationAndCount() {
        return this.mVibrationDurationAndCount;
    }

    public final int getMVibrationLongAndShort() {
        return this.mVibrationLongAndShort;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mVibration) * 31) + Integer.hashCode(this.mVibrationLongAndShort)) * 31) + Integer.hashCode(this.mVibrationDurationAndCount)) * 31) + Integer.hashCode(this.mLight)) * 31) + Integer.hashCode(this.mLightType)) * 31) + Integer.hashCode(this.mLightFreq)) * 31) + Integer.hashCode(this.mLightDuration);
    }

    public final void setMLight(int r1) {
        this.mLight = r1;
    }

    public final void setMLightDuration(int r1) {
        this.mLightDuration = r1;
    }

    public final void setMLightFreq(int r1) {
        this.mLightFreq = r1;
    }

    public final void setMLightType(int r1) {
        this.mLightType = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    public final void setMVibrationDurationAndCount(int r1) {
        this.mVibrationDurationAndCount = r1;
    }

    public final void setMVibrationLongAndShort(int r1) {
        this.mVibrationLongAndShort = r1;
    }

    @aa1
    public String toString() {
        return "BleVibrationLightSettings(mVibration=" + this.mVibration + ", mVibrationLongAndShort=" + this.mVibrationLongAndShort + ", mVibrationDurationAndCount=" + this.mVibrationDurationAndCount + ", mLight=" + this.mLight + ", mLightType=" + this.mLightType + ", mLightFreq=" + this.mLightFreq + ", mLightDuration=" + this.mLightDuration + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVibrationLightSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mVibration = r1;
        this.mVibrationLongAndShort = r2;
        this.mVibrationDurationAndCount = r3;
        this.mLight = r4;
        this.mLightType = r5;
        this.mLightFreq = r6;
        this.mLightDuration = r7;
    }

    public /* synthetic */ BleVibrationLightSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
