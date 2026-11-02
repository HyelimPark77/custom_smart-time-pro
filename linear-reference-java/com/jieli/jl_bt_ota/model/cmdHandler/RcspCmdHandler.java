package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommandWithParam;
import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.base.CommandWithResponse;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class RcspCmdHandler implements ICmdHandler {
    private static final String TAG = "RcspCmdHandler";

    static {
    }

    public RcspCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r7, CommandBase r8) {
        int r1 = 0;
        if (r7.getType() != 1) goto L5;
        boolean r0 = true;
    L7:
        if (r7.getHasResponse() != 1) goto L9;
        boolean r3 = true;
    L11:
        if (r7.getParamData() == null) goto L16;
        if (r7.getParamData().length <= 0) goto L16;
        r1 = 1;
    L16:
        if (r0 == false) goto L21;
        if (r3 == false) goto L25;
        if (r1 == 0) goto L20;
        r1 = 3;
        goto L25
    L20:
        r1 = 2;
    L25:
        if (r1 == 1) goto L44;
        if (r1 == 2) goto L35;
        if (r1 != 3) goto L29;
        CommandWithResponse r9 = new CommandWithResponse(r7.getOpCode(), CommandWithResponse.class.getSimpleName());
        if (r0 == true) goto L33;
        CommonResponse r2 = new CommonResponse();
        r2.setRawData(r7.getParamData());
        r2.setXmOpCode(r7.getXmOpCode());
        r9.setResponse(r2);
    L33:
        r9.setOpCodeSn(r7.getOpCodeSn());
        r9.setStatus(r7.getStatus());
        return r9;
    L29:
        return new CommandBase(r7.getOpCode(), CommandBase.class.getSimpleName()).setOpCodeSn(r7.getOpCodeSn()).setStatus(r7.getStatus());
    L35:
        BaseParameter r4 = new BaseParameter();
        r4.setXmOpCode(r7.getXmOpCode());
        if (r0 == false) goto L39;
        r4.setParamData(r7.getParamData());
        CommandWithParamAndResponse r10 = new CommandWithParamAndResponse(r7.getOpCode(), CommandWithParamAndResponse.class.getSimpleName(), r4);
    L42:
        r10.setOpCodeSn(r7.getOpCodeSn());
        r10.setStatus(r7.getStatus());
        return r10;
    L39:
        if (r8.getParam() == null) goto L41;
        r4.setParamData(r8.getParam().getParamData());
    L41:
        r10 = new CommandWithParamAndResponse(r7.getOpCode(), CommandWithParamAndResponse.class.getSimpleName(), r4);
        CommonResponse r5 = new CommonResponse();
        r5.setRawData(r7.getParamData());
        r5.setXmOpCode(r7.getXmOpCode());
        r10.setResponse(r5);
        goto L42
    L44:
        BaseParameter r11 = new BaseParameter();
        r11.setXmOpCode(r7.getXmOpCode());
        r11.setParamData(r7.getParamData());
        CommandWithParam r6 = new CommandWithParam(r7.getOpCode(), CommandWithParam.class.getSimpleName(), r11);
        r6.setOpCodeSn(r7.getOpCodeSn()).setStatus(r7.getStatus());
        return r6;
    L21:
        if (r8 != null) goto L24;
        byte[] r12 = ParseHelper.packSendBasePacket(r7);
        JL_Log.w(TAG, "parseDataToCmd", " unknown data ::::::: " + CHexConver.byte2HexStr(r12));
        return null;
    L24:
        r1 = r8.getType();
        goto L25
    L9:
        r3 = false;
        goto L11
    L5:
        r0 = false;
        goto L7
    }
}
