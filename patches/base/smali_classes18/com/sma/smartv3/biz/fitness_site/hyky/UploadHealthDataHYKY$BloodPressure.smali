.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;
.super Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BloodPressure"
.end annotation


# instance fields
.field private bloodPressureHigh:I

.field private bloodPressureLow:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_PRESSURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    .line 4
    invoke-direct {p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;)V

    .line 5
    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    .line 6
    iput p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, -0x1

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;-><init>(II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;IIILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->copy(II)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    return v0
.end method

.method public final copy(II)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    iget v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    iget p1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBloodPressureHigh()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    return v0
.end method

.method public final getBloodPressureLow()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setBloodPressureHigh(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    return-void
.end method

.method public final setBloodPressureLow(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureLow:I

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;->bloodPressureHigh:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressure(bloodPressureLow="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bloodPressureHigh="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
