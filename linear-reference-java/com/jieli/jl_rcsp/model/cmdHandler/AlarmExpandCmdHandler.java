package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.BaseResponse;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.AlarmExpandCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class AlarmExpandCmdHandler implements ICmdHandler {
    public AlarmExpandCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        BaseResponse r0 = null;
        if (r8 != null) goto L5;
        return null;
    L5:
        int r1 = r8.getOpCode();
        if (r1 == 37) goto L9;
        return null;
    L9:
        if (r8.getType() == 1) goto L11;
        CommandBase r9 = CommandHelper.getInstance().getCommand(r7, r1, r8.getOpCodeSn());
        if (r9 == null) goto L15;
        AlarmExpandCmd r10 = (AlarmExpandCmd) r9;
    L16:
        byte r2 = r8.getParamData()[0];
        if (r2 == 0) goto L21;
        if (r2 != 1) goto L22;
        r0 = new AlarmExpandCmd.Response(r2);
    L22:
        if (r0 == null) goto L24;
        r0.setRawData(r8.getParamData());
    L24:
        r10.setStatus(r8.getStatus());
        r10.setResponse(r0);
        r10.setOpCodeSn(r8.getOpCodeSn());
        return r10;
    L21:
        int r3 = r8.getParamData().length - 1;
        byte[] r4 = new byte[r3];
        System.arraycopy(r8.getParamData(), 1, r4, 0, r3);
        r0 = new AlarmExpandCmd.ReadRtcBellArgsResponse(r2, r4);
        goto L22
    L15:
        r10 = new AlarmExpandCmd(new AlarmExpandCmd.ReadRtcBellArgsParams((byte) 0));
        goto L16
    L11:
        return new AlarmExpandCmd(new AlarmExpandCmd.Param((byte) 0, new byte[0]));
    }
}
