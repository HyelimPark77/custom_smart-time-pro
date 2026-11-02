package com.jieli.jl_rcsp.model.cmdHandler;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class SportsInfoStatusCmdHandler implements ICmdHandler {
    private final String tag;

    public SportsInfoStatusCmdHandler() {
        this.tag = getClass().getSimpleName();
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public CommandBase parseDataToCmd(BluetoothDevice r8, BasePacket r9) {
        if (r9 != null) goto L6;
        return null;
    L6:
        if (r9.getOpCode() == 166) goto L8;
        return null;
    L8:
        byte[] r1 = r9.getParamData();
        if (r9.getHasResponse() != 1) goto L11;
        int r2 = 2;
    L13:
        if (r9.getType() == 1) goto L52;
        CommandBase r10 = CommandHelper.getInstance().getCommand(r8, r9.getOpCode(), r9.getOpCodeSn());
        if (r10 != null) goto L50;
        JL_Log.e(this.tag, "parseDataToCmd", "invalid sports info status sync cmd response");
        return null;
    L50:
        SportsInfoStatusSyncCmd.Response r3 = new SportsInfoStatusSyncCmd.Response(r1);     // Catch: ParseDataException -> L42
        int r4 = r3.getOp();     // Catch: ParseDataException -> L42
        if (r4 == 0) goto L45;
        if (r4 != 2) goto L39;
        r3 = new SportsInfoStatusSyncCmd.AppStopSportsResponse(r1);     // Catch: ParseDataException -> L42
    L46:
        SportsInfoStatusSyncCmd r11 = (SportsInfoStatusSyncCmd) r10;     // Catch: ParseDataException -> L42
        r11.setOpCodeSn(r9.getOpCodeSn());     // Catch: ParseDataException -> L42
        r11.setStatus(r9.getStatus());     // Catch: ParseDataException -> L42
        r11.setResponse(r3);     // Catch: ParseDataException -> L42
        return r11;
    L39:
        if (r4 != 6) goto L46;
        r3 = new SportsInfoStatusSyncCmd.ReadRealDataResponse(r1);     // Catch: ParseDataException -> L42
        goto L46
    L45:
        r3 = new SportsInfoStatusSyncCmd.ReadSportsInfoResponse(r1);     // Catch: ParseDataException -> L42
    L42:
        e = move-exception;
        JL_Log.w(this.tag, "parseDataToCmd", "response ParseDataException : " + e);
        return null;
    L52:
        SportsInfoStatusSyncCmd.Param r12 = new SportsInfoStatusSyncCmd.Param(r1);     // Catch: ParseDataException -> L18
        switch(r12.getOp()) {
            case 0: goto L26;
            case 1: goto L25;
            case 2: goto L24;
            case 3: goto L23;
            case 4: goto L22;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L17;
            default: goto L27;
        };     // Catch: ParseDataException -> L18
    L17:
        r12 = new SportsInfoStatusSyncCmd.SetReadRealDataIntervalParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L20:
        r12 = new SportsInfoStatusSyncCmd.ReadRealDataParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L21:
        r12 = new SportsInfoStatusSyncCmd.ResumeSportsParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L22:
        r12 = new SportsInfoStatusSyncCmd.PauseSportsParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L23:
        r12 = new SportsInfoStatusSyncCmd.FirmwareStopSportsParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L24:
        r12 = new SportsInfoStatusSyncCmd.AppStopSportsParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L25:
        r12 = new SportsInfoStatusSyncCmd.StartSportsParam(r1);     // Catch: ParseDataException -> L18
        goto L27
    L26:
        r12 = new SportsInfoStatusSyncCmd.ReadSportsInfoParam(r1);     // Catch: ParseDataException -> L18
    L27:
        SportsInfoStatusSyncCmd r5 = new SportsInfoStatusSyncCmd(r2, r12);     // Catch: ParseDataException -> L18
        r5.setOpCodeSn(r9.getOpCodeSn());     // Catch: ParseDataException -> L18
        return r5;
    L18:
        e = move-exception;
        JL_Log.w(this.tag, "parseDataToCmd", "command ParseDataException : " + e);
        return null;
    L11:
        r2 = 1;
        goto L13
    }
}
