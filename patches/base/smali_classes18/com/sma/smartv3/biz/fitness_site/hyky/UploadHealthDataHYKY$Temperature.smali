.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;
.super Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Temperature"
.end annotation


# instance fields
.field private temperature:D


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;-><init>(DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 1

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->TEMPERATURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    .line 4
    invoke-direct {p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;)V

    .line 5
    iput-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    return-void
.end method

.method public synthetic constructor <init>(DILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;-><init>(D)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;DILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->copy(D)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    return-wide v0
.end method

.method public final copy(D)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;-><init>(D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;

    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    iget-wide v5, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getTemperature()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public final setTemperature(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;->temperature:D

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Temperature(temperature="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
