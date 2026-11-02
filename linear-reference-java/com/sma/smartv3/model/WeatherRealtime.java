package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WeatherRealtime extends JsonFieldContainer implements Serializable {
    private int clouds_all;
    private long dt;

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

    public WeatherRealtime(@aa1 String r7, float r8, float r9, int r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, float r14, float r15, float r16, float r17, int r18, int r19, int r20, int r21, int r22, float r23, int r24, int r25, int r26, float r27, float r28, float r29, float r30, int r31, int r32, @aa1 String r33, @aa1 String r34, long r35, @aa1 String r37, long r38, @aa1 String r40, int r41, long r42, @aa1 String r44, long r45) {
        Intrinsics.X0O(r7, "name");
        Intrinsics.X0O(r11, "weather_main");
        Intrinsics.X0O(r12, "weather_description");
        Intrinsics.X0O(r13, "weather_icon");
        Intrinsics.X0O(r33, "sys_message");
        Intrinsics.X0O(r34, "sys_country");
        Intrinsics.X0O(r37, "sys_sunrise_read");
        Intrinsics.X0O(r40, "sys_sunset_read");
        Intrinsics.X0O(r44, "dt_read");
        this.name = r7;
        this.lat = r8;
        this.lon = r9;
        this.weather_id = r10;
        this.weather_main = r11;
        this.weather_description = r12;
        this.weather_icon = r13;
        this.temp = r14;
        this.feels_like = r15;
        this.temp_min = r16;
        this.temp_max = r17;
        this.pressure = r18;
        this.sea_level = r19;
        this.grnd_level = r20;
        this.humidity = r21;
        this.visibility = r22;
        this.wind_speed = r23;
        this.wind_deg = r24;
        this.wind_gust = r25;
        this.clouds_all = r26;
        this.rain_1h = r27;
        this.rain_3h = r28;
        this.snow_1h = r29;
        this.snow_3h = r30;
        this.sys_type = r31;
        this.sys_id = r32;
        this.sys_message = r33;
        this.sys_country = r34;
        this.sys_sunrise = r35;
        this.sys_sunrise_read = r37;
        this.sys_sunset = r38;
        this.sys_sunset_read = r40;
        this.timezone = r41;
        this.dt = r42;
        this.dt_read = r44;
        this.updateTime = r45;
    }

    public static /* synthetic */ WeatherRealtime copy$default(WeatherRealtime r17, String r18, float r19, float r20, int r21, String r22, String r23, String r24, float r25, float r26, float r27, float r28, int r29, int r30, int r31, int r32, int r33, float r34, int r35, int r36, int r37, float r38, float r39, float r40, float r41, int r42, int r43, String r44, String r45, long r46, String r48, long r49, String r51, int r52, long r53, String r55, long r56, int r58, int r59, Object r60) {
        if ((r58 & 1) == 0) goto L5;
        String r2 = r17.name;
    L7:
        if ((r58 & 2) == 0) goto L9;
        float r3 = r17.lat;
    L11:
        if ((r58 & 4) == 0) goto L13;
        float r4 = r17.lon;
    L15:
        if ((r58 & 8) == 0) goto L17;
        int r5 = r17.weather_id;
    L19:
        if ((r58 & 16) == 0) goto L21;
        String r6 = r17.weather_main;
    L23:
        if ((r58 & 32) == 0) goto L25;
        String r7 = r17.weather_description;
    L27:
        if ((r58 & 64) == 0) goto L29;
        String r8 = r17.weather_icon;
    L31:
        if ((r58 & 128) == 0) goto L33;
        float r9 = r17.temp;
    L35:
        if ((r58 & 256) == 0) goto L37;
        float r10 = r17.feels_like;
    L39:
        if ((r58 & 512) == 0) goto L41;
        float r11 = r17.temp_min;
    L43:
        if ((r58 & 1024) == 0) goto L45;
        float r12 = r17.temp_max;
    L47:
        if ((r58 & 2048) == 0) goto L49;
        int r13 = r17.pressure;
    L51:
        if ((r58 & 4096) == 0) goto L53;
        int r14 = r17.sea_level;
    L55:
        if ((r58 & 8192) == 0) goto L57;
        int r15 = r17.grnd_level;
    L58:
        String r110 = r2;
        if ((r58 & 16384) == 0) goto L61;
        int r16 = r17.humidity;
    L63:
        if ((r58 & 32768) == 0) goto L65;
        int r1 = r17.visibility;
    L66:
        int r111 = r1;
        if ((r58 & 65536) == 0) goto L69;
        float r47 = r17.wind_speed;
    L70:
        float r210 = r47;
        if ((r58 & 131072) == 0) goto L73;
        int r50 = r17.wind_deg;
    L74:
        int r211 = r50;
        if ((r58 & 262144) == 0) goto L77;
        int r54 = r17.wind_gust;
    L78:
        int r212 = r54;
        if ((r58 & 524288) == 0) goto L81;
        int r57 = r17.clouds_all;
    L82:
        int r213 = r57;
        if ((r58 & 1048576) == 0) goto L85;
        float r61 = r17.rain_1h;
    L86:
        float r214 = r61;
        if ((r58 & 2097152) == 0) goto L89;
        float r62 = r17.rain_3h;
    L90:
        float r215 = r62;
        if ((r58 & 4194304) == 0) goto L93;
        float r63 = r17.snow_1h;
    L94:
        float r216 = r63;
        if ((r58 & 8388608) == 0) goto L97;
        float r64 = r17.snow_3h;
    L98:
        float r217 = r64;
        if ((r58 & 16777216) == 0) goto L101;
        int r65 = r17.sys_type;
    L102:
        int r218 = r65;
        if ((r58 & 33554432) == 0) goto L105;
        int r66 = r17.sys_id;
    L106:
        int r219 = r66;
        if ((r58 & 67108864) == 0) goto L109;
        String r67 = r17.sys_message;
    L110:
        String r310 = r67;
        if ((r58 & 134217728) == 0) goto L113;
        String r68 = r17.sys_country;
    L114:
        String r311 = r68;
        int r312 = r16;
        if ((r58 & 268435456) == 0) goto L117;
        long r69 = r17.sys_sunrise;
    L118:
        long r313 = r69;
        if ((r58 & 536870912) == 0) goto L121;
        String r70 = r17.sys_sunrise_read;
    L122:
        String r314 = r70;
        if ((r58 & 1073741824) == 0) goto L125;
        long r71 = r17.sys_sunset;
    L126:
        long r315 = r71;
        if ((r58 & Integer.MIN_VALUE) == 0) goto L129;
        String r72 = r17.sys_sunset_read;
    L131:
        if ((r59 & 1) == 0) goto L133;
        int r73 = r17.timezone;
    L134:
        String r316 = r72;
        int r317 = r73;
        if ((r59 & 2) == 0) goto L137;
        long r74 = r17.dt;
    L138:
        long r410 = r74;
        if ((r59 & 4) == 0) goto L141;
        String r75 = r17.dt_read;
    L143:
        if ((r59 & 8) == 0) goto L146;
        String r411 = r75;
        String r510 = r411;
        long r511 = r17.updateTime;
    L148:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r312, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r310, r311, r313, r314, r315, r316, r317, r410, r510, r511);
    L146:
        r511 = r56;
        r510 = r75;
        goto L148
    L141:
        r75 = r55;
        goto L143
    L137:
        r74 = r53;
        goto L138
    L133:
        r73 = r52;
        goto L134
    L129:
        r72 = r51;
        goto L131
    L125:
        r71 = r49;
        goto L126
    L121:
        r70 = r48;
        goto L122
    L117:
        r69 = r46;
        goto L118
    L113:
        r68 = r45;
        goto L114
    L109:
        r67 = r44;
        goto L110
    L105:
        r66 = r43;
        goto L106
    L101:
        r65 = r42;
        goto L102
    L97:
        r64 = r41;
        goto L98
    L93:
        r63 = r40;
        goto L94
    L89:
        r62 = r39;
        goto L90
    L85:
        r61 = r38;
        goto L86
    L81:
        r57 = r37;
        goto L82
    L77:
        r54 = r36;
        goto L78
    L73:
        r50 = r35;
        goto L74
    L69:
        r47 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
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
        return this.dt;
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
    public final WeatherRealtime copy(@aa1 String r43, float r44, float r45, int r46, @aa1 String r47, @aa1 String r48, @aa1 String r49, float r50, float r51, float r52, float r53, int r54, int r55, int r56, int r57, int r58, float r59, int r60, int r61, int r62, float r63, float r64, float r65, float r66, int r67, int r68, @aa1 String r69, @aa1 String r70, long r71, @aa1 String r73, long r74, @aa1 String r76, int r77, long r78, @aa1 String r80, long r81) {
        Intrinsics.X0O(r43, "name");
        Intrinsics.X0O(r47, "weather_main");
        Intrinsics.X0O(r48, "weather_description");
        Intrinsics.X0O(r49, "weather_icon");
        Intrinsics.X0O(r69, "sys_message");
        Intrinsics.X0O(r70, "sys_country");
        Intrinsics.X0O(r73, "sys_sunrise_read");
        Intrinsics.X0O(r76, "sys_sunset_read");
        Intrinsics.X0O(r80, "dt_read");
        return new WeatherRealtime(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r73, r74, r76, r77, r78, r80, r81);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WeatherRealtime) == true) goto L8;
        return false;
    L8:
        WeatherRealtime r9 = (WeatherRealtime) r8;
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.lat, r9.lat) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.lon, r9.lon) == 0) goto L18;
        return false;
    L18:
        if (this.weather_id == r9.weather_id) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.weather_main, r9.weather_main) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.weather_description, r9.weather_description) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.weather_icon, r9.weather_icon) == true) goto L30;
        return false;
    L30:
        if (Float.compare(this.temp, r9.temp) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.feels_like, r9.feels_like) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.temp_min, r9.temp_min) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.temp_max, r9.temp_max) == 0) goto L42;
        return false;
    L42:
        if (this.pressure == r9.pressure) goto L45;
        return false;
    L45:
        if (this.sea_level == r9.sea_level) goto L48;
        return false;
    L48:
        if (this.grnd_level == r9.grnd_level) goto L51;
        return false;
    L51:
        if (this.humidity == r9.humidity) goto L54;
        return false;
    L54:
        if (this.visibility == r9.visibility) goto L57;
        return false;
    L57:
        if (Float.compare(this.wind_speed, r9.wind_speed) == 0) goto L60;
        return false;
    L60:
        if (this.wind_deg == r9.wind_deg) goto L63;
        return false;
    L63:
        if (this.wind_gust == r9.wind_gust) goto L66;
        return false;
    L66:
        if (this.clouds_all == r9.clouds_all) goto L69;
        return false;
    L69:
        if (Float.compare(this.rain_1h, r9.rain_1h) == 0) goto L72;
        return false;
    L72:
        if (Float.compare(this.rain_3h, r9.rain_3h) == 0) goto L75;
        return false;
    L75:
        if (Float.compare(this.snow_1h, r9.snow_1h) == 0) goto L78;
        return false;
    L78:
        if (Float.compare(this.snow_3h, r9.snow_3h) == 0) goto L81;
        return false;
    L81:
        if (this.sys_type == r9.sys_type) goto L84;
        return false;
    L84:
        if (this.sys_id == r9.sys_id) goto L87;
        return false;
    L87:
        if (Intrinsics.XOO0ii0(this.sys_message, r9.sys_message) == true) goto L90;
        return false;
    L90:
        if (Intrinsics.XOO0ii0(this.sys_country, r9.sys_country) == true) goto L93;
        return false;
    L93:
        if (this.sys_sunrise == r9.sys_sunrise) goto L96;
        return false;
    L96:
        if (Intrinsics.XOO0ii0(this.sys_sunrise_read, r9.sys_sunrise_read) == true) goto L99;
        return false;
    L99:
        if (this.sys_sunset == r9.sys_sunset) goto L102;
        return false;
    L102:
        if (Intrinsics.XOO0ii0(this.sys_sunset_read, r9.sys_sunset_read) == true) goto L105;
        return false;
    L105:
        if (this.timezone == r9.timezone) goto L108;
        return false;
    L108:
        if (this.dt == r9.dt) goto L111;
        return false;
    L111:
        if (Intrinsics.XOO0ii0(this.dt_read, r9.dt_read) == true) goto L114;
        return false;
    L114:
        if (this.updateTime == r9.updateTime) goto L116;
        return false;
    L116:
        return true;
    }

    public final int getClouds_all() {
        return this.clouds_all;
    }

    public final long getDt() {
        return this.dt;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.lat)) * 31) + Float.hashCode(this.lon)) * 31) + Integer.hashCode(this.weather_id)) * 31) + this.weather_main.hashCode()) * 31) + this.weather_description.hashCode()) * 31) + this.weather_icon.hashCode()) * 31) + Float.hashCode(this.temp)) * 31) + Float.hashCode(this.feels_like)) * 31) + Float.hashCode(this.temp_min)) * 31) + Float.hashCode(this.temp_max)) * 31) + Integer.hashCode(this.pressure)) * 31) + Integer.hashCode(this.sea_level)) * 31) + Integer.hashCode(this.grnd_level)) * 31) + Integer.hashCode(this.humidity)) * 31) + Integer.hashCode(this.visibility)) * 31) + Float.hashCode(this.wind_speed)) * 31) + Integer.hashCode(this.wind_deg)) * 31) + Integer.hashCode(this.wind_gust)) * 31) + Integer.hashCode(this.clouds_all)) * 31) + Float.hashCode(this.rain_1h)) * 31) + Float.hashCode(this.rain_3h)) * 31) + Float.hashCode(this.snow_1h)) * 31) + Float.hashCode(this.snow_3h)) * 31) + Integer.hashCode(this.sys_type)) * 31) + Integer.hashCode(this.sys_id)) * 31) + this.sys_message.hashCode()) * 31) + this.sys_country.hashCode()) * 31) + Long.hashCode(this.sys_sunrise)) * 31) + this.sys_sunrise_read.hashCode()) * 31) + Long.hashCode(this.sys_sunset)) * 31) + this.sys_sunset_read.hashCode()) * 31) + Integer.hashCode(this.timezone)) * 31) + Long.hashCode(this.dt)) * 31) + this.dt_read.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setClouds_all(int r1) {
        this.clouds_all = r1;
    }

    public final void setDt(long r1) {
        this.dt = r1;
    }

    public final void setDt_read(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dt_read = r2;
    }

    public final void setFeels_like(float r1) {
        this.feels_like = r1;
    }

    public final void setGrnd_level(int r1) {
        this.grnd_level = r1;
    }

    public final void setHumidity(int r1) {
        this.humidity = r1;
    }

    public final void setLat(float r1) {
        this.lat = r1;
    }

    public final void setLon(float r1) {
        this.lon = r1;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setPressure(int r1) {
        this.pressure = r1;
    }

    public final void setRain_1h(float r1) {
        this.rain_1h = r1;
    }

    public final void setRain_3h(float r1) {
        this.rain_3h = r1;
    }

    public final void setSea_level(int r1) {
        this.sea_level = r1;
    }

    public final void setSnow_1h(float r1) {
        this.snow_1h = r1;
    }

    public final void setSnow_3h(float r1) {
        this.snow_3h = r1;
    }

    public final void setSys_country(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sys_country = r2;
    }

    public final void setSys_id(int r1) {
        this.sys_id = r1;
    }

    public final void setSys_message(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sys_message = r2;
    }

    public final void setSys_sunrise(long r1) {
        this.sys_sunrise = r1;
    }

    public final void setSys_sunrise_read(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sys_sunrise_read = r2;
    }

    public final void setSys_sunset(long r1) {
        this.sys_sunset = r1;
    }

    public final void setSys_sunset_read(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sys_sunset_read = r2;
    }

    public final void setSys_type(int r1) {
        this.sys_type = r1;
    }

    public final void setTemp(float r1) {
        this.temp = r1;
    }

    public final void setTemp_max(float r1) {
        this.temp_max = r1;
    }

    public final void setTemp_min(float r1) {
        this.temp_min = r1;
    }

    public final void setTimezone(int r1) {
        this.timezone = r1;
    }

    public final void setUpdateTime(long r1) {
        this.updateTime = r1;
    }

    public final void setVisibility(int r1) {
        this.visibility = r1;
    }

    public final void setWeather_description(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weather_description = r2;
    }

    public final void setWeather_icon(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weather_icon = r2;
    }

    public final void setWeather_id(int r1) {
        this.weather_id = r1;
    }

    public final void setWeather_main(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weather_main = r2;
    }

    public final void setWind_deg(int r1) {
        this.wind_deg = r1;
    }

    public final void setWind_gust(int r1) {
        this.wind_gust = r1;
    }

    public final void setWind_speed(float r1) {
        this.wind_speed = r1;
    }

    @aa1
    public String toString() {
        return "WeatherRealtime(name=" + this.name + ", lat=" + this.lat + ", lon=" + this.lon + ", weather_id=" + this.weather_id + ", weather_main=" + this.weather_main + ", weather_description=" + this.weather_description + ", weather_icon=" + this.weather_icon + ", temp=" + this.temp + ", feels_like=" + this.feels_like + ", temp_min=" + this.temp_min + ", temp_max=" + this.temp_max + ", pressure=" + this.pressure + ", sea_level=" + this.sea_level + ", grnd_level=" + this.grnd_level + ", humidity=" + this.humidity + ", visibility=" + this.visibility + ", wind_speed=" + this.wind_speed + ", wind_deg=" + this.wind_deg + ", wind_gust=" + this.wind_gust + ", clouds_all=" + this.clouds_all + ", rain_1h=" + this.rain_1h + ", rain_3h=" + this.rain_3h + ", snow_1h=" + this.snow_1h + ", snow_3h=" + this.snow_3h + ", sys_type=" + this.sys_type + ", sys_id=" + this.sys_id + ", sys_message=" + this.sys_message + ", sys_country=" + this.sys_country + ", sys_sunrise=" + this.sys_sunrise + ", sys_sunrise_read=" + this.sys_sunrise_read + ", sys_sunset=" + this.sys_sunset + ", sys_sunset_read=" + this.sys_sunset_read + ", timezone=" + this.timezone + ", dt=" + this.dt + ", dt_read=" + this.dt_read + ", updateTime=" + this.updateTime + I000IiI1O.iO.iO;
    }
}
