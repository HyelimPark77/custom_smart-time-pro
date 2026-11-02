package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.BaseResponse;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.watch.HealthSettingCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class HealthSettingCmdHandler implements ICmdHandler {
    public HealthSettingCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r7, BasePacket r8) {
        HealthSettingCmd.Param r0 = null;
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.getOpCode() == 165) goto L9;
        return null;
    L9:
        if (r8.getHasResponse() != 1) goto L11;
        int r1 = 2;
    L12:
        byte[] r4 = r8.getParamData();
        if (r8.getType() != 1) goto L38;
        if (r4 != null) goto L16;
    L37:
        return null;
    L16:
        if (r4.length == 0) goto L37;
        byte r5 = r4[0];
        if (r5 == 0) goto L32;
        if (r5 == 1) goto L27;
        if (r5 != 2) goto L36;
        int r2 = r4.length - 1;
        byte[] r3 = new byte[r2];
        if (r2 <= 0) goto L26;
        System.arraycopy(r4, 1, r3, 0, r2);
    L26:
        r0 = new HealthSettingCmd.UpdateParam(ParseHelper.coverParamDataToAttrBeans(r3));
    L36:
        return new HealthSettingCmd(r1, r0).setOpCodeSn(r8.getOpCodeSn());
    L27:
        int r6 = r4.length - 1;
        byte[] r9 = new byte[r6];
        if (r6 <= 0) goto L30;
        System.arraycopy(r4, 1, r9, 0, r6);
    L30:
        r0 = new HealthSettingCmd.SetParam(ParseHelper.coverParamDataToAttrBeans(r9));
        goto L36
    L32:
        if (r4.length >= 5) goto L34;
        return null;
    L34:
        r0 = new HealthSettingCmd.GetParam(CHexConver.bytesToInt(r4, 1, 4));
        goto L36
    L38:
        CommandBase r10 = CommandHelper.getInstance().getCommand(r7, r8.getOpCode(), r8.getOpCodeSn());
        if (r10 != null) goto L42;
        JL_Log.e("HealthSettingCmdHandler", "parseDataToCmd", "invalid health setting cmd response");
        return null;
    L42:
        HealthSettingCmd r11 = (HealthSettingCmd) r10;
        r11.setOpCodeSn(r8.getOpCodeSn());
        r11.setStatus(r8.getStatus());
        if (r8.getStatus() == 0) goto L47;
        JL_Log.w("HealthSettingCmdHandler", "parseDataToCmd", "health setting cmd send fail ,status = " + r8.getStatus());
        r11.setResponse(new HealthSettingCmd.Response());
        return r11;
    L47:
        if ((r11.getParam() instanceof HealthSettingCmd.GetParam) == false) goto L49;
        BaseResponse r12 = new HealthSettingCmd.GetResponse(ParseHelper.coverParamDataToAttrBeans(r4));
    L50:
        r12.setRawData(r4);
        r11.setResponse(r12);
        return r11;
    L49:
        r12 = new HealthSettingCmd.Response();
        goto L50
    L11:
        r1 = 1;
        goto L12
    }
}
