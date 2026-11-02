package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadDeviceHYKY {

    @aa1
    public static final UploadDeviceHYKY INSTANCE = new UploadDeviceHYKY();

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

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f50935sn;

        public BodyData() {
            this(0, null, null, null, null, 31, null);
        }

        public static /* synthetic */ BodyData copy$default(BodyData bodyData, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bodyData.deviceType;
            }
            if ((i2 & 2) != 0) {
                str = bodyData.deviceId;
            }
            if ((i2 & 4) != 0) {
                str2 = bodyData.cmei;
            }
            if ((i2 & 8) != 0) {
                str3 = bodyData.f50935sn;
            }
            if ((i2 & 16) != 0) {
                str4 = bodyData.mac;
            }
            String str5 = str4;
            String str6 = str2;
            return bodyData.copy(i, str, str6, str3, str5);
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
            return this.f50935sn;
        }

        @aa1
        public final String component5() {
            return this.mac;
        }

        @aa1
        public final BodyData copy(int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac) {
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            return new BodyData(i, deviceId, cmei, sn, mac);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyData)) {
                return false;
            }
            BodyData bodyData = (BodyData) obj;
            return this.deviceType == bodyData.deviceType && Intrinsics.XOO0ii0(this.deviceId, bodyData.deviceId) && Intrinsics.XOO0ii0(this.cmei, bodyData.cmei) && Intrinsics.XOO0ii0(this.f50935sn, bodyData.f50935sn) && Intrinsics.XOO0ii0(this.mac, bodyData.mac);
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
            return this.f50935sn;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.f50935sn.hashCode()) * 31) + this.mac.hashCode();
        }

        public final void setCmei(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.cmei = str;
        }

        public final void setDeviceId(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.deviceId = str;
        }

        public final void setDeviceType(int i) {
            this.deviceType = i;
        }

        public final void setMac(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.mac = str;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50935sn = str;
        }

        @aa1
        public String toString() {
            return "BodyData(deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.f50935sn + ", mac=" + this.mac + I000IiI1O.C2156iO.f1007iO;
        }

        public BodyData(int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac) {
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            this.deviceType = i;
            this.deviceId = deviceId;
            this.cmei = cmei;
            this.f50935sn = sn;
            this.mac = mac;
        }

        public /* synthetic */ BodyData(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? HykyAPI.DeviceType : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
        }
    }

    private UploadDeviceHYKY() {
    }
}
