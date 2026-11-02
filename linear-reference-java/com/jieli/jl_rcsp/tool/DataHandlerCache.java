package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.tool.datahandles.DataHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DataHandlerCache {
    public static volatile DataHandlerCache c;
    public final Map<String, DataHandler> a;
    public final List<BluetoothDevice> b;

    public DataHandlerCache() {
        this.a = Collections.synchronizedMap(new HashMap());
        this.b = Collections.synchronizedList(new ArrayList());
    }

    public static DataHandlerCache getInstance() {
        if (c != null) goto L16;
        monitor-enter(DataHandlerCache.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (c != null) goto L11;
        c = new DataHandlerCache();     // Catch: Throwable -> L9
    L11:
        monitor-exit(DataHandlerCache.class);     // Catch: Throwable -> L9
    L16:
        return c;
    }

    public final void a() {
        Iterator r0 = new HashSet(this.a.keySet()).iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        String r1 = (String) r0.next();
        DataHandler r2 = this.a.get(r1);
        if (r2 == null) goto L4;
        r2.release();
        goto L4
    L8:
        this.a.clear();
        this.b.clear();
    }

    public void addDataHandler(BluetoothDevice r3, DataHandler r4) {
        if (r3 == null) goto L12;
        if (r4 != null) goto L6;
        return;
    L6:
        if (this.b.contains(r3) == true) goto L9;
        this.b.add(r3);
    L9:
        if (this.a.containsKey(r3.getAddress()) == true) goto L13;
        this.a.put(r3.getAddress(), r4);
        return;
    L13:
        return;
    }

    public void destroy() {
        a();
        c = null;
    }

    public DataHandler getDataHandler(BluetoothDevice r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return this.a.get(r2.getAddress());
    }

    public List<BluetoothDevice> getDeviceList() {
        return this.b;
    }

    public void removeDataHandler(BluetoothDevice r3) {
        if (r3 == null) goto L9;
        DataHandler r0 = this.a.remove(r3.getAddress());
        if (r0 == null) goto L8;
        this.b.remove(r3);
        r0.release();
        return;
    L8:
        return;
    }
}
