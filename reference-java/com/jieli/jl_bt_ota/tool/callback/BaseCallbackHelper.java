package com.jieli.jl_bt_ota.tool.callback;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCallbackHelper<T> {
    protected final ArrayList<T> callbacks = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private final Handler f37675a = new Handler(Looper.getMainLooper());

    public static class CallbackRunnable<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        private final ArrayList<T> f37676a;

        /* JADX INFO: renamed from: b */
        private final ICallbackHandler<T> f37677b;

        public CallbackRunnable(ArrayList<T> arrayList, ICallbackHandler<T> iCallbackHandler) {
            this.f37676a = arrayList;
            this.f37677b = iCallbackHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<T> arrayList = this.f37676a;
            if (arrayList == null || arrayList.isEmpty() || this.f37677b == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(this.f37676a);
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.f37677b.onHandle((T) obj);
            }
        }
    }

    public interface ICallbackHandler<T> {
        void onHandle(T t);
    }

    public boolean addCallback(T t) {
        if (t == null) {
            return false;
        }
        boolean zContains = this.callbacks.contains(t);
        return !zContains ? this.callbacks.add(t) : zContains;
    }

    public void callbackEvent(ICallbackHandler<T> iCallbackHandler) {
        if (iCallbackHandler == null) {
            return;
        }
        CallbackRunnable callbackRunnable = new CallbackRunnable(this.callbacks, iCallbackHandler);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            callbackRunnable.run();
        } else {
            this.f37675a.post(callbackRunnable);
        }
    }

    public void release() {
        this.callbacks.clear();
        this.f37675a.removeCallbacksAndMessages(null);
    }

    public boolean removeCallback(T t) {
        if (t == null || this.callbacks.isEmpty()) {
            return false;
        }
        return this.callbacks.remove(t);
    }
}
