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

    public AccountOrderData(@aa1 List<OrderContentData> content) {
        Intrinsics.X0O(content, "content");
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountOrderData copy$default(AccountOrderData accountOrderData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountOrderData.content;
        }
        return accountOrderData.copy(list);
    }

    @aa1
    public final List<OrderContentData> component1() {
        return this.content;
    }

    @aa1
    public final AccountOrderData copy(@aa1 List<OrderContentData> content) {
        Intrinsics.X0O(content, "content");
        return new AccountOrderData(content);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountOrderData) && Intrinsics.XOO0ii0(this.content, ((AccountOrderData) obj).content);
    }

    @aa1
    public final List<OrderContentData> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public final void setContent(@aa1 List<OrderContentData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.content = list;
    }

    @aa1
    public String toString() {
        return "AccountOrderData(content=" + this.content + I000IiI1O.C2156iO.f1007iO;
    }
}
