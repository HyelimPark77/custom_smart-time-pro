.class public final Lcom/sma/smartv3/model/PrayerTimeSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private arsJuristicMethod:I

.field private asrAdjustment:I

.field private calculationMethod:I

.field private dhuhrAdjustment:I

.field private fajrAdjustment:I

.field private hijriDateAdjustment:I

.field private ishaAdjustment:I

.field private maghribAdjustment:I

.field private sunriseAdjustment:I


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/model/PrayerTimeSettings;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    .line 11
    iput p9, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/sma/smartv3/model/PrayerTimeSettings;-><init>(IIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/PrayerTimeSettings;IIIIIIIIIILjava/lang/Object;)Lcom/sma/smartv3/model/PrayerTimeSettings;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/sma/smartv3/model/PrayerTimeSettings;->copy(IIIIIIIII)Lcom/sma/smartv3/model/PrayerTimeSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    return v0
.end method

.method public final copy(IIIIIIIII)Lcom/sma/smartv3/model/PrayerTimeSettings;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/PrayerTimeSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/model/PrayerTimeSettings;-><init>(IIIIIIIII)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    iget p1, p1, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getArsJuristicMethod()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    return v0
.end method

.method public final getAsrAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    return v0
.end method

.method public final getCalculationMethod()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    return v0
.end method

.method public final getDhuhrAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    return v0
.end method

.method public final getFajrAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    return v0
.end method

.method public final getHijriDateAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    return v0
.end method

.method public final getIshaAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    return v0
.end method

.method public final getMaghribAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    return v0
.end method

.method public final getSunriseAdjustment()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setArsJuristicMethod(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    return-void
.end method

.method public final setAsrAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    return-void
.end method

.method public final setCalculationMethod(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    return-void
.end method

.method public final setDhuhrAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    return-void
.end method

.method public final setFajrAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    return-void
.end method

.method public final setHijriDateAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    return-void
.end method

.method public final setIshaAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    return-void
.end method

.method public final setMaghribAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    return-void
.end method

.method public final setSunriseAdjustment(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->calculationMethod:I

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->arsJuristicMethod:I

    iget v2, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->hijriDateAdjustment:I

    iget v3, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->fajrAdjustment:I

    iget v4, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->sunriseAdjustment:I

    iget v5, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->dhuhrAdjustment:I

    iget v6, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->asrAdjustment:I

    iget v7, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->maghribAdjustment:I

    iget v8, p0, Lcom/sma/smartv3/model/PrayerTimeSettings;->ishaAdjustment:I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PrayerTimeSettings(calculationMethod="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", arsJuristicMethod="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hijriDateAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fajrAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sunriseAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dhuhrAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", asrAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maghribAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ishaAdjustment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
