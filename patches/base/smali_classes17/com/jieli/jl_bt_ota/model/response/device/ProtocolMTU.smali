.class public Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private receiveMtu:I

.field private sendMtu:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x212

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->sendMtu:I

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->receiveMtu:I

    return-void
.end method


# virtual methods
.method public getReceiveMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->receiveMtu:I

    return v0
.end method

.method public getSendMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->sendMtu:I

    return v0
.end method

.method public parse([B)I
    .locals 2

    if-eqz p1, :cond_2

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length p1, p1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->setSendMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->setReceiveMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->setSendMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    move-result-object p1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->setReceiveMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    :goto_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public setReceiveMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->receiveMtu:I

    return-object p0
.end method

.method public setSendMtu(I)Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->sendMtu:I

    return-object p0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->sendMtu:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->receiveMtu:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->int2byte2(I)[B

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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProtocolMTU{sendMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->sendMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiveMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->receiveMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
