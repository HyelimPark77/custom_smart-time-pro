package com.jieli.jl_bt_ota.model.command.tws;

import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.parameter.tws.SetDeviceNotifyAdvInfoParam;
import com.jieli.jl_bt_ota.model.response.SetDeviceNotifyAdvInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SetDeviceNotifyAdvInfoCmd extends CommandWithParamAndResponse<SetDeviceNotifyAdvInfoParam, SetDeviceNotifyAdvInfoResponse> {
    public SetDeviceNotifyAdvInfoCmd(SetDeviceNotifyAdvInfoParam r3) {
        super(195, SetDeviceNotifyAdvInfoCmd.class.getSimpleName(), r3);
    }
}
