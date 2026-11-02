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

    public Stream(@aa1 String url) {
        Intrinsics.X0O(url, "url");
        this.url = url;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stream.url;
        }
        return stream.copy(str);
    }

    @aa1
    public final String component1() {
        return this.url;
    }

    @aa1
    public final Stream copy(@aa1 String url) {
        Intrinsics.X0O(url, "url");
        return new Stream(url);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Stream) && Intrinsics.XOO0ii0(this.url, ((Stream) obj).url);
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
        return "Stream(url=" + this.url + I000IiI1O.C2156iO.f1007iO;
    }
}
