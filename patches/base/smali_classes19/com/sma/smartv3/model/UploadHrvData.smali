.class public final Lcom/sma/smartv3/model/UploadHrvData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private avg_value:I

.field private time:J

.field private value:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAvg_value()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadHrvData;->avg_value:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadHrvData;->time:J

    return-wide v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadHrvData;->value:I

    return v0
.end method

.method public final setAvg_value(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadHrvData;->avg_value:I

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadHrvData;->time:J

    return-void
.end method

.method public final setValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadHrvData;->value:I

    return-void
.end method
