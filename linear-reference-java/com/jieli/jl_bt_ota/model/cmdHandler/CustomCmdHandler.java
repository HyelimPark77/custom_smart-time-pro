package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.CustomCmd;
import com.jieli.jl_bt_ota.model.parameter.CustomParam;
import com.jieli.jl_bt_ota.model.response.CustomResponse;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class CustomCmdHandler implements ICmdHandler {
    public CustomCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r7, CommandBase r8) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 255) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        if (r7.getHasResponse() != 1) goto L11;
        int r1 = 2;
    L13:
        if (r7.getType() != 1) goto L22;
        byte[] r9 = new byte[0];
        if (r0 != null) goto L17;
    L19:
        r0 = r9;
    L20:
        CustomParam r10 = new CustomParam(r0);
        r10.setXmOpCode(r7.getXmOpCode());
        CustomCmd r2 = new CustomCmd(r1, r10);
        r2.setOpCodeSn(r7.getOpCodeSn());
        return r2;
    L17:
        if (r0.length <= 0) goto L19;
    L22:
        CustomResponse r3 = new CustomResponse();
        ByteArrayOutputStream r4 = new ByteArrayOutputStream();
        r4.write(r7.getXmOpCode());
        r4.write(r0);     // Catch: Exception -> L25
    L27:
        r3.setRawData(r4.toByteArray());
        r3.setData(r0);
        r3.setXmOpCode(r7.getXmOpCode());
        if ((r8 instanceof CustomCmd) == false) goto L30;
        CustomCmd r11 = (CustomCmd) r8;
    L31:
        r11.setOpCodeSn(r7.getOpCodeSn());
        r11.setStatus(r7.getStatus());
        r11.setResponse(r3);
        return r11;
    L30:
        r11 = new CustomCmd(r1, new CustomParam(new byte[0]));
    L25:
        e = move-exception;
        e.printStackTrace();
        goto L27
    L11:
        r1 = 1;
        goto L13
    }
}
