package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class WatchCallbackManager extends OnWatchCallback {
    public final ArrayList<OnWatchCallback> a;
    public final Handler b;

    public class OnWatchRunnable implements Runnable {
        public final WatchCallbackImpl a;
        public final /* synthetic */ WatchCallbackManager b;

        public OnWatchRunnable(WatchCallbackManager r1, WatchCallbackImpl r2) {
            this.b = r1;
            this.a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WatchCallbackManager.a(this.b).isEmpty() == false) goto L5;
            return;
        L5:
            if (this.a == null) goto L12;
            Iterator r0 = new ArrayList(WatchCallbackManager.a(this.b)).iterator();
        L8:
            if (r0.hasNext() == false) goto L13;
            OnWatchCallback r1 = (OnWatchCallback) r0.next();
            this.a.onCallback(r1);
            goto L8
        L13:
            return;
        }
    }

    public interface WatchCallbackImpl {
        void onCallback(OnWatchCallback r1);
    }

    public WatchCallbackManager() {
        this.a = new ArrayList();
        this.b = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ ArrayList a(WatchCallbackManager r0) {
        return r0.a;
    }

    public static /* synthetic */ void b(BluetoothDevice r0, boolean r1, OnWatchCallback r2) {
        r2.onRcspInit(r0, r1);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onBigDataError(final BluetoothDevice r2, final BaseError r3) {
        a(new XXI(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onConnectStateChange(final BluetoothDevice r2, final int r3) {
        a(new X0O(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onCurrentWatchInfo(final BluetoothDevice r2, final String r3) {
        a(new iO(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onDevicePower(final BluetoothDevice r2, final BatteryInfo r3) {
        a(new OXO1(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onExternalFlashMsg(final BluetoothDevice r2, final ExternalFlashMsgResponse r3) {
        a(new OIi0(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onExternalFlashWriteFlag(final BluetoothDevice r2, final boolean r3) {
        a(new O10IXXX0X(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onMandatoryUpgrade(final BluetoothDevice r2) {
        a(new OIX0iXi(r2));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onNetworkModuleException(final BluetoothDevice r2, final NetworkInfo r3) {
        a(new XIi00iiXO(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspCommand(final BluetoothDevice r2, final CommandBase r3) {
        a(new I0IIOi(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspDataCmd(final BluetoothDevice r2, final CommandBase r3) {
        a(new IiI10X(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspError(final BluetoothDevice r2, final BaseError r3) {
        a(new I0iXXO(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspInit(final BluetoothDevice r2, final boolean r3) {
        a(new I1XOi1(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onReceiveBigData(final BluetoothDevice r2, final int r3, final byte[] r4) {
        a(new O00(r2, r3, r4));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onResourceUpdateUnfinished(final BluetoothDevice r2) {
        a(new XOO0ii0(r2));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onWatchSystemException(final BluetoothDevice r2, final int r3) {
        a(new X1ii(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onWatchSystemInit(final int r2) {
        a(new XO0O10(r2));
    }

    public void registerWatchCallback(OnWatchCallback r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.a.contains(r2) == true) goto L8;
        this.a.add(r2);
        return;
    }

    public void release() {
        this.a.clear();
        this.b.removeCallbacksAndMessages(null);
    }

    public void unregisterWatchCallback(OnWatchCallback r2) {
        if (r2 == null) goto L5;
        this.a.remove(r2);
        return;
    }

    public static /* synthetic */ void a(BluetoothDevice r0, CommandBase r1, OnWatchCallback r2) {
        r2.onRcspCommand(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, CommandBase r1, OnWatchCallback r2) {
        r2.onRcspDataCmd(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, OnWatchCallback r1) {
        r1.onMandatoryUpgrade(r0);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, BaseError r1, OnWatchCallback r2) {
        r2.onRcspError(r0, r1);
    }

    public static /* synthetic */ void a(int r0, OnWatchCallback r1) {
        r1.onWatchSystemInit(r0);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, int r1, OnWatchCallback r2) {
        r2.onWatchSystemException(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, boolean r1, OnWatchCallback r2) {
        r2.onExternalFlashWriteFlag(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, OnWatchCallback r1) {
        r1.onResourceUpdateUnfinished(r0);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, ExternalFlashMsgResponse r1, OnWatchCallback r2) {
        r2.onExternalFlashMsg(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, String r1, OnWatchCallback r2) {
        r2.onCurrentWatchInfo(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, BatteryInfo r1, OnWatchCallback r2) {
        r2.onDevicePower(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, byte[] r2, OnWatchCallback r3) {
        r3.onReceiveBigData(r0, r1, r2);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, BaseError r1, OnWatchCallback r2) {
        r2.onBigDataError(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, OnWatchCallback r2) {
        r2.onConnectStateChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, NetworkInfo r1, OnWatchCallback r2) {
        r2.onNetworkModuleException(r0, r1);
    }

    public final void a(WatchCallbackImpl r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        OnWatchRunnable r0 = new OnWatchRunnable(this, r6);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) goto L8;
        this.b.post(r0);
        return;
    L8:
        r0.run();
    }
}
