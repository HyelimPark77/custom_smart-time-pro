package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.file_op.CancelLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferGetNameCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferOpCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.parameter.LargeFileTransferOpParam;
import com.jieli.jl_rcsp.model.parameter.StartLargeFileTransferParam;
import com.jieli.jl_rcsp.model.response.StartLargeFileTransferResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class LargeFileTransferCmdHandler implements ICmdHandler {
    public LargeFileTransferCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r9, BasePacket r10) {
        if (r10 != null) goto L5;
        return null;
    L5:
        int r1 = r10.getOpCode();
        byte[] r2 = r10.getParamData();
        int r6 = 0;
        byte r7 = 0;
        r7 = 0;
        int r8 = 0;
        byte r11 = 0;
        byte r12 = 0;
        r12 = 0;
        if (r10.getType() == 1) goto L8;
        CommandBase r13 = CommandHelper.getInstance().getCommand(r9, r1, r10.getOpCodeSn());
        switch(r1) {
            case 27: goto L83;
            case 28: goto L78;
            case 29: goto L72;
            case 30: goto L66;
            case 31: goto L52;
            case 32: goto L60;
            case 33: goto L54;
            default: goto L52;
        };
    L52:
        return null;
    L83:
        StartLargeFileTransferResponse r0 = new StartLargeFileTransferResponse();
        r0.setRawData(r2);
        if (r2.length <= 1) goto L87;
        r0.setTransferMtu(CHexConver.bytesToShort(r2[0], r2[1]));
    L87:
        if ((r13 instanceof StartLargeFileTransferCmd) == false) goto L89;
        StartLargeFileTransferCmd r14 = (StartLargeFileTransferCmd) r13;
    L90:
        r14.setOpCodeSn(r10.getOpCodeSn());
        r14.setStatus(r10.getStatus());
        r14.setResponse(r0);
        return r14;
    L89:
        r14 = new StartLargeFileTransferCmd(new StartLargeFileTransferParam(new byte[0], 0, 0));
        goto L90
    L54:
        if ((r13 instanceof NotifyPrepareEnvCmd) == false) goto L56;
        NotifyPrepareEnvCmd r15 = (NotifyPrepareEnvCmd) r13;
    L57:
        CommonResponse r3 = new CommonResponse();
        r3.setRawData(r2);
        r15.setOpCodeSn(r10.getOpCodeSn());
        r15.setStatus(r10.getStatus());
        r15.setResponse(r3);
        return r15;
    L56:
        r15 = new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.Param((byte) 0));
        goto L57
    L60:
        if ((r13 instanceof LargeFileTransferGetNameCmd) == false) goto L62;
        LargeFileTransferGetNameCmd r16 = (LargeFileTransferGetNameCmd) r13;
    L63:
        CommonResponse r4 = new CommonResponse();
        r4.setRawData(r2);
        r16.setStatus(r10.getStatus());
        r16.setOpCodeSn(r10.getOpCodeSn());
        r16.setResponse(r4);
        return r16;
    L62:
        r16 = new LargeFileTransferGetNameCmd(new LargeFileTransferGetNameCmd.Param("", 0));
        goto L63
    L66:
        if ((r13 instanceof CancelLargeFileTransferCmd) == false) goto L68;
        CancelLargeFileTransferCmd r17 = (CancelLargeFileTransferCmd) r13;
    L69:
        CommonResponse r5 = new CommonResponse();
        r5.setRawData(r2);
        r17.setStatus(r10.getStatus());
        r17.setOpCodeSn(r10.getOpCodeSn());
        r17.setResponse(r5);
        return r17;
    L68:
        r17 = new CancelLargeFileTransferCmd();
        goto L69
    L72:
        if ((r13 instanceof LargeFileTransferOpCmd) == false) goto L74;
        LargeFileTransferOpCmd r18 = (LargeFileTransferOpCmd) r13;
    L75:
        r18.setOpCodeSn(r10.getOpCodeSn());
        r18.setStatus(r10.getStatus());
        return r18;
    L74:
        r18 = new LargeFileTransferOpCmd(new LargeFileTransferOpParam((byte) 0, 0, 0));
        goto L75
    L78:
        if ((r13 instanceof StopLargeFileTransferCmd) == false) goto L80;
        StopLargeFileTransferCmd r19 = (StopLargeFileTransferCmd) r13;
    L81:
        CommonResponse r20 = new CommonResponse();
        r20.setRawData(r2);
        r19.setOpCodeSn(r10.getOpCodeSn());
        r19.setStatus(r10.getStatus());
        r19.setResponse(r20);
        return r19;
    L80:
        r19 = new StopLargeFileTransferCmd(new StopLargeFileTransferCmd.Param(0));
        goto L81
    L8:
        switch(r1) {
            case 27: goto L40;
            case 28: goto L34;
            case 29: goto L20;
            case 30: goto L19;
            case 31: goto L52;
            case 32: goto L17;
            case 33: goto L10;
            default: goto L52;
        };
    L10:
        if (r2 == null) goto L15;
        if (r2.length <= 0) goto L15;
        r7 = r2[0];
    L15:
        return new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.Param(r7)).setOpCodeSn(r10.getOpCodeSn());
    L20:
        if (r2 != null) goto L22;
    L31:
        int r21 = 0;
        short r22 = 0;
    L33:
        return new LargeFileTransferOpCmd(new LargeFileTransferOpParam(r11, r22, r21)).setOpCodeSn(r10.getOpCodeSn());
    L22:
        if (r2.length <= 0) goto L31;
        byte r23 = r2[0];
        if (r2.length <= 2) goto L26;
        r22 = CHexConver.bytesToShort(r2[1], r2[2]);
    L28:
        if (r2.length <= 6) goto L30;
        r8 = CHexConver.bytesToInt(r2, 3, 4);
    L30:
        r21 = r8;
        r11 = r23;
        goto L33
    L26:
        r22 = 0;
        goto L28
    L34:
        if (r2 != null) goto L36;
    L38:
        StopLargeFileTransferCmd.Param r24 = new StopLargeFileTransferCmd.Param(r12);
        r24.setParamData(r2);
        return new StopLargeFileTransferCmd(r24).setOpCodeSn(r10.getOpCodeSn());
    L36:
        if (r2.length <= 0) goto L38;
        r12 = r2[0];
        goto L38
    L40:
        byte[] r25 = new byte[0];
        if (r2 != null) goto L43;
    L47:
        short r26 = 0;
    L49:
        return new StartLargeFileTransferCmd(new StartLargeFileTransferParam(r25, r6, r26)).setOpCodeSn(r10.getOpCodeSn());
    L43:
        if (r2.length <= 5) goto L47;
        r6 = CHexConver.bytesToInt(r2, 0, 4);
        r26 = CHexConver.bytesToShort(r2[4], r2[5]);
        int r27 = r2.length;
        if ((r27 - 6) <= 0) goto L49;
        r25 = Arrays.copyOfRange(r2, 6, r27);
        goto L49
    L17:
        return new LargeFileTransferGetNameCmd(new LargeFileTransferGetNameCmd.Param("", 0)).setOpCodeSn(r10.getOpCodeSn());
    L19:
        return new CancelLargeFileTransferCmd().setOpCodeSn(r10.getOpCodeSn());
    }
}
