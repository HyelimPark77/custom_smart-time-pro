.class Lcom/jieli/jl_rcsp/watch/WatchBase$2;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->setCurrentWatchInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult<",
        "Lcom/jieli/jl_fatfs/model/FatFile;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/WatchBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->a:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 2

    .line 2
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->a:Ljava/lang/String;

    invoke-interface {p2, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p2}, Lcom/jieli/jl_fatfs/model/FatFile;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onCurrentWatchInfo(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    :cond_0
    return-object p2
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$2;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method
