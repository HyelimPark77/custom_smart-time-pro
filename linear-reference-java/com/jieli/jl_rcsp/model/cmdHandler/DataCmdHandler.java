package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.data.DataHasResponseCmd;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class DataCmdHandler implements ICmdHandler {
    public DataCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r4, BasePacket r5) {
        if (r5 != null) goto L6;
        return null;
    L6:
        if (r5.getOpCode() == 1) goto L9;
        return null;
    L9:
        if (r5.getType() == 1) goto L11;
        CommandBase r6 = CommandHelper.getInstance().getCommand(r4, r5.getOpCode(), r5.getOpCodeSn());
        CommonResponse r0 = new CommonResponse();
        r0.setRawData(r5.getParamData());
        r0.setXmOpCode(r5.getXmOpCode());
        if (r6 == null) goto L20;
        DataHasResponseCmd r7 = (DataHasResponseCmd) r6;
        r7.setStatus(r5.getStatus());
        r7.setResponse(r0);
        return r7;
    L20:
        DataHasResponseCmd r8 = new DataHasResponseCmd(new DataParam(new byte[0]));
        r8.setOpCodeSn(r5.getOpCodeSn());
        r8.setStatus(r5.getStatus());
        r8.setResponse(r0);
        return r8;
    L11:
        if (r5.getHasResponse() != 0) goto L15;
        return new DataCmd((DataParam) new DataParam(r5.getParamData()).setXmOpCode(r5.getXmOpCode())).setOpCodeSn(r5.getOpCodeSn());
    L15:
        return new DataHasResponseCmd((DataParam) new DataParam(r5.getParamData()).setXmOpCode(r5.getXmOpCode())).setOpCodeSn(r5.getOpCodeSn());
    }
}
