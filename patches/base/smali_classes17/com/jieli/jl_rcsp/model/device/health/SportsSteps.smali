.class public Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;
.super Lcom/jieli/jl_rcsp/model/device/health/HealthData;
.source "SourceFile"


# instance fields
.field private calorie:I

.field private distance:I

.field private stepNum:I


# direct methods
.method public constructor <init>(IB[B)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;-><init>(IB[BI)V

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->parseSportsStepsData(IB[B)V

    return-void
.end method

.method private getValueFromData(II[B)I
    .locals 2

    if-eqz p3, :cond_1

    add-int v0, p1, p2

    array-length v1, p3

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3, p1, p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private parseSportsStepsData(IB[B)V
    .locals 3

    if-nez p1, :cond_5

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_4

    aget-byte v1, p1, p2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    if-eqz p2, :cond_2

    const/4 v1, 0x2

    if-eq p2, v2, :cond_1

    if-eq p2, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, v0, v1, p3}, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->getValueFromData(II[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->calorie:I

    :goto_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0, v1, p3}, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->getValueFromData(II[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->distance:I

    goto :goto_1

    :cond_2
    const/4 v1, 0x4

    invoke-direct {p0, v0, v1, p3}, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->getValueFromData(II[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->stepNum:I

    add-int/lit8 v0, v0, 0x4

    :cond_3
    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "no support version : "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SportsSteps"

    const-string p3, "parseSportsStepsData"

    invoke-static {p2, p3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCalorie()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->calorie:I

    return v0
.end method

.method public getDistance()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->distance:I

    return v0
.end method

.method public getStepNum()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->stepNum:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportsSteps{stepNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->stepNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->distance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", calorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;->calorie:I

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
