package com.jieli.jl_rcsp.model.command.status;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.GetTargetInfoParam;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetInfoCmd extends CommandWithParamAndResponse<GetTargetInfoParam, TargetInfoResponse> {
    public GetTargetInfoCmd(GetTargetInfoParam r3) {
        super(3, GetTargetInfoCmd.class.getSimpleName(), r3);
    }
}
