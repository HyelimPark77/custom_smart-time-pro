package com.sma.smartv3.biz.fitness_site.strava;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StravaToken {

    @aa1
    private String access_token;
    private long expires_at;
    private int expires_in;

    @aa1
    private String refresh_token;

    @aa1
    private String token_type;

    public StravaToken() {
        String r1 = null;
        long r2 = 0;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r4, r5, r6, 31, null);
    }

    public static /* synthetic */ StravaToken copy$default(StravaToken r0, String r1, long r2, int r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.token_type;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.expires_at;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r0.expires_in;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.refresh_token;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.access_token;
    L17:
        String r9 = r6;
        int r10 = r4;
        long r11 = r2;
        String r3 = r1;
        return r0.copy(r3, r11, r10, r5, r9);
    }

    @aa1
    public final String component1() {
        return this.token_type;
    }

    public final long component2() {
        return this.expires_at;
    }

    public final int component3() {
        return this.expires_in;
    }

    @aa1
    public final String component4() {
        return this.refresh_token;
    }

    @aa1
    public final String component5() {
        return this.access_token;
    }

    @aa1
    public final StravaToken copy(@aa1 String r9, long r10, int r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r9, "token_type");
        Intrinsics.X0O(r13, cd1.IO);
        Intrinsics.X0O(r14, "access_token");
        return new StravaToken(r9, r10, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof StravaToken) == true) goto L8;
        return false;
    L8:
        StravaToken r9 = (StravaToken) r8;
        if (Intrinsics.XOO0ii0(this.token_type, r9.token_type) == true) goto L12;
        return false;
    L12:
        if (this.expires_at == r9.expires_at) goto L15;
        return false;
    L15:
        if (this.expires_in == r9.expires_in) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.refresh_token, r9.refresh_token) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.access_token, r9.access_token) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getAccess_token() {
        return this.access_token;
    }

    public final long getExpires_at() {
        return this.expires_at;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    @aa1
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    @aa1
    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        return (((((((this.token_type.hashCode() * 31) + Long.hashCode(this.expires_at)) * 31) + Integer.hashCode(this.expires_in)) * 31) + this.refresh_token.hashCode()) * 31) + this.access_token.hashCode();
    }

    public final void setAccess_token(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.access_token = r2;
    }

    public final void setExpires_at(long r1) {
        this.expires_at = r1;
    }

    public final void setExpires_in(int r1) {
        this.expires_in = r1;
    }

    public final void setRefresh_token(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.refresh_token = r2;
    }

    public final void setToken_type(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.token_type = r2;
    }

    @aa1
    public String toString() {
        return "StravaToken(token_type=" + this.token_type + ", expires_at=" + this.expires_at + ", expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", access_token=" + this.access_token + I000IiI1O.iO.iO;
    }

    public StravaToken(@aa1 String r2, long r3, int r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r2, "token_type");
        Intrinsics.X0O(r6, cd1.IO);
        Intrinsics.X0O(r7, "access_token");
        this.token_type = r2;
        this.expires_at = r3;
        this.expires_in = r5;
        this.refresh_token = r6;
        this.access_token = r7;
    }

    public /* synthetic */ StravaToken(String r2, long r3, int r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r10 = "";
    L17:
        String r11 = r6;
        long r4 = r3;
        this(r2, r4, r5, r11, r10);
        return;
    L18:
        r10 = r7;
        goto L17
    }
}
