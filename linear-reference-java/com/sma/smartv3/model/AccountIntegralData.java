package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountIntegralData extends JsonFieldContainer implements Serializable {

    @aa1
    private List<IntegralContentData> content;

    public AccountIntegralData(@aa1 List<IntegralContentData> r2) {
        Intrinsics.X0O(r2, "content");
        this.content = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountIntegralData copy$default(AccountIntegralData r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.content;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<IntegralContentData> component1() {
        return this.content;
    }

    @aa1
    public final AccountIntegralData copy(@aa1 List<IntegralContentData> r2) {
        Intrinsics.X0O(r2, "content");
        return new AccountIntegralData(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AccountIntegralData) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.content, ((AccountIntegralData) r4).content) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<IntegralContentData> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public final void setContent(@aa1 List<IntegralContentData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.content = r2;
    }

    @aa1
    public String toString() {
        return "AccountIntegralData(content=" + this.content + I000IiI1O.iO.iO;
    }
}
