package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.upgrade.EnterUpdateModeCmd;
import com.jieli.jl_rcsp.model.command.upgrade.ExitUpdateModeCmd;
import com.jieli.jl_rcsp.model.command.upgrade.FirmwareUpdateBlockCmd;
import com.jieli.jl_rcsp.model.command.upgrade.FirmwareUpdateStatusCmd;
import com.jieli.jl_rcsp.model.command.upgrade.GetUpdateFileOffsetCmd;
import com.jieli.jl_rcsp.model.command.upgrade.InquireUpdateCmd;
import com.jieli.jl_rcsp.model.command.upgrade.NotifyUpdateContentSizeCmd;
import com.jieli.jl_rcsp.model.command.upgrade.RebootDeviceCmd;
import com.jieli.jl_rcsp.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_rcsp.model.parameter.InquireUpdateParam;
import com.jieli.jl_rcsp.model.parameter.NotifyUpdateContentSizeParam;
import com.jieli.jl_rcsp.model.parameter.RebootDeviceParam;
import com.jieli.jl_rcsp.model.response.EnterUpdateModeResponse;
import com.jieli.jl_rcsp.model.response.ExitUpdateModeResponse;
import com.jieli.jl_rcsp.model.response.FirmwareUpdateBlockResponse;
import com.jieli.jl_rcsp.model.response.FirmwareUpdateStatusResponse;
import com.jieli.jl_rcsp.model.response.InquireUpdateResponse;
import com.jieli.jl_rcsp.model.response.RebootDeviceResponse;
import com.jieli.jl_rcsp.model.response.UpdateFileOffsetResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class OtaCmdHandler implements ICmdHandler {
    public OtaCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r10, BasePacket r11) {
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
        byte[] r12 = new byte[4];
        System.arraycopy(r2, 0, r12, 0, 4);
        r0 = CHexConver.bytesToInt(r12);
        if (r2.length < 8) goto L33;
        System.arraycopy(r2, 4, r12, 0, 4);
        r8 = CHexConver.bytesToInt(r12);
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
        int r13 = 0;
    L48:
        return new FirmwareUpdateBlockCmd(new FirmwareUpdateBlockParam(r8, r13)).setOpCodeSn(r11.getOpCodeSn());
    L44:
        if (r2.length < 6) goto L46;
        byte[] r14 = new byte[4];
        System.arraycopy(r2, 0, r14, 0, 4);
        r8 = CHexConver.bytesToInt(r14);
        r13 = CHexConver.bytesToInt(r2[4], r2[5]);
        goto L48
    L53:
        byte[] r15 = new byte[0];
        if (r2 != null) goto L56;
    L58:
        r2 = r15;
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
        CommandBase r16 = CommandHelper.getInstance().getCommand(r10, r1, r11.getOpCodeSn());
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
        if (r16 == null) goto L70;
        NotifyUpdateContentSizeCmd r17 = (NotifyUpdateContentSizeCmd) r16;
        r17.setStatus(r11.getStatus());
        r17.setResponse(r4);
        return r17;
    L70:
        NotifyUpdateContentSizeCmd r18 = new NotifyUpdateContentSizeCmd(new NotifyUpdateContentSizeParam(0));
        r18.setOpCodeSn(r11.getOpCodeSn());
        r18.setStatus(r11.getStatus());
        r18.setResponse(r4);
        return r18;
    L72:
        if (r2 != null) goto L74;
    L76:
        RebootDeviceResponse r5 = new RebootDeviceResponse(r3);
        r5.setRawData(r2);
        if (r16 == null) goto L80;
        RebootDeviceCmd r19 = (RebootDeviceCmd) r16;
        r19.setStatus(r11.getStatus());
        r19.setResponse(r5);
        return r19;
    L80:
        RebootDeviceCmd r110 = new RebootDeviceCmd(new RebootDeviceParam(0));
        r110.setOpCodeSn(r11.getOpCodeSn());
        r110.setStatus(r11.getStatus());
        r110.setResponse(r5);
        return r110;
    L74:
        if (r2.length <= 0) goto L76;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L76
    L82:
        if (r2 != null) goto L84;
    L86:
        FirmwareUpdateStatusResponse r6 = new FirmwareUpdateStatusResponse(r3);
        r6.setRawData(r2);
        if (r16 == null) goto L90;
        FirmwareUpdateStatusCmd r111 = (FirmwareUpdateStatusCmd) r16;
        r111.setStatus(r11.getStatus());
        r111.setResponse(r6);
        return r111;
    L90:
        FirmwareUpdateStatusCmd r112 = new FirmwareUpdateStatusCmd();
        r112.setOpCodeSn(r11.getOpCodeSn());
        r112.setStatus(r11.getStatus());
        r112.setResponse(r6);
        return r112;
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
        if (r16 == null) goto L101;
        FirmwareUpdateBlockCmd r113 = (FirmwareUpdateBlockCmd) r16;
        r113.setStatus(r11.getStatus());
        r113.setResponse(r9);
        return r113;
    L101:
        FirmwareUpdateBlockCmd r114 = new FirmwareUpdateBlockCmd(new FirmwareUpdateBlockParam(0, 0));
        r114.setOpCodeSn(r11.getOpCodeSn());
        r114.setStatus(r11.getStatus());
        r114.setResponse(r9);
        return r114;
    L95:
        if (r2.length <= 0) goto L97;
        r7 = r2;
        goto L97
    L103:
        if (r2 != null) goto L105;
    L107:
        ExitUpdateModeResponse r20 = new ExitUpdateModeResponse(r8);
        r20.setRawData(r2);
        if (r16 == null) goto L111;
        ExitUpdateModeCmd r115 = (ExitUpdateModeCmd) r16;
        r115.setStatus(r11.getStatus());
        r115.setResponse(r20);
        return r115;
    L111:
        ExitUpdateModeCmd r116 = new ExitUpdateModeCmd();
        r116.setOpCodeSn(r11.getOpCodeSn());
        r116.setStatus(r11.getStatus());
        r116.setResponse(r20);
        return r116;
    L105:
        if (r2.length <= 0) goto L107;
        r8 = CHexConver.byteToInt(r2[0]);
        goto L107
    L113:
        if (r2 != null) goto L115;
    L117:
        EnterUpdateModeResponse r21 = new EnterUpdateModeResponse(r3);
        r21.setRawData(r2);
        if (r16 == null) goto L121;
        EnterUpdateModeCmd r117 = (EnterUpdateModeCmd) r16;
        r117.setStatus(r11.getStatus());
        r117.setResponse(r21);
        return r117;
    L121:
        EnterUpdateModeCmd r118 = new EnterUpdateModeCmd();
        r118.setOpCodeSn(r11.getOpCodeSn());
        r118.setStatus(r11.getStatus());
        r118.setResponse(r21);
        return r118;
    L115:
        if (r2.length <= 0) goto L117;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L117
    L123:
        if (r2 != null) goto L125;
    L127:
        InquireUpdateResponse r22 = new InquireUpdateResponse(r3);
        r22.setRawData(r2);
        if (r16 == null) goto L131;
        InquireUpdateCmd r119 = (InquireUpdateCmd) r16;
        r119.setStatus(r11.getStatus());
        r119.setResponse(r22);
        return r119;
    L131:
        InquireUpdateCmd r120 = new InquireUpdateCmd(new InquireUpdateParam(new byte[0]));
        r120.setOpCodeSn(r11.getOpCodeSn());
        r120.setStatus(r11.getStatus());
        r120.setResponse(r22);
        return r120;
    L125:
        if (r2.length <= 0) goto L127;
        r3 = CHexConver.byteToInt(r2[0]);
        goto L127
    L133:
        if (r2 != null) goto L135;
    L137:
        int r23 = 0;
    L138:
        UpdateFileOffsetResponse r24 = new UpdateFileOffsetResponse();
        r24.setRawData(r2);
        r24.setUpdateFileFlagOffset(r8);
        r24.setUpdateFileFlagLen(r23);
        if (r16 == null) goto L142;
        GetUpdateFileOffsetCmd r121 = (GetUpdateFileOffsetCmd) r16;
        r121.setStatus(r11.getStatus());
        r121.setResponse(r24);
        return r121;
    L142:
        GetUpdateFileOffsetCmd r122 = new GetUpdateFileOffsetCmd();
        r122.setOpCodeSn(r11.getOpCodeSn());
        r122.setStatus(r11.getStatus());
        r122.setResponse(r24);
        return r122;
    L135:
        if (r2.length < 6) goto L137;
        byte[] r25 = new byte[4];
        System.arraycopy(r2, 0, r25, 0, 4);
        r8 = CHexConver.bytesToInt(r25);
        r23 = CHexConver.bytesToInt(r2[4], r2[5]);
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
