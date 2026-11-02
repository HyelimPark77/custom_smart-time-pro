.class public final Lcom/sma/smartv3/db/AppDatabase_Impl;
.super Lcom/sma/smartv3/db/AppDatabase;
.source "SourceFile"


# instance fields
.field private volatile _aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

.field private volatile _activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

.field private volatile _alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

.field private volatile _bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

.field private volatile _bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

.field private volatile _bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

.field private volatile _bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

.field private volatile _chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

.field private volatile _dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

.field private volatile _deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

.field private volatile _electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

.field private volatile _energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

.field private volatile _hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

.field private volatile _healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

.field private volatile _heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

.field private volatile _hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

.field private volatile _locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

.field private volatile _matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

.field private volatile _physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

.field private volatile _pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

.field private volatile _recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

.field private volatile _recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

.field private volatile _recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

.field private volatile _respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

.field private volatile _scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

.field private volatile _sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

.field private volatile _sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

.field private volatile _temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

.field private volatile _translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

.field private volatile _translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

.field private volatile _vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

.field private volatile _weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

.field private volatile _workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

.field private volatile _workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/db/AppDatabase;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Lcom/sma/smartv3/db/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/RoomDatabase;->internalInitInvalidationTracker(Landroidx/sqlite/SQLiteConnection;)V

    return-void
.end method


# virtual methods
.method public activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/ActivityDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/ActivityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_activityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/AIRecordsDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/AIRecordsDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_aIRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public alipayBindInfoDao()Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/AlipayBindInfoDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/AlipayBindInfoDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_alipayBindInfoDao:Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/BloodGlucoseDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bloodOxygenDao()Lcom/sma/smartv3/db/dao/BloodOxygenDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/BloodOxygenDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/BloodOxygenDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_bloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public chatVoiceThirdParty()Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_chatVoiceMsgDao:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public clearAllTables()V
    .locals 37

    const-string v35, "RecordDeviceManage"

    const-string v36, "RecordSchedule"

    const-string v1, "Activity"

    const-string v2, "AIRecords"

    const-string v3, "HeartRate"

    const-string v4, "BloodPressure"

    const-string v5, "Sleep"

    const-string v6, "Workout"

    const-string v7, "Location"

    const-string v8, "Weight"

    const-string v9, "Temperature"

    const-string v10, "Schedule"

    const-string v11, "WorkoutIndex"

    const-string v12, "BloodOxygen"

    const-string v13, "Hrv"

    const-string v14, "Pressure"

    const-string v15, "MatchLog"

    const-string v16, "MatchPeriod"

    const-string v17, "MatchRecord"

    const-string v18, "SportData"

    const-string v19, "BloodGlucose"

    const-string v20, "AlipayBindInfo"

    const-string v21, "Electrocardiogram"

    const-string v22, "BloodGlucose2"

    const-string v23, "HanBaoVibration"

    const-string v24, "HealthyReport"

    const-string v25, "DailyPower"

    const-string v26, "TranslateEntity"

    const-string v27, "TranslateSessionEntity"

    const-string v28, "Vitality"

    const-string v29, "RespiratoryRate"

    const-string v30, "PhysicalPower"

    const-string v31, "ChatVoiceAssistantMessage"

    const-string v32, "EnergyRating"

    const-string v33, "RecordDeviceFile"

    const-string v34, "RecordDeviceInfo"

    filled-new-array/range {v1 .. v36}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    move-object/from16 v2, p0

    invoke-super {v2, v1, v0}, Landroidx/room/RoomDatabase;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public createInvalidationTracker()Landroidx/room/InvalidationTracker;
    .locals 39
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/InvalidationTracker;

    const-string v37, "RecordDeviceManage"

    const-string v38, "RecordSchedule"

    const-string v3, "Activity"

    const-string v4, "AIRecords"

    const-string v5, "HeartRate"

    const-string v6, "BloodPressure"

    const-string v7, "Sleep"

    const-string v8, "Workout"

    const-string v9, "Location"

    const-string v10, "Weight"

    const-string v11, "Temperature"

    const-string v12, "Schedule"

    const-string v13, "WorkoutIndex"

    const-string v14, "BloodOxygen"

    const-string v15, "Hrv"

    const-string v16, "Pressure"

    const-string v17, "MatchLog"

    const-string v18, "MatchPeriod"

    const-string v19, "MatchRecord"

    const-string v20, "SportData"

    const-string v21, "BloodGlucose"

    const-string v22, "AlipayBindInfo"

    const-string v23, "Electrocardiogram"

    const-string v24, "BloodGlucose2"

    const-string v25, "HanBaoVibration"

    const-string v26, "HealthyReport"

    const-string v27, "DailyPower"

    const-string v28, "TranslateEntity"

    const-string v29, "TranslateSessionEntity"

    const-string v30, "Vitality"

    const-string v31, "RespiratoryRate"

    const-string v32, "PhysicalPower"

    const-string v33, "ChatVoiceAssistantMessage"

    const-string v34, "EnergyRating"

    const-string v35, "RecordDeviceFile"

    const-string v36, "RecordDeviceInfo"

    filled-new-array/range {v3 .. v38}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v1, v4, v0, v2, v3}, Landroidx/room/InvalidationTracker;-><init>(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenDelegate()Landroidx/room/RoomOpenDelegate;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/sma/smartv3/db/AppDatabase_Impl$1;

    const-string v1, "ad6892ca11300256999ed39d57027c89"

    const-string v2, "851186f0200bd10550e46b7aa4d7d782"

    const/16 v3, 0x38

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/sma/smartv3/db/AppDatabase_Impl$1;-><init>(Lcom/sma/smartv3/db/AppDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/db/AppDatabase_Impl;->createOpenDelegate()Landroidx/room/RoomOpenDelegate;

    move-result-object v0

    return-object v0
.end method

.method public dailyPowerDao()Lcom/sma/smartv3/db/dao/DailyPowerDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/DailyPowerDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/DailyPowerDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_dailyPowerDao:Lcom/sma/smartv3/db/dao/DailyPowerDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public deviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_deviceInfoDao:Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public electrocardiogramDao()Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_electrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public energyRating()Lcom/sma/smartv3/db/dao/EnergyRatingDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/EnergyRatingDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/EnergyRatingDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_energyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "autoMigrationSpecs"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/room/migration/Migration;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getRequiredTypeConverters()Ljava/util/Map;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, Lcom/sma/smartv3/db/dao/ActivityDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/ActivityDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/AIRecordsDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/HeartRateDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/HeartRateDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/BloodPressureDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/SleepDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/SleepDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/WorkoutDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/LocationDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/LocationDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/WeightDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/TemperatureDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/TemperatureDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/ScheduleDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/ScheduleDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/WorkoutIndexDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/BloodOxygenDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/HrvDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/HrvDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/PressureDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/PressureDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/MatchRecordDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/SportDataDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/SportDataDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/AlipayBindInfoDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/HanBaoVibrationDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/HealthyReportDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/DailyPowerDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/DailyPowerDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/TranslateDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/RespiratoryRateDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/VitalityDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/VitalityDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/PhysicalPowerDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/EnergyRatingDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    invoke-static {}, Lcom/sma/smartv3/db/dao/RecordScheduleDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public hanBaoVibrationDao()Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/HanBaoVibrationDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/HanBaoVibrationDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hanBaoVibrationDao:Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public healthyReportDao()Lcom/sma/smartv3/db/dao/HealthyReportDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_healthyReportDao:Lcom/sma/smartv3/db/dao/HealthyReportDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/HeartRateDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/HeartRateDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_heartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public hrvDao()Lcom/sma/smartv3/db/dao/HrvDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/HrvDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/HrvDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_hrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public locationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/LocationDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/LocationDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_locationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public matchRecordDao()Lcom/sma/smartv3/db/dao/MatchRecordDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_matchRecordDao:Lcom/sma/smartv3/db/dao/MatchRecordDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public physicalPowerDao()Lcom/sma/smartv3/db/dao/PhysicalPowerDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/PhysicalPowerDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/PhysicalPowerDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_physicalPowerDao:Lcom/sma/smartv3/db/dao/PhysicalPowerDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/PressureDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/PressureDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_pressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public recordDeviceFileDao()Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public recordDeviceFileManageDao()Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordDeviceFileManageDao:Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public recordScheduleDao()Lcom/sma/smartv3/db/dao/RecordScheduleDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/RecordScheduleDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/RecordScheduleDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_recordScheduleDao:Lcom/sma/smartv3/db/dao/RecordScheduleDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public respiratoryRateDao()Lcom/sma/smartv3/db/dao/RespiratoryRateDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/RespiratoryRateDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/RespiratoryRateDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_respiratoryRateDao:Lcom/sma/smartv3/db/dao/RespiratoryRateDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public scheduleDao()Lcom/sma/smartv3/db/dao/ScheduleDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/ScheduleDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/ScheduleDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_scheduleDao:Lcom/sma/smartv3/db/dao/ScheduleDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/SleepDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/SleepDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public sportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/SportDataDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/SportDataDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_sportDataDao:Lcom/sma/smartv3/db/dao/SportDataDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/TemperatureDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/TemperatureDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_temperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public translateDao()Lcom/sma/smartv3/db/dao/TranslateDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/TranslateDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/TranslateDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateDao:Lcom/sma/smartv3/db/dao/TranslateDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public translateSessionDao()Lcom/sma/smartv3/db/dao/TranslateSessionDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_translateSessionDao:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public vitalityDao()Lcom/sma/smartv3/db/dao/VitalityDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/VitalityDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/VitalityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_vitalityDao:Lcom/sma/smartv3/db/dao/VitalityDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public weightDao()Lcom/sma/smartv3/db/dao/WeightDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_weightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutDao:Lcom/sma/smartv3/db/dao/WorkoutDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public workoutIndexDao()Lcom/sma/smartv3/db/dao/WorkoutIndexDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/db/dao/WorkoutIndexDao_Impl;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/db/dao/WorkoutIndexDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/AppDatabase_Impl;->_workoutIndexDao:Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
