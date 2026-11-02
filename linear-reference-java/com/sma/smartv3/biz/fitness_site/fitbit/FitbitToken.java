package com.sma.smartv3.biz.fitness_site.fitbit;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FitbitToken {

    @aa1
    private String access_token;
    private long expires_at;
    private int expires_in;

    @aa1
    private String refresh_token;

    @aa1
    private String token_type;

    @aa1
    private String user_id;

    public FitbitToken() {
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        long r4 = 0;
        String r6 = null;
        String r7 = null;
        this(r1, r2, r3, r4, r6, r7, 63, null);
    }

    public static /* synthetic */ FitbitToken copy$default(FitbitToken r0, String r1, int r2, String r3, long r4, String r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.access_token;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.expires_in;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.refresh_token;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.expires_at;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = r0.token_type;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.user_id;
    L20:
        long r10 = r4;
        int r5 = r2;
        String r11 = r3;
        String r12 = r1;
        return r0.copy(r12, r5, r11, r10, r6, r7);
    }

    @aa1
    public final String component1() {
        return this.access_token;
    }

    public final int component2() {
        return this.expires_in;
    }

    @aa1
    public final String component3() {
        return this.refresh_token;
    }

    public final long component4() {
        return this.expires_at;
    }

    @aa1
    public final String component5() {
        return this.token_type;
    }

    @aa1
    public final String component6() {
        return this.user_id;
    }

    @aa1
    public final FitbitToken copy(@aa1 String r10, int r11, @aa1 String r12, long r13, @aa1 String r15, @aa1 String r16) {
        Intrinsics.X0O(r10, "access_token");
        Intrinsics.X0O(r12, cd1.IO);
        Intrinsics.X0O(r15, "token_type");
        Intrinsics.X0O(r16, "user_id");
        return new FitbitToken(r10, r11, r12, r13, r15, r16);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FitbitToken) == true) goto L8;
        return false;
    L8:
        FitbitToken r9 = (FitbitToken) r8;
        if (Intrinsics.XOO0ii0(this.access_token, r9.access_token) == true) goto L12;
        return false;
    L12:
        if (this.expires_in == r9.expires_in) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.refresh_token, r9.refresh_token) == true) goto L18;
        return false;
    L18:
        if (this.expires_at == r9.expires_at) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.token_type, r9.token_type) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.user_id, r9.user_id) == true) goto L26;
        return false;
    L26:
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

    @aa1
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return (((((((((this.access_token.hashCode() * 31) + Integer.hashCode(this.expires_in)) * 31) + this.refresh_token.hashCode()) * 31) + Long.hashCode(this.expires_at)) * 31) + this.token_type.hashCode()) * 31) + this.user_id.hashCode();
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

    public final void setUser_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.user_id = r2;
    }

    @aa1
    public String toString() {
        return "FitbitToken(access_token=" + this.access_token + ", expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", expires_at=" + this.expires_at + ", token_type=" + this.token_type + ", user_id=" + this.user_id + I000IiI1O.iO.iO;
    }

    public FitbitToken(@aa1 String r2, int r3, @aa1 String r4, long r5, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r2, "access_token");
        Intrinsics.X0O(r4, cd1.IO);
        Intrinsics.X0O(r7, "token_type");
        Intrinsics.X0O(r8, "user_id");
        this.access_token = r2;
        this.expires_in = r3;
        this.refresh_token = r4;
        this.expires_at = r5;
        this.token_type = r7;
        this.user_id = r8;
    }

    public /* synthetic */ FitbitToken(String r2, int r3, String r4, long r5, String r7, String r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        String r11 = "";
    L20:
        long r6 = r5;
        String r12 = r4;
        int r13 = r3;
        this(r2, r13, r12, r6, r7, r11);
        return;
    L21:
        r11 = r8;
        goto L20
    }
}
