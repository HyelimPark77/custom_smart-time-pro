package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
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
        this(null, 0, null, null, null, null, null, null, 0L, 511, null);
    }

    public static /* synthetic */ DcsToken copy$default(DcsToken dcsToken, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dcsToken.refresh_token;
        }
        if ((i2 & 2) != 0) {
            i = dcsToken.expires_in;
        }
        if ((i2 & 4) != 0) {
            str2 = dcsToken.session_key;
        }
        if ((i2 & 8) != 0) {
            str3 = dcsToken.client_id;
        }
        if ((i2 & 16) != 0) {
            str4 = dcsToken.access_token;
        }
        if ((i2 & 32) != 0) {
            str5 = dcsToken.scope;
        }
        if ((i2 & 64) != 0) {
            str6 = dcsToken.session_secret;
        }
        if ((i2 & 128) != 0) {
            str7 = dcsToken.time;
        }
        if ((i2 & 256) != 0) {
            j = dcsToken.timestamp;
        }
        long j2 = j;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return dcsToken.copy(str, i, str2, str3, str10, str11, str8, str9, j2);
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
    public final DcsToken copy(@aa1 String refresh_token, int i, @aa1 String session_key, @aa1 String client_id, @aa1 String access_token, @aa1 String scope, @aa1 String session_secret, @aa1 String time, long j) {
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(session_key, "session_key");
        Intrinsics.X0O(client_id, "client_id");
        Intrinsics.X0O(access_token, "access_token");
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(session_secret, "session_secret");
        Intrinsics.X0O(time, "time");
        return new DcsToken(refresh_token, i, session_key, client_id, access_token, scope, session_secret, time, j);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsToken)) {
            return false;
        }
        DcsToken dcsToken = (DcsToken) obj;
        return Intrinsics.XOO0ii0(this.refresh_token, dcsToken.refresh_token) && this.expires_in == dcsToken.expires_in && Intrinsics.XOO0ii0(this.session_key, dcsToken.session_key) && Intrinsics.XOO0ii0(this.client_id, dcsToken.client_id) && Intrinsics.XOO0ii0(this.access_token, dcsToken.access_token) && Intrinsics.XOO0ii0(this.scope, dcsToken.scope) && Intrinsics.XOO0ii0(this.session_secret, dcsToken.session_secret) && Intrinsics.XOO0ii0(this.time, dcsToken.time) && this.timestamp == dcsToken.timestamp;
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

    public final void setAccess_token(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.access_token = str;
    }

    public final void setClient_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.client_id = str;
    }

    public final void setExpires_in(int i) {
        this.expires_in = i;
    }

    public final void setRefresh_token(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.refresh_token = str;
    }

    public final void setScope(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.scope = str;
    }

    public final void setSession_key(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.session_key = str;
    }

    public final void setSession_secret(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.session_secret = str;
    }

    public final void setTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.time = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @aa1
    public String toString() {
        return "DcsToken(refresh_token=" + this.refresh_token + ", expires_in=" + this.expires_in + ", session_key=" + this.session_key + ", client_id=" + this.client_id + ", access_token=" + this.access_token + ", scope=" + this.scope + ", session_secret=" + this.session_secret + ", time=" + this.time + ", timestamp=" + this.timestamp + I000IiI1O.C2156iO.f1007iO;
    }

    public DcsToken(@aa1 String refresh_token, int i, @aa1 String session_key, @aa1 String client_id, @aa1 String access_token, @aa1 String scope, @aa1 String session_secret, @aa1 String time, long j) {
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(session_key, "session_key");
        Intrinsics.X0O(client_id, "client_id");
        Intrinsics.X0O(access_token, "access_token");
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(session_secret, "session_secret");
        Intrinsics.X0O(time, "time");
        this.refresh_token = refresh_token;
        this.expires_in = i;
        this.session_key = session_key;
        this.client_id = client_id;
        this.access_token = access_token;
        this.scope = scope;
        this.session_secret = session_secret;
        this.time = time;
        this.timestamp = j;
    }

    public /* synthetic */ DcsToken(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? 0L : j);
    }
}
