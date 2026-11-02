.class public Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field public crc16:S

.field public hash:[B

.field public size:I


# direct methods
.method public constructor <init>([BIS)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->hash:[B

    iput p2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->size:I

    iput-short p3, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->crc16:S

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->hash:[B

    array-length v0, v0

    const/4 v1, 0x6

    add-int/2addr v0, v1

    new-array v0, v0, [B

    iget v2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->size:I

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v2, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-short v2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->crc16:S

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v2

    const/4 v5, 0x2

    invoke-static {v2, v3, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->hash:[B

    array-length v4, v2

    invoke-static {v2, v3, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->size:I

    return v0
.end method

.method public setSize(I)Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->size:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartLargeFileTransferParam{, hash=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->hash:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc16="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;->crc16:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
