package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Stream extends JsonFieldContainer implements Serializable {

    @aa1
    private final String url;

    public Stream(@aa1 String r2) {
        Intrinsics.X0O(r2, "url");
        this.url = r2;
    }

    public static /* synthetic */ Stream copy$default(Stream r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.url;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.url;
    }

    @aa1
    public final Stream copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "url");
        return new Stream(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof Stream) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.url, ((Stream) r4).url) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @aa1
    public String toString() {
        return "Stream(url=" + this.url + I000IiI1O.iO.iO;
    }
}
