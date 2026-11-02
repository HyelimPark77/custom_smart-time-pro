package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BlePressure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Pressure {

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

    public Pressure() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r4, r5, r6, 31, null);
    }

    public static /* synthetic */ Pressure copy$default(Pressure r0, int r1, long r2, String r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.mValue;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.mIsSync;
    L17:
        int r9 = r6;
        String r10 = r4;
        long r11 = r2;
        int r3 = r1;
        return r0.copy(r3, r11, r10, r5, r9);
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
        return this.mIsSync;
    }

    @aa1
    public final Pressure copy(int r9, long r10, @aa1 String r12, int r13, int r14) {
        Intrinsics.X0O(r12, "mLocalTime");
        return new Pressure(r9, r10, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Pressure) == true) goto L8;
        return false;
    L8:
        Pressure r9 = (Pressure) r8;
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
        if (this.mIsSync == r9.mIsSync) goto L23;
        return false;
    L23:
        return true;
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
        return (((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mIsSync);
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
        return "Pressure(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mValue=" + this.mValue + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public Pressure(int r2, long r3, @aa1 String r5, int r6, int r7) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mValue = r6;
        this.mIsSync = r7;
    }

    public /* synthetic */ Pressure(int r2, long r3, String r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        int r10 = 0;
    L19:
        this(r2, r3, r5, r6, r10);
        return;
    L18:
        r10 = r7;
        goto L19
    }

    public Pressure(@aa1 BlePressure r12, long r13) {
        Intrinsics.X0O(r12, "blePressure");
        int r3 = 0;
        String r6 = null;
        int r8 = 0;
        this(r3, (((long) (r12.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r13, r6, r12.getMValue(), r8, 21, null);
    }
}
