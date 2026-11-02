package com.jieli.jl_rcsp.tool;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class CommandHelper {
    public static volatile CommandHelper b;
    public final HashMap<String, CommandBase> a;

    @SuppressLint({"UseSparseArrays"})
    public CommandHelper() {
        this.a = new HashMap();
    }

    public static String getCacheCommandKey(BluetoothDevice r2, int r3, int r4) {
        if (r2 == null) goto L5;
        String r5 = r2.getAddress() + HelpFormatter.DEFAULT_OPT_PREFIX;
    L6:
        String r6 = r5 + String.valueOf(r3);
        if (r4 >= 0) goto L9;
        return r6;
    L9:
        return r6 + HelpFormatter.DEFAULT_OPT_PREFIX + r4;
    L5:
        r5 = "";
        goto L6
    }

    public static CommandHelper getInstance() {
        if (b != null) goto L16;
        monitor-enter(CommandHelper.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (b != null) goto L11;
        b = new CommandHelper();     // Catch: Throwable -> L9
    L11:
        monitor-exit(CommandHelper.class);     // Catch: Throwable -> L9
    L16:
        return b;
    }

    public CommandBase getCommand(BluetoothDevice r2, int r3, int r4) {
        return this.a.get(getCacheCommandKey(r2, r3, r4));
    }

    public void putCommandBase(BluetoothDevice r3, CommandBase r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.getType() != 2) goto L6;
    L7:
        String r5 = getCacheCommandKey(r3, r4.getId(), r4.getOpCodeSn());
        this.a.put(r5, r4);
        return;
    L6:
        if (r4.getType() == 3) goto L7;
    }

    public void release() {
        this.a.clear();
        b = null;
    }

    public void removeCommandBase(BluetoothDevice r2, BasePacket r3) {
        if (r3 == null) goto L5;
        removeCommandBase(r2, r3.getOpCode(), r3.getOpCodeSn());
        return;
    }

    public void removeCommandBase(BluetoothDevice r2, int r3, int r4) {
        this.a.remove(getCacheCommandKey(r2, r3, r4));
    }
}
