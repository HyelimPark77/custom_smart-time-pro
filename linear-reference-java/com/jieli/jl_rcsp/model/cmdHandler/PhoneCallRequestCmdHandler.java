package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.phone.PhoneCallRequestCmd;
import com.jieli.jl_rcsp.model.parameter.PhoneCallRequestParam;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class PhoneCallRequestCmdHandler implements ICmdHandler {
    public PhoneCallRequestCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 10) goto L8;
        return null;
    L8:
        byte[] r0 = r8.getParamData();
        String r2 = "";
        int r3 = 0;
        if (r8.getType() != 1) goto L18;
        if (r0 == null) goto L17;
        if (r0.length <= 0) goto L17;
        r3 = CHexConver.byteToInt(r0[0]);
        if (r0.length <= 1) goto L17;
        r2 = new String(r0, 1, r0.length - 1);
    L17:
        return new PhoneCallRequestCmd(new PhoneCallRequestParam(r2).setType(r3)).setOpCodeSn(r8.getOpCodeSn());
    L18:
        CommandBase r9 = CommandHelper.getInstance().getCommand(r7, r8.getOpCode(), r8.getOpCodeSn());
        CommonResponse r1 = new CommonResponse();
        r1.setRawData(r0);
        if (r9 == null) goto L22;
        PhoneCallRequestCmd r10 = (PhoneCallRequestCmd) r9;
        r10.setStatus(r8.getStatus());
        r10.setResponse(r1);
        return r10;
    L22:
        PhoneCallRequestCmd r11 = new PhoneCallRequestCmd(new PhoneCallRequestParam("").setType(0));
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setStatus(r8.getStatus());
        r11.setResponse(r1);
        return r11;
    }
}
