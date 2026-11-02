package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GetSNCodeHYKY {

    @aa1
    public static final GetSNCodeHYKY INSTANCE = null;

    @aa1
    public static final String MAC = "mac";

    @aa1
    public static final String URL = "/kangyang/get/3code";

    public static final class Response {

        @aa1
        private String cmei;

        @aa1
        private String mac;

        @aa1
        private String sn;

        public Response() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public static /* synthetic */ Response copy$default(Response r0, String r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.mac;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.cmei;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.sn;
        L12:
            return r0.copy(r1, r2, r3);
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
            return this.sn;
        }

        @aa1
        public final Response copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
            Intrinsics.X0O(r2, "mac");
            Intrinsics.X0O(r3, "cmei");
            Intrinsics.X0O(r4, "sn");
            return new Response(r2, r3, r4);
        }

        public final boolean deviceInfoExists() {
            if (this.mac.length() > 0) goto L5;
            return false;
        L5:
            if (this.cmei.length() > 0) goto L7;
            return false;
        L7:
            if (this.sn.length() <= 0) goto L13;
            return true;
        L13:
            return false;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Response) == true) goto L8;
            return false;
        L8:
            Response r6 = (Response) r5;
            if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.cmei, r6.cmei) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.sn, r6.sn) == true) goto L17;
            return false;
        L17:
            return true;
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
            return this.sn;
        }

        public int hashCode() {
            return (((this.mac.hashCode() * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode();
        }

        public final void setCmei(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.cmei = r2;
        }

        public final void setMac(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mac = r2;
        }

        public final void setSn(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sn = r2;
        }

        @aa1
        public String toString() {
            return "Response(mac=" + this.mac + ", cmei=" + this.cmei + ", sn=" + this.sn + I000IiI1O.iO.iO;
        }

        public Response(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
            Intrinsics.X0O(r2, "mac");
            Intrinsics.X0O(r3, "cmei");
            Intrinsics.X0O(r4, "sn");
            this.mac = r2;
            this.cmei = r3;
            this.sn = r4;
        }

        public /* synthetic */ Response(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = "";
        L11:
            this(r2, r3, r4);
        }
    }

    static {
        INSTANCE = new GetSNCodeHYKY();
    }

    private GetSNCodeHYKY() {
    }
}
