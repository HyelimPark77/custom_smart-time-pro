package com.sma.smartv3.biz.ad;

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

    public ADPAdError(@aa1 AdError r2) {
        Intrinsics.X0O(r2, "error");
        this.code = r2.getCode();
        this.msg = r2.getMessage();
    }

    @tb1
    public final String getCode() {
        return this.code;
    }

    @tb1
    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(@tb1 String r1) {
        this.code = r1;
    }

    public final void setMsg(@tb1 String r1) {
        this.msg = r1;
    }

    public ADPAdError(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "code");
        Intrinsics.X0O(r3, "msg");
        this.code = r2;
        this.msg = r3;
    }
}
