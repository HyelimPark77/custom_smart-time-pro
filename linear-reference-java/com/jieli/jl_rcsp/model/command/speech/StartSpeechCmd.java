package com.jieli.jl_rcsp.model.command.speech;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.StartSpeechParam;
import com.jieli.jl_rcsp.model.response.StartSpeechResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StartSpeechCmd extends CommandWithParamAndResponse<StartSpeechParam, StartSpeechResponse> {
    public StartSpeechCmd(StartSpeechParam r3) {
        super(4, StartSpeechCmd.class.getSimpleName(), r3);
    }
}
