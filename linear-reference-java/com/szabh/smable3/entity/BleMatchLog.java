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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchLog() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleMatchLog copy$default(BleMatchLog r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mPeriodTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mPeriodNumber;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mType;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mCount;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mCancelType;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final BleMatchLog copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleMatchLog(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPeriodTime = readUInt16(r0);
        this.mPeriodNumber = readUInt8();
        this.mType = readUInt8();
        this.mCount = readUInt8();
        this.mCancelType = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchLog) == true) goto L8;
        return false;
    L8:
        BleMatchLog r6 = (BleMatchLog) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mPeriodTime == r6.mPeriodTime) goto L15;
        return false;
    L15:
        if (this.mPeriodNumber == r6.mPeriodNumber) goto L18;
        return false;
    L18:
        if (this.mType == r6.mType) goto L21;
        return false;
    L21:
        if (this.mCount == r6.mCount) goto L24;
        return false;
    L24:
        if (this.mCancelType == r6.mCancelType) goto L26;
        return false;
    L26:
        return true;
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

    public final void setMCancelType(int r1) {
        this.mCancelType = r1;
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMPeriodNumber(int r1) {
        this.mPeriodNumber = r1;
    }

    public final void setMPeriodTime(int r1) {
        this.mPeriodTime = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchLog(mTime=" + this.mTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchLog(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mTime = r1;
        this.mPeriodTime = r2;
        this.mPeriodNumber = r3;
        this.mType = r4;
        this.mCount = r5;
        this.mCancelType = r6;
    }

    public /* synthetic */ BleMatchLog(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
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
