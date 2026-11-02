.class public Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private calorie:I

.field private distance:F

.field private duration:I

.field private exerciseStatus:I

.field private heartRate:I

.field private pace:F

.field private speed:F

.field private step:I

.field private stepFreq:I

.field private stride:I

.field private version:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCalorie()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->calorie:I

    return v0
.end method

.method public getDistance()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->distance:F

    return v0
.end method

.method public getDuration()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->duration:I

    return v0
.end method

.method public getExerciseStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->exerciseStatus:I

    return v0
.end method

.method public getHeartRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->heartRate:I

    return v0
.end method

.method public getPace()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->pace:F

    return v0
.end method

.method public getSpeed()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->speed:F

    return v0
.end method

.method public getStep()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->step:I

    return v0
.end method

.method public getStepFreq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stepFreq:I

    return v0
.end method

.method public getStride()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stride:I

    return v0
.end method

.method public getVersion()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->version:B

    return v0
.end method

.method public setCalorie(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->calorie:I

    return-object p0
.end method

.method public setDistance(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->distance:F

    return-object p0
.end method

.method public setDuration(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->duration:I

    return-object p0
.end method

.method public setExerciseStatus(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->exerciseStatus:I

    return-object p0
.end method

.method public setHeartRate(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->heartRate:I

    return-object p0
.end method

.method public setPace(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->pace:F

    return-object p0
.end method

.method public setSpeed(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->speed:F

    return-object p0
.end method

.method public setStep(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->step:I

    return-object p0
.end method

.method public setStepFreq(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stepFreq:I

    return-object p0
.end method

.method public setStride(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stride:I

    return-object p0
.end method

.method public setVersion(B)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->version:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RealTimeSportsData{version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->version:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", step="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->step:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->distance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->duration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->speed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", pace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->pace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", calorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->calorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stepFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stepFreq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->stride:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", exerciseStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->exerciseStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->heartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
