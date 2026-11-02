package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.BatchCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class BatchHandler implements ICmdHandler {
    public BatchHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r8, BasePacket r9) {
        if (r9 != null) goto L6;
        return null;
    L6:
        if (r9.getOpCode() == 38) goto L8;
        return null;
    L8:
        byte[] r0 = r9.getParamData();
        if (r9.getHasResponse() != 1) goto L11;
        int r1 = 2;
    L13:
        if (r9.getType() != 1) goto L16;
        int r10 = r0.length - 2;
        byte[] r3 = new byte[r10];
        System.arraycopy(r0, 2, r3, 0, r10);
        BatchCmd r2 = new BatchCmd(r1, new BatchCmd.Param(r0[0], r3));
        r2.setOpCodeSn(r9.getOpCodeSn());
        return r2;
    L16:
        CommandBase r11 = CommandHelper.getInstance().getCommand(r8, r9.getOpCode(), r9.getOpCodeSn());
        if (r11 != null) goto L19;
        r11 = new BatchCmd(r1, new BatchCmd.Param(r0[0], new byte[0]));
    L19:
        BatchCmd.Response r4 = new BatchCmd.Response(r0[0], r0[1]);
        r4.setRawData(r0);
        r4.setXmOpCode(r9.getXmOpCode());
        BatchCmd r5 = (BatchCmd) r11;
        r5.setOpCodeSn(r9.getOpCodeSn());
        r5.setResponse(r4);
        r5.setStatus(r9.getStatus());
        return r11;
    L11:
        r1 = 1;
        goto L13
    }
}
