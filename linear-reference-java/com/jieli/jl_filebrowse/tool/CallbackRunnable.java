package com.jieli.jl_filebrowse.tool;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class CallbackRunnable<T> implements Runnable {
    public final ArrayList<T> a;
    public final CallbackImpl<T> b;

    public CallbackRunnable(ArrayList<T> r1, CallbackImpl<T> r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<T> r0 = this.a;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.b != null) goto L7;
        return;
    L7:
        if (r0.isEmpty() == true) goto L16;
        Iterator r1 = new ArrayList(this.a).iterator();
    L11:
        if (r1.hasNext() == false) goto L17;
        Object r2 = r1.next();
        this.b.onCallback((T) r2);
        goto L11
    L17:
        return;
    }
}
