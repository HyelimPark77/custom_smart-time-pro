package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchLog3 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    private int mCancelType;
    private int mCount;
    private int mCountingTime;
    private int mOtherType;
    private int mPeriodNumber;
    private int mPeriodTime;
    private int mPlayer;
    private int mStopWatchTotal;
    private int mTeam;
    private int mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchLog3() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, null);
    }

    public static /* synthetic */ BleMatchLog3 copy$default(BleMatchLog3 bleMatchLog3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = bleMatchLog3.mTime;
        }
        if ((i12 & 2) != 0) {
            i2 = bleMatchLog3.mCountingTime;
        }
        if ((i12 & 4) != 0) {
            i3 = bleMatchLog3.mPeriodTime;
        }
        if ((i12 & 8) != 0) {
            i4 = bleMatchLog3.mPeriodNumber;
        }
        if ((i12 & 16) != 0) {
            i5 = bleMatchLog3.mType;
        }
        if ((i12 & 32) != 0) {
            i6 = bleMatchLog3.mCount;
        }
        if ((i12 & 64) != 0) {
            i7 = bleMatchLog3.mCancelType;
        }
        if ((i12 & 128) != 0) {
            i8 = bleMatchLog3.mTeam;
        }
        if ((i12 & 256) != 0) {
            i9 = bleMatchLog3.mPlayer;
        }
        if ((i12 & 512) != 0) {
            i10 = bleMatchLog3.mOtherType;
        }
        if ((i12 & 1024) != 0) {
            i11 = bleMatchLog3.mStopWatchTotal;
        }
        int i13 = i10;
        int i14 = i11;
        int i15 = i8;
        int i16 = i9;
        int i17 = i6;
        int i18 = i7;
        int i19 = i5;
        int i20 = i3;
        return bleMatchLog3.copy(i, i2, i20, i4, i19, i17, i18, i15, i16, i13, i14);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component10() {
        return this.mOtherType;
    }

    public final int component11() {
        return this.mStopWatchTotal;
    }

    public final int component2() {
        return this.mCountingTime;
    }

    public final int component3() {
        return this.mPeriodTime;
    }

    public final int component4() {
        return this.mPeriodNumber;
    }

    public final int component5() {
        return this.mType;
    }

    public final int component6() {
        return this.mCount;
    }

    public final int component7() {
        return this.mCancelType;
    }

    public final int component8() {
        return this.mTeam;
    }

    public final int component9() {
        return this.mPlayer;
    }

    @aa1
    public final BleMatchLog3 copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        return new BleMatchLog3(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCountingTime = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPeriodTime = (int) readUInt32(LITTLE_ENDIAN);
        byte int8 = readInt8();
        byte int9 = readInt8();
        this.mPeriodNumber = int8;
        this.mType = int9;
        this.mStopWatchTotal = (int8 & 255) | ((int9 & 255) << 8);
        this.mCount = readUInt8();
        this.mCancelType = readUInt8();
        this.mTeam = readUInt8();
        this.mPlayer = readUInt8();
        this.mOtherType = readUInt8();
        readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchLog3)) {
            return false;
        }
        BleMatchLog3 bleMatchLog3 = (BleMatchLog3) obj;
        return this.mTime == bleMatchLog3.mTime && this.mCountingTime == bleMatchLog3.mCountingTime && this.mPeriodTime == bleMatchLog3.mPeriodTime && this.mPeriodNumber == bleMatchLog3.mPeriodNumber && this.mType == bleMatchLog3.mType && this.mCount == bleMatchLog3.mCount && this.mCancelType == bleMatchLog3.mCancelType && this.mTeam == bleMatchLog3.mTeam && this.mPlayer == bleMatchLog3.mPlayer && this.mOtherType == bleMatchLog3.mOtherType && this.mStopWatchTotal == bleMatchLog3.mStopWatchTotal;
    }

    public final int getMCancelType() {
        return this.mCancelType;
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final int getMCountingTime() {
        return this.mCountingTime;
    }

    public final int getMOtherType() {
        return this.mOtherType;
    }

    public final int getMPeriodNumber() {
        return this.mPeriodNumber;
    }

    public final int getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMPlayer() {
        return this.mPlayer;
    }

    public final int getMStopWatchTotal() {
        return this.mStopWatchTotal;
    }

    public final int getMTeam() {
        return this.mTeam;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mCountingTime)) * 31) + Integer.hashCode(this.mPeriodTime)) * 31) + Integer.hashCode(this.mPeriodNumber)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mCancelType)) * 31) + Integer.hashCode(this.mTeam)) * 31) + Integer.hashCode(this.mPlayer)) * 31) + Integer.hashCode(this.mOtherType)) * 31) + Integer.hashCode(this.mStopWatchTotal);
    }

    public final void setMCancelType(int i) {
        this.mCancelType = i;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMCountingTime(int i) {
        this.mCountingTime = i;
    }

    public final void setMOtherType(int i) {
        this.mOtherType = i;
    }

    public final void setMPeriodNumber(int i) {
        this.mPeriodNumber = i;
    }

    public final void setMPeriodTime(int i) {
        this.mPeriodTime = i;
    }

    public final void setMPlayer(int i) {
        this.mPlayer = i;
    }

    public final void setMStopWatchTotal(int i) {
        this.mStopWatchTotal = i;
    }

    public final void setMTeam(int i) {
        this.mTeam = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleMatchLog3(mTime=" + this.mTime + ", mCountingTime=" + this.mCountingTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + ", mTeam=" + this.mTeam + ", mPlayer=" + this.mPlayer + ", mOtherType=" + this.mOtherType + ", mStopWatchTotal=" + this.mStopWatchTotal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchLog3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.mTime = i;
        this.mCountingTime = i2;
        this.mPeriodTime = i3;
        this.mPeriodNumber = i4;
        this.mType = i5;
        this.mCount = i6;
        this.mCancelType = i7;
        this.mTeam = i8;
        this.mPlayer = i9;
        this.mOtherType = i10;
        this.mStopWatchTotal = i11;
    }

    public /* synthetic */ BleMatchLog3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 0 : i3, (i12 & 8) != 0 ? 0 : i4, (i12 & 16) != 0 ? 0 : i5, (i12 & 32) != 0 ? 0 : i6, (i12 & 64) != 0 ? 0 : i7, (i12 & 128) != 0 ? 0 : i8, (i12 & 256) != 0 ? 0 : i9, (i12 & 512) != 0 ? 0 : i10, (i12 & 1024) != 0 ? 0 : i11);
    }
}
