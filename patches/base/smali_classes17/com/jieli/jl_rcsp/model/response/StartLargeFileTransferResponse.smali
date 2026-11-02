.class public Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private transferMtu:S


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/16 v0, 0x109

    .line 4
    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->transferMtu:S

    return-void
.end method

.method public constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 2
    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->transferMtu:S

    return-void
.end method


# virtual methods
.method public getTransferMtu()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->transferMtu:S

    return v0
.end method

.method public setTransferMtu(S)V
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->transferMtu:S

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartLargeFileTransferResponse{transferMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->transferMtu:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
