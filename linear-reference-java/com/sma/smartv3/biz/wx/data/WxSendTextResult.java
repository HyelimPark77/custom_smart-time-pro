package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class WxSendTextResult extends JsonFieldContainer implements Serializable {
    private final boolean isSendSuccess;

    public WxSendTextResult() {
        boolean r2 = false;
        this(r2, 1, null);
    }

    public static /* synthetic */ WxSendTextResult copy$default(WxSendTextResult r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.isSendSuccess;
    L6:
        return r0.copy(r1);
    }

    public final boolean component1() {
        return this.isSendSuccess;
    }

    @aa1
    public final WxSendTextResult copy(boolean r2) {
        return new WxSendTextResult(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WxSendTextResult) == true) goto L9;
        return false;
    L9:
        if (this.isSendSuccess == ((WxSendTextResult) r4).isSendSuccess) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSendSuccess);
    }

    public final boolean isSendSuccess() {
        return this.isSendSuccess;
    }

    @aa1
    public String toString() {
        return "WxSendTextResult(isSendSuccess=" + this.isSendSuccess + I000IiI1O.iO.iO;
    }

    public WxSendTextResult(boolean r1) {
        this.isSendSuccess = r1;
    }

    public /* synthetic */ WxSendTextResult(boolean r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
