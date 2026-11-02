package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DcsToken {

    @aa1
    private String access_token;

    @aa1
    private String client_id;
    private int expires_in;

    @aa1
    private String refresh_token;

    @aa1
    private String scope;

    @aa1
    private String session_key;

    @aa1
    private String session_secret;

    @aa1
    private String time;
    private long timestamp;

    public DcsToken() {
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        long r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ DcsToken copy$default(DcsToken r0, String r1, int r2, String r3, String r4, String r5, String r6, String r7, String r8, long r9, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.refresh_token;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.expires_in;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.session_key;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.client_id;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.access_token;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.scope;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.session_secret;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.time;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r9 = r0.timestamp;
    L29:
        long r13 = r9;
        String r10 = r7;
        String r14 = r8;
        String r15 = r5;
        String r16 = r6;
        String r17 = r3;
        String r18 = r4;
        return r0.copy(r1, r2, r17, r18, r15, r16, r10, r14, r13);
    }

    @aa1
    public final String component1() {
        return this.refresh_token;
    }

    public final int component2() {
        return this.expires_in;
    }

    @aa1
    public final String component3() {
        return this.session_key;
    }

    @aa1
    public final String component4() {
        return this.client_id;
    }

    @aa1
    public final String component5() {
        return this.access_token;
    }

    @aa1
    public final String component6() {
        return this.scope;
    }

    @aa1
    public final String component7() {
        return this.session_secret;
    }

    @aa1
    public final String component8() {
        return this.time;
    }

    public final long component9() {
        return this.timestamp;
    }

    @aa1
    public final DcsToken copy(@aa1 String r13, int r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, long r21) {
        Intrinsics.X0O(r13, cd1.IO);
        Intrinsics.X0O(r15, "session_key");
        Intrinsics.X0O(r16, "client_id");
        Intrinsics.X0O(r17, "access_token");
        Intrinsics.X0O(r18, "scope");
        Intrinsics.X0O(r19, "session_secret");
        Intrinsics.X0O(r20, "time");
        return new DcsToken(r13, r14, r15, r16, r17, r18, r19, r20, r21);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DcsToken) == true) goto L8;
        return false;
    L8:
        DcsToken r9 = (DcsToken) r8;
        if (Intrinsics.XOO0ii0(this.refresh_token, r9.refresh_token) == true) goto L12;
        return false;
    L12:
        if (this.expires_in == r9.expires_in) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.session_key, r9.session_key) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.client_id, r9.client_id) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.access_token, r9.access_token) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.scope, r9.scope) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.session_secret, r9.session_secret) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.time, r9.time) == true) goto L33;
        return false;
    L33:
        if (this.timestamp == r9.timestamp) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final String getAccess_token() {
        return this.access_token;
    }

    @aa1
    public final String getClient_id() {
        return this.client_id;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    @aa1
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    @aa1
    public final String getScope() {
        return this.scope;
    }

    @aa1
    public final String getSession_key() {
        return this.session_key;
    }

    @aa1
    public final String getSession_secret() {
        return this.session_secret;
    }

    @aa1
    public final String getTime() {
        return this.time;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((((((((this.refresh_token.hashCode() * 31) + Integer.hashCode(this.expires_in)) * 31) + this.session_key.hashCode()) * 31) + this.client_id.hashCode()) * 31) + this.access_token.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.session_secret.hashCode()) * 31) + this.time.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public final void setAccess_token(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.access_token = r2;
    }

    public final void setClient_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.client_id = r2;
    }

    public final void setExpires_in(int r1) {
        this.expires_in = r1;
    }

    public final void setRefresh_token(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.refresh_token = r2;
    }

    public final void setScope(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.scope = r2;
    }

    public final void setSession_key(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.session_key = r2;
    }

    public final void setSession_secret(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.session_secret = r2;
    }

    public final void setTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.time = r2;
    }

    public final void setTimestamp(long r1) {
        this.timestamp = r1;
    }

    @aa1
    public String toString() {
        return "DcsToken(refresh_token=" + this.refresh_token + ", expires_in=" + this.expires_in + ", session_key=" + this.session_key + ", client_id=" + this.client_id + ", access_token=" + this.access_token + ", scope=" + this.scope + ", session_secret=" + this.session_secret + ", time=" + this.time + ", timestamp=" + this.timestamp + I000IiI1O.iO.iO;
    }

    public DcsToken(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, long r10) {
        Intrinsics.X0O(r2, cd1.IO);
        Intrinsics.X0O(r4, "session_key");
        Intrinsics.X0O(r5, "client_id");
        Intrinsics.X0O(r6, "access_token");
        Intrinsics.X0O(r7, "scope");
        Intrinsics.X0O(r8, "session_secret");
        Intrinsics.X0O(r9, "time");
        this.refresh_token = r2;
        this.expires_in = r3;
        this.session_key = r4;
        this.client_id = r5;
        this.access_token = r6;
        this.scope = r7;
        this.session_secret = r8;
        this.time = r9;
        this.timestamp = r10;
    }

    public /* synthetic */ DcsToken(String r2, int r3, String r4, String r5, String r6, String r7, String r8, String r9, long r10, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r12 & 256) == 0) goto L29;
        r10 = 0;
    L29:
        long r11 = r10;
        String r14 = r9;
        String r15 = r8;
        String r16 = r7;
        String r17 = r6;
        String r18 = r5;
        String r19 = r4;
        int r20 = r3;
        this(r2, r20, r19, r18, r17, r16, r15, r14, r11);
    }
}
