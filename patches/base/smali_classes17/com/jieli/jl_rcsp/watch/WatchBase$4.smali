.class Lcom/jieli/jl_rcsp/watch/WatchBase$4;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
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

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$4;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-boolean p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$4;->a:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$4;->b:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$4;->a:Z

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setOTAResource(Z)V

    .line 3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$4;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
