package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountOrderData extends JsonFieldContainer implements Serializable {

    @aa1
    private List<OrderContentData> content;

    public AccountOrderData(@aa1 List<OrderContentData> r2) {
        Intrinsics.X0O(r2, "content");
        this.content = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountOrderData copy$default(AccountOrderData r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.content;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<OrderContentData> component1() {
        return this.content;
    }

    @aa1
    public final AccountOrderData copy(@aa1 List<OrderContentData> r2) {
        Intrinsics.X0O(r2, "content");
        return new AccountOrderData(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AccountOrderData) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.content, ((AccountOrderData) r4).content) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<OrderContentData> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public final void setContent(@aa1 List<OrderContentData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.content = r2;
    }

    @aa1
    public String toString() {
        return "AccountOrderData(content=" + this.content + I000IiI1O.iO.iO;
    }
}
