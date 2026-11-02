.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TransferParamResponse"
.end annotation


# instance fields
.field private data:[B

.field private type:I

.field private version:I

.field private way:I


# direct methods
.method public constructor <init>(III[B)V
    .locals 2

    .line 3
    invoke-static {p1, p2, p3, p4}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->getResponseData(III[B)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;-><init>(I[B)V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->way:I

    .line 5
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->type:I

    .line 6
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->version:I

    .line 7
    iput-object p4, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->data:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;-><init>([B)V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getResponse()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->parseResponseData([B)V

    return-void
.end method

.method private static getResponseData(III[B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-eqz p3, :cond_0

    array-length p0, p3

    if-lez p0, :cond_0

    :try_start_0
    invoke-virtual {v0, p3}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private parseResponseData([B)V
    .locals 4

    if-eqz p1, :cond_2

    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->way:I

    const/4 v2, 0x1

    aget-byte v2, p1, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->type:I

    const/4 v2, 0x2

    aget-byte v2, p1, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->version:I

    array-length v2, p1

    if-le v2, v1, :cond_1

    array-length v2, p1

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->data:[B

    invoke-static {p1, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1
    new-array p1, v0, [B

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->data:[B

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->data:[B

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->type:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->version:I

    return v0
.end method

.method public getWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->way:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransferParamResponse{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getOp()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", way="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->way:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
