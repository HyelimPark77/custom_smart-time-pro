package com.jieli.jl_rcsp.model.base;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class CommandWithParam<P extends BaseParameter> extends CommandBase<P, CommonResponse> {
    public CommandWithParam(int r2, String r3, P r4) {
        super(r2, r3, 1);
        setParam(r4);
    }
}
