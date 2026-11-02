package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.GetTargetInfoCmd;
import com.jieli.jl_bt_ota.model.parameter.GetTargetInfoParam;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetInfoCmdHandler implements ICmdHandler {
    public GetTargetInfoCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r6, CommandBase r7) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (r6.getOpCode() == 3) goto L8;
        return null;
    L8:
        byte[] r0 = r6.getParamData();
        byte r3 = 0;
        if (r6.getType() != 1) goto L19;
        if (r0 != null) goto L12;
    L16:
        int r8 = 0;
    L18:
        return new GetTargetInfoCmd(new GetTargetInfoParam(r8).setPlatform(r3)).setOpCodeSn(r6.getOpCodeSn());
    L12:
        if (r0.length < 4) goto L16;
        byte[] r9 = new byte[4];
        System.arraycopy(r0, 0, r9, 0, 4);
        r8 = CHexConver.bytesToInt(r9);
        if (r0.length < 5) goto L18;
        r3 = r0[4];
        goto L18
    L19:
        TargetInfoResponse r1 = new TargetInfoResponse();
        r1.setRawData(r0);
        ParseHelper.parseTargetInfo(r1, r6);
        if ((r7 instanceof GetTargetInfoCmd) == false) goto L22;
        GetTargetInfoCmd r10 = (GetTargetInfoCmd) r7;
    L23:
        r10.setOpCodeSn(r6.getOpCodeSn());
        r10.setStatus(r6.getStatus());
        r10.setResponse(r1);
        return r10;
    L22:
        r10 = new GetTargetInfoCmd(new GetTargetInfoParam(0).setPlatform((byte) 0));
        goto L23
    }
}
