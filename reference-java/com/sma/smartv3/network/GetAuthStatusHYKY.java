package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GetAuthStatusHYKY {

    @aa1
    public static final GetAuthStatusHYKY INSTANCE = new GetAuthStatusHYKY();

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

        public static /* synthetic */ ResStatus copy$default(ResStatus resStatus, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resStatus.authType;
            }
            return resStatus.copy(str);
        }

        @aa1
        public final String component1() {
            return this.authType;
        }

        @aa1
        public final ResStatus copy(@aa1 String authType) {
            Intrinsics.X0O(authType, "authType");
            return new ResStatus(authType);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResStatus) && Intrinsics.XOO0ii0(this.authType, ((ResStatus) obj).authType);
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

        public final void setAuthType(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.authType = str;
        }

        @aa1
        public String toString() {
            return "ResStatus(authType=" + this.authType + I000IiI1O.C2156iO.f1007iO;
        }

        public ResStatus(@aa1 String authType) {
            Intrinsics.X0O(authType, "authType");
            this.authType = authType;
        }

        public /* synthetic */ ResStatus(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "0" : str);
        }
    }

    private GetAuthStatusHYKY() {
    }
}
