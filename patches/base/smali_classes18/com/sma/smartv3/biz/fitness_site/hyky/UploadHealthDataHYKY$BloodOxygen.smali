.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;
.super Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BloodOxygen"
.end annotation


# instance fields
.field private bloodOxygen:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_OXYGEN:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    .line 4
    invoke-direct {p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;)V

    .line 5
    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, -0x1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;-><init>(I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;IILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->copy(I)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    return v0
.end method

.method public final copy(I)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    iget p1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBloodOxygen()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public final setBloodOxygen(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;->bloodOxygen:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BloodOxygen(bloodOxygen="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
