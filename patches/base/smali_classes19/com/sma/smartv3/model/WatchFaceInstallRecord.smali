.class public final Lcom/sma/smartv3/model/WatchFaceInstallRecord;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final createdAt:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final id:I

.field private final updateAt:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userId:I

.field private final watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p2    # Lcom/sma/smartv3/model/WatchFaceCategoryV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    .line 4
    iput p3, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    .line 7
    const-string v0, ""

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p6, p5

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/sma/smartv3/model/WatchFaceInstallRecord;-><init>(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/WatchFaceInstallRecord;ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/WatchFaceInstallRecord;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->copy(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/model/WatchFaceInstallRecord;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    return v0
.end method

.method public final component2()Lcom/sma/smartv3/model/WatchFaceCategoryV2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/model/WatchFaceInstallRecord;
    .locals 7
    .param p2    # Lcom/sma/smartv3/model/WatchFaceCategoryV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/WatchFaceInstallRecord;-><init>(ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;

    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    iget v3, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iget-object v3, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    return v0
.end method

.method public final getUpdateAt()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    return v0
.end method

.method public final getWatchFace()Lcom/sma/smartv3/model/WatchFaceCategoryV2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->userId:I

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->watchFace:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iget v2, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->id:I

    iget-object v3, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->createdAt:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/model/WatchFaceInstallRecord;->updateAt:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WatchFaceInstallRecord(userId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", watchFace="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateAt="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
