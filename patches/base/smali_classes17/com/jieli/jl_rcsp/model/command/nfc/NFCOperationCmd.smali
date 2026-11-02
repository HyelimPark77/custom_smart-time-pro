.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileEndParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$NotifyNfcParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa4

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
