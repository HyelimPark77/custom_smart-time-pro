package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.tws.GetADVInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.NotifyAdvInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.RequestAdvOpCmd;
import com.jieli.jl_rcsp.model.command.tws.SetADVInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.SetDeviceNotifyAdvInfoCmd;
import com.jieli.jl_rcsp.model.parameter.GetADVInfoParam;
import com.jieli.jl_rcsp.model.parameter.NotifyAdvInfoParam;
import com.jieli.jl_rcsp.model.parameter.RequestAdvOpParam;
import com.jieli.jl_rcsp.model.parameter.SetADVInfoParam;
import com.jieli.jl_rcsp.model.parameter.SetDeviceNotifyAdvInfoParam;
import com.jieli.jl_rcsp.model.response.ADVInfoResponse;
import com.jieli.jl_rcsp.model.response.SetADVResponse;
import com.jieli.jl_rcsp.model.response.SetDeviceNotifyAdvInfoResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class TwsCmdHandler implements ICmdHandler {
    public TwsCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        int r1 = r8.getOpCode();
        if (r1 != 192) goto L8;
    L15:
        byte[] r2 = r8.getParamData();
        int r5 = 0;
        if (r8.getType() != 1) goto L41;
        switch(r1) {
            case 192: goto L40;
            case 193: goto L33;
            case 194: goto L31;
            case 195: goto L25;
            case 196: goto L19;
            default: goto L43;
        };
    L19:
        if (r2 == null) goto L24;
        if (r2.length <= 0) goto L24;
        r5 = CHexConver.byteToInt(r2[0]);
    L24:
        return new RequestAdvOpCmd(new RequestAdvOpParam(r5)).setOpCodeSn(r8.getOpCodeSn());
    L25:
        if (r2 == null) goto L30;
        if (r2.length <= 0) goto L30;
        r5 = CHexConver.byteToInt(r2[0]);
    L30:
        return new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(r5)).setOpCodeSn(r8.getOpCodeSn());
    L31:
        NotifyAdvInfoParam r9 = new NotifyAdvInfoParam();
        ParseHelper.parseNotifyADVInfo(r9, r8);
        return new NotifyAdvInfoCmd(r9).setOpCodeSn(r8.getOpCodeSn());
    L33:
        if (r2 == null) goto L38;
        if (r2.length < 4) goto L38;
        byte[] r10 = new byte[4];
        System.arraycopy(r2, 0, r10, 0, 4);
        r5 = CHexConver.bytesToInt(r10);
    L38:
        return new GetADVInfoCmd(new GetADVInfoParam(r5)).setOpCodeSn(r8.getOpCodeSn());
    L43:
        return null;
    L40:
        return new SetADVInfoCmd(new SetADVInfoParam(r2)).setOpCodeSn(r8.getOpCodeSn());
    L41:
        CommandBase r3 = CommandHelper.getInstance().getCommand(r7, r1, r8.getOpCodeSn());
        int r4 = -1;
        switch(r1) {
            case 192: goto L66;
            case 193: goto L60;
            case 194: goto L43;
            case 195: goto L50;
            case 196: goto L44;
            default: goto L43;
        };
    L44:
        CommonResponse r11 = new CommonResponse();
        r11.setRawData(r2);
        if (r3 == null) goto L48;
        RequestAdvOpCmd r6 = (RequestAdvOpCmd) r3;
        r6.setStatus(r8.getStatus());
        r6.setResponse(r11);
        return r6;
    L48:
        RequestAdvOpCmd r0 = new RequestAdvOpCmd(new RequestAdvOpParam(0));
        r0.setOpCodeSn(r8.getOpCodeSn());
        r0.setStatus(r8.getStatus());
        r0.setResponse(r11);
        return r0;
    L50:
        if (r2 != null) goto L52;
    L54:
        SetDeviceNotifyAdvInfoResponse r12 = new SetDeviceNotifyAdvInfoResponse(r4);
        r12.setRawData(r2);
        if (r3 == null) goto L58;
        SetDeviceNotifyAdvInfoCmd r13 = (SetDeviceNotifyAdvInfoCmd) r3;
        r13.setStatus(r8.getStatus());
        r13.setResponse(r12);
        return r13;
    L58:
        SetDeviceNotifyAdvInfoCmd r14 = new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(0));
        r14.setOpCodeSn(r8.getOpCodeSn());
        r14.setStatus(r8.getStatus());
        r14.setResponse(r12);
        return r14;
    L52:
        if (r2.length <= 0) goto L54;
        r4 = CHexConver.byteToInt(r2[0]);
        goto L54
    L60:
        ADVInfoResponse r15 = new ADVInfoResponse();
        r15.setRawData(r2);
        ParseHelper.parseADVInfo(r7, r15, r8);
        if (r3 == null) goto L64;
        GetADVInfoCmd r16 = (GetADVInfoCmd) r3;
        r16.setStatus(r8.getStatus());
        r16.setResponse(r15);
        return r16;
    L64:
        GetADVInfoCmd r17 = new GetADVInfoCmd(new GetADVInfoParam(0));
        r17.setOpCodeSn(r8.getOpCodeSn());
        r17.setStatus(r8.getStatus());
        r17.setResponse(r15);
        return r17;
    L66:
        if (r2 != null) goto L68;
    L70:
        SetADVResponse r18 = new SetADVResponse(r4);
        r18.setRawData(r2);
        if (r3 == null) goto L74;
        SetADVInfoCmd r19 = (SetADVInfoCmd) r3;
        r19.setStatus(r8.getStatus());
        r19.setResponse(r18);
        return r19;
    L74:
        SetADVInfoCmd r20 = new SetADVInfoCmd(new SetADVInfoParam(new byte[0]));
        r20.setOpCodeSn(r8.getOpCodeSn());
        r20.setStatus(r8.getStatus());
        r20.setResponse(r18);
        return r20;
    L68:
        if (r2.length <= 0) goto L70;
        r4 = CHexConver.byteToInt(r2[0]);
        goto L70
    L8:
        if (r1 == 193) goto L15;
        if (r1 == 194) goto L15;
        if (r1 == 195) goto L15;
        if (r1 != 196) goto L43;
        goto L15
    }
}
