package com.jieli.jl_rcsp.model.command.tws;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.parameter.RequestAdvOpParam;

/* JADX INFO: loaded from: classes17.dex */
public class RequestAdvOpCmd extends CommandWithParamAndResponse<RequestAdvOpParam, CommonResponse> {
    public RequestAdvOpCmd(RequestAdvOpParam r3) {
        super(196, RequestAdvOpCmd.class.getSimpleName(), r3);
    }
}
