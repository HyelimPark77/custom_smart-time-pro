.class public Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field public data:[B

.field public flag:B

.field public ret:B


# direct methods
.method public constructor <init>(BB[B)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 6
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->ret:B

    .line 7
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->flag:B

    .line 8
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->parse([B)I

    move-result v0

    if-ltz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse data. size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    const/4 v2, 0x1

    invoke-direct {p1, v2, v0, v1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw p1
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    return-object v0
.end method

.method public getFlag()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->flag:B

    return v0
.end method

.method public getRet()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->ret:B

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->ret:B

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->flag:B

    array-length v1, p1

    if-ge v2, v1, :cond_2

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    array-length p1, p1

    add-int/2addr p1, v2

    return p1

    :cond_2
    return v2

    :cond_3
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->ret:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->flag:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

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
