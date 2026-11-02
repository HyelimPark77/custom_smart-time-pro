package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.BaseResponse;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileFromDeviceCmdHandler implements ICmdHandler {
    public ReadFileFromDeviceCmdHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r8, BasePacket r9) {
        if (r9 != null) goto L5;
        return null;
    L5:
        byte[] r1 = r9.getParamData();
        if (r1 != null) goto L8;
    L43:
        return null;
    L8:
        if (r1.length == 0) goto L43;
        int r3 = 0;
        byte r4 = 0;
        byte r5 = 0;
        if (r9.getType() != 1) goto L27;
        byte r10 = r1[0];
        if (r10 != (-128)) goto L19;
        if (r9.getStatus() != 0) goto L17;
        r4 = r1[1];
    L17:
        ReadFileFromDeviceCmd.Param r11 = new ReadFileFromDeviceCmd.StopParam(r4);
    L25:
        ReadFileFromDeviceCmd r0 = new ReadFileFromDeviceCmd(r11);
        r0.setOpCodeSn(r9.getOpCodeSn());
        return r0;
    L19:
        if (r10 == (-127)) goto L21;
        r11 = new ReadFileFromDeviceCmd.Param((byte) -1);
        goto L25
    L21:
        if (r9.getStatus() != 0) goto L23;
        r5 = r1[1];
    L23:
        r11 = new ReadFileFromDeviceCmd.CancelParam(r5);
        goto L25
    L27:
        CommandBase r12 = CommandHelper.getInstance().getCommand(r8, r9.getOpCode(), r9.getOpCodeSn());
        if (r12 != null) goto L31;
        ReadFileFromDeviceCmd r13 = new ReadFileFromDeviceCmd(null);
        r13.setOpCodeSn(r9.getOpCodeSn());
        return r13;
    L31:
        ReadFileFromDeviceCmd r14 = (ReadFileFromDeviceCmd) r12;
        byte r2 = ((ReadFileFromDeviceCmd.Param) r14.getParam()).op;
        if (r2 == 0) goto L38;
        if (r2 == 1) goto L38;
        if (r2 == 2) goto L38;
        BaseResponse r6 = new ReadFileFromDeviceCmd.Response();
    L41:
        r6.setRawData(r9.getParamData());
        r14.setStatus(r9.getStatus());
        r14.setOpCodeSn(r9.getOpCodeSn());
        r14.setResponse(r6);
        return r14;
    L38:
        if (r9.getStatus() != 0) goto L40;
        r3 = CHexConver.bytesToInt(r1, 1, 4);
    L40:
        r6 = new ReadFileFromDeviceCmd.StartResponse(r3);
        goto L41
    }
}
