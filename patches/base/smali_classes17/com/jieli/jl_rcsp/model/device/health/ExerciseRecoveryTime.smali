.class public Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;
.super Lcom/jieli/jl_rcsp/model/device/health/HealthData;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private hour:I

.field private min:I


# direct methods
.method public constructor <init>(IB[B)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;-><init>(IB[BI)V

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->parseExerciseRecoveryTimeData(IB[B)V

    return-void
.end method

.method private parseExerciseRecoveryTimeData(IB[B)V
    .locals 3

    if-nez p1, :cond_3

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_2

    aget-byte v1, p1, p2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    aget-byte v1, p3, v0

    and-int/lit8 v2, v1, 0x3

    mul-int/lit8 v2, v2, 0xf

    iput v2, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->min:I

    shr-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->hour:I

    add-int/lit8 v0, v0, 0x1

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "no support version : "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExerciseRecoveryTime"

    const-string p3, "parseExerciseRecoveryTimeData"

    invoke-static {p2, p3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getHour()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->hour:I

    return v0
.end method

.method public getMin()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->min:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExerciseRecoveryTime{hour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->hour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", min="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;->min:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
