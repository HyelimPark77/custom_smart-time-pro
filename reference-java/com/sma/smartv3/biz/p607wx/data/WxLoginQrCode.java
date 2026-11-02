package com.sma.smartv3.biz.p607wx.data;

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
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WxLoginQrCode copy$default(WxLoginQrCode wxLoginQrCode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wxLoginQrCode.Key;
        }
        if ((i & 2) != 0) {
            str2 = wxLoginQrCode.QrCodeUrl;
        }
        if ((i & 4) != 0) {
            str3 = wxLoginQrCode.Txt;
        }
        return wxLoginQrCode.copy(str, str2, str3);
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
    public final WxLoginQrCode copy(@aa1 String Key, @aa1 String QrCodeUrl, @aa1 String Txt) {
        Intrinsics.X0O(Key, "Key");
        Intrinsics.X0O(QrCodeUrl, "QrCodeUrl");
        Intrinsics.X0O(Txt, "Txt");
        return new WxLoginQrCode(Key, QrCodeUrl, Txt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxLoginQrCode)) {
            return false;
        }
        WxLoginQrCode wxLoginQrCode = (WxLoginQrCode) obj;
        return Intrinsics.XOO0ii0(this.Key, wxLoginQrCode.Key) && Intrinsics.XOO0ii0(this.QrCodeUrl, wxLoginQrCode.QrCodeUrl) && Intrinsics.XOO0ii0(this.Txt, wxLoginQrCode.Txt);
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
        return "WxLoginQrCode(Key=" + this.Key + ", QrCodeUrl=" + this.QrCodeUrl + ", Txt=" + this.Txt + I000IiI1O.C2156iO.f1007iO;
    }

    public WxLoginQrCode(@aa1 String Key, @aa1 String QrCodeUrl, @aa1 String Txt) {
        Intrinsics.X0O(Key, "Key");
        Intrinsics.X0O(QrCodeUrl, "QrCodeUrl");
        Intrinsics.X0O(Txt, "Txt");
        this.Key = Key;
        this.QrCodeUrl = QrCodeUrl;
        this.Txt = Txt;
    }

    public /* synthetic */ WxLoginQrCode(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
