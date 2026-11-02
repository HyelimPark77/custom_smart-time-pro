package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.parameter.NotifyAppInfoParam;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyAppInfoCmd extends CommandWithParamAndResponse<NotifyAppInfoParam, CommonResponse> {
    public NotifyAppInfoCmd(NotifyAppInfoParam r3) {
        super(208, NotifyAppInfoCmd.class.getSimpleName(), r3);
    }
}
