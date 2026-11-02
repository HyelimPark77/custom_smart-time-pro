package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceConfigInfo extends JsonFieldContainer {
    private int alarmWithTag;

    @tb1
    private CustomConfigInfo customConfig;
    private int defHeartRateMonitoringSwitch;

    @aa1
    private String deviceImage;

    @aa1
    private String deviceImage2;

    @aa1
    private String devicePlatform;

    @aa1
    private String devicePrototype;
    private int firmwareId;

    /* JADX INFO: renamed from: id */
    private int f51307id;

    @tb1
    private MacConfig macConfig;
    private int projectId;
    private int requireReadAlarm;
    private int requireReadNoDisturb;
    private int scheduleMax;
    private int supWarnTipGuide;
    private int supWf;

    @aa1
    private String supportBackLightTimeArrays;
    private int supportGirlCare;
    private int supportMusic;
    private int supportNFC;
    private int supportPeriodicHeartRateMonitoring;
    private int supportSyncContact;

    public DeviceConfigInfo(int i, int i2, int i3, @aa1 String devicePrototype, @aa1 String devicePlatform, @aa1 String deviceImage, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, @aa1 String supportBackLightTimeArrays, int i12, int i13, int i14, int i15, @tb1 CustomConfigInfo customConfigInfo, @aa1 String deviceImage2, @tb1 MacConfig macConfig) {
        Intrinsics.X0O(devicePrototype, "devicePrototype");
        Intrinsics.X0O(devicePlatform, "devicePlatform");
        Intrinsics.X0O(deviceImage, "deviceImage");
        Intrinsics.X0O(supportBackLightTimeArrays, "supportBackLightTimeArrays");
        Intrinsics.X0O(deviceImage2, "deviceImage2");
        this.f51307id = i;
        this.projectId = i2;
        this.firmwareId = i3;
        this.devicePrototype = devicePrototype;
        this.devicePlatform = devicePlatform;
        this.deviceImage = deviceImage;
        this.supportSyncContact = i4;
        this.requireReadAlarm = i5;
        this.alarmWithTag = i6;
        this.scheduleMax = i7;
        this.requireReadNoDisturb = i8;
        this.supportPeriodicHeartRateMonitoring = i9;
        this.defHeartRateMonitoringSwitch = i10;
        this.supportGirlCare = i11;
        this.supportBackLightTimeArrays = supportBackLightTimeArrays;
        this.supportMusic = i12;
        this.supportNFC = i13;
        this.supWf = i14;
        this.supWarnTipGuide = i15;
        this.customConfig = customConfigInfo;
        this.deviceImage2 = deviceImage2;
        this.macConfig = macConfig;
    }

    public static /* synthetic */ DeviceConfigInfo copy$default(DeviceConfigInfo deviceConfigInfo, int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str4, int i12, int i13, int i14, int i15, CustomConfigInfo customConfigInfo, String str5, MacConfig macConfig, int i16, Object obj) {
        MacConfig macConfig2;
        String str6;
        int i17 = (i16 & 1) != 0 ? deviceConfigInfo.f51307id : i;
        int i18 = (i16 & 2) != 0 ? deviceConfigInfo.projectId : i2;
        int i19 = (i16 & 4) != 0 ? deviceConfigInfo.firmwareId : i3;
        String str7 = (i16 & 8) != 0 ? deviceConfigInfo.devicePrototype : str;
        String str8 = (i16 & 16) != 0 ? deviceConfigInfo.devicePlatform : str2;
        String str9 = (i16 & 32) != 0 ? deviceConfigInfo.deviceImage : str3;
        int i20 = (i16 & 64) != 0 ? deviceConfigInfo.supportSyncContact : i4;
        int i21 = (i16 & 128) != 0 ? deviceConfigInfo.requireReadAlarm : i5;
        int i22 = (i16 & 256) != 0 ? deviceConfigInfo.alarmWithTag : i6;
        int i23 = (i16 & 512) != 0 ? deviceConfigInfo.scheduleMax : i7;
        int i24 = (i16 & 1024) != 0 ? deviceConfigInfo.requireReadNoDisturb : i8;
        int i25 = (i16 & 2048) != 0 ? deviceConfigInfo.supportPeriodicHeartRateMonitoring : i9;
        int i26 = (i16 & 4096) != 0 ? deviceConfigInfo.defHeartRateMonitoringSwitch : i10;
        int i27 = (i16 & 8192) != 0 ? deviceConfigInfo.supportGirlCare : i11;
        int i28 = i17;
        String str10 = (i16 & 16384) != 0 ? deviceConfigInfo.supportBackLightTimeArrays : str4;
        int i29 = (i16 & 32768) != 0 ? deviceConfigInfo.supportMusic : i12;
        int i30 = (i16 & 65536) != 0 ? deviceConfigInfo.supportNFC : i13;
        int i31 = (i16 & 131072) != 0 ? deviceConfigInfo.supWf : i14;
        int i32 = (i16 & 262144) != 0 ? deviceConfigInfo.supWarnTipGuide : i15;
        CustomConfigInfo customConfigInfo2 = (i16 & 524288) != 0 ? deviceConfigInfo.customConfig : customConfigInfo;
        String str11 = (i16 & 1048576) != 0 ? deviceConfigInfo.deviceImage2 : str5;
        if ((i16 & 2097152) != 0) {
            str6 = str11;
            macConfig2 = deviceConfigInfo.macConfig;
        } else {
            macConfig2 = macConfig;
            str6 = str11;
        }
        return deviceConfigInfo.copy(i28, i18, i19, str7, str8, str9, i20, i21, i22, i23, i24, i25, i26, i27, str10, i29, i30, i31, i32, customConfigInfo2, str6, macConfig2);
    }

    public final int component1() {
        return this.f51307id;
    }

    public final int component10() {
        return this.scheduleMax;
    }

    public final int component11() {
        return this.requireReadNoDisturb;
    }

    public final int component12() {
        return this.supportPeriodicHeartRateMonitoring;
    }

    public final int component13() {
        return this.defHeartRateMonitoringSwitch;
    }

    public final int component14() {
        return this.supportGirlCare;
    }

    @aa1
    public final String component15() {
        return this.supportBackLightTimeArrays;
    }

    public final int component16() {
        return this.supportMusic;
    }

    public final int component17() {
        return this.supportNFC;
    }

    public final int component18() {
        return this.supWf;
    }

    public final int component19() {
        return this.supWarnTipGuide;
    }

    public final int component2() {
        return this.projectId;
    }

    @tb1
    public final CustomConfigInfo component20() {
        return this.customConfig;
    }

    @aa1
    public final String component21() {
        return this.deviceImage2;
    }

    @tb1
    public final MacConfig component22() {
        return this.macConfig;
    }

    public final int component3() {
        return this.firmwareId;
    }

    @aa1
    public final String component4() {
        return this.devicePrototype;
    }

    @aa1
    public final String component5() {
        return this.devicePlatform;
    }

    @aa1
    public final String component6() {
        return this.deviceImage;
    }

    public final int component7() {
        return this.supportSyncContact;
    }

    public final int component8() {
        return this.requireReadAlarm;
    }

    public final int component9() {
        return this.alarmWithTag;
    }

    @aa1
    public final DeviceConfigInfo copy(int i, int i2, int i3, @aa1 String devicePrototype, @aa1 String devicePlatform, @aa1 String deviceImage, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, @aa1 String supportBackLightTimeArrays, int i12, int i13, int i14, int i15, @tb1 CustomConfigInfo customConfigInfo, @aa1 String deviceImage2, @tb1 MacConfig macConfig) {
        Intrinsics.X0O(devicePrototype, "devicePrototype");
        Intrinsics.X0O(devicePlatform, "devicePlatform");
        Intrinsics.X0O(deviceImage, "deviceImage");
        Intrinsics.X0O(supportBackLightTimeArrays, "supportBackLightTimeArrays");
        Intrinsics.X0O(deviceImage2, "deviceImage2");
        return new DeviceConfigInfo(i, i2, i3, devicePrototype, devicePlatform, deviceImage, i4, i5, i6, i7, i8, i9, i10, i11, supportBackLightTimeArrays, i12, i13, i14, i15, customConfigInfo, deviceImage2, macConfig);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceConfigInfo)) {
            return false;
        }
        DeviceConfigInfo deviceConfigInfo = (DeviceConfigInfo) obj;
        return this.f51307id == deviceConfigInfo.f51307id && this.projectId == deviceConfigInfo.projectId && this.firmwareId == deviceConfigInfo.firmwareId && Intrinsics.XOO0ii0(this.devicePrototype, deviceConfigInfo.devicePrototype) && Intrinsics.XOO0ii0(this.devicePlatform, deviceConfigInfo.devicePlatform) && Intrinsics.XOO0ii0(this.deviceImage, deviceConfigInfo.deviceImage) && this.supportSyncContact == deviceConfigInfo.supportSyncContact && this.requireReadAlarm == deviceConfigInfo.requireReadAlarm && this.alarmWithTag == deviceConfigInfo.alarmWithTag && this.scheduleMax == deviceConfigInfo.scheduleMax && this.requireReadNoDisturb == deviceConfigInfo.requireReadNoDisturb && this.supportPeriodicHeartRateMonitoring == deviceConfigInfo.supportPeriodicHeartRateMonitoring && this.defHeartRateMonitoringSwitch == deviceConfigInfo.defHeartRateMonitoringSwitch && this.supportGirlCare == deviceConfigInfo.supportGirlCare && Intrinsics.XOO0ii0(this.supportBackLightTimeArrays, deviceConfigInfo.supportBackLightTimeArrays) && this.supportMusic == deviceConfigInfo.supportMusic && this.supportNFC == deviceConfigInfo.supportNFC && this.supWf == deviceConfigInfo.supWf && this.supWarnTipGuide == deviceConfigInfo.supWarnTipGuide && Intrinsics.XOO0ii0(this.customConfig, deviceConfigInfo.customConfig) && Intrinsics.XOO0ii0(this.deviceImage2, deviceConfigInfo.deviceImage2) && Intrinsics.XOO0ii0(this.macConfig, deviceConfigInfo.macConfig);
    }

    public final int getAlarmWithTag() {
        return this.alarmWithTag;
    }

    @tb1
    public final CustomConfigInfo getCustomConfig() {
        return this.customConfig;
    }

    public final int getDefHeartRateMonitoringSwitch() {
        return this.defHeartRateMonitoringSwitch;
    }

    @aa1
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    @aa1
    public final String getDeviceImage2() {
        return this.deviceImage2;
    }

    @aa1
    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    @aa1
    public final String getDevicePrototype() {
        return this.devicePrototype;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final int getId() {
        return this.f51307id;
    }

    @tb1
    public final MacConfig getMacConfig() {
        return this.macConfig;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final int getRequireReadAlarm() {
        return this.requireReadAlarm;
    }

    public final int getRequireReadNoDisturb() {
        return this.requireReadNoDisturb;
    }

    public final int getScheduleMax() {
        return this.scheduleMax;
    }

    public final int getSupWarnTipGuide() {
        return this.supWarnTipGuide;
    }

    public final int getSupWf() {
        return this.supWf;
    }

    @aa1
    public final String getSupportBackLightTimeArrays() {
        return this.supportBackLightTimeArrays;
    }

    public final int getSupportGirlCare() {
        return this.supportGirlCare;
    }

    public final int getSupportMusic() {
        return this.supportMusic;
    }

    public final int getSupportNFC() {
        return this.supportNFC;
    }

    public final int getSupportPeriodicHeartRateMonitoring() {
        return this.supportPeriodicHeartRateMonitoring;
    }

    public final int getSupportSyncContact() {
        return this.supportSyncContact;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((Integer.hashCode(this.f51307id) * 31) + Integer.hashCode(this.projectId)) * 31) + Integer.hashCode(this.firmwareId)) * 31) + this.devicePrototype.hashCode()) * 31) + this.devicePlatform.hashCode()) * 31) + this.deviceImage.hashCode()) * 31) + Integer.hashCode(this.supportSyncContact)) * 31) + Integer.hashCode(this.requireReadAlarm)) * 31) + Integer.hashCode(this.alarmWithTag)) * 31) + Integer.hashCode(this.scheduleMax)) * 31) + Integer.hashCode(this.requireReadNoDisturb)) * 31) + Integer.hashCode(this.supportPeriodicHeartRateMonitoring)) * 31) + Integer.hashCode(this.defHeartRateMonitoringSwitch)) * 31) + Integer.hashCode(this.supportGirlCare)) * 31) + this.supportBackLightTimeArrays.hashCode()) * 31) + Integer.hashCode(this.supportMusic)) * 31) + Integer.hashCode(this.supportNFC)) * 31) + Integer.hashCode(this.supWf)) * 31) + Integer.hashCode(this.supWarnTipGuide)) * 31;
        CustomConfigInfo customConfigInfo = this.customConfig;
        int iHashCode2 = (((iHashCode + (customConfigInfo == null ? 0 : customConfigInfo.hashCode())) * 31) + this.deviceImage2.hashCode()) * 31;
        MacConfig macConfig = this.macConfig;
        return iHashCode2 + (macConfig != null ? macConfig.hashCode() : 0);
    }

    public final void setAlarmWithTag(int i) {
        this.alarmWithTag = i;
    }

    public final void setCustomConfig(@tb1 CustomConfigInfo customConfigInfo) {
        this.customConfig = customConfigInfo;
    }

    public final void setDefHeartRateMonitoringSwitch(int i) {
        this.defHeartRateMonitoringSwitch = i;
    }

    public final void setDeviceImage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.deviceImage = str;
    }

    public final void setDeviceImage2(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.deviceImage2 = str;
    }

    public final void setDevicePlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.devicePlatform = str;
    }

    public final void setDevicePrototype(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.devicePrototype = str;
    }

    public final void setFirmwareId(int i) {
        this.firmwareId = i;
    }

    public final void setId(int i) {
        this.f51307id = i;
    }

    public final void setMacConfig(@tb1 MacConfig macConfig) {
        this.macConfig = macConfig;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setRequireReadAlarm(int i) {
        this.requireReadAlarm = i;
    }

    public final void setRequireReadNoDisturb(int i) {
        this.requireReadNoDisturb = i;
    }

    public final void setScheduleMax(int i) {
        this.scheduleMax = i;
    }

    public final void setSupWarnTipGuide(int i) {
        this.supWarnTipGuide = i;
    }

    public final void setSupWf(int i) {
        this.supWf = i;
    }

    public final void setSupportBackLightTimeArrays(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supportBackLightTimeArrays = str;
    }

    public final void setSupportGirlCare(int i) {
        this.supportGirlCare = i;
    }

    public final void setSupportMusic(int i) {
        this.supportMusic = i;
    }

    public final void setSupportNFC(int i) {
        this.supportNFC = i;
    }

    public final void setSupportPeriodicHeartRateMonitoring(int i) {
        this.supportPeriodicHeartRateMonitoring = i;
    }

    public final void setSupportSyncContact(int i) {
        this.supportSyncContact = i;
    }

    @aa1
    public String toString() {
        return "DeviceConfigInfo(id=" + this.f51307id + ", projectId=" + this.projectId + ", firmwareId=" + this.firmwareId + ", devicePrototype=" + this.devicePrototype + ", devicePlatform=" + this.devicePlatform + ", deviceImage=" + this.deviceImage + ", supportSyncContact=" + this.supportSyncContact + ", requireReadAlarm=" + this.requireReadAlarm + ", alarmWithTag=" + this.alarmWithTag + ", scheduleMax=" + this.scheduleMax + ", requireReadNoDisturb=" + this.requireReadNoDisturb + ", supportPeriodicHeartRateMonitoring=" + this.supportPeriodicHeartRateMonitoring + ", defHeartRateMonitoringSwitch=" + this.defHeartRateMonitoringSwitch + ", supportGirlCare=" + this.supportGirlCare + ", supportBackLightTimeArrays=" + this.supportBackLightTimeArrays + ", supportMusic=" + this.supportMusic + ", supportNFC=" + this.supportNFC + ", supWf=" + this.supWf + ", supWarnTipGuide=" + this.supWarnTipGuide + ", customConfig=" + this.customConfig + ", deviceImage2=" + this.deviceImage2 + ", macConfig=" + this.macConfig + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ DeviceConfigInfo(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str4, int i12, int i13, int i14, int i15, CustomConfigInfo customConfigInfo, String str5, MacConfig macConfig, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i, (i16 & 2) != 0 ? 0 : i2, (i16 & 4) != 0 ? 0 : i3, (i16 & 8) != 0 ? "" : str, (i16 & 16) != 0 ? "" : str2, (i16 & 32) != 0 ? "" : str3, (i16 & 64) != 0 ? 0 : i4, (i16 & 128) != 0 ? 0 : i5, (i16 & 256) != 0 ? 0 : i6, (i16 & 512) != 0 ? 0 : i7, (i16 & 1024) != 0 ? 0 : i8, (i16 & 2048) != 0 ? 0 : i9, (i16 & 4096) != 0 ? 0 : i10, (i16 & 8192) != 0 ? 0 : i11, (i16 & 16384) != 0 ? "" : str4, (32768 & i16) != 0 ? 0 : i12, (65536 & i16) != 0 ? 0 : i13, (131072 & i16) != 0 ? 0 : i14, (262144 & i16) != 0 ? 0 : i15, customConfigInfo, (i16 & 1048576) != 0 ? "" : str5, macConfig);
    }
}
