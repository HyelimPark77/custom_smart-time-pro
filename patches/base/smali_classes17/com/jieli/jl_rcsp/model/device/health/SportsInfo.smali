.class public Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private endTime:I

.field private exerciseIntensityState:[I

.field private heartRateMode:I

.field private id:I

.field private isNeedAppGPS:Z

.field private mode:I

.field private readRealTimeDataInterval:I

.field private recordFileId:S

.field private recordFileSize:I

.field private recoveryTime:I

.field private state:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->state:I

    return-void
.end method

.method public constructor <init>(IIIZII)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->state:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setId(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 6
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 7
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 8
    invoke-virtual {p0, p4}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setNeedAppGPS(Z)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 9
    invoke-virtual {p0, p5}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setHeartRateMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 10
    invoke-virtual {p0, p6}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setReadRealTimeDataInterval(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    return-void
.end method


# virtual methods
.method public getEndTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->endTime:I

    return v0
.end method

.method public getExerciseIntensityState()[I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->exerciseIntensityState:[I

    return-object v0
.end method

.method public getHeartRateMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->heartRateMode:I

    return v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->id:I

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->mode:I

    return v0
.end method

.method public getReadRealTimeDataInterval()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->readRealTimeDataInterval:I

    return v0
.end method

.method public getRecordFileId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileId:S

    return v0
.end method

.method public getRecordFileSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileSize:I

    return v0
.end method

.method public getRecoveryTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recoveryTime:I

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->state:I

    return v0
.end method

.method public isNeedAppGPS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->isNeedAppGPS:Z

    return v0
.end method

.method public setEndTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->endTime:I

    return-object p0
.end method

.method public setExerciseIntensityState([I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->exerciseIntensityState:[I

    return-object p0
.end method

.method public setHeartRateMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->heartRateMode:I

    return-object p0
.end method

.method public setId(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->id:I

    return-object p0
.end method

.method public setMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->mode:I

    return-object p0
.end method

.method public setNeedAppGPS(Z)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->isNeedAppGPS:Z

    return-object p0
.end method

.method public setReadRealTimeDataInterval(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->readRealTimeDataInterval:I

    return-object p0
.end method

.method public setRecordFileId(S)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileId:S

    return-object p0
.end method

.method public setRecordFileSize(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileSize:I

    return-object p0
.end method

.method public setRecoveryTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recoveryTime:I

    return-object p0
.end method

.method public setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->state:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportsInfo{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isNeedAppGPS="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->isNeedAppGPS:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->heartRateMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", readRealTimeDataInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->readRealTimeDataInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->endTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recoveryTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recordFileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileId:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recordFileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->recordFileSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", exerciseIntensityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->exerciseIntensityState:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
