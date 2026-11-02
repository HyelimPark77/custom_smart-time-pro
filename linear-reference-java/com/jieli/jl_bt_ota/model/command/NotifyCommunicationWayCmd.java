package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandWithParamAndResponse;
import com.jieli.jl_bt_ota.model.parameter.NotifyCommunicationWayParam;
import com.jieli.jl_bt_ota.model.response.NotifyCommunicationWayResponse;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayCmd extends CommandWithParamAndResponse<NotifyCommunicationWayParam, NotifyCommunicationWayResponse> {
    public NotifyCommunicationWayCmd(NotifyCommunicationWayParam r3) {
        super(11, NotifyCommunicationWayCmd.class.getSimpleName(), r3);
    }
}
