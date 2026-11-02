package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class ReceiveSppDataThread extends Thread {
    public static final int EXIT_REASON_IO_EXCEPTION = 2;
    public static final int EXIT_REASON_PARAM_ERROR = 1;
    public static final int EXIT_REASON_SUCCESS = 0;
    private static final String TAG = "ReceiveSppDataThread";
    private volatile boolean isRunning;
    private final int mBlockSize;
    private final BluetoothSocket mBluetoothSocket;
    private final BluetoothDevice mConnectedSppDev;
    private final OnRecvSppDataListener mOnRecvSppDataListener;

    public interface OnRecvSppDataListener {
        void onRecvSppData(long threadID, BluetoothDevice device, byte[] data);

        void onThreadStart(long threadID);

        void onThreadStop(long threadID, int reason, BluetoothDevice device);
    }

    static {
    }

    public ReceiveSppDataThread(BluetoothDevice device, BluetoothSocket socket, OnRecvSppDataListener listener) {
        this(device, socket, 4096, listener);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        String r0 = TAG;
        JL_Log.i(r0, r0, "start.");
        int r1 = 1;
        this.isRunning = true;
        OnRecvSppDataListener r2 = this.mOnRecvSppDataListener;
        if (r2 == null) goto L6;
        r2.onThreadStart(getId());
    L6:
        if (this.mConnectedSppDev == null) goto L32;
        byte[] r3 = new byte[this.mBlockSize];
        BluetoothSocket r4 = this.mBluetoothSocket;
        if (r4 != null) goto L39;
    L13:
        InputStream r5 = null;
    L14:
        String r6 = TAG;
        JL_Log.i(r6, r6, "isRunning : " + this.isRunning + ", mBluetoothSocket : " + this.mBluetoothSocket + ", inputStream : " + r5);
    L16:
        if (this.isRunning == false) goto L31;
        if (r5 == null) goto L31;
        int r7 = r5.read(r3);     // Catch: Exception -> L24
        if (r7 < 0) goto L21;
        if (r7 == 0) goto L23;
        byte[] r8 = new byte[r7];     // Catch: Exception -> L24
        System.arraycopy(r3, 0, r8, 0, r7);     // Catch: Exception -> L24
        OnRecvSppDataListener r9 = this.mOnRecvSppDataListener;     // Catch: Exception -> L24
        if (r9 == null) goto L16;
        r9.onRecvSppData(getId(), this.mConnectedSppDev, r8);     // Catch: Exception -> L24
        goto L16
    L23:
        Thread.sleep(30);     // Catch: Exception -> L24
    L21:
        r1 = 2;
    L24:
        e = move-exception;
        String r10 = TAG;
        JL_Log.e(r10, r10, "have an exception : " + e.getMessage());
        e.printStackTrace();
    L31:
        r1 = 0;
        goto L32
    L39:
        r5 = r4.getInputStream();     // Catch: IOException -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
    L32:
        this.isRunning = false;
        OnRecvSppDataListener r11 = this.mOnRecvSppDataListener;
        if (r11 == null) goto L35;
        r11.onThreadStop(getId(), r1, this.mConnectedSppDev);
    L35:
        String r12 = TAG;
        JL_Log.i(r12, r12, "exit");
    }

    public void stopThread() {
        this.isRunning = false;
    }

    public ReceiveSppDataThread(BluetoothDevice device, BluetoothSocket socket, int blockSize, OnRecvSppDataListener listener) {
        super("ReceiveSppDataThread : " + device);
        this.mConnectedSppDev = device;
        this.mBluetoothSocket = socket;
        this.mBlockSize = blockSize;
        this.mOnRecvSppDataListener = listener;
    }
}
