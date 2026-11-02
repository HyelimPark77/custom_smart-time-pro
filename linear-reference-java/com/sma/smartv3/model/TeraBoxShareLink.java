package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxShareLink {

    @aa1
    private final String shareUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public TeraBoxShareLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TeraBoxShareLink copy$default(TeraBoxShareLink r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.shareUrl;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.shareUrl;
    }

    @aa1
    public final TeraBoxShareLink copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "shareUrl");
        return new TeraBoxShareLink(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof TeraBoxShareLink) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.shareUrl, ((TeraBoxShareLink) r4).shareUrl) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        return this.shareUrl.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxShareLink(shareUrl=" + this.shareUrl + I000IiI1O.iO.iO;
    }

    public TeraBoxShareLink(@aa1 String r2) {
        Intrinsics.X0O(r2, "shareUrl");
        this.shareUrl = r2;
    }

    public /* synthetic */ TeraBoxShareLink(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
