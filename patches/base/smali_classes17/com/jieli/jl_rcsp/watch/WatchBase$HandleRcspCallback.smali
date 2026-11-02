.class public Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HandleRcspCallback"
.end annotation

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
.field protected final callback:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final funcName:Ljava/lang/String;

.field protected final handler:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
            "TT;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;",
            "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
            "TT;TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->funcName:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->handler:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->callback:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

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

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->handler:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/IHandleResult;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I

    move-result v0

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_4

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->handler:Lcom/jieli/jl_rcsp/interfaces/IHandleResult;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/IHandleResult;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->callback:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz p1, :cond_3

    invoke-interface {p1, v2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v1, 0x3004

    invoke-static {v0, v1, p2, v2}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_5
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    const/16 v1, 0x3005

    invoke-static {p2, v1, v0, v2}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onErrCode ---> %s"

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->funcName:Ljava/lang/String;

    const-string v1, "HandleRcspCallback"

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;->callback:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method
