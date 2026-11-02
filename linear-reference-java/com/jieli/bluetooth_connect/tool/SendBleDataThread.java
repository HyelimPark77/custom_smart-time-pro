package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.facebook.login.widget.ToolTipPopup;
import com.jieli.bluetooth_connect.impl.BluetoothBle;
import com.jieli.bluetooth_connect.interfaces.listener.OnThreadStateListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnWriteDataCallback;
import com.jieli.bluetooth_connect.util.CHexConverter;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class SendBleDataThread extends Thread {
    private static final String TAG = "SendBleDataThread";
    private volatile boolean isDataSend;
    private volatile boolean isThreadWaiting;
    private volatile boolean isWaitingForCallback;
    private final BluetoothBle mBleManager;
    private BleSendTask mCurrentTask;
    private final OnThreadStateListener mListener;
    private final LinkedBlockingQueue<BleSendTask> mQueue;
    private volatile int retryNum;

    public static class BleSendTask {
        private UUID characteristicUUID;
        private byte[] data;
        private OnWriteDataCallback mCallback;
        private BluetoothDevice mDevice;
        private UUID serviceUUID;
        private int status;

        public BleSendTask(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
            this.status = -1;
            setDevice(device).setServiceUUID(serviceUUID).setCharacteristicUUID(characteristicUUID).setData(data).setCallback(callback);
        }

        public static /* synthetic */ BluetoothDevice access$000(BleSendTask r0) {
            return r0.mDevice;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof BleSendTask) == false) goto L18;
            BleSendTask r4 = (BleSendTask) obj;
            BluetoothDevice r0 = this.mDevice;
            if (r0 == null) goto L18;
            if (this.serviceUUID == null) goto L18;
            if (this.characteristicUUID == null) goto L18;
            if (r0.equals(r4.getDevice()) == false) goto L18;
            if (this.serviceUUID.equals(r4.getServiceUUID()) == false) goto L18;
            if (this.characteristicUUID.equals(r4.getCharacteristicUUID()) == false) goto L18;
            return true;
        L18:
            return false;
        }

        public OnWriteDataCallback getCallback() {
            return this.mCallback;
        }

        public UUID getCharacteristicUUID() {
            return this.characteristicUUID;
        }

        public byte[] getData() {
            return this.data;
        }

        public BluetoothDevice getDevice() {
            return this.mDevice;
        }

        public UUID getServiceUUID() {
            return this.serviceUUID;
        }

        public int getStatus() {
            return this.status;
        }

        public int hashCode() {
            BluetoothDevice r0 = this.mDevice;
            if (r0 == null) goto L11;
            if (this.serviceUUID == null) goto L11;
            if (this.characteristicUUID == null) goto L11;
            return (r0.hashCode() + this.serviceUUID.hashCode()) + this.characteristicUUID.hashCode();
        L11:
            return super.hashCode();
        }

        public BleSendTask setCallback(OnWriteDataCallback callback) {
            this.mCallback = callback;
            return this;
        }

        public BleSendTask setCharacteristicUUID(UUID characteristicUUID) {
            this.characteristicUUID = characteristicUUID;
            return this;
        }

        public BleSendTask setData(byte[] data) {
            this.data = data;
            return this;
        }

        public BleSendTask setDevice(BluetoothDevice device) {
            this.mDevice = device;
            return this;
        }

        public BleSendTask setServiceUUID(UUID serviceUUID) {
            this.serviceUUID = serviceUUID;
            return this;
        }

        public BleSendTask setStatus(int status) {
            this.status = status;
            return this;
        }

        @NonNull
        public String toString() {
            return "BleSendTask{mDevice=" + this.mDevice + ", serviceUUID=" + this.serviceUUID + ", characteristicUUID=" + this.characteristicUUID + ", data=" + Arrays.toString(this.data) + ", status=" + this.status + ", mCallback=" + this.mCallback + i0XO1.IO;
        }
    }

    static {
    }

    public SendBleDataThread(BluetoothBle manager, OnThreadStateListener listener) {
        super(TAG);
        this.mQueue = new LinkedBlockingQueue();
        this.isDataSend = false;
        this.isThreadWaiting = false;
        this.isWaitingForCallback = false;
        this.retryNum = 0;
        this.mBleManager = manager;
        this.mListener = listener;
    }

    private boolean addSendData(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        if (this.isDataSend == true) goto L25;
        return false;
    L25:
        this.mQueue.put(new BleSendTask(device, serviceUUID, characteristicUUID, data, callback));     // Catch: InterruptedException -> L7
        boolean r9 = true;
    L9:
        if (r9 == true) goto L11;
    L23:
        return r9;
    L11:
        if (this.isThreadWaiting == false) goto L23;
        if (this.isWaitingForCallback == true) goto L23;
        this.isThreadWaiting = false;
        LinkedBlockingQueue<BleSendTask> r10 = this.mQueue;
        monitor-enter(r10);
        this.mQueue.notify();     // Catch: Throwable -> L19
        monitor-exit(r10);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    L7:
        e = move-exception;
        e.printStackTrace();
        r9 = false;
        goto L9
    }

    private void callbackResult(BleSendTask task, boolean result) {
        if (task != null) goto L4;
    L7:
        JL_Log.i(TAG, "callbackResult", "getCallback is null.");
        return;
    L4:
        if (task.getCallback() == null) goto L7;
        task.getCallback().onBleResult(task.getDevice(), task.getServiceUUID(), task.getCharacteristicUUID(), result, task.getData());
    }

    public boolean addSendTask(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        BluetoothBle r1 = this.mBleManager;
        if (r1 == null) goto L25;
        if (device == null) goto L25;
        if (r1.isConnectedBleDevice(device) == false) goto L25;
        if (serviceUUID == null) goto L25;
        if (characteristicUUID == null) goto L25;
        if (data == null) goto L25;
        if (data.length == 0) goto L25;
        int r2 = this.mBleManager.getBleMtu(device);
        JL_Log.d(TAG, "addSendTask", "ble mtu = " + r2);
        if (r2 > 0) goto L16;
        return false;
    L16:
        int r4 = data.length;
        int r5 = 0;
    L17:
        if (r5 >= r4) goto L23;
        int r6 = Math.min(r4 - r5, r2);
        byte[] r11 = new byte[r6];
        System.arraycopy(data, r5, r11, 0, r6);
        if (addSendData(device, serviceUUID, characteristicUUID, r11, callback) == false) goto L20;
        r5 = r5 + r6;
        goto L17
    L20:
        JL_Log.e(TAG, "addSendTask", "loss data...., data = " + CHexConverter.byte2HexStr(r11));
        return false;
    L23:
        return true;
    L25:
        JL_Log.d(TAG, "addSendTask", "param is error.");
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String r0 = TAG;
        JL_Log.d(r0, r0, "send ble data thread is started.");
        OnThreadStateListener r1 = this.mListener;
        if (r1 == null) goto L6;
        r1.onStart(getId(), getName());
    L6:
        if (this.mBleManager == null) goto L52;
        LinkedBlockingQueue<BleSendTask> r2 = this.mQueue;
        monitor-enter(r2);
    L53:
    L16:
        th = move-exception;
        throw th;
    L10:
        if (this.isDataSend == false) goto L45;
        this.mCurrentTask = null;     // Catch: Throwable -> L16
        this.isThreadWaiting = false;     // Catch: Throwable -> L16
        this.isWaitingForCallback = false;     // Catch: Throwable -> L16
        if (this.mQueue.isEmpty() == true) goto L13;
        BleSendTask r3 = this.mQueue.peek();     // Catch: Throwable -> L16
        this.mCurrentTask = r3;     // Catch: Throwable -> L16
        if (r3 == null) goto L44;
        this.isWaitingForCallback = this.mBleManager.writeDataByBleSync(BleSendTask.access$000(r3), this.mCurrentTask.getServiceUUID(), this.mCurrentTask.getCharacteristicUUID(), this.mCurrentTask.getData());     // Catch: Throwable -> L16
        if (this.isWaitingForCallback == true) goto L59;
        this.mCurrentTask.setStatus(-1);     // Catch: Throwable -> L16
    L30:
        String r4 = TAG;     // Catch: Throwable -> L16
        JL_Log.d(r4, r4, "data send ret :" + this.mCurrentTask.getStatus());     // Catch: Throwable -> L16
        if (this.mCurrentTask.getStatus() == 0) goto L43;
        this.retryNum++;     // Catch: Throwable -> L16
        if (this.retryNum < 3) goto L36;
        callbackResult(this.mCurrentTask, false);     // Catch: Throwable -> L16
        goto L44
    L36:
        if (this.mCurrentTask.getStatus() == (-1)) goto L53;
        this.mCurrentTask.setStatus(-1);     // Catch: Throwable -> L16
        Thread.sleep(10);     // Catch: Throwable -> L16 InterruptedException -> L41
    L41:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L16
        goto L53
    L43:
        callbackResult(this.mCurrentTask, true);     // Catch: Throwable -> L16
        goto L44
    L59:
        this.mQueue.wait(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);     // Catch: Throwable -> L16 InterruptedException -> L27
    L27:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L16
    L44:
        this.retryNum = 0;     // Catch: Throwable -> L16
        this.mQueue.poll();     // Catch: Throwable -> L16
        goto L53
    L13:
        this.isThreadWaiting = true;     // Catch: Throwable -> L16
        String r5 = TAG;     // Catch: Throwable -> L16
        JL_Log.d(r5, r5, "queue is empty, so waiting for data");     // Catch: Throwable -> L16
        this.mQueue.wait();     // Catch: Throwable -> L16 InterruptedException -> L18
    L18:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L16
        goto L53
    L45:
        monitor-exit(r2);     // Catch: Throwable -> L16
        this.isWaitingForCallback = false;
        this.isThreadWaiting = false;
        this.mQueue.clear();
        OnThreadStateListener r6 = this.mListener;
        if (r6 == null) goto L49;
        r6.onEnd(getId(), getName());
    L49:
        String r7 = TAG;
        JL_Log.d(r7, r7, "send ble data thread exit.");
        return;
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        monitor-enter(this);
        this.isDataSend = true;     // Catch: Throwable -> L7
        super.start();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void stopThread() {
        monitor-enter(this);
        this.isDataSend = false;     // Catch: Throwable -> L7
        wakeupSendThread(null);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void wakeupSendThread(BleSendTask sendTask) {
        if (sendTask == null) goto L9;
        BleSendTask r0 = this.mCurrentTask;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.equals(sendTask) == true) goto L9;
        return;
    L9:
        if (sendTask == null) goto L11;
        sendTask.setCallback(this.mCurrentTask.getCallback());
        this.mCurrentTask = sendTask;
    L11:
        LinkedBlockingQueue<BleSendTask> r2 = this.mQueue;
        monitor-enter(r2);
    L18:
        th = move-exception;
        throw th;
    L14:
        if (this.isThreadWaiting == false) goto L22;
        if (this.isWaitingForCallback == false) goto L20;
        this.mQueue.notifyAll();     // Catch: Throwable -> L18
    L24:
        monitor-exit(r2);     // Catch: Throwable -> L18
        return;
    L20:
        this.mQueue.notify();     // Catch: Throwable -> L18
        goto L24
    L22:
        if (this.isWaitingForCallback == false) goto L24;
        this.mQueue.notify();     // Catch: Throwable -> L18
        goto L24
    }
}
