package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMeasurement extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int STATE_END = 2;
    public static final int STATE_FAILED = 3;
    public static final int STATE_GOING = 1;
    public static final int STATE_START = 0;
    public static final int TYPE_BLOOD_GLUCOSE = 0;
    public static final int TYPE_BLOOD_GLUCOSE_VALUE = 1;
    private int mDay;
    private int mHour;
    private int mLength;
    private final int mLengthToWrite;
    private int mMillisecond;
    private int mMinute;
    private int mMonth;

    @aa1
    private byte[] mPacket;
    private int mSecond;
    private int mState;
    private int mType;
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

    public BleMeasurement() {
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
        byte[] r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ BleMeasurement copy$default(BleMeasurement r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, byte[] r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mState;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mYear;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mMonth;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mDay;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mHour;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mMinute;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mSecond;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mMillisecond;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mLength;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mPacket;
    L35:
        int r14 = r10;
        byte[] r15 = r11;
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
        return this.mType;
    }

    public final int component10() {
        return this.mLength;
    }

    @aa1
    public final byte[] component11() {
        return this.mPacket;
    }

    public final int component2() {
        return this.mState;
    }

    public final int component3() {
        return this.mYear;
    }

    public final int component4() {
        return this.mMonth;
    }

    public final int component5() {
        return this.mDay;
    }

    public final int component6() {
        return this.mHour;
    }

    public final int component7() {
        return this.mMinute;
    }

    public final int component8() {
        return this.mSecond;
    }

    public final int component9() {
        return this.mMillisecond;
    }

    @aa1
    public final BleMeasurement copy(int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, @aa1 byte[] r24) {
        Intrinsics.X0O(r24, "mPacket");
        return new BleMeasurement(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        this.mState = readUInt8();
        this.mYear = readUInt8() + 2000;
        this.mMonth = readUInt8();
        this.mDay = readUInt8();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
        this.mSecond = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMillisecond = readUInt16(r0);
        readBytes(20);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        char r1 = readUInt16(r0);
        this.mLength = r1;
        this.mPacket = readBytes(r1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mState);
        writeInt8(this.mYear - 2000);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        writeInt8(this.mSecond);
        int r0 = this.mMillisecond;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        BleWritable.writeBytes$default(this, new byte[20], null, 2, null);
        int r2 = this.mLength;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        BleWritable.writeBytes$default(this, this.mPacket, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMeasurement) == true) goto L8;
        return false;
    L8:
        BleMeasurement r6 = (BleMeasurement) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mState == r6.mState) goto L15;
        return false;
    L15:
        if (this.mYear == r6.mYear) goto L18;
        return false;
    L18:
        if (this.mMonth == r6.mMonth) goto L21;
        return false;
    L21:
        if (this.mDay == r6.mDay) goto L24;
        return false;
    L24:
        if (this.mHour == r6.mHour) goto L27;
        return false;
    L27:
        if (this.mMinute == r6.mMinute) goto L30;
        return false;
    L30:
        if (this.mSecond == r6.mSecond) goto L33;
        return false;
    L33:
        if (this.mMillisecond == r6.mMillisecond) goto L36;
        return false;
    L36:
        if (this.mLength == r6.mLength) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mPacket, r6.mPacket) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMHour() {
        return this.mHour;
    }

    public final int getMLength() {
        return this.mLength;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mLengthToWrite;
    }

    public final int getMMillisecond() {
        return this.mMillisecond;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    @aa1
    public final byte[] getMPacket() {
        return this.mPacket;
    }

    public final int getMSecond() {
        return this.mSecond;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mYear)) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mSecond)) * 31) + Integer.hashCode(this.mMillisecond)) * 31) + Integer.hashCode(this.mLength)) * 31) + Arrays.hashCode(this.mPacket);
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMLength(int r1) {
        this.mLength = r1;
    }

    public final void setMMillisecond(int r1) {
        this.mMillisecond = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMPacket(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPacket = r2;
    }

    public final void setMSecond(int r1) {
        this.mSecond = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleMeasurement(mType=" + this.mType + ", mState=" + this.mState + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + ", mMillisecond=" + this.mMillisecond + ", mLength=" + this.mLength + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurement(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, @aa1 byte[] r12) {
        Intrinsics.X0O(r12, "mPacket");
        this.mType = r2;
        this.mState = r3;
        this.mYear = r4;
        this.mMonth = r5;
        this.mDay = r6;
        this.mHour = r7;
        this.mMinute = r8;
        this.mSecond = r9;
        this.mMillisecond = r10;
        this.mLength = r11;
        this.mPacket = r12;
        this.mLengthToWrite = r12.length + 32;
    }

    public /* synthetic */ BleMeasurement(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, byte[] r12, int r13, DefaultConstructorMarker r14) {
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
        if ((r13 & 1024) == 0) goto L35;
        r12 = new byte[0];
    L35:
        byte[] r15 = r12;
        int r16 = r11;
        int r17 = r10;
        int r18 = r9;
        int r19 = r8;
        int r20 = r7;
        int r21 = r6;
        int r22 = r5;
        int r23 = r4;
        this(r2, r3, r23, r22, r21, r20, r19, r18, r17, r16, r15);
    }
}
