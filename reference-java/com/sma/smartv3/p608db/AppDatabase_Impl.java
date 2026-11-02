package com.sma.smartv3.p608db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.facebook.appevents.AppEventsConstants;
import com.ironsource.C12616d4;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.dao.AIRecordsDao_Impl;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.ActivityDao_Impl;
import com.sma.smartv3.p608db.dao.AlipayBindInfoDao;
import com.sma.smartv3.p608db.dao.AlipayBindInfoDao_Impl;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao_Impl;
import com.sma.smartv3.p608db.dao.BloodGlucoseDao;
import com.sma.smartv3.p608db.dao.BloodGlucoseDao_Impl;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.dao.BloodOxygenDao_Impl;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.dao.BloodPressureDao_Impl;
import com.sma.smartv3.p608db.dao.ChatVoiceMsgDao;
import com.sma.smartv3.p608db.dao.ChatVoiceMsgDao_Impl;
import com.sma.smartv3.p608db.dao.DailyPowerDao;
import com.sma.smartv3.p608db.dao.DailyPowerDao_Impl;
import com.sma.smartv3.p608db.dao.DeviceInfoDao;
import com.sma.smartv3.p608db.dao.DeviceInfoDao_Impl;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao_Impl;
import com.sma.smartv3.p608db.dao.EnergyRatingDao;
import com.sma.smartv3.p608db.dao.EnergyRatingDao_Impl;
import com.sma.smartv3.p608db.dao.HanBaoVibrationDao;
import com.sma.smartv3.p608db.dao.HanBaoVibrationDao_Impl;
import com.sma.smartv3.p608db.dao.HealthyReportDao;
import com.sma.smartv3.p608db.dao.HealthyReportDao_Impl;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.HeartRateDao_Impl;
import com.sma.smartv3.p608db.dao.HrvDao;
import com.sma.smartv3.p608db.dao.HrvDao_Impl;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.LocationDao_Impl;
import com.sma.smartv3.p608db.dao.MatchRecordDao;
import com.sma.smartv3.p608db.dao.MatchRecordDao_Impl;
import com.sma.smartv3.p608db.dao.PhysicalPowerDao;
import com.sma.smartv3.p608db.dao.PhysicalPowerDao_Impl;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.dao.PressureDao_Impl;
import com.sma.smartv3.p608db.dao.RecordDeviceFileDao;
import com.sma.smartv3.p608db.dao.RecordDeviceFileDao_Impl;
import com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao;
import com.sma.smartv3.p608db.dao.RecordDeviceFileManageDao_Impl;
import com.sma.smartv3.p608db.dao.RecordScheduleDao;
import com.sma.smartv3.p608db.dao.RecordScheduleDao_Impl;
import com.sma.smartv3.p608db.dao.RespiratoryRateDao;
import com.sma.smartv3.p608db.dao.RespiratoryRateDao_Impl;
import com.sma.smartv3.p608db.dao.ScheduleDao;
import com.sma.smartv3.p608db.dao.ScheduleDao_Impl;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.dao.SleepDao_Impl;
import com.sma.smartv3.p608db.dao.SportDataDao;
import com.sma.smartv3.p608db.dao.SportDataDao_Impl;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.dao.TemperatureDao_Impl;
import com.sma.smartv3.p608db.dao.TranslateDao;
import com.sma.smartv3.p608db.dao.TranslateDao_Impl;
import com.sma.smartv3.p608db.dao.TranslateSessionDao;
import com.sma.smartv3.p608db.dao.TranslateSessionDao_Impl;
import com.sma.smartv3.p608db.dao.VitalityDao;
import com.sma.smartv3.p608db.dao.VitalityDao_Impl;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.dao.WeightDao_Impl;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.dao.WorkoutDao_Impl;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao_Impl;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile AIRecordsDao _aIRecordsDao;
    private volatile ActivityDao _activityDao;
    private volatile AlipayBindInfoDao _alipayBindInfoDao;
    private volatile BloodGlucose2Dao _bloodGlucose2Dao;
    private volatile BloodGlucoseDao _bloodGlucoseDao;
    private volatile BloodOxygenDao _bloodOxygenDao;
    private volatile BloodPressureDao _bloodPressureDao;
    private volatile ChatVoiceMsgDao _chatVoiceMsgDao;
    private volatile DailyPowerDao _dailyPowerDao;
    private volatile DeviceInfoDao _deviceInfoDao;
    private volatile ElectrocardiogramDao _electrocardiogramDao;
    private volatile EnergyRatingDao _energyRatingDao;
    private volatile HanBaoVibrationDao _hanBaoVibrationDao;
    private volatile HealthyReportDao _healthyReportDao;
    private volatile HeartRateDao _heartRateDao;
    private volatile HrvDao _hrvDao;
    private volatile LocationDao _locationDao;
    private volatile MatchRecordDao _matchRecordDao;
    private volatile PhysicalPowerDao _physicalPowerDao;
    private volatile PressureDao _pressureDao;
    private volatile RecordDeviceFileDao _recordDeviceFileDao;
    private volatile RecordDeviceFileManageDao _recordDeviceFileManageDao;
    private volatile RecordScheduleDao _recordScheduleDao;
    private volatile RespiratoryRateDao _respiratoryRateDao;
    private volatile ScheduleDao _scheduleDao;
    private volatile SleepDao _sleepDao;
    private volatile SportDataDao _sportDataDao;
    private volatile TemperatureDao _temperatureDao;
    private volatile TranslateDao _translateDao;
    private volatile TranslateSessionDao _translateSessionDao;
    private volatile VitalityDao _vitalityDao;
    private volatile WeightDao _weightDao;
    private volatile WorkoutDao _workoutDao;
    private volatile WorkoutIndexDao _workoutIndexDao;

    @Override // com.sma.smartv3.p608db.AppDatabase
    public ActivityDao activityDao() {
        ActivityDao activityDao;
        if (this._activityDao != null) {
            return this._activityDao;
        }
        synchronized (this) {
            try {
                if (this._activityDao == null) {
                    this._activityDao = new ActivityDao_Impl(this);
                }
                activityDao = this._activityDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public AIRecordsDao aiRecordsDao() {
        AIRecordsDao aIRecordsDao;
        if (this._aIRecordsDao != null) {
            return this._aIRecordsDao;
        }
        synchronized (this) {
            try {
                if (this._aIRecordsDao == null) {
                    this._aIRecordsDao = new AIRecordsDao_Impl(this);
                }
                aIRecordsDao = this._aIRecordsDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aIRecordsDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public AlipayBindInfoDao alipayBindInfoDao() {
        AlipayBindInfoDao alipayBindInfoDao;
        if (this._alipayBindInfoDao != null) {
            return this._alipayBindInfoDao;
        }
        synchronized (this) {
            try {
                if (this._alipayBindInfoDao == null) {
                    this._alipayBindInfoDao = new AlipayBindInfoDao_Impl(this);
                }
                alipayBindInfoDao = this._alipayBindInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return alipayBindInfoDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public BloodGlucose2Dao bloodGlucose2Dao() {
        BloodGlucose2Dao bloodGlucose2Dao;
        if (this._bloodGlucose2Dao != null) {
            return this._bloodGlucose2Dao;
        }
        synchronized (this) {
            try {
                if (this._bloodGlucose2Dao == null) {
                    this._bloodGlucose2Dao = new BloodGlucose2Dao_Impl(this);
                }
                bloodGlucose2Dao = this._bloodGlucose2Dao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodGlucose2Dao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public BloodGlucoseDao bloodGlucoseDao() {
        BloodGlucoseDao bloodGlucoseDao;
        if (this._bloodGlucoseDao != null) {
            return this._bloodGlucoseDao;
        }
        synchronized (this) {
            try {
                if (this._bloodGlucoseDao == null) {
                    this._bloodGlucoseDao = new BloodGlucoseDao_Impl(this);
                }
                bloodGlucoseDao = this._bloodGlucoseDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodGlucoseDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public BloodOxygenDao bloodOxygenDao() {
        BloodOxygenDao bloodOxygenDao;
        if (this._bloodOxygenDao != null) {
            return this._bloodOxygenDao;
        }
        synchronized (this) {
            try {
                if (this._bloodOxygenDao == null) {
                    this._bloodOxygenDao = new BloodOxygenDao_Impl(this);
                }
                bloodOxygenDao = this._bloodOxygenDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodOxygenDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public BloodPressureDao bloodPressureDao() {
        BloodPressureDao bloodPressureDao;
        if (this._bloodPressureDao != null) {
            return this._bloodPressureDao;
        }
        synchronized (this) {
            try {
                if (this._bloodPressureDao == null) {
                    this._bloodPressureDao = new BloodPressureDao_Impl(this);
                }
                bloodPressureDao = this._bloodPressureDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodPressureDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public ChatVoiceMsgDao chatVoiceThirdParty() {
        ChatVoiceMsgDao chatVoiceMsgDao;
        if (this._chatVoiceMsgDao != null) {
            return this._chatVoiceMsgDao;
        }
        synchronized (this) {
            try {
                if (this._chatVoiceMsgDao == null) {
                    this._chatVoiceMsgDao = new ChatVoiceMsgDao_Impl(this);
                }
                chatVoiceMsgDao = this._chatVoiceMsgDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return chatVoiceMsgDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(true, "Activity", "AIRecords", "HeartRate", "BloodPressure", "Sleep", "Workout", "Location", "Weight", "Temperature", AppEventsConstants.EVENT_NAME_SCHEDULE, "WorkoutIndex", "BloodOxygen", "Hrv", "Pressure", "MatchLog", "MatchPeriod", "MatchRecord", "SportData", "BloodGlucose", "AlipayBindInfo", "Electrocardiogram", "BloodGlucose2", "HanBaoVibration", "HealthyReport", "DailyPower", "TranslateEntity", "TranslateSessionEntity", "Vitality", "RespiratoryRate", "PhysicalPower", "ChatVoiceAssistantMessage", "EnergyRating", "RecordDeviceFile", "RecordDeviceInfo", "RecordDeviceManage", "RecordSchedule");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Activity", "AIRecords", "HeartRate", "BloodPressure", "Sleep", "Workout", "Location", "Weight", "Temperature", AppEventsConstants.EVENT_NAME_SCHEDULE, "WorkoutIndex", "BloodOxygen", "Hrv", "Pressure", "MatchLog", "MatchPeriod", "MatchRecord", "SportData", "BloodGlucose", "AlipayBindInfo", "Electrocardiogram", "BloodGlucose2", "HanBaoVibration", "HealthyReport", "DailyPower", "TranslateEntity", "TranslateSessionEntity", "Vitality", "RespiratoryRate", "PhysicalPower", "ChatVoiceAssistantMessage", "EnergyRating", "RecordDeviceFile", "RecordDeviceInfo", "RecordDeviceManage", "RecordSchedule");
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public DailyPowerDao dailyPowerDao() {
        DailyPowerDao dailyPowerDao;
        if (this._dailyPowerDao != null) {
            return this._dailyPowerDao;
        }
        synchronized (this) {
            try {
                if (this._dailyPowerDao == null) {
                    this._dailyPowerDao = new DailyPowerDao_Impl(this);
                }
                dailyPowerDao = this._dailyPowerDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dailyPowerDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public DeviceInfoDao deviceInfoDao() {
        DeviceInfoDao deviceInfoDao;
        if (this._deviceInfoDao != null) {
            return this._deviceInfoDao;
        }
        synchronized (this) {
            try {
                if (this._deviceInfoDao == null) {
                    this._deviceInfoDao = new DeviceInfoDao_Impl(this);
                }
                deviceInfoDao = this._deviceInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceInfoDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public ElectrocardiogramDao electrocardiogramDao() {
        ElectrocardiogramDao electrocardiogramDao;
        if (this._electrocardiogramDao != null) {
            return this._electrocardiogramDao;
        }
        synchronized (this) {
            try {
                if (this._electrocardiogramDao == null) {
                    this._electrocardiogramDao = new ElectrocardiogramDao_Impl(this);
                }
                electrocardiogramDao = this._electrocardiogramDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return electrocardiogramDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public EnergyRatingDao energyRating() {
        EnergyRatingDao energyRatingDao;
        if (this._energyRatingDao != null) {
            return this._energyRatingDao;
        }
        synchronized (this) {
            try {
                if (this._energyRatingDao == null) {
                    this._energyRatingDao = new EnergyRatingDao_Impl(this);
                }
                energyRatingDao = this._energyRatingDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return energyRatingDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ActivityDao.class, ActivityDao_Impl.getRequiredConverters());
        map.put(AIRecordsDao.class, AIRecordsDao_Impl.getRequiredConverters());
        map.put(HeartRateDao.class, HeartRateDao_Impl.getRequiredConverters());
        map.put(BloodPressureDao.class, BloodPressureDao_Impl.getRequiredConverters());
        map.put(SleepDao.class, SleepDao_Impl.getRequiredConverters());
        map.put(WorkoutDao.class, WorkoutDao_Impl.getRequiredConverters());
        map.put(LocationDao.class, LocationDao_Impl.getRequiredConverters());
        map.put(WeightDao.class, WeightDao_Impl.getRequiredConverters());
        map.put(TemperatureDao.class, TemperatureDao_Impl.getRequiredConverters());
        map.put(ScheduleDao.class, ScheduleDao_Impl.getRequiredConverters());
        map.put(WorkoutIndexDao.class, WorkoutIndexDao_Impl.getRequiredConverters());
        map.put(BloodOxygenDao.class, BloodOxygenDao_Impl.getRequiredConverters());
        map.put(HrvDao.class, HrvDao_Impl.getRequiredConverters());
        map.put(PressureDao.class, PressureDao_Impl.getRequiredConverters());
        map.put(MatchRecordDao.class, MatchRecordDao_Impl.getRequiredConverters());
        map.put(SportDataDao.class, SportDataDao_Impl.getRequiredConverters());
        map.put(BloodGlucoseDao.class, BloodGlucoseDao_Impl.getRequiredConverters());
        map.put(AlipayBindInfoDao.class, AlipayBindInfoDao_Impl.getRequiredConverters());
        map.put(ElectrocardiogramDao.class, ElectrocardiogramDao_Impl.getRequiredConverters());
        map.put(BloodGlucose2Dao.class, BloodGlucose2Dao_Impl.getRequiredConverters());
        map.put(HanBaoVibrationDao.class, HanBaoVibrationDao_Impl.getRequiredConverters());
        map.put(HealthyReportDao.class, HealthyReportDao_Impl.getRequiredConverters());
        map.put(DailyPowerDao.class, DailyPowerDao_Impl.getRequiredConverters());
        map.put(TranslateDao.class, TranslateDao_Impl.getRequiredConverters());
        map.put(TranslateSessionDao.class, TranslateSessionDao_Impl.getRequiredConverters());
        map.put(RespiratoryRateDao.class, RespiratoryRateDao_Impl.getRequiredConverters());
        map.put(VitalityDao.class, VitalityDao_Impl.getRequiredConverters());
        map.put(PhysicalPowerDao.class, PhysicalPowerDao_Impl.getRequiredConverters());
        map.put(ChatVoiceMsgDao.class, ChatVoiceMsgDao_Impl.getRequiredConverters());
        map.put(RecordDeviceFileDao.class, RecordDeviceFileDao_Impl.getRequiredConverters());
        map.put(DeviceInfoDao.class, DeviceInfoDao_Impl.getRequiredConverters());
        map.put(EnergyRatingDao.class, EnergyRatingDao_Impl.getRequiredConverters());
        map.put(RecordDeviceFileManageDao.class, RecordDeviceFileManageDao_Impl.getRequiredConverters());
        map.put(RecordScheduleDao.class, RecordScheduleDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public HanBaoVibrationDao hanBaoVibrationDao() {
        HanBaoVibrationDao hanBaoVibrationDao;
        if (this._hanBaoVibrationDao != null) {
            return this._hanBaoVibrationDao;
        }
        synchronized (this) {
            try {
                if (this._hanBaoVibrationDao == null) {
                    this._hanBaoVibrationDao = new HanBaoVibrationDao_Impl(this);
                }
                hanBaoVibrationDao = this._hanBaoVibrationDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hanBaoVibrationDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public HealthyReportDao healthyReportDao() {
        HealthyReportDao healthyReportDao;
        if (this._healthyReportDao != null) {
            return this._healthyReportDao;
        }
        synchronized (this) {
            try {
                if (this._healthyReportDao == null) {
                    this._healthyReportDao = new HealthyReportDao_Impl(this);
                }
                healthyReportDao = this._healthyReportDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return healthyReportDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public HeartRateDao heartRateDao() {
        HeartRateDao heartRateDao;
        if (this._heartRateDao != null) {
            return this._heartRateDao;
        }
        synchronized (this) {
            try {
                if (this._heartRateDao == null) {
                    this._heartRateDao = new HeartRateDao_Impl(this);
                }
                heartRateDao = this._heartRateDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return heartRateDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public HrvDao hrvDao() {
        HrvDao hrvDao;
        if (this._hrvDao != null) {
            return this._hrvDao;
        }
        synchronized (this) {
            try {
                if (this._hrvDao == null) {
                    this._hrvDao = new HrvDao_Impl(this);
                }
                hrvDao = this._hrvDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hrvDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public LocationDao locationDao() {
        LocationDao locationDao;
        if (this._locationDao != null) {
            return this._locationDao;
        }
        synchronized (this) {
            try {
                if (this._locationDao == null) {
                    this._locationDao = new LocationDao_Impl(this);
                }
                locationDao = this._locationDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public MatchRecordDao matchRecordDao() {
        MatchRecordDao matchRecordDao;
        if (this._matchRecordDao != null) {
            return this._matchRecordDao;
        }
        synchronized (this) {
            try {
                if (this._matchRecordDao == null) {
                    this._matchRecordDao = new MatchRecordDao_Impl(this);
                }
                matchRecordDao = this._matchRecordDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return matchRecordDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public PhysicalPowerDao physicalPowerDao() {
        PhysicalPowerDao physicalPowerDao;
        if (this._physicalPowerDao != null) {
            return this._physicalPowerDao;
        }
        synchronized (this) {
            try {
                if (this._physicalPowerDao == null) {
                    this._physicalPowerDao = new PhysicalPowerDao_Impl(this);
                }
                physicalPowerDao = this._physicalPowerDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return physicalPowerDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public PressureDao pressureDao() {
        PressureDao pressureDao;
        if (this._pressureDao != null) {
            return this._pressureDao;
        }
        synchronized (this) {
            try {
                if (this._pressureDao == null) {
                    this._pressureDao = new PressureDao_Impl(this);
                }
                pressureDao = this._pressureDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pressureDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public RecordDeviceFileDao recordDeviceFileDao() {
        RecordDeviceFileDao recordDeviceFileDao;
        if (this._recordDeviceFileDao != null) {
            return this._recordDeviceFileDao;
        }
        synchronized (this) {
            try {
                if (this._recordDeviceFileDao == null) {
                    this._recordDeviceFileDao = new RecordDeviceFileDao_Impl(this);
                }
                recordDeviceFileDao = this._recordDeviceFileDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return recordDeviceFileDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public RecordDeviceFileManageDao recordDeviceFileManageDao() {
        RecordDeviceFileManageDao recordDeviceFileManageDao;
        if (this._recordDeviceFileManageDao != null) {
            return this._recordDeviceFileManageDao;
        }
        synchronized (this) {
            try {
                if (this._recordDeviceFileManageDao == null) {
                    this._recordDeviceFileManageDao = new RecordDeviceFileManageDao_Impl(this);
                }
                recordDeviceFileManageDao = this._recordDeviceFileManageDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return recordDeviceFileManageDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public RecordScheduleDao recordScheduleDao() {
        RecordScheduleDao recordScheduleDao;
        if (this._recordScheduleDao != null) {
            return this._recordScheduleDao;
        }
        synchronized (this) {
            try {
                if (this._recordScheduleDao == null) {
                    this._recordScheduleDao = new RecordScheduleDao_Impl(this);
                }
                recordScheduleDao = this._recordScheduleDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return recordScheduleDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public RespiratoryRateDao respiratoryRateDao() {
        RespiratoryRateDao respiratoryRateDao;
        if (this._respiratoryRateDao != null) {
            return this._respiratoryRateDao;
        }
        synchronized (this) {
            try {
                if (this._respiratoryRateDao == null) {
                    this._respiratoryRateDao = new RespiratoryRateDao_Impl(this);
                }
                respiratoryRateDao = this._respiratoryRateDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return respiratoryRateDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public ScheduleDao scheduleDao() {
        ScheduleDao scheduleDao;
        if (this._scheduleDao != null) {
            return this._scheduleDao;
        }
        synchronized (this) {
            try {
                if (this._scheduleDao == null) {
                    this._scheduleDao = new ScheduleDao_Impl(this);
                }
                scheduleDao = this._scheduleDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return scheduleDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public SleepDao sleepDao() {
        SleepDao sleepDao;
        if (this._sleepDao != null) {
            return this._sleepDao;
        }
        synchronized (this) {
            try {
                if (this._sleepDao == null) {
                    this._sleepDao = new SleepDao_Impl(this);
                }
                sleepDao = this._sleepDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sleepDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public SportDataDao sportDataDao() {
        SportDataDao sportDataDao;
        if (this._sportDataDao != null) {
            return this._sportDataDao;
        }
        synchronized (this) {
            try {
                if (this._sportDataDao == null) {
                    this._sportDataDao = new SportDataDao_Impl(this);
                }
                sportDataDao = this._sportDataDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sportDataDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public TemperatureDao temperatureDao() {
        TemperatureDao temperatureDao;
        if (this._temperatureDao != null) {
            return this._temperatureDao;
        }
        synchronized (this) {
            try {
                if (this._temperatureDao == null) {
                    this._temperatureDao = new TemperatureDao_Impl(this);
                }
                temperatureDao = this._temperatureDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return temperatureDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public TranslateDao translateDao() {
        TranslateDao translateDao;
        if (this._translateDao != null) {
            return this._translateDao;
        }
        synchronized (this) {
            try {
                if (this._translateDao == null) {
                    this._translateDao = new TranslateDao_Impl(this);
                }
                translateDao = this._translateDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return translateDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public TranslateSessionDao translateSessionDao() {
        TranslateSessionDao translateSessionDao;
        if (this._translateSessionDao != null) {
            return this._translateSessionDao;
        }
        synchronized (this) {
            try {
                if (this._translateSessionDao == null) {
                    this._translateSessionDao = new TranslateSessionDao_Impl(this);
                }
                translateSessionDao = this._translateSessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return translateSessionDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public VitalityDao vitalityDao() {
        VitalityDao vitalityDao;
        if (this._vitalityDao != null) {
            return this._vitalityDao;
        }
        synchronized (this) {
            try {
                if (this._vitalityDao == null) {
                    this._vitalityDao = new VitalityDao_Impl(this);
                }
                vitalityDao = this._vitalityDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vitalityDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public WeightDao weightDao() {
        WeightDao weightDao;
        if (this._weightDao != null) {
            return this._weightDao;
        }
        synchronized (this) {
            try {
                if (this._weightDao == null) {
                    this._weightDao = new WeightDao_Impl(this);
                }
                weightDao = this._weightDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return weightDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public WorkoutDao workoutDao() {
        WorkoutDao workoutDao;
        if (this._workoutDao != null) {
            return this._workoutDao;
        }
        synchronized (this) {
            try {
                if (this._workoutDao == null) {
                    this._workoutDao = new WorkoutDao_Impl(this);
                }
                workoutDao = this._workoutDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workoutDao;
    }

    @Override // com.sma.smartv3.p608db.AppDatabase
    public WorkoutIndexDao workoutIndexDao() {
        WorkoutIndexDao workoutIndexDao;
        if (this._workoutIndexDao != null) {
            return this._workoutIndexDao;
        }
        synchronized (this) {
            try {
                if (this._workoutIndexDao == null) {
                    this._workoutIndexDao = new WorkoutIndexDao_Impl(this);
                }
                workoutIndexDao = this._workoutIndexDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workoutIndexDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(56, "ad6892ca11300256999ed39d57027c89", "851186f0200bd10550e46b7aa4d7d782") { // from class: com.sma.smartv3.db.AppDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull final SQLiteConnection connection) {
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Activity` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mMode` INTEGER NOT NULL, `mState` INTEGER NOT NULL, `mStep` INTEGER NOT NULL, `mCalorie` INTEGER NOT NULL, `mDistance` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Activity_mTime` ON `Activity` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AIRecords` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mAIFuncType` INTEGER NOT NULL, `mType` INTEGER NOT NULL, `mContent` TEXT NOT NULL, `mExtraInfo` TEXT NOT NULL, `mStatus` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL, `mAITitle` TEXT NOT NULL, `mTranslateLanguage` TEXT NOT NULL, `mTranslateToLanguage` TEXT NOT NULL, `mLocation` TEXT NOT NULL, `mAudioPath` TEXT NOT NULL, `mAudioDuration` INTEGER NOT NULL, `ttsVoiceName` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `HeartRate` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mBpm` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_HeartRate_mTime` ON `HeartRate` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `BloodPressure` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mSystolic` INTEGER NOT NULL, `mDiastolic` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_BloodPressure_mTime` ON `BloodPressure` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Sleep` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mMode` INTEGER NOT NULL, `mSoft` INTEGER NOT NULL, `mStrong` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mAlgorithmType` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Sleep_mTime` ON `Sleep` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Workout` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mStart` INTEGER NOT NULL, `mEnd` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mDuration` INTEGER NOT NULL, `mAltitude` INTEGER NOT NULL, `mAirPressure` INTEGER NOT NULL, `mSpm` INTEGER NOT NULL, `mMode` INTEGER NOT NULL, `mStep` INTEGER NOT NULL, `mDistance` INTEGER NOT NULL, `mCalorie` INTEGER NOT NULL, `mSpeed` INTEGER NOT NULL, `mPace` INTEGER NOT NULL, `mAvgBpm` INTEGER NOT NULL, `mMaxBpm` INTEGER NOT NULL, `mMinBpm` INTEGER NOT NULL, `mMaxSpm` INTEGER NOT NULL, `mMinSpm` INTEGER NOT NULL, `mMaxPace` INTEGER NOT NULL, `mMinPace` INTEGER NOT NULL, `mMaxAltitude` INTEGER NOT NULL, `mMinAltitude` INTEGER NOT NULL, `mMinStress` INTEGER NOT NULL, `mMaxStress` INTEGER NOT NULL, `mAvgStress` INTEGER NOT NULL, `mSource` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL, `mFeel` INTEGER NOT NULL, `mPrototype` TEXT NOT NULL, `mFirmwareFlag` TEXT NOT NULL, `mBleName` TEXT NOT NULL, `mPlatform` TEXT NOT NULL, `mMaxSpeed` INTEGER NOT NULL, `mMinSpeed` INTEGER NOT NULL, `mRestDuration` INTEGER NOT NULL, `mAGpsType` INTEGER NOT NULL, `mType` INTEGER NOT NULL, `mMetTotal` INTEGER NOT NULL, `mAerobic` REAL NOT NULL, `mAnaerobic` REAL NOT NULL, `mStamina` INTEGER NOT NULL, `mAvgSpeed` REAL NOT NULL, `mCadence` INTEGER NOT NULL, `mMaxCadence` INTEGER NOT NULL, `mCnt` INTEGER NOT NULL, `mBpmZoneCount` TEXT DEFAULT '', `mPersonalZone` TEXT DEFAULT '', `mLactateThresholdPace` INTEGER NOT NULL, `mRecoveryTime` INTEGER NOT NULL, `mTrainingLoad` INTEGER NOT NULL, `mMaxVO2` INTEGER NOT NULL, `mLactateThresholdHr` INTEGER NOT NULL, `mAlgorithmMarking` INTEGER NOT NULL, `mPathCount` INTEGER NOT NULL, `mPathSampleInterval` INTEGER NOT NULL, `mPathPoints` TEXT DEFAULT '', `mHrPathCount` INTEGER NOT NULL, `mHrPathSampleInterval` INTEGER NOT NULL, `mHrPathPoints` TEXT DEFAULT '', `mPacePathCount` INTEGER NOT NULL, `mPacePathSampleInterval` INTEGER NOT NULL, `mPacePathPoints` TEXT DEFAULT '', `mSpeedPathCount` INTEGER NOT NULL, `mSpeedPathSampleInterval` INTEGER NOT NULL, `mSpeedPathPoints` TEXT DEFAULT '', `mCadencePathCount` INTEGER NOT NULL, `mCadencePathSampleInterval` INTEGER NOT NULL, `mCadencePathPoints` TEXT DEFAULT '', `mAltitudePathCount` INTEGER NOT NULL, `mAltitudePathSampleInterval` INTEGER NOT NULL, `mAltitudePathPoints` TEXT DEFAULT '', `mGoalDistance` INTEGER NOT NULL, `mGoalTime` INTEGER NOT NULL, `mGoalCalorie` INTEGER NOT NULL, `mPausedDuration` INTEGER NOT NULL, `mCurBpm` INTEGER NOT NULL, `mAscendAltitude` INTEGER NOT NULL, `mDescendAltitude` INTEGER NOT NULL, `mCurStress` INTEGER NOT NULL, `mSwimType` INTEGER NOT NULL, `mCntFore` INTEGER NOT NULL, `mCntBack` INTEGER NOT NULL, `mBackSwingTime` INTEGER NOT NULL, `mDownSwingTime` INTEGER NOT NULL, `mDribbleTime` INTEGER NOT NULL, `mTripCount` INTEGER NOT NULL, `mSessionCount` INTEGER NOT NULL, `mVerticalOscillation` INTEGER NOT NULL, `mRunPowerWatt` INTEGER NOT NULL, `mStepLen` REAL NOT NULL, `mTrainingStatus` INTEGER NOT NULL, `mFitnessAge` INTEGER NOT NULL, `mTlTrend` REAL NOT NULL, `mBestRunTime` TEXT DEFAULT '', `mFitnessLevel` TEXT DEFAULT '', `mCalorieTotal` INTEGER NOT NULL, `mPowerCount` INTEGER NOT NULL, `mPowerInterval` INTEGER NOT NULL, `mPowerPoints` TEXT DEFAULT '', `realTimeAerobic` REAL NOT NULL, `realTimeAnaerobic` REAL NOT NULL, `mFatTotal` REAL NOT NULL, `mCarboTotal` REAL NOT NULL, `mNavigatorTargetTime` INTEGER NOT NULL, `mNavigatorActualTime` INTEGER NOT NULL, `mNavigatorDifferenceTime` INTEGER NOT NULL, `mNavigatorStatusTime` INTEGER NOT NULL, `mNavigatorTargetDistance` INTEGER NOT NULL, `mNavigatorActualDistance` INTEGER NOT NULL, `mNavigatorDifferenceDistance` INTEGER NOT NULL, `mNavigatorStatusDistance` INTEGER NOT NULL, `mNavigatorTargetPace` INTEGER NOT NULL, `mNavigatorActualPace` INTEGER NOT NULL, `mNavigatorDifferencePace` INTEGER NOT NULL, `mNavigatorStatusPace` INTEGER NOT NULL, `mNavigatorTargetSpeedV2` REAL NOT NULL, `mNavigatorActualSpeedV2` REAL NOT NULL, `mNavigatorTargetSpeed` INTEGER NOT NULL, `mNavigatorActualSpeed` INTEGER NOT NULL, `mNavigatorDifferenceSpeed` INTEGER NOT NULL, `mNavigatorStatusSpeed` INTEGER NOT NULL, `mMaxOxygenPower` REAL NOT NULL, `mTrendWeek` TEXT DEFAULT '', `mCyclingIndex` TEXT DEFAULT '', `mStaBalance` INTEGER NOT NULL, `mSwimSwolf` INTEGER NOT NULL, `mCntLap` INTEGER NOT NULL, `mFrontCrawlPerc` INTEGER NOT NULL, `mBreaststrokePerc` INTEGER NOT NULL, `mBackstrokePerc` INTEGER NOT NULL, `mButterflyPerc` INTEGER NOT NULL, `mSpmPathPointsCount` INTEGER NOT NULL, `mSpmPathPointsPoints` TEXT DEFAULT '', `mStepLenCount` INTEGER NOT NULL, `mStepLenPoints` TEXT DEFAULT '', `mEllipticalSteps` INTEGER NOT NULL, `mChildSwimStartTime` INTEGER NOT NULL, `mChildSwimDuration` INTEGER NOT NULL, `mChildSwimDistance` INTEGER NOT NULL, `mChildCyclingStartTime` INTEGER NOT NULL, `mChildCyclingDuration` INTEGER NOT NULL, `mChildCyclingDistance` INTEGER NOT NULL, `mChildRunStartTime` INTEGER NOT NULL, `mChildRunDuration` INTEGER NOT NULL, `mChildRunDistance` INTEGER NOT NULL, `mChildSwimMode` INTEGER NOT NULL, `mChildCyclingMode` INTEGER NOT NULL, `mChildRunMode` INTEGER NOT NULL, `mChildNumber` INTEGER NOT NULL, `mRunLactateAvg` REAL NOT NULL, `mCyclingLactateAvg` REAL NOT NULL, `mFlag` INTEGER NOT NULL, `mRecoveryHrCount` INTEGER NOT NULL, `mRecoveryHrPoints` TEXT DEFAULT '', `mSwimPoolLength` INTEGER NOT NULL, `mDeviceId` TEXT DEFAULT '', `mAICoachSportID` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Location` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mActivityMode` INTEGER NOT NULL, `mAltitude` INTEGER NOT NULL, `mLongitude` REAL NOT NULL, `mLatitude` REAL NOT NULL, `mSource` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsBaiDuSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Location_mTime` ON `Location` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Weight` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mWeight` REAL NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsMeasure` INTEGER NOT NULL, `mBmi` REAL NOT NULL, `mRatioOfFat` REAL NOT NULL, `mWeightOfMuscle` REAL NOT NULL, `mWeightOfFat` REAL NOT NULL, `mRatioOfProtein` REAL NOT NULL, `mRatioOfWater` REAL NOT NULL, `mStateOfNutrition` REAL NOT NULL, `mIdealWeight` REAL NOT NULL, `mAgeOfBody` REAL NOT NULL, `mAgeOfBodyRange` TEXT NOT NULL, `mBmiRange` TEXT NOT NULL, `mBmiWHORange` TEXT NOT NULL, `mBmr` REAL NOT NULL, `mBmrRange` TEXT NOT NULL, `mBodyShape` REAL NOT NULL, `mDesirableWeight` REAL NOT NULL, `mFatFreeBodyWeight` REAL NOT NULL, `mFatToControl` REAL NOT NULL, `mLevelOfVisceralFat` REAL NOT NULL, `mLevelOfVisceralFatRange` TEXT NOT NULL, `mMuscleToControl` REAL NOT NULL, `mRatioOfFatRange` TEXT NOT NULL, `mRatioOfMuscle` REAL NOT NULL, `mRatioOfMuscleRange` TEXT NOT NULL, `mRatioOfProteinRange` TEXT NOT NULL, `mRatioOfSkeletalMuscle` REAL NOT NULL, `mRatioOfSkeletalMuscleRange` TEXT NOT NULL, `mRatioOfSubcutaneousFat` REAL NOT NULL, `mRatioOfSubcutaneousFatRange` TEXT NOT NULL, `mRatioOfWaterRange` TEXT NOT NULL, `mScore` REAL NOT NULL, `mWeightOfBone` REAL NOT NULL, `mWeightOfBoneRange` TEXT NOT NULL, `mWeightOfFatRange` TEXT NOT NULL, `mWeightOfMuscleRange` TEXT NOT NULL, `mWeightOfProtein` REAL NOT NULL, `mWeightOfProteinRange` TEXT NOT NULL, `mWeightOfSkeletalMuscle` REAL NOT NULL, `mWeightOfSkeletalMuscleRange` TEXT NOT NULL, `mWeightOfWater` REAL NOT NULL, `mWeightOfWaterRange` TEXT NOT NULL, `mWeightRange` TEXT NOT NULL, `mWeightToControl` REAL NOT NULL, `mWeightWHORange` TEXT NOT NULL, `mIsDelete` INTEGER NOT NULL, `mRatioOfProteinLevel` INTEGER NOT NULL, `mRatioOfWaterLevel` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Weight_mTime` ON `Weight` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Temperature` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mTemperature` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Temperature_mTime` ON `Temperature` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Schedule` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mScheduleId` INTEGER NOT NULL, `mYear` INTEGER NOT NULL, `mMonth` INTEGER NOT NULL, `mDay` INTEGER NOT NULL, `mHour` INTEGER NOT NULL, `mMinute` INTEGER NOT NULL, `mAdvance` INTEGER NOT NULL, `mTitle` TEXT NOT NULL, `mContent` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkoutIndex` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mFrom` INTEGER NOT NULL, `mEndTime` INTEGER NOT NULL, `mMode` INTEGER NOT NULL, `mSyncStatus` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkoutIndex_mEndTime` ON `WorkoutIndex` (`mEndTime`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkoutIndex_mSyncStatus` ON `WorkoutIndex` (`mSyncStatus`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `BloodOxygen` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_BloodOxygen_mTime` ON `BloodOxygen` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Hrv` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mAvgValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Hrv_mTime` ON `Hrv` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Pressure` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Pressure_mTime` ON `Pressure` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MatchLog` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mMatchRecordId` INTEGER NOT NULL, `mTime` INTEGER NOT NULL, `mCountingTime` INTEGER NOT NULL, `mPeriodTime` INTEGER NOT NULL, `mPeriodNumber` INTEGER NOT NULL, `mType` INTEGER NOT NULL, `mCount` INTEGER NOT NULL, `mCancelType` INTEGER NOT NULL, `mTeam` INTEGER NOT NULL, `mPlayer` INTEGER NOT NULL, `mOtherType` INTEGER NOT NULL, `mStopWatchTotal` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MatchPeriod` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mMatchRecordId` INTEGER NOT NULL, `mDuration` INTEGER NOT NULL, `mDistance` INTEGER NOT NULL, `mStep` INTEGER NOT NULL, `mCalorie` INTEGER NOT NULL, `mSpeed` INTEGER NOT NULL, `mAvgBpm` INTEGER NOT NULL, `mMaxBpm` INTEGER NOT NULL, `mMaxSpeed` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MatchRecord` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mStart` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mType` INTEGER NOT NULL, `mPeriodListSize` INTEGER NOT NULL, `mLogListSize` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL, `mSource` INTEGER NOT NULL, `mIsStopWatchData` INTEGER NOT NULL, `mStopWatchList` TEXT DEFAULT '', `mTeamInfo` TEXT DEFAULT '', `mWeather` TEXT DEFAULT '', `mHomeTeamScore` INTEGER NOT NULL, `mGuestTeamScore` INTEGER NOT NULL, `mMode` INTEGER NOT NULL, `mMinBpm` INTEGER NOT NULL, `mAirPressure` INTEGER NOT NULL, `mPace` INTEGER NOT NULL, `mMaxPace` INTEGER NOT NULL, `mMinPace` INTEGER NOT NULL, `mSpm` INTEGER NOT NULL, `mMaxSpm` INTEGER NOT NULL, `mMinSpm` INTEGER NOT NULL, `mAltitude` INTEGER NOT NULL, `mMaxAltitude` INTEGER NOT NULL, `mMinAltitude` INTEGER NOT NULL, `p_mId` INTEGER NOT NULL, `p_mMatchRecordId` INTEGER NOT NULL, `p_mDuration` INTEGER NOT NULL, `p_mDistance` INTEGER NOT NULL, `p_mStep` INTEGER NOT NULL, `p_mCalorie` INTEGER NOT NULL, `p_mSpeed` INTEGER NOT NULL, `p_mAvgBpm` INTEGER NOT NULL, `p_mMaxBpm` INTEGER NOT NULL, `p_mMaxSpeed` INTEGER NOT NULL, `p_mIsSync` INTEGER NOT NULL, `p_mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_MatchRecord_mStart` ON `MatchRecord` (`mStart`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `SportData` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mStep` INTEGER NOT NULL, `mDistance` INTEGER NOT NULL, `mCalorie` INTEGER NOT NULL, `mDuration` INTEGER NOT NULL, `mSpm` INTEGER NOT NULL, `mAltitude` INTEGER NOT NULL, `mAirPressure` INTEGER NOT NULL, `mPace` INTEGER NOT NULL, `mSpeed` INTEGER NOT NULL, `mMode` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `BloodGlucose` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_BloodGlucose_mTime` ON `BloodGlucose` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AlipayBindInfo` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mBleName` TEXT NOT NULL, `mFirmwareFlag` TEXT NOT NULL, `mMacAddress` TEXT NOT NULL, `mFirmwareVersion` TEXT NOT NULL, `mAppVersion` TEXT NOT NULL, `mResult` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_AlipayBindInfo_mTime` ON `AlipayBindInfo` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Electrocardiogram` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Electrocardiogram_mTime` ON `Electrocardiogram` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `BloodGlucose2` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mMeasurementId` TEXT NOT NULL, `mUserId` TEXT NOT NULL, `mStartTime` TEXT NOT NULL, `mEndTime` TEXT NOT NULL, `mModelNo` TEXT NOT NULL, `mLowerBound` REAL NOT NULL, `mUpperBound` REAL NOT NULL, `mFasting` INTEGER NOT NULL, `mWithin2hrsMeal` INTEGER NOT NULL, `mCompletedProgress` INTEGER NOT NULL, `mCurrentLevel` INTEGER NOT NULL, `mRiskCode` TEXT NOT NULL, `mInsights` TEXT NOT NULL, `mTips` TEXT NOT NULL, `mLocaleInsights` TEXT NOT NULL, `mLocaleTips` TEXT NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_BloodGlucose2_mMeasurementId` ON `BloodGlucose2` (`mMeasurementId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `HanBaoVibration` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mVibration` INTEGER NOT NULL, `mBOValue` INTEGER NOT NULL, `mIsSnore` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_HanBaoVibration_mTime` ON `HanBaoVibration` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `HealthyReport` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mUserGender` INTEGER NOT NULL, `mUserWeight` REAL NOT NULL, `mUserHeight` REAL NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mAbnormalNumber` INTEGER NOT NULL, `mHeartRateTime` INTEGER NOT NULL, `mHeartRateValue` INTEGER NOT NULL, `mHeartRateAIRecords` TEXT NOT NULL, `mBloodPressureTime` INTEGER NOT NULL, `mSystolicValue` INTEGER NOT NULL, `mDiastolicValue` INTEGER NOT NULL, `mBloodPressureAIRecords` TEXT NOT NULL, `mBloodOxygenTime` INTEGER NOT NULL, `mBloodOxygenValue` INTEGER NOT NULL, `mBloodOxygenAIRecords` TEXT NOT NULL, `mSleepTime` INTEGER NOT NULL, `mSleepDeepLengthTime` REAL NOT NULL, `mSleepPiecemealTime` REAL NOT NULL, `mSleepAIRecords` TEXT NOT NULL, `mPressureTime` INTEGER NOT NULL, `mPressureValue` INTEGER NOT NULL, `mPressureAIRecords` TEXT NOT NULL, `mBloodGlucose2Time` INTEGER NOT NULL, `mBloodGlucose2Value` REAL NOT NULL, `mBloodGlucose2AIRecords` TEXT NOT NULL, `mWeightTime` INTEGER NOT NULL, `mWeightValue` REAL NOT NULL, `mWeightAIRecords` TEXT NOT NULL, `mWeekSportsTime` INTEGER NOT NULL, `mWeekSportsNumber` INTEGER NOT NULL, `mWeekSportsAllTime` INTEGER NOT NULL, `mWeekSportsAIRecords` TEXT NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_HealthyReport_mTime` ON `HealthyReport` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `DailyPower` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_DailyPower_mTime` ON `DailyPower` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `TranslateEntity` (`requestId` TEXT NOT NULL, `text` TEXT NOT NULL, `translate` TEXT NOT NULL, `sessionId` TEXT NOT NULL, `duration` REAL NOT NULL, `isUpLoaded` INTEGER NOT NULL, `audioPath` TEXT NOT NULL, `fromLanguage` TEXT NOT NULL, `toLanguage` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `showType` INTEGER NOT NULL, PRIMARY KEY(`requestId`), FOREIGN KEY(`sessionId`) REFERENCES `TranslateSessionEntity`(`sessionId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_TranslateEntity_sessionId` ON `TranslateEntity` (`sessionId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `TranslateSessionEntity` (`sessionId` TEXT NOT NULL, `audioPath` TEXT NOT NULL, `duration` REAL NOT NULL, `createTime` INTEGER NOT NULL, `isDelete` INTEGER NOT NULL, PRIMARY KEY(`sessionId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Vitality` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mAllVitality` INTEGER NOT NULL, `mLowIntensityTime` INTEGER NOT NULL, `mLowIntensityValue` INTEGER NOT NULL, `mMediumIntensityTime` INTEGER NOT NULL, `mMediumIntensityValue` INTEGER NOT NULL, `mHighIntensityTime` INTEGER NOT NULL, `mHighIntensityValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Vitality_mTime` ON `Vitality` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RespiratoryRate` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RespiratoryRate_mTime` ON `RespiratoryRate` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PhysicalPower` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mValue` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_PhysicalPower_mTime` ON `PhysicalPower` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `ChatVoiceAssistantMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `data` TEXT NOT NULL, `type` TEXT NOT NULL, `aiMode` TEXT NOT NULL, `ended` INTEGER NOT NULL, `showType` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_ChatVoiceAssistantMessage_type` ON `ChatVoiceAssistantMessage` (`type`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `EnergyRating` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mScore` INTEGER NOT NULL, `mGear` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_EnergyRating_mTime` ON `EnergyRating` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RecordDeviceFile` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mName` TEXT NOT NULL, `mPath` TEXT NOT NULL, `mSize` INTEGER NOT NULL, `mWidth` INTEGER NOT NULL, `mHeight` INTEGER NOT NULL, `mDuration` INTEGER NOT NULL, `mThumbnail` TEXT NOT NULL, `mFileType` INTEGER NOT NULL, `mIsFavority` INTEGER NOT NULL, `mContent` TEXT NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL, `mProcessType` INTEGER NOT NULL, `mProcessStatus` INTEGER NOT NULL, `mProcessPath` TEXT NOT NULL, `mIsRead` INTEGER NOT NULL, `mIsConversion` INTEGER NOT NULL, `mReservedTextType` INTEGER NOT NULL, `mReservedText` TEXT NOT NULL, `mIsSummaryReport` INTEGER NOT NULL, `mSummaryReportText` TEXT NOT NULL, `mFileName` TEXT NOT NULL, `mTaskId` TEXT NOT NULL, `mModel` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceFile_mTime` ON `RecordDeviceFile` (`mTime`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RecordDeviceInfo` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mMac` TEXT NOT NULL, `mName` TEXT NOT NULL, `mVersion` TEXT NOT NULL, `mBattery` INTEGER NOT NULL, `mTotalStorage` INTEGER NOT NULL, `mAvailableStorage` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `mVoltage` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceInfo_mMac` ON `RecordDeviceInfo` (`mMac`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RecordDeviceManage` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mFileName` TEXT NOT NULL, `mName` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RecordSchedule` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mTime` INTEGER NOT NULL, `mLocalTime` TEXT NOT NULL, `mTitle` TEXT NOT NULL, `mContent` TEXT NOT NULL, `mIsRemindEnabled` INTEGER NOT NULL, `mRepeatType` INTEGER NOT NULL, `mRemindTime` INTEGER NOT NULL, `mLastRemindTime` INTEGER NOT NULL, `mStatus` INTEGER NOT NULL, `mCalendarEventId` INTEGER NOT NULL, `mIsSync` INTEGER NOT NULL, `mIsDelete` INTEGER NOT NULL, `mDeviceFileId` INTEGER NOT NULL)");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad6892ca11300256999ed39d57027c89')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull final SQLiteConnection connection) {
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Activity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `AIRecords`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `HeartRate`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `BloodPressure`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Sleep`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Workout`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Location`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Weight`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Temperature`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Schedule`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `WorkoutIndex`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `BloodOxygen`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Hrv`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Pressure`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MatchLog`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MatchPeriod`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MatchRecord`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `SportData`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `BloodGlucose`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `AlipayBindInfo`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Electrocardiogram`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `BloodGlucose2`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `HanBaoVibration`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `HealthyReport`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `DailyPower`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `TranslateEntity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `TranslateSessionEntity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Vitality`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RespiratoryRate`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PhysicalPower`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `ChatVoiceAssistantMessage`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `EnergyRating`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RecordDeviceFile`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RecordDeviceInfo`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RecordDeviceManage`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RecordSchedule`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull final SQLiteConnection connection) {
                SQLite.execSQL(connection, "PRAGMA foreign_keys = ON");
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull final SQLiteConnection connection) {
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            @NonNull
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull final SQLiteConnection connection) {
                HashMap map = new HashMap(10);
                map.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map.put("mState", new TableInfo.Column("mState", "INTEGER", true, 0, null, 1));
                map.put("mStep", new TableInfo.Column("mStep", "INTEGER", true, 0, null, 1));
                map.put("mCalorie", new TableInfo.Column("mCalorie", "INTEGER", true, 0, null, 1));
                map.put("mDistance", new TableInfo.Column("mDistance", "INTEGER", true, 0, null, 1));
                map.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_Activity_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("Activity", map, hashSet, hashSet2);
                TableInfo tableInfo2 = TableInfo.read(connection, "Activity");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Activity(com.sma.smartv3.db.entity.Activity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(17);
                map2.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map2.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map2.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map2.put("mAIFuncType", new TableInfo.Column("mAIFuncType", "INTEGER", true, 0, null, 1));
                map2.put("mType", new TableInfo.Column("mType", "INTEGER", true, 0, null, 1));
                map2.put("mContent", new TableInfo.Column("mContent", "TEXT", true, 0, null, 1));
                map2.put("mExtraInfo", new TableInfo.Column("mExtraInfo", "TEXT", true, 0, null, 1));
                map2.put("mStatus", new TableInfo.Column("mStatus", "INTEGER", true, 0, null, 1));
                map2.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map2.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map2.put("mAITitle", new TableInfo.Column("mAITitle", "TEXT", true, 0, null, 1));
                map2.put("mTranslateLanguage", new TableInfo.Column("mTranslateLanguage", "TEXT", true, 0, null, 1));
                map2.put("mTranslateToLanguage", new TableInfo.Column("mTranslateToLanguage", "TEXT", true, 0, null, 1));
                map2.put("mLocation", new TableInfo.Column("mLocation", "TEXT", true, 0, null, 1));
                map2.put("mAudioPath", new TableInfo.Column("mAudioPath", "TEXT", true, 0, null, 1));
                map2.put("mAudioDuration", new TableInfo.Column("mAudioDuration", "INTEGER", true, 0, null, 1));
                map2.put("ttsVoiceName", new TableInfo.Column("ttsVoiceName", "TEXT", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("AIRecords", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(connection, "AIRecords");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "AIRecords(com.sma.smartv3.db.entity.AIRecords).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(5);
                map3.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map3.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map3.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map3.put("mBpm", new TableInfo.Column("mBpm", "INTEGER", true, 0, null, 1));
                map3.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_HeartRate_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo5 = new TableInfo("HeartRate", map3, hashSet3, hashSet4);
                TableInfo tableInfo6 = TableInfo.read(connection, "HeartRate");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "HeartRate(com.sma.smartv3.db.entity.HeartRate).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(6);
                map4.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map4.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map4.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map4.put("mSystolic", new TableInfo.Column("mSystolic", "INTEGER", true, 0, null, 1));
                map4.put("mDiastolic", new TableInfo.Column("mDiastolic", "INTEGER", true, 0, null, 1));
                map4.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_BloodPressure_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo7 = new TableInfo("BloodPressure", map4, hashSet5, hashSet6);
                TableInfo tableInfo8 = TableInfo.read(connection, "BloodPressure");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "BloodPressure(com.sma.smartv3.db.entity.BloodPressure).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(8);
                map5.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map5.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map5.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map5.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map5.put("mSoft", new TableInfo.Column("mSoft", "INTEGER", true, 0, null, 1));
                map5.put("mStrong", new TableInfo.Column("mStrong", "INTEGER", true, 0, null, 1));
                map5.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map5.put("mAlgorithmType", new TableInfo.Column("mAlgorithmType", "INTEGER", true, 0, null, 1));
                HashSet hashSet7 = new HashSet(0);
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.Index("index_Sleep_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo9 = new TableInfo("Sleep", map5, hashSet7, hashSet8);
                TableInfo tableInfo10 = TableInfo.read(connection, "Sleep");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Sleep(com.sma.smartv3.db.entity.Sleep).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(159);
                map6.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map6.put("mStart", new TableInfo.Column("mStart", "INTEGER", true, 0, null, 1));
                map6.put("mEnd", new TableInfo.Column("mEnd", "INTEGER", true, 0, null, 1));
                map6.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map6.put("mDuration", new TableInfo.Column("mDuration", "INTEGER", true, 0, null, 1));
                map6.put("mAltitude", new TableInfo.Column("mAltitude", "INTEGER", true, 0, null, 1));
                map6.put("mAirPressure", new TableInfo.Column("mAirPressure", "INTEGER", true, 0, null, 1));
                map6.put("mSpm", new TableInfo.Column("mSpm", "INTEGER", true, 0, null, 1));
                map6.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map6.put("mStep", new TableInfo.Column("mStep", "INTEGER", true, 0, null, 1));
                map6.put("mDistance", new TableInfo.Column("mDistance", "INTEGER", true, 0, null, 1));
                map6.put("mCalorie", new TableInfo.Column("mCalorie", "INTEGER", true, 0, null, 1));
                map6.put("mSpeed", new TableInfo.Column("mSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mPace", new TableInfo.Column("mPace", "INTEGER", true, 0, null, 1));
                map6.put("mAvgBpm", new TableInfo.Column("mAvgBpm", "INTEGER", true, 0, null, 1));
                map6.put("mMaxBpm", new TableInfo.Column("mMaxBpm", "INTEGER", true, 0, null, 1));
                map6.put("mMinBpm", new TableInfo.Column("mMinBpm", "INTEGER", true, 0, null, 1));
                map6.put("mMaxSpm", new TableInfo.Column("mMaxSpm", "INTEGER", true, 0, null, 1));
                map6.put("mMinSpm", new TableInfo.Column("mMinSpm", "INTEGER", true, 0, null, 1));
                map6.put("mMaxPace", new TableInfo.Column("mMaxPace", "INTEGER", true, 0, null, 1));
                map6.put("mMinPace", new TableInfo.Column("mMinPace", "INTEGER", true, 0, null, 1));
                map6.put("mMaxAltitude", new TableInfo.Column("mMaxAltitude", "INTEGER", true, 0, null, 1));
                map6.put("mMinAltitude", new TableInfo.Column("mMinAltitude", "INTEGER", true, 0, null, 1));
                map6.put("mMinStress", new TableInfo.Column("mMinStress", "INTEGER", true, 0, null, 1));
                map6.put("mMaxStress", new TableInfo.Column("mMaxStress", "INTEGER", true, 0, null, 1));
                map6.put("mAvgStress", new TableInfo.Column("mAvgStress", "INTEGER", true, 0, null, 1));
                map6.put("mSource", new TableInfo.Column("mSource", "INTEGER", true, 0, null, 1));
                map6.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map6.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map6.put("mFeel", new TableInfo.Column("mFeel", "INTEGER", true, 0, null, 1));
                map6.put("mPrototype", new TableInfo.Column("mPrototype", "TEXT", true, 0, null, 1));
                map6.put("mFirmwareFlag", new TableInfo.Column("mFirmwareFlag", "TEXT", true, 0, null, 1));
                map6.put("mBleName", new TableInfo.Column("mBleName", "TEXT", true, 0, null, 1));
                map6.put("mPlatform", new TableInfo.Column("mPlatform", "TEXT", true, 0, null, 1));
                map6.put("mMaxSpeed", new TableInfo.Column("mMaxSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mMinSpeed", new TableInfo.Column("mMinSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mRestDuration", new TableInfo.Column("mRestDuration", "INTEGER", true, 0, null, 1));
                map6.put("mAGpsType", new TableInfo.Column("mAGpsType", "INTEGER", true, 0, null, 1));
                map6.put("mType", new TableInfo.Column("mType", "INTEGER", true, 0, null, 1));
                map6.put("mMetTotal", new TableInfo.Column("mMetTotal", "INTEGER", true, 0, null, 1));
                map6.put("mAerobic", new TableInfo.Column("mAerobic", "REAL", true, 0, null, 1));
                map6.put("mAnaerobic", new TableInfo.Column("mAnaerobic", "REAL", true, 0, null, 1));
                map6.put("mStamina", new TableInfo.Column("mStamina", "INTEGER", true, 0, null, 1));
                map6.put("mAvgSpeed", new TableInfo.Column("mAvgSpeed", "REAL", true, 0, null, 1));
                map6.put("mCadence", new TableInfo.Column("mCadence", "INTEGER", true, 0, null, 1));
                map6.put("mMaxCadence", new TableInfo.Column("mMaxCadence", "INTEGER", true, 0, null, 1));
                map6.put("mCnt", new TableInfo.Column("mCnt", "INTEGER", true, 0, null, 1));
                map6.put("mBpmZoneCount", new TableInfo.Column("mBpmZoneCount", "TEXT", false, 0, "''", 1));
                map6.put("mPersonalZone", new TableInfo.Column("mPersonalZone", "TEXT", false, 0, "''", 1));
                map6.put("mLactateThresholdPace", new TableInfo.Column("mLactateThresholdPace", "INTEGER", true, 0, null, 1));
                map6.put("mRecoveryTime", new TableInfo.Column("mRecoveryTime", "INTEGER", true, 0, null, 1));
                map6.put("mTrainingLoad", new TableInfo.Column("mTrainingLoad", "INTEGER", true, 0, null, 1));
                map6.put("mMaxVO2", new TableInfo.Column("mMaxVO2", "INTEGER", true, 0, null, 1));
                map6.put("mLactateThresholdHr", new TableInfo.Column("mLactateThresholdHr", "INTEGER", true, 0, null, 1));
                map6.put("mAlgorithmMarking", new TableInfo.Column("mAlgorithmMarking", "INTEGER", true, 0, null, 1));
                map6.put("mPathCount", new TableInfo.Column("mPathCount", "INTEGER", true, 0, null, 1));
                map6.put("mPathSampleInterval", new TableInfo.Column("mPathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mPathPoints", new TableInfo.Column("mPathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mHrPathCount", new TableInfo.Column("mHrPathCount", "INTEGER", true, 0, null, 1));
                map6.put("mHrPathSampleInterval", new TableInfo.Column("mHrPathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mHrPathPoints", new TableInfo.Column("mHrPathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mPacePathCount", new TableInfo.Column("mPacePathCount", "INTEGER", true, 0, null, 1));
                map6.put("mPacePathSampleInterval", new TableInfo.Column("mPacePathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mPacePathPoints", new TableInfo.Column("mPacePathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mSpeedPathCount", new TableInfo.Column("mSpeedPathCount", "INTEGER", true, 0, null, 1));
                map6.put("mSpeedPathSampleInterval", new TableInfo.Column("mSpeedPathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mSpeedPathPoints", new TableInfo.Column("mSpeedPathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mCadencePathCount", new TableInfo.Column("mCadencePathCount", "INTEGER", true, 0, null, 1));
                map6.put("mCadencePathSampleInterval", new TableInfo.Column("mCadencePathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mCadencePathPoints", new TableInfo.Column("mCadencePathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mAltitudePathCount", new TableInfo.Column("mAltitudePathCount", "INTEGER", true, 0, null, 1));
                map6.put("mAltitudePathSampleInterval", new TableInfo.Column("mAltitudePathSampleInterval", "INTEGER", true, 0, null, 1));
                map6.put("mAltitudePathPoints", new TableInfo.Column("mAltitudePathPoints", "TEXT", false, 0, "''", 1));
                map6.put("mGoalDistance", new TableInfo.Column("mGoalDistance", "INTEGER", true, 0, null, 1));
                map6.put("mGoalTime", new TableInfo.Column("mGoalTime", "INTEGER", true, 0, null, 1));
                map6.put("mGoalCalorie", new TableInfo.Column("mGoalCalorie", "INTEGER", true, 0, null, 1));
                map6.put("mPausedDuration", new TableInfo.Column("mPausedDuration", "INTEGER", true, 0, null, 1));
                map6.put("mCurBpm", new TableInfo.Column("mCurBpm", "INTEGER", true, 0, null, 1));
                map6.put("mAscendAltitude", new TableInfo.Column("mAscendAltitude", "INTEGER", true, 0, null, 1));
                map6.put("mDescendAltitude", new TableInfo.Column("mDescendAltitude", "INTEGER", true, 0, null, 1));
                map6.put("mCurStress", new TableInfo.Column("mCurStress", "INTEGER", true, 0, null, 1));
                map6.put("mSwimType", new TableInfo.Column("mSwimType", "INTEGER", true, 0, null, 1));
                map6.put("mCntFore", new TableInfo.Column("mCntFore", "INTEGER", true, 0, null, 1));
                map6.put("mCntBack", new TableInfo.Column("mCntBack", "INTEGER", true, 0, null, 1));
                map6.put("mBackSwingTime", new TableInfo.Column("mBackSwingTime", "INTEGER", true, 0, null, 1));
                map6.put("mDownSwingTime", new TableInfo.Column("mDownSwingTime", "INTEGER", true, 0, null, 1));
                map6.put("mDribbleTime", new TableInfo.Column("mDribbleTime", "INTEGER", true, 0, null, 1));
                map6.put("mTripCount", new TableInfo.Column("mTripCount", "INTEGER", true, 0, null, 1));
                map6.put("mSessionCount", new TableInfo.Column("mSessionCount", "INTEGER", true, 0, null, 1));
                map6.put("mVerticalOscillation", new TableInfo.Column("mVerticalOscillation", "INTEGER", true, 0, null, 1));
                map6.put("mRunPowerWatt", new TableInfo.Column("mRunPowerWatt", "INTEGER", true, 0, null, 1));
                map6.put("mStepLen", new TableInfo.Column("mStepLen", "REAL", true, 0, null, 1));
                map6.put("mTrainingStatus", new TableInfo.Column("mTrainingStatus", "INTEGER", true, 0, null, 1));
                map6.put("mFitnessAge", new TableInfo.Column("mFitnessAge", "INTEGER", true, 0, null, 1));
                map6.put("mTlTrend", new TableInfo.Column("mTlTrend", "REAL", true, 0, null, 1));
                map6.put("mBestRunTime", new TableInfo.Column("mBestRunTime", "TEXT", false, 0, "''", 1));
                map6.put("mFitnessLevel", new TableInfo.Column("mFitnessLevel", "TEXT", false, 0, "''", 1));
                map6.put("mCalorieTotal", new TableInfo.Column("mCalorieTotal", "INTEGER", true, 0, null, 1));
                map6.put("mPowerCount", new TableInfo.Column("mPowerCount", "INTEGER", true, 0, null, 1));
                map6.put("mPowerInterval", new TableInfo.Column("mPowerInterval", "INTEGER", true, 0, null, 1));
                map6.put("mPowerPoints", new TableInfo.Column("mPowerPoints", "TEXT", false, 0, "''", 1));
                map6.put("realTimeAerobic", new TableInfo.Column("realTimeAerobic", "REAL", true, 0, null, 1));
                map6.put("realTimeAnaerobic", new TableInfo.Column("realTimeAnaerobic", "REAL", true, 0, null, 1));
                map6.put("mFatTotal", new TableInfo.Column("mFatTotal", "REAL", true, 0, null, 1));
                map6.put("mCarboTotal", new TableInfo.Column("mCarboTotal", "REAL", true, 0, null, 1));
                map6.put("mNavigatorTargetTime", new TableInfo.Column("mNavigatorTargetTime", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorActualTime", new TableInfo.Column("mNavigatorActualTime", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorDifferenceTime", new TableInfo.Column("mNavigatorDifferenceTime", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorStatusTime", new TableInfo.Column("mNavigatorStatusTime", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorTargetDistance", new TableInfo.Column("mNavigatorTargetDistance", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorActualDistance", new TableInfo.Column("mNavigatorActualDistance", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorDifferenceDistance", new TableInfo.Column("mNavigatorDifferenceDistance", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorStatusDistance", new TableInfo.Column("mNavigatorStatusDistance", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorTargetPace", new TableInfo.Column("mNavigatorTargetPace", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorActualPace", new TableInfo.Column("mNavigatorActualPace", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorDifferencePace", new TableInfo.Column("mNavigatorDifferencePace", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorStatusPace", new TableInfo.Column("mNavigatorStatusPace", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorTargetSpeedV2", new TableInfo.Column("mNavigatorTargetSpeedV2", "REAL", true, 0, null, 1));
                map6.put("mNavigatorActualSpeedV2", new TableInfo.Column("mNavigatorActualSpeedV2", "REAL", true, 0, null, 1));
                map6.put("mNavigatorTargetSpeed", new TableInfo.Column("mNavigatorTargetSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorActualSpeed", new TableInfo.Column("mNavigatorActualSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorDifferenceSpeed", new TableInfo.Column("mNavigatorDifferenceSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mNavigatorStatusSpeed", new TableInfo.Column("mNavigatorStatusSpeed", "INTEGER", true, 0, null, 1));
                map6.put("mMaxOxygenPower", new TableInfo.Column("mMaxOxygenPower", "REAL", true, 0, null, 1));
                map6.put("mTrendWeek", new TableInfo.Column("mTrendWeek", "TEXT", false, 0, "''", 1));
                map6.put("mCyclingIndex", new TableInfo.Column("mCyclingIndex", "TEXT", false, 0, "''", 1));
                map6.put("mStaBalance", new TableInfo.Column("mStaBalance", "INTEGER", true, 0, null, 1));
                map6.put("mSwimSwolf", new TableInfo.Column("mSwimSwolf", "INTEGER", true, 0, null, 1));
                map6.put("mCntLap", new TableInfo.Column("mCntLap", "INTEGER", true, 0, null, 1));
                map6.put("mFrontCrawlPerc", new TableInfo.Column("mFrontCrawlPerc", "INTEGER", true, 0, null, 1));
                map6.put("mBreaststrokePerc", new TableInfo.Column("mBreaststrokePerc", "INTEGER", true, 0, null, 1));
                map6.put("mBackstrokePerc", new TableInfo.Column("mBackstrokePerc", "INTEGER", true, 0, null, 1));
                map6.put("mButterflyPerc", new TableInfo.Column("mButterflyPerc", "INTEGER", true, 0, null, 1));
                map6.put("mSpmPathPointsCount", new TableInfo.Column("mSpmPathPointsCount", "INTEGER", true, 0, null, 1));
                map6.put("mSpmPathPointsPoints", new TableInfo.Column("mSpmPathPointsPoints", "TEXT", false, 0, "''", 1));
                map6.put("mStepLenCount", new TableInfo.Column("mStepLenCount", "INTEGER", true, 0, null, 1));
                map6.put("mStepLenPoints", new TableInfo.Column("mStepLenPoints", "TEXT", false, 0, "''", 1));
                map6.put("mEllipticalSteps", new TableInfo.Column("mEllipticalSteps", "INTEGER", true, 0, null, 1));
                map6.put("mChildSwimStartTime", new TableInfo.Column("mChildSwimStartTime", "INTEGER", true, 0, null, 1));
                map6.put("mChildSwimDuration", new TableInfo.Column("mChildSwimDuration", "INTEGER", true, 0, null, 1));
                map6.put("mChildSwimDistance", new TableInfo.Column("mChildSwimDistance", "INTEGER", true, 0, null, 1));
                map6.put("mChildCyclingStartTime", new TableInfo.Column("mChildCyclingStartTime", "INTEGER", true, 0, null, 1));
                map6.put("mChildCyclingDuration", new TableInfo.Column("mChildCyclingDuration", "INTEGER", true, 0, null, 1));
                map6.put("mChildCyclingDistance", new TableInfo.Column("mChildCyclingDistance", "INTEGER", true, 0, null, 1));
                map6.put("mChildRunStartTime", new TableInfo.Column("mChildRunStartTime", "INTEGER", true, 0, null, 1));
                map6.put("mChildRunDuration", new TableInfo.Column("mChildRunDuration", "INTEGER", true, 0, null, 1));
                map6.put("mChildRunDistance", new TableInfo.Column("mChildRunDistance", "INTEGER", true, 0, null, 1));
                map6.put("mChildSwimMode", new TableInfo.Column("mChildSwimMode", "INTEGER", true, 0, null, 1));
                map6.put("mChildCyclingMode", new TableInfo.Column("mChildCyclingMode", "INTEGER", true, 0, null, 1));
                map6.put("mChildRunMode", new TableInfo.Column("mChildRunMode", "INTEGER", true, 0, null, 1));
                map6.put("mChildNumber", new TableInfo.Column("mChildNumber", "INTEGER", true, 0, null, 1));
                map6.put("mRunLactateAvg", new TableInfo.Column("mRunLactateAvg", "REAL", true, 0, null, 1));
                map6.put("mCyclingLactateAvg", new TableInfo.Column("mCyclingLactateAvg", "REAL", true, 0, null, 1));
                map6.put("mFlag", new TableInfo.Column("mFlag", "INTEGER", true, 0, null, 1));
                map6.put("mRecoveryHrCount", new TableInfo.Column("mRecoveryHrCount", "INTEGER", true, 0, null, 1));
                map6.put("mRecoveryHrPoints", new TableInfo.Column("mRecoveryHrPoints", "TEXT", false, 0, "''", 1));
                map6.put("mSwimPoolLength", new TableInfo.Column("mSwimPoolLength", "INTEGER", true, 0, null, 1));
                map6.put("mDeviceId", new TableInfo.Column("mDeviceId", "TEXT", false, 0, "''", 1));
                map6.put("mAICoachSportID", new TableInfo.Column("mAICoachSportID", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("Workout", map6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(connection, "Workout");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Workout(com.sma.smartv3.db.entity.Workout).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                HashMap map7 = new HashMap(10);
                map7.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map7.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map7.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map7.put("mActivityMode", new TableInfo.Column("mActivityMode", "INTEGER", true, 0, null, 1));
                map7.put("mAltitude", new TableInfo.Column("mAltitude", "INTEGER", true, 0, null, 1));
                map7.put("mLongitude", new TableInfo.Column("mLongitude", "REAL", true, 0, null, 1));
                map7.put("mLatitude", new TableInfo.Column("mLatitude", "REAL", true, 0, null, 1));
                map7.put("mSource", new TableInfo.Column("mSource", "INTEGER", true, 0, null, 1));
                map7.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map7.put("mIsBaiDuSync", new TableInfo.Column("mIsBaiDuSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet9 = new HashSet(0);
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.Index("index_Location_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo13 = new TableInfo("Location", map7, hashSet9, hashSet10);
                TableInfo tableInfo14 = TableInfo.read(connection, "Location");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Location(com.sma.smartv3.db.entity.Location).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                HashMap map8 = new HashMap(53);
                map8.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map8.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map8.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map8.put("mWeight", new TableInfo.Column("mWeight", "REAL", true, 0, null, 1));
                map8.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map8.put("mIsMeasure", new TableInfo.Column("mIsMeasure", "INTEGER", true, 0, null, 1));
                map8.put("mBmi", new TableInfo.Column("mBmi", "REAL", true, 0, null, 1));
                map8.put("mRatioOfFat", new TableInfo.Column("mRatioOfFat", "REAL", true, 0, null, 1));
                map8.put("mWeightOfMuscle", new TableInfo.Column("mWeightOfMuscle", "REAL", true, 0, null, 1));
                map8.put("mWeightOfFat", new TableInfo.Column("mWeightOfFat", "REAL", true, 0, null, 1));
                map8.put("mRatioOfProtein", new TableInfo.Column("mRatioOfProtein", "REAL", true, 0, null, 1));
                map8.put("mRatioOfWater", new TableInfo.Column("mRatioOfWater", "REAL", true, 0, null, 1));
                map8.put("mStateOfNutrition", new TableInfo.Column("mStateOfNutrition", "REAL", true, 0, null, 1));
                map8.put("mIdealWeight", new TableInfo.Column("mIdealWeight", "REAL", true, 0, null, 1));
                map8.put("mAgeOfBody", new TableInfo.Column("mAgeOfBody", "REAL", true, 0, null, 1));
                map8.put("mAgeOfBodyRange", new TableInfo.Column("mAgeOfBodyRange", "TEXT", true, 0, null, 1));
                map8.put("mBmiRange", new TableInfo.Column("mBmiRange", "TEXT", true, 0, null, 1));
                map8.put("mBmiWHORange", new TableInfo.Column("mBmiWHORange", "TEXT", true, 0, null, 1));
                map8.put("mBmr", new TableInfo.Column("mBmr", "REAL", true, 0, null, 1));
                map8.put("mBmrRange", new TableInfo.Column("mBmrRange", "TEXT", true, 0, null, 1));
                map8.put("mBodyShape", new TableInfo.Column("mBodyShape", "REAL", true, 0, null, 1));
                map8.put("mDesirableWeight", new TableInfo.Column("mDesirableWeight", "REAL", true, 0, null, 1));
                map8.put("mFatFreeBodyWeight", new TableInfo.Column("mFatFreeBodyWeight", "REAL", true, 0, null, 1));
                map8.put("mFatToControl", new TableInfo.Column("mFatToControl", "REAL", true, 0, null, 1));
                map8.put("mLevelOfVisceralFat", new TableInfo.Column("mLevelOfVisceralFat", "REAL", true, 0, null, 1));
                map8.put("mLevelOfVisceralFatRange", new TableInfo.Column("mLevelOfVisceralFatRange", "TEXT", true, 0, null, 1));
                map8.put("mMuscleToControl", new TableInfo.Column("mMuscleToControl", "REAL", true, 0, null, 1));
                map8.put("mRatioOfFatRange", new TableInfo.Column("mRatioOfFatRange", "TEXT", true, 0, null, 1));
                map8.put("mRatioOfMuscle", new TableInfo.Column("mRatioOfMuscle", "REAL", true, 0, null, 1));
                map8.put("mRatioOfMuscleRange", new TableInfo.Column("mRatioOfMuscleRange", "TEXT", true, 0, null, 1));
                map8.put("mRatioOfProteinRange", new TableInfo.Column("mRatioOfProteinRange", "TEXT", true, 0, null, 1));
                map8.put("mRatioOfSkeletalMuscle", new TableInfo.Column("mRatioOfSkeletalMuscle", "REAL", true, 0, null, 1));
                map8.put("mRatioOfSkeletalMuscleRange", new TableInfo.Column("mRatioOfSkeletalMuscleRange", "TEXT", true, 0, null, 1));
                map8.put("mRatioOfSubcutaneousFat", new TableInfo.Column("mRatioOfSubcutaneousFat", "REAL", true, 0, null, 1));
                map8.put("mRatioOfSubcutaneousFatRange", new TableInfo.Column("mRatioOfSubcutaneousFatRange", "TEXT", true, 0, null, 1));
                map8.put("mRatioOfWaterRange", new TableInfo.Column("mRatioOfWaterRange", "TEXT", true, 0, null, 1));
                map8.put("mScore", new TableInfo.Column("mScore", "REAL", true, 0, null, 1));
                map8.put("mWeightOfBone", new TableInfo.Column("mWeightOfBone", "REAL", true, 0, null, 1));
                map8.put("mWeightOfBoneRange", new TableInfo.Column("mWeightOfBoneRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightOfFatRange", new TableInfo.Column("mWeightOfFatRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightOfMuscleRange", new TableInfo.Column("mWeightOfMuscleRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightOfProtein", new TableInfo.Column("mWeightOfProtein", "REAL", true, 0, null, 1));
                map8.put("mWeightOfProteinRange", new TableInfo.Column("mWeightOfProteinRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightOfSkeletalMuscle", new TableInfo.Column("mWeightOfSkeletalMuscle", "REAL", true, 0, null, 1));
                map8.put("mWeightOfSkeletalMuscleRange", new TableInfo.Column("mWeightOfSkeletalMuscleRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightOfWater", new TableInfo.Column("mWeightOfWater", "REAL", true, 0, null, 1));
                map8.put("mWeightOfWaterRange", new TableInfo.Column("mWeightOfWaterRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightRange", new TableInfo.Column("mWeightRange", "TEXT", true, 0, null, 1));
                map8.put("mWeightToControl", new TableInfo.Column("mWeightToControl", "REAL", true, 0, null, 1));
                map8.put("mWeightWHORange", new TableInfo.Column("mWeightWHORange", "TEXT", true, 0, null, 1));
                map8.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map8.put("mRatioOfProteinLevel", new TableInfo.Column("mRatioOfProteinLevel", "INTEGER", true, 0, null, 1));
                map8.put("mRatioOfWaterLevel", new TableInfo.Column("mRatioOfWaterLevel", "INTEGER", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(1);
                hashSet12.add(new TableInfo.Index("index_Weight_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo15 = new TableInfo("Weight", map8, hashSet11, hashSet12);
                TableInfo tableInfo16 = TableInfo.read(connection, "Weight");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Weight(com.sma.smartv3.db.entity.Weight).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                HashMap map9 = new HashMap(5);
                map9.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map9.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map9.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map9.put("mTemperature", new TableInfo.Column("mTemperature", "INTEGER", true, 0, null, 1));
                map9.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet13 = new HashSet(0);
                HashSet hashSet14 = new HashSet(1);
                hashSet14.add(new TableInfo.Index("index_Temperature_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo17 = new TableInfo("Temperature", map9, hashSet13, hashSet14);
                TableInfo tableInfo18 = TableInfo.read(connection, "Temperature");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Temperature(com.sma.smartv3.db.entity.Temperature).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                HashMap map10 = new HashMap(10);
                map10.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map10.put("mScheduleId", new TableInfo.Column("mScheduleId", "INTEGER", true, 0, null, 1));
                map10.put("mYear", new TableInfo.Column("mYear", "INTEGER", true, 0, null, 1));
                map10.put("mMonth", new TableInfo.Column("mMonth", "INTEGER", true, 0, null, 1));
                map10.put("mDay", new TableInfo.Column("mDay", "INTEGER", true, 0, null, 1));
                map10.put("mHour", new TableInfo.Column("mHour", "INTEGER", true, 0, null, 1));
                map10.put("mMinute", new TableInfo.Column("mMinute", "INTEGER", true, 0, null, 1));
                map10.put("mAdvance", new TableInfo.Column("mAdvance", "INTEGER", true, 0, null, 1));
                map10.put("mTitle", new TableInfo.Column("mTitle", "TEXT", true, 0, null, 1));
                map10.put("mContent", new TableInfo.Column("mContent", "TEXT", true, 0, null, 1));
                TableInfo tableInfo19 = new TableInfo(AppEventsConstants.EVENT_NAME_SCHEDULE, map10, new HashSet(0), new HashSet(0));
                TableInfo tableInfo20 = TableInfo.read(connection, AppEventsConstants.EVENT_NAME_SCHEDULE);
                if (!tableInfo19.equals(tableInfo20)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Schedule(com.sma.smartv3.db.entity.Schedule).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
                }
                HashMap map11 = new HashMap(5);
                map11.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map11.put("mFrom", new TableInfo.Column("mFrom", "INTEGER", true, 0, null, 1));
                map11.put("mEndTime", new TableInfo.Column("mEndTime", "INTEGER", true, 0, null, 1));
                map11.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map11.put("mSyncStatus", new TableInfo.Column("mSyncStatus", "INTEGER", true, 0, null, 1));
                HashSet hashSet15 = new HashSet(0);
                HashSet hashSet16 = new HashSet(2);
                hashSet16.add(new TableInfo.Index("index_WorkoutIndex_mEndTime", true, Arrays.asList("mEndTime"), Arrays.asList("ASC")));
                hashSet16.add(new TableInfo.Index("index_WorkoutIndex_mSyncStatus", false, Arrays.asList("mSyncStatus"), Arrays.asList("ASC")));
                TableInfo tableInfo21 = new TableInfo("WorkoutIndex", map11, hashSet15, hashSet16);
                TableInfo tableInfo22 = TableInfo.read(connection, "WorkoutIndex");
                if (!tableInfo21.equals(tableInfo22)) {
                    return new RoomOpenDelegate.ValidationResult(false, "WorkoutIndex(com.sma.smartv3.db.entity.WorkoutIndex).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
                }
                HashMap map12 = new HashMap(5);
                map12.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map12.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map12.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map12.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map12.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet17 = new HashSet(0);
                HashSet hashSet18 = new HashSet(1);
                hashSet18.add(new TableInfo.Index("index_BloodOxygen_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo23 = new TableInfo("BloodOxygen", map12, hashSet17, hashSet18);
                TableInfo tableInfo24 = TableInfo.read(connection, "BloodOxygen");
                if (!tableInfo23.equals(tableInfo24)) {
                    return new RoomOpenDelegate.ValidationResult(false, "BloodOxygen(com.sma.smartv3.db.entity.BloodOxygen).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
                }
                HashMap map13 = new HashMap(6);
                map13.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map13.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map13.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map13.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map13.put("mAvgValue", new TableInfo.Column("mAvgValue", "INTEGER", true, 0, null, 1));
                map13.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet19 = new HashSet(0);
                HashSet hashSet20 = new HashSet(1);
                hashSet20.add(new TableInfo.Index("index_Hrv_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo25 = new TableInfo("Hrv", map13, hashSet19, hashSet20);
                TableInfo tableInfo26 = TableInfo.read(connection, "Hrv");
                if (!tableInfo25.equals(tableInfo26)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Hrv(com.sma.smartv3.db.entity.Hrv).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
                }
                HashMap map14 = new HashMap(5);
                map14.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map14.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map14.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map14.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map14.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet21 = new HashSet(0);
                HashSet hashSet22 = new HashSet(1);
                hashSet22.add(new TableInfo.Index("index_Pressure_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo27 = new TableInfo("Pressure", map14, hashSet21, hashSet22);
                TableInfo tableInfo28 = TableInfo.read(connection, "Pressure");
                if (!tableInfo27.equals(tableInfo28)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Pressure(com.sma.smartv3.db.entity.Pressure).\n Expected:\n" + tableInfo27 + "\n Found:\n" + tableInfo28);
                }
                HashMap map15 = new HashMap(15);
                map15.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map15.put("mMatchRecordId", new TableInfo.Column("mMatchRecordId", "INTEGER", true, 0, null, 1));
                map15.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map15.put("mCountingTime", new TableInfo.Column("mCountingTime", "INTEGER", true, 0, null, 1));
                map15.put("mPeriodTime", new TableInfo.Column("mPeriodTime", "INTEGER", true, 0, null, 1));
                map15.put("mPeriodNumber", new TableInfo.Column("mPeriodNumber", "INTEGER", true, 0, null, 1));
                map15.put("mType", new TableInfo.Column("mType", "INTEGER", true, 0, null, 1));
                map15.put("mCount", new TableInfo.Column("mCount", "INTEGER", true, 0, null, 1));
                map15.put("mCancelType", new TableInfo.Column("mCancelType", "INTEGER", true, 0, null, 1));
                map15.put("mTeam", new TableInfo.Column("mTeam", "INTEGER", true, 0, null, 1));
                map15.put("mPlayer", new TableInfo.Column("mPlayer", "INTEGER", true, 0, null, 1));
                map15.put("mOtherType", new TableInfo.Column("mOtherType", "INTEGER", true, 0, null, 1));
                map15.put("mStopWatchTotal", new TableInfo.Column("mStopWatchTotal", "INTEGER", true, 0, null, 1));
                map15.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map15.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo29 = new TableInfo("MatchLog", map15, new HashSet(0), new HashSet(0));
                TableInfo tableInfo30 = TableInfo.read(connection, "MatchLog");
                if (!tableInfo29.equals(tableInfo30)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MatchLog(com.sma.smartv3.db.entity.MatchLog).\n Expected:\n" + tableInfo29 + "\n Found:\n" + tableInfo30);
                }
                HashMap map16 = new HashMap(12);
                map16.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map16.put("mMatchRecordId", new TableInfo.Column("mMatchRecordId", "INTEGER", true, 0, null, 1));
                map16.put("mDuration", new TableInfo.Column("mDuration", "INTEGER", true, 0, null, 1));
                map16.put("mDistance", new TableInfo.Column("mDistance", "INTEGER", true, 0, null, 1));
                map16.put("mStep", new TableInfo.Column("mStep", "INTEGER", true, 0, null, 1));
                map16.put("mCalorie", new TableInfo.Column("mCalorie", "INTEGER", true, 0, null, 1));
                map16.put("mSpeed", new TableInfo.Column("mSpeed", "INTEGER", true, 0, null, 1));
                map16.put("mAvgBpm", new TableInfo.Column("mAvgBpm", "INTEGER", true, 0, null, 1));
                map16.put("mMaxBpm", new TableInfo.Column("mMaxBpm", "INTEGER", true, 0, null, 1));
                map16.put("mMaxSpeed", new TableInfo.Column("mMaxSpeed", "INTEGER", true, 0, null, 1));
                map16.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map16.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo31 = new TableInfo("MatchPeriod", map16, new HashSet(0), new HashSet(0));
                TableInfo tableInfo32 = TableInfo.read(connection, "MatchPeriod");
                if (!tableInfo31.equals(tableInfo32)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MatchPeriod(com.sma.smartv3.db.entity.MatchPeriod).\n Expected:\n" + tableInfo31 + "\n Found:\n" + tableInfo32);
                }
                HashMap map17 = new HashMap(39);
                map17.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map17.put("mStart", new TableInfo.Column("mStart", "INTEGER", true, 0, null, 1));
                map17.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map17.put("mType", new TableInfo.Column("mType", "INTEGER", true, 0, null, 1));
                map17.put("mPeriodListSize", new TableInfo.Column("mPeriodListSize", "INTEGER", true, 0, null, 1));
                map17.put("mLogListSize", new TableInfo.Column("mLogListSize", "INTEGER", true, 0, null, 1));
                map17.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map17.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map17.put("mSource", new TableInfo.Column("mSource", "INTEGER", true, 0, null, 1));
                map17.put("mIsStopWatchData", new TableInfo.Column("mIsStopWatchData", "INTEGER", true, 0, null, 1));
                map17.put("mStopWatchList", new TableInfo.Column("mStopWatchList", "TEXT", false, 0, "''", 1));
                map17.put("mTeamInfo", new TableInfo.Column("mTeamInfo", "TEXT", false, 0, "''", 1));
                map17.put("mWeather", new TableInfo.Column("mWeather", "TEXT", false, 0, "''", 1));
                map17.put("mHomeTeamScore", new TableInfo.Column("mHomeTeamScore", "INTEGER", true, 0, null, 1));
                map17.put("mGuestTeamScore", new TableInfo.Column("mGuestTeamScore", "INTEGER", true, 0, null, 1));
                map17.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map17.put("mMinBpm", new TableInfo.Column("mMinBpm", "INTEGER", true, 0, null, 1));
                map17.put("mAirPressure", new TableInfo.Column("mAirPressure", "INTEGER", true, 0, null, 1));
                map17.put("mPace", new TableInfo.Column("mPace", "INTEGER", true, 0, null, 1));
                map17.put("mMaxPace", new TableInfo.Column("mMaxPace", "INTEGER", true, 0, null, 1));
                map17.put("mMinPace", new TableInfo.Column("mMinPace", "INTEGER", true, 0, null, 1));
                map17.put("mSpm", new TableInfo.Column("mSpm", "INTEGER", true, 0, null, 1));
                map17.put("mMaxSpm", new TableInfo.Column("mMaxSpm", "INTEGER", true, 0, null, 1));
                map17.put("mMinSpm", new TableInfo.Column("mMinSpm", "INTEGER", true, 0, null, 1));
                map17.put("mAltitude", new TableInfo.Column("mAltitude", "INTEGER", true, 0, null, 1));
                map17.put("mMaxAltitude", new TableInfo.Column("mMaxAltitude", "INTEGER", true, 0, null, 1));
                map17.put("mMinAltitude", new TableInfo.Column("mMinAltitude", "INTEGER", true, 0, null, 1));
                map17.put("p_mId", new TableInfo.Column("p_mId", "INTEGER", true, 0, null, 1));
                map17.put("p_mMatchRecordId", new TableInfo.Column("p_mMatchRecordId", "INTEGER", true, 0, null, 1));
                map17.put("p_mDuration", new TableInfo.Column("p_mDuration", "INTEGER", true, 0, null, 1));
                map17.put("p_mDistance", new TableInfo.Column("p_mDistance", "INTEGER", true, 0, null, 1));
                map17.put("p_mStep", new TableInfo.Column("p_mStep", "INTEGER", true, 0, null, 1));
                map17.put("p_mCalorie", new TableInfo.Column("p_mCalorie", "INTEGER", true, 0, null, 1));
                map17.put("p_mSpeed", new TableInfo.Column("p_mSpeed", "INTEGER", true, 0, null, 1));
                map17.put("p_mAvgBpm", new TableInfo.Column("p_mAvgBpm", "INTEGER", true, 0, null, 1));
                map17.put("p_mMaxBpm", new TableInfo.Column("p_mMaxBpm", "INTEGER", true, 0, null, 1));
                map17.put("p_mMaxSpeed", new TableInfo.Column("p_mMaxSpeed", "INTEGER", true, 0, null, 1));
                map17.put("p_mIsSync", new TableInfo.Column("p_mIsSync", "INTEGER", true, 0, null, 1));
                map17.put("p_mIsDelete", new TableInfo.Column("p_mIsDelete", "INTEGER", true, 0, null, 1));
                HashSet hashSet23 = new HashSet(0);
                HashSet hashSet24 = new HashSet(1);
                hashSet24.add(new TableInfo.Index("index_MatchRecord_mStart", true, Arrays.asList("mStart"), Arrays.asList("ASC")));
                TableInfo tableInfo33 = new TableInfo("MatchRecord", map17, hashSet23, hashSet24);
                TableInfo tableInfo34 = TableInfo.read(connection, "MatchRecord");
                if (!tableInfo33.equals(tableInfo34)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MatchRecord(com.sma.smartv3.db.entity.MatchRecord).\n Expected:\n" + tableInfo33 + "\n Found:\n" + tableInfo34);
                }
                HashMap map18 = new HashMap(15);
                map18.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map18.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map18.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map18.put("mStep", new TableInfo.Column("mStep", "INTEGER", true, 0, null, 1));
                map18.put("mDistance", new TableInfo.Column("mDistance", "INTEGER", true, 0, null, 1));
                map18.put("mCalorie", new TableInfo.Column("mCalorie", "INTEGER", true, 0, null, 1));
                map18.put("mDuration", new TableInfo.Column("mDuration", "INTEGER", true, 0, null, 1));
                map18.put("mSpm", new TableInfo.Column("mSpm", "INTEGER", true, 0, null, 1));
                map18.put("mAltitude", new TableInfo.Column("mAltitude", "INTEGER", true, 0, null, 1));
                map18.put("mAirPressure", new TableInfo.Column("mAirPressure", "INTEGER", true, 0, null, 1));
                map18.put("mPace", new TableInfo.Column("mPace", "INTEGER", true, 0, null, 1));
                map18.put("mSpeed", new TableInfo.Column("mSpeed", "INTEGER", true, 0, null, 1));
                map18.put("mMode", new TableInfo.Column("mMode", "INTEGER", true, 0, null, 1));
                map18.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map18.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo35 = new TableInfo("SportData", map18, new HashSet(0), new HashSet(0));
                TableInfo tableInfo36 = TableInfo.read(connection, "SportData");
                if (!tableInfo35.equals(tableInfo36)) {
                    return new RoomOpenDelegate.ValidationResult(false, "SportData(com.sma.smartv3.db.entity.SportData).\n Expected:\n" + tableInfo35 + "\n Found:\n" + tableInfo36);
                }
                HashMap map19 = new HashMap(5);
                map19.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map19.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map19.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map19.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map19.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet25 = new HashSet(0);
                HashSet hashSet26 = new HashSet(1);
                hashSet26.add(new TableInfo.Index("index_BloodGlucose_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo37 = new TableInfo("BloodGlucose", map19, hashSet25, hashSet26);
                TableInfo tableInfo38 = TableInfo.read(connection, "BloodGlucose");
                if (!tableInfo37.equals(tableInfo38)) {
                    return new RoomOpenDelegate.ValidationResult(false, "BloodGlucose(com.sma.smartv3.db.entity.BloodGlucose).\n Expected:\n" + tableInfo37 + "\n Found:\n" + tableInfo38);
                }
                HashMap map20 = new HashMap(10);
                map20.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map20.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map20.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map20.put("mBleName", new TableInfo.Column("mBleName", "TEXT", true, 0, null, 1));
                map20.put("mFirmwareFlag", new TableInfo.Column("mFirmwareFlag", "TEXT", true, 0, null, 1));
                map20.put("mMacAddress", new TableInfo.Column("mMacAddress", "TEXT", true, 0, null, 1));
                map20.put("mFirmwareVersion", new TableInfo.Column("mFirmwareVersion", "TEXT", true, 0, null, 1));
                map20.put("mAppVersion", new TableInfo.Column("mAppVersion", "TEXT", true, 0, null, 1));
                map20.put("mResult", new TableInfo.Column("mResult", "INTEGER", true, 0, null, 1));
                map20.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet27 = new HashSet(0);
                HashSet hashSet28 = new HashSet(1);
                hashSet28.add(new TableInfo.Index("index_AlipayBindInfo_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo39 = new TableInfo("AlipayBindInfo", map20, hashSet27, hashSet28);
                TableInfo tableInfo40 = TableInfo.read(connection, "AlipayBindInfo");
                if (!tableInfo39.equals(tableInfo40)) {
                    return new RoomOpenDelegate.ValidationResult(false, "AlipayBindInfo(com.sma.smartv3.db.entity.AlipayBindInfo).\n Expected:\n" + tableInfo39 + "\n Found:\n" + tableInfo40);
                }
                HashMap map21 = new HashMap(5);
                map21.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map21.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map21.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map21.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map21.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet29 = new HashSet(0);
                HashSet hashSet30 = new HashSet(1);
                hashSet30.add(new TableInfo.Index("index_Electrocardiogram_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo41 = new TableInfo("Electrocardiogram", map21, hashSet29, hashSet30);
                TableInfo tableInfo42 = TableInfo.read(connection, "Electrocardiogram");
                if (!tableInfo41.equals(tableInfo42)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Electrocardiogram(com.sma.smartv3.db.entity.Electrocardiogram).\n Expected:\n" + tableInfo41 + "\n Found:\n" + tableInfo42);
                }
                HashMap map22 = new HashMap(20);
                map22.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map22.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map22.put("mMeasurementId", new TableInfo.Column("mMeasurementId", "TEXT", true, 0, null, 1));
                map22.put("mUserId", new TableInfo.Column("mUserId", "TEXT", true, 0, null, 1));
                map22.put("mStartTime", new TableInfo.Column("mStartTime", "TEXT", true, 0, null, 1));
                map22.put("mEndTime", new TableInfo.Column("mEndTime", "TEXT", true, 0, null, 1));
                map22.put("mModelNo", new TableInfo.Column("mModelNo", "TEXT", true, 0, null, 1));
                map22.put("mLowerBound", new TableInfo.Column("mLowerBound", "REAL", true, 0, null, 1));
                map22.put("mUpperBound", new TableInfo.Column("mUpperBound", "REAL", true, 0, null, 1));
                map22.put("mFasting", new TableInfo.Column("mFasting", "INTEGER", true, 0, null, 1));
                map22.put("mWithin2hrsMeal", new TableInfo.Column("mWithin2hrsMeal", "INTEGER", true, 0, null, 1));
                map22.put("mCompletedProgress", new TableInfo.Column("mCompletedProgress", "INTEGER", true, 0, null, 1));
                map22.put("mCurrentLevel", new TableInfo.Column("mCurrentLevel", "INTEGER", true, 0, null, 1));
                map22.put("mRiskCode", new TableInfo.Column("mRiskCode", "TEXT", true, 0, null, 1));
                map22.put("mInsights", new TableInfo.Column("mInsights", "TEXT", true, 0, null, 1));
                map22.put("mTips", new TableInfo.Column("mTips", "TEXT", true, 0, null, 1));
                map22.put("mLocaleInsights", new TableInfo.Column("mLocaleInsights", "TEXT", true, 0, null, 1));
                map22.put("mLocaleTips", new TableInfo.Column("mLocaleTips", "TEXT", true, 0, null, 1));
                map22.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map22.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                HashSet hashSet31 = new HashSet(0);
                HashSet hashSet32 = new HashSet(1);
                hashSet32.add(new TableInfo.Index("index_BloodGlucose2_mMeasurementId", true, Arrays.asList("mMeasurementId"), Arrays.asList("ASC")));
                TableInfo tableInfo43 = new TableInfo("BloodGlucose2", map22, hashSet31, hashSet32);
                TableInfo tableInfo44 = TableInfo.read(connection, "BloodGlucose2");
                if (!tableInfo43.equals(tableInfo44)) {
                    return new RoomOpenDelegate.ValidationResult(false, "BloodGlucose2(com.sma.smartv3.db.entity.BloodGlucose2).\n Expected:\n" + tableInfo43 + "\n Found:\n" + tableInfo44);
                }
                HashMap map23 = new HashMap(7);
                map23.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map23.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map23.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map23.put("mVibration", new TableInfo.Column("mVibration", "INTEGER", true, 0, null, 1));
                map23.put("mBOValue", new TableInfo.Column("mBOValue", "INTEGER", true, 0, null, 1));
                map23.put("mIsSnore", new TableInfo.Column("mIsSnore", "INTEGER", true, 0, null, 1));
                map23.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet33 = new HashSet(0);
                HashSet hashSet34 = new HashSet(1);
                hashSet34.add(new TableInfo.Index("index_HanBaoVibration_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo45 = new TableInfo("HanBaoVibration", map23, hashSet33, hashSet34);
                TableInfo tableInfo46 = TableInfo.read(connection, "HanBaoVibration");
                if (!tableInfo45.equals(tableInfo46)) {
                    return new RoomOpenDelegate.ValidationResult(false, "HanBaoVibration(com.sma.smartv3.db.entity.HanBaoVibration).\n Expected:\n" + tableInfo45 + "\n Found:\n" + tableInfo46);
                }
                HashMap map24 = new HashMap(35);
                map24.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map24.put("mUserGender", new TableInfo.Column("mUserGender", "INTEGER", true, 0, null, 1));
                map24.put("mUserWeight", new TableInfo.Column("mUserWeight", "REAL", true, 0, null, 1));
                map24.put("mUserHeight", new TableInfo.Column("mUserHeight", "REAL", true, 0, null, 1));
                map24.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map24.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map24.put("mAbnormalNumber", new TableInfo.Column("mAbnormalNumber", "INTEGER", true, 0, null, 1));
                map24.put("mHeartRateTime", new TableInfo.Column("mHeartRateTime", "INTEGER", true, 0, null, 1));
                map24.put("mHeartRateValue", new TableInfo.Column("mHeartRateValue", "INTEGER", true, 0, null, 1));
                map24.put("mHeartRateAIRecords", new TableInfo.Column("mHeartRateAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mBloodPressureTime", new TableInfo.Column("mBloodPressureTime", "INTEGER", true, 0, null, 1));
                map24.put("mSystolicValue", new TableInfo.Column("mSystolicValue", "INTEGER", true, 0, null, 1));
                map24.put("mDiastolicValue", new TableInfo.Column("mDiastolicValue", "INTEGER", true, 0, null, 1));
                map24.put("mBloodPressureAIRecords", new TableInfo.Column("mBloodPressureAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mBloodOxygenTime", new TableInfo.Column("mBloodOxygenTime", "INTEGER", true, 0, null, 1));
                map24.put("mBloodOxygenValue", new TableInfo.Column("mBloodOxygenValue", "INTEGER", true, 0, null, 1));
                map24.put("mBloodOxygenAIRecords", new TableInfo.Column("mBloodOxygenAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mSleepTime", new TableInfo.Column("mSleepTime", "INTEGER", true, 0, null, 1));
                map24.put("mSleepDeepLengthTime", new TableInfo.Column("mSleepDeepLengthTime", "REAL", true, 0, null, 1));
                map24.put("mSleepPiecemealTime", new TableInfo.Column("mSleepPiecemealTime", "REAL", true, 0, null, 1));
                map24.put("mSleepAIRecords", new TableInfo.Column("mSleepAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mPressureTime", new TableInfo.Column("mPressureTime", "INTEGER", true, 0, null, 1));
                map24.put("mPressureValue", new TableInfo.Column("mPressureValue", "INTEGER", true, 0, null, 1));
                map24.put("mPressureAIRecords", new TableInfo.Column("mPressureAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mBloodGlucose2Time", new TableInfo.Column("mBloodGlucose2Time", "INTEGER", true, 0, null, 1));
                map24.put("mBloodGlucose2Value", new TableInfo.Column("mBloodGlucose2Value", "REAL", true, 0, null, 1));
                map24.put("mBloodGlucose2AIRecords", new TableInfo.Column("mBloodGlucose2AIRecords", "TEXT", true, 0, null, 1));
                map24.put("mWeightTime", new TableInfo.Column("mWeightTime", "INTEGER", true, 0, null, 1));
                map24.put("mWeightValue", new TableInfo.Column("mWeightValue", "REAL", true, 0, null, 1));
                map24.put("mWeightAIRecords", new TableInfo.Column("mWeightAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mWeekSportsTime", new TableInfo.Column("mWeekSportsTime", "INTEGER", true, 0, null, 1));
                map24.put("mWeekSportsNumber", new TableInfo.Column("mWeekSportsNumber", "INTEGER", true, 0, null, 1));
                map24.put("mWeekSportsAllTime", new TableInfo.Column("mWeekSportsAllTime", "INTEGER", true, 0, null, 1));
                map24.put("mWeekSportsAIRecords", new TableInfo.Column("mWeekSportsAIRecords", "TEXT", true, 0, null, 1));
                map24.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet35 = new HashSet(0);
                HashSet hashSet36 = new HashSet(1);
                hashSet36.add(new TableInfo.Index("index_HealthyReport_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo47 = new TableInfo("HealthyReport", map24, hashSet35, hashSet36);
                TableInfo tableInfo48 = TableInfo.read(connection, "HealthyReport");
                if (!tableInfo47.equals(tableInfo48)) {
                    return new RoomOpenDelegate.ValidationResult(false, "HealthyReport(com.sma.smartv3.db.entity.HealthyReport).\n Expected:\n" + tableInfo47 + "\n Found:\n" + tableInfo48);
                }
                HashMap map25 = new HashMap(5);
                map25.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map25.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map25.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map25.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map25.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet37 = new HashSet(0);
                HashSet hashSet38 = new HashSet(1);
                hashSet38.add(new TableInfo.Index("index_DailyPower_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo49 = new TableInfo("DailyPower", map25, hashSet37, hashSet38);
                TableInfo tableInfo50 = TableInfo.read(connection, "DailyPower");
                if (!tableInfo49.equals(tableInfo50)) {
                    return new RoomOpenDelegate.ValidationResult(false, "DailyPower(com.sma.smartv3.db.entity.DailyPower).\n Expected:\n" + tableInfo49 + "\n Found:\n" + tableInfo50);
                }
                HashMap map26 = new HashMap(11);
                map26.put("requestId", new TableInfo.Column("requestId", "TEXT", true, 1, null, 1));
                map26.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, 1));
                map26.put("translate", new TableInfo.Column("translate", "TEXT", true, 0, null, 1));
                map26.put(JsonStorageKeyNames.SESSION_ID_KEY, new TableInfo.Column(JsonStorageKeyNames.SESSION_ID_KEY, "TEXT", true, 0, null, 1));
                map26.put("duration", new TableInfo.Column("duration", "REAL", true, 0, null, 1));
                map26.put("isUpLoaded", new TableInfo.Column("isUpLoaded", "INTEGER", true, 0, null, 1));
                map26.put("audioPath", new TableInfo.Column("audioPath", "TEXT", true, 0, null, 1));
                map26.put("fromLanguage", new TableInfo.Column("fromLanguage", "TEXT", true, 0, null, 1));
                map26.put("toLanguage", new TableInfo.Column("toLanguage", "TEXT", true, 0, null, 1));
                map26.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map26.put("showType", new TableInfo.Column("showType", "INTEGER", true, 0, null, 1));
                HashSet hashSet39 = new HashSet(1);
                hashSet39.add(new TableInfo.ForeignKey("TranslateSessionEntity", "CASCADE", "NO ACTION", Arrays.asList(JsonStorageKeyNames.SESSION_ID_KEY), Arrays.asList(JsonStorageKeyNames.SESSION_ID_KEY)));
                HashSet hashSet40 = new HashSet(1);
                hashSet40.add(new TableInfo.Index("index_TranslateEntity_sessionId", false, Arrays.asList(JsonStorageKeyNames.SESSION_ID_KEY), Arrays.asList("ASC")));
                TableInfo tableInfo51 = new TableInfo("TranslateEntity", map26, hashSet39, hashSet40);
                TableInfo tableInfo52 = TableInfo.read(connection, "TranslateEntity");
                if (!tableInfo51.equals(tableInfo52)) {
                    return new RoomOpenDelegate.ValidationResult(false, "TranslateEntity(com.sma.smartv3.db.entity.TranslateEntity).\n Expected:\n" + tableInfo51 + "\n Found:\n" + tableInfo52);
                }
                HashMap map27 = new HashMap(5);
                map27.put(JsonStorageKeyNames.SESSION_ID_KEY, new TableInfo.Column(JsonStorageKeyNames.SESSION_ID_KEY, "TEXT", true, 1, null, 1));
                map27.put("audioPath", new TableInfo.Column("audioPath", "TEXT", true, 0, null, 1));
                map27.put("duration", new TableInfo.Column("duration", "REAL", true, 0, null, 1));
                map27.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map27.put("isDelete", new TableInfo.Column("isDelete", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo53 = new TableInfo("TranslateSessionEntity", map27, new HashSet(0), new HashSet(0));
                TableInfo tableInfo54 = TableInfo.read(connection, "TranslateSessionEntity");
                if (!tableInfo53.equals(tableInfo54)) {
                    return new RoomOpenDelegate.ValidationResult(false, "TranslateSessionEntity(com.sma.smartv3.db.entity.TranslateSessionEntity).\n Expected:\n" + tableInfo53 + "\n Found:\n" + tableInfo54);
                }
                HashMap map28 = new HashMap(11);
                map28.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map28.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map28.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map28.put("mAllVitality", new TableInfo.Column("mAllVitality", "INTEGER", true, 0, null, 1));
                map28.put("mLowIntensityTime", new TableInfo.Column("mLowIntensityTime", "INTEGER", true, 0, null, 1));
                map28.put("mLowIntensityValue", new TableInfo.Column("mLowIntensityValue", "INTEGER", true, 0, null, 1));
                map28.put("mMediumIntensityTime", new TableInfo.Column("mMediumIntensityTime", "INTEGER", true, 0, null, 1));
                map28.put("mMediumIntensityValue", new TableInfo.Column("mMediumIntensityValue", "INTEGER", true, 0, null, 1));
                map28.put("mHighIntensityTime", new TableInfo.Column("mHighIntensityTime", "INTEGER", true, 0, null, 1));
                map28.put("mHighIntensityValue", new TableInfo.Column("mHighIntensityValue", "INTEGER", true, 0, null, 1));
                map28.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet41 = new HashSet(0);
                HashSet hashSet42 = new HashSet(1);
                hashSet42.add(new TableInfo.Index("index_Vitality_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo55 = new TableInfo("Vitality", map28, hashSet41, hashSet42);
                TableInfo tableInfo56 = TableInfo.read(connection, "Vitality");
                if (!tableInfo55.equals(tableInfo56)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Vitality(com.sma.smartv3.db.entity.Vitality).\n Expected:\n" + tableInfo55 + "\n Found:\n" + tableInfo56);
                }
                HashMap map29 = new HashMap(5);
                map29.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map29.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map29.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map29.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map29.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet43 = new HashSet(0);
                HashSet hashSet44 = new HashSet(1);
                hashSet44.add(new TableInfo.Index("index_RespiratoryRate_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo57 = new TableInfo("RespiratoryRate", map29, hashSet43, hashSet44);
                TableInfo tableInfo58 = TableInfo.read(connection, "RespiratoryRate");
                if (!tableInfo57.equals(tableInfo58)) {
                    return new RoomOpenDelegate.ValidationResult(false, "RespiratoryRate(com.sma.smartv3.db.entity.RespiratoryRate).\n Expected:\n" + tableInfo57 + "\n Found:\n" + tableInfo58);
                }
                HashMap map30 = new HashMap(5);
                map30.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map30.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map30.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map30.put("mValue", new TableInfo.Column("mValue", "INTEGER", true, 0, null, 1));
                map30.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet45 = new HashSet(0);
                HashSet hashSet46 = new HashSet(1);
                hashSet46.add(new TableInfo.Index("index_PhysicalPower_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo59 = new TableInfo("PhysicalPower", map30, hashSet45, hashSet46);
                TableInfo tableInfo60 = TableInfo.read(connection, "PhysicalPower");
                if (!tableInfo59.equals(tableInfo60)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PhysicalPower(com.sma.smartv3.db.entity.PhysicalPower).\n Expected:\n" + tableInfo59 + "\n Found:\n" + tableInfo60);
                }
                HashMap map31 = new HashMap(6);
                map31.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map31.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
                map31.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map31.put("aiMode", new TableInfo.Column("aiMode", "TEXT", true, 0, null, 1));
                map31.put(C12616d4.i.f34369g0, new TableInfo.Column(C12616d4.i.f34369g0, "INTEGER", true, 0, null, 1));
                map31.put("showType", new TableInfo.Column("showType", "TEXT", true, 0, null, 1));
                HashSet hashSet47 = new HashSet(0);
                HashSet hashSet48 = new HashSet(1);
                hashSet48.add(new TableInfo.Index("index_ChatVoiceAssistantMessage_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
                TableInfo tableInfo61 = new TableInfo("ChatVoiceAssistantMessage", map31, hashSet47, hashSet48);
                TableInfo tableInfo62 = TableInfo.read(connection, "ChatVoiceAssistantMessage");
                if (!tableInfo61.equals(tableInfo62)) {
                    return new RoomOpenDelegate.ValidationResult(false, "ChatVoiceAssistantMessage(com.sma.smartv3.db.entity.ChatVoiceAssistantMessage).\n Expected:\n" + tableInfo61 + "\n Found:\n" + tableInfo62);
                }
                HashMap map32 = new HashMap(6);
                map32.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map32.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map32.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map32.put("mScore", new TableInfo.Column("mScore", "INTEGER", true, 0, null, 1));
                map32.put("mGear", new TableInfo.Column("mGear", "INTEGER", true, 0, null, 1));
                map32.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                HashSet hashSet49 = new HashSet(0);
                HashSet hashSet50 = new HashSet(1);
                hashSet50.add(new TableInfo.Index("index_EnergyRating_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo63 = new TableInfo("EnergyRating", map32, hashSet49, hashSet50);
                TableInfo tableInfo64 = TableInfo.read(connection, "EnergyRating");
                if (!tableInfo63.equals(tableInfo64)) {
                    return new RoomOpenDelegate.ValidationResult(false, "EnergyRating(com.sma.smartv3.db.entity.EnergyRating).\n Expected:\n" + tableInfo63 + "\n Found:\n" + tableInfo64);
                }
                HashMap map33 = new HashMap(27);
                map33.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map33.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map33.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map33.put("mName", new TableInfo.Column("mName", "TEXT", true, 0, null, 1));
                map33.put("mPath", new TableInfo.Column("mPath", "TEXT", true, 0, null, 1));
                map33.put("mSize", new TableInfo.Column("mSize", "INTEGER", true, 0, null, 1));
                map33.put("mWidth", new TableInfo.Column("mWidth", "INTEGER", true, 0, null, 1));
                map33.put("mHeight", new TableInfo.Column("mHeight", "INTEGER", true, 0, null, 1));
                map33.put("mDuration", new TableInfo.Column("mDuration", "INTEGER", true, 0, null, 1));
                map33.put("mThumbnail", new TableInfo.Column("mThumbnail", "TEXT", true, 0, null, 1));
                map33.put("mFileType", new TableInfo.Column("mFileType", "INTEGER", true, 0, null, 1));
                map33.put("mIsFavority", new TableInfo.Column("mIsFavority", "INTEGER", true, 0, null, 1));
                map33.put("mContent", new TableInfo.Column("mContent", "TEXT", true, 0, null, 1));
                map33.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map33.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map33.put("mProcessType", new TableInfo.Column("mProcessType", "INTEGER", true, 0, null, 1));
                map33.put("mProcessStatus", new TableInfo.Column("mProcessStatus", "INTEGER", true, 0, null, 1));
                map33.put("mProcessPath", new TableInfo.Column("mProcessPath", "TEXT", true, 0, null, 1));
                map33.put("mIsRead", new TableInfo.Column("mIsRead", "INTEGER", true, 0, null, 1));
                map33.put("mIsConversion", new TableInfo.Column("mIsConversion", "INTEGER", true, 0, null, 1));
                map33.put("mReservedTextType", new TableInfo.Column("mReservedTextType", "INTEGER", true, 0, null, 1));
                map33.put("mReservedText", new TableInfo.Column("mReservedText", "TEXT", true, 0, null, 1));
                map33.put("mIsSummaryReport", new TableInfo.Column("mIsSummaryReport", "INTEGER", true, 0, null, 1));
                map33.put("mSummaryReportText", new TableInfo.Column("mSummaryReportText", "TEXT", true, 0, null, 1));
                map33.put("mFileName", new TableInfo.Column("mFileName", "TEXT", true, 0, null, 1));
                map33.put("mTaskId", new TableInfo.Column("mTaskId", "TEXT", true, 0, null, 1));
                map33.put("mModel", new TableInfo.Column("mModel", "INTEGER", true, 0, null, 1));
                HashSet hashSet51 = new HashSet(0);
                HashSet hashSet52 = new HashSet(1);
                hashSet52.add(new TableInfo.Index("index_RecordDeviceFile_mTime", true, Arrays.asList("mTime"), Arrays.asList("ASC")));
                TableInfo tableInfo65 = new TableInfo("RecordDeviceFile", map33, hashSet51, hashSet52);
                TableInfo tableInfo66 = TableInfo.read(connection, "RecordDeviceFile");
                if (!tableInfo65.equals(tableInfo66)) {
                    return new RoomOpenDelegate.ValidationResult(false, "RecordDeviceFile(com.sma.smartv3.db.entity.RecordDeviceFile).\n Expected:\n" + tableInfo65 + "\n Found:\n" + tableInfo66);
                }
                HashMap map34 = new HashMap(11);
                map34.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map34.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map34.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map34.put("mMac", new TableInfo.Column("mMac", "TEXT", true, 0, null, 1));
                map34.put("mName", new TableInfo.Column("mName", "TEXT", true, 0, null, 1));
                map34.put("mVersion", new TableInfo.Column("mVersion", "TEXT", true, 0, null, 1));
                map34.put("mBattery", new TableInfo.Column("mBattery", "INTEGER", true, 0, null, 1));
                map34.put("mTotalStorage", new TableInfo.Column("mTotalStorage", "INTEGER", true, 0, null, 1));
                map34.put("mAvailableStorage", new TableInfo.Column("mAvailableStorage", "INTEGER", true, 0, null, 1));
                map34.put("isActive", new TableInfo.Column("isActive", "INTEGER", true, 0, null, 1));
                map34.put("mVoltage", new TableInfo.Column("mVoltage", "INTEGER", true, 0, null, 1));
                HashSet hashSet53 = new HashSet(0);
                HashSet hashSet54 = new HashSet(1);
                hashSet54.add(new TableInfo.Index("index_RecordDeviceInfo_mMac", true, Arrays.asList("mMac"), Arrays.asList("ASC")));
                TableInfo tableInfo67 = new TableInfo("RecordDeviceInfo", map34, hashSet53, hashSet54);
                TableInfo tableInfo68 = TableInfo.read(connection, "RecordDeviceInfo");
                if (!tableInfo67.equals(tableInfo68)) {
                    return new RoomOpenDelegate.ValidationResult(false, "RecordDeviceInfo(com.sma.smartv3.db.entity.RecordDeviceInfo).\n Expected:\n" + tableInfo67 + "\n Found:\n" + tableInfo68);
                }
                HashMap map35 = new HashMap(5);
                map35.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map35.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map35.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map35.put("mFileName", new TableInfo.Column("mFileName", "TEXT", true, 0, null, 1));
                map35.put("mName", new TableInfo.Column("mName", "TEXT", true, 0, null, 1));
                TableInfo tableInfo69 = new TableInfo("RecordDeviceManage", map35, new HashSet(0), new HashSet(0));
                TableInfo tableInfo70 = TableInfo.read(connection, "RecordDeviceManage");
                if (!tableInfo69.equals(tableInfo70)) {
                    return new RoomOpenDelegate.ValidationResult(false, "RecordDeviceManage(com.sma.smartv3.db.entity.RecordDeviceManage).\n Expected:\n" + tableInfo69 + "\n Found:\n" + tableInfo70);
                }
                HashMap map36 = new HashMap(14);
                map36.put("mId", new TableInfo.Column("mId", "INTEGER", true, 1, null, 1));
                map36.put("mTime", new TableInfo.Column("mTime", "INTEGER", true, 0, null, 1));
                map36.put("mLocalTime", new TableInfo.Column("mLocalTime", "TEXT", true, 0, null, 1));
                map36.put("mTitle", new TableInfo.Column("mTitle", "TEXT", true, 0, null, 1));
                map36.put("mContent", new TableInfo.Column("mContent", "TEXT", true, 0, null, 1));
                map36.put("mIsRemindEnabled", new TableInfo.Column("mIsRemindEnabled", "INTEGER", true, 0, null, 1));
                map36.put("mRepeatType", new TableInfo.Column("mRepeatType", "INTEGER", true, 0, null, 1));
                map36.put("mRemindTime", new TableInfo.Column("mRemindTime", "INTEGER", true, 0, null, 1));
                map36.put("mLastRemindTime", new TableInfo.Column("mLastRemindTime", "INTEGER", true, 0, null, 1));
                map36.put("mStatus", new TableInfo.Column("mStatus", "INTEGER", true, 0, null, 1));
                map36.put("mCalendarEventId", new TableInfo.Column("mCalendarEventId", "INTEGER", true, 0, null, 1));
                map36.put("mIsSync", new TableInfo.Column("mIsSync", "INTEGER", true, 0, null, 1));
                map36.put("mIsDelete", new TableInfo.Column("mIsDelete", "INTEGER", true, 0, null, 1));
                map36.put("mDeviceFileId", new TableInfo.Column("mDeviceFileId", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo71 = new TableInfo("RecordSchedule", map36, new HashSet(0), new HashSet(0));
                TableInfo tableInfo72 = TableInfo.read(connection, "RecordSchedule");
                if (tableInfo71.equals(tableInfo72)) {
                    return new RoomOpenDelegate.ValidationResult(true, null);
                }
                return new RoomOpenDelegate.ValidationResult(false, "RecordSchedule(com.sma.smartv3.db.entity.RecordSchedule).\n Expected:\n" + tableInfo71 + "\n Found:\n" + tableInfo72);
            }
        };
    }
}
