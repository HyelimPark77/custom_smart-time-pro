.class public abstract Lcom/sma/smartv3/db/AppDatabase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Database;
    entities = {
        Lcom/sma/smartv3/db/entity/Activity;,
        Lcom/sma/smartv3/db/entity/AIRecords;,
        Lcom/sma/smartv3/db/entity/HeartRate;,
        Lcom/sma/smartv3/db/entity/BloodPressure;,
        Lcom/sma/smartv3/db/entity/Sleep;,
        Lcom/sma/smartv3/db/entity/Workout;,
        Lcom/sma/smartv3/db/entity/Location;,
        Lcom/sma/smartv3/db/entity/Weight;,
        Lcom/sma/smartv3/db/entity/Temperature;,
        Lcom/sma/smartv3/db/entity/Schedule;,
        Lcom/sma/smartv3/db/entity/WorkoutIndex;,
        Lcom/sma/smartv3/db/entity/BloodOxygen;,
        Lcom/sma/smartv3/db/entity/Hrv;,
        Lcom/sma/smartv3/db/entity/Pressure;,
        Lcom/sma/smartv3/db/entity/MatchLog;,
        Lcom/sma/smartv3/db/entity/MatchPeriod;,
        Lcom/sma/smartv3/db/entity/MatchRecord;,
        Lcom/sma/smartv3/db/entity/SportData;,
        Lcom/sma/smartv3/db/entity/BloodGlucose;,
        Lcom/sma/smartv3/db/entity/AlipayBindInfo;,
        Lcom/sma/smartv3/db/entity/Electrocardiogram;,
        Lcom/sma/smartv3/db/entity/BloodGlucose2;,
        Lcom/sma/smartv3/db/entity/HanBaoVibration;,
        Lcom/sma/smartv3/db/entity/HealthyReport;,
        Lcom/sma/smartv3/db/entity/DailyPower;,
        Lcom/sma/smartv3/db/entity/TranslateEntity;,
        Lcom/sma/smartv3/db/entity/TranslateSessionEntity;,
        Lcom/sma/smartv3/db/entity/Vitality;,
        Lcom/sma/smartv3/db/entity/RespiratoryRate;,
        Lcom/sma/smartv3/db/entity/PhysicalPower;,
        Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;,
        Lcom/sma/smartv3/db/entity/EnergyRating;,
        Lcom/sma/smartv3/db/entity/RecordDeviceFile;,
        Lcom/sma/smartv3/db/entity/RecordDeviceInfo;,
        Lcom/sma/smartv3/db/entity/RecordDeviceManage;,
        Lcom/sma/smartv3/db/entity/RecordSchedule;
    }
    version = 0x38
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract alipayBindInfoDao()Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract bloodOxygenDao()Lcom/sma/smartv3/db/dao/BloodOxygenDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract chatVoiceThirdParty()Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract dailyPowerDao()Lcom/sma/smartv3/db/dao/DailyPowerDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract deviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract electrocardiogramDao()Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract energyRating()Lcom/sma/smartv3/db/dao/EnergyRatingDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract hanBaoVibrationDao()Lcom/sma/smartv3/db/dao/HanBaoVibrationDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract healthyReportDao()Lcom/sma/smartv3/db/dao/HealthyReportDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract hrvDao()Lcom/sma/smartv3/db/dao/HrvDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract locationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract matchRecordDao()Lcom/sma/smartv3/db/dao/MatchRecordDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract physicalPowerDao()Lcom/sma/smartv3/db/dao/PhysicalPowerDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract recordDeviceFileDao()Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract recordDeviceFileManageDao()Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract recordScheduleDao()Lcom/sma/smartv3/db/dao/RecordScheduleDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract respiratoryRateDao()Lcom/sma/smartv3/db/dao/RespiratoryRateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract scheduleDao()Lcom/sma/smartv3/db/dao/ScheduleDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract sportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract translateDao()Lcom/sma/smartv3/db/dao/TranslateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract translateSessionDao()Lcom/sma/smartv3/db/dao/TranslateSessionDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract vitalityDao()Lcom/sma/smartv3/db/dao/VitalityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract weightDao()Lcom/sma/smartv3/db/dao/WeightDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract workoutIndexDao()Lcom/sma/smartv3/db/dao/WorkoutIndexDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method
