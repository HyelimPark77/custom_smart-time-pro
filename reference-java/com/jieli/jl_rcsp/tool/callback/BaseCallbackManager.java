package com.jieli.jl_rcsp.tool.callback;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCallbackManager<T> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f38287a;

    /* JADX INFO: renamed from: b */
    public final Handler f38288b;

    public interface CallbackImpl<T> {
        void onPost(T t);
    }

    public class CallbackRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CallbackImpl<T> f38289a;

        public CallbackRunnable(CallbackImpl<T> callbackImpl) {
            this.f38289a = callbackImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseCallbackManager.this.f38287a.isEmpty() || this.f38289a == null) {
                return;
            }
            Iterator it = new ArrayList(BaseCallbackManager.this.f38287a).iterator();
            while (it.hasNext()) {
                this.f38289a.onPost((T) it.next());
            }
        }
    }

    public BaseCallbackManager() {
        this(new Handler(Looper.getMainLooper()));
    }

    public void callbackEvent(CallbackImpl<T> callbackImpl) {
        if (callbackImpl == null) {
            return;
        }
        CallbackRunnable callbackRunnable = new CallbackRunnable(callbackImpl);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f38288b.post(callbackRunnable);
        } else {
            callbackRunnable.run();
        }
    }

    public void registerCallback(T t) {
        if (t == null || this.f38287a.contains(t)) {
            return;
        }
        this.f38287a.add(t);
    }

    public void release() {
        this.f38287a.clear();
        this.f38288b.removeCallbacksAndMessages(null);
    }

    public void unregisterCallback(T t) {
        if (t == null || this.f38287a.isEmpty()) {
            return;
        }
        this.f38287a.remove(t);
    }

    public BaseCallbackManager(Handler handler) {
        this.f38287a = new ArrayList<>();
        this.f38288b = handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
