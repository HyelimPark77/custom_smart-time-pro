.class public final Lcom/sma/smartv3/model/Point;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private latitude:D

.field private loc_time:J

.field private longitude:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Point;->latitude:D

    return-wide v0
.end method

.method public final getLoc_time()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Point;->loc_time:J

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Point;->longitude:D

    return-wide v0
.end method

.method public final setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Point;->latitude:D

    return-void
.end method

.method public final setLoc_time(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Point;->loc_time:J

    return-void
.end method

.method public final setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Point;->longitude:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/Point;->longitude:D

    iget-wide v2, p0, Lcom/sma/smartv3/model/Point;->latitude:D

    iget-wide v4, p0, Lcom/sma/smartv3/model/Point;->loc_time:J

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Point(longitude="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", latitude="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", loc_time="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
