.class Lcom/jieli/jl_rcsp/watch/WatchBase$7;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->sendWriteProtectFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/WatchBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Z)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-boolean p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->a:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;
    .locals 2

    .line 2
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "send OK, writeFlag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sendWriteProtectFlag"

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->a:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setSysException(Z)V

    .line 4
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->a:Z

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onExternalFlashWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 5
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$7;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
