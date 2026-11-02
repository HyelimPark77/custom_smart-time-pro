package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.bluetooth.CmdSnGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes17.dex */
public class SnGenerator implements CmdSnGenerator {

    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> f38200b = new HashMap();

    /* JADX INFO: renamed from: a */
    public int f38199a = (new Random().nextInt(255) + 1) % 256;

    public synchronized int autoIncSN(BluetoothDevice bluetoothDevice) {
        int cmdSequence;
        try {
            cmdSequence = getCmdSequence(bluetoothDevice);
            int i = 0;
            if (bluetoothDevice != null) {
                int i2 = cmdSequence + 1;
                if (i2 < 256) {
                    i = i2;
                }
                this.f38200b.put(bluetoothDevice.getAddress(), Integer.valueOf(i));
            } else {
                int i3 = cmdSequence + 1;
                if (i3 < 256) {
                    i = i3;
                }
                this.f38199a = i;
            }
        } catch (Throwable th) {
            throw th;
        }
        return cmdSequence;
    }

    public void destroy() {
        this.f38200b.clear();
    }

    public int getCmdSequence(BluetoothDevice bluetoothDevice) {
        Integer num;
        if (bluetoothDevice != null && (num = this.f38200b.get(bluetoothDevice.getAddress())) != null) {
            return num.intValue();
        }
        return this.f38199a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.CmdSnGenerator
    public int getRcspCmdSeq(BluetoothDevice bluetoothDevice) {
        return autoIncSN(bluetoothDevice);
    }

    public void removeCmdSequence(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || this.f38200b.isEmpty()) {
            return;
        }
        this.f38200b.remove(bluetoothDevice.getAddress());
    }
}
