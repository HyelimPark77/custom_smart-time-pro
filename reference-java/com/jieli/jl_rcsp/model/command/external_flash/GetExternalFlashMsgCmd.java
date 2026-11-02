package com.jieli.jl_rcsp.model.command.external_flash;

import com.jieli.jl_rcsp.model.base.CommandWithResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;

/* JADX INFO: loaded from: classes17.dex */
public class GetExternalFlashMsgCmd extends CommandWithResponse<ExternalFlashMsgResponse> {
    public GetExternalFlashMsgCmd() {
        super(214, GetExternalFlashMsgCmd.class.getSimpleName());
    }
}
