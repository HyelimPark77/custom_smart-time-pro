package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxUserInfo extends JsonFieldContainer implements Serializable {

    @aa1
    private final WxString nickName;

    @aa1
    private final WxString userName;

    /* JADX WARN: Multi-variable type inference failed */
    public WxUserInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxUserInfo copy$default(WxUserInfo wxUserInfo, WxString wxString, WxString wxString2, int i, Object obj) {
        if ((i & 1) != 0) {
            wxString = wxUserInfo.userName;
        }
        if ((i & 2) != 0) {
            wxString2 = wxUserInfo.nickName;
        }
        return wxUserInfo.copy(wxString, wxString2);
    }

    @aa1
    public final WxString component1() {
        return this.userName;
    }

    @aa1
    public final WxString component2() {
        return this.nickName;
    }

    @aa1
    public final WxUserInfo copy(@aa1 WxString userName, @aa1 WxString nickName) {
        Intrinsics.X0O(userName, "userName");
        Intrinsics.X0O(nickName, "nickName");
        return new WxUserInfo(userName, nickName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxUserInfo)) {
            return false;
        }
        WxUserInfo wxUserInfo = (WxUserInfo) obj;
        return Intrinsics.XOO0ii0(this.userName, wxUserInfo.userName) && Intrinsics.XOO0ii0(this.nickName, wxUserInfo.nickName);
    }

    @aa1
    public final WxString getNickName() {
        return this.nickName;
    }

    @aa1
    public final WxString getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (this.userName.hashCode() * 31) + this.nickName.hashCode();
    }

    @aa1
    public String toString() {
        return "WxUserInfo(userName=" + this.userName + ", nickName=" + this.nickName + I000IiI1O.C2156iO.f1007iO;
    }

    public WxUserInfo(@aa1 WxString userName, @aa1 WxString nickName) {
        Intrinsics.X0O(userName, "userName");
        Intrinsics.X0O(nickName, "nickName");
        this.userName = userName;
        this.nickName = nickName;
    }

    public /* synthetic */ WxUserInfo(WxString wxString, WxString wxString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WxString(null, 1, null) : wxString, (i & 2) != 0 ? new WxString(null, 1, null) : wxString2);
    }
}
