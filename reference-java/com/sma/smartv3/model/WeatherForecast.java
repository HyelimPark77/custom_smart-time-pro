package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WeatherForecast extends JsonFieldContainer implements Serializable {
    private int clouds_all;
    private int cnt;

    /* JADX INFO: renamed from: dt */
    private long f51333dt;

    @aa1
    private String dt_read;
    private float feels_like_day;
    private float feels_like_eve;
    private float feels_like_morn;
    private float feels_like_night;
    private int humidity;
    private float lat;
    private float lon;
    private int population;
    private int pressure;
    private float rain;
    private float rain_pop;
    private float snow;
    private int sys_cod;

    @aa1
    private String sys_country;
    private float sys_message;
    private long sys_sunrise;

    @aa1
    private String sys_sunrise_read;
    private long sys_sunset;

    @aa1
    private String sys_sunset_read;
    private float temp_day;
    private float temp_eve;
    private float temp_max;
    private float temp_min;
    private float temp_morn;
    private float temp_night;
    private int timezone;
    private long updateTime;
    private int uvi;

    @aa1
    private String weather_description;

    @aa1
    private String weather_icon;
    private int weather_id;

    @aa1
    private String weather_main;
    private int wind_deg;
    private float wind_gust;
    private float wind_speed;

    public WeatherForecast(float f, float f2, @aa1 String sys_country, int i, int i2, int i3, float f3, int i4, long j, @aa1 String dt_read, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i5, int i6, int i7, @aa1 String weather_main, @aa1 String weather_description, @aa1 String weather_icon, float f14, int i8, float f15, int i9, int i10, float f16, float f17, float f18, long j2, @aa1 String sys_sunrise_read, long j3, @aa1 String sys_sunset_read, long j4) {
        Intrinsics.X0O(sys_country, "sys_country");
        Intrinsics.X0O(dt_read, "dt_read");
        Intrinsics.X0O(weather_main, "weather_main");
        Intrinsics.X0O(weather_description, "weather_description");
        Intrinsics.X0O(weather_icon, "weather_icon");
        Intrinsics.X0O(sys_sunrise_read, "sys_sunrise_read");
        Intrinsics.X0O(sys_sunset_read, "sys_sunset_read");
        this.lat = f;
        this.lon = f2;
        this.sys_country = sys_country;
        this.population = i;
        this.timezone = i2;
        this.sys_cod = i3;
        this.sys_message = f3;
        this.cnt = i4;
        this.f51333dt = j;
        this.dt_read = dt_read;
        this.temp_day = f4;
        this.temp_min = f5;
        this.temp_max = f6;
        this.temp_night = f7;
        this.temp_eve = f8;
        this.temp_morn = f9;
        this.feels_like_day = f10;
        this.feels_like_night = f11;
        this.feels_like_eve = f12;
        this.feels_like_morn = f13;
        this.pressure = i5;
        this.humidity = i6;
        this.weather_id = i7;
        this.weather_main = weather_main;
        this.weather_description = weather_description;
        this.weather_icon = weather_icon;
        this.wind_speed = f14;
        this.wind_deg = i8;
        this.wind_gust = f15;
        this.clouds_all = i9;
        this.uvi = i10;
        this.rain = f16;
        this.snow = f17;
        this.rain_pop = f18;
        this.sys_sunrise = j2;
        this.sys_sunrise_read = sys_sunrise_read;
        this.sys_sunset = j3;
        this.sys_sunset_read = sys_sunset_read;
        this.updateTime = j4;
    }

    public static /* synthetic */ WeatherForecast copy$default(WeatherForecast weatherForecast, float f, float f2, String str, int i, int i2, int i3, float f3, int i4, long j, String str2, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i5, int i6, int i7, String str3, String str4, String str5, float f14, int i8, float f15, int i9, int i10, float f16, float f17, float f18, long j2, String str6, long j3, String str7, long j4, int i11, int i12, Object obj) {
        long j5;
        String str8;
        float f19 = (i11 & 1) != 0 ? weatherForecast.lat : f;
        float f20 = (i11 & 2) != 0 ? weatherForecast.lon : f2;
        String str9 = (i11 & 4) != 0 ? weatherForecast.sys_country : str;
        int i13 = (i11 & 8) != 0 ? weatherForecast.population : i;
        int i14 = (i11 & 16) != 0 ? weatherForecast.timezone : i2;
        int i15 = (i11 & 32) != 0 ? weatherForecast.sys_cod : i3;
        float f21 = (i11 & 64) != 0 ? weatherForecast.sys_message : f3;
        int i16 = (i11 & 128) != 0 ? weatherForecast.cnt : i4;
        long j6 = (i11 & 256) != 0 ? weatherForecast.f51333dt : j;
        String str10 = (i11 & 512) != 0 ? weatherForecast.dt_read : str2;
        float f22 = (i11 & 1024) != 0 ? weatherForecast.temp_day : f4;
        float f23 = (i11 & 2048) != 0 ? weatherForecast.temp_min : f5;
        float f24 = (i11 & 4096) != 0 ? weatherForecast.temp_max : f6;
        float f25 = f19;
        float f26 = (i11 & 8192) != 0 ? weatherForecast.temp_night : f7;
        float f27 = (i11 & 16384) != 0 ? weatherForecast.temp_eve : f8;
        float f28 = (i11 & 32768) != 0 ? weatherForecast.temp_morn : f9;
        float f29 = (i11 & 65536) != 0 ? weatherForecast.feels_like_day : f10;
        float f30 = (i11 & 131072) != 0 ? weatherForecast.feels_like_night : f11;
        float f31 = (i11 & 262144) != 0 ? weatherForecast.feels_like_eve : f12;
        float f32 = (i11 & 524288) != 0 ? weatherForecast.feels_like_morn : f13;
        int i17 = (i11 & 1048576) != 0 ? weatherForecast.pressure : i5;
        int i18 = (i11 & 2097152) != 0 ? weatherForecast.humidity : i6;
        int i19 = (i11 & 4194304) != 0 ? weatherForecast.weather_id : i7;
        String str11 = (i11 & 8388608) != 0 ? weatherForecast.weather_main : str3;
        String str12 = (i11 & 16777216) != 0 ? weatherForecast.weather_description : str4;
        String str13 = (i11 & 33554432) != 0 ? weatherForecast.weather_icon : str5;
        float f33 = (i11 & 67108864) != 0 ? weatherForecast.wind_speed : f14;
        int i20 = (i11 & 134217728) != 0 ? weatherForecast.wind_deg : i8;
        float f34 = (i11 & 268435456) != 0 ? weatherForecast.wind_gust : f15;
        int i21 = (i11 & 536870912) != 0 ? weatherForecast.clouds_all : i9;
        int i22 = (i11 & 1073741824) != 0 ? weatherForecast.uvi : i10;
        float f35 = (i11 & Integer.MIN_VALUE) != 0 ? weatherForecast.rain : f16;
        float f36 = (i12 & 1) != 0 ? weatherForecast.snow : f17;
        float f37 = (i12 & 2) != 0 ? weatherForecast.rain_pop : f18;
        float f38 = f27;
        long j7 = (i12 & 4) != 0 ? weatherForecast.sys_sunrise : j2;
        String str14 = (i12 & 8) != 0 ? weatherForecast.sys_sunrise_read : str6;
        long j8 = (i12 & 16) != 0 ? weatherForecast.sys_sunset : j3;
        String str15 = (i12 & 32) != 0 ? weatherForecast.sys_sunset_read : str7;
        if ((i12 & 64) != 0) {
            str8 = str15;
            j5 = weatherForecast.updateTime;
        } else {
            j5 = j4;
            str8 = str15;
        }
        return weatherForecast.copy(f25, f20, str9, i13, i14, i15, f21, i16, j6, str10, f22, f23, f24, f26, f38, f28, f29, f30, f31, f32, i17, i18, i19, str11, str12, str13, f33, i20, f34, i21, i22, f35, f36, f37, j7, str14, j8, str8, j5);
    }

    public final float component1() {
        return this.lat;
    }

    @aa1
    public final String component10() {
        return this.dt_read;
    }

    public final float component11() {
        return this.temp_day;
    }

    public final float component12() {
        return this.temp_min;
    }

    public final float component13() {
        return this.temp_max;
    }

    public final float component14() {
        return this.temp_night;
    }

    public final float component15() {
        return this.temp_eve;
    }

    public final float component16() {
        return this.temp_morn;
    }

    public final float component17() {
        return this.feels_like_day;
    }

    public final float component18() {
        return this.feels_like_night;
    }

    public final float component19() {
        return this.feels_like_eve;
    }

    public final float component2() {
        return this.lon;
    }

    public final float component20() {
        return this.feels_like_morn;
    }

    public final int component21() {
        return this.pressure;
    }

    public final int component22() {
        return this.humidity;
    }

    public final int component23() {
        return this.weather_id;
    }

    @aa1
    public final String component24() {
        return this.weather_main;
    }

    @aa1
    public final String component25() {
        return this.weather_description;
    }

    @aa1
    public final String component26() {
        return this.weather_icon;
    }

    public final float component27() {
        return this.wind_speed;
    }

    public final int component28() {
        return this.wind_deg;
    }

    public final float component29() {
        return this.wind_gust;
    }

    @aa1
    public final String component3() {
        return this.sys_country;
    }

    public final int component30() {
        return this.clouds_all;
    }

    public final int component31() {
        return this.uvi;
    }

    public final float component32() {
        return this.rain;
    }

    public final float component33() {
        return this.snow;
    }

    public final float component34() {
        return this.rain_pop;
    }

    public final long component35() {
        return this.sys_sunrise;
    }

    @aa1
    public final String component36() {
        return this.sys_sunrise_read;
    }

    public final long component37() {
        return this.sys_sunset;
    }

    @aa1
    public final String component38() {
        return this.sys_sunset_read;
    }

    public final long component39() {
        return this.updateTime;
    }

    public final int component4() {
        return this.population;
    }

    public final int component5() {
        return this.timezone;
    }

    public final int component6() {
        return this.sys_cod;
    }

    public final float component7() {
        return this.sys_message;
    }

    public final int component8() {
        return this.cnt;
    }

    public final long component9() {
        return this.f51333dt;
    }

    @aa1
    public final WeatherForecast copy(float f, float f2, @aa1 String sys_country, int i, int i2, int i3, float f3, int i4, long j, @aa1 String dt_read, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i5, int i6, int i7, @aa1 String weather_main, @aa1 String weather_description, @aa1 String weather_icon, float f14, int i8, float f15, int i9, int i10, float f16, float f17, float f18, long j2, @aa1 String sys_sunrise_read, long j3, @aa1 String sys_sunset_read, long j4) {
        Intrinsics.X0O(sys_country, "sys_country");
        Intrinsics.X0O(dt_read, "dt_read");
        Intrinsics.X0O(weather_main, "weather_main");
        Intrinsics.X0O(weather_description, "weather_description");
        Intrinsics.X0O(weather_icon, "weather_icon");
        Intrinsics.X0O(sys_sunrise_read, "sys_sunrise_read");
        Intrinsics.X0O(sys_sunset_read, "sys_sunset_read");
        return new WeatherForecast(f, f2, sys_country, i, i2, i3, f3, i4, j, dt_read, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i5, i6, i7, weather_main, weather_description, weather_icon, f14, i8, f15, i9, i10, f16, f17, f18, j2, sys_sunrise_read, j3, sys_sunset_read, j4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeatherForecast)) {
            return false;
        }
        WeatherForecast weatherForecast = (WeatherForecast) obj;
        return Float.compare(this.lat, weatherForecast.lat) == 0 && Float.compare(this.lon, weatherForecast.lon) == 0 && Intrinsics.XOO0ii0(this.sys_country, weatherForecast.sys_country) && this.population == weatherForecast.population && this.timezone == weatherForecast.timezone && this.sys_cod == weatherForecast.sys_cod && Float.compare(this.sys_message, weatherForecast.sys_message) == 0 && this.cnt == weatherForecast.cnt && this.f51333dt == weatherForecast.f51333dt && Intrinsics.XOO0ii0(this.dt_read, weatherForecast.dt_read) && Float.compare(this.temp_day, weatherForecast.temp_day) == 0 && Float.compare(this.temp_min, weatherForecast.temp_min) == 0 && Float.compare(this.temp_max, weatherForecast.temp_max) == 0 && Float.compare(this.temp_night, weatherForecast.temp_night) == 0 && Float.compare(this.temp_eve, weatherForecast.temp_eve) == 0 && Float.compare(this.temp_morn, weatherForecast.temp_morn) == 0 && Float.compare(this.feels_like_day, weatherForecast.feels_like_day) == 0 && Float.compare(this.feels_like_night, weatherForecast.feels_like_night) == 0 && Float.compare(this.feels_like_eve, weatherForecast.feels_like_eve) == 0 && Float.compare(this.feels_like_morn, weatherForecast.feels_like_morn) == 0 && this.pressure == weatherForecast.pressure && this.humidity == weatherForecast.humidity && this.weather_id == weatherForecast.weather_id && Intrinsics.XOO0ii0(this.weather_main, weatherForecast.weather_main) && Intrinsics.XOO0ii0(this.weather_description, weatherForecast.weather_description) && Intrinsics.XOO0ii0(this.weather_icon, weatherForecast.weather_icon) && Float.compare(this.wind_speed, weatherForecast.wind_speed) == 0 && this.wind_deg == weatherForecast.wind_deg && Float.compare(this.wind_gust, weatherForecast.wind_gust) == 0 && this.clouds_all == weatherForecast.clouds_all && this.uvi == weatherForecast.uvi && Float.compare(this.rain, weatherForecast.rain) == 0 && Float.compare(this.snow, weatherForecast.snow) == 0 && Float.compare(this.rain_pop, weatherForecast.rain_pop) == 0 && this.sys_sunrise == weatherForecast.sys_sunrise && Intrinsics.XOO0ii0(this.sys_sunrise_read, weatherForecast.sys_sunrise_read) && this.sys_sunset == weatherForecast.sys_sunset && Intrinsics.XOO0ii0(this.sys_sunset_read, weatherForecast.sys_sunset_read) && this.updateTime == weatherForecast.updateTime;
    }

    public final int getClouds_all() {
        return this.clouds_all;
    }

    public final int getCnt() {
        return this.cnt;
    }

    public final long getDt() {
        return this.f51333dt;
    }

    @aa1
    public final String getDt_read() {
        return this.dt_read;
    }

    public final float getFeels_like_day() {
        return this.feels_like_day;
    }

    public final float getFeels_like_eve() {
        return this.feels_like_eve;
    }

    public final float getFeels_like_morn() {
        return this.feels_like_morn;
    }

    public final float getFeels_like_night() {
        return this.feels_like_night;
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

    public final int getPopulation() {
        return this.population;
    }

    public final int getPressure() {
        return this.pressure;
    }

    public final float getRain() {
        return this.rain;
    }

    public final float getRain_pop() {
        return this.rain_pop;
    }

    public final float getSnow() {
        return this.snow;
    }

    public final int getSys_cod() {
        return this.sys_cod;
    }

    @aa1
    public final String getSys_country() {
        return this.sys_country;
    }

    public final float getSys_message() {
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

    public final float getTemp_day() {
        return this.temp_day;
    }

    public final float getTemp_eve() {
        return this.temp_eve;
    }

    public final float getTemp_max() {
        return this.temp_max;
    }

    public final float getTemp_min() {
        return this.temp_min;
    }

    public final float getTemp_morn() {
        return this.temp_morn;
    }

    public final float getTemp_night() {
        return this.temp_night;
    }

    public final int getTimezone() {
        return this.timezone;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getUvi() {
        return this.uvi;
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

    public final float getWind_gust() {
        return this.wind_gust;
    }

    public final float getWind_speed() {
        return this.wind_speed;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Float.hashCode(this.lat) * 31) + Float.hashCode(this.lon)) * 31) + this.sys_country.hashCode()) * 31) + Integer.hashCode(this.population)) * 31) + Integer.hashCode(this.timezone)) * 31) + Integer.hashCode(this.sys_cod)) * 31) + Float.hashCode(this.sys_message)) * 31) + Integer.hashCode(this.cnt)) * 31) + Long.hashCode(this.f51333dt)) * 31) + this.dt_read.hashCode()) * 31) + Float.hashCode(this.temp_day)) * 31) + Float.hashCode(this.temp_min)) * 31) + Float.hashCode(this.temp_max)) * 31) + Float.hashCode(this.temp_night)) * 31) + Float.hashCode(this.temp_eve)) * 31) + Float.hashCode(this.temp_morn)) * 31) + Float.hashCode(this.feels_like_day)) * 31) + Float.hashCode(this.feels_like_night)) * 31) + Float.hashCode(this.feels_like_eve)) * 31) + Float.hashCode(this.feels_like_morn)) * 31) + Integer.hashCode(this.pressure)) * 31) + Integer.hashCode(this.humidity)) * 31) + Integer.hashCode(this.weather_id)) * 31) + this.weather_main.hashCode()) * 31) + this.weather_description.hashCode()) * 31) + this.weather_icon.hashCode()) * 31) + Float.hashCode(this.wind_speed)) * 31) + Integer.hashCode(this.wind_deg)) * 31) + Float.hashCode(this.wind_gust)) * 31) + Integer.hashCode(this.clouds_all)) * 31) + Integer.hashCode(this.uvi)) * 31) + Float.hashCode(this.rain)) * 31) + Float.hashCode(this.snow)) * 31) + Float.hashCode(this.rain_pop)) * 31) + Long.hashCode(this.sys_sunrise)) * 31) + this.sys_sunrise_read.hashCode()) * 31) + Long.hashCode(this.sys_sunset)) * 31) + this.sys_sunset_read.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setClouds_all(int i) {
        this.clouds_all = i;
    }

    public final void setCnt(int i) {
        this.cnt = i;
    }

    public final void setDt(long j) {
        this.f51333dt = j;
    }

    public final void setDt_read(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dt_read = str;
    }

    public final void setFeels_like_day(float f) {
        this.feels_like_day = f;
    }

    public final void setFeels_like_eve(float f) {
        this.feels_like_eve = f;
    }

    public final void setFeels_like_morn(float f) {
        this.feels_like_morn = f;
    }

    public final void setFeels_like_night(float f) {
        this.feels_like_night = f;
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

    public final void setPopulation(int i) {
        this.population = i;
    }

    public final void setPressure(int i) {
        this.pressure = i;
    }

    public final void setRain(float f) {
        this.rain = f;
    }

    public final void setRain_pop(float f) {
        this.rain_pop = f;
    }

    public final void setSnow(float f) {
        this.snow = f;
    }

    public final void setSys_cod(int i) {
        this.sys_cod = i;
    }

    public final void setSys_country(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sys_country = str;
    }

    public final void setSys_message(float f) {
        this.sys_message = f;
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

    public final void setTemp_day(float f) {
        this.temp_day = f;
    }

    public final void setTemp_eve(float f) {
        this.temp_eve = f;
    }

    public final void setTemp_max(float f) {
        this.temp_max = f;
    }

    public final void setTemp_min(float f) {
        this.temp_min = f;
    }

    public final void setTemp_morn(float f) {
        this.temp_morn = f;
    }

    public final void setTemp_night(float f) {
        this.temp_night = f;
    }

    public final void setTimezone(int i) {
        this.timezone = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUvi(int i) {
        this.uvi = i;
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

    public final void setWind_gust(float f) {
        this.wind_gust = f;
    }

    public final void setWind_speed(float f) {
        this.wind_speed = f;
    }

    @aa1
    public String toString() {
        return "WeatherForecast(lat=" + this.lat + ", lon=" + this.lon + ", sys_country=" + this.sys_country + ", population=" + this.population + ", timezone=" + this.timezone + ", sys_cod=" + this.sys_cod + ", sys_message=" + this.sys_message + ", cnt=" + this.cnt + ", dt=" + this.f51333dt + ", dt_read=" + this.dt_read + ", temp_day=" + this.temp_day + ", temp_min=" + this.temp_min + ", temp_max=" + this.temp_max + ", temp_night=" + this.temp_night + ", temp_eve=" + this.temp_eve + ", temp_morn=" + this.temp_morn + ", feels_like_day=" + this.feels_like_day + ", feels_like_night=" + this.feels_like_night + ", feels_like_eve=" + this.feels_like_eve + ", feels_like_morn=" + this.feels_like_morn + ", pressure=" + this.pressure + ", humidity=" + this.humidity + ", weather_id=" + this.weather_id + ", weather_main=" + this.weather_main + ", weather_description=" + this.weather_description + ", weather_icon=" + this.weather_icon + ", wind_speed=" + this.wind_speed + ", wind_deg=" + this.wind_deg + ", wind_gust=" + this.wind_gust + ", clouds_all=" + this.clouds_all + ", uvi=" + this.uvi + ", rain=" + this.rain + ", snow=" + this.snow + ", rain_pop=" + this.rain_pop + ", sys_sunrise=" + this.sys_sunrise + ", sys_sunrise_read=" + this.sys_sunrise_read + ", sys_sunset=" + this.sys_sunset + ", sys_sunset_read=" + this.sys_sunset_read + ", updateTime=" + this.updateTime + I000IiI1O.C2156iO.f1007iO;
    }
}
