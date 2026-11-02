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
    private long dt;

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

    public WeatherForecast(float r8, float r9, @aa1 String r10, int r11, int r12, int r13, float r14, int r15, long r16, @aa1 String r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, int r29, int r30, int r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, float r35, int r36, float r37, int r38, int r39, float r40, float r41, float r42, long r43, @aa1 String r45, long r46, @aa1 String r48, long r49) {
        Intrinsics.X0O(r10, "sys_country");
        Intrinsics.X0O(r18, "dt_read");
        Intrinsics.X0O(r32, "weather_main");
        Intrinsics.X0O(r33, "weather_description");
        Intrinsics.X0O(r34, "weather_icon");
        Intrinsics.X0O(r45, "sys_sunrise_read");
        Intrinsics.X0O(r48, "sys_sunset_read");
        this.lat = r8;
        this.lon = r9;
        this.sys_country = r10;
        this.population = r11;
        this.timezone = r12;
        this.sys_cod = r13;
        this.sys_message = r14;
        this.cnt = r15;
        this.dt = r16;
        this.dt_read = r18;
        this.temp_day = r19;
        this.temp_min = r20;
        this.temp_max = r21;
        this.temp_night = r22;
        this.temp_eve = r23;
        this.temp_morn = r24;
        this.feels_like_day = r25;
        this.feels_like_night = r26;
        this.feels_like_eve = r27;
        this.feels_like_morn = r28;
        this.pressure = r29;
        this.humidity = r30;
        this.weather_id = r31;
        this.weather_main = r32;
        this.weather_description = r33;
        this.weather_icon = r34;
        this.wind_speed = r35;
        this.wind_deg = r36;
        this.wind_gust = r37;
        this.clouds_all = r38;
        this.uvi = r39;
        this.rain = r40;
        this.snow = r41;
        this.rain_pop = r42;
        this.sys_sunrise = r43;
        this.sys_sunrise_read = r45;
        this.sys_sunset = r46;
        this.sys_sunset_read = r48;
        this.updateTime = r49;
    }

    public static /* synthetic */ WeatherForecast copy$default(WeatherForecast r17, float r18, float r19, String r20, int r21, int r22, int r23, float r24, int r25, long r26, String r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, int r41, String r42, String r43, String r44, float r45, int r46, float r47, int r48, int r49, float r50, float r51, float r52, long r53, String r55, long r56, String r58, long r59, int r61, int r62, Object r63) {
        if ((r61 & 1) == 0) goto L5;
        float r2 = r17.lat;
    L7:
        if ((r61 & 2) == 0) goto L9;
        float r3 = r17.lon;
    L11:
        if ((r61 & 4) == 0) goto L13;
        String r4 = r17.sys_country;
    L15:
        if ((r61 & 8) == 0) goto L17;
        int r5 = r17.population;
    L19:
        if ((r61 & 16) == 0) goto L21;
        int r6 = r17.timezone;
    L23:
        if ((r61 & 32) == 0) goto L25;
        int r7 = r17.sys_cod;
    L27:
        if ((r61 & 64) == 0) goto L29;
        float r8 = r17.sys_message;
    L31:
        if ((r61 & 128) == 0) goto L33;
        int r9 = r17.cnt;
    L35:
        if ((r61 & 256) == 0) goto L37;
        long r10 = r17.dt;
    L39:
        if ((r61 & 512) == 0) goto L41;
        String r12 = r17.dt_read;
    L43:
        if ((r61 & 1024) == 0) goto L45;
        float r13 = r17.temp_day;
    L47:
        if ((r61 & 2048) == 0) goto L49;
        float r14 = r17.temp_min;
    L51:
        if ((r61 & 4096) == 0) goto L53;
        float r15 = r17.temp_max;
    L54:
        float r110 = r2;
        if ((r61 & 8192) == 0) goto L57;
        float r11 = r17.temp_night;
    L58:
        float r111 = r11;
        if ((r61 & 16384) == 0) goto L61;
        float r16 = r17.temp_eve;
    L63:
        if ((r61 & 32768) == 0) goto L65;
        float r1 = r17.temp_morn;
    L66:
        float r27 = r1;
        if ((r61 & 65536) == 0) goto L69;
        float r54 = r17.feels_like_day;
    L70:
        float r210 = r54;
        if ((r61 & 131072) == 0) goto L73;
        float r57 = r17.feels_like_night;
    L74:
        float r211 = r57;
        if ((r61 & 262144) == 0) goto L77;
        float r60 = r17.feels_like_eve;
    L78:
        float r212 = r60;
        if ((r61 & 524288) == 0) goto L81;
        float r64 = r17.feels_like_morn;
    L82:
        float r213 = r64;
        if ((r61 & 1048576) == 0) goto L85;
        int r65 = r17.pressure;
    L86:
        int r214 = r65;
        if ((r61 & 2097152) == 0) goto L89;
        int r66 = r17.humidity;
    L90:
        int r215 = r66;
        if ((r61 & 4194304) == 0) goto L93;
        int r67 = r17.weather_id;
    L94:
        int r216 = r67;
        if ((r61 & 8388608) == 0) goto L97;
        String r68 = r17.weather_main;
    L98:
        String r217 = r68;
        if ((r61 & 16777216) == 0) goto L101;
        String r69 = r17.weather_description;
    L102:
        String r218 = r69;
        if ((r61 & 33554432) == 0) goto L105;
        String r70 = r17.weather_icon;
    L106:
        String r310 = r70;
        if ((r61 & 67108864) == 0) goto L109;
        float r71 = r17.wind_speed;
    L110:
        float r311 = r71;
        if ((r61 & 134217728) == 0) goto L113;
        int r72 = r17.wind_deg;
    L114:
        int r312 = r72;
        if ((r61 & 268435456) == 0) goto L117;
        float r73 = r17.wind_gust;
    L118:
        float r313 = r73;
        if ((r61 & 536870912) == 0) goto L121;
        int r74 = r17.clouds_all;
    L122:
        int r314 = r74;
        if ((r61 & 1073741824) == 0) goto L125;
        int r75 = r17.uvi;
    L126:
        int r315 = r75;
        if ((r61 & Integer.MIN_VALUE) == 0) goto L129;
        float r76 = r17.rain;
    L130:
        float r316 = r76;
        if ((r62 & 1) == 0) goto L133;
        float r77 = r17.snow;
    L134:
        float r317 = r77;
        if ((r62 & 2) == 0) goto L137;
        float r78 = r17.rain_pop;
    L138:
        float r318 = r78;
        float r610 = r16;
        if ((r62 & 4) == 0) goto L141;
        long r79 = r17.sys_sunrise;
    L142:
        long r319 = r79;
        if ((r62 & 8) == 0) goto L145;
        String r80 = r17.sys_sunrise_read;
    L146:
        String r410 = r80;
        if ((r62 & 16) == 0) goto L149;
        long r81 = r17.sys_sunset;
    L150:
        long r411 = r81;
        if ((r62 & 32) == 0) goto L153;
        String r82 = r17.sys_sunset_read;
    L155:
        if ((r62 & 64) == 0) goto L158;
        String r412 = r82;
        String r510 = r412;
        long r611 = r17.updateTime;
    L160:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r111, r610, r27, r210, r211, r212, r213, r214, r215, r216, r217, r218, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r410, r411, r510, r611);
    L158:
        r611 = r59;
        r510 = r82;
        goto L160
    L153:
        r82 = r58;
        goto L155
    L149:
        r81 = r56;
        goto L150
    L145:
        r80 = r55;
        goto L146
    L141:
        r79 = r53;
        goto L142
    L137:
        r78 = r52;
        goto L138
    L133:
        r77 = r51;
        goto L134
    L129:
        r76 = r50;
        goto L130
    L125:
        r75 = r49;
        goto L126
    L121:
        r74 = r48;
        goto L122
    L117:
        r73 = r47;
        goto L118
    L113:
        r72 = r46;
        goto L114
    L109:
        r71 = r45;
        goto L110
    L105:
        r70 = r44;
        goto L106
    L101:
        r69 = r43;
        goto L102
    L97:
        r68 = r42;
        goto L98
    L93:
        r67 = r41;
        goto L94
    L89:
        r66 = r40;
        goto L90
    L85:
        r65 = r39;
        goto L86
    L81:
        r64 = r38;
        goto L82
    L77:
        r60 = r37;
        goto L78
    L73:
        r57 = r36;
        goto L74
    L69:
        r54 = r35;
        goto L70
    L65:
        r1 = r34;
        goto L66
    L61:
        r16 = r33;
        goto L63
    L57:
        r11 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
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
        return this.dt;
    }

    @aa1
    public final WeatherForecast copy(float r46, float r47, @aa1 String r48, int r49, int r50, int r51, float r52, int r53, long r54, @aa1 String r56, float r57, float r58, float r59, float r60, float r61, float r62, float r63, float r64, float r65, float r66, int r67, int r68, int r69, @aa1 String r70, @aa1 String r71, @aa1 String r72, float r73, int r74, float r75, int r76, int r77, float r78, float r79, float r80, long r81, @aa1 String r83, long r84, @aa1 String r86, long r87) {
        Intrinsics.X0O(r48, "sys_country");
        Intrinsics.X0O(r56, "dt_read");
        Intrinsics.X0O(r70, "weather_main");
        Intrinsics.X0O(r71, "weather_description");
        Intrinsics.X0O(r72, "weather_icon");
        Intrinsics.X0O(r83, "sys_sunrise_read");
        Intrinsics.X0O(r86, "sys_sunset_read");
        return new WeatherForecast(r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r83, r84, r86, r87);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WeatherForecast) == true) goto L8;
        return false;
    L8:
        WeatherForecast r9 = (WeatherForecast) r8;
        if (Float.compare(this.lat, r9.lat) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.lon, r9.lon) == 0) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.sys_country, r9.sys_country) == true) goto L18;
        return false;
    L18:
        if (this.population == r9.population) goto L21;
        return false;
    L21:
        if (this.timezone == r9.timezone) goto L24;
        return false;
    L24:
        if (this.sys_cod == r9.sys_cod) goto L27;
        return false;
    L27:
        if (Float.compare(this.sys_message, r9.sys_message) == 0) goto L30;
        return false;
    L30:
        if (this.cnt == r9.cnt) goto L33;
        return false;
    L33:
        if (this.dt == r9.dt) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.dt_read, r9.dt_read) == true) goto L39;
        return false;
    L39:
        if (Float.compare(this.temp_day, r9.temp_day) == 0) goto L42;
        return false;
    L42:
        if (Float.compare(this.temp_min, r9.temp_min) == 0) goto L45;
        return false;
    L45:
        if (Float.compare(this.temp_max, r9.temp_max) == 0) goto L48;
        return false;
    L48:
        if (Float.compare(this.temp_night, r9.temp_night) == 0) goto L51;
        return false;
    L51:
        if (Float.compare(this.temp_eve, r9.temp_eve) == 0) goto L54;
        return false;
    L54:
        if (Float.compare(this.temp_morn, r9.temp_morn) == 0) goto L57;
        return false;
    L57:
        if (Float.compare(this.feels_like_day, r9.feels_like_day) == 0) goto L60;
        return false;
    L60:
        if (Float.compare(this.feels_like_night, r9.feels_like_night) == 0) goto L63;
        return false;
    L63:
        if (Float.compare(this.feels_like_eve, r9.feels_like_eve) == 0) goto L66;
        return false;
    L66:
        if (Float.compare(this.feels_like_morn, r9.feels_like_morn) == 0) goto L69;
        return false;
    L69:
        if (this.pressure == r9.pressure) goto L72;
        return false;
    L72:
        if (this.humidity == r9.humidity) goto L75;
        return false;
    L75:
        if (this.weather_id == r9.weather_id) goto L78;
        return false;
    L78:
        if (Intrinsics.XOO0ii0(this.weather_main, r9.weather_main) == true) goto L81;
        return false;
    L81:
        if (Intrinsics.XOO0ii0(this.weather_description, r9.weather_description) == true) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.weather_icon, r9.weather_icon) == true) goto L87;
        return false;
    L87:
        if (Float.compare(this.wind_speed, r9.wind_speed) == 0) goto L90;
        return false;
    L90:
        if (this.wind_deg == r9.wind_deg) goto L93;
        return false;
    L93:
        if (Float.compare(this.wind_gust, r9.wind_gust) == 0) goto L96;
        return false;
    L96:
        if (this.clouds_all == r9.clouds_all) goto L99;
        return false;
    L99:
        if (this.uvi == r9.uvi) goto L102;
        return false;
    L102:
        if (Float.compare(this.rain, r9.rain) == 0) goto L105;
        return false;
    L105:
        if (Float.compare(this.snow, r9.snow) == 0) goto L108;
        return false;
    L108:
        if (Float.compare(this.rain_pop, r9.rain_pop) == 0) goto L111;
        return false;
    L111:
        if (this.sys_sunrise == r9.sys_sunrise) goto L114;
        return false;
    L114:
        if (Intrinsics.XOO0ii0(this.sys_sunrise_read, r9.sys_sunrise_read) == true) goto L117;
        return false;
    L117:
        if (this.sys_sunset == r9.sys_sunset) goto L120;
        return false;
    L120:
        if (Intrinsics.XOO0ii0(this.sys_sunset_read, r9.sys_sunset_read) == true) goto L123;
        return false;
    L123:
        if (this.updateTime == r9.updateTime) goto L125;
        return false;
    L125:
        return true;
    }

    public final int getClouds_all() {
        return this.clouds_all;
    }

    public final int getCnt() {
        return this.cnt;
    }

    public final long getDt() {
        return this.dt;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Float.hashCode(this.lat) * 31) + Float.hashCode(this.lon)) * 31) + this.sys_country.hashCode()) * 31) + Integer.hashCode(this.population)) * 31) + Integer.hashCode(this.timezone)) * 31) + Integer.hashCode(this.sys_cod)) * 31) + Float.hashCode(this.sys_message)) * 31) + Integer.hashCode(this.cnt)) * 31) + Long.hashCode(this.dt)) * 31) + this.dt_read.hashCode()) * 31) + Float.hashCode(this.temp_day)) * 31) + Float.hashCode(this.temp_min)) * 31) + Float.hashCode(this.temp_max)) * 31) + Float.hashCode(this.temp_night)) * 31) + Float.hashCode(this.temp_eve)) * 31) + Float.hashCode(this.temp_morn)) * 31) + Float.hashCode(this.feels_like_day)) * 31) + Float.hashCode(this.feels_like_night)) * 31) + Float.hashCode(this.feels_like_eve)) * 31) + Float.hashCode(this.feels_like_morn)) * 31) + Integer.hashCode(this.pressure)) * 31) + Integer.hashCode(this.humidity)) * 31) + Integer.hashCode(this.weather_id)) * 31) + this.weather_main.hashCode()) * 31) + this.weather_description.hashCode()) * 31) + this.weather_icon.hashCode()) * 31) + Float.hashCode(this.wind_speed)) * 31) + Integer.hashCode(this.wind_deg)) * 31) + Float.hashCode(this.wind_gust)) * 31) + Integer.hashCode(this.clouds_all)) * 31) + Integer.hashCode(this.uvi)) * 31) + Float.hashCode(this.rain)) * 31) + Float.hashCode(this.snow)) * 31) + Float.hashCode(this.rain_pop)) * 31) + Long.hashCode(this.sys_sunrise)) * 31) + this.sys_sunrise_read.hashCode()) * 31) + Long.hashCode(this.sys_sunset)) * 31) + this.sys_sunset_read.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setClouds_all(int r1) {
        this.clouds_all = r1;
    }

    public final void setCnt(int r1) {
        this.cnt = r1;
    }

    public final void setDt(long r1) {
        this.dt = r1;
    }

    public final void setDt_read(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dt_read = r2;
    }

    public final void setFeels_like_day(float r1) {
        this.feels_like_day = r1;
    }

    public final void setFeels_like_eve(float r1) {
        this.feels_like_eve = r1;
    }

    public final void setFeels_like_morn(float r1) {
        this.feels_like_morn = r1;
    }

    public final void setFeels_like_night(float r1) {
        this.feels_like_night = r1;
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

    public final void setPopulation(int r1) {
        this.population = r1;
    }

    public final void setPressure(int r1) {
        this.pressure = r1;
    }

    public final void setRain(float r1) {
        this.rain = r1;
    }

    public final void setRain_pop(float r1) {
        this.rain_pop = r1;
    }

    public final void setSnow(float r1) {
        this.snow = r1;
    }

    public final void setSys_cod(int r1) {
        this.sys_cod = r1;
    }

    public final void setSys_country(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sys_country = r2;
    }

    public final void setSys_message(float r1) {
        this.sys_message = r1;
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

    public final void setTemp_day(float r1) {
        this.temp_day = r1;
    }

    public final void setTemp_eve(float r1) {
        this.temp_eve = r1;
    }

    public final void setTemp_max(float r1) {
        this.temp_max = r1;
    }

    public final void setTemp_min(float r1) {
        this.temp_min = r1;
    }

    public final void setTemp_morn(float r1) {
        this.temp_morn = r1;
    }

    public final void setTemp_night(float r1) {
        this.temp_night = r1;
    }

    public final void setTimezone(int r1) {
        this.timezone = r1;
    }

    public final void setUpdateTime(long r1) {
        this.updateTime = r1;
    }

    public final void setUvi(int r1) {
        this.uvi = r1;
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

    public final void setWind_gust(float r1) {
        this.wind_gust = r1;
    }

    public final void setWind_speed(float r1) {
        this.wind_speed = r1;
    }

    @aa1
    public String toString() {
        return "WeatherForecast(lat=" + this.lat + ", lon=" + this.lon + ", sys_country=" + this.sys_country + ", population=" + this.population + ", timezone=" + this.timezone + ", sys_cod=" + this.sys_cod + ", sys_message=" + this.sys_message + ", cnt=" + this.cnt + ", dt=" + this.dt + ", dt_read=" + this.dt_read + ", temp_day=" + this.temp_day + ", temp_min=" + this.temp_min + ", temp_max=" + this.temp_max + ", temp_night=" + this.temp_night + ", temp_eve=" + this.temp_eve + ", temp_morn=" + this.temp_morn + ", feels_like_day=" + this.feels_like_day + ", feels_like_night=" + this.feels_like_night + ", feels_like_eve=" + this.feels_like_eve + ", feels_like_morn=" + this.feels_like_morn + ", pressure=" + this.pressure + ", humidity=" + this.humidity + ", weather_id=" + this.weather_id + ", weather_main=" + this.weather_main + ", weather_description=" + this.weather_description + ", weather_icon=" + this.weather_icon + ", wind_speed=" + this.wind_speed + ", wind_deg=" + this.wind_deg + ", wind_gust=" + this.wind_gust + ", clouds_all=" + this.clouds_all + ", uvi=" + this.uvi + ", rain=" + this.rain + ", snow=" + this.snow + ", rain_pop=" + this.rain_pop + ", sys_sunrise=" + this.sys_sunrise + ", sys_sunrise_read=" + this.sys_sunrise_read + ", sys_sunset=" + this.sys_sunset + ", sys_sunset_read=" + this.sys_sunset_read + ", updateTime=" + this.updateTime + I000IiI1O.iO.iO;
    }
}
