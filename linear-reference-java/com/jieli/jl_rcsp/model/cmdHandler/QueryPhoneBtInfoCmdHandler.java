package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.double_connect.QueryPhoneBtInfoCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class QueryPhoneBtInfoCmdHandler implements ICmdHandler {
    public QueryPhoneBtInfoCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        int r1 = r8.getOpCode();
        if (r1 == 49) goto L8;
        return null;
    L8:
        byte[] r2 = r8.getParamData();
        if (r8.getHasResponse() != 1) goto L11;
        int r3 = 2;
    L13:
        if (r8.getType() != 1) goto L16;
        QueryPhoneBtInfoCmd.NotifyParam r9 = new QueryPhoneBtInfoCmd.NotifyParam();
        r9.parseData(r2);
        return new QueryPhoneBtInfoCmd(r3, r9).setOpCodeSn(r8.getOpCodeSn());
    L16:
        CommandBase r10 = CommandHelper.getInstance().getCommand(r7, r1, r8.getOpCodeSn());
        if (r10 != null) goto L19;
        QueryPhoneBtInfoCmd r11 = new QueryPhoneBtInfoCmd(null);
    L20:
        QueryPhoneBtInfoCmd.Response r0 = new QueryPhoneBtInfoCmd.Response();
        r0.setRawData(r2);
        r0.parseData(r2);
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setStatus(r8.getStatus());
        r11.setResponse(r0);
        return r11;
    L19:
        r11 = (QueryPhoneBtInfoCmd) r10;
        goto L20
    L11:
        r3 = 1;
        goto L13
    }
}
