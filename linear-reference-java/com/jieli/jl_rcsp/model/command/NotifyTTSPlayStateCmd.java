package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyTTSPlayStateCmd extends CommandWithParam<Param> {

    public static class Param extends BaseParameter {
        private int ttsState;

        public Param(int r1) {
            this.ttsState = r1;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{CHexConver.intToByte(this.ttsState)};
        }
    }

    public NotifyTTSPlayStateCmd(Param r3) {
        super(17, NotifyTTSPlayStateCmd.class.getSimpleName(), r3);
    }
}
