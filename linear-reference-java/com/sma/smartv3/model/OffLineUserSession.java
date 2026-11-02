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
    private final int id;

    @aa1
    private final String refreshToken;

    @aa1
    private final String token;

    @aa1
    private final String updateTime;

    @aa1
    private final String userId;

    public OffLineUserSession() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ OffLineUserSession copy$default(OffLineUserSession r0, int r1, String r2, String r3, String r4, String r5, String r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.userId;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.token;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.ctime;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.updateTime;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.accessTokenExpireTime;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.refreshToken;
    L23:
        String r10 = r6;
        String r11 = r7;
        String r12 = r4;
        String r13 = r5;
        String r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.id;
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
    public final OffLineUserSession copy(int r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16) {
        Intrinsics.X0O(r11, "userId");
        Intrinsics.X0O(r12, "token");
        Intrinsics.X0O(r13, "ctime");
        Intrinsics.X0O(r14, "updateTime");
        Intrinsics.X0O(r15, "accessTokenExpireTime");
        Intrinsics.X0O(r16, "refreshToken");
        return new OffLineUserSession(r10, r11, r12, r13, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OffLineUserSession) == true) goto L8;
        return false;
    L8:
        OffLineUserSession r6 = (OffLineUserSession) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.userId, r6.userId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.token, r6.token) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.ctime, r6.ctime) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.updateTime, r6.updateTime) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.accessTokenExpireTime, r6.accessTokenExpireTime) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.refreshToken, r6.refreshToken) == true) goto L29;
        return false;
    L29:
        return true;
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
        return this.id;
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
        return (((((((((((Integer.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.ctime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.accessTokenExpireTime.hashCode()) * 31) + this.refreshToken.hashCode();
    }

    @aa1
    public String toString() {
        return "OffLineUserSession(id=" + this.id + ", userId=" + this.userId + ", token=" + this.token + ", ctime=" + this.ctime + ", updateTime=" + this.updateTime + ", accessTokenExpireTime=" + this.accessTokenExpireTime + ", refreshToken=" + this.refreshToken + I000IiI1O.iO.iO;
    }

    public OffLineUserSession(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r3, "userId");
        Intrinsics.X0O(r4, "token");
        Intrinsics.X0O(r5, "ctime");
        Intrinsics.X0O(r6, "updateTime");
        Intrinsics.X0O(r7, "accessTokenExpireTime");
        Intrinsics.X0O(r8, "refreshToken");
        this.id = r2;
        this.userId = r3;
        this.token = r4;
        this.ctime = r5;
        this.updateTime = r6;
        this.accessTokenExpireTime = r7;
        this.refreshToken = r8;
    }

    public /* synthetic */ OffLineUserSession(int r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r9 & 64) == 0) goto L23;
        String r11 = "";
    L24:
        this(r2, r3, r4, r5, r6, r7, r11);
        return;
    L23:
        r11 = r8;
        goto L24
    }
}
