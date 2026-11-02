package com.sma.smartv3.db.entity;

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
        long r1 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        int r9 = 0;
        long r10 = 0;
        long r12 = 0;
        boolean r14 = false;
        int r15 = 0;
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r14, r15, 2047, null);
    }

    public static /* synthetic */ RecordDeviceInfo copy$default(RecordDeviceInfo r16, long r17, long r19, String r21, String r22, String r23, String r24, int r25, long r26, long r28, boolean r30, int r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        long r2 = r16.mId;
    L7:
        if ((r32 & 2) == 0) goto L9;
        long r4 = r16.mTime;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r6 = r16.mLocalTime;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r7 = r16.mMac;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r8 = r16.mName;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r9 = r16.mVersion;
    L27:
        if ((r32 & 64) == 0) goto L29;
        int r10 = r16.mBattery;
    L31:
        if ((r32 & 128) == 0) goto L33;
        long r11 = r16.mTotalStorage;
    L35:
        if ((r32 & 256) == 0) goto L37;
        long r13 = r16.mAvailableStorage;
    L39:
        if ((r32 & 512) == 0) goto L41;
        boolean r15 = r16.isActive;
    L43:
        if ((r32 & 1024) == 0) goto L46;
        int r34 = r16.mVoltage;
    L48:
        return r16.copy(r2, r4, r6, r7, r8, r9, r10, r11, r13, r15, r34);
    L46:
        r34 = r31;
        goto L48
    L41:
        r15 = r30;
        goto L43
    L37:
        r13 = r28;
        goto L39
    L33:
        r11 = r26;
        goto L35
    L29:
        r10 = r25;
        goto L31
    L25:
        r9 = r24;
        goto L27
    L21:
        r8 = r23;
        goto L23
    L17:
        r7 = r22;
        goto L19
    L13:
        r6 = r21;
        goto L15
    L9:
        r4 = r19;
        goto L11
    L5:
        r2 = r17;
        goto L7
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
    public final RecordDeviceInfo copy(long r18, long r20, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, int r26, long r27, long r29, boolean r31, int r32) {
        Intrinsics.X0O(r22, "mLocalTime");
        Intrinsics.X0O(r23, "mMac");
        Intrinsics.X0O(r24, "mName");
        Intrinsics.X0O(r25, "mVersion");
        return new RecordDeviceInfo(r18, r20, r22, r23, r24, r25, r26, r27, r29, r31, r32);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof RecordDeviceInfo) == true) goto L8;
        return false;
    L8:
        RecordDeviceInfo r9 = (RecordDeviceInfo) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mMac, r9.mMac) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mName, r9.mName) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mVersion, r9.mVersion) == true) goto L27;
        return false;
    L27:
        if (this.mBattery == r9.mBattery) goto L30;
        return false;
    L30:
        if (this.mTotalStorage == r9.mTotalStorage) goto L33;
        return false;
    L33:
        if (this.mAvailableStorage == r9.mAvailableStorage) goto L36;
        return false;
    L36:
        if (this.isActive == r9.isActive) goto L39;
        return false;
    L39:
        if (this.mVoltage == r9.mVoltage) goto L41;
        return false;
    L41:
        return true;
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

    public final void setActive(boolean r1) {
        this.isActive = r1;
    }

    public final void setMAvailableStorage(long r1) {
        this.mAvailableStorage = r1;
    }

    public final void setMBattery(int r1) {
        this.mBattery = r1;
    }

    public final void setMId(long r1) {
        this.mId = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMac = r2;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTotalStorage(long r1) {
        this.mTotalStorage = r1;
    }

    public final void setMVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVersion = r2;
    }

    public final void setMVoltage(int r1) {
        this.mVoltage = r1;
    }

    @aa1
    public String toString() {
        return "RecordDeviceInfo(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mMac=" + this.mMac + ", mName=" + this.mName + ", mVersion=" + this.mVersion + ", mBattery=" + this.mBattery + ", mTotalStorage=" + this.mTotalStorage + ", mAvailableStorage=" + this.mAvailableStorage + ", isActive=" + this.isActive + ", mVoltage=" + this.mVoltage + I000IiI1O.iO.iO;
    }

    public RecordDeviceInfo(long r2, long r4, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, int r10, long r11, long r13, boolean r15, int r16) {
        Intrinsics.X0O(r6, "mLocalTime");
        Intrinsics.X0O(r7, "mMac");
        Intrinsics.X0O(r8, "mName");
        Intrinsics.X0O(r9, "mVersion");
        this.mId = r2;
        this.mTime = r4;
        this.mLocalTime = r6;
        this.mMac = r7;
        this.mName = r8;
        this.mVersion = r9;
        this.mBattery = r10;
        this.mTotalStorage = r11;
        this.mAvailableStorage = r13;
        this.isActive = r15;
        this.mVoltage = r16;
    }

    public /* synthetic */ RecordDeviceInfo(long r17, long r19, String r21, String r22, String r23, String r24, int r25, long r26, long r28, boolean r30, int r31, int r32, DefaultConstructorMarker r33) {
        long r2 = 0;
        if ((r32 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r32 & 2) == 0) goto L9;
        long r6 = new Date().getTime();
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r1 = O0X11OiO.XO0O10().format(Long.valueOf(r6));
        Intrinsics.O10IXXX0X(r1, "format(...)");
    L14:
        String r9 = "";
        if ((r32 & 8) == 0) goto L17;
        String r8 = "";
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r10 = "";
    L23:
        if ((r32 & 32) != 0) goto L27;
        r9 = r24;
    L27:
        if ((r32 & 64) == 0) goto L29;
        int r11 = 0;
    L31:
        if ((r32 & 128) == 0) goto L33;
        long r13 = 0;
    L35:
        if ((r32 & 256) != 0) goto L39;
        r2 = r28;
    L39:
        if ((r32 & 512) == 0) goto L41;
        boolean r15 = false;
    L43:
        if ((r32 & 1024) == 0) goto L46;
        int r34 = 0;
    L47:
        this(r4, r6, r1, r8, r10, r9, r11, r13, r2, r15, r34);
        return;
    L46:
        r34 = r31;
        goto L47
    L41:
        r15 = r30;
        goto L43
    L33:
        r13 = r26;
        goto L35
    L29:
        r11 = r25;
        goto L31
    L21:
        r10 = r23;
        goto L23
    L17:
        r8 = r22;
        goto L19
    L13:
        r1 = r21;
        goto L14
    L9:
        r6 = r19;
        goto L11
    L5:
        r4 = r17;
        goto L7
    }
}
