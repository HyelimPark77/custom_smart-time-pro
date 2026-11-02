package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.parameter.CustomParam;
import com.jieli.jl_bt_ota.model.response.CustomResponse;

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
