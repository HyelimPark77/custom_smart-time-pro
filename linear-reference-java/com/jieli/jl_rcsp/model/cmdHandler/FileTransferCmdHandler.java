package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.file_op.NotifyFileTransferOpCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopFileTransferCmd;
import com.jieli.jl_rcsp.model.parameter.NotifyFileTransferParam;
import com.jieli.jl_rcsp.model.parameter.StartFileTransferParam;
import com.jieli.jl_rcsp.model.parameter.StopFileTransferParam;
import com.jieli.jl_rcsp.model.response.StartFileTranferResponse;
import com.jieli.jl_rcsp.model.response.StopFileTransferResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class FileTransferCmdHandler implements ICmdHandler {
    public FileTransferCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r9, BasePacket r10) {
        if (r10 != null) goto L5;
        return null;
    L5:
        int r1 = r10.getOpCode();
        if (r1 != 22) goto L8;
    L11:
        byte[] r2 = r10.getParamData();
        boolean r4 = true;
        int r5 = 0;
        if (r10.getType() != 1) goto L38;
        switch(r1) {
            case 22: goto L27;
            case 23: goto L21;
            case 24: goto L15;
            default: goto L40;
        };
    L15:
        if (r2 == null) goto L20;
        if (r2.length <= 0) goto L20;
        r5 = CHexConver.byteToInt(r2[0]);
    L20:
        return new NotifyFileTransferOpCmd(new NotifyFileTransferParam(r5)).setOpCodeSn(r10.getOpCodeSn());
    L21:
        if (r2 == null) goto L26;
        if (r2.length <= 0) goto L26;
        r5 = CHexConver.byteToInt(r2[0]);
    L26:
        return new StopFileTransferCmd(new StopFileTransferParam(r5)).setOpCodeSn(r10.getOpCodeSn());
    L27:
        if (r2 != null) goto L29;
    L31:
        String r3 = "";
        byte r11 = 0;
        int r6 = 0;
    L32:
        StartFileTransferParam r0 = new StartFileTransferParam(r3, r6);
        if ((r11 & 1) == 1) goto L36;
        r4 = false;
    L36:
        r0.enableDataNeedResponse(r4);
        return new StartFileTransferCmd(r0).setOpCodeSn(r10.getOpCodeSn());
    L29:
        if (r2.length <= 5) goto L31;
        r11 = r2[0];
        r6 = CHexConver.bytesToInt(r2, 1, 4);
        r3 = new String(r2, 5, r2.length - 5, StandardCharsets.UTF_8);
    L40:
        return null;
    L38:
        CommandBase r12 = CommandHelper.getInstance().getCommand(r9, r1, r10.getOpCodeSn());
        switch(r1) {
            case 22: goto L58;
            case 23: goto L47;
            case 24: goto L41;
            default: goto L40;
        };
    L41:
        CommonResponse r7 = new CommonResponse();
        r7.setRawData(r2);
        if (r12 == null) goto L45;
        NotifyFileTransferOpCmd r13 = (NotifyFileTransferOpCmd) r12;
        r13.setStatus(r10.getStatus());
        r13.setResponse(r7);
        return r13;
    L45:
        NotifyFileTransferOpCmd r14 = new NotifyFileTransferOpCmd(new NotifyFileTransferParam(0));
        r14.setOpCodeSn(r10.getOpCodeSn());
        r14.setStatus(r10.getStatus());
        r14.setResponse(r7);
        return r14;
    L47:
        if (r2 != null) goto L49;
    L51:
        int r8 = 0;
    L52:
        StopFileTransferResponse r15 = new StopFileTransferResponse();
        r15.setRawData(r2);
        r15.setReason(r8);
        if (r12 == null) goto L56;
        StopFileTransferCmd r16 = (StopFileTransferCmd) r12;
        r16.setStatus(r10.getStatus());
        r16.setResponse(r15);
        return r16;
    L56:
        StopFileTransferCmd r17 = new StopFileTransferCmd(new StopFileTransferParam(0));
        r17.setOpCodeSn(r10.getOpCodeSn());
        r17.setStatus(r10.getStatus());
        r17.setResponse(r15);
        return r17;
    L49:
        if (r2.length <= 0) goto L51;
        r8 = CHexConver.byteToInt(r2[0]);
        goto L52
    L58:
        StartFileTranferResponse r18 = new StartFileTranferResponse();
        r18.setRawData(r2);
        if (r12 == null) goto L62;
        StartFileTransferCmd r19 = (StartFileTransferCmd) r12;
        r19.setStatus(r10.getStatus());
        r19.setResponse(r18);
        return r19;
    L62:
        StartFileTransferCmd r20 = new StartFileTransferCmd(new StartFileTransferParam("./", 0));
        r20.setOpCodeSn(r10.getOpCodeSn());
        r20.setStatus(r10.getStatus());
        r20.setResponse(r18);
        return r20;
    L8:
        if (r1 == 23) goto L11;
        if (r1 != 24) goto L40;
        goto L11
    }
}
