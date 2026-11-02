.class public Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private flag:B

.field private path:Ljava/lang/String;

.field private size:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->path:Ljava/lang/String;

    iput p2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->size:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\u6587\u4ef6\u8def\u5f84\u4e0d\u80fd\u4e3a\u7a7a!!!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public enableDataNeedResponse(Z)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;
    .locals 0

    if-eqz p1, :cond_0

    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    return-object p0

    :cond_0
    iget-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    and-int/lit16 p1, p1, 0xfe

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    return-object p0
.end method

.method public getFlag()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    return v0
.end method

.method public getParamData()[B
    .locals 7

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->path:Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x5

    add-int/2addr v1, v2

    new-array v1, v1, [B

    iget-byte v3, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    const/4 v4, 0x0

    aput-byte v3, v1, v4

    iget v3, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->size:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v3

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-static {v3, v4, v1, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->size:I

    return v0
.end method

.method public setFlag(B)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    return-object p0
.end method

.method public setPath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->path:Ljava/lang/String;

    return-object p0
.end method

.method public setSize(I)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->size:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartFileTransferParam{flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->flag:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", path=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->size:I

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
