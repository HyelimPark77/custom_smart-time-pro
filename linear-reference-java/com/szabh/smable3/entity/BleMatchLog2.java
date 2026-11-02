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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchLog2() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ BleMatchLog2 copy$default(BleMatchLog2 r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mPeriodTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mPeriodNumber;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mType;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mCount;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mCancelType;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mTeam;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mPlayer;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mOtherType;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mStopWatchTotal;
    L32:
        int r13 = r9;
        int r14 = r10;
        int r15 = r7;
        int r16 = r8;
        int r17 = r5;
        int r18 = r6;
        int r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
    public final BleMatchLog2 copy(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21) {
        return new BleMatchLog2(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPeriodTime = readUInt16(r0);
        byte r1 = readInt8();
        byte r2 = readInt8();
        this.mPeriodNumber = r1;
        this.mType = r2;
        int r3 = r1 & 255;
        this.mStopWatchTotal = r3 | ((r2 & 255) << 8);
        this.mCount = readUInt8();
        this.mCancelType = readUInt8();
        this.mTeam = readUInt8();
        this.mPlayer = readUInt8();
        this.mOtherType = readUInt8();
        readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchLog2) == true) goto L8;
        return false;
    L8:
        BleMatchLog2 r6 = (BleMatchLog2) r5;
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
        if (this.mCancelType == r6.mCancelType) goto L27;
        return false;
    L27:
        if (this.mTeam == r6.mTeam) goto L30;
        return false;
    L30:
        if (this.mPlayer == r6.mPlayer) goto L33;
        return false;
    L33:
        if (this.mOtherType == r6.mOtherType) goto L36;
        return false;
    L36:
        if (this.mStopWatchTotal == r6.mStopWatchTotal) goto L38;
        return false;
    L38:
        return true;
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

    public final void setMCancelType(int r1) {
        this.mCancelType = r1;
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMOtherType(int r1) {
        this.mOtherType = r1;
    }

    public final void setMPeriodNumber(int r1) {
        this.mPeriodNumber = r1;
    }

    public final void setMPeriodTime(int r1) {
        this.mPeriodTime = r1;
    }

    public final void setMPlayer(int r1) {
        this.mPlayer = r1;
    }

    public final void setMStopWatchTotal(int r1) {
        this.mStopWatchTotal = r1;
    }

    public final void setMTeam(int r1) {
        this.mTeam = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchLog2(mTime=" + this.mTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + ", mTeam=" + this.mTeam + ", mPlayer=" + this.mPlayer + ", mOtherType=" + this.mOtherType + ", mStopWatchTotal=" + this.mStopWatchTotal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchLog2(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        this.mTime = r1;
        this.mPeriodTime = r2;
        this.mPeriodNumber = r3;
        this.mType = r4;
        this.mCount = r5;
        this.mCancelType = r6;
        this.mTeam = r7;
        this.mPlayer = r8;
        this.mOtherType = r9;
        this.mStopWatchTotal = r10;
    }

    public /* synthetic */ BleMatchLog2(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r12 & 512) == 0) goto L33;
        int r14 = 0;
    L32:
        int r15 = r10;
        int r16 = r9;
        int r17 = r8;
        int r18 = r7;
        int r19 = r6;
        int r20 = r5;
        int r21 = r4;
        this(r2, r3, r21, r20, r19, r18, r17, r16, r15, r14);
        return;
    L33:
        r14 = r11;
        goto L32
    }
}
