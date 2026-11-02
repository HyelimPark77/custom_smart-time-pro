package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.GetDevMD5Cmd;
import com.jieli.jl_bt_ota.model.response.GetDevMD5Response;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevMD5CmdHandler implements ICmdHandler {
    public GetDevMD5CmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r5, CommandBase r6) {
        if (r5 != null) goto L6;
        return null;
    L6:
        if (r5.getOpCode() == 212) goto L8;
        return null;
    L8:
        byte[] r0 = r5.getParamData();
        if (r5.getType() == 1) goto L11;
        if (r0 != null) goto L14;
    L19:
        String r1 = "";
    L20:
        GetDevMD5Response r2 = new GetDevMD5Response(r1);
        r2.setRawData(r0);
        if ((r6 instanceof GetDevMD5Cmd) == false) goto L23;
        GetDevMD5Cmd r7 = (GetDevMD5Cmd) r6;
    L24:
        r7.setOpCodeSn(r5.getOpCodeSn());
        r7.setResponse(r2);
        r7.setStatus(r5.getStatus());
        return r7;
    L23:
        r7 = new GetDevMD5Cmd();
        goto L24
    L14:
        if (r0.length < 32) goto L19;
        r1 = new String(r0, 0, 32);     // Catch: Exception -> L17
    L17:
        e = move-exception;
        e.printStackTrace();
        goto L19
    L11:
        return new GetDevMD5Cmd().setOpCodeSn(r5.getOpCodeSn());
    }
}
