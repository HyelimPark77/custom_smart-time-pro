.class public Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final MODE_BRIGHT:B = 0x0t

.field public static final MODE_SHAKE:B = 0x1t


# instance fields
.field private enable:Z

.field private maxHeartRate:I

.field private minHeartRate:I

.field private mode:B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 3

    if-eqz p1, :cond_4

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v0, v2

    :cond_1
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->enable:Z

    array-length v0, p1

    const/4 v1, 0x2

    if-le v0, v2, :cond_2

    aget-byte v0, p1, v2

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->mode:B

    move v2, v1

    :cond_2
    array-length v0, p1

    if-le v0, v1, :cond_3

    aget-byte v0, p1, v2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    add-int/lit8 v2, v2, 0x1

    :cond_3
    array-length v0, p1

    const/4 v1, 0x3

    if-le v0, v1, :cond_4

    aget-byte p1, p1, v2

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    :cond_4
    :goto_0
    return-void
.end method

.method private toData()[B
    .locals 7

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->enable:Z

    int-to-byte v1, v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->mode:B

    const/4 v3, 0x2

    new-array v4, v3, [B

    const/4 v5, 0x0

    aput-byte v1, v4, v5

    const/4 v1, 0x1

    aput-byte v2, v4, v1

    :try_start_0
    invoke-virtual {v0, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_1

    iget v6, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    if-eq v6, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    if-ne v2, v4, :cond_2

    iput v5, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    :cond_2
    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    if-ne v2, v4, :cond_3

    iput v5, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    :cond_3
    new-array v2, v3, [B

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v3

    aput-byte v3, v2, v5

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v3

    aput-byte v3, v2, v1

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_4

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    return v0
.end method

.method public getMode()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->mode:B

    return v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public isEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->enable:Z

    return v0
.end method

.method public setEnable(Z)Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->enable:Z

    return-object p0
.end method

.method public setMaxHeartRate(I)Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    return-object p0
.end method

.method public setMinHeartRate(I)Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    return-object p0
.end method

.method public setMode(B)Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->mode:B

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateMeasure{enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->mode:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;->minHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
