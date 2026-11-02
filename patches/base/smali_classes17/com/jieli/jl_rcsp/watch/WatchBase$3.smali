.class Lcom/jieli/jl_rcsp/watch/WatchBase$3;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->enableCustomWatchBg(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
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

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$3;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$3;->a:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$3;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$3;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$3;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method
