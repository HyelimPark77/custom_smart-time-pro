package com.jieli.bluetooth_connect.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import com.android.mltcode.paycertificationapi.O0iiX10;
import com.android.mltcode.paycertificationapi.O1OI010O;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.uz0;
import com.ironsource.Z3;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.interfaces.IBluetoothPair;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.tool.BtPairEventCbManager;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothPair implements IBluetoothPair {
    private static final int MSG_PAIR_TASK_TIMEOUT = 1014;
    private static final String TAG = "BluetoothPair";
    private final BluetoothAdapter btAdapter;
    private BluetoothOption mBluetoothOption;
    private BluetoothPairReceiver mBluetoothPairReceiver;
    private final BtPairEventCbManager mBtPairEventCbManager;
    private final Context mContext;
    private final Handler mHandler;
    private PairBtDeviceThread mPairBtDeviceThread;
    private volatile BluetoothDevice mPairingDevice;

    /* JADX INFO: renamed from: com.jieli.bluetooth_connect.impl.BluetoothPair$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class BluetoothPairReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothPair this$0;

        private BluetoothPairReceiver(final BluetoothPair this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) goto L29;
            String r0 = intent.getAction();
            if (TextUtils.isEmpty(r0) == true) goto L30;
            r0.getClass();
            if (r0.equals("android.bluetooth.adapter.action.STATE_CHANGED") == false) goto L8;
            int r7 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (r7 == (-1)) goto L33;
            if (r7 != 10) goto L24;
            BluetoothPair.access$1100(this.this$0);
            BluetoothPair r8 = this.this$0;
            BluetoothPair.access$600(r8, BluetoothPair.access$1200(r8), ErrorInfo.buildError(2));
            BluetoothPair r9 = this.this$0;
            BluetoothPair.access$800(r9, BluetoothPair.access$1200(r9));
        L24:
            if (r7 != 12) goto L26;
            boolean r10 = true;
        L27:
            BluetoothPair.access$1000(this.this$0).onAdapterStatus(r10, BluetoothUtil.hasBle(BluetoothPair.access$1300(this.this$0)));
            return;
        L26:
            r10 = false;
            goto L27
        L33:
            return;
        L8:
            if (r0.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") == false) goto L34;
            BluetoothDevice r11 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r11 != null) goto L13;
            return;
        L13:
            if (ConnectUtil.isHasConnectPermission(context) == false) goto L32;
            int r1 = r11.getBondState();
            JL_Log.i(BluetoothPair.access$500(), "ACTION_BOND_STATE_CHANGED", "device : " + BluetoothUtil.printBtDeviceInfo(context, r11) + ", bound : " + r1);
            if (r1 == 10) goto L17;
            if (r1 == 12) goto L17;
        L18:
            BluetoothPair.access$1000(this.this$0).onBtDeviceBond(r11, r1);
            return;
        L17:
            BluetoothPair.access$800(this.this$0, r11);
            BluetoothPair.access$900(this.this$0, r11);
            goto L18
        L32:
            return;
        L34:
            return;
        L30:
            return;
        }

        public /* synthetic */ BluetoothPairReceiver(BluetoothPair r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public class PairBtDeviceThread extends Thread {
        private boolean isThreadRunning;
        private boolean isWaiting;
        private boolean isWaitingForResult;
        private BluetoothDevice mPairTaskDevice;
        private final LinkedBlockingQueue<PairTask> mPairTaskQueue;
        private final String tag;
        final /* synthetic */ BluetoothPair this$0;

        public /* synthetic */ PairBtDeviceThread(BluetoothPair r1, AnonymousClass1 r2) {
            this(r1);
        }

        public static /* synthetic */ boolean access$200(PairBtDeviceThread r0, PairTask r1) {
            return r0.addPairTask(r1);
        }

        public static /* synthetic */ void access$300(PairBtDeviceThread r0, BluetoothDevice r1) {
            r0.wakeUp(r1);
        }

        public static /* synthetic */ void access$400(PairBtDeviceThread r0) {
            r0.stopThread();
        }

        private boolean addPairTask(PairTask task) {
            if (task != null) goto L23;
        L8:
            boolean r5 = false;
        L9:
            if (r5 == true) goto L11;
        L22:
            return r5;
        L11:
            if (this.isWaiting == false) goto L22;
            if (this.isWaitingForResult == true) goto L22;
            this.isWaiting = false;
            LinkedBlockingQueue<PairTask> r0 = this.mPairTaskQueue;
            monitor-enter(r0);
            JL_Log.i(this.tag, "addPairTask", "notify");     // Catch: Throwable -> L19
            this.mPairTaskQueue.notify();     // Catch: Throwable -> L19
            monitor-exit(r0);     // Catch: Throwable -> L19
        L19:
            th = move-exception;
            throw th;
        L23:
            this.mPairTaskQueue.put(task);     // Catch: InterruptedException -> L6
            r5 = true;
        L6:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        private void stopThread() {
            JL_Log.i(this.tag, "stopThread", "");
            this.isThreadRunning = false;
            this.mPairTaskDevice = null;
            wakeUp(null);
        }

        private void wakeUp(BluetoothDevice device) {
            if (device != null) goto L4;
        L7:
            LinkedBlockingQueue<PairTask> r2 = this.mPairTaskQueue;
            monitor-enter(r2);
        L14:
            th = move-exception;
            throw th;
        L10:
            if (this.isWaitingForResult == false) goto L18;
            if (this.isWaiting == false) goto L16;
            this.mPairTaskQueue.notifyAll();     // Catch: Throwable -> L14
        L20:
            monitor-exit(r2);     // Catch: Throwable -> L14
            return;
        L16:
            this.mPairTaskQueue.notify();     // Catch: Throwable -> L14
            goto L20
        L18:
            if (this.isWaiting == false) goto L20;
            this.mPairTaskQueue.notify();     // Catch: Throwable -> L14
            goto L20
        L4:
            if (BluetoothUtil.deviceEquals(this.mPairTaskDevice, device) == true) goto L7;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            JL_Log.i(BluetoothPair.access$500(), this.tag, "start..");
            this.isThreadRunning = true;
            LinkedBlockingQueue<PairTask> r1 = this.mPairTaskQueue;
            monitor-enter(r1);
        L44:
        L11:
            th = move-exception;
            throw th;
        L5:
            if (this.isThreadRunning == false) goto L37;
            this.isWaitingForResult = false;     // Catch: Throwable -> L11
            this.mPairTaskDevice = null;     // Catch: Throwable -> L11
            if (this.mPairTaskQueue.isEmpty() == true) goto L8;
            this.isWaiting = false;     // Catch: Throwable -> L11
            PairTask r3 = this.mPairTaskQueue.peek();     // Catch: Throwable -> L11
            if (r3 == null) goto L35;
            this.mPairTaskDevice = r3.getDevice();     // Catch: Throwable -> L11
            if (r3.getOp() != 0) goto L21;
            boolean r4 = this.this$0.pair(this.mPairTaskDevice, r3.getPairWay());     // Catch: Throwable -> L11
        L22:
            JL_Log.i(BluetoothPair.access$500(), this.tag, "task : " + r3 + " execute : " + r4);     // Catch: Throwable -> L11
            if (r4 == true) goto L29;
            BluetoothPair r5 = this.this$0;     // Catch: Throwable -> L11
            BluetoothDevice r6 = this.mPairTaskDevice;     // Catch: Throwable -> L11
            if (r6 != null) goto L27;
            String r7 = "";
        L28:
            BluetoothPair.access$600(r5, r6, ErrorInfo.buildError(3, 0, r7));     // Catch: Throwable -> L11
        L36:
            this.mPairTaskQueue.poll();     // Catch: Throwable -> L11
            goto L44
        L27:
            r7 = r6.getAddress();     // Catch: Throwable -> L11
            goto L28
        L29:
            this.isWaitingForResult = true;     // Catch: Throwable -> L11
            JL_Log.i(BluetoothPair.access$500(), this.tag, "wait for system callback");     // Catch: Throwable -> L11
            this.mPairTaskQueue.wait(30000);     // Catch: Throwable -> L11 InterruptedException -> L32
        L34:
            JL_Log.i(BluetoothPair.access$500(), this.tag, "system callback, notify and poll ...");     // Catch: Throwable -> L11
            goto L36
        L32:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L34
        L21:
            r4 = this.this$0.unPair(this.mPairTaskDevice);     // Catch: Throwable -> L11
            goto L22
        L35:
            JL_Log.i(BluetoothPair.access$500(), this.tag, "mPairTask is null,  poll...");     // Catch: Throwable -> L11
            goto L36
        L8:
            this.isWaiting = true;     // Catch: Throwable -> L11
            JL_Log.i(BluetoothPair.access$500(), this.tag, "mPairTaskQueue is empty, wait ...");     // Catch: Throwable -> L11
            this.mPairTaskQueue.wait();     // Catch: Throwable -> L11 InterruptedException -> L13
        L15:
            JL_Log.i(BluetoothPair.access$500(), this.tag, "mPairTaskQueue is not empty, notify ...");     // Catch: Throwable -> L11
            goto L44
        L13:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L15
        L37:
            monitor-exit(r1);     // Catch: Throwable -> L11
            this.mPairTaskQueue.clear();
            BluetoothPair.access$702(this.this$0, null);
            JL_Log.i(BluetoothPair.access$500(), this.tag, "exit..");
        }

        private PairBtDeviceThread(final BluetoothPair this$0) {
            this.this$0 = this$0;
            super("PairBtDeviceThread");
            this.tag = PairBtDeviceThread.class.getSimpleName();
            this.mPairTaskQueue = new LinkedBlockingQueue();
        }
    }

    public static class PairTask {
        private static final int OP_CANCEL_PAIR = 1;
        private static final int OP_PAIR = 0;
        private final BluetoothDevice mDevice;
        private final int mOp;
        private int pairWay;

        public PairTask(int op, BluetoothDevice device) {
            this.pairWay = 0;
            this.mOp = op;
            this.mDevice = device;
        }

        public BluetoothDevice getDevice() {
            return this.mDevice;
        }

        public int getOp() {
            return this.mOp;
        }

        public int getPairWay() {
            return this.pairWay;
        }

        public PairTask setPairWay(int pairWay) {
            this.pairWay = pairWay;
            return this;
        }

        public String toString() {
            return "PairTask{mOp=" + this.mOp + ", mDevice=" + this.mDevice + ", pairWay=" + this.pairWay + i0XO1.IO;
        }
    }

    static {
    }

    public BluetoothPair(Context context, OnBtDevicePairListener listener) {
        this.mHandler = new Handler(Looper.getMainLooper(), new O0iiX10(this));
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        this.mBtPairEventCbManager = new BtPairEventCbManager();
        android.bluetooth.BluetoothManager r4 = (android.bluetooth.BluetoothManager) context.getSystemService(Z3.d);
        if (r4 == null) goto L5;
        this.btAdapter = r4.getAdapter();
    L6:
        addListener2(listener);
        registerReceiver();
        startPairTaskThread();
        return;
    L5:
        this.btAdapter = BluetoothAdapter.getDefaultAdapter();
        goto L6
    }

    public static /* synthetic */ boolean OXO1(BluetoothPair r3, Message r4) {
        r3.getClass();
        if (r4.what != 1014) goto L7;
        BluetoothDevice r5 = (BluetoothDevice) r4.obj;
        if (r5 == null) goto L7;
        r3.wakeupPairTaskThread(r5);
        r3.onError(r5, ErrorInfo.buildError(4, 0, r5.getAddress()));
    L7:
        return false;
    }

    public static /* synthetic */ BtPairEventCbManager access$1000(BluetoothPair r0) {
        return r0.mBtPairEventCbManager;
    }

    public static /* synthetic */ void access$1100(BluetoothPair r0) {
        r0.stopPairTaskThread();
    }

    public static /* synthetic */ BluetoothDevice access$1200(BluetoothPair r0) {
        return r0.mPairingDevice;
    }

    public static /* synthetic */ Context access$1300(BluetoothPair r0) {
        return r0.mContext;
    }

    public static /* synthetic */ String access$500() {
        return TAG;
    }

    public static /* synthetic */ void access$600(BluetoothPair r0, BluetoothDevice r1, ErrorInfo r2) {
        r0.onError(r1, r2);
    }

    public static /* synthetic */ PairBtDeviceThread access$702(BluetoothPair r0, PairBtDeviceThread r1) {
        r0.mPairBtDeviceThread = r1;
        return r1;
    }

    public static /* synthetic */ void access$800(BluetoothPair r0, BluetoothDevice r1) {
        r0.stopPairTimeout(r1);
    }

    public static /* synthetic */ void access$900(BluetoothPair r0, BluetoothDevice r1) {
        r0.wakeupPairTaskThread(r1);
    }

    private boolean addPairTask(PairTask task) {
        if (task == null) goto L5;
        startPairTaskThread();
        return PairBtDeviceThread.access$200(this.mPairBtDeviceThread, task);
    L5:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    private int getDeviceBoundWay(BluetoothDevice device) {
        int r0 = 0;
        if (device != null) goto L5;
    L22:
        return r0;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L22;
        BluetoothOption r1 = this.mBluetoothOption;
        if (r1 != null) goto L10;
    L21:
        JL_Log.d(TAG, "getDeviceBoundWay", "pairWay : " + r0);
        goto L22
    L10:
        if (r1.isSupportCTKD() == false) goto L21;
        if (device.getType() != 3) goto L21;
        if (Build.VERSION.SDK_INT < 33) goto L20;
        BluetoothAdapter r4 = this.btAdapter;
        if (r4 == null) goto L20;
        if (O1OI010O.OXO1(r4) != 10) goto L20;
        r0 = 1;
    L20:
        r0 = r0 ^ 1;
        goto L21
    }

    private void onError(BluetoothDevice device, ErrorInfo error) {
        this.mBtPairEventCbManager.onPairError(device, error);
    }

    private void registerReceiver() {
        if (this.mBluetoothPairReceiver != null) goto L6;
        this.mBluetoothPairReceiver = new BluetoothPairReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        r0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.mContext.registerReceiver(this.mBluetoothPairReceiver, r0);
        return;
    }

    private void setPairingDevice(BluetoothDevice pairingDevice) {
        this.mPairingDevice = pairingDevice;
    }

    private void startPairTaskThread() {
        if (this.mPairBtDeviceThread != null) goto L6;
        PairBtDeviceThread r0 = new PairBtDeviceThread(this, null);
        this.mPairBtDeviceThread = r0;
        r0.start();
        return;
    }

    private void startPairTimeOut(BluetoothDevice device) {
        if (device != null) goto L6;
        onError(null, ErrorInfo.buildError(1));
        return;
    L6:
        if (this.mHandler.hasMessages(1014) == false) goto L9;
        onError(device, ErrorInfo.buildError(5));
        return;
    L9:
        Message r0 = this.mHandler.obtainMessage(1014, device);
        setPairingDevice(device);
        this.mHandler.sendMessageDelayed(r0, 30000);
    }

    private void stopPairTaskThread() {
        PairBtDeviceThread r0 = this.mPairBtDeviceThread;
        if (r0 == null) goto L6;
        PairBtDeviceThread.access$400(r0);
        return;
    }

    private void stopPairTimeout(BluetoothDevice device) {
        if (this.mHandler.hasMessages(1014) == true) goto L5;
        return;
    L5:
        if (BluetoothUtil.deviceEquals(device, this.mPairingDevice) == false) goto L9;
        this.mHandler.removeMessages(1014);
        setPairingDevice(null);
        return;
    }

    private void unregisterReceiver() {
        BluetoothPairReceiver r0 = this.mBluetoothPairReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mBluetoothPairReceiver = null;
        return;
    }

    private void wakeupPairTaskThread(BluetoothDevice device) {
        PairBtDeviceThread r0 = this.mPairBtDeviceThread;
        if (r0 == null) goto L6;
        PairBtDeviceThread.access$300(r0, device);
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBtDevicePairListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        unregisterReceiver();
        stopPairTaskThread();
        this.mBtPairEventCbManager.destroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public List<BluetoothDevice> getPairedDevices() {
        return BluetoothUtil.getPairedDevices(this.mContext);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean isPaired(BluetoothDevice device) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L5;
        return false;
    L5:
        if (device != null) goto L7;
    L10:
        return false;
    L7:
        if (12 != device.getBondState()) goto L10;
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean isPairing(BluetoothDevice device) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L5;
        return false;
    L5:
        if (device != null) goto L7;
    L10:
        return false;
    L7:
        if (11 != device.getBondState()) goto L10;
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean pair(BluetoothDevice device) {
        if (device != null) goto L4;
    L8:
        JL_Log.w(TAG, uz0.iXiiiO, "device is null");
        return false;
    L4:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L8;
        return pair(device, getDeviceBoundWay(device));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBtDevicePairListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        this.mBluetoothOption = option;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToPair(BluetoothDevice device) {
        return tryToPair(device, getDeviceBoundWay(device));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToUnPair(BluetoothDevice device) {
        if (device != null) goto L6;
        return false;
    L6:
        return addPairTask(new PairTask(1, device));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean unPair(BluetoothDevice device) {
        if (device != null) goto L6;
        JL_Log.e(TAG, "unPair", "device is null.");
        return false;
    L6:
        boolean r1 = BluetoothUtil.removeBond(this.mContext, device);
        JL_Log.w(TAG, "unPair", "removeBond : " + r1);
        if (r1 == false) goto L9;
        startPairTimeOut(device);
    L9:
        return r1;
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBtDevicePairListener listener) {
        this.mBtPairEventCbManager.addListener(listener);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBtDevicePairListener listener) {
        this.mBtPairEventCbManager.removeListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToPair(BluetoothDevice device, @IntRange(from = 0, to = 2) int pairWay) {
        if (device != null) goto L6;
        return false;
    L6:
        return addPairTask(new PairTask(0, device).setPairWay(pairWay));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean pair(BluetoothDevice device, @IntRange(from = 0, to = 2) int pairWay) {
        if (device != null) goto L5;
    L21:
        JL_Log.w(TAG, uz0.iXiiiO, "device is null");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L21;
        if (pairWay >= 0) goto L9;
    L10:
        pairWay = 0;
    L11:
        if (pairWay != 0) goto L13;
        boolean r8 = BluetoothUtil.createBond(this.mContext, device);
        JL_Log.d(TAG, uz0.iXiiiO, "createBond ---> " + r8);
    L17:
        if (r8 == true) goto L19;
        return false;
    L19:
        startPairTimeOut(device);
        return true;
    L13:
        boolean r2 = BluetoothUtil.createBond(this.mContext, device, pairWay);
        String r3 = TAG;
        JL_Log.d(r3, uz0.iXiiiO, "createBond pairWay = " + pairWay + ", result : " + r2);
        if (r2 == true) goto L16;
        r8 = BluetoothUtil.createBond(this.mContext, device);
        JL_Log.i(r3, uz0.iXiiiO, "Failed to pair with way, so createBond result : " + r8);
        goto L17
    L16:
        r8 = r2;
        goto L17
    L9:
        if (pairWay <= 2) goto L11;
        goto L10
    }
}
