package com.jieli.watchtesttool.tool.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class BtEventCbManager {
    private final Handler mHandler;
    private final ArrayList<BluetoothEventListener> mListeners;

    public static abstract class BtEventCbImpl {
        private BtEventCbImpl() {
        }

        public abstract void onCallback(BluetoothEventListener r1);

        public /* synthetic */ BtEventCbImpl(AnonymousClass1 r1) {
            this();
        }
    }

    public class BtEventCbRunnable implements Runnable {
        private final BtEventCbImpl mBtEventCb;
        final /* synthetic */ BtEventCbManager this$0;

        public /* synthetic */ BtEventCbRunnable(BtEventCbManager r1, BtEventCbImpl r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mBtEventCb != null) goto L6;
            return;
        L6:
            if (BtEventCbManager.access$200(this.this$0).isEmpty() == true) goto L14;
            Iterator r0 = new ArrayList(BtEventCbManager.access$200(this.this$0)).iterator();
        L9:
            if (r0.hasNext() == false) goto L21;
            BluetoothEventListener r1 = (BluetoothEventListener) r0.next();
            if (r1 == null) goto L9;
            this.mBtEventCb.onCallback(r1);
            goto L9
        L21:
            return;
        }

        private BtEventCbRunnable(BtEventCbManager r1, BtEventCbImpl r2) {
            this.this$0 = r1;
            this.mBtEventCb = r2;
        }
    }

    public BtEventCbManager() {
        this.mListeners = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ ArrayList access$200(BtEventCbManager r0) {
        return r0.mListeners;
    }

    private void callbackEvent(BtEventCbImpl r4) {
        AnonymousClass1 r2 = null;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) goto L6;
        this.mHandler.post(new BtEventCbRunnable(this, r4, r2));
        return;
    L6:
        new BtEventCbRunnable(this, r4, r2).run();
    }

    public void addBluetoothEventListener(BluetoothEventListener r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.mListeners.contains(r2) == true) goto L8;
        this.mListeners.add(r2);
        return;
    }

    public void destroy() {
        this.mListeners.clear();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onAdapterStatus(final boolean r2) {
        callbackEvent(new AnonymousClass1(this, r2));
    }

    public void onBleMtuChange(final BluetoothGatt r2, final int r3, final int r4) {
        callbackEvent(new AnonymousClass5(this, r2, r3, r4));
    }

    public void onBtDiscovery(final BluetoothDevice r2, final BleScanMessage r3) {
        callbackEvent(new AnonymousClass3(this, r2, r3));
    }

    public void onBtDiscoveryStatus(final boolean r2, final boolean r3) {
        callbackEvent(new AnonymousClass2(this, r2, r3));
    }

    public void onConnection(final BluetoothDevice r2, final int r3) {
        callbackEvent(new AnonymousClass6(this, r2, r3));
    }

    public void onError(final ErrorInfo r2) {
        callbackEvent(new AnonymousClass9(this, r2));
    }

    public void onReceiveData(final BluetoothDevice r2, final byte[] r3) {
        callbackEvent(new AnonymousClass7(this, r2, r3));
    }

    public void onShowDialog(final BluetoothDevice r2, final BleScanMessage r3) {
        callbackEvent(new AnonymousClass4(this, r2, r3));
    }

    public void onSwitchConnectedDevice(final BluetoothDevice r2) {
        callbackEvent(new AnonymousClass8(this, r2));
    }

    public void removeBluetoothEventListener(BluetoothEventListener r2) {
        if (r2 == null) goto L5;
        this.mListeners.remove(r2);
        return;
    }
}
