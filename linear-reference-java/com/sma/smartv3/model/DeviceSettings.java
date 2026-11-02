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

    public DeviceSettings(@tb1 Integer r1, @tb1 Integer r2, @tb1 BleSedentarinessSettings r3, @tb1 BleNoDisturbSettings r4, @tb1 Integer r5, @tb1 List<BleAlarm> r6, @tb1 BleHrMonitoringSettings r7, @tb1 BleGestureWake r8, @tb1 BleGirlCareSettings r9, @tb1 List<BleSchedule> r10, @tb1 List<BleCoaching> r11, @tb1 BleDrinkWaterSettings r12, @tb1 BleGameSettings r13) {
        this.stepGoal = r1;
        this.backLight = r2;
        this.sedentarinessSettings = r3;
        this.noDisturbSettings = r4;
        this.vibration = r5;
        this.alarms = r6;
        this.hrMonitoringSettings = r7;
        this.gestureWake = r8;
        this.girlCare = r9;
        this.schedules = r10;
        this.coachings = r11;
        this.drinkWaterSettings = r12;
        this.gameSettings = r13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSettings copy$default(DeviceSettings r12, Integer r13, Integer r14, BleSedentarinessSettings r15, BleNoDisturbSettings r16, Integer r17, List r18, BleHrMonitoringSettings r19, BleGestureWake r20, BleGirlCareSettings r21, List r22, List r23, BleDrinkWaterSettings r24, BleGameSettings r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.stepGoal;
    L6:
        if ((r26 & 2) == 0) goto L8;
        Integer r1 = r12.backLight;
    L10:
        if ((r26 & 4) == 0) goto L12;
        BleSedentarinessSettings r2 = r12.sedentarinessSettings;
    L14:
        if ((r26 & 8) == 0) goto L16;
        BleNoDisturbSettings r3 = r12.noDisturbSettings;
    L18:
        if ((r26 & 16) == 0) goto L20;
        Integer r4 = r12.vibration;
    L22:
        if ((r26 & 32) == 0) goto L24;
        List r5 = r12.alarms;
    L26:
        if ((r26 & 64) == 0) goto L28;
        BleHrMonitoringSettings r6 = r12.hrMonitoringSettings;
    L30:
        if ((r26 & 128) == 0) goto L32;
        BleGestureWake r7 = r12.gestureWake;
    L34:
        if ((r26 & 256) == 0) goto L36;
        BleGirlCareSettings r8 = r12.girlCare;
    L38:
        if ((r26 & 512) == 0) goto L40;
        List r9 = r12.schedules;
    L42:
        if ((r26 & 1024) == 0) goto L44;
        List r10 = r12.coachings;
    L46:
        if ((r26 & 2048) == 0) goto L48;
        BleDrinkWaterSettings r11 = r12.drinkWaterSettings;
    L50:
        if ((r26 & 4096) == 0) goto L53;
        BleGameSettings r28 = r12.gameSettings;
    L55:
        return r12.copy(r13, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r28);
    L53:
        r28 = r25;
        goto L55
    L48:
        r11 = r24;
        goto L50
    L44:
        r10 = r23;
        goto L46
    L40:
        r9 = r22;
        goto L42
    L36:
        r8 = r21;
        goto L38
    L32:
        r7 = r20;
        goto L34
    L28:
        r6 = r19;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
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
    public final DeviceSettings copy(@tb1 Integer r15, @tb1 Integer r16, @tb1 BleSedentarinessSettings r17, @tb1 BleNoDisturbSettings r18, @tb1 Integer r19, @tb1 List<BleAlarm> r20, @tb1 BleHrMonitoringSettings r21, @tb1 BleGestureWake r22, @tb1 BleGirlCareSettings r23, @tb1 List<BleSchedule> r24, @tb1 List<BleCoaching> r25, @tb1 BleDrinkWaterSettings r26, @tb1 BleGameSettings r27) {
        return new DeviceSettings(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeviceSettings) == true) goto L8;
        return false;
    L8:
        DeviceSettings r6 = (DeviceSettings) r5;
        if (Intrinsics.XOO0ii0(this.stepGoal, r6.stepGoal) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.backLight, r6.backLight) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.sedentarinessSettings, r6.sedentarinessSettings) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.noDisturbSettings, r6.noDisturbSettings) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.vibration, r6.vibration) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.alarms, r6.alarms) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.hrMonitoringSettings, r6.hrMonitoringSettings) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.gestureWake, r6.gestureWake) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.girlCare, r6.girlCare) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.schedules, r6.schedules) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.coachings, r6.coachings) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.drinkWaterSettings, r6.drinkWaterSettings) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.gameSettings, r6.gameSettings) == true) goto L47;
        return false;
    L47:
        return true;
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
        Integer r0 = this.stepGoal;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Integer r4 = this.backLight;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        BleSedentarinessSettings r7 = this.sedentarinessSettings;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        BleNoDisturbSettings r10 = this.noDisturbSettings;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Integer r13 = this.vibration;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        List<BleAlarm> r16 = this.alarms;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        BleHrMonitoringSettings r19 = this.hrMonitoringSettings;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        BleGestureWake r22 = this.gestureWake;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        BleGirlCareSettings r25 = this.girlCare;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        List<BleSchedule> r28 = this.schedules;
        if (r28 != null) goto L41;
        int r29 = 0;
    L42:
        int r30 = (r27 + r29) * 31;
        List<BleCoaching> r31 = this.coachings;
        if (r31 != null) goto L45;
        int r32 = 0;
    L46:
        int r33 = (r30 + r32) * 31;
        BleDrinkWaterSettings r34 = this.drinkWaterSettings;
        if (r34 != null) goto L49;
        int r35 = 0;
    L50:
        int r36 = (r33 + r35) * 31;
        BleGameSettings r37 = this.gameSettings;
        if (r37 == null) goto L55;
        r1 = r37.hashCode();
    L55:
        return r36 + r1;
    L49:
        r35 = r34.hashCode();
        goto L50
    L45:
        r32 = r31.hashCode();
        goto L46
    L41:
        r29 = r28.hashCode();
        goto L42
    L37:
        r26 = r25.hashCode();
        goto L38
    L33:
        r23 = r22.hashCode();
        goto L34
    L29:
        r20 = r19.hashCode();
        goto L30
    L25:
        r17 = r16.hashCode();
        goto L26
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setAlarms(@tb1 List<BleAlarm> r1) {
        this.alarms = r1;
    }

    public final void setBackLight(@tb1 Integer r1) {
        this.backLight = r1;
    }

    public final void setCoachings(@tb1 List<BleCoaching> r1) {
        this.coachings = r1;
    }

    public final void setDrinkWaterSettings(@tb1 BleDrinkWaterSettings r1) {
        this.drinkWaterSettings = r1;
    }

    public final void setGestureWake(@tb1 BleGestureWake r1) {
        this.gestureWake = r1;
    }

    public final void setGirlCare(@tb1 BleGirlCareSettings r1) {
        this.girlCare = r1;
    }

    public final void setHrMonitoringSettings(@tb1 BleHrMonitoringSettings r1) {
        this.hrMonitoringSettings = r1;
    }

    public final void setNoDisturbSettings(@tb1 BleNoDisturbSettings r1) {
        this.noDisturbSettings = r1;
    }

    public final void setSchedules(@tb1 List<BleSchedule> r1) {
        this.schedules = r1;
    }

    public final void setSedentarinessSettings(@tb1 BleSedentarinessSettings r1) {
        this.sedentarinessSettings = r1;
    }

    public final void setStepGoal(@tb1 Integer r1) {
        this.stepGoal = r1;
    }

    public final void setVibration(@tb1 Integer r1) {
        this.vibration = r1;
    }

    @aa1
    public String toString() {
        return "DeviceSettings(stepGoal=" + this.stepGoal + ", backLight=" + this.backLight + ", sedentarinessSettings=" + this.sedentarinessSettings + ", noDisturbSettings=" + this.noDisturbSettings + ", vibration=" + this.vibration + ", alarms=" + this.alarms + ", hrMonitoringSettings=" + this.hrMonitoringSettings + ", gestureWake=" + this.gestureWake + ", girlCare=" + this.girlCare + ", schedules=" + this.schedules + ", coachings=" + this.coachings + ", drinkWaterSettings=" + this.drinkWaterSettings + ", gameSettings=" + this.gameSettings + I000IiI1O.iO.iO;
    }
}
