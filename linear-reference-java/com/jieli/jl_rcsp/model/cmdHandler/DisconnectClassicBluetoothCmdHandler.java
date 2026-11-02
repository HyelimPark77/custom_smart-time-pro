package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.DisconnectClassicBluetoothCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class DisconnectClassicBluetoothCmdHandler implements ICmdHandler {
    public DisconnectClassicBluetoothCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r5, BasePacket r6) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (r6.getOpCode() == 6) goto L8;
        return null;
    L8:
        byte[] r0 = r6.getParamData();
        if (r6.getType() == 1) goto L11;
        CommandBase r7 = CommandHelper.getInstance().getCommand(r5, r6.getOpCode(), r6.getOpCodeSn());
        CommonResponse r1 = new CommonResponse();
        r1.setRawData(r0);
        if (r7 == null) goto L16;
        DisconnectClassicBluetoothCmd r8 = (DisconnectClassicBluetoothCmd) r7;
        r8.setStatus(r6.getStatus());
        r8.setResponse(r1);
        return r8;
    L16:
        DisconnectClassicBluetoothCmd r9 = new DisconnectClassicBluetoothCmd();
        r9.setOpCodeSn(r6.getOpCodeSn());
        r9.setStatus(r6.getStatus());
        r9.setResponse(r1);
        return r9;
    L11:
        return new DisconnectClassicBluetoothCmd().setOpCodeSn(r6.getOpCodeSn());
    }
}
