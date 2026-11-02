package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.custom.CustomCmd;
import com.jieli.jl_rcsp.model.parameter.CustomParam;
import com.jieli.jl_rcsp.model.response.CustomResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class CustomCmdHandler implements ICmdHandler {
    public CustomCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 255) goto L8;
        return null;
    L8:
        byte[] r0 = r8.getParamData();
        if (r8.getHasResponse() != 1) goto L11;
        int r1 = 2;
    L13:
        if (r8.getType() != 1) goto L22;
        byte[] r9 = new byte[0];
        if (r0 != null) goto L17;
    L19:
        r0 = r9;
    L20:
        CustomParam r10 = new CustomParam(r0);
        r10.setXmOpCode(r8.getXmOpCode());
        CustomCmd r2 = new CustomCmd(r1, r10);
        r2.setOpCodeSn(r8.getOpCodeSn());
        return r2;
    L17:
        if (r0.length <= 0) goto L19;
    L22:
        CommandBase r11 = CommandHelper.getInstance().getCommand(r7, r8.getOpCode(), r8.getOpCodeSn());
        CustomResponse r3 = new CustomResponse();
        ByteArrayOutputStream r4 = new ByteArrayOutputStream();
        r4.write(r8.getXmOpCode());
        r4.write(r0);     // Catch: Exception -> L25
    L27:
        r3.setRawData(r4.toByteArray());
        r3.setData(r0);
        r3.setXmOpCode(r8.getXmOpCode());
        if (r11 == null) goto L31;
        CustomCmd r12 = (CustomCmd) r11;
        r12.setStatus(r8.getStatus());
        r12.setResponse(r3);
        return r12;
    L31:
        CustomCmd r13 = new CustomCmd(r1, new CustomParam(new byte[0]));
        r13.setOpCodeSn(r8.getOpCodeSn());
        r13.setStatus(r8.getStatus());
        r13.setResponse(r3);
        return r13;
    L25:
        e = move-exception;
        e.printStackTrace();
        goto L27
    L11:
        r1 = 1;
        goto L13
    }
}
