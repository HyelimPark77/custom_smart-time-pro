package com.sma.smartv3.p608db.entity;

import androidx.compose.p554ui.layout.LayoutKt;
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
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
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
    public final MatchLog copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new MatchLog(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchLog)) {
            return false;
        }
        MatchLog matchLog = (MatchLog) obj;
        return this.mId == matchLog.mId && this.mMatchRecordId == matchLog.mMatchRecordId && this.mTime == matchLog.mTime && this.mCountingTime == matchLog.mCountingTime && this.mPeriodTime == matchLog.mPeriodTime && this.mPeriodNumber == matchLog.mPeriodNumber && this.mType == matchLog.mType && this.mCount == matchLog.mCount && this.mCancelType == matchLog.mCancelType && this.mTeam == matchLog.mTeam && this.mPlayer == matchLog.mPlayer && this.mOtherType == matchLog.mOtherType && this.mStopWatchTotal == matchLog.mStopWatchTotal && this.mIsSync == matchLog.mIsSync && this.mIsDelete == matchLog.mIsDelete;
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

    public final void setMCancelType(int i) {
        this.mCancelType = i;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMCountingTime(int i) {
        this.mCountingTime = i;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMMatchRecordId(int i) {
        this.mMatchRecordId = i;
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
        return "MatchLog(mId=" + this.mId + ", mMatchRecordId=" + this.mMatchRecordId + ", mTime=" + this.mTime + ", mCountingTime=" + this.mCountingTime + ", mPeriodTime=" + this.mPeriodTime + ", mPeriodNumber=" + this.mPeriodNumber + ", mType=" + this.mType + ", mCount=" + this.mCount + ", mCancelType=" + this.mCancelType + ", mTeam=" + this.mTeam + ", mPlayer=" + this.mPlayer + ", mOtherType=" + this.mOtherType + ", mStopWatchTotal=" + this.mStopWatchTotal + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.C2156iO.f1007iO;
    }

    public MatchLog(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.mId = i;
        this.mMatchRecordId = i2;
        this.mTime = i3;
        this.mCountingTime = i4;
        this.mPeriodTime = i5;
        this.mPeriodNumber = i6;
        this.mType = i7;
        this.mCount = i8;
        this.mCancelType = i9;
        this.mTeam = i10;
        this.mPlayer = i11;
        this.mOtherType = i12;
        this.mStopWatchTotal = i13;
        this.mIsSync = i14;
        this.mIsDelete = i15;
    }

    public /* synthetic */ MatchLog(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i, (i16 & 2) != 0 ? 0 : i2, (i16 & 4) != 0 ? 0 : i3, (i16 & 8) != 0 ? 0 : i4, (i16 & 16) != 0 ? 0 : i5, (i16 & 32) != 0 ? 0 : i6, (i16 & 64) != 0 ? 0 : i7, (i16 & 128) != 0 ? 0 : i8, (i16 & 256) != 0 ? 0 : i9, (i16 & 512) != 0 ? 0 : i10, (i16 & 1024) != 0 ? 0 : i11, (i16 & 2048) != 0 ? 0 : i12, (i16 & 4096) != 0 ? 0 : i13, (i16 & 8192) != 0 ? 0 : i14, (i16 & 16384) != 0 ? 0 : i15);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchLog(@aa1 BleMatchLog bleMatchLog, long j) {
        this(0, 0, bleMatchLog.getMTime(), 0, bleMatchLog.getMPeriodTime(), bleMatchLog.getMPeriodNumber(), bleMatchLog.getMType(), bleMatchLog.getMCount(), bleMatchLog.getMCancelType(), 0, 0, 0, 0, 0, 0, 32267, null);
        Intrinsics.X0O(bleMatchLog, "bleMatchLog");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchLog(@aa1 BleMatchLog2 bleMatchLog, long j) {
        this(0, 0, bleMatchLog.getMTime(), 0, bleMatchLog.getMPeriodTime(), bleMatchLog.getMPeriodNumber(), bleMatchLog.getMType(), bleMatchLog.getMCount(), bleMatchLog.getMCancelType(), bleMatchLog.getMTeam(), bleMatchLog.getMPlayer(), bleMatchLog.getMOtherType(), bleMatchLog.getMStopWatchTotal(), 0, 0, 24587, null);
        Intrinsics.X0O(bleMatchLog, "bleMatchLog");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchLog(@aa1 BleMatchLog3 bleMatchLog, long j) {
        this(0, 0, bleMatchLog.getMTime(), bleMatchLog.getMCountingTime(), bleMatchLog.getMPeriodTime(), bleMatchLog.getMPeriodNumber(), bleMatchLog.getMType(), bleMatchLog.getMCount(), bleMatchLog.getMCancelType(), bleMatchLog.getMTeam(), bleMatchLog.getMPlayer(), bleMatchLog.getMOtherType(), bleMatchLog.getMStopWatchTotal(), 0, 0, 24579, null);
        Intrinsics.X0O(bleMatchLog, "bleMatchLog");
    }
}
