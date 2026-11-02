package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ServerOSSMusicItem implements Serializable {
    private final int isdir;

    @aa1
    private final String path;

    @aa1
    private final String title;

    public ServerOSSMusicItem() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ServerOSSMusicItem copy$default(ServerOSSMusicItem r0, String r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.path;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.title;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.isdir;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.path;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.isdir;
    }

    @aa1
    public final ServerOSSMusicItem copy(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "path");
        Intrinsics.X0O(r3, "title");
        return new ServerOSSMusicItem(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ServerOSSMusicItem) == true) goto L8;
        return false;
    L8:
        ServerOSSMusicItem r6 = (ServerOSSMusicItem) r5;
        if (Intrinsics.XOO0ii0(this.path, r6.path) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.title, r6.title) == true) goto L15;
        return false;
    L15:
        if (this.isdir == r6.isdir) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getIsdir() {
        return this.isdir;
    }

    @aa1
    public final String getPath() {
        return this.path;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.isdir);
    }

    @aa1
    public String toString() {
        return "ServerOSSMusicItem(path=" + this.path + ", title=" + this.title + ", isdir=" + this.isdir + I000IiI1O.iO.iO;
    }

    public ServerOSSMusicItem(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "path");
        Intrinsics.X0O(r3, "title");
        this.path = r2;
        this.title = r3;
        this.isdir = r4;
    }

    public /* synthetic */ ServerOSSMusicItem(String r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
