package com.sma.smartv3.biz.wx.data;

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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxUserInfoExt copy$default(WxUserInfoExt r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.bigHeadImgUrl;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.smallHeadImgUrl;
    L9:
        return r0.copy(r1, r2);
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
    public final WxUserInfoExt copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "bigHeadImgUrl");
        Intrinsics.X0O(r3, "smallHeadImgUrl");
        return new WxUserInfoExt(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxUserInfoExt) == true) goto L8;
        return false;
    L8:
        WxUserInfoExt r6 = (WxUserInfoExt) r5;
        if (Intrinsics.XOO0ii0(this.bigHeadImgUrl, r6.bigHeadImgUrl) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.smallHeadImgUrl, r6.smallHeadImgUrl) == true) goto L14;
        return false;
    L14:
        return true;
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
        return "WxUserInfoExt(bigHeadImgUrl=" + this.bigHeadImgUrl + ", smallHeadImgUrl=" + this.smallHeadImgUrl + I000IiI1O.iO.iO;
    }

    public WxUserInfoExt(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "bigHeadImgUrl");
        Intrinsics.X0O(r3, "smallHeadImgUrl");
        this.bigHeadImgUrl = r2;
        this.smallHeadImgUrl = r3;
    }

    public /* synthetic */ WxUserInfoExt(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
