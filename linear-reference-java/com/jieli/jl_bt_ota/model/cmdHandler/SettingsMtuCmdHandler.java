package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.SettingsMtuCmd;
import com.jieli.jl_bt_ota.model.parameter.SettingsMtuParam;
import com.jieli.jl_bt_ota.model.response.SettingsMtuResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SettingsMtuCmdHandler implements ICmdHandler {
    public SettingsMtuCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r8, CommandBase r9) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 209) goto L8;
        return null;
    L8:
        byte[] r0 = r8.getParamData();
        int r4 = 530;
        if (r8.getType() != 1) goto L16;
        if (r0 == null) goto L15;
        if (r0.length < 2) goto L15;
        r4 = CHexConver.bytesToInt(r0[0], r0[1]);
    L15:
        return new SettingsMtuCmd(new SettingsMtuParam(r4)).setOpCodeSn(r8.getOpCodeSn());
    L16:
        SettingsMtuResponse r1 = new SettingsMtuResponse(530);
        r1.setRawData(r0);
        if (r0 == null) goto L22;
        if (r0.length < 2) goto L22;
        r1.setRealMtu(CHexConver.bytesToInt(r0[0], r0[1]));
    L22:
        if ((r9 instanceof SettingsMtuCmd) == false) goto L24;
        SettingsMtuCmd r10 = (SettingsMtuCmd) r9;
    L25:
        r10.setOpCodeSn(r8.getOpCodeSn());
        r10.setStatus(r8.getStatus());
        r10.setResponse(r1);
        return r10;
    L24:
        r10 = new SettingsMtuCmd(new SettingsMtuParam(530));
        goto L25
    }
}
