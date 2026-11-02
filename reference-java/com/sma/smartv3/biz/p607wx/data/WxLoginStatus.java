package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxLoginStatus extends JsonFieldContainer implements Serializable {

    @aa1
    private final String expiryTime;

    @aa1
    private final String loginErrMsg;
    private final int loginState;

    public WxLoginStatus() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ WxLoginStatus copy$default(WxLoginStatus wxLoginStatus, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wxLoginStatus.expiryTime;
        }
        if ((i2 & 2) != 0) {
            str2 = wxLoginStatus.loginErrMsg;
        }
        if ((i2 & 4) != 0) {
            i = wxLoginStatus.loginState;
        }
        return wxLoginStatus.copy(str, str2, i);
    }

    @aa1
    public final String component1() {
        return this.expiryTime;
    }

    @aa1
    public final String component2() {
        return this.loginErrMsg;
    }

    public final int component3() {
        return this.loginState;
    }

    @aa1
    public final WxLoginStatus copy(@aa1 String expiryTime, @aa1 String loginErrMsg, int i) {
        Intrinsics.X0O(expiryTime, "expiryTime");
        Intrinsics.X0O(loginErrMsg, "loginErrMsg");
        return new WxLoginStatus(expiryTime, loginErrMsg, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxLoginStatus)) {
            return false;
        }
        WxLoginStatus wxLoginStatus = (WxLoginStatus) obj;
        return Intrinsics.XOO0ii0(this.expiryTime, wxLoginStatus.expiryTime) && Intrinsics.XOO0ii0(this.loginErrMsg, wxLoginStatus.loginErrMsg) && this.loginState == wxLoginStatus.loginState;
    }

    @aa1
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @aa1
    public final String getLoginErrMsg() {
        return this.loginErrMsg;
    }

    public final int getLoginState() {
        return this.loginState;
    }

    public int hashCode() {
        return (((this.expiryTime.hashCode() * 31) + this.loginErrMsg.hashCode()) * 31) + Integer.hashCode(this.loginState);
    }

    @aa1
    public String toString() {
        return "WxLoginStatus(expiryTime=" + this.expiryTime + ", loginErrMsg=" + this.loginErrMsg + ", loginState=" + this.loginState + I000IiI1O.C2156iO.f1007iO;
    }

    public WxLoginStatus(@aa1 String expiryTime, @aa1 String loginErrMsg, int i) {
        Intrinsics.X0O(expiryTime, "expiryTime");
        Intrinsics.X0O(loginErrMsg, "loginErrMsg");
        this.expiryTime = expiryTime;
        this.loginErrMsg = loginErrMsg;
        this.loginState = i;
    }

    public /* synthetic */ WxLoginStatus(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i);
    }
}
