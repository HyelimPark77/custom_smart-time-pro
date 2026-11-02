package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataTransferCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class DataTransferCmdHandler implements ICmdHandler {
    public DataTransferCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L4;
        return null;
    L4:
        if (r7.getOpCode() == 48) goto L7;
        return null;
    L7:
        if (r7.getHasResponse() != 0) goto L9;
        int r0 = 1;
    L10:
        byte[] r3 = r7.getParamData();
        if (r7.getType() != 1) goto L25;
        DataTransferCmd.Param r8 = new DataTransferCmd.Param(r3);
        int r4 = r8.getOp();
        if (r4 == 0) goto L20;
        if (r4 == 1) goto L18;
        if (r4 != 2) goto L24;
        r8 = new DataTransferCmd.CancelTransferParam(r3);
    L24:
        return new DataTransferCmd(r0, r8).setOpCodeSn(r7.getOpCodeSn());
    L18:
        r8 = new DataTransferCmd.DataTransferParam(r3);
        goto L24
    L20:
        if (new DataTransferCmd.TransferParam(r3).getWay() != 1) goto L22;
        r8 = new DataTransferCmd.SendDataParam(r3);
        goto L24
    L22:
        r8 = new DataTransferCmd.ReadDataParam(r3);
        goto L24
    L25:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        if (r9 != null) goto L28;
        DataTransferCmd r10 = new DataTransferCmd(new DataTransferCmd.Param(new byte[0]));
    L29:
        DataTransferCmd.Response r1 = new DataTransferCmd.Response(r3);
        int r2 = r1.getOp();
        if (r2 == 0) goto L35;
        if (r2 != 1) goto L38;
        r1 = new DataTransferCmd.DataTransferResponse(r3);
    L38:
        r10.setResponse(r1);
        r10.setStatus(r7.getStatus());
        r10.setOpCodeSn(r7.getOpCodeSn());
        return r10;
    L35:
        if (new DataTransferCmd.TransferParamResponse(r3).getWay() != 1) goto L37;
        r1 = new DataTransferCmd.SendDataResponse(r3);
        goto L38
    L37:
        r1 = new DataTransferCmd.ReadDataResponse(r3);
        goto L38
    L28:
        r10 = (DataTransferCmd) r9;
        goto L29
    L9:
        r0 = 2;
        goto L10
    }
}
