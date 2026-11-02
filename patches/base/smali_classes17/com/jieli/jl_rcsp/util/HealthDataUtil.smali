.class public Lcom/jieli/jl_rcsp/util/HealthDataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseAirPressure(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v2, v0, 0xff

    const/16 v3, 0xff

    if-ne v2, v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    and-int/2addr v0, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v0, v1, :cond_4

    if-eqz p1, :cond_3

    aget-byte v0, v2, v4

    aget-byte v4, v2, v1

    invoke-static {v0, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    move v4, v3

    :cond_4
    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/2addr p1, v3

    if-ne p1, v3, :cond_6

    if-eqz p2, :cond_5

    aget-byte p1, v2, v4

    add-int/lit8 v0, v4, 0x1

    aget-byte v0, v2, v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_5
    add-int/lit8 v4, v4, 0x2

    :cond_6
    iget-byte p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    const/4 p1, 0x4

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_7

    if-eqz p3, :cond_7

    aget-byte p0, v2, v4

    add-int/2addr v4, v1

    aget-byte p1, v2, v4

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public static parseAltitude(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v2, v0, 0xff

    const/16 v3, 0xff

    if-ne v2, v3, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v3, 0x1

    and-int/2addr v0, v3

    const/4 v4, 0x3

    const-string v5, "."

    const/4 v6, 0x4

    const/4 v7, 0x0

    if-ne v0, v3, :cond_4

    if-eqz p1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte v7, v2, v7

    aget-byte v3, v2, v3

    invoke-static {v7, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v3, v2, v1

    aget-byte v7, v2, v4

    invoke-static {v3, v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    move v7, v6

    :cond_4
    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_6

    if-eqz p2, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte v0, v2, v7

    add-int/lit8 v1, v7, 0x1

    aget-byte v1, v2, v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v7, 0x2

    aget-byte v0, v2, v0

    add-int/lit8 v1, v7, 0x3

    aget-byte v1, v2, v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_5
    add-int/lit8 v7, v7, 0x4

    :cond_6
    iget-byte p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/2addr p0, v6

    if-ne p0, v6, :cond_7

    if-eqz p3, :cond_7

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte p1, v2, v7

    add-int/lit8 p2, v7, 0x1

    aget-byte p2, v2, p2

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, v7, 0x2

    aget-byte p1, v2, p1

    add-int/2addr v7, v4

    aget-byte p2, v2, v7

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-interface {p3, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public static parseBloodOxygen(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/2addr p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static parseHeartRate(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    aget-byte v0, v0, v3

    and-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move v1, v3

    :cond_4
    :goto_0
    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_6

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    aget-byte p1, p1, v1

    and-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    :cond_6
    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    const/4 p2, 0x4

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_7

    if-eqz p3, :cond_7

    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    aget-byte p0, p0, v1

    and-int/2addr p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public static parseMaxOxygenUptake(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/2addr p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static parsePressure(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/2addr p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static parseSportRecoveryTime(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/2addr p0, v2

    shr-int/lit8 v0, p0, 0x2

    int-to-float v0, v0

    int-to-float p0, p0

    const/high16 v1, 0x41700000    # 15.0f

    mul-float/2addr p0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr p0, v1

    add-float/2addr v0, p0

    if-eqz p1, :cond_3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static parseStep(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v2, 0x1

    and-int/2addr v0, v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-ne v0, v2, :cond_4

    if-eqz p1, :cond_3

    invoke-static {v1, v4, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    move v4, v3

    :cond_4
    iget-byte p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    const/4 p1, 0x2

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_5

    if-eqz p2, :cond_5

    invoke-static {v1, v4, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static parseTrainingLoad(Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/device/health/HealthData;",
            "Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->version:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->type:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->subMask:B

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;->data:[B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/2addr p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/util/HealthDataUtil$ParseResult;->onResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method
