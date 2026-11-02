package com.jieli.jl_rcsp.model.parameter;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class PhoneCallRequestParam extends BaseParameter {
    public static final int TYPE_LAST_NUMBER = 0;
    public static final int TYPE_SPECIAL_NUMBER = 1;
    private String number;
    private int type;

    public PhoneCallRequestParam(String r1) {
        this.number = r1;
    }

    public String getNumber() {
        return this.number;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        if (TextUtils.isEmpty(this.number) == true) goto L5;
        byte[] r0 = this.number.getBytes();
        byte[] r3 = new byte[r0.length + 1];
        r3[0] = 1;
        System.arraycopy(r0, 0, r3, 1, r0.length);
        return r3;
    L5:
        return new byte[]{0};
    }

    public int getType() {
        return this.type;
    }

    public PhoneCallRequestParam setNumber(String r1) {
        this.number = r1;
        return this;
    }

    public PhoneCallRequestParam setType(int r1) {
        this.type = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "PhoneCallRequestParam{type=" + this.type + ", number='" + this.number + '\'' + i0XO1.IO;
    }
}
