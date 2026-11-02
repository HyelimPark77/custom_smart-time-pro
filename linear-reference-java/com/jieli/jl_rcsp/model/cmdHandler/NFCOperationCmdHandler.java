package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationNoResponseCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class NFCOperationCmdHandler implements ICmdHandler {
    public NFCOperationCmdHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r9, BasePacket r10) {
        byte[] r0 = r10.getParamData();
        NFCOperationCmd.Response r1 = null;
        String r2 = null;
        r2 = null;
        String r3 = null;
        r3 = null;
        byte[] r4 = null;
        r1 = null;
        if (r0 != null) goto L5;
    L100:
        return null;
    L5:
        if (r0.length == 0) goto L100;
        int r5 = 0;
        int r6 = 0;
        short r7 = 0;
        short r8 = 0;
        short r11 = 0;
        if (r10.getType() != 1) goto L86;
        int r12 = r10.getOpCodeSn();
        if (r0.length < 4) goto L12;
        int r13 = CHexConver.bytesToInt(r0, 0, 4);
        int r14 = 4;
    L14:
        if (r0.length <= r14) goto L16;
        int r15 = CHexConver.byteToInt(r0[r14]);
        r14 = r14 + 1;
    L17:
        switch(r15) {
            case 0: goto L85;
            case 1: goto L80;
            case 2: goto L66;
            case 3: goto L62;
            case 4: goto L60;
            case 5: goto L42;
            case 6: goto L29;
            case 7: goto L21;
            default: goto L18;
        };
    L18:
        JL_Log.e("NFCOperationCmdHandler", "parseDataToCmd", "未定义命令: " + r15);
        return null;
    L29:
        int r16 = r14 + 4;
        if (r0.length < r16) goto L33;
        r6 = CHexConver.bytesToInt(r0, r14, 4);
        r14 = r16;
    L33:
        if (r0.length <= r14) goto L40;
        r3 = new String(r0, r14, r0.length - r14);     // Catch: Exception -> L37
    L37:
        e = move-exception;
        e.printStackTrace();
    L40:
        return new NFCOperationCmd(new NFCOperationCmd.InsertFileParam(r13, r6, r3)).setOpCodeSn(r12);
    L66:
        int r17 = r14 + 2;
        if (r0.length < r17) goto L69;
        short r18 = CHexConver.bytesToShort(r0[r14], r0[r14 + 1]);
        r14 = r17;
    L70:
        int r19 = r14 + 4;
        if (r0.length < r19) goto L73;
        int r20 = CHexConver.bytesToInt(r0, r14, 4);
        r14 = r19;
    L75:
        if (r0.length <= r14) goto L78;
        int r21 = r0.length - r14;
        byte[] r22 = new byte[r21];
        System.arraycopy(r0, r14, r22, 0, r21);
        r4 = r22;
    L78:
        return new NFCOperationCmd(new NFCOperationCmd.ModifyMsgParam(r13, r18, r20, r4)).setOpCodeSn(r12);
    L73:
        r20 = 0;
        goto L75
    L69:
        r18 = 0;
        goto L70
    L21:
        if (r0.length <= r14) goto L28;
        r2 = new String(r0, r14, r0.length - r14);     // Catch: Exception -> L25
    L25:
        e = move-exception;
        e.printStackTrace();
    L28:
        return new NFCOperationCmd(new NFCOperationCmd.InsertFileEndParam(r13, r2)).setOpCodeSn(r12);
    L42:
        if (r0.length <= r14) goto L44;
        int r23 = CHexConver.byteToInt(r0[r14]);
        r14 = r14 + 1;
    L45:
        if (r23 == 1) goto L55;
        if (r23 == 2) goto L50;
        return new NFCOperationCmd(new NFCOperationCmd.GetDefaultNfcParam(r13)).setOpCodeSn(r12);
    L50:
        if (r0.length < (r14 + 2)) goto L53;
        r7 = CHexConver.bytesToShort(r0[r14], r0[r14 + 1]);
    L53:
        return new NFCOperationNoResponseCmd(new NFCOperationNoResponseCmd.NotifyDefaultNfcParam(r13, r7)).setOpCodeSn(r12);
    L55:
        if (r0.length < (r14 + 2)) goto L58;
        r8 = CHexConver.bytesToShort(r0[r14], r0[r14 + 1]);
    L58:
        return new NFCOperationCmd(new NFCOperationCmd.SetDefaultNfcParam(r13, r8)).setOpCodeSn(r12);
    L44:
        r23 = 0;
        goto L45
    L60:
        return new NFCOperationCmd(new NFCOperationCmd.NotifyNfcParam(r13)).setOpCodeSn(r12);
    L62:
        if (r0.length < (r14 + 2)) goto L65;
        r11 = CHexConver.bytesToShort(r0[r14], r0[r14 + 1]);
    L65:
        return new NFCOperationCmd(new NFCOperationCmd.DeleteMsgParam(r13, r11)).setOpCodeSn(r12);
    L80:
        if (r0.length <= r14) goto L83;
        r5 = CHexConver.byteToInt(r0[r14]);
    L83:
        return new NFCOperationNoResponseCmd(new NFCOperationNoResponseCmd.StopSyncParam(r13, r5)).setOpCodeSn(r12);
    L85:
        return new NFCOperationCmd(new NFCOperationCmd.StartSyncParam(r13)).setOpCodeSn(r12);
    L16:
        r15 = 0;
        goto L17
    L12:
        r13 = 0;
        r14 = 0;
        goto L14
    L86:
        CommandBase r24 = CommandHelper.getInstance().getCommand(r9, r10.getOpCode(), r10.getOpCodeSn());
        if (r24 == null) goto L95;
        NFCOperationCmd r25 = (NFCOperationCmd) r24;
        if (((NFCOperationCmd.Param) r25.getParam()).getOp() != 5) goto L96;
        int r26 = CHexConver.byteToInt(r0[0]);
        if (r0.length < 3) goto L93;
        short r27 = CHexConver.bytesToShort(r0[1], r0[2]);
    L94:
        r1 = new NFCOperationCmd.GetDefaultNfcResponse(r26, r27);
        goto L96
    L93:
        r27 = 0;
    L96:
        if (r1 != null) goto L98;
        r1 = new NFCOperationCmd.Response(CHexConver.byteToInt(r0[0]));
        r1.setRawData(r0);
    L98:
        r25.setOpCodeSn(r10.getOpCodeSn());
        r25.setStatus(r10.getStatus());
        r25.setResponse(r1);
        return r25;
    L95:
        r25 = new NFCOperationCmd(new NFCOperationCmd.Param(0, 0));
        goto L96
    }
}
