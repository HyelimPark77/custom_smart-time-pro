package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.status.GetTargetInfoCmd;
import com.jieli.jl_rcsp.model.parameter.GetTargetInfoParam;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetInfoCmdHandler implements ICmdHandler {
    public GetTargetInfoCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 3) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        byte r3 = 0;
        if (r7.getType() != 1) goto L19;
        if (r0 != null) goto L12;
    L16:
        int r8 = 0;
    L18:
        return new GetTargetInfoCmd(new GetTargetInfoParam(r8).setPlatform(r3)).setOpCodeSn(r7.getOpCodeSn());
    L12:
        if (r0.length < 4) goto L16;
        byte[] r9 = new byte[4];
        System.arraycopy(r0, 0, r9, 0, 4);
        r8 = CHexConver.bytesToInt(r9);
        if (r0.length < 5) goto L18;
        r3 = r0[4];
        goto L18
    L19:
        CommandBase r1 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        TargetInfoResponse r2 = new TargetInfoResponse();
        r2.setRawData(r0);
        ParseHelper.parseTargetInfo(r6, r2, r7);
        if (r1 == null) goto L23;
        GetTargetInfoCmd r4 = (GetTargetInfoCmd) r1;
        r4.setStatus(r7.getStatus());
        r4.setResponse(r2);
        return r4;
    L23:
        GetTargetInfoCmd r10 = new GetTargetInfoCmd(new GetTargetInfoParam(0).setPlatform((byte) 0));
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setStatus(r7.getStatus());
        r10.setResponse(r2);
        return r10;
    }
}
