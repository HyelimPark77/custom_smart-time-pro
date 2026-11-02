package com.sma.smartv3.screen_lock;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gw3;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes19.dex */
public final class ScreenLockService extends Service {

    @aa1
    public final Lazy IO;

    public ScreenLockService() {
        this.IO = LazyKt__LazyJVMKt.iO(new gw3(this));
    }

    public static /* synthetic */ ScreenLockService$mReceiver$2$1 OXO1(ScreenLockService r0) {
        return iO(r0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.screen_lock.ScreenLockService$mReceiver$2$1] */
    public static final ScreenLockService$mReceiver$2$1 iO(final ScreenLockService r1) {
        return new ScreenLockService$mReceiver$2$1(r1);
    }

    public final ScreenLockService$mReceiver$2$1 XIi00iiXO() {
        return (ScreenLockService$mReceiver$2$1) getValue();
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent r1) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.intent.action.SCREEN_OFF");
        r0.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(XIi00iiXO(), r0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(XIi00iiXO());
    }
}
