package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransmissionMusicItem copy$default(TransmissionMusicItem transmissionMusicItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transmissionMusicItem.path;
        }
        if ((i & 2) != 0) {
            str2 = transmissionMusicItem.url;
        }
        if ((i & 4) != 0) {
            str3 = transmissionMusicItem.uri;
        }
        if ((i & 8) != 0) {
            str4 = transmissionMusicItem.title;
        }
        return transmissionMusicItem.copy(str, str2, str3, str4);
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
    public final TransmissionMusicItem copy(@aa1 String path, @aa1 String url, @aa1 String uri, @aa1 String title) {
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(uri, "uri");
        Intrinsics.X0O(title, "title");
        return new TransmissionMusicItem(path, url, uri, title);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransmissionMusicItem)) {
            return false;
        }
        TransmissionMusicItem transmissionMusicItem = (TransmissionMusicItem) obj;
        return Intrinsics.XOO0ii0(this.path, transmissionMusicItem.path) && Intrinsics.XOO0ii0(this.url, transmissionMusicItem.url) && Intrinsics.XOO0ii0(this.uri, transmissionMusicItem.uri) && Intrinsics.XOO0ii0(this.title, transmissionMusicItem.title);
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
        return "TransmissionMusicItem(path=" + this.path + ", url=" + this.url + ", uri=" + this.uri + ", title=" + this.title + I000IiI1O.C2156iO.f1007iO;
    }

    public TransmissionMusicItem(@aa1 String path, @aa1 String url, @aa1 String uri, @aa1 String title) {
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(uri, "uri");
        Intrinsics.X0O(title, "title");
        this.path = path;
        this.url = url;
        this.uri = uri;
        this.title = title;
    }

    public /* synthetic */ TransmissionMusicItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
