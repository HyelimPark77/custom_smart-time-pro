.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SendDataResponse"
.end annotation


# instance fields
.field private receiveDataLimit:I

.field private result:I

.field private sendDataLimit:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 1

    .line 3
    invoke-static {p4, p5, p6}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getResponseData(III)[B

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;-><init>(III[B)V

    .line 4
    iput p4, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->result:I

    .line 5
    iput p5, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->sendDataLimit:I

    .line 6
    iput p6, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->receiveDataLimit:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;-><init>([B)V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->getData()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->parseResponseData([B)V

    return-void
.end method

.method private static getResponseData(III)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private parseResponseData([B)V
    .locals 2

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->result:I

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->sendDataLimit:I

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->receiveDataLimit:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getReceiveDataLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->receiveDataLimit:I

    return v0
.end method

.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->result:I

    return v0
.end method

.method public getSendDataLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->sendDataLimit:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendDataResponse{result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->result:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sendDataLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->sendDataLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiveDataLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->receiveDataLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
