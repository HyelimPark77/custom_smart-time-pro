package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadHealthDataHYKY {

    @aa1
    public static final UploadHealthDataHYKY INSTANCE = new UploadHealthDataHYKY();

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/healthData";

    public static final class BloodOxygen extends HealthBase {
        private int bloodOxygen;

        public BloodOxygen() {
            this(0, 1, null);
        }

        public static /* synthetic */ BloodOxygen copy$default(BloodOxygen bloodOxygen, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bloodOxygen.bloodOxygen;
            }
            return bloodOxygen.copy(i);
        }

        public final int component1() {
            return this.bloodOxygen;
        }

        @aa1
        public final BloodOxygen copy(int i) {
            return new BloodOxygen(i);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BloodOxygen) && this.bloodOxygen == ((BloodOxygen) obj).bloodOxygen;
        }

        public final int getBloodOxygen() {
            return this.bloodOxygen;
        }

        public int hashCode() {
            return Integer.hashCode(this.bloodOxygen);
        }

        public final void setBloodOxygen(int i) {
            this.bloodOxygen = i;
        }

        @aa1
        public String toString() {
            return "BloodOxygen(bloodOxygen=" + this.bloodOxygen + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ BloodOxygen(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }

        public BloodOxygen(int i) {
            super(HealthIndex.BLOOD_OXYGEN);
            this.bloodOxygen = i;
        }
    }

    public static final class BloodPressure extends HealthBase {
        private int bloodPressureHigh;
        private int bloodPressureLow;

        /* JADX WARN: Illegal instructions before constructor call */
        public BloodPressure() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ BloodPressure copy$default(BloodPressure bloodPressure, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bloodPressure.bloodPressureLow;
            }
            if ((i3 & 2) != 0) {
                i2 = bloodPressure.bloodPressureHigh;
            }
            return bloodPressure.copy(i, i2);
        }

        public final int component1() {
            return this.bloodPressureLow;
        }

        public final int component2() {
            return this.bloodPressureHigh;
        }

        @aa1
        public final BloodPressure copy(int i, int i2) {
            return new BloodPressure(i, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BloodPressure)) {
                return false;
            }
            BloodPressure bloodPressure = (BloodPressure) obj;
            return this.bloodPressureLow == bloodPressure.bloodPressureLow && this.bloodPressureHigh == bloodPressure.bloodPressureHigh;
        }

        public final int getBloodPressureHigh() {
            return this.bloodPressureHigh;
        }

        public final int getBloodPressureLow() {
            return this.bloodPressureLow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.bloodPressureLow) * 31) + Integer.hashCode(this.bloodPressureHigh);
        }

        public final void setBloodPressureHigh(int i) {
            this.bloodPressureHigh = i;
        }

        public final void setBloodPressureLow(int i) {
            this.bloodPressureLow = i;
        }

        @aa1
        public String toString() {
            return "BloodPressure(bloodPressureLow=" + this.bloodPressureLow + ", bloodPressureHigh=" + this.bloodPressureHigh + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ BloodPressure(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
        }

        public BloodPressure(int i, int i2) {
            super(HealthIndex.BLOOD_PRESSURE);
            this.bloodPressureLow = i;
            this.bloodPressureHigh = i2;
        }
    }

    public static class HealthBase {

        @aa1
        private HealthIndex healthIndex;

        @aa1
        private String recordTime;

        public HealthBase(@aa1 HealthIndex healthType) {
            Intrinsics.X0O(healthType, "healthType");
            this.healthIndex = healthType;
            this.recordTime = "";
        }

        @aa1
        public final HealthIndex getHealthIndex() {
            return this.healthIndex;
        }

        @aa1
        public final String getRecordTime() {
            return this.recordTime;
        }

        public final void setHealthIndex(@aa1 HealthIndex healthIndex) {
            Intrinsics.X0O(healthIndex, "<set-?>");
            this.healthIndex = healthIndex;
        }

        public final void setRecordTime(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.recordTime = str;
        }
    }

    public enum HealthIndex {
        BLOOD_PRESSURE("1"),
        HEART_RATE("3"),
        TEMPERATURE("4"),
        WEIGHT("5"),
        BLOOD_OXYGEN("6"),
        STEP_COUNT("8"),
        LOCATION(X10i1i.XOOI0O);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        private final String value;

        HealthIndex(String str) {
            this.value = str;
        }

        @aa1
        public static EnumEntries<HealthIndex> getEntries() {
            return $ENTRIES;
        }

        @aa1
        public final String getValue() {
            return this.value;
        }
    }

    public static final class HeartRate extends HealthBase {
        private int heartRate;

        public HeartRate() {
            this(0, 1, null);
        }

        public static /* synthetic */ HeartRate copy$default(HeartRate heartRate, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = heartRate.heartRate;
            }
            return heartRate.copy(i);
        }

        public final int component1() {
            return this.heartRate;
        }

        @aa1
        public final HeartRate copy(int i) {
            return new HeartRate(i);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeartRate) && this.heartRate == ((HeartRate) obj).heartRate;
        }

        public final int getHeartRate() {
            return this.heartRate;
        }

        public int hashCode() {
            return Integer.hashCode(this.heartRate);
        }

        public final void setHeartRate(int i) {
            this.heartRate = i;
        }

        @aa1
        public String toString() {
            return "HeartRate(heartRate=" + this.heartRate + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ HeartRate(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }

        public HeartRate(int i) {
            super(HealthIndex.HEART_RATE);
            this.heartRate = i;
        }
    }

    public static final class Location extends HealthBase {

        @aa1
        private String location;

        /* JADX WARN: Multi-variable type inference failed */
        public Location() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Location copy$default(Location location, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = location.location;
            }
            return location.copy(str);
        }

        @aa1
        public final String component1() {
            return this.location;
        }

        @aa1
        public final Location copy(@aa1 String location) {
            Intrinsics.X0O(location, "location");
            return new Location(location);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Location) && Intrinsics.XOO0ii0(this.location, ((Location) obj).location);
        }

        @aa1
        public final String getLocation() {
            return this.location;
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        public final void setLocation(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.location = str;
        }

        @aa1
        public String toString() {
            return "Location(location=" + this.location + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ Location(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Location(@aa1 String location) {
            super(HealthIndex.LOCATION);
            Intrinsics.X0O(location, "location");
            this.location = location;
        }
    }

    public static final class StepCount extends HealthBase {
        private int step;

        public StepCount() {
            this(0, 1, null);
        }

        public static /* synthetic */ StepCount copy$default(StepCount stepCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stepCount.step;
            }
            return stepCount.copy(i);
        }

        public final int component1() {
            return this.step;
        }

        @aa1
        public final StepCount copy(int i) {
            return new StepCount(i);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StepCount) && this.step == ((StepCount) obj).step;
        }

        public final int getStep() {
            return this.step;
        }

        public int hashCode() {
            return Integer.hashCode(this.step);
        }

        public final void setStep(int i) {
            this.step = i;
        }

        @aa1
        public String toString() {
            return "StepCount(step=" + this.step + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ StepCount(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }

        public StepCount(int i) {
            super(HealthIndex.STEP_COUNT);
            this.step = i;
        }
    }

    public static final class Temperature extends HealthBase {
        private double temperature;

        public Temperature() {
            this(0.0d, 1, null);
        }

        public static /* synthetic */ Temperature copy$default(Temperature temperature, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = temperature.temperature;
            }
            return temperature.copy(d);
        }

        public final double component1() {
            return this.temperature;
        }

        @aa1
        public final Temperature copy(double d) {
            return new Temperature(d);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Temperature) && Double.compare(this.temperature, ((Temperature) obj).temperature) == 0;
        }

        public final double getTemperature() {
            return this.temperature;
        }

        public int hashCode() {
            return Double.hashCode(this.temperature);
        }

        public final void setTemperature(double d) {
            this.temperature = d;
        }

        @aa1
        public String toString() {
            return "Temperature(temperature=" + this.temperature + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ Temperature(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? -1.0d : d);
        }

        public Temperature(double d) {
            super(HealthIndex.TEMPERATURE);
            this.temperature = d;
        }
    }

    public static final class Weight extends HealthBase {
        private double weight;

        public Weight() {
            this(0.0d, 1, null);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = weight.weight;
            }
            return weight.copy(d);
        }

        public final double component1() {
            return this.weight;
        }

        @aa1
        public final Weight copy(double d) {
            return new Weight(d);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Weight) && Double.compare(this.weight, ((Weight) obj).weight) == 0;
        }

        public final double getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Double.hashCode(this.weight);
        }

        public final void setWeight(double d) {
            this.weight = d;
        }

        @aa1
        public String toString() {
            return "Weight(weight=" + this.weight + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ Weight(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? -1.0d : d);
        }

        public Weight(double d) {
            super(HealthIndex.WEIGHT);
            this.weight = d;
        }
    }

    private UploadHealthDataHYKY() {
    }

    public static final class BodyData {

        @aa1
        private String cmei;

        @aa1
        private String deviceId;
        private int deviceType;

        @aa1
        private Object healthData;

        @aa1
        private String mac;

        @aa1
        private String phone;

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f50936sn;

        public BodyData(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object healthData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(healthData, "healthData");
            this.phone = phone;
            this.deviceType = i;
            this.deviceId = deviceId;
            this.cmei = cmei;
            this.f50936sn = sn;
            this.mac = mac;
            this.healthData = healthData;
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
                str4 = bodyData.f50936sn;
            }
            if ((i2 & 32) != 0) {
                str5 = bodyData.mac;
            }
            if ((i2 & 64) != 0) {
                obj = bodyData.healthData;
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
            return this.f50936sn;
        }

        @aa1
        public final String component6() {
            return this.mac;
        }

        @aa1
        public final Object component7() {
            return this.healthData;
        }

        @aa1
        public final BodyData copy(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object healthData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(healthData, "healthData");
            return new BodyData(phone, i, deviceId, cmei, sn, mac, healthData);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyData)) {
                return false;
            }
            BodyData bodyData = (BodyData) obj;
            return Intrinsics.XOO0ii0(this.phone, bodyData.phone) && this.deviceType == bodyData.deviceType && Intrinsics.XOO0ii0(this.deviceId, bodyData.deviceId) && Intrinsics.XOO0ii0(this.cmei, bodyData.cmei) && Intrinsics.XOO0ii0(this.f50936sn, bodyData.f50936sn) && Intrinsics.XOO0ii0(this.mac, bodyData.mac) && Intrinsics.XOO0ii0(this.healthData, bodyData.healthData);
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
        public final Object getHealthData() {
            return this.healthData;
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
        public final String getSn() {
            return this.f50936sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.f50936sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.healthData.hashCode();
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

        public final void setHealthData(@aa1 Object obj) {
            Intrinsics.X0O(obj, "<set-?>");
            this.healthData = obj;
        }

        public final void setMac(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.mac = str;
        }

        public final void setPhone(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.phone = str;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50936sn = str;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.f50936sn + ", mac=" + this.mac + ", healthData=" + this.healthData + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ BodyData(String str, int i, String str2, String str3, String str4, String str5, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? HykyAPI.DeviceType : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, obj);
        }
    }
}
