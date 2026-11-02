package com.jieli.bluetooth_connect.tool;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
abstract class BaseCbManager<T> {
    private final ArrayList<T> mListeners;
    private final Handler mUIHandler;

    public interface CallbackImpl<T> {
        void onCallback(T callback);
    }

    public class CallbackRunnable implements Runnable {
        private final CallbackImpl<T> mImpl;
        final /* synthetic */ BaseCbManager this$0;

        public CallbackRunnable(final BaseCbManager this$0, CallbackImpl<T> impl) {
            this.this$0 = this$0;
            this.mImpl = impl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mImpl != null) goto L5;
            return;
        L5:
            if (BaseCbManager.access$000(this.this$0).isEmpty() == true) goto L12;
            Iterator r0 = new ArrayList(BaseCbManager.access$000(this.this$0)).iterator();
        L8:
            if (r0.hasNext() == false) goto L13;
            Object r1 = r0.next();
            this.mImpl.onCallback((T) r1);
            goto L8
        L13:
            return;
        }
    }

    public BaseCbManager() {
        this.mListeners = new ArrayList();
        this.mUIHandler = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ ArrayList access$000(BaseCbManager r0) {
        return r0.mListeners;
    }

    public boolean addListener(T listener) {
        if (listener != null) goto L6;
        return false;
    L6:
        if (this.mListeners.contains(listener) == false) goto L10;
        return true;
    L10:
        return this.mListeners.add(listener);
    }

    public void callbackEvent(CallbackImpl<T> impl) {
        if (impl != null) goto L4;
        return;
    L4:
        CallbackRunnable r0 = new CallbackRunnable(this, impl);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) goto L8;
        this.mUIHandler.post(r0);
        return;
    L8:
        r0.run();
    }

    public void destroy() {
        this.mListeners.clear();
        this.mUIHandler.removeCallbacksAndMessages(null);
    }

    public boolean removeListener(T listener) {
        if (listener != null) goto L4;
        return false;
    L4:
        if (this.mListeners.isEmpty() == false) goto L7;
        return false;
    L7:
        return this.mListeners.remove(listener);
    }
}
