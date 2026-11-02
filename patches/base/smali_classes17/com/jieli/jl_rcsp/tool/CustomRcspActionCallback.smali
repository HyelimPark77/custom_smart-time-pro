.class public Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "C:",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "TC;>;"
    }
.end annotation


# instance fields
.field protected final funcName:Ljava/lang/String;

.field protected final mCallback:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
            "TT;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "TT;>;",
            "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
            "TT;TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->funcName:Ljava/lang/String;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mCallback:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    return-void
.end method


# virtual methods
.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TC;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_rcsp/interfaces/IHandleResult;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mCallback:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_5

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v1, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/IHandleResult;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I

    move-result v1

    :goto_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v2

    if-nez v2, :cond_6

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v1, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/IHandleResult;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mParser:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-eqz v1, :cond_4

    if-nez v0, :cond_4

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3001

    invoke-static {v1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mCallback:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_5

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_5
    return-void

    :cond_6
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v2, 0x3004

    invoke-static {v1, v2, p2, v0}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_7
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    const/16 v2, 0x3005

    invoke-static {p2, v2, v1, v0}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->funcName:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Device[%s] has an error: %s"

    invoke-static {v1, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "RcspCommandCallback"

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;->mCallback:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method
