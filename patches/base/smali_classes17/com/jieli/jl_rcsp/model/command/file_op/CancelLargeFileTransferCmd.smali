.class public Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/base/BaseParameter;",
        "Lcom/jieli/jl_rcsp/model/base/CommonResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-class v0, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const/16 v2, 0x1e

    invoke-direct {p0, v2, v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
