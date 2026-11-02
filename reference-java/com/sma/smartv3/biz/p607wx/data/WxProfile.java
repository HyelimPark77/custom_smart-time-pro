package com.sma.smartv3.biz.p607wx.data;

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

    public WxProfile(@aa1 WxUserInfo userInfo, @aa1 WxUserInfoExt userInfoExt) {
        Intrinsics.X0O(userInfo, "userInfo");
        Intrinsics.X0O(userInfoExt, "userInfoExt");
        this.userInfo = userInfo;
        this.userInfoExt = userInfoExt;
    }

    public static /* synthetic */ WxProfile copy$default(WxProfile wxProfile, WxUserInfo wxUserInfo, WxUserInfoExt wxUserInfoExt, int i, Object obj) {
        if ((i & 1) != 0) {
            wxUserInfo = wxProfile.userInfo;
        }
        if ((i & 2) != 0) {
            wxUserInfoExt = wxProfile.userInfoExt;
        }
        return wxProfile.copy(wxUserInfo, wxUserInfoExt);
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
    public final WxProfile copy(@aa1 WxUserInfo userInfo, @aa1 WxUserInfoExt userInfoExt) {
        Intrinsics.X0O(userInfo, "userInfo");
        Intrinsics.X0O(userInfoExt, "userInfoExt");
        return new WxProfile(userInfo, userInfoExt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxProfile)) {
            return false;
        }
        WxProfile wxProfile = (WxProfile) obj;
        return Intrinsics.XOO0ii0(this.userInfo, wxProfile.userInfo) && Intrinsics.XOO0ii0(this.userInfoExt, wxProfile.userInfoExt);
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
        return "WxProfile(userInfo=" + this.userInfo + ", userInfoExt=" + this.userInfoExt + I000IiI1O.C2156iO.f1007iO;
    }
}
