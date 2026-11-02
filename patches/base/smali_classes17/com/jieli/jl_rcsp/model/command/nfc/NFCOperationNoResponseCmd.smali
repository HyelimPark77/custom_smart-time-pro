.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$StopSyncParam;,
        Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParam<",
        "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa4

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParam;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
