package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.BaseResponse;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class SmallFileTransferCmdHandler implements ICmdHandler {
    private final String TAG;

    public SmallFileTransferCmdHandler() {
        this.TAG = SmallFileTransferCmdHandler.class.getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r12, BasePacket r13) {
        if (r13 != null) goto L6;
        return null;
    L6:
        if (r13.getOpCode() == 40) goto L8;
        return null;
    L8:
        byte[] r1 = r13.getParamData();
        if (r13.getType() != 1) goto L27;
        byte r14 = r1[0];
        int r0 = r1.length;
        int r2 = r0 - 1;
        byte[] r8 = new byte[r2];
        System.arraycopy(r1, 1, r8, 0, r2);
        if (r14 != 0) goto L13;
        SmallFileTransferCmd.Param r3 = new SmallFileTransferCmd.QueryParam(r8[0]);
    L25:
        SmallFileTransferCmd r15 = new SmallFileTransferCmd(r3);
        r15.setOpCodeSn(r13.getOpCodeSn());
        return r15;
    L13:
        if (r14 != 1) goto L15;
        r3 = new SmallFileTransferCmd.ReadFileParam(r8[0], CHexConver.bytesToShort(r8[1], r8[2]), CHexConver.bytesToShort(r8[3], r8[4]), CHexConver.bytesToShort(r8[5], r8[6]), r8[7]);
        goto L25
    L15:
        if (r14 == 2) goto L22;
        if (r14 == 3) goto L21;
        if (r14 != 4) goto L20;
        r3 = new SmallFileTransferCmd.DeleteFileParam(r8[0], CHexConver.bytesToShort(r8[1], r8[2]));
        goto L25
    L20:
        throw new RuntimeException("invalid Small file transfer cmd op");
    L21:
        byte r4 = r8[0];
        short r5 = CHexConver.bytesToShort(r8[1], r8[2]);
        short r6 = CHexConver.bytesToShort(r8[3], r8[4]);
        short r7 = CHexConver.bytesToShort(r8[5], r8[6]);
        short r9 = CHexConver.bytesToShort(r8[7], r8[8]);
        int r10 = r0 - 10;
        byte[] r11 = new byte[r10];
        System.arraycopy(r8, 9, r11, 0, r10);
        r3 = new SmallFileTransferCmd.UpdateFileParam(r4, r5, r6, r7, r11, r9);
        goto L25
    L22:
        byte r16 = r8[0];
        short r17 = CHexConver.bytesToShort(r8[1], r8[2]);
        short r18 = CHexConver.bytesToShort(r8[3], r8[4]);
        short r19 = CHexConver.bytesToShort(r8[5], r8[6]);
        int r20 = r0 - 8;
        byte[] r21 = new byte[r20];
        System.arraycopy(r8, 7, r21, 0, r20);
        r3 = new SmallFileTransferCmd.AddFileParam(r16, r17, r18, r21, r19);
        goto L25
    L27:
        CommandBase r110 = CommandHelper.getInstance().getCommand(r12, r13.getOpCode(), r13.getOpCodeSn());
        if (r110 != null) goto L31;
        JL_Log.e(this.TAG, "parseDataToCmd", "invalid small file transfer cmd response");
        return null;
    L31:
        SmallFileTransferCmd r111 = (SmallFileTransferCmd) r110;
        r111.setOpCodeSn(r13.getOpCodeSn());
        r111.setStatus(r13.getStatus());
        if (r13.getStatus() == 0) goto L35;
        JL_Log.w(this.TAG, "parseDataToCmd", "small file transfer cmd  send fail, status = " + r13.getStatus());
        r111.setResponse(new SmallFileTransferCmd.Response());
        return r111;
    L35:
        byte r112 = r1[0];
        int r22 = r1.length - 1;
        byte[] r23 = new byte[r22];
        System.arraycopy(r1, 1, r23, 0, r22);
        if (r112 == 0) goto L45;
        if (r112 == 1) goto L44;
        if (r112 == 2) goto L43;
        if (r112 == 3) goto L42;
        if (r112 == 4) goto L42;
        BaseResponse r113 = new SmallFileTransferCmd.Response();
    L46:
        r113.setRawData(r23);
        r111.setResponse(r113);
        return r111;
    L42:
        r113 = new SmallFileTransferCmd.ResultResponse(r23[0]);
        goto L46
    L43:
        r113 = new SmallFileTransferCmd.AddFileResponse(r23);
        goto L46
    L44:
        r113 = new SmallFileTransferCmd.ReadFileResponse(r23);
        goto L46
    L45:
        r113 = new SmallFileTransferCmd.QueryResponse(((SmallFileTransferCmd.QueryParam) r111.getParam()).data[0], r23);
        goto L46
    }
}
