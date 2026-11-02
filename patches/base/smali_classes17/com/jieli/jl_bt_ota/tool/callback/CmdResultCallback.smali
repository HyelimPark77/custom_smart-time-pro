.class public Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "C:",
        "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
        ">;>",
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
        "TC;>;"
    }
.end annotation


# instance fields
.field protected final callback:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final funcName:Ljava/lang/String;

.field protected final handle:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult<",
            "TT;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "TT;>;",
            "Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult<",
            "TT;TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->funcName:Ljava/lang/String;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->callback:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->handle:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "IHandleResult is null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getStatus()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->handle:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;->hasResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->handle:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;->handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->callback:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x300a

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(IILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "status = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getStatus()I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printStatusCode(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getStatus()I

    move-result v1

    const/16 v2, 0x3008

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(IILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->funcName:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;->callback:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    invoke-static {v0, v1, v2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method
