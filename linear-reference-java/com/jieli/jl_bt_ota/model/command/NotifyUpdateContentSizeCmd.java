package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.parameter.NotifyUpdateContentSizeParam;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyUpdateContentSizeCmd extends CommandWithParamAndResponse<NotifyUpdateContentSizeParam, CommonResponse> {
    public NotifyUpdateContentSizeCmd(NotifyUpdateContentSizeParam r3) {
        super(232, NotifyUpdateContentSizeCmd.class.getSimpleName(), r3);
    }
}
