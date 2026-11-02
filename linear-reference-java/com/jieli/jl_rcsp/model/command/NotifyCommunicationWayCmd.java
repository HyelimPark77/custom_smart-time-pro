package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.parameter.NotifyCommunicationWayParam;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayCmd extends CommandWithParamAndResponse<NotifyCommunicationWayParam, CommonResponse> {
    public NotifyCommunicationWayCmd(NotifyCommunicationWayParam r3) {
        super(11, NotifyCommunicationWayCmd.class.getSimpleName(), r3);
    }
}
