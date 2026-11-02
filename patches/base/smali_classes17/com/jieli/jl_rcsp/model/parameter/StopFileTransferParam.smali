.class public Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private reason:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;->reason:I

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;->reason:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;->reason:I

    return v0
.end method

.method public setReason(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;->reason:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StopFileTransferParam{reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;->reason:I

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
