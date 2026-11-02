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
        long r1 = 0;
        String r3 = null;
        long r4 = 0;
        long r6 = 0;
        String r8 = null;
        int r9 = 0;
        int r10 = 0;
        String r11 = null;
        this(r1, r3, r4, r6, r8, r9, r10, r11, 255, null);
    }

    public static /* synthetic */ TeraBoxListItem copy$default(TeraBoxListItem r12, long r13, String r15, long r16, long r18, String r20, int r21, int r22, String r23, int r24, Object r25) {
        if ((r24 & 1) == 0) goto L5;
        r13 = r12.fs_id;
    L5:
        long r1 = r13;
        if ((r24 & 2) == 0) goto L8;
        r15 = r12.category;
    L8:
        String r3 = r15;
        if ((r24 & 4) == 0) goto L11;
        long r4 = r12.local_mtime;
    L13:
        if ((r24 & 8) == 0) goto L15;
        long r6 = r12.server_ctime;
    L17:
        if ((r24 & 16) == 0) goto L19;
        String r8 = r12.server_filename;
    L21:
        if ((r24 & 32) == 0) goto L23;
        int r9 = r12.size;
    L25:
        if ((r24 & 64) == 0) goto L27;
        int r10 = r12.isdir;
    L29:
        if ((r24 & 128) == 0) goto L32;
        String r11 = r12.path;
    L34:
        return r12.copy(r1, r3, r4, r6, r8, r9, r10, r11);
    L32:
        r11 = r23;
        goto L34
    L27:
        r10 = r22;
        goto L29
    L23:
        r9 = r21;
        goto L25
    L19:
        r8 = r20;
        goto L21
    L15:
        r6 = r18;
        goto L17
    L11:
        r4 = r16;
        goto L13
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
    public final TeraBoxListItem copy(long r14, @aa1 String r16, long r17, long r19, @aa1 String r21, int r22, int r23, @aa1 String r24) {
        Intrinsics.X0O(r16, "category");
        Intrinsics.X0O(r21, "server_filename");
        Intrinsics.X0O(r24, "path");
        return new TeraBoxListItem(r14, r16, r17, r19, r21, r22, r23, r24);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TeraBoxListItem) == true) goto L8;
        return false;
    L8:
        TeraBoxListItem r9 = (TeraBoxListItem) r8;
        if (this.fs_id == r9.fs_id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.category, r9.category) == true) goto L15;
        return false;
    L15:
        if (this.local_mtime == r9.local_mtime) goto L18;
        return false;
    L18:
        if (this.server_ctime == r9.server_ctime) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.server_filename, r9.server_filename) == true) goto L24;
        return false;
    L24:
        if (this.size == r9.size) goto L27;
        return false;
    L27:
        if (this.isdir == r9.isdir) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.path, r9.path) == true) goto L32;
        return false;
    L32:
        return true;
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
        return "TeraBoxListItem(fs_id=" + this.fs_id + ", category=" + this.category + ", local_mtime=" + this.local_mtime + ", server_ctime=" + this.server_ctime + ", server_filename=" + this.server_filename + ", size=" + this.size + ", isdir=" + this.isdir + ", path=" + this.path + I000IiI1O.iO.iO;
    }

    public TeraBoxListItem(long r2, @aa1 String r4, long r5, long r7, @aa1 String r9, int r10, int r11, @aa1 String r12) {
        Intrinsics.X0O(r4, "category");
        Intrinsics.X0O(r9, "server_filename");
        Intrinsics.X0O(r12, "path");
        this.fs_id = r2;
        this.category = r4;
        this.local_mtime = r5;
        this.server_ctime = r7;
        this.server_filename = r9;
        this.size = r10;
        this.isdir = r11;
        this.path = r12;
    }

    public /* synthetic */ TeraBoxListItem(long r12, String r14, long r15, long r17, String r19, int r20, int r21, String r22, int r23, DefaultConstructorMarker r24) {
        long r2 = 0;
        if ((r23 & 1) == 0) goto L6;
        r12 = 0;
    L6:
        if ((r23 & 2) == 0) goto L8;
        String r1 = "";
    L10:
        if ((r23 & 4) == 0) goto L12;
        long r5 = 0;
    L14:
        if ((r23 & 8) != 0) goto L18;
        r2 = r17;
    L18:
        if ((r23 & 16) == 0) goto L20;
        String r7 = "";
    L21:
        int r9 = 0;
        if ((r23 & 32) == 0) goto L24;
        int r8 = 0;
    L26:
        if ((r23 & 64) != 0) goto L30;
        r9 = r21;
    L30:
        if ((r23 & 128) == 0) goto L33;
        String r25 = "";
    L34:
        this(r12, r1, r5, r2, r7, r8, r9, r25);
        return;
    L33:
        r25 = r22;
        goto L34
    L24:
        r8 = r20;
        goto L26
    L20:
        r7 = r19;
        goto L21
    L12:
        r5 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }
}
