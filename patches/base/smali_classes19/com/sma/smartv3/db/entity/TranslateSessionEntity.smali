.class public final Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
.end annotation


# instance fields
.field private audioPath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private createTime:J

.field private duration:F

.field private isDelete:I

.field private isSelected:Z
    .annotation build Landroidx/room/Ignore;
    .end annotation
.end field

.field private final sessionId:Ljava/lang/String;
    .annotation build Landroidx/room/PrimaryKey;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;FJI)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    .line 6
    iput p6, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;FJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    .line 7
    sget-object p6, Lcom/sma/smartv3/ui/translate/ActionDoneType;->INCOMPLETE:Lcom/sma/smartv3/ui/translate/ActionDoneType;

    invoke-virtual {p6}, Lcom/sma/smartv3/ui/translate/ActionDoneType;->getFlag()I

    move-result p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Ljava/lang/String;Ljava/lang/String;FJIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-wide p4, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget p6, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    :cond_4
    move p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->copy(Ljava/lang/String;Ljava/lang/String;FJI)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;FJI)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAudioPath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    return-wide v0
.end method

.method public final getDuration()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    return v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isSelected:Z

    return v0
.end method

.method public final setAudioPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    return-void
.end method

.method public final setCreateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    return-void
.end method

.method public final setDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    return-void
.end method

.method public final setDuration(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isSelected:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->sessionId:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->audioPath:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->duration:F

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->createTime:J

    iget v5, p0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "TranslateSessionEntity(sessionId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", audioPath="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", createTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", isDelete="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
