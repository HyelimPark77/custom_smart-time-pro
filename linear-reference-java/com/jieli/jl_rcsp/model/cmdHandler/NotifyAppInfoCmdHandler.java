package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.NotifyAppInfoCmd;
import com.jieli.jl_rcsp.model.parameter.NotifyAppInfoParam;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyAppInfoCmdHandler implements ICmdHandler {
    public NotifyAppInfoCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 208) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        int r3 = 0;
        if (r7.getType() != 1) goto L16;
        if (r0 == null) goto L15;
        if (r0.length <= 0) goto L15;
        r3 = CHexConver.byteToInt(r0[0]);
    L15:
        return new NotifyAppInfoCmd(new NotifyAppInfoParam(r3)).setOpCodeSn(r7.getOpCodeSn());
    L16:
        CommandBase r8 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        CommonResponse r1 = new CommonResponse();
        r1.setRawData(r0);
        if (r8 == null) goto L20;
        NotifyAppInfoCmd r9 = (NotifyAppInfoCmd) r8;
        r9.setStatus(r7.getStatus());
        r9.setResponse(r1);
        return r9;
    L20:
        NotifyAppInfoCmd r10 = new NotifyAppInfoCmd(new NotifyAppInfoParam(0));
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setStatus(r7.getStatus());
        r10.setResponse(r1);
        return r10;
    }
}
