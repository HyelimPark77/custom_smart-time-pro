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
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.uz0;
import com.ironsource.C12250Z3;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.impl.BluetoothPair;
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
    private final Context mContext;
    private PairBtDeviceThread mPairBtDeviceThread;
    private volatile BluetoothDevice mPairingDevice;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.O0iiX10
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return BluetoothPair.OXO1(this.f2608IO, message);
        }
    });
    private final BtPairEventCbManager mBtPairEventCbManager = new BtPairEventCbManager();

    public class BluetoothPairReceiver extends BroadcastReceiver {
        private BluetoothPairReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if (intent != null) {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                action.getClass();
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    if (intExtra != -1) {
                        if (intExtra == 10) {
                            BluetoothPair.this.stopPairTaskThread();
                            BluetoothPair bluetoothPair = BluetoothPair.this;
                            bluetoothPair.onError(bluetoothPair.mPairingDevice, ErrorInfo.buildError(2));
                            BluetoothPair bluetoothPair2 = BluetoothPair.this;
                            bluetoothPair2.stopPairTimeout(bluetoothPair2.mPairingDevice);
                        }
                        BluetoothPair.this.mBtPairEventCbManager.onAdapterStatus(intExtra == 12, BluetoothUtil.hasBle(BluetoothPair.this.mContext));
                        return;
                    }
                    return;
                }
                if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null && ConnectUtil.isHasConnectPermission(context)) {
                    int bondState = bluetoothDevice.getBondState();
                    JL_Log.m26851i(BluetoothPair.TAG, "ACTION_BOND_STATE_CHANGED", "device : " + BluetoothUtil.printBtDeviceInfo(context, bluetoothDevice) + ", bound : " + bondState);
                    if (bondState == 10 || bondState == 12) {
                        BluetoothPair.this.stopPairTimeout(bluetoothDevice);
                        BluetoothPair.this.wakeupPairTaskThread(bluetoothDevice);
                    }
                    BluetoothPair.this.mBtPairEventCbManager.onBtDeviceBond(bluetoothDevice, bondState);
                }
            }
        }
    }

    public class PairBtDeviceThread extends Thread {
        private boolean isThreadRunning;
        private boolean isWaiting;
        private boolean isWaitingForResult;
        private BluetoothDevice mPairTaskDevice;
        private final LinkedBlockingQueue<PairTask> mPairTaskQueue;
        private final String tag;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean addPairTask(PairTask task) {
            boolean z;
            if (task != null) {
                try {
                    this.mPairTaskQueue.put(task);
                    z = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    z = false;
                }
            } else {
                z = false;
            }
            if (z && this.isWaiting && !this.isWaitingForResult) {
                this.isWaiting = false;
                synchronized (this.mPairTaskQueue) {
                    JL_Log.m26851i(this.tag, "addPairTask", "notify");
                    this.mPairTaskQueue.notify();
                }
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stopThread() {
            JL_Log.m26851i(this.tag, "stopThread", "");
            this.isThreadRunning = false;
            this.mPairTaskDevice = null;
            wakeUp(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wakeUp(BluetoothDevice device) {
            if (device == null || BluetoothUtil.deviceEquals(this.mPairTaskDevice, device)) {
                synchronized (this.mPairTaskQueue) {
                    try {
                        if (this.isWaitingForResult) {
                            if (this.isWaiting) {
                                this.mPairTaskQueue.notifyAll();
                            } else {
                                this.mPairTaskQueue.notify();
                            }
                        } else if (this.isWaiting) {
                            this.mPairTaskQueue.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            JL_Log.m26851i(BluetoothPair.TAG, this.tag, "start..");
            this.isThreadRunning = true;
            synchronized (this.mPairTaskQueue) {
                while (this.isThreadRunning) {
                    this.isWaitingForResult = false;
                    this.mPairTaskDevice = null;
                    if (this.mPairTaskQueue.isEmpty()) {
                        this.isWaiting = true;
                        JL_Log.m26851i(BluetoothPair.TAG, this.tag, "mPairTaskQueue is empty, wait ...");
                        try {
                            this.mPairTaskQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        JL_Log.m26851i(BluetoothPair.TAG, this.tag, "mPairTaskQueue is not empty, notify ...");
                    } else {
                        this.isWaiting = false;
                        PairTask pairTaskPeek = this.mPairTaskQueue.peek();
                        if (pairTaskPeek != null) {
                            this.mPairTaskDevice = pairTaskPeek.getDevice();
                            boolean zPair = pairTaskPeek.getOp() == 0 ? BluetoothPair.this.pair(this.mPairTaskDevice, pairTaskPeek.getPairWay()) : BluetoothPair.this.unPair(this.mPairTaskDevice);
                            JL_Log.m26851i(BluetoothPair.TAG, this.tag, "task : " + pairTaskPeek + " execute : " + zPair);
                            if (zPair) {
                                this.isWaitingForResult = true;
                                JL_Log.m26851i(BluetoothPair.TAG, this.tag, "wait for system callback");
                                try {
                                    this.mPairTaskQueue.wait(30000L);
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                                JL_Log.m26851i(BluetoothPair.TAG, this.tag, "system callback, notify and poll ...");
                            } else {
                                BluetoothPair bluetoothPair = BluetoothPair.this;
                                BluetoothDevice bluetoothDevice = this.mPairTaskDevice;
                                bluetoothPair.onError(bluetoothDevice, ErrorInfo.buildError(3, 0, bluetoothDevice == null ? "" : bluetoothDevice.getAddress()));
                            }
                        } else {
                            JL_Log.m26851i(BluetoothPair.TAG, this.tag, "mPairTask is null,  poll...");
                        }
                        this.mPairTaskQueue.poll();
                    }
                }
            }
            this.mPairTaskQueue.clear();
            BluetoothPair.this.mPairBtDeviceThread = null;
            JL_Log.m26851i(BluetoothPair.TAG, this.tag, "exit..");
        }

        private PairBtDeviceThread() {
            super("PairBtDeviceThread");
            this.tag = PairBtDeviceThread.class.getSimpleName();
            this.mPairTaskQueue = new LinkedBlockingQueue<>();
        }
    }

    public static class PairTask {
        private static final int OP_CANCEL_PAIR = 1;
        private static final int OP_PAIR = 0;
        private final BluetoothDevice mDevice;
        private final int mOp;
        private int pairWay = 0;

        public PairTask(int op, BluetoothDevice device) {
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
            return "PairTask{mOp=" + this.mOp + ", mDevice=" + this.mDevice + ", pairWay=" + this.pairWay + i0XO1.f7442IO;
        }
    }

    public BluetoothPair(Context context, OnBtDevicePairListener listener) {
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService(C12250Z3.f30472d);
        if (bluetoothManager != null) {
            this.btAdapter = bluetoothManager.getAdapter();
        } else {
            this.btAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        addListener(listener);
        registerReceiver();
        startPairTaskThread();
    }

    public static /* synthetic */ boolean OXO1(BluetoothPair bluetoothPair, Message message) {
        BluetoothDevice bluetoothDevice;
        bluetoothPair.getClass();
        if (message.what == 1014 && (bluetoothDevice = (BluetoothDevice) message.obj) != null) {
            bluetoothPair.wakeupPairTaskThread(bluetoothDevice);
            bluetoothPair.onError(bluetoothDevice, ErrorInfo.buildError(4, 0, bluetoothDevice.getAddress()));
        }
        return false;
    }

    private boolean addPairTask(PairTask task) {
        if (task == null) {
            return false;
        }
        startPairTaskThread();
        return this.mPairBtDeviceThread.addPairTask(task);
    }

    @SuppressLint({"MissingPermission"})
    private int getDeviceBoundWay(BluetoothDevice device) {
        BluetoothAdapter bluetoothAdapter;
        int i = 0;
        if (device != null && ConnectUtil.isHasConnectPermission(this.mContext)) {
            BluetoothOption bluetoothOption = this.mBluetoothOption;
            if (bluetoothOption != null && bluetoothOption.isSupportCTKD() && device.getType() == 3) {
                if (Build.VERSION.SDK_INT >= 33 && (bluetoothAdapter = this.btAdapter) != null && bluetoothAdapter.isLeAudioSupported() == 10) {
                    i = 1;
                }
                i ^= 1;
            }
            JL_Log.m26847d(TAG, "getDeviceBoundWay", "pairWay : " + i);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(BluetoothDevice device, ErrorInfo error) {
        this.mBtPairEventCbManager.onPairError(device, error);
    }

    private void registerReceiver() {
        if (this.mBluetoothPairReceiver == null) {
            this.mBluetoothPairReceiver = new BluetoothPairReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.mContext.registerReceiver(this.mBluetoothPairReceiver, intentFilter);
        }
    }

    private void setPairingDevice(BluetoothDevice pairingDevice) {
        this.mPairingDevice = pairingDevice;
    }

    private void startPairTaskThread() {
        if (this.mPairBtDeviceThread == null) {
            PairBtDeviceThread pairBtDeviceThread = new PairBtDeviceThread();
            this.mPairBtDeviceThread = pairBtDeviceThread;
            pairBtDeviceThread.start();
        }
    }

    private void startPairTimeOut(BluetoothDevice device) {
        if (device == null) {
            onError(null, ErrorInfo.buildError(1));
        } else {
            if (this.mHandler.hasMessages(1014)) {
                onError(device, ErrorInfo.buildError(5));
                return;
            }
            Message messageObtainMessage = this.mHandler.obtainMessage(1014, device);
            setPairingDevice(device);
            this.mHandler.sendMessageDelayed(messageObtainMessage, 30000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPairTaskThread() {
        PairBtDeviceThread pairBtDeviceThread = this.mPairBtDeviceThread;
        if (pairBtDeviceThread != null) {
            pairBtDeviceThread.stopThread();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPairTimeout(BluetoothDevice device) {
        if (this.mHandler.hasMessages(1014) && BluetoothUtil.deviceEquals(device, this.mPairingDevice)) {
            this.mHandler.removeMessages(1014);
            setPairingDevice(null);
        }
    }

    private void unregisterReceiver() {
        BluetoothPairReceiver bluetoothPairReceiver = this.mBluetoothPairReceiver;
        if (bluetoothPairReceiver != null) {
            this.mContext.unregisterReceiver(bluetoothPairReceiver);
            this.mBluetoothPairReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wakeupPairTaskThread(BluetoothDevice device) {
        PairBtDeviceThread pairBtDeviceThread = this.mPairBtDeviceThread;
        if (pairBtDeviceThread != null) {
            pairBtDeviceThread.wakeUp(device);
        }
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
        return ConnectUtil.isHasConnectPermission(this.mContext) && device != null && 12 == device.getBondState();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean isPairing(BluetoothDevice device) {
        return ConnectUtil.isHasConnectPermission(this.mContext) && device != null && 11 == device.getBondState();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean pair(BluetoothDevice device) {
        if (device != null && ConnectUtil.isHasConnectPermission(this.mContext)) {
            return pair(device, getDeviceBoundWay(device));
        }
        JL_Log.m26855w(TAG, uz0.iXiiiO, "device is null");
        return false;
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
        if (device == null) {
            return false;
        }
        return addPairTask(new PairTask(1, device));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean unPair(BluetoothDevice device) {
        if (device == null) {
            JL_Log.m26849e(TAG, "unPair", "device is null.");
            return false;
        }
        boolean zRemoveBond = BluetoothUtil.removeBond(this.mContext, device);
        JL_Log.m26855w(TAG, "unPair", "removeBond : " + zRemoveBond);
        if (zRemoveBond) {
            startPairTimeOut(device);
        }
        return zRemoveBond;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void addListener(OnBtDevicePairListener listener) {
        this.mBtPairEventCbManager.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void removeListener(OnBtDevicePairListener listener) {
        this.mBtPairEventCbManager.removeListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToPair(BluetoothDevice device, @IntRange(from = 0, m3to = 2) int pairWay) {
        if (device == null) {
            return false;
        }
        return addPairTask(new PairTask(0, device).setPairWay(pairWay));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    @SuppressLint({"MissingPermission"})
    public boolean pair(BluetoothDevice device, @IntRange(from = 0, m3to = 2) int pairWay) {
        boolean zCreateBond;
        if (device == null || !ConnectUtil.isHasConnectPermission(this.mContext)) {
            JL_Log.m26855w(TAG, uz0.iXiiiO, "device is null");
            return false;
        }
        if (pairWay < 0 || pairWay > 2) {
            pairWay = 0;
        }
        if (pairWay == 0) {
            zCreateBond = BluetoothUtil.createBond(this.mContext, device);
            JL_Log.m26847d(TAG, uz0.iXiiiO, "createBond ---> " + zCreateBond);
        } else {
            boolean zCreateBond2 = BluetoothUtil.createBond(this.mContext, device, pairWay);
            String str = TAG;
            JL_Log.m26847d(str, uz0.iXiiiO, "createBond pairWay = " + pairWay + ", result : " + zCreateBond2);
            if (zCreateBond2) {
                zCreateBond = zCreateBond2;
            } else {
                zCreateBond = BluetoothUtil.createBond(this.mContext, device);
                JL_Log.m26851i(str, uz0.iXiiiO, "Failed to pair with way, so createBond result : " + zCreateBond);
            }
        }
        if (!zCreateBond) {
            return false;
        }
        startPairTimeOut(device);
        return true;
    }
}
