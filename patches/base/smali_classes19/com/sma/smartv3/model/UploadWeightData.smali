.class public final Lcom/sma/smartv3/model/UploadWeightData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private time:J

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadWeightData;->time:J

    return-wide v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWeightData;->weight:F

    return v0
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadWeightData;->time:J

    return-void
.end method

.method public final setWeight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWeightData;->weight:F

    return-void
.end method
