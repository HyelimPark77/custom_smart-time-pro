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

    /* JADX INFO: renamed from: c */
    public static volatile DataHandlerCache f38184c;

    /* JADX INFO: renamed from: a */
    public final Map<String, DataHandler> f38185a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    public final List<BluetoothDevice> f38186b = Collections.synchronizedList(new ArrayList());

    public static DataHandlerCache getInstance() {
        if (f38184c == null) {
            synchronized (DataHandlerCache.class) {
                try {
                    if (f38184c == null) {
                        f38184c = new DataHandlerCache();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38184c;
    }

    /* JADX INFO: renamed from: a */
    public final void m27619a() {
        Iterator it = new HashSet(this.f38185a.keySet()).iterator();
        while (it.hasNext()) {
            DataHandler dataHandler = this.f38185a.get((String) it.next());
            if (dataHandler != null) {
                dataHandler.release();
            }
        }
        this.f38185a.clear();
        this.f38186b.clear();
    }

    public void addDataHandler(BluetoothDevice bluetoothDevice, DataHandler dataHandler) {
        if (bluetoothDevice == null || dataHandler == null) {
            return;
        }
        if (!this.f38186b.contains(bluetoothDevice)) {
            this.f38186b.add(bluetoothDevice);
        }
        if (this.f38185a.containsKey(bluetoothDevice.getAddress())) {
            return;
        }
        this.f38185a.put(bluetoothDevice.getAddress(), dataHandler);
    }

    public void destroy() {
        m27619a();
        f38184c = null;
    }

    public DataHandler getDataHandler(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return this.f38185a.get(bluetoothDevice.getAddress());
    }

    public List<BluetoothDevice> getDeviceList() {
        return this.f38186b;
    }

    public void removeDataHandler(BluetoothDevice bluetoothDevice) {
        DataHandler dataHandlerRemove;
        if (bluetoothDevice == null || (dataHandlerRemove = this.f38185a.remove(bluetoothDevice.getAddress())) == null) {
            return;
        }
        this.f38186b.remove(bluetoothDevice);
        dataHandlerRemove.release();
    }
}
