.class public final Lcom/sma/smartv3/model/BDLocationPoint;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private coord_type_input:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private direction:I

.field private entity_name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    iput-object v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->entity_name:Ljava/lang/String;

    const-string v0, "wgs84"

    iput-object v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->coord_type_input:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getCoord_type_input()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->coord_type_input:Ljava/lang/String;

    return-object v0
.end method

.method public final getDirection()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->direction:I

    return v0
.end method

.method public final getEntity_name()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->entity_name:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->height:D

    return-wide v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->latitude:D

    return-wide v0
.end method

.method public final getLoc_time()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->loc_time:J

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->longitude:D

    return-wide v0
.end method

.method public final getRadius()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->radius:D

    return-wide v0
.end method

.method public final getSpeed()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BDLocationPoint;->speed:D

    return-wide v0
.end method

.method public final setCoord_type_input(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->coord_type_input:Ljava/lang/String;

    return-void
.end method

.method public final setDirection(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->direction:I

    return-void
.end method

.method public final setEntity_name(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->entity_name:Ljava/lang/String;

    return-void
.end method

.method public final setHeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->height:D

    return-void
.end method

.method public final setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->latitude:D

    return-void
.end method

.method public final setLoc_time(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->loc_time:J

    return-void
.end method

.method public final setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->longitude:D

    return-void
.end method

.method public final setRadius(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->radius:D

    return-void
.end method

.method public final setSpeed(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BDLocationPoint;->speed:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/model/BDLocationPoint;->entity_name:Ljava/lang/String;

    iget-wide v2, v0, Lcom/sma/smartv3/model/BDLocationPoint;->loc_time:J

    iget-wide v4, v0, Lcom/sma/smartv3/model/BDLocationPoint;->latitude:D

    iget-wide v6, v0, Lcom/sma/smartv3/model/BDLocationPoint;->longitude:D

    iget-object v8, v0, Lcom/sma/smartv3/model/BDLocationPoint;->coord_type_input:Ljava/lang/String;

    iget-wide v9, v0, Lcom/sma/smartv3/model/BDLocationPoint;->speed:D

    iget v11, v0, Lcom/sma/smartv3/model/BDLocationPoint;->direction:I

    iget-wide v12, v0, Lcom/sma/smartv3/model/BDLocationPoint;->height:D

    iget-wide v14, v0, Lcom/sma/smartv3/model/BDLocationPoint;->radius:D

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v16, v14

    const-string v14, "BDLocationPoint(entity_name=\'"

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', loc_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", coord_type_input=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", direction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
