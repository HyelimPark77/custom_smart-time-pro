package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchLog2 extends BleReadable {
    public static final int CONVERSION = 18;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int DROP_KICK = 20;
    public static final int FOUL_AWAY = 15;
    public static final int FOUL_HOME = 14;
    public static final int GOAL_GUEST = 7;
    public static final int GOAL_HOME = 6;
    public static final int GREEN_CARD = 23;
    public static final int INCIDENT_BREAK = 10;
    public static final int INJURY_ASSESSMENT = 22;
    public static final int ITEM_LENGTH = 12;
    public static final int KICK_OFF = 0;
    public static final int MERCY_END = 9;
    public static final int PENALTY = 5;
    public static final int PENALTY_KICK = 19;
    public static final int PENALTY_TRY = 21;
    public static final int PERIOD_END = 3;
    public static final int PERIOD_RESET = 4;
    public static final int RED_CARD = 12;
    public static final int SUBSTITUTION = 13;
    public static final int TIME_OUT = 16;
    public static final int TIME_START = 1;
    public static final int TIME_STOP = 2;
    public static final int TRY = 17;
    public static final int UNDO_LAST = 8;
    public static final int YELLOW_CARD = 11;
    public static final int YELLOW_CARD1 = 24;
    public static final int YELLOW_CARD2 = 25;
    private int mCancelType;
    private int mCount;
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

    public BleMatchLog2() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    }

    public static /* synthetic */ BleMatchLog2 copy$default(BleMatchLog2 bleMatchLog2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = bleMatchLog2.mTime;
        }
        if ((i11 & 2) != 0) {
            i2 = bleMatchLog2.mPeriodTime;
        }
        if ((i11 & 4) != 0) {
            i3 = bleMatchLog2.mPeriodNumber;
        }
        if ((i11 & 8) != 0) {
            i4 = bleMatchLog2.mType;
        }
        if ((i11 & 16) != 0) {
            i5 = bleMatchLog2.mCount;
        }
        if ((i11 & 32) != 0) {
            i6 = bleMatchLog2.mCancelType;
        }
        if ((i11 & 64) != 0) {
            i7 = bleMatchLog2.mTeam;
        }
        if ((i11 & 128) != 0) {
            i8 = bleMatchLog2.mPlayer;
        }
        if ((i11 & 256) != 0) {
            i9 = bleMatchLog2.mOtherType;
        }
        if ((i11 & 512) != 0) {
            i10 = bleMatchLog2.mStopWatchTotal;
        }
        int i12 = i9;
        int i13 = i10;
        int i14 = i7;
        int i15 = i8;
        int i16 = i5;
        int i17 = i6;
        return bleMatchLog2.copy(i, i2, i3, i4, i16, i17, i14, i15, i12, i13);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component10() {
        return this.mStopWatchTotal;
    }

    public final int component2() {
        return this.mPeriodTime;
    }

    public final int component3() {
        return this.mPeriodNumber;
    }

    public final int component4() {
        return this.mType;
    }

    public final int component5() {
        return this.mCount;
    }

    public final int component6() {
        return this.mCancelType;
    }

    public final int component7() {
        return this.mTeam;
    }

    public final int component8() {
        return this.mPlayer;
    }

    public final int component9() {
        return this.mOtherType;
    }

    @aa1
    public final BleMatchLog2 copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        return new BleMatchLog2(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPeriodTime = readUInt16(LITTLE_ENDIAN);
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
        if (!(obj instanceof BleMatchLog2)) {
            return false;
        }
        BleMatchLog2 bleMatchLog2 = (BleMatchLog2) obj;
        return this.mTime == bleMatchLog2.mTime && this.mPeriodTime == bleMatchLog2.mPeriodTime && this.mPeriodNumber == bleMatchLog2.mPeriodNumber && this.mType == bleMatchLog2.mType && this.mCount == bleMatchLog2.mCount && this.mCancelType == bleMatchLog2.mCancelType && this.mTeam == bleMatchLog2.mTeam && this.mPlayer == bleMatchLog2.mPlayer && this.mOtherType == bleMatchLog2.mOtherType && this.mStopWatchTotal == bleMatchLog2.mStopWatchTotal;
    }

    public final int getMCancelType() {
        return this.mCancelType;
    }

    public final int getMCount() {
        return this.mCount;
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
        return (((((((((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mPeriodTime)) * 31) + Integer.hashCode(this.mPeriodNumber)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mCancelType)) * 31) + Integer.hashCode(this.mTeam)) * 31) + Integer.hashCode(this.mPlayer)) * 31) + Integer.hashCode(this.mOtherType)) * 31) + Integer.hashCode(this.mStopWatchTotal);
    }

    public final void setMCancelType(int i) {
        this.mCancelType = i;
    }

    public final void setMCount(int i) {
        this.mCount = i;
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
        return "BleMatchLog2(mTime=" + this.mTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + ", mTeam=" + this.mTeam + ", mPlayer=" + this.mPlayer + ", mOtherType=" + this.mOtherType + ", mStopWatchTotal=" + this.mStopWatchTotal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchLog2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mTime = i;
        this.mPeriodTime = i2;
        this.mPeriodNumber = i3;
        this.mType = i4;
        this.mCount = i5;
        this.mCancelType = i6;
        this.mTeam = i7;
        this.mPlayer = i8;
        this.mOtherType = i9;
        this.mStopWatchTotal = i10;
    }

    public /* synthetic */ BleMatchLog2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i2, (i11 & 4) != 0 ? 0 : i3, (i11 & 8) != 0 ? 0 : i4, (i11 & 16) != 0 ? 0 : i5, (i11 & 32) != 0 ? 0 : i6, (i11 & 64) != 0 ? 0 : i7, (i11 & 128) != 0 ? 0 : i8, (i11 & 256) != 0 ? 0 : i9, (i11 & 512) != 0 ? 0 : i10);
    }
}
