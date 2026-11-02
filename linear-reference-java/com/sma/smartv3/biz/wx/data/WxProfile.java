package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxProfile extends JsonFieldContainer implements Serializable {

    @aa1
    private final WxUserInfo userInfo;

    @aa1
    private final WxUserInfoExt userInfoExt;

    public WxProfile(@aa1 WxUserInfo r2, @aa1 WxUserInfoExt r3) {
        Intrinsics.X0O(r2, "userInfo");
        Intrinsics.X0O(r3, "userInfoExt");
        this.userInfo = r2;
        this.userInfoExt = r3;
    }

    public static /* synthetic */ WxProfile copy$default(WxProfile r0, WxUserInfo r1, WxUserInfoExt r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.userInfo;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.userInfoExt;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final WxUserInfo component1() {
        return this.userInfo;
    }

    @aa1
    public final WxUserInfoExt component2() {
        return this.userInfoExt;
    }

    @aa1
    public final WxProfile copy(@aa1 WxUserInfo r2, @aa1 WxUserInfoExt r3) {
        Intrinsics.X0O(r2, "userInfo");
        Intrinsics.X0O(r3, "userInfoExt");
        return new WxProfile(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxProfile) == true) goto L8;
        return false;
    L8:
        WxProfile r6 = (WxProfile) r5;
        if (Intrinsics.XOO0ii0(this.userInfo, r6.userInfo) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.userInfoExt, r6.userInfoExt) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final WxUserInfo getUserInfo() {
        return this.userInfo;
    }

    @aa1
    public final WxUserInfoExt getUserInfoExt() {
        return this.userInfoExt;
    }

    public int hashCode() {
        return (this.userInfo.hashCode() * 31) + this.userInfoExt.hashCode();
    }

    @aa1
    public String toString() {
        return "WxProfile(userInfo=" + this.userInfo + ", userInfoExt=" + this.userInfoExt + I000IiI1O.iO.iO;
    }
}
