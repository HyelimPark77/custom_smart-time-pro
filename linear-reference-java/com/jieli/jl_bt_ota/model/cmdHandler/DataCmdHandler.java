package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.DataCmd;
import com.jieli.jl_bt_ota.model.command.DataHasResponseCmd;
import com.jieli.jl_bt_ota.model.parameter.DataParam;

/* JADX INFO: loaded from: classes17.dex */
public class DataCmdHandler implements ICmdHandler {
    public DataCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r4, CommandBase r5) {
        if (r4 != null) goto L6;
        return null;
    L6:
        if (r4.getOpCode() == 1) goto L9;
        return null;
    L9:
        if (r4.getType() == 1) goto L11;
        CommonResponse r0 = new CommonResponse();
        r0.setRawData(r4.getParamData());
        r0.setXmOpCode(r4.getXmOpCode());
        if ((r5 instanceof DataHasResponseCmd) == false) goto L19;
        DataHasResponseCmd r6 = (DataHasResponseCmd) r5;
    L20:
        r6.setOpCodeSn(r4.getOpCodeSn());
        r6.setStatus(r4.getStatus());
        r6.setResponse(r0);
        return r6;
    L19:
        r6 = new DataHasResponseCmd(new DataParam(new byte[0]));
        goto L20
    L11:
        if (r4.getHasResponse() != 0) goto L15;
        return new DataCmd((DataParam) new DataParam(r4.getParamData()).setXmOpCode(r4.getXmOpCode())).setOpCodeSn(r4.getOpCodeSn());
    L15:
        return new DataHasResponseCmd((DataParam) new DataParam(r4.getParamData()).setXmOpCode(r4.getXmOpCode())).setOpCodeSn(r4.getOpCodeSn());
    }
}
