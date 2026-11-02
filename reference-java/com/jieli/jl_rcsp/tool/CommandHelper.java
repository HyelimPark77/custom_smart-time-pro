package com.jieli.jl_rcsp.tool;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class CommandHelper {

    /* JADX INFO: renamed from: b */
    public static volatile CommandHelper f38182b;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, CommandBase> f38183a = new HashMap<>();

    @SuppressLint({"UseSparseArrays"})
    public CommandHelper() {
    }

    public static String getCacheCommandKey(BluetoothDevice bluetoothDevice, int i, int i2) {
        String str;
        if (bluetoothDevice != null) {
            str = bluetoothDevice.getAddress() + HelpFormatter.DEFAULT_OPT_PREFIX;
        } else {
            str = "";
        }
        String str2 = str + String.valueOf(i);
        if (i2 < 0) {
            return str2;
        }
        return str2 + HelpFormatter.DEFAULT_OPT_PREFIX + i2;
    }

    public static CommandHelper getInstance() {
        if (f38182b == null) {
            synchronized (CommandHelper.class) {
                try {
                    if (f38182b == null) {
                        f38182b = new CommandHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38182b;
    }

    public CommandBase getCommand(BluetoothDevice bluetoothDevice, int i, int i2) {
        return this.f38183a.get(getCacheCommandKey(bluetoothDevice, i, i2));
    }

    public void putCommandBase(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
        if (commandBase != null) {
            if (commandBase.getType() == 2 || commandBase.getType() == 3) {
                this.f38183a.put(getCacheCommandKey(bluetoothDevice, commandBase.getId(), commandBase.getOpCodeSn()), commandBase);
            }
        }
    }

    public void release() {
        this.f38183a.clear();
        f38182b = null;
    }

    public void removeCommandBase(BluetoothDevice bluetoothDevice, BasePacket basePacket) {
        if (basePacket != null) {
            removeCommandBase(bluetoothDevice, basePacket.getOpCode(), basePacket.getOpCodeSn());
        }
    }

    public void removeCommandBase(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f38183a.remove(getCacheCommandKey(bluetoothDevice, i, i2));
    }
}
