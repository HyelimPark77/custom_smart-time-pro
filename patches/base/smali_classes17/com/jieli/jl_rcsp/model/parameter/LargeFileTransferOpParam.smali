.class public Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private buffer:S

.field private offset:I

.field private op:B


# direct methods
.method public constructor <init>(BSI)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->buffer:S

    iput p3, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->offset:I

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->op:B

    return-void
.end method


# virtual methods
.method public getBuffer()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->buffer:S

    return v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->offset:I

    return v0
.end method

.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->op:B

    return v0
.end method

.method public getParamData()[B
    .locals 5

    const/4 v0, 0x7

    new-array v0, v0, [B

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->op:B

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->buffer:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->offset:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    const/4 v3, 0x3

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public setBuffer(S)V
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->buffer:S

    return-void
.end method

.method public setOffset(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->offset:I

    return-void
.end method

.method public setOp(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->op:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LargeFileTransferOpParam{buffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->buffer:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->op:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
