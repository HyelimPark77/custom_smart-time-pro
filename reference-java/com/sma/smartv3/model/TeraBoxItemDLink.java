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
        this(0L, null, 3, null);
    }

    public static /* synthetic */ TeraBoxItemDLink copy$default(TeraBoxItemDLink teraBoxItemDLink, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = teraBoxItemDLink.fs_id;
        }
        if ((i & 2) != 0) {
            str = teraBoxItemDLink.dlink;
        }
        return teraBoxItemDLink.copy(j, str);
    }

    public final long component1() {
        return this.fs_id;
    }

    @aa1
    public final String component2() {
        return this.dlink;
    }

    @aa1
    public final TeraBoxItemDLink copy(long j, @aa1 String dlink) {
        Intrinsics.X0O(dlink, "dlink");
        return new TeraBoxItemDLink(j, dlink);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeraBoxItemDLink)) {
            return false;
        }
        TeraBoxItemDLink teraBoxItemDLink = (TeraBoxItemDLink) obj;
        return this.fs_id == teraBoxItemDLink.fs_id && Intrinsics.XOO0ii0(this.dlink, teraBoxItemDLink.dlink);
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
        return "TeraBoxItemDLink(fs_id=" + this.fs_id + ", dlink=" + this.dlink + I000IiI1O.C2156iO.f1007iO;
    }

    public TeraBoxItemDLink(long j, @aa1 String dlink) {
        Intrinsics.X0O(dlink, "dlink");
        this.fs_id = j;
        this.dlink = dlink;
    }

    public /* synthetic */ TeraBoxItemDLink(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
