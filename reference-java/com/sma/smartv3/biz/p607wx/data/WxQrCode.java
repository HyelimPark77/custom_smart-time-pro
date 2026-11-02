package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxQrCode extends JsonFieldContainer implements Serializable {

    @aa1
    private final String buffer;
    private final int len;

    /* JADX WARN: Multi-variable type inference failed */
    public WxQrCode() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxQrCode copy$default(WxQrCode wxQrCode, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wxQrCode.len;
        }
        if ((i2 & 2) != 0) {
            str = wxQrCode.buffer;
        }
        return wxQrCode.copy(i, str);
    }

    public final int component1() {
        return this.len;
    }

    @aa1
    public final String component2() {
        return this.buffer;
    }

    @aa1
    public final WxQrCode copy(int i, @aa1 String buffer) {
        Intrinsics.X0O(buffer, "buffer");
        return new WxQrCode(i, buffer);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxQrCode)) {
            return false;
        }
        WxQrCode wxQrCode = (WxQrCode) obj;
        return this.len == wxQrCode.len && Intrinsics.XOO0ii0(this.buffer, wxQrCode.buffer);
    }

    @aa1
    public final String getBuffer() {
        return this.buffer;
    }

    public final int getLen() {
        return this.len;
    }

    public int hashCode() {
        return (Integer.hashCode(this.len) * 31) + this.buffer.hashCode();
    }

    @aa1
    public String toString() {
        return "WxQrCode(len=" + this.len + ", buffer=" + this.buffer + I000IiI1O.C2156iO.f1007iO;
    }

    public WxQrCode(int i, @aa1 String buffer) {
        Intrinsics.X0O(buffer, "buffer");
        this.len = i;
        this.buffer = buffer;
    }

    public /* synthetic */ WxQrCode(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
