package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class GetTokenHYKY {

    @aa1
    public static final GetTokenHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-user/oauth/token";

    public static final class HykyTokenData {

        @aa1
        private String accessToken;
        private long expiresAt;
        private long expiresIn;

        @aa1
        private String refreshToken;

        @aa1
        private String tokenType;

        public HykyTokenData() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            long r4 = 0;
            long r6 = 0;
            this(r1, r2, r3, r4, r6, 31, null);
        }

        public static /* synthetic */ HykyTokenData copy$default(HykyTokenData r0, String r1, String r2, String r3, long r4, long r6, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.accessToken;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.refreshToken;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.tokenType;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.expiresIn;
        L15:
            if ((r8 & 16) == 0) goto L17;
            r6 = r0.expiresAt;
        L17:
            long r10 = r6;
            long r7 = r4;
            String r5 = r3;
            String r11 = r1;
            return r0.copy(r11, r2, r5, r7, r10);
        }

        @aa1
        public final String component1() {
            return this.accessToken;
        }

        @aa1
        public final String component2() {
            return this.refreshToken;
        }

        @aa1
        public final String component3() {
            return this.tokenType;
        }

        public final long component4() {
            return this.expiresIn;
        }

        public final long component5() {
            return this.expiresAt;
        }

        @aa1
        public final HykyTokenData copy(@aa1 String r10, @aa1 String r11, @aa1 String r12, long r13, long r15) {
            Intrinsics.X0O(r10, "accessToken");
            Intrinsics.X0O(r11, "refreshToken");
            Intrinsics.X0O(r12, "tokenType");
            return new HykyTokenData(r10, r11, r12, r13, r15);
        }

        public boolean equals(@tb1 Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof HykyTokenData) == true) goto L8;
            return false;
        L8:
            HykyTokenData r9 = (HykyTokenData) r8;
            if (Intrinsics.XOO0ii0(this.accessToken, r9.accessToken) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.refreshToken, r9.refreshToken) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.tokenType, r9.tokenType) == true) goto L18;
            return false;
        L18:
            if (this.expiresIn == r9.expiresIn) goto L21;
            return false;
        L21:
            if (this.expiresAt == r9.expiresAt) goto L23;
            return false;
        L23:
            return true;
        }

        @aa1
        public final String getAccessToken() {
            return this.accessToken;
        }

        public final long getExpiresAt() {
            return this.expiresAt;
        }

        public final long getExpiresIn() {
            return this.expiresIn;
        }

        @aa1
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        @aa1
        public final String getTokenType() {
            return this.tokenType;
        }

        public int hashCode() {
            return (((((((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + Long.hashCode(this.expiresIn)) * 31) + Long.hashCode(this.expiresAt);
        }

        public final boolean isExpired() {
            if (System.currentTimeMillis() <= ((this.expiresAt + this.expiresIn) - TimeUnit.MINUTES.toMillis(10))) goto L6;
            return true;
        L6:
            return false;
        }

        public final void setAccessToken(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.accessToken = r2;
        }

        public final void setExpiresAt(long r1) {
            this.expiresAt = r1;
        }

        public final void setExpiresIn(long r1) {
            this.expiresIn = r1;
        }

        public final void setRefreshToken(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.refreshToken = r2;
        }

        public final void setTokenType(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.tokenType = r2;
        }

        @aa1
        public String toString() {
            return "HykyTokenData(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", tokenType=" + this.tokenType + ", expiresIn=" + this.expiresIn + ", expiresAt=" + this.expiresAt + I000IiI1O.iO.iO;
        }

        public HykyTokenData(@aa1 String r2, @aa1 String r3, @aa1 String r4, long r5, long r7) {
            Intrinsics.X0O(r2, "accessToken");
            Intrinsics.X0O(r3, "refreshToken");
            Intrinsics.X0O(r4, "tokenType");
            this.accessToken = r2;
            this.refreshToken = r3;
            this.tokenType = r4;
            this.expiresIn = r5;
            this.expiresAt = r7;
        }

        public /* synthetic */ HykyTokenData(String r2, String r3, String r4, long r5, long r7, int r9, DefaultConstructorMarker r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r9 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r9 & 8) == 0) goto L15;
            r5 = -1;
        L15:
            if ((r9 & 16) == 0) goto L17;
            r7 = System.currentTimeMillis();
        L17:
            long r6 = r5;
            String r8 = r4;
            String r11 = r3;
            String r12 = r2;
            this(r12, r11, r8, r6, r7);
        }
    }

    static {
        INSTANCE = new GetTokenHYKY();
    }

    private GetTokenHYKY() {
    }
}
