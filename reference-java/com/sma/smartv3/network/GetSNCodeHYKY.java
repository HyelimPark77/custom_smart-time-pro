package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GetSNCodeHYKY {

    @aa1
    public static final GetSNCodeHYKY INSTANCE = new GetSNCodeHYKY();

    @aa1
    public static final String MAC = "mac";

    @aa1
    public static final String URL = "/kangyang/get/3code";

    public static final class Response {

        @aa1
        private String cmei;

        @aa1
        private String mac;

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f51340sn;

        public Response() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = response.mac;
            }
            if ((i & 2) != 0) {
                str2 = response.cmei;
            }
            if ((i & 4) != 0) {
                str3 = response.f51340sn;
            }
            return response.copy(str, str2, str3);
        }

        @aa1
        public final String component1() {
            return this.mac;
        }

        @aa1
        public final String component2() {
            return this.cmei;
        }

        @aa1
        public final String component3() {
            return this.f51340sn;
        }

        @aa1
        public final Response copy(@aa1 String mac, @aa1 String cmei, @aa1 String sn) {
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            return new Response(mac, cmei, sn);
        }

        public final boolean deviceInfoExists() {
            return this.mac.length() > 0 && this.cmei.length() > 0 && this.f51340sn.length() > 0;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return Intrinsics.XOO0ii0(this.mac, response.mac) && Intrinsics.XOO0ii0(this.cmei, response.cmei) && Intrinsics.XOO0ii0(this.f51340sn, response.f51340sn);
        }

        @aa1
        public final String getCmei() {
            return this.cmei;
        }

        @aa1
        public final String getMac() {
            return this.mac;
        }

        @aa1
        public final String getSn() {
            return this.f51340sn;
        }

        public int hashCode() {
            return (((this.mac.hashCode() * 31) + this.cmei.hashCode()) * 31) + this.f51340sn.hashCode();
        }

        public final void setCmei(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.cmei = str;
        }

        public final void setMac(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.mac = str;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f51340sn = str;
        }

        @aa1
        public String toString() {
            return "Response(mac=" + this.mac + ", cmei=" + this.cmei + ", sn=" + this.f51340sn + I000IiI1O.C2156iO.f1007iO;
        }

        public Response(@aa1 String mac, @aa1 String cmei, @aa1 String sn) {
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            this.mac = mac;
            this.cmei = cmei;
            this.f51340sn = sn;
        }

        public /* synthetic */ Response(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    private GetSNCodeHYKY() {
    }
}
