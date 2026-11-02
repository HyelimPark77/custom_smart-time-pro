package com.jieli.jl_bt_ota.model.base;

import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class CommandWithResponse<R extends CommonResponse> extends CommandBase<BaseParameter, R> {
    public CommandWithResponse(int r2, String r3) {
        super(r2, r3, 3);
    }
}
