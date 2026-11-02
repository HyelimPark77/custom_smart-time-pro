package com.sma.smartv3.db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.RoomOpenDelegateMarker;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.SQLiteConnection;
import com.facebook.appevents.AppEventsConstants;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.dao.AIRecordsDao_Impl;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.ActivityDao_Impl;
import com.sma.smartv3.db.dao.AlipayBindInfoDao;
import com.sma.smartv3.db.dao.AlipayBindInfoDao_Impl;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.dao.BloodGlucose2Dao_Impl;
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.dao.BloodGlucoseDao_Impl;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodOxygenDao_Impl;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.BloodPressureDao_Impl;
import com.sma.smartv3.db.dao.ChatVoiceMsgDao;
import com.sma.smartv3.db.dao.ChatVoiceMsgDao_Impl;
import com.sma.smartv3.db.dao.DailyPowerDao;
import com.sma.smartv3.db.dao.DailyPowerDao_Impl;
import com.sma.smartv3.db.dao.DeviceInfoDao;
import com.sma.smartv3.db.dao.DeviceInfoDao_Impl;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.dao.ElectrocardiogramDao_Impl;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.dao.EnergyRatingDao_Impl;
import com.sma.smartv3.db.dao.HanBaoVibrationDao;
import com.sma.smartv3.db.dao.HanBaoVibrationDao_Impl;
import com.sma.smartv3.db.dao.HealthyReportDao;
import com.sma.smartv3.db.dao.HealthyReportDao_Impl;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.HeartRateDao_Impl;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.dao.HrvDao_Impl;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.LocationDao_Impl;
import com.sma.smartv3.db.dao.MatchRecordDao;
import com.sma.smartv3.db.dao.MatchRecordDao_Impl;
import com.sma.smartv3.db.dao.PhysicalPowerDao;
import com.sma.smartv3.db.dao.PhysicalPowerDao_Impl;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.PressureDao_Impl;
import com.sma.smartv3.db.dao.RecordDeviceFileDao;
import com.sma.smartv3.db.dao.RecordDeviceFileDao_Impl;
import com.sma.smartv3.db.dao.RecordDeviceFileManageDao;
import com.sma.smartv3.db.dao.RecordDeviceFileManageDao_Impl;
import com.sma.smartv3.db.dao.RecordScheduleDao;
import com.sma.smartv3.db.dao.RecordScheduleDao_Impl;
import com.sma.smartv3.db.dao.RespiratoryRateDao;
import com.sma.smartv3.db.dao.RespiratoryRateDao_Impl;
import com.sma.smartv3.db.dao.ScheduleDao;
import com.sma.smartv3.db.dao.ScheduleDao_Impl;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.dao.SleepDao_Impl;
import com.sma.smartv3.db.dao.SportDataDao;
import com.sma.smartv3.db.dao.SportDataDao_Impl;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.dao.TemperatureDao_Impl;
import com.sma.smartv3.db.dao.TranslateDao;
import com.sma.smartv3.db.dao.TranslateDao_Impl;
import com.sma.smartv3.db.dao.TranslateSessionDao;
import com.sma.smartv3.db.dao.TranslateSessionDao_Impl;
import com.sma.smartv3.db.dao.VitalityDao;
import com.sma.smartv3.db.dao.VitalityDao_Impl;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.dao.WeightDao_Impl;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.dao.WorkoutDao_Impl;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.dao.WorkoutIndexDao_Impl;
import java.util.ArrayList;
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

    public AppDatabase_Impl() {
    }

    public static /* synthetic */ void access$000(AppDatabase_Impl r0, SQLiteConnection r1) {
        r0.internalInitInvalidationTracker(r1);
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public ActivityDao activityDao() {
        if (this._activityDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._activityDao != null) goto L12;
        this._activityDao = new ActivityDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        ActivityDao r0 = this._activityDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._activityDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public AIRecordsDao aiRecordsDao() {
        if (this._aIRecordsDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._aIRecordsDao != null) goto L12;
        this._aIRecordsDao = new AIRecordsDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        AIRecordsDao r0 = this._aIRecordsDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._aIRecordsDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public AlipayBindInfoDao alipayBindInfoDao() {
        if (this._alipayBindInfoDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._alipayBindInfoDao != null) goto L12;
        this._alipayBindInfoDao = new AlipayBindInfoDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        AlipayBindInfoDao r0 = this._alipayBindInfoDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._alipayBindInfoDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public BloodGlucose2Dao bloodGlucose2Dao() {
        if (this._bloodGlucose2Dao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._bloodGlucose2Dao != null) goto L12;
        this._bloodGlucose2Dao = new BloodGlucose2Dao_Impl(this);     // Catch: Throwable -> L10
    L12:
        BloodGlucose2Dao r0 = this._bloodGlucose2Dao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._bloodGlucose2Dao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public BloodGlucoseDao bloodGlucoseDao() {
        if (this._bloodGlucoseDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._bloodGlucoseDao != null) goto L12;
        this._bloodGlucoseDao = new BloodGlucoseDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        BloodGlucoseDao r0 = this._bloodGlucoseDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._bloodGlucoseDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public BloodOxygenDao bloodOxygenDao() {
        if (this._bloodOxygenDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._bloodOxygenDao != null) goto L12;
        this._bloodOxygenDao = new BloodOxygenDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        BloodOxygenDao r0 = this._bloodOxygenDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._bloodOxygenDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public BloodPressureDao bloodPressureDao() {
        if (this._bloodPressureDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._bloodPressureDao != null) goto L12;
        this._bloodPressureDao = new BloodPressureDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        BloodPressureDao r0 = this._bloodPressureDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._bloodPressureDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public ChatVoiceMsgDao chatVoiceThirdParty() {
        if (this._chatVoiceMsgDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._chatVoiceMsgDao != null) goto L12;
        this._chatVoiceMsgDao = new ChatVoiceMsgDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        ChatVoiceMsgDao r0 = this._chatVoiceMsgDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._chatVoiceMsgDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(true, new String[]{"Activity", "AIRecords", "HeartRate", "BloodPressure", "Sleep", "Workout", "Location", "Weight", "Temperature", AppEventsConstants.EVENT_NAME_SCHEDULE, "WorkoutIndex", "BloodOxygen", "Hrv", "Pressure", "MatchLog", "MatchPeriod", "MatchRecord", "SportData", "BloodGlucose", "AlipayBindInfo", "Electrocardiogram", "BloodGlucose2", "HanBaoVibration", "HealthyReport", "DailyPower", "TranslateEntity", "TranslateSessionEntity", "Vitality", "RespiratoryRate", "PhysicalPower", "ChatVoiceAssistantMessage", "EnergyRating", "RecordDeviceFile", "RecordDeviceInfo", "RecordDeviceManage", "RecordSchedule"});
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"Activity", "AIRecords", "HeartRate", "BloodPressure", "Sleep", "Workout", "Location", "Weight", "Temperature", AppEventsConstants.EVENT_NAME_SCHEDULE, "WorkoutIndex", "BloodOxygen", "Hrv", "Pressure", "MatchLog", "MatchPeriod", "MatchRecord", "SportData", "BloodGlucose", "AlipayBindInfo", "Electrocardiogram", "BloodGlucose2", "HanBaoVibration", "HealthyReport", "DailyPower", "TranslateEntity", "TranslateSessionEntity", "Vitality", "RespiratoryRate", "PhysicalPower", "ChatVoiceAssistantMessage", "EnergyRating", "RecordDeviceFile", "RecordDeviceInfo", "RecordDeviceManage", "RecordSchedule"});
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public /* bridge */ /* synthetic */ RoomOpenDelegateMarker createOpenDelegate() {
        return createOpenDelegate();
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public DailyPowerDao dailyPowerDao() {
        if (this._dailyPowerDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._dailyPowerDao != null) goto L12;
        this._dailyPowerDao = new DailyPowerDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        DailyPowerDao r0 = this._dailyPowerDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._dailyPowerDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public DeviceInfoDao deviceInfoDao() {
        if (this._deviceInfoDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._deviceInfoDao != null) goto L12;
        this._deviceInfoDao = new DeviceInfoDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        DeviceInfoDao r0 = this._deviceInfoDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._deviceInfoDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public ElectrocardiogramDao electrocardiogramDao() {
        if (this._electrocardiogramDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._electrocardiogramDao != null) goto L12;
        this._electrocardiogramDao = new ElectrocardiogramDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        ElectrocardiogramDao r0 = this._electrocardiogramDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._electrocardiogramDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public EnergyRatingDao energyRating() {
        if (this._energyRatingDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._energyRatingDao != null) goto L12;
        this._energyRatingDao = new EnergyRatingDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        EnergyRatingDao r0 = this._energyRatingDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._energyRatingDao;
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
        HashMap r0 = new HashMap();
        r0.put(ActivityDao.class, ActivityDao_Impl.getRequiredConverters());
        r0.put(AIRecordsDao.class, AIRecordsDao_Impl.getRequiredConverters());
        r0.put(HeartRateDao.class, HeartRateDao_Impl.getRequiredConverters());
        r0.put(BloodPressureDao.class, BloodPressureDao_Impl.getRequiredConverters());
        r0.put(SleepDao.class, SleepDao_Impl.getRequiredConverters());
        r0.put(WorkoutDao.class, WorkoutDao_Impl.getRequiredConverters());
        r0.put(LocationDao.class, LocationDao_Impl.getRequiredConverters());
        r0.put(WeightDao.class, WeightDao_Impl.getRequiredConverters());
        r0.put(TemperatureDao.class, TemperatureDao_Impl.getRequiredConverters());
        r0.put(ScheduleDao.class, ScheduleDao_Impl.getRequiredConverters());
        r0.put(WorkoutIndexDao.class, WorkoutIndexDao_Impl.getRequiredConverters());
        r0.put(BloodOxygenDao.class, BloodOxygenDao_Impl.getRequiredConverters());
        r0.put(HrvDao.class, HrvDao_Impl.getRequiredConverters());
        r0.put(PressureDao.class, PressureDao_Impl.getRequiredConverters());
        r0.put(MatchRecordDao.class, MatchRecordDao_Impl.getRequiredConverters());
        r0.put(SportDataDao.class, SportDataDao_Impl.getRequiredConverters());
        r0.put(BloodGlucoseDao.class, BloodGlucoseDao_Impl.getRequiredConverters());
        r0.put(AlipayBindInfoDao.class, AlipayBindInfoDao_Impl.getRequiredConverters());
        r0.put(ElectrocardiogramDao.class, ElectrocardiogramDao_Impl.getRequiredConverters());
        r0.put(BloodGlucose2Dao.class, BloodGlucose2Dao_Impl.getRequiredConverters());
        r0.put(HanBaoVibrationDao.class, HanBaoVibrationDao_Impl.getRequiredConverters());
        r0.put(HealthyReportDao.class, HealthyReportDao_Impl.getRequiredConverters());
        r0.put(DailyPowerDao.class, DailyPowerDao_Impl.getRequiredConverters());
        r0.put(TranslateDao.class, TranslateDao_Impl.getRequiredConverters());
        r0.put(TranslateSessionDao.class, TranslateSessionDao_Impl.getRequiredConverters());
        r0.put(RespiratoryRateDao.class, RespiratoryRateDao_Impl.getRequiredConverters());
        r0.put(VitalityDao.class, VitalityDao_Impl.getRequiredConverters());
        r0.put(PhysicalPowerDao.class, PhysicalPowerDao_Impl.getRequiredConverters());
        r0.put(ChatVoiceMsgDao.class, ChatVoiceMsgDao_Impl.getRequiredConverters());
        r0.put(RecordDeviceFileDao.class, RecordDeviceFileDao_Impl.getRequiredConverters());
        r0.put(DeviceInfoDao.class, DeviceInfoDao_Impl.getRequiredConverters());
        r0.put(EnergyRatingDao.class, EnergyRatingDao_Impl.getRequiredConverters());
        r0.put(RecordDeviceFileManageDao.class, RecordDeviceFileManageDao_Impl.getRequiredConverters());
        r0.put(RecordScheduleDao.class, RecordScheduleDao_Impl.getRequiredConverters());
        return r0;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public HanBaoVibrationDao hanBaoVibrationDao() {
        if (this._hanBaoVibrationDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._hanBaoVibrationDao != null) goto L12;
        this._hanBaoVibrationDao = new HanBaoVibrationDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        HanBaoVibrationDao r0 = this._hanBaoVibrationDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._hanBaoVibrationDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public HealthyReportDao healthyReportDao() {
        if (this._healthyReportDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._healthyReportDao != null) goto L12;
        this._healthyReportDao = new HealthyReportDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        HealthyReportDao r0 = this._healthyReportDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._healthyReportDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public HeartRateDao heartRateDao() {
        if (this._heartRateDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._heartRateDao != null) goto L12;
        this._heartRateDao = new HeartRateDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        HeartRateDao r0 = this._heartRateDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._heartRateDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public HrvDao hrvDao() {
        if (this._hrvDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._hrvDao != null) goto L12;
        this._hrvDao = new HrvDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        HrvDao r0 = this._hrvDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._hrvDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public LocationDao locationDao() {
        if (this._locationDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._locationDao != null) goto L12;
        this._locationDao = new LocationDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        LocationDao r0 = this._locationDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._locationDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public MatchRecordDao matchRecordDao() {
        if (this._matchRecordDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._matchRecordDao != null) goto L12;
        this._matchRecordDao = new MatchRecordDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        MatchRecordDao r0 = this._matchRecordDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._matchRecordDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public PhysicalPowerDao physicalPowerDao() {
        if (this._physicalPowerDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._physicalPowerDao != null) goto L12;
        this._physicalPowerDao = new PhysicalPowerDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        PhysicalPowerDao r0 = this._physicalPowerDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._physicalPowerDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public PressureDao pressureDao() {
        if (this._pressureDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._pressureDao != null) goto L12;
        this._pressureDao = new PressureDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        PressureDao r0 = this._pressureDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._pressureDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public RecordDeviceFileDao recordDeviceFileDao() {
        if (this._recordDeviceFileDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._recordDeviceFileDao != null) goto L12;
        this._recordDeviceFileDao = new RecordDeviceFileDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        RecordDeviceFileDao r0 = this._recordDeviceFileDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._recordDeviceFileDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public RecordDeviceFileManageDao recordDeviceFileManageDao() {
        if (this._recordDeviceFileManageDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._recordDeviceFileManageDao != null) goto L12;
        this._recordDeviceFileManageDao = new RecordDeviceFileManageDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        RecordDeviceFileManageDao r0 = this._recordDeviceFileManageDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._recordDeviceFileManageDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public RecordScheduleDao recordScheduleDao() {
        if (this._recordScheduleDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._recordScheduleDao != null) goto L12;
        this._recordScheduleDao = new RecordScheduleDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        RecordScheduleDao r0 = this._recordScheduleDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._recordScheduleDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public RespiratoryRateDao respiratoryRateDao() {
        if (this._respiratoryRateDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._respiratoryRateDao != null) goto L12;
        this._respiratoryRateDao = new RespiratoryRateDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        RespiratoryRateDao r0 = this._respiratoryRateDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._respiratoryRateDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public ScheduleDao scheduleDao() {
        if (this._scheduleDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._scheduleDao != null) goto L12;
        this._scheduleDao = new ScheduleDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        ScheduleDao r0 = this._scheduleDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._scheduleDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public SleepDao sleepDao() {
        if (this._sleepDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._sleepDao != null) goto L12;
        this._sleepDao = new SleepDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        SleepDao r0 = this._sleepDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._sleepDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public SportDataDao sportDataDao() {
        if (this._sportDataDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._sportDataDao != null) goto L12;
        this._sportDataDao = new SportDataDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        SportDataDao r0 = this._sportDataDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._sportDataDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public TemperatureDao temperatureDao() {
        if (this._temperatureDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._temperatureDao != null) goto L12;
        this._temperatureDao = new TemperatureDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        TemperatureDao r0 = this._temperatureDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._temperatureDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public TranslateDao translateDao() {
        if (this._translateDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._translateDao != null) goto L12;
        this._translateDao = new TranslateDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        TranslateDao r0 = this._translateDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._translateDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public TranslateSessionDao translateSessionDao() {
        if (this._translateSessionDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._translateSessionDao != null) goto L12;
        this._translateSessionDao = new TranslateSessionDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        TranslateSessionDao r0 = this._translateSessionDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._translateSessionDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public VitalityDao vitalityDao() {
        if (this._vitalityDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._vitalityDao != null) goto L12;
        this._vitalityDao = new VitalityDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        VitalityDao r0 = this._vitalityDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._vitalityDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public WeightDao weightDao() {
        if (this._weightDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._weightDao != null) goto L12;
        this._weightDao = new WeightDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        WeightDao r0 = this._weightDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._weightDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public WorkoutDao workoutDao() {
        if (this._workoutDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._workoutDao != null) goto L12;
        this._workoutDao = new WorkoutDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        WorkoutDao r0 = this._workoutDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._workoutDao;
    }

    @Override // com.sma.smartv3.db.AppDatabase
    public WorkoutIndexDao workoutIndexDao() {
        if (this._workoutIndexDao != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this._workoutIndexDao != null) goto L12;
        this._workoutIndexDao = new WorkoutIndexDao_Impl(this);     // Catch: Throwable -> L10
    L12:
        WorkoutIndexDao r0 = this._workoutIndexDao;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this._workoutIndexDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        final String r1 = "ad6892ca11300256999ed39d57027c89";
        final String r2 = "851186f0200bd10550e46b7aa4d7d782";
        final int r3 = 56;
        return new AnonymousClass1(this, r3, r1, r2);
    }
}
