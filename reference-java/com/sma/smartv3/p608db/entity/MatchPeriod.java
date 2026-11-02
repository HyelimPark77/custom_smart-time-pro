package com.sma.smartv3.p608db.entity;

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
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.f5772iO, null);
    }

    public static /* synthetic */ MatchPeriod copy$default(MatchPeriod matchPeriod, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = matchPeriod.mId;
        }
        if ((i13 & 2) != 0) {
            i2 = matchPeriod.mMatchRecordId;
        }
        if ((i13 & 4) != 0) {
            i3 = matchPeriod.mDuration;
        }
        if ((i13 & 8) != 0) {
            i4 = matchPeriod.mDistance;
        }
        if ((i13 & 16) != 0) {
            i5 = matchPeriod.mStep;
        }
        if ((i13 & 32) != 0) {
            i6 = matchPeriod.mCalorie;
        }
        if ((i13 & 64) != 0) {
            i7 = matchPeriod.mSpeed;
        }
        if ((i13 & 128) != 0) {
            i8 = matchPeriod.mAvgBpm;
        }
        if ((i13 & 256) != 0) {
            i9 = matchPeriod.mMaxBpm;
        }
        if ((i13 & 512) != 0) {
            i10 = matchPeriod.mMaxSpeed;
        }
        if ((i13 & 1024) != 0) {
            i11 = matchPeriod.mIsSync;
        }
        if ((i13 & 2048) != 0) {
            i12 = matchPeriod.mIsDelete;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i9;
        int i17 = i10;
        int i18 = i7;
        int i19 = i8;
        int i20 = i5;
        int i21 = i6;
        return matchPeriod.copy(i, i2, i3, i4, i20, i21, i18, i19, i16, i17, i14, i15);
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
    public final MatchPeriod copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        return new MatchPeriod(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchPeriod)) {
            return false;
        }
        MatchPeriod matchPeriod = (MatchPeriod) obj;
        return this.mId == matchPeriod.mId && this.mMatchRecordId == matchPeriod.mMatchRecordId && this.mDuration == matchPeriod.mDuration && this.mDistance == matchPeriod.mDistance && this.mStep == matchPeriod.mStep && this.mCalorie == matchPeriod.mCalorie && this.mSpeed == matchPeriod.mSpeed && this.mAvgBpm == matchPeriod.mAvgBpm && this.mMaxBpm == matchPeriod.mMaxBpm && this.mMaxSpeed == matchPeriod.mMaxSpeed && this.mIsSync == matchPeriod.mIsSync && this.mIsDelete == matchPeriod.mIsDelete;
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

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
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

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMMaxSpeed(int i) {
        this.mMaxSpeed = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    @aa1
    public String toString() {
        return "MatchPeriod(mId=" + this.mId + ", mMatchRecordId=" + this.mMatchRecordId + ", mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMaxSpeed=" + this.mMaxSpeed + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.C2156iO.f1007iO;
    }

    public MatchPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.mId = i;
        this.mMatchRecordId = i2;
        this.mDuration = i3;
        this.mDistance = i4;
        this.mStep = i5;
        this.mCalorie = i6;
        this.mSpeed = i7;
        this.mAvgBpm = i8;
        this.mMaxBpm = i9;
        this.mMaxSpeed = i10;
        this.mIsSync = i11;
        this.mIsDelete = i12;
    }

    public /* synthetic */ MatchPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? 0 : i3, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? 0 : i5, (i13 & 32) != 0 ? 0 : i6, (i13 & 64) != 0 ? 0 : i7, (i13 & 128) != 0 ? 0 : i8, (i13 & 256) != 0 ? 0 : i9, (i13 & 512) != 0 ? 0 : i10, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchPeriod(@aa1 BleMatchPeriod bleMatchPeriod, long j) {
        this(0, 0, bleMatchPeriod.getMDuration(), bleMatchPeriod.getMDistance(), bleMatchPeriod.getMStep(), bleMatchPeriod.getMCalorie(), bleMatchPeriod.getMSpeed(), bleMatchPeriod.getMAvgBpm(), bleMatchPeriod.getMMaxBpm(), 0, 0, 0, 3587, null);
        Intrinsics.X0O(bleMatchPeriod, "bleMatchPeriod");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchPeriod(@aa1 BleMatchPeriod2 bleMatchPeriod, long j) {
        this(0, 0, bleMatchPeriod.getMDuration(), bleMatchPeriod.getMDistance(), bleMatchPeriod.getMStep(), bleMatchPeriod.getMCalorie(), bleMatchPeriod.getMSpeed(), bleMatchPeriod.getMAvgBpm(), bleMatchPeriod.getMMaxBpm(), bleMatchPeriod.getMMaxSpeed(), 0, 0, 3075, null);
        Intrinsics.X0O(bleMatchPeriod, "bleMatchPeriod");
    }
}
