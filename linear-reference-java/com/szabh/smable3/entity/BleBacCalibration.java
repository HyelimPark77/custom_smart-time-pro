package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBacCalibration extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private int value5;
    private int value6;
    private int value7;
    private int value8;

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

    public BleBacCalibration() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleBacCalibration copy$default(BleBacCalibration r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.value1;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.value2;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.value3;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.value4;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.value5;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.value6;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.value7;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.value8;
    L26:
        int r11 = r7;
        int r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.value1;
    }

    public final int component2() {
        return this.value2;
    }

    public final int component3() {
        return this.value3;
    }

    public final int component4() {
        return this.value4;
    }

    public final int component5() {
        return this.value5;
    }

    public final int component6() {
        return this.value6;
    }

    public final int component7() {
        return this.value7;
    }

    public final int component8() {
        return this.value8;
    }

    @aa1
    public final BleBacCalibration copy(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        return new BleBacCalibration(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.value1 = readInt8();
        this.value2 = readInt8();
        this.value3 = BleReadable.readInt16$default(this, null, 1, null);
        this.value4 = readInt8();
        this.value5 = BleReadable.readInt16$default(this, null, 1, null);
        this.value6 = BleReadable.readInt16$default(this, null, 1, null);
        this.value7 = BleReadable.readInt16$default(this, null, 1, null);
        this.value8 = BleReadable.readInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.value1);
        writeInt8(this.value2);
        writeInt8(this.value3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBacCalibration) == true) goto L8;
        return false;
    L8:
        BleBacCalibration r6 = (BleBacCalibration) r5;
        if (this.value1 == r6.value1) goto L12;
        return false;
    L12:
        if (this.value2 == r6.value2) goto L15;
        return false;
    L15:
        if (this.value3 == r6.value3) goto L18;
        return false;
    L18:
        if (this.value4 == r6.value4) goto L21;
        return false;
    L21:
        if (this.value5 == r6.value5) goto L24;
        return false;
    L24:
        if (this.value6 == r6.value6) goto L27;
        return false;
    L27:
        if (this.value7 == r6.value7) goto L30;
        return false;
    L30:
        if (this.value8 == r6.value8) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getValue1() {
        return this.value1;
    }

    public final int getValue2() {
        return this.value2;
    }

    public final int getValue3() {
        return this.value3;
    }

    public final int getValue4() {
        return this.value4;
    }

    public final int getValue5() {
        return this.value5;
    }

    public final int getValue6() {
        return this.value6;
    }

    public final int getValue7() {
        return this.value7;
    }

    public final int getValue8() {
        return this.value8;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.value1) * 31) + Integer.hashCode(this.value2)) * 31) + Integer.hashCode(this.value3)) * 31) + Integer.hashCode(this.value4)) * 31) + Integer.hashCode(this.value5)) * 31) + Integer.hashCode(this.value6)) * 31) + Integer.hashCode(this.value7)) * 31) + Integer.hashCode(this.value8);
    }

    public final void setValue1(int r1) {
        this.value1 = r1;
    }

    public final void setValue2(int r1) {
        this.value2 = r1;
    }

    public final void setValue3(int r1) {
        this.value3 = r1;
    }

    public final void setValue4(int r1) {
        this.value4 = r1;
    }

    public final void setValue5(int r1) {
        this.value5 = r1;
    }

    public final void setValue6(int r1) {
        this.value6 = r1;
    }

    public final void setValue7(int r1) {
        this.value7 = r1;
    }

    public final void setValue8(int r1) {
        this.value8 = r1;
    }

    @aa1
    public String toString() {
        return "BleBacCalibration(value1=" + this.value1 + ", value2=" + this.value2 + ", value3=" + this.value3 + ", value4=" + this.value4 + ", value5=" + this.value5 + ", value6=" + this.value6 + ", value7=" + this.value7 + ", value8=" + this.value8 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBacCalibration(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        this.value1 = r1;
        this.value2 = r2;
        this.value3 = r3;
        this.value4 = r4;
        this.value5 = r5;
        this.value6 = r6;
        this.value7 = r7;
        this.value8 = r8;
    }

    public /* synthetic */ BleBacCalibration(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 1;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L26;
        int r12 = 0;
    L27:
        this(r2, r3, r4, r5, r6, r7, r8, r12);
        return;
    L26:
        r12 = r9;
        goto L27
    }
}
