package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes18.dex */
public final class HykyResponse<T> {
    private int code;

    @tb1
    private final T data;

    @aa1
    private final String message = "";

    public final int getCode() {
        return this.code;
    }

    @tb1
    public final T getData() {
        return this.data;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @aa1
    public String toString() {
        return "Response(code = " + this.code + ", message='" + this.message + "', data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }
}
