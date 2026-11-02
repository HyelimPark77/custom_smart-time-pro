package com.jieli.jl_rcsp.model.command.tws;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.SetADVInfoParam;
import com.jieli.jl_rcsp.model.response.SetADVResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SetADVInfoCmd extends CommandWithParamAndResponse<SetADVInfoParam, SetADVResponse> {
    public SetADVInfoCmd(SetADVInfoParam r3) {
        super(192, SetADVInfoCmd.class.getSimpleName(), r3);
    }
}
