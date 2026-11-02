package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSosCallLog extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 48;
    private static final int PHONE_LENGTH = 24;
    private int mBOValue;
    private int mBpm;
    private int mDuration;
    private int mLastBOTime;
    private int mLastHrTime;

    @aa1
    private String mPhone;
    private int mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSosCallLog() {
        this(0, 0, 0, null, 0, 0, 0, 0, 255, null);
    }

    public static /* synthetic */ BleSosCallLog copy$default(BleSosCallLog bleSosCallLog, int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleSosCallLog.mTime;
        }
        if ((i8 & 2) != 0) {
            i2 = bleSosCallLog.mDuration;
        }
        if ((i8 & 4) != 0) {
            i3 = bleSosCallLog.mType;
        }
        if ((i8 & 8) != 0) {
            str = bleSosCallLog.mPhone;
        }
        if ((i8 & 16) != 0) {
            i4 = bleSosCallLog.mLastHrTime;
        }
        if ((i8 & 32) != 0) {
            i5 = bleSosCallLog.mLastBOTime;
        }
        if ((i8 & 64) != 0) {
            i6 = bleSosCallLog.mBpm;
        }
        if ((i8 & 128) != 0) {
            i7 = bleSosCallLog.mBOValue;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i4;
        int i12 = i5;
        return bleSosCallLog.copy(i, i2, i3, str, i11, i12, i9, i10);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mDuration;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mPhone;
    }

    public final int component5() {
        return this.mLastHrTime;
    }

    public final int component6() {
        return this.mLastBOTime;
    }

    public final int component7() {
        return this.mBpm;
    }

    public final int component8() {
        return this.mBOValue;
    }

    @aa1
    public final BleSosCallLog copy(int i, int i2, int i3, @aa1 String mPhone, int i4, int i5, int i6, int i7) {
        Intrinsics.X0O(mPhone, "mPhone");
        return new BleSosCallLog(i, i2, i3, mPhone, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = (int) readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDuration = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mType = readUInt16(LITTLE_ENDIAN);
        this.mPhone = BleReadable.readString$default(this, 24, null, 2, null);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLastHrTime = (int) readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLastBOTime = (int) readUInt32(LITTLE_ENDIAN);
        this.mBpm = readUInt8();
        this.mBOValue = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSosCallLog)) {
            return false;
        }
        BleSosCallLog bleSosCallLog = (BleSosCallLog) obj;
        return this.mTime == bleSosCallLog.mTime && this.mDuration == bleSosCallLog.mDuration && this.mType == bleSosCallLog.mType && Intrinsics.XOO0ii0(this.mPhone, bleSosCallLog.mPhone) && this.mLastHrTime == bleSosCallLog.mLastHrTime && this.mLastBOTime == bleSosCallLog.mLastBOTime && this.mBpm == bleSosCallLog.mBpm && this.mBOValue == bleSosCallLog.mBOValue;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMBpm() {
        return this.mBpm;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMLastBOTime() {
        return this.mLastBOTime;
    }

    public final int getMLastHrTime() {
        return this.mLastHrTime;
    }

    @aa1
    public final String getMPhone() {
        return this.mPhone;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mType)) * 31) + this.mPhone.hashCode()) * 31) + Integer.hashCode(this.mLastHrTime)) * 31) + Integer.hashCode(this.mLastBOTime)) * 31) + Integer.hashCode(this.mBpm)) * 31) + Integer.hashCode(this.mBOValue);
    }

    public final void setMBOValue(int i) {
        this.mBOValue = i;
    }

    public final void setMBpm(int i) {
        this.mBpm = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMLastBOTime(int i) {
        this.mLastBOTime = i;
    }

    public final void setMLastHrTime(int i) {
        this.mLastHrTime = i;
    }

    public final void setMPhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPhone = str;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleSosCallLog(mTime=" + this.mTime + ", mDuration=" + this.mDuration + ", mType=" + this.mType + ", mPhone=" + this.mPhone + ", mLastHrTime=" + this.mLastHrTime + ", mLastBOTime=" + this.mLastBOTime + ", mBpm=" + this.mBpm + ", mBOValue=" + this.mBOValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSosCallLog(int i, int i2, int i3, @aa1 String mPhone, int i4, int i5, int i6, int i7) {
        Intrinsics.X0O(mPhone, "mPhone");
        this.mTime = i;
        this.mDuration = i2;
        this.mType = i3;
        this.mPhone = mPhone;
        this.mLastHrTime = i4;
        this.mLastBOTime = i5;
        this.mBpm = i6;
        this.mBOValue = i7;
    }

    public /* synthetic */ BleSosCallLog(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? "" : str, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? 0 : i7);
    }
}
