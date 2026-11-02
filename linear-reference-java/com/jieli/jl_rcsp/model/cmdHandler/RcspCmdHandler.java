package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommandWithResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class RcspCmdHandler implements ICmdHandler {
    private static final String TAG = "RcspCmdHandler";

    static {
    }

    public RcspCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r9, BasePacket r10) {
        int r1 = 0;
        if (r10.getType() != 1) goto L5;
        boolean r0 = true;
    L7:
        if (r10.getHasResponse() != 1) goto L9;
        boolean r3 = true;
    L11:
        if (r10.getParamData() != null) goto L13;
    L15:
        CommandBase r6 = null;
        if (r0 == false) goto L21;
        if (r3 == false) goto L26;
        if (r1 == 0) goto L20;
        r1 = 3;
        goto L26
    L20:
        r1 = 2;
    L26:
        if (r1 == 1) goto L45;
        if (r1 == 2) goto L36;
        if (r1 != 3) goto L30;
        CommandWithResponse r11 = new CommandWithResponse(r10.getOpCode(), CommandWithResponse.class.getSimpleName());
        if (r0 == true) goto L34;
        CommonResponse r2 = new CommonResponse();
        r2.setRawData(r10.getParamData());
        r2.setXmOpCode(r10.getXmOpCode());
        r11.setResponse(r2);
    L34:
        r11.setOpCodeSn(r10.getOpCodeSn());
        r11.setStatus(r10.getStatus());
        return r11;
    L30:
        return new CommandBase(r10.getOpCode(), CommandBase.class.getSimpleName()).setOpCodeSn(r10.getOpCodeSn()).setStatus(r10.getStatus());
    L36:
        BaseParameter r12 = new BaseParameter();
        r12.setXmOpCode(r10.getXmOpCode());
        if (r0 == false) goto L40;
        r12.setParamData(r10.getParamData());
        CommandWithParamAndResponse r4 = new CommandWithParamAndResponse(r10.getOpCode(), CommandWithParamAndResponse.class.getSimpleName(), r12);
    L43:
        r4.setOpCodeSn(r10.getOpCodeSn());
        r4.setStatus(r10.getStatus());
        return r4;
    L40:
        if (r6.getParam() == null) goto L42;
        r12.setParamData(r6.getParam().getParamData());
    L42:
        r4 = new CommandWithParamAndResponse(r10.getOpCode(), CommandWithParamAndResponse.class.getSimpleName(), r12);
        CommonResponse r13 = new CommonResponse();
        r13.setRawData(r10.getParamData());
        r13.setXmOpCode(r10.getXmOpCode());
        r4.setResponse(r13);
        goto L43
    L45:
        BaseParameter r14 = new BaseParameter();
        r14.setXmOpCode(r10.getXmOpCode());
        r14.setParamData(r10.getParamData());
        CommandWithParam r5 = new CommandWithParam(r10.getOpCode(), CommandWithParam.class.getSimpleName(), r14);
        r5.setOpCodeSn(r10.getOpCodeSn()).setStatus(r10.getStatus());
        return r5;
    L21:
        CommandBase r15 = CommandHelper.getInstance().getCommand(r9, r10.getOpCode(), r10.getOpCodeSn());
        if (r15 != null) goto L25;
        byte[] r16 = ParseHelper.packSendBasePacket(r10);
        JL_Log.w(TAG, "parseDataToCmd", "unknown data : " + CHexConver.byte2HexStr(r16));
        return null;
    L25:
        r1 = r15.getType();
        r6 = r15;
        goto L26
    L13:
        if (r10.getParamData().length <= 0) goto L15;
        r1 = 1;
        goto L15
    L9:
        r3 = false;
        goto L11
    L5:
        r0 = false;
        goto L7
    }
}
