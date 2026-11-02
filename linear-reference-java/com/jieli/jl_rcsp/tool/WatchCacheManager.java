package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class WatchCacheManager {
    public final Map<String, WatchCache> a;

    public static class WatchCache {
        public int a;
        public int b;
        public boolean c;
        public short d;

        public WatchCache() {
        }

        public short getCrc16() {
            return this.d;
        }

        public int getWriteLen() {
            return this.b;
        }

        public int getWriteOffset() {
            return this.a;
        }

        public boolean isNeedCheckReadData() {
            return this.c;
        }

        public WatchCache setCrc16(short r1) {
            this.d = r1;
            return this;
        }

        public WatchCache setNeedCheckReadData(boolean r1) {
            this.c = r1;
            return this;
        }

        public WatchCache setWriteLen(int r1) {
            this.b = r1;
            return this;
        }

        public WatchCache setWriteOffset(int r1) {
            this.a = r1;
            return this;
        }
    }

    public WatchCacheManager() {
        this.a = new HashMap();
    }

    public void destroy() {
        this.a.clear();
    }

    public WatchCache getWatchCache(String r2) {
        return this.a.get(r2);
    }

    public WatchCache getWatchCacheByDevice(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return getWatchCache(r1.getAddress());
    }

    public boolean isNeedCheckReadData(BluetoothDevice r1) {
        WatchCache r2 = getWatchCacheByDevice(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isNeedCheckReadData();
    }

    public void putWatchCache(String r2, WatchCache r3) {
        this.a.put(r2, r3);
    }

    public void putWatchCacheByDevice(BluetoothDevice r1, WatchCache r2) {
        if (r1 != null) goto L4;
        return;
    L4:
        putWatchCache(r1.getAddress(), r2);
    }

    public WatchCache removeWatchCache(String r2) {
        return this.a.remove(r2);
    }

    public WatchCache removeWatchCacheByDevice(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return removeWatchCache(r1.getAddress());
    }
}
