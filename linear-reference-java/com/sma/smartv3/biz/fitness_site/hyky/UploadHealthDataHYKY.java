package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.constant.PermissionConstants;
import com.google.gson.annotations.SerializedName;
import com.sma.smartv3.network.GetGomoreAuthKey;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadHealthDataHYKY {

    @aa1
    public static final UploadHealthDataHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/healthData";

    public static final class BloodOxygen extends HealthBase {
        private int bloodOxygen;

        public BloodOxygen() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ BloodOxygen copy$default(BloodOxygen r0, int r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.bloodOxygen;
        L6:
            return r0.copy(r1);
        }

        public final int component1() {
            return this.bloodOxygen;
        }

        @aa1
        public final BloodOxygen copy(int r2) {
            return new BloodOxygen(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof BloodOxygen) == true) goto L9;
            return false;
        L9:
            if (this.bloodOxygen == ((BloodOxygen) r4).bloodOxygen) goto L11;
            return false;
        L11:
            return true;
        }

        public final int getBloodOxygen() {
            return this.bloodOxygen;
        }

        public int hashCode() {
            return Integer.hashCode(this.bloodOxygen);
        }

        public final void setBloodOxygen(int r1) {
            this.bloodOxygen = r1;
        }

        @aa1
        public String toString() {
            return "BloodOxygen(bloodOxygen=" + this.bloodOxygen + I000IiI1O.iO.iO;
        }

        public /* synthetic */ BloodOxygen(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = -1;
        L5:
            this(r1);
        }

        public BloodOxygen(int r2) {
            super(HealthIndex.BLOOD_OXYGEN);
            this.bloodOxygen = r2;
        }
    }

    public static final class BloodPressure extends HealthBase {
        private int bloodPressureHigh;
        private int bloodPressureLow;

        public BloodPressure() {
            int r2 = 0;
            this(r2, r2, 3, null);
        }

        public static /* synthetic */ BloodPressure copy$default(BloodPressure r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.bloodPressureLow;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.bloodPressureHigh;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.bloodPressureLow;
        }

        public final int component2() {
            return this.bloodPressureHigh;
        }

        @aa1
        public final BloodPressure copy(int r2, int r3) {
            return new BloodPressure(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BloodPressure) == true) goto L8;
            return false;
        L8:
            BloodPressure r6 = (BloodPressure) r5;
            if (this.bloodPressureLow == r6.bloodPressureLow) goto L12;
            return false;
        L12:
            if (this.bloodPressureHigh == r6.bloodPressureHigh) goto L14;
            return false;
        L14:
            return true;
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

        public final void setBloodPressureHigh(int r1) {
            this.bloodPressureHigh = r1;
        }

        public final void setBloodPressureLow(int r1) {
            this.bloodPressureLow = r1;
        }

        @aa1
        public String toString() {
            return "BloodPressure(bloodPressureLow=" + this.bloodPressureLow + ", bloodPressureHigh=" + this.bloodPressureHigh + I000IiI1O.iO.iO;
        }

        public /* synthetic */ BloodPressure(int r2, int r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = -1;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = -1;
        L8:
            this(r2, r3);
        }

        public BloodPressure(int r2, int r3) {
            super(HealthIndex.BLOOD_PRESSURE);
            this.bloodPressureLow = r2;
            this.bloodPressureHigh = r3;
        }
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

        @aa1
        private String sn;

        public BodyData(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 Object r8) {
            Intrinsics.X0O(r2, "phone");
            Intrinsics.X0O(r4, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r5, "cmei");
            Intrinsics.X0O(r6, "sn");
            Intrinsics.X0O(r7, "mac");
            Intrinsics.X0O(r8, "healthData");
            this.phone = r2;
            this.deviceType = r3;
            this.deviceId = r4;
            this.cmei = r5;
            this.sn = r6;
            this.mac = r7;
            this.healthData = r8;
        }

        public static /* synthetic */ BodyData copy$default(BodyData r0, String r1, int r2, String r3, String r4, String r5, String r6, Object r7, int r8, Object r9) {
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
            r7 = r0.healthData;
        L23:
            String r10 = r6;
            Object r11 = r7;
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

        @aa1
        public final Object component7() {
            return this.healthData;
        }

        @aa1
        public final BodyData copy(@aa1 String r10, int r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 Object r16) {
            Intrinsics.X0O(r10, "phone");
            Intrinsics.X0O(r12, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r13, "cmei");
            Intrinsics.X0O(r14, "sn");
            Intrinsics.X0O(r15, "mac");
            Intrinsics.X0O(r16, "healthData");
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
            if (Intrinsics.XOO0ii0(this.healthData, r6.healthData) == true) goto L29;
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
            return this.sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.healthData.hashCode();
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

        public final void setHealthData(@aa1 Object r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.healthData = r2;
        }

        public final void setMac(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mac = r2;
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
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.sn + ", mac=" + this.mac + ", healthData=" + this.healthData + I000IiI1O.iO.iO;
        }

        public /* synthetic */ BodyData(String r2, int r3, String r4, String r5, String r6, String r7, Object r8, int r9, DefaultConstructorMarker r10) {
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
            String r11 = "";
        L20:
            String r12 = r6;
            String r13 = r5;
            String r14 = r4;
            int r15 = r3;
            this(r2, r15, r14, r13, r12, r11, r8);
            return;
        L21:
            r11 = r7;
            goto L20
        }
    }

    public static class HealthBase {

        @aa1
        private HealthIndex healthIndex;

        @aa1
        private String recordTime;

        public HealthBase(@aa1 HealthIndex r2) {
            Intrinsics.X0O(r2, "healthType");
            this.healthIndex = r2;
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

        public final void setHealthIndex(@aa1 HealthIndex r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.healthIndex = r2;
        }

        public final void setRecordTime(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.recordTime = r2;
        }
    }

    public static final enum HealthIndex extends Enum<HealthIndex> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ HealthIndex[] $VALUES = null;

        @SerializedName("6")
        public static final HealthIndex BLOOD_OXYGEN = null;

        @SerializedName("1")
        public static final HealthIndex BLOOD_PRESSURE = null;

        @SerializedName("3")
        public static final HealthIndex HEART_RATE = null;

        @SerializedName(X10i1i.XOOI0O)
        public static final HealthIndex LOCATION = null;

        @SerializedName("8")
        public static final HealthIndex STEP_COUNT = null;

        @SerializedName("4")
        public static final HealthIndex TEMPERATURE = null;

        @SerializedName("5")
        public static final HealthIndex WEIGHT = null;

        @aa1
        private final String value;

        private static final /* synthetic */ HealthIndex[] $values() {
            return new HealthIndex[]{BLOOD_PRESSURE, HEART_RATE, TEMPERATURE, WEIGHT, BLOOD_OXYGEN, STEP_COUNT, LOCATION};
        }

        static {
            BLOOD_PRESSURE = new HealthIndex("BLOOD_PRESSURE", 0, "1");
            HEART_RATE = new HealthIndex("HEART_RATE", 1, "3");
            TEMPERATURE = new HealthIndex("TEMPERATURE", 2, "4");
            WEIGHT = new HealthIndex("WEIGHT", 3, "5");
            BLOOD_OXYGEN = new HealthIndex("BLOOD_OXYGEN", 4, "6");
            STEP_COUNT = new HealthIndex("STEP_COUNT", 5, "8");
            LOCATION = new HealthIndex(PermissionConstants.LOCATION, 6, X10i1i.XOOI0O);
            HealthIndex[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private HealthIndex(String r1, int r2, String r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<HealthIndex> getEntries() {
            return $ENTRIES;
        }

        public static HealthIndex valueOf(String r1) {
            return (HealthIndex) Enum.valueOf(HealthIndex.class, r1);
        }

        public static HealthIndex[] values() {
            return (HealthIndex[]) $VALUES.clone();
        }

        @aa1
        public final String getValue() {
            return this.value;
        }
    }

    public static final class HeartRate extends HealthBase {
        private int heartRate;

        public HeartRate() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ HeartRate copy$default(HeartRate r0, int r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.heartRate;
        L6:
            return r0.copy(r1);
        }

        public final int component1() {
            return this.heartRate;
        }

        @aa1
        public final HeartRate copy(int r2) {
            return new HeartRate(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof HeartRate) == true) goto L9;
            return false;
        L9:
            if (this.heartRate == ((HeartRate) r4).heartRate) goto L11;
            return false;
        L11:
            return true;
        }

        public final int getHeartRate() {
            return this.heartRate;
        }

        public int hashCode() {
            return Integer.hashCode(this.heartRate);
        }

        public final void setHeartRate(int r1) {
            this.heartRate = r1;
        }

        @aa1
        public String toString() {
            return "HeartRate(heartRate=" + this.heartRate + I000IiI1O.iO.iO;
        }

        public /* synthetic */ HeartRate(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = -1;
        L5:
            this(r1);
        }

        public HeartRate(int r2) {
            super(HealthIndex.HEART_RATE);
            this.heartRate = r2;
        }
    }

    public static final class Location extends HealthBase {

        @aa1
        private String location;

        /* JADX WARN: Multi-variable type inference failed */
        public Location() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Location copy$default(Location r0, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.location;
        L6:
            return r0.copy(r1);
        }

        @aa1
        public final String component1() {
            return this.location;
        }

        @aa1
        public final Location copy(@aa1 String r2) {
            Intrinsics.X0O(r2, "location");
            return new Location(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof Location) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.location, ((Location) r4).location) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @aa1
        public final String getLocation() {
            return this.location;
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        public final void setLocation(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.location = r2;
        }

        @aa1
        public String toString() {
            return "Location(location=" + this.location + I000IiI1O.iO.iO;
        }

        public /* synthetic */ Location(String r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "";
        L5:
            this(r1);
        }

        public Location(@aa1 String r2) {
            Intrinsics.X0O(r2, "location");
            super(HealthIndex.LOCATION);
            this.location = r2;
        }
    }

    public static final class StepCount extends HealthBase {
        private int step;

        public StepCount() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ StepCount copy$default(StepCount r0, int r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.step;
        L6:
            return r0.copy(r1);
        }

        public final int component1() {
            return this.step;
        }

        @aa1
        public final StepCount copy(int r2) {
            return new StepCount(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof StepCount) == true) goto L9;
            return false;
        L9:
            if (this.step == ((StepCount) r4).step) goto L11;
            return false;
        L11:
            return true;
        }

        public final int getStep() {
            return this.step;
        }

        public int hashCode() {
            return Integer.hashCode(this.step);
        }

        public final void setStep(int r1) {
            this.step = r1;
        }

        @aa1
        public String toString() {
            return "StepCount(step=" + this.step + I000IiI1O.iO.iO;
        }

        public /* synthetic */ StepCount(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = -1;
        L5:
            this(r1);
        }

        public StepCount(int r2) {
            super(HealthIndex.STEP_COUNT);
            this.step = r2;
        }
    }

    public static final class Temperature extends HealthBase {
        private double temperature;

        public Temperature() {
            double r2 = 0.0d;
            this(r2, 1, null);
        }

        public static /* synthetic */ Temperature copy$default(Temperature r0, double r1, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.temperature;
        L6:
            return r0.copy(r1);
        }

        public final double component1() {
            return this.temperature;
        }

        @aa1
        public final Temperature copy(double r2) {
            return new Temperature(r2);
        }

        public boolean equals(@tb1 Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Temperature) == true) goto L9;
            return false;
        L9:
            if (Double.compare(this.temperature, ((Temperature) r8).temperature) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public final double getTemperature() {
            return this.temperature;
        }

        public int hashCode() {
            return Double.hashCode(this.temperature);
        }

        public final void setTemperature(double r1) {
            this.temperature = r1;
        }

        @aa1
        public String toString() {
            return "Temperature(temperature=" + this.temperature + I000IiI1O.iO.iO;
        }

        public /* synthetic */ Temperature(double r1, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 1) == 0) goto L5;
            r1 = -1.0d;
        L5:
            this(r1);
        }

        public Temperature(double r2) {
            super(HealthIndex.TEMPERATURE);
            this.temperature = r2;
        }
    }

    public static final class Weight extends HealthBase {
        private double weight;

        public Weight() {
            double r2 = 0.0d;
            this(r2, 1, null);
        }

        public static /* synthetic */ Weight copy$default(Weight r0, double r1, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.weight;
        L6:
            return r0.copy(r1);
        }

        public final double component1() {
            return this.weight;
        }

        @aa1
        public final Weight copy(double r2) {
            return new Weight(r2);
        }

        public boolean equals(@tb1 Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Weight) == true) goto L9;
            return false;
        L9:
            if (Double.compare(this.weight, ((Weight) r8).weight) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public final double getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Double.hashCode(this.weight);
        }

        public final void setWeight(double r1) {
            this.weight = r1;
        }

        @aa1
        public String toString() {
            return "Weight(weight=" + this.weight + I000IiI1O.iO.iO;
        }

        public /* synthetic */ Weight(double r1, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 1) == 0) goto L5;
            r1 = -1.0d;
        L5:
            this(r1);
        }

        public Weight(double r2) {
            super(HealthIndex.WEIGHT);
            this.weight = r2;
        }
    }

    static {
        INSTANCE = new UploadHealthDataHYKY();
    }

    private UploadHealthDataHYKY() {
    }
}
