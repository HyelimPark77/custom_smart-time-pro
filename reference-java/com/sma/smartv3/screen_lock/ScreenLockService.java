package com.sma.smartv3.screen_lock;

import android.app.KeyguardManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.sport.SportScreenLockActivity;
import com.sma.smartv3.screen_lock.ScreenLockService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ScreenLockService extends Service {

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Lazy f54416IO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gw3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScreenLockService.m38293iO(this.f6976IO);
        }
    });

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.screen_lock.ScreenLockService$mReceiver$2$1] */
    /* JADX INFO: renamed from: iO */
    public static final ScreenLockService$mReceiver$2$1 m38293iO(final ScreenLockService screenLockService) {
        return new BroadcastReceiver() { // from class: com.sma.smartv3.screen_lock.ScreenLockService$mReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                Object systemService = context.getSystemService("keyguard");
                Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                KeyguardManager keyguardManager = (KeyguardManager) systemService;
                if (oe5.I0i1OXiI(intent.getAction(), "android.intent.action.SCREEN_OFF", false, 2, null)) {
                    Intent intent2 = new Intent(context, (Class<?>) SportScreenLockActivity.class);
                    intent2.addFlags(276824064);
                    this.OXO1.startActivity(intent2);
                } else if (oe5.I0i1OXiI(intent.getAction(), "android.intent.action.USER_PRESENT", false, 2, null) && keyguardManager.isKeyguardSecure()) {
                    I01XX0.XIi00iiXO(I01XX0.i11I, null, 2, null);
                }
            }
        };
    }

    public final ScreenLockService$mReceiver$2$1 XIi00iiXO() {
        return (ScreenLockService$mReceiver$2$1) this.f54416IO.getValue();
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(XIi00iiXO(), intentFilter);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(XIi00iiXO());
    }
}
