.class public Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/io/ByteArrayOutputStream;

.field private final c:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b:Ljava/io/ByteArrayOutputStream;

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x2t
        -0x24t
        -0x46t
    .end array-data
.end method

.method private a([BII)I
    .locals 9

    .line 9
    array-length v0, p1

    :goto_0
    const/4 v1, -0x1

    if-ge p2, v0, :cond_6

    .line 10
    aget-byte v2, p1, p2

    const/4 v3, -0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_5

    sub-int v2, v0, p2

    .line 11
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    array-length v5, v3

    if-ge v2, v5, :cond_0

    .line 12
    invoke-direct {p0, p1, p2, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b([BII)V

    return v1

    .line 13
    :cond_0
    array-length v3, v3

    new-array v5, v3, [B

    const/4 v6, 0x0

    .line 14
    invoke-static {p1, p2, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 15
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    invoke-static {v5, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 16
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    array-length v5, v3

    add-int/lit8 v5, v5, 0x4

    if-gt v2, v5, :cond_1

    .line 17
    invoke-direct {p0, p1, p2, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b([BII)V

    return v1

    .line 18
    :cond_1
    array-length v3, v3

    add-int/2addr v3, p2

    const/4 v5, 0x2

    .line 19
    new-array v7, v5, [B

    add-int/lit8 v8, v3, 0x2

    .line 20
    invoke-static {p1, v8, v7, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    aget-byte v5, v7, v6

    aget-byte v6, v7, v4

    invoke-static {v5, v6}, Lcom/jieli/jl_bt_ota/util/CHexConver;->bytesToInt(BB)I

    move-result v5

    add-int/lit8 v6, p3, -0x8

    if-le v5, v6, :cond_2

    .line 22
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "data length[%d] over MAX_RECEIVE_MTU[%d], cast away"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "findPacketData"

    invoke-static {p2, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 p2, v3, -0x1

    goto :goto_2

    .line 23
    :cond_2
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    array-length v6, v6

    add-int/lit8 v6, v6, 0x4

    add-int/2addr v6, v5

    if-gt v2, v6, :cond_3

    .line 24
    invoke-direct {p0, p1, p2, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b([BII)V

    return v1

    :cond_3
    add-int/lit8 p2, v3, 0x4

    add-int/2addr p2, v5

    .line 25
    aget-byte p2, p1, p2

    const/16 v1, -0x11

    if-eq p2, v1, :cond_4

    goto :goto_1

    :cond_4
    return v3

    :cond_5
    :goto_2
    add-int/2addr p2, v4

    goto :goto_0

    :cond_6
    return v1
.end method

.method private a([B)[B
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 3
    array-length v2, v1

    if-lez v2, :cond_0

    add-int v3, v2, v0

    .line 4
    new-array v3, v3, [B

    const/4 v4, 0x0

    .line 5
    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    invoke-static {p1, v4, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-object v3

    .line 8
    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method private b([B)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 10

    if-eqz p1, :cond_3

    .line 1
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_3

    const/4 v0, 0x0

    .line 2
    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object v2

    const/4 v3, 0x1

    .line 3
    aget-byte v4, p1, v3

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v4

    const/4 v5, 0x2

    .line 4
    invoke-static {p1, v5, v5}, Lcom/jieli/jl_bt_ota/util/CHexConver;->bytesToInt([BII)I

    move-result v6

    .line 5
    new-instance v7, Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    invoke-direct {v7}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;-><init>()V

    const/4 v8, 0x7

    .line 6
    aget-byte v8, v2, v8

    invoke-static {v8}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v8

    const/4 v9, 0x6

    .line 7
    aget-byte v2, v2, v9

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v2

    .line 8
    invoke-virtual {v7, v8}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setType(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 9
    invoke-virtual {v7, v2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setHasResponse(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 10
    invoke-virtual {v7, v4}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 11
    invoke-virtual {v7, v6}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setParamLen(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    if-lez v6, :cond_2

    if-nez v8, :cond_0

    .line 12
    aget-byte v1, p1, v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v7, v1}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    const/4 v1, 0x5

    .line 13
    :cond_0
    aget-byte v2, p1, v1

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v2

    invoke-virtual {v7, v2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setOpCodeSn(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    add-int/lit8 v2, v1, 0x1

    if-ne v4, v3, :cond_1

    .line 14
    aget-byte v2, p1, v2

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v2

    invoke-virtual {v7, v2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setXmOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    add-int/lit8 v2, v1, 0x2

    :cond_1
    add-int/lit8 v1, v2, -0x4

    sub-int/2addr v6, v1

    .line 15
    new-array v1, v6, [B

    .line 16
    invoke-static {p1, v2, v1, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    invoke-virtual {v7, v1}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->setParamData([B)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 18
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    .line 19
    invoke-virtual {v7}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 20
    const-string v1, "packet type : %d, opCode : %d, sn :%d"

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "parsePacketData"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object v7

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private b([BII)V
    .locals 1

    if-eqz p1, :cond_0

    .line 21
    array-length v0, p1

    if-lez v0, :cond_0

    if-ltz p2, :cond_0

    if-lez p3, :cond_0

    add-int/2addr p3, p2

    array-length v0, p1

    if-gt p3, v0, :cond_0

    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b:Ljava/io/ByteArrayOutputStream;

    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method


# virtual methods
.method public findPacketData(I[B)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_bt_ota/model/base/BasePacket;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a([B)[B

    move-result-object p2

    array-length v1, p2

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mtu = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "findPacketData"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-direct {p0, p2, v3, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a([BII)I

    move-result v3

    iget-object v5, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->c:[B

    array-length v5, v5

    if-ge v3, v5, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    const-string p2, "not find head data : "

    invoke-static {p1, v4, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    add-int/lit8 v5, v3, 0x2

    const/4 v6, 0x2

    invoke-static {p2, v5, v6}, Lcom/jieli/jl_bt_ota/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    iget-object v6, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "prefixIndex = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", paramLen = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v4, v7}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v6, v5, 0x4

    new-array v7, v6, [B

    invoke-static {p2, v3, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, v7}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b([B)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-void
.end method
