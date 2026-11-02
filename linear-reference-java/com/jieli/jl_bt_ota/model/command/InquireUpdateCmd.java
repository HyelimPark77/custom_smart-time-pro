package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.parameter.InquireUpdateParam;
import com.jieli.jl_bt_ota.model.response.InquireUpdateResponse;

/* JADX INFO: loaded from: classes17.dex */
public class InquireUpdateCmd extends CommandWithParamAndResponse<InquireUpdateParam, InquireUpdateResponse> {
    public InquireUpdateCmd(InquireUpdateParam r3) {
        super(226, InquireUpdateCmd.class.getSimpleName(), r3);
    }
}
