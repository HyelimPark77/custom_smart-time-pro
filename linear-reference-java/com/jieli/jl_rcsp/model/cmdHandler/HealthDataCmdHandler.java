package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.command.watch.ReceiveHealthDataCmd;
import com.jieli.jl_rcsp.model.command.watch.RequestHealthDataCmd;
import com.jieli.jl_rcsp.model.command.watch.SensorLogCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class HealthDataCmdHandler implements ICmdHandler {
    private final String tag;

    public HealthDataCmdHandler() {
        this.tag = getClass().getSimpleName();
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r13, BasePacket r14) {
        if (r14 != null) goto L5;
        return null;
    L5:
        int r1 = r14.getOpCode();
        if (r1 == 160) goto L11;
        if (r1 == 161) goto L11;
        if (r1 == 162) goto L11;
        if (r1 == 163) goto L11;
        return null;
    L11:
        byte[] r6 = r14.getParamData();
        int r10 = 2;
        if (r14.getType() == 1) goto L53;
        CommandBase r15 = CommandHelper.getInstance().getCommand(r13, r14.getOpCode(), r14.getOpCodeSn());
        if (r1 == 160) goto L41;
        if (r1 != 161) goto L51;
        if (r15 == null) goto L38;
        PushInfoDataToDeviceCmd r16 = (PushInfoDataToDeviceCmd) r15;     // Catch: ParseDataException -> L36
    L39:
        r16.setResponse(new PushInfoDataToDeviceCmd.Response(r6));     // Catch: ParseDataException -> L36
        r16.setStatus(r14.getStatus());     // Catch: ParseDataException -> L36
        r16.setOpCodeSn(r14.getOpCodeSn());     // Catch: ParseDataException -> L36
        return r16;
    L38:
        r16 = new PushInfoDataToDeviceCmd(new PushInfoDataToDeviceCmd.Param(null));     // Catch: ParseDataException -> L36
    L51:
        return null;
    L41:
        if (r15 == null) goto L44;
        RequestHealthDataCmd r17 = (RequestHealthDataCmd) r15;     // Catch: ParseDataException -> L36
    L48:
        r17.setResponse(new RequestHealthDataCmd.Response(r6));     // Catch: ParseDataException -> L36
        r17.setStatus(r14.getStatus());     // Catch: ParseDataException -> L36
        r17.setOpCodeSn(r14.getOpCodeSn());     // Catch: ParseDataException -> L36
        return r17;
    L44:
        if (r14.getHasResponse() == 1) goto L47;
        r10 = 1;
    L47:
        r17 = new RequestHealthDataCmd(r10, new RequestHealthDataCmd.Param(null));     // Catch: ParseDataException -> L36
    L36:
        e = move-exception;
        JL_Log.w(this.tag, "parseDataToCmd", "response. op code : " + r14.getOpCode() + ", " + e);
        goto L51
    L53:
        if (r1 == 160) goto L24;
        if (r1 == 162) goto L22;
        if (r1 != 163) goto L51;
        return new SensorLogCmd(new SensorLogCmd.Param(r6)).setOpCodeSn(r14.getOpCodeSn());
    L22:
        return new ReceiveHealthDataCmd(new ReceiveHealthDataCmd.Param(r6)).setOpCodeSn(r14.getOpCodeSn());
    L24:
        if (r14.getHasResponse() == 1) goto L28;
        r10 = 1;
    L28:
        return new RequestHealthDataCmd(r10, new RequestHealthDataCmd.Param(r6)).setOpCodeSn(r14.getOpCodeSn());
    L19:
        e = move-exception;
        JL_Log.w(this.tag, "parseDataToCmd", "command. op code : " + r14.getOpCode() + ", " + e);
        goto L51
    }
}
