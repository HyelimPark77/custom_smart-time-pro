package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AITranslationUrl implements Serializable {

    @aa1
    private String createUrl;

    @aa1
    private String shareUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AITranslationUrl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AITranslationUrl copy$default(AITranslationUrl aITranslationUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aITranslationUrl.shareUrl;
        }
        if ((i & 2) != 0) {
            str2 = aITranslationUrl.createUrl;
        }
        return aITranslationUrl.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.shareUrl;
    }

    @aa1
    public final String component2() {
        return this.createUrl;
    }

    @aa1
    public final AITranslationUrl copy(@aa1 String shareUrl, @aa1 String createUrl) {
        Intrinsics.X0O(shareUrl, "shareUrl");
        Intrinsics.X0O(createUrl, "createUrl");
        return new AITranslationUrl(shareUrl, createUrl);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITranslationUrl)) {
            return false;
        }
        AITranslationUrl aITranslationUrl = (AITranslationUrl) obj;
        return Intrinsics.XOO0ii0(this.shareUrl, aITranslationUrl.shareUrl) && Intrinsics.XOO0ii0(this.createUrl, aITranslationUrl.createUrl);
    }

    @aa1
    public final String getCreateUrl() {
        return this.createUrl;
    }

    @aa1
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        return (this.shareUrl.hashCode() * 31) + this.createUrl.hashCode();
    }

    public final void setCreateUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createUrl = str;
    }

    public final void setShareUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.shareUrl = str;
    }

    @aa1
    public String toString() {
        return "AITranslationUrl(shareUrl=" + this.shareUrl + ", createUrl=" + this.createUrl + I000IiI1O.C2156iO.f1007iO;
    }

    public AITranslationUrl(@aa1 String shareUrl, @aa1 String createUrl) {
        Intrinsics.X0O(shareUrl, "shareUrl");
        Intrinsics.X0O(createUrl, "createUrl");
        this.shareUrl = shareUrl;
        this.createUrl = createUrl;
    }

    public /* synthetic */ AITranslationUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
