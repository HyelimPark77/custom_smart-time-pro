package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mEndTime"}), @Index({"mSyncStatus"})})
public final class WorkoutIndex {
    public static final int ALL_SYNCED = 1;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int FITBIT_SYNCED = 2;
    public static final int FROM_ACTIVITY = 1;
    public static final int FROM_WORKOUT = 2;
    public static final int STRAVA_SYNCED = 1;

    @ColumnInfo
    private long mEndTime;

    @ColumnInfo
    private int mFrom;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mSyncStatus;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WorkoutIndex() {
        this(0, 0, 0L, 0, 0, 31, null);
    }

    public static /* synthetic */ WorkoutIndex copy$default(WorkoutIndex workoutIndex, int i, int i2, long j, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = workoutIndex.mId;
        }
        if ((i5 & 2) != 0) {
            i2 = workoutIndex.mFrom;
        }
        if ((i5 & 4) != 0) {
            j = workoutIndex.mEndTime;
        }
        if ((i5 & 8) != 0) {
            i3 = workoutIndex.mMode;
        }
        if ((i5 & 16) != 0) {
            i4 = workoutIndex.mSyncStatus;
        }
        long j2 = j;
        return workoutIndex.copy(i, i2, j2, i3, i4);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component2() {
        return this.mFrom;
    }

    public final long component3() {
        return this.mEndTime;
    }

    public final int component4() {
        return this.mMode;
    }

    public final int component5() {
        return this.mSyncStatus;
    }

    @aa1
    public final WorkoutIndex copy(int i, int i2, long j, int i3, int i4) {
        return new WorkoutIndex(i, i2, j, i3, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkoutIndex)) {
            return false;
        }
        WorkoutIndex workoutIndex = (WorkoutIndex) obj;
        return this.mId == workoutIndex.mId && this.mFrom == workoutIndex.mFrom && this.mEndTime == workoutIndex.mEndTime && this.mMode == workoutIndex.mMode && this.mSyncStatus == workoutIndex.mSyncStatus;
    }

    public final long getMEndTime() {
        return this.mEndTime;
    }

    public final int getMFrom() {
        return this.mFrom;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMSyncStatus() {
        return this.mSyncStatus;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mFrom)) * 31) + Long.hashCode(this.mEndTime)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mSyncStatus);
    }

    public final void setMEndTime(long j) {
        this.mEndTime = j;
    }

    public final void setMFrom(int i) {
        this.mFrom = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMSyncStatus(int i) {
        this.mSyncStatus = i;
    }

    @aa1
    public String toString() {
        return "WorkoutIndex(mId=" + this.mId + ", mFrom=" + this.mFrom + ", mEndTime=" + this.mEndTime + ", mMode=" + this.mMode + ", mSyncStatus=" + this.mSyncStatus + I000IiI1O.C2156iO.f1007iO;
    }

    public WorkoutIndex(int i, int i2, long j, int i3, int i4) {
        this.mId = i;
        this.mFrom = i2;
        this.mEndTime = j;
        this.mMode = i3;
        this.mSyncStatus = i4;
    }

    public /* synthetic */ WorkoutIndex(int i, int i2, long j, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
