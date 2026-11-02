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
public final class UploadDeviceHYKY {

    @aa1
    public static final UploadDeviceHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/deviceSn";

    public static final class BodyData {

        @aa1
        private String cmei;

        @aa1
        private String deviceId;
        private int deviceType;

        @aa1
        private String mac;

        @aa1
        private String sn;

        public BodyData() {
            int r1 = 0;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            this(r1, r2, r3, r4, r5, 31, null);
        }

        public static /* synthetic */ BodyData copy$default(BodyData r0, int r1, String r2, String r3, String r4, String r5, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r1 = r0.deviceType;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r2 = r0.deviceId;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r3 = r0.cmei;
        L12:
            if ((r6 & 8) == 0) goto L15;
            r4 = r0.sn;
        L15:
            if ((r6 & 16) == 0) goto L17;
            r5 = r0.mac;
        L17:
            String r8 = r4;
            String r9 = r5;
            String r10 = r3;
            int r11 = r1;
            return r0.copy(r11, r2, r10, r8, r9);
        }

        public final int component1() {
            return this.deviceType;
        }

        @aa1
        public final String component2() {
            return this.deviceId;
        }

        @aa1
        public final String component3() {
            return this.cmei;
        }

        @aa1
        public final String component4() {
            return this.sn;
        }

        @aa1
        public final String component5() {
            return this.mac;
        }

        @aa1
        public final BodyData copy(int r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
            Intrinsics.X0O(r9, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r10, "cmei");
            Intrinsics.X0O(r11, "sn");
            Intrinsics.X0O(r12, "mac");
            return new BodyData(r8, r9, r10, r11, r12);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BodyData) == true) goto L8;
            return false;
        L8:
            BodyData r6 = (BodyData) r5;
            if (this.deviceType == r6.deviceType) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.deviceId, r6.deviceId) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.cmei, r6.cmei) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.sn, r6.sn) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L23;
            return false;
        L23:
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

        @aa1
        public final String getSn() {
            return this.sn;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.mac.hashCode();
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

        public final void setSn(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sn = r2;
        }

        @aa1
        public String toString() {
            return "BodyData(deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.sn + ", mac=" + this.mac + I000IiI1O.iO.iO;
        }

        public BodyData(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
            Intrinsics.X0O(r3, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r4, "cmei");
            Intrinsics.X0O(r5, "sn");
            Intrinsics.X0O(r6, "mac");
            this.deviceType = r2;
            this.deviceId = r3;
            this.cmei = r4;
            this.sn = r5;
            this.mac = r6;
        }

        public /* synthetic */ BodyData(int r2, String r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
            if ((r7 & 1) == 0) goto L6;
            r2 = HykyAPI.DeviceType;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r7 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r7 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r7 & 16) == 0) goto L17;
            String r9 = "";
        L18:
            this(r2, r3, r4, r5, r9);
            return;
        L17:
            r9 = r6;
            goto L18
        }
    }

    static {
        INSTANCE = new UploadDeviceHYKY();
    }

    private UploadDeviceHYKY() {
    }
}
