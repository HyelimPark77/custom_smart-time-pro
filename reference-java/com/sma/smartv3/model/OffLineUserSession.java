package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OffLineUserSession {

    @aa1
    private final String accessTokenExpireTime;

    @aa1
    private final String ctime;

    /* JADX INFO: renamed from: id */
    private final int f51315id;

    @aa1
    private final String refreshToken;

    @aa1
    private final String token;

    @aa1
    private final String updateTime;

    @aa1
    private final String userId;

    public OffLineUserSession() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OffLineUserSession copy$default(OffLineUserSession offLineUserSession, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = offLineUserSession.f51315id;
        }
        if ((i2 & 2) != 0) {
            str = offLineUserSession.userId;
        }
        if ((i2 & 4) != 0) {
            str2 = offLineUserSession.token;
        }
        if ((i2 & 8) != 0) {
            str3 = offLineUserSession.ctime;
        }
        if ((i2 & 16) != 0) {
            str4 = offLineUserSession.updateTime;
        }
        if ((i2 & 32) != 0) {
            str5 = offLineUserSession.accessTokenExpireTime;
        }
        if ((i2 & 64) != 0) {
            str6 = offLineUserSession.refreshToken;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return offLineUserSession.copy(i, str, str10, str3, str9, str7, str8);
    }

    public final int component1() {
        return this.f51315id;
    }

    @aa1
    public final String component2() {
        return this.userId;
    }

    @aa1
    public final String component3() {
        return this.token;
    }

    @aa1
    public final String component4() {
        return this.ctime;
    }

    @aa1
    public final String component5() {
        return this.updateTime;
    }

    @aa1
    public final String component6() {
        return this.accessTokenExpireTime;
    }

    @aa1
    public final String component7() {
        return this.refreshToken;
    }

    @aa1
    public final OffLineUserSession copy(int i, @aa1 String userId, @aa1 String token, @aa1 String ctime, @aa1 String updateTime, @aa1 String accessTokenExpireTime, @aa1 String refreshToken) {
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(ctime, "ctime");
        Intrinsics.X0O(updateTime, "updateTime");
        Intrinsics.X0O(accessTokenExpireTime, "accessTokenExpireTime");
        Intrinsics.X0O(refreshToken, "refreshToken");
        return new OffLineUserSession(i, userId, token, ctime, updateTime, accessTokenExpireTime, refreshToken);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffLineUserSession)) {
            return false;
        }
        OffLineUserSession offLineUserSession = (OffLineUserSession) obj;
        return this.f51315id == offLineUserSession.f51315id && Intrinsics.XOO0ii0(this.userId, offLineUserSession.userId) && Intrinsics.XOO0ii0(this.token, offLineUserSession.token) && Intrinsics.XOO0ii0(this.ctime, offLineUserSession.ctime) && Intrinsics.XOO0ii0(this.updateTime, offLineUserSession.updateTime) && Intrinsics.XOO0ii0(this.accessTokenExpireTime, offLineUserSession.accessTokenExpireTime) && Intrinsics.XOO0ii0(this.refreshToken, offLineUserSession.refreshToken);
    }

    @aa1
    public final String getAccessTokenExpireTime() {
        return this.accessTokenExpireTime;
    }

    @aa1
    public final String getCtime() {
        return this.ctime;
    }

    public final int getId() {
        return this.f51315id;
    }

    @aa1
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @aa1
    public final String getToken() {
        return this.token;
    }

    @aa1
    public final String getUpdateTime() {
        return this.updateTime;
    }

    @aa1
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f51315id) * 31) + this.userId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.ctime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.accessTokenExpireTime.hashCode()) * 31) + this.refreshToken.hashCode();
    }

    @aa1
    public String toString() {
        return "OffLineUserSession(id=" + this.f51315id + ", userId=" + this.userId + ", token=" + this.token + ", ctime=" + this.ctime + ", updateTime=" + this.updateTime + ", accessTokenExpireTime=" + this.accessTokenExpireTime + ", refreshToken=" + this.refreshToken + I000IiI1O.C2156iO.f1007iO;
    }

    public OffLineUserSession(int i, @aa1 String userId, @aa1 String token, @aa1 String ctime, @aa1 String updateTime, @aa1 String accessTokenExpireTime, @aa1 String refreshToken) {
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(ctime, "ctime");
        Intrinsics.X0O(updateTime, "updateTime");
        Intrinsics.X0O(accessTokenExpireTime, "accessTokenExpireTime");
        Intrinsics.X0O(refreshToken, "refreshToken");
        this.f51315id = i;
        this.userId = userId;
        this.token = token;
        this.ctime = ctime;
        this.updateTime = updateTime;
        this.accessTokenExpireTime = accessTokenExpireTime;
        this.refreshToken = refreshToken;
    }

    public /* synthetic */ OffLineUserSession(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6);
    }
}
