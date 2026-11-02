.class public final Lcom/sma/smartv3/model/UploadSleepData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mode:I

.field private soft:I

.field private strong:I

.field private time:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadSleepData;->mode:I

    return v0
.end method

.method public final getSoft()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadSleepData;->soft:I

    return v0
.end method

.method public final getStrong()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadSleepData;->strong:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadSleepData;->time:J

    return-wide v0
.end method

.method public final setMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadSleepData;->mode:I

    return-void
.end method

.method public final setSoft(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadSleepData;->soft:I

    return-void
.end method

.method public final setStrong(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadSleepData;->strong:I

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadSleepData;->time:J

    return-void
.end method
