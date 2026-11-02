package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class HealthSettingInfo {
    private AutomaticPressureDetection automaticPressureDetection;
    private BloodOxygenMeasurementAlert bloodOxygenMeasurementAlert;
    private DisconnectReminder disconnectReminder;
    private EmergencyContact emergencyContact;
    private ExerciseHeartRateReminder exerciseHeartRateReminder;
    private FallDetection fallDetection;
    private int funcFlag;
    private HeartRateMeasure heartRateMeasure;
    private LiftWristDetection liftWristDetection;
    private SedentaryReminder sedentaryReminder;
    private SensorInfo sensorInfo;
    private SleepDetection sleepDetection;
    private UserInfo userInfo;

    public HealthSettingInfo() {
        byte[] r1 = new byte[0];
        this.funcFlag = 0;
        this.sensorInfo = new SensorInfo(0);
        this.sedentaryReminder = new SedentaryReminder(r1);
        this.heartRateMeasure = new HeartRateMeasure(r1);
        this.exerciseHeartRateReminder = new ExerciseHeartRateReminder(r1);
        this.automaticPressureDetection = new AutomaticPressureDetection(r1);
        this.sleepDetection = new SleepDetection(r1);
        this.fallDetection = new FallDetection(r1);
        this.liftWristDetection = new LiftWristDetection(r1);
        this.userInfo = new UserInfo(r1);
        this.disconnectReminder = new DisconnectReminder(r1);
        this.bloodOxygenMeasurementAlert = new BloodOxygenMeasurementAlert(r1);
        this.emergencyContact = new EmergencyContact(r1);
    }

    public HealthSettingInfo cloneObject() {
        HealthSettingInfo r0 = new HealthSettingInfo();
        r0.setFuncFlag(this.funcFlag);
        r0.setSensorInfo(this.sensorInfo);
        r0.setSedentaryReminder(this.sedentaryReminder);
        r0.setHeartRateMeasure(this.heartRateMeasure);
        r0.setExerciseHeartRateReminder(this.exerciseHeartRateReminder);
        r0.setAutomaticPressureDetection(this.automaticPressureDetection);
        r0.setSleepDetection(this.sleepDetection);
        r0.setFallDetection(this.fallDetection);
        r0.setLiftWristDetection(this.liftWristDetection);
        r0.setUserInfo(this.userInfo);
        r0.setDisconnectReminder(this.disconnectReminder);
        r0.setBloodOxygenMeasurementAlert(this.bloodOxygenMeasurementAlert);
        r0.setEmergencyContact(this.emergencyContact);
        return r0;
    }

    public AutomaticPressureDetection getAutomaticPressureDetection() {
        return this.automaticPressureDetection;
    }

    public BloodOxygenMeasurementAlert getBloodOxygenMeasurementAlert() {
        return this.bloodOxygenMeasurementAlert;
    }

    public DisconnectReminder getDisconnectReminder() {
        return this.disconnectReminder;
    }

    public EmergencyContact getEmergencyContact() {
        return this.emergencyContact;
    }

    public ExerciseHeartRateReminder getExerciseHeartRateReminder() {
        return this.exerciseHeartRateReminder;
    }

    public FallDetection getFallDetection() {
        return this.fallDetection;
    }

    public int getFuncFlag() {
        return this.funcFlag;
    }

    public HeartRateMeasure getHeartRateMeasure() {
        return this.heartRateMeasure;
    }

    public LiftWristDetection getLiftWristDetection() {
        return this.liftWristDetection;
    }

    public SedentaryReminder getSedentaryReminder() {
        return this.sedentaryReminder;
    }

    public SensorInfo getSensorInfo() {
        return this.sensorInfo;
    }

    public SleepDetection getSleepDetection() {
        return this.sleepDetection;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setAutomaticPressureDetection(AutomaticPressureDetection r1) {
        this.automaticPressureDetection = r1;
    }

    public void setBloodOxygenMeasurementAlert(BloodOxygenMeasurementAlert r1) {
        this.bloodOxygenMeasurementAlert = r1;
    }

    public void setDisconnectReminder(DisconnectReminder r1) {
        this.disconnectReminder = r1;
    }

    public void setEmergencyContact(EmergencyContact r1) {
        this.emergencyContact = r1;
    }

    public void setExerciseHeartRateReminder(ExerciseHeartRateReminder r1) {
        this.exerciseHeartRateReminder = r1;
    }

    public void setFallDetection(FallDetection r1) {
        this.fallDetection = r1;
    }

    public void setFuncFlag(int r1) {
        this.funcFlag = r1;
    }

    public void setHeartRateMeasure(HeartRateMeasure r1) {
        this.heartRateMeasure = r1;
    }

    public void setLiftWristDetection(LiftWristDetection r1) {
        this.liftWristDetection = r1;
    }

    public void setSedentaryReminder(SedentaryReminder r1) {
        this.sedentaryReminder = r1;
    }

    public void setSensorInfo(SensorInfo r1) {
        this.sensorInfo = r1;
    }

    public void setSleepDetection(SleepDetection r1) {
        this.sleepDetection = r1;
    }

    public void setUserInfo(UserInfo r1) {
        this.userInfo = r1;
    }

    public String toString() {
        return "HealthSettingInfo{funcFlag=" + this.funcFlag + ", sensorInfo=" + this.sensorInfo + ", sedentaryReminder=" + this.sedentaryReminder + ", heartRateMeasure=" + this.heartRateMeasure + ", exerciseHeartRateReminder=" + this.exerciseHeartRateReminder + ", automaticPressureDetection=" + this.automaticPressureDetection + ", sleepDetection=" + this.sleepDetection + ", fallDetection=" + this.fallDetection + ", liftWristDetection=" + this.liftWristDetection + ", userInfo=" + this.userInfo + ", disconnectReminder=" + this.disconnectReminder + ", bloodOxygenMeasurementAlert=" + this.bloodOxygenMeasurementAlert + ", emergencyContact=" + this.emergencyContact + i0XO1.IO;
    }
}
