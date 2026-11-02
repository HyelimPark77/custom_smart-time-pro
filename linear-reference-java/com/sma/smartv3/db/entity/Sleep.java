package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleSleep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Sleep {

    @ColumnInfo
    private int mAlgorithmType;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mSoft;

    @ColumnInfo
    private int mStrong;

    @ColumnInfo
    private long mTime;

    public Sleep() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, 255, null);
    }

    public static /* synthetic */ Sleep copy$default(Sleep r0, int r1, long r2, String r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = r0.mMode;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = r0.mSoft;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = r0.mStrong;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = r0.mIsSync;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = r0.mAlgorithmType;
    L26:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        long r16 = r2;
        int r3 = r1;
        return r0.copy(r3, r16, r4, r5, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mId;
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
        return this.mSoft;
    }

    public final int component6() {
        return this.mStrong;
    }

    public final int component7() {
        return this.mIsSync;
    }

    public final int component8() {
        return this.mAlgorithmType;
    }

    @aa1
    public final Sleep copy(int r12, long r13, @aa1 String r15, int r16, int r17, int r18, int r19, int r20) {
        Intrinsics.X0O(r15, "mLocalTime");
        return new Sleep(r12, r13, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Sleep) == true) goto L8;
        return false;
    L8:
        Sleep r9 = (Sleep) r8;
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
        if (this.mSoft == r9.mSoft) goto L24;
        return false;
    L24:
        if (this.mStrong == r9.mStrong) goto L27;
        return false;
    L27:
        if (this.mIsSync == r9.mIsSync) goto L30;
        return false;
    L30:
        if (this.mAlgorithmType == r9.mAlgorithmType) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMAlgorithmType() {
        return this.mAlgorithmType;
    }

    public final int getMId() {
        return this.mId;
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

    public final int getMSoft() {
        return this.mSoft;
    }

    public final int getMStrong() {
        return this.mStrong;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mSoft)) * 31) + Integer.hashCode(this.mStrong)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mAlgorithmType);
    }

    public final void setMAlgorithmType(int r1) {
        this.mAlgorithmType = r1;
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

    public final void setMSoft(int r1) {
        this.mSoft = r1;
    }

    public final void setMStrong(int r1) {
        this.mStrong = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "Sleep(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mMode=" + this.mMode + ", mSoft=" + this.mSoft + ", mStrong=" + this.mStrong + ", mIsSync=" + this.mIsSync + ", mAlgorithmType=" + this.mAlgorithmType + I000IiI1O.iO.iO;
    }

    public Sleep(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, int r9, int r10) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mMode = r6;
        this.mSoft = r7;
        this.mStrong = r8;
        this.mIsSync = r9;
        this.mAlgorithmType = r10;
    }

    public /* synthetic */ Sleep(int r2, long r3, String r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        int r13 = 0;
    L26:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        this(r2, r3, r5, r6, r16, r15, r14, r13);
        return;
    L27:
        r13 = r10;
        goto L26
    }

    public Sleep(@aa1 BleSleep r17, long r18) {
        Intrinsics.X0O(r17, "bleSleep");
        int r5 = 0;
        String r8 = null;
        int r12 = 0;
        int r13 = 0;
        this(r5, (((long) (r17.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r18, r8, r17.getMMode(), r17.getMSoft(), r17.getMStrong(), r12, r13, 197, null);
    }
}
