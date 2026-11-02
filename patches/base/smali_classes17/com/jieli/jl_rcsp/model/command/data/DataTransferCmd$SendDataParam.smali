.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SendDataParam"
.end annotation


# instance fields
.field private crc:S

.field private dataLen:I

.field private receiveDataLimit:I

.field private sendDataLimit:I


# direct methods
.method public constructor <init>(IIISII)V
    .locals 2

    .line 3
    invoke-static {p3, p4, p5, p6}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getParams(ISII)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, p1, p2, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;-><init>(III[B)V

    .line 4
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->dataLen:I

    .line 5
    iput-short p4, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->crc:S

    .line 6
    iput p5, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->sendDataLimit:I

    .line 7
    iput p6, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->receiveDataLimit:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;-><init>([B)V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getParam()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->parseParams([B)V

    return-void
.end method

.method private static getParams(ISII)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private parseParams([B)V
    .locals 2

    if-eqz p1, :cond_1

    array-length v0, p1

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->dataLen:I

    const/4 v0, 0x2

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    int-to-short v1, v1

    iput-short v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->crc:S

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->sendDataLimit:I

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->receiveDataLimit:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->crc:S

    return v0
.end method

.method public getDataLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->dataLen:I

    return v0
.end method

.method public getReceiveDataLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->receiveDataLimit:I

    return v0
.end method

.method public getSendDataLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->sendDataLimit:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendDataParam{dataLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->dataLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->crc:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sendDataLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->sendDataLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiveDataLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->receiveDataLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
