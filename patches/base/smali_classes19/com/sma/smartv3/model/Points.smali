.class public final Lcom/sma/smartv3/model/Points;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private create_time:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private direction:I

.field private height:D

.field private latitude:D

.field private loc_time:J

.field private longitude:D

.field private radius:D

.field private speed:D


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/Points;->create_time:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getCreate_time()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Points;->create_time:Ljava/lang/String;

    return-object v0
.end method

.method public final getDirection()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Points;->direction:I

    return v0
.end method

.method public final getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->height:D

    return-wide v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->latitude:D

    return-wide v0
.end method

.method public final getLoc_time()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->loc_time:J

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->longitude:D

    return-wide v0
.end method

.method public final getRadius()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->radius:D

    return-wide v0
.end method

.method public final getSpeed()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Points;->speed:D

    return-wide v0
.end method

.method public final setCreate_time(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Points;->create_time:Ljava/lang/String;

    return-void
.end method

.method public final setDirection(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Points;->direction:I

    return-void
.end method

.method public final setHeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->height:D

    return-void
.end method

.method public final setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->latitude:D

    return-void
.end method

.method public final setLoc_time(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->loc_time:J

    return-void
.end method

.method public final setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->longitude:D

    return-void
.end method

.method public final setRadius(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->radius:D

    return-void
.end method

.method public final setSpeed(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Points;->speed:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 16
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/sma/smartv3/model/Points;->longitude:D

    iget-wide v3, v0, Lcom/sma/smartv3/model/Points;->latitude:D

    iget-wide v5, v0, Lcom/sma/smartv3/model/Points;->loc_time:J

    iget-object v7, v0, Lcom/sma/smartv3/model/Points;->create_time:Ljava/lang/String;

    iget v8, v0, Lcom/sma/smartv3/model/Points;->direction:I

    iget-wide v9, v0, Lcom/sma/smartv3/model/Points;->height:D

    iget-wide v11, v0, Lcom/sma/smartv3/model/Points;->radius:D

    iget-wide v13, v0, Lcom/sma/smartv3/model/Points;->speed:D

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Points(longitude="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", latitude="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", loc_time="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", create_time=\'"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', direction="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", radius="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", speed="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
