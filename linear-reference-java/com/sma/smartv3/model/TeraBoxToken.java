package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxToken {

    @aa1
    private final String access_token;
    private final long expires_in;

    @aa1
    private final String refresh_token;

    public TeraBoxToken() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        this(r1, r3, r4, 7, null);
    }

    public static /* synthetic */ TeraBoxToken copy$default(TeraBoxToken r0, long r1, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.expires_in;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.refresh_token;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.access_token;
    L12:
        return r0.copy(r1, r3, r4);
    }

    public final long component1() {
        return this.expires_in;
    }

    @aa1
    public final String component2() {
        return this.refresh_token;
    }

    @aa1
    public final String component3() {
        return this.access_token;
    }

    @aa1
    public final TeraBoxToken copy(long r2, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, cd1.IO);
        Intrinsics.X0O(r5, "access_token");
        return new TeraBoxToken(r2, r4, r5);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TeraBoxToken) == true) goto L8;
        return false;
    L8:
        TeraBoxToken r9 = (TeraBoxToken) r8;
        if (this.expires_in == r9.expires_in) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.refresh_token, r9.refresh_token) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.access_token, r9.access_token) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getAccess_token() {
        return this.access_token;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    @aa1
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return (((Long.hashCode(this.expires_in) * 31) + this.refresh_token.hashCode()) * 31) + this.access_token.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxToken(expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", access_token=" + this.access_token + I000IiI1O.iO.iO;
    }

    public TeraBoxToken(long r2, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, cd1.IO);
        Intrinsics.X0O(r5, "access_token");
        this.expires_in = r2;
        this.refresh_token = r4;
        this.access_token = r5;
    }

    public /* synthetic */ TeraBoxToken(long r2, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r6 & 4) == 0) goto L11;
        r5 = "";
    L11:
        this(r2, r4, r5);
    }
}
