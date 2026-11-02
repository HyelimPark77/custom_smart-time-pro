package com.jieli.jl_rcsp.model.command.tws;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.GetADVInfoParam;
import com.jieli.jl_rcsp.model.response.ADVInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public class GetADVInfoCmd extends CommandWithParamAndResponse<GetADVInfoParam, ADVInfoResponse> {
    public GetADVInfoCmd(GetADVInfoParam r3) {
        super(193, GetADVInfoCmd.class.getSimpleName(), r3);
    }
}
