.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private op:I

.field private payload:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->op:I

    .line 5
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->payload:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->parseData([B)V

    return-void
.end method


# virtual methods
.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->op:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->payload:[B

    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getPayload()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->payload:[B

    return-object v0
.end method

.method public parseData([B)V
    .locals 4

    if-eqz p1, :cond_2

    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->op:I

    array-length v2, p1

    if-le v2, v1, :cond_1

    array-length v2, p1

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->payload:[B

    invoke-static {p1, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1
    new-array p1, v0, [B

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->payload:[B

    :cond_2
    :goto_0
    return-void
.end method
