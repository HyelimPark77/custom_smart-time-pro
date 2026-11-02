.class public final Lcom/sma/smartv3/model/BGEMRecordSet;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private calendar:I

.field private endDate:J

.field private startDate:J


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/model/BGEMRecordSet;-><init>(IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    return-void
.end method

.method public synthetic constructor <init>(IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const-wide/16 v0, 0x0

    if-eqz p7, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    move-wide p6, v0

    :goto_0
    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    goto :goto_1

    :cond_2
    move-wide p6, p4

    goto :goto_0

    .line 6
    :goto_1
    invoke-direct/range {p2 .. p7}, Lcom/sma/smartv3/model/BGEMRecordSet;-><init>(IJJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BGEMRecordSet;IJJILjava/lang/Object;)Lcom/sma/smartv3/model/BGEMRecordSet;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    iget-wide p4, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    :cond_2
    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/sma/smartv3/model/BGEMRecordSet;->copy(IJJ)Lcom/sma/smartv3/model/BGEMRecordSet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    return-wide v0
.end method

.method public final copy(IJJ)Lcom/sma/smartv3/model/BGEMRecordSet;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/BGEMRecordSet;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/BGEMRecordSet;-><init>(IJJ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BGEMRecordSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BGEMRecordSet;

    iget v1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    iget v3, p1, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCalendar()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    return v0
.end method

.method public final getEndDate()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    return-wide v0
.end method

.method public final getStartDate()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCalendar(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    return-void
.end method

.method public final setEndDate(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    return-void
.end method

.method public final setStartDate(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->calendar:I

    iget-wide v1, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->startDate:J

    iget-wide v3, p0, Lcom/sma/smartv3/model/BGEMRecordSet;->endDate:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "BGEMRecordSet(calendar="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", startDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", endDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
