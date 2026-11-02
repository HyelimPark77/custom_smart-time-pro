package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.ai.AIOperateCmd;
import com.jieli.jl_rcsp.model.command.ai.AIOperateNoResponseCmd;
import com.jieli.jl_rcsp.model.parameter.AIOperateParam;
import com.jieli.jl_rcsp.model.response.AIOperateResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class AiOperateCmdHandler implements ICmdHandler {
    public AiOperateCmdHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r9, BasePacket r10) {
        AIOperateParam r0 = null;
        String r1 = null;
        r1 = null;
        r1 = null;
        if (r10 != null) goto L5;
        return null;
    L5:
        int r2 = r10.getOpCode();
        if (r2 != 50) goto L60;
        byte[] r3 = r10.getParamData();
        int r5 = 0;
        if (r10.getType() != 1) goto L41;
        if (r2 != 50) goto L60;
        if (r3 != null) goto L13;
    L34:
        int r11 = -1;
    L33:
        Integer r4 = null;
        Integer r6 = null;
        String r7 = null;
    L23:
        Integer r8 = r7;
    L35:
        AIOperateParam r12 = new AIOperateParam().setOp(r11).setFlag(r5).setAiDialStyle(r1).setAiDialFunUIState(r6).setScaleZoomHeight(r8).setScaleZoomWidth(r4).setThumbPath(r7);
        if (r10.getHasResponse() != 1) goto L40;
        return new AIOperateCmd(r12).setOpCodeSn(r10.getOpCodeSn());
    L40:
        return new AIOperateNoResponseCmd(r12).setOpCodeSn(r10.getOpCodeSn());
    L13:
        if (r3.length <= 0) goto L34;
        r11 = CHexConver.byteToInt(r3[0]);
        if (r3.length <= 1) goto L33;
        r5 = CHexConver.byteToInt(r3[1]);
        if (r11 != 0) goto L33;
        if (r3.length <= 2) goto L33;
        if (r5 != 0) goto L25;
        String r13 = new String(r3, 2, r3.length - 2);
        r4 = null;
        r6 = null;
        r7 = null;
        r1 = r13;
        goto L23
    L25:
        if (r5 == 1) goto L27;
        if (r5 != 4) goto L33;
        r4 = null;
        r6 = null;
        r7 = new String(r3, 2, r3.length - 2);
        r8 = 0;
        goto L35
    L27:
        if ((r3[2] & 128) != 128) goto L29;
        r4 = Integer.valueOf(CHexConver.bytesToInt(r3[3], r3[4]));
        Integer r14 = Integer.valueOf(CHexConver.bytesToInt(r3[5], r3[6]));
    L30:
        r6 = Integer.valueOf(r3[2] & 127);
        r7 = null;
        r8 = r14;
        goto L35
    L29:
        r4 = null;
        r14 = null;
        goto L30
    L41:
        CommandBase r15 = CommandHelper.getInstance().getCommand(r9, r2, r10.getOpCodeSn());
        if (r2 != 50) goto L60;
        byte[] r16 = new byte[0];
        if (r15 == null) goto L47;
        AIOperateCmd r17 = (AIOperateCmd) r15;
        r0 = (AIOperateParam) r17.getParam();
    L48:
        if (r3 != null) goto L50;
    L58:
        AIOperateResponse r18 = new AIOperateResponse(r5).setData(r16);
        r18.setRawData(r3);
        r17.setResponse(r18);
        r17.setStatus(r10.getStatus()).setOpCodeSn(r10.getOpCodeSn());
        return r17;
    L50:
        if (r3.length <= 0) goto L58;
        int r19 = CHexConver.byteToInt(r3[0]);
        if (r0 == null) goto L55;
        r0.getOp();
    L57:
        r5 = r19;
        goto L58
    L55:
        if (r3.length <= 1) goto L57;
        int r20 = r3.length - 1;
        r16 = new byte[r20];
        System.arraycopy(r3, 1, r16, 0, r20);
        goto L57
    L47:
        r17 = new AIOperateCmd(new AIOperateParam());
    L60:
        return null;
    }
}
