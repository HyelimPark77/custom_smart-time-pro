package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(tableName = "RecordSchedule")
public final class RecordSchedule implements Serializable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int REPEAT_DAILY = 1;
    public static final int REPEAT_MONTHLY = 3;
    public static final int REPEAT_NONE = 0;
    public static final int REPEAT_WEEKLY = 2;
    public static final int STATUS_COMPLETED = 2;
    public static final int STATUS_EXPIRED = 1;
    public static final int STATUS_PLANNED = 0;

    @ColumnInfo
    private long mCalendarEventId;

    @aa1
    @ColumnInfo
    private String mContent;

    @ColumnInfo
    private long mDeviceFileId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private long mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsRemindEnabled;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private long mLastRemindTime;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private long mRemindTime;

    @ColumnInfo
    private int mRepeatType;

    @ColumnInfo
    private int mStatus;

    @ColumnInfo
    private long mTime;

    @aa1
    @ColumnInfo
    private String mTitle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RecordSchedule() {
        this(0L, 0L, null, null, null, 0, 0, 0L, 0L, 0, 0L, 0, 0, 0L, C2263bm.OXO1, null);
    }

    public static /* synthetic */ RecordSchedule copy$default(RecordSchedule recordSchedule, long j, long j2, String str, String str2, String str3, int i, int i2, long j3, long j4, int i3, long j5, int i4, int i5, long j6, int i6, Object obj) {
        long j7;
        int i7;
        long j8 = (i6 & 1) != 0 ? recordSchedule.mId : j;
        long j9 = (i6 & 2) != 0 ? recordSchedule.mTime : j2;
        String str4 = (i6 & 4) != 0 ? recordSchedule.mLocalTime : str;
        String str5 = (i6 & 8) != 0 ? recordSchedule.mTitle : str2;
        String str6 = (i6 & 16) != 0 ? recordSchedule.mContent : str3;
        int i8 = (i6 & 32) != 0 ? recordSchedule.mIsRemindEnabled : i;
        int i9 = (i6 & 64) != 0 ? recordSchedule.mRepeatType : i2;
        long j10 = (i6 & 128) != 0 ? recordSchedule.mRemindTime : j3;
        long j11 = (i6 & 256) != 0 ? recordSchedule.mLastRemindTime : j4;
        int i10 = (i6 & 512) != 0 ? recordSchedule.mStatus : i3;
        long j12 = j8;
        long j13 = (i6 & 1024) != 0 ? recordSchedule.mCalendarEventId : j5;
        int i11 = (i6 & 2048) != 0 ? recordSchedule.mIsSync : i4;
        int i12 = (i6 & 4096) != 0 ? recordSchedule.mIsDelete : i5;
        if ((i6 & 8192) != 0) {
            i7 = i11;
            j7 = recordSchedule.mDeviceFileId;
        } else {
            j7 = j6;
            i7 = i11;
        }
        return recordSchedule.copy(j12, j9, str4, str5, str6, i8, i9, j10, j11, i10, j13, i7, i12, j7);
    }

    public final long component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mStatus;
    }

    public final long component11() {
        return this.mCalendarEventId;
    }

    public final int component12() {
        return this.mIsSync;
    }

    public final int component13() {
        return this.mIsDelete;
    }

    public final long component14() {
        return this.mDeviceFileId;
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
        return this.mTitle;
    }

    @aa1
    public final String component5() {
        return this.mContent;
    }

    public final int component6() {
        return this.mIsRemindEnabled;
    }

    public final int component7() {
        return this.mRepeatType;
    }

    public final long component8() {
        return this.mRemindTime;
    }

    public final long component9() {
        return this.mLastRemindTime;
    }

    @aa1
    public final RecordSchedule copy(long j, long j2, @aa1 String mLocalTime, @aa1 String mTitle, @aa1 String mContent, int i, int i2, long j3, long j4, int i3, long j5, int i4, int i5, long j6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        return new RecordSchedule(j, j2, mLocalTime, mTitle, mContent, i, i2, j3, j4, i3, j5, i4, i5, j6);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordSchedule)) {
            return false;
        }
        RecordSchedule recordSchedule = (RecordSchedule) obj;
        return this.mId == recordSchedule.mId && this.mTime == recordSchedule.mTime && Intrinsics.XOO0ii0(this.mLocalTime, recordSchedule.mLocalTime) && Intrinsics.XOO0ii0(this.mTitle, recordSchedule.mTitle) && Intrinsics.XOO0ii0(this.mContent, recordSchedule.mContent) && this.mIsRemindEnabled == recordSchedule.mIsRemindEnabled && this.mRepeatType == recordSchedule.mRepeatType && this.mRemindTime == recordSchedule.mRemindTime && this.mLastRemindTime == recordSchedule.mLastRemindTime && this.mStatus == recordSchedule.mStatus && this.mCalendarEventId == recordSchedule.mCalendarEventId && this.mIsSync == recordSchedule.mIsSync && this.mIsDelete == recordSchedule.mIsDelete && this.mDeviceFileId == recordSchedule.mDeviceFileId;
    }

    public final long getMCalendarEventId() {
        return this.mCalendarEventId;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public final long getMDeviceFileId() {
        return this.mDeviceFileId;
    }

    public final long getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsRemindEnabled() {
        return this.mIsRemindEnabled;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final long getMLastRemindTime() {
        return this.mLastRemindTime;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final long getMRemindTime() {
        return this.mRemindTime;
    }

    public final int getMRepeatType() {
        return this.mRepeatType;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode()) * 31) + Integer.hashCode(this.mIsRemindEnabled)) * 31) + Integer.hashCode(this.mRepeatType)) * 31) + Long.hashCode(this.mRemindTime)) * 31) + Long.hashCode(this.mLastRemindTime)) * 31) + Integer.hashCode(this.mStatus)) * 31) + Long.hashCode(this.mCalendarEventId)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Long.hashCode(this.mDeviceFileId);
    }

    public final void setMCalendarEventId(long j) {
        this.mCalendarEventId = j;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMDeviceFileId(long j) {
        this.mDeviceFileId = j;
    }

    public final void setMId(long j) {
        this.mId = j;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsRemindEnabled(int i) {
        this.mIsRemindEnabled = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLastRemindTime(long j) {
        this.mLastRemindTime = j;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMRemindTime(long j) {
        this.mRemindTime = j;
    }

    public final void setMRepeatType(int i) {
        this.mRepeatType = i;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    @aa1
    public String toString() {
        return "RecordSchedule(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mTitle=" + this.mTitle + ", mContent=" + this.mContent + ", mIsRemindEnabled=" + this.mIsRemindEnabled + ", mRepeatType=" + this.mRepeatType + ", mRemindTime=" + this.mRemindTime + ", mLastRemindTime=" + this.mLastRemindTime + ", mStatus=" + this.mStatus + ", mCalendarEventId=" + this.mCalendarEventId + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mDeviceFileId=" + this.mDeviceFileId + I000IiI1O.C2156iO.f1007iO;
    }

    public RecordSchedule(long j, long j2, @aa1 String mLocalTime, @aa1 String mTitle, @aa1 String mContent, int i, int i2, long j3, long j4, int i3, long j5, int i4, int i5, long j6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        this.mId = j;
        this.mTime = j2;
        this.mLocalTime = mLocalTime;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.mIsRemindEnabled = i;
        this.mRepeatType = i2;
        this.mRemindTime = j3;
        this.mLastRemindTime = j4;
        this.mStatus = i3;
        this.mCalendarEventId = j5;
        this.mIsSync = i4;
        this.mIsDelete = i5;
        this.mDeviceFileId = j6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecordSchedule(long j, long j2, String str, String str2, String str3, int i, int i2, long j3, long j4, int i3, long j5, int i4, int i5, long j6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        long j7 = (i6 & 1) != 0 ? 0L : j;
        long time = (i6 & 2) != 0 ? new Date().getTime() : j2;
        if ((i6 & 4) != 0) {
            str4 = O0X11OiO.XO0O10().format(Long.valueOf(time));
            Intrinsics.O10IXXX0X(str4, "format(...)");
        } else {
            str4 = str;
        }
        String str5 = (i6 & 8) != 0 ? "" : str2;
        String str6 = (i6 & 16) == 0 ? str3 : "";
        int i7 = (i6 & 32) != 0 ? 0 : i;
        int i8 = (i6 & 64) != 0 ? 0 : i2;
        long time2 = (i6 & 128) != 0 ? new Date().getTime() : j3;
        this(j7, time, str4, str5, str6, i7, i8, time2, (i6 & 256) != 0 ? time2 : j4, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? -1L : j5, (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? 0 : i5, (i6 & 8192) != 0 ? 0L : j6);
    }
}
