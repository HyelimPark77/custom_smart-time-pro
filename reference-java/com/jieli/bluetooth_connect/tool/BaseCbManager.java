package com.jieli.bluetooth_connect.tool;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCbManager<T> {
    private final ArrayList<T> mListeners = new ArrayList<>();
    private final Handler mUIHandler = new Handler(Looper.getMainLooper());

    public interface CallbackImpl<T> {
        void onCallback(T callback);
    }

    public class CallbackRunnable implements Runnable {
        private final CallbackImpl<T> mImpl;

        public CallbackRunnable(CallbackImpl<T> impl) {
            this.mImpl = impl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mImpl == null || BaseCbManager.this.mListeners.isEmpty()) {
                return;
            }
            Iterator it = new ArrayList(BaseCbManager.this.mListeners).iterator();
            while (it.hasNext()) {
                this.mImpl.onCallback((T) it.next());
            }
        }
    }

    public boolean addListener(T listener) {
        if (listener == null) {
            return false;
        }
        if (this.mListeners.contains(listener)) {
            return true;
        }
        return this.mListeners.add(listener);
    }

    public void callbackEvent(CallbackImpl<T> impl) {
        if (impl == null) {
            return;
        }
        CallbackRunnable callbackRunnable = new CallbackRunnable(impl);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mUIHandler.post(callbackRunnable);
        } else {
            callbackRunnable.run();
        }
    }

    public void destroy() {
        this.mListeners.clear();
        this.mUIHandler.removeCallbacksAndMessages(null);
    }

    public boolean removeListener(T listener) {
        if (listener == null || this.mListeners.isEmpty()) {
            return false;
        }
        return this.mListeners.remove(listener);
    }
}
