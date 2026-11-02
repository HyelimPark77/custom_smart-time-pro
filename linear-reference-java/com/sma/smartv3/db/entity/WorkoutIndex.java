package com.sma.smartv3.db.entity;

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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public WorkoutIndex() {
        int r1 = 0;
        int r2 = 0;
        long r3 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r5, r6, 31, null);
    }

    public static /* synthetic */ WorkoutIndex copy$default(WorkoutIndex r0, int r1, int r2, long r3, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mFrom;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mEndTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.mMode;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.mSyncStatus;
    L17:
        long r9 = r3;
        int r4 = r1;
        int r10 = r2;
        return r0.copy(r4, r10, r9, r5, r6);
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
    public final WorkoutIndex copy(int r8, int r9, long r10, int r12, int r13) {
        return new WorkoutIndex(r8, r9, r10, r12, r13);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WorkoutIndex) == true) goto L8;
        return false;
    L8:
        WorkoutIndex r9 = (WorkoutIndex) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mFrom == r9.mFrom) goto L15;
        return false;
    L15:
        if (this.mEndTime == r9.mEndTime) goto L18;
        return false;
    L18:
        if (this.mMode == r9.mMode) goto L21;
        return false;
    L21:
        if (this.mSyncStatus == r9.mSyncStatus) goto L23;
        return false;
    L23:
        return true;
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

    public final void setMEndTime(long r1) {
        this.mEndTime = r1;
    }

    public final void setMFrom(int r1) {
        this.mFrom = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMSyncStatus(int r1) {
        this.mSyncStatus = r1;
    }

    @aa1
    public String toString() {
        return "WorkoutIndex(mId=" + this.mId + ", mFrom=" + this.mFrom + ", mEndTime=" + this.mEndTime + ", mMode=" + this.mMode + ", mSyncStatus=" + this.mSyncStatus + I000IiI1O.iO.iO;
    }

    public WorkoutIndex(int r1, int r2, long r3, int r5, int r6) {
        this.mId = r1;
        this.mFrom = r2;
        this.mEndTime = r3;
        this.mMode = r5;
        this.mSyncStatus = r6;
    }

    public /* synthetic */ WorkoutIndex(int r2, int r3, long r4, int r6, int r7, int r8, DefaultConstructorMarker r9) {
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
        r6 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        int r10 = 0;
    L17:
        long r5 = r4;
        this(r2, r3, r5, r6, r10);
        return;
    L18:
        r10 = r7;
        goto L17
    }
}
