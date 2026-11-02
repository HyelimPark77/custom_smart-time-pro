.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DataTransferResponse"
.end annotation


# instance fields
.field private isEnd:Z

.field private message:[B

.field private result:I

.field private seq:I

.field private type:I


# direct methods
.method public constructor <init>(IZII[B)V
    .locals 0

    .line 3
    invoke-static {p1, p2, p3, p4, p5}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getResponseData(IZII[B)[B

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p2, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;-><init>(I[B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;-><init>([B)V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getResponse()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->parseResponseData([B)V

    return-void
.end method

.method private static getResponseData(IZII[B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-eqz p1, :cond_0

    const p0, 0x8000

    or-int/2addr p0, p2

    goto :goto_0

    :cond_0
    and-int/lit16 p0, p2, 0x7fff

    :goto_0
    :try_start_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0, p3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-eqz p4, :cond_1

    array-length p0, p4

    if-lez p0, :cond_1

    invoke-virtual {v0, p4}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private parseResponseData([B)V
    .locals 5

    if-eqz p1, :cond_3

    array-length v0, p1

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->type:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {p1, v3, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    and-int/lit8 v4, v2, 0x7f

    iput v4, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->seq:I

    shr-int/lit8 v2, v2, 0xf

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    iput-boolean v3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->isEnd:Z

    const/4 v2, 0x3

    aget-byte v2, p1, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->result:I

    array-length v2, p1

    if-le v2, v1, :cond_2

    array-length v2, p1

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->message:[B

    invoke-static {p1, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_2
    new-array p1, v0, [B

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->message:[B

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public getMessage()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->message:[B

    return-object v0
.end method

.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->result:I

    return v0
.end method

.method public getSeq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->seq:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->type:I

    return v0
.end method

.method public isEnd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->isEnd:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataTransferResponse{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->isEnd:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->seq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->result:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->message:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
