package com.jieli.jl_rcsp.model.command.custom;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.CustomCommonParam;
import com.jieli.jl_rcsp.model.response.CustomCommonResponse;

/* JADX INFO: loaded from: classes17.dex */
class CustomCmdWithResponse<P extends CustomCommonParam, R extends CustomCommonResponse> extends CommandWithParamAndResponse {
    private R customResponse;

    public CustomCmdWithResponse(String r2, P r3) {
        super(240, r2, r3);
    }

    public R getCustomResponse() {
        return this.customResponse;
    }

    public void setCustomResponse(R r1) {
        this.customResponse = r1;
        setResponse(r1);
    }
}
