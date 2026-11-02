package com.jieli.jl_bt_ota.model.base;

import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class CommandWithParamAndResponse<P extends BaseParameter, R extends CommonResponse> extends CommandBase<P, R> {
    public CommandWithParamAndResponse(int r2, String r3, P r4) {
        super(r2, r3, 2);
        setParam(r4);
    }
}
