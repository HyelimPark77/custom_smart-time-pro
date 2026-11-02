package com.sma.smartv3.biz.p607wx.data;

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

    public static /* synthetic */ WxString copy$default(WxString wxString, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wxString.str;
        }
        return wxString.copy(str);
    }

    @aa1
    public final String component1() {
        return this.str;
    }

    @aa1
    public final WxString copy(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        return new WxString(str);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WxString) && Intrinsics.XOO0ii0(this.str, ((WxString) obj).str);
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
        return "WxString(str=" + this.str + I000IiI1O.C2156iO.f1007iO;
    }

    public WxString(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        this.str = str;
    }

    public /* synthetic */ WxString(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
