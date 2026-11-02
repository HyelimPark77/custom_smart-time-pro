package com.jieli.jl_audio_decode.tool;

import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class AddStreamDataThread extends OperationThread {
    private final LinkedBlockingQueue<byte[]> dataQueue;
    private final int dataType;
    private volatile boolean isLocked;
    private volatile boolean isRunning;

    public AddStreamDataThread(BaseManager r2, int r3, OnStateCallback r4, OnThreadFinishListener r5) {
        super("AddStreamDataThread", r2, r4, r5);
        this.dataQueue = new LinkedBlockingQueue();
        this.dataType = r3;
    }

    private void lock() {
        LinkedBlockingQueue<byte[]> r0 = this.dataQueue;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.isLocked == false) goto L20;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L20:
        this.isLocked = true;     // Catch: Throwable -> L8 InterruptedException -> L13
        this.dataQueue.wait();     // Catch: Throwable -> L8 InterruptedException -> L13
    L15:
        this.isLocked = false;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L13:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L8
        goto L15
    }

    private void unlock() {
        LinkedBlockingQueue<byte[]> r0 = this.dataQueue;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.isLocked == true) goto L19;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L19:
        this.dataQueue.notifyAll();     // Catch: Throwable -> L8 Exception -> L12
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L12:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L8
        this.isLocked = false;     // Catch: Throwable -> L8
        goto L14
    }

    public void addStreamData(byte[] r2) {
        if (r2 == null) goto L12;
        this.dataQueue.put(r2);     // Catch: InterruptedException -> L7
        unlock();
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.OperationThread
    public int operation() {
        return 3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.manager == null) goto L28;
        LinkedBlockingQueue<byte[]> r0 = this.dataQueue;
        monitor-enter(r0);
    L33:
    L11:
        th = move-exception;
        throw th;
    L7:
        if (this.isRunning == false) goto L24;
        if (this.dataQueue.isEmpty() == true) goto L10;
        byte[] r2 = this.dataQueue.poll();     // Catch: Throwable -> L11
        if (r2 == null) goto L33;
        if (r2.length == 0) goto L33;
    L22:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L11
        callbackError(-2000, String.format(Locale.ENGLISH, "%s: %s", new Object[]{ErrorCode.getErrorMsg(-2000), e.getMessage()}));     // Catch: Throwable -> L11
        this.isRunning = false;     // Catch: Throwable -> L11
        goto L24
    L19:
        if (this.manager.nativeAddAudioStream(this.dataType, r2) == true) goto L33;
        this.isRunning = false;     // Catch: Throwable -> L11 Exception -> L22
        callbackError(ErrorCode.ERR_OP_FAIL);     // Catch: Throwable -> L11 Exception -> L22
    L10:
        lock();     // Catch: Throwable -> L11
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L11
    L29:
        this.isRunning = false;
        this.isLocked = false;
        this.dataQueue.clear();
        onThreadFinish();
        return;
    L28:
        callbackError(-1);
        goto L29
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        monitor-enter(this);
        this.isRunning = true;     // Catch: Throwable -> L7
        super.start();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void stopThread() {
        this.isRunning = false;
        unlock();
    }
}
