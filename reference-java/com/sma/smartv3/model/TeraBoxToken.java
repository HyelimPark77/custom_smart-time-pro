package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
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
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ TeraBoxToken copy$default(TeraBoxToken teraBoxToken, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = teraBoxToken.expires_in;
        }
        if ((i & 2) != 0) {
            str = teraBoxToken.refresh_token;
        }
        if ((i & 4) != 0) {
            str2 = teraBoxToken.access_token;
        }
        return teraBoxToken.copy(j, str, str2);
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
    public final TeraBoxToken copy(long j, @aa1 String refresh_token, @aa1 String access_token) {
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(access_token, "access_token");
        return new TeraBoxToken(j, refresh_token, access_token);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeraBoxToken)) {
            return false;
        }
        TeraBoxToken teraBoxToken = (TeraBoxToken) obj;
        return this.expires_in == teraBoxToken.expires_in && Intrinsics.XOO0ii0(this.refresh_token, teraBoxToken.refresh_token) && Intrinsics.XOO0ii0(this.access_token, teraBoxToken.access_token);
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
        return "TeraBoxToken(expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", access_token=" + this.access_token + I000IiI1O.C2156iO.f1007iO;
    }

    public TeraBoxToken(long j, @aa1 String refresh_token, @aa1 String access_token) {
        Intrinsics.X0O(refresh_token, "refresh_token");
        Intrinsics.X0O(access_token, "access_token");
        this.expires_in = j;
        this.refresh_token = refresh_token;
        this.access_token = access_token;
    }

    public /* synthetic */ TeraBoxToken(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
