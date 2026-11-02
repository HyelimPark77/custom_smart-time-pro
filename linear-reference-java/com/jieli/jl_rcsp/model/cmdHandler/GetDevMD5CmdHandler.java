package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.status.GetDevMD5Cmd;
import com.jieli.jl_rcsp.model.response.GetDevMD5Response;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevMD5CmdHandler implements ICmdHandler {
    public GetDevMD5CmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r5, BasePacket r6) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (r6.getOpCode() == 212) goto L8;
        return null;
    L8:
        byte[] r0 = r6.getParamData();
        if (r6.getType() == 1) goto L11;
        CommandBase r7 = CommandHelper.getInstance().getCommand(r5, r6.getOpCode(), r6.getOpCodeSn());
        if (r0 != null) goto L15;
    L20:
        String r1 = "";
    L21:
        GetDevMD5Response r2 = new GetDevMD5Response(r1);
        r2.setRawData(r0);
        if (r7 == null) goto L25;
        GetDevMD5Cmd r8 = (GetDevMD5Cmd) r7;
        r8.setResponse(r2);
        r8.setStatus(r6.getStatus());
        return r8;
    L25:
        GetDevMD5Cmd r9 = new GetDevMD5Cmd();
        r9.setOpCodeSn(r6.getOpCodeSn());
        r9.setResponse(r2);
        r9.setStatus(r6.getStatus());
        return r9;
    L15:
        if (r0.length < 32) goto L20;
        r1 = new String(r0, 0, 32);     // Catch: Exception -> L18
    L18:
        e = move-exception;
        e.printStackTrace();
        goto L20
    L11:
        return new GetDevMD5Cmd().setOpCodeSn(r6.getOpCodeSn());
    }
}
