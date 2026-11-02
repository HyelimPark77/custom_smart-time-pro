package com.sma.smartv3.db.entity;

import androidx.compose.ui.layout.LayoutKt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class SportData implements Serializable {

    @ColumnInfo
    private int mAirPressure;

    @ColumnInfo
    private int mAltitude;

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

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mPace;

    @ColumnInfo
    private int mSpeed;

    @ColumnInfo
    private int mSpm;

    @ColumnInfo
    private int mStep;

    @ColumnInfo
    private long mTime;

    public SportData() {
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
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, LayoutKt.LargeDimension, null);
    }

    public static /* synthetic */ SportData copy$default(SportData r16, int r17, long r18, String r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, Object r34) {
        if ((r33 & 1) == 0) goto L5;
        int r2 = r16.mId;
    L7:
        if ((r33 & 2) == 0) goto L9;
        long r3 = r16.mTime;
    L11:
        if ((r33 & 4) == 0) goto L13;
        String r5 = r16.mLocalTime;
    L15:
        if ((r33 & 8) == 0) goto L17;
        int r6 = r16.mStep;
    L19:
        if ((r33 & 16) == 0) goto L21;
        int r7 = r16.mDistance;
    L23:
        if ((r33 & 32) == 0) goto L25;
        int r8 = r16.mCalorie;
    L27:
        if ((r33 & 64) == 0) goto L29;
        int r9 = r16.mDuration;
    L31:
        if ((r33 & 128) == 0) goto L33;
        int r10 = r16.mSpm;
    L35:
        if ((r33 & 256) == 0) goto L37;
        int r11 = r16.mAltitude;
    L39:
        if ((r33 & 512) == 0) goto L41;
        int r12 = r16.mAirPressure;
    L43:
        if ((r33 & 1024) == 0) goto L45;
        int r13 = r16.mPace;
    L47:
        if ((r33 & 2048) == 0) goto L49;
        int r14 = r16.mSpeed;
    L51:
        if ((r33 & 4096) == 0) goto L53;
        int r15 = r16.mMode;
    L54:
        int r19 = r2;
        if ((r33 & 8192) == 0) goto L57;
        int r4 = r16.mIsSync;
    L59:
        if ((r33 & 16384) == 0) goto L62;
        int r35 = r16.mIsDelete;
    L64:
        return r16.copy(r19, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r35);
    L62:
        r35 = r32;
        goto L64
    L57:
        r4 = r31;
        goto L59
    L53:
        r15 = r30;
        goto L54
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r8 = r23;
        goto L27
    L21:
        r7 = r22;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r5 = r20;
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
        return this.mAirPressure;
    }

    public final int component11() {
        return this.mPace;
    }

    public final int component12() {
        return this.mSpeed;
    }

    public final int component13() {
        return this.mMode;
    }

    public final int component14() {
        return this.mIsSync;
    }

    public final int component15() {
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
        return this.mStep;
    }

    public final int component5() {
        return this.mDistance;
    }

    public final int component6() {
        return this.mCalorie;
    }

    public final int component7() {
        return this.mDuration;
    }

    public final int component8() {
        return this.mSpm;
    }

    public final int component9() {
        return this.mAltitude;
    }

    @aa1
    public final SportData copy(int r19, long r20, @aa1 String r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34) {
        Intrinsics.X0O(r22, "mLocalTime");
        return new SportData(r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SportData) == true) goto L8;
        return false;
    L8:
        SportData r9 = (SportData) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mStep == r9.mStep) goto L21;
        return false;
    L21:
        if (this.mDistance == r9.mDistance) goto L24;
        return false;
    L24:
        if (this.mCalorie == r9.mCalorie) goto L27;
        return false;
    L27:
        if (this.mDuration == r9.mDuration) goto L30;
        return false;
    L30:
        if (this.mSpm == r9.mSpm) goto L33;
        return false;
    L33:
        if (this.mAltitude == r9.mAltitude) goto L36;
        return false;
    L36:
        if (this.mAirPressure == r9.mAirPressure) goto L39;
        return false;
    L39:
        if (this.mPace == r9.mPace) goto L42;
        return false;
    L42:
        if (this.mSpeed == r9.mSpeed) goto L45;
        return false;
    L45:
        if (this.mMode == r9.mMode) goto L48;
        return false;
    L48:
        if (this.mIsSync == r9.mIsSync) goto L51;
        return false;
    L51:
        if (this.mIsDelete == r9.mIsDelete) goto L53;
        return false;
    L53:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
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

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
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

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "SportData(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mDuration=" + this.mDuration + ", mSpm=" + this.mSpm + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mPace=" + this.mPace + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.iO.iO;
    }

    public SportData(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mStep = r6;
        this.mDistance = r7;
        this.mCalorie = r8;
        this.mDuration = r9;
        this.mSpm = r10;
        this.mAltitude = r11;
        this.mAirPressure = r12;
        this.mPace = r13;
        this.mSpeed = r14;
        this.mMode = r15;
        this.mIsSync = r16;
        this.mIsDelete = r17;
    }

    public /* synthetic */ SportData(int r17, long r18, String r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, DefaultConstructorMarker r34) {
        if ((r33 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r33 & 2) == 0) goto L9;
        long r3 = 0;
    L11:
        if ((r33 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r33 & 8) == 0) goto L17;
        int r6 = 0;
    L19:
        if ((r33 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r33 & 32) == 0) goto L25;
        int r8 = 0;
    L27:
        if ((r33 & 64) == 0) goto L29;
        int r9 = 0;
    L31:
        if ((r33 & 128) == 0) goto L33;
        int r10 = 0;
    L35:
        if ((r33 & 256) == 0) goto L37;
        int r11 = 0;
    L39:
        if ((r33 & 512) == 0) goto L41;
        int r12 = 0;
    L43:
        if ((r33 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r33 & 2048) == 0) goto L49;
        int r14 = 0;
    L51:
        if ((r33 & 4096) == 0) goto L53;
        int r15 = 0;
    L55:
        if ((r33 & 8192) == 0) goto L57;
        int r2 = 0;
    L59:
        if ((r33 & 16384) == 0) goto L62;
        int r35 = 0;
    L63:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r35);
        return;
    L62:
        r35 = r32;
        goto L63
    L57:
        r2 = r31;
        goto L59
    L53:
        r15 = r30;
        goto L55
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r8 = r23;
        goto L27
    L21:
        r7 = r22;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r5 = r20;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
