.class Lcom/jieli/jl_rcsp/watch/WatchBase$1;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->getCurrentWatchInfo(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$1;->a:Lcom/jieli/jl_rcsp/watch/WatchBase;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 0

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$1;->a:Lcom/jieli/jl_rcsp/watch/WatchBase;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->getFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$1;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method
