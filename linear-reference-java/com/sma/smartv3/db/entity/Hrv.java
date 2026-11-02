package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleHrv;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Hrv {

    @ColumnInfo
    private int mAvgValue;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mValue;

    public Hrv() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r4, r5, r6, r7, 63, null);
    }

    public static /* synthetic */ Hrv copy$default(Hrv r0, int r1, long r2, String r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.mValue;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = r0.mAvgValue;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.mIsSync;
    L20:
        int r10 = r6;
        int r11 = r7;
        long r12 = r2;
        int r3 = r1;
        return r0.copy(r3, r12, r4, r5, r10, r11);
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
        return this.mValue;
    }

    public final int component5() {
        return this.mAvgValue;
    }

    public final int component6() {
        return this.mIsSync;
    }

    @aa1
    public final Hrv copy(int r10, long r11, @aa1 String r13, int r14, int r15, int r16) {
        Intrinsics.X0O(r13, "mLocalTime");
        return new Hrv(r10, r11, r13, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Hrv) == true) goto L8;
        return false;
    L8:
        Hrv r9 = (Hrv) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mValue == r9.mValue) goto L21;
        return false;
    L21:
        if (this.mAvgValue == r9.mAvgValue) goto L24;
        return false;
    L24:
        if (this.mIsSync == r9.mIsSync) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMAvgValue() {
        return this.mAvgValue;
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

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mAvgValue)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAvgValue(int r1) {
        this.mAvgValue = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMValue(int r1) {
        this.mValue = r1;
    }

    @aa1
    public String toString() {
        return "Hrv(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mValue=" + this.mValue + ", mAvgValue=" + this.mAvgValue + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public Hrv(int r2, long r3, @aa1 String r5, int r6, int r7, int r8) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mValue = r6;
        this.mAvgValue = r7;
        this.mIsSync = r8;
    }

    public /* synthetic */ Hrv(int r2, long r3, String r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        int r11 = 0;
    L20:
        int r12 = r7;
        this(r2, r3, r5, r6, r12, r11);
        return;
    L21:
        r11 = r8;
        goto L20
    }

    public Hrv(@aa1 BleHrv r13, long r14) {
        Intrinsics.X0O(r13, "bleHrv");
        int r3 = 0;
        String r6 = null;
        int r9 = 0;
        this(r3, (((long) (r13.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r14, r6, r13.getMValue(), r13.getMAvgValue(), r9, 37, null);
    }
}
