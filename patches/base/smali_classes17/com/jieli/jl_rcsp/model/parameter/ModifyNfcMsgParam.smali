.class public Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;
.source "SourceFile"


# instance fields
.field private final nickName:Ljava/lang/String;

.field private final updateTime:J


# direct methods
.method public constructor <init>(ISJLjava/lang/String;)V
    .locals 2

    invoke-static {p3, p4, p5}, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->getMask(JLjava/lang/String;)I

    move-result v0

    invoke-static {p3, p4, p5}, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->getMaskData(JLjava/lang/String;)[B

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;-><init>(ISI[B)V

    iput-wide p3, p0, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->updateTime:J

    new-instance p1, Ljava/lang/String;

    const/16 p2, 0x18

    invoke-static {p5, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->getData(Ljava/lang/String;I)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->nickName:Ljava/lang/String;

    return-void
.end method

.method private static getMask(JLjava/lang/String;)I
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    or-int/lit8 p0, p0, 0x2

    :cond_1
    return p0
.end method

.method private static getMaskData(JLjava/lang/String;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-wide/16 v1, 0x0

    cmp-long v1, p0, v1

    if-lez v1, :cond_0

    :try_start_0
    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->time2Int(J)I

    move-result p0

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    const/16 p0, 0x18

    new-array p0, p0, [B

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x0

    invoke-static {p1, v2, p0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const-string p1, "ModifyNfcMsgParam"

    const-string v1, "getMaskData"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "modify name : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", data = "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getNickName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->nickName:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ModifyNfcMsgParam;->updateTime:J

    return-wide v0
.end method
