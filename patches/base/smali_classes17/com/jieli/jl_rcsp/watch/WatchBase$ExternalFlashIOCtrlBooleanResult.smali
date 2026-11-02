.class Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;
.super Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExternalFlashIOCtrlBooleanResult"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;
    .locals 0

    .line 2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
