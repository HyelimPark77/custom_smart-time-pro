.class public final Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final expireTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final remainDuration:F

.field private final totalDuration:F


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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;-><init>(FFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FFLjava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "expireTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    .line 4
    iput p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(FFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 6
    const-string p3, ""

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;-><init>(FFLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;FFLjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->copy(FFLjava/lang/String;)Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(FFLjava/lang/String;)Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "expireTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;-><init>(FFLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;

    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExpireTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getRemainDuration()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    return v0
.end method

.method public final getTotalDuration()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->totalDuration:F

    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->remainDuration:F

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->expireTime:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TranslationFreeTimeEntity(totalDuration="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", remainDuration="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", expireTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
