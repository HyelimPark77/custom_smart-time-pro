package com.sma.smartv3.biz.fitness_site.fitbit;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
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
        this(null, 0, null, 0L, null, null, 63, null);
    }

    public static /* synthetic */ FitbitToken copy$default(FitbitToken fitbitToken, String str, int i, String str2, long j, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fitbitToken.access_token;
        }
        if ((i2 & 2) != 0) {
            i = fitbitToken.expires_in;
        }
        if ((i2 & 4) != 0) {
            str2 = fitbitToken.refresh_token;
        }
        if ((i2 & 8) != 0) {
            j = fitbitToken.expires_at;
        }
        if ((i2 & 16) != 0) {
            str3 = fitbitToken.token_type;
        }
        if ((i2 & 32) != 0) {
            str4 = fitbitToken.user_id;
        }
        long j2 = j;
        String str5 = str2;
        return fitbitToken.copy(str, i, str5, j2, str3, str4);
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
    public final FitbitToken copy(@aa1 String access_token, int i, @aa1 String refresh_token, long j, @aa1 String token_type, @aa1 String user_id) {
        Intrinsics.X0O(access_token, "access_token");
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(token_type, "token_type");
        Intrinsics.X0O(user_id, "user_id");
        return new FitbitToken(access_token, i, refresh_token, j, token_type, user_id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitbitToken)) {
            return false;
        }
        FitbitToken fitbitToken = (FitbitToken) obj;
        return Intrinsics.XOO0ii0(this.access_token, fitbitToken.access_token) && this.expires_in == fitbitToken.expires_in && Intrinsics.XOO0ii0(this.refresh_token, fitbitToken.refresh_token) && this.expires_at == fitbitToken.expires_at && Intrinsics.XOO0ii0(this.token_type, fitbitToken.token_type) && Intrinsics.XOO0ii0(this.user_id, fitbitToken.user_id);
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

    public final void setAccess_token(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.access_token = str;
    }

    public final void setExpires_at(long j) {
        this.expires_at = j;
    }

    public final void setExpires_in(int i) {
        this.expires_in = i;
    }

    public final void setRefresh_token(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.refresh_token = str;
    }

    public final void setToken_type(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.token_type = str;
    }

    public final void setUser_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.user_id = str;
    }

    @aa1
    public String toString() {
        return "FitbitToken(access_token=" + this.access_token + ", expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", expires_at=" + this.expires_at + ", token_type=" + this.token_type + ", user_id=" + this.user_id + I000IiI1O.C2156iO.f1007iO;
    }

    public FitbitToken(@aa1 String access_token, int i, @aa1 String refresh_token, long j, @aa1 String token_type, @aa1 String user_id) {
        Intrinsics.X0O(access_token, "access_token");
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(token_type, "token_type");
        Intrinsics.X0O(user_id, "user_id");
        this.access_token = access_token;
        this.expires_in = i;
        this.refresh_token = refresh_token;
        this.expires_at = j;
        this.token_type = token_type;
        this.user_id = user_id;
    }

    public /* synthetic */ FitbitToken(String str, int i, String str2, long j, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
