package com.sma.androidnetworklib;

import android.app.Application;
import com.android.mltcode.paycertificationapi.OiXX1X0;
import com.android.mltcode.paycertificationapi.aa1;
import com.androidnetworking.AndroidNetworking;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes18.dex */
public final class OXO1 {

    @aa1
    public static final OXO1 OXO1 = null;
    public static OkHttpClient XIi00iiXO;

    static {
        OXO1 = new OXO1();
    }

    public OXO1() {
    }

    public static /* synthetic */ void iO(OXO1 r0, Application r1, boolean r2, HttpLoggingInterceptor.Level r3, HttpLoggingInterceptor.OXO1 r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = HttpLoggingInterceptor.OXO1.OXO1;
        Intrinsics.O10IXXX0X(r4, "DEFAULT");
    L5:
        r0.XIi00iiXO(r1, r2, r3, r4);
    }

    @aa1
    public final OkHttpClient OXO1() {
        OkHttpClient r0 = XIi00iiXO;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("okHttpClient");
        return null;
    }

    public final void XIi00iiXO(@aa1 Application r5, boolean r6, @aa1 HttpLoggingInterceptor.Level r7, @aa1 HttpLoggingInterceptor.OXO1 r8) {
        Intrinsics.X0O(r5, "app");
        Intrinsics.X0O(r7, "level");
        Intrinsics.X0O(r8, OiXX1X0.X1ii);
        OkHttpClient.Builder r0 = new OkHttpClient().newBuilder();
        TimeUnit r1 = TimeUnit.SECONDS;
        OkHttpClient.Builder r2 = r0.connectTimeout(60, r1).readTimeout(60, r1).writeTimeout(60, r1);
        if (r6 == false) goto L5;
        HttpLoggingInterceptor r9 = new HttpLoggingInterceptor(r8);
        r9.O00(r7);
        r2.addInterceptor(r9);
    L5:
        XO0O10(r2.build());
        AndroidNetworking.initialize(r5, OXO1());
    }

    public final void XO0O10(@aa1 OkHttpClient r2) {
        Intrinsics.X0O(r2, "<set-?>");
        XIi00iiXO = r2;
    }
}
