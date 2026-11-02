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

    @tb1
    public ServiceReceiver IO;

    public final class ServiceReceiver extends BroadcastReceiver {
        public final /* synthetic */ LocalService OXO1;

        public ServiceReceiver(LocalService r1) {
            this.OXO1 = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@tb1 Context r3, @tb1 Intent r4) {
            if (r4 == null) goto L9;
            String r5 = r4.getAction();
            if (r5 != null) goto L6;
            return;
        L6:
            if (Intrinsics.XOO0ii0(r5, "android.intent.action.TIME_TICK") == false) goto L11;
            i1O0OXO1O.OXO1.OXO1("LocalService -> is running, connector state is " + BleConnector.INSTANCE.isAvailable());
            return;
        L11:
            return;
        }
    }

    public LocalService() {
    }

    public final void OXO1() {
        if (this.IO != null) goto L5;
        this.IO = new ServiceReceiver(this);
    L5:
        ServiceReceiver r0 = this.IO;
        if (r0 == null) goto L9;
        IntentFilter r1 = new IntentFilter();
        r1.addAction("android.intent.action.TIME_TICK");
        Unit r2 = Unit.OXO1;
        registerReceiver(r0, r1);
        return;
    }

    public final void XIi00iiXO() {
        ServiceReceiver r0 = this.IO;
        if (r0 == null) goto L6;
        unregisterReceiver(r0);
        this.IO = null;
        return;
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent r1) {
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
    public int onStartCommand(@tb1 Intent r1, int r2, int r3) {
        OXO1.XOO0ii0.OXO1().IO(this);
        return 1;
    }
}
