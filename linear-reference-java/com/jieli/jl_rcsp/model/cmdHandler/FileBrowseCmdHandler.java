package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.command.file_op.DelDevFileCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeleteFileByNameCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeviceFormatCmd;
import com.jieli.jl_rcsp.model.command.file_op.NotifyFileStructureChangeCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartFileBrowseCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopFileBrowseCmd;
import com.jieli.jl_rcsp.model.parameter.DelDevFileParam;
import com.jieli.jl_rcsp.model.parameter.StartFileBrowseParam;
import com.jieli.jl_rcsp.model.parameter.StopFileBrowseParam;
import com.jieli.jl_rcsp.model.response.DelDevFileResponse;
import com.jieli.jl_rcsp.model.response.StartFileBrowseResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseCmdHandler implements ICmdHandler {
    public FileBrowseCmdHandler() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r14, BasePacket r15) {
        if (r15 != null) goto L5;
        return null;
    L5:
        int r1 = r15.getOpCode();
        if (r1 == 12) goto L13;
        if (r1 == 13) goto L13;
        if (r1 == 31) goto L13;
        if (r1 == 35) goto L13;
        if (r1 == 34) goto L13;
        if (r1 == 242) goto L13;
        return null;
    L13:
        byte[] r8 = r15.getParamData();
        byte r10 = -1;
        int r12 = 0;
        if (r15.getType() != 1) goto L34;
        if (r1 == 12) goto L27;
        if (r1 == 13) goto L21;
        if (r1 == 242) goto L20;
    L40:
        return null;
    L20:
        return new NotifyFileStructureChangeCmd(new NotifyFileStructureChangeCmd.Param(r8)).setOpCodeSn(r15.getOpCodeSn());
    L21:
        if (r8 == null) goto L26;
        if (r8.length <= 0) goto L26;
        r10 = r8[0];
    L26:
        return new StopFileBrowseCmd(new StopFileBrowseParam(r10)).setOpCodeSn(r15.getOpCodeSn());
    L27:
        PathData r16 = new PathData();
        if (r8 == null) goto L33;
        if (r8.length <= 0) goto L33;
        r16.parse(r8);
    L33:
        return new StartFileBrowseCmd(new StartFileBrowseParam(r16)).setOpCodeSn(r15.getOpCodeSn());
    L34:
        CommandBase r17 = CommandHelper.getInstance().getCommand(r14, r1, r15.getOpCodeSn());
        if (r1 == 12) goto L62;
        if (r1 == 13) goto L56;
        if (r1 == 31) goto L51;
        if (r1 == 34) goto L46;
        if (r1 != 35) goto L40;
        if (r17 == null) goto L43;
        DeleteFileByNameCmd r18 = (DeleteFileByNameCmd) r17;
    L44:
        r18.setResponse(new DeleteFileByNameCmd.Response());
        r18.setStatus(r15.getStatus());
        r18.setOpCodeSn(r15.getOpCodeSn());
        return r18;
    L43:
        r18 = new DeleteFileByNameCmd(new DeleteFileByNameCmd.Param(""));
        goto L44
    L46:
        if (r17 == null) goto L48;
        DeviceFormatCmd r19 = (DeviceFormatCmd) r17;
    L49:
        r19.setResponse(new DeviceFormatCmd.Response(r8[0]));
        r19.setOpCodeSn(r15.getOpCodeSn());
        r19.setStatus(r15.getStatus());
        return r19;
    L48:
        r19 = new DeviceFormatCmd(new DeviceFormatCmd.Param(0));
        goto L49
    L51:
        if (r17 == null) goto L53;
        DelDevFileCmd r110 = (DelDevFileCmd) r17;
    L54:
        r110.setResponse(new DelDevFileResponse());
        r110.setStatus(r15.getStatus());
        r110.setOpCodeSn(r15.getOpCodeSn());
        return r110;
    L53:
        r110 = new DelDevFileCmd(new DelDevFileParam(0, (byte) 0, 0, false));
        goto L54
    L56:
        CommonResponse r0 = new CommonResponse();
        r0.setRawData(r8);
        if (r17 == null) goto L60;
        StopFileBrowseCmd r111 = (StopFileBrowseCmd) r17;
        r111.setStatus(r15.getStatus());
        r111.setResponse(r0);
        return r111;
    L60:
        StopFileBrowseCmd r112 = new StopFileBrowseCmd(new StopFileBrowseParam((byte) -1));
        r112.setOpCodeSn(r15.getOpCodeSn());
        r112.setStatus(r15.getStatus());
        r112.setResponse(r0);
        return r112;
    L62:
        StartFileBrowseResponse r2 = new StartFileBrowseResponse();
        r2.setRawData(r8);
        if (r8 == null) goto L74;
        int r3 = r8.length;
        if (r3 != 1) goto L67;
        r12 = CHexConver.byteToInt(r8[0]);
        goto L74
    L67:
        if (r3 != 2) goto L69;
        r12 = CHexConver.bytesToInt(r8[0], r8[1]);
        goto L74
    L69:
        if (r3 != 4) goto L74;
        r12 = CHexConver.bytesToInt(r8);
    L74:
        r2.setTotalFile(r12);
        if (r17 == null) goto L78;
        StartFileBrowseCmd r113 = (StartFileBrowseCmd) r17;
        r113.setStatus(r15.getStatus());
        r113.setResponse(r2);
        return r113;
    L78:
        StartFileBrowseCmd r114 = new StartFileBrowseCmd(new StartFileBrowseParam(new PathData()));
        r114.setOpCodeSn(r15.getOpCodeSn());
        r114.setStatus(r15.getStatus());
        r114.setResponse(r2);
        return r114;
    }
}
