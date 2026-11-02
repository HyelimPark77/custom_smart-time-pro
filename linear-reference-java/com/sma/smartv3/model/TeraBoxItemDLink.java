package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxItemDLink {

    @aa1
    private final String dlink;
    private final long fs_id;

    public TeraBoxItemDLink() {
        long r1 = 0;
        String r3 = null;
        this(r1, r3, 3, null);
    }

    public static /* synthetic */ TeraBoxItemDLink copy$default(TeraBoxItemDLink r0, long r1, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.fs_id;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = r0.dlink;
    L9:
        return r0.copy(r1, r3);
    }

    public final long component1() {
        return this.fs_id;
    }

    @aa1
    public final String component2() {
        return this.dlink;
    }

    @aa1
    public final TeraBoxItemDLink copy(long r2, @aa1 String r4) {
        Intrinsics.X0O(r4, "dlink");
        return new TeraBoxItemDLink(r2, r4);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TeraBoxItemDLink) == true) goto L8;
        return false;
    L8:
        TeraBoxItemDLink r9 = (TeraBoxItemDLink) r8;
        if (this.fs_id == r9.fs_id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dlink, r9.dlink) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getDlink() {
        return this.dlink;
    }

    public final long getFs_id() {
        return this.fs_id;
    }

    public int hashCode() {
        return (Long.hashCode(this.fs_id) * 31) + this.dlink.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxItemDLink(fs_id=" + this.fs_id + ", dlink=" + this.dlink + I000IiI1O.iO.iO;
    }

    public TeraBoxItemDLink(long r2, @aa1 String r4) {
        Intrinsics.X0O(r4, "dlink");
        this.fs_id = r2;
        this.dlink = r4;
    }

    public /* synthetic */ TeraBoxItemDLink(long r1, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r1, r3);
    }
}
