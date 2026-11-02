package com.jieli.jl_filebrowse.tool;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class CallbackRunnable<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f37834a;

    /* JADX INFO: renamed from: b */
    public final CallbackImpl<T> f37835b;

    public CallbackRunnable(ArrayList<T> arrayList, CallbackImpl<T> callbackImpl) {
        this.f37834a = arrayList;
        this.f37835b = callbackImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<T> arrayList = this.f37834a;
        if (arrayList == null || this.f37835b == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.f37834a).iterator();
        while (it.hasNext()) {
            this.f37835b.onCallback((T) it.next());
        }
    }
}
