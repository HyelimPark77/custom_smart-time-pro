package com.jieli.jl_rcsp.model.command.custom;

import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.model.parameter.CustomCommonParam;

/* JADX INFO: loaded from: classes17.dex */
class CustomCmdBase<T extends CustomCommonParam> extends CommandWithParam<T> {
    public CustomCmdBase(String r2, T r3) {
        super(240, r2, r3);
    }
}
