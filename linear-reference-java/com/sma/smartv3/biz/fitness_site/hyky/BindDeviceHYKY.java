package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.GetGomoreAuthKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class BindDeviceHYKY {

    @aa1
    public static final BindDeviceHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/bindState";

    public static final class BodyData {

        @aa1
        private String cmei;

        @aa1
        private String deviceId;
        private int deviceType;

        @aa1
        private String mac;
        private int operateType;

        @aa1
        private String phone;

        @aa1
        private String sn;

        public BodyData() {
            String r1 = null;
            int r2 = 0;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            String r6 = null;
            int r7 = 0;
            this(r1, r2, r3, r4, r5, r6, r7, 127, null);
        }

        public static /* synthetic */ BodyData copy$default(BodyData r0, String r1, int r2, String r3, String r4, String r5, String r6, int r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.phone;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.deviceType;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.deviceId;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.cmei;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.sn;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.mac;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.operateType;
        L23:
            String r10 = r6;
            int r11 = r7;
            String r12 = r4;
            String r13 = r5;
            String r14 = r3;
            String r15 = r1;
            return r0.copy(r15, r2, r14, r12, r13, r10, r11);
        }

        @aa1
        public final String component1() {
            return this.phone;
        }

        public final int component2() {
            return this.deviceType;
        }

        @aa1
        public final String component3() {
            return this.deviceId;
        }

        @aa1
        public final String component4() {
            return this.cmei;
        }

        @aa1
        public final String component5() {
            return this.sn;
        }

        @aa1
        public final String component6() {
            return this.mac;
        }

        public final int component7() {
            return this.operateType;
        }

        @aa1
        public final BodyData copy(@aa1 String r10, int r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, int r16) {
            Intrinsics.X0O(r10, "phone");
            Intrinsics.X0O(r12, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r13, "cmei");
            Intrinsics.X0O(r14, "sn");
            Intrinsics.X0O(r15, "mac");
            return new BodyData(r10, r11, r12, r13, r14, r15, r16);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BodyData) == true) goto L8;
            return false;
        L8:
            BodyData r6 = (BodyData) r5;
            if (Intrinsics.XOO0ii0(this.phone, r6.phone) == true) goto L12;
            return false;
        L12:
            if (this.deviceType == r6.deviceType) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.deviceId, r6.deviceId) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.cmei, r6.cmei) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.sn, r6.sn) == true) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L27;
            return false;
        L27:
            if (this.operateType == r6.operateType) goto L29;
            return false;
        L29:
            return true;
        }

        @aa1
        public final String getCmei() {
            return this.cmei;
        }

        @aa1
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        @aa1
        public final String getMac() {
            return this.mac;
        }

        public final int getOperateType() {
            return this.operateType;
        }

        @aa1
        public final String getPhone() {
            return this.phone;
        }

        @aa1
        public final String getSn() {
            return this.sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.operateType);
        }

        public final void setCmei(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.cmei = r2;
        }

        public final void setDeviceId(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.deviceId = r2;
        }

        public final void setDeviceType(int r1) {
            this.deviceType = r1;
        }

        public final void setMac(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mac = r2;
        }

        public final void setOperateType(int r1) {
            this.operateType = r1;
        }

        public final void setPhone(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.phone = r2;
        }

        public final void setSn(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sn = r2;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.sn + ", mac=" + this.mac + ", operateType=" + this.operateType + I000IiI1O.iO.iO;
        }

        public BodyData(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, int r8) {
            Intrinsics.X0O(r2, "phone");
            Intrinsics.X0O(r4, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r5, "cmei");
            Intrinsics.X0O(r6, "sn");
            Intrinsics.X0O(r7, "mac");
            this.phone = r2;
            this.deviceType = r3;
            this.deviceId = r4;
            this.cmei = r5;
            this.sn = r6;
            this.mac = r7;
            this.operateType = r8;
        }

        public /* synthetic */ BodyData(String r2, int r3, String r4, String r5, String r6, String r7, int r8, int r9, DefaultConstructorMarker r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = HykyAPI.DeviceType;
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
            r8 = 1;
        L23:
            int r11 = r8;
            String r12 = r7;
            String r13 = r6;
            String r14 = r5;
            String r15 = r4;
            int r16 = r3;
            this(r2, r16, r15, r14, r13, r12, r11);
        }
    }

    static {
        INSTANCE = new BindDeviceHYKY();
    }

    private BindDeviceHYKY() {
    }
}
