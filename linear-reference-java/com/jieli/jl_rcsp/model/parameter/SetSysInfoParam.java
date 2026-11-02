package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SetSysInfoParam extends BaseParameter {
    private List<AttrBean> attrBeanList;
    private byte function;

    public SetSysInfoParam(byte r1, List<AttrBean> r2) {
        this.attrBeanList = r2;
        this.function = r1;
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
        int r2 = 1;
        byte[] r5 = new byte[r3 + 1];
        r5[0] = this.function;
        Iterator r6 = r0.iterator();
    L8:
        if (r6.hasNext() == false) goto L10;
        byte[] r7 = (byte[]) r6.next();
        System.arraycopy(r7, 0, r5, r2, r7.length);
        r2 = r2 + r7.length;
        goto L8
    L10:
        return r5;
    }

    public SetSysInfoParam setAttrBeanList(List<AttrBean> r1) {
        this.attrBeanList = r1;
        return this;
    }

    public SetSysInfoParam setFunction(byte r1) {
        this.function = r1;
        return this;
    }
}
