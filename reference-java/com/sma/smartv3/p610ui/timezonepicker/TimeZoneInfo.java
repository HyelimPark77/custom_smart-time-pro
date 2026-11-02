package com.sma.smartv3.p610ui.timezonepicker;

import android.content.Context;
import android.text.format.Time;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.blankj.utilcode.constant.TimeConstants;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneInfo implements Comparable<TimeZoneInfo>, Serializable {
    private static final char SEPARATOR = ',';
    private boolean isSelected;
    private String mCityName;
    private String mCountry;
    private String mDisplayName;
    private String mEnCityName;
    private String mKey;
    private int mRawoffset;
    private TimeZone mTimeZone;
    private String mTimeZoneId;
    private static long time = System.currentTimeMillis() / 1000;
    public static boolean is24HourFormat = true;
    private Time recycledTime = new Time();
    SparseArray<String> mLocalTimeCache = new SparseArray<>();
    long mLocalTimeCacheReferenceTime = 0;

    public TimeZoneInfo(Context context, TimeZone tz, String country) {
        this.mTimeZone = tz;
        this.mTimeZoneId = tz.getID();
        this.mCountry = country;
        if (tz.inDaylightTime(new Date())) {
            this.mRawoffset = tz.getRawOffset() + TimeConstants.HOUR;
            this.mDisplayName = tz.getDisplayName(true, 1);
        } else {
            this.mRawoffset = tz.getRawOffset();
            this.mDisplayName = tz.getDisplayName();
        }
        String[] strArrSplit = this.mTimeZoneId.split("/");
        if (strArrSplit.length > 1) {
            this.mEnCityName = strArrSplit[strArrSplit.length - 1].replace(HelpFormatter.DEFAULT_OPT_PREFIX, IiXI1X1OO.O00).replace(IiXI1X1OO.O00, " ");
            this.mKey = strArrSplit[strArrSplit.length - 1].replace(HelpFormatter.DEFAULT_OPT_PREFIX, IiXI1X1OO.O00).toLowerCase();
        } else {
            String str = this.mTimeZoneId;
            this.mEnCityName = str;
            this.mKey = str.toLowerCase();
        }
        this.mCityName = getFinalCityName(context, this.mKey);
    }

    private static String formatTime(DateFormat df, int s) {
        return df.format(new Date(((long) s) * 1000));
    }

    public static String getFinalCityName(Context context, String key) {
        try {
            return context.getString(context.getResources().getIdentifier(key, TypedValues.Custom.S_STRING, context.getPackageName()));
        } catch (Exception unused) {
            return key;
        }
    }

    public String getCityName() {
        return this.mCityName;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getEnCityName() {
        return this.mEnCityName;
    }

    public String getGMTName() {
        TimeZone timeZone = this.mTimeZone;
        return timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0, Locale.getDefault());
    }

    public String getKey() {
        return this.mKey;
    }

    public String getLocalTime(long referenceTime) {
        String str;
        String str2;
        this.recycledTime.timezone = TimeZone.getDefault().getID();
        this.recycledTime.set(referenceTime);
        Time time2 = this.recycledTime;
        int i = (time2.year * 366) + time2.yearDay;
        time2.timezone = this.mTimeZoneId;
        time2.set(referenceTime);
        Time time3 = this.recycledTime;
        int i2 = (time3.hour * 60) + time3.minute;
        if (this.mLocalTimeCacheReferenceTime != referenceTime) {
            this.mLocalTimeCacheReferenceTime = referenceTime;
            this.mLocalTimeCache.clear();
            str = null;
        } else {
            str = this.mLocalTimeCache.get(i2);
        }
        if (str != null) {
            return str;
        }
        Time time4 = this.recycledTime;
        if (i != (time4.year * 366) + time4.yearDay) {
            str2 = is24HourFormat ? "%b %d %H:%M" : "%b %d %I:%M %p";
        } else {
            str2 = is24HourFormat ? "%H:%M" : "%I:%M %p";
        }
        String str3 = time4.format(str2);
        this.mLocalTimeCache.put(i2, str3);
        return str3;
    }

    public int getRawoffset() {
        return this.mRawoffset;
    }

    public String getTimeZoneId() {
        return this.mTimeZoneId;
    }

    public boolean hasSameRules(TimeZoneInfo tzi) {
        return this.mTimeZone.hasSameRules(tzi.mTimeZone);
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.mCountry;
        TimeZone timeZone = this.mTimeZone;
        sb.append(this.mTimeZoneId);
        sb.append(',');
        sb.append(timeZone.getDisplayName(false, 1));
        sb.append(',');
        sb.append(timeZone.getDisplayName(false, 0));
        sb.append(',');
        if (timeZone.useDaylightTime()) {
            sb.append(timeZone.getDisplayName(true, 1));
            sb.append(',');
            sb.append(timeZone.getDisplayName(true, 0));
        } else {
            sb.append(',');
        }
        sb.append(',');
        sb.append(timeZone.getRawOffset() / 3600000.0f);
        sb.append(',');
        sb.append(timeZone.getDSTSavings() / 3600000.0f);
        sb.append(',');
        sb.append(str);
        sb.append(',');
        sb.append(getLocalTime(1357041600000L));
        sb.append(',');
        sb.append(getLocalTime(1363348800000L));
        sb.append(',');
        sb.append(getLocalTime(1372680000000L));
        sb.append(',');
        sb.append(getLocalTime(1383307200000L));
        sb.append(',');
        sb.append('\n');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeZoneInfo other) {
        return this.mTimeZoneId.compareTo(other.mTimeZoneId);
    }
}
