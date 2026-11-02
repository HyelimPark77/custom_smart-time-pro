package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class WatchCacheManager {

    /* JADX INFO: renamed from: a */
    public final Map<String, WatchCache> f38278a = new HashMap();

    public static class WatchCache {

        /* JADX INFO: renamed from: a */
        public int f38279a;

        /* JADX INFO: renamed from: b */
        public int f38280b;

        /* JADX INFO: renamed from: c */
        public boolean f38281c;

        /* JADX INFO: renamed from: d */
        public short f38282d;

        public short getCrc16() {
            return this.f38282d;
        }

        public int getWriteLen() {
            return this.f38280b;
        }

        public int getWriteOffset() {
            return this.f38279a;
        }

        public boolean isNeedCheckReadData() {
            return this.f38281c;
        }

        public WatchCache setCrc16(short s) {
            this.f38282d = s;
            return this;
        }

        public WatchCache setNeedCheckReadData(boolean z) {
            this.f38281c = z;
            return this;
        }

        public WatchCache setWriteLen(int i) {
            this.f38280b = i;
            return this;
        }

        public WatchCache setWriteOffset(int i) {
            this.f38279a = i;
            return this;
        }
    }

    public void destroy() {
        this.f38278a.clear();
    }

    public WatchCache getWatchCache(String str) {
        return this.f38278a.get(str);
    }

    public WatchCache getWatchCacheByDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return getWatchCache(bluetoothDevice.getAddress());
    }

    public boolean isNeedCheckReadData(BluetoothDevice bluetoothDevice) {
        WatchCache watchCacheByDevice = getWatchCacheByDevice(bluetoothDevice);
        if (watchCacheByDevice == null) {
            return false;
        }
        return watchCacheByDevice.isNeedCheckReadData();
    }

    public void putWatchCache(String str, WatchCache watchCache) {
        this.f38278a.put(str, watchCache);
    }

    public void putWatchCacheByDevice(BluetoothDevice bluetoothDevice, WatchCache watchCache) {
        if (bluetoothDevice == null) {
            return;
        }
        putWatchCache(bluetoothDevice.getAddress(), watchCache);
    }

    public WatchCache removeWatchCache(String str) {
        return this.f38278a.remove(str);
    }

    public WatchCache removeWatchCacheByDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return removeWatchCache(bluetoothDevice.getAddress());
    }
}
