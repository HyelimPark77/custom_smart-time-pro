package com.sma.smartv3.p608db.entity;

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

    @aa1
    public static final Companion Companion = new Companion(null);
    private static final Calendar CALENDAR = Calendar.getInstance();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Schedule() {
        this(0, 0, 0, 0, 0, 0, 0, 0, null, null, 1023, null);
    }

    public static /* synthetic */ Schedule copy$default(Schedule schedule, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = schedule.mId;
        }
        if ((i9 & 2) != 0) {
            i2 = schedule.mScheduleId;
        }
        if ((i9 & 4) != 0) {
            i3 = schedule.mYear;
        }
        if ((i9 & 8) != 0) {
            i4 = schedule.mMonth;
        }
        if ((i9 & 16) != 0) {
            i5 = schedule.mDay;
        }
        if ((i9 & 32) != 0) {
            i6 = schedule.mHour;
        }
        if ((i9 & 64) != 0) {
            i7 = schedule.mMinute;
        }
        if ((i9 & 128) != 0) {
            i8 = schedule.mAdvance;
        }
        if ((i9 & 256) != 0) {
            str = schedule.mTitle;
        }
        if ((i9 & 512) != 0) {
            str2 = schedule.mContent;
        }
        String str3 = str;
        String str4 = str2;
        int i10 = i7;
        int i11 = i8;
        int i12 = i5;
        int i13 = i6;
        return schedule.copy(i, i2, i3, i4, i12, i13, i10, i11, str3, str4);
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
    public final Schedule copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        return new Schedule(i, i2, i3, i4, i5, i6, i7, i8, mTitle, mContent);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Schedule)) {
            return false;
        }
        Schedule schedule = (Schedule) obj;
        return this.mId == schedule.mId && this.mScheduleId == schedule.mScheduleId && this.mYear == schedule.mYear && this.mMonth == schedule.mMonth && this.mDay == schedule.mDay && this.mHour == schedule.mHour && this.mMinute == schedule.mMinute && this.mAdvance == schedule.mAdvance && Intrinsics.XOO0ii0(this.mTitle, schedule.mTitle) && Intrinsics.XOO0ii0(this.mContent, schedule.mContent);
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
        Calendar calendar = CALENDAR;
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, this.mYear);
        OIi1iX.OII(calendar, this.mMonth);
        OIi1iX.IIX1OXO(calendar, this.mDay);
        OIi1iX.iIiiO(calendar, this.mHour);
        OIi1iX.OiIIX101O(calendar, this.mMinute);
        Date time = calendar.getTime();
        Intrinsics.O10IXXX0X(time, "getTime(...)");
        return time;
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

    public final void setMAdvance(int i) {
        this.mAdvance = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMDay(int i) {
        this.mDay = i;
    }

    public final void setMHour(int i) {
        this.mHour = i;
    }

    public final void setMMinute(int i) {
        this.mMinute = i;
    }

    public final void setMMonth(int i) {
        this.mMonth = i;
    }

    public final void setMScheduleId(int i) {
        this.mScheduleId = i;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    public final void setMYear(int i) {
        this.mYear = i;
    }

    @aa1
    public String toString() {
        return "Schedule(mId=" + this.mId + ", mScheduleId=" + this.mScheduleId + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mAdvance=" + this.mAdvance + ", mTitle=" + this.mTitle + ", mContent=" + this.mContent + I000IiI1O.C2156iO.f1007iO;
    }

    public Schedule(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        this.mId = i;
        this.mScheduleId = i2;
        this.mYear = i3;
        this.mMonth = i4;
        this.mDay = i5;
        this.mHour = i6;
        this.mMinute = i7;
        this.mAdvance = i8;
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public /* synthetic */ Schedule(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) != 0 ? 0 : i8, (i9 & 256) != 0 ? "" : str, (i9 & 512) != 0 ? "" : str2);
    }
}
