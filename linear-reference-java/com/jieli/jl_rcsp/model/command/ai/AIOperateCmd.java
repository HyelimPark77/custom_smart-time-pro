package com.jieli.jl_rcsp.model.command.ai;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.AIOperateParam;
import com.jieli.jl_rcsp.model.response.AIOperateResponse;

/* JADX INFO: loaded from: classes17.dex */
public class AIOperateCmd extends CommandWithParamAndResponse<AIOperateParam, AIOperateResponse> {
    public AIOperateCmd(AIOperateParam r3) {
        super(50, AIOperateCmd.class.getSimpleName(), r3);
    }
}
