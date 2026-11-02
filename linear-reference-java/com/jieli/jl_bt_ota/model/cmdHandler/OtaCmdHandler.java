package com.jieli.jl_bt_ota.model.cmdHandler;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.EnterUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.ExitUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.FirmwareUpdateBlockCmd;
import com.jieli.jl_bt_ota.model.command.FirmwareUpdateStatusCmd;
import com.jieli.jl_bt_ota.model.command.GetUpdateFileOffsetCmd;
import com.jieli.jl_bt_ota.model.command.InquireUpdateCmd;
import com.jieli.jl_bt_ota.model.command.NotifyUpdateContentSizeCmd;
import com.jieli.jl_bt_ota.model.command.RebootDeviceCmd;
import com.jieli.jl_bt_ota.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_bt_ota.model.parameter.InquireUpdateParam;
import com.jieli.jl_bt_ota.model.parameter.NotifyUpdateContentSizeParam;
import com.jieli.jl_bt_ota.model.parameter.RebootDeviceParam;
import com.jieli.jl_bt_ota.model.response.EnterUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.ExitUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.FirmwareUpdateBlockResponse;
import com.jieli.jl_bt_ota.model.response.FirmwareUpdateStatusResponse;
import com.jieli.jl_bt_ota.model.response.InquireUpdateResponse;
import com.jieli.jl_bt_ota.model.response.RebootDeviceResponse;
import com.jieli.jl_bt_ota.model.response.UpdateFileOffsetResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class OtaCmdHandler implements ICmdHandler {
    public OtaCmdHandler() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.ICmdHandler
    public CommandBase parseDataToCmd(BasePacket r11, CommandBase r12) {
        if (r11 != null) goto L5;
        return null;
    L5:
        int r1 = r11.getOpCode();
        if (r1 != 225) goto L8;
    L21:
        byte[] r2 = r11.getParamData();
        int r8 = 0;
        if (r11.getType() != 1) goto L63;
        switch(r1) {
            case 225: goto L62;
            case 226: goto L53;
            case 227: goto L52;
            case 228: goto L50;
            case 229: goto L42;
            case 230: goto L41;
            case 231: goto L34;
            case 232: goto L25;
            default: goto L65;
        };
    L25:
        if (r2 != null) goto L27;
    L31:
        int r0 = 0;
    L33:
        return new NotifyUpdateContentSizeCmd(new NotifyUpdateContentSizeParam(r0).setCurrentProgress(r8)).setOpCodeSn(r11.getOpCodeSn());
    L27:
        if (r2.length < 4) goto L31;
        byte[] r13 = new byte[4];
        System.arraycopy(r2, 0, r13, 0, 4);
        r0 = CHexConver.bytesToInt(r13);
        if (r2.length < 8) goto L33;
        System.arraycopy(r2, 4, r13, 0, 4);
        r8 = CHexConver.bytesToInt(r13);
        goto L33
    L34:
        if (r2 == null) goto L39;
        if (r2.length <= 0) goto L39;
        r8 = CHexConver.byteToInt(r2[0]);
    L39:
        return new RebootDeviceCmd(new RebootDeviceParam(r8)).setOpCodeSn(r11.getOpCodeSn());
    L42:
        if (r2 != null) goto L44;
    L46:
        int r14 = 0;
    L48:
        return new FirmwareUpdateBlockCmd(new FirmwareUpdateBlockParam(r8, r14)).setOpCodeSn(r11.getOpCodeSn());
    L44:
        if (r2.length < 6) goto L46;
        byte[] r15 = new byte[4];
        System.arraycopy(r2, 0, r15, 0, 4);
        r8 = CHexConver.bytesToInt(r15);
        r14 = CHexConver.bytesToInt(r2[4], r2[5]);
        goto L48
    L53:
        byte[] r16 = new byte[0];
        if (r2 != null) goto L56;
    L58:
        r2 = r16;
    L60:
        return new InquireUpdateCmd(new InquireUpdateParam(r2)).setOpCodeSn(r11.getOpCodeSn());
    L56:
        if (r2.length <= 0) goto L58;
    L65:
        return null;
    L41:
        return new FirmwareUpdateStatusCmd().setOpCodeSn(r11.getOpCodeSn());
    L50:
        return new ExitUpdateModeCmd().setOpCodeSn(r11.getOpCodeSn());
    L52:
        return new EnterUpdateModeCmd().setOpCodeSn(r11.getOpCodeSn());
    L62:
        return new GetUpdateFileOffsetCmd().setOpCodeSn(r11.getOpCodeSn());
    L63:
        int r3 = -1;
        switch(r1) {
            case 225: goto L133;
            case 226: goto L123;
            case 227: goto L113;
            case 228: goto L103;
            case 229: goto L92;
            case 230: goto L82;
            case 231: goto L72;
            case 232: goto L66;
            default: goto L65;
        };
    L66:
        CommonResponse r4 = new CommonResponse();
        r4.setRawData(r2);
        if ((r12 instanceof NotifyUpdateContentSizeCmd) == false) goto L69;
        NotifyUpdateContentSizeCmd r17 = (NotifyUpdateContentSizeCmd) r12;
    L70:
        r17.setOpCodeSn(r11.getOpCodeSn());
        r17.setStatus(r11.getStatus());
        r17.setResponse(r4);
        return r17;
    L69:
        r17 = new NotifyUpdateContentSizeCmd(new NotifyUpdateContentSizeParam(0));
        goto L70
    L72:
        if (r2 != null) goto L74;
    L76:
        RebootDeviceResponse r5 = new RebootDeviceResponse(r3);
        r5.setRawData(r2);
        if ((r12 instanceof RebootDeviceCmd) == false) goto L79;
        RebootDeviceCmd r18 = (RebootDeviceCmd) r12;
    L80:
        r18.setOpCodeSn(r11.getOpCodeSn());
        r18.setStatus(r11.getStatus());
        r18.setResponse(r5);
        return r18;
    L79:
        r18 = new RebootDeviceCmd(new RebootDeviceParam(0));
        goto L80
    L74:
        if (r2.length <= 0) goto L76;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L76
    L82:
        if (r2 != null) goto L84;
    L86:
        FirmwareUpdateStatusResponse r6 = new FirmwareUpdateStatusResponse(r3);
        r6.setRawData(r2);
        if ((r12 instanceof FirmwareUpdateStatusCmd) == false) goto L89;
        FirmwareUpdateStatusCmd r19 = (FirmwareUpdateStatusCmd) r12;
    L90:
        r19.setOpCodeSn(r11.getOpCodeSn());
        r19.setStatus(r11.getStatus());
        r19.setResponse(r6);
        return r19;
    L89:
        r19 = new FirmwareUpdateStatusCmd();
        goto L90
    L84:
        if (r2.length <= 0) goto L86;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L86
    L92:
        byte[] r7 = new byte[0];
        if (r2 != null) goto L95;
    L97:
        FirmwareUpdateBlockResponse r9 = new FirmwareUpdateBlockResponse();
        r9.setRawData(r2);
        r9.setFirmwareUpdateBlockData(r7);
        if ((r12 instanceof FirmwareUpdateBlockCmd) == false) goto L100;
        FirmwareUpdateBlockCmd r110 = (FirmwareUpdateBlockCmd) r12;
    L101:
        r110.setOpCodeSn(r11.getOpCodeSn());
        r110.setStatus(r11.getStatus());
        r110.setResponse(r9);
        return r110;
    L100:
        r110 = new FirmwareUpdateBlockCmd(new FirmwareUpdateBlockParam(0, 0));
        goto L101
    L95:
        if (r2.length <= 0) goto L97;
        r7 = r2;
        goto L97
    L103:
        if (r2 != null) goto L105;
    L107:
        ExitUpdateModeResponse r10 = new ExitUpdateModeResponse(r8);
        r10.setRawData(r2);
        if ((r12 instanceof ExitUpdateModeCmd) == false) goto L110;
        ExitUpdateModeCmd r111 = (ExitUpdateModeCmd) r12;
    L111:
        r111.setOpCodeSn(r11.getOpCodeSn());
        r111.setStatus(r11.getStatus());
        r111.setResponse(r10);
        return r111;
    L110:
        r111 = new ExitUpdateModeCmd();
        goto L111
    L105:
        if (r2.length <= 0) goto L107;
        r8 = CHexConver.byteToInt(r2[0]);
        goto L107
    L113:
        if (r2 != null) goto L115;
    L117:
        EnterUpdateModeResponse r20 = new EnterUpdateModeResponse(r3);
        r20.setRawData(r2);
        if ((r12 instanceof EnterUpdateModeCmd) == false) goto L120;
        EnterUpdateModeCmd r112 = (EnterUpdateModeCmd) r12;
    L121:
        r112.setOpCodeSn(r11.getOpCodeSn());
        r112.setStatus(r11.getStatus());
        r112.setResponse(r20);
        return r112;
    L120:
        r112 = new EnterUpdateModeCmd();
        goto L121
    L115:
        if (r2.length <= 0) goto L117;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L117
    L123:
        if (r2 != null) goto L125;
    L127:
        InquireUpdateResponse r21 = new InquireUpdateResponse(r3);
        r21.setRawData(r2);
        if ((r12 instanceof InquireUpdateCmd) == false) goto L130;
        InquireUpdateCmd r113 = (InquireUpdateCmd) r12;
    L131:
        r113.setOpCodeSn(r11.getOpCodeSn());
        r113.setStatus(r11.getStatus());
        r113.setResponse(r21);
        return r113;
    L130:
        r113 = new InquireUpdateCmd(new InquireUpdateParam(new byte[0]));
        goto L131
    L125:
        if (r2.length <= 0) goto L127;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L127
    L133:
        if (r2 != null) goto L135;
    L137:
        int r22 = 0;
    L138:
        UpdateFileOffsetResponse r23 = new UpdateFileOffsetResponse();
        r23.setRawData(r2);
        r23.setUpdateFileFlagOffset(r22);
        r23.setUpdateFileFlagLen(r8);
        if ((r12 instanceof GetUpdateFileOffsetCmd) == false) goto L141;
        GetUpdateFileOffsetCmd r114 = (GetUpdateFileOffsetCmd) r12;
    L142:
        r114.setOpCodeSn(r11.getOpCodeSn());
        r114.setStatus(r11.getStatus());
        r114.setResponse(r23);
        return r114;
    L141:
        r114 = new GetUpdateFileOffsetCmd();
        goto L142
    L135:
        if (r2.length < 6) goto L137;
        byte[] r24 = new byte[4];
        System.arraycopy(r2, 0, r24, 0, 4);
        int r25 = CHexConver.bytesToInt(r24);
        r8 = CHexConver.bytesToInt(r2[4], r2[5]);
        r22 = r25;
        goto L138
    L8:
        if (r1 == 226) goto L21;
        if (r1 == 227) goto L21;
        if (r1 == 228) goto L21;
        if (r1 == 229) goto L21;
        if (r1 == 230) goto L21;
        if (r1 == 231) goto L21;
        if (r1 != 232) goto L65;
        goto L21
    }
}
