package com.sma.smartv3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.multidex.MultiDex;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
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
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
public class BaseApp extends BaseApplication {

    @tb1
    public XOIIOO X11iII1O1;

    @sf5(tag = b01.OIX0iXi)
    public final void XO0O10(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        XIi00iiXO();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@aa1 Context base) {
        Intrinsics.X0O(base, "base");
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override // com.bestmafen.androidbase.base.BaseApplication
    @CallSuper
    /* JADX INFO: renamed from: iO */
    public void mo11115iO(@aa1 Set<InterfaceC2909s5> initInitializers) {
        Intrinsics.X0O(initInitializers, "initInitializers");
        initInitializers.addAll((Intrinsics.XOO0ii0(AppUtils.getAppPackageName(), ProcessUtils.getCurrentProcessName()) && a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false)) ? CollectionsKt__CollectionsKt.iXiX011(UtilInitializer.f51279IO, X1OI1i.f4301IO, tz0.f11393IO, BleInitializer.f51208IO, WeatherInitializer.f51281IO, AGPSInitializer.f51206IO, d40.f6123IO, w51.f11886IO, WorkInitializer.f51287IO, ka1.f9133IO, StockInitializer.f51276IO, vi6.f11726IO, ii0iIOi.f8533IO, l87.f9387IO) : CollectionsKt__CollectionsKt.m39402iI());
    }

    @Override // com.bestmafen.androidbase.base.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        i72.OXO1.XOO0ii0(this);
        vk4.f11741IO.OXO1(this);
        XOIIOO xoiioo = new XOIIOO(this);
        this.X11iII1O1 = xoiioo;
        registerActivityLifecycleCallbacks(xoiioo);
        if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false)) {
            return;
        }
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        unregisterActivityLifecycleCallbacks(this.X11iII1O1);
        super.onTerminate();
    }
}
