package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.BleSchedule;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class Schedule {
    private static final Calendar CALENDAR = null;

    @aa1
    public static final Companion Companion = null;

    @ColumnInfo
    private int mAdvance;

    @aa1
    @ColumnInfo
    private String mContent;

    @ColumnInfo
    private int mDay;

    @ColumnInfo
    private int mHour;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mMinute;

    @ColumnInfo
    private int mMonth;

    @ColumnInfo
    private int mScheduleId;

    @aa1
    @ColumnInfo
    private String mTitle;

    @ColumnInfo
    private int mYear;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        CALENDAR = Calendar.getInstance();
    }

    public Schedule() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ Schedule copy$default(Schedule r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mScheduleId;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mYear;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mMonth;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mDay;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mHour;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mMinute;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mAdvance;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mTitle;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mContent;
    L32:
        String r13 = r9;
        String r14 = r10;
        int r15 = r7;
        int r16 = r8;
        int r17 = r5;
        int r18 = r6;
        int r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component10() {
        return this.mContent;
    }

    public final int component2() {
        return this.mScheduleId;
    }

    public final int component3() {
        return this.mYear;
    }

    public final int component4() {
        return this.mMonth;
    }

    public final int component5() {
        return this.mDay;
    }

    public final int component6() {
        return this.mHour;
    }

    public final int component7() {
        return this.mMinute;
    }

    public final int component8() {
        return this.mAdvance;
    }

    @aa1
    public final String component9() {
        return this.mTitle;
    }

    @aa1
    public final Schedule copy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r21, "mTitle");
        Intrinsics.X0O(r22, "mContent");
        return new Schedule(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Schedule) == true) goto L8;
        return false;
    L8:
        Schedule r6 = (Schedule) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (this.mScheduleId == r6.mScheduleId) goto L15;
        return false;
    L15:
        if (this.mYear == r6.mYear) goto L18;
        return false;
    L18:
        if (this.mMonth == r6.mMonth) goto L21;
        return false;
    L21:
        if (this.mDay == r6.mDay) goto L24;
        return false;
    L24:
        if (this.mHour == r6.mHour) goto L27;
        return false;
    L27:
        if (this.mMinute == r6.mMinute) goto L30;
        return false;
    L30:
        if (this.mAdvance == r6.mAdvance) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mTitle, r6.mTitle) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mContent, r6.mContent) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final int getMAdvance() {
        return this.mAdvance;
    }

    @aa1
    public final BleSchedule getMBleSchedule() {
        return new BleSchedule(this.mYear, this.mMonth, this.mDay, this.mHour, this.mMinute, this.mAdvance, this.mTitle, this.mContent);
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final Date getMDate() {
        Calendar r0 = CALENDAR;
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, this.mYear);
        OIi1iX.OII(r0, this.mMonth);
        OIi1iX.IIX1OXO(r0, this.mDay);
        OIi1iX.iIiiO(r0, this.mHour);
        OIi1iX.OiIIX101O(r0, this.mMinute);
        Date r1 = r0.getTime();
        Intrinsics.O10IXXX0X(r1, "getTime(...)");
        return r1;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMHour() {
        return this.mHour;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    public final int getMScheduleId() {
        return this.mScheduleId;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mScheduleId)) * 31) + Integer.hashCode(this.mYear)) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mAdvance)) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMAdvance(int r1) {
        this.mAdvance = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMScheduleId(int r1) {
        this.mScheduleId = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "Schedule(mId=" + this.mId + ", mScheduleId=" + this.mScheduleId + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mAdvance=" + this.mAdvance + ", mTitle=" + this.mTitle + ", mContent=" + this.mContent + I000IiI1O.iO.iO;
    }

    public Schedule(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r10, "mTitle");
        Intrinsics.X0O(r11, "mContent");
        this.mId = r2;
        this.mScheduleId = r3;
        this.mYear = r4;
        this.mMonth = r5;
        this.mDay = r6;
        this.mHour = r7;
        this.mMinute = r8;
        this.mAdvance = r9;
        this.mTitle = r10;
        this.mContent = r11;
    }

    public /* synthetic */ Schedule(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r14 = "";
    L32:
        String r15 = r10;
        int r16 = r9;
        int r17 = r8;
        int r18 = r7;
        int r19 = r6;
        int r20 = r5;
        int r21 = r4;
        this(r2, r3, r21, r20, r19, r18, r17, r16, r15, r14);
        return;
    L33:
        r14 = r11;
        goto L32
    }
}
