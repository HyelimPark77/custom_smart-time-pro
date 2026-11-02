package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceExtendParamCmdHandler implements ICmdHandler {
    private final String tag;

    public DeviceExtendParamCmdHandler() {
        this.tag = getClass().getSimpleName();
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        byte[] r0 = r7.getParamData();
        DeviceExtendParamCmd.Param r1 = null;
        if (r0 != null) goto L5;
    L30:
        JL_Log.e(this.tag, "parseDataToCmd", "异常：数据包内容为空，cmd id = " + RcspUtil.formatString("%02x", new Object[]{Integer.valueOf(r7.getOpCode())}));
        return null;
    L5:
        if (r0.length < 1) goto L30;
        if (r7.getType() != 1) goto L20;
        byte r8 = r0[0];
        if (r8 == 0) goto L17;
        if (r8 != 1) goto L13;
        r1 = new DeviceExtendParamCmd.DeleteFileParam(r0);
    L19:
        return new DeviceExtendParamCmd(r1);
    L13:
        if (r8 != 2) goto L19;
        r1 = new DeviceExtendParamCmd.ReadFileParam(r0);
        goto L19
    L17:
        r1 = new DeviceExtendParamCmd.FileTransferParam(r0);
        goto L19
    L20:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        if (r9 == null) goto L23;
        DeviceExtendParamCmd r10 = (DeviceExtendParamCmd) r9;
    L24:
        byte r2 = r0[0];
        if (r2 != 0) goto L27;
        DeviceExtendParamCmd.Response r3 = new DeviceExtendParamCmd.FileTransferResponse(r0);
    L28:
        r3.setRawData(r0);
        r10.setStatus(r7.getStatus());
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setResponse(r3);
        return r10;
    L27:
        r3 = new DeviceExtendParamCmd.Response(r2);
        goto L28
    L23:
        r10 = new DeviceExtendParamCmd(new DeviceExtendParamCmd.Param(r0[0]));
        goto L24
    }
}
