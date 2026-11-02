package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TransmissionMusicItem {

    @aa1
    private final String path;

    @aa1
    private final String title;

    @aa1
    private final String uri;

    @aa1
    private final String url;

    public TransmissionMusicItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ TransmissionMusicItem copy$default(TransmissionMusicItem r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.path;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.url;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.uri;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.title;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.path;
    }

    @aa1
    public final String component2() {
        return this.url;
    }

    @aa1
    public final String component3() {
        return this.uri;
    }

    @aa1
    public final String component4() {
        return this.title;
    }

    @aa1
    public final TransmissionMusicItem copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "path");
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, ShareConstants.MEDIA_URI);
        Intrinsics.X0O(r5, "title");
        return new TransmissionMusicItem(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TransmissionMusicItem) == true) goto L8;
        return false;
    L8:
        TransmissionMusicItem r6 = (TransmissionMusicItem) r5;
        if (Intrinsics.XOO0ii0(this.path, r6.path) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.url, r6.url) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.uri, r6.uri) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.title, r6.title) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getPath() {
        return this.path;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @aa1
    public final String getUri() {
        return this.uri;
    }

    @aa1
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.path.hashCode() * 31) + this.url.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.title.hashCode();
    }

    @aa1
    public String toString() {
        return "TransmissionMusicItem(path=" + this.path + ", url=" + this.url + ", uri=" + this.uri + ", title=" + this.title + I000IiI1O.iO.iO;
    }

    public TransmissionMusicItem(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "path");
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, ShareConstants.MEDIA_URI);
        Intrinsics.X0O(r5, "title");
        this.path = r2;
        this.url = r3;
        this.uri = r4;
        this.title = r5;
    }

    public /* synthetic */ TransmissionMusicItem(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
