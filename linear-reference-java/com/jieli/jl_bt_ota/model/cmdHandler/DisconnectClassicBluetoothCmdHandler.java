package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.DisconnectClassicBluetoothCmd;

/* JADX INFO: loaded from: classes17.dex */
public class DisconnectClassicBluetoothCmdHandler implements ICmdHandler {
    public DisconnectClassicBluetoothCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r4, CommandBase r5) {
        if (r4 != null) goto L6;
        return null;
    L6:
        if (r4.getOpCode() == 6) goto L8;
        return null;
    L8:
        byte[] r0 = r4.getParamData();
        if (r4.getType() == 1) goto L11;
        CommonResponse r1 = new CommonResponse();
        r1.setRawData(r0);
        if ((r5 instanceof DisconnectClassicBluetoothCmd) == false) goto L15;
        DisconnectClassicBluetoothCmd r6 = (DisconnectClassicBluetoothCmd) r5;
    L16:
        r6.setOpCodeSn(r4.getOpCodeSn());
        r6.setStatus(r4.getStatus());
        r6.setResponse(r1);
        return r6;
    L15:
        r6 = new DisconnectClassicBluetoothCmd();
        goto L16
    L11:
        return new DisconnectClassicBluetoothCmd().setOpCodeSn(r4.getOpCodeSn());
    }
}
