package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.parameter.FunctionParam;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionCmd extends CommandWithParamAndResponse<FunctionParam, CommonResponse> {
    public FunctionCmd(FunctionParam r3) {
        super(14, FunctionCmd.class.getSimpleName(), r3);
    }
}
