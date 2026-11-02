.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;,
        Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandBase<",
        "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V
    .locals 2

    .line 2
    const-class v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x30

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    return-void
.end method
