package com.sma.smartv3.p608db.entity;

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
        this(0, 0L, null, 0, 0, 0, 0, 0, 255, null);
    }

    public static /* synthetic */ Sleep copy$default(Sleep sleep, int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = sleep.mId;
        }
        if ((i7 & 2) != 0) {
            j = sleep.mTime;
        }
        if ((i7 & 4) != 0) {
            str = sleep.mLocalTime;
        }
        if ((i7 & 8) != 0) {
            i2 = sleep.mMode;
        }
        if ((i7 & 16) != 0) {
            i3 = sleep.mSoft;
        }
        if ((i7 & 32) != 0) {
            i4 = sleep.mStrong;
        }
        if ((i7 & 64) != 0) {
            i5 = sleep.mIsSync;
        }
        if ((i7 & 128) != 0) {
            i6 = sleep.mAlgorithmType;
        }
        int i8 = i5;
        int i9 = i6;
        return sleep.copy(i, j, str, i2, i3, i4, i8, i9);
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
    public final Sleep copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new Sleep(i, j, mLocalTime, i2, i3, i4, i5, i6);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sleep)) {
            return false;
        }
        Sleep sleep = (Sleep) obj;
        return this.mId == sleep.mId && this.mTime == sleep.mTime && Intrinsics.XOO0ii0(this.mLocalTime, sleep.mLocalTime) && this.mMode == sleep.mMode && this.mSoft == sleep.mSoft && this.mStrong == sleep.mStrong && this.mIsSync == sleep.mIsSync && this.mAlgorithmType == sleep.mAlgorithmType;
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

    public final void setMAlgorithmType(int i) {
        this.mAlgorithmType = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMSoft(int i) {
        this.mSoft = i;
    }

    public final void setMStrong(int i) {
        this.mStrong = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "Sleep(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mMode=" + this.mMode + ", mSoft=" + this.mSoft + ", mStrong=" + this.mStrong + ", mIsSync=" + this.mIsSync + ", mAlgorithmType=" + this.mAlgorithmType + I000IiI1O.C2156iO.f1007iO;
    }

    public Sleep(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mMode = i2;
        this.mSoft = i3;
        this.mStrong = i4;
        this.mIsSync = i5;
        this.mAlgorithmType = i6;
    }

    public /* synthetic */ Sleep(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Sleep(@aa1 BleSleep bleSleep, long j) {
        this(0, (((long) (bleSleep.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleSleep.getMMode(), bleSleep.getMSoft(), bleSleep.getMStrong(), 0, 0, 197, null);
        Intrinsics.X0O(bleSleep, "bleSleep");
    }
}
