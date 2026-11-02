package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.FunctionCmd;
import com.jieli.jl_rcsp.model.parameter.FunctionParam;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionCmdHandler implements ICmdHandler {
    public FunctionCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 14) goto L8;
        return null;
    L8:
        byte[] r0 = r8.getParamData();
        byte r3 = -1;
        if (r8.getType() != 1) goto L20;
        byte[] r1 = new byte[0];
        if (r0 != null) goto L13;
    L17:
        byte r2 = -1;
    L19:
        return new FunctionCmd(new FunctionParam(r3, r2).setExtend(r1)).setOpCodeSn(r8.getOpCodeSn());
    L13:
        if (r0.length <= 1) goto L17;
        r3 = r0[0];
        r2 = r0[1];
        if (r0.length <= 2) goto L19;
        int r4 = r0.length - 2;
        byte[] r5 = new byte[r4];
        System.arraycopy(r0, 2, r5, 0, r4);
        r1 = r5;
        goto L19
    L20:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r7, r8.getOpCode(), r8.getOpCodeSn());
        CommonResponse r6 = new CommonResponse();
        r6.setRawData(r0);
        if (r9 == null) goto L24;
        FunctionCmd r10 = (FunctionCmd) r9;
        r10.setStatus(r8.getStatus());
        r10.setResponse(r6);
        return r10;
    L24:
        FunctionCmd r11 = new FunctionCmd(new FunctionParam((byte) -1, (byte) -1));
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setStatus(r8.getStatus());
        r11.setResponse(r6);
        return r11;
    }
}
