package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_bt_ota.model.response.FirmwareUpdateBlockResponse;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockCmd extends CommandWithParamAndResponse<FirmwareUpdateBlockParam, FirmwareUpdateBlockResponse> {
    public FirmwareUpdateBlockCmd(FirmwareUpdateBlockParam r3) {
        super(229, FirmwareUpdateBlockCmd.class.getSimpleName(), r3);
    }
}
