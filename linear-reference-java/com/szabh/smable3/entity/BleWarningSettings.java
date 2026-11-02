package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWarningSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 24;
    private int mBOLowSwitch;
    private int mBOLowValue;
    private int mStressHighSwitch;
    private int mStressHighValue;
    private int mTemperatureHighSwitch;
    private int mTemperatureHighValue;

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

    public BleWarningSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleWarningSettings copy$default(BleWarningSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mBOLowSwitch;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mBOLowValue;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mStressHighSwitch;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mStressHighValue;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mTemperatureHighSwitch;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mTemperatureHighValue;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mBOLowSwitch;
    }

    public final int component2() {
        return this.mBOLowValue;
    }

    public final int component3() {
        return this.mStressHighSwitch;
    }

    public final int component4() {
        return this.mStressHighValue;
    }

    public final int component5() {
        return this.mTemperatureHighSwitch;
    }

    public final int component6() {
        return this.mTemperatureHighValue;
    }

    @aa1
    public final BleWarningSettings copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleWarningSettings(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mBOLowSwitch = readInt8();
        this.mBOLowValue = readInt8();
        this.mStressHighSwitch = readUInt8();
        this.mStressHighValue = readUInt8();
        this.mTemperatureHighSwitch = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTemperatureHighValue = readUInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mBOLowSwitch);
        writeInt8(this.mBOLowValue);
        writeInt8(this.mStressHighSwitch);
        writeInt8(this.mStressHighValue);
        writeInt8(this.mTemperatureHighSwitch);
        int r0 = this.mTemperatureHighValue;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWarningSettings) == true) goto L8;
        return false;
    L8:
        BleWarningSettings r6 = (BleWarningSettings) r5;
        if (this.mBOLowSwitch == r6.mBOLowSwitch) goto L12;
        return false;
    L12:
        if (this.mBOLowValue == r6.mBOLowValue) goto L15;
        return false;
    L15:
        if (this.mStressHighSwitch == r6.mStressHighSwitch) goto L18;
        return false;
    L18:
        if (this.mStressHighValue == r6.mStressHighValue) goto L21;
        return false;
    L21:
        if (this.mTemperatureHighSwitch == r6.mTemperatureHighSwitch) goto L24;
        return false;
    L24:
        if (this.mTemperatureHighValue == r6.mTemperatureHighValue) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMBOLowSwitch() {
        return this.mBOLowSwitch;
    }

    public final int getMBOLowValue() {
        return this.mBOLowValue;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 24;
    }

    public final int getMStressHighSwitch() {
        return this.mStressHighSwitch;
    }

    public final int getMStressHighValue() {
        return this.mStressHighValue;
    }

    public final int getMTemperatureHighSwitch() {
        return this.mTemperatureHighSwitch;
    }

    public final int getMTemperatureHighValue() {
        return this.mTemperatureHighValue;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mBOLowSwitch) * 31) + Integer.hashCode(this.mBOLowValue)) * 31) + Integer.hashCode(this.mStressHighSwitch)) * 31) + Integer.hashCode(this.mStressHighValue)) * 31) + Integer.hashCode(this.mTemperatureHighSwitch)) * 31) + Integer.hashCode(this.mTemperatureHighValue);
    }

    public final void setMBOLowSwitch(int r1) {
        this.mBOLowSwitch = r1;
    }

    public final void setMBOLowValue(int r1) {
        this.mBOLowValue = r1;
    }

    public final void setMStressHighSwitch(int r1) {
        this.mStressHighSwitch = r1;
    }

    public final void setMStressHighValue(int r1) {
        this.mStressHighValue = r1;
    }

    public final void setMTemperatureHighSwitch(int r1) {
        this.mTemperatureHighSwitch = r1;
    }

    public final void setMTemperatureHighValue(int r1) {
        this.mTemperatureHighValue = r1;
    }

    @aa1
    public String toString() {
        return "BleWarningSettings(mBOLowSwitch=" + this.mBOLowSwitch + ", mBOLowValue=" + this.mBOLowValue + ", mStressHighSwitch=" + this.mStressHighSwitch + ", mStressHighValue=" + this.mStressHighValue + ", mTemperatureHighSwitch=" + this.mTemperatureHighSwitch + ", mTemperatureHighValue=" + this.mTemperatureHighValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWarningSettings(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mBOLowSwitch = r1;
        this.mBOLowValue = r2;
        this.mStressHighSwitch = r3;
        this.mStressHighValue = r4;
        this.mTemperatureHighSwitch = r5;
        this.mTemperatureHighValue = r6;
    }

    public /* synthetic */ BleWarningSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
