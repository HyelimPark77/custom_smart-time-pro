package com.jieli.jl_rcsp.model.command.speech;

import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.parameter.StopSpeechParam;
import com.jieli.jl_rcsp.model.response.StopSpeechResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StopSpeechCmd extends CommandWithParamAndResponse<StopSpeechParam, StopSpeechResponse> {

    public static class ReplyParam extends StopSpeechParam {
        private boolean isPlayTTS;
        private boolean isSyncIatText;
        private boolean isSyncNlpText;

        public ReplyParam(boolean r1, boolean r2, boolean r3) {
            this.isSyncIatText = r1;
            this.isSyncNlpText = r2;
            this.isPlayTTS = r3;
        }

        @Override // com.jieli.jl_rcsp.model.parameter.StopSpeechParam, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            boolean r0 = this.isSyncIatText;
            return new byte[]{(byte) (((r0 ? 1 : 0) + ((this.isSyncNlpText ? 1 : 0) << 1)) + ((this.isPlayTTS ? 1 : 0) << 2))};
        }
    }

    public StopSpeechCmd(StopSpeechParam r3) {
        super(5, StopSpeechCmd.class.getSimpleName(), r3);
    }
}
