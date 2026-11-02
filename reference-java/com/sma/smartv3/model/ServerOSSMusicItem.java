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
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ServerOSSMusicItem copy$default(ServerOSSMusicItem serverOSSMusicItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = serverOSSMusicItem.path;
        }
        if ((i2 & 2) != 0) {
            str2 = serverOSSMusicItem.title;
        }
        if ((i2 & 4) != 0) {
            i = serverOSSMusicItem.isdir;
        }
        return serverOSSMusicItem.copy(str, str2, i);
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
    public final ServerOSSMusicItem copy(@aa1 String path, @aa1 String title, int i) {
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(title, "title");
        return new ServerOSSMusicItem(path, title, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerOSSMusicItem)) {
            return false;
        }
        ServerOSSMusicItem serverOSSMusicItem = (ServerOSSMusicItem) obj;
        return Intrinsics.XOO0ii0(this.path, serverOSSMusicItem.path) && Intrinsics.XOO0ii0(this.title, serverOSSMusicItem.title) && this.isdir == serverOSSMusicItem.isdir;
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
        return "ServerOSSMusicItem(path=" + this.path + ", title=" + this.title + ", isdir=" + this.isdir + I000IiI1O.C2156iO.f1007iO;
    }

    public ServerOSSMusicItem(@aa1 String path, @aa1 String title, int i) {
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(title, "title");
        this.path = path;
        this.title = title;
        this.isdir = i;
    }

    public /* synthetic */ ServerOSSMusicItem(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
