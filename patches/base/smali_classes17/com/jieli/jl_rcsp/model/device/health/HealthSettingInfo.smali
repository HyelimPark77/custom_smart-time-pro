.class public Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

.field private bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

.field private disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

.field private emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

.field private exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

.field private fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

.field private funcFlag:I

.field private heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

.field private liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

.field private sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

.field private sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

.field private sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

.field private userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->funcFlag:I

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-direct {v2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;-><init>(I)V

    iput-object v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    return-void
.end method


# virtual methods
.method public cloneObject()Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;-><init>()V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->funcFlag:I

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setFuncFlag(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSensorInfo(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSedentaryReminder(Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setHeartRateMeasure(Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setExerciseHeartRateReminder(Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setAutomaticPressureDetection(Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSleepDetection(Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setFallDetection(Lcom/jieli/jl_rcsp/model/device/health/FallDetection;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setLiftWristDetection(Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setUserInfo(Lcom/jieli/jl_rcsp/model/device/health/UserInfo;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setDisconnectReminder(Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setBloodOxygenMeasurementAlert(Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setEmergencyContact(Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;)V

    return-object v0
.end method

.method public getAutomaticPressureDetection()Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    return-object v0
.end method

.method public getBloodOxygenMeasurementAlert()Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    return-object v0
.end method

.method public getDisconnectReminder()Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    return-object v0
.end method

.method public getEmergencyContact()Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    return-object v0
.end method

.method public getExerciseHeartRateReminder()Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    return-object v0
.end method

.method public getFallDetection()Lcom/jieli/jl_rcsp/model/device/health/FallDetection;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    return-object v0
.end method

.method public getFuncFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->funcFlag:I

    return v0
.end method

.method public getHeartRateMeasure()Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    return-object v0
.end method

.method public getLiftWristDetection()Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    return-object v0
.end method

.method public getSedentaryReminder()Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    return-object v0
.end method

.method public getSensorInfo()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    return-object v0
.end method

.method public getSleepDetection()Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    return-object v0
.end method

.method public getUserInfo()Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    return-object v0
.end method

.method public setAutomaticPressureDetection(Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    return-void
.end method

.method public setBloodOxygenMeasurementAlert(Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    return-void
.end method

.method public setDisconnectReminder(Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    return-void
.end method

.method public setEmergencyContact(Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    return-void
.end method

.method public setExerciseHeartRateReminder(Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    return-void
.end method

.method public setFallDetection(Lcom/jieli/jl_rcsp/model/device/health/FallDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    return-void
.end method

.method public setFuncFlag(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->funcFlag:I

    return-void
.end method

.method public setHeartRateMeasure(Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    return-void
.end method

.method public setLiftWristDetection(Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    return-void
.end method

.method public setSedentaryReminder(Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    return-void
.end method

.method public setSensorInfo(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    return-void
.end method

.method public setSleepDetection(Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    return-void
.end method

.method public setUserInfo(Lcom/jieli/jl_rcsp/model/device/health/UserInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthSettingInfo{funcFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->funcFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sensorInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sensorInfo:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sedentaryReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sedentaryReminder:Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateMeasure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->heartRateMeasure:Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exerciseHeartRateReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->exerciseHeartRateReminder:Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", automaticPressureDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->automaticPressureDetection:Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->sleepDetection:Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fallDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->fallDetection:Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", liftWristDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->liftWristDetection:Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->userInfo:Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->disconnectReminder:Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bloodOxygenMeasurementAlert="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->bloodOxygenMeasurementAlert:Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emergencyContact="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->emergencyContact:Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
