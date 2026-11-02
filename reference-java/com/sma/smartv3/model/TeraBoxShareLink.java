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

    public static /* synthetic */ TeraBoxShareLink copy$default(TeraBoxShareLink teraBoxShareLink, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teraBoxShareLink.shareUrl;
        }
        return teraBoxShareLink.copy(str);
    }

    @aa1
    public final String component1() {
        return this.shareUrl;
    }

    @aa1
    public final TeraBoxShareLink copy(@aa1 String shareUrl) {
        Intrinsics.X0O(shareUrl, "shareUrl");
        return new TeraBoxShareLink(shareUrl);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeraBoxShareLink) && Intrinsics.XOO0ii0(this.shareUrl, ((TeraBoxShareLink) obj).shareUrl);
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
        return "TeraBoxShareLink(shareUrl=" + this.shareUrl + I000IiI1O.C2156iO.f1007iO;
    }

    public TeraBoxShareLink(@aa1 String shareUrl) {
        Intrinsics.X0O(shareUrl, "shareUrl");
        this.shareUrl = shareUrl;
    }

    public /* synthetic */ TeraBoxShareLink(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
