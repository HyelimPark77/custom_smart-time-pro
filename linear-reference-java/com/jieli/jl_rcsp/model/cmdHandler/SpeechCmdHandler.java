package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.speech.CancelSpeechCmd;
import com.jieli.jl_rcsp.model.command.speech.StartSpeechCmd;
import com.jieli.jl_rcsp.model.command.speech.StopSpeechCmd;
import com.jieli.jl_rcsp.model.parameter.StartSpeechParam;
import com.jieli.jl_rcsp.model.parameter.StopSpeechParam;
import com.jieli.jl_rcsp.model.response.StartSpeechResponse;
import com.jieli.jl_rcsp.model.response.StopSpeechResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;

/* JADX INFO: loaded from: classes17.dex */
public class SpeechCmdHandler implements ICmdHandler {
    public SpeechCmdHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r14, BasePacket r15) {
        if (r15 != null) goto L5;
        return null;
    L5:
        int r1 = r15.getOpCode();
        if (r1 == 210) goto L9;
        if (r1 == 4) goto L9;
        if (r1 == 5) goto L9;
    L52:
        return null;
    L9:
        byte[] r5 = r15.getParamData();
        byte r7 = 16;
        byte r9 = 0;
        boolean r10 = false;
        boolean r11 = true;
        byte r12 = 1;
        byte r13 = 1;
        if (r15.getType() != 1) goto L48;
        if (r1 == 4) goto L38;
        if (r1 == 5) goto L17;
        if (r1 != 210) goto L52;
        return new CancelSpeechCmd().setOpCodeSn(r15.getOpCodeSn());
    L17:
        if (r5 != null) goto L19;
    L35:
        boolean r16 = false;
        boolean r2 = false;
        boolean r3 = false;
    L37:
        return new StopSpeechCmd(new StopSpeechParam().setReason(r9).setSyncIatText(r2).setSyncNlpText(r3).setPlayTTS(r16)).setOpCodeSn(r15.getOpCodeSn());
    L19:
        if (r5.length <= 0) goto L35;
        byte r17 = r5[0];
        if (r5.length <= 1) goto L34;
        byte r0 = r5[1];
        if ((r0 & 1) != 1) goto L25;
        r2 = true;
    L27:
        if ((r0 & 2) != 2) goto L29;
        r3 = true;
    L31:
        if ((r0 & 4) != 4) goto L33;
        r10 = true;
    L33:
        boolean r18 = r10;
        r9 = r17;
        r16 = r18;
        goto L37
    L29:
        r3 = false;
        goto L31
    L25:
        r2 = false;
        goto L27
    L34:
        r2 = false;
        r3 = false;
        r9 = r17;
        r16 = false;
        goto L37
    L38:
        if (r5 != null) goto L40;
    L45:
        byte r19 = 1;
    L47:
        return new StartSpeechCmd(new StartSpeechParam(r13, r7, r19)).setOpCodeSn(r15.getOpCodeSn());
    L40:
        if (r5.length < 2) goto L45;
        byte r110 = r5[0];
        r7 = r5[1];
        if (r5.length < 3) goto L44;
        r12 = r5[2];
    L44:
        byte r111 = r12;
        r13 = r110;
        r19 = r111;
        goto L47
    L48:
        CommandBase r112 = CommandHelper.getInstance().getCommand(r14, r1, r15.getOpCodeSn());
        if (r1 == 4) goto L82;
        if (r1 == 5) goto L59;
        if (r1 != 210) goto L52;
        CommonResponse r4 = new CommonResponse();
        r4.setRawData(r5);
        if (r112 == null) goto L57;
        CancelSpeechCmd r113 = (CancelSpeechCmd) r112;
        r113.setStatus(r15.getStatus());
        r113.setResponse(r4);
        return r113;
    L57:
        CancelSpeechCmd r114 = new CancelSpeechCmd();
        r114.setOpCodeSn(r15.getOpCodeSn());
        r114.setStatus(r15.getStatus());
        r114.setResponse(r4);
        return r114;
    L59:
        StopSpeechResponse r6 = new StopSpeechResponse();
        if (r5 != null) goto L62;
    L75:
        boolean r8 = false;
        boolean r20 = false;
        r11 = false;
    L76:
        r6.setRawData(r5);
        r6.setSyncIatText(r8);
        r6.setSyncNlpText(r20);
        r6.setPlayTTS(r11);
        if (r112 == null) goto L80;
        StopSpeechCmd r115 = (StopSpeechCmd) r112;
        r115.setStatus(r15.getStatus());
        r115.setResponse(r6);
        return r115;
    L80:
        StopSpeechCmd r116 = new StopSpeechCmd(new StopSpeechParam().setReason((byte) 0));
        r116.setOpCodeSn(r15.getOpCodeSn());
        r116.setStatus(r15.getStatus());
        r116.setResponse(r6);
        return r116;
    L62:
        if (r5.length < 1) goto L75;
        byte r21 = r5[0];
        if ((r21 & 1) != 1) goto L66;
        r8 = true;
    L68:
        if ((r21 & 2) != 2) goto L70;
        r20 = true;
    L72:
        if ((r21 & 4) == 4) goto L76;
        r11 = false;
        goto L76
    L70:
        r20 = false;
        goto L72
    L66:
        r8 = false;
        goto L68
    L82:
        StartSpeechResponse r22 = new StartSpeechResponse();
        r22.setRawData(r5);
        if (r112 == null) goto L86;
        StartSpeechCmd r117 = (StartSpeechCmd) r112;
        r117.setStatus(r15.getStatus());
        r117.setResponse(r22);
        return r117;
    L86:
        StartSpeechCmd r118 = new StartSpeechCmd(new StartSpeechParam((byte) 1, (byte) 16, (byte) 1));
        r118.setOpCodeSn(r15.getOpCodeSn());
        r118.setStatus(r15.getStatus());
        r118.setResponse(r22);
        return r118;
    }
}
