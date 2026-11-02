package com.sma.smartv3.biz;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConnector;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LocalService extends Service {

    /* JADX INFO: renamed from: IO */
    @tb1
    public ServiceReceiver f50880IO;

    public final class ServiceReceiver extends BroadcastReceiver {
        public ServiceReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@tb1 Context context, @tb1 Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null || !Intrinsics.XOO0ii0(action, "android.intent.action.TIME_TICK")) {
                return;
            }
            i1O0OXO1O.OXO1.OXO1("LocalService -> is running, connector state is " + BleConnector.INSTANCE.isAvailable());
        }
    }

    public final void OXO1() {
        if (this.f50880IO == null) {
            this.f50880IO = new ServiceReceiver();
        }
        ServiceReceiver serviceReceiver = this.f50880IO;
        if (serviceReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            Unit unit = Unit.OXO1;
            registerReceiver(serviceReceiver, intentFilter);
        }
    }

    public final void XIi00iiXO() {
        ServiceReceiver serviceReceiver = this.f50880IO;
        if (serviceReceiver != null) {
            unregisterReceiver(serviceReceiver);
            this.f50880IO = null;
        }
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        OXO1();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        OXO1.XOO0ii0.OXO1().IiI10X(this);
        XIi00iiXO();
    }

    @Override // android.app.Service
    public int onStartCommand(@tb1 Intent intent, int i, int i2) {
        OXO1.XOO0ii0.OXO1().m38102IO(this);
        return 1;
    }
}
