package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchLog extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int GOAL_GUEST = 7;
    public static final int GOAL_HOME = 6;
    public static final int ITEM_LENGTH = 8;
    public static final int KICK_OFF = 0;
    public static final int MERCY_END = 9;
    public static final int PENALTY = 5;
    public static final int PERIOD_END = 3;
    public static final int PERIOD_RESET = 4;
    public static final int TIME_START = 1;
    public static final int TIME_STOP = 2;
    public static final int UNDO_LAST = 8;
    private int mCancelType;
    private int mCount;
    private int mPeriodNumber;
    private int mPeriodTime;
    private int mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchLog() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BleMatchLog copy$default(BleMatchLog bleMatchLog, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleMatchLog.mTime;
        }
        if ((i7 & 2) != 0) {
            i2 = bleMatchLog.mPeriodTime;
        }
        if ((i7 & 4) != 0) {
            i3 = bleMatchLog.mPeriodNumber;
        }
        if ((i7 & 8) != 0) {
            i4 = bleMatchLog.mType;
        }
        if ((i7 & 16) != 0) {
            i5 = bleMatchLog.mCount;
        }
        if ((i7 & 32) != 0) {
            i6 = bleMatchLog.mCancelType;
        }
        int i8 = i5;
        int i9 = i6;
        return bleMatchLog.copy(i, i2, i3, i4, i8, i9);
    }

    public final int component1() {
        return this.mTime;
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

    @aa1
    public final BleMatchLog copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new BleMatchLog(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPeriodTime = readUInt16(LITTLE_ENDIAN);
        this.mPeriodNumber = readUInt8();
        this.mType = readUInt8();
        this.mCount = readUInt8();
        this.mCancelType = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchLog)) {
            return false;
        }
        BleMatchLog bleMatchLog = (BleMatchLog) obj;
        return this.mTime == bleMatchLog.mTime && this.mPeriodTime == bleMatchLog.mPeriodTime && this.mPeriodNumber == bleMatchLog.mPeriodNumber && this.mType == bleMatchLog.mType && this.mCount == bleMatchLog.mCount && this.mCancelType == bleMatchLog.mCancelType;
    }

    public final int getMCancelType() {
        return this.mCancelType;
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final int getMPeriodNumber() {
        return this.mPeriodNumber;
    }

    public final int getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mPeriodTime)) * 31) + Integer.hashCode(this.mPeriodNumber)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mCancelType);
    }

    public final void setMCancelType(int i) {
        this.mCancelType = i;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMPeriodNumber(int i) {
        this.mPeriodNumber = i;
    }

    public final void setMPeriodTime(int i) {
        this.mPeriodTime = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleMatchLog(mTime=" + this.mTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchLog(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mTime = i;
        this.mPeriodTime = i2;
        this.mPeriodNumber = i3;
        this.mType = i4;
        this.mCount = i5;
        this.mCancelType = i6;
    }

    public /* synthetic */ BleMatchLog(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
