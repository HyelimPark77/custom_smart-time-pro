package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxUserQrCode extends JsonFieldContainer implements Serializable {

    @aa1
    private final WxQrCode qrcode;

    /* JADX WARN: Multi-variable type inference failed */
    public WxUserQrCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxUserQrCode copy$default(WxUserQrCode wxUserQrCode, WxQrCode wxQrCode, int i, Object obj) {
        if ((i & 1) != 0) {
            wxQrCode = wxUserQrCode.qrcode;
        }
        return wxUserQrCode.copy(wxQrCode);
    }

    @aa1
    public final WxQrCode component1() {
        return this.qrcode;
    }

    @aa1
    public final WxUserQrCode copy(@aa1 WxQrCode qrcode) {
        Intrinsics.X0O(qrcode, "qrcode");
        return new WxUserQrCode(qrcode);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WxUserQrCode) && Intrinsics.XOO0ii0(this.qrcode, ((WxUserQrCode) obj).qrcode);
    }

    @aa1
    public final WxQrCode getQrcode() {
        return this.qrcode;
    }

    public int hashCode() {
        return this.qrcode.hashCode();
    }

    @aa1
    public String toString() {
        return "WxUserQrCode(qrcode=" + this.qrcode + I000IiI1O.C2156iO.f1007iO;
    }

    public WxUserQrCode(@aa1 WxQrCode qrcode) {
        Intrinsics.X0O(qrcode, "qrcode");
        this.qrcode = qrcode;
    }

    public /* synthetic */ WxUserQrCode(WxQrCode wxQrCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WxQrCode(0, null, 3, null) : wxQrCode);
    }
}
