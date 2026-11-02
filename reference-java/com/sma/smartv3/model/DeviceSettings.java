package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleCoaching;
import com.szabh.smable3.entity.BleDrinkWaterSettings;
import com.szabh.smable3.entity.BleGameSettings;
import com.szabh.smable3.entity.BleGestureWake;
import com.szabh.smable3.entity.BleGirlCareSettings;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleNoDisturbSettings;
import com.szabh.smable3.entity.BleSchedule;
import com.szabh.smable3.entity.BleSedentarinessSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceSettings extends JsonField {

    @tb1
    private List<BleAlarm> alarms;

    @tb1
    private Integer backLight;

    @tb1
    private List<BleCoaching> coachings;

    @tb1
    private BleDrinkWaterSettings drinkWaterSettings;

    @tb1
    private final BleGameSettings gameSettings;

    @tb1
    private BleGestureWake gestureWake;

    @tb1
    private BleGirlCareSettings girlCare;

    @tb1
    private BleHrMonitoringSettings hrMonitoringSettings;

    @tb1
    private BleNoDisturbSettings noDisturbSettings;

    @tb1
    private List<BleSchedule> schedules;

    @tb1
    private BleSedentarinessSettings sedentarinessSettings;

    @tb1
    private Integer stepGoal;

    @tb1
    private Integer vibration;

    public DeviceSettings(@tb1 Integer num, @tb1 Integer num2, @tb1 BleSedentarinessSettings bleSedentarinessSettings, @tb1 BleNoDisturbSettings bleNoDisturbSettings, @tb1 Integer num3, @tb1 List<BleAlarm> list, @tb1 BleHrMonitoringSettings bleHrMonitoringSettings, @tb1 BleGestureWake bleGestureWake, @tb1 BleGirlCareSettings bleGirlCareSettings, @tb1 List<BleSchedule> list2, @tb1 List<BleCoaching> list3, @tb1 BleDrinkWaterSettings bleDrinkWaterSettings, @tb1 BleGameSettings bleGameSettings) {
        this.stepGoal = num;
        this.backLight = num2;
        this.sedentarinessSettings = bleSedentarinessSettings;
        this.noDisturbSettings = bleNoDisturbSettings;
        this.vibration = num3;
        this.alarms = list;
        this.hrMonitoringSettings = bleHrMonitoringSettings;
        this.gestureWake = bleGestureWake;
        this.girlCare = bleGirlCareSettings;
        this.schedules = list2;
        this.coachings = list3;
        this.drinkWaterSettings = bleDrinkWaterSettings;
        this.gameSettings = bleGameSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSettings copy$default(DeviceSettings deviceSettings, Integer num, Integer num2, BleSedentarinessSettings bleSedentarinessSettings, BleNoDisturbSettings bleNoDisturbSettings, Integer num3, List list, BleHrMonitoringSettings bleHrMonitoringSettings, BleGestureWake bleGestureWake, BleGirlCareSettings bleGirlCareSettings, List list2, List list3, BleDrinkWaterSettings bleDrinkWaterSettings, BleGameSettings bleGameSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            num = deviceSettings.stepGoal;
        }
        return deviceSettings.copy(num, (i & 2) != 0 ? deviceSettings.backLight : num2, (i & 4) != 0 ? deviceSettings.sedentarinessSettings : bleSedentarinessSettings, (i & 8) != 0 ? deviceSettings.noDisturbSettings : bleNoDisturbSettings, (i & 16) != 0 ? deviceSettings.vibration : num3, (i & 32) != 0 ? deviceSettings.alarms : list, (i & 64) != 0 ? deviceSettings.hrMonitoringSettings : bleHrMonitoringSettings, (i & 128) != 0 ? deviceSettings.gestureWake : bleGestureWake, (i & 256) != 0 ? deviceSettings.girlCare : bleGirlCareSettings, (i & 512) != 0 ? deviceSettings.schedules : list2, (i & 1024) != 0 ? deviceSettings.coachings : list3, (i & 2048) != 0 ? deviceSettings.drinkWaterSettings : bleDrinkWaterSettings, (i & 4096) != 0 ? deviceSettings.gameSettings : bleGameSettings);
    }

    @tb1
    public final Integer component1() {
        return this.stepGoal;
    }

    @tb1
    public final List<BleSchedule> component10() {
        return this.schedules;
    }

    @tb1
    public final List<BleCoaching> component11() {
        return this.coachings;
    }

    @tb1
    public final BleDrinkWaterSettings component12() {
        return this.drinkWaterSettings;
    }

    @tb1
    public final BleGameSettings component13() {
        return this.gameSettings;
    }

    @tb1
    public final Integer component2() {
        return this.backLight;
    }

    @tb1
    public final BleSedentarinessSettings component3() {
        return this.sedentarinessSettings;
    }

    @tb1
    public final BleNoDisturbSettings component4() {
        return this.noDisturbSettings;
    }

    @tb1
    public final Integer component5() {
        return this.vibration;
    }

    @tb1
    public final List<BleAlarm> component6() {
        return this.alarms;
    }

    @tb1
    public final BleHrMonitoringSettings component7() {
        return this.hrMonitoringSettings;
    }

    @tb1
    public final BleGestureWake component8() {
        return this.gestureWake;
    }

    @tb1
    public final BleGirlCareSettings component9() {
        return this.girlCare;
    }

    @aa1
    public final DeviceSettings copy(@tb1 Integer num, @tb1 Integer num2, @tb1 BleSedentarinessSettings bleSedentarinessSettings, @tb1 BleNoDisturbSettings bleNoDisturbSettings, @tb1 Integer num3, @tb1 List<BleAlarm> list, @tb1 BleHrMonitoringSettings bleHrMonitoringSettings, @tb1 BleGestureWake bleGestureWake, @tb1 BleGirlCareSettings bleGirlCareSettings, @tb1 List<BleSchedule> list2, @tb1 List<BleCoaching> list3, @tb1 BleDrinkWaterSettings bleDrinkWaterSettings, @tb1 BleGameSettings bleGameSettings) {
        return new DeviceSettings(num, num2, bleSedentarinessSettings, bleNoDisturbSettings, num3, list, bleHrMonitoringSettings, bleGestureWake, bleGirlCareSettings, list2, list3, bleDrinkWaterSettings, bleGameSettings);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceSettings)) {
            return false;
        }
        DeviceSettings deviceSettings = (DeviceSettings) obj;
        return Intrinsics.XOO0ii0(this.stepGoal, deviceSettings.stepGoal) && Intrinsics.XOO0ii0(this.backLight, deviceSettings.backLight) && Intrinsics.XOO0ii0(this.sedentarinessSettings, deviceSettings.sedentarinessSettings) && Intrinsics.XOO0ii0(this.noDisturbSettings, deviceSettings.noDisturbSettings) && Intrinsics.XOO0ii0(this.vibration, deviceSettings.vibration) && Intrinsics.XOO0ii0(this.alarms, deviceSettings.alarms) && Intrinsics.XOO0ii0(this.hrMonitoringSettings, deviceSettings.hrMonitoringSettings) && Intrinsics.XOO0ii0(this.gestureWake, deviceSettings.gestureWake) && Intrinsics.XOO0ii0(this.girlCare, deviceSettings.girlCare) && Intrinsics.XOO0ii0(this.schedules, deviceSettings.schedules) && Intrinsics.XOO0ii0(this.coachings, deviceSettings.coachings) && Intrinsics.XOO0ii0(this.drinkWaterSettings, deviceSettings.drinkWaterSettings) && Intrinsics.XOO0ii0(this.gameSettings, deviceSettings.gameSettings);
    }

    @tb1
    public final List<BleAlarm> getAlarms() {
        return this.alarms;
    }

    @tb1
    public final Integer getBackLight() {
        return this.backLight;
    }

    @tb1
    public final List<BleCoaching> getCoachings() {
        return this.coachings;
    }

    @tb1
    public final BleDrinkWaterSettings getDrinkWaterSettings() {
        return this.drinkWaterSettings;
    }

    @tb1
    public final BleGameSettings getGameSettings() {
        return this.gameSettings;
    }

    @tb1
    public final BleGestureWake getGestureWake() {
        return this.gestureWake;
    }

    @tb1
    public final BleGirlCareSettings getGirlCare() {
        return this.girlCare;
    }

    @tb1
    public final BleHrMonitoringSettings getHrMonitoringSettings() {
        return this.hrMonitoringSettings;
    }

    @tb1
    public final BleNoDisturbSettings getNoDisturbSettings() {
        return this.noDisturbSettings;
    }

    @tb1
    public final List<BleSchedule> getSchedules() {
        return this.schedules;
    }

    @tb1
    public final BleSedentarinessSettings getSedentarinessSettings() {
        return this.sedentarinessSettings;
    }

    @tb1
    public final Integer getStepGoal() {
        return this.stepGoal;
    }

    @tb1
    public final Integer getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        Integer num = this.stepGoal;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.backLight;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        BleSedentarinessSettings bleSedentarinessSettings = this.sedentarinessSettings;
        int iHashCode3 = (iHashCode2 + (bleSedentarinessSettings == null ? 0 : bleSedentarinessSettings.hashCode())) * 31;
        BleNoDisturbSettings bleNoDisturbSettings = this.noDisturbSettings;
        int iHashCode4 = (iHashCode3 + (bleNoDisturbSettings == null ? 0 : bleNoDisturbSettings.hashCode())) * 31;
        Integer num3 = this.vibration;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<BleAlarm> list = this.alarms;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        BleHrMonitoringSettings bleHrMonitoringSettings = this.hrMonitoringSettings;
        int iHashCode7 = (iHashCode6 + (bleHrMonitoringSettings == null ? 0 : bleHrMonitoringSettings.hashCode())) * 31;
        BleGestureWake bleGestureWake = this.gestureWake;
        int iHashCode8 = (iHashCode7 + (bleGestureWake == null ? 0 : bleGestureWake.hashCode())) * 31;
        BleGirlCareSettings bleGirlCareSettings = this.girlCare;
        int iHashCode9 = (iHashCode8 + (bleGirlCareSettings == null ? 0 : bleGirlCareSettings.hashCode())) * 31;
        List<BleSchedule> list2 = this.schedules;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BleCoaching> list3 = this.coachings;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BleDrinkWaterSettings bleDrinkWaterSettings = this.drinkWaterSettings;
        int iHashCode12 = (iHashCode11 + (bleDrinkWaterSettings == null ? 0 : bleDrinkWaterSettings.hashCode())) * 31;
        BleGameSettings bleGameSettings = this.gameSettings;
        return iHashCode12 + (bleGameSettings != null ? bleGameSettings.hashCode() : 0);
    }

    public final void setAlarms(@tb1 List<BleAlarm> list) {
        this.alarms = list;
    }

    public final void setBackLight(@tb1 Integer num) {
        this.backLight = num;
    }

    public final void setCoachings(@tb1 List<BleCoaching> list) {
        this.coachings = list;
    }

    public final void setDrinkWaterSettings(@tb1 BleDrinkWaterSettings bleDrinkWaterSettings) {
        this.drinkWaterSettings = bleDrinkWaterSettings;
    }

    public final void setGestureWake(@tb1 BleGestureWake bleGestureWake) {
        this.gestureWake = bleGestureWake;
    }

    public final void setGirlCare(@tb1 BleGirlCareSettings bleGirlCareSettings) {
        this.girlCare = bleGirlCareSettings;
    }

    public final void setHrMonitoringSettings(@tb1 BleHrMonitoringSettings bleHrMonitoringSettings) {
        this.hrMonitoringSettings = bleHrMonitoringSettings;
    }

    public final void setNoDisturbSettings(@tb1 BleNoDisturbSettings bleNoDisturbSettings) {
        this.noDisturbSettings = bleNoDisturbSettings;
    }

    public final void setSchedules(@tb1 List<BleSchedule> list) {
        this.schedules = list;
    }

    public final void setSedentarinessSettings(@tb1 BleSedentarinessSettings bleSedentarinessSettings) {
        this.sedentarinessSettings = bleSedentarinessSettings;
    }

    public final void setStepGoal(@tb1 Integer num) {
        this.stepGoal = num;
    }

    public final void setVibration(@tb1 Integer num) {
        this.vibration = num;
    }

    @aa1
    public String toString() {
        return "DeviceSettings(stepGoal=" + this.stepGoal + ", backLight=" + this.backLight + ", sedentarinessSettings=" + this.sedentarinessSettings + ", noDisturbSettings=" + this.noDisturbSettings + ", vibration=" + this.vibration + ", alarms=" + this.alarms + ", hrMonitoringSettings=" + this.hrMonitoringSettings + ", gestureWake=" + this.gestureWake + ", girlCare=" + this.girlCare + ", schedules=" + this.schedules + ", coachings=" + this.coachings + ", drinkWaterSettings=" + this.drinkWaterSettings + ", gameSettings=" + this.gameSettings + I000IiI1O.C2156iO.f1007iO;
    }
}
