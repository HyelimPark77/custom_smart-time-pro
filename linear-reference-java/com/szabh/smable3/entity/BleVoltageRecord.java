package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVoltageRecord extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mDay;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mSecond;
    private int mVoltage;
    private int mYear;

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

    public BleVoltageRecord() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleVoltageRecord copy$default(BleVoltageRecord r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mYear;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mMonth;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mDay;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mHour;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mMinute;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mSecond;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mVoltage;
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
        return this.mYear;
    }

    public final int component2() {
        return this.mMonth;
    }

    public final int component3() {
        return this.mDay;
    }

    public final int component4() {
        return this.mHour;
    }

    public final int component5() {
        return this.mMinute;
    }

    public final int component6() {
        return this.mSecond;
    }

    public final int component7() {
        return this.mVoltage;
    }

    @aa1
    public final BleVoltageRecord copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleVoltageRecord(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mYear = readInt8();
        this.mMonth = readInt8();
        this.mDay = readInt8();
        this.mHour = readInt8();
        this.mMinute = readInt8();
        this.mSecond = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mVoltage = readUInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleVoltageRecord) == true) goto L8;
        return false;
    L8:
        BleVoltageRecord r6 = (BleVoltageRecord) r5;
        if (this.mYear == r6.mYear) goto L12;
        return false;
    L12:
        if (this.mMonth == r6.mMonth) goto L15;
        return false;
    L15:
        if (this.mDay == r6.mDay) goto L18;
        return false;
    L18:
        if (this.mHour == r6.mHour) goto L21;
        return false;
    L21:
        if (this.mMinute == r6.mMinute) goto L24;
        return false;
    L24:
        if (this.mSecond == r6.mSecond) goto L27;
        return false;
    L27:
        if (this.mVoltage == r6.mVoltage) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMHour() {
        return this.mHour;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    public final int getMSecond() {
        return this.mSecond;
    }

    public final int getMVoltage() {
        return this.mVoltage;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mYear) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mSecond)) * 31) + Integer.hashCode(this.mVoltage);
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMSecond(int r1) {
        this.mSecond = r1;
    }

    public final void setMVoltage(int r1) {
        this.mVoltage = r1;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleVoltageRecord(mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + ", mVoltage=" + this.mVoltage + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVoltageRecord(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mYear = r1;
        this.mMonth = r2;
        this.mDay = r3;
        this.mHour = r4;
        this.mMinute = r5;
        this.mSecond = r6;
        this.mVoltage = r7;
    }

    public /* synthetic */ BleVoltageRecord(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
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
