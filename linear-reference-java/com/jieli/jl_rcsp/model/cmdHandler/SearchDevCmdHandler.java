package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.SearchDevCmd;
import com.jieli.jl_rcsp.model.parameter.SearchDevParam;
import com.jieli.jl_rcsp.model.response.SearchDevResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SearchDevCmdHandler implements ICmdHandler {
    public SearchDevCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r8, BasePacket r9) {
        if (r9 != null) goto L6;
        return null;
    L6:
        if (r9.getOpCode() == 25) goto L8;
        return null;
    L8:
        byte[] r0 = r9.getParamData();
        int r3 = 0;
        if (r9.getType() != 1) goto L30;
        if (r0 != null) goto L12;
    L27:
        int r10 = 0;
        int r1 = 0;
    L26:
        int r2 = r1;
        int r4 = r2;
    L29:
        return new SearchDevCmd(new SearchDevParam(r10, r2, r4).setWay(r3).setPlayer(r1)).setOpCodeSn(r9.getOpCodeSn());
    L12:
        if (r0.length <= 0) goto L27;
        r10 = CHexConver.byteToInt(r0[0]);
        if (r0.length <= 1) goto L25;
        r2 = CHexConver.byteToInt(r0[1]);
        if (r0.length <= 3) goto L24;
        r4 = CHexConver.bytesToInt(r0[2], r0[3]);
        if (r0.length <= 4) goto L23;
        int r5 = CHexConver.byteToInt(r0[4]);
        if (r0.length <= 5) goto L22;
        r3 = CHexConver.byteToInt(r0[5]);
    L22:
        r1 = r3;
        r3 = r5;
        goto L29
    L23:
        r1 = 0;
        goto L29
    L24:
        r1 = 0;
        r4 = 0;
        goto L29
    L25:
        r1 = 0;
        goto L26
    L30:
        CommandBase r11 = CommandHelper.getInstance().getCommand(r8, r9.getOpCode(), r9.getOpCodeSn());
        if (r0 != null) goto L33;
    L35:
        SearchDevResponse r6 = new SearchDevResponse(0);
    L36:
        r6.setRawData(r0);
        if (r11 == null) goto L40;
        SearchDevCmd r12 = (SearchDevCmd) r11;
        r12.setStatus(r9.getStatus());
        r12.setResponse(r6);
        return r12;
    L40:
        SearchDevCmd r13 = new SearchDevCmd(new SearchDevParam());
        r13.setOpCodeSn(r9.getOpCodeSn());
        r13.setStatus(r9.getStatus());
        r13.setResponse(r6);
        return r13;
    L33:
        if (r0.length <= 0) goto L35;
        r6 = new SearchDevResponse(CHexConver.byteToInt(r0[0]));
        goto L36
    }
}
