.class public Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public data:[B

.field public packageCount:B

.field public packageId:B

.field public version:B


# direct methods
.method public constructor <init>([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->parse([B)I

    move-result v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse data. size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw v1
.end method


# virtual methods
.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->data:[B

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->version:B

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageCount:B

    const/4 v1, 0x2

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageId:B

    array-length v1, p1

    if-le v1, v2, :cond_2

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->data:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    array-length p1, p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->version:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageCount:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageId:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->data:[B

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
