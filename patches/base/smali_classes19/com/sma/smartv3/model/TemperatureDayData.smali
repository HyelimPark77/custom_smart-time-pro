.class public final Lcom/sma/smartv3/model/TemperatureDayData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private avg:F

.field private max:F

.field private min:F


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/TemperatureDayData;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/TemperatureDayData;->max:F

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/TemperatureDayData;->min:F

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/TemperatureDayData;->avg:F

    return-void
.end method

.method public synthetic constructor <init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/TemperatureDayData;-><init>(FFF)V

    return-void
.end method


# virtual methods
.method public final getAvg()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TemperatureDayData;->avg:F

    return v0
.end method

.method public final getMax()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TemperatureDayData;->max:F

    return v0
.end method

.method public final getMin()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TemperatureDayData;->min:F

    return v0
.end method

.method public final setAvg(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/TemperatureDayData;->avg:F

    return-void
.end method

.method public final setMax(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/TemperatureDayData;->max:F

    return-void
.end method

.method public final setMin(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/TemperatureDayData;->min:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/TemperatureDayData;->max:F

    iget v1, p0, Lcom/sma/smartv3/model/TemperatureDayData;->min:F

    iget v2, p0, Lcom/sma/smartv3/model/TemperatureDayData;->avg:F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TemperatureDayData(max="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", min="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", avg="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
