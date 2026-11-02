package com.sma.smartv3.biz.wx.data;

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
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WxQrCode copy$default(WxQrCode r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.len;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.buffer;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.len;
    }

    @aa1
    public final String component2() {
        return this.buffer;
    }

    @aa1
    public final WxQrCode copy(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "buffer");
        return new WxQrCode(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxQrCode) == true) goto L8;
        return false;
    L8:
        WxQrCode r6 = (WxQrCode) r5;
        if (this.len == r6.len) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.buffer, r6.buffer) == true) goto L14;
        return false;
    L14:
        return true;
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
        return "WxQrCode(len=" + this.len + ", buffer=" + this.buffer + I000IiI1O.iO.iO;
    }

    public WxQrCode(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "buffer");
        this.len = r2;
        this.buffer = r3;
    }

    public /* synthetic */ WxQrCode(int r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
