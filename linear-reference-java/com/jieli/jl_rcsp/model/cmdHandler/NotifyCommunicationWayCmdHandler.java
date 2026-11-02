package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.NotifyCommunicationWayCmd;
import com.jieli.jl_rcsp.model.parameter.NotifyCommunicationWayParam;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayCmdHandler implements ICmdHandler {
    public NotifyCommunicationWayCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 11) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        int r3 = 0;
        if (r7.getType() != 1) goto L17;
        if (r0 != null) goto L12;
    L14:
        int r8 = 0;
    L16:
        return new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(r3, r8)).setOpCodeSn(r7.getOpCodeSn());
    L12:
        if (r0.length <= 1) goto L14;
        r3 = CHexConver.byteToInt(r0[0]);
        r8 = CHexConver.byteToInt(r0[1]);
        goto L16
    L17:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        CommonResponse r1 = new CommonResponse();
        r1.setRawData(r0);
        if (r9 == null) goto L21;
        NotifyCommunicationWayCmd r10 = (NotifyCommunicationWayCmd) r9;
        r10.setStatus(r7.getStatus());
        r10.setResponse(r1);
        return r10;
    L21:
        NotifyCommunicationWayCmd r11 = new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(0, 0));
        r11.setOpCodeSn(r7.getOpCodeSn());
        r11.setStatus(r7.getStatus());
        r11.setResponse(r1);
        return r11;
    }
}
