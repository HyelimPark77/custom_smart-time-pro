package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.phone.NotifyPhoneNumberPlayModeCmd;
import com.jieli.jl_rcsp.model.parameter.NotifyPhoneNumberPlayModeParam;
import com.jieli.jl_rcsp.model.response.NotifyPhoneNumberPlayModeResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyPhoneNumberPlayModeCmdHandler implements ICmdHandler {
    public NotifyPhoneNumberPlayModeCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 241) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        int r3 = 0;
        if (r7.getType() != 1) goto L16;
        if (r0 == null) goto L15;
        if (r0.length <= 0) goto L15;
        r3 = CHexConver.byteToInt(r0[0]);
    L15:
        return new NotifyPhoneNumberPlayModeCmd(new NotifyPhoneNumberPlayModeParam(r3)).setOpCodeSn(r7.getOpCodeSn());
    L16:
        CommandBase r8 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        if (r0 != null) goto L19;
    L21:
        int r1 = -1;
    L22:
        NotifyPhoneNumberPlayModeResponse r2 = new NotifyPhoneNumberPlayModeResponse(r1);
        r2.setRawData(r0);
        if (r8 == null) goto L26;
        NotifyPhoneNumberPlayModeCmd r9 = (NotifyPhoneNumberPlayModeCmd) r8;
        r9.setStatus(r7.getStatus());
        r9.setResponse(r2);
        return r9;
    L26:
        NotifyPhoneNumberPlayModeCmd r10 = new NotifyPhoneNumberPlayModeCmd(new NotifyPhoneNumberPlayModeParam(0));
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setStatus(r7.getStatus());
        r10.setResponse(r2);
        return r10;
    L19:
        if (r0.length <= 0) goto L21;
        r1 = CHexConver.byteToInt(r0[0]);
        goto L22
    }
}
