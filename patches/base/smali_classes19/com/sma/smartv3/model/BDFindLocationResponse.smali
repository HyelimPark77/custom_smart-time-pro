.class public final Lcom/sma/smartv3/model/BDFindLocationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private distance:D

.field private end_point:Lcom/sma/smartv3/model/Point;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private message:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private points:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/Points;",
            ">;"
        }
    .end annotation
.end field

.field private size:I

.field private start_point:Lcom/sma/smartv3/model/Point;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private status:I

.field private toll_distance:D

.field private total:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->message:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/model/Point;

    invoke-direct {v0}, Lcom/sma/smartv3/model/Point;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->start_point:Lcom/sma/smartv3/model/Point;

    new-instance v0, Lcom/sma/smartv3/model/Point;

    invoke-direct {v0}, Lcom/sma/smartv3/model/Point;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->end_point:Lcom/sma/smartv3/model/Point;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->points:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getDistance()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->distance:D

    return-wide v0
.end method

.method public final getEnd_point()Lcom/sma/smartv3/model/Point;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->end_point:Lcom/sma/smartv3/model/Point;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getPoints()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/Points;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->points:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->size:I

    return v0
.end method

.method public final getStart_point()Lcom/sma/smartv3/model/Point;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->start_point:Lcom/sma/smartv3/model/Point;

    return-object v0
.end method

.method public final getStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->status:I

    return v0
.end method

.method public final getToll_distance()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->toll_distance:D

    return-wide v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->total:I

    return v0
.end method

.method public final setDistance(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->distance:D

    return-void
.end method

.method public final setEnd_point(Lcom/sma/smartv3/model/Point;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/Point;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->end_point:Lcom/sma/smartv3/model/Point;

    return-void
.end method

.method public final setMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->message:Ljava/lang/String;

    return-void
.end method

.method public final setPoints(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/Points;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->points:Ljava/util/ArrayList;

    return-void
.end method

.method public final setSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->size:I

    return-void
.end method

.method public final setStart_point(Lcom/sma/smartv3/model/Point;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/Point;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->start_point:Lcom/sma/smartv3/model/Point;

    return-void
.end method

.method public final setStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->status:I

    return-void
.end method

.method public final setToll_distance(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->toll_distance:D

    return-void
.end method

.method public final setTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->total:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->status:I

    iget-object v1, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->message:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->total:I

    iget v3, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->size:I

    iget-wide v4, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->distance:D

    iget-wide v6, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->toll_distance:D

    iget-object v8, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->start_point:Lcom/sma/smartv3/model/Point;

    iget-object v9, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->end_point:Lcom/sma/smartv3/model/Point;

    iget-object v10, p0, Lcom/sma/smartv3/model/BDFindLocationResponse;->points:Ljava/util/ArrayList;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "BDFindLocationResponse(status="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", message=\'"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', total="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", toll_distance="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", start_point="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", end_point="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", points="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
