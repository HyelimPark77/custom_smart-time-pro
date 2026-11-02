package com.jieli.jl_bt_ota.tool.callback;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCallbackHelper<T> {
    private final Handler a;
    protected final ArrayList<T> callbacks;

    public static class CallbackRunnable<T> implements Runnable {
        private final ArrayList<T> a;
        private final ICallbackHandler<T> b;

        public CallbackRunnable(ArrayList<T> r1, ICallbackHandler<T> r2) {
            this.a = r1;
            this.b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<T> r0 = this.a;
            if (r0 != null) goto L5;
            return;
        L5:
            if (r0.isEmpty() == false) goto L7;
            return;
        L7:
            if (this.b == null) goto L15;
            ArrayList r1 = new ArrayList(this.a);
            int r2 = r1.size();
            int r3 = 0;
        L10:
            if (r3 >= r2) goto L16;
            Object r4 = r1.get(r3);
            r3 = r3 + 1;
            this.b.onHandle((T) r4);
            goto L10
        L16:
            return;
        }
    }

    public interface ICallbackHandler<T> {
        void onHandle(T r1);
    }

    public BaseCallbackHelper() {
        this.callbacks = new ArrayList();
        this.a = new Handler(Looper.getMainLooper());
    }

    public boolean addCallback(T r2) {
        if (r2 != null) goto L5;
        return false;
    L5:
        boolean r0 = this.callbacks.contains(r2);
        if (r0 == false) goto L8;
        return r0;
    L8:
        return this.callbacks.add(r2);
    }

    public void callbackEvent(ICallbackHandler<T> r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        CallbackRunnable r0 = new CallbackRunnable(this.callbacks, r6);
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) goto L8;
        r0.run();
        return;
    L8:
        this.a.post(r0);
    }

    public void release() {
        this.callbacks.clear();
        this.a.removeCallbacksAndMessages(null);
    }

    public boolean removeCallback(T r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (this.callbacks.isEmpty() == false) goto L7;
        return false;
    L7:
        return this.callbacks.remove(r2);
    }
}
