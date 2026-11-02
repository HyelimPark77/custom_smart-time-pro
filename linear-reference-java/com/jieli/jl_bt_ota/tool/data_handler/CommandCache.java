package com.jieli.jl_bt_ota.tool.data_handler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_rcsp.model.device.settings.v0.DeviceState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class CommandCache {
    private final HashMap<String, CommandBase> a;

    public CommandCache() {
        this.a = new HashMap();
    }

    public static String getCacheCommandKey(BluetoothDevice r0, int r1, int r2) {
        if (r0 != null) goto L4;
        String r3 = DeviceState.INVALID_ADDRESS;
    L6:
        return getCacheCommandKey(r3, r1, r2);
    L4:
        r3 = r0.getAddress();
        goto L6
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
    }

    public void removeCommandBase(BluetoothDevice r2, BasePacket r3) {
        if (r3 == null) goto L5;
        removeCommandBase(r2, r3.getOpCode(), r3.getOpCodeSn());
        return;
    }

    public void removeCommandBase(BluetoothDevice r2, int r3, int r4) {
        this.a.remove(getCacheCommandKey(r2, r3, r4));
    }

    public static String getCacheCommandKey(String r0, int r1, int r2) {
        return CommonUtil.formatString("%s-%s-%s", new Object[]{r0, Integer.valueOf(r1), Integer.valueOf(r2)});
    }
}
