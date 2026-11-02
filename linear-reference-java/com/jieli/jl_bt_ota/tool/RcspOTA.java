package com.jieli.jl_bt_ota.tool;

import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA;
import com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp;
import com.jieli.jl_bt_ota.model.FileOffset;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.EnterUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.ExitUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.FirmwareUpdateStatusCmd;
import com.jieli.jl_bt_ota.model.command.GetUpdateFileOffsetCmd;
import com.jieli.jl_bt_ota.model.command.InquireUpdateCmd;
import com.jieli.jl_bt_ota.model.command.NotifyCommunicationWayCmd;
import com.jieli.jl_bt_ota.model.command.RebootDeviceCmd;
import com.jieli.jl_bt_ota.model.parameter.InquireUpdateParam;
import com.jieli.jl_bt_ota.model.parameter.NotifyCommunicationWayParam;
import com.jieli.jl_bt_ota.model.parameter.RebootDeviceParam;
import com.jieli.jl_bt_ota.tool.callback.CmdBooleanCallback;
import com.jieli.jl_bt_ota.tool.callback.CmdResultCallback;
import com.jieli.jl_bt_ota.util.CommandBuilder;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class RcspOTA implements IRcspOTA {
    private final IRcspOp a;

    public RcspOTA(IRcspOp r2) {
        if (r2 == null) goto L7;
        this.a = r2;
        return;
    L7:
        throw new NullPointerException("BluetoothOTAManager can not be null.");
    }

    private <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void a(T r4, CommandCallback<T> r5) {
        IRcspOp r0 = this.a;
        r0.sendCommandAsync(r0.getTargetDevice(), r4, this.a.getBluetoothOption().getTimeoutMs(), r5);
    }

    public static BaseError convertCmdE2Error(int r2) {
        switch(r2) {
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        return OTAError.buildError(16385, r2, "Unknown Error : " + CommonUtil.formatInt(r2));
    L6:
        return OTAError.buildError(ErrorCode.SUB_ERR_DEVICE_IN_DOUBLE_CONNECTION);
    L8:
        return OTAError.buildError(ErrorCode.SUB_ERR_OTA_IN_PROGRESS);
    L10:
        return OTAError.buildError(ErrorCode.SUB_ERR_HEADSET_NOT_IN_CHARGING_BIN);
    L12:
        return OTAError.buildError(ErrorCode.SUB_ERR_TWS_NOT_CONNECT);
    L14:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_FILE_VERSION_SAME);
    L16:
        return OTAError.buildError(16387);
    L18:
        return OTAError.buildError(16386);
    }

    public static BaseError convertCmdE6Error(int r2) {
        switch(r2) {
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            case 8: goto L8;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_UNKNOWN, r2, "Device returned to an unknown code : " + CommonUtil.formatInt(r2));
    L6:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_SAME_FILE);
    L8:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_CMD_TIMEOUT);
    L10:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_FLASH_READ);
    L12:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_DATA_LEN);
    L14:
        return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_TYPE_NOT_MATCH);
    L16:
        return OTAError.buildError(16387);
    L18:
        return OTAError.buildError(16390);
    L20:
        return OTAError.buildError(16385, "Device return update failed.");
    L22:
        return OTAError.buildError(16389);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void changeCommunicationWay(int r3, int r4, IActionCallback<Integer> r5) {
        a(new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(r3, r4)), new CmdResultCallback("changeCommunicationWay", r5, new AnonymousClass1(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void enterUpdateMode(IActionCallback<Integer> r5) {
        a(new EnterUpdateModeCmd(), new CmdResultCallback("enterUpdateMode", r5, new AnonymousClass4(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void exitUpdateMode(IActionCallback<Integer> r5) {
        a(new ExitUpdateModeCmd(), new CmdResultCallback("exitUpdateMode", r5, new AnonymousClass5(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void inquiryDeviceCanOTA(byte[] r4, IActionCallback<Integer> r5) {
        a(new InquireUpdateCmd(new InquireUpdateParam(r4)), new CmdResultCallback("inquiryDeviceCanOTA", r5, new AnonymousClass3(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void queryUpdateResult(IActionCallback<Integer> r5) {
        a(new FirmwareUpdateStatusCmd(), new CmdResultCallback("queryUpdateResult", r5, new AnonymousClass6(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void readUpgradeFileFlag(IActionCallback<FileOffset> r5) {
        a(new GetUpdateFileOffsetCmd(), new CmdResultCallback("readUpgradeFileFlag", r5, new AnonymousClass2(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void rebootDevice(IActionCallback<Boolean> r4) {
        a(new RebootDeviceCmd(new RebootDeviceParam(0)), new CmdBooleanCallback("rebootDevice", r4));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T r3, CommandCallback<T> r4) {
        IRcspOp r0 = this.a;
        r0.sendCommandResponse(r0.getTargetDevice(), r3, r4);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void stopADVInfo(IActionCallback<Boolean> r4) {
        a(CommandBuilder.buildStopDeviceNotifyADVInfoCmd(), new CmdBooleanCallback("stopADVInfo", r4));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T r2) {
        sendCommandResponse(r2, null);
    }
}
