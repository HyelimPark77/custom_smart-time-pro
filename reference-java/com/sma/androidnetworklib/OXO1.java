package com.sma.androidnetworklib;

import android.app.Application;
import com.android.mltcode.paycertificationapi.aa1;
import com.androidnetworking.AndroidNetworking;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes18.dex */
public final class OXO1 {

    @aa1
    public static final OXO1 OXO1 = new OXO1();
    public static OkHttpClient XIi00iiXO;

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38060iO(OXO1 oxo1, Application application, boolean z, HttpLoggingInterceptor.Level level, HttpLoggingInterceptor.OXO1 DEFAULT, int i, Object obj) {
        if ((i & 8) != 0) {
            DEFAULT = HttpLoggingInterceptor.OXO1.OXO1;
            Intrinsics.O10IXXX0X(DEFAULT, "DEFAULT");
        }
        oxo1.XIi00iiXO(application, z, level, DEFAULT);
    }

    @aa1
    public final OkHttpClient OXO1() {
        OkHttpClient okHttpClient = XIi00iiXO;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        Intrinsics.XXO("okHttpClient");
        return null;
    }

    public final void XIi00iiXO(@aa1 Application app, boolean z, @aa1 HttpLoggingInterceptor.Level level, @aa1 HttpLoggingInterceptor.OXO1 logger) {
        Intrinsics.X0O(app, "app");
        Intrinsics.X0O(level, "level");
        Intrinsics.X0O(logger, "logger");
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builderNewBuilder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit);
        if (z) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(logger);
            httpLoggingInterceptor.O00(level);
            builderWriteTimeout.addInterceptor(httpLoggingInterceptor);
        }
        XO0O10(builderWriteTimeout.build());
        AndroidNetworking.initialize(app, OXO1());
    }

    public final void XO0O10(@aa1 OkHttpClient okHttpClient) {
        Intrinsics.X0O(okHttpClient, "<set-?>");
        XIi00iiXO = okHttpClient;
    }
}
