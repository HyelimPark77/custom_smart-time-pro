package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Activity {

    @ColumnInfo
    private int mCalorie;

    @ColumnInfo
    private int mDistance;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mState;

    @ColumnInfo
    private int mStep;

    @ColumnInfo
    private long mTime;

    public Activity() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    public static /* synthetic */ Activity copy$default(Activity r0, int r1, long r2, String r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = r0.mMode;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r0.mState;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r0.mStep;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r0.mCalorie;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = r0.mDistance;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r0.mIsSync;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r0.mIsDelete;
    L32:
        int r14 = r10;
        int r15 = r11;
        int r16 = r8;
        int r17 = r9;
        int r18 = r6;
        int r19 = r7;
        long r20 = r2;
        int r3 = r1;
        return r0.copy(r3, r20, r4, r5, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mIsDelete;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mMode;
    }

    public final int component5() {
        return this.mState;
    }

    public final int component6() {
        return this.mStep;
    }

    public final int component7() {
        return this.mCalorie;
    }

    public final int component8() {
        return this.mDistance;
    }

    public final int component9() {
        return this.mIsSync;
    }

    @aa1
    public final Activity copy(int r14, long r15, @aa1 String r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        Intrinsics.X0O(r17, "mLocalTime");
        return new Activity(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Activity) == true) goto L8;
        return false;
    L8:
        Activity r9 = (Activity) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mMode == r9.mMode) goto L21;
        return false;
    L21:
        if (this.mState == r9.mState) goto L24;
        return false;
    L24:
        if (this.mStep == r9.mStep) goto L27;
        return false;
    L27:
        if (this.mCalorie == r9.mCalorie) goto L30;
        return false;
    L30:
        if (this.mDistance == r9.mDistance) goto L33;
        return false;
    L33:
        if (this.mIsSync == r9.mIsSync) goto L36;
        return false;
    L36:
        if (this.mIsDelete == r9.mIsDelete) goto L38;
        return false;
    L38:
        return true;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
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

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "Activity(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mMode=" + this.mMode + ", mState=" + this.mState + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.iO.iO;
    }

    public Activity(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mMode = r6;
        this.mState = r7;
        this.mStep = r8;
        this.mCalorie = r9;
        this.mDistance = r10;
        this.mIsSync = r11;
        this.mIsDelete = r12;
    }

    public /* synthetic */ Activity(int r2, long r3, String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = 0;
    L30:
        if ((r13 & 512) == 0) goto L33;
        int r15 = 0;
    L32:
        int r16 = r11;
        int r17 = r10;
        int r18 = r9;
        int r19 = r8;
        int r20 = r7;
        this(r2, r3, r5, r6, r20, r19, r18, r17, r16, r15);
        return;
    L33:
        r15 = r12;
        goto L32
    }

    public Activity(@aa1 BleActivity r21, long r22) {
        Intrinsics.X0O(r21, "bleActivity");
        int r7 = 0;
        String r10 = null;
        int r16 = 0;
        int r17 = 0;
        this(r7, (((((long) (r21.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r22) + ((long) r21.getMState())) + 1, r10, r21.getMMode(), r21.getMState(), r21.getMStep(), r21.getMCalorie(), r21.getMDistance(), r16, r17, 773, null);
    }
}
