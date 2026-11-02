package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.GetTargetFeatureMapCmd;
import com.jieli.jl_bt_ota.model.response.TargetFeatureMapResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetFeatureMapCmdHandler implements ICmdHandler {
    public GetTargetFeatureMapCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r6, CommandBase r7) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (r6.getOpCode() == 2) goto L8;
        return null;
    L8:
        byte[] r0 = r6.getParamData();
        if (r6.getType() == 1) goto L11;
        TargetFeatureMapResponse r1 = new TargetFeatureMapResponse();
        r1.setRawData(r0);
        if (r0 == null) goto L18;
        if (r0.length < 4) goto L18;
        byte[] r2 = new byte[4];
        System.arraycopy(r0, 0, r2, 0, 4);
        r1.setMask(CHexConver.bytesToInt(r2));
    L18:
        if ((r7 instanceof GetTargetFeatureMapCmd) == false) goto L20;
        GetTargetFeatureMapCmd r8 = (GetTargetFeatureMapCmd) r7;
    L21:
        r8.setOpCodeSn(r6.getOpCodeSn());
        r8.setStatus(r6.getStatus());
        r8.setResponse(r1);
        return r8;
    L20:
        r8 = new GetTargetFeatureMapCmd();
        goto L21
    L11:
        return new GetTargetFeatureMapCmd().setOpCodeSn(r6.getOpCodeSn());
    }
}
