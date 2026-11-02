.class public Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private crc16:S

.field private data:[B

.field private filePath:Ljava/lang/String;

.field private flag:I

.field private isFinalData:Z

.field private isOpEnd:Z

.field private offset:I

.field private op:I

.field private size:I

.field private watchOp:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isFinalData:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    iput v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    return-void
.end method

.method private getParamSize()I
    .locals 7

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    const/4 v1, 0x4

    const/16 v2, 0x8

    if-eq v0, v2, :cond_a

    const/16 v3, 0xb

    const/4 v4, 0x2

    if-eq v0, v3, :cond_8

    const/4 v3, 0x6

    if-eqz v0, :cond_6

    const/4 v5, 0x1

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_3

    const/4 v3, 0x5

    const/4 v6, 0x3

    if-eq v0, v6, :cond_1

    if-eq v0, v1, :cond_5

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v0, v4

    return v0

    :cond_1
    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_2

    if-eq v0, v6, :cond_2

    if-eq v0, v1, :cond_2

    if-ne v0, v3, :cond_9

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v4, v0

    return v4

    :cond_3
    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v0, v3

    return v0

    :cond_4
    return v3

    :cond_5
    return v2

    :cond_6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->data:[B

    if-eqz v0, :cond_7

    array-length v0, v0

    add-int/2addr v0, v3

    return v0

    :cond_7
    return v3

    :cond_8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v0, v4

    return v0

    :cond_9
    :goto_0
    return v4

    :cond_a
    return v1
.end method


# virtual methods
.method public getCrc16()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->crc16:S

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->data:[B

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->flag:I

    return v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->offset:I

    return v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 9

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getParamSize()I

    move-result v0

    new-array v0, v0, [B

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->flag:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x1

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    const/16 v4, 0x8

    const/4 v5, 0x2

    if-eq v1, v4, :cond_8

    const/16 v4, 0xb

    if-eq v1, v4, :cond_6

    const/4 v4, 0x6

    const/4 v6, 0x4

    if-eqz v1, :cond_5

    if-eq v1, v3, :cond_4

    if-eq v1, v5, :cond_3

    const/4 v7, 0x5

    const/4 v8, 0x3

    if-eq v1, v8, :cond_1

    if-eq v1, v6, :cond_4

    if-eq v1, v7, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    invoke-static {v1, v2, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_1
    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    if-eq v1, v3, :cond_2

    if-eq v1, v5, :cond_2

    if-eq v1, v8, :cond_2

    if-eq v1, v6, :cond_2

    if-ne v1, v7, :cond_7

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    invoke-static {v1, v2, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_3
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    if-nez v1, :cond_7

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->size:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-static {v1, v2, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_4
    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->offset:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-static {v1, v2, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->size:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-static {v1, v2, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_5
    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->offset:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-static {v1, v2, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->data:[B

    if-eqz v1, :cond_7

    array-length v3, v1

    if-lez v3, :cond_7

    array-length v3, v1

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_6
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    invoke-static {v1, v2, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    :goto_0
    return-object v0

    :cond_8
    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->crc16:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-static {v1, v2, v0, v5, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->size:I

    return v0
.end method

.method public getWatchOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    return v0
.end method

.method public isFinalData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isFinalData:Z

    return v0
.end method

.method public isOpEnd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    return v0
.end method

.method public setCrc16(S)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->crc16:S

    return-object p0
.end method

.method public setData([B)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->data:[B

    return-object p0
.end method

.method public setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    return-object p0
.end method

.method public setFinalData(Z)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isFinalData:Z

    return-object p0
.end method

.method public setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 3

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->flag:I

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    if-eqz v2, :cond_3

    if-eq v2, v1, :cond_3

    const/4 v1, 0x2

    if-eq v2, v1, :cond_2

    const/4 v1, 0x3

    if-eq v2, v1, :cond_1

    const/4 p1, 0x5

    if-eq v2, p1, :cond_2

    const/4 p1, 0x6

    if-eq v2, p1, :cond_2

    const/4 p1, 0x7

    if-eq v2, p1, :cond_2

    const/16 p1, 0x9

    if-eq v2, p1, :cond_2

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setWatchOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    return-object p0

    :cond_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOpEnd(Z)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    return-object p0

    :cond_3
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFinalData(Z)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    return-object p0
.end method

.method public setOffset(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->offset:I

    return-object p0
.end method

.method public setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    return-object p0
.end method

.method public setOpEnd(Z)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    return-object p0
.end method

.method public setSize(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->size:I

    return-object p0
.end method

.method public setWatchOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalFlashIOCtrlParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", isFinalData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isFinalData:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isOpEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isOpEnd:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", watchOp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->watchOp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc16="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->crc16:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
