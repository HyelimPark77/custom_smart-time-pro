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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AITranslationUrl copy$default(AITranslationUrl r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.shareUrl;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.createUrl;
    L9:
        return r0.copy(r1, r2);
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
    public final AITranslationUrl copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "shareUrl");
        Intrinsics.X0O(r3, "createUrl");
        return new AITranslationUrl(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AITranslationUrl) == true) goto L8;
        return false;
    L8:
        AITranslationUrl r6 = (AITranslationUrl) r5;
        if (Intrinsics.XOO0ii0(this.shareUrl, r6.shareUrl) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.createUrl, r6.createUrl) == true) goto L14;
        return false;
    L14:
        return true;
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

    public final void setCreateUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createUrl = r2;
    }

    public final void setShareUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.shareUrl = r2;
    }

    @aa1
    public String toString() {
        return "AITranslationUrl(shareUrl=" + this.shareUrl + ", createUrl=" + this.createUrl + I000IiI1O.iO.iO;
    }

    public AITranslationUrl(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "shareUrl");
        Intrinsics.X0O(r3, "createUrl");
        this.shareUrl = r2;
        this.createUrl = r3;
    }

    public /* synthetic */ AITranslationUrl(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
