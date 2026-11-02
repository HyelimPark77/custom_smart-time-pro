.class public Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;
.super Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoveMsg"
.end annotation


# instance fields
.field private appPackageName:[B

.field private timestamp:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;-><init>(BB)V

    const/16 v0, 0x1f

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->getData(Ljava/lang/String;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->appPackageName:[B

    invoke-static {p2, p3}, Lcom/jieli/jl_rcsp/util/RcspUtil;->time2Int(J)I

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->timestamp:[B

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->beanToData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->setMessageData([B)V

    return-void
.end method

.method private beanToData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->timestamp:[B

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->appPackageName:[B

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getAppPackageName()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->appPackageName:[B

    return-object v0
.end method

.method public getMessageType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getTimestamp()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->timestamp:[B

    return-object v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->appPackageName:[B

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->timestamp:[B

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->getMessageData()[B

    move-result-object v1

    if-eqz v1, :cond_3

    array-length v2, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    array-length v2, v1

    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    new-array v2, v3, [B

    iput-object v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->timestamp:[B

    invoke-static {v1, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, v1

    if-le v2, v3, :cond_3

    array-length v2, v1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;->appPackageName:[B

    invoke-static {v1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    :goto_0
    return p1
.end method
