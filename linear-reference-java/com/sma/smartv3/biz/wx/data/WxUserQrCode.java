package com.sma.smartv3.biz.wx.data;

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

    public static /* synthetic */ WxUserQrCode copy$default(WxUserQrCode r0, WxQrCode r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.qrcode;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final WxQrCode component1() {
        return this.qrcode;
    }

    @aa1
    public final WxUserQrCode copy(@aa1 WxQrCode r2) {
        Intrinsics.X0O(r2, "qrcode");
        return new WxUserQrCode(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WxUserQrCode) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.qrcode, ((WxUserQrCode) r4).qrcode) == true) goto L11;
        return false;
    L11:
        return true;
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
        return "WxUserQrCode(qrcode=" + this.qrcode + I000IiI1O.iO.iO;
    }

    public WxUserQrCode(@aa1 WxQrCode r2) {
        Intrinsics.X0O(r2, "qrcode");
        this.qrcode = r2;
    }

    public /* synthetic */ WxUserQrCode(WxQrCode r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L5;
        r2 = new WxQrCode(0, null, 3, null);
    L5:
        this(r2);
    }
}
