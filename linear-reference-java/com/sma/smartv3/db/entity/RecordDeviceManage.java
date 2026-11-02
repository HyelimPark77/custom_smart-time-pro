package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(tableName = "RecordDeviceManage")
public final class RecordDeviceManage {

    @aa1
    @ColumnInfo
    private String mFileName;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private long mId;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @ColumnInfo
    private String mName;

    @ColumnInfo
    private long mTime;

    public RecordDeviceManage() {
        long r1 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        this(r1, r3, r5, r6, r7, 31, null);
    }

    public static /* synthetic */ RecordDeviceManage copy$default(RecordDeviceManage r8, long r9, long r11, String r13, String r14, String r15, int r16, Object r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = r8.mId;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        r11 = r8.mTime;
    L8:
        long r3 = r11;
        if ((r16 & 4) == 0) goto L11;
        r13 = r8.mLocalTime;
    L11:
        String r5 = r13;
        if ((r16 & 8) == 0) goto L14;
        r14 = r8.mFileName;
    L14:
        String r6 = r14;
        if ((r16 & 16) == 0) goto L18;
        r15 = r8.mName;
    L18:
        return r8.copy(r1, r3, r5, r6, r15);
    }

    public final long component1() {
        return this.mId;
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
        return this.mFileName;
    }

    @aa1
    public final String component5() {
        return this.mName;
    }

    @aa1
    public final RecordDeviceManage copy(long r10, long r12, @aa1 String r14, @aa1 String r15, @aa1 String r16) {
        Intrinsics.X0O(r14, "mLocalTime");
        Intrinsics.X0O(r15, "mFileName");
        Intrinsics.X0O(r16, "mName");
        return new RecordDeviceManage(r10, r12, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof RecordDeviceManage) == true) goto L8;
        return false;
    L8:
        RecordDeviceManage r9 = (RecordDeviceManage) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFileName, r9.mFileName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mName, r9.mName) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getMFileName() {
        return this.mFileName;
    }

    public final long getMId() {
        return this.mId;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + this.mFileName.hashCode()) * 31) + this.mName.hashCode();
    }

    public final void setMFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileName = r2;
    }

    public final void setMId(long r1) {
        this.mId = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "RecordDeviceManage(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mFileName=" + this.mFileName + ", mName=" + this.mName + I000IiI1O.iO.iO;
    }

    public RecordDeviceManage(long r2, long r4, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r6, "mLocalTime");
        Intrinsics.X0O(r7, "mFileName");
        Intrinsics.X0O(r8, "mName");
        this.mId = r2;
        this.mTime = r4;
        this.mLocalTime = r6;
        this.mFileName = r7;
        this.mName = r8;
    }

    public /* synthetic */ RecordDeviceManage(long r9, long r11, String r13, String r14, String r15, int r16, DefaultConstructorMarker r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = 0;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        r11 = new Date().getTime();
    L8:
        long r3 = r11;
        if ((r16 & 4) == 0) goto L11;
        r13 = O0X11OiO.XO0O10().format(Long.valueOf(r3));
        Intrinsics.O10IXXX0X(r13, "format(...)");
    L11:
        String r5 = r13;
        if ((r16 & 8) == 0) goto L14;
        String r6 = "";
    L16:
        if ((r16 & 16) == 0) goto L19;
        String r7 = "";
    L20:
        this(r1, r3, r5, r6, r7);
        return;
    L19:
        r7 = r15;
        goto L20
    L14:
        r6 = r14;
        goto L16
    }
}
