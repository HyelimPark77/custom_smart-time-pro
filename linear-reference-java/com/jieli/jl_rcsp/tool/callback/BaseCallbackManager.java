package com.jieli.jl_rcsp.tool.callback;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCallbackManager<T> {
    public final ArrayList<T> a;
    public final Handler b;

    public interface CallbackImpl<T> {
        void onPost(T r1);
    }

    public class CallbackRunnable implements Runnable {
        public final CallbackImpl<T> a;
        public final /* synthetic */ BaseCallbackManager b;

        public CallbackRunnable(BaseCallbackManager r1, CallbackImpl<T> r2) {
            this.b = r1;
            this.a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseCallbackManager.a(this.b).isEmpty() == false) goto L5;
            return;
        L5:
            if (this.a == null) goto L12;
            Iterator r0 = new ArrayList(BaseCallbackManager.a(this.b)).iterator();
        L8:
            if (r0.hasNext() == false) goto L13;
            Object r1 = r0.next();
            this.a.onPost((T) r1);
            goto L8
        L13:
            return;
        }
    }

    public BaseCallbackManager() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static /* synthetic */ ArrayList a(BaseCallbackManager r0) {
        return r0.a;
    }

    public void callbackEvent(CallbackImpl<T> r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        CallbackRunnable r0 = new CallbackRunnable(this, r3);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) goto L8;
        this.b.post(r0);
        return;
    L8:
        r0.run();
    }

    public void registerCallback(T r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.a.contains(r2) == true) goto L9;
        this.a.add(r2);
        return;
    }

    public void release() {
        this.a.clear();
        this.b.removeCallbacksAndMessages(null);
    }

    public void unregisterCallback(T r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.a.isEmpty() == true) goto L9;
        this.a.remove(r2);
        return;
    }

    public BaseCallbackManager(Handler r2) {
        this.a = new ArrayList();
        if (r2 != null) goto L5;
        r2 = new Handler(Looper.getMainLooper());
    L5:
        this.b = r2;
    }
}
