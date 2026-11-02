package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GetAuthStatusHYKY {

    @aa1
    public static final GetAuthStatusHYKY INSTANCE = null;

    @aa1
    public static final String PHONE = "phone";

    @aa1
    public static final String PROJECTID = "projectId";

    @aa1
    public static final String URL = "/kangyang/auth/get";

    public static final class ResStatus {

        @aa1
        private String authType;

        /* JADX WARN: Multi-variable type inference failed */
        public ResStatus() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ResStatus copy$default(ResStatus r0, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.authType;
        L6:
            return r0.copy(r1);
        }

        @aa1
        public final String component1() {
            return this.authType;
        }

        @aa1
        public final ResStatus copy(@aa1 String r2) {
            Intrinsics.X0O(r2, "authType");
            return new ResStatus(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof ResStatus) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.authType, ((ResStatus) r4).authType) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @aa1
        public final String getAuthType() {
            return this.authType;
        }

        public int hashCode() {
            return this.authType.hashCode();
        }

        public final boolean isAuth() {
            return Intrinsics.XOO0ii0("1", this.authType);
        }

        public final void setAuthType(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.authType = r2;
        }

        @aa1
        public String toString() {
            return "ResStatus(authType=" + this.authType + I000IiI1O.iO.iO;
        }

        public ResStatus(@aa1 String r2) {
            Intrinsics.X0O(r2, "authType");
            this.authType = r2;
        }

        public /* synthetic */ ResStatus(String r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "0";
        L5:
            this(r1);
        }
    }

    static {
        INSTANCE = new GetAuthStatusHYKY();
    }

    private GetAuthStatusHYKY() {
    }
}
