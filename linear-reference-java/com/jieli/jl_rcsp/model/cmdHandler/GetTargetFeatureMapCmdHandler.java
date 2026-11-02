package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.status.GetTargetFeatureMapCmd;
import com.jieli.jl_rcsp.model.response.TargetFeatureMapResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetFeatureMapCmdHandler implements ICmdHandler {
    public GetTargetFeatureMapCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r6, BasePacket r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if (r7.getOpCode() == 2) goto L8;
        return null;
    L8:
        byte[] r0 = r7.getParamData();
        if (r7.getType() == 1) goto L11;
        CommandBase r8 = CommandHelper.getInstance().getCommand(r6, r7.getOpCode(), r7.getOpCodeSn());
        TargetFeatureMapResponse r1 = new TargetFeatureMapResponse();
        r1.setRawData(r0);
        if (r0 != null) goto L15;
    L17:
        if (r8 == null) goto L20;
        GetTargetFeatureMapCmd r9 = (GetTargetFeatureMapCmd) r8;
        r9.setStatus(r7.getStatus());
        r9.setResponse(r1);
        return r9;
    L20:
        GetTargetFeatureMapCmd r10 = new GetTargetFeatureMapCmd();
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setStatus(r7.getStatus());
        r10.setResponse(r1);
        return r10;
    L15:
        if (r0.length < 4) goto L17;
        byte[] r2 = new byte[4];
        System.arraycopy(r0, 0, r2, 0, 4);
        r1.setMask(CHexConver.bytesToInt(r2));
        goto L17
    L11:
        return new GetTargetFeatureMapCmd().setOpCodeSn(r7.getOpCodeSn());
    }
}
