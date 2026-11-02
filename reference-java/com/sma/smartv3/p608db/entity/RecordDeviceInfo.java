package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mMac"})})
public final class RecordDeviceInfo {

    @ColumnInfo
    private boolean isActive;

    @ColumnInfo
    private long mAvailableStorage;

    @ColumnInfo
    private int mBattery;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private long mId;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @ColumnInfo
    private String mMac;

    @aa1
    @ColumnInfo
    private String mName;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private long mTotalStorage;

    @aa1
    @ColumnInfo
    private String mVersion;

    @ColumnInfo
    private int mVoltage;

    public RecordDeviceInfo() {
        this(0L, 0L, null, null, null, null, 0, 0L, 0L, false, 0, 2047, null);
    }

    public final long component1() {
        return this.mId;
    }

    public final boolean component10() {
        return this.isActive;
    }

    public final int component11() {
        return this.mVoltage;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    @aa1
    public final String component4() {
        return this.mMac;
    }

    @aa1
    public final String component5() {
        return this.mName;
    }

    @aa1
    public final String component6() {
        return this.mVersion;
    }

    public final int component7() {
        return this.mBattery;
    }

    public final long component8() {
        return this.mTotalStorage;
    }

    public final long component9() {
        return this.mAvailableStorage;
    }

    @aa1
    public final RecordDeviceInfo copy(long j, long j2, @aa1 String mLocalTime, @aa1 String mMac, @aa1 String mName, @aa1 String mVersion, int i, long j3, long j4, boolean z, int i2) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mMac, "mMac");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mVersion, "mVersion");
        return new RecordDeviceInfo(j, j2, mLocalTime, mMac, mName, mVersion, i, j3, j4, z, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDeviceInfo)) {
            return false;
        }
        RecordDeviceInfo recordDeviceInfo = (RecordDeviceInfo) obj;
        return this.mId == recordDeviceInfo.mId && this.mTime == recordDeviceInfo.mTime && Intrinsics.XOO0ii0(this.mLocalTime, recordDeviceInfo.mLocalTime) && Intrinsics.XOO0ii0(this.mMac, recordDeviceInfo.mMac) && Intrinsics.XOO0ii0(this.mName, recordDeviceInfo.mName) && Intrinsics.XOO0ii0(this.mVersion, recordDeviceInfo.mVersion) && this.mBattery == recordDeviceInfo.mBattery && this.mTotalStorage == recordDeviceInfo.mTotalStorage && this.mAvailableStorage == recordDeviceInfo.mAvailableStorage && this.isActive == recordDeviceInfo.isActive && this.mVoltage == recordDeviceInfo.mVoltage;
    }

    @aa1
    public final String getFirmwareFlag() {
        return "AI_Note";
    }

    public final long getMAvailableStorage() {
        return this.mAvailableStorage;
    }

    public final int getMBattery() {
        return this.mBattery;
    }

    public final long getMId() {
        return this.mId;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final String getMMac() {
        return this.mMac;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final long getMTotalStorage() {
        return this.mTotalStorage;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public final int getMVoltage() {
        return this.mVoltage;
    }

    @aa1
    public final String getSimpleName() {
        return "Aura";
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + this.mMac.hashCode()) * 31) + this.mName.hashCode()) * 31) + this.mVersion.hashCode()) * 31) + Integer.hashCode(this.mBattery)) * 31) + Long.hashCode(this.mTotalStorage)) * 31) + Long.hashCode(this.mAvailableStorage)) * 31) + Boolean.hashCode(this.isActive)) * 31) + Integer.hashCode(this.mVoltage);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setMAvailableStorage(long j) {
        this.mAvailableStorage = j;
    }

    public final void setMBattery(int i) {
        this.mBattery = i;
    }

    public final void setMId(long j) {
        this.mId = j;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMac = str;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTotalStorage(long j) {
        this.mTotalStorage = j;
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    public final void setMVoltage(int i) {
        this.mVoltage = i;
    }

    @aa1
    public String toString() {
        return "RecordDeviceInfo(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mMac=" + this.mMac + ", mName=" + this.mName + ", mVersion=" + this.mVersion + ", mBattery=" + this.mBattery + ", mTotalStorage=" + this.mTotalStorage + ", mAvailableStorage=" + this.mAvailableStorage + ", isActive=" + this.isActive + ", mVoltage=" + this.mVoltage + I000IiI1O.C2156iO.f1007iO;
    }

    public RecordDeviceInfo(long j, long j2, @aa1 String mLocalTime, @aa1 String mMac, @aa1 String mName, @aa1 String mVersion, int i, long j3, long j4, boolean z, int i2) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mMac, "mMac");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mVersion, "mVersion");
        this.mId = j;
        this.mTime = j2;
        this.mLocalTime = mLocalTime;
        this.mMac = mMac;
        this.mName = mName;
        this.mVersion = mVersion;
        this.mBattery = i;
        this.mTotalStorage = j3;
        this.mAvailableStorage = j4;
        this.isActive = z;
        this.mVoltage = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecordDeviceInfo(long j, long j2, String str, String str2, String str3, String str4, int i, long j3, long j4, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        long j5 = (i3 & 1) != 0 ? 0L : j;
        long time = (i3 & 2) != 0 ? new Date().getTime() : j2;
        if ((i3 & 4) != 0) {
            str5 = O0X11OiO.XO0O10().format(Long.valueOf(time));
            Intrinsics.O10IXXX0X(str5, "format(...)");
        } else {
            str5 = str;
        }
        this(j5, time, str5, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) == 0 ? str4 : "", (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0L : j3, (i3 & 256) == 0 ? j4 : 0L, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? 0 : i2);
    }
}
