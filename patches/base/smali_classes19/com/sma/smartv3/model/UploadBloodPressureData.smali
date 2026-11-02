.class public final Lcom/sma/smartv3/model/UploadBloodPressureData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private diastolic:I

.field private systolic:I

.field private time:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDiastolic()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->diastolic:I

    return v0
.end method

.method public final getSystolic()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->systolic:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->time:J

    return-wide v0
.end method

.method public final setDiastolic(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->diastolic:I

    return-void
.end method

.method public final setSystolic(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->systolic:I

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadBloodPressureData;->time:J

    return-void
.end method
