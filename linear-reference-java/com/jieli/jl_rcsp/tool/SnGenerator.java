package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.bluetooth.CmdSnGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes17.dex */
public class SnGenerator implements CmdSnGenerator {
    public int a;
    public final Map<String, Integer> b;

    public SnGenerator() {
        this.b = new HashMap();
        this.a = (new Random().nextInt(255) + 1) % 256;
    }

    public synchronized int autoIncSN(BluetoothDevice r5) {
        monitor-enter(this);
        int r0 = getCmdSequence(r5);     // Catch: Throwable -> L10
        int r1 = 0;
        if (r5 == null) goto L12;
        int r3 = r0 + 1;     // Catch: Throwable -> L10
        if (r3 >= 256) goto L9;
        r1 = r3;
    L9:
        this.b.put(r5.getAddress(), Integer.valueOf(r1));     // Catch: Throwable -> L10
    L17:
        monitor-exit(this);
        return r0;
    L12:
        int r6 = r0 + 1;     // Catch: Throwable -> L10
        if (r6 >= 256) goto L16;
        r1 = r6;
    L16:
        this.a = r1;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public void destroy() {
        this.b.clear();
    }

    public int getCmdSequence(BluetoothDevice r2) {
        if (r2 == null) goto L4;
        Integer r3 = this.b.get(r2.getAddress());
        if (r3 != null) goto L10;
        return this.a;
    L10:
        return r3.intValue();
    L4:
        return this.a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.CmdSnGenerator
    public int getRcspCmdSeq(BluetoothDevice r1) {
        return autoIncSN(r1);
    }

    public void removeCmdSequence(BluetoothDevice r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.b.isEmpty() == true) goto L9;
        this.b.remove(r2.getAddress());
        return;
    }
}
