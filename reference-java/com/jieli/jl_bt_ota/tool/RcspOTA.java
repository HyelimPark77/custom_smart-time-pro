package com.jieli.jl_bt_ota.tool;

import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult;
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
import com.jieli.jl_bt_ota.model.response.EnterUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.ExitUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.FirmwareUpdateStatusResponse;
import com.jieli.jl_bt_ota.model.response.InquireUpdateResponse;
import com.jieli.jl_bt_ota.model.response.NotifyCommunicationWayResponse;
import com.jieli.jl_bt_ota.model.response.UpdateFileOffsetResponse;
import com.jieli.jl_bt_ota.tool.callback.CmdBooleanCallback;
import com.jieli.jl_bt_ota.tool.callback.CmdResultCallback;
import com.jieli.jl_bt_ota.util.CommandBuilder;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class RcspOTA implements IRcspOTA {

    /* JADX INFO: renamed from: a */
    private final IRcspOp f37654a;

    public RcspOTA(IRcspOp iRcspOp) {
        if (iRcspOp == null) {
            throw new NullPointerException("BluetoothOTAManager can not be null.");
        }
        this.f37654a = iRcspOp;
    }

    /* JADX INFO: renamed from: a */
    private <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void m27099a(T t, CommandCallback<T> commandCallback) {
        IRcspOp iRcspOp = this.f37654a;
        iRcspOp.sendCommandAsync(iRcspOp.getTargetDevice(), t, this.f37654a.getBluetoothOption().getTimeoutMs(), commandCallback);
    }

    public static BaseError convertCmdE2Error(int i) {
        switch (i) {
            case 1:
                return OTAError.buildError(16386);
            case 2:
                return OTAError.buildError(16387);
            case 3:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_FILE_VERSION_SAME);
            case 4:
                return OTAError.buildError(ErrorCode.SUB_ERR_TWS_NOT_CONNECT);
            case 5:
                return OTAError.buildError(ErrorCode.SUB_ERR_HEADSET_NOT_IN_CHARGING_BIN);
            case 6:
                return OTAError.buildError(ErrorCode.SUB_ERR_OTA_IN_PROGRESS);
            case 7:
                return OTAError.buildError(ErrorCode.SUB_ERR_DEVICE_IN_DOUBLE_CONNECTION);
            default:
                return OTAError.buildError(16385, i, "Unknown Error : " + CommonUtil.formatInt(i));
        }
    }

    public static BaseError convertCmdE6Error(int i) {
        switch (i) {
            case 1:
                return OTAError.buildError(16389);
            case 2:
                return OTAError.buildError(16385, "Device return update failed.");
            case 3:
                return OTAError.buildError(16390);
            case 4:
                return OTAError.buildError(16387);
            case 5:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_TYPE_NOT_MATCH);
            case 6:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_DATA_LEN);
            case 7:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_FLASH_READ);
            case 8:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_CMD_TIMEOUT);
            case 9:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_SAME_FILE);
            default:
                return OTAError.buildError(ErrorCode.SUB_ERR_UPGRADE_UNKNOWN, i, "Device returned to an unknown code : " + CommonUtil.formatInt(i));
        }
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void changeCommunicationWay(int i, int i2, IActionCallback<Integer> iActionCallback) {
        m27099a(new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(i, i2)), new CmdResultCallback("changeCommunicationWay", iActionCallback, new IHandleResult<Integer, NotifyCommunicationWayCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.1
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(NotifyCommunicationWayCmd notifyCommunicationWayCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public Integer handleResult(NotifyCommunicationWayCmd notifyCommunicationWayCmd) {
                if (notifyCommunicationWayCmd == null || notifyCommunicationWayCmd.getResponse() == 0) {
                    return 7;
                }
                return Integer.valueOf(((NotifyCommunicationWayResponse) notifyCommunicationWayCmd.getResponse()).getFlag());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void enterUpdateMode(IActionCallback<Integer> iActionCallback) {
        m27099a(new EnterUpdateModeCmd(), new CmdResultCallback("enterUpdateMode", iActionCallback, new IHandleResult<Integer, EnterUpdateModeCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.4
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(EnterUpdateModeCmd enterUpdateModeCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public Integer handleResult(EnterUpdateModeCmd enterUpdateModeCmd) {
                if (enterUpdateModeCmd == null || enterUpdateModeCmd.getResponse() == 0) {
                    return 7;
                }
                return Integer.valueOf(((EnterUpdateModeResponse) enterUpdateModeCmd.getResponse()).getCanUpdateFlag());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void exitUpdateMode(IActionCallback<Integer> iActionCallback) {
        m27099a(new ExitUpdateModeCmd(), new CmdResultCallback("exitUpdateMode", iActionCallback, new IHandleResult<Integer, ExitUpdateModeCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.5
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(ExitUpdateModeCmd exitUpdateModeCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public Integer handleResult(ExitUpdateModeCmd exitUpdateModeCmd) {
                if (exitUpdateModeCmd == null || exitUpdateModeCmd.getResponse() == 0) {
                    return 1;
                }
                return Integer.valueOf(((ExitUpdateModeResponse) exitUpdateModeCmd.getResponse()).getResult());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void inquiryDeviceCanOTA(byte[] bArr, IActionCallback<Integer> iActionCallback) {
        m27099a(new InquireUpdateCmd(new InquireUpdateParam(bArr)), new CmdResultCallback("inquiryDeviceCanOTA", iActionCallback, new IHandleResult<Integer, InquireUpdateCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.3
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(InquireUpdateCmd inquireUpdateCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public Integer handleResult(InquireUpdateCmd inquireUpdateCmd) {
                if (inquireUpdateCmd == null || inquireUpdateCmd.getResponse() == 0) {
                    return 1;
                }
                return Integer.valueOf(((InquireUpdateResponse) inquireUpdateCmd.getResponse()).getCanUpdateFlag());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void queryUpdateResult(IActionCallback<Integer> iActionCallback) {
        m27099a(new FirmwareUpdateStatusCmd(), new CmdResultCallback("queryUpdateResult", iActionCallback, new IHandleResult<Integer, FirmwareUpdateStatusCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.6
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(FirmwareUpdateStatusCmd firmwareUpdateStatusCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public Integer handleResult(FirmwareUpdateStatusCmd firmwareUpdateStatusCmd) {
                if (firmwareUpdateStatusCmd == null || firmwareUpdateStatusCmd.getResponse() == 0) {
                    return 1;
                }
                return Integer.valueOf(((FirmwareUpdateStatusResponse) firmwareUpdateStatusCmd.getResponse()).getResult());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void readUpgradeFileFlag(IActionCallback<FileOffset> iActionCallback) {
        m27099a(new GetUpdateFileOffsetCmd(), new CmdResultCallback("readUpgradeFileFlag", iActionCallback, new IHandleResult<FileOffset, GetUpdateFileOffsetCmd>() { // from class: com.jieli.jl_bt_ota.tool.RcspOTA.2
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(GetUpdateFileOffsetCmd getUpdateFileOffsetCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public FileOffset handleResult(GetUpdateFileOffsetCmd getUpdateFileOffsetCmd) {
                if (getUpdateFileOffsetCmd == null || getUpdateFileOffsetCmd.getResponse() == 0) {
                    return new FileOffset(0, 0);
                }
                UpdateFileOffsetResponse updateFileOffsetResponse = (UpdateFileOffsetResponse) getUpdateFileOffsetCmd.getResponse();
                return new FileOffset(updateFileOffsetResponse.getUpdateFileFlagOffset(), updateFileOffsetResponse.getUpdateFileFlagLen());
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void rebootDevice(IActionCallback<Boolean> iActionCallback) {
        m27099a(new RebootDeviceCmd(new RebootDeviceParam(0)), new CmdBooleanCallback("rebootDevice", iActionCallback));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T t, CommandCallback<T> commandCallback) {
        IRcspOp iRcspOp = this.f37654a;
        iRcspOp.sendCommandResponse(iRcspOp.getTargetDevice(), t, commandCallback);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public void stopADVInfo(IActionCallback<Boolean> iActionCallback) {
        m27099a(CommandBuilder.buildStopDeviceNotifyADVInfoCmd(), new CmdBooleanCallback("stopADVInfo", iActionCallback));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOTA
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T t) {
        sendCommandResponse(t, null);
    }
}
