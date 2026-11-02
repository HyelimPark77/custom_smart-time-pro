package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.tws.NotifyAdvInfoCmd;
import com.jieli.jl_bt_ota.model.command.tws.RequestAdvOpCmd;
import com.jieli.jl_bt_ota.model.command.tws.SetDeviceNotifyAdvInfoCmd;
import com.jieli.jl_bt_ota.model.parameter.tws.NotifyAdvInfoParam;
import com.jieli.jl_bt_ota.model.parameter.tws.RequestAdvOpParam;
import com.jieli.jl_bt_ota.model.parameter.tws.SetDeviceNotifyAdvInfoParam;
import com.jieli.jl_bt_ota.model.response.SetDeviceNotifyAdvInfoResponse;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class TwsCmdHandler implements ICmdHandler {
    public TwsCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r9, CommandBase r10) {
        if (r9 != null) goto L5;
        return null;
    L5:
        int r1 = r9.getOpCode();
        if (r1 == 194) goto L9;
        if (r1 == 195) goto L9;
        if (r1 == 196) goto L9;
    L29:
        return null;
    L9:
        byte[] r2 = r9.getParamData();
        int r7 = 0;
        if (r9.getType() != 1) goto L27;
        switch(r1) {
            case 194: goto L25;
            case 195: goto L19;
            case 196: goto L13;
            default: goto L29;
        };
    L13:
        if (r2 == null) goto L18;
        if (r2.length <= 0) goto L18;
        r7 = CHexConver.byteToInt(r2[0]);
    L18:
        return new RequestAdvOpCmd(new RequestAdvOpParam(r7)).setOpCodeSn(r9.getOpCodeSn());
    L19:
        if (r2 == null) goto L24;
        if (r2.length <= 0) goto L24;
        r7 = CHexConver.byteToInt(r2[0]);
    L24:
        return new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(r7)).setOpCodeSn(r9.getOpCodeSn());
    L25:
        NotifyAdvInfoParam r11 = new NotifyAdvInfoParam();
        ParseHelper.parseNotifyADVInfo(r11, r9);
        return new NotifyAdvInfoCmd(r11).setOpCodeSn(r9.getOpCodeSn());
    L27:
        if (r1 == 195) goto L36;
        if (r1 != 196) goto L29;
        CommonResponse r0 = new CommonResponse();
        r0.setRawData(r2);
        if ((r10 instanceof RequestAdvOpCmd) == false) goto L33;
        RequestAdvOpCmd r12 = (RequestAdvOpCmd) r10;
    L34:
        r12.setOpCodeSn(r9.getOpCodeSn());
        r12.setStatus(r9.getStatus());
        r12.setResponse(r0);
        return r12;
    L33:
        r12 = new RequestAdvOpCmd(new RequestAdvOpParam(0));
        goto L34
    L36:
        if (r2 != null) goto L38;
    L40:
        int r3 = -1;
    L41:
        SetDeviceNotifyAdvInfoResponse r4 = new SetDeviceNotifyAdvInfoResponse(r3);
        r4.setRawData(r2);
        if ((r10 instanceof SetDeviceNotifyAdvInfoCmd) == false) goto L44;
        SetDeviceNotifyAdvInfoCmd r13 = (SetDeviceNotifyAdvInfoCmd) r10;
    L45:
        r13.setOpCodeSn(r9.getOpCodeSn());
        r13.setStatus(r9.getStatus());
        r13.setResponse(r4);
        return r13;
    L44:
        r13 = new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(0));
        goto L45
    L38:
        if (r2.length <= 0) goto L40;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L41
    }
}
