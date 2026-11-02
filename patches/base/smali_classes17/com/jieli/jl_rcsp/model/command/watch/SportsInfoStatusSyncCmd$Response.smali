.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field public op:I

.field public responseData:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 11
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->op:I

    .line 12
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->responseData:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->parse([B)I

    move-result v0

    if-ltz v0, :cond_2

    if-lez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getResponseType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getOp()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getOp()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 7
    const-string v2, "Operation[%d] does not match the target operation[%d]."

    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    return-void

    .line 9
    :cond_2
    new-instance v1, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failure to parse data. size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw v1
.end method


# virtual methods
.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->op:I

    return v0
.end method

.method public getResponseData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->responseData:[B

    return-object v0
.end method

.method public getResponseType()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->responseData:[B

    if-eqz p1, :cond_2

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->op:I

    array-length v1, p1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->responseData:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    array-length p1, p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->op:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->responseData:[B

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
