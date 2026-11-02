package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadSleepDataHYKY {

    @aa1
    public static final UploadSleepDataHYKY INSTANCE = new UploadSleepDataHYKY();

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/sleepData";

    private UploadSleepDataHYKY() {
    }

    public static final class BodyData {

        @aa1
        private String cmei;

        @aa1
        private String deviceId;
        private int deviceType;

        @aa1
        private String mac;

        @aa1
        private String phone;

        @aa1
        private Object sleepData;

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f50937sn;

        public BodyData(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object sleepData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(sleepData, "sleepData");
            this.phone = phone;
            this.deviceType = i;
            this.deviceId = deviceId;
            this.cmei = cmei;
            this.f50937sn = sn;
            this.mac = mac;
            this.sleepData = sleepData;
        }

        public static /* synthetic */ BodyData copy$default(BodyData bodyData, String str, int i, String str2, String str3, String str4, String str5, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                str = bodyData.phone;
            }
            if ((i2 & 2) != 0) {
                i = bodyData.deviceType;
            }
            if ((i2 & 4) != 0) {
                str2 = bodyData.deviceId;
            }
            if ((i2 & 8) != 0) {
                str3 = bodyData.cmei;
            }
            if ((i2 & 16) != 0) {
                str4 = bodyData.f50937sn;
            }
            if ((i2 & 32) != 0) {
                str5 = bodyData.mac;
            }
            if ((i2 & 64) != 0) {
                obj = bodyData.sleepData;
            }
            String str6 = str5;
            Object obj3 = obj;
            String str7 = str4;
            String str8 = str2;
            return bodyData.copy(str, i, str8, str3, str7, str6, obj3);
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
            return this.f50937sn;
        }

        @aa1
        public final String component6() {
            return this.mac;
        }

        @aa1
        public final Object component7() {
            return this.sleepData;
        }

        @aa1
        public final BodyData copy(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object sleepData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(sleepData, "sleepData");
            return new BodyData(phone, i, deviceId, cmei, sn, mac, sleepData);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyData)) {
                return false;
            }
            BodyData bodyData = (BodyData) obj;
            return Intrinsics.XOO0ii0(this.phone, bodyData.phone) && this.deviceType == bodyData.deviceType && Intrinsics.XOO0ii0(this.deviceId, bodyData.deviceId) && Intrinsics.XOO0ii0(this.cmei, bodyData.cmei) && Intrinsics.XOO0ii0(this.f50937sn, bodyData.f50937sn) && Intrinsics.XOO0ii0(this.mac, bodyData.mac) && Intrinsics.XOO0ii0(this.sleepData, bodyData.sleepData);
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
        public final String getPhone() {
            return this.phone;
        }

        @aa1
        public final Object getSleepData() {
            return this.sleepData;
        }

        @aa1
        public final String getSn() {
            return this.f50937sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.f50937sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sleepData.hashCode();
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

        public final void setPhone(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.phone = str;
        }

        public final void setSleepData(@aa1 Object obj) {
            Intrinsics.X0O(obj, "<set-?>");
            this.sleepData = obj;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50937sn = str;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.f50937sn + ", mac=" + this.mac + ", sleepData=" + this.sleepData + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ BodyData(String str, int i, String str2, String str3, String str4, String str5, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? HykyAPI.DeviceType : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, obj);
        }
    }

    public static final class SleepData {

        @tb1
        private List<? extends Object> apneaArray;

        @tb1
        private Integer awakeCount;

        @tb1
        private Integer awakeDuration;

        @tb1
        private Integer bodyMoveCount;

        @tb1
        private List<? extends Object> breathRateArr;

        @tb1
        private List<? extends Object> heartRateArr;

        @tb1
        private Integer offBedDuration;

        @tb1
        private Integer offBedFrequency;

        @tb1
        private String offBedTime;

        @tb1
        private String onBedTime;

        @tb1
        private String recordTime;

        @aa1
        private String sleepDataId;
        private int sleepDataType;

        @tb1
        private String sleepEndTime;

        @tb1
        private String sleepStartTime;

        @tb1
        private List<Integer> sleepStatusArr;

        @tb1
        private List<? extends Object> turnOverArray;

        @tb1
        private Integer turningOverCount;

        public SleepData(@aa1 String sleepDataId, int i, @tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 String str4, @tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Integer num4, @tb1 Integer num5, @tb1 Integer num6, @tb1 String str5, @tb1 List<Integer> list, @tb1 List<? extends Object> list2, @tb1 List<? extends Object> list3, @tb1 List<? extends Object> list4, @tb1 List<? extends Object> list5) {
            Intrinsics.X0O(sleepDataId, "sleepDataId");
            this.sleepDataId = sleepDataId;
            this.sleepDataType = i;
            this.onBedTime = str;
            this.sleepStartTime = str2;
            this.sleepEndTime = str3;
            this.offBedTime = str4;
            this.offBedFrequency = num;
            this.offBedDuration = num2;
            this.bodyMoveCount = num3;
            this.turningOverCount = num4;
            this.awakeCount = num5;
            this.awakeDuration = num6;
            this.recordTime = str5;
            this.sleepStatusArr = list;
            this.heartRateArr = list2;
            this.breathRateArr = list3;
            this.apneaArray = list4;
            this.turnOverArray = list5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SleepData copy$default(SleepData sleepData, String str, int i, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str6, List list, List list2, List list3, List list4, List list5, int i2, Object obj) {
            List list6;
            List list7;
            String str7 = (i2 & 1) != 0 ? sleepData.sleepDataId : str;
            int i3 = (i2 & 2) != 0 ? sleepData.sleepDataType : i;
            String str8 = (i2 & 4) != 0 ? sleepData.onBedTime : str2;
            String str9 = (i2 & 8) != 0 ? sleepData.sleepStartTime : str3;
            String str10 = (i2 & 16) != 0 ? sleepData.sleepEndTime : str4;
            String str11 = (i2 & 32) != 0 ? sleepData.offBedTime : str5;
            Integer num7 = (i2 & 64) != 0 ? sleepData.offBedFrequency : num;
            Integer num8 = (i2 & 128) != 0 ? sleepData.offBedDuration : num2;
            Integer num9 = (i2 & 256) != 0 ? sleepData.bodyMoveCount : num3;
            Integer num10 = (i2 & 512) != 0 ? sleepData.turningOverCount : num4;
            Integer num11 = (i2 & 1024) != 0 ? sleepData.awakeCount : num5;
            Integer num12 = (i2 & 2048) != 0 ? sleepData.awakeDuration : num6;
            String str12 = (i2 & 4096) != 0 ? sleepData.recordTime : str6;
            List list8 = (i2 & 8192) != 0 ? sleepData.sleepStatusArr : list;
            String str13 = str7;
            List list9 = (i2 & 16384) != 0 ? sleepData.heartRateArr : list2;
            List list10 = (i2 & 32768) != 0 ? sleepData.breathRateArr : list3;
            List list11 = (i2 & 65536) != 0 ? sleepData.apneaArray : list4;
            if ((i2 & 131072) != 0) {
                list7 = list11;
                list6 = sleepData.turnOverArray;
            } else {
                list6 = list5;
                list7 = list11;
            }
            return sleepData.copy(str13, i3, str8, str9, str10, str11, num7, num8, num9, num10, num11, num12, str12, list8, list9, list10, list7, list6);
        }

        @aa1
        public final String component1() {
            return this.sleepDataId;
        }

        @tb1
        public final Integer component10() {
            return this.turningOverCount;
        }

        @tb1
        public final Integer component11() {
            return this.awakeCount;
        }

        @tb1
        public final Integer component12() {
            return this.awakeDuration;
        }

        @tb1
        public final String component13() {
            return this.recordTime;
        }

        @tb1
        public final List<Integer> component14() {
            return this.sleepStatusArr;
        }

        @tb1
        public final List<Object> component15() {
            return this.heartRateArr;
        }

        @tb1
        public final List<Object> component16() {
            return this.breathRateArr;
        }

        @tb1
        public final List<Object> component17() {
            return this.apneaArray;
        }

        @tb1
        public final List<Object> component18() {
            return this.turnOverArray;
        }

        public final int component2() {
            return this.sleepDataType;
        }

        @tb1
        public final String component3() {
            return this.onBedTime;
        }

        @tb1
        public final String component4() {
            return this.sleepStartTime;
        }

        @tb1
        public final String component5() {
            return this.sleepEndTime;
        }

        @tb1
        public final String component6() {
            return this.offBedTime;
        }

        @tb1
        public final Integer component7() {
            return this.offBedFrequency;
        }

        @tb1
        public final Integer component8() {
            return this.offBedDuration;
        }

        @tb1
        public final Integer component9() {
            return this.bodyMoveCount;
        }

        @aa1
        public final SleepData copy(@aa1 String sleepDataId, int i, @tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 String str4, @tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Integer num4, @tb1 Integer num5, @tb1 Integer num6, @tb1 String str5, @tb1 List<Integer> list, @tb1 List<? extends Object> list2, @tb1 List<? extends Object> list3, @tb1 List<? extends Object> list4, @tb1 List<? extends Object> list5) {
            Intrinsics.X0O(sleepDataId, "sleepDataId");
            return new SleepData(sleepDataId, i, str, str2, str3, str4, num, num2, num3, num4, num5, num6, str5, list, list2, list3, list4, list5);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SleepData)) {
                return false;
            }
            SleepData sleepData = (SleepData) obj;
            return Intrinsics.XOO0ii0(this.sleepDataId, sleepData.sleepDataId) && this.sleepDataType == sleepData.sleepDataType && Intrinsics.XOO0ii0(this.onBedTime, sleepData.onBedTime) && Intrinsics.XOO0ii0(this.sleepStartTime, sleepData.sleepStartTime) && Intrinsics.XOO0ii0(this.sleepEndTime, sleepData.sleepEndTime) && Intrinsics.XOO0ii0(this.offBedTime, sleepData.offBedTime) && Intrinsics.XOO0ii0(this.offBedFrequency, sleepData.offBedFrequency) && Intrinsics.XOO0ii0(this.offBedDuration, sleepData.offBedDuration) && Intrinsics.XOO0ii0(this.bodyMoveCount, sleepData.bodyMoveCount) && Intrinsics.XOO0ii0(this.turningOverCount, sleepData.turningOverCount) && Intrinsics.XOO0ii0(this.awakeCount, sleepData.awakeCount) && Intrinsics.XOO0ii0(this.awakeDuration, sleepData.awakeDuration) && Intrinsics.XOO0ii0(this.recordTime, sleepData.recordTime) && Intrinsics.XOO0ii0(this.sleepStatusArr, sleepData.sleepStatusArr) && Intrinsics.XOO0ii0(this.heartRateArr, sleepData.heartRateArr) && Intrinsics.XOO0ii0(this.breathRateArr, sleepData.breathRateArr) && Intrinsics.XOO0ii0(this.apneaArray, sleepData.apneaArray) && Intrinsics.XOO0ii0(this.turnOverArray, sleepData.turnOverArray);
        }

        @tb1
        public final List<Object> getApneaArray() {
            return this.apneaArray;
        }

        @tb1
        public final Integer getAwakeCount() {
            return this.awakeCount;
        }

        @tb1
        public final Integer getAwakeDuration() {
            return this.awakeDuration;
        }

        @tb1
        public final Integer getBodyMoveCount() {
            return this.bodyMoveCount;
        }

        @tb1
        public final List<Object> getBreathRateArr() {
            return this.breathRateArr;
        }

        @tb1
        public final List<Object> getHeartRateArr() {
            return this.heartRateArr;
        }

        @tb1
        public final Integer getOffBedDuration() {
            return this.offBedDuration;
        }

        @tb1
        public final Integer getOffBedFrequency() {
            return this.offBedFrequency;
        }

        @tb1
        public final String getOffBedTime() {
            return this.offBedTime;
        }

        @tb1
        public final String getOnBedTime() {
            return this.onBedTime;
        }

        @tb1
        public final String getRecordTime() {
            return this.recordTime;
        }

        @aa1
        public final String getSleepDataId() {
            return this.sleepDataId;
        }

        public final int getSleepDataType() {
            return this.sleepDataType;
        }

        @tb1
        public final String getSleepEndTime() {
            return this.sleepEndTime;
        }

        @tb1
        public final String getSleepStartTime() {
            return this.sleepStartTime;
        }

        @tb1
        public final List<Integer> getSleepStatusArr() {
            return this.sleepStatusArr;
        }

        @tb1
        public final List<Object> getTurnOverArray() {
            return this.turnOverArray;
        }

        @tb1
        public final Integer getTurningOverCount() {
            return this.turningOverCount;
        }

        public int hashCode() {
            int iHashCode = ((this.sleepDataId.hashCode() * 31) + Integer.hashCode(this.sleepDataType)) * 31;
            String str = this.onBedTime;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sleepStartTime;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sleepEndTime;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offBedTime;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.offBedFrequency;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.offBedDuration;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.bodyMoveCount;
            int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.turningOverCount;
            int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.awakeCount;
            int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.awakeDuration;
            int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str5 = this.recordTime;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<Integer> list = this.sleepStatusArr;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            List<? extends Object> list2 = this.heartRateArr;
            int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<? extends Object> list3 = this.breathRateArr;
            int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<? extends Object> list4 = this.apneaArray;
            int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<? extends Object> list5 = this.turnOverArray;
            return iHashCode16 + (list5 != null ? list5.hashCode() : 0);
        }

        public final void setApneaArray(@tb1 List<? extends Object> list) {
            this.apneaArray = list;
        }

        public final void setAwakeCount(@tb1 Integer num) {
            this.awakeCount = num;
        }

        public final void setAwakeDuration(@tb1 Integer num) {
            this.awakeDuration = num;
        }

        public final void setBodyMoveCount(@tb1 Integer num) {
            this.bodyMoveCount = num;
        }

        public final void setBreathRateArr(@tb1 List<? extends Object> list) {
            this.breathRateArr = list;
        }

        public final void setHeartRateArr(@tb1 List<? extends Object> list) {
            this.heartRateArr = list;
        }

        public final void setOffBedDuration(@tb1 Integer num) {
            this.offBedDuration = num;
        }

        public final void setOffBedFrequency(@tb1 Integer num) {
            this.offBedFrequency = num;
        }

        public final void setOffBedTime(@tb1 String str) {
            this.offBedTime = str;
        }

        public final void setOnBedTime(@tb1 String str) {
            this.onBedTime = str;
        }

        public final void setRecordTime(@tb1 String str) {
            this.recordTime = str;
        }

        public final void setSleepDataId(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.sleepDataId = str;
        }

        public final void setSleepDataType(int i) {
            this.sleepDataType = i;
        }

        public final void setSleepEndTime(@tb1 String str) {
            this.sleepEndTime = str;
        }

        public final void setSleepStartTime(@tb1 String str) {
            this.sleepStartTime = str;
        }

        public final void setSleepStatusArr(@tb1 List<Integer> list) {
            this.sleepStatusArr = list;
        }

        public final void setTurnOverArray(@tb1 List<? extends Object> list) {
            this.turnOverArray = list;
        }

        public final void setTurningOverCount(@tb1 Integer num) {
            this.turningOverCount = num;
        }

        @aa1
        public String toString() {
            return "SleepData(sleepDataId=" + this.sleepDataId + ", sleepDataType=" + this.sleepDataType + ", onBedTime=" + this.onBedTime + ", sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", offBedTime=" + this.offBedTime + ", offBedFrequency=" + this.offBedFrequency + ", offBedDuration=" + this.offBedDuration + ", bodyMoveCount=" + this.bodyMoveCount + ", turningOverCount=" + this.turningOverCount + ", awakeCount=" + this.awakeCount + ", awakeDuration=" + this.awakeDuration + ", recordTime=" + this.recordTime + ", sleepStatusArr=" + this.sleepStatusArr + ", heartRateArr=" + this.heartRateArr + ", breathRateArr=" + this.breathRateArr + ", apneaArray=" + this.apneaArray + ", turnOverArray=" + this.turnOverArray + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ SleepData(String str, int i, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str6, List list, List list2, List list3, List list4, List list5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : num4, (i2 & 1024) != 0 ? null : num5, (i2 & 2048) != 0 ? null : num6, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : list, (i2 & 16384) != 0 ? null : list2, (32768 & i2) != 0 ? null : list3, (65536 & i2) != 0 ? null : list4, (i2 & 131072) != 0 ? null : list5);
        }
    }
}
