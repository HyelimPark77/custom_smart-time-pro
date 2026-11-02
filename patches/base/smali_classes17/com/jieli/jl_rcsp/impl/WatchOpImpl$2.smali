.class Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemInit(I)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateExtFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;->onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    return-void
.end method
