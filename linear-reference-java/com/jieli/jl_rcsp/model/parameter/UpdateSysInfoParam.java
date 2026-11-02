package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateSysInfoParam extends BaseParameter {
    private List<AttrBean> attrBeanList;
    private byte function;

    public UpdateSysInfoParam(byte r1, List<AttrBean> r2) {
        setAttrBeanList(r2);
        setFunction(r1);
    }

    public List<AttrBean> getAttrBeanList() {
        return this.attrBeanList;
    }

    public byte getFunction() {
        return this.function;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        ArrayList r0 = new ArrayList();
        Iterator<AttrBean> r1 = this.attrBeanList.iterator();
        int r3 = 0;
    L4:
        if (r1.hasNext() == false) goto L6;
        byte[] r4 = r1.next().getData();
        r0.add(r4);
        r3 = r3 + r4.length;
        goto L4
    L6:
        byte[] r2 = new byte[r3];
        Iterator r5 = r0.iterator();
        int r6 = 0;
    L8:
        if (r5.hasNext() == false) goto L10;
        byte[] r7 = (byte[]) r5.next();
        System.arraycopy(r7, 0, r2, r6, r7.length);
        r6 = r6 + r7.length;
        goto L8
    L10:
        return r2;
    }

    public UpdateSysInfoParam setAttrBeanList(List<AttrBean> r1) {
        this.attrBeanList = r1;
        return this;
    }

    public UpdateSysInfoParam setFunction(byte r1) {
        this.function = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "UpdateSysInfoParam{attrBeanList=" + this.attrBeanList + ", function=" + this.function + "} " + super.toString();
    }
}
