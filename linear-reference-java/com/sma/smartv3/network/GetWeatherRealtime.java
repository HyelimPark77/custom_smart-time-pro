package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetWeatherRealtime {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final GetWeatherRealtime INSTANCE = null;

    @aa1
    public static final String LAT = "lat";

    @aa1
    public static final String LON = "lon";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/weather_info/realtime";

    @aa1
    public static final String URL_V2 = "/weather_info/realtime/v2";

    static {
        INSTANCE = new GetWeatherRealtime();
    }

    private GetWeatherRealtime() {
    }
}
