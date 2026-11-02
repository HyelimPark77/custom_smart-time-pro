package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.model.device.settings.v0.BoundDeviceState;
import com.jieli.jl_rcsp.model.device.settings.v0.BrightnessSetting;
import com.jieli.jl_rcsp.model.device.settings.v0.DialExpandInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.FlashlightSetting;
import com.jieli.jl_rcsp.model.device.settings.v0.FunctionResource;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkFunction;
import com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class PublicSettingsCmdHandler implements ICmdHandler {
    public PublicSettingsCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 51) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        if (r7.getHasResponse() != 1) goto L11;
        int r1 = 2;
    L13:
        if (r7.getType() != 1) goto L36;
        SettingData r8 = new SettingData(r0);
        PublicSettingsCmd.Param r4 = new PublicSettingsCmd.Param(r8);
        if (r8.getVersion() != 0) goto L35;
        int r9 = new SettingFunction(r0).getFunction();
        if (r9 == 1) goto L33;
        if (r9 != 2) goto L20;
        r4 = new PublicSettingsCmd.Param(new FlashlightSetting(r0));
        goto L35
    L20:
        if (r9 != 3) goto L22;
        r4 = new PublicSettingsCmd.Param(new BoundDeviceState(r0));
        goto L35
    L22:
        if (r9 != 4) goto L24;
        r4 = new PublicSettingsCmd.Param(new FunctionResource(r0));
        goto L35
    L24:
        if (r9 != 5) goto L26;
        r4 = new PublicSettingsCmd.Param(new NetworkFunction(r0));
        goto L35
    L26:
        if (r9 != 7) goto L35;
        r4 = new PublicSettingsCmd.Param(new DialExpandInfo(r0));
        goto L35
    L33:
        r4 = new PublicSettingsCmd.Param(new BrightnessSetting(r0));
    L35:
        return new PublicSettingsCmd(r1, r4).setOpCodeSn(r7.getOpCodeSn());
    L36:
        CommandBase r10 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        if (r10 == null) goto L39;
        PublicSettingsCmd r11 = (PublicSettingsCmd) r10;
    L40:
        r11.setResponse(new PublicSettingsCmd.Response(r0));
        r11.setStatus(r7.getStatus());
        r11.setOpCodeSn(r7.getOpCodeSn());
        return r11;
    L39:
        r11 = new PublicSettingsCmd(r1, new PublicSettingsCmd.Param());
        goto L40
    L11:
        r1 = 1;
        goto L13
    }
}
