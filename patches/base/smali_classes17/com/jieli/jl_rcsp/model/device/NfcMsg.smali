.class public Lcom/jieli/jl_rcsp/model/device/NfcMsg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LIMIT_NFC_FILE_NAME:I = 0x6

.field public static final LIMIT_NICKNAME:I = 0x18


# instance fields
.field private crc16:S

.field private devHandler:I

.field private id:S

.field private nfcFileName:Ljava/lang/String;

.field private nfcHeadLen:I

.field private nfcID:[B

.field private nickname:Ljava/lang/String;

.field private reserve:[B

.field private updateTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseNfcMsg([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 11

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    array-length v1, p0

    const/16 v2, 0x2c

    if-ge v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const/16 v1, 0x2a

    const/4 v3, 0x2

    invoke-static {p0, v1, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "nfcHeadLen = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", data.len = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v5, p0

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "NfcMsg"

    const-string v6, "parseNfcMsg"

    invoke-static {v5, v6, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    array-length v4, p0

    add-int/2addr v1, v2

    if-eq v4, v1, :cond_1

    return-object v0

    :cond_1
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    new-array v2, v3, [B

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/RcspUtil;->intToTime(I)J

    move-result-wide v5

    const/4 v7, 0x6

    new-array v7, v7, [B

    invoke-virtual {p0, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :try_start_0
    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v7

    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    move-object v8, v0

    :goto_0
    const/16 v7, 0x18

    new-array v7, v7, [B

    invoke-virtual {p0, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :try_start_1
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v7}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v7

    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v7

    const/4 v9, 0x0

    new-array v10, v9, [B

    if-le v7, v3, :cond_2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v9

    add-int/lit8 v3, v7, -0x2

    new-array v10, v3, [B

    invoke-virtual {p0, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :cond_2
    new-instance p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;-><init>()V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setId(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setReserve([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v4}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setDevHandler(I)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v5, v6}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setUpdateTime(J)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v8}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setNfcFileName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setNickname(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v7}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setNfcHeadLen(I)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v9}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setCrc16(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    invoke-virtual {p0, v10}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setNfcID([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    return-object v0
.end method


# virtual methods
.method public convertRawData()[B
    .locals 7

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->id:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    const/4 v2, 0x2

    if-nez v1, :cond_0

    new-array v1, v2, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->devHandler:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v3, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->updateTime:J

    invoke-static {v3, v4}, Lcom/jieli/jl_rcsp/util/RcspUtil;->time2Int(J)I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcFileName:Ljava/lang/String;

    const/16 v3, 0x18

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const/4 v5, 0x6

    new-array v5, v5, [B

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v6, v1

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v1, v4, v5, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write([B)V

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nickname:Ljava/lang/String;

    if-eqz v1, :cond_2

    new-array v5, v3, [B

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v6, v1

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v1, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write([B)V

    :cond_2
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcID:[B

    array-length v1, v1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    :cond_3
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->crc16:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcID:[B

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getCrc16()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->crc16:S

    return v0
.end method

.method public getDevHandler()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->devHandler:I

    return v0
.end method

.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->id:S

    return v0
.end method

.method public getNfcFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcFileName:Ljava/lang/String;

    return-object v0
.end method

.method public getNfcHeadLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    return v0
.end method

.method public getNfcID()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcID:[B

    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public getReserve()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    return-object v0
.end method

.method public getUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->updateTime:J

    return-wide v0
.end method

.method public setCrc16(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->crc16:S

    return-object p0
.end method

.method public setDevHandler(I)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->devHandler:I

    return-object p0
.end method

.method public setId(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->id:S

    return-object p0
.end method

.method public setNfcFileName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcFileName:Ljava/lang/String;

    return-object p0
.end method

.method public setNfcHeadLen(I)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    return-object p0
.end method

.method public setNfcID([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcID:[B

    return-object p0
.end method

.method public setNickname(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nickname:Ljava/lang/String;

    return-object p0
.end method

.method public setReserve([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    return-object p0
.end method

.method public setUpdateTime(J)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->updateTime:J

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NfcMsg{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->id:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reserve="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->reserve:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", devHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->devHandler:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->updateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nfcFileName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcFileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", nickname=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nickname:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", nfcHeadLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcHeadLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc16="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->crc16:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nfcID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->nfcID:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
