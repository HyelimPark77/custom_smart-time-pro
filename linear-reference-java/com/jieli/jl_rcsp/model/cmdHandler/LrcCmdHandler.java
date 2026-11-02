package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.file_op.StartLrcGetCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopLrcGetCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class LrcCmdHandler implements ICmdHandler {
    public LrcCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        int r1 = r8.getOpCode();
        if (r1 == 15) goto L11;
        if (r1 == 16) goto L11;
        if (r1 == 17) goto L11;
    L23:
        return null;
    L11:
        if (r8.getType() != 1) goto L20;
        switch(r1) {
            case 15: goto L19;
            case 16: goto L17;
            case 17: goto L15;
            default: goto L23;
        };
    L15:
        return new CommandBase(r1, "PushStartTtsCmd").setOpCodeSn(r8.getOpCodeSn());
    L17:
        return new StopLrcGetCmd().setOpCodeSn(r8.getOpCodeSn());
    L19:
        return new StartLrcGetCmd().setOpCodeSn(r8.getOpCodeSn());
    L20:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r7, r1, r8.getOpCodeSn());
        CommonResponse r4 = new CommonResponse();
        r4.setRawData(r8.getParamData());
        if (r1 == 15) goto L29;
        if (r1 != 16) goto L23;
        if (r9 == null) goto L27;
        StopLrcGetCmd r10 = (StopLrcGetCmd) r9;
        r10.setStatus(r8.getStatus());
        r10.setResponse(r4);
        return r10;
    L27:
        StopLrcGetCmd r11 = new StopLrcGetCmd();
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setStatus(r8.getStatus());
        r11.setResponse(r4);
        return r11;
    L29:
        if (r9 == null) goto L32;
        StartLrcGetCmd r12 = (StartLrcGetCmd) r9;
        r12.setStatus(r8.getStatus());
        r12.setResponse(r4);
        return r12;
    L32:
        StartLrcGetCmd r13 = new StartLrcGetCmd();
        r13.setOpCodeSn(r8.getOpCodeSn());
        r13.setStatus(r8.getStatus());
        r13.setResponse(r4);
        return r13;
    }
}
