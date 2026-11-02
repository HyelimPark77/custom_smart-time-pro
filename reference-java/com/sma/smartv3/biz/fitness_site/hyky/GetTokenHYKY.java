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
    public static final GetTokenHYKY INSTANCE = new GetTokenHYKY();

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
            this(null, null, null, 0L, 0L, 31, null);
        }

        public static /* synthetic */ HykyTokenData copy$default(HykyTokenData hykyTokenData, String str, String str2, String str3, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hykyTokenData.accessToken;
            }
            if ((i & 2) != 0) {
                str2 = hykyTokenData.refreshToken;
            }
            if ((i & 4) != 0) {
                str3 = hykyTokenData.tokenType;
            }
            if ((i & 8) != 0) {
                j = hykyTokenData.expiresIn;
            }
            if ((i & 16) != 0) {
                j2 = hykyTokenData.expiresAt;
            }
            long j3 = j2;
            String str4 = str3;
            return hykyTokenData.copy(str, str2, str4, j, j3);
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
        public final HykyTokenData copy(@aa1 String accessToken, @aa1 String refreshToken, @aa1 String tokenType, long j, long j2) {
            Intrinsics.X0O(accessToken, "accessToken");
            Intrinsics.X0O(refreshToken, "refreshToken");
            Intrinsics.X0O(tokenType, "tokenType");
            return new HykyTokenData(accessToken, refreshToken, tokenType, j, j2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HykyTokenData)) {
                return false;
            }
            HykyTokenData hykyTokenData = (HykyTokenData) obj;
            return Intrinsics.XOO0ii0(this.accessToken, hykyTokenData.accessToken) && Intrinsics.XOO0ii0(this.refreshToken, hykyTokenData.refreshToken) && Intrinsics.XOO0ii0(this.tokenType, hykyTokenData.tokenType) && this.expiresIn == hykyTokenData.expiresIn && this.expiresAt == hykyTokenData.expiresAt;
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
            return System.currentTimeMillis() > (this.expiresAt + this.expiresIn) - TimeUnit.MINUTES.toMillis(10L);
        }

        public final void setAccessToken(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.accessToken = str;
        }

        public final void setExpiresAt(long j) {
            this.expiresAt = j;
        }

        public final void setExpiresIn(long j) {
            this.expiresIn = j;
        }

        public final void setRefreshToken(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.refreshToken = str;
        }

        public final void setTokenType(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.tokenType = str;
        }

        @aa1
        public String toString() {
            return "HykyTokenData(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", tokenType=" + this.tokenType + ", expiresIn=" + this.expiresIn + ", expiresAt=" + this.expiresAt + I000IiI1O.C2156iO.f1007iO;
        }

        public HykyTokenData(@aa1 String accessToken, @aa1 String refreshToken, @aa1 String tokenType, long j, long j2) {
            Intrinsics.X0O(accessToken, "accessToken");
            Intrinsics.X0O(refreshToken, "refreshToken");
            Intrinsics.X0O(tokenType, "tokenType");
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
            this.tokenType = tokenType;
            this.expiresIn = j;
            this.expiresAt = j2;
        }

        public /* synthetic */ HykyTokenData(String str, String str2, String str3, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? -1L : j, (i & 16) != 0 ? System.currentTimeMillis() : j2);
        }
    }

    private GetTokenHYKY() {
    }
}
