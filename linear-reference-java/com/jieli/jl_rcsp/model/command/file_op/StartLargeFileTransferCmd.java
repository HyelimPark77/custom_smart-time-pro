package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.StartLargeFileTransferParam;
import com.jieli.jl_rcsp.model.response.StartLargeFileTransferResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StartLargeFileTransferCmd extends CommandWithParamAndResponse<StartLargeFileTransferParam, StartLargeFileTransferResponse> {
    public StartLargeFileTransferCmd(StartLargeFileTransferParam r3) {
        super(27, StartLargeFileTransferCmd.class.getSimpleName(), r3);
    }
}
