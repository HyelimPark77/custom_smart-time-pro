.class public Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;
.super Lcom/jieli/jl_rcsp/model/device/health/HealthData;
.source "SourceFile"


# static fields
.field private static final DATA_INTERVAL:I = 0x1


# instance fields
.field private maxValue:I

.field private minValue:I

.field private percent:I

.field private singleTestValue:I


# direct methods
.method public constructor <init>(IB[B)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;-><init>(IB[BI)V

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->parseOxygenSaturationData(IB[B)V

    return-void
.end method

.method private getValueFromData(I[B)I
    .locals 2

    if-eqz p2, :cond_1

    add-int/lit8 v0, p1, 0x1

    array-length v1, p2

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-byte p1, p2, p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private parseOxygenSaturationData(IB[B)V
    .locals 3

    if-nez p1, :cond_6

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_5

    aget-byte v1, p1, p2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    if-eqz p2, :cond_3

    if-eq p2, v2, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->singleTestValue:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->minValue:I

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->maxValue:I

    goto :goto_1

    :cond_3
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->percent:I

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "no support version : "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OxygenSaturation"

    const-string p3, "parseOxygenSaturationData"

    invoke-static {p2, p3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->maxValue:I

    return v0
.end method

.method public getMinValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->minValue:I

    return v0
.end method

.method public getPercent()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->percent:I

    return v0
.end method

.method public getSingleTestValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->singleTestValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OxygenSaturation{percent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->percent:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->maxValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->minValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", singleTestValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;->singleTestValue:I

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
