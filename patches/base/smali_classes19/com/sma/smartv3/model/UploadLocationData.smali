.class public final Lcom/sma/smartv3/model/UploadLocationData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private altitude:I

.field private latitude:F

.field private longitude:F

.field private source:I

.field private time:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadLocationData;->altitude:I

    return v0
.end method

.method public final getLatitude()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadLocationData;->latitude:F

    return v0
.end method

.method public final getLongitude()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadLocationData;->longitude:F

    return v0
.end method

.method public final getSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadLocationData;->source:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadLocationData;->time:J

    return-wide v0
.end method

.method public final setAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadLocationData;->altitude:I

    return-void
.end method

.method public final setLatitude(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadLocationData;->latitude:F

    return-void
.end method

.method public final setLongitude(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadLocationData;->longitude:F

    return-void
.end method

.method public final setSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadLocationData;->source:I

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadLocationData;->time:J

    return-void
.end method
