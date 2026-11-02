package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyPhoneNumberPlayModeParam extends BaseParameter {
    private int mode;

    public NotifyPhoneNumberPlayModeParam() {
    }

    public int getMode() {
        return this.mode;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{CHexConver.intToByte(this.mode)};
    }

    public NotifyPhoneNumberPlayModeParam setMode(int r1) {
        this.mode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "NotifyPhoneNumberPlayModeParam{mode=" + this.mode + "} " + super.toString();
    }

    public NotifyPhoneNumberPlayModeParam(int r1) {
        setMode(r1);
    }
}
