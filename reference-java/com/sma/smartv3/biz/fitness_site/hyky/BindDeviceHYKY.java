package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class BindDeviceHYKY {

    @aa1
    public static final BindDeviceHYKY INSTANCE = new BindDeviceHYKY();

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

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f50934sn;

        public BodyData() {
            this(null, 0, null, null, null, null, 0, 127, null);
        }

        public static /* synthetic */ BodyData copy$default(BodyData bodyData, String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = bodyData.phone;
            }
            if ((i3 & 2) != 0) {
                i = bodyData.deviceType;
            }
            if ((i3 & 4) != 0) {
                str2 = bodyData.deviceId;
            }
            if ((i3 & 8) != 0) {
                str3 = bodyData.cmei;
            }
            if ((i3 & 16) != 0) {
                str4 = bodyData.f50934sn;
            }
            if ((i3 & 32) != 0) {
                str5 = bodyData.mac;
            }
            if ((i3 & 64) != 0) {
                i2 = bodyData.operateType;
            }
            String str6 = str5;
            int i4 = i2;
            String str7 = str4;
            String str8 = str2;
            return bodyData.copy(str, i, str8, str3, str7, str6, i4);
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
            return this.f50934sn;
        }

        @aa1
        public final String component6() {
            return this.mac;
        }

        public final int component7() {
            return this.operateType;
        }

        @aa1
        public final BodyData copy(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, int i2) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            return new BodyData(phone, i, deviceId, cmei, sn, mac, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyData)) {
                return false;
            }
            BodyData bodyData = (BodyData) obj;
            return Intrinsics.XOO0ii0(this.phone, bodyData.phone) && this.deviceType == bodyData.deviceType && Intrinsics.XOO0ii0(this.deviceId, bodyData.deviceId) && Intrinsics.XOO0ii0(this.cmei, bodyData.cmei) && Intrinsics.XOO0ii0(this.f50934sn, bodyData.f50934sn) && Intrinsics.XOO0ii0(this.mac, bodyData.mac) && this.operateType == bodyData.operateType;
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
            return this.f50934sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.f50934sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.operateType);
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

        public final void setOperateType(int i) {
            this.operateType = i;
        }

        public final void setPhone(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.phone = str;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50934sn = str;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.f50934sn + ", mac=" + this.mac + ", operateType=" + this.operateType + I000IiI1O.C2156iO.f1007iO;
        }

        public BodyData(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, int i2) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            this.phone = phone;
            this.deviceType = i;
            this.deviceId = deviceId;
            this.cmei = cmei;
            this.f50934sn = sn;
            this.mac = mac;
            this.operateType = i2;
        }

        public /* synthetic */ BodyData(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? HykyAPI.DeviceType : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? 1 : i2);
        }
    }

    private BindDeviceHYKY() {
    }
}
