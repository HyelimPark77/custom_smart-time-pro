package com.sma.smartv3.biz.p242ad;

import com.adp.sdk.dto.AdError;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAdError {

    @tb1
    private String code;

    @tb1
    private String msg;

    public ADPAdError(@aa1 AdError error) {
        Intrinsics.X0O(error, "error");
        this.code = error.getCode();
        this.msg = error.getMessage();
    }

    @tb1
    public final String getCode() {
        return this.code;
    }

    @tb1
    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(@tb1 String str) {
        this.code = str;
    }

    public final void setMsg(@tb1 String str) {
        this.msg = str;
    }

    public ADPAdError(@aa1 String code, @aa1 String msg) {
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(msg, "msg");
        this.code = code;
        this.msg = msg;
    }
}
