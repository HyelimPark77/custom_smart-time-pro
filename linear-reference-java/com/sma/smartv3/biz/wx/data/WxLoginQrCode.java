package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxLoginQrCode extends JsonFieldContainer implements Serializable {

    @aa1
    private final String Key;

    @aa1
    private final String QrCodeUrl;

    @aa1
    private final String Txt;

    public WxLoginQrCode() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ WxLoginQrCode copy$default(WxLoginQrCode r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.Key;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.QrCodeUrl;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.Txt;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.Key;
    }

    @aa1
    public final String component2() {
        return this.QrCodeUrl;
    }

    @aa1
    public final String component3() {
        return this.Txt;
    }

    @aa1
    public final WxLoginQrCode copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "Key");
        Intrinsics.X0O(r3, "QrCodeUrl");
        Intrinsics.X0O(r4, "Txt");
        return new WxLoginQrCode(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxLoginQrCode) == true) goto L8;
        return false;
    L8:
        WxLoginQrCode r6 = (WxLoginQrCode) r5;
        if (Intrinsics.XOO0ii0(this.Key, r6.Key) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.QrCodeUrl, r6.QrCodeUrl) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.Txt, r6.Txt) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getKey() {
        return this.Key;
    }

    @aa1
    public final String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    @aa1
    public final String getTxt() {
        return this.Txt;
    }

    public int hashCode() {
        return (((this.Key.hashCode() * 31) + this.QrCodeUrl.hashCode()) * 31) + this.Txt.hashCode();
    }

    @aa1
    public String toString() {
        return "WxLoginQrCode(Key=" + this.Key + ", QrCodeUrl=" + this.QrCodeUrl + ", Txt=" + this.Txt + I000IiI1O.iO.iO;
    }

    public WxLoginQrCode(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "Key");
        Intrinsics.X0O(r3, "QrCodeUrl");
        Intrinsics.X0O(r4, "Txt");
        this.Key = r2;
        this.QrCodeUrl = r3;
        this.Txt = r4;
    }

    public /* synthetic */ WxLoginQrCode(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
