package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes18.dex */
public final class WxResponse<T> {
    private int Code;

    @tb1
    private final T Data;

    @aa1
    private final String Text;

    public WxResponse() {
        this.Text = "";
    }

    public final int getCode() {
        return this.Code;
    }

    @tb1
    public final T getData() {
        return this.Data;
    }

    @aa1
    public final String getText() {
        return this.Text;
    }

    public final void setCode(int r1) {
        this.Code = r1;
    }

    @aa1
    public String toString() {
        return "WxResponse(Code=" + this.Code + ", Text=" + this.Text + ", Data=" + this.Data + I000IiI1O.iO.iO;
    }
}
