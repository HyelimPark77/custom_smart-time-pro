package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxListItem implements Serializable {

    @aa1
    private final String category;
    private final long fs_id;
    private final int isdir;
    private final long local_mtime;

    @aa1
    private final String path;
    private final long server_ctime;

    @aa1
    private final String server_filename;
    private final int size;

    public TeraBoxListItem() {
        this(0L, null, 0L, 0L, null, 0, 0, null, 255, null);
    }

    public static /* synthetic */ TeraBoxListItem copy$default(TeraBoxListItem teraBoxListItem, long j, String str, long j2, long j3, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = teraBoxListItem.fs_id;
        }
        long j4 = j;
        if ((i3 & 2) != 0) {
            str = teraBoxListItem.category;
        }
        return teraBoxListItem.copy(j4, str, (i3 & 4) != 0 ? teraBoxListItem.local_mtime : j2, (i3 & 8) != 0 ? teraBoxListItem.server_ctime : j3, (i3 & 16) != 0 ? teraBoxListItem.server_filename : str2, (i3 & 32) != 0 ? teraBoxListItem.size : i, (i3 & 64) != 0 ? teraBoxListItem.isdir : i2, (i3 & 128) != 0 ? teraBoxListItem.path : str3);
    }

    public final long component1() {
        return this.fs_id;
    }

    @aa1
    public final String component2() {
        return this.category;
    }

    public final long component3() {
        return this.local_mtime;
    }

    public final long component4() {
        return this.server_ctime;
    }

    @aa1
    public final String component5() {
        return this.server_filename;
    }

    public final int component6() {
        return this.size;
    }

    public final int component7() {
        return this.isdir;
    }

    @aa1
    public final String component8() {
        return this.path;
    }

    @aa1
    public final TeraBoxListItem copy(long j, @aa1 String category, long j2, long j3, @aa1 String server_filename, int i, int i2, @aa1 String path) {
        Intrinsics.X0O(category, "category");
        Intrinsics.X0O(server_filename, "server_filename");
        Intrinsics.X0O(path, "path");
        return new TeraBoxListItem(j, category, j2, j3, server_filename, i, i2, path);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeraBoxListItem)) {
            return false;
        }
        TeraBoxListItem teraBoxListItem = (TeraBoxListItem) obj;
        return this.fs_id == teraBoxListItem.fs_id && Intrinsics.XOO0ii0(this.category, teraBoxListItem.category) && this.local_mtime == teraBoxListItem.local_mtime && this.server_ctime == teraBoxListItem.server_ctime && Intrinsics.XOO0ii0(this.server_filename, teraBoxListItem.server_filename) && this.size == teraBoxListItem.size && this.isdir == teraBoxListItem.isdir && Intrinsics.XOO0ii0(this.path, teraBoxListItem.path);
    }

    @aa1
    public final String getCategory() {
        return this.category;
    }

    public final long getFs_id() {
        return this.fs_id;
    }

    public final int getIsdir() {
        return this.isdir;
    }

    public final long getLocal_mtime() {
        return this.local_mtime;
    }

    @aa1
    public final String getPath() {
        return this.path;
    }

    public final long getServer_ctime() {
        return this.server_ctime;
    }

    @aa1
    public final String getServer_filename() {
        return this.server_filename;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.fs_id) * 31) + this.category.hashCode()) * 31) + Long.hashCode(this.local_mtime)) * 31) + Long.hashCode(this.server_ctime)) * 31) + this.server_filename.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.isdir)) * 31) + this.path.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxListItem(fs_id=" + this.fs_id + ", category=" + this.category + ", local_mtime=" + this.local_mtime + ", server_ctime=" + this.server_ctime + ", server_filename=" + this.server_filename + ", size=" + this.size + ", isdir=" + this.isdir + ", path=" + this.path + I000IiI1O.C2156iO.f1007iO;
    }

    public TeraBoxListItem(long j, @aa1 String category, long j2, long j3, @aa1 String server_filename, int i, int i2, @aa1 String path) {
        Intrinsics.X0O(category, "category");
        Intrinsics.X0O(server_filename, "server_filename");
        Intrinsics.X0O(path, "path");
        this.fs_id = j;
        this.category = category;
        this.local_mtime = j2;
        this.server_ctime = j3;
        this.server_filename = server_filename;
        this.size = i;
        this.isdir = i2;
        this.path = path;
    }

    public /* synthetic */ TeraBoxListItem(long j, String str, long j2, long j3, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) == 0 ? j3 : 0L, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) == 0 ? i2 : 0, (i3 & 128) != 0 ? "" : str3);
    }
}
