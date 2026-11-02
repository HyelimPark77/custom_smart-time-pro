.class public abstract Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "BaseInfo"
.end annotation


# instance fields
.field private messageData:[B

.field private type:B

.field private version:B


# direct methods
.method public constructor <init>(BB)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    .line 10
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->version:B

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->parse([B)I

    move-result v0

    if-ltz v0, :cond_2

    if-lez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->getMessageType()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 4
    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    .line 6
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Data type[%d] does not match the target type[%d]."

    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    .line 7
    :cond_2
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

.method private toParamData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->version:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->messageData:[B

    if-eqz v1, :cond_0

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


# virtual methods
.method public getMessageData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->messageData:[B

    return-object v0
.end method

.method public abstract getMessageType()I
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    return v0
.end method

.method public getVersion()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->version:B

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->messageData:[B

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

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->type:B

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->version:B

    array-length v1, p1

    if-le v1, v2, :cond_2

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->messageData:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    array-length p1, p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public setMessageData([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->messageData:[B

    return-void
.end method

.method public toData()[B
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->toParamData()[B

    move-result-object v0

    return-object v0
.end method
