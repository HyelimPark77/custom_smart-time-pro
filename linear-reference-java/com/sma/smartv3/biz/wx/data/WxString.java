package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxString extends JsonFieldContainer implements Serializable {

    @aa1
    private final String str;

    /* JADX WARN: Multi-variable type inference failed */
    public WxString() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxString copy$default(WxString r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.str;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.str;
    }

    @aa1
    public final WxString copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "str");
        return new WxString(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WxString) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.str, ((WxString) r4).str) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getStr() {
        return this.str;
    }

    public int hashCode() {
        return this.str.hashCode();
    }

    @aa1
    public String toString() {
        return "WxString(str=" + this.str + I000IiI1O.iO.iO;
    }

    public WxString(@aa1 String r2) {
        Intrinsics.X0O(r2, "str");
        this.str = r2;
    }

    public /* synthetic */ WxString(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
