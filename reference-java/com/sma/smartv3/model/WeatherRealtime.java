package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WeatherRealtime extends JsonFieldContainer implements Serializable {
    private int clouds_all;

    /* JADX INFO: renamed from: dt */
    private long f51334dt;

    @aa1
    private String dt_read;
    private float feels_like;
    private int grnd_level;
    private int humidity;
    private float lat;
    private float lon;

    @aa1
    private String name;
    private int pressure;
    private float rain_1h;
    private float rain_3h;
    private int sea_level;
    private float snow_1h;
    private float snow_3h;

    @aa1
    private String sys_country;
    private int sys_id;

    @aa1
    private String sys_message;
    private long sys_sunrise;

    @aa1
    private String sys_sunrise_read;
    private long sys_sunset;

    @aa1
    private String sys_sunset_read;
    private int sys_type;
    private float temp;
    private float temp_max;
    private float temp_min;
    private int timezone;
    private long updateTime;
    private int visibility;

    @aa1
    private String weather_description;

    @aa1
    private String weather_icon;
    private int weather_id;

    @aa1
    private String weather_main;
    private int wind_deg;
    private int wind_gust;
    private float wind_speed;

    public WeatherRealtime(@aa1 String name, float f, float f2, int i, @aa1 String weather_main, @aa1 String weather_description, @aa1 String weather_icon, float f3, float f4, float f5, float f6, int i2, int i3, int i4, int i5, int i6, float f7, int i7, int i8, int i9, float f8, float f9, float f10, float f11, int i10, int i11, @aa1 String sys_message, @aa1 String sys_country, long j, @aa1 String sys_sunrise_read, long j2, @aa1 String sys_sunset_read, int i12, long j3, @aa1 String dt_read, long j4) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(weather_main, "weather_main");
        Intrinsics.X0O(weather_description, "weather_description");
        Intrinsics.X0O(weather_icon, "weather_icon");
        Intrinsics.X0O(sys_message, "sys_message");
        Intrinsics.X0O(sys_country, "sys_country");
        Intrinsics.X0O(sys_sunrise_read, "sys_sunrise_read");
        Intrinsics.X0O(sys_sunset_read, "sys_sunset_read");
        Intrinsics.X0O(dt_read, "dt_read");
        this.name = name;
        this.lat = f;
        this.lon = f2;
        this.weather_id = i;
        this.weather_main = weather_main;
        this.weather_description = weather_description;
        this.weather_icon = weather_icon;
        this.temp = f3;
        this.feels_like = f4;
        this.temp_min = f5;
        this.temp_max = f6;
        this.pressure = i2;
        this.sea_level = i3;
        this.grnd_level = i4;
        this.humidity = i5;
        this.visibility = i6;
        this.wind_speed = f7;
        this.wind_deg = i7;
        this.wind_gust = i8;
        this.clouds_all = i9;
        this.rain_1h = f8;
        this.rain_3h = f9;
        this.snow_1h = f10;
        this.snow_3h = f11;
        this.sys_type = i10;
        this.sys_id = i11;
        this.sys_message = sys_message;
        this.sys_country = sys_country;
        this.sys_sunrise = j;
        this.sys_sunrise_read = sys_sunrise_read;
        this.sys_sunset = j2;
        this.sys_sunset_read = sys_sunset_read;
        this.timezone = i12;
        this.f51334dt = j3;
        this.dt_read = dt_read;
        this.updateTime = j4;
    }

    public static /* synthetic */ WeatherRealtime copy$default(WeatherRealtime weatherRealtime, String str, float f, float f2, int i, String str2, String str3, String str4, float f3, float f4, float f5, float f6, int i2, int i3, int i4, int i5, int i6, float f7, int i7, int i8, int i9, float f8, float f9, float f10, float f11, int i10, int i11, String str5, String str6, long j, String str7, long j2, String str8, int i12, long j3, String str9, long j4, int i13, int i14, Object obj) {
        long j5;
        String str10;
        String str11 = (i13 & 1) != 0 ? weatherRealtime.name : str;
        float f12 = (i13 & 2) != 0 ? weatherRealtime.lat : f;
        float f13 = (i13 & 4) != 0 ? weatherRealtime.lon : f2;
        int i15 = (i13 & 8) != 0 ? weatherRealtime.weather_id : i;
        String str12 = (i13 & 16) != 0 ? weatherRealtime.weather_main : str2;
        String str13 = (i13 & 32) != 0 ? weatherRealtime.weather_description : str3;
        String str14 = (i13 & 64) != 0 ? weatherRealtime.weather_icon : str4;
        float f14 = (i13 & 128) != 0 ? weatherRealtime.temp : f3;
        float f15 = (i13 & 256) != 0 ? weatherRealtime.feels_like : f4;
        float f16 = (i13 & 512) != 0 ? weatherRealtime.temp_min : f5;
        float f17 = (i13 & 1024) != 0 ? weatherRealtime.temp_max : f6;
        int i16 = (i13 & 2048) != 0 ? weatherRealtime.pressure : i2;
        int i17 = (i13 & 4096) != 0 ? weatherRealtime.sea_level : i3;
        int i18 = (i13 & 8192) != 0 ? weatherRealtime.grnd_level : i4;
        String str15 = str11;
        int i19 = (i13 & 16384) != 0 ? weatherRealtime.humidity : i5;
        int i20 = (i13 & 32768) != 0 ? weatherRealtime.visibility : i6;
        float f18 = (i13 & 65536) != 0 ? weatherRealtime.wind_speed : f7;
        int i21 = (i13 & 131072) != 0 ? weatherRealtime.wind_deg : i7;
        int i22 = (i13 & 262144) != 0 ? weatherRealtime.wind_gust : i8;
        int i23 = (i13 & 524288) != 0 ? weatherRealtime.clouds_all : i9;
        float f19 = (i13 & 1048576) != 0 ? weatherRealtime.rain_1h : f8;
        float f20 = (i13 & 2097152) != 0 ? weatherRealtime.rain_3h : f9;
        float f21 = (i13 & 4194304) != 0 ? weatherRealtime.snow_1h : f10;
        float f22 = (i13 & 8388608) != 0 ? weatherRealtime.snow_3h : f11;
        int i24 = (i13 & 16777216) != 0 ? weatherRealtime.sys_type : i10;
        int i25 = (i13 & 33554432) != 0 ? weatherRealtime.sys_id : i11;
        String str16 = (i13 & 67108864) != 0 ? weatherRealtime.sys_message : str5;
        String str17 = (i13 & 134217728) != 0 ? weatherRealtime.sys_country : str6;
        int i26 = i19;
        long j6 = (i13 & 268435456) != 0 ? weatherRealtime.sys_sunrise : j;
        String str18 = (i13 & 536870912) != 0 ? weatherRealtime.sys_sunrise_read : str7;
        long j7 = (i13 & 1073741824) != 0 ? weatherRealtime.sys_sunset : j2;
        String str19 = (i13 & Integer.MIN_VALUE) != 0 ? weatherRealtime.sys_sunset_read : str8;
        int i27 = (i14 & 1) != 0 ? weatherRealtime.timezone : i12;
        long j8 = (i14 & 2) != 0 ? weatherRealtime.f51334dt : j3;
        String str20 = (i14 & 4) != 0 ? weatherRealtime.dt_read : str9;
        if ((i14 & 8) != 0) {
            str10 = str20;
            j5 = weatherRealtime.updateTime;
        } else {
            j5 = j4;
            str10 = str20;
        }
        return weatherRealtime.copy(str15, f12, f13, i15, str12, str13, str14, f14, f15, f16, f17, i16, i17, i18, i26, i20, f18, i21, i22, i23, f19, f20, f21, f22, i24, i25, str16, str17, j6, str18, j7, str19, i27, j8, str10, j5);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    public final float component10() {
        return this.temp_min;
    }

    public final float component11() {
        return this.temp_max;
    }

    public final int component12() {
        return this.pressure;
    }

    public final int component13() {
        return this.sea_level;
    }

    public final int component14() {
        return this.grnd_level;
    }

    public final int component15() {
        return this.humidity;
    }

    public final int component16() {
        return this.visibility;
    }

    public final float component17() {
        return this.wind_speed;
    }

    public final int component18() {
        return this.wind_deg;
    }

    public final int component19() {
        return this.wind_gust;
    }

    public final float component2() {
        return this.lat;
    }

    public final int component20() {
        return this.clouds_all;
    }

    public final float component21() {
        return this.rain_1h;
    }

    public final float component22() {
        return this.rain_3h;
    }

    public final float component23() {
        return this.snow_1h;
    }

    public final float component24() {
        return this.snow_3h;
    }

    public final int component25() {
        return this.sys_type;
    }

    public final int component26() {
        return this.sys_id;
    }

    @aa1
    public final String component27() {
        return this.sys_message;
    }

    @aa1
    public final String component28() {
        return this.sys_country;
    }

    public final long component29() {
        return this.sys_sunrise;
    }

    public final float component3() {
        return this.lon;
    }

    @aa1
    public final String component30() {
        return this.sys_sunrise_read;
    }

    public final long component31() {
        return this.sys_sunset;
    }

    @aa1
    public final String component32() {
        return this.sys_sunset_read;
    }

    public final int component33() {
        return this.timezone;
    }

    public final long component34() {
        return this.f51334dt;
    }

    @aa1
    public final String component35() {
        return this.dt_read;
    }

    public final long component36() {
        return this.updateTime;
    }

    public final int component4() {
        return this.weather_id;
    }

    @aa1
    public final String component5() {
        return this.weather_main;
    }

    @aa1
    public final String component6() {
        return this.weather_description;
    }

    @aa1
    public final String component7() {
        return this.weather_icon;
    }

    public final float component8() {
        return this.temp;
    }

    public final float component9() {
        return this.feels_like;
    }

    @aa1
    public final WeatherRealtime copy(@aa1 String name, float f, float f2, int i, @aa1 String weather_main, @aa1 String weather_description, @aa1 String weather_icon, float f3, float f4, float f5, float f6, int i2, int i3, int i4, int i5, int i6, float f7, int i7, int i8, int i9, float f8, float f9, float f10, float f11, int i10, int i11, @aa1 String sys_message, @aa1 String sys_country, long j, @aa1 String sys_sunrise_read, long j2, @aa1 String sys_sunset_read, int i12, long j3, @aa1 String dt_read, long j4) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(weather_main, "weather_main");
        Intrinsics.X0O(weather_description, "weather_description");
        Intrinsics.X0O(weather_icon, "weather_icon");
        Intrinsics.X0O(sys_message, "sys_message");
        Intrinsics.X0O(sys_country, "sys_country");
        Intrinsics.X0O(sys_sunrise_read, "sys_sunrise_read");
        Intrinsics.X0O(sys_sunset_read, "sys_sunset_read");
        Intrinsics.X0O(dt_read, "dt_read");
        return new WeatherRealtime(name, f, f2, i, weather_main, weather_description, weather_icon, f3, f4, f5, f6, i2, i3, i4, i5, i6, f7, i7, i8, i9, f8, f9, f10, f11, i10, i11, sys_message, sys_country, j, sys_sunrise_read, j2, sys_sunset_read, i12, j3, dt_read, j4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeatherRealtime)) {
            return false;
        }
        WeatherRealtime weatherRealtime = (WeatherRealtime) obj;
        return Intrinsics.XOO0ii0(this.name, weatherRealtime.name) && Float.compare(this.lat, weatherRealtime.lat) == 0 && Float.compare(this.lon, weatherRealtime.lon) == 0 && this.weather_id == weatherRealtime.weather_id && Intrinsics.XOO0ii0(this.weather_main, weatherRealtime.weather_main) && Intrinsics.XOO0ii0(this.weather_description, weatherRealtime.weather_description) && Intrinsics.XOO0ii0(this.weather_icon, weatherRealtime.weather_icon) && Float.compare(this.temp, weatherRealtime.temp) == 0 && Float.compare(this.feels_like, weatherRealtime.feels_like) == 0 && Float.compare(this.temp_min, weatherRealtime.temp_min) == 0 && Float.compare(this.temp_max, weatherRealtime.temp_max) == 0 && this.pressure == weatherRealtime.pressure && this.sea_level == weatherRealtime.sea_level && this.grnd_level == weatherRealtime.grnd_level && this.humidity == weatherRealtime.humidity && this.visibility == weatherRealtime.visibility && Float.compare(this.wind_speed, weatherRealtime.wind_speed) == 0 && this.wind_deg == weatherRealtime.wind_deg && this.wind_gust == weatherRealtime.wind_gust && this.clouds_all == weatherRealtime.clouds_all && Float.compare(this.rain_1h, weatherRealtime.rain_1h) == 0 && Float.compare(this.rain_3h, weatherRealtime.rain_3h) == 0 && Float.compare(this.snow_1h, weatherRealtime.snow_1h) == 0 && Float.compare(this.snow_3h, weatherRealtime.snow_3h) == 0 && this.sys_type == weatherRealtime.sys_type && this.sys_id == weatherRealtime.sys_id && Intrinsics.XOO0ii0(this.sys_message, weatherRealtime.sys_message) && Intrinsics.XOO0ii0(this.sys_country, weatherRealtime.sys_country) && this.sys_sunrise == weatherRealtime.sys_sunrise && Intrinsics.XOO0ii0(this.sys_sunrise_read, weatherRealtime.sys_sunrise_read) && this.sys_sunset == weatherRealtime.sys_sunset && Intrinsics.XOO0ii0(this.sys_sunset_read, weatherRealtime.sys_sunset_read) && this.timezone == weatherRealtime.timezone && this.f51334dt == weatherRealtime.f51334dt && Intrinsics.XOO0ii0(this.dt_read, weatherRealtime.dt_read) && this.updateTime == weatherRealtime.updateTime;
    }

    public final int getClouds_all() {
        return this.clouds_all;
    }

    public final long getDt() {
        return this.f51334dt;
    }

    @aa1
    public final String getDt_read() {
        return this.dt_read;
    }

    public final float getFeels_like() {
        return this.feels_like;
    }

    public final int getGrnd_level() {
        return this.grnd_level;
    }

    public final int getHumidity() {
        return this.humidity;
    }

    public final float getLat() {
        return this.lat;
    }

    public final float getLon() {
        return this.lon;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final int getPressure() {
        return this.pressure;
    }

    public final float getRain_1h() {
        return this.rain_1h;
    }

    public final float getRain_3h() {
        return this.rain_3h;
    }

    public final int getSea_level() {
        return this.sea_level;
    }

    public final float getSnow_1h() {
        return this.snow_1h;
    }

    public final float getSnow_3h() {
        return this.snow_3h;
    }

    @aa1
    public final String getSys_country() {
        return this.sys_country;
    }

    public final int getSys_id() {
        return this.sys_id;
    }

    @aa1
    public final String getSys_message() {
        return this.sys_message;
    }

    public final long getSys_sunrise() {
        return this.sys_sunrise;
    }

    @aa1
    public final String getSys_sunrise_read() {
        return this.sys_sunrise_read;
    }

    public final long getSys_sunset() {
        return this.sys_sunset;
    }

    @aa1
    public final String getSys_sunset_read() {
        return this.sys_sunset_read;
    }

    public final int getSys_type() {
        return this.sys_type;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final float getTemp_max() {
        return this.temp_max;
    }

    public final float getTemp_min() {
        return this.temp_min;
    }

    public final int getTimezone() {
        return this.timezone;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    @aa1
    public final String getWeather_description() {
        return this.weather_description;
    }

    @aa1
    public final String getWeather_icon() {
        return this.weather_icon;
    }

    public final int getWeather_id() {
        return this.weather_id;
    }

    @aa1
    public final String getWeather_main() {
        return this.weather_main;
    }

    public final int getWind_deg() {
        return this.wind_deg;
    }

    public final int getWind_gust() {
        return this.wind_gust;
    }

    public final float getWind_speed() {
        return this.wind_speed;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.lat)) * 31) + Float.hashCode(this.lon)) * 31) + Integer.hashCode(this.weather_id)) * 31) + this.weather_main.hashCode()) * 31) + this.weather_description.hashCode()) * 31) + this.weather_icon.hashCode()) * 31) + Float.hashCode(this.temp)) * 31) + Float.hashCode(this.feels_like)) * 31) + Float.hashCode(this.temp_min)) * 31) + Float.hashCode(this.temp_max)) * 31) + Integer.hashCode(this.pressure)) * 31) + Integer.hashCode(this.sea_level)) * 31) + Integer.hashCode(this.grnd_level)) * 31) + Integer.hashCode(this.humidity)) * 31) + Integer.hashCode(this.visibility)) * 31) + Float.hashCode(this.wind_speed)) * 31) + Integer.hashCode(this.wind_deg)) * 31) + Integer.hashCode(this.wind_gust)) * 31) + Integer.hashCode(this.clouds_all)) * 31) + Float.hashCode(this.rain_1h)) * 31) + Float.hashCode(this.rain_3h)) * 31) + Float.hashCode(this.snow_1h)) * 31) + Float.hashCode(this.snow_3h)) * 31) + Integer.hashCode(this.sys_type)) * 31) + Integer.hashCode(this.sys_id)) * 31) + this.sys_message.hashCode()) * 31) + this.sys_country.hashCode()) * 31) + Long.hashCode(this.sys_sunrise)) * 31) + this.sys_sunrise_read.hashCode()) * 31) + Long.hashCode(this.sys_sunset)) * 31) + this.sys_sunset_read.hashCode()) * 31) + Integer.hashCode(this.timezone)) * 31) + Long.hashCode(this.f51334dt)) * 31) + this.dt_read.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setClouds_all(int i) {
        this.clouds_all = i;
    }

    public final void setDt(long j) {
        this.f51334dt = j;
    }

    public final void setDt_read(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dt_read = str;
    }

    public final void setFeels_like(float f) {
        this.feels_like = f;
    }

    public final void setGrnd_level(int i) {
        this.grnd_level = i;
    }

    public final void setHumidity(int i) {
        this.humidity = i;
    }

    public final void setLat(float f) {
        this.lat = f;
    }

    public final void setLon(float f) {
        this.lon = f;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setPressure(int i) {
        this.pressure = i;
    }

    public final void setRain_1h(float f) {
        this.rain_1h = f;
    }

    public final void setRain_3h(float f) {
        this.rain_3h = f;
    }

    public final void setSea_level(int i) {
        this.sea_level = i;
    }

    public final void setSnow_1h(float f) {
        this.snow_1h = f;
    }

    public final void setSnow_3h(float f) {
        this.snow_3h = f;
    }

    public final void setSys_country(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sys_country = str;
    }

    public final void setSys_id(int i) {
        this.sys_id = i;
    }

    public final void setSys_message(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sys_message = str;
    }

    public final void setSys_sunrise(long j) {
        this.sys_sunrise = j;
    }

    public final void setSys_sunrise_read(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sys_sunrise_read = str;
    }

    public final void setSys_sunset(long j) {
        this.sys_sunset = j;
    }

    public final void setSys_sunset_read(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sys_sunset_read = str;
    }

    public final void setSys_type(int i) {
        this.sys_type = i;
    }

    public final void setTemp(float f) {
        this.temp = f;
    }

    public final void setTemp_max(float f) {
        this.temp_max = f;
    }

    public final void setTemp_min(float f) {
        this.temp_min = f;
    }

    public final void setTimezone(int i) {
        this.timezone = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setVisibility(int i) {
        this.visibility = i;
    }

    public final void setWeather_description(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.weather_description = str;
    }

    public final void setWeather_icon(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.weather_icon = str;
    }

    public final void setWeather_id(int i) {
        this.weather_id = i;
    }

    public final void setWeather_main(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.weather_main = str;
    }

    public final void setWind_deg(int i) {
        this.wind_deg = i;
    }

    public final void setWind_gust(int i) {
        this.wind_gust = i;
    }

    public final void setWind_speed(float f) {
        this.wind_speed = f;
    }

    @aa1
    public String toString() {
        return "WeatherRealtime(name=" + this.name + ", lat=" + this.lat + ", lon=" + this.lon + ", weather_id=" + this.weather_id + ", weather_main=" + this.weather_main + ", weather_description=" + this.weather_description + ", weather_icon=" + this.weather_icon + ", temp=" + this.temp + ", feels_like=" + this.feels_like + ", temp_min=" + this.temp_min + ", temp_max=" + this.temp_max + ", pressure=" + this.pressure + ", sea_level=" + this.sea_level + ", grnd_level=" + this.grnd_level + ", humidity=" + this.humidity + ", visibility=" + this.visibility + ", wind_speed=" + this.wind_speed + ", wind_deg=" + this.wind_deg + ", wind_gust=" + this.wind_gust + ", clouds_all=" + this.clouds_all + ", rain_1h=" + this.rain_1h + ", rain_3h=" + this.rain_3h + ", snow_1h=" + this.snow_1h + ", snow_3h=" + this.snow_3h + ", sys_type=" + this.sys_type + ", sys_id=" + this.sys_id + ", sys_message=" + this.sys_message + ", sys_country=" + this.sys_country + ", sys_sunrise=" + this.sys_sunrise + ", sys_sunrise_read=" + this.sys_sunrise_read + ", sys_sunset=" + this.sys_sunset + ", sys_sunset_read=" + this.sys_sunset_read + ", timezone=" + this.timezone + ", dt=" + this.f51334dt + ", dt_read=" + this.dt_read + ", updateTime=" + this.updateTime + I000IiI1O.C2156iO.f1007iO;
    }
}
