package com.jieli.jl_bt_ota.util;

import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.command.CustomCmd;
import com.jieli.jl_bt_ota.model.command.DataCmd;
import com.jieli.jl_bt_ota.model.command.DataHasResponseCmd;
import com.jieli.jl_bt_ota.model.command.GetTargetInfoCmd;
import com.jieli.jl_bt_ota.model.command.tws.SetDeviceNotifyAdvInfoCmd;
import com.jieli.jl_bt_ota.model.parameter.CustomParam;
import com.jieli.jl_bt_ota.model.parameter.DataParam;
import com.jieli.jl_bt_ota.model.parameter.GetTargetInfoParam;
import com.jieli.jl_bt_ota.model.parameter.tws.SetDeviceNotifyAdvInfoParam;

/* JADX INFO: loaded from: classes17.dex */
public class CommandBuilder {
    public CommandBuilder() {
    }

    public static CustomCmd buildCustomCmd(byte[] r2) {
        return new CustomCmd(new CustomParam(r2));
    }

    public static CommandBase buildCustomCmdWithoutResponse(byte[] r2) {
        return new CustomCmd(1, new CustomParam(r2));
    }

    public static DataCmd buildDataCmd(CommandBase r1, byte[] r2) {
        if (r1 == null) goto L6;
        if (r2 == null) goto L8;
        DataParam r0 = new DataParam(r2);
        r0.setXmOpCode(r1.getId());
        return new DataCmd(r0);
    L8:
        return null;
    L6:
        return null;
    }

    public static DataHasResponseCmd buildDataCmdWithResponse(CommandBase r1, byte[] r2) {
        if (r1 == null) goto L8;
        if (r2 != null) goto L5;
        return null;
    L5:
        if (r2.length <= 0) goto L11;
        DataParam r0 = new DataParam(r2);
        r0.setXmOpCode(r1.getId());
        return new DataHasResponseCmd(r0);
    L11:
        return null;
    L8:
        return null;
    }

    public static GetTargetInfoCmd buildGetTargetInfoCmd(int r1) {
        return buildGetTargetInfoCmd(r1, (byte) 0);
    }

    public static GetTargetInfoCmd buildGetTargetInfoCmdForAll() {
        return buildGetTargetInfoCmd(-1, (byte) 0);
    }

    public static CommandBase buildSetDeviceNotifyADVInfoCmd(int r2) {
        return new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(r2));
    }

    public static CommandBase buildStopDeviceNotifyADVInfoCmd() {
        return buildSetDeviceNotifyADVInfoCmd(0);
    }

    public static GetTargetInfoCmd buildGetTargetInfoCmd(int r2, byte r3) {
        return new GetTargetInfoCmd(new GetTargetInfoParam(r2).setPlatform(r3));
    }
}
