package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.ReadErrorMsgCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class ReadErrorMsgCmdHandler implements ICmdHandler {
    public ReadErrorMsgCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r4, BasePacket r5) {
        if (r5 != null) goto L4;
        return null;
    L4:
        if (r5.getOpCode() == 41) goto L7;
        return null;
    L7:
        if (r5.getType() != 1) goto L10;
        ReadErrorMsgCmd.ReadErrorMsgParam r6 = new ReadErrorMsgCmd.ReadErrorMsgParam();
        r6.parseData(r5.getParamData());
        return new ReadErrorMsgCmd(r6).setOpCodeSn(r5.getOpCodeSn());
    L10:
        CommandBase r7 = CommandHelper.getInstance().getCommand(r4, r5.getOpCode(), r5.getOpCodeSn());
        if (r7 != null) goto L13;
        ReadErrorMsgCmd r8 = new ReadErrorMsgCmd(new ReadErrorMsgCmd.ReadErrorMsgParam());
    L14:
        ReadErrorMsgCmd.ReadErrorMsgResponse r0 = new ReadErrorMsgCmd.ReadErrorMsgResponse();
        r0.parseData(r5.getParamData());
        r8.setStatus(r5.getStatus());
        r8.setOpCodeSn(r5.getOpCodeSn());
        r8.setResponse(r0);
        return r8;
    L13:
        r8 = (ReadErrorMsgCmd) r7;
        goto L14
    }
}
