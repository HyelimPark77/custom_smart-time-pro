package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(tableName = "RecordSchedule")
public final class RecordSchedule implements Serializable {

    @aa1
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public RecordSchedule() {
        long r1 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        int r8 = 0;
        int r9 = 0;
        long r10 = 0;
        long r12 = 0;
        int r14 = 0;
        long r15 = 0;
        int r17 = 0;
        int r18 = 0;
        long r19 = 0;
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r18, r19, bm.OXO1, null);
    }

    public static /* synthetic */ RecordSchedule copy$default(RecordSchedule r18, long r19, long r21, String r23, String r24, String r25, int r26, int r27, long r28, long r30, int r32, long r33, int r35, int r36, long r37, int r39, Object r40) {
        if ((r39 & 1) == 0) goto L5;
        long r2 = r18.mId;
    L7:
        if ((r39 & 2) == 0) goto L9;
        long r4 = r18.mTime;
    L11:
        if ((r39 & 4) == 0) goto L13;
        String r6 = r18.mLocalTime;
    L15:
        if ((r39 & 8) == 0) goto L17;
        String r7 = r18.mTitle;
    L19:
        if ((r39 & 16) == 0) goto L21;
        String r8 = r18.mContent;
    L23:
        if ((r39 & 32) == 0) goto L25;
        int r9 = r18.mIsRemindEnabled;
    L27:
        if ((r39 & 64) == 0) goto L29;
        int r10 = r18.mRepeatType;
    L31:
        if ((r39 & 128) == 0) goto L33;
        long r11 = r18.mRemindTime;
    L35:
        if ((r39 & 256) == 0) goto L37;
        long r13 = r18.mLastRemindTime;
    L39:
        if ((r39 & 512) == 0) goto L41;
        int r15 = r18.mStatus;
    L42:
        long r16 = r2;
        if ((r39 & 1024) == 0) goto L45;
        long r3 = r18.mCalendarEventId;
    L46:
        long r110 = r3;
        if ((r39 & 2048) == 0) goto L49;
        int r5 = r18.mIsSync;
    L51:
        if ((r39 & 4096) == 0) goto L53;
        int r12 = r18.mIsDelete;
    L55:
        if ((r39 & 8192) == 0) goto L58;
        int r38 = r5;
        long r310 = r18.mDeviceFileId;
    L60:
        return r18.copy(r16, r4, r6, r7, r8, r9, r10, r11, r13, r15, r110, r38, r12, r310);
    L58:
        r310 = r37;
        r38 = r5;
        goto L60
    L53:
        r12 = r36;
        goto L55
    L49:
        r5 = r35;
        goto L51
    L45:
        r3 = r33;
        goto L46
    L41:
        r15 = r32;
        goto L42
    L37:
        r13 = r30;
        goto L39
    L33:
        r11 = r28;
        goto L35
    L29:
        r10 = r27;
        goto L31
    L25:
        r9 = r26;
        goto L27
    L21:
        r8 = r25;
        goto L23
    L17:
        r7 = r24;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
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
    public final RecordSchedule copy(long r23, long r25, @aa1 String r27, @aa1 String r28, @aa1 String r29, int r30, int r31, long r32, long r34, int r36, long r37, int r39, int r40, long r41) {
        Intrinsics.X0O(r27, "mLocalTime");
        Intrinsics.X0O(r28, "mTitle");
        Intrinsics.X0O(r29, "mContent");
        return new RecordSchedule(r23, r25, r27, r28, r29, r30, r31, r32, r34, r36, r37, r39, r40, r41);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof RecordSchedule) == true) goto L8;
        return false;
    L8:
        RecordSchedule r9 = (RecordSchedule) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTitle, r9.mTitle) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L24;
        return false;
    L24:
        if (this.mIsRemindEnabled == r9.mIsRemindEnabled) goto L27;
        return false;
    L27:
        if (this.mRepeatType == r9.mRepeatType) goto L30;
        return false;
    L30:
        if (this.mRemindTime == r9.mRemindTime) goto L33;
        return false;
    L33:
        if (this.mLastRemindTime == r9.mLastRemindTime) goto L36;
        return false;
    L36:
        if (this.mStatus == r9.mStatus) goto L39;
        return false;
    L39:
        if (this.mCalendarEventId == r9.mCalendarEventId) goto L42;
        return false;
    L42:
        if (this.mIsSync == r9.mIsSync) goto L45;
        return false;
    L45:
        if (this.mIsDelete == r9.mIsDelete) goto L48;
        return false;
    L48:
        if (this.mDeviceFileId == r9.mDeviceFileId) goto L50;
        return false;
    L50:
        return true;
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

    public final void setMCalendarEventId(long r1) {
        this.mCalendarEventId = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMDeviceFileId(long r1) {
        this.mDeviceFileId = r1;
    }

    public final void setMId(long r1) {
        this.mId = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsRemindEnabled(int r1) {
        this.mIsRemindEnabled = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLastRemindTime(long r1) {
        this.mLastRemindTime = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMRemindTime(long r1) {
        this.mRemindTime = r1;
    }

    public final void setMRepeatType(int r1) {
        this.mRepeatType = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    @aa1
    public String toString() {
        return "RecordSchedule(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mTitle=" + this.mTitle + ", mContent=" + this.mContent + ", mIsRemindEnabled=" + this.mIsRemindEnabled + ", mRepeatType=" + this.mRepeatType + ", mRemindTime=" + this.mRemindTime + ", mLastRemindTime=" + this.mLastRemindTime + ", mStatus=" + this.mStatus + ", mCalendarEventId=" + this.mCalendarEventId + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mDeviceFileId=" + this.mDeviceFileId + I000IiI1O.iO.iO;
    }

    public RecordSchedule(long r2, long r4, @aa1 String r6, @aa1 String r7, @aa1 String r8, int r9, int r10, long r11, long r13, int r15, long r16, int r18, int r19, long r20) {
        Intrinsics.X0O(r6, "mLocalTime");
        Intrinsics.X0O(r7, "mTitle");
        Intrinsics.X0O(r8, "mContent");
        this.mId = r2;
        this.mTime = r4;
        this.mLocalTime = r6;
        this.mTitle = r7;
        this.mContent = r8;
        this.mIsRemindEnabled = r9;
        this.mRepeatType = r10;
        this.mRemindTime = r11;
        this.mLastRemindTime = r13;
        this.mStatus = r15;
        this.mCalendarEventId = r16;
        this.mIsSync = r18;
        this.mIsDelete = r19;
        this.mDeviceFileId = r20;
    }

    public /* synthetic */ RecordSchedule(long r20, long r22, String r24, String r25, String r26, int r27, int r28, long r29, long r31, int r33, long r34, int r36, int r37, long r38, int r40, DefaultConstructorMarker r41) {
        if ((r40 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r40 & 2) == 0) goto L9;
        long r6 = new Date().getTime();
    L11:
        if ((r40 & 4) == 0) goto L13;
        String r1 = O0X11OiO.XO0O10().format(Long.valueOf(r6));
        Intrinsics.O10IXXX0X(r1, "format(...)");
    L14:
        String r9 = "";
        if ((r40 & 8) == 0) goto L17;
        String r8 = "";
    L19:
        if ((r40 & 16) != 0) goto L23;
        r9 = r26;
    L23:
        if ((r40 & 32) == 0) goto L25;
        int r10 = 0;
    L27:
        if ((r40 & 64) == 0) goto L29;
        int r12 = 0;
    L31:
        if ((r40 & 128) == 0) goto L33;
        long r13 = new Date().getTime();
    L35:
        if ((r40 & 256) == 0) goto L37;
        long r15 = r13;
    L39:
        if ((r40 & 512) == 0) goto L41;
        int r2 = 0;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        long r17 = -1;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        int r3 = 0;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        int r11 = 0;
    L55:
        if ((r40 & 8192) == 0) goto L58;
        long r39 = 0;
    L59:
        this(r4, r6, r1, r8, r9, r10, r12, r13, r15, r2, r17, r3, r11, r39);
        return;
    L58:
        r39 = r38;
        goto L59
    L53:
        r11 = r37;
        goto L55
    L49:
        r3 = r36;
        goto L51
    L45:
        r17 = r34;
        goto L47
    L41:
        r2 = r33;
        goto L43
    L37:
        r15 = r31;
        goto L39
    L33:
        r13 = r29;
        goto L35
    L29:
        r12 = r28;
        goto L31
    L25:
        r10 = r27;
        goto L27
    L17:
        r8 = r25;
        goto L19
    L13:
        r1 = r24;
        goto L14
    L9:
        r6 = r22;
        goto L11
    L5:
        r4 = r20;
        goto L7
    }
}
