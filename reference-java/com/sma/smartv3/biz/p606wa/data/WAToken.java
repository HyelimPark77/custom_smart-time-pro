package com.sma.smartv3.biz.p606wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAToken extends JsonFieldContainer implements Serializable {

    @aa1
    private String full;

    @aa1
    private String message;

    @aa1
    private String response;

    @aa1
    private String session;

    @aa1
    private String status;

    @aa1
    private String token;

    public WAToken() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WAToken copy$default(WAToken wAToken, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wAToken.status;
        }
        if ((i & 2) != 0) {
            str2 = wAToken.session;
        }
        if ((i & 4) != 0) {
            str3 = wAToken.token;
        }
        if ((i & 8) != 0) {
            str4 = wAToken.full;
        }
        if ((i & 16) != 0) {
            str5 = wAToken.response;
        }
        if ((i & 32) != 0) {
            str6 = wAToken.message;
        }
        String str7 = str5;
        String str8 = str6;
        return wAToken.copy(str, str2, str3, str4, str7, str8);
    }

    @aa1
    public final String component1() {
        return this.status;
    }

    @aa1
    public final String component2() {
        return this.session;
    }

    @aa1
    public final String component3() {
        return this.token;
    }

    @aa1
    public final String component4() {
        return this.full;
    }

    @aa1
    public final String component5() {
        return this.response;
    }

    @aa1
    public final String component6() {
        return this.message;
    }

    @aa1
    public final WAToken copy(@aa1 String status, @aa1 String session, @aa1 String token, @aa1 String full, @aa1 String response, @aa1 String message) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(full, "full");
        Intrinsics.X0O(response, "response");
        Intrinsics.X0O(message, "message");
        return new WAToken(status, session, token, full, response, message);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAToken)) {
            return false;
        }
        WAToken wAToken = (WAToken) obj;
        return Intrinsics.XOO0ii0(this.status, wAToken.status) && Intrinsics.XOO0ii0(this.session, wAToken.session) && Intrinsics.XOO0ii0(this.token, wAToken.token) && Intrinsics.XOO0ii0(this.full, wAToken.full) && Intrinsics.XOO0ii0(this.response, wAToken.response) && Intrinsics.XOO0ii0(this.message, wAToken.message);
    }

    @aa1
    public final String getFull() {
        return this.full;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    @aa1
    public final String getResponse() {
        return this.response;
    }

    @aa1
    public final String getSession() {
        return this.session;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    @aa1
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((((this.status.hashCode() * 31) + this.session.hashCode()) * 31) + this.token.hashCode()) * 31) + this.full.hashCode()) * 31) + this.response.hashCode()) * 31) + this.message.hashCode();
    }

    public final void setFull(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.full = str;
    }

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setResponse(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.response = str;
    }

    public final void setSession(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.session = str;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    public final void setToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.token = str;
    }

    @aa1
    public String toString() {
        return "WAToken(status=" + this.status + ", session=" + this.session + ", token=" + this.token + ", full=" + this.full + ", response=" + this.response + ", message=" + this.message + I000IiI1O.C2156iO.f1007iO;
    }

    public WAToken(@aa1 String status, @aa1 String session, @aa1 String token, @aa1 String full, @aa1 String response, @aa1 String message) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(full, "full");
        Intrinsics.X0O(response, "response");
        Intrinsics.X0O(message, "message");
        this.status = status;
        this.session = session;
        this.token = token;
        this.full = full;
        this.response = response;
        this.message = message;
    }

    public /* synthetic */ WAToken(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
