package com.sma.smartv3.biz.wx.data;

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
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ WxLoginStatus copy$default(WxLoginStatus r0, String r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.expiryTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.loginErrMsg;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.loginState;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final WxLoginStatus copy(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "expiryTime");
        Intrinsics.X0O(r3, "loginErrMsg");
        return new WxLoginStatus(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxLoginStatus) == true) goto L8;
        return false;
    L8:
        WxLoginStatus r6 = (WxLoginStatus) r5;
        if (Intrinsics.XOO0ii0(this.expiryTime, r6.expiryTime) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.loginErrMsg, r6.loginErrMsg) == true) goto L15;
        return false;
    L15:
        if (this.loginState == r6.loginState) goto L17;
        return false;
    L17:
        return true;
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
        return "WxLoginStatus(expiryTime=" + this.expiryTime + ", loginErrMsg=" + this.loginErrMsg + ", loginState=" + this.loginState + I000IiI1O.iO.iO;
    }

    public WxLoginStatus(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "expiryTime");
        Intrinsics.X0O(r3, "loginErrMsg");
        this.expiryTime = r2;
        this.loginErrMsg = r3;
        this.loginState = r4;
    }

    public /* synthetic */ WxLoginStatus(String r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = -1;
    L11:
        this(r2, r3, r4);
    }
}
