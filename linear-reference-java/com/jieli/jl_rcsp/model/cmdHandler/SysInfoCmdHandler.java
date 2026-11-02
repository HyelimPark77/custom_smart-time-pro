package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.sys.GetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.SetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.UpdateSysInfoCmd;
import com.jieli.jl_rcsp.model.parameter.GetSysInfoParam;
import com.jieli.jl_rcsp.model.parameter.SetSysInfoParam;
import com.jieli.jl_rcsp.model.parameter.UpdateSysInfoParam;
import com.jieli.jl_rcsp.model.response.SysInfoResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class SysInfoCmdHandler implements ICmdHandler {
    public SysInfoCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r11, BasePacket r12) {
        if (r12 != null) goto L5;
        return null;
    L5:
        int r1 = r12.getOpCode();
        if (r1 == 7) goto L9;
        if (r1 == 8) goto L9;
        if (r1 == 9) goto L9;
    L46:
        return null;
    L9:
        byte[] r5 = r12.getParamData();
        byte r7 = -1;
        if (r12.getType() != 1) goto L43;
        byte r13 = 0;
        if (r1 == 7) goto L36;
        if (r1 == 8) goto L26;
        if (r1 != 9) goto L46;
        byte[] r0 = new byte[0];
        if (r5 == null) goto L25;
        if (r5.length <= 0) goto L25;
        r7 = r5[0];
        int r2 = r5.length - 1;
        byte[] r3 = new byte[r2];
        if (r2 <= 0) goto L23;
        System.arraycopy(r5, 1, r3, 0, r2);
    L23:
        r0 = r3;
    L25:
        return new UpdateSysInfoCmd(new UpdateSysInfoParam(r7, ParseHelper.coverParamDataToAttrBeans(r0))).setOpCodeSn(r12.getOpCodeSn());
    L26:
        byte[] r4 = new byte[0];
        if (r5 == null) goto L35;
        if (r5.length <= 0) goto L35;
        r7 = r5[0];
        int r6 = r5.length - 1;
        byte[] r8 = new byte[r6];
        if (r6 <= 0) goto L33;
        System.arraycopy(r5, 1, r8, 0, r6);
    L33:
        r4 = r8;
    L35:
        return new SetSysInfoCmd(new SetSysInfoParam(r7, ParseHelper.coverParamDataToAttrBeans(r4))).setOpCodeSn(r12.getOpCodeSn());
    L36:
        if (r5 != null) goto L38;
    L40:
        int r9 = 0;
    L42:
        return new GetSysInfoCmd(new GetSysInfoParam(r13, r9)).setOpCodeSn(r12.getOpCodeSn());
    L38:
        if (r5.length < 5) goto L40;
        byte r10 = r5[0];
        byte[] r14 = new byte[4];
        System.arraycopy(r5, 1, r14, 0, 4);
        r9 = CHexConver.bytesToInt(r14);
        r13 = r10;
        goto L42
    L43:
        CommandBase r15 = CommandHelper.getInstance().getCommand(r11, r1, r12.getOpCodeSn());
        if (r1 == 7) goto L53;
        if (r1 != 8) goto L46;
        CommonResponse r16 = new CommonResponse();
        r16.setRawData(r5);
        if (r15 == null) goto L51;
        SetSysInfoCmd r17 = (SetSysInfoCmd) r15;
        r17.setStatus(r12.getStatus());
        r17.setResponse(r16);
        return r17;
    L51:
        SetSysInfoCmd r18 = new SetSysInfoCmd(new SetSysInfoParam((byte) -1, new ArrayList()));
        r18.setOpCodeSn(r12.getOpCodeSn());
        r18.setStatus(r12.getStatus());
        r18.setResponse(r16);
        return r18;
    L53:
        SysInfoResponse r19 = new SysInfoResponse();
        r19.setRawData(r5);
        if (r12.getStatus() != 0) goto L56;
        ParseHelper.parseSysInfo(r19, r12);
    L56:
        if (r15 == null) goto L59;
        GetSysInfoCmd r110 = (GetSysInfoCmd) r15;
        r110.setStatus(r12.getStatus());
        r110.setResponse(r19);
        return r110;
    L59:
        GetSysInfoCmd r111 = new GetSysInfoCmd(new GetSysInfoParam((byte) -1, 255));
        r111.setOpCodeSn(r12.getOpCodeSn());
        r111.setStatus(r12.getStatus());
        r111.setResponse(r19);
        return r111;
    }
}
