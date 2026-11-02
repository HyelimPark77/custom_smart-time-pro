.class public Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;
.super Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageData"
.end annotation


# instance fields
.field private data:[B

.field private seq:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;-><init>(BB)V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->beanToData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->setMessageData([B)V

    return-void
.end method

.method private beanToData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

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
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

    return-object v0
.end method

.method public getMessageType()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public getSeq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    return v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->getMessageData()[B

    move-result-object v1

    if-eqz v1, :cond_2

    array-length v2, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    aget-byte v2, v1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    array-length v2, v1

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    array-length v2, v1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

    invoke-static {v1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageData{seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->seq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
