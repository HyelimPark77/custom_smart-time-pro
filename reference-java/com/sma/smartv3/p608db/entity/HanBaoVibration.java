package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleHanBaoVibration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class HanBaoVibration {

    @ColumnInfo
    private int mBOValue;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSnore;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mVibration;

    public HanBaoVibration() {
        this(0, 0L, null, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ HanBaoVibration copy$default(HanBaoVibration hanBaoVibration, int i, long j, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = hanBaoVibration.mId;
        }
        if ((i6 & 2) != 0) {
            j = hanBaoVibration.mTime;
        }
        if ((i6 & 4) != 0) {
            str = hanBaoVibration.mLocalTime;
        }
        if ((i6 & 8) != 0) {
            i2 = hanBaoVibration.mVibration;
        }
        if ((i6 & 16) != 0) {
            i3 = hanBaoVibration.mBOValue;
        }
        if ((i6 & 32) != 0) {
            i4 = hanBaoVibration.mIsSnore;
        }
        if ((i6 & 64) != 0) {
            i5 = hanBaoVibration.mIsSync;
        }
        int i7 = i5;
        int i8 = i3;
        String str2 = str;
        return hanBaoVibration.copy(i, j, str2, i2, i8, i4, i7);
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
        return this.mVibration;
    }

    public final int component5() {
        return this.mBOValue;
    }

    public final int component6() {
        return this.mIsSnore;
    }

    public final int component7() {
        return this.mIsSync;
    }

    @aa1
    public final HanBaoVibration copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new HanBaoVibration(i, j, mLocalTime, i2, i3, i4, i5);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HanBaoVibration)) {
            return false;
        }
        HanBaoVibration hanBaoVibration = (HanBaoVibration) obj;
        return this.mId == hanBaoVibration.mId && this.mTime == hanBaoVibration.mTime && Intrinsics.XOO0ii0(this.mLocalTime, hanBaoVibration.mLocalTime) && this.mVibration == hanBaoVibration.mVibration && this.mBOValue == hanBaoVibration.mBOValue && this.mIsSnore == hanBaoVibration.mIsSnore && this.mIsSync == hanBaoVibration.mIsSync;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsSnore() {
        return this.mIsSnore;
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

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mBOValue)) * 31) + Integer.hashCode(this.mIsSnore)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMBOValue(int i) {
        this.mBOValue = i;
    }

    public final void setMIsSnore(int i) {
        this.mIsSnore = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "HanBaoVibration(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mVibration=" + this.mVibration + ", mBOValue=" + this.mBOValue + ", mIsSnore=" + this.mIsSnore + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public HanBaoVibration(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mVibration = i2;
        this.mBOValue = i3;
        this.mIsSnore = i4;
        this.mIsSync = i5;
    }

    public /* synthetic */ HanBaoVibration(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0L : j, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HanBaoVibration(@aa1 BleHanBaoVibration bleHanBaoVibration, long j) {
        this(0, (((long) (bleHanBaoVibration.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleHanBaoVibration.getMVibration(), bleHanBaoVibration.getMBOValue(), bleHanBaoVibration.getMIsSnore(), 0, 69, null);
        Intrinsics.X0O(bleHanBaoVibration, "bleHanBaoVibration");
    }
}
