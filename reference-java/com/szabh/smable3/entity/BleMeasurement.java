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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMeasurement() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 2047, null);
    }

    public static /* synthetic */ BleMeasurement copy$default(BleMeasurement bleMeasurement, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = bleMeasurement.mType;
        }
        if ((i11 & 2) != 0) {
            i2 = bleMeasurement.mState;
        }
        if ((i11 & 4) != 0) {
            i3 = bleMeasurement.mYear;
        }
        if ((i11 & 8) != 0) {
            i4 = bleMeasurement.mMonth;
        }
        if ((i11 & 16) != 0) {
            i5 = bleMeasurement.mDay;
        }
        if ((i11 & 32) != 0) {
            i6 = bleMeasurement.mHour;
        }
        if ((i11 & 64) != 0) {
            i7 = bleMeasurement.mMinute;
        }
        if ((i11 & 128) != 0) {
            i8 = bleMeasurement.mSecond;
        }
        if ((i11 & 256) != 0) {
            i9 = bleMeasurement.mMillisecond;
        }
        if ((i11 & 512) != 0) {
            i10 = bleMeasurement.mLength;
        }
        if ((i11 & 1024) != 0) {
            bArr = bleMeasurement.mPacket;
        }
        int i12 = i10;
        byte[] bArr2 = bArr;
        int i13 = i8;
        int i14 = i9;
        int i15 = i6;
        int i16 = i7;
        int i17 = i5;
        int i18 = i3;
        return bleMeasurement.copy(i, i2, i18, i4, i17, i15, i16, i13, i14, i12, bArr2);
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
    public final BleMeasurement copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, @aa1 byte[] mPacket) {
        Intrinsics.X0O(mPacket, "mPacket");
        return new BleMeasurement(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, mPacket);
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
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMillisecond = readUInt16(LITTLE_ENDIAN);
        readBytes(20);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        char uInt16 = readUInt16(LITTLE_ENDIAN);
        this.mLength = uInt16;
        this.mPacket = readBytes(uInt16);
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
        int i = this.mMillisecond;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[20], null, 2, null);
        int i2 = this.mLength;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, this.mPacket, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMeasurement)) {
            return false;
        }
        BleMeasurement bleMeasurement = (BleMeasurement) obj;
        return this.mType == bleMeasurement.mType && this.mState == bleMeasurement.mState && this.mYear == bleMeasurement.mYear && this.mMonth == bleMeasurement.mMonth && this.mDay == bleMeasurement.mDay && this.mHour == bleMeasurement.mHour && this.mMinute == bleMeasurement.mMinute && this.mSecond == bleMeasurement.mSecond && this.mMillisecond == bleMeasurement.mMillisecond && this.mLength == bleMeasurement.mLength && Intrinsics.XOO0ii0(this.mPacket, bleMeasurement.mPacket);
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

    public final void setMDay(int i) {
        this.mDay = i;
    }

    public final void setMHour(int i) {
        this.mHour = i;
    }

    public final void setMLength(int i) {
        this.mLength = i;
    }

    public final void setMMillisecond(int i) {
        this.mMillisecond = i;
    }

    public final void setMMinute(int i) {
        this.mMinute = i;
    }

    public final void setMMonth(int i) {
        this.mMonth = i;
    }

    public final void setMPacket(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mPacket = bArr;
    }

    public final void setMSecond(int i) {
        this.mSecond = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMYear(int i) {
        this.mYear = i;
    }

    @aa1
    public String toString() {
        return "BleMeasurement(mType=" + this.mType + ", mState=" + this.mState + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + ", mMillisecond=" + this.mMillisecond + ", mLength=" + this.mLength + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, @aa1 byte[] mPacket) {
        Intrinsics.X0O(mPacket, "mPacket");
        this.mType = i;
        this.mState = i2;
        this.mYear = i3;
        this.mMonth = i4;
        this.mDay = i5;
        this.mHour = i6;
        this.mMinute = i7;
        this.mSecond = i8;
        this.mMillisecond = i9;
        this.mLength = i10;
        this.mPacket = mPacket;
        this.mLengthToWrite = mPacket.length + 32;
    }

    public /* synthetic */ BleMeasurement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i2, (i11 & 4) != 0 ? 0 : i3, (i11 & 8) != 0 ? 0 : i4, (i11 & 16) != 0 ? 0 : i5, (i11 & 32) != 0 ? 0 : i6, (i11 & 64) != 0 ? 0 : i7, (i11 & 128) != 0 ? 0 : i8, (i11 & 256) != 0 ? 0 : i9, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? new byte[0] : bArr);
    }
}
