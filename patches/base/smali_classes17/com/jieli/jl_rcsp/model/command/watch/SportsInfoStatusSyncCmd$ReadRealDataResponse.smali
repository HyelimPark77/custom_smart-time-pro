.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadRealDataResponse"
.end annotation


# instance fields
.field public distance:F

.field public duration:I

.field public exerciseStatus:I

.field public heartRate:I

.field public kcal:I

.field public pace:F

.field public speed:F

.field public step:I

.field public stepFreq:I

.field public stride:I

.field public version:B


# direct methods
.method public constructor <init>(BIFIFIIIII)V
    .locals 2

    .line 2
    invoke-static/range {p1 .. p10}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->convertResponseData(BIFIFIIIII)[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>(I[B)V

    .line 3
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->version:B

    .line 4
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->step:I

    .line 5
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->distance:F

    .line 6
    iput p4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->duration:I

    .line 7
    iput p5, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->speed:F

    const/4 p1, 0x0

    cmpl-float p2, p5, p1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    div-float/2addr p1, p5

    const/high16 p2, 0x45610000    # 3600.0f

    mul-float/2addr p1, p2

    .line 8
    invoke-static {p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;->access$000(F)F

    move-result p1

    :goto_0
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->pace:F

    .line 9
    iput p6, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->kcal:I

    .line 10
    iput p7, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stepFreq:I

    .line 11
    iput p8, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stride:I

    .line 12
    iput p9, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->exerciseStatus:I

    .line 13
    iput p10, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->heartRate:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>([B)V

    return-void
.end method

.method private static convertResponseData(BIFIFIIIII)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    float-to-int p0, p2

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    float-to-int p0, p4

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p5}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p6}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p7}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0, p8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p9}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getResponseType()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public parse([B)I
    .locals 4

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getResponseData()[B

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    array-length v1, v0

    const/16 v2, 0x15

    if-ge v1, v2, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->version:B

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->step:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    int-to-float v1, v1

    const v2, 0x3c23d70a    # 0.01f

    mul-float/2addr v1, v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;->access$000(F)F

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->distance:F

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->duration:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;->access$000(F)F

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->speed:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v1

    const/high16 v1, 0x45610000    # 3600.0f

    mul-float/2addr v2, v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;->access$000(F)F

    move-result v2

    :goto_0
    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->pace:F

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->kcal:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stepFreq:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stride:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->exerciseStatus:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->heartRate:I

    :cond_4
    :goto_1
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdateRealDataParam{version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->version:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", step="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->step:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->distance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->duration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->speed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", pace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->pace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", kcal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->kcal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stepFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stepFreq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stride:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", exerciseStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->exerciseStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->heartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
