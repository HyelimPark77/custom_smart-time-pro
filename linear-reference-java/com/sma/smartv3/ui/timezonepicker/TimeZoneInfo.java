package com.sma.smartv3.ui.timezonepicker;

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
    public static boolean is24HourFormat;
    private static long time;
    private boolean isSelected;
    private String mCityName;
    private String mCountry;
    private String mDisplayName;
    private String mEnCityName;
    private String mKey;
    SparseArray<String> mLocalTimeCache;
    long mLocalTimeCacheReferenceTime;
    private int mRawoffset;
    private TimeZone mTimeZone;
    private String mTimeZoneId;
    private Time recycledTime;

    static {
        time = System.currentTimeMillis() / 1000;
        is24HourFormat = true;
    }

    public TimeZoneInfo(Context context, TimeZone tz, String country) {
        this.recycledTime = new Time();
        this.mLocalTimeCache = new SparseArray();
        this.mLocalTimeCacheReferenceTime = 0;
        this.mTimeZone = tz;
        this.mTimeZoneId = tz.getID();
        this.mCountry = country;
        if (tz.inDaylightTime(new Date()) == false) goto L5;
        this.mRawoffset = tz.getRawOffset() + TimeConstants.HOUR;
        this.mDisplayName = tz.getDisplayName(true, 1);
    L6:
        String[] r6 = this.mTimeZoneId.split("/");
        if (r6.length <= 1) goto L9;
        this.mEnCityName = r6[r6.length - 1].replace(HelpFormatter.DEFAULT_OPT_PREFIX, IiXI1X1OO.O00).replace(IiXI1X1OO.O00, " ");
        this.mKey = r6[r6.length - 1].replace(HelpFormatter.DEFAULT_OPT_PREFIX, IiXI1X1OO.O00).toLowerCase();
    L10:
        this.mCityName = getFinalCityName(context, this.mKey);
        return;
    L9:
        String r7 = this.mTimeZoneId;
        this.mEnCityName = r7;
        this.mKey = r7.toLowerCase();
        goto L10
    L5:
        this.mRawoffset = tz.getRawOffset();
        this.mDisplayName = tz.getDisplayName();
        goto L6
    }

    private static String formatTime(DateFormat df, int s) {
        return df.format(new Date(((long) s) * 1000));
    }

    public static String getFinalCityName(Context context, String key) {
        return context.getString(context.getResources().getIdentifier(key, TypedValues.Custom.S_STRING, context.getPackageName()));
    L4:
        return key;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(TimeZoneInfo other) {
        return compareTo2(other);
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
        TimeZone r0 = this.mTimeZone;
        return r0.getDisplayName(r0.inDaylightTime(new Date()), 0, Locale.getDefault());
    }

    public String getKey() {
        return this.mKey;
    }

    public String getLocalTime(long referenceTime) {
        Time r0 = this.recycledTime;
        r0.timezone = TimeZone.getDefault().getID();
        this.recycledTime.set(referenceTime);
        Time r1 = this.recycledTime;
        int r2 = (r1.year * 366) + r1.yearDay;
        r1.timezone = this.mTimeZoneId;
        r1.set(referenceTime);
        Time r3 = this.recycledTime;
        int r4 = (r3.hour * 60) + r3.minute;
        if (this.mLocalTimeCacheReferenceTime == referenceTime) goto L5;
        this.mLocalTimeCacheReferenceTime = referenceTime;
        this.mLocalTimeCache.clear();
        String r6 = null;
    L6:
        if (r6 != null) goto L19;
        Time r7 = this.recycledTime;
        if (r2 == ((r7.year * 366) + r7.yearDay)) goto L14;
        if (is24HourFormat == false) goto L12;
        String r8 = "%b %d %H:%M";
    L17:
        String r9 = r7.format(r8);
        this.mLocalTimeCache.put(r4, r9);
        return r9;
    L12:
        r8 = "%b %d %I:%M %p";
        goto L17
    L14:
        if (is24HourFormat == false) goto L16;
        r8 = "%H:%M";
        goto L17
    L16:
        r8 = "%I:%M %p";
        goto L17
    L19:
        return r6;
    L5:
        r6 = this.mLocalTimeCache.get(r4);
        goto L6
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
        StringBuilder r0 = new StringBuilder();
        String r1 = this.mCountry;
        TimeZone r2 = this.mTimeZone;
        r0.append(this.mTimeZoneId);
        r0.append(',');
        r0.append(r2.getDisplayName(false, 1));
        r0.append(',');
        r0.append(r2.getDisplayName(false, 0));
        r0.append(',');
        if (r2.useDaylightTime() == false) goto L5;
        r0.append(r2.getDisplayName(true, 1));
        r0.append(',');
        r0.append(r2.getDisplayName(true, 0));
    L6:
        r0.append(',');
        r0.append(r2.getRawOffset() / 3600000.0f);
        r0.append(',');
        r0.append(r2.getDSTSavings() / 3600000.0f);
        r0.append(',');
        r0.append(r1);
        r0.append(',');
        r0.append(getLocalTime(1357041600000L));
        r0.append(',');
        r0.append(getLocalTime(1363348800000L));
        r0.append(',');
        r0.append(getLocalTime(1372680000000L));
        r0.append(',');
        r0.append(getLocalTime(1383307200000L));
        r0.append(',');
        r0.append('\n');
        return r0.toString();
    L5:
        r0.append(',');
        goto L6
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(TimeZoneInfo other) {
        return this.mTimeZoneId.compareTo(other.mTimeZoneId);
    }
}
