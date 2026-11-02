package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.SettingsMtuCmd;
import com.jieli.jl_rcsp.model.parameter.SettingsMtuParam;
import com.jieli.jl_rcsp.model.response.SettingsMtuResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SettingsMtuCmdHandler implements ICmdHandler {
    public SettingsMtuCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r8, BasePacket r9) {
        if (r9 != null) goto L6;
        return null;
    L6:
        if (r9.getOpCode() == 209) goto L8;
        return null;
    L8:
        byte[] r0 = r9.getParamData();
        if (r9.getType() != 1) goto L17;
        int r10 = DeviceStatusManager.getInstance().getMaxCommunicationMtu(r8);
        if (r0 == null) goto L16;
        if (r0.length < 2) goto L16;
        r10 = CHexConver.bytesToInt(r0[0], r0[1]);
    L16:
        return new SettingsMtuCmd(new SettingsMtuParam(r10)).setOpCodeSn(r9.getOpCodeSn());
    L17:
        CommandBase r11 = CommandHelper.getInstance().getCommand(r8, r9.getOpCode(), r9.getOpCodeSn());
        SettingsMtuResponse r1 = new SettingsMtuResponse(530);
        r1.setRawData(r0);
        if (r0 != null) goto L20;
    L22:
        if (r11 == null) goto L25;
        SettingsMtuCmd r12 = (SettingsMtuCmd) r11;
        r12.setStatus(r9.getStatus());
        r12.setResponse(r1);
        return r12;
    L25:
        SettingsMtuCmd r13 = new SettingsMtuCmd(new SettingsMtuParam(530));
        r13.setOpCodeSn(r9.getOpCodeSn());
        r13.setStatus(r9.getStatus());
        r13.setResponse(r1);
        return r13;
    L20:
        if (r0.length < 2) goto L22;
        r1.setRealMtu(CHexConver.bytesToInt(r0[0], r0[1]));
        goto L22
    }
}
