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

    public AccountIntegralData(@aa1 List<IntegralContentData> content) {
        Intrinsics.X0O(content, "content");
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountIntegralData copy$default(AccountIntegralData accountIntegralData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountIntegralData.content;
        }
        return accountIntegralData.copy(list);
    }

    @aa1
    public final List<IntegralContentData> component1() {
        return this.content;
    }

    @aa1
    public final AccountIntegralData copy(@aa1 List<IntegralContentData> content) {
        Intrinsics.X0O(content, "content");
        return new AccountIntegralData(content);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountIntegralData) && Intrinsics.XOO0ii0(this.content, ((AccountIntegralData) obj).content);
    }

    @aa1
    public final List<IntegralContentData> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public final void setContent(@aa1 List<IntegralContentData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.content = list;
    }

    @aa1
    public String toString() {
        return "AccountIntegralData(content=" + this.content + I000IiI1O.C2156iO.f1007iO;
    }
}
