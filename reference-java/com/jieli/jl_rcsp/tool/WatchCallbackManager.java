package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class WatchCallbackManager extends OnWatchCallback {

    /* JADX INFO: renamed from: a */
    public final ArrayList<OnWatchCallback> f38283a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Handler f38284b = new Handler(Looper.getMainLooper());

    public class OnWatchRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WatchCallbackImpl f38285a;

        public OnWatchRunnable(WatchCallbackImpl watchCallbackImpl) {
            this.f38285a = watchCallbackImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WatchCallbackManager.this.f38283a.isEmpty() || this.f38285a == null) {
                return;
            }
            Iterator it = new ArrayList(WatchCallbackManager.this.f38283a).iterator();
            while (it.hasNext()) {
                this.f38285a.onCallback((OnWatchCallback) it.next());
            }
        }
    }

    public interface WatchCallbackImpl {
        void onCallback(OnWatchCallback onWatchCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onBigDataError(final BluetoothDevice bluetoothDevice, final BaseError baseError) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.XXI
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onBigDataError(bluetoothDevice, baseError);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onConnectStateChange(final BluetoothDevice bluetoothDevice, final int i) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.X0O
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onConnectStateChange(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onCurrentWatchInfo(final BluetoothDevice bluetoothDevice, final String str) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.iO
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onCurrentWatchInfo(bluetoothDevice, str);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onDevicePower(final BluetoothDevice bluetoothDevice, final BatteryInfo batteryInfo) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.OXO1
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onDevicePower(bluetoothDevice, batteryInfo);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onExternalFlashMsg(final BluetoothDevice bluetoothDevice, final ExternalFlashMsgResponse externalFlashMsgResponse) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.OIi0
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onExternalFlashMsg(bluetoothDevice, externalFlashMsgResponse);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onExternalFlashWriteFlag(final BluetoothDevice bluetoothDevice, final boolean z) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.O10IXXX0X
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onExternalFlashWriteFlag(bluetoothDevice, z);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onMandatoryUpgrade(final BluetoothDevice bluetoothDevice) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.OIX0iXi
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onMandatoryUpgrade(bluetoothDevice);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onNetworkModuleException(final BluetoothDevice bluetoothDevice, final NetworkInfo networkInfo) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.XIi00iiXO
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onNetworkModuleException(bluetoothDevice, networkInfo);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspCommand(final BluetoothDevice bluetoothDevice, final CommandBase commandBase) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.I0IIOi
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onRcspCommand(bluetoothDevice, commandBase);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspDataCmd(final BluetoothDevice bluetoothDevice, final CommandBase commandBase) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.IiI10X
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onRcspDataCmd(bluetoothDevice, commandBase);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspError(final BluetoothDevice bluetoothDevice, final BaseError baseError) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.I0iXXO
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onRcspError(bluetoothDevice, baseError);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspInit(final BluetoothDevice bluetoothDevice, final boolean z) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.I1XOi1
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onRcspInit(bluetoothDevice, z);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onReceiveBigData(final BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.O00
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onReceiveBigData(bluetoothDevice, i, bArr);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onResourceUpdateUnfinished(final BluetoothDevice bluetoothDevice) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.XOO0ii0
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onResourceUpdateUnfinished(bluetoothDevice);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onWatchSystemException(final BluetoothDevice bluetoothDevice, final int i) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.X1ii
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onWatchSystemException(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback
    public void onWatchSystemInit(final int i) {
        m27738a(new WatchCallbackImpl() { // from class: com.jieli.jl_rcsp.tool.XO0O10
            @Override // com.jieli.jl_rcsp.tool.WatchCallbackManager.WatchCallbackImpl
            public final void onCallback(OnWatchCallback onWatchCallback) {
                onWatchCallback.onWatchSystemInit(i);
            }
        });
    }

    public void registerWatchCallback(OnWatchCallback onWatchCallback) {
        if (onWatchCallback == null || this.f38283a.contains(onWatchCallback)) {
            return;
        }
        this.f38283a.add(onWatchCallback);
    }

    public void release() {
        this.f38283a.clear();
        this.f38284b.removeCallbacksAndMessages(null);
    }

    public void unregisterWatchCallback(OnWatchCallback onWatchCallback) {
        if (onWatchCallback != null) {
            this.f38283a.remove(onWatchCallback);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27738a(WatchCallbackImpl watchCallbackImpl) {
        if (watchCallbackImpl == null) {
            return;
        }
        OnWatchRunnable onWatchRunnable = new OnWatchRunnable(watchCallbackImpl);
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            this.f38284b.post(onWatchRunnable);
        } else {
            onWatchRunnable.run();
        }
    }
}
