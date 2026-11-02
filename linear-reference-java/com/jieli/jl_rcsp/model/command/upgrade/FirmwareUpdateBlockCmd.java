package com.jieli.jl_rcsp.model.command.upgrade;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_rcsp.model.response.FirmwareUpdateBlockResponse;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockCmd extends CommandWithParamAndResponse<FirmwareUpdateBlockParam, FirmwareUpdateBlockResponse> {
    public FirmwareUpdateBlockCmd(FirmwareUpdateBlockParam r3) {
        super(229, FirmwareUpdateBlockCmd.class.getSimpleName(), r3);
    }
}
