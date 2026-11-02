package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleAlipayBindInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class AlipayBindInfo {

    @aa1
    @ColumnInfo
    private String mAppVersion;

    @aa1
    @ColumnInfo
    private String mBleName;

    @aa1
    @ColumnInfo
    private String mFirmwareFlag;

    @aa1
    @ColumnInfo
    private String mFirmwareVersion;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @ColumnInfo
    private String mMacAddress;

    @ColumnInfo
    private int mResult;

    @ColumnInfo
    private long mTime;

    public AlipayBindInfo() {
        this(0, 0L, null, null, null, null, null, null, 0, 0, 1023, null);
    }

    public static /* synthetic */ AlipayBindInfo copy$default(AlipayBindInfo alipayBindInfo, int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = alipayBindInfo.mId;
        }
        if ((i4 & 2) != 0) {
            j = alipayBindInfo.mTime;
        }
        if ((i4 & 4) != 0) {
            str = alipayBindInfo.mLocalTime;
        }
        if ((i4 & 8) != 0) {
            str2 = alipayBindInfo.mBleName;
        }
        if ((i4 & 16) != 0) {
            str3 = alipayBindInfo.mFirmwareFlag;
        }
        if ((i4 & 32) != 0) {
            str4 = alipayBindInfo.mMacAddress;
        }
        if ((i4 & 64) != 0) {
            str5 = alipayBindInfo.mFirmwareVersion;
        }
        if ((i4 & 128) != 0) {
            str6 = alipayBindInfo.mAppVersion;
        }
        if ((i4 & 256) != 0) {
            i2 = alipayBindInfo.mResult;
        }
        if ((i4 & 512) != 0) {
            i3 = alipayBindInfo.mIsSync;
        }
        int i5 = i2;
        int i6 = i3;
        String str7 = str5;
        String str8 = str6;
        return alipayBindInfo.copy(i, j, str, str2, str3, str4, str7, str8, i5, i6);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mIsSync;
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
        return this.mBleName;
    }

    @aa1
    public final String component5() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String component6() {
        return this.mMacAddress;
    }

    @aa1
    public final String component7() {
        return this.mFirmwareVersion;
    }

    @aa1
    public final String component8() {
        return this.mAppVersion;
    }

    public final int component9() {
        return this.mResult;
    }

    @aa1
    public final AlipayBindInfo copy(int i, long j, @aa1 String mLocalTime, @aa1 String mBleName, @aa1 String mFirmwareFlag, @aa1 String mMacAddress, @aa1 String mFirmwareVersion, @aa1 String mAppVersion, int i2, int i3) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mMacAddress, "mMacAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mAppVersion, "mAppVersion");
        return new AlipayBindInfo(i, j, mLocalTime, mBleName, mFirmwareFlag, mMacAddress, mFirmwareVersion, mAppVersion, i2, i3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlipayBindInfo)) {
            return false;
        }
        AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj;
        return this.mId == alipayBindInfo.mId && this.mTime == alipayBindInfo.mTime && Intrinsics.XOO0ii0(this.mLocalTime, alipayBindInfo.mLocalTime) && Intrinsics.XOO0ii0(this.mBleName, alipayBindInfo.mBleName) && Intrinsics.XOO0ii0(this.mFirmwareFlag, alipayBindInfo.mFirmwareFlag) && Intrinsics.XOO0ii0(this.mMacAddress, alipayBindInfo.mMacAddress) && Intrinsics.XOO0ii0(this.mFirmwareVersion, alipayBindInfo.mFirmwareVersion) && Intrinsics.XOO0ii0(this.mAppVersion, alipayBindInfo.mAppVersion) && this.mResult == alipayBindInfo.mResult && this.mIsSync == alipayBindInfo.mIsSync;
    }

    @aa1
    public final String getMAppVersion() {
        return this.mAppVersion;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String getMFirmwareVersion() {
        return this.mFirmwareVersion;
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

    @aa1
    public final String getMMacAddress() {
        return this.mMacAddress;
    }

    public final int getMResult() {
        return this.mResult;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + this.mBleName.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mMacAddress.hashCode()) * 31) + this.mFirmwareVersion.hashCode()) * 31) + this.mAppVersion.hashCode()) * 31) + Integer.hashCode(this.mResult)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAppVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAppVersion = str;
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    public final void setMFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareFlag = str;
    }

    public final void setMFirmwareVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareVersion = str;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMacAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMacAddress = str;
    }

    public final void setMResult(int i) {
        this.mResult = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "AlipayBindInfo(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mBleName=" + this.mBleName + ", mFirmwareFlag=" + this.mFirmwareFlag + ", mMacAddress=" + this.mMacAddress + ", mFirmwareVersion=" + this.mFirmwareVersion + ", mAppVersion=" + this.mAppVersion + ", mResult=" + this.mResult + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public AlipayBindInfo(int i, long j, @aa1 String mLocalTime, @aa1 String mBleName, @aa1 String mFirmwareFlag, @aa1 String mMacAddress, @aa1 String mFirmwareVersion, @aa1 String mAppVersion, int i2, int i3) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mMacAddress, "mMacAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mAppVersion, "mAppVersion");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mBleName = mBleName;
        this.mFirmwareFlag = mFirmwareFlag;
        this.mMacAddress = mMacAddress;
        this.mFirmwareVersion = mFirmwareVersion;
        this.mAppVersion = mAppVersion;
        this.mResult = i2;
        this.mIsSync = i3;
    }

    public /* synthetic */ AlipayBindInfo(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlipayBindInfo(@aa1 BleAlipayBindInfo alipayBindInfo, long j) {
        this(0, (((long) (alipayBindInfo.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, null, null, null, null, null, alipayBindInfo.getMResult(), 0, 765, null);
        Intrinsics.X0O(alipayBindInfo, "alipayBindInfo");
    }
}
