package com.sma.smartv3.db.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleVitality;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Vitality {
    private int mAllVitality;
    private int mHighIntensityTime;
    private int mHighIntensityValue;

    @PrimaryKey(autoGenerate = true)
    private final int mId;
    private int mIsSync;

    @aa1
    private String mLocalTime;
    private int mLowIntensityTime;
    private int mLowIntensityValue;
    private int mMediumIntensityTime;
    private int mMediumIntensityValue;
    private long mTime;

    public Vitality() {
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
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, 2047, null);
    }

    public static /* synthetic */ Vitality copy$default(Vitality r0, int r1, long r2, String r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = r0.mAllVitality;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = r0.mLowIntensityTime;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = r0.mLowIntensityValue;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = r0.mMediumIntensityTime;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = r0.mMediumIntensityValue;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = r0.mHighIntensityTime;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = r0.mHighIntensityValue;
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = r0.mIsSync;
    L35:
        int r15 = r11;
        int r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        int r20 = r6;
        String r21 = r4;
        long r22 = r2;
        int r3 = r1;
        return r0.copy(r3, r22, r21, r5, r20, r19, r110, r17, r18, r15, r16);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mHighIntensityValue;
    }

    public final int component11() {
        return this.mIsSync;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mAllVitality;
    }

    public final int component5() {
        return this.mLowIntensityTime;
    }

    public final int component6() {
        return this.mLowIntensityValue;
    }

    public final int component7() {
        return this.mMediumIntensityTime;
    }

    public final int component8() {
        return this.mMediumIntensityValue;
    }

    public final int component9() {
        return this.mHighIntensityTime;
    }

    @aa1
    public final Vitality copy(int r15, long r16, @aa1 String r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        Intrinsics.X0O(r18, "mLocalTime");
        return new Vitality(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Vitality) == true) goto L8;
        return false;
    L8:
        Vitality r9 = (Vitality) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mAllVitality == r9.mAllVitality) goto L21;
        return false;
    L21:
        if (this.mLowIntensityTime == r9.mLowIntensityTime) goto L24;
        return false;
    L24:
        if (this.mLowIntensityValue == r9.mLowIntensityValue) goto L27;
        return false;
    L27:
        if (this.mMediumIntensityTime == r9.mMediumIntensityTime) goto L30;
        return false;
    L30:
        if (this.mMediumIntensityValue == r9.mMediumIntensityValue) goto L33;
        return false;
    L33:
        if (this.mHighIntensityTime == r9.mHighIntensityTime) goto L36;
        return false;
    L36:
        if (this.mHighIntensityValue == r9.mHighIntensityValue) goto L39;
        return false;
    L39:
        if (this.mIsSync == r9.mIsSync) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMAllVitality() {
        return this.mAllVitality;
    }

    public final int getMHighIntensityTime() {
        return this.mHighIntensityTime;
    }

    public final int getMHighIntensityValue() {
        return this.mHighIntensityValue;
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

    public final int getMLowIntensityTime() {
        return this.mLowIntensityTime;
    }

    public final int getMLowIntensityValue() {
        return this.mLowIntensityValue;
    }

    public final int getMMediumIntensityTime() {
        return this.mMediumIntensityTime;
    }

    public final int getMMediumIntensityValue() {
        return this.mMediumIntensityValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mAllVitality)) * 31) + Integer.hashCode(this.mLowIntensityTime)) * 31) + Integer.hashCode(this.mLowIntensityValue)) * 31) + Integer.hashCode(this.mMediumIntensityTime)) * 31) + Integer.hashCode(this.mMediumIntensityValue)) * 31) + Integer.hashCode(this.mHighIntensityTime)) * 31) + Integer.hashCode(this.mHighIntensityValue)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAllVitality(int r1) {
        this.mAllVitality = r1;
    }

    public final void setMHighIntensityTime(int r1) {
        this.mHighIntensityTime = r1;
    }

    public final void setMHighIntensityValue(int r1) {
        this.mHighIntensityValue = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMLowIntensityTime(int r1) {
        this.mLowIntensityTime = r1;
    }

    public final void setMLowIntensityValue(int r1) {
        this.mLowIntensityValue = r1;
    }

    public final void setMMediumIntensityTime(int r1) {
        this.mMediumIntensityTime = r1;
    }

    public final void setMMediumIntensityValue(int r1) {
        this.mMediumIntensityValue = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "Vitality(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAllVitality=" + this.mAllVitality + ", mLowIntensityTime=" + this.mLowIntensityTime + ", mLowIntensityValue=" + this.mLowIntensityValue + ", mMediumIntensityTime=" + this.mMediumIntensityTime + ", mMediumIntensityValue=" + this.mMediumIntensityValue + ", mHighIntensityTime=" + this.mHighIntensityTime + ", mHighIntensityValue=" + this.mHighIntensityValue + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public Vitality(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mAllVitality = r6;
        this.mLowIntensityTime = r7;
        this.mLowIntensityValue = r8;
        this.mMediumIntensityTime = r9;
        this.mMediumIntensityValue = r10;
        this.mHighIntensityTime = r11;
        this.mHighIntensityValue = r12;
        this.mIsSync = r13;
    }

    public /* synthetic */ Vitality(int r2, long r3, String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r12 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        int r16 = 0;
    L35:
        int r17 = r12;
        int r18 = r11;
        int r19 = r10;
        int r110 = r9;
        int r20 = r8;
        int r21 = r7;
        this(r2, r3, r5, r6, r21, r20, r110, r19, r18, r17, r16);
        return;
    L36:
        r16 = r13;
        goto L35
    }

    public Vitality(@aa1 BleVitality r20, long r21) {
        Intrinsics.X0O(r20, "vitality");
        int r5 = 0;
        String r8 = null;
        int r16 = 0;
        this(r5, ((r20.getMTime() + ((long) BleConstsKt.DATA_EPOCH)) * 1000) - r21, r8, r20.getMAllVitality(), r20.getMLowIntensityTime(), r20.getMLowIntensityValue(), r20.getMMediumIntensityTime(), r20.getMMediumIntensityValue(), r20.getMHighIntensityTime(), r20.getMHighIntensityValue(), r16, 1029, null);
    }
}
