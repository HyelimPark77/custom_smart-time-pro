package com.sma.smartv3.p608db.entity;

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
        this(0L, 0L, null, null, null, 31, null);
    }

    public static /* synthetic */ RecordDeviceManage copy$default(RecordDeviceManage recordDeviceManage, long j, long j2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = recordDeviceManage.mId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = recordDeviceManage.mTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = recordDeviceManage.mLocalTime;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = recordDeviceManage.mFileName;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = recordDeviceManage.mName;
        }
        return recordDeviceManage.copy(j3, j4, str4, str5, str3);
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
    public final RecordDeviceManage copy(long j, long j2, @aa1 String mLocalTime, @aa1 String mFileName, @aa1 String mName) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mName, "mName");
        return new RecordDeviceManage(j, j2, mLocalTime, mFileName, mName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDeviceManage)) {
            return false;
        }
        RecordDeviceManage recordDeviceManage = (RecordDeviceManage) obj;
        return this.mId == recordDeviceManage.mId && this.mTime == recordDeviceManage.mTime && Intrinsics.XOO0ii0(this.mLocalTime, recordDeviceManage.mLocalTime) && Intrinsics.XOO0ii0(this.mFileName, recordDeviceManage.mFileName) && Intrinsics.XOO0ii0(this.mName, recordDeviceManage.mName);
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

    public final void setMFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileName = str;
    }

    public final void setMId(long j) {
        this.mId = j;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "RecordDeviceManage(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mFileName=" + this.mFileName + ", mName=" + this.mName + I000IiI1O.C2156iO.f1007iO;
    }

    public RecordDeviceManage(long j, long j2, @aa1 String mLocalTime, @aa1 String mFileName, @aa1 String mName) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mName, "mName");
        this.mId = j;
        this.mTime = j2;
        this.mLocalTime = mLocalTime;
        this.mFileName = mFileName;
        this.mName = mName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecordDeviceManage(long j, long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = (i & 1) != 0 ? 0L : j;
        long time = (i & 2) != 0 ? new Date().getTime() : j2;
        if ((i & 4) != 0) {
            str = O0X11OiO.XO0O10().format(Long.valueOf(time));
            Intrinsics.O10IXXX0X(str, "format(...)");
        }
        this(j3, time, str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
