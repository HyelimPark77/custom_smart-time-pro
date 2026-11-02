package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.BleMatchPeriod;
import com.szabh.smable3.entity.BleMatchPeriod2;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class MatchPeriod implements Serializable {

    @ColumnInfo
    private int mAvgBpm;

    @ColumnInfo
    private int mCalorie;

    @ColumnInfo
    private int mDistance;

    @ColumnInfo
    private int mDuration;

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
    private int mMaxBpm;

    @ColumnInfo
    private int mMaxSpeed;

    @ColumnInfo
    private int mSpeed;

    @ColumnInfo
    private int mStep;

    public MatchPeriod() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, bo0.iO, null);
    }

    public static /* synthetic */ MatchPeriod copy$default(MatchPeriod r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.mMatchRecordId;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.mDuration;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.mDistance;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.mStep;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.mCalorie;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.mSpeed;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.mAvgBpm;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.mMaxBpm;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.mMaxSpeed;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.mIsSync;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.mIsDelete;
    L38:
        int r15 = r11;
        int r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        int r20 = r5;
        int r21 = r6;
        int r22 = r3;
        int r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mMaxSpeed;
    }

    public final int component11() {
        return this.mIsSync;
    }

    public final int component12() {
        return this.mIsDelete;
    }

    public final int component2() {
        return this.mMatchRecordId;
    }

    public final int component3() {
        return this.mDuration;
    }

    public final int component4() {
        return this.mDistance;
    }

    public final int component5() {
        return this.mStep;
    }

    public final int component6() {
        return this.mCalorie;
    }

    public final int component7() {
        return this.mSpeed;
    }

    public final int component8() {
        return this.mAvgBpm;
    }

    public final int component9() {
        return this.mMaxBpm;
    }

    @aa1
    public final MatchPeriod copy(int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
        return new MatchPeriod(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MatchPeriod) == true) goto L8;
        return false;
    L8:
        MatchPeriod r6 = (MatchPeriod) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (this.mMatchRecordId == r6.mMatchRecordId) goto L15;
        return false;
    L15:
        if (this.mDuration == r6.mDuration) goto L18;
        return false;
    L18:
        if (this.mDistance == r6.mDistance) goto L21;
        return false;
    L21:
        if (this.mStep == r6.mStep) goto L24;
        return false;
    L24:
        if (this.mCalorie == r6.mCalorie) goto L27;
        return false;
    L27:
        if (this.mSpeed == r6.mSpeed) goto L30;
        return false;
    L30:
        if (this.mAvgBpm == r6.mAvgBpm) goto L33;
        return false;
    L33:
        if (this.mMaxBpm == r6.mMaxBpm) goto L36;
        return false;
    L36:
        if (this.mMaxSpeed == r6.mMaxSpeed) goto L39;
        return false;
    L39:
        if (this.mIsSync == r6.mIsSync) goto L42;
        return false;
    L42:
        if (this.mIsDelete == r6.mIsDelete) goto L44;
        return false;
    L44:
        return true;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
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

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxSpeed() {
        return this.mMaxSpeed;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mMatchRecordId)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
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

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMaxSpeed(int r1) {
        this.mMaxSpeed = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    @aa1
    public String toString() {
        return "MatchPeriod(mId=" + this.mId + ", mMatchRecordId=" + this.mMatchRecordId + ", mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMaxSpeed=" + this.mMaxSpeed + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.iO.iO;
    }

    public MatchPeriod(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        this.mId = r1;
        this.mMatchRecordId = r2;
        this.mDuration = r3;
        this.mDistance = r4;
        this.mStep = r5;
        this.mCalorie = r6;
        this.mSpeed = r7;
        this.mAvgBpm = r8;
        this.mMaxBpm = r9;
        this.mMaxSpeed = r10;
        this.mIsSync = r11;
        this.mIsDelete = r12;
    }

    public /* synthetic */ MatchPeriod(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = 0;
    L36:
        if ((r14 & 2048) == 0) goto L39;
        int r16 = 0;
    L38:
        int r17 = r12;
        int r18 = r11;
        int r19 = r10;
        int r110 = r9;
        int r20 = r8;
        int r21 = r7;
        int r22 = r6;
        int r23 = r5;
        int r24 = r4;
        this(r2, r3, r24, r23, r22, r21, r20, r110, r19, r18, r17, r16);
        return;
    L39:
        r16 = r13;
        goto L38
    }

    public MatchPeriod(@aa1 BleMatchPeriod r17, long r18) {
        Intrinsics.X0O(r17, "bleMatchPeriod");
        int r2 = 0;
        int r3 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        this(r2, r3, r17.getMDuration(), r17.getMDistance(), r17.getMStep(), r17.getMCalorie(), r17.getMSpeed(), r17.getMAvgBpm(), r17.getMMaxBpm(), r11, r12, r13, 3587, null);
    }

    public MatchPeriod(@aa1 BleMatchPeriod2 r17, long r18) {
        Intrinsics.X0O(r17, "bleMatchPeriod");
        int r2 = 0;
        int r3 = 0;
        int r12 = 0;
        int r13 = 0;
        this(r2, r3, r17.getMDuration(), r17.getMDistance(), r17.getMStep(), r17.getMCalorie(), r17.getMSpeed(), r17.getMAvgBpm(), r17.getMMaxBpm(), r17.getMMaxSpeed(), r12, r13, 3075, null);
    }
}
