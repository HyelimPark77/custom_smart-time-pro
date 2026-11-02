.class public final Lcom/sma/smartv3/model/AIRecordsViewData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private first:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private last:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/model/AIRecordsViewData;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/model/AIRecordsViewData;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILjava/lang/Object;)Lcom/sma/smartv3/model/AIRecordsViewData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/AIRecordsViewData;->copy(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;)Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final component2()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;)Lcom/sma/smartv3/model/AIRecordsViewData;
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/AIRecordsViewData;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/model/AIRecordsViewData;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/AIRecordsViewData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AIRecordsViewData;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object p1, p1, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFirst()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final getLast()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final setFirst(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public final setLast(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->first:Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIRecordsViewData;->last:Lcom/sma/smartv3/db/entity/AIRecords;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIRecordsViewData(first="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", last="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
