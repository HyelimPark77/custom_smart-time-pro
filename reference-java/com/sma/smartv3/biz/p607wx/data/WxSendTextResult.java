package com.sma.smartv3.biz.p607wx.data;

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
        this(false, 1, null);
    }

    public static /* synthetic */ WxSendTextResult copy$default(WxSendTextResult wxSendTextResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wxSendTextResult.isSendSuccess;
        }
        return wxSendTextResult.copy(z);
    }

    public final boolean component1() {
        return this.isSendSuccess;
    }

    @aa1
    public final WxSendTextResult copy(boolean z) {
        return new WxSendTextResult(z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WxSendTextResult) && this.isSendSuccess == ((WxSendTextResult) obj).isSendSuccess;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSendSuccess);
    }

    public final boolean isSendSuccess() {
        return this.isSendSuccess;
    }

    @aa1
    public String toString() {
        return "WxSendTextResult(isSendSuccess=" + this.isSendSuccess + I000IiI1O.C2156iO.f1007iO;
    }

    public WxSendTextResult(boolean z) {
        this.isSendSuccess = z;
    }

    public /* synthetic */ WxSendTextResult(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
