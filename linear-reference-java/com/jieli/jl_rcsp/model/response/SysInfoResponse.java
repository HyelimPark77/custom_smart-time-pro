package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SysInfoResponse extends CommonResponse {
    private List<AttrBean> attrs;
    private byte function;

    public SysInfoResponse() {
    }

    public List<AttrBean> getAttrs() {
        return this.attrs;
    }

    public byte getFunction() {
        return this.function;
    }

    public SysInfoResponse setAttrs(List<AttrBean> r1) {
        if (r1 != null) goto L4;
        r1 = new ArrayList();
    L4:
        this.attrs = r1;
        return this;
    }

    public SysInfoResponse setFunction(byte r1) {
        this.function = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "SysInfoResponse{function=" + this.function + ", attrs=" + this.attrs + "} " + super.toString();
    }
}
