.class public final Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final fajrAngle:D

.field private final ishaAngle:D

.field private final method:I

.field private final name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->Companion:Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;DD)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    .line 6
    iput-wide p5, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 7
    const-string p2, ""

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const-wide/16 v0, 0x0

    if-eqz p8, :cond_2

    move-wide p3, v0

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    move-wide p7, v0

    :goto_0
    move-wide p5, p3

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_1

    :cond_3
    move-wide p7, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p2 .. p8}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;ILjava/lang/String;DDILjava/lang/Object;)Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    iget-wide p5, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    :cond_3
    move-wide p7, p5

    move-wide p5, p3

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->copy(ILjava/lang/String;DD)Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    return-wide v0
.end method

.method public final copy(ILjava/lang/String;DD)Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    iget v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    iget v3, p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFajrAngle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    return-wide v0
.end method

.method public final getIshaAngle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    return-wide v0
.end method

.method public final getMethod()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->method:I

    iget-object v1, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->name:Ljava/lang/String;

    iget-wide v2, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->fajrAngle:D

    iget-wide v4, p0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->ishaAngle:D

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "PrayerTimesCalculationMethod(method="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fajrAngle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", ishaAngle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
