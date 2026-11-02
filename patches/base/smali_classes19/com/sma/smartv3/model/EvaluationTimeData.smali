.class public final Lcom/sma/smartv3/model/EvaluationTimeData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private clickTime:J

.field private noShowPop:Z

.field private final time:J

.field private final versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0xf

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/EvaluationTimeData;-><init>(JIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIJZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    iput p3, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    .line 3
    iput-wide p4, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    iput-boolean p6, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    return-void
.end method

.method public synthetic constructor <init>(JIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p8, p7, 0x1

    const-wide/16 v0, 0x0

    if-eqz p8, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v2, 0x0

    if-eqz p8, :cond_1

    move p3, v2

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    move p7, v2

    :goto_0
    move-wide p5, p4

    move p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p7, p6

    goto :goto_0

    .line 4
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/EvaluationTimeData;-><init>(JIJZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/EvaluationTimeData;JIJZILjava/lang/Object;)Lcom/sma/smartv3/model/EvaluationTimeData;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-boolean p6, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    :cond_3
    move-object v0, p0

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/sma/smartv3/model/EvaluationTimeData;->copy(JIJZ)Lcom/sma/smartv3/model/EvaluationTimeData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    return v0
.end method

.method public final copy(JIJZ)Lcom/sma/smartv3/model/EvaluationTimeData;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/EvaluationTimeData;

    move-wide v1, p1

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/model/EvaluationTimeData;-><init>(JIJZ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/EvaluationTimeData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/EvaluationTimeData;

    iget-wide v3, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    iget v3, p1, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getClickTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    return-wide v0
.end method

.method public final getNoShowPop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    return-wide v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setClickTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    return-void
.end method

.method public final setNoShowPop(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->time:J

    iget v2, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->versionCode:I

    iget-wide v3, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->clickTime:J

    iget-boolean v5, p0, Lcom/sma/smartv3/model/EvaluationTimeData;->noShowPop:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "EvaluationTimeData(time="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", versionCode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", clickTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", noShowPop="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
