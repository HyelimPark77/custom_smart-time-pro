package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.tws.GetLowLatencySettingsCmd;
import com.jieli.jl_rcsp.model.response.GetLowLatencySettingsResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetLowLatencySettingsCmdHandler implements ICmdHandler {
    public GetLowLatencySettingsCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 213) goto L8;
        return null;
    L8:
        byte[] r0 = r8.getParamData();
        if (r8.getType() == 1) goto L11;
        CommandBase r9 = CommandHelper.getInstance().getCommand(r7, r8.getOpCode(), r8.getOpCodeSn());
        int r1 = 50;
        if (r0 != null) goto L15;
    L19:
        int r2 = 20;
    L20:
        GetLowLatencySettingsResponse r3 = new GetLowLatencySettingsResponse(r2, r1);
        r3.setRawData(r0);
        if (r9 == null) goto L24;
        GetLowLatencySettingsCmd r10 = (GetLowLatencySettingsCmd) r9;
        r10.setResponse(r3);
        r10.setStatus(r8.getStatus());
        return r10;
    L24:
        GetLowLatencySettingsCmd r11 = new GetLowLatencySettingsCmd();
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setResponse(r3);
        r11.setStatus(r8.getStatus());
        return r11;
    L15:
        if (r0.length <= 1) goto L19;
        r2 = CHexConver.bytesToInt(r0, 0, 2);
        if (r0.length <= 5) goto L20;
        r1 = CHexConver.bytesToInt(r0, 2, 4);
        goto L20
    L11:
        return new GetLowLatencySettingsCmd().setOpCodeSn(r8.getOpCodeSn());
    }
}
