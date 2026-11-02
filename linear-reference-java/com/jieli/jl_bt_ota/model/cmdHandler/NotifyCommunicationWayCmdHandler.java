package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.NotifyCommunicationWayCmd;
import com.jieli.jl_bt_ota.model.parameter.NotifyCommunicationWayParam;
import com.jieli.jl_bt_ota.model.response.NotifyCommunicationWayResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayCmdHandler implements ICmdHandler {
    public NotifyCommunicationWayCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r7, CommandBase r8) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 11) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        int r3 = 0;
        if (r7.getType() != 1) goto L20;
        if (r0 != null) goto L12;
    L17:
        int r9 = 0;
    L19:
        return new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(r3, r9)).setOpCodeSn(r7.getOpCodeSn());
    L12:
        if (r0.length <= 0) goto L17;
        int r10 = CHexConver.byteToInt(r0[0]);
        if (r0.length <= 1) goto L16;
        r3 = CHexConver.byteToInt(r0[1]);
    L16:
        int r5 = r3;
        r3 = r10;
        r9 = r5;
        goto L19
    L20:
        NotifyCommunicationWayResponse r1 = new NotifyCommunicationWayResponse();
        r1.setRawData(r0);
        if (r0 == null) goto L26;
        if (r0.length < 1) goto L26;
        r1.setFlag(CHexConver.byteToInt(r0[0]));
    L26:
        if ((r8 instanceof NotifyCommunicationWayCmd) == false) goto L28;
        NotifyCommunicationWayCmd r11 = (NotifyCommunicationWayCmd) r8;
    L29:
        r11.setOpCodeSn(r7.getOpCodeSn());
        r11.setStatus(r7.getStatus());
        r11.setResponse(r1);
        return r11;
    L28:
        r11 = new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(0, 0));
        goto L29
    }
}
