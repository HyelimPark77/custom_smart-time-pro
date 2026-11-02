.class public Lcom/jieli/jl_rcsp/model/device/health/Altitude;
.super Lcom/jieli/jl_rcsp/model/device/health/HealthData;
.source "SourceFile"


# static fields
.field private static final DATA_INTERVAL:I = 0x4


# instance fields
.field private maxValue:I

.field private minValue:I

.field private realTimeValue:I


# direct methods
.method public constructor <init>(IB[B)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2, p3, p1}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;-><init>(IB[BI)V

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->parseAltitudeData(IB[B)V

    return-void
.end method

.method private getValueFromData(I[B)I
    .locals 2

    if-eqz p2, :cond_1

    add-int/lit8 v0, p1, 0x4

    array-length v1, p2

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private parseAltitudeData(IB[B)V
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

    if-eq p2, v2, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->maxValue:I

    :goto_1
    add-int/lit8 v0, v0, 0x4

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->minValue:I

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0, p3}, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->getValueFromData(I[B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->realTimeValue:I

    goto :goto_1

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

    const-string p2, "Altitude"

    const-string p3, "parseAltitudeData"

    invoke-static {p2, p3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->maxValue:I

    return v0
.end method

.method public getMinValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->minValue:I

    return v0
.end method

.method public getRealTimeValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->realTimeValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Altitude{realTimeValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->realTimeValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->minValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/Altitude;->maxValue:I

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
