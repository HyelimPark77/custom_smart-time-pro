package com.sma.smartv3.db.entity;

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
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    public static /* synthetic */ AlipayBindInfo copy$default(AlipayBindInfo r0, int r1, long r2, String r4, String r5, String r6, String r7, String r8, String r9, int r10, int r11, int r12, Object r13) {
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
        r5 = r0.mBleName;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r0.mFirmwareFlag;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r0.mMacAddress;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r0.mFirmwareVersion;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = r0.mAppVersion;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r0.mResult;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r0.mIsSync;
    L32:
        int r14 = r10;
        int r15 = r11;
        String r16 = r8;
        String r17 = r9;
        String r18 = r6;
        String r19 = r7;
        long r20 = r2;
        int r3 = r1;
        return r0.copy(r3, r20, r4, r5, r18, r19, r16, r17, r14, r15);
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
    public final AlipayBindInfo copy(int r14, long r15, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, int r23, int r24) {
        Intrinsics.X0O(r17, "mLocalTime");
        Intrinsics.X0O(r18, "mBleName");
        Intrinsics.X0O(r19, "mFirmwareFlag");
        Intrinsics.X0O(r20, "mMacAddress");
        Intrinsics.X0O(r21, "mFirmwareVersion");
        Intrinsics.X0O(r22, "mAppVersion");
        return new AlipayBindInfo(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AlipayBindInfo) == true) goto L8;
        return false;
    L8:
        AlipayBindInfo r9 = (AlipayBindInfo) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mBleName, r9.mBleName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r9.mFirmwareFlag) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mMacAddress, r9.mMacAddress) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mFirmwareVersion, r9.mFirmwareVersion) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mAppVersion, r9.mAppVersion) == true) goto L33;
        return false;
    L33:
        if (this.mResult == r9.mResult) goto L36;
        return false;
    L36:
        if (this.mIsSync == r9.mIsSync) goto L38;
        return false;
    L38:
        return true;
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

    public final void setMAppVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAppVersion = r2;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareVersion = r2;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMMacAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMacAddress = r2;
    }

    public final void setMResult(int r1) {
        this.mResult = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "AlipayBindInfo(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mBleName=" + this.mBleName + ", mFirmwareFlag=" + this.mFirmwareFlag + ", mMacAddress=" + this.mMacAddress + ", mFirmwareVersion=" + this.mFirmwareVersion + ", mAppVersion=" + this.mAppVersion + ", mResult=" + this.mResult + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public AlipayBindInfo(int r2, long r3, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, int r11, int r12) {
        Intrinsics.X0O(r5, "mLocalTime");
        Intrinsics.X0O(r6, "mBleName");
        Intrinsics.X0O(r7, "mFirmwareFlag");
        Intrinsics.X0O(r8, "mMacAddress");
        Intrinsics.X0O(r9, "mFirmwareVersion");
        Intrinsics.X0O(r10, "mAppVersion");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mBleName = r6;
        this.mFirmwareFlag = r7;
        this.mMacAddress = r8;
        this.mFirmwareVersion = r9;
        this.mAppVersion = r10;
        this.mResult = r11;
        this.mIsSync = r12;
    }

    public /* synthetic */ AlipayBindInfo(int r3, long r4, String r6, String r7, String r8, String r9, String r10, String r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r6 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r7 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r8 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r9 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r10 = "";
    L24:
        if ((r14 & 128) == 0) goto L27;
        r11 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r12 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        int r16 = 0;
    L32:
        int r17 = r12;
        String r18 = r11;
        String r19 = r10;
        String r110 = r9;
        String r20 = r8;
        this(r3, r4, r6, r7, r20, r110, r19, r18, r17, r16);
        return;
    L33:
        r16 = r13;
        goto L32
    }

    public AlipayBindInfo(@aa1 BleAlipayBindInfo r19, long r20) {
        Intrinsics.X0O(r19, "alipayBindInfo");
        int r5 = 0;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        int r15 = 0;
        this(r5, (((long) (r19.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r20, r8, r9, r10, r11, r12, r13, r19.getMResult(), r15, 765, null);
    }
}
