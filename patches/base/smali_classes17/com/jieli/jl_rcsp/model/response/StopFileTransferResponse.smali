.class public Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private reason:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;->reason:I

    return-void
.end method


# virtual methods
.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;->reason:I

    return v0
.end method

.method public setReason(I)Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;->reason:I

    return-object p0
.end method
