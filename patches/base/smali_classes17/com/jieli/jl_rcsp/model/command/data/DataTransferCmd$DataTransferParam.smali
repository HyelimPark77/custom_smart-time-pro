.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DataTransferParam"
.end annotation


# instance fields
.field private crc:S

.field private data:[B

.field private isEnd:Z

.field private len:I

.field private offset:I

.field private seq:I

.field private type:I


# direct methods
.method public constructor <init>(IZISI[B)V
    .locals 2

    .line 3
    invoke-static/range {p1 .. p6}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getPayload(IZISI[B)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>(I[B)V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->type:I

    .line 5
    iput-boolean p2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd:Z

    .line 6
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->seq:I

    .line 7
    iput-short p4, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->crc:S

    .line 8
    iput p5, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->offset:I

    .line 9
    iput-object p6, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->data:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>([B)V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->getPayload()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->parsePayload([B)V

    return-void
.end method

.method private static getPayload(IZISI[B)[B
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
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p4}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    if-nez p5, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    array-length p0, p5

    :goto_1
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    if-lez p0, :cond_2

    invoke-virtual {v0, p5}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private parsePayload([B)V
    .locals 6

    if-eqz p1, :cond_3

    array-length v0, p1

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->type:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {p1, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    and-int/lit8 v5, v4, 0x7f

    iput v5, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->seq:I

    shr-int/lit8 v4, v4, 0xf

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd:Z

    const/4 v2, 0x3

    invoke-static {p1, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    int-to-short v2, v2

    iput-short v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->crc:S

    const/4 v2, 0x5

    const/4 v4, 0x4

    invoke-static {p1, v2, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->offset:I

    const/16 v2, 0x9

    invoke-static {p1, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->len:I

    array-length v3, p1

    if-le v3, v1, :cond_2

    array-length v3, p1

    sub-int/2addr v3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->len:I

    new-array v3, v2, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->data:[B

    invoke-static {p1, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->len:I

    new-array p1, v0, [B

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->data:[B

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->crc:S

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->data:[B

    return-object v0
.end method

.method public getLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->len:I

    return v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->offset:I

    return v0
.end method

.method public getSeq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->seq:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->type:I

    return v0
.end method

.method public isEnd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataTransferParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->getOp()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->seq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->crc:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->len:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
