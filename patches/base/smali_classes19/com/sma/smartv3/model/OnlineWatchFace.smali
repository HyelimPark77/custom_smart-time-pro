.class public final Lcom/sma/smartv3/model/OnlineWatchFace;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final time:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final total:I


# direct methods
.method public constructor <init>(ILjava/lang/String;[Lcom/sma/smartv3/model/WatchFaceCategory;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [Lcom/sma/smartv3/model/WatchFaceCategory;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "time"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    iput-object p2, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/OnlineWatchFace;ILjava/lang/String;[Lcom/sma/smartv3/model/WatchFaceCategory;ILjava/lang/Object;)Lcom/sma/smartv3/model/OnlineWatchFace;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/OnlineWatchFace;->copy(ILjava/lang/String;[Lcom/sma/smartv3/model/WatchFaceCategory;)Lcom/sma/smartv3/model/OnlineWatchFace;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()[Lcom/sma/smartv3/model/WatchFaceCategory;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;[Lcom/sma/smartv3/model/WatchFaceCategory;)Lcom/sma/smartv3/model/OnlineWatchFace;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [Lcom/sma/smartv3/model/WatchFaceCategory;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "time"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/model/OnlineWatchFace;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/model/OnlineWatchFace;-><init>(ILjava/lang/String;[Lcom/sma/smartv3/model/WatchFaceCategory;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/OnlineWatchFace;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/OnlineWatchFace;

    iget v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    iget v3, p1, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    iget-object p1, p1, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCategorys()[Lcom/sma/smartv3/model/WatchFaceCategory;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    return-object v0
.end method

.method public final getTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->total:I

    iget-object v1, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->time:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/model/OnlineWatchFace;->categorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OnlineWatchFace(total="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", categorys="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
