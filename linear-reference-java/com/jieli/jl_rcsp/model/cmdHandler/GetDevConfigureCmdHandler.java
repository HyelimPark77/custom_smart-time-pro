package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.GetDevConfigureCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevConfigureCmdHandler implements ICmdHandler {
    public GetDevConfigureCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r5, BasePacket r6) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (r6.getOpCode() == 217) goto L8;
        return null;
    L8:
        byte[] r0 = r6.getParamData();
        if (r6.getType() == 1) goto L11;
        CommandBase r7 = CommandHelper.getInstance().getCommand(r5, r6.getOpCode(), r6.getOpCodeSn());
        GetDevConfigureCmd.Response r1 = new GetDevConfigureCmd.Response();
        r1.parseData(r0);
        if (r7 != null) goto L15;
        GetDevConfigureCmd r8 = new GetDevConfigureCmd();
    L16:
        r8.setResponse(r1);
        r8.setOpCodeSn(r6.getOpCodeSn());
        r8.setStatus(r6.getStatus());
        return r8;
    L15:
        r8 = (GetDevConfigureCmd) r7;
        goto L16
    L11:
        return new GetDevConfigureCmd().setOpCodeSn(r6.getOpCodeSn());
    }
}
