package com.sma.smartv3.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.AlipayBindInfoDao;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.ChatVoiceMsgDao;
import com.sma.smartv3.db.dao.DailyPowerDao;
import com.sma.smartv3.db.dao.DeviceInfoDao;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.dao.HanBaoVibrationDao;
import com.sma.smartv3.db.dao.HealthyReportDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.MatchRecordDao;
import com.sma.smartv3.db.dao.PhysicalPowerDao;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.RecordDeviceFileDao;
import com.sma.smartv3.db.dao.RecordDeviceFileManageDao;
import com.sma.smartv3.db.dao.RecordScheduleDao;
import com.sma.smartv3.db.dao.RespiratoryRateDao;
import com.sma.smartv3.db.dao.ScheduleDao;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.dao.SportDataDao;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.dao.TranslateDao;
import com.sma.smartv3.db.dao.TranslateSessionDao;
import com.sma.smartv3.db.dao.VitalityDao;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.AlipayBindInfo;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.db.entity.DailyPower;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.db.entity.HanBaoVibration;
import com.sma.smartv3.db.entity.HealthyReport;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.MatchLog;
import com.sma.smartv3.db.entity.MatchPeriod;
import com.sma.smartv3.db.entity.MatchRecord;
import com.sma.smartv3.db.entity.PhysicalPower;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.RecordDeviceFile;
import com.sma.smartv3.db.entity.RecordDeviceInfo;
import com.sma.smartv3.db.entity.RecordDeviceManage;
import com.sma.smartv3.db.entity.RecordSchedule;
import com.sma.smartv3.db.entity.RespiratoryRate;
import com.sma.smartv3.db.entity.Schedule;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.Vitality;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.db.entity.WorkoutIndex;

/* JADX INFO: loaded from: classes19.dex */
@Database(entities = {Activity.class, AIRecords.class, HeartRate.class, BloodPressure.class, Sleep.class, Workout.class, Location.class, Weight.class, Temperature.class, Schedule.class, WorkoutIndex.class, BloodOxygen.class, Hrv.class, Pressure.class, MatchLog.class, MatchPeriod.class, MatchRecord.class, SportData.class, BloodGlucose.class, AlipayBindInfo.class, Electrocardiogram.class, BloodGlucose2.class, HanBaoVibration.class, HealthyReport.class, DailyPower.class, TranslateEntity.class, TranslateSessionEntity.class, Vitality.class, RespiratoryRate.class, PhysicalPower.class, ChatVoiceAssistantMessage.class, EnergyRating.class, RecordDeviceFile.class, RecordDeviceInfo.class, RecordDeviceManage.class, RecordSchedule.class}, version = 56)
public abstract class AppDatabase extends RoomDatabase {
    public AppDatabase() {
    }

    @aa1
    public abstract ActivityDao activityDao();

    @aa1
    public abstract AIRecordsDao aiRecordsDao();

    @aa1
    public abstract AlipayBindInfoDao alipayBindInfoDao();

    @aa1
    public abstract BloodGlucose2Dao bloodGlucose2Dao();

    @aa1
    public abstract BloodGlucoseDao bloodGlucoseDao();

    @aa1
    public abstract BloodOxygenDao bloodOxygenDao();

    @aa1
    public abstract BloodPressureDao bloodPressureDao();

    @aa1
    public abstract ChatVoiceMsgDao chatVoiceThirdParty();

    @aa1
    public abstract DailyPowerDao dailyPowerDao();

    @aa1
    public abstract DeviceInfoDao deviceInfoDao();

    @aa1
    public abstract ElectrocardiogramDao electrocardiogramDao();

    @aa1
    public abstract EnergyRatingDao energyRating();

    @aa1
    public abstract HanBaoVibrationDao hanBaoVibrationDao();

    @aa1
    public abstract HealthyReportDao healthyReportDao();

    @aa1
    public abstract HeartRateDao heartRateDao();

    @aa1
    public abstract HrvDao hrvDao();

    @aa1
    public abstract LocationDao locationDao();

    @aa1
    public abstract MatchRecordDao matchRecordDao();

    @aa1
    public abstract PhysicalPowerDao physicalPowerDao();

    @aa1
    public abstract PressureDao pressureDao();

    @aa1
    public abstract RecordDeviceFileDao recordDeviceFileDao();

    @aa1
    public abstract RecordDeviceFileManageDao recordDeviceFileManageDao();

    @aa1
    public abstract RecordScheduleDao recordScheduleDao();

    @aa1
    public abstract RespiratoryRateDao respiratoryRateDao();

    @aa1
    public abstract ScheduleDao scheduleDao();

    @aa1
    public abstract SleepDao sleepDao();

    @aa1
    public abstract SportDataDao sportDataDao();

    @aa1
    public abstract TemperatureDao temperatureDao();

    @aa1
    public abstract TranslateDao translateDao();

    @aa1
    public abstract TranslateSessionDao translateSessionDao();

    @aa1
    public abstract VitalityDao vitalityDao();

    @aa1
    public abstract WeightDao weightDao();

    @aa1
    public abstract WorkoutDao workoutDao();

    @aa1
    public abstract WorkoutIndexDao workoutIndexDao();
}
