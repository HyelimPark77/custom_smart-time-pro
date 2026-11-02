package com.jieli.jl_rcsp.model.command.custom;

import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.parameter.CustomParam;
import com.jieli.jl_rcsp.model.response.CustomResponse;

/* JADX INFO: loaded from: classes17.dex */
public class CustomCmd extends CommandBase<CustomParam, CustomResponse> {
    public CustomCmd(CustomParam r2) {
        this(2, r2);
    }

    public CustomCmd(int r3, CustomParam r4) {
        super(255, CustomCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
