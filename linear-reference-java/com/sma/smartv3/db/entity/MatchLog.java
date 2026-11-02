package com.sma.smartv3.db.entity;

import androidx.compose.ui.layout.LayoutKt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.BleMatchLog;
import com.szabh.smable3.entity.BleMatchLog2;
import com.szabh.smable3.entity.BleMatchLog3;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class MatchLog implements Serializable {

    @ColumnInfo
    private int mCancelType;

    @ColumnInfo
    private int mCount;

    @ColumnInfo
    private int mCountingTime;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private int mMatchRecordId;

    @ColumnInfo
    private int mOtherType;

    @ColumnInfo
    private int mPeriodNumber;

    @ColumnInfo
    private int mPeriodTime;

    @ColumnInfo
    private int mPlayer;

    @ColumnInfo
    private int mStopWatchTotal;

    @ColumnInfo
    private int mTeam;

    @ColumnInfo
    private int mTime;

    @ColumnInfo
    private int mType;

    public MatchLog() {
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
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, LayoutKt.LargeDimension, null);
    }

    public static /* synthetic */ MatchLog copy$default(MatchLog r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        int r2 = r16.mId;
    L7:
        if ((r32 & 2) == 0) goto L9;
        int r3 = r16.mMatchRecordId;
    L11:
        if ((r32 & 4) == 0) goto L13;
        int r4 = r16.mTime;
    L15:
        if ((r32 & 8) == 0) goto L17;
        int r5 = r16.mCountingTime;
    L19:
        if ((r32 & 16) == 0) goto L21;
        int r6 = r16.mPeriodTime;
    L23:
        if ((r32 & 32) == 0) goto L25;
        int r7 = r16.mPeriodNumber;
    L27:
        if ((r32 & 64) == 0) goto L29;
        int r8 = r16.mType;
    L31:
        if ((r32 & 128) == 0) goto L33;
        int r9 = r16.mCount;
    L35:
        if ((r32 & 256) == 0) goto L37;
        int r10 = r16.mCancelType;
    L39:
        if ((r32 & 512) == 0) goto L41;
        int r11 = r16.mTeam;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        int r12 = r16.mPlayer;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        int r13 = r16.mOtherType;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        int r14 = r16.mStopWatchTotal;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        int r15 = r16.mIsSync;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        int r34 = r16.mIsDelete;
    L64:
        return r16.copy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r34);
    L62:
        r34 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mTeam;
    }

    public final int component11() {
        return this.mPlayer;
    }

    public final int component12() {
        return this.mOtherType;
    }

    public final int component13() {
        return this.mStopWatchTotal;
    }

    public final int component14() {
        return this.mIsSync;
    }

    public final int component15() {
        return this.mIsDelete;
    }

    public final int component2() {
        return this.mMatchRecordId;
    }

    public final int component3() {
        return this.mTime;
    }

    public final int component4() {
        return this.mCountingTime;
    }

    public final int component5() {
        return this.mPeriodTime;
    }

    public final int component6() {
        return this.mPeriodNumber;
    }

    public final int component7() {
        return this.mType;
    }

    public final int component8() {
        return this.mCount;
    }

    public final int component9() {
        return this.mCancelType;
    }

    @aa1
    public final MatchLog copy(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31) {
        return new MatchLog(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MatchLog) == true) goto L8;
        return false;
    L8:
        MatchLog r6 = (MatchLog) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (this.mMatchRecordId == r6.mMatchRecordId) goto L15;
        return false;
    L15:
        if (this.mTime == r6.mTime) goto L18;
        return false;
    L18:
        if (this.mCountingTime == r6.mCountingTime) goto L21;
        return false;
    L21:
        if (this.mPeriodTime == r6.mPeriodTime) goto L24;
        return false;
    L24:
        if (this.mPeriodNumber == r6.mPeriodNumber) goto L27;
        return false;
    L27:
        if (this.mType == r6.mType) goto L30;
        return false;
    L30:
        if (this.mCount == r6.mCount) goto L33;
        return false;
    L33:
        if (this.mCancelType == r6.mCancelType) goto L36;
        return false;
    L36:
        if (this.mTeam == r6.mTeam) goto L39;
        return false;
    L39:
        if (this.mPlayer == r6.mPlayer) goto L42;
        return false;
    L42:
        if (this.mOtherType == r6.mOtherType) goto L45;
        return false;
    L45:
        if (this.mStopWatchTotal == r6.mStopWatchTotal) goto L48;
        return false;
    L48:
        if (this.mIsSync == r6.mIsSync) goto L51;
        return false;
    L51:
        if (this.mIsDelete == r6.mIsDelete) goto L53;
        return false;
    L53:
        return true;
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

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final int getMMatchRecordId() {
        return this.mMatchRecordId;
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
        return (((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mMatchRecordId)) * 31) + Integer.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mCountingTime)) * 31) + Integer.hashCode(this.mPeriodTime)) * 31) + Integer.hashCode(this.mPeriodNumber)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mCancelType)) * 31) + Integer.hashCode(this.mTeam)) * 31) + Integer.hashCode(this.mPlayer)) * 31) + Integer.hashCode(this.mOtherType)) * 31) + Integer.hashCode(this.mStopWatchTotal)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMCancelType(int r1) {
        this.mCancelType = r1;
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMCountingTime(int r1) {
        this.mCountingTime = r1;
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMMatchRecordId(int r1) {
        this.mMatchRecordId = r1;
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
        return "MatchLog(mId=" + this.mId + ", mMatchRecordId=" + this.mMatchRecordId + ", mTime=" + this.mTime + ", mCountingTime=" + this.mCountingTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + ", mTeam=" + this.mTeam + ", mPlayer=" + this.mPlayer + ", mOtherType=" + this.mOtherType + ", mStopWatchTotal=" + this.mStopWatchTotal + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.iO.iO;
    }

    public MatchLog(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        this.mId = r1;
        this.mMatchRecordId = r2;
        this.mTime = r3;
        this.mCountingTime = r4;
        this.mPeriodTime = r5;
        this.mPeriodNumber = r6;
        this.mType = r7;
        this.mCount = r8;
        this.mCancelType = r9;
        this.mTeam = r10;
        this.mPlayer = r11;
        this.mOtherType = r12;
        this.mStopWatchTotal = r13;
        this.mIsSync = r14;
        this.mIsDelete = r15;
    }

    public /* synthetic */ MatchLog(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, DefaultConstructorMarker r33) {
        if ((r32 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r32 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r32 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r32 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r32 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r32 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r32 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r32 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r32 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r32 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        int r34 = 0;
    L63:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r34);
        return;
    L62:
        r34 = r31;
        goto L63
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }

    public MatchLog(@aa1 BleMatchLog r20, long r21) {
        Intrinsics.X0O(r20, "bleMatchLog");
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        this(r2, r3, r20.getMTime(), r5, r20.getMPeriodTime(), r20.getMPeriodNumber(), r20.getMType(), r20.getMCount(), r20.getMCancelType(), r11, r12, r13, r14, r15, r16, 32267, null);
    }

    public MatchLog(@aa1 BleMatchLog2 r20, long r21) {
        Intrinsics.X0O(r20, "bleMatchLog");
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r15 = 0;
        int r16 = 0;
        this(r2, r3, r20.getMTime(), r5, r20.getMPeriodTime(), r20.getMPeriodNumber(), r20.getMType(), r20.getMCount(), r20.getMCancelType(), r20.getMTeam(), r20.getMPlayer(), r20.getMOtherType(), r20.getMStopWatchTotal(), r15, r16, 24587, null);
    }

    public MatchLog(@aa1 BleMatchLog3 r20, long r21) {
        Intrinsics.X0O(r20, "bleMatchLog");
        int r2 = 0;
        int r3 = 0;
        int r15 = 0;
        int r16 = 0;
        this(r2, r3, r20.getMTime(), r20.getMCountingTime(), r20.getMPeriodTime(), r20.getMPeriodNumber(), r20.getMType(), r20.getMCount(), r20.getMCancelType(), r20.getMTeam(), r20.getMPlayer(), r20.getMOtherType(), r20.getMStopWatchTotal(), r15, r16, 24579, null);
    }
}
