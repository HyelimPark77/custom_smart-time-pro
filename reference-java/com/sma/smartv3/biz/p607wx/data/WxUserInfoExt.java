package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxUserInfoExt extends JsonFieldContainer implements Serializable {

    @aa1
    private final String bigHeadImgUrl;

    @aa1
    private final String smallHeadImgUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public WxUserInfoExt() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxUserInfoExt copy$default(WxUserInfoExt wxUserInfoExt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wxUserInfoExt.bigHeadImgUrl;
        }
        if ((i & 2) != 0) {
            str2 = wxUserInfoExt.smallHeadImgUrl;
        }
        return wxUserInfoExt.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.bigHeadImgUrl;
    }

    @aa1
    public final String component2() {
        return this.smallHeadImgUrl;
    }

    @aa1
    public final WxUserInfoExt copy(@aa1 String bigHeadImgUrl, @aa1 String smallHeadImgUrl) {
        Intrinsics.X0O(bigHeadImgUrl, "bigHeadImgUrl");
        Intrinsics.X0O(smallHeadImgUrl, "smallHeadImgUrl");
        return new WxUserInfoExt(bigHeadImgUrl, smallHeadImgUrl);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxUserInfoExt)) {
            return false;
        }
        WxUserInfoExt wxUserInfoExt = (WxUserInfoExt) obj;
        return Intrinsics.XOO0ii0(this.bigHeadImgUrl, wxUserInfoExt.bigHeadImgUrl) && Intrinsics.XOO0ii0(this.smallHeadImgUrl, wxUserInfoExt.smallHeadImgUrl);
    }

    @aa1
    public final String getBigHeadImgUrl() {
        return this.bigHeadImgUrl;
    }

    @aa1
    public final String getSmallHeadImgUrl() {
        return this.smallHeadImgUrl;
    }

    public int hashCode() {
        return (this.bigHeadImgUrl.hashCode() * 31) + this.smallHeadImgUrl.hashCode();
    }

    @aa1
    public String toString() {
        return "WxUserInfoExt(bigHeadImgUrl=" + this.bigHeadImgUrl + ", smallHeadImgUrl=" + this.smallHeadImgUrl + I000IiI1O.C2156iO.f1007iO;
    }

    public WxUserInfoExt(@aa1 String bigHeadImgUrl, @aa1 String smallHeadImgUrl) {
        Intrinsics.X0O(bigHeadImgUrl, "bigHeadImgUrl");
        Intrinsics.X0O(smallHeadImgUrl, "smallHeadImgUrl");
        this.bigHeadImgUrl = bigHeadImgUrl;
        this.smallHeadImgUrl = smallHeadImgUrl;
    }

    public /* synthetic */ WxUserInfoExt(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
