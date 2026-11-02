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

    public AddStreamDataThread(BaseManager baseManager, int i, OnStateCallback onStateCallback, OnThreadFinishListener onThreadFinishListener) {
        super("AddStreamDataThread", baseManager, onStateCallback, onThreadFinishListener);
        this.dataQueue = new LinkedBlockingQueue<>();
        this.dataType = i;
    }

    private void lock() {
        synchronized (this.dataQueue) {
            if (this.isLocked) {
                return;
            }
            try {
                this.isLocked = true;
                this.dataQueue.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.isLocked = false;
        }
    }

    private void unlock() {
        synchronized (this.dataQueue) {
            if (this.isLocked) {
                try {
                    this.dataQueue.notifyAll();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.isLocked = false;
                }
            }
        }
    }

    public void addStreamData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            this.dataQueue.put(bArr);
            unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.OperationThread
    public int operation() {
        return 3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.manager != null) {
            synchronized (this.dataQueue) {
                while (this.isRunning) {
                    try {
                        if (this.dataQueue.isEmpty()) {
                            lock();
                        } else {
                            byte[] bArrPoll = this.dataQueue.poll();
                            if (bArrPoll != null && bArrPoll.length != 0) {
                                try {
                                    if (!this.manager.nativeAddAudioStream(this.dataType, bArrPoll)) {
                                        this.isRunning = false;
                                        callbackError(ErrorCode.ERR_OP_FAIL);
                                        break;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    callbackError(-2000, String.format(Locale.ENGLISH, "%s: %s", ErrorCode.getErrorMsg(-2000), e.getMessage()));
                                    this.isRunning = false;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else {
            callbackError(-1);
        }
        this.isRunning = false;
        this.isLocked = false;
        this.dataQueue.clear();
        onThreadFinish();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        this.isRunning = true;
        super.start();
    }

    public void stopThread() {
        this.isRunning = false;
        unlock();
    }
}
