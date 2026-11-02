package com.sma.smartv3.biz.wx.data;

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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxUserInfo copy$default(WxUserInfo r0, WxString r1, WxString r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.userName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.nickName;
    L9:
        return r0.copy(r1, r2);
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
    public final WxUserInfo copy(@aa1 WxString r2, @aa1 WxString r3) {
        Intrinsics.X0O(r2, "userName");
        Intrinsics.X0O(r3, "nickName");
        return new WxUserInfo(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxUserInfo) == true) goto L8;
        return false;
    L8:
        WxUserInfo r6 = (WxUserInfo) r5;
        if (Intrinsics.XOO0ii0(this.userName, r6.userName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.nickName, r6.nickName) == true) goto L14;
        return false;
    L14:
        return true;
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
        return "WxUserInfo(userName=" + this.userName + ", nickName=" + this.nickName + I000IiI1O.iO.iO;
    }

    public WxUserInfo(@aa1 WxString r2, @aa1 WxString r3) {
        Intrinsics.X0O(r2, "userName");
        Intrinsics.X0O(r3, "nickName");
        this.userName = r2;
        this.nickName = r3;
    }

    public /* synthetic */ WxUserInfo(WxString r3, WxString r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = new WxString(null, 1, null);
    L6:
        if ((r5 & 2) == 0) goto L8;
        r4 = new WxString(null, 1, null);
    L8:
        this(r3, r4);
    }
}
