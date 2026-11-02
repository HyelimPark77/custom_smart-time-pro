package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxTokenInfo {

    @aa1
    private final String client_id;

    @aa1
    private final String user_id;

    /* JADX WARN: Multi-variable type inference failed */
    public TeraBoxTokenInfo() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TeraBoxTokenInfo copy$default(TeraBoxTokenInfo r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.client_id;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.user_id;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.client_id;
    }

    @aa1
    public final String component2() {
        return this.user_id;
    }

    @aa1
    public final TeraBoxTokenInfo copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "client_id");
        Intrinsics.X0O(r3, "user_id");
        return new TeraBoxTokenInfo(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TeraBoxTokenInfo) == true) goto L8;
        return false;
    L8:
        TeraBoxTokenInfo r6 = (TeraBoxTokenInfo) r5;
        if (Intrinsics.XOO0ii0(this.client_id, r6.client_id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.user_id, r6.user_id) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getClient_id() {
        return this.client_id;
    }

    @aa1
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return (this.client_id.hashCode() * 31) + this.user_id.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxTokenInfo(client_id=" + this.client_id + ", user_id=" + this.user_id + I000IiI1O.iO.iO;
    }

    public TeraBoxTokenInfo(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "client_id");
        Intrinsics.X0O(r3, "user_id");
        this.client_id = r2;
        this.user_id = r3;
    }

    public /* synthetic */ TeraBoxTokenInfo(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
