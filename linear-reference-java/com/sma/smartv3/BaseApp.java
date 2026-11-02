package com.sma.smartv3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.multidex.MultiDex;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.X1OI1i;
import com.android.mltcode.paycertificationapi.XOIIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.d40;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii0iIOi;
import com.android.mltcode.paycertificationapi.ka1;
import com.android.mltcode.paycertificationapi.l87;
import com.android.mltcode.paycertificationapi.s5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tz0;
import com.android.mltcode.paycertificationapi.vi6;
import com.android.mltcode.paycertificationapi.vk4;
import com.android.mltcode.paycertificationapi.w51;
import com.bestmafen.androidbase.base.BaseApplication;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ProcessUtils;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.initializer.StockInitializer;
import com.sma.smartv3.initializer.UtilInitializer;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.initializer.WorkInitializer;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
public class BaseApp extends BaseApplication {

    @tb1
    public XOIIOO X11iII1O1;

    public BaseApp() {
    }

    @sf5(tag = b01.OIX0iXi)
    public final void XO0O10(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        XIi00iiXO();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "base");
        super.attachBaseContext(r2);
        MultiDex.install(this);
    }

    @Override // com.bestmafen.androidbase.base.BaseApplication
    @CallSuper
    public void iO(@aa1 Set<s5> r4) {
        Intrinsics.X0O(r4, "initInitializers");
        if (Intrinsics.XOO0ii0(AppUtils.getAppPackageName(), ProcessUtils.getCurrentProcessName()) == true) goto L5;
    L7:
        List r0 = CollectionsKt__CollectionsKt.iI();
    L8:
        r4.addAll(r0);
        return;
    L5:
        if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false) == false) goto L7;
        r0 = CollectionsKt__CollectionsKt.iXiX011(new s5[]{UtilInitializer.IO, X1OI1i.IO, tz0.IO, BleInitializer.IO, WeatherInitializer.IO, AGPSInitializer.IO, d40.IO, w51.IO, WorkInitializer.IO, ka1.IO, StockInitializer.IO, vi6.IO, ii0iIOi.IO, l87.IO});
        goto L8
    }

    @Override // com.bestmafen.androidbase.base.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        i72.OXO1.XOO0ii0(this);
        vk4.IO.OXO1(this);
        XOIIOO r0 = new XOIIOO(this);
        this.X11iII1O1 = r0;
        registerActivityLifecycleCallbacks(r0);
        if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false) == true) goto L6;
        O11XO1X.XO0O10().X1ii(this);
        return;
    }

    @Override // android.app.Application
    public void onTerminate() {
        unregisterActivityLifecycleCallbacks(this.X11iII1O1);
        super.onTerminate();
    }
}
